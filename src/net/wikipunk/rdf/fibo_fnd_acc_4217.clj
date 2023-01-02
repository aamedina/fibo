(ns net.wikipunk.rdf.fibo-fnd-acc-4217
  "This ontology represents the subset of the ISO 4217 standard that include the actual currency codes."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :dcterms/abstract
   "This ontology represents the subset of the ISO 4217 standard that include the actual currency codes.",
   :dcterms/issued #inst "2021-10-01T04:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/explanatoryNote
   "This release includes all codes included in the ISO 4217 published code set.",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-acc-4217"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "lcc-3166-1"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "lcc-lr" "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfa/prefix "fibo-fnd-acc-4217",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "ISO 4217-1 Currency Codes Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/ version of this ontology reflects the move of precious metal from products and services to currency amount, with no additional changes to the codes themselves."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/ version of this ontology was modified to replace Swaziland with Eswatini, which was revised by the LCC 1.1 RTF to reflect the change to the country name per the U.N."
    "This version was generated from the ISO XML file as published on October 1, 2021"
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/ version of this ontology was modified to eliminate unnecessary dependencies on the relations ontology, and to replace rdfs:comment with skos:definition per FIBO policy."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/ version of this ontology was modified to eliminate duplication with concepts in LCC."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/ version of this ontology was modified to address hygiene errors with respect to text formatting."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/ version of this ontology was modified to reflect latest ISO and LCC data."],
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/contributor
   ["Thematix Partners LLC" "Adaptive, Inc." "agnos.ai UK Ltd."],
   :sm/copyright ["Copyright (c) 2022 agnos.ai UK Ltd."
                  "Copyright (c) 2015-2022 Object Management Group, Inc."
                  "Copyright (c) 2015-2022 EDM Council, Inc."
                  "Copyright (c) 2015-2022 Thematix Partners LLC"],
   :sm/dependsOn
   ["https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/"
    "https://www.omg.org/spec/LCC/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/"],
   :sm/directSource
   ["ISO 4217:2015 - Codes for the representation of currencies and funds"
    "Revised ISO 4217 Codes List, as maintained by the SNV, available at http://www.currency-iso.org/en/home.html"],
   :sm/fileAbbreviation "fibo-fnd-acc-4217",
   :sm/filename "ISO4217-CurrencyCodes.rdf"})

(def ADBUnitofAccount
  "the ADB Unit of Account"
  {:db/ident :fibo-fnd-acc-4217/ADBUnitofAccount,
   :fibo-fnd-acc-cur/hasNumericCode "965",
   :lcc-lr/hasName "ADB Unit of Account",
   :rdf/type [:fibo-fnd-acc-cur/UnitOfAccount :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "ADB Unit of Account",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the ADB Unit of Account"}})

(def AED
  "the currency identifier for UAE Dirham"
  {:db/ident :fibo-fnd-acc-4217/AED,
   :lcc-lr/denotes :fibo-fnd-acc-4217/UAEDirham,
   :lcc-lr/hasTag "AED",
   :lcc-lr/identifies :fibo-fnd-acc-4217/UAEDirham,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "AED",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for UAE Dirham"}})

(def AFN
  "the currency identifier for Afghani"
  {:db/ident :fibo-fnd-acc-4217/AFN,
   :lcc-lr/denotes :fibo-fnd-acc-4217/Afghani,
   :lcc-lr/hasTag "AFN",
   :lcc-lr/identifies :fibo-fnd-acc-4217/Afghani,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "AFN",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Afghani"}})

(def ALL
  "the currency identifier for Lek"
  {:db/ident :fibo-fnd-acc-4217/ALL,
   :lcc-lr/denotes :fibo-fnd-acc-4217/Lek,
   :lcc-lr/hasTag "ALL",
   :lcc-lr/identifies :fibo-fnd-acc-4217/Lek,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "ALL",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Lek"}})

(def AMD
  "the currency identifier for Armenian Dram"
  {:db/ident :fibo-fnd-acc-4217/AMD,
   :lcc-lr/denotes :fibo-fnd-acc-4217/ArmenianDram,
   :lcc-lr/hasTag "AMD",
   :lcc-lr/identifies :fibo-fnd-acc-4217/ArmenianDram,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "AMD",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the currency identifier for Armenian Dram"}})

(def ANG
  "the currency identifier for Netherlands Antillean Guilder"
  {:db/ident :fibo-fnd-acc-4217/ANG,
   :lcc-lr/denotes :fibo-fnd-acc-4217/NetherlandsAntilleanGuilder,
   :lcc-lr/hasTag "ANG",
   :lcc-lr/identifies :fibo-fnd-acc-4217/NetherlandsAntilleanGuilder,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "ANG",
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "the currency identifier for Netherlands Antillean Guilder"}})

(def AOA
  "the currency identifier for Kwanza"
  {:db/ident :fibo-fnd-acc-4217/AOA,
   :lcc-lr/denotes :fibo-fnd-acc-4217/Kwanza,
   :lcc-lr/hasTag "AOA",
   :lcc-lr/identifies :fibo-fnd-acc-4217/Kwanza,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "AOA",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Kwanza"}})

(def ARS
  "the currency identifier for Argentine Peso"
  {:db/ident :fibo-fnd-acc-4217/ARS,
   :lcc-lr/denotes :fibo-fnd-acc-4217/ArgentinePeso,
   :lcc-lr/hasTag "ARS",
   :lcc-lr/identifies :fibo-fnd-acc-4217/ArgentinePeso,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "ARS",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the currency identifier for Argentine Peso"}})

(def AUD
  "the currency identifier for Australian Dollar"
  {:db/ident :fibo-fnd-acc-4217/AUD,
   :lcc-lr/denotes :fibo-fnd-acc-4217/AustralianDollar,
   :lcc-lr/hasTag "AUD",
   :lcc-lr/identifies :fibo-fnd-acc-4217/AustralianDollar,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "AUD",
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "the currency identifier for Australian Dollar"}})

(def AWG
  "the currency identifier for Aruban Florin"
  {:db/ident :fibo-fnd-acc-4217/AWG,
   :lcc-lr/denotes :fibo-fnd-acc-4217/ArubanFlorin,
   :lcc-lr/hasTag "AWG",
   :lcc-lr/identifies :fibo-fnd-acc-4217/ArubanFlorin,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "AWG",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the currency identifier for Aruban Florin"}})

(def AZN
  "the currency identifier for Azerbaijan Manat"
  {:db/ident :fibo-fnd-acc-4217/AZN,
   :lcc-lr/denotes :fibo-fnd-acc-4217/AzerbaijanManat,
   :lcc-lr/hasTag "AZN",
   :lcc-lr/identifies :fibo-fnd-acc-4217/AzerbaijanManat,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "AZN",
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "the currency identifier for Azerbaijan Manat"}})

(def Afghani
  "the currency Afghani"
  {:db/ident :fibo-fnd-acc-4217/Afghani,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "971",
   :lcc-cr/isUsedBy :lcc-3166-1/Afghanistan,
   :lcc-lr/hasName "Afghani",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Afghani",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Afghani"}})

(def AlgerianDinar
  "the currency Algerian Dinar"
  {:db/ident :fibo-fnd-acc-4217/AlgerianDinar,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "012",
   :lcc-cr/isUsedBy :lcc-3166-1/Algeria,
   :lcc-lr/hasName "Algerian Dinar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Algerian Dinar",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Algerian Dinar"}})

(def ArgentinePeso
  "the currency Argentine Peso"
  {:db/ident :fibo-fnd-acc-4217/ArgentinePeso,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "032",
   :lcc-cr/isUsedBy :lcc-3166-1/Argentina,
   :lcc-lr/hasName "Argentine Peso",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Argentine Peso",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Argentine Peso"}})

(def ArmenianDram
  "the currency Armenian Dram"
  {:db/ident :fibo-fnd-acc-4217/ArmenianDram,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "051",
   :lcc-cr/isUsedBy :lcc-3166-1/Armenia,
   :lcc-lr/hasName "Armenian Dram",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Armenian Dram",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Armenian Dram"}})

(def ArubanFlorin
  "the currency Aruban Florin"
  {:db/ident :fibo-fnd-acc-4217/ArubanFlorin,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "533",
   :lcc-cr/isUsedBy :lcc-3166-1/Aruba,
   :lcc-lr/hasName "Aruban Florin",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Aruban Florin",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Aruban Florin"}})

(def AustralianDollar
  "the currency Australian Dollar"
  {:db/ident :fibo-fnd-acc-4217/AustralianDollar,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "036",
   :lcc-cr/isUsedBy [:lcc-3166-1/CocosKeelingIslands
                     :lcc-3166-1/ChristmasIsland
                     :lcc-3166-1/Australia
                     :lcc-3166-1/Tuvalu
                     :lcc-3166-1/Kiribati
                     :lcc-3166-1/HeardIslandAndMcDonaldIslands
                     :lcc-3166-1/Nauru
                     :lcc-3166-1/NorfolkIsland],
   :lcc-lr/hasName "Australian Dollar",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-acc-cur/Currency],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Australian Dollar",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Australian Dollar"}})

(def AzerbaijanManat
  "the currency Azerbaijan Manat"
  {:db/ident :fibo-fnd-acc-4217/AzerbaijanManat,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "944",
   :lcc-cr/isUsedBy :lcc-3166-1/Azerbaijan,
   :lcc-lr/hasName "Azerbaijan Manat",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Azerbaijan Manat",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Azerbaijan Manat"}})

(def BAM
  "the currency identifier for Convertible Mark"
  {:db/ident :fibo-fnd-acc-4217/BAM,
   :lcc-lr/denotes :fibo-fnd-acc-4217/ConvertibleMark,
   :lcc-lr/hasTag "BAM",
   :lcc-lr/identifies :fibo-fnd-acc-4217/ConvertibleMark,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "BAM",
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "the currency identifier for Convertible Mark"}})

(def BBD
  "the currency identifier for Barbados Dollar"
  {:db/ident :fibo-fnd-acc-4217/BBD,
   :lcc-lr/denotes :fibo-fnd-acc-4217/BarbadosDollar,
   :lcc-lr/hasTag "BBD",
   :lcc-lr/identifies :fibo-fnd-acc-4217/BarbadosDollar,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "BBD",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the currency identifier for Barbados Dollar"}})

(def BDT
  "the currency identifier for Taka"
  {:db/ident :fibo-fnd-acc-4217/BDT,
   :lcc-lr/denotes :fibo-fnd-acc-4217/Taka,
   :lcc-lr/hasTag "BDT",
   :lcc-lr/identifies :fibo-fnd-acc-4217/Taka,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "BDT",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Taka"}})

(def BGN
  "the currency identifier for Bulgarian Lev"
  {:db/ident :fibo-fnd-acc-4217/BGN,
   :lcc-lr/denotes :fibo-fnd-acc-4217/BulgarianLev,
   :lcc-lr/hasTag "BGN",
   :lcc-lr/identifies :fibo-fnd-acc-4217/BulgarianLev,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "BGN",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the currency identifier for Bulgarian Lev"}})

(def BHD
  "the currency identifier for Bahraini Dinar"
  {:db/ident :fibo-fnd-acc-4217/BHD,
   :lcc-lr/denotes :fibo-fnd-acc-4217/BahrainiDinar,
   :lcc-lr/hasTag "BHD",
   :lcc-lr/identifies :fibo-fnd-acc-4217/BahrainiDinar,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "BHD",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the currency identifier for Bahraini Dinar"}})

(def BIF
  "the currency identifier for Burundi Franc"
  {:db/ident :fibo-fnd-acc-4217/BIF,
   :lcc-lr/denotes :fibo-fnd-acc-4217/BurundiFranc,
   :lcc-lr/hasTag "BIF",
   :lcc-lr/identifies :fibo-fnd-acc-4217/BurundiFranc,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "BIF",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the currency identifier for Burundi Franc"}})

(def BMD
  "the currency identifier for Bermudian Dollar"
  {:db/ident :fibo-fnd-acc-4217/BMD,
   :lcc-lr/denotes :fibo-fnd-acc-4217/BermudianDollar,
   :lcc-lr/hasTag "BMD",
   :lcc-lr/identifies :fibo-fnd-acc-4217/BermudianDollar,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "BMD",
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "the currency identifier for Bermudian Dollar"}})

(def BND
  "the currency identifier for Brunei Dollar"
  {:db/ident :fibo-fnd-acc-4217/BND,
   :lcc-lr/denotes :fibo-fnd-acc-4217/BruneiDollar,
   :lcc-lr/hasTag "BND",
   :lcc-lr/identifies :fibo-fnd-acc-4217/BruneiDollar,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "BND",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the currency identifier for Brunei Dollar"}})

(def BOB
  "the currency identifier for Boliviano"
  {:db/ident :fibo-fnd-acc-4217/BOB,
   :lcc-lr/denotes :fibo-fnd-acc-4217/Boliviano,
   :lcc-lr/hasTag "BOB",
   :lcc-lr/identifies :fibo-fnd-acc-4217/Boliviano,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "BOB",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Boliviano"}})

(def BOV
  "the funds identifier for Mvdol"
  {:db/ident :fibo-fnd-acc-4217/BOV,
   :lcc-lr/denotes :fibo-fnd-acc-4217/Mvdol,
   :lcc-lr/hasTag "BOV",
   :lcc-lr/identifies :fibo-fnd-acc-4217/Mvdol,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/FundsIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "BOV",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the funds identifier for Mvdol"}})

(def BRL
  "the currency identifier for Brazilian Real"
  {:db/ident :fibo-fnd-acc-4217/BRL,
   :lcc-lr/denotes :fibo-fnd-acc-4217/BrazilianReal,
   :lcc-lr/hasTag "BRL",
   :lcc-lr/identifies :fibo-fnd-acc-4217/BrazilianReal,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "BRL",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the currency identifier for Brazilian Real"}})

(def BSD
  "the currency identifier for Bahamian Dollar"
  {:db/ident :fibo-fnd-acc-4217/BSD,
   :lcc-lr/denotes :fibo-fnd-acc-4217/BahamianDollar,
   :lcc-lr/hasTag "BSD",
   :lcc-lr/identifies :fibo-fnd-acc-4217/BahamianDollar,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "BSD",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the currency identifier for Bahamian Dollar"}})

(def BTN
  "the currency identifier for Ngultrum"
  {:db/ident :fibo-fnd-acc-4217/BTN,
   :lcc-lr/denotes :fibo-fnd-acc-4217/Ngultrum,
   :lcc-lr/hasTag "BTN",
   :lcc-lr/identifies :fibo-fnd-acc-4217/Ngultrum,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "BTN",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Ngultrum"}})

(def BWP
  "the currency identifier for Pula"
  {:db/ident :fibo-fnd-acc-4217/BWP,
   :lcc-lr/denotes :fibo-fnd-acc-4217/Pula,
   :lcc-lr/hasTag "BWP",
   :lcc-lr/identifies :fibo-fnd-acc-4217/Pula,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "BWP",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Pula"}})

(def BYN
  "the currency identifier for Belarusian Ruble"
  {:db/ident :fibo-fnd-acc-4217/BYN,
   :lcc-lr/denotes :fibo-fnd-acc-4217/BelarusianRuble,
   :lcc-lr/hasTag "BYN",
   :lcc-lr/identifies :fibo-fnd-acc-4217/BelarusianRuble,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "BYN",
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "the currency identifier for Belarusian Ruble"}})

(def BZD
  "the currency identifier for Belize Dollar"
  {:db/ident :fibo-fnd-acc-4217/BZD,
   :lcc-lr/denotes :fibo-fnd-acc-4217/BelizeDollar,
   :lcc-lr/hasTag "BZD",
   :lcc-lr/identifies :fibo-fnd-acc-4217/BelizeDollar,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "BZD",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the currency identifier for Belize Dollar"}})

(def BahamianDollar
  "the currency Bahamian Dollar"
  {:db/ident :fibo-fnd-acc-4217/BahamianDollar,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "044",
   :lcc-cr/isUsedBy :lcc-3166-1/Bahamas,
   :lcc-lr/hasName "Bahamian Dollar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Bahamian Dollar",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Bahamian Dollar"}})

(def BahrainiDinar
  "the currency Bahraini Dinar"
  {:db/ident :fibo-fnd-acc-4217/BahrainiDinar,
   :fibo-fnd-acc-cur/hasMinorUnit "3",
   :fibo-fnd-acc-cur/hasNumericCode "048",
   :lcc-cr/isUsedBy :lcc-3166-1/Bahrain,
   :lcc-lr/hasName "Bahraini Dinar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Bahraini Dinar",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Bahraini Dinar"}})

(def Baht
  "the currency Baht"
  {:db/ident :fibo-fnd-acc-4217/Baht,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "764",
   :lcc-cr/isUsedBy :lcc-3166-1/Thailand,
   :lcc-lr/hasName "Baht",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Baht",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Baht"}})

(def Balboa
  "the currency Balboa"
  {:db/ident :fibo-fnd-acc-4217/Balboa,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "590",
   :lcc-cr/isUsedBy :lcc-3166-1/Panama,
   :lcc-lr/hasName "Balboa",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Balboa",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Balboa"}})

(def BarbadosDollar
  "the currency Barbados Dollar"
  {:db/ident :fibo-fnd-acc-4217/BarbadosDollar,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "052",
   :lcc-cr/isUsedBy :lcc-3166-1/Barbados,
   :lcc-lr/hasName "Barbados Dollar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Barbados Dollar",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Barbados Dollar"}})

(def BelarusianRuble
  "the currency Belarusian Ruble"
  {:db/ident :fibo-fnd-acc-4217/BelarusianRuble,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "933",
   :lcc-cr/isUsedBy :lcc-3166-1/Belarus,
   :lcc-lr/hasName "Belarusian Ruble",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Belarusian Ruble",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Belarusian Ruble"}})

(def BelizeDollar
  "the currency Belize Dollar"
  {:db/ident :fibo-fnd-acc-4217/BelizeDollar,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "084",
   :lcc-cr/isUsedBy :lcc-3166-1/Belize,
   :lcc-lr/hasName "Belize Dollar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Belize Dollar",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Belize Dollar"}})

(def BermudianDollar
  "the currency Bermudian Dollar"
  {:db/ident :fibo-fnd-acc-4217/BermudianDollar,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "060",
   :lcc-cr/isUsedBy :lcc-3166-1/Bermuda,
   :lcc-lr/hasName "Bermudian Dollar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Bermudian Dollar",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Bermudian Dollar"}})

(def Boliviano
  "the currency Boliviano"
  {:db/ident :fibo-fnd-acc-4217/Boliviano,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "068",
   :lcc-cr/isUsedBy :lcc-3166-1/Bolivia,
   :lcc-lr/hasName "Boliviano",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Boliviano",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Boliviano"}})

(def BolívarSoberano
  "the currency Bolívar Soberano"
  {:db/ident :fibo-fnd-acc-4217/BolívarSoberano,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode ["926" "928"],
   :lcc-cr/isUsedBy :lcc-3166-1/Venezuela,
   :lcc-lr/hasName "Bolívar Soberano",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Bolívar Soberano",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Bolívar Soberano"}})

(def BondMarketsUnitEuropeanCompositeUnit_EURCO
  "the Bond Markets Unit European Composite Unit (EURCO)"
  {:db/ident :fibo-fnd-acc-4217/BondMarketsUnitEuropeanCompositeUnit_EURCO,
   :fibo-fnd-acc-cur/hasNumericCode "955",
   :lcc-lr/hasName "Bond Markets Unit European Composite Unit (EURCO)",
   :rdf/type [:fibo-fnd-acc-cur/UnitOfAccount :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Bond Markets Unit European Composite Unit (EURCO)",
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "the Bond Markets Unit European Composite Unit (EURCO)"}})

(def BondMarketsUnitEuropeanMonetaryUnit_EMU-6
  "the Bond Markets Unit European Monetary Unit (E.M.U.-6)"
  {:db/ident :fibo-fnd-acc-4217/BondMarketsUnitEuropeanMonetaryUnit_EMU-6,
   :fibo-fnd-acc-cur/hasNumericCode "956",
   :lcc-lr/hasName "Bond Markets Unit European Monetary Unit (E.M.U.-6)",
   :rdf/type [:fibo-fnd-acc-cur/UnitOfAccount :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Bond Markets Unit European Monetary Unit (E.M.U.-6)",
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "the Bond Markets Unit European Monetary Unit (E.M.U.-6)"}})

(def BondMarketsUnitEuropeanUnitofAccount17_EUA-17
  "the Bond Markets Unit European Unit of Account 17 (E.U.A.-17)"
  {:db/ident :fibo-fnd-acc-4217/BondMarketsUnitEuropeanUnitofAccount17_EUA-17,
   :fibo-fnd-acc-cur/hasNumericCode "958",
   :lcc-lr/hasName "Bond Markets Unit European Unit of Account 17 (E.U.A.-17)",
   :rdf/type [:fibo-fnd-acc-cur/UnitOfAccount :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Bond Markets Unit European Unit of Account 17 (E.U.A.-17)",
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "the Bond Markets Unit European Unit of Account 17 (E.U.A.-17)"}})

(def BondMarketsUnitEuropeanUnitofAccount9_EUA-9
  "the Bond Markets Unit European Unit of Account 9 (E.U.A.-9)"
  {:db/ident :fibo-fnd-acc-4217/BondMarketsUnitEuropeanUnitofAccount9_EUA-9,
   :fibo-fnd-acc-cur/hasNumericCode "957",
   :lcc-lr/hasName "Bond Markets Unit European Unit of Account 9 (E.U.A.-9)",
   :rdf/type [:fibo-fnd-acc-cur/UnitOfAccount :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Bond Markets Unit European Unit of Account 9 (E.U.A.-9)",
   :skos/definition
   {:rdf/language "en",
    :rdf/value "the Bond Markets Unit European Unit of Account 9 (E.U.A.-9)"}})

(def BrazilianReal
  "the currency Brazilian Real"
  {:db/ident :fibo-fnd-acc-4217/BrazilianReal,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "986",
   :lcc-cr/isUsedBy :lcc-3166-1/Brazil,
   :lcc-lr/hasName "Brazilian Real",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Brazilian Real",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Brazilian Real"}})

(def BruneiDollar
  "the currency Brunei Dollar"
  {:db/ident :fibo-fnd-acc-4217/BruneiDollar,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "096",
   :lcc-cr/isUsedBy :lcc-3166-1/BruneiDarussalam,
   :lcc-lr/hasName "Brunei Dollar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Brunei Dollar",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Brunei Dollar"}})

(def BulgarianLev
  "the currency Bulgarian Lev"
  {:db/ident :fibo-fnd-acc-4217/BulgarianLev,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "975",
   :lcc-cr/isUsedBy :lcc-3166-1/Bulgaria,
   :lcc-lr/hasName "Bulgarian Lev",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Bulgarian Lev",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Bulgarian Lev"}})

(def BurundiFranc
  "the currency Burundi Franc"
  {:db/ident :fibo-fnd-acc-4217/BurundiFranc,
   :fibo-fnd-acc-cur/hasMinorUnit "0",
   :fibo-fnd-acc-cur/hasNumericCode "108",
   :lcc-cr/isUsedBy :lcc-3166-1/Burundi,
   :lcc-lr/hasName "Burundi Franc",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Burundi Franc",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Burundi Franc"}})

(def CAD
  "the currency identifier for Canadian Dollar"
  {:db/ident :fibo-fnd-acc-4217/CAD,
   :lcc-lr/denotes :fibo-fnd-acc-4217/CanadianDollar,
   :lcc-lr/hasTag "CAD",
   :lcc-lr/identifies :fibo-fnd-acc-4217/CanadianDollar,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "CAD",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the currency identifier for Canadian Dollar"}})

(def CDF
  "the currency identifier for Congolese Franc"
  {:db/ident :fibo-fnd-acc-4217/CDF,
   :lcc-lr/denotes :fibo-fnd-acc-4217/CongoleseFranc,
   :lcc-lr/hasTag "CDF",
   :lcc-lr/identifies :fibo-fnd-acc-4217/CongoleseFranc,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "CDF",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the currency identifier for Congolese Franc"}})

(def CFAFrancBCEAO
  "the currency CFA Franc BCEAO"
  {:db/ident :fibo-fnd-acc-4217/CFAFrancBCEAO,
   :fibo-fnd-acc-cur/hasMinorUnit "0",
   :fibo-fnd-acc-cur/hasNumericCode "952",
   :lcc-cr/isUsedBy [:lcc-3166-1/Guinea-Bissau
                     :lcc-3166-1/Benin
                     :lcc-3166-1/Mali
                     :lcc-3166-1/CoteDIvoire
                     :lcc-3166-1/BurkinaFaso
                     :lcc-3166-1/Niger
                     :lcc-3166-1/Togo
                     :lcc-3166-1/Senegal],
   :lcc-lr/hasName "CFA Franc BCEAO",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-acc-cur/Currency],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "CFA Franc BCEAO",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency CFA Franc BCEAO"}})

(def CFAFrancBEAC
  "the currency CFA Franc BEAC"
  {:db/ident :fibo-fnd-acc-4217/CFAFrancBEAC,
   :fibo-fnd-acc-cur/hasMinorUnit "0",
   :fibo-fnd-acc-cur/hasNumericCode "950",
   :lcc-cr/isUsedBy [:lcc-3166-1/Gabon
                     :lcc-3166-1/EquatorialGuinea
                     :lcc-3166-1/Cameroon
                     :lcc-3166-1/Chad
                     :lcc-3166-1/CentralAfricanRepublic
                     :lcc-3166-1/Congo],
   :lcc-lr/hasName "CFA Franc BEAC",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-acc-cur/Currency],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "CFA Franc BEAC",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency CFA Franc BEAC"}})

(def CFPFranc
  "the currency CFP Franc"
  {:db/ident :fibo-fnd-acc-4217/CFPFranc,
   :fibo-fnd-acc-cur/hasMinorUnit "0",
   :fibo-fnd-acc-cur/hasNumericCode "953",
   :lcc-cr/isUsedBy [:lcc-3166-1/FrenchPolynesia
                     :lcc-3166-1/NewCaledonia
                     :lcc-3166-1/WallisAndFutuna],
   :lcc-lr/hasName "CFP Franc",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "CFP Franc",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency CFP Franc"}})

(def CHE
  "the funds identifier for WIR Euro"
  {:db/ident :fibo-fnd-acc-4217/CHE,
   :lcc-lr/denotes :fibo-fnd-acc-4217/WIREuro,
   :lcc-lr/hasTag "CHE",
   :lcc-lr/identifies :fibo-fnd-acc-4217/WIREuro,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/FundsIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "CHE",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the funds identifier for WIR Euro"}})

(def CHF
  "the currency identifier for Swiss Franc"
  {:db/ident :fibo-fnd-acc-4217/CHF,
   :lcc-lr/denotes :fibo-fnd-acc-4217/SwissFranc,
   :lcc-lr/hasTag "CHF",
   :lcc-lr/identifies :fibo-fnd-acc-4217/SwissFranc,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "CHF",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Swiss Franc"}})

(def CHW
  "the funds identifier for WIR Franc"
  {:db/ident :fibo-fnd-acc-4217/CHW,
   :lcc-lr/denotes :fibo-fnd-acc-4217/WIRFranc,
   :lcc-lr/hasTag "CHW",
   :lcc-lr/identifies :fibo-fnd-acc-4217/WIRFranc,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/FundsIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "CHW",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the funds identifier for WIR Franc"}})

(def CLF
  "the funds identifier for Unidad de Fomento"
  {:db/ident :fibo-fnd-acc-4217/CLF,
   :lcc-lr/denotes :fibo-fnd-acc-4217/UnidaddeFomento,
   :lcc-lr/hasTag "CLF",
   :lcc-lr/identifies :fibo-fnd-acc-4217/UnidaddeFomento,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/FundsIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "CLF",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the funds identifier for Unidad de Fomento"}})

(def CLP
  "the currency identifier for Chilean Peso"
  {:db/ident :fibo-fnd-acc-4217/CLP,
   :lcc-lr/denotes :fibo-fnd-acc-4217/ChileanPeso,
   :lcc-lr/hasTag "CLP",
   :lcc-lr/identifies :fibo-fnd-acc-4217/ChileanPeso,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "CLP",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Chilean Peso"}})

(def CNY
  "the currency identifier for Yuan Renminbi"
  {:db/ident :fibo-fnd-acc-4217/CNY,
   :lcc-lr/denotes :fibo-fnd-acc-4217/YuanRenminbi,
   :lcc-lr/hasTag "CNY",
   :lcc-lr/identifies :fibo-fnd-acc-4217/YuanRenminbi,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "CNY",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the currency identifier for Yuan Renminbi"}})

(def COP
  "the currency identifier for Colombian Peso"
  {:db/ident :fibo-fnd-acc-4217/COP,
   :lcc-lr/denotes :fibo-fnd-acc-4217/ColombianPeso,
   :lcc-lr/hasTag "COP",
   :lcc-lr/identifies :fibo-fnd-acc-4217/ColombianPeso,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "COP",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the currency identifier for Colombian Peso"}})

(def COU
  "the funds identifier for Unidad de Valor Real"
  {:db/ident :fibo-fnd-acc-4217/COU,
   :lcc-lr/denotes :fibo-fnd-acc-4217/UnidaddeValorReal,
   :lcc-lr/hasTag "COU",
   :lcc-lr/identifies :fibo-fnd-acc-4217/UnidaddeValorReal,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/FundsIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "COU",
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "the funds identifier for Unidad de Valor Real"}})

(def CRC
  "the currency identifier for Costa Rican Colon"
  {:db/ident :fibo-fnd-acc-4217/CRC,
   :lcc-lr/denotes :fibo-fnd-acc-4217/CostaRicanColon,
   :lcc-lr/hasTag "CRC",
   :lcc-lr/identifies :fibo-fnd-acc-4217/CostaRicanColon,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "CRC",
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "the currency identifier for Costa Rican Colon"}})

(def CUC
  "the currency identifier for Peso Convertible"
  {:db/ident :fibo-fnd-acc-4217/CUC,
   :lcc-lr/denotes :fibo-fnd-acc-4217/PesoConvertible,
   :lcc-lr/hasTag "CUC",
   :lcc-lr/identifies :fibo-fnd-acc-4217/PesoConvertible,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "CUC",
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "the currency identifier for Peso Convertible"}})

(def CUP
  "the currency identifier for Cuban Peso"
  {:db/ident :fibo-fnd-acc-4217/CUP,
   :lcc-lr/denotes :fibo-fnd-acc-4217/CubanPeso,
   :lcc-lr/hasTag "CUP",
   :lcc-lr/identifies :fibo-fnd-acc-4217/CubanPeso,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "CUP",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Cuban Peso"}})

(def CVE
  "the currency identifier for Cabo Verde Escudo"
  {:db/ident :fibo-fnd-acc-4217/CVE,
   :lcc-lr/denotes :fibo-fnd-acc-4217/CaboVerdeEscudo,
   :lcc-lr/hasTag "CVE",
   :lcc-lr/identifies :fibo-fnd-acc-4217/CaboVerdeEscudo,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "CVE",
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "the currency identifier for Cabo Verde Escudo"}})

(def CZK
  "the currency identifier for Czech Koruna"
  {:db/ident :fibo-fnd-acc-4217/CZK,
   :lcc-lr/denotes :fibo-fnd-acc-4217/CzechKoruna,
   :lcc-lr/hasTag "CZK",
   :lcc-lr/identifies :fibo-fnd-acc-4217/CzechKoruna,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "CZK",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Czech Koruna"}})

(def CaboVerdeEscudo
  "the currency Cabo Verde Escudo"
  {:db/ident :fibo-fnd-acc-4217/CaboVerdeEscudo,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "132",
   :lcc-cr/isUsedBy :lcc-3166-1/CaboVerde,
   :lcc-lr/hasName "Cabo Verde Escudo",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Cabo Verde Escudo",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Cabo Verde Escudo"}})

(def CanadianDollar
  "the currency Canadian Dollar"
  {:db/ident :fibo-fnd-acc-4217/CanadianDollar,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "124",
   :lcc-cr/isUsedBy :lcc-3166-1/Canada,
   :lcc-lr/hasName "Canadian Dollar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Canadian Dollar",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Canadian Dollar"}})

(def CaymanIslandsDollar
  "the currency Cayman Islands Dollar"
  {:db/ident :fibo-fnd-acc-4217/CaymanIslandsDollar,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "136",
   :lcc-cr/isUsedBy :lcc-3166-1/CaymanIslands,
   :lcc-lr/hasName "Cayman Islands Dollar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Cayman Islands Dollar",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Cayman Islands Dollar"}})

(def ChileanPeso
  "the currency Chilean Peso"
  {:db/ident :fibo-fnd-acc-4217/ChileanPeso,
   :fibo-fnd-acc-cur/hasMinorUnit "0",
   :fibo-fnd-acc-cur/hasNumericCode "152",
   :lcc-cr/isUsedBy :lcc-3166-1/Chile,
   :lcc-lr/hasName "Chilean Peso",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Chilean Peso",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Chilean Peso"}})

(def ColombianPeso
  "the currency Colombian Peso"
  {:db/ident :fibo-fnd-acc-4217/ColombianPeso,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "170",
   :lcc-cr/isUsedBy :lcc-3166-1/Colombia,
   :lcc-lr/hasName "Colombian Peso",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Colombian Peso",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Colombian Peso"}})

(def ComorianFranc
  "the currency Comorian Franc"
  {:db/ident :fibo-fnd-acc-4217/ComorianFranc,
   :fibo-fnd-acc-cur/hasMinorUnit "0",
   :fibo-fnd-acc-cur/hasNumericCode "174",
   :lcc-cr/isUsedBy :lcc-3166-1/Comoros,
   :lcc-lr/hasName "Comorian Franc",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Comorian Franc",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Comorian Franc"}})

(def CongoleseFranc
  "the currency Congolese Franc"
  {:db/ident :fibo-fnd-acc-4217/CongoleseFranc,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "976",
   :lcc-cr/isUsedBy :lcc-3166-1/CongoDemocraticRepublicOf,
   :lcc-lr/hasName "Congolese Franc",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Congolese Franc",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Congolese Franc"}})

(def ConvertibleMark
  "the currency Convertible Mark"
  {:db/ident :fibo-fnd-acc-4217/ConvertibleMark,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "977",
   :lcc-cr/isUsedBy :lcc-3166-1/BosniaAndHerzegovina,
   :lcc-lr/hasName "Convertible Mark",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Convertible Mark",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Convertible Mark"}})

(def CordobaOro
  "the currency Cordoba Oro"
  {:db/ident :fibo-fnd-acc-4217/CordobaOro,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "558",
   :lcc-cr/isUsedBy :lcc-3166-1/Nicaragua,
   :lcc-lr/hasName "Cordoba Oro",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Cordoba Oro",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Cordoba Oro"}})

(def CostaRicanColon
  "the currency Costa Rican Colon"
  {:db/ident :fibo-fnd-acc-4217/CostaRicanColon,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "188",
   :lcc-cr/isUsedBy :lcc-3166-1/CostaRica,
   :lcc-lr/hasName "Costa Rican Colon",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Costa Rican Colon",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Costa Rican Colon"}})

(def CubanPeso
  "the currency Cuban Peso"
  {:db/ident :fibo-fnd-acc-4217/CubanPeso,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "192",
   :lcc-cr/isUsedBy :lcc-3166-1/Cuba,
   :lcc-lr/hasName "Cuban Peso",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Cuban Peso",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Cuban Peso"}})

(def CzechKoruna
  "the currency Czech Koruna"
  {:db/ident :fibo-fnd-acc-4217/CzechKoruna,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "203",
   :lcc-cr/isUsedBy :lcc-3166-1/Czechia,
   :lcc-lr/hasName "Czech Koruna",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Czech Koruna",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Czech Koruna"}})

(def DJF
  "the currency identifier for Djibouti Franc"
  {:db/ident :fibo-fnd-acc-4217/DJF,
   :lcc-lr/denotes :fibo-fnd-acc-4217/DjiboutiFranc,
   :lcc-lr/hasTag "DJF",
   :lcc-lr/identifies :fibo-fnd-acc-4217/DjiboutiFranc,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "DJF",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the currency identifier for Djibouti Franc"}})

(def DKK
  "the currency identifier for Danish Krone"
  {:db/ident :fibo-fnd-acc-4217/DKK,
   :lcc-lr/denotes :fibo-fnd-acc-4217/DanishKrone,
   :lcc-lr/hasTag "DKK",
   :lcc-lr/identifies :fibo-fnd-acc-4217/DanishKrone,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "DKK",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Danish Krone"}})

(def DOP
  "the currency identifier for Dominican Peso"
  {:db/ident :fibo-fnd-acc-4217/DOP,
   :lcc-lr/denotes :fibo-fnd-acc-4217/DominicanPeso,
   :lcc-lr/hasTag "DOP",
   :lcc-lr/identifies :fibo-fnd-acc-4217/DominicanPeso,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "DOP",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the currency identifier for Dominican Peso"}})

(def DZD
  "the currency identifier for Algerian Dinar"
  {:db/ident :fibo-fnd-acc-4217/DZD,
   :lcc-lr/denotes :fibo-fnd-acc-4217/AlgerianDinar,
   :lcc-lr/hasTag "DZD",
   :lcc-lr/identifies :fibo-fnd-acc-4217/AlgerianDinar,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "DZD",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the currency identifier for Algerian Dinar"}})

(def Dalasi
  "the currency Dalasi"
  {:db/ident :fibo-fnd-acc-4217/Dalasi,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "270",
   :lcc-cr/isUsedBy :lcc-3166-1/Gambia,
   :lcc-lr/hasName "Dalasi",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Dalasi",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Dalasi"}})

(def DanishKrone
  "the currency Danish Krone"
  {:db/ident :fibo-fnd-acc-4217/DanishKrone,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "208",
   :lcc-cr/isUsedBy
   [:lcc-3166-1/Greenland :lcc-3166-1/Denmark :lcc-3166-1/FaroeIslands],
   :lcc-lr/hasName "Danish Krone",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-acc-cur/Currency],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Danish Krone",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Danish Krone"}})

(def Denar
  "the currency Denar"
  {:db/ident :fibo-fnd-acc-4217/Denar,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "807",
   :lcc-cr/isUsedBy :lcc-3166-1/NorthMacedonia,
   :lcc-lr/hasName "Denar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Denar",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Denar"}})

(def DjiboutiFranc
  "the currency Djibouti Franc"
  {:db/ident :fibo-fnd-acc-4217/DjiboutiFranc,
   :fibo-fnd-acc-cur/hasMinorUnit "0",
   :fibo-fnd-acc-cur/hasNumericCode "262",
   :lcc-cr/isUsedBy :lcc-3166-1/Djibouti,
   :lcc-lr/hasName "Djibouti Franc",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Djibouti Franc",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Djibouti Franc"}})

(def Dobra
  "the currency Dobra"
  {:db/ident :fibo-fnd-acc-4217/Dobra,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "930",
   :lcc-cr/isUsedBy :lcc-3166-1/SaoTomeAndPrincipe,
   :lcc-lr/hasName "Dobra",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Dobra",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Dobra"}})

(def DominicanPeso
  "the currency Dominican Peso"
  {:db/ident :fibo-fnd-acc-4217/DominicanPeso,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "214",
   :lcc-cr/isUsedBy :lcc-3166-1/DominicanRepublic,
   :lcc-lr/hasName "Dominican Peso",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Dominican Peso",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Dominican Peso"}})

(def Dong
  "the currency Dong"
  {:db/ident :fibo-fnd-acc-4217/Dong,
   :fibo-fnd-acc-cur/hasMinorUnit "0",
   :fibo-fnd-acc-cur/hasNumericCode "704",
   :lcc-cr/isUsedBy :lcc-3166-1/VietNam,
   :lcc-lr/hasName "Dong",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Dong",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Dong"}})

(def EGP
  "the currency identifier for Egyptian Pound"
  {:db/ident :fibo-fnd-acc-4217/EGP,
   :lcc-lr/denotes :fibo-fnd-acc-4217/EgyptianPound,
   :lcc-lr/hasTag "EGP",
   :lcc-lr/identifies :fibo-fnd-acc-4217/EgyptianPound,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "EGP",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the currency identifier for Egyptian Pound"}})

(def ERN
  "the currency identifier for Nakfa"
  {:db/ident :fibo-fnd-acc-4217/ERN,
   :lcc-lr/denotes :fibo-fnd-acc-4217/Nakfa,
   :lcc-lr/hasTag "ERN",
   :lcc-lr/identifies :fibo-fnd-acc-4217/Nakfa,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "ERN",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Nakfa"}})

(def ETB
  "the currency identifier for Ethiopian Birr"
  {:db/ident :fibo-fnd-acc-4217/ETB,
   :lcc-lr/denotes :fibo-fnd-acc-4217/EthiopianBirr,
   :lcc-lr/hasTag "ETB",
   :lcc-lr/identifies :fibo-fnd-acc-4217/EthiopianBirr,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "ETB",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the currency identifier for Ethiopian Birr"}})

(def EUR
  "the currency identifier for Euro"
  {:db/ident :fibo-fnd-acc-4217/EUR,
   :lcc-lr/denotes :fibo-fnd-acc-4217/Euro,
   :lcc-lr/hasTag "EUR",
   :lcc-lr/identifies :fibo-fnd-acc-4217/Euro,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "EUR",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Euro"}})

(def EastCaribbeanDollar
  "the currency East Caribbean Dollar"
  {:db/ident :fibo-fnd-acc-4217/EastCaribbeanDollar,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "951",
   :lcc-cr/isUsedBy [:lcc-3166-1/SaintKittsAndNevis
                     :lcc-3166-1/SaintLucia
                     :lcc-3166-1/Montserrat
                     :lcc-3166-1/Anguilla
                     :lcc-3166-1/Grenada
                     :lcc-3166-1/SaintVincentAndTheGrenadines
                     :lcc-3166-1/AntiguaAndBarbuda
                     :lcc-3166-1/Dominica],
   :lcc-lr/hasName "East Caribbean Dollar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "East Caribbean Dollar",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency East Caribbean Dollar"}})

(def EgyptianPound
  "the currency Egyptian Pound"
  {:db/ident :fibo-fnd-acc-4217/EgyptianPound,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "818",
   :lcc-cr/isUsedBy :lcc-3166-1/Egypt,
   :lcc-lr/hasName "Egyptian Pound",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Egyptian Pound",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Egyptian Pound"}})

(def ElSalvadorColon
  "the currency El Salvador Colon"
  {:db/ident :fibo-fnd-acc-4217/ElSalvadorColon,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "222",
   :lcc-cr/isUsedBy :lcc-3166-1/ElSalvador,
   :lcc-lr/hasName "El Salvador Colon",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "El Salvador Colon",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency El Salvador Colon"}})

(def EthiopianBirr
  "the currency Ethiopian Birr"
  {:db/ident :fibo-fnd-acc-4217/EthiopianBirr,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "230",
   :lcc-cr/isUsedBy :lcc-3166-1/Ethiopia,
   :lcc-lr/hasName "Ethiopian Birr",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Ethiopian Birr",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Ethiopian Birr"}})

(def Euro
  "the currency Euro"
  {:db/ident :fibo-fnd-acc-4217/Euro,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "978",
   :lcc-cr/isUsedBy [:lcc-3166-1/Lithuania
                     :lcc-3166-1/FrenchGuiana
                     :lcc-3166-1/Martinique
                     :lcc-3166-1/Netherlands
                     :lcc-3166-1/Italy
                     :lcc-3166-1/Belgium
                     :lcc-3166-1/Spain
                     :lcc-3166-1/SaintBarthelemy
                     :lcc-3166-1/Germany
                     :lcc-3166-1/Estonia
                     :lcc-3166-1/Ireland
                     :lcc-3166-1/AlandIslands
                     :lcc-3166-1/Cyprus
                     :lcc-3166-1/Guadeloupe
                     :lcc-3166-1/Greece
                     :lcc-3166-1/Mayotte
                     :lcc-3166-1/Reunion
                     :lcc-3166-1/FrenchSouthernTerritories
                     :lcc-3166-1/HolySee
                     :lcc-3166-1/Portugal
                     :lcc-3166-1/SaintPierreAndMiquelon
                     :lcc-3166-1/Malta
                     :lcc-3166-1/Latvia
                     :lcc-3166-1/France
                     :lcc-3166-1/SaintMartin
                     :lcc-3166-1/Luxembourg
                     :lcc-3166-1/SanMarino
                     :lcc-3166-1/Monaco
                     :lcc-3166-1/Slovakia
                     :lcc-3166-1/Finland
                     :lcc-3166-1/Montenegro
                     :lcc-3166-1/Slovenia
                     :lcc-3166-1/Austria
                     :lcc-3166-1/Andorra],
   :lcc-lr/hasName "Euro",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-acc-cur/Currency],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Euro",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Euro"}})

(def FJD
  "the currency identifier for Fiji Dollar"
  {:db/ident :fibo-fnd-acc-4217/FJD,
   :lcc-lr/denotes :fibo-fnd-acc-4217/FijiDollar,
   :lcc-lr/hasTag "FJD",
   :lcc-lr/identifies :fibo-fnd-acc-4217/FijiDollar,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "FJD",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Fiji Dollar"}})

(def FKP
  "the currency identifier for Falkland Islands Pound"
  {:db/ident :fibo-fnd-acc-4217/FKP,
   :lcc-lr/denotes :fibo-fnd-acc-4217/FalklandIslandsPound,
   :lcc-lr/hasTag "FKP",
   :lcc-lr/identifies :fibo-fnd-acc-4217/FalklandIslandsPound,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "FKP",
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "the currency identifier for Falkland Islands Pound"}})

(def FalklandIslandsPound
  "the currency Falkland Islands Pound"
  {:db/ident :fibo-fnd-acc-4217/FalklandIslandsPound,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "238",
   :lcc-cr/isUsedBy :lcc-3166-1/FalklandIslands,
   :lcc-lr/hasName "Falkland Islands Pound",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Falkland Islands Pound",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Falkland Islands Pound"}})

(def FijiDollar
  "the currency Fiji Dollar"
  {:db/ident :fibo-fnd-acc-4217/FijiDollar,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "242",
   :lcc-cr/isUsedBy :lcc-3166-1/Fiji,
   :lcc-lr/hasName "Fiji Dollar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Fiji Dollar",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Fiji Dollar"}})

(def Forint
  "the currency Forint"
  {:db/ident :fibo-fnd-acc-4217/Forint,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "348",
   :lcc-cr/isUsedBy :lcc-3166-1/Hungary,
   :lcc-lr/hasName "Forint",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Forint",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Forint"}})

(def GBP
  "the currency identifier for Pound Sterling"
  {:db/ident :fibo-fnd-acc-4217/GBP,
   :lcc-lr/denotes :fibo-fnd-acc-4217/PoundSterling,
   :lcc-lr/hasTag "GBP",
   :lcc-lr/identifies :fibo-fnd-acc-4217/PoundSterling,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "GBP",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the currency identifier for Pound Sterling"}})

(def GEL
  "the currency identifier for Lari"
  {:db/ident :fibo-fnd-acc-4217/GEL,
   :lcc-lr/denotes :fibo-fnd-acc-4217/Lari,
   :lcc-lr/hasTag "GEL",
   :lcc-lr/identifies :fibo-fnd-acc-4217/Lari,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "GEL",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Lari"}})

(def GHS
  "the currency identifier for Ghana Cedi"
  {:db/ident :fibo-fnd-acc-4217/GHS,
   :lcc-lr/denotes :fibo-fnd-acc-4217/GhanaCedi,
   :lcc-lr/hasTag "GHS",
   :lcc-lr/identifies :fibo-fnd-acc-4217/GhanaCedi,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "GHS",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Ghana Cedi"}})

(def GIP
  "the currency identifier for Gibraltar Pound"
  {:db/ident :fibo-fnd-acc-4217/GIP,
   :lcc-lr/denotes :fibo-fnd-acc-4217/GibraltarPound,
   :lcc-lr/hasTag "GIP",
   :lcc-lr/identifies :fibo-fnd-acc-4217/GibraltarPound,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "GIP",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the currency identifier for Gibraltar Pound"}})

(def GMD
  "the currency identifier for Dalasi"
  {:db/ident :fibo-fnd-acc-4217/GMD,
   :lcc-lr/denotes :fibo-fnd-acc-4217/Dalasi,
   :lcc-lr/hasTag "GMD",
   :lcc-lr/identifies :fibo-fnd-acc-4217/Dalasi,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "GMD",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Dalasi"}})

(def GNF
  "the currency identifier for Guinean Franc"
  {:db/ident :fibo-fnd-acc-4217/GNF,
   :lcc-lr/denotes :fibo-fnd-acc-4217/GuineanFranc,
   :lcc-lr/hasTag "GNF",
   :lcc-lr/identifies :fibo-fnd-acc-4217/GuineanFranc,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "GNF",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the currency identifier for Guinean Franc"}})

(def GTQ
  "the currency identifier for Quetzal"
  {:db/ident :fibo-fnd-acc-4217/GTQ,
   :lcc-lr/denotes :fibo-fnd-acc-4217/Quetzal,
   :lcc-lr/hasTag "GTQ",
   :lcc-lr/identifies :fibo-fnd-acc-4217/Quetzal,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "GTQ",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Quetzal"}})

(def GYD
  "the currency identifier for Guyana Dollar"
  {:db/ident :fibo-fnd-acc-4217/GYD,
   :lcc-lr/denotes :fibo-fnd-acc-4217/GuyanaDollar,
   :lcc-lr/hasTag "GYD",
   :lcc-lr/identifies :fibo-fnd-acc-4217/GuyanaDollar,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "GYD",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the currency identifier for Guyana Dollar"}})

(def GhanaCedi
  "the currency Ghana Cedi"
  {:db/ident :fibo-fnd-acc-4217/GhanaCedi,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "936",
   :lcc-cr/isUsedBy :lcc-3166-1/Ghana,
   :lcc-lr/hasName "Ghana Cedi",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Ghana Cedi",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Ghana Cedi"}})

(def GibraltarPound
  "the currency Gibraltar Pound"
  {:db/ident :fibo-fnd-acc-4217/GibraltarPound,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "292",
   :lcc-cr/isUsedBy :lcc-3166-1/Gibraltar,
   :lcc-lr/hasName "Gibraltar Pound",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Gibraltar Pound",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Gibraltar Pound"}})

(def Gold
  "the currency whose unit is one troy ounce of the precious metal Gold"
  {:db/ident :fibo-fnd-acc-4217/Gold,
   :fibo-fnd-acc-cur/hasNumericCode "959",
   :lcc-lr/hasName "Gold",
   :rdf/type [:fibo-fnd-acc-cur/PreciousMetal :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Gold",
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "the currency whose unit is one troy ounce of the precious metal Gold"}})

(def Gourde
  "the currency Gourde"
  {:db/ident :fibo-fnd-acc-4217/Gourde,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "332",
   :lcc-cr/isUsedBy :lcc-3166-1/Haiti,
   :lcc-lr/hasName "Gourde",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Gourde",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Gourde"}})

(def Guarani
  "the currency Guarani"
  {:db/ident :fibo-fnd-acc-4217/Guarani,
   :fibo-fnd-acc-cur/hasMinorUnit "0",
   :fibo-fnd-acc-cur/hasNumericCode "600",
   :lcc-cr/isUsedBy :lcc-3166-1/Paraguay,
   :lcc-lr/hasName "Guarani",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Guarani",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Guarani"}})

(def GuineanFranc
  "the currency Guinean Franc"
  {:db/ident :fibo-fnd-acc-4217/GuineanFranc,
   :fibo-fnd-acc-cur/hasMinorUnit "0",
   :fibo-fnd-acc-cur/hasNumericCode "324",
   :lcc-cr/isUsedBy :lcc-3166-1/Guinea,
   :lcc-lr/hasName "Guinean Franc",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Guinean Franc",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Guinean Franc"}})

(def GuyanaDollar
  "the currency Guyana Dollar"
  {:db/ident :fibo-fnd-acc-4217/GuyanaDollar,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "328",
   :lcc-cr/isUsedBy :lcc-3166-1/Guyana,
   :lcc-lr/hasName "Guyana Dollar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Guyana Dollar",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Guyana Dollar"}})

(def HKD
  "the currency identifier for Hong Kong Dollar"
  {:db/ident :fibo-fnd-acc-4217/HKD,
   :lcc-lr/denotes :fibo-fnd-acc-4217/HongKongDollar,
   :lcc-lr/hasTag "HKD",
   :lcc-lr/identifies :fibo-fnd-acc-4217/HongKongDollar,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "HKD",
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "the currency identifier for Hong Kong Dollar"}})

(def HNL
  "the currency identifier for Lempira"
  {:db/ident :fibo-fnd-acc-4217/HNL,
   :lcc-lr/denotes :fibo-fnd-acc-4217/Lempira,
   :lcc-lr/hasTag "HNL",
   :lcc-lr/identifies :fibo-fnd-acc-4217/Lempira,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "HNL",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Lempira"}})

(def HRK
  "the currency identifier for Kuna"
  {:db/ident :fibo-fnd-acc-4217/HRK,
   :lcc-lr/denotes :fibo-fnd-acc-4217/Kuna,
   :lcc-lr/hasTag "HRK",
   :lcc-lr/identifies :fibo-fnd-acc-4217/Kuna,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "HRK",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Kuna"}})

(def HTG
  "the currency identifier for Gourde"
  {:db/ident :fibo-fnd-acc-4217/HTG,
   :lcc-lr/denotes :fibo-fnd-acc-4217/Gourde,
   :lcc-lr/hasTag "HTG",
   :lcc-lr/identifies :fibo-fnd-acc-4217/Gourde,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "HTG",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Gourde"}})

(def HUF
  "the currency identifier for Forint"
  {:db/ident :fibo-fnd-acc-4217/HUF,
   :lcc-lr/denotes :fibo-fnd-acc-4217/Forint,
   :lcc-lr/hasTag "HUF",
   :lcc-lr/identifies :fibo-fnd-acc-4217/Forint,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "HUF",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Forint"}})

(def HongKongDollar
  "the currency Hong Kong Dollar"
  {:db/ident :fibo-fnd-acc-4217/HongKongDollar,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "344",
   :lcc-cr/isUsedBy :lcc-3166-1/HongKong,
   :lcc-lr/hasName "Hong Kong Dollar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Hong Kong Dollar",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Hong Kong Dollar"}})

(def Hryvnia
  "the currency Hryvnia"
  {:db/ident :fibo-fnd-acc-4217/Hryvnia,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "980",
   :lcc-cr/isUsedBy :lcc-3166-1/Ukraine,
   :lcc-lr/hasName "Hryvnia",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Hryvnia",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Hryvnia"}})

(def IDR
  "the currency identifier for Rupiah"
  {:db/ident :fibo-fnd-acc-4217/IDR,
   :lcc-lr/denotes :fibo-fnd-acc-4217/Rupiah,
   :lcc-lr/hasTag "IDR",
   :lcc-lr/identifies :fibo-fnd-acc-4217/Rupiah,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "IDR",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Rupiah"}})

(def ILS
  "the currency identifier for New Israeli Sheqel"
  {:db/ident :fibo-fnd-acc-4217/ILS,
   :lcc-lr/denotes :fibo-fnd-acc-4217/NewIsraeliSheqel,
   :lcc-lr/hasTag "ILS",
   :lcc-lr/identifies :fibo-fnd-acc-4217/NewIsraeliSheqel,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "ILS",
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "the currency identifier for New Israeli Sheqel"}})

(def INR
  "the currency identifier for Indian Rupee"
  {:db/ident :fibo-fnd-acc-4217/INR,
   :lcc-lr/denotes :fibo-fnd-acc-4217/IndianRupee,
   :lcc-lr/hasTag "INR",
   :lcc-lr/identifies :fibo-fnd-acc-4217/IndianRupee,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "INR",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Indian Rupee"}})

(def IQD
  "the currency identifier for Iraqi Dinar"
  {:db/ident :fibo-fnd-acc-4217/IQD,
   :lcc-lr/denotes :fibo-fnd-acc-4217/IraqiDinar,
   :lcc-lr/hasTag "IQD",
   :lcc-lr/identifies :fibo-fnd-acc-4217/IraqiDinar,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "IQD",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Iraqi Dinar"}})

(def IRR
  "the currency identifier for Iranian Rial"
  {:db/ident :fibo-fnd-acc-4217/IRR,
   :lcc-lr/denotes :fibo-fnd-acc-4217/IranianRial,
   :lcc-lr/hasTag "IRR",
   :lcc-lr/identifies :fibo-fnd-acc-4217/IranianRial,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "IRR",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Iranian Rial"}})

(def ISK
  "the currency identifier for Iceland Krona"
  {:db/ident :fibo-fnd-acc-4217/ISK,
   :lcc-lr/denotes :fibo-fnd-acc-4217/IcelandKrona,
   :lcc-lr/hasTag "ISK",
   :lcc-lr/identifies :fibo-fnd-acc-4217/IcelandKrona,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "ISK",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the currency identifier for Iceland Krona"}})

(def ISO4217-CodeSet
  "the set of currency identifiers that comprise the ISO 4217 specification"
  {:db/ident :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type
   [:lcc-lr/IdentificationScheme :lcc-lr/CodeSet :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "ISO 4217 code set",
   :skos/definition
   "the set of currency identifiers that comprise the ISO 4217 specification"})

(def IcelandKrona
  "the currency Iceland Krona"
  {:db/ident :fibo-fnd-acc-4217/IcelandKrona,
   :fibo-fnd-acc-cur/hasMinorUnit "0",
   :fibo-fnd-acc-cur/hasNumericCode "352",
   :lcc-cr/isUsedBy :lcc-3166-1/Iceland,
   :lcc-lr/hasName "Iceland Krona",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Iceland Krona",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Iceland Krona"}})

(def IndianRupee
  "the currency Indian Rupee"
  {:db/ident :fibo-fnd-acc-4217/IndianRupee,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "356",
   :lcc-cr/isUsedBy [:lcc-3166-1/India :lcc-3166-1/Bhutan],
   :lcc-lr/hasName "Indian Rupee",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Indian Rupee",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Indian Rupee"}})

(def IranianRial
  "the currency Iranian Rial"
  {:db/ident :fibo-fnd-acc-4217/IranianRial,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "364",
   :lcc-cr/isUsedBy :lcc-3166-1/Iran,
   :lcc-lr/hasName "Iranian Rial",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Iranian Rial",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Iranian Rial"}})

(def IraqiDinar
  "the currency Iraqi Dinar"
  {:db/ident :fibo-fnd-acc-4217/IraqiDinar,
   :fibo-fnd-acc-cur/hasMinorUnit "3",
   :fibo-fnd-acc-cur/hasNumericCode "368",
   :lcc-cr/isUsedBy :lcc-3166-1/Iraq,
   :lcc-lr/hasName "Iraqi Dinar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Iraqi Dinar",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Iraqi Dinar"}})

(def JMD
  "the currency identifier for Jamaican Dollar"
  {:db/ident :fibo-fnd-acc-4217/JMD,
   :lcc-lr/denotes :fibo-fnd-acc-4217/JamaicanDollar,
   :lcc-lr/hasTag "JMD",
   :lcc-lr/identifies :fibo-fnd-acc-4217/JamaicanDollar,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "JMD",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the currency identifier for Jamaican Dollar"}})

(def JOD
  "the currency identifier for Jordanian Dinar"
  {:db/ident :fibo-fnd-acc-4217/JOD,
   :lcc-lr/denotes :fibo-fnd-acc-4217/JordanianDinar,
   :lcc-lr/hasTag "JOD",
   :lcc-lr/identifies :fibo-fnd-acc-4217/JordanianDinar,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "JOD",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the currency identifier for Jordanian Dinar"}})

(def JPY
  "the currency identifier for Yen"
  {:db/ident :fibo-fnd-acc-4217/JPY,
   :lcc-lr/denotes :fibo-fnd-acc-4217/Yen,
   :lcc-lr/hasTag "JPY",
   :lcc-lr/identifies :fibo-fnd-acc-4217/Yen,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "JPY",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Yen"}})

(def JamaicanDollar
  "the currency Jamaican Dollar"
  {:db/ident :fibo-fnd-acc-4217/JamaicanDollar,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "388",
   :lcc-cr/isUsedBy :lcc-3166-1/Jamaica,
   :lcc-lr/hasName "Jamaican Dollar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Jamaican Dollar",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Jamaican Dollar"}})

(def JordanianDinar
  "the currency Jordanian Dinar"
  {:db/ident :fibo-fnd-acc-4217/JordanianDinar,
   :fibo-fnd-acc-cur/hasMinorUnit "3",
   :fibo-fnd-acc-cur/hasNumericCode "400",
   :lcc-cr/isUsedBy :lcc-3166-1/Jordan,
   :lcc-lr/hasName "Jordanian Dinar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Jordanian Dinar",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Jordanian Dinar"}})

(def KES
  "the currency identifier for Kenyan Shilling"
  {:db/ident :fibo-fnd-acc-4217/KES,
   :lcc-lr/denotes :fibo-fnd-acc-4217/KenyanShilling,
   :lcc-lr/hasTag "KES",
   :lcc-lr/identifies :fibo-fnd-acc-4217/KenyanShilling,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "KES",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the currency identifier for Kenyan Shilling"}})

(def KGS
  "the currency identifier for Som"
  {:db/ident :fibo-fnd-acc-4217/KGS,
   :lcc-lr/denotes :fibo-fnd-acc-4217/Som,
   :lcc-lr/hasTag "KGS",
   :lcc-lr/identifies :fibo-fnd-acc-4217/Som,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "KGS",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Som"}})

(def KHR
  "the currency identifier for Riel"
  {:db/ident :fibo-fnd-acc-4217/KHR,
   :lcc-lr/denotes :fibo-fnd-acc-4217/Riel,
   :lcc-lr/hasTag "KHR",
   :lcc-lr/identifies :fibo-fnd-acc-4217/Riel,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "KHR",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Riel"}})

(def KMF
  "the currency identifier for Comorian Franc"
  {:db/ident :fibo-fnd-acc-4217/KMF,
   :lcc-lr/denotes :fibo-fnd-acc-4217/ComorianFranc,
   :lcc-lr/hasTag "KMF",
   :lcc-lr/identifies :fibo-fnd-acc-4217/ComorianFranc,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "KMF",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the currency identifier for Comorian Franc"}})

(def KPW
  "the currency identifier for North Korean Won"
  {:db/ident :fibo-fnd-acc-4217/KPW,
   :lcc-lr/denotes :fibo-fnd-acc-4217/NorthKoreanWon,
   :lcc-lr/hasTag "KPW",
   :lcc-lr/identifies :fibo-fnd-acc-4217/NorthKoreanWon,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "KPW",
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "the currency identifier for North Korean Won"}})

(def KRW
  "the currency identifier for Won"
  {:db/ident :fibo-fnd-acc-4217/KRW,
   :lcc-lr/denotes :fibo-fnd-acc-4217/Won,
   :lcc-lr/hasTag "KRW",
   :lcc-lr/identifies :fibo-fnd-acc-4217/Won,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "KRW",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Won"}})

(def KWD
  "the currency identifier for Kuwaiti Dinar"
  {:db/ident :fibo-fnd-acc-4217/KWD,
   :lcc-lr/denotes :fibo-fnd-acc-4217/KuwaitiDinar,
   :lcc-lr/hasTag "KWD",
   :lcc-lr/identifies :fibo-fnd-acc-4217/KuwaitiDinar,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "KWD",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the currency identifier for Kuwaiti Dinar"}})

(def KYD
  "the currency identifier for Cayman Islands Dollar"
  {:db/ident :fibo-fnd-acc-4217/KYD,
   :lcc-lr/denotes :fibo-fnd-acc-4217/CaymanIslandsDollar,
   :lcc-lr/hasTag "KYD",
   :lcc-lr/identifies :fibo-fnd-acc-4217/CaymanIslandsDollar,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "KYD",
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "the currency identifier for Cayman Islands Dollar"}})

(def KZT
  "the currency identifier for Tenge"
  {:db/ident :fibo-fnd-acc-4217/KZT,
   :lcc-lr/denotes :fibo-fnd-acc-4217/Tenge,
   :lcc-lr/hasTag "KZT",
   :lcc-lr/identifies :fibo-fnd-acc-4217/Tenge,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "KZT",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Tenge"}})

(def KenyanShilling
  "the currency Kenyan Shilling"
  {:db/ident :fibo-fnd-acc-4217/KenyanShilling,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "404",
   :lcc-cr/isUsedBy :lcc-3166-1/Kenya,
   :lcc-lr/hasName "Kenyan Shilling",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Kenyan Shilling",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Kenyan Shilling"}})

(def Kina
  "the currency Kina"
  {:db/ident :fibo-fnd-acc-4217/Kina,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "598",
   :lcc-cr/isUsedBy :lcc-3166-1/PapuaNewGuinea,
   :lcc-lr/hasName "Kina",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Kina",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Kina"}})

(def Kuna
  "the currency Kuna"
  {:db/ident :fibo-fnd-acc-4217/Kuna,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "191",
   :lcc-cr/isUsedBy :lcc-3166-1/Croatia,
   :lcc-lr/hasName "Kuna",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Kuna",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Kuna"}})

(def KuwaitiDinar
  "the currency Kuwaiti Dinar"
  {:db/ident :fibo-fnd-acc-4217/KuwaitiDinar,
   :fibo-fnd-acc-cur/hasMinorUnit "3",
   :fibo-fnd-acc-cur/hasNumericCode "414",
   :lcc-cr/isUsedBy :lcc-3166-1/Kuwait,
   :lcc-lr/hasName "Kuwaiti Dinar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Kuwaiti Dinar",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Kuwaiti Dinar"}})

(def Kwanza
  "the currency Kwanza"
  {:db/ident :fibo-fnd-acc-4217/Kwanza,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "973",
   :lcc-cr/isUsedBy :lcc-3166-1/Angola,
   :lcc-lr/hasName "Kwanza",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Kwanza",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Kwanza"}})

(def Kyat
  "the currency Kyat"
  {:db/ident :fibo-fnd-acc-4217/Kyat,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "104",
   :lcc-cr/isUsedBy :lcc-3166-1/Myanmar,
   :lcc-lr/hasName "Kyat",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Kyat",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Kyat"}})

(def LAK
  "the currency identifier for Lao Kip"
  {:db/ident :fibo-fnd-acc-4217/LAK,
   :lcc-lr/denotes :fibo-fnd-acc-4217/LaoKip,
   :lcc-lr/hasTag "LAK",
   :lcc-lr/identifies :fibo-fnd-acc-4217/LaoKip,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "LAK",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Lao Kip"}})

(def LBP
  "the currency identifier for Lebanese Pound"
  {:db/ident :fibo-fnd-acc-4217/LBP,
   :lcc-lr/denotes :fibo-fnd-acc-4217/LebanesePound,
   :lcc-lr/hasTag "LBP",
   :lcc-lr/identifies :fibo-fnd-acc-4217/LebanesePound,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "LBP",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the currency identifier for Lebanese Pound"}})

(def LKR
  "the currency identifier for Sri Lanka Rupee"
  {:db/ident :fibo-fnd-acc-4217/LKR,
   :lcc-lr/denotes :fibo-fnd-acc-4217/SriLankaRupee,
   :lcc-lr/hasTag "LKR",
   :lcc-lr/identifies :fibo-fnd-acc-4217/SriLankaRupee,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "LKR",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the currency identifier for Sri Lanka Rupee"}})

(def LRD
  "the currency identifier for Liberian Dollar"
  {:db/ident :fibo-fnd-acc-4217/LRD,
   :lcc-lr/denotes :fibo-fnd-acc-4217/LiberianDollar,
   :lcc-lr/hasTag "LRD",
   :lcc-lr/identifies :fibo-fnd-acc-4217/LiberianDollar,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "LRD",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the currency identifier for Liberian Dollar"}})

(def LSL
  "the currency identifier for Loti"
  {:db/ident :fibo-fnd-acc-4217/LSL,
   :lcc-lr/denotes :fibo-fnd-acc-4217/Loti,
   :lcc-lr/hasTag "LSL",
   :lcc-lr/identifies :fibo-fnd-acc-4217/Loti,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "LSL",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Loti"}})

(def LYD
  "the currency identifier for Libyan Dinar"
  {:db/ident :fibo-fnd-acc-4217/LYD,
   :lcc-lr/denotes :fibo-fnd-acc-4217/LibyanDinar,
   :lcc-lr/hasTag "LYD",
   :lcc-lr/identifies :fibo-fnd-acc-4217/LibyanDinar,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "LYD",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Libyan Dinar"}})

(def LaoKip
  "the currency Lao Kip"
  {:db/ident :fibo-fnd-acc-4217/LaoKip,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "418",
   :lcc-cr/isUsedBy :lcc-3166-1/LaoPeoplesDemocraticRepublic,
   :lcc-lr/hasName "Lao Kip",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Lao Kip",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Lao Kip"}})

(def Lari
  "the currency Lari"
  {:db/ident :fibo-fnd-acc-4217/Lari,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "981",
   :lcc-cr/isUsedBy :lcc-3166-1/Georgia,
   :lcc-lr/hasName "Lari",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Lari",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Lari"}})

(def LebanesePound
  "the currency Lebanese Pound"
  {:db/ident :fibo-fnd-acc-4217/LebanesePound,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "422",
   :lcc-cr/isUsedBy :lcc-3166-1/Lebanon,
   :lcc-lr/hasName "Lebanese Pound",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Lebanese Pound",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Lebanese Pound"}})

(def Lek
  "the currency Lek"
  {:db/ident :fibo-fnd-acc-4217/Lek,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "008",
   :lcc-cr/isUsedBy :lcc-3166-1/Albania,
   :lcc-lr/hasName "Lek",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Lek",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Lek"}})

(def Lempira
  "the currency Lempira"
  {:db/ident :fibo-fnd-acc-4217/Lempira,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "340",
   :lcc-cr/isUsedBy :lcc-3166-1/Honduras,
   :lcc-lr/hasName "Lempira",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Lempira",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Lempira"}})

(def Leone
  "the currency Leone"
  {:db/ident :fibo-fnd-acc-4217/Leone,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "694",
   :lcc-cr/isUsedBy :lcc-3166-1/SierraLeone,
   :lcc-lr/hasName "Leone",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Leone",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Leone"}})

(def LiberianDollar
  "the currency Liberian Dollar"
  {:db/ident :fibo-fnd-acc-4217/LiberianDollar,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "430",
   :lcc-cr/isUsedBy :lcc-3166-1/Liberia,
   :lcc-lr/hasName "Liberian Dollar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Liberian Dollar",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Liberian Dollar"}})

(def LibyanDinar
  "the currency Libyan Dinar"
  {:db/ident :fibo-fnd-acc-4217/LibyanDinar,
   :fibo-fnd-acc-cur/hasMinorUnit "3",
   :fibo-fnd-acc-cur/hasNumericCode "434",
   :lcc-cr/isUsedBy :lcc-3166-1/Libya,
   :lcc-lr/hasName "Libyan Dinar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Libyan Dinar",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Libyan Dinar"}})

(def Lilangeni
  "the currency Lilangeni"
  {:db/ident :fibo-fnd-acc-4217/Lilangeni,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "748",
   :lcc-cr/isUsedBy :lcc-3166-1/Eswatini,
   :lcc-lr/hasName "Lilangeni",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Lilangeni",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Lilangeni"}})

(def Loti
  "the currency Loti"
  {:db/ident :fibo-fnd-acc-4217/Loti,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "426",
   :lcc-cr/isUsedBy :lcc-3166-1/Lesotho,
   :lcc-lr/hasName "Loti",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Loti",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Loti"}})

(def MAD
  "the currency identifier for Moroccan Dirham"
  {:db/ident :fibo-fnd-acc-4217/MAD,
   :lcc-lr/denotes :fibo-fnd-acc-4217/MoroccanDirham,
   :lcc-lr/hasTag "MAD",
   :lcc-lr/identifies :fibo-fnd-acc-4217/MoroccanDirham,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "MAD",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the currency identifier for Moroccan Dirham"}})

(def MDL
  "the currency identifier for Moldovan Leu"
  {:db/ident :fibo-fnd-acc-4217/MDL,
   :lcc-lr/denotes :fibo-fnd-acc-4217/MoldovanLeu,
   :lcc-lr/hasTag "MDL",
   :lcc-lr/identifies :fibo-fnd-acc-4217/MoldovanLeu,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "MDL",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Moldovan Leu"}})

(def MGA
  "the currency identifier for Malagasy Ariary"
  {:db/ident :fibo-fnd-acc-4217/MGA,
   :lcc-lr/denotes :fibo-fnd-acc-4217/MalagasyAriary,
   :lcc-lr/hasTag "MGA",
   :lcc-lr/identifies :fibo-fnd-acc-4217/MalagasyAriary,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "MGA",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the currency identifier for Malagasy Ariary"}})

(def MKD
  "the currency identifier for Denar"
  {:db/ident :fibo-fnd-acc-4217/MKD,
   :lcc-lr/denotes :fibo-fnd-acc-4217/Denar,
   :lcc-lr/hasTag "MKD",
   :lcc-lr/identifies :fibo-fnd-acc-4217/Denar,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "MKD",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Denar"}})

(def MMK
  "the currency identifier for Kyat"
  {:db/ident :fibo-fnd-acc-4217/MMK,
   :lcc-lr/denotes :fibo-fnd-acc-4217/Kyat,
   :lcc-lr/hasTag "MMK",
   :lcc-lr/identifies :fibo-fnd-acc-4217/Kyat,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "MMK",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Kyat"}})

(def MNT
  "the currency identifier for Tugrik"
  {:db/ident :fibo-fnd-acc-4217/MNT,
   :lcc-lr/denotes :fibo-fnd-acc-4217/Tugrik,
   :lcc-lr/hasTag "MNT",
   :lcc-lr/identifies :fibo-fnd-acc-4217/Tugrik,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "MNT",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Tugrik"}})

(def MOP
  "the currency identifier for Pataca"
  {:db/ident :fibo-fnd-acc-4217/MOP,
   :lcc-lr/denotes :fibo-fnd-acc-4217/Pataca,
   :lcc-lr/hasTag "MOP",
   :lcc-lr/identifies :fibo-fnd-acc-4217/Pataca,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "MOP",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Pataca"}})

(def MRU
  "the currency identifier for Ouguiya"
  {:db/ident :fibo-fnd-acc-4217/MRU,
   :lcc-lr/denotes :fibo-fnd-acc-4217/Ouguiya,
   :lcc-lr/hasTag "MRU",
   :lcc-lr/identifies :fibo-fnd-acc-4217/Ouguiya,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "MRU",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Ouguiya"}})

(def MUR
  "the currency identifier for Mauritius Rupee"
  {:db/ident :fibo-fnd-acc-4217/MUR,
   :lcc-lr/denotes :fibo-fnd-acc-4217/MauritiusRupee,
   :lcc-lr/hasTag "MUR",
   :lcc-lr/identifies :fibo-fnd-acc-4217/MauritiusRupee,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "MUR",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the currency identifier for Mauritius Rupee"}})

(def MVR
  "the currency identifier for Rufiyaa"
  {:db/ident :fibo-fnd-acc-4217/MVR,
   :lcc-lr/denotes :fibo-fnd-acc-4217/Rufiyaa,
   :lcc-lr/hasTag "MVR",
   :lcc-lr/identifies :fibo-fnd-acc-4217/Rufiyaa,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "MVR",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Rufiyaa"}})

(def MWK
  "the currency identifier for Malawi Kwacha"
  {:db/ident :fibo-fnd-acc-4217/MWK,
   :lcc-lr/denotes :fibo-fnd-acc-4217/MalawiKwacha,
   :lcc-lr/hasTag "MWK",
   :lcc-lr/identifies :fibo-fnd-acc-4217/MalawiKwacha,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "MWK",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the currency identifier for Malawi Kwacha"}})

(def MXN
  "the currency identifier for Mexican Peso"
  {:db/ident :fibo-fnd-acc-4217/MXN,
   :lcc-lr/denotes :fibo-fnd-acc-4217/MexicanPeso,
   :lcc-lr/hasTag "MXN",
   :lcc-lr/identifies :fibo-fnd-acc-4217/MexicanPeso,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "MXN",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Mexican Peso"}})

(def MXV
  "the funds identifier for Mexican Unidad de Inversion (UDI)"
  {:db/ident :fibo-fnd-acc-4217/MXV,
   :lcc-lr/denotes :fibo-fnd-acc-4217/MexicanUnidaddeInversion_UDI,
   :lcc-lr/hasTag "MXV",
   :lcc-lr/identifies :fibo-fnd-acc-4217/MexicanUnidaddeInversion_UDI,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/FundsIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "MXV",
   :skos/definition
   {:rdf/language "en",
    :rdf/value "the funds identifier for Mexican Unidad de Inversion (UDI)"}})

(def MYR
  "the currency identifier for Malaysian Ringgit"
  {:db/ident :fibo-fnd-acc-4217/MYR,
   :lcc-lr/denotes :fibo-fnd-acc-4217/MalaysianRinggit,
   :lcc-lr/hasTag "MYR",
   :lcc-lr/identifies :fibo-fnd-acc-4217/MalaysianRinggit,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "MYR",
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "the currency identifier for Malaysian Ringgit"}})

(def MZN
  "the currency identifier for Mozambique Metical"
  {:db/ident :fibo-fnd-acc-4217/MZN,
   :lcc-lr/denotes :fibo-fnd-acc-4217/MozambiqueMetical,
   :lcc-lr/hasTag "MZN",
   :lcc-lr/identifies :fibo-fnd-acc-4217/MozambiqueMetical,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "MZN",
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "the currency identifier for Mozambique Metical"}})

(def MalagasyAriary
  "the currency Malagasy Ariary"
  {:db/ident :fibo-fnd-acc-4217/MalagasyAriary,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "969",
   :lcc-cr/isUsedBy :lcc-3166-1/Madagascar,
   :lcc-lr/hasName "Malagasy Ariary",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Malagasy Ariary",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Malagasy Ariary"}})

(def MalawiKwacha
  "the currency Malawi Kwacha"
  {:db/ident :fibo-fnd-acc-4217/MalawiKwacha,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "454",
   :lcc-cr/isUsedBy :lcc-3166-1/Malawi,
   :lcc-lr/hasName "Malawi Kwacha",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Malawi Kwacha",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Malawi Kwacha"}})

(def MalaysianRinggit
  "the currency Malaysian Ringgit"
  {:db/ident :fibo-fnd-acc-4217/MalaysianRinggit,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "458",
   :lcc-cr/isUsedBy :lcc-3166-1/Malaysia,
   :lcc-lr/hasName "Malaysian Ringgit",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Malaysian Ringgit",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Malaysian Ringgit"}})

(def MauritiusRupee
  "the currency Mauritius Rupee"
  {:db/ident :fibo-fnd-acc-4217/MauritiusRupee,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "480",
   :lcc-cr/isUsedBy :lcc-3166-1/Mauritius,
   :lcc-lr/hasName "Mauritius Rupee",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Mauritius Rupee",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Mauritius Rupee"}})

(def MexicanPeso
  "the currency Mexican Peso"
  {:db/ident :fibo-fnd-acc-4217/MexicanPeso,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "484",
   :lcc-cr/isUsedBy :lcc-3166-1/Mexico,
   :lcc-lr/hasName "Mexican Peso",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Mexican Peso",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Mexican Peso"}})

(def MexicanUnidaddeInversion_UDI
  "the funds Mexican Unidad de Inversion (UDI)"
  {:db/ident :fibo-fnd-acc-4217/MexicanUnidaddeInversion_UDI,
   :fibo-fnd-acc-cur/hasCurrency :fibo-fnd-acc-4217/MexicanPeso,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "979",
   :fibo-fnd-utl-av/explanatoryNote
   "The UDI is an inflation adjusted mechanism set by the Central Bank of Mexico according to the variation in the Mexican Consumer Price Index. The value of the UDI is expressed in terms of Mexican Pesos per UDI. It is used to denominate mortgage loans, some bank deposits with maturities of 3 month or more and Government bonds (UDIBONOS).",
   :lcc-cr/isUsedBy :lcc-3166-1/Mexico,
   :lcc-lr/hasName "Mexican Unidad de Inversion (UDI)",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-acc-cur/Funds],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Mexican Unidad de Inversion (UDI)",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the funds Mexican Unidad de Inversion (UDI)"}})

(def MoldovanLeu
  "the currency Moldovan Leu"
  {:db/ident :fibo-fnd-acc-4217/MoldovanLeu,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "498",
   :lcc-cr/isUsedBy :lcc-3166-1/Moldova,
   :lcc-lr/hasName "Moldovan Leu",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Moldovan Leu",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Moldovan Leu"}})

(def MoroccanDirham
  "the currency Moroccan Dirham"
  {:db/ident :fibo-fnd-acc-4217/MoroccanDirham,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "504",
   :lcc-cr/isUsedBy [:lcc-3166-1/Morocco :lcc-3166-1/WesternSahara],
   :lcc-lr/hasName "Moroccan Dirham",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-acc-cur/Currency],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Moroccan Dirham",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Moroccan Dirham"}})

(def MozambiqueMetical
  "the currency Mozambique Metical"
  {:db/ident :fibo-fnd-acc-4217/MozambiqueMetical,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "943",
   :lcc-cr/isUsedBy :lcc-3166-1/Mozambique,
   :lcc-lr/hasName "Mozambique Metical",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Mozambique Metical",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Mozambique Metical"}})

(def Mvdol
  "the funds Mvdol"
  {:db/ident :fibo-fnd-acc-4217/Mvdol,
   :fibo-fnd-acc-cur/hasCurrency :fibo-fnd-acc-4217/Boliviano,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "984",
   :fibo-fnd-utl-av/explanatoryNote
   "For indexation purposes and denomination of certain financial instruments (e.g. treasury bills). The Mvdol is set daily by the Central Bank of Bolivia based on the official USD/BOB rate.",
   :lcc-cr/isUsedBy :lcc-3166-1/Bolivia,
   :lcc-lr/hasName "Mvdol",
   :rdf/type [:fibo-fnd-acc-cur/Funds :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Mvdol",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the funds Mvdol"}})

(def NAD
  "the currency identifier for Namibia Dollar"
  {:db/ident :fibo-fnd-acc-4217/NAD,
   :lcc-lr/denotes :fibo-fnd-acc-4217/NamibiaDollar,
   :lcc-lr/hasTag "NAD",
   :lcc-lr/identifies :fibo-fnd-acc-4217/NamibiaDollar,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "NAD",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the currency identifier for Namibia Dollar"}})

(def NGN
  "the currency identifier for Naira"
  {:db/ident :fibo-fnd-acc-4217/NGN,
   :lcc-lr/denotes :fibo-fnd-acc-4217/Naira,
   :lcc-lr/hasTag "NGN",
   :lcc-lr/identifies :fibo-fnd-acc-4217/Naira,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "NGN",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Naira"}})

(def NIO
  "the currency identifier for Cordoba Oro"
  {:db/ident :fibo-fnd-acc-4217/NIO,
   :lcc-lr/denotes :fibo-fnd-acc-4217/CordobaOro,
   :lcc-lr/hasTag "NIO",
   :lcc-lr/identifies :fibo-fnd-acc-4217/CordobaOro,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "NIO",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Cordoba Oro"}})

(def NOK
  "the currency identifier for Norwegian Krone"
  {:db/ident :fibo-fnd-acc-4217/NOK,
   :lcc-lr/denotes :fibo-fnd-acc-4217/NorwegianKrone,
   :lcc-lr/hasTag "NOK",
   :lcc-lr/identifies :fibo-fnd-acc-4217/NorwegianKrone,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "NOK",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the currency identifier for Norwegian Krone"}})

(def NPR
  "the currency identifier for Nepalese Rupee"
  {:db/ident :fibo-fnd-acc-4217/NPR,
   :lcc-lr/denotes :fibo-fnd-acc-4217/NepaleseRupee,
   :lcc-lr/hasTag "NPR",
   :lcc-lr/identifies :fibo-fnd-acc-4217/NepaleseRupee,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "NPR",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the currency identifier for Nepalese Rupee"}})

(def NZD
  "the currency identifier for New Zealand Dollar"
  {:db/ident :fibo-fnd-acc-4217/NZD,
   :lcc-lr/denotes :fibo-fnd-acc-4217/NewZealandDollar,
   :lcc-lr/hasTag "NZD",
   :lcc-lr/identifies :fibo-fnd-acc-4217/NewZealandDollar,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "NZD",
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "the currency identifier for New Zealand Dollar"}})

(def Naira
  "the currency Naira"
  {:db/ident :fibo-fnd-acc-4217/Naira,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "566",
   :lcc-cr/isUsedBy :lcc-3166-1/Nigeria,
   :lcc-lr/hasName "Naira",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Naira",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Naira"}})

(def Nakfa
  "the currency Nakfa"
  {:db/ident :fibo-fnd-acc-4217/Nakfa,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "232",
   :lcc-cr/isUsedBy :lcc-3166-1/Eritrea,
   :lcc-lr/hasName "Nakfa",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Nakfa",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Nakfa"}})

(def NamibiaDollar
  "the currency Namibia Dollar"
  {:db/ident :fibo-fnd-acc-4217/NamibiaDollar,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "516",
   :lcc-cr/isUsedBy :lcc-3166-1/Namibia,
   :lcc-lr/hasName "Namibia Dollar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Namibia Dollar",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Namibia Dollar"}})

(def NepaleseRupee
  "the currency Nepalese Rupee"
  {:db/ident :fibo-fnd-acc-4217/NepaleseRupee,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "524",
   :lcc-cr/isUsedBy :lcc-3166-1/Nepal,
   :lcc-lr/hasName "Nepalese Rupee",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Nepalese Rupee",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Nepalese Rupee"}})

(def NetherlandsAntilleanGuilder
  "the currency Netherlands Antillean Guilder"
  {:db/ident :fibo-fnd-acc-4217/NetherlandsAntilleanGuilder,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "532",
   :lcc-cr/isUsedBy [:lcc-3166-1/Curacao :lcc-3166-1/SintMaarten],
   :lcc-lr/hasName "Netherlands Antillean Guilder",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Netherlands Antillean Guilder",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the currency Netherlands Antillean Guilder"}})

(def NewIsraeliSheqel
  "the currency New Israeli Sheqel"
  {:db/ident :fibo-fnd-acc-4217/NewIsraeliSheqel,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "376",
   :lcc-cr/isUsedBy :lcc-3166-1/Israel,
   :lcc-lr/hasName "New Israeli Sheqel",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "New Israeli Sheqel",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency New Israeli Sheqel"}})

(def NewTaiwanDollar
  "the currency New Taiwan Dollar"
  {:db/ident :fibo-fnd-acc-4217/NewTaiwanDollar,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "901",
   :lcc-cr/isUsedBy :lcc-3166-1/Taiwan,
   :lcc-lr/hasName "New Taiwan Dollar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "New Taiwan Dollar",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency New Taiwan Dollar"}})

(def NewZealandDollar
  "the currency New Zealand Dollar"
  {:db/ident :fibo-fnd-acc-4217/NewZealandDollar,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "554",
   :lcc-cr/isUsedBy [:lcc-3166-1/CookIslands
                     :lcc-3166-1/Pitcairn
                     :lcc-3166-1/Tokelau
                     :lcc-3166-1/Niue
                     :lcc-3166-1/NewZealand],
   :lcc-lr/hasName "New Zealand Dollar",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-acc-cur/Currency],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "New Zealand Dollar",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency New Zealand Dollar"}})

(def Ngultrum
  "the currency Ngultrum"
  {:db/ident :fibo-fnd-acc-4217/Ngultrum,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "064",
   :lcc-cr/isUsedBy :lcc-3166-1/Bhutan,
   :lcc-lr/hasName "Ngultrum",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Ngultrum",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Ngultrum"}})

(def NorthKoreanWon
  "the currency North Korean Won"
  {:db/ident :fibo-fnd-acc-4217/NorthKoreanWon,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "408",
   :lcc-cr/isUsedBy :lcc-3166-1/KoreaDemocraticPeoplesRepublicOf,
   :lcc-lr/hasName "North Korean Won",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "North Korean Won",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency North Korean Won"}})

(def NorwegianKrone
  "the currency Norwegian Krone"
  {:db/ident :fibo-fnd-acc-4217/NorwegianKrone,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "578",
   :lcc-cr/isUsedBy [:lcc-3166-1/SvalbardAndJanMayen
                     :lcc-3166-1/BouvetIsland
                     :lcc-3166-1/Norway],
   :lcc-lr/hasName "Norwegian Krone",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Norwegian Krone",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Norwegian Krone"}})

(def OMR
  "the currency identifier for Rial Omani"
  {:db/ident :fibo-fnd-acc-4217/OMR,
   :lcc-lr/denotes :fibo-fnd-acc-4217/RialOmani,
   :lcc-lr/hasTag "OMR",
   :lcc-lr/identifies :fibo-fnd-acc-4217/RialOmani,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "OMR",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Rial Omani"}})

(def Ouguiya
  "the currency Ouguiya"
  {:db/ident :fibo-fnd-acc-4217/Ouguiya,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "929",
   :lcc-cr/isUsedBy :lcc-3166-1/Mauritania,
   :lcc-lr/hasName "Ouguiya",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Ouguiya",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Ouguiya"}})

(def PAB
  "the currency identifier for Balboa"
  {:db/ident :fibo-fnd-acc-4217/PAB,
   :lcc-lr/denotes :fibo-fnd-acc-4217/Balboa,
   :lcc-lr/hasTag "PAB",
   :lcc-lr/identifies :fibo-fnd-acc-4217/Balboa,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "PAB",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Balboa"}})

(def PEN
  "the currency identifier for Sol"
  {:db/ident :fibo-fnd-acc-4217/PEN,
   :lcc-lr/denotes :fibo-fnd-acc-4217/Sol,
   :lcc-lr/hasTag "PEN",
   :lcc-lr/identifies :fibo-fnd-acc-4217/Sol,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "PEN",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Sol"}})

(def PGK
  "the currency identifier for Kina"
  {:db/ident :fibo-fnd-acc-4217/PGK,
   :lcc-lr/denotes :fibo-fnd-acc-4217/Kina,
   :lcc-lr/hasTag "PGK",
   :lcc-lr/identifies :fibo-fnd-acc-4217/Kina,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "PGK",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Kina"}})

(def PHP
  "the currency identifier for Philippine Peso"
  {:db/ident :fibo-fnd-acc-4217/PHP,
   :lcc-lr/denotes :fibo-fnd-acc-4217/PhilippinePeso,
   :lcc-lr/hasTag "PHP",
   :lcc-lr/identifies :fibo-fnd-acc-4217/PhilippinePeso,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "PHP",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the currency identifier for Philippine Peso"}})

(def PKR
  "the currency identifier for Pakistan Rupee"
  {:db/ident :fibo-fnd-acc-4217/PKR,
   :lcc-lr/denotes :fibo-fnd-acc-4217/PakistanRupee,
   :lcc-lr/hasTag "PKR",
   :lcc-lr/identifies :fibo-fnd-acc-4217/PakistanRupee,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "PKR",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the currency identifier for Pakistan Rupee"}})

(def PLN
  "the currency identifier for Zloty"
  {:db/ident :fibo-fnd-acc-4217/PLN,
   :lcc-lr/denotes :fibo-fnd-acc-4217/Zloty,
   :lcc-lr/hasTag "PLN",
   :lcc-lr/identifies :fibo-fnd-acc-4217/Zloty,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "PLN",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Zloty"}})

(def PYG
  "the currency identifier for Guarani"
  {:db/ident :fibo-fnd-acc-4217/PYG,
   :lcc-lr/denotes :fibo-fnd-acc-4217/Guarani,
   :lcc-lr/hasTag "PYG",
   :lcc-lr/identifies :fibo-fnd-acc-4217/Guarani,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "PYG",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Guarani"}})

(def Paanga
  "the currency Paʻanga"
  {:db/ident :fibo-fnd-acc-4217/Paanga,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "776",
   :lcc-cr/isUsedBy :lcc-3166-1/Tonga,
   :lcc-lr/hasName "Paʻanga",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Paʻanga",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Paʻanga"}})

(def PakistanRupee
  "the currency Pakistan Rupee"
  {:db/ident :fibo-fnd-acc-4217/PakistanRupee,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "586",
   :lcc-cr/isUsedBy :lcc-3166-1/Pakistan,
   :lcc-lr/hasName "Pakistan Rupee",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Pakistan Rupee",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Pakistan Rupee"}})

(def Palladium
  "the currency whose unit is one troy ounce of the precious metal Palladium"
  {:db/ident :fibo-fnd-acc-4217/Palladium,
   :fibo-fnd-acc-cur/hasNumericCode "964",
   :lcc-lr/hasName "Palladium",
   :rdf/type [:fibo-fnd-acc-cur/PreciousMetal :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Palladium",
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "the currency whose unit is one troy ounce of the precious metal Palladium"}})

(def Pataca
  "the currency Pataca"
  {:db/ident :fibo-fnd-acc-4217/Pataca,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "446",
   :lcc-cr/isUsedBy :lcc-3166-1/Macao,
   :lcc-lr/hasName "Pataca",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Pataca",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Pataca"}})

(def PesoConvertible
  "the currency Peso Convertible"
  {:db/ident :fibo-fnd-acc-4217/PesoConvertible,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "931",
   :lcc-cr/isUsedBy :lcc-3166-1/Cuba,
   :lcc-lr/hasName "Peso Convertible",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Peso Convertible",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Peso Convertible"}})

(def PesoUruguayo
  "the currency Peso Uruguayo"
  {:db/ident :fibo-fnd-acc-4217/PesoUruguayo,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "858",
   :lcc-cr/isUsedBy :lcc-3166-1/Uruguay,
   :lcc-lr/hasName "Peso Uruguayo",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Peso Uruguayo",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Peso Uruguayo"}})

(def PhilippinePeso
  "the currency Philippine Peso"
  {:db/ident :fibo-fnd-acc-4217/PhilippinePeso,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "608",
   :lcc-cr/isUsedBy :lcc-3166-1/Philippines,
   :lcc-lr/hasName "Philippine Peso",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Philippine Peso",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Philippine Peso"}})

(def Platinum
  "the currency whose unit is one troy ounce of the precious metal Platinum"
  {:db/ident :fibo-fnd-acc-4217/Platinum,
   :fibo-fnd-acc-cur/hasNumericCode "962",
   :lcc-lr/hasName "Platinum",
   :rdf/type [:fibo-fnd-acc-cur/PreciousMetal :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Platinum",
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "the currency whose unit is one troy ounce of the precious metal Platinum"}})

(def PoundSterling
  "the currency Pound Sterling"
  {:db/ident :fibo-fnd-acc-4217/PoundSterling,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "826",
   :lcc-cr/isUsedBy [:lcc-3166-1/Guernsey
                     :lcc-3166-1/UnitedKingdomOfGreatBritainAndNorthernIreland
                     :lcc-3166-1/IsleOfMan
                     :lcc-3166-1/Jersey],
   :lcc-lr/hasName "Pound Sterling",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-acc-cur/Currency],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Pound Sterling",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Pound Sterling"}})

(def Pula
  "the currency Pula"
  {:db/ident :fibo-fnd-acc-4217/Pula,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "072",
   :lcc-cr/isUsedBy :lcc-3166-1/Botswana,
   :lcc-lr/hasName "Pula",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Pula",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Pula"}})

(def QAR
  "the currency identifier for Qatari Rial"
  {:db/ident :fibo-fnd-acc-4217/QAR,
   :lcc-lr/denotes :fibo-fnd-acc-4217/QatariRial,
   :lcc-lr/hasTag "QAR",
   :lcc-lr/identifies :fibo-fnd-acc-4217/QatariRial,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "QAR",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Qatari Rial"}})

(def QatariRial
  "the currency Qatari Rial"
  {:db/ident :fibo-fnd-acc-4217/QatariRial,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "634",
   :lcc-cr/isUsedBy :lcc-3166-1/Qatar,
   :lcc-lr/hasName "Qatari Rial",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Qatari Rial",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Qatari Rial"}})

(def Quetzal
  "the currency Quetzal"
  {:db/ident :fibo-fnd-acc-4217/Quetzal,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "320",
   :lcc-cr/isUsedBy :lcc-3166-1/Guatemala,
   :lcc-lr/hasName "Quetzal",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Quetzal",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Quetzal"}})

(def RON
  "the currency identifier for Romanian Leu"
  {:db/ident :fibo-fnd-acc-4217/RON,
   :lcc-lr/denotes :fibo-fnd-acc-4217/RomanianLeu,
   :lcc-lr/hasTag "RON",
   :lcc-lr/identifies :fibo-fnd-acc-4217/RomanianLeu,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "RON",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Romanian Leu"}})

(def RSD
  "the currency identifier for Serbian Dinar"
  {:db/ident :fibo-fnd-acc-4217/RSD,
   :lcc-lr/denotes :fibo-fnd-acc-4217/SerbianDinar,
   :lcc-lr/hasTag "RSD",
   :lcc-lr/identifies :fibo-fnd-acc-4217/SerbianDinar,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "RSD",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the currency identifier for Serbian Dinar"}})

(def RUB
  "the currency identifier for Russian Ruble"
  {:db/ident :fibo-fnd-acc-4217/RUB,
   :lcc-lr/denotes :fibo-fnd-acc-4217/RussianRuble,
   :lcc-lr/hasTag "RUB",
   :lcc-lr/identifies :fibo-fnd-acc-4217/RussianRuble,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "RUB",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the currency identifier for Russian Ruble"}})

(def RWF
  "the currency identifier for Rwanda Franc"
  {:db/ident :fibo-fnd-acc-4217/RWF,
   :lcc-lr/denotes :fibo-fnd-acc-4217/RwandaFranc,
   :lcc-lr/hasTag "RWF",
   :lcc-lr/identifies :fibo-fnd-acc-4217/RwandaFranc,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "RWF",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Rwanda Franc"}})

(def Rand
  "the currency Rand"
  {:db/ident :fibo-fnd-acc-4217/Rand,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "710",
   :lcc-cr/isUsedBy
   [:lcc-3166-1/Lesotho :lcc-3166-1/Namibia :lcc-3166-1/SouthAfrica],
   :lcc-lr/hasName "Rand",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-acc-cur/Currency],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Rand",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Rand"}})

(def RialOmani
  "the currency Rial Omani"
  {:db/ident :fibo-fnd-acc-4217/RialOmani,
   :fibo-fnd-acc-cur/hasMinorUnit "3",
   :fibo-fnd-acc-cur/hasNumericCode "512",
   :lcc-cr/isUsedBy :lcc-3166-1/Oman,
   :lcc-lr/hasName "Rial Omani",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Rial Omani",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Rial Omani"}})

(def Riel
  "the currency Riel"
  {:db/ident :fibo-fnd-acc-4217/Riel,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "116",
   :lcc-cr/isUsedBy :lcc-3166-1/Cambodia,
   :lcc-lr/hasName "Riel",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Riel",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Riel"}})

(def RomanianLeu
  "the currency Romanian Leu"
  {:db/ident :fibo-fnd-acc-4217/RomanianLeu,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "946",
   :lcc-cr/isUsedBy :lcc-3166-1/Romania,
   :lcc-lr/hasName "Romanian Leu",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Romanian Leu",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Romanian Leu"}})

(def Rufiyaa
  "the currency Rufiyaa"
  {:db/ident :fibo-fnd-acc-4217/Rufiyaa,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "462",
   :lcc-cr/isUsedBy :lcc-3166-1/Maldives,
   :lcc-lr/hasName "Rufiyaa",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Rufiyaa",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Rufiyaa"}})

(def Rupiah
  "the currency Rupiah"
  {:db/ident :fibo-fnd-acc-4217/Rupiah,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "360",
   :lcc-cr/isUsedBy :lcc-3166-1/Indonesia,
   :lcc-lr/hasName "Rupiah",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Rupiah",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Rupiah"}})

(def RussianRuble
  "the currency Russian Ruble"
  {:db/ident :fibo-fnd-acc-4217/RussianRuble,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "643",
   :lcc-cr/isUsedBy :lcc-3166-1/RussianFederation,
   :lcc-lr/hasName "Russian Ruble",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Russian Ruble",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Russian Ruble"}})

(def RwandaFranc
  "the currency Rwanda Franc"
  {:db/ident :fibo-fnd-acc-4217/RwandaFranc,
   :fibo-fnd-acc-cur/hasMinorUnit "0",
   :fibo-fnd-acc-cur/hasNumericCode "646",
   :lcc-cr/isUsedBy :lcc-3166-1/Rwanda,
   :lcc-lr/hasName "Rwanda Franc",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Rwanda Franc",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Rwanda Franc"}})

(def SAR
  "the currency identifier for Saudi Riyal"
  {:db/ident :fibo-fnd-acc-4217/SAR,
   :lcc-lr/denotes :fibo-fnd-acc-4217/SaudiRiyal,
   :lcc-lr/hasTag "SAR",
   :lcc-lr/identifies :fibo-fnd-acc-4217/SaudiRiyal,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "SAR",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Saudi Riyal"}})

(def SBD
  "the currency identifier for Solomon Islands Dollar"
  {:db/ident :fibo-fnd-acc-4217/SBD,
   :lcc-lr/denotes :fibo-fnd-acc-4217/SolomonIslandsDollar,
   :lcc-lr/hasTag "SBD",
   :lcc-lr/identifies :fibo-fnd-acc-4217/SolomonIslandsDollar,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "SBD",
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "the currency identifier for Solomon Islands Dollar"}})

(def SCR
  "the currency identifier for Seychelles Rupee"
  {:db/ident :fibo-fnd-acc-4217/SCR,
   :lcc-lr/denotes :fibo-fnd-acc-4217/SeychellesRupee,
   :lcc-lr/hasTag "SCR",
   :lcc-lr/identifies :fibo-fnd-acc-4217/SeychellesRupee,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "SCR",
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "the currency identifier for Seychelles Rupee"}})

(def SDG
  "the currency identifier for Sudanese Pound"
  {:db/ident :fibo-fnd-acc-4217/SDG,
   :lcc-lr/denotes :fibo-fnd-acc-4217/SudanesePound,
   :lcc-lr/hasTag "SDG",
   :lcc-lr/identifies :fibo-fnd-acc-4217/SudanesePound,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "SDG",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the currency identifier for Sudanese Pound"}})

(def SDR_SpecialDrawingRight
  "the IMF's SDR (Special Drawing Right)"
  {:db/ident :fibo-fnd-acc-4217/SDR_SpecialDrawingRight,
   :fibo-fnd-acc-cur/hasNumericCode "960",
   :lcc-lr/hasName "SDR (Special Drawing Right)",
   :rdf/type [:fibo-fnd-acc-cur/UnitOfAccount :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "SDR (Special Drawing Right)",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the IMF's SDR (Special Drawing Right)"}})

(def SEK
  "the currency identifier for Swedish Krona"
  {:db/ident :fibo-fnd-acc-4217/SEK,
   :lcc-lr/denotes :fibo-fnd-acc-4217/SwedishKrona,
   :lcc-lr/hasTag "SEK",
   :lcc-lr/identifies :fibo-fnd-acc-4217/SwedishKrona,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "SEK",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the currency identifier for Swedish Krona"}})

(def SGD
  "the currency identifier for Singapore Dollar"
  {:db/ident :fibo-fnd-acc-4217/SGD,
   :lcc-lr/denotes :fibo-fnd-acc-4217/SingaporeDollar,
   :lcc-lr/hasTag "SGD",
   :lcc-lr/identifies :fibo-fnd-acc-4217/SingaporeDollar,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "SGD",
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "the currency identifier for Singapore Dollar"}})

(def SHP
  "the currency identifier for Saint Helena Pound"
  {:db/ident :fibo-fnd-acc-4217/SHP,
   :lcc-lr/denotes :fibo-fnd-acc-4217/SaintHelenaPound,
   :lcc-lr/hasTag "SHP",
   :lcc-lr/identifies :fibo-fnd-acc-4217/SaintHelenaPound,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "SHP",
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "the currency identifier for Saint Helena Pound"}})

(def SLL
  "the currency identifier for Leone"
  {:db/ident :fibo-fnd-acc-4217/SLL,
   :lcc-lr/denotes :fibo-fnd-acc-4217/Leone,
   :lcc-lr/hasTag "SLL",
   :lcc-lr/identifies :fibo-fnd-acc-4217/Leone,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "SLL",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Leone"}})

(def SOS
  "the currency identifier for Somali Shilling"
  {:db/ident :fibo-fnd-acc-4217/SOS,
   :lcc-lr/denotes :fibo-fnd-acc-4217/SomaliShilling,
   :lcc-lr/hasTag "SOS",
   :lcc-lr/identifies :fibo-fnd-acc-4217/SomaliShilling,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "SOS",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the currency identifier for Somali Shilling"}})

(def SRD
  "the currency identifier for Surinam Dollar"
  {:db/ident :fibo-fnd-acc-4217/SRD,
   :lcc-lr/denotes :fibo-fnd-acc-4217/SurinamDollar,
   :lcc-lr/hasTag "SRD",
   :lcc-lr/identifies :fibo-fnd-acc-4217/SurinamDollar,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "SRD",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the currency identifier for Surinam Dollar"}})

(def SSP
  "the currency identifier for South Sudanese Pound"
  {:db/ident :fibo-fnd-acc-4217/SSP,
   :lcc-lr/denotes :fibo-fnd-acc-4217/SouthSudanesePound,
   :lcc-lr/hasTag "SSP",
   :lcc-lr/identifies :fibo-fnd-acc-4217/SouthSudanesePound,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "SSP",
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "the currency identifier for South Sudanese Pound"}})

(def STN
  "the currency identifier for Dobra"
  {:db/ident :fibo-fnd-acc-4217/STN,
   :lcc-lr/denotes :fibo-fnd-acc-4217/Dobra,
   :lcc-lr/hasTag "STN",
   :lcc-lr/identifies :fibo-fnd-acc-4217/Dobra,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "STN",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Dobra"}})

(def SVC
  "the currency identifier for El Salvador Colon"
  {:db/ident :fibo-fnd-acc-4217/SVC,
   :lcc-lr/denotes :fibo-fnd-acc-4217/ElSalvadorColon,
   :lcc-lr/hasTag "SVC",
   :lcc-lr/identifies :fibo-fnd-acc-4217/ElSalvadorColon,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "SVC",
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "the currency identifier for El Salvador Colon"}})

(def SYP
  "the currency identifier for Syrian Pound"
  {:db/ident :fibo-fnd-acc-4217/SYP,
   :lcc-lr/denotes :fibo-fnd-acc-4217/SyrianPound,
   :lcc-lr/hasTag "SYP",
   :lcc-lr/identifies :fibo-fnd-acc-4217/SyrianPound,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "SYP",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Syrian Pound"}})

(def SZL
  "the currency identifier for Lilangeni"
  {:db/ident :fibo-fnd-acc-4217/SZL,
   :lcc-lr/denotes :fibo-fnd-acc-4217/Lilangeni,
   :lcc-lr/hasTag "SZL",
   :lcc-lr/identifies :fibo-fnd-acc-4217/Lilangeni,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "SZL",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Lilangeni"}})

(def SaintHelenaPound
  "the currency Saint Helena Pound"
  {:db/ident :fibo-fnd-acc-4217/SaintHelenaPound,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "654",
   :lcc-cr/isUsedBy :lcc-3166-1/SaintHelena,
   :lcc-lr/hasName "Saint Helena Pound",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Saint Helena Pound",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Saint Helena Pound"}})

(def SaudiRiyal
  "the currency Saudi Riyal"
  {:db/ident :fibo-fnd-acc-4217/SaudiRiyal,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "682",
   :lcc-cr/isUsedBy :lcc-3166-1/SaudiArabia,
   :lcc-lr/hasName "Saudi Riyal",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Saudi Riyal",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Saudi Riyal"}})

(def SerbianDinar
  "the currency Serbian Dinar"
  {:db/ident :fibo-fnd-acc-4217/SerbianDinar,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "941",
   :lcc-cr/isUsedBy :lcc-3166-1/Serbia,
   :lcc-lr/hasName "Serbian Dinar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Serbian Dinar",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Serbian Dinar"}})

(def SeychellesRupee
  "the currency Seychelles Rupee"
  {:db/ident :fibo-fnd-acc-4217/SeychellesRupee,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "690",
   :lcc-cr/isUsedBy :lcc-3166-1/Seychelles,
   :lcc-lr/hasName "Seychelles Rupee",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Seychelles Rupee",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Seychelles Rupee"}})

(def Silver
  "the currency whose unit is one troy ounce of the precious metal Silver"
  {:db/ident :fibo-fnd-acc-4217/Silver,
   :fibo-fnd-acc-cur/hasNumericCode "961",
   :lcc-lr/hasName "Silver",
   :rdf/type [:fibo-fnd-acc-cur/PreciousMetal :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Silver",
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "the currency whose unit is one troy ounce of the precious metal Silver"}})

(def SingaporeDollar
  "the currency Singapore Dollar"
  {:db/ident :fibo-fnd-acc-4217/SingaporeDollar,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "702",
   :lcc-cr/isUsedBy :lcc-3166-1/Singapore,
   :lcc-lr/hasName "Singapore Dollar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Singapore Dollar",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Singapore Dollar"}})

(def Sol
  "the currency Sol"
  {:db/ident :fibo-fnd-acc-4217/Sol,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "604",
   :lcc-cr/isUsedBy :lcc-3166-1/Peru,
   :lcc-lr/hasName "Sol",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Sol",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Sol"}})

(def SolomonIslandsDollar
  "the currency Solomon Islands Dollar"
  {:db/ident :fibo-fnd-acc-4217/SolomonIslandsDollar,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "090",
   :lcc-cr/isUsedBy :lcc-3166-1/SolomonIslands,
   :lcc-lr/hasName "Solomon Islands Dollar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Solomon Islands Dollar",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Solomon Islands Dollar"}})

(def Som
  "the currency Som"
  {:db/ident :fibo-fnd-acc-4217/Som,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "417",
   :lcc-cr/isUsedBy :lcc-3166-1/Kyrgyzstan,
   :lcc-lr/hasName "Som",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Som",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Som"}})

(def SomaliShilling
  "the currency Somali Shilling"
  {:db/ident :fibo-fnd-acc-4217/SomaliShilling,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "706",
   :lcc-cr/isUsedBy :lcc-3166-1/Somalia,
   :lcc-lr/hasName "Somali Shilling",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Somali Shilling",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Somali Shilling"}})

(def Somoni
  "the currency Somoni"
  {:db/ident :fibo-fnd-acc-4217/Somoni,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "972",
   :lcc-cr/isUsedBy :lcc-3166-1/Tajikistan,
   :lcc-lr/hasName "Somoni",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Somoni",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Somoni"}})

(def SouthSudanesePound
  "the currency South Sudanese Pound"
  {:db/ident :fibo-fnd-acc-4217/SouthSudanesePound,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "728",
   :lcc-cr/isUsedBy :lcc-3166-1/SouthSudan,
   :lcc-lr/hasName "South Sudanese Pound",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "South Sudanese Pound",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency South Sudanese Pound"}})

(def SriLankaRupee
  "the currency Sri Lanka Rupee"
  {:db/ident :fibo-fnd-acc-4217/SriLankaRupee,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "144",
   :lcc-cr/isUsedBy :lcc-3166-1/SriLanka,
   :lcc-lr/hasName "Sri Lanka Rupee",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Sri Lanka Rupee",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Sri Lanka Rupee"}})

(def Sucre
  "the currency Sucre"
  {:db/ident :fibo-fnd-acc-4217/Sucre,
   :fibo-fnd-acc-cur/hasNumericCode "994",
   :lcc-lr/hasName "Sucre",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Sucre",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Sucre"}})

(def SudanesePound
  "the currency Sudanese Pound"
  {:db/ident :fibo-fnd-acc-4217/SudanesePound,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "938",
   :lcc-cr/isUsedBy :lcc-3166-1/Sudan,
   :lcc-lr/hasName "Sudanese Pound",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Sudanese Pound",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Sudanese Pound"}})

(def SurinamDollar
  "the currency Surinam Dollar"
  {:db/ident :fibo-fnd-acc-4217/SurinamDollar,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "968",
   :lcc-cr/isUsedBy :lcc-3166-1/Suriname,
   :lcc-lr/hasName "Surinam Dollar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Surinam Dollar",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Surinam Dollar"}})

(def SwedishKrona
  "the currency Swedish Krona"
  {:db/ident :fibo-fnd-acc-4217/SwedishKrona,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "752",
   :lcc-cr/isUsedBy :lcc-3166-1/Sweden,
   :lcc-lr/hasName "Swedish Krona",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Swedish Krona",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Swedish Krona"}})

(def SwissFranc
  "the currency Swiss Franc"
  {:db/ident :fibo-fnd-acc-4217/SwissFranc,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "756",
   :lcc-cr/isUsedBy [:lcc-3166-1/Switzerland :lcc-3166-1/Liechtenstein],
   :lcc-lr/hasName "Swiss Franc",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-acc-cur/Currency],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Swiss Franc",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Swiss Franc"}})

(def SyrianPound
  "the currency Syrian Pound"
  {:db/ident :fibo-fnd-acc-4217/SyrianPound,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "760",
   :lcc-cr/isUsedBy :lcc-3166-1/SyrianArabRepublic,
   :lcc-lr/hasName "Syrian Pound",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Syrian Pound",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Syrian Pound"}})

(def THB
  "the currency identifier for Baht"
  {:db/ident :fibo-fnd-acc-4217/THB,
   :lcc-lr/denotes :fibo-fnd-acc-4217/Baht,
   :lcc-lr/hasTag "THB",
   :lcc-lr/identifies :fibo-fnd-acc-4217/Baht,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "THB",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Baht"}})

(def TJS
  "the currency identifier for Somoni"
  {:db/ident :fibo-fnd-acc-4217/TJS,
   :lcc-lr/denotes :fibo-fnd-acc-4217/Somoni,
   :lcc-lr/hasTag "TJS",
   :lcc-lr/identifies :fibo-fnd-acc-4217/Somoni,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "TJS",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Somoni"}})

(def TMT
  "the currency identifier for Turkmenistan New Manat"
  {:db/ident :fibo-fnd-acc-4217/TMT,
   :lcc-lr/denotes :fibo-fnd-acc-4217/TurkmenistanNewManat,
   :lcc-lr/hasTag "TMT",
   :lcc-lr/identifies :fibo-fnd-acc-4217/TurkmenistanNewManat,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "TMT",
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "the currency identifier for Turkmenistan New Manat"}})

(def TND
  "the currency identifier for Tunisian Dinar"
  {:db/ident :fibo-fnd-acc-4217/TND,
   :lcc-lr/denotes :fibo-fnd-acc-4217/TunisianDinar,
   :lcc-lr/hasTag "TND",
   :lcc-lr/identifies :fibo-fnd-acc-4217/TunisianDinar,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "TND",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the currency identifier for Tunisian Dinar"}})

(def TOP
  "the currency identifier for Paʻanga"
  {:db/ident :fibo-fnd-acc-4217/TOP,
   :lcc-lr/denotes :fibo-fnd-acc-4217/Paanga,
   :lcc-lr/hasTag "TOP",
   :lcc-lr/identifies :fibo-fnd-acc-4217/Paanga,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "TOP",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Paʻanga"}})

(def TRY
  "the currency identifier for Turkish Lira"
  {:db/ident :fibo-fnd-acc-4217/TRY,
   :lcc-lr/denotes :fibo-fnd-acc-4217/TurkishLira,
   :lcc-lr/hasTag "TRY",
   :lcc-lr/identifies :fibo-fnd-acc-4217/TurkishLira,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "TRY",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Turkish Lira"}})

(def TTD
  "the currency identifier for Trinidad and Tobago Dollar"
  {:db/ident :fibo-fnd-acc-4217/TTD,
   :lcc-lr/denotes :fibo-fnd-acc-4217/TrinidadandTobagoDollar,
   :lcc-lr/hasTag "TTD",
   :lcc-lr/identifies :fibo-fnd-acc-4217/TrinidadandTobagoDollar,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "TTD",
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "the currency identifier for Trinidad and Tobago Dollar"}})

(def TWD
  "the currency identifier for New Taiwan Dollar"
  {:db/ident :fibo-fnd-acc-4217/TWD,
   :lcc-lr/denotes :fibo-fnd-acc-4217/NewTaiwanDollar,
   :lcc-lr/hasTag "TWD",
   :lcc-lr/identifies :fibo-fnd-acc-4217/NewTaiwanDollar,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "TWD",
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "the currency identifier for New Taiwan Dollar"}})

(def TZS
  "the currency identifier for Tanzanian Shilling"
  {:db/ident :fibo-fnd-acc-4217/TZS,
   :lcc-lr/denotes :fibo-fnd-acc-4217/TanzanianShilling,
   :lcc-lr/hasTag "TZS",
   :lcc-lr/identifies :fibo-fnd-acc-4217/TanzanianShilling,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "TZS",
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "the currency identifier for Tanzanian Shilling"}})

(def Taka
  "the currency Taka"
  {:db/ident :fibo-fnd-acc-4217/Taka,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "050",
   :lcc-cr/isUsedBy :lcc-3166-1/Bangladesh,
   :lcc-lr/hasName "Taka",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Taka",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Taka"}})

(def Tala
  "the currency Tala"
  {:db/ident :fibo-fnd-acc-4217/Tala,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "882",
   :lcc-cr/isUsedBy :lcc-3166-1/Samoa,
   :lcc-lr/hasName "Tala",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Tala",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Tala"}})

(def TanzanianShilling
  "the currency Tanzanian Shilling"
  {:db/ident :fibo-fnd-acc-4217/TanzanianShilling,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "834",
   :lcc-cr/isUsedBy :lcc-3166-1/Tanzania,
   :lcc-lr/hasName "Tanzanian Shilling",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Tanzanian Shilling",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Tanzanian Shilling"}})

(def Tenge
  "the currency Tenge"
  {:db/ident :fibo-fnd-acc-4217/Tenge,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "398",
   :lcc-cr/isUsedBy :lcc-3166-1/Kazakhstan,
   :lcc-lr/hasName "Tenge",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Tenge",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Tenge"}})

(def TrinidadandTobagoDollar
  "the currency Trinidad and Tobago Dollar"
  {:db/ident :fibo-fnd-acc-4217/TrinidadandTobagoDollar,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "780",
   :lcc-cr/isUsedBy :lcc-3166-1/TrinidadAndTobago,
   :lcc-lr/hasName "Trinidad and Tobago Dollar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Trinidad and Tobago Dollar",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Trinidad and Tobago Dollar"}})

(def Tugrik
  "the currency Tugrik"
  {:db/ident :fibo-fnd-acc-4217/Tugrik,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "496",
   :lcc-cr/isUsedBy :lcc-3166-1/Mongolia,
   :lcc-lr/hasName "Tugrik",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Tugrik",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Tugrik"}})

(def TunisianDinar
  "the currency Tunisian Dinar"
  {:db/ident :fibo-fnd-acc-4217/TunisianDinar,
   :fibo-fnd-acc-cur/hasMinorUnit "3",
   :fibo-fnd-acc-cur/hasNumericCode "788",
   :lcc-cr/isUsedBy :lcc-3166-1/Tunisia,
   :lcc-lr/hasName "Tunisian Dinar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Tunisian Dinar",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Tunisian Dinar"}})

(def TurkishLira
  "the currency Turkish Lira"
  {:db/ident :fibo-fnd-acc-4217/TurkishLira,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "949",
   :lcc-cr/isUsedBy :lcc-3166-1/Turkey,
   :lcc-lr/hasName "Turkish Lira",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Turkish Lira",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Turkish Lira"}})

(def TurkmenistanNewManat
  "the currency Turkmenistan New Manat"
  {:db/ident :fibo-fnd-acc-4217/TurkmenistanNewManat,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "934",
   :lcc-cr/isUsedBy :lcc-3166-1/Turkmenistan,
   :lcc-lr/hasName "Turkmenistan New Manat",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Turkmenistan New Manat",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Turkmenistan New Manat"}})

(def UAEDirham
  "the currency UAE Dirham"
  {:db/ident :fibo-fnd-acc-4217/UAEDirham,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "784",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedArabEmirates,
   :lcc-lr/hasName "UAE Dirham",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "UAE Dirham",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency UAE Dirham"}})

(def UAH
  "the currency identifier for Hryvnia"
  {:db/ident :fibo-fnd-acc-4217/UAH,
   :lcc-lr/denotes :fibo-fnd-acc-4217/Hryvnia,
   :lcc-lr/hasTag "UAH",
   :lcc-lr/identifies :fibo-fnd-acc-4217/Hryvnia,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "UAH",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Hryvnia"}})

(def UGX
  "the currency identifier for Uganda Shilling"
  {:db/ident :fibo-fnd-acc-4217/UGX,
   :lcc-lr/denotes :fibo-fnd-acc-4217/UgandaShilling,
   :lcc-lr/hasTag "UGX",
   :lcc-lr/identifies :fibo-fnd-acc-4217/UgandaShilling,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "UGX",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the currency identifier for Uganda Shilling"}})

(def USD
  "the currency identifier for US Dollar"
  {:db/ident :fibo-fnd-acc-4217/USD,
   :lcc-lr/denotes :fibo-fnd-acc-4217/USDollar,
   :lcc-lr/hasTag "USD",
   :lcc-lr/identifies :fibo-fnd-acc-4217/USDollar,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "USD",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for US Dollar"}})

(def USDollar
  "the currency US Dollar"
  {:db/ident :fibo-fnd-acc-4217/USDollar,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "840",
   :lcc-cr/isUsedBy [:lcc-3166-1/VirginIslandsBritish
                     :lcc-3166-1/NorthernMarianaIslands
                     :lcc-3166-1/Micronesia
                     :lcc-3166-1/VirginIslandsUS
                     :lcc-3166-1/TurksAndCaicosIslands
                     :lcc-3166-1/Ecuador
                     :lcc-3166-1/Panama
                     :lcc-3166-1/Palau
                     :lcc-3166-1/BritishIndianOceanTerritory
                     :lcc-3166-1/Timor-Leste
                     :lcc-3166-1/Haiti
                     :lcc-3166-1/Guam
                     :lcc-3166-1/UnitedStatesOfAmerica
                     :lcc-3166-1/AmericanSamoa
                     :lcc-3166-1/PuertoRico
                     :lcc-3166-1/MarshallIslands
                     :lcc-3166-1/Bonaire
                     :lcc-3166-1/UnitedStatesMinorOutlyingIslands
                     :lcc-3166-1/ElSalvador],
   :lcc-lr/hasName "US Dollar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "US Dollar",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency US Dollar"}})

(def USDollar_Nextday
  "the funds US Dollar (Next day)"
  {:db/ident :fibo-fnd-acc-4217/USDollar_Nextday,
   :fibo-fnd-acc-cur/hasCurrency :fibo-fnd-acc-4217/USDollar,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "997",
   :fibo-fnd-utl-av/explanatoryNote
   "\"Next day\" funds are immediately available for transfer in like funds, and, subject to settlement, available the next business day for same day funds transfer or withdrawal in cash.",
   :lcc-cr/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :lcc-lr/hasName "US Dollar (Next day)",
   :rdf/type [:fibo-fnd-acc-cur/Funds :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "US Dollar (Next day)",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the funds US Dollar (Next day)"}})

(def USN
  "the funds identifier for US Dollar (Next day)"
  {:db/ident :fibo-fnd-acc-4217/USN,
   :lcc-lr/denotes :fibo-fnd-acc-4217/USDollar_Nextday,
   :lcc-lr/hasTag "USN",
   :lcc-lr/identifies :fibo-fnd-acc-4217/USDollar_Nextday,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/FundsIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "USN",
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "the funds identifier for US Dollar (Next day)"}})

(def UYI
  "the funds identifier for Uruguay Peso en Unidades Indexadas (UI)"
  {:db/ident :fibo-fnd-acc-4217/UYI,
   :lcc-lr/denotes :fibo-fnd-acc-4217/UruguayPesoenUnidadesIndexadas_UI,
   :lcc-lr/hasTag "UYI",
   :lcc-lr/identifies :fibo-fnd-acc-4217/UruguayPesoenUnidadesIndexadas_UI,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/FundsIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "UYI",
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "the funds identifier for Uruguay Peso en Unidades Indexadas (UI)"}})

(def UYU
  "the currency identifier for Peso Uruguayo"
  {:db/ident :fibo-fnd-acc-4217/UYU,
   :lcc-lr/denotes :fibo-fnd-acc-4217/PesoUruguayo,
   :lcc-lr/hasTag "UYU",
   :lcc-lr/identifies :fibo-fnd-acc-4217/PesoUruguayo,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "UYU",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the currency identifier for Peso Uruguayo"}})

(def UYW
  "the currency identifier for Unidad Previsional"
  {:db/ident :fibo-fnd-acc-4217/UYW,
   :lcc-lr/denotes :fibo-fnd-acc-4217/UnidadPrevisional,
   :lcc-lr/hasTag "UYW",
   :lcc-lr/identifies :fibo-fnd-acc-4217/UnidadPrevisional,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "UYW",
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "the currency identifier for Unidad Previsional"}})

(def UZS
  "the currency identifier for Uzbekistan Sum"
  {:db/ident :fibo-fnd-acc-4217/UZS,
   :lcc-lr/denotes :fibo-fnd-acc-4217/UzbekistanSum,
   :lcc-lr/hasTag "UZS",
   :lcc-lr/identifies :fibo-fnd-acc-4217/UzbekistanSum,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "UZS",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the currency identifier for Uzbekistan Sum"}})

(def UgandaShilling
  "the currency Uganda Shilling"
  {:db/ident :fibo-fnd-acc-4217/UgandaShilling,
   :fibo-fnd-acc-cur/hasMinorUnit "0",
   :fibo-fnd-acc-cur/hasNumericCode "800",
   :lcc-cr/isUsedBy :lcc-3166-1/Uganda,
   :lcc-lr/hasName "Uganda Shilling",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Uganda Shilling",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Uganda Shilling"}})

(def UnidadPrevisional
  "the currency Unidad Previsional"
  {:db/ident :fibo-fnd-acc-4217/UnidadPrevisional,
   :fibo-fnd-acc-cur/hasMinorUnit "4",
   :fibo-fnd-acc-cur/hasNumericCode "927",
   :lcc-cr/isUsedBy :lcc-3166-1/Uruguay,
   :lcc-lr/hasName "Unidad Previsional",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Unidad Previsional",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Unidad Previsional"}})

(def UnidaddeFomento
  "the funds Unidad de Fomento"
  {:db/ident :fibo-fnd-acc-4217/UnidaddeFomento,
   :fibo-fnd-acc-cur/hasCurrency :fibo-fnd-acc-4217/ChileanPeso,
   :fibo-fnd-acc-cur/hasMinorUnit "4",
   :fibo-fnd-acc-cur/hasNumericCode "990",
   :fibo-fnd-utl-av/explanatoryNote
   "The CLF is a daily economically-financial unit calculated by the Central Bank of Chile according to inflation (as measured by the Chilean Consumer Price Index of the previous month). The value of the CLF is expressed in terms of Chilean Pesos per CLF. The use of CLF has been widely extended to all types of bank loans, financial investments (time deposits, mortgages and other public or private indexed instruments), contracts and fees in some cases.",
   :lcc-cr/isUsedBy :lcc-3166-1/Chile,
   :lcc-lr/hasName "Unidad de Fomento",
   :rdf/type [:fibo-fnd-acc-cur/Funds :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Unidad de Fomento",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the funds Unidad de Fomento"}})

(def UnidaddeValorReal
  "the funds Unidad de Valor Real"
  {:db/ident :fibo-fnd-acc-4217/UnidaddeValorReal,
   :fibo-fnd-acc-cur/hasCurrency :fibo-fnd-acc-4217/ColombianPeso,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "970",
   :fibo-fnd-utl-av/explanatoryNote
   "The UVR is a daily account unit set by the Central Bank of Colombia according to the variation in the Consumer Price Index of Colombia. The value of UVR is expressed in terms of Colombian Pesos per UVR. It is used to denominate and update mortgage loans and some public debt bonds.",
   :lcc-cr/isUsedBy :lcc-3166-1/Colombia,
   :lcc-lr/hasName "Unidad de Valor Real",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-acc-cur/Funds],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Unidad de Valor Real",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the funds Unidad de Valor Real"}})

(def UruguayPesoenUnidadesIndexadas_UI
  "the funds Uruguay Peso en Unidades Indexadas (UI)"
  {:db/ident :fibo-fnd-acc-4217/UruguayPesoenUnidadesIndexadas_UI,
   :fibo-fnd-acc-cur/hasCurrency :fibo-fnd-acc-4217/PesoUruguayo,
   :fibo-fnd-acc-cur/hasMinorUnit "0",
   :fibo-fnd-acc-cur/hasNumericCode "940",
   :fibo-fnd-utl-av/explanatoryNote
   "The UYI (URUIURUI) is used for issuance of debt instruments by the Uruguayan government in the international global bond market. It is calculated based on an established methodology using underlying inflationary statistics in the Uruguayan market. (Introduced in 2002).",
   :lcc-cr/isUsedBy :lcc-3166-1/Uruguay,
   :lcc-lr/hasName "Uruguay Peso en Unidades Indexadas (UI)",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-acc-cur/Funds],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Uruguay Peso en Unidades Indexadas (UI)",
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "the funds Uruguay Peso en Unidades Indexadas (UI)"}})

(def UzbekistanSum
  "the currency Uzbekistan Sum"
  {:db/ident :fibo-fnd-acc-4217/UzbekistanSum,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "860",
   :lcc-cr/isUsedBy :lcc-3166-1/Uzbekistan,
   :lcc-lr/hasName "Uzbekistan Sum",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Uzbekistan Sum",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Uzbekistan Sum"}})

(def VED
  "the currency identifier for Bolívar Soberano"
  {:db/ident :fibo-fnd-acc-4217/VED,
   :lcc-lr/denotes :fibo-fnd-acc-4217/BolívarSoberano,
   :lcc-lr/hasTag "VED",
   :lcc-lr/identifies :fibo-fnd-acc-4217/BolívarSoberano,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "VED",
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "the currency identifier for Bolívar Soberano"}})

(def VES
  "the currency identifier for Bolívar Soberano"
  {:db/ident :fibo-fnd-acc-4217/VES,
   :lcc-lr/denotes :fibo-fnd-acc-4217/BolívarSoberano,
   :lcc-lr/hasTag "VES",
   :lcc-lr/identifies :fibo-fnd-acc-4217/BolívarSoberano,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "VES",
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "the currency identifier for Bolívar Soberano"}})

(def VND
  "the currency identifier for Dong"
  {:db/ident :fibo-fnd-acc-4217/VND,
   :lcc-lr/denotes :fibo-fnd-acc-4217/Dong,
   :lcc-lr/hasTag "VND",
   :lcc-lr/identifies :fibo-fnd-acc-4217/Dong,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "VND",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Dong"}})

(def VUV
  "the currency identifier for Vatu"
  {:db/ident :fibo-fnd-acc-4217/VUV,
   :lcc-lr/denotes :fibo-fnd-acc-4217/Vatu,
   :lcc-lr/hasTag "VUV",
   :lcc-lr/identifies :fibo-fnd-acc-4217/Vatu,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "VUV",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Vatu"}})

(def Vatu
  "the currency Vatu"
  {:db/ident :fibo-fnd-acc-4217/Vatu,
   :fibo-fnd-acc-cur/hasMinorUnit "0",
   :fibo-fnd-acc-cur/hasNumericCode "548",
   :lcc-cr/isUsedBy :lcc-3166-1/Vanuatu,
   :lcc-lr/hasName "Vatu",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Vatu",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Vatu"}})

(def WIREuro
  "the funds WIR Euro"
  {:db/ident :fibo-fnd-acc-4217/WIREuro,
   :fibo-fnd-acc-cur/hasCurrency :fibo-fnd-acc-4217/Euro,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "947",
   :fibo-fnd-utl-av/explanatoryNote
   "WIR Euro - WIR Bank for use with the EFTPOS system with their own WIR-card and the Electronic Banking Services",
   :lcc-cr/isUsedBy :lcc-3166-1/Switzerland,
   :lcc-lr/hasName "WIR Euro",
   :rdf/type [:fibo-fnd-acc-cur/Funds :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "WIR Euro",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the funds WIR Euro"}})

(def WIRFranc
  "the funds WIR Franc"
  {:db/ident :fibo-fnd-acc-4217/WIRFranc,
   :fibo-fnd-acc-cur/hasCurrency :fibo-fnd-acc-4217/SwissFranc,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "948",
   :fibo-fnd-utl-av/explanatoryNote
   "WIR Franc - WIR Bank for use with the EFTPOS system with their own WIR-card and the Electronic Banking Services.",
   :lcc-cr/isUsedBy :lcc-3166-1/Switzerland,
   :lcc-lr/hasName "WIR Franc",
   :rdf/type [:fibo-fnd-acc-cur/Funds :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "WIR Franc",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the funds WIR Franc"}})

(def WST
  "the currency identifier for Tala"
  {:db/ident :fibo-fnd-acc-4217/WST,
   :lcc-lr/denotes :fibo-fnd-acc-4217/Tala,
   :lcc-lr/hasTag "WST",
   :lcc-lr/identifies :fibo-fnd-acc-4217/Tala,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "WST",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Tala"}})

(def Won
  "the currency Won"
  {:db/ident :fibo-fnd-acc-4217/Won,
   :fibo-fnd-acc-cur/hasMinorUnit "0",
   :fibo-fnd-acc-cur/hasNumericCode "410",
   :lcc-cr/isUsedBy :lcc-3166-1/KoreaRepublicOf,
   :lcc-lr/hasName "Won",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Won",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Won"}})

(def XAF
  "the currency identifier for CFA Franc BEAC"
  {:db/ident :fibo-fnd-acc-4217/XAF,
   :lcc-lr/denotes :fibo-fnd-acc-4217/CFAFrancBEAC,
   :lcc-lr/hasTag "XAF",
   :lcc-lr/identifies :fibo-fnd-acc-4217/CFAFrancBEAC,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "XAF",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the currency identifier for CFA Franc BEAC"}})

(def XAG
  "identifier for the currency whose unit is one troy ounce of the precious metal Silver"
  {:db/ident :fibo-fnd-acc-4217/XAG,
   :lcc-lr/denotes :fibo-fnd-acc-4217/Silver,
   :lcc-lr/hasTag "XAG",
   :lcc-lr/identifies :fibo-fnd-acc-4217/Silver,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/PreciousMetalIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "XAG",
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "identifier for the currency whose unit is one troy ounce of the precious metal Silver"}})

(def XAU
  "identifier for the currency whose unit is one troy ounce of the precious metal Gold"
  {:db/ident :fibo-fnd-acc-4217/XAU,
   :lcc-lr/denotes :fibo-fnd-acc-4217/Gold,
   :lcc-lr/hasTag "XAU",
   :lcc-lr/identifies :fibo-fnd-acc-4217/Gold,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/PreciousMetalIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "XAU",
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "identifier for the currency whose unit is one troy ounce of the precious metal Gold"}})

(def XBA
  "the identifier for Bond Markets Unit European Composite Unit (EURCO)"
  {:db/ident :fibo-fnd-acc-4217/XBA,
   :lcc-lr/denotes
   :fibo-fnd-acc-4217/BondMarketsUnitEuropeanCompositeUnit_EURCO,
   :lcc-lr/hasTag "XBA",
   :lcc-lr/identifies
   :fibo-fnd-acc-4217/BondMarketsUnitEuropeanCompositeUnit_EURCO,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/UnitOfAccountIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "XBA",
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "the identifier for Bond Markets Unit European Composite Unit (EURCO)"}})

(def XBB
  "the identifier for Bond Markets Unit European Monetary Unit (E.M.U.-6)"
  {:db/ident :fibo-fnd-acc-4217/XBB,
   :lcc-lr/denotes :fibo-fnd-acc-4217/BondMarketsUnitEuropeanMonetaryUnit_EMU-6,
   :lcc-lr/hasTag "XBB",
   :lcc-lr/identifies
   :fibo-fnd-acc-4217/BondMarketsUnitEuropeanMonetaryUnit_EMU-6,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/UnitOfAccountIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "XBB",
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "the identifier for Bond Markets Unit European Monetary Unit (E.M.U.-6)"}})

(def XBC
  "the identifier for Bond Markets Unit European Unit of Account 9 (E.U.A.-9)"
  {:db/ident :fibo-fnd-acc-4217/XBC,
   :lcc-lr/denotes
   :fibo-fnd-acc-4217/BondMarketsUnitEuropeanUnitofAccount9_EUA-9,
   :lcc-lr/hasTag "XBC",
   :lcc-lr/identifies
   :fibo-fnd-acc-4217/BondMarketsUnitEuropeanUnitofAccount9_EUA-9,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/UnitOfAccountIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "XBC",
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "the identifier for Bond Markets Unit European Unit of Account 9 (E.U.A.-9)"}})

(def XBD
  "the identifier for Bond Markets Unit European Unit of Account 17 (E.U.A.-17)"
  {:db/ident :fibo-fnd-acc-4217/XBD,
   :lcc-lr/denotes
   :fibo-fnd-acc-4217/BondMarketsUnitEuropeanUnitofAccount17_EUA-17,
   :lcc-lr/hasTag "XBD",
   :lcc-lr/identifies
   :fibo-fnd-acc-4217/BondMarketsUnitEuropeanUnitofAccount17_EUA-17,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/UnitOfAccountIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "XBD",
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "the identifier for Bond Markets Unit European Unit of Account 17 (E.U.A.-17)"}})

(def XCD
  "the currency identifier for East Caribbean Dollar"
  {:db/ident :fibo-fnd-acc-4217/XCD,
   :lcc-lr/denotes :fibo-fnd-acc-4217/EastCaribbeanDollar,
   :lcc-lr/hasTag "XCD",
   :lcc-lr/identifies :fibo-fnd-acc-4217/EastCaribbeanDollar,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "XCD",
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "the currency identifier for East Caribbean Dollar"}})

(def XDR
  "the IMF's identifier for SDR (Special Drawing Right)"
  {:db/ident :fibo-fnd-acc-4217/XDR,
   :lcc-lr/denotes :fibo-fnd-acc-4217/SDR_SpecialDrawingRight,
   :lcc-lr/hasTag "XDR",
   :lcc-lr/identifies :fibo-fnd-acc-4217/SDR_SpecialDrawingRight,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/UnitOfAccountIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "XDR",
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "the IMF's identifier for SDR (Special Drawing Right)"}})

(def XOF
  "the currency identifier for CFA Franc BCEAO"
  {:db/ident :fibo-fnd-acc-4217/XOF,
   :lcc-lr/denotes :fibo-fnd-acc-4217/CFAFrancBCEAO,
   :lcc-lr/hasTag "XOF",
   :lcc-lr/identifies :fibo-fnd-acc-4217/CFAFrancBCEAO,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "XOF",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the currency identifier for CFA Franc BCEAO"}})

(def XPD
  "identifier for the currency whose unit is one troy ounce of the precious metal Palladium"
  {:db/ident :fibo-fnd-acc-4217/XPD,
   :lcc-lr/denotes :fibo-fnd-acc-4217/Palladium,
   :lcc-lr/hasTag "XPD",
   :lcc-lr/identifies :fibo-fnd-acc-4217/Palladium,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/PreciousMetalIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "XPD",
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "identifier for the currency whose unit is one troy ounce of the precious metal Palladium"}})

(def XPF
  "the currency identifier for CFP Franc"
  {:db/ident :fibo-fnd-acc-4217/XPF,
   :lcc-lr/denotes :fibo-fnd-acc-4217/CFPFranc,
   :lcc-lr/hasTag "XPF",
   :lcc-lr/identifies :fibo-fnd-acc-4217/CFPFranc,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "XPF",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for CFP Franc"}})

(def XPT
  "identifier for the currency whose unit is one troy ounce of the precious metal Platinum"
  {:db/ident :fibo-fnd-acc-4217/XPT,
   :lcc-lr/denotes :fibo-fnd-acc-4217/Platinum,
   :lcc-lr/hasTag "XPT",
   :lcc-lr/identifies :fibo-fnd-acc-4217/Platinum,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/PreciousMetalIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "XPT",
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "identifier for the currency whose unit is one troy ounce of the precious metal Platinum"}})

(def XSU
  "the currency identifier for Sucre"
  {:db/ident :fibo-fnd-acc-4217/XSU,
   :lcc-lr/denotes :fibo-fnd-acc-4217/Sucre,
   :lcc-lr/hasTag "XSU",
   :lcc-lr/identifies :fibo-fnd-acc-4217/Sucre,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "XSU",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Sucre"}})

(def XTS
  "Codes specifically reserved for testing purposes"
  {:db/ident :fibo-fnd-acc-4217/XTS,
   :lcc-lr/hasTag "XTS",
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "XTS",
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Codes specifically reserved for testing purposes"}})

(def XUA
  "the identifier for ADB Unit of Account"
  {:db/ident :fibo-fnd-acc-4217/XUA,
   :lcc-lr/denotes :fibo-fnd-acc-4217/ADBUnitofAccount,
   :lcc-lr/hasTag "XUA",
   :lcc-lr/identifies :fibo-fnd-acc-4217/ADBUnitofAccount,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/UnitOfAccountIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "XUA",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the identifier for ADB Unit of Account"}})

(def XXX
  "The codes assigned for transactions where no currency is involved"
  {:db/ident :fibo-fnd-acc-4217/XXX,
   :lcc-lr/hasTag "XXX",
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "XXX",
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The codes assigned for transactions where no currency is involved"}})

(def YER
  "the currency identifier for Yemeni Rial"
  {:db/ident :fibo-fnd-acc-4217/YER,
   :lcc-lr/denotes :fibo-fnd-acc-4217/YemeniRial,
   :lcc-lr/hasTag "YER",
   :lcc-lr/identifies :fibo-fnd-acc-4217/YemeniRial,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "YER",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Yemeni Rial"}})

(def YemeniRial
  "the currency Yemeni Rial"
  {:db/ident :fibo-fnd-acc-4217/YemeniRial,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "886",
   :lcc-cr/isUsedBy :lcc-3166-1/Yemen,
   :lcc-lr/hasName "Yemeni Rial",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Yemeni Rial",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Yemeni Rial"}})

(def Yen
  "the currency Yen"
  {:db/ident :fibo-fnd-acc-4217/Yen,
   :fibo-fnd-acc-cur/hasMinorUnit "0",
   :fibo-fnd-acc-cur/hasNumericCode "392",
   :lcc-cr/isUsedBy :lcc-3166-1/Japan,
   :lcc-lr/hasName "Yen",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Yen",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Yen"}})

(def YuanRenminbi
  "the currency Yuan Renminbi"
  {:db/ident :fibo-fnd-acc-4217/YuanRenminbi,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "156",
   :lcc-cr/isUsedBy :lcc-3166-1/China,
   :lcc-lr/hasName "Yuan Renminbi",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Yuan Renminbi",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Yuan Renminbi"}})

(def ZAR
  "the currency identifier for Rand"
  {:db/ident :fibo-fnd-acc-4217/ZAR,
   :lcc-lr/denotes :fibo-fnd-acc-4217/Rand,
   :lcc-lr/hasTag "ZAR",
   :lcc-lr/identifies :fibo-fnd-acc-4217/Rand,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "ZAR",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency identifier for Rand"}})

(def ZMW
  "the currency identifier for Zambian Kwacha"
  {:db/ident :fibo-fnd-acc-4217/ZMW,
   :lcc-lr/denotes :fibo-fnd-acc-4217/ZambianKwacha,
   :lcc-lr/hasTag "ZMW",
   :lcc-lr/identifies :fibo-fnd-acc-4217/ZambianKwacha,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "ZMW",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the currency identifier for Zambian Kwacha"}})

(def ZWL
  "the currency identifier for Zimbabwe Dollar"
  {:db/ident :fibo-fnd-acc-4217/ZWL,
   :lcc-lr/denotes :fibo-fnd-acc-4217/ZimbabweDollar,
   :lcc-lr/hasTag "ZWL",
   :lcc-lr/identifies :fibo-fnd-acc-4217/ZimbabweDollar,
   :lcc-lr/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "ZWL",
   :skos/definition {:rdf/language "en",
                     :rdf/value "the currency identifier for Zimbabwe Dollar"}})

(def ZambianKwacha
  "the currency Zambian Kwacha"
  {:db/ident :fibo-fnd-acc-4217/ZambianKwacha,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "967",
   :lcc-cr/isUsedBy :lcc-3166-1/Zambia,
   :lcc-lr/hasName "Zambian Kwacha",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Zambian Kwacha",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Zambian Kwacha"}})

(def ZimbabweDollar
  "the currency Zimbabwe Dollar"
  {:db/ident :fibo-fnd-acc-4217/ZimbabweDollar,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "932",
   :lcc-cr/isUsedBy :lcc-3166-1/Zimbabwe,
   :lcc-lr/hasName "Zimbabwe Dollar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Zimbabwe Dollar",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Zimbabwe Dollar"}})

(def Zloty
  "the currency Zloty"
  {:db/ident :fibo-fnd-acc-4217/Zloty,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "985",
   :lcc-cr/isUsedBy :lcc-3166-1/Poland,
   :lcc-lr/hasName "Zloty",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "Zloty",
   :skos/definition {:rdf/language "en",
                     :rdf/value    "the currency Zloty"}})