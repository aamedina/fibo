(ns net.wikipunk.rdf.fibo-fnd-plc-loc
  ^{:base "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Locations/",
    :namespaces
    {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
     "dcterms" "http://purl.org/dc/terms/",
     "fibo-fnd-plc-loc"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Locations/",
     "fibo-fnd-utl-av"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
     "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
     "owl" "http://www.w3.org/2002/07/owl#",
     "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
     "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
     "skos" "http://www.w3.org/2004/02/skos/core#",
     "xsd" "http://www.w3.org/2001/XMLSchema#"},
    :prefix "fibo-fnd-plc-loc",
    :source "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Locations/"}
  {:cmns-av/copyright #{"Copyright (c) 2013-2023 Object Management Group, Inc."
                        "Copyright (c) 2013-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology provides a very high level definition of geographic region and geopolitical entity related concepts, including, but not limited to, countries, sub-country regions such as states and provinces, municipalities, etc., extending the Object Management Group (OMG)'s Languages, Countries, and Codes (LCC) ontologies as needed in FIBO. As such, these terms are automatically mapped to the LCC controlled vocabulary representing ISO 3166 country and country subdivision codes, and may be mapped to other de facto standards such as Geonames and the CIA World Factbook. The concept of a business center, defined herein, maps directly to the FpML concept with the same name, and to the set of business centers and broader municipalities included in ISO 10383, Codes for exchanges and market identification (MIC).",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Locations/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Locations Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FND/Places/Locations.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://www.omg.org/spec/EDMC-FIBO/FND/20180801/Places/Locations.rdf version of this ontology was modified eliminate deprecated elements."
     "The https://www.omg.org/spec/EDMC-FIBO/FND/20190901/Places/Locations.rdf version of this ontology was modified to revise definitions to improve them and make them ISO 704 compliant, and merge the concepts that were previously in the countries ontology into this one."
     "The https://www.omg.org/spec/EDMC-FIBO/FND/20200301/Places/Locations.rdf version of this ontology was modified to address hygiene issues with respect to text formatting."
     "The http://www.omg.org/spec/EDMC-FIBO/FND/20130801/Places/Locations.rdf version of this ontology was modified per the issue resolutions identified in the FIBO FND 1.0 FTF report and in http://www.omg.org/spec/EDMC-FIBO/FND/1.0/AboutFND-1.0/."
     "The http://www.omg.org/spec/EDMC-FIBO/FND/20141101/Places/Locations.rdf version of this ontology was modified for the FIBO 2.0 RFC to integrate it with LCC."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Locations/"})

(def BusinessCenter
  {:cmns-av/adaptedFrom
   {:rdf/value
    "FpML Business Center and related codes, see http://www.fpml.org/coding-scheme/business-center-7-14.xml"},
   :db/ident :fibo-fnd-plc-loc/BusinessCenter,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Locations/"},
   :rdfs/label "business center",
   :rdfs/subClassOf :fibo-fnd-plc-loc/Municipality,
   :skos/definition
   "municipality where business is conducted, especially one that is considered a financial center"})

(def County
  {:db/ident :fibo-fnd-plc-loc/County,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Locations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "county"},
   :rdfs/subClassOf :lcc-cr/CountrySubdivision,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "political and administrative division of a country, state or province, providing certain local governmental services"}})

(def FederalCapitalArea
  {:db/ident :fibo-fnd-plc-loc/FederalCapitalArea,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Locations/"},
   :rdfs/label "federal capital area",
   :rdfs/subClassOf :lcc-cr/GeopoliticalEntity,
   :skos/definition
   "geopolitical entity that is or includes the municipality or capital city that acts as the seat of the federal government",
   :skos/scopeNote
   "This model includes representation of the capital administrative region of those federations for which the capital is situated other than within one of the states or provinces which make up the country as a whole. This is so that addresses and other references which may need to refer to any location within the country may do so. Examples include the District of Columbia in the US, and the Canberra area in Australia. Not all federations have such an area."})

(def FederalState
  {:cmns-av/explanatoryNote
   "This type of entity, variously referred to as a state, province or canton, has a level of self government including its own legal system and court jurisdiction, but cedes a level of autonomy to the federation of which it forms a part.",
   :db/ident :fibo-fnd-plc-loc/FederalState,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Locations/"},
   :rdfs/label "federal state",
   :rdfs/subClassOf :lcc-cr/CountrySubdivision,
   :skos/definition
   "self-governing geopolitical unit which forms part of a wider geopolitical unit that is recognized as a country"})

(def Municipality
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "http://en.wikipedia.org/wiki/Municipality"},
   :cmns-av/explanatoryNote
   "A municipality is a general-purpose administrative subdivision, as opposed to a special-purpose district.",
   :db/ident :fibo-fnd-plc-loc/Municipality,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Locations/"},
   :rdfs/label "municipality",
   :rdfs/subClassOf :lcc-cr/GeopoliticalEntity,
   :skos/definition
   "urban administrative division having corporate status and usually powers of self-government or jurisdiction",
   :skos/example
   "A municipality can be any political jurisdiction from a sovereign state, such as the Principality of Monaco, or a small village, such as West Hampton Dunes, New York.",
   :skos/scopeNote
   "The territory over which a municipality has jurisdiction may encompass:\n- only one populated place such as a city, town, or village\n- several of such places (e.g., early jurisdictions in the state of New Jersey (1798-1899) as townships governing several villages, Municipalities of Mexico)\n- only parts of such places, sometimes boroughs of a city such as the 34 municipalities of Santiago, Chile."})

(def Parcel
  {:cmns-av/explanatoryNote
   "A parcel is a defined piece of real estate, usually resulting from the division of a large area of land.",
   :db/ident :fibo-fnd-plc-loc/Parcel,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Locations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "parcel"},
   :rdfs/subClassOf :lcc-cr/GeographicRegion,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "tract or plot of land"}})

(def PhysicalLocation
  {:db/ident :fibo-fnd-plc-loc/PhysicalLocation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Locations/"},
   :rdfs/label "physical location",
   :rdfs/subClassOf :lcc-cr/Location,
   :skos/definition "location in physical space"})

(def PopulatedPlace
  {:db/ident :fibo-fnd-plc-loc/PopulatedPlace,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Locations/"},
   :rdfs/label "populated place",
   :rdfs/subClassOf :fibo-fnd-plc-loc/PhysicalLocation,
   :skos/definition
   "community in which people live or have lived, without being specific as to size, population or importance"})

(def RealEstate
  {:cmns-av/explanatoryNote
   "Although media often refers to the \"real estate market\" from the perspective of residential living, real estate can be grouped into three broad categories based on its use, namely residential, commercial and industrial. Examples of real estate include undeveloped land, houses, condominiums, townhomes, office buildings, retail store buildings and factories.",
   :db/ident :fibo-fnd-plc-loc/RealEstate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Locations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "real estate"},
   :rdfs/subClassOf :fibo-fnd-plc-loc/PhysicalLocation,
   :skos/definition
   "tract or plot of land including any fixed structures on it, as well as the natural resources of the land including uncultivated flora and fauna, farmed crops and livestock, water, and any additional mineral deposits"})

(def hasBusinessCenter
  {:db/ident :fibo-fnd-plc-loc/hasBusinessCenter,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Locations/"},
   :rdfs/label "has business center",
   :rdfs/range :fibo-fnd-plc-loc/BusinessCenter,
   :rdfs/subPropertyOf :fibo-fnd-plc-loc/hasMunicipality,
   :skos/definition
   "identifies a location where business is conducted, and hence the business calendar used to adjust dates"})

(def hasCityName
  {:cmns-av/adaptedFrom
   #{{:xsd/anyURI "https://en.wikipedia.org/wiki/City"}
     {:xsd/anyURI
      "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"}},
   :cmns-av/explanatoryNote
   "Typical working definitions for small-city populations start at around 100,000 people. Common population definitions for an urban area (city or town) range between 1,500 and 50,000 people, with most U.S states using a minimum between 1,500 and 5,000 inhabitants. Some jurisdictions set no such minima.",
   :cmns-av/usageNote
   "This property should be used in cases where a formal individual for the business center or municipality is not available. Note that Geonames could be used as a source in addition to FIBO, however, in cases where an individual is desired. Use the property fibo-fnd-plc-loc;hasMunicipality in cases where an individual is available. Also note that with respect to an address, this property may stand in for any village, town, or city of any size.",
   :db/ident :fibo-fnd-plc-loc/hasCityName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Locations/"},
   :rdfs/label "has city",
   :skos/definition
   "indicates the name of a large, permanent, and densely settled place"})

(def hasCountry
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"},
   :db/ident :fibo-fnd-plc-loc/hasCountry,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Locations/"},
   :rdfs/label "has country",
   :rdfs/range :lcc-cr/Country,
   :rdfs/subPropertyOf :fibo-fnd-plc-loc/hasRegion,
   :skos/definition "identifies a country"})

(def hasCounty
  {:db/ident :fibo-fnd-plc-loc/hasCounty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Locations/"},
   :rdfs/label "has county",
   :rdfs/range :fibo-fnd-plc-loc/County,
   :rdfs/subPropertyOf :fibo-fnd-plc-loc/hasSubdivision,
   :skos/definition
   "indicates a country subdivision providing certain local governmental services"})

(def hasCoverageArea
  {:db/ident :fibo-fnd-plc-loc/hasCoverageArea,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Locations/"},
   :rdfs/label "has coverage area",
   :rdfs/range :lcc-cr/GeographicRegion,
   :rdfs/subPropertyOf :fibo-fnd-plc-loc/hasRegion,
   :skos/definition
   "indicates a geographic region in which some service is provided, or to which some policy applies, or in which something is available"})

(def hasMunicipality
  {:cmns-av/usageNote
   "Note that certain greater metropolitan areas span multiple counties or states (e.g., the greater Washington, D.C. area, which includes parts of Maryland and Virginia, and divided/disputed cities such as Jerusalem), thus hasMunicipality is a subproperty of hasRegion rather than hasSubdivision.",
   :db/ident :fibo-fnd-plc-loc/hasMunicipality,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Locations/"},
   :rdfs/label "has municipality",
   :rdfs/range :fibo-fnd-plc-loc/Municipality,
   :rdfs/subPropertyOf :fibo-fnd-plc-loc/hasRegion,
   :skos/definition "indicates a business center, city, or municipality"})

(def hasRegion
  {:db/ident :fibo-fnd-plc-loc/hasRegion,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Locations/"},
   :rdfs/label "has region",
   :rdfs/range :lcc-cr/GeographicRegion,
   :rdfs/subPropertyOf :fibo-fnd-plc-loc/isLocatedAt,
   :skos/definition "indicates a demarcated area on the surface of the Earth"})

(def hasSubdivision
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"},
   :db/ident :fibo-fnd-plc-loc/hasSubdivision,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Locations/"},
   :rdfs/label "has subdivision",
   :rdfs/range :lcc-cr/CountrySubdivision,
   :rdfs/subPropertyOf :fibo-fnd-plc-loc/hasRegion,
   :skos/definition
   "identifies a country subdivision (state, province, region, etc.)"})

(def isLocatedAt
  {:db/ident :fibo-fnd-plc-loc/isLocatedAt,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Locations/"},
   :rdfs/label "is located at",
   :rdfs/range :lcc-cr/Location,
   :skos/definition
   "relates something to a location, which might be physical or virtual"})

(def urn:uuid:8a65ad68-a410-576c-ab38-e904a8e0454b
  {:cmns-av/copyright #{"Copyright (c) 2013-2023 Object Management Group, Inc."
                        "Copyright (c) 2013-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology provides a very high level definition of geographic region and geopolitical entity related concepts, including, but not limited to, countries, sub-country regions such as states and provinces, municipalities, etc., extending the Object Management Group (OMG)'s Languages, Countries, and Codes (LCC) ontologies as needed in FIBO. As such, these terms are automatically mapped to the LCC controlled vocabulary representing ISO 3166 country and country subdivision codes, and may be mapped to other de facto standards such as Geonames and the CIA World Factbook. The concept of a business center, defined herein, maps directly to the FpML concept with the same name, and to the set of business centers and broader municipalities included in ISO 10383, Codes for exchanges and market identification (MIC).",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Locations/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Locations Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FND/Places/Locations.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://www.omg.org/spec/EDMC-FIBO/FND/20180801/Places/Locations.rdf version of this ontology was modified eliminate deprecated elements."
     "The https://www.omg.org/spec/EDMC-FIBO/FND/20190901/Places/Locations.rdf version of this ontology was modified to revise definitions to improve them and make them ISO 704 compliant, and merge the concepts that were previously in the countries ontology into this one."
     "The https://www.omg.org/spec/EDMC-FIBO/FND/20200301/Places/Locations.rdf version of this ontology was modified to address hygiene issues with respect to text formatting."
     "The http://www.omg.org/spec/EDMC-FIBO/FND/20130801/Places/Locations.rdf version of this ontology was modified per the issue resolutions identified in the FIBO FND 1.0 FTF report and in http://www.omg.org/spec/EDMC-FIBO/FND/1.0/AboutFND-1.0/."
     "The http://www.omg.org/spec/EDMC-FIBO/FND/20141101/Places/Locations.rdf version of this ontology was modified for the FIBO 2.0 RFC to integrate it with LCC."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Locations/"})