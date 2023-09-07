(ns net.wikipunk.rdf.fibo-fnd-plc-uspsai
  ^{:base
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
    :namespaces
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
    :prefix "fibo-fnd-plc-uspsai",
    :source
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"}
  {:cmns-av/copyright #{"Copyright (c) 2019-2023 Object Management Group, Inc."
                        "Copyright (c) 2019-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology augments the U.S. Postal Service Address ontology with individuals for various street suffixes, military and U.S. Department of State specific individuals, and preferred designations for state and territory codes.",
   :dcterms/contributor "Thematix Partners LLC",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Addresses/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/NorthAmerica/USPostalServiceAddresses/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CA/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-US/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "U.S. Postal Service Addresses Individuals Ontology",
   :rdfs/seeAlso #{{:xsd/anyURI "https://about.usps.com/who/profile/"}
                   {:xsd/anyURI
                    "https://pe.usps.com/cpim/ftp/pubs/Pub28/pub28.pdf"}},
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals.rdf version of this ontology was revised to update a dead link."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"})

(def AA
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :fibo-fnd-plc-uspsai/ArmedForcesAmericas,
   :cmns-id/identifies :fibo-fnd-plc-uspsai/ArmedForcesAmericas,
   :db/ident :fibo-fnd-plc-uspsai/AA,
   :fibo-fnd-rel-rel/hasTag "AA",
   :fibo-fnd-utl-av/preferredDesignation "AA",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "AA",
   :skos/definition
   "US-specific code for the state designation for Armed Forces Americas, excluding Canada"})

(def AB
  {:cmns-cxtdsg/isUsedBy #{:lcc-3166-1/Canada
                           :lcc-3166-1/UnitedStatesOfAmerica},
   :cmns-dsg/denotes :lcc-3166-2-ca/Alberta,
   :cmns-id/identifies :lcc-3166-2-ca/Alberta,
   :db/ident :fibo-fnd-plc-uspsai/AB,
   :fibo-fnd-rel-rel/hasTag "AB",
   :fibo-fnd-utl-av/preferredDesignation "AB",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "AB",
   :skos/definition
   "Canadian and US-specific code for the designation for Alberta"})

(def AE
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :fibo-fnd-plc-uspsai/ArmedForcesEurope,
   :cmns-id/identifies :fibo-fnd-plc-uspsai/ArmedForcesEurope,
   :db/ident :fibo-fnd-plc-uspsai/AE,
   :fibo-fnd-rel-rel/hasTag "AE",
   :fibo-fnd-utl-av/preferredDesignation "AE",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "AE",
   :skos/definition
   "US-specific code for the state designation for Armed Forces Europe, the Middle East, and Canada"})

(def AK
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Alaska,
   :cmns-id/identifies :lcc-3166-2-us/Alaska,
   :db/ident :fibo-fnd-plc-uspsai/AK,
   :fibo-fnd-rel-rel/hasTag "AK",
   :fibo-fnd-utl-av/preferredDesignation "AK",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "AK",
   :skos/definition "US-specific code for the designation for Alaska"})

(def AL
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Alabama,
   :cmns-id/identifies :lcc-3166-2-us/Alabama,
   :db/ident :fibo-fnd-plc-uspsai/AL,
   :fibo-fnd-rel-rel/hasTag "AL",
   :fibo-fnd-utl-av/preferredDesignation "AL",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "AL",
   :skos/definition "US-specific code for the designation for Alabama"})

(def AP
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :fibo-fnd-plc-uspsai/ArmedForcesPacific,
   :cmns-id/identifies :fibo-fnd-plc-uspsai/ArmedForcesPacific,
   :db/ident :fibo-fnd-plc-uspsai/AP,
   :fibo-fnd-rel-rel/hasTag "AP",
   :fibo-fnd-utl-av/preferredDesignation "AP",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "AP",
   :skos/definition
   "US-specific code for the state designation for Armed Forces Pacific"})

(def AR
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Arkansas,
   :cmns-id/identifies :lcc-3166-2-us/Arkansas,
   :db/ident :fibo-fnd-plc-uspsai/AR,
   :fibo-fnd-rel-rel/hasTag "AR",
   :fibo-fnd-utl-av/preferredDesignation "AR",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "AR",
   :skos/definition "US-specific code for the designation for Arkansas"})

(def AS
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/AmericanSamoa,
   :cmns-id/identifies :lcc-3166-2-us/AmericanSamoa,
   :db/ident :fibo-fnd-plc-uspsai/AS,
   :fibo-fnd-rel-rel/hasTag "AS",
   :fibo-fnd-utl-av/preferredDesignation "AS",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "AS",
   :skos/definition "US-specific code for the designation for American Samoa"})

(def AZ
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Arizona,
   :cmns-id/identifies :lcc-3166-2-us/Arizona,
   :db/ident :fibo-fnd-plc-uspsai/AZ,
   :fibo-fnd-rel-rel/hasTag "AZ",
   :fibo-fnd-utl-av/preferredDesignation "AZ",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "AZ",
   :skos/definition "US-specific code for the designation for Arizona"})

(def Alley
  {:db/ident :fibo-fnd-plc-uspsai/Alley,
   :fibo-fnd-utl-av/commonDesignation #{"ALLY" "ALLEY" "ALY" "ALLEE"},
   :fibo-fnd-utl-av/preferredDesignation "ALY",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "alley",
   :skos/definition "narrow passageway between or behind buildings"})

(def Annex
  {:db/ident :fibo-fnd-plc-uspsai/Annex,
   :fibo-fnd-utl-av/commonDesignation #{"ANNX" "ANX" "ANNEX" "ANEX"},
   :fibo-fnd-utl-av/preferredDesignation "ANX",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "annex",
   :skos/definition
   "addition appended to something else, such as another street"})

(def Arcade
  {:db/ident :fibo-fnd-plc-uspsai/Arcade,
   :fibo-fnd-utl-av/commonDesignation #{"ARC" "ARCADE"},
   :fibo-fnd-utl-av/preferredDesignation "ARC",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "arcade",
   :skos/definition
   "arched or covered passageway, usually with shops on each side"})

(def ArmedForcesAmericas
  {:cmns-cls/isClassifiedBy :lcc-3166-2-us/State,
   :db/ident :fibo-fnd-plc-uspsai/ArmedForcesAmericas,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Armed Forces Americas"},
   :lcc-cr/isSubregionOf :lcc-3166-1/UnitedStatesOfAmerica,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/CountrySubdivision},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "Armed Forces Americas",
   :skos/definition
   "state designation for Armed Forces Americas, excluding Canada"})

(def ArmedForcesEurope
  {:cmns-cls/isClassifiedBy :lcc-3166-2-us/State,
   :db/ident :fibo-fnd-plc-uspsai/ArmedForcesEurope,
   :lcc-cr/hasEnglishShortName
   {:rdf/language "en",
    :rdf/value    "Armed Forces Europe, the Middle East, and Canada"},
   :lcc-cr/isSubregionOf :lcc-3166-1/UnitedStatesOfAmerica,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/CountrySubdivision},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "Armed Forces Europe",
   :skos/definition
   "state designation for Armed Forces Europe, the Middle East, and Canada"})

(def ArmedForcesPacific
  {:cmns-cls/isClassifiedBy :lcc-3166-2-us/State,
   :db/ident :fibo-fnd-plc-uspsai/ArmedForcesPacific,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Armed Forces Pacific"},
   :lcc-cr/isSubregionOf :lcc-3166-1/UnitedStatesOfAmerica,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/CountrySubdivision},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "Armed Forces Pacific",
   :skos/definition "state designation for Armed Forces Pacific"})

(def Avenue
  {:db/ident :fibo-fnd-plc-uspsai/Avenue,
   :fibo-fnd-utl-av/commonDesignation #{"AVE" "AVENUE" "AVEN" "AVENU" "AVNUE"
                                        "AVN" "AV"},
   :fibo-fnd-utl-av/preferredDesignation "AVE",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "avenue",
   :skos/definition
   "broad road in a town or city, typically having trees at regular intervals along its sides"})

(def BC
  {:cmns-cxtdsg/isUsedBy #{:lcc-3166-1/Canada
                           :lcc-3166-1/UnitedStatesOfAmerica},
   :cmns-dsg/denotes :lcc-3166-2-ca/BritishColumbia,
   :cmns-id/identifies :lcc-3166-2-ca/BritishColumbia,
   :db/ident :fibo-fnd-plc-uspsai/BC,
   :fibo-fnd-rel-rel/hasTag "BC",
   :fibo-fnd-utl-av/preferredDesignation "BC",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "BC",
   :skos/definition
   "Canadian and US-specific code for the designation for British Columbia"})

(def Bayou
  {:db/ident :fibo-fnd-plc-uspsai/Bayou,
   :fibo-fnd-utl-av/commonDesignation #{"BAYOO" "BAYOU"},
   :fibo-fnd-utl-av/preferredDesignation "BYU",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "bayou",
   :skos/definition
   "creek, secondary watercourse, or minor river that is tributary to another body of water"})

(def Beach
  {:db/ident :fibo-fnd-plc-uspsai/Beach,
   :fibo-fnd-utl-av/commonDesignation #{"BCH" "BEACH"},
   :fibo-fnd-utl-av/preferredDesignation "BCH",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "beach",
   :skos/definition
   "shore of a body of water covered by sand, gravel, or larger rock fragments"})

(def Bend
  {:db/ident :fibo-fnd-plc-uspsai/Bend,
   :fibo-fnd-utl-av/commonDesignation #{"BEND" "BND"},
   :fibo-fnd-utl-av/preferredDesignation "BND",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "bend",
   :skos/definition
   "curve, especially a sharp one, in a road, river, racecourse, or path"})

(def Bluff
  {:db/ident :fibo-fnd-plc-uspsai/Bluff,
   :fibo-fnd-utl-av/commonDesignation #{"BLUF" "BLF" "BLUFF"},
   :fibo-fnd-utl-av/preferredDesignation "BLF",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "bluff",
   :skos/definition "broad, rounded cliff"})

(def Bluffs
  {:db/ident :fibo-fnd-plc-uspsai/Bluffs,
   :fibo-fnd-utl-av/commonDesignation "BLUFFS",
   :fibo-fnd-utl-av/preferredDesignation "BLFS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "bluffs",
   :skos/definition "multiple broad, rounded cliffs"})

(def Bottom
  {:db/ident :fibo-fnd-plc-uspsai/Bottom,
   :fibo-fnd-utl-av/commonDesignation #{"BOTTOM" "BOTTM" "BTM" "BOT"},
   :fibo-fnd-utl-av/preferredDesignation "BTM",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "bottom",
   :skos/definition
   "deepest or lowest part of something, such as the bottom of a hill"})

(def Boulevard
  {:db/ident :fibo-fnd-plc-uspsai/Boulevard,
   :fibo-fnd-utl-av/commonDesignation #{"BOUL" "BOULEVARD" "BLVD" "BOULV"},
   :fibo-fnd-utl-av/preferredDesignation "BLVD",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "boulevard",
   :skos/definition
   "broad thoroughfare in a city, usually having areas at the sides or center for trees, grass, or flowers"})

(def Branch
  {:db/ident :fibo-fnd-plc-uspsai/Branch,
   :fibo-fnd-utl-av/commonDesignation #{"BRNCH" "BRANCH" "BR"},
   :fibo-fnd-utl-av/preferredDesignation "BR",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "branch",
   :skos/definition "division of a road or path"})

(def Bridge
  {:db/ident :fibo-fnd-plc-uspsai/Bridge,
   :fibo-fnd-utl-av/commonDesignation #{"BRG" "BRIDGE" "BRDGE"},
   :fibo-fnd-utl-av/preferredDesignation "BRG",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "bridge",
   :skos/definition
   "structure carrying a road, path, railroad, or canal across a river, ravine, road, railroad, or other obstacle"})

(def Brook
  {:db/ident :fibo-fnd-plc-uspsai/Brook,
   :fibo-fnd-utl-av/commonDesignation #{"BRK" "BROOK"},
   :fibo-fnd-utl-av/preferredDesignation "BRK",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "brook",
   :skos/definition "small, natural freshwater stream"})

(def Brooks
  {:db/ident :fibo-fnd-plc-uspsai/Brooks,
   :fibo-fnd-utl-av/commonDesignation "BROOKS",
   :fibo-fnd-utl-av/preferredDesignation "BRKS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "brooks",
   :skos/definition "multiple small, natural freshwater streams"})

(def Burg
  {:db/ident :fibo-fnd-plc-uspsai/Burg,
   :fibo-fnd-utl-av/commonDesignation "BURG",
   :fibo-fnd-utl-av/preferredDesignation "BG",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "burg",
   :skos/definition "city or town (informal)"})

(def Burgs
  {:db/ident :fibo-fnd-plc-uspsai/Burgs,
   :fibo-fnd-utl-av/commonDesignation "BURGS",
   :fibo-fnd-utl-av/preferredDesignation "BGS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "burgs",
   :skos/definition "multiple cities or towns (informal)"})

(def Bypass
  {:db/ident :fibo-fnd-plc-uspsai/Bypass,
   :fibo-fnd-utl-av/commonDesignation #{"BYPAS" "BYPASS" "BYPA" "BYS" "BYP"},
   :fibo-fnd-utl-av/preferredDesignation "BYP",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "bypass",
   :skos/definition
   "road passing around a town or its center to provide an alternative route for through traffic"})

(def CA
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/California,
   :cmns-id/identifies :lcc-3166-2-us/California,
   :db/ident :fibo-fnd-plc-uspsai/CA,
   :fibo-fnd-rel-rel/hasTag "CA",
   :fibo-fnd-utl-av/preferredDesignation "CA",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "CA",
   :skos/definition "US-specific code for the designation for California"})

(def CO
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Colorado,
   :cmns-id/identifies :lcc-3166-2-us/Colorado,
   :db/ident :fibo-fnd-plc-uspsai/CO,
   :fibo-fnd-rel-rel/hasTag "CO",
   :fibo-fnd-utl-av/preferredDesignation "CO",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "CO",
   :skos/definition "US-specific code for the designation for Colorado"})

(def CT
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Connecticut,
   :cmns-id/identifies :lcc-3166-2-us/Connecticut,
   :db/ident :fibo-fnd-plc-uspsai/CT,
   :fibo-fnd-rel-rel/hasTag "CT",
   :fibo-fnd-utl-av/preferredDesignation "CT",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "CT",
   :skos/definition "US-specific code for the designation for Connecticut"})

(def Camp
  {:db/ident :fibo-fnd-plc-uspsai/Camp,
   :fibo-fnd-utl-av/commonDesignation #{"CAMP" "CP" "CMP"},
   :fibo-fnd-utl-av/preferredDesignation "CP",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "camp"})

(def Canyon
  {:db/ident :fibo-fnd-plc-uspsai/Canyon,
   :fibo-fnd-utl-av/commonDesignation #{"CANYN" "CNYN" "CANYON"},
   :fibo-fnd-utl-av/preferredDesignation "CYN",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "canyon"})

(def Cape
  {:db/ident :fibo-fnd-plc-uspsai/Cape,
   :fibo-fnd-utl-av/commonDesignation #{"CPE" "CAPE"},
   :fibo-fnd-utl-av/preferredDesignation "CPE",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "cape"})

(def Causeway
  {:db/ident :fibo-fnd-plc-uspsai/Causeway,
   :fibo-fnd-utl-av/commonDesignation #{"CAUSWA" "CSWY" "CAUSEWAY"},
   :fibo-fnd-utl-av/preferredDesignation "CSWY",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "causeway"})

(def Center
  {:db/ident :fibo-fnd-plc-uspsai/Center,
   :fibo-fnd-utl-av/commonDesignation #{"CENTRE" "CTR" "CENTER" "CNTR" "CEN"
                                        "CNTER" "CENT" "CENTR"},
   :fibo-fnd-utl-av/preferredDesignation "CTR",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "center"})

(def Centers
  {:db/ident :fibo-fnd-plc-uspsai/Centers,
   :fibo-fnd-utl-av/commonDesignation "CENTERS",
   :fibo-fnd-utl-av/preferredDesignation "CTRS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "centers"})

(def Circle
  {:db/ident :fibo-fnd-plc-uspsai/Circle,
   :fibo-fnd-utl-av/commonDesignation #{"CIRCL" "CIRCLE" "CIR" "CIRC" "CRCL"
                                        "CRCLE"},
   :fibo-fnd-utl-av/preferredDesignation "CIR",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "circle"})

(def Circles
  {:db/ident :fibo-fnd-plc-uspsai/Circles,
   :fibo-fnd-utl-av/commonDesignation "CIRCLES",
   :fibo-fnd-utl-av/preferredDesignation "CIRS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "circles"})

(def Cliff
  {:db/ident :fibo-fnd-plc-uspsai/Cliff,
   :fibo-fnd-utl-av/commonDesignation #{"CLF" "CLIFF"},
   :fibo-fnd-utl-av/preferredDesignation "CLF",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "cliff"})

(def Cliffs
  {:db/ident :fibo-fnd-plc-uspsai/Cliffs,
   :fibo-fnd-utl-av/commonDesignation #{"CLIFFS" "CLFS"},
   :fibo-fnd-utl-av/preferredDesignation "CLFS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "cliffs"})

(def Club
  {:db/ident :fibo-fnd-plc-uspsai/Club,
   :fibo-fnd-utl-av/commonDesignation #{"CLB" "CLUB"},
   :fibo-fnd-utl-av/preferredDesignation "CLB",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "club"})

(def Common
  {:db/ident :fibo-fnd-plc-uspsai/Common,
   :fibo-fnd-utl-av/commonDesignation "COMMON",
   :fibo-fnd-utl-av/preferredDesignation "CMN",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "common"})

(def Commons
  {:db/ident :fibo-fnd-plc-uspsai/Commons,
   :fibo-fnd-utl-av/commonDesignation "COMMONS",
   :fibo-fnd-utl-av/preferredDesignation "CMNS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "commons"})

(def Corner
  {:db/ident :fibo-fnd-plc-uspsai/Corner,
   :fibo-fnd-utl-av/commonDesignation #{"COR" "CORNER"},
   :fibo-fnd-utl-av/preferredDesignation "COR",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "corner"})

(def Corners
  {:db/ident :fibo-fnd-plc-uspsai/Corners,
   :fibo-fnd-utl-av/commonDesignation #{"CORS" "CORNERS"},
   :fibo-fnd-utl-av/preferredDesignation "CORS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "corners"})

(def Course
  {:db/ident :fibo-fnd-plc-uspsai/Course,
   :fibo-fnd-utl-av/commonDesignation #{"COURSE" "CRSE"},
   :fibo-fnd-utl-av/preferredDesignation "CRSE",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "course"})

(def Court
  {:db/ident :fibo-fnd-plc-uspsai/Court,
   :fibo-fnd-utl-av/commonDesignation #{"COURT" "CT"},
   :fibo-fnd-utl-av/preferredDesignation "CT",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "court"})

(def Courts
  {:db/ident :fibo-fnd-plc-uspsai/Courts,
   :fibo-fnd-utl-av/commonDesignation #{"COURTS" "CTS"},
   :fibo-fnd-utl-av/preferredDesignation "CTS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "courts"})

(def Cove
  {:db/ident :fibo-fnd-plc-uspsai/Cove,
   :fibo-fnd-utl-av/commonDesignation #{"CV" "COVE"},
   :fibo-fnd-utl-av/preferredDesignation "CV",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "cove"})

(def Coves
  {:db/ident :fibo-fnd-plc-uspsai/Coves,
   :fibo-fnd-utl-av/commonDesignation "COVES",
   :fibo-fnd-utl-av/preferredDesignation "CVS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "coves"})

(def Creek
  {:db/ident :fibo-fnd-plc-uspsai/Creek,
   :fibo-fnd-utl-av/commonDesignation #{"CRK" "CREEK"},
   :fibo-fnd-utl-av/preferredDesignation "CRK",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "creek"})

(def Crescent
  {:db/ident :fibo-fnd-plc-uspsai/Crescent,
   :fibo-fnd-utl-av/commonDesignation #{"CRSENT" "CRESCENT" "CRES" "CRSNT"},
   :fibo-fnd-utl-av/preferredDesignation "CRES",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "crescent"})

(def Crest
  {:db/ident :fibo-fnd-plc-uspsai/Crest,
   :fibo-fnd-utl-av/commonDesignation "CREST",
   :fibo-fnd-utl-av/preferredDesignation "CRST",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "crest"})

(def Crossing
  {:db/ident :fibo-fnd-plc-uspsai/Crossing,
   :fibo-fnd-utl-av/commonDesignation #{"CRSSNG" "XING" "CROSSING"},
   :fibo-fnd-utl-av/preferredDesignation "XING",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "crossing"})

(def Crossroad
  {:db/ident :fibo-fnd-plc-uspsai/Crossroad,
   :fibo-fnd-utl-av/commonDesignation "CROSSROAD",
   :fibo-fnd-utl-av/preferredDesignation "XRD",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "crossroad"})

(def Crossroads
  {:db/ident :fibo-fnd-plc-uspsai/Crossroads,
   :fibo-fnd-utl-av/commonDesignation "CROSSROADS",
   :fibo-fnd-utl-av/preferredDesignation "XRDS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "crossroads"})

(def Curve
  {:db/ident :fibo-fnd-plc-uspsai/Curve,
   :fibo-fnd-utl-av/commonDesignation "CURVE",
   :fibo-fnd-utl-av/preferredDesignation "CURV",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "curve"})

(def DC
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/DistrictOfColumbia,
   :cmns-id/identifies :lcc-3166-2-us/DistrictOfColumbia,
   :db/ident :fibo-fnd-plc-uspsai/DC,
   :fibo-fnd-rel-rel/hasTag "DC",
   :fibo-fnd-utl-av/preferredDesignation "DC",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "DC",
   :skos/definition
   "US-specific code for the designation for the District of Colombia"})

(def DE
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Delaware,
   :cmns-id/identifies :lcc-3166-2-us/Delaware,
   :db/ident :fibo-fnd-plc-uspsai/DE,
   :fibo-fnd-rel-rel/hasTag "DE",
   :fibo-fnd-utl-av/preferredDesignation "DE",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "DE",
   :skos/definition "US-specific code for the designation for Delaware"})

(def Dale
  {:db/ident :fibo-fnd-plc-uspsai/Dale,
   :fibo-fnd-utl-av/commonDesignation #{"DL" "DALE"},
   :fibo-fnd-utl-av/preferredDesignation "DL",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "dale"})

(def Dam
  {:db/ident :fibo-fnd-plc-uspsai/Dam,
   :fibo-fnd-utl-av/commonDesignation #{"DM" "DAM"},
   :fibo-fnd-utl-av/preferredDesignation "DM",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "dam"})

(def Divide
  {:db/ident :fibo-fnd-plc-uspsai/Divide,
   :fibo-fnd-utl-av/commonDesignation #{"DV" "DIVIDE" "DVD" "DIV"},
   :fibo-fnd-utl-av/preferredDesignation "DV",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "divide"})

(def Drive
  {:db/ident :fibo-fnd-plc-uspsai/Drive,
   :fibo-fnd-utl-av/commonDesignation #{"DRIV" "DRV" "DRIVE" "DR"},
   :fibo-fnd-utl-av/preferredDesignation "DR",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "drive"})

(def Drives
  {:db/ident :fibo-fnd-plc-uspsai/Drives,
   :fibo-fnd-utl-av/commonDesignation "DRIVES",
   :fibo-fnd-utl-av/preferredDesignation "DRS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "drives"})

(def Estate
  {:db/ident :fibo-fnd-plc-uspsai/Estate,
   :fibo-fnd-utl-av/commonDesignation #{"ESTATE" "EST"},
   :fibo-fnd-utl-av/preferredDesignation "EST",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "estate"})

(def Estates
  {:db/ident :fibo-fnd-plc-uspsai/Estates,
   :fibo-fnd-utl-av/commonDesignation #{"ESTS" "ESTATES"},
   :fibo-fnd-utl-av/preferredDesignation "ESTS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "estates"})

(def Expressway
  {:db/ident :fibo-fnd-plc-uspsai/Expressway,
   :fibo-fnd-utl-av/commonDesignation #{"EXPY" "EXPRESSWAY" "EXPR" "EXPRESS"
                                        "EXP" "EXPW"},
   :fibo-fnd-utl-av/preferredDesignation "EXPY",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "expressway"})

(def Extension
  {:db/ident :fibo-fnd-plc-uspsai/Extension,
   :fibo-fnd-utl-av/commonDesignation #{"EXTNSN" "EXTN" "EXTENSION" "EXT"},
   :fibo-fnd-utl-av/preferredDesignation "EXT",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "extension"})

(def Extensions
  {:db/ident :fibo-fnd-plc-uspsai/Extensions,
   :fibo-fnd-utl-av/commonDesignation "EXTS",
   :fibo-fnd-utl-av/preferredDesignation "EXTS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "extensions"})

(def FL
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Florida,
   :cmns-id/identifies :lcc-3166-2-us/Florida,
   :db/ident :fibo-fnd-plc-uspsai/FL,
   :fibo-fnd-rel-rel/hasTag "FL",
   :fibo-fnd-utl-av/preferredDesignation "FL",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "FL",
   :skos/definition "US-specific code for the designation for Florida"})

(def Fall
  {:db/ident :fibo-fnd-plc-uspsai/Fall,
   :fibo-fnd-utl-av/commonDesignation "FALL",
   :fibo-fnd-utl-av/preferredDesignation "FALL",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "fall"})

(def Falls
  {:db/ident :fibo-fnd-plc-uspsai/Falls,
   :fibo-fnd-utl-av/commonDesignation #{"FLS" "FALLS"},
   :fibo-fnd-utl-av/preferredDesignation "FLS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "falls"})

(def Ferry
  {:db/ident :fibo-fnd-plc-uspsai/Ferry,
   :fibo-fnd-utl-av/commonDesignation #{"FRY" "FRRY" "FERRY"},
   :fibo-fnd-utl-av/preferredDesignation "FRY",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "ferry"})

(def Field
  {:db/ident :fibo-fnd-plc-uspsai/Field,
   :fibo-fnd-utl-av/commonDesignation #{"FLD" "FIELD"},
   :fibo-fnd-utl-av/preferredDesignation "FLD",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "field"})

(def Fields
  {:db/ident :fibo-fnd-plc-uspsai/Fields,
   :fibo-fnd-utl-av/commonDesignation #{"FIELDS" "FLDS"},
   :fibo-fnd-utl-av/preferredDesignation "FLDS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "fields"})

(def Flat
  {:db/ident :fibo-fnd-plc-uspsai/Flat,
   :fibo-fnd-utl-av/commonDesignation #{"FLAT" "FLT"},
   :fibo-fnd-utl-av/preferredDesignation "FLT",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "flat"})

(def Flats
  {:db/ident :fibo-fnd-plc-uspsai/Flats,
   :fibo-fnd-utl-av/commonDesignation #{"FLATS" "FLTS"},
   :fibo-fnd-utl-av/preferredDesignation "FLTS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "flats"})

(def Ford
  {:db/ident :fibo-fnd-plc-uspsai/Ford,
   :fibo-fnd-utl-av/commonDesignation #{"FRD" "FORD"},
   :fibo-fnd-utl-av/preferredDesignation "FRD",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "ford"})

(def Fords
  {:db/ident :fibo-fnd-plc-uspsai/Fords,
   :fibo-fnd-utl-av/commonDesignation "FORDS",
   :fibo-fnd-utl-av/preferredDesignation "FRDS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "fords"})

(def Forest
  {:db/ident :fibo-fnd-plc-uspsai/Forest,
   :fibo-fnd-utl-av/commonDesignation #{"FOREST" "FRST" "FORESTS"},
   :fibo-fnd-utl-av/preferredDesignation "FRST",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "forest"})

(def Forge
  {:db/ident :fibo-fnd-plc-uspsai/Forge,
   :fibo-fnd-utl-av/commonDesignation #{"FORGE" "FRG" "FORG"},
   :fibo-fnd-utl-av/preferredDesignation "FRG",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "forge"})

(def Forges
  {:db/ident :fibo-fnd-plc-uspsai/Forges,
   :fibo-fnd-utl-av/commonDesignation "FORGES",
   :fibo-fnd-utl-av/preferredDesignation "FRGS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "forges"})

(def Fork
  {:db/ident :fibo-fnd-plc-uspsai/Fork,
   :fibo-fnd-utl-av/commonDesignation #{"FORK" "FRK"},
   :fibo-fnd-utl-av/preferredDesignation "FRK",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "fork"})

(def Forks
  {:db/ident :fibo-fnd-plc-uspsai/Forks,
   :fibo-fnd-utl-av/commonDesignation #{"FORKS" "FRKS"},
   :fibo-fnd-utl-av/preferredDesignation "FRKS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "forks"})

(def Fort
  {:db/ident :fibo-fnd-plc-uspsai/Fort,
   :fibo-fnd-utl-av/commonDesignation #{"FORT" "FT" "FRT"},
   :fibo-fnd-utl-av/preferredDesignation "FT",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "fort"})

(def Freeway
  {:db/ident :fibo-fnd-plc-uspsai/Freeway,
   :fibo-fnd-utl-av/commonDesignation #{"FREEWY" "FRWAY" "FREEWAY" "FWY"
                                        "FRWY"},
   :fibo-fnd-utl-av/preferredDesignation "FWY",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "freeway"})

(def GA
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Georgia,
   :cmns-id/identifies :lcc-3166-2-us/Georgia,
   :db/ident :fibo-fnd-plc-uspsai/GA,
   :fibo-fnd-rel-rel/hasTag "GA",
   :fibo-fnd-utl-av/preferredDesignation "GA",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "GA",
   :skos/definition "US-specific code for the designation for Georgia"})

(def GU
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Guam,
   :cmns-id/identifies :lcc-3166-2-us/Guam,
   :db/ident :fibo-fnd-plc-uspsai/GU,
   :fibo-fnd-rel-rel/hasTag "GU",
   :fibo-fnd-utl-av/preferredDesignation "GU",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "GU",
   :skos/definition "US-specific code for the designation for Guam"})

(def Garden
  {:db/ident :fibo-fnd-plc-uspsai/Garden,
   :fibo-fnd-utl-av/commonDesignation #{"GRDN" "GARDEN" "GARDN" "GRDEN"},
   :fibo-fnd-utl-av/preferredDesignation "GDN",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "garden"})

(def Gardens
  {:db/ident :fibo-fnd-plc-uspsai/Gardens,
   :fibo-fnd-utl-av/commonDesignation #{"GDNS" "GRDNS" "GARDENS"},
   :fibo-fnd-utl-av/preferredDesignation "GDNS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "gardens"})

(def Gateway
  {:db/ident :fibo-fnd-plc-uspsai/Gateway,
   :fibo-fnd-utl-av/commonDesignation #{"GATWAY" "GATEWY" "GATEWAY" "GTWY"
                                        "GTWAY"},
   :fibo-fnd-utl-av/preferredDesignation "GTWY",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "gateway"})

(def Glen
  {:db/ident :fibo-fnd-plc-uspsai/Glen,
   :fibo-fnd-utl-av/commonDesignation #{"GLN" "GLEN"},
   :fibo-fnd-utl-av/preferredDesignation "GLN",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "glen"})

(def Glens
  {:db/ident :fibo-fnd-plc-uspsai/Glens,
   :fibo-fnd-utl-av/commonDesignation "GLENS",
   :fibo-fnd-utl-av/preferredDesignation "GLNS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "glens"})

(def Green
  {:db/ident :fibo-fnd-plc-uspsai/Green,
   :fibo-fnd-utl-av/commonDesignation #{"GREEN" "GRN"},
   :fibo-fnd-utl-av/preferredDesignation "GRN",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "green"})

(def Greens
  {:db/ident :fibo-fnd-plc-uspsai/Greens,
   :fibo-fnd-utl-av/commonDesignation "GREENS",
   :fibo-fnd-utl-av/preferredDesignation "GRNS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "greens"})

(def Grove
  {:db/ident :fibo-fnd-plc-uspsai/Grove,
   :fibo-fnd-utl-av/commonDesignation #{"GROV" "GRV" "GROVE"},
   :fibo-fnd-utl-av/preferredDesignation "GRV",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "grove"})

(def Groves
  {:db/ident :fibo-fnd-plc-uspsai/Groves,
   :fibo-fnd-utl-av/commonDesignation "GROVES",
   :fibo-fnd-utl-av/preferredDesignation "GRVS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "groves"})

(def HI
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Hawaii,
   :cmns-id/identifies :lcc-3166-2-us/Hawaii,
   :db/ident :fibo-fnd-plc-uspsai/HI,
   :fibo-fnd-rel-rel/hasTag "HI",
   :fibo-fnd-utl-av/preferredDesignation "HI",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "HI",
   :skos/definition "US-specific code for the designation for Hawaii"})

(def Harbor
  {:db/ident :fibo-fnd-plc-uspsai/Harbor,
   :fibo-fnd-utl-av/commonDesignation #{"HARB" "HARBR" "HRBOR" "HARBOR" "HBR"},
   :fibo-fnd-utl-av/preferredDesignation "HBR",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "harbor"})

(def Harbors
  {:db/ident :fibo-fnd-plc-uspsai/Harbors,
   :fibo-fnd-utl-av/commonDesignation "HARBORS",
   :fibo-fnd-utl-av/preferredDesignation "HBRS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "harbors"})

(def Haven
  {:db/ident :fibo-fnd-plc-uspsai/Haven,
   :fibo-fnd-utl-av/commonDesignation #{"HAVEN" "HVN"},
   :fibo-fnd-utl-av/preferredDesignation "HVN",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "haven"})

(def Heights
  {:db/ident :fibo-fnd-plc-uspsai/Heights,
   :fibo-fnd-utl-av/commonDesignation #{"HT" "HTS"},
   :fibo-fnd-utl-av/preferredDesignation "HTS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "heights"})

(def Highway
  {:db/ident :fibo-fnd-plc-uspsai/Highway,
   :fibo-fnd-utl-av/commonDesignation #{"HIWY" "HIGHWAY" "HIWAY" "HIGHWY" "HWAY"
                                        "HWY"},
   :fibo-fnd-utl-av/preferredDesignation "HWY",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "highway"})

(def Hill
  {:db/ident :fibo-fnd-plc-uspsai/Hill,
   :fibo-fnd-utl-av/commonDesignation #{"HILL" "HL"},
   :fibo-fnd-utl-av/preferredDesignation "HL",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "hill"})

(def Hills
  {:db/ident :fibo-fnd-plc-uspsai/Hills,
   :fibo-fnd-utl-av/commonDesignation #{"HILLS" "HLS"},
   :fibo-fnd-utl-av/preferredDesignation "HLS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "hills"})

(def Hollow
  {:db/ident :fibo-fnd-plc-uspsai/Hollow,
   :fibo-fnd-utl-av/commonDesignation #{"HOLW" "HLLW" "HOLLOWS" "HOLLOW"
                                        "HOLWS"},
   :fibo-fnd-utl-av/preferredDesignation "HOLW",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "hollow"})

(def IA
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Iowa,
   :cmns-id/identifies :lcc-3166-2-us/Iowa,
   :db/ident :fibo-fnd-plc-uspsai/IA,
   :fibo-fnd-rel-rel/hasTag "IA",
   :fibo-fnd-utl-av/preferredDesignation "IA",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "IA",
   :skos/definition "US-specific code for the designation for Iowa"})

(def ID
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Idaho,
   :cmns-id/identifies :lcc-3166-2-us/Idaho,
   :db/ident :fibo-fnd-plc-uspsai/ID,
   :fibo-fnd-rel-rel/hasTag "ID",
   :fibo-fnd-utl-av/preferredDesignation "ID",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "ID",
   :skos/definition "US-specific code for the designation for Idaho"})

(def IL
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Illinois,
   :cmns-id/identifies :lcc-3166-2-us/Illinois,
   :db/ident :fibo-fnd-plc-uspsai/IL,
   :fibo-fnd-rel-rel/hasTag "IL",
   :fibo-fnd-utl-av/preferredDesignation "IL",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "IL",
   :skos/definition "US-specific code for the designation for Illinois"})

(def IN
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Indiana,
   :cmns-id/identifies :lcc-3166-2-us/Indiana,
   :db/ident :fibo-fnd-plc-uspsai/IN,
   :fibo-fnd-rel-rel/hasTag "IN",
   :fibo-fnd-utl-av/preferredDesignation "IN",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "IN",
   :skos/definition "US-specific code for the designation for Indiana"})

(def Inlet
  {:db/ident :fibo-fnd-plc-uspsai/Inlet,
   :fibo-fnd-utl-av/commonDesignation "INLT",
   :fibo-fnd-utl-av/preferredDesignation "INLT",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "inlet"})

(def Island
  {:db/ident :fibo-fnd-plc-uspsai/Island,
   :fibo-fnd-utl-av/commonDesignation #{"ISLAND" "ISLND" "IS"},
   :fibo-fnd-utl-av/preferredDesignation "IS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "island"})

(def Islands
  {:db/ident :fibo-fnd-plc-uspsai/Islands,
   :fibo-fnd-utl-av/commonDesignation #{"ISLNDS" "ISLANDS" "ISS"},
   :fibo-fnd-utl-av/preferredDesignation "ISS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "islands"})

(def Isle
  {:db/ident :fibo-fnd-plc-uspsai/Isle,
   :fibo-fnd-utl-av/commonDesignation #{"ISLES" "ISLE"},
   :fibo-fnd-utl-av/preferredDesignation "ISLE",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "isle"})

(def Junction
  {:db/ident :fibo-fnd-plc-uspsai/Junction,
   :fibo-fnd-utl-av/commonDesignation #{"JCT" "JCTN" "JUNCTON" "JUNCTION"
                                        "JCTION" "JUNCTN"},
   :fibo-fnd-utl-av/preferredDesignation "JCT",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "junction"})

(def Junctions
  {:db/ident :fibo-fnd-plc-uspsai/Junctions,
   :fibo-fnd-utl-av/commonDesignation #{"JCTS" "JUNCTIONS" "JCTNS"},
   :fibo-fnd-utl-av/preferredDesignation "JCTS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "junctions"})

(def KS
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Kansas,
   :cmns-id/identifies :lcc-3166-2-us/Kansas,
   :db/ident :fibo-fnd-plc-uspsai/KS,
   :fibo-fnd-rel-rel/hasTag "KS",
   :fibo-fnd-utl-av/preferredDesignation "KS",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "KS",
   :skos/definition "US-specific code for the designation for Kansas"})

(def KY
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Kentucky,
   :cmns-id/identifies :lcc-3166-2-us/Kentucky,
   :db/ident :fibo-fnd-plc-uspsai/KY,
   :fibo-fnd-rel-rel/hasTag "KY",
   :fibo-fnd-utl-av/preferredDesignation "KY",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "KY",
   :skos/definition "US-specific code for the designation for Kentucky"})

(def Key
  {:db/ident :fibo-fnd-plc-uspsai/Key,
   :fibo-fnd-utl-av/commonDesignation #{"KY" "KEY"},
   :fibo-fnd-utl-av/preferredDesignation "KY",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "key"})

(def Keys
  {:db/ident :fibo-fnd-plc-uspsai/Keys,
   :fibo-fnd-utl-av/commonDesignation #{"KYS" "KEYS"},
   :fibo-fnd-utl-av/preferredDesignation "KYS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "keys"})

(def Knoll
  {:db/ident :fibo-fnd-plc-uspsai/Knoll,
   :fibo-fnd-utl-av/commonDesignation #{"KNOL" "KNOLL" "KNL"},
   :fibo-fnd-utl-av/preferredDesignation "KNL",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "knoll"})

(def Knolls
  {:db/ident :fibo-fnd-plc-uspsai/Knolls,
   :fibo-fnd-utl-av/commonDesignation #{"KNOLLS" "KNLS"},
   :fibo-fnd-utl-av/preferredDesignation "KNLS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "knolls"})

(def LA
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Louisiana,
   :cmns-id/identifies :lcc-3166-2-us/Louisiana,
   :db/ident :fibo-fnd-plc-uspsai/LA,
   :fibo-fnd-rel-rel/hasTag "LA",
   :fibo-fnd-utl-av/preferredDesignation "LA",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "LA",
   :skos/definition "US-specific code for the designation for Louisiana"})

(def Lake
  {:db/ident :fibo-fnd-plc-uspsai/Lake,
   :fibo-fnd-utl-av/commonDesignation #{"LAKE" "LK"},
   :fibo-fnd-utl-av/preferredDesignation "LK",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "lake"})

(def Lakes
  {:db/ident :fibo-fnd-plc-uspsai/Lakes,
   :fibo-fnd-utl-av/commonDesignation #{"LAKES" "LKS"},
   :fibo-fnd-utl-av/preferredDesignation "LKS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "lakes"})

(def Land
  {:db/ident :fibo-fnd-plc-uspsai/Land,
   :fibo-fnd-utl-av/commonDesignation "LAND",
   :fibo-fnd-utl-av/preferredDesignation "LAND",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "land"})

(def Landing
  {:db/ident :fibo-fnd-plc-uspsai/Landing,
   :fibo-fnd-utl-av/commonDesignation #{"LNDNG" "LNDG" "LANDING"},
   :fibo-fnd-utl-av/preferredDesignation "LNDG",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "landing"})

(def Lane
  {:db/ident :fibo-fnd-plc-uspsai/Lane,
   :fibo-fnd-utl-av/commonDesignation #{"LN" "LANE"},
   :fibo-fnd-utl-av/preferredDesignation "LN",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "lane"})

(def Light
  {:db/ident :fibo-fnd-plc-uspsai/Light,
   :fibo-fnd-utl-av/commonDesignation #{"LIGHT" "LGT"},
   :fibo-fnd-utl-av/preferredDesignation "LGT",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "light"})

(def Lights
  {:db/ident :fibo-fnd-plc-uspsai/Lights,
   :fibo-fnd-utl-av/commonDesignation "LIGHTS",
   :fibo-fnd-utl-av/preferredDesignation "LGTS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "lights"})

(def Loaf
  {:db/ident :fibo-fnd-plc-uspsai/Loaf,
   :fibo-fnd-utl-av/commonDesignation #{"LOAF" "LF"},
   :fibo-fnd-utl-av/preferredDesignation "LF",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "loaf"})

(def Lock
  {:db/ident :fibo-fnd-plc-uspsai/Lock,
   :fibo-fnd-utl-av/commonDesignation #{"LCK" "LOCK"},
   :fibo-fnd-utl-av/preferredDesignation "LCK",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "lock"})

(def Locks
  {:db/ident :fibo-fnd-plc-uspsai/Locks,
   :fibo-fnd-utl-av/commonDesignation #{"LCKS" "LOCKS"},
   :fibo-fnd-utl-av/preferredDesignation "LCKS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "locks"})

(def Lodge
  {:db/ident :fibo-fnd-plc-uspsai/Lodge,
   :fibo-fnd-utl-av/commonDesignation #{"LDGE" "LODG" "LDG" "LODGE"},
   :fibo-fnd-utl-av/preferredDesignation "LDG",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "lodge"})

(def Loop
  {:db/ident :fibo-fnd-plc-uspsai/Loop,
   :fibo-fnd-utl-av/commonDesignation #{"LOOP" "LOOPS"},
   :fibo-fnd-utl-av/preferredDesignation "LOOP",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "loop"})

(def MA
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Massachusetts,
   :cmns-id/identifies :lcc-3166-2-us/Massachusetts,
   :db/ident :fibo-fnd-plc-uspsai/MA,
   :fibo-fnd-rel-rel/hasTag "MA",
   :fibo-fnd-utl-av/preferredDesignation "MA",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "MA",
   :skos/definition "US-specific code for the designation for Massachusetts"})

(def MB
  {:cmns-cxtdsg/isUsedBy #{:lcc-3166-1/Canada
                           :lcc-3166-1/UnitedStatesOfAmerica},
   :cmns-dsg/denotes :lcc-3166-2-ca/Manitoba,
   :cmns-id/identifies :lcc-3166-2-ca/Manitoba,
   :db/ident :fibo-fnd-plc-uspsai/MB,
   :fibo-fnd-rel-rel/hasTag "MB",
   :fibo-fnd-utl-av/preferredDesignation "MB",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "MB",
   :skos/definition
   "Canadian and US-specific code for the designation for Manitoba"})

(def MD
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Maryland,
   :cmns-id/identifies :lcc-3166-2-us/Maryland,
   :db/ident :fibo-fnd-plc-uspsai/MD,
   :fibo-fnd-rel-rel/hasTag "MD",
   :fibo-fnd-utl-av/preferredDesignation "MD",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "MD",
   :skos/definition "US-specific code for the designation for Maryland"})

(def ME
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Maine,
   :cmns-id/identifies :lcc-3166-2-us/Maine,
   :db/ident :fibo-fnd-plc-uspsai/ME,
   :fibo-fnd-rel-rel/hasTag "ME",
   :fibo-fnd-utl-av/preferredDesignation "ME",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "ME",
   :skos/definition "US-specific code for the designation for Maine"})

(def MI
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Michigan,
   :cmns-id/identifies :lcc-3166-2-us/Michigan,
   :db/ident :fibo-fnd-plc-uspsai/MI,
   :fibo-fnd-rel-rel/hasTag "MI",
   :fibo-fnd-utl-av/preferredDesignation "MI",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "MI",
   :skos/definition "US-specific code for the designation for Michigan"})

(def MN
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Minnesota,
   :cmns-id/identifies :lcc-3166-2-us/Minnesota,
   :db/ident :fibo-fnd-plc-uspsai/MN,
   :fibo-fnd-rel-rel/hasTag "MN",
   :fibo-fnd-utl-av/preferredDesignation "MN",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "MN",
   :skos/definition "US-specific code for the designation for Minnesota"})

(def MO
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Missouri,
   :cmns-id/identifies :lcc-3166-2-us/Missouri,
   :db/ident :fibo-fnd-plc-uspsai/MO,
   :fibo-fnd-rel-rel/hasTag "MO",
   :fibo-fnd-utl-av/preferredDesignation "MO",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "MO",
   :skos/definition "US-specific code for the designation for Missouri"})

(def MP
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/NorthernMarianaIslands,
   :cmns-id/identifies :lcc-3166-2-us/NorthernMarianaIslands,
   :db/ident :fibo-fnd-plc-uspsai/MP,
   :fibo-fnd-rel-rel/hasTag "MP",
   :fibo-fnd-utl-av/preferredDesignation "MP",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "MP",
   :skos/definition
   "US-specific code for the designation for the outlying area of Northern Mariana Islands"})

(def MS
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Mississippi,
   :cmns-id/identifies :lcc-3166-2-us/Mississippi,
   :db/ident :fibo-fnd-plc-uspsai/MS,
   :fibo-fnd-rel-rel/hasTag "MS",
   :fibo-fnd-utl-av/preferredDesignation "MS",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "MS",
   :skos/definition "US-specific code for the designation for Mississippi"})

(def MT
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Montana,
   :cmns-id/identifies :lcc-3166-2-us/Montana,
   :db/ident :fibo-fnd-plc-uspsai/MT,
   :fibo-fnd-rel-rel/hasTag "MT",
   :fibo-fnd-utl-av/preferredDesignation "MT",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "MT",
   :skos/definition "US-specific code for the designation for Montana"})

(def Mall
  {:db/ident :fibo-fnd-plc-uspsai/Mall,
   :fibo-fnd-utl-av/commonDesignation "MALL",
   :fibo-fnd-utl-av/preferredDesignation "MALL",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "mall"})

(def Manor
  {:db/ident :fibo-fnd-plc-uspsai/Manor,
   :fibo-fnd-utl-av/commonDesignation #{"MNR" "MANOR"},
   :fibo-fnd-utl-av/preferredDesignation "MNR",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "manor"})

(def Manors
  {:db/ident :fibo-fnd-plc-uspsai/Manors,
   :fibo-fnd-utl-av/commonDesignation #{"MANORS" "MNRS"},
   :fibo-fnd-utl-av/preferredDesignation "MNRS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "manors"})

(def Meadow
  {:db/ident :fibo-fnd-plc-uspsai/Meadow,
   :fibo-fnd-utl-av/commonDesignation "MEADOW",
   :fibo-fnd-utl-av/preferredDesignation "MDW",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "meadow"})

(def Meadows
  {:db/ident :fibo-fnd-plc-uspsai/Meadows,
   :fibo-fnd-utl-av/commonDesignation #{"MEDOWS" "MEADOWS" "MDW" "MDWS"},
   :fibo-fnd-utl-av/preferredDesignation "MDWS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "meadows"})

(def Mews
  {:db/ident :fibo-fnd-plc-uspsai/Mews,
   :fibo-fnd-utl-av/commonDesignation "MEWS",
   :fibo-fnd-utl-av/preferredDesignation "MEWS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "mews"})

(def Mill
  {:db/ident :fibo-fnd-plc-uspsai/Mill,
   :fibo-fnd-utl-av/commonDesignation "MILL",
   :fibo-fnd-utl-av/preferredDesignation "ML",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "mill"})

(def Mills
  {:db/ident :fibo-fnd-plc-uspsai/Mills,
   :fibo-fnd-utl-av/commonDesignation "MILLS",
   :fibo-fnd-utl-av/preferredDesignation "MLS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "mills"})

(def Mission
  {:db/ident :fibo-fnd-plc-uspsai/Mission,
   :fibo-fnd-utl-av/commonDesignation #{"MSSN" "MISSN"},
   :fibo-fnd-utl-av/preferredDesignation "MSN",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "mission"})

(def Motorway
  {:db/ident :fibo-fnd-plc-uspsai/Motorway,
   :fibo-fnd-utl-av/commonDesignation "MOTORWAY",
   :fibo-fnd-utl-av/preferredDesignation "MTWY",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "motorway"})

(def Mount
  {:db/ident :fibo-fnd-plc-uspsai/Mount,
   :fibo-fnd-utl-av/commonDesignation #{"MNT" "MT" "MOUNT"},
   :fibo-fnd-utl-av/preferredDesignation "MT",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "mount"})

(def Mountain
  {:db/ident :fibo-fnd-plc-uspsai/Mountain,
   :fibo-fnd-utl-av/commonDesignation #{"MNTN" "MTIN" "MTN" "MNTAIN" "MOUNTIN"
                                        "MOUNTAIN"},
   :fibo-fnd-utl-av/preferredDesignation "MTN",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "mountain"})

(def Mountains
  {:db/ident :fibo-fnd-plc-uspsai/Mountains,
   :fibo-fnd-utl-av/commonDesignation #{"MOUNTAINS" "MNTNS"},
   :fibo-fnd-utl-av/preferredDesignation "MTNS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "mountains"})

(def NB
  {:cmns-cxtdsg/isUsedBy #{:lcc-3166-1/Canada
                           :lcc-3166-1/UnitedStatesOfAmerica},
   :cmns-dsg/denotes :lcc-3166-2-ca/NewBrunswick,
   :cmns-id/identifies :lcc-3166-2-ca/NewBrunswick,
   :db/ident :fibo-fnd-plc-uspsai/NB,
   :fibo-fnd-rel-rel/hasTag "NB",
   :fibo-fnd-utl-av/preferredDesignation "NB",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "NB",
   :skos/definition
   "Canadian and US-specific code for the designation for New Brunswick"})

(def NC
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/NorthCarolina,
   :cmns-id/identifies :lcc-3166-2-us/NorthCarolina,
   :db/ident :fibo-fnd-plc-uspsai/NC,
   :fibo-fnd-rel-rel/hasTag "NC",
   :fibo-fnd-utl-av/preferredDesignation "NC",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "NC",
   :skos/definition "US-specific code for the designation for North Carolina"})

(def ND
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/NorthDakota,
   :cmns-id/identifies :lcc-3166-2-us/NorthDakota,
   :db/ident :fibo-fnd-plc-uspsai/ND,
   :fibo-fnd-rel-rel/hasTag "ND",
   :fibo-fnd-utl-av/preferredDesignation "ND",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "ND",
   :skos/definition "US-specific code for the designation for North Dakota"})

(def NE
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Nebraska,
   :cmns-id/identifies :lcc-3166-2-us/Nebraska,
   :db/ident :fibo-fnd-plc-uspsai/NE,
   :fibo-fnd-rel-rel/hasTag "NE",
   :fibo-fnd-utl-av/preferredDesignation "NE",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "NE",
   :skos/definition "US-specific code for the designation for Nebraska"})

(def NH
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/NewHampshire,
   :cmns-id/identifies :lcc-3166-2-us/NewHampshire,
   :db/ident :fibo-fnd-plc-uspsai/NH,
   :fibo-fnd-rel-rel/hasTag "NH",
   :fibo-fnd-utl-av/preferredDesignation "NH",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "NH",
   :skos/definition "US-specific code for the designation for New Hampshire"})

(def NJ
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/NewJersey,
   :cmns-id/identifies :lcc-3166-2-us/NewJersey,
   :db/ident :fibo-fnd-plc-uspsai/NJ,
   :fibo-fnd-rel-rel/hasTag "NJ",
   :fibo-fnd-utl-av/preferredDesignation "NJ",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "NJ",
   :skos/definition "US-specific code for the designation for New Jersey"})

(def NL
  {:cmns-cxtdsg/isUsedBy #{:lcc-3166-1/Canada
                           :lcc-3166-1/UnitedStatesOfAmerica},
   :cmns-dsg/denotes :lcc-3166-2-ca/NewfoundlandAndLabrador,
   :cmns-id/identifies :lcc-3166-2-ca/NewfoundlandAndLabrador,
   :db/ident :fibo-fnd-plc-uspsai/NL,
   :fibo-fnd-rel-rel/hasTag "NL",
   :fibo-fnd-utl-av/preferredDesignation "NL",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "NL",
   :skos/definition
   "Canadian and US-specific code for the designation for Newfoundland and Labrador"})

(def NM
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/NewMexico,
   :cmns-id/identifies :lcc-3166-2-us/NewMexico,
   :db/ident :fibo-fnd-plc-uspsai/NM,
   :fibo-fnd-rel-rel/hasTag "NM",
   :fibo-fnd-utl-av/preferredDesignation "NM",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "NM",
   :skos/definition "US-specific code for the designation for New Mexico"})

(def NS
  {:cmns-cxtdsg/isUsedBy #{:lcc-3166-1/Canada
                           :lcc-3166-1/UnitedStatesOfAmerica},
   :cmns-dsg/denotes :lcc-3166-2-ca/NovaScotia,
   :cmns-id/identifies :lcc-3166-2-ca/NovaScotia,
   :db/ident :fibo-fnd-plc-uspsai/NS,
   :fibo-fnd-rel-rel/hasTag "NS",
   :fibo-fnd-utl-av/preferredDesignation "NS",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "NS",
   :skos/definition
   "Canadian and US-specific code for the designation for Nova Scotia"})

(def NT
  {:cmns-cxtdsg/isUsedBy #{:lcc-3166-1/Canada
                           :lcc-3166-1/UnitedStatesOfAmerica},
   :cmns-dsg/denotes :lcc-3166-2-ca/NorthwestTerritories,
   :cmns-id/identifies :lcc-3166-2-ca/NorthwestTerritories,
   :db/ident :fibo-fnd-plc-uspsai/NT,
   :fibo-fnd-rel-rel/hasTag "NT",
   :fibo-fnd-utl-av/preferredDesignation "NT",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "NT",
   :skos/definition
   "Canadian and US-specific code for the designation for Northwest Territories"})

(def NU
  {:cmns-cxtdsg/isUsedBy #{:lcc-3166-1/Canada
                           :lcc-3166-1/UnitedStatesOfAmerica},
   :cmns-dsg/denotes :lcc-3166-2-ca/Nunavut,
   :cmns-id/identifies :lcc-3166-2-ca/Nunavut,
   :db/ident :fibo-fnd-plc-uspsai/NU,
   :fibo-fnd-rel-rel/hasTag "NU",
   :fibo-fnd-utl-av/preferredDesignation "NU",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "NU",
   :skos/definition
   "Canadian and US-specific code for the designation for Nunavut"})

(def NV
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Nevada,
   :cmns-id/identifies :lcc-3166-2-us/Nevada,
   :db/ident :fibo-fnd-plc-uspsai/NV,
   :fibo-fnd-rel-rel/hasTag "NV",
   :fibo-fnd-utl-av/preferredDesignation "NV",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "NV",
   :skos/definition "US-specific code for the designation for Nevada"})

(def NY
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/NewYork,
   :cmns-id/identifies :lcc-3166-2-us/NewYork,
   :db/ident :fibo-fnd-plc-uspsai/NY,
   :fibo-fnd-rel-rel/hasTag "NY",
   :fibo-fnd-utl-av/preferredDesignation "NY",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "NY",
   :skos/definition "US-specific code for the designation for New York"})

(def Neck
  {:db/ident :fibo-fnd-plc-uspsai/Neck,
   :fibo-fnd-utl-av/commonDesignation #{"NECK" "NCK"},
   :fibo-fnd-utl-av/preferredDesignation "NCK",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "neck"})

(def OH
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Ohio,
   :cmns-id/identifies :lcc-3166-2-us/Ohio,
   :db/ident :fibo-fnd-plc-uspsai/OH,
   :fibo-fnd-rel-rel/hasTag "OH",
   :fibo-fnd-utl-av/preferredDesignation "OH",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "OH",
   :skos/definition "US-specific code for the designation for Ohio"})

(def OK
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Oklahoma,
   :cmns-id/identifies :lcc-3166-2-us/Oklahoma,
   :db/ident :fibo-fnd-plc-uspsai/OK,
   :fibo-fnd-rel-rel/hasTag "OK",
   :fibo-fnd-utl-av/preferredDesignation "OK",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "OK",
   :skos/definition "US-specific code for the designation for Oklahoma"})

(def ON
  {:cmns-cxtdsg/isUsedBy #{:lcc-3166-1/Canada
                           :lcc-3166-1/UnitedStatesOfAmerica},
   :cmns-dsg/denotes :lcc-3166-2-ca/Ontario,
   :cmns-id/identifies :lcc-3166-2-ca/Ontario,
   :db/ident :fibo-fnd-plc-uspsai/ON,
   :fibo-fnd-rel-rel/hasTag "ON",
   :fibo-fnd-utl-av/preferredDesignation "ON",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "ON",
   :skos/definition
   "Canadian and US-specific code for the designation for Ontario"})

(def OR
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Oregon,
   :cmns-id/identifies :lcc-3166-2-us/Oregon,
   :db/ident :fibo-fnd-plc-uspsai/OR,
   :fibo-fnd-rel-rel/hasTag "OR",
   :fibo-fnd-utl-av/preferredDesignation "OR",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "OR",
   :skos/definition "US-specific code for the designation for Oregon"})

(def Orchard
  {:db/ident :fibo-fnd-plc-uspsai/Orchard,
   :fibo-fnd-utl-av/commonDesignation #{"ORCHRD" "ORCHARD" "ORCH"},
   :fibo-fnd-utl-av/preferredDesignation "ORCH",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "orchard"})

(def Oval
  {:db/ident :fibo-fnd-plc-uspsai/Oval,
   :fibo-fnd-utl-av/commonDesignation #{"OVL" "OVAL"},
   :fibo-fnd-utl-av/preferredDesignation "OVAL",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "oval"})

(def Overpass
  {:db/ident :fibo-fnd-plc-uspsai/Overpass,
   :fibo-fnd-utl-av/commonDesignation "OVERPASS",
   :fibo-fnd-utl-av/preferredDesignation "OPAS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "overpass"})

(def PA
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Pennsylvania,
   :cmns-id/identifies :lcc-3166-2-us/Pennsylvania,
   :db/ident :fibo-fnd-plc-uspsai/PA,
   :fibo-fnd-rel-rel/hasTag "PA",
   :fibo-fnd-utl-av/preferredDesignation "PA",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "PA",
   :skos/definition "US-specific code for the designation for Pennsylvania"})

(def PE
  {:cmns-cxtdsg/isUsedBy #{:lcc-3166-1/Canada
                           :lcc-3166-1/UnitedStatesOfAmerica},
   :cmns-dsg/denotes :lcc-3166-2-ca/PrinceEdwardIsland,
   :cmns-id/identifies :lcc-3166-2-ca/PrinceEdwardIsland,
   :db/ident :fibo-fnd-plc-uspsai/PE,
   :fibo-fnd-rel-rel/hasTag "PE",
   :fibo-fnd-utl-av/preferredDesignation "PE",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "PE",
   :skos/definition
   "Canadian and US-specific code for the designation for Prince Edward Island"})

(def PR
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/PuertoRico,
   :cmns-id/identifies :lcc-3166-2-us/PuertoRico,
   :db/ident :fibo-fnd-plc-uspsai/PR,
   :fibo-fnd-rel-rel/hasTag "PR",
   :fibo-fnd-utl-av/preferredDesignation "PR",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "PR",
   :skos/definition "US-specific code for the designation for Puerto Rico"})

(def Park
  {:db/ident :fibo-fnd-plc-uspsai/Park,
   :fibo-fnd-utl-av/commonDesignation #{"PARK" "PRK"},
   :fibo-fnd-utl-av/preferredDesignation "PARK",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "park"})

(def Parks
  {:db/ident :fibo-fnd-plc-uspsai/Parks,
   :fibo-fnd-utl-av/commonDesignation "PARKS",
   :fibo-fnd-utl-av/preferredDesignation "PARK",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "parks"})

(def Parkway
  {:db/ident :fibo-fnd-plc-uspsai/Parkway,
   :fibo-fnd-utl-av/commonDesignation #{"PKY" "PKWAY" "PKWY" "PARKWY"
                                        "PARKWAY"},
   :fibo-fnd-utl-av/preferredDesignation "PKWY",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "parkway"})

(def Parkways
  {:db/ident :fibo-fnd-plc-uspsai/Parkways,
   :fibo-fnd-utl-av/commonDesignation #{"PARKWAYS" "PKWYS"},
   :fibo-fnd-utl-av/preferredDesignation "PKWY",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "parkways"})

(def Pass
  {:db/ident :fibo-fnd-plc-uspsai/Pass,
   :fibo-fnd-utl-av/commonDesignation "PASS",
   :fibo-fnd-utl-av/preferredDesignation "PASS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "pass"})

(def Passage
  {:db/ident :fibo-fnd-plc-uspsai/Passage,
   :fibo-fnd-utl-av/commonDesignation "PASSAGE",
   :fibo-fnd-utl-av/preferredDesignation "PSGE",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "passage"})

(def Path
  {:db/ident :fibo-fnd-plc-uspsai/Path,
   :fibo-fnd-utl-av/commonDesignation #{"PATH" "PATHS"},
   :fibo-fnd-utl-av/preferredDesignation "PATH",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "path"})

(def Pike
  {:db/ident :fibo-fnd-plc-uspsai/Pike,
   :fibo-fnd-utl-av/commonDesignation #{"PIKE" "PIKES"},
   :fibo-fnd-utl-av/preferredDesignation "PIKE",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "pike"})

(def Pine
  {:db/ident :fibo-fnd-plc-uspsai/Pine,
   :fibo-fnd-utl-av/commonDesignation "PINE",
   :fibo-fnd-utl-av/preferredDesignation "PNE",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "pine"})

(def Pines
  {:db/ident :fibo-fnd-plc-uspsai/Pines,
   :fibo-fnd-utl-av/commonDesignation #{"PINES" "PNES"},
   :fibo-fnd-utl-av/preferredDesignation "PNES",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "pines"})

(def Place
  {:db/ident :fibo-fnd-plc-uspsai/Place,
   :fibo-fnd-utl-av/commonDesignation "PL",
   :fibo-fnd-utl-av/preferredDesignation "PL",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "place"})

(def Plain
  {:db/ident :fibo-fnd-plc-uspsai/Plain,
   :fibo-fnd-utl-av/commonDesignation #{"PLAIN" "PLN"},
   :fibo-fnd-utl-av/preferredDesignation "PLN",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "plain"})

(def Plains
  {:db/ident :fibo-fnd-plc-uspsai/Plains,
   :fibo-fnd-utl-av/commonDesignation #{"PLNS" "PLAINS"},
   :fibo-fnd-utl-av/preferredDesignation "PLNS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "plains"})

(def Plaza
  {:db/ident :fibo-fnd-plc-uspsai/Plaza,
   :fibo-fnd-utl-av/commonDesignation #{"PLZ" "PLZA" "PLAZA"},
   :fibo-fnd-utl-av/preferredDesignation "PLZ",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "plaza"})

(def Point
  {:db/ident :fibo-fnd-plc-uspsai/Point,
   :fibo-fnd-utl-av/commonDesignation #{"PT" "POINT"},
   :fibo-fnd-utl-av/preferredDesignation "PT",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "point"})

(def Points
  {:db/ident :fibo-fnd-plc-uspsai/Points,
   :fibo-fnd-utl-av/commonDesignation #{"PTS" "POINTS"},
   :fibo-fnd-utl-av/preferredDesignation "PTS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "points"})

(def Port
  {:db/ident :fibo-fnd-plc-uspsai/Port,
   :fibo-fnd-utl-av/commonDesignation #{"PRT" "PORT"},
   :fibo-fnd-utl-av/preferredDesignation "PRT",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "port"})

(def Ports
  {:db/ident :fibo-fnd-plc-uspsai/Ports,
   :fibo-fnd-utl-av/commonDesignation #{"PORTS" "PRTS"},
   :fibo-fnd-utl-av/preferredDesignation "PRTS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "ports"})

(def Prairie
  {:db/ident :fibo-fnd-plc-uspsai/Prairie,
   :fibo-fnd-utl-av/commonDesignation #{"PR" "PRAIRIE" "PRR"},
   :fibo-fnd-utl-av/preferredDesignation "PR",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "prairie"})

(def QC
  {:cmns-cxtdsg/isUsedBy #{:lcc-3166-1/Canada
                           :lcc-3166-1/UnitedStatesOfAmerica},
   :cmns-dsg/denotes :lcc-3166-2-ca/Quebec,
   :cmns-id/identifies :lcc-3166-2-ca/Quebec,
   :db/ident :fibo-fnd-plc-uspsai/QC,
   :fibo-fnd-rel-rel/hasTag "QC",
   :fibo-fnd-utl-av/preferredDesignation "QC",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "QC",
   :skos/definition
   "Canadian and US-specific code for the designation for Quebec"})

(def RI
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/RhodeIsland,
   :cmns-id/identifies :lcc-3166-2-us/RhodeIsland,
   :db/ident :fibo-fnd-plc-uspsai/RI,
   :fibo-fnd-rel-rel/hasTag "RI",
   :fibo-fnd-utl-av/preferredDesignation "RI",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "RI",
   :skos/definition "US-specific code for the designation for Rhode Island"})

(def Radial
  {:db/ident :fibo-fnd-plc-uspsai/Radial,
   :fibo-fnd-utl-av/commonDesignation #{"RADL" "RADIEL" "RAD" "RADIAL"},
   :fibo-fnd-utl-av/preferredDesignation "RADL",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "radial"})

(def Ramp
  {:db/ident :fibo-fnd-plc-uspsai/Ramp,
   :fibo-fnd-utl-av/commonDesignation "RAMP",
   :fibo-fnd-utl-av/preferredDesignation "RAMP",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "ramp"})

(def Ranch
  {:db/ident :fibo-fnd-plc-uspsai/Ranch,
   :fibo-fnd-utl-av/commonDesignation #{"RANCH" "RNCH" "RNCHS" "RANCHES"},
   :fibo-fnd-utl-av/preferredDesignation "RNCH",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "ranch"})

(def Rapid
  {:db/ident :fibo-fnd-plc-uspsai/Rapid,
   :fibo-fnd-utl-av/commonDesignation #{"RPD" "RAPID"},
   :fibo-fnd-utl-av/preferredDesignation "RPD",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "rapid"})

(def Rapids
  {:db/ident :fibo-fnd-plc-uspsai/Rapids,
   :fibo-fnd-utl-av/commonDesignation #{"RAPIDS" "RPDS"},
   :fibo-fnd-utl-av/preferredDesignation "RPDS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "rapids"})

(def Rest
  {:db/ident :fibo-fnd-plc-uspsai/Rest,
   :fibo-fnd-utl-av/commonDesignation #{"REST" "RST"},
   :fibo-fnd-utl-av/preferredDesignation "RST",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "rest"})

(def Ridge
  {:db/ident :fibo-fnd-plc-uspsai/Ridge,
   :fibo-fnd-utl-av/commonDesignation #{"RIDGE" "RDGE" "RDG"},
   :fibo-fnd-utl-av/preferredDesignation "RDG",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "ridge"})

(def Ridges
  {:db/ident :fibo-fnd-plc-uspsai/Ridges,
   :fibo-fnd-utl-av/commonDesignation #{"RIDGES" "RDGS"},
   :fibo-fnd-utl-av/preferredDesignation "RDGS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "ridges"})

(def River
  {:db/ident :fibo-fnd-plc-uspsai/River,
   :fibo-fnd-utl-av/commonDesignation #{"RIV" "RIVER" "RIVR" "RVR"},
   :fibo-fnd-utl-av/preferredDesignation "RIV",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "river"})

(def Road
  {:db/ident :fibo-fnd-plc-uspsai/Road,
   :fibo-fnd-utl-av/commonDesignation #{"RD" "ROAD"},
   :fibo-fnd-utl-av/preferredDesignation "RD",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "road"})

(def Roads
  {:db/ident :fibo-fnd-plc-uspsai/Roads,
   :fibo-fnd-utl-av/commonDesignation #{"RDS" "ROADS"},
   :fibo-fnd-utl-av/preferredDesignation "RDS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "roads"})

(def Route
  {:db/ident :fibo-fnd-plc-uspsai/Route,
   :fibo-fnd-utl-av/commonDesignation "ROUTE",
   :fibo-fnd-utl-av/preferredDesignation "RTE",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "route"})

(def Row
  {:db/ident :fibo-fnd-plc-uspsai/Row,
   :fibo-fnd-utl-av/commonDesignation "ROW",
   :fibo-fnd-utl-av/preferredDesignation "ROW",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "row"})

(def Rue
  {:db/ident :fibo-fnd-plc-uspsai/Rue,
   :fibo-fnd-utl-av/commonDesignation "RUE",
   :fibo-fnd-utl-av/preferredDesignation "RUE",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "rue"})

(def Run
  {:db/ident :fibo-fnd-plc-uspsai/Run,
   :fibo-fnd-utl-av/commonDesignation "RUN",
   :fibo-fnd-utl-av/preferredDesignation "RUN",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "run"})

(def SC
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/SouthCarolina,
   :cmns-id/identifies :lcc-3166-2-us/SouthCarolina,
   :db/ident :fibo-fnd-plc-uspsai/SC,
   :fibo-fnd-rel-rel/hasTag "SC",
   :fibo-fnd-utl-av/preferredDesignation "SC",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "SC",
   :skos/definition "US-specific code for the designation for South Carolina"})

(def SD
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/SouthDakota,
   :cmns-id/identifies :lcc-3166-2-us/SouthDakota,
   :db/ident :fibo-fnd-plc-uspsai/SD,
   :fibo-fnd-rel-rel/hasTag "SD",
   :fibo-fnd-utl-av/preferredDesignation "SD",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "SD",
   :skos/definition "US-specific code for the designation for South Dakota"})

(def SK
  {:cmns-cxtdsg/isUsedBy #{:lcc-3166-1/Canada
                           :lcc-3166-1/UnitedStatesOfAmerica},
   :cmns-dsg/denotes :lcc-3166-2-ca/Saskatchewan,
   :cmns-id/identifies :lcc-3166-2-ca/Saskatchewan,
   :db/ident :fibo-fnd-plc-uspsai/SK,
   :fibo-fnd-rel-rel/hasTag "SK",
   :fibo-fnd-utl-av/preferredDesignation "SK",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "SK",
   :skos/definition
   "Canadian and US-specific code for the designation for Saskatchewan"})

(def Shoal
  {:db/ident :fibo-fnd-plc-uspsai/Shoal,
   :fibo-fnd-utl-av/commonDesignation #{"SHL" "SHOAL"},
   :fibo-fnd-utl-av/preferredDesignation "SHL",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "shoal"})

(def Shoals
  {:db/ident :fibo-fnd-plc-uspsai/Shoals,
   :fibo-fnd-utl-av/commonDesignation #{"SHOALS" "SHLS"},
   :fibo-fnd-utl-av/preferredDesignation "SHLS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "shoals"})

(def Shore
  {:db/ident :fibo-fnd-plc-uspsai/Shore,
   :fibo-fnd-utl-av/commonDesignation #{"SHOAR" "SHR" "SHORE"},
   :fibo-fnd-utl-av/preferredDesignation "SHR",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "shore"})

(def Shores
  {:db/ident :fibo-fnd-plc-uspsai/Shores,
   :fibo-fnd-utl-av/commonDesignation #{"SHORES" "SHRS" "SHOARS"},
   :fibo-fnd-utl-av/preferredDesignation "SHRS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "shores"})

(def Skyway
  {:db/ident :fibo-fnd-plc-uspsai/Skyway,
   :fibo-fnd-utl-av/commonDesignation "SKYWAY",
   :fibo-fnd-utl-av/preferredDesignation "SKWY",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "skyway"})

(def Spring
  {:db/ident :fibo-fnd-plc-uspsai/Spring,
   :fibo-fnd-utl-av/commonDesignation #{"SPNG" "SPRNG" "SPRING" "SPG"},
   :fibo-fnd-utl-av/preferredDesignation "SPG",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "spring"})

(def Springs
  {:db/ident :fibo-fnd-plc-uspsai/Springs,
   :fibo-fnd-utl-av/commonDesignation #{"SPRINGS" "SPGS" "SPRNGS" "SPNGS"},
   :fibo-fnd-utl-av/preferredDesignation "SPGS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "springs"})

(def Spur
  {:db/ident :fibo-fnd-plc-uspsai/Spur,
   :fibo-fnd-utl-av/commonDesignation "SPUR",
   :fibo-fnd-utl-av/preferredDesignation "SPUR",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "spur"})

(def Spurs
  {:db/ident :fibo-fnd-plc-uspsai/Spurs,
   :fibo-fnd-utl-av/commonDesignation "SPURS",
   :fibo-fnd-utl-av/preferredDesignation "SPUR",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "spurs"})

(def Square
  {:db/ident :fibo-fnd-plc-uspsai/Square,
   :fibo-fnd-utl-av/commonDesignation #{"SQR" "SQRE" "SQU" "SQ" "SQUARE"},
   :fibo-fnd-utl-av/preferredDesignation "SQ",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "square"})

(def Squares
  {:db/ident :fibo-fnd-plc-uspsai/Squares,
   :fibo-fnd-utl-av/commonDesignation #{"SQRS" "SQUARES"},
   :fibo-fnd-utl-av/preferredDesignation "SQS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "squares"})

(def Station
  {:db/ident :fibo-fnd-plc-uspsai/Station,
   :fibo-fnd-utl-av/commonDesignation #{"STA" "STN" "STATION" "STATN"},
   :fibo-fnd-utl-av/preferredDesignation "STA",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "station"})

(def Stravenue
  {:db/ident :fibo-fnd-plc-uspsai/Stravenue,
   :fibo-fnd-utl-av/commonDesignation #{"STRVNUE" "STRVN" "STRA" "STRAVENUE"
                                        "STRAV" "STRAVEN" "STRAVN"},
   :fibo-fnd-utl-av/preferredDesignation "STRA",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "stravenue"})

(def Stream
  {:db/ident :fibo-fnd-plc-uspsai/Stream,
   :fibo-fnd-utl-av/commonDesignation #{"STREAM" "STREME" "STRM"},
   :fibo-fnd-utl-av/preferredDesignation "STRM",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "stream"})

(def Street
  {:db/ident :fibo-fnd-plc-uspsai/Street,
   :fibo-fnd-utl-av/commonDesignation #{"STREET" "STR" "STRT" "ST"},
   :fibo-fnd-utl-av/preferredDesignation "ST",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "street"})

(def Streets
  {:db/ident :fibo-fnd-plc-uspsai/Streets,
   :fibo-fnd-utl-av/commonDesignation "STREETS",
   :fibo-fnd-utl-av/preferredDesignation "STS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "streets"})

(def Summit
  {:db/ident :fibo-fnd-plc-uspsai/Summit,
   :fibo-fnd-utl-av/commonDesignation #{"SUMMIT" "SUMITT" "SUMIT" "SMT"},
   :fibo-fnd-utl-av/preferredDesignation "SMT",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "summit"})

(def TN
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Tennessee,
   :cmns-id/identifies :lcc-3166-2-us/Tennessee,
   :db/ident :fibo-fnd-plc-uspsai/TN,
   :fibo-fnd-rel-rel/hasTag "TN",
   :fibo-fnd-utl-av/preferredDesignation "TN",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "TN",
   :skos/definition "US-specific code for the designation for Tennessee"})

(def TX
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Texas,
   :cmns-id/identifies :lcc-3166-2-us/Texas,
   :db/ident :fibo-fnd-plc-uspsai/TX,
   :fibo-fnd-rel-rel/hasTag "TX",
   :fibo-fnd-utl-av/preferredDesignation "TX",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "TX",
   :skos/definition "US-specific code for the designation for Texas"})

(def Terrace
  {:db/ident :fibo-fnd-plc-uspsai/Terrace,
   :fibo-fnd-utl-av/commonDesignation #{"TERR" "TERRACE" "TER"},
   :fibo-fnd-utl-av/preferredDesignation "TER",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "terrace"})

(def Throughway
  {:db/ident :fibo-fnd-plc-uspsai/Throughway,
   :fibo-fnd-utl-av/commonDesignation "THROUGHWAY",
   :fibo-fnd-utl-av/preferredDesignation "TRWY",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "throughway"})

(def Trace
  {:db/ident :fibo-fnd-plc-uspsai/Trace,
   :fibo-fnd-utl-av/commonDesignation #{"TRCE" "TRACE" "TRACES"},
   :fibo-fnd-utl-av/preferredDesignation "TRCE",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "trace"})

(def Track
  {:db/ident :fibo-fnd-plc-uspsai/Track,
   :fibo-fnd-utl-av/commonDesignation #{"TRAK" "TRKS" "TRK" "TRACK" "TRACKS"},
   :fibo-fnd-utl-av/preferredDesignation "TRAK",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "track"})

(def Trafficway
  {:db/ident :fibo-fnd-plc-uspsai/Trafficway,
   :fibo-fnd-utl-av/commonDesignation "TRAFFICWAY",
   :fibo-fnd-utl-av/preferredDesignation "TRFY",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "trafficway"})

(def Trail
  {:db/ident :fibo-fnd-plc-uspsai/Trail,
   :fibo-fnd-utl-av/commonDesignation #{"TRAIL" "TRLS" "TRL" "TRAILS"},
   :fibo-fnd-utl-av/preferredDesignation "TRL",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "trail"})

(def Trailer
  {:db/ident :fibo-fnd-plc-uspsai/Trailer,
   :fibo-fnd-utl-av/commonDesignation #{"TRLRS" "TRLR" "TRAILER"},
   :fibo-fnd-utl-av/preferredDesignation "TRLR",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "trailer"})

(def Tunnel
  {:db/ident :fibo-fnd-plc-uspsai/Tunnel,
   :fibo-fnd-utl-av/commonDesignation #{"TUNNL" "TUNLS" "TUNNELS" "TUNL"
                                        "TUNNEL" "TUNEL"},
   :fibo-fnd-utl-av/preferredDesignation "TUNL",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "tunnel"})

(def Turnpike
  {:db/ident :fibo-fnd-plc-uspsai/Turnpike,
   :fibo-fnd-utl-av/commonDesignation #{"TURNPIKE" "TURNPK" "TRNPK"},
   :fibo-fnd-utl-av/preferredDesignation "TPKE",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "turnpike"})

(def UM
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/UnitedStatesMinorOutlyingIslands,
   :cmns-id/identifies :lcc-3166-2-us/UnitedStatesMinorOutlyingIslands,
   :db/ident :fibo-fnd-plc-uspsai/UM,
   :fibo-fnd-rel-rel/hasTag "UM",
   :fibo-fnd-utl-av/preferredDesignation "UM",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "UM",
   :skos/definition
   "US-specific code for the designation for the United States Minor Outlying Islands"})

(def US-AA
  {:cmns-dsg/denotes :fibo-fnd-plc-uspsai/ArmedForcesAmericas,
   :cmns-id/identifies :fibo-fnd-plc-uspsai/ArmedForcesAmericas,
   :db/ident :fibo-fnd-plc-uspsai/US-AA,
   :fibo-fnd-rel-rel/hasTag "US-AA",
   :fibo-fnd-utl-av/preferredDesignation "AA",
   :rdf/type #{:lcc-cr/GeographicRegionIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "US-AA",
   :skos/definition
   "subdivision code for the state designation for Armed Forces Americas, excluding Canada"})

(def US-AE
  {:cmns-dsg/denotes :fibo-fnd-plc-uspsai/ArmedForcesEurope,
   :cmns-id/identifies :fibo-fnd-plc-uspsai/ArmedForcesEurope,
   :db/ident :fibo-fnd-plc-uspsai/US-AE,
   :fibo-fnd-rel-rel/hasTag "US-AE",
   :fibo-fnd-utl-av/preferredDesignation "AE",
   :rdf/type #{:lcc-cr/GeographicRegionIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "US-AE",
   :skos/definition
   "subdivision code for the state designation for Armed Forces Europe, the Middle East, and Canada"})

(def US-AP
  {:cmns-dsg/denotes :fibo-fnd-plc-uspsai/ArmedForcesPacific,
   :cmns-id/identifies :fibo-fnd-plc-uspsai/ArmedForcesPacific,
   :db/ident :fibo-fnd-plc-uspsai/US-AP,
   :fibo-fnd-rel-rel/hasTag "US-AP",
   :fibo-fnd-utl-av/preferredDesignation "AP",
   :rdf/type #{:lcc-cr/GeographicRegionIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "US-AP",
   :skos/definition
   "subdivision code for the state designation for Armed Forces Pacific"})

(def UT
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Utah,
   :cmns-id/identifies :lcc-3166-2-us/Utah,
   :db/ident :fibo-fnd-plc-uspsai/UT,
   :fibo-fnd-rel-rel/hasTag "UT",
   :fibo-fnd-utl-av/preferredDesignation "UT",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "UT",
   :skos/definition "US-specific code for the designation for Utah"})

(def Underpass
  {:db/ident :fibo-fnd-plc-uspsai/Underpass,
   :fibo-fnd-utl-av/commonDesignation "UNDERPASS",
   :fibo-fnd-utl-av/preferredDesignation "UPAS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "underpass"})

(def Union
  {:db/ident :fibo-fnd-plc-uspsai/Union,
   :fibo-fnd-utl-av/commonDesignation #{"UNION" "UN"},
   :fibo-fnd-utl-av/preferredDesignation "UN",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "union"})

(def Unions
  {:db/ident :fibo-fnd-plc-uspsai/Unions,
   :fibo-fnd-utl-av/commonDesignation "UNIONS",
   :fibo-fnd-utl-av/preferredDesignation "UNS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "unions"})

(def VA
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Virginia,
   :cmns-id/identifies :lcc-3166-2-us/Virginia,
   :db/ident :fibo-fnd-plc-uspsai/VA,
   :fibo-fnd-rel-rel/hasTag "VA",
   :fibo-fnd-utl-av/preferredDesignation "VA",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "VA",
   :skos/definition "US-specific code for the designation for Virginia"})

(def VI
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/VirginIslands,
   :cmns-id/identifies :lcc-3166-2-us/VirginIslands,
   :db/ident :fibo-fnd-plc-uspsai/VI,
   :fibo-fnd-rel-rel/hasTag "VI",
   :fibo-fnd-utl-av/preferredDesignation "VI",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "VI",
   :skos/definition
   "US-specific code for the designation for the U.S. Virgin Islands"})

(def VT
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Vermont,
   :cmns-id/identifies :lcc-3166-2-us/Vermont,
   :db/ident :fibo-fnd-plc-uspsai/VT,
   :fibo-fnd-rel-rel/hasTag "VT",
   :fibo-fnd-utl-av/preferredDesignation "VT",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "VT",
   :skos/definition "US-specific code for the designation for Vermont"})

(def Valley
  {:db/ident :fibo-fnd-plc-uspsai/Valley,
   :fibo-fnd-utl-av/commonDesignation #{"VALLEY" "VLLY" "VLY" "VALLY"},
   :fibo-fnd-utl-av/preferredDesignation "VLY",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "valley"})

(def Valleys
  {:db/ident :fibo-fnd-plc-uspsai/Valleys,
   :fibo-fnd-utl-av/commonDesignation #{"VLYS" "VALLEYS"},
   :fibo-fnd-utl-av/preferredDesignation "VLYS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "valleys"})

(def Viaduct
  {:db/ident :fibo-fnd-plc-uspsai/Viaduct,
   :fibo-fnd-utl-av/commonDesignation #{"VDCT" "VIADUCT" "VIA" "VIADCT"},
   :fibo-fnd-utl-av/preferredDesignation "VIA",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "viaduct"})

(def View
  {:db/ident :fibo-fnd-plc-uspsai/View,
   :fibo-fnd-utl-av/commonDesignation #{"VIEW" "VW"},
   :fibo-fnd-utl-av/preferredDesignation "VW",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "view"})

(def Views
  {:db/ident :fibo-fnd-plc-uspsai/Views,
   :fibo-fnd-utl-av/commonDesignation #{"VIEWS" "VWS"},
   :fibo-fnd-utl-av/preferredDesignation "VWS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "views"})

(def Village
  {:db/ident :fibo-fnd-plc-uspsai/Village,
   :fibo-fnd-utl-av/commonDesignation #{"VILLIAGE" "VILLG" "VILL" "VILLAG"
                                        "VILLAGE" "VLG"},
   :fibo-fnd-utl-av/preferredDesignation "VLG",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "village"})

(def Villages
  {:db/ident :fibo-fnd-plc-uspsai/Villages,
   :fibo-fnd-utl-av/commonDesignation #{"VILLAGES" "VLGS"},
   :fibo-fnd-utl-av/preferredDesignation "VLGS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "villages"})

(def Ville
  {:db/ident :fibo-fnd-plc-uspsai/Ville,
   :fibo-fnd-utl-av/commonDesignation #{"VILLE" "VL"},
   :fibo-fnd-utl-av/preferredDesignation "VL",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "ville"})

(def Vista
  {:db/ident :fibo-fnd-plc-uspsai/Vista,
   :fibo-fnd-utl-av/commonDesignation #{"VST" "VSTA" "VIST" "VIS" "VISTA"},
   :fibo-fnd-utl-av/preferredDesignation "VIS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "vista"})

(def WA
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Washington,
   :cmns-id/identifies :lcc-3166-2-us/Washington,
   :db/ident :fibo-fnd-plc-uspsai/WA,
   :fibo-fnd-rel-rel/hasTag "WA",
   :fibo-fnd-utl-av/preferredDesignation "WA",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "WA",
   :skos/definition "US-specific code for the designation for Washington"})

(def WI
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Wisconsin,
   :cmns-id/identifies :lcc-3166-2-us/Wisconsin,
   :db/ident :fibo-fnd-plc-uspsai/WI,
   :fibo-fnd-rel-rel/hasTag "WI",
   :fibo-fnd-utl-av/preferredDesignation "WI",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "WI",
   :skos/definition "US-specific code for the designation for Wisconsin"})

(def WV
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/WestVirginia,
   :cmns-id/identifies :lcc-3166-2-us/WestVirginia,
   :db/ident :fibo-fnd-plc-uspsai/WV,
   :fibo-fnd-rel-rel/hasTag "WV",
   :fibo-fnd-utl-av/preferredDesignation "WV",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "WV",
   :skos/definition "US-specific code for the designation for West Virginia"})

(def WY
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :cmns-dsg/denotes :lcc-3166-2-us/Wyoming,
   :cmns-id/identifies :lcc-3166-2-us/Wyoming,
   :db/ident :fibo-fnd-plc-uspsai/WY,
   :fibo-fnd-rel-rel/hasTag "WY",
   :fibo-fnd-utl-av/preferredDesignation "WY",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "WY",
   :skos/definition "US-specific code for the designation for Wyoming"})

(def Walk
  {:db/ident :fibo-fnd-plc-uspsai/Walk,
   :fibo-fnd-utl-av/commonDesignation "WALK",
   :fibo-fnd-utl-av/preferredDesignation "WALK",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "walk"})

(def Walks
  {:db/ident :fibo-fnd-plc-uspsai/Walks,
   :fibo-fnd-utl-av/commonDesignation "WALKS",
   :fibo-fnd-utl-av/preferredDesignation "WALK",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "walks"})

(def Wall
  {:db/ident :fibo-fnd-plc-uspsai/Wall,
   :fibo-fnd-utl-av/commonDesignation "WALL",
   :fibo-fnd-utl-av/preferredDesignation "WALL",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "wall"})

(def Way
  {:db/ident :fibo-fnd-plc-uspsai/Way,
   :fibo-fnd-utl-av/commonDesignation #{"WAY" "WY"},
   :fibo-fnd-utl-av/preferredDesignation "WAY",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "way"})

(def Ways
  {:db/ident :fibo-fnd-plc-uspsai/Ways,
   :fibo-fnd-utl-av/commonDesignation "WAYS",
   :fibo-fnd-utl-av/preferredDesignation "WAYS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "ways"})

(def Well
  {:db/ident :fibo-fnd-plc-uspsai/Well,
   :fibo-fnd-utl-av/commonDesignation "WELL",
   :fibo-fnd-utl-av/preferredDesignation "WL",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "well"})

(def Wells
  {:db/ident :fibo-fnd-plc-uspsai/Wells,
   :fibo-fnd-utl-av/commonDesignation #{"WLS" "WELLS"},
   :fibo-fnd-utl-av/preferredDesignation "WLS",
   :rdf/type #{:fibo-fnd-plc-adr/StreetSuffix :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "wells"})

(def YT
  {:cmns-cxtdsg/isUsedBy #{:lcc-3166-1/Canada
                           :lcc-3166-1/UnitedStatesOfAmerica},
   :cmns-dsg/denotes :lcc-3166-2-ca/Yukon,
   :cmns-id/identifies :lcc-3166-2-ca/Yukon,
   :db/ident :fibo-fnd-plc-uspsai/YT,
   :fibo-fnd-rel-rel/hasTag "YT",
   :fibo-fnd-utl-av/preferredDesignation "YT",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-plc-adr/RegionSpecificIdentifier},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdfs/label "YT",
   :skos/definition
   "Canadian and US-specific code for the designation for Yukon"})

(def urn:uuid:fe2c9119-0795-5735-8aff-9f499c178485
  {:cmns-av/copyright #{"Copyright (c) 2019-2023 Object Management Group, Inc."
                        "Copyright (c) 2019-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology augments the U.S. Postal Service Address ontology with individuals for various street suffixes, military and U.S. Department of State specific individuals, and preferred designations for state and territory codes.",
   :dcterms/contributor "Thematix Partners LLC",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Addresses/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/NorthAmerica/USPostalServiceAddresses/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CA/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-US/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "U.S. Postal Service Addresses Individuals Ontology",
   :rdfs/seeAlso #{{:xsd/anyURI "https://about.usps.com/who/profile/"}
                   {:xsd/anyURI
                    "https://pe.usps.com/cpim/ftp/pubs/Pub28/pub28.pdf"}},
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals.rdf version of this ontology was revised to update a dead link."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/"})