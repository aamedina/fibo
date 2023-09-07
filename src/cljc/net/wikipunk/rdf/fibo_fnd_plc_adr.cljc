(ns net.wikipunk.rdf.fibo-fnd-plc-adr
  ^{:base "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/",
    :namespaces
    {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
     "cmns-cds" "https://www.omg.org/spec/Commons/CodesAndCodeSets/",
     "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
     "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
     "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
     "cmns-dsg" "https://www.omg.org/spec/Commons/Designators/",
     "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
     "cmns-txt" "https://www.omg.org/spec/Commons/TextDatatype/",
     "dcterms" "http://purl.org/dc/terms/",
     "fibo-fnd-arr-id"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/IdentifiersAndIndices/",
     "fibo-fnd-plc-adr"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/",
     "fibo-fnd-plc-loc"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Locations/",
     "fibo-fnd-rel-rel"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
     "fibo-fnd-utl-av"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
     "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
     "owl" "http://www.w3.org/2002/07/owl#",
     "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
     "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
     "skos" "http://www.w3.org/2004/02/skos/core#",
     "xsd" "http://www.w3.org/2001/XMLSchema#"},
    :prefix "fibo-fnd-plc-adr",
    :source "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"}
  {:cmns-av/copyright #{"Copyright (c) 2013-2023 Object Management Group, Inc."
                        "Copyright (c) 2013-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology provides high level definitions for addresses and address components including elements that are common to addressing standards.",
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
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/IdentifiersAndIndices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/CodesAndCodeSets/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/Analytics/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Locations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/TextDatatype/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/ClassificationSchemes/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Addresses/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Addresses Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses.rdf version of this ontology was modified replace hasDefinition with isDefinedIn to clarify intent, and the address hierarchy was simplified to enable extensions for international and national delivery address specification, and to eliminate deprecated elements."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
     "The http://www.omg.org/spec/EDMC-FIBO/FND/20160201/Places/Addresses.rdf version of this ontology was modified for the FIBO 2.0 RFC to integrate LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses.rdf version of this ontology was modified to address hygiene issues with respect to text formatting."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses.rdf version of this ontology was modified to make postcode a subclass of geographic region identifier and fix spelling errors."
     "The http://www.omg.org/spec/EDMC-FIBO/FND/20141101/Places/Addresses.rdf version of this ontology was modified per the issue resolutions identified in the FIBO FND 1.1 RTF report. Differences from the 1.0 version include the addition of a hasAddress property and PhysicalAddress class as a parent of PostalAddress."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses.rdf version of this ontology was modified to revise names of address elements that could be construed as referring to multiple concepts."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses.rdf version of this ontology was modified to eliminate unnecessary unions and max 1 restrictions."
     "The https://spec.edmcouncil.org/fibo/ontology/Foundations/20130601/Organizations/Addresses.owl version of the ontology was revised in advance of the September 2013 New Brunswick, NJ meeting, as follows:\n\t(1) to use slash style URI/IRIss (also called 303 URIs, vs. hash style) as required to support server side processing \n\t(2) to use version-independent IRIs for all definitions internally as opposed to version-specific IRIs\n\t(3) to change the file suffix from .owl to .rdf to increase usability in RDF tools\n\t(4) to use 4-level abbreviations and corresponding namespace prefixes for all FIBO ontologies, reflecting a family/specification/module/ontology structure\n\t(5) to incorporate changes to the specification metadata to support documentation at the family, specification, module, and ontology level, similar to the abbreviations\n\t(6) to move this ontology from Organizations to Places and eliminate unnecessary properties and related imports dependencies."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses.rdf version of this ontology was modified to correct a missing imports statement."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses.rdf version of this ontology was modified per the issue resolutions identified in the FIBO FND 1.0 FTF report and in https://spec.edmcouncil.org/fibo/ontology/FND/1.0/AboutFND-1.0/. Primary differences include elimination of data properties in favor of a simple class model,the addition of virtual address, and the addition of addressing scheme."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses.rdf version of this ontology was modified to eliminate duplication of concepts in LCC, simplify address representation and merge countries with locations."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"})

(def Address
  {:db/ident :fibo-fnd-plc-adr/Address,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "address"},
   :rdfs/subClassOf #{{:owl/onClass    :lcc-cr/Location,
                       :owl/onProperty :fibo-fnd-arr-id/isIndexTo,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction} :fibo-fnd-arr-id/Index
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-fnd-plc-adr/AddressingScheme,
                       :owl/onProperty :cmns-dsg/isDefinedIn,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "index to a location to which communications may be delivered"})

(def AddressComponent
  {:db/ident :fibo-fnd-plc-adr/AddressComponent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label "address component",
   :rdfs/subClassOf :cmns-cls/Aspect,
   :skos/definition "aspect of an address"})

(def AddressingScheme
  {:db/ident :fibo-fnd-plc-adr/AddressingScheme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label "addressing scheme",
   :rdfs/subClassOf #{{:owl/allValuesFrom :fibo-fnd-plc-adr/Address,
                       :owl/onProperty    :cmns-dsg/defines,
                       :rdf/type          :owl/Restriction}
                      :fibo-fnd-arr-id/IndexingScheme},
   :skos/definition "system for allocating addresses to objects"})

(def Apartment
  {:db/ident :fibo-fnd-plc-adr/Apartment,
   :fibo-fnd-plc-adr/requiresSecondaryUnitRange true,
   :rdf/type #{:fibo-fnd-plc-adr/SecondaryUnitDesignator :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "apartment"},
   :skos/definition
   "room or a group of related rooms, among similar sets in one building, designed for use as a dwelling"})

(def Basement
  {:db/ident :fibo-fnd-plc-adr/Basement,
   :fibo-fnd-plc-adr/requiresSecondaryUnitRange false,
   :rdf/type #{:fibo-fnd-plc-adr/SecondaryUnitDesignator :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "basement"},
   :skos/definition
   "part of a building consisting of rooms that are partly or entirely below ground"})

(def Building
  {:db/ident :fibo-fnd-plc-adr/Building,
   :fibo-fnd-plc-adr/requiresSecondaryUnitRange true,
   :rdf/type #{:fibo-fnd-plc-adr/SecondaryUnitDesignator :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "building"},
   :skos/definition
   "relatively permanent enclosed structure, that has a roof and walls and stands more or less permanently in one place"})

(def ConventionalStreetAddress
  {:cmns-av/explanatoryNote
   "Other unconventional addresses may include rural and highway route addresses, general delivery addresses, post office box addresses, private mail center addresses, and so forth.",
   :db/ident :fibo-fnd-plc-adr/ConventionalStreetAddress,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label "conventional street address",
   :rdfs/subClassOf #{:fibo-fnd-plc-adr/PhysicalAddress
                      {:owl/maxQualifiedCardinality 1,
                       :owl/onClass    :fibo-fnd-plc-adr/StreetAddress,
                       :owl/onProperty :fibo-fnd-plc-adr/hasStreetAddress,
                       :rdf/type       :owl/Restriction}
                      {:owl/maxQualifiedCardinality 1,
                       :owl/onDataRange :rdfs/Literal,
                       :owl/onProperty  :fibo-fnd-plc-adr/hasAddressLine1,
                       :rdf/type        :owl/Restriction}
                      {:owl/maxQualifiedCardinality 1,
                       :owl/onDataRange :rdfs/Literal,
                       :owl/onProperty  :fibo-fnd-plc-adr/hasAddressLine2,
                       :rdf/type        :owl/Restriction}
                      {:owl/maxQualifiedCardinality 1,
                       :owl/onDataRange :rdfs/Literal,
                       :owl/onProperty  :fibo-fnd-plc-adr/hasAddressLine3,
                       :rdf/type        :owl/Restriction}},
   :skos/definition
   "physical address that identifies a location on a street to which communications may be delivered"})

(def Department
  {:db/ident :fibo-fnd-plc-adr/Department,
   :fibo-fnd-plc-adr/requiresSecondaryUnitRange true,
   :rdf/type #{:fibo-fnd-plc-adr/SecondaryUnitDesignator :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "department"},
   :skos/definition
   "division of a large organization such as a government, university, business, or shop, dealing with a specific subject, commodity, or area of activity"})

(def Floor
  {:cmns-av/explanatoryNote
   "Labeling systems for floors vary from country to country, and may be specific to the building, for example, whether or not a 13th floor is identified as such tends to be on a case-by-case basis.",
   :db/ident :fibo-fnd-plc-adr/Floor,
   :fibo-fnd-plc-adr/requiresSecondaryUnitRange true,
   :rdf/type #{:fibo-fnd-plc-adr/SecondaryUnitDesignator :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "floor"},
   :skos/definition
   "all of the rooms or areas on the same level of a building; a story"})

(def Front
  {:db/ident :fibo-fnd-plc-adr/Front,
   :fibo-fnd-plc-adr/requiresSecondaryUnitRange false,
   :rdf/type #{:fibo-fnd-plc-adr/SecondaryUnitDesignator :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "front"},
   :skos/definition
   "side or part of a building that presents itself to view first, that faces the street; the most forward part of a building"})

(def GeographicDirectionalSymbol
  {:db/ident :fibo-fnd-plc-adr/GeographicDirectionalSymbol,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label "geographic directional symbol",
   :rdfs/subClassOf #{:cmns-cds/CodeElement
                      {:owl/onProperty     :fibo-fnd-rel-rel/hasTag,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "code element that gives directional information for postal delivery",
   :skos/example
   "In the United States, these include N, S, E, W, NE, NW, SE, SW."})

(def Hangar
  {:db/ident :fibo-fnd-plc-adr/Hangar,
   :fibo-fnd-plc-adr/requiresSecondaryUnitRange true,
   :rdf/type #{:fibo-fnd-plc-adr/SecondaryUnitDesignator :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "hanger"},
   :skos/definition
   "shed or shelter; any relatively wide structure used for housing airplanes or airships"})

(def Key
  {:db/ident :fibo-fnd-plc-adr/Key,
   :fibo-fnd-plc-adr/requiresSecondaryUnitRange true,
   :rdf/type #{:fibo-fnd-plc-adr/SecondaryUnitDesignator :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "key"},
   :skos/definition
   "usually metal instrument by which the bolt of a lock is turned"})

(def Lobby
  {:db/ident :fibo-fnd-plc-adr/Lobby,
   :fibo-fnd-plc-adr/requiresSecondaryUnitRange false,
   :rdf/type #{:fibo-fnd-plc-adr/SecondaryUnitDesignator :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "lobby"},
   :skos/definition
   "entrance hall, corridor, or vestibule, as in a public building, often serving as an anteroom; foyer"})

(def Lot
  {:db/ident :fibo-fnd-plc-adr/Lot,
   :fibo-fnd-plc-adr/requiresSecondaryUnitRange true,
   :rdf/type #{:fibo-fnd-plc-adr/SecondaryUnitDesignator :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "lot"},
   :skos/definition
   "measured parcel of land having fixed boundaries and designated on a plot or survey"})

(def Lower
  {:db/ident :fibo-fnd-plc-adr/Lower,
   :fibo-fnd-plc-adr/requiresSecondaryUnitRange false,
   :rdf/type #{:fibo-fnd-plc-adr/SecondaryUnitDesignator :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "lower"},
   :skos/definition
   "floor of a building in a multistory structure that is closer to ground level"})

(def Office
  {:db/ident :fibo-fnd-plc-adr/Office,
   :fibo-fnd-plc-adr/requiresSecondaryUnitRange false,
   :rdf/type #{:fibo-fnd-plc-adr/SecondaryUnitDesignator :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "office"},
   :skos/definition
   "place where a particular kind of business is transacted or a service is supplied"})

(def Penthouse
  {:db/ident :fibo-fnd-plc-adr/Penthouse,
   :fibo-fnd-plc-adr/requiresSecondaryUnitRange false,
   :rdf/type #{:fibo-fnd-plc-adr/SecondaryUnitDesignator :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "penthouse"},
   :skos/definition
   "structure or dwelling on the roof or top floor of a building"})

(def PhysicalAddress
  {:cmns-av/usageNote
   "Typically, addresses will have only one postcode expressed either as a string value or individual, and only a municipality (individual) or city (string value).",
   :db/ident :fibo-fnd-plc-adr/PhysicalAddress,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "physical address"},
   :rdfs/subClassOf #{:fibo-fnd-plc-adr/Address
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-fnd-plc-loc/PhysicalLocation,
                       :owl/onProperty :fibo-fnd-arr-id/isIndexTo,
                       :rdf/type       :owl/Restriction}
                      {:owl/maxQualifiedCardinality 1,
                       :owl/onClass    :lcc-cr/Country,
                       :owl/onProperty :fibo-fnd-plc-loc/hasCountry,
                       :rdf/type       :owl/Restriction}
                      {:owl/maxQualifiedCardinality 1,
                       :owl/onDataRange :rdfs/Literal,
                       :owl/onProperty  :fibo-fnd-plc-adr/hasPostalCode,
                       :rdf/type        :owl/Restriction}
                      {:owl/maxQualifiedCardinality 1,
                       :owl/onDataRange :rdfs/Literal,
                       :owl/onProperty  :fibo-fnd-plc-loc/hasCityName,
                       :rdf/type        :owl/Restriction}
                      {:owl/maxQualifiedCardinality 1,
                       :owl/onClass    :fibo-fnd-plc-adr/Postcode,
                       :owl/onProperty :fibo-fnd-plc-adr/hasIndividualPostcode,
                       :rdf/type       :owl/Restriction}
                      {:owl/onProperty     :fibo-fnd-plc-loc/hasSubdivision,
                       :owl/someValuesFrom :lcc-cr/CountrySubdivision,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxQualifiedCardinality 1,
                       :owl/onClass    :fibo-fnd-plc-loc/Municipality,
                       :owl/onProperty :fibo-fnd-plc-loc/hasMunicipality,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "physical address where communications can be addressed, papers served or representatives located for any kind of organization or person",
   :skos/scopeNote
   "An address may be used as an index to the location of a building, apartment, office within an office block, or other structure or parcel of land, often using political boundaries and street names as references, along with other information such as house or building numbers or names. Some addresses also contain secondary elements such as apartment or building numbers, or special codes to aid routing of mail and packages."})

(def PhysicalAddressIdentifier
  {:db/ident :fibo-fnd-plc-adr/PhysicalAddressIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label "physical address identifier",
   :rdfs/subClassOf #{:cmns-id/Identifier
                      {:owl/onClass :fibo-fnd-plc-adr/PhysicalAddressingScheme,
                       :owl/onProperty :cmns-col/isMemberOf,
                       :owl/qualifiedCardinality 1,
                       :rdf/type :owl/Restriction}
                      {:owl/onClass    :fibo-fnd-plc-adr/PhysicalAddress,
                       :owl/onProperty :cmns-id/identifies,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction} :cmns-cds/CodeElement},
   :skos/definition "unique identifier for a physical address",
   :skos/example
   "Physical address identifiers may include bar codes, QCR codes, and +codes in a number of countries."})

(def PhysicalAddressingScheme
  {:db/ident :fibo-fnd-plc-adr/PhysicalAddressingScheme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label "physical addressing scheme",
   :rdfs/seeAlso {:xsd/anyURI
                  "https://pe.usps.com/cpim/ftp/pubs/Pub28/pub28.pdf"},
   :rdfs/subClassOf
   #{:fibo-fnd-plc-adr/AddressingScheme
     {:owl/unionOf [{:owl/minQualifiedCardinality 0,
                     :owl/onClass :fibo-fnd-plc-adr/PhysicalAddressIdentifier,
                     :owl/onProperty :cmns-dsg/defines,
                     :rdf/type :owl/Restriction}
                    {:owl/minQualifiedCardinality 0,
                     :owl/onClass    :fibo-fnd-plc-adr/PhysicalAddress,
                     :owl/onProperty :cmns-dsg/defines,
                     :rdf/type       :owl/Restriction}],
      :rdf/type    :owl/Class}},
   :skos/definition
   "scheme for specifying physical addresses according to a country specific standard"})

(def Pier
  {:db/ident :fibo-fnd-plc-adr/Pier,
   :fibo-fnd-plc-adr/requiresSecondaryUnitRange true,
   :rdf/type #{:fibo-fnd-plc-adr/SecondaryUnitDesignator :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "pier"},
   :skos/definition
   "structure extending into navigable water for use as a landing place or promenade"})

(def PostCodeArea
  {:db/ident :fibo-fnd-plc-adr/PostCodeArea,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "post code area"},
   :rdfs/subClassOf :lcc-cr/GeographicRegion,
   :skos/definition "physical area uniquely identified by some postal code"})

(def PostOfficeBox
  {:cmns-av/explanatoryNote
   "Post office box identifiers are only unique to a given jurisdiction, which may be a post office, town, or other region.",
   :db/ident :fibo-fnd-plc-adr/PostOfficeBox,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label "post office box",
   :rdfs/subClassOf #{{:owl/onClass :fibo-fnd-plc-adr/PostOfficeBoxDesignator,
                       :owl/onProperty :cmns-col/comprises,
                       :owl/qualifiedCardinality 1,
                       :rdf/type :owl/Restriction}
                      :fibo-fnd-plc-adr/SupplementalAddressComponent},
   :skos/definition "post office box associated with an address"})

(def PostOfficeBoxAddress
  {:db/ident :fibo-fnd-plc-adr/PostOfficeBoxAddress,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label "post office box address",
   :rdfs/subClassOf #{:fibo-fnd-plc-adr/PhysicalAddress
                      {:owl/onClass    :fibo-fnd-plc-adr/PostOfficeBox,
                       :owl/onProperty :cmns-col/comprises,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "physical address used to deliver communications to a designated container at a local post office or the local equivalent for the jurisdiction, where mail is held until the recipient collects it, rather than to a given house, building, or other location"})

(def PostOfficeBoxDesignator
  {:db/ident :fibo-fnd-plc-adr/PostOfficeBoxDesignator,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "post office box designator"},
   :rdfs/subClassOf :fibo-fnd-plc-adr/SupplementalAddressDesignator,
   :skos/definition
   "designator used, together with an identifier, for a post office box",
   :skos/example "In the U.S., the preferred designator is 'PO BOX'."})

(def Postcode
  {:cmns-av/synonym "postal code",
   :db/ident :fibo-fnd-plc-adr/Postcode,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "postcode"},
   :rdfs/subClassOf #{:lcc-cr/GeographicRegionIdentifier :cmns-cds/CodeElement
                      {:owl/onClass    :fibo-fnd-plc-adr/PostCodeArea,
                       :owl/onProperty :cmns-id/identifies,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "sequence of characters used to assist in the sorting of mail"})

(def PostdirectionalSymbol
  {:db/ident :fibo-fnd-plc-adr/PostdirectionalSymbol,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label "postdirectional symbol",
   :rdfs/subClassOf :fibo-fnd-plc-adr/GeographicDirectionalSymbol,
   :skos/definition
   "geographic directional symbol that follows the street name and street suffix in a street address"})

(def PredirectionalSymbol
  {:db/ident :fibo-fnd-plc-adr/PredirectionalSymbol,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label "predirectional symbol",
   :rdfs/subClassOf :fibo-fnd-plc-adr/GeographicDirectionalSymbol,
   :skos/definition
   "geographic directional symbol that occurs after the primary street number but before the street name in a street address"})

(def PrimaryAddressNumber
  {:cmns-av/explanatoryNote
   "Although traditionally called a 'number', the street number may consist of alphanumeric characters, for example, '221B'.",
   :cmns-av/synonym "street number",
   :db/ident :fibo-fnd-plc-adr/PrimaryAddressNumber,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label "primary address number",
   :rdfs/subClassOf #{{:owl/onDataRange :xsd/string,
                       :owl/onProperty  :fibo-fnd-rel-rel/hasTag,
                       :owl/qualifiedCardinality 1,
                       :rdf/type        :owl/Restriction}
                      :fibo-fnd-plc-adr/AddressComponent},
   :skos/definition
   "address component that identifies a location with respect to a given street"})

(def Rear
  {:db/ident :fibo-fnd-plc-adr/Rear,
   :fibo-fnd-plc-adr/requiresSecondaryUnitRange false,
   :rdf/type #{:fibo-fnd-plc-adr/SecondaryUnitDesignator :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "rear"},
   :skos/definition
   "side or part of a building at the back, located opposite its front"})

(def RegionSpecificIdentifier
  {:db/ident :fibo-fnd-plc-adr/RegionSpecificIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label "region-specific identifier",
   :rdfs/subClassOf #{:lcc-cr/GeographicRegionIdentifier
                      {:owl/onProperty     :cmns-cxtdsg/isUsedBy,
                       :owl/someValuesFrom :lcc-cr/GeopoliticalEntity,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "geographic region or subdivision identifier used internally by a country or other region"})

(def Room
  {:db/ident :fibo-fnd-plc-adr/Room,
   :fibo-fnd-plc-adr/requiresSecondaryUnitRange true,
   :rdf/type #{:fibo-fnd-plc-adr/SecondaryUnitDesignator :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "room"},
   :skos/definition "partitioned part of the inside of a building"})

(def SecondaryUnit
  {:db/ident :fibo-fnd-plc-adr/SecondaryUnit,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label "secondary unit",
   :rdfs/subClassOf #{:fibo-fnd-plc-adr/AddressComponent
                      {:owl/onClass :fibo-fnd-plc-adr/SecondaryUnitDesignator,
                       :owl/onProperty :cmns-col/comprises,
                       :owl/qualifiedCardinality 1,
                       :rdf/type :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-fnd-plc-adr/SecondaryUnitIndicator,
                       :owl/onProperty :cmns-col/comprises,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "address component that identifies an individual unit within a larger structure, such as an apartment, office, hangar, slip, mailbox, and so forth, at a given street address"})

(def SecondaryUnitDesignator
  {:cmns-av/explanatoryNote
   "Note that only certain secondary units require a secondary range, such as an apartment number, to complete a delivery point.",
   :db/ident :fibo-fnd-plc-adr/SecondaryUnitDesignator,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label "secondary unit designator",
   :rdfs/subClassOf #{{:owl/onDataRange :xsd/boolean,
                       :owl/onProperty
                       :fibo-fnd-plc-adr/requiresSecondaryUnitRange,
                       :owl/qualifiedCardinality 1,
                       :rdf/type :owl/Restriction} :cmns-cls/Classifier},
   :skos/definition
   "classifier for a smaller structure or component within a larger facility, such as an apartment, office, mail stop, or other similar designation"})

(def SecondaryUnitIndicator
  {:db/ident :fibo-fnd-plc-adr/SecondaryUnitIndicator,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label "secondary unit indicator",
   :rdfs/subClassOf #{{:owl/onDataRange :xsd/string,
                       :owl/onProperty  :fibo-fnd-rel-rel/hasTag,
                       :owl/qualifiedCardinality 1,
                       :rdf/type        :owl/Restriction}
                      :fibo-fnd-plc-adr/AddressComponent},
   :skos/definition
   "index to the specific unit within a secondary unit, such as a building or apartment, at a particular street address"})

(def Side
  {:db/ident :fibo-fnd-plc-adr/Side,
   :fibo-fnd-plc-adr/requiresSecondaryUnitRange false,
   :rdf/type #{:fibo-fnd-plc-adr/SecondaryUnitDesignator :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "side"},
   :skos/definition
   "place, space, or direction with respect to a center or to a line of division"})

(def Slip
  {:db/ident :fibo-fnd-plc-adr/Slip,
   :fibo-fnd-plc-adr/requiresSecondaryUnitRange true,
   :rdf/type #{:fibo-fnd-plc-adr/SecondaryUnitDesignator :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "slip"},
   :skos/definition
   "sloping ramp extending out into the water to serve as a place for landing or repairing ships; ship's or boat's berth between two piers"})

(def Space
  {:db/ident :fibo-fnd-plc-adr/Space,
   :fibo-fnd-plc-adr/requiresSecondaryUnitRange true,
   :rdf/type #{:fibo-fnd-plc-adr/SecondaryUnitDesignator :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "space"},
   :skos/definition
   "extent set apart or available, such as a parking or storage space"})

(def Stop
  {:db/ident :fibo-fnd-plc-adr/Stop,
   :fibo-fnd-plc-adr/requiresSecondaryUnitRange true,
   :rdf/type #{:fibo-fnd-plc-adr/SecondaryUnitDesignator :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "stop"},
   :skos/definition "stopping place, such as a bus or mail stop"})

(def StreetAddress
  {:db/ident :fibo-fnd-plc-adr/StreetAddress,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label "street address",
   :rdfs/subClassOf
   #{:fibo-fnd-plc-adr/AddressComponent
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-fnd-plc-adr/SecondaryUnit,
      :owl/onProperty :fibo-fnd-plc-adr/hasSecondaryUnit,
      :rdf/type       :owl/Restriction}
     {:owl/maxQualifiedCardinality 1,
      :owl/onClass    :fibo-fnd-plc-adr/PrimaryAddressNumber,
      :owl/onProperty :fibo-fnd-plc-adr/hasPrimaryAddressNumber,
      :rdf/type       :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-fnd-plc-adr/PredirectionalSymbol,
      :owl/onProperty :fibo-fnd-plc-adr/hasPredirectionalSymbol,
      :rdf/type       :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-fnd-plc-adr/StreetSuffix,
      :owl/onProperty :fibo-fnd-plc-adr/hasStreetSuffix,
      :rdf/type       :owl/Restriction}
     {:owl/onProperty     :fibo-fnd-plc-adr/hasStreetName,
      :owl/someValuesFrom :fibo-fnd-plc-adr/StreetName,
      :rdf/type           :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-fnd-plc-adr/PostdirectionalSymbol,
      :owl/onProperty :fibo-fnd-plc-adr/hasPostdirectionalSymbol,
      :rdf/type       :owl/Restriction}},
   :skos/definition
   "index to a location that consists of a primary address number, predirectional, street name, suffix, postdirectional, and an optional secondary unit"})

(def StreetName
  {:db/ident :fibo-fnd-plc-adr/StreetName,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label "street name",
   :rdfs/subClassOf #{{:owl/onDataRange :xsd/string,
                       :owl/onProperty  :fibo-fnd-rel-rel/hasTag,
                       :owl/qualifiedCardinality 1,
                       :rdf/type        :owl/Restriction}
                      :fibo-fnd-plc-adr/AddressComponent :cmns-dsg/Name},
   :skos/definition
   "identifier for a street in some context (e.g., city, municipality, geographic region)"})

(def StreetSuffix
  {:cmns-av/explanatoryNote
   "The suffix may provide some insight into the size or length of the street, though not necessarily consistently. In some cities, the suffix differentiates the street from another in the same context, such as 19th Street vs. 19th Avenue in San Francisco.",
   :db/ident :fibo-fnd-plc-adr/StreetSuffix,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label "street suffix",
   :rdfs/subClassOf #{:fibo-fnd-plc-adr/AddressComponent :cmns-cls/Classifier},
   :skos/definition
   "classifier for a street or other delivery location, such as a dwelling located along a waterway"})

(def StructureName
  {:db/ident :fibo-fnd-plc-adr/StructureName,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label "structure name",
   :rdfs/subClassOf #{{:owl/onDataRange :xsd/string,
                       :owl/onProperty  :fibo-fnd-rel-rel/hasTag,
                       :owl/qualifiedCardinality 1,
                       :rdf/type        :owl/Restriction}
                      :fibo-fnd-plc-adr/AddressComponent :cmns-dsg/Name},
   :skos/definition
   "name for a building, house, office complex, shopping center, or other structure or group of structures",
   :skos/example
   "Examples include 'McCoy Center', which is the name of the office complex where JPMorgan Chase's Polaris facility is located, 'Apple Park', which is the name of the corporate headquarters of Apple, Inc., and 'Howells Bridge Cottage', which is the name of a very old cottage in Cornwall."})

(def Suite
  {:db/ident :fibo-fnd-plc-adr/Suite,
   :fibo-fnd-plc-adr/requiresSecondaryUnitRange true,
   :rdf/type #{:fibo-fnd-plc-adr/SecondaryUnitDesignator :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "suite"},
   :skos/definition "group of rooms occupied as a unit"})

(def SupplementalAddressComponent
  {:cmns-av/explanatoryNote
   "Supplemental components include post office box information, rural route and highway contract route information, private mailboxes, and so forth, that are not part of a conventional street address.",
   :db/ident :fibo-fnd-plc-adr/SupplementalAddressComponent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label "supplemental address component",
   :rdfs/subClassOf
   #{{:owl/onClass    :fibo-fnd-plc-adr/SupplementalAddressDesignator,
      :owl/onProperty :cmns-col/comprises,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-fnd-plc-adr/SupplementalAddressUnit,
      :owl/onProperty :cmns-col/comprises,
      :rdf/type       :owl/Restriction} :fibo-fnd-plc-adr/AddressComponent
     {:owl/minQualifiedCardinality 0,
      :owl/onDataRange :rdfs/Literal,
      :owl/onProperty  :fibo-fnd-rel-rel/hasTag,
      :rdf/type        :owl/Restriction}},
   :skos/definition
   "address component that provides additional information that is important to ensuring proper delivery of communications"})

(def SupplementalAddressDesignator
  {:db/ident :fibo-fnd-plc-adr/SupplementalAddressDesignator,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label "supplemental address designator",
   :rdfs/subClassOf #{{:owl/onProperty :cmns-cls/classifies,
                       :owl/someValuesFrom
                       :fibo-fnd-plc-adr/SupplementalAddressComponent,
                       :rdf/type :owl/Restriction} :cmns-cls/Classifier},
   :skos/definition
   "classifier for supplemental address information, such as a highway contract route, rural route, building complex, shopping center, condominium complex, mail box, or other similar designation"})

(def SupplementalAddressUnit
  {:db/ident :fibo-fnd-plc-adr/SupplementalAddressUnit,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label "supplemental address unit",
   :rdfs/subClassOf #{{:owl/onDataRange :xsd/string,
                       :owl/onProperty  :fibo-fnd-rel-rel/hasTag,
                       :owl/qualifiedCardinality 1,
                       :rdf/type        :owl/Restriction}
                      :fibo-fnd-plc-adr/AddressComponent},
   :skos/definition
   "address component that includes a specific route, box, apartment, condominium or other indicator or unit associated with a specific address"})

(def Trailer
  {:db/ident :fibo-fnd-plc-adr/Trailer,
   :fibo-fnd-plc-adr/requiresSecondaryUnitRange true,
   :rdf/type #{:fibo-fnd-plc-adr/SecondaryUnitDesignator :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "trailer"},
   :skos/definition
   "vehicle designed to serve wherever parked as a temporary dwelling or place of business"})

(def Unit
  {:db/ident :fibo-fnd-plc-adr/Unit,
   :fibo-fnd-plc-adr/requiresSecondaryUnitRange true,
   :rdf/type #{:fibo-fnd-plc-adr/SecondaryUnitDesignator :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "unit"},
   :skos/definition
   "area in a facility, such as a medical facility or hospital that is specially staffed and equipped to provide a particular service or type of care"})

(def Upper
  {:db/ident :fibo-fnd-plc-adr/Upper,
   :fibo-fnd-plc-adr/requiresSecondaryUnitRange false,
   :rdf/type #{:fibo-fnd-plc-adr/SecondaryUnitDesignator :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "upper"},
   :skos/definition
   "floor of a building in a multistory structure that is farther away from the ground level"})

(def VirtualAddress
  {:db/ident :fibo-fnd-plc-adr/VirtualAddress,
   :owl/disjointWith :fibo-fnd-plc-adr/PhysicalAddress,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label "virtual address",
   :rdfs/subClassOf #{{:owl/onDataRange :xsd/string,
                       :owl/onProperty  :fibo-fnd-rel-rel/hasTag,
                       :owl/qualifiedCardinality 1,
                       :rdf/type        :owl/Restriction}
                      :fibo-fnd-plc-adr/Address},
   :skos/definition
   "address identifying a virtual, i.e. non-physical, location"})

(def hasAddress
  {:db/ident :fibo-fnd-plc-adr/hasAddress,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label "has address",
   :rdfs/range :fibo-fnd-plc-adr/Address,
   :rdfs/subPropertyOf :cmns-cls/isCharacterizedBy,
   :skos/definition
   "indicates a means by which something (in the case of a network address) or some entity may be located or contacted or may receive correspondence"})

(def hasAddressLine1
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"},
   :db/ident :fibo-fnd-plc-adr/hasAddressLine1,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-fnd-plc-adr/PhysicalAddress,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label "has address line 1",
   :rdfs/subPropertyOf :cmns-txt/hasTextValue,
   :skos/definition "the first line of the street address"})

(def hasAddressLine2
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"},
   :db/ident :fibo-fnd-plc-adr/hasAddressLine2,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-fnd-plc-adr/PhysicalAddress,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label "has address line 2",
   :rdfs/subPropertyOf :cmns-txt/hasTextValue,
   :skos/definition "the second line of the street address"})

(def hasAddressLine3
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"},
   :cmns-av/usageNote
   "This element SHALL be omitted if address line 2 is omitted.",
   :db/ident :fibo-fnd-plc-adr/hasAddressLine3,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-fnd-plc-adr/PhysicalAddress,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label "has address line 3",
   :rdfs/subPropertyOf :cmns-txt/hasTextValue,
   :skos/definition "the third line of the street address"})

(def hasAttentionLine
  {:db/ident :fibo-fnd-plc-adr/hasAttentionLine,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-fnd-plc-adr/PhysicalAddress,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label "has attention line",
   :rdfs/subPropertyOf :cmns-txt/hasTextValue,
   :skos/definition
   "an optional, free text address line denoting the intended recipient"})

(def hasIndividualPostcode
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"},
   :db/ident :fibo-fnd-plc-adr/hasIndividualPostcode,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-plc-adr/PhysicalAddress,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label "has individual postcode",
   :rdfs/range :fibo-fnd-plc-adr/Postcode,
   :rdfs/subPropertyOf :cmns-col/comprises,
   :skos/definition
   "indicates the local or international postcode element of a delivery address as specified by the local postal service"})

(def hasMailRouting
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"},
   :db/ident :fibo-fnd-plc-adr/hasMailRouting,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-fnd-plc-adr/PhysicalAddress,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label "has mail routing",
   :rdfs/subPropertyOf :cmns-txt/hasTextValue,
   :skos/definition
   "an optional, free text address line containing explicit routing information (this elements's presence indicates that this address is a routing / 'care of' address)"})

(def hasPostalCode
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"},
   :db/ident :fibo-fnd-plc-adr/hasPostalCode,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-fnd-plc-adr/PhysicalAddress,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label "has postal code",
   :rdfs/subPropertyOf :cmns-txt/hasTextValue,
   :skos/definition
   "the postal code of this address as specified by the local postal service"})

(def hasPostdirectionalSymbol
  {:db/ident :fibo-fnd-plc-adr/hasPostdirectionalSymbol,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-plc-adr/StreetAddress,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label "has postdirectional symbol",
   :rdfs/range :fibo-fnd-plc-adr/PostdirectionalSymbol,
   :rdfs/subPropertyOf :cmns-col/comprises,
   :skos/definition
   "specifies a geographic directional symbol that follows the street name and street suffix in a street address"})

(def hasPredirectionalSymbol
  {:db/ident :fibo-fnd-plc-adr/hasPredirectionalSymbol,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-plc-adr/StreetAddress,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label "has predirectional symbol",
   :rdfs/range :fibo-fnd-plc-adr/PredirectionalSymbol,
   :rdfs/subPropertyOf :cmns-col/comprises,
   :skos/definition
   "specifies a geographic directional symbol that occurs after the primary street number but before the street name in a street address"})

(def hasPrimaryAddressNumber
  {:db/ident :fibo-fnd-plc-adr/hasPrimaryAddressNumber,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-plc-adr/StreetAddress,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label "has primary address number",
   :rdfs/range :fibo-fnd-plc-adr/PrimaryAddressNumber,
   :rdfs/subPropertyOf :cmns-col/comprises,
   :skos/definition "specifies a a location with respect to a given street"})

(def hasSecondaryUnit
  {:db/ident :fibo-fnd-plc-adr/hasSecondaryUnit,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-plc-adr/StreetAddress,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label "has secondary unit",
   :rdfs/range :fibo-fnd-plc-adr/SecondaryUnit,
   :rdfs/subPropertyOf :cmns-col/comprises,
   :skos/definition
   "specifies an individual unit within a larger structure, such as an apartment, office, hangar, slip, mailbox, and so forth, at a given street address"})

(def hasStreetAddress
  {:db/ident :fibo-fnd-plc-adr/hasStreetAddress,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-plc-adr/ConventionalStreetAddress,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label "has street address",
   :rdfs/range :fibo-fnd-plc-adr/StreetAddress,
   :rdfs/subPropertyOf :cmns-col/comprises,
   :skos/definition
   "indicates a fully-specified address component that consists of a primary address number, predirectional, street name, suffix, postdirectional, and an optional secondary unit"})

(def hasStreetName
  {:db/ident :fibo-fnd-plc-adr/hasStreetName,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-plc-adr/StreetAddress,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label "has street name",
   :rdfs/range :fibo-fnd-plc-adr/StreetName,
   :rdfs/subPropertyOf :cmns-col/comprises,
   :skos/definition
   "specifies an identifier for a street in some context (e.g., 'Baker', 'First', 'Main')"})

(def hasStreetSuffix
  {:db/ident :fibo-fnd-plc-adr/hasStreetSuffix,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-plc-adr/StreetAddress,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label "has street suffix",
   :rdfs/range :fibo-fnd-plc-adr/StreetSuffix,
   :rdfs/subPropertyOf :cmns-col/comprises,
   :skos/definition
   "specifies an additional qualifier for a street or other delivery location, such as a dwelling located along a waterway"})

(def hasStructureName
  {:db/ident :fibo-fnd-plc-adr/hasStructureName,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-plc-adr/PhysicalAddress,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label "has structure name",
   :rdfs/range :fibo-fnd-plc-adr/StructureName,
   :rdfs/subPropertyOf :cmns-col/comprises,
   :skos/definition
   "specifies an identifier for a building, house, office complex, shopping center, or other structure or group of structures"})

(def hasTransliteratedAddress
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"},
   :db/ident :fibo-fnd-plc-adr/hasTransliteratedAddress,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label "has transliterated address",
   :rdfs/range :fibo-fnd-plc-adr/Address,
   :rdfs/subPropertyOf :fibo-fnd-plc-adr/hasAddress,
   :skos/definition
   "identifies a transliterated (i.e., in Latin or Romanized ASCII) address for the registered entity"})

(def requiresSecondaryUnitRange
  {:cmns-av/explanatoryNote
   "Note that in some cases, such as for lobby or office, if there are multiple secondary units then a range may be needed to differentiate between them, even if the range is not always required.",
   :db/ident :fibo-fnd-plc-adr/requiresSecondaryUnitRange,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"},
   :rdfs/label "requires secondary unit range",
   :rdfs/range :xsd/boolean,
   :rdfs/seeAlso {:xsd/anyURI
                  "https://pe.usps.com/cpim/ftp/pubs/Pub28/pub28.pdf"},
   :rdfs/subPropertyOf :cmns-txt/hasTextValue,
   :skos/definition
   "if true, indicates that an additional qualifier is needed to complete the delivery point description, such as an apartment number"})

(def urn:uuid:7d8e2b77-3902-5371-8f37-666c2a41215f
  {:cmns-av/copyright #{"Copyright (c) 2013-2023 Object Management Group, Inc."
                        "Copyright (c) 2013-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology provides high level definitions for addresses and address components including elements that are common to addressing standards.",
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
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/IdentifiersAndIndices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/CodesAndCodeSets/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/Analytics/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Locations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/TextDatatype/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/ClassificationSchemes/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Addresses/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Addresses Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses.rdf version of this ontology was modified replace hasDefinition with isDefinedIn to clarify intent, and the address hierarchy was simplified to enable extensions for international and national delivery address specification, and to eliminate deprecated elements."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
     "The http://www.omg.org/spec/EDMC-FIBO/FND/20160201/Places/Addresses.rdf version of this ontology was modified for the FIBO 2.0 RFC to integrate LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses.rdf version of this ontology was modified to address hygiene issues with respect to text formatting."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses.rdf version of this ontology was modified to make postcode a subclass of geographic region identifier and fix spelling errors."
     "The http://www.omg.org/spec/EDMC-FIBO/FND/20141101/Places/Addresses.rdf version of this ontology was modified per the issue resolutions identified in the FIBO FND 1.1 RTF report. Differences from the 1.0 version include the addition of a hasAddress property and PhysicalAddress class as a parent of PostalAddress."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses.rdf version of this ontology was modified to revise names of address elements that could be construed as referring to multiple concepts."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses.rdf version of this ontology was modified to eliminate unnecessary unions and max 1 restrictions."
     "The https://spec.edmcouncil.org/fibo/ontology/Foundations/20130601/Organizations/Addresses.owl version of the ontology was revised in advance of the September 2013 New Brunswick, NJ meeting, as follows:\n\t(1) to use slash style URI/IRIss (also called 303 URIs, vs. hash style) as required to support server side processing \n\t(2) to use version-independent IRIs for all definitions internally as opposed to version-specific IRIs\n\t(3) to change the file suffix from .owl to .rdf to increase usability in RDF tools\n\t(4) to use 4-level abbreviations and corresponding namespace prefixes for all FIBO ontologies, reflecting a family/specification/module/ontology structure\n\t(5) to incorporate changes to the specification metadata to support documentation at the family, specification, module, and ontology level, similar to the abbreviations\n\t(6) to move this ontology from Organizations to Places and eliminate unnecessary properties and related imports dependencies."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses.rdf version of this ontology was modified to correct a missing imports statement."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses.rdf version of this ontology was modified per the issue resolutions identified in the FIBO FND 1.0 FTF report and in https://spec.edmcouncil.org/fibo/ontology/FND/1.0/AboutFND-1.0/. Primary differences include elimination of data properties in favor of a simple class model,the addition of virtual address, and the addition of addressing scheme."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses.rdf version of this ontology was modified to eliminate duplication of concepts in LCC, simplify address representation and merge countries with locations."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"})