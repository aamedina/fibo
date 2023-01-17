(ns net.wikipunk.rdf.fibo-fbc-fct-bci
  "This ontology includes individuals representing the set of international business centers corresponding to those identified in FpML as well as additional municipalities called out in the ISO 10383 Codes for exchanges and market identification (MIC) standard. This set of business centers is current with respect to the FpML published XML data as of Q2 2022. Note that we have deviated from the standard FIBO naming convention of strict use of camel case to add underscores in certain city names for readability purposes."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :dcterms/abstract
   "This ontology includes individuals representing the set of international business centers corresponding to those identified in FpML as well as additional municipalities called out in the ISO 10383 Codes for exchanges and market identification (MIC) standard.\n\t\tThis set of business centers is current with respect to the FpML published XML data as of Q2 2022. Note that we have deviated from the standard FIBO naming convention of strict use of camel case to add underscores in certain city names for readability purposes.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://www.omg.org/spec/LCC/Countries/ISO3166-2-SubdivisionCodes/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/BusinessDates/"
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Locations/"
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-US/"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/BusinessCenters/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-fbc-fct-bc"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCenters/",
    "fibo-fbc-fct-bci"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
    "fibo-fnd-dt-bd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/BusinessDates/",
    "fibo-fnd-plc-loc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Locations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "lcc-3166-1"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
    "lcc-3166-2"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-2-SubdivisionCodes/",
    "lcc-3166-2-ch"
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/",
    "lcc-3166-2-us"
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-US/",
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "lcc-lr" "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfa/prefix "fibo-fbc-fct-bci",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Business Centers Individuals",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/ version of this ontology was modified to add municipalities required for the ISO revision to the MIC codes as of September 2019."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/ version of this ontology was modified to replace Swaziland with Eswatini, which was revised by the LCC 1.1 RTF to reflect the change to the country name per the U.N."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/ version of this ontology was modified to add municipalities required for the ISO revision to the MIC codes as of September 2021."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/ version of this ontology was modified to add municipalities required for the ISO revision to the MIC codes as of November 2020, and add Municipalities for 4 important Swiss financial cities."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/ version of this ontology was modified to address text formatting issues uncovered by hygiene testing."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/ version of this ontology was modified to add municipalities required for the ISO revision to the MIC codes as of March 2022."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/ version of this ontology was modified to add municipalities required for the ISO revision to the MIC codes as of March 2021."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/ version of this ontology was modified to add municipalities required for the ISO revision to the MIC codes as of June 2022."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/ version of this ontology was modified to equate Almaty and Alma-ata, which are the same city (Alma-ata is the old name, no longer in use)."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/ version of this ontology was modified to add municipalities required for the ISO revision to the MIC codes as of June 2020, replace the relations hasTag property with the equivalent lcc-lr version, and replace skos:definition on reference individuals with dct:description."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/ version of this ontology was modified to merge countries with locations in FND."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/ version of this ontology was modified to support revisions of the MIC codes as of December 2018."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/ version of this ontology was modified to add a number of new municipalities that were included in the December 2022 MIC codes."],
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/contributor ["Thematix Partners LLC" "agnos.ai UK Ltd."],
   :sm/copyright ["Copyright (c) 2018-2022 Object Management Group, Inc."
                  "Copyright (c) 2018-2022 EDM Council, Inc."],
   :sm/fileAbbreviation "fibo-fbc-fct-bci",
   :sm/filename "BusinessCentersIndividuals.rdf"})

(def AEAD
  "the FpML business center code for Abu Dhabi, United Arab Emirates"
  {:db/ident :fibo-fbc-fct-bci/AEAD,
   :dcterms/description
   "the FpML business center code for Abu Dhabi, United Arab Emirates",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Abu_Dhabi,
   :lcc-lr/hasTag "AEAD",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Abu_Dhabi,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "AEAD"})

(def AEDU
  "the FpML business center code for Dubai, United Arab Emirates"
  {:db/ident :fibo-fbc-fct-bci/AEDU,
   :dcterms/description
   "the FpML business center code for Dubai, United Arab Emirates",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Dubai,
   :lcc-lr/hasTag "AEDU",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Dubai,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "AEDU"})

(def AMYE
  "the FpML business center code for Yerevan, Armenia"
  {:db/ident :fibo-fbc-fct-bci/AMYE,
   :dcterms/description "the FpML business center code for Yerevan, Armenia",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Yerevan,
   :lcc-lr/hasTag "AMYE",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Yerevan,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "AMYE"})

(def AOLU
  "the FpML business center code for Luanda, Angola"
  {:db/ident :fibo-fbc-fct-bci/AOLU,
   :dcterms/description "the FpML business center code for Luanda, Angola",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Luanda,
   :lcc-lr/hasTag "AOLU",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Luanda,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "AOLU"})

(def ARBA
  "the FpML business center code for Buenos Aires, Argentina"
  {:db/ident :fibo-fbc-fct-bci/ARBA,
   :dcterms/description
   "the FpML business center code for Buenos Aires, Argentina",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Buenos_Aires,
   :lcc-lr/hasTag "ARBA",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Buenos_Aires,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "ARBA"})

(def ATVI
  "the FpML business center code for Vienna, Austria"
  {:db/ident :fibo-fbc-fct-bci/ATVI,
   :dcterms/description "the FpML business center code for Vienna, Austria",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Vienna,
   :lcc-lr/hasTag "ATVI",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Vienna,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "ATVI"})

(def AUAD
  "the FpML business center code for Adelaide, Australia"
  {:db/ident :fibo-fbc-fct-bci/AUAD,
   :dcterms/description "the FpML business center code for Adelaide, Australia",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Adelaide,
   :lcc-lr/hasTag "AUAD",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Adelaide,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "AUAD"})

(def AUBR
  "the FpML business center code for Brisbane, Australia"
  {:db/ident :fibo-fbc-fct-bci/AUBR,
   :dcterms/description "the FpML business center code for Brisbane, Australia",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Brisbane,
   :lcc-lr/hasTag "AUBR",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Brisbane,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "AUBR"})

(def AUCA
  "the FpML business center code for Canberra, Australia"
  {:db/ident :fibo-fbc-fct-bci/AUCA,
   :dcterms/description "the FpML business center code for Canberra, Australia",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Canberra,
   :lcc-lr/hasTag "AUCA",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Canberra,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "AUCA"})

(def AUDA
  "the FpML business center code for Darwin, Australia"
  {:db/ident :fibo-fbc-fct-bci/AUDA,
   :dcterms/description "the FpML business center code for Darwin, Australia",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Darwin,
   :lcc-lr/hasTag "AUDA",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Darwin,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "AUDA"})

(def AUME
  "the FpML business center code for Melbourne, Australia"
  {:db/ident :fibo-fbc-fct-bci/AUME,
   :dcterms/description
   "the FpML business center code for Melbourne, Australia",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Melbourne,
   :lcc-lr/hasTag "AUME",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Melbourne,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "AUME"})

(def AUPE
  "the FpML business center code for Perth, Australia"
  {:db/ident :fibo-fbc-fct-bci/AUPE,
   :dcterms/description "the FpML business center code for Perth, Australia",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Perth,
   :lcc-lr/hasTag "AUPE",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Perth,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "AUPE"})

(def AUSY
  "the FpML business center code for Sydney, Australia"
  {:db/ident :fibo-fbc-fct-bci/AUSY,
   :dcterms/description "the FpML business center code for Sydney, Australia",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Sydney,
   :lcc-lr/hasTag "AUSY",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Sydney,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "AUSY"})

(def Aabenraa
  "Aabenraa"
  {:db/ident :fibo-fbc-fct-bci/Aabenraa,
   :lcc-cr/isPartOf :lcc-3166-1/Denmark,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Aabenraa"})

(def Aalborg
  "Aalborg"
  {:db/ident :fibo-fbc-fct-bci/Aalborg,
   :lcc-cr/isPartOf :lcc-3166-1/Denmark,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Aalborg"})

(def Abha
  "the international business center of Abha"
  {:db/ident :fibo-fbc-fct-bci/Abha,
   :dcterms/description "the international business center of Abha",
   :lcc-cr/isPartOf :lcc-3166-1/SaudiArabia,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Abha"})

(def Abidjan
  "the international business center of Abidjan"
  {:db/ident :fibo-fbc-fct-bci/Abidjan,
   :dcterms/description "the international business center of Abidjan",
   :lcc-cr/isPartOf :lcc-3166-1/CoteDIvoire,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Abidjan"})

(def Abu_Dhabi
  "the international business center of Abu Dhabi"
  {:db/ident :fibo-fbc-fct-bci/Abu_Dhabi,
   :dcterms/description "the international business center of Abu Dhabi",
   :lcc-cr/isPartOf :lcc-3166-1/UnitedArabEmirates,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Abu Dhabi"})

(def Abuja
  "the international business center of Abuja"
  {:db/ident :fibo-fbc-fct-bci/Abuja,
   :dcterms/description "the international business center of Abuja",
   :lcc-cr/isPartOf :lcc-3166-1/Nigeria,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Abuja"})

(def Accra
  "the international business center of Accra"
  {:db/ident :fibo-fbc-fct-bci/Accra,
   :dcterms/description "the international business center of Accra",
   :lcc-cr/isPartOf :lcc-3166-1/Ghana,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Accra"})

(def Addis_Ababa
  "the international business center of Addis Ababa"
  {:db/ident :fibo-fbc-fct-bci/Addis_Ababa,
   :dcterms/description "the international business center of Addis Ababa",
   :lcc-cr/isPartOf :lcc-3166-1/Ethiopia,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Addis Ababa"})

(def Adelaide
  "the international business center of Adelaide"
  {:db/ident :fibo-fbc-fct-bci/Adelaide,
   :dcterms/description "the international business center of Adelaide",
   :lcc-cr/isPartOf :lcc-3166-1/Australia,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Adelaide"})

(def Aden
  "the international business center of Aden"
  {:db/ident :fibo-fbc-fct-bci/Aden,
   :dcterms/description "the international business center of Aden",
   :lcc-cr/isPartOf :lcc-3166-1/Yemen,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Aden"})

(def Ahmedabad
  "Ahmedabad"
  {:db/ident :fibo-fbc-fct-bci/Ahmedabad,
   :lcc-cr/isPartOf :lcc-3166-1/India,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Ahmedabad"})

(def Aichi
  "Aichi"
  {:db/ident :fibo-fbc-fct-bci/Aichi,
   :lcc-cr/isPartOf :lcc-3166-1/Japan,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Aichi"})

(def Alberta
  "Alberta"
  {:db/ident :fibo-fbc-fct-bci/Alberta,
   :lcc-cr/isPartOf :lcc-3166-1/Canada,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Alberta"})

(def Algiers
  "the international business center of Algiers"
  {:db/ident :fibo-fbc-fct-bci/Algiers,
   :dcterms/description "the international business center of Algiers",
   :lcc-cr/isPartOf :lcc-3166-1/Algeria,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Algiers"})

(def Alma-ata
  "Alma-ata"
  {:db/ident :fibo-fbc-fct-bci/Alma-ata,
   :lcc-cr/isPartOf :lcc-3166-1/Kazakhstan,
   :owl/sameAs :fibo-fbc-fct-bci/Almaty,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Alma-ata"})

(def Almaty
  "the international business center of Almaty"
  {:db/ident :fibo-fbc-fct-bci/Almaty,
   :dcterms/description "the international business center of Almaty",
   :lcc-cr/isPartOf :lcc-3166-1/Kazakhstan,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Almaty"})

(def Amman
  "the international business center of Amman"
  {:db/ident :fibo-fbc-fct-bci/Amman,
   :dcterms/description "the international business center of Amman",
   :lcc-cr/isPartOf :lcc-3166-1/Jordan,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Amman"})

(def Amsterdam
  "the international business center of Amsterdam"
  {:db/ident :fibo-fbc-fct-bci/Amsterdam,
   :dcterms/description "the international business center of Amsterdam",
   :lcc-cr/isPartOf :lcc-3166-1/Netherlands,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Amsterdam"})

(def Ankara
  "the international business center of Ankara"
  {:db/ident :fibo-fbc-fct-bci/Ankara,
   :dcterms/description "the international business center of Ankara",
   :lcc-cr/isPartOf :lcc-3166-1/Turkey,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Ankara"})

(def Antananarivo
  "Antananarivo"
  {:db/ident :fibo-fbc-fct-bci/Antananarivo,
   :lcc-cr/isPartOf :lcc-3166-1/Madagascar,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Antananarivo"})

(def Antwerpen
  "Antwerpen"
  {:db/ident :fibo-fbc-fct-bci/Antwerpen,
   :lcc-cr/isPartOf :lcc-3166-1/Belgium,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Antwerpen"})

(def Astana
  "Astana"
  {:db/ident :fibo-fbc-fct-bci/Astana,
   :lcc-cr/isPartOf :lcc-3166-1/Kazakhstan,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Astana"})

(def Asti
  "Asti"
  {:db/ident :fibo-fbc-fct-bci/Asti,
   :lcc-cr/isPartOf :lcc-3166-1/Italy,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Asti"})

(def Asuncion
  "Asuncion"
  {:db/ident :fibo-fbc-fct-bci/Asuncion,
   :lcc-cr/isPartOf :lcc-3166-1/Paraguay,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Asuncion"})

(def Athens
  "the international business center of Athens"
  {:db/ident :fibo-fbc-fct-bci/Athens,
   :dcterms/description "the international business center of Athens",
   :lcc-cr/isPartOf :lcc-3166-1/Greece,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Athens"})

(def Atlanta
  "Atlanta"
  {:db/ident :fibo-fbc-fct-bci/Atlanta,
   :lcc-cr/isPartOf [:lcc-3166-2-us/Georgia :lcc-3166-1/UnitedStatesOfAmerica],
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Atlanta"})

(def Auckland
  "the international business center of Auckland"
  {:db/ident :fibo-fbc-fct-bci/Auckland,
   :dcterms/description "the international business center of Auckland",
   :lcc-cr/isPartOf :lcc-3166-1/NewZealand,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Auckland"})

(def Aylesbury
  "Aylesbury"
  {:db/ident :fibo-fbc-fct-bci/Aylesbury,
   :lcc-cr/isPartOf :lcc-3166-1/UnitedKingdomOfGreatBritainAndNorthernIreland,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Aylesbury"})

(def BBBR
  "the FpML business center code for Bridgetown, Barbados"
  {:db/ident :fibo-fbc-fct-bci/BBBR,
   :dcterms/description
   "the FpML business center code for Bridgetown, Barbados",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Bridgetown,
   :lcc-lr/hasTag "BBBR",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Bridgetown,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "BBBR"})

(def BDDH
  "the FpML business center code for Dhaka, Bangladesh"
  {:db/ident :fibo-fbc-fct-bci/BDDH,
   :dcterms/description "the FpML business center code for Dhaka, Bangladesh",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Dhaka,
   :lcc-lr/hasTag "BDDH",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Dhaka,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "BDDH"})

(def BEBR
  "the FpML business center code for Brussels, Belgium"
  {:db/ident :fibo-fbc-fct-bci/BEBR,
   :dcterms/description "the FpML business center code for Brussels, Belgium",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Brussels,
   :lcc-lr/hasTag "BEBR",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Brussels,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "BEBR"})

(def BGSO
  "the FpML business center code for Sofia, Bulgaria"
  {:db/ident :fibo-fbc-fct-bci/BGSO,
   :dcterms/description "the FpML business center code for Sofia, Bulgaria",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Sofia,
   :lcc-lr/hasTag "BGSO",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Sofia,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "BGSO"})

(def BHMA
  "the FpML business center code for Manama, Bahrain"
  {:db/ident :fibo-fbc-fct-bci/BHMA,
   :dcterms/description "the FpML business center code for Manama, Bahrain",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Manama,
   :lcc-lr/hasTag "BHMA",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Manama,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "BHMA"})

(def BMHA
  "the FpML business center code for Hamilton, Bermuda"
  {:db/ident :fibo-fbc-fct-bci/BMHA,
   :dcterms/description "the FpML business center code for Hamilton, Bermuda",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Hamilton,
   :lcc-lr/hasTag "BMHA",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Hamilton,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "BMHA"})

(def BNBS
  "the FpML business center code for Bandar Seri Begawan, Brunei"
  {:db/ident :fibo-fbc-fct-bci/BNBS,
   :dcterms/description
   "the FpML business center code for Bandar Seri Begawan, Brunei",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Bandar_Seri_Begawan,
   :lcc-lr/hasTag "BNBS",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Bandar_Seri_Begawan,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "BNBS"})

(def BOLP
  "the FpML business center code for La Paz, Bolivia"
  {:db/ident :fibo-fbc-fct-bci/BOLP,
   :dcterms/description "the FpML business center code for La Paz, Bolivia",
   :lcc-lr/denotes :fibo-fbc-fct-bci/La_Paz,
   :lcc-lr/hasTag "BOLP",
   :lcc-lr/identifies :fibo-fbc-fct-bci/La_Paz,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "BOLP"})

(def BRBD
  "the FpML business center code for Brazil Business Day. This means a business day in any of Sao Paulo, Rio de Janeiro or Brasilia not otherwise declared as a financial market holiday by the Bolsa de Mercadorias & Futuros (BM&F)"
  {:db/ident :fibo-fbc-fct-bci/BRBD,
   :dcterms/description
   "the FpML business center code for Brazil Business Day. This means a business day in any of Sao Paulo, Rio de Janeiro or Brasilia not otherwise declared as a financial market holiday by the Bolsa de Mercadorias & Futuros (BM&F)",
   :lcc-lr/denotes :fibo-fbc-fct-bci/BrazilBusinessDay,
   :lcc-lr/hasTag "BRBD",
   :lcc-lr/identifies :fibo-fbc-fct-bci/BrazilBusinessDay,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessDayAdjustmentCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "BRBD"})

(def BRBR
  "the FpML business center code for Brasilia, Brazil"
  {:db/ident :fibo-fbc-fct-bci/BRBR,
   :dcterms/description "the FpML business center code for Brasilia, Brazil",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Brasilia,
   :lcc-lr/hasTag "BRBR",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Brasilia,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "BRBR"})

(def BRRJ
  "the FpML business center code for Rio de Janeiro, Brazil"
  {:db/ident :fibo-fbc-fct-bci/BRRJ,
   :dcterms/description
   "the FpML business center code for Rio de Janeiro, Brazil",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Rio_de_Janeiro,
   :lcc-lr/hasTag "BRRJ",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Rio_de_Janeiro,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "BRRJ"})

(def BRSP
  "the FpML business center code for Sao Paulo, Brazil"
  {:db/ident :fibo-fbc-fct-bci/BRSP,
   :dcterms/description "the FpML business center code for Sao Paulo, Brazil",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Sao_Paulo,
   :lcc-lr/hasTag "BRSP",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Sao_Paulo,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "BRSP"})

(def BSNA
  "the FpML business center code for Nassau, Bahamas"
  {:db/ident :fibo-fbc-fct-bci/BSNA,
   :dcterms/description "the FpML business center code for Nassau, Bahamas",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Nassau,
   :lcc-lr/hasTag "BSNA",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Nassau,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "BSNA"})

(def BWGA
  "the FpML business center code for Gaborone, Botswana"
  {:db/ident :fibo-fbc-fct-bci/BWGA,
   :dcterms/description "the FpML business center code for Gaborone, Botswana",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Gaborone,
   :lcc-lr/hasTag "BWGA",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Gaborone,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "BWGA"})

(def BYMI
  "the FpML business center code for Minsk, Belarus"
  {:db/ident :fibo-fbc-fct-bci/BYMI,
   :dcterms/description "the FpML business center code for Minsk, Belarus",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Minsk,
   :lcc-lr/hasTag "BYMI",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Minsk,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "BYMI"})

(def Baghdad
  "Baghdad"
  {:db/ident :fibo-fbc-fct-bci/Baghdad,
   :lcc-cr/isPartOf :lcc-3166-1/Iraq,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Baghdad"})

(def Baku
  "Baku"
  {:db/ident :fibo-fbc-fct-bci/Baku,
   :lcc-cr/isPartOf :lcc-3166-1/Azerbaijan,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Baku"})

(def Bandar_Seri_Begawan
  "the international business center of Bandar Seri Begawan"
  {:db/ident :fibo-fbc-fct-bci/Bandar_Seri_Begawan,
   :dcterms/description
   "the international business center of Bandar Seri Begawan",
   :lcc-cr/isPartOf :lcc-3166-1/BruneiDarussalam,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Bandar Seri Begawan"})

(def Bangalore
  "the international business center of Bangalore"
  {:db/ident :fibo-fbc-fct-bci/Bangalore,
   :dcterms/description "the international business center of Bangalore",
   :lcc-cr/isPartOf :lcc-3166-1/India,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Bangalore"})

(def Bangkok
  "the international business center of Bangkok"
  {:db/ident :fibo-fbc-fct-bci/Bangkok,
   :dcterms/description "the international business center of Bangkok",
   :lcc-cr/isPartOf :lcc-3166-1/Thailand,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Bangkok"})

(def Banja_Luka
  "Banja Luka"
  {:db/ident :fibo-fbc-fct-bci/Banja_Luka,
   :lcc-cr/isPartOf :lcc-3166-1/BosniaAndHerzegovina,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Banja Luka"})

(def Barcelona
  "the international business center of Barcelona"
  {:db/ident :fibo-fbc-fct-bci/Barcelona,
   :dcterms/description "the international business center of Barcelona",
   :lcc-cr/isPartOf :lcc-3166-1/Spain,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Barcelona"})

(def Basel
  "the international business center of Basel"
  {:db/ident :fibo-fbc-fct-bci/Basel,
   :dcterms/description "the international business center of Basel",
   :lcc-cr/isPartOf :lcc-3166-1/Switzerland,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Basel"})

(def Basseterre
  "Basseterre"
  {:db/ident :fibo-fbc-fct-bci/Basseterre,
   :lcc-cr/isPartOf :lcc-3166-1/SaintKittsAndNevis,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Basseterre"})

(def Bedminster
  "Bedminster"
  {:db/ident :fibo-fbc-fct-bci/Bedminster,
   :lcc-cr/isPartOf [:lcc-3166-2-us/NewJersey
                     :lcc-3166-1/UnitedStatesOfAmerica],
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Bedminster"})

(def Beijing
  "the international business center of Beijing"
  {:db/ident :fibo-fbc-fct-bci/Beijing,
   :dcterms/description "the international business center of Beijing",
   :lcc-cr/isPartOf :lcc-3166-1/China,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Beijing"})

(def Beirut
  "the international business center of Beirut"
  {:db/ident :fibo-fbc-fct-bci/Beirut,
   :dcterms/description "the international business center of Beirut",
   :lcc-cr/isPartOf :lcc-3166-1/Lebanon,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Beirut"})

(def Belgrade
  "the international business center of Belgrade"
  {:db/ident :fibo-fbc-fct-bci/Belgrade,
   :dcterms/description "the international business center of Belgrade",
   :lcc-cr/isPartOf :lcc-3166-1/Serbia,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Belgrade"})

(def Bergamo
  "Bergamo"
  {:db/ident :fibo-fbc-fct-bci/Bergamo,
   :lcc-cr/isPartOf :lcc-3166-1/Italy,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Bergamo"})

(def Bergen
  "Bergen"
  {:db/ident :fibo-fbc-fct-bci/Bergen,
   :lcc-cr/isPartOf :lcc-3166-1/Norway,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Bergen"})

(def Berlin
  "Berlin"
  {:db/ident :fibo-fbc-fct-bci/Berlin,
   :lcc-cr/isPartOf :lcc-3166-1/Germany,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Berlin"})

(def Bermuda
  "Bermuda"
  {:db/ident :fibo-fbc-fct-bci/Bermuda,
   :lcc-cr/isPartOf :lcc-3166-1/Bermuda,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Bermuda"})

(def Bern
  "Bern"
  {:db/ident :fibo-fbc-fct-bci/Bern,
   :lcc-cr/isPartOf :lcc-3166-1/Switzerland,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Bern"})

(def Biella
  "Biella"
  {:db/ident :fibo-fbc-fct-bci/Biella,
   :lcc-cr/isPartOf :lcc-3166-1/Italy,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Biella"})

(def Bilbao
  "Bilbao"
  {:db/ident :fibo-fbc-fct-bci/Bilbao,
   :lcc-cr/isPartOf :lcc-3166-1/Spain,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Bilbao"})

(def Bishkek
  "Bishkek"
  {:db/ident :fibo-fbc-fct-bci/Bishkek,
   :lcc-cr/isPartOf :lcc-3166-1/Kyrgyzstan,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Bishkek"})

(def Blantyre
  "Blantyre"
  {:db/ident :fibo-fbc-fct-bci/Blantyre,
   :lcc-cr/isPartOf :lcc-3166-1/Malawi,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Blantyre"})

(def BocaRaton
  "Boca Raton"
  {:db/ident :fibo-fbc-fct-bci/BocaRaton,
   :lcc-cr/isPartOf [:lcc-3166-2-us/Florida :lcc-3166-1/UnitedStatesOfAmerica],
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Boca Raton"})

(def Bogota
  "the international business center of Bogota"
  {:db/ident :fibo-fbc-fct-bci/Bogota,
   :dcterms/description "the international business center of Bogota",
   :lcc-cr/isPartOf :lcc-3166-1/Colombia,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Bogota"})

(def Bologna
  "Bologna"
  {:db/ident :fibo-fbc-fct-bci/Bologna,
   :lcc-cr/isPartOf :lcc-3166-1/Italy,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Bologna"})

(def Boston
  "the international business center of Boston"
  {:db/ident :fibo-fbc-fct-bci/Boston,
   :dcterms/description "the international business center of Boston",
   :lcc-cr/isPartOf [:lcc-3166-2-us/Massachusetts
                     :lcc-3166-1/UnitedStatesOfAmerica],
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Boston"})

(def Bradford
  "Bradford"
  {:db/ident :fibo-fbc-fct-bci/Bradford,
   :lcc-cr/isPartOf :lcc-3166-1/UnitedKingdomOfGreatBritainAndNorthernIreland,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Bradford"})

(def Brasilia
  "the international business center of Brasilia"
  {:db/ident :fibo-fbc-fct-bci/Brasilia,
   :dcterms/description "the international business center of Brasilia",
   :lcc-cr/isPartOf :lcc-3166-1/Brazil,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Brasilia"})

(def Bratislava
  "the international business center of Bratislava"
  {:db/ident :fibo-fbc-fct-bci/Bratislava,
   :dcterms/description "the international business center of Bratislava",
   :lcc-cr/isPartOf :lcc-3166-1/Slovakia,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Bratislava"})

(def BrazilBusinessDay
  "the business day adjustment convention for the Brazil Business Day. This means a business day in any of Sao Paulo, Rio de Janeiro or Brasilia not otherwise declared as a financial market holiday by the Bolsa de Mercadorias & Futuros (BM&F)"
  {:db/ident :fibo-fbc-fct-bci/BrazilBusinessDay,
   :dcterms/description
   "the business day adjustment convention for the Brazil Business Day. This means a business day in any of Sao Paulo, Rio de Janeiro or Brasilia not otherwise declared as a financial market holiday by the Bolsa de Mercadorias & Futuros (BM&F)",
   :fibo-fnd-plc-loc/hasBusinessCenter [:fibo-fbc-fct-bci/Sao_Paulo
                                        :fibo-fbc-fct-bci/Rio_de_Janeiro
                                        :fibo-fbc-fct-bci/Brasilia],
   :rdf/type [:fibo-fnd-dt-bd/BusinessDayAdjustment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Brazil Business Day"})

(def Bremen
  "Bremen"
  {:db/ident :fibo-fbc-fct-bci/Bremen,
   :lcc-cr/isPartOf :lcc-3166-1/Germany,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Bremen"})

(def Bridgetown
  "the international business center of Bridgetown"
  {:db/ident :fibo-fbc-fct-bci/Bridgetown,
   :dcterms/description "the international business center of Bridgetown",
   :lcc-cr/isPartOf :lcc-3166-1/Barbados,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Bridgetown"})

(def Brisbane
  "the international business center of Brisbane"
  {:db/ident :fibo-fbc-fct-bci/Brisbane,
   :dcterms/description "the international business center of Brisbane",
   :lcc-cr/isPartOf :lcc-3166-1/Australia,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Brisbane"})

(def Brussels
  "the international business center of Brussels"
  {:db/ident :fibo-fbc-fct-bci/Brussels,
   :dcterms/description "the international business center of Brussels",
   :lcc-cr/isPartOf :lcc-3166-1/Belgium,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Brussels"})

(def BryanstonSandton
  "Bryanston, Sandton"
  {:db/ident :fibo-fbc-fct-bci/BryanstonSandton,
   :lcc-cr/isPartOf :lcc-3166-1/SouthAfrica,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Bryanston, Sandton"})

(def Bucarest
  "the international business center of Bucarest"
  {:db/ident :fibo-fbc-fct-bci/Bucarest,
   :dcterms/description "the international business center of Bucarest",
   :lcc-cr/isPartOf :lcc-3166-1/Romania,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Bucarest"})

(def Bucharest
  "Bucharest"
  {:db/ident :fibo-fbc-fct-bci/Bucharest,
   :lcc-cr/isPartOf :lcc-3166-1/Romania,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Bucharest"})

(def Budaors
  "Budaors"
  {:db/ident :fibo-fbc-fct-bci/Budaors,
   :lcc-cr/isPartOf :lcc-3166-1/Hungary,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Budaors"})

(def Budapest
  "the international business center of Budapest"
  {:db/ident :fibo-fbc-fct-bci/Budapest,
   :dcterms/description "the international business center of Budapest",
   :lcc-cr/isPartOf :lcc-3166-1/Hungary,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Budapest"})

(def Buenos_Aires
  "the international business center of Buenos Aires"
  {:db/ident :fibo-fbc-fct-bci/Buenos_Aires,
   :dcterms/description "the international business center of Buenos Aires",
   :lcc-cr/isPartOf :lcc-3166-1/Argentina,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Buenos Aires"})

(def CACL
  "the FpML business center code for Calgary, Canada"
  {:db/ident :fibo-fbc-fct-bci/CACL,
   :dcterms/description "the FpML business center code for Calgary, Canada",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Calgary,
   :lcc-lr/hasTag "CACL",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Calgary,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "CACL"})

(def CAMO
  "the FpML business center code for Montreal, Canada"
  {:db/ident :fibo-fbc-fct-bci/CAMO,
   :dcterms/description "the FpML business center code for Montreal, Canada",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Montreal,
   :lcc-lr/hasTag "CAMO",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Montreal,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "CAMO"})

(def CAOT
  "the FpML business center code for Ottawa, Canada"
  {:db/ident :fibo-fbc-fct-bci/CAOT,
   :dcterms/description "the FpML business center code for Ottawa, Canada",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Ottawa,
   :lcc-lr/hasTag "CAOT",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Ottawa,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "CAOT"})

(def CATO
  "the FpML business center code for Toronto, Canada"
  {:db/ident :fibo-fbc-fct-bci/CATO,
   :dcterms/description "the FpML business center code for Toronto, Canada",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Toronto,
   :lcc-lr/hasTag "CATO",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Toronto,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "CATO"})

(def CAVA
  "the FpML business center code for Vancouver, Canada"
  {:db/ident :fibo-fbc-fct-bci/CAVA,
   :dcterms/description "the FpML business center code for Vancouver, Canada",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Vancouver,
   :lcc-lr/hasTag "CAVA",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Vancouver,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "CAVA"})

(def CAWI
  "the FpML business center code for Winnipeg, Canada"
  {:db/ident :fibo-fbc-fct-bci/CAWI,
   :dcterms/description "the FpML business center code for Winnipeg, Canada",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Winnipeg,
   :lcc-lr/hasTag "CAWI",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Winnipeg,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "CAWI"})

(def CHBA
  "the FpML business center code for Basel, Switzerland"
  {:db/ident :fibo-fbc-fct-bci/CHBA,
   :dcterms/description "the FpML business center code for Basel, Switzerland",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Basel,
   :lcc-lr/hasTag "CHBA",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Basel,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "CHBA"})

(def CHGE
  "the FpML business center code for Geneva, Switzerland"
  {:db/ident :fibo-fbc-fct-bci/CHGE,
   :dcterms/description "the FpML business center code for Geneva, Switzerland",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Geneva,
   :lcc-lr/hasTag "CHGE",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Geneva,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "CHGE"})

(def CHZU
  "the FpML business center code for Zurich, Switzerland"
  {:db/ident :fibo-fbc-fct-bci/CHZU,
   :dcterms/description "the FpML business center code for Zurich, Switzerland",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Zurich,
   :lcc-lr/hasTag "CHZU",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Zurich,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "CHZU"})

(def CIAB
  "the FpML business center code for Abidjan, Cote d'Ivoire"
  {:db/ident :fibo-fbc-fct-bci/CIAB,
   :dcterms/description
   "the FpML business center code for Abidjan, Cote d'Ivoire",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Abidjan,
   :lcc-lr/hasTag "CIAB",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Abidjan,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "CIAB"})

(def CLSA
  "the FpML business center code for Santiago, Chile"
  {:db/ident :fibo-fbc-fct-bci/CLSA,
   :dcterms/description "the FpML business center code for Santiago, Chile",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Santiago,
   :lcc-lr/hasTag "CLSA",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Santiago,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "CLSA"})

(def CNBE
  "the FpML business center code for Beijing, China"
  {:db/ident :fibo-fbc-fct-bci/CNBE,
   :dcterms/description "the FpML business center code for Beijing, China",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Beijing,
   :lcc-lr/hasTag "CNBE",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Beijing,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "CNBE"})

(def CNSH
  "the FpML business center code for Shanghai, China"
  {:db/ident :fibo-fbc-fct-bci/CNSH,
   :dcterms/description "the FpML business center code for Shanghai, China",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Shanghai,
   :lcc-lr/hasTag "CNSH",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Shanghai,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "CNSH"})

(def COBO
  "the FpML business center code for Bogota, Colombia"
  {:db/ident :fibo-fbc-fct-bci/COBO,
   :dcterms/description "the FpML business center code for Bogota, Colombia",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Bogota,
   :lcc-lr/hasTag "COBO",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Bogota,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "COBO"})

(def CRSJ
  "the FpML business center code for San Jose, Costa Rica"
  {:db/ident :fibo-fbc-fct-bci/CRSJ,
   :dcterms/description
   "the FpML business center code for San Jose, Costa Rica",
   :lcc-lr/denotes :fibo-fbc-fct-bci/San_Jose,
   :lcc-lr/hasTag "CRSJ",
   :lcc-lr/identifies :fibo-fbc-fct-bci/San_Jose,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "CRSJ"})

(def CYNI
  "the FpML business center code for Nicosia, Cyprus"
  {:db/ident :fibo-fbc-fct-bci/CYNI,
   :dcterms/description "the FpML business center code for Nicosia, Cyprus",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Nicosia,
   :lcc-lr/hasTag "CYNI",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Nicosia,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "CYNI"})

(def CZPR
  "the FpML business center code for Prague, Czech Republic"
  {:db/ident :fibo-fbc-fct-bci/CZPR,
   :dcterms/description
   "the FpML business center code for Prague, Czech Republic",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Prague,
   :lcc-lr/hasTag "CZPR",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Prague,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "CZPR"})

(def Cairo
  "the international business center of Cairo"
  {:db/ident :fibo-fbc-fct-bci/Cairo,
   :dcterms/description "the international business center of Cairo",
   :lcc-cr/isPartOf :lcc-3166-1/Egypt,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Cairo"})

(def Calcutta
  "Calcutta"
  {:db/ident :fibo-fbc-fct-bci/Calcutta,
   :lcc-cr/isPartOf :lcc-3166-1/India,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Calcutta"})

(def Calgary
  "the international business center of Calgary"
  {:db/ident :fibo-fbc-fct-bci/Calgary,
   :dcterms/description "the international business center of Calgary",
   :lcc-cr/isPartOf :lcc-3166-1/Canada,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Calgary"})

(def Canberra
  "the international business center of Canberra"
  {:db/ident :fibo-fbc-fct-bci/Canberra,
   :dcterms/description "the international business center of Canberra",
   :lcc-cr/isPartOf :lcc-3166-1/Australia,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Canberra"})

(def Caracas
  "the international business center of Caracas"
  {:db/ident :fibo-fbc-fct-bci/Caracas,
   :dcterms/description "the international business center of Caracas",
   :lcc-cr/isPartOf :lcc-3166-1/Venezuela,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Caracas"})

(def Casablanca
  "the international business center of Casablanca"
  {:db/ident :fibo-fbc-fct-bci/Casablanca,
   :dcterms/description "the international business center of Casablanca",
   :lcc-cr/isPartOf :lcc-3166-1/Morocco,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Casablanca"})

(def Charlotte
  "the international business center of Charlotte"
  {:db/ident :fibo-fbc-fct-bci/Charlotte,
   :dcterms/description "the international business center of Charlotte",
   :lcc-cr/isPartOf [:lcc-3166-2-us/NorthCarolina
                     :lcc-3166-1/UnitedStatesOfAmerica],
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Charlotte"})

(def Chatham
  "Chatham"
  {:db/ident :fibo-fbc-fct-bci/Chatham,
   :lcc-cr/isPartOf [:lcc-3166-2-us/Massachusetts
                     :lcc-3166-1/UnitedStatesOfAmerica],
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Chatham"})

(def Chennai
  "the international business center of Chennai"
  {:db/ident :fibo-fbc-fct-bci/Chennai,
   :dcterms/description "the international business center of Chennai",
   :lcc-cr/isPartOf :lcc-3166-1/India,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Chennai"})

(def Chicago
  "the international business center of Chicago"
  {:db/ident :fibo-fbc-fct-bci/Chicago,
   :dcterms/description "the international business center of Chicago",
   :lcc-cr/isPartOf [:lcc-3166-2-us/Illinois :lcc-3166-1/UnitedStatesOfAmerica],
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Chicago"})

(def Chisinau
  "Chisinau"
  {:db/ident :fibo-fbc-fct-bci/Chisinau,
   :lcc-cr/isPartOf :lcc-3166-1/Moldova,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Chisinau"})

(def Chittagong
  "Chittagong"
  {:db/ident :fibo-fbc-fct-bci/Chittagong,
   :lcc-cr/isPartOf :lcc-3166-1/Bangladesh,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Chittagong"})

(def Chiyoda-ku
  "Chiyoda-ku"
  {:db/ident :fibo-fbc-fct-bci/Chiyoda-ku,
   :lcc-cr/isPartOf :lcc-3166-1/Japan,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Chiyoda-ku"})

(def ClujNapoca
  "Cluj Napoca"
  {:db/ident :fibo-fbc-fct-bci/ClujNapoca,
   :lcc-cr/isPartOf :lcc-3166-1/Romania,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Cluj Napoca"})

(def Cologne
  "the international business center of Cologne"
  {:db/ident :fibo-fbc-fct-bci/Cologne,
   :dcterms/description "the international business center of Cologne",
   :lcc-cr/isPartOf :lcc-3166-1/Germany,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Cologne"})

(def Colombo
  "the international business center of Colombo"
  {:db/ident :fibo-fbc-fct-bci/Colombo,
   :dcterms/description "the international business center of Colombo",
   :lcc-cr/isPartOf :lcc-3166-1/SriLanka,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Colombo"})

(def Copenhagen
  "the international business center of Copenhagen"
  {:db/ident :fibo-fbc-fct-bci/Copenhagen,
   :dcterms/description "the international business center of Copenhagen",
   :lcc-cr/isPartOf :lcc-3166-1/Denmark,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Copenhagen"})

(def Cordoba
  "Cordoba"
  {:db/ident :fibo-fbc-fct-bci/Cordoba,
   :lcc-cr/isPartOf :lcc-3166-1/Argentina,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Cordoba"})

(def Corrientes
  "Corrientes"
  {:db/ident :fibo-fbc-fct-bci/Corrientes,
   :lcc-cr/isPartOf :lcc-3166-1/Argentina,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Corrientes"})

(def Curitiba
  "Curitiba"
  {:db/ident :fibo-fbc-fct-bci/Curitiba,
   :lcc-cr/isPartOf :lcc-3166-1/Brazil,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Curitiba"})

(def DECO
  "the FpML business center code for Cologne, Germany"
  {:db/ident :fibo-fbc-fct-bci/DECO,
   :dcterms/description "the FpML business center code for Cologne, Germany",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Cologne,
   :lcc-lr/hasTag "DECO",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Cologne,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "DECO"})

(def DEDU
  "the FpML business center code for Dusseldorf, Germany"
  {:db/ident :fibo-fbc-fct-bci/DEDU,
   :dcterms/description "the FpML business center code for Dusseldorf, Germany",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Dusseldorf,
   :lcc-lr/hasTag "DEDU",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Dusseldorf,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "DEDU"})

(def DEFR
  "the FpML business center code for Frankfurt, Germany"
  {:db/ident :fibo-fbc-fct-bci/DEFR,
   :dcterms/description "the FpML business center code for Frankfurt, Germany",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Frankfurt,
   :lcc-lr/hasTag "DEFR",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Frankfurt,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "DEFR"})

(def DELE
  "the FpML business center code for Leipzig, Germany"
  {:db/ident :fibo-fbc-fct-bci/DELE,
   :dcterms/description "the FpML business center code for Leipzig, Germany",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Leipzig,
   :lcc-lr/hasTag "DELE",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Leipzig,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "DELE"})

(def DEMA
  "the FpML business center code for Mainz, Germany"
  {:db/ident :fibo-fbc-fct-bci/DEMA,
   :dcterms/description "the FpML business center code for Mainz, Germany",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Mainz,
   :lcc-lr/hasTag "DEMA",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Mainz,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "DEMA"})

(def DEMU
  "the FpML business center code for Munich, Germany"
  {:db/ident :fibo-fbc-fct-bci/DEMU,
   :dcterms/description "the FpML business center code for Munich, Germany",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Munich,
   :lcc-lr/hasTag "DEMU",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Munich,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "DEMU"})

(def DEST
  "the FpML business center code for Stuttgart, Germany"
  {:db/ident :fibo-fbc-fct-bci/DEST,
   :dcterms/description "the FpML business center code for Stuttgart, Germany",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Stuttgart,
   :lcc-lr/hasTag "DEST",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Stuttgart,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "DEST"})

(def DKCO
  "the FpML business center code for Copenhagen, Denmark"
  {:db/ident :fibo-fbc-fct-bci/DKCO,
   :dcterms/description "the FpML business center code for Copenhagen, Denmark",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Copenhagen,
   :lcc-lr/hasTag "DKCO",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Copenhagen,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "DKCO"})

(def DOSD
  "the FpML business center code for Santo Domingo, Dominican Republic"
  {:db/ident :fibo-fbc-fct-bci/DOSD,
   :dcterms/description
   "the FpML business center code for Santo Domingo, Dominican Republic",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Santo_Domingo,
   :lcc-lr/hasTag "DOSD",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Santo_Domingo,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "DOSD"})

(def DZAL
  "the FpML business center code for Algiers, Algeria"
  {:db/ident :fibo-fbc-fct-bci/DZAL,
   :dcterms/description "the FpML business center code for Algiers, Algeria",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Algiers,
   :lcc-lr/hasTag "DZAL",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Algiers,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "DZAL"})

(def Dakar
  "the international business center of Dakar"
  {:db/ident :fibo-fbc-fct-bci/Dakar,
   :dcterms/description "the international business center of Dakar",
   :lcc-cr/isPartOf :lcc-3166-1/Senegal,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Dakar"})

(def Dalian
  "Dalian"
  {:db/ident :fibo-fbc-fct-bci/Dalian,
   :lcc-cr/isPartOf :lcc-3166-1/China,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Dalian"})

(def Damascus
  "the municipality of Damascus"
  {:db/ident :fibo-fbc-fct-bci/Damascus,
   :dcterms/description "the municipality of Damascus",
   :lcc-cr/isPartOf :lcc-3166-1/SyrianArabRepublic,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Damascus"})

(def Dar_es_Salaam
  "the international business center of Dar es Salaam"
  {:db/ident :fibo-fbc-fct-bci/Dar_es_Salaam,
   :dcterms/description "the international business center of Dar es Salaam",
   :lcc-cr/isPartOf :lcc-3166-1/Tanzania,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Dar es Salaam"})

(def Darwin
  "the international business center of Darwin"
  {:db/ident :fibo-fbc-fct-bci/Darwin,
   :dcterms/description "the international business center of Darwin",
   :lcc-cr/isPartOf :lcc-3166-1/Australia,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Darwin"})

(def Davos_Platz
  "Davos Platz"
  {:db/ident :fibo-fbc-fct-bci/Davos_Platz,
   :lcc-cr/isPartOf :lcc-3166-1/Switzerland,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Davos Platz"})

(def Denver
  "the international business center of Denver"
  {:db/ident :fibo-fbc-fct-bci/Denver,
   :dcterms/description "the international business center of Denver",
   :lcc-cr/isPartOf [:lcc-3166-2-us/Colorado :lcc-3166-1/UnitedStatesOfAmerica],
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Denver"})

(def Detroit
  "the international business center of Detroit"
  {:db/ident :fibo-fbc-fct-bci/Detroit,
   :dcterms/description "the international business center of Detroit",
   :lcc-cr/isPartOf [:lcc-3166-2-us/Michigan :lcc-3166-1/UnitedStatesOfAmerica],
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Detroit"})

(def Dhaka
  "the international business center of Dhaka"
  {:db/ident :fibo-fbc-fct-bci/Dhaka,
   :dcterms/description "the international business center of Dhaka",
   :lcc-cr/isPartOf :lcc-3166-1/Bangladesh,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Dhaka"})

(def Dnipropetrovsk
  "Dnipropetrovsk"
  {:db/ident :fibo-fbc-fct-bci/Dnipropetrovsk,
   :lcc-cr/isPartOf :lcc-3166-1/Ukraine,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Dnipropetrovsk"})

(def Dodoma
  "the international business center of Dodoma"
  {:db/ident :fibo-fbc-fct-bci/Dodoma,
   :dcterms/description "the international business center of Dodoma",
   :lcc-cr/isPartOf :lcc-3166-1/Tanzania,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Dodoma"})

(def Doha
  "the international business center of Doha"
  {:db/ident :fibo-fbc-fct-bci/Doha,
   :dcterms/description "the international business center of Doha",
   :lcc-cr/isPartOf :lcc-3166-1/Qatar,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Doha"})

(def Douala
  "Douala"
  {:db/ident :fibo-fbc-fct-bci/Douala,
   :lcc-cr/isPartOf :lcc-3166-1/Cameroon,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Douala"})

(def Dubai
  "the international business center of Dubai"
  {:db/ident :fibo-fbc-fct-bci/Dubai,
   :dcterms/description "the international business center of Dubai",
   :lcc-cr/isPartOf :lcc-3166-1/UnitedArabEmirates,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Dubai"})

(def Dublin
  "the international business center of Dublin"
  {:db/ident :fibo-fbc-fct-bci/Dublin,
   :dcterms/description "the international business center of Dublin",
   :lcc-cr/isPartOf :lcc-3166-1/Ireland,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Dublin"})

(def Duesseldorf
  "Duesseldorf"
  {:db/ident :fibo-fbc-fct-bci/Duesseldorf,
   :lcc-cr/isPartOf :lcc-3166-1/Germany,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Duesseldorf"})

(def Dusseldorf
  "the international business center of Dusseldorf"
  {:db/ident :fibo-fbc-fct-bci/Dusseldorf,
   :dcterms/description "the international business center of Dusseldorf",
   :lcc-cr/isPartOf :lcc-3166-1/Germany,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Dusseldorf"})

(def EETA
  "the FpML business center code for Tallinn, Estonia"
  {:db/ident :fibo-fbc-fct-bci/EETA,
   :dcterms/description "the FpML business center code for Tallinn, Estonia",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Tallinn,
   :lcc-lr/hasTag "EETA",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Tallinn,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "EETA"})

(def EGCA
  "the FpML business center code for Cairo, Egypt"
  {:db/ident :fibo-fbc-fct-bci/EGCA,
   :dcterms/description "the FpML business center code for Cairo, Egypt",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Cairo,
   :lcc-lr/hasTag "EGCA",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Cairo,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "EGCA"})

(def ESAS
  "the FpML business center code for ESAS Settlement Day (as defined in 2006 ISDA Definitions Section 7.1 and Supplement Number 15 to the 2000 ISDA Definitions)"
  {:db/ident :fibo-fbc-fct-bci/ESAS,
   :dcterms/description
   "the FpML business center code for ESAS Settlement Day (as defined in 2006 ISDA Definitions Section 7.1 and Supplement Number 15 to the 2000 ISDA Definitions)",
   :lcc-lr/denotes :fibo-fbc-fct-bci/ESASSettlementDay,
   :lcc-lr/hasTag "ESAS",
   :lcc-lr/identifies :fibo-fbc-fct-bci/ESASSettlementDay,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessDayAdjustmentCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "ESAS"})

(def ESASSettlementDay
  "the business day adjustment convention for the ESAS Settlement Day (as defined in 2006 ISDA Definitions Section 7.1 and Supplement Number 15 to the 2000 ISDA Definitions)"
  {:db/ident :fibo-fbc-fct-bci/ESASSettlementDay,
   :dcterms/description
   "the business day adjustment convention for the ESAS Settlement Day (as defined in 2006 ISDA Definitions Section 7.1 and Supplement Number 15 to the 2000 ISDA Definitions)",
   :fibo-fnd-plc-loc/hasBusinessCenter :fibo-fbc-fct-bci/Wellington,
   :fibo-fnd-utl-av/explanatoryNote
   "ESAS is the Reserve Bank of New Zealand's Exchange Settlement Account System which is used by banks and other approved financial institutions to settle their obligations on a Real-Time Gross Settlement (RTGS) basis.",
   :rdf/type [:fibo-fnd-dt-bd/BusinessDayAdjustment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "ESAS Settlement Day"})

(def ESBA
  "the FpML business center code for Barcelona, Spain"
  {:db/ident :fibo-fbc-fct-bci/ESBA,
   :dcterms/description "the FpML business center code for Barcelona, Spain",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Barcelona,
   :lcc-lr/hasTag "ESBA",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Barcelona,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "ESBA"})

(def ESMA
  "the FpML business center code for Madrid, Spain"
  {:db/ident :fibo-fbc-fct-bci/ESMA,
   :dcterms/description "the FpML business center code for Madrid, Spain",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Madrid,
   :lcc-lr/hasTag "ESMA",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Madrid,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "ESMA"})

(def ETAA
  "the FpML business center code for Addis Ababa, Ethiopia"
  {:db/ident :fibo-fbc-fct-bci/ETAA,
   :dcterms/description
   "the FpML business center code for Addis Ababa, Ethiopia",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Addis_Ababa,
   :lcc-lr/hasTag "ETAA",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Addis_Ababa,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "ETAA"})

(def EUTA
  "the FpML business center code for TARGET (euro 'Business Center')"
  {:db/ident :fibo-fbc-fct-bci/EUTA,
   :dcterms/description
   "the FpML business center code for TARGET (euro 'Business Center')",
   :lcc-lr/denotes :fibo-fbc-fct-bci/TARGETSettlementDay,
   :lcc-lr/hasTag "EUTA",
   :lcc-lr/identifies :fibo-fbc-fct-bci/TARGETSettlementDay,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessDayAdjustmentCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "EUTA"})

(def Ebene
  "Ebene"
  {:db/ident :fibo-fbc-fct-bci/Ebene,
   :fibo-fnd-utl-av/synonym ["Ebene Cybercity" "Cybercity"],
   :lcc-cr/isPartOf :lcc-3166-1/Mauritius,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Ebene"})

(def Eden_Island
  "Eden Island"
  {:db/ident :fibo-fbc-fct-bci/Eden_Island,
   :lcc-cr/isPartOf :lcc-3166-1/Seychelles,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Eden Island"})

(def Edinburgh
  "the international business center of Edinburgh"
  {:db/ident :fibo-fbc-fct-bci/Edinburgh,
   :dcterms/description "the international business center of Edinburgh",
   :lcc-cr/isPartOf :lcc-3166-1/UnitedKingdomOfGreatBritainAndNorthernIreland,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Edinburgh"})

(def Ekaterinburg
  "Ekaterinburg"
  {:db/ident :fibo-fbc-fct-bci/Ekaterinburg,
   :lcc-cr/isPartOf :lcc-3166-1/RussianFederation,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Ekaterinburg"})

(def El_Salvador
  "El Salvador"
  {:db/ident :fibo-fbc-fct-bci/El_Salvador,
   :lcc-cr/isPartOf :lcc-3166-1/ElSalvador,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "El Salvador"})

(def Esch-sur-alzette
  "Esch-sur-alzette"
  {:db/ident :fibo-fbc-fct-bci/Esch-sur-alzette,
   :lcc-cr/isPartOf :lcc-3166-1/Luxembourg,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Esch-sur-alzette"})

(def Eschborn
  "Eschborn"
  {:db/ident :fibo-fbc-fct-bci/Eschborn,
   :lcc-cr/isPartOf :lcc-3166-1/Germany,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Eschborn"})

(def Eschenz
  "Eschenz"
  {:db/ident :fibo-fbc-fct-bci/Eschenz,
   :lcc-cr/isPartOf :lcc-3166-1/Switzerland,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Eschenz"})

(def Espirito_Santo
  "Espirito Santo"
  {:db/ident :fibo-fbc-fct-bci/Espirito_Santo,
   :lcc-cr/isPartOf :lcc-3166-1/Brazil,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Espirito Santo"})

(def Espoo
  "Espoo"
  {:db/ident :fibo-fbc-fct-bci/Espoo,
   :lcc-cr/isPartOf :lcc-3166-1/Finland,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Espoo"})

(def FIHE
  "the FpML business center code for Helsinki, Finland"
  {:db/ident :fibo-fbc-fct-bci/FIHE,
   :dcterms/description "the FpML business center code for Helsinki, Finland",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Helsinki,
   :lcc-lr/hasTag "FIHE",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Helsinki,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "FIHE"})

(def FRPA
  "the FpML business center code for Paris, France"
  {:db/ident :fibo-fbc-fct-bci/FRPA,
   :dcterms/description "the FpML business center code for Paris, France",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Paris,
   :lcc-lr/hasTag "FRPA",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Paris,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "FRPA"})

(def Fiac
  "Fiac"
  {:db/ident :fibo-fbc-fct-bci/Fiac,
   :lcc-cr/isPartOf :lcc-3166-1/France,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Fiac"})

(def Firenze
  "Firenze"
  {:db/ident :fibo-fbc-fct-bci/Firenze,
   :lcc-cr/isPartOf :lcc-3166-1/Italy,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Firenze"})

(def Florence
  "Florence"
  {:db/ident :fibo-fbc-fct-bci/Florence,
   :lcc-cr/isPartOf :lcc-3166-1/Italy,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Florence"})

(def FpMLBusinessCenterCodeScheme
  "the coding scheme used to define a set of codes for municipalities, or business centers, or business day adjustments for FpML"
  {:db/ident :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :dcterms/description
   "the coding scheme used to define a set of codes for municipalities, or business centers, or business day adjustments for FpML",
   :fibo-fnd-utl-av/adaptedFrom
   "http://www.fpml.org/coding-scheme/business-center",
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCodeScheme :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "FpML Business Center Code Scheme"})

(def Frankfurt
  "the international business center of Frankfurt"
  {:db/ident :fibo-fbc-fct-bci/Frankfurt,
   :dcterms/description "the international business center of Frankfurt",
   :lcc-cr/isPartOf :lcc-3166-1/Germany,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Frankfurt"})

(def Fukuoka
  "Fukuoka"
  {:db/ident :fibo-fbc-fct-bci/Fukuoka,
   :lcc-cr/isPartOf :lcc-3166-1/Japan,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Fukuoka"})

(def GBED
  "the FpML business center code for Edinburgh, Scotland"
  {:db/ident :fibo-fbc-fct-bci/GBED,
   :dcterms/description "the FpML business center code for Edinburgh, Scotland",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Edinburgh,
   :lcc-lr/hasTag "GBED",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Edinburgh,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "GBED"})

(def GBLO
  "the FpML business center code for London, United Kingdom"
  {:db/ident :fibo-fbc-fct-bci/GBLO,
   :dcterms/description
   "the FpML business center code for London, United Kingdom",
   :lcc-lr/denotes :fibo-fbc-fct-bci/London,
   :lcc-lr/hasTag "GBLO",
   :lcc-lr/identifies :fibo-fbc-fct-bci/London,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "GBLO"})

(def GETB
  "the FpML business center code for Tbilisi, Georgia"
  {:db/ident :fibo-fbc-fct-bci/GETB,
   :dcterms/description "the FpML business center code for Tbilisi, Georgia",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Tbilisi,
   :lcc-lr/hasTag "GETB",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Tbilisi,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "GETB"})

(def GGSP
  "the FpML business center code for Saint Peter Port, Guernsey"
  {:db/ident :fibo-fbc-fct-bci/GGSP,
   :dcterms/description
   "the FpML business center code for Saint Peter Port, Guernsey",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Saint_Peter_Port,
   :lcc-lr/hasTag "GGSP",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Saint_Peter_Port,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "GGSP"})

(def GHAC
  "the FpML business center code for Accra, Ghana"
  {:db/ident :fibo-fbc-fct-bci/GHAC,
   :dcterms/description "the FpML business center code for Accra, Ghana",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Accra,
   :lcc-lr/hasTag "GHAC",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Accra,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "GHAC"})

(def GIFT_City
  "GIFT City"
  {:db/ident :fibo-fbc-fct-bci/GIFT_City,
   :fibo-fnd-utl-av/synonym "Gujarat International Finance Tec-City",
   :lcc-cr/isPartOf :lcc-3166-1/India,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "GIFT City"})

(def GRAT
  "the FpML business center code for Athens, Greece"
  {:db/ident :fibo-fbc-fct-bci/GRAT,
   :dcterms/description "the FpML business center code for Athens, Greece",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Athens,
   :lcc-lr/hasTag "GRAT",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Athens,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "GRAT"})

(def Gaborone
  "the international business center of Gaborone"
  {:db/ident :fibo-fbc-fct-bci/Gaborone,
   :dcterms/description "the international business center of Gaborone",
   :lcc-cr/isPartOf :lcc-3166-1/Botswana,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Gaborone"})

(def Gandhinagar
  "Gandhinagar"
  {:db/ident :fibo-fbc-fct-bci/Gandhinagar,
   :lcc-cr/isPartOf :lcc-3166-1/India,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Gandhinagar"})

(def Geneva
  "the international business center of Geneva"
  {:db/ident :fibo-fbc-fct-bci/Geneva,
   :dcterms/description "the international business center of Geneva",
   :lcc-cr/isPartOf :lcc-3166-1/Switzerland,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Geneva"})

(def Genova
  "Genova"
  {:db/ident :fibo-fbc-fct-bci/Genova,
   :lcc-cr/isPartOf :lcc-3166-1/Italy,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Genova"})

(def George_Town
  "the international business center of George Town"
  {:db/ident :fibo-fbc-fct-bci/George_Town,
   :dcterms/description "the international business center of George Town",
   :lcc-cr/isPartOf :lcc-3166-1/CaymanIslands,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "George Town"})

(def Georgetown
  "Georgetown"
  {:db/ident :fibo-fbc-fct-bci/Georgetown,
   :lcc-cr/isPartOf :lcc-3166-1/Guyana,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Georgetown"})

(def Gibraltar
  "Gibraltar"
  {:db/ident :fibo-fbc-fct-bci/Gibraltar,
   :lcc-cr/isPartOf :lcc-3166-1/Gibraltar,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Gibraltar"})

(def Glenview
  "Glenview"
  {:db/ident :fibo-fbc-fct-bci/Glenview,
   :lcc-cr/isPartOf [:lcc-3166-2-us/Illinois :lcc-3166-1/UnitedStatesOfAmerica],
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Glenview"})

(def Great_Neck
  "Great Neck"
  {:db/ident :fibo-fbc-fct-bci/Great_Neck,
   :lcc-cr/isPartOf [:lcc-3166-2-us/NewYork :lcc-3166-1/UnitedStatesOfAmerica],
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Great Neck"})

(def Greenwich
  "Greenwich"
  {:db/ident :fibo-fbc-fct-bci/Greenwich,
   :lcc-cr/isPartOf [:lcc-3166-2-us/Connecticut
                     :lcc-3166-1/UnitedStatesOfAmerica],
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Greenwich"})

(def Grindsted
  "Grindsted"
  {:db/ident :fibo-fbc-fct-bci/Grindsted,
   :lcc-cr/isPartOf :lcc-3166-1/Denmark,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Grindsted"})

(def Guatemala
  "Guatemala"
  {:db/ident :fibo-fbc-fct-bci/Guatemala,
   :lcc-cr/isPartOf :lcc-3166-1/Guatemala,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Guatemala"})

(def Guayaquil
  "Guayaquil"
  {:db/ident :fibo-fbc-fct-bci/Guayaquil,
   :lcc-cr/isPartOf :lcc-3166-1/Ecuador,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Guayaquil"})

(def Guaynabo
  "Guaynabo"
  {:db/ident :fibo-fbc-fct-bci/Guaynabo,
   :lcc-cr/isPartOf [:lcc-3166-2-us/PuertoRico
                     :lcc-3166-1/UnitedStatesOfAmerica],
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Guaynabo"})

(def Guildford
  "Guildford"
  {:db/ident :fibo-fbc-fct-bci/Guildford,
   :lcc-cr/isPartOf :lcc-3166-1/UnitedKingdomOfGreatBritainAndNorthernIreland,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Guildford"})

(def HKHK
  "the FpML business center code for Hong Kong, Hong Kong"
  {:db/ident :fibo-fbc-fct-bci/HKHK,
   :dcterms/description
   "the FpML business center code for Hong Kong, Hong Kong",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Hong_Kong,
   :lcc-lr/hasTag "HKHK",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Hong_Kong,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "HKHK"})

(def HNTE
  "the FpML business center code for Tegucigalpa, Honduras"
  {:db/ident :fibo-fbc-fct-bci/HNTE,
   :dcterms/description
   "the FpML business center code for Tegucigalpa, Honduras",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Tegucigalpa,
   :lcc-lr/hasTag "HNTE",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Tegucigalpa,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "HNTE"})

(def HRZA
  "the FpML business center code for Zagreb, Republic of Croatia"
  {:db/ident :fibo-fbc-fct-bci/HRZA,
   :dcterms/description
   "the FpML business center code for Zagreb, Republic of Croatia",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Zagreb,
   :lcc-lr/hasTag "HRZA",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Zagreb,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "HRZA"})

(def HUBU
  "the FpML business center code for Budapest, Hungary"
  {:db/ident :fibo-fbc-fct-bci/HUBU,
   :dcterms/description "the FpML business center code for Budapest, Hungary",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Budapest,
   :lcc-lr/hasTag "HUBU",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Budapest,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "HUBU"})

(def Hamburg
  "Hamburg"
  {:db/ident :fibo-fbc-fct-bci/Hamburg,
   :lcc-cr/isPartOf :lcc-3166-1/Germany,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Hamburg"})

(def Hamilton
  "the international business center of Hamilton"
  {:db/ident :fibo-fbc-fct-bci/Hamilton,
   :dcterms/description "the international business center of Hamilton",
   :lcc-cr/isPartOf :lcc-3166-1/Bermuda,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Hamilton"})

(def Hannover
  "Hannover"
  {:db/ident :fibo-fbc-fct-bci/Hannover,
   :lcc-cr/isPartOf :lcc-3166-1/Germany,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Hannover"})

(def Hanoi
  "the international business center of Hanoi"
  {:db/ident :fibo-fbc-fct-bci/Hanoi,
   :dcterms/description "the international business center of Hanoi",
   :lcc-cr/isPartOf :lcc-3166-1/VietNam,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Hanoi"})

(def Harare
  "the international business center of Harare"
  {:db/ident :fibo-fbc-fct-bci/Harare,
   :dcterms/description "the international business center of Harare",
   :lcc-cr/isPartOf :lcc-3166-1/Zimbabwe,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Harare"})

(def Helsinki
  "the international business center of Helsinki"
  {:db/ident :fibo-fbc-fct-bci/Helsinki,
   :dcterms/description "the international business center of Helsinki",
   :lcc-cr/isPartOf :lcc-3166-1/Finland,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Helsinki"})

(def Hiroshima
  "Hiroshima"
  {:db/ident :fibo-fbc-fct-bci/Hiroshima,
   :lcc-cr/isPartOf :lcc-3166-1/Japan,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Hiroshima"})

(def Ho_Chi_Minh
  "the international business center of Ho Chi Minh (formerly Saigon)"
  {:db/ident :fibo-fbc-fct-bci/Ho_Chi_Minh,
   :dcterms/description
   "the international business center of Ho Chi Minh (formerly Saigon)",
   :lcc-cr/isPartOf :lcc-3166-1/VietNam,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Ho Chi Minh (formerly Saigon)"})

(def Ho_Chi_Minh_City
  "Ho Chi Minh City"
  {:db/ident :fibo-fbc-fct-bci/Ho_Chi_Minh_City,
   :lcc-cr/isPartOf :lcc-3166-1/VietNam,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Ho Chi Minh City"})

(def Hong_Kong
  "the international business center of Hong Kong"
  {:db/ident :fibo-fbc-fct-bci/Hong_Kong,
   :dcterms/description "the international business center of Hong Kong",
   :lcc-cr/isPartOf :lcc-3166-1/HongKong,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Hong Kong"})

(def Honolulu
  "the international business center of Honolulu"
  {:db/ident :fibo-fbc-fct-bci/Honolulu,
   :dcterms/description "the international business center of Honolulu",
   :lcc-cr/isPartOf [:lcc-3166-2-us/Hawaii :lcc-3166-1/UnitedStatesOfAmerica],
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Honolulu"})

(def Horsens
  "Horsens"
  {:db/ident :fibo-fbc-fct-bci/Horsens,
   :lcc-cr/isPartOf :lcc-3166-1/Denmark,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Horsens"})

(def Houston
  "the international business center of Houston"
  {:db/ident :fibo-fbc-fct-bci/Houston,
   :dcterms/description "the international business center of Houston",
   :lcc-cr/isPartOf [:lcc-3166-2-us/Texas :lcc-3166-1/UnitedStatesOfAmerica],
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Houston"})

(def Hove
  "Hove"
  {:db/ident :fibo-fbc-fct-bci/Hove,
   :lcc-cr/isPartOf :lcc-3166-1/UnitedKingdomOfGreatBritainAndNorthernIreland,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Hove"})

(def Hyderabad
  "the international business center of Hyderabad"
  {:db/ident :fibo-fbc-fct-bci/Hyderabad,
   :dcterms/description "the international business center of Hyderabad",
   :lcc-cr/isPartOf :lcc-3166-1/India,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Hyderabad"})

(def IDJA
  "the FpML business center code for Jakarta, Indonesia"
  {:db/ident :fibo-fbc-fct-bci/IDJA,
   :dcterms/description "the FpML business center code for Jakarta, Indonesia",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Jakarta,
   :lcc-lr/hasTag "IDJA",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Jakarta,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "IDJA"})

(def IEDU
  "the FpML business center code for Dublin, Ireland"
  {:db/ident :fibo-fbc-fct-bci/IEDU,
   :dcterms/description "the FpML business center code for Dublin, Ireland",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Dublin,
   :lcc-lr/hasTag "IEDU",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Dublin,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "IEDU"})

(def ILJE
  "the FpML business center code for Jerusalem, Israel"
  {:db/ident :fibo-fbc-fct-bci/ILJE,
   :dcterms/description "the FpML business center code for Jerusalem, Israel",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Jerusalem,
   :lcc-lr/hasTag "ILJE",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Jerusalem,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "ILJE"})

(def ILTA
  "the FpML business center code for Tel Aviv, Israel"
  {:db/ident :fibo-fbc-fct-bci/ILTA,
   :dcterms/description "the FpML business center code for Tel Aviv, Israel",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Tel_Aviv,
   :lcc-lr/hasTag "ILTA",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Tel_Aviv,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "ILTA"})

(def INBA
  "the FpML business center code for Bangalore, India"
  {:db/ident :fibo-fbc-fct-bci/INBA,
   :dcterms/description "the FpML business center code for Bangalore, India",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Bangalore,
   :lcc-lr/hasTag "INBA",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Bangalore,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "INBA"})

(def INCH
  "the FpML business center code for Chennai, India"
  {:db/ident :fibo-fbc-fct-bci/INCH,
   :dcterms/description "the FpML business center code for Chennai, India",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Chennai,
   :lcc-lr/hasTag "INCH",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Chennai,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "INCH"})

(def INHY
  "the FpML business center code for Hyderabad, India"
  {:db/ident :fibo-fbc-fct-bci/INHY,
   :dcterms/description "the FpML business center code for Hyderabad, India",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Hyderabad,
   :lcc-lr/hasTag "INHY",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Hyderabad,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "INHY"})

(def INKO
  "the FpML business center code for Kolkata, India"
  {:db/ident :fibo-fbc-fct-bci/INKO,
   :dcterms/description "the FpML business center code for Kolkata, India",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Kolkata,
   :lcc-lr/hasTag "INKO",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Kolkata,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "INKO"})

(def INMU
  "the FpML business center code for Mumbai, India"
  {:db/ident :fibo-fbc-fct-bci/INMU,
   :dcterms/description "the FpML business center code for Mumbai, India",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Mumbai,
   :lcc-lr/hasTag "INMU",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Mumbai,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "INMU"})

(def INND
  "the FpML business center code for New Delhi, India"
  {:db/ident :fibo-fbc-fct-bci/INND,
   :dcterms/description "the FpML business center code for New Delhi, India",
   :lcc-lr/denotes :fibo-fbc-fct-bci/New_Delhi,
   :lcc-lr/hasTag "INND",
   :lcc-lr/identifies :fibo-fbc-fct-bci/New_Delhi,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "INND"})

(def IRTE
  "the FpML business center code for Tehran, Iran"
  {:db/ident :fibo-fbc-fct-bci/IRTE,
   :dcterms/description "the FpML business center code for Tehran, Iran",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Tehran,
   :lcc-lr/hasTag "IRTE",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Tehran,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "IRTE"})

(def ISRE
  "the FpML business center code for Reykjavik, Iceland"
  {:db/ident :fibo-fbc-fct-bci/ISRE,
   :dcterms/description "the FpML business center code for Reykjavik, Iceland",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Reykjavik,
   :lcc-lr/hasTag "ISRE",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Reykjavik,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "ISRE"})

(def ITMI
  "the FpML business center code for Milan, Italy"
  {:db/ident :fibo-fbc-fct-bci/ITMI,
   :dcterms/description "the FpML business center code for Milan, Italy",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Milan,
   :lcc-lr/hasTag "ITMI",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Milan,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "ITMI"})

(def ITRO
  "the FpML business center code for Rome, Italy"
  {:db/ident :fibo-fbc-fct-bci/ITRO,
   :dcterms/description "the FpML business center code for Rome, Italy",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Rome,
   :lcc-lr/hasTag "ITRO",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Rome,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "ITRO"})

(def ITTU
  "the FpML business center code for Turin, Italy"
  {:db/ident :fibo-fbc-fct-bci/ITTU,
   :dcterms/description "the FpML business center code for Turin, Italy",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Turin,
   :lcc-lr/hasTag "ITTU",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Turin,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "ITTU"})

(def Indore_Madhya_Pradesh
  "Indore Madhya Pradesh"
  {:db/ident :fibo-fbc-fct-bci/Indore_Madhya_Pradesh,
   :lcc-cr/isPartOf :lcc-3166-1/India,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Indore Madhya Pradesh"})

(def Islamabad
  "Islamabad"
  {:db/ident :fibo-fbc-fct-bci/Islamabad,
   :lcc-cr/isPartOf :lcc-3166-1/Pakistan,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Islamabad"})

(def Istanbul
  "the international business center of Istanbul"
  {:db/ident :fibo-fbc-fct-bci/Istanbul,
   :dcterms/description "the international business center of Istanbul",
   :lcc-cr/isPartOf :lcc-3166-1/Turkey,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Istanbul"})

(def Izmir
  "Izmir"
  {:db/ident :fibo-fbc-fct-bci/Izmir,
   :lcc-cr/isPartOf :lcc-3166-1/Turkey,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Izmir"})

(def JESH
  "the FpML business center code for St. Helier, Channel Islands, Jersey"
  {:db/ident :fibo-fbc-fct-bci/JESH,
   :dcterms/description
   "the FpML business center code for St. Helier, Channel Islands, Jersey",
   :lcc-lr/denotes :fibo-fbc-fct-bci/St_Helier,
   :lcc-lr/hasTag "JESH",
   :lcc-lr/identifies :fibo-fbc-fct-bci/St_Helier,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "JESH"})

(def JMKI
  "the FpML business center code for Kingston, Jamaica"
  {:db/ident :fibo-fbc-fct-bci/JMKI,
   :dcterms/description "the FpML business center code for Kingston, Jamaica",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Kingston,
   :lcc-lr/hasTag "JMKI",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Kingston,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "JMKI"})

(def JOAM
  "the FpML business center code for Amman, Jordan"
  {:db/ident :fibo-fbc-fct-bci/JOAM,
   :dcterms/description "the FpML business center code for Amman, Jordan",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Amman,
   :lcc-lr/hasTag "JOAM",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Amman,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "JOAM"})

(def JPTO
  "the FpML business center code for Tokyo, Japan"
  {:db/ident :fibo-fbc-fct-bci/JPTO,
   :dcterms/description "the FpML business center code for Tokyo, Japan",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Tokyo,
   :lcc-lr/hasTag "JPTO",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Tokyo,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "JPTO"})

(def Jaen
  "Jaen"
  {:db/ident :fibo-fbc-fct-bci/Jaen,
   :lcc-cr/isPartOf :lcc-3166-1/Spain,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Jaen"})

(def Jakarta
  "the international business center of Jakarta"
  {:db/ident :fibo-fbc-fct-bci/Jakarta,
   :dcterms/description "the international business center of Jakarta",
   :lcc-cr/isPartOf :lcc-3166-1/Indonesia,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Jakarta"})

(def Jeddah
  "the international business center of Jeddah"
  {:db/ident :fibo-fbc-fct-bci/Jeddah,
   :dcterms/description "the international business center of Jeddah",
   :lcc-cr/isPartOf :lcc-3166-1/SaudiArabia,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Jeddah"})

(def Jersey_City
  "Jersey City"
  {:db/ident :fibo-fbc-fct-bci/Jersey_City,
   :lcc-cr/isPartOf [:lcc-3166-2-us/NewJersey
                     :lcc-3166-1/UnitedStatesOfAmerica],
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Jersey City"})

(def Jerusalem
  "the international business center of Jerusalem"
  {:db/ident :fibo-fbc-fct-bci/Jerusalem,
   :dcterms/description "the international business center of Jerusalem",
   :lcc-cr/isPartOf :lcc-3166-1/Israel,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Jerusalem"})

(def Johannesburg
  "the international business center of Johannesburg"
  {:db/ident :fibo-fbc-fct-bci/Johannesburg,
   :dcterms/description "the international business center of Johannesburg",
   :lcc-cr/isPartOf :lcc-3166-1/SouthAfrica,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Johannesburg"})

(def KENA
  "the FpML business center code for Nairobi, Kenya"
  {:db/ident :fibo-fbc-fct-bci/KENA,
   :dcterms/description "the FpML business center code for Nairobi, Kenya",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Nairobi,
   :lcc-lr/hasTag "KENA",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Nairobi,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "KENA"})

(def KRSE
  "the FpML business center code for Seoul, Republic of Korea"
  {:db/ident :fibo-fbc-fct-bci/KRSE,
   :dcterms/description
   "the FpML business center code for Seoul, Republic of Korea",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Seoul,
   :lcc-lr/hasTag "KRSE",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Seoul,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "KRSE"})

(def KWKC
  "the FpML business center code for Kuwait City, Kuwait"
  {:db/ident :fibo-fbc-fct-bci/KWKC,
   :dcterms/description "the FpML business center code for Kuwait City, Kuwait",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Kuwait_City,
   :lcc-lr/hasTag "KWKC",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Kuwait_City,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "KWKC"})

(def KYGE
  "the FpML business center code for George Town, Cayman Islands"
  {:db/ident :fibo-fbc-fct-bci/KYGE,
   :dcterms/description
   "the FpML business center code for George Town, Cayman Islands",
   :lcc-lr/denotes :fibo-fbc-fct-bci/George_Town,
   :lcc-lr/hasTag "KYGE",
   :lcc-lr/identifies :fibo-fbc-fct-bci/George_Town,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "KYGE"})

(def KZAL
  "the FpML business center code for Almaty, Kazakhstan"
  {:db/ident :fibo-fbc-fct-bci/KZAL,
   :dcterms/description "the FpML business center code for Almaty, Kazakhstan",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Almaty,
   :lcc-lr/hasTag "KZAL",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Almaty,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "KZAL"})

(def Kampala
  "the international business center of Kampala"
  {:db/ident :fibo-fbc-fct-bci/Kampala,
   :dcterms/description "the international business center of Kampala",
   :lcc-cr/isPartOf :lcc-3166-1/Uganda,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Kampala"})

(def Kansas_City
  "Kansas City"
  {:db/ident :fibo-fbc-fct-bci/Kansas_City,
   :lcc-cr/isPartOf [:lcc-3166-2-us/Missouri :lcc-3166-1/UnitedStatesOfAmerica],
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Kansas City"})

(def Karachi
  "the international business center of Karachi"
  {:db/ident :fibo-fbc-fct-bci/Karachi,
   :dcterms/description "the international business center of Karachi",
   :lcc-cr/isPartOf :lcc-3166-1/Pakistan,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Karachi"})

(def Kathmandu
  "the international business center of Kathmandu"
  {:db/ident :fibo-fbc-fct-bci/Kathmandu,
   :dcterms/description "the international business center of Kathmandu",
   :lcc-cr/isPartOf :lcc-3166-1/Nepal,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Kathmandu"})

(def Kharkov
  "Kharkov"
  {:db/ident :fibo-fbc-fct-bci/Kharkov,
   :lcc-cr/isPartOf :lcc-3166-1/Ukraine,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Kharkov"})

(def Khartoum
  "Khartoum"
  {:db/ident :fibo-fbc-fct-bci/Khartoum,
   :lcc-cr/isPartOf :lcc-3166-1/Sudan,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Khartoum"})

(def Kiel
  "Kiel"
  {:db/ident :fibo-fbc-fct-bci/Kiel,
   :lcc-cr/isPartOf :lcc-3166-1/Germany,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Kiel"})

(def Kiev
  "the international business center of Kiev"
  {:db/ident :fibo-fbc-fct-bci/Kiev,
   :dcterms/description "the international business center of Kiev",
   :lcc-cr/isPartOf :lcc-3166-1/Ukraine,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Kiev"})

(def Kigali
  "Kigali"
  {:db/ident :fibo-fbc-fct-bci/Kigali,
   :lcc-cr/isPartOf :lcc-3166-1/Rwanda,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Kigali"})

(def Kingston
  "the international business center of Kingston"
  {:db/ident :fibo-fbc-fct-bci/Kingston,
   :dcterms/description "the international business center of Kingston",
   :lcc-cr/isPartOf :lcc-3166-1/Jamaica,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Kingston"})

(def Kingstown
  "Kingstown"
  {:db/ident :fibo-fbc-fct-bci/Kingstown,
   :lcc-cr/isPartOf :lcc-3166-1/SaintVincentAndTheGrenadines,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Kingstown"})

(def Klagenfurt_am_Woerthersee
  "Klagenfurt Am Woerthersee"
  {:db/ident :fibo-fbc-fct-bci/Klagenfurt_am_Woerthersee,
   :lcc-cr/isPartOf :lcc-3166-1/Austria,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Klagenfurt Am Woerthersee"})

(def Kobe
  "Kobe"
  {:db/ident :fibo-fbc-fct-bci/Kobe,
   :lcc-cr/isPartOf :lcc-3166-1/Japan,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Kobe"})

(def Kolkata
  "the international business center of Kolkata"
  {:db/ident :fibo-fbc-fct-bci/Kolkata,
   :dcterms/description "the international business center of Kolkata",
   :lcc-cr/isPartOf :lcc-3166-1/India,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Kolkata"})

(def Kongsvinger
  "Kongsvinger"
  {:db/ident :fibo-fbc-fct-bci/Kongsvinger,
   :lcc-cr/isPartOf :lcc-3166-1/Norway,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Kongsvinger"})

(def Krakow
  "Krakow"
  {:db/ident :fibo-fbc-fct-bci/Krakow,
   :lcc-cr/isPartOf :lcc-3166-1/Poland,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Krakow"})

(def Kuala_Lumpur
  "the international business center of Kuala Lumpur"
  {:db/ident :fibo-fbc-fct-bci/Kuala_Lumpur,
   :dcterms/description "the international business center of Kuala Lumpur",
   :lcc-cr/isPartOf :lcc-3166-1/Malaysia,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Kuala Lumpur"})

(def Kuwait_City
  "the international business center of Kuwait City"
  {:db/ident :fibo-fbc-fct-bci/Kuwait_City,
   :dcterms/description "the international business center of Kuwait City",
   :lcc-cr/isPartOf :lcc-3166-1/Kuwait,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Kuwait City"})

(def Kyoto
  "Kyoto"
  {:db/ident :fibo-fbc-fct-bci/Kyoto,
   :lcc-cr/isPartOf :lcc-3166-1/Japan,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Kyoto"})

(def LBBE
  "the FpML business center code for Beirut, Lebanon"
  {:db/ident :fibo-fbc-fct-bci/LBBE,
   :dcterms/description "the FpML business center code for Beirut, Lebanon",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Beirut,
   :lcc-lr/hasTag "LBBE",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Beirut,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "LBBE"})

(def LKCO
  "the FpML business center code for Colombo, Sri Lanka"
  {:db/ident :fibo-fbc-fct-bci/LKCO,
   :dcterms/description "the FpML business center code for Colombo, Sri Lanka",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Colombo,
   :lcc-lr/hasTag "LKCO",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Colombo,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "LKCO"})

(def LULU
  "the FpML business center code for Luxembourg, Luxembourg"
  {:db/ident :fibo-fbc-fct-bci/LULU,
   :dcterms/description
   "the FpML business center code for Luxembourg, Luxembourg",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Luxembourg,
   :lcc-lr/hasTag "LULU",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Luxembourg,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "LULU"})

(def LVRI
  "the FpML business center code for Riga, Latvia"
  {:db/ident :fibo-fbc-fct-bci/LVRI,
   :dcterms/description "the FpML business center code for Riga, Latvia",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Riga,
   :lcc-lr/hasTag "LVRI",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Riga,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "LVRI"})

(def La_Paz
  "the international business center of La Paz"
  {:db/ident :fibo-fbc-fct-bci/La_Paz,
   :dcterms/description "the international business center of La Paz",
   :lcc-cr/isPartOf :lcc-3166-1/Bolivia,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "La Paz"})

(def Labuan
  "the international business center of Labuan"
  {:db/ident :fibo-fbc-fct-bci/Labuan,
   :dcterms/description "the international business center of Labuan",
   :lcc-cr/isPartOf :lcc-3166-1/Malaysia,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Labuan"})

(def Lagos
  "the international business center of Lagos"
  {:db/ident :fibo-fbc-fct-bci/Lagos,
   :dcterms/description "the international business center of Lagos",
   :lcc-cr/isPartOf :lcc-3166-1/Nigeria,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Lagos"})

(def Lahore
  "Lahore"
  {:db/ident :fibo-fbc-fct-bci/Lahore,
   :lcc-cr/isPartOf :lcc-3166-1/Pakistan,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Lahore"})

(def Lane_Cove
  "Lane Cove"
  {:db/ident :fibo-fbc-fct-bci/Lane_Cove,
   :lcc-cr/isPartOf :lcc-3166-1/Australia,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Lane Cove"})

(def Lao
  "Lao"
  {:db/ident :fibo-fbc-fct-bci/Lao,
   :lcc-cr/isPartOf :lcc-3166-1/LaoPeoplesDemocraticRepublic,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Lao"})

(def Larnaca
  "Larnaca"
  {:db/ident :fibo-fbc-fct-bci/Larnaca,
   :lcc-cr/isPartOf :lcc-3166-1/Cyprus,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Larnaca"})

(def Leipzig
  "the international business center of Leipzig"
  {:db/ident :fibo-fbc-fct-bci/Leipzig,
   :dcterms/description "the international business center of Leipzig",
   :lcc-cr/isPartOf :lcc-3166-1/Germany,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Leipzig"})

(def Lenexa
  "Lenexa"
  {:db/ident :fibo-fbc-fct-bci/Lenexa,
   :lcc-cr/isPartOf :lcc-3166-1/UnitedStatesOfAmerica,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Lenexa"})

(def Leuven
  "Leuven"
  {:db/ident :fibo-fbc-fct-bci/Leuven,
   :lcc-cr/isPartOf :lcc-3166-1/Belgium,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Leuven"})

(def Lilongwe
  "the international business center of Lilongwe"
  {:db/ident :fibo-fbc-fct-bci/Lilongwe,
   :dcterms/description "the international business center of Lilongwe",
   :lcc-cr/isPartOf :lcc-3166-1/Malawi,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Lilongwe"})

(def Lima
  "the international business center of Lima"
  {:db/ident :fibo-fbc-fct-bci/Lima,
   :dcterms/description "the international business center of Lima",
   :lcc-cr/isPartOf :lcc-3166-1/Peru,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Lima"})

(def Limassol
  "Limassol"
  {:db/ident :fibo-fbc-fct-bci/Limassol,
   :lcc-cr/isPartOf :lcc-3166-1/Cyprus,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Limassol"})

(def Linz
  "Linz"
  {:db/ident :fibo-fbc-fct-bci/Linz,
   :lcc-cr/isPartOf :lcc-3166-1/Austria,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Linz"})

(def Lisboa
  "Lisboa"
  {:db/ident :fibo-fbc-fct-bci/Lisboa,
   :lcc-cr/isPartOf :lcc-3166-1/Portugal,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Lisboa"})

(def Lisbon
  "the international business center of Lisbon"
  {:db/ident :fibo-fbc-fct-bci/Lisbon,
   :dcterms/description "the international business center of Lisbon",
   :lcc-cr/isPartOf :lcc-3166-1/Portugal,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Lisbon"})

(def Ljubljana
  "the international business center of Ljubljana"
  {:db/ident :fibo-fbc-fct-bci/Ljubljana,
   :dcterms/description "the international business center of Ljubljana",
   :lcc-cr/isPartOf :lcc-3166-1/Slovenia,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Ljubljana"})

(def London
  "the international business center of London"
  {:db/ident :fibo-fbc-fct-bci/London,
   :dcterms/description "the international business center of London",
   :lcc-cr/isPartOf :lcc-3166-1/UnitedKingdomOfGreatBritainAndNorthernIreland,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "London"})

(def Los_Angeles
  "the international business center of Los Angeles"
  {:db/ident :fibo-fbc-fct-bci/Los_Angeles,
   :dcterms/description "the international business center of Los Angeles",
   :lcc-cr/isPartOf [:lcc-3166-2-us/California
                     :lcc-3166-1/UnitedStatesOfAmerica],
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Los Angeles"})

(def Luanda
  "the international business center of Luanda"
  {:db/ident :fibo-fbc-fct-bci/Luanda,
   :dcterms/description "the international business center of Luanda",
   :lcc-cr/isPartOf :lcc-3166-1/Angola,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Luanda"})

(def Lugano
  "Lugano"
  {:db/ident :fibo-fbc-fct-bci/Lugano,
   :lcc-cr/isPartOf :lcc-3166-1/Switzerland,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Lugano"})

(def Lusaka
  "the international business center of Lusaka"
  {:db/ident :fibo-fbc-fct-bci/Lusaka,
   :dcterms/description "the international business center of Lusaka",
   :lcc-cr/isPartOf :lcc-3166-1/Zambia,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Lusaka"})

(def Luxembourg
  "the international business center of Luxembourg"
  {:db/ident :fibo-fbc-fct-bci/Luxembourg,
   :dcterms/description "the international business center of Luxembourg",
   :lcc-cr/isPartOf :lcc-3166-1/Luxembourg,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Luxembourg"})

(def Luzern
  "Luzern"
  {:db/ident :fibo-fbc-fct-bci/Luzern,
   :lcc-cr/isPartOf :lcc-3166-1/Switzerland,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Luzern"})

(def MACA
  "the FpML business center code for Casablanca, Morocco"
  {:db/ident :fibo-fbc-fct-bci/MACA,
   :dcterms/description "the FpML business center code for Casablanca, Morocco",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Casablanca,
   :lcc-lr/hasTag "MACA",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Casablanca,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "MACA"})

(def MARA
  "the FpML business center code for Rabat, Morocco"
  {:db/ident :fibo-fbc-fct-bci/MARA,
   :dcterms/description "the FpML business center code for Rabat, Morocco",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Rabat,
   :lcc-lr/hasTag "MARA",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Rabat,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "MARA"})

(def MCMO
  "the FpML business center code for Monaco, Monaco"
  {:db/ident :fibo-fbc-fct-bci/MCMO,
   :dcterms/description "the FpML business center code for Monaco, Monaco",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Monaco,
   :lcc-lr/hasTag "MCMO",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Monaco,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "MCMO"})

(def MOMA
  "the FpML business center code for Macau, Macao"
  {:db/ident :fibo-fbc-fct-bci/MOMA,
   :dcterms/description "the FpML business center code for Macau, Macao",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Macau,
   :lcc-lr/hasTag "MOMA",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Macau,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "MOMA"})

(def MTVA
  "the FpML business center code for Valletta, Malta"
  {:db/ident :fibo-fbc-fct-bci/MTVA,
   :dcterms/description "the FpML business center code for Valletta, Malta",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Valletta,
   :lcc-lr/hasTag "MTVA",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Valletta,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "MTVA"})

(def MUPL
  "the FpML business center code for Port Louis, Mauritius"
  {:db/ident :fibo-fbc-fct-bci/MUPL,
   :dcterms/description
   "the FpML business center code for Port Louis, Mauritius",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Port_Louis,
   :lcc-lr/hasTag "MUPL",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Port_Louis,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "MUPL"})

(def MVMA
  "the FpML business center code for Male, Maldives"
  {:db/ident :fibo-fbc-fct-bci/MVMA,
   :dcterms/description "the FpML business center code for Male, Maldives",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Male,
   :lcc-lr/hasTag "MVMA",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Male,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "MVMA"})

(def MWLI
  "the FpML business center code for Lilongwe, Malawi"
  {:db/ident :fibo-fbc-fct-bci/MWLI,
   :dcterms/description "the FpML business center code for Lilongwe, Malawi",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Lilongwe,
   :lcc-lr/hasTag "MWLI",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Lilongwe,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "MWLI"})

(def MXMC
  "the FpML business center code for Mexico City, Mexico"
  {:db/ident :fibo-fbc-fct-bci/MXMC,
   :dcterms/description "the FpML business center code for Mexico City, Mexico",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Mexico_City,
   :lcc-lr/hasTag "MXMC",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Mexico_City,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "MXMC"})

(def MYKL
  "the FpML business center code for Kuala Lumpur, Malaysia"
  {:db/ident :fibo-fbc-fct-bci/MYKL,
   :dcterms/description
   "the FpML business center code for Kuala Lumpur, Malaysia",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Kuala_Lumpur,
   :lcc-lr/hasTag "MYKL",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Kuala_Lumpur,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "MYKL"})

(def MYLA
  "the FpML business center code for Labuan, Malaysia"
  {:db/ident :fibo-fbc-fct-bci/MYLA,
   :dcterms/description "the FpML business center code for Labuan, Malaysia",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Labuan,
   :lcc-lr/hasTag "MYLA",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Labuan,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "MYLA"})

(def Macau
  "the international business center of Macau"
  {:db/ident :fibo-fbc-fct-bci/Macau,
   :dcterms/description "the international business center of Macau",
   :lcc-cr/isPartOf :lcc-3166-1/Macao,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Macau"})

(def Madras
  "Madras"
  {:db/ident :fibo-fbc-fct-bci/Madras,
   :lcc-cr/isPartOf :lcc-3166-1/India,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Madras"})

(def Madrid
  "the international business center of Madrid"
  {:db/ident :fibo-fbc-fct-bci/Madrid,
   :dcterms/description "the international business center of Madrid",
   :lcc-cr/isPartOf :lcc-3166-1/Spain,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Madrid"})

(def Mainz
  "the international business center of Mainz"
  {:db/ident :fibo-fbc-fct-bci/Mainz,
   :dcterms/description "the international business center of Mainz",
   :lcc-cr/isPartOf :lcc-3166-1/Germany,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Mainz"})

(def Makati
  "the international business center of Makati"
  {:db/ident :fibo-fbc-fct-bci/Makati,
   :dcterms/description "the international business center of Makati",
   :lcc-cr/isPartOf :lcc-3166-1/Philippines,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Makati"})

(def Makati_City
  "Makati City"
  {:db/ident :fibo-fbc-fct-bci/Makati_City,
   :lcc-cr/isPartOf :lcc-3166-1/Philippines,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Makati City"})

(def Male
  "the international business center of Male"
  {:db/ident :fibo-fbc-fct-bci/Male,
   :dcterms/description "the international business center of Male",
   :lcc-cr/isPartOf :lcc-3166-1/Maldives,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Male"})

(def Managua
  "Managua"
  {:db/ident :fibo-fbc-fct-bci/Managua,
   :lcc-cr/isPartOf :lcc-3166-1/Nicaragua,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Managua"})

(def Manama
  "the international business center of Manama"
  {:db/ident :fibo-fbc-fct-bci/Manama,
   :dcterms/description "the international business center of Manama",
   :lcc-cr/isPartOf :lcc-3166-1/Bahrain,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Manama"})

(def Manila
  "the international business center of Manila"
  {:db/ident :fibo-fbc-fct-bci/Manila,
   :dcterms/description "the international business center of Manila",
   :lcc-cr/isPartOf :lcc-3166-1/Philippines,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Manila"})

(def Maputo
  "Maputo"
  {:db/ident :fibo-fbc-fct-bci/Maputo,
   :lcc-cr/isPartOf :lcc-3166-1/Mozambique,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Maputo"})

(def Maringa
  "Maringa"
  {:db/ident :fibo-fbc-fct-bci/Maringa,
   :lcc-cr/isPartOf :lcc-3166-1/Brazil,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Maringa"})

(def Mbabane
  "Mbabane"
  {:db/ident :fibo-fbc-fct-bci/Mbabane,
   :lcc-cr/isPartOf :lcc-3166-1/Eswatini,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Mbabane"})

(def Melbourne
  "the international business center of Melbourne"
  {:db/ident :fibo-fbc-fct-bci/Melbourne,
   :dcterms/description "the international business center of Melbourne",
   :lcc-cr/isPartOf :lcc-3166-1/Australia,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Melbourne"})

(def Mendoza
  "Mendoza"
  {:db/ident :fibo-fbc-fct-bci/Mendoza,
   :lcc-cr/isPartOf :lcc-3166-1/Argentina,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Mendoza"})

(def Mexico_City
  "the international business center of Mexico City"
  {:db/ident :fibo-fbc-fct-bci/Mexico_City,
   :dcterms/description "the international business center of Mexico City",
   :lcc-cr/isPartOf :lcc-3166-1/Mexico,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Mexico City"})

(def Miami
  "Miami"
  {:db/ident :fibo-fbc-fct-bci/Miami,
   :lcc-cr/isPartOf [:lcc-3166-2-us/Florida :lcc-3166-1/UnitedStatesOfAmerica],
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Miami"})

(def Milan
  "the international business center of Milan"
  {:db/ident :fibo-fbc-fct-bci/Milan,
   :dcterms/description "the international business center of Milan",
   :lcc-cr/isPartOf :lcc-3166-1/Italy,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Milan"})

(def Minneapolis
  "the international business center of Minneapolis"
  {:db/ident :fibo-fbc-fct-bci/Minneapolis,
   :dcterms/description "the international business center of Minneapolis",
   :lcc-cr/isPartOf [:lcc-3166-2-us/Minnesota
                     :lcc-3166-1/UnitedStatesOfAmerica],
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Minneapolis"})

(def Minsk
  "the international business center of Minsk"
  {:db/ident :fibo-fbc-fct-bci/Minsk,
   :dcterms/description "the international business center of Minsk",
   :lcc-cr/isPartOf :lcc-3166-1/Belarus,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Minsk"})

(def Mobile
  "the international business center of Mobile"
  {:db/ident :fibo-fbc-fct-bci/Mobile,
   :dcterms/description "the international business center of Mobile",
   :lcc-cr/isPartOf [:lcc-3166-2-us/Alabama :lcc-3166-1/UnitedStatesOfAmerica],
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Mobile"})

(def Moka
  "Moka"
  {:db/ident :fibo-fbc-fct-bci/Moka,
   :lcc-cr/isPartOf :lcc-3166-1/Mauritius,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Moka"})

(def Monaco
  "the international business center of Monaco"
  {:db/ident :fibo-fbc-fct-bci/Monaco,
   :dcterms/description "the international business center of Monaco",
   :lcc-cr/isPartOf :lcc-3166-1/Monaco,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Monaco"})

(def Montenegro
  "Montenegro"
  {:db/ident :fibo-fbc-fct-bci/Montenegro,
   :lcc-cr/isPartOf :lcc-3166-1/Montenegro,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Montenegro"})

(def Montevideo
  "the international business center of Montevideo"
  {:db/ident :fibo-fbc-fct-bci/Montevideo,
   :dcterms/description "the international business center of Montevideo",
   :lcc-cr/isPartOf :lcc-3166-1/Uruguay,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Montevideo"})

(def Montreal
  "the international business center of Montreal"
  {:db/ident :fibo-fbc-fct-bci/Montreal,
   :dcterms/description "the international business center of Montreal",
   :lcc-cr/isPartOf :lcc-3166-1/Canada,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Montreal"})

(def Moorpark
  "Moorpark"
  {:db/ident :fibo-fbc-fct-bci/Moorpark,
   :lcc-cr/isPartOf :lcc-3166-1/UnitedStatesOfAmerica,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Moorpark"})

(def Moscow
  "the international business center of Moscow"
  {:db/ident :fibo-fbc-fct-bci/Moscow,
   :dcterms/description "the international business center of Moscow",
   :lcc-cr/isPartOf :lcc-3166-1/RussianFederation,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Moscow"})

(def Mount_Pleasant
  "Mount Pleasant"
  {:db/ident :fibo-fbc-fct-bci/Mount_Pleasant,
   :lcc-cr/isPartOf [:lcc-3166-2-us/SouthCarolina
                     :lcc-3166-1/UnitedStatesOfAmerica],
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Mount Pleasant"})

(def Muenchen
  "Muenchen"
  {:db/ident :fibo-fbc-fct-bci/Muenchen,
   :lcc-cr/isPartOf :lcc-3166-1/Germany,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Muenchen"})

(def Mumbai
  "the international business center of Mumbai"
  {:db/ident :fibo-fbc-fct-bci/Mumbai,
   :dcterms/description "the international business center of Mumbai",
   :lcc-cr/isPartOf :lcc-3166-1/India,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Mumbai"})

(def Munich
  "the international business center of Munich"
  {:db/ident :fibo-fbc-fct-bci/Munich,
   :dcterms/description "the international business center of Munich",
   :lcc-cr/isPartOf :lcc-3166-1/Germany,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Munich"})

(def Muscat
  "the international business center of Muscat"
  {:db/ident :fibo-fbc-fct-bci/Muscat,
   :dcterms/description "the international business center of Muscat",
   :lcc-cr/isPartOf :lcc-3166-1/Oman,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Muscat"})

(def NAWI
  "the FpML business center code for Windhoek, Namibia"
  {:db/ident :fibo-fbc-fct-bci/NAWI,
   :dcterms/description "the FpML business center code for Windhoek, Namibia",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Windhoek,
   :lcc-lr/hasTag "NAWI",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Windhoek,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "NAWI"})

(def NGAB
  "the FpML business center code for Abuja, Nigeria"
  {:db/ident :fibo-fbc-fct-bci/NGAB,
   :dcterms/description "the FpML business center code for Abuja, Nigeria",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Abuja,
   :lcc-lr/hasTag "NGAB",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Abuja,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "NGAB"})

(def NGLA
  "the FpML business center code for Lagos, Nigeria"
  {:db/ident :fibo-fbc-fct-bci/NGLA,
   :dcterms/description "the FpML business center code for Lagos, Nigeria",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Lagos,
   :lcc-lr/hasTag "NGLA",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Lagos,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "NGLA"})

(def NLAM
  "the FpML business center code for Amsterdam, Netherlands"
  {:db/ident :fibo-fbc-fct-bci/NLAM,
   :dcterms/description
   "the FpML business center code for Amsterdam, Netherlands",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Amsterdam,
   :lcc-lr/hasTag "NLAM",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Amsterdam,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "NLAM"})

(def NLRO
  "the FpML business center code for Rotterdam, Netherlands"
  {:db/ident :fibo-fbc-fct-bci/NLRO,
   :dcterms/description
   "the FpML business center code for Rotterdam, Netherlands",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Rotterdam,
   :lcc-lr/hasTag "NLRO",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Rotterdam,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "NLRO"})

(def NOOS
  "the FpML business center code for Oslo, Norway"
  {:db/ident :fibo-fbc-fct-bci/NOOS,
   :dcterms/description "the FpML business center code for Oslo, Norway",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Oslo,
   :lcc-lr/hasTag "NOOS",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Oslo,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "NOOS"})

(def NPKA
  "the FpML business center code for Kathmandu, Nepal"
  {:db/ident :fibo-fbc-fct-bci/NPKA,
   :dcterms/description "the FpML business center code for Kathmandu, Nepal",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Kathmandu,
   :lcc-lr/hasTag "NPKA",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Kathmandu,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "NPKA"})

(def NYFD
  "the FpML business center code for the New York Fed Business Day (as defined in 2006 ISDA Definitions Section 1.9 and 2000 ISDA Definitions Section 1.9)"
  {:db/ident :fibo-fbc-fct-bci/NYFD,
   :dcterms/description
   "the FpML business center code for the New York Fed Business Day (as defined in 2006 ISDA Definitions Section 1.9 and 2000 ISDA Definitions Section 1.9)",
   :lcc-lr/denotes :fibo-fbc-fct-bci/NewYorkFederalReserveBusinessDay,
   :lcc-lr/hasTag "NYFD",
   :lcc-lr/identifies :fibo-fbc-fct-bci/NewYorkFederalReserveBusinessDay,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessDayAdjustmentCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "NYFD"})

(def NYSE
  "the FpML business center code for the New York Stock Exchange Business Day (as defined in 2006 ISDA Definitions Section 1.10 and 2000 ISDA Definitions Section 1.10)"
  {:db/ident :fibo-fbc-fct-bci/NYSE,
   :dcterms/description
   "the FpML business center code for the New York Stock Exchange Business Day (as defined in 2006 ISDA Definitions Section 1.10 and 2000 ISDA Definitions Section 1.10)",
   :lcc-lr/denotes :fibo-fbc-fct-bci/NewYorkStockExchangeBusinessDay,
   :lcc-lr/hasTag "NYSE",
   :lcc-lr/identifies :fibo-fbc-fct-bci/NewYorkStockExchangeBusinessDay,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessDayAdjustmentCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "NYSE"})

(def NZAU
  "the FpML business center code for Auckland, New Zealand"
  {:db/ident :fibo-fbc-fct-bci/NZAU,
   :dcterms/description
   "the FpML business center code for Auckland, New Zealand",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Auckland,
   :lcc-lr/hasTag "NZAU",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Auckland,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "NZAU"})

(def NZWE
  "the FpML business center code for Wellington, New Zealand"
  {:db/ident :fibo-fbc-fct-bci/NZWE,
   :dcterms/description
   "the FpML business center code for Wellington, New Zealand",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Wellington,
   :lcc-lr/hasTag "NZWE",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Wellington,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "NZWE"})

(def Nablus
  "Nablus"
  {:db/ident :fibo-fbc-fct-bci/Nablus,
   :lcc-cr/isPartOf :lcc-3166-1/Palestine,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Nablus"})

(def Nacka
  "Nacka"
  {:db/ident :fibo-fbc-fct-bci/Nacka,
   :lcc-cr/isPartOf :lcc-3166-1/Sweden,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Nacka"})

(def Nagoya
  "Nagoya"
  {:db/ident :fibo-fbc-fct-bci/Nagoya,
   :lcc-cr/isPartOf :lcc-3166-1/Japan,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Nagoya"})

(def Nairobi
  "the international business center of Nairobi"
  {:db/ident :fibo-fbc-fct-bci/Nairobi,
   :dcterms/description "the international business center of Nairobi",
   :lcc-cr/isPartOf :lcc-3166-1/Kenya,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Nairobi"})

(def Narberth
  "Narberth"
  {:db/ident :fibo-fbc-fct-bci/Narberth,
   :lcc-cr/isPartOf [:lcc-3166-2-us/Pennsylvania
                     :lcc-3166-1/UnitedStatesOfAmerica],
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Narberth"})

(def Nasau
  "Nasau"
  {:db/ident :fibo-fbc-fct-bci/Nasau,
   :lcc-cr/isPartOf :lcc-3166-1/Bahamas,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Nasau"})

(def Nassau
  "the international business center of Nassau"
  {:db/ident :fibo-fbc-fct-bci/Nassau,
   :dcterms/description "the international business center of Nassau",
   :lcc-cr/isPartOf :lcc-3166-1/Bahamas,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Nassau"})

(def NewYorkFederalReserveBusinessDay
  "the business day adjustment convention for the New York Fed"
  {:db/ident :fibo-fbc-fct-bci/NewYorkFederalReserveBusinessDay,
   :dcterms/description
   "the business day adjustment convention for the New York Fed",
   :fibo-fnd-plc-loc/hasBusinessCenter :fibo-fbc-fct-bci/New_York,
   :rdf/type [:fibo-fnd-dt-bd/BusinessDayAdjustment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "New York Federal Reserve Business Day"})

(def NewYorkStockExchangeBusinessDay
  "the business day adjustment convention for the New York Stock Exchange"
  {:db/ident :fibo-fbc-fct-bci/NewYorkStockExchangeBusinessDay,
   :dcterms/description
   "the business day adjustment convention for the New York Stock Exchange",
   :fibo-fnd-plc-loc/hasBusinessCenter :fibo-fbc-fct-bci/New_York,
   :rdf/type [:fibo-fnd-dt-bd/BusinessDayAdjustment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "New York Stock Exchange Business Day"})

(def New_Delhi
  "the international business center of New Delhi"
  {:db/ident :fibo-fbc-fct-bci/New_Delhi,
   :dcterms/description "the international business center of New Delhi",
   :lcc-cr/isPartOf :lcc-3166-1/India,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "New Delhi"})

(def New_York
  "the international business center of New York"
  {:db/ident :fibo-fbc-fct-bci/New_York,
   :dcterms/description "the international business center of New York",
   :fibo-fnd-utl-av/synonym "New York City",
   :lcc-cr/isPartOf [:lcc-3166-2-us/NewYork :lcc-3166-1/UnitedStatesOfAmerica],
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "New York"})

(def Newcastle
  "Newcastle"
  {:db/ident :fibo-fbc-fct-bci/Newcastle,
   :lcc-cr/isPartOf :lcc-3166-1/Australia,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Newcastle"})

(def Nicosia
  "the international business center of Nicosia"
  {:db/ident :fibo-fbc-fct-bci/Nicosia,
   :dcterms/description "the international business center of Nicosia",
   :lcc-cr/isPartOf :lcc-3166-1/Cyprus,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Nicosia"})

(def Nigita
  "Nigita"
  {:db/ident :fibo-fbc-fct-bci/Nigita,
   :lcc-cr/isPartOf :lcc-3166-1/Japan,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Nigita"})

(def NizhniyNovgorod
  "Nizhniy Novgorod"
  {:db/ident :fibo-fbc-fct-bci/NizhniyNovgorod,
   :lcc-cr/isPartOf :lcc-3166-1/RussianFederation,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Nizhniy Novgorod"})

(def North_Bergen
  "North Bergen"
  {:db/ident :fibo-fbc-fct-bci/North_Bergen,
   :lcc-cr/isPartOf [:lcc-3166-2-us/NewJersey
                     :lcc-3166-1/UnitedStatesOfAmerica],
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "North Bergen"})

(def Novosibirsk
  "Novosibirsk"
  {:db/ident :fibo-fbc-fct-bci/Novosibirsk,
   :lcc-cr/isPartOf :lcc-3166-1/RussianFederation,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Novosibirsk"})

(def Nyon
  "Nyon"
  {:db/ident :fibo-fbc-fct-bci/Nyon,
   :lcc-cr/isPartOf :lcc-3166-1/Switzerland,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Nyon"})

(def OMMU
  "the FpML business center code for Muscat, Oman"
  {:db/ident :fibo-fbc-fct-bci/OMMU,
   :dcterms/description "the FpML business center code for Muscat, Oman",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Muscat,
   :lcc-lr/hasTag "OMMU",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Muscat,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "OMMU"})

(def Odessa
  "Odessa"
  {:db/ident :fibo-fbc-fct-bci/Odessa,
   :lcc-cr/isPartOf :lcc-3166-1/Ukraine,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Odessa"})

(def Oldenburg
  "Oldenburg"
  {:db/ident :fibo-fbc-fct-bci/Oldenburg,
   :lcc-cr/isPartOf :lcc-3166-1/Germany,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Oldenburg"})

(def Osaka
  "Osaka"
  {:db/ident :fibo-fbc-fct-bci/Osaka,
   :lcc-cr/isPartOf :lcc-3166-1/Japan,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Osaka"})

(def Oslo
  "the international business center of Oslo"
  {:db/ident :fibo-fbc-fct-bci/Oslo,
   :dcterms/description "the international business center of Oslo",
   :lcc-cr/isPartOf :lcc-3166-1/Norway,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Oslo"})

(def Oststeinbek
  "Oststeinbek"
  {:db/ident :fibo-fbc-fct-bci/Oststeinbek,
   :lcc-cr/isPartOf :lcc-3166-1/Germany,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Oststeinbek"})

(def Ottawa
  "the international business center of Ottawa"
  {:db/ident :fibo-fbc-fct-bci/Ottawa,
   :dcterms/description "the international business center of Ottawa",
   :lcc-cr/isPartOf :lcc-3166-1/Canada,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Ottawa"})

(def PAPC
  "the FpML business center code for Panama City, Panama"
  {:db/ident :fibo-fbc-fct-bci/PAPC,
   :dcterms/description "the FpML business center code for Panama City, Panama",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Panama_City,
   :lcc-lr/hasTag "PAPC",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Panama_City,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "PAPC"})

(def PELI
  "the FpML business center code for Lima, Peru"
  {:db/ident :fibo-fbc-fct-bci/PELI,
   :dcterms/description "the FpML business center code for Lima, Peru",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Lima,
   :lcc-lr/hasTag "PELI",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Lima,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "PELI"})

(def PHMA
  "the FpML business center code for Manila, Philippines"
  {:db/ident :fibo-fbc-fct-bci/PHMA,
   :dcterms/description "the FpML business center code for Manila, Philippines",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Manila,
   :lcc-lr/hasTag "PHMA",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Manila,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "PHMA"})

(def PHMK
  "the FpML business center code for Makati, Philippines"
  {:db/ident :fibo-fbc-fct-bci/PHMK,
   :dcterms/description "the FpML business center code for Makati, Philippines",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Makati,
   :lcc-lr/hasTag "PHMK",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Makati,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "PHMK"})

(def PKKA
  "the FpML business center code for Karachi, Pakistan"
  {:db/ident :fibo-fbc-fct-bci/PKKA,
   :dcterms/description "the FpML business center code for Karachi, Pakistan",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Karachi,
   :lcc-lr/hasTag "PKKA",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Karachi,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "PKKA"})

(def PLWA
  "the FpML business center code for Warsaw, Poland"
  {:db/ident :fibo-fbc-fct-bci/PLWA,
   :dcterms/description "the FpML business center code for Warsaw, Poland",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Warsaw,
   :lcc-lr/hasTag "PLWA",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Warsaw,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "PLWA"})

(def PRSJ
  "the FpML business center code for San Juan, Puerto Rico"
  {:db/ident :fibo-fbc-fct-bci/PRSJ,
   :dcterms/description
   "the FpML business center code for San Juan, Puerto Rico",
   :lcc-lr/denotes :fibo-fbc-fct-bci/San_Juan,
   :lcc-lr/hasTag "PRSJ",
   :lcc-lr/identifies :fibo-fbc-fct-bci/San_Juan,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "PRSJ"})

(def PTLI
  "the FpML business center code for Lisbon, Portugal"
  {:db/ident :fibo-fbc-fct-bci/PTLI,
   :dcterms/description "the FpML business center code for Lisbon, Portugal",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Lisbon,
   :lcc-lr/hasTag "PTLI",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Lisbon,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "PTLI"})

(def Padova
  "Padova"
  {:db/ident :fibo-fbc-fct-bci/Padova,
   :lcc-cr/isPartOf :lcc-3166-1/Italy,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Padova"})

(def PalmaDeMallorca
  "Palma de Mallorca"
  {:db/ident :fibo-fbc-fct-bci/PalmaDeMallorca,
   :lcc-cr/isPartOf :lcc-3166-1/Spain,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Palma de Mallorca"})

(def Panama_City
  "the international business center of Panama City"
  {:db/ident :fibo-fbc-fct-bci/Panama_City,
   :dcterms/description "the international business center of Panama City",
   :lcc-cr/isPartOf :lcc-3166-1/Panama,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Panama City"})

(def Paris
  "the international business center of Paris"
  {:db/ident :fibo-fbc-fct-bci/Paris,
   :dcterms/description "the international business center of Paris",
   :lcc-cr/isPartOf :lcc-3166-1/France,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Paris"})

(def Pasig_City
  "Pasig City"
  {:db/ident :fibo-fbc-fct-bci/Pasig_City,
   :lcc-cr/isPartOf :lcc-3166-1/Philippines,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Pasig City"})

(def Perth
  "the international business center of Perth"
  {:db/ident :fibo-fbc-fct-bci/Perth,
   :dcterms/description "the international business center of Perth",
   :lcc-cr/isPartOf :lcc-3166-1/Australia,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Perth"})

(def Pfaffikon_SZ
  "Pfäffikon SZ"
  {:db/ident :fibo-fbc-fct-bci/Pfaffikon_SZ,
   :lcc-cr/isPartOf [:lcc-3166-2-ch/CH-SZ :lcc-3166-1/Switzerland],
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Pfäffikon SZ"})

(def Philadelphia
  "Philadelphia"
  {:db/ident :fibo-fbc-fct-bci/Philadelphia,
   :lcc-cr/isPartOf [:lcc-3166-2-us/Pennsylvania
                     :lcc-3166-1/UnitedStatesOfAmerica],
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Philadelphia"})

(def Phnom_Penh
  "Phnom Penh"
  {:db/ident :fibo-fbc-fct-bci/Phnom_Penh,
   :lcc-cr/isPartOf :lcc-3166-1/Cambodia,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Phnom Penh"})

(def Phoenix
  "Phoenix"
  {:db/ident :fibo-fbc-fct-bci/Phoenix,
   :lcc-cr/isPartOf :lcc-3166-1/UnitedStatesOfAmerica,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Phoenix"})

(def Port_Louis
  "the international business center of Port Louis"
  {:db/ident :fibo-fbc-fct-bci/Port_Louis,
   :dcterms/description "the international business center of Port Louis",
   :lcc-cr/isPartOf :lcc-3166-1/Mauritius,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Port Louis"})

(def Port_Moresby
  "Port Moresby"
  {:db/ident :fibo-fbc-fct-bci/Port_Moresby,
   :lcc-cr/isPartOf :lcc-3166-1/PapuaNewGuinea,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Port Moresby"})

(def Port_Vila
  "Port Vila"
  {:db/ident :fibo-fbc-fct-bci/Port_Vila,
   :lcc-cr/isPartOf :lcc-3166-1/Vanuatu,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Port Vila"})

(def Port_of_Spain
  "the international business center of Port of Spain"
  {:db/ident :fibo-fbc-fct-bci/Port_of_Spain,
   :dcterms/description "the international business center of Port of Spain",
   :lcc-cr/isPartOf :lcc-3166-1/TrinidadAndTobago,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Port of Spain"})

(def Portland
  "the international business center of Portland"
  {:db/ident :fibo-fbc-fct-bci/Portland,
   :dcterms/description "the international business center of Portland",
   :lcc-cr/isPartOf [:lcc-3166-2-us/Oregon :lcc-3166-1/UnitedStatesOfAmerica],
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Portland"})

(def Porto
  "Porto"
  {:db/ident :fibo-fbc-fct-bci/Porto,
   :lcc-cr/isPartOf :lcc-3166-1/Portugal,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Porto"})

(def Prague
  "the international business center of Prague"
  {:db/ident :fibo-fbc-fct-bci/Prague,
   :dcterms/description "the international business center of Prague",
   :lcc-cr/isPartOf :lcc-3166-1/Czechia,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Prague"})

(def Praia
  "Praia"
  {:db/ident :fibo-fbc-fct-bci/Praia,
   :lcc-cr/isPartOf :lcc-3166-1/CaboVerde,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Praia"})

(def Princeton
  "Princeton"
  {:db/ident :fibo-fbc-fct-bci/Princeton,
   :lcc-cr/isPartOf [:lcc-3166-2-us/NewJersey
                     :lcc-3166-1/UnitedStatesOfAmerica],
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Princeton"})

(def Purchase
  "Purchase"
  {:db/ident :fibo-fbc-fct-bci/Purchase,
   :lcc-cr/isPartOf :lcc-3166-2-us/NewYork,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Purchase"})

(def QADO
  "the FpML business center code for Doha, Qatar"
  {:db/ident :fibo-fbc-fct-bci/QADO,
   :dcterms/description "the FpML business center code for Doha, Qatar",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Doha,
   :lcc-lr/hasTag "QADO",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Doha,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "QADO"})

(def Quito
  "Quito"
  {:db/ident :fibo-fbc-fct-bci/Quito,
   :lcc-cr/isPartOf :lcc-3166-1/Ecuador,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Quito"})

(def ROBU
  "the FpML business center code for Bucarest, Romania"
  {:db/ident :fibo-fbc-fct-bci/ROBU,
   :dcterms/description "the FpML business center code for Bucarest, Romania",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Bucarest,
   :lcc-lr/hasTag "ROBU",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Bucarest,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "ROBU"})

(def RSBE
  "the FpML business center code for Belgrade, Serbia"
  {:db/ident :fibo-fbc-fct-bci/RSBE,
   :dcterms/description "the FpML business center code for Belgrade, Serbia",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Belgrade,
   :lcc-lr/hasTag "RSBE",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Belgrade,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "RSBE"})

(def RUMO
  "the FpML business center code for Moscow, Russian Federation"
  {:db/ident :fibo-fbc-fct-bci/RUMO,
   :dcterms/description
   "the FpML business center code for Moscow, Russian Federation",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Moscow,
   :lcc-lr/hasTag "RUMO",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Moscow,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "RUMO"})

(def Rabat
  "the international business center of Rabat"
  {:db/ident :fibo-fbc-fct-bci/Rabat,
   :dcterms/description "the international business center of Rabat",
   :lcc-cr/isPartOf :lcc-3166-1/Morocco,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Rabat"})

(def Randers
  "Randers"
  {:db/ident :fibo-fbc-fct-bci/Randers,
   :lcc-cr/isPartOf :lcc-3166-1/Denmark,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Randers"})

(def Red_Bank
  "Red Bank"
  {:db/ident :fibo-fbc-fct-bci/Red_Bank,
   :lcc-cr/isPartOf [:lcc-3166-2-us/NewJersey
                     :lcc-3166-1/UnitedStatesOfAmerica],
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Red Bank"})

(def Regensburg
  "Regensburg"
  {:db/ident :fibo-fbc-fct-bci/Regensburg,
   :lcc-cr/isPartOf :lcc-3166-1/Germany,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Regensburg"})

(def Reggio_Emilia
  "Reggio Emilia"
  {:db/ident :fibo-fbc-fct-bci/Reggio_Emilia,
   :lcc-cr/isPartOf :lcc-3166-1/Italy,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Reggio Emilia"})

(def Reykjavik
  "the international business center of Reykjavik"
  {:db/ident :fibo-fbc-fct-bci/Reykjavik,
   :dcterms/description "the international business center of Reykjavik",
   :lcc-cr/isPartOf :lcc-3166-1/Iceland,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Reykjavik"})

(def Riga
  "the international business center of Riga"
  {:db/ident :fibo-fbc-fct-bci/Riga,
   :dcterms/description "the international business center of Riga",
   :lcc-cr/isPartOf :lcc-3166-1/Latvia,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Riga"})

(def Rio_de_Janeiro
  "the international business center of Rio de Janeiro"
  {:db/ident :fibo-fbc-fct-bci/Rio_de_Janeiro,
   :dcterms/description "the international business center of Rio de Janeiro",
   :lcc-cr/isPartOf :lcc-3166-1/Brazil,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Rio de Janeiro"})

(def Riyadh
  "the international business center of Riyadh"
  {:db/ident :fibo-fbc-fct-bci/Riyadh,
   :dcterms/description "the international business center of Riyadh",
   :lcc-cr/isPartOf :lcc-3166-1/SaudiArabia,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Riyadh"})

(def Road_Town
  "the international business center of Road Town"
  {:db/ident :fibo-fbc-fct-bci/Road_Town,
   :dcterms/description "the international business center of Road Town",
   :lcc-cr/isPartOf :lcc-3166-1/VirginIslandsBritish,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Road Town"})

(def Rodgau
  "Rodgau"
  {:db/ident :fibo-fbc-fct-bci/Rodgau,
   :lcc-cr/isPartOf :lcc-3166-1/Germany,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Rodgau"})

(def Roma
  "Roma"
  {:db/ident :fibo-fbc-fct-bci/Roma,
   :lcc-cr/isPartOf :lcc-3166-1/Italy,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Roma"})

(def Rome
  "the international business center of Rome"
  {:db/ident :fibo-fbc-fct-bci/Rome,
   :dcterms/description "the international business center of Rome",
   :lcc-cr/isPartOf :lcc-3166-1/Italy,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Rome"})

(def Rosario
  "Rosario"
  {:db/ident :fibo-fbc-fct-bci/Rosario,
   :lcc-cr/isPartOf :lcc-3166-1/Argentina,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Rosario"})

(def Rostov
  "Rostov"
  {:db/ident :fibo-fbc-fct-bci/Rostov,
   :lcc-cr/isPartOf :lcc-3166-1/RussianFederation,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Rostov"})

(def Rotterdam
  "the international business center of Rotterdam"
  {:db/ident :fibo-fbc-fct-bci/Rotterdam,
   :dcterms/description "the international business center of Rotterdam",
   :lcc-cr/isPartOf :lcc-3166-1/Netherlands,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Rotterdam"})

(def SAAB
  "the FpML business center code for Abha, Saudi Arabia"
  {:db/ident :fibo-fbc-fct-bci/SAAB,
   :dcterms/description "the FpML business center code for Abha, Saudi Arabia",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Abha,
   :lcc-lr/hasTag "SAAB",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Abha,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "SAAB"})

(def SAJE
  "the FpML business center code for Jeddah, Saudi Arabia"
  {:db/ident :fibo-fbc-fct-bci/SAJE,
   :dcterms/description
   "the FpML business center code for Jeddah, Saudi Arabia",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Jeddah,
   :lcc-lr/hasTag "SAJE",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Jeddah,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "SAJE"})

(def SARI
  "the FpML business center code for Riyadh, Saudi Arabia"
  {:db/ident :fibo-fbc-fct-bci/SARI,
   :dcterms/description
   "the FpML business center code for Riyadh, Saudi Arabia",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Riyadh,
   :lcc-lr/hasTag "SARI",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Riyadh,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "SARI"})

(def SEST
  "the FpML business center code for Stockholm, Sweden"
  {:db/ident :fibo-fbc-fct-bci/SEST,
   :dcterms/description "the FpML business center code for Stockholm, Sweden",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Stockholm,
   :lcc-lr/hasTag "SEST",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Stockholm,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "SEST"})

(def SGSI
  "the FpML business center code for Singapore, Singapore"
  {:db/ident :fibo-fbc-fct-bci/SGSI,
   :dcterms/description
   "the FpML business center code for Singapore, Singapore",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Singapore,
   :lcc-lr/hasTag "SGSI",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Singapore,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "SGSI"})

(def SILJ
  "the FpML business center code for Ljubljana, Slovenia"
  {:db/ident :fibo-fbc-fct-bci/SILJ,
   :dcterms/description "the FpML business center code for Ljubljana, Slovenia",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Ljubljana,
   :lcc-lr/hasTag "SILJ",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Ljubljana,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "SILJ"})

(def SKBR
  "the FpML business center code for Bratislava, Slovakia"
  {:db/ident :fibo-fbc-fct-bci/SKBR,
   :dcterms/description
   "the FpML business center code for Bratislava, Slovakia",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Bratislava,
   :lcc-lr/hasTag "SKBR",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Bratislava,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "SKBR"})

(def SNDA
  "the FpML business center code for Dakar, Senegal"
  {:db/ident :fibo-fbc-fct-bci/SNDA,
   :dcterms/description "the FpML business center code for Dakar, Senegal",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Dakar,
   :lcc-lr/hasTag "SNDA",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Dakar,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "SNDA"})

(def SVSS
  "the FpML business center code for San Salvador, El Salvador"
  {:db/ident :fibo-fbc-fct-bci/SVSS,
   :dcterms/description
   "the FpML business center code for San Salvador, El Salvador",
   :lcc-lr/denotes :fibo-fbc-fct-bci/San_Salvador,
   :lcc-lr/hasTag "SVSS",
   :lcc-lr/identifies :fibo-fbc-fct-bci/San_Salvador,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "SVSS"})

(def Sabadell
  "Sabadell"
  {:db/ident :fibo-fbc-fct-bci/Sabadell,
   :lcc-cr/isPartOf :lcc-3166-1/Spain,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Sabadell"})

(def Sacramento
  "the international business center of Sacramento"
  {:db/ident :fibo-fbc-fct-bci/Sacramento,
   :dcterms/description "the international business center of Sacramento",
   :lcc-cr/isPartOf [:lcc-3166-2-us/California
                     :lcc-3166-1/UnitedStatesOfAmerica],
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Sacramento"})

(def Saint-Petersburg
  "Saint Petersburg"
  {:db/ident :fibo-fbc-fct-bci/Saint-Petersburg,
   :fibo-fnd-utl-av/synonym "St. Petersburg",
   :lcc-cr/isPartOf :lcc-3166-1/RussianFederation,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Saint Petersburg"})

(def Saint_Peter_Port
  "the international business center of Saint Peter Port"
  {:db/ident :fibo-fbc-fct-bci/Saint_Peter_Port,
   :dcterms/description "the international business center of Saint Peter Port",
   :fibo-fnd-utl-av/synonym "St. Peter Port",
   :lcc-cr/isPartOf :lcc-3166-1/Guernsey,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Saint Peter Port"})

(def Salzburg
  "Salzburg"
  {:db/ident :fibo-fbc-fct-bci/Salzburg,
   :lcc-cr/isPartOf :lcc-3166-1/Austria,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Salzburg"})

(def Samara
  "Samara"
  {:db/ident :fibo-fbc-fct-bci/Samara,
   :lcc-cr/isPartOf :lcc-3166-1/RussianFederation,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Samara"})

(def SanPedroSula
  "San Pedro Sula"
  {:db/ident :fibo-fbc-fct-bci/SanPedroSula,
   :lcc-cr/isPartOf :lcc-3166-1/Honduras,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "San Pedro Sula"})

(def San_Carlos
  "San Carlos"
  {:db/ident :fibo-fbc-fct-bci/San_Carlos,
   :lcc-cr/isPartOf [:lcc-3166-2-us/California
                     :lcc-3166-1/UnitedStatesOfAmerica],
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "San Carlos"})

(def San_Francisco
  "San Francisco"
  {:db/ident :fibo-fbc-fct-bci/San_Francisco,
   :lcc-cr/isPartOf [:lcc-3166-2-us/California
                     :lcc-3166-1/UnitedStatesOfAmerica],
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "San Francisco"})

(def San_Jose
  "the international business center of San Jose"
  {:db/ident :fibo-fbc-fct-bci/San_Jose,
   :dcterms/description "the international business center of San Jose",
   :lcc-cr/isPartOf :lcc-3166-1/CostaRica,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "San Jose"})

(def San_Juan
  "the international business center of San Juan"
  {:db/ident :fibo-fbc-fct-bci/San_Juan,
   :dcterms/description "the international business center of San Juan",
   :lcc-cr/isPartOf :lcc-3166-1/PuertoRico,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "San Juan"})

(def San_Salvador
  "the international business center of San Salvador"
  {:db/ident :fibo-fbc-fct-bci/San_Salvador,
   :dcterms/description "the international business center of San Salvador",
   :lcc-cr/isPartOf :lcc-3166-1/ElSalvador,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "San Salvador"})

(def Santa_Fe
  "Santa Fe"
  {:db/ident :fibo-fbc-fct-bci/Santa_Fe,
   :lcc-cr/isPartOf :lcc-3166-1/Argentina,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Santa Fe"})

(def Santander
  "Santander"
  {:db/ident :fibo-fbc-fct-bci/Santander,
   :lcc-cr/isPartOf :lcc-3166-1/Spain,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Santander"})

(def Santiago
  "the international business center of Santiago"
  {:db/ident :fibo-fbc-fct-bci/Santiago,
   :dcterms/description "the international business center of Santiago",
   :lcc-cr/isPartOf :lcc-3166-1/Chile,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Santiago"})

(def Santo_Domingo
  "the international business center of Santo Domingo"
  {:db/ident :fibo-fbc-fct-bci/Santo_Domingo,
   :dcterms/description "the international business center of Santo Domingo",
   :lcc-cr/isPartOf :lcc-3166-1/DominicanRepublic,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Santo Domingo"})

(def Sao_Paulo
  "the international business center of Sao Paulo"
  {:db/ident :fibo-fbc-fct-bci/Sao_Paulo,
   :dcterms/description "the international business center of Sao Paulo",
   :lcc-cr/isPartOf :lcc-3166-1/Brazil,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Sao Paulo"})

(def Sapporo
  "Sapporo"
  {:db/ident :fibo-fbc-fct-bci/Sapporo,
   :lcc-cr/isPartOf :lcc-3166-1/Japan,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Sapporo"})

(def Sarajevo
  "Sarajevo"
  {:db/ident :fibo-fbc-fct-bci/Sarajevo,
   :lcc-cr/isPartOf :lcc-3166-1/BosniaAndHerzegovina,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Sarajevo"})

(def Schwerin
  "Schwerin"
  {:db/ident :fibo-fbc-fct-bci/Schwerin,
   :lcc-cr/isPartOf :lcc-3166-1/Germany,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Schwerin"})

(def SeaGirt
  "Sea Girt"
  {:db/ident :fibo-fbc-fct-bci/SeaGirt,
   :lcc-cr/isPartOf :lcc-3166-1/UnitedStatesOfAmerica,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Sea Girt"})

(def Seattle
  "the international business center of Seattle"
  {:db/ident :fibo-fbc-fct-bci/Seattle,
   :dcterms/description "the international business center of Seattle",
   :lcc-cr/isPartOf [:lcc-3166-2-us/Washington
                     :lcc-3166-1/UnitedStatesOfAmerica],
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Seattle"})

(def Seoul
  "the international business center of Seoul"
  {:db/ident :fibo-fbc-fct-bci/Seoul,
   :dcterms/description "the international business center of Seoul",
   :lcc-cr/isPartOf :lcc-3166-1/KoreaRepublicOf,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Seoul"})

(def Shanghai
  "the international business center of Shanghai"
  {:db/ident :fibo-fbc-fct-bci/Shanghai,
   :dcterms/description "the international business center of Shanghai",
   :lcc-cr/isPartOf :lcc-3166-1/China,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Shanghai"})

(def Shenzhen
  "Shenzhen"
  {:db/ident :fibo-fbc-fct-bci/Shenzhen,
   :lcc-cr/isPartOf :lcc-3166-1/China,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Shenzhen"})

(def Shimonoseki
  "Shimonoseki"
  {:db/ident :fibo-fbc-fct-bci/Shimonoseki,
   :lcc-cr/isPartOf :lcc-3166-1/Japan,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Shimonoseki"})

(def Sibiu
  "Sibiu"
  {:db/ident :fibo-fbc-fct-bci/Sibiu,
   :lcc-cr/isPartOf :lcc-3166-1/Romania,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Sibiu"})

(def Silkeborg
  "Silkeborg"
  {:db/ident :fibo-fbc-fct-bci/Silkeborg,
   :lcc-cr/isPartOf :lcc-3166-1/Denmark,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Silkeborg"})

(def Singapore
  "the international business center of Singapore"
  {:db/ident :fibo-fbc-fct-bci/Singapore,
   :dcterms/description "the international business center of Singapore",
   :lcc-cr/isPartOf :lcc-3166-1/Singapore,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Singapore"})

(def Skopje
  "Skopje"
  {:db/ident :fibo-fbc-fct-bci/Skopje,
   :lcc-cr/isPartOf :lcc-3166-1/Macedonia,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Skopje"})

(def Sliema
  "Sliema"
  {:db/ident :fibo-fbc-fct-bci/Sliema,
   :lcc-cr/isPartOf :lcc-3166-1/Malta,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Sliema"})

(def Sofia
  "the international business center of Sofia"
  {:db/ident :fibo-fbc-fct-bci/Sofia,
   :dcterms/description "the international business center of Sofia",
   :lcc-cr/isPartOf :lcc-3166-1/Bulgaria,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Sofia"})

(def Split
  "Split"
  {:db/ident :fibo-fbc-fct-bci/Split,
   :lcc-cr/isPartOf :lcc-3166-1/Croatia,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Split"})

(def St_Albans
  "St. Albans"
  {:db/ident :fibo-fbc-fct-bci/St_Albans,
   :lcc-cr/isPartOf :lcc-3166-1/UnitedKingdomOfGreatBritainAndNorthernIreland,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "St. Albans"})

(def St_Helier
  "the international business center of St. Helier"
  {:db/ident :fibo-fbc-fct-bci/St_Helier,
   :dcterms/description "the international business center of St. Helier",
   :lcc-cr/isPartOf :lcc-3166-1/Jersey,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "St. Helier"})

(def St_John
  "St. John"
  {:db/ident :fibo-fbc-fct-bci/St_John,
   :lcc-cr/isPartOf :lcc-3166-1/AntiguaAndBarbuda,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "St. John"})

(def Stamford
  "Stamford"
  {:db/ident :fibo-fbc-fct-bci/Stamford,
   :lcc-cr/isPartOf [:lcc-3166-2-us/Connecticut
                     :lcc-3166-1/UnitedStatesOfAmerica],
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Stamford"})

(def Stockholm
  "the international business center of Stockholm"
  {:db/ident :fibo-fbc-fct-bci/Stockholm,
   :dcterms/description "the international business center of Stockholm",
   :lcc-cr/isPartOf :lcc-3166-1/Sweden,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Stockholm"})

(def Stuttgart
  "the international business center of Stuttgart"
  {:db/ident :fibo-fbc-fct-bci/Stuttgart,
   :dcterms/description "the international business center of Stuttgart",
   :lcc-cr/isPartOf :lcc-3166-1/Germany,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Stuttgart"})

(def Summit
  "Summit"
  {:db/ident :fibo-fbc-fct-bci/Summit,
   :lcc-cr/isPartOf [:lcc-3166-2-us/NewJersey
                     :lcc-3166-1/UnitedStatesOfAmerica],
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Summit"})

(def Surabaya
  "Surabaya"
  {:db/ident :fibo-fbc-fct-bci/Surabaya,
   :lcc-cr/isPartOf :lcc-3166-1/Indonesia,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Surabaya"})

(def Suva
  "Suva"
  {:db/ident :fibo-fbc-fct-bci/Suva,
   :lcc-cr/isPartOf :lcc-3166-1/Fiji,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Suva"})

(def Sydney
  "the international business center of Sydney"
  {:db/ident :fibo-fbc-fct-bci/Sydney,
   :dcterms/description "the international business center of Sydney",
   :lcc-cr/isPartOf :lcc-3166-1/Australia,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Sydney"})

(def TARGETSettlementDay
  "the business day adjustment convention for the TARGET (euro 'Business Center')"
  {:db/ident :fibo-fbc-fct-bci/TARGETSettlementDay,
   :dcterms/description
   "the business day adjustment convention for the TARGET (euro 'Business Center')",
   :fibo-fnd-plc-loc/hasBusinessCenter [:fibo-fbc-fct-bci/Rome
                                        :fibo-fbc-fct-bci/Luxembourg
                                        :fibo-fbc-fct-bci/Dublin
                                        :fibo-fbc-fct-bci/Lisbon
                                        :fibo-fbc-fct-bci/Paris
                                        :fibo-fbc-fct-bci/Amsterdam
                                        :fibo-fbc-fct-bci/Vienna
                                        :fibo-fbc-fct-bci/Madrid
                                        :fibo-fbc-fct-bci/Brussels
                                        :fibo-fbc-fct-bci/Athens
                                        :fibo-fbc-fct-bci/Frankfurt
                                        :fibo-fbc-fct-bci/Helsinki],
   :fibo-fnd-utl-av/explanatoryNote
   "TARGET, which stands for the Trans-European Automated Real-time Gross settlement adjustment Express Transfer system, is the real-time gross settlement (RTGS) system for the euro. TARGET operating days are the settlement days for the financial markets in euro, as well as foreign exchange transactions involving the euro.",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-dt-bd/BusinessDayAdjustment],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "TARGET Settlement Day"})

(def THBA
  "the FpML business center code for Bangkok, Thailand"
  {:db/ident :fibo-fbc-fct-bci/THBA,
   :dcterms/description "the FpML business center code for Bangkok, Thailand",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Bangkok,
   :lcc-lr/hasTag "THBA",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Bangkok,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "THBA"})

(def TNTU
  "the FpML business center code for Tunis, Tunisia"
  {:db/ident :fibo-fbc-fct-bci/TNTU,
   :dcterms/description "the FpML business center code for Tunis, Tunisia",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Tunis,
   :lcc-lr/hasTag "TNTU",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Tunis,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "TNTU"})

(def TRAN
  "the FpML business center code for Ankara, Turkey"
  {:db/ident :fibo-fbc-fct-bci/TRAN,
   :dcterms/description "the FpML business center code for Ankara, Turkey",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Ankara,
   :lcc-lr/hasTag "TRAN",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Ankara,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "TRAN"})

(def TRIS
  "the FpML business center code for Istanbul, Turkey"
  {:db/ident :fibo-fbc-fct-bci/TRIS,
   :dcterms/description "the FpML business center code for Istanbul, Turkey",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Istanbul,
   :lcc-lr/hasTag "TRIS",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Istanbul,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "TRIS"})

(def TTPS
  "the FpML business center code for Port of Spain, Trinidad and Tobago"
  {:db/ident :fibo-fbc-fct-bci/TTPS,
   :dcterms/description
   "the FpML business center code for Port of Spain, Trinidad and Tobago",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Port_of_Spain,
   :lcc-lr/hasTag "TTPS",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Port_of_Spain,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "TTPS"})

(def TWTA
  "the FpML business center code for Taipei, Taiwan"
  {:db/ident :fibo-fbc-fct-bci/TWTA,
   :dcterms/description "the FpML business center code for Taipei, Taiwan",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Taipei,
   :lcc-lr/hasTag "TWTA",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Taipei,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "TWTA"})

(def TZDA
  "the FpML business center code for Dar es Salaam, Tanzania"
  {:db/ident :fibo-fbc-fct-bci/TZDA,
   :dcterms/description
   "the FpML business center code for Dar es Salaam, Tanzania",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Dar_es_Salaam,
   :lcc-lr/hasTag "TZDA",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Dar_es_Salaam,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "TZDA"})

(def TZDO
  "the FpML business center code for Dodoma, Tanzania"
  {:db/ident :fibo-fbc-fct-bci/TZDO,
   :dcterms/description "the FpML business center code for Dodoma, Tanzania",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Dodoma,
   :lcc-lr/hasTag "TZDO",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Dodoma,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "TZDO"})

(def Taipei
  "the international business center of Taipei"
  {:db/ident :fibo-fbc-fct-bci/Taipei,
   :dcterms/description "the international business center of Taipei",
   :lcc-cr/isPartOf :lcc-3166-1/Taiwan,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Taipei"})

(def Taiwan
  "Taiwan"
  {:db/ident :fibo-fbc-fct-bci/Taiwan,
   :lcc-cr/isPartOf :lcc-3166-1/Taiwan,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Taiwan"})

(def Tallinn
  "the international business center of Tallinn"
  {:db/ident :fibo-fbc-fct-bci/Tallinn,
   :dcterms/description "the international business center of Tallinn",
   :lcc-cr/isPartOf :lcc-3166-1/Estonia,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Tallinn"})

(def Tashkent
  "Tashkent"
  {:db/ident :fibo-fbc-fct-bci/Tashkent,
   :lcc-cr/isPartOf :lcc-3166-1/Uzbekistan,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Tashkent"})

(def Tbilisi
  "the international business center of Tbilisi"
  {:db/ident :fibo-fbc-fct-bci/Tbilisi,
   :dcterms/description "the international business center of Tbilisi",
   :lcc-cr/isPartOf :lcc-3166-1/Georgia,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Tbilisi"})

(def Tegucigalpa
  "the international business center of Tegucigalpa"
  {:db/ident :fibo-fbc-fct-bci/Tegucigalpa,
   :dcterms/description "the international business center of Tegucigalpa",
   :lcc-cr/isPartOf :lcc-3166-1/Honduras,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Tegucigalpa"})

(def Tehran
  "the international business center of Tehran"
  {:db/ident :fibo-fbc-fct-bci/Tehran,
   :dcterms/description "the international business center of Tehran",
   :lcc-cr/isPartOf :lcc-3166-1/Iran,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Tehran"})

(def Tel_Aviv
  "the international business center of Tel Aviv"
  {:db/ident :fibo-fbc-fct-bci/Tel_Aviv,
   :dcterms/description "the international business center of Tel Aviv",
   :lcc-cr/isPartOf :lcc-3166-1/Israel,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Tel Aviv"})

(def TheWoodlands
  "The Woodlands"
  {:db/ident :fibo-fbc-fct-bci/TheWoodlands,
   :lcc-cr/isPartOf [:lcc-3166-2-us/Texas :lcc-3166-1/UnitedStatesOfAmerica],
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "The Woodlands"})

(def The_Hague
  "The Hague"
  {:db/ident :fibo-fbc-fct-bci/The_Hague,
   :lcc-cr/isPartOf :lcc-3166-1/Netherlands,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "The Hague"})

(def Tirana
  "Tirana"
  {:db/ident :fibo-fbc-fct-bci/Tirana,
   :lcc-cr/isPartOf :lcc-3166-1/Albania,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Tirana"})

(def Tokyo
  "the international business center of Tokyo"
  {:db/ident :fibo-fbc-fct-bci/Tokyo,
   :dcterms/description "the international business center of Tokyo",
   :lcc-cr/isPartOf :lcc-3166-1/Japan,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Tokyo"})

(def Toronto
  "the international business center of Toronto"
  {:db/ident :fibo-fbc-fct-bci/Toronto,
   :dcterms/description "the international business center of Toronto",
   :lcc-cr/isPartOf :lcc-3166-1/Canada,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Toronto"})

(def Torshavn
  "Torshavn"
  {:db/ident :fibo-fbc-fct-bci/Torshavn,
   :lcc-cr/isPartOf :lcc-3166-1/FaroeIslands,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Torshavn"})

(def Triesen
  "Triesen"
  {:db/ident :fibo-fbc-fct-bci/Triesen,
   :lcc-cr/isPartOf :lcc-3166-1/Liechtenstein,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Triesen"})

(def Tripoli
  "Tripoli"
  {:db/ident :fibo-fbc-fct-bci/Tripoli,
   :lcc-cr/isPartOf :lcc-3166-1/Libya,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Tripoli"})

(def Tromso
  "Tromso"
  {:db/ident :fibo-fbc-fct-bci/Tromso,
   :lcc-cr/isPartOf :lcc-3166-1/Norway,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Tromso"})

(def Trondheim
  "Trondheim"
  {:db/ident :fibo-fbc-fct-bci/Trondheim,
   :lcc-cr/isPartOf :lcc-3166-1/Norway,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Trondheim"})

(def Tucuman
  "Tucuman"
  {:db/ident :fibo-fbc-fct-bci/Tucuman,
   :lcc-cr/isPartOf :lcc-3166-1/Argentina,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Tucuman"})

(def Tunis
  "the international business center of Tunis"
  {:db/ident :fibo-fbc-fct-bci/Tunis,
   :dcterms/description "the international business center of Tunis",
   :lcc-cr/isPartOf :lcc-3166-1/Tunisia,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Tunis"})

(def Turin
  "the international business center of Turin"
  {:db/ident :fibo-fbc-fct-bci/Turin,
   :dcterms/description "the international business center of Turin",
   :lcc-cr/isPartOf :lcc-3166-1/Italy,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Turin"})

(def UAKI
  "the FpML business center code for Kiev, Ukraine"
  {:db/ident :fibo-fbc-fct-bci/UAKI,
   :dcterms/description "the FpML business center code for Kiev, Ukraine",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Kiev,
   :lcc-lr/hasTag "UAKI",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Kiev,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "UAKI"})

(def UGKA
  "the FpML business center code for Kampala, Uganda"
  {:db/ident :fibo-fbc-fct-bci/UGKA,
   :dcterms/description "the FpML business center code for Kampala, Uganda",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Kampala,
   :lcc-lr/hasTag "UGKA",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Kampala,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "UGKA"})

(def USBO
  "the FpML business center code for Boston, Massachusetts, United States"
  {:db/ident :fibo-fbc-fct-bci/USBO,
   :dcterms/description
   "the FpML business center code for Boston, Massachusetts, United States",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Boston,
   :lcc-lr/hasTag "USBO",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Boston,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "USBO"})

(def USCH
  "the FpML business center code for Chicago, United States"
  {:db/ident :fibo-fbc-fct-bci/USCH,
   :dcterms/description
   "the FpML business center code for Chicago, United States",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Chicago,
   :lcc-lr/hasTag "USCH",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Chicago,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "USCH"})

(def USCR
  "the FpML business center code for Charlotte, North Carolina, United States"
  {:db/ident :fibo-fbc-fct-bci/USCR,
   :dcterms/description
   "the FpML business center code for Charlotte, North Carolina, United States",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Charlotte,
   :lcc-lr/hasTag "USCR",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Charlotte,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "USCR"})

(def USDC
  "the FpML business center code for Washington, District of Columbia, United States"
  {:db/ident :fibo-fbc-fct-bci/USDC,
   :dcterms/description
   "the FpML business center code for Washington, District of Columbia, United States",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Washington,
   :lcc-lr/hasTag "USDC",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Washington,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "USDC"})

(def USDN
  "the FpML business center code for Denver, United States"
  {:db/ident :fibo-fbc-fct-bci/USDN,
   :dcterms/description
   "the FpML business center code for Denver, United States",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Denver,
   :lcc-lr/hasTag "USDN",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Denver,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "USDN"})

(def USDT
  "the FpML business center code for Detroit, Michigan, United States"
  {:db/ident :fibo-fbc-fct-bci/USDT,
   :dcterms/description
   "the FpML business center code for Detroit, Michigan, United States",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Detroit,
   :lcc-lr/hasTag "USDT",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Detroit,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "USDT"})

(def USGS
  "the FpML business center code for the U.S. Government Securities Business Day (as defined in 2006 ISDA Definitions Section 1.11 and 2000 ISDA Definitions Section 1.11)"
  {:db/ident :fibo-fbc-fct-bci/USGS,
   :dcterms/description
   "the FpML business center code for the U.S. Government Securities Business Day (as defined in 2006 ISDA Definitions Section 1.11 and 2000 ISDA Definitions Section 1.11)",
   :lcc-lr/denotes :fibo-fbc-fct-bci/USGovernmentSecuritiesBusinessDay,
   :lcc-lr/hasTag "USGS",
   :lcc-lr/identifies :fibo-fbc-fct-bci/USGovernmentSecuritiesBusinessDay,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessDayAdjustmentCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "USGS"})

(def USGovernmentSecuritiesBusinessDay
  "the business day adjustment convention for U.S. Government Securities"
  {:db/ident :fibo-fbc-fct-bci/USGovernmentSecuritiesBusinessDay,
   :dcterms/description
   "the business day adjustment convention for U.S. Government Securities",
   :fibo-fnd-plc-loc/hasBusinessCenter :fibo-fbc-fct-bci/Washington,
   :rdf/type [:fibo-fnd-dt-bd/BusinessDayAdjustment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "U.S. Government Securities Business Day"})

(def USHL
  "the FpML business center code for Honolulu, Hawaii, United States"
  {:db/ident :fibo-fbc-fct-bci/USHL,
   :dcterms/description
   "the FpML business center code for Honolulu, Hawaii, United States",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Honolulu,
   :lcc-lr/hasTag "USHL",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Honolulu,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "USHL"})

(def USHO
  "the FpML business center code for Houston, United States"
  {:db/ident :fibo-fbc-fct-bci/USHO,
   :dcterms/description
   "the FpML business center code for Houston, United States",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Houston,
   :lcc-lr/hasTag "USHO",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Houston,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "USHO"})

(def USLA
  "the FpML business center code for Los Angeles, United States"
  {:db/ident :fibo-fbc-fct-bci/USLA,
   :dcterms/description
   "the FpML business center code for Los Angeles, United States",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Los_Angeles,
   :lcc-lr/hasTag "USLA",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Los_Angeles,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "USLA"})

(def USMB
  "the FpML business center code for Mobile, Alabama, United States"
  {:db/ident :fibo-fbc-fct-bci/USMB,
   :dcterms/description
   "the FpML business center code for Mobile, Alabama, United States",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Mobile,
   :lcc-lr/hasTag "USMB",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Mobile,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "USMB"})

(def USMN
  "the FpML business center code for Minneapolis, United States"
  {:db/ident :fibo-fbc-fct-bci/USMN,
   :dcterms/description
   "the FpML business center code for Minneapolis, United States",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Minneapolis,
   :lcc-lr/hasTag "USMN",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Minneapolis,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "USMN"})

(def USNY
  "the FpML business center code for New York, United States"
  {:db/ident :fibo-fbc-fct-bci/USNY,
   :dcterms/description
   "the FpML business center code for New York, United States",
   :lcc-lr/denotes :fibo-fbc-fct-bci/New_York,
   :lcc-lr/hasTag "USNY",
   :lcc-lr/identifies :fibo-fbc-fct-bci/New_York,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "USNY"})

(def USPO
  "the FpML business center code for Portland, Oregon, United States"
  {:db/ident :fibo-fbc-fct-bci/USPO,
   :dcterms/description
   "the FpML business center code for Portland, Oregon, United States",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Portland,
   :lcc-lr/hasTag "USPO",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Portland,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "USPO"})

(def USSA
  "the FpML business center code for Sacramento, California, United States"
  {:db/ident :fibo-fbc-fct-bci/USSA,
   :dcterms/description
   "the FpML business center code for Sacramento, California, United States",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Sacramento,
   :lcc-lr/hasTag "USSA",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Sacramento,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "USSA"})

(def USSE
  "the FpML business center code for Seattle, United States"
  {:db/ident :fibo-fbc-fct-bci/USSE,
   :dcterms/description
   "the FpML business center code for Seattle, United States",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Seattle,
   :lcc-lr/hasTag "USSE",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Seattle,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "USSE"})

(def USWT
  "the FpML business center code for Wichita, United States"
  {:db/ident :fibo-fbc-fct-bci/USWT,
   :dcterms/description
   "the FpML business center code for Wichita, United States",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Wichita,
   :lcc-lr/hasTag "USWT",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Wichita,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "USWT"})

(def UYMO
  "the FpML business center code for Montevideo, Uruguay"
  {:db/ident :fibo-fbc-fct-bci/UYMO,
   :dcterms/description "the FpML business center code for Montevideo, Uruguay",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Montevideo,
   :lcc-lr/hasTag "UYMO",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Montevideo,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "UYMO"})

(def Ulaan_Baatar
  "Ulaan Baatar"
  {:db/ident :fibo-fbc-fct-bci/Ulaan_Baatar,
   :lcc-cr/isPartOf :lcc-3166-1/Mongolia,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Ulaan Baatar"})

(def Unterschleisshem
  "Unterschleisshem"
  {:db/ident :fibo-fbc-fct-bci/Unterschleisshem,
   :lcc-cr/isPartOf :lcc-3166-1/Germany,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Unterschleisshem"})

(def Utrecht
  "Utrecht"
  {:db/ident :fibo-fbc-fct-bci/Utrecht,
   :lcc-cr/isPartOf :lcc-3166-1/Netherlands,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Utrecht"})

(def VECA
  "the FpML business center code for Caracas, Venezuela"
  {:db/ident :fibo-fbc-fct-bci/VECA,
   :dcterms/description "the FpML business center code for Caracas, Venezuela",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Caracas,
   :lcc-lr/hasTag "VECA",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Caracas,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "VECA"})

(def VGRT
  "the FpML business center code for Road Town, Virgin Islands (British)"
  {:db/ident :fibo-fbc-fct-bci/VGRT,
   :dcterms/description
   "the FpML business center code for Road Town, Virgin Islands (British)",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Road_Town,
   :lcc-lr/hasTag "VGRT",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Road_Town,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "VGRT"})

(def VNHA
  "the FpML business center code for Hanoi, Vietnam"
  {:db/ident :fibo-fbc-fct-bci/VNHA,
   :dcterms/description "the FpML business center code for Hanoi, Vietnam",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Hanoi,
   :lcc-lr/hasTag "VNHA",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Hanoi,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "VNHA"})

(def VNHC
  "the FpML business center code for Ho Chi Minh (formerly Saigon), Vietnam"
  {:db/ident :fibo-fbc-fct-bci/VNHC,
   :dcterms/description
   "the FpML business center code for Ho Chi Minh (formerly Saigon), Vietnam",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Ho_Chi_Minh,
   :lcc-lr/hasTag "VNHC",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Ho_Chi_Minh,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "VNHC"})

(def Vaduz
  "Vaduz"
  {:db/ident :fibo-fbc-fct-bci/Vaduz,
   :lcc-cr/isPartOf :lcc-3166-1/Liechtenstein,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Vaduz"})

(def Valencia
  "Valencia"
  {:db/ident :fibo-fbc-fct-bci/Valencia,
   :lcc-cr/isPartOf :lcc-3166-1/Spain,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Valencia"})

(def Valletta
  "the international business center of Valletta"
  {:db/ident :fibo-fbc-fct-bci/Valletta,
   :dcterms/description "the international business center of Valletta",
   :lcc-cr/isPartOf :lcc-3166-1/Malta,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Valletta"})

(def Valparaiso
  "Valparaiso"
  {:db/ident :fibo-fbc-fct-bci/Valparaiso,
   :lcc-cr/isPartOf :lcc-3166-1/Chile,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Valparaiso"})

(def Vancouver
  "the international business center of Vancouver"
  {:db/ident :fibo-fbc-fct-bci/Vancouver,
   :dcterms/description "the international business center of Vancouver",
   :lcc-cr/isPartOf :lcc-3166-1/Canada,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Vancouver"})

(def Varazdin
  "Varazdin"
  {:db/ident :fibo-fbc-fct-bci/Varazdin,
   :lcc-cr/isPartOf :lcc-3166-1/Croatia,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Varazdin"})

(def Victoria
  "Victoria"
  {:db/ident :fibo-fbc-fct-bci/Victoria,
   :lcc-cr/isPartOf :lcc-3166-1/Seychelles,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Victoria"})

(def Victoria_Falls
  "Victoria Falls"
  {:db/ident :fibo-fbc-fct-bci/Victoria_Falls,
   :lcc-cr/isPartOf :lcc-3166-1/Zimbabwe,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Victoria Falls"})

(def Vienna
  "the international business center of Vienna"
  {:db/ident :fibo-fbc-fct-bci/Vienna,
   :dcterms/description "the international business center of Vienna",
   :lcc-cr/isPartOf :lcc-3166-1/Austria,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Vienna"})

(def Vilnius
  "Vilnius"
  {:db/ident :fibo-fbc-fct-bci/Vilnius,
   :lcc-cr/isPartOf :lcc-3166-1/Lithuania,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Vilnius"})

(def Vladivostok
  "Vladivostok"
  {:db/ident :fibo-fbc-fct-bci/Vladivostok,
   :lcc-cr/isPartOf :lcc-3166-1/RussianFederation,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Vladivostok"})

(def Warsaw
  "the international business center of Warsaw"
  {:db/ident :fibo-fbc-fct-bci/Warsaw,
   :dcterms/description "the international business center of Warsaw",
   :lcc-cr/isPartOf :lcc-3166-1/Poland,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Warsaw"})

(def Warszawa
  "Warszawa"
  {:db/ident :fibo-fbc-fct-bci/Warszawa,
   :lcc-cr/isPartOf :lcc-3166-1/Poland,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Warszawa"})

(def Washington
  "the international business center of Washington"
  {:db/ident :fibo-fbc-fct-bci/Washington,
   :dcterms/description "the international business center of Washington",
   :lcc-cr/isPartOf [:lcc-3166-2-us/DistrictOfColumbia
                     :lcc-3166-1/UnitedStatesOfAmerica],
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Washington"})

(def Washington_New_York
  "Washington, New York"
  {:db/ident :fibo-fbc-fct-bci/Washington_New_York,
   :lcc-cr/isPartOf [:lcc-3166-2-us/NewYork :lcc-3166-1/UnitedStatesOfAmerica],
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Washington, New York"})

(def Wellington
  "the international business center of Wellington"
  {:db/ident :fibo-fbc-fct-bci/Wellington,
   :dcterms/description "the international business center of Wellington",
   :lcc-cr/isPartOf :lcc-3166-1/NewZealand,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Wellington"})

(def Wichita
  "the international business center of Wichita"
  {:db/ident :fibo-fbc-fct-bci/Wichita,
   :dcterms/description "the international business center of Wichita",
   :lcc-cr/isPartOf [:lcc-3166-2-us/Kansas :lcc-3166-1/UnitedStatesOfAmerica],
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Wichita"})

(def Willemstad
  "Willemstad"
  {:db/ident :fibo-fbc-fct-bci/Willemstad,
   :lcc-cr/isPartOf :lcc-3166-1/Curacao,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Willemstad"})

(def Wilmington
  "Wilmington"
  {:db/ident :fibo-fbc-fct-bci/Wilmington,
   :lcc-cr/isPartOf [:lcc-3166-2-us/Delaware :lcc-3166-1/UnitedStatesOfAmerica],
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Wilmington"})

(def Windhoek
  "the international business center of Windhoek"
  {:db/ident :fibo-fbc-fct-bci/Windhoek,
   :dcterms/description "the international business center of Windhoek",
   :lcc-cr/isPartOf :lcc-3166-1/Namibia,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Windhoek"})

(def Winnipeg
  "the international business center of Winnipeg"
  {:db/ident :fibo-fbc-fct-bci/Winnipeg,
   :dcterms/description "the international business center of Winnipeg",
   :lcc-cr/isPartOf :lcc-3166-1/Canada,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Winnipeg"})

(def WinterPark
  "Winter Park"
  {:db/ident :fibo-fbc-fct-bci/WinterPark,
   :lcc-cr/isPartOf :lcc-3166-1/UnitedStatesOfAmerica,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Winter Park"})

(def Wroclaw
  "Wroclaw"
  {:db/ident :fibo-fbc-fct-bci/Wroclaw,
   :lcc-cr/isPartOf :lcc-3166-1/Poland,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Wroclaw"})

(def Wuxi
  "Wuxi"
  {:db/ident :fibo-fbc-fct-bci/Wuxi,
   :lcc-cr/isPartOf :lcc-3166-1/China,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Wuxi"})

(def YEAD
  "the FpML business center code for Aden, Yemen"
  {:db/ident :fibo-fbc-fct-bci/YEAD,
   :dcterms/description "the FpML business center code for Aden, Yemen",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Aden,
   :lcc-lr/hasTag "YEAD",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Aden,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "YEAD"})

(def Yerevan
  "the international business center of Yerevan"
  {:db/ident :fibo-fbc-fct-bci/Yerevan,
   :dcterms/description "the international business center of Yerevan",
   :lcc-cr/isPartOf :lcc-3166-1/Armenia,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Yerevan"})

(def ZAJO
  "the FpML business center code for Johannesburg, South Africa"
  {:db/ident :fibo-fbc-fct-bci/ZAJO,
   :dcterms/description
   "the FpML business center code for Johannesburg, South Africa",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Johannesburg,
   :lcc-lr/hasTag "ZAJO",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Johannesburg,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "ZAJO"})

(def ZMLU
  "the FpML business center code for Lusaka, Zambia"
  {:db/ident :fibo-fbc-fct-bci/ZMLU,
   :dcterms/description "the FpML business center code for Lusaka, Zambia",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Lusaka,
   :lcc-lr/hasTag "ZMLU",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Lusaka,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "ZMLU"})

(def ZWHA
  "the FpML business center code for Harare, Zimbabwe"
  {:db/ident :fibo-fbc-fct-bci/ZWHA,
   :dcterms/description "the FpML business center code for Harare, Zimbabwe",
   :lcc-lr/denotes :fibo-fbc-fct-bci/Harare,
   :lcc-lr/hasTag "ZWHA",
   :lcc-lr/identifies :fibo-fbc-fct-bci/Harare,
   :lcc-lr/isMemberOf :fibo-fbc-fct-bci/FpMLBusinessCenterCodeScheme,
   :rdf/type [:fibo-fbc-fct-bc/BusinessCenterCode :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "ZWHA"})

(def Zagreb
  "the international business center of Zagreb"
  {:db/ident :fibo-fbc-fct-bci/Zagreb,
   :dcterms/description "the international business center of Zagreb",
   :lcc-cr/isPartOf :lcc-3166-1/Croatia,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Zagreb"})

(def Zaragoza
  "Zaragoza"
  {:db/ident :fibo-fbc-fct-bci/Zaragoza,
   :lcc-cr/isPartOf :lcc-3166-1/Spain,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Zaragoza"})

(def Zhengzhou
  "Zhengzhou"
  {:db/ident :fibo-fbc-fct-bci/Zhengzhou,
   :lcc-cr/isPartOf :lcc-3166-1/China,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Zhengzhou"})

(def Zilina
  "Zilina"
  {:db/ident :fibo-fbc-fct-bci/Zilina,
   :lcc-cr/isPartOf :lcc-3166-1/Slovakia,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Zilina"})

(def Zurich
  "the international business center of Zurich"
  {:db/ident :fibo-fbc-fct-bci/Zurich,
   :dcterms/description "the international business center of Zurich",
   :lcc-cr/isPartOf :lcc-3166-1/Switzerland,
   :rdf/type [:fibo-fnd-plc-loc/BusinessCenter :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "Zurich"})

(def s-Hertogenbosch
  "s'-Hertogenbosch"
  {:db/ident :fibo-fbc-fct-bci/s-Hertogenbosch,
   :lcc-cr/isPartOf :lcc-3166-1/Netherlands,
   :rdf/type [:fibo-fnd-plc-loc/Municipality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfs/label "s'-Hertogenbosch"})