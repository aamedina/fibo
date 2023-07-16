(ns net.wikipunk.rdf.fibo-fnd-acc-4217
  "This ontology represents the subset of the ISO 4217 standard that include the actual currency codes."
  {:cmns-av/copyright ["Copyright (c) 2015-2023 EDM Council, Inc."
                       "Copyright (c) 2015-2023 Object Management Group, Inc."
                       "Copyright (c) 2022-2023 agnos.ai UK Ltd."
                       "Copyright (c) 2015-2023 Thematix Partners LLC"],
   :cmns-av/directSource
   ["ISO 4217 Currency and funds code list, 2023-01-01, as maintained by the SNV, available at http://www.currency-iso.org/en/home.html"
    "ISO 4217:2015 Codes for the representation of currencies and funds"],
   :cmns-av/explanatoryNote
   "This release includes all codes included in the ISO 4217 published code set.",
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :dcterms/abstract
   "This ontology represents the subset of the ISO 4217 standard that include the actual currency codes.",
   :dcterms/issued #xsd/dateTime #inst "2023-01-01T00:00:00.000-05:00",
   :dcterms/license {:rdfa/uri "https://opensource.org/licenses/MIT"},
   :dcterms/modified #xsd/dateTime #inst "2023-03-11T00:00:00.000-05:00",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   [{:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/Designators/"}
    {:rdfa/uri "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/ContextualDesignators/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/Identifiers/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/CodesAndCodeSets/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/Collections/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"}],
   :owl/versionIRI
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cds" "https://www.omg.org/spec/Commons/CodesAndCodeSets/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-dsg" "https://www.omg.org/spec/Commons/Designators/",
    "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-acc-4217"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "lcc-3166-1"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fnd-acc-4217",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfs/label "ISO 4217-1 Currency Codes Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/ version of this ontology reflects the move of precious metal from products and services to currency amount, with no additional changes to the codes themselves."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/ version of this ontology was modified to replace Swaziland with Eswatini, which was revised by the LCC 1.1 RTF to reflect the change to the country name per the U.N."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/ version of this ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary and reference the latest updates to the ISO currency codes."
    "This version was compared with and modified per the ISO XML file as published on January 1, 2023, available at https://www.six-group.com/en/products-services/financial-information/data-standards.html."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/ version of this ontology was modified to eliminate unnecessary dependencies on the relations ontology, and to replace rdfs:comment with skos:definition per FIBO policy."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/ version of this ontology was modified to eliminate duplication with concepts in LCC."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/ version of this ontology was modified to address hygiene errors with respect to text formatting."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/ version of this ontology was modified to reflect latest ISO and LCC data."]})

(def ADBUnitofAccount
  "the ADB Unit of Account"
  {:db/ident :fibo-fnd-acc-4217/ADBUnitofAccount,
   :fibo-fnd-acc-cur/hasNumericCode "965",
   :fibo-fnd-rel-rel/hasTextualName "ADB Unit of Account",
   :rdf/type [:fibo-fnd-acc-cur/UnitOfAccount :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "ADB Unit of Account",
   :skos/definition #xsd/langString "the ADB Unit of Account@en"})

(def AED
  "the currency identifier for UAE Dirham"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/UAEDirham,
   :cmns-id/identifies :fibo-fnd-acc-4217/UAEDirham,
   :db/ident :fibo-fnd-acc-4217/AED,
   :fibo-fnd-rel-rel/hasTag "AED",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "AED",
   :skos/definition #xsd/langString
                     "the currency identifier for UAE Dirham@en"})

(def AFN
  "the currency identifier for Afghani"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/Afghani,
   :cmns-id/identifies :fibo-fnd-acc-4217/Afghani,
   :db/ident :fibo-fnd-acc-4217/AFN,
   :fibo-fnd-rel-rel/hasTag "AFN",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "AFN",
   :skos/definition #xsd/langString "the currency identifier for Afghani@en"})

(def ALL
  "the currency identifier for Lek"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/Lek,
   :cmns-id/identifies :fibo-fnd-acc-4217/Lek,
   :db/ident :fibo-fnd-acc-4217/ALL,
   :fibo-fnd-rel-rel/hasTag "ALL",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "ALL",
   :skos/definition #xsd/langString "the currency identifier for Lek@en"})

(def AMD
  "the currency identifier for Armenian Dram"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/ArmenianDram,
   :cmns-id/identifies :fibo-fnd-acc-4217/ArmenianDram,
   :db/ident :fibo-fnd-acc-4217/AMD,
   :fibo-fnd-rel-rel/hasTag "AMD",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "AMD",
   :skos/definition #xsd/langString
                     "the currency identifier for Armenian Dram@en"})

(def ANG
  "the currency identifier for Netherlands Antillean Guilder"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/NetherlandsAntilleanGuilder,
   :cmns-id/identifies :fibo-fnd-acc-4217/NetherlandsAntilleanGuilder,
   :db/ident :fibo-fnd-acc-4217/ANG,
   :fibo-fnd-rel-rel/hasTag "ANG",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "ANG",
   :skos/definition
   #xsd/langString
    "the currency identifier for Netherlands Antillean Guilder@en"})

(def AOA
  "the currency identifier for Kwanza"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/Kwanza,
   :cmns-id/identifies :fibo-fnd-acc-4217/Kwanza,
   :db/ident :fibo-fnd-acc-4217/AOA,
   :fibo-fnd-rel-rel/hasTag "AOA",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "AOA",
   :skos/definition #xsd/langString "the currency identifier for Kwanza@en"})

(def ARS
  "the currency identifier for Argentine Peso"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/ArgentinePeso,
   :cmns-id/identifies :fibo-fnd-acc-4217/ArgentinePeso,
   :db/ident :fibo-fnd-acc-4217/ARS,
   :fibo-fnd-rel-rel/hasTag "ARS",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "ARS",
   :skos/definition #xsd/langString
                     "the currency identifier for Argentine Peso@en"})

(def AUD
  "the currency identifier for Australian Dollar"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/AustralianDollar,
   :cmns-id/identifies :fibo-fnd-acc-4217/AustralianDollar,
   :db/ident :fibo-fnd-acc-4217/AUD,
   :fibo-fnd-rel-rel/hasTag "AUD",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "AUD",
   :skos/definition #xsd/langString
                     "the currency identifier for Australian Dollar@en"})

(def AWG
  "the currency identifier for Aruban Florin"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/ArubanFlorin,
   :cmns-id/identifies :fibo-fnd-acc-4217/ArubanFlorin,
   :db/ident :fibo-fnd-acc-4217/AWG,
   :fibo-fnd-rel-rel/hasTag "AWG",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "AWG",
   :skos/definition #xsd/langString
                     "the currency identifier for Aruban Florin@en"})

(def AZN
  "the currency identifier for Azerbaijan Manat"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/AzerbaijanManat,
   :cmns-id/identifies :fibo-fnd-acc-4217/AzerbaijanManat,
   :db/ident :fibo-fnd-acc-4217/AZN,
   :fibo-fnd-rel-rel/hasTag "AZN",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "AZN",
   :skos/definition #xsd/langString
                     "the currency identifier for Azerbaijan Manat@en"})

(def Afghani
  "the currency Afghani"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Afghanistan,
   :db/ident :fibo-fnd-acc-4217/Afghani,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "971",
   :fibo-fnd-rel-rel/hasTextualName "Afghani",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Afghani",
   :skos/definition #xsd/langString "the currency Afghani@en"})

(def AlgerianDinar
  "the currency Algerian Dinar"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Algeria,
   :db/ident :fibo-fnd-acc-4217/AlgerianDinar,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "012",
   :fibo-fnd-rel-rel/hasTextualName "Algerian Dinar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Algerian Dinar",
   :skos/definition #xsd/langString "the currency Algerian Dinar@en"})

(def ArgentinePeso
  "the currency Argentine Peso"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Argentina,
   :db/ident :fibo-fnd-acc-4217/ArgentinePeso,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "032",
   :fibo-fnd-rel-rel/hasTextualName "Argentine Peso",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Argentine Peso",
   :skos/definition #xsd/langString "the currency Argentine Peso@en"})

(def ArmenianDram
  "the currency Armenian Dram"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Armenia,
   :db/ident :fibo-fnd-acc-4217/ArmenianDram,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "051",
   :fibo-fnd-rel-rel/hasTextualName "Armenian Dram",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Armenian Dram",
   :skos/definition #xsd/langString "the currency Armenian Dram@en"})

(def ArubanFlorin
  "the currency Aruban Florin"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Aruba,
   :db/ident :fibo-fnd-acc-4217/ArubanFlorin,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "533",
   :fibo-fnd-rel-rel/hasTextualName "Aruban Florin",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Aruban Florin",
   :skos/definition #xsd/langString "the currency Aruban Florin@en"})

(def AustralianDollar
  "the currency Australian Dollar"
  {:cmns-cxtdsg/isUsedBy [:lcc-3166-1/Nauru
                          :lcc-3166-1/HeardIslandAndMcDonaldIslands
                          :lcc-3166-1/Australia
                          :lcc-3166-1/Kiribati
                          :lcc-3166-1/Tuvalu
                          :lcc-3166-1/CocosKeelingIslands
                          :lcc-3166-1/ChristmasIsland
                          :lcc-3166-1/NorfolkIsland],
   :db/ident :fibo-fnd-acc-4217/AustralianDollar,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "036",
   :fibo-fnd-rel-rel/hasTextualName "Australian Dollar",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-acc-cur/Currency],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Australian Dollar",
   :skos/definition #xsd/langString "the currency Australian Dollar@en"})

(def AzerbaijanManat
  "the currency Azerbaijan Manat"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Azerbaijan,
   :db/ident :fibo-fnd-acc-4217/AzerbaijanManat,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "944",
   :fibo-fnd-rel-rel/hasTextualName "Azerbaijan Manat",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Azerbaijan Manat",
   :skos/definition #xsd/langString "the currency Azerbaijan Manat@en"})

(def BAM
  "the currency identifier for Convertible Mark"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/ConvertibleMark,
   :cmns-id/identifies :fibo-fnd-acc-4217/ConvertibleMark,
   :db/ident :fibo-fnd-acc-4217/BAM,
   :fibo-fnd-rel-rel/hasTag "BAM",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "BAM",
   :skos/definition #xsd/langString
                     "the currency identifier for Convertible Mark@en"})

(def BBD
  "the currency identifier for Barbados Dollar"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/BarbadosDollar,
   :cmns-id/identifies :fibo-fnd-acc-4217/BarbadosDollar,
   :db/ident :fibo-fnd-acc-4217/BBD,
   :fibo-fnd-rel-rel/hasTag "BBD",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "BBD",
   :skos/definition #xsd/langString
                     "the currency identifier for Barbados Dollar@en"})

(def BDT
  "the currency identifier for Taka"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/Taka,
   :cmns-id/identifies :fibo-fnd-acc-4217/Taka,
   :db/ident :fibo-fnd-acc-4217/BDT,
   :fibo-fnd-rel-rel/hasTag "BDT",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "BDT",
   :skos/definition #xsd/langString "the currency identifier for Taka@en"})

(def BGN
  "the currency identifier for Bulgarian Lev"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/BulgarianLev,
   :cmns-id/identifies :fibo-fnd-acc-4217/BulgarianLev,
   :db/ident :fibo-fnd-acc-4217/BGN,
   :fibo-fnd-rel-rel/hasTag "BGN",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "BGN",
   :skos/definition #xsd/langString
                     "the currency identifier for Bulgarian Lev@en"})

(def BHD
  "the currency identifier for Bahraini Dinar"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/BahrainiDinar,
   :cmns-id/identifies :fibo-fnd-acc-4217/BahrainiDinar,
   :db/ident :fibo-fnd-acc-4217/BHD,
   :fibo-fnd-rel-rel/hasTag "BHD",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "BHD",
   :skos/definition #xsd/langString
                     "the currency identifier for Bahraini Dinar@en"})

(def BIF
  "the currency identifier for Burundi Franc"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/BurundiFranc,
   :cmns-id/identifies :fibo-fnd-acc-4217/BurundiFranc,
   :db/ident :fibo-fnd-acc-4217/BIF,
   :fibo-fnd-rel-rel/hasTag "BIF",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "BIF",
   :skos/definition #xsd/langString
                     "the currency identifier for Burundi Franc@en"})

(def BMD
  "the currency identifier for Bermudian Dollar"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/BermudianDollar,
   :cmns-id/identifies :fibo-fnd-acc-4217/BermudianDollar,
   :db/ident :fibo-fnd-acc-4217/BMD,
   :fibo-fnd-rel-rel/hasTag "BMD",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "BMD",
   :skos/definition #xsd/langString
                     "the currency identifier for Bermudian Dollar@en"})

(def BND
  "the currency identifier for Brunei Dollar"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/BruneiDollar,
   :cmns-id/identifies :fibo-fnd-acc-4217/BruneiDollar,
   :db/ident :fibo-fnd-acc-4217/BND,
   :fibo-fnd-rel-rel/hasTag "BND",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "BND",
   :skos/definition #xsd/langString
                     "the currency identifier for Brunei Dollar@en"})

(def BOB
  "the currency identifier for Boliviano"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/Boliviano,
   :cmns-id/identifies :fibo-fnd-acc-4217/Boliviano,
   :db/ident :fibo-fnd-acc-4217/BOB,
   :fibo-fnd-rel-rel/hasTag "BOB",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "BOB",
   :skos/definition #xsd/langString "the currency identifier for Boliviano@en"})

(def BOV
  "the funds identifier for Mvdol"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/Mvdol,
   :cmns-id/identifies :fibo-fnd-acc-4217/Mvdol,
   :db/ident :fibo-fnd-acc-4217/BOV,
   :fibo-fnd-rel-rel/hasTag "BOV",
   :rdf/type [:fibo-fnd-acc-cur/FundsIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "BOV",
   :skos/definition #xsd/langString "the funds identifier for Mvdol@en"})

(def BRL
  "the currency identifier for Brazilian Real"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/BrazilianReal,
   :cmns-id/identifies :fibo-fnd-acc-4217/BrazilianReal,
   :db/ident :fibo-fnd-acc-4217/BRL,
   :fibo-fnd-rel-rel/hasTag "BRL",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "BRL",
   :skos/definition #xsd/langString
                     "the currency identifier for Brazilian Real@en"})

(def BSD
  "the currency identifier for Bahamian Dollar"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/BahamianDollar,
   :cmns-id/identifies :fibo-fnd-acc-4217/BahamianDollar,
   :db/ident :fibo-fnd-acc-4217/BSD,
   :fibo-fnd-rel-rel/hasTag "BSD",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "BSD",
   :skos/definition #xsd/langString
                     "the currency identifier for Bahamian Dollar@en"})

(def BTN
  "the currency identifier for Ngultrum"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/Ngultrum,
   :cmns-id/identifies :fibo-fnd-acc-4217/Ngultrum,
   :db/ident :fibo-fnd-acc-4217/BTN,
   :fibo-fnd-rel-rel/hasTag "BTN",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "BTN",
   :skos/definition #xsd/langString "the currency identifier for Ngultrum@en"})

(def BWP
  "the currency identifier for Pula"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/Pula,
   :cmns-id/identifies :fibo-fnd-acc-4217/Pula,
   :db/ident :fibo-fnd-acc-4217/BWP,
   :fibo-fnd-rel-rel/hasTag "BWP",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "BWP",
   :skos/definition #xsd/langString "the currency identifier for Pula@en"})

(def BYN
  "the currency identifier for Belarusian Ruble"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/BelarusianRuble,
   :cmns-id/identifies :fibo-fnd-acc-4217/BelarusianRuble,
   :db/ident :fibo-fnd-acc-4217/BYN,
   :fibo-fnd-rel-rel/hasTag "BYN",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "BYN",
   :skos/definition #xsd/langString
                     "the currency identifier for Belarusian Ruble@en"})

(def BZD
  "the currency identifier for Belize Dollar"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/BelizeDollar,
   :cmns-id/identifies :fibo-fnd-acc-4217/BelizeDollar,
   :db/ident :fibo-fnd-acc-4217/BZD,
   :fibo-fnd-rel-rel/hasTag "BZD",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "BZD",
   :skos/definition #xsd/langString
                     "the currency identifier for Belize Dollar@en"})

(def BahamianDollar
  "the currency Bahamian Dollar"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Bahamas,
   :db/ident :fibo-fnd-acc-4217/BahamianDollar,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "044",
   :fibo-fnd-rel-rel/hasTextualName "Bahamian Dollar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Bahamian Dollar",
   :skos/definition #xsd/langString "the currency Bahamian Dollar@en"})

(def BahrainiDinar
  "the currency Bahraini Dinar"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Bahrain,
   :db/ident :fibo-fnd-acc-4217/BahrainiDinar,
   :fibo-fnd-acc-cur/hasMinorUnit "3",
   :fibo-fnd-acc-cur/hasNumericCode "048",
   :fibo-fnd-rel-rel/hasTextualName "Bahraini Dinar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Bahraini Dinar",
   :skos/definition #xsd/langString "the currency Bahraini Dinar@en"})

(def Baht
  "the currency Baht"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Thailand,
   :db/ident :fibo-fnd-acc-4217/Baht,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "764",
   :fibo-fnd-rel-rel/hasTextualName "Baht",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Baht",
   :skos/definition #xsd/langString "the currency Baht@en"})

(def Balboa
  "the currency Balboa"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Panama,
   :db/ident :fibo-fnd-acc-4217/Balboa,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "590",
   :fibo-fnd-rel-rel/hasTextualName "Balboa",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Balboa",
   :skos/definition #xsd/langString "the currency Balboa@en"})

(def BarbadosDollar
  "the currency Barbados Dollar"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Barbados,
   :db/ident :fibo-fnd-acc-4217/BarbadosDollar,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "052",
   :fibo-fnd-rel-rel/hasTextualName "Barbados Dollar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Barbados Dollar",
   :skos/definition #xsd/langString "the currency Barbados Dollar@en"})

(def BelarusianRuble
  "the currency Belarusian Ruble"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Belarus,
   :db/ident :fibo-fnd-acc-4217/BelarusianRuble,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "933",
   :fibo-fnd-rel-rel/hasTextualName "Belarusian Ruble",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Belarusian Ruble",
   :skos/definition #xsd/langString "the currency Belarusian Ruble@en"})

(def BelizeDollar
  "the currency Belize Dollar"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Belize,
   :db/ident :fibo-fnd-acc-4217/BelizeDollar,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "084",
   :fibo-fnd-rel-rel/hasTextualName "Belize Dollar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Belize Dollar",
   :skos/definition #xsd/langString "the currency Belize Dollar@en"})

(def BermudianDollar
  "the currency Bermudian Dollar"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Bermuda,
   :db/ident :fibo-fnd-acc-4217/BermudianDollar,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "060",
   :fibo-fnd-rel-rel/hasTextualName "Bermudian Dollar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Bermudian Dollar",
   :skos/definition #xsd/langString "the currency Bermudian Dollar@en"})

(def Boliviano
  "the currency Boliviano"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Bolivia,
   :db/ident :fibo-fnd-acc-4217/Boliviano,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "068",
   :fibo-fnd-rel-rel/hasTextualName "Boliviano",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Boliviano",
   :skos/definition #xsd/langString "the currency Boliviano@en"})

(def BolívarSoberano
  "the currency Bolívar Soberano"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Venezuela,
   :db/ident :fibo-fnd-acc-4217/BolívarSoberano,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode ["926" "928"],
   :fibo-fnd-rel-rel/hasTextualName "Bolívar Soberano",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Bolívar Soberano",
   :skos/definition #xsd/langString "the currency Bolívar Soberano@en",
   :skos/note
   #xsd/langString
    "The Bolívar Soberano (VES) is redenominated by removing six zeros from the denominations. A new currency code VED/926 representing the new valuation (1,000,000 times old VES/928) is introduced on 1 October 2021 for any internal needs during the redenomination process, but is not replacing VES as the official currency code. The Central Bank of Venezuela will not adopt the new codes in the local system, VES/928 remains in use. The actual currency code VES/928 remains the valid code after 1 October 2021 to use in any future transactions to indicate the redenominated Bolívar Soberano.@en"})

(def BondMarketsUnitEuropeanCompositeUnit_EURCO
  "the Bond Markets Unit European Composite Unit (EURCO)"
  {:db/ident :fibo-fnd-acc-4217/BondMarketsUnitEuropeanCompositeUnit_EURCO,
   :fibo-fnd-acc-cur/hasNumericCode "955",
   :fibo-fnd-rel-rel/hasTextualName
   "Bond Markets Unit European Composite Unit (EURCO)",
   :rdf/type [:fibo-fnd-acc-cur/UnitOfAccount :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Bond Markets Unit European Composite Unit (EURCO)",
   :skos/definition
   #xsd/langString "the Bond Markets Unit European Composite Unit (EURCO)@en"})

(def BondMarketsUnitEuropeanMonetaryUnit_EMU-6
  "the Bond Markets Unit European Monetary Unit (E.M.U.-6)"
  {:db/ident :fibo-fnd-acc-4217/BondMarketsUnitEuropeanMonetaryUnit_EMU-6,
   :fibo-fnd-acc-cur/hasNumericCode "956",
   :fibo-fnd-rel-rel/hasTextualName
   "Bond Markets Unit European Monetary Unit (E.M.U.-6)",
   :rdf/type [:fibo-fnd-acc-cur/UnitOfAccount :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Bond Markets Unit European Monetary Unit (E.M.U.-6)",
   :skos/definition
   #xsd/langString
    "the Bond Markets Unit European Monetary Unit (E.M.U.-6)@en"})

(def BondMarketsUnitEuropeanUnitofAccount17_EUA-17
  "the Bond Markets Unit European Unit of Account 17 (E.U.A.-17)"
  {:db/ident :fibo-fnd-acc-4217/BondMarketsUnitEuropeanUnitofAccount17_EUA-17,
   :fibo-fnd-acc-cur/hasNumericCode "958",
   :fibo-fnd-rel-rel/hasTextualName
   "Bond Markets Unit European Unit of Account 17 (E.U.A.-17)",
   :rdf/type [:fibo-fnd-acc-cur/UnitOfAccount :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Bond Markets Unit European Unit of Account 17 (E.U.A.-17)",
   :skos/definition
   #xsd/langString
    "the Bond Markets Unit European Unit of Account 17 (E.U.A.-17)@en"})

(def BondMarketsUnitEuropeanUnitofAccount9_EUA-9
  "the Bond Markets Unit European Unit of Account 9 (E.U.A.-9)"
  {:db/ident :fibo-fnd-acc-4217/BondMarketsUnitEuropeanUnitofAccount9_EUA-9,
   :fibo-fnd-acc-cur/hasNumericCode "957",
   :fibo-fnd-rel-rel/hasTextualName
   "Bond Markets Unit European Unit of Account 9 (E.U.A.-9)",
   :rdf/type [:fibo-fnd-acc-cur/UnitOfAccount :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Bond Markets Unit European Unit of Account 9 (E.U.A.-9)",
   :skos/definition
   #xsd/langString
    "the Bond Markets Unit European Unit of Account 9 (E.U.A.-9)@en"})

(def BrazilianReal
  "the currency Brazilian Real"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Brazil,
   :db/ident :fibo-fnd-acc-4217/BrazilianReal,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "986",
   :fibo-fnd-rel-rel/hasTextualName "Brazilian Real",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Brazilian Real",
   :skos/definition #xsd/langString "the currency Brazilian Real@en"})

(def BruneiDollar
  "the currency Brunei Dollar"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/BruneiDarussalam,
   :db/ident :fibo-fnd-acc-4217/BruneiDollar,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "096",
   :fibo-fnd-rel-rel/hasTextualName "Brunei Dollar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Brunei Dollar",
   :skos/definition #xsd/langString "the currency Brunei Dollar@en"})

(def BulgarianLev
  "the currency Bulgarian Lev"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Bulgaria,
   :db/ident :fibo-fnd-acc-4217/BulgarianLev,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "975",
   :fibo-fnd-rel-rel/hasTextualName "Bulgarian Lev",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Bulgarian Lev",
   :skos/definition #xsd/langString "the currency Bulgarian Lev@en"})

(def BurundiFranc
  "the currency Burundi Franc"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Burundi,
   :db/ident :fibo-fnd-acc-4217/BurundiFranc,
   :fibo-fnd-acc-cur/hasMinorUnit "0",
   :fibo-fnd-acc-cur/hasNumericCode "108",
   :fibo-fnd-rel-rel/hasTextualName "Burundi Franc",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Burundi Franc",
   :skos/definition #xsd/langString "the currency Burundi Franc@en"})

(def CAD
  "the currency identifier for Canadian Dollar"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/CanadianDollar,
   :cmns-id/identifies :fibo-fnd-acc-4217/CanadianDollar,
   :db/ident :fibo-fnd-acc-4217/CAD,
   :fibo-fnd-rel-rel/hasTag "CAD",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "CAD",
   :skos/definition #xsd/langString
                     "the currency identifier for Canadian Dollar@en"})

(def CDF
  "the currency identifier for Congolese Franc"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/CongoleseFranc,
   :cmns-id/identifies :fibo-fnd-acc-4217/CongoleseFranc,
   :db/ident :fibo-fnd-acc-4217/CDF,
   :fibo-fnd-rel-rel/hasTag "CDF",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "CDF",
   :skos/definition #xsd/langString
                     "the currency identifier for Congolese Franc@en"})

(def CFAFrancBCEAO
  "the currency CFA Franc BCEAO"
  {:cmns-cxtdsg/isUsedBy [:lcc-3166-1/Togo
                          :lcc-3166-1/Guinea-Bissau
                          :lcc-3166-1/Senegal
                          :lcc-3166-1/BurkinaFaso
                          :lcc-3166-1/Mali
                          :lcc-3166-1/CoteDIvoire
                          :lcc-3166-1/Benin
                          :lcc-3166-1/Niger],
   :db/ident :fibo-fnd-acc-4217/CFAFrancBCEAO,
   :fibo-fnd-acc-cur/hasMinorUnit "0",
   :fibo-fnd-acc-cur/hasNumericCode "952",
   :fibo-fnd-rel-rel/hasTextualName "CFA Franc BCEAO",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-acc-cur/Currency],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "CFA Franc BCEAO",
   :skos/definition #xsd/langString "the currency CFA Franc BCEAO@en"})

(def CFAFrancBEAC
  "the currency CFA Franc BEAC"
  {:cmns-cxtdsg/isUsedBy [:lcc-3166-1/Gabon
                          :lcc-3166-1/CentralAfricanRepublic
                          :lcc-3166-1/Congo
                          :lcc-3166-1/Cameroon
                          :lcc-3166-1/EquatorialGuinea
                          :lcc-3166-1/Chad],
   :db/ident :fibo-fnd-acc-4217/CFAFrancBEAC,
   :fibo-fnd-acc-cur/hasMinorUnit "0",
   :fibo-fnd-acc-cur/hasNumericCode "950",
   :fibo-fnd-rel-rel/hasTextualName "CFA Franc BEAC",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-acc-cur/Currency],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "CFA Franc BEAC",
   :skos/definition #xsd/langString "the currency CFA Franc BEAC@en"})

(def CFPFranc
  "the currency CFP Franc"
  {:cmns-cxtdsg/isUsedBy [:lcc-3166-1/NewCaledonia
                          :lcc-3166-1/FrenchPolynesia
                          :lcc-3166-1/WallisAndFutuna],
   :db/ident :fibo-fnd-acc-4217/CFPFranc,
   :fibo-fnd-acc-cur/hasMinorUnit "0",
   :fibo-fnd-acc-cur/hasNumericCode "953",
   :fibo-fnd-rel-rel/hasTextualName "CFP Franc",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "CFP Franc",
   :skos/definition #xsd/langString "the currency CFP Franc@en"})

(def CHE
  "the funds identifier for WIR Euro"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/WIREuro,
   :cmns-id/identifies :fibo-fnd-acc-4217/WIREuro,
   :db/ident :fibo-fnd-acc-4217/CHE,
   :fibo-fnd-rel-rel/hasTag "CHE",
   :rdf/type [:fibo-fnd-acc-cur/FundsIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "CHE",
   :skos/definition #xsd/langString "the funds identifier for WIR Euro@en"})

(def CHF
  "the currency identifier for Swiss Franc"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/SwissFranc,
   :cmns-id/identifies :fibo-fnd-acc-4217/SwissFranc,
   :db/ident :fibo-fnd-acc-4217/CHF,
   :fibo-fnd-rel-rel/hasTag "CHF",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "CHF",
   :skos/definition #xsd/langString
                     "the currency identifier for Swiss Franc@en"})

(def CHW
  "the funds identifier for WIR Franc"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/WIRFranc,
   :cmns-id/identifies :fibo-fnd-acc-4217/WIRFranc,
   :db/ident :fibo-fnd-acc-4217/CHW,
   :fibo-fnd-rel-rel/hasTag "CHW",
   :rdf/type [:fibo-fnd-acc-cur/FundsIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "CHW",
   :skos/definition #xsd/langString "the funds identifier for WIR Franc@en"})

(def CLF
  "the funds identifier for Unidad de Fomento"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/UnidaddeFomento,
   :cmns-id/identifies :fibo-fnd-acc-4217/UnidaddeFomento,
   :db/ident :fibo-fnd-acc-4217/CLF,
   :fibo-fnd-rel-rel/hasTag "CLF",
   :rdf/type [:fibo-fnd-acc-cur/FundsIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "CLF",
   :skos/definition #xsd/langString
                     "the funds identifier for Unidad de Fomento@en"})

(def CLP
  "the currency identifier for Chilean Peso"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/ChileanPeso,
   :cmns-id/identifies :fibo-fnd-acc-4217/ChileanPeso,
   :db/ident :fibo-fnd-acc-4217/CLP,
   :fibo-fnd-rel-rel/hasTag "CLP",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "CLP",
   :skos/definition #xsd/langString
                     "the currency identifier for Chilean Peso@en"})

(def CNY
  "the currency identifier for Yuan Renminbi"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/YuanRenminbi,
   :cmns-id/identifies :fibo-fnd-acc-4217/YuanRenminbi,
   :db/ident :fibo-fnd-acc-4217/CNY,
   :fibo-fnd-rel-rel/hasTag "CNY",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "CNY",
   :skos/definition #xsd/langString
                     "the currency identifier for Yuan Renminbi@en"})

(def COP
  "the currency identifier for Colombian Peso"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/ColombianPeso,
   :cmns-id/identifies :fibo-fnd-acc-4217/ColombianPeso,
   :db/ident :fibo-fnd-acc-4217/COP,
   :fibo-fnd-rel-rel/hasTag "COP",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "COP",
   :skos/definition #xsd/langString
                     "the currency identifier for Colombian Peso@en"})

(def COU
  "the funds identifier for Unidad de Valor Real"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/UnidaddeValorReal,
   :cmns-id/identifies :fibo-fnd-acc-4217/UnidaddeValorReal,
   :db/ident :fibo-fnd-acc-4217/COU,
   :fibo-fnd-rel-rel/hasTag "COU",
   :rdf/type [:fibo-fnd-acc-cur/FundsIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "COU",
   :skos/definition #xsd/langString
                     "the funds identifier for Unidad de Valor Real@en"})

(def CRC
  "the currency identifier for Costa Rican Colon"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/CostaRicanColon,
   :cmns-id/identifies :fibo-fnd-acc-4217/CostaRicanColon,
   :db/ident :fibo-fnd-acc-4217/CRC,
   :fibo-fnd-rel-rel/hasTag "CRC",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "CRC",
   :skos/definition #xsd/langString
                     "the currency identifier for Costa Rican Colon@en"})

(def CUC
  "the currency identifier for Peso Convertible"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/PesoConvertible,
   :cmns-id/identifies :fibo-fnd-acc-4217/PesoConvertible,
   :db/ident :fibo-fnd-acc-4217/CUC,
   :fibo-fnd-rel-rel/hasTag "CUC",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "CUC",
   :skos/definition #xsd/langString
                     "the currency identifier for Peso Convertible@en"})

(def CUP
  "the currency identifier for Cuban Peso"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/CubanPeso,
   :cmns-id/identifies :fibo-fnd-acc-4217/CubanPeso,
   :db/ident :fibo-fnd-acc-4217/CUP,
   :fibo-fnd-rel-rel/hasTag "CUP",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "CUP",
   :skos/definition #xsd/langString
                     "the currency identifier for Cuban Peso@en"})

(def CVE
  "the currency identifier for Cabo Verde Escudo"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/CaboVerdeEscudo,
   :cmns-id/identifies :fibo-fnd-acc-4217/CaboVerdeEscudo,
   :db/ident :fibo-fnd-acc-4217/CVE,
   :fibo-fnd-rel-rel/hasTag "CVE",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "CVE",
   :skos/definition #xsd/langString
                     "the currency identifier for Cabo Verde Escudo@en"})

(def CZK
  "the currency identifier for Czech Koruna"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/CzechKoruna,
   :cmns-id/identifies :fibo-fnd-acc-4217/CzechKoruna,
   :db/ident :fibo-fnd-acc-4217/CZK,
   :fibo-fnd-rel-rel/hasTag "CZK",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "CZK",
   :skos/definition #xsd/langString
                     "the currency identifier for Czech Koruna@en"})

(def CaboVerdeEscudo
  "the currency Cabo Verde Escudo"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/CaboVerde,
   :db/ident :fibo-fnd-acc-4217/CaboVerdeEscudo,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "132",
   :fibo-fnd-rel-rel/hasTextualName "Cabo Verde Escudo",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Cabo Verde Escudo",
   :skos/definition #xsd/langString "the currency Cabo Verde Escudo@en"})

(def CanadianDollar
  "the currency Canadian Dollar"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Canada,
   :db/ident :fibo-fnd-acc-4217/CanadianDollar,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "124",
   :fibo-fnd-rel-rel/hasTextualName "Canadian Dollar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Canadian Dollar",
   :skos/definition #xsd/langString "the currency Canadian Dollar@en"})

(def CaymanIslandsDollar
  "the currency Cayman Islands Dollar"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/CaymanIslands,
   :db/ident :fibo-fnd-acc-4217/CaymanIslandsDollar,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "136",
   :fibo-fnd-rel-rel/hasTextualName "Cayman Islands Dollar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Cayman Islands Dollar",
   :skos/definition #xsd/langString "the currency Cayman Islands Dollar@en"})

(def ChileanPeso
  "the currency Chilean Peso"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Chile,
   :db/ident :fibo-fnd-acc-4217/ChileanPeso,
   :fibo-fnd-acc-cur/hasMinorUnit "0",
   :fibo-fnd-acc-cur/hasNumericCode "152",
   :fibo-fnd-rel-rel/hasTextualName "Chilean Peso",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Chilean Peso",
   :skos/definition #xsd/langString "the currency Chilean Peso@en"})

(def ColombianPeso
  "the currency Colombian Peso"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Colombia,
   :db/ident :fibo-fnd-acc-4217/ColombianPeso,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "170",
   :fibo-fnd-rel-rel/hasTextualName "Colombian Peso",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Colombian Peso",
   :skos/definition #xsd/langString "the currency Colombian Peso@en"})

(def ComorianFranc
  "the currency Comorian Franc"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Comoros,
   :db/ident :fibo-fnd-acc-4217/ComorianFranc,
   :fibo-fnd-acc-cur/hasMinorUnit "0",
   :fibo-fnd-acc-cur/hasNumericCode "174",
   :fibo-fnd-rel-rel/hasTextualName "Comorian Franc",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Comorian Franc",
   :skos/definition #xsd/langString "the currency Comorian Franc@en"})

(def CongoleseFranc
  "the currency Congolese Franc"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/CongoDemocraticRepublicOf,
   :db/ident :fibo-fnd-acc-4217/CongoleseFranc,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "976",
   :fibo-fnd-rel-rel/hasTextualName "Congolese Franc",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Congolese Franc",
   :skos/definition #xsd/langString "the currency Congolese Franc@en"})

(def ConvertibleMark
  "the currency Convertible Mark"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/BosniaAndHerzegovina,
   :db/ident :fibo-fnd-acc-4217/ConvertibleMark,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "977",
   :fibo-fnd-rel-rel/hasTextualName "Convertible Mark",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Convertible Mark",
   :skos/definition #xsd/langString "the currency Convertible Mark@en"})

(def CordobaOro
  "the currency Cordoba Oro"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Nicaragua,
   :db/ident :fibo-fnd-acc-4217/CordobaOro,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "558",
   :fibo-fnd-rel-rel/hasTextualName "Cordoba Oro",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Cordoba Oro",
   :skos/definition #xsd/langString "the currency Cordoba Oro@en"})

(def CostaRicanColon
  "the currency Costa Rican Colon"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/CostaRica,
   :db/ident :fibo-fnd-acc-4217/CostaRicanColon,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "188",
   :fibo-fnd-rel-rel/hasTextualName "Costa Rican Colon",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Costa Rican Colon",
   :skos/definition #xsd/langString "the currency Costa Rican Colon@en"})

(def CubanPeso
  "the currency Cuban Peso"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Cuba,
   :db/ident :fibo-fnd-acc-4217/CubanPeso,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "192",
   :fibo-fnd-rel-rel/hasTextualName "Cuban Peso",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Cuban Peso",
   :skos/definition #xsd/langString "the currency Cuban Peso@en"})

(def CzechKoruna
  "the currency Czech Koruna"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Czechia,
   :db/ident :fibo-fnd-acc-4217/CzechKoruna,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "203",
   :fibo-fnd-rel-rel/hasTextualName "Czech Koruna",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Czech Koruna",
   :skos/definition #xsd/langString "the currency Czech Koruna@en"})

(def DJF
  "the currency identifier for Djibouti Franc"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/DjiboutiFranc,
   :cmns-id/identifies :fibo-fnd-acc-4217/DjiboutiFranc,
   :db/ident :fibo-fnd-acc-4217/DJF,
   :fibo-fnd-rel-rel/hasTag "DJF",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "DJF",
   :skos/definition #xsd/langString
                     "the currency identifier for Djibouti Franc@en"})

(def DKK
  "the currency identifier for Danish Krone"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/DanishKrone,
   :cmns-id/identifies :fibo-fnd-acc-4217/DanishKrone,
   :db/ident :fibo-fnd-acc-4217/DKK,
   :fibo-fnd-rel-rel/hasTag "DKK",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "DKK",
   :skos/definition #xsd/langString
                     "the currency identifier for Danish Krone@en"})

(def DOP
  "the currency identifier for Dominican Peso"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/DominicanPeso,
   :cmns-id/identifies :fibo-fnd-acc-4217/DominicanPeso,
   :db/ident :fibo-fnd-acc-4217/DOP,
   :fibo-fnd-rel-rel/hasTag "DOP",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "DOP",
   :skos/definition #xsd/langString
                     "the currency identifier for Dominican Peso@en"})

(def DZD
  "the currency identifier for Algerian Dinar"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/AlgerianDinar,
   :cmns-id/identifies :fibo-fnd-acc-4217/AlgerianDinar,
   :db/ident :fibo-fnd-acc-4217/DZD,
   :fibo-fnd-rel-rel/hasTag "DZD",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "DZD",
   :skos/definition #xsd/langString
                     "the currency identifier for Algerian Dinar@en"})

(def Dalasi
  "the currency Dalasi"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Gambia,
   :db/ident :fibo-fnd-acc-4217/Dalasi,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "270",
   :fibo-fnd-rel-rel/hasTextualName "Dalasi",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Dalasi",
   :skos/definition #xsd/langString "the currency Dalasi@en"})

(def DanishKrone
  "the currency Danish Krone"
  {:cmns-cxtdsg/isUsedBy
   [:lcc-3166-1/FaroeIslands :lcc-3166-1/Denmark :lcc-3166-1/Greenland],
   :db/ident :fibo-fnd-acc-4217/DanishKrone,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "208",
   :fibo-fnd-rel-rel/hasTextualName "Danish Krone",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-acc-cur/Currency],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Danish Krone",
   :skos/definition #xsd/langString "the currency Danish Krone@en"})

(def Denar
  "the currency Denar"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/NorthMacedonia,
   :db/ident :fibo-fnd-acc-4217/Denar,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "807",
   :fibo-fnd-rel-rel/hasTextualName "Denar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Denar",
   :skos/definition #xsd/langString "the currency Denar@en"})

(def DjiboutiFranc
  "the currency Djibouti Franc"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Djibouti,
   :db/ident :fibo-fnd-acc-4217/DjiboutiFranc,
   :fibo-fnd-acc-cur/hasMinorUnit "0",
   :fibo-fnd-acc-cur/hasNumericCode "262",
   :fibo-fnd-rel-rel/hasTextualName "Djibouti Franc",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Djibouti Franc",
   :skos/definition #xsd/langString "the currency Djibouti Franc@en"})

(def Dobra
  "the currency Dobra"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/SaoTomeAndPrincipe,
   :db/ident :fibo-fnd-acc-4217/Dobra,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "930",
   :fibo-fnd-rel-rel/hasTextualName "Dobra",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Dobra",
   :skos/definition #xsd/langString "the currency Dobra@en"})

(def DominicanPeso
  "the currency Dominican Peso"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/DominicanRepublic,
   :db/ident :fibo-fnd-acc-4217/DominicanPeso,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "214",
   :fibo-fnd-rel-rel/hasTextualName "Dominican Peso",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Dominican Peso",
   :skos/definition #xsd/langString "the currency Dominican Peso@en"})

(def Dong
  "the currency Dong"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/VietNam,
   :db/ident :fibo-fnd-acc-4217/Dong,
   :fibo-fnd-acc-cur/hasMinorUnit "0",
   :fibo-fnd-acc-cur/hasNumericCode "704",
   :fibo-fnd-rel-rel/hasTextualName "Dong",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Dong",
   :skos/definition #xsd/langString "the currency Dong@en"})

(def EGP
  "the currency identifier for Egyptian Pound"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/EgyptianPound,
   :cmns-id/identifies :fibo-fnd-acc-4217/EgyptianPound,
   :db/ident :fibo-fnd-acc-4217/EGP,
   :fibo-fnd-rel-rel/hasTag "EGP",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "EGP",
   :skos/definition #xsd/langString
                     "the currency identifier for Egyptian Pound@en"})

(def ERN
  "the currency identifier for Nakfa"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/Nakfa,
   :cmns-id/identifies :fibo-fnd-acc-4217/Nakfa,
   :db/ident :fibo-fnd-acc-4217/ERN,
   :fibo-fnd-rel-rel/hasTag "ERN",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "ERN",
   :skos/definition #xsd/langString "the currency identifier for Nakfa@en"})

(def ETB
  "the currency identifier for Ethiopian Birr"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/EthiopianBirr,
   :cmns-id/identifies :fibo-fnd-acc-4217/EthiopianBirr,
   :db/ident :fibo-fnd-acc-4217/ETB,
   :fibo-fnd-rel-rel/hasTag "ETB",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "ETB",
   :skos/definition #xsd/langString
                     "the currency identifier for Ethiopian Birr@en"})

(def EUR
  "the currency identifier for Euro"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/Euro,
   :cmns-id/identifies :fibo-fnd-acc-4217/Euro,
   :db/ident :fibo-fnd-acc-4217/EUR,
   :fibo-fnd-rel-rel/hasTag "EUR",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "EUR",
   :skos/definition #xsd/langString "the currency identifier for Euro@en"})

(def EastCaribbeanDollar
  "the currency East Caribbean Dollar"
  {:cmns-cxtdsg/isUsedBy [:lcc-3166-1/SaintLucia
                          :lcc-3166-1/AntiguaAndBarbuda
                          :lcc-3166-1/SaintVincentAndTheGrenadines
                          :lcc-3166-1/Montserrat
                          :lcc-3166-1/SaintKittsAndNevis
                          :lcc-3166-1/Grenada
                          :lcc-3166-1/Anguilla
                          :lcc-3166-1/Dominica],
   :db/ident :fibo-fnd-acc-4217/EastCaribbeanDollar,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "951",
   :fibo-fnd-rel-rel/hasTextualName "East Caribbean Dollar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "East Caribbean Dollar",
   :skos/definition #xsd/langString "the currency East Caribbean Dollar@en"})

(def EgyptianPound
  "the currency Egyptian Pound"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Egypt,
   :db/ident :fibo-fnd-acc-4217/EgyptianPound,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "818",
   :fibo-fnd-rel-rel/hasTextualName "Egyptian Pound",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Egyptian Pound",
   :skos/definition #xsd/langString "the currency Egyptian Pound@en"})

(def ElSalvadorColon
  "the currency El Salvador Colon"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/ElSalvador,
   :db/ident :fibo-fnd-acc-4217/ElSalvadorColon,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "222",
   :fibo-fnd-rel-rel/hasTextualName "El Salvador Colon",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "El Salvador Colon",
   :skos/definition #xsd/langString "the currency El Salvador Colon@en"})

(def EthiopianBirr
  "the currency Ethiopian Birr"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Ethiopia,
   :db/ident :fibo-fnd-acc-4217/EthiopianBirr,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "230",
   :fibo-fnd-rel-rel/hasTextualName "Ethiopian Birr",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Ethiopian Birr",
   :skos/definition #xsd/langString "the currency Ethiopian Birr@en"})

(def Euro
  "the currency Euro"
  {:cmns-cxtdsg/isUsedBy [:lcc-3166-1/Latvia
                          :lcc-3166-1/Portugal
                          :lcc-3166-1/Italy
                          :lcc-3166-1/Greece
                          :lcc-3166-1/Martinique
                          :lcc-3166-1/HolySee
                          :lcc-3166-1/SaintMartin
                          :lcc-3166-1/Malta
                          :lcc-3166-1/SaintBarthelemy
                          :lcc-3166-1/Ireland
                          :lcc-3166-1/Monaco
                          :lcc-3166-1/Croatia
                          :lcc-3166-1/Mayotte
                          :lcc-3166-1/Netherlands
                          :lcc-3166-1/Slovakia
                          :lcc-3166-1/FrenchGuiana
                          :lcc-3166-1/SaintPierreAndMiquelon
                          :lcc-3166-1/Luxembourg
                          :lcc-3166-1/Slovenia
                          :lcc-3166-1/Spain
                          :lcc-3166-1/Montenegro
                          :lcc-3166-1/Andorra
                          :lcc-3166-1/FrenchSouthernTerritories
                          :lcc-3166-1/France
                          :lcc-3166-1/Reunion
                          :lcc-3166-1/Belgium
                          :lcc-3166-1/Lithuania
                          :lcc-3166-1/SanMarino
                          :lcc-3166-1/Cyprus
                          :lcc-3166-1/Germany
                          :lcc-3166-1/Austria
                          :lcc-3166-1/Estonia
                          :lcc-3166-1/Guadeloupe
                          :lcc-3166-1/AlandIslands
                          :lcc-3166-1/Finland],
   :db/ident :fibo-fnd-acc-4217/Euro,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "978",
   :fibo-fnd-rel-rel/hasTextualName "Euro",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-acc-cur/Currency],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Euro",
   :skos/definition #xsd/langString "the currency Euro@en"})

(def FJD
  "the currency identifier for Fiji Dollar"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/FijiDollar,
   :cmns-id/identifies :fibo-fnd-acc-4217/FijiDollar,
   :db/ident :fibo-fnd-acc-4217/FJD,
   :fibo-fnd-rel-rel/hasTag "FJD",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "FJD",
   :skos/definition #xsd/langString
                     "the currency identifier for Fiji Dollar@en"})

(def FKP
  "the currency identifier for Falkland Islands Pound"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/FalklandIslandsPound,
   :cmns-id/identifies :fibo-fnd-acc-4217/FalklandIslandsPound,
   :db/ident :fibo-fnd-acc-4217/FKP,
   :fibo-fnd-rel-rel/hasTag "FKP",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "FKP",
   :skos/definition #xsd/langString
                     "the currency identifier for Falkland Islands Pound@en"})

(def FalklandIslandsPound
  "the currency Falkland Islands Pound"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/FalklandIslands,
   :db/ident :fibo-fnd-acc-4217/FalklandIslandsPound,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "238",
   :fibo-fnd-rel-rel/hasTextualName "Falkland Islands Pound",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Falkland Islands Pound",
   :skos/definition #xsd/langString "the currency Falkland Islands Pound@en"})

(def FijiDollar
  "the currency Fiji Dollar"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Fiji,
   :db/ident :fibo-fnd-acc-4217/FijiDollar,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "242",
   :fibo-fnd-rel-rel/hasTextualName "Fiji Dollar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Fiji Dollar",
   :skos/definition #xsd/langString "the currency Fiji Dollar@en"})

(def Forint
  "the currency Forint"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Hungary,
   :db/ident :fibo-fnd-acc-4217/Forint,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "348",
   :fibo-fnd-rel-rel/hasTextualName "Forint",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Forint",
   :skos/definition #xsd/langString "the currency Forint@en"})

(def GBP
  "the currency identifier for Pound Sterling"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/PoundSterling,
   :cmns-id/identifies :fibo-fnd-acc-4217/PoundSterling,
   :db/ident :fibo-fnd-acc-4217/GBP,
   :fibo-fnd-rel-rel/hasTag "GBP",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "GBP",
   :skos/definition #xsd/langString
                     "the currency identifier for Pound Sterling@en"})

(def GEL
  "the currency identifier for Lari"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/Lari,
   :cmns-id/identifies :fibo-fnd-acc-4217/Lari,
   :db/ident :fibo-fnd-acc-4217/GEL,
   :fibo-fnd-rel-rel/hasTag "GEL",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "GEL",
   :skos/definition #xsd/langString "the currency identifier for Lari@en"})

(def GHS
  "the currency identifier for Ghana Cedi"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/GhanaCedi,
   :cmns-id/identifies :fibo-fnd-acc-4217/GhanaCedi,
   :db/ident :fibo-fnd-acc-4217/GHS,
   :fibo-fnd-rel-rel/hasTag "GHS",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "GHS",
   :skos/definition #xsd/langString
                     "the currency identifier for Ghana Cedi@en"})

(def GIP
  "the currency identifier for Gibraltar Pound"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/GibraltarPound,
   :cmns-id/identifies :fibo-fnd-acc-4217/GibraltarPound,
   :db/ident :fibo-fnd-acc-4217/GIP,
   :fibo-fnd-rel-rel/hasTag "GIP",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "GIP",
   :skos/definition #xsd/langString
                     "the currency identifier for Gibraltar Pound@en"})

(def GMD
  "the currency identifier for Dalasi"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/Dalasi,
   :cmns-id/identifies :fibo-fnd-acc-4217/Dalasi,
   :db/ident :fibo-fnd-acc-4217/GMD,
   :fibo-fnd-rel-rel/hasTag "GMD",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "GMD",
   :skos/definition #xsd/langString "the currency identifier for Dalasi@en"})

(def GNF
  "the currency identifier for Guinean Franc"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/GuineanFranc,
   :cmns-id/identifies :fibo-fnd-acc-4217/GuineanFranc,
   :db/ident :fibo-fnd-acc-4217/GNF,
   :fibo-fnd-rel-rel/hasTag "GNF",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "GNF",
   :skos/definition #xsd/langString
                     "the currency identifier for Guinean Franc@en"})

(def GTQ
  "the currency identifier for Quetzal"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/Quetzal,
   :cmns-id/identifies :fibo-fnd-acc-4217/Quetzal,
   :db/ident :fibo-fnd-acc-4217/GTQ,
   :fibo-fnd-rel-rel/hasTag "GTQ",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "GTQ",
   :skos/definition #xsd/langString "the currency identifier for Quetzal@en"})

(def GYD
  "the currency identifier for Guyana Dollar"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/GuyanaDollar,
   :cmns-id/identifies :fibo-fnd-acc-4217/GuyanaDollar,
   :db/ident :fibo-fnd-acc-4217/GYD,
   :fibo-fnd-rel-rel/hasTag "GYD",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "GYD",
   :skos/definition #xsd/langString
                     "the currency identifier for Guyana Dollar@en"})

(def GhanaCedi
  "the currency Ghana Cedi"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Ghana,
   :db/ident :fibo-fnd-acc-4217/GhanaCedi,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "936",
   :fibo-fnd-rel-rel/hasTextualName "Ghana Cedi",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Ghana Cedi",
   :skos/definition #xsd/langString "the currency Ghana Cedi@en"})

(def GibraltarPound
  "the currency Gibraltar Pound"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Gibraltar,
   :db/ident :fibo-fnd-acc-4217/GibraltarPound,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "292",
   :fibo-fnd-rel-rel/hasTextualName "Gibraltar Pound",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Gibraltar Pound",
   :skos/definition #xsd/langString "the currency Gibraltar Pound@en"})

(def Gold
  "the currency whose unit is one troy ounce of the precious metal Gold"
  {:db/ident :fibo-fnd-acc-4217/Gold,
   :fibo-fnd-acc-cur/hasNumericCode "959",
   :fibo-fnd-rel-rel/hasTextualName "Gold",
   :rdf/type [:fibo-fnd-acc-cur/PreciousMetal :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Gold",
   :skos/definition
   #xsd/langString
    "the currency whose unit is one troy ounce of the precious metal Gold@en"})

(def Gourde
  "the currency Gourde"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Haiti,
   :db/ident :fibo-fnd-acc-4217/Gourde,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "332",
   :fibo-fnd-rel-rel/hasTextualName "Gourde",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Gourde",
   :skos/definition #xsd/langString "the currency Gourde@en"})

(def Guarani
  "the currency Guarani"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Paraguay,
   :db/ident :fibo-fnd-acc-4217/Guarani,
   :fibo-fnd-acc-cur/hasMinorUnit "0",
   :fibo-fnd-acc-cur/hasNumericCode "600",
   :fibo-fnd-rel-rel/hasTextualName "Guarani",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Guarani",
   :skos/definition #xsd/langString "the currency Guarani@en"})

(def GuineanFranc
  "the currency Guinean Franc"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Guinea,
   :db/ident :fibo-fnd-acc-4217/GuineanFranc,
   :fibo-fnd-acc-cur/hasMinorUnit "0",
   :fibo-fnd-acc-cur/hasNumericCode "324",
   :fibo-fnd-rel-rel/hasTextualName "Guinean Franc",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Guinean Franc",
   :skos/definition #xsd/langString "the currency Guinean Franc@en"})

(def GuyanaDollar
  "the currency Guyana Dollar"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Guyana,
   :db/ident :fibo-fnd-acc-4217/GuyanaDollar,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "328",
   :fibo-fnd-rel-rel/hasTextualName "Guyana Dollar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Guyana Dollar",
   :skos/definition #xsd/langString "the currency Guyana Dollar@en"})

(def HKD
  "the currency identifier for Hong Kong Dollar"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/HongKongDollar,
   :cmns-id/identifies :fibo-fnd-acc-4217/HongKongDollar,
   :db/ident :fibo-fnd-acc-4217/HKD,
   :fibo-fnd-rel-rel/hasTag "HKD",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "HKD",
   :skos/definition #xsd/langString
                     "the currency identifier for Hong Kong Dollar@en"})

(def HNL
  "the currency identifier for Lempira"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/Lempira,
   :cmns-id/identifies :fibo-fnd-acc-4217/Lempira,
   :db/ident :fibo-fnd-acc-4217/HNL,
   :fibo-fnd-rel-rel/hasTag "HNL",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "HNL",
   :skos/definition #xsd/langString "the currency identifier for Lempira@en"})

(def HRK
  "the currency identifier for Kuna"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/Kuna,
   :cmns-id/identifies :fibo-fnd-acc-4217/Kuna,
   :db/ident :fibo-fnd-acc-4217/HRK,
   :fibo-fnd-rel-rel/hasTag "HRK",
   :owl/deprecated true,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-acc-cur/CurrencyIdentifier],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "HRK",
   :skos/definition #xsd/langString "the currency identifier for Kuna@en"})

(def HTG
  "the currency identifier for Gourde"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/Gourde,
   :cmns-id/identifies :fibo-fnd-acc-4217/Gourde,
   :db/ident :fibo-fnd-acc-4217/HTG,
   :fibo-fnd-rel-rel/hasTag "HTG",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "HTG",
   :skos/definition #xsd/langString "the currency identifier for Gourde@en"})

(def HUF
  "the currency identifier for Forint"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/Forint,
   :cmns-id/identifies :fibo-fnd-acc-4217/Forint,
   :db/ident :fibo-fnd-acc-4217/HUF,
   :fibo-fnd-rel-rel/hasTag "HUF",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "HUF",
   :skos/definition #xsd/langString "the currency identifier for Forint@en"})

(def HongKongDollar
  "the currency Hong Kong Dollar"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/HongKong,
   :db/ident :fibo-fnd-acc-4217/HongKongDollar,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "344",
   :fibo-fnd-rel-rel/hasTextualName "Hong Kong Dollar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Hong Kong Dollar",
   :skos/definition #xsd/langString "the currency Hong Kong Dollar@en"})

(def Hryvnia
  "the currency Hryvnia"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Ukraine,
   :db/ident :fibo-fnd-acc-4217/Hryvnia,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "980",
   :fibo-fnd-rel-rel/hasTextualName "Hryvnia",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Hryvnia",
   :skos/definition #xsd/langString "the currency Hryvnia@en"})

(def IDR
  "the currency identifier for Rupiah"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/Rupiah,
   :cmns-id/identifies :fibo-fnd-acc-4217/Rupiah,
   :db/ident :fibo-fnd-acc-4217/IDR,
   :fibo-fnd-rel-rel/hasTag "IDR",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "IDR",
   :skos/definition #xsd/langString "the currency identifier for Rupiah@en"})

(def ILS
  "the currency identifier for New Israeli Sheqel"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/NewIsraeliSheqel,
   :cmns-id/identifies :fibo-fnd-acc-4217/NewIsraeliSheqel,
   :db/ident :fibo-fnd-acc-4217/ILS,
   :fibo-fnd-rel-rel/hasTag "ILS",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "ILS",
   :skos/definition #xsd/langString
                     "the currency identifier for New Israeli Sheqel@en"})

(def INR
  "the currency identifier for Indian Rupee"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/IndianRupee,
   :cmns-id/identifies :fibo-fnd-acc-4217/IndianRupee,
   :db/ident :fibo-fnd-acc-4217/INR,
   :fibo-fnd-rel-rel/hasTag "INR",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "INR",
   :skos/definition #xsd/langString
                     "the currency identifier for Indian Rupee@en"})

(def IQD
  "the currency identifier for Iraqi Dinar"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/IraqiDinar,
   :cmns-id/identifies :fibo-fnd-acc-4217/IraqiDinar,
   :db/ident :fibo-fnd-acc-4217/IQD,
   :fibo-fnd-rel-rel/hasTag "IQD",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "IQD",
   :skos/definition #xsd/langString
                     "the currency identifier for Iraqi Dinar@en"})

(def IRR
  "the currency identifier for Iranian Rial"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/IranianRial,
   :cmns-id/identifies :fibo-fnd-acc-4217/IranianRial,
   :db/ident :fibo-fnd-acc-4217/IRR,
   :fibo-fnd-rel-rel/hasTag "IRR",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "IRR",
   :skos/definition #xsd/langString
                     "the currency identifier for Iranian Rial@en"})

(def ISK
  "the currency identifier for Iceland Krona"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/IcelandKrona,
   :cmns-id/identifies :fibo-fnd-acc-4217/IcelandKrona,
   :db/ident :fibo-fnd-acc-4217/ISK,
   :fibo-fnd-rel-rel/hasTag "ISK",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "ISK",
   :skos/definition #xsd/langString
                     "the currency identifier for Iceland Krona@en"})

(def ISO4217-CodeSet
  "the set of currency identifiers that comprise the ISO 4217 specification"
  {:db/ident :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :rdf/type
   [:cmns-id/IdentificationScheme :cmns-cds/CodeSet :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "ISO 4217 code set",
   :skos/definition
   "the set of currency identifiers that comprise the ISO 4217 specification"})

(def IcelandKrona
  "the currency Iceland Krona"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Iceland,
   :db/ident :fibo-fnd-acc-4217/IcelandKrona,
   :fibo-fnd-acc-cur/hasMinorUnit "0",
   :fibo-fnd-acc-cur/hasNumericCode "352",
   :fibo-fnd-rel-rel/hasTextualName "Iceland Krona",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Iceland Krona",
   :skos/definition #xsd/langString "the currency Iceland Krona@en"})

(def IndianRupee
  "the currency Indian Rupee"
  {:cmns-cxtdsg/isUsedBy [:lcc-3166-1/India :lcc-3166-1/Bhutan],
   :db/ident :fibo-fnd-acc-4217/IndianRupee,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "356",
   :fibo-fnd-rel-rel/hasTextualName "Indian Rupee",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Indian Rupee",
   :skos/definition #xsd/langString "the currency Indian Rupee@en"})

(def IranianRial
  "the currency Iranian Rial"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Iran,
   :db/ident :fibo-fnd-acc-4217/IranianRial,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "364",
   :fibo-fnd-rel-rel/hasTextualName "Iranian Rial",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Iranian Rial",
   :skos/definition #xsd/langString "the currency Iranian Rial@en"})

(def IraqiDinar
  "the currency Iraqi Dinar"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Iraq,
   :db/ident :fibo-fnd-acc-4217/IraqiDinar,
   :fibo-fnd-acc-cur/hasMinorUnit "3",
   :fibo-fnd-acc-cur/hasNumericCode "368",
   :fibo-fnd-rel-rel/hasTextualName "Iraqi Dinar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Iraqi Dinar",
   :skos/definition #xsd/langString "the currency Iraqi Dinar@en"})

(def JMD
  "the currency identifier for Jamaican Dollar"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/JamaicanDollar,
   :cmns-id/identifies :fibo-fnd-acc-4217/JamaicanDollar,
   :db/ident :fibo-fnd-acc-4217/JMD,
   :fibo-fnd-rel-rel/hasTag "JMD",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "JMD",
   :skos/definition #xsd/langString
                     "the currency identifier for Jamaican Dollar@en"})

(def JOD
  "the currency identifier for Jordanian Dinar"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/JordanianDinar,
   :cmns-id/identifies :fibo-fnd-acc-4217/JordanianDinar,
   :db/ident :fibo-fnd-acc-4217/JOD,
   :fibo-fnd-rel-rel/hasTag "JOD",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "JOD",
   :skos/definition #xsd/langString
                     "the currency identifier for Jordanian Dinar@en"})

(def JPY
  "the currency identifier for Yen"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/Yen,
   :cmns-id/identifies :fibo-fnd-acc-4217/Yen,
   :db/ident :fibo-fnd-acc-4217/JPY,
   :fibo-fnd-rel-rel/hasTag "JPY",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "JPY",
   :skos/definition #xsd/langString "the currency identifier for Yen@en"})

(def JamaicanDollar
  "the currency Jamaican Dollar"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Jamaica,
   :db/ident :fibo-fnd-acc-4217/JamaicanDollar,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "388",
   :fibo-fnd-rel-rel/hasTextualName "Jamaican Dollar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Jamaican Dollar",
   :skos/definition #xsd/langString "the currency Jamaican Dollar@en"})

(def JordanianDinar
  "the currency Jordanian Dinar"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Jordan,
   :db/ident :fibo-fnd-acc-4217/JordanianDinar,
   :fibo-fnd-acc-cur/hasMinorUnit "3",
   :fibo-fnd-acc-cur/hasNumericCode "400",
   :fibo-fnd-rel-rel/hasTextualName "Jordanian Dinar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Jordanian Dinar",
   :skos/definition #xsd/langString "the currency Jordanian Dinar@en"})

(def KES
  "the currency identifier for Kenyan Shilling"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/KenyanShilling,
   :cmns-id/identifies :fibo-fnd-acc-4217/KenyanShilling,
   :db/ident :fibo-fnd-acc-4217/KES,
   :fibo-fnd-rel-rel/hasTag "KES",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "KES",
   :skos/definition #xsd/langString
                     "the currency identifier for Kenyan Shilling@en"})

(def KGS
  "the currency identifier for Som"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/Som,
   :cmns-id/identifies :fibo-fnd-acc-4217/Som,
   :db/ident :fibo-fnd-acc-4217/KGS,
   :fibo-fnd-rel-rel/hasTag "KGS",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "KGS",
   :skos/definition #xsd/langString "the currency identifier for Som@en"})

(def KHR
  "the currency identifier for Riel"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/Riel,
   :cmns-id/identifies :fibo-fnd-acc-4217/Riel,
   :db/ident :fibo-fnd-acc-4217/KHR,
   :fibo-fnd-rel-rel/hasTag "KHR",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "KHR",
   :skos/definition #xsd/langString "the currency identifier for Riel@en"})

(def KMF
  "the currency identifier for Comorian Franc"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/ComorianFranc,
   :cmns-id/identifies :fibo-fnd-acc-4217/ComorianFranc,
   :db/ident :fibo-fnd-acc-4217/KMF,
   :fibo-fnd-rel-rel/hasTag "KMF",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "KMF",
   :skos/definition #xsd/langString
                     "the currency identifier for Comorian Franc@en"})

(def KPW
  "the currency identifier for North Korean Won"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/NorthKoreanWon,
   :cmns-id/identifies :fibo-fnd-acc-4217/NorthKoreanWon,
   :db/ident :fibo-fnd-acc-4217/KPW,
   :fibo-fnd-rel-rel/hasTag "KPW",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "KPW",
   :skos/definition #xsd/langString
                     "the currency identifier for North Korean Won@en"})

(def KRW
  "the currency identifier for Won"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/Won,
   :cmns-id/identifies :fibo-fnd-acc-4217/Won,
   :db/ident :fibo-fnd-acc-4217/KRW,
   :fibo-fnd-rel-rel/hasTag "KRW",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "KRW",
   :skos/definition #xsd/langString "the currency identifier for Won@en"})

(def KWD
  "the currency identifier for Kuwaiti Dinar"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/KuwaitiDinar,
   :cmns-id/identifies :fibo-fnd-acc-4217/KuwaitiDinar,
   :db/ident :fibo-fnd-acc-4217/KWD,
   :fibo-fnd-rel-rel/hasTag "KWD",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "KWD",
   :skos/definition #xsd/langString
                     "the currency identifier for Kuwaiti Dinar@en"})

(def KYD
  "the currency identifier for Cayman Islands Dollar"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/CaymanIslandsDollar,
   :cmns-id/identifies :fibo-fnd-acc-4217/CaymanIslandsDollar,
   :db/ident :fibo-fnd-acc-4217/KYD,
   :fibo-fnd-rel-rel/hasTag "KYD",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "KYD",
   :skos/definition #xsd/langString
                     "the currency identifier for Cayman Islands Dollar@en"})

(def KZT
  "the currency identifier for Tenge"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/Tenge,
   :cmns-id/identifies :fibo-fnd-acc-4217/Tenge,
   :db/ident :fibo-fnd-acc-4217/KZT,
   :fibo-fnd-rel-rel/hasTag "KZT",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "KZT",
   :skos/definition #xsd/langString "the currency identifier for Tenge@en"})

(def KenyanShilling
  "the currency Kenyan Shilling"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Kenya,
   :db/ident :fibo-fnd-acc-4217/KenyanShilling,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "404",
   :fibo-fnd-rel-rel/hasTextualName "Kenyan Shilling",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Kenyan Shilling",
   :skos/definition #xsd/langString "the currency Kenyan Shilling@en"})

(def Kina
  "the currency Kina"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/PapuaNewGuinea,
   :db/ident :fibo-fnd-acc-4217/Kina,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "598",
   :fibo-fnd-rel-rel/hasTextualName "Kina",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Kina",
   :skos/definition #xsd/langString "the currency Kina@en"})

(def Kuna
  "the currency Kuna"
  {:cmns-av/explanatoryNote
   "The Kuna (HRK) will be retained in FIBO at least through 2023 due to the possibility of dual listing and to support instrument pricing that predated this change.",
   :cmns-cxtdsg/isUsedBy :lcc-3166-1/Croatia,
   :db/ident :fibo-fnd-acc-4217/Kuna,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "191",
   :fibo-fnd-rel-rel/hasTextualName "Kuna",
   :owl/deprecated true,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-acc-cur/Currency],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Kuna",
   :skos/definition #xsd/langString "the currency Kuna@en",
   :skos/note
   "Effective 1 Jan 2023, Croatia will use the Euro as its primary currency. The Kuna (HRK) and Euro (EUR) will be used during the parallel circulation period from 1 January 2023 to 14 January 2023 inclusive. The period of mandatory dual price display lasts from 5 September 2022 to 31 December 2023. As of 1 January 2023, the Kuna should be listed as the old/historic currency of Croatia. The exchange rate is fixed at EUR 1 = HRK 7.53450"})

(def KuwaitiDinar
  "the currency Kuwaiti Dinar"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Kuwait,
   :db/ident :fibo-fnd-acc-4217/KuwaitiDinar,
   :fibo-fnd-acc-cur/hasMinorUnit "3",
   :fibo-fnd-acc-cur/hasNumericCode "414",
   :fibo-fnd-rel-rel/hasTextualName "Kuwaiti Dinar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Kuwaiti Dinar",
   :skos/definition #xsd/langString "the currency Kuwaiti Dinar@en"})

(def Kwanza
  "the currency Kwanza"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Angola,
   :db/ident :fibo-fnd-acc-4217/Kwanza,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "973",
   :fibo-fnd-rel-rel/hasTextualName "Kwanza",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Kwanza",
   :skos/definition #xsd/langString "the currency Kwanza@en"})

(def Kyat
  "the currency Kyat"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Myanmar,
   :db/ident :fibo-fnd-acc-4217/Kyat,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "104",
   :fibo-fnd-rel-rel/hasTextualName "Kyat",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Kyat",
   :skos/definition #xsd/langString "the currency Kyat@en"})

(def LAK
  "the currency identifier for Lao Kip"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/LaoKip,
   :cmns-id/identifies :fibo-fnd-acc-4217/LaoKip,
   :db/ident :fibo-fnd-acc-4217/LAK,
   :fibo-fnd-rel-rel/hasTag "LAK",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "LAK",
   :skos/definition #xsd/langString "the currency identifier for Lao Kip@en"})

(def LBP
  "the currency identifier for Lebanese Pound"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/LebanesePound,
   :cmns-id/identifies :fibo-fnd-acc-4217/LebanesePound,
   :db/ident :fibo-fnd-acc-4217/LBP,
   :fibo-fnd-rel-rel/hasTag "LBP",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "LBP",
   :skos/definition #xsd/langString
                     "the currency identifier for Lebanese Pound@en"})

(def LKR
  "the currency identifier for Sri Lanka Rupee"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/SriLankaRupee,
   :cmns-id/identifies :fibo-fnd-acc-4217/SriLankaRupee,
   :db/ident :fibo-fnd-acc-4217/LKR,
   :fibo-fnd-rel-rel/hasTag "LKR",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "LKR",
   :skos/definition #xsd/langString
                     "the currency identifier for Sri Lanka Rupee@en"})

(def LRD
  "the currency identifier for Liberian Dollar"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/LiberianDollar,
   :cmns-id/identifies :fibo-fnd-acc-4217/LiberianDollar,
   :db/ident :fibo-fnd-acc-4217/LRD,
   :fibo-fnd-rel-rel/hasTag "LRD",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "LRD",
   :skos/definition #xsd/langString
                     "the currency identifier for Liberian Dollar@en"})

(def LSL
  "the currency identifier for Loti"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/Loti,
   :cmns-id/identifies :fibo-fnd-acc-4217/Loti,
   :db/ident :fibo-fnd-acc-4217/LSL,
   :fibo-fnd-rel-rel/hasTag "LSL",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "LSL",
   :skos/definition #xsd/langString "the currency identifier for Loti@en"})

(def LYD
  "the currency identifier for Libyan Dinar"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/LibyanDinar,
   :cmns-id/identifies :fibo-fnd-acc-4217/LibyanDinar,
   :db/ident :fibo-fnd-acc-4217/LYD,
   :fibo-fnd-rel-rel/hasTag "LYD",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "LYD",
   :skos/definition #xsd/langString
                     "the currency identifier for Libyan Dinar@en"})

(def LaoKip
  "the currency Lao Kip"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/LaoPeoplesDemocraticRepublic,
   :db/ident :fibo-fnd-acc-4217/LaoKip,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "418",
   :fibo-fnd-rel-rel/hasTextualName "Lao Kip",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Lao Kip",
   :skos/definition #xsd/langString "the currency Lao Kip@en"})

(def Lari
  "the currency Lari"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Georgia,
   :db/ident :fibo-fnd-acc-4217/Lari,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "981",
   :fibo-fnd-rel-rel/hasTextualName "Lari",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Lari",
   :skos/definition #xsd/langString "the currency Lari@en"})

(def LebanesePound
  "the currency Lebanese Pound"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Lebanon,
   :db/ident :fibo-fnd-acc-4217/LebanesePound,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "422",
   :fibo-fnd-rel-rel/hasTextualName "Lebanese Pound",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Lebanese Pound",
   :skos/definition #xsd/langString "the currency Lebanese Pound@en"})

(def Lek
  "the currency Lek"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Albania,
   :db/ident :fibo-fnd-acc-4217/Lek,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "008",
   :fibo-fnd-rel-rel/hasTextualName "Lek",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Lek",
   :skos/definition #xsd/langString "the currency Lek@en"})

(def Lempira
  "the currency Lempira"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Honduras,
   :db/ident :fibo-fnd-acc-4217/Lempira,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "340",
   :fibo-fnd-rel-rel/hasTextualName "Lempira",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Lempira",
   :skos/definition #xsd/langString "the currency Lempira@en"})

(def Leone
  "the currency Leone"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/SierraLeone,
   :db/ident :fibo-fnd-acc-4217/Leone,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode ["925" "694"],
   :fibo-fnd-rel-rel/hasTextualName "Leone",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Leone",
   :skos/definition #xsd/langString "the currency Leone@en",
   :skos/note
   "The Sierra Leonean LEONE (SLL) is redenominated by removing three (3) zeros from the denominations. A new currency code SLE/925 representing the new valuation (1,000 times old SLL/694) is introduced on 1st April 2022 for any internal needs during the redenomination process, and is replacing SLL as the official currency code, after the transition period to be determined. During this transition period, both the old Leone and new Leone will be in physical circulation for at least 90 days. The Bank of Sierra Leone will adopt the new code in the local system but SLL/694 shall remain in use until further notice. The Sierra Leonean currency shall continue to be the LEONE and this will not change after redenomination."})

(def LiberianDollar
  "the currency Liberian Dollar"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Liberia,
   :db/ident :fibo-fnd-acc-4217/LiberianDollar,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "430",
   :fibo-fnd-rel-rel/hasTextualName "Liberian Dollar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Liberian Dollar",
   :skos/definition #xsd/langString "the currency Liberian Dollar@en"})

(def LibyanDinar
  "the currency Libyan Dinar"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Libya,
   :db/ident :fibo-fnd-acc-4217/LibyanDinar,
   :fibo-fnd-acc-cur/hasMinorUnit "3",
   :fibo-fnd-acc-cur/hasNumericCode "434",
   :fibo-fnd-rel-rel/hasTextualName "Libyan Dinar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Libyan Dinar",
   :skos/definition #xsd/langString "the currency Libyan Dinar@en"})

(def Lilangeni
  "the currency Lilangeni"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Eswatini,
   :db/ident :fibo-fnd-acc-4217/Lilangeni,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "748",
   :fibo-fnd-rel-rel/hasTextualName "Lilangeni",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Lilangeni",
   :skos/definition #xsd/langString "the currency Lilangeni@en"})

(def Loti
  "the currency Loti"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Lesotho,
   :db/ident :fibo-fnd-acc-4217/Loti,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "426",
   :fibo-fnd-rel-rel/hasTextualName "Loti",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Loti",
   :skos/definition #xsd/langString "the currency Loti@en"})

(def MAD
  "the currency identifier for Moroccan Dirham"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/MoroccanDirham,
   :cmns-id/identifies :fibo-fnd-acc-4217/MoroccanDirham,
   :db/ident :fibo-fnd-acc-4217/MAD,
   :fibo-fnd-rel-rel/hasTag "MAD",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "MAD",
   :skos/definition #xsd/langString
                     "the currency identifier for Moroccan Dirham@en"})

(def MDL
  "the currency identifier for Moldovan Leu"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/MoldovanLeu,
   :cmns-id/identifies :fibo-fnd-acc-4217/MoldovanLeu,
   :db/ident :fibo-fnd-acc-4217/MDL,
   :fibo-fnd-rel-rel/hasTag "MDL",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "MDL",
   :skos/definition #xsd/langString
                     "the currency identifier for Moldovan Leu@en"})

(def MGA
  "the currency identifier for Malagasy Ariary"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/MalagasyAriary,
   :cmns-id/identifies :fibo-fnd-acc-4217/MalagasyAriary,
   :db/ident :fibo-fnd-acc-4217/MGA,
   :fibo-fnd-rel-rel/hasTag "MGA",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "MGA",
   :skos/definition #xsd/langString
                     "the currency identifier for Malagasy Ariary@en"})

(def MKD
  "the currency identifier for Denar"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/Denar,
   :cmns-id/identifies :fibo-fnd-acc-4217/Denar,
   :db/ident :fibo-fnd-acc-4217/MKD,
   :fibo-fnd-rel-rel/hasTag "MKD",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "MKD",
   :skos/definition #xsd/langString "the currency identifier for Denar@en"})

(def MMK
  "the currency identifier for Kyat"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/Kyat,
   :cmns-id/identifies :fibo-fnd-acc-4217/Kyat,
   :db/ident :fibo-fnd-acc-4217/MMK,
   :fibo-fnd-rel-rel/hasTag "MMK",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "MMK",
   :skos/definition #xsd/langString "the currency identifier for Kyat@en"})

(def MNT
  "the currency identifier for Tugrik"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/Tugrik,
   :cmns-id/identifies :fibo-fnd-acc-4217/Tugrik,
   :db/ident :fibo-fnd-acc-4217/MNT,
   :fibo-fnd-rel-rel/hasTag "MNT",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "MNT",
   :skos/definition #xsd/langString "the currency identifier for Tugrik@en"})

(def MOP
  "the currency identifier for Pataca"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/Pataca,
   :cmns-id/identifies :fibo-fnd-acc-4217/Pataca,
   :db/ident :fibo-fnd-acc-4217/MOP,
   :fibo-fnd-rel-rel/hasTag "MOP",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "MOP",
   :skos/definition #xsd/langString "the currency identifier for Pataca@en"})

(def MRU
  "the currency identifier for Ouguiya"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/Ouguiya,
   :cmns-id/identifies :fibo-fnd-acc-4217/Ouguiya,
   :db/ident :fibo-fnd-acc-4217/MRU,
   :fibo-fnd-rel-rel/hasTag "MRU",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "MRU",
   :skos/definition #xsd/langString "the currency identifier for Ouguiya@en"})

(def MUR
  "the currency identifier for Mauritius Rupee"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/MauritiusRupee,
   :cmns-id/identifies :fibo-fnd-acc-4217/MauritiusRupee,
   :db/ident :fibo-fnd-acc-4217/MUR,
   :fibo-fnd-rel-rel/hasTag "MUR",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "MUR",
   :skos/definition #xsd/langString
                     "the currency identifier for Mauritius Rupee@en"})

(def MVR
  "the currency identifier for Rufiyaa"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/Rufiyaa,
   :cmns-id/identifies :fibo-fnd-acc-4217/Rufiyaa,
   :db/ident :fibo-fnd-acc-4217/MVR,
   :fibo-fnd-rel-rel/hasTag "MVR",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "MVR",
   :skos/definition #xsd/langString "the currency identifier for Rufiyaa@en"})

(def MWK
  "the currency identifier for Malawi Kwacha"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/MalawiKwacha,
   :cmns-id/identifies :fibo-fnd-acc-4217/MalawiKwacha,
   :db/ident :fibo-fnd-acc-4217/MWK,
   :fibo-fnd-rel-rel/hasTag "MWK",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "MWK",
   :skos/definition #xsd/langString
                     "the currency identifier for Malawi Kwacha@en"})

(def MXN
  "the currency identifier for Mexican Peso"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/MexicanPeso,
   :cmns-id/identifies :fibo-fnd-acc-4217/MexicanPeso,
   :db/ident :fibo-fnd-acc-4217/MXN,
   :fibo-fnd-rel-rel/hasTag "MXN",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "MXN",
   :skos/definition #xsd/langString
                     "the currency identifier for Mexican Peso@en"})

(def MXV
  "the funds identifier for Mexican Unidad de Inversion (UDI)"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/MexicanUnidaddeInversion_UDI,
   :cmns-id/identifies :fibo-fnd-acc-4217/MexicanUnidaddeInversion_UDI,
   :db/ident :fibo-fnd-acc-4217/MXV,
   :fibo-fnd-rel-rel/hasTag "MXV",
   :rdf/type [:fibo-fnd-acc-cur/FundsIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "MXV",
   :skos/definition
   #xsd/langString
    "the funds identifier for Mexican Unidad de Inversion (UDI)@en"})

(def MYR
  "the currency identifier for Malaysian Ringgit"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/MalaysianRinggit,
   :cmns-id/identifies :fibo-fnd-acc-4217/MalaysianRinggit,
   :db/ident :fibo-fnd-acc-4217/MYR,
   :fibo-fnd-rel-rel/hasTag "MYR",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "MYR",
   :skos/definition #xsd/langString
                     "the currency identifier for Malaysian Ringgit@en"})

(def MZN
  "the currency identifier for Mozambique Metical"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/MozambiqueMetical,
   :cmns-id/identifies :fibo-fnd-acc-4217/MozambiqueMetical,
   :db/ident :fibo-fnd-acc-4217/MZN,
   :fibo-fnd-rel-rel/hasTag "MZN",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "MZN",
   :skos/definition #xsd/langString
                     "the currency identifier for Mozambique Metical@en"})

(def MalagasyAriary
  "the currency Malagasy Ariary"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Madagascar,
   :db/ident :fibo-fnd-acc-4217/MalagasyAriary,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "969",
   :fibo-fnd-rel-rel/hasTextualName "Malagasy Ariary",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Malagasy Ariary",
   :skos/definition #xsd/langString "the currency Malagasy Ariary@en"})

(def MalawiKwacha
  "the currency Malawi Kwacha"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Malawi,
   :db/ident :fibo-fnd-acc-4217/MalawiKwacha,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "454",
   :fibo-fnd-rel-rel/hasTextualName "Malawi Kwacha",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Malawi Kwacha",
   :skos/definition #xsd/langString "the currency Malawi Kwacha@en"})

(def MalaysianRinggit
  "the currency Malaysian Ringgit"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Malaysia,
   :db/ident :fibo-fnd-acc-4217/MalaysianRinggit,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "458",
   :fibo-fnd-rel-rel/hasTextualName "Malaysian Ringgit",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Malaysian Ringgit",
   :skos/definition #xsd/langString "the currency Malaysian Ringgit@en"})

(def MauritiusRupee
  "the currency Mauritius Rupee"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Mauritius,
   :db/ident :fibo-fnd-acc-4217/MauritiusRupee,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "480",
   :fibo-fnd-rel-rel/hasTextualName "Mauritius Rupee",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Mauritius Rupee",
   :skos/definition #xsd/langString "the currency Mauritius Rupee@en"})

(def MexicanPeso
  "the currency Mexican Peso"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Mexico,
   :db/ident :fibo-fnd-acc-4217/MexicanPeso,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "484",
   :fibo-fnd-rel-rel/hasTextualName "Mexican Peso",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Mexican Peso",
   :skos/definition #xsd/langString "the currency Mexican Peso@en"})

(def MexicanUnidaddeInversion_UDI
  "the funds Mexican Unidad de Inversion (UDI)"
  {:cmns-av/explanatoryNote
   "The UDI is an inflation adjusted mechanism set by the Central Bank of Mexico according to the variation in the Mexican Consumer Price Index. The value of the UDI is expressed in terms of Mexican Pesos per UDI. It is used to denominate mortgage loans, some bank deposits with maturities of 3 month or more and Government bonds (UDIBONOS).",
   :cmns-cxtdsg/isUsedBy :lcc-3166-1/Mexico,
   :db/ident :fibo-fnd-acc-4217/MexicanUnidaddeInversion_UDI,
   :fibo-fnd-acc-cur/hasCurrency :fibo-fnd-acc-4217/MexicanPeso,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "979",
   :fibo-fnd-rel-rel/hasTextualName "Mexican Unidad de Inversion (UDI)",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-acc-cur/Funds],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Mexican Unidad de Inversion (UDI)",
   :skos/definition #xsd/langString
                     "the funds Mexican Unidad de Inversion (UDI)@en"})

(def MoldovanLeu
  "the currency Moldovan Leu"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Moldova,
   :db/ident :fibo-fnd-acc-4217/MoldovanLeu,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "498",
   :fibo-fnd-rel-rel/hasTextualName "Moldovan Leu",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Moldovan Leu",
   :skos/definition #xsd/langString "the currency Moldovan Leu@en"})

(def MoroccanDirham
  "the currency Moroccan Dirham"
  {:cmns-cxtdsg/isUsedBy [:lcc-3166-1/WesternSahara :lcc-3166-1/Morocco],
   :db/ident :fibo-fnd-acc-4217/MoroccanDirham,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "504",
   :fibo-fnd-rel-rel/hasTextualName "Moroccan Dirham",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-acc-cur/Currency],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Moroccan Dirham",
   :skos/definition #xsd/langString "the currency Moroccan Dirham@en"})

(def MozambiqueMetical
  "the currency Mozambique Metical"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Mozambique,
   :db/ident :fibo-fnd-acc-4217/MozambiqueMetical,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "943",
   :fibo-fnd-rel-rel/hasTextualName "Mozambique Metical",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Mozambique Metical",
   :skos/definition #xsd/langString "the currency Mozambique Metical@en"})

(def Mvdol
  "the funds Mvdol"
  {:cmns-av/explanatoryNote
   "For indexation purposes and denomination of certain financial instruments (e.g. treasury bills). The Mvdol is set daily by the Central Bank of Bolivia based on the official USD/BOB rate.",
   :cmns-cxtdsg/isUsedBy :lcc-3166-1/Bolivia,
   :db/ident :fibo-fnd-acc-4217/Mvdol,
   :fibo-fnd-acc-cur/hasCurrency :fibo-fnd-acc-4217/Boliviano,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "984",
   :fibo-fnd-rel-rel/hasTextualName "Mvdol",
   :rdf/type [:fibo-fnd-acc-cur/Funds :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Mvdol",
   :skos/definition #xsd/langString "the funds Mvdol@en"})

(def NAD
  "the currency identifier for Namibia Dollar"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/NamibiaDollar,
   :cmns-id/identifies :fibo-fnd-acc-4217/NamibiaDollar,
   :db/ident :fibo-fnd-acc-4217/NAD,
   :fibo-fnd-rel-rel/hasTag "NAD",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "NAD",
   :skos/definition #xsd/langString
                     "the currency identifier for Namibia Dollar@en"})

(def NGN
  "the currency identifier for Naira"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/Naira,
   :cmns-id/identifies :fibo-fnd-acc-4217/Naira,
   :db/ident :fibo-fnd-acc-4217/NGN,
   :fibo-fnd-rel-rel/hasTag "NGN",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "NGN",
   :skos/definition #xsd/langString "the currency identifier for Naira@en"})

(def NIO
  "the currency identifier for Cordoba Oro"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/CordobaOro,
   :cmns-id/identifies :fibo-fnd-acc-4217/CordobaOro,
   :db/ident :fibo-fnd-acc-4217/NIO,
   :fibo-fnd-rel-rel/hasTag "NIO",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "NIO",
   :skos/definition #xsd/langString
                     "the currency identifier for Cordoba Oro@en"})

(def NOK
  "the currency identifier for Norwegian Krone"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/NorwegianKrone,
   :cmns-id/identifies :fibo-fnd-acc-4217/NorwegianKrone,
   :db/ident :fibo-fnd-acc-4217/NOK,
   :fibo-fnd-rel-rel/hasTag "NOK",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "NOK",
   :skos/definition #xsd/langString
                     "the currency identifier for Norwegian Krone@en"})

(def NPR
  "the currency identifier for Nepalese Rupee"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/NepaleseRupee,
   :cmns-id/identifies :fibo-fnd-acc-4217/NepaleseRupee,
   :db/ident :fibo-fnd-acc-4217/NPR,
   :fibo-fnd-rel-rel/hasTag "NPR",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "NPR",
   :skos/definition #xsd/langString
                     "the currency identifier for Nepalese Rupee@en"})

(def NZD
  "the currency identifier for New Zealand Dollar"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/NewZealandDollar,
   :cmns-id/identifies :fibo-fnd-acc-4217/NewZealandDollar,
   :db/ident :fibo-fnd-acc-4217/NZD,
   :fibo-fnd-rel-rel/hasTag "NZD",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "NZD",
   :skos/definition #xsd/langString
                     "the currency identifier for New Zealand Dollar@en"})

(def Naira
  "the currency Naira"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Nigeria,
   :db/ident :fibo-fnd-acc-4217/Naira,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "566",
   :fibo-fnd-rel-rel/hasTextualName "Naira",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Naira",
   :skos/definition #xsd/langString "the currency Naira@en"})

(def Nakfa
  "the currency Nakfa"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Eritrea,
   :db/ident :fibo-fnd-acc-4217/Nakfa,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "232",
   :fibo-fnd-rel-rel/hasTextualName "Nakfa",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Nakfa",
   :skos/definition #xsd/langString "the currency Nakfa@en"})

(def NamibiaDollar
  "the currency Namibia Dollar"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Namibia,
   :db/ident :fibo-fnd-acc-4217/NamibiaDollar,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "516",
   :fibo-fnd-rel-rel/hasTextualName "Namibia Dollar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Namibia Dollar",
   :skos/definition #xsd/langString "the currency Namibia Dollar@en"})

(def NepaleseRupee
  "the currency Nepalese Rupee"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Nepal,
   :db/ident :fibo-fnd-acc-4217/NepaleseRupee,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "524",
   :fibo-fnd-rel-rel/hasTextualName "Nepalese Rupee",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Nepalese Rupee",
   :skos/definition #xsd/langString "the currency Nepalese Rupee@en"})

(def NetherlandsAntilleanGuilder
  "the currency Netherlands Antillean Guilder"
  {:cmns-cxtdsg/isUsedBy [:lcc-3166-1/Curacao :lcc-3166-1/SintMaarten],
   :db/ident :fibo-fnd-acc-4217/NetherlandsAntilleanGuilder,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "532",
   :fibo-fnd-rel-rel/hasTextualName "Netherlands Antillean Guilder",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Netherlands Antillean Guilder",
   :skos/definition #xsd/langString
                     "the currency Netherlands Antillean Guilder@en"})

(def NewIsraeliSheqel
  "the currency New Israeli Sheqel"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Israel,
   :db/ident :fibo-fnd-acc-4217/NewIsraeliSheqel,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "376",
   :fibo-fnd-rel-rel/hasTextualName "New Israeli Sheqel",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "New Israeli Sheqel",
   :skos/definition #xsd/langString "the currency New Israeli Sheqel@en"})

(def NewTaiwanDollar
  "the currency New Taiwan Dollar"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Taiwan,
   :db/ident :fibo-fnd-acc-4217/NewTaiwanDollar,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "901",
   :fibo-fnd-rel-rel/hasTextualName "New Taiwan Dollar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "New Taiwan Dollar",
   :skos/definition #xsd/langString "the currency New Taiwan Dollar@en"})

(def NewZealandDollar
  "the currency New Zealand Dollar"
  {:cmns-cxtdsg/isUsedBy [:lcc-3166-1/Pitcairn
                          :lcc-3166-1/NewZealand
                          :lcc-3166-1/Niue
                          :lcc-3166-1/Tokelau
                          :lcc-3166-1/CookIslands],
   :db/ident :fibo-fnd-acc-4217/NewZealandDollar,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "554",
   :fibo-fnd-rel-rel/hasTextualName "New Zealand Dollar",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-acc-cur/Currency],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "New Zealand Dollar",
   :skos/definition #xsd/langString "the currency New Zealand Dollar@en"})

(def Ngultrum
  "the currency Ngultrum"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Bhutan,
   :db/ident :fibo-fnd-acc-4217/Ngultrum,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "064",
   :fibo-fnd-rel-rel/hasTextualName "Ngultrum",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Ngultrum",
   :skos/definition #xsd/langString "the currency Ngultrum@en"})

(def NorthKoreanWon
  "the currency North Korean Won"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/KoreaDemocraticPeoplesRepublicOf,
   :db/ident :fibo-fnd-acc-4217/NorthKoreanWon,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "408",
   :fibo-fnd-rel-rel/hasTextualName "North Korean Won",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "North Korean Won",
   :skos/definition #xsd/langString "the currency North Korean Won@en"})

(def NorwegianKrone
  "the currency Norwegian Krone"
  {:cmns-cxtdsg/isUsedBy [:lcc-3166-1/BouvetIsland
                          :lcc-3166-1/Norway
                          :lcc-3166-1/SvalbardAndJanMayen],
   :db/ident :fibo-fnd-acc-4217/NorwegianKrone,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "578",
   :fibo-fnd-rel-rel/hasTextualName "Norwegian Krone",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Norwegian Krone",
   :skos/definition #xsd/langString "the currency Norwegian Krone@en"})

(def OMR
  "the currency identifier for Rial Omani"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/RialOmani,
   :cmns-id/identifies :fibo-fnd-acc-4217/RialOmani,
   :db/ident :fibo-fnd-acc-4217/OMR,
   :fibo-fnd-rel-rel/hasTag "OMR",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "OMR",
   :skos/definition #xsd/langString
                     "the currency identifier for Rial Omani@en"})

(def Ouguiya
  "the currency Ouguiya"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Mauritania,
   :db/ident :fibo-fnd-acc-4217/Ouguiya,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "929",
   :fibo-fnd-rel-rel/hasTextualName "Ouguiya",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Ouguiya",
   :skos/definition #xsd/langString "the currency Ouguiya@en"})

(def PAB
  "the currency identifier for Balboa"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/Balboa,
   :cmns-id/identifies :fibo-fnd-acc-4217/Balboa,
   :db/ident :fibo-fnd-acc-4217/PAB,
   :fibo-fnd-rel-rel/hasTag "PAB",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "PAB",
   :skos/definition #xsd/langString "the currency identifier for Balboa@en"})

(def PEN
  "the currency identifier for Sol"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/Sol,
   :cmns-id/identifies :fibo-fnd-acc-4217/Sol,
   :db/ident :fibo-fnd-acc-4217/PEN,
   :fibo-fnd-rel-rel/hasTag "PEN",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "PEN",
   :skos/definition #xsd/langString "the currency identifier for Sol@en"})

(def PGK
  "the currency identifier for Kina"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/Kina,
   :cmns-id/identifies :fibo-fnd-acc-4217/Kina,
   :db/ident :fibo-fnd-acc-4217/PGK,
   :fibo-fnd-rel-rel/hasTag "PGK",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "PGK",
   :skos/definition #xsd/langString "the currency identifier for Kina@en"})

(def PHP
  "the currency identifier for Philippine Peso"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/PhilippinePeso,
   :cmns-id/identifies :fibo-fnd-acc-4217/PhilippinePeso,
   :db/ident :fibo-fnd-acc-4217/PHP,
   :fibo-fnd-rel-rel/hasTag "PHP",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "PHP",
   :skos/definition #xsd/langString
                     "the currency identifier for Philippine Peso@en"})

(def PKR
  "the currency identifier for Pakistan Rupee"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/PakistanRupee,
   :cmns-id/identifies :fibo-fnd-acc-4217/PakistanRupee,
   :db/ident :fibo-fnd-acc-4217/PKR,
   :fibo-fnd-rel-rel/hasTag "PKR",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "PKR",
   :skos/definition #xsd/langString
                     "the currency identifier for Pakistan Rupee@en"})

(def PLN
  "the currency identifier for Zloty"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/Zloty,
   :cmns-id/identifies :fibo-fnd-acc-4217/Zloty,
   :db/ident :fibo-fnd-acc-4217/PLN,
   :fibo-fnd-rel-rel/hasTag "PLN",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "PLN",
   :skos/definition #xsd/langString "the currency identifier for Zloty@en"})

(def PYG
  "the currency identifier for Guarani"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/Guarani,
   :cmns-id/identifies :fibo-fnd-acc-4217/Guarani,
   :db/ident :fibo-fnd-acc-4217/PYG,
   :fibo-fnd-rel-rel/hasTag "PYG",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "PYG",
   :skos/definition #xsd/langString "the currency identifier for Guarani@en"})

(def Paanga
  "the currency Paʻanga"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Tonga,
   :db/ident :fibo-fnd-acc-4217/Paanga,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "776",
   :fibo-fnd-rel-rel/hasTextualName "Paʻanga",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Paʻanga",
   :skos/definition #xsd/langString "the currency Paʻanga@en"})

(def PakistanRupee
  "the currency Pakistan Rupee"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Pakistan,
   :db/ident :fibo-fnd-acc-4217/PakistanRupee,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "586",
   :fibo-fnd-rel-rel/hasTextualName "Pakistan Rupee",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Pakistan Rupee",
   :skos/definition #xsd/langString "the currency Pakistan Rupee@en"})

(def Palladium
  "the currency whose unit is one troy ounce of the precious metal Palladium"
  {:db/ident :fibo-fnd-acc-4217/Palladium,
   :fibo-fnd-acc-cur/hasNumericCode "964",
   :fibo-fnd-rel-rel/hasTextualName "Palladium",
   :rdf/type [:fibo-fnd-acc-cur/PreciousMetal :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Palladium",
   :skos/definition
   #xsd/langString
    "the currency whose unit is one troy ounce of the precious metal Palladium@en"})

(def Pataca
  "the currency Pataca"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Macao,
   :db/ident :fibo-fnd-acc-4217/Pataca,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "446",
   :fibo-fnd-rel-rel/hasTextualName "Pataca",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Pataca",
   :skos/definition #xsd/langString "the currency Pataca@en"})

(def PesoConvertible
  "the currency Peso Convertible"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Cuba,
   :db/ident :fibo-fnd-acc-4217/PesoConvertible,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "931",
   :fibo-fnd-rel-rel/hasTextualName "Peso Convertible",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Peso Convertible",
   :skos/definition #xsd/langString "the currency Peso Convertible@en"})

(def PesoUruguayo
  "the currency Peso Uruguayo"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Uruguay,
   :db/ident :fibo-fnd-acc-4217/PesoUruguayo,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "858",
   :fibo-fnd-rel-rel/hasTextualName "Peso Uruguayo",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Peso Uruguayo",
   :skos/definition #xsd/langString "the currency Peso Uruguayo@en"})

(def PhilippinePeso
  "the currency Philippine Peso"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Philippines,
   :db/ident :fibo-fnd-acc-4217/PhilippinePeso,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "608",
   :fibo-fnd-rel-rel/hasTextualName "Philippine Peso",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Philippine Peso",
   :skos/definition #xsd/langString "the currency Philippine Peso@en"})

(def Platinum
  "the currency whose unit is one troy ounce of the precious metal Platinum"
  {:db/ident :fibo-fnd-acc-4217/Platinum,
   :fibo-fnd-acc-cur/hasNumericCode "962",
   :fibo-fnd-rel-rel/hasTextualName "Platinum",
   :rdf/type [:fibo-fnd-acc-cur/PreciousMetal :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Platinum",
   :skos/definition
   #xsd/langString
    "the currency whose unit is one troy ounce of the precious metal Platinum@en"})

(def PoundSterling
  "the currency Pound Sterling"
  {:cmns-cxtdsg/isUsedBy
   [:lcc-3166-1/UnitedKingdomOfGreatBritainAndNorthernIreland
    :lcc-3166-1/Guernsey
    :lcc-3166-1/Jersey
    :lcc-3166-1/IsleOfMan],
   :db/ident :fibo-fnd-acc-4217/PoundSterling,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "826",
   :fibo-fnd-rel-rel/hasTextualName "Pound Sterling",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-acc-cur/Currency],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Pound Sterling",
   :skos/definition #xsd/langString "the currency Pound Sterling@en"})

(def Pula
  "the currency Pula"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Botswana,
   :db/ident :fibo-fnd-acc-4217/Pula,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "072",
   :fibo-fnd-rel-rel/hasTextualName "Pula",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Pula",
   :skos/definition #xsd/langString "the currency Pula@en"})

(def QAR
  "the currency identifier for Qatari Rial"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/QatariRial,
   :cmns-id/identifies :fibo-fnd-acc-4217/QatariRial,
   :db/ident :fibo-fnd-acc-4217/QAR,
   :fibo-fnd-rel-rel/hasTag "QAR",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "QAR",
   :skos/definition #xsd/langString
                     "the currency identifier for Qatari Rial@en"})

(def QatariRial
  "the currency Qatari Rial"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Qatar,
   :db/ident :fibo-fnd-acc-4217/QatariRial,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "634",
   :fibo-fnd-rel-rel/hasTextualName "Qatari Rial",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Qatari Rial",
   :skos/definition #xsd/langString "the currency Qatari Rial@en"})

(def Quetzal
  "the currency Quetzal"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Guatemala,
   :db/ident :fibo-fnd-acc-4217/Quetzal,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "320",
   :fibo-fnd-rel-rel/hasTextualName "Quetzal",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Quetzal",
   :skos/definition #xsd/langString "the currency Quetzal@en"})

(def RON
  "the currency identifier for Romanian Leu"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/RomanianLeu,
   :cmns-id/identifies :fibo-fnd-acc-4217/RomanianLeu,
   :db/ident :fibo-fnd-acc-4217/RON,
   :fibo-fnd-rel-rel/hasTag "RON",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "RON",
   :skos/definition #xsd/langString
                     "the currency identifier for Romanian Leu@en"})

(def RSD
  "the currency identifier for Serbian Dinar"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/SerbianDinar,
   :cmns-id/identifies :fibo-fnd-acc-4217/SerbianDinar,
   :db/ident :fibo-fnd-acc-4217/RSD,
   :fibo-fnd-rel-rel/hasTag "RSD",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "RSD",
   :skos/definition #xsd/langString
                     "the currency identifier for Serbian Dinar@en"})

(def RUB
  "the currency identifier for Russian Ruble"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/RussianRuble,
   :cmns-id/identifies :fibo-fnd-acc-4217/RussianRuble,
   :db/ident :fibo-fnd-acc-4217/RUB,
   :fibo-fnd-rel-rel/hasTag "RUB",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "RUB",
   :skos/definition #xsd/langString
                     "the currency identifier for Russian Ruble@en"})

(def RWF
  "the currency identifier for Rwanda Franc"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/RwandaFranc,
   :cmns-id/identifies :fibo-fnd-acc-4217/RwandaFranc,
   :db/ident :fibo-fnd-acc-4217/RWF,
   :fibo-fnd-rel-rel/hasTag "RWF",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "RWF",
   :skos/definition #xsd/langString
                     "the currency identifier for Rwanda Franc@en"})

(def Rand
  "the currency Rand"
  {:cmns-cxtdsg/isUsedBy
   [:lcc-3166-1/SouthAfrica :lcc-3166-1/Lesotho :lcc-3166-1/Namibia],
   :db/ident :fibo-fnd-acc-4217/Rand,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "710",
   :fibo-fnd-rel-rel/hasTextualName "Rand",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-acc-cur/Currency],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Rand",
   :skos/definition #xsd/langString "the currency Rand@en"})

(def RialOmani
  "the currency Rial Omani"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Oman,
   :db/ident :fibo-fnd-acc-4217/RialOmani,
   :fibo-fnd-acc-cur/hasMinorUnit "3",
   :fibo-fnd-acc-cur/hasNumericCode "512",
   :fibo-fnd-rel-rel/hasTextualName "Rial Omani",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Rial Omani",
   :skos/definition #xsd/langString "the currency Rial Omani@en"})

(def Riel
  "the currency Riel"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Cambodia,
   :db/ident :fibo-fnd-acc-4217/Riel,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "116",
   :fibo-fnd-rel-rel/hasTextualName "Riel",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Riel",
   :skos/definition #xsd/langString "the currency Riel@en"})

(def RomanianLeu
  "the currency Romanian Leu"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Romania,
   :db/ident :fibo-fnd-acc-4217/RomanianLeu,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "946",
   :fibo-fnd-rel-rel/hasTextualName "Romanian Leu",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Romanian Leu",
   :skos/definition #xsd/langString "the currency Romanian Leu@en"})

(def Rufiyaa
  "the currency Rufiyaa"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Maldives,
   :db/ident :fibo-fnd-acc-4217/Rufiyaa,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "462",
   :fibo-fnd-rel-rel/hasTextualName "Rufiyaa",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Rufiyaa",
   :skos/definition #xsd/langString "the currency Rufiyaa@en"})

(def Rupiah
  "the currency Rupiah"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Indonesia,
   :db/ident :fibo-fnd-acc-4217/Rupiah,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "360",
   :fibo-fnd-rel-rel/hasTextualName "Rupiah",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Rupiah",
   :skos/definition #xsd/langString "the currency Rupiah@en"})

(def RussianRuble
  "the currency Russian Ruble"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/RussianFederation,
   :db/ident :fibo-fnd-acc-4217/RussianRuble,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "643",
   :fibo-fnd-rel-rel/hasTextualName "Russian Ruble",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Russian Ruble",
   :skos/definition #xsd/langString "the currency Russian Ruble@en"})

(def RwandaFranc
  "the currency Rwanda Franc"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Rwanda,
   :db/ident :fibo-fnd-acc-4217/RwandaFranc,
   :fibo-fnd-acc-cur/hasMinorUnit "0",
   :fibo-fnd-acc-cur/hasNumericCode "646",
   :fibo-fnd-rel-rel/hasTextualName "Rwanda Franc",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Rwanda Franc",
   :skos/definition #xsd/langString "the currency Rwanda Franc@en"})

(def SAR
  "the currency identifier for Saudi Riyal"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/SaudiRiyal,
   :cmns-id/identifies :fibo-fnd-acc-4217/SaudiRiyal,
   :db/ident :fibo-fnd-acc-4217/SAR,
   :fibo-fnd-rel-rel/hasTag "SAR",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "SAR",
   :skos/definition #xsd/langString
                     "the currency identifier for Saudi Riyal@en"})

(def SBD
  "the currency identifier for Solomon Islands Dollar"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/SolomonIslandsDollar,
   :cmns-id/identifies :fibo-fnd-acc-4217/SolomonIslandsDollar,
   :db/ident :fibo-fnd-acc-4217/SBD,
   :fibo-fnd-rel-rel/hasTag "SBD",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "SBD",
   :skos/definition #xsd/langString
                     "the currency identifier for Solomon Islands Dollar@en"})

(def SCR
  "the currency identifier for Seychelles Rupee"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/SeychellesRupee,
   :cmns-id/identifies :fibo-fnd-acc-4217/SeychellesRupee,
   :db/ident :fibo-fnd-acc-4217/SCR,
   :fibo-fnd-rel-rel/hasTag "SCR",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "SCR",
   :skos/definition #xsd/langString
                     "the currency identifier for Seychelles Rupee@en"})

(def SDG
  "the currency identifier for Sudanese Pound"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/SudanesePound,
   :cmns-id/identifies :fibo-fnd-acc-4217/SudanesePound,
   :db/ident :fibo-fnd-acc-4217/SDG,
   :fibo-fnd-rel-rel/hasTag "SDG",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "SDG",
   :skos/definition #xsd/langString
                     "the currency identifier for Sudanese Pound@en"})

(def SDR_SpecialDrawingRight
  "the IMF's SDR (Special Drawing Right)"
  {:db/ident :fibo-fnd-acc-4217/SDR_SpecialDrawingRight,
   :fibo-fnd-acc-cur/hasNumericCode "960",
   :fibo-fnd-rel-rel/hasTextualName "SDR (Special Drawing Right)",
   :rdf/type [:fibo-fnd-acc-cur/UnitOfAccount :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "SDR (Special Drawing Right)",
   :skos/definition #xsd/langString "the IMF's SDR (Special Drawing Right)@en"})

(def SEK
  "the currency identifier for Swedish Krona"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/SwedishKrona,
   :cmns-id/identifies :fibo-fnd-acc-4217/SwedishKrona,
   :db/ident :fibo-fnd-acc-4217/SEK,
   :fibo-fnd-rel-rel/hasTag "SEK",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "SEK",
   :skos/definition #xsd/langString
                     "the currency identifier for Swedish Krona@en"})

(def SGD
  "the currency identifier for Singapore Dollar"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/SingaporeDollar,
   :cmns-id/identifies :fibo-fnd-acc-4217/SingaporeDollar,
   :db/ident :fibo-fnd-acc-4217/SGD,
   :fibo-fnd-rel-rel/hasTag "SGD",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "SGD",
   :skos/definition #xsd/langString
                     "the currency identifier for Singapore Dollar@en"})

(def SHP
  "the currency identifier for Saint Helena Pound"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/SaintHelenaPound,
   :cmns-id/identifies :fibo-fnd-acc-4217/SaintHelenaPound,
   :db/ident :fibo-fnd-acc-4217/SHP,
   :fibo-fnd-rel-rel/hasTag "SHP",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "SHP",
   :skos/definition #xsd/langString
                     "the currency identifier for Saint Helena Pound@en"})

(def SLE
  "the currency identifier for Leone"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/Leone,
   :cmns-id/identifies :fibo-fnd-acc-4217/Leone,
   :db/ident :fibo-fnd-acc-4217/SLE,
   :fibo-fnd-rel-rel/hasTag "SLE",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "SLE",
   :skos/definition #xsd/langString "the currency identifier for Leone@en",
   :skos/note
   #xsd/langString
    "The Sierra Leonean LEONE (SLL) is redenominated by removing three (3) zeros from the denominations. A new currency code SLE/925 representing the new valuation (1,000 times old SLL/694) is introduced on 1st April 2022 for any internal needs during the redenomination process, and is replacing SLL as the official currency code, after the transition period to be determined. During this transition period, both the old Leone and new Leone will be in physical circulation for at least 90 days. The Bank of Sierra Leone will adopt the new code in the local system but SLL/694 shall remain in use until further notice. The Sierra Leonean currency shall continue to be the LEONE and this will not change after redenomination.@en"})

(def SLL
  "the currency identifier for Leone"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/Leone,
   :cmns-id/identifies :fibo-fnd-acc-4217/Leone,
   :db/ident :fibo-fnd-acc-4217/SLL,
   :fibo-fnd-rel-rel/hasTag "SLL",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "SLL",
   :skos/definition #xsd/langString "the currency identifier for Leone@en"})

(def SOS
  "the currency identifier for Somali Shilling"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/SomaliShilling,
   :cmns-id/identifies :fibo-fnd-acc-4217/SomaliShilling,
   :db/ident :fibo-fnd-acc-4217/SOS,
   :fibo-fnd-rel-rel/hasTag "SOS",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "SOS",
   :skos/definition #xsd/langString
                     "the currency identifier for Somali Shilling@en"})

(def SRD
  "the currency identifier for Surinam Dollar"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/SurinamDollar,
   :cmns-id/identifies :fibo-fnd-acc-4217/SurinamDollar,
   :db/ident :fibo-fnd-acc-4217/SRD,
   :fibo-fnd-rel-rel/hasTag "SRD",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "SRD",
   :skos/definition #xsd/langString
                     "the currency identifier for Surinam Dollar@en"})

(def SSP
  "the currency identifier for South Sudanese Pound"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/SouthSudanesePound,
   :cmns-id/identifies :fibo-fnd-acc-4217/SouthSudanesePound,
   :db/ident :fibo-fnd-acc-4217/SSP,
   :fibo-fnd-rel-rel/hasTag "SSP",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "SSP",
   :skos/definition #xsd/langString
                     "the currency identifier for South Sudanese Pound@en"})

(def STN
  "the currency identifier for Dobra"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/Dobra,
   :cmns-id/identifies :fibo-fnd-acc-4217/Dobra,
   :db/ident :fibo-fnd-acc-4217/STN,
   :fibo-fnd-rel-rel/hasTag "STN",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "STN",
   :skos/definition #xsd/langString "the currency identifier for Dobra@en"})

(def SVC
  "the currency identifier for El Salvador Colon"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/ElSalvadorColon,
   :cmns-id/identifies :fibo-fnd-acc-4217/ElSalvadorColon,
   :db/ident :fibo-fnd-acc-4217/SVC,
   :fibo-fnd-rel-rel/hasTag "SVC",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "SVC",
   :skos/definition #xsd/langString
                     "the currency identifier for El Salvador Colon@en"})

(def SYP
  "the currency identifier for Syrian Pound"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/SyrianPound,
   :cmns-id/identifies :fibo-fnd-acc-4217/SyrianPound,
   :db/ident :fibo-fnd-acc-4217/SYP,
   :fibo-fnd-rel-rel/hasTag "SYP",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "SYP",
   :skos/definition #xsd/langString
                     "the currency identifier for Syrian Pound@en"})

(def SZL
  "the currency identifier for Lilangeni"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/Lilangeni,
   :cmns-id/identifies :fibo-fnd-acc-4217/Lilangeni,
   :db/ident :fibo-fnd-acc-4217/SZL,
   :fibo-fnd-rel-rel/hasTag "SZL",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "SZL",
   :skos/definition #xsd/langString "the currency identifier for Lilangeni@en"})

(def SaintHelenaPound
  "the currency Saint Helena Pound"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/SaintHelena,
   :db/ident :fibo-fnd-acc-4217/SaintHelenaPound,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "654",
   :fibo-fnd-rel-rel/hasTextualName "Saint Helena Pound",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Saint Helena Pound",
   :skos/definition #xsd/langString "the currency Saint Helena Pound@en"})

(def SaudiRiyal
  "the currency Saudi Riyal"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/SaudiArabia,
   :db/ident :fibo-fnd-acc-4217/SaudiRiyal,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "682",
   :fibo-fnd-rel-rel/hasTextualName "Saudi Riyal",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Saudi Riyal",
   :skos/definition #xsd/langString "the currency Saudi Riyal@en"})

(def SerbianDinar
  "the currency Serbian Dinar"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Serbia,
   :db/ident :fibo-fnd-acc-4217/SerbianDinar,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "941",
   :fibo-fnd-rel-rel/hasTextualName "Serbian Dinar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Serbian Dinar",
   :skos/definition #xsd/langString "the currency Serbian Dinar@en"})

(def SeychellesRupee
  "the currency Seychelles Rupee"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Seychelles,
   :db/ident :fibo-fnd-acc-4217/SeychellesRupee,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "690",
   :fibo-fnd-rel-rel/hasTextualName "Seychelles Rupee",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Seychelles Rupee",
   :skos/definition #xsd/langString "the currency Seychelles Rupee@en"})

(def Silver
  "the currency whose unit is one troy ounce of the precious metal Silver"
  {:db/ident :fibo-fnd-acc-4217/Silver,
   :fibo-fnd-acc-cur/hasNumericCode "961",
   :fibo-fnd-rel-rel/hasTextualName "Silver",
   :rdf/type [:fibo-fnd-acc-cur/PreciousMetal :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Silver",
   :skos/definition
   #xsd/langString
    "the currency whose unit is one troy ounce of the precious metal Silver@en"})

(def SingaporeDollar
  "the currency Singapore Dollar"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Singapore,
   :db/ident :fibo-fnd-acc-4217/SingaporeDollar,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "702",
   :fibo-fnd-rel-rel/hasTextualName "Singapore Dollar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Singapore Dollar",
   :skos/definition #xsd/langString "the currency Singapore Dollar@en"})

(def Sol
  "the currency Sol"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Peru,
   :db/ident :fibo-fnd-acc-4217/Sol,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "604",
   :fibo-fnd-rel-rel/hasTextualName "Sol",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Sol",
   :skos/definition #xsd/langString "the currency Sol@en"})

(def SolomonIslandsDollar
  "the currency Solomon Islands Dollar"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/SolomonIslands,
   :db/ident :fibo-fnd-acc-4217/SolomonIslandsDollar,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "090",
   :fibo-fnd-rel-rel/hasTextualName "Solomon Islands Dollar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Solomon Islands Dollar",
   :skos/definition #xsd/langString "the currency Solomon Islands Dollar@en"})

(def Som
  "the currency Som"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Kyrgyzstan,
   :db/ident :fibo-fnd-acc-4217/Som,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "417",
   :fibo-fnd-rel-rel/hasTextualName "Som",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Som",
   :skos/definition #xsd/langString "the currency Som@en"})

(def SomaliShilling
  "the currency Somali Shilling"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Somalia,
   :db/ident :fibo-fnd-acc-4217/SomaliShilling,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "706",
   :fibo-fnd-rel-rel/hasTextualName "Somali Shilling",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Somali Shilling",
   :skos/definition #xsd/langString "the currency Somali Shilling@en"})

(def Somoni
  "the currency Somoni"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Tajikistan,
   :db/ident :fibo-fnd-acc-4217/Somoni,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "972",
   :fibo-fnd-rel-rel/hasTextualName "Somoni",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Somoni",
   :skos/definition #xsd/langString "the currency Somoni@en"})

(def SouthSudanesePound
  "the currency South Sudanese Pound"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/SouthSudan,
   :db/ident :fibo-fnd-acc-4217/SouthSudanesePound,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "728",
   :fibo-fnd-rel-rel/hasTextualName "South Sudanese Pound",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "South Sudanese Pound",
   :skos/definition #xsd/langString "the currency South Sudanese Pound@en"})

(def SriLankaRupee
  "the currency Sri Lanka Rupee"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/SriLanka,
   :db/ident :fibo-fnd-acc-4217/SriLankaRupee,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "144",
   :fibo-fnd-rel-rel/hasTextualName "Sri Lanka Rupee",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Sri Lanka Rupee",
   :skos/definition #xsd/langString "the currency Sri Lanka Rupee@en"})

(def Sucre
  "the currency Sucre"
  {:db/ident :fibo-fnd-acc-4217/Sucre,
   :fibo-fnd-acc-cur/hasNumericCode "994",
   :fibo-fnd-rel-rel/hasTextualName "Sucre",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Sucre",
   :skos/definition #xsd/langString "the currency Sucre@en"})

(def SudanesePound
  "the currency Sudanese Pound"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Sudan,
   :db/ident :fibo-fnd-acc-4217/SudanesePound,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "938",
   :fibo-fnd-rel-rel/hasTextualName "Sudanese Pound",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Sudanese Pound",
   :skos/definition #xsd/langString "the currency Sudanese Pound@en"})

(def SurinamDollar
  "the currency Surinam Dollar"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Suriname,
   :db/ident :fibo-fnd-acc-4217/SurinamDollar,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "968",
   :fibo-fnd-rel-rel/hasTextualName "Surinam Dollar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Surinam Dollar",
   :skos/definition #xsd/langString "the currency Surinam Dollar@en"})

(def SwedishKrona
  "the currency Swedish Krona"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Sweden,
   :db/ident :fibo-fnd-acc-4217/SwedishKrona,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "752",
   :fibo-fnd-rel-rel/hasTextualName "Swedish Krona",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Swedish Krona",
   :skos/definition #xsd/langString "the currency Swedish Krona@en"})

(def SwissFranc
  "the currency Swiss Franc"
  {:cmns-cxtdsg/isUsedBy [:lcc-3166-1/Liechtenstein :lcc-3166-1/Switzerland],
   :db/ident :fibo-fnd-acc-4217/SwissFranc,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "756",
   :fibo-fnd-rel-rel/hasTextualName "Swiss Franc",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-acc-cur/Currency],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Swiss Franc",
   :skos/definition #xsd/langString "the currency Swiss Franc@en"})

(def SyrianPound
  "the currency Syrian Pound"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/SyrianArabRepublic,
   :db/ident :fibo-fnd-acc-4217/SyrianPound,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "760",
   :fibo-fnd-rel-rel/hasTextualName "Syrian Pound",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Syrian Pound",
   :skos/definition #xsd/langString "the currency Syrian Pound@en"})

(def THB
  "the currency identifier for Baht"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/Baht,
   :cmns-id/identifies :fibo-fnd-acc-4217/Baht,
   :db/ident :fibo-fnd-acc-4217/THB,
   :fibo-fnd-rel-rel/hasTag "THB",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "THB",
   :skos/definition #xsd/langString "the currency identifier for Baht@en"})

(def TJS
  "the currency identifier for Somoni"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/Somoni,
   :cmns-id/identifies :fibo-fnd-acc-4217/Somoni,
   :db/ident :fibo-fnd-acc-4217/TJS,
   :fibo-fnd-rel-rel/hasTag "TJS",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "TJS",
   :skos/definition #xsd/langString "the currency identifier for Somoni@en"})

(def TMT
  "the currency identifier for Turkmenistan New Manat"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/TurkmenistanNewManat,
   :cmns-id/identifies :fibo-fnd-acc-4217/TurkmenistanNewManat,
   :db/ident :fibo-fnd-acc-4217/TMT,
   :fibo-fnd-rel-rel/hasTag "TMT",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "TMT",
   :skos/definition #xsd/langString
                     "the currency identifier for Turkmenistan New Manat@en"})

(def TND
  "the currency identifier for Tunisian Dinar"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/TunisianDinar,
   :cmns-id/identifies :fibo-fnd-acc-4217/TunisianDinar,
   :db/ident :fibo-fnd-acc-4217/TND,
   :fibo-fnd-rel-rel/hasTag "TND",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "TND",
   :skos/definition #xsd/langString
                     "the currency identifier for Tunisian Dinar@en"})

(def TOP
  "the currency identifier for Paʻanga"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/Paanga,
   :cmns-id/identifies :fibo-fnd-acc-4217/Paanga,
   :db/ident :fibo-fnd-acc-4217/TOP,
   :fibo-fnd-rel-rel/hasTag "TOP",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "TOP",
   :skos/definition #xsd/langString "the currency identifier for Paʻanga@en"})

(def TRY
  "the currency identifier for Turkish Lira"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/TurkishLira,
   :cmns-id/identifies :fibo-fnd-acc-4217/TurkishLira,
   :db/ident :fibo-fnd-acc-4217/TRY,
   :fibo-fnd-rel-rel/hasTag "TRY",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "TRY",
   :skos/definition #xsd/langString
                     "the currency identifier for Turkish Lira@en"})

(def TTD
  "the currency identifier for Trinidad and Tobago Dollar"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/TrinidadandTobagoDollar,
   :cmns-id/identifies :fibo-fnd-acc-4217/TrinidadandTobagoDollar,
   :db/ident :fibo-fnd-acc-4217/TTD,
   :fibo-fnd-rel-rel/hasTag "TTD",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "TTD",
   :skos/definition
   #xsd/langString "the currency identifier for Trinidad and Tobago Dollar@en"})

(def TWD
  "the currency identifier for New Taiwan Dollar"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/NewTaiwanDollar,
   :cmns-id/identifies :fibo-fnd-acc-4217/NewTaiwanDollar,
   :db/ident :fibo-fnd-acc-4217/TWD,
   :fibo-fnd-rel-rel/hasTag "TWD",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "TWD",
   :skos/definition #xsd/langString
                     "the currency identifier for New Taiwan Dollar@en"})

(def TZS
  "the currency identifier for Tanzanian Shilling"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/TanzanianShilling,
   :cmns-id/identifies :fibo-fnd-acc-4217/TanzanianShilling,
   :db/ident :fibo-fnd-acc-4217/TZS,
   :fibo-fnd-rel-rel/hasTag "TZS",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "TZS",
   :skos/definition #xsd/langString
                     "the currency identifier for Tanzanian Shilling@en"})

(def Taka
  "the currency Taka"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Bangladesh,
   :db/ident :fibo-fnd-acc-4217/Taka,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "050",
   :fibo-fnd-rel-rel/hasTextualName "Taka",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Taka",
   :skos/definition #xsd/langString "the currency Taka@en"})

(def Tala
  "the currency Tala"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Samoa,
   :db/ident :fibo-fnd-acc-4217/Tala,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "882",
   :fibo-fnd-rel-rel/hasTextualName "Tala",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Tala",
   :skos/definition #xsd/langString "the currency Tala@en"})

(def TanzanianShilling
  "the currency Tanzanian Shilling"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Tanzania,
   :db/ident :fibo-fnd-acc-4217/TanzanianShilling,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "834",
   :fibo-fnd-rel-rel/hasTextualName "Tanzanian Shilling",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Tanzanian Shilling",
   :skos/definition #xsd/langString "the currency Tanzanian Shilling@en"})

(def Tenge
  "the currency Tenge"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Kazakhstan,
   :db/ident :fibo-fnd-acc-4217/Tenge,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "398",
   :fibo-fnd-rel-rel/hasTextualName "Tenge",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Tenge",
   :skos/definition #xsd/langString "the currency Tenge@en"})

(def TrinidadandTobagoDollar
  "the currency Trinidad and Tobago Dollar"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/TrinidadAndTobago,
   :db/ident :fibo-fnd-acc-4217/TrinidadandTobagoDollar,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "780",
   :fibo-fnd-rel-rel/hasTextualName "Trinidad and Tobago Dollar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Trinidad and Tobago Dollar",
   :skos/definition #xsd/langString
                     "the currency Trinidad and Tobago Dollar@en"})

(def Tugrik
  "the currency Tugrik"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Mongolia,
   :db/ident :fibo-fnd-acc-4217/Tugrik,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "496",
   :fibo-fnd-rel-rel/hasTextualName "Tugrik",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Tugrik",
   :skos/definition #xsd/langString "the currency Tugrik@en"})

(def TunisianDinar
  "the currency Tunisian Dinar"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Tunisia,
   :db/ident :fibo-fnd-acc-4217/TunisianDinar,
   :fibo-fnd-acc-cur/hasMinorUnit "3",
   :fibo-fnd-acc-cur/hasNumericCode "788",
   :fibo-fnd-rel-rel/hasTextualName "Tunisian Dinar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Tunisian Dinar",
   :skos/definition #xsd/langString "the currency Tunisian Dinar@en"})

(def TurkishLira
  "the currency Turkish Lira"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Turkey,
   :db/ident :fibo-fnd-acc-4217/TurkishLira,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "949",
   :fibo-fnd-rel-rel/hasTextualName "Turkish Lira",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Turkish Lira",
   :skos/definition #xsd/langString "the currency Turkish Lira@en"})

(def TurkmenistanNewManat
  "the currency Turkmenistan New Manat"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Turkmenistan,
   :db/ident :fibo-fnd-acc-4217/TurkmenistanNewManat,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "934",
   :fibo-fnd-rel-rel/hasTextualName "Turkmenistan New Manat",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Turkmenistan New Manat",
   :skos/definition #xsd/langString "the currency Turkmenistan New Manat@en"})

(def UAEDirham
  "the currency UAE Dirham"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedArabEmirates,
   :db/ident :fibo-fnd-acc-4217/UAEDirham,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "784",
   :fibo-fnd-rel-rel/hasTextualName "UAE Dirham",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "UAE Dirham",
   :skos/definition #xsd/langString "the currency UAE Dirham@en"})

(def UAH
  "the currency identifier for Hryvnia"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/Hryvnia,
   :cmns-id/identifies :fibo-fnd-acc-4217/Hryvnia,
   :db/ident :fibo-fnd-acc-4217/UAH,
   :fibo-fnd-rel-rel/hasTag "UAH",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "UAH",
   :skos/definition #xsd/langString "the currency identifier for Hryvnia@en"})

(def UGX
  "the currency identifier for Uganda Shilling"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/UgandaShilling,
   :cmns-id/identifies :fibo-fnd-acc-4217/UgandaShilling,
   :db/ident :fibo-fnd-acc-4217/UGX,
   :fibo-fnd-rel-rel/hasTag "UGX",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "UGX",
   :skos/definition #xsd/langString
                     "the currency identifier for Uganda Shilling@en"})

(def USD
  "the currency identifier for US Dollar"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/USDollar,
   :cmns-id/identifies :fibo-fnd-acc-4217/USDollar,
   :db/ident :fibo-fnd-acc-4217/USD,
   :fibo-fnd-rel-rel/hasTag "USD",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "USD",
   :skos/definition #xsd/langString "the currency identifier for US Dollar@en"})

(def USDollar
  "the currency US Dollar"
  {:cmns-cxtdsg/isUsedBy [:lcc-3166-1/NorthernMarianaIslands
                          :lcc-3166-1/Palau
                          :lcc-3166-1/AmericanSamoa
                          :lcc-3166-1/PuertoRico
                          :lcc-3166-1/UnitedStatesMinorOutlyingIslands
                          :lcc-3166-1/VirginIslandsBritish
                          :lcc-3166-1/VirginIslandsUS
                          :lcc-3166-1/Bonaire
                          :lcc-3166-1/TurksAndCaicosIslands
                          :lcc-3166-1/Haiti
                          :lcc-3166-1/Ecuador
                          :lcc-3166-1/Panama
                          :lcc-3166-1/BritishIndianOceanTerritory
                          :lcc-3166-1/Timor-Leste
                          :lcc-3166-1/MarshallIslands
                          :lcc-3166-1/Micronesia
                          :lcc-3166-1/ElSalvador
                          :lcc-3166-1/UnitedStatesOfAmerica
                          :lcc-3166-1/Guam],
   :db/ident :fibo-fnd-acc-4217/USDollar,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "840",
   :fibo-fnd-rel-rel/hasTextualName "US Dollar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "US Dollar",
   :skos/definition #xsd/langString "the currency US Dollar@en"})

(def USDollar_Nextday
  "the funds US Dollar (Next day)"
  {:cmns-av/explanatoryNote
   "\"Next day\" funds are immediately available for transfer in like funds, and, subject to settlement, available the next business day for same day funds transfer or withdrawal in cash.",
   :cmns-cxtdsg/isUsedBy :lcc-3166-1/UnitedStatesOfAmerica,
   :db/ident :fibo-fnd-acc-4217/USDollar_Nextday,
   :fibo-fnd-acc-cur/hasCurrency :fibo-fnd-acc-4217/USDollar,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "997",
   :fibo-fnd-rel-rel/hasTextualName "US Dollar (Next day)",
   :rdf/type [:fibo-fnd-acc-cur/Funds :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "US Dollar (Next day)",
   :skos/definition #xsd/langString "the funds US Dollar (Next day)@en"})

(def USN
  "the funds identifier for US Dollar (Next day)"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/USDollar_Nextday,
   :cmns-id/identifies :fibo-fnd-acc-4217/USDollar_Nextday,
   :db/ident :fibo-fnd-acc-4217/USN,
   :fibo-fnd-rel-rel/hasTag "USN",
   :rdf/type [:fibo-fnd-acc-cur/FundsIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "USN",
   :skos/definition #xsd/langString
                     "the funds identifier for US Dollar (Next day)@en"})

(def UYI
  "the funds identifier for Uruguay Peso en Unidades Indexadas (UI)"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/UruguayPesoenUnidadesIndexadas_UI,
   :cmns-id/identifies :fibo-fnd-acc-4217/UruguayPesoenUnidadesIndexadas_UI,
   :db/ident :fibo-fnd-acc-4217/UYI,
   :fibo-fnd-rel-rel/hasTag "UYI",
   :rdf/type [:fibo-fnd-acc-cur/FundsIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "UYI",
   :skos/definition
   #xsd/langString
    "the funds identifier for Uruguay Peso en Unidades Indexadas (UI)@en"})

(def UYU
  "the currency identifier for Peso Uruguayo"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/PesoUruguayo,
   :cmns-id/identifies :fibo-fnd-acc-4217/PesoUruguayo,
   :db/ident :fibo-fnd-acc-4217/UYU,
   :fibo-fnd-rel-rel/hasTag "UYU",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "UYU",
   :skos/definition #xsd/langString
                     "the currency identifier for Peso Uruguayo@en"})

(def UYW
  "the currency identifier for Unidad Previsional"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/UnidadPrevisional,
   :cmns-id/identifies :fibo-fnd-acc-4217/UnidadPrevisional,
   :db/ident :fibo-fnd-acc-4217/UYW,
   :fibo-fnd-rel-rel/hasTag "UYW",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "UYW",
   :skos/definition #xsd/langString
                     "the currency identifier for Unidad Previsional@en"})

(def UZS
  "the currency identifier for Uzbekistan Sum"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/UzbekistanSum,
   :cmns-id/identifies :fibo-fnd-acc-4217/UzbekistanSum,
   :db/ident :fibo-fnd-acc-4217/UZS,
   :fibo-fnd-rel-rel/hasTag "UZS",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "UZS",
   :skos/definition #xsd/langString
                     "the currency identifier for Uzbekistan Sum@en"})

(def UgandaShilling
  "the currency Uganda Shilling"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Uganda,
   :db/ident :fibo-fnd-acc-4217/UgandaShilling,
   :fibo-fnd-acc-cur/hasMinorUnit "0",
   :fibo-fnd-acc-cur/hasNumericCode "800",
   :fibo-fnd-rel-rel/hasTextualName "Uganda Shilling",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Uganda Shilling",
   :skos/definition #xsd/langString "the currency Uganda Shilling@en"})

(def UnidadPrevisional
  "the funds Unidad Previsional"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Uruguay,
   :db/ident :fibo-fnd-acc-4217/UnidadPrevisional,
   :fibo-fnd-acc-cur/hasCurrency :fibo-fnd-acc-4217/PesoUruguayo,
   :fibo-fnd-acc-cur/hasMinorUnit "4",
   :fibo-fnd-acc-cur/hasNumericCode "927",
   :fibo-fnd-rel-rel/hasTextualName "Unidad Previsional",
   :rdf/type [:fibo-fnd-acc-cur/Funds :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Unidad Previsional",
   :skos/definition #xsd/langString "the funds Unidad Previsional@en",
   :skos/note
   #xsd/langString
    "The Unidad Previsional (UP) is a daily accounting unit that tracks changes to the nominal wage index. The value of UP is expressed in terms of Uruguayan Pesos per UP, with the initial value of one peso (UYU 1.00) on 04/30/2018. The institution responsible for the calculation and publication is the Instituto Nacional de Estadística (National Bureau of Statistics) according to Law 19,608.@en"})

(def UnidaddeFomento
  "the funds Unidad de Fomento"
  {:cmns-av/explanatoryNote
   "The CLF is a daily economically-financial unit calculated by the Central Bank of Chile according to inflation (as measured by the Chilean Consumer Price Index of the previous month). The value of the CLF is expressed in terms of Chilean Pesos per CLF. The use of CLF has been widely extended to all types of bank loans, financial investments (time deposits, mortgages and other public or private indexed instruments), contracts and fees in some cases.",
   :cmns-cxtdsg/isUsedBy :lcc-3166-1/Chile,
   :db/ident :fibo-fnd-acc-4217/UnidaddeFomento,
   :fibo-fnd-acc-cur/hasCurrency :fibo-fnd-acc-4217/ChileanPeso,
   :fibo-fnd-acc-cur/hasMinorUnit "4",
   :fibo-fnd-acc-cur/hasNumericCode "990",
   :fibo-fnd-rel-rel/hasTextualName "Unidad de Fomento",
   :rdf/type [:fibo-fnd-acc-cur/Funds :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Unidad de Fomento",
   :skos/definition #xsd/langString "the funds Unidad de Fomento@en"})

(def UnidaddeValorReal
  "the funds Unidad de Valor Real"
  {:cmns-av/explanatoryNote
   "The UVR is a daily account unit set by the Central Bank of Colombia according to the variation in the Consumer Price Index of Colombia. The value of UVR is expressed in terms of Colombian Pesos per UVR. It is used to denominate and update mortgage loans and some public debt bonds.",
   :cmns-cxtdsg/isUsedBy :lcc-3166-1/Colombia,
   :db/ident :fibo-fnd-acc-4217/UnidaddeValorReal,
   :fibo-fnd-acc-cur/hasCurrency :fibo-fnd-acc-4217/ColombianPeso,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "970",
   :fibo-fnd-rel-rel/hasTextualName "Unidad de Valor Real",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-acc-cur/Funds],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Unidad de Valor Real",
   :skos/definition #xsd/langString "the funds Unidad de Valor Real@en"})

(def UruguayPesoenUnidadesIndexadas_UI
  "the funds Uruguay Peso en Unidades Indexadas (UI)"
  {:cmns-av/explanatoryNote
   "The UYI (URUIURUI) is used for issuance of debt instruments by the Uruguayan government in the international global bond market. It is calculated based on an established methodology using underlying inflationary statistics in the Uruguayan market. (Introduced in 2002).",
   :cmns-cxtdsg/isUsedBy :lcc-3166-1/Uruguay,
   :db/ident :fibo-fnd-acc-4217/UruguayPesoenUnidadesIndexadas_UI,
   :fibo-fnd-acc-cur/hasCurrency :fibo-fnd-acc-4217/PesoUruguayo,
   :fibo-fnd-acc-cur/hasMinorUnit "0",
   :fibo-fnd-acc-cur/hasNumericCode "940",
   :fibo-fnd-rel-rel/hasTextualName "Uruguay Peso en Unidades Indexadas (UI)",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-acc-cur/Funds],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Uruguay Peso en Unidades Indexadas (UI)",
   :skos/definition #xsd/langString
                     "the funds Uruguay Peso en Unidades Indexadas (UI)@en"})

(def UzbekistanSum
  "the currency Uzbekistan Sum"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Uzbekistan,
   :db/ident :fibo-fnd-acc-4217/UzbekistanSum,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "860",
   :fibo-fnd-rel-rel/hasTextualName "Uzbekistan Sum",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Uzbekistan Sum",
   :skos/definition #xsd/langString "the currency Uzbekistan Sum@en"})

(def VED
  "the currency identifier for Bolívar Soberano"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/BolívarSoberano,
   :cmns-id/identifies :fibo-fnd-acc-4217/BolívarSoberano,
   :db/ident :fibo-fnd-acc-4217/VED,
   :fibo-fnd-rel-rel/hasTag "VED",
   :rdf/type [:owl/NamedIndividual :fibo-fnd-acc-cur/CurrencyIdentifier],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "VED",
   :skos/definition #xsd/langString
                     "the currency identifier for Bolívar Soberano@en",
   :skos/note
   #xsd/langString
    "Note that the numeric currency code corresponding to the Bolívar Soberano with currency code 'VED' is 926.@en"})

(def VES
  "the currency identifier for Bolívar Soberano"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/BolívarSoberano,
   :cmns-id/identifies :fibo-fnd-acc-4217/BolívarSoberano,
   :db/ident :fibo-fnd-acc-4217/VES,
   :fibo-fnd-rel-rel/hasTag "VES",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "VES",
   :skos/definition #xsd/langString
                     "the currency identifier for Bolívar Soberano@en",
   :skos/note
   #xsd/langString
    "Note that the numeric currency code corresponding to the Bolívar Soberano with currency code 'VES' is 928.@en"})

(def VND
  "the currency identifier for Dong"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/Dong,
   :cmns-id/identifies :fibo-fnd-acc-4217/Dong,
   :db/ident :fibo-fnd-acc-4217/VND,
   :fibo-fnd-rel-rel/hasTag "VND",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "VND",
   :skos/definition #xsd/langString "the currency identifier for Dong@en"})

(def VUV
  "the currency identifier for Vatu"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/Vatu,
   :cmns-id/identifies :fibo-fnd-acc-4217/Vatu,
   :db/ident :fibo-fnd-acc-4217/VUV,
   :fibo-fnd-rel-rel/hasTag "VUV",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "VUV",
   :skos/definition #xsd/langString "the currency identifier for Vatu@en"})

(def Vatu
  "the currency Vatu"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Vanuatu,
   :db/ident :fibo-fnd-acc-4217/Vatu,
   :fibo-fnd-acc-cur/hasMinorUnit "0",
   :fibo-fnd-acc-cur/hasNumericCode "548",
   :fibo-fnd-rel-rel/hasTextualName "Vatu",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Vatu",
   :skos/definition #xsd/langString "the currency Vatu@en"})

(def WIREuro
  "the funds WIR Euro"
  {:cmns-av/explanatoryNote
   "WIR Euro - WIR Bank for use with the EFTPOS system with their own WIR-card and the Electronic Banking Services",
   :cmns-cxtdsg/isUsedBy :lcc-3166-1/Switzerland,
   :db/ident :fibo-fnd-acc-4217/WIREuro,
   :fibo-fnd-acc-cur/hasCurrency :fibo-fnd-acc-4217/Euro,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "947",
   :fibo-fnd-rel-rel/hasTextualName "WIR Euro",
   :rdf/type [:fibo-fnd-acc-cur/Funds :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "WIR Euro",
   :skos/definition #xsd/langString "the funds WIR Euro@en"})

(def WIRFranc
  "the funds WIR Franc"
  {:cmns-av/explanatoryNote
   "WIR Franc - WIR Bank for use with the EFTPOS system with their own WIR-card and the Electronic Banking Services.",
   :cmns-cxtdsg/isUsedBy :lcc-3166-1/Switzerland,
   :db/ident :fibo-fnd-acc-4217/WIRFranc,
   :fibo-fnd-acc-cur/hasCurrency :fibo-fnd-acc-4217/SwissFranc,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "948",
   :fibo-fnd-rel-rel/hasTextualName "WIR Franc",
   :rdf/type [:fibo-fnd-acc-cur/Funds :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "WIR Franc",
   :skos/definition #xsd/langString "the funds WIR Franc@en"})

(def WST
  "the currency identifier for Tala"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/Tala,
   :cmns-id/identifies :fibo-fnd-acc-4217/Tala,
   :db/ident :fibo-fnd-acc-4217/WST,
   :fibo-fnd-rel-rel/hasTag "WST",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "WST",
   :skos/definition #xsd/langString "the currency identifier for Tala@en"})

(def Won
  "the currency Won"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/KoreaRepublicOf,
   :db/ident :fibo-fnd-acc-4217/Won,
   :fibo-fnd-acc-cur/hasMinorUnit "0",
   :fibo-fnd-acc-cur/hasNumericCode "410",
   :fibo-fnd-rel-rel/hasTextualName "Won",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Won",
   :skos/definition #xsd/langString "the currency Won@en"})

(def XAF
  "the currency identifier for CFA Franc BEAC"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/CFAFrancBEAC,
   :cmns-id/identifies :fibo-fnd-acc-4217/CFAFrancBEAC,
   :db/ident :fibo-fnd-acc-4217/XAF,
   :fibo-fnd-rel-rel/hasTag "XAF",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "XAF",
   :skos/definition #xsd/langString
                     "the currency identifier for CFA Franc BEAC@en"})

(def XAG
  "identifier for the currency whose unit is one troy ounce of the precious metal Silver"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/Silver,
   :cmns-id/identifies :fibo-fnd-acc-4217/Silver,
   :db/ident :fibo-fnd-acc-4217/XAG,
   :fibo-fnd-rel-rel/hasTag "XAG",
   :rdf/type [:fibo-fnd-acc-cur/PreciousMetalIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "XAG",
   :skos/definition
   #xsd/langString
    "identifier for the currency whose unit is one troy ounce of the precious metal Silver@en"})

(def XAU
  "identifier for the currency whose unit is one troy ounce of the precious metal Gold"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/Gold,
   :cmns-id/identifies :fibo-fnd-acc-4217/Gold,
   :db/ident :fibo-fnd-acc-4217/XAU,
   :fibo-fnd-rel-rel/hasTag "XAU",
   :rdf/type [:fibo-fnd-acc-cur/PreciousMetalIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "XAU",
   :skos/definition
   #xsd/langString
    "identifier for the currency whose unit is one troy ounce of the precious metal Gold@en"})

(def XBA
  "the identifier for Bond Markets Unit European Composite Unit (EURCO)"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes
   :fibo-fnd-acc-4217/BondMarketsUnitEuropeanCompositeUnit_EURCO,
   :cmns-id/identifies
   :fibo-fnd-acc-4217/BondMarketsUnitEuropeanCompositeUnit_EURCO,
   :db/ident :fibo-fnd-acc-4217/XBA,
   :fibo-fnd-rel-rel/hasTag "XBA",
   :rdf/type [:fibo-fnd-acc-cur/UnitOfAccountIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "XBA",
   :skos/definition
   #xsd/langString
    "the identifier for Bond Markets Unit European Composite Unit (EURCO)@en"})

(def XBB
  "the identifier for Bond Markets Unit European Monetary Unit (E.M.U.-6)"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes
   :fibo-fnd-acc-4217/BondMarketsUnitEuropeanMonetaryUnit_EMU-6,
   :cmns-id/identifies
   :fibo-fnd-acc-4217/BondMarketsUnitEuropeanMonetaryUnit_EMU-6,
   :db/ident :fibo-fnd-acc-4217/XBB,
   :fibo-fnd-rel-rel/hasTag "XBB",
   :rdf/type [:fibo-fnd-acc-cur/UnitOfAccountIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "XBB",
   :skos/definition
   #xsd/langString
    "the identifier for Bond Markets Unit European Monetary Unit (E.M.U.-6)@en"})

(def XBC
  "the identifier for Bond Markets Unit European Unit of Account 9 (E.U.A.-9)"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes
   :fibo-fnd-acc-4217/BondMarketsUnitEuropeanUnitofAccount9_EUA-9,
   :cmns-id/identifies
   :fibo-fnd-acc-4217/BondMarketsUnitEuropeanUnitofAccount9_EUA-9,
   :db/ident :fibo-fnd-acc-4217/XBC,
   :fibo-fnd-rel-rel/hasTag "XBC",
   :rdf/type [:fibo-fnd-acc-cur/UnitOfAccountIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "XBC",
   :skos/definition
   #xsd/langString
    "the identifier for Bond Markets Unit European Unit of Account 9 (E.U.A.-9)@en"})

(def XBD
  "the identifier for Bond Markets Unit European Unit of Account 17 (E.U.A.-17)"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes
   :fibo-fnd-acc-4217/BondMarketsUnitEuropeanUnitofAccount17_EUA-17,
   :cmns-id/identifies
   :fibo-fnd-acc-4217/BondMarketsUnitEuropeanUnitofAccount17_EUA-17,
   :db/ident :fibo-fnd-acc-4217/XBD,
   :fibo-fnd-rel-rel/hasTag "XBD",
   :rdf/type [:fibo-fnd-acc-cur/UnitOfAccountIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "XBD",
   :skos/definition
   #xsd/langString
    "the identifier for Bond Markets Unit European Unit of Account 17 (E.U.A.-17)@en"})

(def XCD
  "the currency identifier for East Caribbean Dollar"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/EastCaribbeanDollar,
   :cmns-id/identifies :fibo-fnd-acc-4217/EastCaribbeanDollar,
   :db/ident :fibo-fnd-acc-4217/XCD,
   :fibo-fnd-rel-rel/hasTag "XCD",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "XCD",
   :skos/definition #xsd/langString
                     "the currency identifier for East Caribbean Dollar@en"})

(def XDR
  "the IMF's identifier for SDR (Special Drawing Right)"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/SDR_SpecialDrawingRight,
   :cmns-id/identifies :fibo-fnd-acc-4217/SDR_SpecialDrawingRight,
   :db/ident :fibo-fnd-acc-4217/XDR,
   :fibo-fnd-rel-rel/hasTag "XDR",
   :rdf/type [:fibo-fnd-acc-cur/UnitOfAccountIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "XDR",
   :skos/definition #xsd/langString
                     "the IMF's identifier for SDR (Special Drawing Right)@en"})

(def XOF
  "the currency identifier for CFA Franc BCEAO"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/CFAFrancBCEAO,
   :cmns-id/identifies :fibo-fnd-acc-4217/CFAFrancBCEAO,
   :db/ident :fibo-fnd-acc-4217/XOF,
   :fibo-fnd-rel-rel/hasTag "XOF",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "XOF",
   :skos/definition #xsd/langString
                     "the currency identifier for CFA Franc BCEAO@en"})

(def XPD
  "identifier for the currency whose unit is one troy ounce of the precious metal Palladium"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/Palladium,
   :cmns-id/identifies :fibo-fnd-acc-4217/Palladium,
   :db/ident :fibo-fnd-acc-4217/XPD,
   :fibo-fnd-rel-rel/hasTag "XPD",
   :rdf/type [:fibo-fnd-acc-cur/PreciousMetalIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "XPD",
   :skos/definition
   #xsd/langString
    "identifier for the currency whose unit is one troy ounce of the precious metal Palladium@en"})

(def XPF
  "the currency identifier for CFP Franc"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/CFPFranc,
   :cmns-id/identifies :fibo-fnd-acc-4217/CFPFranc,
   :db/ident :fibo-fnd-acc-4217/XPF,
   :fibo-fnd-rel-rel/hasTag "XPF",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "XPF",
   :skos/definition #xsd/langString "the currency identifier for CFP Franc@en"})

(def XPT
  "identifier for the currency whose unit is one troy ounce of the precious metal Platinum"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/Platinum,
   :cmns-id/identifies :fibo-fnd-acc-4217/Platinum,
   :db/ident :fibo-fnd-acc-4217/XPT,
   :fibo-fnd-rel-rel/hasTag "XPT",
   :rdf/type [:fibo-fnd-acc-cur/PreciousMetalIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "XPT",
   :skos/definition
   #xsd/langString
    "identifier for the currency whose unit is one troy ounce of the precious metal Platinum@en"})

(def XSU
  "the currency identifier for Sucre"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/Sucre,
   :cmns-id/identifies :fibo-fnd-acc-4217/Sucre,
   :db/ident :fibo-fnd-acc-4217/XSU,
   :fibo-fnd-rel-rel/hasTag "XSU",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "XSU",
   :skos/definition #xsd/langString "the currency identifier for Sucre@en"})

(def XTS
  "Codes specifically reserved for testing purposes"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :db/ident :fibo-fnd-acc-4217/XTS,
   :fibo-fnd-rel-rel/hasTag "XTS",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "XTS",
   :skos/definition #xsd/langString
                     "Codes specifically reserved for testing purposes@en"})

(def XUA
  "the identifier for ADB Unit of Account"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/ADBUnitofAccount,
   :cmns-id/identifies :fibo-fnd-acc-4217/ADBUnitofAccount,
   :db/ident :fibo-fnd-acc-4217/XUA,
   :fibo-fnd-rel-rel/hasTag "XUA",
   :rdf/type [:fibo-fnd-acc-cur/UnitOfAccountIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "XUA",
   :skos/definition #xsd/langString
                     "the identifier for ADB Unit of Account@en"})

(def XXX
  "The codes assigned for transactions where no currency is involved"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :db/ident :fibo-fnd-acc-4217/XXX,
   :fibo-fnd-rel-rel/hasTag "XXX",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "XXX",
   :skos/definition
   #xsd/langString
    "The codes assigned for transactions where no currency is involved@en"})

(def YER
  "the currency identifier for Yemeni Rial"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/YemeniRial,
   :cmns-id/identifies :fibo-fnd-acc-4217/YemeniRial,
   :db/ident :fibo-fnd-acc-4217/YER,
   :fibo-fnd-rel-rel/hasTag "YER",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "YER",
   :skos/definition #xsd/langString
                     "the currency identifier for Yemeni Rial@en"})

(def YemeniRial
  "the currency Yemeni Rial"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Yemen,
   :db/ident :fibo-fnd-acc-4217/YemeniRial,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "886",
   :fibo-fnd-rel-rel/hasTextualName "Yemeni Rial",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Yemeni Rial",
   :skos/definition #xsd/langString "the currency Yemeni Rial@en"})

(def Yen
  "the currency Yen"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Japan,
   :db/ident :fibo-fnd-acc-4217/Yen,
   :fibo-fnd-acc-cur/hasMinorUnit "0",
   :fibo-fnd-acc-cur/hasNumericCode "392",
   :fibo-fnd-rel-rel/hasTextualName "Yen",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Yen",
   :skos/definition #xsd/langString "the currency Yen@en"})

(def YuanRenminbi
  "the currency Yuan Renminbi"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/China,
   :db/ident :fibo-fnd-acc-4217/YuanRenminbi,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "156",
   :fibo-fnd-rel-rel/hasTextualName "Yuan Renminbi",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Yuan Renminbi",
   :skos/definition #xsd/langString "the currency Yuan Renminbi@en"})

(def ZAR
  "the currency identifier for Rand"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/Rand,
   :cmns-id/identifies :fibo-fnd-acc-4217/Rand,
   :db/ident :fibo-fnd-acc-4217/ZAR,
   :fibo-fnd-rel-rel/hasTag "ZAR",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "ZAR",
   :skos/definition #xsd/langString "the currency identifier for Rand@en"})

(def ZMW
  "the currency identifier for Zambian Kwacha"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/ZambianKwacha,
   :cmns-id/identifies :fibo-fnd-acc-4217/ZambianKwacha,
   :db/ident :fibo-fnd-acc-4217/ZMW,
   :fibo-fnd-rel-rel/hasTag "ZMW",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "ZMW",
   :skos/definition #xsd/langString
                     "the currency identifier for Zambian Kwacha@en"})

(def ZWL
  "the currency identifier for Zimbabwe Dollar"
  {:cmns-col/isMemberOf :fibo-fnd-acc-4217/ISO4217-CodeSet,
   :cmns-dsg/denotes :fibo-fnd-acc-4217/ZimbabweDollar,
   :cmns-id/identifies :fibo-fnd-acc-4217/ZimbabweDollar,
   :db/ident :fibo-fnd-acc-4217/ZWL,
   :fibo-fnd-rel-rel/hasTag "ZWL",
   :rdf/type [:fibo-fnd-acc-cur/CurrencyIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "ZWL",
   :skos/definition #xsd/langString
                     "the currency identifier for Zimbabwe Dollar@en"})

(def ZambianKwacha
  "the currency Zambian Kwacha"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Zambia,
   :db/ident :fibo-fnd-acc-4217/ZambianKwacha,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "967",
   :fibo-fnd-rel-rel/hasTextualName "Zambian Kwacha",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Zambian Kwacha",
   :skos/definition #xsd/langString "the currency Zambian Kwacha@en"})

(def ZimbabweDollar
  "the currency Zimbabwe Dollar"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Zimbabwe,
   :db/ident :fibo-fnd-acc-4217/ZimbabweDollar,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "932",
   :fibo-fnd-rel-rel/hasTextualName "Zimbabwe Dollar",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Zimbabwe Dollar",
   :skos/definition #xsd/langString "the currency Zimbabwe Dollar@en"})

(def Zloty
  "the currency Zloty"
  {:cmns-cxtdsg/isUsedBy :lcc-3166-1/Poland,
   :db/ident :fibo-fnd-acc-4217/Zloty,
   :fibo-fnd-acc-cur/hasMinorUnit "2",
   :fibo-fnd-acc-cur/hasNumericCode "985",
   :fibo-fnd-rel-rel/hasTextualName "Zloty",
   :rdf/type [:fibo-fnd-acc-cur/Currency :owl/NamedIndividual],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/"},
   :rdfs/label "Zloty",
   :skos/definition #xsd/langString "the currency Zloty@en"})