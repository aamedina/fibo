(ns net.wikipunk.rdf.lcc-639-1
  {:dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :namespaces
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
   :owl/imports
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"},
   :owl/versionIRI
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/20211101/Languages/ISO639-1-LanguageCodes/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "lcc-639-1",
   :rdfa/uri "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
   :rdfs/label "ISO 639-1 Language Codes Ontology",
   :rdfs/seeAlso
   #{{:xsd/anyURI "http://www.loc.gov/standards/iso639-2/php/code_list.php/"}
     {:xsd/anyURI "https://www.omg.org/spec/LCC/AboutLCC/"}
     {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1.html"}
     {:xsd/anyURI "https://www.omg.org/spec/LCC/Languages/AboutLanguages/"}},
   :skos/changeNote
   #{"The https://www.omg.org/spec/LCC/20211101/Languages/ISO639-2-LanguageCodes.rdf version of this ontology has been revised to incorporate recently published Library of Congress links to their URIs for the language codes, minor revisions to metadata about the languages to be in sync with the LoC site, and is current as of 29 October 2021."
     "The https://www.omg.org/spec/LCC/20190201/Languages/ISO639-2-LanguageCodes.rdf version of this ontology is current as of 14 February 2019, based on the US Library of Congress site."
     "The http://www.omg.org/spec/LCC/20151101/Languages/ISO639-1-LanguageCodes.rdf version of this ontology has been revised to reflect the issues addressed by the LCC 1.0 FTF report.  The codes themselves are current as of 31 July 2017, based on the US Library of Congress site."},
   :sm/contentLanguage {:xsd/anyURI
                        "https://www.w3.org/TR/owl2-quick-reference/"},
   :sm/copyright #{"Copyright (c) 2019-2021 agnos.ai"
                   "Copyright (c) 2015-2021 Object Management Group, Inc."
                   "Copyright (c) 2015-2017 Unisys"
                   "Copyright (c) 2015-2019 Adaptive Inc."
                   "Copyright (c) 2015-2021 Thematix Partners LLC"},
   :sm/dependsOn
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"},
   :sm/fileAbbreviation "lcc-639-1",
   :sm/fileAbstract
   "This ontology represents the subset of the ISO 639 standard that provides the language names and actual codes for ISO 639-1.",
   :sm/filename "ISO639-1-LanguageCodes.rdf",
   :xsd/anyURI "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"}
  (:refer-clojure :exclude [or]))

(def Abkhazian
  {:db/ident :lcc-639-1/Abkhazian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Abkhazian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "abkhaze"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Abchasisch"},
   :lcc-lr/hasIndigenousName "apṕsua bysžwa",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/ab"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Abkhazian",
   :skos/definition "Abkhazian language"})

(def Afar
  {:db/ident :lcc-639-1/Afar,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Afar"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "afar"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Danakil-Sprache"},
   :lcc-lr/hasIndigenousName "afar",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/aa"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Afar",
   :skos/definition "Afar language"})

(def Afrikaans
  {:db/ident :lcc-639-1/Afrikaans,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Afrikaans"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "afrikaans"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Afrikaans"},
   :lcc-lr/hasIndigenousName "Afrikaans",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/af"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Afrikaans",
   :skos/definition "Afrikaans language"})

(def Akan
  {:db/ident :lcc-639-1/Akan,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Akan"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "akan"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Akan-Sprache"},
   :lcc-lr/hasIndigenousName "akana",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/ak"},
   :rdf/type #{:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Akan",
   :skos/definition "Akan language"})

(def Albanian
  {:db/ident :lcc-639-1/Albanian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Albanian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "albanais"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Albanisch"},
   :lcc-lr/hasIndigenousName "shqip",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/sq"},
   :rdf/type #{:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Albanian",
   :skos/definition "Albanian languages"})

(def Amharic
  {:db/ident :lcc-639-1/Amharic,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Amharic"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "amharique"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Amharisch"},
   :lcc-lr/hasIndigenousName "amarinja",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/am"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Amharic",
   :skos/definition "Amharic language"})

(def Arabic
  {:db/ident :lcc-639-1/Arabic,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Arabic"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "arabe"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Arabisch"},
   :lcc-lr/hasIndigenousName "'arabiy",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/ar"},
   :rdf/type #{:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Arabic",
   :skos/definition "Arabic language"})

(def Aragonese
  {:db/ident :lcc-639-1/Aragonese,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Aragonese"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "aragonais"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Aragonesisch"},
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/an"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Aragonese",
   :skos/definition "Aragonese language"})

(def Armenian
  {:db/ident :lcc-639-1/Armenian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Armenian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "arménien"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Armenisch"},
   :lcc-lr/hasIndigenousName "hayeren lezow",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/hy"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Armenian",
   :skos/definition "Armenian language"})

(def Assamese
  {:db/ident :lcc-639-1/Assamese,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Assamese"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "assamais"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Assamesisch"},
   :lcc-lr/hasIndigenousName "asamī",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/as"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Assamese",
   :skos/definition "Assamese language"})

(def Avaric
  {:db/ident :lcc-639-1/Avaric,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Avaric"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "avar"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Awarisch"},
   :lcc-lr/hasIndigenousName "avar mac‡",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/av"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Avaric",
   :skos/definition "Avaric language"})

(def Avestan
  {:db/ident :lcc-639-1/Avestan,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Avestan"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "avestique"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Avestisch"},
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/ae"},
   :rdf/type #{:owl/NamedIndividual :lcc-lr/AncientLanguage
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Avestan",
   :skos/definition "Avestan language"})

(def Aymara
  {:db/ident :lcc-639-1/Aymara,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Aymara"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "aymara"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Aymará-Sprache"},
   :lcc-lr/hasIndigenousName "aymara",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/ay"},
   :rdf/type #{:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Aymara",
   :skos/definition "Aymara language"})

(def Azerbaijani
  {:db/ident :lcc-639-1/Azerbaijani,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Azerbaijani"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "azéri"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Aserbeidschanisch"},
   :lcc-lr/hasIndigenousName "azǝrbaycan dil",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/az"},
   :rdf/type #{:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Azerbaijani",
   :skos/definition "Azerbaijani language"})

(def Bambara
  {:db/ident :lcc-639-1/Bambara,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Bambara"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "bambara"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Bambara-Sprache"},
   :lcc-lr/hasIndigenousName "bambankan",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/bm"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Bambara",
   :skos/definition "Bambara language"})

(def Bashkir
  {:db/ident :lcc-639-1/Bashkir,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Bashkir"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "bachkir"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Baschkirisch"},
   :lcc-lr/hasIndigenousName "bašǩort",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/ba"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Bashkir",
   :skos/definition "Bashkir language"})

(def Basque
  {:db/ident :lcc-639-1/Basque,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Basque"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "basque"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Baskisch"},
   :lcc-lr/hasIndigenousName #{"euskera" "euskara"},
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/eu"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Basque",
   :skos/definition "Basque language"})

(def Belarusian
  {:db/ident :lcc-639-1/Belarusian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Belarusian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "biélorusse"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Weißrussisch"},
   :lcc-lr/hasIndigenousName "belaruskaâ mova",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/be"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Belarusian",
   :skos/definition "Belarusian language"})

(def Bengali
  {:db/ident :lcc-639-1/Bengali,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Bengali"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "bengali"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Bengali"},
   :lcc-lr/hasIndigenousName "bāṅlā",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/bn"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Bengali",
   :skos/definition "Bengali language"})

(def BihariLanguages
  {:db/ident :lcc-639-1/BihariLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Bihari languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "langues biharis"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Bihari (Andere)"},
   :lcc-lr/hasIndigenousName "bihārī",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/bh"},
   :rdf/type #{:lcc-lr/LanguageFamily :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Bihari languages"})

(def Bislama
  {:db/ident :lcc-639-1/Bislama,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Bislama"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "bichlamar"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Beach-la-mar"},
   :lcc-lr/hasIndigenousName "bislama",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/bi"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Bislama",
   :skos/definition "Bislama language"})

(def Bosnian
  {:db/ident :lcc-639-1/Bosnian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Bosnian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "bosniaque"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Bosnisch"},
   :lcc-lr/hasIndigenousName "bosanski (jezik)",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/bs"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Bosnian",
   :skos/definition "Bosnian language"})

(def Breton
  {:db/ident :lcc-639-1/Breton,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Breton"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "breton"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Bretonisch"},
   :lcc-lr/hasIndigenousName "Brezhoneg",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/br"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Breton",
   :skos/definition "Breton language"})

(def Bulgarian
  {:db/ident :lcc-639-1/Bulgarian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Bulgarian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "bulgare"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Bulgarisch"},
   :lcc-lr/hasIndigenousName "b\"lgarski ezik",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/bg"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Bulgarian",
   :skos/definition "Bulgarian language"})

(def Burmese
  {:db/ident :lcc-639-1/Burmese,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Burmese"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "birman"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Birmanisch"},
   :lcc-lr/hasIndigenousName "myanmasa",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/my"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Burmese",
   :skos/definition "Burmese language"})

(def Catalan
  {:db/ident :lcc-639-1/Catalan,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "Valencian"}
                            {:rdf/language "en",
                             :rdf/value    "Catalan"}},
   :lcc-lr/hasFrenchName #{{:rdf/language "fr",
                            :rdf/value    "valencien"}
                           {:rdf/language "fr",
                            :rdf/value    "catalan"}},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Katalanisch"},
   :lcc-lr/hasIndigenousName "català",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/ca"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Catalan",
   :skos/definition "Catalan language"})

(def CentralKhmer
  {:db/ident :lcc-639-1/CentralKhmer,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Central Khmer"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "khmer central"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Kambodschanisch"},
   :lcc-lr/hasIndigenousName "khmêr",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/km"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Central Khmer",
   :skos/definition "Central Khmer language"})

(def Chamorro
  {:db/ident :lcc-639-1/Chamorro,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Chamorro"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "chamorro"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Chamorro-Sprache"},
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/ch"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Chamorro",
   :skos/definition "Chamorro language"})

(def Chechen
  {:db/ident :lcc-639-1/Chechen,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Chechen"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tchétchène"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Tschetschenisch"},
   :lcc-lr/hasIndigenousName #{"noxçiyn mott" "nohčijn mott"},
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/ce"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Chechen",
   :skos/definition "Chechen language"})

(def Chichewa
  {:db/ident :lcc-639-1/Chichewa,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "Nyanja"}
                            {:rdf/language "en",
                             :rdf/value    "Chichewa"}
                            {:rdf/language "en",
                             :rdf/value    "Chewa"}},
   :lcc-lr/hasFrenchName #{{:rdf/language "fr",
                            :rdf/value    "chewa"}
                           {:rdf/language "fr",
                            :rdf/value    "nyanja"}
                           {:rdf/language "fr",
                            :rdf/value    "chichewa"}},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Nyanja-Sprache"},
   :lcc-lr/hasIndigenousName #{"tshichewa" "tshinyanja"},
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/ny"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Chichewa",
   :skos/definition "Chichewa language"})

(def Chinese
  {:db/ident :lcc-639-1/Chinese,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Chinese"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "chinois"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Chinesisch"},
   :lcc-lr/hasIndigenousName "zhongwen",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/zh"},
   :rdf/type #{:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Chinese",
   :skos/definition "Chinese languages"})

(def ChurchSlavic
  {:db/ident :lcc-639-1/ChurchSlavic,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "Old Bulgarian"}
                            {:rdf/language "en",
                             :rdf/value    "Old Slavonic"}
                            {:rdf/language "en",
                             :rdf/value    "Church Slavic"}
                            {:rdf/language "en",
                             :rdf/value    "Old Church Slavonic"}
                            {:rdf/language "en",
                             :rdf/value    "Church Slavonic"}},
   :lcc-lr/hasFrenchName #{{:rdf/language "fr",
                            :rdf/value    "slavon liturgique"}
                           {:rdf/language "fr",
                            :rdf/value    "slavon d'église"}
                           {:rdf/language "fr",
                            :rdf/value    "vieux bulgare"}
                           {:rdf/language "fr",
                            :rdf/value    "vieux slave"}},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Kirchenslawisch"},
   :lcc-lr/hasIndigenousName "cerkovno-slavânskij",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/cu"},
   :rdf/type #{:owl/NamedIndividual :lcc-lr/AncientLanguage
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Church Slavic",
   :skos/definition "Church Slavic language"})

(def Chuvash
  {:db/ident :lcc-639-1/Chuvash,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Chuvash"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tchouvache"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Tschuwaschisch"},
   :lcc-lr/hasIndigenousName "čǎvaš čělhi",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/cv"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Chuvash",
   :skos/definition "Chuvash language"})

(def Cornish
  {:db/ident :lcc-639-1/Cornish,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Cornish"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "cornique"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Kornisch"},
   :lcc-lr/hasIndigenousName "Kernewek",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/kw"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Cornish",
   :skos/definition "Cornish language"})

(def Corsican
  {:db/ident :lcc-639-1/Corsican,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Corsican"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "corse"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Korsisch"},
   :lcc-lr/hasIndigenousName "corsu",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/co"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Corsican",
   :skos/definition "Corsican language"})

(def Cree
  {:db/ident :lcc-639-1/Cree,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Cree"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "cree"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Cree-Sprache"},
   :lcc-lr/hasIndigenousName "nêhiyawa",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/cr"},
   :rdf/type #{:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Cree",
   :skos/definition "Cree languages"})

(def Croatian
  {:db/ident :lcc-639-1/Croatian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Croatian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "croate"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Kroatisch"},
   :lcc-lr/hasIndigenousName "hrvatski jezik",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/hr"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Croatian",
   :skos/definition "Croatian language"})

(def Czech
  {:db/ident :lcc-639-1/Czech,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Czech"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tchèque"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Tschechisch"},
   :lcc-lr/hasIndigenousName "český jazyk",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/cs"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Czech",
   :skos/definition "Czech language"})

(def Danish
  {:db/ident :lcc-639-1/Danish,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Danish"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "danois"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Dänisch"},
   :lcc-lr/hasIndigenousName "dansk",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/da"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Danish",
   :skos/definition "Danish language"})

(def Dhivehi
  {:db/ident :lcc-639-1/Dhivehi,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "Maldivian"}
                            {:rdf/language "en",
                             :rdf/value    "Dhivehi"}
                            {:rdf/language "en",
                             :rdf/value    "Divehi"}},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "maldivien"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Maledivisch"},
   :lcc-lr/hasIndigenousName "dhivehi",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/dv"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Dhivehi",
   :skos/definition "Divehi language"})

(def Dutch
  {:db/ident :lcc-639-1/Dutch,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "Flemish"}
                            {:rdf/language "en",
                             :rdf/value    "Dutch"}},
   :lcc-lr/hasFrenchName #{{:rdf/language "fr",
                            :rdf/value    "néerlandais"}
                           {:rdf/language "fr",
                            :rdf/value    "flamand"}},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Niederländisch"},
   :lcc-lr/hasIndigenousName "Nederlands",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/nl"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Dutch",
   :skos/definition "Dutch language"})

(def Dzongkha
  {:db/ident :lcc-639-1/Dzongkha,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Dzongkha"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "dzongkha"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Dzongkha"},
   :lcc-lr/hasIndigenousName "dzongkha",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/dz"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Dzongkha",
   :skos/definition "Dzongkha language"})

(def English
  {:db/ident :lcc-639-1/English,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "English"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "anglais"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Englisch"},
   :lcc-lr/hasIndigenousName "English",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/en"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "English",
   :skos/definition "English language"})

(def Esperanto
  {:db/ident :lcc-639-1/Esperanto,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Esperanto"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "espéranto"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Esperanto"},
   :lcc-lr/hasIndigenousName "esperanto",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/eo"},
   :rdf/type #{:lcc-lr/ArtificialLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Esperanto",
   :skos/definition "Esperanto language"})

(def Estonian
  {:db/ident :lcc-639-1/Estonian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Estonian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "estonien"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Estnisch"},
   :lcc-lr/hasIndigenousName "eesti keel",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/et"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Estonian",
   :skos/definition "Estonian language"})

(def Ewe
  {:db/ident :lcc-639-1/Ewe,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Ewe"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "éwé"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Ewe-Sprache"},
   :lcc-lr/hasIndigenousName "eve",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/ee"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Ewe",
   :skos/definition "Ewe language"})

(def Faroese
  {:db/ident :lcc-639-1/Faroese,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Faroese"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "féroïen"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Färöisch"},
   :lcc-lr/hasIndigenousName "føroyskt",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/fo"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Faroese",
   :skos/definition "Faroese language"})

(def Fijian
  {:db/ident :lcc-639-1/Fijian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Fijian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "fidjien"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Fidschi-Sprache"},
   :lcc-lr/hasIndigenousName "Na Vosa Vakaviti",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/fj"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Fijian",
   :skos/definition "Fijian language"})

(def Finnish
  {:db/ident :lcc-639-1/Finnish,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Finnish"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "finnois"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Finnisch"},
   :lcc-lr/hasIndigenousName #{"suomen kieli" "suomi"},
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/fi"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Finnish",
   :skos/definition "Finnish language"})

(def French
  {:db/ident :lcc-639-1/French,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "French"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "français"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Französisch"},
   :lcc-lr/hasIndigenousName "français",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/fr"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "French",
   :skos/definition "French language"})

(def Fulah
  {:db/ident :lcc-639-1/Fulah,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Fulah"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "peul"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Ful"},
   :lcc-lr/hasIndigenousName "fulfulde",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/ff"},
   :rdf/type #{:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Fulah",
   :skos/definition "Fulah languages"})

(def Gaelic
  {:db/ident :lcc-639-1/Gaelic,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "Scottish Gaelic"}
                            {:rdf/language "en",
                             :rdf/value    "Gaelic"}},
   :lcc-lr/hasFrenchName #{{:rdf/language "fr",
                            :rdf/value    "gaélique écossais"}
                           {:rdf/language "fr",
                            :rdf/value    "gaélique"}},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Gälisch-Schottisch"},
   :lcc-lr/hasIndigenousName "Gàidhlig",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/gd"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Gaelic",
   :skos/definition "Gaelic language"})

(def Galician
  {:db/ident :lcc-639-1/Galician,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Galician"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "galicien"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Galicisch"},
   :lcc-lr/hasIndigenousName "galego",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/gl"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Galician",
   :skos/definition "Galician; Gallegan language"})

(def Ganda
  {:db/ident :lcc-639-1/Ganda,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Ganda"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "ganda"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Ganda-Sprache"},
   :lcc-lr/hasIndigenousName "luganda",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/lg"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Ganda",
   :skos/definition "Ganda language"})

(def Georgian
  {:db/ident :lcc-639-1/Georgian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Georgian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "géorgien"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Georgisch"},
   :lcc-lr/hasIndigenousName "k'art'uli ena",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/ka"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Georgian",
   :skos/definition "Georgian language"})

(def German
  {:db/ident :lcc-639-1/German,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "German"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "allemand"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Deutsch"},
   :lcc-lr/hasIndigenousName "Deutsch",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/de"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "German",
   :skos/definition "German language"})

(def Guarani
  {:db/ident :lcc-639-1/Guarani,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Guarani"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "guarani"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Guaraní-Sprache"},
   :lcc-lr/hasIndigenousName "guarani",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/gn"},
   :rdf/type #{:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Guarani",
   :skos/definition "Guarani language"})

(def Gujarati
  {:db/ident :lcc-639-1/Gujarati,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Gujarati"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "goudjrati"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Gujarati-Sprache"},
   :lcc-lr/hasIndigenousName "gujarātī",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/gu"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Gujarati",
   :skos/definition "Gujarati language"})

(def Haitian
  {:db/ident :lcc-639-1/Haitian,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "Haitian"}
                            {:rdf/language "en",
                             :rdf/value    "Haitian Creole"}},
   :lcc-lr/hasFrenchName #{{:rdf/language "fr",
                            :rdf/value    "haïtien"}
                           {:rdf/language "fr",
                            :rdf/value    "créole haïtien"}},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Haïtien (Haiti-Kreolisch)"},
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/ht"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Haitian",
   :skos/definition "Haitian; Haitian Creole language"})

(def Hausa
  {:db/ident :lcc-639-1/Hausa,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Hausa"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "haoussa"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Haussa-Sprache"},
   :lcc-lr/hasIndigenousName "hausa",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/ha"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Hausa",
   :skos/definition "Hausa language"})

(def Hebrew
  {:db/ident :lcc-639-1/Hebrew,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Hebrew"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "hébreu"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Hebräisch"},
   :lcc-lr/hasIndigenousName "ivrit",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/he"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Hebrew",
   :skos/definition "Hebrew language"})

(def Herero
  {:db/ident :lcc-639-1/Herero,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Herero"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "herero"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Herero-Sprache"},
   :lcc-lr/hasIndigenousName "otshiherero",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/hz"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Herero",
   :skos/definition "Herero language"})

(def Hindi
  {:db/ident :lcc-639-1/Hindi,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Hindi"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "hindi"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Hindi"},
   :lcc-lr/hasIndigenousName "hindī",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/hi"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Hindi",
   :skos/definition "Hindi language"})

(def HiriMotu
  {:db/ident :lcc-639-1/HiriMotu,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Hiri Motu"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "hiri motu"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Hiri-Motu"},
   :lcc-lr/hasIndigenousName "Hiri Motu",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/ho"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Hiri Motu",
   :skos/definition "Hiri Motu language"})

(def Hungarian
  {:db/ident :lcc-639-1/Hungarian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Hungarian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "hongrois"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Ungarisch"},
   :lcc-lr/hasIndigenousName "magyar nyelv",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/hu"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Hungarian",
   :skos/definition "Hungarian language"})

(def ISO639-1-CodeSet
  {:db/ident :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:lcc-lr/CodeSet :owl/NamedIndividual
               :lcc-lr/IdentificationScheme},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "ISO 639-1 code set",
   :rdfs/seeAlso
   #{{:xsd/anyURI "http://www.infoterm.info/standardization/iso_639_1_2002.php"}
     {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1.html"}},
   :skos/definition
   "the set of language identifiers that make up the ISO 639-1 specification"})

(def Icelandic
  {:db/ident :lcc-639-1/Icelandic,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Icelandic"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "islandais"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Isländisch"},
   :lcc-lr/hasIndigenousName "íslenska",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/is"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Icelandic",
   :skos/definition "Icelandic language"})

(def Ido
  {:db/ident :lcc-639-1/Ido,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Ido"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "ido"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Ido"},
   :lcc-lr/hasIndigenousName "ido ",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/io"},
   :rdf/type #{:lcc-lr/ArtificialLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Ido",
   :skos/definition "Ido language"})

(def Igbo
  {:db/ident :lcc-639-1/Igbo,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Igbo"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "igbo"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Ibo-Sprache"},
   :lcc-lr/hasIndigenousName "igbo",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/ig"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Igbo",
   :skos/definition "Igbo language"})

(def Indonesian
  {:db/ident :lcc-639-1/Indonesian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Indonesian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "indonésien"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Bahasa Indonesia"},
   :lcc-lr/hasIndigenousName "bahasa Indonesia",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/id"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Indonesian",
   :skos/definition "Indonesian language"})

(def Interlingua
  {:db/ident :lcc-639-1/Interlingua,
   :lcc-lr/hasEnglishName
   {:rdf/language "en",
    :rdf/value    "Interlingua (International Auxiliary Language Association)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value
                          "interlingua (langue auxiliaire internationale)"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Interlingua"},
   :lcc-lr/hasIndigenousName "interlingua",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/ia"},
   :rdf/type #{:lcc-lr/ArtificialLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Interlingua",
   :skos/definition
   "Interlingua (International Auxiliary Language Association) language"})

(def Interlingue
  {:db/ident :lcc-639-1/Interlingue,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "Occidental"}
                            {:rdf/language "en",
                             :rdf/value    "Interlingue"}},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "interlingue"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Interlingue"},
   :lcc-lr/hasIndigenousName "interlingue",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/ie"},
   :rdf/type #{:lcc-lr/ArtificialLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Interlingue",
   :skos/definition "Interlingue language"})

(def Inuktitut
  {:db/ident :lcc-639-1/Inuktitut,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Inuktitut"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "inuktitut"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Inuktitut"},
   :lcc-lr/hasIndigenousName "inuktitut",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/iu"},
   :rdf/type #{:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Inuktitut",
   :skos/definition "Inuktitut language"})

(def Inupiaq
  {:db/ident :lcc-639-1/Inupiaq,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Inupiaq"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "inupiaq"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Inupik"},
   :lcc-lr/hasIndigenousName "inupiaq",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/ik"},
   :rdf/type #{:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Inupiaq",
   :skos/definition "Inupiaq language"})

(def Irish
  {:db/ident :lcc-639-1/Irish,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Irish"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "irlandais"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Irisch"},
   :lcc-lr/hasIndigenousName "Gaeilge",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/ga"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Irish",
   :skos/definition "Irish language"})

(def Italian
  {:db/ident :lcc-639-1/Italian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Italian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "italien"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Italienisch"},
   :lcc-lr/hasIndigenousName "italiano",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/it"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Italian",
   :skos/definition "Italian language"})

(def Japanese
  {:db/ident :lcc-639-1/Japanese,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Japanese"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "japonais"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Japanisch"},
   :lcc-lr/hasIndigenousName #{"nihongo" "nippongo"},
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/ja"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Japanese",
   :skos/definition "Japanese language"})

(def Javanese
  {:db/ident :lcc-639-1/Javanese,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Javanese"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "javanais"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Javanisch"},
   :lcc-lr/hasIndigenousName "bahasa Jawa",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/jv"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Javanese",
   :skos/definition "Javanese language"})

(def Kalaallisut
  {:db/ident :lcc-639-1/Kalaallisut,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "Kalaallisut"}
                            {:rdf/language "en",
                             :rdf/value    "Greenlandic"}},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "groenlandais"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Grönländisch"},
   :lcc-lr/hasIndigenousName "kalaallisut",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/kl"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Kalaallisut",
   :skos/definition "Kalaallisut language"})

(def Kannada
  {:db/ident :lcc-639-1/Kannada,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Kannada"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "kannada"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Kannada"},
   :lcc-lr/hasIndigenousName "kannaḍa",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/kn"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Kannada",
   :skos/definition "Kannada language"})

(def Kanuri
  {:db/ident :lcc-639-1/Kanuri,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Kanuri"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "kanouri"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Kanuri-Sprache"},
   :lcc-lr/hasIndigenousName "kanuri",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/kr"},
   :rdf/type #{:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Kanuri",
   :skos/definition "Kanuri language"})

(def Kashmiri
  {:db/ident :lcc-639-1/Kashmiri,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Kashmiri"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "kashmiri"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Kaschmiri"},
   :lcc-lr/hasIndigenousName "kaśmīrī",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/ks"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Kashmiri",
   :skos/definition "Kashmiri language"})

(def Kazakh
  {:db/ident :lcc-639-1/Kazakh,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Kazakh"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "kazakh"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Kasachisch"},
   :lcc-lr/hasIndigenousName "ķazaķ (tili)",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/kk"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Kazakh",
   :skos/definition "Kazakh language"})

(def Kikuyu
  {:db/ident :lcc-639-1/Kikuyu,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "Gikuyu"}
                            {:rdf/language "en",
                             :rdf/value    "Kikuyu"}},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "kikuyu"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Kikuyu-Sprache"},
   :lcc-lr/hasIndigenousName "Gikuyu",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/ki"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Kikuyu",
   :skos/definition "Kikuyu language"})

(def Kinyarwanda
  {:db/ident :lcc-639-1/Kinyarwanda,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Kinyarwanda"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "kinyarwanda"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Rwanda-Sprache"},
   :lcc-lr/hasIndigenousName "kinyarwanda",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/rw"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Kinyarwanda",
   :skos/definition "Kinyarwanda language"})

(def Kirghiz
  {:db/ident :lcc-639-1/Kirghiz,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "Kyrgyz"}
                            {:rdf/language "en",
                             :rdf/value    "Kirghiz"}},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "kirghiz"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Kirgisisch"},
   :lcc-lr/hasIndigenousName "kyrgyz tili",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/ky"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Kirghiz",
   :skos/definition "Kirghiz language"})

(def Komi
  {:db/ident :lcc-639-1/Komi,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Komi"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "komi"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Komi-Sprache"},
   :lcc-lr/hasIndigenousName "komi kyv",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/kv"},
   :rdf/type #{:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Komi",
   :skos/definition "Komi language"})

(def Kongo
  {:db/ident :lcc-639-1/Kongo,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Kongo"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "kongo"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Kongo-Sprache"},
   :lcc-lr/hasIndigenousName "kikongo",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/kg"},
   :rdf/type #{:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Kongo",
   :skos/definition "Kongo languages"})

(def Korean
  {:db/ident :lcc-639-1/Korean,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Korean"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "coréen"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Koreanisch"},
   :lcc-lr/hasIndigenousName #{"hanguk-o" "choson-o"},
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/ko"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Korean",
   :skos/definition "Korean language"})

(def Kuanyama
  {:db/ident :lcc-639-1/Kuanyama,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "Kwanyama"}
                            {:rdf/language "en",
                             :rdf/value    "Kuanyama"}},
   :lcc-lr/hasFrenchName #{{:rdf/language "fr",
                            :rdf/value    "kwanyama"}
                           {:rdf/language "fr",
                            :rdf/value    "kuanyama"}},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Kwanyama-Sprache"},
   :lcc-lr/hasIndigenousName "oshikwanyama",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/kj"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Kuanyama",
   :skos/definition "Kuanyama language"})

(def Kurdish
  {:db/ident :lcc-639-1/Kurdish,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Kurdish"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "kurde"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Kurdisch"},
   :lcc-lr/hasIndigenousName "zimany kurdy",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/ku"},
   :rdf/type #{:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Kurdish",
   :skos/definition "Kurdish language"})

(def Lao
  {:db/ident :lcc-639-1/Lao,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Lao"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "lao"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Laotisch"},
   :lcc-lr/hasIndigenousName "pha xa lao",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/lo"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Lao",
   :skos/definition "Lao language"})

(def Latin
  {:db/ident :lcc-639-1/Latin,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Latin"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "latin"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Latein"},
   :lcc-lr/hasIndigenousName "lingua latina",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/la"},
   :rdf/type #{:owl/NamedIndividual :lcc-lr/AncientLanguage
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Latin",
   :skos/definition "Latin language"})

(def Latvian
  {:db/ident :lcc-639-1/Latvian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Latvian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "letton"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Lettisch"},
   :lcc-lr/hasIndigenousName "latviešu valoda",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/lv"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Latvian",
   :skos/definition "Latvian language"})

(def Limburgan
  {:db/ident :lcc-639-1/Limburgan,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "Limburgish"}
                            {:rdf/language "en",
                             :rdf/value    "Limburger"}
                            {:rdf/language "en",
                             :rdf/value    "Limburgan"}},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "limbourgeois"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Limburgisch"},
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/li"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Limburgan",
   :skos/definition "Limburgan; Limburger; Limburgish language"})

(def Lingala
  {:db/ident :lcc-639-1/Lingala,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Lingala"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "lingala"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Lingala"},
   :lcc-lr/hasIndigenousName "lingala",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/ln"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Lingala",
   :skos/definition "Lingala language"})

(def Lithuanian
  {:db/ident :lcc-639-1/Lithuanian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Lithuanian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "lituanien"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Litauisch"},
   :lcc-lr/hasIndigenousName "lietuvių kalba",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/lt"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Lithuanian",
   :skos/definition "Lithuanian language"})

(def LubaKatanga
  {:db/ident :lcc-639-1/LubaKatanga,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Luba-Katanga"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "luba-katanga"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Luba-Katanga-Sprache"},
   :lcc-lr/hasIndigenousName "tshiluba",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/lu"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Luba-Katanga",
   :skos/definition "Luba-Katanga language"})

(def Luxembourgish
  {:db/ident :lcc-639-1/Luxembourgish,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "Luxembourgish"}
                            {:rdf/language "en",
                             :rdf/value    "Letzeburgesch"}},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "luxembourgeois"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Luxemburgisch"},
   :lcc-lr/hasIndigenousName "lëtzebuergesch",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/lb"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Luxembourgish",
   :skos/definition "Luxembourgish language"})

(def Macedonian
  {:db/ident :lcc-639-1/Macedonian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Macedonian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "macédonien"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Makedonisch"},
   :lcc-lr/hasIndigenousName "makedonski",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/mk"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Macedonian",
   :skos/definition "Macedonian language"})

(def Malagasy
  {:db/ident :lcc-639-1/Malagasy,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Malagasy"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "malgache"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Malagassi-Sprache"},
   :lcc-lr/hasIndigenousName "malagasy",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/mg"},
   :rdf/type #{:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Malagasy",
   :skos/definition "Malagasy languages"})

(def Malay
  {:db/ident :lcc-639-1/Malay,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Malay (macrolanguage)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "malais"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Malaiisch"},
   :lcc-lr/hasIndigenousName "bahasa Malaysia",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/ms"},
   :rdf/type #{:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Malay",
   :skos/definition "Malay macrolanguage"})

(def Malayalam
  {:db/ident :lcc-639-1/Malayalam,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Malayalam"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "malayalam"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Malayalam"},
   :lcc-lr/hasIndigenousName "malayāḷaṁ",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/ml"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Malayalam",
   :skos/definition "Malayalam language"})

(def Maltese
  {:db/ident :lcc-639-1/Maltese,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Maltese"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "maltais"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Maltesisch"},
   :lcc-lr/hasIndigenousName "il-Malti",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/mt"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Maltese",
   :skos/definition "Maltese language"})

(def Manx
  {:db/ident :lcc-639-1/Manx,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Manx"},
   :lcc-lr/hasFrenchName #{{:rdf/language "fr",
                            :rdf/value    "manx"}
                           {:rdf/language "fr",
                            :rdf/value    "mannois"}},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Manx"},
   :lcc-lr/hasIndigenousName "Gaelg",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/gv"},
   :rdf/type #{:owl/NamedIndividual :lcc-lr/ExtinctLanguage
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Manx",
   :skos/definition "Manx language"})

(def Maori
  {:db/ident :lcc-639-1/Maori,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Maori"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "maori"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Maori-Sprache"},
   :lcc-lr/hasIndigenousName "māori",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/mi"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Maori",
   :skos/definition "Maori language"})

(def Marathi
  {:db/ident :lcc-639-1/Marathi,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Marathi"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "marathe"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Marathi"},
   :lcc-lr/hasIndigenousName "marāṭī",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/mr"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Marathi",
   :skos/definition "Marathi language"})

(def Marshallese
  {:db/ident :lcc-639-1/Marshallese,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Marshallese"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "marshall"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Marschallesisch"},
   :lcc-lr/hasIndigenousName "M̧ajeł",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/mh"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Marshallese",
   :skos/definition "Marshallese language"})

(def ModernGreek
  {:db/ident :lcc-639-1/ModernGreek,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Greek, Modern (1453-)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "grec moderne (après 1453)"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Neugriechisch"},
   :lcc-lr/hasIndigenousName "elliniká",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/el"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Modern Greek",
   :skos/definition "Modern Greek (post 1453-) language"})

(def Mongolian
  {:db/ident :lcc-639-1/Mongolian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Mongolian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "mongol"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Mongolisch"},
   :lcc-lr/hasIndigenousName "mongol",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/mn"},
   :rdf/type #{:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Mongolian",
   :skos/definition "Mongolian languages"})

(def Nauru
  {:db/ident :lcc-639-1/Nauru,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Nauru"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "nauruan"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Nauruanisch"},
   :lcc-lr/hasIndigenousName "nauru",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/na"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Nauru",
   :skos/definition "Nauru language"})

(def Navajo
  {:db/ident :lcc-639-1/Navajo,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "Navajo"}
                            {:rdf/language "en",
                             :rdf/value    "Navaho"}},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "navaho"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Navajo-Sprache"},
   :lcc-lr/hasIndigenousName "diné bizaad",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/nv"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Navajo",
   :skos/definition "Navajo language"})

(def Ndonga
  {:db/ident :lcc-639-1/Ndonga,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Ndonga"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "ndonga"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Ndonga"},
   :lcc-lr/hasIndigenousName "oshindonga",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/ng"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Ndonga",
   :skos/definition "Ndonga language"})

(def Nepali
  {:db/ident :lcc-639-1/Nepali,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Nepali"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "népalais"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Nepali"},
   :lcc-lr/hasIndigenousName "nepālī",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/ne"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Nepali",
   :skos/definition "Nepali language"})

(def NorthNdebele
  {:db/ident :lcc-639-1/NorthNdebele,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "Ndebele, North"}
                            {:rdf/language "en",
                             :rdf/value    "North Ndebele"}},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "ndébélé du Nord"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Ndebele-Sprache (Simbabwe)"},
   :lcc-lr/hasIndigenousName "isiNdebele",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/nd"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "North Ndebele",
   :skos/definition "North Ndebele language"})

(def NorthernSami
  {:db/ident :lcc-639-1/NorthernSami,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Northern Sami"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sami du Nord"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Nordsaamisch"},
   :lcc-lr/hasIndigenousName "davvisámegiella",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/se"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Northern Sami",
   :skos/definition "Northern Sami language"})

(def Norwegian
  {:db/ident :lcc-639-1/Norwegian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Norwegian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "norvégien"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Norwegisch"},
   :lcc-lr/hasIndigenousName "norsk",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/no"},
   :rdf/type #{:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Norwegian",
   :skos/definition "Norwegian language"})

(def NorwegianBokmal
  {:db/ident :lcc-639-1/NorwegianBokmal,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "Bokmål, Norwegian"}
                            {:rdf/language "en",
                             :rdf/value    "Norwegian Bokmål"}},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "norvégien bokmål"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Bokmål"},
   :lcc-lr/hasIndigenousName "bokmål",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/nb"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Norwegian Bokmal",
   :skos/definition "Norwegian Bokmal language"})

(def NorwegianNynorsk
  {:db/ident :lcc-639-1/NorwegianNynorsk,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "Nynorsk, Norwegian"}
                            {:rdf/language "en",
                             :rdf/value    "Norwegian Nynorsk"}},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "norvégien nynorsk"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Nynorsk"},
   :lcc-lr/hasIndigenousName "nynorsk",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/nn"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Norwegian Nynorsk",
   :skos/definition "Norwegian Nynorsk language"})

(def Nyanja
  {:db/ident       :lcc-639-1/Nyanja,
   :owl/deprecated true,
   :owl/sameAs     :lcc-639-1/Chichewa,
   :rdf/type       :owl/NamedIndividual})

(def Occitan
  {:db/ident :lcc-639-1/Occitan,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Occitan (post 1500)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "occitan (après 1500)"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Okzitanisch"},
   :lcc-lr/hasIndigenousName "occitan",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/oc"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Occitan",
   :skos/definition "Occitan (post 1500) language"})

(def Ojibwa
  {:db/ident :lcc-639-1/Ojibwa,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Ojibwa"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "ojibwa"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Ojibwa-Sprache"},
   :lcc-lr/hasIndigenousName #{"chippewa" "ojibwe"},
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/oj"},
   :rdf/type #{:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Ojibwa",
   :skos/definition "Ojibwa languages"})

(def Oriya
  {:db/ident :lcc-639-1/Oriya,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Oriya"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "oriya"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Oriya-Sprache"},
   :lcc-lr/hasIndigenousName "oṛiā",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/or"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Oriya",
   :skos/definition "Oriya language"})

(def Oromo
  {:db/ident :lcc-639-1/Oromo,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Oromo"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "galla"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Galla-Sprache"},
   :lcc-lr/hasIndigenousName "(afan) oromo",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/om"},
   :rdf/type #{:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Oromo",
   :skos/definition "Oromo languages"})

(def Ossetian
  {:db/ident :lcc-639-1/Ossetian,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "Ossetic"}
                            {:rdf/language "en",
                             :rdf/value    "Ossetian"}},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "ossète"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Ossetisch"},
   :lcc-lr/hasIndigenousName "iron avzæg",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/os"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Ossetian",
   :skos/definition "Ossetian; Ossetic language"})

(def Pali
  {:db/ident :lcc-639-1/Pali,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Pali"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "pali"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Pali"},
   :lcc-lr/hasIndigenousName "pāli bhāsa",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/pi"},
   :rdf/type #{:owl/NamedIndividual :lcc-lr/AncientLanguage
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Pali",
   :skos/definition "Pali language"})

(def Panjabi
  {:db/ident :lcc-639-1/Panjabi,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "Punjabi"}
                            {:rdf/language "en",
                             :rdf/value    "Panjabi"}},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "pendjabi"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Pandschabi-Sprache"},
   :lcc-lr/hasIndigenousName "paṁjābī",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/pa"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Panjabi",
   :skos/definition "Panjabi language"})

(def Persian
  {:db/ident :lcc-639-1/Persian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Persian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "persan"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Persisch"},
   :lcc-lr/hasIndigenousName "fârsy",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/fa"},
   :rdf/type #{:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Persian",
   :skos/definition "Persian languages"})

(def Polish
  {:db/ident :lcc-639-1/Polish,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Polish"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "polonais"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Polnisch"},
   :lcc-lr/hasIndigenousName "(język) polski",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/pl"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Polish",
   :skos/definition "Polish language"})

(def Portuguese
  {:db/ident :lcc-639-1/Portuguese,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Portuguese"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "portugais"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Portugiesisch"},
   :lcc-lr/hasIndigenousName "português",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/pt"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Portuguese",
   :skos/definition "Portuguese language"})

(def Pushto
  {:db/ident :lcc-639-1/Pushto,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "Pashto"}
                            {:rdf/language "en",
                             :rdf/value    "Pushto"}},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "pachto"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Paschtu"},
   :lcc-lr/hasIndigenousName "pashto",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/ps"},
   :rdf/type #{:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Pushto",
   :skos/definition "Pushto languages"})

(def Quechua
  {:db/ident :lcc-639-1/Quechua,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Quechua"},
   :lcc-lr/hasFrenchName #{{:rdf/language "fr",
                            :rdf/value    "quichua"}
                           {:rdf/language "fr",
                            :rdf/value    "quechua"}},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Quechua-Sprache"},
   :lcc-lr/hasIndigenousName "qhëtshwa",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/qu"},
   :rdf/type #{:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Quechua",
   :skos/definition "Quechua languages"})

(def Romanian
  {:db/ident :lcc-639-1/Romanian,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "Moldavian"}
                            {:rdf/language "en",
                             :rdf/value    "Romanian"}
                            {:rdf/language "en",
                             :rdf/value    "Moldovan"}},
   :lcc-lr/hasFrenchName #{{:rdf/language "fr",
                            :rdf/value    "moldave"}
                           {:rdf/language "fr",
                            :rdf/value    "roumain"}},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Rumänisch"},
   :lcc-lr/hasIndigenousName #{"(limba) moldoveanǎ" "(limba) română"},
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/ro"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Romanian",
   :skos/definition "Romanian language"})

(def Romansh
  {:db/ident :lcc-639-1/Romansh,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Romansh"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "romanche"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Rätoromanisch"},
   :lcc-lr/hasIndigenousName "romontsch",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/rm"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Romansh",
   :skos/definition "Romansh language"})

(def Rundi
  {:db/ident :lcc-639-1/Rundi,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Rundi"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "rundi"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Rundi-Sprache"},
   :lcc-lr/hasIndigenousName "kirundi",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/rn"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Rundi",
   :skos/definition "Rundi language"})

(def Russian
  {:db/ident :lcc-639-1/Russian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Russian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "russe"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Russisch"},
   :lcc-lr/hasIndigenousName "russkij (âzyk)",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/ru"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Russian",
   :skos/definition "Russian language"})

(def Samoan
  {:db/ident :lcc-639-1/Samoan,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Samoan"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "samoan"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Samoanisch"},
   :lcc-lr/hasIndigenousName "samoa",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/sm"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Samoan",
   :skos/definition "Samoan language"})

(def Sango
  {:db/ident :lcc-639-1/Sango,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Sango"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sango"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Sango-Sprache"},
   :lcc-lr/hasIndigenousName "sango",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/sg"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Sango",
   :skos/definition "Sango language"})

(def Sanskrit
  {:db/ident :lcc-639-1/Sanskrit,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Sanskrit"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sanskrit"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Sanskrit"},
   :lcc-lr/hasIndigenousName "saṁskr̥tam",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/sa"},
   :rdf/type #{:owl/NamedIndividual :lcc-lr/AncientLanguage
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Sanskrit",
   :skos/definition "Sanskrit language"})

(def Sardinian
  {:db/ident :lcc-639-1/Sardinian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Sardinian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sarde"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Sardisch"},
   :lcc-lr/hasIndigenousName "sardu",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/sc"},
   :rdf/type #{:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Sardinian",
   :skos/definition "Sardinian languages"})

(def ScottishGaelic
  {:db/ident       :lcc-639-1/ScottishGaelic,
   :owl/deprecated true,
   :owl/sameAs     :lcc-639-1/Gaelic,
   :rdf/type       :owl/NamedIndividual})

(def Serbian
  {:db/ident :lcc-639-1/Serbian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Serbian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "serbe"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Serbisch"},
   :lcc-lr/hasIndigenousName "srpski (jezik)",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/sr"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Serbian",
   :skos/definition "Serbian language"})

(def Shona
  {:db/ident :lcc-639-1/Shona,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Shona"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "shona"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Schona-Sprache"},
   :lcc-lr/hasIndigenousName "chiShona",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/sn"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Shona",
   :skos/definition "Shona language"})

(def SichuanYi
  {:db/ident :lcc-639-1/SichuanYi,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "Sichuan Yi"}
                            {:rdf/language "en",
                             :rdf/value    "Nuosu"}},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "yi de Sichuan"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Lalo-Sprache"},
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/ii"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Sichuan Yi",
   :skos/definition "Sichuan Yi language"})

(def Sindhi
  {:db/ident :lcc-639-1/Sindhi,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Sindhi"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sindhi"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Sindhi-Sprache"},
   :lcc-lr/hasIndigenousName "sindhī",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/sd"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Sindhi",
   :skos/definition "Sindhi language"})

(def Sinhala
  {:db/ident :lcc-639-1/Sinhala,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "Sinhalese"}
                            {:rdf/language "en",
                             :rdf/value    "Sinhala"}},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "singhalais"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Singhalesisch"},
   :lcc-lr/hasIndigenousName "siṁhala",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/si"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Sinhala",
   :skos/definition "Sinhala; Sinhalese language"})

(def Slovak
  {:db/ident :lcc-639-1/Slovak,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Slovak"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "slovaque"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Slowakisch"},
   :lcc-lr/hasIndigenousName "slovenský (jazyk)",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/sk"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Slovak",
   :skos/definition "Slovak language"})

(def Slovenian
  {:db/ident :lcc-639-1/Slovenian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Slovenian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "slovène"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Slowenisch"},
   :lcc-lr/hasIndigenousName "slovenski (jezik)",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/sl"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Slovenian",
   :skos/definition "Slovenian language"})

(def Somali
  {:db/ident :lcc-639-1/Somali,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Somali"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "somali"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Somali"},
   :lcc-lr/hasIndigenousName "soomaali",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/so"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Somali",
   :skos/definition "Somali language"})

(def SouthNdebele
  {:db/ident :lcc-639-1/SouthNdebele,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "South Ndebele"}
                            {:rdf/language "en",
                             :rdf/value    "Ndebele, South"}},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "ndébélé du Sud"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Ndebele-Sprache (Transvaal)"},
   :lcc-lr/hasIndigenousName "isiNdebele",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/nr"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "South Ndebele",
   :skos/definition "South Ndebele language"})

(def SouthernSotho
  {:db/ident :lcc-639-1/SouthernSotho,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "Sotho, Southern"}
                            {:rdf/language "en",
                             :rdf/value    "Southern Sotho"}},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sotho du Sud"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Süd-Sotho-Sprache"},
   :lcc-lr/hasIndigenousName "Sesotho",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/st"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Southern Sotho",
   :skos/definition "Southern Sotho language"})

(def Spanish
  {:db/ident :lcc-639-1/Spanish,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "Spanish"}
                            {:rdf/language "en",
                             :rdf/value    "Castilian"}},
   :lcc-lr/hasFrenchName #{{:rdf/language "fr",
                            :rdf/value    "espagnol"}
                           {:rdf/language "fr",
                            :rdf/value    "castillan"}},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Spanisch"},
   :lcc-lr/hasIndigenousName #{"castellano" "español"},
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/es"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Spanish",
   :skos/definition "Spanish language"})

(def Sundanese
  {:db/ident :lcc-639-1/Sundanese,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Sundanese"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "soundanais"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Sundanesisch"},
   :lcc-lr/hasIndigenousName "bahasa Sunda",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/su"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Sundanese",
   :skos/definition "Sundanese languaage"})

(def Swahili
  {:db/ident :lcc-639-1/Swahili,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Swahili"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "swahili"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Swahili"},
   :lcc-lr/hasIndigenousName "Kiswahili",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/sw"},
   :rdf/type #{:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Swahili",
   :skos/definition "Swahili macrolanguage"})

(def Swati
  {:db/ident :lcc-639-1/Swati,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Swati"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "swati"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Swasi-Sprache"},
   :lcc-lr/hasIndigenousName "siSwati",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/ss"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Swati",
   :skos/definition "Swati language"})

(def Swedish
  {:db/ident :lcc-639-1/Swedish,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Swedish"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "suédois"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Schwedisch"},
   :lcc-lr/hasIndigenousName "svenska",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/sv"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Swedish",
   :skos/definition "Swedish language"})

(def Tagalog
  {:db/ident :lcc-639-1/Tagalog,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tagalog"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tagalog"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Tagalog"},
   :lcc-lr/hasIndigenousName "tagalog",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/tl"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Tagalog",
   :skos/definition "Tagalog language"})

(def Tahitian
  {:db/ident :lcc-639-1/Tahitian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tahitian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tahitien"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Tahitisch"},
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/ty"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Tahitian",
   :skos/definition "Tahitian language"})

(def Tajik
  {:db/ident :lcc-639-1/Tajik,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tajik"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tadjik"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Tadschikisch"},
   :lcc-lr/hasIndigenousName "toçikī",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/tg"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Tajik",
   :skos/definition "Tajik language"})

(def Tamil
  {:db/ident :lcc-639-1/Tamil,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tamil"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tamoul"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Tamil"},
   :lcc-lr/hasIndigenousName "tamiḻ",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/ta"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Tamil",
   :skos/definition "Tamil language"})

(def Tatar
  {:db/ident :lcc-639-1/Tatar,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tatar"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tatar"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Tatarisch"},
   :lcc-lr/hasIndigenousName "tatar tele",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/tt"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Tatar",
   :skos/definition "Tatar language"})

(def Telugu
  {:db/ident :lcc-639-1/Telugu,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Telugu"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "télougou"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Telugu-Sprache"},
   :lcc-lr/hasIndigenousName "telugu",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/te"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Telugu",
   :skos/definition "Telugu language"})

(def Thai
  {:db/ident :lcc-639-1/Thai,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Thai"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "thaï"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Thailändisch"},
   :lcc-lr/hasIndigenousName "thai",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/th"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Thai",
   :skos/definition "Thai language"})

(def Tibetan
  {:db/ident :lcc-639-1/Tibetan,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tibetan"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tibétain"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Tibetisch"},
   :lcc-lr/hasIndigenousName "bod skad",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/bo"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Tibetan",
   :skos/definition "Tibetan language"})

(def Tigrinya
  {:db/ident :lcc-639-1/Tigrinya,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tigrinya"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tigrigna"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Tigrinja-Sprache"},
   :lcc-lr/hasIndigenousName "tigriña",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/ti"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Tigrinya",
   :skos/definition "Tigrinya language"})

(def Tonga-TongaIslands
  {:db/ident :lcc-639-1/Tonga-TongaIslands,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tonga (Tonga Islands)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tonga (îles Tonga)"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Tongaisch"},
   :lcc-lr/hasIndigenousName "tonga",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/to"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Tonga (Tonga Islands)",
   :skos/definition "Tonga (Tonga Islands) language"})

(def Tsonga
  {:db/ident :lcc-639-1/Tsonga,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tsonga"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tsonga"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Tsonga-Sprache"},
   :lcc-lr/hasIndigenousName "Xitsonga",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/ts"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Tsonga",
   :skos/definition "Tsonga language"})

(def Tswana
  {:db/ident :lcc-639-1/Tswana,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tswana"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tswana"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Tswana-Sprache"},
   :lcc-lr/hasIndigenousName "Setswana",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/tn"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Tswana",
   :skos/definition "Tswana language"})

(def Turkish
  {:db/ident :lcc-639-1/Turkish,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Turkish"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "turc"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Türkisch"},
   :lcc-lr/hasIndigenousName "türkçe",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/tr"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Turkish",
   :skos/definition "Turkish language"})

(def Turkmen
  {:db/ident :lcc-639-1/Turkmen,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Turkmen"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "turkmène"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Turkmenisch"},
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/tk"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Turkmen",
   :skos/definition "Turkmen language"})

(def Twi
  {:db/ident :lcc-639-1/Twi,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Twi"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "twi"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Twi-Sprache"},
   :lcc-lr/hasIndigenousName "twi",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/tw"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Twi",
   :skos/definition "Twi language"})

(def Uighur
  {:db/ident :lcc-639-1/Uighur,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "Uighur"}
                            {:rdf/language "en",
                             :rdf/value    "Uyghur"}},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "ouïgour"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Uigurisch"},
   :lcc-lr/hasIndigenousName "oyghurqǝ",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/ug"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Uighur",
   :skos/definition "Uighur language"})

(def Ukrainian
  {:db/ident :lcc-639-1/Ukrainian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Ukrainian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "ukrainien"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Ukrainisch"},
   :lcc-lr/hasIndigenousName "ukraïns'ka mova",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/uk"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Ukrainian",
   :skos/definition "Ukrainian language"})

(def Urdu
  {:db/ident :lcc-639-1/Urdu,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Urdu"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "ourdou"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Urdu"},
   :lcc-lr/hasIndigenousName "urdū",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/ur"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Urdu",
   :skos/definition "Urdu language"})

(def Uzbek
  {:db/ident :lcc-639-1/Uzbek,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Uzbek"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "ouszbek"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Usbekisch"},
   :lcc-lr/hasIndigenousName "oʻzbek tili",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/uz"},
   :rdf/type #{:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Uzbek",
   :skos/definition "Uzbek languages"})

(def Venda
  {:db/ident :lcc-639-1/Venda,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Venda"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "venda"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Venda-Sprache"},
   :lcc-lr/hasIndigenousName "Tshivenḓa",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/ve"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Venda",
   :skos/definition "Venda language"})

(def Vietnamese
  {:db/ident :lcc-639-1/Vietnamese,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Vietnamese"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "vietnamien"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Vietnamesisch"},
   :lcc-lr/hasIndigenousName "Tiếng Việt Nam",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/vi"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Vietnamese",
   :skos/definition "Vietnamese language"})

(def Volapuk
  {:db/ident :lcc-639-1/Volapuk,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Volapük"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "volapük"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Volapük"},
   :lcc-lr/hasIndigenousName "volapük",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/vo"},
   :rdf/type #{:lcc-lr/ArtificialLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Volapuk",
   :skos/definition "Volapuk language"})

(def Walloon
  {:db/ident :lcc-639-1/Walloon,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Walloon"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "wallon"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Wallonisch"},
   :lcc-lr/hasIndigenousName "wallon",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/wa"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Walloon",
   :skos/definition "Walloon language"})

(def Welsh
  {:db/ident :lcc-639-1/Welsh,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Welsh"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "gallois"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Kymrisch"},
   :lcc-lr/hasIndigenousName "Cymraeg",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/cy"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Welsh",
   :skos/definition "Welsh language"})

(def WesternFrisian
  {:db/ident :lcc-639-1/WesternFrisian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Western Frisian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "frison occidental"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Friesisch"},
   :lcc-lr/hasIndigenousName "frysk",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/fy"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Western Frisian",
   :skos/definition "Western Frisian language"})

(def Wolof
  {:db/ident :lcc-639-1/Wolof,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Wolof"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "wolof"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Wolof-Sprache"},
   :lcc-lr/hasIndigenousName "wolof",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/wo"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Wolof",
   :skos/definition "Wolof language"})

(def Xhosa
  {:db/ident :lcc-639-1/Xhosa,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Xhosa"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "xhosa"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Xhosa-Sprache"},
   :lcc-lr/hasIndigenousName "isiXhosa",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/xh"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Xhosa",
   :skos/definition "Xhosa language"})

(def Yiddish
  {:db/ident :lcc-639-1/Yiddish,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Yiddish"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "yiddish"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Jiddisch"},
   :lcc-lr/hasIndigenousName "yidiš",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/yi"},
   :rdf/type #{:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Yiddish",
   :skos/definition "Yiddish language"})

(def Yoruba
  {:db/ident :lcc-639-1/Yoruba,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Yoruba"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "yoruba"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Yoruba-Sprache"},
   :lcc-lr/hasIndigenousName "Yorùbá",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/yo"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Yoruba",
   :skos/definition "Yoruba language"})

(def Zhuang
  {:db/ident :lcc-639-1/Zhuang,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "Chuang"}
                            {:rdf/language "en",
                             :rdf/value    "Zhuang"}},
   :lcc-lr/hasFrenchName #{{:rdf/language "fr",
                            :rdf/value    "chuang"}
                           {:rdf/language "fr",
                            :rdf/value    "zhuang"}},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Zhuang"},
   :lcc-lr/hasIndigenousName "cuengh",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/za"},
   :rdf/type #{:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Zhuang",
   :skos/definition "Zhuang languages"})

(def Zulu
  {:db/ident :lcc-639-1/Zulu,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Zulu"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "zoulou"},
   :lcc-lr/hasGermanName {:rdf/language "de",
                          :rdf/value    "Zulu-Sprache"},
   :lcc-lr/hasIndigenousName "isiZulu",
   :owl/sameAs {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1/zu"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "Zulu",
   :skos/definition "Zulu language"})

(def aa
  {:db/ident :lcc-639-1/aa,
   :lcc-lr/denotes :lcc-639-1/Afar,
   :lcc-lr/hasTag "aa",
   :lcc-lr/identifies :lcc-639-1/Afar,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "aa",
   :skos/definition "language identifier for Afar"})

(def ab
  {:db/ident :lcc-639-1/ab,
   :lcc-lr/denotes :lcc-639-1/Abkhazian,
   :lcc-lr/hasTag "ab",
   :lcc-lr/identifies :lcc-639-1/Abkhazian,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "ab",
   :skos/definition "language identifier for Abkhazian; Abkhaz"})

(def ae
  {:db/ident :lcc-639-1/ae,
   :lcc-lr/denotes :lcc-639-1/Avestan,
   :lcc-lr/hasTag "ae",
   :lcc-lr/identifies :lcc-639-1/Avestan,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "ae",
   :skos/definition "language identifier for Avestan"})

(def af
  {:db/ident :lcc-639-1/af,
   :lcc-lr/denotes :lcc-639-1/Afrikaans,
   :lcc-lr/hasTag "af",
   :lcc-lr/identifies :lcc-639-1/Afrikaans,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "af",
   :skos/definition "language identifier for Afrikaans"})

(def ak
  {:db/ident :lcc-639-1/ak,
   :lcc-lr/denotes :lcc-639-1/Akan,
   :lcc-lr/hasTag "ak",
   :lcc-lr/identifies :lcc-639-1/Akan,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "ak",
   :skos/definition "language identifier for Akan"})

(def am
  {:db/ident :lcc-639-1/am,
   :lcc-lr/denotes :lcc-639-1/Amharic,
   :lcc-lr/hasTag "am",
   :lcc-lr/identifies :lcc-639-1/Amharic,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "am",
   :skos/definition "language identifier for Amharic"})

(def an
  {:db/ident :lcc-639-1/an,
   :lcc-lr/denotes :lcc-639-1/Aragonese,
   :lcc-lr/hasTag "an",
   :lcc-lr/identifies :lcc-639-1/Aragonese,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "an",
   :skos/definition "language identifier for Aragonese"})

(def ar
  {:db/ident :lcc-639-1/ar,
   :lcc-lr/denotes :lcc-639-1/Arabic,
   :lcc-lr/hasTag "ar",
   :lcc-lr/identifies :lcc-639-1/Arabic,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "ar",
   :skos/definition "language identifier for Arabic"})

(def as
  {:db/ident :lcc-639-1/as,
   :lcc-lr/denotes :lcc-639-1/Assamese,
   :lcc-lr/hasTag "as",
   :lcc-lr/identifies :lcc-639-1/Assamese,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "as",
   :skos/definition "language identifier for Assamese"})

(def av
  {:db/ident :lcc-639-1/av,
   :lcc-lr/denotes :lcc-639-1/Avaric,
   :lcc-lr/hasTag "av",
   :lcc-lr/identifies :lcc-639-1/Avaric,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "av",
   :skos/definition "language identifier for Avaric"})

(def ay
  {:db/ident :lcc-639-1/ay,
   :lcc-lr/denotes :lcc-639-1/Aymara,
   :lcc-lr/hasTag "ay",
   :lcc-lr/identifies :lcc-639-1/Aymara,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "ay",
   :skos/definition "language identifier for Aymara"})

(def az
  {:db/ident :lcc-639-1/az,
   :lcc-lr/denotes :lcc-639-1/Azerbaijani,
   :lcc-lr/hasTag "az",
   :lcc-lr/identifies :lcc-639-1/Azerbaijani,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "az",
   :skos/definition "language identifier for Azerbaijani"})

(def ba
  {:db/ident :lcc-639-1/ba,
   :lcc-lr/denotes :lcc-639-1/Bashkir,
   :lcc-lr/hasTag "ba",
   :lcc-lr/identifies :lcc-639-1/Bashkir,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "ba",
   :skos/definition "language identifier for Bashkir"})

(def be
  {:db/ident :lcc-639-1/be,
   :lcc-lr/denotes :lcc-639-1/Belarusian,
   :lcc-lr/hasTag "be",
   :lcc-lr/identifies :lcc-639-1/Belarusian,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "be",
   :skos/definition "language identifier for Belarusian"})

(def bg
  {:db/ident :lcc-639-1/bg,
   :lcc-lr/denotes :lcc-639-1/Bulgarian,
   :lcc-lr/hasTag "bg",
   :lcc-lr/identifies :lcc-639-1/Bulgarian,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "bg",
   :skos/definition "language identifier for Bulgarian"})

(def bh
  {:db/ident :lcc-639-1/bh,
   :lcc-lr/denotes :lcc-639-1/BihariLanguages,
   :lcc-lr/hasTag "bh",
   :lcc-lr/identifies :lcc-639-1/BihariLanguages,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "bh",
   :skos/definition "language identifier for Bihari languages"})

(def bi
  {:db/ident :lcc-639-1/bi,
   :lcc-lr/denotes :lcc-639-1/Bislama,
   :lcc-lr/hasTag "bi",
   :lcc-lr/identifies :lcc-639-1/Bislama,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "bi",
   :skos/definition "language identifier for Bislama"})

(def bm
  {:db/ident :lcc-639-1/bm,
   :lcc-lr/denotes :lcc-639-1/Bambara,
   :lcc-lr/hasTag "bm",
   :lcc-lr/identifies :lcc-639-1/Bambara,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "bm",
   :skos/definition "language identifier for Bambara"})

(def bn
  {:db/ident :lcc-639-1/bn,
   :lcc-lr/denotes :lcc-639-1/Bengali,
   :lcc-lr/hasTag "bn",
   :lcc-lr/identifies :lcc-639-1/Bengali,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "bn",
   :skos/definition "language identifier for Bengali; Bangla"})

(def bo
  {:db/ident :lcc-639-1/bo,
   :lcc-lr/denotes :lcc-639-1/Tibetan,
   :lcc-lr/hasTag "bo",
   :lcc-lr/identifies :lcc-639-1/Tibetan,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "bo",
   :skos/definition "language identifier for Tibetan"})

(def br
  {:db/ident :lcc-639-1/br,
   :lcc-lr/denotes :lcc-639-1/Breton,
   :lcc-lr/hasTag "br",
   :lcc-lr/identifies :lcc-639-1/Breton,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "br",
   :skos/definition "language identifier for Breton"})

(def bs
  {:db/ident :lcc-639-1/bs,
   :lcc-lr/denotes :lcc-639-1/Bosnian,
   :lcc-lr/hasTag "bs",
   :lcc-lr/identifies :lcc-639-1/Bosnian,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "bs",
   :skos/definition "language identifier for Bosnian"})

(def ca
  {:db/ident :lcc-639-1/ca,
   :lcc-lr/denotes :lcc-639-1/Catalan,
   :lcc-lr/hasTag "ca",
   :lcc-lr/identifies :lcc-639-1/Catalan,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "ca",
   :skos/definition "language identifier for Catalan"})

(def ce
  {:db/ident :lcc-639-1/ce,
   :lcc-lr/denotes :lcc-639-1/Chechen,
   :lcc-lr/hasTag "ce",
   :lcc-lr/identifies :lcc-639-1/Chechen,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "ce",
   :skos/definition "language identifier for Chechen"})

(def ch
  {:db/ident :lcc-639-1/ch,
   :lcc-lr/denotes :lcc-639-1/Chamorro,
   :lcc-lr/hasTag "ch",
   :lcc-lr/identifies :lcc-639-1/Chamorro,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "ch",
   :skos/definition "language identifier for Chamorro"})

(def co
  {:db/ident :lcc-639-1/co,
   :lcc-lr/denotes :lcc-639-1/Corsican,
   :lcc-lr/hasTag "co",
   :lcc-lr/identifies :lcc-639-1/Corsican,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "co",
   :skos/definition "language identifier for Corsican"})

(def cr
  {:db/ident :lcc-639-1/cr,
   :lcc-lr/denotes :lcc-639-1/Cree,
   :lcc-lr/hasTag "cr",
   :lcc-lr/identifies :lcc-639-1/Cree,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "cr",
   :skos/definition "language identifier for Cree"})

(def cs
  {:db/ident :lcc-639-1/cs,
   :lcc-lr/denotes :lcc-639-1/Czech,
   :lcc-lr/hasTag "cs",
   :lcc-lr/identifies :lcc-639-1/Czech,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "cs",
   :skos/definition "language identifier for Czech"})

(def cu
  {:db/ident :lcc-639-1/cu,
   :lcc-lr/denotes :lcc-639-1/ChurchSlavic,
   :lcc-lr/hasTag "cu",
   :lcc-lr/identifies :lcc-639-1/ChurchSlavic,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "cu",
   :skos/definition
   "language identifier for Old Slavonic; Old Church Slavonic; Church Slavonic; Church Slavic; Old Bulgarian"})

(def cv
  {:db/ident :lcc-639-1/cv,
   :lcc-lr/denotes :lcc-639-1/Chuvash,
   :lcc-lr/hasTag "cv",
   :lcc-lr/identifies :lcc-639-1/Chuvash,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "cv",
   :skos/definition "language identifier for Chuvash"})

(def cy
  {:db/ident :lcc-639-1/cy,
   :lcc-lr/denotes :lcc-639-1/Welsh,
   :lcc-lr/hasTag "cy",
   :lcc-lr/identifies :lcc-639-1/Welsh,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "cy",
   :skos/definition "language identifier for Welsh"})

(def da
  {:db/ident :lcc-639-1/da,
   :lcc-lr/denotes :lcc-639-1/Danish,
   :lcc-lr/hasTag "da",
   :lcc-lr/identifies :lcc-639-1/Danish,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "da",
   :skos/definition "language identifier for Danish"})

(def de
  {:db/ident :lcc-639-1/de,
   :lcc-lr/denotes :lcc-639-1/German,
   :lcc-lr/hasTag "de",
   :lcc-lr/identifies :lcc-639-1/German,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "de",
   :skos/definition "language identifier for German"})

(def dv
  {:db/ident :lcc-639-1/dv,
   :lcc-lr/denotes :lcc-639-1/Dhivehi,
   :lcc-lr/hasTag "dv",
   :lcc-lr/identifies :lcc-639-1/Dhivehi,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "dv",
   :skos/definition "language identifier for Dhivehi"})

(def dz
  {:db/ident :lcc-639-1/dz,
   :lcc-lr/denotes :lcc-639-1/Dzongkha,
   :lcc-lr/hasTag "dz",
   :lcc-lr/identifies :lcc-639-1/Dzongkha,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "dz",
   :skos/definition "language identifier for Dzongkha; Bhutani; Butanese"})

(def ee
  {:db/ident :lcc-639-1/ee,
   :lcc-lr/denotes :lcc-639-1/Ewe,
   :lcc-lr/hasTag "ee",
   :lcc-lr/identifies :lcc-639-1/Ewe,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "ee",
   :skos/definition "language identifier for Ewe"})

(def el
  {:db/ident :lcc-639-1/el,
   :lcc-lr/denotes :lcc-639-1/ModernGreek,
   :lcc-lr/hasTag "el",
   :lcc-lr/identifies :lcc-639-1/ModernGreek,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "el",
   :skos/definition "language identifier for Modern Greek (post 1453)"})

(def en
  {:db/ident :lcc-639-1/en,
   :lcc-lr/denotes :lcc-639-1/English,
   :lcc-lr/hasTag "en",
   :lcc-lr/identifies :lcc-639-1/English,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "en",
   :skos/definition "language identifier for English"})

(def eo
  {:db/ident :lcc-639-1/eo,
   :lcc-lr/denotes :lcc-639-1/Esperanto,
   :lcc-lr/hasTag "eo",
   :lcc-lr/identifies :lcc-639-1/Esperanto,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "eo",
   :skos/definition "language identifier for Esperanto"})

(def es
  {:db/ident :lcc-639-1/es,
   :lcc-lr/denotes :lcc-639-1/Spanish,
   :lcc-lr/hasTag "es",
   :lcc-lr/identifies :lcc-639-1/Spanish,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "es",
   :skos/definition "language identifier for Spanish; Castilian"})

(def et
  {:db/ident :lcc-639-1/et,
   :lcc-lr/denotes :lcc-639-1/Estonian,
   :lcc-lr/hasTag "et",
   :lcc-lr/identifies :lcc-639-1/Estonian,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "et",
   :skos/definition "language identifier for Estonian"})

(def eu
  {:db/ident :lcc-639-1/eu,
   :lcc-lr/denotes :lcc-639-1/Basque,
   :lcc-lr/hasTag "eu",
   :lcc-lr/identifies :lcc-639-1/Basque,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "eu",
   :skos/definition "language identifier for Basque"})

(def fa
  {:db/ident :lcc-639-1/fa,
   :lcc-lr/denotes :lcc-639-1/Persian,
   :lcc-lr/hasTag "fa",
   :lcc-lr/identifies :lcc-639-1/Persian,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "fa",
   :skos/definition "language identifier for Persian"})

(def ff
  {:db/ident :lcc-639-1/ff,
   :lcc-lr/denotes :lcc-639-1/Fulah,
   :lcc-lr/hasTag "ff",
   :lcc-lr/identifies :lcc-639-1/Fulah,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "ff",
   :skos/definition
   "language identifier for Fulah; Fula; Fulani; Fulfulde; Peul"})

(def fi
  {:db/ident :lcc-639-1/fi,
   :lcc-lr/denotes :lcc-639-1/Finnish,
   :lcc-lr/hasTag "fi",
   :lcc-lr/identifies :lcc-639-1/Finnish,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "fi",
   :skos/definition "language identifier for Finnish"})

(def fj
  {:db/ident :lcc-639-1/fj,
   :lcc-lr/denotes :lcc-639-1/Fijian,
   :lcc-lr/hasTag "fj",
   :lcc-lr/identifies :lcc-639-1/Fijian,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "fj",
   :skos/definition "language identifier for Fijian"})

(def fo
  {:db/ident :lcc-639-1/fo,
   :lcc-lr/denotes :lcc-639-1/Faroese,
   :lcc-lr/hasTag "fo",
   :lcc-lr/identifies :lcc-639-1/Faroese,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "fo",
   :skos/definition "language identifier for Faroese; Faeroese"})

(def fr
  {:db/ident :lcc-639-1/fr,
   :lcc-lr/denotes :lcc-639-1/French,
   :lcc-lr/hasTag "fr",
   :lcc-lr/identifies :lcc-639-1/French,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "fr",
   :skos/definition "language identifier for French"})

(def fy
  {:db/ident :lcc-639-1/fy,
   :lcc-lr/denotes :lcc-639-1/WesternFrisian,
   :lcc-lr/hasTag "fy",
   :lcc-lr/identifies :lcc-639-1/WesternFrisian,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "fy",
   :skos/definition "language identifier for Western Frisian"})

(def ga
  {:db/ident :lcc-639-1/ga,
   :lcc-lr/denotes :lcc-639-1/Irish,
   :lcc-lr/hasTag "ga",
   :lcc-lr/identifies :lcc-639-1/Irish,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "ga",
   :skos/definition "language identifier for Irish"})

(def gd
  {:db/ident :lcc-639-1/gd,
   :lcc-lr/denotes :lcc-639-1/Gaelic,
   :lcc-lr/hasTag "gd",
   :lcc-lr/identifies :lcc-639-1/Gaelic,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "gd",
   :skos/definition "language identifier for Gaelic; Scottish Gaelic"})

(def gl
  {:db/ident :lcc-639-1/gl,
   :lcc-lr/denotes :lcc-639-1/Galician,
   :lcc-lr/hasTag "gl",
   :lcc-lr/identifies :lcc-639-1/Galician,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "gl",
   :skos/definition "language identifier for Galician; Gallegan"})

(def gn
  {:db/ident :lcc-639-1/gn,
   :lcc-lr/denotes :lcc-639-1/Guarani,
   :lcc-lr/hasTag "gn",
   :lcc-lr/identifies :lcc-639-1/Guarani,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "gn",
   :skos/definition "language identifier for Guarani"})

(def gu
  {:db/ident :lcc-639-1/gu,
   :lcc-lr/denotes :lcc-639-1/Gujarati,
   :lcc-lr/hasTag "gu",
   :lcc-lr/identifies :lcc-639-1/Gujarati,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "gu",
   :skos/definition "language identifier for Gujarati"})

(def gv
  {:db/ident :lcc-639-1/gv,
   :lcc-lr/denotes :lcc-639-1/Manx,
   :lcc-lr/hasTag "gv",
   :lcc-lr/identifies :lcc-639-1/Manx,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "gv",
   :skos/definition "language identifier for Manx"})

(def ha
  {:db/ident :lcc-639-1/ha,
   :lcc-lr/denotes :lcc-639-1/Hausa,
   :lcc-lr/hasTag "ha",
   :lcc-lr/identifies :lcc-639-1/Hausa,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "ha",
   :skos/definition "language identifier for Hausa"})

(def he
  {:db/ident :lcc-639-1/he,
   :lcc-lr/denotes :lcc-639-1/Hebrew,
   :lcc-lr/hasTag "he",
   :lcc-lr/identifies :lcc-639-1/Hebrew,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "he",
   :skos/definition "language identifier for Hebrew"})

(def hi
  {:db/ident :lcc-639-1/hi,
   :lcc-lr/denotes :lcc-639-1/Hindi,
   :lcc-lr/hasTag "hi",
   :lcc-lr/identifies :lcc-639-1/Hindi,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "hi",
   :skos/definition "language identifier for Hindi"})

(def ho
  {:db/ident :lcc-639-1/ho,
   :lcc-lr/denotes :lcc-639-1/HiriMotu,
   :lcc-lr/hasTag "ho",
   :lcc-lr/identifies :lcc-639-1/HiriMotu,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "ho",
   :skos/definition "language identifier for Hiri Motu"})

(def hr
  {:db/ident :lcc-639-1/hr,
   :lcc-lr/denotes :lcc-639-1/Croatian,
   :lcc-lr/hasTag "hr",
   :lcc-lr/identifies :lcc-639-1/Croatian,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "hr",
   :skos/definition "language identifier for Croatian"})

(def ht
  {:db/ident :lcc-639-1/ht,
   :lcc-lr/denotes :lcc-639-1/Haitian,
   :lcc-lr/hasTag "ht",
   :lcc-lr/identifies :lcc-639-1/Haitian,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "ht",
   :skos/definition "language identifier for Haitian; Haitian Creole"})

(def hu
  {:db/ident :lcc-639-1/hu,
   :lcc-lr/denotes :lcc-639-1/Hungarian,
   :lcc-lr/hasTag "hu",
   :lcc-lr/identifies :lcc-639-1/Hungarian,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "hu",
   :skos/definition "language identifier for Hungarian"})

(def hy
  {:db/ident :lcc-639-1/hy,
   :lcc-lr/denotes :lcc-639-1/Armenian,
   :lcc-lr/hasTag "hy",
   :lcc-lr/identifies :lcc-639-1/Armenian,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "hy",
   :skos/definition "language identifier for Armenian"})

(def hz
  {:db/ident :lcc-639-1/hz,
   :lcc-lr/denotes :lcc-639-1/Herero,
   :lcc-lr/hasTag "hz",
   :lcc-lr/identifies :lcc-639-1/Herero,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "hz",
   :skos/definition "language identifier for Herero"})

(def ia
  {:db/ident :lcc-639-1/ia,
   :lcc-lr/denotes :lcc-639-1/Interlingua,
   :lcc-lr/hasTag "ia",
   :lcc-lr/identifies :lcc-639-1/Interlingua,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "ia",
   :skos/definition
   "language identifier for Interlingua (International Auxiliary Language Association)"})

(def id
  {:db/ident :lcc-639-1/id,
   :lcc-lr/denotes :lcc-639-1/Indonesian,
   :lcc-lr/hasTag "id",
   :lcc-lr/identifies :lcc-639-1/Indonesian,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "id",
   :skos/definition "language identifier for Indonesian"})

(def ie
  {:db/ident :lcc-639-1/ie,
   :lcc-lr/denotes :lcc-639-1/Interlingue,
   :lcc-lr/hasTag "ie",
   :lcc-lr/identifies :lcc-639-1/Interlingue,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "ie",
   :skos/definition "language identifier for Interlingue"})

(def ig
  {:db/ident :lcc-639-1/ig,
   :lcc-lr/denotes :lcc-639-1/Igbo,
   :lcc-lr/hasTag "ig",
   :lcc-lr/identifies :lcc-639-1/Igbo,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "ig",
   :skos/definition "language identifier for Igbo"})

(def ii
  {:db/ident :lcc-639-1/ii,
   :lcc-lr/denotes :lcc-639-1/SichuanYi,
   :lcc-lr/hasTag "ii",
   :lcc-lr/identifies :lcc-639-1/SichuanYi,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "ii",
   :skos/definition "language identifier for Sichuan Yi"})

(def ik
  {:db/ident :lcc-639-1/ik,
   :lcc-lr/denotes :lcc-639-1/Inupiaq,
   :lcc-lr/hasTag "ik",
   :lcc-lr/identifies :lcc-639-1/Inupiaq,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "ik",
   :skos/definition "language identifier for Inupiaq"})

(def io
  {:db/ident :lcc-639-1/io,
   :lcc-lr/denotes :lcc-639-1/Ido,
   :lcc-lr/hasTag "io",
   :lcc-lr/identifies :lcc-639-1/Ido,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "io",
   :skos/definition "language identifier for Ido"})

(def is
  {:db/ident :lcc-639-1/is,
   :lcc-lr/denotes :lcc-639-1/Icelandic,
   :lcc-lr/hasTag "is",
   :lcc-lr/identifies :lcc-639-1/Icelandic,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "is",
   :skos/definition "language identifier for Icelandic"})

(def it
  {:db/ident :lcc-639-1/it,
   :lcc-lr/denotes :lcc-639-1/Italian,
   :lcc-lr/hasTag "it",
   :lcc-lr/identifies :lcc-639-1/Italian,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "it",
   :skos/definition "language identifier for Italian"})

(def iu
  {:db/ident :lcc-639-1/iu,
   :lcc-lr/denotes :lcc-639-1/Inuktitut,
   :lcc-lr/hasTag "iu",
   :lcc-lr/identifies :lcc-639-1/Inuktitut,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "iu",
   :skos/definition "language identifier for Inuktitut"})

(def ja
  {:db/ident :lcc-639-1/ja,
   :lcc-lr/denotes :lcc-639-1/Japanese,
   :lcc-lr/hasTag "ja",
   :lcc-lr/identifies :lcc-639-1/Japanese,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "ja",
   :skos/definition "language identifier for Japanese"})

(def jv
  {:db/ident :lcc-639-1/jv,
   :lcc-lr/denotes :lcc-639-1/Javanese,
   :lcc-lr/hasTag "jv",
   :lcc-lr/identifies :lcc-639-1/Javanese,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "jv",
   :skos/definition "language identifier for Javanese"})

(def ka
  {:db/ident :lcc-639-1/ka,
   :lcc-lr/denotes :lcc-639-1/Georgian,
   :lcc-lr/hasTag "ka",
   :lcc-lr/identifies :lcc-639-1/Georgian,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "ka",
   :skos/definition "language identifier for Georgian"})

(def kg
  {:db/ident :lcc-639-1/kg,
   :lcc-lr/denotes :lcc-639-1/Kongo,
   :lcc-lr/hasTag "kg",
   :lcc-lr/identifies :lcc-639-1/Kongo,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "kg",
   :skos/definition "language identifier for Kongo"})

(def ki
  {:db/ident :lcc-639-1/ki,
   :lcc-lr/denotes :lcc-639-1/Kikuyu,
   :lcc-lr/hasTag "ki",
   :lcc-lr/identifies :lcc-639-1/Kikuyu,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "ki",
   :skos/definition "language identifier for Kikuyu; Gikuyu"})

(def kj
  {:db/ident :lcc-639-1/kj,
   :lcc-lr/denotes :lcc-639-1/Kuanyama,
   :lcc-lr/hasTag "kj",
   :lcc-lr/identifies :lcc-639-1/Kuanyama,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "kj",
   :skos/definition "language identifier for Kwanyama; Kuanyama"})

(def kk
  {:db/ident :lcc-639-1/kk,
   :lcc-lr/denotes :lcc-639-1/Kazakh,
   :lcc-lr/hasTag "kk",
   :lcc-lr/identifies :lcc-639-1/Kazakh,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "kk",
   :skos/definition "language identifier for Kazakh"})

(def kl
  {:db/ident :lcc-639-1/kl,
   :lcc-lr/denotes :lcc-639-1/Kalaallisut,
   :lcc-lr/hasTag "kl",
   :lcc-lr/identifies :lcc-639-1/Kalaallisut,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "kl",
   :skos/definition "language identifier for Greenlandic; Kalaallisut"})

(def km
  {:db/ident :lcc-639-1/km,
   :lcc-lr/denotes :lcc-639-1/CentralKhmer,
   :lcc-lr/hasTag "km",
   :lcc-lr/identifies :lcc-639-1/CentralKhmer,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "km",
   :skos/definition "language identifier for Central Khmer"})

(def kn
  {:db/ident :lcc-639-1/kn,
   :lcc-lr/denotes :lcc-639-1/Kannada,
   :lcc-lr/hasTag "kn",
   :lcc-lr/identifies :lcc-639-1/Kannada,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "kn",
   :skos/definition "language identifier for Kannada"})

(def ko
  {:db/ident :lcc-639-1/ko,
   :lcc-lr/denotes :lcc-639-1/Korean,
   :lcc-lr/hasTag "ko",
   :lcc-lr/identifies :lcc-639-1/Korean,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "ko",
   :skos/definition "language identifier for Korean"})

(def kr
  {:db/ident :lcc-639-1/kr,
   :lcc-lr/denotes :lcc-639-1/Kanuri,
   :lcc-lr/hasTag "kr",
   :lcc-lr/identifies :lcc-639-1/Kanuri,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "kr",
   :skos/definition "language identifier for Kanuri"})

(def ks
  {:db/ident :lcc-639-1/ks,
   :lcc-lr/denotes :lcc-639-1/Kashmiri,
   :lcc-lr/hasTag "ks",
   :lcc-lr/identifies :lcc-639-1/Kashmiri,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "ks",
   :skos/definition "language identifier for Kashmiri"})

(def ku
  {:db/ident :lcc-639-1/ku,
   :lcc-lr/denotes :lcc-639-1/Kurdish,
   :lcc-lr/hasTag "ku",
   :lcc-lr/identifies :lcc-639-1/Kurdish,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "ku",
   :skos/definition "language identifier for Kurdish"})

(def kv
  {:db/ident :lcc-639-1/kv,
   :lcc-lr/denotes :lcc-639-1/Komi,
   :lcc-lr/hasTag "kv",
   :lcc-lr/identifies :lcc-639-1/Komi,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "kv",
   :skos/definition "language identifier for Komi"})

(def kw
  {:db/ident :lcc-639-1/kw,
   :lcc-lr/denotes :lcc-639-1/Cornish,
   :lcc-lr/hasTag "kw",
   :lcc-lr/identifies :lcc-639-1/Cornish,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "kw",
   :skos/definition "language identifier for Cornish"})

(def ky
  {:db/ident :lcc-639-1/ky,
   :lcc-lr/denotes :lcc-639-1/Kirghiz,
   :lcc-lr/hasTag "ky",
   :lcc-lr/identifies :lcc-639-1/Kirghiz,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "ky",
   :skos/definition "language identifier for Kirghiz; Kyrgyz"})

(def la
  {:db/ident :lcc-639-1/la,
   :lcc-lr/denotes :lcc-639-1/Latin,
   :lcc-lr/hasTag "la",
   :lcc-lr/identifies :lcc-639-1/Latin,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "la",
   :skos/definition "language identifier for Latin"})

(def lb
  {:db/ident :lcc-639-1/lb,
   :lcc-lr/denotes :lcc-639-1/Luxembourgish,
   :lcc-lr/hasTag "lb",
   :lcc-lr/identifies :lcc-639-1/Luxembourgish,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "lb",
   :skos/definition "language identifier for Luxembourgish"})

(def lg
  {:db/ident :lcc-639-1/lg,
   :lcc-lr/denotes :lcc-639-1/Ganda,
   :lcc-lr/hasTag "lg",
   :lcc-lr/identifies :lcc-639-1/Ganda,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "lg",
   :skos/definition "language identifier for Ganda"})

(def li
  {:db/ident :lcc-639-1/li,
   :lcc-lr/denotes :lcc-639-1/Limburgan,
   :lcc-lr/hasTag "li",
   :lcc-lr/identifies :lcc-639-1/Limburgan,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "li",
   :skos/definition "language identifier for Limburgan; Limburger; Limburgish"})

(def ln
  {:db/ident :lcc-639-1/ln,
   :lcc-lr/denotes :lcc-639-1/Lingala,
   :lcc-lr/hasTag "ln",
   :lcc-lr/identifies :lcc-639-1/Lingala,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "ln",
   :skos/definition "language identifier for Lingala"})

(def lo
  {:db/ident :lcc-639-1/lo,
   :lcc-lr/denotes :lcc-639-1/Lao,
   :lcc-lr/hasTag "lo",
   :lcc-lr/identifies :lcc-639-1/Lao,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "lo",
   :skos/definition "language identifier for Lao"})

(def lt
  {:db/ident :lcc-639-1/lt,
   :lcc-lr/denotes :lcc-639-1/Lithuanian,
   :lcc-lr/hasTag "lt",
   :lcc-lr/identifies :lcc-639-1/Lithuanian,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "lt",
   :skos/definition "language identifier for Lithuanian"})

(def lu
  {:db/ident :lcc-639-1/lu,
   :lcc-lr/denotes :lcc-639-1/LubaKatanga,
   :lcc-lr/hasTag "lu",
   :lcc-lr/identifies :lcc-639-1/LubaKatanga,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "lu",
   :skos/definition "language identifier for Luba-Katanga"})

(def lv
  {:db/ident :lcc-639-1/lv,
   :lcc-lr/denotes :lcc-639-1/Latvian,
   :lcc-lr/hasTag "lv",
   :lcc-lr/identifies :lcc-639-1/Latvian,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "lv",
   :skos/definition "language identifier for Latvian"})

(def mg
  {:db/ident :lcc-639-1/mg,
   :lcc-lr/denotes :lcc-639-1/Malagasy,
   :lcc-lr/hasTag "mg",
   :lcc-lr/identifies :lcc-639-1/Malagasy,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "mg",
   :skos/definition "language identifier for Malagasy"})

(def mh
  {:db/ident :lcc-639-1/mh,
   :lcc-lr/denotes :lcc-639-1/Marshallese,
   :lcc-lr/hasTag "mh",
   :lcc-lr/identifies :lcc-639-1/Marshallese,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "mh",
   :skos/definition "language identifier for Marshallese"})

(def mi
  {:db/ident :lcc-639-1/mi,
   :lcc-lr/denotes :lcc-639-1/Maori,
   :lcc-lr/hasTag "mi",
   :lcc-lr/identifies :lcc-639-1/Maori,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "mi",
   :skos/definition "language identifier for Maori"})

(def mk
  {:db/ident :lcc-639-1/mk,
   :lcc-lr/denotes :lcc-639-1/Macedonian,
   :lcc-lr/hasTag "mk",
   :lcc-lr/identifies :lcc-639-1/Macedonian,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "mk",
   :skos/definition "language identifier for Macedonian"})

(def ml
  {:db/ident :lcc-639-1/ml,
   :lcc-lr/denotes :lcc-639-1/Malayalam,
   :lcc-lr/hasTag "ml",
   :lcc-lr/identifies :lcc-639-1/Malayalam,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "ml",
   :skos/definition "language identifier for Malayalam"})

(def mn
  {:db/ident :lcc-639-1/mn,
   :lcc-lr/denotes :lcc-639-1/Mongolian,
   :lcc-lr/hasTag "mn",
   :lcc-lr/identifies :lcc-639-1/Mongolian,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "mn",
   :skos/definition "language identifier for Mongolian"})

(def mr
  {:db/ident :lcc-639-1/mr,
   :lcc-lr/denotes :lcc-639-1/Marathi,
   :lcc-lr/hasTag "mr",
   :lcc-lr/identifies :lcc-639-1/Marathi,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "mr",
   :skos/definition "language identifier for Marathi"})

(def ms
  {:db/ident :lcc-639-1/ms,
   :lcc-lr/denotes :lcc-639-1/Malay,
   :lcc-lr/hasTag "ms",
   :lcc-lr/identifies :lcc-639-1/Malay,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "ms",
   :skos/definition "language identifier for Malay"})

(def mt
  {:db/ident :lcc-639-1/mt,
   :lcc-lr/denotes :lcc-639-1/Maltese,
   :lcc-lr/hasTag "mt",
   :lcc-lr/identifies :lcc-639-1/Maltese,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "mt",
   :skos/definition "language identifier for Maltese"})

(def my
  {:db/ident :lcc-639-1/my,
   :lcc-lr/denotes :lcc-639-1/Burmese,
   :lcc-lr/hasTag "my",
   :lcc-lr/identifies :lcc-639-1/Burmese,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "my",
   :skos/definition "language identifier for Burmese"})

(def na
  {:db/ident :lcc-639-1/na,
   :lcc-lr/denotes :lcc-639-1/Nauru,
   :lcc-lr/hasTag "na",
   :lcc-lr/identifies :lcc-639-1/Nauru,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "na",
   :skos/definition "language identifier for Nauruan"})

(def nb
  {:db/ident :lcc-639-1/nb,
   :lcc-lr/denotes :lcc-639-1/NorwegianBokmal,
   :lcc-lr/hasTag "nb",
   :lcc-lr/identifies :lcc-639-1/NorwegianBokmal,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "nb",
   :skos/definition "language identifier for Norwegian Bokmal"})

(def nd
  {:db/ident :lcc-639-1/nd,
   :lcc-lr/denotes :lcc-639-1/NorthNdebele,
   :lcc-lr/hasTag "nd",
   :lcc-lr/identifies :lcc-639-1/NorthNdebele,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "nd",
   :skos/definition "language identifier for North Ndebele"})

(def ne
  {:db/ident :lcc-639-1/ne,
   :lcc-lr/denotes :lcc-639-1/Nepali,
   :lcc-lr/hasTag "ne",
   :lcc-lr/identifies :lcc-639-1/Nepali,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "ne",
   :skos/definition "language identifier for Nepali"})

(def ng
  {:db/ident :lcc-639-1/ng,
   :lcc-lr/denotes :lcc-639-1/Ndonga,
   :lcc-lr/hasTag "ng",
   :lcc-lr/identifies :lcc-639-1/Ndonga,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "ng",
   :skos/definition "language identifier for Ndonga"})

(def nl
  {:db/ident :lcc-639-1/nl,
   :lcc-lr/denotes :lcc-639-1/Dutch,
   :lcc-lr/hasTag "nl",
   :lcc-lr/identifies :lcc-639-1/Dutch,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "nl",
   :skos/definition "language identifier for Dutch"})

(def nn
  {:db/ident :lcc-639-1/nn,
   :lcc-lr/denotes :lcc-639-1/NorwegianNynorsk,
   :lcc-lr/hasTag "nn",
   :lcc-lr/identifies :lcc-639-1/NorwegianNynorsk,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "nn",
   :skos/definition "language identifier for Norwegian Nynorsk"})

(def no
  {:db/ident :lcc-639-1/no,
   :lcc-lr/denotes :lcc-639-1/Norwegian,
   :lcc-lr/hasTag "no",
   :lcc-lr/identifies :lcc-639-1/Norwegian,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "no",
   :skos/definition "language identifier for Norwegian"})

(def nr
  {:db/ident :lcc-639-1/nr,
   :lcc-lr/denotes :lcc-639-1/SouthNdebele,
   :lcc-lr/hasTag "nr",
   :lcc-lr/identifies :lcc-639-1/SouthNdebele,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "nr",
   :skos/definition "language identifier for South Ndebele"})

(def nv
  {:db/ident :lcc-639-1/nv,
   :lcc-lr/denotes :lcc-639-1/Navajo,
   :lcc-lr/hasTag "nv",
   :lcc-lr/identifies :lcc-639-1/Navajo,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "nv",
   :skos/definition "language identifier for Navajo; Navaho"})

(def ny
  {:db/ident :lcc-639-1/ny,
   :lcc-lr/denotes :lcc-639-1/Chichewa,
   :lcc-lr/hasTag "ny",
   :lcc-lr/identifies :lcc-639-1/Chichewa,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "ny",
   :skos/definition "language identifier for Chichewa; Chewa; Nyanja"})

(def oc
  {:db/ident :lcc-639-1/oc,
   :lcc-lr/denotes :lcc-639-1/Occitan,
   :lcc-lr/hasTag "oc",
   :lcc-lr/identifies :lcc-639-1/Occitan,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "oc",
   :skos/definition "language identifier for Occitan; Provencal (post 1500)"})

(def oj
  {:db/ident :lcc-639-1/oj,
   :lcc-lr/denotes :lcc-639-1/Ojibwa,
   :lcc-lr/hasTag "oj",
   :lcc-lr/identifies :lcc-639-1/Ojibwa,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "oj",
   :skos/definition "language identifier for Ojibwa"})

(def om
  {:db/ident :lcc-639-1/om,
   :lcc-lr/denotes :lcc-639-1/Oromo,
   :lcc-lr/hasTag "om",
   :lcc-lr/identifies :lcc-639-1/Oromo,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "om",
   :skos/definition "language identifier for Oromo"})

(def or
  {:db/ident :lcc-639-1/or,
   :lcc-lr/denotes :lcc-639-1/Oriya,
   :lcc-lr/hasTag "or",
   :lcc-lr/identifies :lcc-639-1/Oriya,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "or",
   :skos/definition "language identifier for Oriya"})

(def os
  {:db/ident :lcc-639-1/os,
   :lcc-lr/denotes :lcc-639-1/Ossetian,
   :lcc-lr/hasTag "os",
   :lcc-lr/identifies :lcc-639-1/Ossetian,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "os",
   :skos/definition "language identifier for Ossetian; Ossetic"})

(def pa
  {:db/ident :lcc-639-1/pa,
   :lcc-lr/denotes :lcc-639-1/Panjabi,
   :lcc-lr/hasTag "pa",
   :lcc-lr/identifies :lcc-639-1/Panjabi,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "pa",
   :skos/definition "language identifier for Panjabi; Punjabi"})

(def pi
  {:db/ident :lcc-639-1/pi,
   :lcc-lr/denotes :lcc-639-1/Pali,
   :lcc-lr/hasTag "pi",
   :lcc-lr/identifies :lcc-639-1/Pali,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "pi",
   :skos/definition "language identifier for Pali"})

(def pl
  {:db/ident :lcc-639-1/pl,
   :lcc-lr/denotes :lcc-639-1/Polish,
   :lcc-lr/hasTag "pl",
   :lcc-lr/identifies :lcc-639-1/Polish,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "pl",
   :skos/definition "language identifier for Polish"})

(def ps
  {:db/ident :lcc-639-1/ps,
   :lcc-lr/denotes :lcc-639-1/Pushto,
   :lcc-lr/hasTag "ps",
   :lcc-lr/identifies :lcc-639-1/Pushto,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "ps",
   :skos/definition "language identifier for Pashto; Pushto"})

(def pt
  {:db/ident :lcc-639-1/pt,
   :lcc-lr/denotes :lcc-639-1/Portuguese,
   :lcc-lr/hasTag "pt",
   :lcc-lr/identifies :lcc-639-1/Portuguese,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "pt",
   :skos/definition "language identifier for Portuguese"})

(def qu
  {:db/ident :lcc-639-1/qu,
   :lcc-lr/denotes :lcc-639-1/Quechua,
   :lcc-lr/hasTag "qu",
   :lcc-lr/identifies :lcc-639-1/Quechua,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "qu",
   :skos/definition "language identifier for Quechua"})

(def rm
  {:db/ident :lcc-639-1/rm,
   :lcc-lr/denotes :lcc-639-1/Romansh,
   :lcc-lr/hasTag "rm",
   :lcc-lr/identifies :lcc-639-1/Romansh,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "rm",
   :skos/definition "language identifier for Romansh"})

(def rn
  {:db/ident :lcc-639-1/rn,
   :lcc-lr/denotes :lcc-639-1/Rundi,
   :lcc-lr/hasTag "rn",
   :lcc-lr/identifies :lcc-639-1/Rundi,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "rn",
   :skos/definition "language identifier for Rundi"})

(def ro
  {:db/ident :lcc-639-1/ro,
   :lcc-lr/denotes :lcc-639-1/Romanian,
   :lcc-lr/hasTag "ro",
   :lcc-lr/identifies :lcc-639-1/Romanian,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "ro",
   :skos/definition "language identifier for Romanian"})

(def ru
  {:db/ident :lcc-639-1/ru,
   :lcc-lr/denotes :lcc-639-1/Russian,
   :lcc-lr/hasTag "ru",
   :lcc-lr/identifies :lcc-639-1/Russian,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "ru",
   :skos/definition "language identifier for Russian"})

(def rw
  {:db/ident :lcc-639-1/rw,
   :lcc-lr/denotes :lcc-639-1/Kinyarwanda,
   :lcc-lr/hasTag "rw",
   :lcc-lr/identifies :lcc-639-1/Kinyarwanda,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "rw",
   :skos/definition "language identifier for Kinyarwanda; Rwanda"})

(def sa
  {:db/ident :lcc-639-1/sa,
   :lcc-lr/denotes :lcc-639-1/Sanskrit,
   :lcc-lr/hasTag "sa",
   :lcc-lr/identifies :lcc-639-1/Sanskrit,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "sa",
   :skos/definition "language identifier for Sanskrit"})

(def sc
  {:db/ident :lcc-639-1/sc,
   :lcc-lr/denotes :lcc-639-1/Sardinian,
   :lcc-lr/hasTag "sc",
   :lcc-lr/identifies :lcc-639-1/Sardinian,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "sc",
   :skos/definition "language identifier for Sardinian"})

(def sd
  {:db/ident :lcc-639-1/sd,
   :lcc-lr/denotes :lcc-639-1/Sindhi,
   :lcc-lr/hasTag "sd",
   :lcc-lr/identifies :lcc-639-1/Sindhi,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "sd",
   :skos/definition "language identifier for Sindhi"})

(def se
  {:db/ident :lcc-639-1/se,
   :lcc-lr/denotes :lcc-639-1/NorthernSami,
   :lcc-lr/hasTag "se",
   :lcc-lr/identifies :lcc-639-1/NorthernSami,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "se",
   :skos/definition "language identifier for Northern Sami"})

(def sg
  {:db/ident :lcc-639-1/sg,
   :lcc-lr/denotes :lcc-639-1/Sango,
   :lcc-lr/hasTag "sg",
   :lcc-lr/identifies :lcc-639-1/Sango,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "sg",
   :skos/definition "language identifier for Sango"})

(def si
  {:db/ident :lcc-639-1/si,
   :lcc-lr/denotes :lcc-639-1/Sinhala,
   :lcc-lr/hasTag "si",
   :lcc-lr/identifies :lcc-639-1/Sinhala,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "si",
   :skos/definition "language identifier for Sinhala; Sinhalese"})

(def sk
  {:db/ident :lcc-639-1/sk,
   :lcc-lr/denotes :lcc-639-1/Slovak,
   :lcc-lr/hasTag "sk",
   :lcc-lr/identifies :lcc-639-1/Slovak,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "sk",
   :skos/definition "language identifier for Slovak"})

(def sl
  {:db/ident :lcc-639-1/sl,
   :lcc-lr/denotes :lcc-639-1/Slovenian,
   :lcc-lr/hasTag "sl",
   :lcc-lr/identifies :lcc-639-1/Slovenian,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "sl",
   :skos/definition "language identifier for Slovenian"})

(def sm
  {:db/ident :lcc-639-1/sm,
   :lcc-lr/denotes :lcc-639-1/Samoan,
   :lcc-lr/hasTag "sm",
   :lcc-lr/identifies :lcc-639-1/Samoan,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "sm",
   :skos/definition "language identifier for Samoan"})

(def sn
  {:db/ident :lcc-639-1/sn,
   :lcc-lr/denotes :lcc-639-1/Shona,
   :lcc-lr/hasTag "sn",
   :lcc-lr/identifies :lcc-639-1/Shona,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "sn",
   :skos/definition "language identifier for Shona"})

(def so
  {:db/ident :lcc-639-1/so,
   :lcc-lr/denotes :lcc-639-1/Somali,
   :lcc-lr/hasTag "so",
   :lcc-lr/identifies :lcc-639-1/Somali,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "so",
   :skos/definition "language identifier for Somali"})

(def sq
  {:db/ident :lcc-639-1/sq,
   :lcc-lr/denotes :lcc-639-1/Albanian,
   :lcc-lr/hasTag "sq",
   :lcc-lr/identifies :lcc-639-1/Albanian,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "sq",
   :skos/definition "language identifier for Albanian"})

(def sr
  {:db/ident :lcc-639-1/sr,
   :lcc-lr/denotes :lcc-639-1/Serbian,
   :lcc-lr/hasTag "sr",
   :lcc-lr/identifies :lcc-639-1/Serbian,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "sr",
   :skos/definition "language identifier for Serbian"})

(def ss
  {:db/ident :lcc-639-1/ss,
   :lcc-lr/denotes :lcc-639-1/Swati,
   :lcc-lr/hasTag "ss",
   :lcc-lr/identifies :lcc-639-1/Swati,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "ss",
   :skos/definition "language identifier for Swati"})

(def st
  {:db/ident :lcc-639-1/st,
   :lcc-lr/denotes :lcc-639-1/SouthernSotho,
   :lcc-lr/hasTag "st",
   :lcc-lr/identifies :lcc-639-1/SouthernSotho,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "st",
   :skos/definition "language identifier for Sesotho; Southern Sotho"})

(def su
  {:db/ident :lcc-639-1/su,
   :lcc-lr/denotes :lcc-639-1/Sundanese,
   :lcc-lr/hasTag "su",
   :lcc-lr/identifies :lcc-639-1/Sundanese,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "su",
   :skos/definition "language identifier for Sundanese"})

(def sv
  {:db/ident :lcc-639-1/sv,
   :lcc-lr/denotes :lcc-639-1/Swedish,
   :lcc-lr/hasTag "sv",
   :lcc-lr/identifies :lcc-639-1/Swedish,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "sv",
   :skos/definition "language identifier for Swedish"})

(def sw
  {:db/ident :lcc-639-1/sw,
   :lcc-lr/denotes :lcc-639-1/Swahili,
   :lcc-lr/hasTag "sw",
   :lcc-lr/identifies :lcc-639-1/Swahili,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "sw",
   :skos/definition "language identifier for Swahili"})

(def ta
  {:db/ident :lcc-639-1/ta,
   :lcc-lr/denotes :lcc-639-1/Tamil,
   :lcc-lr/hasTag "ta",
   :lcc-lr/identifies :lcc-639-1/Tamil,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "ta",
   :skos/definition "language identifier for Tamil"})

(def te
  {:db/ident :lcc-639-1/te,
   :lcc-lr/denotes :lcc-639-1/Telugu,
   :lcc-lr/hasTag "te",
   :lcc-lr/identifies :lcc-639-1/Telugu,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "te",
   :skos/definition "language identifier for Telugu"})

(def tg
  {:db/ident :lcc-639-1/tg,
   :lcc-lr/denotes :lcc-639-1/Tajik,
   :lcc-lr/hasTag "tg",
   :lcc-lr/identifies :lcc-639-1/Tajik,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "tg",
   :skos/definition "language identifier for Tajik"})

(def th
  {:db/ident :lcc-639-1/th,
   :lcc-lr/denotes :lcc-639-1/Thai,
   :lcc-lr/hasTag "th",
   :lcc-lr/identifies :lcc-639-1/Thai,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "th",
   :skos/definition "language identifier for Thai"})

(def ti
  {:db/ident :lcc-639-1/ti,
   :lcc-lr/denotes :lcc-639-1/Tigrinya,
   :lcc-lr/hasTag "ti",
   :lcc-lr/identifies :lcc-639-1/Tigrinya,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "ti",
   :skos/definition "language identifier for Tigrinya"})

(def tk
  {:db/ident :lcc-639-1/tk,
   :lcc-lr/denotes :lcc-639-1/Turkmen,
   :lcc-lr/hasTag "tk",
   :lcc-lr/identifies :lcc-639-1/Turkmen,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "tk",
   :skos/definition "language identifier for Turkmen"})

(def tl
  {:db/ident :lcc-639-1/tl,
   :lcc-lr/denotes :lcc-639-1/Tagalog,
   :lcc-lr/hasTag "tl",
   :lcc-lr/identifies :lcc-639-1/Tagalog,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "tl",
   :skos/definition "language identifier for Tagalog"})

(def tn
  {:db/ident :lcc-639-1/tn,
   :lcc-lr/denotes :lcc-639-1/Tswana,
   :lcc-lr/hasTag "tn",
   :lcc-lr/identifies :lcc-639-1/Tswana,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "tn",
   :skos/definition "language identifier for Tswana"})

(def to
  {:db/ident :lcc-639-1/to,
   :lcc-lr/denotes :lcc-639-1/Tonga-TongaIslands,
   :lcc-lr/hasTag "to",
   :lcc-lr/identifies :lcc-639-1/Tonga-TongaIslands,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "to",
   :skos/definition "language identifier for Tonga (Tonga Islands)"})

(def tr
  {:db/ident :lcc-639-1/tr,
   :lcc-lr/denotes :lcc-639-1/Turkish,
   :lcc-lr/hasTag "tr",
   :lcc-lr/identifies :lcc-639-1/Turkish,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "tr",
   :skos/definition "language identifier for Turkish"})

(def ts
  {:db/ident :lcc-639-1/ts,
   :lcc-lr/denotes :lcc-639-1/Tsonga,
   :lcc-lr/hasTag "ts",
   :lcc-lr/identifies :lcc-639-1/Tsonga,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "ts",
   :skos/definition "language identifier for Tsonga"})

(def tt
  {:db/ident :lcc-639-1/tt,
   :lcc-lr/denotes :lcc-639-1/Tatar,
   :lcc-lr/hasTag "tt",
   :lcc-lr/identifies :lcc-639-1/Tatar,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "tt",
   :skos/definition "language identifier for Tatar"})

(def tw
  {:db/ident :lcc-639-1/tw,
   :lcc-lr/denotes :lcc-639-1/Twi,
   :lcc-lr/hasTag "tw",
   :lcc-lr/identifies :lcc-639-1/Twi,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "tw",
   :skos/definition "language identifier for Twi"})

(def ty
  {:db/ident :lcc-639-1/ty,
   :lcc-lr/denotes :lcc-639-1/Tahitian,
   :lcc-lr/hasTag "ty",
   :lcc-lr/identifies :lcc-639-1/Tahitian,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "ty",
   :skos/definition "language identifier for Tahitian"})

(def ug
  {:db/ident :lcc-639-1/ug,
   :lcc-lr/denotes :lcc-639-1/Uighur,
   :lcc-lr/hasTag "ug",
   :lcc-lr/identifies :lcc-639-1/Uighur,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "ug",
   :skos/definition "language identifier for Uighur; Uyghur"})

(def uk
  {:db/ident :lcc-639-1/uk,
   :lcc-lr/denotes :lcc-639-1/Ukrainian,
   :lcc-lr/hasTag "uk",
   :lcc-lr/identifies :lcc-639-1/Ukrainian,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "uk",
   :skos/definition "language identifier for Ukrainian"})

(def ur
  {:db/ident :lcc-639-1/ur,
   :lcc-lr/denotes :lcc-639-1/Urdu,
   :lcc-lr/hasTag "ur",
   :lcc-lr/identifies :lcc-639-1/Urdu,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "ur",
   :skos/definition "language identifier for Urdu"})

(def uz
  {:db/ident :lcc-639-1/uz,
   :lcc-lr/denotes :lcc-639-1/Uzbek,
   :lcc-lr/hasTag "uz",
   :lcc-lr/identifies :lcc-639-1/Uzbek,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "uz",
   :skos/definition "language identifier for Uzbek"})

(def ve
  {:db/ident :lcc-639-1/ve,
   :lcc-lr/denotes :lcc-639-1/Venda,
   :lcc-lr/hasTag "ve",
   :lcc-lr/identifies :lcc-639-1/Venda,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "ve",
   :skos/definition "language identifier for Venda"})

(def vi
  {:db/ident :lcc-639-1/vi,
   :lcc-lr/denotes :lcc-639-1/Vietnamese,
   :lcc-lr/hasTag "vi",
   :lcc-lr/identifies :lcc-639-1/Vietnamese,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "vi",
   :skos/definition "language identifier for Vietnamese"})

(def vo
  {:db/ident :lcc-639-1/vo,
   :lcc-lr/denotes :lcc-639-1/Volapuk,
   :lcc-lr/hasTag "vo",
   :lcc-lr/identifies :lcc-639-1/Volapuk,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "vo",
   :skos/definition "language identifier for Volapuk"})

(def wa
  {:db/ident :lcc-639-1/wa,
   :lcc-lr/denotes :lcc-639-1/Walloon,
   :lcc-lr/hasTag "wa",
   :lcc-lr/identifies :lcc-639-1/Walloon,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "wa",
   :skos/definition "language identifier for Walloon"})

(def wo
  {:db/ident :lcc-639-1/wo,
   :lcc-lr/denotes :lcc-639-1/Wolof,
   :lcc-lr/hasTag "wo",
   :lcc-lr/identifies :lcc-639-1/Wolof,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "wo",
   :skos/definition "language identifier for Wolof"})

(def xh
  {:db/ident :lcc-639-1/xh,
   :lcc-lr/denotes :lcc-639-1/Xhosa,
   :lcc-lr/hasTag "xh",
   :lcc-lr/identifies :lcc-639-1/Xhosa,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "xh",
   :skos/definition "language identifier for Xhosa"})

(def yi
  {:db/ident :lcc-639-1/yi,
   :lcc-lr/denotes :lcc-639-1/Yiddish,
   :lcc-lr/hasTag "yi",
   :lcc-lr/identifies :lcc-639-1/Yiddish,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "yi",
   :skos/definition "language identifier for Yiddish"})

(def yo
  {:db/ident :lcc-639-1/yo,
   :lcc-lr/denotes :lcc-639-1/Yoruba,
   :lcc-lr/hasTag "yo",
   :lcc-lr/identifies :lcc-639-1/Yoruba,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "yo",
   :skos/definition "language identifier for Yoruba"})

(def za
  {:db/ident :lcc-639-1/za,
   :lcc-lr/denotes :lcc-639-1/Zhuang,
   :lcc-lr/hasTag "za",
   :lcc-lr/identifies :lcc-639-1/Zhuang,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "za",
   :skos/definition "language identifier for Zhuang; Chuang"})

(def zh
  {:db/ident :lcc-639-1/zh,
   :lcc-lr/denotes :lcc-639-1/Chinese,
   :lcc-lr/hasTag "zh",
   :lcc-lr/identifies :lcc-639-1/Chinese,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "zh",
   :skos/definition "language identifier for Chinese"})

(def zu
  {:db/ident :lcc-639-1/zu,
   :lcc-lr/denotes :lcc-639-1/Zulu,
   :lcc-lr/hasTag "zu",
   :lcc-lr/identifies :lcc-639-1/Zulu,
   :lcc-lr/isMemberOf :lcc-639-1/ISO639-1-CodeSet,
   :rdf/type #{:owl/NamedIndividual :lcc-lr/Alpha2Code},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"},
   :rdfs/label "zu",
   :skos/definition "language identifier for Zulu"})

(def urn:uuid:488967ef-b3c4-525a-9306-139035ca3ec1
  {:dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :owl/imports
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"},
   :owl/versionIRI
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/20211101/Languages/ISO639-1-LanguageCodes/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "ISO 639-1 Language Codes Ontology",
   :rdfs/seeAlso
   #{{:xsd/anyURI "http://www.loc.gov/standards/iso639-2/php/code_list.php/"}
     {:xsd/anyURI "https://www.omg.org/spec/LCC/AboutLCC/"}
     {:xsd/anyURI "https://id.loc.gov/vocabulary/iso639-1.html"}
     {:xsd/anyURI "https://www.omg.org/spec/LCC/Languages/AboutLanguages/"}},
   :skos/changeNote
   #{"The https://www.omg.org/spec/LCC/20211101/Languages/ISO639-2-LanguageCodes.rdf version of this ontology has been revised to incorporate recently published Library of Congress links to their URIs for the language codes, minor revisions to metadata about the languages to be in sync with the LoC site, and is current as of 29 October 2021."
     "The https://www.omg.org/spec/LCC/20190201/Languages/ISO639-2-LanguageCodes.rdf version of this ontology is current as of 14 February 2019, based on the US Library of Congress site."
     "The http://www.omg.org/spec/LCC/20151101/Languages/ISO639-1-LanguageCodes.rdf version of this ontology has been revised to reflect the issues addressed by the LCC 1.0 FTF report.  The codes themselves are current as of 31 July 2017, based on the US Library of Congress site."},
   :sm/contentLanguage {:xsd/anyURI
                        "https://www.w3.org/TR/owl2-quick-reference/"},
   :sm/copyright #{"Copyright (c) 2019-2021 agnos.ai"
                   "Copyright (c) 2015-2021 Object Management Group, Inc."
                   "Copyright (c) 2015-2017 Unisys"
                   "Copyright (c) 2015-2019 Adaptive Inc."
                   "Copyright (c) 2015-2021 Thematix Partners LLC"},
   :sm/dependsOn
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"},
   :sm/fileAbbreviation "lcc-639-1",
   :sm/fileAbstract
   "This ontology represents the subset of the ISO 639 standard that provides the language names and actual codes for ISO 639-1.",
   :sm/filename "ISO639-1-LanguageCodes.rdf",
   :xsd/anyURI
   "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"})