(ns net.wikipunk.rdf.fibo-fnd-plc-uspsai
  "This ontology augments the U.S. Postal Service Address ontology with individuals for various street suffixes, military and U.S. Department of State specific individuals, and preferred designations for state and territory codes."
  {:cmns-av/copyright ["Copyright (c) 2019-2023 EDM Council, Inc."
                       "Copyright (c) 2019-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :dcterms/abstract
   "This ontology augments the U.S. Postal Service Address ontology with individuals for various street suffixes, military and U.S. Department of State specific individuals, and preferred designations for state and territory codes.",
   :dcterms/contributor "Thematix Partners LLC",
   :dcterms/license {:rdfa/uri "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   [{:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/NorthAmerica/USPostalServiceAddresses/"}
    {:rdfa/uri "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}
    {:rdfa/uri "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}
    {:rdfa/uri
     "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CA/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/ContextualDesignators/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Addresses/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/Designators/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/Identifiers/"}
    {:rdfa/uri
     "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-US/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/Classifiers/"}],
   :owl/versionIRI
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-dsg" "https://www.omg.org/spec/Commons/Designators/",
    "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-plc-adr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/",
    "fibo-fnd-plc-uspsai"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "lcc-3166-1"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
    "lcc-3166-2-ca"
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CA/",
    "lcc-3166-2-us"
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-US/",
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fnd-plc-uspsai",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "U.S. Postal Service Addresses Individuals Ontology",
   :rdfs/seeAlso [{:rdfa/uri
                   "https://pe.usps.com/cpim/ftp/pubs/Pub28/pub28.pdf"}
                  {:rdfa/uri "https://about.usps.com/who/profile/"}],
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals.rdf version of this ontology was revised to update a dead link."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."]})

(def AA
  "US-specific code for the state designation for Armed Forces Americas, excluding Canada"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :fibo-fnd-plc-uspsai/ArmedForcesAmericas,
   :cmns-id/identifies :fibo-fnd-plc-uspsai/ArmedForcesAmericas,
   :db/ident :fibo-fnd-plc-uspsai/AA,
   :fibo-fnd-rel-rel/hasTag "AA",
   :fibo-fnd-utl-av/preferredDesignation "AA",
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "AA",
   :skos/definition
   "US-specific code for the state designation for Armed Forces Americas, excluding Canada"})

(def AB
  "Canadian and US-specific code for the designation for Alberta"
  {:cmns-cxtdsg/isUsedBy [:lcc-3166-1/UnitedStatesOfAmerica :lcc-3166-1/Canada],
   :cmns-dsg/denotes :lcc-3166-2-ca/Alberta,
   :cmns-id/identifies :lcc-3166-2-ca/Alberta,
   :db/ident :fibo-fnd-plc-uspsai/AB,
   :fibo-fnd-rel-rel/hasTag "AB",
   :fibo-fnd-utl-av/preferredDesignation "AB",
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "AB",
   :skos/definition
   "Canadian and US-specific code for the designation for Alberta"})

(def AE
  "US-specific code for the state designation for Armed Forces Europe, the Middle East, and Canada"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :fibo-fnd-plc-uspsai/ArmedForcesEurope,
   :cmns-id/identifies :fibo-fnd-plc-uspsai/ArmedForcesEurope,
   :db/ident :fibo-fnd-plc-uspsai/AE,
   :fibo-fnd-rel-rel/hasTag "AE",
   :fibo-fnd-utl-av/preferredDesignation "AE",
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "AE",
   :skos/definition
   "US-specific code for the state designation for Armed Forces Europe, the Middle East, and Canada"})

(def AK
  "US-specific code for the designation for Alaska"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Alaska,
   :cmns-id/identifies :lcc-3166-2-us/Alaska,
   :db/ident :fibo-fnd-plc-uspsai/AK,
   :fibo-fnd-rel-rel/hasTag "AK",
   :fibo-fnd-utl-av/preferredDesignation "AK",
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "AK",
   :skos/definition "US-specific code for the designation for Alaska"})

(def AL
  "US-specific code for the designation for Alabama"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Alabama,
   :cmns-id/identifies :lcc-3166-2-us/Alabama,
   :db/ident :fibo-fnd-plc-uspsai/AL,
   :fibo-fnd-rel-rel/hasTag "AL",
   :fibo-fnd-utl-av/preferredDesignation "AL",
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "AL",
   :skos/definition "US-specific code for the designation for Alabama"})

(def AP
  "US-specific code for the state designation for Armed Forces Pacific"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :fibo-fnd-plc-uspsai/ArmedForcesPacific,
   :cmns-id/identifies :fibo-fnd-plc-uspsai/ArmedForcesPacific,
   :db/ident :fibo-fnd-plc-uspsai/AP,
   :fibo-fnd-rel-rel/hasTag "AP",
   :fibo-fnd-utl-av/preferredDesignation "AP",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "AP",
   :skos/definition
   "US-specific code for the state designation for Armed Forces Pacific"})

(def AR
  "US-specific code for the designation for Arkansas"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Arkansas,
   :cmns-id/identifies :lcc-3166-2-us/Arkansas,
   :db/ident :fibo-fnd-plc-uspsai/AR,
   :fibo-fnd-rel-rel/hasTag "AR",
   :fibo-fnd-utl-av/preferredDesignation "AR",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "AR",
   :skos/definition "US-specific code for the designation for Arkansas"})

(def AS
  "US-specific code for the designation for American Samoa"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/AmericanSamoa,
   :cmns-id/identifies :lcc-3166-2-us/AmericanSamoa,
   :db/ident :fibo-fnd-plc-uspsai/AS,
   :fibo-fnd-rel-rel/hasTag "AS",
   :fibo-fnd-utl-av/preferredDesignation "AS",
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "AS",
   :skos/definition "US-specific code for the designation for American Samoa"})

(def AZ
  "US-specific code for the designation for Arizona"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Arizona,
   :cmns-id/identifies :lcc-3166-2-us/Arizona,
   :db/ident :fibo-fnd-plc-uspsai/AZ,
   :fibo-fnd-rel-rel/hasTag "AZ",
   :fibo-fnd-utl-av/preferredDesignation "AZ",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "AZ",
   :skos/definition "US-specific code for the designation for Arizona"})

(def Alley
  "narrow passageway between or behind buildings"
  {:db/ident :fibo-fnd-plc-uspsai/Alley,
   :fibo-fnd-utl-av/commonDesignation ["ALY" "ALLEE" "ALLEY" "ALLY"],
   :fibo-fnd-utl-av/preferredDesignation "ALY",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/StreetSuffix],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "alley",
   :skos/definition "narrow passageway between or behind buildings"})

(def Annex
  "addition appended to something else, such as another street"
  {:db/ident :fibo-fnd-plc-uspsai/Annex,
   :fibo-fnd-utl-av/commonDesignation ["ANEX" "ANX" "ANNEX" "ANNX"],
   :fibo-fnd-utl-av/preferredDesignation "ANX",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/StreetSuffix],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "annex",
   :skos/definition
   "addition appended to something else, such as another street"})

(def Arcade
  "arched or covered passageway, usually with shops on each side"
  {:db/ident :fibo-fnd-plc-uspsai/Arcade,
   :fibo-fnd-utl-av/commonDesignation ["ARCADE" "ARC"],
   :fibo-fnd-utl-av/preferredDesignation "ARC",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "arcade",
   :skos/definition
   "arched or covered passageway, usually with shops on each side"})

(def ArmedForcesAmericas
  "state designation for Armed Forces Americas, excluding Canada"
  {:cmns-cls/isClassifiedBy :lcc-3166-2-us/State,
   :db/ident :fibo-fnd-plc-uspsai/ArmedForcesAmericas,
   :lcc-cr/hasEnglishShortName #xsd/langString "Armed Forces Americas@en",
   :lcc-cr/isSubregionOf :lcc-3166-1/UnitedStatesOfAmerica,
   :rdf/type [:lcc-cr/CountrySubdivision :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "Armed Forces Americas",
   :skos/definition
   "state designation for Armed Forces Americas, excluding Canada"})

(def ArmedForcesEurope
  "state designation for Armed Forces Europe, the Middle East, and Canada"
  {:cmns-cls/isClassifiedBy :lcc-3166-2-us/State,
   :db/ident :fibo-fnd-plc-uspsai/ArmedForcesEurope,
   :lcc-cr/hasEnglishShortName
   #xsd/langString "Armed Forces Europe, the Middle East, and Canada@en",
   :lcc-cr/isSubregionOf :lcc-3166-1/UnitedStatesOfAmerica,
   :rdf/type [:lcc-cr/CountrySubdivision :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "Armed Forces Europe",
   :skos/definition
   "state designation for Armed Forces Europe, the Middle East, and Canada"})

(def ArmedForcesPacific
  "state designation for Armed Forces Pacific"
  {:cmns-cls/isClassifiedBy :lcc-3166-2-us/State,
   :db/ident :fibo-fnd-plc-uspsai/ArmedForcesPacific,
   :lcc-cr/hasEnglishShortName #xsd/langString "Armed Forces Pacific@en",
   :lcc-cr/isSubregionOf :lcc-3166-1/UnitedStatesOfAmerica,
   :rdf/type [:lcc-cr/CountrySubdivision :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "Armed Forces Pacific",
   :skos/definition "state designation for Armed Forces Pacific"})

(def Avenue
  "broad road in a town or city, typically having trees at regular intervals along its sides"
  {:db/ident :fibo-fnd-plc-uspsai/Avenue,
   :fibo-fnd-utl-av/commonDesignation
   ["AVEN" "AVE" "AVENUE" "AVENU" "AVN" "AV" "AVNUE"],
   :fibo-fnd-utl-av/preferredDesignation "AVE",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/StreetSuffix],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "avenue",
   :skos/definition
   "broad road in a town or city, typically having trees at regular intervals along its sides"})

(def BC
  "Canadian and US-specific code for the designation for British Columbia"
  {:cmns-cxtdsg/isUsedBy [:lcc-3166-1/UnitedStatesOfAmerica :lcc-3166-1/Canada],
   :cmns-dsg/denotes :lcc-3166-2-ca/BritishColumbia,
   :cmns-id/identifies :lcc-3166-2-ca/BritishColumbia,
   :db/ident :fibo-fnd-plc-uspsai/BC,
   :fibo-fnd-rel-rel/hasTag "BC",
   :fibo-fnd-utl-av/preferredDesignation "BC",
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "BC",
   :skos/definition
   "Canadian and US-specific code for the designation for British Columbia"})

(def Bayou
  "creek, secondary watercourse, or minor river that is tributary to another body of water"
  {:db/ident :fibo-fnd-plc-uspsai/Bayou,
   :fibo-fnd-utl-av/commonDesignation ["BAYOU" "BAYOO"],
   :fibo-fnd-utl-av/preferredDesignation "BYU",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "bayou",
   :skos/definition
   "creek, secondary watercourse, or minor river that is tributary to another body of water"})

(def Beach
  "shore of a body of water covered by sand, gravel, or larger rock fragments"
  {:db/ident :fibo-fnd-plc-uspsai/Beach,
   :fibo-fnd-utl-av/commonDesignation ["BEACH" "BCH"],
   :fibo-fnd-utl-av/preferredDesignation "BCH",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "beach",
   :skos/definition
   "shore of a body of water covered by sand, gravel, or larger rock fragments"})

(def Bend
  "curve, especially a sharp one, in a road, river, racecourse, or path"
  {:db/ident :fibo-fnd-plc-uspsai/Bend,
   :fibo-fnd-utl-av/commonDesignation ["BND" "BEND"],
   :fibo-fnd-utl-av/preferredDesignation "BND",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "bend",
   :skos/definition
   "curve, especially a sharp one, in a road, river, racecourse, or path"})

(def Bluff
  "broad, rounded cliff"
  {:db/ident :fibo-fnd-plc-uspsai/Bluff,
   :fibo-fnd-utl-av/commonDesignation ["BLUFF" "BLUF" "BLF"],
   :fibo-fnd-utl-av/preferredDesignation "BLF",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "bluff",
   :skos/definition "broad, rounded cliff"})

(def Bluffs
  "multiple broad, rounded cliffs"
  {:db/ident :fibo-fnd-plc-uspsai/Bluffs,
   :fibo-fnd-utl-av/commonDesignation "BLUFFS",
   :fibo-fnd-utl-av/preferredDesignation "BLFS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "bluffs",
   :skos/definition "multiple broad, rounded cliffs"})

(def Bottom
  "deepest or lowest part of something, such as the bottom of a hill"
  {:db/ident :fibo-fnd-plc-uspsai/Bottom,
   :fibo-fnd-utl-av/commonDesignation ["BOTTOM" "BOT" "BOTTM" "BTM"],
   :fibo-fnd-utl-av/preferredDesignation "BTM",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/StreetSuffix],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "bottom",
   :skos/definition
   "deepest or lowest part of something, such as the bottom of a hill"})

(def Boulevard
  "broad thoroughfare in a city, usually having areas at the sides or center for trees, grass, or flowers"
  {:db/ident :fibo-fnd-plc-uspsai/Boulevard,
   :fibo-fnd-utl-av/commonDesignation ["BOULEVARD" "BLVD" "BOUL" "BOULV"],
   :fibo-fnd-utl-av/preferredDesignation "BLVD",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "boulevard",
   :skos/definition
   "broad thoroughfare in a city, usually having areas at the sides or center for trees, grass, or flowers"})

(def Branch
  "division of a road or path"
  {:db/ident :fibo-fnd-plc-uspsai/Branch,
   :fibo-fnd-utl-av/commonDesignation ["BRNCH" "BRANCH" "BR"],
   :fibo-fnd-utl-av/preferredDesignation "BR",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "branch",
   :skos/definition "division of a road or path"})

(def Bridge
  "structure carrying a road, path, railroad, or canal across a river, ravine, road, railroad, or other obstacle"
  {:db/ident :fibo-fnd-plc-uspsai/Bridge,
   :fibo-fnd-utl-av/commonDesignation ["BRIDGE" "BRG" "BRDGE"],
   :fibo-fnd-utl-av/preferredDesignation "BRG",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "bridge",
   :skos/definition
   "structure carrying a road, path, railroad, or canal across a river, ravine, road, railroad, or other obstacle"})

(def Brook
  "small, natural freshwater stream"
  {:db/ident :fibo-fnd-plc-uspsai/Brook,
   :fibo-fnd-utl-av/commonDesignation ["BROOK" "BRK"],
   :fibo-fnd-utl-av/preferredDesignation "BRK",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "brook",
   :skos/definition "small, natural freshwater stream"})

(def Brooks
  "multiple small, natural freshwater streams"
  {:db/ident :fibo-fnd-plc-uspsai/Brooks,
   :fibo-fnd-utl-av/commonDesignation "BROOKS",
   :fibo-fnd-utl-av/preferredDesignation "BRKS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "brooks",
   :skos/definition "multiple small, natural freshwater streams"})

(def Burg
  "city or town (informal)"
  {:db/ident :fibo-fnd-plc-uspsai/Burg,
   :fibo-fnd-utl-av/commonDesignation "BURG",
   :fibo-fnd-utl-av/preferredDesignation "BG",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "burg",
   :skos/definition "city or town (informal)"})

(def Burgs
  "multiple cities or towns (informal)"
  {:db/ident :fibo-fnd-plc-uspsai/Burgs,
   :fibo-fnd-utl-av/commonDesignation "BURGS",
   :fibo-fnd-utl-av/preferredDesignation "BGS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "burgs",
   :skos/definition "multiple cities or towns (informal)"})

(def Bypass
  "road passing around a town or its center to provide an alternative route for through traffic"
  {:db/ident :fibo-fnd-plc-uspsai/Bypass,
   :fibo-fnd-utl-av/commonDesignation ["BYPASS" "BYP" "BYPA" "BYPAS" "BYS"],
   :fibo-fnd-utl-av/preferredDesignation "BYP",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/StreetSuffix],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "bypass",
   :skos/definition
   "road passing around a town or its center to provide an alternative route for through traffic"})

(def CA
  "US-specific code for the designation for California"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/California,
   :cmns-id/identifies :lcc-3166-2-us/California,
   :db/ident :fibo-fnd-plc-uspsai/CA,
   :fibo-fnd-rel-rel/hasTag "CA",
   :fibo-fnd-utl-av/preferredDesignation "CA",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "CA",
   :skos/definition "US-specific code for the designation for California"})

(def CO
  "US-specific code for the designation for Colorado"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Colorado,
   :cmns-id/identifies :lcc-3166-2-us/Colorado,
   :db/ident :fibo-fnd-plc-uspsai/CO,
   :fibo-fnd-rel-rel/hasTag "CO",
   :fibo-fnd-utl-av/preferredDesignation "CO",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "CO",
   :skos/definition "US-specific code for the designation for Colorado"})

(def CT
  "US-specific code for the designation for Connecticut"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Connecticut,
   :cmns-id/identifies :lcc-3166-2-us/Connecticut,
   :db/ident :fibo-fnd-plc-uspsai/CT,
   :fibo-fnd-rel-rel/hasTag "CT",
   :fibo-fnd-utl-av/preferredDesignation "CT",
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "CT",
   :skos/definition "US-specific code for the designation for Connecticut"})

(def Camp
  "CP"
  {:db/ident :fibo-fnd-plc-uspsai/Camp,
   :fibo-fnd-utl-av/commonDesignation ["CP" "CMP" "CAMP"],
   :fibo-fnd-utl-av/preferredDesignation "CP",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "camp"})

(def Canyon
  "CYN"
  {:db/ident :fibo-fnd-plc-uspsai/Canyon,
   :fibo-fnd-utl-av/commonDesignation ["CNYN" "CANYON" "CANYN"],
   :fibo-fnd-utl-av/preferredDesignation "CYN",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "canyon"})

(def Cape
  "CPE"
  {:db/ident :fibo-fnd-plc-uspsai/Cape,
   :fibo-fnd-utl-av/commonDesignation ["CPE" "CAPE"],
   :fibo-fnd-utl-av/preferredDesignation "CPE",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "cape"})

(def Causeway
  "CSWY"
  {:db/ident :fibo-fnd-plc-uspsai/Causeway,
   :fibo-fnd-utl-av/commonDesignation ["CSWY" "CAUSWA" "CAUSEWAY"],
   :fibo-fnd-utl-av/preferredDesignation "CSWY",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "causeway"})

(def Center
  "CTR"
  {:db/ident :fibo-fnd-plc-uspsai/Center,
   :fibo-fnd-utl-av/commonDesignation
   ["CENTRE" "CNTER" "CENT" "CENTER" "CENTR" "CTR" "CNTR" "CEN"],
   :fibo-fnd-utl-av/preferredDesignation "CTR",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "center"})

(def Centers
  "CTRS"
  {:db/ident :fibo-fnd-plc-uspsai/Centers,
   :fibo-fnd-utl-av/commonDesignation "CENTERS",
   :fibo-fnd-utl-av/preferredDesignation "CTRS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "centers"})

(def Circle
  "CIR"
  {:db/ident :fibo-fnd-plc-uspsai/Circle,
   :fibo-fnd-utl-av/commonDesignation
   ["CRCLE" "CIRC" "CIRCL" "CRCL" "CIR" "CIRCLE"],
   :fibo-fnd-utl-av/preferredDesignation "CIR",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "circle"})

(def Circles
  "CIRS"
  {:db/ident :fibo-fnd-plc-uspsai/Circles,
   :fibo-fnd-utl-av/commonDesignation "CIRCLES",
   :fibo-fnd-utl-av/preferredDesignation "CIRS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "circles"})

(def Cliff
  "CLF"
  {:db/ident :fibo-fnd-plc-uspsai/Cliff,
   :fibo-fnd-utl-av/commonDesignation ["CLIFF" "CLF"],
   :fibo-fnd-utl-av/preferredDesignation "CLF",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "cliff"})

(def Cliffs
  "CLFS"
  {:db/ident :fibo-fnd-plc-uspsai/Cliffs,
   :fibo-fnd-utl-av/commonDesignation ["CLIFFS" "CLFS"],
   :fibo-fnd-utl-av/preferredDesignation "CLFS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "cliffs"})

(def Club
  "CLB"
  {:db/ident :fibo-fnd-plc-uspsai/Club,
   :fibo-fnd-utl-av/commonDesignation ["CLUB" "CLB"],
   :fibo-fnd-utl-av/preferredDesignation "CLB",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "club"})

(def Common
  "CMN"
  {:db/ident :fibo-fnd-plc-uspsai/Common,
   :fibo-fnd-utl-av/commonDesignation "COMMON",
   :fibo-fnd-utl-av/preferredDesignation "CMN",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "common"})

(def Commons
  "CMNS"
  {:db/ident :fibo-fnd-plc-uspsai/Commons,
   :fibo-fnd-utl-av/commonDesignation "COMMONS",
   :fibo-fnd-utl-av/preferredDesignation "CMNS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "commons"})

(def Corner
  "COR"
  {:db/ident :fibo-fnd-plc-uspsai/Corner,
   :fibo-fnd-utl-av/commonDesignation ["CORNER" "COR"],
   :fibo-fnd-utl-av/preferredDesignation "COR",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "corner"})

(def Corners
  "CORS"
  {:db/ident :fibo-fnd-plc-uspsai/Corners,
   :fibo-fnd-utl-av/commonDesignation ["CORS" "CORNERS"],
   :fibo-fnd-utl-av/preferredDesignation "CORS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "corners"})

(def Course
  "CRSE"
  {:db/ident :fibo-fnd-plc-uspsai/Course,
   :fibo-fnd-utl-av/commonDesignation ["CRSE" "COURSE"],
   :fibo-fnd-utl-av/preferredDesignation "CRSE",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "course"})

(def Court
  "CT"
  {:db/ident :fibo-fnd-plc-uspsai/Court,
   :fibo-fnd-utl-av/commonDesignation ["CT" "COURT"],
   :fibo-fnd-utl-av/preferredDesignation "CT",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "court"})

(def Courts
  "CTS"
  {:db/ident :fibo-fnd-plc-uspsai/Courts,
   :fibo-fnd-utl-av/commonDesignation ["CTS" "COURTS"],
   :fibo-fnd-utl-av/preferredDesignation "CTS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "courts"})

(def Cove
  "CV"
  {:db/ident :fibo-fnd-plc-uspsai/Cove,
   :fibo-fnd-utl-av/commonDesignation ["CV" "COVE"],
   :fibo-fnd-utl-av/preferredDesignation "CV",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "cove"})

(def Coves
  "CVS"
  {:db/ident :fibo-fnd-plc-uspsai/Coves,
   :fibo-fnd-utl-av/commonDesignation "COVES",
   :fibo-fnd-utl-av/preferredDesignation "CVS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "coves"})

(def Creek
  "CRK"
  {:db/ident :fibo-fnd-plc-uspsai/Creek,
   :fibo-fnd-utl-av/commonDesignation ["CRK" "CREEK"],
   :fibo-fnd-utl-av/preferredDesignation "CRK",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "creek"})

(def Crescent
  "CRES"
  {:db/ident :fibo-fnd-plc-uspsai/Crescent,
   :fibo-fnd-utl-av/commonDesignation ["CRSNT" "CRSENT" "CRESCENT" "CRES"],
   :fibo-fnd-utl-av/preferredDesignation "CRES",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "crescent"})

(def Crest
  "CRST"
  {:db/ident :fibo-fnd-plc-uspsai/Crest,
   :fibo-fnd-utl-av/commonDesignation "CREST",
   :fibo-fnd-utl-av/preferredDesignation "CRST",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "crest"})

(def Crossing
  "XING"
  {:db/ident :fibo-fnd-plc-uspsai/Crossing,
   :fibo-fnd-utl-av/commonDesignation ["XING" "CRSSNG" "CROSSING"],
   :fibo-fnd-utl-av/preferredDesignation "XING",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "crossing"})

(def Crossroad
  "XRD"
  {:db/ident :fibo-fnd-plc-uspsai/Crossroad,
   :fibo-fnd-utl-av/commonDesignation "CROSSROAD",
   :fibo-fnd-utl-av/preferredDesignation "XRD",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "crossroad"})

(def Crossroads
  "XRDS"
  {:db/ident :fibo-fnd-plc-uspsai/Crossroads,
   :fibo-fnd-utl-av/commonDesignation "CROSSROADS",
   :fibo-fnd-utl-av/preferredDesignation "XRDS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "crossroads"})

(def Curve
  "CURV"
  {:db/ident :fibo-fnd-plc-uspsai/Curve,
   :fibo-fnd-utl-av/commonDesignation "CURVE",
   :fibo-fnd-utl-av/preferredDesignation "CURV",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "curve"})

(def DC
  "US-specific code for the designation for the District of Colombia"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/DistrictOfColumbia,
   :cmns-id/identifies :lcc-3166-2-us/DistrictOfColumbia,
   :db/ident :fibo-fnd-plc-uspsai/DC,
   :fibo-fnd-rel-rel/hasTag "DC",
   :fibo-fnd-utl-av/preferredDesignation "DC",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "DC",
   :skos/definition
   "US-specific code for the designation for the District of Colombia"})

(def DE
  "US-specific code for the designation for Delaware"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Delaware,
   :cmns-id/identifies :lcc-3166-2-us/Delaware,
   :db/ident :fibo-fnd-plc-uspsai/DE,
   :fibo-fnd-rel-rel/hasTag "DE",
   :fibo-fnd-utl-av/preferredDesignation "DE",
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "DE",
   :skos/definition "US-specific code for the designation for Delaware"})

(def Dale
  "DL"
  {:db/ident :fibo-fnd-plc-uspsai/Dale,
   :fibo-fnd-utl-av/commonDesignation ["DL" "DALE"],
   :fibo-fnd-utl-av/preferredDesignation "DL",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "dale"})

(def Dam
  "DM"
  {:db/ident :fibo-fnd-plc-uspsai/Dam,
   :fibo-fnd-utl-av/commonDesignation ["DM" "DAM"],
   :fibo-fnd-utl-av/preferredDesignation "DM",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "dam"})

(def Divide
  "DV"
  {:db/ident :fibo-fnd-plc-uspsai/Divide,
   :fibo-fnd-utl-av/commonDesignation ["DVD" "DV" "DIVIDE" "DIV"],
   :fibo-fnd-utl-av/preferredDesignation "DV",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "divide"})

(def Drive
  "DR"
  {:db/ident :fibo-fnd-plc-uspsai/Drive,
   :fibo-fnd-utl-av/commonDesignation ["DRV" "DRIVE" "DRIV" "DR"],
   :fibo-fnd-utl-av/preferredDesignation "DR",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "drive"})

(def Drives
  "DRS"
  {:db/ident :fibo-fnd-plc-uspsai/Drives,
   :fibo-fnd-utl-av/commonDesignation "DRIVES",
   :fibo-fnd-utl-av/preferredDesignation "DRS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "drives"})

(def Estate
  "EST"
  {:db/ident :fibo-fnd-plc-uspsai/Estate,
   :fibo-fnd-utl-av/commonDesignation ["ESTATE" "EST"],
   :fibo-fnd-utl-av/preferredDesignation "EST",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "estate"})

(def Estates
  "ESTS"
  {:db/ident :fibo-fnd-plc-uspsai/Estates,
   :fibo-fnd-utl-av/commonDesignation ["ESTS" "ESTATES"],
   :fibo-fnd-utl-av/preferredDesignation "ESTS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "estates"})

(def Expressway
  "EXPY"
  {:db/ident :fibo-fnd-plc-uspsai/Expressway,
   :fibo-fnd-utl-av/commonDesignation
   ["EXPY" "EXPW" "EXPRESS" "EXPRESSWAY" "EXP" "EXPR"],
   :fibo-fnd-utl-av/preferredDesignation "EXPY",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/StreetSuffix],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "expressway"})

(def Extension
  "EXT"
  {:db/ident :fibo-fnd-plc-uspsai/Extension,
   :fibo-fnd-utl-av/commonDesignation ["EXTNSN" "EXTN" "EXTENSION" "EXT"],
   :fibo-fnd-utl-av/preferredDesignation "EXT",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "extension"})

(def Extensions
  "EXTS"
  {:db/ident :fibo-fnd-plc-uspsai/Extensions,
   :fibo-fnd-utl-av/commonDesignation "EXTS",
   :fibo-fnd-utl-av/preferredDesignation "EXTS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "extensions"})

(def FL
  "US-specific code for the designation for Florida"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Florida,
   :cmns-id/identifies :lcc-3166-2-us/Florida,
   :db/ident :fibo-fnd-plc-uspsai/FL,
   :fibo-fnd-rel-rel/hasTag "FL",
   :fibo-fnd-utl-av/preferredDesignation "FL",
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "FL",
   :skos/definition "US-specific code for the designation for Florida"})

(def Fall
  "FALL"
  {:db/ident :fibo-fnd-plc-uspsai/Fall,
   :fibo-fnd-utl-av/commonDesignation "FALL",
   :fibo-fnd-utl-av/preferredDesignation "FALL",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "fall"})

(def Falls
  "FLS"
  {:db/ident :fibo-fnd-plc-uspsai/Falls,
   :fibo-fnd-utl-av/commonDesignation ["FLS" "FALLS"],
   :fibo-fnd-utl-av/preferredDesignation "FLS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "falls"})

(def Ferry
  "FRY"
  {:db/ident :fibo-fnd-plc-uspsai/Ferry,
   :fibo-fnd-utl-av/commonDesignation ["FRY" "FRRY" "FERRY"],
   :fibo-fnd-utl-av/preferredDesignation "FRY",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "ferry"})

(def Field
  "FLD"
  {:db/ident :fibo-fnd-plc-uspsai/Field,
   :fibo-fnd-utl-av/commonDesignation ["FLD" "FIELD"],
   :fibo-fnd-utl-av/preferredDesignation "FLD",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "field"})

(def Fields
  "FLDS"
  {:db/ident :fibo-fnd-plc-uspsai/Fields,
   :fibo-fnd-utl-av/commonDesignation ["FLDS" "FIELDS"],
   :fibo-fnd-utl-av/preferredDesignation "FLDS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "fields"})

(def Flat
  "FLT"
  {:db/ident :fibo-fnd-plc-uspsai/Flat,
   :fibo-fnd-utl-av/commonDesignation ["FLT" "FLAT"],
   :fibo-fnd-utl-av/preferredDesignation "FLT",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "flat"})

(def Flats
  "FLTS"
  {:db/ident :fibo-fnd-plc-uspsai/Flats,
   :fibo-fnd-utl-av/commonDesignation ["FLTS" "FLATS"],
   :fibo-fnd-utl-av/preferredDesignation "FLTS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "flats"})

(def Ford
  "FRD"
  {:db/ident :fibo-fnd-plc-uspsai/Ford,
   :fibo-fnd-utl-av/commonDesignation ["FRD" "FORD"],
   :fibo-fnd-utl-av/preferredDesignation "FRD",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "ford"})

(def Fords
  "FRDS"
  {:db/ident :fibo-fnd-plc-uspsai/Fords,
   :fibo-fnd-utl-av/commonDesignation "FORDS",
   :fibo-fnd-utl-av/preferredDesignation "FRDS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "fords"})

(def Forest
  "FRST"
  {:db/ident :fibo-fnd-plc-uspsai/Forest,
   :fibo-fnd-utl-av/commonDesignation ["FRST" "FORESTS" "FOREST"],
   :fibo-fnd-utl-av/preferredDesignation "FRST",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "forest"})

(def Forge
  "FRG"
  {:db/ident :fibo-fnd-plc-uspsai/Forge,
   :fibo-fnd-utl-av/commonDesignation ["FRG" "FORGE" "FORG"],
   :fibo-fnd-utl-av/preferredDesignation "FRG",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "forge"})

(def Forges
  "FRGS"
  {:db/ident :fibo-fnd-plc-uspsai/Forges,
   :fibo-fnd-utl-av/commonDesignation "FORGES",
   :fibo-fnd-utl-av/preferredDesignation "FRGS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "forges"})

(def Fork
  "FRK"
  {:db/ident :fibo-fnd-plc-uspsai/Fork,
   :fibo-fnd-utl-av/commonDesignation ["FRK" "FORK"],
   :fibo-fnd-utl-av/preferredDesignation "FRK",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "fork"})

(def Forks
  "FRKS"
  {:db/ident :fibo-fnd-plc-uspsai/Forks,
   :fibo-fnd-utl-av/commonDesignation ["FRKS" "FORKS"],
   :fibo-fnd-utl-av/preferredDesignation "FRKS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "forks"})

(def Fort
  "FT"
  {:db/ident :fibo-fnd-plc-uspsai/Fort,
   :fibo-fnd-utl-av/commonDesignation ["FT" "FRT" "FORT"],
   :fibo-fnd-utl-av/preferredDesignation "FT",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "fort"})

(def Freeway
  {:db/ident :fibo-fnd-plc-uspsai/Freeway,
   :fibo-fnd-utl-av/commonDesignation ["FWY" "FRWY" "FRWAY" "FREEWY" "FREEWAY"],
   :fibo-fnd-utl-av/preferredDesignation "FWY",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "freeway"})

(def GA
  "US-specific code for the designation for Georgia"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Georgia,
   :cmns-id/identifies :lcc-3166-2-us/Georgia,
   :db/ident :fibo-fnd-plc-uspsai/GA,
   :fibo-fnd-rel-rel/hasTag "GA",
   :fibo-fnd-utl-av/preferredDesignation "GA",
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "GA",
   :skos/definition "US-specific code for the designation for Georgia"})

(def GU
  "US-specific code for the designation for Guam"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Guam,
   :cmns-id/identifies :lcc-3166-2-us/Guam,
   :db/ident :fibo-fnd-plc-uspsai/GU,
   :fibo-fnd-rel-rel/hasTag "GU",
   :fibo-fnd-utl-av/preferredDesignation "GU",
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "GU",
   :skos/definition "US-specific code for the designation for Guam"})

(def Garden
  "GDN"
  {:db/ident :fibo-fnd-plc-uspsai/Garden,
   :fibo-fnd-utl-av/commonDesignation ["GRDN" "GRDEN" "GARDN" "GARDEN"],
   :fibo-fnd-utl-av/preferredDesignation "GDN",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "garden"})

(def Gardens
  "GDNS"
  {:db/ident :fibo-fnd-plc-uspsai/Gardens,
   :fibo-fnd-utl-av/commonDesignation ["GRDNS" "GDNS" "GARDENS"],
   :fibo-fnd-utl-av/preferredDesignation "GDNS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "gardens"})

(def Gateway
  "gateway"
  {:db/ident :fibo-fnd-plc-uspsai/Gateway,
   :fibo-fnd-utl-av/commonDesignation
   ["GTWAY" "GATWAY" "GATEWY" "GTWY" "GATEWAY"],
   :fibo-fnd-utl-av/preferredDesignation "GTWY",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "gateway"})

(def Glen
  "GLN"
  {:db/ident :fibo-fnd-plc-uspsai/Glen,
   :fibo-fnd-utl-av/commonDesignation ["GLN" "GLEN"],
   :fibo-fnd-utl-av/preferredDesignation "GLN",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "glen"})

(def Glens
  "GLNS"
  {:db/ident :fibo-fnd-plc-uspsai/Glens,
   :fibo-fnd-utl-av/commonDesignation "GLENS",
   :fibo-fnd-utl-av/preferredDesignation "GLNS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "glens"})

(def Green
  "GRN"
  {:db/ident :fibo-fnd-plc-uspsai/Green,
   :fibo-fnd-utl-av/commonDesignation ["GRN" "GREEN"],
   :fibo-fnd-utl-av/preferredDesignation "GRN",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "green"})

(def Greens
  "GRNS"
  {:db/ident :fibo-fnd-plc-uspsai/Greens,
   :fibo-fnd-utl-av/commonDesignation "GREENS",
   :fibo-fnd-utl-av/preferredDesignation "GRNS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "greens"})

(def Grove
  "GRV"
  {:db/ident :fibo-fnd-plc-uspsai/Grove,
   :fibo-fnd-utl-av/commonDesignation ["GRV" "GROVE" "GROV"],
   :fibo-fnd-utl-av/preferredDesignation "GRV",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "grove"})

(def Groves
  "GRVS"
  {:db/ident :fibo-fnd-plc-uspsai/Groves,
   :fibo-fnd-utl-av/commonDesignation "GROVES",
   :fibo-fnd-utl-av/preferredDesignation "GRVS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "groves"})

(def HI
  "US-specific code for the designation for Hawaii"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Hawaii,
   :cmns-id/identifies :lcc-3166-2-us/Hawaii,
   :db/ident :fibo-fnd-plc-uspsai/HI,
   :fibo-fnd-rel-rel/hasTag "HI",
   :fibo-fnd-utl-av/preferredDesignation "HI",
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "HI",
   :skos/definition "US-specific code for the designation for Hawaii"})

(def Harbor
  "HBR"
  {:db/ident :fibo-fnd-plc-uspsai/Harbor,
   :fibo-fnd-utl-av/commonDesignation ["HARBOR" "HRBOR" "HARBR" "HARB" "HBR"],
   :fibo-fnd-utl-av/preferredDesignation "HBR",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "harbor"})

(def Harbors
  "HBRS"
  {:db/ident :fibo-fnd-plc-uspsai/Harbors,
   :fibo-fnd-utl-av/commonDesignation "HARBORS",
   :fibo-fnd-utl-av/preferredDesignation "HBRS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "harbors"})

(def Haven
  "HVN"
  {:db/ident :fibo-fnd-plc-uspsai/Haven,
   :fibo-fnd-utl-av/commonDesignation ["HVN" "HAVEN"],
   :fibo-fnd-utl-av/preferredDesignation "HVN",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "haven"})

(def Heights
  "HTS"
  {:db/ident :fibo-fnd-plc-uspsai/Heights,
   :fibo-fnd-utl-av/commonDesignation ["HTS" "HT"],
   :fibo-fnd-utl-av/preferredDesignation "HTS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "heights"})

(def Highway
  {:db/ident :fibo-fnd-plc-uspsai/Highway,
   :fibo-fnd-utl-av/commonDesignation
   ["HIGHWAY" "HWAY" "HIWAY" "HWY" "HIGHWY" "HIWY"],
   :fibo-fnd-utl-av/preferredDesignation "HWY",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "highway"})

(def Hill
  "HL"
  {:db/ident :fibo-fnd-plc-uspsai/Hill,
   :fibo-fnd-utl-av/commonDesignation ["HL" "HILL"],
   :fibo-fnd-utl-av/preferredDesignation "HL",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "hill"})

(def Hills
  "HLS"
  {:db/ident :fibo-fnd-plc-uspsai/Hills,
   :fibo-fnd-utl-av/commonDesignation ["HLS" "HILLS"],
   :fibo-fnd-utl-av/preferredDesignation "HLS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "hills"})

(def Hollow
  {:db/ident :fibo-fnd-plc-uspsai/Hollow,
   :fibo-fnd-utl-av/commonDesignation
   ["HOLLOW" "HOLLOWS" "HLLW" "HOLW" "HOLWS"],
   :fibo-fnd-utl-av/preferredDesignation "HOLW",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "hollow"})

(def IA
  "US-specific code for the designation for Iowa"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Iowa,
   :cmns-id/identifies :lcc-3166-2-us/Iowa,
   :db/ident :fibo-fnd-plc-uspsai/IA,
   :fibo-fnd-rel-rel/hasTag "IA",
   :fibo-fnd-utl-av/preferredDesignation "IA",
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "IA",
   :skos/definition "US-specific code for the designation for Iowa"})

(def ID
  "US-specific code for the designation for Idaho"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Idaho,
   :cmns-id/identifies :lcc-3166-2-us/Idaho,
   :db/ident :fibo-fnd-plc-uspsai/ID,
   :fibo-fnd-rel-rel/hasTag "ID",
   :fibo-fnd-utl-av/preferredDesignation "ID",
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "ID",
   :skos/definition "US-specific code for the designation for Idaho"})

(def IL
  "US-specific code for the designation for Illinois"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Illinois,
   :cmns-id/identifies :lcc-3166-2-us/Illinois,
   :db/ident :fibo-fnd-plc-uspsai/IL,
   :fibo-fnd-rel-rel/hasTag "IL",
   :fibo-fnd-utl-av/preferredDesignation "IL",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "IL",
   :skos/definition "US-specific code for the designation for Illinois"})

(def IN
  "US-specific code for the designation for Indiana"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Indiana,
   :cmns-id/identifies :lcc-3166-2-us/Indiana,
   :db/ident :fibo-fnd-plc-uspsai/IN,
   :fibo-fnd-rel-rel/hasTag "IN",
   :fibo-fnd-utl-av/preferredDesignation "IN",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "IN",
   :skos/definition "US-specific code for the designation for Indiana"})

(def Inlet
  "INLT"
  {:db/ident :fibo-fnd-plc-uspsai/Inlet,
   :fibo-fnd-utl-av/commonDesignation "INLT",
   :fibo-fnd-utl-av/preferredDesignation "INLT",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "inlet"})

(def Island
  "IS"
  {:db/ident :fibo-fnd-plc-uspsai/Island,
   :fibo-fnd-utl-av/commonDesignation ["ISLND" "ISLAND" "IS"],
   :fibo-fnd-utl-av/preferredDesignation "IS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "island"})

(def Islands
  "ISS"
  {:db/ident :fibo-fnd-plc-uspsai/Islands,
   :fibo-fnd-utl-av/commonDesignation ["ISS" "ISLNDS" "ISLANDS"],
   :fibo-fnd-utl-av/preferredDesignation "ISS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "islands"})

(def Isle
  "ISLE"
  {:db/ident :fibo-fnd-plc-uspsai/Isle,
   :fibo-fnd-utl-av/commonDesignation ["ISLES" "ISLE"],
   :fibo-fnd-utl-av/preferredDesignation "ISLE",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "isle"})

(def Junction
  {:db/ident :fibo-fnd-plc-uspsai/Junction,
   :fibo-fnd-utl-av/commonDesignation
   ["JCTION" "JCT" "JCTN" "JUNCTION" "JUNCTON" "JUNCTN"],
   :fibo-fnd-utl-av/preferredDesignation "JCT",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "junction"})

(def Junctions
  "JCTS"
  {:db/ident :fibo-fnd-plc-uspsai/Junctions,
   :fibo-fnd-utl-av/commonDesignation ["JUNCTIONS" "JCTS" "JCTNS"],
   :fibo-fnd-utl-av/preferredDesignation "JCTS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "junctions"})

(def KS
  "US-specific code for the designation for Kansas"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Kansas,
   :cmns-id/identifies :lcc-3166-2-us/Kansas,
   :db/ident :fibo-fnd-plc-uspsai/KS,
   :fibo-fnd-rel-rel/hasTag "KS",
   :fibo-fnd-utl-av/preferredDesignation "KS",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "KS",
   :skos/definition "US-specific code for the designation for Kansas"})

(def KY
  "US-specific code for the designation for Kentucky"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Kentucky,
   :cmns-id/identifies :lcc-3166-2-us/Kentucky,
   :db/ident :fibo-fnd-plc-uspsai/KY,
   :fibo-fnd-rel-rel/hasTag "KY",
   :fibo-fnd-utl-av/preferredDesignation "KY",
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "KY",
   :skos/definition "US-specific code for the designation for Kentucky"})

(def Key
  "KY"
  {:db/ident :fibo-fnd-plc-uspsai/Key,
   :fibo-fnd-utl-av/commonDesignation ["KY" "KEY"],
   :fibo-fnd-utl-av/preferredDesignation "KY",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "key"})

(def Keys
  "KYS"
  {:db/ident :fibo-fnd-plc-uspsai/Keys,
   :fibo-fnd-utl-av/commonDesignation ["KYS" "KEYS"],
   :fibo-fnd-utl-av/preferredDesignation "KYS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "keys"})

(def Knoll
  "KNL"
  {:db/ident :fibo-fnd-plc-uspsai/Knoll,
   :fibo-fnd-utl-av/commonDesignation ["KNOLL" "KNOL" "KNL"],
   :fibo-fnd-utl-av/preferredDesignation "KNL",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "knoll"})

(def Knolls
  "KNLS"
  {:db/ident :fibo-fnd-plc-uspsai/Knolls,
   :fibo-fnd-utl-av/commonDesignation ["KNOLLS" "KNLS"],
   :fibo-fnd-utl-av/preferredDesignation "KNLS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "knolls"})

(def LA
  "US-specific code for the designation for Louisiana"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Louisiana,
   :cmns-id/identifies :lcc-3166-2-us/Louisiana,
   :db/ident :fibo-fnd-plc-uspsai/LA,
   :fibo-fnd-rel-rel/hasTag "LA",
   :fibo-fnd-utl-av/preferredDesignation "LA",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "LA",
   :skos/definition "US-specific code for the designation for Louisiana"})

(def Lake
  "LK"
  {:db/ident :fibo-fnd-plc-uspsai/Lake,
   :fibo-fnd-utl-av/commonDesignation ["LK" "LAKE"],
   :fibo-fnd-utl-av/preferredDesignation "LK",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "lake"})

(def Lakes
  "LKS"
  {:db/ident :fibo-fnd-plc-uspsai/Lakes,
   :fibo-fnd-utl-av/commonDesignation ["LKS" "LAKES"],
   :fibo-fnd-utl-av/preferredDesignation "LKS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "lakes"})

(def Land
  "LAND"
  {:db/ident :fibo-fnd-plc-uspsai/Land,
   :fibo-fnd-utl-av/commonDesignation "LAND",
   :fibo-fnd-utl-av/preferredDesignation "LAND",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "land"})

(def Landing
  "LNDG"
  {:db/ident :fibo-fnd-plc-uspsai/Landing,
   :fibo-fnd-utl-av/commonDesignation ["LNDNG" "LNDG" "LANDING"],
   :fibo-fnd-utl-av/preferredDesignation "LNDG",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "landing"})

(def Lane
  "LN"
  {:db/ident :fibo-fnd-plc-uspsai/Lane,
   :fibo-fnd-utl-av/commonDesignation ["LN" "LANE"],
   :fibo-fnd-utl-av/preferredDesignation "LN",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "lane"})

(def Light
  "LGT"
  {:db/ident :fibo-fnd-plc-uspsai/Light,
   :fibo-fnd-utl-av/commonDesignation ["LIGHT" "LGT"],
   :fibo-fnd-utl-av/preferredDesignation "LGT",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "light"})

(def Lights
  "LGTS"
  {:db/ident :fibo-fnd-plc-uspsai/Lights,
   :fibo-fnd-utl-av/commonDesignation "LIGHTS",
   :fibo-fnd-utl-av/preferredDesignation "LGTS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "lights"})

(def Loaf
  "LF"
  {:db/ident :fibo-fnd-plc-uspsai/Loaf,
   :fibo-fnd-utl-av/commonDesignation ["LOAF" "LF"],
   :fibo-fnd-utl-av/preferredDesignation "LF",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "loaf"})

(def Lock
  "LCK"
  {:db/ident :fibo-fnd-plc-uspsai/Lock,
   :fibo-fnd-utl-av/commonDesignation ["LOCK" "LCK"],
   :fibo-fnd-utl-av/preferredDesignation "LCK",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "lock"})

(def Locks
  "LCKS"
  {:db/ident :fibo-fnd-plc-uspsai/Locks,
   :fibo-fnd-utl-av/commonDesignation ["LOCKS" "LCKS"],
   :fibo-fnd-utl-av/preferredDesignation "LCKS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "locks"})

(def Lodge
  "LDG"
  {:db/ident :fibo-fnd-plc-uspsai/Lodge,
   :fibo-fnd-utl-av/commonDesignation ["LODGE" "LODG" "LDGE" "LDG"],
   :fibo-fnd-utl-av/preferredDesignation "LDG",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "lodge"})

(def Loop
  "LOOP"
  {:db/ident :fibo-fnd-plc-uspsai/Loop,
   :fibo-fnd-utl-av/commonDesignation ["LOOPS" "LOOP"],
   :fibo-fnd-utl-av/preferredDesignation "LOOP",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "loop"})

(def MA
  "US-specific code for the designation for Massachusetts"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Massachusetts,
   :cmns-id/identifies :lcc-3166-2-us/Massachusetts,
   :db/ident :fibo-fnd-plc-uspsai/MA,
   :fibo-fnd-rel-rel/hasTag "MA",
   :fibo-fnd-utl-av/preferredDesignation "MA",
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "MA",
   :skos/definition "US-specific code for the designation for Massachusetts"})

(def MB
  "Canadian and US-specific code for the designation for Manitoba"
  {:cmns-cxtdsg/isUsedBy [:lcc-3166-1/UnitedStatesOfAmerica :lcc-3166-1/Canada],
   :cmns-dsg/denotes :lcc-3166-2-ca/Manitoba,
   :cmns-id/identifies :lcc-3166-2-ca/Manitoba,
   :db/ident :fibo-fnd-plc-uspsai/MB,
   :fibo-fnd-rel-rel/hasTag "MB",
   :fibo-fnd-utl-av/preferredDesignation "MB",
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "MB",
   :skos/definition
   "Canadian and US-specific code for the designation for Manitoba"})

(def MD
  "US-specific code for the designation for Maryland"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Maryland,
   :cmns-id/identifies :lcc-3166-2-us/Maryland,
   :db/ident :fibo-fnd-plc-uspsai/MD,
   :fibo-fnd-rel-rel/hasTag "MD",
   :fibo-fnd-utl-av/preferredDesignation "MD",
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "MD",
   :skos/definition "US-specific code for the designation for Maryland"})

(def ME
  "US-specific code for the designation for Maine"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Maine,
   :cmns-id/identifies :lcc-3166-2-us/Maine,
   :db/ident :fibo-fnd-plc-uspsai/ME,
   :fibo-fnd-rel-rel/hasTag "ME",
   :fibo-fnd-utl-av/preferredDesignation "ME",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "ME",
   :skos/definition "US-specific code for the designation for Maine"})

(def MI
  "US-specific code for the designation for Michigan"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Michigan,
   :cmns-id/identifies :lcc-3166-2-us/Michigan,
   :db/ident :fibo-fnd-plc-uspsai/MI,
   :fibo-fnd-rel-rel/hasTag "MI",
   :fibo-fnd-utl-av/preferredDesignation "MI",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "MI",
   :skos/definition "US-specific code for the designation for Michigan"})

(def MN
  "US-specific code for the designation for Minnesota"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Minnesota,
   :cmns-id/identifies :lcc-3166-2-us/Minnesota,
   :db/ident :fibo-fnd-plc-uspsai/MN,
   :fibo-fnd-rel-rel/hasTag "MN",
   :fibo-fnd-utl-av/preferredDesignation "MN",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "MN",
   :skos/definition "US-specific code for the designation for Minnesota"})

(def MO
  "US-specific code for the designation for Missouri"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Missouri,
   :cmns-id/identifies :lcc-3166-2-us/Missouri,
   :db/ident :fibo-fnd-plc-uspsai/MO,
   :fibo-fnd-rel-rel/hasTag "MO",
   :fibo-fnd-utl-av/preferredDesignation "MO",
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "MO",
   :skos/definition "US-specific code for the designation for Missouri"})

(def MP
  "US-specific code for the designation for the outlying area of Northern Mariana Islands"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/NorthernMarianaIslands,
   :cmns-id/identifies :lcc-3166-2-us/NorthernMarianaIslands,
   :db/ident :fibo-fnd-plc-uspsai/MP,
   :fibo-fnd-rel-rel/hasTag "MP",
   :fibo-fnd-utl-av/preferredDesignation "MP",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "MP",
   :skos/definition
   "US-specific code for the designation for the outlying area of Northern Mariana Islands"})

(def MS
  "US-specific code for the designation for Mississippi"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Mississippi,
   :cmns-id/identifies :lcc-3166-2-us/Mississippi,
   :db/ident :fibo-fnd-plc-uspsai/MS,
   :fibo-fnd-rel-rel/hasTag "MS",
   :fibo-fnd-utl-av/preferredDesignation "MS",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "MS",
   :skos/definition "US-specific code for the designation for Mississippi"})

(def MT
  "US-specific code for the designation for Montana"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Montana,
   :cmns-id/identifies :lcc-3166-2-us/Montana,
   :db/ident :fibo-fnd-plc-uspsai/MT,
   :fibo-fnd-rel-rel/hasTag "MT",
   :fibo-fnd-utl-av/preferredDesignation "MT",
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "MT",
   :skos/definition "US-specific code for the designation for Montana"})

(def Mall
  "MALL"
  {:db/ident :fibo-fnd-plc-uspsai/Mall,
   :fibo-fnd-utl-av/commonDesignation "MALL",
   :fibo-fnd-utl-av/preferredDesignation "MALL",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "mall"})

(def Manor
  "MNR"
  {:db/ident :fibo-fnd-plc-uspsai/Manor,
   :fibo-fnd-utl-av/commonDesignation ["MNR" "MANOR"],
   :fibo-fnd-utl-av/preferredDesignation "MNR",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "manor"})

(def Manors
  "MNRS"
  {:db/ident :fibo-fnd-plc-uspsai/Manors,
   :fibo-fnd-utl-av/commonDesignation ["MNRS" "MANORS"],
   :fibo-fnd-utl-av/preferredDesignation "MNRS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "manors"})

(def Meadow
  "MDW"
  {:db/ident :fibo-fnd-plc-uspsai/Meadow,
   :fibo-fnd-utl-av/commonDesignation "MEADOW",
   :fibo-fnd-utl-av/preferredDesignation "MDW",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "meadow"})

(def Meadows
  "MDWS"
  {:db/ident :fibo-fnd-plc-uspsai/Meadows,
   :fibo-fnd-utl-av/commonDesignation ["MEDOWS" "MEADOWS" "MDWS" "MDW"],
   :fibo-fnd-utl-av/preferredDesignation "MDWS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "meadows"})

(def Mews
  "MEWS"
  {:db/ident :fibo-fnd-plc-uspsai/Mews,
   :fibo-fnd-utl-av/commonDesignation "MEWS",
   :fibo-fnd-utl-av/preferredDesignation "MEWS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "mews"})

(def Mill
  "ML"
  {:db/ident :fibo-fnd-plc-uspsai/Mill,
   :fibo-fnd-utl-av/commonDesignation "MILL",
   :fibo-fnd-utl-av/preferredDesignation "ML",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "mill"})

(def Mills
  "MLS"
  {:db/ident :fibo-fnd-plc-uspsai/Mills,
   :fibo-fnd-utl-av/commonDesignation "MILLS",
   :fibo-fnd-utl-av/preferredDesignation "MLS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "mills"})

(def Mission
  "MSN"
  {:db/ident :fibo-fnd-plc-uspsai/Mission,
   :fibo-fnd-utl-av/commonDesignation ["MSSN" "MISSN"],
   :fibo-fnd-utl-av/preferredDesignation "MSN",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "mission"})

(def Motorway
  "MTWY"
  {:db/ident :fibo-fnd-plc-uspsai/Motorway,
   :fibo-fnd-utl-av/commonDesignation "MOTORWAY",
   :fibo-fnd-utl-av/preferredDesignation "MTWY",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "motorway"})

(def Mount
  "MT"
  {:db/ident :fibo-fnd-plc-uspsai/Mount,
   :fibo-fnd-utl-av/commonDesignation ["MT" "MOUNT" "MNT"],
   :fibo-fnd-utl-av/preferredDesignation "MT",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "mount"})

(def Mountain
  "mountain"
  {:db/ident :fibo-fnd-plc-uspsai/Mountain,
   :fibo-fnd-utl-av/commonDesignation
   ["MOUNTIN" "MNTN" "MNTAIN" "MTIN" "MTN" "MOUNTAIN"],
   :fibo-fnd-utl-av/preferredDesignation "MTN",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "mountain"})

(def Mountains
  "MTNS"
  {:db/ident :fibo-fnd-plc-uspsai/Mountains,
   :fibo-fnd-utl-av/commonDesignation ["MOUNTAINS" "MNTNS"],
   :fibo-fnd-utl-av/preferredDesignation "MTNS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "mountains"})

(def NB
  "Canadian and US-specific code for the designation for New Brunswick"
  {:cmns-cxtdsg/isUsedBy [:lcc-3166-1/Canada :lcc-3166-1/UnitedStatesOfAmerica],
   :cmns-dsg/denotes :lcc-3166-2-ca/NewBrunswick,
   :cmns-id/identifies :lcc-3166-2-ca/NewBrunswick,
   :db/ident :fibo-fnd-plc-uspsai/NB,
   :fibo-fnd-rel-rel/hasTag "NB",
   :fibo-fnd-utl-av/preferredDesignation "NB",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "NB",
   :skos/definition
   "Canadian and US-specific code for the designation for New Brunswick"})

(def NC
  "US-specific code for the designation for North Carolina"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/NorthCarolina,
   :cmns-id/identifies :lcc-3166-2-us/NorthCarolina,
   :db/ident :fibo-fnd-plc-uspsai/NC,
   :fibo-fnd-rel-rel/hasTag "NC",
   :fibo-fnd-utl-av/preferredDesignation "NC",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "NC",
   :skos/definition "US-specific code for the designation for North Carolina"})

(def ND
  "US-specific code for the designation for North Dakota"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/NorthDakota,
   :cmns-id/identifies :lcc-3166-2-us/NorthDakota,
   :db/ident :fibo-fnd-plc-uspsai/ND,
   :fibo-fnd-rel-rel/hasTag "ND",
   :fibo-fnd-utl-av/preferredDesignation "ND",
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "ND",
   :skos/definition "US-specific code for the designation for North Dakota"})

(def NE
  "US-specific code for the designation for Nebraska"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Nebraska,
   :cmns-id/identifies :lcc-3166-2-us/Nebraska,
   :db/ident :fibo-fnd-plc-uspsai/NE,
   :fibo-fnd-rel-rel/hasTag "NE",
   :fibo-fnd-utl-av/preferredDesignation "NE",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "NE",
   :skos/definition "US-specific code for the designation for Nebraska"})

(def NH
  "US-specific code for the designation for New Hampshire"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/NewHampshire,
   :cmns-id/identifies :lcc-3166-2-us/NewHampshire,
   :db/ident :fibo-fnd-plc-uspsai/NH,
   :fibo-fnd-rel-rel/hasTag "NH",
   :fibo-fnd-utl-av/preferredDesignation "NH",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "NH",
   :skos/definition "US-specific code for the designation for New Hampshire"})

(def NJ
  "US-specific code for the designation for New Jersey"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/NewJersey,
   :cmns-id/identifies :lcc-3166-2-us/NewJersey,
   :db/ident :fibo-fnd-plc-uspsai/NJ,
   :fibo-fnd-rel-rel/hasTag "NJ",
   :fibo-fnd-utl-av/preferredDesignation "NJ",
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "NJ",
   :skos/definition "US-specific code for the designation for New Jersey"})

(def NL
  "Canadian and US-specific code for the designation for Newfoundland and Labrador"
  {:cmns-cxtdsg/isUsedBy [:lcc-3166-1/UnitedStatesOfAmerica :lcc-3166-1/Canada],
   :cmns-dsg/denotes :lcc-3166-2-ca/NewfoundlandAndLabrador,
   :cmns-id/identifies :lcc-3166-2-ca/NewfoundlandAndLabrador,
   :db/ident :fibo-fnd-plc-uspsai/NL,
   :fibo-fnd-rel-rel/hasTag "NL",
   :fibo-fnd-utl-av/preferredDesignation "NL",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "NL",
   :skos/definition
   "Canadian and US-specific code for the designation for Newfoundland and Labrador"})

(def NM
  "US-specific code for the designation for New Mexico"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/NewMexico,
   :cmns-id/identifies :lcc-3166-2-us/NewMexico,
   :db/ident :fibo-fnd-plc-uspsai/NM,
   :fibo-fnd-rel-rel/hasTag "NM",
   :fibo-fnd-utl-av/preferredDesignation "NM",
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "NM",
   :skos/definition "US-specific code for the designation for New Mexico"})

(def NS
  "Canadian and US-specific code for the designation for Nova Scotia"
  {:cmns-cxtdsg/isUsedBy [:lcc-3166-1/UnitedStatesOfAmerica :lcc-3166-1/Canada],
   :cmns-dsg/denotes :lcc-3166-2-ca/NovaScotia,
   :cmns-id/identifies :lcc-3166-2-ca/NovaScotia,
   :db/ident :fibo-fnd-plc-uspsai/NS,
   :fibo-fnd-rel-rel/hasTag "NS",
   :fibo-fnd-utl-av/preferredDesignation "NS",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "NS",
   :skos/definition
   "Canadian and US-specific code for the designation for Nova Scotia"})

(def NT
  "Canadian and US-specific code for the designation for Northwest Territories"
  {:cmns-cxtdsg/isUsedBy [:lcc-3166-1/Canada :lcc-3166-1/UnitedStatesOfAmerica],
   :cmns-dsg/denotes :lcc-3166-2-ca/NorthwestTerritories,
   :cmns-id/identifies :lcc-3166-2-ca/NorthwestTerritories,
   :db/ident :fibo-fnd-plc-uspsai/NT,
   :fibo-fnd-rel-rel/hasTag "NT",
   :fibo-fnd-utl-av/preferredDesignation "NT",
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "NT",
   :skos/definition
   "Canadian and US-specific code for the designation for Northwest Territories"})

(def NU
  "Canadian and US-specific code for the designation for Nunavut"
  {:cmns-cxtdsg/isUsedBy [:lcc-3166-1/UnitedStatesOfAmerica :lcc-3166-1/Canada],
   :cmns-dsg/denotes :lcc-3166-2-ca/Nunavut,
   :cmns-id/identifies :lcc-3166-2-ca/Nunavut,
   :db/ident :fibo-fnd-plc-uspsai/NU,
   :fibo-fnd-rel-rel/hasTag "NU",
   :fibo-fnd-utl-av/preferredDesignation "NU",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "NU",
   :skos/definition
   "Canadian and US-specific code for the designation for Nunavut"})

(def NV
  "US-specific code for the designation for Nevada"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Nevada,
   :cmns-id/identifies :lcc-3166-2-us/Nevada,
   :db/ident :fibo-fnd-plc-uspsai/NV,
   :fibo-fnd-rel-rel/hasTag "NV",
   :fibo-fnd-utl-av/preferredDesignation "NV",
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "NV",
   :skos/definition "US-specific code for the designation for Nevada"})

(def NY
  "US-specific code for the designation for New York"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/NewYork,
   :cmns-id/identifies :lcc-3166-2-us/NewYork,
   :db/ident :fibo-fnd-plc-uspsai/NY,
   :fibo-fnd-rel-rel/hasTag "NY",
   :fibo-fnd-utl-av/preferredDesignation "NY",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "NY",
   :skos/definition "US-specific code for the designation for New York"})

(def Neck
  "NCK"
  {:db/ident :fibo-fnd-plc-uspsai/Neck,
   :fibo-fnd-utl-av/commonDesignation ["NECK" "NCK"],
   :fibo-fnd-utl-av/preferredDesignation "NCK",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "neck"})

(def OH
  "US-specific code for the designation for Ohio"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Ohio,
   :cmns-id/identifies :lcc-3166-2-us/Ohio,
   :db/ident :fibo-fnd-plc-uspsai/OH,
   :fibo-fnd-rel-rel/hasTag "OH",
   :fibo-fnd-utl-av/preferredDesignation "OH",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "OH",
   :skos/definition "US-specific code for the designation for Ohio"})

(def OK
  "US-specific code for the designation for Oklahoma"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Oklahoma,
   :cmns-id/identifies :lcc-3166-2-us/Oklahoma,
   :db/ident :fibo-fnd-plc-uspsai/OK,
   :fibo-fnd-rel-rel/hasTag "OK",
   :fibo-fnd-utl-av/preferredDesignation "OK",
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "OK",
   :skos/definition "US-specific code for the designation for Oklahoma"})

(def ON
  "Canadian and US-specific code for the designation for Ontario"
  {:cmns-cxtdsg/isUsedBy [:lcc-3166-1/Canada :lcc-3166-1/UnitedStatesOfAmerica],
   :cmns-dsg/denotes :lcc-3166-2-ca/Ontario,
   :cmns-id/identifies :lcc-3166-2-ca/Ontario,
   :db/ident :fibo-fnd-plc-uspsai/ON,
   :fibo-fnd-rel-rel/hasTag "ON",
   :fibo-fnd-utl-av/preferredDesignation "ON",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "ON",
   :skos/definition
   "Canadian and US-specific code for the designation for Ontario"})

(def OR
  "US-specific code for the designation for Oregon"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Oregon,
   :cmns-id/identifies :lcc-3166-2-us/Oregon,
   :db/ident :fibo-fnd-plc-uspsai/OR,
   :fibo-fnd-rel-rel/hasTag "OR",
   :fibo-fnd-utl-av/preferredDesignation "OR",
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "OR",
   :skos/definition "US-specific code for the designation for Oregon"})

(def Orchard
  "ORCH"
  {:db/ident :fibo-fnd-plc-uspsai/Orchard,
   :fibo-fnd-utl-av/commonDesignation ["ORCHRD" "ORCHARD" "ORCH"],
   :fibo-fnd-utl-av/preferredDesignation "ORCH",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "orchard"})

(def Oval
  "OVAL"
  {:db/ident :fibo-fnd-plc-uspsai/Oval,
   :fibo-fnd-utl-av/commonDesignation ["OVL" "OVAL"],
   :fibo-fnd-utl-av/preferredDesignation "OVAL",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "oval"})

(def Overpass
  "OPAS"
  {:db/ident :fibo-fnd-plc-uspsai/Overpass,
   :fibo-fnd-utl-av/commonDesignation "OVERPASS",
   :fibo-fnd-utl-av/preferredDesignation "OPAS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "overpass"})

(def PA
  "US-specific code for the designation for Pennsylvania"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Pennsylvania,
   :cmns-id/identifies :lcc-3166-2-us/Pennsylvania,
   :db/ident :fibo-fnd-plc-uspsai/PA,
   :fibo-fnd-rel-rel/hasTag "PA",
   :fibo-fnd-utl-av/preferredDesignation "PA",
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "PA",
   :skos/definition "US-specific code for the designation for Pennsylvania"})

(def PE
  "Canadian and US-specific code for the designation for Prince Edward Island"
  {:cmns-cxtdsg/isUsedBy [:lcc-3166-1/UnitedStatesOfAmerica :lcc-3166-1/Canada],
   :cmns-dsg/denotes :lcc-3166-2-ca/PrinceEdwardIsland,
   :cmns-id/identifies :lcc-3166-2-ca/PrinceEdwardIsland,
   :db/ident :fibo-fnd-plc-uspsai/PE,
   :fibo-fnd-rel-rel/hasTag "PE",
   :fibo-fnd-utl-av/preferredDesignation "PE",
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "PE",
   :skos/definition
   "Canadian and US-specific code for the designation for Prince Edward Island"})

(def PR
  "US-specific code for the designation for Puerto Rico"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/PuertoRico,
   :cmns-id/identifies :lcc-3166-2-us/PuertoRico,
   :db/ident :fibo-fnd-plc-uspsai/PR,
   :fibo-fnd-rel-rel/hasTag "PR",
   :fibo-fnd-utl-av/preferredDesignation "PR",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "PR",
   :skos/definition "US-specific code for the designation for Puerto Rico"})

(def Park
  "PARK"
  {:db/ident :fibo-fnd-plc-uspsai/Park,
   :fibo-fnd-utl-av/commonDesignation ["PRK" "PARK"],
   :fibo-fnd-utl-av/preferredDesignation "PARK",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "park"})

(def Parks
  "PARK"
  {:db/ident :fibo-fnd-plc-uspsai/Parks,
   :fibo-fnd-utl-av/commonDesignation "PARKS",
   :fibo-fnd-utl-av/preferredDesignation "PARK",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "parks"})

(def Parkway
  {:db/ident :fibo-fnd-plc-uspsai/Parkway,
   :fibo-fnd-utl-av/commonDesignation ["PKWY" "PARKWY" "PKWAY" "PARKWAY" "PKY"],
   :fibo-fnd-utl-av/preferredDesignation "PKWY",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "parkway"})

(def Parkways
  "PKWY"
  {:db/ident :fibo-fnd-plc-uspsai/Parkways,
   :fibo-fnd-utl-av/commonDesignation ["PKWYS" "PARKWAYS"],
   :fibo-fnd-utl-av/preferredDesignation "PKWY",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "parkways"})

(def Pass
  "PASS"
  {:db/ident :fibo-fnd-plc-uspsai/Pass,
   :fibo-fnd-utl-av/commonDesignation "PASS",
   :fibo-fnd-utl-av/preferredDesignation "PASS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "pass"})

(def Passage
  "PSGE"
  {:db/ident :fibo-fnd-plc-uspsai/Passage,
   :fibo-fnd-utl-av/commonDesignation "PASSAGE",
   :fibo-fnd-utl-av/preferredDesignation "PSGE",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "passage"})

(def Path
  "PATH"
  {:db/ident :fibo-fnd-plc-uspsai/Path,
   :fibo-fnd-utl-av/commonDesignation ["PATHS" "PATH"],
   :fibo-fnd-utl-av/preferredDesignation "PATH",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "path"})

(def Pike
  "PIKE"
  {:db/ident :fibo-fnd-plc-uspsai/Pike,
   :fibo-fnd-utl-av/commonDesignation ["PIKES" "PIKE"],
   :fibo-fnd-utl-av/preferredDesignation "PIKE",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "pike"})

(def Pine
  "PNE"
  {:db/ident :fibo-fnd-plc-uspsai/Pine,
   :fibo-fnd-utl-av/commonDesignation "PINE",
   :fibo-fnd-utl-av/preferredDesignation "PNE",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "pine"})

(def Pines
  "PNES"
  {:db/ident :fibo-fnd-plc-uspsai/Pines,
   :fibo-fnd-utl-av/commonDesignation ["PNES" "PINES"],
   :fibo-fnd-utl-av/preferredDesignation "PNES",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "pines"})

(def Place
  "PL"
  {:db/ident :fibo-fnd-plc-uspsai/Place,
   :fibo-fnd-utl-av/commonDesignation "PL",
   :fibo-fnd-utl-av/preferredDesignation "PL",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "place"})

(def Plain
  "PLN"
  {:db/ident :fibo-fnd-plc-uspsai/Plain,
   :fibo-fnd-utl-av/commonDesignation ["PLN" "PLAIN"],
   :fibo-fnd-utl-av/preferredDesignation "PLN",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "plain"})

(def Plains
  "PLNS"
  {:db/ident :fibo-fnd-plc-uspsai/Plains,
   :fibo-fnd-utl-av/commonDesignation ["PLNS" "PLAINS"],
   :fibo-fnd-utl-av/preferredDesignation "PLNS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "plains"})

(def Plaza
  "PLZ"
  {:db/ident :fibo-fnd-plc-uspsai/Plaza,
   :fibo-fnd-utl-av/commonDesignation ["PLZA" "PLZ" "PLAZA"],
   :fibo-fnd-utl-av/preferredDesignation "PLZ",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "plaza"})

(def Point
  "PT"
  {:db/ident :fibo-fnd-plc-uspsai/Point,
   :fibo-fnd-utl-av/commonDesignation ["PT" "POINT"],
   :fibo-fnd-utl-av/preferredDesignation "PT",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "point"})

(def Points
  "PTS"
  {:db/ident :fibo-fnd-plc-uspsai/Points,
   :fibo-fnd-utl-av/commonDesignation ["PTS" "POINTS"],
   :fibo-fnd-utl-av/preferredDesignation "PTS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "points"})

(def Port
  "PRT"
  {:db/ident :fibo-fnd-plc-uspsai/Port,
   :fibo-fnd-utl-av/commonDesignation ["PRT" "PORT"],
   :fibo-fnd-utl-av/preferredDesignation "PRT",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "port"})

(def Ports
  "PRTS"
  {:db/ident :fibo-fnd-plc-uspsai/Ports,
   :fibo-fnd-utl-av/commonDesignation ["PRTS" "PORTS"],
   :fibo-fnd-utl-av/preferredDesignation "PRTS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "ports"})

(def Prairie
  "PR"
  {:db/ident :fibo-fnd-plc-uspsai/Prairie,
   :fibo-fnd-utl-av/commonDesignation ["PRR" "PRAIRIE" "PR"],
   :fibo-fnd-utl-av/preferredDesignation "PR",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "prairie"})

(def QC
  "Canadian and US-specific code for the designation for Quebec"
  {:cmns-cxtdsg/isUsedBy [:lcc-3166-1/UnitedStatesOfAmerica :lcc-3166-1/Canada],
   :cmns-dsg/denotes :lcc-3166-2-ca/Quebec,
   :cmns-id/identifies :lcc-3166-2-ca/Quebec,
   :db/ident :fibo-fnd-plc-uspsai/QC,
   :fibo-fnd-rel-rel/hasTag "QC",
   :fibo-fnd-utl-av/preferredDesignation "QC",
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "QC",
   :skos/definition
   "Canadian and US-specific code for the designation for Quebec"})

(def RI
  "US-specific code for the designation for Rhode Island"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/RhodeIsland,
   :cmns-id/identifies :lcc-3166-2-us/RhodeIsland,
   :db/ident :fibo-fnd-plc-uspsai/RI,
   :fibo-fnd-rel-rel/hasTag "RI",
   :fibo-fnd-utl-av/preferredDesignation "RI",
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "RI",
   :skos/definition "US-specific code for the designation for Rhode Island"})

(def Radial
  "RADL"
  {:db/ident :fibo-fnd-plc-uspsai/Radial,
   :fibo-fnd-utl-av/commonDesignation ["RADL" "RADIEL" "RADIAL" "RAD"],
   :fibo-fnd-utl-av/preferredDesignation "RADL",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "radial"})

(def Ramp
  "RAMP"
  {:db/ident :fibo-fnd-plc-uspsai/Ramp,
   :fibo-fnd-utl-av/commonDesignation "RAMP",
   :fibo-fnd-utl-av/preferredDesignation "RAMP",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "ramp"})

(def Ranch
  "RNCH"
  {:db/ident :fibo-fnd-plc-uspsai/Ranch,
   :fibo-fnd-utl-av/commonDesignation ["RNCHS" "RNCH" "RANCHES" "RANCH"],
   :fibo-fnd-utl-av/preferredDesignation "RNCH",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "ranch"})

(def Rapid
  "RPD"
  {:db/ident :fibo-fnd-plc-uspsai/Rapid,
   :fibo-fnd-utl-av/commonDesignation ["RPD" "RAPID"],
   :fibo-fnd-utl-av/preferredDesignation "RPD",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "rapid"})

(def Rapids
  "RPDS"
  {:db/ident :fibo-fnd-plc-uspsai/Rapids,
   :fibo-fnd-utl-av/commonDesignation ["RPDS" "RAPIDS"],
   :fibo-fnd-utl-av/preferredDesignation "RPDS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "rapids"})

(def Rest
  "RST"
  {:db/ident :fibo-fnd-plc-uspsai/Rest,
   :fibo-fnd-utl-av/commonDesignation ["RST" "REST"],
   :fibo-fnd-utl-av/preferredDesignation "RST",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "rest"})

(def Ridge
  "RDG"
  {:db/ident :fibo-fnd-plc-uspsai/Ridge,
   :fibo-fnd-utl-av/commonDesignation ["RIDGE" "RDGE" "RDG"],
   :fibo-fnd-utl-av/preferredDesignation "RDG",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "ridge"})

(def Ridges
  "RDGS"
  {:db/ident :fibo-fnd-plc-uspsai/Ridges,
   :fibo-fnd-utl-av/commonDesignation ["RIDGES" "RDGS"],
   :fibo-fnd-utl-av/preferredDesignation "RDGS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "ridges"})

(def River
  "RIV"
  {:db/ident :fibo-fnd-plc-uspsai/River,
   :fibo-fnd-utl-av/commonDesignation ["RVR" "RIVR" "RIVER" "RIV"],
   :fibo-fnd-utl-av/preferredDesignation "RIV",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "river"})

(def Road
  "RD"
  {:db/ident :fibo-fnd-plc-uspsai/Road,
   :fibo-fnd-utl-av/commonDesignation ["ROAD" "RD"],
   :fibo-fnd-utl-av/preferredDesignation "RD",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "road"})

(def Roads
  "RDS"
  {:db/ident :fibo-fnd-plc-uspsai/Roads,
   :fibo-fnd-utl-av/commonDesignation ["ROADS" "RDS"],
   :fibo-fnd-utl-av/preferredDesignation "RDS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "roads"})

(def Route
  "RTE"
  {:db/ident :fibo-fnd-plc-uspsai/Route,
   :fibo-fnd-utl-av/commonDesignation "ROUTE",
   :fibo-fnd-utl-av/preferredDesignation "RTE",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "route"})

(def Row
  "ROW"
  {:db/ident :fibo-fnd-plc-uspsai/Row,
   :fibo-fnd-utl-av/commonDesignation "ROW",
   :fibo-fnd-utl-av/preferredDesignation "ROW",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "row"})

(def Rue
  "RUE"
  {:db/ident :fibo-fnd-plc-uspsai/Rue,
   :fibo-fnd-utl-av/commonDesignation "RUE",
   :fibo-fnd-utl-av/preferredDesignation "RUE",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "rue"})

(def Run
  "RUN"
  {:db/ident :fibo-fnd-plc-uspsai/Run,
   :fibo-fnd-utl-av/commonDesignation "RUN",
   :fibo-fnd-utl-av/preferredDesignation "RUN",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "run"})

(def SC
  "US-specific code for the designation for South Carolina"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/SouthCarolina,
   :cmns-id/identifies :lcc-3166-2-us/SouthCarolina,
   :db/ident :fibo-fnd-plc-uspsai/SC,
   :fibo-fnd-rel-rel/hasTag "SC",
   :fibo-fnd-utl-av/preferredDesignation "SC",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "SC",
   :skos/definition "US-specific code for the designation for South Carolina"})

(def SD
  "US-specific code for the designation for South Dakota"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/SouthDakota,
   :cmns-id/identifies :lcc-3166-2-us/SouthDakota,
   :db/ident :fibo-fnd-plc-uspsai/SD,
   :fibo-fnd-rel-rel/hasTag "SD",
   :fibo-fnd-utl-av/preferredDesignation "SD",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "SD",
   :skos/definition "US-specific code for the designation for South Dakota"})

(def SK
  "Canadian and US-specific code for the designation for Saskatchewan"
  {:cmns-cxtdsg/isUsedBy [:lcc-3166-1/UnitedStatesOfAmerica :lcc-3166-1/Canada],
   :cmns-dsg/denotes :lcc-3166-2-ca/Saskatchewan,
   :cmns-id/identifies :lcc-3166-2-ca/Saskatchewan,
   :db/ident :fibo-fnd-plc-uspsai/SK,
   :fibo-fnd-rel-rel/hasTag "SK",
   :fibo-fnd-utl-av/preferredDesignation "SK",
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "SK",
   :skos/definition
   "Canadian and US-specific code for the designation for Saskatchewan"})

(def Shoal
  "SHL"
  {:db/ident :fibo-fnd-plc-uspsai/Shoal,
   :fibo-fnd-utl-av/commonDesignation ["SHOAL" "SHL"],
   :fibo-fnd-utl-av/preferredDesignation "SHL",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "shoal"})

(def Shoals
  "SHLS"
  {:db/ident :fibo-fnd-plc-uspsai/Shoals,
   :fibo-fnd-utl-av/commonDesignation ["SHOALS" "SHLS"],
   :fibo-fnd-utl-av/preferredDesignation "SHLS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "shoals"})

(def Shore
  "SHR"
  {:db/ident :fibo-fnd-plc-uspsai/Shore,
   :fibo-fnd-utl-av/commonDesignation ["SHR" "SHORE" "SHOAR"],
   :fibo-fnd-utl-av/preferredDesignation "SHR",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "shore"})

(def Shores
  "SHRS"
  {:db/ident :fibo-fnd-plc-uspsai/Shores,
   :fibo-fnd-utl-av/commonDesignation ["SHRS" "SHORES" "SHOARS"],
   :fibo-fnd-utl-av/preferredDesignation "SHRS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "shores"})

(def Skyway
  "SKWY"
  {:db/ident :fibo-fnd-plc-uspsai/Skyway,
   :fibo-fnd-utl-av/commonDesignation "SKYWAY",
   :fibo-fnd-utl-av/preferredDesignation "SKWY",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "skyway"})

(def Spring
  "SPG"
  {:db/ident :fibo-fnd-plc-uspsai/Spring,
   :fibo-fnd-utl-av/commonDesignation ["SPRNG" "SPRING" "SPNG" "SPG"],
   :fibo-fnd-utl-av/preferredDesignation "SPG",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "spring"})

(def Springs
  "SPGS"
  {:db/ident :fibo-fnd-plc-uspsai/Springs,
   :fibo-fnd-utl-av/commonDesignation ["SPRNGS" "SPRINGS" "SPNGS" "SPGS"],
   :fibo-fnd-utl-av/preferredDesignation "SPGS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "springs"})

(def Spur
  "SPUR"
  {:db/ident :fibo-fnd-plc-uspsai/Spur,
   :fibo-fnd-utl-av/commonDesignation "SPUR",
   :fibo-fnd-utl-av/preferredDesignation "SPUR",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "spur"})

(def Spurs
  "SPUR"
  {:db/ident :fibo-fnd-plc-uspsai/Spurs,
   :fibo-fnd-utl-av/commonDesignation "SPURS",
   :fibo-fnd-utl-av/preferredDesignation "SPUR",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "spurs"})

(def Square
  {:db/ident :fibo-fnd-plc-uspsai/Square,
   :fibo-fnd-utl-av/commonDesignation ["SQRE" "SQUARE" "SQR" "SQU" "SQ"],
   :fibo-fnd-utl-av/preferredDesignation "SQ",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "square"})

(def Squares
  "SQS"
  {:db/ident :fibo-fnd-plc-uspsai/Squares,
   :fibo-fnd-utl-av/commonDesignation ["SQUARES" "SQRS"],
   :fibo-fnd-utl-av/preferredDesignation "SQS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "squares"})

(def Station
  "STA"
  {:db/ident :fibo-fnd-plc-uspsai/Station,
   :fibo-fnd-utl-av/commonDesignation ["STN" "STATN" "STATION" "STA"],
   :fibo-fnd-utl-av/preferredDesignation "STA",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "station"})

(def Stravenue
  {:db/ident :fibo-fnd-plc-uspsai/Stravenue,
   :fibo-fnd-utl-av/commonDesignation
   ["STRAV" "STRA" "STRAVENUE" "STRAVEN" "STRAVN" "STRVN" "STRVNUE"],
   :fibo-fnd-utl-av/preferredDesignation "STRA",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "stravenue"})

(def Stream
  "STRM"
  {:db/ident :fibo-fnd-plc-uspsai/Stream,
   :fibo-fnd-utl-av/commonDesignation ["STRM" "STREME" "STREAM"],
   :fibo-fnd-utl-av/preferredDesignation "STRM",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "stream"})

(def Street
  "ST"
  {:db/ident :fibo-fnd-plc-uspsai/Street,
   :fibo-fnd-utl-av/commonDesignation ["STRT" "STREET" "STR" "ST"],
   :fibo-fnd-utl-av/preferredDesignation "ST",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "street"})

(def Streets
  "STS"
  {:db/ident :fibo-fnd-plc-uspsai/Streets,
   :fibo-fnd-utl-av/commonDesignation "STREETS",
   :fibo-fnd-utl-av/preferredDesignation "STS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "streets"})

(def Summit
  "SMT"
  {:db/ident :fibo-fnd-plc-uspsai/Summit,
   :fibo-fnd-utl-av/commonDesignation ["SUMMIT" "SUMITT" "SUMIT" "SMT"],
   :fibo-fnd-utl-av/preferredDesignation "SMT",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "summit"})

(def TN
  "US-specific code for the designation for Tennessee"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Tennessee,
   :cmns-id/identifies :lcc-3166-2-us/Tennessee,
   :db/ident :fibo-fnd-plc-uspsai/TN,
   :fibo-fnd-rel-rel/hasTag "TN",
   :fibo-fnd-utl-av/preferredDesignation "TN",
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "TN",
   :skos/definition "US-specific code for the designation for Tennessee"})

(def TX
  "US-specific code for the designation for Texas"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Texas,
   :cmns-id/identifies :lcc-3166-2-us/Texas,
   :db/ident :fibo-fnd-plc-uspsai/TX,
   :fibo-fnd-rel-rel/hasTag "TX",
   :fibo-fnd-utl-av/preferredDesignation "TX",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "TX",
   :skos/definition "US-specific code for the designation for Texas"})

(def Terrace
  "TER"
  {:db/ident :fibo-fnd-plc-uspsai/Terrace,
   :fibo-fnd-utl-av/commonDesignation ["TERRACE" "TERR" "TER"],
   :fibo-fnd-utl-av/preferredDesignation "TER",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "terrace"})

(def Throughway
  "TRWY"
  {:db/ident :fibo-fnd-plc-uspsai/Throughway,
   :fibo-fnd-utl-av/commonDesignation "THROUGHWAY",
   :fibo-fnd-utl-av/preferredDesignation "TRWY",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "throughway"})

(def Trace
  "TRCE"
  {:db/ident :fibo-fnd-plc-uspsai/Trace,
   :fibo-fnd-utl-av/commonDesignation ["TRCE" "TRACES" "TRACE"],
   :fibo-fnd-utl-av/preferredDesignation "TRCE",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "trace"})

(def Track
  {:db/ident :fibo-fnd-plc-uspsai/Track,
   :fibo-fnd-utl-av/commonDesignation ["TRACKS" "TRKS" "TRACK" "TRK" "TRAK"],
   :fibo-fnd-utl-av/preferredDesignation "TRAK",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/StreetSuffix],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "track"})

(def Trafficway
  "TRFY"
  {:db/ident :fibo-fnd-plc-uspsai/Trafficway,
   :fibo-fnd-utl-av/commonDesignation "TRAFFICWAY",
   :fibo-fnd-utl-av/preferredDesignation "TRFY",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "trafficway"})

(def Trail
  "TRL"
  {:db/ident :fibo-fnd-plc-uspsai/Trail,
   :fibo-fnd-utl-av/commonDesignation ["TRLS" "TRL" "TRAILS" "TRAIL"],
   :fibo-fnd-utl-av/preferredDesignation "TRL",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "trail"})

(def Trailer
  "TRLR"
  {:db/ident :fibo-fnd-plc-uspsai/Trailer,
   :fibo-fnd-utl-av/commonDesignation ["TRLRS" "TRLR" "TRAILER"],
   :fibo-fnd-utl-av/preferredDesignation "TRLR",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "trailer"})

(def Tunnel
  {:db/ident :fibo-fnd-plc-uspsai/Tunnel,
   :fibo-fnd-utl-av/commonDesignation
   ["TUNL" "TUNNEL" "TUNNELS" "TUNLS" "TUNNL" "TUNEL"],
   :fibo-fnd-utl-av/preferredDesignation "TUNL",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/StreetSuffix],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "tunnel"})

(def Turnpike
  "TPKE"
  {:db/ident :fibo-fnd-plc-uspsai/Turnpike,
   :fibo-fnd-utl-av/commonDesignation ["TURNPK" "TURNPIKE" "TRNPK"],
   :fibo-fnd-utl-av/preferredDesignation "TPKE",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "turnpike"})

(def UM
  "US-specific code for the designation for the United States Minor Outlying Islands"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/UnitedStatesMinorOutlyingIslands,
   :cmns-id/identifies :lcc-3166-2-us/UnitedStatesMinorOutlyingIslands,
   :db/ident :fibo-fnd-plc-uspsai/UM,
   :fibo-fnd-rel-rel/hasTag "UM",
   :fibo-fnd-utl-av/preferredDesignation "UM",
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "UM",
   :skos/definition
   "US-specific code for the designation for the United States Minor Outlying Islands"})

(def US-AA
  "subdivision code for the state designation for Armed Forces Americas, excluding Canada"
  {:cmns-dsg/denotes :fibo-fnd-plc-uspsai/ArmedForcesAmericas,
   :cmns-id/identifies :fibo-fnd-plc-uspsai/ArmedForcesAmericas,
   :db/ident :fibo-fnd-plc-uspsai/US-AA,
   :fibo-fnd-rel-rel/hasTag "US-AA",
   :fibo-fnd-utl-av/preferredDesignation "AA",
   :rdf/type [:lcc-cr/GeographicRegionIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "US-AA",
   :skos/definition
   "subdivision code for the state designation for Armed Forces Americas, excluding Canada"})

(def US-AE
  "subdivision code for the state designation for Armed Forces Europe, the Middle East, and Canada"
  {:cmns-dsg/denotes :fibo-fnd-plc-uspsai/ArmedForcesEurope,
   :cmns-id/identifies :fibo-fnd-plc-uspsai/ArmedForcesEurope,
   :db/ident :fibo-fnd-plc-uspsai/US-AE,
   :fibo-fnd-rel-rel/hasTag "US-AE",
   :fibo-fnd-utl-av/preferredDesignation "AE",
   :rdf/type [:lcc-cr/GeographicRegionIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "US-AE",
   :skos/definition
   "subdivision code for the state designation for Armed Forces Europe, the Middle East, and Canada"})

(def US-AP
  "subdivision code for the state designation for Armed Forces Pacific"
  {:cmns-dsg/denotes :fibo-fnd-plc-uspsai/ArmedForcesPacific,
   :cmns-id/identifies :fibo-fnd-plc-uspsai/ArmedForcesPacific,
   :db/ident :fibo-fnd-plc-uspsai/US-AP,
   :fibo-fnd-rel-rel/hasTag "US-AP",
   :fibo-fnd-utl-av/preferredDesignation "AP",
   :rdf/type [:lcc-cr/GeographicRegionIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "US-AP",
   :skos/definition
   "subdivision code for the state designation for Armed Forces Pacific"})

(def UT
  "US-specific code for the designation for Utah"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Utah,
   :cmns-id/identifies :lcc-3166-2-us/Utah,
   :db/ident :fibo-fnd-plc-uspsai/UT,
   :fibo-fnd-rel-rel/hasTag "UT",
   :fibo-fnd-utl-av/preferredDesignation "UT",
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "UT",
   :skos/definition "US-specific code for the designation for Utah"})

(def Underpass
  "UPAS"
  {:db/ident :fibo-fnd-plc-uspsai/Underpass,
   :fibo-fnd-utl-av/commonDesignation "UNDERPASS",
   :fibo-fnd-utl-av/preferredDesignation "UPAS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "underpass"})

(def Union
  "UN"
  {:db/ident :fibo-fnd-plc-uspsai/Union,
   :fibo-fnd-utl-av/commonDesignation ["UNION" "UN"],
   :fibo-fnd-utl-av/preferredDesignation "UN",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "union"})

(def Unions
  "UNS"
  {:db/ident :fibo-fnd-plc-uspsai/Unions,
   :fibo-fnd-utl-av/commonDesignation "UNIONS",
   :fibo-fnd-utl-av/preferredDesignation "UNS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "unions"})

(def VA
  "US-specific code for the designation for Virginia"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Virginia,
   :cmns-id/identifies :lcc-3166-2-us/Virginia,
   :db/ident :fibo-fnd-plc-uspsai/VA,
   :fibo-fnd-rel-rel/hasTag "VA",
   :fibo-fnd-utl-av/preferredDesignation "VA",
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "VA",
   :skos/definition "US-specific code for the designation for Virginia"})

(def VI
  "US-specific code for the designation for the U.S. Virgin Islands"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/VirginIslands,
   :cmns-id/identifies :lcc-3166-2-us/VirginIslands,
   :db/ident :fibo-fnd-plc-uspsai/VI,
   :fibo-fnd-rel-rel/hasTag "VI",
   :fibo-fnd-utl-av/preferredDesignation "VI",
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "VI",
   :skos/definition
   "US-specific code for the designation for the U.S. Virgin Islands"})

(def VT
  "US-specific code for the designation for Vermont"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Vermont,
   :cmns-id/identifies :lcc-3166-2-us/Vermont,
   :db/ident :fibo-fnd-plc-uspsai/VT,
   :fibo-fnd-rel-rel/hasTag "VT",
   :fibo-fnd-utl-av/preferredDesignation "VT",
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "VT",
   :skos/definition "US-specific code for the designation for Vermont"})

(def Valley
  "VLY"
  {:db/ident :fibo-fnd-plc-uspsai/Valley,
   :fibo-fnd-utl-av/commonDesignation ["VLY" "VLLY" "VALLY" "VALLEY"],
   :fibo-fnd-utl-av/preferredDesignation "VLY",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "valley"})

(def Valleys
  "VLYS"
  {:db/ident :fibo-fnd-plc-uspsai/Valleys,
   :fibo-fnd-utl-av/commonDesignation ["VLYS" "VALLEYS"],
   :fibo-fnd-utl-av/preferredDesignation "VLYS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "valleys"})

(def Viaduct
  "VIA"
  {:db/ident :fibo-fnd-plc-uspsai/Viaduct,
   :fibo-fnd-utl-av/commonDesignation ["VIADUCT" "VIADCT" "VIA" "VDCT"],
   :fibo-fnd-utl-av/preferredDesignation "VIA",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "viaduct"})

(def View
  "VW"
  {:db/ident :fibo-fnd-plc-uspsai/View,
   :fibo-fnd-utl-av/commonDesignation ["VW" "VIEW"],
   :fibo-fnd-utl-av/preferredDesignation "VW",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "view"})

(def Views
  "VWS"
  {:db/ident :fibo-fnd-plc-uspsai/Views,
   :fibo-fnd-utl-av/commonDesignation ["VWS" "VIEWS"],
   :fibo-fnd-utl-av/preferredDesignation "VWS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "views"})

(def Village
  {:db/ident :fibo-fnd-plc-uspsai/Village,
   :fibo-fnd-utl-av/commonDesignation
   ["VILLAG" "VILLG" "VILLIAGE" "VLG" "VILL" "VILLAGE"],
   :fibo-fnd-utl-av/preferredDesignation "VLG",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/StreetSuffix],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "village"})

(def Villages
  "VLGS"
  {:db/ident :fibo-fnd-plc-uspsai/Villages,
   :fibo-fnd-utl-av/commonDesignation ["VLGS" "VILLAGES"],
   :fibo-fnd-utl-av/preferredDesignation "VLGS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "villages"})

(def Ville
  "VL"
  {:db/ident :fibo-fnd-plc-uspsai/Ville,
   :fibo-fnd-utl-av/commonDesignation ["VL" "VILLE"],
   :fibo-fnd-utl-av/preferredDesignation "VL",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "ville"})

(def Vista
  "vista"
  {:db/ident :fibo-fnd-plc-uspsai/Vista,
   :fibo-fnd-utl-av/commonDesignation ["VISTA" "VSTA" "VIST" "VIS" "VST"],
   :fibo-fnd-utl-av/preferredDesignation "VIS",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/StreetSuffix],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "vista"})

(def WA
  "US-specific code for the designation for Washington"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Washington,
   :cmns-id/identifies :lcc-3166-2-us/Washington,
   :db/ident :fibo-fnd-plc-uspsai/WA,
   :fibo-fnd-rel-rel/hasTag "WA",
   :fibo-fnd-utl-av/preferredDesignation "WA",
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "WA",
   :skos/definition "US-specific code for the designation for Washington"})

(def WI
  "US-specific code for the designation for Wisconsin"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Wisconsin,
   :cmns-id/identifies :lcc-3166-2-us/Wisconsin,
   :db/ident :fibo-fnd-plc-uspsai/WI,
   :fibo-fnd-rel-rel/hasTag "WI",
   :fibo-fnd-utl-av/preferredDesignation "WI",
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "WI",
   :skos/definition "US-specific code for the designation for Wisconsin"})

(def WV
  "US-specific code for the designation for West Virginia"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/WestVirginia,
   :cmns-id/identifies :lcc-3166-2-us/WestVirginia,
   :db/ident :fibo-fnd-plc-uspsai/WV,
   :fibo-fnd-rel-rel/hasTag "WV",
   :fibo-fnd-utl-av/preferredDesignation "WV",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "WV",
   :skos/definition "US-specific code for the designation for West Virginia"})

(def WY
  "US-specific code for the designation for Wyoming"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Wyoming,
   :cmns-id/identifies :lcc-3166-2-us/Wyoming,
   :db/ident :fibo-fnd-plc-uspsai/WY,
   :fibo-fnd-rel-rel/hasTag "WY",
   :fibo-fnd-utl-av/preferredDesignation "WY",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "WY",
   :skos/definition "US-specific code for the designation for Wyoming"})

(def Walk
  "WALK"
  {:db/ident :fibo-fnd-plc-uspsai/Walk,
   :fibo-fnd-utl-av/commonDesignation "WALK",
   :fibo-fnd-utl-av/preferredDesignation "WALK",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "walk"})

(def Walks
  "WALK"
  {:db/ident :fibo-fnd-plc-uspsai/Walks,
   :fibo-fnd-utl-av/commonDesignation "WALKS",
   :fibo-fnd-utl-av/preferredDesignation "WALK",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "walks"})

(def Wall
  "WALL"
  {:db/ident :fibo-fnd-plc-uspsai/Wall,
   :fibo-fnd-utl-av/commonDesignation "WALL",
   :fibo-fnd-utl-av/preferredDesignation "WALL",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "wall"})

(def Way
  "WAY"
  {:db/ident :fibo-fnd-plc-uspsai/Way,
   :fibo-fnd-utl-av/commonDesignation ["WY" "WAY"],
   :fibo-fnd-utl-av/preferredDesignation "WAY",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "way"})

(def Ways
  "WAYS"
  {:db/ident :fibo-fnd-plc-uspsai/Ways,
   :fibo-fnd-utl-av/commonDesignation "WAYS",
   :fibo-fnd-utl-av/preferredDesignation "WAYS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "ways"})

(def Well
  "WL"
  {:db/ident :fibo-fnd-plc-uspsai/Well,
   :fibo-fnd-utl-av/commonDesignation "WELL",
   :fibo-fnd-utl-av/preferredDesignation "WL",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "well"})

(def Wells
  "WLS"
  {:db/ident :fibo-fnd-plc-uspsai/Wells,
   :fibo-fnd-utl-av/commonDesignation ["WLS" "WELLS"],
   :fibo-fnd-utl-av/preferredDesignation "WLS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "wells"})

(def YT
  "Canadian and US-specific code for the designation for Yukon"
  {:cmns-cxtdsg/isUsedBy [:lcc-3166-1/UnitedStatesOfAmerica :lcc-3166-1/Canada],
   :cmns-dsg/denotes :lcc-3166-2-ca/Yukon,
   :cmns-id/identifies :lcc-3166-2-ca/Yukon,
   :db/ident :fibo-fnd-plc-uspsai/YT,
   :fibo-fnd-rel-rel/hasTag "YT",
   :fibo-fnd-utl-av/preferredDesignation "YT",
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "YT",
   :skos/definition
   "Canadian and US-specific code for the designation for Yukon"})