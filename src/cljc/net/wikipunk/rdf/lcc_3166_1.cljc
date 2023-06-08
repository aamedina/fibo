(ns net.wikipunk.rdf.lcc-3166-1
  "ISO 3166-1 Country Codes Ontology"
  {:dcterms/issued #inst "2021-10-29T23:57:18.465-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   ["https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"],
   :owl/versionIRI
   "https://www.omg.org/spec/LCC/20211101/Countries/ISO3166-1-CountryCodes/",
   :rdf/ns-prefix-map
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
   :rdf/type :owl/Ontology,
   :rdfa/prefix "lcc-3166-1",
   :rdfa/uri "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ISO 3166-1 Country Codes Ontology",
   :rdfs/seeAlso ["https://www.omg.org/spec/LCC/Countries/AboutCountries/"
                  "https://www.omg.org/spec/LCC/AboutLCC/"],
   :skos/changeNote
   ["https://www.omg.org/spec/LCC/20211101/Countries/ISO3166-1-CountryCodes.rdf version of this ontology has been revised to incorporate revisions published by ISO since the LCC 1.1 specification was revised and is current as of 29 October 2021."
    "The https://www.omg.org/spec/LCC/20151101/Countries/ISO3166-1-CountryCodes.rdf version of this ontology has been revised to reflect the issues addressed by the LCC 1.0 FTF report.  The country codes and related metadata contained herein are current as of the July 2017 revision to the online code set."
    "The https://www.omg.org/spec/LCC/20190201/Countries/ISO3166-1-CountryCodes.rdf version of this ontology has been revised to reflect the issues addressed by the LCC 1.1 FTF report.  The country codes and related metadata contained herein are current as of the February 2019 revision to the online code set."],
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright ["Copyright (c) 2015-2017 Unisys"
                  "Copyright (c) 2015-2021 Thematix Partners LLC"
                  "Copyright (c) 2021 agnos.ai UK Ltd."
                  "Copyright (c) 2015-2021 Object Management Group, Inc."
                  "Copyright (c) 2015-2020 Adaptive Inc."],
   :sm/dependsOn
   ["https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"],
   :sm/fileAbbreviation "lcc-3166-1",
   :sm/fileAbstract
   "This ontology represents the subset of the ISO 3166 standard that include the actual ISO 3166-1 country codes, with the ontology and codes for the other parts of the standard represented in dependent models.",
   :sm/filename "ISO3166-1-CountryCodes.rdf"})

(def ABW
  "Alpha-3 country code for Aruba"
  {:db/ident :lcc-3166-1/ABW,
   :lcc-lr/denotes :lcc-3166-1/Aruba,
   :lcc-lr/hasTag "ABW",
   :lcc-lr/identifies :lcc-3166-1/Aruba,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ABW",
   :skos/definition "Alpha-3 country code for Aruba"})

(def AD
  "Alpha-2 country code for Andorra"
  {:db/ident :lcc-3166-1/AD,
   :lcc-lr/denotes :lcc-3166-1/Andorra,
   :lcc-lr/hasTag "AD",
   :lcc-lr/identifies :lcc-3166-1/Andorra,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "AD",
   :skos/definition "Alpha-2 country code for Andorra"})

(def AE
  "Alpha-2 country code for United Arab Emirates (the)"
  {:db/ident :lcc-3166-1/AE,
   :lcc-lr/denotes :lcc-3166-1/UnitedArabEmirates,
   :lcc-lr/hasTag "AE",
   :lcc-lr/identifies :lcc-3166-1/UnitedArabEmirates,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "AE",
   :skos/definition "Alpha-2 country code for United Arab Emirates (the)"})

(def AF
  "Alpha-2 country code for Afghanistan"
  {:db/ident :lcc-3166-1/AF,
   :lcc-lr/denotes :lcc-3166-1/Afghanistan,
   :lcc-lr/hasTag "AF",
   :lcc-lr/identifies :lcc-3166-1/Afghanistan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "AF",
   :skos/definition "Alpha-2 country code for Afghanistan"})

(def AFG
  "Alpha-3 country code for Afghanistan"
  {:db/ident :lcc-3166-1/AFG,
   :lcc-lr/denotes :lcc-3166-1/Afghanistan,
   :lcc-lr/hasTag "AFG",
   :lcc-lr/identifies :lcc-3166-1/Afghanistan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "AFG",
   :skos/definition "Alpha-3 country code for Afghanistan"})

(def AG
  "Alpha-2 country code for Antigua and Barbuda"
  {:db/ident :lcc-3166-1/AG,
   :lcc-lr/denotes :lcc-3166-1/AntiguaAndBarbuda,
   :lcc-lr/hasTag "AG",
   :lcc-lr/identifies :lcc-3166-1/AntiguaAndBarbuda,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "AG",
   :skos/definition "Alpha-2 country code for Antigua and Barbuda"})

(def AGO
  "Alpha-3 country code for Angola"
  {:db/ident :lcc-3166-1/AGO,
   :lcc-lr/denotes :lcc-3166-1/Angola,
   :lcc-lr/hasTag "AGO",
   :lcc-lr/identifies :lcc-3166-1/Angola,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "AGO",
   :skos/definition "Alpha-3 country code for Angola"})

(def AI
  "Alpha-2 country code for Anguilla"
  {:db/ident :lcc-3166-1/AI,
   :lcc-lr/denotes :lcc-3166-1/Anguilla,
   :lcc-lr/hasTag "AI",
   :lcc-lr/identifies :lcc-3166-1/Anguilla,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "AI",
   :skos/definition "Alpha-2 country code for Anguilla"})

(def AIA
  "Alpha-3 country code for Anguilla"
  {:db/ident :lcc-3166-1/AIA,
   :lcc-lr/denotes :lcc-3166-1/Anguilla,
   :lcc-lr/hasTag "AIA",
   :lcc-lr/identifies :lcc-3166-1/Anguilla,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "AIA",
   :skos/definition "Alpha-3 country code for Anguilla"})

(def AL
  "Alpha-2 country code for Albania"
  {:db/ident :lcc-3166-1/AL,
   :lcc-lr/denotes :lcc-3166-1/Albania,
   :lcc-lr/hasTag "AL",
   :lcc-lr/identifies :lcc-3166-1/Albania,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "AL",
   :skos/definition "Alpha-2 country code for Albania"})

(def ALA
  "Alpha-3 country code for Åland Islands"
  {:db/ident :lcc-3166-1/ALA,
   :lcc-lr/denotes :lcc-3166-1/AlandIslands,
   :lcc-lr/hasTag "ALA",
   :lcc-lr/identifies :lcc-3166-1/AlandIslands,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ALA",
   :skos/definition "Alpha-3 country code for Åland Islands"})

(def ALB
  "Alpha-3 country code for Albania"
  {:db/ident :lcc-3166-1/ALB,
   :lcc-lr/denotes :lcc-3166-1/Albania,
   :lcc-lr/hasTag "ALB",
   :lcc-lr/identifies :lcc-3166-1/Albania,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ALB",
   :skos/definition "Alpha-3 country code for Albania"})

(def AM
  "Alpha-2 country code for Armenia"
  {:db/ident :lcc-3166-1/AM,
   :lcc-lr/denotes :lcc-3166-1/Armenia,
   :lcc-lr/hasTag "AM",
   :lcc-lr/identifies :lcc-3166-1/Armenia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "AM",
   :skos/definition "Alpha-2 country code for Armenia"})

(def AND
  "Alpha-3 country code for Andorra"
  {:db/ident :lcc-3166-1/AND,
   :lcc-lr/denotes :lcc-3166-1/Andorra,
   :lcc-lr/hasTag "AND",
   :lcc-lr/identifies :lcc-3166-1/Andorra,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "AND",
   :skos/definition "Alpha-3 country code for Andorra"})

(def AO
  "Alpha-2 country code for Angola"
  {:db/ident :lcc-3166-1/AO,
   :lcc-lr/denotes :lcc-3166-1/Angola,
   :lcc-lr/hasTag "AO",
   :lcc-lr/identifies :lcc-3166-1/Angola,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "AO",
   :skos/definition "Alpha-2 country code for Angola"})

(def AQ
  "Alpha-2 country code for Antarctica"
  {:db/ident :lcc-3166-1/AQ,
   :lcc-lr/denotes :lcc-3166-1/Antarctica,
   :lcc-lr/hasTag "AQ",
   :lcc-lr/identifies :lcc-3166-1/Antarctica,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "AQ",
   :skos/definition "Alpha-2 country code for Antarctica"})

(def AR
  "Alpha-2 country code for Argentina"
  {:db/ident :lcc-3166-1/AR,
   :lcc-lr/denotes :lcc-3166-1/Argentina,
   :lcc-lr/hasTag "AR",
   :lcc-lr/identifies :lcc-3166-1/Argentina,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "AR",
   :skos/definition "Alpha-2 country code for Argentina"})

(def ARE
  "Alpha-3 country code for United Arab Emirates (the)"
  {:db/ident :lcc-3166-1/ARE,
   :lcc-lr/denotes :lcc-3166-1/UnitedArabEmirates,
   :lcc-lr/hasTag "ARE",
   :lcc-lr/identifies :lcc-3166-1/UnitedArabEmirates,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ARE",
   :skos/definition "Alpha-3 country code for United Arab Emirates (the)"})

(def ARG
  "Alpha-3 country code for Argentina"
  {:db/ident :lcc-3166-1/ARG,
   :lcc-lr/denotes :lcc-3166-1/Argentina,
   :lcc-lr/hasTag "ARG",
   :lcc-lr/identifies :lcc-3166-1/Argentina,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ARG",
   :skos/definition "Alpha-3 country code for Argentina"})

(def ARM
  "Alpha-3 country code for Armenia"
  {:db/ident :lcc-3166-1/ARM,
   :lcc-lr/denotes :lcc-3166-1/Armenia,
   :lcc-lr/hasTag "ARM",
   :lcc-lr/identifies :lcc-3166-1/Armenia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ARM",
   :skos/definition "Alpha-3 country code for Armenia"})

(def AS
  "Alpha-2 country code for American Samoa"
  {:db/ident :lcc-3166-1/AS,
   :lcc-lr/denotes :lcc-3166-1/AmericanSamoa,
   :lcc-lr/hasTag "AS",
   :lcc-lr/identifies :lcc-3166-1/AmericanSamoa,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "AS",
   :skos/definition "Alpha-2 country code for American Samoa"})

(def ASM
  "Alpha-3 country code for American Samoa"
  {:db/ident :lcc-3166-1/ASM,
   :lcc-lr/denotes :lcc-3166-1/AmericanSamoa,
   :lcc-lr/hasTag "ASM",
   :lcc-lr/identifies :lcc-3166-1/AmericanSamoa,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ASM",
   :skos/definition "Alpha-3 country code for American Samoa"})

(def AT
  "Alpha-2 country code for Austria"
  {:db/ident :lcc-3166-1/AT,
   :lcc-lr/denotes :lcc-3166-1/Austria,
   :lcc-lr/hasTag "AT",
   :lcc-lr/identifies :lcc-3166-1/Austria,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "AT",
   :skos/definition "Alpha-2 country code for Austria"})

(def ATA
  "Alpha-3 country code for Antarctica"
  {:db/ident :lcc-3166-1/ATA,
   :lcc-lr/denotes :lcc-3166-1/Antarctica,
   :lcc-lr/hasTag "ATA",
   :lcc-lr/identifies :lcc-3166-1/Antarctica,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ATA",
   :skos/definition "Alpha-3 country code for Antarctica"})

(def ATF
  "Alpha-3 country code for French Southern Territories (the)"
  {:db/ident :lcc-3166-1/ATF,
   :lcc-lr/denotes :lcc-3166-1/FrenchSouthernTerritories,
   :lcc-lr/hasTag "ATF",
   :lcc-lr/identifies :lcc-3166-1/FrenchSouthernTerritories,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ATF",
   :skos/definition
   "Alpha-3 country code for French Southern Territories (the)"})

(def ATG
  "Alpha-3 country code for Antigua and Barbuda"
  {:db/ident :lcc-3166-1/ATG,
   :lcc-lr/denotes :lcc-3166-1/AntiguaAndBarbuda,
   :lcc-lr/hasTag "ATG",
   :lcc-lr/identifies :lcc-3166-1/AntiguaAndBarbuda,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ATG",
   :skos/definition "Alpha-3 country code for Antigua and Barbuda"})

(def AU
  "Alpha-2 country code for Australia"
  {:db/ident :lcc-3166-1/AU,
   :lcc-lr/denotes :lcc-3166-1/Australia,
   :lcc-lr/hasTag "AU",
   :lcc-lr/identifies :lcc-3166-1/Australia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "AU",
   :skos/definition "Alpha-2 country code for Australia"})

(def AUS
  "Alpha-3 country code for Australia"
  {:db/ident :lcc-3166-1/AUS,
   :lcc-lr/denotes :lcc-3166-1/Australia,
   :lcc-lr/hasTag "AUS",
   :lcc-lr/identifies :lcc-3166-1/Australia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "AUS",
   :skos/definition "Alpha-3 country code for Australia"})

(def AUT
  "Alpha-3 country code for Austria"
  {:db/ident :lcc-3166-1/AUT,
   :lcc-lr/denotes :lcc-3166-1/Austria,
   :lcc-lr/hasTag "AUT",
   :lcc-lr/identifies :lcc-3166-1/Austria,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "AUT",
   :skos/definition "Alpha-3 country code for Austria"})

(def AW
  "Alpha-2 country code for Aruba"
  {:db/ident :lcc-3166-1/AW,
   :lcc-lr/denotes :lcc-3166-1/Aruba,
   :lcc-lr/hasTag "AW",
   :lcc-lr/identifies :lcc-3166-1/Aruba,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "AW",
   :skos/definition "Alpha-2 country code for Aruba"})

(def AX
  "Alpha-2 country code for Åland Islands"
  {:db/ident :lcc-3166-1/AX,
   :lcc-lr/denotes :lcc-3166-1/AlandIslands,
   :lcc-lr/hasTag "AX",
   :lcc-lr/identifies :lcc-3166-1/AlandIslands,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "AX",
   :skos/definition "Alpha-2 country code for Åland Islands"})

(def AZ
  "Alpha-2 country code for Azerbaijan"
  {:db/ident :lcc-3166-1/AZ,
   :lcc-lr/denotes :lcc-3166-1/Azerbaijan,
   :lcc-lr/hasTag "AZ",
   :lcc-lr/identifies :lcc-3166-1/Azerbaijan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "AZ",
   :skos/definition "Alpha-2 country code for Azerbaijan"})

(def AZE
  "Alpha-3 country code for Azerbaijan"
  {:db/ident :lcc-3166-1/AZE,
   :lcc-lr/denotes :lcc-3166-1/Azerbaijan,
   :lcc-lr/hasTag "AZE",
   :lcc-lr/identifies :lcc-3166-1/Azerbaijan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "AZE",
   :skos/definition "Alpha-3 country code for Azerbaijan"})

(def Afghanistan
  "the country of Afghanistan"
  {:db/ident :lcc-3166-1/Afghanistan,
   :lcc-cr/hasEnglishFullName #voc/lstr
                               "the Islamic Republic of Afghanistan@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Afghanistan@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "AFGHANISTAN@en",
   :lcc-cr/hasFrenchFullName #voc/lstr
                              "la République islamique d'Afghanistan@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Afghanistan (l')@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "AFGHANISTAN@fr",
   :lcc-cr/hasLocalShortName [#voc/lstr "Afghānistān@ps"
                              #voc/lstr "Afghānistān@fa"],
   :lcc-cr/hasNumericRegionCode "004",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/Persian :lcc-639-1/Pushto],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [#voc/lstr "Afghānistān@ps" #voc/lstr "Afghānistān@fa"],
   :skos/definition "the country of Afghanistan"})

(def AlandIslands
  "the country of Åland Islands"
  {:db/ident :lcc-3166-1/AlandIslands,
   :lcc-cr/hasEnglishShortName #voc/lstr "Åland Islands@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "ÅLAND ISLANDS@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Åland(les Îles)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "ÅLAND, ÎLES@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Åland@sv",
   :lcc-cr/hasNumericRegionCode "248",
   :lcc-cr/hasRemarks "No subdivisions relevant for this standard.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Swedish,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Åland@sv",
   :skos/definition "the country of Åland Islands"})

(def Albania
  "the country of Albania"
  {:db/ident :lcc-3166-1/Albania,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Albania@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Albania@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "ALBANIA@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République d'Albanie@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Albanie (l')@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "ALBANIE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Shqipëria; Shqipëri@sq",
   :lcc-cr/hasNumericRegionCode "008",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Albanian,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Shqipëria; Shqipëri@sq",
   :skos/definition "the country of Albania"})

(def Algeria
  "the country of Algeria"
  {:db/ident :lcc-3166-1/Algeria,
   :lcc-cr/hasEnglishFullName #voc/lstr
                               "the People's Democratic Republic of Algeria@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Algeria@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "ALGERIA@en",
   :lcc-cr/hasFrenchFullName
   #voc/lstr "la République algérienne démocratique et populaire@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Algérie (l')@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "ALGÉRIE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Al Jazā'ir@ar",
   :lcc-cr/hasNumericRegionCode "012",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Arabic,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Al Jazā'ir@ar",
   :skos/definition "the country of Algeria"})

(def AmericanSamoa
  "the country of American Samoa"
  {:db/ident :lcc-3166-1/AmericanSamoa,
   :lcc-cr/hasEnglishShortName #voc/lstr "American Samoa@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "AMERICAN SAMOA@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Samoa américaines (les)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "SAMOA AMÉRICAINES@fr",
   :lcc-cr/hasNumericRegionCode "016",
   :lcc-cr/hasRemarks
   ["Principal island:Tutuila. Includes: Swain's Island"
    "No subdivisions relevant for this standard. Included also as a subdivision of the United States (US-AS)."],
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "American Samoa@en",
   :skos/definition "the country of American Samoa"})

(def Andorra
  "the country of Andorra"
  {:db/ident :lcc-3166-1/Andorra,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Principality of Andorra@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Andorra@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "ANDORRA@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la Principauté d'Andorre@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Andorre (l')@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "ANDORRE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Andorra@ca",
   :lcc-cr/hasNumericRegionCode "020",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Catalan,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Andorra@ca",
   :skos/definition "the country of Andorra"})

(def Angola
  "the country of Angola"
  {:db/ident :lcc-3166-1/Angola,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Angola@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Angola@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "ANGOLA@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République d'Angola@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Angola (l')@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "ANGOLA@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Angola@pt",
   :lcc-cr/hasNumericRegionCode "024",
   :lcc-cr/hasRemarks "Includes: Cabinda.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Portuguese,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Angola@pt",
   :skos/definition "the country of Angola"})

(def Anguilla
  "the country of Anguilla"
  {:db/ident :lcc-3166-1/Anguilla,
   :lcc-cr/hasEnglishShortName #voc/lstr "Anguilla@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "ANGUILLA@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Anguilla@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "ANGUILLA@fr",
   :lcc-cr/hasNumericRegionCode "660",
   :lcc-cr/hasRemarks "No subdivisions relevant for this standard.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Anguilla@en",
   :skos/definition "the country of Anguilla"})

(def Antarctica
  "the country of Antarctica"
  {:db/ident :lcc-3166-1/Antarctica,
   :lcc-cr/hasEnglishShortName #voc/lstr "Antarctica@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "ANTARCTICA@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Antarctique (l')@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "ANTARCTIQUE@fr",
   :lcc-cr/hasNumericRegionCode "010",
   :lcc-cr/hasRemarks ["No subdivisions relevant for this standard."
                       "Territories south of 60° south latitude."],
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :skos/definition "the country of Antarctica"})

(def AntiguaAndBarbuda
  "the country of Antigua and Barbuda"
  {:db/ident :lcc-3166-1/AntiguaAndBarbuda,
   :lcc-cr/hasEnglishShortName #voc/lstr "Antigua and Barbuda@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "ANTIGUA AND BARBUDA@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Antigua-et-Barbuda@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "ANTIGUA-ET-BARBUDA@fr",
   :lcc-cr/hasNumericRegionCode "028",
   :lcc-cr/hasRemarks "Includes: Redonda Island.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Antigua and Barbuda@en",
   :skos/definition "the country of Antigua and Barbuda"})

(def Argentina
  "the country of Argentina"
  {:db/ident :lcc-3166-1/Argentina,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Argentine Republic@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Argentina@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "ARGENTINA@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République argentine@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Argentine (l')@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "ARGENTINE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Argentina (la)@es",
   :lcc-cr/hasNumericRegionCode "032",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Spanish,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Argentina (la)@es",
   :skos/definition "the country of Argentina"})

(def Armenia
  "the country of Armenia"
  {:db/ident :lcc-3166-1/Armenia,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Armenia@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Armenia@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "ARMENIA@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République d'Arménie@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Arménie (l')@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "ARMÉNIE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Hayastan@hy",
   :lcc-cr/hasNumericRegionCode "051",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Armenian,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Hayastan@hy",
   :skos/definition "the country of Armenia"})

(def Aruba
  "the country of Aruba"
  {:db/ident :lcc-3166-1/Aruba,
   :lcc-cr/hasEnglishShortName #voc/lstr "Aruba@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "ARUBA@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Aruba@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "ARUBA@fr",
   :lcc-cr/hasLocalShortName [#voc/lstr "Aruba@nl" "Aruba"],
   :lcc-cr/hasNumericRegionCode "533",
   :lcc-cr/hasRemarks
   "No subdivisions relevant for this standard. Included also as subdivision of Netherlands (NL-AW).",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/Dutch :lcc-639-2/Papiamento],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Aruba@nl",
   :skos/definition "the country of Aruba"})

(def Australia
  "the country of Australia"
  {:db/ident :lcc-3166-1/Australia,
   :lcc-cr/hasEnglishShortName #voc/lstr "Australia@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "AUSTRALIA@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Australie (l')@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "AUSTRALIE@fr",
   :lcc-cr/hasNumericRegionCode "036",
   :lcc-cr/hasRemarks
   "Often referred to as the Commonwealth of Australia. Includes: Lord Howe Island, Macquarie Island; and also Ashmore and Cartier \nIslands, and Coral Sea Islands which are Australian external territories.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Australia@en",
   :skos/definition "the country of Australia"})

(def Austria
  "the country of Austria"
  {:db/ident :lcc-3166-1/Austria,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Austria@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Austria@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "AUSTRIA@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République d'Autriche@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Autriche (l')@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "AUTRICHE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Österreich@de",
   :lcc-cr/hasNumericRegionCode "040",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/German,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Österreich@de",
   :skos/definition "the country of Austria"})

(def Azerbaijan
  "the country of Azerbaijan"
  {:db/ident :lcc-3166-1/Azerbaijan,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Azerbaijan@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Azerbaijan@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "AZERBAIJAN@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République d'Azerbaïdjan@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Azerbaïdjan (l')@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "AZERBAÏDJAN@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Azərbaycan@az",
   :lcc-cr/hasNumericRegionCode "031",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Azerbaijani,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Azərbaycan@az",
   :skos/definition "the country of Azerbaijan"})

(def BA
  "Alpha-2 country code for Bosnia and Herzegovina"
  {:db/ident :lcc-3166-1/BA,
   :lcc-lr/denotes :lcc-3166-1/BosniaAndHerzegovina,
   :lcc-lr/hasTag "BA",
   :lcc-lr/identifies :lcc-3166-1/BosniaAndHerzegovina,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BA",
   :skos/definition "Alpha-2 country code for Bosnia and Herzegovina"})

(def BB
  "Alpha-2 country code for Barbados"
  {:db/ident :lcc-3166-1/BB,
   :lcc-lr/denotes :lcc-3166-1/Barbados,
   :lcc-lr/hasTag "BB",
   :lcc-lr/identifies :lcc-3166-1/Barbados,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BB",
   :skos/definition "Alpha-2 country code for Barbados"})

(def BD
  "Alpha-2 country code for Bangladesh"
  {:db/ident :lcc-3166-1/BD,
   :lcc-lr/denotes :lcc-3166-1/Bangladesh,
   :lcc-lr/hasTag "BD",
   :lcc-lr/identifies :lcc-3166-1/Bangladesh,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BD",
   :skos/definition "Alpha-2 country code for Bangladesh"})

(def BDI
  "Alpha-3 country code for Burundi"
  {:db/ident :lcc-3166-1/BDI,
   :lcc-lr/denotes :lcc-3166-1/Burundi,
   :lcc-lr/hasTag "BDI",
   :lcc-lr/identifies :lcc-3166-1/Burundi,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BDI",
   :skos/definition "Alpha-3 country code for Burundi"})

(def BE
  "Alpha-2 country code for Belgium"
  {:db/ident :lcc-3166-1/BE,
   :lcc-lr/denotes :lcc-3166-1/Belgium,
   :lcc-lr/hasTag "BE",
   :lcc-lr/identifies :lcc-3166-1/Belgium,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BE",
   :skos/definition "Alpha-2 country code for Belgium"})

(def BEL
  "Alpha-3 country code for Belgium"
  {:db/ident :lcc-3166-1/BEL,
   :lcc-lr/denotes :lcc-3166-1/Belgium,
   :lcc-lr/hasTag "BEL",
   :lcc-lr/identifies :lcc-3166-1/Belgium,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BEL",
   :skos/definition "Alpha-3 country code for Belgium"})

(def BEN
  "Alpha-3 country code for Benin"
  {:db/ident :lcc-3166-1/BEN,
   :lcc-lr/denotes :lcc-3166-1/Benin,
   :lcc-lr/hasTag "BEN",
   :lcc-lr/identifies :lcc-3166-1/Benin,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BEN",
   :skos/definition "Alpha-3 country code for Benin"})

(def BES
  "Alpha-3 country code for Bonaire, Sint Eustatius and Saba"
  {:db/ident :lcc-3166-1/BES,
   :lcc-lr/denotes :lcc-3166-1/Bonaire,
   :lcc-lr/hasTag "BES",
   :lcc-lr/identifies :lcc-3166-1/Bonaire,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BES",
   :skos/definition
   "Alpha-3 country code for Bonaire, Sint Eustatius and Saba"})

(def BF
  "Alpha-2 country code for Burkina Faso"
  {:db/ident :lcc-3166-1/BF,
   :lcc-lr/denotes :lcc-3166-1/BurkinaFaso,
   :lcc-lr/hasTag "BF",
   :lcc-lr/identifies :lcc-3166-1/BurkinaFaso,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BF",
   :skos/definition "Alpha-2 country code for Burkina Faso"})

(def BFA
  "Alpha-3 country code for Burkina Faso"
  {:db/ident :lcc-3166-1/BFA,
   :lcc-lr/denotes :lcc-3166-1/BurkinaFaso,
   :lcc-lr/hasTag "BFA",
   :lcc-lr/identifies :lcc-3166-1/BurkinaFaso,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BFA",
   :skos/definition "Alpha-3 country code for Burkina Faso"})

(def BG
  "Alpha-2 country code for Bulgaria"
  {:db/ident :lcc-3166-1/BG,
   :lcc-lr/denotes :lcc-3166-1/Bulgaria,
   :lcc-lr/hasTag "BG",
   :lcc-lr/identifies :lcc-3166-1/Bulgaria,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BG",
   :skos/definition "Alpha-2 country code for Bulgaria"})

(def BGD
  "Alpha-3 country code for Bangladesh"
  {:db/ident :lcc-3166-1/BGD,
   :lcc-lr/denotes :lcc-3166-1/Bangladesh,
   :lcc-lr/hasTag "BGD",
   :lcc-lr/identifies :lcc-3166-1/Bangladesh,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BGD",
   :skos/definition "Alpha-3 country code for Bangladesh"})

(def BGR
  "Alpha-3 country code for Bulgaria"
  {:db/ident :lcc-3166-1/BGR,
   :lcc-lr/denotes :lcc-3166-1/Bulgaria,
   :lcc-lr/hasTag "BGR",
   :lcc-lr/identifies :lcc-3166-1/Bulgaria,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BGR",
   :skos/definition "Alpha-3 country code for Bulgaria"})

(def BH
  "Alpha-2 country code for Bahrain"
  {:db/ident :lcc-3166-1/BH,
   :lcc-lr/denotes :lcc-3166-1/Bahrain,
   :lcc-lr/hasTag "BH",
   :lcc-lr/identifies :lcc-3166-1/Bahrain,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BH",
   :skos/definition "Alpha-2 country code for Bahrain"})

(def BHR
  "Alpha-3 country code for Bahrain"
  {:db/ident :lcc-3166-1/BHR,
   :lcc-lr/denotes :lcc-3166-1/Bahrain,
   :lcc-lr/hasTag "BHR",
   :lcc-lr/identifies :lcc-3166-1/Bahrain,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BHR",
   :skos/definition "Alpha-3 country code for Bahrain"})

(def BHS
  "Alpha-3 country code for Bahamas (the)"
  {:db/ident :lcc-3166-1/BHS,
   :lcc-lr/denotes :lcc-3166-1/Bahamas,
   :lcc-lr/hasTag "BHS",
   :lcc-lr/identifies :lcc-3166-1/Bahamas,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BHS",
   :skos/definition "Alpha-3 country code for Bahamas (the)"})

(def BI
  "Alpha-2 country code for Burundi"
  {:db/ident :lcc-3166-1/BI,
   :lcc-lr/denotes :lcc-3166-1/Burundi,
   :lcc-lr/hasTag "BI",
   :lcc-lr/identifies :lcc-3166-1/Burundi,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BI",
   :skos/definition "Alpha-2 country code for Burundi"})

(def BIH
  "Alpha-3 country code for Bosnia and Herzegovina"
  {:db/ident :lcc-3166-1/BIH,
   :lcc-lr/denotes :lcc-3166-1/BosniaAndHerzegovina,
   :lcc-lr/hasTag "BIH",
   :lcc-lr/identifies :lcc-3166-1/BosniaAndHerzegovina,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BIH",
   :skos/definition "Alpha-3 country code for Bosnia and Herzegovina"})

(def BJ
  "Alpha-2 country code for Benin"
  {:db/ident :lcc-3166-1/BJ,
   :lcc-lr/denotes :lcc-3166-1/Benin,
   :lcc-lr/hasTag "BJ",
   :lcc-lr/identifies :lcc-3166-1/Benin,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BJ",
   :skos/definition "Alpha-2 country code for Benin"})

(def BL
  "Alpha-2 country code for Saint Barthélemy"
  {:db/ident :lcc-3166-1/BL,
   :lcc-lr/denotes :lcc-3166-1/SaintBarthelemy,
   :lcc-lr/hasTag "BL",
   :lcc-lr/identifies :lcc-3166-1/SaintBarthelemy,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BL",
   :skos/definition "Alpha-2 country code for Saint Barthélemy"})

(def BLM
  "Alpha-3 country code for Saint Barthélemy"
  {:db/ident :lcc-3166-1/BLM,
   :lcc-lr/denotes :lcc-3166-1/SaintBarthelemy,
   :lcc-lr/hasTag "BLM",
   :lcc-lr/identifies :lcc-3166-1/SaintBarthelemy,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BLM",
   :skos/definition "Alpha-3 country code for Saint Barthélemy"})

(def BLR
  "Alpha-3 country code for Belarus"
  {:db/ident :lcc-3166-1/BLR,
   :lcc-lr/denotes :lcc-3166-1/Belarus,
   :lcc-lr/hasTag "BLR",
   :lcc-lr/identifies :lcc-3166-1/Belarus,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BLR",
   :skos/definition "Alpha-3 country code for Belarus"})

(def BLZ
  "Alpha-3 country code for Belize"
  {:db/ident :lcc-3166-1/BLZ,
   :lcc-lr/denotes :lcc-3166-1/Belize,
   :lcc-lr/hasTag "BLZ",
   :lcc-lr/identifies :lcc-3166-1/Belize,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BLZ",
   :skos/definition "Alpha-3 country code for Belize"})

(def BM
  "Alpha-2 country code for Bermuda"
  {:db/ident :lcc-3166-1/BM,
   :lcc-lr/denotes :lcc-3166-1/Bermuda,
   :lcc-lr/hasTag "BM",
   :lcc-lr/identifies :lcc-3166-1/Bermuda,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BM",
   :skos/definition "Alpha-2 country code for Bermuda"})

(def BMU
  "Alpha-3 country code for Bermuda"
  {:db/ident :lcc-3166-1/BMU,
   :lcc-lr/denotes :lcc-3166-1/Bermuda,
   :lcc-lr/hasTag "BMU",
   :lcc-lr/identifies :lcc-3166-1/Bermuda,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BMU",
   :skos/definition "Alpha-3 country code for Bermuda"})

(def BN
  "Alpha-2 country code for Brunei Darussalam"
  {:db/ident :lcc-3166-1/BN,
   :lcc-lr/denotes :lcc-3166-1/BruneiDarussalam,
   :lcc-lr/hasTag "BN",
   :lcc-lr/identifies :lcc-3166-1/BruneiDarussalam,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BN",
   :skos/definition "Alpha-2 country code for Brunei Darussalam"})

(def BO
  "Alpha-2 country code for Bolivia (Plurinational State of)"
  {:db/ident :lcc-3166-1/BO,
   :lcc-lr/denotes :lcc-3166-1/Bolivia,
   :lcc-lr/hasTag "BO",
   :lcc-lr/identifies :lcc-3166-1/Bolivia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BO",
   :skos/definition
   "Alpha-2 country code for Bolivia (Plurinational State of)"})

(def BOL
  "Alpha-3 country code for Bolivia (Plurinational State of)"
  {:db/ident :lcc-3166-1/BOL,
   :lcc-lr/denotes :lcc-3166-1/Bolivia,
   :lcc-lr/hasTag "BOL",
   :lcc-lr/identifies :lcc-3166-1/Bolivia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BOL",
   :skos/definition
   "Alpha-3 country code for Bolivia (Plurinational State of)"})

(def BQ
  "Alpha-2 country code for Bonaire, Sint Eustatius and Saba"
  {:db/ident :lcc-3166-1/BQ,
   :lcc-lr/denotes :lcc-3166-1/Bonaire,
   :lcc-lr/hasTag "BQ",
   :lcc-lr/identifies :lcc-3166-1/Bonaire,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BQ",
   :skos/definition
   "Alpha-2 country code for Bonaire, Sint Eustatius and Saba"})

(def BR
  "Alpha-2 country code for Brazil"
  {:db/ident :lcc-3166-1/BR,
   :lcc-lr/denotes :lcc-3166-1/Brazil,
   :lcc-lr/hasTag "BR",
   :lcc-lr/identifies :lcc-3166-1/Brazil,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BR",
   :skos/definition "Alpha-2 country code for Brazil"})

(def BRA
  "Alpha-3 country code for Brazil"
  {:db/ident :lcc-3166-1/BRA,
   :lcc-lr/denotes :lcc-3166-1/Brazil,
   :lcc-lr/hasTag "BRA",
   :lcc-lr/identifies :lcc-3166-1/Brazil,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BRA",
   :skos/definition "Alpha-3 country code for Brazil"})

(def BRB
  "Alpha-3 country code for Barbados"
  {:db/ident :lcc-3166-1/BRB,
   :lcc-lr/denotes :lcc-3166-1/Barbados,
   :lcc-lr/hasTag "BRB",
   :lcc-lr/identifies :lcc-3166-1/Barbados,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BRB",
   :skos/definition "Alpha-3 country code for Barbados"})

(def BRN
  "Alpha-3 country code for Brunei Darussalam"
  {:db/ident :lcc-3166-1/BRN,
   :lcc-lr/denotes :lcc-3166-1/BruneiDarussalam,
   :lcc-lr/hasTag "BRN",
   :lcc-lr/identifies :lcc-3166-1/BruneiDarussalam,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BRN",
   :skos/definition "Alpha-3 country code for Brunei Darussalam"})

(def BS
  "Alpha-2 country code for Bahamas (the)"
  {:db/ident :lcc-3166-1/BS,
   :lcc-lr/denotes :lcc-3166-1/Bahamas,
   :lcc-lr/hasTag "BS",
   :lcc-lr/identifies :lcc-3166-1/Bahamas,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BS",
   :skos/definition "Alpha-2 country code for Bahamas (the)"})

(def BT
  "Alpha-2 country code for Bhutan"
  {:db/ident :lcc-3166-1/BT,
   :lcc-lr/denotes :lcc-3166-1/Bhutan,
   :lcc-lr/hasTag "BT",
   :lcc-lr/identifies :lcc-3166-1/Bhutan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BT",
   :skos/definition "Alpha-2 country code for Bhutan"})

(def BTN
  "Alpha-3 country code for Bhutan"
  {:db/ident :lcc-3166-1/BTN,
   :lcc-lr/denotes :lcc-3166-1/Bhutan,
   :lcc-lr/hasTag "BTN",
   :lcc-lr/identifies :lcc-3166-1/Bhutan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BTN",
   :skos/definition "Alpha-3 country code for Bhutan"})

(def BV
  "Alpha-2 country code for Bouvet Island"
  {:db/ident :lcc-3166-1/BV,
   :lcc-lr/denotes :lcc-3166-1/BouvetIsland,
   :lcc-lr/hasTag "BV",
   :lcc-lr/identifies :lcc-3166-1/BouvetIsland,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BV",
   :skos/definition "Alpha-2 country code for Bouvet Island"})

(def BVT
  "Alpha-3 country code for Bouvet Island"
  {:db/ident :lcc-3166-1/BVT,
   :lcc-lr/denotes :lcc-3166-1/BouvetIsland,
   :lcc-lr/hasTag "BVT",
   :lcc-lr/identifies :lcc-3166-1/BouvetIsland,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BVT",
   :skos/definition "Alpha-3 country code for Bouvet Island"})

(def BW
  "Alpha-2 country code for Botswana"
  {:db/ident :lcc-3166-1/BW,
   :lcc-lr/denotes :lcc-3166-1/Botswana,
   :lcc-lr/hasTag "BW",
   :lcc-lr/identifies :lcc-3166-1/Botswana,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BW",
   :skos/definition "Alpha-2 country code for Botswana"})

(def BWA
  "Alpha-3 country code for Botswana"
  {:db/ident :lcc-3166-1/BWA,
   :lcc-lr/denotes :lcc-3166-1/Botswana,
   :lcc-lr/hasTag "BWA",
   :lcc-lr/identifies :lcc-3166-1/Botswana,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BWA",
   :skos/definition "Alpha-3 country code for Botswana"})

(def BY
  "Alpha-2 country code for Belarus"
  {:db/ident :lcc-3166-1/BY,
   :lcc-lr/denotes :lcc-3166-1/Belarus,
   :lcc-lr/hasTag "BY",
   :lcc-lr/identifies :lcc-3166-1/Belarus,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BY",
   :skos/definition "Alpha-2 country code for Belarus"})

(def BZ
  "Alpha-2 country code for Belize"
  {:db/ident :lcc-3166-1/BZ,
   :lcc-lr/denotes :lcc-3166-1/Belize,
   :lcc-lr/hasTag "BZ",
   :lcc-lr/identifies :lcc-3166-1/Belize,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "BZ",
   :skos/definition "Alpha-2 country code for Belize"})

(def Bahamas
  "the country of Bahamas (the)"
  {:db/ident :lcc-3166-1/Bahamas,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Commonwealth of the Bahamas@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Bahamas (the)@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "BAHAMAS@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "le Commonwealth des Bahamas@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Bahamas (les)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "BAHAMAS@fr",
   :lcc-cr/hasNumericRegionCode "044",
   :lcc-cr/hasRemarks
   "The island of New Providence, where the capital Nassau is located, is administered directly by the national government.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Bahamas (the)@en",
   :skos/definition "the country of Bahamas (the)"})

(def Bahrain
  "the country of Bahrain"
  {:db/ident :lcc-3166-1/Bahrain,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Kingdom of Bahrain@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Bahrain@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "BAHRAIN@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "le Royaume de Bahreïn@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Bahreïn@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "BAHREÏN@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Al Baḩrayn@ar",
   :lcc-cr/hasNumericRegionCode "048",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Arabic,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Al Baḩrayn@ar",
   :skos/definition "the country of Bahrain"})

(def Bangladesh
  "the country of Bangladesh"
  {:db/ident :lcc-3166-1/Bangladesh,
   :lcc-cr/hasEnglishFullName #voc/lstr
                               "the People's Republic of Bangladesh@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Bangladesh@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "BANGLADESH@en",
   :lcc-cr/hasFrenchFullName #voc/lstr
                              "la République populaire du Bangladesh@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Bangladesh (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "BANGLADESH@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Bāṁlādesh@bn",
   :lcc-cr/hasNumericRegionCode "050",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Bengali,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Bāṁlādesh@bn",
   :skos/definition "the country of Bangladesh"})

(def Barbados
  "the country of Barbados"
  {:db/ident :lcc-3166-1/Barbados,
   :lcc-cr/hasEnglishShortName #voc/lstr "Barbados@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "BARBADOS@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Barbade (la)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "BARBADE@fr",
   :lcc-cr/hasNumericRegionCode "052",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Barbados@en",
   :skos/definition "the country of Barbados"})

(def Belarus
  "the country of Belarus"
  {:db/ident :lcc-3166-1/Belarus,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Belarus@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Belarus@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "BELARUS@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République du Bélarus@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Bélarus (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "BÉLARUS@fr",
   :lcc-cr/hasLocalShortName [#voc/lstr "Belarus'@ru" #voc/lstr "Bielaruś@be"],
   :lcc-cr/hasNumericRegionCode "112",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/Belarusian
                                       :lcc-639-1/Russian],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [#voc/lstr "Belarus'@ru" #voc/lstr "Bielaruś@be"],
   :skos/definition "the country of Belarus"})

(def Belgium
  "the country of Belgium"
  {:db/ident :lcc-3166-1/Belgium,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Kingdom of Belgium@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Belgium@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "BELGIUM@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "le Royaume de Belgique@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Belgique (la)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "BELGIQUE@fr",
   :lcc-cr/hasLocalShortName [#voc/lstr "Belgien@de" #voc/lstr "België@nl"],
   :lcc-cr/hasNumericRegionCode "056",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage
   [:lcc-639-1/German :lcc-639-1/French :lcc-639-1/Dutch],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label
   [#voc/lstr "Belgien@de" #voc/lstr "België@nl" #voc/lstr "Belgique (la)@fr"],
   :skos/definition "the country of Belgium"})

(def Belize
  "the country of Belize"
  {:db/ident :lcc-3166-1/Belize,
   :lcc-cr/hasEnglishShortName #voc/lstr "Belize@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "BELIZE@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Belize (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "BELIZE@fr",
   :lcc-cr/hasNumericRegionCode "084",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Belize@en",
   :skos/definition "the country of Belize"})

(def Benin
  "the country of Benin"
  {:db/ident :lcc-3166-1/Benin,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Benin@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Benin@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "BENIN@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République du Bénin@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Bénin (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "BÉNIN@fr",
   :lcc-cr/hasNumericRegionCode "204",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Bénin (le)@fr",
   :skos/definition "the country of Benin"})

(def Bermuda
  "the country of Bermuda"
  {:db/ident :lcc-3166-1/Bermuda,
   :lcc-cr/hasEnglishShortName #voc/lstr "Bermuda@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "BERMUDA@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Bermudes (les)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "BERMUDES@fr",
   :lcc-cr/hasNumericRegionCode "060",
   :lcc-cr/hasRemarks "No subdivisions relevant for this standard.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Bermuda@en",
   :skos/definition "the country of Bermuda"})

(def Bhutan
  "the country of Bhutan"
  {:db/ident :lcc-3166-1/Bhutan,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Kingdom of Bhutan@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Bhutan@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "BHUTAN@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "le Royaume du Bhoutan@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Bhoutan (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "BHOUTAN@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Druk-Yul@dz",
   :lcc-cr/hasNumericRegionCode "064",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Dzongkha,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Druk-Yul@dz",
   :skos/definition "the country of Bhutan"})

(def Bolivia
  "the country of Bolivia (Plurinational State of)"
  {:db/ident :lcc-3166-1/Bolivia,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Plurinational State of Bolivia@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Bolivia (Plurinational State of)@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr
                                          "BOLIVIA (PLURINATIONAL STATE OF)@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "l'État plurinational de Bolivie@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Bolivie (État plurinational de)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr
                                         "BOLIVIE (ÉTAT PLURINATIONAL DE)@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Bolivia,  Estado Plurinacional de@es",
   :lcc-cr/hasNumericRegionCode "068",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Spanish,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Bolivia,  Estado Plurinacional de@es",
   :skos/definition "the country of Bolivia (Plurinational State of)"})

(def Bonaire
  "the country of Bonaire, Sint Eustatius and Saba"
  {:db/ident :lcc-3166-1/Bonaire,
   :lcc-cr/hasEnglishShortName #voc/lstr "Bonaire, Sint Eustatius and Saba@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr
                                          "BONAIRE, SINT EUSTATIUS AND SABA@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Bonaire, Saint-Eustache et Saba@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr
                                         "BONAIRE, SAINT-EUSTACHE ET SABA@fr",
   :lcc-cr/hasLocalShortName ["Boneiru, Sint Eustatius y Saba"
                              #voc/lstr "Bonaire, Sint Eustatius en Saba@nl"],
   :lcc-cr/hasNumericRegionCode "535",
   :lcc-cr/hasRemarks ["Often referred to as Caribbean Netherlands."
                       "Included as a subdivision of the Netherlands (NL-BQ)."],
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage
   [:lcc-639-1/English :lcc-639-2/Papiamento :lcc-639-1/Dutch],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [#voc/lstr "Bonaire, Sint Eustatius and Saba@en"
                #voc/lstr "Bonaire, Sint Eustatius en Saba@nl"],
   :skos/definition "the country of Bonaire, Sint Eustatius and Saba"})

(def BosniaAndHerzegovina
  "the country of Bosnia and Herzegovina"
  {:db/ident :lcc-3166-1/BosniaAndHerzegovina,
   :lcc-cr/hasEnglishShortName #voc/lstr "Bosnia and Herzegovina@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "BOSNIA AND HERZEGOVINA@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Bosnie-Herzégovine (la)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "BOSNIE-HERZÉGOVINE@fr",
   :lcc-cr/hasLocalShortName [#voc/lstr "Bosna i Hercegovina@sr"
                              #voc/lstr "Bosna i Hercegovina@hr"
                              #voc/lstr "Bosna i Hercegovina@bs"],
   :lcc-cr/hasNumericRegionCode "070",
   :lcc-cr/hasRemarks
   "Herzegovina * is the second significant part of composite country name.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage
   [:lcc-639-1/Bosnian :lcc-639-1/Croatian :lcc-639-1/Serbian],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [#voc/lstr "Bosna i Hercegovina@sr"
                #voc/lstr "Bosna i Hercegovina@hr"
                #voc/lstr "Bosna i Hercegovina@bs"],
   :skos/definition "the country of Bosnia and Herzegovina"})

(def Botswana
  "the country of Botswana"
  {:db/ident :lcc-3166-1/Botswana,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Botswana@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Botswana@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "BOTSWANA@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République du Botswana@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Botswana (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "BOTSWANA@fr",
   :lcc-cr/hasNumericRegionCode "072",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Botswana@en",
   :skos/definition "the country of Botswana"})

(def BouvetIsland
  "the country of Bouvet Island"
  {:db/ident :lcc-3166-1/BouvetIsland,
   :lcc-cr/hasEnglishShortName #voc/lstr "Bouvet Island@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "BOUVET ISLAND@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Bouvet (l'Île)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "BOUVET, ÎLE@fr",
   :lcc-cr/hasLocalShortName [#voc/lstr "Bouvetøya@nb"
                              #voc/lstr "Bouvetøya@nn"],
   :lcc-cr/hasNumericRegionCode "074",
   :lcc-cr/hasRemarks "No subdivisions relevant for this standard.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/NorwegianBokmal
                                       :lcc-639-1/NorwegianNynorsk],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [#voc/lstr "Bouvetøya@nb" #voc/lstr "Bouvetøya@nn"],
   :skos/definition "the country of Bouvet Island"})

(def Brazil
  "the country of Brazil"
  {:db/ident :lcc-3166-1/Brazil,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Federative Republic of Brazil@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Brazil@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "BRAZIL@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République fédérative du Brésil@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Brésil (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "BRÉSIL@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Brasil (o)@pt",
   :lcc-cr/hasNumericRegionCode "076",
   :lcc-cr/hasRemarks
   "Includes: Fernando de Noronha Island, Martim Vaz Islands, Trindade Island.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Portuguese,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Brasil (o)@pt",
   :skos/definition "the country of Brazil"})

(def BritishIndianOceanTerritory
  "the country of British Indian Ocean Territory (the)"
  {:db/ident :lcc-3166-1/BritishIndianOceanTerritory,
   :lcc-cr/hasEnglishShortName #voc/lstr
                                "British Indian Ocean Territory (the)@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr
                                          "BRITISH INDIAN OCEAN TERRITORY@en",
   :lcc-cr/hasFrenchFullName #voc/lstr
                              "le Territoire britannique de l'océan Indien@fr",
   :lcc-cr/hasFrenchShortName
   #voc/lstr "Indien (le Territoire britannique de l'océan)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals
   #voc/lstr "OCÉAN INDIEN, TERRITOIRE BRITANNIQUE DE L'@fr",
   :lcc-cr/hasNumericRegionCode "086",
   :lcc-cr/hasRemarks
   [" Comprises: Chagos Archipelago (Principal island: Diego Garcia).\nNo subdivision reported"
    "No subdivisions relevant for this standard."],
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "British Indian Ocean Territory (the)@en",
   :skos/definition "the country of British Indian Ocean Territory (the)"})

(def BruneiDarussalam
  "the country of Brunei Darussalam"
  {:db/ident :lcc-3166-1/BruneiDarussalam,
   :lcc-cr/hasEnglishShortName #voc/lstr "Brunei Darussalam@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "BRUNEI DARUSSALAM@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Brunéi Darussalam (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "BRUNEI DARUSSALAM@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Negara Brunei Darussalam@ms",
   :lcc-cr/hasNumericRegionCode "096",
   :lcc-cr/hasRemarks "Variant: Negara Brunei Darussalam.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/English :lcc-639-1/Malay],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [#voc/lstr "Brunei Darussalam@en"
                #voc/lstr "Negara Brunei Darussalam@ms"],
   :skos/definition "the country of Brunei Darussalam"})

(def Bulgaria
  "the country of Bulgaria"
  {:db/ident :lcc-3166-1/Bulgaria,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Bulgaria@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Bulgaria@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "BULGARIA@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République de Bulgarie@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Bulgarie (la)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "BULGARIE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Bulgaria@bg",
   :lcc-cr/hasNumericRegionCode "100",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Bulgarian,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Bulgaria@bg",
   :skos/definition "the country of Bulgaria"})

(def BurkinaFaso
  "the country of Burkina Faso"
  {:db/ident :lcc-3166-1/BurkinaFaso,
   :lcc-cr/hasEnglishShortName #voc/lstr "Burkina Faso@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "BURKINA FASO@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "le Burkina Faso@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Burkina Faso (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "BURKINA FASO@fr",
   :lcc-cr/hasNumericRegionCode "854",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Burkina Faso (le)@fr",
   :skos/definition "the country of Burkina Faso"})

(def Burundi
  "the country of Burundi"
  {:db/ident :lcc-3166-1/Burundi,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Burundi@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Burundi@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "BURUNDI@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République du Burundi@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Burundi (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "BURUNDI@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Burundi@rn",
   :lcc-cr/hasNumericRegionCode "108",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/French :lcc-639-1/Rundi],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [#voc/lstr "Burundi (le)@fr" #voc/lstr "Burundi@rn"],
   :skos/definition "the country of Burundi"})

(def CA
  "Alpha-2 country code for Canada"
  {:db/ident :lcc-3166-1/CA,
   :lcc-lr/denotes :lcc-3166-1/Canada,
   :lcc-lr/hasTag "CA",
   :lcc-lr/identifies :lcc-3166-1/Canada,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CA",
   :skos/definition "Alpha-2 country code for Canada"})

(def CAF
  "Alpha-3 country code for Central African Republic (the)"
  {:db/ident :lcc-3166-1/CAF,
   :lcc-lr/denotes :lcc-3166-1/CentralAfricanRepublic,
   :lcc-lr/hasTag "CAF",
   :lcc-lr/identifies :lcc-3166-1/CentralAfricanRepublic,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CAF",
   :skos/definition "Alpha-3 country code for Central African Republic (the)"})

(def CAN
  "Alpha-3 country code for Canada"
  {:db/ident :lcc-3166-1/CAN,
   :lcc-lr/denotes :lcc-3166-1/Canada,
   :lcc-lr/hasTag "CAN",
   :lcc-lr/identifies :lcc-3166-1/Canada,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CAN",
   :skos/definition "Alpha-3 country code for Canada"})

(def CC
  "Alpha-2 country code for Cocos Keeling Islands"
  {:db/ident :lcc-3166-1/CC,
   :lcc-lr/denotes :lcc-3166-1/CocosKeelingIslands,
   :lcc-lr/hasTag "CC",
   :lcc-lr/identifies :lcc-3166-1/CocosKeelingIslands,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CC",
   :skos/definition "Alpha-2 country code for Cocos Keeling Islands"})

(def CCK
  "Alpha-3 country code for Cocos Keeling Islands"
  {:db/ident :lcc-3166-1/CCK,
   :lcc-lr/denotes :lcc-3166-1/CocosKeelingIslands,
   :lcc-lr/hasTag "CCK",
   :lcc-lr/identifies :lcc-3166-1/CocosKeelingIslands,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CCK",
   :skos/definition "Alpha-3 country code for Cocos Keeling Islands"})

(def CD
  "Alpha-2 country code for Congo Democratic Republic Of"
  {:db/ident :lcc-3166-1/CD,
   :lcc-lr/denotes :lcc-3166-1/CongoDemocraticRepublicOf,
   :lcc-lr/hasTag "CD",
   :lcc-lr/identifies :lcc-3166-1/CongoDemocraticRepublicOf,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CD",
   :skos/definition "Alpha-2 country code for Congo Democratic Republic Of"})

(def CF
  "Alpha-2 country code for Central African Republic (the)"
  {:db/ident :lcc-3166-1/CF,
   :lcc-lr/denotes :lcc-3166-1/CentralAfricanRepublic,
   :lcc-lr/hasTag "CF",
   :lcc-lr/identifies :lcc-3166-1/CentralAfricanRepublic,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CF",
   :skos/definition "Alpha-2 country code for Central African Republic (the)"})

(def CG
  "Alpha-2 country code for Congo (the)"
  {:db/ident :lcc-3166-1/CG,
   :lcc-lr/denotes :lcc-3166-1/Congo,
   :lcc-lr/hasTag "CG",
   :lcc-lr/identifies :lcc-3166-1/Congo,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CG",
   :skos/definition "Alpha-2 country code for Congo (the)"})

(def CH
  "Alpha-2 country code for Switzerland"
  {:db/ident :lcc-3166-1/CH,
   :lcc-lr/denotes :lcc-3166-1/Switzerland,
   :lcc-lr/hasTag "CH",
   :lcc-lr/identifies :lcc-3166-1/Switzerland,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CH",
   :skos/definition "Alpha-2 country code for Switzerland"})

(def CHE
  "Alpha-3 country code for Switzerland"
  {:db/ident :lcc-3166-1/CHE,
   :lcc-lr/denotes :lcc-3166-1/Switzerland,
   :lcc-lr/hasTag "CHE",
   :lcc-lr/identifies :lcc-3166-1/Switzerland,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CHE",
   :skos/definition "Alpha-3 country code for Switzerland"})

(def CHL
  "Alpha-3 country code for Chile"
  {:db/ident :lcc-3166-1/CHL,
   :lcc-lr/denotes :lcc-3166-1/Chile,
   :lcc-lr/hasTag "CHL",
   :lcc-lr/identifies :lcc-3166-1/Chile,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CHL",
   :skos/definition "Alpha-3 country code for Chile"})

(def CHN
  "Alpha-3 country code for China"
  {:db/ident :lcc-3166-1/CHN,
   :lcc-lr/denotes :lcc-3166-1/China,
   :lcc-lr/hasTag "CHN",
   :lcc-lr/identifies :lcc-3166-1/China,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CHN",
   :skos/definition "Alpha-3 country code for China"})

(def CI
  "Alpha-2 country code for Côte d'Ivoire"
  {:db/ident :lcc-3166-1/CI,
   :lcc-lr/denotes :lcc-3166-1/CoteDIvoire,
   :lcc-lr/hasTag "CI",
   :lcc-lr/identifies :lcc-3166-1/CoteDIvoire,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CI",
   :skos/definition "Alpha-2 country code for Côte d'Ivoire"})

(def CIV
  "Alpha-3 country code for Côte d'Ivoire"
  {:db/ident :lcc-3166-1/CIV,
   :lcc-lr/denotes :lcc-3166-1/CoteDIvoire,
   :lcc-lr/hasTag "CIV",
   :lcc-lr/identifies :lcc-3166-1/CoteDIvoire,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CIV",
   :skos/definition "Alpha-3 country code for Côte d'Ivoire"})

(def CK
  "Alpha-2 country code for Cook Islands (the)"
  {:db/ident :lcc-3166-1/CK,
   :lcc-lr/denotes :lcc-3166-1/CookIslands,
   :lcc-lr/hasTag "CK",
   :lcc-lr/identifies :lcc-3166-1/CookIslands,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CK",
   :skos/definition "Alpha-2 country code for Cook Islands (the)"})

(def CL
  "Alpha-2 country code for Chile"
  {:db/ident :lcc-3166-1/CL,
   :lcc-lr/denotes :lcc-3166-1/Chile,
   :lcc-lr/hasTag "CL",
   :lcc-lr/identifies :lcc-3166-1/Chile,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CL",
   :skos/definition "Alpha-2 country code for Chile"})

(def CM
  "Alpha-2 country code for Cameroon"
  {:db/ident :lcc-3166-1/CM,
   :lcc-lr/denotes :lcc-3166-1/Cameroon,
   :lcc-lr/hasTag "CM",
   :lcc-lr/identifies :lcc-3166-1/Cameroon,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CM",
   :skos/definition "Alpha-2 country code for Cameroon"})

(def CMR
  "Alpha-3 country code for Cameroon"
  {:db/ident :lcc-3166-1/CMR,
   :lcc-lr/denotes :lcc-3166-1/Cameroon,
   :lcc-lr/hasTag "CMR",
   :lcc-lr/identifies :lcc-3166-1/Cameroon,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CMR",
   :skos/definition "Alpha-3 country code for Cameroon"})

(def CN
  "Alpha-2 country code for China"
  {:db/ident :lcc-3166-1/CN,
   :lcc-lr/denotes :lcc-3166-1/China,
   :lcc-lr/hasTag "CN",
   :lcc-lr/identifies :lcc-3166-1/China,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CN",
   :skos/definition "Alpha-2 country code for China"})

(def CO
  "Alpha-2 country code for Colombia"
  {:db/ident :lcc-3166-1/CO,
   :lcc-lr/denotes :lcc-3166-1/Colombia,
   :lcc-lr/hasTag "CO",
   :lcc-lr/identifies :lcc-3166-1/Colombia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CO",
   :skos/definition "Alpha-2 country code for Colombia"})

(def COD
  "Alpha-3 country code for Congo Democratic Republic Of"
  {:db/ident :lcc-3166-1/COD,
   :lcc-lr/denotes :lcc-3166-1/CongoDemocraticRepublicOf,
   :lcc-lr/hasTag "COD",
   :lcc-lr/identifies :lcc-3166-1/CongoDemocraticRepublicOf,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "COD",
   :skos/definition "Alpha-3 country code for Congo Democratic Republic Of"})

(def COG
  "Alpha-3 country code for Congo (the)"
  {:db/ident :lcc-3166-1/COG,
   :lcc-lr/denotes :lcc-3166-1/Congo,
   :lcc-lr/hasTag "COG",
   :lcc-lr/identifies :lcc-3166-1/Congo,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "COG",
   :skos/definition "Alpha-3 country code for Congo (the)"})

(def COK
  "Alpha-3 country code for Cook Islands (the)"
  {:db/ident :lcc-3166-1/COK,
   :lcc-lr/denotes :lcc-3166-1/CookIslands,
   :lcc-lr/hasTag "COK",
   :lcc-lr/identifies :lcc-3166-1/CookIslands,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "COK",
   :skos/definition "Alpha-3 country code for Cook Islands (the)"})

(def COL
  "Alpha-3 country code for Colombia"
  {:db/ident :lcc-3166-1/COL,
   :lcc-lr/denotes :lcc-3166-1/Colombia,
   :lcc-lr/hasTag "COL",
   :lcc-lr/identifies :lcc-3166-1/Colombia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "COL",
   :skos/definition "Alpha-3 country code for Colombia"})

(def COM
  "Alpha-3 country code for Comoros (the)"
  {:db/ident :lcc-3166-1/COM,
   :lcc-lr/denotes :lcc-3166-1/Comoros,
   :lcc-lr/hasTag "COM",
   :lcc-lr/identifies :lcc-3166-1/Comoros,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "COM",
   :skos/definition "Alpha-3 country code for Comoros (the)"})

(def CPV
  "Alpha-3 country code for Cabo Verde"
  {:db/ident :lcc-3166-1/CPV,
   :lcc-lr/denotes :lcc-3166-1/CaboVerde,
   :lcc-lr/hasTag "CPV",
   :lcc-lr/identifies :lcc-3166-1/CaboVerde,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CPV",
   :skos/definition "Alpha-3 country code for Cabo Verde"})

(def CR
  "Alpha-2 country code for Costa Rica"
  {:db/ident :lcc-3166-1/CR,
   :lcc-lr/denotes :lcc-3166-1/CostaRica,
   :lcc-lr/hasTag "CR",
   :lcc-lr/identifies :lcc-3166-1/CostaRica,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CR",
   :skos/definition "Alpha-2 country code for Costa Rica"})

(def CRI
  "Alpha-3 country code for Costa Rica"
  {:db/ident :lcc-3166-1/CRI,
   :lcc-lr/denotes :lcc-3166-1/CostaRica,
   :lcc-lr/hasTag "CRI",
   :lcc-lr/identifies :lcc-3166-1/CostaRica,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CRI",
   :skos/definition "Alpha-3 country code for Costa Rica"})

(def CU
  "Alpha-2 country code for Cuba"
  {:db/ident :lcc-3166-1/CU,
   :lcc-lr/denotes :lcc-3166-1/Cuba,
   :lcc-lr/hasTag "CU",
   :lcc-lr/identifies :lcc-3166-1/Cuba,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CU",
   :skos/definition "Alpha-2 country code for Cuba"})

(def CUB
  "Alpha-3 country code for Cuba"
  {:db/ident :lcc-3166-1/CUB,
   :lcc-lr/denotes :lcc-3166-1/Cuba,
   :lcc-lr/hasTag "CUB",
   :lcc-lr/identifies :lcc-3166-1/Cuba,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CUB",
   :skos/definition "Alpha-3 country code for Cuba"})

(def CUW
  "Alpha-3 country code for Curaçao"
  {:db/ident :lcc-3166-1/CUW,
   :lcc-lr/denotes :lcc-3166-1/Curacao,
   :lcc-lr/hasTag "CUW",
   :lcc-lr/identifies :lcc-3166-1/Curacao,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CUW",
   :skos/definition "Alpha-3 country code for Curaçao"})

(def CV
  "Alpha-2 country code for Cabo Verde"
  {:db/ident :lcc-3166-1/CV,
   :lcc-lr/denotes :lcc-3166-1/CaboVerde,
   :lcc-lr/hasTag "CV",
   :lcc-lr/identifies :lcc-3166-1/CaboVerde,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CV",
   :skos/definition "Alpha-2 country code for Cabo Verde"})

(def CW
  "Alpha-2 country code for Curaçao"
  {:db/ident :lcc-3166-1/CW,
   :lcc-lr/denotes :lcc-3166-1/Curacao,
   :lcc-lr/hasTag "CW",
   :lcc-lr/identifies :lcc-3166-1/Curacao,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CW",
   :skos/definition "Alpha-2 country code for Curaçao"})

(def CX
  "Alpha-2 country code for Christmas Island"
  {:db/ident :lcc-3166-1/CX,
   :lcc-lr/denotes :lcc-3166-1/ChristmasIsland,
   :lcc-lr/hasTag "CX",
   :lcc-lr/identifies :lcc-3166-1/ChristmasIsland,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CX",
   :skos/definition "Alpha-2 country code for Christmas Island"})

(def CXR
  "Alpha-3 country code for Christmas Island"
  {:db/ident :lcc-3166-1/CXR,
   :lcc-lr/denotes :lcc-3166-1/ChristmasIsland,
   :lcc-lr/hasTag "CXR",
   :lcc-lr/identifies :lcc-3166-1/ChristmasIsland,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CXR",
   :skos/definition "Alpha-3 country code for Christmas Island"})

(def CY
  "Alpha-2 country code for Cyprus"
  {:db/ident :lcc-3166-1/CY,
   :lcc-lr/denotes :lcc-3166-1/Cyprus,
   :lcc-lr/hasTag "CY",
   :lcc-lr/identifies :lcc-3166-1/Cyprus,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CY",
   :skos/definition "Alpha-2 country code for Cyprus"})

(def CYM
  "Alpha-3 country code for Cayman Islands (the)"
  {:db/ident :lcc-3166-1/CYM,
   :lcc-lr/denotes :lcc-3166-1/CaymanIslands,
   :lcc-lr/hasTag "CYM",
   :lcc-lr/identifies :lcc-3166-1/CaymanIslands,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CYM",
   :skos/definition "Alpha-3 country code for Cayman Islands (the)"})

(def CYP
  "Alpha-3 country code for Cyprus"
  {:db/ident :lcc-3166-1/CYP,
   :lcc-lr/denotes :lcc-3166-1/Cyprus,
   :lcc-lr/hasTag "CYP",
   :lcc-lr/identifies :lcc-3166-1/Cyprus,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CYP",
   :skos/definition "Alpha-3 country code for Cyprus"})

(def CZ
  "Alpha-2 country code for Czechia"
  {:db/ident :lcc-3166-1/CZ,
   :lcc-lr/denotes :lcc-3166-1/Czechia,
   :lcc-lr/hasTag "CZ",
   :lcc-lr/identifies :lcc-3166-1/Czechia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CZ",
   :skos/definition "Alpha-2 country code for Czechia"})

(def CZE
  "Alpha-3 country code for Czechia"
  {:db/ident :lcc-3166-1/CZE,
   :lcc-lr/denotes :lcc-3166-1/Czechia,
   :lcc-lr/hasTag "CZE",
   :lcc-lr/identifies :lcc-3166-1/Czechia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "CZE",
   :skos/definition "Alpha-3 country code for Czechia"})

(def CaboVerde
  "the country of Cabo Verde"
  {:db/ident :lcc-3166-1/CaboVerde,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Cabo Verde@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Cabo Verde@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "CABO VERDE@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République du Cabo Verde@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Cabo Verde@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "CABO VERDE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Cabo Verde@pt",
   :lcc-cr/hasNumericRegionCode "132",
   :lcc-cr/hasRemarks "Principal islands: São Tiago, São Vicente.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Portuguese,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Cabo Verde@pt",
   :skos/definition "the country of Cabo Verde"})

(def Cambodia
  "the country of Cambodia"
  {:db/ident :lcc-3166-1/Cambodia,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Kingdom of Cambodia@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Cambodia@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "CAMBODIA@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "le Royaume du Cambodge@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Cambodge (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "CAMBODGE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Kâmpŭchéa@km",
   :lcc-cr/hasNumericRegionCode "116",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/CentralKhmer,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Kâmpŭchéa@km",
   :skos/definition "the country of Cambodia"})

(def Cameroon
  "the country of Cameroon"
  {:db/ident :lcc-3166-1/Cameroon,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Cameroon@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Cameroon@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "CAMEROON@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République du Cameroun@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Cameroun (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "CAMEROUN@fr",
   :lcc-cr/hasNumericRegionCode "120",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/French :lcc-639-1/English],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [#voc/lstr "Cameroon@en" #voc/lstr "Cameroun (le)@fr"],
   :skos/definition "the country of Cameroon"})

(def Canada
  "the country of Canada"
  {:db/ident :lcc-3166-1/Canada,
   :lcc-cr/hasEnglishShortName #voc/lstr "Canada@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "CANADA@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Canada (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "CANADA@fr",
   :lcc-cr/hasNumericRegionCode "124",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/English :lcc-639-1/French],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [#voc/lstr "Canada@en" #voc/lstr "Canada (le)@fr"],
   :skos/definition "the country of Canada"})

(def CaymanIslands
  "the country of Cayman Islands (the)"
  {:db/ident :lcc-3166-1/CaymanIslands,
   :lcc-cr/hasEnglishShortName #voc/lstr "Cayman Islands (the)@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "CAYMAN ISLANDS@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Caïmans (les Îles)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "CAÏMANS, ÎLES@fr",
   :lcc-cr/hasNumericRegionCode "136",
   :lcc-cr/hasRemarks ["No subdivisions relevant for this standard."
                       "Principal island: Grand Cayman."],
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Cayman Islands (the)@en",
   :skos/definition "the country of Cayman Islands (the)"})

(def CentralAfricanRepublic
  "the country of Central African Republic (the)"
  {:db/ident :lcc-3166-1/CentralAfricanRepublic,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Central African Republic@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Central African Republic (the)@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr
                                          "CENTRAL AFRICAN REPUBLIC@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République centrafricaine@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "République centrafricaine (la)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr
                                         "CENTRAFRICAINE, RÉPUBLIQUE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Ködörösêse tî Bêafrîka@sg",
   :lcc-cr/hasNumericRegionCode "140",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/French :lcc-639-1/Sango],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [#voc/lstr "République centrafricaine (la)@fr"
                #voc/lstr "Ködörösêse tî Bêafrîka@sg"],
   :skos/definition "the country of Central African Republic (the)"})

(def Chad
  "the country of Chad"
  {:db/ident :lcc-3166-1/Chad,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Chad@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Chad@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "CHAD@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République du Tchad@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Tchad (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "TCHAD@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Tshād@ar",
   :lcc-cr/hasNumericRegionCode "148",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/Arabic :lcc-639-1/French],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [#voc/lstr "Tchad (le)@fr" #voc/lstr "Tshād@ar"],
   :skos/definition "the country of Chad"})

(def Chile
  "the country of Chile"
  {:db/ident :lcc-3166-1/Chile,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Chile@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Chile@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "CHILE@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République du Chili@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Chili (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "CHILI@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Chile@es",
   :lcc-cr/hasNumericRegionCode "152",
   :lcc-cr/hasRemarks
   "Includes: Easter Island, Juan Fernández Islands, Sala y Gómez Island, San Ambrosio Island, San Félix Island.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Spanish,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Chile@es",
   :skos/definition "the country of Chile"})

(def China
  "the country of China"
  {:db/ident :lcc-3166-1/China,
   :lcc-cr/hasEnglishFullName #voc/lstr "the People's Republic of China@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "China@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "CHINA@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République populaire de Chine@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Chine (la)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "CHINE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Zhongguo@zh",
   :lcc-cr/hasNumericRegionCode "156",
   :lcc-cr/hasRemarks "See also TAIWAN, PROVINCE OF CHINA.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Chinese,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Zhongguo@zh",
   :skos/definition "the country of China"})

(def ChristmasIsland
  "the country of Christmas Island"
  {:db/ident :lcc-3166-1/ChristmasIsland,
   :lcc-cr/hasEnglishShortName #voc/lstr "Christmas Island@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "CHRISTMAS ISLAND@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Christmas (l'Île)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "CHRISTMAS, ÎLE@fr",
   :lcc-cr/hasNumericRegionCode "162",
   :lcc-cr/hasRemarks "No subdivisions relevant for this standard.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Christmas Island@en",
   :skos/definition "the country of Christmas Island"})

(def CocosKeelingIslands
  "the country of Cocos Keeling Islands"
  {:db/ident :lcc-3166-1/CocosKeelingIslands,
   :lcc-cr/hasEnglishShortName #voc/lstr "Cocos (Keeling) Islands (the)@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "COCOS (KEELING) ISLANDS@en",
   :lcc-cr/hasFrenchShortName #voc/lstr
                               "Cocos (les Îles)/ Keeling (les Îles)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "COCOS (KEELING), ÎLES@fr",
   :lcc-cr/hasNumericRegionCode "166",
   :lcc-cr/hasRemarks "No subdivisions relevant for this standard.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Cocos (Keeling) Islands (the)@en",
   :skos/definition "the country of Cocos Keeling Islands"})

(def Colombia
  "the country of Colombia"
  {:db/ident :lcc-3166-1/Colombia,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Colombia@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Colombia@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "COLOMBIA@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République de Colombie@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Colombie (la)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "COLOMBIE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Colombia@es",
   :lcc-cr/hasNumericRegionCode "170",
   :lcc-cr/hasRemarks
   "Includes: Malpelo Island, San Andrés y Providencia Islands.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Spanish,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Colombia@es",
   :skos/definition "the country of Colombia"})

(def Comoros
  "the country of Comoros (the)"
  {:db/ident :lcc-3166-1/Comoros,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Union of the Comoros@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Comoros (the)@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "COMOROS@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "l'Union des Comores@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Comores (les)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "COMORES@fr",
   :lcc-cr/hasLocalShortName ["Komori" #voc/lstr "Al Qamar@ar"],
   :lcc-cr/hasNumericRegionCode "174",
   :lcc-cr/hasRemarks
   ["Comprises: Anjouan, Grande Comore, Mohéli. \nThe language code \"002\" refers to the administrative language \"Shikomor\" that has not been assigned an ISO 639 language code."
    "The language code \"002\" refers to the administrative language \"Shikomor\" that has not been assigned an ISO 639 language code."],
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage
   [:lcc-3166-1/Shikomor :lcc-639-1/French :lcc-639-1/Arabic],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [#voc/lstr "Comores (les)@fr" #voc/lstr "Al Qamar@ar"],
   :skos/definition "the country of Comoros (the)"})

(def Congo
  "the country of Congo (the)"
  {:db/ident :lcc-3166-1/Congo,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of the Congo@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Congo (the)@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "CONGO@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République du Congo@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Congo (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "CONGO@fr",
   :lcc-cr/hasNumericRegionCode "178",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Congo (le)@fr",
   :skos/definition "the country of Congo (the)"})

(def CongoDemocraticRepublicOf
  "the country of Congo Democratic Republic Of"
  {:db/ident :lcc-3166-1/CongoDemocraticRepublicOf,
   :lcc-cr/hasEnglishFullName #voc/lstr
                               "the Democratic Republic of the Congo@en",
   :lcc-cr/hasEnglishShortName #voc/lstr
                                "Congo (the Democratic Republic of the)@en",
   :lcc-cr/hasEnglishShortNameInCapitals
   #voc/lstr "CONGO, DEMOCRATIC REPUBLIC OF THE@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République démocratique du Congo@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr
                               "Congo (la République démocratique du)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr
                                         "CONGO, RÉPUBLIQUE DÉMOCRATIQUE DU@fr",
   :lcc-cr/hasNumericRegionCode "180",
   :lcc-cr/hasRemarks ["Remark: Ex Zaire/Zaïre, change of name 1997-05-17"
                       "Previous entry: ZAIRE."],
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Congo (la République démocratique du)@fr",
   :skos/definition "the country of Congo Democratic Republic Of"})

(def CookIslands
  "the country of Cook Islands (the)"
  {:db/ident :lcc-3166-1/CookIslands,
   :lcc-cr/hasEnglishShortName #voc/lstr "Cook Islands (the)@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "COOK ISLANDS@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Cook (les Îles)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "COOK, ÎLES@fr",
   :lcc-cr/hasNumericRegionCode "184",
   :lcc-cr/hasRemarks ["No subdivisions relevant for this standard."
                       "Principal island: Rarotonga."],
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Cook Islands (the)@en",
   :skos/definition "the country of Cook Islands (the)"})

(def CostaRica
  "the country of Costa Rica"
  {:db/ident :lcc-3166-1/CostaRica,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Costa Rica@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Costa Rica@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "COSTA RICA@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République du Costa Rica@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Costa Rica (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "COSTA RICA@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Costa Rica@es",
   :lcc-cr/hasNumericRegionCode "188",
   :lcc-cr/hasRemarks "Includes: Coco Island.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Spanish,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Costa Rica@es",
   :skos/definition "the country of Costa Rica"})

(def CoteDIvoire
  "the country of Côte d'Ivoire"
  {:db/ident :lcc-3166-1/CoteDIvoire,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Côte d'Ivoire@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Côte d'Ivoire@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "CÔTE D'IVOIRE@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la Republic de Côte d'Ivoire@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Côte d'Ivoire (la)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "CÔTE D'IVOIRE@fr",
   :lcc-cr/hasNumericRegionCode "384",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Côte d'Ivoire (la)@fr",
   :skos/definition "the country of Côte d'Ivoire"})

(def Country
  "the kind of region that is a country"
  {:db/ident :lcc-3166-1/Country,
   :rdf/type [:lcc-cr/GeographicRegionKind :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "Country",
   :skos/definition "the kind of region that is a country"})

(def Croatia
  "the country of Croatia"
  {:db/ident :lcc-3166-1/Croatia,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Croatia@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Croatia@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "CROATIA@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République de Croatie@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Croatie (la)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "CROATIE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Hrvatska@hr",
   :lcc-cr/hasNumericRegionCode "191",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Croatian,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Hrvatska@hr",
   :skos/definition "the country of Croatia"})

(def Cuba
  "the country of Cuba"
  {:db/ident :lcc-3166-1/Cuba,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Cuba@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Cuba@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "CUBA@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République de Cuba@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Cuba@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "CUBA@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Cuba@es",
   :lcc-cr/hasNumericRegionCode "192",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Spanish,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Cuba@es",
   :skos/definition "the country of Cuba"})

(def Curacao
  "the country of Curaçao"
  {:db/ident :lcc-3166-1/Curacao,
   :lcc-cr/hasEnglishShortName #voc/lstr "Curaçao@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "CURAÇAO@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Curaçao@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "CURAÇAO@fr",
   :lcc-cr/hasLocalShortName ["Kòrsou" #voc/lstr "Curaçao@nl"],
   :lcc-cr/hasNumericRegionCode "531",
   :lcc-cr/hasRemarks
   "No subdivisions relevant for this standard. Included also as subdivision of Netherlands (NL-CW).",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage
   [:lcc-639-1/Dutch :lcc-639-2/Papiamento :lcc-639-1/English],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [#voc/lstr "Curaçao@nl" #voc/lstr "Curaçao@en"],
   :skos/definition "the country of Curaçao"})

(def Cyprus
  "the country of Cyprus"
  {:db/ident :lcc-3166-1/Cyprus,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Cyprus@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Cyprus@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "CYPRUS@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République de Chypre@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Chypre@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "CHYPRE@fr",
   :lcc-cr/hasLocalShortName [#voc/lstr "Kýpros@el" #voc/lstr "Kıbrıs@tr"],
   :lcc-cr/hasNumericRegionCode "196",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/ModernGreek
                                       :lcc-639-1/Turkish],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [#voc/lstr "Kýpros@el" #voc/lstr "Kıbrıs@tr"],
   :skos/definition "the country of Cyprus"})

(def CzechRepublic
  "CzechRepublic is supported as legacy identifier for Czechia"
  {:db/ident :lcc-3166-1/CzechRepublic,
   :owl/sameAs :lcc-3166-1/Czechia,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/comment "CzechRepublic is supported as legacy identifier for Czechia",
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"})

(def Czechia
  "the country of Czechia"
  {:db/ident :lcc-3166-1/Czechia,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Czech Republic@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Czechia@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "CZECHIA@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République tchèque@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Tchéquie (la)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "TCHÉQUIE (LA)@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Česko@cs",
   :lcc-cr/hasNumericRegionCode "203",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Czech,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Česko@cs",
   :skos/definition "the country of Czechia"})

(def DE
  "Alpha-2 country code for Germany"
  {:db/ident :lcc-3166-1/DE,
   :lcc-lr/denotes :lcc-3166-1/Germany,
   :lcc-lr/hasTag "DE",
   :lcc-lr/identifies :lcc-3166-1/Germany,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "DE",
   :skos/definition "Alpha-2 country code for Germany"})

(def DEU
  "Alpha-3 country code for Germany"
  {:db/ident :lcc-3166-1/DEU,
   :lcc-lr/denotes :lcc-3166-1/Germany,
   :lcc-lr/hasTag "DEU",
   :lcc-lr/identifies :lcc-3166-1/Germany,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "DEU",
   :skos/definition "Alpha-3 country code for Germany"})

(def DJ
  "Alpha-2 country code for Djibouti"
  {:db/ident :lcc-3166-1/DJ,
   :lcc-lr/denotes :lcc-3166-1/Djibouti,
   :lcc-lr/hasTag "DJ",
   :lcc-lr/identifies :lcc-3166-1/Djibouti,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "DJ",
   :skos/definition "Alpha-2 country code for Djibouti"})

(def DJI
  "Alpha-3 country code for Djibouti"
  {:db/ident :lcc-3166-1/DJI,
   :lcc-lr/denotes :lcc-3166-1/Djibouti,
   :lcc-lr/hasTag "DJI",
   :lcc-lr/identifies :lcc-3166-1/Djibouti,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "DJI",
   :skos/definition "Alpha-3 country code for Djibouti"})

(def DK
  "Alpha-2 country code for Denmark"
  {:db/ident :lcc-3166-1/DK,
   :lcc-lr/denotes :lcc-3166-1/Denmark,
   :lcc-lr/hasTag "DK",
   :lcc-lr/identifies :lcc-3166-1/Denmark,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "DK",
   :skos/definition "Alpha-2 country code for Denmark"})

(def DM
  "Alpha-2 country code for Dominica"
  {:db/ident :lcc-3166-1/DM,
   :lcc-lr/denotes :lcc-3166-1/Dominica,
   :lcc-lr/hasTag "DM",
   :lcc-lr/identifies :lcc-3166-1/Dominica,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "DM",
   :skos/definition "Alpha-2 country code for Dominica"})

(def DMA
  "Alpha-3 country code for Dominica"
  {:db/ident :lcc-3166-1/DMA,
   :lcc-lr/denotes :lcc-3166-1/Dominica,
   :lcc-lr/hasTag "DMA",
   :lcc-lr/identifies :lcc-3166-1/Dominica,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "DMA",
   :skos/definition "Alpha-3 country code for Dominica"})

(def DNK
  "Alpha-3 country code for Denmark"
  {:db/ident :lcc-3166-1/DNK,
   :lcc-lr/denotes :lcc-3166-1/Denmark,
   :lcc-lr/hasTag "DNK",
   :lcc-lr/identifies :lcc-3166-1/Denmark,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "DNK",
   :skos/definition "Alpha-3 country code for Denmark"})

(def DO
  "Alpha-2 country code for Dominican Republic (the)"
  {:db/ident :lcc-3166-1/DO,
   :lcc-lr/denotes :lcc-3166-1/DominicanRepublic,
   :lcc-lr/hasTag "DO",
   :lcc-lr/identifies :lcc-3166-1/DominicanRepublic,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "DO",
   :skos/definition "Alpha-2 country code for Dominican Republic (the)"})

(def DOM
  "Alpha-3 country code for Dominican Republic (the)"
  {:db/ident :lcc-3166-1/DOM,
   :lcc-lr/denotes :lcc-3166-1/DominicanRepublic,
   :lcc-lr/hasTag "DOM",
   :lcc-lr/identifies :lcc-3166-1/DominicanRepublic,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "DOM",
   :skos/definition "Alpha-3 country code for Dominican Republic (the)"})

(def DZ
  "Alpha-2 country code for Algeria"
  {:db/ident :lcc-3166-1/DZ,
   :lcc-lr/denotes :lcc-3166-1/Algeria,
   :lcc-lr/hasTag "DZ",
   :lcc-lr/identifies :lcc-3166-1/Algeria,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "DZ",
   :skos/definition "Alpha-2 country code for Algeria"})

(def DZA
  "Alpha-3 country code for Algeria"
  {:db/ident :lcc-3166-1/DZA,
   :lcc-lr/denotes :lcc-3166-1/Algeria,
   :lcc-lr/hasTag "DZA",
   :lcc-lr/identifies :lcc-3166-1/Algeria,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "DZA",
   :skos/definition "Alpha-3 country code for Algeria"})

(def Denmark
  "the country of Denmark"
  {:db/ident :lcc-3166-1/Denmark,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Kingdom of Denmark@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Denmark@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "DENMARK@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "le Royaume du Danemark@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Danemark (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "DANEMARK@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Danmark@da",
   :lcc-cr/hasNumericRegionCode "208",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Danish,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Danmark@da",
   :skos/definition "the country of Denmark"})

(def Djibouti
  "the country of Djibouti"
  {:db/ident :lcc-3166-1/Djibouti,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Djibouti@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Djibouti@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "DJIBOUTI@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République de Djibouti@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Djibouti@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "DJIBOUTI@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Jībūtī@ar",
   :lcc-cr/hasNumericRegionCode "262",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/Arabic :lcc-639-1/French],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [#voc/lstr "Djibouti@fr" #voc/lstr "Jībūtī@ar"],
   :skos/definition "the country of Djibouti"})

(def Dominica
  "the country of Dominica"
  {:db/ident :lcc-3166-1/Dominica,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Commonwealth of Dominica@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Dominica@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "DOMINICA@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "le Commonwealth de Dominique@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Dominique (la)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "DOMINIQUE@fr",
   :lcc-cr/hasNumericRegionCode "212",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Dominica@en",
   :skos/definition "the country of Dominica"})

(def DominicanRepublic
  "the country of Dominican Republic (the)"
  {:db/ident :lcc-3166-1/DominicanRepublic,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Dominican Republic@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Dominican Republic (the)@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "DOMINICAN REPUBLIC@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République dominicaine@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "dominicaine (la République)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "DOMINICAINE, RÉPUBLIQUE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "República Dominicana (la)@es",
   :lcc-cr/hasNumericRegionCode "214",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Spanish,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "República Dominicana (la)@es",
   :skos/definition "the country of Dominican Republic (the)"})

(def EC
  "Alpha-2 country code for Ecuador"
  {:db/ident :lcc-3166-1/EC,
   :lcc-lr/denotes :lcc-3166-1/Ecuador,
   :lcc-lr/hasTag "EC",
   :lcc-lr/identifies :lcc-3166-1/Ecuador,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "EC",
   :skos/definition "Alpha-2 country code for Ecuador"})

(def ECU
  "Alpha-3 country code for Ecuador"
  {:db/ident :lcc-3166-1/ECU,
   :lcc-lr/denotes :lcc-3166-1/Ecuador,
   :lcc-lr/hasTag "ECU",
   :lcc-lr/identifies :lcc-3166-1/Ecuador,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ECU",
   :skos/definition "Alpha-3 country code for Ecuador"})

(def EE
  "Alpha-2 country code for Estonia"
  {:db/ident :lcc-3166-1/EE,
   :lcc-lr/denotes :lcc-3166-1/Estonia,
   :lcc-lr/hasTag "EE",
   :lcc-lr/identifies :lcc-3166-1/Estonia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "EE",
   :skos/definition "Alpha-2 country code for Estonia"})

(def EG
  "Alpha-2 country code for Egypt"
  {:db/ident :lcc-3166-1/EG,
   :lcc-lr/denotes :lcc-3166-1/Egypt,
   :lcc-lr/hasTag "EG",
   :lcc-lr/identifies :lcc-3166-1/Egypt,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "EG",
   :skos/definition "Alpha-2 country code for Egypt"})

(def EGY
  "Alpha-3 country code for Egypt"
  {:db/ident :lcc-3166-1/EGY,
   :lcc-lr/denotes :lcc-3166-1/Egypt,
   :lcc-lr/hasTag "EGY",
   :lcc-lr/identifies :lcc-3166-1/Egypt,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "EGY",
   :skos/definition "Alpha-3 country code for Egypt"})

(def EH
  "Alpha-2 country code for Western Sahara*"
  {:db/ident :lcc-3166-1/EH,
   :lcc-lr/denotes :lcc-3166-1/WesternSahara,
   :lcc-lr/hasTag "EH",
   :lcc-lr/identifies :lcc-3166-1/WesternSahara,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "EH",
   :skos/definition "Alpha-2 country code for Western Sahara*"})

(def ER
  "Alpha-2 country code for Eritrea"
  {:db/ident :lcc-3166-1/ER,
   :lcc-lr/denotes :lcc-3166-1/Eritrea,
   :lcc-lr/hasTag "ER",
   :lcc-lr/identifies :lcc-3166-1/Eritrea,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ER",
   :skos/definition "Alpha-2 country code for Eritrea"})

(def ERI
  "Alpha-3 country code for Eritrea"
  {:db/ident :lcc-3166-1/ERI,
   :lcc-lr/denotes :lcc-3166-1/Eritrea,
   :lcc-lr/hasTag "ERI",
   :lcc-lr/identifies :lcc-3166-1/Eritrea,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ERI",
   :skos/definition "Alpha-3 country code for Eritrea"})

(def ES
  "Alpha-2 country code for Spain"
  {:db/ident :lcc-3166-1/ES,
   :lcc-lr/denotes :lcc-3166-1/Spain,
   :lcc-lr/hasTag "ES",
   :lcc-lr/identifies :lcc-3166-1/Spain,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ES",
   :skos/definition "Alpha-2 country code for Spain"})

(def ESH
  "Alpha-3 country code for Western Sahara*"
  {:db/ident :lcc-3166-1/ESH,
   :lcc-lr/denotes :lcc-3166-1/WesternSahara,
   :lcc-lr/hasTag "ESH",
   :lcc-lr/identifies :lcc-3166-1/WesternSahara,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ESH",
   :skos/definition "Alpha-3 country code for Western Sahara*"})

(def ESP
  "Alpha-3 country code for Spain"
  {:db/ident :lcc-3166-1/ESP,
   :lcc-lr/denotes :lcc-3166-1/Spain,
   :lcc-lr/hasTag "ESP",
   :lcc-lr/identifies :lcc-3166-1/Spain,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ESP",
   :skos/definition "Alpha-3 country code for Spain"})

(def EST
  "Alpha-3 country code for Estonia"
  {:db/ident :lcc-3166-1/EST,
   :lcc-lr/denotes :lcc-3166-1/Estonia,
   :lcc-lr/hasTag "EST",
   :lcc-lr/identifies :lcc-3166-1/Estonia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "EST",
   :skos/definition "Alpha-3 country code for Estonia"})

(def ET
  "Alpha-2 country code for Ethiopia"
  {:db/ident :lcc-3166-1/ET,
   :lcc-lr/denotes :lcc-3166-1/Ethiopia,
   :lcc-lr/hasTag "ET",
   :lcc-lr/identifies :lcc-3166-1/Ethiopia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ET",
   :skos/definition "Alpha-2 country code for Ethiopia"})

(def ETH
  "Alpha-3 country code for Ethiopia"
  {:db/ident :lcc-3166-1/ETH,
   :lcc-lr/denotes :lcc-3166-1/Ethiopia,
   :lcc-lr/hasTag "ETH",
   :lcc-lr/identifies :lcc-3166-1/Ethiopia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ETH",
   :skos/definition "Alpha-3 country code for Ethiopia"})

(def Ecuador
  "the country of Ecuador"
  {:db/ident :lcc-3166-1/Ecuador,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Ecuador@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Ecuador@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "ECUADOR@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République d'Équateur@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Équateur (l')@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "ÉQUATEUR@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Ecuador (el)@es",
   :lcc-cr/hasNumericRegionCode "218",
   :lcc-cr/hasRemarks "Includes: Galápagos Islands.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Spanish,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Ecuador (el)@es",
   :skos/definition "the country of Ecuador"})

(def Egypt
  "the country of Egypt"
  {:db/ident :lcc-3166-1/Egypt,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Arab Republic of Egypt@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Egypt@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "EGYPT@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République arabe d'Égypte@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Égypte (l')@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "ÉGYPTE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Mişr@ar",
   :lcc-cr/hasNumericRegionCode "818",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Arabic,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Mişr@ar",
   :skos/definition "the country of Egypt"})

(def ElSalvador
  "the country of El Salvador"
  {:db/ident :lcc-3166-1/ElSalvador,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of El Salvador@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "El Salvador@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "EL SALVADOR@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République d'El Salvador@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "El Salvador@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "EL SALVADOR@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "El Salvador@es",
   :lcc-cr/hasNumericRegionCode "222",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Spanish,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "El Salvador@es",
   :skos/definition "the country of El Salvador"})

(def EquatorialGuinea
  "the country of Equatorial Guinea"
  {:db/ident :lcc-3166-1/EquatorialGuinea,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Equatorial Guinea@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Equatorial Guinea@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "EQUATORIAL GUINEA@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République de Guinée équatoriale@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Guinée équatoriale (la)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "GUINÉE ÉQUATORIALE@fr",
   :lcc-cr/hasLocalShortName [#voc/lstr "Guiné Equatorial (a)@pt"
                              #voc/lstr "Guinea Ecuatorial@es"],
   :lcc-cr/hasNumericRegionCode "226",
   :lcc-cr/hasRemarks
   "Comprises: Annobón Island, Bioko Island, the Continental Region (Rio Muni).",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage
   [:lcc-639-1/Spanish :lcc-639-1/Portuguese :lcc-639-1/French],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [#voc/lstr "Guinea Ecuatorial@es"
                #voc/lstr "Guinée équatoriale (la)@fr"
                #voc/lstr "Guiné Equatorial (a)@pt"],
   :skos/definition "the country of Equatorial Guinea"})

(def Eritrea
  "the country of Eritrea"
  {:db/ident :lcc-3166-1/Eritrea,
   :lcc-cr/hasEnglishFullName #voc/lstr "the State of Eritrea@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Eritrea@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "ERITREA@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "l'État d'Érythrée@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Érythrée (l')@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "ÉRYTHRÉE@fr",
   :lcc-cr/hasLocalShortName [#voc/lstr "Irītrīyā@ar" #voc/lstr "Iertra@ti"],
   :lcc-cr/hasNumericRegionCode "232",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage
   [:lcc-639-1/Tigrinya :lcc-639-1/English :lcc-639-1/Arabic],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label
   [#voc/lstr "Iertra@ti" #voc/lstr "Irītrīyā@ar" #voc/lstr "Eritrea@en"],
   :skos/definition "the country of Eritrea"})

(def Estonia
  "the country of Estonia"
  {:db/ident :lcc-3166-1/Estonia,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Estonia@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Estonia@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "ESTONIA@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République d'Estonie@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Estonie (l')@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "ESTONIE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Eesti@et",
   :lcc-cr/hasNumericRegionCode "233",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Estonian,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Eesti@et",
   :skos/definition "the country of Estonia"})

(def Eswatini
  "the country of Eswatini"
  {:db/ident :lcc-3166-1/Eswatini,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Kingdom of Eswatini@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Eswatini@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "ESWATINI@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "le Royaume d’Eswatini@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Eswatini (l')@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "ESWATINI@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "eSwatini@ss",
   :lcc-cr/hasNumericRegionCode "748",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/Swati :lcc-639-1/English],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [#voc/lstr "eSwatini@ss" #voc/lstr "Eswatini@en"],
   :skos/definition "the country of Eswatini"})

(def Ethiopia
  "the country of Ethiopia"
  {:db/ident :lcc-3166-1/Ethiopia,
   :lcc-cr/hasEnglishFullName #voc/lstr
                               "the Federal Democratic Republic of Ethiopia@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Ethiopia@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "ETHIOPIA@en",
   :lcc-cr/hasFrenchFullName
   #voc/lstr "la République fédérale démocratique d'Éthiopie@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Éthiopie (l')@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "ÉTHIOPIE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Ītyop'iya@am",
   :lcc-cr/hasNumericRegionCode "231",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Amharic,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Ītyop'iya@am",
   :skos/definition "the country of Ethiopia"})

(def FI
  "Alpha-2 country code for Finland"
  {:db/ident :lcc-3166-1/FI,
   :lcc-lr/denotes :lcc-3166-1/Finland,
   :lcc-lr/hasTag "FI",
   :lcc-lr/identifies :lcc-3166-1/Finland,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "FI",
   :skos/definition "Alpha-2 country code for Finland"})

(def FIN
  "Alpha-3 country code for Finland"
  {:db/ident :lcc-3166-1/FIN,
   :lcc-lr/denotes :lcc-3166-1/Finland,
   :lcc-lr/hasTag "FIN",
   :lcc-lr/identifies :lcc-3166-1/Finland,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "FIN",
   :skos/definition "Alpha-3 country code for Finland"})

(def FJ
  "Alpha-2 country code for Fiji"
  {:db/ident :lcc-3166-1/FJ,
   :lcc-lr/denotes :lcc-3166-1/Fiji,
   :lcc-lr/hasTag "FJ",
   :lcc-lr/identifies :lcc-3166-1/Fiji,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "FJ",
   :skos/definition "Alpha-2 country code for Fiji"})

(def FJI
  "Alpha-3 country code for Fiji"
  {:db/ident :lcc-3166-1/FJI,
   :lcc-lr/denotes :lcc-3166-1/Fiji,
   :lcc-lr/hasTag "FJI",
   :lcc-lr/identifies :lcc-3166-1/Fiji,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "FJI",
   :skos/definition "Alpha-3 country code for Fiji"})

(def FK
  "Alpha-2 country code for Falkland Islands (the) [Malvinas]"
  {:db/ident :lcc-3166-1/FK,
   :lcc-lr/denotes :lcc-3166-1/FalklandIslands,
   :lcc-lr/hasTag "FK",
   :lcc-lr/identifies :lcc-3166-1/FalklandIslands,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "FK",
   :skos/definition
   "Alpha-2 country code for Falkland Islands (the) [Malvinas]"})

(def FLK
  "Alpha-3 country code for Falkland Islands (the) [Malvinas]"
  {:db/ident :lcc-3166-1/FLK,
   :lcc-lr/denotes :lcc-3166-1/FalklandIslands,
   :lcc-lr/hasTag "FLK",
   :lcc-lr/identifies :lcc-3166-1/FalklandIslands,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "FLK",
   :skos/definition
   "Alpha-3 country code for Falkland Islands (the) [Malvinas]"})

(def FM
  "Alpha-2 country code for Micronesia (Federated States of)"
  {:db/ident :lcc-3166-1/FM,
   :lcc-lr/denotes :lcc-3166-1/Micronesia,
   :lcc-lr/hasTag "FM",
   :lcc-lr/identifies :lcc-3166-1/Micronesia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "FM",
   :skos/definition
   "Alpha-2 country code for Micronesia (Federated States of)"})

(def FO
  "Alpha-2 country code for Faroe Islands (the)"
  {:db/ident :lcc-3166-1/FO,
   :lcc-lr/denotes :lcc-3166-1/FaroeIslands,
   :lcc-lr/hasTag "FO",
   :lcc-lr/identifies :lcc-3166-1/FaroeIslands,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "FO",
   :skos/definition "Alpha-2 country code for Faroe Islands (the)"})

(def FR
  "Alpha-2 country code for France"
  {:db/ident :lcc-3166-1/FR,
   :lcc-lr/denotes :lcc-3166-1/France,
   :lcc-lr/hasTag "FR",
   :lcc-lr/identifies :lcc-3166-1/France,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "FR",
   :skos/definition "Alpha-2 country code for France"})

(def FRA
  "Alpha-3 country code for France"
  {:db/ident :lcc-3166-1/FRA,
   :lcc-lr/denotes :lcc-3166-1/France,
   :lcc-lr/hasTag "FRA",
   :lcc-lr/identifies :lcc-3166-1/France,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "FRA",
   :skos/definition "Alpha-3 country code for France"})

(def FRO
  "Alpha-3 country code for Faroe Islands (the)"
  {:db/ident :lcc-3166-1/FRO,
   :lcc-lr/denotes :lcc-3166-1/FaroeIslands,
   :lcc-lr/hasTag "FRO",
   :lcc-lr/identifies :lcc-3166-1/FaroeIslands,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "FRO",
   :skos/definition "Alpha-3 country code for Faroe Islands (the)"})

(def FSM
  "Alpha-3 country code for Micronesia (Federated States of)"
  {:db/ident :lcc-3166-1/FSM,
   :lcc-lr/denotes :lcc-3166-1/Micronesia,
   :lcc-lr/hasTag "FSM",
   :lcc-lr/identifies :lcc-3166-1/Micronesia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "FSM",
   :skos/definition
   "Alpha-3 country code for Micronesia (Federated States of)"})

(def FalklandIslands
  "the country of Falkland Islands (the) [Malvinas]"
  {:db/ident :lcc-3166-1/FalklandIslands,
   :lcc-cr/hasEnglishShortName #voc/lstr "Falkland Islands (the) [Malvinas]@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr
                                          "FALKLAND ISLANDS (MALVINAS)@en",
   :lcc-cr/hasFrenchShortName #voc/lstr
                               "Falkland (les Îles)/Malouines (les Îles)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr
                                         "FALKLAND, ÎLES (MALVINAS)@fr",
   :lcc-cr/hasNumericRegionCode "238",
   :lcc-cr/hasRemarks "No subdivisions relevant for this standard.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Falkland Islands (the) [Malvinas]@en",
   :skos/definition "the country of Falkland Islands (the) [Malvinas]"})

(def FaroeIslands
  "the country of Faroe Islands (the)"
  {:db/ident :lcc-3166-1/FaroeIslands,
   :lcc-cr/hasEnglishShortName #voc/lstr "Faroe Islands (the)@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "FAROE ISLANDS@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Féroé (les Îles)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "FÉROÉ, ÎLES@fr",
   :lcc-cr/hasLocalShortName [#voc/lstr "Føroyar@fo" #voc/lstr "Færøerne@da"],
   :lcc-cr/hasNumericRegionCode "234",
   :lcc-cr/hasRemarks "No subdivisions relevant for this standard.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/Faroese :lcc-639-1/Danish],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [#voc/lstr "Føroyar@fo" #voc/lstr "Færøerne@da"],
   :skos/definition "the country of Faroe Islands (the)"})

(def Fiji
  "the country of Fiji"
  {:db/ident :lcc-3166-1/Fiji,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Fiji@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Fiji@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "FIJI@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République des Fidji@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Fidji (les)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "FIDJI@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Viti@fj",
   :lcc-cr/hasNumericRegionCode "242",
   :lcc-cr/hasRemarks
   "Principal islands: Vanua Levu, Viti Levu. Includes Rotuma Island.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/English :lcc-639-1/Fijian],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [#voc/lstr "Viti@fj" #voc/lstr "Fiji@en"],
   :skos/definition "the country of Fiji"})

(def Finland
  "the country of Finland"
  {:db/ident :lcc-3166-1/Finland,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Finland@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Finland@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "FINLAND@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République de Finlande@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Finlande (la)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "FINLANDE@fr",
   :lcc-cr/hasLocalShortName [#voc/lstr "Finland@sv" #voc/lstr "Suomi@fi"],
   :lcc-cr/hasNumericRegionCode "246",
   :lcc-cr/hasRemarks "Includes: Åland Islands.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/Finnish :lcc-639-1/Swedish],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [#voc/lstr "Suomi@fi" #voc/lstr "Finland@sv"],
   :skos/definition "the country of Finland"})

(def France
  "the country of France"
  {:db/ident :lcc-3166-1/France,
   :lcc-cr/hasEnglishFullName #voc/lstr "the French Republic@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "France@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "FRANCE@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République française@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "France (la)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "FRANCE@fr",
   :lcc-cr/hasNumericRegionCode "250",
   :lcc-cr/hasRemarks
   "Comprises: Metropolitan France, French Guiana, Guadeloupe, Martinique, La Réunion, Mayotte, Saint Barthélemy, Saint Martin, Saint Pierre and Miquelon, French Polynesia, French Southern Territories, New Caledonia, Wallis and Futuna.  Includes: Clipperton Island.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "France (la)@fr",
   :skos/definition "the country of France"})

(def FrenchGuiana
  "the country of French Guiana"
  {:db/ident :lcc-3166-1/FrenchGuiana,
   :lcc-cr/hasEnglishShortName #voc/lstr "French Guiana@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "FRENCH GUIANA@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Guyane française (la )@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "GUYANE FRANÇAISE@fr",
   :lcc-cr/hasNumericRegionCode "254",
   :lcc-cr/hasRemarks
   "No subdivisions relevant for this standard. Included also as subdivision of France (FR-GF).",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Guyane française (la )@fr",
   :skos/definition "the country of French Guiana"})

(def FrenchPolynesia
  "the country of French Polynesia"
  {:db/ident :lcc-3166-1/FrenchPolynesia,
   :lcc-cr/hasEnglishShortName #voc/lstr "French Polynesia@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "FRENCH POLYNESIA@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Polynésie française (la)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "POLYNÉSIE FRANÇAISE@fr",
   :lcc-cr/hasNumericRegionCode "258",
   :lcc-cr/hasRemarks
   ["Comprises: Austral Islands, Gambier Islands, Marquesas Islands, Society Archipelago (Principal island: Tahiti), Tuamotu Islands."
    "No subdivisions relevant for this standard. Included also as a subdivision of France (FR-PF)."],
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Polynésie française (la)@fr",
   :skos/definition "the country of French Polynesia"})

(def FrenchSouthernTerritories
  "the country of French Southern Territories (the)"
  {:db/ident :lcc-3166-1/FrenchSouthernTerritories,
   :lcc-cr/hasEnglishShortName #voc/lstr "French Southern Territories (the)@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr
                                          "FRENCH SOUTHERN TERRITORIES@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Terres australes françaises (les)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr
                                         "TERRES AUSTRALES FRANÇAISES@fr",
   :lcc-cr/hasNumericRegionCode "260",
   :lcc-cr/hasRemarks
   ["No subdivisions relevant for this standard. Included also as subdivision of France (FR-TF)."
    "Comprises: Amsterdam Island, Crozet Archipelago, Kerguelen Islands, Saint Paul Island and French scattered Indian Ocean Islands formed by Bassas da India, Europa Island, Glorioso Islands, Juan de Nova Island and Tromelin Island."],
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Terres australes françaises (les)@fr",
   :skos/definition "the country of French Southern Territories (the)"})

(def GA
  "Alpha-2 country code for Gabon"
  {:db/ident :lcc-3166-1/GA,
   :lcc-lr/denotes :lcc-3166-1/Gabon,
   :lcc-lr/hasTag "GA",
   :lcc-lr/identifies :lcc-3166-1/Gabon,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GA",
   :skos/definition "Alpha-2 country code for Gabon"})

(def GAB
  "Alpha-3 country code for Gabon"
  {:db/ident :lcc-3166-1/GAB,
   :lcc-lr/denotes :lcc-3166-1/Gabon,
   :lcc-lr/hasTag "GAB",
   :lcc-lr/identifies :lcc-3166-1/Gabon,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GAB",
   :skos/definition "Alpha-3 country code for Gabon"})

(def GB
  "Alpha-2 country code for United Kingdom of Great Britain and Northern Ireland (the)"
  {:db/ident :lcc-3166-1/GB,
   :lcc-lr/denotes :lcc-3166-1/UnitedKingdomOfGreatBritainAndNorthernIreland,
   :lcc-lr/hasTag "GB",
   :lcc-lr/identifies :lcc-3166-1/UnitedKingdomOfGreatBritainAndNorthernIreland,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GB",
   :skos/definition
   "Alpha-2 country code for United Kingdom of Great Britain and Northern Ireland (the)"})

(def GBR
  "Alpha-3 country code for United Kingdom of Great Britain and Northern Ireland (the)"
  {:db/ident :lcc-3166-1/GBR,
   :lcc-lr/denotes :lcc-3166-1/UnitedKingdomOfGreatBritainAndNorthernIreland,
   :lcc-lr/hasTag "GBR",
   :lcc-lr/identifies :lcc-3166-1/UnitedKingdomOfGreatBritainAndNorthernIreland,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GBR",
   :skos/definition
   "Alpha-3 country code for United Kingdom of Great Britain and Northern Ireland (the)"})

(def GD
  "Alpha-2 country code for Grenada"
  {:db/ident :lcc-3166-1/GD,
   :lcc-lr/denotes :lcc-3166-1/Grenada,
   :lcc-lr/hasTag "GD",
   :lcc-lr/identifies :lcc-3166-1/Grenada,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GD",
   :skos/definition "Alpha-2 country code for Grenada"})

(def GE
  "Alpha-2 country code for Georgia"
  {:db/ident :lcc-3166-1/GE,
   :lcc-lr/denotes :lcc-3166-1/Georgia,
   :lcc-lr/hasTag "GE",
   :lcc-lr/identifies :lcc-3166-1/Georgia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GE",
   :skos/definition "Alpha-2 country code for Georgia"})

(def GEO
  "Alpha-3 country code for Georgia"
  {:db/ident :lcc-3166-1/GEO,
   :lcc-lr/denotes :lcc-3166-1/Georgia,
   :lcc-lr/hasTag "GEO",
   :lcc-lr/identifies :lcc-3166-1/Georgia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GEO",
   :skos/definition "Alpha-3 country code for Georgia"})

(def GF
  "Alpha-2 country code for French Guiana"
  {:db/ident :lcc-3166-1/GF,
   :lcc-lr/denotes :lcc-3166-1/FrenchGuiana,
   :lcc-lr/hasTag "GF",
   :lcc-lr/identifies :lcc-3166-1/FrenchGuiana,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GF",
   :skos/definition "Alpha-2 country code for French Guiana"})

(def GG
  "Alpha-2 country code for Guernsey"
  {:db/ident :lcc-3166-1/GG,
   :lcc-lr/denotes :lcc-3166-1/Guernsey,
   :lcc-lr/hasTag "GG",
   :lcc-lr/identifies :lcc-3166-1/Guernsey,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GG",
   :skos/definition "Alpha-2 country code for Guernsey"})

(def GGY
  "Alpha-3 country code for Guernsey"
  {:db/ident :lcc-3166-1/GGY,
   :lcc-lr/denotes :lcc-3166-1/Guernsey,
   :lcc-lr/hasTag "GGY",
   :lcc-lr/identifies :lcc-3166-1/Guernsey,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GGY",
   :skos/definition "Alpha-3 country code for Guernsey"})

(def GH
  "Alpha-2 country code for Ghana"
  {:db/ident :lcc-3166-1/GH,
   :lcc-lr/denotes :lcc-3166-1/Ghana,
   :lcc-lr/hasTag "GH",
   :lcc-lr/identifies :lcc-3166-1/Ghana,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GH",
   :skos/definition "Alpha-2 country code for Ghana"})

(def GHA
  "Alpha-3 country code for Ghana"
  {:db/ident :lcc-3166-1/GHA,
   :lcc-lr/denotes :lcc-3166-1/Ghana,
   :lcc-lr/hasTag "GHA",
   :lcc-lr/identifies :lcc-3166-1/Ghana,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GHA",
   :skos/definition "Alpha-3 country code for Ghana"})

(def GI
  "Alpha-2 country code for Gibraltar"
  {:db/ident :lcc-3166-1/GI,
   :lcc-lr/denotes :lcc-3166-1/Gibraltar,
   :lcc-lr/hasTag "GI",
   :lcc-lr/identifies :lcc-3166-1/Gibraltar,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GI",
   :skos/definition "Alpha-2 country code for Gibraltar"})

(def GIB
  "Alpha-3 country code for Gibraltar"
  {:db/ident :lcc-3166-1/GIB,
   :lcc-lr/denotes :lcc-3166-1/Gibraltar,
   :lcc-lr/hasTag "GIB",
   :lcc-lr/identifies :lcc-3166-1/Gibraltar,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GIB",
   :skos/definition "Alpha-3 country code for Gibraltar"})

(def GIN
  "Alpha-3 country code for Guinea"
  {:db/ident :lcc-3166-1/GIN,
   :lcc-lr/denotes :lcc-3166-1/Guinea,
   :lcc-lr/hasTag "GIN",
   :lcc-lr/identifies :lcc-3166-1/Guinea,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GIN",
   :skos/definition "Alpha-3 country code for Guinea"})

(def GL
  "Alpha-2 country code for Greenland"
  {:db/ident :lcc-3166-1/GL,
   :lcc-lr/denotes :lcc-3166-1/Greenland,
   :lcc-lr/hasTag "GL",
   :lcc-lr/identifies :lcc-3166-1/Greenland,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GL",
   :skos/definition "Alpha-2 country code for Greenland"})

(def GLP
  "Alpha-3 country code for Guadeloupe"
  {:db/ident :lcc-3166-1/GLP,
   :lcc-lr/denotes :lcc-3166-1/Guadeloupe,
   :lcc-lr/hasTag "GLP",
   :lcc-lr/identifies :lcc-3166-1/Guadeloupe,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GLP",
   :skos/definition "Alpha-3 country code for Guadeloupe"})

(def GM
  "Alpha-2 country code for Gambia (the)"
  {:db/ident :lcc-3166-1/GM,
   :lcc-lr/denotes :lcc-3166-1/Gambia,
   :lcc-lr/hasTag "GM",
   :lcc-lr/identifies :lcc-3166-1/Gambia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GM",
   :skos/definition "Alpha-2 country code for Gambia (the)"})

(def GMB
  "Alpha-3 country code for Gambia (the)"
  {:db/ident :lcc-3166-1/GMB,
   :lcc-lr/denotes :lcc-3166-1/Gambia,
   :lcc-lr/hasTag "GMB",
   :lcc-lr/identifies :lcc-3166-1/Gambia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GMB",
   :skos/definition "Alpha-3 country code for Gambia (the)"})

(def GN
  "Alpha-2 country code for Guinea"
  {:db/ident :lcc-3166-1/GN,
   :lcc-lr/denotes :lcc-3166-1/Guinea,
   :lcc-lr/hasTag "GN",
   :lcc-lr/identifies :lcc-3166-1/Guinea,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GN",
   :skos/definition "Alpha-2 country code for Guinea"})

(def GNB
  "Alpha-3 country code for Guinea-Bissau"
  {:db/ident :lcc-3166-1/GNB,
   :lcc-lr/denotes :lcc-3166-1/Guinea-Bissau,
   :lcc-lr/hasTag "GNB",
   :lcc-lr/identifies :lcc-3166-1/Guinea-Bissau,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GNB",
   :skos/definition "Alpha-3 country code for Guinea-Bissau"})

(def GNQ
  "Alpha-3 country code for Equatorial Guinea"
  {:db/ident :lcc-3166-1/GNQ,
   :lcc-lr/denotes :lcc-3166-1/EquatorialGuinea,
   :lcc-lr/hasTag "GNQ",
   :lcc-lr/identifies :lcc-3166-1/EquatorialGuinea,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GNQ",
   :skos/definition "Alpha-3 country code for Equatorial Guinea"})

(def GP
  "Alpha-2 country code for Guadeloupe"
  {:db/ident :lcc-3166-1/GP,
   :lcc-lr/denotes :lcc-3166-1/Guadeloupe,
   :lcc-lr/hasTag "GP",
   :lcc-lr/identifies :lcc-3166-1/Guadeloupe,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GP",
   :skos/definition "Alpha-2 country code for Guadeloupe"})

(def GQ
  "Alpha-2 country code for Equatorial Guinea"
  {:db/ident :lcc-3166-1/GQ,
   :lcc-lr/denotes :lcc-3166-1/EquatorialGuinea,
   :lcc-lr/hasTag "GQ",
   :lcc-lr/identifies :lcc-3166-1/EquatorialGuinea,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GQ",
   :skos/definition "Alpha-2 country code for Equatorial Guinea"})

(def GR
  "Alpha-2 country code for Greece"
  {:db/ident :lcc-3166-1/GR,
   :lcc-lr/denotes :lcc-3166-1/Greece,
   :lcc-lr/hasTag "GR",
   :lcc-lr/identifies :lcc-3166-1/Greece,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GR",
   :skos/definition "Alpha-2 country code for Greece"})

(def GRC
  "Alpha-3 country code for Greece"
  {:db/ident :lcc-3166-1/GRC,
   :lcc-lr/denotes :lcc-3166-1/Greece,
   :lcc-lr/hasTag "GRC",
   :lcc-lr/identifies :lcc-3166-1/Greece,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GRC",
   :skos/definition "Alpha-3 country code for Greece"})

(def GRD
  "Alpha-3 country code for Grenada"
  {:db/ident :lcc-3166-1/GRD,
   :lcc-lr/denotes :lcc-3166-1/Grenada,
   :lcc-lr/hasTag "GRD",
   :lcc-lr/identifies :lcc-3166-1/Grenada,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GRD",
   :skos/definition "Alpha-3 country code for Grenada"})

(def GRL
  "Alpha-3 country code for Greenland"
  {:db/ident :lcc-3166-1/GRL,
   :lcc-lr/denotes :lcc-3166-1/Greenland,
   :lcc-lr/hasTag "GRL",
   :lcc-lr/identifies :lcc-3166-1/Greenland,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GRL",
   :skos/definition "Alpha-3 country code for Greenland"})

(def GS
  "Alpha-2 country code for South Georgia and the South Sandwich Islands"
  {:db/ident :lcc-3166-1/GS,
   :lcc-lr/denotes :lcc-3166-1/SouthGeorgiaAndTheSouthSandwichIslands,
   :lcc-lr/hasTag "GS",
   :lcc-lr/identifies :lcc-3166-1/SouthGeorgiaAndTheSouthSandwichIslands,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GS",
   :skos/definition
   "Alpha-2 country code for South Georgia and the South Sandwich Islands"})

(def GT
  "Alpha-2 country code for Guatemala"
  {:db/ident :lcc-3166-1/GT,
   :lcc-lr/denotes :lcc-3166-1/Guatemala,
   :lcc-lr/hasTag "GT",
   :lcc-lr/identifies :lcc-3166-1/Guatemala,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GT",
   :skos/definition "Alpha-2 country code for Guatemala"})

(def GTM
  "Alpha-3 country code for Guatemala"
  {:db/ident :lcc-3166-1/GTM,
   :lcc-lr/denotes :lcc-3166-1/Guatemala,
   :lcc-lr/hasTag "GTM",
   :lcc-lr/identifies :lcc-3166-1/Guatemala,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GTM",
   :skos/definition "Alpha-3 country code for Guatemala"})

(def GU
  "Alpha-2 country code for Guam"
  {:db/ident :lcc-3166-1/GU,
   :lcc-lr/denotes :lcc-3166-1/Guam,
   :lcc-lr/hasTag "GU",
   :lcc-lr/identifies :lcc-3166-1/Guam,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GU",
   :skos/definition "Alpha-2 country code for Guam"})

(def GUF
  "Alpha-3 country code for French Guiana"
  {:db/ident :lcc-3166-1/GUF,
   :lcc-lr/denotes :lcc-3166-1/FrenchGuiana,
   :lcc-lr/hasTag "GUF",
   :lcc-lr/identifies :lcc-3166-1/FrenchGuiana,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GUF",
   :skos/definition "Alpha-3 country code for French Guiana"})

(def GUM
  "Alpha-3 country code for Guam"
  {:db/ident :lcc-3166-1/GUM,
   :lcc-lr/denotes :lcc-3166-1/Guam,
   :lcc-lr/hasTag "GUM",
   :lcc-lr/identifies :lcc-3166-1/Guam,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GUM",
   :skos/definition "Alpha-3 country code for Guam"})

(def GUY
  "Alpha-3 country code for Guyana"
  {:db/ident :lcc-3166-1/GUY,
   :lcc-lr/denotes :lcc-3166-1/Guyana,
   :lcc-lr/hasTag "GUY",
   :lcc-lr/identifies :lcc-3166-1/Guyana,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GUY",
   :skos/definition "Alpha-3 country code for Guyana"})

(def GW
  "Alpha-2 country code for Guinea-Bissau"
  {:db/ident :lcc-3166-1/GW,
   :lcc-lr/denotes :lcc-3166-1/Guinea-Bissau,
   :lcc-lr/hasTag "GW",
   :lcc-lr/identifies :lcc-3166-1/Guinea-Bissau,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GW",
   :skos/definition "Alpha-2 country code for Guinea-Bissau"})

(def GY
  "Alpha-2 country code for Guyana"
  {:db/ident :lcc-3166-1/GY,
   :lcc-lr/denotes :lcc-3166-1/Guyana,
   :lcc-lr/hasTag "GY",
   :lcc-lr/identifies :lcc-3166-1/Guyana,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "GY",
   :skos/definition "Alpha-2 country code for Guyana"})

(def Gabon
  "the country of Gabon"
  {:db/ident :lcc-3166-1/Gabon,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Gabonese Republic@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Gabon@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "GABON@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République gabonaise@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Gabon (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "GABON@fr",
   :lcc-cr/hasNumericRegionCode "266",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Gabon (le)@fr",
   :skos/definition "the country of Gabon"})

(def Gambia
  "the country of Gambia (the)"
  {:db/ident :lcc-3166-1/Gambia,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of the Gambia@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Gambia (the)@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "GAMBIA@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République de Gambie@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Gambie (la)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "GAMBIE@fr",
   :lcc-cr/hasNumericRegionCode "270",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Gambia (the)@en",
   :skos/definition "the country of Gambia (the)"})

(def Georgia
  "the country of Georgia"
  {:db/ident :lcc-3166-1/Georgia,
   :lcc-cr/hasEnglishShortName #voc/lstr "Georgia@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "GEORGIA@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Géorgie (la)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "GÉORGIE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Sakartvelo@ka",
   :lcc-cr/hasNumericRegionCode "268",
   :lcc-cr/hasRemarks
   "The code GE was formerly used for the Gilbert and Ellice Islands (GE, GEL, --) and has been reused and reassigned to Georgia. See also code element GEKI.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Georgian,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Sakartvelo@ka",
   :skos/definition "the country of Georgia"})

(def Germany
  "the country of Germany"
  {:db/ident :lcc-3166-1/Germany,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Federal Republic of Germany@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Germany@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "GERMANY@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République fédérale d'Allemagne@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Allemagne (l')@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "ALLEMAGNE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Deutschland@de",
   :lcc-cr/hasNumericRegionCode "276",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/German,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Deutschland@de",
   :skos/definition "the country of Germany"})

(def Ghana
  "the country of Ghana"
  {:db/ident :lcc-3166-1/Ghana,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Ghana@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Ghana@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "GHANA@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République du Ghana@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Ghana (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "GHANA@fr",
   :lcc-cr/hasNumericRegionCode "288",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Ghana@en",
   :skos/definition "the country of Ghana"})

(def Gibraltar
  "the country of Gibraltar"
  {:db/ident :lcc-3166-1/Gibraltar,
   :lcc-cr/hasEnglishShortName #voc/lstr "Gibraltar@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "GIBRALTAR@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Gibraltar@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "GIBRALTAR@fr",
   :lcc-cr/hasNumericRegionCode "292",
   :lcc-cr/hasRemarks "No subdivisions relevant for this standard.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Gibraltar@en",
   :skos/definition "the country of Gibraltar"})

(def Greece
  "the country of Greece"
  {:db/ident :lcc-3166-1/Greece,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Hellenic Republic@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Greece@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "GREECE@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République hellénique@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Grèce (la)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "GRÈCE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Elláda@el",
   :lcc-cr/hasNumericRegionCode "300",
   :lcc-cr/hasRemarks "Includes: Mount Athos autonomous area.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/ModernGreek,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Elláda@el",
   :skos/definition "the country of Greece"})

(def Greenland
  "the country of Greenland"
  {:db/ident :lcc-3166-1/Greenland,
   :lcc-cr/hasEnglishShortName #voc/lstr "Greenland@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "GREENLAND@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Groenland (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "GROENLAND@fr",
   :lcc-cr/hasLocalShortName [#voc/lstr "Grønland@da"
                              #voc/lstr "Kalaallit Nunaat@kl"],
   :lcc-cr/hasNumericRegionCode "304",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/Danish
                                       :lcc-639-1/Kalaallisut],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [#voc/lstr "Kalaallit Nunaat@kl" #voc/lstr "Grønland@da"],
   :skos/definition "the country of Greenland"})

(def Grenada
  "the country of Grenada"
  {:db/ident :lcc-3166-1/Grenada,
   :lcc-cr/hasEnglishShortName #voc/lstr "Grenada@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "GRENADA@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Grenade (la)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "GRENADE@fr",
   :lcc-cr/hasNumericRegionCode "308",
   :lcc-cr/hasRemarks
   "Includes: Southern Grenadine Islands (Principal island: Carriacou).",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Grenada@en",
   :skos/definition "the country of Grenada"})

(def Guadeloupe
  "the country of Guadeloupe"
  {:db/ident :lcc-3166-1/Guadeloupe,
   :lcc-cr/hasEnglishShortName #voc/lstr "Guadeloupe@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "GUADELOUPE@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Guadeloupe (la)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "GUADELOUPE@fr",
   :lcc-cr/hasNumericRegionCode "312",
   :lcc-cr/hasRemarks
   ["No subdivisions relevant for this standard. Included also as subdivision of France (FR-GP)."
    "Includes: la Désirade, Marie-Galante, les Saintes."],
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Guadeloupe (la)@fr",
   :skos/definition "the country of Guadeloupe"})

(def Guam
  "the country of Guam"
  {:db/ident :lcc-3166-1/Guam,
   :lcc-cr/hasEnglishShortName #voc/lstr "Guam@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "GUAM@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Guam@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "GUAM@fr",
   :lcc-cr/hasNumericRegionCode "316",
   :lcc-cr/hasRemarks
   "No subdivisions relevant for this standard. Included also as subdivision of the United States (US-GU).",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Guam@en",
   :skos/definition "the country of Guam"})

(def Guatemala
  "the country of Guatemala"
  {:db/ident :lcc-3166-1/Guatemala,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Guatemala@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Guatemala@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "GUATEMALA@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République du Guatemala@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Guatemala (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "GUATEMALA@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Guatemala@es",
   :lcc-cr/hasNumericRegionCode "320",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Spanish,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Guatemala@es",
   :skos/definition "the country of Guatemala"})

(def Guernsey
  "the country of Guernsey"
  {:db/ident :lcc-3166-1/Guernsey,
   :lcc-cr/hasEnglishShortName #voc/lstr "Guernsey@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "GUERNSEY@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Guernesey@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "GUERNESEY@fr",
   :lcc-cr/hasNumericRegionCode "831",
   :lcc-cr/hasRemarks
   ["No subdivisions relevant for this standard."
    "The Bailiwick of Guernsey also includes the islands of Alderney, Brecqhou, Burhou, Herm, Jethou, Lihou, Little Sark, and Sark."],
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/French :lcc-639-1/English],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [#voc/lstr "Guernsey@en" #voc/lstr "Guernesey@fr"],
   :skos/definition "the country of Guernsey"})

(def Guinea
  "the country of Guinea"
  {:db/ident :lcc-3166-1/Guinea,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Guinea@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Guinea@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "GUINEA@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République de Guinée@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Guinée (la)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "GUINÉE@fr",
   :lcc-cr/hasNumericRegionCode "324",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Guinée (la)@fr",
   :skos/definition "the country of Guinea"})

(def Guinea-Bissau
  "the country of Guinea-Bissau"
  {:db/ident :lcc-3166-1/Guinea-Bissau,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Guinea-Bissau@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Guinea-Bissau@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "GUINEA-BISSAU@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République de Guinée-Bissau@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Guinée-Bissau (la)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "GUINÉE-BISSAU@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Guiné-Bissau (a)@pt",
   :lcc-cr/hasNumericRegionCode "624",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Portuguese,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Guiné-Bissau (a)@pt",
   :skos/definition "the country of Guinea-Bissau"})

(def Guyana
  "the country of Guyana"
  {:db/ident :lcc-3166-1/Guyana,
   :lcc-cr/hasEnglishFullName #voc/lstr
                               "the Co-operative Republic of Guyana@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Guyana@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "GUYANA@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République coopérative du Guyana@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Guyana (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "GUYANA@fr",
   :lcc-cr/hasNumericRegionCode "328",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Guyana@en",
   :skos/definition "the country of Guyana"})

(def HK
  "Alpha-2 country code for Hong Kong"
  {:db/ident :lcc-3166-1/HK,
   :lcc-lr/denotes :lcc-3166-1/HongKong,
   :lcc-lr/hasTag "HK",
   :lcc-lr/identifies :lcc-3166-1/HongKong,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "HK",
   :skos/definition "Alpha-2 country code for Hong Kong"})

(def HKG
  "Alpha-3 country code for Hong Kong"
  {:db/ident :lcc-3166-1/HKG,
   :lcc-lr/denotes :lcc-3166-1/HongKong,
   :lcc-lr/hasTag "HKG",
   :lcc-lr/identifies :lcc-3166-1/HongKong,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "HKG",
   :skos/definition "Alpha-3 country code for Hong Kong"})

(def HM
  "Alpha-2 country code for Heard Island and McDonald Islands"
  {:db/ident :lcc-3166-1/HM,
   :lcc-lr/denotes :lcc-3166-1/HeardIslandAndMcDonaldIslands,
   :lcc-lr/hasTag "HM",
   :lcc-lr/identifies :lcc-3166-1/HeardIslandAndMcDonaldIslands,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "HM",
   :skos/definition
   "Alpha-2 country code for Heard Island and McDonald Islands"})

(def HMD
  "Alpha-3 country code for Heard Island and McDonald Islands"
  {:db/ident :lcc-3166-1/HMD,
   :lcc-lr/denotes :lcc-3166-1/HeardIslandAndMcDonaldIslands,
   :lcc-lr/hasTag "HMD",
   :lcc-lr/identifies :lcc-3166-1/HeardIslandAndMcDonaldIslands,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "HMD",
   :skos/definition
   "Alpha-3 country code for Heard Island and McDonald Islands"})

(def HN
  "Alpha-2 country code for Honduras"
  {:db/ident :lcc-3166-1/HN,
   :lcc-lr/denotes :lcc-3166-1/Honduras,
   :lcc-lr/hasTag "HN",
   :lcc-lr/identifies :lcc-3166-1/Honduras,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "HN",
   :skos/definition "Alpha-2 country code for Honduras"})

(def HND
  "Alpha-3 country code for Honduras"
  {:db/ident :lcc-3166-1/HND,
   :lcc-lr/denotes :lcc-3166-1/Honduras,
   :lcc-lr/hasTag "HND",
   :lcc-lr/identifies :lcc-3166-1/Honduras,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "HND",
   :skos/definition "Alpha-3 country code for Honduras"})

(def HR
  "Alpha-2 country code for Croatia"
  {:db/ident :lcc-3166-1/HR,
   :lcc-lr/denotes :lcc-3166-1/Croatia,
   :lcc-lr/hasTag "HR",
   :lcc-lr/identifies :lcc-3166-1/Croatia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "HR",
   :skos/definition "Alpha-2 country code for Croatia"})

(def HRV
  "Alpha-3 country code for Croatia"
  {:db/ident :lcc-3166-1/HRV,
   :lcc-lr/denotes :lcc-3166-1/Croatia,
   :lcc-lr/hasTag "HRV",
   :lcc-lr/identifies :lcc-3166-1/Croatia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "HRV",
   :skos/definition "Alpha-3 country code for Croatia"})

(def HT
  "Alpha-2 country code for Haiti"
  {:db/ident :lcc-3166-1/HT,
   :lcc-lr/denotes :lcc-3166-1/Haiti,
   :lcc-lr/hasTag "HT",
   :lcc-lr/identifies :lcc-3166-1/Haiti,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "HT",
   :skos/definition "Alpha-2 country code for Haiti"})

(def HTI
  "Alpha-3 country code for Haiti"
  {:db/ident :lcc-3166-1/HTI,
   :lcc-lr/denotes :lcc-3166-1/Haiti,
   :lcc-lr/hasTag "HTI",
   :lcc-lr/identifies :lcc-3166-1/Haiti,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "HTI",
   :skos/definition "Alpha-3 country code for Haiti"})

(def HU
  "Alpha-2 country code for Hungary"
  {:db/ident :lcc-3166-1/HU,
   :lcc-lr/denotes :lcc-3166-1/Hungary,
   :lcc-lr/hasTag "HU",
   :lcc-lr/identifies :lcc-3166-1/Hungary,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "HU",
   :skos/definition "Alpha-2 country code for Hungary"})

(def HUN
  "Alpha-3 country code for Hungary"
  {:db/ident :lcc-3166-1/HUN,
   :lcc-lr/denotes :lcc-3166-1/Hungary,
   :lcc-lr/hasTag "HUN",
   :lcc-lr/identifies :lcc-3166-1/Hungary,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "HUN",
   :skos/definition "Alpha-3 country code for Hungary"})

(def Haiti
  "the country of Haiti"
  {:db/ident :lcc-3166-1/Haiti,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Haiti@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Haiti@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "HAITI@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République d'Haïti@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Haïti@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "HAÏTI@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Ayiti@ht",
   :lcc-cr/hasNumericRegionCode "332",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/Haitian :lcc-639-1/French],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [#voc/lstr "Ayiti@ht" #voc/lstr "Haïti@fr"],
   :skos/definition "the country of Haiti"})

(def HeardIslandAndMcDonaldIslands
  "the country of Heard Island and McDonald Islands"
  {:db/ident :lcc-3166-1/HeardIslandAndMcDonaldIslands,
   :lcc-cr/hasEnglishShortName #voc/lstr "Heard Island and McDonald Islands@en",
   :lcc-cr/hasEnglishShortNameInCapitals
   #voc/lstr "HEARD ISLAND AND MCDONALD ISLANDS@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "ll'Île Heard-et-Îles MacDonald@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Heard-et-Îles MacDonald (l'Île)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr
                                         "HEARD-ET-ÎLES MACDONALD, ÎLE@fr",
   :lcc-cr/hasNumericRegionCode "334",
   :lcc-cr/hasRemarks "No subdivisions relevant for this standard.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Heard Island and McDonald Islands@en",
   :skos/definition "the country of Heard Island and McDonald Islands"})

(def HolySee
  "the country of Holy See (the)"
  {:db/ident :lcc-3166-1/HolySee,
   :lcc-cr/hasEnglishShortName #voc/lstr "Holy See (the)@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "HOLY SEE@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Saint-Siège (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "SAINT-SIÈGE@fr",
   :lcc-cr/hasLocalShortName [#voc/lstr "Santa Sede (la)@it"
                              #voc/lstr "Sancta Sedes@la"],
   :lcc-cr/hasNumericRegionCode "336",
   :lcc-cr/hasRemarks ["Previous entry: VATICAN CITY STATE (HOLY SEE)."
                       "No subdivisions relevant for this standard."],
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/Latin :lcc-639-1/Italian],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [#voc/lstr "Sancta Sedes@la" #voc/lstr "Santa Sede (la)@it"],
   :skos/definition "the country of Holy See (the)"})

(def Honduras
  "the country of Honduras"
  {:db/ident :lcc-3166-1/Honduras,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Honduras@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Honduras@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "HONDURAS@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République du Honduras@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Honduras (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "HONDURAS@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Honduras@es",
   :lcc-cr/hasNumericRegionCode "340",
   :lcc-cr/hasRemarks "Includes: Swan Islands.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Spanish,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Honduras@es",
   :skos/definition "the country of Honduras"})

(def HongKong
  "the country of Hong Kong"
  {:db/ident :lcc-3166-1/HongKong,
   :lcc-cr/hasEnglishFullName
   #voc/lstr "the Hong Kong Special Administrative Region of China@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Hong Kong@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "HONG KONG@en",
   :lcc-cr/hasFrenchFullName
   #voc/lstr "Hong Kong, Région administrative spéciale de Chine (la)@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Hong Kong@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "HONG KONG@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Xianggang@zh",
   :lcc-cr/hasNumericRegionCode "344",
   :lcc-cr/hasRemarks
   "No subdivisions relevant for this standard. Included also as subdivision of China (CN-HK).",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/English :lcc-639-1/Chinese],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [#voc/lstr "Xianggang@zh" #voc/lstr "Hong Kong@en"],
   :skos/definition "the country of Hong Kong"})

(def Hungary
  "the country of Hungary"
  {:db/ident :lcc-3166-1/Hungary,
   :lcc-cr/hasEnglishShortName #voc/lstr "Hungary@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "HUNGARY@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Hongrie (la)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "HONGRIE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Magyarország@hu",
   :lcc-cr/hasNumericRegionCode "348",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Hungarian,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Magyarország@hu",
   :skos/definition "the country of Hungary"})

(def ID
  "Alpha-2 country code for Indonesia"
  {:db/ident :lcc-3166-1/ID,
   :lcc-lr/denotes :lcc-3166-1/Indonesia,
   :lcc-lr/hasTag "ID",
   :lcc-lr/identifies :lcc-3166-1/Indonesia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ID",
   :skos/definition "Alpha-2 country code for Indonesia"})

(def IDN
  "Alpha-3 country code for Indonesia"
  {:db/ident :lcc-3166-1/IDN,
   :lcc-lr/denotes :lcc-3166-1/Indonesia,
   :lcc-lr/hasTag "IDN",
   :lcc-lr/identifies :lcc-3166-1/Indonesia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "IDN",
   :skos/definition "Alpha-3 country code for Indonesia"})

(def IE
  "Alpha-2 country code for Ireland"
  {:db/ident :lcc-3166-1/IE,
   :lcc-lr/denotes :lcc-3166-1/Ireland,
   :lcc-lr/hasTag "IE",
   :lcc-lr/identifies :lcc-3166-1/Ireland,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "IE",
   :skos/definition "Alpha-2 country code for Ireland"})

(def IL
  "Alpha-2 country code for Israel"
  {:db/ident :lcc-3166-1/IL,
   :lcc-lr/denotes :lcc-3166-1/Israel,
   :lcc-lr/hasTag "IL",
   :lcc-lr/identifies :lcc-3166-1/Israel,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "IL",
   :skos/definition "Alpha-2 country code for Israel"})

(def IM
  "Alpha-2 country code for Isle of Man"
  {:db/ident :lcc-3166-1/IM,
   :lcc-lr/denotes :lcc-3166-1/IsleOfMan,
   :lcc-lr/hasTag "IM",
   :lcc-lr/identifies :lcc-3166-1/IsleOfMan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "IM",
   :skos/definition "Alpha-2 country code for Isle of Man"})

(def IMN
  "Alpha-3 country code for Isle of Man"
  {:db/ident :lcc-3166-1/IMN,
   :lcc-lr/denotes :lcc-3166-1/IsleOfMan,
   :lcc-lr/hasTag "IMN",
   :lcc-lr/identifies :lcc-3166-1/IsleOfMan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "IMN",
   :skos/definition "Alpha-3 country code for Isle of Man"})

(def IN
  "Alpha-2 country code for India"
  {:db/ident :lcc-3166-1/IN,
   :lcc-lr/denotes :lcc-3166-1/India,
   :lcc-lr/hasTag "IN",
   :lcc-lr/identifies :lcc-3166-1/India,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "IN",
   :skos/definition "Alpha-2 country code for India"})

(def IND
  "Alpha-3 country code for India"
  {:db/ident :lcc-3166-1/IND,
   :lcc-lr/denotes :lcc-3166-1/India,
   :lcc-lr/hasTag "IND",
   :lcc-lr/identifies :lcc-3166-1/India,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "IND",
   :skos/definition "Alpha-3 country code for India"})

(def IO
  "Alpha-2 country code for British Indian Ocean Territory (the)"
  {:db/ident :lcc-3166-1/IO,
   :lcc-lr/denotes :lcc-3166-1/BritishIndianOceanTerritory,
   :lcc-lr/hasTag "IO",
   :lcc-lr/identifies :lcc-3166-1/BritishIndianOceanTerritory,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "IO",
   :skos/definition
   "Alpha-2 country code for British Indian Ocean Territory (the)"})

(def IOT
  "Alpha-3 country code for British Indian Ocean Territory (the)"
  {:db/ident :lcc-3166-1/IOT,
   :lcc-lr/denotes :lcc-3166-1/BritishIndianOceanTerritory,
   :lcc-lr/hasTag "IOT",
   :lcc-lr/identifies :lcc-3166-1/BritishIndianOceanTerritory,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "IOT",
   :skos/definition
   "Alpha-3 country code for British Indian Ocean Territory (the)"})

(def IQ
  "Alpha-2 country code for Iraq"
  {:db/ident :lcc-3166-1/IQ,
   :lcc-lr/denotes :lcc-3166-1/Iraq,
   :lcc-lr/hasTag "IQ",
   :lcc-lr/identifies :lcc-3166-1/Iraq,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "IQ",
   :skos/definition "Alpha-2 country code for Iraq"})

(def IR
  "Alpha-2 country code for Iran (Islamic Republic of)"
  {:db/ident :lcc-3166-1/IR,
   :lcc-lr/denotes :lcc-3166-1/Iran,
   :lcc-lr/hasTag "IR",
   :lcc-lr/identifies :lcc-3166-1/Iran,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "IR",
   :skos/definition "Alpha-2 country code for Iran (Islamic Republic of)"})

(def IRL
  "Alpha-3 country code for Ireland"
  {:db/ident :lcc-3166-1/IRL,
   :lcc-lr/denotes :lcc-3166-1/Ireland,
   :lcc-lr/hasTag "IRL",
   :lcc-lr/identifies :lcc-3166-1/Ireland,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "IRL",
   :skos/definition "Alpha-3 country code for Ireland"})

(def IRN
  "Alpha-3 country code for Iran (Islamic Republic of)"
  {:db/ident :lcc-3166-1/IRN,
   :lcc-lr/denotes :lcc-3166-1/Iran,
   :lcc-lr/hasTag "IRN",
   :lcc-lr/identifies :lcc-3166-1/Iran,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "IRN",
   :skos/definition "Alpha-3 country code for Iran (Islamic Republic of)"})

(def IRQ
  "Alpha-3 country code for Iraq"
  {:db/ident :lcc-3166-1/IRQ,
   :lcc-lr/denotes :lcc-3166-1/Iraq,
   :lcc-lr/hasTag "IRQ",
   :lcc-lr/identifies :lcc-3166-1/Iraq,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "IRQ",
   :skos/definition "Alpha-3 country code for Iraq"})

(def IS
  "Alpha-2 country code for Iceland"
  {:db/ident :lcc-3166-1/IS,
   :lcc-lr/denotes :lcc-3166-1/Iceland,
   :lcc-lr/hasTag "IS",
   :lcc-lr/identifies :lcc-3166-1/Iceland,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "IS",
   :skos/definition "Alpha-2 country code for Iceland"})

(def ISL
  "Alpha-3 country code for Iceland"
  {:db/ident :lcc-3166-1/ISL,
   :lcc-lr/denotes :lcc-3166-1/Iceland,
   :lcc-lr/hasTag "ISL",
   :lcc-lr/identifies :lcc-3166-1/Iceland,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ISL",
   :skos/definition "Alpha-3 country code for Iceland"})

(def ISO3166-1-Alpha2-CodeSet
  "the set of country identifiers that comprise the 2 character codes in the ISO 3166-1 specification"
  {:db/ident :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type
   [:lcc-lr/IdentificationScheme :lcc-lr/CodeSet :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ISO 3166-1 code set",
   :skos/definition
   "the set of country identifiers that comprise the 2 character codes in the ISO 3166-1 specification"})

(def ISO3166-1-Alpha3-CodeSet
  "the set of country identifiers that comprise the 3 character codes in the ISO 3166-1 specification"
  {:db/ident :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type
   [:lcc-lr/IdentificationScheme :lcc-lr/CodeSet :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ISO 3166-1 code set",
   :skos/definition
   "the set of country identifiers that comprise the 3 character codes in the ISO 3166-1 specification"})

(def ISO639-3-CodeSet
  "the set of language identifiers that comprise the ISO 639-3 specification"
  {:db/ident :lcc-3166-1/ISO639-3-CodeSet,
   :rdf/type
   [:lcc-lr/IdentificationScheme :lcc-lr/CodeSet :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ISO 639-3 code set",
   :rdfs/seeAlso ["https://iso639-3.sil.org/code_tables/639/data/"],
   :skos/definition
   "the set of language identifiers that comprise the ISO 639-3 specification"})

(def ISR
  "Alpha-3 country code for Israel"
  {:db/ident :lcc-3166-1/ISR,
   :lcc-lr/denotes :lcc-3166-1/Israel,
   :lcc-lr/hasTag "ISR",
   :lcc-lr/identifies :lcc-3166-1/Israel,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ISR",
   :skos/definition "Alpha-3 country code for Israel"})

(def IT
  "Alpha-2 country code for Italy"
  {:db/ident :lcc-3166-1/IT,
   :lcc-lr/denotes :lcc-3166-1/Italy,
   :lcc-lr/hasTag "IT",
   :lcc-lr/identifies :lcc-3166-1/Italy,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "IT",
   :skos/definition "Alpha-2 country code for Italy"})

(def ITA
  "Alpha-3 country code for Italy"
  {:db/ident :lcc-3166-1/ITA,
   :lcc-lr/denotes :lcc-3166-1/Italy,
   :lcc-lr/hasTag "ITA",
   :lcc-lr/identifies :lcc-3166-1/Italy,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ITA",
   :skos/definition "Alpha-3 country code for Italy"})

(def Iceland
  "the country of Iceland"
  {:db/ident :lcc-3166-1/Iceland,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Iceland@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Iceland@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "ICELAND@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République d'Islande@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Islande (l')@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "ISLANDE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Ísland@is",
   :lcc-cr/hasNumericRegionCode "352",
   :lcc-cr/hasRemarks
   "Remark: The Icelandic characters ð (eze) and þ (thorn) may be written as “dh” and “th”.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Icelandic,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Ísland@is",
   :skos/definition "the country of Iceland"})

(def India
  "the country of India"
  {:db/ident :lcc-3166-1/India,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of India@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "India@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "INDIA@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République de l'Inde@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Inde (l')@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "INDE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Bhārat@hi",
   :lcc-cr/hasNumericRegionCode "356",
   :lcc-cr/hasRemarks
   ["Remark: the forms used in the list are English-language forms provided by India."
    "Includes: Amindivi Islands, Andaman Islands, Laccadive Islands, Minicoy Island, Nicobar Islands."],
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/Hindi :lcc-639-1/English],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [#voc/lstr "Bhārat@hi" #voc/lstr "India@en"],
   :skos/definition "the country of India"})

(def Indonesia
  "the country of Indonesia"
  {:db/ident :lcc-3166-1/Indonesia,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Indonesia@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Indonesia@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "INDONESIA@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République d'Indonésie@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Indonésie (l')@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "INDONÉSIE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Indonesia@id",
   :lcc-cr/hasNumericRegionCode "360",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Indonesian,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Indonesia@id",
   :skos/definition "the country of Indonesia"})

(def Iran
  "the country of Iran (Islamic Republic of)"
  {:db/ident :lcc-3166-1/Iran,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Islamic Republic of Iran@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Iran (Islamic Republic of)@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr
                                          "IRAN (ISLAMIC REPUBLIC OF)@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République islamique d'Iran@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Iran (République Islamique d')@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr
                                         "IRAN (RÉPUBLIQUE ISLAMIQUE D')@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Jomhūrī-ye Eslāmī-ye Īrān@fa",
   :lcc-cr/hasNumericRegionCode "364",
   :lcc-cr/hasRemarks "Also referred to as Iran.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Persian,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Jomhūrī-ye Eslāmī-ye Īrān@fa",
   :skos/definition "the country of Iran (Islamic Republic of)"})

(def Iraq
  "the country of Iraq"
  {:db/ident :lcc-3166-1/Iraq,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Iraq@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Iraq@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "IRAQ@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République d'Iraq@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Iraq (l')@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "IRAQ@fr",
   :lcc-cr/hasLocalShortName [#voc/lstr "‘Êraq@ku" #voc/lstr "Al ‘Irāq@ar"],
   :lcc-cr/hasNumericRegionCode "368",
   :lcc-cr/hasRemarks
   "Kurdish and Arabic are both official languages according to the Iraqi constitution, which states “The federal and official institutions and agencies in the Kurdistan region shall use both languages.”",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/Arabic :lcc-639-1/Kurdish],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [#voc/lstr "‘Êraq@ku" #voc/lstr "Al ‘Irāq@ar"],
   :skos/definition "the country of Iraq"})

(def Ireland
  "the country of Ireland"
  {:db/ident :lcc-3166-1/Ireland,
   :lcc-cr/hasEnglishShortName #voc/lstr "Ireland@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "IRELAND@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Irlande (l')@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "IRLANDE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Éire@ga",
   :lcc-cr/hasNumericRegionCode "372",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/English :lcc-639-1/Irish],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [#voc/lstr "Éire@ga" #voc/lstr "Ireland@en"],
   :skos/definition "the country of Ireland"})

(def IsleOfMan
  "the country of Isle of Man"
  {:db/ident :lcc-3166-1/IsleOfMan,
   :lcc-cr/hasEnglishShortName #voc/lstr "Isle of Man@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "ISLE OF MAN@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Île de Man@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "ÎLE DE MAN@fr",
   :lcc-cr/hasNumericRegionCode "833",
   :lcc-cr/hasRemarks "No subdivisions relevant for this standard.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Isle of Man@en",
   :skos/definition "the country of Isle of Man"})

(def Israel
  "the country of Israel"
  {:db/ident :lcc-3166-1/Israel,
   :lcc-cr/hasEnglishFullName #voc/lstr "the State of Israel@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Israel@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "ISRAEL@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "l'État d'Israël@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Israël@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "ISRAËL@fr",
   :lcc-cr/hasLocalShortName [#voc/lstr "Yisra'el@he" #voc/lstr "Isrā'īl@ar"],
   :lcc-cr/hasNumericRegionCode "376",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/Hebrew :lcc-639-1/Arabic],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [#voc/lstr "Isrā'īl@ar" #voc/lstr "Yisra'el@he"],
   :skos/definition "the country of Israel"})

(def Italy
  "the country of Italy"
  {:db/ident :lcc-3166-1/Italy,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Italy@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Italy@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "ITALY@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République italienne@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Italie (l')@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "ITALIE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Italia (l')@it",
   :lcc-cr/hasNumericRegionCode "380",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Italian,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Italia (l')@it",
   :skos/definition "the country of Italy"})

(def JAM
  "Alpha-3 country code for Jamaica"
  {:db/ident :lcc-3166-1/JAM,
   :lcc-lr/denotes :lcc-3166-1/Jamaica,
   :lcc-lr/hasTag "JAM",
   :lcc-lr/identifies :lcc-3166-1/Jamaica,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "JAM",
   :skos/definition "Alpha-3 country code for Jamaica"})

(def JE
  "Alpha-2 country code for Jersey"
  {:db/ident :lcc-3166-1/JE,
   :lcc-lr/denotes :lcc-3166-1/Jersey,
   :lcc-lr/hasTag "JE",
   :lcc-lr/identifies :lcc-3166-1/Jersey,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "JE",
   :skos/definition "Alpha-2 country code for Jersey"})

(def JEY
  "Alpha-3 country code for Jersey"
  {:db/ident :lcc-3166-1/JEY,
   :lcc-lr/denotes :lcc-3166-1/Jersey,
   :lcc-lr/hasTag "JEY",
   :lcc-lr/identifies :lcc-3166-1/Jersey,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "JEY",
   :skos/definition "Alpha-3 country code for Jersey"})

(def JM
  "Alpha-2 country code for Jamaica"
  {:db/ident :lcc-3166-1/JM,
   :lcc-lr/denotes :lcc-3166-1/Jamaica,
   :lcc-lr/hasTag "JM",
   :lcc-lr/identifies :lcc-3166-1/Jamaica,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "JM",
   :skos/definition "Alpha-2 country code for Jamaica"})

(def JO
  "Alpha-2 country code for Jordan"
  {:db/ident :lcc-3166-1/JO,
   :lcc-lr/denotes :lcc-3166-1/Jordan,
   :lcc-lr/hasTag "JO",
   :lcc-lr/identifies :lcc-3166-1/Jordan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "JO",
   :skos/definition "Alpha-2 country code for Jordan"})

(def JOR
  "Alpha-3 country code for Jordan"
  {:db/ident :lcc-3166-1/JOR,
   :lcc-lr/denotes :lcc-3166-1/Jordan,
   :lcc-lr/hasTag "JOR",
   :lcc-lr/identifies :lcc-3166-1/Jordan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "JOR",
   :skos/definition "Alpha-3 country code for Jordan"})

(def JP
  "Alpha-2 country code for Japan"
  {:db/ident :lcc-3166-1/JP,
   :lcc-lr/denotes :lcc-3166-1/Japan,
   :lcc-lr/hasTag "JP",
   :lcc-lr/identifies :lcc-3166-1/Japan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "JP",
   :skos/definition "Alpha-2 country code for Japan"})

(def JPN
  "Alpha-3 country code for Japan"
  {:db/ident :lcc-3166-1/JPN,
   :lcc-lr/denotes :lcc-3166-1/Japan,
   :lcc-lr/hasTag "JPN",
   :lcc-lr/identifies :lcc-3166-1/Japan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "JPN",
   :skos/definition "Alpha-3 country code for Japan"})

(def Jamaica
  "the country of Jamaica"
  {:db/ident :lcc-3166-1/Jamaica,
   :lcc-cr/hasEnglishShortName #voc/lstr "Jamaica@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "JAMAICA@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Jamaïque (la)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "JAMAÏQUE@fr",
   :lcc-cr/hasNumericRegionCode "388",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Jamaica@en",
   :skos/definition "the country of Jamaica"})

(def Japan
  "the country of Japan"
  {:db/ident :lcc-3166-1/Japan,
   :lcc-cr/hasEnglishShortName #voc/lstr "Japan@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "JAPAN@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Japon (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "JAPON@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Nihon/Nippon@ja",
   :lcc-cr/hasNumericRegionCode "392",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Japanese,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Nihon/Nippon@ja",
   :skos/definition "the country of Japan"})

(def Jersey
  "the country of Jersey"
  {:db/ident :lcc-3166-1/Jersey,
   :lcc-cr/hasEnglishShortName #voc/lstr "Jersey@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "JERSEY@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Jersey@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "JERSEY@fr",
   :lcc-cr/hasNumericRegionCode "832",
   :lcc-cr/hasRemarks "No subdivisions relevant for this standard.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/French :lcc-639-1/English],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [#voc/lstr "Jersey@fr" #voc/lstr "Jersey@en"],
   :skos/definition "the country of Jersey"})

(def Jordan
  "the country of Jordan"
  {:db/ident :lcc-3166-1/Jordan,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Hashemite Kingdom of Jordan@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Jordan@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "JORDAN@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "le Royaume hachémite de Jordanie@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Jordanie (la)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "JORDANIE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Al Urdun@ar",
   :lcc-cr/hasNumericRegionCode "400",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Arabic,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Al Urdun@ar",
   :skos/definition "the country of Jordan"})

(def KAZ
  "Alpha-3 country code for Kazakhstan"
  {:db/ident :lcc-3166-1/KAZ,
   :lcc-lr/denotes :lcc-3166-1/Kazakhstan,
   :lcc-lr/hasTag "KAZ",
   :lcc-lr/identifies :lcc-3166-1/Kazakhstan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "KAZ",
   :skos/definition "Alpha-3 country code for Kazakhstan"})

(def KE
  "Alpha-2 country code for Kenya"
  {:db/ident :lcc-3166-1/KE,
   :lcc-lr/denotes :lcc-3166-1/Kenya,
   :lcc-lr/hasTag "KE",
   :lcc-lr/identifies :lcc-3166-1/Kenya,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "KE",
   :skos/definition "Alpha-2 country code for Kenya"})

(def KEN
  "Alpha-3 country code for Kenya"
  {:db/ident :lcc-3166-1/KEN,
   :lcc-lr/denotes :lcc-3166-1/Kenya,
   :lcc-lr/hasTag "KEN",
   :lcc-lr/identifies :lcc-3166-1/Kenya,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "KEN",
   :skos/definition "Alpha-3 country code for Kenya"})

(def KG
  "Alpha-2 country code for Kyrgyzstan"
  {:db/ident :lcc-3166-1/KG,
   :lcc-lr/denotes :lcc-3166-1/Kyrgyzstan,
   :lcc-lr/hasTag "KG",
   :lcc-lr/identifies :lcc-3166-1/Kyrgyzstan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "KG",
   :skos/definition "Alpha-2 country code for Kyrgyzstan"})

(def KGZ
  "Alpha-3 country code for Kyrgyzstan"
  {:db/ident :lcc-3166-1/KGZ,
   :lcc-lr/denotes :lcc-3166-1/Kyrgyzstan,
   :lcc-lr/hasTag "KGZ",
   :lcc-lr/identifies :lcc-3166-1/Kyrgyzstan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "KGZ",
   :skos/definition "Alpha-3 country code for Kyrgyzstan"})

(def KH
  "Alpha-2 country code for Cambodia"
  {:db/ident :lcc-3166-1/KH,
   :lcc-lr/denotes :lcc-3166-1/Cambodia,
   :lcc-lr/hasTag "KH",
   :lcc-lr/identifies :lcc-3166-1/Cambodia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "KH",
   :skos/definition "Alpha-2 country code for Cambodia"})

(def KHM
  "Alpha-3 country code for Cambodia"
  {:db/ident :lcc-3166-1/KHM,
   :lcc-lr/denotes :lcc-3166-1/Cambodia,
   :lcc-lr/hasTag "KHM",
   :lcc-lr/identifies :lcc-3166-1/Cambodia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "KHM",
   :skos/definition "Alpha-3 country code for Cambodia"})

(def KI
  "Alpha-2 country code for Kiribati"
  {:db/ident :lcc-3166-1/KI,
   :lcc-lr/denotes :lcc-3166-1/Kiribati,
   :lcc-lr/hasTag "KI",
   :lcc-lr/identifies :lcc-3166-1/Kiribati,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "KI",
   :skos/definition "Alpha-2 country code for Kiribati"})

(def KIR
  "Alpha-3 country code for Kiribati"
  {:db/ident :lcc-3166-1/KIR,
   :lcc-lr/denotes :lcc-3166-1/Kiribati,
   :lcc-lr/hasTag "KIR",
   :lcc-lr/identifies :lcc-3166-1/Kiribati,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "KIR",
   :skos/definition "Alpha-3 country code for Kiribati"})

(def KM
  "Alpha-2 country code for Comoros (the)"
  {:db/ident :lcc-3166-1/KM,
   :lcc-lr/denotes :lcc-3166-1/Comoros,
   :lcc-lr/hasTag "KM",
   :lcc-lr/identifies :lcc-3166-1/Comoros,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "KM",
   :skos/definition "Alpha-2 country code for Comoros (the)"})

(def KN
  "Alpha-2 country code for Saint Kitts and Nevis"
  {:db/ident :lcc-3166-1/KN,
   :lcc-lr/denotes :lcc-3166-1/SaintKittsAndNevis,
   :lcc-lr/hasTag "KN",
   :lcc-lr/identifies :lcc-3166-1/SaintKittsAndNevis,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "KN",
   :skos/definition "Alpha-2 country code for Saint Kitts and Nevis"})

(def KNA
  "Alpha-3 country code for Saint Kitts and Nevis"
  {:db/ident :lcc-3166-1/KNA,
   :lcc-lr/denotes :lcc-3166-1/SaintKittsAndNevis,
   :lcc-lr/hasTag "KNA",
   :lcc-lr/identifies :lcc-3166-1/SaintKittsAndNevis,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "KNA",
   :skos/definition "Alpha-3 country code for Saint Kitts and Nevis"})

(def KOR
  "Alpha-3 country code for Korea Republic Of"
  {:db/ident :lcc-3166-1/KOR,
   :lcc-lr/denotes :lcc-3166-1/KoreaRepublicOf,
   :lcc-lr/hasTag "KOR",
   :lcc-lr/identifies :lcc-3166-1/KoreaRepublicOf,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "KOR",
   :skos/definition "Alpha-3 country code for Korea Republic Of"})

(def KP
  "Alpha-2 country code for Korea Democratic Peoples Republic Of"
  {:db/ident :lcc-3166-1/KP,
   :lcc-lr/denotes :lcc-3166-1/KoreaDemocraticPeoplesRepublicOf,
   :lcc-lr/hasTag "KP",
   :lcc-lr/identifies :lcc-3166-1/KoreaDemocraticPeoplesRepublicOf,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "KP",
   :skos/definition
   "Alpha-2 country code for Korea Democratic Peoples Republic Of"})

(def KR
  "Alpha-2 country code for Korea Republic Of"
  {:db/ident :lcc-3166-1/KR,
   :lcc-lr/denotes :lcc-3166-1/KoreaRepublicOf,
   :lcc-lr/hasTag "KR",
   :lcc-lr/identifies :lcc-3166-1/KoreaRepublicOf,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "KR",
   :skos/definition "Alpha-2 country code for Korea Republic Of"})

(def KW
  "Alpha-2 country code for Kuwait"
  {:db/ident :lcc-3166-1/KW,
   :lcc-lr/denotes :lcc-3166-1/Kuwait,
   :lcc-lr/hasTag "KW",
   :lcc-lr/identifies :lcc-3166-1/Kuwait,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "KW",
   :skos/definition "Alpha-2 country code for Kuwait"})

(def KWT
  "Alpha-3 country code for Kuwait"
  {:db/ident :lcc-3166-1/KWT,
   :lcc-lr/denotes :lcc-3166-1/Kuwait,
   :lcc-lr/hasTag "KWT",
   :lcc-lr/identifies :lcc-3166-1/Kuwait,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "KWT",
   :skos/definition "Alpha-3 country code for Kuwait"})

(def KY
  "Alpha-2 country code for Cayman Islands (the)"
  {:db/ident :lcc-3166-1/KY,
   :lcc-lr/denotes :lcc-3166-1/CaymanIslands,
   :lcc-lr/hasTag "KY",
   :lcc-lr/identifies :lcc-3166-1/CaymanIslands,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "KY",
   :skos/definition "Alpha-2 country code for Cayman Islands (the)"})

(def KZ
  "Alpha-2 country code for Kazakhstan"
  {:db/ident :lcc-3166-1/KZ,
   :lcc-lr/denotes :lcc-3166-1/Kazakhstan,
   :lcc-lr/hasTag "KZ",
   :lcc-lr/identifies :lcc-3166-1/Kazakhstan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "KZ",
   :skos/definition "Alpha-2 country code for Kazakhstan"})

(def Kazakhstan
  "the country of Kazakhstan"
  {:db/ident :lcc-3166-1/Kazakhstan,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Kazakhstan@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Kazakhstan@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "KAZAKHSTAN@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République du Kazakhstan@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Kazakhstan (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "KAZAKHSTAN@fr",
   :lcc-cr/hasLocalShortName [#voc/lstr "Qazaqstan@kk"
                              #voc/lstr "Kazahstan@ru"],
   :lcc-cr/hasNumericRegionCode "398",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/Kazakh :lcc-639-1/Russian],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [#voc/lstr "Qazaqstan@kk" #voc/lstr "Kazahstan@ru"],
   :skos/definition "the country of Kazakhstan"})

(def Kenya
  "the country of Kenya"
  {:db/ident :lcc-3166-1/Kenya,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Kenya@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Kenya@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "KENYA@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République du Kenya@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Kenya (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "KENYA@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Kenya@sw",
   :lcc-cr/hasNumericRegionCode "404",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/English :lcc-639-1/Swahili],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [#voc/lstr "Kenya@en" #voc/lstr "Kenya@sw"],
   :skos/definition "the country of Kenya"})

(def Kiribati
  "the country of Kiribati"
  {:db/ident :lcc-3166-1/Kiribati,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Kiribati@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Kiribati@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "KIRIBATI@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République de Kiribati@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Kiribati@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "KIRIBATI@fr",
   :lcc-cr/hasLocalShortName "Kiribati",
   :lcc-cr/hasNumericRegionCode "296",
   :lcc-cr/hasRemarks
   "Comprises: Gilbert Islands (Principal atoll: Tarawa, including Banaba), part of Line Islands (including Kiritimati), Phoenix Islands (including Abariringa, Enderbury Island).",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-2/Gilbertese
                                       :lcc-639-1/English],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Kiribati@en",
   :skos/definition "the country of Kiribati"})

(def KoreaDemocraticPeoplesRepublicOf
  "the country of Korea Democratic Peoples Republic Of"
  {:db/ident :lcc-3166-1/KoreaDemocraticPeoplesRepublicOf,
   :lcc-cr/hasEnglishFullName #voc/lstr
                               "the Democratic People's Republic of Korea@en",
   :lcc-cr/hasEnglishShortName
   #voc/lstr "Korea (the Democratic People's Republic of)@en",
   :lcc-cr/hasEnglishShortNameInCapitals
   #voc/lstr "KOREA (DEMOCRATIC PEOPLE'S REPUBLIC OF)@en",
   :lcc-cr/hasFrenchFullName
   #voc/lstr "la République populaire démocratique de Corée@fr",
   :lcc-cr/hasFrenchShortName
   #voc/lstr "Corée (la République populaire démocratique de)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals
   #voc/lstr "CORÉE, RÉPUBLIQUE POPULAIRE DÉMOCRATIQUE DE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Chosŏn@ko",
   :lcc-cr/hasNumericRegionCode "408",
   :lcc-cr/hasRemarks "Often referred to as North Korea.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Korean,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Chosŏn@ko",
   :skos/definition "the country of Korea Democratic Peoples Republic Of"})

(def KoreaRepublicOf
  "the country of Korea Republic Of"
  {:db/ident :lcc-3166-1/KoreaRepublicOf,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Korea@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Korea (the Republic of)@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "KOREA, REPUBLIC OF@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République de Corée@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Corée (la République de)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "CORÉE, RÉPUBLIQUE DE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Hanguk@ko",
   :lcc-cr/hasNumericRegionCode "410",
   :lcc-cr/hasRemarks "Often referred to as South Korea.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Korean,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Hanguk@ko",
   :skos/definition "the country of Korea Republic Of"})

(def Kuwait
  "the country of Kuwait"
  {:db/ident :lcc-3166-1/Kuwait,
   :lcc-cr/hasEnglishFullName #voc/lstr "the State of Kuwait@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Kuwait@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "KUWAIT@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "l'État du Koweït@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Koweït (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "KOWEÏT@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Al Kuwayt@ar",
   :lcc-cr/hasNumericRegionCode "414",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Arabic,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Al Kuwayt@ar",
   :skos/definition "the country of Kuwait"})

(def Kyrgyzstan
  "the country of Kyrgyzstan"
  {:db/ident :lcc-3166-1/Kyrgyzstan,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Kyrgyz Republic@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Kyrgyzstan@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "KYRGYZSTAN@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République kirghize@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Kirghizistan (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "KIRGHIZISTAN@fr",
   :lcc-cr/hasLocalShortName [#voc/lstr "Kyrgyzstan@ru"
                              #voc/lstr "Kyrgyzstan@ky"],
   :lcc-cr/hasNumericRegionCode "417",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/Russian :lcc-639-1/Kirghiz],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [#voc/lstr "Kyrgyzstan@ru" #voc/lstr "Kyrgyzstan@ky"],
   :skos/definition "the country of Kyrgyzstan"})

(def L001
  {:db/ident       :lcc-3166-1/L001,
   :owl/deprecated true,
   :owl/sameAs     :lcc-639-2/cnr,
   :rdf/type       [:lcc-lr/IndividualLanguageIdentifier :owl/NamedIndividual]})

(def L002
  "Alpha-3 language code for Shikomor"
  {:db/ident :lcc-3166-1/L002,
   :lcc-lr/denotes :lcc-3166-1/Shikomor,
   :lcc-lr/hasTag "002",
   :lcc-lr/identifies :lcc-3166-1/Shikomor,
   :rdf/type [:lcc-lr/IndividualLanguageIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "002",
   :skos/definition "Alpha-3 language code for Shikomor"})

(def LA
  "Alpha-2 country code for Lao People's Democratic Republic (the)"
  {:db/ident :lcc-3166-1/LA,
   :lcc-lr/denotes :lcc-3166-1/LaoPeoplesDemocraticRepublic,
   :lcc-lr/hasTag "LA",
   :lcc-lr/identifies :lcc-3166-1/LaoPeoplesDemocraticRepublic,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "LA",
   :skos/definition
   "Alpha-2 country code for Lao People's Democratic Republic (the)"})

(def LAO
  "Alpha-3 country code for Lao People's Democratic Republic (the)"
  {:db/ident :lcc-3166-1/LAO,
   :lcc-lr/denotes :lcc-3166-1/LaoPeoplesDemocraticRepublic,
   :lcc-lr/hasTag "LAO",
   :lcc-lr/identifies :lcc-3166-1/LaoPeoplesDemocraticRepublic,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "LAO",
   :skos/definition
   "Alpha-3 country code for Lao People's Democratic Republic (the)"})

(def LB
  "Alpha-2 country code for Lebanon"
  {:db/ident :lcc-3166-1/LB,
   :lcc-lr/denotes :lcc-3166-1/Lebanon,
   :lcc-lr/hasTag "LB",
   :lcc-lr/identifies :lcc-3166-1/Lebanon,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "LB",
   :skos/definition "Alpha-2 country code for Lebanon"})

(def LBN
  "Alpha-3 country code for Lebanon"
  {:db/ident :lcc-3166-1/LBN,
   :lcc-lr/denotes :lcc-3166-1/Lebanon,
   :lcc-lr/hasTag "LBN",
   :lcc-lr/identifies :lcc-3166-1/Lebanon,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "LBN",
   :skos/definition "Alpha-3 country code for Lebanon"})

(def LBR
  "Alpha-3 country code for Liberia"
  {:db/ident :lcc-3166-1/LBR,
   :lcc-lr/denotes :lcc-3166-1/Liberia,
   :lcc-lr/hasTag "LBR",
   :lcc-lr/identifies :lcc-3166-1/Liberia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "LBR",
   :skos/definition "Alpha-3 country code for Liberia"})

(def LBY
  "Alpha-3 country code for Libya"
  {:db/ident :lcc-3166-1/LBY,
   :lcc-lr/denotes :lcc-3166-1/Libya,
   :lcc-lr/hasTag "LBY",
   :lcc-lr/identifies :lcc-3166-1/Libya,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "LBY",
   :skos/definition "Alpha-3 country code for Libya"})

(def LC
  "Alpha-2 country code for Saint Lucia"
  {:db/ident :lcc-3166-1/LC,
   :lcc-lr/denotes :lcc-3166-1/SaintLucia,
   :lcc-lr/hasTag "LC",
   :lcc-lr/identifies :lcc-3166-1/SaintLucia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "LC",
   :skos/definition "Alpha-2 country code for Saint Lucia"})

(def LCA
  "Alpha-3 country code for Saint Lucia"
  {:db/ident :lcc-3166-1/LCA,
   :lcc-lr/denotes :lcc-3166-1/SaintLucia,
   :lcc-lr/hasTag "LCA",
   :lcc-lr/identifies :lcc-3166-1/SaintLucia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "LCA",
   :skos/definition "Alpha-3 country code for Saint Lucia"})

(def LI
  "Alpha-2 country code for Liechtenstein"
  {:db/ident :lcc-3166-1/LI,
   :lcc-lr/denotes :lcc-3166-1/Liechtenstein,
   :lcc-lr/hasTag "LI",
   :lcc-lr/identifies :lcc-3166-1/Liechtenstein,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "LI",
   :skos/definition "Alpha-2 country code for Liechtenstein"})

(def LIE
  "Alpha-3 country code for Liechtenstein"
  {:db/ident :lcc-3166-1/LIE,
   :lcc-lr/denotes :lcc-3166-1/Liechtenstein,
   :lcc-lr/hasTag "LIE",
   :lcc-lr/identifies :lcc-3166-1/Liechtenstein,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "LIE",
   :skos/definition "Alpha-3 country code for Liechtenstein"})

(def LK
  "Alpha-2 country code for Sri Lanka"
  {:db/ident :lcc-3166-1/LK,
   :lcc-lr/denotes :lcc-3166-1/SriLanka,
   :lcc-lr/hasTag "LK",
   :lcc-lr/identifies :lcc-3166-1/SriLanka,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "LK",
   :skos/definition "Alpha-2 country code for Sri Lanka"})

(def LKA
  "Alpha-3 country code for Sri Lanka"
  {:db/ident :lcc-3166-1/LKA,
   :lcc-lr/denotes :lcc-3166-1/SriLanka,
   :lcc-lr/hasTag "LKA",
   :lcc-lr/identifies :lcc-3166-1/SriLanka,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "LKA",
   :skos/definition "Alpha-3 country code for Sri Lanka"})

(def LR
  "Alpha-2 country code for Liberia"
  {:db/ident :lcc-3166-1/LR,
   :lcc-lr/denotes :lcc-3166-1/Liberia,
   :lcc-lr/hasTag "LR",
   :lcc-lr/identifies :lcc-3166-1/Liberia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "LR",
   :skos/definition "Alpha-2 country code for Liberia"})

(def LS
  "Alpha-2 country code for Lesotho"
  {:db/ident :lcc-3166-1/LS,
   :lcc-lr/denotes :lcc-3166-1/Lesotho,
   :lcc-lr/hasTag "LS",
   :lcc-lr/identifies :lcc-3166-1/Lesotho,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "LS",
   :skos/definition "Alpha-2 country code for Lesotho"})

(def LSO
  "Alpha-3 country code for Lesotho"
  {:db/ident :lcc-3166-1/LSO,
   :lcc-lr/denotes :lcc-3166-1/Lesotho,
   :lcc-lr/hasTag "LSO",
   :lcc-lr/identifies :lcc-3166-1/Lesotho,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "LSO",
   :skos/definition "Alpha-3 country code for Lesotho"})

(def LT
  "Alpha-2 country code for Lithuania"
  {:db/ident :lcc-3166-1/LT,
   :lcc-lr/denotes :lcc-3166-1/Lithuania,
   :lcc-lr/hasTag "LT",
   :lcc-lr/identifies :lcc-3166-1/Lithuania,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "LT",
   :skos/definition "Alpha-2 country code for Lithuania"})

(def LTU
  "Alpha-3 country code for Lithuania"
  {:db/ident :lcc-3166-1/LTU,
   :lcc-lr/denotes :lcc-3166-1/Lithuania,
   :lcc-lr/hasTag "LTU",
   :lcc-lr/identifies :lcc-3166-1/Lithuania,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "LTU",
   :skos/definition "Alpha-3 country code for Lithuania"})

(def LU
  "Alpha-2 country code for Luxembourg"
  {:db/ident :lcc-3166-1/LU,
   :lcc-lr/denotes :lcc-3166-1/Luxembourg,
   :lcc-lr/hasTag "LU",
   :lcc-lr/identifies :lcc-3166-1/Luxembourg,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "LU",
   :skos/definition "Alpha-2 country code for Luxembourg"})

(def LUX
  "Alpha-3 country code for Luxembourg"
  {:db/ident :lcc-3166-1/LUX,
   :lcc-lr/denotes :lcc-3166-1/Luxembourg,
   :lcc-lr/hasTag "LUX",
   :lcc-lr/identifies :lcc-3166-1/Luxembourg,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "LUX",
   :skos/definition "Alpha-3 country code for Luxembourg"})

(def LV
  "Alpha-2 country code for Latvia"
  {:db/ident :lcc-3166-1/LV,
   :lcc-lr/denotes :lcc-3166-1/Latvia,
   :lcc-lr/hasTag "LV",
   :lcc-lr/identifies :lcc-3166-1/Latvia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "LV",
   :skos/definition "Alpha-2 country code for Latvia"})

(def LVA
  "Alpha-3 country code for Latvia"
  {:db/ident :lcc-3166-1/LVA,
   :lcc-lr/denotes :lcc-3166-1/Latvia,
   :lcc-lr/hasTag "LVA",
   :lcc-lr/identifies :lcc-3166-1/Latvia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "LVA",
   :skos/definition "Alpha-3 country code for Latvia"})

(def LY
  "Alpha-2 country code for Libya"
  {:db/ident :lcc-3166-1/LY,
   :lcc-lr/denotes :lcc-3166-1/Libya,
   :lcc-lr/hasTag "LY",
   :lcc-lr/identifies :lcc-3166-1/Libya,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "LY",
   :skos/definition "Alpha-2 country code for Libya"})

(def LaoPeoplesDemocraticRepublic
  "the country of Lao People's Democratic Republic (the)"
  {:db/ident :lcc-3166-1/LaoPeoplesDemocraticRepublic,
   :lcc-cr/hasEnglishFullName #voc/lstr
                               "the Lao People's Democratic Republic@en",
   :lcc-cr/hasEnglishShortName #voc/lstr
                                "Lao People's Democratic Republic (the)@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr
                                          "LAO PEOPLE'S DEMOCRATIC REPUBLIC@en",
   :lcc-cr/hasFrenchFullName #voc/lstr
                              "la République démocratique populaire lao@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr
                               "Lao (la République démocratique populaire)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals
   #voc/lstr "LAO, RÉPUBLIQUE DÉMOCRATIQUE POPULAIRE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr
                              "Sathalanalat Paxathipatai Paxaxôn Lao@lo",
   :lcc-cr/hasNumericRegionCode "418",
   :lcc-cr/hasRemarks "Also referred to as Laos.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Lao,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Sathalanalat Paxathipatai Paxaxôn Lao@lo",
   :skos/definition "the country of Lao People's Democratic Republic (the)"})

(def Latvia
  "the country of Latvia"
  {:db/ident :lcc-3166-1/Latvia,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Latvia@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Latvia@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "LATVIA@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République de Lettonie@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Lettonie (la)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "LETTONIE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Latvija@lv",
   :lcc-cr/hasNumericRegionCode "428",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Latvian,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Latvija@lv",
   :skos/definition "the country of Latvia"})

(def Lebanon
  "the country of Lebanon"
  {:db/ident :lcc-3166-1/Lebanon,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Lebanese Republic@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Lebanon@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "LEBANON@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République libanaise@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Liban (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "LIBAN@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Lubnān@ar",
   :lcc-cr/hasNumericRegionCode "422",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Arabic,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Lubnān@ar",
   :skos/definition "the country of Lebanon"})

(def Lesotho
  "the country of Lesotho"
  {:db/ident :lcc-3166-1/Lesotho,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Kingdom of Lesotho@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Lesotho@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "LESOTHO@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "le Royaume du Lesotho@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Lesotho (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "LESOTHO@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Lesotho@st",
   :lcc-cr/hasNumericRegionCode "426",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/SouthernSotho
                                       :lcc-639-1/English],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [#voc/lstr "Lesotho@st" #voc/lstr "Lesotho@en"],
   :skos/definition "the country of Lesotho"})

(def Liberia
  "the country of Liberia"
  {:db/ident :lcc-3166-1/Liberia,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Liberia@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Liberia@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "LIBERIA@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République du Libéria@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Libéria (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "LIBÉRIA@fr",
   :lcc-cr/hasNumericRegionCode "430",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Liberia@en",
   :skos/definition "the country of Liberia"})

(def Libya
  "the country of Libya"
  {:db/ident :lcc-3166-1/Libya,
   :lcc-cr/hasEnglishFullName #voc/lstr "the State of Libya@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Libya@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "LIBYA@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "l'État de Libye@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Libye (la)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "LIBYE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Lībiyā@ar",
   :lcc-cr/hasNumericRegionCode "434",
   :lcc-cr/hasRemarks
   "The subdivision category sha‘bīyah (popularate) is no longer used since the fall of Gaddafi. The word Muḩāfaz̧ah governorate is now sometimes used instead for these subdivisions of Libya, which are those pre-2011. The unrest in Libya means that there is no recognised current administrative structure.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Arabic,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Lībiyā@ar",
   :skos/definition "the country of Libya"})

(def Liechtenstein
  "the country of Liechtenstein"
  {:db/ident :lcc-3166-1/Liechtenstein,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Principality of Liechtenstein@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Liechtenstein@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "LIECHTENSTEIN@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la Principauté du Liechtenstein@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Liechtenstein (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "LIECHTENSTEIN@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Liechtenstein@de",
   :lcc-cr/hasNumericRegionCode "438",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/German,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Liechtenstein@de",
   :skos/definition "the country of Liechtenstein"})

(def Lithuania
  "the country of Lithuania"
  {:db/ident :lcc-3166-1/Lithuania,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Lithuania@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Lithuania@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "LITHUANIA@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République de Lituanie@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Lituanie (la)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "LITUANIE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Lietuva@lt",
   :lcc-cr/hasNumericRegionCode "440",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Lithuanian,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Lietuva@lt",
   :skos/definition "the country of Lithuania"})

(def Luxembourg
  "the country of Luxembourg"
  {:db/ident :lcc-3166-1/Luxembourg,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Grand Duchy of Luxembourg@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Luxembourg@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "LUXEMBOURG@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "le Grand-Duché de Luxembourg@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Luxembourg (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "LUXEMBOURG@fr",
   :lcc-cr/hasLocalShortName [#voc/lstr "Luxemburg@de"
                              #voc/lstr "Lëtzebuerg@lb"],
   :lcc-cr/hasNumericRegionCode "442",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage
   [:lcc-639-1/German :lcc-639-1/French :lcc-639-1/Luxembourgish],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [#voc/lstr "Luxembourg (le)@fr"
                #voc/lstr "Lëtzebuerg@lb"
                #voc/lstr "Luxemburg@de"],
   :skos/definition "the country of Luxembourg"})

(def MA
  "Alpha-2 country code for Morocco"
  {:db/ident :lcc-3166-1/MA,
   :lcc-lr/denotes :lcc-3166-1/Morocco,
   :lcc-lr/hasTag "MA",
   :lcc-lr/identifies :lcc-3166-1/Morocco,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MA",
   :skos/definition "Alpha-2 country code for Morocco"})

(def MAC
  "Alpha-3 country code for Macao"
  {:db/ident :lcc-3166-1/MAC,
   :lcc-lr/denotes :lcc-3166-1/Macao,
   :lcc-lr/hasTag "MAC",
   :lcc-lr/identifies :lcc-3166-1/Macao,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MAC",
   :skos/definition "Alpha-3 country code for Macao"})

(def MAF
  "Alpha-3 country code for Saint Martin (French part)"
  {:db/ident :lcc-3166-1/MAF,
   :lcc-lr/denotes :lcc-3166-1/SaintMartin,
   :lcc-lr/hasTag "MAF",
   :lcc-lr/identifies :lcc-3166-1/SaintMartin,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MAF",
   :skos/definition "Alpha-3 country code for Saint Martin (French part)"})

(def MAR
  "Alpha-3 country code for Morocco"
  {:db/ident :lcc-3166-1/MAR,
   :lcc-lr/denotes :lcc-3166-1/Morocco,
   :lcc-lr/hasTag "MAR",
   :lcc-lr/identifies :lcc-3166-1/Morocco,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MAR",
   :skos/definition "Alpha-3 country code for Morocco"})

(def MC
  "Alpha-2 country code for Monaco"
  {:db/ident :lcc-3166-1/MC,
   :lcc-lr/denotes :lcc-3166-1/Monaco,
   :lcc-lr/hasTag "MC",
   :lcc-lr/identifies :lcc-3166-1/Monaco,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MC",
   :skos/definition "Alpha-2 country code for Monaco"})

(def MCO
  "Alpha-3 country code for Monaco"
  {:db/ident :lcc-3166-1/MCO,
   :lcc-lr/denotes :lcc-3166-1/Monaco,
   :lcc-lr/hasTag "MCO",
   :lcc-lr/identifies :lcc-3166-1/Monaco,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MCO",
   :skos/definition "Alpha-3 country code for Monaco"})

(def MD
  "Alpha-2 country code for Moldova (the Republic of)"
  {:db/ident :lcc-3166-1/MD,
   :lcc-lr/denotes :lcc-3166-1/Moldova,
   :lcc-lr/hasTag "MD",
   :lcc-lr/identifies :lcc-3166-1/Moldova,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MD",
   :skos/definition "Alpha-2 country code for Moldova (the Republic of)"})

(def MDA
  "Alpha-3 country code for Moldova (the Republic of)"
  {:db/ident :lcc-3166-1/MDA,
   :lcc-lr/denotes :lcc-3166-1/Moldova,
   :lcc-lr/hasTag "MDA",
   :lcc-lr/identifies :lcc-3166-1/Moldova,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MDA",
   :skos/definition "Alpha-3 country code for Moldova (the Republic of)"})

(def MDG
  "Alpha-3 country code for Madagascar"
  {:db/ident :lcc-3166-1/MDG,
   :lcc-lr/denotes :lcc-3166-1/Madagascar,
   :lcc-lr/hasTag "MDG",
   :lcc-lr/identifies :lcc-3166-1/Madagascar,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MDG",
   :skos/definition "Alpha-3 country code for Madagascar"})

(def MDV
  "Alpha-3 country code for Maldives"
  {:db/ident :lcc-3166-1/MDV,
   :lcc-lr/denotes :lcc-3166-1/Maldives,
   :lcc-lr/hasTag "MDV",
   :lcc-lr/identifies :lcc-3166-1/Maldives,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MDV",
   :skos/definition "Alpha-3 country code for Maldives"})

(def ME
  "Alpha-2 country code for Montenegro"
  {:db/ident :lcc-3166-1/ME,
   :lcc-lr/denotes :lcc-3166-1/Montenegro,
   :lcc-lr/hasTag "ME",
   :lcc-lr/identifies :lcc-3166-1/Montenegro,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ME",
   :skos/definition "Alpha-2 country code for Montenegro"})

(def MEX
  "Alpha-3 country code for Mexico"
  {:db/ident :lcc-3166-1/MEX,
   :lcc-lr/denotes :lcc-3166-1/Mexico,
   :lcc-lr/hasTag "MEX",
   :lcc-lr/identifies :lcc-3166-1/Mexico,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MEX",
   :skos/definition "Alpha-3 country code for Mexico"})

(def MF
  "Alpha-2 country code for Saint Martin (French part)"
  {:db/ident :lcc-3166-1/MF,
   :lcc-lr/denotes :lcc-3166-1/SaintMartin,
   :lcc-lr/hasTag "MF",
   :lcc-lr/identifies :lcc-3166-1/SaintMartin,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MF",
   :skos/definition "Alpha-2 country code for Saint Martin (French part)"})

(def MG
  "Alpha-2 country code for Madagascar"
  {:db/ident :lcc-3166-1/MG,
   :lcc-lr/denotes :lcc-3166-1/Madagascar,
   :lcc-lr/hasTag "MG",
   :lcc-lr/identifies :lcc-3166-1/Madagascar,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MG",
   :skos/definition "Alpha-2 country code for Madagascar"})

(def MH
  "Alpha-2 country code for Marshall Islands (the)"
  {:db/ident :lcc-3166-1/MH,
   :lcc-lr/denotes :lcc-3166-1/MarshallIslands,
   :lcc-lr/hasTag "MH",
   :lcc-lr/identifies :lcc-3166-1/MarshallIslands,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MH",
   :skos/definition "Alpha-2 country code for Marshall Islands (the)"})

(def MHL
  "Alpha-3 country code for Marshall Islands (the)"
  {:db/ident :lcc-3166-1/MHL,
   :lcc-lr/denotes :lcc-3166-1/MarshallIslands,
   :lcc-lr/hasTag "MHL",
   :lcc-lr/identifies :lcc-3166-1/MarshallIslands,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MHL",
   :skos/definition "Alpha-3 country code for Marshall Islands (the)"})

(def MK
  "Alpha-2 country code for North Macedonia"
  {:db/ident :lcc-3166-1/MK,
   :lcc-lr/denotes :lcc-3166-1/NorthMacedonia,
   :lcc-lr/hasTag "MK",
   :lcc-lr/identifies :lcc-3166-1/NorthMacedonia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MK",
   :skos/definition "Alpha-2 country code for North Macedonia"})

(def MKD
  "Alpha-3 country code for North Macedonia"
  {:db/ident :lcc-3166-1/MKD,
   :lcc-lr/denotes :lcc-3166-1/NorthMacedonia,
   :lcc-lr/hasTag "MKD",
   :lcc-lr/identifies :lcc-3166-1/NorthMacedonia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MKD",
   :skos/definition "Alpha-3 country code for North Macedonia"})

(def ML
  "Alpha-2 country code for Mali"
  {:db/ident :lcc-3166-1/ML,
   :lcc-lr/denotes :lcc-3166-1/Mali,
   :lcc-lr/hasTag "ML",
   :lcc-lr/identifies :lcc-3166-1/Mali,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ML",
   :skos/definition "Alpha-2 country code for Mali"})

(def MLI
  "Alpha-3 country code for Mali"
  {:db/ident :lcc-3166-1/MLI,
   :lcc-lr/denotes :lcc-3166-1/Mali,
   :lcc-lr/hasTag "MLI",
   :lcc-lr/identifies :lcc-3166-1/Mali,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MLI",
   :skos/definition "Alpha-3 country code for Mali"})

(def MLT
  "Alpha-3 country code for Malta"
  {:db/ident :lcc-3166-1/MLT,
   :lcc-lr/denotes :lcc-3166-1/Malta,
   :lcc-lr/hasTag "MLT",
   :lcc-lr/identifies :lcc-3166-1/Malta,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MLT",
   :skos/definition "Alpha-3 country code for Malta"})

(def MM
  "Alpha-2 country code for Myanmar"
  {:db/ident :lcc-3166-1/MM,
   :lcc-lr/denotes :lcc-3166-1/Myanmar,
   :lcc-lr/hasTag "MM",
   :lcc-lr/identifies :lcc-3166-1/Myanmar,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MM",
   :skos/definition "Alpha-2 country code for Myanmar"})

(def MMR
  "Alpha-3 country code for Myanmar"
  {:db/ident :lcc-3166-1/MMR,
   :lcc-lr/denotes :lcc-3166-1/Myanmar,
   :lcc-lr/hasTag "MMR",
   :lcc-lr/identifies :lcc-3166-1/Myanmar,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MMR",
   :skos/definition "Alpha-3 country code for Myanmar"})

(def MN
  "Alpha-2 country code for Mongolia"
  {:db/ident :lcc-3166-1/MN,
   :lcc-lr/denotes :lcc-3166-1/Mongolia,
   :lcc-lr/hasTag "MN",
   :lcc-lr/identifies :lcc-3166-1/Mongolia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MN",
   :skos/definition "Alpha-2 country code for Mongolia"})

(def MNE
  "Alpha-3 country code for Montenegro"
  {:db/ident :lcc-3166-1/MNE,
   :lcc-lr/denotes :lcc-3166-1/Montenegro,
   :lcc-lr/hasTag "MNE",
   :lcc-lr/identifies :lcc-3166-1/Montenegro,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MNE",
   :skos/definition "Alpha-3 country code for Montenegro"})

(def MNG
  "Alpha-3 country code for Mongolia"
  {:db/ident :lcc-3166-1/MNG,
   :lcc-lr/denotes :lcc-3166-1/Mongolia,
   :lcc-lr/hasTag "MNG",
   :lcc-lr/identifies :lcc-3166-1/Mongolia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MNG",
   :skos/definition "Alpha-3 country code for Mongolia"})

(def MNP
  "Alpha-3 country code for Northern Mariana Islands (the)"
  {:db/ident :lcc-3166-1/MNP,
   :lcc-lr/denotes :lcc-3166-1/NorthernMarianaIslands,
   :lcc-lr/hasTag "MNP",
   :lcc-lr/identifies :lcc-3166-1/NorthernMarianaIslands,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MNP",
   :skos/definition "Alpha-3 country code for Northern Mariana Islands (the)"})

(def MO
  "Alpha-2 country code for Macao"
  {:db/ident :lcc-3166-1/MO,
   :lcc-lr/denotes :lcc-3166-1/Macao,
   :lcc-lr/hasTag "MO",
   :lcc-lr/identifies :lcc-3166-1/Macao,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MO",
   :skos/definition "Alpha-2 country code for Macao"})

(def MOZ
  "Alpha-3 country code for Mozambique"
  {:db/ident :lcc-3166-1/MOZ,
   :lcc-lr/denotes :lcc-3166-1/Mozambique,
   :lcc-lr/hasTag "MOZ",
   :lcc-lr/identifies :lcc-3166-1/Mozambique,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MOZ",
   :skos/definition "Alpha-3 country code for Mozambique"})

(def MP
  "Alpha-2 country code for Northern Mariana Islands (the)"
  {:db/ident :lcc-3166-1/MP,
   :lcc-lr/denotes :lcc-3166-1/NorthernMarianaIslands,
   :lcc-lr/hasTag "MP",
   :lcc-lr/identifies :lcc-3166-1/NorthernMarianaIslands,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MP",
   :skos/definition "Alpha-2 country code for Northern Mariana Islands (the)"})

(def MQ
  "Alpha-2 country code for Martinique"
  {:db/ident :lcc-3166-1/MQ,
   :lcc-lr/denotes :lcc-3166-1/Martinique,
   :lcc-lr/hasTag "MQ",
   :lcc-lr/identifies :lcc-3166-1/Martinique,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MQ",
   :skos/definition "Alpha-2 country code for Martinique"})

(def MR
  "Alpha-2 country code for Mauritania"
  {:db/ident :lcc-3166-1/MR,
   :lcc-lr/denotes :lcc-3166-1/Mauritania,
   :lcc-lr/hasTag "MR",
   :lcc-lr/identifies :lcc-3166-1/Mauritania,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MR",
   :skos/definition "Alpha-2 country code for Mauritania"})

(def MRT
  "Alpha-3 country code for Mauritania"
  {:db/ident :lcc-3166-1/MRT,
   :lcc-lr/denotes :lcc-3166-1/Mauritania,
   :lcc-lr/hasTag "MRT",
   :lcc-lr/identifies :lcc-3166-1/Mauritania,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MRT",
   :skos/definition "Alpha-3 country code for Mauritania"})

(def MS
  "Alpha-2 country code for Montserrat"
  {:db/ident :lcc-3166-1/MS,
   :lcc-lr/denotes :lcc-3166-1/Montserrat,
   :lcc-lr/hasTag "MS",
   :lcc-lr/identifies :lcc-3166-1/Montserrat,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MS",
   :skos/definition "Alpha-2 country code for Montserrat"})

(def MSR
  "Alpha-3 country code for Montserrat"
  {:db/ident :lcc-3166-1/MSR,
   :lcc-lr/denotes :lcc-3166-1/Montserrat,
   :lcc-lr/hasTag "MSR",
   :lcc-lr/identifies :lcc-3166-1/Montserrat,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MSR",
   :skos/definition "Alpha-3 country code for Montserrat"})

(def MT
  "Alpha-2 country code for Malta"
  {:db/ident :lcc-3166-1/MT,
   :lcc-lr/denotes :lcc-3166-1/Malta,
   :lcc-lr/hasTag "MT",
   :lcc-lr/identifies :lcc-3166-1/Malta,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MT",
   :skos/definition "Alpha-2 country code for Malta"})

(def MTQ
  "Alpha-3 country code for Martinique"
  {:db/ident :lcc-3166-1/MTQ,
   :lcc-lr/denotes :lcc-3166-1/Martinique,
   :lcc-lr/hasTag "MTQ",
   :lcc-lr/identifies :lcc-3166-1/Martinique,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MTQ",
   :skos/definition "Alpha-3 country code for Martinique"})

(def MU
  "Alpha-2 country code for Mauritius"
  {:db/ident :lcc-3166-1/MU,
   :lcc-lr/denotes :lcc-3166-1/Mauritius,
   :lcc-lr/hasTag "MU",
   :lcc-lr/identifies :lcc-3166-1/Mauritius,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MU",
   :skos/definition "Alpha-2 country code for Mauritius"})

(def MUS
  "Alpha-3 country code for Mauritius"
  {:db/ident :lcc-3166-1/MUS,
   :lcc-lr/denotes :lcc-3166-1/Mauritius,
   :lcc-lr/hasTag "MUS",
   :lcc-lr/identifies :lcc-3166-1/Mauritius,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MUS",
   :skos/definition "Alpha-3 country code for Mauritius"})

(def MV
  "Alpha-2 country code for Maldives"
  {:db/ident :lcc-3166-1/MV,
   :lcc-lr/denotes :lcc-3166-1/Maldives,
   :lcc-lr/hasTag "MV",
   :lcc-lr/identifies :lcc-3166-1/Maldives,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MV",
   :skos/definition "Alpha-2 country code for Maldives"})

(def MW
  "Alpha-2 country code for Malawi"
  {:db/ident :lcc-3166-1/MW,
   :lcc-lr/denotes :lcc-3166-1/Malawi,
   :lcc-lr/hasTag "MW",
   :lcc-lr/identifies :lcc-3166-1/Malawi,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MW",
   :skos/definition "Alpha-2 country code for Malawi"})

(def MWI
  "Alpha-3 country code for Malawi"
  {:db/ident :lcc-3166-1/MWI,
   :lcc-lr/denotes :lcc-3166-1/Malawi,
   :lcc-lr/hasTag "MWI",
   :lcc-lr/identifies :lcc-3166-1/Malawi,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MWI",
   :skos/definition "Alpha-3 country code for Malawi"})

(def MX
  "Alpha-2 country code for Mexico"
  {:db/ident :lcc-3166-1/MX,
   :lcc-lr/denotes :lcc-3166-1/Mexico,
   :lcc-lr/hasTag "MX",
   :lcc-lr/identifies :lcc-3166-1/Mexico,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MX",
   :skos/definition "Alpha-2 country code for Mexico"})

(def MY
  "Alpha-2 country code for Malaysia"
  {:db/ident :lcc-3166-1/MY,
   :lcc-lr/denotes :lcc-3166-1/Malaysia,
   :lcc-lr/hasTag "MY",
   :lcc-lr/identifies :lcc-3166-1/Malaysia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MY",
   :skos/definition "Alpha-2 country code for Malaysia"})

(def MYS
  "Alpha-3 country code for Malaysia"
  {:db/ident :lcc-3166-1/MYS,
   :lcc-lr/denotes :lcc-3166-1/Malaysia,
   :lcc-lr/hasTag "MYS",
   :lcc-lr/identifies :lcc-3166-1/Malaysia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MYS",
   :skos/definition "Alpha-3 country code for Malaysia"})

(def MYT
  "Alpha-3 country code for Mayotte"
  {:db/ident :lcc-3166-1/MYT,
   :lcc-lr/denotes :lcc-3166-1/Mayotte,
   :lcc-lr/hasTag "MYT",
   :lcc-lr/identifies :lcc-3166-1/Mayotte,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MYT",
   :skos/definition "Alpha-3 country code for Mayotte"})

(def MZ
  "Alpha-2 country code for Mozambique"
  {:db/ident :lcc-3166-1/MZ,
   :lcc-lr/denotes :lcc-3166-1/Mozambique,
   :lcc-lr/hasTag "MZ",
   :lcc-lr/identifies :lcc-3166-1/Mozambique,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "MZ",
   :skos/definition "Alpha-2 country code for Mozambique"})

(def Macao
  "the country of Macao"
  {:db/ident :lcc-3166-1/Macao,
   :lcc-cr/hasEnglishFullName
   #voc/lstr "Macao Special Administrative Region of China@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Macao@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "MACAO@en",
   :lcc-cr/hasFrenchFullName
   #voc/lstr "Macao, Région administrative spéciale de Chine@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Macao@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "MACAO@fr",
   :lcc-cr/hasLocalShortName [#voc/lstr "Aomen@zh" #voc/lstr "Macau@pt"],
   :lcc-cr/hasNumericRegionCode "446",
   :lcc-cr/hasRemarks
   "Subdivision in 2 districts, distrito (pt), which is not relevant for this part of ISO 3166. Included also as a subdivision of China (CN-MO).",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/Chinese
                                       :lcc-639-1/Portuguese],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [#voc/lstr "Aomen@zh" #voc/lstr "Macau@pt"],
   :skos/definition "the country of Macao"})

(def Macedonia
  {:db/ident :lcc-3166-1/Macedonia,
   :owl/deprecated true,
   :owl/sameAs :lcc-3166-1/NorthMacedonia,
   :rdf/type :owl/NamedIndividual,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"})

(def Madagascar
  "the country of Madagascar"
  {:db/ident :lcc-3166-1/Madagascar,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Madagascar@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Madagascar@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "MADAGASCAR@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République de Madagascar@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Madagascar@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "MADAGASCAR@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Madagasikara@mg",
   :lcc-cr/hasNumericRegionCode "450",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage
   [:lcc-639-1/Malagasy :lcc-639-1/English :lcc-639-1/French],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [#voc/lstr "Madagascar@fr"
                #voc/lstr "Madagascar@en"
                #voc/lstr "Madagasikara@mg"],
   :skos/definition "the country of Madagascar"})

(def Malawi
  "the country of Malawi"
  {:db/ident :lcc-3166-1/Malawi,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Malawi@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Malawi@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "MALAWI@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République du Malawi@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Malawi (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "MALAWI@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Malaŵi@ny",
   :lcc-cr/hasNumericRegionCode "454",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/Nyanja :lcc-639-1/English],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [#voc/lstr "Malaŵi@ny" #voc/lstr "Malawi@en"],
   :skos/definition "the country of Malawi"})

(def Malaysia
  "the country of Malaysia"
  {:db/ident :lcc-3166-1/Malaysia,
   :lcc-cr/hasEnglishShortName #voc/lstr "Malaysia@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "MALAYSIA@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Malaisie (la)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "MALAISIE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Malaysia@ms",
   :lcc-cr/hasNumericRegionCode "458",
   :lcc-cr/hasRemarks "Comprises: Peninsular Malaysia, Sabah, Sarawak.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Malay,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Malaysia@ms",
   :skos/definition "the country of Malaysia"})

(def Maldives
  "the country of Maldives"
  {:db/ident :lcc-3166-1/Maldives,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Maldives@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Maldives@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "MALDIVES@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République des Maldives@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Maldives (les)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "MALDIVES@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Dhivehi Raajje@dv",
   :lcc-cr/hasNumericRegionCode "462",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Dhivehi,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Dhivehi Raajje@dv",
   :skos/definition "the country of Maldives"})

(def Mali
  "the country of Mali"
  {:db/ident :lcc-3166-1/Mali,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Mali@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Mali@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "MALI@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République du Mali@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Mali (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "MALI@fr",
   :lcc-cr/hasNumericRegionCode "466",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Mali (le)@fr",
   :skos/definition "the country of Mali"})

(def Malta
  "the country of Malta"
  {:db/ident :lcc-3166-1/Malta,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Malta@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Malta@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "MALTA@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République de Malte@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Malte@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "MALTE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Malta@mt",
   :lcc-cr/hasNumericRegionCode "470",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/Maltese :lcc-639-1/English],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [#voc/lstr "Malta@mt" #voc/lstr "Malta@en"],
   :skos/definition "the country of Malta"})

(def MarshallIslands
  "the country of Marshall Islands (the)"
  {:db/ident :lcc-3166-1/MarshallIslands,
   :lcc-cr/hasEnglishFullName #voc/lstr
                               "the Republic of the Marshall Islands@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Marshall Islands (the)@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "MARSHALL ISLANDS@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République des Îles Marshall@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Marshall (les Îles)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "MARSHALL, ÎLES@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Aelōn̄ in M̧ajeļ@mh",
   :lcc-cr/hasNumericRegionCode "584",
   :lcc-cr/hasRemarks "Principal atolls: Jaluit, Kwajalein, Majuro.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/English
                                       :lcc-639-1/Marshallese],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [#voc/lstr "Marshall Islands (the)@en"
                #voc/lstr "Aelōn̄ in M̧ajeļ@mh"],
   :skos/definition "the country of Marshall Islands (the)"})

(def Martinique
  "the country of Martinique"
  {:db/ident :lcc-3166-1/Martinique,
   :lcc-cr/hasEnglishShortName #voc/lstr "Martinique@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "MARTINIQUE@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Martinique (la)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "MARTINIQUE@fr",
   :lcc-cr/hasNumericRegionCode "474",
   :lcc-cr/hasRemarks
   "No subdivisions relevant for this standard. Included also as a subdivision of France (FR-MQ).",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Martinique (la)@fr",
   :skos/definition "the country of Martinique"})

(def Mauritania
  "the country of Mauritania"
  {:db/ident :lcc-3166-1/Mauritania,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Islamic Republic of Mauritania@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Mauritania@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "MAURITANIA@en",
   :lcc-cr/hasFrenchFullName #voc/lstr
                              "la République islamique de Mauritanie@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Mauritanie (la)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "MAURITANIE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Mūrītāniyā@ar",
   :lcc-cr/hasNumericRegionCode "478",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Arabic,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Mūrītāniyā@ar",
   :skos/definition "the country of Mauritania"})

(def Mauritius
  "the country of Mauritius"
  {:db/ident :lcc-3166-1/Mauritius,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Mauritius@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Mauritius@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "MAURITIUS@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République de Maurice@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Maurice@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "MAURICE@fr",
   :lcc-cr/hasNumericRegionCode "480",
   :lcc-cr/hasRemarks
   "Includes: Agalega Islands, Cargados Carajos Shoals, Rodrigues Island.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Mauritius@en",
   :skos/definition "the country of Mauritius"})

(def Mayotte
  "the country of Mayotte"
  {:db/ident :lcc-3166-1/Mayotte,
   :lcc-cr/hasEnglishShortName #voc/lstr "Mayotte@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "MAYOTTE@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Mayotte@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "MAYOTTE@fr",
   :lcc-cr/hasNumericRegionCode "175",
   :lcc-cr/hasRemarks
   "No subdivisions relevant for this standard. Included also as a subdivision of France (FR-YT).",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Mayotte@fr",
   :skos/definition "the country of Mayotte"})

(def Mexico
  "the country of Mexico"
  {:db/ident :lcc-3166-1/Mexico,
   :lcc-cr/hasEnglishFullName #voc/lstr "the United Mexican States@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Mexico@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "MEXICO@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "les États-Unis du Mexique@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Mexique (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "MEXIQUE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "México@es",
   :lcc-cr/hasNumericRegionCode "484",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Spanish,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "México@es",
   :skos/definition "the country of Mexico"})

(def Micronesia
  "the country of Micronesia (Federated States of)"
  {:db/ident :lcc-3166-1/Micronesia,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Federated States of Micronesia@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Micronesia (Federated States of)@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr
                                          "MICRONESIA (FEDERATED STATES OF)@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "les États fédérés de Micronésie@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Micronésie (États fédérés de)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr
                                         "MICRONÉSIE (ÉTATS FÉDÉRÉS DE)@fr",
   :lcc-cr/hasNumericRegionCode "583",
   :lcc-cr/hasRemarks
   "Comprises: Caroline Islands (except PALAU, see separate entry). Principal islands: Chuuk, Kosrae, Pohnpei, YapChuuk, Kosrae, Pohnpei, Yap.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Micronesia (Federated States of)@en",
   :skos/definition "the country of Micronesia (Federated States of)"})

(def Moldova
  "the country of Moldova (the Republic of)"
  {:db/ident :lcc-3166-1/Moldova,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Moldova@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Moldova (the Republic of)@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "MOLDOVA, REPUBLIC OF@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République de Moldova@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Moldova (la République de)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "MOLDOVA, RÉPUBLIQUE DE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Republica Moldova@ro",
   :lcc-cr/hasNumericRegionCode "498",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Romanian,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Republica Moldova@ro",
   :skos/definition "the country of Moldova (the Republic of)"})

(def Monaco
  "the country of Monaco"
  {:db/ident :lcc-3166-1/Monaco,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Principality of Monaco@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Monaco@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "MONACO@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la Principauté de Monaco@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Monaco@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "MONACO@fr",
   :lcc-cr/hasNumericRegionCode "492",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Monaco@fr",
   :skos/definition "the country of Monaco"})

(def Mongolia
  "the country of Mongolia"
  {:db/ident :lcc-3166-1/Mongolia,
   :lcc-cr/hasEnglishShortName #voc/lstr "Mongolia@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "MONGOLIA@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Mongolie (la)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "MONGOLIE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Mongol@mn",
   :lcc-cr/hasNumericRegionCode "496",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Mongolian,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Mongol@mn",
   :skos/definition "the country of Mongolia"})

(def Montenegrin
  {:db/ident       :lcc-3166-1/Montenegrin,
   :owl/deprecated true,
   :owl/sameAs     :lcc-639-2/Montenegrin,
   :rdf/type       [:lcc-lr/IndividualLanguage :owl/NamedIndividual]})

(def Montenegro
  "the country of Montenegro"
  {:db/ident :lcc-3166-1/Montenegro,
   :lcc-cr/hasEnglishShortName #voc/lstr "Montenegro@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "MONTENEGRO@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "Monténégro (le)@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Monténégro (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "MONTÉNÉGRO@fr",
   :lcc-cr/hasLocalShortName "Crna Gora",
   :lcc-cr/hasNumericRegionCode "499",
   :lcc-cr/hasRemarks
   "Montenegro was formerly part of former entries: YUGOSLAVIA (YU, YUG, 891) then SERBIA AND MONTENEGRO (CS, SCG, 891).",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-2/Montenegrin,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :skos/definition "the country of Montenegro"})

(def Montserrat
  "the country of Montserrat"
  {:db/ident :lcc-3166-1/Montserrat,
   :lcc-cr/hasEnglishShortName #voc/lstr "Montserrat@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "MONTSERRAT@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Montserrat@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "MONTSERRAT@fr",
   :lcc-cr/hasNumericRegionCode "500",
   :lcc-cr/hasRemarks "No subdivisions relevant for this standard.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Montserrat@en",
   :skos/definition "the country of Montserrat"})

(def Morocco
  "the country of Morocco"
  {:db/ident :lcc-3166-1/Morocco,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Kingdom of Morocco@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Morocco@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "MOROCCO@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "le Royaume du Maroc@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Maroc (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "MAROC@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Al Maghrib@ar",
   :lcc-cr/hasNumericRegionCode "504",
   :lcc-cr/hasRemarks
   "Remark: Entries followed by \"(EH)\" are located partially or fully in the territory of Western Sahara (ISO 3166 alpha-2 code element EH).",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Arabic,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Al Maghrib@ar",
   :skos/definition "the country of Morocco"})

(def Mozambique
  "the country of Mozambique"
  {:db/ident :lcc-3166-1/Mozambique,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Mozambique@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Mozambique@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "MOZAMBIQUE@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République du Mozambique@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Mozambique (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "MOZAMBIQUE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Moçambique@pt",
   :lcc-cr/hasNumericRegionCode "508",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Portuguese,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Moçambique@pt",
   :skos/definition "the country of Mozambique"})

(def Myanmar
  "the country of Myanmar"
  {:db/ident :lcc-3166-1/Myanmar,
   :lcc-cr/hasEnglishFullName #voc/lstr
                               "the Republic of the Union of Myanmar@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Myanmar@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "MYANMAR@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République de l'Union du Myanmar@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Myanmar (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "MYANMAR@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Myanma@my",
   :lcc-cr/hasNumericRegionCode "104",
   :lcc-cr/hasRemarks
   "Remark: the forms used in the list are English-language forms provided by Myanmar.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Burmese,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Myanma@my",
   :skos/definition "the country of Myanmar"})

(def NA
  "Alpha-2 country code for Namibia"
  {:db/ident :lcc-3166-1/NA,
   :lcc-lr/denotes :lcc-3166-1/Namibia,
   :lcc-lr/hasTag "NA",
   :lcc-lr/identifies :lcc-3166-1/Namibia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "NA",
   :skos/definition "Alpha-2 country code for Namibia"})

(def NAM
  "Alpha-3 country code for Namibia"
  {:db/ident :lcc-3166-1/NAM,
   :lcc-lr/denotes :lcc-3166-1/Namibia,
   :lcc-lr/hasTag "NAM",
   :lcc-lr/identifies :lcc-3166-1/Namibia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "NAM",
   :skos/definition "Alpha-3 country code for Namibia"})

(def NC
  "Alpha-2 country code for New Caledonia"
  {:db/ident :lcc-3166-1/NC,
   :lcc-lr/denotes :lcc-3166-1/NewCaledonia,
   :lcc-lr/hasTag "NC",
   :lcc-lr/identifies :lcc-3166-1/NewCaledonia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "NC",
   :skos/definition "Alpha-2 country code for New Caledonia"})

(def NCL
  "Alpha-3 country code for New Caledonia"
  {:db/ident :lcc-3166-1/NCL,
   :lcc-lr/denotes :lcc-3166-1/NewCaledonia,
   :lcc-lr/hasTag "NCL",
   :lcc-lr/identifies :lcc-3166-1/NewCaledonia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "NCL",
   :skos/definition "Alpha-3 country code for New Caledonia"})

(def NE
  "Alpha-2 country code for Niger (the)"
  {:db/ident :lcc-3166-1/NE,
   :lcc-lr/denotes :lcc-3166-1/Niger,
   :lcc-lr/hasTag "NE",
   :lcc-lr/identifies :lcc-3166-1/Niger,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "NE",
   :skos/definition "Alpha-2 country code for Niger (the)"})

(def NER
  "Alpha-3 country code for Niger (the)"
  {:db/ident :lcc-3166-1/NER,
   :lcc-lr/denotes :lcc-3166-1/Niger,
   :lcc-lr/hasTag "NER",
   :lcc-lr/identifies :lcc-3166-1/Niger,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "NER",
   :skos/definition "Alpha-3 country code for Niger (the)"})

(def NF
  "Alpha-2 country code for Norfolk Island"
  {:db/ident :lcc-3166-1/NF,
   :lcc-lr/denotes :lcc-3166-1/NorfolkIsland,
   :lcc-lr/hasTag "NF",
   :lcc-lr/identifies :lcc-3166-1/NorfolkIsland,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "NF",
   :skos/definition "Alpha-2 country code for Norfolk Island"})

(def NFK
  "Alpha-3 country code for Norfolk Island"
  {:db/ident :lcc-3166-1/NFK,
   :lcc-lr/denotes :lcc-3166-1/NorfolkIsland,
   :lcc-lr/hasTag "NFK",
   :lcc-lr/identifies :lcc-3166-1/NorfolkIsland,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "NFK",
   :skos/definition "Alpha-3 country code for Norfolk Island"})

(def NG
  "Alpha-2 country code for Nigeria"
  {:db/ident :lcc-3166-1/NG,
   :lcc-lr/denotes :lcc-3166-1/Nigeria,
   :lcc-lr/hasTag "NG",
   :lcc-lr/identifies :lcc-3166-1/Nigeria,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "NG",
   :skos/definition "Alpha-2 country code for Nigeria"})

(def NGA
  "Alpha-3 country code for Nigeria"
  {:db/ident :lcc-3166-1/NGA,
   :lcc-lr/denotes :lcc-3166-1/Nigeria,
   :lcc-lr/hasTag "NGA",
   :lcc-lr/identifies :lcc-3166-1/Nigeria,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "NGA",
   :skos/definition "Alpha-3 country code for Nigeria"})

(def NI
  "Alpha-2 country code for Nicaragua"
  {:db/ident :lcc-3166-1/NI,
   :lcc-lr/denotes :lcc-3166-1/Nicaragua,
   :lcc-lr/hasTag "NI",
   :lcc-lr/identifies :lcc-3166-1/Nicaragua,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "NI",
   :skos/definition "Alpha-2 country code for Nicaragua"})

(def NIC
  "Alpha-3 country code for Nicaragua"
  {:db/ident :lcc-3166-1/NIC,
   :lcc-lr/denotes :lcc-3166-1/Nicaragua,
   :lcc-lr/hasTag "NIC",
   :lcc-lr/identifies :lcc-3166-1/Nicaragua,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "NIC",
   :skos/definition "Alpha-3 country code for Nicaragua"})

(def NIU
  "Alpha-3 country code for Niue"
  {:db/ident :lcc-3166-1/NIU,
   :lcc-lr/denotes :lcc-3166-1/Niue,
   :lcc-lr/hasTag "NIU",
   :lcc-lr/identifies :lcc-3166-1/Niue,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "NIU",
   :skos/definition "Alpha-3 country code for Niue"})

(def NL
  "Alpha-2 country code for Netherlands (the)"
  {:db/ident :lcc-3166-1/NL,
   :lcc-lr/denotes :lcc-3166-1/Netherlands,
   :lcc-lr/hasTag "NL",
   :lcc-lr/identifies :lcc-3166-1/Netherlands,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "NL",
   :skos/definition "Alpha-2 country code for Netherlands (the)"})

(def NLD
  "Alpha-3 country code for Netherlands (the)"
  {:db/ident :lcc-3166-1/NLD,
   :lcc-lr/denotes :lcc-3166-1/Netherlands,
   :lcc-lr/hasTag "NLD",
   :lcc-lr/identifies :lcc-3166-1/Netherlands,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "NLD",
   :skos/definition "Alpha-3 country code for Netherlands (the)"})

(def NO
  "Alpha-2 country code for Norway"
  {:db/ident :lcc-3166-1/NO,
   :lcc-lr/denotes :lcc-3166-1/Norway,
   :lcc-lr/hasTag "NO",
   :lcc-lr/identifies :lcc-3166-1/Norway,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "NO",
   :skos/definition "Alpha-2 country code for Norway"})

(def NOR
  "Alpha-3 country code for Norway"
  {:db/ident :lcc-3166-1/NOR,
   :lcc-lr/denotes :lcc-3166-1/Norway,
   :lcc-lr/hasTag "NOR",
   :lcc-lr/identifies :lcc-3166-1/Norway,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "NOR",
   :skos/definition "Alpha-3 country code for Norway"})

(def NP
  "Alpha-2 country code for Nepal"
  {:db/ident :lcc-3166-1/NP,
   :lcc-lr/denotes :lcc-3166-1/Nepal,
   :lcc-lr/hasTag "NP",
   :lcc-lr/identifies :lcc-3166-1/Nepal,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "NP",
   :skos/definition "Alpha-2 country code for Nepal"})

(def NPL
  "Alpha-3 country code for Nepal"
  {:db/ident :lcc-3166-1/NPL,
   :lcc-lr/denotes :lcc-3166-1/Nepal,
   :lcc-lr/hasTag "NPL",
   :lcc-lr/identifies :lcc-3166-1/Nepal,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "NPL",
   :skos/definition "Alpha-3 country code for Nepal"})

(def NR
  "Alpha-2 country code for Nauru"
  {:db/ident :lcc-3166-1/NR,
   :lcc-lr/denotes :lcc-3166-1/Nauru,
   :lcc-lr/hasTag "NR",
   :lcc-lr/identifies :lcc-3166-1/Nauru,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "NR",
   :skos/definition "Alpha-2 country code for Nauru"})

(def NRU
  "Alpha-3 country code for Nauru"
  {:db/ident :lcc-3166-1/NRU,
   :lcc-lr/denotes :lcc-3166-1/Nauru,
   :lcc-lr/hasTag "NRU",
   :lcc-lr/identifies :lcc-3166-1/Nauru,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "NRU",
   :skos/definition "Alpha-3 country code for Nauru"})

(def NU
  "Alpha-2 country code for Niue"
  {:db/ident :lcc-3166-1/NU,
   :lcc-lr/denotes :lcc-3166-1/Niue,
   :lcc-lr/hasTag "NU",
   :lcc-lr/identifies :lcc-3166-1/Niue,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "NU",
   :skos/definition "Alpha-2 country code for Niue"})

(def NZ
  "Alpha-2 country code for New Zealand"
  {:db/ident :lcc-3166-1/NZ,
   :lcc-lr/denotes :lcc-3166-1/NewZealand,
   :lcc-lr/hasTag "NZ",
   :lcc-lr/identifies :lcc-3166-1/NewZealand,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "NZ",
   :skos/definition "Alpha-2 country code for New Zealand"})

(def NZL
  "Alpha-3 country code for New Zealand"
  {:db/ident :lcc-3166-1/NZL,
   :lcc-lr/denotes :lcc-3166-1/NewZealand,
   :lcc-lr/hasTag "NZL",
   :lcc-lr/identifies :lcc-3166-1/NewZealand,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "NZL",
   :skos/definition "Alpha-3 country code for New Zealand"})

(def Namibia
  "the country of Namibia"
  {:db/ident :lcc-3166-1/Namibia,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Namibia@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Namibia@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "NAMIBIA@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République de Namibie@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Namibie (la)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "NAMIBIE@fr",
   :lcc-cr/hasNumericRegionCode "516",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Namibia@en",
   :skos/definition "the country of Namibia"})

(def Nauru
  "the country of Nauru"
  {:db/ident :lcc-3166-1/Nauru,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Nauru@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Nauru@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "NAURU@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République de Nauru@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Nauru@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "NAURU@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Naoero@na",
   :lcc-cr/hasNumericRegionCode "520",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/English :lcc-639-1/Nauru],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [#voc/lstr "Naoero@na" #voc/lstr "Nauru@en"],
   :skos/definition "the country of Nauru"})

(def Nepal
  "the country of Nepal"
  {:db/ident :lcc-3166-1/Nepal,
   :lcc-cr/hasEnglishShortName #voc/lstr "Nepal@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "NEPAL@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Népal (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "NÉPAL@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Nepāl@ne",
   :lcc-cr/hasNumericRegionCode "524",
   :lcc-cr/hasRemarks
   "In September 2015 Nepal created a new federal structure consisting of 7 provinces. Until now only two of these provinces have names. The rest are identified by numbers only. These provinces should replace the zones and development regions but this has not yet been fully implemented.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Nepali,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Nepāl@ne",
   :skos/definition "the country of Nepal"})

(def Netherlands
  "the country of Netherlands (the)"
  {:db/ident :lcc-3166-1/Netherlands,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Kingdom of the Netherlands@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Netherlands (the)@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "NETHERLANDS@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "le Royaume des Pays-Bas@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Pays-Bas (les)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "PAYS-BAS@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Nederland@nl",
   :lcc-cr/hasNumericRegionCode "528",
   :lcc-cr/hasRemarks "Includes: the islands Bonaire, Sint Eustatius and Saba.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Dutch,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Nederland@nl",
   :skos/definition "the country of Netherlands (the)"})

(def NewCaledonia
  "the country of New Caledonia"
  {:db/ident :lcc-3166-1/NewCaledonia,
   :lcc-cr/hasEnglishShortName #voc/lstr "New Caledonia@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "NEW CALEDONIA@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Nouvelle-Calédonie (la)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "NOUVELLE-CALÉDONIE@fr",
   :lcc-cr/hasNumericRegionCode "540",
   :lcc-cr/hasRemarks
   ["No subdivisions relevant for this standard. Included also as a subdivision of France (FR-NC)."
    "Includes: Loyalty Islands."],
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Nouvelle-Calédonie (la)@fr",
   :skos/definition "the country of New Caledonia"})

(def NewZealand
  "the country of New Zealand"
  {:db/ident :lcc-3166-1/NewZealand,
   :lcc-cr/hasEnglishShortName #voc/lstr "New Zealand@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "NEW ZEALAND@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Nouvelle-Zélande (la)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "NOUVELLE-ZÉLANDE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Aotearoa@mi",
   :lcc-cr/hasNumericRegionCode "554",
   :lcc-cr/hasRemarks
   "Includes: Antipodes Islands, Auckland Islands, Campbell Island, Chatham Islands, Kermadec Islands.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/Maori :lcc-639-1/English],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [#voc/lstr "Aotearoa@mi" #voc/lstr "New Zealand@en"],
   :skos/definition "the country of New Zealand"})

(def Nicaragua
  "the country of Nicaragua"
  {:db/ident :lcc-3166-1/Nicaragua,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Nicaragua@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Nicaragua@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "NICARAGUA@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République du Nicaragua@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Nicaragua (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "NICARAGUA@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Nicaragua@es",
   :lcc-cr/hasNumericRegionCode "558",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Spanish,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Nicaragua@es",
   :skos/definition "the country of Nicaragua"})

(def Niger
  "the country of Niger (the)"
  {:db/ident :lcc-3166-1/Niger,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of the Niger@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Niger (the)@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "NIGER@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République du Niger@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Niger (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "NIGER@fr",
   :lcc-cr/hasNumericRegionCode "562",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Niger (le)@fr",
   :skos/definition "the country of Niger (the)"})

(def Nigeria
  "the country of Nigeria"
  {:db/ident :lcc-3166-1/Nigeria,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Federal Republic of Nigeria@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Nigeria@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "NIGERIA@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République fédérale du Nigéria@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Nigéria (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "NIGÉRIA@fr",
   :lcc-cr/hasNumericRegionCode "566",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Nigeria@en",
   :skos/definition "the country of Nigeria"})

(def Niue
  "the country of Niue"
  {:db/ident :lcc-3166-1/Niue,
   :lcc-cr/hasEnglishShortName #voc/lstr "Niue@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "NIUE@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Niue@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "NIUE@fr",
   :lcc-cr/hasLocalShortName "Niue",
   :lcc-cr/hasNumericRegionCode "570",
   :lcc-cr/hasRemarks "No subdivisions relevant for this standard.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/English :lcc-639-2/Niuean],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Niue@en",
   :skos/definition "the country of Niue"})

(def NorfolkIsland
  "the country of Norfolk Island"
  {:db/ident :lcc-3166-1/NorfolkIsland,
   :lcc-cr/hasEnglishShortName #voc/lstr "Norfolk Island@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "NORFOLK ISLAND@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Norfolk (l'Île)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "NORFOLK, ÎLE@fr",
   :lcc-cr/hasNumericRegionCode "574",
   :lcc-cr/hasRemarks "No subdivisions relevant for this standard.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Norfolk Island@en",
   :skos/definition "the country of Norfolk Island"})

(def NorthMacedonia
  "the country of North Macedonia"
  {:db/ident :lcc-3166-1/NorthMacedonia,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of North Macedonia@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "North Macedonia@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "NORTH MACEDONIA@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République de Macédoine du Nord@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Macédoine du Nord (la)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "MACÉDOINE DU NORD@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Severna Makedonija@mk",
   :lcc-cr/hasNumericRegionCode "807",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Macedonian,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Severna Makedonija@mk",
   :skos/definition "the country of North Macedonia"})

(def NorthernMarianaIslands
  "the country of Northern Mariana Islands (the)"
  {:db/ident :lcc-3166-1/NorthernMarianaIslands,
   :lcc-cr/hasEnglishFullName
   #voc/lstr "the Commonwealth of the Northern Mariana Islands@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Northern Mariana Islands (the)@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr
                                          "NORTHERN MARIANA ISLANDS@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "les Îles Mariannes du Nord@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Mariannes du Nord (les Îles)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "MARIANNES DU NORD, ÎLES@fr",
   :lcc-cr/hasNumericRegionCode "580",
   :lcc-cr/hasRemarks
   ["Comprises: Mariana Islands (except GUAM, see separate entry). (Principal island: Saipan)."
    "No subdivisions relevant for this standard. Included also as a subdivision of the United States (US-MP)."],
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Northern Mariana Islands (the)@en",
   :skos/definition "the country of Northern Mariana Islands (the)"})

(def Norway
  "the country of Norway"
  {:db/ident :lcc-3166-1/Norway,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Kingdom of Norway@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Norway@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "NORWAY@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "le Royaume de Norvège@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Norvège (la)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "NORVÈGE@fr",
   :lcc-cr/hasLocalShortName [#voc/lstr "Norge@nb" #voc/lstr "Noreg@nn"],
   :lcc-cr/hasNumericRegionCode "578",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/NorwegianBokmal
                                       :lcc-639-1/NorwegianNynorsk],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [#voc/lstr "Norge@nb" #voc/lstr "Noreg@nn"],
   :skos/definition "the country of Norway"})

(def OM
  "Alpha-2 country code for Oman"
  {:db/ident :lcc-3166-1/OM,
   :lcc-lr/denotes :lcc-3166-1/Oman,
   :lcc-lr/hasTag "OM",
   :lcc-lr/identifies :lcc-3166-1/Oman,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "OM",
   :skos/definition "Alpha-2 country code for Oman"})

(def OMN
  "Alpha-3 country code for Oman"
  {:db/ident :lcc-3166-1/OMN,
   :lcc-lr/denotes :lcc-3166-1/Oman,
   :lcc-lr/hasTag "OMN",
   :lcc-lr/identifies :lcc-3166-1/Oman,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "OMN",
   :skos/definition "Alpha-3 country code for Oman"})

(def Oman
  "the country of Oman"
  {:db/ident :lcc-3166-1/Oman,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Sultanate of Oman@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Oman@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "OMAN@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "le Sultanat d'Oman@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Oman@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "OMAN@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "‘Umān@ar",
   :lcc-cr/hasNumericRegionCode "512",
   :lcc-cr/hasRemarks "Includes: part of the Musandam Peninsula.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Arabic,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "‘Umān@ar",
   :skos/definition "the country of Oman"})

(def PA
  "Alpha-2 country code for Panama"
  {:db/ident :lcc-3166-1/PA,
   :lcc-lr/denotes :lcc-3166-1/Panama,
   :lcc-lr/hasTag "PA",
   :lcc-lr/identifies :lcc-3166-1/Panama,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "PA",
   :skos/definition "Alpha-2 country code for Panama"})

(def PAK
  "Alpha-3 country code for Pakistan"
  {:db/ident :lcc-3166-1/PAK,
   :lcc-lr/denotes :lcc-3166-1/Pakistan,
   :lcc-lr/hasTag "PAK",
   :lcc-lr/identifies :lcc-3166-1/Pakistan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "PAK",
   :skos/definition "Alpha-3 country code for Pakistan"})

(def PAN
  "Alpha-3 country code for Panama"
  {:db/ident :lcc-3166-1/PAN,
   :lcc-lr/denotes :lcc-3166-1/Panama,
   :lcc-lr/hasTag "PAN",
   :lcc-lr/identifies :lcc-3166-1/Panama,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "PAN",
   :skos/definition "Alpha-3 country code for Panama"})

(def PCN
  "Alpha-3 country code for Pitcairn"
  {:db/ident :lcc-3166-1/PCN,
   :lcc-lr/denotes :lcc-3166-1/Pitcairn,
   :lcc-lr/hasTag "PCN",
   :lcc-lr/identifies :lcc-3166-1/Pitcairn,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "PCN",
   :skos/definition "Alpha-3 country code for Pitcairn"})

(def PE
  "Alpha-2 country code for Peru"
  {:db/ident :lcc-3166-1/PE,
   :lcc-lr/denotes :lcc-3166-1/Peru,
   :lcc-lr/hasTag "PE",
   :lcc-lr/identifies :lcc-3166-1/Peru,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "PE",
   :skos/definition "Alpha-2 country code for Peru"})

(def PER
  "Alpha-3 country code for Peru"
  {:db/ident :lcc-3166-1/PER,
   :lcc-lr/denotes :lcc-3166-1/Peru,
   :lcc-lr/hasTag "PER",
   :lcc-lr/identifies :lcc-3166-1/Peru,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "PER",
   :skos/definition "Alpha-3 country code for Peru"})

(def PF
  "Alpha-2 country code for French Polynesia"
  {:db/ident :lcc-3166-1/PF,
   :lcc-lr/denotes :lcc-3166-1/FrenchPolynesia,
   :lcc-lr/hasTag "PF",
   :lcc-lr/identifies :lcc-3166-1/FrenchPolynesia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "PF",
   :skos/definition "Alpha-2 country code for French Polynesia"})

(def PG
  "Alpha-2 country code for Papua New Guinea"
  {:db/ident :lcc-3166-1/PG,
   :lcc-lr/denotes :lcc-3166-1/PapuaNewGuinea,
   :lcc-lr/hasTag "PG",
   :lcc-lr/identifies :lcc-3166-1/PapuaNewGuinea,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "PG",
   :skos/definition "Alpha-2 country code for Papua New Guinea"})

(def PH
  "Alpha-2 country code for Philippines (the)"
  {:db/ident :lcc-3166-1/PH,
   :lcc-lr/denotes :lcc-3166-1/Philippines,
   :lcc-lr/hasTag "PH",
   :lcc-lr/identifies :lcc-3166-1/Philippines,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "PH",
   :skos/definition "Alpha-2 country code for Philippines (the)"})

(def PHL
  "Alpha-3 country code for Philippines (the)"
  {:db/ident :lcc-3166-1/PHL,
   :lcc-lr/denotes :lcc-3166-1/Philippines,
   :lcc-lr/hasTag "PHL",
   :lcc-lr/identifies :lcc-3166-1/Philippines,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "PHL",
   :skos/definition "Alpha-3 country code for Philippines (the)"})

(def PK
  "Alpha-2 country code for Pakistan"
  {:db/ident :lcc-3166-1/PK,
   :lcc-lr/denotes :lcc-3166-1/Pakistan,
   :lcc-lr/hasTag "PK",
   :lcc-lr/identifies :lcc-3166-1/Pakistan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "PK",
   :skos/definition "Alpha-2 country code for Pakistan"})

(def PL
  "Alpha-2 country code for Poland"
  {:db/ident :lcc-3166-1/PL,
   :lcc-lr/denotes :lcc-3166-1/Poland,
   :lcc-lr/hasTag "PL",
   :lcc-lr/identifies :lcc-3166-1/Poland,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "PL",
   :skos/definition "Alpha-2 country code for Poland"})

(def PLW
  "Alpha-3 country code for Palau"
  {:db/ident :lcc-3166-1/PLW,
   :lcc-lr/denotes :lcc-3166-1/Palau,
   :lcc-lr/hasTag "PLW",
   :lcc-lr/identifies :lcc-3166-1/Palau,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "PLW",
   :skos/definition "Alpha-3 country code for Palau"})

(def PM
  "Alpha-2 country code for Saint Pierre and Miquelon"
  {:db/ident :lcc-3166-1/PM,
   :lcc-lr/denotes :lcc-3166-1/SaintPierreAndMiquelon,
   :lcc-lr/hasTag "PM",
   :lcc-lr/identifies :lcc-3166-1/SaintPierreAndMiquelon,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "PM",
   :skos/definition "Alpha-2 country code for Saint Pierre and Miquelon"})

(def PN
  "Alpha-2 country code for Pitcairn"
  {:db/ident :lcc-3166-1/PN,
   :lcc-lr/denotes :lcc-3166-1/Pitcairn,
   :lcc-lr/hasTag "PN",
   :lcc-lr/identifies :lcc-3166-1/Pitcairn,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "PN",
   :skos/definition "Alpha-2 country code for Pitcairn"})

(def PNG
  "Alpha-3 country code for Papua New Guinea"
  {:db/ident :lcc-3166-1/PNG,
   :lcc-lr/denotes :lcc-3166-1/PapuaNewGuinea,
   :lcc-lr/hasTag "PNG",
   :lcc-lr/identifies :lcc-3166-1/PapuaNewGuinea,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "PNG",
   :skos/definition "Alpha-3 country code for Papua New Guinea"})

(def POL
  "Alpha-3 country code for Poland"
  {:db/ident :lcc-3166-1/POL,
   :lcc-lr/denotes :lcc-3166-1/Poland,
   :lcc-lr/hasTag "POL",
   :lcc-lr/identifies :lcc-3166-1/Poland,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "POL",
   :skos/definition "Alpha-3 country code for Poland"})

(def PR
  "Alpha-2 country code for Puerto Rico"
  {:db/ident :lcc-3166-1/PR,
   :lcc-lr/denotes :lcc-3166-1/PuertoRico,
   :lcc-lr/hasTag "PR",
   :lcc-lr/identifies :lcc-3166-1/PuertoRico,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "PR",
   :skos/definition "Alpha-2 country code for Puerto Rico"})

(def PRI
  "Alpha-3 country code for Puerto Rico"
  {:db/ident :lcc-3166-1/PRI,
   :lcc-lr/denotes :lcc-3166-1/PuertoRico,
   :lcc-lr/hasTag "PRI",
   :lcc-lr/identifies :lcc-3166-1/PuertoRico,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "PRI",
   :skos/definition "Alpha-3 country code for Puerto Rico"})

(def PRK
  "Alpha-3 country code for Korea Democratic Peoples Republic Of"
  {:db/ident :lcc-3166-1/PRK,
   :lcc-lr/denotes :lcc-3166-1/KoreaDemocraticPeoplesRepublicOf,
   :lcc-lr/hasTag "PRK",
   :lcc-lr/identifies :lcc-3166-1/KoreaDemocraticPeoplesRepublicOf,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "PRK",
   :skos/definition
   "Alpha-3 country code for Korea Democratic Peoples Republic Of"})

(def PRT
  "Alpha-3 country code for Portugal"
  {:db/ident :lcc-3166-1/PRT,
   :lcc-lr/denotes :lcc-3166-1/Portugal,
   :lcc-lr/hasTag "PRT",
   :lcc-lr/identifies :lcc-3166-1/Portugal,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "PRT",
   :skos/definition "Alpha-3 country code for Portugal"})

(def PRY
  "Alpha-3 country code for Paraguay"
  {:db/ident :lcc-3166-1/PRY,
   :lcc-lr/denotes :lcc-3166-1/Paraguay,
   :lcc-lr/hasTag "PRY",
   :lcc-lr/identifies :lcc-3166-1/Paraguay,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "PRY",
   :skos/definition "Alpha-3 country code for Paraguay"})

(def PS
  "Alpha-2 country code for Palestine, State of"
  {:db/ident :lcc-3166-1/PS,
   :lcc-lr/denotes :lcc-3166-1/Palestine,
   :lcc-lr/hasTag "PS",
   :lcc-lr/identifies :lcc-3166-1/Palestine,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "PS",
   :skos/definition "Alpha-2 country code for Palestine, State of"})

(def PSE
  "Alpha-3 country code for Palestine, State of"
  {:db/ident :lcc-3166-1/PSE,
   :lcc-lr/denotes :lcc-3166-1/Palestine,
   :lcc-lr/hasTag "PSE",
   :lcc-lr/identifies :lcc-3166-1/Palestine,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "PSE",
   :skos/definition "Alpha-3 country code for Palestine, State of"})

(def PT
  "Alpha-2 country code for Portugal"
  {:db/ident :lcc-3166-1/PT,
   :lcc-lr/denotes :lcc-3166-1/Portugal,
   :lcc-lr/hasTag "PT",
   :lcc-lr/identifies :lcc-3166-1/Portugal,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "PT",
   :skos/definition "Alpha-2 country code for Portugal"})

(def PW
  "Alpha-2 country code for Palau"
  {:db/ident :lcc-3166-1/PW,
   :lcc-lr/denotes :lcc-3166-1/Palau,
   :lcc-lr/hasTag "PW",
   :lcc-lr/identifies :lcc-3166-1/Palau,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "PW",
   :skos/definition "Alpha-2 country code for Palau"})

(def PY
  "Alpha-2 country code for Paraguay"
  {:db/ident :lcc-3166-1/PY,
   :lcc-lr/denotes :lcc-3166-1/Paraguay,
   :lcc-lr/hasTag "PY",
   :lcc-lr/identifies :lcc-3166-1/Paraguay,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "PY",
   :skos/definition "Alpha-2 country code for Paraguay"})

(def PYF
  "Alpha-3 country code for French Polynesia"
  {:db/ident :lcc-3166-1/PYF,
   :lcc-lr/denotes :lcc-3166-1/FrenchPolynesia,
   :lcc-lr/hasTag "PYF",
   :lcc-lr/identifies :lcc-3166-1/FrenchPolynesia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "PYF",
   :skos/definition "Alpha-3 country code for French Polynesia"})

(def Pakistan
  "the country of Pakistan"
  {:db/ident :lcc-3166-1/Pakistan,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Islamic Republic of Pakistan@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Pakistan@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "PAKISTAN@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République islamique du Pakistan@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Pakistan (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "PAKISTAN@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Pākistān@ur",
   :lcc-cr/hasNumericRegionCode "586",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/Urdu :lcc-639-1/English],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [#voc/lstr "Pākistān@ur" #voc/lstr "Pakistan@en"],
   :skos/definition "the country of Pakistan"})

(def Palau
  "the country of Palau"
  {:db/ident :lcc-3166-1/Palau,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Palau@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Palau@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "PALAU@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République des Palaos@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Palaos (les)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "PALAOS@fr",
   :lcc-cr/hasLocalShortName "Belau",
   :lcc-cr/hasNumericRegionCode "585",
   :lcc-cr/hasRemarks
   "Comprises: the west part of the Caroline Islands (Principal island: Babelthuap).",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/English :lcc-639-2/Palauan],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Palau@en",
   :skos/definition "the country of Palau"})

(def Palestine
  "the country of Palestine, State of"
  {:db/ident :lcc-3166-1/Palestine,
   :lcc-cr/hasEnglishFullName #voc/lstr "the State of Palestine@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Palestine, State of@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "PALESTINE, STATE OF@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "l'État de Palestine@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Palestine, État de@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "PALESTINE, ÉTAT DE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Dawlat Filasţīn@ar",
   :lcc-cr/hasNumericRegionCode "275",
   :lcc-cr/hasRemarks "Remark: Conventional names.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Arabic,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Dawlat Filasţīn@ar",
   :skos/definition "the country of Palestine, State of"})

(def Panama
  "the country of Panama"
  {:db/ident :lcc-3166-1/Panama,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Panama@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Panama@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "PANAMA@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République du Panama@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Panama (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "PANAMA@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Panamá@es",
   :lcc-cr/hasNumericRegionCode "591",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Spanish,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Panamá@es",
   :skos/definition "the country of Panama"})

(def PapuaNewGuinea
  "the country of Papua New Guinea"
  {:db/ident :lcc-3166-1/PapuaNewGuinea,
   :lcc-cr/hasEnglishFullName #voc/lstr
                               "the Independent State of Papua New Guinea@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Papua New Guinea@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "PAPUA NEW GUINEA@en",
   :lcc-cr/hasFrenchFullName
   #voc/lstr "l'État indépendant de Papouasie-Nouvelle-Guinée@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Papouasie-Nouvelle-Guinée (la)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr
                                         "PAPOUASIE-NOUVELLE-GUINÉE@fr",
   :lcc-cr/hasLocalShortName ["Papuaniugini" #voc/lstr "Papuaniugini@ho"],
   :lcc-cr/hasNumericRegionCode "598",
   :lcc-cr/hasRemarks
   "Includes: Bismarck Archipelago, Northern Solomon Islands (Principal island: Bougainville).",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage
   [:lcc-639-1/HiriMotu :lcc-639-1/English :lcc-639-2/TokPisin],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [#voc/lstr "Papuaniugini@ho" #voc/lstr "Papua New Guinea@en"],
   :skos/definition "the country of Papua New Guinea"})

(def Paraguay
  "the country of Paraguay"
  {:db/ident :lcc-3166-1/Paraguay,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Paraguay@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Paraguay@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "PARAGUAY@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République du Paraguay@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Paraguay (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "PARAGUAY@fr",
   :lcc-cr/hasLocalShortName [#voc/lstr "Paraguay@gn"
                              #voc/lstr "Paraguay (el)@es"],
   :lcc-cr/hasNumericRegionCode "600",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/Guarani :lcc-639-1/Spanish],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [#voc/lstr "Paraguay (el)@es" #voc/lstr "Paraguay@gn"],
   :skos/definition "the country of Paraguay"})

(def Peru
  "the country of Peru"
  {:db/ident :lcc-3166-1/Peru,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Peru@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Peru@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "PERU@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République du Pérou@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Pérou (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "PÉROU@fr",
   :lcc-cr/hasLocalShortName
   [#voc/lstr "Perú (el)@es" #voc/lstr "Perú@qu" #voc/lstr "Perú@ay"],
   :lcc-cr/hasNumericRegionCode "604",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage
   [:lcc-639-1/Spanish :lcc-639-1/Quechua :lcc-639-1/Aymara],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label
   [#voc/lstr "Perú@qu" #voc/lstr "Perú@ay" #voc/lstr "Perú (el)@es"],
   :skos/definition "the country of Peru"})

(def Philippines
  "the country of Philippines (the)"
  {:db/ident :lcc-3166-1/Philippines,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of the Philippines@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Philippines (the)@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "PHILIPPINES@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République des Philippines@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Philippines (les)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "PHILIPPINES@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Pilipinas@tl",
   :lcc-cr/hasNumericRegionCode "608",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/Tagalog :lcc-639-1/English],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [#voc/lstr "Pilipinas@tl" #voc/lstr "Philippines (the)@en"],
   :skos/definition "the country of Philippines (the)"})

(def Pitcairn
  "the country of Pitcairn"
  {:db/ident :lcc-3166-1/Pitcairn,
   :lcc-cr/hasEnglishShortName #voc/lstr "Pitcairn@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "PITCAIRN@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Pitcairn@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "PITCAIRN@fr",
   :lcc-cr/hasNumericRegionCode "612",
   :lcc-cr/hasRemarks
   ["No subdivisions relevant for this standard."
    "Includes: Ducie Island, Henderson Island, Oeno Island."],
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Pitcairn@en",
   :skos/definition "the country of Pitcairn"})

(def Poland
  "the country of Poland"
  {:db/ident :lcc-3166-1/Poland,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Poland@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Poland@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "POLAND@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République de Pologne@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Pologne (la)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "POLOGNE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Polska@pl",
   :lcc-cr/hasNumericRegionCode "616",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Polish,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Polska@pl",
   :skos/definition "the country of Poland"})

(def Portugal
  "the country of Portugal"
  {:db/ident :lcc-3166-1/Portugal,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Portuguese Republic@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Portugal@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "PORTUGAL@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République portugaise@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Portugal (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "PORTUGAL@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Portugal@pt",
   :lcc-cr/hasNumericRegionCode "620",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Portuguese,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Portugal@pt",
   :skos/definition "the country of Portugal"})

(def PuertoRico
  "the country of Puerto Rico"
  {:db/ident :lcc-3166-1/PuertoRico,
   :lcc-cr/hasEnglishShortName #voc/lstr "Puerto Rico@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "PUERTO RICO@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Porto Rico@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "PORTO RICO@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Puerto Rico@es",
   :lcc-cr/hasNumericRegionCode "630",
   :lcc-cr/hasRemarks
   "No subdivisions relevant for this standard. Included also as a subdivision of the United States (US-PR).",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/Spanish :lcc-639-1/English],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [#voc/lstr "Puerto Rico@es" #voc/lstr "Puerto Rico@en"],
   :skos/definition "the country of Puerto Rico"})

(def QA
  "Alpha-2 country code for Qatar"
  {:db/ident :lcc-3166-1/QA,
   :lcc-lr/denotes :lcc-3166-1/Qatar,
   :lcc-lr/hasTag "QA",
   :lcc-lr/identifies :lcc-3166-1/Qatar,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "QA",
   :skos/definition "Alpha-2 country code for Qatar"})

(def QAT
  "Alpha-3 country code for Qatar"
  {:db/ident :lcc-3166-1/QAT,
   :lcc-lr/denotes :lcc-3166-1/Qatar,
   :lcc-lr/hasTag "QAT",
   :lcc-lr/identifies :lcc-3166-1/Qatar,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "QAT",
   :skos/definition "Alpha-3 country code for Qatar"})

(def Qatar
  "the country of Qatar"
  {:db/ident :lcc-3166-1/Qatar,
   :lcc-cr/hasEnglishFullName #voc/lstr "the State of Qatar@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Qatar@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "QATAR@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "l'État du Qatar@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Qatar (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "QATAR@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Qaţar@ar",
   :lcc-cr/hasNumericRegionCode "634",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Arabic,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Qaţar@ar",
   :skos/definition "the country of Qatar"})

(def RE
  "Alpha-2 country code for Réunion"
  {:db/ident :lcc-3166-1/RE,
   :lcc-lr/denotes :lcc-3166-1/Reunion,
   :lcc-lr/hasTag "RE",
   :lcc-lr/identifies :lcc-3166-1/Reunion,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "RE",
   :skos/definition "Alpha-2 country code for Réunion"})

(def REU
  "Alpha-3 country code for Réunion"
  {:db/ident :lcc-3166-1/REU,
   :lcc-lr/denotes :lcc-3166-1/Reunion,
   :lcc-lr/hasTag "REU",
   :lcc-lr/identifies :lcc-3166-1/Reunion,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "REU",
   :skos/definition "Alpha-3 country code for Réunion"})

(def RO
  "Alpha-2 country code for Romania"
  {:db/ident :lcc-3166-1/RO,
   :lcc-lr/denotes :lcc-3166-1/Romania,
   :lcc-lr/hasTag "RO",
   :lcc-lr/identifies :lcc-3166-1/Romania,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "RO",
   :skos/definition "Alpha-2 country code for Romania"})

(def ROU
  "Alpha-3 country code for Romania"
  {:db/ident :lcc-3166-1/ROU,
   :lcc-lr/denotes :lcc-3166-1/Romania,
   :lcc-lr/hasTag "ROU",
   :lcc-lr/identifies :lcc-3166-1/Romania,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ROU",
   :skos/definition "Alpha-3 country code for Romania"})

(def RS
  "Alpha-2 country code for Serbia"
  {:db/ident :lcc-3166-1/RS,
   :lcc-lr/denotes :lcc-3166-1/Serbia,
   :lcc-lr/hasTag "RS",
   :lcc-lr/identifies :lcc-3166-1/Serbia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "RS",
   :skos/definition "Alpha-2 country code for Serbia"})

(def RU
  "Alpha-2 country code for Russian Federation (the)"
  {:db/ident :lcc-3166-1/RU,
   :lcc-lr/denotes :lcc-3166-1/RussianFederation,
   :lcc-lr/hasTag "RU",
   :lcc-lr/identifies :lcc-3166-1/RussianFederation,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "RU",
   :skos/definition "Alpha-2 country code for Russian Federation (the)"})

(def RUS
  "Alpha-3 country code for Russian Federation (the)"
  {:db/ident :lcc-3166-1/RUS,
   :lcc-lr/denotes :lcc-3166-1/RussianFederation,
   :lcc-lr/hasTag "RUS",
   :lcc-lr/identifies :lcc-3166-1/RussianFederation,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "RUS",
   :skos/definition "Alpha-3 country code for Russian Federation (the)"})

(def RW
  "Alpha-2 country code for Rwanda"
  {:db/ident :lcc-3166-1/RW,
   :lcc-lr/denotes :lcc-3166-1/Rwanda,
   :lcc-lr/hasTag "RW",
   :lcc-lr/identifies :lcc-3166-1/Rwanda,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "RW",
   :skos/definition "Alpha-2 country code for Rwanda"})

(def RWA
  "Alpha-3 country code for Rwanda"
  {:db/ident :lcc-3166-1/RWA,
   :lcc-lr/denotes :lcc-3166-1/Rwanda,
   :lcc-lr/hasTag "RWA",
   :lcc-lr/identifies :lcc-3166-1/Rwanda,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "RWA",
   :skos/definition "Alpha-3 country code for Rwanda"})

(def Reunion
  "the country of Réunion"
  {:db/ident :lcc-3166-1/Reunion,
   :lcc-cr/hasEnglishShortName #voc/lstr "Réunion@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "RÉUNION@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Réunion (La)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "RÉUNION@fr",
   :lcc-cr/hasNumericRegionCode "638",
   :lcc-cr/hasRemarks
   "No subdivisions relevant for this standard. Included also as a subdivision of France (FR-RE).",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Réunion (La)@fr",
   :skos/definition "the country of Réunion"})

(def Romania
  "the country of Romania"
  {:db/ident :lcc-3166-1/Romania,
   :lcc-cr/hasEnglishShortName #voc/lstr "Romania@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "ROMANIA@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Roumanie (la)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "ROUMANIE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "România@ro",
   :lcc-cr/hasNumericRegionCode "642",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Romanian,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "România@ro",
   :skos/definition "the country of Romania"})

(def RussianFederation
  "the country of Russian Federation (the)"
  {:db/ident :lcc-3166-1/RussianFederation,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Russian Federation@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Russian Federation (the)@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "RUSSIAN FEDERATION@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la Fédération de Russie@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Russie (la Fédération de)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "RUSSIE, FÉDÉRATION DE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Rossijskaja Federacija@ru",
   :lcc-cr/hasNumericRegionCode "643",
   :lcc-cr/hasRemarks "Includes: the Kaliningrad Region.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Russian,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Rossijskaja Federacija@ru",
   :skos/definition "the country of Russian Federation (the)"})

(def Rwanda
  "the country of Rwanda"
  {:db/ident :lcc-3166-1/Rwanda,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Rwanda@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Rwanda@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "RWANDA@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République du Rwanda@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Rwanda (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "RWANDA@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Rwanda@rw",
   :lcc-cr/hasNumericRegionCode "646",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage
   [:lcc-639-1/French :lcc-639-1/English :lcc-639-1/Kinyarwanda],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label
   [#voc/lstr "Rwanda (le)@fr" #voc/lstr "Rwanda@en" #voc/lstr "Rwanda@rw"],
   :skos/definition "the country of Rwanda"})

(def SA
  "Alpha-2 country code for Saudi Arabia"
  {:db/ident :lcc-3166-1/SA,
   :lcc-lr/denotes :lcc-3166-1/SaudiArabia,
   :lcc-lr/hasTag "SA",
   :lcc-lr/identifies :lcc-3166-1/SaudiArabia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SA",
   :skos/definition "Alpha-2 country code for Saudi Arabia"})

(def SAU
  "Alpha-3 country code for Saudi Arabia"
  {:db/ident :lcc-3166-1/SAU,
   :lcc-lr/denotes :lcc-3166-1/SaudiArabia,
   :lcc-lr/hasTag "SAU",
   :lcc-lr/identifies :lcc-3166-1/SaudiArabia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SAU",
   :skos/definition "Alpha-3 country code for Saudi Arabia"})

(def SB
  "Alpha-2 country code for Solomon Islands"
  {:db/ident :lcc-3166-1/SB,
   :lcc-lr/denotes :lcc-3166-1/SolomonIslands,
   :lcc-lr/hasTag "SB",
   :lcc-lr/identifies :lcc-3166-1/SolomonIslands,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SB",
   :skos/definition "Alpha-2 country code for Solomon Islands"})

(def SC
  "Alpha-2 country code for Seychelles"
  {:db/ident :lcc-3166-1/SC,
   :lcc-lr/denotes :lcc-3166-1/Seychelles,
   :lcc-lr/hasTag "SC",
   :lcc-lr/identifies :lcc-3166-1/Seychelles,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SC",
   :skos/definition "Alpha-2 country code for Seychelles"})

(def SD
  "Alpha-2 country code for Sudan (the)"
  {:db/ident :lcc-3166-1/SD,
   :lcc-lr/denotes :lcc-3166-1/Sudan,
   :lcc-lr/hasTag "SD",
   :lcc-lr/identifies :lcc-3166-1/Sudan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SD",
   :skos/definition "Alpha-2 country code for Sudan (the)"})

(def SDN
  "Alpha-3 country code for Sudan (the)"
  {:db/ident :lcc-3166-1/SDN,
   :lcc-lr/denotes :lcc-3166-1/Sudan,
   :lcc-lr/hasTag "SDN",
   :lcc-lr/identifies :lcc-3166-1/Sudan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SDN",
   :skos/definition "Alpha-3 country code for Sudan (the)"})

(def SE
  "Alpha-2 country code for Sweden"
  {:db/ident :lcc-3166-1/SE,
   :lcc-lr/denotes :lcc-3166-1/Sweden,
   :lcc-lr/hasTag "SE",
   :lcc-lr/identifies :lcc-3166-1/Sweden,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SE",
   :skos/definition "Alpha-2 country code for Sweden"})

(def SEN
  "Alpha-3 country code for Senegal"
  {:db/ident :lcc-3166-1/SEN,
   :lcc-lr/denotes :lcc-3166-1/Senegal,
   :lcc-lr/hasTag "SEN",
   :lcc-lr/identifies :lcc-3166-1/Senegal,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SEN",
   :skos/definition "Alpha-3 country code for Senegal"})

(def SG
  "Alpha-2 country code for Singapore"
  {:db/ident :lcc-3166-1/SG,
   :lcc-lr/denotes :lcc-3166-1/Singapore,
   :lcc-lr/hasTag "SG",
   :lcc-lr/identifies :lcc-3166-1/Singapore,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SG",
   :skos/definition "Alpha-2 country code for Singapore"})

(def SGP
  "Alpha-3 country code for Singapore"
  {:db/ident :lcc-3166-1/SGP,
   :lcc-lr/denotes :lcc-3166-1/Singapore,
   :lcc-lr/hasTag "SGP",
   :lcc-lr/identifies :lcc-3166-1/Singapore,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SGP",
   :skos/definition "Alpha-3 country code for Singapore"})

(def SGS
  "Alpha-3 country code for South Georgia and the South Sandwich Islands"
  {:db/ident :lcc-3166-1/SGS,
   :lcc-lr/denotes :lcc-3166-1/SouthGeorgiaAndTheSouthSandwichIslands,
   :lcc-lr/hasTag "SGS",
   :lcc-lr/identifies :lcc-3166-1/SouthGeorgiaAndTheSouthSandwichIslands,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SGS",
   :skos/definition
   "Alpha-3 country code for South Georgia and the South Sandwich Islands"})

(def SH
  "Alpha-2 country code for Saint Helena, Ascension and Tristan da Cunha"
  {:db/ident :lcc-3166-1/SH,
   :lcc-lr/denotes :lcc-3166-1/SaintHelena,
   :lcc-lr/hasTag "SH",
   :lcc-lr/identifies :lcc-3166-1/SaintHelena,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SH",
   :skos/definition
   "Alpha-2 country code for Saint Helena, Ascension and Tristan da Cunha"})

(def SHN
  "Alpha-3 country code for Saint Helena, Ascension and Tristan da Cunha"
  {:db/ident :lcc-3166-1/SHN,
   :lcc-lr/denotes :lcc-3166-1/SaintHelena,
   :lcc-lr/hasTag "SHN",
   :lcc-lr/identifies :lcc-3166-1/SaintHelena,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SHN",
   :skos/definition
   "Alpha-3 country code for Saint Helena, Ascension and Tristan da Cunha"})

(def SI
  "Alpha-2 country code for Slovenia"
  {:db/ident :lcc-3166-1/SI,
   :lcc-lr/denotes :lcc-3166-1/Slovenia,
   :lcc-lr/hasTag "SI",
   :lcc-lr/identifies :lcc-3166-1/Slovenia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SI",
   :skos/definition "Alpha-2 country code for Slovenia"})

(def SJ
  "Alpha-2 country code for Svalbard and Jan Mayen"
  {:db/ident :lcc-3166-1/SJ,
   :lcc-lr/denotes :lcc-3166-1/SvalbardAndJanMayen,
   :lcc-lr/hasTag "SJ",
   :lcc-lr/identifies :lcc-3166-1/SvalbardAndJanMayen,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SJ",
   :skos/definition "Alpha-2 country code for Svalbard and Jan Mayen"})

(def SJM
  "Alpha-3 country code for Svalbard and Jan Mayen"
  {:db/ident :lcc-3166-1/SJM,
   :lcc-lr/denotes :lcc-3166-1/SvalbardAndJanMayen,
   :lcc-lr/hasTag "SJM",
   :lcc-lr/identifies :lcc-3166-1/SvalbardAndJanMayen,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SJM",
   :skos/definition "Alpha-3 country code for Svalbard and Jan Mayen"})

(def SK
  "Alpha-2 country code for Slovakia"
  {:db/ident :lcc-3166-1/SK,
   :lcc-lr/denotes :lcc-3166-1/Slovakia,
   :lcc-lr/hasTag "SK",
   :lcc-lr/identifies :lcc-3166-1/Slovakia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SK",
   :skos/definition "Alpha-2 country code for Slovakia"})

(def SL
  "Alpha-2 country code for Sierra Leone"
  {:db/ident :lcc-3166-1/SL,
   :lcc-lr/denotes :lcc-3166-1/SierraLeone,
   :lcc-lr/hasTag "SL",
   :lcc-lr/identifies :lcc-3166-1/SierraLeone,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SL",
   :skos/definition "Alpha-2 country code for Sierra Leone"})

(def SLB
  "Alpha-3 country code for Solomon Islands"
  {:db/ident :lcc-3166-1/SLB,
   :lcc-lr/denotes :lcc-3166-1/SolomonIslands,
   :lcc-lr/hasTag "SLB",
   :lcc-lr/identifies :lcc-3166-1/SolomonIslands,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SLB",
   :skos/definition "Alpha-3 country code for Solomon Islands"})

(def SLE
  "Alpha-3 country code for Sierra Leone"
  {:db/ident :lcc-3166-1/SLE,
   :lcc-lr/denotes :lcc-3166-1/SierraLeone,
   :lcc-lr/hasTag "SLE",
   :lcc-lr/identifies :lcc-3166-1/SierraLeone,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SLE",
   :skos/definition "Alpha-3 country code for Sierra Leone"})

(def SLV
  "Alpha-3 country code for El Salvador"
  {:db/ident :lcc-3166-1/SLV,
   :lcc-lr/denotes :lcc-3166-1/ElSalvador,
   :lcc-lr/hasTag "SLV",
   :lcc-lr/identifies :lcc-3166-1/ElSalvador,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SLV",
   :skos/definition "Alpha-3 country code for El Salvador"})

(def SM
  "Alpha-2 country code for San Marino"
  {:db/ident :lcc-3166-1/SM,
   :lcc-lr/denotes :lcc-3166-1/SanMarino,
   :lcc-lr/hasTag "SM",
   :lcc-lr/identifies :lcc-3166-1/SanMarino,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SM",
   :skos/definition "Alpha-2 country code for San Marino"})

(def SMR
  "Alpha-3 country code for San Marino"
  {:db/ident :lcc-3166-1/SMR,
   :lcc-lr/denotes :lcc-3166-1/SanMarino,
   :lcc-lr/hasTag "SMR",
   :lcc-lr/identifies :lcc-3166-1/SanMarino,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SMR",
   :skos/definition "Alpha-3 country code for San Marino"})

(def SN
  "Alpha-2 country code for Senegal"
  {:db/ident :lcc-3166-1/SN,
   :lcc-lr/denotes :lcc-3166-1/Senegal,
   :lcc-lr/hasTag "SN",
   :lcc-lr/identifies :lcc-3166-1/Senegal,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SN",
   :skos/definition "Alpha-2 country code for Senegal"})

(def SO
  "Alpha-2 country code for Somalia"
  {:db/ident :lcc-3166-1/SO,
   :lcc-lr/denotes :lcc-3166-1/Somalia,
   :lcc-lr/hasTag "SO",
   :lcc-lr/identifies :lcc-3166-1/Somalia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SO",
   :skos/definition "Alpha-2 country code for Somalia"})

(def SOM
  "Alpha-3 country code for Somalia"
  {:db/ident :lcc-3166-1/SOM,
   :lcc-lr/denotes :lcc-3166-1/Somalia,
   :lcc-lr/hasTag "SOM",
   :lcc-lr/identifies :lcc-3166-1/Somalia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SOM",
   :skos/definition "Alpha-3 country code for Somalia"})

(def SPM
  "Alpha-3 country code for Saint Pierre and Miquelon"
  {:db/ident :lcc-3166-1/SPM,
   :lcc-lr/denotes :lcc-3166-1/SaintPierreAndMiquelon,
   :lcc-lr/hasTag "SPM",
   :lcc-lr/identifies :lcc-3166-1/SaintPierreAndMiquelon,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SPM",
   :skos/definition "Alpha-3 country code for Saint Pierre and Miquelon"})

(def SR
  "Alpha-2 country code for Suriname"
  {:db/ident :lcc-3166-1/SR,
   :lcc-lr/denotes :lcc-3166-1/Suriname,
   :lcc-lr/hasTag "SR",
   :lcc-lr/identifies :lcc-3166-1/Suriname,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SR",
   :skos/definition "Alpha-2 country code for Suriname"})

(def SRB
  "Alpha-3 country code for Serbia"
  {:db/ident :lcc-3166-1/SRB,
   :lcc-lr/denotes :lcc-3166-1/Serbia,
   :lcc-lr/hasTag "SRB",
   :lcc-lr/identifies :lcc-3166-1/Serbia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SRB",
   :skos/definition "Alpha-3 country code for Serbia"})

(def SS
  "Alpha-2 country code for South Sudan"
  {:db/ident :lcc-3166-1/SS,
   :lcc-lr/denotes :lcc-3166-1/SouthSudan,
   :lcc-lr/hasTag "SS",
   :lcc-lr/identifies :lcc-3166-1/SouthSudan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SS",
   :skos/definition "Alpha-2 country code for South Sudan"})

(def SSD
  "Alpha-3 country code for South Sudan"
  {:db/ident :lcc-3166-1/SSD,
   :lcc-lr/denotes :lcc-3166-1/SouthSudan,
   :lcc-lr/hasTag "SSD",
   :lcc-lr/identifies :lcc-3166-1/SouthSudan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SSD",
   :skos/definition "Alpha-3 country code for South Sudan"})

(def ST
  "Alpha-2 country code for Sao Tome and Principe"
  {:db/ident :lcc-3166-1/ST,
   :lcc-lr/denotes :lcc-3166-1/SaoTomeAndPrincipe,
   :lcc-lr/hasTag "ST",
   :lcc-lr/identifies :lcc-3166-1/SaoTomeAndPrincipe,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ST",
   :skos/definition "Alpha-2 country code for Sao Tome and Principe"})

(def STP
  "Alpha-3 country code for Sao Tome and Principe"
  {:db/ident :lcc-3166-1/STP,
   :lcc-lr/denotes :lcc-3166-1/SaoTomeAndPrincipe,
   :lcc-lr/hasTag "STP",
   :lcc-lr/identifies :lcc-3166-1/SaoTomeAndPrincipe,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "STP",
   :skos/definition "Alpha-3 country code for Sao Tome and Principe"})

(def SUR
  "Alpha-3 country code for Suriname"
  {:db/ident :lcc-3166-1/SUR,
   :lcc-lr/denotes :lcc-3166-1/Suriname,
   :lcc-lr/hasTag "SUR",
   :lcc-lr/identifies :lcc-3166-1/Suriname,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SUR",
   :skos/definition "Alpha-3 country code for Suriname"})

(def SV
  "Alpha-2 country code for El Salvador"
  {:db/ident :lcc-3166-1/SV,
   :lcc-lr/denotes :lcc-3166-1/ElSalvador,
   :lcc-lr/hasTag "SV",
   :lcc-lr/identifies :lcc-3166-1/ElSalvador,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SV",
   :skos/definition "Alpha-2 country code for El Salvador"})

(def SVK
  "Alpha-3 country code for Slovakia"
  {:db/ident :lcc-3166-1/SVK,
   :lcc-lr/denotes :lcc-3166-1/Slovakia,
   :lcc-lr/hasTag "SVK",
   :lcc-lr/identifies :lcc-3166-1/Slovakia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SVK",
   :skos/definition "Alpha-3 country code for Slovakia"})

(def SVN
  "Alpha-3 country code for Slovenia"
  {:db/ident :lcc-3166-1/SVN,
   :lcc-lr/denotes :lcc-3166-1/Slovenia,
   :lcc-lr/hasTag "SVN",
   :lcc-lr/identifies :lcc-3166-1/Slovenia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SVN",
   :skos/definition "Alpha-3 country code for Slovenia"})

(def SWE
  "Alpha-3 country code for Sweden"
  {:db/ident :lcc-3166-1/SWE,
   :lcc-lr/denotes :lcc-3166-1/Sweden,
   :lcc-lr/hasTag "SWE",
   :lcc-lr/identifies :lcc-3166-1/Sweden,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SWE",
   :skos/definition "Alpha-3 country code for Sweden"})

(def SWZ
  "Alpha-3 country code for Eswatini"
  {:db/ident :lcc-3166-1/SWZ,
   :lcc-lr/denotes :lcc-3166-1/Eswatini,
   :lcc-lr/hasTag "SWZ",
   :lcc-lr/identifies :lcc-3166-1/Eswatini,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SWZ",
   :skos/definition "Alpha-3 country code for Eswatini"})

(def SX
  "Alpha-2 country code for Sint Maarten (Dutch part)"
  {:db/ident :lcc-3166-1/SX,
   :lcc-lr/denotes :lcc-3166-1/SintMaarten,
   :lcc-lr/hasTag "SX",
   :lcc-lr/identifies :lcc-3166-1/SintMaarten,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SX",
   :skos/definition "Alpha-2 country code for Sint Maarten (Dutch part)"})

(def SXM
  "Alpha-3 country code for Sint Maarten (Dutch part)"
  {:db/ident :lcc-3166-1/SXM,
   :lcc-lr/denotes :lcc-3166-1/SintMaarten,
   :lcc-lr/hasTag "SXM",
   :lcc-lr/identifies :lcc-3166-1/SintMaarten,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SXM",
   :skos/definition "Alpha-3 country code for Sint Maarten (Dutch part)"})

(def SY
  "Alpha-2 country code for Syrian Arab Republic (the)"
  {:db/ident :lcc-3166-1/SY,
   :lcc-lr/denotes :lcc-3166-1/SyrianArabRepublic,
   :lcc-lr/hasTag "SY",
   :lcc-lr/identifies :lcc-3166-1/SyrianArabRepublic,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SY",
   :skos/definition "Alpha-2 country code for Syrian Arab Republic (the)"})

(def SYC
  "Alpha-3 country code for Seychelles"
  {:db/ident :lcc-3166-1/SYC,
   :lcc-lr/denotes :lcc-3166-1/Seychelles,
   :lcc-lr/hasTag "SYC",
   :lcc-lr/identifies :lcc-3166-1/Seychelles,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SYC",
   :skos/definition "Alpha-3 country code for Seychelles"})

(def SYR
  "Alpha-3 country code for Syrian Arab Republic (the)"
  {:db/ident :lcc-3166-1/SYR,
   :lcc-lr/denotes :lcc-3166-1/SyrianArabRepublic,
   :lcc-lr/hasTag "SYR",
   :lcc-lr/identifies :lcc-3166-1/SyrianArabRepublic,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SYR",
   :skos/definition "Alpha-3 country code for Syrian Arab Republic (the)"})

(def SZ
  "Alpha-2 country code for Eswatini"
  {:db/ident :lcc-3166-1/SZ,
   :lcc-lr/denotes :lcc-3166-1/Eswatini,
   :lcc-lr/hasTag "SZ",
   :lcc-lr/identifies :lcc-3166-1/Eswatini,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "SZ",
   :skos/definition "Alpha-2 country code for Eswatini"})

(def SaintBarthelemy
  "the country of Saint Barthélemy"
  {:db/ident :lcc-3166-1/SaintBarthelemy,
   :lcc-cr/hasEnglishShortName #voc/lstr "Saint Barthélemy@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "SAINT BARTHÉLEMY@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Saint-Barthélemy@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "SAINT-BARTHÉLEMY@fr",
   :lcc-cr/hasNumericRegionCode "652",
   :lcc-cr/hasRemarks
   "No subdivisions relevant for this standard. Included also as subdivision of France (FR-BL).",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Saint-Barthélemy@fr",
   :skos/definition "the country of Saint Barthélemy"})

(def SaintHelena
  "the country of Saint Helena, Ascension and Tristan da Cunha"
  {:db/ident :lcc-3166-1/SaintHelena,
   :lcc-cr/hasEnglishShortName
   #voc/lstr "Saint Helena, Ascension and Tristan da Cunha@en",
   :lcc-cr/hasEnglishShortNameInCapitals
   #voc/lstr "SAINT HELENA, ASCENSION AND TRISTAN DA CUNHA@en",
   :lcc-cr/hasFrenchShortName
   #voc/lstr "Sainte-Hélène, Ascension et Tristan da Cunha@fr",
   :lcc-cr/hasFrenchShortNameInCapitals
   #voc/lstr "SAINTE-HÉLÈNE, ASCENSION ET TRISTAN DA CUNHA@fr",
   :lcc-cr/hasNumericRegionCode "654",
   :lcc-cr/hasRemarks
   "Comprises: Saint Helena Island, Ascension Island, Tristan da Cunha Archipelago (Gough Island, Inaccessible Island, Nightingale Island and Stoltenhoff Island).",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Saint Helena, Ascension and Tristan da Cunha@en",
   :skos/definition
   "the country of Saint Helena, Ascension and Tristan da Cunha"})

(def SaintKittsAndNevis
  "the country of Saint Kitts and Nevis"
  {:db/ident :lcc-3166-1/SaintKittsAndNevis,
   :lcc-cr/hasEnglishShortName #voc/lstr "Saint Kitts and Nevis@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "SAINT KITTS AND NEVIS@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Saint-Kitts-et-Nevis@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "SAINT-KITTS-ET-NEVIS@fr",
   :lcc-cr/hasNumericRegionCode "659",
   :lcc-cr/hasRemarks "the Federation of Saint Kitts and Nevis",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Saint Kitts and Nevis@en",
   :skos/definition "the country of Saint Kitts and Nevis"})

(def SaintLucia
  "the country of Saint Lucia"
  {:db/ident :lcc-3166-1/SaintLucia,
   :lcc-cr/hasEnglishShortName #voc/lstr "Saint Lucia@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "SAINT LUCIA@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Sainte-Lucie@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "SAINTE-LUCIE@fr",
   :lcc-cr/hasNumericRegionCode "662",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Saint Lucia@en",
   :skos/definition "the country of Saint Lucia"})

(def SaintMartin
  "the country of Saint Martin (French part)"
  {:db/ident :lcc-3166-1/SaintMartin,
   :lcc-cr/hasEnglishShortName #voc/lstr "Saint Martin (French part)@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr
                                          "SAINT MARTIN (FRENCH PART)@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Saint-Martin (partie française)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr
                                         "SAINT-MARTIN (PARTIE FRANÇAISE)@fr",
   :lcc-cr/hasNumericRegionCode "663",
   :lcc-cr/hasRemarks
   ["No subdivisions relevant for this standard. Included also as subdivision of France (FR-MF)."
    "The island of Saint Martin is divided into the northern French part and the southern Dutch part."],
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Saint-Martin (partie française)@fr",
   :skos/definition "the country of Saint Martin (French part)"})

(def SaintPierreAndMiquelon
  "the country of Saint Pierre and Miquelon"
  {:db/ident :lcc-3166-1/SaintPierreAndMiquelon,
   :lcc-cr/hasEnglishShortName #voc/lstr "Saint Pierre and Miquelon@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr
                                          "SAINT PIERRE AND MIQUELON@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Saint-Pierre-et-Miquelon@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "SAINT-PIERRE-ET-MIQUELON@fr",
   :lcc-cr/hasNumericRegionCode "666",
   :lcc-cr/hasRemarks
   ["Miquelon * is the second significant part of composite country name."
    "No subdivisions relevant for this standard. Included also as a subdivision of France (FR-PM)."],
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Saint-Pierre-et-Miquelon@fr",
   :skos/definition "the country of Saint Pierre and Miquelon"})

(def SaintVincentAndTheGrenadines
  "the country of Saint Vincent and the Grenadines"
  {:db/ident :lcc-3166-1/SaintVincentAndTheGrenadines,
   :lcc-cr/hasEnglishShortName #voc/lstr "Saint Vincent and the Grenadines@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr
                                          "SAINT VINCENT AND THE GRENADINES@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Saint-Vincent-et-les Grenadines@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr
                                         "SAINT-VINCENT-ET-LES GRENADINES@fr",
   :lcc-cr/hasNumericRegionCode "670",
   :lcc-cr/hasRemarks
   "Comprises: Northern Grenadine Islands (Principal island: Bequia), Saint Vincent Island.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Saint Vincent and the Grenadines@en",
   :skos/definition "the country of Saint Vincent and the Grenadines"})

(def Samoa
  "the country of Samoa"
  {:db/ident :lcc-3166-1/Samoa,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Independent State of Samoa@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Samoa@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "SAMOA@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "l'État indépendant du Samoa@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Samoa (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "SAMOA@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Samoa@sm",
   :lcc-cr/hasNumericRegionCode "882",
   :lcc-cr/hasRemarks "Principal islands: Savai'i, Upolu.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/Samoan :lcc-639-1/English],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [#voc/lstr "Samoa@sm" #voc/lstr "Samoa@en"],
   :skos/definition "the country of Samoa"})

(def SanMarino
  "the country of San Marino"
  {:db/ident :lcc-3166-1/SanMarino,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of San Marino@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "San Marino@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "SAN MARINO@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République de Saint-Marin@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Saint-Marin@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "SAINT-MARIN@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "San Marino@it",
   :lcc-cr/hasNumericRegionCode "674",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Italian,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "San Marino@it",
   :skos/definition "the country of San Marino"})

(def SaoTomeAndPrincipe
  "the country of Sao Tome and Principe"
  {:db/ident :lcc-3166-1/SaoTomeAndPrincipe,
   :lcc-cr/hasEnglishFullName
   #voc/lstr "the Democratic Republic of Sao Tome and Principe@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Sao Tome and Principe@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "SAO TOME AND PRINCIPE@en",
   :lcc-cr/hasFrenchFullName
   #voc/lstr "la République démocratique de Sao Tomé-et-Principe@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Sao Tomé-et-Principe@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "SAO TOMÉ-ET-PRINCIPE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "São Tomé e Príncipe@pt",
   :lcc-cr/hasNumericRegionCode "678",
   :lcc-cr/hasRemarks
   "Príncipe* is the second significant part of composite country name.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Portuguese,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "São Tomé e Príncipe@pt",
   :skos/definition "the country of Sao Tome and Principe"})

(def SaudiArabia
  "the country of Saudi Arabia"
  {:db/ident :lcc-3166-1/SaudiArabia,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Kingdom of Saudi Arabia@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Saudi Arabia@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "SAUDI ARABIA@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "le Royaume d'Arabie saoudite@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Arabie saoudite (l')@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "ARABIE SAOUDITE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "As Su‘ūdīyah@ar",
   :lcc-cr/hasNumericRegionCode "682",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Arabic,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "As Su‘ūdīyah@ar",
   :skos/definition "the country of Saudi Arabia"})

(def Senegal
  "the country of Senegal"
  {:db/ident :lcc-3166-1/Senegal,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Senegal@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Senegal@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "SENEGAL@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République du Sénégal@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Sénégal (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "SÉNÉGAL@fr",
   :lcc-cr/hasNumericRegionCode "686",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Sénégal (le)@fr",
   :skos/definition "the country of Senegal"})

(def Serbia
  "the country of Serbia"
  {:db/ident :lcc-3166-1/Serbia,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Serbia@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Serbia@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "SERBIA@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République de Serbie@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Serbie (la)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "SERBIE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Srbija@sr",
   :lcc-cr/hasNumericRegionCode "688",
   :lcc-cr/hasRemarks
   "Serbia was formerly part of former entries: YUGOSLAVIA (YU, YUG, 891) then SERBIA AND MONTENEGRO (CS, SCG, 891).",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Serbian,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Srbija@sr",
   :skos/definition "the country of Serbia"})

(def SeselwaCreoleFrench
  "Seselwa Creole French language"
  {:db/ident :lcc-3166-1/SeselwaCreoleFrench,
   :lcc-lr/hasEnglishName #voc/lstr "Seselwa Creole French@en",
   :lcc-lr/hasFrenchName #voc/lstr "créole seselwa@fr",
   :lcc-lr/hasIndigenousName "kreol",
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/comment
   "Part of ISO 639-3, not otherwise represented in OMG ontologies",
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "Seselwa Creole French",
   :skos/definition "Seselwa Creole French language"})

(def Seychelles
  "the country of Seychelles"
  {:db/ident :lcc-3166-1/Seychelles,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Seychelles@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Seychelles@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "SEYCHELLES@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République des Seychelles@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Seychelles (les)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "SEYCHELLES@fr",
   :lcc-cr/hasLocalShortName "Sesel",
   :lcc-cr/hasNumericRegionCode "690",
   :lcc-cr/hasRemarks
   "Principal island: Mahé; includes Aldabra Islands, Amirante Islands, Cosmoledo Islands, Farquhar Islands.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage
   [:lcc-639-1/English :lcc-639-1/French :lcc-3166-1/SeselwaCreoleFrench],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [#voc/lstr "Seychelles (les)@fr" #voc/lstr "Seychelles@en"],
   :skos/definition "the country of Seychelles"})

(def Shikomor
  "Shikomor language"
  {:db/ident :lcc-3166-1/Shikomor,
   :lcc-lr/hasEnglishName #voc/lstr "Shikomor@en",
   :lcc-lr/hasFrenchName #voc/lstr "comorien@fr",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/comment "Not yet allocated a code in ISO 639",
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "Shikomor",
   :skos/definition "Shikomor language"})

(def SierraLeone
  "the country of Sierra Leone"
  {:db/ident :lcc-3166-1/SierraLeone,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Sierra Leone@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Sierra Leone@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "SIERRA LEONE@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République de Sierra Leone@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Sierra Leone (la)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "SIERRA LEONE@fr",
   :lcc-cr/hasNumericRegionCode "694",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Sierra Leone@en",
   :skos/definition "the country of Sierra Leone"})

(def Singapore
  "the country of Singapore"
  {:db/ident :lcc-3166-1/Singapore,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Singapore@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Singapore@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "SINGAPORE@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République de Singapour@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Singapour@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "SINGAPOUR@fr",
   :lcc-cr/hasLocalShortName
   [#voc/lstr "Chiṅkappūr@ta" #voc/lstr "Xinjiapo@zh" #voc/lstr "Singapura@ms"],
   :lcc-cr/hasNumericRegionCode "702",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage
   [:lcc-639-1/Tamil :lcc-639-1/Malay :lcc-639-1/Chinese :lcc-639-1/English],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [#voc/lstr "Singapura@ms"
                #voc/lstr "Chiṅkappūr@ta"
                #voc/lstr "Singapore@en"
                #voc/lstr "Xinjiapo@zh"],
   :skos/definition "the country of Singapore"})

(def SintMaarten
  "the country of Sint Maarten (Dutch part)"
  {:db/ident :lcc-3166-1/SintMaarten,
   :lcc-cr/hasEnglishShortName #voc/lstr "Sint Maarten (Dutch part)@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr
                                          "SINT MAARTEN (DUTCH PART)@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Saint-Martin (partie néerlandaise)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals
   #voc/lstr "SAINT-MARTIN (PARTIE NÉERLANDAISE)@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Sint Maarten@nl",
   :lcc-cr/hasNumericRegionCode "534",
   :lcc-cr/hasRemarks
   ["No subdivisions relevant for this standard. Included also as subdivision of Netherlands (NL-SX)."
    "The island of Saint Martin is divided into the northern French part and the southern Dutch part."],
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/Dutch :lcc-639-1/English],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [#voc/lstr "Sint Maarten (Dutch part)@en"
                #voc/lstr "Sint Maarten@nl"],
   :skos/definition "the country of Sint Maarten (Dutch part)"})

(def Slovakia
  "the country of Slovakia"
  {:db/ident :lcc-3166-1/Slovakia,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Slovak Republic@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Slovakia@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "SLOVAKIA@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République slovaque@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Slovaquie (la)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "SLOVAQUIE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Slovensko@sk",
   :lcc-cr/hasNumericRegionCode "703",
   :lcc-cr/hasRemarks
   "Code element SK was formerly used for Sikkim (SK, SKM, --), now part of the entry for India (IN, IND, 356), was reused for Slovakia. See aslo code element SKIN.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Slovak,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Slovensko@sk",
   :skos/definition "the country of Slovakia"})

(def Slovenia
  "the country of Slovenia"
  {:db/ident :lcc-3166-1/Slovenia,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Slovenia@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Slovenia@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "SLOVENIA@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République de Slovénie@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Slovénie (la)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "SLOVÉNIE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Slovenija@sl",
   :lcc-cr/hasNumericRegionCode "705",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Slovenian,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Slovenija@sl",
   :skos/definition "the country of Slovenia"})

(def SolomonIslands
  "the country of Solomon Islands"
  {:db/ident :lcc-3166-1/SolomonIslands,
   :lcc-cr/hasEnglishShortName #voc/lstr "Solomon Islands@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "SOLOMON ISLANDS@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "les Îles Salomon@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Salomon (les Îles)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "SALOMON, ÎLES@fr",
   :lcc-cr/hasNumericRegionCode "090",
   :lcc-cr/hasRemarks
   "Comprises: Santa Cruz Islands, Southern Solomon Islands (Principal island: Guadalcanal).",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Solomon Islands@en",
   :skos/definition "the country of Solomon Islands"})

(def Somalia
  "the country of Somalia"
  {:db/ident :lcc-3166-1/Somalia,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Federal Republic of Somalia@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Somalia@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "SOMALIA@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République fédérale de Somalie@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Somalie (la)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "SOMALIE@fr",
   :lcc-cr/hasLocalShortName [#voc/lstr "Soomaaliya@so"
                              #voc/lstr "Aş Şūmāl@ar"],
   :lcc-cr/hasNumericRegionCode "706",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/Somali :lcc-639-1/Arabic],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [#voc/lstr "Aş Şūmāl@ar" #voc/lstr "Soomaaliya@so"],
   :skos/definition "the country of Somalia"})

(def SouthAfrica
  "the country of South Africa"
  {:db/ident :lcc-3166-1/SouthAfrica,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of South Africa@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "South Africa@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "SOUTH AFRICA@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République sud-africaine@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Afrique du Sud (l')@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "AFRIQUE DU SUD@fr",
   :lcc-cr/hasLocalShortName [#voc/lstr "Afrika-Dzonga@ts"
                              #voc/lstr "Ningizimu Afrika@ss"
                              #voc/lstr "Ningizimu Afrika@zu"
                              #voc/lstr "Afrika Tshipembe@ve"
                              #voc/lstr "Mzantsi Afrika@xh"
                              "Afrika-Borwa"
                              #voc/lstr "Afrika-Borwa@st"
                              #voc/lstr "Afrika-Borwa@tn"
                              #voc/lstr "Sewula Afrika@nr"
                              #voc/lstr "Suid-Afrika@af"],
   :lcc-cr/hasNumericRegionCode "710",
   :lcc-cr/hasRemarks "Includes: Marion Island, Prince Edward Island.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/SouthNdebele
                                       :lcc-639-1/Zulu
                                       :lcc-639-1/Swati
                                       :lcc-639-1/Xhosa
                                       :lcc-639-1/Venda
                                       :lcc-639-1/English
                                       :lcc-639-1/Tswana
                                       :lcc-639-1/SouthernSotho
                                       :lcc-639-2/Pedi
                                       :lcc-639-1/Tsonga
                                       :lcc-639-1/Afrikaans],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [#voc/lstr "Sewula Afrika@nr"
                #voc/lstr "South Africa@en"
                #voc/lstr "Suid-Afrika@af"
                #voc/lstr "Mzantsi Afrika@xh"
                #voc/lstr "Afrika Tshipembe@ve"
                #voc/lstr "Afrika-Dzonga@ts"
                #voc/lstr "Afrika-Borwa@st"
                #voc/lstr "Afrika-Borwa@tn"
                #voc/lstr "Ningizimu Afrika@ss"
                #voc/lstr "Ningizimu Afrika@zu"],
   :skos/definition "the country of South Africa"})

(def SouthGeorgiaAndTheSouthSandwichIslands
  "the country of South Georgia and the South Sandwich Islands"
  {:db/ident :lcc-3166-1/SouthGeorgiaAndTheSouthSandwichIslands,
   :lcc-cr/hasEnglishShortName
   #voc/lstr "South Georgia and the South Sandwich Islands@en",
   :lcc-cr/hasEnglishShortNameInCapitals
   #voc/lstr "SOUTH GEORGIA AND THE SOUTH SANDWICH ISLANDS@en",
   :lcc-cr/hasFrenchShortName
   #voc/lstr "Géorgie du Sud-et-les Îles Sandwich du Sud (la)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals
   #voc/lstr "GÉORGIE DU SUD-ET-LES ÎLES SANDWICH DU SUD@fr",
   :lcc-cr/hasNumericRegionCode "239",
   :lcc-cr/hasRemarks "No subdivisions relevant for this standard.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "South Georgia and the South Sandwich Islands@en",
   :skos/definition
   "the country of South Georgia and the South Sandwich Islands"})

(def SouthSudan
  "the country of South Sudan"
  {:db/ident :lcc-3166-1/SouthSudan,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of South Sudan@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "South Sudan@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "SOUTH SUDAN@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République du Soudan du Sud@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Soudan du Sud (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "SOUDAN DU SUD@fr",
   :lcc-cr/hasNumericRegionCode "728",
   :lcc-cr/hasRemarks
   "Split of Sudan into Sudan (north part) and South Sudan (south part).",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "South Sudan@en",
   :skos/definition "the country of South Sudan"})

(def Spain
  "the country of Spain"
  {:db/ident :lcc-3166-1/Spain,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Kingdom of Spain@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Spain@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "SPAIN@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "le Royaume d'Espagne@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Espagne (l')@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "ESPAGNE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "España@es",
   :lcc-cr/hasNumericRegionCode "724",
   :lcc-cr/hasRemarks
   "Remark: In the autonomous communities of Galicia, Catalonia and the Balearics, the respective regional languages are the sole official languages of toponymy. Castilian language forms are given in square brackets for information. For the autonomous communities of Navarra, Valencia and the Basque Country, with the exception of the province names Bizkaia and Gipuzkoa, the regional language has co-official status with Castilian (regional language forms are marked with an asterisk).",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Spanish,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "España@es",
   :skos/definition "the country of Spain"})

(def SriLanka
  "the country of Sri Lanka"
  {:db/ident :lcc-3166-1/SriLanka,
   :lcc-cr/hasEnglishFullName
   #voc/lstr "the Democratic Socialist Republic of Sri Lanka@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Sri Lanka@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "SRI LANKA@en",
   :lcc-cr/hasFrenchFullName
   #voc/lstr "la République socialiste démocratique du Sri Lanka@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Sri Lanka@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "SRI LANKA@fr",
   :lcc-cr/hasLocalShortName [#voc/lstr "Ilaṅkai@ta" #voc/lstr "Shrī Laṁkā@si"],
   :lcc-cr/hasNumericRegionCode "144",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage
   [:lcc-639-1/Sinhala :lcc-639-1/Tamil :lcc-639-1/English],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label
   [#voc/lstr "Shrī Laṁkā@si" #voc/lstr "Sri Lanka@en" #voc/lstr "Ilaṅkai@ta"],
   :skos/definition "the country of Sri Lanka"})

(def Sudan
  "the country of Sudan (the)"
  {:db/ident :lcc-3166-1/Sudan,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of the Sudan@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Sudan (the)@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "SUDAN@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République du Soudan@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Soudan (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "SOUDAN@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "As Sūdān@ar",
   :lcc-cr/hasNumericRegionCode "729",
   :lcc-cr/hasRemarks
   "Split of Sudan into Sudan (north part) and South Sudan (south part).",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Arabic,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "As Sūdān@ar",
   :skos/definition "the country of Sudan (the)"})

(def Suriname
  "the country of Suriname"
  {:db/ident :lcc-3166-1/Suriname,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Suriname@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Suriname@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "SURINAME@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République du Suriname@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Suriname (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "SURINAME@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Suriname@nl",
   :lcc-cr/hasNumericRegionCode "740",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Dutch,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Suriname@nl",
   :skos/definition "the country of Suriname"})

(def SvalbardAndJanMayen
  "the country of Svalbard and Jan Mayen"
  {:db/ident :lcc-3166-1/SvalbardAndJanMayen,
   :lcc-cr/hasEnglishShortName #voc/lstr "Svalbard and Jan Mayen@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "SVALBARD AND JAN MAYEN@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Svalbard et l'Île Jan Mayen (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr
                                         "SVALBARD ET ÎLE JAN MAYEN@fr",
   :lcc-cr/hasLocalShortName [#voc/lstr "Svalbard og Jan Mayen@nb"
                              #voc/lstr "Svalbard og Jan Mayen@nn"],
   :lcc-cr/hasNumericRegionCode "744",
   :lcc-cr/hasRemarks
   ["Includes: Bear Island."
    "No subdivisions relevant for this standard. Included also as a subdivision of Norway (NO-21, NO-22)."],
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/NorwegianNynorsk
                                       :lcc-639-1/NorwegianBokmal],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [#voc/lstr "Svalbard og Jan Mayen@nb"
                #voc/lstr "Svalbard og Jan Mayen@nn"],
   :skos/definition "the country of Svalbard and Jan Mayen"})

(def Sweden
  "the country of Sweden"
  {:db/ident :lcc-3166-1/Sweden,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Kingdom of Sweden@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Sweden@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "SWEDEN@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "le Royaume de Suède@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Suède (la)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "SUÈDE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Sverige@sv",
   :lcc-cr/hasNumericRegionCode "752",
   :lcc-cr/hasRemarks
   "Remark: Alphabetic and numeric codes co-exist. The alphabetic code is traditionally well known to the general public, whereas the numeric code (placed after the name within square brackets) is used mainly within national administration; it may in the longer term supersede the alphabetic code. ",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Swedish,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Sverige@sv",
   :skos/definition "the country of Sweden"})

(def Switzerland
  "the country of Switzerland"
  {:db/ident :lcc-3166-1/Switzerland,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Swiss Confederation@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Switzerland@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "SWITZERLAND@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la Confédération suisse@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Suisse (la)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "SUISSE@fr",
   :lcc-cr/hasLocalShortName [#voc/lstr "Schweiz (die)@de"
                              #voc/lstr "Svizzera (la)@it"
                              #voc/lstr "Svizra (la)@rm"],
   :lcc-cr/hasNumericRegionCode "756",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage
   [:lcc-639-1/French :lcc-639-1/Romansh :lcc-639-1/Italian :lcc-639-1/German],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [#voc/lstr "Schweiz (die)@de"
                #voc/lstr "Svizzera (la)@it"
                #voc/lstr "Svizra (la)@rm"
                #voc/lstr "Suisse (la)@fr"],
   :skos/definition "the country of Switzerland"})

(def SyrianArabRepublic
  "the country of Syrian Arab Republic (the)"
  {:db/ident :lcc-3166-1/SyrianArabRepublic,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Syrian Arab Republic@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Syrian Arab Republic (the)@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "SYRIAN ARAB REPUBLIC@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République arabe syrienne@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "République arabe syrienne (la)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr
                                         "SYRIENNE, RÉPUBLIQUE ARABE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr
                              "Al Jumhūrīyah al ‘Arabīyah as Sūrīyah@ar",
   :lcc-cr/hasNumericRegionCode "760",
   :lcc-cr/hasRemarks "Often referred to as Syria.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Arabic,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Al Jumhūrīyah al ‘Arabīyah as Sūrīyah@ar",
   :skos/definition "the country of Syrian Arab Republic (the)"})

(def TC
  "Alpha-2 country code for Turks and Caicos Islands (the)"
  {:db/ident :lcc-3166-1/TC,
   :lcc-lr/denotes :lcc-3166-1/TurksAndCaicosIslands,
   :lcc-lr/hasTag "TC",
   :lcc-lr/identifies :lcc-3166-1/TurksAndCaicosIslands,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TC",
   :skos/definition "Alpha-2 country code for Turks and Caicos Islands (the)"})

(def TCA
  "Alpha-3 country code for Turks and Caicos Islands (the)"
  {:db/ident :lcc-3166-1/TCA,
   :lcc-lr/denotes :lcc-3166-1/TurksAndCaicosIslands,
   :lcc-lr/hasTag "TCA",
   :lcc-lr/identifies :lcc-3166-1/TurksAndCaicosIslands,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TCA",
   :skos/definition "Alpha-3 country code for Turks and Caicos Islands (the)"})

(def TCD
  "Alpha-3 country code for Chad"
  {:db/ident :lcc-3166-1/TCD,
   :lcc-lr/denotes :lcc-3166-1/Chad,
   :lcc-lr/hasTag "TCD",
   :lcc-lr/identifies :lcc-3166-1/Chad,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TCD",
   :skos/definition "Alpha-3 country code for Chad"})

(def TD
  "Alpha-2 country code for Chad"
  {:db/ident :lcc-3166-1/TD,
   :lcc-lr/denotes :lcc-3166-1/Chad,
   :lcc-lr/hasTag "TD",
   :lcc-lr/identifies :lcc-3166-1/Chad,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TD",
   :skos/definition "Alpha-2 country code for Chad"})

(def TF
  "Alpha-2 country code for French Southern Territories (the)"
  {:db/ident :lcc-3166-1/TF,
   :lcc-lr/denotes :lcc-3166-1/FrenchSouthernTerritories,
   :lcc-lr/hasTag "TF",
   :lcc-lr/identifies :lcc-3166-1/FrenchSouthernTerritories,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TF",
   :skos/definition
   "Alpha-2 country code for French Southern Territories (the)"})

(def TG
  "Alpha-2 country code for Togo"
  {:db/ident :lcc-3166-1/TG,
   :lcc-lr/denotes :lcc-3166-1/Togo,
   :lcc-lr/hasTag "TG",
   :lcc-lr/identifies :lcc-3166-1/Togo,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TG",
   :skos/definition "Alpha-2 country code for Togo"})

(def TGO
  "Alpha-3 country code for Togo"
  {:db/ident :lcc-3166-1/TGO,
   :lcc-lr/denotes :lcc-3166-1/Togo,
   :lcc-lr/hasTag "TGO",
   :lcc-lr/identifies :lcc-3166-1/Togo,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TGO",
   :skos/definition "Alpha-3 country code for Togo"})

(def TH
  "Alpha-2 country code for Thailand"
  {:db/ident :lcc-3166-1/TH,
   :lcc-lr/denotes :lcc-3166-1/Thailand,
   :lcc-lr/hasTag "TH",
   :lcc-lr/identifies :lcc-3166-1/Thailand,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TH",
   :skos/definition "Alpha-2 country code for Thailand"})

(def THA
  "Alpha-3 country code for Thailand"
  {:db/ident :lcc-3166-1/THA,
   :lcc-lr/denotes :lcc-3166-1/Thailand,
   :lcc-lr/hasTag "THA",
   :lcc-lr/identifies :lcc-3166-1/Thailand,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "THA",
   :skos/definition "Alpha-3 country code for Thailand"})

(def TJ
  "Alpha-2 country code for Tajikistan"
  {:db/ident :lcc-3166-1/TJ,
   :lcc-lr/denotes :lcc-3166-1/Tajikistan,
   :lcc-lr/hasTag "TJ",
   :lcc-lr/identifies :lcc-3166-1/Tajikistan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TJ",
   :skos/definition "Alpha-2 country code for Tajikistan"})

(def TJK
  "Alpha-3 country code for Tajikistan"
  {:db/ident :lcc-3166-1/TJK,
   :lcc-lr/denotes :lcc-3166-1/Tajikistan,
   :lcc-lr/hasTag "TJK",
   :lcc-lr/identifies :lcc-3166-1/Tajikistan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TJK",
   :skos/definition "Alpha-3 country code for Tajikistan"})

(def TK
  "Alpha-2 country code for Tokelau"
  {:db/ident :lcc-3166-1/TK,
   :lcc-lr/denotes :lcc-3166-1/Tokelau,
   :lcc-lr/hasTag "TK",
   :lcc-lr/identifies :lcc-3166-1/Tokelau,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TK",
   :skos/definition "Alpha-2 country code for Tokelau"})

(def TKL
  "Alpha-3 country code for Tokelau"
  {:db/ident :lcc-3166-1/TKL,
   :lcc-lr/denotes :lcc-3166-1/Tokelau,
   :lcc-lr/hasTag "TKL",
   :lcc-lr/identifies :lcc-3166-1/Tokelau,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TKL",
   :skos/definition "Alpha-3 country code for Tokelau"})

(def TKM
  "Alpha-3 country code for Turkmenistan"
  {:db/ident :lcc-3166-1/TKM,
   :lcc-lr/denotes :lcc-3166-1/Turkmenistan,
   :lcc-lr/hasTag "TKM",
   :lcc-lr/identifies :lcc-3166-1/Turkmenistan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TKM",
   :skos/definition "Alpha-3 country code for Turkmenistan"})

(def TL
  "Alpha-2 country code for Timor-Leste"
  {:db/ident :lcc-3166-1/TL,
   :lcc-lr/denotes :lcc-3166-1/Timor-Leste,
   :lcc-lr/hasTag "TL",
   :lcc-lr/identifies :lcc-3166-1/Timor-Leste,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TL",
   :skos/definition "Alpha-2 country code for Timor-Leste"})

(def TLS
  "Alpha-3 country code for Timor-Leste"
  {:db/ident :lcc-3166-1/TLS,
   :lcc-lr/denotes :lcc-3166-1/Timor-Leste,
   :lcc-lr/hasTag "TLS",
   :lcc-lr/identifies :lcc-3166-1/Timor-Leste,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TLS",
   :skos/definition "Alpha-3 country code for Timor-Leste"})

(def TM
  "Alpha-2 country code for Turkmenistan"
  {:db/ident :lcc-3166-1/TM,
   :lcc-lr/denotes :lcc-3166-1/Turkmenistan,
   :lcc-lr/hasTag "TM",
   :lcc-lr/identifies :lcc-3166-1/Turkmenistan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TM",
   :skos/definition "Alpha-2 country code for Turkmenistan"})

(def TN
  "Alpha-2 country code for Tunisia"
  {:db/ident :lcc-3166-1/TN,
   :lcc-lr/denotes :lcc-3166-1/Tunisia,
   :lcc-lr/hasTag "TN",
   :lcc-lr/identifies :lcc-3166-1/Tunisia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TN",
   :skos/definition "Alpha-2 country code for Tunisia"})

(def TO
  "Alpha-2 country code for Tonga"
  {:db/ident :lcc-3166-1/TO,
   :lcc-lr/denotes :lcc-3166-1/Tonga,
   :lcc-lr/hasTag "TO",
   :lcc-lr/identifies :lcc-3166-1/Tonga,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TO",
   :skos/definition "Alpha-2 country code for Tonga"})

(def TON
  "Alpha-3 country code for Tonga"
  {:db/ident :lcc-3166-1/TON,
   :lcc-lr/denotes :lcc-3166-1/Tonga,
   :lcc-lr/hasTag "TON",
   :lcc-lr/identifies :lcc-3166-1/Tonga,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TON",
   :skos/definition "Alpha-3 country code for Tonga"})

(def TR
  "Alpha-2 country code for Turkey"
  {:db/ident :lcc-3166-1/TR,
   :lcc-lr/denotes :lcc-3166-1/Turkey,
   :lcc-lr/hasTag "TR",
   :lcc-lr/identifies :lcc-3166-1/Turkey,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TR",
   :skos/definition "Alpha-2 country code for Turkey"})

(def TT
  "Alpha-2 country code for Trinidad and Tobago"
  {:db/ident :lcc-3166-1/TT,
   :lcc-lr/denotes :lcc-3166-1/TrinidadAndTobago,
   :lcc-lr/hasTag "TT",
   :lcc-lr/identifies :lcc-3166-1/TrinidadAndTobago,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TT",
   :skos/definition "Alpha-2 country code for Trinidad and Tobago"})

(def TTO
  "Alpha-3 country code for Trinidad and Tobago"
  {:db/ident :lcc-3166-1/TTO,
   :lcc-lr/denotes :lcc-3166-1/TrinidadAndTobago,
   :lcc-lr/hasTag "TTO",
   :lcc-lr/identifies :lcc-3166-1/TrinidadAndTobago,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TTO",
   :skos/definition "Alpha-3 country code for Trinidad and Tobago"})

(def TUN
  "Alpha-3 country code for Tunisia"
  {:db/ident :lcc-3166-1/TUN,
   :lcc-lr/denotes :lcc-3166-1/Tunisia,
   :lcc-lr/hasTag "TUN",
   :lcc-lr/identifies :lcc-3166-1/Tunisia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TUN",
   :skos/definition "Alpha-3 country code for Tunisia"})

(def TUR
  "Alpha-3 country code for Turkey"
  {:db/ident :lcc-3166-1/TUR,
   :lcc-lr/denotes :lcc-3166-1/Turkey,
   :lcc-lr/hasTag "TUR",
   :lcc-lr/identifies :lcc-3166-1/Turkey,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TUR",
   :skos/definition "Alpha-3 country code for Turkey"})

(def TUV
  "Alpha-3 country code for Tuvalu"
  {:db/ident :lcc-3166-1/TUV,
   :lcc-lr/denotes :lcc-3166-1/Tuvalu,
   :lcc-lr/hasTag "TUV",
   :lcc-lr/identifies :lcc-3166-1/Tuvalu,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TUV",
   :skos/definition "Alpha-3 country code for Tuvalu"})

(def TV
  "Alpha-2 country code for Tuvalu"
  {:db/ident :lcc-3166-1/TV,
   :lcc-lr/denotes :lcc-3166-1/Tuvalu,
   :lcc-lr/hasTag "TV",
   :lcc-lr/identifies :lcc-3166-1/Tuvalu,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TV",
   :skos/definition "Alpha-2 country code for Tuvalu"})

(def TW
  "Alpha-2 country code for Taiwan (Province of China)"
  {:db/ident :lcc-3166-1/TW,
   :lcc-lr/denotes :lcc-3166-1/Taiwan,
   :lcc-lr/hasTag "TW",
   :lcc-lr/identifies :lcc-3166-1/Taiwan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TW",
   :skos/definition "Alpha-2 country code for Taiwan (Province of China)"})

(def TWN
  "Alpha-3 country code for Taiwan (Province of China)"
  {:db/ident :lcc-3166-1/TWN,
   :lcc-lr/denotes :lcc-3166-1/Taiwan,
   :lcc-lr/hasTag "TWN",
   :lcc-lr/identifies :lcc-3166-1/Taiwan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TWN",
   :skos/definition "Alpha-3 country code for Taiwan (Province of China)"})

(def TZ
  "Alpha-2 country code for Tanzania, the United Republic of"
  {:db/ident :lcc-3166-1/TZ,
   :lcc-lr/denotes :lcc-3166-1/Tanzania,
   :lcc-lr/hasTag "TZ",
   :lcc-lr/identifies :lcc-3166-1/Tanzania,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TZ",
   :skos/definition
   "Alpha-2 country code for Tanzania, the United Republic of"})

(def TZA
  "Alpha-3 country code for Tanzania, the United Republic of"
  {:db/ident :lcc-3166-1/TZA,
   :lcc-lr/denotes :lcc-3166-1/Tanzania,
   :lcc-lr/hasTag "TZA",
   :lcc-lr/identifies :lcc-3166-1/Tanzania,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "TZA",
   :skos/definition
   "Alpha-3 country code for Tanzania, the United Republic of"})

(def Taiwan
  "the country of Taiwan (Province of China)"
  {:db/ident :lcc-3166-1/Taiwan,
   :lcc-cr/hasEnglishShortName #voc/lstr "Taiwan (Province of China)@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr
                                          "TAIWAN, PROVINCE OF CHINA@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Taïwan (Province de Chine)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr
                                         "TAÏWAN, PROVINCE DE CHINE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Taiwan@zh",
   :lcc-cr/hasNumericRegionCode "158",
   :lcc-cr/hasRemarks "Includes: Penghu (Pescadores) Islands.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Chinese,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Taiwan@zh",
   :skos/definition "the country of Taiwan (Province of China)"})

(def Tajikistan
  "the country of Tajikistan"
  {:db/ident :lcc-3166-1/Tajikistan,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Tajikistan@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Tajikistan@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "TAJIKISTAN@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République du Tadjikistan@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Tadjikistan (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "TADJIKISTAN@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Tojikiston@tg",
   :lcc-cr/hasNumericRegionCode "762",
   :lcc-cr/hasRemarks
   "Remark: The deletion of the region Karategin left one part of the country without name and without code in this part of ISO 3166. This section of the country is designated districts under republic administration (tgk: nohiyahoi tobei jumhurí) and comprises 13 districts (tgk: nohiya) which are administered directly by the central government at first-order level.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Tajik,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Tojikiston@tg",
   :skos/definition "the country of Tajikistan"})

(def Tanzania
  "the country of Tanzania, the United Republic of"
  {:db/ident :lcc-3166-1/Tanzania,
   :lcc-cr/hasEnglishFullName #voc/lstr "the United Republic of Tanzania@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Tanzania, the United Republic of@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr
                                          "TANZANIA, UNITED REPUBLIC OF@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République-Unie de Tanzanie@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Tanzanie (la République-Unie de)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr
                                         "TANZANIE, RÉPUBLIQUE-UNIE DE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Jamhuri ya Muungano wa Tanzania@sw",
   :lcc-cr/hasNumericRegionCode "834",
   :lcc-cr/hasRemarks "Often referred to as Tanzania.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/English :lcc-639-1/Swahili],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [#voc/lstr "Tanzania, the United Republic of@en"
                #voc/lstr "Jamhuri ya Muungano wa Tanzania@sw"],
   :skos/definition "the country of Tanzania, the United Republic of"})

(def Thailand
  "the country of Thailand"
  {:db/ident :lcc-3166-1/Thailand,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Kingdom of Thailand@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Thailand@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "THAILAND@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "le Royaume de Thaïlande@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Thaïlande (la)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "THAÏLANDE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Prathet Thai@th",
   :lcc-cr/hasNumericRegionCode "764",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Thai,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Prathet Thai@th",
   :skos/definition "the country of Thailand"})

(def Timor-Leste
  "the country of Timor-Leste"
  {:db/ident :lcc-3166-1/Timor-Leste,
   :lcc-cr/hasEnglishFullName #voc/lstr
                               "the Democratic Republic of Timor-Leste@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Timor-Leste@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "TIMOR-LESTE@en",
   :lcc-cr/hasFrenchFullName #voc/lstr
                              "la République démocratique du Timor-Leste@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Timor-Leste (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "TIMOR-LESTE@fr",
   :lcc-cr/hasLocalShortName [#voc/lstr "Timor-Leste@pt" "Timor Lorosa'e"],
   :lcc-cr/hasNumericRegionCode "626",
   :lcc-cr/hasRemarks "Includes the exclave of Oecussi.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-2/Tetum :lcc-639-1/Portuguese],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Timor-Leste@pt",
   :skos/definition "the country of Timor-Leste"})

(def Togo
  "the country of Togo"
  {:db/ident :lcc-3166-1/Togo,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Togolese Republic@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Togo@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "TOGO@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République togolaise@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Togo (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "TOGO@fr",
   :lcc-cr/hasNumericRegionCode "768",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Togo (le)@fr",
   :skos/definition "the country of Togo"})

(def Tokelau
  "the country of Tokelau"
  {:db/ident :lcc-3166-1/Tokelau,
   :lcc-cr/hasEnglishShortName #voc/lstr "Tokelau@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "TOKELAU@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Tokelau (les)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "TOKELAU@fr",
   :lcc-cr/hasLocalShortName "Tokelau",
   :lcc-cr/hasNumericRegionCode "772",
   :lcc-cr/hasRemarks "No subdivisions relevant for this standard.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-2/Tokelau :lcc-639-1/English],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Tokelau@en",
   :skos/definition "the country of Tokelau"})

(def Tonga
  "the country of Tonga"
  {:db/ident :lcc-3166-1/Tonga,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Kingdom of Tonga@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Tonga@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "TONGA@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "le Royaume des Tonga@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Tonga (les)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "TONGA@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Tonga@to",
   :lcc-cr/hasNumericRegionCode "776",
   :lcc-cr/hasRemarks "Principal island: Tongatapu.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-1/Tonga-TongaIslands
                                       :lcc-639-1/English],
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label [#voc/lstr "Tonga@to" #voc/lstr "Tonga@en"],
   :skos/definition "the country of Tonga"})

(def TrinidadAndTobago
  "the country of Trinidad and Tobago"
  {:db/ident :lcc-3166-1/TrinidadAndTobago,
   :lcc-cr/hasEnglishFullName #voc/lstr
                               "the Republic of Trinidad and Tobago@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Trinidad and Tobago@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "TRINIDAD AND TOBAGO@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République de Trinité-et-Tobago@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Trinité-et-Tobago (la)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "TRINITÉ-ET-TOBAGO@fr",
   :lcc-cr/hasNumericRegionCode "780",
   :lcc-cr/hasRemarks
   "Tobago * is the second significant part of composite country name.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Trinidad and Tobago@en",
   :skos/definition "the country of Trinidad and Tobago"})

(def Tunisia
  "the country of Tunisia"
  {:db/ident :lcc-3166-1/Tunisia,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Tunisia@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Tunisia@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "TUNISIA@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République tunisienne@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Tunisie (la)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "TUNISIE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Tūnis@ar",
   :lcc-cr/hasNumericRegionCode "788",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Arabic,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Tūnis@ar",
   :skos/definition "the country of Tunisia"})

(def Turkey
  "the country of Turkey"
  {:db/ident :lcc-3166-1/Turkey,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Turkey@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Turkey@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "TURKEY@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République turque@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Turquie (la)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "TURQUIE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Türkiye@tr",
   :lcc-cr/hasNumericRegionCode "792",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Turkish,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Türkiye@tr",
   :skos/definition "the country of Turkey"})

(def Turkmenistan
  "the country of Turkmenistan"
  {:db/ident :lcc-3166-1/Turkmenistan,
   :lcc-cr/hasEnglishShortName #voc/lstr "Turkmenistan@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "TURKMENISTAN@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Turkménistan (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "TURKMÉNISTAN@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Türkmenistan@tk",
   :lcc-cr/hasNumericRegionCode "795",
   :lcc-cr/hasRemarks
   "Remark: By presidential decree No. 1146, 1993-01-21, the Roman alphabet is officially used for the Turkmen language.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Turkmen,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Türkmenistan@tk",
   :skos/definition "the country of Turkmenistan"})

(def TurksAndCaicosIslands
  "the country of Turks and Caicos Islands (the)"
  {:db/ident :lcc-3166-1/TurksAndCaicosIslands,
   :lcc-cr/hasEnglishShortName #voc/lstr "Turks and Caicos Islands (the)@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr
                                          "TURKS AND CAICOS ISLANDS@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Turks-et-Caïcos (les Îles)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "TURKS-ET-CAÏCOS, ÎLES@fr",
   :lcc-cr/hasNumericRegionCode "796",
   :lcc-cr/hasRemarks "No subdivisions relevant for this standard.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Turks and Caicos Islands (the)@en",
   :skos/definition "the country of Turks and Caicos Islands (the)"})

(def Tuvalu
  "the country of Tuvalu"
  {:db/ident :lcc-3166-1/Tuvalu,
   :lcc-cr/hasEnglishShortName #voc/lstr "Tuvalu@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "TUVALU@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Tuvalu (les)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "TUVALU@fr",
   :lcc-cr/hasLocalShortName "Tuvalu",
   :lcc-cr/hasNumericRegionCode "798",
   :lcc-cr/hasRemarks "Principal atoll: Funafuti.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage [:lcc-639-2/Tuvalu :lcc-639-1/English],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Tuvalu@en",
   :skos/definition "the country of Tuvalu"})

(def UA
  "Alpha-2 country code for Ukraine"
  {:db/ident :lcc-3166-1/UA,
   :lcc-lr/denotes :lcc-3166-1/Ukraine,
   :lcc-lr/hasTag "UA",
   :lcc-lr/identifies :lcc-3166-1/Ukraine,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "UA",
   :skos/definition "Alpha-2 country code for Ukraine"})

(def UG
  "Alpha-2 country code for Uganda"
  {:db/ident :lcc-3166-1/UG,
   :lcc-lr/denotes :lcc-3166-1/Uganda,
   :lcc-lr/hasTag "UG",
   :lcc-lr/identifies :lcc-3166-1/Uganda,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "UG",
   :skos/definition "Alpha-2 country code for Uganda"})

(def UGA
  "Alpha-3 country code for Uganda"
  {:db/ident :lcc-3166-1/UGA,
   :lcc-lr/denotes :lcc-3166-1/Uganda,
   :lcc-lr/hasTag "UGA",
   :lcc-lr/identifies :lcc-3166-1/Uganda,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "UGA",
   :skos/definition "Alpha-3 country code for Uganda"})

(def UKR
  "Alpha-3 country code for Ukraine"
  {:db/ident :lcc-3166-1/UKR,
   :lcc-lr/denotes :lcc-3166-1/Ukraine,
   :lcc-lr/hasTag "UKR",
   :lcc-lr/identifies :lcc-3166-1/Ukraine,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "UKR",
   :skos/definition "Alpha-3 country code for Ukraine"})

(def UM
  "Alpha-2 country code for United States Minor Outlying Islands (the)"
  {:db/ident :lcc-3166-1/UM,
   :lcc-lr/denotes :lcc-3166-1/UnitedStatesMinorOutlyingIslands,
   :lcc-lr/hasTag "UM",
   :lcc-lr/identifies :lcc-3166-1/UnitedStatesMinorOutlyingIslands,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "UM",
   :skos/definition
   "Alpha-2 country code for United States Minor Outlying Islands (the)"})

(def UMI
  "Alpha-3 country code for United States Minor Outlying Islands (the)"
  {:db/ident :lcc-3166-1/UMI,
   :lcc-lr/denotes :lcc-3166-1/UnitedStatesMinorOutlyingIslands,
   :lcc-lr/hasTag "UMI",
   :lcc-lr/identifies :lcc-3166-1/UnitedStatesMinorOutlyingIslands,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "UMI",
   :skos/definition
   "Alpha-3 country code for United States Minor Outlying Islands (the)"})

(def URY
  "Alpha-3 country code for Uruguay"
  {:db/ident :lcc-3166-1/URY,
   :lcc-lr/denotes :lcc-3166-1/Uruguay,
   :lcc-lr/hasTag "URY",
   :lcc-lr/identifies :lcc-3166-1/Uruguay,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "URY",
   :skos/definition "Alpha-3 country code for Uruguay"})

(def US
  "Alpha-2 country code for United States of America (the)"
  {:db/ident :lcc-3166-1/US,
   :lcc-lr/denotes :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/hasTag "US",
   :lcc-lr/identifies :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "US",
   :skos/definition "Alpha-2 country code for United States of America (the)"})

(def USA
  "Alpha-3 country code for United States of America (the)"
  {:db/ident :lcc-3166-1/USA,
   :lcc-lr/denotes :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/hasTag "USA",
   :lcc-lr/identifies :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "USA",
   :skos/definition "Alpha-3 country code for United States of America (the)"})

(def UY
  "Alpha-2 country code for Uruguay"
  {:db/ident :lcc-3166-1/UY,
   :lcc-lr/denotes :lcc-3166-1/Uruguay,
   :lcc-lr/hasTag "UY",
   :lcc-lr/identifies :lcc-3166-1/Uruguay,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "UY",
   :skos/definition "Alpha-2 country code for Uruguay"})

(def UZ
  "Alpha-2 country code for Uzbekistan"
  {:db/ident :lcc-3166-1/UZ,
   :lcc-lr/denotes :lcc-3166-1/Uzbekistan,
   :lcc-lr/hasTag "UZ",
   :lcc-lr/identifies :lcc-3166-1/Uzbekistan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "UZ",
   :skos/definition "Alpha-2 country code for Uzbekistan"})

(def UZB
  "Alpha-3 country code for Uzbekistan"
  {:db/ident :lcc-3166-1/UZB,
   :lcc-lr/denotes :lcc-3166-1/Uzbekistan,
   :lcc-lr/hasTag "UZB",
   :lcc-lr/identifies :lcc-3166-1/Uzbekistan,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "UZB",
   :skos/definition "Alpha-3 country code for Uzbekistan"})

(def Uganda
  "the country of Uganda"
  {:db/ident :lcc-3166-1/Uganda,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Uganda@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Uganda@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "UGANDA@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République d'Ouganda@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Ouganda (l')@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "OUGANDA@fr",
   :lcc-cr/hasNumericRegionCode "800",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Uganda@en",
   :skos/definition "the country of Uganda"})

(def Ukraine
  "the country of Ukraine"
  {:db/ident :lcc-3166-1/Ukraine,
   :lcc-cr/hasEnglishShortName #voc/lstr "Ukraine@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "UKRAINE@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Ukraine (l')@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "UKRAINE@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Ukraina@uk",
   :lcc-cr/hasNumericRegionCode "804",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Ukrainian,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Ukraina@uk",
   :skos/definition "the country of Ukraine"})

(def UnitedArabEmirates
  "the country of United Arab Emirates (the)"
  {:db/ident :lcc-3166-1/UnitedArabEmirates,
   :lcc-cr/hasEnglishFullName #voc/lstr "the United Arab Emirates@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "United Arab Emirates (the)@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "UNITED ARAB EMIRATES@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "les Émirats arabes unis@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Émirats arabes unis (les)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "ÉMIRATS ARABES UNIS@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Al Imārāt@ar",
   :lcc-cr/hasNumericRegionCode "784",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Arabic,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Al Imārāt@ar",
   :skos/definition "the country of United Arab Emirates (the)"})

(def UnitedKingdom
  "UnitedKingdom is supported as legacy identifier for UnitedKingdomOfGreatBritainAndNorthernIreland"
  {:db/ident :lcc-3166-1/UnitedKingdom,
   :owl/sameAs :lcc-3166-1/UnitedKingdomOfGreatBritainAndNorthernIreland,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/comment
   "UnitedKingdom is supported as legacy identifier for UnitedKingdomOfGreatBritainAndNorthernIreland",
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"})

(def UnitedKingdomOfGreatBritainAndNorthernIreland
  "the country of United Kingdom of Great Britain and Northern Ireland (the)"
  {:db/ident :lcc-3166-1/UnitedKingdomOfGreatBritainAndNorthernIreland,
   :lcc-cr/hasEnglishFullName
   #voc/lstr "the United Kingdom of Great Britain and Northern Ireland@en",
   :lcc-cr/hasEnglishShortName
   #voc/lstr "United Kingdom of Great Britain and Northern Ireland (the)@en",
   :lcc-cr/hasEnglishShortNameInCapitals
   #voc/lstr "UNITED KINGDOM OF GREAT BRITAIN AND NORTHERN IRELAND@en",
   :lcc-cr/hasFrenchFullName
   #voc/lstr "le Royaume-Uni de Grande-Bretagne et d'Irlande du Nord@fr",
   :lcc-cr/hasFrenchShortName
   #voc/lstr "Royaume-Uni de Grande-Bretagne et d'Irlande du Nord (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals
   #voc/lstr "ROYAUME-UNI DE GRANDE-BRETAGNE ET D'IRLANDE DU NORD@fr",
   :lcc-cr/hasNumericRegionCode "826",
   :lcc-cr/hasRemarks
   "BS 6879 gives alternative name forms in Welsh (cy) for some of the Welsh unitary authorities (together with alternative code elements). Since this part of ISO 3166 does not allow for duplicate coding of identical subdivisions, such alternative names in Welsh and code elements are shown for information purposes only in square brackets after the English name of the subdivision. BS 6879 has been superseded but remains the original source of the codes.\nCountry (en) / pays (fr), Province (en) / province (fr):\nENG England country;\nNIR Northern Ireland province;\nSCT Scotland country;\nWLS Wales [Cymru GB-CYM] country.\nIncluded for completeness:\nEAW England and Wales;\nGBN Great Britain;\nUKM United Kingdom.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr
                "United Kingdom of Great Britain and Northern Ireland (the)@en",
   :skos/definition
   "the country of United Kingdom of Great Britain and Northern Ireland (the)"})

(def UnitedStates
  "UnitedStates is supported as legacy identifier for UnitedStatesOfAmerica"
  {:db/ident :lcc-3166-1/UnitedStates,
   :owl/sameAs :lcc-3166-1/UnitedStatesOfAmerica,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/comment
   "UnitedStates is supported as legacy identifier for UnitedStatesOfAmerica",
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"})

(def UnitedStatesMinorOutlyingIslands
  "the country of United States Minor Outlying Islands (the)"
  {:db/ident :lcc-3166-1/UnitedStatesMinorOutlyingIslands,
   :lcc-cr/hasEnglishShortName #voc/lstr
                                "United States Minor Outlying Islands (the)@en",
   :lcc-cr/hasEnglishShortNameInCapitals
   #voc/lstr "UNITED STATES MINOR OUTLYING ISLANDS@en",
   :lcc-cr/hasFrenchShortName
   #voc/lstr "Îles mineures éloignées des États-Unis (les)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals
   #voc/lstr "ÎLES MINEURES ÉLOIGNÉES DES ÉTATS-UNIS@fr",
   :lcc-cr/hasNumericRegionCode "581",
   :lcc-cr/hasRemarks
   ["Comprises: In the Pacific Ocean: Baker Island, Howland Island, Jarvis Island, Johnston Atoll, Kingman Reef, Midway Islands, Palmyra Atoll, Wake Island In the Caribbean Sea: Navassa Island."
    "Remark: Included also as a subdivision of the United States (US-UM)."],
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "United States Minor Outlying Islands (the)@en",
   :skos/definition
   "the country of United States Minor Outlying Islands (the)"})

(def UnitedStatesOfAmerica
  "the country of United States of America (the)"
  {:db/ident :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-cr/hasEnglishFullName #voc/lstr "the United States of America@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "United States of America (the)@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr
                                          "UNITED STATES OF AMERICA@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "les États-Unis d'Amérique@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "États-Unis d'Amérique (les)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "ÉTATS-UNIS D'AMÉRIQUE@fr",
   :lcc-cr/hasNumericRegionCode "840",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "United States of America (the)@en",
   :skos/definition "the country of United States of America (the)"})

(def Uruguay
  "the country of Uruguay"
  {:db/ident :lcc-3166-1/Uruguay,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Eastern Republic of Uruguay@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Uruguay@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "URUGUAY@en",
   :lcc-cr/hasFrenchFullName #voc/lstr
                              "la République orientale de l'Uruguay@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Uruguay (l')@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "URUGUAY@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Uruguay (el)@es",
   :lcc-cr/hasNumericRegionCode "858",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Spanish,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Uruguay (el)@es",
   :skos/definition "the country of Uruguay"})

(def Uzbekistan
  "the country of Uzbekistan"
  {:db/ident :lcc-3166-1/Uzbekistan,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Uzbekistan@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Uzbekistan@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "UZBEKISTAN@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République d'Ouzbékistan@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Ouzbékistan (l')@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "OUZBÉKISTAN@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "O‘zbekiston@uz",
   :lcc-cr/hasNumericRegionCode "860",
   :lcc-cr/hasRemarks
   "In May 1995 a new Roman alphabet was officially decreed for the Uzbek language",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Uzbek,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "O‘zbekiston@uz",
   :skos/definition "the country of Uzbekistan"})

(def VA
  "Alpha-2 country code for Holy See (the)"
  {:db/ident :lcc-3166-1/VA,
   :lcc-lr/denotes :lcc-3166-1/HolySee,
   :lcc-lr/hasTag "VA",
   :lcc-lr/identifies :lcc-3166-1/HolySee,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "VA",
   :skos/definition "Alpha-2 country code for Holy See (the)"})

(def VAT
  "Alpha-3 country code for Holy See (the)"
  {:db/ident :lcc-3166-1/VAT,
   :lcc-lr/denotes :lcc-3166-1/HolySee,
   :lcc-lr/hasTag "VAT",
   :lcc-lr/identifies :lcc-3166-1/HolySee,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "VAT",
   :skos/definition "Alpha-3 country code for Holy See (the)"})

(def VC
  "Alpha-2 country code for Saint Vincent and the Grenadines"
  {:db/ident :lcc-3166-1/VC,
   :lcc-lr/denotes :lcc-3166-1/SaintVincentAndTheGrenadines,
   :lcc-lr/hasTag "VC",
   :lcc-lr/identifies :lcc-3166-1/SaintVincentAndTheGrenadines,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "VC",
   :skos/definition
   "Alpha-2 country code for Saint Vincent and the Grenadines"})

(def VCT
  "Alpha-3 country code for Saint Vincent and the Grenadines"
  {:db/ident :lcc-3166-1/VCT,
   :lcc-lr/denotes :lcc-3166-1/SaintVincentAndTheGrenadines,
   :lcc-lr/hasTag "VCT",
   :lcc-lr/identifies :lcc-3166-1/SaintVincentAndTheGrenadines,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "VCT",
   :skos/definition
   "Alpha-3 country code for Saint Vincent and the Grenadines"})

(def VE
  "Alpha-2 country code for Venezuela (Bolivarian Republic of)"
  {:db/ident :lcc-3166-1/VE,
   :lcc-lr/denotes :lcc-3166-1/Venezuela,
   :lcc-lr/hasTag "VE",
   :lcc-lr/identifies :lcc-3166-1/Venezuela,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "VE",
   :skos/definition
   "Alpha-2 country code for Venezuela (Bolivarian Republic of)"})

(def VEN
  "Alpha-3 country code for Venezuela (Bolivarian Republic of)"
  {:db/ident :lcc-3166-1/VEN,
   :lcc-lr/denotes :lcc-3166-1/Venezuela,
   :lcc-lr/hasTag "VEN",
   :lcc-lr/identifies :lcc-3166-1/Venezuela,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "VEN",
   :skos/definition
   "Alpha-3 country code for Venezuela (Bolivarian Republic of)"})

(def VG
  "Alpha-2 country code for Virgin Islands British"
  {:db/ident :lcc-3166-1/VG,
   :lcc-lr/denotes :lcc-3166-1/VirginIslandsBritish,
   :lcc-lr/hasTag "VG",
   :lcc-lr/identifies :lcc-3166-1/VirginIslandsBritish,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "VG",
   :skos/definition "Alpha-2 country code for Virgin Islands British"})

(def VGB
  "Alpha-3 country code for Virgin Islands British"
  {:db/ident :lcc-3166-1/VGB,
   :lcc-lr/denotes :lcc-3166-1/VirginIslandsBritish,
   :lcc-lr/hasTag "VGB",
   :lcc-lr/identifies :lcc-3166-1/VirginIslandsBritish,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "VGB",
   :skos/definition "Alpha-3 country code for Virgin Islands British"})

(def VI
  "Alpha-2 country code for Virgin Islands US"
  {:db/ident :lcc-3166-1/VI,
   :lcc-lr/denotes :lcc-3166-1/VirginIslandsUS,
   :lcc-lr/hasTag "VI",
   :lcc-lr/identifies :lcc-3166-1/VirginIslandsUS,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "VI",
   :skos/definition "Alpha-2 country code for Virgin Islands US"})

(def VIR
  "Alpha-3 country code for Virgin Islands US"
  {:db/ident :lcc-3166-1/VIR,
   :lcc-lr/denotes :lcc-3166-1/VirginIslandsUS,
   :lcc-lr/hasTag "VIR",
   :lcc-lr/identifies :lcc-3166-1/VirginIslandsUS,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "VIR",
   :skos/definition "Alpha-3 country code for Virgin Islands US"})

(def VN
  "Alpha-2 country code for Viet Nam"
  {:db/ident :lcc-3166-1/VN,
   :lcc-lr/denotes :lcc-3166-1/VietNam,
   :lcc-lr/hasTag "VN",
   :lcc-lr/identifies :lcc-3166-1/VietNam,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "VN",
   :skos/definition "Alpha-2 country code for Viet Nam"})

(def VNM
  "Alpha-3 country code for Viet Nam"
  {:db/ident :lcc-3166-1/VNM,
   :lcc-lr/denotes :lcc-3166-1/VietNam,
   :lcc-lr/hasTag "VNM",
   :lcc-lr/identifies :lcc-3166-1/VietNam,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "VNM",
   :skos/definition "Alpha-3 country code for Viet Nam"})

(def VU
  "Alpha-2 country code for Vanuatu"
  {:db/ident :lcc-3166-1/VU,
   :lcc-lr/denotes :lcc-3166-1/Vanuatu,
   :lcc-lr/hasTag "VU",
   :lcc-lr/identifies :lcc-3166-1/Vanuatu,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "VU",
   :skos/definition "Alpha-2 country code for Vanuatu"})

(def VUT
  "Alpha-3 country code for Vanuatu"
  {:db/ident :lcc-3166-1/VUT,
   :lcc-lr/denotes :lcc-3166-1/Vanuatu,
   :lcc-lr/hasTag "VUT",
   :lcc-lr/identifies :lcc-3166-1/Vanuatu,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "VUT",
   :skos/definition "Alpha-3 country code for Vanuatu"})

(def Vanuatu
  "the country of Vanuatu"
  {:db/ident :lcc-3166-1/Vanuatu,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Vanuatu@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Vanuatu@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "VANUATU@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République du Vanuatu@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Vanuatu (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "VANUATU@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Vanuatu@bi",
   :lcc-cr/hasNumericRegionCode "548",
   :lcc-cr/hasRemarks "Principal islands: Efate, Santo.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage
   [:lcc-639-1/Bislama :lcc-639-1/English :lcc-639-1/French],
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label
   [#voc/lstr "Vanuatu (le)@fr" #voc/lstr "Vanuatu@en" #voc/lstr "Vanuatu@bi"],
   :skos/definition "the country of Vanuatu"})

(def Venezuela
  "the country of Venezuela (Bolivarian Republic of)"
  {:db/ident :lcc-3166-1/Venezuela,
   :lcc-cr/hasEnglishFullName #voc/lstr
                               "the Bolivarian Republic of Venezuela@en",
   :lcc-cr/hasEnglishShortName #voc/lstr
                                "Venezuela (Bolivarian Republic of)@en",
   :lcc-cr/hasEnglishShortNameInCapitals
   #voc/lstr "VENEZUELA (BOLIVARIAN REPUBLIC OF)@en",
   :lcc-cr/hasFrenchFullName #voc/lstr
                              "la République bolivarienne du Venezuela@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr
                               "Venezuela (République bolivarienne du)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals
   #voc/lstr "VENEZUELA (RÉPUBLIQUE BOLIVARIENNE DU)@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Venezuela, República Bolivariana de@es",
   :lcc-cr/hasNumericRegionCode "862",
   :lcc-cr/hasRemarks "Includes: Bird Island.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Spanish,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Venezuela, República Bolivariana de@es",
   :skos/definition "the country of Venezuela (Bolivarian Republic of)"})

(def VietNam
  "the country of Viet Nam"
  {:db/ident :lcc-3166-1/VietNam,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Socialist Republic of Viet Nam@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Viet Nam@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "VIET NAM@en",
   :lcc-cr/hasFrenchFullName #voc/lstr
                              "la République socialiste du Viet Nam@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Viet Nam (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "VIET NAM@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Việt Nam@vi",
   :lcc-cr/hasNumericRegionCode "704",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Vietnamese,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Việt Nam@vi",
   :skos/definition "the country of Viet Nam"})

(def VirginIslandsBritish
  "the country of Virgin Islands British"
  {:db/ident :lcc-3166-1/VirginIslandsBritish,
   :lcc-cr/hasEnglishFullName #voc/lstr "British Virgin Islands (the)@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Virgin Islands (British)@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr
                                          "VIRGIN ISLANDS (BRITISH)@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Vierges britanniques (les Îles)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr
                                         "ÎLES VIERGES BRITANNIQUES@fr",
   :lcc-cr/hasNumericRegionCode "092",
   :lcc-cr/hasRemarks
   ["Principal islands: Anegada, Jost Van Dyke, Tortola, Virgin Gorda."
    "No subdivisions relevant for this standard."],
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Virgin Islands (British)@en",
   :skos/definition "the country of Virgin Islands British"})

(def VirginIslandsUS
  "the country of Virgin Islands US"
  {:db/ident :lcc-3166-1/VirginIslandsUS,
   :lcc-cr/hasEnglishFullName #voc/lstr
                               "the Virgin Islands of the United States@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Virgin Islands (U.S.)@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "VIRGIN ISLANDS (U.S.)@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Vierges des États-Unis (les Îles)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr
                                         "ÎLES VIERGES DES ÉTATS-UNIS@fr",
   :lcc-cr/hasNumericRegionCode "850",
   :lcc-cr/hasRemarks
   ["Principal islands: Saint Croix, Saint John, Saint Thomas."
    "No subdivisions relevant for this standard. Included also as a subdivision of the United States (US-VI)."],
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Virgin Islands (U.S.)@en",
   :skos/definition "the country of Virgin Islands US"})

(def WF
  "Alpha-2 country code for Wallis and Futuna"
  {:db/ident :lcc-3166-1/WF,
   :lcc-lr/denotes :lcc-3166-1/WallisAndFutuna,
   :lcc-lr/hasTag "WF",
   :lcc-lr/identifies :lcc-3166-1/WallisAndFutuna,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "WF",
   :skos/definition "Alpha-2 country code for Wallis and Futuna"})

(def WLF
  "Alpha-3 country code for Wallis and Futuna"
  {:db/ident :lcc-3166-1/WLF,
   :lcc-lr/denotes :lcc-3166-1/WallisAndFutuna,
   :lcc-lr/hasTag "WLF",
   :lcc-lr/identifies :lcc-3166-1/WallisAndFutuna,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "WLF",
   :skos/definition "Alpha-3 country code for Wallis and Futuna"})

(def WS
  "Alpha-2 country code for Samoa"
  {:db/ident :lcc-3166-1/WS,
   :lcc-lr/denotes :lcc-3166-1/Samoa,
   :lcc-lr/hasTag "WS",
   :lcc-lr/identifies :lcc-3166-1/Samoa,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "WS",
   :skos/definition "Alpha-2 country code for Samoa"})

(def WSM
  "Alpha-3 country code for Samoa"
  {:db/ident :lcc-3166-1/WSM,
   :lcc-lr/denotes :lcc-3166-1/Samoa,
   :lcc-lr/hasTag "WSM",
   :lcc-lr/identifies :lcc-3166-1/Samoa,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "WSM",
   :skos/definition "Alpha-3 country code for Samoa"})

(def WallisAndFutuna
  "the country of Wallis and Futuna"
  {:db/ident :lcc-3166-1/WallisAndFutuna,
   :lcc-cr/hasEnglishFullName #voc/lstr "Wallis and Futuna Islands@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Wallis and Futuna@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "WALLIS AND FUTUNA@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "les Îles Wallis-et-Futuna@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Wallis-et-Futuna @fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "WALLIS-ET-FUTUNA@fr",
   :lcc-cr/hasNumericRegionCode "876",
   :lcc-cr/hasRemarks
   ["Included also as a subdivision of France (FR-WF)."
    "Comprises: Hoorn Islands (Principal island: Futuna), Wallis Islands (Principal island: Uvea)."],
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/French,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Wallis-et-Futuna @fr",
   :skos/definition "the country of Wallis and Futuna"})

(def WesternSahara
  "the country of Western Sahara*"
  {:db/ident :lcc-3166-1/WesternSahara,
   :lcc-cr/hasEnglishShortName #voc/lstr "Western Sahara*@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "WESTERN SAHARA *@en",
   :lcc-cr/hasFrenchShortName #voc/lstr "Sahara occidental (le)*@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "SAHARA OCCIDENTAL*@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Aş Şaḩrā' al Gharbīyah@ar",
   :lcc-cr/hasNumericRegionCode "732",
   :lcc-cr/hasRemarks ["* Provisional name."
                       "No subdivisions relevant for this standard."],
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent false,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Arabic,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Aş Şaḩrā' al Gharbīyah@ar",
   :skos/definition "the country of Western Sahara*"})

(def YE
  "Alpha-2 country code for Yemen"
  {:db/ident :lcc-3166-1/YE,
   :lcc-lr/denotes :lcc-3166-1/Yemen,
   :lcc-lr/hasTag "YE",
   :lcc-lr/identifies :lcc-3166-1/Yemen,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "YE",
   :skos/definition "Alpha-2 country code for Yemen"})

(def YEM
  "Alpha-3 country code for Yemen"
  {:db/ident :lcc-3166-1/YEM,
   :lcc-lr/denotes :lcc-3166-1/Yemen,
   :lcc-lr/hasTag "YEM",
   :lcc-lr/identifies :lcc-3166-1/Yemen,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "YEM",
   :skos/definition "Alpha-3 country code for Yemen"})

(def YT
  "Alpha-2 country code for Mayotte"
  {:db/ident :lcc-3166-1/YT,
   :lcc-lr/denotes :lcc-3166-1/Mayotte,
   :lcc-lr/hasTag "YT",
   :lcc-lr/identifies :lcc-3166-1/Mayotte,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "YT",
   :skos/definition "Alpha-2 country code for Mayotte"})

(def Yemen
  "the country of Yemen"
  {:db/ident :lcc-3166-1/Yemen,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Yemen@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Yemen@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "YEMEN@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République du Yémen@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Yémen (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "YÉMEN@fr",
   :lcc-cr/hasLocalShortName #voc/lstr "Al Yaman@ar",
   :lcc-cr/hasNumericRegionCode "887",
   :lcc-cr/hasRemarks "Includes: Socotra Island.",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/Arabic,
   :rdf/type [:lcc-cr/Country :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Al Yaman@ar",
   :skos/definition "the country of Yemen"})

(def ZA
  "Alpha-2 country code for South Africa"
  {:db/ident :lcc-3166-1/ZA,
   :lcc-lr/denotes :lcc-3166-1/SouthAfrica,
   :lcc-lr/hasTag "ZA",
   :lcc-lr/identifies :lcc-3166-1/SouthAfrica,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ZA",
   :skos/definition "Alpha-2 country code for South Africa"})

(def ZAF
  "Alpha-3 country code for South Africa"
  {:db/ident :lcc-3166-1/ZAF,
   :lcc-lr/denotes :lcc-3166-1/SouthAfrica,
   :lcc-lr/hasTag "ZAF",
   :lcc-lr/identifies :lcc-3166-1/SouthAfrica,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ZAF",
   :skos/definition "Alpha-3 country code for South Africa"})

(def ZM
  "Alpha-2 country code for Zambia"
  {:db/ident :lcc-3166-1/ZM,
   :lcc-lr/denotes :lcc-3166-1/Zambia,
   :lcc-lr/hasTag "ZM",
   :lcc-lr/identifies :lcc-3166-1/Zambia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ZM",
   :skos/definition "Alpha-2 country code for Zambia"})

(def ZMB
  "Alpha-3 country code for Zambia"
  {:db/ident :lcc-3166-1/ZMB,
   :lcc-lr/denotes :lcc-3166-1/Zambia,
   :lcc-lr/hasTag "ZMB",
   :lcc-lr/identifies :lcc-3166-1/Zambia,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ZMB",
   :skos/definition "Alpha-3 country code for Zambia"})

(def ZW
  "Alpha-2 country code for Zimbabwe"
  {:db/ident :lcc-3166-1/ZW,
   :lcc-lr/denotes :lcc-3166-1/Zimbabwe,
   :lcc-lr/hasTag "ZW",
   :lcc-lr/identifies :lcc-3166-1/Zimbabwe,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha2-CodeSet,
   :rdf/type [:lcc-cr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ZW",
   :skos/definition "Alpha-2 country code for Zimbabwe"})

(def ZWE
  "Alpha-3 country code for Zimbabwe"
  {:db/ident :lcc-3166-1/ZWE,
   :lcc-lr/denotes :lcc-3166-1/Zimbabwe,
   :lcc-lr/hasTag "ZWE",
   :lcc-lr/identifies :lcc-3166-1/Zimbabwe,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO3166-1-Alpha3-CodeSet,
   :rdf/type [:lcc-cr/Alpha3Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "ZWE",
   :skos/definition "Alpha-3 country code for Zimbabwe"})

(def Zambia
  "the country of Zambia"
  {:db/ident :lcc-3166-1/Zambia,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Zambia@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Zambia@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "ZAMBIA@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République de Zambie@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Zambie (la)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "ZAMBIE@fr",
   :lcc-cr/hasNumericRegionCode "894",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Zambia@en",
   :skos/definition "the country of Zambia"})

(def Zimbabwe
  "the country of Zimbabwe"
  {:db/ident :lcc-3166-1/Zimbabwe,
   :lcc-cr/hasEnglishFullName #voc/lstr "the Republic of Zimbabwe@en",
   :lcc-cr/hasEnglishShortName #voc/lstr "Zimbabwe@en",
   :lcc-cr/hasEnglishShortNameInCapitals #voc/lstr "ZIMBABWE@en",
   :lcc-cr/hasFrenchFullName #voc/lstr "la République du Zimbabwe@fr",
   :lcc-cr/hasFrenchShortName #voc/lstr "Zimbabwe (le)@fr",
   :lcc-cr/hasFrenchShortNameInCapitals #voc/lstr "ZIMBABWE@fr",
   :lcc-cr/hasNumericRegionCode "716",
   :lcc-cr/isClassifiedBy :lcc-3166-1/Country,
   :lcc-cr/isIndependent true,
   :lcc-cr/usesAdministrativeLanguage :lcc-639-1/English,
   :rdf/type [:owl/NamedIndividual :lcc-cr/Country],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label #voc/lstr "Zimbabwe@en",
   :skos/definition "the country of Zimbabwe"})

(def crs
  "Alpha-3 language code for Seselwa Creole French"
  {:db/ident :lcc-3166-1/crs,
   :lcc-lr/denotes :lcc-3166-1/SeselwaCreoleFrench,
   :lcc-lr/hasTag "crs",
   :lcc-lr/identifies :lcc-3166-1/SeselwaCreoleFrench,
   :lcc-lr/isMemberOf :lcc-3166-1/ISO639-3-CodeSet,
   :rdf/type [:lcc-lr/IndividualLanguageIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
   :rdfs/label "crs",
   :skos/definition "Alpha-3 language code for Seselwa Creole French "})