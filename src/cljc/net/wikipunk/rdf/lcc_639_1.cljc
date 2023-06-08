(ns net.wikipunk.rdf.lcc-639-1
  "ISO 639-1 Language Codes Ontology"
  {:dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
   :owl/versionIRI
   "https://www.omg.org/spec/LCC/20211101/Languages/ISO639-1-LanguageCodes/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "lcc-639-1"
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
    "lcc-lr" "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "lcc-639-1",
   :rdfa/uri "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ISO 639-1 Language Codes Ontology",
   :rdfs/seeAlso ["https://id.loc.gov/vocabulary/iso639-1.html"
                  "http://www.loc.gov/standards/iso639-2/php/code_list.php/"
                  "https://www.omg.org/spec/LCC/Languages/AboutLanguages/"
                  "https://www.omg.org/spec/LCC/AboutLCC/"],
   :skos/changeNote
   ["The https://www.omg.org/spec/LCC/20211101/Languages/ISO639-2-LanguageCodes.rdf version of this ontology has been revised to incorporate recently published Library of Congress links to their URIs for the language codes, minor revisions to metadata about the languages to be in sync with the LoC site, and is current as of 29 October 2021."
    "The https://www.omg.org/spec/LCC/20190201/Languages/ISO639-2-LanguageCodes.rdf version of this ontology is current as of 14 February 2019, based on the US Library of Congress site."
    "The http://www.omg.org/spec/LCC/20151101/Languages/ISO639-1-LanguageCodes.rdf version of this ontology has been revised to reflect the issues addressed by the LCC 1.0 FTF report.  The codes themselves are current as of 31 July 2017, based on the US Library of Congress site."],
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright ["Copyright (c) 2015-2021 Thematix Partners LLC"
                  "Copyright (c) 2015-2017 Unisys"
                  "Copyright (c) 2019-2021 agnos.ai"
                  "Copyright (c) 2015-2019 Adaptive Inc."
                  "Copyright (c) 2015-2021 Object Management Group, Inc."],
   :sm/dependsOn
   "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
   :sm/fileAbbreviation "lcc-639-1",
   :sm/fileAbstract
   "This ontology represents the subset of the ISO 639 standard that provides the language names and actual codes for ISO 639-1.",
   :sm/filename "ISO639-1-LanguageCodes.rdf"}
  (:refer-clojure :exclude [or]))

(def Abkhazian
  "Abkhazian language"
  {:db/ident :lcc-639-1/Abkhazian,
   :lcc-lr/hasEnglishName #voc/lstr "Abkhazian@en",
   :lcc-lr/hasFrenchName #voc/lstr "abkhaze@fr",
   :lcc-lr/hasGermanName #voc/lstr "Abchasisch@de",
   :lcc-lr/hasIndigenousName "apṕsua bysžwa",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ab",
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Abkhazian",
   :skos/definition "Abkhazian language"})

(def Afar
  "Afar language"
  {:db/ident :lcc-639-1/Afar,
   :lcc-lr/hasEnglishName #voc/lstr "Afar@en",
   :lcc-lr/hasFrenchName #voc/lstr "afar@fr",
   :lcc-lr/hasGermanName #voc/lstr "Danakil-Sprache@de",
   :lcc-lr/hasIndigenousName "afar",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/aa",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Afar",
   :skos/definition "Afar language"})

(def Afrikaans
  "Afrikaans language"
  {:db/ident :lcc-639-1/Afrikaans,
   :lcc-lr/hasEnglishName #voc/lstr "Afrikaans@en",
   :lcc-lr/hasFrenchName #voc/lstr "afrikaans@fr",
   :lcc-lr/hasGermanName #voc/lstr "Afrikaans@de",
   :lcc-lr/hasIndigenousName "Afrikaans",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/af",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Afrikaans",
   :skos/definition "Afrikaans language"})

(def Akan
  "Akan language"
  {:db/ident :lcc-639-1/Akan,
   :lcc-lr/hasEnglishName #voc/lstr "Akan@en",
   :lcc-lr/hasFrenchName #voc/lstr "akan@fr",
   :lcc-lr/hasGermanName #voc/lstr "Akan-Sprache@de",
   :lcc-lr/hasIndigenousName "akana",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ak",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/Macrolanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Akan",
   :skos/definition "Akan language"})

(def Albanian
  "Albanian languages"
  {:db/ident :lcc-639-1/Albanian,
   :lcc-lr/hasEnglishName #voc/lstr "Albanian@en",
   :lcc-lr/hasFrenchName #voc/lstr "albanais@fr",
   :lcc-lr/hasGermanName #voc/lstr "Albanisch@de",
   :lcc-lr/hasIndigenousName "shqip",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/sq",
   :rdf/type
   [:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Albanian",
   :skos/definition "Albanian languages"})

(def Amharic
  "Amharic language"
  {:db/ident :lcc-639-1/Amharic,
   :lcc-lr/hasEnglishName #voc/lstr "Amharic@en",
   :lcc-lr/hasFrenchName #voc/lstr "amharique@fr",
   :lcc-lr/hasGermanName #voc/lstr "Amharisch@de",
   :lcc-lr/hasIndigenousName "amarinja",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/am",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Amharic",
   :skos/definition "Amharic language"})

(def Arabic
  "Arabic language"
  {:db/ident :lcc-639-1/Arabic,
   :lcc-lr/hasEnglishName #voc/lstr "Arabic@en",
   :lcc-lr/hasFrenchName #voc/lstr "arabe@fr",
   :lcc-lr/hasGermanName #voc/lstr "Arabisch@de",
   :lcc-lr/hasIndigenousName "'arabiy",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ar",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/Macrolanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Arabic",
   :skos/definition "Arabic language"})

(def Aragonese
  "Aragonese language"
  {:db/ident :lcc-639-1/Aragonese,
   :lcc-lr/hasEnglishName #voc/lstr "Aragonese@en",
   :lcc-lr/hasFrenchName #voc/lstr "aragonais@fr",
   :lcc-lr/hasGermanName #voc/lstr "Aragonesisch@de",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/an",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Aragonese",
   :skos/definition "Aragonese language"})

(def Armenian
  "Armenian language"
  {:db/ident :lcc-639-1/Armenian,
   :lcc-lr/hasEnglishName #voc/lstr "Armenian@en",
   :lcc-lr/hasFrenchName #voc/lstr "arménien@fr",
   :lcc-lr/hasGermanName #voc/lstr "Armenisch@de",
   :lcc-lr/hasIndigenousName "hayeren lezow",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/hy",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Armenian",
   :skos/definition "Armenian language"})

(def Assamese
  "Assamese language"
  {:db/ident :lcc-639-1/Assamese,
   :lcc-lr/hasEnglishName #voc/lstr "Assamese@en",
   :lcc-lr/hasFrenchName #voc/lstr "assamais@fr",
   :lcc-lr/hasGermanName #voc/lstr "Assamesisch@de",
   :lcc-lr/hasIndigenousName "asamī",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/as",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Assamese",
   :skos/definition "Assamese language"})

(def Avaric
  "Avaric language"
  {:db/ident :lcc-639-1/Avaric,
   :lcc-lr/hasEnglishName #voc/lstr "Avaric@en",
   :lcc-lr/hasFrenchName #voc/lstr "avar@fr",
   :lcc-lr/hasGermanName #voc/lstr "Awarisch@de",
   :lcc-lr/hasIndigenousName "avar mac‡",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/av",
   :rdf/type
   [:lcc-lr/LivingLanguage :owl/NamedIndividual :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Avaric",
   :skos/definition "Avaric language"})

(def Avestan
  "Avestan language"
  {:db/ident :lcc-639-1/Avestan,
   :lcc-lr/hasEnglishName #voc/lstr "Avestan@en",
   :lcc-lr/hasFrenchName #voc/lstr "avestique@fr",
   :lcc-lr/hasGermanName #voc/lstr "Avestisch@de",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ae",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/AncientLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Avestan",
   :skos/definition "Avestan language"})

(def Aymara
  "Aymara language"
  {:db/ident :lcc-639-1/Aymara,
   :lcc-lr/hasEnglishName #voc/lstr "Aymara@en",
   :lcc-lr/hasFrenchName #voc/lstr "aymara@fr",
   :lcc-lr/hasGermanName #voc/lstr "Aymará-Sprache@de",
   :lcc-lr/hasIndigenousName "aymara",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ay",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/Macrolanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Aymara",
   :skos/definition "Aymara language"})

(def Azerbaijani
  "Azerbaijani language"
  {:db/ident :lcc-639-1/Azerbaijani,
   :lcc-lr/hasEnglishName #voc/lstr "Azerbaijani@en",
   :lcc-lr/hasFrenchName #voc/lstr "azéri@fr",
   :lcc-lr/hasGermanName #voc/lstr "Aserbeidschanisch@de",
   :lcc-lr/hasIndigenousName "azǝrbaycan dil",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/az",
   :rdf/type
   [:lcc-lr/LivingLanguage :owl/NamedIndividual :lcc-lr/Macrolanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Azerbaijani",
   :skos/definition "Azerbaijani language"})

(def Bambara
  "Bambara language"
  {:db/ident :lcc-639-1/Bambara,
   :lcc-lr/hasEnglishName #voc/lstr "Bambara@en",
   :lcc-lr/hasFrenchName #voc/lstr "bambara@fr",
   :lcc-lr/hasGermanName #voc/lstr "Bambara-Sprache@de",
   :lcc-lr/hasIndigenousName "bambankan",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/bm",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Bambara",
   :skos/definition "Bambara language"})

(def Bashkir
  "Bashkir language"
  {:db/ident :lcc-639-1/Bashkir,
   :lcc-lr/hasEnglishName #voc/lstr "Bashkir@en",
   :lcc-lr/hasFrenchName #voc/lstr "bachkir@fr",
   :lcc-lr/hasGermanName #voc/lstr "Baschkirisch@de",
   :lcc-lr/hasIndigenousName "bašǩort",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ba",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Bashkir",
   :skos/definition "Bashkir language"})

(def Basque
  "Basque language"
  {:db/ident :lcc-639-1/Basque,
   :lcc-lr/hasEnglishName #voc/lstr "Basque@en",
   :lcc-lr/hasFrenchName #voc/lstr "basque@fr",
   :lcc-lr/hasGermanName #voc/lstr "Baskisch@de",
   :lcc-lr/hasIndigenousName ["euskera" "euskara"],
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/eu",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Basque",
   :skos/definition "Basque language"})

(def Belarusian
  "Belarusian language"
  {:db/ident :lcc-639-1/Belarusian,
   :lcc-lr/hasEnglishName #voc/lstr "Belarusian@en",
   :lcc-lr/hasFrenchName #voc/lstr "biélorusse@fr",
   :lcc-lr/hasGermanName #voc/lstr "Weißrussisch@de",
   :lcc-lr/hasIndigenousName "belaruskaâ mova",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/be",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Belarusian",
   :skos/definition "Belarusian language"})

(def Bengali
  "Bengali language"
  {:db/ident :lcc-639-1/Bengali,
   :lcc-lr/hasEnglishName #voc/lstr "Bengali@en",
   :lcc-lr/hasFrenchName #voc/lstr "bengali@fr",
   :lcc-lr/hasGermanName #voc/lstr "Bengali@de",
   :lcc-lr/hasIndigenousName "bāṅlā",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/bn",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Bengali",
   :skos/definition "Bengali language"})

(def BihariLanguages
  "Bihari languages"
  {:db/ident :lcc-639-1/BihariLanguages,
   :lcc-lr/hasEnglishName #voc/lstr "Bihari languages@en",
   :lcc-lr/hasFrenchName #voc/lstr "langues biharis@fr",
   :lcc-lr/hasGermanName #voc/lstr "Bihari (Andere)@de",
   :lcc-lr/hasIndigenousName "bihārī",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/bh",
   :rdf/type [:lcc-lr/LanguageFamily :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Bihari languages"})

(def Bislama
  "Bislama language"
  {:db/ident :lcc-639-1/Bislama,
   :lcc-lr/hasEnglishName #voc/lstr "Bislama@en",
   :lcc-lr/hasFrenchName #voc/lstr "bichlamar@fr",
   :lcc-lr/hasGermanName #voc/lstr "Beach-la-mar@de",
   :lcc-lr/hasIndigenousName "bislama",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/bi",
   :rdf/type
   [:lcc-lr/LivingLanguage :owl/NamedIndividual :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Bislama",
   :skos/definition "Bislama language"})

(def Bosnian
  "Bosnian language"
  {:db/ident :lcc-639-1/Bosnian,
   :lcc-lr/hasEnglishName #voc/lstr "Bosnian@en",
   :lcc-lr/hasFrenchName #voc/lstr "bosniaque@fr",
   :lcc-lr/hasGermanName #voc/lstr "Bosnisch@de",
   :lcc-lr/hasIndigenousName "bosanski (jezik)",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/bs",
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Bosnian",
   :skos/definition "Bosnian language"})

(def Breton
  "Breton language"
  {:db/ident :lcc-639-1/Breton,
   :lcc-lr/hasEnglishName #voc/lstr "Breton@en",
   :lcc-lr/hasFrenchName #voc/lstr "breton@fr",
   :lcc-lr/hasGermanName #voc/lstr "Bretonisch@de",
   :lcc-lr/hasIndigenousName "Brezhoneg",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/br",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Breton",
   :skos/definition "Breton language"})

(def Bulgarian
  "Bulgarian language"
  {:db/ident :lcc-639-1/Bulgarian,
   :lcc-lr/hasEnglishName #voc/lstr "Bulgarian@en",
   :lcc-lr/hasFrenchName #voc/lstr "bulgare@fr",
   :lcc-lr/hasGermanName #voc/lstr "Bulgarisch@de",
   :lcc-lr/hasIndigenousName "b\"lgarski ezik",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/bg",
   :rdf/type
   [:lcc-lr/LivingLanguage :owl/NamedIndividual :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Bulgarian",
   :skos/definition "Bulgarian language"})

(def Burmese
  "Burmese language"
  {:db/ident :lcc-639-1/Burmese,
   :lcc-lr/hasEnglishName #voc/lstr "Burmese@en",
   :lcc-lr/hasFrenchName #voc/lstr "birman@fr",
   :lcc-lr/hasGermanName #voc/lstr "Birmanisch@de",
   :lcc-lr/hasIndigenousName "myanmasa",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/my",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Burmese",
   :skos/definition "Burmese language"})

(def Catalan
  "Catalan language"
  {:db/ident :lcc-639-1/Catalan,
   :lcc-lr/hasEnglishName [#voc/lstr "Valencian@en" #voc/lstr "Catalan@en"],
   :lcc-lr/hasFrenchName [#voc/lstr "catalan@fr" #voc/lstr "valencien@fr"],
   :lcc-lr/hasGermanName #voc/lstr "Katalanisch@de",
   :lcc-lr/hasIndigenousName "català",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ca",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Catalan",
   :skos/definition "Catalan language"})

(def CentralKhmer
  "Central Khmer language"
  {:db/ident :lcc-639-1/CentralKhmer,
   :lcc-lr/hasEnglishName #voc/lstr "Central Khmer@en",
   :lcc-lr/hasFrenchName #voc/lstr "khmer central@fr",
   :lcc-lr/hasGermanName #voc/lstr "Kambodschanisch@de",
   :lcc-lr/hasIndigenousName "khmêr",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/km",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Central Khmer",
   :skos/definition "Central Khmer language"})

(def Chamorro
  "Chamorro language"
  {:db/ident :lcc-639-1/Chamorro,
   :lcc-lr/hasEnglishName #voc/lstr "Chamorro@en",
   :lcc-lr/hasFrenchName #voc/lstr "chamorro@fr",
   :lcc-lr/hasGermanName #voc/lstr "Chamorro-Sprache@de",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ch",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Chamorro",
   :skos/definition "Chamorro language"})

(def Chechen
  "Chechen language"
  {:db/ident :lcc-639-1/Chechen,
   :lcc-lr/hasEnglishName #voc/lstr "Chechen@en",
   :lcc-lr/hasFrenchName #voc/lstr "tchétchène@fr",
   :lcc-lr/hasGermanName #voc/lstr "Tschetschenisch@de",
   :lcc-lr/hasIndigenousName ["nohčijn mott" "noxçiyn mott"],
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ce",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Chechen",
   :skos/definition "Chechen language"})

(def Chichewa
  "Chichewa language"
  {:db/ident :lcc-639-1/Chichewa,
   :lcc-lr/hasEnglishName
   [#voc/lstr "Chichewa@en" #voc/lstr "Nyanja@en" #voc/lstr "Chewa@en"],
   :lcc-lr/hasFrenchName
   [#voc/lstr "chichewa@fr" #voc/lstr "chewa@fr" #voc/lstr "nyanja@fr"],
   :lcc-lr/hasGermanName #voc/lstr "Nyanja-Sprache@de",
   :lcc-lr/hasIndigenousName ["tshichewa" "tshinyanja"],
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ny",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Chichewa",
   :skos/definition "Chichewa language"})

(def Chinese
  "Chinese languages"
  {:db/ident :lcc-639-1/Chinese,
   :lcc-lr/hasEnglishName #voc/lstr "Chinese@en",
   :lcc-lr/hasFrenchName #voc/lstr "chinois@fr",
   :lcc-lr/hasGermanName #voc/lstr "Chinesisch@de",
   :lcc-lr/hasIndigenousName "zhongwen",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/zh",
   :rdf/type
   [:lcc-lr/LivingLanguage :owl/NamedIndividual :lcc-lr/Macrolanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Chinese",
   :skos/definition "Chinese languages"})

(def ChurchSlavic
  "Church Slavic language"
  {:db/ident :lcc-639-1/ChurchSlavic,
   :lcc-lr/hasEnglishName [#voc/lstr "Church Slavonic@en"
                           #voc/lstr "Old Slavonic@en"
                           #voc/lstr "Old Church Slavonic@en"
                           #voc/lstr "Old Bulgarian@en"
                           #voc/lstr "Church Slavic@en"],
   :lcc-lr/hasFrenchName [#voc/lstr "vieux slave@fr"
                          #voc/lstr "vieux bulgare@fr"
                          #voc/lstr "slavon liturgique@fr"
                          #voc/lstr "slavon d'église@fr"],
   :lcc-lr/hasGermanName #voc/lstr "Kirchenslawisch@de",
   :lcc-lr/hasIndigenousName "cerkovno-slavânskij",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/cu",
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/AncientLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Church Slavic",
   :skos/definition "Church Slavic language"})

(def Chuvash
  "Chuvash language"
  {:db/ident :lcc-639-1/Chuvash,
   :lcc-lr/hasEnglishName #voc/lstr "Chuvash@en",
   :lcc-lr/hasFrenchName #voc/lstr "tchouvache@fr",
   :lcc-lr/hasGermanName #voc/lstr "Tschuwaschisch@de",
   :lcc-lr/hasIndigenousName "čǎvaš čělhi",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/cv",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Chuvash",
   :skos/definition "Chuvash language"})

(def Cornish
  "Cornish language"
  {:db/ident :lcc-639-1/Cornish,
   :lcc-lr/hasEnglishName #voc/lstr "Cornish@en",
   :lcc-lr/hasFrenchName #voc/lstr "cornique@fr",
   :lcc-lr/hasGermanName #voc/lstr "Kornisch@de",
   :lcc-lr/hasIndigenousName "Kernewek",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/kw",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Cornish",
   :skos/definition "Cornish language"})

(def Corsican
  "Corsican language"
  {:db/ident :lcc-639-1/Corsican,
   :lcc-lr/hasEnglishName #voc/lstr "Corsican@en",
   :lcc-lr/hasFrenchName #voc/lstr "corse@fr",
   :lcc-lr/hasGermanName #voc/lstr "Korsisch@de",
   :lcc-lr/hasIndigenousName "corsu",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/co",
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Corsican",
   :skos/definition "Corsican language"})

(def Cree
  "Cree languages"
  {:db/ident :lcc-639-1/Cree,
   :lcc-lr/hasEnglishName #voc/lstr "Cree@en",
   :lcc-lr/hasFrenchName #voc/lstr "cree@fr",
   :lcc-lr/hasGermanName #voc/lstr "Cree-Sprache@de",
   :lcc-lr/hasIndigenousName "nêhiyawa",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/cr",
   :rdf/type
   [:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Cree",
   :skos/definition "Cree languages"})

(def Croatian
  "Croatian language"
  {:db/ident :lcc-639-1/Croatian,
   :lcc-lr/hasEnglishName #voc/lstr "Croatian@en",
   :lcc-lr/hasFrenchName #voc/lstr "croate@fr",
   :lcc-lr/hasGermanName #voc/lstr "Kroatisch@de",
   :lcc-lr/hasIndigenousName "hrvatski jezik",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/hr",
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Croatian",
   :skos/definition "Croatian language"})

(def Czech
  "Czech language"
  {:db/ident :lcc-639-1/Czech,
   :lcc-lr/hasEnglishName #voc/lstr "Czech@en",
   :lcc-lr/hasFrenchName #voc/lstr "tchèque@fr",
   :lcc-lr/hasGermanName #voc/lstr "Tschechisch@de",
   :lcc-lr/hasIndigenousName "český jazyk",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/cs",
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Czech",
   :skos/definition "Czech language"})

(def Danish
  "Danish language"
  {:db/ident :lcc-639-1/Danish,
   :lcc-lr/hasEnglishName #voc/lstr "Danish@en",
   :lcc-lr/hasFrenchName #voc/lstr "danois@fr",
   :lcc-lr/hasGermanName #voc/lstr "Dänisch@de",
   :lcc-lr/hasIndigenousName "dansk",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/da",
   :rdf/type
   [:lcc-lr/LivingLanguage :owl/NamedIndividual :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Danish",
   :skos/definition "Danish language"})

(def Dhivehi
  "Divehi language"
  {:db/ident :lcc-639-1/Dhivehi,
   :lcc-lr/hasEnglishName
   [#voc/lstr "Divehi@en" #voc/lstr "Dhivehi@en" #voc/lstr "Maldivian@en"],
   :lcc-lr/hasFrenchName #voc/lstr "maldivien@fr",
   :lcc-lr/hasGermanName #voc/lstr "Maledivisch@de",
   :lcc-lr/hasIndigenousName "dhivehi",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/dv",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Dhivehi",
   :skos/definition "Divehi language"})

(def Dutch
  "Dutch language"
  {:db/ident :lcc-639-1/Dutch,
   :lcc-lr/hasEnglishName [#voc/lstr "Dutch@en" #voc/lstr "Flemish@en"],
   :lcc-lr/hasFrenchName [#voc/lstr "néerlandais@fr" #voc/lstr "flamand@fr"],
   :lcc-lr/hasGermanName #voc/lstr "Niederländisch@de",
   :lcc-lr/hasIndigenousName "Nederlands",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/nl",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Dutch",
   :skos/definition "Dutch language"})

(def Dzongkha
  "Dzongkha language"
  {:db/ident :lcc-639-1/Dzongkha,
   :lcc-lr/hasEnglishName #voc/lstr "Dzongkha@en",
   :lcc-lr/hasFrenchName #voc/lstr "dzongkha@fr",
   :lcc-lr/hasGermanName #voc/lstr "Dzongkha@de",
   :lcc-lr/hasIndigenousName "dzongkha",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/dz",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Dzongkha",
   :skos/definition "Dzongkha language"})

(def English
  "English language"
  {:db/ident :lcc-639-1/English,
   :lcc-lr/hasEnglishName #voc/lstr "English@en",
   :lcc-lr/hasFrenchName #voc/lstr "anglais@fr",
   :lcc-lr/hasGermanName #voc/lstr "Englisch@de",
   :lcc-lr/hasIndigenousName "English",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/en",
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "English",
   :skos/definition "English language"})

(def Esperanto
  "Esperanto language"
  {:db/ident :lcc-639-1/Esperanto,
   :lcc-lr/hasEnglishName #voc/lstr "Esperanto@en",
   :lcc-lr/hasFrenchName #voc/lstr "espéranto@fr",
   :lcc-lr/hasGermanName #voc/lstr "Esperanto@de",
   :lcc-lr/hasIndigenousName "esperanto",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/eo",
   :rdf/type
   [:lcc-lr/ArtificialLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Esperanto",
   :skos/definition "Esperanto language"})

(def Estonian
  "Estonian language"
  {:db/ident :lcc-639-1/Estonian,
   :lcc-lr/hasEnglishName #voc/lstr "Estonian@en",
   :lcc-lr/hasFrenchName #voc/lstr "estonien@fr",
   :lcc-lr/hasGermanName #voc/lstr "Estnisch@de",
   :lcc-lr/hasIndigenousName "eesti keel",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/et",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Estonian",
   :skos/definition "Estonian language"})

(def Ewe
  "Ewe language"
  {:db/ident :lcc-639-1/Ewe,
   :lcc-lr/hasEnglishName #voc/lstr "Ewe@en",
   :lcc-lr/hasFrenchName #voc/lstr "éwé@fr",
   :lcc-lr/hasGermanName #voc/lstr "Ewe-Sprache@de",
   :lcc-lr/hasIndigenousName "eve",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ee",
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Ewe",
   :skos/definition "Ewe language"})

(def Faroese
  "Faroese language"
  {:db/ident :lcc-639-1/Faroese,
   :lcc-lr/hasEnglishName #voc/lstr "Faroese@en",
   :lcc-lr/hasFrenchName #voc/lstr "féroïen@fr",
   :lcc-lr/hasGermanName #voc/lstr "Färöisch@de",
   :lcc-lr/hasIndigenousName "føroyskt",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/fo",
   :rdf/type
   [:lcc-lr/LivingLanguage :owl/NamedIndividual :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Faroese",
   :skos/definition "Faroese language"})

(def Fijian
  "Fijian language"
  {:db/ident :lcc-639-1/Fijian,
   :lcc-lr/hasEnglishName #voc/lstr "Fijian@en",
   :lcc-lr/hasFrenchName #voc/lstr "fidjien@fr",
   :lcc-lr/hasGermanName #voc/lstr "Fidschi-Sprache@de",
   :lcc-lr/hasIndigenousName "Na Vosa Vakaviti",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/fj",
   :rdf/type
   [:lcc-lr/LivingLanguage :owl/NamedIndividual :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Fijian",
   :skos/definition "Fijian language"})

(def Finnish
  "Finnish language"
  {:db/ident :lcc-639-1/Finnish,
   :lcc-lr/hasEnglishName #voc/lstr "Finnish@en",
   :lcc-lr/hasFrenchName #voc/lstr "finnois@fr",
   :lcc-lr/hasGermanName #voc/lstr "Finnisch@de",
   :lcc-lr/hasIndigenousName ["suomi" "suomen kieli"],
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/fi",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Finnish",
   :skos/definition "Finnish language"})

(def French
  "French language"
  {:db/ident :lcc-639-1/French,
   :lcc-lr/hasEnglishName #voc/lstr "French@en",
   :lcc-lr/hasFrenchName #voc/lstr "français@fr",
   :lcc-lr/hasGermanName #voc/lstr "Französisch@de",
   :lcc-lr/hasIndigenousName "français",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/fr",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "French",
   :skos/definition "French language"})

(def Fulah
  "Fulah languages"
  {:db/ident :lcc-639-1/Fulah,
   :lcc-lr/hasEnglishName #voc/lstr "Fulah@en",
   :lcc-lr/hasFrenchName #voc/lstr "peul@fr",
   :lcc-lr/hasGermanName #voc/lstr "Ful@de",
   :lcc-lr/hasIndigenousName "fulfulde",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ff",
   :rdf/type
   [:lcc-lr/LivingLanguage :owl/NamedIndividual :lcc-lr/Macrolanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Fulah",
   :skos/definition "Fulah languages"})

(def Gaelic
  "Gaelic language"
  {:db/ident :lcc-639-1/Gaelic,
   :lcc-lr/hasEnglishName [#voc/lstr "Gaelic@en"
                           #voc/lstr "Scottish Gaelic@en"],
   :lcc-lr/hasFrenchName [#voc/lstr "gaélique@fr"
                          #voc/lstr "gaélique écossais@fr"],
   :lcc-lr/hasGermanName #voc/lstr "Gälisch-Schottisch@de",
   :lcc-lr/hasIndigenousName "Gàidhlig",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/gd",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Gaelic",
   :skos/definition "Gaelic language"})

(def Galician
  "Galician; Gallegan language"
  {:db/ident :lcc-639-1/Galician,
   :lcc-lr/hasEnglishName #voc/lstr "Galician@en",
   :lcc-lr/hasFrenchName #voc/lstr "galicien@fr",
   :lcc-lr/hasGermanName #voc/lstr "Galicisch@de",
   :lcc-lr/hasIndigenousName "galego",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/gl",
   :rdf/type
   [:lcc-lr/LivingLanguage :owl/NamedIndividual :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Galician",
   :skos/definition "Galician; Gallegan language"})

(def Ganda
  "Ganda language"
  {:db/ident :lcc-639-1/Ganda,
   :lcc-lr/hasEnglishName #voc/lstr "Ganda@en",
   :lcc-lr/hasFrenchName #voc/lstr "ganda@fr",
   :lcc-lr/hasGermanName #voc/lstr "Ganda-Sprache@de",
   :lcc-lr/hasIndigenousName "luganda",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/lg",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Ganda",
   :skos/definition "Ganda language"})

(def Georgian
  "Georgian language"
  {:db/ident :lcc-639-1/Georgian,
   :lcc-lr/hasEnglishName #voc/lstr "Georgian@en",
   :lcc-lr/hasFrenchName #voc/lstr "géorgien@fr",
   :lcc-lr/hasGermanName #voc/lstr "Georgisch@de",
   :lcc-lr/hasIndigenousName "k'art'uli ena",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ka",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Georgian",
   :skos/definition "Georgian language"})

(def German
  "German language"
  {:db/ident :lcc-639-1/German,
   :lcc-lr/hasEnglishName #voc/lstr "German@en",
   :lcc-lr/hasFrenchName #voc/lstr "allemand@fr",
   :lcc-lr/hasGermanName #voc/lstr "Deutsch@de",
   :lcc-lr/hasIndigenousName "Deutsch",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/de",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "German",
   :skos/definition "German language"})

(def Guarani
  "Guarani language"
  {:db/ident :lcc-639-1/Guarani,
   :lcc-lr/hasEnglishName #voc/lstr "Guarani@en",
   :lcc-lr/hasFrenchName #voc/lstr "guarani@fr",
   :lcc-lr/hasGermanName #voc/lstr "Guaraní-Sprache@de",
   :lcc-lr/hasIndigenousName "guarani",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/gn",
   :rdf/type
   [:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Guarani",
   :skos/definition "Guarani language"})

(def Gujarati
  "Gujarati language"
  {:db/ident :lcc-639-1/Gujarati,
   :lcc-lr/hasEnglishName #voc/lstr "Gujarati@en",
   :lcc-lr/hasFrenchName #voc/lstr "goudjrati@fr",
   :lcc-lr/hasGermanName #voc/lstr "Gujarati-Sprache@de",
   :lcc-lr/hasIndigenousName "gujarātī",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/gu",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Gujarati",
   :skos/definition "Gujarati language"})

(def Haitian
  "Haitian; Haitian Creole language"
  {:db/ident :lcc-639-1/Haitian,
   :lcc-lr/hasEnglishName [#voc/lstr "Haitian@en"
                           #voc/lstr "Haitian Creole@en"],
   :lcc-lr/hasFrenchName [#voc/lstr "créole haïtien@fr" #voc/lstr "haïtien@fr"],
   :lcc-lr/hasGermanName #voc/lstr "Haïtien (Haiti-Kreolisch)@de",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ht",
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Haitian",
   :skos/definition "Haitian; Haitian Creole language"})

(def Hausa
  "Hausa language"
  {:db/ident :lcc-639-1/Hausa,
   :lcc-lr/hasEnglishName #voc/lstr "Hausa@en",
   :lcc-lr/hasFrenchName #voc/lstr "haoussa@fr",
   :lcc-lr/hasGermanName #voc/lstr "Haussa-Sprache@de",
   :lcc-lr/hasIndigenousName "hausa",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ha",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Hausa",
   :skos/definition "Hausa language"})

(def Hebrew
  "Hebrew language"
  {:db/ident :lcc-639-1/Hebrew,
   :lcc-lr/hasEnglishName #voc/lstr "Hebrew@en",
   :lcc-lr/hasFrenchName #voc/lstr "hébreu@fr",
   :lcc-lr/hasGermanName #voc/lstr "Hebräisch@de",
   :lcc-lr/hasIndigenousName "ivrit",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/he",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Hebrew",
   :skos/definition "Hebrew language"})

(def Herero
  "Herero language"
  {:db/ident :lcc-639-1/Herero,
   :lcc-lr/hasEnglishName #voc/lstr "Herero@en",
   :lcc-lr/hasFrenchName #voc/lstr "herero@fr",
   :lcc-lr/hasGermanName #voc/lstr "Herero-Sprache@de",
   :lcc-lr/hasIndigenousName "otshiherero",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/hz",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Herero",
   :skos/definition "Herero language"})

(def Hindi
  "Hindi language"
  {:db/ident :lcc-639-1/Hindi,
   :lcc-lr/hasEnglishName #voc/lstr "Hindi@en",
   :lcc-lr/hasFrenchName #voc/lstr "hindi@fr",
   :lcc-lr/hasGermanName #voc/lstr "Hindi@de",
   :lcc-lr/hasIndigenousName "hindī",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/hi",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Hindi",
   :skos/definition "Hindi language"})

(def HiriMotu
  "Hiri Motu language"
  {:db/ident :lcc-639-1/HiriMotu,
   :lcc-lr/hasEnglishName #voc/lstr "Hiri Motu@en",
   :lcc-lr/hasFrenchName #voc/lstr "hiri motu@fr",
   :lcc-lr/hasGermanName #voc/lstr "Hiri-Motu@de",
   :lcc-lr/hasIndigenousName "Hiri Motu",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ho",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Hiri Motu",
   :skos/definition "Hiri Motu language"})

(def Hungarian
  "Hungarian language"
  {:db/ident :lcc-639-1/Hungarian,
   :lcc-lr/hasEnglishName #voc/lstr "Hungarian@en",
   :lcc-lr/hasFrenchName #voc/lstr "hongrois@fr",
   :lcc-lr/hasGermanName #voc/lstr "Ungarisch@de",
   :lcc-lr/hasIndigenousName "magyar nyelv",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/hu",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Hungarian",
   :skos/definition "Hungarian language"})

(def ISO639-1-CodeSet
  "the set of language identifiers that make up the ISO 639-1 specification"
  {:db/ident :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type
   [:lcc-lr/IdentificationScheme :lcc-lr/CodeSet :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ISO 639-1 code set",
   :rdfs/seeAlso
   ["https://id.loc.gov/vocabulary/iso639-1.html"
    "http://www.infoterm.info/standardization/iso_639_1_2002.php"],
   :skos/definition
   "the set of language identifiers that make up the ISO 639-1 specification"})

(def Icelandic
  "Icelandic language"
  {:db/ident :lcc-639-1/Icelandic,
   :lcc-lr/hasEnglishName #voc/lstr "Icelandic@en",
   :lcc-lr/hasFrenchName #voc/lstr "islandais@fr",
   :lcc-lr/hasGermanName #voc/lstr "Isländisch@de",
   :lcc-lr/hasIndigenousName "íslenska",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/is",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Icelandic",
   :skos/definition "Icelandic language"})

(def Ido
  "Ido language"
  {:db/ident :lcc-639-1/Ido,
   :lcc-lr/hasEnglishName #voc/lstr "Ido@en",
   :lcc-lr/hasFrenchName #voc/lstr "ido@fr",
   :lcc-lr/hasGermanName #voc/lstr "Ido@de",
   :lcc-lr/hasIndigenousName "ido ",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/io",
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/ArtificialLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Ido",
   :skos/definition "Ido language"})

(def Igbo
  "Igbo language"
  {:db/ident :lcc-639-1/Igbo,
   :lcc-lr/hasEnglishName #voc/lstr "Igbo@en",
   :lcc-lr/hasFrenchName #voc/lstr "igbo@fr",
   :lcc-lr/hasGermanName #voc/lstr "Ibo-Sprache@de",
   :lcc-lr/hasIndigenousName "igbo",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ig",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Igbo",
   :skos/definition "Igbo language"})

(def Indonesian
  "Indonesian language"
  {:db/ident :lcc-639-1/Indonesian,
   :lcc-lr/hasEnglishName #voc/lstr "Indonesian@en",
   :lcc-lr/hasFrenchName #voc/lstr "indonésien@fr",
   :lcc-lr/hasGermanName #voc/lstr "Bahasa Indonesia@de",
   :lcc-lr/hasIndigenousName "bahasa Indonesia",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/id",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Indonesian",
   :skos/definition "Indonesian language"})

(def Interlingua
  "Interlingua (International Auxiliary Language Association) language"
  {:db/ident :lcc-639-1/Interlingua,
   :lcc-lr/hasEnglishName
   #voc/lstr "Interlingua (International Auxiliary Language Association)@en",
   :lcc-lr/hasFrenchName #voc/lstr
                          "interlingua (langue auxiliaire internationale)@fr",
   :lcc-lr/hasGermanName #voc/lstr "Interlingua@de",
   :lcc-lr/hasIndigenousName "interlingua",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ia",
   :rdf/type
   [:lcc-lr/ArtificialLanguage :owl/NamedIndividual :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Interlingua",
   :skos/definition
   "Interlingua (International Auxiliary Language Association) language"})

(def Interlingue
  "Interlingue language"
  {:db/ident :lcc-639-1/Interlingue,
   :lcc-lr/hasEnglishName [#voc/lstr "Occidental@en"
                           #voc/lstr "Interlingue@en"],
   :lcc-lr/hasFrenchName #voc/lstr "interlingue@fr",
   :lcc-lr/hasGermanName #voc/lstr "Interlingue@de",
   :lcc-lr/hasIndigenousName "interlingue",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ie",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/ArtificialLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Interlingue",
   :skos/definition "Interlingue language"})

(def Inuktitut
  "Inuktitut language"
  {:db/ident :lcc-639-1/Inuktitut,
   :lcc-lr/hasEnglishName #voc/lstr "Inuktitut@en",
   :lcc-lr/hasFrenchName #voc/lstr "inuktitut@fr",
   :lcc-lr/hasGermanName #voc/lstr "Inuktitut@de",
   :lcc-lr/hasIndigenousName "inuktitut",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/iu",
   :rdf/type
   [:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Inuktitut",
   :skos/definition "Inuktitut language"})

(def Inupiaq
  "Inupiaq language"
  {:db/ident :lcc-639-1/Inupiaq,
   :lcc-lr/hasEnglishName #voc/lstr "Inupiaq@en",
   :lcc-lr/hasFrenchName #voc/lstr "inupiaq@fr",
   :lcc-lr/hasGermanName #voc/lstr "Inupik@de",
   :lcc-lr/hasIndigenousName "inupiaq",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ik",
   :rdf/type
   [:lcc-lr/LivingLanguage :owl/NamedIndividual :lcc-lr/Macrolanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Inupiaq",
   :skos/definition "Inupiaq language"})

(def Irish
  "Irish language"
  {:db/ident :lcc-639-1/Irish,
   :lcc-lr/hasEnglishName #voc/lstr "Irish@en",
   :lcc-lr/hasFrenchName #voc/lstr "irlandais@fr",
   :lcc-lr/hasGermanName #voc/lstr "Irisch@de",
   :lcc-lr/hasIndigenousName "Gaeilge",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ga",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Irish",
   :skos/definition "Irish language"})

(def Italian
  "Italian language"
  {:db/ident :lcc-639-1/Italian,
   :lcc-lr/hasEnglishName #voc/lstr "Italian@en",
   :lcc-lr/hasFrenchName #voc/lstr "italien@fr",
   :lcc-lr/hasGermanName #voc/lstr "Italienisch@de",
   :lcc-lr/hasIndigenousName "italiano",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/it",
   :rdf/type
   [:lcc-lr/LivingLanguage :owl/NamedIndividual :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Italian",
   :skos/definition "Italian language"})

(def Japanese
  "Japanese language"
  {:db/ident :lcc-639-1/Japanese,
   :lcc-lr/hasEnglishName #voc/lstr "Japanese@en",
   :lcc-lr/hasFrenchName #voc/lstr "japonais@fr",
   :lcc-lr/hasGermanName #voc/lstr "Japanisch@de",
   :lcc-lr/hasIndigenousName ["nippongo" "nihongo"],
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ja",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Japanese",
   :skos/definition "Japanese language"})

(def Javanese
  "Javanese language"
  {:db/ident :lcc-639-1/Javanese,
   :lcc-lr/hasEnglishName #voc/lstr "Javanese@en",
   :lcc-lr/hasFrenchName #voc/lstr "javanais@fr",
   :lcc-lr/hasGermanName #voc/lstr "Javanisch@de",
   :lcc-lr/hasIndigenousName "bahasa Jawa",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/jv",
   :rdf/type
   [:lcc-lr/LivingLanguage :owl/NamedIndividual :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Javanese",
   :skos/definition "Javanese language"})

(def Kalaallisut
  "Kalaallisut language"
  {:db/ident :lcc-639-1/Kalaallisut,
   :lcc-lr/hasEnglishName [#voc/lstr "Greenlandic@en"
                           #voc/lstr "Kalaallisut@en"],
   :lcc-lr/hasFrenchName #voc/lstr "groenlandais@fr",
   :lcc-lr/hasGermanName #voc/lstr "Grönländisch@de",
   :lcc-lr/hasIndigenousName "kalaallisut",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/kl",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Kalaallisut",
   :skos/definition "Kalaallisut language"})

(def Kannada
  "Kannada language"
  {:db/ident :lcc-639-1/Kannada,
   :lcc-lr/hasEnglishName #voc/lstr "Kannada@en",
   :lcc-lr/hasFrenchName #voc/lstr "kannada@fr",
   :lcc-lr/hasGermanName #voc/lstr "Kannada@de",
   :lcc-lr/hasIndigenousName "kannaḍa",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/kn",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Kannada",
   :skos/definition "Kannada language"})

(def Kanuri
  "Kanuri language"
  {:db/ident :lcc-639-1/Kanuri,
   :lcc-lr/hasEnglishName #voc/lstr "Kanuri@en",
   :lcc-lr/hasFrenchName #voc/lstr "kanouri@fr",
   :lcc-lr/hasGermanName #voc/lstr "Kanuri-Sprache@de",
   :lcc-lr/hasIndigenousName "kanuri",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/kr",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/Macrolanguage :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Kanuri",
   :skos/definition "Kanuri language"})

(def Kashmiri
  "Kashmiri language"
  {:db/ident :lcc-639-1/Kashmiri,
   :lcc-lr/hasEnglishName #voc/lstr "Kashmiri@en",
   :lcc-lr/hasFrenchName #voc/lstr "kashmiri@fr",
   :lcc-lr/hasGermanName #voc/lstr "Kaschmiri@de",
   :lcc-lr/hasIndigenousName "kaśmīrī",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ks",
   :rdf/type
   [:lcc-lr/LivingLanguage :owl/NamedIndividual :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Kashmiri",
   :skos/definition "Kashmiri language"})

(def Kazakh
  "Kazakh language"
  {:db/ident :lcc-639-1/Kazakh,
   :lcc-lr/hasEnglishName #voc/lstr "Kazakh@en",
   :lcc-lr/hasFrenchName #voc/lstr "kazakh@fr",
   :lcc-lr/hasGermanName #voc/lstr "Kasachisch@de",
   :lcc-lr/hasIndigenousName "ķazaķ (tili)",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/kk",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Kazakh",
   :skos/definition "Kazakh language"})

(def Kikuyu
  "Kikuyu language"
  {:db/ident :lcc-639-1/Kikuyu,
   :lcc-lr/hasEnglishName [#voc/lstr "Kikuyu@en" #voc/lstr "Gikuyu@en"],
   :lcc-lr/hasFrenchName #voc/lstr "kikuyu@fr",
   :lcc-lr/hasGermanName #voc/lstr "Kikuyu-Sprache@de",
   :lcc-lr/hasIndigenousName "Gikuyu",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ki",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Kikuyu",
   :skos/definition "Kikuyu language"})

(def Kinyarwanda
  "Kinyarwanda language"
  {:db/ident :lcc-639-1/Kinyarwanda,
   :lcc-lr/hasEnglishName #voc/lstr "Kinyarwanda@en",
   :lcc-lr/hasFrenchName #voc/lstr "kinyarwanda@fr",
   :lcc-lr/hasGermanName #voc/lstr "Rwanda-Sprache@de",
   :lcc-lr/hasIndigenousName "kinyarwanda",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/rw",
   :rdf/type
   [:lcc-lr/LivingLanguage :owl/NamedIndividual :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Kinyarwanda",
   :skos/definition "Kinyarwanda language"})

(def Kirghiz
  "Kirghiz language"
  {:db/ident :lcc-639-1/Kirghiz,
   :lcc-lr/hasEnglishName [#voc/lstr "Kyrgyz@en" #voc/lstr "Kirghiz@en"],
   :lcc-lr/hasFrenchName #voc/lstr "kirghiz@fr",
   :lcc-lr/hasGermanName #voc/lstr "Kirgisisch@de",
   :lcc-lr/hasIndigenousName "kyrgyz tili",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ky",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Kirghiz",
   :skos/definition "Kirghiz language"})

(def Komi
  "Komi language"
  {:db/ident :lcc-639-1/Komi,
   :lcc-lr/hasEnglishName #voc/lstr "Komi@en",
   :lcc-lr/hasFrenchName #voc/lstr "komi@fr",
   :lcc-lr/hasGermanName #voc/lstr "Komi-Sprache@de",
   :lcc-lr/hasIndigenousName "komi kyv",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/kv",
   :rdf/type
   [:lcc-lr/Macrolanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Komi",
   :skos/definition "Komi language"})

(def Kongo
  "Kongo languages"
  {:db/ident :lcc-639-1/Kongo,
   :lcc-lr/hasEnglishName #voc/lstr "Kongo@en",
   :lcc-lr/hasFrenchName #voc/lstr "kongo@fr",
   :lcc-lr/hasGermanName #voc/lstr "Kongo-Sprache@de",
   :lcc-lr/hasIndigenousName "kikongo",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/kg",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/Macrolanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Kongo",
   :skos/definition "Kongo languages"})

(def Korean
  "Korean language"
  {:db/ident :lcc-639-1/Korean,
   :lcc-lr/hasEnglishName #voc/lstr "Korean@en",
   :lcc-lr/hasFrenchName #voc/lstr "coréen@fr",
   :lcc-lr/hasGermanName #voc/lstr "Koreanisch@de",
   :lcc-lr/hasIndigenousName ["hanguk-o" "choson-o"],
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ko",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Korean",
   :skos/definition "Korean language"})

(def Kuanyama
  "Kuanyama language"
  {:db/ident :lcc-639-1/Kuanyama,
   :lcc-lr/hasEnglishName [#voc/lstr "Kuanyama@en" #voc/lstr "Kwanyama@en"],
   :lcc-lr/hasFrenchName [#voc/lstr "kwanyama@fr" #voc/lstr "kuanyama@fr"],
   :lcc-lr/hasGermanName #voc/lstr "Kwanyama-Sprache@de",
   :lcc-lr/hasIndigenousName "oshikwanyama",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/kj",
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Kuanyama",
   :skos/definition "Kuanyama language"})

(def Kurdish
  "Kurdish language"
  {:db/ident :lcc-639-1/Kurdish,
   :lcc-lr/hasEnglishName #voc/lstr "Kurdish@en",
   :lcc-lr/hasFrenchName #voc/lstr "kurde@fr",
   :lcc-lr/hasGermanName #voc/lstr "Kurdisch@de",
   :lcc-lr/hasIndigenousName "zimany kurdy",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ku",
   :rdf/type
   [:lcc-lr/Macrolanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Kurdish",
   :skos/definition "Kurdish language"})

(def Lao
  "Lao language"
  {:db/ident :lcc-639-1/Lao,
   :lcc-lr/hasEnglishName #voc/lstr "Lao@en",
   :lcc-lr/hasFrenchName #voc/lstr "lao@fr",
   :lcc-lr/hasGermanName #voc/lstr "Laotisch@de",
   :lcc-lr/hasIndigenousName "pha xa lao",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/lo",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Lao",
   :skos/definition "Lao language"})

(def Latin
  "Latin language"
  {:db/ident :lcc-639-1/Latin,
   :lcc-lr/hasEnglishName #voc/lstr "Latin@en",
   :lcc-lr/hasFrenchName #voc/lstr "latin@fr",
   :lcc-lr/hasGermanName #voc/lstr "Latein@de",
   :lcc-lr/hasIndigenousName "lingua latina",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/la",
   :rdf/type
   [:lcc-lr/AncientLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Latin",
   :skos/definition "Latin language"})

(def Latvian
  "Latvian language"
  {:db/ident :lcc-639-1/Latvian,
   :lcc-lr/hasEnglishName #voc/lstr "Latvian@en",
   :lcc-lr/hasFrenchName #voc/lstr "letton@fr",
   :lcc-lr/hasGermanName #voc/lstr "Lettisch@de",
   :lcc-lr/hasIndigenousName "latviešu valoda",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/lv",
   :rdf/type
   [:lcc-lr/LivingLanguage :owl/NamedIndividual :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Latvian",
   :skos/definition "Latvian language"})

(def Limburgan
  "Limburgan; Limburger; Limburgish language"
  {:db/ident :lcc-639-1/Limburgan,
   :lcc-lr/hasEnglishName [#voc/lstr "Limburgish@en"
                           #voc/lstr "Limburgan@en"
                           #voc/lstr "Limburger@en"],
   :lcc-lr/hasFrenchName #voc/lstr "limbourgeois@fr",
   :lcc-lr/hasGermanName #voc/lstr "Limburgisch@de",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/li",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Limburgan",
   :skos/definition "Limburgan; Limburger; Limburgish language"})

(def Lingala
  "Lingala language"
  {:db/ident :lcc-639-1/Lingala,
   :lcc-lr/hasEnglishName #voc/lstr "Lingala@en",
   :lcc-lr/hasFrenchName #voc/lstr "lingala@fr",
   :lcc-lr/hasGermanName #voc/lstr "Lingala@de",
   :lcc-lr/hasIndigenousName "lingala",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ln",
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Lingala",
   :skos/definition "Lingala language"})

(def Lithuanian
  "Lithuanian language"
  {:db/ident :lcc-639-1/Lithuanian,
   :lcc-lr/hasEnglishName #voc/lstr "Lithuanian@en",
   :lcc-lr/hasFrenchName #voc/lstr "lituanien@fr",
   :lcc-lr/hasGermanName #voc/lstr "Litauisch@de",
   :lcc-lr/hasIndigenousName "lietuvių kalba",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/lt",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Lithuanian",
   :skos/definition "Lithuanian language"})

(def LubaKatanga
  "Luba-Katanga language"
  {:db/ident :lcc-639-1/LubaKatanga,
   :lcc-lr/hasEnglishName #voc/lstr "Luba-Katanga@en",
   :lcc-lr/hasFrenchName #voc/lstr "luba-katanga@fr",
   :lcc-lr/hasGermanName #voc/lstr "Luba-Katanga-Sprache@de",
   :lcc-lr/hasIndigenousName "tshiluba",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/lu",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Luba-Katanga",
   :skos/definition "Luba-Katanga language"})

(def Luxembourgish
  "Luxembourgish language"
  {:db/ident :lcc-639-1/Luxembourgish,
   :lcc-lr/hasEnglishName [#voc/lstr "Luxembourgish@en"
                           #voc/lstr "Letzeburgesch@en"],
   :lcc-lr/hasFrenchName #voc/lstr "luxembourgeois@fr",
   :lcc-lr/hasGermanName #voc/lstr "Luxemburgisch@de",
   :lcc-lr/hasIndigenousName "lëtzebuergesch",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/lb",
   :rdf/type
   [:lcc-lr/LivingLanguage :owl/NamedIndividual :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Luxembourgish",
   :skos/definition "Luxembourgish language"})

(def Macedonian
  "Macedonian language"
  {:db/ident :lcc-639-1/Macedonian,
   :lcc-lr/hasEnglishName #voc/lstr "Macedonian@en",
   :lcc-lr/hasFrenchName #voc/lstr "macédonien@fr",
   :lcc-lr/hasGermanName #voc/lstr "Makedonisch@de",
   :lcc-lr/hasIndigenousName "makedonski",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/mk",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Macedonian",
   :skos/definition "Macedonian language"})

(def Malagasy
  "Malagasy languages"
  {:db/ident :lcc-639-1/Malagasy,
   :lcc-lr/hasEnglishName #voc/lstr "Malagasy@en",
   :lcc-lr/hasFrenchName #voc/lstr "malgache@fr",
   :lcc-lr/hasGermanName #voc/lstr "Malagassi-Sprache@de",
   :lcc-lr/hasIndigenousName "malagasy",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/mg",
   :rdf/type
   [:lcc-lr/LivingLanguage :owl/NamedIndividual :lcc-lr/Macrolanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Malagasy",
   :skos/definition "Malagasy languages"})

(def Malay
  "Malay macrolanguage"
  {:db/ident :lcc-639-1/Malay,
   :lcc-lr/hasEnglishName #voc/lstr "Malay (macrolanguage)@en",
   :lcc-lr/hasFrenchName #voc/lstr "malais@fr",
   :lcc-lr/hasGermanName #voc/lstr "Malaiisch@de",
   :lcc-lr/hasIndigenousName "bahasa Malaysia",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ms",
   :rdf/type
   [:lcc-lr/Macrolanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Malay",
   :skos/definition "Malay macrolanguage"})

(def Malayalam
  "Malayalam language"
  {:db/ident :lcc-639-1/Malayalam,
   :lcc-lr/hasEnglishName #voc/lstr "Malayalam@en",
   :lcc-lr/hasFrenchName #voc/lstr "malayalam@fr",
   :lcc-lr/hasGermanName #voc/lstr "Malayalam@de",
   :lcc-lr/hasIndigenousName "malayāḷaṁ",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ml",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Malayalam",
   :skos/definition "Malayalam language"})

(def Maltese
  "Maltese language"
  {:db/ident :lcc-639-1/Maltese,
   :lcc-lr/hasEnglishName #voc/lstr "Maltese@en",
   :lcc-lr/hasFrenchName #voc/lstr "maltais@fr",
   :lcc-lr/hasGermanName #voc/lstr "Maltesisch@de",
   :lcc-lr/hasIndigenousName "il-Malti",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/mt",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Maltese",
   :skos/definition "Maltese language"})

(def Manx
  "Manx language"
  {:db/ident :lcc-639-1/Manx,
   :lcc-lr/hasEnglishName #voc/lstr "Manx@en",
   :lcc-lr/hasFrenchName [#voc/lstr "manx@fr" #voc/lstr "mannois@fr"],
   :lcc-lr/hasGermanName #voc/lstr "Manx@de",
   :lcc-lr/hasIndigenousName "Gaelg",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/gv",
   :rdf/type
   [:lcc-lr/ExtinctLanguage :owl/NamedIndividual :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Manx",
   :skos/definition "Manx language"})

(def Maori
  "Maori language"
  {:db/ident :lcc-639-1/Maori,
   :lcc-lr/hasEnglishName #voc/lstr "Maori@en",
   :lcc-lr/hasFrenchName #voc/lstr "maori@fr",
   :lcc-lr/hasGermanName #voc/lstr "Maori-Sprache@de",
   :lcc-lr/hasIndigenousName "māori",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/mi",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Maori",
   :skos/definition "Maori language"})

(def Marathi
  "Marathi language"
  {:db/ident :lcc-639-1/Marathi,
   :lcc-lr/hasEnglishName #voc/lstr "Marathi@en",
   :lcc-lr/hasFrenchName #voc/lstr "marathe@fr",
   :lcc-lr/hasGermanName #voc/lstr "Marathi@de",
   :lcc-lr/hasIndigenousName "marāṭī",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/mr",
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Marathi",
   :skos/definition "Marathi language"})

(def Marshallese
  "Marshallese language"
  {:db/ident :lcc-639-1/Marshallese,
   :lcc-lr/hasEnglishName #voc/lstr "Marshallese@en",
   :lcc-lr/hasFrenchName #voc/lstr "marshall@fr",
   :lcc-lr/hasGermanName #voc/lstr "Marschallesisch@de",
   :lcc-lr/hasIndigenousName "M̧ajeł",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/mh",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Marshallese",
   :skos/definition "Marshallese language"})

(def ModernGreek
  "Modern Greek (post 1453-) language"
  {:db/ident :lcc-639-1/ModernGreek,
   :lcc-lr/hasEnglishName #voc/lstr "Greek, Modern (1453-)@en",
   :lcc-lr/hasFrenchName #voc/lstr "grec moderne (après 1453)@fr",
   :lcc-lr/hasGermanName #voc/lstr "Neugriechisch@de",
   :lcc-lr/hasIndigenousName "elliniká",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/el",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Modern Greek",
   :skos/definition "Modern Greek (post 1453-) language"})

(def Mongolian
  "Mongolian languages"
  {:db/ident :lcc-639-1/Mongolian,
   :lcc-lr/hasEnglishName #voc/lstr "Mongolian@en",
   :lcc-lr/hasFrenchName #voc/lstr "mongol@fr",
   :lcc-lr/hasGermanName #voc/lstr "Mongolisch@de",
   :lcc-lr/hasIndigenousName "mongol",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/mn",
   :rdf/type
   [:lcc-lr/Macrolanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Mongolian",
   :skos/definition "Mongolian languages"})

(def Nauru
  "Nauru language"
  {:db/ident :lcc-639-1/Nauru,
   :lcc-lr/hasEnglishName #voc/lstr "Nauru@en",
   :lcc-lr/hasFrenchName #voc/lstr "nauruan@fr",
   :lcc-lr/hasGermanName #voc/lstr "Nauruanisch@de",
   :lcc-lr/hasIndigenousName "nauru",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/na",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Nauru",
   :skos/definition "Nauru language"})

(def Navajo
  "Navajo language"
  {:db/ident :lcc-639-1/Navajo,
   :lcc-lr/hasEnglishName [#voc/lstr "Navaho@en" #voc/lstr "Navajo@en"],
   :lcc-lr/hasFrenchName #voc/lstr "navaho@fr",
   :lcc-lr/hasGermanName #voc/lstr "Navajo-Sprache@de",
   :lcc-lr/hasIndigenousName "diné bizaad",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/nv",
   :rdf/type
   [:lcc-lr/LivingLanguage :owl/NamedIndividual :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Navajo",
   :skos/definition "Navajo language"})

(def Ndonga
  "Ndonga language"
  {:db/ident :lcc-639-1/Ndonga,
   :lcc-lr/hasEnglishName #voc/lstr "Ndonga@en",
   :lcc-lr/hasFrenchName #voc/lstr "ndonga@fr",
   :lcc-lr/hasGermanName #voc/lstr "Ndonga@de",
   :lcc-lr/hasIndigenousName "oshindonga",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ng",
   :rdf/type
   [:lcc-lr/LivingLanguage :owl/NamedIndividual :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Ndonga",
   :skos/definition "Ndonga language"})

(def Nepali
  "Nepali language"
  {:db/ident :lcc-639-1/Nepali,
   :lcc-lr/hasEnglishName #voc/lstr "Nepali@en",
   :lcc-lr/hasFrenchName #voc/lstr "népalais@fr",
   :lcc-lr/hasGermanName #voc/lstr "Nepali@de",
   :lcc-lr/hasIndigenousName "nepālī",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ne",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Nepali",
   :skos/definition "Nepali language"})

(def NorthNdebele
  "North Ndebele language"
  {:db/ident :lcc-639-1/NorthNdebele,
   :lcc-lr/hasEnglishName [#voc/lstr "North Ndebele@en"
                           #voc/lstr "Ndebele, North@en"],
   :lcc-lr/hasFrenchName #voc/lstr "ndébélé du Nord@fr",
   :lcc-lr/hasGermanName #voc/lstr "Ndebele-Sprache (Simbabwe)@de",
   :lcc-lr/hasIndigenousName "isiNdebele",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/nd",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "North Ndebele",
   :skos/definition "North Ndebele language"})

(def NorthernSami
  "Northern Sami language"
  {:db/ident :lcc-639-1/NorthernSami,
   :lcc-lr/hasEnglishName #voc/lstr "Northern Sami@en",
   :lcc-lr/hasFrenchName #voc/lstr "sami du Nord@fr",
   :lcc-lr/hasGermanName #voc/lstr "Nordsaamisch@de",
   :lcc-lr/hasIndigenousName "davvisámegiella",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/se",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Northern Sami",
   :skos/definition "Northern Sami language"})

(def Norwegian
  "Norwegian language"
  {:db/ident :lcc-639-1/Norwegian,
   :lcc-lr/hasEnglishName #voc/lstr "Norwegian@en",
   :lcc-lr/hasFrenchName #voc/lstr "norvégien@fr",
   :lcc-lr/hasGermanName #voc/lstr "Norwegisch@de",
   :lcc-lr/hasIndigenousName "norsk",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/no",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/Macrolanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Norwegian",
   :skos/definition "Norwegian language"})

(def NorwegianBokmal
  "Norwegian Bokmal language"
  {:db/ident :lcc-639-1/NorwegianBokmal,
   :lcc-lr/hasEnglishName [#voc/lstr "Bokmål, Norwegian@en"
                           #voc/lstr "Norwegian Bokmål@en"],
   :lcc-lr/hasFrenchName #voc/lstr "norvégien bokmål@fr",
   :lcc-lr/hasGermanName #voc/lstr "Bokmål@de",
   :lcc-lr/hasIndigenousName "bokmål",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/nb",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Norwegian Bokmal",
   :skos/definition "Norwegian Bokmal language"})

(def NorwegianNynorsk
  "Norwegian Nynorsk language"
  {:db/ident :lcc-639-1/NorwegianNynorsk,
   :lcc-lr/hasEnglishName [#voc/lstr "Nynorsk, Norwegian@en"
                           #voc/lstr "Norwegian Nynorsk@en"],
   :lcc-lr/hasFrenchName #voc/lstr "norvégien nynorsk@fr",
   :lcc-lr/hasGermanName #voc/lstr "Nynorsk@de",
   :lcc-lr/hasIndigenousName "nynorsk",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/nn",
   :rdf/type
   [:lcc-lr/LivingLanguage :owl/NamedIndividual :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Norwegian Nynorsk",
   :skos/definition "Norwegian Nynorsk language"})

(def Nyanja
  {:db/ident       :lcc-639-1/Nyanja,
   :owl/deprecated true,
   :owl/sameAs     :lcc-639-1/Chichewa,
   :rdf/type       :owl/NamedIndividual})

(def Occitan
  "Occitan (post 1500) language"
  {:db/ident :lcc-639-1/Occitan,
   :lcc-lr/hasEnglishName #voc/lstr "Occitan (post 1500)@en",
   :lcc-lr/hasFrenchName #voc/lstr "occitan (après 1500)@fr",
   :lcc-lr/hasGermanName #voc/lstr "Okzitanisch@de",
   :lcc-lr/hasIndigenousName "occitan",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/oc",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Occitan",
   :skos/definition "Occitan (post 1500) language"})

(def Ojibwa
  "Ojibwa languages"
  {:db/ident :lcc-639-1/Ojibwa,
   :lcc-lr/hasEnglishName #voc/lstr "Ojibwa@en",
   :lcc-lr/hasFrenchName #voc/lstr "ojibwa@fr",
   :lcc-lr/hasGermanName #voc/lstr "Ojibwa-Sprache@de",
   :lcc-lr/hasIndigenousName ["ojibwe" "chippewa"],
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/oj",
   :rdf/type
   [:lcc-lr/Macrolanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Ojibwa",
   :skos/definition "Ojibwa languages"})

(def Oriya
  "Oriya language"
  {:db/ident :lcc-639-1/Oriya,
   :lcc-lr/hasEnglishName #voc/lstr "Oriya@en",
   :lcc-lr/hasFrenchName #voc/lstr "oriya@fr",
   :lcc-lr/hasGermanName #voc/lstr "Oriya-Sprache@de",
   :lcc-lr/hasIndigenousName "oṛiā",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/or",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Oriya",
   :skos/definition "Oriya language"})

(def Oromo
  "Oromo languages"
  {:db/ident :lcc-639-1/Oromo,
   :lcc-lr/hasEnglishName #voc/lstr "Oromo@en",
   :lcc-lr/hasFrenchName #voc/lstr "galla@fr",
   :lcc-lr/hasGermanName #voc/lstr "Galla-Sprache@de",
   :lcc-lr/hasIndigenousName "(afan) oromo",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/om",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/Macrolanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Oromo",
   :skos/definition "Oromo languages"})

(def Ossetian
  "Ossetian; Ossetic language"
  {:db/ident :lcc-639-1/Ossetian,
   :lcc-lr/hasEnglishName [#voc/lstr "Ossetian@en" #voc/lstr "Ossetic@en"],
   :lcc-lr/hasFrenchName #voc/lstr "ossète@fr",
   :lcc-lr/hasGermanName #voc/lstr "Ossetisch@de",
   :lcc-lr/hasIndigenousName "iron avzæg",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/os",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Ossetian",
   :skos/definition "Ossetian; Ossetic language"})

(def Pali
  "Pali language"
  {:db/ident :lcc-639-1/Pali,
   :lcc-lr/hasEnglishName #voc/lstr "Pali@en",
   :lcc-lr/hasFrenchName #voc/lstr "pali@fr",
   :lcc-lr/hasGermanName #voc/lstr "Pali@de",
   :lcc-lr/hasIndigenousName "pāli bhāsa",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/pi",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/AncientLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Pali",
   :skos/definition "Pali language"})

(def Panjabi
  "Panjabi language"
  {:db/ident :lcc-639-1/Panjabi,
   :lcc-lr/hasEnglishName [#voc/lstr "Panjabi@en" #voc/lstr "Punjabi@en"],
   :lcc-lr/hasFrenchName #voc/lstr "pendjabi@fr",
   :lcc-lr/hasGermanName #voc/lstr "Pandschabi-Sprache@de",
   :lcc-lr/hasIndigenousName "paṁjābī",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/pa",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Panjabi",
   :skos/definition "Panjabi language"})

(def Persian
  "Persian languages"
  {:db/ident :lcc-639-1/Persian,
   :lcc-lr/hasEnglishName #voc/lstr "Persian@en",
   :lcc-lr/hasFrenchName #voc/lstr "persan@fr",
   :lcc-lr/hasGermanName #voc/lstr "Persisch@de",
   :lcc-lr/hasIndigenousName "fârsy",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/fa",
   :rdf/type
   [:lcc-lr/LivingLanguage :owl/NamedIndividual :lcc-lr/Macrolanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Persian",
   :skos/definition "Persian languages"})

(def Polish
  "Polish language"
  {:db/ident :lcc-639-1/Polish,
   :lcc-lr/hasEnglishName #voc/lstr "Polish@en",
   :lcc-lr/hasFrenchName #voc/lstr "polonais@fr",
   :lcc-lr/hasGermanName #voc/lstr "Polnisch@de",
   :lcc-lr/hasIndigenousName "(język) polski",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/pl",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Polish",
   :skos/definition "Polish language"})

(def Portuguese
  "Portuguese language"
  {:db/ident :lcc-639-1/Portuguese,
   :lcc-lr/hasEnglishName #voc/lstr "Portuguese@en",
   :lcc-lr/hasFrenchName #voc/lstr "portugais@fr",
   :lcc-lr/hasGermanName #voc/lstr "Portugiesisch@de",
   :lcc-lr/hasIndigenousName "português",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/pt",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Portuguese",
   :skos/definition "Portuguese language"})

(def Pushto
  "Pushto languages"
  {:db/ident :lcc-639-1/Pushto,
   :lcc-lr/hasEnglishName [#voc/lstr "Pushto@en" #voc/lstr "Pashto@en"],
   :lcc-lr/hasFrenchName #voc/lstr "pachto@fr",
   :lcc-lr/hasGermanName #voc/lstr "Paschtu@de",
   :lcc-lr/hasIndigenousName "pashto",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ps",
   :rdf/type
   [:lcc-lr/LivingLanguage :owl/NamedIndividual :lcc-lr/Macrolanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Pushto",
   :skos/definition "Pushto languages"})

(def Quechua
  "Quechua languages"
  {:db/ident :lcc-639-1/Quechua,
   :lcc-lr/hasEnglishName #voc/lstr "Quechua@en",
   :lcc-lr/hasFrenchName [#voc/lstr "quechua@fr" #voc/lstr "quichua@fr"],
   :lcc-lr/hasGermanName #voc/lstr "Quechua-Sprache@de",
   :lcc-lr/hasIndigenousName "qhëtshwa",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/qu",
   :rdf/type
   [:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Quechua",
   :skos/definition "Quechua languages"})

(def Romanian
  "Romanian language"
  {:db/ident :lcc-639-1/Romanian,
   :lcc-lr/hasEnglishName
   [#voc/lstr "Moldovan@en" #voc/lstr "Romanian@en" #voc/lstr "Moldavian@en"],
   :lcc-lr/hasFrenchName [#voc/lstr "roumain@fr" #voc/lstr "moldave@fr"],
   :lcc-lr/hasGermanName #voc/lstr "Rumänisch@de",
   :lcc-lr/hasIndigenousName ["(limba) moldoveanǎ" "(limba) română"],
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ro",
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Romanian",
   :skos/definition "Romanian language"})

(def Romansh
  "Romansh language"
  {:db/ident :lcc-639-1/Romansh,
   :lcc-lr/hasEnglishName #voc/lstr "Romansh@en",
   :lcc-lr/hasFrenchName #voc/lstr "romanche@fr",
   :lcc-lr/hasGermanName #voc/lstr "Rätoromanisch@de",
   :lcc-lr/hasIndigenousName "romontsch",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/rm",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Romansh",
   :skos/definition "Romansh language"})

(def Rundi
  "Rundi language"
  {:db/ident :lcc-639-1/Rundi,
   :lcc-lr/hasEnglishName #voc/lstr "Rundi@en",
   :lcc-lr/hasFrenchName #voc/lstr "rundi@fr",
   :lcc-lr/hasGermanName #voc/lstr "Rundi-Sprache@de",
   :lcc-lr/hasIndigenousName "kirundi",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/rn",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Rundi",
   :skos/definition "Rundi language"})

(def Russian
  "Russian language"
  {:db/ident :lcc-639-1/Russian,
   :lcc-lr/hasEnglishName #voc/lstr "Russian@en",
   :lcc-lr/hasFrenchName #voc/lstr "russe@fr",
   :lcc-lr/hasGermanName #voc/lstr "Russisch@de",
   :lcc-lr/hasIndigenousName "russkij (âzyk)",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ru",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Russian",
   :skos/definition "Russian language"})

(def Samoan
  "Samoan language"
  {:db/ident :lcc-639-1/Samoan,
   :lcc-lr/hasEnglishName #voc/lstr "Samoan@en",
   :lcc-lr/hasFrenchName #voc/lstr "samoan@fr",
   :lcc-lr/hasGermanName #voc/lstr "Samoanisch@de",
   :lcc-lr/hasIndigenousName "samoa",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/sm",
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Samoan",
   :skos/definition "Samoan language"})

(def Sango
  "Sango language"
  {:db/ident :lcc-639-1/Sango,
   :lcc-lr/hasEnglishName #voc/lstr "Sango@en",
   :lcc-lr/hasFrenchName #voc/lstr "sango@fr",
   :lcc-lr/hasGermanName #voc/lstr "Sango-Sprache@de",
   :lcc-lr/hasIndigenousName "sango",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/sg",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Sango",
   :skos/definition "Sango language"})

(def Sanskrit
  "Sanskrit language"
  {:db/ident :lcc-639-1/Sanskrit,
   :lcc-lr/hasEnglishName #voc/lstr "Sanskrit@en",
   :lcc-lr/hasFrenchName #voc/lstr "sanskrit@fr",
   :lcc-lr/hasGermanName #voc/lstr "Sanskrit@de",
   :lcc-lr/hasIndigenousName "saṁskr̥tam",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/sa",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/AncientLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Sanskrit",
   :skos/definition "Sanskrit language"})

(def Sardinian
  "Sardinian languages"
  {:db/ident :lcc-639-1/Sardinian,
   :lcc-lr/hasEnglishName #voc/lstr "Sardinian@en",
   :lcc-lr/hasFrenchName #voc/lstr "sarde@fr",
   :lcc-lr/hasGermanName #voc/lstr "Sardisch@de",
   :lcc-lr/hasIndigenousName "sardu",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/sc",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/Macrolanguage :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Sardinian",
   :skos/definition "Sardinian languages"})

(def ScottishGaelic
  {:db/ident       :lcc-639-1/ScottishGaelic,
   :owl/deprecated true,
   :owl/sameAs     :lcc-639-1/Gaelic,
   :rdf/type       :owl/NamedIndividual})

(def Serbian
  "Serbian language"
  {:db/ident :lcc-639-1/Serbian,
   :lcc-lr/hasEnglishName #voc/lstr "Serbian@en",
   :lcc-lr/hasFrenchName #voc/lstr "serbe@fr",
   :lcc-lr/hasGermanName #voc/lstr "Serbisch@de",
   :lcc-lr/hasIndigenousName "srpski (jezik)",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/sr",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Serbian",
   :skos/definition "Serbian language"})

(def Shona
  "Shona language"
  {:db/ident :lcc-639-1/Shona,
   :lcc-lr/hasEnglishName #voc/lstr "Shona@en",
   :lcc-lr/hasFrenchName #voc/lstr "shona@fr",
   :lcc-lr/hasGermanName #voc/lstr "Schona-Sprache@de",
   :lcc-lr/hasIndigenousName "chiShona",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/sn",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Shona",
   :skos/definition "Shona language"})

(def SichuanYi
  "Sichuan Yi language"
  {:db/ident :lcc-639-1/SichuanYi,
   :lcc-lr/hasEnglishName [#voc/lstr "Nuosu@en" #voc/lstr "Sichuan Yi@en"],
   :lcc-lr/hasFrenchName #voc/lstr "yi de Sichuan@fr",
   :lcc-lr/hasGermanName #voc/lstr "Lalo-Sprache@de",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ii",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Sichuan Yi",
   :skos/definition "Sichuan Yi language"})

(def Sindhi
  "Sindhi language"
  {:db/ident :lcc-639-1/Sindhi,
   :lcc-lr/hasEnglishName #voc/lstr "Sindhi@en",
   :lcc-lr/hasFrenchName #voc/lstr "sindhi@fr",
   :lcc-lr/hasGermanName #voc/lstr "Sindhi-Sprache@de",
   :lcc-lr/hasIndigenousName "sindhī",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/sd",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Sindhi",
   :skos/definition "Sindhi language"})

(def Sinhala
  "Sinhala; Sinhalese language"
  {:db/ident :lcc-639-1/Sinhala,
   :lcc-lr/hasEnglishName [#voc/lstr "Sinhalese@en" #voc/lstr "Sinhala@en"],
   :lcc-lr/hasFrenchName #voc/lstr "singhalais@fr",
   :lcc-lr/hasGermanName #voc/lstr "Singhalesisch@de",
   :lcc-lr/hasIndigenousName "siṁhala",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/si",
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Sinhala",
   :skos/definition "Sinhala; Sinhalese language"})

(def Slovak
  "Slovak language"
  {:db/ident :lcc-639-1/Slovak,
   :lcc-lr/hasEnglishName #voc/lstr "Slovak@en",
   :lcc-lr/hasFrenchName #voc/lstr "slovaque@fr",
   :lcc-lr/hasGermanName #voc/lstr "Slowakisch@de",
   :lcc-lr/hasIndigenousName "slovenský (jazyk)",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/sk",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Slovak",
   :skos/definition "Slovak language"})

(def Slovenian
  "Slovenian language"
  {:db/ident :lcc-639-1/Slovenian,
   :lcc-lr/hasEnglishName #voc/lstr "Slovenian@en",
   :lcc-lr/hasFrenchName #voc/lstr "slovène@fr",
   :lcc-lr/hasGermanName #voc/lstr "Slowenisch@de",
   :lcc-lr/hasIndigenousName "slovenski (jezik)",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/sl",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Slovenian",
   :skos/definition "Slovenian language"})

(def Somali
  "Somali language"
  {:db/ident :lcc-639-1/Somali,
   :lcc-lr/hasEnglishName #voc/lstr "Somali@en",
   :lcc-lr/hasFrenchName #voc/lstr "somali@fr",
   :lcc-lr/hasGermanName #voc/lstr "Somali@de",
   :lcc-lr/hasIndigenousName "soomaali",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/so",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Somali",
   :skos/definition "Somali language"})

(def SouthNdebele
  "South Ndebele language"
  {:db/ident :lcc-639-1/SouthNdebele,
   :lcc-lr/hasEnglishName [#voc/lstr "Ndebele, South@en"
                           #voc/lstr "South Ndebele@en"],
   :lcc-lr/hasFrenchName #voc/lstr "ndébélé du Sud@fr",
   :lcc-lr/hasGermanName #voc/lstr "Ndebele-Sprache (Transvaal)@de",
   :lcc-lr/hasIndigenousName "isiNdebele",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/nr",
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "South Ndebele",
   :skos/definition "South Ndebele language"})

(def SouthernSotho
  "Southern Sotho language"
  {:db/ident :lcc-639-1/SouthernSotho,
   :lcc-lr/hasEnglishName [#voc/lstr "Southern Sotho@en"
                           #voc/lstr "Sotho, Southern@en"],
   :lcc-lr/hasFrenchName #voc/lstr "sotho du Sud@fr",
   :lcc-lr/hasGermanName #voc/lstr "Süd-Sotho-Sprache@de",
   :lcc-lr/hasIndigenousName "Sesotho",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/st",
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Southern Sotho",
   :skos/definition "Southern Sotho language"})

(def Spanish
  "Spanish language"
  {:db/ident :lcc-639-1/Spanish,
   :lcc-lr/hasEnglishName [#voc/lstr "Spanish@en" #voc/lstr "Castilian@en"],
   :lcc-lr/hasFrenchName [#voc/lstr "castillan@fr" #voc/lstr "espagnol@fr"],
   :lcc-lr/hasGermanName #voc/lstr "Spanisch@de",
   :lcc-lr/hasIndigenousName ["castellano" "español"],
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/es",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Spanish",
   :skos/definition "Spanish language"})

(def Sundanese
  "Sundanese languaage"
  {:db/ident :lcc-639-1/Sundanese,
   :lcc-lr/hasEnglishName #voc/lstr "Sundanese@en",
   :lcc-lr/hasFrenchName #voc/lstr "soundanais@fr",
   :lcc-lr/hasGermanName #voc/lstr "Sundanesisch@de",
   :lcc-lr/hasIndigenousName "bahasa Sunda",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/su",
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Sundanese",
   :skos/definition "Sundanese languaage"})

(def Swahili
  "Swahili macrolanguage"
  {:db/ident :lcc-639-1/Swahili,
   :lcc-lr/hasEnglishName #voc/lstr "Swahili@en",
   :lcc-lr/hasFrenchName #voc/lstr "swahili@fr",
   :lcc-lr/hasGermanName #voc/lstr "Swahili@de",
   :lcc-lr/hasIndigenousName "Kiswahili",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/sw",
   :rdf/type
   [:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Swahili",
   :skos/definition "Swahili macrolanguage"})

(def Swati
  "Swati language"
  {:db/ident :lcc-639-1/Swati,
   :lcc-lr/hasEnglishName #voc/lstr "Swati@en",
   :lcc-lr/hasFrenchName #voc/lstr "swati@fr",
   :lcc-lr/hasGermanName #voc/lstr "Swasi-Sprache@de",
   :lcc-lr/hasIndigenousName "siSwati",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ss",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Swati",
   :skos/definition "Swati language"})

(def Swedish
  "Swedish language"
  {:db/ident :lcc-639-1/Swedish,
   :lcc-lr/hasEnglishName #voc/lstr "Swedish@en",
   :lcc-lr/hasFrenchName #voc/lstr "suédois@fr",
   :lcc-lr/hasGermanName #voc/lstr "Schwedisch@de",
   :lcc-lr/hasIndigenousName "svenska",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/sv",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Swedish",
   :skos/definition "Swedish language"})

(def Tagalog
  "Tagalog language"
  {:db/ident :lcc-639-1/Tagalog,
   :lcc-lr/hasEnglishName #voc/lstr "Tagalog@en",
   :lcc-lr/hasFrenchName #voc/lstr "tagalog@fr",
   :lcc-lr/hasGermanName #voc/lstr "Tagalog@de",
   :lcc-lr/hasIndigenousName "tagalog",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/tl",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Tagalog",
   :skos/definition "Tagalog language"})

(def Tahitian
  "Tahitian language"
  {:db/ident :lcc-639-1/Tahitian,
   :lcc-lr/hasEnglishName #voc/lstr "Tahitian@en",
   :lcc-lr/hasFrenchName #voc/lstr "tahitien@fr",
   :lcc-lr/hasGermanName #voc/lstr "Tahitisch@de",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ty",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Tahitian",
   :skos/definition "Tahitian language"})

(def Tajik
  "Tajik language"
  {:db/ident :lcc-639-1/Tajik,
   :lcc-lr/hasEnglishName #voc/lstr "Tajik@en",
   :lcc-lr/hasFrenchName #voc/lstr "tadjik@fr",
   :lcc-lr/hasGermanName #voc/lstr "Tadschikisch@de",
   :lcc-lr/hasIndigenousName "toçikī",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/tg",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Tajik",
   :skos/definition "Tajik language"})

(def Tamil
  "Tamil language"
  {:db/ident :lcc-639-1/Tamil,
   :lcc-lr/hasEnglishName #voc/lstr "Tamil@en",
   :lcc-lr/hasFrenchName #voc/lstr "tamoul@fr",
   :lcc-lr/hasGermanName #voc/lstr "Tamil@de",
   :lcc-lr/hasIndigenousName "tamiḻ",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ta",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Tamil",
   :skos/definition "Tamil language"})

(def Tatar
  "Tatar language"
  {:db/ident :lcc-639-1/Tatar,
   :lcc-lr/hasEnglishName #voc/lstr "Tatar@en",
   :lcc-lr/hasFrenchName #voc/lstr "tatar@fr",
   :lcc-lr/hasGermanName #voc/lstr "Tatarisch@de",
   :lcc-lr/hasIndigenousName "tatar tele",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/tt",
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Tatar",
   :skos/definition "Tatar language"})

(def Telugu
  "Telugu language"
  {:db/ident :lcc-639-1/Telugu,
   :lcc-lr/hasEnglishName #voc/lstr "Telugu@en",
   :lcc-lr/hasFrenchName #voc/lstr "télougou@fr",
   :lcc-lr/hasGermanName #voc/lstr "Telugu-Sprache@de",
   :lcc-lr/hasIndigenousName "telugu",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/te",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Telugu",
   :skos/definition "Telugu language"})

(def Thai
  "Thai language"
  {:db/ident :lcc-639-1/Thai,
   :lcc-lr/hasEnglishName #voc/lstr "Thai@en",
   :lcc-lr/hasFrenchName #voc/lstr "thaï@fr",
   :lcc-lr/hasGermanName #voc/lstr "Thailändisch@de",
   :lcc-lr/hasIndigenousName "thai",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/th",
   :rdf/type
   [:lcc-lr/LivingLanguage :owl/NamedIndividual :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Thai",
   :skos/definition "Thai language"})

(def Tibetan
  "Tibetan language"
  {:db/ident :lcc-639-1/Tibetan,
   :lcc-lr/hasEnglishName #voc/lstr "Tibetan@en",
   :lcc-lr/hasFrenchName #voc/lstr "tibétain@fr",
   :lcc-lr/hasGermanName #voc/lstr "Tibetisch@de",
   :lcc-lr/hasIndigenousName "bod skad",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/bo",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Tibetan",
   :skos/definition "Tibetan language"})

(def Tigrinya
  "Tigrinya language"
  {:db/ident :lcc-639-1/Tigrinya,
   :lcc-lr/hasEnglishName #voc/lstr "Tigrinya@en",
   :lcc-lr/hasFrenchName #voc/lstr "tigrigna@fr",
   :lcc-lr/hasGermanName #voc/lstr "Tigrinja-Sprache@de",
   :lcc-lr/hasIndigenousName "tigriña",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ti",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Tigrinya",
   :skos/definition "Tigrinya language"})

(def Tonga-TongaIslands
  "Tonga (Tonga Islands) language"
  {:db/ident :lcc-639-1/Tonga-TongaIslands,
   :lcc-lr/hasEnglishName #voc/lstr "Tonga (Tonga Islands)@en",
   :lcc-lr/hasFrenchName #voc/lstr "tonga (îles Tonga)@fr",
   :lcc-lr/hasGermanName #voc/lstr "Tongaisch@de",
   :lcc-lr/hasIndigenousName "tonga",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/to",
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Tonga (Tonga Islands)",
   :skos/definition "Tonga (Tonga Islands) language"})

(def Tsonga
  "Tsonga language"
  {:db/ident :lcc-639-1/Tsonga,
   :lcc-lr/hasEnglishName #voc/lstr "Tsonga@en",
   :lcc-lr/hasFrenchName #voc/lstr "tsonga@fr",
   :lcc-lr/hasGermanName #voc/lstr "Tsonga-Sprache@de",
   :lcc-lr/hasIndigenousName "Xitsonga",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ts",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Tsonga",
   :skos/definition "Tsonga language"})

(def Tswana
  "Tswana language"
  {:db/ident :lcc-639-1/Tswana,
   :lcc-lr/hasEnglishName #voc/lstr "Tswana@en",
   :lcc-lr/hasFrenchName #voc/lstr "tswana@fr",
   :lcc-lr/hasGermanName #voc/lstr "Tswana-Sprache@de",
   :lcc-lr/hasIndigenousName "Setswana",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/tn",
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Tswana",
   :skos/definition "Tswana language"})

(def Turkish
  "Turkish language"
  {:db/ident :lcc-639-1/Turkish,
   :lcc-lr/hasEnglishName #voc/lstr "Turkish@en",
   :lcc-lr/hasFrenchName #voc/lstr "turc@fr",
   :lcc-lr/hasGermanName #voc/lstr "Türkisch@de",
   :lcc-lr/hasIndigenousName "türkçe",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/tr",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Turkish",
   :skos/definition "Turkish language"})

(def Turkmen
  "Turkmen language"
  {:db/ident :lcc-639-1/Turkmen,
   :lcc-lr/hasEnglishName #voc/lstr "Turkmen@en",
   :lcc-lr/hasFrenchName #voc/lstr "turkmène@fr",
   :lcc-lr/hasGermanName #voc/lstr "Turkmenisch@de",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/tk",
   :rdf/type
   [:lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Turkmen",
   :skos/definition "Turkmen language"})

(def Twi
  "Twi language"
  {:db/ident :lcc-639-1/Twi,
   :lcc-lr/hasEnglishName #voc/lstr "Twi@en",
   :lcc-lr/hasFrenchName #voc/lstr "twi@fr",
   :lcc-lr/hasGermanName #voc/lstr "Twi-Sprache@de",
   :lcc-lr/hasIndigenousName "twi",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/tw",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Twi",
   :skos/definition "Twi language"})

(def Uighur
  "Uighur language"
  {:db/ident :lcc-639-1/Uighur,
   :lcc-lr/hasEnglishName [#voc/lstr "Uighur@en" #voc/lstr "Uyghur@en"],
   :lcc-lr/hasFrenchName #voc/lstr "ouïgour@fr",
   :lcc-lr/hasGermanName #voc/lstr "Uigurisch@de",
   :lcc-lr/hasIndigenousName "oyghurqǝ",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ug",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Uighur",
   :skos/definition "Uighur language"})

(def Ukrainian
  "Ukrainian language"
  {:db/ident :lcc-639-1/Ukrainian,
   :lcc-lr/hasEnglishName #voc/lstr "Ukrainian@en",
   :lcc-lr/hasFrenchName #voc/lstr "ukrainien@fr",
   :lcc-lr/hasGermanName #voc/lstr "Ukrainisch@de",
   :lcc-lr/hasIndigenousName "ukraïns'ka mova",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/uk",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Ukrainian",
   :skos/definition "Ukrainian language"})

(def Urdu
  "Urdu language"
  {:db/ident :lcc-639-1/Urdu,
   :lcc-lr/hasEnglishName #voc/lstr "Urdu@en",
   :lcc-lr/hasFrenchName #voc/lstr "ourdou@fr",
   :lcc-lr/hasGermanName #voc/lstr "Urdu@de",
   :lcc-lr/hasIndigenousName "urdū",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ur",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Urdu",
   :skos/definition "Urdu language"})

(def Uzbek
  "Uzbek languages"
  {:db/ident :lcc-639-1/Uzbek,
   :lcc-lr/hasEnglishName #voc/lstr "Uzbek@en",
   :lcc-lr/hasFrenchName #voc/lstr "ouszbek@fr",
   :lcc-lr/hasGermanName #voc/lstr "Usbekisch@de",
   :lcc-lr/hasIndigenousName "oʻzbek tili",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/uz",
   :rdf/type
   [:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Uzbek",
   :skos/definition "Uzbek languages"})

(def Venda
  "Venda language"
  {:db/ident :lcc-639-1/Venda,
   :lcc-lr/hasEnglishName #voc/lstr "Venda@en",
   :lcc-lr/hasFrenchName #voc/lstr "venda@fr",
   :lcc-lr/hasGermanName #voc/lstr "Venda-Sprache@de",
   :lcc-lr/hasIndigenousName "Tshivenḓa",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/ve",
   :rdf/type
   [:lcc-lr/LivingLanguage :owl/NamedIndividual :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Venda",
   :skos/definition "Venda language"})

(def Vietnamese
  "Vietnamese language"
  {:db/ident :lcc-639-1/Vietnamese,
   :lcc-lr/hasEnglishName #voc/lstr "Vietnamese@en",
   :lcc-lr/hasFrenchName #voc/lstr "vietnamien@fr",
   :lcc-lr/hasGermanName #voc/lstr "Vietnamesisch@de",
   :lcc-lr/hasIndigenousName "Tiếng Việt Nam",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/vi",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Vietnamese",
   :skos/definition "Vietnamese language"})

(def Volapuk
  "Volapuk language"
  {:db/ident :lcc-639-1/Volapuk,
   :lcc-lr/hasEnglishName #voc/lstr "Volapük@en",
   :lcc-lr/hasFrenchName #voc/lstr "volapük@fr",
   :lcc-lr/hasGermanName #voc/lstr "Volapük@de",
   :lcc-lr/hasIndigenousName "volapük",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/vo",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/ArtificialLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Volapuk",
   :skos/definition "Volapuk language"})

(def Walloon
  "Walloon language"
  {:db/ident :lcc-639-1/Walloon,
   :lcc-lr/hasEnglishName #voc/lstr "Walloon@en",
   :lcc-lr/hasFrenchName #voc/lstr "wallon@fr",
   :lcc-lr/hasGermanName #voc/lstr "Wallonisch@de",
   :lcc-lr/hasIndigenousName "wallon",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/wa",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Walloon",
   :skos/definition "Walloon language"})

(def Welsh
  "Welsh language"
  {:db/ident :lcc-639-1/Welsh,
   :lcc-lr/hasEnglishName #voc/lstr "Welsh@en",
   :lcc-lr/hasFrenchName #voc/lstr "gallois@fr",
   :lcc-lr/hasGermanName #voc/lstr "Kymrisch@de",
   :lcc-lr/hasIndigenousName "Cymraeg",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/cy",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Welsh",
   :skos/definition "Welsh language"})

(def WesternFrisian
  "Western Frisian language"
  {:db/ident :lcc-639-1/WesternFrisian,
   :lcc-lr/hasEnglishName #voc/lstr "Western Frisian@en",
   :lcc-lr/hasFrenchName #voc/lstr "frison occidental@fr",
   :lcc-lr/hasGermanName #voc/lstr "Friesisch@de",
   :lcc-lr/hasIndigenousName "frysk",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/fy",
   :rdf/type
   [:lcc-lr/IndividualLanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Western Frisian",
   :skos/definition "Western Frisian language"})

(def Wolof
  "Wolof language"
  {:db/ident :lcc-639-1/Wolof,
   :lcc-lr/hasEnglishName #voc/lstr "Wolof@en",
   :lcc-lr/hasFrenchName #voc/lstr "wolof@fr",
   :lcc-lr/hasGermanName #voc/lstr "Wolof-Sprache@de",
   :lcc-lr/hasIndigenousName "wolof",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/wo",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/IndividualLanguage :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Wolof",
   :skos/definition "Wolof language"})

(def Xhosa
  "Xhosa language"
  {:db/ident :lcc-639-1/Xhosa,
   :lcc-lr/hasEnglishName #voc/lstr "Xhosa@en",
   :lcc-lr/hasFrenchName #voc/lstr "xhosa@fr",
   :lcc-lr/hasGermanName #voc/lstr "Xhosa-Sprache@de",
   :lcc-lr/hasIndigenousName "isiXhosa",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/xh",
   :rdf/type
   [:lcc-lr/LivingLanguage :owl/NamedIndividual :lcc-lr/IndividualLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Xhosa",
   :skos/definition "Xhosa language"})

(def Yiddish
  "Yiddish language"
  {:db/ident :lcc-639-1/Yiddish,
   :lcc-lr/hasEnglishName #voc/lstr "Yiddish@en",
   :lcc-lr/hasFrenchName #voc/lstr "yiddish@fr",
   :lcc-lr/hasGermanName #voc/lstr "Jiddisch@de",
   :lcc-lr/hasIndigenousName "yidiš",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/yi",
   :rdf/type
   [:owl/NamedIndividual :lcc-lr/Macrolanguage :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Yiddish",
   :skos/definition "Yiddish language"})

(def Yoruba
  "Yoruba language"
  {:db/ident :lcc-639-1/Yoruba,
   :lcc-lr/hasEnglishName #voc/lstr "Yoruba@en",
   :lcc-lr/hasFrenchName #voc/lstr "yoruba@fr",
   :lcc-lr/hasGermanName #voc/lstr "Yoruba-Sprache@de",
   :lcc-lr/hasIndigenousName "Yorùbá",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/yo",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Yoruba",
   :skos/definition "Yoruba language"})

(def Zhuang
  "Zhuang languages"
  {:db/ident :lcc-639-1/Zhuang,
   :lcc-lr/hasEnglishName [#voc/lstr "Zhuang@en" #voc/lstr "Chuang@en"],
   :lcc-lr/hasFrenchName [#voc/lstr "zhuang@fr" #voc/lstr "chuang@fr"],
   :lcc-lr/hasGermanName #voc/lstr "Zhuang@de",
   :lcc-lr/hasIndigenousName "cuengh",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/za",
   :rdf/type
   [:lcc-lr/Macrolanguage :owl/NamedIndividual :lcc-lr/LivingLanguage],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Zhuang",
   :skos/definition "Zhuang languages"})

(def Zulu
  "Zulu language"
  {:db/ident :lcc-639-1/Zulu,
   :lcc-lr/hasEnglishName #voc/lstr "Zulu@en",
   :lcc-lr/hasFrenchName #voc/lstr "zoulou@fr",
   :lcc-lr/hasGermanName #voc/lstr "Zulu-Sprache@de",
   :lcc-lr/hasIndigenousName "isiZulu",
   :owl/sameAs "https://id.loc.gov/vocabulary/iso639-1/zu",
   :rdf/type
   [:lcc-lr/LivingLanguage :lcc-lr/IndividualLanguage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "Zulu",
   :skos/definition "Zulu language"})

(def aa
  "language identifier for Afar"
  {:db/ident :lcc-639-1/aa,
   :lcc-lr/denotes :lcc-639-1/Afar,
   :lcc-lr/hasTag "aa",
   :lcc-lr/identifies :lcc-639-1/Afar,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "aa",
   :skos/definition "language identifier for Afar"})

(def ab
  "language identifier for Abkhazian; Abkhaz"
  {:db/ident :lcc-639-1/ab,
   :lcc-lr/denotes :lcc-639-1/Abkhazian,
   :lcc-lr/hasTag "ab",
   :lcc-lr/identifies :lcc-639-1/Abkhazian,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ab",
   :skos/definition "language identifier for Abkhazian; Abkhaz"})

(def ae
  "language identifier for Avestan"
  {:db/ident :lcc-639-1/ae,
   :lcc-lr/denotes :lcc-639-1/Avestan,
   :lcc-lr/hasTag "ae",
   :lcc-lr/identifies :lcc-639-1/Avestan,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ae",
   :skos/definition "language identifier for Avestan"})

(def af
  "language identifier for Afrikaans"
  {:db/ident :lcc-639-1/af,
   :lcc-lr/denotes :lcc-639-1/Afrikaans,
   :lcc-lr/hasTag "af",
   :lcc-lr/identifies :lcc-639-1/Afrikaans,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "af",
   :skos/definition "language identifier for Afrikaans"})

(def ak
  "language identifier for Akan"
  {:db/ident :lcc-639-1/ak,
   :lcc-lr/denotes :lcc-639-1/Akan,
   :lcc-lr/hasTag "ak",
   :lcc-lr/identifies :lcc-639-1/Akan,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ak",
   :skos/definition "language identifier for Akan"})

(def am
  "language identifier for Amharic"
  {:db/ident :lcc-639-1/am,
   :lcc-lr/denotes :lcc-639-1/Amharic,
   :lcc-lr/hasTag "am",
   :lcc-lr/identifies :lcc-639-1/Amharic,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "am",
   :skos/definition "language identifier for Amharic"})

(def an
  "language identifier for Aragonese"
  {:db/ident :lcc-639-1/an,
   :lcc-lr/denotes :lcc-639-1/Aragonese,
   :lcc-lr/hasTag "an",
   :lcc-lr/identifies :lcc-639-1/Aragonese,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "an",
   :skos/definition "language identifier for Aragonese"})

(def ar
  "language identifier for Arabic"
  {:db/ident :lcc-639-1/ar,
   :lcc-lr/denotes :lcc-639-1/Arabic,
   :lcc-lr/hasTag "ar",
   :lcc-lr/identifies :lcc-639-1/Arabic,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ar",
   :skos/definition "language identifier for Arabic"})

(def as
  "language identifier for Assamese"
  {:db/ident :lcc-639-1/as,
   :lcc-lr/denotes :lcc-639-1/Assamese,
   :lcc-lr/hasTag "as",
   :lcc-lr/identifies :lcc-639-1/Assamese,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "as",
   :skos/definition "language identifier for Assamese"})

(def av
  "language identifier for Avaric"
  {:db/ident :lcc-639-1/av,
   :lcc-lr/denotes :lcc-639-1/Avaric,
   :lcc-lr/hasTag "av",
   :lcc-lr/identifies :lcc-639-1/Avaric,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "av",
   :skos/definition "language identifier for Avaric"})

(def ay
  "language identifier for Aymara"
  {:db/ident :lcc-639-1/ay,
   :lcc-lr/denotes :lcc-639-1/Aymara,
   :lcc-lr/hasTag "ay",
   :lcc-lr/identifies :lcc-639-1/Aymara,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ay",
   :skos/definition "language identifier for Aymara"})

(def az
  "language identifier for Azerbaijani"
  {:db/ident :lcc-639-1/az,
   :lcc-lr/denotes :lcc-639-1/Azerbaijani,
   :lcc-lr/hasTag "az",
   :lcc-lr/identifies :lcc-639-1/Azerbaijani,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "az",
   :skos/definition "language identifier for Azerbaijani"})

(def ba
  "language identifier for Bashkir"
  {:db/ident :lcc-639-1/ba,
   :lcc-lr/denotes :lcc-639-1/Bashkir,
   :lcc-lr/hasTag "ba",
   :lcc-lr/identifies :lcc-639-1/Bashkir,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ba",
   :skos/definition "language identifier for Bashkir"})

(def be
  "language identifier for Belarusian"
  {:db/ident :lcc-639-1/be,
   :lcc-lr/denotes :lcc-639-1/Belarusian,
   :lcc-lr/hasTag "be",
   :lcc-lr/identifies :lcc-639-1/Belarusian,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "be",
   :skos/definition "language identifier for Belarusian"})

(def bg
  "language identifier for Bulgarian"
  {:db/ident :lcc-639-1/bg,
   :lcc-lr/denotes :lcc-639-1/Bulgarian,
   :lcc-lr/hasTag "bg",
   :lcc-lr/identifies :lcc-639-1/Bulgarian,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "bg",
   :skos/definition "language identifier for Bulgarian"})

(def bh
  "language identifier for Bihari languages"
  {:db/ident :lcc-639-1/bh,
   :lcc-lr/denotes :lcc-639-1/BihariLanguages,
   :lcc-lr/hasTag "bh",
   :lcc-lr/identifies :lcc-639-1/BihariLanguages,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "bh",
   :skos/definition "language identifier for Bihari languages"})

(def bi
  "language identifier for Bislama"
  {:db/ident :lcc-639-1/bi,
   :lcc-lr/denotes :lcc-639-1/Bislama,
   :lcc-lr/hasTag "bi",
   :lcc-lr/identifies :lcc-639-1/Bislama,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "bi",
   :skos/definition "language identifier for Bislama"})

(def bm
  "language identifier for Bambara"
  {:db/ident :lcc-639-1/bm,
   :lcc-lr/denotes :lcc-639-1/Bambara,
   :lcc-lr/hasTag "bm",
   :lcc-lr/identifies :lcc-639-1/Bambara,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "bm",
   :skos/definition "language identifier for Bambara"})

(def bn
  "language identifier for Bengali; Bangla"
  {:db/ident :lcc-639-1/bn,
   :lcc-lr/denotes :lcc-639-1/Bengali,
   :lcc-lr/hasTag "bn",
   :lcc-lr/identifies :lcc-639-1/Bengali,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "bn",
   :skos/definition "language identifier for Bengali; Bangla"})

(def bo
  "language identifier for Tibetan"
  {:db/ident :lcc-639-1/bo,
   :lcc-lr/denotes :lcc-639-1/Tibetan,
   :lcc-lr/hasTag "bo",
   :lcc-lr/identifies :lcc-639-1/Tibetan,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "bo",
   :skos/definition "language identifier for Tibetan"})

(def br
  "language identifier for Breton"
  {:db/ident :lcc-639-1/br,
   :lcc-lr/denotes :lcc-639-1/Breton,
   :lcc-lr/hasTag "br",
   :lcc-lr/identifies :lcc-639-1/Breton,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "br",
   :skos/definition "language identifier for Breton"})

(def bs
  "language identifier for Bosnian"
  {:db/ident :lcc-639-1/bs,
   :lcc-lr/denotes :lcc-639-1/Bosnian,
   :lcc-lr/hasTag "bs",
   :lcc-lr/identifies :lcc-639-1/Bosnian,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "bs",
   :skos/definition "language identifier for Bosnian"})

(def ca
  "language identifier for Catalan"
  {:db/ident :lcc-639-1/ca,
   :lcc-lr/denotes :lcc-639-1/Catalan,
   :lcc-lr/hasTag "ca",
   :lcc-lr/identifies :lcc-639-1/Catalan,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ca",
   :skos/definition "language identifier for Catalan"})

(def ce
  "language identifier for Chechen"
  {:db/ident :lcc-639-1/ce,
   :lcc-lr/denotes :lcc-639-1/Chechen,
   :lcc-lr/hasTag "ce",
   :lcc-lr/identifies :lcc-639-1/Chechen,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ce",
   :skos/definition "language identifier for Chechen"})

(def ch
  "language identifier for Chamorro"
  {:db/ident :lcc-639-1/ch,
   :lcc-lr/denotes :lcc-639-1/Chamorro,
   :lcc-lr/hasTag "ch",
   :lcc-lr/identifies :lcc-639-1/Chamorro,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ch",
   :skos/definition "language identifier for Chamorro"})

(def co
  "language identifier for Corsican"
  {:db/ident :lcc-639-1/co,
   :lcc-lr/denotes :lcc-639-1/Corsican,
   :lcc-lr/hasTag "co",
   :lcc-lr/identifies :lcc-639-1/Corsican,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "co",
   :skos/definition "language identifier for Corsican"})

(def cr
  "language identifier for Cree"
  {:db/ident :lcc-639-1/cr,
   :lcc-lr/denotes :lcc-639-1/Cree,
   :lcc-lr/hasTag "cr",
   :lcc-lr/identifies :lcc-639-1/Cree,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "cr",
   :skos/definition "language identifier for Cree"})

(def cs
  "language identifier for Czech"
  {:db/ident :lcc-639-1/cs,
   :lcc-lr/denotes :lcc-639-1/Czech,
   :lcc-lr/hasTag "cs",
   :lcc-lr/identifies :lcc-639-1/Czech,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "cs",
   :skos/definition "language identifier for Czech"})

(def cu
  "language identifier for Old Slavonic; Old Church Slavonic; Church Slavonic; Church Slavic; Old Bulgarian"
  {:db/ident :lcc-639-1/cu,
   :lcc-lr/denotes :lcc-639-1/ChurchSlavic,
   :lcc-lr/hasTag "cu",
   :lcc-lr/identifies :lcc-639-1/ChurchSlavic,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "cu",
   :skos/definition
   "language identifier for Old Slavonic; Old Church Slavonic; Church Slavonic; Church Slavic; Old Bulgarian"})

(def cv
  "language identifier for Chuvash"
  {:db/ident :lcc-639-1/cv,
   :lcc-lr/denotes :lcc-639-1/Chuvash,
   :lcc-lr/hasTag "cv",
   :lcc-lr/identifies :lcc-639-1/Chuvash,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "cv",
   :skos/definition "language identifier for Chuvash"})

(def cy
  "language identifier for Welsh"
  {:db/ident :lcc-639-1/cy,
   :lcc-lr/denotes :lcc-639-1/Welsh,
   :lcc-lr/hasTag "cy",
   :lcc-lr/identifies :lcc-639-1/Welsh,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "cy",
   :skos/definition "language identifier for Welsh"})

(def da
  "language identifier for Danish"
  {:db/ident :lcc-639-1/da,
   :lcc-lr/denotes :lcc-639-1/Danish,
   :lcc-lr/hasTag "da",
   :lcc-lr/identifies :lcc-639-1/Danish,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "da",
   :skos/definition "language identifier for Danish"})

(def de
  "language identifier for German"
  {:db/ident :lcc-639-1/de,
   :lcc-lr/denotes :lcc-639-1/German,
   :lcc-lr/hasTag "de",
   :lcc-lr/identifies :lcc-639-1/German,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "de",
   :skos/definition "language identifier for German"})

(def dv
  "language identifier for Dhivehi"
  {:db/ident :lcc-639-1/dv,
   :lcc-lr/denotes :lcc-639-1/Dhivehi,
   :lcc-lr/hasTag "dv",
   :lcc-lr/identifies :lcc-639-1/Dhivehi,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "dv",
   :skos/definition "language identifier for Dhivehi"})

(def dz
  "language identifier for Dzongkha; Bhutani; Butanese"
  {:db/ident :lcc-639-1/dz,
   :lcc-lr/denotes :lcc-639-1/Dzongkha,
   :lcc-lr/hasTag "dz",
   :lcc-lr/identifies :lcc-639-1/Dzongkha,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "dz",
   :skos/definition "language identifier for Dzongkha; Bhutani; Butanese"})

(def ee
  "language identifier for Ewe"
  {:db/ident :lcc-639-1/ee,
   :lcc-lr/denotes :lcc-639-1/Ewe,
   :lcc-lr/hasTag "ee",
   :lcc-lr/identifies :lcc-639-1/Ewe,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ee",
   :skos/definition "language identifier for Ewe"})

(def el
  "language identifier for Modern Greek (post 1453)"
  {:db/ident :lcc-639-1/el,
   :lcc-lr/denotes :lcc-639-1/ModernGreek,
   :lcc-lr/hasTag "el",
   :lcc-lr/identifies :lcc-639-1/ModernGreek,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "el",
   :skos/definition "language identifier for Modern Greek (post 1453)"})

(def en
  "language identifier for English"
  {:db/ident :lcc-639-1/en,
   :lcc-lr/denotes :lcc-639-1/English,
   :lcc-lr/hasTag "en",
   :lcc-lr/identifies :lcc-639-1/English,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "en",
   :skos/definition "language identifier for English"})

(def eo
  "language identifier for Esperanto"
  {:db/ident :lcc-639-1/eo,
   :lcc-lr/denotes :lcc-639-1/Esperanto,
   :lcc-lr/hasTag "eo",
   :lcc-lr/identifies :lcc-639-1/Esperanto,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "eo",
   :skos/definition "language identifier for Esperanto"})

(def es
  "language identifier for Spanish; Castilian"
  {:db/ident :lcc-639-1/es,
   :lcc-lr/denotes :lcc-639-1/Spanish,
   :lcc-lr/hasTag "es",
   :lcc-lr/identifies :lcc-639-1/Spanish,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "es",
   :skos/definition "language identifier for Spanish; Castilian"})

(def et
  "language identifier for Estonian"
  {:db/ident :lcc-639-1/et,
   :lcc-lr/denotes :lcc-639-1/Estonian,
   :lcc-lr/hasTag "et",
   :lcc-lr/identifies :lcc-639-1/Estonian,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "et",
   :skos/definition "language identifier for Estonian"})

(def eu
  "language identifier for Basque"
  {:db/ident :lcc-639-1/eu,
   :lcc-lr/denotes :lcc-639-1/Basque,
   :lcc-lr/hasTag "eu",
   :lcc-lr/identifies :lcc-639-1/Basque,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "eu",
   :skos/definition "language identifier for Basque"})

(def fa
  "language identifier for Persian"
  {:db/ident :lcc-639-1/fa,
   :lcc-lr/denotes :lcc-639-1/Persian,
   :lcc-lr/hasTag "fa",
   :lcc-lr/identifies :lcc-639-1/Persian,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "fa",
   :skos/definition "language identifier for Persian"})

(def ff
  "language identifier for Fulah; Fula; Fulani; Fulfulde; Peul"
  {:db/ident :lcc-639-1/ff,
   :lcc-lr/denotes :lcc-639-1/Fulah,
   :lcc-lr/hasTag "ff",
   :lcc-lr/identifies :lcc-639-1/Fulah,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ff",
   :skos/definition
   "language identifier for Fulah; Fula; Fulani; Fulfulde; Peul"})

(def fi
  "language identifier for Finnish"
  {:db/ident :lcc-639-1/fi,
   :lcc-lr/denotes :lcc-639-1/Finnish,
   :lcc-lr/hasTag "fi",
   :lcc-lr/identifies :lcc-639-1/Finnish,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "fi",
   :skos/definition "language identifier for Finnish"})

(def fj
  "language identifier for Fijian"
  {:db/ident :lcc-639-1/fj,
   :lcc-lr/denotes :lcc-639-1/Fijian,
   :lcc-lr/hasTag "fj",
   :lcc-lr/identifies :lcc-639-1/Fijian,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "fj",
   :skos/definition "language identifier for Fijian"})

(def fo
  "language identifier for Faroese; Faeroese"
  {:db/ident :lcc-639-1/fo,
   :lcc-lr/denotes :lcc-639-1/Faroese,
   :lcc-lr/hasTag "fo",
   :lcc-lr/identifies :lcc-639-1/Faroese,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "fo",
   :skos/definition "language identifier for Faroese; Faeroese"})

(def fr
  "language identifier for French"
  {:db/ident :lcc-639-1/fr,
   :lcc-lr/denotes :lcc-639-1/French,
   :lcc-lr/hasTag "fr",
   :lcc-lr/identifies :lcc-639-1/French,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "fr",
   :skos/definition "language identifier for French"})

(def fy
  "language identifier for Western Frisian"
  {:db/ident :lcc-639-1/fy,
   :lcc-lr/denotes :lcc-639-1/WesternFrisian,
   :lcc-lr/hasTag "fy",
   :lcc-lr/identifies :lcc-639-1/WesternFrisian,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "fy",
   :skos/definition "language identifier for Western Frisian"})

(def ga
  "language identifier for Irish"
  {:db/ident :lcc-639-1/ga,
   :lcc-lr/denotes :lcc-639-1/Irish,
   :lcc-lr/hasTag "ga",
   :lcc-lr/identifies :lcc-639-1/Irish,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ga",
   :skos/definition "language identifier for Irish"})

(def gd
  "language identifier for Gaelic; Scottish Gaelic"
  {:db/ident :lcc-639-1/gd,
   :lcc-lr/denotes :lcc-639-1/Gaelic,
   :lcc-lr/hasTag "gd",
   :lcc-lr/identifies :lcc-639-1/Gaelic,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "gd",
   :skos/definition "language identifier for Gaelic; Scottish Gaelic"})

(def gl
  "language identifier for Galician; Gallegan"
  {:db/ident :lcc-639-1/gl,
   :lcc-lr/denotes :lcc-639-1/Galician,
   :lcc-lr/hasTag "gl",
   :lcc-lr/identifies :lcc-639-1/Galician,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "gl",
   :skos/definition "language identifier for Galician; Gallegan"})

(def gn
  "language identifier for Guarani"
  {:db/ident :lcc-639-1/gn,
   :lcc-lr/denotes :lcc-639-1/Guarani,
   :lcc-lr/hasTag "gn",
   :lcc-lr/identifies :lcc-639-1/Guarani,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "gn",
   :skos/definition "language identifier for Guarani"})

(def gu
  "language identifier for Gujarati"
  {:db/ident :lcc-639-1/gu,
   :lcc-lr/denotes :lcc-639-1/Gujarati,
   :lcc-lr/hasTag "gu",
   :lcc-lr/identifies :lcc-639-1/Gujarati,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "gu",
   :skos/definition "language identifier for Gujarati"})

(def gv
  "language identifier for Manx"
  {:db/ident :lcc-639-1/gv,
   :lcc-lr/denotes :lcc-639-1/Manx,
   :lcc-lr/hasTag "gv",
   :lcc-lr/identifies :lcc-639-1/Manx,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "gv",
   :skos/definition "language identifier for Manx"})

(def ha
  "language identifier for Hausa"
  {:db/ident :lcc-639-1/ha,
   :lcc-lr/denotes :lcc-639-1/Hausa,
   :lcc-lr/hasTag "ha",
   :lcc-lr/identifies :lcc-639-1/Hausa,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ha",
   :skos/definition "language identifier for Hausa"})

(def he
  "language identifier for Hebrew"
  {:db/ident :lcc-639-1/he,
   :lcc-lr/denotes :lcc-639-1/Hebrew,
   :lcc-lr/hasTag "he",
   :lcc-lr/identifies :lcc-639-1/Hebrew,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "he",
   :skos/definition "language identifier for Hebrew"})

(def hi
  "language identifier for Hindi"
  {:db/ident :lcc-639-1/hi,
   :lcc-lr/denotes :lcc-639-1/Hindi,
   :lcc-lr/hasTag "hi",
   :lcc-lr/identifies :lcc-639-1/Hindi,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "hi",
   :skos/definition "language identifier for Hindi"})

(def ho
  "language identifier for Hiri Motu"
  {:db/ident :lcc-639-1/ho,
   :lcc-lr/denotes :lcc-639-1/HiriMotu,
   :lcc-lr/hasTag "ho",
   :lcc-lr/identifies :lcc-639-1/HiriMotu,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ho",
   :skos/definition "language identifier for Hiri Motu"})

(def hr
  "language identifier for Croatian"
  {:db/ident :lcc-639-1/hr,
   :lcc-lr/denotes :lcc-639-1/Croatian,
   :lcc-lr/hasTag "hr",
   :lcc-lr/identifies :lcc-639-1/Croatian,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "hr",
   :skos/definition "language identifier for Croatian"})

(def ht
  "language identifier for Haitian; Haitian Creole"
  {:db/ident :lcc-639-1/ht,
   :lcc-lr/denotes :lcc-639-1/Haitian,
   :lcc-lr/hasTag "ht",
   :lcc-lr/identifies :lcc-639-1/Haitian,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ht",
   :skos/definition "language identifier for Haitian; Haitian Creole"})

(def hu
  "language identifier for Hungarian"
  {:db/ident :lcc-639-1/hu,
   :lcc-lr/denotes :lcc-639-1/Hungarian,
   :lcc-lr/hasTag "hu",
   :lcc-lr/identifies :lcc-639-1/Hungarian,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "hu",
   :skos/definition "language identifier for Hungarian"})

(def hy
  "language identifier for Armenian"
  {:db/ident :lcc-639-1/hy,
   :lcc-lr/denotes :lcc-639-1/Armenian,
   :lcc-lr/hasTag "hy",
   :lcc-lr/identifies :lcc-639-1/Armenian,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "hy",
   :skos/definition "language identifier for Armenian"})

(def hz
  "language identifier for Herero"
  {:db/ident :lcc-639-1/hz,
   :lcc-lr/denotes :lcc-639-1/Herero,
   :lcc-lr/hasTag "hz",
   :lcc-lr/identifies :lcc-639-1/Herero,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "hz",
   :skos/definition "language identifier for Herero"})

(def ia
  "language identifier for Interlingua (International Auxiliary Language Association)"
  {:db/ident :lcc-639-1/ia,
   :lcc-lr/denotes :lcc-639-1/Interlingua,
   :lcc-lr/hasTag "ia",
   :lcc-lr/identifies :lcc-639-1/Interlingua,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ia",
   :skos/definition
   "language identifier for Interlingua (International Auxiliary Language Association)"})

(def id
  "language identifier for Indonesian"
  {:db/ident :lcc-639-1/id,
   :lcc-lr/denotes :lcc-639-1/Indonesian,
   :lcc-lr/hasTag "id",
   :lcc-lr/identifies :lcc-639-1/Indonesian,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "id",
   :skos/definition "language identifier for Indonesian"})

(def ie
  "language identifier for Interlingue"
  {:db/ident :lcc-639-1/ie,
   :lcc-lr/denotes :lcc-639-1/Interlingue,
   :lcc-lr/hasTag "ie",
   :lcc-lr/identifies :lcc-639-1/Interlingue,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ie",
   :skos/definition "language identifier for Interlingue"})

(def ig
  "language identifier for Igbo"
  {:db/ident :lcc-639-1/ig,
   :lcc-lr/denotes :lcc-639-1/Igbo,
   :lcc-lr/hasTag "ig",
   :lcc-lr/identifies :lcc-639-1/Igbo,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ig",
   :skos/definition "language identifier for Igbo"})

(def ii
  "language identifier for Sichuan Yi"
  {:db/ident :lcc-639-1/ii,
   :lcc-lr/denotes :lcc-639-1/SichuanYi,
   :lcc-lr/hasTag "ii",
   :lcc-lr/identifies :lcc-639-1/SichuanYi,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ii",
   :skos/definition "language identifier for Sichuan Yi"})

(def ik
  "language identifier for Inupiaq"
  {:db/ident :lcc-639-1/ik,
   :lcc-lr/denotes :lcc-639-1/Inupiaq,
   :lcc-lr/hasTag "ik",
   :lcc-lr/identifies :lcc-639-1/Inupiaq,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ik",
   :skos/definition "language identifier for Inupiaq"})

(def io
  "language identifier for Ido"
  {:db/ident :lcc-639-1/io,
   :lcc-lr/denotes :lcc-639-1/Ido,
   :lcc-lr/hasTag "io",
   :lcc-lr/identifies :lcc-639-1/Ido,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "io",
   :skos/definition "language identifier for Ido"})

(def is
  "language identifier for Icelandic"
  {:db/ident :lcc-639-1/is,
   :lcc-lr/denotes :lcc-639-1/Icelandic,
   :lcc-lr/hasTag "is",
   :lcc-lr/identifies :lcc-639-1/Icelandic,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "is",
   :skos/definition "language identifier for Icelandic"})

(def it
  "language identifier for Italian"
  {:db/ident :lcc-639-1/it,
   :lcc-lr/denotes :lcc-639-1/Italian,
   :lcc-lr/hasTag "it",
   :lcc-lr/identifies :lcc-639-1/Italian,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "it",
   :skos/definition "language identifier for Italian"})

(def iu
  "language identifier for Inuktitut"
  {:db/ident :lcc-639-1/iu,
   :lcc-lr/denotes :lcc-639-1/Inuktitut,
   :lcc-lr/hasTag "iu",
   :lcc-lr/identifies :lcc-639-1/Inuktitut,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "iu",
   :skos/definition "language identifier for Inuktitut"})

(def ja
  "language identifier for Japanese"
  {:db/ident :lcc-639-1/ja,
   :lcc-lr/denotes :lcc-639-1/Japanese,
   :lcc-lr/hasTag "ja",
   :lcc-lr/identifies :lcc-639-1/Japanese,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ja",
   :skos/definition "language identifier for Japanese"})

(def jv
  "language identifier for Javanese"
  {:db/ident :lcc-639-1/jv,
   :lcc-lr/denotes :lcc-639-1/Javanese,
   :lcc-lr/hasTag "jv",
   :lcc-lr/identifies :lcc-639-1/Javanese,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "jv",
   :skos/definition "language identifier for Javanese"})

(def ka
  "language identifier for Georgian"
  {:db/ident :lcc-639-1/ka,
   :lcc-lr/denotes :lcc-639-1/Georgian,
   :lcc-lr/hasTag "ka",
   :lcc-lr/identifies :lcc-639-1/Georgian,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ka",
   :skos/definition "language identifier for Georgian"})

(def kg
  "language identifier for Kongo"
  {:db/ident :lcc-639-1/kg,
   :lcc-lr/denotes :lcc-639-1/Kongo,
   :lcc-lr/hasTag "kg",
   :lcc-lr/identifies :lcc-639-1/Kongo,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "kg",
   :skos/definition "language identifier for Kongo"})

(def ki
  "language identifier for Kikuyu; Gikuyu"
  {:db/ident :lcc-639-1/ki,
   :lcc-lr/denotes :lcc-639-1/Kikuyu,
   :lcc-lr/hasTag "ki",
   :lcc-lr/identifies :lcc-639-1/Kikuyu,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ki",
   :skos/definition "language identifier for Kikuyu; Gikuyu"})

(def kj
  "language identifier for Kwanyama; Kuanyama"
  {:db/ident :lcc-639-1/kj,
   :lcc-lr/denotes :lcc-639-1/Kuanyama,
   :lcc-lr/hasTag "kj",
   :lcc-lr/identifies :lcc-639-1/Kuanyama,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "kj",
   :skos/definition "language identifier for Kwanyama; Kuanyama"})

(def kk
  "language identifier for Kazakh"
  {:db/ident :lcc-639-1/kk,
   :lcc-lr/denotes :lcc-639-1/Kazakh,
   :lcc-lr/hasTag "kk",
   :lcc-lr/identifies :lcc-639-1/Kazakh,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "kk",
   :skos/definition "language identifier for Kazakh"})

(def kl
  "language identifier for Greenlandic; Kalaallisut"
  {:db/ident :lcc-639-1/kl,
   :lcc-lr/denotes :lcc-639-1/Kalaallisut,
   :lcc-lr/hasTag "kl",
   :lcc-lr/identifies :lcc-639-1/Kalaallisut,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "kl",
   :skos/definition "language identifier for Greenlandic; Kalaallisut"})

(def km
  "language identifier for Central Khmer"
  {:db/ident :lcc-639-1/km,
   :lcc-lr/denotes :lcc-639-1/CentralKhmer,
   :lcc-lr/hasTag "km",
   :lcc-lr/identifies :lcc-639-1/CentralKhmer,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "km",
   :skos/definition "language identifier for Central Khmer"})

(def kn
  "language identifier for Kannada"
  {:db/ident :lcc-639-1/kn,
   :lcc-lr/denotes :lcc-639-1/Kannada,
   :lcc-lr/hasTag "kn",
   :lcc-lr/identifies :lcc-639-1/Kannada,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "kn",
   :skos/definition "language identifier for Kannada"})

(def ko
  "language identifier for Korean"
  {:db/ident :lcc-639-1/ko,
   :lcc-lr/denotes :lcc-639-1/Korean,
   :lcc-lr/hasTag "ko",
   :lcc-lr/identifies :lcc-639-1/Korean,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ko",
   :skos/definition "language identifier for Korean"})

(def kr
  "language identifier for Kanuri"
  {:db/ident :lcc-639-1/kr,
   :lcc-lr/denotes :lcc-639-1/Kanuri,
   :lcc-lr/hasTag "kr",
   :lcc-lr/identifies :lcc-639-1/Kanuri,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "kr",
   :skos/definition "language identifier for Kanuri"})

(def ks
  "language identifier for Kashmiri"
  {:db/ident :lcc-639-1/ks,
   :lcc-lr/denotes :lcc-639-1/Kashmiri,
   :lcc-lr/hasTag "ks",
   :lcc-lr/identifies :lcc-639-1/Kashmiri,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ks",
   :skos/definition "language identifier for Kashmiri"})

(def ku
  "language identifier for Kurdish"
  {:db/ident :lcc-639-1/ku,
   :lcc-lr/denotes :lcc-639-1/Kurdish,
   :lcc-lr/hasTag "ku",
   :lcc-lr/identifies :lcc-639-1/Kurdish,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ku",
   :skos/definition "language identifier for Kurdish"})

(def kv
  "language identifier for Komi"
  {:db/ident :lcc-639-1/kv,
   :lcc-lr/denotes :lcc-639-1/Komi,
   :lcc-lr/hasTag "kv",
   :lcc-lr/identifies :lcc-639-1/Komi,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "kv",
   :skos/definition "language identifier for Komi"})

(def kw
  "language identifier for Cornish"
  {:db/ident :lcc-639-1/kw,
   :lcc-lr/denotes :lcc-639-1/Cornish,
   :lcc-lr/hasTag "kw",
   :lcc-lr/identifies :lcc-639-1/Cornish,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "kw",
   :skos/definition "language identifier for Cornish"})

(def ky
  "language identifier for Kirghiz; Kyrgyz"
  {:db/ident :lcc-639-1/ky,
   :lcc-lr/denotes :lcc-639-1/Kirghiz,
   :lcc-lr/hasTag "ky",
   :lcc-lr/identifies :lcc-639-1/Kirghiz,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ky",
   :skos/definition "language identifier for Kirghiz; Kyrgyz"})

(def la
  "language identifier for Latin"
  {:db/ident :lcc-639-1/la,
   :lcc-lr/denotes :lcc-639-1/Latin,
   :lcc-lr/hasTag "la",
   :lcc-lr/identifies :lcc-639-1/Latin,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "la",
   :skos/definition "language identifier for Latin"})

(def lb
  "language identifier for Luxembourgish"
  {:db/ident :lcc-639-1/lb,
   :lcc-lr/denotes :lcc-639-1/Luxembourgish,
   :lcc-lr/hasTag "lb",
   :lcc-lr/identifies :lcc-639-1/Luxembourgish,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "lb",
   :skos/definition "language identifier for Luxembourgish"})

(def lg
  "language identifier for Ganda"
  {:db/ident :lcc-639-1/lg,
   :lcc-lr/denotes :lcc-639-1/Ganda,
   :lcc-lr/hasTag "lg",
   :lcc-lr/identifies :lcc-639-1/Ganda,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "lg",
   :skos/definition "language identifier for Ganda"})

(def li
  "language identifier for Limburgan; Limburger; Limburgish"
  {:db/ident :lcc-639-1/li,
   :lcc-lr/denotes :lcc-639-1/Limburgan,
   :lcc-lr/hasTag "li",
   :lcc-lr/identifies :lcc-639-1/Limburgan,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "li",
   :skos/definition "language identifier for Limburgan; Limburger; Limburgish"})

(def ln
  "language identifier for Lingala"
  {:db/ident :lcc-639-1/ln,
   :lcc-lr/denotes :lcc-639-1/Lingala,
   :lcc-lr/hasTag "ln",
   :lcc-lr/identifies :lcc-639-1/Lingala,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ln",
   :skos/definition "language identifier for Lingala"})

(def lo
  "language identifier for Lao"
  {:db/ident :lcc-639-1/lo,
   :lcc-lr/denotes :lcc-639-1/Lao,
   :lcc-lr/hasTag "lo",
   :lcc-lr/identifies :lcc-639-1/Lao,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "lo",
   :skos/definition "language identifier for Lao"})

(def lt
  "language identifier for Lithuanian"
  {:db/ident :lcc-639-1/lt,
   :lcc-lr/denotes :lcc-639-1/Lithuanian,
   :lcc-lr/hasTag "lt",
   :lcc-lr/identifies :lcc-639-1/Lithuanian,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "lt",
   :skos/definition "language identifier for Lithuanian"})

(def lu
  "language identifier for Luba-Katanga"
  {:db/ident :lcc-639-1/lu,
   :lcc-lr/denotes :lcc-639-1/LubaKatanga,
   :lcc-lr/hasTag "lu",
   :lcc-lr/identifies :lcc-639-1/LubaKatanga,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "lu",
   :skos/definition "language identifier for Luba-Katanga"})

(def lv
  "language identifier for Latvian"
  {:db/ident :lcc-639-1/lv,
   :lcc-lr/denotes :lcc-639-1/Latvian,
   :lcc-lr/hasTag "lv",
   :lcc-lr/identifies :lcc-639-1/Latvian,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "lv",
   :skos/definition "language identifier for Latvian"})

(def mg
  "language identifier for Malagasy"
  {:db/ident :lcc-639-1/mg,
   :lcc-lr/denotes :lcc-639-1/Malagasy,
   :lcc-lr/hasTag "mg",
   :lcc-lr/identifies :lcc-639-1/Malagasy,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "mg",
   :skos/definition "language identifier for Malagasy"})

(def mh
  "language identifier for Marshallese"
  {:db/ident :lcc-639-1/mh,
   :lcc-lr/denotes :lcc-639-1/Marshallese,
   :lcc-lr/hasTag "mh",
   :lcc-lr/identifies :lcc-639-1/Marshallese,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "mh",
   :skos/definition "language identifier for Marshallese"})

(def mi
  "language identifier for Maori"
  {:db/ident :lcc-639-1/mi,
   :lcc-lr/denotes :lcc-639-1/Maori,
   :lcc-lr/hasTag "mi",
   :lcc-lr/identifies :lcc-639-1/Maori,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "mi",
   :skos/definition "language identifier for Maori"})

(def mk
  "language identifier for Macedonian"
  {:db/ident :lcc-639-1/mk,
   :lcc-lr/denotes :lcc-639-1/Macedonian,
   :lcc-lr/hasTag "mk",
   :lcc-lr/identifies :lcc-639-1/Macedonian,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "mk",
   :skos/definition "language identifier for Macedonian"})

(def ml
  "language identifier for Malayalam"
  {:db/ident :lcc-639-1/ml,
   :lcc-lr/denotes :lcc-639-1/Malayalam,
   :lcc-lr/hasTag "ml",
   :lcc-lr/identifies :lcc-639-1/Malayalam,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ml",
   :skos/definition "language identifier for Malayalam"})

(def mn
  "language identifier for Mongolian"
  {:db/ident :lcc-639-1/mn,
   :lcc-lr/denotes :lcc-639-1/Mongolian,
   :lcc-lr/hasTag "mn",
   :lcc-lr/identifies :lcc-639-1/Mongolian,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "mn",
   :skos/definition "language identifier for Mongolian"})

(def mr
  "language identifier for Marathi"
  {:db/ident :lcc-639-1/mr,
   :lcc-lr/denotes :lcc-639-1/Marathi,
   :lcc-lr/hasTag "mr",
   :lcc-lr/identifies :lcc-639-1/Marathi,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "mr",
   :skos/definition "language identifier for Marathi"})

(def ms
  "language identifier for Malay"
  {:db/ident :lcc-639-1/ms,
   :lcc-lr/denotes :lcc-639-1/Malay,
   :lcc-lr/hasTag "ms",
   :lcc-lr/identifies :lcc-639-1/Malay,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ms",
   :skos/definition "language identifier for Malay"})

(def mt
  "language identifier for Maltese"
  {:db/ident :lcc-639-1/mt,
   :lcc-lr/denotes :lcc-639-1/Maltese,
   :lcc-lr/hasTag "mt",
   :lcc-lr/identifies :lcc-639-1/Maltese,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "mt",
   :skos/definition "language identifier for Maltese"})

(def my
  "language identifier for Burmese"
  {:db/ident :lcc-639-1/my,
   :lcc-lr/denotes :lcc-639-1/Burmese,
   :lcc-lr/hasTag "my",
   :lcc-lr/identifies :lcc-639-1/Burmese,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "my",
   :skos/definition "language identifier for Burmese"})

(def na
  "language identifier for Nauruan"
  {:db/ident :lcc-639-1/na,
   :lcc-lr/denotes :lcc-639-1/Nauru,
   :lcc-lr/hasTag "na",
   :lcc-lr/identifies :lcc-639-1/Nauru,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "na",
   :skos/definition "language identifier for Nauruan"})

(def nb
  "language identifier for Norwegian Bokmal"
  {:db/ident :lcc-639-1/nb,
   :lcc-lr/denotes :lcc-639-1/NorwegianBokmal,
   :lcc-lr/hasTag "nb",
   :lcc-lr/identifies :lcc-639-1/NorwegianBokmal,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "nb",
   :skos/definition "language identifier for Norwegian Bokmal"})

(def nd
  "language identifier for North Ndebele"
  {:db/ident :lcc-639-1/nd,
   :lcc-lr/denotes :lcc-639-1/NorthNdebele,
   :lcc-lr/hasTag "nd",
   :lcc-lr/identifies :lcc-639-1/NorthNdebele,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "nd",
   :skos/definition "language identifier for North Ndebele"})

(def ne
  "language identifier for Nepali"
  {:db/ident :lcc-639-1/ne,
   :lcc-lr/denotes :lcc-639-1/Nepali,
   :lcc-lr/hasTag "ne",
   :lcc-lr/identifies :lcc-639-1/Nepali,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ne",
   :skos/definition "language identifier for Nepali"})

(def ng
  "language identifier for Ndonga"
  {:db/ident :lcc-639-1/ng,
   :lcc-lr/denotes :lcc-639-1/Ndonga,
   :lcc-lr/hasTag "ng",
   :lcc-lr/identifies :lcc-639-1/Ndonga,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ng",
   :skos/definition "language identifier for Ndonga"})

(def nl
  "language identifier for Dutch"
  {:db/ident :lcc-639-1/nl,
   :lcc-lr/denotes :lcc-639-1/Dutch,
   :lcc-lr/hasTag "nl",
   :lcc-lr/identifies :lcc-639-1/Dutch,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "nl",
   :skos/definition "language identifier for Dutch"})

(def nn
  "language identifier for Norwegian Nynorsk"
  {:db/ident :lcc-639-1/nn,
   :lcc-lr/denotes :lcc-639-1/NorwegianNynorsk,
   :lcc-lr/hasTag "nn",
   :lcc-lr/identifies :lcc-639-1/NorwegianNynorsk,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "nn",
   :skos/definition "language identifier for Norwegian Nynorsk"})

(def no
  "language identifier for Norwegian"
  {:db/ident :lcc-639-1/no,
   :lcc-lr/denotes :lcc-639-1/Norwegian,
   :lcc-lr/hasTag "no",
   :lcc-lr/identifies :lcc-639-1/Norwegian,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "no",
   :skos/definition "language identifier for Norwegian"})

(def nr
  "language identifier for South Ndebele"
  {:db/ident :lcc-639-1/nr,
   :lcc-lr/denotes :lcc-639-1/SouthNdebele,
   :lcc-lr/hasTag "nr",
   :lcc-lr/identifies :lcc-639-1/SouthNdebele,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "nr",
   :skos/definition "language identifier for South Ndebele"})

(def nv
  "language identifier for Navajo; Navaho"
  {:db/ident :lcc-639-1/nv,
   :lcc-lr/denotes :lcc-639-1/Navajo,
   :lcc-lr/hasTag "nv",
   :lcc-lr/identifies :lcc-639-1/Navajo,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "nv",
   :skos/definition "language identifier for Navajo; Navaho"})

(def ny
  "language identifier for Chichewa; Chewa; Nyanja"
  {:db/ident :lcc-639-1/ny,
   :lcc-lr/denotes :lcc-639-1/Chichewa,
   :lcc-lr/hasTag "ny",
   :lcc-lr/identifies :lcc-639-1/Chichewa,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ny",
   :skos/definition "language identifier for Chichewa; Chewa; Nyanja"})

(def oc
  "language identifier for Occitan; Provencal (post 1500)"
  {:db/ident :lcc-639-1/oc,
   :lcc-lr/denotes :lcc-639-1/Occitan,
   :lcc-lr/hasTag "oc",
   :lcc-lr/identifies :lcc-639-1/Occitan,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "oc",
   :skos/definition "language identifier for Occitan; Provencal (post 1500)"})

(def oj
  "language identifier for Ojibwa"
  {:db/ident :lcc-639-1/oj,
   :lcc-lr/denotes :lcc-639-1/Ojibwa,
   :lcc-lr/hasTag "oj",
   :lcc-lr/identifies :lcc-639-1/Ojibwa,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "oj",
   :skos/definition "language identifier for Ojibwa"})

(def om
  "language identifier for Oromo"
  {:db/ident :lcc-639-1/om,
   :lcc-lr/denotes :lcc-639-1/Oromo,
   :lcc-lr/hasTag "om",
   :lcc-lr/identifies :lcc-639-1/Oromo,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "om",
   :skos/definition "language identifier for Oromo"})

(def or
  "language identifier for Oriya"
  {:db/ident :lcc-639-1/or,
   :lcc-lr/denotes :lcc-639-1/Oriya,
   :lcc-lr/hasTag "or",
   :lcc-lr/identifies :lcc-639-1/Oriya,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "or",
   :skos/definition "language identifier for Oriya"})

(def os
  "language identifier for Ossetian; Ossetic"
  {:db/ident :lcc-639-1/os,
   :lcc-lr/denotes :lcc-639-1/Ossetian,
   :lcc-lr/hasTag "os",
   :lcc-lr/identifies :lcc-639-1/Ossetian,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "os",
   :skos/definition "language identifier for Ossetian; Ossetic"})

(def pa
  "language identifier for Panjabi; Punjabi"
  {:db/ident :lcc-639-1/pa,
   :lcc-lr/denotes :lcc-639-1/Panjabi,
   :lcc-lr/hasTag "pa",
   :lcc-lr/identifies :lcc-639-1/Panjabi,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "pa",
   :skos/definition "language identifier for Panjabi; Punjabi"})

(def pi
  "language identifier for Pali"
  {:db/ident :lcc-639-1/pi,
   :lcc-lr/denotes :lcc-639-1/Pali,
   :lcc-lr/hasTag "pi",
   :lcc-lr/identifies :lcc-639-1/Pali,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "pi",
   :skos/definition "language identifier for Pali"})

(def pl
  "language identifier for Polish"
  {:db/ident :lcc-639-1/pl,
   :lcc-lr/denotes :lcc-639-1/Polish,
   :lcc-lr/hasTag "pl",
   :lcc-lr/identifies :lcc-639-1/Polish,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "pl",
   :skos/definition "language identifier for Polish"})

(def ps
  "language identifier for Pashto; Pushto"
  {:db/ident :lcc-639-1/ps,
   :lcc-lr/denotes :lcc-639-1/Pushto,
   :lcc-lr/hasTag "ps",
   :lcc-lr/identifies :lcc-639-1/Pushto,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ps",
   :skos/definition "language identifier for Pashto; Pushto"})

(def pt
  "language identifier for Portuguese"
  {:db/ident :lcc-639-1/pt,
   :lcc-lr/denotes :lcc-639-1/Portuguese,
   :lcc-lr/hasTag "pt",
   :lcc-lr/identifies :lcc-639-1/Portuguese,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "pt",
   :skos/definition "language identifier for Portuguese"})

(def qu
  "language identifier for Quechua"
  {:db/ident :lcc-639-1/qu,
   :lcc-lr/denotes :lcc-639-1/Quechua,
   :lcc-lr/hasTag "qu",
   :lcc-lr/identifies :lcc-639-1/Quechua,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "qu",
   :skos/definition "language identifier for Quechua"})

(def rm
  "language identifier for Romansh"
  {:db/ident :lcc-639-1/rm,
   :lcc-lr/denotes :lcc-639-1/Romansh,
   :lcc-lr/hasTag "rm",
   :lcc-lr/identifies :lcc-639-1/Romansh,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "rm",
   :skos/definition "language identifier for Romansh"})

(def rn
  "language identifier for Rundi"
  {:db/ident :lcc-639-1/rn,
   :lcc-lr/denotes :lcc-639-1/Rundi,
   :lcc-lr/hasTag "rn",
   :lcc-lr/identifies :lcc-639-1/Rundi,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "rn",
   :skos/definition "language identifier for Rundi"})

(def ro
  "language identifier for Romanian"
  {:db/ident :lcc-639-1/ro,
   :lcc-lr/denotes :lcc-639-1/Romanian,
   :lcc-lr/hasTag "ro",
   :lcc-lr/identifies :lcc-639-1/Romanian,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ro",
   :skos/definition "language identifier for Romanian"})

(def ru
  "language identifier for Russian"
  {:db/ident :lcc-639-1/ru,
   :lcc-lr/denotes :lcc-639-1/Russian,
   :lcc-lr/hasTag "ru",
   :lcc-lr/identifies :lcc-639-1/Russian,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ru",
   :skos/definition "language identifier for Russian"})

(def rw
  "language identifier for Kinyarwanda; Rwanda"
  {:db/ident :lcc-639-1/rw,
   :lcc-lr/denotes :lcc-639-1/Kinyarwanda,
   :lcc-lr/hasTag "rw",
   :lcc-lr/identifies :lcc-639-1/Kinyarwanda,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "rw",
   :skos/definition "language identifier for Kinyarwanda; Rwanda"})

(def sa
  "language identifier for Sanskrit"
  {:db/ident :lcc-639-1/sa,
   :lcc-lr/denotes :lcc-639-1/Sanskrit,
   :lcc-lr/hasTag "sa",
   :lcc-lr/identifies :lcc-639-1/Sanskrit,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "sa",
   :skos/definition "language identifier for Sanskrit"})

(def sc
  "language identifier for Sardinian"
  {:db/ident :lcc-639-1/sc,
   :lcc-lr/denotes :lcc-639-1/Sardinian,
   :lcc-lr/hasTag "sc",
   :lcc-lr/identifies :lcc-639-1/Sardinian,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "sc",
   :skos/definition "language identifier for Sardinian"})

(def sd
  "language identifier for Sindhi"
  {:db/ident :lcc-639-1/sd,
   :lcc-lr/denotes :lcc-639-1/Sindhi,
   :lcc-lr/hasTag "sd",
   :lcc-lr/identifies :lcc-639-1/Sindhi,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "sd",
   :skos/definition "language identifier for Sindhi"})

(def se
  "language identifier for Northern Sami"
  {:db/ident :lcc-639-1/se,
   :lcc-lr/denotes :lcc-639-1/NorthernSami,
   :lcc-lr/hasTag "se",
   :lcc-lr/identifies :lcc-639-1/NorthernSami,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "se",
   :skos/definition "language identifier for Northern Sami"})

(def sg
  "language identifier for Sango"
  {:db/ident :lcc-639-1/sg,
   :lcc-lr/denotes :lcc-639-1/Sango,
   :lcc-lr/hasTag "sg",
   :lcc-lr/identifies :lcc-639-1/Sango,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "sg",
   :skos/definition "language identifier for Sango"})

(def si
  "language identifier for Sinhala; Sinhalese"
  {:db/ident :lcc-639-1/si,
   :lcc-lr/denotes :lcc-639-1/Sinhala,
   :lcc-lr/hasTag "si",
   :lcc-lr/identifies :lcc-639-1/Sinhala,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "si",
   :skos/definition "language identifier for Sinhala; Sinhalese"})

(def sk
  "language identifier for Slovak"
  {:db/ident :lcc-639-1/sk,
   :lcc-lr/denotes :lcc-639-1/Slovak,
   :lcc-lr/hasTag "sk",
   :lcc-lr/identifies :lcc-639-1/Slovak,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "sk",
   :skos/definition "language identifier for Slovak"})

(def sl
  "language identifier for Slovenian"
  {:db/ident :lcc-639-1/sl,
   :lcc-lr/denotes :lcc-639-1/Slovenian,
   :lcc-lr/hasTag "sl",
   :lcc-lr/identifies :lcc-639-1/Slovenian,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "sl",
   :skos/definition "language identifier for Slovenian"})

(def sm
  "language identifier for Samoan"
  {:db/ident :lcc-639-1/sm,
   :lcc-lr/denotes :lcc-639-1/Samoan,
   :lcc-lr/hasTag "sm",
   :lcc-lr/identifies :lcc-639-1/Samoan,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "sm",
   :skos/definition "language identifier for Samoan"})

(def sn
  "language identifier for Shona"
  {:db/ident :lcc-639-1/sn,
   :lcc-lr/denotes :lcc-639-1/Shona,
   :lcc-lr/hasTag "sn",
   :lcc-lr/identifies :lcc-639-1/Shona,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "sn",
   :skos/definition "language identifier for Shona"})

(def so
  "language identifier for Somali"
  {:db/ident :lcc-639-1/so,
   :lcc-lr/denotes :lcc-639-1/Somali,
   :lcc-lr/hasTag "so",
   :lcc-lr/identifies :lcc-639-1/Somali,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "so",
   :skos/definition "language identifier for Somali"})

(def sq
  "language identifier for Albanian"
  {:db/ident :lcc-639-1/sq,
   :lcc-lr/denotes :lcc-639-1/Albanian,
   :lcc-lr/hasTag "sq",
   :lcc-lr/identifies :lcc-639-1/Albanian,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "sq",
   :skos/definition "language identifier for Albanian"})

(def sr
  "language identifier for Serbian"
  {:db/ident :lcc-639-1/sr,
   :lcc-lr/denotes :lcc-639-1/Serbian,
   :lcc-lr/hasTag "sr",
   :lcc-lr/identifies :lcc-639-1/Serbian,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "sr",
   :skos/definition "language identifier for Serbian"})

(def ss
  "language identifier for Swati"
  {:db/ident :lcc-639-1/ss,
   :lcc-lr/denotes :lcc-639-1/Swati,
   :lcc-lr/hasTag "ss",
   :lcc-lr/identifies :lcc-639-1/Swati,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ss",
   :skos/definition "language identifier for Swati"})

(def st
  "language identifier for Sesotho; Southern Sotho"
  {:db/ident :lcc-639-1/st,
   :lcc-lr/denotes :lcc-639-1/SouthernSotho,
   :lcc-lr/hasTag "st",
   :lcc-lr/identifies :lcc-639-1/SouthernSotho,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "st",
   :skos/definition "language identifier for Sesotho; Southern Sotho"})

(def su
  "language identifier for Sundanese"
  {:db/ident :lcc-639-1/su,
   :lcc-lr/denotes :lcc-639-1/Sundanese,
   :lcc-lr/hasTag "su",
   :lcc-lr/identifies :lcc-639-1/Sundanese,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "su",
   :skos/definition "language identifier for Sundanese"})

(def sv
  "language identifier for Swedish"
  {:db/ident :lcc-639-1/sv,
   :lcc-lr/denotes :lcc-639-1/Swedish,
   :lcc-lr/hasTag "sv",
   :lcc-lr/identifies :lcc-639-1/Swedish,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "sv",
   :skos/definition "language identifier for Swedish"})

(def sw
  "language identifier for Swahili"
  {:db/ident :lcc-639-1/sw,
   :lcc-lr/denotes :lcc-639-1/Swahili,
   :lcc-lr/hasTag "sw",
   :lcc-lr/identifies :lcc-639-1/Swahili,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "sw",
   :skos/definition "language identifier for Swahili"})

(def ta
  "language identifier for Tamil"
  {:db/ident :lcc-639-1/ta,
   :lcc-lr/denotes :lcc-639-1/Tamil,
   :lcc-lr/hasTag "ta",
   :lcc-lr/identifies :lcc-639-1/Tamil,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ta",
   :skos/definition "language identifier for Tamil"})

(def te
  "language identifier for Telugu"
  {:db/ident :lcc-639-1/te,
   :lcc-lr/denotes :lcc-639-1/Telugu,
   :lcc-lr/hasTag "te",
   :lcc-lr/identifies :lcc-639-1/Telugu,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "te",
   :skos/definition "language identifier for Telugu"})

(def tg
  "language identifier for Tajik"
  {:db/ident :lcc-639-1/tg,
   :lcc-lr/denotes :lcc-639-1/Tajik,
   :lcc-lr/hasTag "tg",
   :lcc-lr/identifies :lcc-639-1/Tajik,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "tg",
   :skos/definition "language identifier for Tajik"})

(def th
  "language identifier for Thai"
  {:db/ident :lcc-639-1/th,
   :lcc-lr/denotes :lcc-639-1/Thai,
   :lcc-lr/hasTag "th",
   :lcc-lr/identifies :lcc-639-1/Thai,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "th",
   :skos/definition "language identifier for Thai"})

(def ti
  "language identifier for Tigrinya"
  {:db/ident :lcc-639-1/ti,
   :lcc-lr/denotes :lcc-639-1/Tigrinya,
   :lcc-lr/hasTag "ti",
   :lcc-lr/identifies :lcc-639-1/Tigrinya,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ti",
   :skos/definition "language identifier for Tigrinya"})

(def tk
  "language identifier for Turkmen"
  {:db/ident :lcc-639-1/tk,
   :lcc-lr/denotes :lcc-639-1/Turkmen,
   :lcc-lr/hasTag "tk",
   :lcc-lr/identifies :lcc-639-1/Turkmen,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "tk",
   :skos/definition "language identifier for Turkmen"})

(def tl
  "language identifier for Tagalog"
  {:db/ident :lcc-639-1/tl,
   :lcc-lr/denotes :lcc-639-1/Tagalog,
   :lcc-lr/hasTag "tl",
   :lcc-lr/identifies :lcc-639-1/Tagalog,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "tl",
   :skos/definition "language identifier for Tagalog"})

(def tn
  "language identifier for Tswana"
  {:db/ident :lcc-639-1/tn,
   :lcc-lr/denotes :lcc-639-1/Tswana,
   :lcc-lr/hasTag "tn",
   :lcc-lr/identifies :lcc-639-1/Tswana,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "tn",
   :skos/definition "language identifier for Tswana"})

(def to
  "language identifier for Tonga (Tonga Islands)"
  {:db/ident :lcc-639-1/to,
   :lcc-lr/denotes :lcc-639-1/Tonga-TongaIslands,
   :lcc-lr/hasTag "to",
   :lcc-lr/identifies :lcc-639-1/Tonga-TongaIslands,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "to",
   :skos/definition "language identifier for Tonga (Tonga Islands)"})

(def tr
  "language identifier for Turkish"
  {:db/ident :lcc-639-1/tr,
   :lcc-lr/denotes :lcc-639-1/Turkish,
   :lcc-lr/hasTag "tr",
   :lcc-lr/identifies :lcc-639-1/Turkish,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "tr",
   :skos/definition "language identifier for Turkish"})

(def ts
  "language identifier for Tsonga"
  {:db/ident :lcc-639-1/ts,
   :lcc-lr/denotes :lcc-639-1/Tsonga,
   :lcc-lr/hasTag "ts",
   :lcc-lr/identifies :lcc-639-1/Tsonga,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ts",
   :skos/definition "language identifier for Tsonga"})

(def tt
  "language identifier for Tatar"
  {:db/ident :lcc-639-1/tt,
   :lcc-lr/denotes :lcc-639-1/Tatar,
   :lcc-lr/hasTag "tt",
   :lcc-lr/identifies :lcc-639-1/Tatar,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "tt",
   :skos/definition "language identifier for Tatar"})

(def tw
  "language identifier for Twi"
  {:db/ident :lcc-639-1/tw,
   :lcc-lr/denotes :lcc-639-1/Twi,
   :lcc-lr/hasTag "tw",
   :lcc-lr/identifies :lcc-639-1/Twi,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "tw",
   :skos/definition "language identifier for Twi"})

(def ty
  "language identifier for Tahitian"
  {:db/ident :lcc-639-1/ty,
   :lcc-lr/denotes :lcc-639-1/Tahitian,
   :lcc-lr/hasTag "ty",
   :lcc-lr/identifies :lcc-639-1/Tahitian,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ty",
   :skos/definition "language identifier for Tahitian"})

(def ug
  "language identifier for Uighur; Uyghur"
  {:db/ident :lcc-639-1/ug,
   :lcc-lr/denotes :lcc-639-1/Uighur,
   :lcc-lr/hasTag "ug",
   :lcc-lr/identifies :lcc-639-1/Uighur,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ug",
   :skos/definition "language identifier for Uighur; Uyghur"})

(def uk
  "language identifier for Ukrainian"
  {:db/ident :lcc-639-1/uk,
   :lcc-lr/denotes :lcc-639-1/Ukrainian,
   :lcc-lr/hasTag "uk",
   :lcc-lr/identifies :lcc-639-1/Ukrainian,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "uk",
   :skos/definition "language identifier for Ukrainian"})

(def ur
  "language identifier for Urdu"
  {:db/ident :lcc-639-1/ur,
   :lcc-lr/denotes :lcc-639-1/Urdu,
   :lcc-lr/hasTag "ur",
   :lcc-lr/identifies :lcc-639-1/Urdu,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ur",
   :skos/definition "language identifier for Urdu"})

(def uz
  "language identifier for Uzbek"
  {:db/ident :lcc-639-1/uz,
   :lcc-lr/denotes :lcc-639-1/Uzbek,
   :lcc-lr/hasTag "uz",
   :lcc-lr/identifies :lcc-639-1/Uzbek,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "uz",
   :skos/definition "language identifier for Uzbek"})

(def ve
  "language identifier for Venda"
  {:db/ident :lcc-639-1/ve,
   :lcc-lr/denotes :lcc-639-1/Venda,
   :lcc-lr/hasTag "ve",
   :lcc-lr/identifies :lcc-639-1/Venda,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ve",
   :skos/definition "language identifier for Venda"})

(def vi
  "language identifier for Vietnamese"
  {:db/ident :lcc-639-1/vi,
   :lcc-lr/denotes :lcc-639-1/Vietnamese,
   :lcc-lr/hasTag "vi",
   :lcc-lr/identifies :lcc-639-1/Vietnamese,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "vi",
   :skos/definition "language identifier for Vietnamese"})

(def vo
  "language identifier for Volapuk"
  {:db/ident :lcc-639-1/vo,
   :lcc-lr/denotes :lcc-639-1/Volapuk,
   :lcc-lr/hasTag "vo",
   :lcc-lr/identifies :lcc-639-1/Volapuk,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "vo",
   :skos/definition "language identifier for Volapuk"})

(def wa
  "language identifier for Walloon"
  {:db/ident :lcc-639-1/wa,
   :lcc-lr/denotes :lcc-639-1/Walloon,
   :lcc-lr/hasTag "wa",
   :lcc-lr/identifies :lcc-639-1/Walloon,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "wa",
   :skos/definition "language identifier for Walloon"})

(def wo
  "language identifier for Wolof"
  {:db/ident :lcc-639-1/wo,
   :lcc-lr/denotes :lcc-639-1/Wolof,
   :lcc-lr/hasTag "wo",
   :lcc-lr/identifies :lcc-639-1/Wolof,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "wo",
   :skos/definition "language identifier for Wolof"})

(def xh
  "language identifier for Xhosa"
  {:db/ident :lcc-639-1/xh,
   :lcc-lr/denotes :lcc-639-1/Xhosa,
   :lcc-lr/hasTag "xh",
   :lcc-lr/identifies :lcc-639-1/Xhosa,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "xh",
   :skos/definition "language identifier for Xhosa"})

(def yi
  "language identifier for Yiddish"
  {:db/ident :lcc-639-1/yi,
   :lcc-lr/denotes :lcc-639-1/Yiddish,
   :lcc-lr/hasTag "yi",
   :lcc-lr/identifies :lcc-639-1/Yiddish,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "yi",
   :skos/definition "language identifier for Yiddish"})

(def yo
  "language identifier for Yoruba"
  {:db/ident :lcc-639-1/yo,
   :lcc-lr/denotes :lcc-639-1/Yoruba,
   :lcc-lr/hasTag "yo",
   :lcc-lr/identifies :lcc-639-1/Yoruba,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "yo",
   :skos/definition "language identifier for Yoruba"})

(def za
  "language identifier for Zhuang; Chuang"
  {:db/ident :lcc-639-1/za,
   :lcc-lr/denotes :lcc-639-1/Zhuang,
   :lcc-lr/hasTag "za",
   :lcc-lr/identifies :lcc-639-1/Zhuang,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "za",
   :skos/definition "language identifier for Zhuang; Chuang"})

(def zh
  "language identifier for Chinese"
  {:db/ident :lcc-639-1/zh,
   :lcc-lr/denotes :lcc-639-1/Chinese,
   :lcc-lr/hasTag "zh",
   :lcc-lr/identifies :lcc-639-1/Chinese,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "zh",
   :skos/definition "language identifier for Chinese"})

(def zu
  "language identifier for Zulu"
  {:db/ident :lcc-639-1/zu,
   :lcc-lr/denotes :lcc-639-1/Zulu,
   :lcc-lr/hasTag "zu",
   :lcc-lr/identifies :lcc-639-1/Zulu,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type [:lcc-lr/Alpha2Code :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "zu",
   :skos/definition "language identifier for Zulu"})