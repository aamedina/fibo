(ns net.wikipunk.rdf.lcc-m49
  {:dcterms/issued #inst "2021-11-07T23:48:51.124-00:00",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :namespaces
   {"dcterms" "http://purl.org/dc/terms/",
    "lcc-3166-1"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "lcc-lr" "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
    "lcc-m49" "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/20211101/Countries/UN-M49-RegionCodes/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "lcc-m49",
   :rdfa/uri "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/",
   :rdfs/label
   "United Nations Standard Country or Area Codes for Statistical Use (M49 Geographic Region Codes) Ontology",
   :rdfs/seeAlso #{{:xsd/anyURI
                    "https://www.omg.org/spec/LCC/Countries/AboutCountries/"}
                   {:xsd/anyURI "https://www.omg.org/spec/LCC/AboutLCC/"}},
   :skos/changeNote
   #{"The https://www.omg.org/spec/LCC/20211101/Countries/UN-M49-RegionCodes/ version of this ontology has been revised to reflect changed URI for North Macedonia (code MK) made by the LCC 1.2 RTF."
     "The https://www.omg.org/spec/LCC/20190201/Countries/UN-M49-RegionCodes/ version of this ontology has been revised to reflect the issues addressed by the LCC 1.1 RTF report.  The country codes and related metadata contained herein are current as of the February 2019 revision to the online code set."},
   :sm/contentLanguage {:xsd/anyURI
                        "https://www.w3.org/TR/owl2-quick-reference/"},
   :sm/copyright #{"Copyright (c) 2015-2020 Adaptive Inc."
                   "Copyright (c) 2021 agnos.ai UK Ltd."
                   "Copyright (c) 2015-2021 Object Management Group, Inc."
                   "Copyright (c) 2015-2017 Unisys"
                   "Copyright (c) 2015-2021 Thematix Partners LLC"},
   :sm/dependsOn
   #{{:xsd/anyURI
      "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}},
   :sm/fileAbbreviation "lcc-m49",
   :sm/fileAbstract
   "This ontology represents the United Nations publication 'Standard Country or Area Codes for Statistical Use' originally published as Series M, No. 49 and now commonly referred to as the M49 standard. The assignment of countries or areas to specific groupings is for statistical convenience and does not imply any assumption regarding political or other affiliation of countries or territories by the United Nations. The codes included herein are current as of the version IRI for this ontology.",
   :sm/filename "UN-M49-RegionCodes.rdf",
   :xsd/anyURI "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/"})

(def Africa
  {:db/ident :lcc-m49/Africa,
   :lcc-cr/hasEnglishShortName "Africa",
   :lcc-cr/hasNumericRegionCode "002",
   :lcc-cr/isClassifiedBy :lcc-m49/Continent,
   :lcc-cr/isSubregionOf :lcc-m49/World,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/GeographicRegion},
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/"},
   :rdfs/label "Africa",
   :skos/definition "individual representing the continent Africa"})

(def Americas
  {:db/ident :lcc-m49/Americas,
   :lcc-cr/hasEnglishShortName "Americas",
   :lcc-cr/hasNumericRegionCode "019",
   :lcc-cr/isClassifiedBy :lcc-m49/Continent,
   :lcc-cr/isSubregionOf :lcc-m49/World,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/GeographicRegion},
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/"},
   :rdfs/label "Americas",
   :skos/definition "individual representing the continent Americas"})

(def Asia
  {:db/ident :lcc-m49/Asia,
   :lcc-cr/hasEnglishShortName "Asia",
   :lcc-cr/hasNumericRegionCode "142",
   :lcc-cr/isClassifiedBy :lcc-m49/Continent,
   :lcc-cr/isSubregionOf :lcc-m49/World,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/GeographicRegion},
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/"},
   :rdfs/label "Asia",
   :skos/definition "individual representing the continent Asia"})

(def AustraliaAndNewZealand
  {:db/ident :lcc-m49/AustraliaAndNewZealand,
   :lcc-cr/hasEnglishShortName "Australia and New Zealand",
   :lcc-cr/hasNumericRegionCode "053",
   :lcc-cr/isClassifiedBy :lcc-m49/Region,
   :lcc-cr/isSubregionOf :lcc-m49/Oceania,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/GeographicRegion},
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/"},
   :rdfs/label "Australia and New Zealand",
   :skos/definition
   "individual representing the region Australia and New Zealand"})

(def Caribbean
  {:db/ident :lcc-m49/Caribbean,
   :lcc-cr/hasEnglishShortName "Caribbean",
   :lcc-cr/hasNumericRegionCode "029",
   :lcc-cr/isClassifiedBy :lcc-m49/Subregion,
   :lcc-cr/isSubregionOf :lcc-m49/LatinAmericaAndTheCaribbean,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/GeographicRegion},
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/"},
   :rdfs/label "Caribbean",
   :skos/definition "individual representing the subregion Caribbean"})

(def CentralAmerica
  {:db/ident :lcc-m49/CentralAmerica,
   :lcc-cr/hasEnglishShortName "Central America",
   :lcc-cr/hasNumericRegionCode "013",
   :lcc-cr/isClassifiedBy :lcc-m49/Subregion,
   :lcc-cr/isSubregionOf :lcc-m49/LatinAmericaAndTheCaribbean,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/GeographicRegion},
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/"},
   :rdfs/label "Central America",
   :skos/definition "individual representing the subregion Central America"})

(def CentralAsia
  {:db/ident :lcc-m49/CentralAsia,
   :lcc-cr/hasEnglishShortName "Central Asia",
   :lcc-cr/hasNumericRegionCode "143",
   :lcc-cr/isClassifiedBy :lcc-m49/Region,
   :lcc-cr/isSubregionOf :lcc-m49/Asia,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/GeographicRegion},
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/"},
   :rdfs/label "Central Asia",
   :skos/definition "individual representing the region Central Asia"})

(def ChannelIslands
  {:db/ident :lcc-m49/ChannelIslands,
   :lcc-cr/hasEnglishShortName "Channel Islands",
   :lcc-cr/hasNumericRegionCode "830",
   :lcc-cr/isClassifiedBy :lcc-m49/Subregion,
   :lcc-cr/isSubregionOf :lcc-m49/NorthernEurope,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/GeographicRegion},
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/"},
   :rdfs/label "Channel Islands",
   :skos/definition "individual representing the subregion Channel Islands"})

(def Continent
  {:db/ident :lcc-m49/Continent,
   :rdf/type #{:lcc-cr/GeographicRegionKind :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/"},
   :rdfs/label "continent",
   :skos/definition "the kind of region that is a continent"})

(def EasternAfrica
  {:db/ident :lcc-m49/EasternAfrica,
   :lcc-cr/hasEnglishShortName "Eastern Africa",
   :lcc-cr/hasNumericRegionCode "014",
   :lcc-cr/isClassifiedBy :lcc-m49/Subregion,
   :lcc-cr/isSubregionOf :lcc-m49/Sub-SaharanAfrica,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/GeographicRegion},
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/"},
   :rdfs/label "Eastern Africa",
   :skos/definition "individual representing the subregion Eastern Africa"})

(def EasternAsia
  {:db/ident :lcc-m49/EasternAsia,
   :lcc-cr/hasEnglishShortName "Eastern Asia",
   :lcc-cr/hasNumericRegionCode "030",
   :lcc-cr/isClassifiedBy :lcc-m49/Region,
   :lcc-cr/isSubregionOf :lcc-m49/Asia,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/GeographicRegion},
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/"},
   :rdfs/label "Eastern Asia",
   :skos/definition "individual representing the region Eastern Asia"})

(def EasternEurope
  {:db/ident :lcc-m49/EasternEurope,
   :lcc-cr/hasEnglishShortName "Eastern Europe",
   :lcc-cr/hasNumericRegionCode "151",
   :lcc-cr/isClassifiedBy :lcc-m49/Region,
   :lcc-cr/isSubregionOf :lcc-m49/Europe,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/GeographicRegion},
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/"},
   :rdfs/label "Eastern Europe",
   :skos/definition "individual representing the region Eastern Europe"})

(def Europe
  {:db/ident :lcc-m49/Europe,
   :lcc-cr/hasEnglishShortName "Europe",
   :lcc-cr/hasNumericRegionCode "150",
   :lcc-cr/isClassifiedBy :lcc-m49/Continent,
   :lcc-cr/isSubregionOf :lcc-m49/World,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/GeographicRegion},
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/"},
   :rdfs/label "Europe",
   :skos/definition "individual representing the continent Europe"})

(def LatinAmericaAndTheCaribbean
  {:db/ident :lcc-m49/LatinAmericaAndTheCaribbean,
   :lcc-cr/hasEnglishShortName "Latin America and the Caribbean",
   :lcc-cr/hasNumericRegionCode "419",
   :lcc-cr/isClassifiedBy :lcc-m49/Region,
   :lcc-cr/isSubregionOf :lcc-m49/Americas,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/GeographicRegion},
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/"},
   :rdfs/label "Latin America and the Caribbean",
   :skos/definition
   "individual representing the region Latin America and the Caribbean"})

(def Melanesia
  {:db/ident :lcc-m49/Melanesia,
   :lcc-cr/hasEnglishShortName "Melanesia",
   :lcc-cr/hasNumericRegionCode "054",
   :lcc-cr/isClassifiedBy :lcc-m49/Region,
   :lcc-cr/isSubregionOf :lcc-m49/Oceania,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/GeographicRegion},
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/"},
   :rdfs/label "Melanesia",
   :skos/definition "individual representing the region Melanesia"})

(def Micronesia
  {:db/ident :lcc-m49/Micronesia,
   :lcc-cr/hasEnglishShortName "Micronesia",
   :lcc-cr/hasNumericRegionCode "057",
   :lcc-cr/isClassifiedBy :lcc-m49/Region,
   :lcc-cr/isSubregionOf :lcc-m49/Oceania,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/GeographicRegion},
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/"},
   :rdfs/label "Micronesia",
   :skos/definition "individual representing the region Micronesia"})

(def MiddleAfrica
  {:db/ident :lcc-m49/MiddleAfrica,
   :lcc-cr/hasEnglishShortName "Middle Africa",
   :lcc-cr/hasNumericRegionCode "017",
   :lcc-cr/isClassifiedBy :lcc-m49/Subregion,
   :lcc-cr/isSubregionOf :lcc-m49/Sub-SaharanAfrica,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/GeographicRegion},
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/"},
   :rdfs/label "Middle Africa",
   :skos/definition "individual representing the subregion Middle Africa"})

(def NorthernAfrica
  {:db/ident :lcc-m49/NorthernAfrica,
   :lcc-cr/hasEnglishShortName "Northern Africa",
   :lcc-cr/hasNumericRegionCode "015",
   :lcc-cr/isClassifiedBy :lcc-m49/Region,
   :lcc-cr/isSubregionOf :lcc-m49/Africa,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/GeographicRegion},
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/"},
   :rdfs/label "Northern Africa",
   :skos/definition "individual representing the region Northern Africa"})

(def NorthernAmerica
  {:db/ident :lcc-m49/NorthernAmerica,
   :lcc-cr/hasEnglishShortName "Northern America",
   :lcc-cr/hasNumericRegionCode "021",
   :lcc-cr/isClassifiedBy :lcc-m49/Region,
   :lcc-cr/isSubregionOf :lcc-m49/Americas,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/GeographicRegion},
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/"},
   :rdfs/label "Northern America",
   :skos/definition "individual representing the region Northern America"})

(def NorthernEurope
  {:db/ident :lcc-m49/NorthernEurope,
   :lcc-cr/hasEnglishShortName "Northern Europe",
   :lcc-cr/hasNumericRegionCode "154",
   :lcc-cr/isClassifiedBy :lcc-m49/Region,
   :lcc-cr/isSubregionOf :lcc-m49/Europe,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/GeographicRegion},
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/"},
   :rdfs/label "Northern Europe",
   :skos/definition "individual representing the region Northern Europe"})

(def Oceania
  {:db/ident :lcc-m49/Oceania,
   :lcc-cr/hasEnglishShortName "Oceania",
   :lcc-cr/hasNumericRegionCode "009",
   :lcc-cr/isClassifiedBy :lcc-m49/Continent,
   :lcc-cr/isSubregionOf :lcc-m49/World,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/GeographicRegion},
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/"},
   :rdfs/label "Oceania",
   :skos/definition "individual representing the continent Oceania"})

(def Planet
  {:db/ident :lcc-m49/Planet,
   :rdf/type #{:lcc-cr/GeographicRegionKind :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/"},
   :rdfs/label "planet",
   :skos/definition "the kind of region that is a planet"})

(def Polynesia
  {:db/ident :lcc-m49/Polynesia,
   :lcc-cr/hasEnglishShortName "Polynesia",
   :lcc-cr/hasNumericRegionCode "061",
   :lcc-cr/isClassifiedBy :lcc-m49/Region,
   :lcc-cr/isSubregionOf :lcc-m49/Oceania,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/GeographicRegion},
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/"},
   :rdfs/label "Polynesia",
   :skos/definition "individual representing the region Polynesia"})

(def Region
  {:db/ident :lcc-m49/Region,
   :rdf/type #{:lcc-cr/GeographicRegionKind :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/"},
   :rdfs/label "region",
   :skos/definition "the kind of region that is a region within a continent"})

(def South-easternAsia
  {:db/ident :lcc-m49/South-easternAsia,
   :lcc-cr/hasEnglishShortName "South-eastern Asia",
   :lcc-cr/hasNumericRegionCode "035",
   :lcc-cr/isClassifiedBy :lcc-m49/Region,
   :lcc-cr/isSubregionOf :lcc-m49/Asia,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/GeographicRegion},
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/"},
   :rdfs/label "South-eastern Asia",
   :skos/definition "individual representing the region South-eastern Asia"})

(def SouthAmerica
  {:db/ident :lcc-m49/SouthAmerica,
   :lcc-cr/hasEnglishShortName "South America",
   :lcc-cr/hasNumericRegionCode "005",
   :lcc-cr/isClassifiedBy :lcc-m49/Subregion,
   :lcc-cr/isSubregionOf :lcc-m49/LatinAmericaAndTheCaribbean,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/GeographicRegion},
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/"},
   :rdfs/label "South America",
   :skos/definition "individual representing the subregion South America"})

(def SouthernAfrica
  {:db/ident :lcc-m49/SouthernAfrica,
   :lcc-cr/hasEnglishShortName "Southern Africa",
   :lcc-cr/hasNumericRegionCode "018",
   :lcc-cr/isClassifiedBy :lcc-m49/Subregion,
   :lcc-cr/isSubregionOf :lcc-m49/Sub-SaharanAfrica,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/GeographicRegion},
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/"},
   :rdfs/label "Southern Africa",
   :skos/definition "individual representing the subregion Southern Africa"})

(def SouthernAsia
  {:db/ident :lcc-m49/SouthernAsia,
   :lcc-cr/hasEnglishShortName "Southern Asia",
   :lcc-cr/hasNumericRegionCode "034",
   :lcc-cr/isClassifiedBy :lcc-m49/Region,
   :lcc-cr/isSubregionOf :lcc-m49/Asia,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/GeographicRegion},
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/"},
   :rdfs/label "Southern Asia",
   :skos/definition "individual representing the region Southern Asia"})

(def SouthernEurope
  {:db/ident :lcc-m49/SouthernEurope,
   :lcc-cr/hasEnglishShortName "Southern Europe",
   :lcc-cr/hasNumericRegionCode "039",
   :lcc-cr/isClassifiedBy :lcc-m49/Region,
   :lcc-cr/isSubregionOf :lcc-m49/Europe,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/GeographicRegion},
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/"},
   :rdfs/label "Southern Europe",
   :skos/definition "individual representing the region Southern Europe"})

(def Sub-SaharanAfrica
  {:db/ident :lcc-m49/Sub-SaharanAfrica,
   :lcc-cr/hasEnglishShortName "Sub-Saharan Africa",
   :lcc-cr/hasNumericRegionCode "202",
   :lcc-cr/isClassifiedBy :lcc-m49/Region,
   :lcc-cr/isSubregionOf :lcc-m49/Africa,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/GeographicRegion},
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/"},
   :rdfs/label "Sub-Saharan Africa",
   :skos/definition "individual representing the region Sub-Saharan Africa"})

(def Subregion
  {:db/ident :lcc-m49/Subregion,
   :rdf/type #{:lcc-cr/GeographicRegionKind :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/"},
   :rdfs/label "subregion",
   :skos/definition "the kind of region that is a subregion"})

(def WesternAfrica
  {:db/ident :lcc-m49/WesternAfrica,
   :lcc-cr/hasEnglishShortName "Western Africa",
   :lcc-cr/hasNumericRegionCode "011",
   :lcc-cr/isClassifiedBy :lcc-m49/Subregion,
   :lcc-cr/isSubregionOf :lcc-m49/Sub-SaharanAfrica,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/GeographicRegion},
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/"},
   :rdfs/label "Western Africa",
   :skos/definition "individual representing the subregion Western Africa"})

(def WesternAsia
  {:db/ident :lcc-m49/WesternAsia,
   :lcc-cr/hasEnglishShortName "Western Asia",
   :lcc-cr/hasNumericRegionCode "145",
   :lcc-cr/isClassifiedBy :lcc-m49/Region,
   :lcc-cr/isSubregionOf :lcc-m49/Asia,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/GeographicRegion},
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/"},
   :rdfs/label "Western Asia",
   :skos/definition "individual representing the region Western Asia"})

(def WesternEurope
  {:db/ident :lcc-m49/WesternEurope,
   :lcc-cr/hasEnglishShortName "Western Europe",
   :lcc-cr/hasNumericRegionCode "155",
   :lcc-cr/isClassifiedBy :lcc-m49/Region,
   :lcc-cr/isSubregionOf :lcc-m49/Europe,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/GeographicRegion},
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/"},
   :rdfs/label "Western Europe",
   :skos/definition "individual representing the region Western Europe"})

(def World
  {:db/ident :lcc-m49/World,
   :lcc-cr/hasEnglishShortName "",
   :lcc-cr/hasNumericRegionCode "001",
   :lcc-cr/isClassifiedBy :lcc-m49/Planet,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/GeographicRegion},
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/"},
   :rdfs/label "World",
   :skos/definition "individual representing the planet World"})

(def urn:uuid:e6cc924f-ca57-5817-9384-89ec6831abaf
  {:dcterms/issued #inst "2021-11-07T23:48:51.124-00:00",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :owl/imports
   #{{:xsd/anyURI
      "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/20211101/Countries/UN-M49-RegionCodes/"},
   :rdf/type :owl/Ontology,
   :rdfs/label
   "United Nations Standard Country or Area Codes for Statistical Use (M49 Geographic Region Codes) Ontology",
   :rdfs/seeAlso #{{:xsd/anyURI
                    "https://www.omg.org/spec/LCC/Countries/AboutCountries/"}
                   {:xsd/anyURI "https://www.omg.org/spec/LCC/AboutLCC/"}},
   :skos/changeNote
   #{"The https://www.omg.org/spec/LCC/20211101/Countries/UN-M49-RegionCodes/ version of this ontology has been revised to reflect changed URI for North Macedonia (code MK) made by the LCC 1.2 RTF."
     "The https://www.omg.org/spec/LCC/20190201/Countries/UN-M49-RegionCodes/ version of this ontology has been revised to reflect the issues addressed by the LCC 1.1 RTF report.  The country codes and related metadata contained herein are current as of the February 2019 revision to the online code set."},
   :sm/contentLanguage {:xsd/anyURI
                        "https://www.w3.org/TR/owl2-quick-reference/"},
   :sm/copyright #{"Copyright (c) 2015-2020 Adaptive Inc."
                   "Copyright (c) 2021 agnos.ai UK Ltd."
                   "Copyright (c) 2015-2021 Object Management Group, Inc."
                   "Copyright (c) 2015-2017 Unisys"
                   "Copyright (c) 2015-2021 Thematix Partners LLC"},
   :sm/dependsOn
   #{{:xsd/anyURI
      "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}},
   :sm/fileAbbreviation "lcc-m49",
   :sm/fileAbstract
   "This ontology represents the United Nations publication 'Standard Country or Area Codes for Statistical Use' originally published as Series M, No. 49 and now commonly referred to as the M49 standard. The assignment of countries or areas to specific groupings is for statistical convenience and does not imply any assumption regarding political or other affiliation of countries or territories by the United Nations. The codes included herein are current as of the version IRI for this ontology.",
   :sm/filename "UN-M49-RegionCodes.rdf",
   :xsd/anyURI "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/"})