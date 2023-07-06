(ns net.wikipunk.rdf.gleif-geo
  "Ontology defining concepts for Geocoding of addresses. It is based on the geocoding used in the Global Legal Entity Identifier Foundation (GLEIF) Golden Copy Data, but is more broadly applicable."
  {:dcat/downloadURL
   "https://www.gleif.org/ontology/v1.0/Geocoding/ontology.ttl",
   :dcterms/abstract
   "Ontology defining concepts for Geocoding of addresses. It is based on the geocoding  used in the Global Legal Entity Identifier Foundation (GLEIF) Golden Copy Data, but is more broadly applicable.",
   :dcterms/contributor ["https://www.linkedin.com/in/peterivett/"
                         "http://www.workingontologist.com"
                         "http://purl.org/bryon"],
   :dcterms/creator :gleif-base/GLEIF,
   :dcterms/issued #inst "2019-02-01T00:00:00.000-00:00",
   :dcterms/license "https://www.gleif.org/en/meta/lei-data-terms-of-use/",
   :dcterms/rights
   "Copyright (c) 2019 Global Legal Entity Identifier Foundation (GLEIF)",
   :dcterms/rightsHolder :gleif-base/GLEIF,
   :dcterms/source
   ["https://developer.here.com/documentation/geocoder/topics/reading-geocoding-response.html"
    "https://www.gleif.org/en/lei-data/gleif-golden-copy"],
   :dcterms/title
   #voc/lstr "Global Legal Entity Identifier Foundation Geocoding Ontology@en",
   :owl/imports
   ["https://www.gleif.org/ontology/Base/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"],
   :owl/versionIRI "https://www.gleif.org/ontology/Geocoding-v1.0/Geocoding/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "geo" "http://www.w3.org/2003/01/geo/wgs84_pos#",
    "gleif-base" "https://www.gleif.org/ontology/Base/",
    "gleif-geo" "https://www.gleif.org/ontology/Geocoding/",
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "vann" "http://purl.org/vocab/vann/",
    "voaf" "http://purl.org/vocommons/voaf#",
    "xml" "http://www.w3.org/XML/1998/namespace",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type [:owl/Ontology :voaf/Vocabulary],
   :rdfa/prefix "gleif-geo",
   :rdfa/uri "https://www.gleif.org/ontology/Geocoding/",
   :rdfs/label "GLEIF Geocoding Ontology",
   :vann/preferredNamespacePrefix "gleif-geo",
   :vann/preferredNamespaceUri "https://www.gleif.org/ontology/Geocoding/"})

(def BoundingBox
  "A geographic rectangular area bounded by its top left and bottom right points."
  {:db/ident :gleif-geo/BoundingBox,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://www.gleif.org/ontology/Geocoding/",
   :rdfs/label "bounding box",
   :rdfs/subClassOf [:geo/SpatialThing
                     {:owl/onClass    :geo/Point,
                      :owl/onProperty :gleif-geo/topLeft,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :geo/Point,
                      :owl/onProperty :gleif-geo/bottomRight,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "A geographic rectangular area bounded by its top left and bottom right points."})

(def GeocodedAddress
  "A geocoded address, derived from a physical address, with latitude and longitude information."
  {:db/ident :gleif-geo/GeocodedAddress,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://www.gleif.org/ontology/Geocoding/",
   :rdfs/label #voc/lstr "geocoded address@en",
   :rdfs/subClassOf [{:owl/onClass    :lcc-cr/Country,
                      :owl/onProperty :gleif-base/hasCountry,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :gleif-base/hasPostalCode,
                      :rdf/type           :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :gleif-geo/locationId,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :gleif-geo/hasDistrict,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :gleif-base/PhysicalAddress,
                      :owl/onProperty :gleif-geo/originalAddress,
                      :rdf/type       :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :gleif-base/hasAddressNumber,
                      :rdf/type           :owl/Restriction}
                     :gleif-base/PhysicalAddress
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :gleif-geo/hasRegionText,
                      :rdf/type           :owl/Restriction}
                     {:owl/onClass    :gleif-geo/MatchType,
                      :owl/onProperty :gleif-geo/matchType,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onDataRange :xsd/dateTime,
                      :owl/onProperty  :gleif-geo/matchDate,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/minCardinality 0,
                      :owl/onProperty     :gleif-geo/originalAddressText,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :gleif-geo/hasStreet,
                      :rdf/type           :owl/Restriction}
                     {:owl/onDataRange :xsd/decimal,
                      :owl/onProperty  :gleif-geo/relevance,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/onClass    :gleif-geo/BoundingBox,
                      :owl/onProperty :gleif-geo/hasBoundingBox,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :gleif-geo/formattedAddressText,
                      :rdf/type           :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :gleif-base/hasCity,
                      :rdf/type        :owl/Restriction}],
   :skos/definition
   "A geocoded address, derived from a physical address, with latitude and longitude information."})

(def MatchType
  "Quality of the location match, either pointAddress or interpolated."
  {:db/ident :gleif-geo/MatchType,
   :owl/oneOf [:gleif-geo/MatchTypePointAddress
               :gleif-geo/MatchTypeInterpolated],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://www.gleif.org/ontology/Geocoding/",
   :rdfs/label "match type",
   :skos/definition
   "Quality of the location match, either pointAddress or interpolated."})

(def MatchTypeInterpolated
  "The location was interpolated from known locations of adjacent addresses."
  {:db/ident :gleif-geo/MatchTypeInterpolated,
   :gleif-base/hasTag "interpolated",
   :rdf/type :gleif-geo/MatchType,
   :rdfs/isDefinedBy "https://www.gleif.org/ontology/Geocoding/",
   :rdfs/label "match type interpolated",
   :skos/definition
   "The location was interpolated from known locations of adjacent addresses."})

(def MatchTypePointAddress
  "The location matches the specific address."
  {:db/ident          :gleif-geo/MatchTypePointAddress,
   :gleif-base/hasTag "pointAddress",
   :rdf/type          :gleif-geo/MatchType,
   :rdfs/isDefinedBy  "https://www.gleif.org/ontology/Geocoding/",
   :rdfs/label        "match type point address",
   :skos/definition   "The location matches the specific address."})

(def bottomRight
  "The bottom right point of a bounding box."
  {:db/ident         :gleif-geo/bottomRight,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/domain      :gleif-geo/BoundingBox,
   :rdfs/isDefinedBy "https://www.gleif.org/ontology/Geocoding/",
   :rdfs/label       "bottom right",
   :rdfs/range       :geo/Point,
   :skos/definition  "The bottom right point of a bounding box."})

(def formattedAddressText
  "An aggregated textual representation of the the fields produced by the geocoding as a comma-separated list of fields."
  {:db/ident :gleif-geo/formattedAddressText,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :gleif-geo/GeocodedAddress,
   :rdfs/isDefinedBy "https://www.gleif.org/ontology/Geocoding/",
   :rdfs/label "formatted address text",
   :skos/definition
   "An aggregated textual representation of the the fields produced by the geocoding as a comma-separated list of fields."})

(def hasBoundingBox
  "The geographic area represented by the address."
  {:db/ident         :gleif-geo/hasBoundingBox,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/domain      :gleif-geo/GeocodedAddress,
   :rdfs/isDefinedBy "https://www.gleif.org/ontology/Geocoding/",
   :rdfs/label       "has bounding box",
   :rdfs/range       :gleif-geo/BoundingBox,
   :skos/definition  "The geographic area represented by the address."})

(def hasDistrict
  "A textual representation of the district."
  {:db/ident         :gleif-geo/hasDistrict,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/domain      :gleif-geo/GeocodedAddress,
   :rdfs/isDefinedBy "https://www.gleif.org/ontology/Geocoding/",
   :rdfs/label       "has district",
   :skos/definition  "A textual representation of the district."})

(def hasGeocodedAddress
  "A geocoded address for the legal entity."
  {:db/ident           :gleif-geo/hasGeocodedAddress,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/isDefinedBy   "https://www.gleif.org/ontology/Geocoding/",
   :rdfs/label         "has geocoded address",
   :rdfs/range         :gleif-geo/GeocodedAddress,
   :rdfs/subPropertyOf :gleif-base/hasAddress,
   :skos/definition    "A geocoded address for the legal entity."})

(def hasRegionText
  "A textual representation of the state or region."
  {:db/ident         :gleif-geo/hasRegionText,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/domain      :gleif-geo/GeocodedAddress,
   :rdfs/isDefinedBy "https://www.gleif.org/ontology/Geocoding/",
   :rdfs/label       "has region text",
   :skos/altLabel    "has state text",
   :skos/definition  "A textual representation of the state or region.",
   :skos/prefLabel   "has region text"})

(def hasStreet
  "The name of a street, as opposed to a house within it."
  {:db/ident         :gleif-geo/hasStreet,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/domain      :gleif-geo/GeocodedAddress,
   :rdfs/isDefinedBy "https://www.gleif.org/ontology/Geocoding/",
   :rdfs/label       "has street",
   :skos/definition  "The name of a street, as opposed to a house within it."})

(def locationId
  "A unique identifier representing a hash of the location."
  {:db/ident :gleif-geo/locationId,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/domain :gleif-geo/GeocodedAddress,
   :rdfs/isDefinedBy "https://www.gleif.org/ontology/Geocoding/",
   :rdfs/label "location ID",
   :rdfs/subPropertyOf :gleif-base/hasTag,
   :skos/definition "A unique identifier representing a hash of the location."})

(def matchDate
  "The date of the geocoding from the original address."
  {:db/ident         :gleif-geo/matchDate,
   :rdf/type         :owl/DatatypeProperty,
   :rdfs/domain      :gleif-geo/GeocodedAddress,
   :rdfs/isDefinedBy "https://www.gleif.org/ontology/Geocoding/",
   :rdfs/label       #voc/lstr "has end@en",
   :rdfs/range       :xsd/dateTime,
   :skos/definition  "The date of the geocoding from the original address."})

(def matchLevel
  "The most detailed address field that the geocoding was able to provide."
  {:db/ident :gleif-geo/matchLevel,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/domain :gleif-geo/GeocodedAddress,
   :rdfs/isDefinedBy "https://www.gleif.org/ontology/Geocoding/",
   :rdfs/label "match level",
   :rdfs/range :owl/DatatypeProperty,
   :skos/definition
   "The most detailed address field that the geocoding was able to provide."})

(def matchType
  "Quality of the location match, either pointAddress or interpolated."
  {:db/ident :gleif-geo/matchType,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :gleif-geo/GeocodedAddress,
   :rdfs/isDefinedBy "https://www.gleif.org/ontology/Geocoding/",
   :rdfs/label "match type",
   :rdfs/range :gleif-geo/MatchType,
   :skos/definition
   "Quality of the location match, either pointAddress or interpolated."})

(def originalAddress
  "The original address(es) from which the geocoding was derived."
  {:db/ident :gleif-geo/originalAddress,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :gleif-geo/GeocodedAddress,
   :rdfs/isDefinedBy "https://www.gleif.org/ontology/Geocoding/",
   :rdfs/label "original address",
   :rdfs/range :gleif-base/PhysicalAddress,
   :skos/definition
   "The original address(es) from which the geocoding was derived."})

(def originalAddressText
  "An aggregated textual representation of the original address(es) from which the geocoding was derived, as a comma-separated list of fields with null where the field did not have a value."
  {:db/ident :gleif-geo/originalAddressText,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :gleif-geo/GeocodedAddress,
   :rdfs/isDefinedBy "https://www.gleif.org/ontology/Geocoding/",
   :rdfs/label "original address text",
   :skos/definition
   "An aggregated textual representation of the original address(es) from which the geocoding was derived, as a comma-separated list of fields with null where the field did not have a value."})

(def relevance
  "A value from 0 to 1 representing the percentage of the input that matched the returned address. 1 means that all input tokens were matched."
  {:db/ident :gleif-geo/relevance,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :gleif-geo/GeocodedAddress,
   :rdfs/isDefinedBy "https://www.gleif.org/ontology/Geocoding/",
   :rdfs/label "bottom right",
   :rdfs/range :xsd/decimal,
   :skos/definition
   "A value from 0 to 1 representing the percentage of the input that matched the returned address. 1 means that all input tokens were matched."})

(def topLeft
  "The top left point of a bounding box."
  {:db/ident         :gleif-geo/topLeft,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/domain      :gleif-geo/BoundingBox,
   :rdfs/isDefinedBy "https://www.gleif.org/ontology/Geocoding/",
   :rdfs/label       "top left",
   :rdfs/range       :geo/Point,
   :skos/definition  "The top left point of a bounding box."})
