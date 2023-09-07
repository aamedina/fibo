(ns net.wikipunk.rdf.lcc-3166-2
  ^{:base "https://www.omg.org/spec/LCC/Countries/ISO3166-2-SubdivisionCodes/",
    :namespaces
    {"dcterms" "http://purl.org/dc/terms/",
     "lcc-3166-1"
     "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
     "lcc-3166-2"
     "https://www.omg.org/spec/LCC/Countries/ISO3166-2-SubdivisionCodes/",
     "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
     "lcc-lr" "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
     "owl" "http://www.w3.org/2002/07/owl#",
     "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
     "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
     "skos" "http://www.w3.org/2004/02/skos/core#",
     "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
     "xsd" "http://www.w3.org/2001/XMLSchema#"},
    :prefix "lcc-3166-2",
    :source
    "https://www.omg.org/spec/LCC/Countries/ISO3166-2-SubdivisionCodes/"}
  {:dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :owl/imports
   #{{:xsd/anyURI
      "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/20211101/Countries/ISO3166-2-SubdivisionCodes/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "ISO 3166-2 Subdivision Codes Ontology",
   :rdfs/seeAlso #{{:xsd/anyURI
                    "https://www.omg.org/spec/LCC/Countries/AboutCountries/"}
                   {:xsd/anyURI "https://www.omg.org/spec/LCC/AboutLCC/"}},
   :skos/changeNote
   "The http://www.omg.org/spec/LCC/20151101/Countries/ISO3166-2-SubdivisionCodes/ version of this ontology was modified per the resolutions included in the LCC 1.0 FTF report. The subdivision codes and related metadata contained herein are current as of the July 2017 revision to the online code set.",
   :sm/contentLanguage #{{:xsd/anyURI "http://www.omg.org/spec/ODM/"}
                         {:xsd/anyURI
                          "http://www.w3.org/standards/techs/owl#w3c_all"}},
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
   :sm/fileAbbreviation "lcc-3166-2",
   :sm/fileAbstract
   "This ontology defines the code set relevant to representation of subdivisions of countries, as required to support the ISO 3166-2 subdivision codes. The codes for each country are defined by country in subordinate, regional ontologies.",
   :sm/filename "ISO3166-2-SubdivisionCodes.rdf",
   :xsd/anyURI
   "https://www.omg.org/spec/LCC/Countries/ISO3166-2-SubdivisionCodes/"})

(def ISO3166-2-CodeSet
  {:db/ident :lcc-3166-2/ISO3166-2-CodeSet,
   :rdf/type #{:lcc-lr/CodeSet :owl/NamedIndividual
               :lcc-lr/IdentificationScheme},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-2-SubdivisionCodes/"},
   :rdfs/label "ISO 3166-2 code set",
   :skos/definition
   "the set of subdivision identifiers that comprise the ISO 3166-2 specification"})

(def Territory
  {:db/ident :lcc-3166-2/Territory,
   :rdf/type #{:lcc-cr/GeographicRegionKind :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-2-SubdivisionCodes/"},
   :rdfs/label "territory",
   :skos/definition "a kind of region that is a territory"})

(def urn:uuid:fdf0ab99-8545-5300-8997-07f37ccd8de0
  {:dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :owl/imports
   #{{:xsd/anyURI
      "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/20211101/Countries/ISO3166-2-SubdivisionCodes/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "ISO 3166-2 Subdivision Codes Ontology",
   :rdfs/seeAlso #{{:xsd/anyURI
                    "https://www.omg.org/spec/LCC/Countries/AboutCountries/"}
                   {:xsd/anyURI "https://www.omg.org/spec/LCC/AboutLCC/"}},
   :skos/changeNote
   "The http://www.omg.org/spec/LCC/20151101/Countries/ISO3166-2-SubdivisionCodes/ version of this ontology was modified per the resolutions included in the LCC 1.0 FTF report. The subdivision codes and related metadata contained herein are current as of the July 2017 revision to the online code set.",
   :sm/contentLanguage #{{:xsd/anyURI "http://www.omg.org/spec/ODM/"}
                         {:xsd/anyURI
                          "http://www.w3.org/standards/techs/owl#w3c_all"}},
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
   :sm/fileAbbreviation "lcc-3166-2",
   :sm/fileAbstract
   "This ontology defines the code set relevant to representation of subdivisions of countries, as required to support the ISO 3166-2 subdivision codes. The codes for each country are defined by country in subordinate, regional ontologies.",
   :sm/filename "ISO3166-2-SubdivisionCodes.rdf",
   :xsd/anyURI
   "https://www.omg.org/spec/LCC/Countries/ISO3166-2-SubdivisionCodes/"})