(ns net.wikipunk.rdf.lcc-3166-2-ch
  {:dcat/downloadURL
   "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH.rdf",
   :dcterms/issued #inst "2021-10-29T23:57:18.464-00:00",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :namespaces
   {"dcterms" "http://purl.org/dc/terms/",
    "lcc-3166-1"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
    "lcc-3166-2"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-2-SubdivisionCodes/",
    "lcc-3166-2-ch"
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/",
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "lcc-lr" "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
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
      "https://www.omg.org/spec/LCC/Countries/ISO3166-2-SubdivisionCodes/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/20211101/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "lcc-3166-2-ch",
   :rdfa/uri
   "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/",
   :rdfs/label "ISO 3166-2 Subdivision Codes for Switzerland Ontology",
   :rdfs/seeAlso #{{:xsd/anyURI
                    "https://www.omg.org/spec/LCC/Countries/AboutCountries/"}
                   {:xsd/anyURI "https://www.omg.org/spec/LCC/AboutLCC/"}},
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
      "https://www.omg.org/spec/LCC/Countries/ISO3166-2-SubdivisionCodes/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}},
   :sm/fileAbbreviation "lcc-3166-2-ch",
   :sm/fileAbstract
   "This ontology represents the subset of the ISO 3166 standard that includes the actual ISO 3166-2 subdivision codes for Switzerland, with the ontology and codes for the other parts of the standard represented in models that this ontology depends on.",
   :sm/filename "ISO3166-2-SubdivisionCodes-CH.rdf",
   :xsd/anyURI
   "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"})

(def Aargau
  {:db/ident   :lcc-3166-2-ch/Aargau,
   :owl/sameAs :lcc-3166-2-ch/CH-AG-Subdivision,
   :rdf/type   :owl/NamedIndividual})

(def AppenzellAusserrhoden
  {:db/ident   :lcc-3166-2-ch/AppenzellAusserrhoden,
   :owl/sameAs :lcc-3166-2-ch/CH-AR-Subdivision,
   :rdf/type   :owl/NamedIndividual})

(def AppenzellInnerrhoden
  {:db/ident   :lcc-3166-2-ch/AppenzellInnerrhoden,
   :owl/sameAs :lcc-3166-2-ch/CH-AI-Subdivision,
   :rdf/type   :owl/NamedIndividual})

(def Basel-Landschaft
  {:db/ident   :lcc-3166-2-ch/Basel-Landschaft,
   :owl/sameAs :lcc-3166-2-ch/CH-BL-Subdivision,
   :rdf/type   :owl/NamedIndividual})

(def Basel-Stadt
  {:db/ident   :lcc-3166-2-ch/Basel-Stadt,
   :owl/sameAs :lcc-3166-2-ch/CH-BS-Subdivision,
   :rdf/type   :owl/NamedIndividual})

(def Bern
  {:db/ident   :lcc-3166-2-ch/Bern,
   :owl/sameAs :lcc-3166-2-ch/CH-BE-Subdivision,
   :rdf/type   :owl/NamedIndividual})

(def CH-153-RegionKind
  {:db/ident :lcc-3166-2-ch/CH-153-RegionKind,
   :rdf/type #{:lcc-cr/GeographicRegionKind :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"},
   :rdfs/label #{{:rdf/language "rm",
                  :rdf/value    "chantun"}
                 {:rdf/language "fr",
                  :rdf/value    "canton"}
                 {:rdf/language "de",
                  :rdf/value    "Kanton"}
                 {:rdf/language "it",
                  :rdf/value    "cantone"}},
   :skos/definition
   "subdivision category Kanton in the country of Switzerland"})

(def CH-AG
  {:db/ident   :lcc-3166-2-ch/CH-AG,
   :owl/sameAs :lcc-3166-2-ch/CH-AG-RegionIdentifier,
   :rdf/type   :owl/NamedIndividual})

(def CH-AG-RegionIdentifier
  {:db/ident :lcc-3166-2-ch/CH-AG-RegionIdentifier,
   :lcc-lr/denotes :lcc-3166-2-ch/CH-AG-Subdivision,
   :lcc-lr/hasTag "CH-AG",
   :lcc-lr/identifies :lcc-3166-2-ch/CH-AG-Subdivision,
   :lcc-lr/isMemberOf :lcc-3166-2/ISO3166-2-CodeSet,
   :rdf/type #{:lcc-cr/GeographicRegionIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"},
   :rdfs/label "CH-AG",
   :skos/definition
   "subdivision code for the Kanton of Aargau in the country of Switzerland"})

(def CH-AG-Subdivision
  {:db/ident :lcc-3166-2-ch/CH-AG-Subdivision,
   :lcc-cr/hasLocalShortName {:rdf/language "de",
                              :rdf/value    "Aargau"},
   :lcc-cr/isClassifiedBy :lcc-3166-2-ch/CH-153-RegionKind,
   :lcc-cr/isSubregionOf :lcc-3166-1/Switzerland,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/CountrySubdivision},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"},
   :rdfs/label {:rdf/language "de",
                :rdf/value    "Aargau"},
   :skos/definition "the Kanton of Aargau in the country of Switzerland"})

(def CH-AI
  {:db/ident   :lcc-3166-2-ch/CH-AI,
   :owl/sameAs :lcc-3166-2-ch/CH-AI-RegionIdentifier,
   :rdf/type   :owl/NamedIndividual})

(def CH-AI-RegionIdentifier
  {:db/ident :lcc-3166-2-ch/CH-AI-RegionIdentifier,
   :lcc-lr/denotes :lcc-3166-2-ch/CH-AI-Subdivision,
   :lcc-lr/hasTag "CH-AI",
   :lcc-lr/identifies :lcc-3166-2-ch/CH-AI-Subdivision,
   :lcc-lr/isMemberOf :lcc-3166-2/ISO3166-2-CodeSet,
   :rdf/type #{:lcc-cr/GeographicRegionIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"},
   :rdfs/label "CH-AI",
   :skos/definition
   "subdivision code for the Kanton of Appenzell Innerrhoden in the country of Switzerland"})

(def CH-AI-Subdivision
  {:db/ident :lcc-3166-2-ch/CH-AI-Subdivision,
   :lcc-cr/hasLocalShortName {:rdf/language "de",
                              :rdf/value    "Appenzell Innerrhoden"},
   :lcc-cr/isClassifiedBy :lcc-3166-2-ch/CH-153-RegionKind,
   :lcc-cr/isSubregionOf :lcc-3166-1/Switzerland,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/CountrySubdivision},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"},
   :rdfs/label {:rdf/language "de",
                :rdf/value    "Appenzell Innerrhoden"},
   :skos/definition
   "the Kanton of Appenzell Innerrhoden in the country of Switzerland"})

(def CH-AR
  {:db/ident   :lcc-3166-2-ch/CH-AR,
   :owl/sameAs :lcc-3166-2-ch/CH-AR-RegionIdentifier,
   :rdf/type   :owl/NamedIndividual})

(def CH-AR-RegionIdentifier
  {:db/ident :lcc-3166-2-ch/CH-AR-RegionIdentifier,
   :lcc-lr/denotes :lcc-3166-2-ch/CH-AR-Subdivision,
   :lcc-lr/hasTag "CH-AR",
   :lcc-lr/identifies :lcc-3166-2-ch/CH-AR-Subdivision,
   :lcc-lr/isMemberOf :lcc-3166-2/ISO3166-2-CodeSet,
   :rdf/type #{:lcc-cr/GeographicRegionIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"},
   :rdfs/label "CH-AR",
   :skos/definition
   "subdivision code for the Kanton of Appenzell Ausserrhoden in the country of Switzerland"})

(def CH-AR-Subdivision
  {:db/ident :lcc-3166-2-ch/CH-AR-Subdivision,
   :lcc-cr/hasLocalShortName {:rdf/language "de",
                              :rdf/value    "Appenzell Ausserrhoden"},
   :lcc-cr/isClassifiedBy :lcc-3166-2-ch/CH-153-RegionKind,
   :lcc-cr/isSubregionOf :lcc-3166-1/Switzerland,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/CountrySubdivision},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"},
   :rdfs/label {:rdf/language "de",
                :rdf/value    "Appenzell Ausserrhoden"},
   :skos/definition
   "the Kanton of Appenzell Ausserrhoden in the country of Switzerland"})

(def CH-BE
  {:db/ident   :lcc-3166-2-ch/CH-BE,
   :owl/sameAs :lcc-3166-2-ch/CH-BE-RegionIdentifier,
   :rdf/type   :owl/NamedIndividual})

(def CH-BE-RegionIdentifier
  {:db/ident :lcc-3166-2-ch/CH-BE-RegionIdentifier,
   :lcc-lr/denotes :lcc-3166-2-ch/CH-BE-Subdivision,
   :lcc-lr/hasTag "CH-BE",
   :lcc-lr/identifies :lcc-3166-2-ch/CH-BE-Subdivision,
   :lcc-lr/isMemberOf :lcc-3166-2/ISO3166-2-CodeSet,
   :rdf/type #{:lcc-cr/GeographicRegionIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"},
   :rdfs/label "CH-BE",
   :skos/definition
   "subdivision code for the Kanton of Bern in the country of Switzerland"})

(def CH-BE-Subdivision
  {:db/ident :lcc-3166-2-ch/CH-BE-Subdivision,
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Berne"},
   :lcc-cr/hasLocalShortName {:rdf/language "de",
                              :rdf/value    "Bern"},
   :lcc-cr/isClassifiedBy :lcc-3166-2-ch/CH-153-RegionKind,
   :lcc-cr/isSubregionOf :lcc-3166-1/Switzerland,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/CountrySubdivision},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"},
   :rdfs/label #{{:rdf/language "de",
                  :rdf/value    "Bern"}
                 {:rdf/language "fr",
                  :rdf/value    "Berne"}},
   :skos/definition "the Kanton of Bern in the country of Switzerland"})

(def CH-BL
  {:db/ident   :lcc-3166-2-ch/CH-BL,
   :owl/sameAs :lcc-3166-2-ch/CH-BL-RegionIdentifier,
   :rdf/type   :owl/NamedIndividual})

(def CH-BL-RegionIdentifier
  {:db/ident :lcc-3166-2-ch/CH-BL-RegionIdentifier,
   :lcc-lr/denotes :lcc-3166-2-ch/CH-BL-Subdivision,
   :lcc-lr/hasTag "CH-BL",
   :lcc-lr/identifies :lcc-3166-2-ch/CH-BL-Subdivision,
   :lcc-lr/isMemberOf :lcc-3166-2/ISO3166-2-CodeSet,
   :rdf/type #{:lcc-cr/GeographicRegionIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"},
   :rdfs/label "CH-BL",
   :skos/definition
   "subdivision code for the Kanton of Basel-Landschaft in the country of Switzerland"})

(def CH-BL-Subdivision
  {:db/ident :lcc-3166-2-ch/CH-BL-Subdivision,
   :lcc-cr/hasLocalShortName {:rdf/language "de",
                              :rdf/value    "Basel-Landschaft"},
   :lcc-cr/isClassifiedBy :lcc-3166-2-ch/CH-153-RegionKind,
   :lcc-cr/isSubregionOf :lcc-3166-1/Switzerland,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/CountrySubdivision},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"},
   :rdfs/label {:rdf/language "de",
                :rdf/value    "Basel-Landschaft"},
   :skos/definition
   "the Kanton of Basel-Landschaft in the country of Switzerland"})

(def CH-BS
  {:db/ident   :lcc-3166-2-ch/CH-BS,
   :owl/sameAs :lcc-3166-2-ch/CH-BS-RegionIdentifier,
   :rdf/type   :owl/NamedIndividual})

(def CH-BS-RegionIdentifier
  {:db/ident :lcc-3166-2-ch/CH-BS-RegionIdentifier,
   :lcc-lr/denotes :lcc-3166-2-ch/CH-BS-Subdivision,
   :lcc-lr/hasTag "CH-BS",
   :lcc-lr/identifies :lcc-3166-2-ch/CH-BS-Subdivision,
   :lcc-lr/isMemberOf :lcc-3166-2/ISO3166-2-CodeSet,
   :rdf/type #{:lcc-cr/GeographicRegionIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"},
   :rdfs/label "CH-BS",
   :skos/definition
   "subdivision code for the Kanton of Basel-Stadt in the country of Switzerland"})

(def CH-BS-Subdivision
  {:db/ident :lcc-3166-2-ch/CH-BS-Subdivision,
   :lcc-cr/hasLocalShortName {:rdf/language "de",
                              :rdf/value    "Basel-Stadt"},
   :lcc-cr/isClassifiedBy :lcc-3166-2-ch/CH-153-RegionKind,
   :lcc-cr/isSubregionOf :lcc-3166-1/Switzerland,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/CountrySubdivision},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"},
   :rdfs/label {:rdf/language "de",
                :rdf/value    "Basel-Stadt"},
   :skos/definition "the Kanton of Basel-Stadt in the country of Switzerland"})

(def CH-FR
  {:db/ident   :lcc-3166-2-ch/CH-FR,
   :owl/sameAs :lcc-3166-2-ch/CH-FR-RegionIdentifier,
   :rdf/type   :owl/NamedIndividual})

(def CH-FR-RegionIdentifier
  {:db/ident :lcc-3166-2-ch/CH-FR-RegionIdentifier,
   :lcc-lr/denotes :lcc-3166-2-ch/CH-FR-Subdivision,
   :lcc-lr/hasTag "CH-FR",
   :lcc-lr/identifies :lcc-3166-2-ch/CH-FR-Subdivision,
   :lcc-lr/isMemberOf :lcc-3166-2/ISO3166-2-CodeSet,
   :rdf/type #{:lcc-cr/GeographicRegionIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"},
   :rdfs/label "CH-FR",
   :skos/definition
   "subdivision code for the Kanton of Freiburg in the country of Switzerland"})

(def CH-FR-Subdivision
  {:db/ident :lcc-3166-2-ch/CH-FR-Subdivision,
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Fribourg"},
   :lcc-cr/hasLocalShortName {:rdf/language "de",
                              :rdf/value    "Freiburg"},
   :lcc-cr/isClassifiedBy :lcc-3166-2-ch/CH-153-RegionKind,
   :lcc-cr/isSubregionOf :lcc-3166-1/Switzerland,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/CountrySubdivision},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"},
   :rdfs/label #{{:rdf/language "de",
                  :rdf/value    "Freiburg"}
                 {:rdf/language "fr",
                  :rdf/value    "Fribourg"}},
   :skos/definition "the Kanton of Freiburg in the country of Switzerland"})

(def CH-GE
  {:db/ident   :lcc-3166-2-ch/CH-GE,
   :owl/sameAs :lcc-3166-2-ch/CH-GE-RegionIdentifier,
   :rdf/type   :owl/NamedIndividual})

(def CH-GE-RegionIdentifier
  {:db/ident :lcc-3166-2-ch/CH-GE-RegionIdentifier,
   :lcc-lr/denotes :lcc-3166-2-ch/CH-GE-Subdivision,
   :lcc-lr/hasTag "CH-GE",
   :lcc-lr/identifies :lcc-3166-2-ch/CH-GE-Subdivision,
   :lcc-lr/isMemberOf :lcc-3166-2/ISO3166-2-CodeSet,
   :rdf/type #{:lcc-cr/GeographicRegionIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"},
   :rdfs/label "CH-GE",
   :skos/definition
   "subdivision code for the Kanton of Genève in the country of Switzerland"})

(def CH-GE-Subdivision
  {:db/ident :lcc-3166-2-ch/CH-GE-Subdivision,
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Genève"},
   :lcc-cr/isClassifiedBy :lcc-3166-2-ch/CH-153-RegionKind,
   :lcc-cr/isSubregionOf :lcc-3166-1/Switzerland,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/CountrySubdivision},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"},
   :rdfs/label {:rdf/language "fr",
                :rdf/value    "Genève"},
   :skos/definition "the Kanton of Genève in the country of Switzerland"})

(def CH-GL
  {:db/ident   :lcc-3166-2-ch/CH-GL,
   :owl/sameAs :lcc-3166-2-ch/CH-GL-RegionIdentifier,
   :rdf/type   :owl/NamedIndividual})

(def CH-GL-RegionIdentifier
  {:db/ident :lcc-3166-2-ch/CH-GL-RegionIdentifier,
   :lcc-lr/denotes :lcc-3166-2-ch/CH-GL-Subdivision,
   :lcc-lr/hasTag "CH-GL",
   :lcc-lr/identifies :lcc-3166-2-ch/CH-GL-Subdivision,
   :lcc-lr/isMemberOf :lcc-3166-2/ISO3166-2-CodeSet,
   :rdf/type #{:lcc-cr/GeographicRegionIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"},
   :rdfs/label "CH-GL",
   :skos/definition
   "subdivision code for the Kanton of Glarus in the country of Switzerland"})

(def CH-GL-Subdivision
  {:db/ident :lcc-3166-2-ch/CH-GL-Subdivision,
   :lcc-cr/hasLocalShortName {:rdf/language "de",
                              :rdf/value    "Glarus"},
   :lcc-cr/isClassifiedBy :lcc-3166-2-ch/CH-153-RegionKind,
   :lcc-cr/isSubregionOf :lcc-3166-1/Switzerland,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/CountrySubdivision},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"},
   :rdfs/label {:rdf/language "de",
                :rdf/value    "Glarus"},
   :skos/definition "the Kanton of Glarus in the country of Switzerland"})

(def CH-GR
  {:db/ident   :lcc-3166-2-ch/CH-GR,
   :owl/sameAs :lcc-3166-2-ch/CH-GR-RegionIdentifier,
   :rdf/type   :owl/NamedIndividual})

(def CH-GR-RegionIdentifier
  {:db/ident :lcc-3166-2-ch/CH-GR-RegionIdentifier,
   :lcc-lr/denotes :lcc-3166-2-ch/CH-GR-Subdivision,
   :lcc-lr/hasTag "CH-GR",
   :lcc-lr/identifies :lcc-3166-2-ch/CH-GR-Subdivision,
   :lcc-lr/isMemberOf :lcc-3166-2/ISO3166-2-CodeSet,
   :rdf/type #{:lcc-cr/GeographicRegionIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"},
   :rdfs/label "CH-GR",
   :skos/definition
   "subdivision code for the Kanton of Graubünden in the country of Switzerland"})

(def CH-GR-Subdivision
  {:db/ident :lcc-3166-2-ch/CH-GR-Subdivision,
   :lcc-cr/hasLocalShortName #{{:rdf/language "it",
                                :rdf/value    "Grigioni"}
                               {:rdf/language "de",
                                :rdf/value    "Graubünden"}
                               {:rdf/language "rm",
                                :rdf/value    "Grischun"}},
   :lcc-cr/isClassifiedBy :lcc-3166-2-ch/CH-153-RegionKind,
   :lcc-cr/isSubregionOf :lcc-3166-1/Switzerland,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/CountrySubdivision},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"},
   :rdfs/label #{{:rdf/language "it",
                  :rdf/value    "Grigioni"}
                 {:rdf/language "de",
                  :rdf/value    "Graubünden"}
                 {:rdf/language "rm",
                  :rdf/value    "Grischun"}},
   :skos/definition "the Kanton of Graubünden in the country of Switzerland"})

(def CH-JU
  {:db/ident   :lcc-3166-2-ch/CH-JU,
   :owl/sameAs :lcc-3166-2-ch/CH-JU-RegionIdentifier,
   :rdf/type   :owl/NamedIndividual})

(def CH-JU-RegionIdentifier
  {:db/ident :lcc-3166-2-ch/CH-JU-RegionIdentifier,
   :lcc-lr/denotes :lcc-3166-2-ch/CH-JU-Subdivision,
   :lcc-lr/hasTag "CH-JU",
   :lcc-lr/identifies :lcc-3166-2-ch/CH-JU-Subdivision,
   :lcc-lr/isMemberOf :lcc-3166-2/ISO3166-2-CodeSet,
   :rdf/type #{:lcc-cr/GeographicRegionIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"},
   :rdfs/label "CH-JU",
   :skos/definition
   "subdivision code for the Kanton of Jura in the country of Switzerland"})

(def CH-JU-Subdivision
  {:db/ident :lcc-3166-2-ch/CH-JU-Subdivision,
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Jura"},
   :lcc-cr/isClassifiedBy :lcc-3166-2-ch/CH-153-RegionKind,
   :lcc-cr/isSubregionOf :lcc-3166-1/Switzerland,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/CountrySubdivision},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"},
   :rdfs/label {:rdf/language "fr",
                :rdf/value    "Jura"},
   :skos/definition "the Kanton of Jura in the country of Switzerland"})

(def CH-LU
  {:db/ident   :lcc-3166-2-ch/CH-LU,
   :owl/sameAs :lcc-3166-2-ch/CH-LU-RegionIdentifier,
   :rdf/type   :owl/NamedIndividual})

(def CH-LU-RegionIdentifier
  {:db/ident :lcc-3166-2-ch/CH-LU-RegionIdentifier,
   :lcc-lr/denotes :lcc-3166-2-ch/CH-LU-Subdivision,
   :lcc-lr/hasTag "CH-LU",
   :lcc-lr/identifies :lcc-3166-2-ch/CH-LU-Subdivision,
   :lcc-lr/isMemberOf :lcc-3166-2/ISO3166-2-CodeSet,
   :rdf/type #{:lcc-cr/GeographicRegionIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"},
   :rdfs/label "CH-LU",
   :skos/definition
   "subdivision code for the Kanton of Luzern in the country of Switzerland"})

(def CH-LU-Subdivision
  {:db/ident :lcc-3166-2-ch/CH-LU-Subdivision,
   :lcc-cr/hasLocalShortName {:rdf/language "de",
                              :rdf/value    "Luzern"},
   :lcc-cr/isClassifiedBy :lcc-3166-2-ch/CH-153-RegionKind,
   :lcc-cr/isSubregionOf :lcc-3166-1/Switzerland,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/CountrySubdivision},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"},
   :rdfs/label {:rdf/language "de",
                :rdf/value    "Luzern"},
   :skos/definition "the Kanton of Luzern in the country of Switzerland"})

(def CH-NE
  {:db/ident   :lcc-3166-2-ch/CH-NE,
   :owl/sameAs :lcc-3166-2-ch/CH-NE-RegionIdentifier,
   :rdf/type   :owl/NamedIndividual})

(def CH-NE-RegionIdentifier
  {:db/ident :lcc-3166-2-ch/CH-NE-RegionIdentifier,
   :lcc-lr/denotes :lcc-3166-2-ch/CH-NE-Subdivision,
   :lcc-lr/hasTag "CH-NE",
   :lcc-lr/identifies :lcc-3166-2-ch/CH-NE-Subdivision,
   :lcc-lr/isMemberOf :lcc-3166-2/ISO3166-2-CodeSet,
   :rdf/type #{:lcc-cr/GeographicRegionIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"},
   :rdfs/label "CH-NE",
   :skos/definition
   "subdivision code for the Kanton of Neuchâtel in the country of Switzerland"})

(def CH-NE-Subdivision
  {:db/ident :lcc-3166-2-ch/CH-NE-Subdivision,
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Neuchâtel"},
   :lcc-cr/isClassifiedBy :lcc-3166-2-ch/CH-153-RegionKind,
   :lcc-cr/isSubregionOf :lcc-3166-1/Switzerland,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/CountrySubdivision},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"},
   :rdfs/label {:rdf/language "fr",
                :rdf/value    "Neuchâtel"},
   :skos/definition "the Kanton of Neuchâtel in the country of Switzerland"})

(def CH-NW
  {:db/ident   :lcc-3166-2-ch/CH-NW,
   :owl/sameAs :lcc-3166-2-ch/CH-NW-RegionIdentifier,
   :rdf/type   :owl/NamedIndividual})

(def CH-NW-RegionIdentifier
  {:db/ident :lcc-3166-2-ch/CH-NW-RegionIdentifier,
   :lcc-lr/denotes :lcc-3166-2-ch/CH-NW-Subdivision,
   :lcc-lr/hasTag "CH-NW",
   :lcc-lr/identifies :lcc-3166-2-ch/CH-NW-Subdivision,
   :lcc-lr/isMemberOf :lcc-3166-2/ISO3166-2-CodeSet,
   :rdf/type #{:lcc-cr/GeographicRegionIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"},
   :rdfs/label "CH-NW",
   :skos/definition
   "subdivision code for the Kanton of Nidwalden in the country of Switzerland"})

(def CH-NW-Subdivision
  {:db/ident :lcc-3166-2-ch/CH-NW-Subdivision,
   :lcc-cr/hasLocalShortName {:rdf/language "de",
                              :rdf/value    "Nidwalden"},
   :lcc-cr/isClassifiedBy :lcc-3166-2-ch/CH-153-RegionKind,
   :lcc-cr/isSubregionOf :lcc-3166-1/Switzerland,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/CountrySubdivision},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"},
   :rdfs/label {:rdf/language "de",
                :rdf/value    "Nidwalden"},
   :skos/definition "the Kanton of Nidwalden in the country of Switzerland"})

(def CH-OW
  {:db/ident   :lcc-3166-2-ch/CH-OW,
   :owl/sameAs :lcc-3166-2-ch/CH-OW-RegionIdentifier,
   :rdf/type   :owl/NamedIndividual})

(def CH-OW-RegionIdentifier
  {:db/ident :lcc-3166-2-ch/CH-OW-RegionIdentifier,
   :lcc-lr/denotes :lcc-3166-2-ch/CH-OW-Subdivision,
   :lcc-lr/hasTag "CH-OW",
   :lcc-lr/identifies :lcc-3166-2-ch/CH-OW-Subdivision,
   :lcc-lr/isMemberOf :lcc-3166-2/ISO3166-2-CodeSet,
   :rdf/type #{:lcc-cr/GeographicRegionIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"},
   :rdfs/label "CH-OW",
   :skos/definition
   "subdivision code for the Kanton of Obwalden in the country of Switzerland"})

(def CH-OW-Subdivision
  {:db/ident :lcc-3166-2-ch/CH-OW-Subdivision,
   :lcc-cr/hasLocalShortName {:rdf/language "de",
                              :rdf/value    "Obwalden"},
   :lcc-cr/isClassifiedBy :lcc-3166-2-ch/CH-153-RegionKind,
   :lcc-cr/isSubregionOf :lcc-3166-1/Switzerland,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/CountrySubdivision},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"},
   :rdfs/label {:rdf/language "de",
                :rdf/value    "Obwalden"},
   :skos/definition "the Kanton of Obwalden in the country of Switzerland"})

(def CH-SG
  {:db/ident   :lcc-3166-2-ch/CH-SG,
   :owl/sameAs :lcc-3166-2-ch/CH-SG-RegionIdentifier,
   :rdf/type   :owl/NamedIndividual})

(def CH-SG-RegionIdentifier
  {:db/ident :lcc-3166-2-ch/CH-SG-RegionIdentifier,
   :lcc-lr/denotes :lcc-3166-2-ch/CH-SG-Subdivision,
   :lcc-lr/hasTag "CH-SG",
   :lcc-lr/identifies :lcc-3166-2-ch/CH-SG-Subdivision,
   :lcc-lr/isMemberOf :lcc-3166-2/ISO3166-2-CodeSet,
   :rdf/type #{:lcc-cr/GeographicRegionIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"},
   :rdfs/label "CH-SG",
   :skos/definition
   "subdivision code for the Kanton of Sankt Gallen in the country of Switzerland"})

(def CH-SG-Subdivision
  {:db/ident :lcc-3166-2-ch/CH-SG-Subdivision,
   :lcc-cr/hasLocalShortName {:rdf/language "de",
                              :rdf/value    "Sankt Gallen"},
   :lcc-cr/isClassifiedBy :lcc-3166-2-ch/CH-153-RegionKind,
   :lcc-cr/isSubregionOf :lcc-3166-1/Switzerland,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/CountrySubdivision},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"},
   :rdfs/label {:rdf/language "de",
                :rdf/value    "Sankt Gallen"},
   :skos/definition "the Kanton of Sankt Gallen in the country of Switzerland"})

(def CH-SH
  {:db/ident   :lcc-3166-2-ch/CH-SH,
   :owl/sameAs :lcc-3166-2-ch/CH-SH-RegionIdentifier,
   :rdf/type   :owl/NamedIndividual})

(def CH-SH-RegionIdentifier
  {:db/ident :lcc-3166-2-ch/CH-SH-RegionIdentifier,
   :lcc-lr/denotes :lcc-3166-2-ch/CH-SH-Subdivision,
   :lcc-lr/hasTag "CH-SH",
   :lcc-lr/identifies :lcc-3166-2-ch/CH-SH-Subdivision,
   :lcc-lr/isMemberOf :lcc-3166-2/ISO3166-2-CodeSet,
   :rdf/type #{:lcc-cr/GeographicRegionIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"},
   :rdfs/label "CH-SH",
   :skos/definition
   "subdivision code for the Kanton of Schaffhausen in the country of Switzerland"})

(def CH-SH-Subdivision
  {:db/ident :lcc-3166-2-ch/CH-SH-Subdivision,
   :lcc-cr/hasLocalShortName {:rdf/language "de",
                              :rdf/value    "Schaffhausen"},
   :lcc-cr/isClassifiedBy :lcc-3166-2-ch/CH-153-RegionKind,
   :lcc-cr/isSubregionOf :lcc-3166-1/Switzerland,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/CountrySubdivision},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"},
   :rdfs/label {:rdf/language "de",
                :rdf/value    "Schaffhausen"},
   :skos/definition "the Kanton of Schaffhausen in the country of Switzerland"})

(def CH-SO
  {:db/ident   :lcc-3166-2-ch/CH-SO,
   :owl/sameAs :lcc-3166-2-ch/CH-SO-RegionIdentifier,
   :rdf/type   :owl/NamedIndividual})

(def CH-SO-RegionIdentifier
  {:db/ident :lcc-3166-2-ch/CH-SO-RegionIdentifier,
   :lcc-lr/denotes :lcc-3166-2-ch/CH-SO-Subdivision,
   :lcc-lr/hasTag "CH-SO",
   :lcc-lr/identifies :lcc-3166-2-ch/CH-SO-Subdivision,
   :lcc-lr/isMemberOf :lcc-3166-2/ISO3166-2-CodeSet,
   :rdf/type #{:lcc-cr/GeographicRegionIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"},
   :rdfs/label "CH-SO",
   :skos/definition
   "subdivision code for the Kanton of Solothurn in the country of Switzerland"})

(def CH-SO-Subdivision
  {:db/ident :lcc-3166-2-ch/CH-SO-Subdivision,
   :lcc-cr/hasLocalShortName {:rdf/language "de",
                              :rdf/value    "Solothurn"},
   :lcc-cr/isClassifiedBy :lcc-3166-2-ch/CH-153-RegionKind,
   :lcc-cr/isSubregionOf :lcc-3166-1/Switzerland,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/CountrySubdivision},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"},
   :rdfs/label {:rdf/language "de",
                :rdf/value    "Solothurn"},
   :skos/definition "the Kanton of Solothurn in the country of Switzerland"})

(def CH-SZ
  {:db/ident   :lcc-3166-2-ch/CH-SZ,
   :owl/sameAs :lcc-3166-2-ch/CH-SZ-RegionIdentifier,
   :rdf/type   :owl/NamedIndividual})

(def CH-SZ-RegionIdentifier
  {:db/ident :lcc-3166-2-ch/CH-SZ-RegionIdentifier,
   :lcc-lr/denotes :lcc-3166-2-ch/CH-SZ-Subdivision,
   :lcc-lr/hasTag "CH-SZ",
   :lcc-lr/identifies :lcc-3166-2-ch/CH-SZ-Subdivision,
   :lcc-lr/isMemberOf :lcc-3166-2/ISO3166-2-CodeSet,
   :rdf/type #{:lcc-cr/GeographicRegionIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"},
   :rdfs/label "CH-SZ",
   :skos/definition
   "subdivision code for the Kanton of Schwyz in the country of Switzerland"})

(def CH-SZ-Subdivision
  {:db/ident :lcc-3166-2-ch/CH-SZ-Subdivision,
   :lcc-cr/hasLocalShortName {:rdf/language "de",
                              :rdf/value    "Schwyz"},
   :lcc-cr/isClassifiedBy :lcc-3166-2-ch/CH-153-RegionKind,
   :lcc-cr/isSubregionOf :lcc-3166-1/Switzerland,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/CountrySubdivision},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"},
   :rdfs/label {:rdf/language "de",
                :rdf/value    "Schwyz"},
   :skos/definition "the Kanton of Schwyz in the country of Switzerland"})

(def CH-TG
  {:db/ident   :lcc-3166-2-ch/CH-TG,
   :owl/sameAs :lcc-3166-2-ch/CH-TG-RegionIdentifier,
   :rdf/type   :owl/NamedIndividual})

(def CH-TG-RegionIdentifier
  {:db/ident :lcc-3166-2-ch/CH-TG-RegionIdentifier,
   :lcc-lr/denotes :lcc-3166-2-ch/CH-TG-Subdivision,
   :lcc-lr/hasTag "CH-TG",
   :lcc-lr/identifies :lcc-3166-2-ch/CH-TG-Subdivision,
   :lcc-lr/isMemberOf :lcc-3166-2/ISO3166-2-CodeSet,
   :rdf/type #{:lcc-cr/GeographicRegionIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"},
   :rdfs/label "CH-TG",
   :skos/definition
   "subdivision code for the Kanton of Thurgau in the country of Switzerland"})

(def CH-TG-Subdivision
  {:db/ident :lcc-3166-2-ch/CH-TG-Subdivision,
   :lcc-cr/hasLocalShortName {:rdf/language "de",
                              :rdf/value    "Thurgau"},
   :lcc-cr/isClassifiedBy :lcc-3166-2-ch/CH-153-RegionKind,
   :lcc-cr/isSubregionOf :lcc-3166-1/Switzerland,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/CountrySubdivision},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"},
   :rdfs/label {:rdf/language "de",
                :rdf/value    "Thurgau"},
   :skos/definition "the Kanton of Thurgau in the country of Switzerland"})

(def CH-TI
  {:db/ident   :lcc-3166-2-ch/CH-TI,
   :owl/sameAs :lcc-3166-2-ch/CH-TI-RegionIdentifier,
   :rdf/type   :owl/NamedIndividual})

(def CH-TI-RegionIdentifier
  {:db/ident :lcc-3166-2-ch/CH-TI-RegionIdentifier,
   :lcc-lr/denotes :lcc-3166-2-ch/CH-TI-Subdivision,
   :lcc-lr/hasTag "CH-TI",
   :lcc-lr/identifies :lcc-3166-2-ch/CH-TI-Subdivision,
   :lcc-lr/isMemberOf :lcc-3166-2/ISO3166-2-CodeSet,
   :rdf/type #{:lcc-cr/GeographicRegionIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"},
   :rdfs/label "CH-TI",
   :skos/definition
   "subdivision code for the Kanton of Ticino in the country of Switzerland"})

(def CH-TI-Subdivision
  {:db/ident :lcc-3166-2-ch/CH-TI-Subdivision,
   :lcc-cr/hasLocalShortName {:rdf/language "it",
                              :rdf/value    "Ticino"},
   :lcc-cr/isClassifiedBy :lcc-3166-2-ch/CH-153-RegionKind,
   :lcc-cr/isSubregionOf :lcc-3166-1/Switzerland,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/CountrySubdivision},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"},
   :rdfs/label {:rdf/language "it",
                :rdf/value    "Ticino"},
   :skos/definition "the Kanton of Ticino in the country of Switzerland"})

(def CH-UR
  {:db/ident   :lcc-3166-2-ch/CH-UR,
   :owl/sameAs :lcc-3166-2-ch/CH-UR-RegionIdentifier,
   :rdf/type   :owl/NamedIndividual})

(def CH-UR-RegionIdentifier
  {:db/ident :lcc-3166-2-ch/CH-UR-RegionIdentifier,
   :lcc-lr/denotes :lcc-3166-2-ch/CH-UR-Subdivision,
   :lcc-lr/hasTag "CH-UR",
   :lcc-lr/identifies :lcc-3166-2-ch/CH-UR-Subdivision,
   :lcc-lr/isMemberOf :lcc-3166-2/ISO3166-2-CodeSet,
   :rdf/type #{:lcc-cr/GeographicRegionIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"},
   :rdfs/label "CH-UR",
   :skos/definition
   "subdivision code for the Kanton of Uri in the country of Switzerland"})

(def CH-UR-Subdivision
  {:db/ident :lcc-3166-2-ch/CH-UR-Subdivision,
   :lcc-cr/hasLocalShortName {:rdf/language "de",
                              :rdf/value    "Uri"},
   :lcc-cr/isClassifiedBy :lcc-3166-2-ch/CH-153-RegionKind,
   :lcc-cr/isSubregionOf :lcc-3166-1/Switzerland,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/CountrySubdivision},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"},
   :rdfs/label {:rdf/language "de",
                :rdf/value    "Uri"},
   :skos/definition "the Kanton of Uri in the country of Switzerland"})

(def CH-VD
  {:db/ident   :lcc-3166-2-ch/CH-VD,
   :owl/sameAs :lcc-3166-2-ch/CH-VD-RegionIdentifier,
   :rdf/type   :owl/NamedIndividual})

(def CH-VD-RegionIdentifier
  {:db/ident :lcc-3166-2-ch/CH-VD-RegionIdentifier,
   :lcc-lr/denotes :lcc-3166-2-ch/CH-VD-Subdivision,
   :lcc-lr/hasTag "CH-VD",
   :lcc-lr/identifies :lcc-3166-2-ch/CH-VD-Subdivision,
   :lcc-lr/isMemberOf :lcc-3166-2/ISO3166-2-CodeSet,
   :rdf/type #{:lcc-cr/GeographicRegionIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"},
   :rdfs/label "CH-VD",
   :skos/definition
   "subdivision code for the Kanton of Vaud in the country of Switzerland"})

(def CH-VD-Subdivision
  {:db/ident :lcc-3166-2-ch/CH-VD-Subdivision,
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Vaud"},
   :lcc-cr/isClassifiedBy :lcc-3166-2-ch/CH-153-RegionKind,
   :lcc-cr/isSubregionOf :lcc-3166-1/Switzerland,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/CountrySubdivision},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"},
   :rdfs/label {:rdf/language "fr",
                :rdf/value    "Vaud"},
   :skos/definition "the Kanton of Vaud in the country of Switzerland"})

(def CH-VS
  {:db/ident   :lcc-3166-2-ch/CH-VS,
   :owl/sameAs :lcc-3166-2-ch/CH-VS-RegionIdentifier,
   :rdf/type   :owl/NamedIndividual})

(def CH-VS-RegionIdentifier
  {:db/ident :lcc-3166-2-ch/CH-VS-RegionIdentifier,
   :lcc-lr/denotes :lcc-3166-2-ch/CH-VS-Subdivision,
   :lcc-lr/hasTag "CH-VS",
   :lcc-lr/identifies :lcc-3166-2-ch/CH-VS-Subdivision,
   :lcc-lr/isMemberOf :lcc-3166-2/ISO3166-2-CodeSet,
   :rdf/type #{:lcc-cr/GeographicRegionIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"},
   :rdfs/label "CH-VS",
   :skos/definition
   "subdivision code for the Kanton of Wallis in the country of Switzerland"})

(def CH-VS-Subdivision
  {:db/ident :lcc-3166-2-ch/CH-VS-Subdivision,
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Valais"},
   :lcc-cr/hasLocalShortName {:rdf/language "de",
                              :rdf/value    "Wallis"},
   :lcc-cr/isClassifiedBy :lcc-3166-2-ch/CH-153-RegionKind,
   :lcc-cr/isSubregionOf :lcc-3166-1/Switzerland,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/CountrySubdivision},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"},
   :rdfs/label #{{:rdf/language "fr",
                  :rdf/value    "Valais"}
                 {:rdf/language "de",
                  :rdf/value    "Wallis"}},
   :skos/definition "the Kanton of Wallis in the country of Switzerland"})

(def CH-ZG
  {:db/ident   :lcc-3166-2-ch/CH-ZG,
   :owl/sameAs :lcc-3166-2-ch/CH-ZG-RegionIdentifier,
   :rdf/type   :owl/NamedIndividual})

(def CH-ZG-RegionIdentifier
  {:db/ident :lcc-3166-2-ch/CH-ZG-RegionIdentifier,
   :lcc-lr/denotes :lcc-3166-2-ch/CH-ZG-Subdivision,
   :lcc-lr/hasTag "CH-ZG",
   :lcc-lr/identifies :lcc-3166-2-ch/CH-ZG-Subdivision,
   :lcc-lr/isMemberOf :lcc-3166-2/ISO3166-2-CodeSet,
   :rdf/type #{:lcc-cr/GeographicRegionIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"},
   :rdfs/label "CH-ZG",
   :skos/definition
   "subdivision code for the Kanton of Zug in the country of Switzerland"})

(def CH-ZG-Subdivision
  {:db/ident :lcc-3166-2-ch/CH-ZG-Subdivision,
   :lcc-cr/hasLocalShortName {:rdf/language "de",
                              :rdf/value    "Zug"},
   :lcc-cr/isClassifiedBy :lcc-3166-2-ch/CH-153-RegionKind,
   :lcc-cr/isSubregionOf :lcc-3166-1/Switzerland,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/CountrySubdivision},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"},
   :rdfs/label {:rdf/language "de",
                :rdf/value    "Zug"},
   :skos/definition "the Kanton of Zug in the country of Switzerland"})

(def CH-ZH
  {:db/ident   :lcc-3166-2-ch/CH-ZH,
   :owl/sameAs :lcc-3166-2-ch/CH-ZH-RegionIdentifier,
   :rdf/type   :owl/NamedIndividual})

(def CH-ZH-RegionIdentifier
  {:db/ident :lcc-3166-2-ch/CH-ZH-RegionIdentifier,
   :lcc-lr/denotes :lcc-3166-2-ch/CH-ZH-Subdivision,
   :lcc-lr/hasTag "CH-ZH",
   :lcc-lr/identifies :lcc-3166-2-ch/CH-ZH-Subdivision,
   :lcc-lr/isMemberOf :lcc-3166-2/ISO3166-2-CodeSet,
   :rdf/type #{:lcc-cr/GeographicRegionIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"},
   :rdfs/label "CH-ZH",
   :skos/definition
   "subdivision code for the Kanton of Zürich in the country of Switzerland"})

(def CH-ZH-Subdivision
  {:db/ident :lcc-3166-2-ch/CH-ZH-Subdivision,
   :lcc-cr/hasLocalShortName {:rdf/language "de",
                              :rdf/value    "Zürich"},
   :lcc-cr/isClassifiedBy :lcc-3166-2-ch/CH-153-RegionKind,
   :lcc-cr/isSubregionOf :lcc-3166-1/Switzerland,
   :rdf/type #{:owl/NamedIndividual :lcc-cr/CountrySubdivision},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"},
   :rdfs/label {:rdf/language "de",
                :rdf/value    "Zürich"},
   :skos/definition "the Kanton of Zürich in the country of Switzerland"})

(def Freiburg
  {:db/ident   :lcc-3166-2-ch/Freiburg,
   :owl/sameAs :lcc-3166-2-ch/CH-FR-Subdivision,
   :rdf/type   :owl/NamedIndividual})

(def Geneve
  {:db/ident   :lcc-3166-2-ch/Geneve,
   :owl/sameAs :lcc-3166-2-ch/CH-GE-Subdivision,
   :rdf/type   :owl/NamedIndividual})

(def Glarus
  {:db/ident   :lcc-3166-2-ch/Glarus,
   :owl/sameAs :lcc-3166-2-ch/CH-GL-Subdivision,
   :rdf/type   :owl/NamedIndividual})

(def Graubunden
  {:db/ident   :lcc-3166-2-ch/Graubunden,
   :owl/sameAs :lcc-3166-2-ch/CH-GR-Subdivision,
   :rdf/type   :owl/NamedIndividual})

(def Jura
  {:db/ident   :lcc-3166-2-ch/Jura,
   :owl/sameAs :lcc-3166-2-ch/CH-JU-Subdivision,
   :rdf/type   :owl/NamedIndividual})

(def Kanton
  {:db/ident   :lcc-3166-2-ch/Kanton,
   :owl/sameAs :lcc-3166-2-ch/CH-153-RegionKind,
   :rdf/type   :owl/NamedIndividual})

(def Luzern
  {:db/ident   :lcc-3166-2-ch/Luzern,
   :owl/sameAs :lcc-3166-2-ch/CH-LU-Subdivision,
   :rdf/type   :owl/NamedIndividual})

(def Neuchatel
  {:db/ident   :lcc-3166-2-ch/Neuchatel,
   :owl/sameAs :lcc-3166-2-ch/CH-NE-Subdivision,
   :rdf/type   :owl/NamedIndividual})

(def Nidwalden
  {:db/ident   :lcc-3166-2-ch/Nidwalden,
   :owl/sameAs :lcc-3166-2-ch/CH-NW-Subdivision,
   :rdf/type   :owl/NamedIndividual})

(def Obwalden
  {:db/ident   :lcc-3166-2-ch/Obwalden,
   :owl/sameAs :lcc-3166-2-ch/CH-OW-Subdivision,
   :rdf/type   :owl/NamedIndividual})

(def SanktGallen
  {:db/ident   :lcc-3166-2-ch/SanktGallen,
   :owl/sameAs :lcc-3166-2-ch/CH-SG-Subdivision,
   :rdf/type   :owl/NamedIndividual})

(def Schaffhausen
  {:db/ident   :lcc-3166-2-ch/Schaffhausen,
   :owl/sameAs :lcc-3166-2-ch/CH-SH-Subdivision,
   :rdf/type   :owl/NamedIndividual})

(def Schwyz
  {:db/ident   :lcc-3166-2-ch/Schwyz,
   :owl/sameAs :lcc-3166-2-ch/CH-SZ-Subdivision,
   :rdf/type   :owl/NamedIndividual})

(def Solothurn
  {:db/ident   :lcc-3166-2-ch/Solothurn,
   :owl/sameAs :lcc-3166-2-ch/CH-SO-Subdivision,
   :rdf/type   :owl/NamedIndividual})

(def Thurgau
  {:db/ident   :lcc-3166-2-ch/Thurgau,
   :owl/sameAs :lcc-3166-2-ch/CH-TG-Subdivision,
   :rdf/type   :owl/NamedIndividual})

(def Ticino
  {:db/ident   :lcc-3166-2-ch/Ticino,
   :owl/sameAs :lcc-3166-2-ch/CH-TI-Subdivision,
   :rdf/type   :owl/NamedIndividual})

(def Uri
  {:db/ident   :lcc-3166-2-ch/Uri,
   :owl/sameAs :lcc-3166-2-ch/CH-UR-Subdivision,
   :rdf/type   :owl/NamedIndividual})

(def Vaud
  {:db/ident   :lcc-3166-2-ch/Vaud,
   :owl/sameAs :lcc-3166-2-ch/CH-VD-Subdivision,
   :rdf/type   :owl/NamedIndividual})

(def Wallis
  {:db/ident   :lcc-3166-2-ch/Wallis,
   :owl/sameAs :lcc-3166-2-ch/CH-VS-Subdivision,
   :rdf/type   :owl/NamedIndividual})

(def Zug
  {:db/ident   :lcc-3166-2-ch/Zug,
   :owl/sameAs :lcc-3166-2-ch/CH-ZG-Subdivision,
   :rdf/type   :owl/NamedIndividual})

(def Zurich
  {:db/ident   :lcc-3166-2-ch/Zurich,
   :owl/sameAs :lcc-3166-2-ch/CH-ZH-Subdivision,
   :rdf/type   :owl/NamedIndividual})

(def urn:uuid:414f43bb-a603-5b2f-8160-f6d658dbdee6
  {:dcterms/issued #inst "2021-10-29T23:57:18.464-00:00",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :owl/imports
   #{{:xsd/anyURI
      "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-2-SubdivisionCodes/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/20211101/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "ISO 3166-2 Subdivision Codes for Switzerland Ontology",
   :rdfs/seeAlso #{{:xsd/anyURI
                    "https://www.omg.org/spec/LCC/Countries/AboutCountries/"}
                   {:xsd/anyURI "https://www.omg.org/spec/LCC/AboutLCC/"}},
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
      "https://www.omg.org/spec/LCC/Countries/ISO3166-2-SubdivisionCodes/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}},
   :sm/fileAbbreviation "lcc-3166-2-ch",
   :sm/fileAbstract
   "This ontology represents the subset of the ISO 3166 standard that includes the actual ISO 3166-2 subdivision codes for Switzerland, with the ontology and codes for the other parts of the standard represented in models that this ontology depends on.",
   :sm/filename "ISO3166-2-SubdivisionCodes-CH.rdf",
   :xsd/anyURI
   "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"})