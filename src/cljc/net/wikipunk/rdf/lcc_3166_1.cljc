(ns net.wikipunk.rdf.lcc-3166-1
  {:dcterms/issued #inst "2021-10-29T23:57:18.464-00:00",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :namespaces
   {"dcterms" "http://purl.org/dc/terms/",
    "lcc-3166-1"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
    "lcc-639-1"
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
    "lcc-639-2"
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
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
      "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/20211101/Countries/ISO3166-1-CountryCodes/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "lcc-3166-1",
   :rdfa/uri "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ISO 3166-1 Country Codes Ontology",
   :rdfs/seeAlso #{{:xsd/anyURI
                    "https://www.omg.org/spec/LCC/Countries/AboutCountries/"}
                   {:xsd/anyURI "https://www.omg.org/spec/LCC/AboutLCC/"}},
   :skos/changeNote
   #{"The https://www.omg.org/spec/LCC/20190201/Countries/ISO3166-1-CountryCodes.rdf version of this ontology has been revised to reflect the issues addressed by the LCC 1.1 FTF report.  The country codes and related metadata contained herein are current as of the February 2019 revision to the online code set."
     "https://www.omg.org/spec/LCC/20211101/Countries/ISO3166-1-CountryCodes.rdf version of this ontology has been revised to incorporate revisions published by ISO since the LCC 1.1 specification was revised and is current as of 29 October 2021."
     "The https://www.omg.org/spec/LCC/20151101/Countries/ISO3166-1-CountryCodes.rdf version of this ontology has been revised to reflect the issues addressed by the LCC 1.0 FTF report.  The country codes and related metadata contained herein are current as of the July 2017 revision to the online code set."},
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
      "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}},
   :sm/fileAbbreviation "lcc-3166-1",
   :sm/fileAbstract
   "This ontology represents the subset of the ISO 3166 standard that include the actual ISO 3166-1 country codes, with the ontology and codes for the other parts of the standard represented in dependent models.",
   :sm/filename "ISO3166-1-CountryCodes.rdf",
   :xsd/anyURI
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"})

(def ABW
  {:db/ident :lcc-3166-1/ABW,
   :lcc-lr/denotes :lcc-3166-1/Aruba,
   :lcc-lr/hasTag "ABW",
   :lcc-lr/identifies :lcc-3166-1/Aruba,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "ABW",
   :skos/definition "Alpha-3 country code for Aruba"})

(def AD
  {:db/ident :lcc-3166-1/AD,
   :lcc-lr/denotes :lcc-3166-1/Andorra,
   :lcc-lr/hasTag "AD",
   :lcc-lr/identifies :lcc-3166-1/Andorra,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "AD",
   :skos/definition "Alpha-2 country code for Andorra"})

(def AE
  {:db/ident :lcc-3166-1/AE,
   :lcc-lr/denotes :lcc-3166-1/UnitedArabEmirates,
   :lcc-lr/hasTag "AE",
   :lcc-lr/identifies :lcc-3166-1/UnitedArabEmirates,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "AE",
   :skos/definition "Alpha-2 country code for United Arab Emirates (the)"})

(def AF
  {:db/ident :lcc-3166-1/AF,
   :lcc-lr/denotes :lcc-3166-1/Afghanistan,
   :lcc-lr/hasTag "AF",
   :lcc-lr/identifies :lcc-3166-1/Afghanistan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "AF",
   :skos/definition "Alpha-2 country code for Afghanistan"})

(def AFG
  {:db/ident :lcc-3166-1/AFG,
   :lcc-lr/denotes :lcc-3166-1/Afghanistan,
   :lcc-lr/hasTag "AFG",
   :lcc-lr/identifies :lcc-3166-1/Afghanistan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "AFG",
   :skos/definition "Alpha-3 country code for Afghanistan"})

(def AG
  {:db/ident :lcc-3166-1/AG,
   :lcc-lr/denotes :lcc-3166-1/AntiguaAndBarbuda,
   :lcc-lr/hasTag "AG",
   :lcc-lr/identifies :lcc-3166-1/AntiguaAndBarbuda,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "AG",
   :skos/definition "Alpha-2 country code for Antigua and Barbuda"})

(def AGO
  {:db/ident :lcc-3166-1/AGO,
   :lcc-lr/denotes :lcc-3166-1/Angola,
   :lcc-lr/hasTag "AGO",
   :lcc-lr/identifies :lcc-3166-1/Angola,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "AGO",
   :skos/definition "Alpha-3 country code for Angola"})

(def AI
  {:db/ident :lcc-3166-1/AI,
   :lcc-lr/denotes :lcc-3166-1/Anguilla,
   :lcc-lr/hasTag "AI",
   :lcc-lr/identifies :lcc-3166-1/Anguilla,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "AI",
   :skos/definition "Alpha-2 country code for Anguilla"})

(def AIA
  {:db/ident :lcc-3166-1/AIA,
   :lcc-lr/denotes :lcc-3166-1/Anguilla,
   :lcc-lr/hasTag "AIA",
   :lcc-lr/identifies :lcc-3166-1/Anguilla,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "AIA",
   :skos/definition "Alpha-3 country code for Anguilla"})

(def AL
  {:db/ident :lcc-3166-1/AL,
   :lcc-lr/denotes :lcc-3166-1/Albania,
   :lcc-lr/hasTag "AL",
   :lcc-lr/identifies :lcc-3166-1/Albania,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "AL",
   :skos/definition "Alpha-2 country code for Albania"})

(def ALA
  {:db/ident :lcc-3166-1/ALA,
   :lcc-lr/denotes :lcc-3166-1/AlandIslands,
   :lcc-lr/hasTag "ALA",
   :lcc-lr/identifies :lcc-3166-1/AlandIslands,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "ALA",
   :skos/definition "Alpha-3 country code for Åland Islands"})

(def ALB
  {:db/ident :lcc-3166-1/ALB,
   :lcc-lr/denotes :lcc-3166-1/Albania,
   :lcc-lr/hasTag "ALB",
   :lcc-lr/identifies :lcc-3166-1/Albania,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "ALB",
   :skos/definition "Alpha-3 country code for Albania"})

(def AM
  {:db/ident :lcc-3166-1/AM,
   :lcc-lr/denotes :lcc-3166-1/Armenia,
   :lcc-lr/hasTag "AM",
   :lcc-lr/identifies :lcc-3166-1/Armenia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "AM",
   :skos/definition "Alpha-2 country code for Armenia"})

(def AND
  {:db/ident :lcc-3166-1/AND,
   :lcc-lr/denotes :lcc-3166-1/Andorra,
   :lcc-lr/hasTag "AND",
   :lcc-lr/identifies :lcc-3166-1/Andorra,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "AND",
   :skos/definition "Alpha-3 country code for Andorra"})

(def AO
  {:db/ident :lcc-3166-1/AO,
   :lcc-lr/denotes :lcc-3166-1/Angola,
   :lcc-lr/hasTag "AO",
   :lcc-lr/identifies :lcc-3166-1/Angola,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "AO",
   :skos/definition "Alpha-2 country code for Angola"})

(def AQ
  {:db/ident :lcc-3166-1/AQ,
   :lcc-lr/denotes :lcc-3166-1/Antarctica,
   :lcc-lr/hasTag "AQ",
   :lcc-lr/identifies :lcc-3166-1/Antarctica,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "AQ",
   :skos/definition "Alpha-2 country code for Antarctica"})

(def AR
  {:db/ident :lcc-3166-1/AR,
   :lcc-lr/denotes :lcc-3166-1/Argentina,
   :lcc-lr/hasTag "AR",
   :lcc-lr/identifies :lcc-3166-1/Argentina,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "AR",
   :skos/definition "Alpha-2 country code for Argentina"})

(def ARE
  {:db/ident :lcc-3166-1/ARE,
   :lcc-lr/denotes :lcc-3166-1/UnitedArabEmirates,
   :lcc-lr/hasTag "ARE",
   :lcc-lr/identifies :lcc-3166-1/UnitedArabEmirates,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "ARE",
   :skos/definition "Alpha-3 country code for United Arab Emirates (the)"})

(def ARG
  {:db/ident :lcc-3166-1/ARG,
   :lcc-lr/denotes :lcc-3166-1/Argentina,
   :lcc-lr/hasTag "ARG",
   :lcc-lr/identifies :lcc-3166-1/Argentina,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "ARG",
   :skos/definition "Alpha-3 country code for Argentina"})

(def ARM
  {:db/ident :lcc-3166-1/ARM,
   :lcc-lr/denotes :lcc-3166-1/Armenia,
   :lcc-lr/hasTag "ARM",
   :lcc-lr/identifies :lcc-3166-1/Armenia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "ARM",
   :skos/definition "Alpha-3 country code for Armenia"})

(def AS
  {:db/ident :lcc-3166-1/AS,
   :lcc-lr/denotes :lcc-3166-1/AmericanSamoa,
   :lcc-lr/hasTag "AS",
   :lcc-lr/identifies :lcc-3166-1/AmericanSamoa,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "AS",
   :skos/definition "Alpha-2 country code for American Samoa"})

(def ASM
  {:db/ident :lcc-3166-1/ASM,
   :lcc-lr/denotes :lcc-3166-1/AmericanSamoa,
   :lcc-lr/hasTag "ASM",
   :lcc-lr/identifies :lcc-3166-1/AmericanSamoa,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "ASM",
   :skos/definition "Alpha-3 country code for American Samoa"})

(def AT
  {:db/ident :lcc-3166-1/AT,
   :lcc-lr/denotes :lcc-3166-1/Austria,
   :lcc-lr/hasTag "AT",
   :lcc-lr/identifies :lcc-3166-1/Austria,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "AT",
   :skos/definition "Alpha-2 country code for Austria"})

(def ATA
  {:db/ident :lcc-3166-1/ATA,
   :lcc-lr/denotes :lcc-3166-1/Antarctica,
   :lcc-lr/hasTag "ATA",
   :lcc-lr/identifies :lcc-3166-1/Antarctica,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "ATA",
   :skos/definition "Alpha-3 country code for Antarctica"})

(def ATF
  {:db/ident :lcc-3166-1/ATF,
   :lcc-lr/denotes :lcc-3166-1/FrenchSouthernTerritories,
   :lcc-lr/hasTag "ATF",
   :lcc-lr/identifies :lcc-3166-1/FrenchSouthernTerritories,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "ATF",
   :skos/definition
   "Alpha-3 country code for French Southern Territories (the)"})

(def ATG
  {:db/ident :lcc-3166-1/ATG,
   :lcc-lr/denotes :lcc-3166-1/AntiguaAndBarbuda,
   :lcc-lr/hasTag "ATG",
   :lcc-lr/identifies :lcc-3166-1/AntiguaAndBarbuda,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "ATG",
   :skos/definition "Alpha-3 country code for Antigua and Barbuda"})

(def AU
  {:db/ident :lcc-3166-1/AU,
   :lcc-lr/denotes :lcc-3166-1/Australia,
   :lcc-lr/hasTag "AU",
   :lcc-lr/identifies :lcc-3166-1/Australia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "AU",
   :skos/definition "Alpha-2 country code for Australia"})

(def AUS
  {:db/ident :lcc-3166-1/AUS,
   :lcc-lr/denotes :lcc-3166-1/Australia,
   :lcc-lr/hasTag "AUS",
   :lcc-lr/identifies :lcc-3166-1/Australia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "AUS",
   :skos/definition "Alpha-3 country code for Australia"})

(def AUT
  {:db/ident :lcc-3166-1/AUT,
   :lcc-lr/denotes :lcc-3166-1/Austria,
   :lcc-lr/hasTag "AUT",
   :lcc-lr/identifies :lcc-3166-1/Austria,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "AUT",
   :skos/definition "Alpha-3 country code for Austria"})

(def AW
  {:db/ident :lcc-3166-1/AW,
   :lcc-lr/denotes :lcc-3166-1/Aruba,
   :lcc-lr/hasTag "AW",
   :lcc-lr/identifies :lcc-3166-1/Aruba,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "AW",
   :skos/definition "Alpha-2 country code for Aruba"})

(def AX
  {:db/ident :lcc-3166-1/AX,
   :lcc-lr/denotes :lcc-3166-1/AlandIslands,
   :lcc-lr/hasTag "AX",
   :lcc-lr/identifies :lcc-3166-1/AlandIslands,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "AX",
   :skos/definition "Alpha-2 country code for Åland Islands"})

(def AZ
  {:db/ident :lcc-3166-1/AZ,
   :lcc-lr/denotes :lcc-3166-1/Azerbaijan,
   :lcc-lr/hasTag "AZ",
   :lcc-lr/identifies :lcc-3166-1/Azerbaijan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "AZ",
   :skos/definition "Alpha-2 country code for Azerbaijan"})

(def AZE
  {:db/ident :lcc-3166-1/AZE,
   :lcc-lr/denotes :lcc-3166-1/Azerbaijan,
   :lcc-lr/hasTag "AZE",
   :lcc-lr/identifies :lcc-3166-1/Azerbaijan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "AZE",
   :skos/definition "Alpha-3 country code for Azerbaijan"})

(def Afghanistan
  {:db/ident :lcc-3166-1/Afghanistan,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value
                               "the Islamic Republic of Afghanistan"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Afghanistan"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "AFGHANISTAN"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value
                              "la République islamique d'Afghanistan"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Afghanistan (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "AFGHANISTAN"},
   :lcc-cr/hasLocalShortName #{{:rdf/language "ps",
                                :rdf/value    "Afghānistān"}
                               {:rdf/language "fa",
                                :rdf/value    "Afghānistān"}},
   :lcc-cr/hasNumericRegionCode "004",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/Pushto :lcc-639-1/Persian},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "ps",
                  :rdf/value    "Afghānistān"}
                 {:rdf/language "fa",
                  :rdf/value    "Afghānistān"}},
   :skos/definition "the country of Afghanistan"})

(def AlandIslands
  {:db/ident :lcc-3166-1/AlandIslands,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Åland Islands"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "ÅLAND ISLANDS"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Åland(les Îles)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "ÅLAND, ÎLES"},
   :lcc-cr/hasLocalShortName {:rdf/language "sv",
                              :rdf/value    "Åland"},
   :lcc-cr/hasNumericRegionCode "248",
   :lcc-cr/hasRemarks "No subdivisions relevant for this standard.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Swedish,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "sv",
                :rdf/value    "Åland"},
   :skos/definition "the country of Åland Islands"})

(def Albania
  {:db/ident :lcc-3166-1/Albania,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Albania"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Albania"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "ALBANIA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République d'Albanie"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Albanie (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "ALBANIE"},
   :lcc-cr/hasLocalShortName {:rdf/language "sq",
                              :rdf/value    "Shqipëria; Shqipëri"},
   :lcc-cr/hasNumericRegionCode "008",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Albanian,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "sq",
                :rdf/value    "Shqipëria; Shqipëri"},
   :skos/definition "the country of Albania"})

(def Algeria
  {:db/ident :lcc-3166-1/Algeria,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value
                               "the People's Democratic Republic of Algeria"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Algeria"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "ALGERIA"},
   :lcc-cr/hasFrenchFullName
   {:rdf/language "fr",
    :rdf/value    "la République algérienne démocratique et populaire"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Algérie (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "ALGÉRIE"},
   :lcc-cr/hasLocalShortName {:rdf/language "ar",
                              :rdf/value    "Al Jazā'ir"},
   :lcc-cr/hasNumericRegionCode "012",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Arabic,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "ar",
                :rdf/value    "Al Jazā'ir"},
   :skos/definition "the country of Algeria"})

(def AmericanSamoa
  {:db/ident :lcc-3166-1/AmericanSamoa,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "American Samoa"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "AMERICAN SAMOA"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Samoa américaines (les)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "SAMOA AMÉRICAINES"},
   :lcc-cr/hasNumericRegionCode "016",
   :lcc-cr/hasRemarks
   #{"Principal island:Tutuila. Includes: Swain's Island"
     "No subdivisions relevant for this standard. Included also as a subdivision of the United States (US-AS)."},
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "American Samoa"},
   :skos/definition "the country of American Samoa"})

(def Andorra
  {:db/ident :lcc-3166-1/Andorra,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Principality of Andorra"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Andorra"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "ANDORRA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la Principauté d'Andorre"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Andorre (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "ANDORRE"},
   :lcc-cr/hasLocalShortName {:rdf/language "ca",
                              :rdf/value    "Andorra"},
   :lcc-cr/hasNumericRegionCode "020",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Catalan,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "ca",
                :rdf/value    "Andorra"},
   :skos/definition "the country of Andorra"})

(def Angola
  {:db/ident :lcc-3166-1/Angola,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Angola"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Angola"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "ANGOLA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République d'Angola"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Angola (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "ANGOLA"},
   :lcc-cr/hasLocalShortName {:rdf/language "pt",
                              :rdf/value    "Angola"},
   :lcc-cr/hasNumericRegionCode "024",
   :lcc-cr/hasRemarks "Includes: Cabinda.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Portuguese,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "pt",
                :rdf/value    "Angola"},
   :skos/definition "the country of Angola"})

(def Anguilla
  {:db/ident :lcc-3166-1/Anguilla,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Anguilla"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "ANGUILLA"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Anguilla"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "ANGUILLA"},
   :lcc-cr/hasNumericRegionCode "660",
   :lcc-cr/hasRemarks "No subdivisions relevant for this standard.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Anguilla"},
   :skos/definition "the country of Anguilla"})

(def Antarctica
  {:db/ident :lcc-3166-1/Antarctica,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Antarctica"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "ANTARCTICA"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Antarctique (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "ANTARCTIQUE"},
   :lcc-cr/hasNumericRegionCode "010",
   :lcc-cr/hasRemarks #{"Territories south of 60° south latitude."
                        "No subdivisions relevant for this standard."},
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :skos/definition "the country of Antarctica"})

(def AntiguaAndBarbuda
  {:db/ident :lcc-3166-1/AntiguaAndBarbuda,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Antigua and Barbuda"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "ANTIGUA AND BARBUDA"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Antigua-et-Barbuda"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "ANTIGUA-ET-BARBUDA"},
   :lcc-cr/hasNumericRegionCode "028",
   :lcc-cr/hasRemarks "Includes: Redonda Island.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Antigua and Barbuda"},
   :skos/definition "the country of Antigua and Barbuda"})

(def Argentina
  {:db/ident :lcc-3166-1/Argentina,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Argentine Republic"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Argentina"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "ARGENTINA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République argentine"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Argentine (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "ARGENTINE"},
   :lcc-cr/hasLocalShortName {:rdf/language "es",
                              :rdf/value    "Argentina (la)"},
   :lcc-cr/hasNumericRegionCode "032",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Spanish,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "es",
                :rdf/value    "Argentina (la)"},
   :skos/definition "the country of Argentina"})

(def Armenia
  {:db/ident :lcc-3166-1/Armenia,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Armenia"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Armenia"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "ARMENIA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République d'Arménie"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Arménie (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "ARMÉNIE"},
   :lcc-cr/hasLocalShortName {:rdf/language "hy",
                              :rdf/value    "Hayastan"},
   :lcc-cr/hasNumericRegionCode "051",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Armenian,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "hy",
                :rdf/value    "Hayastan"},
   :skos/definition "the country of Armenia"})

(def Aruba
  {:db/ident :lcc-3166-1/Aruba,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Aruba"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "ARUBA"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Aruba"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "ARUBA"},
   :lcc-cr/hasLocalShortName #{{:rdf/language "nl",
                                :rdf/value    "Aruba"} "Aruba"},
   :lcc-cr/hasNumericRegionCode "533",
   :lcc-cr/hasRemarks
   "No subdivisions relevant for this standard. Included also as subdivision of Netherlands (NL-AW).",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/Dutch :lcc-639-2/Papiamento},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "nl",
                :rdf/value    "Aruba"},
   :skos/definition "the country of Aruba"})

(def Australia
  {:db/ident :lcc-3166-1/Australia,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Australia"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "AUSTRALIA"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Australie (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "AUSTRALIE"},
   :lcc-cr/hasNumericRegionCode "036",
   :lcc-cr/hasRemarks
   "Often referred to as the Commonwealth of Australia. Includes: Lord Howe Island, Macquarie Island; and also Ashmore and Cartier \nIslands, and Coral Sea Islands which are Australian external territories.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Australia"},
   :skos/definition "the country of Australia"})

(def Austria
  {:db/ident :lcc-3166-1/Austria,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Austria"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Austria"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "AUSTRIA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République d'Autriche"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Autriche (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "AUTRICHE"},
   :lcc-cr/hasLocalShortName {:rdf/language "de",
                              :rdf/value    "Österreich"},
   :lcc-cr/hasNumericRegionCode "040",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/German,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "de",
                :rdf/value    "Österreich"},
   :skos/definition "the country of Austria"})

(def Azerbaijan
  {:db/ident :lcc-3166-1/Azerbaijan,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Azerbaijan"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Azerbaijan"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "AZERBAIJAN"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République d'Azerbaïdjan"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Azerbaïdjan (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "AZERBAÏDJAN"},
   :lcc-cr/hasLocalShortName {:rdf/language "az",
                              :rdf/value    "Azərbaycan"},
   :lcc-cr/hasNumericRegionCode "031",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Azerbaijani,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "az",
                :rdf/value    "Azərbaycan"},
   :skos/definition "the country of Azerbaijan"})

(def BA
  {:db/ident :lcc-3166-1/BA,
   :lcc-lr/denotes :lcc-3166-1/BosniaAndHerzegovina,
   :lcc-lr/hasTag "BA",
   :lcc-lr/identifies :lcc-3166-1/BosniaAndHerzegovina,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "BA",
   :skos/definition "Alpha-2 country code for Bosnia and Herzegovina"})

(def BB
  {:db/ident :lcc-3166-1/BB,
   :lcc-lr/denotes :lcc-3166-1/Barbados,
   :lcc-lr/hasTag "BB",
   :lcc-lr/identifies :lcc-3166-1/Barbados,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "BB",
   :skos/definition "Alpha-2 country code for Barbados"})

(def BD
  {:db/ident :lcc-3166-1/BD,
   :lcc-lr/denotes :lcc-3166-1/Bangladesh,
   :lcc-lr/hasTag "BD",
   :lcc-lr/identifies :lcc-3166-1/Bangladesh,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "BD",
   :skos/definition "Alpha-2 country code for Bangladesh"})

(def BDI
  {:db/ident :lcc-3166-1/BDI,
   :lcc-lr/denotes :lcc-3166-1/Burundi,
   :lcc-lr/hasTag "BDI",
   :lcc-lr/identifies :lcc-3166-1/Burundi,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "BDI",
   :skos/definition "Alpha-3 country code for Burundi"})

(def BE
  {:db/ident :lcc-3166-1/BE,
   :lcc-lr/denotes :lcc-3166-1/Belgium,
   :lcc-lr/hasTag "BE",
   :lcc-lr/identifies :lcc-3166-1/Belgium,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "BE",
   :skos/definition "Alpha-2 country code for Belgium"})

(def BEL
  {:db/ident :lcc-3166-1/BEL,
   :lcc-lr/denotes :lcc-3166-1/Belgium,
   :lcc-lr/hasTag "BEL",
   :lcc-lr/identifies :lcc-3166-1/Belgium,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "BEL",
   :skos/definition "Alpha-3 country code for Belgium"})

(def BEN
  {:db/ident :lcc-3166-1/BEN,
   :lcc-lr/denotes :lcc-3166-1/Benin,
   :lcc-lr/hasTag "BEN",
   :lcc-lr/identifies :lcc-3166-1/Benin,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "BEN",
   :skos/definition "Alpha-3 country code for Benin"})

(def BES
  {:db/ident :lcc-3166-1/BES,
   :lcc-lr/denotes :lcc-3166-1/Bonaire,
   :lcc-lr/hasTag "BES",
   :lcc-lr/identifies :lcc-3166-1/Bonaire,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "BES",
   :skos/definition
   "Alpha-3 country code for Bonaire, Sint Eustatius and Saba"})

(def BF
  {:db/ident :lcc-3166-1/BF,
   :lcc-lr/denotes :lcc-3166-1/BurkinaFaso,
   :lcc-lr/hasTag "BF",
   :lcc-lr/identifies :lcc-3166-1/BurkinaFaso,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "BF",
   :skos/definition "Alpha-2 country code for Burkina Faso"})

(def BFA
  {:db/ident :lcc-3166-1/BFA,
   :lcc-lr/denotes :lcc-3166-1/BurkinaFaso,
   :lcc-lr/hasTag "BFA",
   :lcc-lr/identifies :lcc-3166-1/BurkinaFaso,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "BFA",
   :skos/definition "Alpha-3 country code for Burkina Faso"})

(def BG
  {:db/ident :lcc-3166-1/BG,
   :lcc-lr/denotes :lcc-3166-1/Bulgaria,
   :lcc-lr/hasTag "BG",
   :lcc-lr/identifies :lcc-3166-1/Bulgaria,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "BG",
   :skos/definition "Alpha-2 country code for Bulgaria"})

(def BGD
  {:db/ident :lcc-3166-1/BGD,
   :lcc-lr/denotes :lcc-3166-1/Bangladesh,
   :lcc-lr/hasTag "BGD",
   :lcc-lr/identifies :lcc-3166-1/Bangladesh,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "BGD",
   :skos/definition "Alpha-3 country code for Bangladesh"})

(def BGR
  {:db/ident :lcc-3166-1/BGR,
   :lcc-lr/denotes :lcc-3166-1/Bulgaria,
   :lcc-lr/hasTag "BGR",
   :lcc-lr/identifies :lcc-3166-1/Bulgaria,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "BGR",
   :skos/definition "Alpha-3 country code for Bulgaria"})

(def BH
  {:db/ident :lcc-3166-1/BH,
   :lcc-lr/denotes :lcc-3166-1/Bahrain,
   :lcc-lr/hasTag "BH",
   :lcc-lr/identifies :lcc-3166-1/Bahrain,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "BH",
   :skos/definition "Alpha-2 country code for Bahrain"})

(def BHR
  {:db/ident :lcc-3166-1/BHR,
   :lcc-lr/denotes :lcc-3166-1/Bahrain,
   :lcc-lr/hasTag "BHR",
   :lcc-lr/identifies :lcc-3166-1/Bahrain,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "BHR",
   :skos/definition "Alpha-3 country code for Bahrain"})

(def BHS
  {:db/ident :lcc-3166-1/BHS,
   :lcc-lr/denotes :lcc-3166-1/Bahamas,
   :lcc-lr/hasTag "BHS",
   :lcc-lr/identifies :lcc-3166-1/Bahamas,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "BHS",
   :skos/definition "Alpha-3 country code for Bahamas (the)"})

(def BI
  {:db/ident :lcc-3166-1/BI,
   :lcc-lr/denotes :lcc-3166-1/Burundi,
   :lcc-lr/hasTag "BI",
   :lcc-lr/identifies :lcc-3166-1/Burundi,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "BI",
   :skos/definition "Alpha-2 country code for Burundi"})

(def BIH
  {:db/ident :lcc-3166-1/BIH,
   :lcc-lr/denotes :lcc-3166-1/BosniaAndHerzegovina,
   :lcc-lr/hasTag "BIH",
   :lcc-lr/identifies :lcc-3166-1/BosniaAndHerzegovina,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "BIH",
   :skos/definition "Alpha-3 country code for Bosnia and Herzegovina"})

(def BJ
  {:db/ident :lcc-3166-1/BJ,
   :lcc-lr/denotes :lcc-3166-1/Benin,
   :lcc-lr/hasTag "BJ",
   :lcc-lr/identifies :lcc-3166-1/Benin,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "BJ",
   :skos/definition "Alpha-2 country code for Benin"})

(def BL
  {:db/ident :lcc-3166-1/BL,
   :lcc-lr/denotes :lcc-3166-1/SaintBarthelemy,
   :lcc-lr/hasTag "BL",
   :lcc-lr/identifies :lcc-3166-1/SaintBarthelemy,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "BL",
   :skos/definition "Alpha-2 country code for Saint Barthélemy"})

(def BLM
  {:db/ident :lcc-3166-1/BLM,
   :lcc-lr/denotes :lcc-3166-1/SaintBarthelemy,
   :lcc-lr/hasTag "BLM",
   :lcc-lr/identifies :lcc-3166-1/SaintBarthelemy,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "BLM",
   :skos/definition "Alpha-3 country code for Saint Barthélemy"})

(def BLR
  {:db/ident :lcc-3166-1/BLR,
   :lcc-lr/denotes :lcc-3166-1/Belarus,
   :lcc-lr/hasTag "BLR",
   :lcc-lr/identifies :lcc-3166-1/Belarus,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "BLR",
   :skos/definition "Alpha-3 country code for Belarus"})

(def BLZ
  {:db/ident :lcc-3166-1/BLZ,
   :lcc-lr/denotes :lcc-3166-1/Belize,
   :lcc-lr/hasTag "BLZ",
   :lcc-lr/identifies :lcc-3166-1/Belize,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "BLZ",
   :skos/definition "Alpha-3 country code for Belize"})

(def BM
  {:db/ident :lcc-3166-1/BM,
   :lcc-lr/denotes :lcc-3166-1/Bermuda,
   :lcc-lr/hasTag "BM",
   :lcc-lr/identifies :lcc-3166-1/Bermuda,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "BM",
   :skos/definition "Alpha-2 country code for Bermuda"})

(def BMU
  {:db/ident :lcc-3166-1/BMU,
   :lcc-lr/denotes :lcc-3166-1/Bermuda,
   :lcc-lr/hasTag "BMU",
   :lcc-lr/identifies :lcc-3166-1/Bermuda,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "BMU",
   :skos/definition "Alpha-3 country code for Bermuda"})

(def BN
  {:db/ident :lcc-3166-1/BN,
   :lcc-lr/denotes :lcc-3166-1/BruneiDarussalam,
   :lcc-lr/hasTag "BN",
   :lcc-lr/identifies :lcc-3166-1/BruneiDarussalam,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "BN",
   :skos/definition "Alpha-2 country code for Brunei Darussalam"})

(def BO
  {:db/ident :lcc-3166-1/BO,
   :lcc-lr/denotes :lcc-3166-1/Bolivia,
   :lcc-lr/hasTag "BO",
   :lcc-lr/identifies :lcc-3166-1/Bolivia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "BO",
   :skos/definition
   "Alpha-2 country code for Bolivia (Plurinational State of)"})

(def BOL
  {:db/ident :lcc-3166-1/BOL,
   :lcc-lr/denotes :lcc-3166-1/Bolivia,
   :lcc-lr/hasTag "BOL",
   :lcc-lr/identifies :lcc-3166-1/Bolivia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "BOL",
   :skos/definition
   "Alpha-3 country code for Bolivia (Plurinational State of)"})

(def BQ
  {:db/ident :lcc-3166-1/BQ,
   :lcc-lr/denotes :lcc-3166-1/Bonaire,
   :lcc-lr/hasTag "BQ",
   :lcc-lr/identifies :lcc-3166-1/Bonaire,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "BQ",
   :skos/definition
   "Alpha-2 country code for Bonaire, Sint Eustatius and Saba"})

(def BR
  {:db/ident :lcc-3166-1/BR,
   :lcc-lr/denotes :lcc-3166-1/Brazil,
   :lcc-lr/hasTag "BR",
   :lcc-lr/identifies :lcc-3166-1/Brazil,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "BR",
   :skos/definition "Alpha-2 country code for Brazil"})

(def BRA
  {:db/ident :lcc-3166-1/BRA,
   :lcc-lr/denotes :lcc-3166-1/Brazil,
   :lcc-lr/hasTag "BRA",
   :lcc-lr/identifies :lcc-3166-1/Brazil,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "BRA",
   :skos/definition "Alpha-3 country code for Brazil"})

(def BRB
  {:db/ident :lcc-3166-1/BRB,
   :lcc-lr/denotes :lcc-3166-1/Barbados,
   :lcc-lr/hasTag "BRB",
   :lcc-lr/identifies :lcc-3166-1/Barbados,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "BRB",
   :skos/definition "Alpha-3 country code for Barbados"})

(def BRN
  {:db/ident :lcc-3166-1/BRN,
   :lcc-lr/denotes :lcc-3166-1/BruneiDarussalam,
   :lcc-lr/hasTag "BRN",
   :lcc-lr/identifies :lcc-3166-1/BruneiDarussalam,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "BRN",
   :skos/definition "Alpha-3 country code for Brunei Darussalam"})

(def BS
  {:db/ident :lcc-3166-1/BS,
   :lcc-lr/denotes :lcc-3166-1/Bahamas,
   :lcc-lr/hasTag "BS",
   :lcc-lr/identifies :lcc-3166-1/Bahamas,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "BS",
   :skos/definition "Alpha-2 country code for Bahamas (the)"})

(def BT
  {:db/ident :lcc-3166-1/BT,
   :lcc-lr/denotes :lcc-3166-1/Bhutan,
   :lcc-lr/hasTag "BT",
   :lcc-lr/identifies :lcc-3166-1/Bhutan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "BT",
   :skos/definition "Alpha-2 country code for Bhutan"})

(def BTN
  {:db/ident :lcc-3166-1/BTN,
   :lcc-lr/denotes :lcc-3166-1/Bhutan,
   :lcc-lr/hasTag "BTN",
   :lcc-lr/identifies :lcc-3166-1/Bhutan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "BTN",
   :skos/definition "Alpha-3 country code for Bhutan"})

(def BV
  {:db/ident :lcc-3166-1/BV,
   :lcc-lr/denotes :lcc-3166-1/BouvetIsland,
   :lcc-lr/hasTag "BV",
   :lcc-lr/identifies :lcc-3166-1/BouvetIsland,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "BV",
   :skos/definition "Alpha-2 country code for Bouvet Island"})

(def BVT
  {:db/ident :lcc-3166-1/BVT,
   :lcc-lr/denotes :lcc-3166-1/BouvetIsland,
   :lcc-lr/hasTag "BVT",
   :lcc-lr/identifies :lcc-3166-1/BouvetIsland,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "BVT",
   :skos/definition "Alpha-3 country code for Bouvet Island"})

(def BW
  {:db/ident :lcc-3166-1/BW,
   :lcc-lr/denotes :lcc-3166-1/Botswana,
   :lcc-lr/hasTag "BW",
   :lcc-lr/identifies :lcc-3166-1/Botswana,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "BW",
   :skos/definition "Alpha-2 country code for Botswana"})

(def BWA
  {:db/ident :lcc-3166-1/BWA,
   :lcc-lr/denotes :lcc-3166-1/Botswana,
   :lcc-lr/hasTag "BWA",
   :lcc-lr/identifies :lcc-3166-1/Botswana,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "BWA",
   :skos/definition "Alpha-3 country code for Botswana"})

(def BY
  {:db/ident :lcc-3166-1/BY,
   :lcc-lr/denotes :lcc-3166-1/Belarus,
   :lcc-lr/hasTag "BY",
   :lcc-lr/identifies :lcc-3166-1/Belarus,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "BY",
   :skos/definition "Alpha-2 country code for Belarus"})

(def BZ
  {:db/ident :lcc-3166-1/BZ,
   :lcc-lr/denotes :lcc-3166-1/Belize,
   :lcc-lr/hasTag "BZ",
   :lcc-lr/identifies :lcc-3166-1/Belize,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "BZ",
   :skos/definition "Alpha-2 country code for Belize"})

(def Bahamas
  {:db/ident :lcc-3166-1/Bahamas,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Commonwealth of the Bahamas"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Bahamas (the)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "BAHAMAS"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "le Commonwealth des Bahamas"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Bahamas (les)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "BAHAMAS"},
   :lcc-cr/hasNumericRegionCode "044",
   :lcc-cr/hasRemarks
   "The island of New Providence, where the capital Nassau is located, is administered directly by the national government.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Bahamas (the)"},
   :skos/definition "the country of Bahamas (the)"})

(def Bahrain
  {:db/ident :lcc-3166-1/Bahrain,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Kingdom of Bahrain"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Bahrain"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "BAHRAIN"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "le Royaume de Bahreïn"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Bahreïn"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "BAHREÏN"},
   :lcc-cr/hasLocalShortName {:rdf/language "ar",
                              :rdf/value    "Al Baḩrayn"},
   :lcc-cr/hasNumericRegionCode "048",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Arabic,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "ar",
                :rdf/value    "Al Baḩrayn"},
   :skos/definition "the country of Bahrain"})

(def Bangladesh
  {:db/ident :lcc-3166-1/Bangladesh,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value
                               "the People's Republic of Bangladesh"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Bangladesh"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "BANGLADESH"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value
                              "la République populaire du Bangladesh"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Bangladesh (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "BANGLADESH"},
   :lcc-cr/hasLocalShortName {:rdf/language "bn",
                              :rdf/value    "Bāṁlādesh"},
   :lcc-cr/hasNumericRegionCode "050",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Bengali,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "bn",
                :rdf/value    "Bāṁlādesh"},
   :skos/definition "the country of Bangladesh"})

(def Barbados
  {:db/ident :lcc-3166-1/Barbados,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Barbados"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "BARBADOS"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Barbade (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "BARBADE"},
   :lcc-cr/hasNumericRegionCode "052",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Barbados"},
   :skos/definition "the country of Barbados"})

(def Belarus
  {:db/ident :lcc-3166-1/Belarus,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Belarus"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Belarus"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "BELARUS"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Bélarus"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Bélarus (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "BÉLARUS"},
   :lcc-cr/hasLocalShortName #{{:rdf/language "be",
                                :rdf/value    "Bielaruś"}
                               {:rdf/language "ru",
                                :rdf/value    "Belarus'"}},
   :lcc-cr/hasNumericRegionCode "112",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/Russian
                                        :lcc-639-1/Belarusian},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "be",
                  :rdf/value    "Bielaruś"}
                 {:rdf/language "ru",
                  :rdf/value    "Belarus'"}},
   :skos/definition "the country of Belarus"})

(def Belgium
  {:db/ident :lcc-3166-1/Belgium,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Kingdom of Belgium"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Belgium"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "BELGIUM"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "le Royaume de Belgique"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Belgique (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "BELGIQUE"},
   :lcc-cr/hasLocalShortName #{{:rdf/language "de",
                                :rdf/value    "Belgien"}
                               {:rdf/language "nl",
                                :rdf/value    "België"}},
   :lcc-cr/hasNumericRegionCode "056",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/Dutch :lcc-639-1/German
                                        :lcc-639-1/French},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "de",
                  :rdf/value    "Belgien"}
                 {:rdf/language "nl",
                  :rdf/value    "België"}
                 {:rdf/language "fr",
                  :rdf/value    "Belgique (la)"}},
   :skos/definition "the country of Belgium"})

(def Belize
  {:db/ident :lcc-3166-1/Belize,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Belize"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "BELIZE"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Belize (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "BELIZE"},
   :lcc-cr/hasNumericRegionCode "084",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Belize"},
   :skos/definition "the country of Belize"})

(def Benin
  {:db/ident :lcc-3166-1/Benin,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Benin"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Benin"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "BENIN"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Bénin"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Bénin (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "BÉNIN"},
   :lcc-cr/hasNumericRegionCode "204",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "fr",
                :rdf/value    "Bénin (le)"},
   :skos/definition "the country of Benin"})

(def Bermuda
  {:db/ident :lcc-3166-1/Bermuda,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Bermuda"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "BERMUDA"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Bermudes (les)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "BERMUDES"},
   :lcc-cr/hasNumericRegionCode "060",
   :lcc-cr/hasRemarks "No subdivisions relevant for this standard.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Bermuda"},
   :skos/definition "the country of Bermuda"})

(def Bhutan
  {:db/ident :lcc-3166-1/Bhutan,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Kingdom of Bhutan"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Bhutan"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "BHUTAN"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "le Royaume du Bhoutan"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Bhoutan (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "BHOUTAN"},
   :lcc-cr/hasLocalShortName {:rdf/language "dz",
                              :rdf/value    "Druk-Yul"},
   :lcc-cr/hasNumericRegionCode "064",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Dzongkha,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "dz",
                :rdf/value    "Druk-Yul"},
   :skos/definition "the country of Bhutan"})

(def Bolivia
  {:db/ident :lcc-3166-1/Bolivia,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value "the Plurinational State of Bolivia"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value "Bolivia (Plurinational State of)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value
                                          "BOLIVIA (PLURINATIONAL STATE OF)"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "l'État plurinational de Bolivie"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Bolivie (État plurinational de)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value
                                         "BOLIVIE (ÉTAT PLURINATIONAL DE)"},
   :lcc-cr/hasLocalShortName {:rdf/language "es",
                              :rdf/value "Bolivia,  Estado Plurinacional de"},
   :lcc-cr/hasNumericRegionCode "068",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Spanish,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "es",
                :rdf/value    "Bolivia,  Estado Plurinacional de"},
   :skos/definition "the country of Bolivia (Plurinational State of)"})

(def Bonaire
  {:db/ident :lcc-3166-1/Bonaire,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value "Bonaire, Sint Eustatius and Saba"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value
                                          "BONAIRE, SINT EUSTATIUS AND SABA"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Bonaire, Saint-Eustache et Saba"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value
                                         "BONAIRE, SAINT-EUSTACHE ET SABA"},
   :lcc-cr/hasLocalShortName #{{:rdf/language "nl",
                                :rdf/value    "Bonaire, Sint Eustatius en Saba"}
                               "Boneiru, Sint Eustatius y Saba"},
   :lcc-cr/hasNumericRegionCode "535",
   :lcc-cr/hasRemarks #{"Included as a subdivision of the Netherlands (NL-BQ)."
                        "Often referred to as Caribbean Netherlands."},
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/Dutch :lcc-639-2/Papiamento
                                        :lcc-639-1/English},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Bonaire, Sint Eustatius and Saba"}
                 {:rdf/language "nl",
                  :rdf/value    "Bonaire, Sint Eustatius en Saba"}},
   :skos/definition "the country of Bonaire, Sint Eustatius and Saba"})

(def BosniaAndHerzegovina
  {:db/ident :lcc-3166-1/BosniaAndHerzegovina,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Bosnia and Herzegovina"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value "BOSNIA AND HERZEGOVINA"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Bosnie-Herzégovine (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "BOSNIE-HERZÉGOVINE"},
   :lcc-cr/hasLocalShortName #{{:rdf/language "bs",
                                :rdf/value    "Bosna i Hercegovina"}
                               {:rdf/language "sr",
                                :rdf/value    "Bosna i Hercegovina"}
                               {:rdf/language "hr",
                                :rdf/value    "Bosna i Hercegovina"}},
   :lcc-cr/hasNumericRegionCode "070",
   :lcc-cr/hasRemarks
   "Herzegovina * is the second significant part of composite country name.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/Serbian :lcc-639-1/Croatian
                                        :lcc-639-1/Bosnian},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "bs",
                  :rdf/value    "Bosna i Hercegovina"}
                 {:rdf/language "sr",
                  :rdf/value    "Bosna i Hercegovina"}
                 {:rdf/language "hr",
                  :rdf/value    "Bosna i Hercegovina"}},
   :skos/definition "the country of Bosnia and Herzegovina"})

(def Botswana
  {:db/ident :lcc-3166-1/Botswana,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Botswana"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Botswana"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "BOTSWANA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Botswana"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Botswana (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "BOTSWANA"},
   :lcc-cr/hasNumericRegionCode "072",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Botswana"},
   :skos/definition "the country of Botswana"})

(def BouvetIsland
  {:db/ident :lcc-3166-1/BouvetIsland,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Bouvet Island"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "BOUVET ISLAND"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Bouvet (l'Île)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "BOUVET, ÎLE"},
   :lcc-cr/hasLocalShortName #{{:rdf/language "nb",
                                :rdf/value    "Bouvetøya"}
                               {:rdf/language "nn",
                                :rdf/value    "Bouvetøya"}},
   :lcc-cr/hasNumericRegionCode "074",
   :lcc-cr/hasRemarks "No subdivisions relevant for this standard.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/NorwegianNynorsk
                                        :lcc-639-1/NorwegianBokmal},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "nb",
                  :rdf/value    "Bouvetøya"}
                 {:rdf/language "nn",
                  :rdf/value    "Bouvetøya"}},
   :skos/definition "the country of Bouvet Island"})

(def Brazil
  {:db/ident :lcc-3166-1/Brazil,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value "the Federative Republic of Brazil"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Brazil"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "BRAZIL"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value "la République fédérative du Brésil"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Brésil (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "BRÉSIL"},
   :lcc-cr/hasLocalShortName {:rdf/language "pt",
                              :rdf/value    "Brasil (o)"},
   :lcc-cr/hasNumericRegionCode "076",
   :lcc-cr/hasRemarks
   "Includes: Fernando de Noronha Island, Martim Vaz Islands, Trindade Island.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Portuguese,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "pt",
                :rdf/value    "Brasil (o)"},
   :skos/definition "the country of Brazil"})

(def BritishIndianOceanTerritory
  {:db/ident :lcc-3166-1/BritishIndianOceanTerritory,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value
                                "British Indian Ocean Territory (the)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value
                                          "BRITISH INDIAN OCEAN TERRITORY"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value
                              "le Territoire britannique de l'océan Indien"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value
                               "Indien (le Territoire britannique de l'océan)"},
   :lcc-cr/hasFrenchShortNameInCapitals
   {:rdf/language "fr",
    :rdf/value    "OCÉAN INDIEN, TERRITOIRE BRITANNIQUE DE L'"},
   :lcc-cr/hasNumericRegionCode "086",
   :lcc-cr/hasRemarks
   #{"No subdivisions relevant for this standard."
     " Comprises: Chagos Archipelago (Principal island: Diego Garcia).\nNo subdivision reported"},
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "British Indian Ocean Territory (the)"},
   :skos/definition "the country of British Indian Ocean Territory (the)"})

(def BruneiDarussalam
  {:db/ident :lcc-3166-1/BruneiDarussalam,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Brunei Darussalam"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "BRUNEI DARUSSALAM"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Brunéi Darussalam (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "BRUNEI DARUSSALAM"},
   :lcc-cr/hasLocalShortName {:rdf/language "ms",
                              :rdf/value    "Negara Brunei Darussalam"},
   :lcc-cr/hasNumericRegionCode "096",
   :lcc-cr/hasRemarks "Variant: Negara Brunei Darussalam.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/Malay :lcc-639-1/English},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Brunei Darussalam"}
                 {:rdf/language "ms",
                  :rdf/value    "Negara Brunei Darussalam"}},
   :skos/definition "the country of Brunei Darussalam"})

(def Bulgaria
  {:db/ident :lcc-3166-1/Bulgaria,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Bulgaria"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Bulgaria"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "BULGARIA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République de Bulgarie"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Bulgarie (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "BULGARIE"},
   :lcc-cr/hasLocalShortName {:rdf/language "bg",
                              :rdf/value    "Bulgaria"},
   :lcc-cr/hasNumericRegionCode "100",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Bulgarian,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "bg",
                :rdf/value    "Bulgaria"},
   :skos/definition "the country of Bulgaria"})

(def BurkinaFaso
  {:db/ident :lcc-3166-1/BurkinaFaso,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Burkina Faso"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "BURKINA FASO"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "le Burkina Faso"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Burkina Faso (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "BURKINA FASO"},
   :lcc-cr/hasNumericRegionCode "854",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "fr",
                :rdf/value    "Burkina Faso (le)"},
   :skos/definition "the country of Burkina Faso"})

(def Burundi
  {:db/ident :lcc-3166-1/Burundi,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Burundi"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Burundi"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "BURUNDI"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Burundi"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Burundi (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "BURUNDI"},
   :lcc-cr/hasLocalShortName {:rdf/language "rn",
                              :rdf/value    "Burundi"},
   :lcc-cr/hasNumericRegionCode "108",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/Rundi :lcc-639-1/French},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "rn",
                  :rdf/value    "Burundi"}
                 {:rdf/language "fr",
                  :rdf/value    "Burundi (le)"}},
   :skos/definition "the country of Burundi"})

(def CA
  {:db/ident :lcc-3166-1/CA,
   :lcc-lr/denotes :lcc-3166-1/Canada,
   :lcc-lr/hasTag "CA",
   :lcc-lr/identifies :lcc-3166-1/Canada,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "CA",
   :skos/definition "Alpha-2 country code for Canada"})

(def CAF
  {:db/ident :lcc-3166-1/CAF,
   :lcc-lr/denotes :lcc-3166-1/CentralAfricanRepublic,
   :lcc-lr/hasTag "CAF",
   :lcc-lr/identifies :lcc-3166-1/CentralAfricanRepublic,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "CAF",
   :skos/definition "Alpha-3 country code for Central African Republic (the)"})

(def CAN
  {:db/ident :lcc-3166-1/CAN,
   :lcc-lr/denotes :lcc-3166-1/Canada,
   :lcc-lr/hasTag "CAN",
   :lcc-lr/identifies :lcc-3166-1/Canada,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "CAN",
   :skos/definition "Alpha-3 country code for Canada"})

(def CC
  {:db/ident :lcc-3166-1/CC,
   :lcc-lr/denotes :lcc-3166-1/CocosKeelingIslands,
   :lcc-lr/hasTag "CC",
   :lcc-lr/identifies :lcc-3166-1/CocosKeelingIslands,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "CC",
   :skos/definition "Alpha-2 country code for Cocos Keeling Islands"})

(def CCK
  {:db/ident :lcc-3166-1/CCK,
   :lcc-lr/denotes :lcc-3166-1/CocosKeelingIslands,
   :lcc-lr/hasTag "CCK",
   :lcc-lr/identifies :lcc-3166-1/CocosKeelingIslands,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "CCK",
   :skos/definition "Alpha-3 country code for Cocos Keeling Islands"})

(def CD
  {:db/ident :lcc-3166-1/CD,
   :lcc-lr/denotes :lcc-3166-1/CongoDemocraticRepublicOf,
   :lcc-lr/hasTag "CD",
   :lcc-lr/identifies :lcc-3166-1/CongoDemocraticRepublicOf,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "CD",
   :skos/definition "Alpha-2 country code for Congo Democratic Republic Of"})

(def CF
  {:db/ident :lcc-3166-1/CF,
   :lcc-lr/denotes :lcc-3166-1/CentralAfricanRepublic,
   :lcc-lr/hasTag "CF",
   :lcc-lr/identifies :lcc-3166-1/CentralAfricanRepublic,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "CF",
   :skos/definition "Alpha-2 country code for Central African Republic (the)"})

(def CG
  {:db/ident :lcc-3166-1/CG,
   :lcc-lr/denotes :lcc-3166-1/Congo,
   :lcc-lr/hasTag "CG",
   :lcc-lr/identifies :lcc-3166-1/Congo,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "CG",
   :skos/definition "Alpha-2 country code for Congo (the)"})

(def CH
  {:db/ident :lcc-3166-1/CH,
   :lcc-lr/denotes :lcc-3166-1/Switzerland,
   :lcc-lr/hasTag "CH",
   :lcc-lr/identifies :lcc-3166-1/Switzerland,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "CH",
   :skos/definition "Alpha-2 country code for Switzerland"})

(def CHE
  {:db/ident :lcc-3166-1/CHE,
   :lcc-lr/denotes :lcc-3166-1/Switzerland,
   :lcc-lr/hasTag "CHE",
   :lcc-lr/identifies :lcc-3166-1/Switzerland,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "CHE",
   :skos/definition "Alpha-3 country code for Switzerland"})

(def CHL
  {:db/ident :lcc-3166-1/CHL,
   :lcc-lr/denotes :lcc-3166-1/Chile,
   :lcc-lr/hasTag "CHL",
   :lcc-lr/identifies :lcc-3166-1/Chile,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "CHL",
   :skos/definition "Alpha-3 country code for Chile"})

(def CHN
  {:db/ident :lcc-3166-1/CHN,
   :lcc-lr/denotes :lcc-3166-1/China,
   :lcc-lr/hasTag "CHN",
   :lcc-lr/identifies :lcc-3166-1/China,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "CHN",
   :skos/definition "Alpha-3 country code for China"})

(def CI
  {:db/ident :lcc-3166-1/CI,
   :lcc-lr/denotes :lcc-3166-1/CoteDIvoire,
   :lcc-lr/hasTag "CI",
   :lcc-lr/identifies :lcc-3166-1/CoteDIvoire,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "CI",
   :skos/definition "Alpha-2 country code for Côte d'Ivoire"})

(def CIV
  {:db/ident :lcc-3166-1/CIV,
   :lcc-lr/denotes :lcc-3166-1/CoteDIvoire,
   :lcc-lr/hasTag "CIV",
   :lcc-lr/identifies :lcc-3166-1/CoteDIvoire,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "CIV",
   :skos/definition "Alpha-3 country code for Côte d'Ivoire"})

(def CK
  {:db/ident :lcc-3166-1/CK,
   :lcc-lr/denotes :lcc-3166-1/CookIslands,
   :lcc-lr/hasTag "CK",
   :lcc-lr/identifies :lcc-3166-1/CookIslands,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "CK",
   :skos/definition "Alpha-2 country code for Cook Islands (the)"})

(def CL
  {:db/ident :lcc-3166-1/CL,
   :lcc-lr/denotes :lcc-3166-1/Chile,
   :lcc-lr/hasTag "CL",
   :lcc-lr/identifies :lcc-3166-1/Chile,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "CL",
   :skos/definition "Alpha-2 country code for Chile"})

(def CM
  {:db/ident :lcc-3166-1/CM,
   :lcc-lr/denotes :lcc-3166-1/Cameroon,
   :lcc-lr/hasTag "CM",
   :lcc-lr/identifies :lcc-3166-1/Cameroon,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "CM",
   :skos/definition "Alpha-2 country code for Cameroon"})

(def CMR
  {:db/ident :lcc-3166-1/CMR,
   :lcc-lr/denotes :lcc-3166-1/Cameroon,
   :lcc-lr/hasTag "CMR",
   :lcc-lr/identifies :lcc-3166-1/Cameroon,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "CMR",
   :skos/definition "Alpha-3 country code for Cameroon"})

(def CN
  {:db/ident :lcc-3166-1/CN,
   :lcc-lr/denotes :lcc-3166-1/China,
   :lcc-lr/hasTag "CN",
   :lcc-lr/identifies :lcc-3166-1/China,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "CN",
   :skos/definition "Alpha-2 country code for China"})

(def CO
  {:db/ident :lcc-3166-1/CO,
   :lcc-lr/denotes :lcc-3166-1/Colombia,
   :lcc-lr/hasTag "CO",
   :lcc-lr/identifies :lcc-3166-1/Colombia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "CO",
   :skos/definition "Alpha-2 country code for Colombia"})

(def COD
  {:db/ident :lcc-3166-1/COD,
   :lcc-lr/denotes :lcc-3166-1/CongoDemocraticRepublicOf,
   :lcc-lr/hasTag "COD",
   :lcc-lr/identifies :lcc-3166-1/CongoDemocraticRepublicOf,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "COD",
   :skos/definition "Alpha-3 country code for Congo Democratic Republic Of"})

(def COG
  {:db/ident :lcc-3166-1/COG,
   :lcc-lr/denotes :lcc-3166-1/Congo,
   :lcc-lr/hasTag "COG",
   :lcc-lr/identifies :lcc-3166-1/Congo,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "COG",
   :skos/definition "Alpha-3 country code for Congo (the)"})

(def COK
  {:db/ident :lcc-3166-1/COK,
   :lcc-lr/denotes :lcc-3166-1/CookIslands,
   :lcc-lr/hasTag "COK",
   :lcc-lr/identifies :lcc-3166-1/CookIslands,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "COK",
   :skos/definition "Alpha-3 country code for Cook Islands (the)"})

(def COL
  {:db/ident :lcc-3166-1/COL,
   :lcc-lr/denotes :lcc-3166-1/Colombia,
   :lcc-lr/hasTag "COL",
   :lcc-lr/identifies :lcc-3166-1/Colombia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "COL",
   :skos/definition "Alpha-3 country code for Colombia"})

(def COM
  {:db/ident :lcc-3166-1/COM,
   :lcc-lr/denotes :lcc-3166-1/Comoros,
   :lcc-lr/hasTag "COM",
   :lcc-lr/identifies :lcc-3166-1/Comoros,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "COM",
   :skos/definition "Alpha-3 country code for Comoros (the)"})

(def CPV
  {:db/ident :lcc-3166-1/CPV,
   :lcc-lr/denotes :lcc-3166-1/CaboVerde,
   :lcc-lr/hasTag "CPV",
   :lcc-lr/identifies :lcc-3166-1/CaboVerde,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "CPV",
   :skos/definition "Alpha-3 country code for Cabo Verde"})

(def CR
  {:db/ident :lcc-3166-1/CR,
   :lcc-lr/denotes :lcc-3166-1/CostaRica,
   :lcc-lr/hasTag "CR",
   :lcc-lr/identifies :lcc-3166-1/CostaRica,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "CR",
   :skos/definition "Alpha-2 country code for Costa Rica"})

(def CRI
  {:db/ident :lcc-3166-1/CRI,
   :lcc-lr/denotes :lcc-3166-1/CostaRica,
   :lcc-lr/hasTag "CRI",
   :lcc-lr/identifies :lcc-3166-1/CostaRica,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "CRI",
   :skos/definition "Alpha-3 country code for Costa Rica"})

(def CU
  {:db/ident :lcc-3166-1/CU,
   :lcc-lr/denotes :lcc-3166-1/Cuba,
   :lcc-lr/hasTag "CU",
   :lcc-lr/identifies :lcc-3166-1/Cuba,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "CU",
   :skos/definition "Alpha-2 country code for Cuba"})

(def CUB
  {:db/ident :lcc-3166-1/CUB,
   :lcc-lr/denotes :lcc-3166-1/Cuba,
   :lcc-lr/hasTag "CUB",
   :lcc-lr/identifies :lcc-3166-1/Cuba,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "CUB",
   :skos/definition "Alpha-3 country code for Cuba"})

(def CUW
  {:db/ident :lcc-3166-1/CUW,
   :lcc-lr/denotes :lcc-3166-1/Curacao,
   :lcc-lr/hasTag "CUW",
   :lcc-lr/identifies :lcc-3166-1/Curacao,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "CUW",
   :skos/definition "Alpha-3 country code for Curaçao"})

(def CV
  {:db/ident :lcc-3166-1/CV,
   :lcc-lr/denotes :lcc-3166-1/CaboVerde,
   :lcc-lr/hasTag "CV",
   :lcc-lr/identifies :lcc-3166-1/CaboVerde,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "CV",
   :skos/definition "Alpha-2 country code for Cabo Verde"})

(def CW
  {:db/ident :lcc-3166-1/CW,
   :lcc-lr/denotes :lcc-3166-1/Curacao,
   :lcc-lr/hasTag "CW",
   :lcc-lr/identifies :lcc-3166-1/Curacao,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "CW",
   :skos/definition "Alpha-2 country code for Curaçao"})

(def CX
  {:db/ident :lcc-3166-1/CX,
   :lcc-lr/denotes :lcc-3166-1/ChristmasIsland,
   :lcc-lr/hasTag "CX",
   :lcc-lr/identifies :lcc-3166-1/ChristmasIsland,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "CX",
   :skos/definition "Alpha-2 country code for Christmas Island"})

(def CXR
  {:db/ident :lcc-3166-1/CXR,
   :lcc-lr/denotes :lcc-3166-1/ChristmasIsland,
   :lcc-lr/hasTag "CXR",
   :lcc-lr/identifies :lcc-3166-1/ChristmasIsland,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "CXR",
   :skos/definition "Alpha-3 country code for Christmas Island"})

(def CY
  {:db/ident :lcc-3166-1/CY,
   :lcc-lr/denotes :lcc-3166-1/Cyprus,
   :lcc-lr/hasTag "CY",
   :lcc-lr/identifies :lcc-3166-1/Cyprus,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "CY",
   :skos/definition "Alpha-2 country code for Cyprus"})

(def CYM
  {:db/ident :lcc-3166-1/CYM,
   :lcc-lr/denotes :lcc-3166-1/CaymanIslands,
   :lcc-lr/hasTag "CYM",
   :lcc-lr/identifies :lcc-3166-1/CaymanIslands,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "CYM",
   :skos/definition "Alpha-3 country code for Cayman Islands (the)"})

(def CYP
  {:db/ident :lcc-3166-1/CYP,
   :lcc-lr/denotes :lcc-3166-1/Cyprus,
   :lcc-lr/hasTag "CYP",
   :lcc-lr/identifies :lcc-3166-1/Cyprus,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "CYP",
   :skos/definition "Alpha-3 country code for Cyprus"})

(def CZ
  {:db/ident :lcc-3166-1/CZ,
   :lcc-lr/denotes :lcc-3166-1/Czechia,
   :lcc-lr/hasTag "CZ",
   :lcc-lr/identifies :lcc-3166-1/Czechia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "CZ",
   :skos/definition "Alpha-2 country code for Czechia"})

(def CZE
  {:db/ident :lcc-3166-1/CZE,
   :lcc-lr/denotes :lcc-3166-1/Czechia,
   :lcc-lr/hasTag "CZE",
   :lcc-lr/identifies :lcc-3166-1/Czechia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "CZE",
   :skos/definition "Alpha-3 country code for Czechia"})

(def CaboVerde
  {:db/ident :lcc-3166-1/CaboVerde,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Cabo Verde"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Cabo Verde"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "CABO VERDE"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Cabo Verde"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Cabo Verde"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "CABO VERDE"},
   :lcc-cr/hasLocalShortName {:rdf/language "pt",
                              :rdf/value    "Cabo Verde"},
   :lcc-cr/hasNumericRegionCode "132",
   :lcc-cr/hasRemarks "Principal islands: São Tiago, São Vicente.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Portuguese,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "pt",
                :rdf/value    "Cabo Verde"},
   :skos/definition "the country of Cabo Verde"})

(def Cambodia
  {:db/ident :lcc-3166-1/Cambodia,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Kingdom of Cambodia"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Cambodia"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "CAMBODIA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "le Royaume du Cambodge"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Cambodge (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "CAMBODGE"},
   :lcc-cr/hasLocalShortName {:rdf/language "km",
                              :rdf/value    "Kâmpŭchéa"},
   :lcc-cr/hasNumericRegionCode "116",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/CentralKhmer,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "km",
                :rdf/value    "Kâmpŭchéa"},
   :skos/definition "the country of Cambodia"})

(def Cameroon
  {:db/ident :lcc-3166-1/Cameroon,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Cameroon"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Cameroon"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "CAMEROON"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Cameroun"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Cameroun (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "CAMEROUN"},
   :lcc-cr/hasNumericRegionCode "120",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/English :lcc-639-1/French},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "fr",
                  :rdf/value    "Cameroun (le)"}
                 {:rdf/language "en",
                  :rdf/value    "Cameroon"}},
   :skos/definition "the country of Cameroon"})

(def Canada
  {:db/ident :lcc-3166-1/Canada,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Canada"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "CANADA"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Canada (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "CANADA"},
   :lcc-cr/hasNumericRegionCode "124",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/English :lcc-639-1/French},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "fr",
                  :rdf/value    "Canada (le)"}
                 {:rdf/language "en",
                  :rdf/value    "Canada"}},
   :skos/definition "the country of Canada"})

(def CaymanIslands
  {:db/ident :lcc-3166-1/CaymanIslands,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Cayman Islands (the)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "CAYMAN ISLANDS"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Caïmans (les Îles)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "CAÏMANS, ÎLES"},
   :lcc-cr/hasNumericRegionCode "136",
   :lcc-cr/hasRemarks #{"No subdivisions relevant for this standard."
                        "Principal island: Grand Cayman."},
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Cayman Islands (the)"},
   :skos/definition "the country of Cayman Islands (the)"})

(def CentralAfricanRepublic
  {:db/ident :lcc-3166-1/CentralAfricanRepublic,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Central African Republic"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Central African Republic (the)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value
                                          "CENTRAL AFRICAN REPUBLIC"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République centrafricaine"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "République centrafricaine (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value
                                         "CENTRAFRICAINE, RÉPUBLIQUE"},
   :lcc-cr/hasLocalShortName {:rdf/language "sg",
                              :rdf/value    "Ködörösêse tî Bêafrîka"},
   :lcc-cr/hasNumericRegionCode "140",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/Sango :lcc-639-1/French},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "fr",
                  :rdf/value    "République centrafricaine (la)"}
                 {:rdf/language "sg",
                  :rdf/value    "Ködörösêse tî Bêafrîka"}},
   :skos/definition "the country of Central African Republic (the)"})

(def Chad
  {:db/ident :lcc-3166-1/Chad,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Chad"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Chad"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "CHAD"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Tchad"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Tchad (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "TCHAD"},
   :lcc-cr/hasLocalShortName {:rdf/language "ar",
                              :rdf/value    "Tshād"},
   :lcc-cr/hasNumericRegionCode "148",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/Arabic :lcc-639-1/French},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "ar",
                  :rdf/value    "Tshād"}
                 {:rdf/language "fr",
                  :rdf/value    "Tchad (le)"}},
   :skos/definition "the country of Chad"})

(def Chile
  {:db/ident :lcc-3166-1/Chile,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Chile"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Chile"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "CHILE"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Chili"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Chili (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "CHILI"},
   :lcc-cr/hasLocalShortName {:rdf/language "es",
                              :rdf/value    "Chile"},
   :lcc-cr/hasNumericRegionCode "152",
   :lcc-cr/hasRemarks
   "Includes: Easter Island, Juan Fernández Islands, Sala y Gómez Island, San Ambrosio Island, San Félix Island.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Spanish,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "es",
                :rdf/value    "Chile"},
   :skos/definition "the country of Chile"})

(def China
  {:db/ident :lcc-3166-1/China,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the People's Republic of China"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "China"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "CHINA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République populaire de Chine"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Chine (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "CHINE"},
   :lcc-cr/hasLocalShortName {:rdf/language "zh",
                              :rdf/value    "Zhongguo"},
   :lcc-cr/hasNumericRegionCode "156",
   :lcc-cr/hasRemarks "See also TAIWAN, PROVINCE OF CHINA.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Chinese,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "zh",
                :rdf/value    "Zhongguo"},
   :skos/definition "the country of China"})

(def ChristmasIsland
  {:db/ident :lcc-3166-1/ChristmasIsland,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Christmas Island"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "CHRISTMAS ISLAND"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Christmas (l'Île)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "CHRISTMAS, ÎLE"},
   :lcc-cr/hasNumericRegionCode "162",
   :lcc-cr/hasRemarks "No subdivisions relevant for this standard.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Christmas Island"},
   :skos/definition "the country of Christmas Island"})

(def CocosKeelingIslands
  {:db/ident :lcc-3166-1/CocosKeelingIslands,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Cocos (Keeling) Islands (the)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value "COCOS (KEELING) ISLANDS"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value
                               "Cocos (les Îles)/ Keeling (les Îles)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "COCOS (KEELING), ÎLES"},
   :lcc-cr/hasNumericRegionCode "166",
   :lcc-cr/hasRemarks "No subdivisions relevant for this standard.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Cocos (Keeling) Islands (the)"},
   :skos/definition "the country of Cocos Keeling Islands"})

(def Colombia
  {:db/ident :lcc-3166-1/Colombia,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Colombia"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Colombia"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "COLOMBIA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République de Colombie"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Colombie (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "COLOMBIE"},
   :lcc-cr/hasLocalShortName {:rdf/language "es",
                              :rdf/value    "Colombia"},
   :lcc-cr/hasNumericRegionCode "170",
   :lcc-cr/hasRemarks
   "Includes: Malpelo Island, San Andrés y Providencia Islands.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Spanish,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "es",
                :rdf/value    "Colombia"},
   :skos/definition "the country of Colombia"})

(def Comoros
  {:db/ident :lcc-3166-1/Comoros,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Union of the Comoros"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Comoros (the)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "COMOROS"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "l'Union des Comores"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Comores (les)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "COMORES"},
   :lcc-cr/hasLocalShortName #{"Komori"
                               {:rdf/language "ar",
                                :rdf/value    "Al Qamar"}},
   :lcc-cr/hasNumericRegionCode "174",
   :lcc-cr/hasRemarks
   #{"The language code \"002\" refers to the administrative language \"Shikomor\" that has not been assigned an ISO 639 language code."
     "Comprises: Anjouan, Grande Comore, Mohéli. \nThe language code \"002\" refers to the administrative language \"Shikomor\" that has not been assigned an ISO 639 language code."},
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/Arabic :lcc-639-1/French
                                        :lcc-3166-1/Shikomor},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "ar",
                  :rdf/value    "Al Qamar"}
                 {:rdf/language "fr",
                  :rdf/value    "Comores (les)"}},
   :skos/definition "the country of Comoros (the)"})

(def Congo
  {:db/ident :lcc-3166-1/Congo,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of the Congo"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Congo (the)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "CONGO"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Congo"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Congo (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "CONGO"},
   :lcc-cr/hasNumericRegionCode "178",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "fr",
                :rdf/value    "Congo (le)"},
   :skos/definition "the country of Congo (the)"})

(def CongoDemocraticRepublicOf
  {:db/ident :lcc-3166-1/CongoDemocraticRepublicOf,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value
                               "the Democratic Republic of the Congo"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value
                                "Congo (the Democratic Republic of the)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value
                                          "CONGO, DEMOCRATIC REPUBLIC OF THE"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value "la République démocratique du Congo"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value
                               "Congo (la République démocratique du)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value
                                         "CONGO, RÉPUBLIQUE DÉMOCRATIQUE DU"},
   :lcc-cr/hasNumericRegionCode "180",
   :lcc-cr/hasRemarks #{"Previous entry: ZAIRE."
                        "Remark: Ex Zaire/Zaïre, change of name 1997-05-17"},
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "fr",
                :rdf/value    "Congo (la République démocratique du)"},
   :skos/definition "the country of Congo Democratic Republic Of"})

(def CookIslands
  {:db/ident :lcc-3166-1/CookIslands,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Cook Islands (the)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "COOK ISLANDS"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Cook (les Îles)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "COOK, ÎLES"},
   :lcc-cr/hasNumericRegionCode "184",
   :lcc-cr/hasRemarks #{"No subdivisions relevant for this standard."
                        "Principal island: Rarotonga."},
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Cook Islands (the)"},
   :skos/definition "the country of Cook Islands (the)"})

(def CostaRica
  {:db/ident :lcc-3166-1/CostaRica,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Costa Rica"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Costa Rica"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "COSTA RICA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Costa Rica"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Costa Rica (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "COSTA RICA"},
   :lcc-cr/hasLocalShortName {:rdf/language "es",
                              :rdf/value    "Costa Rica"},
   :lcc-cr/hasNumericRegionCode "188",
   :lcc-cr/hasRemarks "Includes: Coco Island.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Spanish,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "es",
                :rdf/value    "Costa Rica"},
   :skos/definition "the country of Costa Rica"})

(def CoteDIvoire
  {:db/ident :lcc-3166-1/CoteDIvoire,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Côte d'Ivoire"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Côte d'Ivoire"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "CÔTE D'IVOIRE"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la Republic de Côte d'Ivoire"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Côte d'Ivoire (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "CÔTE D'IVOIRE"},
   :lcc-cr/hasNumericRegionCode "384",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "fr",
                :rdf/value    "Côte d'Ivoire (la)"},
   :skos/definition "the country of Côte d'Ivoire"})

(def Country
  {:db/ident :lcc-3166-1/Country,
   :rdf/type #{:lcc-cr/GeographicRegionKind :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "Country",
   :skos/definition "the kind of region that is a country"})

(def Croatia
  {:db/ident :lcc-3166-1/Croatia,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Croatia"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Croatia"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "CROATIA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République de Croatie"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Croatie (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "CROATIE"},
   :lcc-cr/hasLocalShortName {:rdf/language "hr",
                              :rdf/value    "Hrvatska"},
   :lcc-cr/hasNumericRegionCode "191",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Croatian,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "hr",
                :rdf/value    "Hrvatska"},
   :skos/definition "the country of Croatia"})

(def Cuba
  {:db/ident :lcc-3166-1/Cuba,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Cuba"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Cuba"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "CUBA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République de Cuba"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Cuba"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "CUBA"},
   :lcc-cr/hasLocalShortName {:rdf/language "es",
                              :rdf/value    "Cuba"},
   :lcc-cr/hasNumericRegionCode "192",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Spanish,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "es",
                :rdf/value    "Cuba"},
   :skos/definition "the country of Cuba"})

(def Curacao
  {:db/ident :lcc-3166-1/Curacao,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Curaçao"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "CURAÇAO"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Curaçao"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "CURAÇAO"},
   :lcc-cr/hasLocalShortName #{{:rdf/language "nl",
                                :rdf/value    "Curaçao"} "Kòrsou"},
   :lcc-cr/hasNumericRegionCode "531",
   :lcc-cr/hasRemarks
   "No subdivisions relevant for this standard. Included also as subdivision of Netherlands (NL-CW).",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/Dutch :lcc-639-2/Papiamento
                                        :lcc-639-1/English},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "nl",
                  :rdf/value    "Curaçao"}
                 {:rdf/language "en",
                  :rdf/value    "Curaçao"}},
   :skos/definition "the country of Curaçao"})

(def Cyprus
  {:db/ident :lcc-3166-1/Cyprus,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Cyprus"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Cyprus"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "CYPRUS"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République de Chypre"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Chypre"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "CHYPRE"},
   :lcc-cr/hasLocalShortName #{{:rdf/language "el",
                                :rdf/value    "Kýpros"}
                               {:rdf/language "tr",
                                :rdf/value    "Kıbrıs"}},
   :lcc-cr/hasNumericRegionCode "196",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/ModernGreek
                                        :lcc-639-1/Turkish},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "el",
                  :rdf/value    "Kýpros"}
                 {:rdf/language "tr",
                  :rdf/value    "Kıbrıs"}},
   :skos/definition "the country of Cyprus"})

(def CzechRepublic
  {:db/ident :lcc-3166-1/CzechRepublic,
   :owl/sameAs :lcc-3166-1/Czechia,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/comment "CzechRepublic is supported as legacy identifier for Czechia",
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}})

(def Czechia
  {:db/ident :lcc-3166-1/Czechia,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Czech Republic"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Czechia"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "CZECHIA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République tchèque"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Tchéquie (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "TCHÉQUIE (LA)"},
   :lcc-cr/hasLocalShortName {:rdf/language "cs",
                              :rdf/value    "Česko"},
   :lcc-cr/hasNumericRegionCode "203",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Czech,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "cs",
                :rdf/value    "Česko"},
   :skos/definition "the country of Czechia"})

(def DE
  {:db/ident :lcc-3166-1/DE,
   :lcc-lr/denotes :lcc-3166-1/Germany,
   :lcc-lr/hasTag "DE",
   :lcc-lr/identifies :lcc-3166-1/Germany,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "DE",
   :skos/definition "Alpha-2 country code for Germany"})

(def DEU
  {:db/ident :lcc-3166-1/DEU,
   :lcc-lr/denotes :lcc-3166-1/Germany,
   :lcc-lr/hasTag "DEU",
   :lcc-lr/identifies :lcc-3166-1/Germany,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "DEU",
   :skos/definition "Alpha-3 country code for Germany"})

(def DJ
  {:db/ident :lcc-3166-1/DJ,
   :lcc-lr/denotes :lcc-3166-1/Djibouti,
   :lcc-lr/hasTag "DJ",
   :lcc-lr/identifies :lcc-3166-1/Djibouti,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "DJ",
   :skos/definition "Alpha-2 country code for Djibouti"})

(def DJI
  {:db/ident :lcc-3166-1/DJI,
   :lcc-lr/denotes :lcc-3166-1/Djibouti,
   :lcc-lr/hasTag "DJI",
   :lcc-lr/identifies :lcc-3166-1/Djibouti,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "DJI",
   :skos/definition "Alpha-3 country code for Djibouti"})

(def DK
  {:db/ident :lcc-3166-1/DK,
   :lcc-lr/denotes :lcc-3166-1/Denmark,
   :lcc-lr/hasTag "DK",
   :lcc-lr/identifies :lcc-3166-1/Denmark,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "DK",
   :skos/definition "Alpha-2 country code for Denmark"})

(def DM
  {:db/ident :lcc-3166-1/DM,
   :lcc-lr/denotes :lcc-3166-1/Dominica,
   :lcc-lr/hasTag "DM",
   :lcc-lr/identifies :lcc-3166-1/Dominica,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "DM",
   :skos/definition "Alpha-2 country code for Dominica"})

(def DMA
  {:db/ident :lcc-3166-1/DMA,
   :lcc-lr/denotes :lcc-3166-1/Dominica,
   :lcc-lr/hasTag "DMA",
   :lcc-lr/identifies :lcc-3166-1/Dominica,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "DMA",
   :skos/definition "Alpha-3 country code for Dominica"})

(def DNK
  {:db/ident :lcc-3166-1/DNK,
   :lcc-lr/denotes :lcc-3166-1/Denmark,
   :lcc-lr/hasTag "DNK",
   :lcc-lr/identifies :lcc-3166-1/Denmark,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "DNK",
   :skos/definition "Alpha-3 country code for Denmark"})

(def DO
  {:db/ident :lcc-3166-1/DO,
   :lcc-lr/denotes :lcc-3166-1/DominicanRepublic,
   :lcc-lr/hasTag "DO",
   :lcc-lr/identifies :lcc-3166-1/DominicanRepublic,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "DO",
   :skos/definition "Alpha-2 country code for Dominican Republic (the)"})

(def DOM
  {:db/ident :lcc-3166-1/DOM,
   :lcc-lr/denotes :lcc-3166-1/DominicanRepublic,
   :lcc-lr/hasTag "DOM",
   :lcc-lr/identifies :lcc-3166-1/DominicanRepublic,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "DOM",
   :skos/definition "Alpha-3 country code for Dominican Republic (the)"})

(def DZ
  {:db/ident :lcc-3166-1/DZ,
   :lcc-lr/denotes :lcc-3166-1/Algeria,
   :lcc-lr/hasTag "DZ",
   :lcc-lr/identifies :lcc-3166-1/Algeria,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "DZ",
   :skos/definition "Alpha-2 country code for Algeria"})

(def DZA
  {:db/ident :lcc-3166-1/DZA,
   :lcc-lr/denotes :lcc-3166-1/Algeria,
   :lcc-lr/hasTag "DZA",
   :lcc-lr/identifies :lcc-3166-1/Algeria,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "DZA",
   :skos/definition "Alpha-3 country code for Algeria"})

(def Denmark
  {:db/ident :lcc-3166-1/Denmark,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Kingdom of Denmark"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Denmark"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "DENMARK"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "le Royaume du Danemark"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Danemark (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "DANEMARK"},
   :lcc-cr/hasLocalShortName {:rdf/language "da",
                              :rdf/value    "Danmark"},
   :lcc-cr/hasNumericRegionCode "208",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Danish,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "da",
                :rdf/value    "Danmark"},
   :skos/definition "the country of Denmark"})

(def Djibouti
  {:db/ident :lcc-3166-1/Djibouti,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Djibouti"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Djibouti"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "DJIBOUTI"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République de Djibouti"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Djibouti"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "DJIBOUTI"},
   :lcc-cr/hasLocalShortName {:rdf/language "ar",
                              :rdf/value    "Jībūtī"},
   :lcc-cr/hasNumericRegionCode "262",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/Arabic :lcc-639-1/French},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "ar",
                  :rdf/value    "Jībūtī"}
                 {:rdf/language "fr",
                  :rdf/value    "Djibouti"}},
   :skos/definition "the country of Djibouti"})

(def Dominica
  {:db/ident :lcc-3166-1/Dominica,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Commonwealth of Dominica"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Dominica"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "DOMINICA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "le Commonwealth de Dominique"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Dominique (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "DOMINIQUE"},
   :lcc-cr/hasNumericRegionCode "212",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Dominica"},
   :skos/definition "the country of Dominica"})

(def DominicanRepublic
  {:db/ident :lcc-3166-1/DominicanRepublic,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Dominican Republic"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Dominican Republic (the)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "DOMINICAN REPUBLIC"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République dominicaine"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "dominicaine (la République)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value "DOMINICAINE, RÉPUBLIQUE"},
   :lcc-cr/hasLocalShortName {:rdf/language "es",
                              :rdf/value    "República Dominicana (la)"},
   :lcc-cr/hasNumericRegionCode "214",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Spanish,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "es",
                :rdf/value    "República Dominicana (la)"},
   :skos/definition "the country of Dominican Republic (the)"})

(def EC
  {:db/ident :lcc-3166-1/EC,
   :lcc-lr/denotes :lcc-3166-1/Ecuador,
   :lcc-lr/hasTag "EC",
   :lcc-lr/identifies :lcc-3166-1/Ecuador,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "EC",
   :skos/definition "Alpha-2 country code for Ecuador"})

(def ECU
  {:db/ident :lcc-3166-1/ECU,
   :lcc-lr/denotes :lcc-3166-1/Ecuador,
   :lcc-lr/hasTag "ECU",
   :lcc-lr/identifies :lcc-3166-1/Ecuador,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "ECU",
   :skos/definition "Alpha-3 country code for Ecuador"})

(def EE
  {:db/ident :lcc-3166-1/EE,
   :lcc-lr/denotes :lcc-3166-1/Estonia,
   :lcc-lr/hasTag "EE",
   :lcc-lr/identifies :lcc-3166-1/Estonia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "EE",
   :skos/definition "Alpha-2 country code for Estonia"})

(def EG
  {:db/ident :lcc-3166-1/EG,
   :lcc-lr/denotes :lcc-3166-1/Egypt,
   :lcc-lr/hasTag "EG",
   :lcc-lr/identifies :lcc-3166-1/Egypt,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "EG",
   :skos/definition "Alpha-2 country code for Egypt"})

(def EGY
  {:db/ident :lcc-3166-1/EGY,
   :lcc-lr/denotes :lcc-3166-1/Egypt,
   :lcc-lr/hasTag "EGY",
   :lcc-lr/identifies :lcc-3166-1/Egypt,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "EGY",
   :skos/definition "Alpha-3 country code for Egypt"})

(def EH
  {:db/ident :lcc-3166-1/EH,
   :lcc-lr/denotes :lcc-3166-1/WesternSahara,
   :lcc-lr/hasTag "EH",
   :lcc-lr/identifies :lcc-3166-1/WesternSahara,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "EH",
   :skos/definition "Alpha-2 country code for Western Sahara*"})

(def ER
  {:db/ident :lcc-3166-1/ER,
   :lcc-lr/denotes :lcc-3166-1/Eritrea,
   :lcc-lr/hasTag "ER",
   :lcc-lr/identifies :lcc-3166-1/Eritrea,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "ER",
   :skos/definition "Alpha-2 country code for Eritrea"})

(def ERI
  {:db/ident :lcc-3166-1/ERI,
   :lcc-lr/denotes :lcc-3166-1/Eritrea,
   :lcc-lr/hasTag "ERI",
   :lcc-lr/identifies :lcc-3166-1/Eritrea,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "ERI",
   :skos/definition "Alpha-3 country code for Eritrea"})

(def ES
  {:db/ident :lcc-3166-1/ES,
   :lcc-lr/denotes :lcc-3166-1/Spain,
   :lcc-lr/hasTag "ES",
   :lcc-lr/identifies :lcc-3166-1/Spain,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "ES",
   :skos/definition "Alpha-2 country code for Spain"})

(def ESH
  {:db/ident :lcc-3166-1/ESH,
   :lcc-lr/denotes :lcc-3166-1/WesternSahara,
   :lcc-lr/hasTag "ESH",
   :lcc-lr/identifies :lcc-3166-1/WesternSahara,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "ESH",
   :skos/definition "Alpha-3 country code for Western Sahara*"})

(def ESP
  {:db/ident :lcc-3166-1/ESP,
   :lcc-lr/denotes :lcc-3166-1/Spain,
   :lcc-lr/hasTag "ESP",
   :lcc-lr/identifies :lcc-3166-1/Spain,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "ESP",
   :skos/definition "Alpha-3 country code for Spain"})

(def EST
  {:db/ident :lcc-3166-1/EST,
   :lcc-lr/denotes :lcc-3166-1/Estonia,
   :lcc-lr/hasTag "EST",
   :lcc-lr/identifies :lcc-3166-1/Estonia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "EST",
   :skos/definition "Alpha-3 country code for Estonia"})

(def ET
  {:db/ident :lcc-3166-1/ET,
   :lcc-lr/denotes :lcc-3166-1/Ethiopia,
   :lcc-lr/hasTag "ET",
   :lcc-lr/identifies :lcc-3166-1/Ethiopia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "ET",
   :skos/definition "Alpha-2 country code for Ethiopia"})

(def ETH
  {:db/ident :lcc-3166-1/ETH,
   :lcc-lr/denotes :lcc-3166-1/Ethiopia,
   :lcc-lr/hasTag "ETH",
   :lcc-lr/identifies :lcc-3166-1/Ethiopia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "ETH",
   :skos/definition "Alpha-3 country code for Ethiopia"})

(def Ecuador
  {:db/ident :lcc-3166-1/Ecuador,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Ecuador"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Ecuador"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "ECUADOR"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République d'Équateur"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Équateur (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "ÉQUATEUR"},
   :lcc-cr/hasLocalShortName {:rdf/language "es",
                              :rdf/value    "Ecuador (el)"},
   :lcc-cr/hasNumericRegionCode "218",
   :lcc-cr/hasRemarks "Includes: Galápagos Islands.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Spanish,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "es",
                :rdf/value    "Ecuador (el)"},
   :skos/definition "the country of Ecuador"})

(def Egypt
  {:db/ident :lcc-3166-1/Egypt,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Arab Republic of Egypt"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Egypt"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "EGYPT"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République arabe d'Égypte"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Égypte (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "ÉGYPTE"},
   :lcc-cr/hasLocalShortName {:rdf/language "ar",
                              :rdf/value    "Mişr"},
   :lcc-cr/hasNumericRegionCode "818",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Arabic,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "ar",
                :rdf/value    "Mişr"},
   :skos/definition "the country of Egypt"})

(def ElSalvador
  {:db/ident :lcc-3166-1/ElSalvador,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of El Salvador"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "El Salvador"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "EL SALVADOR"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République d'El Salvador"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "El Salvador"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "EL SALVADOR"},
   :lcc-cr/hasLocalShortName {:rdf/language "es",
                              :rdf/value    "El Salvador"},
   :lcc-cr/hasNumericRegionCode "222",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Spanish,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "es",
                :rdf/value    "El Salvador"},
   :skos/definition "the country of El Salvador"})

(def EquatorialGuinea
  {:db/ident :lcc-3166-1/EquatorialGuinea,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value "the Republic of Equatorial Guinea"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Equatorial Guinea"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "EQUATORIAL GUINEA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value "la République de Guinée équatoriale"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Guinée équatoriale (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "GUINÉE ÉQUATORIALE"},
   :lcc-cr/hasLocalShortName #{{:rdf/language "pt",
                                :rdf/value    "Guiné Equatorial (a)"}
                               {:rdf/language "es",
                                :rdf/value    "Guinea Ecuatorial"}},
   :lcc-cr/hasNumericRegionCode "226",
   :lcc-cr/hasRemarks
   "Comprises: Annobón Island, Bioko Island, the Continental Region (Rio Muni).",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/Spanish :lcc-639-1/Portuguese
                                        :lcc-639-1/French},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "pt",
                  :rdf/value    "Guiné Equatorial (a)"}
                 {:rdf/language "es",
                  :rdf/value    "Guinea Ecuatorial"}
                 {:rdf/language "fr",
                  :rdf/value    "Guinée équatoriale (la)"}},
   :skos/definition "the country of Equatorial Guinea"})

(def Eritrea
  {:db/ident :lcc-3166-1/Eritrea,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the State of Eritrea"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Eritrea"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "ERITREA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "l'État d'Érythrée"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Érythrée (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "ÉRYTHRÉE"},
   :lcc-cr/hasLocalShortName #{{:rdf/language "ti",
                                :rdf/value    "Iertra"}
                               {:rdf/language "ar",
                                :rdf/value    "Irītrīyā"}},
   :lcc-cr/hasNumericRegionCode "232",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/Arabic :lcc-639-1/Tigrinya
                                        :lcc-639-1/English},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Eritrea"}
                 {:rdf/language "ti",
                  :rdf/value    "Iertra"}
                 {:rdf/language "ar",
                  :rdf/value    "Irītrīyā"}},
   :skos/definition "the country of Eritrea"})

(def Estonia
  {:db/ident :lcc-3166-1/Estonia,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Estonia"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Estonia"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "ESTONIA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République d'Estonie"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Estonie (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "ESTONIE"},
   :lcc-cr/hasLocalShortName {:rdf/language "et",
                              :rdf/value    "Eesti"},
   :lcc-cr/hasNumericRegionCode "233",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Estonian,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "et",
                :rdf/value    "Eesti"},
   :skos/definition "the country of Estonia"})

(def Eswatini
  {:db/ident :lcc-3166-1/Eswatini,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Kingdom of Eswatini"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Eswatini"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "ESWATINI"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "le Royaume d’Eswatini"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Eswatini (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "ESWATINI"},
   :lcc-cr/hasLocalShortName {:rdf/language "ss",
                              :rdf/value    "eSwatini"},
   :lcc-cr/hasNumericRegionCode "748",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/English :lcc-639-1/Swati},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Eswatini"}
                 {:rdf/language "ss",
                  :rdf/value    "eSwatini"}},
   :skos/definition "the country of Eswatini"})

(def Ethiopia
  {:db/ident :lcc-3166-1/Ethiopia,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value
                               "the Federal Democratic Republic of Ethiopia"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Ethiopia"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "ETHIOPIA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value
                              "la République fédérale démocratique d'Éthiopie"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Éthiopie (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "ÉTHIOPIE"},
   :lcc-cr/hasLocalShortName {:rdf/language "am",
                              :rdf/value    "Ītyop'iya"},
   :lcc-cr/hasNumericRegionCode "231",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Amharic,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "am",
                :rdf/value    "Ītyop'iya"},
   :skos/definition "the country of Ethiopia"})

(def FI
  {:db/ident :lcc-3166-1/FI,
   :lcc-lr/denotes :lcc-3166-1/Finland,
   :lcc-lr/hasTag "FI",
   :lcc-lr/identifies :lcc-3166-1/Finland,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "FI",
   :skos/definition "Alpha-2 country code for Finland"})

(def FIN
  {:db/ident :lcc-3166-1/FIN,
   :lcc-lr/denotes :lcc-3166-1/Finland,
   :lcc-lr/hasTag "FIN",
   :lcc-lr/identifies :lcc-3166-1/Finland,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "FIN",
   :skos/definition "Alpha-3 country code for Finland"})

(def FJ
  {:db/ident :lcc-3166-1/FJ,
   :lcc-lr/denotes :lcc-3166-1/Fiji,
   :lcc-lr/hasTag "FJ",
   :lcc-lr/identifies :lcc-3166-1/Fiji,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "FJ",
   :skos/definition "Alpha-2 country code for Fiji"})

(def FJI
  {:db/ident :lcc-3166-1/FJI,
   :lcc-lr/denotes :lcc-3166-1/Fiji,
   :lcc-lr/hasTag "FJI",
   :lcc-lr/identifies :lcc-3166-1/Fiji,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "FJI",
   :skos/definition "Alpha-3 country code for Fiji"})

(def FK
  {:db/ident :lcc-3166-1/FK,
   :lcc-lr/denotes :lcc-3166-1/FalklandIslands,
   :lcc-lr/hasTag "FK",
   :lcc-lr/identifies :lcc-3166-1/FalklandIslands,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "FK",
   :skos/definition
   "Alpha-2 country code for Falkland Islands (the) [Malvinas]"})

(def FLK
  {:db/ident :lcc-3166-1/FLK,
   :lcc-lr/denotes :lcc-3166-1/FalklandIslands,
   :lcc-lr/hasTag "FLK",
   :lcc-lr/identifies :lcc-3166-1/FalklandIslands,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "FLK",
   :skos/definition
   "Alpha-3 country code for Falkland Islands (the) [Malvinas]"})

(def FM
  {:db/ident :lcc-3166-1/FM,
   :lcc-lr/denotes :lcc-3166-1/Micronesia,
   :lcc-lr/hasTag "FM",
   :lcc-lr/identifies :lcc-3166-1/Micronesia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "FM",
   :skos/definition
   "Alpha-2 country code for Micronesia (Federated States of)"})

(def FO
  {:db/ident :lcc-3166-1/FO,
   :lcc-lr/denotes :lcc-3166-1/FaroeIslands,
   :lcc-lr/hasTag "FO",
   :lcc-lr/identifies :lcc-3166-1/FaroeIslands,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "FO",
   :skos/definition "Alpha-2 country code for Faroe Islands (the)"})

(def FR
  {:db/ident :lcc-3166-1/FR,
   :lcc-lr/denotes :lcc-3166-1/France,
   :lcc-lr/hasTag "FR",
   :lcc-lr/identifies :lcc-3166-1/France,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "FR",
   :skos/definition "Alpha-2 country code for France"})

(def FRA
  {:db/ident :lcc-3166-1/FRA,
   :lcc-lr/denotes :lcc-3166-1/France,
   :lcc-lr/hasTag "FRA",
   :lcc-lr/identifies :lcc-3166-1/France,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "FRA",
   :skos/definition "Alpha-3 country code for France"})

(def FRO
  {:db/ident :lcc-3166-1/FRO,
   :lcc-lr/denotes :lcc-3166-1/FaroeIslands,
   :lcc-lr/hasTag "FRO",
   :lcc-lr/identifies :lcc-3166-1/FaroeIslands,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "FRO",
   :skos/definition "Alpha-3 country code for Faroe Islands (the)"})

(def FSM
  {:db/ident :lcc-3166-1/FSM,
   :lcc-lr/denotes :lcc-3166-1/Micronesia,
   :lcc-lr/hasTag "FSM",
   :lcc-lr/identifies :lcc-3166-1/Micronesia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "FSM",
   :skos/definition
   "Alpha-3 country code for Micronesia (Federated States of)"})

(def FalklandIslands
  {:db/ident :lcc-3166-1/FalklandIslands,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value "Falkland Islands (the) [Malvinas]"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value
                                          "FALKLAND ISLANDS (MALVINAS)"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value
                               "Falkland (les Îles)/Malouines (les Îles)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value
                                         "FALKLAND, ÎLES (MALVINAS)"},
   :lcc-cr/hasNumericRegionCode "238",
   :lcc-cr/hasRemarks "No subdivisions relevant for this standard.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Falkland Islands (the) [Malvinas]"},
   :skos/definition "the country of Falkland Islands (the) [Malvinas]"})

(def FaroeIslands
  {:db/ident :lcc-3166-1/FaroeIslands,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Faroe Islands (the)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "FAROE ISLANDS"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Féroé (les Îles)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "FÉROÉ, ÎLES"},
   :lcc-cr/hasLocalShortName #{{:rdf/language "da",
                                :rdf/value    "Færøerne"}
                               {:rdf/language "fo",
                                :rdf/value    "Føroyar"}},
   :lcc-cr/hasNumericRegionCode "234",
   :lcc-cr/hasRemarks "No subdivisions relevant for this standard.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/Faroese :lcc-639-1/Danish},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "da",
                  :rdf/value    "Færøerne"}
                 {:rdf/language "fo",
                  :rdf/value    "Føroyar"}},
   :skos/definition "the country of Faroe Islands (the)"})

(def Fiji
  {:db/ident :lcc-3166-1/Fiji,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Fiji"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Fiji"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "FIJI"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République des Fidji"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Fidji (les)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "FIDJI"},
   :lcc-cr/hasLocalShortName {:rdf/language "fj",
                              :rdf/value    "Viti"},
   :lcc-cr/hasNumericRegionCode "242",
   :lcc-cr/hasRemarks
   "Principal islands: Vanua Levu, Viti Levu. Includes Rotuma Island.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/Fijian :lcc-639-1/English},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Fiji"}
                 {:rdf/language "fj",
                  :rdf/value    "Viti"}},
   :skos/definition "the country of Fiji"})

(def Finland
  {:db/ident :lcc-3166-1/Finland,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Finland"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Finland"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "FINLAND"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République de Finlande"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Finlande (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "FINLANDE"},
   :lcc-cr/hasLocalShortName #{{:rdf/language "fi",
                                :rdf/value    "Suomi"}
                               {:rdf/language "sv",
                                :rdf/value    "Finland"}},
   :lcc-cr/hasNumericRegionCode "246",
   :lcc-cr/hasRemarks "Includes: Åland Islands.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/Swedish :lcc-639-1/Finnish},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "fi",
                  :rdf/value    "Suomi"}
                 {:rdf/language "sv",
                  :rdf/value    "Finland"}},
   :skos/definition "the country of Finland"})

(def France
  {:db/ident :lcc-3166-1/France,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the French Republic"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "France"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "FRANCE"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République française"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "France (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "FRANCE"},
   :lcc-cr/hasNumericRegionCode "250",
   :lcc-cr/hasRemarks
   "Comprises: Metropolitan France, French Guiana, Guadeloupe, Martinique, La Réunion, Mayotte, Saint Barthélemy, Saint Martin, Saint Pierre and Miquelon, French Polynesia, French Southern Territories, New Caledonia, Wallis and Futuna.  Includes: Clipperton Island.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "fr",
                :rdf/value    "France (la)"},
   :skos/definition "the country of France"})

(def FrenchGuiana
  {:db/ident :lcc-3166-1/FrenchGuiana,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "French Guiana"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "FRENCH GUIANA"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Guyane française (la )"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "GUYANE FRANÇAISE"},
   :lcc-cr/hasNumericRegionCode "254",
   :lcc-cr/hasRemarks
   "No subdivisions relevant for this standard. Included also as subdivision of France (FR-GF).",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "fr",
                :rdf/value    "Guyane française (la )"},
   :skos/definition "the country of French Guiana"})

(def FrenchPolynesia
  {:db/ident :lcc-3166-1/FrenchPolynesia,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "French Polynesia"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "FRENCH POLYNESIA"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Polynésie française (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "POLYNÉSIE FRANÇAISE"},
   :lcc-cr/hasNumericRegionCode "258",
   :lcc-cr/hasRemarks
   #{"No subdivisions relevant for this standard. Included also as a subdivision of France (FR-PF)."
     "Comprises: Austral Islands, Gambier Islands, Marquesas Islands, Society Archipelago (Principal island: Tahiti), Tuamotu Islands."},
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "fr",
                :rdf/value    "Polynésie française (la)"},
   :skos/definition "the country of French Polynesia"})

(def FrenchSouthernTerritories
  {:db/ident :lcc-3166-1/FrenchSouthernTerritories,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value "French Southern Territories (the)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value
                                          "FRENCH SOUTHERN TERRITORIES"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value "Terres australes françaises (les)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value
                                         "TERRES AUSTRALES FRANÇAISES"},
   :lcc-cr/hasNumericRegionCode "260",
   :lcc-cr/hasRemarks
   #{"No subdivisions relevant for this standard. Included also as subdivision of France (FR-TF)."
     "Comprises: Amsterdam Island, Crozet Archipelago, Kerguelen Islands, Saint Paul Island and French scattered Indian Ocean Islands formed by Bassas da India, Europa Island, Glorioso Islands, Juan de Nova Island and Tromelin Island."},
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "fr",
                :rdf/value    "Terres australes françaises (les)"},
   :skos/definition "the country of French Southern Territories (the)"})

(def GA
  {:db/ident :lcc-3166-1/GA,
   :lcc-lr/denotes :lcc-3166-1/Gabon,
   :lcc-lr/hasTag "GA",
   :lcc-lr/identifies :lcc-3166-1/Gabon,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "GA",
   :skos/definition "Alpha-2 country code for Gabon"})

(def GAB
  {:db/ident :lcc-3166-1/GAB,
   :lcc-lr/denotes :lcc-3166-1/Gabon,
   :lcc-lr/hasTag "GAB",
   :lcc-lr/identifies :lcc-3166-1/Gabon,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "GAB",
   :skos/definition "Alpha-3 country code for Gabon"})

(def GB
  {:db/ident :lcc-3166-1/GB,
   :lcc-lr/denotes :lcc-3166-1/UnitedKingdomOfGreatBritainAndNorthernIreland,
   :lcc-lr/hasTag "GB",
   :lcc-lr/identifies :lcc-3166-1/UnitedKingdomOfGreatBritainAndNorthernIreland,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "GB",
   :skos/definition
   "Alpha-2 country code for United Kingdom of Great Britain and Northern Ireland (the)"})

(def GBR
  {:db/ident :lcc-3166-1/GBR,
   :lcc-lr/denotes :lcc-3166-1/UnitedKingdomOfGreatBritainAndNorthernIreland,
   :lcc-lr/hasTag "GBR",
   :lcc-lr/identifies :lcc-3166-1/UnitedKingdomOfGreatBritainAndNorthernIreland,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "GBR",
   :skos/definition
   "Alpha-3 country code for United Kingdom of Great Britain and Northern Ireland (the)"})

(def GD
  {:db/ident :lcc-3166-1/GD,
   :lcc-lr/denotes :lcc-3166-1/Grenada,
   :lcc-lr/hasTag "GD",
   :lcc-lr/identifies :lcc-3166-1/Grenada,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "GD",
   :skos/definition "Alpha-2 country code for Grenada"})

(def GE
  {:db/ident :lcc-3166-1/GE,
   :lcc-lr/denotes :lcc-3166-1/Georgia,
   :lcc-lr/hasTag "GE",
   :lcc-lr/identifies :lcc-3166-1/Georgia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "GE",
   :skos/definition "Alpha-2 country code for Georgia"})

(def GEO
  {:db/ident :lcc-3166-1/GEO,
   :lcc-lr/denotes :lcc-3166-1/Georgia,
   :lcc-lr/hasTag "GEO",
   :lcc-lr/identifies :lcc-3166-1/Georgia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "GEO",
   :skos/definition "Alpha-3 country code for Georgia"})

(def GF
  {:db/ident :lcc-3166-1/GF,
   :lcc-lr/denotes :lcc-3166-1/FrenchGuiana,
   :lcc-lr/hasTag "GF",
   :lcc-lr/identifies :lcc-3166-1/FrenchGuiana,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "GF",
   :skos/definition "Alpha-2 country code for French Guiana"})

(def GG
  {:db/ident :lcc-3166-1/GG,
   :lcc-lr/denotes :lcc-3166-1/Guernsey,
   :lcc-lr/hasTag "GG",
   :lcc-lr/identifies :lcc-3166-1/Guernsey,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "GG",
   :skos/definition "Alpha-2 country code for Guernsey"})

(def GGY
  {:db/ident :lcc-3166-1/GGY,
   :lcc-lr/denotes :lcc-3166-1/Guernsey,
   :lcc-lr/hasTag "GGY",
   :lcc-lr/identifies :lcc-3166-1/Guernsey,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "GGY",
   :skos/definition "Alpha-3 country code for Guernsey"})

(def GH
  {:db/ident :lcc-3166-1/GH,
   :lcc-lr/denotes :lcc-3166-1/Ghana,
   :lcc-lr/hasTag "GH",
   :lcc-lr/identifies :lcc-3166-1/Ghana,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "GH",
   :skos/definition "Alpha-2 country code for Ghana"})

(def GHA
  {:db/ident :lcc-3166-1/GHA,
   :lcc-lr/denotes :lcc-3166-1/Ghana,
   :lcc-lr/hasTag "GHA",
   :lcc-lr/identifies :lcc-3166-1/Ghana,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "GHA",
   :skos/definition "Alpha-3 country code for Ghana"})

(def GI
  {:db/ident :lcc-3166-1/GI,
   :lcc-lr/denotes :lcc-3166-1/Gibraltar,
   :lcc-lr/hasTag "GI",
   :lcc-lr/identifies :lcc-3166-1/Gibraltar,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "GI",
   :skos/definition "Alpha-2 country code for Gibraltar"})

(def GIB
  {:db/ident :lcc-3166-1/GIB,
   :lcc-lr/denotes :lcc-3166-1/Gibraltar,
   :lcc-lr/hasTag "GIB",
   :lcc-lr/identifies :lcc-3166-1/Gibraltar,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "GIB",
   :skos/definition "Alpha-3 country code for Gibraltar"})

(def GIN
  {:db/ident :lcc-3166-1/GIN,
   :lcc-lr/denotes :lcc-3166-1/Guinea,
   :lcc-lr/hasTag "GIN",
   :lcc-lr/identifies :lcc-3166-1/Guinea,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "GIN",
   :skos/definition "Alpha-3 country code for Guinea"})

(def GL
  {:db/ident :lcc-3166-1/GL,
   :lcc-lr/denotes :lcc-3166-1/Greenland,
   :lcc-lr/hasTag "GL",
   :lcc-lr/identifies :lcc-3166-1/Greenland,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "GL",
   :skos/definition "Alpha-2 country code for Greenland"})

(def GLP
  {:db/ident :lcc-3166-1/GLP,
   :lcc-lr/denotes :lcc-3166-1/Guadeloupe,
   :lcc-lr/hasTag "GLP",
   :lcc-lr/identifies :lcc-3166-1/Guadeloupe,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "GLP",
   :skos/definition "Alpha-3 country code for Guadeloupe"})

(def GM
  {:db/ident :lcc-3166-1/GM,
   :lcc-lr/denotes :lcc-3166-1/Gambia,
   :lcc-lr/hasTag "GM",
   :lcc-lr/identifies :lcc-3166-1/Gambia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "GM",
   :skos/definition "Alpha-2 country code for Gambia (the)"})

(def GMB
  {:db/ident :lcc-3166-1/GMB,
   :lcc-lr/denotes :lcc-3166-1/Gambia,
   :lcc-lr/hasTag "GMB",
   :lcc-lr/identifies :lcc-3166-1/Gambia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "GMB",
   :skos/definition "Alpha-3 country code for Gambia (the)"})

(def GN
  {:db/ident :lcc-3166-1/GN,
   :lcc-lr/denotes :lcc-3166-1/Guinea,
   :lcc-lr/hasTag "GN",
   :lcc-lr/identifies :lcc-3166-1/Guinea,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "GN",
   :skos/definition "Alpha-2 country code for Guinea"})

(def GNB
  {:db/ident :lcc-3166-1/GNB,
   :lcc-lr/denotes :lcc-3166-1/Guinea-Bissau,
   :lcc-lr/hasTag "GNB",
   :lcc-lr/identifies :lcc-3166-1/Guinea-Bissau,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "GNB",
   :skos/definition "Alpha-3 country code for Guinea-Bissau"})

(def GNQ
  {:db/ident :lcc-3166-1/GNQ,
   :lcc-lr/denotes :lcc-3166-1/EquatorialGuinea,
   :lcc-lr/hasTag "GNQ",
   :lcc-lr/identifies :lcc-3166-1/EquatorialGuinea,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "GNQ",
   :skos/definition "Alpha-3 country code for Equatorial Guinea"})

(def GP
  {:db/ident :lcc-3166-1/GP,
   :lcc-lr/denotes :lcc-3166-1/Guadeloupe,
   :lcc-lr/hasTag "GP",
   :lcc-lr/identifies :lcc-3166-1/Guadeloupe,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "GP",
   :skos/definition "Alpha-2 country code for Guadeloupe"})

(def GQ
  {:db/ident :lcc-3166-1/GQ,
   :lcc-lr/denotes :lcc-3166-1/EquatorialGuinea,
   :lcc-lr/hasTag "GQ",
   :lcc-lr/identifies :lcc-3166-1/EquatorialGuinea,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "GQ",
   :skos/definition "Alpha-2 country code for Equatorial Guinea"})

(def GR
  {:db/ident :lcc-3166-1/GR,
   :lcc-lr/denotes :lcc-3166-1/Greece,
   :lcc-lr/hasTag "GR",
   :lcc-lr/identifies :lcc-3166-1/Greece,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "GR",
   :skos/definition "Alpha-2 country code for Greece"})

(def GRC
  {:db/ident :lcc-3166-1/GRC,
   :lcc-lr/denotes :lcc-3166-1/Greece,
   :lcc-lr/hasTag "GRC",
   :lcc-lr/identifies :lcc-3166-1/Greece,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "GRC",
   :skos/definition "Alpha-3 country code for Greece"})

(def GRD
  {:db/ident :lcc-3166-1/GRD,
   :lcc-lr/denotes :lcc-3166-1/Grenada,
   :lcc-lr/hasTag "GRD",
   :lcc-lr/identifies :lcc-3166-1/Grenada,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "GRD",
   :skos/definition "Alpha-3 country code for Grenada"})

(def GRL
  {:db/ident :lcc-3166-1/GRL,
   :lcc-lr/denotes :lcc-3166-1/Greenland,
   :lcc-lr/hasTag "GRL",
   :lcc-lr/identifies :lcc-3166-1/Greenland,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "GRL",
   :skos/definition "Alpha-3 country code for Greenland"})

(def GS
  {:db/ident :lcc-3166-1/GS,
   :lcc-lr/denotes :lcc-3166-1/SouthGeorgiaAndTheSouthSandwichIslands,
   :lcc-lr/hasTag "GS",
   :lcc-lr/identifies :lcc-3166-1/SouthGeorgiaAndTheSouthSandwichIslands,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "GS",
   :skos/definition
   "Alpha-2 country code for South Georgia and the South Sandwich Islands"})

(def GT
  {:db/ident :lcc-3166-1/GT,
   :lcc-lr/denotes :lcc-3166-1/Guatemala,
   :lcc-lr/hasTag "GT",
   :lcc-lr/identifies :lcc-3166-1/Guatemala,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "GT",
   :skos/definition "Alpha-2 country code for Guatemala"})

(def GTM
  {:db/ident :lcc-3166-1/GTM,
   :lcc-lr/denotes :lcc-3166-1/Guatemala,
   :lcc-lr/hasTag "GTM",
   :lcc-lr/identifies :lcc-3166-1/Guatemala,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "GTM",
   :skos/definition "Alpha-3 country code for Guatemala"})

(def GU
  {:db/ident :lcc-3166-1/GU,
   :lcc-lr/denotes :lcc-3166-1/Guam,
   :lcc-lr/hasTag "GU",
   :lcc-lr/identifies :lcc-3166-1/Guam,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "GU",
   :skos/definition "Alpha-2 country code for Guam"})

(def GUF
  {:db/ident :lcc-3166-1/GUF,
   :lcc-lr/denotes :lcc-3166-1/FrenchGuiana,
   :lcc-lr/hasTag "GUF",
   :lcc-lr/identifies :lcc-3166-1/FrenchGuiana,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "GUF",
   :skos/definition "Alpha-3 country code for French Guiana"})

(def GUM
  {:db/ident :lcc-3166-1/GUM,
   :lcc-lr/denotes :lcc-3166-1/Guam,
   :lcc-lr/hasTag "GUM",
   :lcc-lr/identifies :lcc-3166-1/Guam,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "GUM",
   :skos/definition "Alpha-3 country code for Guam"})

(def GUY
  {:db/ident :lcc-3166-1/GUY,
   :lcc-lr/denotes :lcc-3166-1/Guyana,
   :lcc-lr/hasTag "GUY",
   :lcc-lr/identifies :lcc-3166-1/Guyana,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "GUY",
   :skos/definition "Alpha-3 country code for Guyana"})

(def GW
  {:db/ident :lcc-3166-1/GW,
   :lcc-lr/denotes :lcc-3166-1/Guinea-Bissau,
   :lcc-lr/hasTag "GW",
   :lcc-lr/identifies :lcc-3166-1/Guinea-Bissau,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "GW",
   :skos/definition "Alpha-2 country code for Guinea-Bissau"})

(def GY
  {:db/ident :lcc-3166-1/GY,
   :lcc-lr/denotes :lcc-3166-1/Guyana,
   :lcc-lr/hasTag "GY",
   :lcc-lr/identifies :lcc-3166-1/Guyana,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "GY",
   :skos/definition "Alpha-2 country code for Guyana"})

(def Gabon
  {:db/ident :lcc-3166-1/Gabon,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Gabonese Republic"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Gabon"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "GABON"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République gabonaise"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Gabon (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "GABON"},
   :lcc-cr/hasNumericRegionCode "266",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "fr",
                :rdf/value    "Gabon (le)"},
   :skos/definition "the country of Gabon"})

(def Gambia
  {:db/ident :lcc-3166-1/Gambia,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of the Gambia"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Gambia (the)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "GAMBIA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République de Gambie"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Gambie (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "GAMBIE"},
   :lcc-cr/hasNumericRegionCode "270",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Gambia (the)"},
   :skos/definition "the country of Gambia (the)"})

(def Georgia
  {:db/ident :lcc-3166-1/Georgia,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Georgia"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "GEORGIA"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Géorgie (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "GÉORGIE"},
   :lcc-cr/hasLocalShortName {:rdf/language "ka",
                              :rdf/value    "Sakartvelo"},
   :lcc-cr/hasNumericRegionCode "268",
   :lcc-cr/hasRemarks
   "The code GE was formerly used for the Gilbert and Ellice Islands (GE, GEL, --) and has been reused and reassigned to Georgia. See also code element GEKI.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Georgian,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "ka",
                :rdf/value    "Sakartvelo"},
   :skos/definition "the country of Georgia"})

(def Germany
  {:db/ident :lcc-3166-1/Germany,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Federal Republic of Germany"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Germany"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "GERMANY"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value "la République fédérale d'Allemagne"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Allemagne (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "ALLEMAGNE"},
   :lcc-cr/hasLocalShortName {:rdf/language "de",
                              :rdf/value    "Deutschland"},
   :lcc-cr/hasNumericRegionCode "276",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/German,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "de",
                :rdf/value    "Deutschland"},
   :skos/definition "the country of Germany"})

(def Ghana
  {:db/ident :lcc-3166-1/Ghana,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Ghana"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Ghana"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "GHANA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Ghana"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Ghana (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "GHANA"},
   :lcc-cr/hasNumericRegionCode "288",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Ghana"},
   :skos/definition "the country of Ghana"})

(def Gibraltar
  {:db/ident :lcc-3166-1/Gibraltar,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Gibraltar"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "GIBRALTAR"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Gibraltar"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "GIBRALTAR"},
   :lcc-cr/hasNumericRegionCode "292",
   :lcc-cr/hasRemarks "No subdivisions relevant for this standard.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Gibraltar"},
   :skos/definition "the country of Gibraltar"})

(def Greece
  {:db/ident :lcc-3166-1/Greece,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Hellenic Republic"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Greece"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "GREECE"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République hellénique"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Grèce (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "GRÈCE"},
   :lcc-cr/hasLocalShortName {:rdf/language "el",
                              :rdf/value    "Elláda"},
   :lcc-cr/hasNumericRegionCode "300",
   :lcc-cr/hasRemarks "Includes: Mount Athos autonomous area.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/ModernGreek,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "el",
                :rdf/value    "Elláda"},
   :skos/definition "the country of Greece"})

(def Greenland
  {:db/ident :lcc-3166-1/Greenland,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Greenland"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "GREENLAND"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Groenland (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "GROENLAND"},
   :lcc-cr/hasLocalShortName #{{:rdf/language "da",
                                :rdf/value    "Grønland"}
                               {:rdf/language "kl",
                                :rdf/value    "Kalaallit Nunaat"}},
   :lcc-cr/hasNumericRegionCode "304",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/Kalaallisut
                                        :lcc-639-1/Danish},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "da",
                  :rdf/value    "Grønland"}
                 {:rdf/language "kl",
                  :rdf/value    "Kalaallit Nunaat"}},
   :skos/definition "the country of Greenland"})

(def Grenada
  {:db/ident :lcc-3166-1/Grenada,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Grenada"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "GRENADA"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Grenade (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "GRENADE"},
   :lcc-cr/hasNumericRegionCode "308",
   :lcc-cr/hasRemarks
   "Includes: Southern Grenadine Islands (Principal island: Carriacou).",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Grenada"},
   :skos/definition "the country of Grenada"})

(def Guadeloupe
  {:db/ident :lcc-3166-1/Guadeloupe,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Guadeloupe"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "GUADELOUPE"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Guadeloupe (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "GUADELOUPE"},
   :lcc-cr/hasNumericRegionCode "312",
   :lcc-cr/hasRemarks
   #{"No subdivisions relevant for this standard. Included also as subdivision of France (FR-GP)."
     "Includes: la Désirade, Marie-Galante, les Saintes."},
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "fr",
                :rdf/value    "Guadeloupe (la)"},
   :skos/definition "the country of Guadeloupe"})

(def Guam
  {:db/ident :lcc-3166-1/Guam,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Guam"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "GUAM"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Guam"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "GUAM"},
   :lcc-cr/hasNumericRegionCode "316",
   :lcc-cr/hasRemarks
   "No subdivisions relevant for this standard. Included also as subdivision of the United States (US-GU).",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Guam"},
   :skos/definition "the country of Guam"})

(def Guatemala
  {:db/ident :lcc-3166-1/Guatemala,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Guatemala"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Guatemala"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "GUATEMALA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Guatemala"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Guatemala (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "GUATEMALA"},
   :lcc-cr/hasLocalShortName {:rdf/language "es",
                              :rdf/value    "Guatemala"},
   :lcc-cr/hasNumericRegionCode "320",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Spanish,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "es",
                :rdf/value    "Guatemala"},
   :skos/definition "the country of Guatemala"})

(def Guernsey
  {:db/ident :lcc-3166-1/Guernsey,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Guernsey"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "GUERNSEY"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Guernesey"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "GUERNESEY"},
   :lcc-cr/hasNumericRegionCode "831",
   :lcc-cr/hasRemarks
   #{"The Bailiwick of Guernsey also includes the islands of Alderney, Brecqhou, Burhou, Herm, Jethou, Lihou, Little Sark, and Sark."
     "No subdivisions relevant for this standard."},
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/English :lcc-639-1/French},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Guernsey"}
                 {:rdf/language "fr",
                  :rdf/value    "Guernesey"}},
   :skos/definition "the country of Guernsey"})

(def Guinea
  {:db/ident :lcc-3166-1/Guinea,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Guinea"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Guinea"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "GUINEA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République de Guinée"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Guinée (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "GUINÉE"},
   :lcc-cr/hasNumericRegionCode "324",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "fr",
                :rdf/value    "Guinée (la)"},
   :skos/definition "the country of Guinea"})

(def Guinea-Bissau
  {:db/ident :lcc-3166-1/Guinea-Bissau,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Guinea-Bissau"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Guinea-Bissau"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "GUINEA-BISSAU"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République de Guinée-Bissau"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Guinée-Bissau (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "GUINÉE-BISSAU"},
   :lcc-cr/hasLocalShortName {:rdf/language "pt",
                              :rdf/value    "Guiné-Bissau (a)"},
   :lcc-cr/hasNumericRegionCode "624",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Portuguese,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "pt",
                :rdf/value    "Guiné-Bissau (a)"},
   :skos/definition "the country of Guinea-Bissau"})

(def Guyana
  {:db/ident :lcc-3166-1/Guyana,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value
                               "the Co-operative Republic of Guyana"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Guyana"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "GUYANA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value "la République coopérative du Guyana"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Guyana (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "GUYANA"},
   :lcc-cr/hasNumericRegionCode "328",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Guyana"},
   :skos/definition "the country of Guyana"})

(def HK
  {:db/ident :lcc-3166-1/HK,
   :lcc-lr/denotes :lcc-3166-1/HongKong,
   :lcc-lr/hasTag "HK",
   :lcc-lr/identifies :lcc-3166-1/HongKong,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "HK",
   :skos/definition "Alpha-2 country code for Hong Kong"})

(def HKG
  {:db/ident :lcc-3166-1/HKG,
   :lcc-lr/denotes :lcc-3166-1/HongKong,
   :lcc-lr/hasTag "HKG",
   :lcc-lr/identifies :lcc-3166-1/HongKong,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "HKG",
   :skos/definition "Alpha-3 country code for Hong Kong"})

(def HM
  {:db/ident :lcc-3166-1/HM,
   :lcc-lr/denotes :lcc-3166-1/HeardIslandAndMcDonaldIslands,
   :lcc-lr/hasTag "HM",
   :lcc-lr/identifies :lcc-3166-1/HeardIslandAndMcDonaldIslands,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "HM",
   :skos/definition
   "Alpha-2 country code for Heard Island and McDonald Islands"})

(def HMD
  {:db/ident :lcc-3166-1/HMD,
   :lcc-lr/denotes :lcc-3166-1/HeardIslandAndMcDonaldIslands,
   :lcc-lr/hasTag "HMD",
   :lcc-lr/identifies :lcc-3166-1/HeardIslandAndMcDonaldIslands,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "HMD",
   :skos/definition
   "Alpha-3 country code for Heard Island and McDonald Islands"})

(def HN
  {:db/ident :lcc-3166-1/HN,
   :lcc-lr/denotes :lcc-3166-1/Honduras,
   :lcc-lr/hasTag "HN",
   :lcc-lr/identifies :lcc-3166-1/Honduras,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "HN",
   :skos/definition "Alpha-2 country code for Honduras"})

(def HND
  {:db/ident :lcc-3166-1/HND,
   :lcc-lr/denotes :lcc-3166-1/Honduras,
   :lcc-lr/hasTag "HND",
   :lcc-lr/identifies :lcc-3166-1/Honduras,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "HND",
   :skos/definition "Alpha-3 country code for Honduras"})

(def HR
  {:db/ident :lcc-3166-1/HR,
   :lcc-lr/denotes :lcc-3166-1/Croatia,
   :lcc-lr/hasTag "HR",
   :lcc-lr/identifies :lcc-3166-1/Croatia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "HR",
   :skos/definition "Alpha-2 country code for Croatia"})

(def HRV
  {:db/ident :lcc-3166-1/HRV,
   :lcc-lr/denotes :lcc-3166-1/Croatia,
   :lcc-lr/hasTag "HRV",
   :lcc-lr/identifies :lcc-3166-1/Croatia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "HRV",
   :skos/definition "Alpha-3 country code for Croatia"})

(def HT
  {:db/ident :lcc-3166-1/HT,
   :lcc-lr/denotes :lcc-3166-1/Haiti,
   :lcc-lr/hasTag "HT",
   :lcc-lr/identifies :lcc-3166-1/Haiti,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "HT",
   :skos/definition "Alpha-2 country code for Haiti"})

(def HTI
  {:db/ident :lcc-3166-1/HTI,
   :lcc-lr/denotes :lcc-3166-1/Haiti,
   :lcc-lr/hasTag "HTI",
   :lcc-lr/identifies :lcc-3166-1/Haiti,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "HTI",
   :skos/definition "Alpha-3 country code for Haiti"})

(def HU
  {:db/ident :lcc-3166-1/HU,
   :lcc-lr/denotes :lcc-3166-1/Hungary,
   :lcc-lr/hasTag "HU",
   :lcc-lr/identifies :lcc-3166-1/Hungary,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "HU",
   :skos/definition "Alpha-2 country code for Hungary"})

(def HUN
  {:db/ident :lcc-3166-1/HUN,
   :lcc-lr/denotes :lcc-3166-1/Hungary,
   :lcc-lr/hasTag "HUN",
   :lcc-lr/identifies :lcc-3166-1/Hungary,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "HUN",
   :skos/definition "Alpha-3 country code for Hungary"})

(def Haiti
  {:db/ident :lcc-3166-1/Haiti,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Haiti"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Haiti"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "HAITI"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République d'Haïti"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Haïti"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "HAÏTI"},
   :lcc-cr/hasLocalShortName {:rdf/language "ht",
                              :rdf/value    "Ayiti"},
   :lcc-cr/hasNumericRegionCode "332",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/Haitian :lcc-639-1/French},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "fr",
                  :rdf/value    "Haïti"}
                 {:rdf/language "ht",
                  :rdf/value    "Ayiti"}},
   :skos/definition "the country of Haiti"})

(def HeardIslandAndMcDonaldIslands
  {:db/ident :lcc-3166-1/HeardIslandAndMcDonaldIslands,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value "Heard Island and McDonald Islands"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value
                                          "HEARD ISLAND AND MCDONALD ISLANDS"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "ll'Île Heard-et-Îles MacDonald"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Heard-et-Îles MacDonald (l'Île)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value
                                         "HEARD-ET-ÎLES MACDONALD, ÎLE"},
   :lcc-cr/hasNumericRegionCode "334",
   :lcc-cr/hasRemarks "No subdivisions relevant for this standard.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Heard Island and McDonald Islands"},
   :skos/definition "the country of Heard Island and McDonald Islands"})

(def HolySee
  {:db/ident :lcc-3166-1/HolySee,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Holy See (the)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "HOLY SEE"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Saint-Siège (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "SAINT-SIÈGE"},
   :lcc-cr/hasLocalShortName #{{:rdf/language "it",
                                :rdf/value    "Santa Sede (la)"}
                               {:rdf/language "la",
                                :rdf/value    "Sancta Sedes"}},
   :lcc-cr/hasNumericRegionCode "336",
   :lcc-cr/hasRemarks #{"Previous entry: VATICAN CITY STATE (HOLY SEE)."
                        "No subdivisions relevant for this standard."},
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/Latin :lcc-639-1/Italian},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "it",
                  :rdf/value    "Santa Sede (la)"}
                 {:rdf/language "la",
                  :rdf/value    "Sancta Sedes"}},
   :skos/definition "the country of Holy See (the)"})

(def Honduras
  {:db/ident :lcc-3166-1/Honduras,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Honduras"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Honduras"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "HONDURAS"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Honduras"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Honduras (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "HONDURAS"},
   :lcc-cr/hasLocalShortName {:rdf/language "es",
                              :rdf/value    "Honduras"},
   :lcc-cr/hasNumericRegionCode "340",
   :lcc-cr/hasRemarks "Includes: Swan Islands.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Spanish,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "es",
                :rdf/value    "Honduras"},
   :skos/definition "the country of Honduras"})

(def HongKong
  {:db/ident :lcc-3166-1/HongKong,
   :lcc-cr/hasEnglishFullName
   {:rdf/language "en",
    :rdf/value    "the Hong Kong Special Administrative Region of China"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Hong Kong"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "HONG KONG"},
   :lcc-cr/hasFrenchFullName
   {:rdf/language "fr",
    :rdf/value    "Hong Kong, Région administrative spéciale de Chine (la)"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Hong Kong"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "HONG KONG"},
   :lcc-cr/hasLocalShortName {:rdf/language "zh",
                              :rdf/value    "Xianggang"},
   :lcc-cr/hasNumericRegionCode "344",
   :lcc-cr/hasRemarks
   "No subdivisions relevant for this standard. Included also as subdivision of China (CN-HK).",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/Chinese :lcc-639-1/English},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Hong Kong"}
                 {:rdf/language "zh",
                  :rdf/value    "Xianggang"}},
   :skos/definition "the country of Hong Kong"})

(def Hungary
  {:db/ident :lcc-3166-1/Hungary,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Hungary"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "HUNGARY"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Hongrie (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "HONGRIE"},
   :lcc-cr/hasLocalShortName {:rdf/language "hu",
                              :rdf/value    "Magyarország"},
   :lcc-cr/hasNumericRegionCode "348",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Hungarian,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "hu",
                :rdf/value    "Magyarország"},
   :skos/definition "the country of Hungary"})

(def ID
  {:db/ident :lcc-3166-1/ID,
   :lcc-lr/denotes :lcc-3166-1/Indonesia,
   :lcc-lr/hasTag "ID",
   :lcc-lr/identifies :lcc-3166-1/Indonesia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "ID",
   :skos/definition "Alpha-2 country code for Indonesia"})

(def IDN
  {:db/ident :lcc-3166-1/IDN,
   :lcc-lr/denotes :lcc-3166-1/Indonesia,
   :lcc-lr/hasTag "IDN",
   :lcc-lr/identifies :lcc-3166-1/Indonesia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "IDN",
   :skos/definition "Alpha-3 country code for Indonesia"})

(def IE
  {:db/ident :lcc-3166-1/IE,
   :lcc-lr/denotes :lcc-3166-1/Ireland,
   :lcc-lr/hasTag "IE",
   :lcc-lr/identifies :lcc-3166-1/Ireland,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "IE",
   :skos/definition "Alpha-2 country code for Ireland"})

(def IL
  {:db/ident :lcc-3166-1/IL,
   :lcc-lr/denotes :lcc-3166-1/Israel,
   :lcc-lr/hasTag "IL",
   :lcc-lr/identifies :lcc-3166-1/Israel,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "IL",
   :skos/definition "Alpha-2 country code for Israel"})

(def IM
  {:db/ident :lcc-3166-1/IM,
   :lcc-lr/denotes :lcc-3166-1/IsleOfMan,
   :lcc-lr/hasTag "IM",
   :lcc-lr/identifies :lcc-3166-1/IsleOfMan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "IM",
   :skos/definition "Alpha-2 country code for Isle of Man"})

(def IMN
  {:db/ident :lcc-3166-1/IMN,
   :lcc-lr/denotes :lcc-3166-1/IsleOfMan,
   :lcc-lr/hasTag "IMN",
   :lcc-lr/identifies :lcc-3166-1/IsleOfMan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "IMN",
   :skos/definition "Alpha-3 country code for Isle of Man"})

(def IN
  {:db/ident :lcc-3166-1/IN,
   :lcc-lr/denotes :lcc-3166-1/India,
   :lcc-lr/hasTag "IN",
   :lcc-lr/identifies :lcc-3166-1/India,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "IN",
   :skos/definition "Alpha-2 country code for India"})

(def IND
  {:db/ident :lcc-3166-1/IND,
   :lcc-lr/denotes :lcc-3166-1/India,
   :lcc-lr/hasTag "IND",
   :lcc-lr/identifies :lcc-3166-1/India,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "IND",
   :skos/definition "Alpha-3 country code for India"})

(def IO
  {:db/ident :lcc-3166-1/IO,
   :lcc-lr/denotes :lcc-3166-1/BritishIndianOceanTerritory,
   :lcc-lr/hasTag "IO",
   :lcc-lr/identifies :lcc-3166-1/BritishIndianOceanTerritory,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "IO",
   :skos/definition
   "Alpha-2 country code for British Indian Ocean Territory (the)"})

(def IOT
  {:db/ident :lcc-3166-1/IOT,
   :lcc-lr/denotes :lcc-3166-1/BritishIndianOceanTerritory,
   :lcc-lr/hasTag "IOT",
   :lcc-lr/identifies :lcc-3166-1/BritishIndianOceanTerritory,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "IOT",
   :skos/definition
   "Alpha-3 country code for British Indian Ocean Territory (the)"})

(def IQ
  {:db/ident :lcc-3166-1/IQ,
   :lcc-lr/denotes :lcc-3166-1/Iraq,
   :lcc-lr/hasTag "IQ",
   :lcc-lr/identifies :lcc-3166-1/Iraq,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "IQ",
   :skos/definition "Alpha-2 country code for Iraq"})

(def IR
  {:db/ident :lcc-3166-1/IR,
   :lcc-lr/denotes :lcc-3166-1/Iran,
   :lcc-lr/hasTag "IR",
   :lcc-lr/identifies :lcc-3166-1/Iran,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "IR",
   :skos/definition "Alpha-2 country code for Iran (Islamic Republic of)"})

(def IRL
  {:db/ident :lcc-3166-1/IRL,
   :lcc-lr/denotes :lcc-3166-1/Ireland,
   :lcc-lr/hasTag "IRL",
   :lcc-lr/identifies :lcc-3166-1/Ireland,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "IRL",
   :skos/definition "Alpha-3 country code for Ireland"})

(def IRN
  {:db/ident :lcc-3166-1/IRN,
   :lcc-lr/denotes :lcc-3166-1/Iran,
   :lcc-lr/hasTag "IRN",
   :lcc-lr/identifies :lcc-3166-1/Iran,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "IRN",
   :skos/definition "Alpha-3 country code for Iran (Islamic Republic of)"})

(def IRQ
  {:db/ident :lcc-3166-1/IRQ,
   :lcc-lr/denotes :lcc-3166-1/Iraq,
   :lcc-lr/hasTag "IRQ",
   :lcc-lr/identifies :lcc-3166-1/Iraq,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "IRQ",
   :skos/definition "Alpha-3 country code for Iraq"})

(def IS
  {:db/ident :lcc-3166-1/IS,
   :lcc-lr/denotes :lcc-3166-1/Iceland,
   :lcc-lr/hasTag "IS",
   :lcc-lr/identifies :lcc-3166-1/Iceland,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "IS",
   :skos/definition "Alpha-2 country code for Iceland"})

(def ISL
  {:db/ident :lcc-3166-1/ISL,
   :lcc-lr/denotes :lcc-3166-1/Iceland,
   :lcc-lr/hasTag "ISL",
   :lcc-lr/identifies :lcc-3166-1/Iceland,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "ISL",
   :skos/definition "Alpha-3 country code for Iceland"})

(def ISO3166-1-Alpha2-CodeSet
  {:db/ident :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-lr/CodeSet :owl/NamedIndividual
               :lcc-lr/IdentificationScheme},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "ISO 3166-1 code set",
   :skos/definition
   "the set of country identifiers that comprise the 2 character codes in the ISO 3166-1 specification"})

(def ISO3166-1-Alpha3-CodeSet
  {:db/ident :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-lr/CodeSet :owl/NamedIndividual
               :lcc-lr/IdentificationScheme},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "ISO 3166-1 code set",
   :skos/definition
   "the set of country identifiers that comprise the 3 character codes in the ISO 3166-1 specification"})

(def ISO639-3-CodeSet
  {:db/ident :lcc-3166-1/ISO639-3-CodeSet,
   :rdf/type #{:lcc-lr/CodeSet :owl/NamedIndividual
               :lcc-lr/IdentificationScheme},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "ISO 639-3 code set",
   :rdfs/seeAlso {:xsd/anyURI "https://iso639-3.sil.org/code_tables/639/data/"},
   :skos/definition
   "the set of language identifiers that comprise the ISO 639-3 specification"})

(def ISR
  {:db/ident :lcc-3166-1/ISR,
   :lcc-lr/denotes :lcc-3166-1/Israel,
   :lcc-lr/hasTag "ISR",
   :lcc-lr/identifies :lcc-3166-1/Israel,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "ISR",
   :skos/definition "Alpha-3 country code for Israel"})

(def IT
  {:db/ident :lcc-3166-1/IT,
   :lcc-lr/denotes :lcc-3166-1/Italy,
   :lcc-lr/hasTag "IT",
   :lcc-lr/identifies :lcc-3166-1/Italy,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "IT",
   :skos/definition "Alpha-2 country code for Italy"})

(def ITA
  {:db/ident :lcc-3166-1/ITA,
   :lcc-lr/denotes :lcc-3166-1/Italy,
   :lcc-lr/hasTag "ITA",
   :lcc-lr/identifies :lcc-3166-1/Italy,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "ITA",
   :skos/definition "Alpha-3 country code for Italy"})

(def Iceland
  {:db/ident :lcc-3166-1/Iceland,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Iceland"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Iceland"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "ICELAND"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République d'Islande"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Islande (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "ISLANDE"},
   :lcc-cr/hasLocalShortName {:rdf/language "is",
                              :rdf/value    "Ísland"},
   :lcc-cr/hasNumericRegionCode "352",
   :lcc-cr/hasRemarks
   "Remark: The Icelandic characters ð (eze) and þ (thorn) may be written as “dh” and “th”.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Icelandic,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "is",
                :rdf/value    "Ísland"},
   :skos/definition "the country of Iceland"})

(def India
  {:db/ident :lcc-3166-1/India,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of India"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "India"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "INDIA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République de l'Inde"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Inde (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "INDE"},
   :lcc-cr/hasLocalShortName {:rdf/language "hi",
                              :rdf/value    "Bhārat"},
   :lcc-cr/hasNumericRegionCode "356",
   :lcc-cr/hasRemarks
   #{"Includes: Amindivi Islands, Andaman Islands, Laccadive Islands, Minicoy Island, Nicobar Islands."
     "Remark: the forms used in the list are English-language forms provided by India."},
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/Hindi :lcc-639-1/English},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "India"}
                 {:rdf/language "hi",
                  :rdf/value    "Bhārat"}},
   :skos/definition "the country of India"})

(def Indonesia
  {:db/ident :lcc-3166-1/Indonesia,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Indonesia"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Indonesia"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "INDONESIA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République d'Indonésie"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Indonésie (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "INDONÉSIE"},
   :lcc-cr/hasLocalShortName {:rdf/language "id",
                              :rdf/value    "Indonesia"},
   :lcc-cr/hasNumericRegionCode "360",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Indonesian,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "id",
                :rdf/value    "Indonesia"},
   :skos/definition "the country of Indonesia"})

(def Iran
  {:db/ident :lcc-3166-1/Iran,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Islamic Republic of Iran"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Iran (Islamic Republic of)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value
                                          "IRAN (ISLAMIC REPUBLIC OF)"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République islamique d'Iran"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Iran (République Islamique d')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value
                                         "IRAN (RÉPUBLIQUE ISLAMIQUE D')"},
   :lcc-cr/hasLocalShortName {:rdf/language "fa",
                              :rdf/value    "Jomhūrī-ye Eslāmī-ye Īrān"},
   :lcc-cr/hasNumericRegionCode "364",
   :lcc-cr/hasRemarks "Also referred to as Iran.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Persian,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "fa",
                :rdf/value    "Jomhūrī-ye Eslāmī-ye Īrān"},
   :skos/definition "the country of Iran (Islamic Republic of)"})

(def Iraq
  {:db/ident :lcc-3166-1/Iraq,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Iraq"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Iraq"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "IRAQ"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République d'Iraq"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Iraq (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "IRAQ"},
   :lcc-cr/hasLocalShortName #{{:rdf/language "ar",
                                :rdf/value    "Al ‘Irāq"}
                               {:rdf/language "ku",
                                :rdf/value    "‘Êraq"}},
   :lcc-cr/hasNumericRegionCode "368",
   :lcc-cr/hasRemarks
   "Kurdish and Arabic are both official languages according to the Iraqi constitution, which states “The federal and official institutions and agencies in the Kurdistan region shall use both languages.”",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/Arabic :lcc-639-1/Kurdish},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "ar",
                  :rdf/value    "Al ‘Irāq"}
                 {:rdf/language "ku",
                  :rdf/value    "‘Êraq"}},
   :skos/definition "the country of Iraq"})

(def Ireland
  {:db/ident :lcc-3166-1/Ireland,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Ireland"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "IRELAND"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Irlande (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "IRLANDE"},
   :lcc-cr/hasLocalShortName {:rdf/language "ga",
                              :rdf/value    "Éire"},
   :lcc-cr/hasNumericRegionCode "372",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/English :lcc-639-1/Irish},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Ireland"}
                 {:rdf/language "ga",
                  :rdf/value    "Éire"}},
   :skos/definition "the country of Ireland"})

(def IsleOfMan
  {:db/ident :lcc-3166-1/IsleOfMan,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Isle of Man"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "ISLE OF MAN"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Île de Man"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "ÎLE DE MAN"},
   :lcc-cr/hasNumericRegionCode "833",
   :lcc-cr/hasRemarks "No subdivisions relevant for this standard.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Isle of Man"},
   :skos/definition "the country of Isle of Man"})

(def Israel
  {:db/ident :lcc-3166-1/Israel,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the State of Israel"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Israel"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "ISRAEL"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "l'État d'Israël"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Israël"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "ISRAËL"},
   :lcc-cr/hasLocalShortName #{{:rdf/language "he",
                                :rdf/value    "Yisra'el"}
                               {:rdf/language "ar",
                                :rdf/value    "Isrā'īl"}},
   :lcc-cr/hasNumericRegionCode "376",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/Hebrew :lcc-639-1/Arabic},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "he",
                  :rdf/value    "Yisra'el"}
                 {:rdf/language "ar",
                  :rdf/value    "Isrā'īl"}},
   :skos/definition "the country of Israel"})

(def Italy
  {:db/ident :lcc-3166-1/Italy,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Italy"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Italy"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "ITALY"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République italienne"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Italie (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "ITALIE"},
   :lcc-cr/hasLocalShortName {:rdf/language "it",
                              :rdf/value    "Italia (l')"},
   :lcc-cr/hasNumericRegionCode "380",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Italian,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "it",
                :rdf/value    "Italia (l')"},
   :skos/definition "the country of Italy"})

(def JAM
  {:db/ident :lcc-3166-1/JAM,
   :lcc-lr/denotes :lcc-3166-1/Jamaica,
   :lcc-lr/hasTag "JAM",
   :lcc-lr/identifies :lcc-3166-1/Jamaica,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "JAM",
   :skos/definition "Alpha-3 country code for Jamaica"})

(def JE
  {:db/ident :lcc-3166-1/JE,
   :lcc-lr/denotes :lcc-3166-1/Jersey,
   :lcc-lr/hasTag "JE",
   :lcc-lr/identifies :lcc-3166-1/Jersey,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "JE",
   :skos/definition "Alpha-2 country code for Jersey"})

(def JEY
  {:db/ident :lcc-3166-1/JEY,
   :lcc-lr/denotes :lcc-3166-1/Jersey,
   :lcc-lr/hasTag "JEY",
   :lcc-lr/identifies :lcc-3166-1/Jersey,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "JEY",
   :skos/definition "Alpha-3 country code for Jersey"})

(def JM
  {:db/ident :lcc-3166-1/JM,
   :lcc-lr/denotes :lcc-3166-1/Jamaica,
   :lcc-lr/hasTag "JM",
   :lcc-lr/identifies :lcc-3166-1/Jamaica,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "JM",
   :skos/definition "Alpha-2 country code for Jamaica"})

(def JO
  {:db/ident :lcc-3166-1/JO,
   :lcc-lr/denotes :lcc-3166-1/Jordan,
   :lcc-lr/hasTag "JO",
   :lcc-lr/identifies :lcc-3166-1/Jordan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "JO",
   :skos/definition "Alpha-2 country code for Jordan"})

(def JOR
  {:db/ident :lcc-3166-1/JOR,
   :lcc-lr/denotes :lcc-3166-1/Jordan,
   :lcc-lr/hasTag "JOR",
   :lcc-lr/identifies :lcc-3166-1/Jordan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "JOR",
   :skos/definition "Alpha-3 country code for Jordan"})

(def JP
  {:db/ident :lcc-3166-1/JP,
   :lcc-lr/denotes :lcc-3166-1/Japan,
   :lcc-lr/hasTag "JP",
   :lcc-lr/identifies :lcc-3166-1/Japan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "JP",
   :skos/definition "Alpha-2 country code for Japan"})

(def JPN
  {:db/ident :lcc-3166-1/JPN,
   :lcc-lr/denotes :lcc-3166-1/Japan,
   :lcc-lr/hasTag "JPN",
   :lcc-lr/identifies :lcc-3166-1/Japan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "JPN",
   :skos/definition "Alpha-3 country code for Japan"})

(def Jamaica
  {:db/ident :lcc-3166-1/Jamaica,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Jamaica"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "JAMAICA"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Jamaïque (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "JAMAÏQUE"},
   :lcc-cr/hasNumericRegionCode "388",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Jamaica"},
   :skos/definition "the country of Jamaica"})

(def Japan
  {:db/ident :lcc-3166-1/Japan,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Japan"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "JAPAN"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Japon (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "JAPON"},
   :lcc-cr/hasLocalShortName {:rdf/language "ja",
                              :rdf/value    "Nihon/Nippon"},
   :lcc-cr/hasNumericRegionCode "392",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Japanese,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "ja",
                :rdf/value    "Nihon/Nippon"},
   :skos/definition "the country of Japan"})

(def Jersey
  {:db/ident :lcc-3166-1/Jersey,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Jersey"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "JERSEY"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Jersey"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "JERSEY"},
   :lcc-cr/hasNumericRegionCode "832",
   :lcc-cr/hasRemarks "No subdivisions relevant for this standard.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/English :lcc-639-1/French},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Jersey"}
                 {:rdf/language "fr",
                  :rdf/value    "Jersey"}},
   :skos/definition "the country of Jersey"})

(def Jordan
  {:db/ident :lcc-3166-1/Jordan,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Hashemite Kingdom of Jordan"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Jordan"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "JORDAN"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "le Royaume hachémite de Jordanie"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Jordanie (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "JORDANIE"},
   :lcc-cr/hasLocalShortName {:rdf/language "ar",
                              :rdf/value    "Al Urdun"},
   :lcc-cr/hasNumericRegionCode "400",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Arabic,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "ar",
                :rdf/value    "Al Urdun"},
   :skos/definition "the country of Jordan"})

(def KAZ
  {:db/ident :lcc-3166-1/KAZ,
   :lcc-lr/denotes :lcc-3166-1/Kazakhstan,
   :lcc-lr/hasTag "KAZ",
   :lcc-lr/identifies :lcc-3166-1/Kazakhstan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "KAZ",
   :skos/definition "Alpha-3 country code for Kazakhstan"})

(def KE
  {:db/ident :lcc-3166-1/KE,
   :lcc-lr/denotes :lcc-3166-1/Kenya,
   :lcc-lr/hasTag "KE",
   :lcc-lr/identifies :lcc-3166-1/Kenya,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "KE",
   :skos/definition "Alpha-2 country code for Kenya"})

(def KEN
  {:db/ident :lcc-3166-1/KEN,
   :lcc-lr/denotes :lcc-3166-1/Kenya,
   :lcc-lr/hasTag "KEN",
   :lcc-lr/identifies :lcc-3166-1/Kenya,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "KEN",
   :skos/definition "Alpha-3 country code for Kenya"})

(def KG
  {:db/ident :lcc-3166-1/KG,
   :lcc-lr/denotes :lcc-3166-1/Kyrgyzstan,
   :lcc-lr/hasTag "KG",
   :lcc-lr/identifies :lcc-3166-1/Kyrgyzstan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "KG",
   :skos/definition "Alpha-2 country code for Kyrgyzstan"})

(def KGZ
  {:db/ident :lcc-3166-1/KGZ,
   :lcc-lr/denotes :lcc-3166-1/Kyrgyzstan,
   :lcc-lr/hasTag "KGZ",
   :lcc-lr/identifies :lcc-3166-1/Kyrgyzstan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "KGZ",
   :skos/definition "Alpha-3 country code for Kyrgyzstan"})

(def KH
  {:db/ident :lcc-3166-1/KH,
   :lcc-lr/denotes :lcc-3166-1/Cambodia,
   :lcc-lr/hasTag "KH",
   :lcc-lr/identifies :lcc-3166-1/Cambodia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "KH",
   :skos/definition "Alpha-2 country code for Cambodia"})

(def KHM
  {:db/ident :lcc-3166-1/KHM,
   :lcc-lr/denotes :lcc-3166-1/Cambodia,
   :lcc-lr/hasTag "KHM",
   :lcc-lr/identifies :lcc-3166-1/Cambodia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "KHM",
   :skos/definition "Alpha-3 country code for Cambodia"})

(def KI
  {:db/ident :lcc-3166-1/KI,
   :lcc-lr/denotes :lcc-3166-1/Kiribati,
   :lcc-lr/hasTag "KI",
   :lcc-lr/identifies :lcc-3166-1/Kiribati,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "KI",
   :skos/definition "Alpha-2 country code for Kiribati"})

(def KIR
  {:db/ident :lcc-3166-1/KIR,
   :lcc-lr/denotes :lcc-3166-1/Kiribati,
   :lcc-lr/hasTag "KIR",
   :lcc-lr/identifies :lcc-3166-1/Kiribati,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "KIR",
   :skos/definition "Alpha-3 country code for Kiribati"})

(def KM
  {:db/ident :lcc-3166-1/KM,
   :lcc-lr/denotes :lcc-3166-1/Comoros,
   :lcc-lr/hasTag "KM",
   :lcc-lr/identifies :lcc-3166-1/Comoros,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "KM",
   :skos/definition "Alpha-2 country code for Comoros (the)"})

(def KN
  {:db/ident :lcc-3166-1/KN,
   :lcc-lr/denotes :lcc-3166-1/SaintKittsAndNevis,
   :lcc-lr/hasTag "KN",
   :lcc-lr/identifies :lcc-3166-1/SaintKittsAndNevis,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "KN",
   :skos/definition "Alpha-2 country code for Saint Kitts and Nevis"})

(def KNA
  {:db/ident :lcc-3166-1/KNA,
   :lcc-lr/denotes :lcc-3166-1/SaintKittsAndNevis,
   :lcc-lr/hasTag "KNA",
   :lcc-lr/identifies :lcc-3166-1/SaintKittsAndNevis,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "KNA",
   :skos/definition "Alpha-3 country code for Saint Kitts and Nevis"})

(def KOR
  {:db/ident :lcc-3166-1/KOR,
   :lcc-lr/denotes :lcc-3166-1/KoreaRepublicOf,
   :lcc-lr/hasTag "KOR",
   :lcc-lr/identifies :lcc-3166-1/KoreaRepublicOf,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "KOR",
   :skos/definition "Alpha-3 country code for Korea Republic Of"})

(def KP
  {:db/ident :lcc-3166-1/KP,
   :lcc-lr/denotes :lcc-3166-1/KoreaDemocraticPeoplesRepublicOf,
   :lcc-lr/hasTag "KP",
   :lcc-lr/identifies :lcc-3166-1/KoreaDemocraticPeoplesRepublicOf,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "KP",
   :skos/definition
   "Alpha-2 country code for Korea Democratic Peoples Republic Of"})

(def KR
  {:db/ident :lcc-3166-1/KR,
   :lcc-lr/denotes :lcc-3166-1/KoreaRepublicOf,
   :lcc-lr/hasTag "KR",
   :lcc-lr/identifies :lcc-3166-1/KoreaRepublicOf,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "KR",
   :skos/definition "Alpha-2 country code for Korea Republic Of"})

(def KW
  {:db/ident :lcc-3166-1/KW,
   :lcc-lr/denotes :lcc-3166-1/Kuwait,
   :lcc-lr/hasTag "KW",
   :lcc-lr/identifies :lcc-3166-1/Kuwait,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "KW",
   :skos/definition "Alpha-2 country code for Kuwait"})

(def KWT
  {:db/ident :lcc-3166-1/KWT,
   :lcc-lr/denotes :lcc-3166-1/Kuwait,
   :lcc-lr/hasTag "KWT",
   :lcc-lr/identifies :lcc-3166-1/Kuwait,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "KWT",
   :skos/definition "Alpha-3 country code for Kuwait"})

(def KY
  {:db/ident :lcc-3166-1/KY,
   :lcc-lr/denotes :lcc-3166-1/CaymanIslands,
   :lcc-lr/hasTag "KY",
   :lcc-lr/identifies :lcc-3166-1/CaymanIslands,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "KY",
   :skos/definition "Alpha-2 country code for Cayman Islands (the)"})

(def KZ
  {:db/ident :lcc-3166-1/KZ,
   :lcc-lr/denotes :lcc-3166-1/Kazakhstan,
   :lcc-lr/hasTag "KZ",
   :lcc-lr/identifies :lcc-3166-1/Kazakhstan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "KZ",
   :skos/definition "Alpha-2 country code for Kazakhstan"})

(def Kazakhstan
  {:db/ident :lcc-3166-1/Kazakhstan,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Kazakhstan"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Kazakhstan"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "KAZAKHSTAN"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Kazakhstan"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Kazakhstan (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "KAZAKHSTAN"},
   :lcc-cr/hasLocalShortName #{{:rdf/language "ru",
                                :rdf/value    "Kazahstan"}
                               {:rdf/language "kk",
                                :rdf/value    "Qazaqstan"}},
   :lcc-cr/hasNumericRegionCode "398",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/Russian :lcc-639-1/Kazakh},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "ru",
                  :rdf/value    "Kazahstan"}
                 {:rdf/language "kk",
                  :rdf/value    "Qazaqstan"}},
   :skos/definition "the country of Kazakhstan"})

(def Kenya
  {:db/ident :lcc-3166-1/Kenya,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Kenya"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Kenya"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "KENYA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Kenya"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Kenya (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "KENYA"},
   :lcc-cr/hasLocalShortName {:rdf/language "sw",
                              :rdf/value    "Kenya"},
   :lcc-cr/hasNumericRegionCode "404",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/Swahili :lcc-639-1/English},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "sw",
                  :rdf/value    "Kenya"}
                 {:rdf/language "en",
                  :rdf/value    "Kenya"}},
   :skos/definition "the country of Kenya"})

(def Kiribati
  {:db/ident :lcc-3166-1/Kiribati,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Kiribati"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Kiribati"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "KIRIBATI"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République de Kiribati"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Kiribati"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "KIRIBATI"},
   :lcc-cr/hasLocalShortName "Kiribati",
   :lcc-cr/hasNumericRegionCode "296",
   :lcc-cr/hasRemarks
   "Comprises: Gilbert Islands (Principal atoll: Tarawa, including Banaba), part of Line Islands (including Kiritimati), Phoenix Islands (including Abariringa, Enderbury Island).",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/English
                                        :lcc-639-2/Gilbertese},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Kiribati"},
   :skos/definition "the country of Kiribati"})

(def KoreaDemocraticPeoplesRepublicOf
  {:db/ident :lcc-3166-1/KoreaDemocraticPeoplesRepublicOf,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value
                               "the Democratic People's Republic of Korea"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value
                                "Korea (the Democratic People's Republic of)"},
   :lcc-cr/hasEnglishShortNameInCapitals
   {:rdf/language "en",
    :rdf/value    "KOREA (DEMOCRATIC PEOPLE'S REPUBLIC OF)"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value
                              "la République populaire démocratique de Corée"},
   :lcc-cr/hasFrenchShortName
   {:rdf/language "fr",
    :rdf/value    "Corée (la République populaire démocratique de)"},
   :lcc-cr/hasFrenchShortNameInCapitals
   {:rdf/language "fr",
    :rdf/value    "CORÉE, RÉPUBLIQUE POPULAIRE DÉMOCRATIQUE DE"},
   :lcc-cr/hasLocalShortName {:rdf/language "ko",
                              :rdf/value    "Chosŏn"},
   :lcc-cr/hasNumericRegionCode "408",
   :lcc-cr/hasRemarks "Often referred to as North Korea.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Korean,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "ko",
                :rdf/value    "Chosŏn"},
   :skos/definition "the country of Korea Democratic Peoples Republic Of"})

(def KoreaRepublicOf
  {:db/ident :lcc-3166-1/KoreaRepublicOf,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Korea"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Korea (the Republic of)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "KOREA, REPUBLIC OF"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République de Corée"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Corée (la République de)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "CORÉE, RÉPUBLIQUE DE"},
   :lcc-cr/hasLocalShortName {:rdf/language "ko",
                              :rdf/value    "Hanguk"},
   :lcc-cr/hasNumericRegionCode "410",
   :lcc-cr/hasRemarks "Often referred to as South Korea.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Korean,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "ko",
                :rdf/value    "Hanguk"},
   :skos/definition "the country of Korea Republic Of"})

(def Kuwait
  {:db/ident :lcc-3166-1/Kuwait,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the State of Kuwait"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Kuwait"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "KUWAIT"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "l'État du Koweït"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Koweït (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "KOWEÏT"},
   :lcc-cr/hasLocalShortName {:rdf/language "ar",
                              :rdf/value    "Al Kuwayt"},
   :lcc-cr/hasNumericRegionCode "414",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Arabic,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "ar",
                :rdf/value    "Al Kuwayt"},
   :skos/definition "the country of Kuwait"})

(def Kyrgyzstan
  {:db/ident :lcc-3166-1/Kyrgyzstan,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Kyrgyz Republic"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Kyrgyzstan"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "KYRGYZSTAN"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République kirghize"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Kirghizistan (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "KIRGHIZISTAN"},
   :lcc-cr/hasLocalShortName #{{:rdf/language "ru",
                                :rdf/value    "Kyrgyzstan"}
                               {:rdf/language "ky",
                                :rdf/value    "Kyrgyzstan"}},
   :lcc-cr/hasNumericRegionCode "417",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/Russian :lcc-639-1/Kirghiz},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "ru",
                  :rdf/value    "Kyrgyzstan"}
                 {:rdf/language "ky",
                  :rdf/value    "Kyrgyzstan"}},
   :skos/definition "the country of Kyrgyzstan"})

(def L001
  {:db/ident       :lcc-3166-1/L001,
   :owl/deprecated true,
   :owl/sameAs     :lcc-639-2/cnr,
   :rdf/type       #{:lcc-lr/IndividualLanguageIdentifier
                     :owl/NamedIndividual}})

(def L002
  {:db/ident :lcc-3166-1/L002,
   :lcc-lr/denotes :lcc-3166-1/Shikomor,
   :lcc-lr/hasTag "002",
   :lcc-lr/identifies :lcc-3166-1/Shikomor,
   :rdf/type #{:lcc-lr/IndividualLanguageIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "002",
   :skos/definition "Alpha-3 language code for Shikomor"})

(def LA
  {:db/ident :lcc-3166-1/LA,
   :lcc-lr/denotes :lcc-3166-1/LaoPeoplesDemocraticRepublic,
   :lcc-lr/hasTag "LA",
   :lcc-lr/identifies :lcc-3166-1/LaoPeoplesDemocraticRepublic,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "LA",
   :skos/definition
   "Alpha-2 country code for Lao People's Democratic Republic (the)"})

(def LAO
  {:db/ident :lcc-3166-1/LAO,
   :lcc-lr/denotes :lcc-3166-1/LaoPeoplesDemocraticRepublic,
   :lcc-lr/hasTag "LAO",
   :lcc-lr/identifies :lcc-3166-1/LaoPeoplesDemocraticRepublic,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "LAO",
   :skos/definition
   "Alpha-3 country code for Lao People's Democratic Republic (the)"})

(def LB
  {:db/ident :lcc-3166-1/LB,
   :lcc-lr/denotes :lcc-3166-1/Lebanon,
   :lcc-lr/hasTag "LB",
   :lcc-lr/identifies :lcc-3166-1/Lebanon,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "LB",
   :skos/definition "Alpha-2 country code for Lebanon"})

(def LBN
  {:db/ident :lcc-3166-1/LBN,
   :lcc-lr/denotes :lcc-3166-1/Lebanon,
   :lcc-lr/hasTag "LBN",
   :lcc-lr/identifies :lcc-3166-1/Lebanon,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "LBN",
   :skos/definition "Alpha-3 country code for Lebanon"})

(def LBR
  {:db/ident :lcc-3166-1/LBR,
   :lcc-lr/denotes :lcc-3166-1/Liberia,
   :lcc-lr/hasTag "LBR",
   :lcc-lr/identifies :lcc-3166-1/Liberia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "LBR",
   :skos/definition "Alpha-3 country code for Liberia"})

(def LBY
  {:db/ident :lcc-3166-1/LBY,
   :lcc-lr/denotes :lcc-3166-1/Libya,
   :lcc-lr/hasTag "LBY",
   :lcc-lr/identifies :lcc-3166-1/Libya,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "LBY",
   :skos/definition "Alpha-3 country code for Libya"})

(def LC
  {:db/ident :lcc-3166-1/LC,
   :lcc-lr/denotes :lcc-3166-1/SaintLucia,
   :lcc-lr/hasTag "LC",
   :lcc-lr/identifies :lcc-3166-1/SaintLucia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "LC",
   :skos/definition "Alpha-2 country code for Saint Lucia"})

(def LCA
  {:db/ident :lcc-3166-1/LCA,
   :lcc-lr/denotes :lcc-3166-1/SaintLucia,
   :lcc-lr/hasTag "LCA",
   :lcc-lr/identifies :lcc-3166-1/SaintLucia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "LCA",
   :skos/definition "Alpha-3 country code for Saint Lucia"})

(def LI
  {:db/ident :lcc-3166-1/LI,
   :lcc-lr/denotes :lcc-3166-1/Liechtenstein,
   :lcc-lr/hasTag "LI",
   :lcc-lr/identifies :lcc-3166-1/Liechtenstein,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "LI",
   :skos/definition "Alpha-2 country code for Liechtenstein"})

(def LIE
  {:db/ident :lcc-3166-1/LIE,
   :lcc-lr/denotes :lcc-3166-1/Liechtenstein,
   :lcc-lr/hasTag "LIE",
   :lcc-lr/identifies :lcc-3166-1/Liechtenstein,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "LIE",
   :skos/definition "Alpha-3 country code for Liechtenstein"})

(def LK
  {:db/ident :lcc-3166-1/LK,
   :lcc-lr/denotes :lcc-3166-1/SriLanka,
   :lcc-lr/hasTag "LK",
   :lcc-lr/identifies :lcc-3166-1/SriLanka,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "LK",
   :skos/definition "Alpha-2 country code for Sri Lanka"})

(def LKA
  {:db/ident :lcc-3166-1/LKA,
   :lcc-lr/denotes :lcc-3166-1/SriLanka,
   :lcc-lr/hasTag "LKA",
   :lcc-lr/identifies :lcc-3166-1/SriLanka,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "LKA",
   :skos/definition "Alpha-3 country code for Sri Lanka"})

(def LR
  {:db/ident :lcc-3166-1/LR,
   :lcc-lr/denotes :lcc-3166-1/Liberia,
   :lcc-lr/hasTag "LR",
   :lcc-lr/identifies :lcc-3166-1/Liberia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "LR",
   :skos/definition "Alpha-2 country code for Liberia"})

(def LS
  {:db/ident :lcc-3166-1/LS,
   :lcc-lr/denotes :lcc-3166-1/Lesotho,
   :lcc-lr/hasTag "LS",
   :lcc-lr/identifies :lcc-3166-1/Lesotho,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "LS",
   :skos/definition "Alpha-2 country code for Lesotho"})

(def LSO
  {:db/ident :lcc-3166-1/LSO,
   :lcc-lr/denotes :lcc-3166-1/Lesotho,
   :lcc-lr/hasTag "LSO",
   :lcc-lr/identifies :lcc-3166-1/Lesotho,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "LSO",
   :skos/definition "Alpha-3 country code for Lesotho"})

(def LT
  {:db/ident :lcc-3166-1/LT,
   :lcc-lr/denotes :lcc-3166-1/Lithuania,
   :lcc-lr/hasTag "LT",
   :lcc-lr/identifies :lcc-3166-1/Lithuania,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "LT",
   :skos/definition "Alpha-2 country code for Lithuania"})

(def LTU
  {:db/ident :lcc-3166-1/LTU,
   :lcc-lr/denotes :lcc-3166-1/Lithuania,
   :lcc-lr/hasTag "LTU",
   :lcc-lr/identifies :lcc-3166-1/Lithuania,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "LTU",
   :skos/definition "Alpha-3 country code for Lithuania"})

(def LU
  {:db/ident :lcc-3166-1/LU,
   :lcc-lr/denotes :lcc-3166-1/Luxembourg,
   :lcc-lr/hasTag "LU",
   :lcc-lr/identifies :lcc-3166-1/Luxembourg,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "LU",
   :skos/definition "Alpha-2 country code for Luxembourg"})

(def LUX
  {:db/ident :lcc-3166-1/LUX,
   :lcc-lr/denotes :lcc-3166-1/Luxembourg,
   :lcc-lr/hasTag "LUX",
   :lcc-lr/identifies :lcc-3166-1/Luxembourg,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "LUX",
   :skos/definition "Alpha-3 country code for Luxembourg"})

(def LV
  {:db/ident :lcc-3166-1/LV,
   :lcc-lr/denotes :lcc-3166-1/Latvia,
   :lcc-lr/hasTag "LV",
   :lcc-lr/identifies :lcc-3166-1/Latvia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "LV",
   :skos/definition "Alpha-2 country code for Latvia"})

(def LVA
  {:db/ident :lcc-3166-1/LVA,
   :lcc-lr/denotes :lcc-3166-1/Latvia,
   :lcc-lr/hasTag "LVA",
   :lcc-lr/identifies :lcc-3166-1/Latvia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "LVA",
   :skos/definition "Alpha-3 country code for Latvia"})

(def LY
  {:db/ident :lcc-3166-1/LY,
   :lcc-lr/denotes :lcc-3166-1/Libya,
   :lcc-lr/hasTag "LY",
   :lcc-lr/identifies :lcc-3166-1/Libya,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "LY",
   :skos/definition "Alpha-2 country code for Libya"})

(def LaoPeoplesDemocraticRepublic
  {:db/ident :lcc-3166-1/LaoPeoplesDemocraticRepublic,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value
                               "the Lao People's Democratic Republic"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value
                                "Lao People's Democratic Republic (the)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value
                                          "LAO PEOPLE'S DEMOCRATIC REPUBLIC"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value
                              "la République démocratique populaire lao"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value
                               "Lao (la République démocratique populaire)"},
   :lcc-cr/hasFrenchShortNameInCapitals
   {:rdf/language "fr",
    :rdf/value    "LAO, RÉPUBLIQUE DÉMOCRATIQUE POPULAIRE"},
   :lcc-cr/hasLocalShortName {:rdf/language "lo",
                              :rdf/value
                              "Sathalanalat Paxathipatai Paxaxôn Lao"},
   :lcc-cr/hasNumericRegionCode "418",
   :lcc-cr/hasRemarks "Also referred to as Laos.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Lao,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "lo",
                :rdf/value    "Sathalanalat Paxathipatai Paxaxôn Lao"},
   :skos/definition "the country of Lao People's Democratic Republic (the)"})

(def Latvia
  {:db/ident :lcc-3166-1/Latvia,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Latvia"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Latvia"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "LATVIA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République de Lettonie"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Lettonie (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "LETTONIE"},
   :lcc-cr/hasLocalShortName {:rdf/language "lv",
                              :rdf/value    "Latvija"},
   :lcc-cr/hasNumericRegionCode "428",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Latvian,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "lv",
                :rdf/value    "Latvija"},
   :skos/definition "the country of Latvia"})

(def Lebanon
  {:db/ident :lcc-3166-1/Lebanon,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Lebanese Republic"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Lebanon"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "LEBANON"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République libanaise"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Liban (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "LIBAN"},
   :lcc-cr/hasLocalShortName {:rdf/language "ar",
                              :rdf/value    "Lubnān"},
   :lcc-cr/hasNumericRegionCode "422",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Arabic,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "ar",
                :rdf/value    "Lubnān"},
   :skos/definition "the country of Lebanon"})

(def Lesotho
  {:db/ident :lcc-3166-1/Lesotho,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Kingdom of Lesotho"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Lesotho"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "LESOTHO"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "le Royaume du Lesotho"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Lesotho (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "LESOTHO"},
   :lcc-cr/hasLocalShortName {:rdf/language "st",
                              :rdf/value    "Lesotho"},
   :lcc-cr/hasNumericRegionCode "426",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/English
                                        :lcc-639-1/SouthernSotho},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "st",
                  :rdf/value    "Lesotho"}
                 {:rdf/language "en",
                  :rdf/value    "Lesotho"}},
   :skos/definition "the country of Lesotho"})

(def Liberia
  {:db/ident :lcc-3166-1/Liberia,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Liberia"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Liberia"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "LIBERIA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Libéria"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Libéria (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "LIBÉRIA"},
   :lcc-cr/hasNumericRegionCode "430",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Liberia"},
   :skos/definition "the country of Liberia"})

(def Libya
  {:db/ident :lcc-3166-1/Libya,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the State of Libya"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Libya"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "LIBYA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "l'État de Libye"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Libye (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "LIBYE"},
   :lcc-cr/hasLocalShortName {:rdf/language "ar",
                              :rdf/value    "Lībiyā"},
   :lcc-cr/hasNumericRegionCode "434",
   :lcc-cr/hasRemarks
   "The subdivision category sha‘bīyah (popularate) is no longer used since the fall of Gaddafi. The word Muḩāfaz̧ah governorate is now sometimes used instead for these subdivisions of Libya, which are those pre-2011. The unrest in Libya means that there is no recognised current administrative structure.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Arabic,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "ar",
                :rdf/value    "Lībiyā"},
   :skos/definition "the country of Libya"})

(def Liechtenstein
  {:db/ident :lcc-3166-1/Liechtenstein,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value "the Principality of Liechtenstein"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Liechtenstein"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "LIECHTENSTEIN"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la Principauté du Liechtenstein"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Liechtenstein (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "LIECHTENSTEIN"},
   :lcc-cr/hasLocalShortName {:rdf/language "de",
                              :rdf/value    "Liechtenstein"},
   :lcc-cr/hasNumericRegionCode "438",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/German,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "de",
                :rdf/value    "Liechtenstein"},
   :skos/definition "the country of Liechtenstein"})

(def Lithuania
  {:db/ident :lcc-3166-1/Lithuania,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Lithuania"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Lithuania"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "LITHUANIA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République de Lituanie"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Lituanie (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "LITUANIE"},
   :lcc-cr/hasLocalShortName {:rdf/language "lt",
                              :rdf/value    "Lietuva"},
   :lcc-cr/hasNumericRegionCode "440",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Lithuanian,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "lt",
                :rdf/value    "Lietuva"},
   :skos/definition "the country of Lithuania"})

(def Luxembourg
  {:db/ident :lcc-3166-1/Luxembourg,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Grand Duchy of Luxembourg"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Luxembourg"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "LUXEMBOURG"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "le Grand-Duché de Luxembourg"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Luxembourg (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "LUXEMBOURG"},
   :lcc-cr/hasLocalShortName #{{:rdf/language "de",
                                :rdf/value    "Luxemburg"}
                               {:rdf/language "lb",
                                :rdf/value    "Lëtzebuerg"}},
   :lcc-cr/hasNumericRegionCode "442",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/Luxembourgish
                                        :lcc-639-1/German :lcc-639-1/French},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "fr",
                  :rdf/value    "Luxembourg (le)"}
                 {:rdf/language "de",
                  :rdf/value    "Luxemburg"}
                 {:rdf/language "lb",
                  :rdf/value    "Lëtzebuerg"}},
   :skos/definition "the country of Luxembourg"})

(def MA
  {:db/ident :lcc-3166-1/MA,
   :lcc-lr/denotes :lcc-3166-1/Morocco,
   :lcc-lr/hasTag "MA",
   :lcc-lr/identifies :lcc-3166-1/Morocco,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "MA",
   :skos/definition "Alpha-2 country code for Morocco"})

(def MAC
  {:db/ident :lcc-3166-1/MAC,
   :lcc-lr/denotes :lcc-3166-1/Macao,
   :lcc-lr/hasTag "MAC",
   :lcc-lr/identifies :lcc-3166-1/Macao,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "MAC",
   :skos/definition "Alpha-3 country code for Macao"})

(def MAF
  {:db/ident :lcc-3166-1/MAF,
   :lcc-lr/denotes :lcc-3166-1/SaintMartin,
   :lcc-lr/hasTag "MAF",
   :lcc-lr/identifies :lcc-3166-1/SaintMartin,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "MAF",
   :skos/definition "Alpha-3 country code for Saint Martin (French part)"})

(def MAR
  {:db/ident :lcc-3166-1/MAR,
   :lcc-lr/denotes :lcc-3166-1/Morocco,
   :lcc-lr/hasTag "MAR",
   :lcc-lr/identifies :lcc-3166-1/Morocco,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "MAR",
   :skos/definition "Alpha-3 country code for Morocco"})

(def MC
  {:db/ident :lcc-3166-1/MC,
   :lcc-lr/denotes :lcc-3166-1/Monaco,
   :lcc-lr/hasTag "MC",
   :lcc-lr/identifies :lcc-3166-1/Monaco,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "MC",
   :skos/definition "Alpha-2 country code for Monaco"})

(def MCO
  {:db/ident :lcc-3166-1/MCO,
   :lcc-lr/denotes :lcc-3166-1/Monaco,
   :lcc-lr/hasTag "MCO",
   :lcc-lr/identifies :lcc-3166-1/Monaco,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "MCO",
   :skos/definition "Alpha-3 country code for Monaco"})

(def MD
  {:db/ident :lcc-3166-1/MD,
   :lcc-lr/denotes :lcc-3166-1/Moldova,
   :lcc-lr/hasTag "MD",
   :lcc-lr/identifies :lcc-3166-1/Moldova,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "MD",
   :skos/definition "Alpha-2 country code for Moldova (the Republic of)"})

(def MDA
  {:db/ident :lcc-3166-1/MDA,
   :lcc-lr/denotes :lcc-3166-1/Moldova,
   :lcc-lr/hasTag "MDA",
   :lcc-lr/identifies :lcc-3166-1/Moldova,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "MDA",
   :skos/definition "Alpha-3 country code for Moldova (the Republic of)"})

(def MDG
  {:db/ident :lcc-3166-1/MDG,
   :lcc-lr/denotes :lcc-3166-1/Madagascar,
   :lcc-lr/hasTag "MDG",
   :lcc-lr/identifies :lcc-3166-1/Madagascar,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "MDG",
   :skos/definition "Alpha-3 country code for Madagascar"})

(def MDV
  {:db/ident :lcc-3166-1/MDV,
   :lcc-lr/denotes :lcc-3166-1/Maldives,
   :lcc-lr/hasTag "MDV",
   :lcc-lr/identifies :lcc-3166-1/Maldives,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "MDV",
   :skos/definition "Alpha-3 country code for Maldives"})

(def ME
  {:db/ident :lcc-3166-1/ME,
   :lcc-lr/denotes :lcc-3166-1/Montenegro,
   :lcc-lr/hasTag "ME",
   :lcc-lr/identifies :lcc-3166-1/Montenegro,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "ME",
   :skos/definition "Alpha-2 country code for Montenegro"})

(def MEX
  {:db/ident :lcc-3166-1/MEX,
   :lcc-lr/denotes :lcc-3166-1/Mexico,
   :lcc-lr/hasTag "MEX",
   :lcc-lr/identifies :lcc-3166-1/Mexico,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "MEX",
   :skos/definition "Alpha-3 country code for Mexico"})

(def MF
  {:db/ident :lcc-3166-1/MF,
   :lcc-lr/denotes :lcc-3166-1/SaintMartin,
   :lcc-lr/hasTag "MF",
   :lcc-lr/identifies :lcc-3166-1/SaintMartin,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "MF",
   :skos/definition "Alpha-2 country code for Saint Martin (French part)"})

(def MG
  {:db/ident :lcc-3166-1/MG,
   :lcc-lr/denotes :lcc-3166-1/Madagascar,
   :lcc-lr/hasTag "MG",
   :lcc-lr/identifies :lcc-3166-1/Madagascar,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "MG",
   :skos/definition "Alpha-2 country code for Madagascar"})

(def MH
  {:db/ident :lcc-3166-1/MH,
   :lcc-lr/denotes :lcc-3166-1/MarshallIslands,
   :lcc-lr/hasTag "MH",
   :lcc-lr/identifies :lcc-3166-1/MarshallIslands,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "MH",
   :skos/definition "Alpha-2 country code for Marshall Islands (the)"})

(def MHL
  {:db/ident :lcc-3166-1/MHL,
   :lcc-lr/denotes :lcc-3166-1/MarshallIslands,
   :lcc-lr/hasTag "MHL",
   :lcc-lr/identifies :lcc-3166-1/MarshallIslands,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "MHL",
   :skos/definition "Alpha-3 country code for Marshall Islands (the)"})

(def MK
  {:db/ident :lcc-3166-1/MK,
   :lcc-lr/denotes :lcc-3166-1/NorthMacedonia,
   :lcc-lr/hasTag "MK",
   :lcc-lr/identifies :lcc-3166-1/NorthMacedonia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "MK",
   :skos/definition "Alpha-2 country code for North Macedonia"})

(def MKD
  {:db/ident :lcc-3166-1/MKD,
   :lcc-lr/denotes :lcc-3166-1/NorthMacedonia,
   :lcc-lr/hasTag "MKD",
   :lcc-lr/identifies :lcc-3166-1/NorthMacedonia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "MKD",
   :skos/definition "Alpha-3 country code for North Macedonia"})

(def ML
  {:db/ident :lcc-3166-1/ML,
   :lcc-lr/denotes :lcc-3166-1/Mali,
   :lcc-lr/hasTag "ML",
   :lcc-lr/identifies :lcc-3166-1/Mali,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "ML",
   :skos/definition "Alpha-2 country code for Mali"})

(def MLI
  {:db/ident :lcc-3166-1/MLI,
   :lcc-lr/denotes :lcc-3166-1/Mali,
   :lcc-lr/hasTag "MLI",
   :lcc-lr/identifies :lcc-3166-1/Mali,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "MLI",
   :skos/definition "Alpha-3 country code for Mali"})

(def MLT
  {:db/ident :lcc-3166-1/MLT,
   :lcc-lr/denotes :lcc-3166-1/Malta,
   :lcc-lr/hasTag "MLT",
   :lcc-lr/identifies :lcc-3166-1/Malta,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "MLT",
   :skos/definition "Alpha-3 country code for Malta"})

(def MM
  {:db/ident :lcc-3166-1/MM,
   :lcc-lr/denotes :lcc-3166-1/Myanmar,
   :lcc-lr/hasTag "MM",
   :lcc-lr/identifies :lcc-3166-1/Myanmar,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "MM",
   :skos/definition "Alpha-2 country code for Myanmar"})

(def MMR
  {:db/ident :lcc-3166-1/MMR,
   :lcc-lr/denotes :lcc-3166-1/Myanmar,
   :lcc-lr/hasTag "MMR",
   :lcc-lr/identifies :lcc-3166-1/Myanmar,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "MMR",
   :skos/definition "Alpha-3 country code for Myanmar"})

(def MN
  {:db/ident :lcc-3166-1/MN,
   :lcc-lr/denotes :lcc-3166-1/Mongolia,
   :lcc-lr/hasTag "MN",
   :lcc-lr/identifies :lcc-3166-1/Mongolia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "MN",
   :skos/definition "Alpha-2 country code for Mongolia"})

(def MNE
  {:db/ident :lcc-3166-1/MNE,
   :lcc-lr/denotes :lcc-3166-1/Montenegro,
   :lcc-lr/hasTag "MNE",
   :lcc-lr/identifies :lcc-3166-1/Montenegro,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "MNE",
   :skos/definition "Alpha-3 country code for Montenegro"})

(def MNG
  {:db/ident :lcc-3166-1/MNG,
   :lcc-lr/denotes :lcc-3166-1/Mongolia,
   :lcc-lr/hasTag "MNG",
   :lcc-lr/identifies :lcc-3166-1/Mongolia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "MNG",
   :skos/definition "Alpha-3 country code for Mongolia"})

(def MNP
  {:db/ident :lcc-3166-1/MNP,
   :lcc-lr/denotes :lcc-3166-1/NorthernMarianaIslands,
   :lcc-lr/hasTag "MNP",
   :lcc-lr/identifies :lcc-3166-1/NorthernMarianaIslands,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "MNP",
   :skos/definition "Alpha-3 country code for Northern Mariana Islands (the)"})

(def MO
  {:db/ident :lcc-3166-1/MO,
   :lcc-lr/denotes :lcc-3166-1/Macao,
   :lcc-lr/hasTag "MO",
   :lcc-lr/identifies :lcc-3166-1/Macao,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "MO",
   :skos/definition "Alpha-2 country code for Macao"})

(def MOZ
  {:db/ident :lcc-3166-1/MOZ,
   :lcc-lr/denotes :lcc-3166-1/Mozambique,
   :lcc-lr/hasTag "MOZ",
   :lcc-lr/identifies :lcc-3166-1/Mozambique,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "MOZ",
   :skos/definition "Alpha-3 country code for Mozambique"})

(def MP
  {:db/ident :lcc-3166-1/MP,
   :lcc-lr/denotes :lcc-3166-1/NorthernMarianaIslands,
   :lcc-lr/hasTag "MP",
   :lcc-lr/identifies :lcc-3166-1/NorthernMarianaIslands,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "MP",
   :skos/definition "Alpha-2 country code for Northern Mariana Islands (the)"})

(def MQ
  {:db/ident :lcc-3166-1/MQ,
   :lcc-lr/denotes :lcc-3166-1/Martinique,
   :lcc-lr/hasTag "MQ",
   :lcc-lr/identifies :lcc-3166-1/Martinique,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "MQ",
   :skos/definition "Alpha-2 country code for Martinique"})

(def MR
  {:db/ident :lcc-3166-1/MR,
   :lcc-lr/denotes :lcc-3166-1/Mauritania,
   :lcc-lr/hasTag "MR",
   :lcc-lr/identifies :lcc-3166-1/Mauritania,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "MR",
   :skos/definition "Alpha-2 country code for Mauritania"})

(def MRT
  {:db/ident :lcc-3166-1/MRT,
   :lcc-lr/denotes :lcc-3166-1/Mauritania,
   :lcc-lr/hasTag "MRT",
   :lcc-lr/identifies :lcc-3166-1/Mauritania,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "MRT",
   :skos/definition "Alpha-3 country code for Mauritania"})

(def MS
  {:db/ident :lcc-3166-1/MS,
   :lcc-lr/denotes :lcc-3166-1/Montserrat,
   :lcc-lr/hasTag "MS",
   :lcc-lr/identifies :lcc-3166-1/Montserrat,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "MS",
   :skos/definition "Alpha-2 country code for Montserrat"})

(def MSR
  {:db/ident :lcc-3166-1/MSR,
   :lcc-lr/denotes :lcc-3166-1/Montserrat,
   :lcc-lr/hasTag "MSR",
   :lcc-lr/identifies :lcc-3166-1/Montserrat,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "MSR",
   :skos/definition "Alpha-3 country code for Montserrat"})

(def MT
  {:db/ident :lcc-3166-1/MT,
   :lcc-lr/denotes :lcc-3166-1/Malta,
   :lcc-lr/hasTag "MT",
   :lcc-lr/identifies :lcc-3166-1/Malta,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "MT",
   :skos/definition "Alpha-2 country code for Malta"})

(def MTQ
  {:db/ident :lcc-3166-1/MTQ,
   :lcc-lr/denotes :lcc-3166-1/Martinique,
   :lcc-lr/hasTag "MTQ",
   :lcc-lr/identifies :lcc-3166-1/Martinique,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "MTQ",
   :skos/definition "Alpha-3 country code for Martinique"})

(def MU
  {:db/ident :lcc-3166-1/MU,
   :lcc-lr/denotes :lcc-3166-1/Mauritius,
   :lcc-lr/hasTag "MU",
   :lcc-lr/identifies :lcc-3166-1/Mauritius,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "MU",
   :skos/definition "Alpha-2 country code for Mauritius"})

(def MUS
  {:db/ident :lcc-3166-1/MUS,
   :lcc-lr/denotes :lcc-3166-1/Mauritius,
   :lcc-lr/hasTag "MUS",
   :lcc-lr/identifies :lcc-3166-1/Mauritius,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "MUS",
   :skos/definition "Alpha-3 country code for Mauritius"})

(def MV
  {:db/ident :lcc-3166-1/MV,
   :lcc-lr/denotes :lcc-3166-1/Maldives,
   :lcc-lr/hasTag "MV",
   :lcc-lr/identifies :lcc-3166-1/Maldives,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "MV",
   :skos/definition "Alpha-2 country code for Maldives"})

(def MW
  {:db/ident :lcc-3166-1/MW,
   :lcc-lr/denotes :lcc-3166-1/Malawi,
   :lcc-lr/hasTag "MW",
   :lcc-lr/identifies :lcc-3166-1/Malawi,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "MW",
   :skos/definition "Alpha-2 country code for Malawi"})

(def MWI
  {:db/ident :lcc-3166-1/MWI,
   :lcc-lr/denotes :lcc-3166-1/Malawi,
   :lcc-lr/hasTag "MWI",
   :lcc-lr/identifies :lcc-3166-1/Malawi,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "MWI",
   :skos/definition "Alpha-3 country code for Malawi"})

(def MX
  {:db/ident :lcc-3166-1/MX,
   :lcc-lr/denotes :lcc-3166-1/Mexico,
   :lcc-lr/hasTag "MX",
   :lcc-lr/identifies :lcc-3166-1/Mexico,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "MX",
   :skos/definition "Alpha-2 country code for Mexico"})

(def MY
  {:db/ident :lcc-3166-1/MY,
   :lcc-lr/denotes :lcc-3166-1/Malaysia,
   :lcc-lr/hasTag "MY",
   :lcc-lr/identifies :lcc-3166-1/Malaysia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "MY",
   :skos/definition "Alpha-2 country code for Malaysia"})

(def MYS
  {:db/ident :lcc-3166-1/MYS,
   :lcc-lr/denotes :lcc-3166-1/Malaysia,
   :lcc-lr/hasTag "MYS",
   :lcc-lr/identifies :lcc-3166-1/Malaysia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "MYS",
   :skos/definition "Alpha-3 country code for Malaysia"})

(def MYT
  {:db/ident :lcc-3166-1/MYT,
   :lcc-lr/denotes :lcc-3166-1/Mayotte,
   :lcc-lr/hasTag "MYT",
   :lcc-lr/identifies :lcc-3166-1/Mayotte,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "MYT",
   :skos/definition "Alpha-3 country code for Mayotte"})

(def MZ
  {:db/ident :lcc-3166-1/MZ,
   :lcc-lr/denotes :lcc-3166-1/Mozambique,
   :lcc-lr/hasTag "MZ",
   :lcc-lr/identifies :lcc-3166-1/Mozambique,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "MZ",
   :skos/definition "Alpha-2 country code for Mozambique"})

(def Macao
  {:db/ident :lcc-3166-1/Macao,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value
                               "Macao Special Administrative Region of China"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Macao"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "MACAO"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value
                              "Macao, Région administrative spéciale de Chine"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Macao"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "MACAO"},
   :lcc-cr/hasLocalShortName #{{:rdf/language "pt",
                                :rdf/value    "Macau"}
                               {:rdf/language "zh",
                                :rdf/value    "Aomen"}},
   :lcc-cr/hasNumericRegionCode "446",
   :lcc-cr/hasRemarks
   "Subdivision in 2 districts, distrito (pt), which is not relevant for this part of ISO 3166. Included also as a subdivision of China (CN-MO).",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/Chinese
                                        :lcc-639-1/Portuguese},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "pt",
                  :rdf/value    "Macau"}
                 {:rdf/language "zh",
                  :rdf/value    "Aomen"}},
   :skos/definition "the country of Macao"})

(def Macedonia
  {:db/ident :lcc-3166-1/Macedonia,
   :owl/deprecated true,
   :owl/sameAs :lcc-3166-1/NorthMacedonia,
   :rdf/type :owl/NamedIndividual,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}})

(def Madagascar
  {:db/ident :lcc-3166-1/Madagascar,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Madagascar"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Madagascar"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "MADAGASCAR"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République de Madagascar"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Madagascar"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "MADAGASCAR"},
   :lcc-cr/hasLocalShortName {:rdf/language "mg",
                              :rdf/value    "Madagasikara"},
   :lcc-cr/hasNumericRegionCode "450",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/English :lcc-639-1/Malagasy
                                        :lcc-639-1/French},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "fr",
                  :rdf/value    "Madagascar"}
                 {:rdf/language "en",
                  :rdf/value    "Madagascar"}
                 {:rdf/language "mg",
                  :rdf/value    "Madagasikara"}},
   :skos/definition "the country of Madagascar"})

(def Malawi
  {:db/ident :lcc-3166-1/Malawi,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Malawi"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Malawi"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "MALAWI"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Malawi"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Malawi (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "MALAWI"},
   :lcc-cr/hasLocalShortName {:rdf/language "ny",
                              :rdf/value    "Malaŵi"},
   :lcc-cr/hasNumericRegionCode "454",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/Nyanja :lcc-639-1/English},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Malawi"}
                 {:rdf/language "ny",
                  :rdf/value    "Malaŵi"}},
   :skos/definition "the country of Malawi"})

(def Malaysia
  {:db/ident :lcc-3166-1/Malaysia,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Malaysia"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "MALAYSIA"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Malaisie (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "MALAISIE"},
   :lcc-cr/hasLocalShortName {:rdf/language "ms",
                              :rdf/value    "Malaysia"},
   :lcc-cr/hasNumericRegionCode "458",
   :lcc-cr/hasRemarks "Comprises: Peninsular Malaysia, Sabah, Sarawak.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Malay,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "ms",
                :rdf/value    "Malaysia"},
   :skos/definition "the country of Malaysia"})

(def Maldives
  {:db/ident :lcc-3166-1/Maldives,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Maldives"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Maldives"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "MALDIVES"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République des Maldives"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Maldives (les)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "MALDIVES"},
   :lcc-cr/hasLocalShortName {:rdf/language "dv",
                              :rdf/value    "Dhivehi Raajje"},
   :lcc-cr/hasNumericRegionCode "462",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Dhivehi,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "dv",
                :rdf/value    "Dhivehi Raajje"},
   :skos/definition "the country of Maldives"})

(def Mali
  {:db/ident :lcc-3166-1/Mali,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Mali"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Mali"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "MALI"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Mali"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Mali (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "MALI"},
   :lcc-cr/hasNumericRegionCode "466",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "fr",
                :rdf/value    "Mali (le)"},
   :skos/definition "the country of Mali"})

(def Malta
  {:db/ident :lcc-3166-1/Malta,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Malta"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Malta"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "MALTA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République de Malte"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Malte"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "MALTE"},
   :lcc-cr/hasLocalShortName {:rdf/language "mt",
                              :rdf/value    "Malta"},
   :lcc-cr/hasNumericRegionCode "470",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/Maltese :lcc-639-1/English},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Malta"}
                 {:rdf/language "mt",
                  :rdf/value    "Malta"}},
   :skos/definition "the country of Malta"})

(def MarshallIslands
  {:db/ident :lcc-3166-1/MarshallIslands,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value
                               "the Republic of the Marshall Islands"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Marshall Islands (the)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "MARSHALL ISLANDS"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République des Îles Marshall"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Marshall (les Îles)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "MARSHALL, ÎLES"},
   :lcc-cr/hasLocalShortName {:rdf/language "mh",
                              :rdf/value    "Aelōn̄ in M̧ajeļ"},
   :lcc-cr/hasNumericRegionCode "584",
   :lcc-cr/hasRemarks "Principal atolls: Jaluit, Kwajalein, Majuro.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/English
                                        :lcc-639-1/Marshallese},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "mh",
                  :rdf/value    "Aelōn̄ in M̧ajeļ"}
                 {:rdf/language "en",
                  :rdf/value    "Marshall Islands (the)"}},
   :skos/definition "the country of Marshall Islands (the)"})

(def Martinique
  {:db/ident :lcc-3166-1/Martinique,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Martinique"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "MARTINIQUE"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Martinique (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "MARTINIQUE"},
   :lcc-cr/hasNumericRegionCode "474",
   :lcc-cr/hasRemarks
   "No subdivisions relevant for this standard. Included also as a subdivision of France (FR-MQ).",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "fr",
                :rdf/value    "Martinique (la)"},
   :skos/definition "the country of Martinique"})

(def Mauritania
  {:db/ident :lcc-3166-1/Mauritania,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value "the Islamic Republic of Mauritania"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Mauritania"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "MAURITANIA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value
                              "la République islamique de Mauritanie"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Mauritanie (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "MAURITANIE"},
   :lcc-cr/hasLocalShortName {:rdf/language "ar",
                              :rdf/value    "Mūrītāniyā"},
   :lcc-cr/hasNumericRegionCode "478",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Arabic,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "ar",
                :rdf/value    "Mūrītāniyā"},
   :skos/definition "the country of Mauritania"})

(def Mauritius
  {:db/ident :lcc-3166-1/Mauritius,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Mauritius"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Mauritius"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "MAURITIUS"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République de Maurice"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Maurice"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "MAURICE"},
   :lcc-cr/hasNumericRegionCode "480",
   :lcc-cr/hasRemarks
   "Includes: Agalega Islands, Cargados Carajos Shoals, Rodrigues Island.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Mauritius"},
   :skos/definition "the country of Mauritius"})

(def Mayotte
  {:db/ident :lcc-3166-1/Mayotte,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Mayotte"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "MAYOTTE"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Mayotte"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "MAYOTTE"},
   :lcc-cr/hasNumericRegionCode "175",
   :lcc-cr/hasRemarks
   "No subdivisions relevant for this standard. Included also as a subdivision of France (FR-YT).",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "fr",
                :rdf/value    "Mayotte"},
   :skos/definition "the country of Mayotte"})

(def Mexico
  {:db/ident :lcc-3166-1/Mexico,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the United Mexican States"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Mexico"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "MEXICO"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "les États-Unis du Mexique"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Mexique (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "MEXIQUE"},
   :lcc-cr/hasLocalShortName {:rdf/language "es",
                              :rdf/value    "México"},
   :lcc-cr/hasNumericRegionCode "484",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Spanish,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "es",
                :rdf/value    "México"},
   :skos/definition "the country of Mexico"})

(def Micronesia
  {:db/ident :lcc-3166-1/Micronesia,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value "the Federated States of Micronesia"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value "Micronesia (Federated States of)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value
                                          "MICRONESIA (FEDERATED STATES OF)"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "les États fédérés de Micronésie"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Micronésie (États fédérés de)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value
                                         "MICRONÉSIE (ÉTATS FÉDÉRÉS DE)"},
   :lcc-cr/hasNumericRegionCode "583",
   :lcc-cr/hasRemarks
   "Comprises: Caroline Islands (except PALAU, see separate entry). Principal islands: Chuuk, Kosrae, Pohnpei, YapChuuk, Kosrae, Pohnpei, Yap.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Micronesia (Federated States of)"},
   :skos/definition "the country of Micronesia (Federated States of)"})

(def Moldova
  {:db/ident :lcc-3166-1/Moldova,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Moldova"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Moldova (the Republic of)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "MOLDOVA, REPUBLIC OF"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République de Moldova"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Moldova (la République de)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value "MOLDOVA, RÉPUBLIQUE DE"},
   :lcc-cr/hasLocalShortName {:rdf/language "ro",
                              :rdf/value    "Republica Moldova"},
   :lcc-cr/hasNumericRegionCode "498",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Romanian,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "ro",
                :rdf/value    "Republica Moldova"},
   :skos/definition "the country of Moldova (the Republic of)"})

(def Monaco
  {:db/ident :lcc-3166-1/Monaco,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Principality of Monaco"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Monaco"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "MONACO"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la Principauté de Monaco"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Monaco"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "MONACO"},
   :lcc-cr/hasNumericRegionCode "492",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "fr",
                :rdf/value    "Monaco"},
   :skos/definition "the country of Monaco"})

(def Mongolia
  {:db/ident :lcc-3166-1/Mongolia,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Mongolia"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "MONGOLIA"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Mongolie (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "MONGOLIE"},
   :lcc-cr/hasLocalShortName {:rdf/language "mn",
                              :rdf/value    "Mongol"},
   :lcc-cr/hasNumericRegionCode "496",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Mongolian,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "mn",
                :rdf/value    "Mongol"},
   :skos/definition "the country of Mongolia"})

(def Montenegrin
  {:db/ident       :lcc-3166-1/Montenegrin,
   :owl/deprecated true,
   :owl/sameAs     :lcc-639-2/Montenegrin,
   :rdf/type       #{:owl/NamedIndividual :lcc-lr/IndividualLanguage}})

(def Montenegro
  {:db/ident :lcc-3166-1/Montenegro,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Montenegro"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "MONTENEGRO"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "Monténégro (le)"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Monténégro (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "MONTÉNÉGRO"},
   :lcc-cr/hasLocalShortName "Crna Gora",
   :lcc-cr/hasNumericRegionCode "499",
   :lcc-cr/hasRemarks
   "Montenegro was formerly part of former entries: YUGOSLAVIA (YU, YUG, 891) then SERBIA AND MONTENEGRO (CS, SCG, 891).",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-2/Montenegrin,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :skos/definition "the country of Montenegro"})

(def Montserrat
  {:db/ident :lcc-3166-1/Montserrat,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Montserrat"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "MONTSERRAT"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Montserrat"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "MONTSERRAT"},
   :lcc-cr/hasNumericRegionCode "500",
   :lcc-cr/hasRemarks "No subdivisions relevant for this standard.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Montserrat"},
   :skos/definition "the country of Montserrat"})

(def Morocco
  {:db/ident :lcc-3166-1/Morocco,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Kingdom of Morocco"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Morocco"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "MOROCCO"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "le Royaume du Maroc"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Maroc (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "MAROC"},
   :lcc-cr/hasLocalShortName {:rdf/language "ar",
                              :rdf/value    "Al Maghrib"},
   :lcc-cr/hasNumericRegionCode "504",
   :lcc-cr/hasRemarks
   "Remark: Entries followed by \"(EH)\" are located partially or fully in the territory of Western Sahara (ISO 3166 alpha-2 code element EH).",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Arabic,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "ar",
                :rdf/value    "Al Maghrib"},
   :skos/definition "the country of Morocco"})

(def Mozambique
  {:db/ident :lcc-3166-1/Mozambique,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Mozambique"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Mozambique"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "MOZAMBIQUE"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Mozambique"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Mozambique (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "MOZAMBIQUE"},
   :lcc-cr/hasLocalShortName {:rdf/language "pt",
                              :rdf/value    "Moçambique"},
   :lcc-cr/hasNumericRegionCode "508",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Portuguese,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "pt",
                :rdf/value    "Moçambique"},
   :skos/definition "the country of Mozambique"})

(def Myanmar
  {:db/ident :lcc-3166-1/Myanmar,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value
                               "the Republic of the Union of Myanmar"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Myanmar"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "MYANMAR"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value "la République de l'Union du Myanmar"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Myanmar (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "MYANMAR"},
   :lcc-cr/hasLocalShortName {:rdf/language "my",
                              :rdf/value    "Myanma"},
   :lcc-cr/hasNumericRegionCode "104",
   :lcc-cr/hasRemarks
   "Remark: the forms used in the list are English-language forms provided by Myanmar.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Burmese,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "my",
                :rdf/value    "Myanma"},
   :skos/definition "the country of Myanmar"})

(def NA
  {:db/ident :lcc-3166-1/NA,
   :lcc-lr/denotes :lcc-3166-1/Namibia,
   :lcc-lr/hasTag "NA",
   :lcc-lr/identifies :lcc-3166-1/Namibia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "NA",
   :skos/definition "Alpha-2 country code for Namibia"})

(def NAM
  {:db/ident :lcc-3166-1/NAM,
   :lcc-lr/denotes :lcc-3166-1/Namibia,
   :lcc-lr/hasTag "NAM",
   :lcc-lr/identifies :lcc-3166-1/Namibia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "NAM",
   :skos/definition "Alpha-3 country code for Namibia"})

(def NC
  {:db/ident :lcc-3166-1/NC,
   :lcc-lr/denotes :lcc-3166-1/NewCaledonia,
   :lcc-lr/hasTag "NC",
   :lcc-lr/identifies :lcc-3166-1/NewCaledonia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "NC",
   :skos/definition "Alpha-2 country code for New Caledonia"})

(def NCL
  {:db/ident :lcc-3166-1/NCL,
   :lcc-lr/denotes :lcc-3166-1/NewCaledonia,
   :lcc-lr/hasTag "NCL",
   :lcc-lr/identifies :lcc-3166-1/NewCaledonia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "NCL",
   :skos/definition "Alpha-3 country code for New Caledonia"})

(def NE
  {:db/ident :lcc-3166-1/NE,
   :lcc-lr/denotes :lcc-3166-1/Niger,
   :lcc-lr/hasTag "NE",
   :lcc-lr/identifies :lcc-3166-1/Niger,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "NE",
   :skos/definition "Alpha-2 country code for Niger (the)"})

(def NER
  {:db/ident :lcc-3166-1/NER,
   :lcc-lr/denotes :lcc-3166-1/Niger,
   :lcc-lr/hasTag "NER",
   :lcc-lr/identifies :lcc-3166-1/Niger,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "NER",
   :skos/definition "Alpha-3 country code for Niger (the)"})

(def NF
  {:db/ident :lcc-3166-1/NF,
   :lcc-lr/denotes :lcc-3166-1/NorfolkIsland,
   :lcc-lr/hasTag "NF",
   :lcc-lr/identifies :lcc-3166-1/NorfolkIsland,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "NF",
   :skos/definition "Alpha-2 country code for Norfolk Island"})

(def NFK
  {:db/ident :lcc-3166-1/NFK,
   :lcc-lr/denotes :lcc-3166-1/NorfolkIsland,
   :lcc-lr/hasTag "NFK",
   :lcc-lr/identifies :lcc-3166-1/NorfolkIsland,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "NFK",
   :skos/definition "Alpha-3 country code for Norfolk Island"})

(def NG
  {:db/ident :lcc-3166-1/NG,
   :lcc-lr/denotes :lcc-3166-1/Nigeria,
   :lcc-lr/hasTag "NG",
   :lcc-lr/identifies :lcc-3166-1/Nigeria,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "NG",
   :skos/definition "Alpha-2 country code for Nigeria"})

(def NGA
  {:db/ident :lcc-3166-1/NGA,
   :lcc-lr/denotes :lcc-3166-1/Nigeria,
   :lcc-lr/hasTag "NGA",
   :lcc-lr/identifies :lcc-3166-1/Nigeria,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "NGA",
   :skos/definition "Alpha-3 country code for Nigeria"})

(def NI
  {:db/ident :lcc-3166-1/NI,
   :lcc-lr/denotes :lcc-3166-1/Nicaragua,
   :lcc-lr/hasTag "NI",
   :lcc-lr/identifies :lcc-3166-1/Nicaragua,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "NI",
   :skos/definition "Alpha-2 country code for Nicaragua"})

(def NIC
  {:db/ident :lcc-3166-1/NIC,
   :lcc-lr/denotes :lcc-3166-1/Nicaragua,
   :lcc-lr/hasTag "NIC",
   :lcc-lr/identifies :lcc-3166-1/Nicaragua,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "NIC",
   :skos/definition "Alpha-3 country code for Nicaragua"})

(def NIU
  {:db/ident :lcc-3166-1/NIU,
   :lcc-lr/denotes :lcc-3166-1/Niue,
   :lcc-lr/hasTag "NIU",
   :lcc-lr/identifies :lcc-3166-1/Niue,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "NIU",
   :skos/definition "Alpha-3 country code for Niue"})

(def NL
  {:db/ident :lcc-3166-1/NL,
   :lcc-lr/denotes :lcc-3166-1/Netherlands,
   :lcc-lr/hasTag "NL",
   :lcc-lr/identifies :lcc-3166-1/Netherlands,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "NL",
   :skos/definition "Alpha-2 country code for Netherlands (the)"})

(def NLD
  {:db/ident :lcc-3166-1/NLD,
   :lcc-lr/denotes :lcc-3166-1/Netherlands,
   :lcc-lr/hasTag "NLD",
   :lcc-lr/identifies :lcc-3166-1/Netherlands,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "NLD",
   :skos/definition "Alpha-3 country code for Netherlands (the)"})

(def NO
  {:db/ident :lcc-3166-1/NO,
   :lcc-lr/denotes :lcc-3166-1/Norway,
   :lcc-lr/hasTag "NO",
   :lcc-lr/identifies :lcc-3166-1/Norway,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "NO",
   :skos/definition "Alpha-2 country code for Norway"})

(def NOR
  {:db/ident :lcc-3166-1/NOR,
   :lcc-lr/denotes :lcc-3166-1/Norway,
   :lcc-lr/hasTag "NOR",
   :lcc-lr/identifies :lcc-3166-1/Norway,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "NOR",
   :skos/definition "Alpha-3 country code for Norway"})

(def NP
  {:db/ident :lcc-3166-1/NP,
   :lcc-lr/denotes :lcc-3166-1/Nepal,
   :lcc-lr/hasTag "NP",
   :lcc-lr/identifies :lcc-3166-1/Nepal,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "NP",
   :skos/definition "Alpha-2 country code for Nepal"})

(def NPL
  {:db/ident :lcc-3166-1/NPL,
   :lcc-lr/denotes :lcc-3166-1/Nepal,
   :lcc-lr/hasTag "NPL",
   :lcc-lr/identifies :lcc-3166-1/Nepal,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "NPL",
   :skos/definition "Alpha-3 country code for Nepal"})

(def NR
  {:db/ident :lcc-3166-1/NR,
   :lcc-lr/denotes :lcc-3166-1/Nauru,
   :lcc-lr/hasTag "NR",
   :lcc-lr/identifies :lcc-3166-1/Nauru,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "NR",
   :skos/definition "Alpha-2 country code for Nauru"})

(def NRU
  {:db/ident :lcc-3166-1/NRU,
   :lcc-lr/denotes :lcc-3166-1/Nauru,
   :lcc-lr/hasTag "NRU",
   :lcc-lr/identifies :lcc-3166-1/Nauru,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "NRU",
   :skos/definition "Alpha-3 country code for Nauru"})

(def NU
  {:db/ident :lcc-3166-1/NU,
   :lcc-lr/denotes :lcc-3166-1/Niue,
   :lcc-lr/hasTag "NU",
   :lcc-lr/identifies :lcc-3166-1/Niue,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "NU",
   :skos/definition "Alpha-2 country code for Niue"})

(def NZ
  {:db/ident :lcc-3166-1/NZ,
   :lcc-lr/denotes :lcc-3166-1/NewZealand,
   :lcc-lr/hasTag "NZ",
   :lcc-lr/identifies :lcc-3166-1/NewZealand,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "NZ",
   :skos/definition "Alpha-2 country code for New Zealand"})

(def NZL
  {:db/ident :lcc-3166-1/NZL,
   :lcc-lr/denotes :lcc-3166-1/NewZealand,
   :lcc-lr/hasTag "NZL",
   :lcc-lr/identifies :lcc-3166-1/NewZealand,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "NZL",
   :skos/definition "Alpha-3 country code for New Zealand"})

(def Namibia
  {:db/ident :lcc-3166-1/Namibia,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Namibia"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Namibia"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "NAMIBIA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République de Namibie"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Namibie (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "NAMIBIE"},
   :lcc-cr/hasNumericRegionCode "516",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Namibia"},
   :skos/definition "the country of Namibia"})

(def Nauru
  {:db/ident :lcc-3166-1/Nauru,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Nauru"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Nauru"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "NAURU"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République de Nauru"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Nauru"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "NAURU"},
   :lcc-cr/hasLocalShortName {:rdf/language "na",
                              :rdf/value    "Naoero"},
   :lcc-cr/hasNumericRegionCode "520",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/English :lcc-639-1/Nauru},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Nauru"}
                 {:rdf/language "na",
                  :rdf/value    "Naoero"}},
   :skos/definition "the country of Nauru"})

(def Nepal
  {:db/ident :lcc-3166-1/Nepal,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Nepal"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "NEPAL"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Népal (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "NÉPAL"},
   :lcc-cr/hasLocalShortName {:rdf/language "ne",
                              :rdf/value    "Nepāl"},
   :lcc-cr/hasNumericRegionCode "524",
   :lcc-cr/hasRemarks
   "In September 2015 Nepal created a new federal structure consisting of 7 provinces. Until now only two of these provinces have names. The rest are identified by numbers only. These provinces should replace the zones and development regions but this has not yet been fully implemented.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Nepali,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "ne",
                :rdf/value    "Nepāl"},
   :skos/definition "the country of Nepal"})

(def Netherlands
  {:db/ident :lcc-3166-1/Netherlands,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Kingdom of the Netherlands"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Netherlands (the)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "NETHERLANDS"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "le Royaume des Pays-Bas"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Pays-Bas (les)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "PAYS-BAS"},
   :lcc-cr/hasLocalShortName {:rdf/language "nl",
                              :rdf/value    "Nederland"},
   :lcc-cr/hasNumericRegionCode "528",
   :lcc-cr/hasRemarks "Includes: the islands Bonaire, Sint Eustatius and Saba.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Dutch,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "nl",
                :rdf/value    "Nederland"},
   :skos/definition "the country of Netherlands (the)"})

(def NewCaledonia
  {:db/ident :lcc-3166-1/NewCaledonia,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "New Caledonia"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "NEW CALEDONIA"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Nouvelle-Calédonie (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "NOUVELLE-CALÉDONIE"},
   :lcc-cr/hasNumericRegionCode "540",
   :lcc-cr/hasRemarks
   #{"Includes: Loyalty Islands."
     "No subdivisions relevant for this standard. Included also as a subdivision of France (FR-NC)."},
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "fr",
                :rdf/value    "Nouvelle-Calédonie (la)"},
   :skos/definition "the country of New Caledonia"})

(def NewZealand
  {:db/ident :lcc-3166-1/NewZealand,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "New Zealand"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "NEW ZEALAND"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Nouvelle-Zélande (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "NOUVELLE-ZÉLANDE"},
   :lcc-cr/hasLocalShortName {:rdf/language "mi",
                              :rdf/value    "Aotearoa"},
   :lcc-cr/hasNumericRegionCode "554",
   :lcc-cr/hasRemarks
   "Includes: Antipodes Islands, Auckland Islands, Campbell Island, Chatham Islands, Kermadec Islands.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/Maori :lcc-639-1/English},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "New Zealand"}
                 {:rdf/language "mi",
                  :rdf/value    "Aotearoa"}},
   :skos/definition "the country of New Zealand"})

(def Nicaragua
  {:db/ident :lcc-3166-1/Nicaragua,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Nicaragua"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Nicaragua"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "NICARAGUA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Nicaragua"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Nicaragua (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "NICARAGUA"},
   :lcc-cr/hasLocalShortName {:rdf/language "es",
                              :rdf/value    "Nicaragua"},
   :lcc-cr/hasNumericRegionCode "558",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Spanish,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "es",
                :rdf/value    "Nicaragua"},
   :skos/definition "the country of Nicaragua"})

(def Niger
  {:db/ident :lcc-3166-1/Niger,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of the Niger"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Niger (the)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "NIGER"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Niger"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Niger (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "NIGER"},
   :lcc-cr/hasNumericRegionCode "562",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "fr",
                :rdf/value    "Niger (le)"},
   :skos/definition "the country of Niger (the)"})

(def Nigeria
  {:db/ident :lcc-3166-1/Nigeria,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Federal Republic of Nigeria"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Nigeria"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "NIGERIA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value "la République fédérale du Nigéria"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Nigéria (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "NIGÉRIA"},
   :lcc-cr/hasNumericRegionCode "566",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Nigeria"},
   :skos/definition "the country of Nigeria"})

(def Niue
  {:db/ident :lcc-3166-1/Niue,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Niue"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "NIUE"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Niue"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "NIUE"},
   :lcc-cr/hasLocalShortName "Niue",
   :lcc-cr/hasNumericRegionCode "570",
   :lcc-cr/hasRemarks "No subdivisions relevant for this standard.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-2/Niuean :lcc-639-1/English},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Niue"},
   :skos/definition "the country of Niue"})

(def NorfolkIsland
  {:db/ident :lcc-3166-1/NorfolkIsland,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Norfolk Island"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "NORFOLK ISLAND"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Norfolk (l'Île)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "NORFOLK, ÎLE"},
   :lcc-cr/hasNumericRegionCode "574",
   :lcc-cr/hasRemarks "No subdivisions relevant for this standard.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Norfolk Island"},
   :skos/definition "the country of Norfolk Island"})

(def NorthMacedonia
  {:db/ident :lcc-3166-1/NorthMacedonia,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of North Macedonia"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "North Macedonia"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "NORTH MACEDONIA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value "la République de Macédoine du Nord"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Macédoine du Nord (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "MACÉDOINE DU NORD"},
   :lcc-cr/hasLocalShortName {:rdf/language "mk",
                              :rdf/value    "Severna Makedonija"},
   :lcc-cr/hasNumericRegionCode "807",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Macedonian,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "mk",
                :rdf/value    "Severna Makedonija"},
   :skos/definition "the country of North Macedonia"})

(def NorthernMarianaIslands
  {:db/ident :lcc-3166-1/NorthernMarianaIslands,
   :lcc-cr/hasEnglishFullName
   {:rdf/language "en",
    :rdf/value    "the Commonwealth of the Northern Mariana Islands"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Northern Mariana Islands (the)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value
                                          "NORTHERN MARIANA ISLANDS"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "les Îles Mariannes du Nord"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Mariannes du Nord (les Îles)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value "MARIANNES DU NORD, ÎLES"},
   :lcc-cr/hasNumericRegionCode "580",
   :lcc-cr/hasRemarks
   #{"Comprises: Mariana Islands (except GUAM, see separate entry). (Principal island: Saipan)."
     "No subdivisions relevant for this standard. Included also as a subdivision of the United States (US-MP)."},
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Northern Mariana Islands (the)"},
   :skos/definition "the country of Northern Mariana Islands (the)"})

(def Norway
  {:db/ident :lcc-3166-1/Norway,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Kingdom of Norway"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Norway"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "NORWAY"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "le Royaume de Norvège"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Norvège (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "NORVÈGE"},
   :lcc-cr/hasLocalShortName #{{:rdf/language "nb",
                                :rdf/value    "Norge"}
                               {:rdf/language "nn",
                                :rdf/value    "Noreg"}},
   :lcc-cr/hasNumericRegionCode "578",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/NorwegianNynorsk
                                        :lcc-639-1/NorwegianBokmal},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "nb",
                  :rdf/value    "Norge"}
                 {:rdf/language "nn",
                  :rdf/value    "Noreg"}},
   :skos/definition "the country of Norway"})

(def OM
  {:db/ident :lcc-3166-1/OM,
   :lcc-lr/denotes :lcc-3166-1/Oman,
   :lcc-lr/hasTag "OM",
   :lcc-lr/identifies :lcc-3166-1/Oman,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "OM",
   :skos/definition "Alpha-2 country code for Oman"})

(def OMN
  {:db/ident :lcc-3166-1/OMN,
   :lcc-lr/denotes :lcc-3166-1/Oman,
   :lcc-lr/hasTag "OMN",
   :lcc-lr/identifies :lcc-3166-1/Oman,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "OMN",
   :skos/definition "Alpha-3 country code for Oman"})

(def Oman
  {:db/ident :lcc-3166-1/Oman,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Sultanate of Oman"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Oman"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "OMAN"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "le Sultanat d'Oman"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Oman"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "OMAN"},
   :lcc-cr/hasLocalShortName {:rdf/language "ar",
                              :rdf/value    "‘Umān"},
   :lcc-cr/hasNumericRegionCode "512",
   :lcc-cr/hasRemarks "Includes: part of the Musandam Peninsula.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Arabic,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "ar",
                :rdf/value    "‘Umān"},
   :skos/definition "the country of Oman"})

(def PA
  {:db/ident :lcc-3166-1/PA,
   :lcc-lr/denotes :lcc-3166-1/Panama,
   :lcc-lr/hasTag "PA",
   :lcc-lr/identifies :lcc-3166-1/Panama,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "PA",
   :skos/definition "Alpha-2 country code for Panama"})

(def PAK
  {:db/ident :lcc-3166-1/PAK,
   :lcc-lr/denotes :lcc-3166-1/Pakistan,
   :lcc-lr/hasTag "PAK",
   :lcc-lr/identifies :lcc-3166-1/Pakistan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "PAK",
   :skos/definition "Alpha-3 country code for Pakistan"})

(def PAN
  {:db/ident :lcc-3166-1/PAN,
   :lcc-lr/denotes :lcc-3166-1/Panama,
   :lcc-lr/hasTag "PAN",
   :lcc-lr/identifies :lcc-3166-1/Panama,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "PAN",
   :skos/definition "Alpha-3 country code for Panama"})

(def PCN
  {:db/ident :lcc-3166-1/PCN,
   :lcc-lr/denotes :lcc-3166-1/Pitcairn,
   :lcc-lr/hasTag "PCN",
   :lcc-lr/identifies :lcc-3166-1/Pitcairn,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "PCN",
   :skos/definition "Alpha-3 country code for Pitcairn"})

(def PE
  {:db/ident :lcc-3166-1/PE,
   :lcc-lr/denotes :lcc-3166-1/Peru,
   :lcc-lr/hasTag "PE",
   :lcc-lr/identifies :lcc-3166-1/Peru,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "PE",
   :skos/definition "Alpha-2 country code for Peru"})

(def PER
  {:db/ident :lcc-3166-1/PER,
   :lcc-lr/denotes :lcc-3166-1/Peru,
   :lcc-lr/hasTag "PER",
   :lcc-lr/identifies :lcc-3166-1/Peru,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "PER",
   :skos/definition "Alpha-3 country code for Peru"})

(def PF
  {:db/ident :lcc-3166-1/PF,
   :lcc-lr/denotes :lcc-3166-1/FrenchPolynesia,
   :lcc-lr/hasTag "PF",
   :lcc-lr/identifies :lcc-3166-1/FrenchPolynesia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "PF",
   :skos/definition "Alpha-2 country code for French Polynesia"})

(def PG
  {:db/ident :lcc-3166-1/PG,
   :lcc-lr/denotes :lcc-3166-1/PapuaNewGuinea,
   :lcc-lr/hasTag "PG",
   :lcc-lr/identifies :lcc-3166-1/PapuaNewGuinea,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "PG",
   :skos/definition "Alpha-2 country code for Papua New Guinea"})

(def PH
  {:db/ident :lcc-3166-1/PH,
   :lcc-lr/denotes :lcc-3166-1/Philippines,
   :lcc-lr/hasTag "PH",
   :lcc-lr/identifies :lcc-3166-1/Philippines,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "PH",
   :skos/definition "Alpha-2 country code for Philippines (the)"})

(def PHL
  {:db/ident :lcc-3166-1/PHL,
   :lcc-lr/denotes :lcc-3166-1/Philippines,
   :lcc-lr/hasTag "PHL",
   :lcc-lr/identifies :lcc-3166-1/Philippines,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "PHL",
   :skos/definition "Alpha-3 country code for Philippines (the)"})

(def PK
  {:db/ident :lcc-3166-1/PK,
   :lcc-lr/denotes :lcc-3166-1/Pakistan,
   :lcc-lr/hasTag "PK",
   :lcc-lr/identifies :lcc-3166-1/Pakistan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "PK",
   :skos/definition "Alpha-2 country code for Pakistan"})

(def PL
  {:db/ident :lcc-3166-1/PL,
   :lcc-lr/denotes :lcc-3166-1/Poland,
   :lcc-lr/hasTag "PL",
   :lcc-lr/identifies :lcc-3166-1/Poland,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "PL",
   :skos/definition "Alpha-2 country code for Poland"})

(def PLW
  {:db/ident :lcc-3166-1/PLW,
   :lcc-lr/denotes :lcc-3166-1/Palau,
   :lcc-lr/hasTag "PLW",
   :lcc-lr/identifies :lcc-3166-1/Palau,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "PLW",
   :skos/definition "Alpha-3 country code for Palau"})

(def PM
  {:db/ident :lcc-3166-1/PM,
   :lcc-lr/denotes :lcc-3166-1/SaintPierreAndMiquelon,
   :lcc-lr/hasTag "PM",
   :lcc-lr/identifies :lcc-3166-1/SaintPierreAndMiquelon,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "PM",
   :skos/definition "Alpha-2 country code for Saint Pierre and Miquelon"})

(def PN
  {:db/ident :lcc-3166-1/PN,
   :lcc-lr/denotes :lcc-3166-1/Pitcairn,
   :lcc-lr/hasTag "PN",
   :lcc-lr/identifies :lcc-3166-1/Pitcairn,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "PN",
   :skos/definition "Alpha-2 country code for Pitcairn"})

(def PNG
  {:db/ident :lcc-3166-1/PNG,
   :lcc-lr/denotes :lcc-3166-1/PapuaNewGuinea,
   :lcc-lr/hasTag "PNG",
   :lcc-lr/identifies :lcc-3166-1/PapuaNewGuinea,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "PNG",
   :skos/definition "Alpha-3 country code for Papua New Guinea"})

(def POL
  {:db/ident :lcc-3166-1/POL,
   :lcc-lr/denotes :lcc-3166-1/Poland,
   :lcc-lr/hasTag "POL",
   :lcc-lr/identifies :lcc-3166-1/Poland,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "POL",
   :skos/definition "Alpha-3 country code for Poland"})

(def PR
  {:db/ident :lcc-3166-1/PR,
   :lcc-lr/denotes :lcc-3166-1/PuertoRico,
   :lcc-lr/hasTag "PR",
   :lcc-lr/identifies :lcc-3166-1/PuertoRico,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "PR",
   :skos/definition "Alpha-2 country code for Puerto Rico"})

(def PRI
  {:db/ident :lcc-3166-1/PRI,
   :lcc-lr/denotes :lcc-3166-1/PuertoRico,
   :lcc-lr/hasTag "PRI",
   :lcc-lr/identifies :lcc-3166-1/PuertoRico,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "PRI",
   :skos/definition "Alpha-3 country code for Puerto Rico"})

(def PRK
  {:db/ident :lcc-3166-1/PRK,
   :lcc-lr/denotes :lcc-3166-1/KoreaDemocraticPeoplesRepublicOf,
   :lcc-lr/hasTag "PRK",
   :lcc-lr/identifies :lcc-3166-1/KoreaDemocraticPeoplesRepublicOf,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "PRK",
   :skos/definition
   "Alpha-3 country code for Korea Democratic Peoples Republic Of"})

(def PRT
  {:db/ident :lcc-3166-1/PRT,
   :lcc-lr/denotes :lcc-3166-1/Portugal,
   :lcc-lr/hasTag "PRT",
   :lcc-lr/identifies :lcc-3166-1/Portugal,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "PRT",
   :skos/definition "Alpha-3 country code for Portugal"})

(def PRY
  {:db/ident :lcc-3166-1/PRY,
   :lcc-lr/denotes :lcc-3166-1/Paraguay,
   :lcc-lr/hasTag "PRY",
   :lcc-lr/identifies :lcc-3166-1/Paraguay,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "PRY",
   :skos/definition "Alpha-3 country code for Paraguay"})

(def PS
  {:db/ident :lcc-3166-1/PS,
   :lcc-lr/denotes :lcc-3166-1/Palestine,
   :lcc-lr/hasTag "PS",
   :lcc-lr/identifies :lcc-3166-1/Palestine,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "PS",
   :skos/definition "Alpha-2 country code for Palestine, State of"})

(def PSE
  {:db/ident :lcc-3166-1/PSE,
   :lcc-lr/denotes :lcc-3166-1/Palestine,
   :lcc-lr/hasTag "PSE",
   :lcc-lr/identifies :lcc-3166-1/Palestine,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "PSE",
   :skos/definition "Alpha-3 country code for Palestine, State of"})

(def PT
  {:db/ident :lcc-3166-1/PT,
   :lcc-lr/denotes :lcc-3166-1/Portugal,
   :lcc-lr/hasTag "PT",
   :lcc-lr/identifies :lcc-3166-1/Portugal,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "PT",
   :skos/definition "Alpha-2 country code for Portugal"})

(def PW
  {:db/ident :lcc-3166-1/PW,
   :lcc-lr/denotes :lcc-3166-1/Palau,
   :lcc-lr/hasTag "PW",
   :lcc-lr/identifies :lcc-3166-1/Palau,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "PW",
   :skos/definition "Alpha-2 country code for Palau"})

(def PY
  {:db/ident :lcc-3166-1/PY,
   :lcc-lr/denotes :lcc-3166-1/Paraguay,
   :lcc-lr/hasTag "PY",
   :lcc-lr/identifies :lcc-3166-1/Paraguay,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "PY",
   :skos/definition "Alpha-2 country code for Paraguay"})

(def PYF
  {:db/ident :lcc-3166-1/PYF,
   :lcc-lr/denotes :lcc-3166-1/FrenchPolynesia,
   :lcc-lr/hasTag "PYF",
   :lcc-lr/identifies :lcc-3166-1/FrenchPolynesia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "PYF",
   :skos/definition "Alpha-3 country code for French Polynesia"})

(def Pakistan
  {:db/ident :lcc-3166-1/Pakistan,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value "the Islamic Republic of Pakistan"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Pakistan"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "PAKISTAN"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value "la République islamique du Pakistan"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Pakistan (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "PAKISTAN"},
   :lcc-cr/hasLocalShortName {:rdf/language "ur",
                              :rdf/value    "Pākistān"},
   :lcc-cr/hasNumericRegionCode "586",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/English :lcc-639-1/Urdu},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "ur",
                  :rdf/value    "Pākistān"}
                 {:rdf/language "en",
                  :rdf/value    "Pakistan"}},
   :skos/definition "the country of Pakistan"})

(def Palau
  {:db/ident :lcc-3166-1/Palau,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Palau"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Palau"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "PALAU"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République des Palaos"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Palaos (les)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "PALAOS"},
   :lcc-cr/hasLocalShortName "Belau",
   :lcc-cr/hasNumericRegionCode "585",
   :lcc-cr/hasRemarks
   "Comprises: the west part of the Caroline Islands (Principal island: Babelthuap).",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-2/Palauan :lcc-639-1/English},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Palau"},
   :skos/definition "the country of Palau"})

(def Palestine
  {:db/ident :lcc-3166-1/Palestine,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the State of Palestine"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Palestine, State of"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "PALESTINE, STATE OF"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "l'État de Palestine"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Palestine, État de"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "PALESTINE, ÉTAT DE"},
   :lcc-cr/hasLocalShortName {:rdf/language "ar",
                              :rdf/value    "Dawlat Filasţīn"},
   :lcc-cr/hasNumericRegionCode "275",
   :lcc-cr/hasRemarks "Remark: Conventional names.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Arabic,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "ar",
                :rdf/value    "Dawlat Filasţīn"},
   :skos/definition "the country of Palestine, State of"})

(def Panama
  {:db/ident :lcc-3166-1/Panama,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Panama"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Panama"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "PANAMA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Panama"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Panama (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "PANAMA"},
   :lcc-cr/hasLocalShortName {:rdf/language "es",
                              :rdf/value    "Panamá"},
   :lcc-cr/hasNumericRegionCode "591",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Spanish,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "es",
                :rdf/value    "Panamá"},
   :skos/definition "the country of Panama"})

(def PapuaNewGuinea
  {:db/ident :lcc-3166-1/PapuaNewGuinea,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value
                               "the Independent State of Papua New Guinea"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Papua New Guinea"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "PAPUA NEW GUINEA"},
   :lcc-cr/hasFrenchFullName
   {:rdf/language "fr",
    :rdf/value    "l'État indépendant de Papouasie-Nouvelle-Guinée"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Papouasie-Nouvelle-Guinée (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value
                                         "PAPOUASIE-NOUVELLE-GUINÉE"},
   :lcc-cr/hasLocalShortName #{{:rdf/language "ho",
                                :rdf/value    "Papuaniugini"} "Papuaniugini"},
   :lcc-cr/hasNumericRegionCode "598",
   :lcc-cr/hasRemarks
   "Includes: Bismarck Archipelago, Northern Solomon Islands (Principal island: Bougainville).",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-2/TokPisin :lcc-639-1/HiriMotu
                                        :lcc-639-1/English},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "ho",
                  :rdf/value    "Papuaniugini"}
                 {:rdf/language "en",
                  :rdf/value    "Papua New Guinea"}},
   :skos/definition "the country of Papua New Guinea"})

(def Paraguay
  {:db/ident :lcc-3166-1/Paraguay,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Paraguay"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Paraguay"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "PARAGUAY"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Paraguay"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Paraguay (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "PARAGUAY"},
   :lcc-cr/hasLocalShortName #{{:rdf/language "es",
                                :rdf/value    "Paraguay (el)"}
                               {:rdf/language "gn",
                                :rdf/value    "Paraguay"}},
   :lcc-cr/hasNumericRegionCode "600",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/Spanish :lcc-639-1/Guarani},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "es",
                  :rdf/value    "Paraguay (el)"}
                 {:rdf/language "gn",
                  :rdf/value    "Paraguay"}},
   :skos/definition "the country of Paraguay"})

(def Peru
  {:db/ident :lcc-3166-1/Peru,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Peru"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Peru"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "PERU"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Pérou"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Pérou (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "PÉROU"},
   :lcc-cr/hasLocalShortName #{{:rdf/language "ay",
                                :rdf/value    "Perú"}
                               {:rdf/language "es",
                                :rdf/value    "Perú (el)"}
                               {:rdf/language "qu",
                                :rdf/value    "Perú"}},
   :lcc-cr/hasNumericRegionCode "604",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/Spanish :lcc-639-1/Aymara
                                        :lcc-639-1/Quechua},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "ay",
                  :rdf/value    "Perú"}
                 {:rdf/language "es",
                  :rdf/value    "Perú (el)"}
                 {:rdf/language "qu",
                  :rdf/value    "Perú"}},
   :skos/definition "the country of Peru"})

(def Philippines
  {:db/ident :lcc-3166-1/Philippines,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of the Philippines"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Philippines (the)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "PHILIPPINES"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République des Philippines"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Philippines (les)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "PHILIPPINES"},
   :lcc-cr/hasLocalShortName {:rdf/language "tl",
                              :rdf/value    "Pilipinas"},
   :lcc-cr/hasNumericRegionCode "608",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/Tagalog :lcc-639-1/English},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Philippines (the)"}
                 {:rdf/language "tl",
                  :rdf/value    "Pilipinas"}},
   :skos/definition "the country of Philippines (the)"})

(def Pitcairn
  {:db/ident :lcc-3166-1/Pitcairn,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Pitcairn"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "PITCAIRN"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Pitcairn"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "PITCAIRN"},
   :lcc-cr/hasNumericRegionCode "612",
   :lcc-cr/hasRemarks
   #{"No subdivisions relevant for this standard."
     "Includes: Ducie Island, Henderson Island, Oeno Island."},
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Pitcairn"},
   :skos/definition "the country of Pitcairn"})

(def Poland
  {:db/ident :lcc-3166-1/Poland,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Poland"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Poland"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "POLAND"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République de Pologne"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Pologne (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "POLOGNE"},
   :lcc-cr/hasLocalShortName {:rdf/language "pl",
                              :rdf/value    "Polska"},
   :lcc-cr/hasNumericRegionCode "616",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Polish,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "pl",
                :rdf/value    "Polska"},
   :skos/definition "the country of Poland"})

(def Portugal
  {:db/ident :lcc-3166-1/Portugal,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Portuguese Republic"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Portugal"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "PORTUGAL"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République portugaise"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Portugal (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "PORTUGAL"},
   :lcc-cr/hasLocalShortName {:rdf/language "pt",
                              :rdf/value    "Portugal"},
   :lcc-cr/hasNumericRegionCode "620",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Portuguese,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "pt",
                :rdf/value    "Portugal"},
   :skos/definition "the country of Portugal"})

(def PuertoRico
  {:db/ident :lcc-3166-1/PuertoRico,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Puerto Rico"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "PUERTO RICO"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Porto Rico"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "PORTO RICO"},
   :lcc-cr/hasLocalShortName {:rdf/language "es",
                              :rdf/value    "Puerto Rico"},
   :lcc-cr/hasNumericRegionCode "630",
   :lcc-cr/hasRemarks
   "No subdivisions relevant for this standard. Included also as a subdivision of the United States (US-PR).",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/Spanish :lcc-639-1/English},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Puerto Rico"}
                 {:rdf/language "es",
                  :rdf/value    "Puerto Rico"}},
   :skos/definition "the country of Puerto Rico"})

(def QA
  {:db/ident :lcc-3166-1/QA,
   :lcc-lr/denotes :lcc-3166-1/Qatar,
   :lcc-lr/hasTag "QA",
   :lcc-lr/identifies :lcc-3166-1/Qatar,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "QA",
   :skos/definition "Alpha-2 country code for Qatar"})

(def QAT
  {:db/ident :lcc-3166-1/QAT,
   :lcc-lr/denotes :lcc-3166-1/Qatar,
   :lcc-lr/hasTag "QAT",
   :lcc-lr/identifies :lcc-3166-1/Qatar,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "QAT",
   :skos/definition "Alpha-3 country code for Qatar"})

(def Qatar
  {:db/ident :lcc-3166-1/Qatar,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the State of Qatar"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Qatar"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "QATAR"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "l'État du Qatar"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Qatar (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "QATAR"},
   :lcc-cr/hasLocalShortName {:rdf/language "ar",
                              :rdf/value    "Qaţar"},
   :lcc-cr/hasNumericRegionCode "634",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Arabic,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "ar",
                :rdf/value    "Qaţar"},
   :skos/definition "the country of Qatar"})

(def RE
  {:db/ident :lcc-3166-1/RE,
   :lcc-lr/denotes :lcc-3166-1/Reunion,
   :lcc-lr/hasTag "RE",
   :lcc-lr/identifies :lcc-3166-1/Reunion,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "RE",
   :skos/definition "Alpha-2 country code for Réunion"})

(def REU
  {:db/ident :lcc-3166-1/REU,
   :lcc-lr/denotes :lcc-3166-1/Reunion,
   :lcc-lr/hasTag "REU",
   :lcc-lr/identifies :lcc-3166-1/Reunion,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "REU",
   :skos/definition "Alpha-3 country code for Réunion"})

(def RO
  {:db/ident :lcc-3166-1/RO,
   :lcc-lr/denotes :lcc-3166-1/Romania,
   :lcc-lr/hasTag "RO",
   :lcc-lr/identifies :lcc-3166-1/Romania,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "RO",
   :skos/definition "Alpha-2 country code for Romania"})

(def ROU
  {:db/ident :lcc-3166-1/ROU,
   :lcc-lr/denotes :lcc-3166-1/Romania,
   :lcc-lr/hasTag "ROU",
   :lcc-lr/identifies :lcc-3166-1/Romania,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "ROU",
   :skos/definition "Alpha-3 country code for Romania"})

(def RS
  {:db/ident :lcc-3166-1/RS,
   :lcc-lr/denotes :lcc-3166-1/Serbia,
   :lcc-lr/hasTag "RS",
   :lcc-lr/identifies :lcc-3166-1/Serbia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "RS",
   :skos/definition "Alpha-2 country code for Serbia"})

(def RU
  {:db/ident :lcc-3166-1/RU,
   :lcc-lr/denotes :lcc-3166-1/RussianFederation,
   :lcc-lr/hasTag "RU",
   :lcc-lr/identifies :lcc-3166-1/RussianFederation,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "RU",
   :skos/definition "Alpha-2 country code for Russian Federation (the)"})

(def RUS
  {:db/ident :lcc-3166-1/RUS,
   :lcc-lr/denotes :lcc-3166-1/RussianFederation,
   :lcc-lr/hasTag "RUS",
   :lcc-lr/identifies :lcc-3166-1/RussianFederation,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "RUS",
   :skos/definition "Alpha-3 country code for Russian Federation (the)"})

(def RW
  {:db/ident :lcc-3166-1/RW,
   :lcc-lr/denotes :lcc-3166-1/Rwanda,
   :lcc-lr/hasTag "RW",
   :lcc-lr/identifies :lcc-3166-1/Rwanda,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "RW",
   :skos/definition "Alpha-2 country code for Rwanda"})

(def RWA
  {:db/ident :lcc-3166-1/RWA,
   :lcc-lr/denotes :lcc-3166-1/Rwanda,
   :lcc-lr/hasTag "RWA",
   :lcc-lr/identifies :lcc-3166-1/Rwanda,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "RWA",
   :skos/definition "Alpha-3 country code for Rwanda"})

(def Reunion
  {:db/ident :lcc-3166-1/Reunion,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Réunion"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "RÉUNION"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Réunion (La)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "RÉUNION"},
   :lcc-cr/hasNumericRegionCode "638",
   :lcc-cr/hasRemarks
   "No subdivisions relevant for this standard. Included also as a subdivision of France (FR-RE).",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "fr",
                :rdf/value    "Réunion (La)"},
   :skos/definition "the country of Réunion"})

(def Romania
  {:db/ident :lcc-3166-1/Romania,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Romania"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "ROMANIA"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Roumanie (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "ROUMANIE"},
   :lcc-cr/hasLocalShortName {:rdf/language "ro",
                              :rdf/value    "România"},
   :lcc-cr/hasNumericRegionCode "642",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Romanian,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "ro",
                :rdf/value    "România"},
   :skos/definition "the country of Romania"})

(def RussianFederation
  {:db/ident :lcc-3166-1/RussianFederation,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Russian Federation"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Russian Federation (the)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "RUSSIAN FEDERATION"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la Fédération de Russie"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Russie (la Fédération de)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "RUSSIE, FÉDÉRATION DE"},
   :lcc-cr/hasLocalShortName {:rdf/language "ru",
                              :rdf/value    "Rossijskaja Federacija"},
   :lcc-cr/hasNumericRegionCode "643",
   :lcc-cr/hasRemarks "Includes: the Kaliningrad Region.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Russian,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "ru",
                :rdf/value    "Rossijskaja Federacija"},
   :skos/definition "the country of Russian Federation (the)"})

(def Rwanda
  {:db/ident :lcc-3166-1/Rwanda,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Rwanda"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Rwanda"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "RWANDA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Rwanda"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Rwanda (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "RWANDA"},
   :lcc-cr/hasLocalShortName {:rdf/language "rw",
                              :rdf/value    "Rwanda"},
   :lcc-cr/hasNumericRegionCode "646",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/Kinyarwanda
                                        :lcc-639-1/English :lcc-639-1/French},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Rwanda"}
                 {:rdf/language "fr",
                  :rdf/value    "Rwanda (le)"}
                 {:rdf/language "rw",
                  :rdf/value    "Rwanda"}},
   :skos/definition "the country of Rwanda"})

(def SA
  {:db/ident :lcc-3166-1/SA,
   :lcc-lr/denotes :lcc-3166-1/SaudiArabia,
   :lcc-lr/hasTag "SA",
   :lcc-lr/identifies :lcc-3166-1/SaudiArabia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "SA",
   :skos/definition "Alpha-2 country code for Saudi Arabia"})

(def SAU
  {:db/ident :lcc-3166-1/SAU,
   :lcc-lr/denotes :lcc-3166-1/SaudiArabia,
   :lcc-lr/hasTag "SAU",
   :lcc-lr/identifies :lcc-3166-1/SaudiArabia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "SAU",
   :skos/definition "Alpha-3 country code for Saudi Arabia"})

(def SB
  {:db/ident :lcc-3166-1/SB,
   :lcc-lr/denotes :lcc-3166-1/SolomonIslands,
   :lcc-lr/hasTag "SB",
   :lcc-lr/identifies :lcc-3166-1/SolomonIslands,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "SB",
   :skos/definition "Alpha-2 country code for Solomon Islands"})

(def SC
  {:db/ident :lcc-3166-1/SC,
   :lcc-lr/denotes :lcc-3166-1/Seychelles,
   :lcc-lr/hasTag "SC",
   :lcc-lr/identifies :lcc-3166-1/Seychelles,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "SC",
   :skos/definition "Alpha-2 country code for Seychelles"})

(def SD
  {:db/ident :lcc-3166-1/SD,
   :lcc-lr/denotes :lcc-3166-1/Sudan,
   :lcc-lr/hasTag "SD",
   :lcc-lr/identifies :lcc-3166-1/Sudan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "SD",
   :skos/definition "Alpha-2 country code for Sudan (the)"})

(def SDN
  {:db/ident :lcc-3166-1/SDN,
   :lcc-lr/denotes :lcc-3166-1/Sudan,
   :lcc-lr/hasTag "SDN",
   :lcc-lr/identifies :lcc-3166-1/Sudan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "SDN",
   :skos/definition "Alpha-3 country code for Sudan (the)"})

(def SE
  {:db/ident :lcc-3166-1/SE,
   :lcc-lr/denotes :lcc-3166-1/Sweden,
   :lcc-lr/hasTag "SE",
   :lcc-lr/identifies :lcc-3166-1/Sweden,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "SE",
   :skos/definition "Alpha-2 country code for Sweden"})

(def SEN
  {:db/ident :lcc-3166-1/SEN,
   :lcc-lr/denotes :lcc-3166-1/Senegal,
   :lcc-lr/hasTag "SEN",
   :lcc-lr/identifies :lcc-3166-1/Senegal,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "SEN",
   :skos/definition "Alpha-3 country code for Senegal"})

(def SG
  {:db/ident :lcc-3166-1/SG,
   :lcc-lr/denotes :lcc-3166-1/Singapore,
   :lcc-lr/hasTag "SG",
   :lcc-lr/identifies :lcc-3166-1/Singapore,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "SG",
   :skos/definition "Alpha-2 country code for Singapore"})

(def SGP
  {:db/ident :lcc-3166-1/SGP,
   :lcc-lr/denotes :lcc-3166-1/Singapore,
   :lcc-lr/hasTag "SGP",
   :lcc-lr/identifies :lcc-3166-1/Singapore,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "SGP",
   :skos/definition "Alpha-3 country code for Singapore"})

(def SGS
  {:db/ident :lcc-3166-1/SGS,
   :lcc-lr/denotes :lcc-3166-1/SouthGeorgiaAndTheSouthSandwichIslands,
   :lcc-lr/hasTag "SGS",
   :lcc-lr/identifies :lcc-3166-1/SouthGeorgiaAndTheSouthSandwichIslands,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "SGS",
   :skos/definition
   "Alpha-3 country code for South Georgia and the South Sandwich Islands"})

(def SH
  {:db/ident :lcc-3166-1/SH,
   :lcc-lr/denotes :lcc-3166-1/SaintHelena,
   :lcc-lr/hasTag "SH",
   :lcc-lr/identifies :lcc-3166-1/SaintHelena,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "SH",
   :skos/definition
   "Alpha-2 country code for Saint Helena, Ascension and Tristan da Cunha"})

(def SHN
  {:db/ident :lcc-3166-1/SHN,
   :lcc-lr/denotes :lcc-3166-1/SaintHelena,
   :lcc-lr/hasTag "SHN",
   :lcc-lr/identifies :lcc-3166-1/SaintHelena,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "SHN",
   :skos/definition
   "Alpha-3 country code for Saint Helena, Ascension and Tristan da Cunha"})

(def SI
  {:db/ident :lcc-3166-1/SI,
   :lcc-lr/denotes :lcc-3166-1/Slovenia,
   :lcc-lr/hasTag "SI",
   :lcc-lr/identifies :lcc-3166-1/Slovenia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "SI",
   :skos/definition "Alpha-2 country code for Slovenia"})

(def SJ
  {:db/ident :lcc-3166-1/SJ,
   :lcc-lr/denotes :lcc-3166-1/SvalbardAndJanMayen,
   :lcc-lr/hasTag "SJ",
   :lcc-lr/identifies :lcc-3166-1/SvalbardAndJanMayen,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "SJ",
   :skos/definition "Alpha-2 country code for Svalbard and Jan Mayen"})

(def SJM
  {:db/ident :lcc-3166-1/SJM,
   :lcc-lr/denotes :lcc-3166-1/SvalbardAndJanMayen,
   :lcc-lr/hasTag "SJM",
   :lcc-lr/identifies :lcc-3166-1/SvalbardAndJanMayen,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "SJM",
   :skos/definition "Alpha-3 country code for Svalbard and Jan Mayen"})

(def SK
  {:db/ident :lcc-3166-1/SK,
   :lcc-lr/denotes :lcc-3166-1/Slovakia,
   :lcc-lr/hasTag "SK",
   :lcc-lr/identifies :lcc-3166-1/Slovakia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "SK",
   :skos/definition "Alpha-2 country code for Slovakia"})

(def SL
  {:db/ident :lcc-3166-1/SL,
   :lcc-lr/denotes :lcc-3166-1/SierraLeone,
   :lcc-lr/hasTag "SL",
   :lcc-lr/identifies :lcc-3166-1/SierraLeone,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "SL",
   :skos/definition "Alpha-2 country code for Sierra Leone"})

(def SLB
  {:db/ident :lcc-3166-1/SLB,
   :lcc-lr/denotes :lcc-3166-1/SolomonIslands,
   :lcc-lr/hasTag "SLB",
   :lcc-lr/identifies :lcc-3166-1/SolomonIslands,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "SLB",
   :skos/definition "Alpha-3 country code for Solomon Islands"})

(def SLE
  {:db/ident :lcc-3166-1/SLE,
   :lcc-lr/denotes :lcc-3166-1/SierraLeone,
   :lcc-lr/hasTag "SLE",
   :lcc-lr/identifies :lcc-3166-1/SierraLeone,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "SLE",
   :skos/definition "Alpha-3 country code for Sierra Leone"})

(def SLV
  {:db/ident :lcc-3166-1/SLV,
   :lcc-lr/denotes :lcc-3166-1/ElSalvador,
   :lcc-lr/hasTag "SLV",
   :lcc-lr/identifies :lcc-3166-1/ElSalvador,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "SLV",
   :skos/definition "Alpha-3 country code for El Salvador"})

(def SM
  {:db/ident :lcc-3166-1/SM,
   :lcc-lr/denotes :lcc-3166-1/SanMarino,
   :lcc-lr/hasTag "SM",
   :lcc-lr/identifies :lcc-3166-1/SanMarino,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "SM",
   :skos/definition "Alpha-2 country code for San Marino"})

(def SMR
  {:db/ident :lcc-3166-1/SMR,
   :lcc-lr/denotes :lcc-3166-1/SanMarino,
   :lcc-lr/hasTag "SMR",
   :lcc-lr/identifies :lcc-3166-1/SanMarino,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "SMR",
   :skos/definition "Alpha-3 country code for San Marino"})

(def SN
  {:db/ident :lcc-3166-1/SN,
   :lcc-lr/denotes :lcc-3166-1/Senegal,
   :lcc-lr/hasTag "SN",
   :lcc-lr/identifies :lcc-3166-1/Senegal,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "SN",
   :skos/definition "Alpha-2 country code for Senegal"})

(def SO
  {:db/ident :lcc-3166-1/SO,
   :lcc-lr/denotes :lcc-3166-1/Somalia,
   :lcc-lr/hasTag "SO",
   :lcc-lr/identifies :lcc-3166-1/Somalia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "SO",
   :skos/definition "Alpha-2 country code for Somalia"})

(def SOM
  {:db/ident :lcc-3166-1/SOM,
   :lcc-lr/denotes :lcc-3166-1/Somalia,
   :lcc-lr/hasTag "SOM",
   :lcc-lr/identifies :lcc-3166-1/Somalia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "SOM",
   :skos/definition "Alpha-3 country code for Somalia"})

(def SPM
  {:db/ident :lcc-3166-1/SPM,
   :lcc-lr/denotes :lcc-3166-1/SaintPierreAndMiquelon,
   :lcc-lr/hasTag "SPM",
   :lcc-lr/identifies :lcc-3166-1/SaintPierreAndMiquelon,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "SPM",
   :skos/definition "Alpha-3 country code for Saint Pierre and Miquelon"})

(def SR
  {:db/ident :lcc-3166-1/SR,
   :lcc-lr/denotes :lcc-3166-1/Suriname,
   :lcc-lr/hasTag "SR",
   :lcc-lr/identifies :lcc-3166-1/Suriname,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "SR",
   :skos/definition "Alpha-2 country code for Suriname"})

(def SRB
  {:db/ident :lcc-3166-1/SRB,
   :lcc-lr/denotes :lcc-3166-1/Serbia,
   :lcc-lr/hasTag "SRB",
   :lcc-lr/identifies :lcc-3166-1/Serbia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "SRB",
   :skos/definition "Alpha-3 country code for Serbia"})

(def SS
  {:db/ident :lcc-3166-1/SS,
   :lcc-lr/denotes :lcc-3166-1/SouthSudan,
   :lcc-lr/hasTag "SS",
   :lcc-lr/identifies :lcc-3166-1/SouthSudan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "SS",
   :skos/definition "Alpha-2 country code for South Sudan"})

(def SSD
  {:db/ident :lcc-3166-1/SSD,
   :lcc-lr/denotes :lcc-3166-1/SouthSudan,
   :lcc-lr/hasTag "SSD",
   :lcc-lr/identifies :lcc-3166-1/SouthSudan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "SSD",
   :skos/definition "Alpha-3 country code for South Sudan"})

(def ST
  {:db/ident :lcc-3166-1/ST,
   :lcc-lr/denotes :lcc-3166-1/SaoTomeAndPrincipe,
   :lcc-lr/hasTag "ST",
   :lcc-lr/identifies :lcc-3166-1/SaoTomeAndPrincipe,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "ST",
   :skos/definition "Alpha-2 country code for Sao Tome and Principe"})

(def STP
  {:db/ident :lcc-3166-1/STP,
   :lcc-lr/denotes :lcc-3166-1/SaoTomeAndPrincipe,
   :lcc-lr/hasTag "STP",
   :lcc-lr/identifies :lcc-3166-1/SaoTomeAndPrincipe,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "STP",
   :skos/definition "Alpha-3 country code for Sao Tome and Principe"})

(def SUR
  {:db/ident :lcc-3166-1/SUR,
   :lcc-lr/denotes :lcc-3166-1/Suriname,
   :lcc-lr/hasTag "SUR",
   :lcc-lr/identifies :lcc-3166-1/Suriname,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "SUR",
   :skos/definition "Alpha-3 country code for Suriname"})

(def SV
  {:db/ident :lcc-3166-1/SV,
   :lcc-lr/denotes :lcc-3166-1/ElSalvador,
   :lcc-lr/hasTag "SV",
   :lcc-lr/identifies :lcc-3166-1/ElSalvador,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "SV",
   :skos/definition "Alpha-2 country code for El Salvador"})

(def SVK
  {:db/ident :lcc-3166-1/SVK,
   :lcc-lr/denotes :lcc-3166-1/Slovakia,
   :lcc-lr/hasTag "SVK",
   :lcc-lr/identifies :lcc-3166-1/Slovakia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "SVK",
   :skos/definition "Alpha-3 country code for Slovakia"})

(def SVN
  {:db/ident :lcc-3166-1/SVN,
   :lcc-lr/denotes :lcc-3166-1/Slovenia,
   :lcc-lr/hasTag "SVN",
   :lcc-lr/identifies :lcc-3166-1/Slovenia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "SVN",
   :skos/definition "Alpha-3 country code for Slovenia"})

(def SWE
  {:db/ident :lcc-3166-1/SWE,
   :lcc-lr/denotes :lcc-3166-1/Sweden,
   :lcc-lr/hasTag "SWE",
   :lcc-lr/identifies :lcc-3166-1/Sweden,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "SWE",
   :skos/definition "Alpha-3 country code for Sweden"})

(def SWZ
  {:db/ident :lcc-3166-1/SWZ,
   :lcc-lr/denotes :lcc-3166-1/Eswatini,
   :lcc-lr/hasTag "SWZ",
   :lcc-lr/identifies :lcc-3166-1/Eswatini,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "SWZ",
   :skos/definition "Alpha-3 country code for Eswatini"})

(def SX
  {:db/ident :lcc-3166-1/SX,
   :lcc-lr/denotes :lcc-3166-1/SintMaarten,
   :lcc-lr/hasTag "SX",
   :lcc-lr/identifies :lcc-3166-1/SintMaarten,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "SX",
   :skos/definition "Alpha-2 country code for Sint Maarten (Dutch part)"})

(def SXM
  {:db/ident :lcc-3166-1/SXM,
   :lcc-lr/denotes :lcc-3166-1/SintMaarten,
   :lcc-lr/hasTag "SXM",
   :lcc-lr/identifies :lcc-3166-1/SintMaarten,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "SXM",
   :skos/definition "Alpha-3 country code for Sint Maarten (Dutch part)"})

(def SY
  {:db/ident :lcc-3166-1/SY,
   :lcc-lr/denotes :lcc-3166-1/SyrianArabRepublic,
   :lcc-lr/hasTag "SY",
   :lcc-lr/identifies :lcc-3166-1/SyrianArabRepublic,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "SY",
   :skos/definition "Alpha-2 country code for Syrian Arab Republic (the)"})

(def SYC
  {:db/ident :lcc-3166-1/SYC,
   :lcc-lr/denotes :lcc-3166-1/Seychelles,
   :lcc-lr/hasTag "SYC",
   :lcc-lr/identifies :lcc-3166-1/Seychelles,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "SYC",
   :skos/definition "Alpha-3 country code for Seychelles"})

(def SYR
  {:db/ident :lcc-3166-1/SYR,
   :lcc-lr/denotes :lcc-3166-1/SyrianArabRepublic,
   :lcc-lr/hasTag "SYR",
   :lcc-lr/identifies :lcc-3166-1/SyrianArabRepublic,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "SYR",
   :skos/definition "Alpha-3 country code for Syrian Arab Republic (the)"})

(def SZ
  {:db/ident :lcc-3166-1/SZ,
   :lcc-lr/denotes :lcc-3166-1/Eswatini,
   :lcc-lr/hasTag "SZ",
   :lcc-lr/identifies :lcc-3166-1/Eswatini,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "SZ",
   :skos/definition "Alpha-2 country code for Eswatini"})

(def SaintBarthelemy
  {:db/ident :lcc-3166-1/SaintBarthelemy,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Saint Barthélemy"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "SAINT BARTHÉLEMY"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Saint-Barthélemy"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "SAINT-BARTHÉLEMY"},
   :lcc-cr/hasNumericRegionCode "652",
   :lcc-cr/hasRemarks
   "No subdivisions relevant for this standard. Included also as subdivision of France (FR-BL).",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "fr",
                :rdf/value    "Saint-Barthélemy"},
   :skos/definition "the country of Saint Barthélemy"})

(def SaintHelena
  {:db/ident :lcc-3166-1/SaintHelena,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value
                                "Saint Helena, Ascension and Tristan da Cunha"},
   :lcc-cr/hasEnglishShortNameInCapitals
   {:rdf/language "en",
    :rdf/value    "SAINT HELENA, ASCENSION AND TRISTAN DA CUNHA"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value
                               "Sainte-Hélène, Ascension et Tristan da Cunha"},
   :lcc-cr/hasFrenchShortNameInCapitals
   {:rdf/language "fr",
    :rdf/value    "SAINTE-HÉLÈNE, ASCENSION ET TRISTAN DA CUNHA"},
   :lcc-cr/hasNumericRegionCode "654",
   :lcc-cr/hasRemarks
   "Comprises: Saint Helena Island, Ascension Island, Tristan da Cunha Archipelago (Gough Island, Inaccessible Island, Nightingale Island and Stoltenhoff Island).",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Saint Helena, Ascension and Tristan da Cunha"},
   :skos/definition
   "the country of Saint Helena, Ascension and Tristan da Cunha"})

(def SaintKittsAndNevis
  {:db/ident :lcc-3166-1/SaintKittsAndNevis,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Saint Kitts and Nevis"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value "SAINT KITTS AND NEVIS"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Saint-Kitts-et-Nevis"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "SAINT-KITTS-ET-NEVIS"},
   :lcc-cr/hasNumericRegionCode "659",
   :lcc-cr/hasRemarks "the Federation of Saint Kitts and Nevis",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Saint Kitts and Nevis"},
   :skos/definition "the country of Saint Kitts and Nevis"})

(def SaintLucia
  {:db/ident :lcc-3166-1/SaintLucia,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Saint Lucia"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "SAINT LUCIA"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Sainte-Lucie"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "SAINTE-LUCIE"},
   :lcc-cr/hasNumericRegionCode "662",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Saint Lucia"},
   :skos/definition "the country of Saint Lucia"})

(def SaintMartin
  {:db/ident :lcc-3166-1/SaintMartin,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Saint Martin (French part)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value
                                          "SAINT MARTIN (FRENCH PART)"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Saint-Martin (partie française)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value
                                         "SAINT-MARTIN (PARTIE FRANÇAISE)"},
   :lcc-cr/hasNumericRegionCode "663",
   :lcc-cr/hasRemarks
   #{"No subdivisions relevant for this standard. Included also as subdivision of France (FR-MF)."
     "The island of Saint Martin is divided into the northern French part and the southern Dutch part."},
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "fr",
                :rdf/value    "Saint-Martin (partie française)"},
   :skos/definition "the country of Saint Martin (French part)"})

(def SaintPierreAndMiquelon
  {:db/ident :lcc-3166-1/SaintPierreAndMiquelon,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Saint Pierre and Miquelon"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value
                                          "SAINT PIERRE AND MIQUELON"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Saint-Pierre-et-Miquelon"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value "SAINT-PIERRE-ET-MIQUELON"},
   :lcc-cr/hasNumericRegionCode "666",
   :lcc-cr/hasRemarks
   #{"No subdivisions relevant for this standard. Included also as a subdivision of France (FR-PM)."
     "Miquelon * is the second significant part of composite country name."},
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "fr",
                :rdf/value    "Saint-Pierre-et-Miquelon"},
   :skos/definition "the country of Saint Pierre and Miquelon"})

(def SaintVincentAndTheGrenadines
  {:db/ident :lcc-3166-1/SaintVincentAndTheGrenadines,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value "Saint Vincent and the Grenadines"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value
                                          "SAINT VINCENT AND THE GRENADINES"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Saint-Vincent-et-les Grenadines"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value
                                         "SAINT-VINCENT-ET-LES GRENADINES"},
   :lcc-cr/hasNumericRegionCode "670",
   :lcc-cr/hasRemarks
   "Comprises: Northern Grenadine Islands (Principal island: Bequia), Saint Vincent Island.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Saint Vincent and the Grenadines"},
   :skos/definition "the country of Saint Vincent and the Grenadines"})

(def Samoa
  {:db/ident :lcc-3166-1/Samoa,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Independent State of Samoa"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Samoa"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "SAMOA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "l'État indépendant du Samoa"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Samoa (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "SAMOA"},
   :lcc-cr/hasLocalShortName {:rdf/language "sm",
                              :rdf/value    "Samoa"},
   :lcc-cr/hasNumericRegionCode "882",
   :lcc-cr/hasRemarks "Principal islands: Savai'i, Upolu.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/English :lcc-639-1/Samoan},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Samoa"}
                 {:rdf/language "sm",
                  :rdf/value    "Samoa"}},
   :skos/definition "the country of Samoa"})

(def SanMarino
  {:db/ident :lcc-3166-1/SanMarino,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of San Marino"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "San Marino"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "SAN MARINO"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République de Saint-Marin"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Saint-Marin"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "SAINT-MARIN"},
   :lcc-cr/hasLocalShortName {:rdf/language "it",
                              :rdf/value    "San Marino"},
   :lcc-cr/hasNumericRegionCode "674",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Italian,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "it",
                :rdf/value    "San Marino"},
   :skos/definition "the country of San Marino"})

(def SaoTomeAndPrincipe
  {:db/ident :lcc-3166-1/SaoTomeAndPrincipe,
   :lcc-cr/hasEnglishFullName
   {:rdf/language "en",
    :rdf/value    "the Democratic Republic of Sao Tome and Principe"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Sao Tome and Principe"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value "SAO TOME AND PRINCIPE"},
   :lcc-cr/hasFrenchFullName
   {:rdf/language "fr",
    :rdf/value    "la République démocratique de Sao Tomé-et-Principe"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Sao Tomé-et-Principe"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "SAO TOMÉ-ET-PRINCIPE"},
   :lcc-cr/hasLocalShortName {:rdf/language "pt",
                              :rdf/value    "São Tomé e Príncipe"},
   :lcc-cr/hasNumericRegionCode "678",
   :lcc-cr/hasRemarks
   "Príncipe* is the second significant part of composite country name.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Portuguese,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "pt",
                :rdf/value    "São Tomé e Príncipe"},
   :skos/definition "the country of Sao Tome and Principe"})

(def SaudiArabia
  {:db/ident :lcc-3166-1/SaudiArabia,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Kingdom of Saudi Arabia"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Saudi Arabia"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "SAUDI ARABIA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "le Royaume d'Arabie saoudite"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Arabie saoudite (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "ARABIE SAOUDITE"},
   :lcc-cr/hasLocalShortName {:rdf/language "ar",
                              :rdf/value    "As Su‘ūdīyah"},
   :lcc-cr/hasNumericRegionCode "682",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Arabic,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "ar",
                :rdf/value    "As Su‘ūdīyah"},
   :skos/definition "the country of Saudi Arabia"})

(def Senegal
  {:db/ident :lcc-3166-1/Senegal,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Senegal"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Senegal"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "SENEGAL"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Sénégal"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Sénégal (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "SÉNÉGAL"},
   :lcc-cr/hasNumericRegionCode "686",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "fr",
                :rdf/value    "Sénégal (le)"},
   :skos/definition "the country of Senegal"})

(def Serbia
  {:db/ident :lcc-3166-1/Serbia,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Serbia"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Serbia"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "SERBIA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République de Serbie"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Serbie (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "SERBIE"},
   :lcc-cr/hasLocalShortName {:rdf/language "sr",
                              :rdf/value    "Srbija"},
   :lcc-cr/hasNumericRegionCode "688",
   :lcc-cr/hasRemarks
   "Serbia was formerly part of former entries: YUGOSLAVIA (YU, YUG, 891) then SERBIA AND MONTENEGRO (CS, SCG, 891).",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Serbian,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "sr",
                :rdf/value    "Srbija"},
   :skos/definition "the country of Serbia"})

(def SeselwaCreoleFrench
  {:db/ident :lcc-3166-1/SeselwaCreoleFrench,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Seselwa Creole French"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "créole seselwa"},
   :lcc-lr/hasIndigenousName "kreol",
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/comment
   "Part of ISO 639-3, not otherwise represented in OMG ontologies",
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "Seselwa Creole French",
   :skos/definition "Seselwa Creole French language"})

(def Seychelles
  {:db/ident :lcc-3166-1/Seychelles,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Seychelles"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Seychelles"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "SEYCHELLES"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République des Seychelles"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Seychelles (les)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "SEYCHELLES"},
   :lcc-cr/hasLocalShortName "Sesel",
   :lcc-cr/hasNumericRegionCode "690",
   :lcc-cr/hasRemarks
   "Principal island: Mahé; includes Aldabra Islands, Amirante Islands, Cosmoledo Islands, Farquhar Islands.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/English :lcc-639-1/French
                                        :lcc-3166-1/SeselwaCreoleFrench},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Seychelles"}
                 {:rdf/language "fr",
                  :rdf/value    "Seychelles (les)"}},
   :skos/definition "the country of Seychelles"})

(def Shikomor
  {:db/ident :lcc-3166-1/Shikomor,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Shikomor"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "comorien"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/comment "Not yet allocated a code in ISO 639",
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "Shikomor",
   :skos/definition "Shikomor language"})

(def SierraLeone
  {:db/ident :lcc-3166-1/SierraLeone,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Sierra Leone"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Sierra Leone"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "SIERRA LEONE"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République de Sierra Leone"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Sierra Leone (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "SIERRA LEONE"},
   :lcc-cr/hasNumericRegionCode "694",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Sierra Leone"},
   :skos/definition "the country of Sierra Leone"})

(def Singapore
  {:db/ident :lcc-3166-1/Singapore,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Singapore"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Singapore"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "SINGAPORE"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République de Singapour"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Singapour"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "SINGAPOUR"},
   :lcc-cr/hasLocalShortName #{{:rdf/language "ta",
                                :rdf/value    "Chiṅkappūr"}
                               {:rdf/language "ms",
                                :rdf/value    "Singapura"}
                               {:rdf/language "zh",
                                :rdf/value    "Xinjiapo"}},
   :lcc-cr/hasNumericRegionCode "702",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/Chinese :lcc-639-1/Malay
                                        :lcc-639-1/Tamil :lcc-639-1/English},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "ta",
                  :rdf/value    "Chiṅkappūr"}
                 {:rdf/language "ms",
                  :rdf/value    "Singapura"}
                 {:rdf/language "en",
                  :rdf/value    "Singapore"}
                 {:rdf/language "zh",
                  :rdf/value    "Xinjiapo"}},
   :skos/definition "the country of Singapore"})

(def SintMaarten
  {:db/ident :lcc-3166-1/SintMaarten,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Sint Maarten (Dutch part)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value
                                          "SINT MAARTEN (DUTCH PART)"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value "Saint-Martin (partie néerlandaise)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value
                                         "SAINT-MARTIN (PARTIE NÉERLANDAISE)"},
   :lcc-cr/hasLocalShortName {:rdf/language "nl",
                              :rdf/value    "Sint Maarten"},
   :lcc-cr/hasNumericRegionCode "534",
   :lcc-cr/hasRemarks
   #{"The island of Saint Martin is divided into the northern French part and the southern Dutch part."
     "No subdivisions relevant for this standard. Included also as subdivision of Netherlands (NL-SX)."},
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/Dutch :lcc-639-1/English},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Sint Maarten (Dutch part)"}
                 {:rdf/language "nl",
                  :rdf/value    "Sint Maarten"}},
   :skos/definition "the country of Sint Maarten (Dutch part)"})

(def Slovakia
  {:db/ident :lcc-3166-1/Slovakia,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Slovak Republic"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Slovakia"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "SLOVAKIA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République slovaque"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Slovaquie (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "SLOVAQUIE"},
   :lcc-cr/hasLocalShortName {:rdf/language "sk",
                              :rdf/value    "Slovensko"},
   :lcc-cr/hasNumericRegionCode "703",
   :lcc-cr/hasRemarks
   "Code element SK was formerly used for Sikkim (SK, SKM, --), now part of the entry for India (IN, IND, 356), was reused for Slovakia. See aslo code element SKIN.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Slovak,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "sk",
                :rdf/value    "Slovensko"},
   :skos/definition "the country of Slovakia"})

(def Slovenia
  {:db/ident :lcc-3166-1/Slovenia,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Slovenia"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Slovenia"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "SLOVENIA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République de Slovénie"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Slovénie (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "SLOVÉNIE"},
   :lcc-cr/hasLocalShortName {:rdf/language "sl",
                              :rdf/value    "Slovenija"},
   :lcc-cr/hasNumericRegionCode "705",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Slovenian,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "sl",
                :rdf/value    "Slovenija"},
   :skos/definition "the country of Slovenia"})

(def SolomonIslands
  {:db/ident :lcc-3166-1/SolomonIslands,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Solomon Islands"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "SOLOMON ISLANDS"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "les Îles Salomon"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Salomon (les Îles)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "SALOMON, ÎLES"},
   :lcc-cr/hasNumericRegionCode "090",
   :lcc-cr/hasRemarks
   "Comprises: Santa Cruz Islands, Southern Solomon Islands (Principal island: Guadalcanal).",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Solomon Islands"},
   :skos/definition "the country of Solomon Islands"})

(def Somalia
  {:db/ident :lcc-3166-1/Somalia,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Federal Republic of Somalia"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Somalia"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "SOMALIA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value "la République fédérale de Somalie"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Somalie (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "SOMALIE"},
   :lcc-cr/hasLocalShortName #{{:rdf/language "ar",
                                :rdf/value    "Aş Şūmāl"}
                               {:rdf/language "so",
                                :rdf/value    "Soomaaliya"}},
   :lcc-cr/hasNumericRegionCode "706",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/Arabic :lcc-639-1/Somali},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "ar",
                  :rdf/value    "Aş Şūmāl"}
                 {:rdf/language "so",
                  :rdf/value    "Soomaaliya"}},
   :skos/definition "the country of Somalia"})

(def SouthAfrica
  {:db/ident :lcc-3166-1/SouthAfrica,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of South Africa"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "South Africa"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "SOUTH AFRICA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République sud-africaine"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Afrique du Sud (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "AFRIQUE DU SUD"},
   :lcc-cr/hasLocalShortName #{{:rdf/language "af",
                                :rdf/value    "Suid-Afrika"}
                               {:rdf/language "tn",
                                :rdf/value    "Afrika-Borwa"}
                               {:rdf/language "st",
                                :rdf/value    "Afrika-Borwa"}
                               {:rdf/language "ss",
                                :rdf/value    "Ningizimu Afrika"}
                               {:rdf/language "xh",
                                :rdf/value    "Mzantsi Afrika"}
                               {:rdf/language "ve",
                                :rdf/value    "Afrika Tshipembe"}
                               {:rdf/language "zu",
                                :rdf/value    "Ningizimu Afrika"} "Afrika-Borwa"
                               {:rdf/language "ts",
                                :rdf/value    "Afrika-Dzonga"}
                               {:rdf/language "nr",
                                :rdf/value    "Sewula Afrika"}},
   :lcc-cr/hasNumericRegionCode "710",
   :lcc-cr/hasRemarks "Includes: Marion Island, Prince Edward Island.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage
   #{:lcc-639-1/Tswana :lcc-639-1/SouthNdebele :lcc-639-1/Xhosa
     :lcc-639-1/Afrikaans :lcc-639-1/Tsonga :lcc-639-2/Pedi :lcc-639-1/English
     :lcc-639-1/Swati :lcc-639-1/Venda :lcc-639-1/Zulu
     :lcc-639-1/SouthernSotho},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "af",
                  :rdf/value    "Suid-Afrika"}
                 {:rdf/language "en",
                  :rdf/value    "South Africa"}
                 {:rdf/language "tn",
                  :rdf/value    "Afrika-Borwa"}
                 {:rdf/language "st",
                  :rdf/value    "Afrika-Borwa"}
                 {:rdf/language "ss",
                  :rdf/value    "Ningizimu Afrika"}
                 {:rdf/language "xh",
                  :rdf/value    "Mzantsi Afrika"}
                 {:rdf/language "ve",
                  :rdf/value    "Afrika Tshipembe"}
                 {:rdf/language "zu",
                  :rdf/value    "Ningizimu Afrika"}
                 {:rdf/language "ts",
                  :rdf/value    "Afrika-Dzonga"}
                 {:rdf/language "nr",
                  :rdf/value    "Sewula Afrika"}},
   :skos/definition "the country of South Africa"})

(def SouthGeorgiaAndTheSouthSandwichIslands
  {:db/ident :lcc-3166-1/SouthGeorgiaAndTheSouthSandwichIslands,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value
                                "South Georgia and the South Sandwich Islands"},
   :lcc-cr/hasEnglishShortNameInCapitals
   {:rdf/language "en",
    :rdf/value    "SOUTH GEORGIA AND THE SOUTH SANDWICH ISLANDS"},
   :lcc-cr/hasFrenchShortName
   {:rdf/language "fr",
    :rdf/value    "Géorgie du Sud-et-les Îles Sandwich du Sud (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals
   {:rdf/language "fr",
    :rdf/value    "GÉORGIE DU SUD-ET-LES ÎLES SANDWICH DU SUD"},
   :lcc-cr/hasNumericRegionCode "239",
   :lcc-cr/hasRemarks "No subdivisions relevant for this standard.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "South Georgia and the South Sandwich Islands"},
   :skos/definition
   "the country of South Georgia and the South Sandwich Islands"})

(def SouthSudan
  {:db/ident :lcc-3166-1/SouthSudan,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of South Sudan"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "South Sudan"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "SOUTH SUDAN"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Soudan du Sud"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Soudan du Sud (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "SOUDAN DU SUD"},
   :lcc-cr/hasNumericRegionCode "728",
   :lcc-cr/hasRemarks
   "Split of Sudan into Sudan (north part) and South Sudan (south part).",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "South Sudan"},
   :skos/definition "the country of South Sudan"})

(def Spain
  {:db/ident :lcc-3166-1/Spain,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Kingdom of Spain"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Spain"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "SPAIN"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "le Royaume d'Espagne"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Espagne (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "ESPAGNE"},
   :lcc-cr/hasLocalShortName {:rdf/language "es",
                              :rdf/value    "España"},
   :lcc-cr/hasNumericRegionCode "724",
   :lcc-cr/hasRemarks
   "Remark: In the autonomous communities of Galicia, Catalonia and the Balearics, the respective regional languages are the sole official languages of toponymy. Castilian language forms are given in square brackets for information. For the autonomous communities of Navarra, Valencia and the Basque Country, with the exception of the province names Bizkaia and Gipuzkoa, the regional language has co-official status with Castilian (regional language forms are marked with an asterisk).",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Spanish,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "es",
                :rdf/value    "España"},
   :skos/definition "the country of Spain"})

(def SriLanka
  {:db/ident :lcc-3166-1/SriLanka,
   :lcc-cr/hasEnglishFullName
   {:rdf/language "en",
    :rdf/value    "the Democratic Socialist Republic of Sri Lanka"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Sri Lanka"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "SRI LANKA"},
   :lcc-cr/hasFrenchFullName
   {:rdf/language "fr",
    :rdf/value    "la République socialiste démocratique du Sri Lanka"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Sri Lanka"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "SRI LANKA"},
   :lcc-cr/hasLocalShortName #{{:rdf/language "ta",
                                :rdf/value    "Ilaṅkai"}
                               {:rdf/language "si",
                                :rdf/value    "Shrī Laṁkā"}},
   :lcc-cr/hasNumericRegionCode "144",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/Sinhala :lcc-639-1/Tamil
                                        :lcc-639-1/English},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Sri Lanka"}
                 {:rdf/language "ta",
                  :rdf/value    "Ilaṅkai"}
                 {:rdf/language "si",
                  :rdf/value    "Shrī Laṁkā"}},
   :skos/definition "the country of Sri Lanka"})

(def Sudan
  {:db/ident :lcc-3166-1/Sudan,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of the Sudan"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Sudan (the)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "SUDAN"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Soudan"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Soudan (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "SOUDAN"},
   :lcc-cr/hasLocalShortName {:rdf/language "ar",
                              :rdf/value    "As Sūdān"},
   :lcc-cr/hasNumericRegionCode "729",
   :lcc-cr/hasRemarks
   "Split of Sudan into Sudan (north part) and South Sudan (south part).",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Arabic,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "ar",
                :rdf/value    "As Sūdān"},
   :skos/definition "the country of Sudan (the)"})

(def Suriname
  {:db/ident :lcc-3166-1/Suriname,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Suriname"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Suriname"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "SURINAME"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Suriname"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Suriname (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "SURINAME"},
   :lcc-cr/hasLocalShortName {:rdf/language "nl",
                              :rdf/value    "Suriname"},
   :lcc-cr/hasNumericRegionCode "740",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Dutch,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "nl",
                :rdf/value    "Suriname"},
   :skos/definition "the country of Suriname"})

(def SvalbardAndJanMayen
  {:db/ident :lcc-3166-1/SvalbardAndJanMayen,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Svalbard and Jan Mayen"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value "SVALBARD AND JAN MAYEN"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value "Svalbard et l'Île Jan Mayen (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value
                                         "SVALBARD ET ÎLE JAN MAYEN"},
   :lcc-cr/hasLocalShortName #{{:rdf/language "nb",
                                :rdf/value    "Svalbard og Jan Mayen"}
                               {:rdf/language "nn",
                                :rdf/value    "Svalbard og Jan Mayen"}},
   :lcc-cr/hasNumericRegionCode "744",
   :lcc-cr/hasRemarks
   #{"Includes: Bear Island."
     "No subdivisions relevant for this standard. Included also as a subdivision of Norway (NO-21, NO-22)."},
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/NorwegianNynorsk
                                        :lcc-639-1/NorwegianBokmal},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "nb",
                  :rdf/value    "Svalbard og Jan Mayen"}
                 {:rdf/language "nn",
                  :rdf/value    "Svalbard og Jan Mayen"}},
   :skos/definition "the country of Svalbard and Jan Mayen"})

(def Sweden
  {:db/ident :lcc-3166-1/Sweden,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Kingdom of Sweden"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Sweden"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "SWEDEN"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "le Royaume de Suède"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Suède (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "SUÈDE"},
   :lcc-cr/hasLocalShortName {:rdf/language "sv",
                              :rdf/value    "Sverige"},
   :lcc-cr/hasNumericRegionCode "752",
   :lcc-cr/hasRemarks
   "Remark: Alphabetic and numeric codes co-exist. The alphabetic code is traditionally well known to the general public, whereas the numeric code (placed after the name within square brackets) is used mainly within national administration; it may in the longer term supersede the alphabetic code. ",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Swedish,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "sv",
                :rdf/value    "Sverige"},
   :skos/definition "the country of Sweden"})

(def Switzerland
  {:db/ident :lcc-3166-1/Switzerland,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Swiss Confederation"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Switzerland"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "SWITZERLAND"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la Confédération suisse"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Suisse (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "SUISSE"},
   :lcc-cr/hasLocalShortName #{{:rdf/language "de",
                                :rdf/value    "Schweiz (die)"}
                               {:rdf/language "it",
                                :rdf/value    "Svizzera (la)"}
                               {:rdf/language "rm",
                                :rdf/value    "Svizra (la)"}},
   :lcc-cr/hasNumericRegionCode "756",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/Italian :lcc-639-1/German
                                        :lcc-639-1/French :lcc-639-1/Romansh},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "de",
                  :rdf/value    "Schweiz (die)"}
                 {:rdf/language "it",
                  :rdf/value    "Svizzera (la)"}
                 {:rdf/language "rm",
                  :rdf/value    "Svizra (la)"}
                 {:rdf/language "fr",
                  :rdf/value    "Suisse (la)"}},
   :skos/definition "the country of Switzerland"})

(def SyrianArabRepublic
  {:db/ident :lcc-3166-1/SyrianArabRepublic,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Syrian Arab Republic"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Syrian Arab Republic (the)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "SYRIAN ARAB REPUBLIC"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République arabe syrienne"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "République arabe syrienne (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value
                                         "SYRIENNE, RÉPUBLIQUE ARABE"},
   :lcc-cr/hasLocalShortName {:rdf/language "ar",
                              :rdf/value
                              "Al Jumhūrīyah al ‘Arabīyah as Sūrīyah"},
   :lcc-cr/hasNumericRegionCode "760",
   :lcc-cr/hasRemarks "Often referred to as Syria.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Arabic,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "ar",
                :rdf/value    "Al Jumhūrīyah al ‘Arabīyah as Sūrīyah"},
   :skos/definition "the country of Syrian Arab Republic (the)"})

(def TC
  {:db/ident :lcc-3166-1/TC,
   :lcc-lr/denotes :lcc-3166-1/TurksAndCaicosIslands,
   :lcc-lr/hasTag "TC",
   :lcc-lr/identifies :lcc-3166-1/TurksAndCaicosIslands,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "TC",
   :skos/definition "Alpha-2 country code for Turks and Caicos Islands (the)"})

(def TCA
  {:db/ident :lcc-3166-1/TCA,
   :lcc-lr/denotes :lcc-3166-1/TurksAndCaicosIslands,
   :lcc-lr/hasTag "TCA",
   :lcc-lr/identifies :lcc-3166-1/TurksAndCaicosIslands,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "TCA",
   :skos/definition "Alpha-3 country code for Turks and Caicos Islands (the)"})

(def TCD
  {:db/ident :lcc-3166-1/TCD,
   :lcc-lr/denotes :lcc-3166-1/Chad,
   :lcc-lr/hasTag "TCD",
   :lcc-lr/identifies :lcc-3166-1/Chad,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "TCD",
   :skos/definition "Alpha-3 country code for Chad"})

(def TD
  {:db/ident :lcc-3166-1/TD,
   :lcc-lr/denotes :lcc-3166-1/Chad,
   :lcc-lr/hasTag "TD",
   :lcc-lr/identifies :lcc-3166-1/Chad,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "TD",
   :skos/definition "Alpha-2 country code for Chad"})

(def TF
  {:db/ident :lcc-3166-1/TF,
   :lcc-lr/denotes :lcc-3166-1/FrenchSouthernTerritories,
   :lcc-lr/hasTag "TF",
   :lcc-lr/identifies :lcc-3166-1/FrenchSouthernTerritories,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "TF",
   :skos/definition
   "Alpha-2 country code for French Southern Territories (the)"})

(def TG
  {:db/ident :lcc-3166-1/TG,
   :lcc-lr/denotes :lcc-3166-1/Togo,
   :lcc-lr/hasTag "TG",
   :lcc-lr/identifies :lcc-3166-1/Togo,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "TG",
   :skos/definition "Alpha-2 country code for Togo"})

(def TGO
  {:db/ident :lcc-3166-1/TGO,
   :lcc-lr/denotes :lcc-3166-1/Togo,
   :lcc-lr/hasTag "TGO",
   :lcc-lr/identifies :lcc-3166-1/Togo,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "TGO",
   :skos/definition "Alpha-3 country code for Togo"})

(def TH
  {:db/ident :lcc-3166-1/TH,
   :lcc-lr/denotes :lcc-3166-1/Thailand,
   :lcc-lr/hasTag "TH",
   :lcc-lr/identifies :lcc-3166-1/Thailand,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "TH",
   :skos/definition "Alpha-2 country code for Thailand"})

(def THA
  {:db/ident :lcc-3166-1/THA,
   :lcc-lr/denotes :lcc-3166-1/Thailand,
   :lcc-lr/hasTag "THA",
   :lcc-lr/identifies :lcc-3166-1/Thailand,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "THA",
   :skos/definition "Alpha-3 country code for Thailand"})

(def TJ
  {:db/ident :lcc-3166-1/TJ,
   :lcc-lr/denotes :lcc-3166-1/Tajikistan,
   :lcc-lr/hasTag "TJ",
   :lcc-lr/identifies :lcc-3166-1/Tajikistan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "TJ",
   :skos/definition "Alpha-2 country code for Tajikistan"})

(def TJK
  {:db/ident :lcc-3166-1/TJK,
   :lcc-lr/denotes :lcc-3166-1/Tajikistan,
   :lcc-lr/hasTag "TJK",
   :lcc-lr/identifies :lcc-3166-1/Tajikistan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "TJK",
   :skos/definition "Alpha-3 country code for Tajikistan"})

(def TK
  {:db/ident :lcc-3166-1/TK,
   :lcc-lr/denotes :lcc-3166-1/Tokelau,
   :lcc-lr/hasTag "TK",
   :lcc-lr/identifies :lcc-3166-1/Tokelau,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "TK",
   :skos/definition "Alpha-2 country code for Tokelau"})

(def TKL
  {:db/ident :lcc-3166-1/TKL,
   :lcc-lr/denotes :lcc-3166-1/Tokelau,
   :lcc-lr/hasTag "TKL",
   :lcc-lr/identifies :lcc-3166-1/Tokelau,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "TKL",
   :skos/definition "Alpha-3 country code for Tokelau"})

(def TKM
  {:db/ident :lcc-3166-1/TKM,
   :lcc-lr/denotes :lcc-3166-1/Turkmenistan,
   :lcc-lr/hasTag "TKM",
   :lcc-lr/identifies :lcc-3166-1/Turkmenistan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "TKM",
   :skos/definition "Alpha-3 country code for Turkmenistan"})

(def TL
  {:db/ident :lcc-3166-1/TL,
   :lcc-lr/denotes :lcc-3166-1/Timor-Leste,
   :lcc-lr/hasTag "TL",
   :lcc-lr/identifies :lcc-3166-1/Timor-Leste,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "TL",
   :skos/definition "Alpha-2 country code for Timor-Leste"})

(def TLS
  {:db/ident :lcc-3166-1/TLS,
   :lcc-lr/denotes :lcc-3166-1/Timor-Leste,
   :lcc-lr/hasTag "TLS",
   :lcc-lr/identifies :lcc-3166-1/Timor-Leste,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "TLS",
   :skos/definition "Alpha-3 country code for Timor-Leste"})

(def TM
  {:db/ident :lcc-3166-1/TM,
   :lcc-lr/denotes :lcc-3166-1/Turkmenistan,
   :lcc-lr/hasTag "TM",
   :lcc-lr/identifies :lcc-3166-1/Turkmenistan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "TM",
   :skos/definition "Alpha-2 country code for Turkmenistan"})

(def TN
  {:db/ident :lcc-3166-1/TN,
   :lcc-lr/denotes :lcc-3166-1/Tunisia,
   :lcc-lr/hasTag "TN",
   :lcc-lr/identifies :lcc-3166-1/Tunisia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "TN",
   :skos/definition "Alpha-2 country code for Tunisia"})

(def TO
  {:db/ident :lcc-3166-1/TO,
   :lcc-lr/denotes :lcc-3166-1/Tonga,
   :lcc-lr/hasTag "TO",
   :lcc-lr/identifies :lcc-3166-1/Tonga,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "TO",
   :skos/definition "Alpha-2 country code for Tonga"})

(def TON
  {:db/ident :lcc-3166-1/TON,
   :lcc-lr/denotes :lcc-3166-1/Tonga,
   :lcc-lr/hasTag "TON",
   :lcc-lr/identifies :lcc-3166-1/Tonga,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "TON",
   :skos/definition "Alpha-3 country code for Tonga"})

(def TR
  {:db/ident :lcc-3166-1/TR,
   :lcc-lr/denotes :lcc-3166-1/Turkey,
   :lcc-lr/hasTag "TR",
   :lcc-lr/identifies :lcc-3166-1/Turkey,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "TR",
   :skos/definition "Alpha-2 country code for Turkey"})

(def TT
  {:db/ident :lcc-3166-1/TT,
   :lcc-lr/denotes :lcc-3166-1/TrinidadAndTobago,
   :lcc-lr/hasTag "TT",
   :lcc-lr/identifies :lcc-3166-1/TrinidadAndTobago,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "TT",
   :skos/definition "Alpha-2 country code for Trinidad and Tobago"})

(def TTO
  {:db/ident :lcc-3166-1/TTO,
   :lcc-lr/denotes :lcc-3166-1/TrinidadAndTobago,
   :lcc-lr/hasTag "TTO",
   :lcc-lr/identifies :lcc-3166-1/TrinidadAndTobago,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "TTO",
   :skos/definition "Alpha-3 country code for Trinidad and Tobago"})

(def TUN
  {:db/ident :lcc-3166-1/TUN,
   :lcc-lr/denotes :lcc-3166-1/Tunisia,
   :lcc-lr/hasTag "TUN",
   :lcc-lr/identifies :lcc-3166-1/Tunisia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "TUN",
   :skos/definition "Alpha-3 country code for Tunisia"})

(def TUR
  {:db/ident :lcc-3166-1/TUR,
   :lcc-lr/denotes :lcc-3166-1/Turkey,
   :lcc-lr/hasTag "TUR",
   :lcc-lr/identifies :lcc-3166-1/Turkey,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "TUR",
   :skos/definition "Alpha-3 country code for Turkey"})

(def TUV
  {:db/ident :lcc-3166-1/TUV,
   :lcc-lr/denotes :lcc-3166-1/Tuvalu,
   :lcc-lr/hasTag "TUV",
   :lcc-lr/identifies :lcc-3166-1/Tuvalu,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "TUV",
   :skos/definition "Alpha-3 country code for Tuvalu"})

(def TV
  {:db/ident :lcc-3166-1/TV,
   :lcc-lr/denotes :lcc-3166-1/Tuvalu,
   :lcc-lr/hasTag "TV",
   :lcc-lr/identifies :lcc-3166-1/Tuvalu,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "TV",
   :skos/definition "Alpha-2 country code for Tuvalu"})

(def TW
  {:db/ident :lcc-3166-1/TW,
   :lcc-lr/denotes :lcc-3166-1/Taiwan,
   :lcc-lr/hasTag "TW",
   :lcc-lr/identifies :lcc-3166-1/Taiwan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "TW",
   :skos/definition "Alpha-2 country code for Taiwan (Province of China)"})

(def TWN
  {:db/ident :lcc-3166-1/TWN,
   :lcc-lr/denotes :lcc-3166-1/Taiwan,
   :lcc-lr/hasTag "TWN",
   :lcc-lr/identifies :lcc-3166-1/Taiwan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "TWN",
   :skos/definition "Alpha-3 country code for Taiwan (Province of China)"})

(def TZ
  {:db/ident :lcc-3166-1/TZ,
   :lcc-lr/denotes :lcc-3166-1/Tanzania,
   :lcc-lr/hasTag "TZ",
   :lcc-lr/identifies :lcc-3166-1/Tanzania,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "TZ",
   :skos/definition
   "Alpha-2 country code for Tanzania, the United Republic of"})

(def TZA
  {:db/ident :lcc-3166-1/TZA,
   :lcc-lr/denotes :lcc-3166-1/Tanzania,
   :lcc-lr/hasTag "TZA",
   :lcc-lr/identifies :lcc-3166-1/Tanzania,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "TZA",
   :skos/definition
   "Alpha-3 country code for Tanzania, the United Republic of"})

(def Taiwan
  {:db/ident :lcc-3166-1/Taiwan,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Taiwan (Province of China)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value
                                          "TAIWAN, PROVINCE OF CHINA"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Taïwan (Province de Chine)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value
                                         "TAÏWAN, PROVINCE DE CHINE"},
   :lcc-cr/hasLocalShortName {:rdf/language "zh",
                              :rdf/value    "Taiwan"},
   :lcc-cr/hasNumericRegionCode "158",
   :lcc-cr/hasRemarks "Includes: Penghu (Pescadores) Islands.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Chinese,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "zh",
                :rdf/value    "Taiwan"},
   :skos/definition "the country of Taiwan (Province of China)"})

(def Tajikistan
  {:db/ident :lcc-3166-1/Tajikistan,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Tajikistan"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Tajikistan"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "TAJIKISTAN"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Tadjikistan"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Tadjikistan (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "TADJIKISTAN"},
   :lcc-cr/hasLocalShortName {:rdf/language "tg",
                              :rdf/value    "Tojikiston"},
   :lcc-cr/hasNumericRegionCode "762",
   :lcc-cr/hasRemarks
   "Remark: The deletion of the region Karategin left one part of the country without name and without code in this part of ISO 3166. This section of the country is designated districts under republic administration (tgk: nohiyahoi tobei jumhurí) and comprises 13 districts (tgk: nohiya) which are administered directly by the central government at first-order level.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Tajik,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "tg",
                :rdf/value    "Tojikiston"},
   :skos/definition "the country of Tajikistan"})

(def Tanzania
  {:db/ident :lcc-3166-1/Tanzania,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the United Republic of Tanzania"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value "Tanzania, the United Republic of"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value
                                          "TANZANIA, UNITED REPUBLIC OF"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République-Unie de Tanzanie"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value "Tanzanie (la République-Unie de)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value
                                         "TANZANIE, RÉPUBLIQUE-UNIE DE"},
   :lcc-cr/hasLocalShortName {:rdf/language "sw",
                              :rdf/value    "Jamhuri ya Muungano wa Tanzania"},
   :lcc-cr/hasNumericRegionCode "834",
   :lcc-cr/hasRemarks "Often referred to as Tanzania.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/Swahili :lcc-639-1/English},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Tanzania, the United Republic of"}
                 {:rdf/language "sw",
                  :rdf/value    "Jamhuri ya Muungano wa Tanzania"}},
   :skos/definition "the country of Tanzania, the United Republic of"})

(def Thailand
  {:db/ident :lcc-3166-1/Thailand,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Kingdom of Thailand"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Thailand"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "THAILAND"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "le Royaume de Thaïlande"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Thaïlande (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "THAÏLANDE"},
   :lcc-cr/hasLocalShortName {:rdf/language "th",
                              :rdf/value    "Prathet Thai"},
   :lcc-cr/hasNumericRegionCode "764",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Thai,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "th",
                :rdf/value    "Prathet Thai"},
   :skos/definition "the country of Thailand"})

(def Timor-Leste
  {:db/ident :lcc-3166-1/Timor-Leste,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value
                               "the Democratic Republic of Timor-Leste"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Timor-Leste"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "TIMOR-LESTE"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value
                              "la République démocratique du Timor-Leste"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Timor-Leste (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "TIMOR-LESTE"},
   :lcc-cr/hasLocalShortName #{"Timor Lorosa'e"
                               {:rdf/language "pt",
                                :rdf/value    "Timor-Leste"}},
   :lcc-cr/hasNumericRegionCode "626",
   :lcc-cr/hasRemarks "Includes the exclave of Oecussi.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-2/Tetum :lcc-639-1/Portuguese},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "pt",
                :rdf/value    "Timor-Leste"},
   :skos/definition "the country of Timor-Leste"})

(def Togo
  {:db/ident :lcc-3166-1/Togo,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Togolese Republic"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Togo"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "TOGO"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République togolaise"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Togo (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "TOGO"},
   :lcc-cr/hasNumericRegionCode "768",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "fr",
                :rdf/value    "Togo (le)"},
   :skos/definition "the country of Togo"})

(def Tokelau
  {:db/ident :lcc-3166-1/Tokelau,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Tokelau"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "TOKELAU"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Tokelau (les)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "TOKELAU"},
   :lcc-cr/hasLocalShortName "Tokelau",
   :lcc-cr/hasNumericRegionCode "772",
   :lcc-cr/hasRemarks "No subdivisions relevant for this standard.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/English :lcc-639-2/Tokelau},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Tokelau"},
   :skos/definition "the country of Tokelau"})

(def Tonga
  {:db/ident :lcc-3166-1/Tonga,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Kingdom of Tonga"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Tonga"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "TONGA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "le Royaume des Tonga"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Tonga (les)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "TONGA"},
   :lcc-cr/hasLocalShortName {:rdf/language "to",
                              :rdf/value    "Tonga"},
   :lcc-cr/hasNumericRegionCode "776",
   :lcc-cr/hasRemarks "Principal island: Tongatapu.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/Tonga-TongaIslands
                                        :lcc-639-1/English},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "to",
                  :rdf/value    "Tonga"}
                 {:rdf/language "en",
                  :rdf/value    "Tonga"}},
   :skos/definition "the country of Tonga"})

(def TrinidadAndTobago
  {:db/ident :lcc-3166-1/TrinidadAndTobago,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value
                               "the Republic of Trinidad and Tobago"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Trinidad and Tobago"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "TRINIDAD AND TOBAGO"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value "la République de Trinité-et-Tobago"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Trinité-et-Tobago (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "TRINITÉ-ET-TOBAGO"},
   :lcc-cr/hasNumericRegionCode "780",
   :lcc-cr/hasRemarks
   "Tobago * is the second significant part of composite country name.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Trinidad and Tobago"},
   :skos/definition "the country of Trinidad and Tobago"})

(def Tunisia
  {:db/ident :lcc-3166-1/Tunisia,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Tunisia"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Tunisia"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "TUNISIA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République tunisienne"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Tunisie (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "TUNISIE"},
   :lcc-cr/hasLocalShortName {:rdf/language "ar",
                              :rdf/value    "Tūnis"},
   :lcc-cr/hasNumericRegionCode "788",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Arabic,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "ar",
                :rdf/value    "Tūnis"},
   :skos/definition "the country of Tunisia"})

(def Turkey
  {:db/ident :lcc-3166-1/Turkey,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Turkey"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Turkey"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "TURKEY"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République turque"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Turquie (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "TURQUIE"},
   :lcc-cr/hasLocalShortName {:rdf/language "tr",
                              :rdf/value    "Türkiye"},
   :lcc-cr/hasNumericRegionCode "792",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Turkish,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "tr",
                :rdf/value    "Türkiye"},
   :skos/definition "the country of Turkey"})

(def Turkmenistan
  {:db/ident :lcc-3166-1/Turkmenistan,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Turkmenistan"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "TURKMENISTAN"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Turkménistan (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "TURKMÉNISTAN"},
   :lcc-cr/hasLocalShortName {:rdf/language "tk",
                              :rdf/value    "Türkmenistan"},
   :lcc-cr/hasNumericRegionCode "795",
   :lcc-cr/hasRemarks
   "Remark: By presidential decree No. 1146, 1993-01-21, the Roman alphabet is officially used for the Turkmen language.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Turkmen,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "tk",
                :rdf/value    "Türkmenistan"},
   :skos/definition "the country of Turkmenistan"})

(def TurksAndCaicosIslands
  {:db/ident :lcc-3166-1/TurksAndCaicosIslands,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Turks and Caicos Islands (the)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value
                                          "TURKS AND CAICOS ISLANDS"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Turks-et-Caïcos (les Îles)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "TURKS-ET-CAÏCOS, ÎLES"},
   :lcc-cr/hasNumericRegionCode "796",
   :lcc-cr/hasRemarks "No subdivisions relevant for this standard.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Turks and Caicos Islands (the)"},
   :skos/definition "the country of Turks and Caicos Islands (the)"})

(def Tuvalu
  {:db/ident :lcc-3166-1/Tuvalu,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Tuvalu"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "TUVALU"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Tuvalu (les)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "TUVALU"},
   :lcc-cr/hasLocalShortName "Tuvalu",
   :lcc-cr/hasNumericRegionCode "798",
   :lcc-cr/hasRemarks "Principal atoll: Funafuti.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-2/Tuvalu :lcc-639-1/English},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Tuvalu"},
   :skos/definition "the country of Tuvalu"})

(def UA
  {:db/ident :lcc-3166-1/UA,
   :lcc-lr/denotes :lcc-3166-1/Ukraine,
   :lcc-lr/hasTag "UA",
   :lcc-lr/identifies :lcc-3166-1/Ukraine,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "UA",
   :skos/definition "Alpha-2 country code for Ukraine"})

(def UG
  {:db/ident :lcc-3166-1/UG,
   :lcc-lr/denotes :lcc-3166-1/Uganda,
   :lcc-lr/hasTag "UG",
   :lcc-lr/identifies :lcc-3166-1/Uganda,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "UG",
   :skos/definition "Alpha-2 country code for Uganda"})

(def UGA
  {:db/ident :lcc-3166-1/UGA,
   :lcc-lr/denotes :lcc-3166-1/Uganda,
   :lcc-lr/hasTag "UGA",
   :lcc-lr/identifies :lcc-3166-1/Uganda,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "UGA",
   :skos/definition "Alpha-3 country code for Uganda"})

(def UKR
  {:db/ident :lcc-3166-1/UKR,
   :lcc-lr/denotes :lcc-3166-1/Ukraine,
   :lcc-lr/hasTag "UKR",
   :lcc-lr/identifies :lcc-3166-1/Ukraine,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "UKR",
   :skos/definition "Alpha-3 country code for Ukraine"})

(def UM
  {:db/ident :lcc-3166-1/UM,
   :lcc-lr/denotes :lcc-3166-1/UnitedStatesMinorOutlyingIslands,
   :lcc-lr/hasTag "UM",
   :lcc-lr/identifies :lcc-3166-1/UnitedStatesMinorOutlyingIslands,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "UM",
   :skos/definition
   "Alpha-2 country code for United States Minor Outlying Islands (the)"})

(def UMI
  {:db/ident :lcc-3166-1/UMI,
   :lcc-lr/denotes :lcc-3166-1/UnitedStatesMinorOutlyingIslands,
   :lcc-lr/hasTag "UMI",
   :lcc-lr/identifies :lcc-3166-1/UnitedStatesMinorOutlyingIslands,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "UMI",
   :skos/definition
   "Alpha-3 country code for United States Minor Outlying Islands (the)"})

(def URY
  {:db/ident :lcc-3166-1/URY,
   :lcc-lr/denotes :lcc-3166-1/Uruguay,
   :lcc-lr/hasTag "URY",
   :lcc-lr/identifies :lcc-3166-1/Uruguay,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "URY",
   :skos/definition "Alpha-3 country code for Uruguay"})

(def US
  {:db/ident :lcc-3166-1/US,
   :lcc-lr/denotes :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/hasTag "US",
   :lcc-lr/identifies :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "US",
   :skos/definition "Alpha-2 country code for United States of America (the)"})

(def USA
  {:db/ident :lcc-3166-1/USA,
   :lcc-lr/denotes :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/hasTag "USA",
   :lcc-lr/identifies :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "USA",
   :skos/definition "Alpha-3 country code for United States of America (the)"})

(def UY
  {:db/ident :lcc-3166-1/UY,
   :lcc-lr/denotes :lcc-3166-1/Uruguay,
   :lcc-lr/hasTag "UY",
   :lcc-lr/identifies :lcc-3166-1/Uruguay,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "UY",
   :skos/definition "Alpha-2 country code for Uruguay"})

(def UZ
  {:db/ident :lcc-3166-1/UZ,
   :lcc-lr/denotes :lcc-3166-1/Uzbekistan,
   :lcc-lr/hasTag "UZ",
   :lcc-lr/identifies :lcc-3166-1/Uzbekistan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "UZ",
   :skos/definition "Alpha-2 country code for Uzbekistan"})

(def UZB
  {:db/ident :lcc-3166-1/UZB,
   :lcc-lr/denotes :lcc-3166-1/Uzbekistan,
   :lcc-lr/hasTag "UZB",
   :lcc-lr/identifies :lcc-3166-1/Uzbekistan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "UZB",
   :skos/definition "Alpha-3 country code for Uzbekistan"})

(def Uganda
  {:db/ident :lcc-3166-1/Uganda,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Uganda"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Uganda"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "UGANDA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République d'Ouganda"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Ouganda (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "OUGANDA"},
   :lcc-cr/hasNumericRegionCode "800",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Uganda"},
   :skos/definition "the country of Uganda"})

(def Ukraine
  {:db/ident :lcc-3166-1/Ukraine,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Ukraine"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "UKRAINE"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Ukraine (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "UKRAINE"},
   :lcc-cr/hasLocalShortName {:rdf/language "uk",
                              :rdf/value    "Ukraina"},
   :lcc-cr/hasNumericRegionCode "804",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Ukrainian,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "uk",
                :rdf/value    "Ukraina"},
   :skos/definition "the country of Ukraine"})

(def UnitedArabEmirates
  {:db/ident :lcc-3166-1/UnitedArabEmirates,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the United Arab Emirates"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "United Arab Emirates (the)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "UNITED ARAB EMIRATES"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "les Émirats arabes unis"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Émirats arabes unis (les)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "ÉMIRATS ARABES UNIS"},
   :lcc-cr/hasLocalShortName {:rdf/language "ar",
                              :rdf/value    "Al Imārāt"},
   :lcc-cr/hasNumericRegionCode "784",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Arabic,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "ar",
                :rdf/value    "Al Imārāt"},
   :skos/definition "the country of United Arab Emirates (the)"})

(def UnitedKingdom
  {:db/ident :lcc-3166-1/UnitedKingdom,
   :owl/sameAs :lcc-3166-1/UnitedKingdomOfGreatBritainAndNorthernIreland,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/comment
   "UnitedKingdom is supported as legacy identifier for UnitedKingdomOfGreatBritainAndNorthernIreland",
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}})

(def UnitedKingdomOfGreatBritainAndNorthernIreland
  {:db/ident :lcc-3166-1/UnitedKingdomOfGreatBritainAndNorthernIreland,
   :lcc-cr/hasEnglishFullName
   {:rdf/language "en",
    :rdf/value    "the United Kingdom of Great Britain and Northern Ireland"},
   :lcc-cr/hasEnglishShortName
   {:rdf/language "en",
    :rdf/value    "United Kingdom of Great Britain and Northern Ireland (the)"},
   :lcc-cr/hasEnglishShortNameInCapitals
   {:rdf/language "en",
    :rdf/value    "UNITED KINGDOM OF GREAT BRITAIN AND NORTHERN IRELAND"},
   :lcc-cr/hasFrenchFullName
   {:rdf/language "fr",
    :rdf/value    "le Royaume-Uni de Grande-Bretagne et d'Irlande du Nord"},
   :lcc-cr/hasFrenchShortName
   {:rdf/language "fr",
    :rdf/value    "Royaume-Uni de Grande-Bretagne et d'Irlande du Nord (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals
   {:rdf/language "fr",
    :rdf/value    "ROYAUME-UNI DE GRANDE-BRETAGNE ET D'IRLANDE DU NORD"},
   :lcc-cr/hasNumericRegionCode "826",
   :lcc-cr/hasRemarks
   "BS 6879 gives alternative name forms in Welsh (cy) for some of the Welsh unitary authorities (together with alternative code elements). Since this part of ISO 3166 does not allow for duplicate coding of identical subdivisions, such alternative names in Welsh and code elements are shown for information purposes only in square brackets after the English name of the subdivision. BS 6879 has been superseded but remains the original source of the codes.\nCountry (en) / pays (fr), Province (en) / province (fr):\nENG England country;\nNIR Northern Ireland province;\nSCT Scotland country;\nWLS Wales [Cymru GB-CYM] country.\nIncluded for completeness:\nEAW England and Wales;\nGBN Great Britain;\nUKM United Kingdom.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value
                "United Kingdom of Great Britain and Northern Ireland (the)"},
   :skos/definition
   "the country of United Kingdom of Great Britain and Northern Ireland (the)"})

(def UnitedStates
  {:db/ident :lcc-3166-1/UnitedStates,
   :owl/sameAs :lcc-3166-1/UnitedStatesOfAmerica,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/comment
   "UnitedStates is supported as legacy identifier for UnitedStatesOfAmerica",
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}})

(def UnitedStatesMinorOutlyingIslands
  {:db/ident :lcc-3166-1/UnitedStatesMinorOutlyingIslands,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value
                                "United States Minor Outlying Islands (the)"},
   :lcc-cr/hasEnglishShortNameInCapitals
   {:rdf/language "en",
    :rdf/value    "UNITED STATES MINOR OUTLYING ISLANDS"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value
                               "Îles mineures éloignées des États-Unis (les)"},
   :lcc-cr/hasFrenchShortNameInCapitals
   {:rdf/language "fr",
    :rdf/value    "ÎLES MINEURES ÉLOIGNÉES DES ÉTATS-UNIS"},
   :lcc-cr/hasNumericRegionCode "581",
   :lcc-cr/hasRemarks
   #{"Comprises: In the Pacific Ocean: Baker Island, Howland Island, Jarvis Island, Johnston Atoll, Kingman Reef, Midway Islands, Palmyra Atoll, Wake Island In the Caribbean Sea: Navassa Island."
     "Remark: Included also as a subdivision of the United States (US-UM)."},
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "United States Minor Outlying Islands (the)"},
   :skos/definition
   "the country of United States Minor Outlying Islands (the)"})

(def UnitedStatesOfAmerica
  {:db/ident :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the United States of America"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "United States of America (the)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value
                                          "UNITED STATES OF AMERICA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "les États-Unis d'Amérique"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "États-Unis d'Amérique (les)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "ÉTATS-UNIS D'AMÉRIQUE"},
   :lcc-cr/hasNumericRegionCode "840",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "United States of America (the)"},
   :skos/definition "the country of United States of America (the)"})

(def Uruguay
  {:db/ident :lcc-3166-1/Uruguay,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Eastern Republic of Uruguay"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Uruguay"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "URUGUAY"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value
                              "la République orientale de l'Uruguay"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Uruguay (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "URUGUAY"},
   :lcc-cr/hasLocalShortName {:rdf/language "es",
                              :rdf/value    "Uruguay (el)"},
   :lcc-cr/hasNumericRegionCode "858",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Spanish,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "es",
                :rdf/value    "Uruguay (el)"},
   :skos/definition "the country of Uruguay"})

(def Uzbekistan
  {:db/ident :lcc-3166-1/Uzbekistan,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Uzbekistan"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Uzbekistan"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "UZBEKISTAN"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République d'Ouzbékistan"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Ouzbékistan (l')"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "OUZBÉKISTAN"},
   :lcc-cr/hasLocalShortName {:rdf/language "uz",
                              :rdf/value    "O‘zbekiston"},
   :lcc-cr/hasNumericRegionCode "860",
   :lcc-cr/hasRemarks
   "In May 1995 a new Roman alphabet was officially decreed for the Uzbek language",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Uzbek,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "uz",
                :rdf/value    "O‘zbekiston"},
   :skos/definition "the country of Uzbekistan"})

(def VA
  {:db/ident :lcc-3166-1/VA,
   :lcc-lr/denotes :lcc-3166-1/HolySee,
   :lcc-lr/hasTag "VA",
   :lcc-lr/identifies :lcc-3166-1/HolySee,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "VA",
   :skos/definition "Alpha-2 country code for Holy See (the)"})

(def VAT
  {:db/ident :lcc-3166-1/VAT,
   :lcc-lr/denotes :lcc-3166-1/HolySee,
   :lcc-lr/hasTag "VAT",
   :lcc-lr/identifies :lcc-3166-1/HolySee,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "VAT",
   :skos/definition "Alpha-3 country code for Holy See (the)"})

(def VC
  {:db/ident :lcc-3166-1/VC,
   :lcc-lr/denotes :lcc-3166-1/SaintVincentAndTheGrenadines,
   :lcc-lr/hasTag "VC",
   :lcc-lr/identifies :lcc-3166-1/SaintVincentAndTheGrenadines,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "VC",
   :skos/definition
   "Alpha-2 country code for Saint Vincent and the Grenadines"})

(def VCT
  {:db/ident :lcc-3166-1/VCT,
   :lcc-lr/denotes :lcc-3166-1/SaintVincentAndTheGrenadines,
   :lcc-lr/hasTag "VCT",
   :lcc-lr/identifies :lcc-3166-1/SaintVincentAndTheGrenadines,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "VCT",
   :skos/definition
   "Alpha-3 country code for Saint Vincent and the Grenadines"})

(def VE
  {:db/ident :lcc-3166-1/VE,
   :lcc-lr/denotes :lcc-3166-1/Venezuela,
   :lcc-lr/hasTag "VE",
   :lcc-lr/identifies :lcc-3166-1/Venezuela,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "VE",
   :skos/definition
   "Alpha-2 country code for Venezuela (Bolivarian Republic of)"})

(def VEN
  {:db/ident :lcc-3166-1/VEN,
   :lcc-lr/denotes :lcc-3166-1/Venezuela,
   :lcc-lr/hasTag "VEN",
   :lcc-lr/identifies :lcc-3166-1/Venezuela,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "VEN",
   :skos/definition
   "Alpha-3 country code for Venezuela (Bolivarian Republic of)"})

(def VG
  {:db/ident :lcc-3166-1/VG,
   :lcc-lr/denotes :lcc-3166-1/VirginIslandsBritish,
   :lcc-lr/hasTag "VG",
   :lcc-lr/identifies :lcc-3166-1/VirginIslandsBritish,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "VG",
   :skos/definition "Alpha-2 country code for Virgin Islands British"})

(def VGB
  {:db/ident :lcc-3166-1/VGB,
   :lcc-lr/denotes :lcc-3166-1/VirginIslandsBritish,
   :lcc-lr/hasTag "VGB",
   :lcc-lr/identifies :lcc-3166-1/VirginIslandsBritish,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "VGB",
   :skos/definition "Alpha-3 country code for Virgin Islands British"})

(def VI
  {:db/ident :lcc-3166-1/VI,
   :lcc-lr/denotes :lcc-3166-1/VirginIslandsUS,
   :lcc-lr/hasTag "VI",
   :lcc-lr/identifies :lcc-3166-1/VirginIslandsUS,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "VI",
   :skos/definition "Alpha-2 country code for Virgin Islands US"})

(def VIR
  {:db/ident :lcc-3166-1/VIR,
   :lcc-lr/denotes :lcc-3166-1/VirginIslandsUS,
   :lcc-lr/hasTag "VIR",
   :lcc-lr/identifies :lcc-3166-1/VirginIslandsUS,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "VIR",
   :skos/definition "Alpha-3 country code for Virgin Islands US"})

(def VN
  {:db/ident :lcc-3166-1/VN,
   :lcc-lr/denotes :lcc-3166-1/VietNam,
   :lcc-lr/hasTag "VN",
   :lcc-lr/identifies :lcc-3166-1/VietNam,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "VN",
   :skos/definition "Alpha-2 country code for Viet Nam"})

(def VNM
  {:db/ident :lcc-3166-1/VNM,
   :lcc-lr/denotes :lcc-3166-1/VietNam,
   :lcc-lr/hasTag "VNM",
   :lcc-lr/identifies :lcc-3166-1/VietNam,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "VNM",
   :skos/definition "Alpha-3 country code for Viet Nam"})

(def VU
  {:db/ident :lcc-3166-1/VU,
   :lcc-lr/denotes :lcc-3166-1/Vanuatu,
   :lcc-lr/hasTag "VU",
   :lcc-lr/identifies :lcc-3166-1/Vanuatu,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "VU",
   :skos/definition "Alpha-2 country code for Vanuatu"})

(def VUT
  {:db/ident :lcc-3166-1/VUT,
   :lcc-lr/denotes :lcc-3166-1/Vanuatu,
   :lcc-lr/hasTag "VUT",
   :lcc-lr/identifies :lcc-3166-1/Vanuatu,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "VUT",
   :skos/definition "Alpha-3 country code for Vanuatu"})

(def Vanuatu
  {:db/ident :lcc-3166-1/Vanuatu,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Vanuatu"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Vanuatu"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "VANUATU"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Vanuatu"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Vanuatu (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "VANUATU"},
   :lcc-cr/hasLocalShortName {:rdf/language "bi",
                              :rdf/value    "Vanuatu"},
   :lcc-cr/hasNumericRegionCode "548",
   :lcc-cr/hasRemarks "Principal islands: Efate, Santo.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage #{:lcc-639-1/Bislama :lcc-639-1/English
                                        :lcc-639-1/French},
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label #{{:rdf/language "bi",
                  :rdf/value    "Vanuatu"}
                 {:rdf/language "en",
                  :rdf/value    "Vanuatu"}
                 {:rdf/language "fr",
                  :rdf/value    "Vanuatu (le)"}},
   :skos/definition "the country of Vanuatu"})

(def Venezuela
  {:db/ident :lcc-3166-1/Venezuela,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value
                               "the Bolivarian Republic of Venezuela"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value
                                "Venezuela (Bolivarian Republic of)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value
                                          "VENEZUELA (BOLIVARIAN REPUBLIC OF)"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value
                              "la République bolivarienne du Venezuela"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value
                               "Venezuela (République bolivarienne du)"},
   :lcc-cr/hasFrenchShortNameInCapitals
   {:rdf/language "fr",
    :rdf/value    "VENEZUELA (RÉPUBLIQUE BOLIVARIENNE DU)"},
   :lcc-cr/hasLocalShortName {:rdf/language "es",
                              :rdf/value "Venezuela, República Bolivariana de"},
   :lcc-cr/hasNumericRegionCode "862",
   :lcc-cr/hasRemarks "Includes: Bird Island.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Spanish,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "es",
                :rdf/value    "Venezuela, República Bolivariana de"},
   :skos/definition "the country of Venezuela (Bolivarian Republic of)"})

(def VietNam
  {:db/ident :lcc-3166-1/VietNam,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value "the Socialist Republic of Viet Nam"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Viet Nam"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "VIET NAM"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value
                              "la République socialiste du Viet Nam"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Viet Nam (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "VIET NAM"},
   :lcc-cr/hasLocalShortName {:rdf/language "vi",
                              :rdf/value    "Việt Nam"},
   :lcc-cr/hasNumericRegionCode "704",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Vietnamese,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "vi",
                :rdf/value    "Việt Nam"},
   :skos/definition "the country of Viet Nam"})

(def VirginIslandsBritish
  {:db/ident :lcc-3166-1/VirginIslandsBritish,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "British Virgin Islands (the)"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Virgin Islands (British)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value
                                          "VIRGIN ISLANDS (BRITISH)"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Vierges britanniques (les Îles)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value
                                         "ÎLES VIERGES BRITANNIQUES"},
   :lcc-cr/hasNumericRegionCode "092",
   :lcc-cr/hasRemarks
   #{"No subdivisions relevant for this standard."
     "Principal islands: Anegada, Jost Van Dyke, Tortola, Virgin Gorda."},
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Virgin Islands (British)"},
   :skos/definition "the country of Virgin Islands British"})

(def VirginIslandsUS
  {:db/ident :lcc-3166-1/VirginIslandsUS,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value
                               "the Virgin Islands of the United States"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Virgin Islands (U.S.)"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value "VIRGIN ISLANDS (U.S.)"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value "Vierges des États-Unis (les Îles)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value
                                         "ÎLES VIERGES DES ÉTATS-UNIS"},
   :lcc-cr/hasNumericRegionCode "850",
   :lcc-cr/hasRemarks
   #{"Principal islands: Saint Croix, Saint John, Saint Thomas."
     "No subdivisions relevant for this standard. Included also as a subdivision of the United States (US-VI)."},
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Virgin Islands (U.S.)"},
   :skos/definition "the country of Virgin Islands US"})

(def WF
  {:db/ident :lcc-3166-1/WF,
   :lcc-lr/denotes :lcc-3166-1/WallisAndFutuna,
   :lcc-lr/hasTag "WF",
   :lcc-lr/identifies :lcc-3166-1/WallisAndFutuna,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "WF",
   :skos/definition "Alpha-2 country code for Wallis and Futuna"})

(def WLF
  {:db/ident :lcc-3166-1/WLF,
   :lcc-lr/denotes :lcc-3166-1/WallisAndFutuna,
   :lcc-lr/hasTag "WLF",
   :lcc-lr/identifies :lcc-3166-1/WallisAndFutuna,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "WLF",
   :skos/definition "Alpha-3 country code for Wallis and Futuna"})

(def WS
  {:db/ident :lcc-3166-1/WS,
   :lcc-lr/denotes :lcc-3166-1/Samoa,
   :lcc-lr/hasTag "WS",
   :lcc-lr/identifies :lcc-3166-1/Samoa,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "WS",
   :skos/definition "Alpha-2 country code for Samoa"})

(def WSM
  {:db/ident :lcc-3166-1/WSM,
   :lcc-lr/denotes :lcc-3166-1/Samoa,
   :lcc-lr/hasTag "WSM",
   :lcc-lr/identifies :lcc-3166-1/Samoa,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "WSM",
   :skos/definition "Alpha-3 country code for Samoa"})

(def WallisAndFutuna
  {:db/ident :lcc-3166-1/WallisAndFutuna,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "Wallis and Futuna Islands"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Wallis and Futuna"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "WALLIS AND FUTUNA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "les Îles Wallis-et-Futuna"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Wallis-et-Futuna "},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "WALLIS-ET-FUTUNA"},
   :lcc-cr/hasNumericRegionCode "876",
   :lcc-cr/hasRemarks
   #{"Comprises: Hoorn Islands (Principal island: Futuna), Wallis Islands (Principal island: Uvea)."
     "Included also as a subdivision of France (FR-WF)."},
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "fr",
                :rdf/value    "Wallis-et-Futuna "},
   :skos/definition "the country of Wallis and Futuna"})

(def WesternSahara
  {:db/ident :lcc-3166-1/WesternSahara,
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Western Sahara*"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "WESTERN SAHARA *"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Sahara occidental (le)*"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "SAHARA OCCIDENTAL*"},
   :lcc-cr/hasLocalShortName {:rdf/language "ar",
                              :rdf/value    "Aş Şaḩrā' al Gharbīyah"},
   :lcc-cr/hasNumericRegionCode "732",
   :lcc-cr/hasRemarks #{"* Provisional name."
                        "No subdivisions relevant for this standard."},
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Arabic,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "ar",
                :rdf/value    "Aş Şaḩrā' al Gharbīyah"},
   :skos/definition "the country of Western Sahara*"})

(def YE
  {:db/ident :lcc-3166-1/YE,
   :lcc-lr/denotes :lcc-3166-1/Yemen,
   :lcc-lr/hasTag "YE",
   :lcc-lr/identifies :lcc-3166-1/Yemen,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "YE",
   :skos/definition "Alpha-2 country code for Yemen"})

(def YEM
  {:db/ident :lcc-3166-1/YEM,
   :lcc-lr/denotes :lcc-3166-1/Yemen,
   :lcc-lr/hasTag "YEM",
   :lcc-lr/identifies :lcc-3166-1/Yemen,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "YEM",
   :skos/definition "Alpha-3 country code for Yemen"})

(def YT
  {:db/ident :lcc-3166-1/YT,
   :lcc-lr/denotes :lcc-3166-1/Mayotte,
   :lcc-lr/hasTag "YT",
   :lcc-lr/identifies :lcc-3166-1/Mayotte,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "YT",
   :skos/definition "Alpha-2 country code for Mayotte"})

(def Yemen
  {:db/ident :lcc-3166-1/Yemen,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Yemen"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Yemen"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "YEMEN"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Yémen"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Yémen (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "YÉMEN"},
   :lcc-cr/hasLocalShortName {:rdf/language "ar",
                              :rdf/value    "Al Yaman"},
   :lcc-cr/hasNumericRegionCode "887",
   :lcc-cr/hasRemarks "Includes: Socotra Island.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Arabic,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "ar",
                :rdf/value    "Al Yaman"},
   :skos/definition "the country of Yemen"})

(def ZA
  {:db/ident :lcc-3166-1/ZA,
   :lcc-lr/denotes :lcc-3166-1/SouthAfrica,
   :lcc-lr/hasTag "ZA",
   :lcc-lr/identifies :lcc-3166-1/SouthAfrica,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "ZA",
   :skos/definition "Alpha-2 country code for South Africa"})

(def ZAF
  {:db/ident :lcc-3166-1/ZAF,
   :lcc-lr/denotes :lcc-3166-1/SouthAfrica,
   :lcc-lr/hasTag "ZAF",
   :lcc-lr/identifies :lcc-3166-1/SouthAfrica,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "ZAF",
   :skos/definition "Alpha-3 country code for South Africa"})

(def ZM
  {:db/ident :lcc-3166-1/ZM,
   :lcc-lr/denotes :lcc-3166-1/Zambia,
   :lcc-lr/hasTag "ZM",
   :lcc-lr/identifies :lcc-3166-1/Zambia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "ZM",
   :skos/definition "Alpha-2 country code for Zambia"})

(def ZMB
  {:db/ident :lcc-3166-1/ZMB,
   :lcc-lr/denotes :lcc-3166-1/Zambia,
   :lcc-lr/hasTag "ZMB",
   :lcc-lr/identifies :lcc-3166-1/Zambia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "ZMB",
   :skos/definition "Alpha-3 country code for Zambia"})

(def ZW
  {:db/ident :lcc-3166-1/ZW,
   :lcc-lr/denotes :lcc-3166-1/Zimbabwe,
   :lcc-lr/hasTag "ZW",
   :lcc-lr/identifies :lcc-3166-1/Zimbabwe,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type #{:lcc-cr/Alpha2Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "ZW",
   :skos/definition "Alpha-2 country code for Zimbabwe"})

(def ZWE
  {:db/ident :lcc-3166-1/ZWE,
   :lcc-lr/denotes :lcc-3166-1/Zimbabwe,
   :lcc-lr/hasTag "ZWE",
   :lcc-lr/identifies :lcc-3166-1/Zimbabwe,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type #{:lcc-cr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "ZWE",
   :skos/definition "Alpha-3 country code for Zimbabwe"})

(def Zambia
  {:db/ident :lcc-3166-1/Zambia,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Zambia"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Zambia"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "ZAMBIA"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République de Zambie"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Zambie (la)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "ZAMBIE"},
   :lcc-cr/hasNumericRegionCode "894",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Zambia"},
   :skos/definition "the country of Zambia"})

(def Zimbabwe
  {:db/ident :lcc-3166-1/Zimbabwe,
   :lcc-cr/hasEnglishFullName {:rdf/language "en",
                               :rdf/value    "the Republic of Zimbabwe"},
   :lcc-cr/hasEnglishShortName {:rdf/language "en",
                                :rdf/value    "Zimbabwe"},
   :lcc-cr/hasEnglishShortNameInCapitals {:rdf/language "en",
                                          :rdf/value    "ZIMBABWE"},
   :lcc-cr/hasFrenchFullName {:rdf/language "fr",
                              :rdf/value    "la République du Zimbabwe"},
   :lcc-cr/hasFrenchShortName {:rdf/language "fr",
                               :rdf/value    "Zimbabwe (le)"},
   :lcc-cr/hasFrenchShortNameInCapitals {:rdf/language "fr",
                                         :rdf/value    "ZIMBABWE"},
   :lcc-cr/hasNumericRegionCode "716",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type #{:lcc-cr/Country :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Zimbabwe"},
   :skos/definition "the country of Zimbabwe"})

(def crs
  {:db/ident :lcc-3166-1/crs,
   :lcc-lr/denotes :lcc-3166-1/SeselwaCreoleFrench,
   :lcc-lr/hasTag "crs",
   :lcc-lr/identifies :lcc-3166-1/SeselwaCreoleFrench,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO639-3-CodeSet,
   :rdf/type #{:lcc-lr/IndividualLanguageIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"},
   :rdfs/label "crs",
   :skos/definition "Alpha-3 language code for Seselwa Creole French "})

(def urn:uuid:c8c73f85-4728-566e-b83b-da1bb003fb4a
  {:dcterms/issued #inst "2021-10-29T23:57:18.464-00:00",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :owl/imports
   #{{:xsd/anyURI
      "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/20211101/Countries/ISO3166-1-CountryCodes/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "ISO 3166-1 Country Codes Ontology",
   :rdfs/seeAlso #{{:xsd/anyURI
                    "https://www.omg.org/spec/LCC/Countries/AboutCountries/"}
                   {:xsd/anyURI "https://www.omg.org/spec/LCC/AboutLCC/"}},
   :skos/changeNote
   #{"The https://www.omg.org/spec/LCC/20190201/Countries/ISO3166-1-CountryCodes.rdf version of this ontology has been revised to reflect the issues addressed by the LCC 1.1 FTF report.  The country codes and related metadata contained herein are current as of the February 2019 revision to the online code set."
     "https://www.omg.org/spec/LCC/20211101/Countries/ISO3166-1-CountryCodes.rdf version of this ontology has been revised to incorporate revisions published by ISO since the LCC 1.1 specification was revised and is current as of 29 October 2021."
     "The https://www.omg.org/spec/LCC/20151101/Countries/ISO3166-1-CountryCodes.rdf version of this ontology has been revised to reflect the issues addressed by the LCC 1.0 FTF report.  The country codes and related metadata contained herein are current as of the July 2017 revision to the online code set."},
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
      "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}},
   :sm/fileAbbreviation "lcc-3166-1",
   :sm/fileAbstract
   "This ontology represents the subset of the ISO 3166 standard that include the actual ISO 3166-1 country codes, with the ontology and codes for the other parts of the standard represented in dependent models.",
   :sm/filename "ISO3166-1-CountryCodes.rdf",
   :xsd/anyURI
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"})