(ns net.wikipunk.rdf.fibo-fnd-plc-uspsai
  "This ontology augments the U.S. Postal Service Address ontology with individuals for various street suffixes, military and U.S. Department of State specific individuals, and preferred designations for state and territory codes."
  {:cmns-av/copyright ["Copyright (c) 2019-2022 EDM Council, Inc."
                       "Copyright (c) 2019-2022 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :dcterms/abstract
   "This ontology augments the U.S. Postal Service Address ontology with individuals for various street suffixes, military and U.S. Department of State specific individuals, and preferred designations for state and territory codes.",
   :dcterms/contributor "Thematix Partners LLC",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/NorthAmerica/USPostalServiceAddresses/"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CA/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Addresses/"
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-US/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-plc-adr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/",
    "fibo-fnd-plc-uspsai"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "lcc-3166-1"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
    "lcc-3166-2-ca"
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CA/",
    "lcc-3166-2-us"
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-US/",
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "lcc-lr" "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfa/prefix "fibo-fnd-plc-uspsai",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "U.S. Postal Service Addresses Individuals Ontology",
   :rdfs/seeAlso ["https://pe.usps.com/cpim/ftp/pubs/Pub28/pub28.pdf"
                  "https://about.usps.com/who/profile/"],
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals.rdf version of this ontology was revised to update a dead link."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."]})

(def AA
  "US-specific code for the state designation for Armed Forces Americas, excluding Canada"
  {:db/ident :fibo-fnd-plc-uspsai/AA,
   :fibo-fnd-utl-av/preferredDesignation "AA",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :fibo-fnd-plc-uspsai/ArmedForcesAmericas,
   :lcc-lr/hasTag "AA",
   :lcc-lr/identifies :fibo-fnd-plc-uspsai/ArmedForcesAmericas,
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "AA",
   :skos/definition
   "US-specific code for the state designation for Armed Forces Americas, excluding Canada"})

(def AB
  "Canadian and US-specific code for the designation for Alberta"
  {:db/ident :fibo-fnd-plc-uspsai/AB,
   :fibo-fnd-utl-av/preferredDesignation "AB",
   :lcc-cr/isUsedBy [:lcc-3166-1/Canada :lcc-3166-1/UnitedStatesOfAmerica],
   :lcc-lr/denotes :lcc-3166-2-ca/Alberta,
   :lcc-lr/hasTag "AB",
   :lcc-lr/identifies :lcc-3166-2-ca/Alberta,
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "AB",
   :skos/definition
   "Canadian and US-specific code for the designation for Alberta"})

(def AE
  "US-specific code for the state designation for Armed Forces Europe, the Middle East, and Canada"
  {:db/ident :fibo-fnd-plc-uspsai/AE,
   :fibo-fnd-utl-av/preferredDesignation "AE",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :fibo-fnd-plc-uspsai/ArmedForcesEurope,
   :lcc-lr/hasTag "AE",
   :lcc-lr/identifies :fibo-fnd-plc-uspsai/ArmedForcesEurope,
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "AE",
   :skos/definition
   "US-specific code for the state designation for Armed Forces Europe, the Middle East, and Canada"})

(def AK
  "US-specific code for the designation for Alaska"
  {:db/ident :fibo-fnd-plc-uspsai/AK,
   :fibo-fnd-utl-av/preferredDesignation "AK",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :lcc-3166-2-us/Alaska,
   :lcc-lr/hasTag "AK",
   :lcc-lr/identifies :lcc-3166-2-us/Alaska,
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "AK",
   :skos/definition "US-specific code for the designation for Alaska"})

(def AL
  "US-specific code for the designation for Alabama"
  {:db/ident :fibo-fnd-plc-uspsai/AL,
   :fibo-fnd-utl-av/preferredDesignation "AL",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :lcc-3166-2-us/Alabama,
   :lcc-lr/hasTag "AL",
   :lcc-lr/identifies :lcc-3166-2-us/Alabama,
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "AL",
   :skos/definition "US-specific code for the designation for Alabama"})

(def AP
  "US-specific code for the state designation for Armed Forces Pacific"
  {:db/ident :fibo-fnd-plc-uspsai/AP,
   :fibo-fnd-utl-av/preferredDesignation "AP",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :fibo-fnd-plc-uspsai/ArmedForcesPacific,
   :lcc-lr/hasTag "AP",
   :lcc-lr/identifies :fibo-fnd-plc-uspsai/ArmedForcesPacific,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "AP",
   :skos/definition
   "US-specific code for the state designation for Armed Forces Pacific"})

(def AR
  "US-specific code for the designation for Arkansas"
  {:db/ident :fibo-fnd-plc-uspsai/AR,
   :fibo-fnd-utl-av/preferredDesignation "AR",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :lcc-3166-2-us/Arkansas,
   :lcc-lr/hasTag "AR",
   :lcc-lr/identifies :lcc-3166-2-us/Arkansas,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "AR",
   :skos/definition "US-specific code for the designation for Arkansas"})

(def AS
  "US-specific code for the designation for American Samoa"
  {:db/ident :fibo-fnd-plc-uspsai/AS,
   :fibo-fnd-utl-av/preferredDesignation "AS",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :lcc-3166-2-us/AmericanSamoa,
   :lcc-lr/hasTag "AS",
   :lcc-lr/identifies :lcc-3166-2-us/AmericanSamoa,
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "AS",
   :skos/definition "US-specific code for the designation for American Samoa"})

(def AZ
  "US-specific code for the designation for Arizona"
  {:db/ident :fibo-fnd-plc-uspsai/AZ,
   :fibo-fnd-utl-av/preferredDesignation "AZ",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :lcc-3166-2-us/Arizona,
   :lcc-lr/hasTag "AZ",
   :lcc-lr/identifies :lcc-3166-2-us/Arizona,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "AZ",
   :skos/definition "US-specific code for the designation for Arizona"})

(def Alley
  "narrow passageway between or behind buildings"
  {:db/ident :fibo-fnd-plc-uspsai/Alley,
   :fibo-fnd-utl-av/commonDesignation ["ALY" "ALLEE" "ALLEY" "ALLY"],
   :fibo-fnd-utl-av/preferredDesignation "ALY",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/StreetSuffix],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "alley",
   :skos/definition "narrow passageway between or behind buildings"})

(def Annex
  "addition appended to something else, such as another street"
  {:db/ident :fibo-fnd-plc-uspsai/Annex,
   :fibo-fnd-utl-av/commonDesignation ["ANEX" "ANX" "ANNEX" "ANNX"],
   :fibo-fnd-utl-av/preferredDesignation "ANX",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/StreetSuffix],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
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
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "arcade",
   :skos/definition
   "arched or covered passageway, usually with shops on each side"})

(def ArmedForcesAmericas
  "state designation for Armed Forces Americas, excluding Canada"
  {:db/ident :fibo-fnd-plc-uspsai/ArmedForcesAmericas,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Armed Forces Americas"},
   :lcc-cr/isClassifiedBy :lcc-3166-2-us/State,
   :lcc-cr/isSubregionOf :lcc-3166-1/UnitedStatesOfAmerica,
   :rdf/type [:lcc-cr/CountrySubdivision :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "Armed Forces Americas",
   :skos/definition
   "state designation for Armed Forces Americas, excluding Canada"})

(def ArmedForcesEurope
  "state designation for Armed Forces Europe, the Middle East, and Canada"
  {:db/ident :fibo-fnd-plc-uspsai/ArmedForcesEurope,
   :lcc-cr/hasEnglishShortName
   {:rdf/language "en",
    :rdf/value    "Armed Forces Europe, the Middle East, and Canada"},
   :lcc-cr/isClassifiedBy :lcc-3166-2-us/State,
   :lcc-cr/isSubregionOf :lcc-3166-1/UnitedStatesOfAmerica,
   :rdf/type [:lcc-cr/CountrySubdivision :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "Armed Forces Europe",
   :skos/definition
   "state designation for Armed Forces Europe, the Middle East, and Canada"})

(def ArmedForcesPacific
  "state designation for Armed Forces Pacific"
  {:db/ident :fibo-fnd-plc-uspsai/ArmedForcesPacific,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Armed Forces Pacific"},
   :lcc-cr/isClassifiedBy :lcc-3166-2-us/State,
   :lcc-cr/isSubregionOf :lcc-3166-1/UnitedStatesOfAmerica,
   :rdf/type [:lcc-cr/CountrySubdivision :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
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
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "avenue",
   :skos/definition
   "broad road in a town or city, typically having trees at regular intervals along its sides"})

(def BC
  "Canadian and US-specific code for the designation for British Columbia"
  {:db/ident :fibo-fnd-plc-uspsai/BC,
   :fibo-fnd-utl-av/preferredDesignation "BC",
   :lcc-cr/isUsedBy [:lcc-3166-1/Canada :lcc-3166-1/UnitedStatesOfAmerica],
   :lcc-lr/denotes :lcc-3166-2-ca/BritishColumbia,
   :lcc-lr/hasTag "BC",
   :lcc-lr/identifies :lcc-3166-2-ca/BritishColumbia,
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
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
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
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
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
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
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
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
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "bluff",
   :skos/definition "broad, rounded cliff"})

(def Bluffs
  "multiple broad, rounded cliffs"
  {:db/ident :fibo-fnd-plc-uspsai/Bluffs,
   :fibo-fnd-utl-av/commonDesignation "BLUFFS",
   :fibo-fnd-utl-av/preferredDesignation "BLFS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "bluffs",
   :skos/definition "multiple broad, rounded cliffs"})

(def Bottom
  "deepest or lowest part of something, such as the bottom of a hill"
  {:db/ident :fibo-fnd-plc-uspsai/Bottom,
   :fibo-fnd-utl-av/commonDesignation ["BOTTOM" "BOT" "BOTTM" "BTM"],
   :fibo-fnd-utl-av/preferredDesignation "BTM",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/StreetSuffix],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
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
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
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
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "branch",
   :skos/definition "division of a road or path"})

(def Bridge
  "structure carrying a road, path, railroad, or canal across a river, ravine, road, railroad, or other obstacle"
  {:db/ident :fibo-fnd-plc-uspsai/Bridge,
   :fibo-fnd-utl-av/commonDesignation ["BRIDGE" "BRG" "BRDGE"],
   :fibo-fnd-utl-av/preferredDesignation "BRG",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
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
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "brook",
   :skos/definition "small, natural freshwater stream"})

(def Brooks
  "multiple small, natural freshwater streams"
  {:db/ident :fibo-fnd-plc-uspsai/Brooks,
   :fibo-fnd-utl-av/commonDesignation "BROOKS",
   :fibo-fnd-utl-av/preferredDesignation "BRKS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "brooks",
   :skos/definition "multiple small, natural freshwater streams"})

(def Burg
  "city or town (informal)"
  {:db/ident :fibo-fnd-plc-uspsai/Burg,
   :fibo-fnd-utl-av/commonDesignation "BURG",
   :fibo-fnd-utl-av/preferredDesignation "BG",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "burg",
   :skos/definition "city or town (informal)"})

(def Burgs
  "multiple cities or towns (informal)"
  {:db/ident :fibo-fnd-plc-uspsai/Burgs,
   :fibo-fnd-utl-av/commonDesignation "BURGS",
   :fibo-fnd-utl-av/preferredDesignation "BGS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "burgs",
   :skos/definition "multiple cities or towns (informal)"})

(def Bypass
  "road passing around a town or its center to provide an alternative route for through traffic"
  {:db/ident :fibo-fnd-plc-uspsai/Bypass,
   :fibo-fnd-utl-av/commonDesignation ["BYPASS" "BYP" "BYPA" "BYPAS" "BYS"],
   :fibo-fnd-utl-av/preferredDesignation "BYP",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/StreetSuffix],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "bypass",
   :skos/definition
   "road passing around a town or its center to provide an alternative route for through traffic"})

(def CA
  "US-specific code for the designation for California"
  {:db/ident :fibo-fnd-plc-uspsai/CA,
   :fibo-fnd-utl-av/preferredDesignation "CA",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :lcc-3166-2-us/California,
   :lcc-lr/hasTag "CA",
   :lcc-lr/identifies :lcc-3166-2-us/California,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "CA",
   :skos/definition "US-specific code for the designation for California"})

(def CO
  "US-specific code for the designation for Colorado"
  {:db/ident :fibo-fnd-plc-uspsai/CO,
   :fibo-fnd-utl-av/preferredDesignation "CO",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :lcc-3166-2-us/Colorado,
   :lcc-lr/hasTag "CO",
   :lcc-lr/identifies :lcc-3166-2-us/Colorado,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "CO",
   :skos/definition "US-specific code for the designation for Colorado"})

(def CT
  "US-specific code for the designation for Connecticut"
  {:db/ident :fibo-fnd-plc-uspsai/CT,
   :fibo-fnd-utl-av/preferredDesignation "CT",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :lcc-3166-2-us/Connecticut,
   :lcc-lr/hasTag "CT",
   :lcc-lr/identifies :lcc-3166-2-us/Connecticut,
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "CT",
   :skos/definition "US-specific code for the designation for Connecticut"})

(def Camp
  "camp"
  {:db/ident :fibo-fnd-plc-uspsai/Camp,
   :fibo-fnd-utl-av/commonDesignation ["CP" "CMP" "CAMP"],
   :fibo-fnd-utl-av/preferredDesignation "CP",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "camp"})

(def Canyon
  "canyon"
  {:db/ident :fibo-fnd-plc-uspsai/Canyon,
   :fibo-fnd-utl-av/commonDesignation ["CNYN" "CANYON" "CANYN"],
   :fibo-fnd-utl-av/preferredDesignation "CYN",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "canyon"})

(def Cape
  "cape"
  {:db/ident :fibo-fnd-plc-uspsai/Cape,
   :fibo-fnd-utl-av/commonDesignation ["CPE" "CAPE"],
   :fibo-fnd-utl-av/preferredDesignation "CPE",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "cape"})

(def Causeway
  "causeway"
  {:db/ident :fibo-fnd-plc-uspsai/Causeway,
   :fibo-fnd-utl-av/commonDesignation ["CSWY" "CAUSWA" "CAUSEWAY"],
   :fibo-fnd-utl-av/preferredDesignation "CSWY",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "causeway"})

(def Center
  "center"
  {:db/ident :fibo-fnd-plc-uspsai/Center,
   :fibo-fnd-utl-av/commonDesignation
   ["CENTRE" "CNTER" "CENT" "CENTER" "CENTR" "CTR" "CNTR" "CEN"],
   :fibo-fnd-utl-av/preferredDesignation "CTR",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "center"})

(def Centers
  "centers"
  {:db/ident :fibo-fnd-plc-uspsai/Centers,
   :fibo-fnd-utl-av/commonDesignation "CENTERS",
   :fibo-fnd-utl-av/preferredDesignation "CTRS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "centers"})

(def Circle
  "circle"
  {:db/ident :fibo-fnd-plc-uspsai/Circle,
   :fibo-fnd-utl-av/commonDesignation
   ["CRCLE" "CIRC" "CIRCL" "CRCL" "CIR" "CIRCLE"],
   :fibo-fnd-utl-av/preferredDesignation "CIR",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "circle"})

(def Circles
  "circles"
  {:db/ident :fibo-fnd-plc-uspsai/Circles,
   :fibo-fnd-utl-av/commonDesignation "CIRCLES",
   :fibo-fnd-utl-av/preferredDesignation "CIRS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "circles"})

(def Cliff
  "cliff"
  {:db/ident :fibo-fnd-plc-uspsai/Cliff,
   :fibo-fnd-utl-av/commonDesignation ["CLIFF" "CLF"],
   :fibo-fnd-utl-av/preferredDesignation "CLF",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "cliff"})

(def Cliffs
  "cliffs"
  {:db/ident :fibo-fnd-plc-uspsai/Cliffs,
   :fibo-fnd-utl-av/commonDesignation ["CLIFFS" "CLFS"],
   :fibo-fnd-utl-av/preferredDesignation "CLFS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "cliffs"})

(def Club
  "club"
  {:db/ident :fibo-fnd-plc-uspsai/Club,
   :fibo-fnd-utl-av/commonDesignation ["CLUB" "CLB"],
   :fibo-fnd-utl-av/preferredDesignation "CLB",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "club"})

(def Common
  "common"
  {:db/ident :fibo-fnd-plc-uspsai/Common,
   :fibo-fnd-utl-av/commonDesignation "COMMON",
   :fibo-fnd-utl-av/preferredDesignation "CMN",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "common"})

(def Commons
  "commons"
  {:db/ident :fibo-fnd-plc-uspsai/Commons,
   :fibo-fnd-utl-av/commonDesignation "COMMONS",
   :fibo-fnd-utl-av/preferredDesignation "CMNS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "commons"})

(def Corner
  "corner"
  {:db/ident :fibo-fnd-plc-uspsai/Corner,
   :fibo-fnd-utl-av/commonDesignation ["CORNER" "COR"],
   :fibo-fnd-utl-av/preferredDesignation "COR",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "corner"})

(def Corners
  "corners"
  {:db/ident :fibo-fnd-plc-uspsai/Corners,
   :fibo-fnd-utl-av/commonDesignation ["CORS" "CORNERS"],
   :fibo-fnd-utl-av/preferredDesignation "CORS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "corners"})

(def Course
  "course"
  {:db/ident :fibo-fnd-plc-uspsai/Course,
   :fibo-fnd-utl-av/commonDesignation ["CRSE" "COURSE"],
   :fibo-fnd-utl-av/preferredDesignation "CRSE",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "course"})

(def Court
  "court"
  {:db/ident :fibo-fnd-plc-uspsai/Court,
   :fibo-fnd-utl-av/commonDesignation ["CT" "COURT"],
   :fibo-fnd-utl-av/preferredDesignation "CT",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "court"})

(def Courts
  "courts"
  {:db/ident :fibo-fnd-plc-uspsai/Courts,
   :fibo-fnd-utl-av/commonDesignation ["CTS" "COURTS"],
   :fibo-fnd-utl-av/preferredDesignation "CTS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "courts"})

(def Cove
  "cove"
  {:db/ident :fibo-fnd-plc-uspsai/Cove,
   :fibo-fnd-utl-av/commonDesignation ["CV" "COVE"],
   :fibo-fnd-utl-av/preferredDesignation "CV",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "cove"})

(def Coves
  "coves"
  {:db/ident :fibo-fnd-plc-uspsai/Coves,
   :fibo-fnd-utl-av/commonDesignation "COVES",
   :fibo-fnd-utl-av/preferredDesignation "CVS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "coves"})

(def Creek
  "creek"
  {:db/ident :fibo-fnd-plc-uspsai/Creek,
   :fibo-fnd-utl-av/commonDesignation ["CRK" "CREEK"],
   :fibo-fnd-utl-av/preferredDesignation "CRK",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "creek"})

(def Crescent
  "crescent"
  {:db/ident :fibo-fnd-plc-uspsai/Crescent,
   :fibo-fnd-utl-av/commonDesignation ["CRSNT" "CRSENT" "CRESCENT" "CRES"],
   :fibo-fnd-utl-av/preferredDesignation "CRES",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "crescent"})

(def Crest
  "crest"
  {:db/ident :fibo-fnd-plc-uspsai/Crest,
   :fibo-fnd-utl-av/commonDesignation "CREST",
   :fibo-fnd-utl-av/preferredDesignation "CRST",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "crest"})

(def Crossing
  "crossing"
  {:db/ident :fibo-fnd-plc-uspsai/Crossing,
   :fibo-fnd-utl-av/commonDesignation ["XING" "CRSSNG" "CROSSING"],
   :fibo-fnd-utl-av/preferredDesignation "XING",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "crossing"})

(def Crossroad
  "crossroad"
  {:db/ident :fibo-fnd-plc-uspsai/Crossroad,
   :fibo-fnd-utl-av/commonDesignation "CROSSROAD",
   :fibo-fnd-utl-av/preferredDesignation "XRD",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "crossroad"})

(def Crossroads
  "crossroads"
  {:db/ident :fibo-fnd-plc-uspsai/Crossroads,
   :fibo-fnd-utl-av/commonDesignation "CROSSROADS",
   :fibo-fnd-utl-av/preferredDesignation "XRDS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "crossroads"})

(def Curve
  "curve"
  {:db/ident :fibo-fnd-plc-uspsai/Curve,
   :fibo-fnd-utl-av/commonDesignation "CURVE",
   :fibo-fnd-utl-av/preferredDesignation "CURV",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "curve"})

(def DC
  "US-specific code for the designation for the District of Colombia"
  {:db/ident :fibo-fnd-plc-uspsai/DC,
   :fibo-fnd-utl-av/preferredDesignation "DC",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :lcc-3166-2-us/DistrictOfColumbia,
   :lcc-lr/hasTag "DC",
   :lcc-lr/identifies :lcc-3166-2-us/DistrictOfColumbia,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "DC",
   :skos/definition
   "US-specific code for the designation for the District of Colombia"})

(def DE
  "US-specific code for the designation for Delaware"
  {:db/ident :fibo-fnd-plc-uspsai/DE,
   :fibo-fnd-utl-av/preferredDesignation "DE",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :lcc-3166-2-us/Delaware,
   :lcc-lr/hasTag "DE",
   :lcc-lr/identifies :lcc-3166-2-us/Delaware,
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "DE",
   :skos/definition "US-specific code for the designation for Delaware"})

(def Dale
  "dale"
  {:db/ident :fibo-fnd-plc-uspsai/Dale,
   :fibo-fnd-utl-av/commonDesignation ["DL" "DALE"],
   :fibo-fnd-utl-av/preferredDesignation "DL",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "dale"})

(def Dam
  "dam"
  {:db/ident :fibo-fnd-plc-uspsai/Dam,
   :fibo-fnd-utl-av/commonDesignation ["DM" "DAM"],
   :fibo-fnd-utl-av/preferredDesignation "DM",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "dam"})

(def Divide
  "divide"
  {:db/ident :fibo-fnd-plc-uspsai/Divide,
   :fibo-fnd-utl-av/commonDesignation ["DVD" "DV" "DIVIDE" "DIV"],
   :fibo-fnd-utl-av/preferredDesignation "DV",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "divide"})

(def Drive
  "drive"
  {:db/ident :fibo-fnd-plc-uspsai/Drive,
   :fibo-fnd-utl-av/commonDesignation ["DRV" "DRIVE" "DRIV" "DR"],
   :fibo-fnd-utl-av/preferredDesignation "DR",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "drive"})

(def Drives
  "drives"
  {:db/ident :fibo-fnd-plc-uspsai/Drives,
   :fibo-fnd-utl-av/commonDesignation "DRIVES",
   :fibo-fnd-utl-av/preferredDesignation "DRS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "drives"})

(def Estate
  "estate"
  {:db/ident :fibo-fnd-plc-uspsai/Estate,
   :fibo-fnd-utl-av/commonDesignation ["ESTATE" "EST"],
   :fibo-fnd-utl-av/preferredDesignation "EST",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "estate"})

(def Estates
  "estates"
  {:db/ident :fibo-fnd-plc-uspsai/Estates,
   :fibo-fnd-utl-av/commonDesignation ["ESTS" "ESTATES"],
   :fibo-fnd-utl-av/preferredDesignation "ESTS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "estates"})

(def Expressway
  "expressway"
  {:db/ident :fibo-fnd-plc-uspsai/Expressway,
   :fibo-fnd-utl-av/commonDesignation
   ["EXPY" "EXPW" "EXPRESS" "EXPRESSWAY" "EXP" "EXPR"],
   :fibo-fnd-utl-av/preferredDesignation "EXPY",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/StreetSuffix],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "expressway"})

(def Extension
  "extension"
  {:db/ident :fibo-fnd-plc-uspsai/Extension,
   :fibo-fnd-utl-av/commonDesignation ["EXTNSN" "EXTN" "EXTENSION" "EXT"],
   :fibo-fnd-utl-av/preferredDesignation "EXT",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "extension"})

(def Extensions
  "extensions"
  {:db/ident :fibo-fnd-plc-uspsai/Extensions,
   :fibo-fnd-utl-av/commonDesignation "EXTS",
   :fibo-fnd-utl-av/preferredDesignation "EXTS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "extensions"})

(def FL
  "US-specific code for the designation for Florida"
  {:db/ident :fibo-fnd-plc-uspsai/FL,
   :fibo-fnd-utl-av/preferredDesignation "FL",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :lcc-3166-2-us/Florida,
   :lcc-lr/hasTag "FL",
   :lcc-lr/identifies :lcc-3166-2-us/Florida,
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "FL",
   :skos/definition "US-specific code for the designation for Florida"})

(def Fall
  "fall"
  {:db/ident :fibo-fnd-plc-uspsai/Fall,
   :fibo-fnd-utl-av/commonDesignation "FALL",
   :fibo-fnd-utl-av/preferredDesignation "FALL",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "fall"})

(def Falls
  "falls"
  {:db/ident :fibo-fnd-plc-uspsai/Falls,
   :fibo-fnd-utl-av/commonDesignation ["FLS" "FALLS"],
   :fibo-fnd-utl-av/preferredDesignation "FLS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "falls"})

(def Ferry
  "ferry"
  {:db/ident :fibo-fnd-plc-uspsai/Ferry,
   :fibo-fnd-utl-av/commonDesignation ["FRY" "FRRY" "FERRY"],
   :fibo-fnd-utl-av/preferredDesignation "FRY",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "ferry"})

(def Field
  "field"
  {:db/ident :fibo-fnd-plc-uspsai/Field,
   :fibo-fnd-utl-av/commonDesignation ["FLD" "FIELD"],
   :fibo-fnd-utl-av/preferredDesignation "FLD",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "field"})

(def Fields
  "fields"
  {:db/ident :fibo-fnd-plc-uspsai/Fields,
   :fibo-fnd-utl-av/commonDesignation ["FLDS" "FIELDS"],
   :fibo-fnd-utl-av/preferredDesignation "FLDS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "fields"})

(def Flat
  "flat"
  {:db/ident :fibo-fnd-plc-uspsai/Flat,
   :fibo-fnd-utl-av/commonDesignation ["FLT" "FLAT"],
   :fibo-fnd-utl-av/preferredDesignation "FLT",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "flat"})

(def Flats
  "flats"
  {:db/ident :fibo-fnd-plc-uspsai/Flats,
   :fibo-fnd-utl-av/commonDesignation ["FLTS" "FLATS"],
   :fibo-fnd-utl-av/preferredDesignation "FLTS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "flats"})

(def Ford
  "ford"
  {:db/ident :fibo-fnd-plc-uspsai/Ford,
   :fibo-fnd-utl-av/commonDesignation ["FRD" "FORD"],
   :fibo-fnd-utl-av/preferredDesignation "FRD",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "ford"})

(def Fords
  "fords"
  {:db/ident :fibo-fnd-plc-uspsai/Fords,
   :fibo-fnd-utl-av/commonDesignation "FORDS",
   :fibo-fnd-utl-av/preferredDesignation "FRDS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "fords"})

(def Forest
  "forest"
  {:db/ident :fibo-fnd-plc-uspsai/Forest,
   :fibo-fnd-utl-av/commonDesignation ["FRST" "FORESTS" "FOREST"],
   :fibo-fnd-utl-av/preferredDesignation "FRST",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "forest"})

(def Forge
  "forge"
  {:db/ident :fibo-fnd-plc-uspsai/Forge,
   :fibo-fnd-utl-av/commonDesignation ["FRG" "FORGE" "FORG"],
   :fibo-fnd-utl-av/preferredDesignation "FRG",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "forge"})

(def Forges
  "forges"
  {:db/ident :fibo-fnd-plc-uspsai/Forges,
   :fibo-fnd-utl-av/commonDesignation "FORGES",
   :fibo-fnd-utl-av/preferredDesignation "FRGS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "forges"})

(def Fork
  "fork"
  {:db/ident :fibo-fnd-plc-uspsai/Fork,
   :fibo-fnd-utl-av/commonDesignation ["FRK" "FORK"],
   :fibo-fnd-utl-av/preferredDesignation "FRK",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "fork"})

(def Forks
  "forks"
  {:db/ident :fibo-fnd-plc-uspsai/Forks,
   :fibo-fnd-utl-av/commonDesignation ["FRKS" "FORKS"],
   :fibo-fnd-utl-av/preferredDesignation "FRKS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "forks"})

(def Fort
  "fort"
  {:db/ident :fibo-fnd-plc-uspsai/Fort,
   :fibo-fnd-utl-av/commonDesignation ["FT" "FRT" "FORT"],
   :fibo-fnd-utl-av/preferredDesignation "FT",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "fort"})

(def Freeway
  "freeway"
  {:db/ident :fibo-fnd-plc-uspsai/Freeway,
   :fibo-fnd-utl-av/commonDesignation ["FWY" "FRWY" "FRWAY" "FREEWY" "FREEWAY"],
   :fibo-fnd-utl-av/preferredDesignation "FWY",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "freeway"})

(def GA
  "US-specific code for the designation for Georgia"
  {:db/ident :fibo-fnd-plc-uspsai/GA,
   :fibo-fnd-utl-av/preferredDesignation "GA",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :lcc-3166-2-us/Georgia,
   :lcc-lr/hasTag "GA",
   :lcc-lr/identifies :lcc-3166-2-us/Georgia,
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "GA",
   :skos/definition "US-specific code for the designation for Georgia"})

(def GU
  "US-specific code for the designation for Guam"
  {:db/ident :fibo-fnd-plc-uspsai/GU,
   :fibo-fnd-utl-av/preferredDesignation "GU",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :lcc-3166-2-us/Guam,
   :lcc-lr/hasTag "GU",
   :lcc-lr/identifies :lcc-3166-2-us/Guam,
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "GU",
   :skos/definition "US-specific code for the designation for Guam"})

(def Garden
  "garden"
  {:db/ident :fibo-fnd-plc-uspsai/Garden,
   :fibo-fnd-utl-av/commonDesignation ["GRDN" "GRDEN" "GARDN" "GARDEN"],
   :fibo-fnd-utl-av/preferredDesignation "GDN",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "garden"})

(def Gardens
  "gardens"
  {:db/ident :fibo-fnd-plc-uspsai/Gardens,
   :fibo-fnd-utl-av/commonDesignation ["GRDNS" "GDNS" "GARDENS"],
   :fibo-fnd-utl-av/preferredDesignation "GDNS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "gardens"})

(def Gateway
  "gateway"
  {:db/ident :fibo-fnd-plc-uspsai/Gateway,
   :fibo-fnd-utl-av/commonDesignation
   ["GTWAY" "GATWAY" "GATEWY" "GTWY" "GATEWAY"],
   :fibo-fnd-utl-av/preferredDesignation "GTWY",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "gateway"})

(def Glen
  "glen"
  {:db/ident :fibo-fnd-plc-uspsai/Glen,
   :fibo-fnd-utl-av/commonDesignation ["GLN" "GLEN"],
   :fibo-fnd-utl-av/preferredDesignation "GLN",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "glen"})

(def Glens
  "glens"
  {:db/ident :fibo-fnd-plc-uspsai/Glens,
   :fibo-fnd-utl-av/commonDesignation "GLENS",
   :fibo-fnd-utl-av/preferredDesignation "GLNS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "glens"})

(def Green
  "green"
  {:db/ident :fibo-fnd-plc-uspsai/Green,
   :fibo-fnd-utl-av/commonDesignation ["GRN" "GREEN"],
   :fibo-fnd-utl-av/preferredDesignation "GRN",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "green"})

(def Greens
  "greens"
  {:db/ident :fibo-fnd-plc-uspsai/Greens,
   :fibo-fnd-utl-av/commonDesignation "GREENS",
   :fibo-fnd-utl-av/preferredDesignation "GRNS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "greens"})

(def Grove
  "grove"
  {:db/ident :fibo-fnd-plc-uspsai/Grove,
   :fibo-fnd-utl-av/commonDesignation ["GRV" "GROVE" "GROV"],
   :fibo-fnd-utl-av/preferredDesignation "GRV",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "grove"})

(def Groves
  "groves"
  {:db/ident :fibo-fnd-plc-uspsai/Groves,
   :fibo-fnd-utl-av/commonDesignation "GROVES",
   :fibo-fnd-utl-av/preferredDesignation "GRVS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "groves"})

(def HI
  "US-specific code for the designation for Hawaii"
  {:db/ident :fibo-fnd-plc-uspsai/HI,
   :fibo-fnd-utl-av/preferredDesignation "HI",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :lcc-3166-2-us/Hawaii,
   :lcc-lr/hasTag "HI",
   :lcc-lr/identifies :lcc-3166-2-us/Hawaii,
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "HI",
   :skos/definition "US-specific code for the designation for Hawaii"})

(def Harbor
  "harbor"
  {:db/ident :fibo-fnd-plc-uspsai/Harbor,
   :fibo-fnd-utl-av/commonDesignation ["HARBOR" "HRBOR" "HARBR" "HARB" "HBR"],
   :fibo-fnd-utl-av/preferredDesignation "HBR",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "harbor"})

(def Harbors
  "harbors"
  {:db/ident :fibo-fnd-plc-uspsai/Harbors,
   :fibo-fnd-utl-av/commonDesignation "HARBORS",
   :fibo-fnd-utl-av/preferredDesignation "HBRS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "harbors"})

(def Haven
  "haven"
  {:db/ident :fibo-fnd-plc-uspsai/Haven,
   :fibo-fnd-utl-av/commonDesignation ["HVN" "HAVEN"],
   :fibo-fnd-utl-av/preferredDesignation "HVN",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "haven"})

(def Heights
  "heights"
  {:db/ident :fibo-fnd-plc-uspsai/Heights,
   :fibo-fnd-utl-av/commonDesignation ["HTS" "HT"],
   :fibo-fnd-utl-av/preferredDesignation "HTS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "heights"})

(def Highway
  "highway"
  {:db/ident :fibo-fnd-plc-uspsai/Highway,
   :fibo-fnd-utl-av/commonDesignation
   ["HIGHWAY" "HWAY" "HIWAY" "HWY" "HIGHWY" "HIWY"],
   :fibo-fnd-utl-av/preferredDesignation "HWY",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "highway"})

(def Hill
  "hill"
  {:db/ident :fibo-fnd-plc-uspsai/Hill,
   :fibo-fnd-utl-av/commonDesignation ["HL" "HILL"],
   :fibo-fnd-utl-av/preferredDesignation "HL",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "hill"})

(def Hills
  "hills"
  {:db/ident :fibo-fnd-plc-uspsai/Hills,
   :fibo-fnd-utl-av/commonDesignation ["HLS" "HILLS"],
   :fibo-fnd-utl-av/preferredDesignation "HLS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "hills"})

(def Hollow
  "hollow"
  {:db/ident :fibo-fnd-plc-uspsai/Hollow,
   :fibo-fnd-utl-av/commonDesignation
   ["HOLLOW" "HOLLOWS" "HLLW" "HOLW" "HOLWS"],
   :fibo-fnd-utl-av/preferredDesignation "HOLW",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "hollow"})

(def IA
  "US-specific code for the designation for Iowa"
  {:db/ident :fibo-fnd-plc-uspsai/IA,
   :fibo-fnd-utl-av/preferredDesignation "IA",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :lcc-3166-2-us/Iowa,
   :lcc-lr/hasTag "IA",
   :lcc-lr/identifies :lcc-3166-2-us/Iowa,
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "IA",
   :skos/definition "US-specific code for the designation for Iowa"})

(def ID
  "US-specific code for the designation for Idaho"
  {:db/ident :fibo-fnd-plc-uspsai/ID,
   :fibo-fnd-utl-av/preferredDesignation "ID",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :lcc-3166-2-us/Idaho,
   :lcc-lr/hasTag "ID",
   :lcc-lr/identifies :lcc-3166-2-us/Idaho,
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "ID",
   :skos/definition "US-specific code for the designation for Idaho"})

(def IL
  "US-specific code for the designation for Illinois"
  {:db/ident :fibo-fnd-plc-uspsai/IL,
   :fibo-fnd-utl-av/preferredDesignation "IL",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :lcc-3166-2-us/Illinois,
   :lcc-lr/hasTag "IL",
   :lcc-lr/identifies :lcc-3166-2-us/Illinois,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "IL",
   :skos/definition "US-specific code for the designation for Illinois"})

(def IN
  "US-specific code for the designation for Indiana"
  {:db/ident :fibo-fnd-plc-uspsai/IN,
   :fibo-fnd-utl-av/preferredDesignation "IN",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :lcc-3166-2-us/Indiana,
   :lcc-lr/hasTag "IN",
   :lcc-lr/identifies :lcc-3166-2-us/Indiana,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "IN",
   :skos/definition "US-specific code for the designation for Indiana"})

(def Inlet
  "inlet"
  {:db/ident :fibo-fnd-plc-uspsai/Inlet,
   :fibo-fnd-utl-av/commonDesignation "INLT",
   :fibo-fnd-utl-av/preferredDesignation "INLT",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "inlet"})

(def Island
  "island"
  {:db/ident :fibo-fnd-plc-uspsai/Island,
   :fibo-fnd-utl-av/commonDesignation ["ISLND" "ISLAND" "IS"],
   :fibo-fnd-utl-av/preferredDesignation "IS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "island"})

(def Islands
  "islands"
  {:db/ident :fibo-fnd-plc-uspsai/Islands,
   :fibo-fnd-utl-av/commonDesignation ["ISS" "ISLNDS" "ISLANDS"],
   :fibo-fnd-utl-av/preferredDesignation "ISS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "islands"})

(def Isle
  "isle"
  {:db/ident :fibo-fnd-plc-uspsai/Isle,
   :fibo-fnd-utl-av/commonDesignation ["ISLES" "ISLE"],
   :fibo-fnd-utl-av/preferredDesignation "ISLE",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "isle"})

(def Junction
  "junction"
  {:db/ident :fibo-fnd-plc-uspsai/Junction,
   :fibo-fnd-utl-av/commonDesignation
   ["JCTION" "JCT" "JCTN" "JUNCTION" "JUNCTON" "JUNCTN"],
   :fibo-fnd-utl-av/preferredDesignation "JCT",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "junction"})

(def Junctions
  "junctions"
  {:db/ident :fibo-fnd-plc-uspsai/Junctions,
   :fibo-fnd-utl-av/commonDesignation ["JUNCTIONS" "JCTS" "JCTNS"],
   :fibo-fnd-utl-av/preferredDesignation "JCTS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "junctions"})

(def KS
  "US-specific code for the designation for Kansas"
  {:db/ident :fibo-fnd-plc-uspsai/KS,
   :fibo-fnd-utl-av/preferredDesignation "KS",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :lcc-3166-2-us/Kansas,
   :lcc-lr/hasTag "KS",
   :lcc-lr/identifies :lcc-3166-2-us/Kansas,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "KS",
   :skos/definition "US-specific code for the designation for Kansas"})

(def KY
  "US-specific code for the designation for Kentucky"
  {:db/ident :fibo-fnd-plc-uspsai/KY,
   :fibo-fnd-utl-av/preferredDesignation "KY",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :lcc-3166-2-us/Kentucky,
   :lcc-lr/hasTag "KY",
   :lcc-lr/identifies :lcc-3166-2-us/Kentucky,
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "KY",
   :skos/definition "US-specific code for the designation for Kentucky"})

(def Key
  "key"
  {:db/ident :fibo-fnd-plc-uspsai/Key,
   :fibo-fnd-utl-av/commonDesignation ["KY" "KEY"],
   :fibo-fnd-utl-av/preferredDesignation "KY",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "key"})

(def Keys
  "keys"
  {:db/ident :fibo-fnd-plc-uspsai/Keys,
   :fibo-fnd-utl-av/commonDesignation ["KYS" "KEYS"],
   :fibo-fnd-utl-av/preferredDesignation "KYS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "keys"})

(def Knoll
  "knoll"
  {:db/ident :fibo-fnd-plc-uspsai/Knoll,
   :fibo-fnd-utl-av/commonDesignation ["KNOLL" "KNOL" "KNL"],
   :fibo-fnd-utl-av/preferredDesignation "KNL",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "knoll"})

(def Knolls
  "knolls"
  {:db/ident :fibo-fnd-plc-uspsai/Knolls,
   :fibo-fnd-utl-av/commonDesignation ["KNOLLS" "KNLS"],
   :fibo-fnd-utl-av/preferredDesignation "KNLS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "knolls"})

(def LA
  "US-specific code for the designation for Louisiana"
  {:db/ident :fibo-fnd-plc-uspsai/LA,
   :fibo-fnd-utl-av/preferredDesignation "LA",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :lcc-3166-2-us/Louisiana,
   :lcc-lr/hasTag "LA",
   :lcc-lr/identifies :lcc-3166-2-us/Louisiana,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "LA",
   :skos/definition "US-specific code for the designation for Louisiana"})

(def Lake
  "lake"
  {:db/ident :fibo-fnd-plc-uspsai/Lake,
   :fibo-fnd-utl-av/commonDesignation ["LK" "LAKE"],
   :fibo-fnd-utl-av/preferredDesignation "LK",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "lake"})

(def Lakes
  "lakes"
  {:db/ident :fibo-fnd-plc-uspsai/Lakes,
   :fibo-fnd-utl-av/commonDesignation ["LKS" "LAKES"],
   :fibo-fnd-utl-av/preferredDesignation "LKS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "lakes"})

(def Land
  "land"
  {:db/ident :fibo-fnd-plc-uspsai/Land,
   :fibo-fnd-utl-av/commonDesignation "LAND",
   :fibo-fnd-utl-av/preferredDesignation "LAND",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "land"})

(def Landing
  "landing"
  {:db/ident :fibo-fnd-plc-uspsai/Landing,
   :fibo-fnd-utl-av/commonDesignation ["LNDNG" "LNDG" "LANDING"],
   :fibo-fnd-utl-av/preferredDesignation "LNDG",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "landing"})

(def Lane
  "lane"
  {:db/ident :fibo-fnd-plc-uspsai/Lane,
   :fibo-fnd-utl-av/commonDesignation ["LN" "LANE"],
   :fibo-fnd-utl-av/preferredDesignation "LN",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "lane"})

(def Light
  "light"
  {:db/ident :fibo-fnd-plc-uspsai/Light,
   :fibo-fnd-utl-av/commonDesignation ["LIGHT" "LGT"],
   :fibo-fnd-utl-av/preferredDesignation "LGT",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "light"})

(def Lights
  "lights"
  {:db/ident :fibo-fnd-plc-uspsai/Lights,
   :fibo-fnd-utl-av/commonDesignation "LIGHTS",
   :fibo-fnd-utl-av/preferredDesignation "LGTS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "lights"})

(def Loaf
  "loaf"
  {:db/ident :fibo-fnd-plc-uspsai/Loaf,
   :fibo-fnd-utl-av/commonDesignation ["LOAF" "LF"],
   :fibo-fnd-utl-av/preferredDesignation "LF",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "loaf"})

(def Lock
  "lock"
  {:db/ident :fibo-fnd-plc-uspsai/Lock,
   :fibo-fnd-utl-av/commonDesignation ["LOCK" "LCK"],
   :fibo-fnd-utl-av/preferredDesignation "LCK",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "lock"})

(def Locks
  "locks"
  {:db/ident :fibo-fnd-plc-uspsai/Locks,
   :fibo-fnd-utl-av/commonDesignation ["LOCKS" "LCKS"],
   :fibo-fnd-utl-av/preferredDesignation "LCKS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "locks"})

(def Lodge
  "lodge"
  {:db/ident :fibo-fnd-plc-uspsai/Lodge,
   :fibo-fnd-utl-av/commonDesignation ["LODGE" "LODG" "LDGE" "LDG"],
   :fibo-fnd-utl-av/preferredDesignation "LDG",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "lodge"})

(def Loop
  "loop"
  {:db/ident :fibo-fnd-plc-uspsai/Loop,
   :fibo-fnd-utl-av/commonDesignation ["LOOPS" "LOOP"],
   :fibo-fnd-utl-av/preferredDesignation "LOOP",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "loop"})

(def MA
  "US-specific code for the designation for Massachusetts"
  {:db/ident :fibo-fnd-plc-uspsai/MA,
   :fibo-fnd-utl-av/preferredDesignation "MA",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :lcc-3166-2-us/Massachusetts,
   :lcc-lr/hasTag "MA",
   :lcc-lr/identifies :lcc-3166-2-us/Massachusetts,
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "MA",
   :skos/definition "US-specific code for the designation for Massachusetts"})

(def MB
  "Canadian and US-specific code for the designation for Manitoba"
  {:db/ident :fibo-fnd-plc-uspsai/MB,
   :fibo-fnd-utl-av/preferredDesignation "MB",
   :lcc-cr/isUsedBy [:lcc-3166-1/Canada :lcc-3166-1/UnitedStatesOfAmerica],
   :lcc-lr/denotes :lcc-3166-2-ca/Manitoba,
   :lcc-lr/hasTag "MB",
   :lcc-lr/identifies :lcc-3166-2-ca/Manitoba,
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "MB",
   :skos/definition
   "Canadian and US-specific code for the designation for Manitoba"})

(def MD
  "US-specific code for the designation for Maryland"
  {:db/ident :fibo-fnd-plc-uspsai/MD,
   :fibo-fnd-utl-av/preferredDesignation "MD",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :lcc-3166-2-us/Maryland,
   :lcc-lr/hasTag "MD",
   :lcc-lr/identifies :lcc-3166-2-us/Maryland,
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "MD",
   :skos/definition "US-specific code for the designation for Maryland"})

(def ME
  "US-specific code for the designation for Maine"
  {:db/ident :fibo-fnd-plc-uspsai/ME,
   :fibo-fnd-utl-av/preferredDesignation "ME",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :lcc-3166-2-us/Maine,
   :lcc-lr/hasTag "ME",
   :lcc-lr/identifies :lcc-3166-2-us/Maine,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "ME",
   :skos/definition "US-specific code for the designation for Maine"})

(def MI
  "US-specific code for the designation for Michigan"
  {:db/ident :fibo-fnd-plc-uspsai/MI,
   :fibo-fnd-utl-av/preferredDesignation "MI",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :lcc-3166-2-us/Michigan,
   :lcc-lr/hasTag "MI",
   :lcc-lr/identifies :lcc-3166-2-us/Michigan,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "MI",
   :skos/definition "US-specific code for the designation for Michigan"})

(def MN
  "US-specific code for the designation for Minnesota"
  {:db/ident :fibo-fnd-plc-uspsai/MN,
   :fibo-fnd-utl-av/preferredDesignation "MN",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :lcc-3166-2-us/Minnesota,
   :lcc-lr/hasTag "MN",
   :lcc-lr/identifies :lcc-3166-2-us/Minnesota,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "MN",
   :skos/definition "US-specific code for the designation for Minnesota"})

(def MO
  "US-specific code for the designation for Missouri"
  {:db/ident :fibo-fnd-plc-uspsai/MO,
   :fibo-fnd-utl-av/preferredDesignation "MO",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :lcc-3166-2-us/Missouri,
   :lcc-lr/hasTag "MO",
   :lcc-lr/identifies :lcc-3166-2-us/Missouri,
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "MO",
   :skos/definition "US-specific code for the designation for Missouri"})

(def MP
  "US-specific code for the designation for the outlying area of Northern Mariana Islands"
  {:db/ident :fibo-fnd-plc-uspsai/MP,
   :fibo-fnd-utl-av/preferredDesignation "MP",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :lcc-3166-2-us/NorthernMarianaIslands,
   :lcc-lr/hasTag "MP",
   :lcc-lr/identifies :lcc-3166-2-us/NorthernMarianaIslands,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "MP",
   :skos/definition
   "US-specific code for the designation for the outlying area of Northern Mariana Islands"})

(def MS
  "US-specific code for the designation for Mississippi"
  {:db/ident :fibo-fnd-plc-uspsai/MS,
   :fibo-fnd-utl-av/preferredDesignation "MS",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :lcc-3166-2-us/Mississippi,
   :lcc-lr/hasTag "MS",
   :lcc-lr/identifies :lcc-3166-2-us/Mississippi,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "MS",
   :skos/definition "US-specific code for the designation for Mississippi"})

(def MT
  "US-specific code for the designation for Montana"
  {:db/ident :fibo-fnd-plc-uspsai/MT,
   :fibo-fnd-utl-av/preferredDesignation "MT",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :lcc-3166-2-us/Montana,
   :lcc-lr/hasTag "MT",
   :lcc-lr/identifies :lcc-3166-2-us/Montana,
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "MT",
   :skos/definition "US-specific code for the designation for Montana"})

(def Mall
  "mall"
  {:db/ident :fibo-fnd-plc-uspsai/Mall,
   :fibo-fnd-utl-av/commonDesignation "MALL",
   :fibo-fnd-utl-av/preferredDesignation "MALL",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "mall"})

(def Manor
  "manor"
  {:db/ident :fibo-fnd-plc-uspsai/Manor,
   :fibo-fnd-utl-av/commonDesignation ["MNR" "MANOR"],
   :fibo-fnd-utl-av/preferredDesignation "MNR",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "manor"})

(def Manors
  "manors"
  {:db/ident :fibo-fnd-plc-uspsai/Manors,
   :fibo-fnd-utl-av/commonDesignation ["MNRS" "MANORS"],
   :fibo-fnd-utl-av/preferredDesignation "MNRS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "manors"})

(def Meadow
  "meadow"
  {:db/ident :fibo-fnd-plc-uspsai/Meadow,
   :fibo-fnd-utl-av/commonDesignation "MEADOW",
   :fibo-fnd-utl-av/preferredDesignation "MDW",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "meadow"})

(def Meadows
  "meadows"
  {:db/ident :fibo-fnd-plc-uspsai/Meadows,
   :fibo-fnd-utl-av/commonDesignation ["MEDOWS" "MEADOWS" "MDWS" "MDW"],
   :fibo-fnd-utl-av/preferredDesignation "MDWS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "meadows"})

(def Mews
  "mews"
  {:db/ident :fibo-fnd-plc-uspsai/Mews,
   :fibo-fnd-utl-av/commonDesignation "MEWS",
   :fibo-fnd-utl-av/preferredDesignation "MEWS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "mews"})

(def Mill
  "mill"
  {:db/ident :fibo-fnd-plc-uspsai/Mill,
   :fibo-fnd-utl-av/commonDesignation "MILL",
   :fibo-fnd-utl-av/preferredDesignation "ML",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "mill"})

(def Mills
  "mills"
  {:db/ident :fibo-fnd-plc-uspsai/Mills,
   :fibo-fnd-utl-av/commonDesignation "MILLS",
   :fibo-fnd-utl-av/preferredDesignation "MLS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "mills"})

(def Mission
  "mission"
  {:db/ident :fibo-fnd-plc-uspsai/Mission,
   :fibo-fnd-utl-av/commonDesignation ["MSSN" "MISSN"],
   :fibo-fnd-utl-av/preferredDesignation "MSN",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "mission"})

(def Motorway
  "motorway"
  {:db/ident :fibo-fnd-plc-uspsai/Motorway,
   :fibo-fnd-utl-av/commonDesignation "MOTORWAY",
   :fibo-fnd-utl-av/preferredDesignation "MTWY",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "motorway"})

(def Mount
  "mount"
  {:db/ident :fibo-fnd-plc-uspsai/Mount,
   :fibo-fnd-utl-av/commonDesignation ["MT" "MOUNT" "MNT"],
   :fibo-fnd-utl-av/preferredDesignation "MT",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "mount"})

(def Mountain
  "mountain"
  {:db/ident :fibo-fnd-plc-uspsai/Mountain,
   :fibo-fnd-utl-av/commonDesignation
   ["MOUNTIN" "MNTN" "MNTAIN" "MTIN" "MTN" "MOUNTAIN"],
   :fibo-fnd-utl-av/preferredDesignation "MTN",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "mountain"})

(def Mountains
  "mountains"
  {:db/ident :fibo-fnd-plc-uspsai/Mountains,
   :fibo-fnd-utl-av/commonDesignation ["MOUNTAINS" "MNTNS"],
   :fibo-fnd-utl-av/preferredDesignation "MTNS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "mountains"})

(def NB
  "Canadian and US-specific code for the designation for New Brunswick"
  {:db/ident :fibo-fnd-plc-uspsai/NB,
   :fibo-fnd-utl-av/preferredDesignation "NB",
   :lcc-cr/isUsedBy [:lcc-3166-1/UnitedStatesOfAmerica :lcc-3166-1/Canada],
   :lcc-lr/denotes :lcc-3166-2-ca/NewBrunswick,
   :lcc-lr/hasTag "NB",
   :lcc-lr/identifies :lcc-3166-2-ca/NewBrunswick,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "NB",
   :skos/definition
   "Canadian and US-specific code for the designation for New Brunswick"})

(def NC
  "US-specific code for the designation for North Carolina"
  {:db/ident :fibo-fnd-plc-uspsai/NC,
   :fibo-fnd-utl-av/preferredDesignation "NC",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :lcc-3166-2-us/NorthCarolina,
   :lcc-lr/hasTag "NC",
   :lcc-lr/identifies :lcc-3166-2-us/NorthCarolina,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "NC",
   :skos/definition "US-specific code for the designation for North Carolina"})

(def ND
  "US-specific code for the designation for North Dakota"
  {:db/ident :fibo-fnd-plc-uspsai/ND,
   :fibo-fnd-utl-av/preferredDesignation "ND",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :lcc-3166-2-us/NorthDakota,
   :lcc-lr/hasTag "ND",
   :lcc-lr/identifies :lcc-3166-2-us/NorthDakota,
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "ND",
   :skos/definition "US-specific code for the designation for North Dakota"})

(def NE
  "US-specific code for the designation for Nebraska"
  {:db/ident :fibo-fnd-plc-uspsai/NE,
   :fibo-fnd-utl-av/preferredDesignation "NE",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :lcc-3166-2-us/Nebraska,
   :lcc-lr/hasTag "NE",
   :lcc-lr/identifies :lcc-3166-2-us/Nebraska,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "NE",
   :skos/definition "US-specific code for the designation for Nebraska"})

(def NH
  "US-specific code for the designation for New Hampshire"
  {:db/ident :fibo-fnd-plc-uspsai/NH,
   :fibo-fnd-utl-av/preferredDesignation "NH",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :lcc-3166-2-us/NewHampshire,
   :lcc-lr/hasTag "NH",
   :lcc-lr/identifies :lcc-3166-2-us/NewHampshire,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "NH",
   :skos/definition "US-specific code for the designation for New Hampshire"})

(def NJ
  "US-specific code for the designation for New Jersey"
  {:db/ident :fibo-fnd-plc-uspsai/NJ,
   :fibo-fnd-utl-av/preferredDesignation "NJ",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :lcc-3166-2-us/NewJersey,
   :lcc-lr/hasTag "NJ",
   :lcc-lr/identifies :lcc-3166-2-us/NewJersey,
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "NJ",
   :skos/definition "US-specific code for the designation for New Jersey"})

(def NL
  "Canadian and US-specific code for the designation for Newfoundland and Labrador"
  {:db/ident :fibo-fnd-plc-uspsai/NL,
   :fibo-fnd-utl-av/preferredDesignation "NL",
   :lcc-cr/isUsedBy [:lcc-3166-1/UnitedStatesOfAmerica :lcc-3166-1/Canada],
   :lcc-lr/denotes :lcc-3166-2-ca/NewfoundlandAndLabrador,
   :lcc-lr/hasTag "NL",
   :lcc-lr/identifies :lcc-3166-2-ca/NewfoundlandAndLabrador,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "NL",
   :skos/definition
   "Canadian and US-specific code for the designation for Newfoundland and Labrador"})

(def NM
  "US-specific code for the designation for New Mexico"
  {:db/ident :fibo-fnd-plc-uspsai/NM,
   :fibo-fnd-utl-av/preferredDesignation "NM",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :lcc-3166-2-us/NewMexico,
   :lcc-lr/hasTag "NM",
   :lcc-lr/identifies :lcc-3166-2-us/NewMexico,
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "NM",
   :skos/definition "US-specific code for the designation for New Mexico"})

(def NS
  "Canadian and US-specific code for the designation for Nova Scotia"
  {:db/ident :fibo-fnd-plc-uspsai/NS,
   :fibo-fnd-utl-av/preferredDesignation "NS",
   :lcc-cr/isUsedBy [:lcc-3166-1/UnitedStatesOfAmerica :lcc-3166-1/Canada],
   :lcc-lr/denotes :lcc-3166-2-ca/NovaScotia,
   :lcc-lr/hasTag "NS",
   :lcc-lr/identifies :lcc-3166-2-ca/NovaScotia,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "NS",
   :skos/definition
   "Canadian and US-specific code for the designation for Nova Scotia"})

(def NT
  "Canadian and US-specific code for the designation for Northwest Territories"
  {:db/ident :fibo-fnd-plc-uspsai/NT,
   :fibo-fnd-utl-av/preferredDesignation "NT",
   :lcc-cr/isUsedBy [:lcc-3166-1/Canada :lcc-3166-1/UnitedStatesOfAmerica],
   :lcc-lr/denotes :lcc-3166-2-ca/NorthwestTerritories,
   :lcc-lr/hasTag "NT",
   :lcc-lr/identifies :lcc-3166-2-ca/NorthwestTerritories,
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "NT",
   :skos/definition
   "Canadian and US-specific code for the designation for Northwest Territories"})

(def NU
  "Canadian and US-specific code for the designation for Nunavut"
  {:db/ident :fibo-fnd-plc-uspsai/NU,
   :fibo-fnd-utl-av/preferredDesignation "NU",
   :lcc-cr/isUsedBy [:lcc-3166-1/Canada :lcc-3166-1/UnitedStatesOfAmerica],
   :lcc-lr/denotes :lcc-3166-2-ca/Nunavut,
   :lcc-lr/hasTag "NU",
   :lcc-lr/identifies :lcc-3166-2-ca/Nunavut,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "NU",
   :skos/definition
   "Canadian and US-specific code for the designation for Nunavut"})

(def NV
  "US-specific code for the designation for Nevada"
  {:db/ident :fibo-fnd-plc-uspsai/NV,
   :fibo-fnd-utl-av/preferredDesignation "NV",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :lcc-3166-2-us/Nevada,
   :lcc-lr/hasTag "NV",
   :lcc-lr/identifies :lcc-3166-2-us/Nevada,
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "NV",
   :skos/definition "US-specific code for the designation for Nevada"})

(def NY
  "US-specific code for the designation for New York"
  {:db/ident :fibo-fnd-plc-uspsai/NY,
   :fibo-fnd-utl-av/preferredDesignation "NY",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :lcc-3166-2-us/NewYork,
   :lcc-lr/hasTag "NY",
   :lcc-lr/identifies :lcc-3166-2-us/NewYork,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "NY",
   :skos/definition "US-specific code for the designation for New York"})

(def Neck
  "neck"
  {:db/ident :fibo-fnd-plc-uspsai/Neck,
   :fibo-fnd-utl-av/commonDesignation ["NECK" "NCK"],
   :fibo-fnd-utl-av/preferredDesignation "NCK",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "neck"})

(def OH
  "US-specific code for the designation for Ohio"
  {:db/ident :fibo-fnd-plc-uspsai/OH,
   :fibo-fnd-utl-av/preferredDesignation "OH",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :lcc-3166-2-us/Ohio,
   :lcc-lr/hasTag "OH",
   :lcc-lr/identifies :lcc-3166-2-us/Ohio,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "OH",
   :skos/definition "US-specific code for the designation for Ohio"})

(def OK
  "US-specific code for the designation for Oklahoma"
  {:db/ident :fibo-fnd-plc-uspsai/OK,
   :fibo-fnd-utl-av/preferredDesignation "OK",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :lcc-3166-2-us/Oklahoma,
   :lcc-lr/hasTag "OK",
   :lcc-lr/identifies :lcc-3166-2-us/Oklahoma,
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "OK",
   :skos/definition "US-specific code for the designation for Oklahoma"})

(def ON
  "Canadian and US-specific code for the designation for Ontario"
  {:db/ident :fibo-fnd-plc-uspsai/ON,
   :fibo-fnd-utl-av/preferredDesignation "ON",
   :lcc-cr/isUsedBy [:lcc-3166-1/UnitedStatesOfAmerica :lcc-3166-1/Canada],
   :lcc-lr/denotes :lcc-3166-2-ca/Ontario,
   :lcc-lr/hasTag "ON",
   :lcc-lr/identifies :lcc-3166-2-ca/Ontario,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "ON",
   :skos/definition
   "Canadian and US-specific code for the designation for Ontario"})

(def OR
  "US-specific code for the designation for Oregon"
  {:db/ident :fibo-fnd-plc-uspsai/OR,
   :fibo-fnd-utl-av/preferredDesignation "OR",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :lcc-3166-2-us/Oregon,
   :lcc-lr/hasTag "OR",
   :lcc-lr/identifies :lcc-3166-2-us/Oregon,
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "OR",
   :skos/definition "US-specific code for the designation for Oregon"})

(def Orchard
  "orchard"
  {:db/ident :fibo-fnd-plc-uspsai/Orchard,
   :fibo-fnd-utl-av/commonDesignation ["ORCHRD" "ORCHARD" "ORCH"],
   :fibo-fnd-utl-av/preferredDesignation "ORCH",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "orchard"})

(def Oval
  "oval"
  {:db/ident :fibo-fnd-plc-uspsai/Oval,
   :fibo-fnd-utl-av/commonDesignation ["OVL" "OVAL"],
   :fibo-fnd-utl-av/preferredDesignation "OVAL",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "oval"})

(def Overpass
  "overpass"
  {:db/ident :fibo-fnd-plc-uspsai/Overpass,
   :fibo-fnd-utl-av/commonDesignation "OVERPASS",
   :fibo-fnd-utl-av/preferredDesignation "OPAS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "overpass"})

(def PA
  "US-specific code for the designation for Pennsylvania"
  {:db/ident :fibo-fnd-plc-uspsai/PA,
   :fibo-fnd-utl-av/preferredDesignation "PA",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :lcc-3166-2-us/Pennsylvania,
   :lcc-lr/hasTag "PA",
   :lcc-lr/identifies :lcc-3166-2-us/Pennsylvania,
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "PA",
   :skos/definition "US-specific code for the designation for Pennsylvania"})

(def PE
  "Canadian and US-specific code for the designation for Prince Edward Island"
  {:db/ident :fibo-fnd-plc-uspsai/PE,
   :fibo-fnd-utl-av/preferredDesignation "PE",
   :lcc-cr/isUsedBy [:lcc-3166-1/Canada :lcc-3166-1/UnitedStatesOfAmerica],
   :lcc-lr/denotes :lcc-3166-2-ca/PrinceEdwardIsland,
   :lcc-lr/hasTag "PE",
   :lcc-lr/identifies :lcc-3166-2-ca/PrinceEdwardIsland,
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "PE",
   :skos/definition
   "Canadian and US-specific code for the designation for Prince Edward Island"})

(def PR
  "US-specific code for the designation for Puerto Rico"
  {:db/ident :fibo-fnd-plc-uspsai/PR,
   :fibo-fnd-utl-av/preferredDesignation "PR",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :lcc-3166-2-us/PuertoRico,
   :lcc-lr/hasTag "PR",
   :lcc-lr/identifies :lcc-3166-2-us/PuertoRico,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "PR",
   :skos/definition "US-specific code for the designation for Puerto Rico"})

(def Park
  "park"
  {:db/ident :fibo-fnd-plc-uspsai/Park,
   :fibo-fnd-utl-av/commonDesignation ["PRK" "PARK"],
   :fibo-fnd-utl-av/preferredDesignation "PARK",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "park"})

(def Parks
  "parks"
  {:db/ident :fibo-fnd-plc-uspsai/Parks,
   :fibo-fnd-utl-av/commonDesignation "PARKS",
   :fibo-fnd-utl-av/preferredDesignation "PARK",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "parks"})

(def Parkway
  "parkway"
  {:db/ident :fibo-fnd-plc-uspsai/Parkway,
   :fibo-fnd-utl-av/commonDesignation ["PKWY" "PARKWY" "PKWAY" "PARKWAY" "PKY"],
   :fibo-fnd-utl-av/preferredDesignation "PKWY",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "parkway"})

(def Parkways
  "parkways"
  {:db/ident :fibo-fnd-plc-uspsai/Parkways,
   :fibo-fnd-utl-av/commonDesignation ["PKWYS" "PARKWAYS"],
   :fibo-fnd-utl-av/preferredDesignation "PKWY",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "parkways"})

(def Pass
  "pass"
  {:db/ident :fibo-fnd-plc-uspsai/Pass,
   :fibo-fnd-utl-av/commonDesignation "PASS",
   :fibo-fnd-utl-av/preferredDesignation "PASS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "pass"})

(def Passage
  "passage"
  {:db/ident :fibo-fnd-plc-uspsai/Passage,
   :fibo-fnd-utl-av/commonDesignation "PASSAGE",
   :fibo-fnd-utl-av/preferredDesignation "PSGE",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "passage"})

(def Path
  "path"
  {:db/ident :fibo-fnd-plc-uspsai/Path,
   :fibo-fnd-utl-av/commonDesignation ["PATHS" "PATH"],
   :fibo-fnd-utl-av/preferredDesignation "PATH",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "path"})

(def Pike
  "pike"
  {:db/ident :fibo-fnd-plc-uspsai/Pike,
   :fibo-fnd-utl-av/commonDesignation ["PIKES" "PIKE"],
   :fibo-fnd-utl-av/preferredDesignation "PIKE",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "pike"})

(def Pine
  "pine"
  {:db/ident :fibo-fnd-plc-uspsai/Pine,
   :fibo-fnd-utl-av/commonDesignation "PINE",
   :fibo-fnd-utl-av/preferredDesignation "PNE",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "pine"})

(def Pines
  "pines"
  {:db/ident :fibo-fnd-plc-uspsai/Pines,
   :fibo-fnd-utl-av/commonDesignation ["PNES" "PINES"],
   :fibo-fnd-utl-av/preferredDesignation "PNES",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "pines"})

(def Place
  "place"
  {:db/ident :fibo-fnd-plc-uspsai/Place,
   :fibo-fnd-utl-av/commonDesignation "PL",
   :fibo-fnd-utl-av/preferredDesignation "PL",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "place"})

(def Plain
  "plain"
  {:db/ident :fibo-fnd-plc-uspsai/Plain,
   :fibo-fnd-utl-av/commonDesignation ["PLN" "PLAIN"],
   :fibo-fnd-utl-av/preferredDesignation "PLN",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "plain"})

(def Plains
  "plains"
  {:db/ident :fibo-fnd-plc-uspsai/Plains,
   :fibo-fnd-utl-av/commonDesignation ["PLNS" "PLAINS"],
   :fibo-fnd-utl-av/preferredDesignation "PLNS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "plains"})

(def Plaza
  "plaza"
  {:db/ident :fibo-fnd-plc-uspsai/Plaza,
   :fibo-fnd-utl-av/commonDesignation ["PLZA" "PLZ" "PLAZA"],
   :fibo-fnd-utl-av/preferredDesignation "PLZ",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "plaza"})

(def Point
  "point"
  {:db/ident :fibo-fnd-plc-uspsai/Point,
   :fibo-fnd-utl-av/commonDesignation ["PT" "POINT"],
   :fibo-fnd-utl-av/preferredDesignation "PT",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "point"})

(def Points
  "points"
  {:db/ident :fibo-fnd-plc-uspsai/Points,
   :fibo-fnd-utl-av/commonDesignation ["PTS" "POINTS"],
   :fibo-fnd-utl-av/preferredDesignation "PTS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "points"})

(def Port
  "port"
  {:db/ident :fibo-fnd-plc-uspsai/Port,
   :fibo-fnd-utl-av/commonDesignation ["PRT" "PORT"],
   :fibo-fnd-utl-av/preferredDesignation "PRT",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "port"})

(def Ports
  "ports"
  {:db/ident :fibo-fnd-plc-uspsai/Ports,
   :fibo-fnd-utl-av/commonDesignation ["PRTS" "PORTS"],
   :fibo-fnd-utl-av/preferredDesignation "PRTS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "ports"})

(def Prairie
  "prairie"
  {:db/ident :fibo-fnd-plc-uspsai/Prairie,
   :fibo-fnd-utl-av/commonDesignation ["PRR" "PRAIRIE" "PR"],
   :fibo-fnd-utl-av/preferredDesignation "PR",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "prairie"})

(def QC
  "Canadian and US-specific code for the designation for Quebec"
  {:db/ident :fibo-fnd-plc-uspsai/QC,
   :fibo-fnd-utl-av/preferredDesignation "QC",
   :lcc-cr/isUsedBy [:lcc-3166-1/Canada :lcc-3166-1/UnitedStatesOfAmerica],
   :lcc-lr/denotes :lcc-3166-2-ca/Quebec,
   :lcc-lr/hasTag "QC",
   :lcc-lr/identifies :lcc-3166-2-ca/Quebec,
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "QC",
   :skos/definition
   "Canadian and US-specific code for the designation for Quebec"})

(def RI
  "US-specific code for the designation for Rhode Island"
  {:db/ident :fibo-fnd-plc-uspsai/RI,
   :fibo-fnd-utl-av/preferredDesignation "RI",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :lcc-3166-2-us/RhodeIsland,
   :lcc-lr/hasTag "RI",
   :lcc-lr/identifies :lcc-3166-2-us/RhodeIsland,
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "RI",
   :skos/definition "US-specific code for the designation for Rhode Island"})

(def Radial
  "radial"
  {:db/ident :fibo-fnd-plc-uspsai/Radial,
   :fibo-fnd-utl-av/commonDesignation ["RADL" "RADIEL" "RADIAL" "RAD"],
   :fibo-fnd-utl-av/preferredDesignation "RADL",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "radial"})

(def Ramp
  "ramp"
  {:db/ident :fibo-fnd-plc-uspsai/Ramp,
   :fibo-fnd-utl-av/commonDesignation "RAMP",
   :fibo-fnd-utl-av/preferredDesignation "RAMP",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "ramp"})

(def Ranch
  "ranch"
  {:db/ident :fibo-fnd-plc-uspsai/Ranch,
   :fibo-fnd-utl-av/commonDesignation ["RNCHS" "RNCH" "RANCHES" "RANCH"],
   :fibo-fnd-utl-av/preferredDesignation "RNCH",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "ranch"})

(def Rapid
  "rapid"
  {:db/ident :fibo-fnd-plc-uspsai/Rapid,
   :fibo-fnd-utl-av/commonDesignation ["RPD" "RAPID"],
   :fibo-fnd-utl-av/preferredDesignation "RPD",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "rapid"})

(def Rapids
  "rapids"
  {:db/ident :fibo-fnd-plc-uspsai/Rapids,
   :fibo-fnd-utl-av/commonDesignation ["RPDS" "RAPIDS"],
   :fibo-fnd-utl-av/preferredDesignation "RPDS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "rapids"})

(def Rest
  "rest"
  {:db/ident :fibo-fnd-plc-uspsai/Rest,
   :fibo-fnd-utl-av/commonDesignation ["RST" "REST"],
   :fibo-fnd-utl-av/preferredDesignation "RST",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "rest"})

(def Ridge
  "ridge"
  {:db/ident :fibo-fnd-plc-uspsai/Ridge,
   :fibo-fnd-utl-av/commonDesignation ["RIDGE" "RDGE" "RDG"],
   :fibo-fnd-utl-av/preferredDesignation "RDG",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "ridge"})

(def Ridges
  "ridges"
  {:db/ident :fibo-fnd-plc-uspsai/Ridges,
   :fibo-fnd-utl-av/commonDesignation ["RIDGES" "RDGS"],
   :fibo-fnd-utl-av/preferredDesignation "RDGS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "ridges"})

(def River
  "river"
  {:db/ident :fibo-fnd-plc-uspsai/River,
   :fibo-fnd-utl-av/commonDesignation ["RVR" "RIVR" "RIVER" "RIV"],
   :fibo-fnd-utl-av/preferredDesignation "RIV",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "river"})

(def Road
  "road"
  {:db/ident :fibo-fnd-plc-uspsai/Road,
   :fibo-fnd-utl-av/commonDesignation ["ROAD" "RD"],
   :fibo-fnd-utl-av/preferredDesignation "RD",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "road"})

(def Roads
  "roads"
  {:db/ident :fibo-fnd-plc-uspsai/Roads,
   :fibo-fnd-utl-av/commonDesignation ["ROADS" "RDS"],
   :fibo-fnd-utl-av/preferredDesignation "RDS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "roads"})

(def Route
  "route"
  {:db/ident :fibo-fnd-plc-uspsai/Route,
   :fibo-fnd-utl-av/commonDesignation "ROUTE",
   :fibo-fnd-utl-av/preferredDesignation "RTE",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "route"})

(def Row
  "row"
  {:db/ident :fibo-fnd-plc-uspsai/Row,
   :fibo-fnd-utl-av/commonDesignation "ROW",
   :fibo-fnd-utl-av/preferredDesignation "ROW",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "row"})

(def Rue
  "rue"
  {:db/ident :fibo-fnd-plc-uspsai/Rue,
   :fibo-fnd-utl-av/commonDesignation "RUE",
   :fibo-fnd-utl-av/preferredDesignation "RUE",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "rue"})

(def Run
  "run"
  {:db/ident :fibo-fnd-plc-uspsai/Run,
   :fibo-fnd-utl-av/commonDesignation "RUN",
   :fibo-fnd-utl-av/preferredDesignation "RUN",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "run"})

(def SC
  "US-specific code for the designation for South Carolina"
  {:db/ident :fibo-fnd-plc-uspsai/SC,
   :fibo-fnd-utl-av/preferredDesignation "SC",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :lcc-3166-2-us/SouthCarolina,
   :lcc-lr/hasTag "SC",
   :lcc-lr/identifies :lcc-3166-2-us/SouthCarolina,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "SC",
   :skos/definition "US-specific code for the designation for South Carolina"})

(def SD
  "US-specific code for the designation for South Dakota"
  {:db/ident :fibo-fnd-plc-uspsai/SD,
   :fibo-fnd-utl-av/preferredDesignation "SD",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :lcc-3166-2-us/SouthDakota,
   :lcc-lr/hasTag "SD",
   :lcc-lr/identifies :lcc-3166-2-us/SouthDakota,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "SD",
   :skos/definition "US-specific code for the designation for South Dakota"})

(def SK
  "Canadian and US-specific code for the designation for Saskatchewan"
  {:db/ident :fibo-fnd-plc-uspsai/SK,
   :fibo-fnd-utl-av/preferredDesignation "SK",
   :lcc-cr/isUsedBy [:lcc-3166-1/Canada :lcc-3166-1/UnitedStatesOfAmerica],
   :lcc-lr/denotes :lcc-3166-2-ca/Saskatchewan,
   :lcc-lr/hasTag "SK",
   :lcc-lr/identifies :lcc-3166-2-ca/Saskatchewan,
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "SK",
   :skos/definition
   "Canadian and US-specific code for the designation for Saskatchewan"})

(def Shoal
  "shoal"
  {:db/ident :fibo-fnd-plc-uspsai/Shoal,
   :fibo-fnd-utl-av/commonDesignation ["SHOAL" "SHL"],
   :fibo-fnd-utl-av/preferredDesignation "SHL",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "shoal"})

(def Shoals
  "shoals"
  {:db/ident :fibo-fnd-plc-uspsai/Shoals,
   :fibo-fnd-utl-av/commonDesignation ["SHOALS" "SHLS"],
   :fibo-fnd-utl-av/preferredDesignation "SHLS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "shoals"})

(def Shore
  "shore"
  {:db/ident :fibo-fnd-plc-uspsai/Shore,
   :fibo-fnd-utl-av/commonDesignation ["SHR" "SHORE" "SHOAR"],
   :fibo-fnd-utl-av/preferredDesignation "SHR",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "shore"})

(def Shores
  "shores"
  {:db/ident :fibo-fnd-plc-uspsai/Shores,
   :fibo-fnd-utl-av/commonDesignation ["SHRS" "SHORES" "SHOARS"],
   :fibo-fnd-utl-av/preferredDesignation "SHRS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "shores"})

(def Skyway
  "skyway"
  {:db/ident :fibo-fnd-plc-uspsai/Skyway,
   :fibo-fnd-utl-av/commonDesignation "SKYWAY",
   :fibo-fnd-utl-av/preferredDesignation "SKWY",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "skyway"})

(def Spring
  "spring"
  {:db/ident :fibo-fnd-plc-uspsai/Spring,
   :fibo-fnd-utl-av/commonDesignation ["SPRNG" "SPRING" "SPNG" "SPG"],
   :fibo-fnd-utl-av/preferredDesignation "SPG",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "spring"})

(def Springs
  "springs"
  {:db/ident :fibo-fnd-plc-uspsai/Springs,
   :fibo-fnd-utl-av/commonDesignation ["SPRNGS" "SPRINGS" "SPNGS" "SPGS"],
   :fibo-fnd-utl-av/preferredDesignation "SPGS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "springs"})

(def Spur
  "spur"
  {:db/ident :fibo-fnd-plc-uspsai/Spur,
   :fibo-fnd-utl-av/commonDesignation "SPUR",
   :fibo-fnd-utl-av/preferredDesignation "SPUR",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "spur"})

(def Spurs
  "spurs"
  {:db/ident :fibo-fnd-plc-uspsai/Spurs,
   :fibo-fnd-utl-av/commonDesignation "SPURS",
   :fibo-fnd-utl-av/preferredDesignation "SPUR",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "spurs"})

(def Square
  "square"
  {:db/ident :fibo-fnd-plc-uspsai/Square,
   :fibo-fnd-utl-av/commonDesignation ["SQRE" "SQUARE" "SQR" "SQU" "SQ"],
   :fibo-fnd-utl-av/preferredDesignation "SQ",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "square"})

(def Squares
  "squares"
  {:db/ident :fibo-fnd-plc-uspsai/Squares,
   :fibo-fnd-utl-av/commonDesignation ["SQUARES" "SQRS"],
   :fibo-fnd-utl-av/preferredDesignation "SQS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "squares"})

(def Station
  "station"
  {:db/ident :fibo-fnd-plc-uspsai/Station,
   :fibo-fnd-utl-av/commonDesignation ["STN" "STATN" "STATION" "STA"],
   :fibo-fnd-utl-av/preferredDesignation "STA",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "station"})

(def Stravenue
  "stravenue"
  {:db/ident :fibo-fnd-plc-uspsai/Stravenue,
   :fibo-fnd-utl-av/commonDesignation
   ["STRAV" "STRA" "STRAVENUE" "STRAVEN" "STRAVN" "STRVN" "STRVNUE"],
   :fibo-fnd-utl-av/preferredDesignation "STRA",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "stravenue"})

(def Stream
  "stream"
  {:db/ident :fibo-fnd-plc-uspsai/Stream,
   :fibo-fnd-utl-av/commonDesignation ["STRM" "STREME" "STREAM"],
   :fibo-fnd-utl-av/preferredDesignation "STRM",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "stream"})

(def Street
  "street"
  {:db/ident :fibo-fnd-plc-uspsai/Street,
   :fibo-fnd-utl-av/commonDesignation ["STRT" "STREET" "STR" "ST"],
   :fibo-fnd-utl-av/preferredDesignation "ST",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "street"})

(def Streets
  "streets"
  {:db/ident :fibo-fnd-plc-uspsai/Streets,
   :fibo-fnd-utl-av/commonDesignation "STREETS",
   :fibo-fnd-utl-av/preferredDesignation "STS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "streets"})

(def Summit
  "summit"
  {:db/ident :fibo-fnd-plc-uspsai/Summit,
   :fibo-fnd-utl-av/commonDesignation ["SUMMIT" "SUMITT" "SUMIT" "SMT"],
   :fibo-fnd-utl-av/preferredDesignation "SMT",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "summit"})

(def TN
  "US-specific code for the designation for Tennessee"
  {:db/ident :fibo-fnd-plc-uspsai/TN,
   :fibo-fnd-utl-av/preferredDesignation "TN",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :lcc-3166-2-us/Tennessee,
   :lcc-lr/hasTag "TN",
   :lcc-lr/identifies :lcc-3166-2-us/Tennessee,
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "TN",
   :skos/definition "US-specific code for the designation for Tennessee"})

(def TX
  "US-specific code for the designation for Texas"
  {:db/ident :fibo-fnd-plc-uspsai/TX,
   :fibo-fnd-utl-av/preferredDesignation "TX",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :lcc-3166-2-us/Texas,
   :lcc-lr/hasTag "TX",
   :lcc-lr/identifies :lcc-3166-2-us/Texas,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "TX",
   :skos/definition "US-specific code for the designation for Texas"})

(def Terrace
  "terrace"
  {:db/ident :fibo-fnd-plc-uspsai/Terrace,
   :fibo-fnd-utl-av/commonDesignation ["TERRACE" "TERR" "TER"],
   :fibo-fnd-utl-av/preferredDesignation "TER",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "terrace"})

(def Throughway
  "throughway"
  {:db/ident :fibo-fnd-plc-uspsai/Throughway,
   :fibo-fnd-utl-av/commonDesignation "THROUGHWAY",
   :fibo-fnd-utl-av/preferredDesignation "TRWY",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "throughway"})

(def Trace
  "trace"
  {:db/ident :fibo-fnd-plc-uspsai/Trace,
   :fibo-fnd-utl-av/commonDesignation ["TRCE" "TRACES" "TRACE"],
   :fibo-fnd-utl-av/preferredDesignation "TRCE",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "trace"})

(def Track
  "track"
  {:db/ident :fibo-fnd-plc-uspsai/Track,
   :fibo-fnd-utl-av/commonDesignation ["TRACKS" "TRKS" "TRACK" "TRK" "TRAK"],
   :fibo-fnd-utl-av/preferredDesignation "TRAK",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/StreetSuffix],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "track"})

(def Trafficway
  "trafficway"
  {:db/ident :fibo-fnd-plc-uspsai/Trafficway,
   :fibo-fnd-utl-av/commonDesignation "TRAFFICWAY",
   :fibo-fnd-utl-av/preferredDesignation "TRFY",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "trafficway"})

(def Trail
  "trail"
  {:db/ident :fibo-fnd-plc-uspsai/Trail,
   :fibo-fnd-utl-av/commonDesignation ["TRLS" "TRL" "TRAILS" "TRAIL"],
   :fibo-fnd-utl-av/preferredDesignation "TRL",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "trail"})

(def Trailer
  "trailer"
  {:db/ident :fibo-fnd-plc-uspsai/Trailer,
   :fibo-fnd-utl-av/commonDesignation ["TRLRS" "TRLR" "TRAILER"],
   :fibo-fnd-utl-av/preferredDesignation "TRLR",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "trailer"})

(def Tunnel
  "tunnel"
  {:db/ident :fibo-fnd-plc-uspsai/Tunnel,
   :fibo-fnd-utl-av/commonDesignation
   ["TUNL" "TUNNEL" "TUNNELS" "TUNLS" "TUNNL" "TUNEL"],
   :fibo-fnd-utl-av/preferredDesignation "TUNL",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/StreetSuffix],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "tunnel"})

(def Turnpike
  "turnpike"
  {:db/ident :fibo-fnd-plc-uspsai/Turnpike,
   :fibo-fnd-utl-av/commonDesignation ["TURNPK" "TURNPIKE" "TRNPK"],
   :fibo-fnd-utl-av/preferredDesignation "TPKE",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "turnpike"})

(def UM
  "US-specific code for the designation for the United States Minor Outlying Islands"
  {:db/ident :fibo-fnd-plc-uspsai/UM,
   :fibo-fnd-utl-av/preferredDesignation "UM",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :lcc-3166-2-us/UnitedStatesMinorOutlyingIslands,
   :lcc-lr/hasTag "UM",
   :lcc-lr/identifies :lcc-3166-2-us/UnitedStatesMinorOutlyingIslands,
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "UM",
   :skos/definition
   "US-specific code for the designation for the United States Minor Outlying Islands"})

(def US-AA
  "subdivision code for the state designation for Armed Forces Americas, excluding Canada"
  {:db/ident :fibo-fnd-plc-uspsai/US-AA,
   :fibo-fnd-utl-av/preferredDesignation "AA",
   :lcc-lr/denotes :fibo-fnd-plc-uspsai/ArmedForcesAmericas,
   :lcc-lr/hasTag "US-AA",
   :lcc-lr/identifies :fibo-fnd-plc-uspsai/ArmedForcesAmericas,
   :rdf/type [:lcc-cr/GeographicRegionIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "US-AA",
   :skos/definition
   "subdivision code for the state designation for Armed Forces Americas, excluding Canada"})

(def US-AE
  "subdivision code for the state designation for Armed Forces Europe, the Middle East, and Canada"
  {:db/ident :fibo-fnd-plc-uspsai/US-AE,
   :fibo-fnd-utl-av/preferredDesignation "AE",
   :lcc-lr/denotes :fibo-fnd-plc-uspsai/ArmedForcesEurope,
   :lcc-lr/hasTag "US-AE",
   :lcc-lr/identifies :fibo-fnd-plc-uspsai/ArmedForcesEurope,
   :rdf/type [:lcc-cr/GeographicRegionIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "US-AE",
   :skos/definition
   "subdivision code for the state designation for Armed Forces Europe, the Middle East, and Canada"})

(def US-AP
  "subdivision code for the state designation for Armed Forces Pacific"
  {:db/ident :fibo-fnd-plc-uspsai/US-AP,
   :fibo-fnd-utl-av/preferredDesignation "AP",
   :lcc-lr/denotes :fibo-fnd-plc-uspsai/ArmedForcesPacific,
   :lcc-lr/hasTag "US-AP",
   :lcc-lr/identifies :fibo-fnd-plc-uspsai/ArmedForcesPacific,
   :rdf/type [:lcc-cr/GeographicRegionIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "US-AP",
   :skos/definition
   "subdivision code for the state designation for Armed Forces Pacific"})

(def UT
  "US-specific code for the designation for Utah"
  {:db/ident :fibo-fnd-plc-uspsai/UT,
   :fibo-fnd-utl-av/preferredDesignation "UT",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :lcc-3166-2-us/Utah,
   :lcc-lr/hasTag "UT",
   :lcc-lr/identifies :lcc-3166-2-us/Utah,
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "UT",
   :skos/definition "US-specific code for the designation for Utah"})

(def Underpass
  "underpass"
  {:db/ident :fibo-fnd-plc-uspsai/Underpass,
   :fibo-fnd-utl-av/commonDesignation "UNDERPASS",
   :fibo-fnd-utl-av/preferredDesignation "UPAS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "underpass"})

(def Union
  "union"
  {:db/ident :fibo-fnd-plc-uspsai/Union,
   :fibo-fnd-utl-av/commonDesignation ["UNION" "UN"],
   :fibo-fnd-utl-av/preferredDesignation "UN",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "union"})

(def Unions
  "unions"
  {:db/ident :fibo-fnd-plc-uspsai/Unions,
   :fibo-fnd-utl-av/commonDesignation "UNIONS",
   :fibo-fnd-utl-av/preferredDesignation "UNS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "unions"})

(def VA
  "US-specific code for the designation for Virginia"
  {:db/ident :fibo-fnd-plc-uspsai/VA,
   :fibo-fnd-utl-av/preferredDesignation "VA",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :lcc-3166-2-us/Virginia,
   :lcc-lr/hasTag "VA",
   :lcc-lr/identifies :lcc-3166-2-us/Virginia,
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "VA",
   :skos/definition "US-specific code for the designation for Virginia"})

(def VI
  "US-specific code for the designation for the U.S. Virgin Islands"
  {:db/ident :fibo-fnd-plc-uspsai/VI,
   :fibo-fnd-utl-av/preferredDesignation "VI",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :lcc-3166-2-us/VirginIslands,
   :lcc-lr/hasTag "VI",
   :lcc-lr/identifies :lcc-3166-2-us/VirginIslands,
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "VI",
   :skos/definition
   "US-specific code for the designation for the U.S. Virgin Islands"})

(def VT
  "US-specific code for the designation for Vermont"
  {:db/ident :fibo-fnd-plc-uspsai/VT,
   :fibo-fnd-utl-av/preferredDesignation "VT",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :lcc-3166-2-us/Vermont,
   :lcc-lr/hasTag "VT",
   :lcc-lr/identifies :lcc-3166-2-us/Vermont,
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "VT",
   :skos/definition "US-specific code for the designation for Vermont"})

(def Valley
  "valley"
  {:db/ident :fibo-fnd-plc-uspsai/Valley,
   :fibo-fnd-utl-av/commonDesignation ["VLY" "VLLY" "VALLY" "VALLEY"],
   :fibo-fnd-utl-av/preferredDesignation "VLY",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "valley"})

(def Valleys
  "valleys"
  {:db/ident :fibo-fnd-plc-uspsai/Valleys,
   :fibo-fnd-utl-av/commonDesignation ["VLYS" "VALLEYS"],
   :fibo-fnd-utl-av/preferredDesignation "VLYS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "valleys"})

(def Viaduct
  "viaduct"
  {:db/ident :fibo-fnd-plc-uspsai/Viaduct,
   :fibo-fnd-utl-av/commonDesignation ["VIADUCT" "VIADCT" "VIA" "VDCT"],
   :fibo-fnd-utl-av/preferredDesignation "VIA",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "viaduct"})

(def View
  "view"
  {:db/ident :fibo-fnd-plc-uspsai/View,
   :fibo-fnd-utl-av/commonDesignation ["VW" "VIEW"],
   :fibo-fnd-utl-av/preferredDesignation "VW",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "view"})

(def Views
  "views"
  {:db/ident :fibo-fnd-plc-uspsai/Views,
   :fibo-fnd-utl-av/commonDesignation ["VWS" "VIEWS"],
   :fibo-fnd-utl-av/preferredDesignation "VWS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "views"})

(def Village
  "village"
  {:db/ident :fibo-fnd-plc-uspsai/Village,
   :fibo-fnd-utl-av/commonDesignation
   ["VILLAG" "VILLG" "VILLIAGE" "VLG" "VILL" "VILLAGE"],
   :fibo-fnd-utl-av/preferredDesignation "VLG",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/StreetSuffix],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "village"})

(def Villages
  "villages"
  {:db/ident :fibo-fnd-plc-uspsai/Villages,
   :fibo-fnd-utl-av/commonDesignation ["VLGS" "VILLAGES"],
   :fibo-fnd-utl-av/preferredDesignation "VLGS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "villages"})

(def Ville
  "ville"
  {:db/ident :fibo-fnd-plc-uspsai/Ville,
   :fibo-fnd-utl-av/commonDesignation ["VL" "VILLE"],
   :fibo-fnd-utl-av/preferredDesignation "VL",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "ville"})

(def Vista
  "vista"
  {:db/ident :fibo-fnd-plc-uspsai/Vista,
   :fibo-fnd-utl-av/commonDesignation ["VISTA" "VSTA" "VIST" "VIS" "VST"],
   :fibo-fnd-utl-av/preferredDesignation "VIS",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/StreetSuffix],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "vista"})

(def WA
  "US-specific code for the designation for Washington"
  {:db/ident :fibo-fnd-plc-uspsai/WA,
   :fibo-fnd-utl-av/preferredDesignation "WA",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :lcc-3166-2-us/Washington,
   :lcc-lr/hasTag "WA",
   :lcc-lr/identifies :lcc-3166-2-us/Washington,
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "WA",
   :skos/definition "US-specific code for the designation for Washington"})

(def WI
  "US-specific code for the designation for Wisconsin"
  {:db/ident :fibo-fnd-plc-uspsai/WI,
   :fibo-fnd-utl-av/preferredDesignation "WI",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :lcc-3166-2-us/Wisconsin,
   :lcc-lr/hasTag "WI",
   :lcc-lr/identifies :lcc-3166-2-us/Wisconsin,
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "WI",
   :skos/definition "US-specific code for the designation for Wisconsin"})

(def WV
  "US-specific code for the designation for West Virginia"
  {:db/ident :fibo-fnd-plc-uspsai/WV,
   :fibo-fnd-utl-av/preferredDesignation "WV",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :lcc-3166-2-us/WestVirginia,
   :lcc-lr/hasTag "WV",
   :lcc-lr/identifies :lcc-3166-2-us/WestVirginia,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "WV",
   :skos/definition "US-specific code for the designation for West Virginia"})

(def WY
  "US-specific code for the designation for Wyoming"
  {:db/ident :fibo-fnd-plc-uspsai/WY,
   :fibo-fnd-utl-av/preferredDesignation "WY",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/denotes :lcc-3166-2-us/Wyoming,
   :lcc-lr/hasTag "WY",
   :lcc-lr/identifies :lcc-3166-2-us/Wyoming,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "WY",
   :skos/definition "US-specific code for the designation for Wyoming"})

(def Walk
  "walk"
  {:db/ident :fibo-fnd-plc-uspsai/Walk,
   :fibo-fnd-utl-av/commonDesignation "WALK",
   :fibo-fnd-utl-av/preferredDesignation "WALK",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "walk"})

(def Walks
  "walks"
  {:db/ident :fibo-fnd-plc-uspsai/Walks,
   :fibo-fnd-utl-av/commonDesignation "WALKS",
   :fibo-fnd-utl-av/preferredDesignation "WALK",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "walks"})

(def Wall
  "wall"
  {:db/ident :fibo-fnd-plc-uspsai/Wall,
   :fibo-fnd-utl-av/commonDesignation "WALL",
   :fibo-fnd-utl-av/preferredDesignation "WALL",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "wall"})

(def Way
  "way"
  {:db/ident :fibo-fnd-plc-uspsai/Way,
   :fibo-fnd-utl-av/commonDesignation ["WY" "WAY"],
   :fibo-fnd-utl-av/preferredDesignation "WAY",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "way"})

(def Ways
  "ways"
  {:db/ident :fibo-fnd-plc-uspsai/Ways,
   :fibo-fnd-utl-av/commonDesignation "WAYS",
   :fibo-fnd-utl-av/preferredDesignation "WAYS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "ways"})

(def Well
  "well"
  {:db/ident :fibo-fnd-plc-uspsai/Well,
   :fibo-fnd-utl-av/commonDesignation "WELL",
   :fibo-fnd-utl-av/preferredDesignation "WL",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "well"})

(def Wells
  "wells"
  {:db/ident :fibo-fnd-plc-uspsai/Wells,
   :fibo-fnd-utl-av/commonDesignation ["WLS" "WELLS"],
   :fibo-fnd-utl-av/preferredDesignation "WLS",
   :rdf/type [:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "wells"})

(def YT
  "Canadian and US-specific code for the designation for Yukon"
  {:db/ident :fibo-fnd-plc-uspsai/YT,
   :fibo-fnd-utl-av/preferredDesignation "YT",
   :lcc-cr/isUsedBy [:lcc-3166-1/Canada :lcc-3166-1/UnitedStatesOfAmerica],
   :lcc-lr/denotes :lcc-3166-2-ca/Yukon,
   :lcc-lr/hasTag "YT",
   :lcc-lr/identifies :lcc-3166-2-ca/Yukon,
   :rdf/type [:fibo-fnd-plc-adr/RegionSpecificIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfs/label "YT",
   :skos/definition
   "Canadian and US-specific code for the designation for Yukon"})