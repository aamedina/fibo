(ns net.wikipunk.rdf.lcc-639-2
  {:dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :namespaces
   {"dcterms" "http://purl.org/dc/terms/",
    "lcc-639-1"
    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/",
    "lcc-639-2"
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
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
      "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/20211101/Languages/ISO639-2-LanguageCodes/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "lcc-639-2",
   :rdfa/uri "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/",
   :rdfs/label "ISO 639-2 Language Codes Ontology",
   :rdfs/seeAlso
   #{{:xsd/anyURI "http://www.loc.gov/standards/iso639-2/php/code_list.php/"}
     {:xsd/anyURI "https://www.omg.org/spec/LCC/AboutLCC/"}
     {:xsd/anyURI "https://www.omg.org/spec/LCC/Languages/AboutLanguages/"}},
   :skos/changeNote
   #{"The http://www.omg.org/spec/LCC/20151101/Languages/ISO639-2-LanguageCodes.rdf version of this ontology has been revised to reflect the issues addressed by the LCC 1.0 FTF report. The codes themselves are current as of 31 July 2017, based on the US Library of Congress site."
     "The https://www.omg.org/spec/LCC/20190201/Languages/ISO639-2-LanguageCodes.rdf version of this ontology has been revised to reflect addition of the languages Standard Moroccan Tamazight (code zgh) and Montenegrin (code cnr). The codes themselves are current as of 14 February 2019, based on the US Library of Congress site."
     "The https://www.omg.org/spec/LCC/20211101/Languages/ISO639-2-LanguageCodes.rdf version of this ontology has been revised to add a missing axiom for 'identifies' to the alpha-3 language code for the Chinese language, namely 'chi'. The codes themselves are current as of 29 October 2021, based on the US Library of Congress site."},
   :sm/contentLanguage {:xsd/anyURI
                        "https://www.w3.org/TR/owl2-quick-reference/"},
   :sm/copyright #{"Copyright (c) 2015-2021 Object Management Group, Inc."
                   "Copyright (c) 2020-2021 agnos.ai"
                   "Copyright (c) 2015-2017 Unisys"
                   "Copyright (c) 2015-2019 Adaptive Inc."
                   "Copyright (c) 2015-2021 Thematix Partners LLC"},
   :sm/dependsOn
   #{{:xsd/anyURI
      "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"}},
   :sm/fileAbbreviation "lcc-639-2",
   :sm/fileAbstract
   "This ontology represents the subset of the ISO 639 standard that provides the language names and actual codes for ISO 639-2.",
   :sm/filename "ISO639-2-LanguageCodes.rdf",
   :xsd/anyURI "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"}
  (:refer-clojure :exclude [cat inc map min]))

(def Achinese
  {:db/ident :lcc-639-2/Achinese,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Achinese"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "aceh"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Achinese",
   :skos/definition "Achinese language"})

(def Acoli
  {:db/ident :lcc-639-2/Acoli,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Acoli"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "acoli"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Acoli",
   :skos/definition "Acoli language"})

(def Adangme
  {:db/ident :lcc-639-2/Adangme,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Adangme"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "adangme"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Adangme",
   :skos/definition "Adangme language"})

(def Adyghe
  {:db/ident :lcc-639-2/Adyghe,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "Adygei"}
                            {:rdf/language "en",
                             :rdf/value    "Adyghe"}},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "adyghé"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Adyghe",
   :skos/definition "Adyghe language"})

(def Afrihili
  {:db/ident :lcc-639-2/Afrihili,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Afrihili"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "afrihili"},
   :rdf/type #{:lcc-lr/ArtificialLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Afrihili",
   :skos/definition "Afrihili language"})

(def AfroAsiaticLanguages
  {:db/ident :lcc-639-2/AfroAsiaticLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Afro-Asiatic languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "afro-asiatiques, langues"},
   :rdf/type #{:lcc-lr/RemainderGroup :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Afro-Asiatic languages",
   :skos/definition "Afro-Asiatic languages remainder group"})

(def Ainu
  {:db/ident :lcc-639-2/Ainu,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Ainu (Japan)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "aïnou"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Ainu",
   :skos/definition "Ainu language"})

(def Akkadian
  {:db/ident :lcc-639-2/Akkadian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Akkadian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "akkadien"},
   :rdf/type #{:owl/NamedIndividual :lcc-lr/AncientLanguage
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Akkadian",
   :skos/definition "Akkadian language"})

(def Aleut
  {:db/ident :lcc-639-2/Aleut,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Aleut"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "aléoute"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Aleut",
   :skos/definition "Aleut language"})

(def AlgonquianLanguages
  {:db/ident :lcc-639-2/AlgonquianLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Algonquian languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "algonquines, langues"},
   :rdf/type #{:lcc-lr/LanguageFamily :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Algonquian languages",
   :skos/definition "Algonquian languages family"})

(def AltaicLanguages
  {:db/ident :lcc-639-2/AltaicLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Altaic languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "altaïques, langues"},
   :rdf/type #{:lcc-lr/RemainderGroup :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Altaic languages",
   :skos/definition "Altaic languages remainder group"})

(def AncientEgyptian
  {:db/ident :lcc-639-2/AncientEgyptian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Egyptian (Ancient)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "égyptien"},
   :rdf/type #{:owl/NamedIndividual :lcc-lr/AncientLanguage
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Ancient Egyptian",
   :skos/definition "Ancient Egyptian language"})

(def AncientGreek
  {:db/ident :lcc-639-2/AncientGreek,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Greek, Ancient (to 1453)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "grec ancien (jusqu'à 1453)"},
   :rdf/type #{:lcc-lr/HistoricalLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Ancient Greek",
   :skos/definition "Ancient Greek language"})

(def Angika
  {:db/ident :lcc-639-2/Angika,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Angika"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "angika"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Angika",
   :skos/definition "Angika language"})

(def ApacheLanguages
  {:db/ident :lcc-639-2/ApacheLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Apache languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "apaches, langues"},
   :rdf/type #{:lcc-lr/LanguageFamily :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Apache languages",
   :skos/definition "Apache languages family"})

(def Arapaho
  {:db/ident :lcc-639-2/Arapaho,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Arapaho"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "arapaho"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Arapaho",
   :skos/definition "Arapaho language"})

(def Arawak
  {:db/ident :lcc-639-2/Arawak,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Arawak"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "arawak"},
   :rdf/type #{:owl/NamedIndividual :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Arawak",
   :skos/definition "Arawak language"})

(def ArtificialLanguages
  {:db/ident :lcc-639-2/ArtificialLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Artificial languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "artificielles, langues"},
   :rdf/type #{:lcc-lr/RemainderGroup :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Artificial languages",
   :skos/definition "Artificial languages remainder group"})

(def Asturian
  {:db/ident :lcc-639-2/Asturian,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "Asturian"}
                            {:rdf/language "en",
                             :rdf/value    "Asturleonese"}
                            {:rdf/language "en",
                             :rdf/value    "Bable"}
                            {:rdf/language "en",
                             :rdf/value    "Leonese"}},
   :lcc-lr/hasFrenchName #{{:rdf/language "fr",
                            :rdf/value    "asturoléonais"}
                           {:rdf/language "fr",
                            :rdf/value    "asturien"}
                           {:rdf/language "fr",
                            :rdf/value    "bable"}
                           {:rdf/language "fr",
                            :rdf/value    "léonais"}},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Asturian",
   :skos/definition "Asturian language"})

(def AthapascanLanguages
  {:db/ident :lcc-639-2/AthapascanLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Athapascan languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "athapascanes, langues"},
   :rdf/type #{:lcc-lr/LanguageFamily :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Athapascan languages",
   :skos/definition "Athapascan languages family"})

(def AustralianLanguages
  {:db/ident :lcc-639-2/AustralianLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Australian languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "australiennes, langues"},
   :rdf/type #{:lcc-lr/LanguageFamily :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Australian languages",
   :skos/definition "Australian languages family"})

(def AustronesianLanguages
  {:db/ident :lcc-639-2/AustronesianLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Austronesian languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "austronésiennes, langues"},
   :rdf/type #{:lcc-lr/RemainderGroup :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Austronesian languages",
   :skos/definition "Austronesian languages remainder group"})

(def Awadhi
  {:db/ident :lcc-639-2/Awadhi,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Awadhi"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "awadhi"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Awadhi",
   :skos/definition "Awadhi language"})

(def Balinese
  {:db/ident :lcc-639-2/Balinese,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Balinese"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "balinais"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Balinese",
   :skos/definition "Balinese language"})

(def BalticLanguages
  {:db/ident :lcc-639-2/BalticLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Baltic languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "baltes, langues"},
   :rdf/type #{:lcc-lr/RemainderGroup :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Baltic languages",
   :skos/definition "Baltic languages remainder group"})

(def Baluchi
  {:db/ident :lcc-639-2/Baluchi,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Baluchi"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "baloutchi"},
   :rdf/type #{:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Baluchi",
   :skos/definition "Language code for Baluchi"})

(def BamilekeLanguages
  {:db/ident :lcc-639-2/BamilekeLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Bamileke languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "bamiléké, langues"},
   :rdf/type #{:lcc-lr/LanguageFamily :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Bamileke languages",
   :skos/definition "Bamileke languages family"})

(def BandaLanguages
  {:db/ident :lcc-639-2/BandaLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Banda languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "banda, langues"},
   :rdf/type #{:lcc-lr/LanguageFamily :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Banda languages",
   :skos/definition "Banda languages family"})

(def BantuLanguages
  {:db/ident :lcc-639-2/BantuLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Bantu languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "bantou, langues"},
   :rdf/type #{:lcc-lr/RemainderGroup :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Bantu languages",
   :skos/definition "Bantu languages remainder group"})

(def Basa
  {:db/ident :lcc-639-2/Basa,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Basa (Cameroon)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "basa"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Basa",
   :skos/definition "Basa language"})

(def BatakLanguages
  {:db/ident :lcc-639-2/BatakLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Batak languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "batak, langues"},
   :rdf/type #{:lcc-lr/LanguageFamily :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Batak languages",
   :skos/definition "Batak languages family"})

(def Beja
  {:db/ident :lcc-639-2/Beja,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "Bedawiyet"}
                            {:rdf/language "en",
                             :rdf/value    "Beja"}},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "bedja"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Beja",
   :skos/definition "Beja language"})

(def Bemba
  {:db/ident :lcc-639-2/Bemba,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Bemba (Zambia)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "bemba"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Bemba",
   :skos/definition "Bemba language"})

(def BerberLanguages
  {:db/ident :lcc-639-2/BerberLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Berber languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "berbères, langues"},
   :rdf/type #{:lcc-lr/RemainderGroup :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Berber languages",
   :skos/definition "Berber languages remainder group"})

(def Bhojpuri
  {:db/ident :lcc-639-2/Bhojpuri,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Bhojpuri"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "bhojpuri"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Bhojpuri",
   :skos/definition "Bhojpuri language"})

(def Bikol
  {:db/ident :lcc-639-2/Bikol,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Bikol"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "bikol"},
   :rdf/type #{:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Bikol",
   :skos/definition "Language code for Bikol"})

(def Bilin
  {:db/ident :lcc-639-2/Bilin,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "Bilin"}
                            {:rdf/language "en",
                             :rdf/value    "Blin"}},
   :lcc-lr/hasFrenchName #{{:rdf/language "fr",
                            :rdf/value    "blin"}
                           {:rdf/language "fr",
                            :rdf/value    "bilen"}},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Bilin",
   :skos/definition "Bilin language"})

(def Bini
  {:db/ident :lcc-639-2/Bini,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "Edo"}
                            {:rdf/language "en",
                             :rdf/value    "Bini"}},
   :lcc-lr/hasFrenchName #{{:rdf/language "fr",
                            :rdf/value    "bini"}
                           {:rdf/language "fr",
                            :rdf/value    "edo"}},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Bini",
   :skos/definition "Bini language"})

(def Bliss
  {:db/ident :lcc-639-2/Bliss,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "Bliss"}
                            {:rdf/language "en",
                             :rdf/value    "Blissymbolics"}
                            {:rdf/language "en",
                             :rdf/value    "Blissymbols"}},
   :lcc-lr/hasFrenchName #{{:rdf/language "fr",
                            :rdf/value    "Bliss"}
                           {:rdf/language "fr",
                            :rdf/value    "symboles Bliss"}},
   :rdf/type #{:lcc-lr/ArtificialLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Bliss",
   :skos/definition "Bliss language"})

(def Braj
  {:db/ident :lcc-639-2/Braj,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Braj"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "braj"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Braj",
   :skos/definition "Braj language"})

(def Buginese
  {:db/ident :lcc-639-2/Buginese,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Buginese"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "bugi"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Buginese",
   :skos/definition "Buginese language"})

(def Buriat
  {:db/ident :lcc-639-2/Buriat,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Buriat"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "bouriate"},
   :rdf/type #{:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Buriat",
   :skos/definition "Language code for Buriat"})

(def Caddo
  {:db/ident :lcc-639-2/Caddo,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Caddo"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "caddo"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Caddo",
   :skos/definition "Caddo language"})

(def CaucasianLanguages
  {:db/ident :lcc-639-2/CaucasianLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Caucasian languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "caucasiennes, langues"},
   :rdf/type #{:lcc-lr/RemainderGroup :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Caucasian languages",
   :skos/definition "Caucasian languages remainder group"})

(def Cebuano
  {:db/ident :lcc-639-2/Cebuano,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Cebuano"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "cebuano"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Cebuano",
   :skos/definition "Cebuano language"})

(def CelticLanguages
  {:db/ident :lcc-639-2/CelticLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Celtic languages"},
   :lcc-lr/hasFrenchName #{{:rdf/language "fr",
                            :rdf/value    "celtes, langues"}
                           {:rdf/language "fr",
                            :rdf/value    "celtiques, langues"}},
   :rdf/type #{:lcc-lr/RemainderGroup :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Celtic languages",
   :skos/definition "Celtic languages remainder group"})

(def CentralAmericanIndianLanguages
  {:db/ident :lcc-639-2/CentralAmericanIndianLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Central American Indian languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value
                          "amérindiennes de l'Amérique centrale, langues"},
   :rdf/type #{:lcc-lr/RemainderGroup :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Central American Indian languages",
   :skos/definition "Central American Indian languages remainder group"})

(def Chagatai
  {:db/ident :lcc-639-2/Chagatai,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Chagatai"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "djaghataï"},
   :rdf/type #{:owl/NamedIndividual :lcc-lr/ExtinctLanguage
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Chagatai",
   :skos/definition "Chagatai language"})

(def ChamicLanguages
  {:db/ident :lcc-639-2/ChamicLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Chamic languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "chames, langues"},
   :rdf/type #{:lcc-lr/LanguageFamily :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Chamic languages",
   :skos/definition "Chamic languages family"})

(def Cherokee
  {:db/ident :lcc-639-2/Cherokee,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Cherokee"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "cherokee"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Cherokee",
   :skos/definition "Cherokee language"})

(def Cheyenne
  {:db/ident :lcc-639-2/Cheyenne,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Cheyenne"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "cheyenne"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Cheyenne",
   :skos/definition "Cheyenne language"})

(def Chibcha
  {:db/ident :lcc-639-2/Chibcha,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Chibcha"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "chibcha"},
   :rdf/type #{:owl/NamedIndividual :lcc-lr/ExtinctLanguage
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Chibcha",
   :skos/definition "Chibcha language"})

(def ChinookJargon
  {:db/ident :lcc-639-2/ChinookJargon,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Chinook jargon"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "chinook, jargon"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Chinook jargon",
   :skos/definition "Chinook jargon language"})

(def Chipewyan
  {:db/ident :lcc-639-2/Chipewyan,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "Dene Suline"}
                            {:rdf/language "en",
                             :rdf/value    "Chipewyan"}},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "chipewyan"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Chipewyan",
   :skos/definition "Chipewyan language"})

(def Choctaw
  {:db/ident :lcc-639-2/Choctaw,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Choctaw"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "choctaw"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Choctaw",
   :skos/definition "Choctaw language"})

(def Chuukese
  {:db/ident :lcc-639-2/Chuukese,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Chuukese"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "chuuk"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Chuukese",
   :skos/definition "Chuukese language"})

(def ClassicalNewari
  {:db/ident :lcc-639-2/ClassicalNewari,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "Classical Nepal Bhasa"}
                            {:rdf/language "en",
                             :rdf/value    "Classical Newari"}
                            {:rdf/language "en",
                             :rdf/value    "Old Newari"}},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "newari classique"},
   :rdf/type #{:lcc-lr/HistoricalLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Classical Newari",
   :skos/definition "Classical Newari language"})

(def ClassicalSyriac
  {:db/ident :lcc-639-2/ClassicalSyriac,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Classical Syriac"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "syriaque classique"},
   :rdf/type #{:lcc-lr/LanguageFamily :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Classical Syriac",
   :skos/definition "Classical Syriac family"})

(def Coptic
  {:db/ident :lcc-639-2/Coptic,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Coptic"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "copte"},
   :rdf/type #{:owl/NamedIndividual :lcc-lr/ExtinctLanguage
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Coptic",
   :skos/definition "Coptic language"})

(def Creek
  {:db/ident :lcc-639-2/Creek,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Creek"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "muskogee"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Creek",
   :skos/definition "Creek language"})

(def CreolesAndPidgins
  {:db/ident :lcc-639-2/CreolesAndPidgins,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Creoles and pidgins"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "créoles et pidgins"},
   :rdf/type #{:lcc-lr/RemainderGroup :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Creoles and pidgins",
   :skos/definition "Creoles and pidgins remainder group"})

(def CreolesAndPidginsEnglishBased
  {:db/ident :lcc-639-2/CreolesAndPidginsEnglishBased,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Creoles and pidgins, English based"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value "créoles et pidgins basés sur l'anglais"},
   :rdf/type #{:lcc-lr/RemainderGroup :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Creoles and pidgins, English based",
   :skos/definition "Creoles and pidgins, English based remainder group"})

(def CreolesAndPidginsFrenchBased
  {:db/ident :lcc-639-2/CreolesAndPidginsFrenchBased,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Creoles and pidgins, French-based"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value
                          "créoles et pidgins basés sur le français"},
   :rdf/type #{:lcc-lr/RemainderGroup :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Creoles and pidgins, French-based",
   :skos/definition "Creoles and pidgins, French-based remainder group"})

(def CreolesAndPidginsPortugueseBased
  {:db/ident :lcc-639-2/CreolesAndPidginsPortugueseBased,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value "Creoles and pidgins, Portuguese-based"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value
                          "créoles et pidgins basés sur le portugais"},
   :rdf/type #{:lcc-lr/RemainderGroup :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Creoles and pidgins, Portuguese-based",
   :skos/definition "Creoles and pidgins, Portuguese-based remainder group"})

(def CrimeanTatar
  {:db/ident :lcc-639-2/CrimeanTatar,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "Crimean Turkish"}
                            {:rdf/language "en",
                             :rdf/value    "Crimean Tatar"}},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tatar de Crimé"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Crimean Tatar",
   :skos/definition "Crimean Tatar language"})

(def CushiticLanguages
  {:db/ident :lcc-639-2/CushiticLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Cushitic languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "couchitiques, langues"},
   :rdf/type #{:lcc-lr/RemainderGroup :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Cushitic languages",
   :skos/definition "Cushitic languages remainder group"})

(def Dakota
  {:db/ident :lcc-639-2/Dakota,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Dakota"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "dakota"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Dakota",
   :skos/definition "Dakota language"})

(def Dargwa
  {:db/ident :lcc-639-2/Dargwa,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Dargwa"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "dargwa"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Dargwa",
   :skos/definition "Dargwa language"})

(def Delaware
  {:db/ident :lcc-639-2/Delaware,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Delaware"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "delaware"},
   :rdf/type #{:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Delaware",
   :skos/definition "Language code for Delaware"})

(def Dinka
  {:db/ident :lcc-639-2/Dinka,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Dinka"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "dinka"},
   :rdf/type #{:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Dinka",
   :skos/definition "Language code for Dinka"})

(def Dogri
  {:db/ident :lcc-639-2/Dogri,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Dogri (macrolanguage)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "dogri"},
   :rdf/type #{:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Dogri",
   :skos/definition "Language code for Dogri (macrolanguage)"})

(def Dogrib
  {:db/ident :lcc-639-2/Dogrib,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Dogrib"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "dogrib"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Dogrib",
   :skos/definition "Dogrib language"})

(def DravidianLanguages
  {:db/ident :lcc-639-2/DravidianLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Dravidian languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "dravidiennes, langues"},
   :rdf/type #{:lcc-lr/RemainderGroup :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Dravidian languages",
   :skos/definition "Dravidian languages remainder group"})

(def Duala
  {:db/ident :lcc-639-2/Duala,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Duala"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "douala"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Duala",
   :skos/definition "Duala language"})

(def Dyula
  {:db/ident :lcc-639-2/Dyula,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Dyula"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "dioula"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Dyula",
   :skos/definition "Dyula language"})

(def EasternFrisian
  {:db/ident :lcc-639-2/EasternFrisian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Eastern Frisian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "frison oriental"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Eastern Frisian",
   :skos/definition "Eastern Frisian language"})

(def Efik
  {:db/ident :lcc-639-2/Efik,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Efik"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "efik"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Efik",
   :skos/definition "Efik language"})

(def Ekajuk
  {:db/ident :lcc-639-2/Ekajuk,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Ekajuk"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "ekajuk"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Ekajuk",
   :skos/definition "Ekajuk language"})

(def Elamite
  {:db/ident :lcc-639-2/Elamite,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Elamite"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "élamite"},
   :rdf/type #{:owl/NamedIndividual :lcc-lr/AncientLanguage
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Elamite",
   :skos/definition "Elamite language"})

(def Erzya
  {:db/ident :lcc-639-2/Erzya,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Erzya"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "erzya"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Erzya",
   :skos/definition "Erzya language"})

(def Ewondo
  {:db/ident :lcc-639-2/Ewondo,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Ewondo"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "éwondo"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Ewondo",
   :skos/definition "Ewondo language"})

(def Fang
  {:db/ident :lcc-639-2/Fang,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Fang (Equatorial Guinea)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "fang"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Fang",
   :skos/definition "Fang language"})

(def Fanti
  {:db/ident :lcc-639-2/Fanti,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Fanti"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "fanti"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Fanti",
   :skos/definition "Fanti language"})

(def Filipino
  {:db/ident :lcc-639-2/Filipino,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "Filipino"}
                            {:rdf/language "en",
                             :rdf/value    "Pilipino"}},
   :lcc-lr/hasFrenchName #{{:rdf/language "fr",
                            :rdf/value    "filipino"}
                           {:rdf/language "fr",
                            :rdf/value    "pilipino"}},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Filipino",
   :skos/definition "Filipino language"})

(def FinnoUgrianLanguages
  {:db/ident :lcc-639-2/FinnoUgrianLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Finno-Ugrian languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "finno-ougriennes, langues"},
   :rdf/type #{:lcc-lr/RemainderGroup :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Finno-Ugrian languages",
   :skos/definition "Finno-Ugrian languages remainder group"})

(def Fon
  {:db/ident :lcc-639-2/Fon,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Fon"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "fon"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Fon",
   :skos/definition "Fon language"})

(def Friulian
  {:db/ident :lcc-639-2/Friulian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Friulian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "frioulan"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Friulian",
   :skos/definition "Friulian language"})

(def Ga
  {:db/ident :lcc-639-2/Ga,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Ga"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "ga"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Ga",
   :skos/definition "Ga language"})

(def GalibiCarib
  {:db/ident :lcc-639-2/GalibiCarib,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Galibi Carib"},
   :lcc-lr/hasFrenchName #{{:rdf/language "fr",
                            :rdf/value    "galibi"}
                           {:rdf/language "fr",
                            :rdf/value    "karib"}
                           {:rdf/language "fr",
                            :rdf/value    "carib"}},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Galibi Carib",
   :skos/definition "Galibi Carib language"})

(def Gayo
  {:db/ident :lcc-639-2/Gayo,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Gayo"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "gayo"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Gayo",
   :skos/definition "Gayo language"})

(def Gbaya
  {:db/ident :lcc-639-2/Gbaya,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Gbaya (Central African Republic)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "gbaya"},
   :rdf/type #{:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Gbaya",
   :skos/definition "Language code for Gbaya (Central African Republic)"})

(def Geez
  {:db/ident :lcc-639-2/Geez,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Geez"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "guèze"},
   :rdf/type #{:owl/NamedIndividual :lcc-lr/AncientLanguage
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Geez",
   :skos/definition "Geez language"})

(def GermanicLanguages
  {:db/ident :lcc-639-2/GermanicLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Germanic languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "germaniques, langues"},
   :rdf/type #{:lcc-lr/RemainderGroup :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Germanic languages",
   :skos/definition "Germanic languages remainder group"})

(def Gilbertese
  {:db/ident :lcc-639-2/Gilbertese,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Gilbertese"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "kiribati"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Gilbertese",
   :skos/definition "Gilbertese language"})

(def Gondi
  {:db/ident :lcc-639-2/Gondi,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Gondi"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "gond"},
   :rdf/type #{:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Gondi",
   :skos/definition "Language code for Gondi"})

(def Gorontalo
  {:db/ident :lcc-639-2/Gorontalo,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Gorontalo"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "gorontalo"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Gorontalo",
   :skos/definition "Gorontalo language"})

(def Gothic
  {:db/ident :lcc-639-2/Gothic,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Gothic"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "gothique"},
   :rdf/type #{:owl/NamedIndividual :lcc-lr/AncientLanguage
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Gothic",
   :skos/definition "Gothic language"})

(def Grebo
  {:db/ident :lcc-639-2/Grebo,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Grebo"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "grebo"},
   :rdf/type #{:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Grebo",
   :skos/definition "Language code for Grebo"})

(def Gwichin
  {:db/ident :lcc-639-2/Gwichin,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Gwich'in"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "gwich'in"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Gwich'in",
   :skos/definition "Gwich'in language"})

(def Haida
  {:db/ident :lcc-639-2/Haida,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Haida"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "haida"},
   :rdf/type #{:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Haida",
   :skos/definition "Language code for Haida"})

(def Hawaiian
  {:db/ident :lcc-639-2/Hawaiian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Hawaiian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "hawaïen"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Hawaiian",
   :skos/definition "Hawaiian language"})

(def Hiligaynon
  {:db/ident :lcc-639-2/Hiligaynon,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Hiligaynon"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "hiligaynon"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Hiligaynon",
   :skos/definition "Hiligaynon language"})

(def HimachaliLanguages
  {:db/ident :lcc-639-2/HimachaliLanguages,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "Himachali languages"}
                            {:rdf/language "en",
                             :rdf/value    "Western Pahari languages"}},
   :lcc-lr/hasFrenchName #{{:rdf/language "fr",
                            :rdf/value    "langues himachalis"}
                           {:rdf/language "fr",
                            :rdf/value    "langues paharis occidentales"}},
   :rdf/type #{:lcc-lr/LanguageFamily :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Himachali languages",
   :skos/definition "Himachali languages family"})

(def Hittite
  {:db/ident :lcc-639-2/Hittite,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Hittite"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "hittite"},
   :rdf/type #{:owl/NamedIndividual :lcc-lr/AncientLanguage
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Hittite",
   :skos/definition "Hittite language"})

(def Hmong
  {:db/ident :lcc-639-2/Hmong,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "Hmong"}
                            {:rdf/language "en",
                             :rdf/value    "Mong"}},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "hmong"},
   :rdf/type #{:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Hmong",
   :skos/definition "Language code for Hmong"})

(def Hupa
  {:db/ident :lcc-639-2/Hupa,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Hupa"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "hupa"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Hupa",
   :skos/definition "Hupa language"})

(def ISO639-2-CodeSet
  {:db/ident :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/CodeSet :owl/NamedIndividual
               :lcc-lr/IdentificationScheme},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "ISO 639-2 code set",
   :rdfs/seeAlso {:xsd/anyURI
                  "http://www.loc.gov/standards/iso639-2/php/code_list.php/"},
   :skos/definition
   "the set of language identifiers that comprise the ISO 639-2 specification"})

(def Iban
  {:db/ident :lcc-639-2/Iban,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Iban"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "iban"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Iban",
   :skos/definition "Iban language"})

(def IjoLanguages
  {:db/ident :lcc-639-2/IjoLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Ijo languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "ijo, langues"},
   :rdf/type #{:lcc-lr/LanguageFamily :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Ijo languages",
   :skos/definition "Ijo languages family"})

(def Iloko
  {:db/ident :lcc-639-2/Iloko,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Iloko"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "ilocano"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Iloko",
   :skos/definition "Iloko language"})

(def InariSami
  {:db/ident :lcc-639-2/InariSami,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Inari Sami"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sami d'Inari"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Inari Sami",
   :skos/definition "Inari Sami language"})

(def IndicLanguages
  {:db/ident :lcc-639-2/IndicLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Indic languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "indo-aryennes, langues"},
   :rdf/type #{:lcc-lr/RemainderGroup :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Indic languages",
   :skos/definition "Indic languages remainder group"})

(def IndoEuropeanLanguages
  {:db/ident :lcc-639-2/IndoEuropeanLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Indo-European languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "indo-européennes, langues"},
   :rdf/type #{:lcc-lr/RemainderGroup :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Indo-European languages",
   :skos/definition "Indo-European languages remainder group"})

(def Ingush
  {:db/ident :lcc-639-2/Ingush,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Ingush"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "ingouche"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Ingush",
   :skos/definition "Ingush language"})

(def IranianLanguages
  {:db/ident :lcc-639-2/IranianLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Iranian languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "iraniennes, langues"},
   :rdf/type #{:lcc-lr/RemainderGroup :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Iranian languages",
   :skos/definition "Iranian languages remainder group"})

(def IroquoianLanguages
  {:db/ident :lcc-639-2/IroquoianLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Iroquoian languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "iroquoises, langues"},
   :rdf/type #{:lcc-lr/LanguageFamily :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Iroquoian languages",
   :skos/definition "Iroquoian languages family"})

(def JudeoArabic
  {:db/ident :lcc-639-2/JudeoArabic,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Judeo-Arabic"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "judéo-arabe"},
   :rdf/type #{:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Judeo-Arabic",
   :skos/definition "Language code for Judeo-Arabic"})

(def JudeoPersian
  {:db/ident :lcc-639-2/JudeoPersian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Judeo-Persian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "judéo-persan"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Judeo-Persian",
   :skos/definition "Judeo-Persian language"})

(def Kabardian
  {:db/ident :lcc-639-2/Kabardian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Kabardian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "kabardien"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Kabardian",
   :skos/definition "Kabardian language"})

(def Kabyle
  {:db/ident :lcc-639-2/Kabyle,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Kabyle"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "kabyle"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Kabyle",
   :skos/definition "Kabyle language"})

(def Kachin
  {:db/ident :lcc-639-2/Kachin,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "Kachin"}
                            {:rdf/language "en",
                             :rdf/value    "Jingpho"}},
   :lcc-lr/hasFrenchName #{{:rdf/language "fr",
                            :rdf/value    "kachin"}
                           {:rdf/language "fr",
                            :rdf/value    "jingpho"}},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Kachin",
   :skos/definition "Kachin language"})

(def Kalmyk
  {:db/ident :lcc-639-2/Kalmyk,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "Kalmyk"}
                            {:rdf/language "en",
                             :rdf/value    "Oirat"}},
   :lcc-lr/hasFrenchName #{{:rdf/language "fr",
                            :rdf/value    "kalmouk"}
                           {:rdf/language "fr",
                            :rdf/value    "oïrat"}},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Kalmyk",
   :skos/definition "Kalmyk language"})

(def Kamba
  {:db/ident :lcc-639-2/Kamba,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Kamba (Kenya)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "kamba"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Kamba",
   :skos/definition "Kamba language"})

(def KaraKalpak
  {:db/ident :lcc-639-2/KaraKalpak,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Kara-Kalpak"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "karakalpak"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Kara-Kalpak",
   :skos/definition "Kara-Kalpak language"})

(def KarachayBalkar
  {:db/ident :lcc-639-2/KarachayBalkar,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Karachay-Balkar"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "karatchai balkar"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Karachay-Balkar",
   :skos/definition "Karachay-Balkar language"})

(def Karelian
  {:db/ident :lcc-639-2/Karelian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Karelian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "carélien"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Karelian",
   :skos/definition "Karelian language"})

(def KarenLanguages
  {:db/ident :lcc-639-2/KarenLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Karen languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "karen, langues"},
   :rdf/type #{:lcc-lr/LanguageFamily :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Karen languages",
   :skos/definition "Karen languages family"})

(def Kashubian
  {:db/ident :lcc-639-2/Kashubian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Kashubian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "kachoube"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Kashubian",
   :skos/definition "Kashubian language"})

(def Kawi
  {:db/ident :lcc-639-2/Kawi,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Kawi"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "kawi"},
   :rdf/type #{:owl/NamedIndividual :lcc-lr/AncientLanguage
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Kawi",
   :skos/definition "Kawi language"})

(def Khasi
  {:db/ident :lcc-639-2/Khasi,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Khasi"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "khasi"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Khasi",
   :skos/definition "Khasi language"})

(def KhoisanLanguages
  {:db/ident :lcc-639-2/KhoisanLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Khoisan languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "khoïsan, langues"},
   :rdf/type #{:lcc-lr/RemainderGroup :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Khoisan languages",
   :skos/definition "Khoisan languages remainder group"})

(def Khotanese
  {:db/ident :lcc-639-2/Khotanese,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "Sakan"}
                            {:rdf/language "en",
                             :rdf/value    "Khotanese"}},
   :lcc-lr/hasFrenchName #{{:rdf/language "fr",
                            :rdf/value    "khotanais"}
                           {:rdf/language "fr",
                            :rdf/value    "sakan"}},
   :lcc-lr/hasGermanName {:rdf/language "ge",
                          :rdf/value    "Sakisch"},
   :rdf/type #{:owl/NamedIndividual :lcc-lr/AncientLanguage
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Khotanese",
   :skos/definition "Khotanese language"})

(def Kimbundu
  {:db/ident :lcc-639-2/Kimbundu,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Kimbundu"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "kimbundu"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Kimbundu",
   :skos/definition "Kimbundu language"})

(def Klingon
  {:db/ident :lcc-639-2/Klingon,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "tlhIngan-Hol"}
                            {:rdf/language "en",
                             :rdf/value    "Klingon"}},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "klingon"},
   :rdf/type #{:lcc-lr/ArtificialLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Klingon",
   :skos/definition "Klingon language"})

(def Konkani
  {:db/ident :lcc-639-2/Konkani,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Konkani (macrolanguage)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "konkani"},
   :rdf/type #{:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Konkani",
   :skos/definition "Language code for Konkani (macrolanguage)"})

(def Kosraean
  {:db/ident :lcc-639-2/Kosraean,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Kosraean"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "kosrae"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Kosraean",
   :skos/definition "Kosraean language"})

(def Kpelle
  {:db/ident :lcc-639-2/Kpelle,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Kpelle"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "kpellé"},
   :rdf/type #{:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Kpelle",
   :skos/definition "Language code for Kpelle"})

(def KruLanguages
  {:db/ident :lcc-639-2/KruLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Kru languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "krou, langues"},
   :rdf/type #{:lcc-lr/LanguageFamily :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Kru languages",
   :skos/definition "Kru languages family"})

(def Kumyk
  {:db/ident :lcc-639-2/Kumyk,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Kumyk"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "koumyk"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Kumyk",
   :skos/definition "Kumyk language"})

(def Kurukh
  {:db/ident :lcc-639-2/Kurukh,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Kurukh"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "kurukh"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Kurukh",
   :skos/definition "Kurukh language"})

(def Kutenai
  {:db/ident :lcc-639-2/Kutenai,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Kutenai"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "kutenai"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Kutenai",
   :skos/definition "Kutenai language"})

(def Ladino
  {:db/ident :lcc-639-2/Ladino,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Ladino"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "judéo-espagnol"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Ladino",
   :skos/definition "Ladino language"})

(def Lahnda
  {:db/ident :lcc-639-2/Lahnda,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Lahnda"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "lahnda"},
   :rdf/type #{:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Lahnda",
   :skos/definition "Language code for Lahnda"})

(def Lamba
  {:db/ident :lcc-639-2/Lamba,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Lamba"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "lamba"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Lamba",
   :skos/definition "Lamba language"})

(def LandDayakLanguages
  {:db/ident :lcc-639-2/LandDayakLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Land Dayak languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "dayak, langues"},
   :rdf/type #{:lcc-lr/LanguageFamily :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Land Dayak languages",
   :skos/definition "Land Dayak languages family"})

(def Lezghian
  {:db/ident :lcc-639-2/Lezghian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Lezghian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "lezghien"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Lezghian",
   :skos/definition "Lezghian language"})

(def Lojban
  {:db/ident :lcc-639-2/Lojban,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Lojban"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "lojban"},
   :rdf/type #{:lcc-lr/ArtificialLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Lojban",
   :skos/definition "Lojban language"})

(def LowGerman
  {:db/ident :lcc-639-2/LowGerman,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "Low German"}
                            {:rdf/language "en",
                             :rdf/value    "Low Saxon"}},
   :lcc-lr/hasFrenchName #{{:rdf/language "fr",
                            :rdf/value    "bas saxon"}
                           {:rdf/language "fr",
                            :rdf/value    "bas allemand"}},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Low German",
   :skos/definition "Low German language"})

(def LowerSorbian
  {:db/ident :lcc-639-2/LowerSorbian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Lower Sorbian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "bas-sorabe"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Lower Sorbian",
   :skos/definition "Lower Sorbian language"})

(def Lozi
  {:db/ident :lcc-639-2/Lozi,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Lozi"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "lozi"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Lozi",
   :skos/definition "Lozi language"})

(def LubaLulua
  {:db/ident :lcc-639-2/LubaLulua,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Luba-Lulua"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "luba-lulua"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Luba-Lulua",
   :skos/definition "Luba-Lulua language"})

(def Luiseno
  {:db/ident :lcc-639-2/Luiseno,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Luiseno"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "luiseno"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Luiseno",
   :skos/definition "Luiseno language"})

(def LuleSami
  {:db/ident :lcc-639-2/LuleSami,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Lule Sami"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sami de Lule"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Lule Sami",
   :skos/definition "Lule Sami language"})

(def Lunda
  {:db/ident :lcc-639-2/Lunda,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Lunda"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "lunda"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Lunda",
   :skos/definition "Lunda language"})

(def LuoKenyaAndTanzania
  {:db/ident :lcc-639-2/LuoKenyaAndTanzania,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Luo (Kenya and Tanzania)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "luo (Kenya et Tanzanie)"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Luo - Kenya and Tanzania",
   :skos/definition "Luo - Kenya and Tanzania language"})

(def Lushai
  {:db/ident :lcc-639-2/Lushai,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Lushai"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "lushai"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Lushai",
   :skos/definition "Lushai language"})

(def MacedoRomanian
  {:db/ident :lcc-639-2/MacedoRomanian,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "Arumanian"}
                            {:rdf/language "en",
                             :rdf/value    "Aromanian"}
                            {:rdf/language "en",
                             :rdf/value    "Macedo Romanian"}},
   :lcc-lr/hasFrenchName #{{:rdf/language "fr",
                            :rdf/value    "aroumain"}
                           {:rdf/language "fr",
                            :rdf/value    "macédo-roumain"}},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Macedo Romanian",
   :skos/definition "Macedo Romanian language"})

(def Madurese
  {:db/ident :lcc-639-2/Madurese,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Madurese"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "madourais"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Madurese",
   :skos/definition "Madurese language"})

(def Magahi
  {:db/ident :lcc-639-2/Magahi,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Magahi"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "magahi"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Magahi",
   :skos/definition "Magahi language"})

(def Maithili
  {:db/ident :lcc-639-2/Maithili,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Maithili"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "maithili"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Maithili",
   :skos/definition "Maithili language"})

(def Makasar
  {:db/ident :lcc-639-2/Makasar,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Makasar"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "makassar"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Makasar",
   :skos/definition "Makasar language"})

(def Manchu
  {:db/ident :lcc-639-2/Manchu,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Manchu"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "mandchou"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Manchu",
   :skos/definition "Manchu language"})

(def Mandar
  {:db/ident :lcc-639-2/Mandar,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Mandar"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "mandar"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Mandar",
   :skos/definition "Mandar language"})

(def Mandingo
  {:db/ident :lcc-639-2/Mandingo,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Mandingo"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "mandingue"},
   :rdf/type #{:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Mandingo",
   :skos/definition "Language code for Mandingo"})

(def Manipuri
  {:db/ident :lcc-639-2/Manipuri,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Manipuri"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "manipuri"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Manipuri",
   :skos/definition "Manipuri language"})

(def ManoboLanguages
  {:db/ident :lcc-639-2/ManoboLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Manobo languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "manobo, langues"},
   :rdf/type #{:lcc-lr/LanguageFamily :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Manobo languages",
   :skos/definition "Manobo languages family"})

(def Mapudungun
  {:db/ident :lcc-639-2/Mapudungun,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "Mapuche"}
                            {:rdf/language "en",
                             :rdf/value    "Mapudungun"}},
   :lcc-lr/hasFrenchName #{{:rdf/language "fr",
                            :rdf/value    "mapuce"}
                           {:rdf/language "fr",
                            :rdf/value    "mapudungun"}
                           {:rdf/language "fr",
                            :rdf/value    "mapuche"}},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Mapudungun",
   :skos/definition "Mapudungun language"})

(def Mari
  {:db/ident :lcc-639-2/Mari,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Mari (Russian)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "mari"},
   :rdf/type #{:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Mari",
   :skos/definition "Language code for Mari (Russian)"})

(def Marwari
  {:db/ident :lcc-639-2/Marwari,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Marwari"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "marvari"},
   :rdf/type #{:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Marwari",
   :skos/definition "Language code for Marwari"})

(def Masai
  {:db/ident :lcc-639-2/Masai,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Masai"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "massaï"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Masai",
   :skos/definition "Masai language"})

(def MayanLanguages
  {:db/ident :lcc-639-2/MayanLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Mayan languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "maya, langues"},
   :rdf/type #{:lcc-lr/LanguageFamily :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Mayan languages",
   :skos/definition "Mayan languages family"})

(def Mende
  {:db/ident :lcc-639-2/Mende,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Mende (Sierra Leone)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "mendé"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Mende",
   :skos/definition "Mende language"})

(def MiddleDutch
  {:db/ident :lcc-639-2/MiddleDutch,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Dutch, Middle (ca. 1050-1350)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "néerlandais moyen (ca. 1050-1350)"},
   :rdf/type #{:lcc-lr/HistoricalLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Middle Dutch",
   :skos/definition "Middle Dutch language"})

(def MiddleEnglish
  {:db/ident :lcc-639-2/MiddleEnglish,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "English, Middle (1100-1500)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "anglais moyen (1100-1500)"},
   :rdf/type #{:lcc-lr/HistoricalLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Middle English",
   :skos/definition "Middle English language"})

(def MiddleFrench
  {:db/ident :lcc-639-2/MiddleFrench,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "French, Middle (ca. 1400-1600)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "français moyen (ca. 1400-1600)"},
   :rdf/type #{:lcc-lr/HistoricalLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Middle French",
   :skos/definition "Middle French language"})

(def MiddleHighGerman
  {:db/ident :lcc-639-2/MiddleHighGerman,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "German, Middle High (ca. 1050-1500)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "allemand, moyen haut (ca. 1050-1500)"},
   :rdf/type #{:lcc-lr/HistoricalLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Middle High German",
   :skos/definition "Middle High German language"})

(def MiddleIrish
  {:db/ident :lcc-639-2/MiddleIrish,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Irish, Middle (900-1200)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "irlandais moyen (900-1200)"},
   :rdf/type #{:lcc-lr/HistoricalLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Middle Irish",
   :skos/definition "Middle Irish language"})

(def Mikmaq
  {:db/ident :lcc-639-2/Mikmaq,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "Mi'kmaq"}
                            {:rdf/language "en",
                             :rdf/value    "Micmac"}},
   :lcc-lr/hasFrenchName #{{:rdf/language "fr",
                            :rdf/value    "mi'kmaq"}
                           {:rdf/language "fr",
                            :rdf/value    "micmac"}},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Mi'kmaq",
   :skos/definition "Mi'kmaq language"})

(def Minangkabau
  {:db/ident :lcc-639-2/Minangkabau,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Minangkabau"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "minangkabau"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Minangkabau",
   :skos/definition "Minangkabau language"})

(def Mirandese
  {:db/ident :lcc-639-2/Mirandese,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Mirandese"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "mirandais"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Mirandese",
   :skos/definition "Mirandese language"})

(def Mohawk
  {:db/ident :lcc-639-2/Mohawk,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Mohawk"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "mohawk"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Mohawk",
   :skos/definition "Mohawk language"})

(def Moksha
  {:db/ident :lcc-639-2/Moksha,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Moksha"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "moksa"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Moksha",
   :skos/definition "Moksha language"})

(def MonKhmerLanguages
  {:db/ident :lcc-639-2/MonKhmerLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Mon-Khmer languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "môn-khmer, langues"},
   :rdf/type #{:lcc-lr/RemainderGroup :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Mon-Khmer languages",
   :skos/definition "Mon-Khmer languages remainder group"})

(def Mongo
  {:db/ident :lcc-639-2/Mongo,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Mongo"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "mongo"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Mongo",
   :skos/definition "Mongo language"})

(def Montenegrin
  {:db/ident :lcc-639-2/Montenegrin,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Montenegrin"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "monténégrin"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Montenegrin",
   :skos/definition "Montenegrin language"})

(def Mossi
  {:db/ident :lcc-639-2/Mossi,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Mossi"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "moré"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Mossi",
   :skos/definition "Mossi language"})

(def MultipleLanguages
  {:db/ident :lcc-639-2/MultipleLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Multiple languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "multilingue"},
   :rdf/type #{:lcc-lr/SpecialPurposeLanguageConcept :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Multiple languages",
   :skos/definition "Multiple languages special purpose language concept"})

(def MundaLanguages
  {:db/ident :lcc-639-2/MundaLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Munda languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "mounda, langues"},
   :rdf/type #{:lcc-lr/LanguageFamily :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Munda languages",
   :skos/definition "Munda languages family"})

(def NKo
  {:db/ident :lcc-639-2/NKo,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "N'Ko"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "n'ko"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "N'Ko",
   :skos/definition "N'Ko language"})

(def NahuatlLanguages
  {:db/ident :lcc-639-2/NahuatlLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Nahuatl languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "nahuatl, langues"},
   :rdf/type #{:lcc-lr/LanguageFamily :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Nahuatl languages",
   :skos/definition "Nahuatl languages family"})

(def Neapolitan
  {:db/ident :lcc-639-2/Neapolitan,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Neapolitan"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "napolitain"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Neapolitan",
   :skos/definition "Neapolitan language"})

(def Newari
  {:db/ident :lcc-639-2/Newari,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "Newari"}
                            {:rdf/language "en",
                             :rdf/value    "Nepal Bhasa"}},
   :lcc-lr/hasFrenchName #{{:rdf/language "fr",
                            :rdf/value    "nepal bhasa"}
                           {:rdf/language "fr",
                            :rdf/value    "newari"}},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Newari",
   :skos/definition "Newari language"})

(def Nias
  {:db/ident :lcc-639-2/Nias,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Nias"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "nias"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Nias",
   :skos/definition "Nias language"})

(def NigerKordofanianLanguages
  {:db/ident :lcc-639-2/NigerKordofanianLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Niger-Kordofanian languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "nigéro-kordofaniennes, langues"},
   :rdf/type #{:lcc-lr/RemainderGroup :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Niger-Kordofanian languages",
   :skos/definition "Niger-Kordofanian languages remainder group"})

(def NiloSaharanLanguages
  {:db/ident :lcc-639-2/NiloSaharanLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Nilo-Saharan languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "nilo-sahariennes, langues"},
   :rdf/type #{:lcc-lr/RemainderGroup :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Nilo-Saharan languages",
   :skos/definition "Nilo-Saharan languages remainder group"})

(def Niuean
  {:db/ident :lcc-639-2/Niuean,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Niuean"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "niué"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Niuean",
   :skos/definition "Niuean language"})

(def NoLinguisticContent
  {:db/ident :lcc-639-2/NoLinguisticContent,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "Not applicable"}
                            {:rdf/language "en",
                             :rdf/value    "No linguistic content"}},
   :lcc-lr/hasFrenchName #{{:rdf/language "fr",
                            :rdf/value    "non applicable"}
                           {:rdf/language "fr",
                            :rdf/value    "pas de contenu linguistique"}},
   :rdf/type #{:lcc-lr/SpecialPurposeLanguageConcept :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "No linguistic content",
   :skos/definition "No linguistic content special purpose language concept"})

(def Nogai
  {:db/ident :lcc-639-2/Nogai,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Nogai"},
   :lcc-lr/hasFrenchName #{{:rdf/language "fr",
                            :rdf/value    "nogay"}
                           {:rdf/language "fr",
                            :rdf/value    "nogaï"}},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Nogai",
   :skos/definition "Nogai language"})

(def NorthAmericanIndianLanguages
  {:db/ident :lcc-639-2/NorthAmericanIndianLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "North American Indian languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "nord-amérindiennes, langues"},
   :rdf/type #{:lcc-lr/RemainderGroup :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "North American Indian languages",
   :skos/definition "North American Indian languages remainder group"})

(def NorthernFrisian
  {:db/ident :lcc-639-2/NorthernFrisian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Northern Frisian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "frison septentrional"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Northern Frisian",
   :skos/definition "Northern Frisian language"})

(def NubianLanguages
  {:db/ident :lcc-639-2/NubianLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Nubian languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "nubiennes, langues"},
   :rdf/type #{:lcc-lr/LanguageFamily :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Nubian languages",
   :skos/definition "Nubian languages family"})

(def Nyamwezi
  {:db/ident :lcc-639-2/Nyamwezi,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Nyamwezi"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "nyamwezi"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Nyamwezi",
   :skos/definition "Nyamwezi language"})

(def Nyankole
  {:db/ident :lcc-639-2/Nyankole,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Nyankole"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "nyankolé"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Nyankole",
   :skos/definition "Nyankole language"})

(def Nyoro
  {:db/ident :lcc-639-2/Nyoro,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Nyoro"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "nyoro"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Nyoro",
   :skos/definition "Nyoro language"})

(def Nzima
  {:db/ident :lcc-639-2/Nzima,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Nzima"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "nzema"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Nzima",
   :skos/definition "Nzima language"})

(def OfficialAramaic
  {:db/ident :lcc-639-2/OfficialAramaic,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "Imperial Aramaic (700-300 BCE)"}
                            {:rdf/language "en",
                             :rdf/value    "Official Aramaic (700-300 BCE)"}},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "araméen d'empire (700-300 BCE)"},
   :rdf/type #{:owl/NamedIndividual :lcc-lr/AncientLanguage
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Official Aramaic",
   :skos/definition "Official Aramaic language"})

(def OldEnglish
  {:db/ident :lcc-639-2/OldEnglish,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "English, Old (ca. 450-1100)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "anglo-saxon (ca. 450-1100)"},
   :rdf/type #{:lcc-lr/HistoricalLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Old English",
   :skos/definition "Old English language"})

(def OldFrench
  {:db/ident :lcc-639-2/OldFrench,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "French, Old (842-ca.1400)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "français ancien (842-ca.1400)"},
   :rdf/type #{:lcc-lr/HistoricalLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Old French",
   :skos/definition "Old French language"})

(def OldHighGerman
  {:db/ident :lcc-639-2/OldHighGerman,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "German, Old High (ca. 750-1050)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "allemand, vieux haut (ca. 750-1050)"},
   :rdf/type #{:lcc-lr/HistoricalLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Old High German",
   :skos/definition "Old High German language"})

(def OldIrish
  {:db/ident :lcc-639-2/OldIrish,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Irish, Old (to 900)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "irlandais ancien (jusqu'à 900)"},
   :rdf/type #{:lcc-lr/HistoricalLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Old Irish",
   :skos/definition "Old Irish language"})

(def OldNorse
  {:db/ident :lcc-639-2/OldNorse,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Norse, Old"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "norrois, vieux"},
   :rdf/type #{:lcc-lr/HistoricalLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Old Norse",
   :skos/definition "Old Norse language"})

(def OldPersian
  {:db/ident :lcc-639-2/OldPersian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Persian, Old (ca. 600-400 B.C.)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "perse, vieux (ca. 600-400 av. J.-C.)"},
   :rdf/type #{:lcc-lr/HistoricalLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Old Persian",
   :skos/definition "Old Persian language"})

(def OldProvencal
  {:db/ident :lcc-639-2/OldProvencal,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "Occitan, Old (to 1500)"}
                            {:rdf/language "en",
                             :rdf/value    "Provencal, Old (to 1500)"}},
   :lcc-lr/hasFrenchName #{{:rdf/language "fr",
                            :rdf/value    "occitan ancien (jusqu'à 1500)"}
                           {:rdf/language "fr",
                            :rdf/value    "provençal ancien (jusqu'à 1500)"}},
   :rdf/type #{:lcc-lr/HistoricalLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Old Provencal",
   :skos/definition "Old Provencal language"})

(def Osage
  {:db/ident :lcc-639-2/Osage,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Osage"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "osage"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Osage",
   :skos/definition "Osage language"})

(def OtomianLanguages
  {:db/ident :lcc-639-2/OtomianLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Otomian languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "otomi, langues"},
   :rdf/type #{:lcc-lr/LanguageFamily :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Otomian languages",
   :skos/definition "Otomian languages family"})

(def OttomanTurkish
  {:db/ident :lcc-639-2/OttomanTurkish,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Turkish, Ottoman (1500-1928)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "turc ottoman (1500-1928)"},
   :rdf/type #{:lcc-lr/HistoricalLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Ottoman Turkish",
   :skos/definition "Ottoman Turkish language"})

(def Pahlavi
  {:db/ident :lcc-639-2/Pahlavi,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Pahlavi"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "pahlavi"},
   :rdf/type #{:owl/NamedIndividual :lcc-lr/AncientLanguage
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Pahlavi",
   :skos/definition "Pahlavi language"})

(def Palauan
  {:db/ident :lcc-639-2/Palauan,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Palauan"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "palau"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Palauan",
   :skos/definition "Palauan language"})

(def Pampanga
  {:db/ident :lcc-639-2/Pampanga,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "Kapampangan"}
                            {:rdf/language "en",
                             :rdf/value    "Pampanga"}},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "pampangan"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Pampanga",
   :skos/definition "Pampanga language"})

(def Pangasinan
  {:db/ident :lcc-639-2/Pangasinan,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Pangasinan"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "pangasinan"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Pangasinan",
   :skos/definition "Pangasinan language"})

(def Papiamento
  {:db/ident :lcc-639-2/Papiamento,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Papiamento"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "papiamento"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Papiamento",
   :skos/definition "Papiamento language"})

(def PapuanLanguages
  {:db/ident :lcc-639-2/PapuanLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Papuan languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "papoues, langues"},
   :rdf/type #{:lcc-lr/RemainderGroup :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Papuan languages",
   :skos/definition "Papuan languages remainder group"})

(def Pedi
  {:db/ident :lcc-639-2/Pedi,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "Pedi"}
                            {:rdf/language "en",
                             :rdf/value    "Northern Sotho"}
                            {:rdf/language "en",
                             :rdf/value    "Sepedi"}},
   :lcc-lr/hasFrenchName #{{:rdf/language "fr",
                            :rdf/value    "sotho du Nord"}
                           {:rdf/language "fr",
                            :rdf/value    "pedi"}
                           {:rdf/language "fr",
                            :rdf/value    "sepedi"}},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Pedi",
   :skos/definition "Pedi language"})

(def PhilippineLanguages
  {:db/ident :lcc-639-2/PhilippineLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Philippine languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "philippines, langues"},
   :rdf/type #{:lcc-lr/RemainderGroup :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Philippine languages",
   :skos/definition "Philippine languages remainder group"})

(def Phoenician
  {:db/ident :lcc-639-2/Phoenician,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Phoenician"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "phénicien"},
   :rdf/type #{:owl/NamedIndividual :lcc-lr/AncientLanguage
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Phoenician",
   :skos/definition "Phoenician language"})

(def Pohnpeian
  {:db/ident :lcc-639-2/Pohnpeian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Pohnpeian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "pohnpei"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Pohnpeian",
   :skos/definition "Pohnpeian language"})

(def PrakritLanguages
  {:db/ident :lcc-639-2/PrakritLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Prakrit languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "prâkrit, langues"},
   :rdf/type #{:lcc-lr/LanguageFamily :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Prakrit languages",
   :skos/definition "Prakrit languages family"})

(def Rajasthani
  {:db/ident :lcc-639-2/Rajasthani,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Rajasthani"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "rajasthani"},
   :rdf/type #{:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Rajasthani",
   :skos/definition "Language code for Rajasthani"})

(def Rapanui
  {:db/ident :lcc-639-2/Rapanui,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Rapanui"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "rapanui"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Rapanui",
   :skos/definition "Rapanui language"})

(def Rarotongan
  {:db/ident :lcc-639-2/Rarotongan,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "Rarotongan"}
                            {:rdf/language "en",
                             :rdf/value    "Cook Islands Maori"}},
   :lcc-lr/hasFrenchName #{{:rdf/language "fr",
                            :rdf/value    "rarotonga"}
                           {:rdf/language "fr",
                            :rdf/value    "maori des îles Cook"}},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Rarotongan",
   :skos/definition "Rarotongan language"})

(def RomanceLanguages
  {:db/ident :lcc-639-2/RomanceLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Romance languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "romanes, langues"},
   :rdf/type #{:lcc-lr/RemainderGroup :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Romance languages",
   :skos/definition "Romance languages remainder group"})

(def Romany
  {:db/ident :lcc-639-2/Romany,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Romany"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tsigane"},
   :rdf/type #{:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Romany",
   :skos/definition "Language code for Romany"})

(def SalishanLanguages
  {:db/ident :lcc-639-2/SalishanLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Salishan languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "salishennes, langues"},
   :rdf/type #{:lcc-lr/LanguageFamily :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Salishan languages",
   :skos/definition "Salishan languages family"})

(def SamaritanAramaic
  {:db/ident :lcc-639-2/SamaritanAramaic,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Samaritan Aramaic"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "samaritain"},
   :rdf/type #{:owl/NamedIndividual :lcc-lr/ExtinctLanguage
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Samaritan Aramaic",
   :skos/definition "Samaritan Aramaic language"})

(def SamiLanguages
  {:db/ident :lcc-639-2/SamiLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Sami languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sames, langues"},
   :rdf/type #{:lcc-lr/RemainderGroup :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Sami languages",
   :skos/definition "Sami languages remainder group"})

(def Sandawe
  {:db/ident :lcc-639-2/Sandawe,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Sandawe"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sandawe"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Sandawe",
   :skos/definition "Sandawe language"})

(def Santali
  {:db/ident :lcc-639-2/Santali,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Santali"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "santal"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Santali",
   :skos/definition "Santali language"})

(def Sasak
  {:db/ident :lcc-639-2/Sasak,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Sasak"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sasak"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Sasak",
   :skos/definition "Sasak language"})

(def Scots
  {:db/ident :lcc-639-2/Scots,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Scots"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "écossais"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Scots",
   :skos/definition "Scots language"})

(def Selkup
  {:db/ident :lcc-639-2/Selkup,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Selkup"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "selkoupe"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Selkup",
   :skos/definition "Selkup language"})

(def SemiticLanguages
  {:db/ident :lcc-639-2/SemiticLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Semitic languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sémitiques, langues"},
   :rdf/type #{:lcc-lr/RemainderGroup :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Semitic languages",
   :skos/definition "Semitic languages remainder group"})

(def Serer
  {:db/ident :lcc-639-2/Serer,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Serer"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sérère"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Serer",
   :skos/definition "Serer language"})

(def Shan
  {:db/ident :lcc-639-2/Shan,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Shan"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "chan"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Shan",
   :skos/definition "Shan language"})

(def Sicilian
  {:db/ident :lcc-639-2/Sicilian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Sicilian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sicilien"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Sicilian",
   :skos/definition "Sicilian language"})

(def Sidamo
  {:db/ident :lcc-639-2/Sidamo,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Sidamo"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sidamo"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Sidamo",
   :skos/definition "Sidamo language"})

(def SignLanguages
  {:db/ident :lcc-639-2/SignLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Sign languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "langues des signes"},
   :rdf/type #{:lcc-lr/LanguageFamily :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Sign languages",
   :skos/definition "Sign languages family"})

(def Siksika
  {:db/ident :lcc-639-2/Siksika,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Siksika"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "blackfoot"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Siksika",
   :skos/definition "Siksika language"})

(def SinoTibetanLanguages
  {:db/ident :lcc-639-2/SinoTibetanLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Sino-Tibetan languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sino-tibétaines, langues"},
   :rdf/type #{:lcc-lr/RemainderGroup :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Sino-Tibetan languages",
   :skos/definition "Sino-Tibetan languages remainder group"})

(def SiouanLanguages
  {:db/ident :lcc-639-2/SiouanLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Siouan languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sioux, langues"},
   :rdf/type #{:lcc-lr/LanguageFamily :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Siouan languages",
   :skos/definition "Siouan languages family"})

(def SkoltSami
  {:db/ident :lcc-639-2/SkoltSami,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Skolt Sami"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sami skolt"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Skolt Sami",
   :skos/definition "Skolt Sami language"})

(def SlaveAthapascan
  {:db/ident :lcc-639-2/SlaveAthapascan,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Slave (Athapascan)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "esclave (athapascan)"},
   :rdf/type #{:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Slave - Athapascan",
   :skos/definition "Language code for Slave (Athapascan)"})

(def SlavicLanguages
  {:db/ident :lcc-639-2/SlavicLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Slavic languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "slaves, langues"},
   :rdf/type #{:lcc-lr/RemainderGroup :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Slavic languages",
   :skos/definition "Slavic languages remainder group"})

(def Sogdian
  {:db/ident :lcc-639-2/Sogdian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Sogdian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sogdien"},
   :rdf/type #{:owl/NamedIndividual :lcc-lr/AncientLanguage
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Sogdian",
   :skos/definition "Sogdian language"})

(def SonghaiLanguages
  {:db/ident :lcc-639-2/SonghaiLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Songhai languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "songhai, autres langues"},
   :rdf/type #{:lcc-lr/LanguageFamily :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Songhai languages",
   :skos/definition "Songhai languages family"})

(def Soninke
  {:db/ident :lcc-639-2/Soninke,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Soninke"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "soninké"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Soninke",
   :skos/definition "Soninke language"})

(def SorbianLanguages
  {:db/ident :lcc-639-2/SorbianLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Sorbian languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sorabes, langues"},
   :rdf/type #{:lcc-lr/LanguageFamily :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Sorbian languages",
   :skos/definition "Sorbian languages family"})

(def SouthAmericanIndianLanguages
  {:db/ident :lcc-639-2/SouthAmericanIndianLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "South American Indian languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sud-amérindiennes, langues"},
   :rdf/type #{:lcc-lr/RemainderGroup :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "South American Indian languages",
   :skos/definition "South American Indian languages remainder group"})

(def SouthernAltai
  {:db/ident :lcc-639-2/SouthernAltai,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Southern Altai"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "altai du Sud"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Southern Altai",
   :skos/definition "Southern Altai language"})

(def SouthernSami
  {:db/ident :lcc-639-2/SouthernSami,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Southern Sami"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sami du Sud"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Southern Sami",
   :skos/definition "Southern Sami language"})

(def SrananTongo
  {:db/ident :lcc-639-2/SrananTongo,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Sranan Tongo"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sranan tongo"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Sranan Tongo",
   :skos/definition "Sranan Tongo language"})

(def StandardMoroccanTamazight
  {:db/ident :lcc-639-2/StandardMoroccanTamazight,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Standard Moroccan Tamazight"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "amazighe standard marocain"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Standard Moroccan Tamazight",
   :skos/definition "Standard Moroccan Tamazight language"})

(def Sukuma
  {:db/ident :lcc-639-2/Sukuma,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Sukuma"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sukuma"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Sukuma",
   :skos/definition "Sukuma language"})

(def Sumerian
  {:db/ident :lcc-639-2/Sumerian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Sumerian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "sumérien"},
   :rdf/type #{:owl/NamedIndividual :lcc-lr/AncientLanguage
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Sumerian",
   :skos/definition "Sumerian language"})

(def Susu
  {:db/ident :lcc-639-2/Susu,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Susu"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "soussou"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Susu",
   :skos/definition "Susu language"})

(def SwissGerman
  {:db/ident :lcc-639-2/SwissGerman,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "Alemannic"}
                            {:rdf/language "en",
                             :rdf/value    "Alsatian"}
                            {:rdf/language "en",
                             :rdf/value    "Swiss German"}},
   :lcc-lr/hasFrenchName #{{:rdf/language "fr",
                            :rdf/value    "alsacien"}
                           {:rdf/language "fr",
                            :rdf/value    "suisse alémanique"}
                           {:rdf/language "fr",
                            :rdf/value    "alémanique"}},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Swiss German",
   :skos/definition "Swiss German language"})

(def Syriac
  {:db/ident :lcc-639-2/Syriac,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Syriac"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "syriaque"},
   :rdf/type #{:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Syriac",
   :skos/definition "Language code for Syriac"})

(def TaiLanguages
  {:db/ident :lcc-639-2/TaiLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tai languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tai, langues"},
   :rdf/type #{:lcc-lr/RemainderGroup :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Tai languages",
   :skos/definition "Tai languages remainder group"})

(def Tamashek
  {:db/ident :lcc-639-2/Tamashek,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tamashek"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tamacheq"},
   :rdf/type #{:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Tamashek",
   :skos/definition "Language code for Tamashek"})

(def Tereno
  {:db/ident :lcc-639-2/Tereno,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tereno"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tereno"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Tereno",
   :skos/definition "Tereno language"})

(def Tetum
  {:db/ident :lcc-639-2/Tetum,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tetum"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tetum"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Tetum",
   :skos/definition "Tetum language"})

(def Tigre
  {:db/ident :lcc-639-2/Tigre,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tigre"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tigré"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Tigre",
   :skos/definition "Tigre language"})

(def Timne
  {:db/ident :lcc-639-2/Timne,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Timne"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "temne"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Timne",
   :skos/definition "Timne language"})

(def Tiv
  {:db/ident :lcc-639-2/Tiv,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tiv"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tiv"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Tiv",
   :skos/definition "Tiv language"})

(def Tlingit
  {:db/ident :lcc-639-2/Tlingit,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tlingit"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tlingit"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Tlingit",
   :skos/definition "Tlingit language"})

(def TokPisin
  {:db/ident :lcc-639-2/TokPisin,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tok Pisin"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tok pisin"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Tok Pisin",
   :skos/definition "Tok Pisin language"})

(def Tokelau
  {:db/ident :lcc-639-2/Tokelau,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tokelau"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tokelau"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Tokelau",
   :skos/definition "Tokelau language"})

(def TongaNyasa
  {:db/ident :lcc-639-2/TongaNyasa,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tonga (Nyasa)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tonga (Nyasa)"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Tonga Nyasa",
   :skos/definition "Tonga Nyasa language"})

(def Tsimshian
  {:db/ident :lcc-639-2/Tsimshian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tsimshian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tsimshian"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Tsimshian",
   :skos/definition "Tsimshian language"})

(def Tumbuka
  {:db/ident :lcc-639-2/Tumbuka,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tumbuka"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tumbuka"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Tumbuka",
   :skos/definition "Tumbuka language"})

(def TupiLanguages
  {:db/ident :lcc-639-2/TupiLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tupi languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tupi, langues"},
   :rdf/type #{:lcc-lr/LanguageFamily :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Tupi languages",
   :skos/definition "Tupi languages family"})

(def Tuvalu
  {:db/ident :lcc-639-2/Tuvalu,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tuvalu"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "tuvalu"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Tuvalu",
   :skos/definition "Tuvalu language"})

(def Tuvinian
  {:db/ident :lcc-639-2/Tuvinian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Tuvinian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "touva"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Tuvinian",
   :skos/definition "Tuvinian language"})

(def Udmurt
  {:db/ident :lcc-639-2/Udmurt,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Udmurt"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "oudmourte"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Udmurt",
   :skos/definition "Udmurt language"})

(def Ugaritic
  {:db/ident :lcc-639-2/Ugaritic,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Ugaritic"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "ougaritique"},
   :rdf/type #{:owl/NamedIndividual :lcc-lr/AncientLanguage
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Ugaritic",
   :skos/definition "Ugaritic language"})

(def Umbundu
  {:db/ident :lcc-639-2/Umbundu,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Umbundu"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "umbundu"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Umbundu",
   :skos/definition "Umbundu language"})

(def UncodedLanguages
  {:db/ident :lcc-639-2/UncodedLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Uncoded languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "langues non codées"},
   :rdf/type #{:lcc-lr/SpecialPurposeLanguageConcept :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Uncoded languages",
   :skos/definition "Uncoded languages special purpose language concept"})

(def Undetermined
  {:db/ident :lcc-639-2/Undetermined,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Undetermined"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "indéterminée"},
   :rdf/type #{:lcc-lr/SpecialPurposeLanguageConcept :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Undetermined",
   :skos/definition "Undetermined special purpose language concept"})

(def UpperSorbian
  {:db/ident :lcc-639-2/UpperSorbian,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Upper Sorbian"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "haut-sorabe"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Upper Sorbian",
   :skos/definition "Upper Sorbian language"})

(def Vai
  {:db/ident :lcc-639-2/Vai,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Vai"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "vaï"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Vai",
   :skos/definition "Vai language"})

(def Votic
  {:db/ident :lcc-639-2/Votic,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Votic"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "vote"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Votic",
   :skos/definition "Votic language"})

(def WakashanLanguages
  {:db/ident :lcc-639-2/WakashanLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Wakashan languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "wakashanes, langues"},
   :rdf/type #{:lcc-lr/LanguageFamily :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Wakashan languages",
   :skos/definition "Wakashan languages family"})

(def Waray
  {:db/ident :lcc-639-2/Waray,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Waray (Philippines)"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "waray"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Waray",
   :skos/definition "Waray language"})

(def Washo
  {:db/ident :lcc-639-2/Washo,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Washo"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "washo"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Washo",
   :skos/definition "Washo language"})

(def Wolaitta
  {:db/ident :lcc-639-2/Wolaitta,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "Wolaitta"}
                            {:rdf/language "en",
                             :rdf/value    "Wolaytta"}},
   :lcc-lr/hasFrenchName #{{:rdf/language "fr",
                            :rdf/value    "wolaytta"}
                           {:rdf/language "fr",
                            :rdf/value    "wolaitta"}},
   :lcc-lr/hasGermanName {:rdf/language "ge",
                          :rdf/value    "Walamo-Sprache"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Wolaitta",
   :skos/definition "Wolaitta language"})

(def Yakut
  {:db/ident :lcc-639-2/Yakut,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Yakut"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "iakoute"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Yakut",
   :skos/definition "Yakut language"})

(def Yao
  {:db/ident :lcc-639-2/Yao,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Yao"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "yao"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Yao",
   :skos/definition "Yao language"})

(def Yapese
  {:db/ident :lcc-639-2/Yapese,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Yapese"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "yapois"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Yapese",
   :skos/definition "Yapese language"})

(def YupikLanguages
  {:db/ident :lcc-639-2/YupikLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Yupik languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "yupik, langues"},
   :rdf/type #{:lcc-lr/LanguageFamily :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Yupik languages",
   :skos/definition "Yupik languages family"})

(def ZandeLanguages
  {:db/ident :lcc-639-2/ZandeLanguages,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Zande languages"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "zandé, langues"},
   :rdf/type #{:lcc-lr/LanguageFamily :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Zande languages",
   :skos/definition "Zande languages family"})

(def Zapotec
  {:db/ident :lcc-639-2/Zapotec,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Zapotec"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "zapotèque"},
   :rdf/type #{:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Zapotec",
   :skos/definition "Language code for Zapotec"})

(def Zaza
  {:db/ident :lcc-639-2/Zaza,
   :lcc-lr/hasEnglishName #{{:rdf/language "en",
                             :rdf/value    "Zazaki"}
                            {:rdf/language "en",
                             :rdf/value    "Zaza"}
                            {:rdf/language "en",
                             :rdf/value    "Dimili"}
                            {:rdf/language "en",
                             :rdf/value    "Kirdki"}
                            {:rdf/language "en",
                             :rdf/value    "Kirmanjki"}
                            {:rdf/language "en",
                             :rdf/value    "Dimli"}},
   :lcc-lr/hasFrenchName #{{:rdf/language "fr",
                            :rdf/value    "dimili"}
                           {:rdf/language "fr",
                            :rdf/value    "zazaki"}
                           {:rdf/language "fr",
                            :rdf/value    "kirmanjki"}
                           {:rdf/language "fr",
                            :rdf/value    "zaza"}
                           {:rdf/language "fr",
                            :rdf/value    "kirdki"}
                           {:rdf/language "fr",
                            :rdf/value    "dimli"}},
   :rdf/type #{:lcc-lr/Macrolanguage :lcc-lr/LivingLanguage
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Zaza",
   :skos/definition "Language code for Zaza"})

(def Zenaga
  {:db/ident :lcc-639-2/Zenaga,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Zenaga"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "zenaga"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Zenaga",
   :skos/definition "Zenaga language"})

(def Zuni
  {:db/ident :lcc-639-2/Zuni,
   :lcc-lr/hasEnglishName {:rdf/language "en",
                           :rdf/value    "Zuni"},
   :lcc-lr/hasFrenchName {:rdf/language "fr",
                          :rdf/value    "zuni"},
   :rdf/type #{:lcc-lr/LivingLanguage :owl/NamedIndividual
               :lcc-lr/IndividualLanguage},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "Zuni",
   :skos/definition "Zuni language"})

(def aar
  {:db/ident :lcc-639-2/aar,
   :lcc-lr/denotes :lcc-639-1/Afar,
   :lcc-lr/hasTag "aar",
   :lcc-lr/identifies :lcc-639-1/Afar,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "aar",
   :skos/definition "Alpha-3 language code for Afar"})

(def abk
  {:db/ident :lcc-639-2/abk,
   :lcc-lr/denotes :lcc-639-1/Abkhazian,
   :lcc-lr/hasTag "abk",
   :lcc-lr/identifies :lcc-639-1/Abkhazian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "abk",
   :skos/definition "Alpha-3 language code for Abkhazian"})

(def ace
  {:db/ident :lcc-639-2/ace,
   :lcc-lr/denotes :lcc-639-2/Achinese,
   :lcc-lr/hasTag "ace",
   :lcc-lr/identifies :lcc-639-2/Achinese,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "ace",
   :skos/definition "Alpha-3 language code for Achinese"})

(def ach
  {:db/ident :lcc-639-2/ach,
   :lcc-lr/denotes :lcc-639-2/Acoli,
   :lcc-lr/hasTag "ach",
   :lcc-lr/identifies :lcc-639-2/Acoli,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "ach",
   :skos/definition "Alpha-3 language code for Acoli"})

(def ada
  {:db/ident :lcc-639-2/ada,
   :lcc-lr/denotes :lcc-639-2/Adangme,
   :lcc-lr/hasTag "ada",
   :lcc-lr/identifies :lcc-639-2/Adangme,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "ada",
   :skos/definition "Alpha-3 language code for Adangme"})

(def ady
  {:db/ident :lcc-639-2/ady,
   :lcc-lr/denotes :lcc-639-2/Adyghe,
   :lcc-lr/hasTag "ady",
   :lcc-lr/identifies :lcc-639-2/Adyghe,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "ady",
   :skos/definition "Alpha-3 language code for Adygei, Adyghe"})

(def afa
  {:db/ident :lcc-639-2/afa,
   :lcc-lr/denotes :lcc-639-2/AfroAsiaticLanguages,
   :lcc-lr/hasTag "afa",
   :lcc-lr/identifies :lcc-639-2/AfroAsiaticLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "afa",
   :skos/definition "Alpha-3 language code for Afro-Asiatic languages"})

(def afh
  {:db/ident :lcc-639-2/afh,
   :lcc-lr/denotes :lcc-639-2/Afrihili,
   :lcc-lr/hasTag "afh",
   :lcc-lr/identifies :lcc-639-2/Afrihili,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "afh",
   :skos/definition "Alpha-3 language code for Afrihili"})

(def afr
  {:db/ident :lcc-639-2/afr,
   :lcc-lr/denotes :lcc-639-1/Afrikaans,
   :lcc-lr/hasTag "afr",
   :lcc-lr/identifies :lcc-639-1/Afrikaans,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "afr",
   :skos/definition "Alpha-3 language code for Afrikaans"})

(def ain
  {:db/ident :lcc-639-2/ain,
   :lcc-lr/denotes :lcc-639-2/Ainu,
   :lcc-lr/hasTag "ain",
   :lcc-lr/identifies :lcc-639-2/Ainu,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "ain",
   :skos/definition "Alpha-3 language code for Ainu"})

(def aka
  {:db/ident :lcc-639-2/aka,
   :lcc-lr/denotes :lcc-639-1/Akan,
   :lcc-lr/hasTag "aka",
   :lcc-lr/identifies :lcc-639-1/Akan,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "aka",
   :skos/definition "Alpha-3 language code for Akan"})

(def akk
  {:db/ident :lcc-639-2/akk,
   :lcc-lr/denotes :lcc-639-2/Akkadian,
   :lcc-lr/hasTag "akk",
   :lcc-lr/identifies :lcc-639-2/Akkadian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "akk",
   :skos/definition "Alpha-3 language code for Akkadian"})

(def alb
  {:db/ident :lcc-639-2/alb,
   :lcc-lr/denotes :lcc-639-1/Albanian,
   :lcc-lr/hasTag "alb",
   :lcc-lr/identifies :lcc-639-1/Albanian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/BibliographicCode :lcc-lr/Alpha3Code
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "alb",
   :skos/definition "Alpha-3 bibliographic language code for Albanian"})

(def ale
  {:db/ident :lcc-639-2/ale,
   :lcc-lr/denotes :lcc-639-2/Aleut,
   :lcc-lr/hasTag "ale",
   :lcc-lr/identifies :lcc-639-2/Aleut,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "ale",
   :skos/definition "Alpha-3 language code for Aleut"})

(def alg
  {:db/ident :lcc-639-2/alg,
   :lcc-lr/denotes :lcc-639-2/AlgonquianLanguages,
   :lcc-lr/hasTag "alg",
   :lcc-lr/identifies :lcc-639-2/AlgonquianLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "alg",
   :skos/definition "Alpha-3 language code for Algonquian languages"})

(def alt
  {:db/ident :lcc-639-2/alt,
   :lcc-lr/denotes :lcc-639-2/SouthernAltai,
   :lcc-lr/hasTag "alt",
   :lcc-lr/identifies :lcc-639-2/SouthernAltai,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "alt",
   :skos/definition "Alpha-3 language code for Southern Altai"})

(def amh
  {:db/ident :lcc-639-2/amh,
   :lcc-lr/denotes :lcc-639-1/Amharic,
   :lcc-lr/hasTag "amh",
   :lcc-lr/identifies :lcc-639-1/Amharic,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "amh",
   :skos/definition "Alpha-3 language code for Amharic"})

(def ang
  {:db/ident :lcc-639-2/ang,
   :lcc-lr/denotes :lcc-639-2/OldEnglish,
   :lcc-lr/hasTag "ang",
   :lcc-lr/identifies :lcc-639-2/OldEnglish,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "ang",
   :skos/definition "Alpha-3 language code for English, Old (ca. 450-1100)"})

(def anp
  {:db/ident :lcc-639-2/anp,
   :lcc-lr/denotes :lcc-639-2/Angika,
   :lcc-lr/hasTag "anp",
   :lcc-lr/identifies :lcc-639-2/Angika,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "anp",
   :skos/definition "Alpha-3 language code for Angika"})

(def apa
  {:db/ident :lcc-639-2/apa,
   :lcc-lr/denotes :lcc-639-2/ApacheLanguages,
   :lcc-lr/hasTag "apa",
   :lcc-lr/identifies :lcc-639-2/ApacheLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "apa",
   :skos/definition "Alpha-3 language code for Apache languages"})

(def ara
  {:db/ident :lcc-639-2/ara,
   :lcc-lr/denotes :lcc-639-1/Arabic,
   :lcc-lr/hasTag "ara",
   :lcc-lr/identifies :lcc-639-1/Arabic,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "ara",
   :skos/definition "Alpha-3 language code for Arabic"})

(def arc
  {:db/ident :lcc-639-2/arc,
   :lcc-lr/denotes :lcc-639-2/OfficialAramaic,
   :lcc-lr/hasTag "arc",
   :lcc-lr/identifies :lcc-639-2/OfficialAramaic,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "arc",
   :skos/definition "Alpha-3 language code for Official Aramaic"})

(def arg
  {:db/ident :lcc-639-2/arg,
   :lcc-lr/denotes :lcc-639-1/Aragonese,
   :lcc-lr/hasTag "arg",
   :lcc-lr/identifies :lcc-639-1/Aragonese,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "arg",
   :skos/definition "Alpha-3 language code for Aragonese"})

(def arm
  {:db/ident :lcc-639-2/arm,
   :lcc-lr/denotes :lcc-639-1/Armenian,
   :lcc-lr/hasTag "arm",
   :lcc-lr/identifies :lcc-639-1/Armenian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/BibliographicCode :lcc-lr/Alpha3Code
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "arm",
   :skos/definition "Alpha-3 bibliographic language code for Armenian"})

(def arn
  {:db/ident :lcc-639-2/arn,
   :lcc-lr/denotes :lcc-639-2/Mapudungun,
   :lcc-lr/hasTag "arn",
   :lcc-lr/identifies :lcc-639-2/Mapudungun,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "arn",
   :skos/definition "Alpha-3 language code for Mapudungun; Mapuche"})

(def arp
  {:db/ident :lcc-639-2/arp,
   :lcc-lr/denotes :lcc-639-2/Arapaho,
   :lcc-lr/hasTag "arp",
   :lcc-lr/identifies :lcc-639-2/Arapaho,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "arp",
   :skos/definition "Alpha-3 language code for Arapaho"})

(def art
  {:db/ident :lcc-639-2/art,
   :lcc-lr/denotes :lcc-639-2/ArtificialLanguages,
   :lcc-lr/hasTag "art",
   :lcc-lr/identifies :lcc-639-2/ArtificialLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "art",
   :skos/definition "Alpha-3 language code for Artificial languages"})

(def arw
  {:db/ident :lcc-639-2/arw,
   :lcc-lr/denotes :lcc-639-2/Arawak,
   :lcc-lr/hasTag "arw",
   :lcc-lr/identifies :lcc-639-2/Arawak,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "arw",
   :skos/definition "Alpha-3 language code for Arawak"})

(def asm
  {:db/ident :lcc-639-2/asm,
   :lcc-lr/denotes :lcc-639-1/Assamese,
   :lcc-lr/hasTag "asm",
   :lcc-lr/identifies :lcc-639-1/Assamese,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "asm",
   :skos/definition "Alpha-3 language code for Assamese"})

(def ast
  {:db/ident :lcc-639-2/ast,
   :lcc-lr/denotes :lcc-639-2/Asturian,
   :lcc-lr/hasTag "ast",
   :lcc-lr/identifies :lcc-639-2/Asturian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "ast",
   :skos/definition "Alpha-3 language code for Asturian; Bable"})

(def ath
  {:db/ident :lcc-639-2/ath,
   :lcc-lr/denotes :lcc-639-2/AthapascanLanguages,
   :lcc-lr/hasTag "ath",
   :lcc-lr/identifies :lcc-639-2/AthapascanLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "ath",
   :skos/definition "Alpha-3 language code for Athapascan languages"})

(def aus
  {:db/ident :lcc-639-2/aus,
   :lcc-lr/denotes :lcc-639-2/AustralianLanguages,
   :lcc-lr/hasTag "aus",
   :lcc-lr/identifies :lcc-639-2/AustralianLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "aus",
   :skos/definition "Alpha-3 language code for Australian languages"})

(def ava
  {:db/ident :lcc-639-2/ava,
   :lcc-lr/denotes :lcc-639-1/Avaric,
   :lcc-lr/hasTag "ava",
   :lcc-lr/identifies :lcc-639-1/Avaric,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "ava",
   :skos/definition "Alpha-3 language code for Avaric"})

(def ave
  {:db/ident :lcc-639-2/ave,
   :lcc-lr/denotes :lcc-639-1/Avestan,
   :lcc-lr/hasTag "ave",
   :lcc-lr/identifies :lcc-639-1/Avestan,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "ave",
   :skos/definition "Alpha-3 language code for Avestan"})

(def awa
  {:db/ident :lcc-639-2/awa,
   :lcc-lr/denotes :lcc-639-2/Awadhi,
   :lcc-lr/hasTag "awa",
   :lcc-lr/identifies :lcc-639-2/Awadhi,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "awa",
   :skos/definition "Alpha-3 language code for Awadhi"})

(def aym
  {:db/ident :lcc-639-2/aym,
   :lcc-lr/denotes :lcc-639-1/Aymara,
   :lcc-lr/hasTag "aym",
   :lcc-lr/identifies :lcc-639-1/Aymara,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "aym",
   :skos/definition "Alpha-3 language code for Aymara"})

(def aze
  {:db/ident :lcc-639-2/aze,
   :lcc-lr/denotes :lcc-639-1/Azerbaijani,
   :lcc-lr/hasTag "aze",
   :lcc-lr/identifies :lcc-639-1/Azerbaijani,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "aze",
   :skos/definition "Alpha-3 language code for Azerbaijani"})

(def bad
  {:db/ident :lcc-639-2/bad,
   :lcc-lr/denotes :lcc-639-2/BandaLanguages,
   :lcc-lr/hasTag "bad",
   :lcc-lr/identifies :lcc-639-2/BandaLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "bad",
   :skos/definition "Alpha-3 language code for Banda languages"})

(def bai
  {:db/ident :lcc-639-2/bai,
   :lcc-lr/denotes :lcc-639-2/BamilekeLanguages,
   :lcc-lr/hasTag "bai",
   :lcc-lr/identifies :lcc-639-2/BamilekeLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "bai",
   :skos/definition "Alpha-3 language code for Bamileke languages"})

(def bak
  {:db/ident :lcc-639-2/bak,
   :lcc-lr/denotes :lcc-639-1/Bashkir,
   :lcc-lr/hasTag "bak",
   :lcc-lr/identifies :lcc-639-1/Bashkir,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "bak",
   :skos/definition "Alpha-3 language code for Bashkir"})

(def bal
  {:db/ident :lcc-639-2/bal,
   :lcc-lr/denotes :lcc-639-2/Baluchi,
   :lcc-lr/hasTag "bal",
   :lcc-lr/identifies :lcc-639-2/Baluchi,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "bal",
   :skos/definition "Alpha-3 language code for Baluchi"})

(def bam
  {:db/ident :lcc-639-2/bam,
   :lcc-lr/denotes :lcc-639-1/Bambara,
   :lcc-lr/hasTag "bam",
   :lcc-lr/identifies :lcc-639-1/Bambara,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "bam",
   :skos/definition "Alpha-3 language code for Bambara"})

(def ban
  {:db/ident :lcc-639-2/ban,
   :lcc-lr/denotes :lcc-639-2/Balinese,
   :lcc-lr/hasTag "ban",
   :lcc-lr/identifies :lcc-639-2/Balinese,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "ban",
   :skos/definition "Alpha-3 language code for Balinese"})

(def baq
  {:db/ident :lcc-639-2/baq,
   :lcc-lr/denotes :lcc-639-1/Basque,
   :lcc-lr/hasTag "baq",
   :lcc-lr/identifies :lcc-639-1/Basque,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/BibliographicCode :lcc-lr/Alpha3Code
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "baq",
   :skos/definition "Alpha-3 bibliographic language code for Basque"})

(def bas
  {:db/ident :lcc-639-2/bas,
   :lcc-lr/denotes :lcc-639-2/Basa,
   :lcc-lr/hasTag "bas",
   :lcc-lr/identifies :lcc-639-2/Basa,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "bas",
   :skos/definition "Alpha-3 language code for Basa"})

(def bat
  {:db/ident :lcc-639-2/bat,
   :lcc-lr/denotes :lcc-639-2/BalticLanguages,
   :lcc-lr/hasTag "bat",
   :lcc-lr/identifies :lcc-639-2/BalticLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "bat",
   :skos/definition "Alpha-3 language code for Baltic languages"})

(def bej
  {:db/ident :lcc-639-2/bej,
   :lcc-lr/denotes :lcc-639-2/Beja,
   :lcc-lr/hasTag "bej",
   :lcc-lr/identifies :lcc-639-2/Beja,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "bej",
   :skos/definition "Alpha-3 language code for Beja"})

(def bel
  {:db/ident :lcc-639-2/bel,
   :lcc-lr/denotes :lcc-639-1/Belarusian,
   :lcc-lr/hasTag "bel",
   :lcc-lr/identifies :lcc-639-1/Belarusian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "bel",
   :skos/definition "Alpha-3 language code for Belarusian"})

(def bem
  {:db/ident :lcc-639-2/bem,
   :lcc-lr/denotes :lcc-639-2/Bemba,
   :lcc-lr/hasTag "bem",
   :lcc-lr/identifies :lcc-639-2/Bemba,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "bem",
   :skos/definition "Alpha-3 language code for Bemba"})

(def ben
  {:db/ident :lcc-639-2/ben,
   :lcc-lr/denotes :lcc-639-1/Bengali,
   :lcc-lr/hasTag "ben",
   :lcc-lr/identifies :lcc-639-1/Bengali,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "ben",
   :skos/definition "Alpha-3 language code for Bengali"})

(def ber
  {:db/ident :lcc-639-2/ber,
   :lcc-lr/denotes :lcc-639-2/BerberLanguages,
   :lcc-lr/hasTag "ber",
   :lcc-lr/identifies :lcc-639-2/BerberLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "ber",
   :skos/definition "Alpha-3 language code for Berber languages"})

(def bho
  {:db/ident :lcc-639-2/bho,
   :lcc-lr/denotes :lcc-639-2/Bhojpuri,
   :lcc-lr/hasTag "bho",
   :lcc-lr/identifies :lcc-639-2/Bhojpuri,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "bho",
   :skos/definition "Alpha-3 language code for Bhojpuri"})

(def bih
  {:db/ident :lcc-639-2/bih,
   :lcc-lr/denotes :lcc-639-1/BihariLanguages,
   :lcc-lr/hasTag "bih",
   :lcc-lr/identifies :lcc-639-1/BihariLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "bih",
   :skos/definition "Alpha-3 language code for Bihari languages"})

(def bik
  {:db/ident :lcc-639-2/bik,
   :lcc-lr/denotes :lcc-639-2/Bikol,
   :lcc-lr/hasTag "bik",
   :lcc-lr/identifies :lcc-639-2/Bikol,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "bik",
   :skos/definition "Alpha-3 language code for Bikol"})

(def bin
  {:db/ident :lcc-639-2/bin,
   :lcc-lr/denotes :lcc-639-2/Bini,
   :lcc-lr/hasTag "bin",
   :lcc-lr/identifies :lcc-639-2/Bini,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "bin",
   :skos/definition "Alpha-3 language code for Bini; Edo"})

(def bis
  {:db/ident :lcc-639-2/bis,
   :lcc-lr/denotes :lcc-639-1/Bislama,
   :lcc-lr/hasTag "bis",
   :lcc-lr/identifies :lcc-639-1/Bislama,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "bis",
   :skos/definition "Alpha-3 language code for Bislama"})

(def bla
  {:db/ident :lcc-639-2/bla,
   :lcc-lr/denotes :lcc-639-2/Siksika,
   :lcc-lr/hasTag "bla",
   :lcc-lr/identifies :lcc-639-2/Siksika,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "bla",
   :skos/definition "Alpha-3 language code for Siksika"})

(def bnt
  {:db/ident :lcc-639-2/bnt,
   :lcc-lr/denotes :lcc-639-2/BantuLanguages,
   :lcc-lr/hasTag "bnt",
   :lcc-lr/identifies :lcc-639-2/BantuLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "bnt",
   :skos/definition "Alpha-3 language code for Bantu languages"})

(def bod
  {:db/ident :lcc-639-2/bod,
   :lcc-lr/denotes :lcc-639-1/Tibetan,
   :lcc-lr/hasTag "bod",
   :lcc-lr/identifies :lcc-639-1/Tibetan,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :lcc-lr/TerminologyCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "bod",
   :skos/definition "Alpha-3 terminologic language code for Tibetan"})

(def bos
  {:db/ident :lcc-639-2/bos,
   :lcc-lr/denotes :lcc-639-1/Bosnian,
   :lcc-lr/hasTag "bos",
   :lcc-lr/identifies :lcc-639-1/Bosnian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "bos",
   :skos/definition "Alpha-3 language code for Bosnian"})

(def bra
  {:db/ident :lcc-639-2/bra,
   :lcc-lr/denotes :lcc-639-2/Braj,
   :lcc-lr/hasTag "bra",
   :lcc-lr/identifies :lcc-639-2/Braj,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "bra",
   :skos/definition "Alpha-3 language code for Braj"})

(def bre
  {:db/ident :lcc-639-2/bre,
   :lcc-lr/denotes :lcc-639-1/Breton,
   :lcc-lr/hasTag "bre",
   :lcc-lr/identifies :lcc-639-1/Breton,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "bre",
   :skos/definition "Alpha-3 language code for Breton"})

(def btk
  {:db/ident :lcc-639-2/btk,
   :lcc-lr/denotes :lcc-639-2/BatakLanguages,
   :lcc-lr/hasTag "btk",
   :lcc-lr/identifies :lcc-639-2/BatakLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "btk",
   :skos/definition "Alpha-3 language code for Batak languages"})

(def bua
  {:db/ident :lcc-639-2/bua,
   :lcc-lr/denotes :lcc-639-2/Buriat,
   :lcc-lr/hasTag "bua",
   :lcc-lr/identifies :lcc-639-2/Buriat,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "bua",
   :skos/definition "Alpha-3 language code for Buriat"})

(def bug
  {:db/ident :lcc-639-2/bug,
   :lcc-lr/denotes :lcc-639-2/Buginese,
   :lcc-lr/hasTag "bug",
   :lcc-lr/identifies :lcc-639-2/Buginese,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "bug",
   :skos/definition "Alpha-3 language code for Buginese"})

(def bul
  {:db/ident :lcc-639-2/bul,
   :lcc-lr/denotes :lcc-639-1/Bulgarian,
   :lcc-lr/hasTag "bul",
   :lcc-lr/identifies :lcc-639-1/Bulgarian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "bul",
   :skos/definition "Alpha-3 language code for Bulgarian"})

(def bur
  {:db/ident :lcc-639-2/bur,
   :lcc-lr/denotes :lcc-639-1/Burmese,
   :lcc-lr/hasTag "bur",
   :lcc-lr/identifies :lcc-639-1/Burmese,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/BibliographicCode :lcc-lr/Alpha3Code
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "bur",
   :skos/definition "Alpha-3 bibliographic language code for Burmese"})

(def byn
  {:db/ident :lcc-639-2/byn,
   :lcc-lr/denotes :lcc-639-2/Bilin,
   :lcc-lr/hasTag "byn",
   :lcc-lr/identifies :lcc-639-2/Bilin,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "byn",
   :skos/definition "Alpha-3 language code for Blin; Bilin"})

(def cad
  {:db/ident :lcc-639-2/cad,
   :lcc-lr/denotes :lcc-639-2/Caddo,
   :lcc-lr/hasTag "cad",
   :lcc-lr/identifies :lcc-639-2/Caddo,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "cad",
   :skos/definition "Alpha-3 language code for Caddo"})

(def cai
  {:db/ident :lcc-639-2/cai,
   :lcc-lr/denotes :lcc-639-2/CentralAmericanIndianLanguages,
   :lcc-lr/hasTag "cai",
   :lcc-lr/identifies :lcc-639-2/CentralAmericanIndianLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "cai",
   :skos/definition
   "Alpha-3 language code for Central American Indian languages"})

(def car
  {:db/ident :lcc-639-2/car,
   :lcc-lr/denotes :lcc-639-2/GalibiCarib,
   :lcc-lr/hasTag "car",
   :lcc-lr/identifies :lcc-639-2/GalibiCarib,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "car",
   :skos/definition "Alpha-3 language code for Galibi Carib\n  "})

(def cat
  {:db/ident :lcc-639-2/cat,
   :lcc-lr/denotes :lcc-639-1/Catalan,
   :lcc-lr/hasTag "cat",
   :lcc-lr/identifies :lcc-639-1/Catalan,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "cat",
   :skos/definition "Alpha-3 language code for Catalan; Valencian"})

(def cau
  {:db/ident :lcc-639-2/cau,
   :lcc-lr/denotes :lcc-639-2/CaucasianLanguages,
   :lcc-lr/hasTag "cau",
   :lcc-lr/identifies :lcc-639-2/CaucasianLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "cau",
   :skos/definition "Alpha-3 language code for Caucasian languages"})

(def ceb
  {:db/ident :lcc-639-2/ceb,
   :lcc-lr/denotes :lcc-639-2/Cebuano,
   :lcc-lr/hasTag "ceb",
   :lcc-lr/identifies :lcc-639-2/Cebuano,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "ceb",
   :skos/definition "Alpha-3 language code for Cebuano"})

(def cel
  {:db/ident :lcc-639-2/cel,
   :lcc-lr/denotes :lcc-639-2/CelticLanguages,
   :lcc-lr/hasTag "cel",
   :lcc-lr/identifies :lcc-639-2/CelticLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "cel",
   :skos/definition "Alpha-3 language code for Celtic languages"})

(def ces
  {:db/ident :lcc-639-2/ces,
   :lcc-lr/denotes :lcc-639-1/Czech,
   :lcc-lr/hasTag "ces",
   :lcc-lr/identifies :lcc-639-1/Czech,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :lcc-lr/TerminologyCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "ces",
   :skos/definition "Alpha-3 terminologic language code for Czech"})

(def cha
  {:db/ident :lcc-639-2/cha,
   :lcc-lr/denotes :lcc-639-1/Chamorro,
   :lcc-lr/hasTag "cha",
   :lcc-lr/identifies :lcc-639-1/Chamorro,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "cha",
   :skos/definition "Alpha-3 language code for Chamorro"})

(def chb
  {:db/ident :lcc-639-2/chb,
   :lcc-lr/denotes :lcc-639-2/Chibcha,
   :lcc-lr/hasTag "chb",
   :lcc-lr/identifies :lcc-639-2/Chibcha,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "chb",
   :skos/definition "Alpha-3 language code for Chibcha"})

(def che
  {:db/ident :lcc-639-2/che,
   :lcc-lr/denotes :lcc-639-1/Chechen,
   :lcc-lr/hasTag "che",
   :lcc-lr/identifies :lcc-639-1/Chechen,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "che",
   :skos/definition "Alpha-3 language code for Chechen"})

(def chg
  {:db/ident :lcc-639-2/chg,
   :lcc-lr/denotes :lcc-639-2/Chagatai,
   :lcc-lr/hasTag "chg",
   :lcc-lr/identifies :lcc-639-2/Chagatai,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "chg",
   :skos/definition "Alpha-3 language code for Chagatai\n  "})

(def chi
  {:db/ident :lcc-639-2/chi,
   :lcc-lr/denotes :lcc-639-1/Chinese,
   :lcc-lr/hasTag "chi",
   :lcc-lr/identifies :lcc-639-1/Chinese,
   :rdf/type #{:lcc-lr/BibliographicCode :lcc-lr/Alpha3Code
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "chi",
   :skos/definition "Alpha-3 bibliographic language code for Chinese"})

(def chk
  {:db/ident :lcc-639-2/chk,
   :lcc-lr/denotes :lcc-639-2/Chuukese,
   :lcc-lr/hasTag "chk",
   :lcc-lr/identifies :lcc-639-2/Chuukese,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "chk",
   :skos/definition "Alpha-3 language code for Chuukese\n  "})

(def chm
  {:db/ident :lcc-639-2/chm,
   :lcc-lr/denotes :lcc-639-2/Mari,
   :lcc-lr/hasTag "chm",
   :lcc-lr/identifies :lcc-639-2/Mari,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "chm",
   :skos/definition "Alpha-3 language code for Mari"})

(def chn
  {:db/ident :lcc-639-2/chn,
   :lcc-lr/denotes :lcc-639-2/ChinookJargon,
   :lcc-lr/hasTag "chn",
   :lcc-lr/identifies :lcc-639-2/ChinookJargon,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "chn",
   :skos/definition "Alpha-3 language code for Chinook jargon\n  "})

(def cho
  {:db/ident :lcc-639-2/cho,
   :lcc-lr/denotes :lcc-639-2/Choctaw,
   :lcc-lr/hasTag "cho",
   :lcc-lr/identifies :lcc-639-2/Choctaw,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "cho",
   :skos/definition "Alpha-3 language code for Choctaw"})

(def chp
  {:db/ident :lcc-639-2/chp,
   :lcc-lr/denotes :lcc-639-2/Chipewyan,
   :lcc-lr/hasTag "chp",
   :lcc-lr/identifies :lcc-639-2/Chipewyan,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "chp",
   :skos/definition "Alpha-3 language code for Chipewyan"})

(def chr
  {:db/ident :lcc-639-2/chr,
   :lcc-lr/denotes :lcc-639-2/Cherokee,
   :lcc-lr/hasTag "chr",
   :lcc-lr/identifies :lcc-639-2/Cherokee,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "chr",
   :skos/definition "Alpha-3 language code for Cherokee"})

(def chu
  {:db/ident :lcc-639-2/chu,
   :lcc-lr/denotes :lcc-639-1/ChurchSlavic,
   :lcc-lr/hasTag "chu",
   :lcc-lr/identifies :lcc-639-1/ChurchSlavic,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "chu",
   :skos/definition "Alpha-3 language code for Church Slavic"})

(def chv
  {:db/ident :lcc-639-2/chv,
   :lcc-lr/denotes :lcc-639-1/Chuvash,
   :lcc-lr/hasTag "chv",
   :lcc-lr/identifies :lcc-639-1/Chuvash,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "chv",
   :skos/definition "Alpha-3 language code for Chuvash"})

(def chy
  {:db/ident :lcc-639-2/chy,
   :lcc-lr/denotes :lcc-639-2/Cheyenne,
   :lcc-lr/hasTag "chy",
   :lcc-lr/identifies :lcc-639-2/Cheyenne,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "chy",
   :skos/definition "Alpha-3 language code for Cheyenne"})

(def cmc
  {:db/ident :lcc-639-2/cmc,
   :lcc-lr/denotes :lcc-639-2/ChamicLanguages,
   :lcc-lr/hasTag "cmc",
   :lcc-lr/identifies :lcc-639-2/ChamicLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "cmc",
   :skos/definition "Alpha-3 language code for Chamic languages"})

(def cnr
  {:db/ident :lcc-639-2/cnr,
   :lcc-lr/denotes :lcc-639-2/Montenegrin,
   :lcc-lr/hasTag "cnr",
   :lcc-lr/identifies :lcc-639-2/Montenegrin,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "cnr",
   :skos/definition "Alpha-3 language code for Montenegrin"})

(def cop
  {:db/ident :lcc-639-2/cop,
   :lcc-lr/denotes :lcc-639-2/Coptic,
   :lcc-lr/hasTag "cop",
   :lcc-lr/identifies :lcc-639-2/Coptic,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "cop",
   :skos/definition "Alpha-3 language code for Coptic"})

(def cor
  {:db/ident :lcc-639-2/cor,
   :lcc-lr/denotes :lcc-639-1/Cornish,
   :lcc-lr/hasTag "cor",
   :lcc-lr/identifies :lcc-639-1/Cornish,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "cor",
   :skos/definition "Alpha-3 language code for Cornish"})

(def cos
  {:db/ident :lcc-639-2/cos,
   :lcc-lr/denotes :lcc-639-1/Corsican,
   :lcc-lr/hasTag "cos",
   :lcc-lr/identifies :lcc-639-1/Corsican,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "cos",
   :skos/definition "Alpha-3 language code for Corsican"})

(def cpe
  {:db/ident :lcc-639-2/cpe,
   :lcc-lr/denotes :lcc-639-2/CreolesAndPidginsEnglishBased,
   :lcc-lr/hasTag "cpe",
   :lcc-lr/identifies :lcc-639-2/CreolesAndPidginsEnglishBased,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "cpe",
   :skos/definition
   "Alpha-3 language code for Creoles and pidgins, English based"})

(def cpf
  {:db/ident :lcc-639-2/cpf,
   :lcc-lr/denotes :lcc-639-2/CreolesAndPidginsFrenchBased,
   :lcc-lr/hasTag "cpf",
   :lcc-lr/identifies :lcc-639-2/CreolesAndPidginsFrenchBased,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "cpf",
   :skos/definition
   "Alpha-3 language code for Creoles and pidgins, French-based"})

(def cpp
  {:db/ident :lcc-639-2/cpp,
   :lcc-lr/denotes :lcc-639-2/CreolesAndPidginsPortugueseBased,
   :lcc-lr/hasTag "cpp",
   :lcc-lr/identifies :lcc-639-2/CreolesAndPidginsPortugueseBased,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "cpp",
   :skos/definition
   "Alpha-3 language code for Creoles and pidgins, Portuguese-based"})

(def cre
  {:db/ident :lcc-639-2/cre,
   :lcc-lr/denotes :lcc-639-1/Cree,
   :lcc-lr/hasTag "cre",
   :lcc-lr/identifies :lcc-639-1/Cree,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "cre",
   :skos/definition "Alpha-3 language code for Cree"})

(def crh
  {:db/ident :lcc-639-2/crh,
   :lcc-lr/denotes :lcc-639-2/CrimeanTatar,
   :lcc-lr/hasTag "crh",
   :lcc-lr/identifies :lcc-639-2/CrimeanTatar,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "crh",
   :skos/definition "Alpha-3 language code for Crimean Tatar; Crimean Turkish"})

(def crp
  {:db/ident :lcc-639-2/crp,
   :lcc-lr/denotes :lcc-639-2/CreolesAndPidgins,
   :lcc-lr/hasTag "crp",
   :lcc-lr/identifies :lcc-639-2/CreolesAndPidgins,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "crp",
   :skos/definition "Alpha-3 language code for Creoles and pidgins"})

(def csb
  {:db/ident :lcc-639-2/csb,
   :lcc-lr/denotes :lcc-639-2/Kashubian,
   :lcc-lr/hasTag "csb",
   :lcc-lr/identifies :lcc-639-2/Kashubian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "csb",
   :skos/definition "Alpha-3 language code for Kashubian"})

(def cus
  {:db/ident :lcc-639-2/cus,
   :lcc-lr/denotes :lcc-639-2/CushiticLanguages,
   :lcc-lr/hasTag "cus",
   :lcc-lr/identifies :lcc-639-2/CushiticLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "cus",
   :skos/definition "Alpha-3 language code for Cushitic languages"})

(def cym
  {:db/ident :lcc-639-2/cym,
   :lcc-lr/denotes :lcc-639-1/Welsh,
   :lcc-lr/hasTag "cym",
   :lcc-lr/identifies :lcc-639-1/Welsh,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :lcc-lr/TerminologyCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "cym",
   :skos/definition "Alpha-3 terminologic language code for Welsh"})

(def cze
  {:db/ident :lcc-639-2/cze,
   :lcc-lr/denotes :lcc-639-1/Czech,
   :lcc-lr/hasTag "cze",
   :lcc-lr/identifies :lcc-639-1/Czech,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/BibliographicCode :lcc-lr/Alpha3Code
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "cze",
   :skos/definition "Alpha-3 bibliographic language code for Czech"})

(def dak
  {:db/ident :lcc-639-2/dak,
   :lcc-lr/denotes :lcc-639-2/Dakota,
   :lcc-lr/hasTag "dak",
   :lcc-lr/identifies :lcc-639-2/Dakota,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "dak",
   :skos/definition "Alpha-3 language code for Dakota"})

(def dan
  {:db/ident :lcc-639-2/dan,
   :lcc-lr/denotes :lcc-639-1/Danish,
   :lcc-lr/hasTag "dan",
   :lcc-lr/identifies :lcc-639-1/Danish,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "dan",
   :skos/definition "Alpha-3 language code for Danish"})

(def dar
  {:db/ident :lcc-639-2/dar,
   :lcc-lr/denotes :lcc-639-2/Dargwa,
   :lcc-lr/hasTag "dar",
   :lcc-lr/identifies :lcc-639-2/Dargwa,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "dar",
   :skos/definition "Alpha-3 language code for Dargwa"})

(def day
  {:db/ident :lcc-639-2/day,
   :lcc-lr/denotes :lcc-639-2/LandDayakLanguages,
   :lcc-lr/hasTag "day",
   :lcc-lr/identifies :lcc-639-2/LandDayakLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "day",
   :skos/definition "Alpha-3 language code for Land Dayak languages"})

(def del
  {:db/ident :lcc-639-2/del,
   :lcc-lr/denotes :lcc-639-2/Delaware,
   :lcc-lr/hasTag "del",
   :lcc-lr/identifies :lcc-639-2/Delaware,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "del",
   :skos/definition "Alpha-3 language code for Delaware"})

(def den
  {:db/ident :lcc-639-2/den,
   :lcc-lr/denotes :lcc-639-2/SlaveAthapascan,
   :lcc-lr/hasTag "den",
   :lcc-lr/identifies :lcc-639-2/SlaveAthapascan,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "den",
   :skos/definition "Alpha-3 language code for Slave (Athapascan)"})

(def deu
  {:db/ident :lcc-639-2/deu,
   :lcc-lr/denotes :lcc-639-1/German,
   :lcc-lr/hasTag "deu",
   :lcc-lr/identifies :lcc-639-1/German,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :lcc-lr/TerminologyCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "deu",
   :skos/definition "Alpha-3 terminologic language code for German"})

(def dgr
  {:db/ident :lcc-639-2/dgr,
   :lcc-lr/denotes :lcc-639-2/Dogrib,
   :lcc-lr/hasTag "dgr",
   :lcc-lr/identifies :lcc-639-2/Dogrib,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "dgr",
   :skos/definition "Alpha-3 language code for Dogrib"})

(def din
  {:db/ident :lcc-639-2/din,
   :lcc-lr/denotes :lcc-639-2/Dinka,
   :lcc-lr/hasTag "din",
   :lcc-lr/identifies :lcc-639-2/Dinka,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "din",
   :skos/definition "Alpha-3 language code for Dinka"})

(def div
  {:db/ident :lcc-639-2/div,
   :lcc-lr/denotes :lcc-639-1/Dhivehi,
   :lcc-lr/hasTag "div",
   :lcc-lr/identifies :lcc-639-1/Dhivehi,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "div",
   :skos/definition "Alpha-3 language code for Divehi; Dhivehi; Maldivian"})

(def doi
  {:db/ident :lcc-639-2/doi,
   :lcc-lr/denotes :lcc-639-2/Dogri,
   :lcc-lr/hasTag "doi",
   :lcc-lr/identifies :lcc-639-2/Dogri,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "doi",
   :skos/definition "Alpha-3 language code for Dogri"})

(def dra
  {:db/ident :lcc-639-2/dra,
   :lcc-lr/denotes :lcc-639-2/DravidianLanguages,
   :lcc-lr/hasTag "dra",
   :lcc-lr/identifies :lcc-639-2/DravidianLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "dra",
   :skos/definition "Alpha-3 language code for Dravidian languages"})

(def dsb
  {:db/ident :lcc-639-2/dsb,
   :lcc-lr/denotes :lcc-639-2/LowerSorbian,
   :lcc-lr/hasTag "dsb",
   :lcc-lr/identifies :lcc-639-2/LowerSorbian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "dsb",
   :skos/definition "Alpha-3 language code for Lower Sorbian"})

(def dua
  {:db/ident :lcc-639-2/dua,
   :lcc-lr/denotes :lcc-639-2/Duala,
   :lcc-lr/hasTag "dua",
   :lcc-lr/identifies :lcc-639-2/Duala,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "dua",
   :skos/definition "Alpha-3 language code for Duala"})

(def dum
  {:db/ident :lcc-639-2/dum,
   :lcc-lr/denotes :lcc-639-2/MiddleDutch,
   :lcc-lr/hasTag "dum",
   :lcc-lr/identifies :lcc-639-2/MiddleDutch,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "dum",
   :skos/definition
   "Alpha-3 language code for Dutch, Middle (ca. 1050-1350)\n  "})

(def dut
  {:db/ident :lcc-639-2/dut,
   :lcc-lr/denotes :lcc-639-1/Dutch,
   :lcc-lr/hasTag "dut",
   :lcc-lr/identifies :lcc-639-1/Dutch,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/BibliographicCode :lcc-lr/Alpha3Code
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "dut",
   :skos/definition "Alpha-3 bibliographic language code for Dutch; Flemish"})

(def dyu
  {:db/ident :lcc-639-2/dyu,
   :lcc-lr/denotes :lcc-639-2/Dyula,
   :lcc-lr/hasTag "dyu",
   :lcc-lr/identifies :lcc-639-2/Dyula,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "dyu",
   :skos/definition "Alpha-3 language code for Dyula"})

(def dzo
  {:db/ident :lcc-639-2/dzo,
   :lcc-lr/denotes :lcc-639-1/Dzongkha,
   :lcc-lr/hasTag "dzo",
   :lcc-lr/identifies :lcc-639-1/Dzongkha,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "dzo",
   :skos/definition "Alpha-3 language code for Dzongkha"})

(def efi
  {:db/ident :lcc-639-2/efi,
   :lcc-lr/denotes :lcc-639-2/Efik,
   :lcc-lr/hasTag "efi",
   :lcc-lr/identifies :lcc-639-2/Efik,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "efi",
   :skos/definition "Alpha-3 language code for Efik"})

(def egy
  {:db/ident :lcc-639-2/egy,
   :lcc-lr/denotes :lcc-639-2/AncientEgyptian,
   :lcc-lr/hasTag "egy",
   :lcc-lr/identifies :lcc-639-2/AncientEgyptian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "egy",
   :skos/definition "Alpha-3 language code for Egyptian (Ancient)"})

(def eka
  {:db/ident :lcc-639-2/eka,
   :lcc-lr/denotes :lcc-639-2/Ekajuk,
   :lcc-lr/hasTag "eka",
   :lcc-lr/identifies :lcc-639-2/Ekajuk,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "eka",
   :skos/definition "Alpha-3 language code for Ekajuk"})

(def ell
  {:db/ident :lcc-639-2/ell,
   :lcc-lr/denotes :lcc-639-1/ModernGreek,
   :lcc-lr/hasTag "ell",
   :lcc-lr/identifies :lcc-639-1/ModernGreek,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :lcc-lr/TerminologyCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "ell",
   :skos/definition
   "Alpha-3 terminologic language code for Greek, Modern (post 1453)"})

(def elx
  {:db/ident :lcc-639-2/elx,
   :lcc-lr/denotes :lcc-639-2/Elamite,
   :lcc-lr/hasTag "elx",
   :lcc-lr/identifies :lcc-639-2/Elamite,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "elx",
   :skos/definition "Alpha-3 language code for Elamite"})

(def eng
  {:db/ident :lcc-639-2/eng,
   :lcc-lr/denotes :lcc-639-1/English,
   :lcc-lr/hasTag "eng",
   :lcc-lr/identifies :lcc-639-1/English,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "eng",
   :skos/definition "Alpha-3 language code for English"})

(def enm
  {:db/ident :lcc-639-2/enm,
   :lcc-lr/denotes :lcc-639-2/MiddleEnglish,
   :lcc-lr/hasTag "enm",
   :lcc-lr/identifies :lcc-639-2/MiddleEnglish,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "enm",
   :skos/definition "Alpha-3 language code for English, Middle (1100-1500)"})

(def epo
  {:db/ident :lcc-639-2/epo,
   :lcc-lr/denotes :lcc-639-1/Esperanto,
   :lcc-lr/hasTag "epo",
   :lcc-lr/identifies :lcc-639-1/Esperanto,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "epo",
   :skos/definition "Alpha-3 language code for Esperanto"})

(def est
  {:db/ident :lcc-639-2/est,
   :lcc-lr/denotes :lcc-639-1/Estonian,
   :lcc-lr/hasTag "est",
   :lcc-lr/identifies :lcc-639-1/Estonian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "est",
   :skos/definition "Alpha-3 language code for Estonian"})

(def eus
  {:db/ident :lcc-639-2/eus,
   :lcc-lr/denotes :lcc-639-1/Basque,
   :lcc-lr/hasTag "eus",
   :lcc-lr/identifies :lcc-639-1/Basque,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :lcc-lr/TerminologyCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "eus",
   :skos/definition "Alpha-3 terminologic language code for Basque"})

(def ewe_1
  {:db/ident :lcc-639-2/ewe_1,
   :lcc-lr/denotes :lcc-639-1/Ewe,
   :lcc-lr/hasTag "ewe",
   :lcc-lr/identifies :lcc-639-1/Ewe,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "ewe",
   :skos/definition "Alpha-3 language code for Ewe"})

(def ewo
  {:db/ident :lcc-639-2/ewo,
   :lcc-lr/denotes :lcc-639-2/Ewondo,
   :lcc-lr/hasTag "ewo",
   :lcc-lr/identifies :lcc-639-2/Ewondo,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "ewo",
   :skos/definition "Alpha-3 language code for Ewondo"})

(def fan
  {:db/ident :lcc-639-2/fan,
   :lcc-lr/denotes :lcc-639-2/Fang,
   :lcc-lr/hasTag "fan",
   :lcc-lr/identifies :lcc-639-2/Fang,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "fan",
   :skos/definition "Alpha-3 language code for Fang"})

(def fao
  {:db/ident :lcc-639-2/fao,
   :lcc-lr/denotes :lcc-639-1/Faroese,
   :lcc-lr/hasTag "fao",
   :lcc-lr/identifies :lcc-639-1/Faroese,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "fao",
   :skos/definition "Alpha-3 language code for Faroese"})

(def fas
  {:db/ident :lcc-639-2/fas,
   :lcc-lr/denotes :lcc-639-1/Persian,
   :lcc-lr/hasTag "fas",
   :lcc-lr/identifies :lcc-639-1/Persian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :lcc-lr/TerminologyCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "fas",
   :skos/definition "Alpha-3 terminologic language code for Persian"})

(def fat
  {:db/ident :lcc-639-2/fat,
   :lcc-lr/denotes :lcc-639-2/Fanti,
   :lcc-lr/hasTag "fat",
   :lcc-lr/identifies :lcc-639-2/Fanti,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "fat",
   :skos/definition "Alpha-3 language code for Fanti"})

(def fij
  {:db/ident :lcc-639-2/fij,
   :lcc-lr/denotes :lcc-639-1/Fijian,
   :lcc-lr/hasTag "fij",
   :lcc-lr/identifies :lcc-639-1/Fijian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "fij",
   :skos/definition "Alpha-3 language code for Fijian"})

(def fil
  {:db/ident :lcc-639-2/fil,
   :lcc-lr/denotes :lcc-639-2/Filipino,
   :lcc-lr/hasTag "fil",
   :lcc-lr/identifies :lcc-639-2/Filipino,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "fil",
   :skos/definition "Alpha-3 language code for Filipino; Pilipino"})

(def fin
  {:db/ident :lcc-639-2/fin,
   :lcc-lr/denotes :lcc-639-1/Finnish,
   :lcc-lr/hasTag "fin",
   :lcc-lr/identifies :lcc-639-1/Finnish,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "fin",
   :skos/definition "Alpha-3 language code for Finnish"})

(def fiu
  {:db/ident :lcc-639-2/fiu,
   :lcc-lr/denotes :lcc-639-2/FinnoUgrianLanguages,
   :lcc-lr/hasTag "fiu",
   :lcc-lr/identifies :lcc-639-2/FinnoUgrianLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "fiu",
   :skos/definition "Alpha-3 language code for Finno-Ugrian languages"})

(def fon_1
  {:db/ident :lcc-639-2/fon_1,
   :lcc-lr/denotes :lcc-639-2/Fon,
   :lcc-lr/hasTag "fon",
   :lcc-lr/identifies :lcc-639-2/Fon,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "fon",
   :skos/definition "Alpha-3 language code for Fon"})

(def fra
  {:db/ident :lcc-639-2/fra,
   :lcc-lr/denotes :lcc-639-1/French,
   :lcc-lr/hasTag "fra",
   :lcc-lr/identifies :lcc-639-1/French,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :lcc-lr/TerminologyCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "fra",
   :skos/definition "Alpha-3 terminologic language code for French"})

(def fre
  {:db/ident :lcc-639-2/fre,
   :lcc-lr/denotes :lcc-639-1/French,
   :lcc-lr/hasTag "fre",
   :lcc-lr/identifies :lcc-639-1/French,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/BibliographicCode :lcc-lr/Alpha3Code
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "fre",
   :skos/definition "Alpha-3 bibliographic language code for French"})

(def frm
  {:db/ident :lcc-639-2/frm,
   :lcc-lr/denotes :lcc-639-2/MiddleFrench,
   :lcc-lr/hasTag "frm",
   :lcc-lr/identifies :lcc-639-2/MiddleFrench,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "frm",
   :skos/definition "Alpha-3 language code for French, Middle (ca. 1400-1600)"})

(def fro
  {:db/ident :lcc-639-2/fro,
   :lcc-lr/denotes :lcc-639-2/OldFrench,
   :lcc-lr/hasTag "fro",
   :lcc-lr/identifies :lcc-639-2/OldFrench,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "fro",
   :skos/definition "Alpha-3 language code for French, Old (842-ca.1400)"})

(def frr
  {:db/ident :lcc-639-2/frr,
   :lcc-lr/denotes :lcc-639-2/NorthernFrisian,
   :lcc-lr/hasTag "frr",
   :lcc-lr/identifies :lcc-639-2/NorthernFrisian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "frr",
   :skos/definition "Alpha-3 language code for Northern Frisian"})

(def frs
  {:db/ident :lcc-639-2/frs,
   :lcc-lr/denotes :lcc-639-2/EasternFrisian,
   :lcc-lr/hasTag "frs",
   :lcc-lr/identifies :lcc-639-2/EasternFrisian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "frs",
   :skos/definition "Alpha-3 language code for Eastern Frisian"})

(def fry
  {:db/ident :lcc-639-2/fry,
   :lcc-lr/denotes :lcc-639-1/WesternFrisian,
   :lcc-lr/hasTag "fry",
   :lcc-lr/identifies :lcc-639-1/WesternFrisian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "fry",
   :skos/definition "Alpha-3 language code for Western Frisian"})

(def ful
  {:db/ident :lcc-639-2/ful,
   :lcc-lr/denotes :lcc-639-1/Fulah,
   :lcc-lr/hasTag "ful",
   :lcc-lr/identifies :lcc-639-1/Fulah,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "ful",
   :skos/definition "Alpha-3 language code for Fulah"})

(def fur
  {:db/ident :lcc-639-2/fur,
   :lcc-lr/denotes :lcc-639-2/Friulian,
   :lcc-lr/hasTag "fur",
   :lcc-lr/identifies :lcc-639-2/Friulian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "fur",
   :skos/definition "Alpha-3 language code for Friulian"})

(def gaa
  {:db/ident :lcc-639-2/gaa,
   :lcc-lr/denotes :lcc-639-2/Ga,
   :lcc-lr/hasTag "gaa",
   :lcc-lr/identifies :lcc-639-2/Ga,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "gaa",
   :skos/definition "Alpha-3 language code for Ga"})

(def gay
  {:db/ident :lcc-639-2/gay,
   :lcc-lr/denotes :lcc-639-2/Gayo,
   :lcc-lr/hasTag "gay",
   :lcc-lr/identifies :lcc-639-2/Gayo,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "gay",
   :skos/definition "Alpha-3 language code for Gayo"})

(def gba
  {:db/ident :lcc-639-2/gba,
   :lcc-lr/denotes :lcc-639-2/Gbaya,
   :lcc-lr/hasTag "gba",
   :lcc-lr/identifies :lcc-639-2/Gbaya,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "gba",
   :skos/definition "Alpha-3 language code for Gbaya"})

(def gem
  {:db/ident :lcc-639-2/gem,
   :lcc-lr/denotes :lcc-639-2/GermanicLanguages,
   :lcc-lr/hasTag "gem",
   :lcc-lr/identifies :lcc-639-2/GermanicLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "gem",
   :skos/definition "Alpha-3 language code for Germanic languages"})

(def geo
  {:db/ident :lcc-639-2/geo,
   :lcc-lr/denotes :lcc-639-1/Georgian,
   :lcc-lr/hasTag "geo",
   :lcc-lr/identifies :lcc-639-1/Georgian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/BibliographicCode :lcc-lr/Alpha3Code
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "geo",
   :skos/definition "Alpha-3 bibliographic language code for Georgian"})

(def ger
  {:db/ident :lcc-639-2/ger,
   :lcc-lr/denotes :lcc-639-1/German,
   :lcc-lr/hasTag "ger",
   :lcc-lr/identifies :lcc-639-1/German,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/BibliographicCode :lcc-lr/Alpha3Code
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "ger",
   :skos/definition "Alpha-3 bibliographic language code for German"})

(def gez
  {:db/ident :lcc-639-2/gez,
   :lcc-lr/denotes :lcc-639-2/Geez,
   :lcc-lr/hasTag "gez",
   :lcc-lr/identifies :lcc-639-2/Geez,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "gez",
   :skos/definition "Alpha-3 language code for Geez"})

(def gil
  {:db/ident :lcc-639-2/gil,
   :lcc-lr/denotes :lcc-639-2/Gilbertese,
   :lcc-lr/hasTag "gil",
   :lcc-lr/identifies :lcc-639-2/Gilbertese,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "gil",
   :skos/definition "Alpha-3 language code for Gilbertese"})

(def gla
  {:db/ident :lcc-639-2/gla,
   :lcc-lr/denotes :lcc-639-1/ScottishGaelic,
   :lcc-lr/hasTag "gla",
   :lcc-lr/identifies :lcc-639-1/ScottishGaelic,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "gla",
   :skos/definition "Alpha-3 language code for Gaelic; Scottish Gaelic"})

(def gle
  {:db/ident :lcc-639-2/gle,
   :lcc-lr/denotes :lcc-639-1/Irish,
   :lcc-lr/hasTag "gle",
   :lcc-lr/identifies :lcc-639-1/Irish,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "gle",
   :skos/definition "Alpha-3 language code for Irish"})

(def glg
  {:db/ident :lcc-639-2/glg,
   :lcc-lr/denotes :lcc-639-1/Galician,
   :lcc-lr/hasTag "glg",
   :lcc-lr/identifies :lcc-639-1/Galician,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "glg",
   :skos/definition "Alpha-3 language code for Galician"})

(def glv
  {:db/ident :lcc-639-2/glv,
   :lcc-lr/denotes :lcc-639-1/Manx,
   :lcc-lr/hasTag "glv",
   :lcc-lr/identifies :lcc-639-1/Manx,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "glv",
   :skos/definition "Alpha-3 language code for Manx"})

(def gmh
  {:db/ident :lcc-639-2/gmh,
   :lcc-lr/denotes :lcc-639-2/MiddleHighGerman,
   :lcc-lr/hasTag "gmh",
   :lcc-lr/identifies :lcc-639-2/MiddleHighGerman,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "gmh",
   :skos/definition
   "Alpha-3 language code for German, Middle High (ca. 1050-1500)"})

(def goh
  {:db/ident :lcc-639-2/goh,
   :lcc-lr/denotes :lcc-639-2/OldHighGerman,
   :lcc-lr/hasTag "goh",
   :lcc-lr/identifies :lcc-639-2/OldHighGerman,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "goh",
   :skos/definition
   "Alpha-3 language code for German, Old High (ca. 750-1050)"})

(def gon
  {:db/ident :lcc-639-2/gon,
   :lcc-lr/denotes :lcc-639-2/Gondi,
   :lcc-lr/hasTag "gon",
   :lcc-lr/identifies :lcc-639-2/Gondi,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "gon",
   :skos/definition "Alpha-3 language code for Gondi"})

(def gor
  {:db/ident :lcc-639-2/gor,
   :lcc-lr/denotes :lcc-639-2/Gorontalo,
   :lcc-lr/hasTag "gor",
   :lcc-lr/identifies :lcc-639-2/Gorontalo,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "gor",
   :skos/definition "Alpha-3 language code for Gorontalo"})

(def got
  {:db/ident :lcc-639-2/got,
   :lcc-lr/denotes :lcc-639-2/Gothic,
   :lcc-lr/hasTag "got",
   :lcc-lr/identifies :lcc-639-2/Gothic,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "got",
   :skos/definition "Alpha-3 language code for Gothic"})

(def grb
  {:db/ident :lcc-639-2/grb,
   :lcc-lr/denotes :lcc-639-2/Grebo,
   :lcc-lr/hasTag "grb",
   :lcc-lr/identifies :lcc-639-2/Grebo,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "grb",
   :skos/definition "Alpha-3 language code for Grebo"})

(def grc
  {:db/ident :lcc-639-2/grc,
   :lcc-lr/denotes :lcc-639-2/AncientGreek,
   :lcc-lr/hasTag "grc",
   :lcc-lr/identifies :lcc-639-2/AncientGreek,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "grc",
   :skos/definition "Alpha-3 language code for Greek, Ancient (to 1453)"})

(def gre
  {:db/ident :lcc-639-2/gre,
   :lcc-lr/denotes :lcc-639-1/ModernGreek,
   :lcc-lr/hasTag "gre",
   :lcc-lr/identifies :lcc-639-1/ModernGreek,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/BibliographicCode :lcc-lr/Alpha3Code
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "gre",
   :skos/definition
   "Alpha-3 bibliographic language code for Greek, Modern (post 1453)"})

(def grn
  {:db/ident :lcc-639-2/grn,
   :lcc-lr/denotes :lcc-639-1/Guarani,
   :lcc-lr/hasTag "grn",
   :lcc-lr/identifies :lcc-639-1/Guarani,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "grn",
   :skos/definition "Alpha-3 language code for Guarani"})

(def gsw
  {:db/ident :lcc-639-2/gsw,
   :lcc-lr/denotes :lcc-639-2/SwissGerman,
   :lcc-lr/hasTag "gsw",
   :lcc-lr/identifies :lcc-639-2/SwissGerman,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "gsw",
   :skos/definition "Alpha-3 language code for Alemannic, Swiss German"})

(def guj
  {:db/ident :lcc-639-2/guj,
   :lcc-lr/denotes :lcc-639-1/Gujarati,
   :lcc-lr/hasTag "guj",
   :lcc-lr/identifies :lcc-639-1/Gujarati,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "guj",
   :skos/definition "Alpha-3 language code for Gujarati"})

(def gwi
  {:db/ident :lcc-639-2/gwi,
   :lcc-lr/denotes :lcc-639-2/Gwichin,
   :lcc-lr/hasTag "gwi",
   :lcc-lr/identifies :lcc-639-2/Gwichin,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "gwi",
   :skos/definition "Alpha-3 language code for Gwich'in"})

(def hai
  {:db/ident :lcc-639-2/hai,
   :lcc-lr/denotes :lcc-639-2/Haida,
   :lcc-lr/hasTag "hai",
   :lcc-lr/identifies :lcc-639-2/Haida,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "hai",
   :skos/definition "Alpha-3 language code for Haida"})

(def hat
  {:db/ident :lcc-639-2/hat,
   :lcc-lr/denotes :lcc-639-1/Haitian,
   :lcc-lr/hasTag "hat",
   :lcc-lr/identifies :lcc-639-1/Haitian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "hat",
   :skos/definition "Alpha-3 language code for Haitian; Haitian Creole"})

(def hau
  {:db/ident :lcc-639-2/hau,
   :lcc-lr/denotes :lcc-639-1/Hausa,
   :lcc-lr/hasTag "hau",
   :lcc-lr/identifies :lcc-639-1/Hausa,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "hau",
   :skos/definition "Alpha-3 language code for Hausa"})

(def haw
  {:db/ident :lcc-639-2/haw,
   :lcc-lr/denotes :lcc-639-2/Hawaiian,
   :lcc-lr/hasTag "haw",
   :lcc-lr/identifies :lcc-639-2/Hawaiian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "haw",
   :skos/definition "Alpha-3 language code for Hawaiian"})

(def heb
  {:db/ident :lcc-639-2/heb,
   :lcc-lr/denotes :lcc-639-1/Hebrew,
   :lcc-lr/hasTag "heb",
   :lcc-lr/identifies :lcc-639-1/Hebrew,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "heb",
   :skos/definition "Alpha-3 language code for Hebrew"})

(def her
  {:db/ident :lcc-639-2/her,
   :lcc-lr/denotes :lcc-639-1/Herero,
   :lcc-lr/hasTag "her",
   :lcc-lr/identifies :lcc-639-1/Herero,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "her",
   :skos/definition "Alpha-3 language code for Herero"})

(def hil
  {:db/ident :lcc-639-2/hil,
   :lcc-lr/denotes :lcc-639-2/Hiligaynon,
   :lcc-lr/hasTag "hil",
   :lcc-lr/identifies :lcc-639-2/Hiligaynon,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "hil",
   :skos/definition "Alpha-3 language code for Hiligaynon"})

(def him
  {:db/ident :lcc-639-2/him,
   :lcc-lr/denotes :lcc-639-2/HimachaliLanguages,
   :lcc-lr/hasTag "him",
   :lcc-lr/identifies :lcc-639-2/HimachaliLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "him",
   :skos/definition "Alpha-3 language code for Himachali languages"})

(def hin
  {:db/ident :lcc-639-2/hin,
   :lcc-lr/denotes :lcc-639-1/Hindi,
   :lcc-lr/hasTag "hin",
   :lcc-lr/identifies :lcc-639-1/Hindi,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "hin",
   :skos/definition "Alpha-3 language code for Hindi"})

(def hit
  {:db/ident :lcc-639-2/hit,
   :lcc-lr/denotes :lcc-639-2/Hittite,
   :lcc-lr/hasTag "hit",
   :lcc-lr/identifies :lcc-639-2/Hittite,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "hit",
   :skos/definition "Alpha-3 language code for Hittite"})

(def hmn
  {:db/ident :lcc-639-2/hmn,
   :lcc-lr/denotes :lcc-639-2/Hmong,
   :lcc-lr/hasTag "hmn",
   :lcc-lr/identifies :lcc-639-2/Hmong,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "hmn",
   :skos/definition "Alpha-3 language code for Hmong"})

(def hmo
  {:db/ident :lcc-639-2/hmo,
   :lcc-lr/denotes :lcc-639-1/HiriMotu,
   :lcc-lr/hasTag "hmo",
   :lcc-lr/identifies :lcc-639-1/HiriMotu,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "hmo",
   :skos/definition "Alpha-3 language code for Hiri Motu"})

(def hrv
  {:db/ident :lcc-639-2/hrv,
   :lcc-lr/denotes :lcc-639-1/Croatian,
   :lcc-lr/hasTag "hrv",
   :lcc-lr/identifies :lcc-639-1/Croatian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :lcc-lr/TerminologyCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "hrv",
   :skos/definition "Alpha-3 terminologic language code for Croatian"})

(def hsb
  {:db/ident :lcc-639-2/hsb,
   :lcc-lr/denotes :lcc-639-2/UpperSorbian,
   :lcc-lr/hasTag "hsb",
   :lcc-lr/identifies :lcc-639-2/UpperSorbian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "hsb",
   :skos/definition "Alpha-3 language code for Upper Sorbian"})

(def hun
  {:db/ident :lcc-639-2/hun,
   :lcc-lr/denotes :lcc-639-1/Hungarian,
   :lcc-lr/hasTag "hun",
   :lcc-lr/identifies :lcc-639-1/Hungarian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "hun",
   :skos/definition "Alpha-3 language code for Hungarian"})

(def hup
  {:db/ident :lcc-639-2/hup,
   :lcc-lr/denotes :lcc-639-2/Hupa,
   :lcc-lr/hasTag "hup",
   :lcc-lr/identifies :lcc-639-2/Hupa,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "hup",
   :skos/definition "Alpha-3 language code for Hupa"})

(def hye
  {:db/ident :lcc-639-2/hye,
   :lcc-lr/denotes :lcc-639-1/Armenian,
   :lcc-lr/hasTag "hye",
   :lcc-lr/identifies :lcc-639-1/Armenian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :lcc-lr/TerminologyCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "hye",
   :skos/definition "Alpha-3 terminologic language code for Armenian"})

(def iba
  {:db/ident :lcc-639-2/iba,
   :lcc-lr/denotes :lcc-639-2/Iban,
   :lcc-lr/hasTag "iba",
   :lcc-lr/identifies :lcc-639-2/Iban,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "iba",
   :skos/definition "Alpha-3 language code for Iban"})

(def ibo
  {:db/ident :lcc-639-2/ibo,
   :lcc-lr/denotes :lcc-639-1/Igbo,
   :lcc-lr/hasTag "ibo",
   :lcc-lr/identifies :lcc-639-1/Igbo,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "ibo",
   :skos/definition "Alpha-3 language code for Igbo"})

(def ice
  {:db/ident :lcc-639-2/ice,
   :lcc-lr/denotes :lcc-639-1/Icelandic,
   :lcc-lr/hasTag "ice",
   :lcc-lr/identifies :lcc-639-1/Icelandic,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/BibliographicCode :lcc-lr/Alpha3Code
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "ice",
   :skos/definition "Alpha-3 bibliographic language code for Icelandic"})

(def ido_1
  {:db/ident :lcc-639-2/ido_1,
   :lcc-lr/denotes :lcc-639-1/Ido,
   :lcc-lr/hasTag "ido",
   :lcc-lr/identifies :lcc-639-1/Ido,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "ido",
   :skos/definition "Alpha-3 language code for Ido"})

(def iii
  {:db/ident :lcc-639-2/iii,
   :lcc-lr/denotes :lcc-639-1/SichuanYi,
   :lcc-lr/hasTag "iii",
   :lcc-lr/identifies :lcc-639-1/SichuanYi,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "iii",
   :skos/definition "Alpha-3 language code for Sichuan Yi"})

(def ijo
  {:db/ident :lcc-639-2/ijo,
   :lcc-lr/denotes :lcc-639-2/IjoLanguages,
   :lcc-lr/hasTag "ijo",
   :lcc-lr/identifies :lcc-639-2/IjoLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "ijo",
   :skos/definition "Alpha-3 language code for Ijo languages"})

(def iku
  {:db/ident :lcc-639-2/iku,
   :lcc-lr/denotes :lcc-639-1/Inuktitut,
   :lcc-lr/hasTag "iku",
   :lcc-lr/identifies :lcc-639-1/Inuktitut,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "iku",
   :skos/definition "Alpha-3 language code for Inuktitut"})

(def ile
  {:db/ident :lcc-639-2/ile,
   :lcc-lr/denotes :lcc-639-1/Interlingue,
   :lcc-lr/hasTag "ile",
   :lcc-lr/identifies :lcc-639-1/Interlingue,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "ile",
   :skos/definition "Alpha-3 language code for Interlingue"})

(def ilo
  {:db/ident :lcc-639-2/ilo,
   :lcc-lr/denotes :lcc-639-2/Iloko,
   :lcc-lr/hasTag "ilo",
   :lcc-lr/identifies :lcc-639-2/Iloko,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "ilo",
   :skos/definition "Alpha-3 language code for Iloko"})

(def ina
  {:db/ident :lcc-639-2/ina,
   :lcc-lr/denotes :lcc-639-1/Interlingua,
   :lcc-lr/hasTag "ina",
   :lcc-lr/identifies :lcc-639-1/Interlingua,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "ina",
   :skos/definition
   "Alpha-3 language code for Interlingua (International Auxiliary Language Association)"})

(def inc
  {:db/ident :lcc-639-2/inc,
   :lcc-lr/denotes :lcc-639-2/IndicLanguages,
   :lcc-lr/hasTag "inc",
   :lcc-lr/identifies :lcc-639-2/IndicLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "inc",
   :skos/definition "Alpha-3 language code for Indic languages"})

(def ind
  {:db/ident :lcc-639-2/ind,
   :lcc-lr/denotes :lcc-639-1/Indonesian,
   :lcc-lr/hasTag "ind",
   :lcc-lr/identifies :lcc-639-1/Indonesian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "ind",
   :skos/definition "Alpha-3 language code for Indonesian"})

(def ine
  {:db/ident :lcc-639-2/ine,
   :lcc-lr/denotes :lcc-639-2/IndoEuropeanLanguages,
   :lcc-lr/hasTag "ine",
   :lcc-lr/identifies :lcc-639-2/IndoEuropeanLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "ine",
   :skos/definition "Alpha-3 language code for Indo-European languages"})

(def inh
  {:db/ident :lcc-639-2/inh,
   :lcc-lr/denotes :lcc-639-2/Ingush,
   :lcc-lr/hasTag "inh",
   :lcc-lr/identifies :lcc-639-2/Ingush,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "inh",
   :skos/definition "Alpha-3 language code for Ingush"})

(def ipk
  {:db/ident :lcc-639-2/ipk,
   :lcc-lr/denotes :lcc-639-1/Inupiaq,
   :lcc-lr/hasTag "ipk",
   :lcc-lr/identifies :lcc-639-1/Inupiaq,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "ipk",
   :skos/definition "Alpha-3 language code for Inupiaq"})

(def ira
  {:db/ident :lcc-639-2/ira,
   :lcc-lr/denotes :lcc-639-2/IranianLanguages,
   :lcc-lr/hasTag "ira",
   :lcc-lr/identifies :lcc-639-2/IranianLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "ira",
   :skos/definition "Alpha-3 language code for Iranian languages"})

(def iro
  {:db/ident :lcc-639-2/iro,
   :lcc-lr/denotes :lcc-639-2/IroquoianLanguages,
   :lcc-lr/hasTag "iro",
   :lcc-lr/identifies :lcc-639-2/IroquoianLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "iro",
   :skos/definition "Alpha-3 language code for Iroquoian languages"})

(def isl
  {:db/ident :lcc-639-2/isl,
   :lcc-lr/denotes :lcc-639-1/Icelandic,
   :lcc-lr/hasTag "isl",
   :lcc-lr/identifies :lcc-639-1/Icelandic,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :lcc-lr/TerminologyCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "isl",
   :skos/definition "Alpha-3 terminologic language code for Icelandic"})

(def ita
  {:db/ident :lcc-639-2/ita,
   :lcc-lr/denotes :lcc-639-1/Italian,
   :lcc-lr/hasTag "ita",
   :lcc-lr/identifies :lcc-639-1/Italian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "ita",
   :skos/definition "Alpha-3 language code for Italian"})

(def jav
  {:db/ident :lcc-639-2/jav,
   :lcc-lr/denotes :lcc-639-1/Javanese,
   :lcc-lr/hasTag "jav",
   :lcc-lr/identifies :lcc-639-1/Javanese,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "jav",
   :skos/definition "Alpha-3 language code for Javanese"})

(def jbo
  {:db/ident :lcc-639-2/jbo,
   :lcc-lr/denotes :lcc-639-2/Lojban,
   :lcc-lr/hasTag "jbo",
   :lcc-lr/identifies :lcc-639-2/Lojban,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "jbo",
   :skos/definition "Alpha-3 language code for Lojban"})

(def jpn
  {:db/ident :lcc-639-2/jpn,
   :lcc-lr/denotes :lcc-639-1/Japanese,
   :lcc-lr/hasTag "jpn",
   :lcc-lr/identifies :lcc-639-1/Japanese,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "jpn",
   :skos/definition "Alpha-3 language code for Japanese"})

(def jpr
  {:db/ident :lcc-639-2/jpr,
   :lcc-lr/denotes :lcc-639-2/JudeoPersian,
   :lcc-lr/hasTag "jpr",
   :lcc-lr/identifies :lcc-639-2/JudeoPersian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "jpr",
   :skos/definition "Alpha-3 language code for Judeo-Persian"})

(def jrb
  {:db/ident :lcc-639-2/jrb,
   :lcc-lr/denotes :lcc-639-2/JudeoArabic,
   :lcc-lr/hasTag "jrb",
   :lcc-lr/identifies :lcc-639-2/JudeoArabic,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "jrb",
   :skos/definition "Alpha-3 language code for Judeo-Arabic"})

(def kaa
  {:db/ident :lcc-639-2/kaa,
   :lcc-lr/denotes :lcc-639-2/KaraKalpak,
   :lcc-lr/hasTag "kaa",
   :lcc-lr/identifies :lcc-639-2/KaraKalpak,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "kaa",
   :skos/definition "Alpha-3 language code for Kara-Kalpak"})

(def kab
  {:db/ident :lcc-639-2/kab,
   :lcc-lr/denotes :lcc-639-2/Kabyle,
   :lcc-lr/hasTag "kab",
   :lcc-lr/identifies :lcc-639-2/Kabyle,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "kab",
   :skos/definition "Alpha-3 language code for Kabyle"})

(def kac
  {:db/ident :lcc-639-2/kac,
   :lcc-lr/denotes :lcc-639-2/Kachin,
   :lcc-lr/hasTag "kac",
   :lcc-lr/identifies :lcc-639-2/Kachin,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "kac",
   :skos/definition "Alpha-3 language code for Kachin; Jingpho"})

(def kal
  {:db/ident :lcc-639-2/kal,
   :lcc-lr/denotes :lcc-639-1/Kalaallisut,
   :lcc-lr/hasTag "kal",
   :lcc-lr/identifies :lcc-639-1/Kalaallisut,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "kal",
   :skos/definition "Alpha-3 language code for Kalaallisut"})

(def kam
  {:db/ident :lcc-639-2/kam,
   :lcc-lr/denotes :lcc-639-2/Kamba,
   :lcc-lr/hasTag "kam",
   :lcc-lr/identifies :lcc-639-2/Kamba,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "kam",
   :skos/definition "Alpha-3 language code for Kamba"})

(def kan
  {:db/ident :lcc-639-2/kan,
   :lcc-lr/denotes :lcc-639-1/Kannada,
   :lcc-lr/hasTag "kan",
   :lcc-lr/identifies :lcc-639-1/Kannada,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "kan",
   :skos/definition "Alpha-3 language code for Kannada"})

(def kar
  {:db/ident :lcc-639-2/kar,
   :lcc-lr/denotes :lcc-639-2/KarenLanguages,
   :lcc-lr/hasTag "kar",
   :lcc-lr/identifies :lcc-639-2/KarenLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "kar",
   :skos/definition "Alpha-3 language code for Karen languages"})

(def kas
  {:db/ident :lcc-639-2/kas,
   :lcc-lr/denotes :lcc-639-1/Kashmiri,
   :lcc-lr/hasTag "kas",
   :lcc-lr/identifies :lcc-639-1/Kashmiri,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "kas",
   :skos/definition "Alpha-3 language code for Kashmiri"})

(def kat
  {:db/ident :lcc-639-2/kat,
   :lcc-lr/denotes :lcc-639-1/Georgian,
   :lcc-lr/hasTag "kat",
   :lcc-lr/identifies :lcc-639-1/Georgian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :lcc-lr/TerminologyCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "kat",
   :skos/definition "Alpha-3 terminologic language code for Georgian"})

(def kau
  {:db/ident :lcc-639-2/kau,
   :lcc-lr/denotes :lcc-639-1/Kanuri,
   :lcc-lr/hasTag "kau",
   :lcc-lr/identifies :lcc-639-1/Kanuri,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "kau",
   :skos/definition "Alpha-3 language code for Kanuri"})

(def kaw
  {:db/ident :lcc-639-2/kaw,
   :lcc-lr/denotes :lcc-639-2/Kawi,
   :lcc-lr/hasTag "kaw",
   :lcc-lr/identifies :lcc-639-2/Kawi,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "kaw",
   :skos/definition "Alpha-3 language code for Kawi"})

(def kaz
  {:db/ident :lcc-639-2/kaz,
   :lcc-lr/denotes :lcc-639-1/Kazakh,
   :lcc-lr/hasTag "kaz",
   :lcc-lr/identifies :lcc-639-1/Kazakh,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "kaz",
   :skos/definition "Alpha-3 language code for Kazakh"})

(def kbd
  {:db/ident :lcc-639-2/kbd,
   :lcc-lr/denotes :lcc-639-2/Kabardian,
   :lcc-lr/hasTag "kbd",
   :lcc-lr/identifies :lcc-639-2/Kabardian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "kbd",
   :skos/definition "Alpha-3 language code for Kabardian"})

(def kha
  {:db/ident :lcc-639-2/kha,
   :lcc-lr/denotes :lcc-639-2/Khasi,
   :lcc-lr/hasTag "kha",
   :lcc-lr/identifies :lcc-639-2/Khasi,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "kha",
   :skos/definition "Alpha-3 language code for Khasi"})

(def khi
  {:db/ident :lcc-639-2/khi,
   :lcc-lr/denotes :lcc-639-2/KhoisanLanguages,
   :lcc-lr/hasTag "khi",
   :lcc-lr/identifies :lcc-639-2/KhoisanLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "khi",
   :skos/definition "Alpha-3 language code for Khoisan languages"})

(def khm
  {:db/ident :lcc-639-2/khm,
   :lcc-lr/denotes :lcc-639-1/CentralKhmer,
   :lcc-lr/hasTag "khm",
   :lcc-lr/identifies :lcc-639-1/CentralKhmer,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "khm",
   :skos/definition "Alpha-3 language code for Central Khmer"})

(def kho
  {:db/ident :lcc-639-2/kho,
   :lcc-lr/denotes :lcc-639-2/Khotanese,
   :lcc-lr/hasTag "kho",
   :lcc-lr/identifies :lcc-639-2/Khotanese,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "kho",
   :skos/definition "Alpha-3 language code for Khotanese"})

(def kik
  {:db/ident :lcc-639-2/kik,
   :lcc-lr/denotes :lcc-639-1/Kikuyu,
   :lcc-lr/hasTag "kik",
   :lcc-lr/identifies :lcc-639-1/Kikuyu,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "kik",
   :skos/definition "Alpha-3 language code for Kikuyu; Gikuyu"})

(def kin
  {:db/ident :lcc-639-2/kin,
   :lcc-lr/denotes :lcc-639-1/Kinyarwanda,
   :lcc-lr/hasTag "kin",
   :lcc-lr/identifies :lcc-639-1/Kinyarwanda,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "kin",
   :skos/definition "Alpha-3 language code for Kinyarwanda"})

(def kir
  {:db/ident :lcc-639-2/kir,
   :lcc-lr/denotes :lcc-639-1/Kirghiz,
   :lcc-lr/hasTag "kir",
   :lcc-lr/identifies :lcc-639-1/Kirghiz,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "kir",
   :skos/definition "Alpha-3 language code for Kirghiz; Kyrgyz"})

(def kmb
  {:db/ident :lcc-639-2/kmb,
   :lcc-lr/denotes :lcc-639-2/Kimbundu,
   :lcc-lr/hasTag "kmb",
   :lcc-lr/identifies :lcc-639-2/Kimbundu,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "kmb",
   :skos/definition "Alpha-3 language code for Kimbundu"})

(def kok
  {:db/ident :lcc-639-2/kok,
   :lcc-lr/denotes :lcc-639-2/Konkani,
   :lcc-lr/hasTag "kok",
   :lcc-lr/identifies :lcc-639-2/Konkani,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "kok",
   :skos/definition "Alpha-3 language code for Konkani"})

(def kom
  {:db/ident :lcc-639-2/kom,
   :lcc-lr/denotes :lcc-639-1/Komi,
   :lcc-lr/hasTag "kom",
   :lcc-lr/identifies :lcc-639-1/Komi,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "kom",
   :skos/definition "Alpha-3 language code for Komi"})

(def kon
  {:db/ident :lcc-639-2/kon,
   :lcc-lr/denotes :lcc-639-1/Kongo,
   :lcc-lr/hasTag "kon",
   :lcc-lr/identifies :lcc-639-1/Kongo,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "kon",
   :skos/definition "Alpha-3 language code for Kongo"})

(def kor
  {:db/ident :lcc-639-2/kor,
   :lcc-lr/denotes :lcc-639-1/Korean,
   :lcc-lr/hasTag "kor",
   :lcc-lr/identifies :lcc-639-1/Korean,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "kor",
   :skos/definition "Alpha-3 language code for Korean"})

(def kos
  {:db/ident :lcc-639-2/kos,
   :lcc-lr/denotes :lcc-639-2/Kosraean,
   :lcc-lr/hasTag "kos",
   :lcc-lr/identifies :lcc-639-2/Kosraean,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "kos",
   :skos/definition "Alpha-3 language code for Kosraean"})

(def kpe
  {:db/ident :lcc-639-2/kpe,
   :lcc-lr/denotes :lcc-639-2/Kpelle,
   :lcc-lr/hasTag "kpe",
   :lcc-lr/identifies :lcc-639-2/Kpelle,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "kpe",
   :skos/definition "Alpha-3 language code for Kpelle"})

(def krc
  {:db/ident :lcc-639-2/krc,
   :lcc-lr/denotes :lcc-639-2/KarachayBalkar,
   :lcc-lr/hasTag "krc",
   :lcc-lr/identifies :lcc-639-2/KarachayBalkar,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "krc",
   :skos/definition "Alpha-3 language code for Karachay-Balkar"})

(def krl
  {:db/ident :lcc-639-2/krl,
   :lcc-lr/denotes :lcc-639-2/Karelian,
   :lcc-lr/hasTag "krl",
   :lcc-lr/identifies :lcc-639-2/Karelian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "krl",
   :skos/definition "Alpha-3 language code for Karelian"})

(def kro
  {:db/ident :lcc-639-2/kro,
   :lcc-lr/denotes :lcc-639-2/KruLanguages,
   :lcc-lr/hasTag "kro",
   :lcc-lr/identifies :lcc-639-2/KruLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "kro",
   :skos/definition "Alpha-3 language code for Kru languages"})

(def kru
  {:db/ident :lcc-639-2/kru,
   :lcc-lr/denotes :lcc-639-2/Kurukh,
   :lcc-lr/hasTag "kru",
   :lcc-lr/identifies :lcc-639-2/Kurukh,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "kru",
   :skos/definition "Alpha-3 language code for Kurukh"})

(def kua
  {:db/ident :lcc-639-2/kua,
   :lcc-lr/denotes :lcc-639-1/Kuanyama,
   :lcc-lr/hasTag "kua",
   :lcc-lr/identifies :lcc-639-1/Kuanyama,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "kua",
   :skos/definition "Alpha-3 language code for Kuanyama; Kwanyama"})

(def kum
  {:db/ident :lcc-639-2/kum,
   :lcc-lr/denotes :lcc-639-2/Kumyk,
   :lcc-lr/hasTag "kum",
   :lcc-lr/identifies :lcc-639-2/Kumyk,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "kum",
   :skos/definition "Alpha-3 language code for Kumyk"})

(def kur
  {:db/ident :lcc-639-2/kur,
   :lcc-lr/denotes :lcc-639-1/Kurdish,
   :lcc-lr/hasTag "kur",
   :lcc-lr/identifies :lcc-639-1/Kurdish,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "kur",
   :skos/definition "Alpha-3 language code for Kurdish"})

(def kut
  {:db/ident :lcc-639-2/kut,
   :lcc-lr/denotes :lcc-639-2/Kutenai,
   :lcc-lr/hasTag "kut",
   :lcc-lr/identifies :lcc-639-2/Kutenai,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "kut",
   :skos/definition "Alpha-3 language code for Kutenai"})

(def lad
  {:db/ident :lcc-639-2/lad,
   :lcc-lr/denotes :lcc-639-2/Ladino,
   :lcc-lr/hasTag "lad",
   :lcc-lr/identifies :lcc-639-2/Ladino,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "lad",
   :skos/definition "Alpha-3 language code for Ladino"})

(def lah
  {:db/ident :lcc-639-2/lah,
   :lcc-lr/denotes :lcc-639-2/Lahnda,
   :lcc-lr/hasTag "lah",
   :lcc-lr/identifies :lcc-639-2/Lahnda,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "lah",
   :skos/definition "Alpha-3 language code for Lahnda"})

(def lam
  {:db/ident :lcc-639-2/lam,
   :lcc-lr/denotes :lcc-639-2/Lamba,
   :lcc-lr/hasTag "lam",
   :lcc-lr/identifies :lcc-639-2/Lamba,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "lam",
   :skos/definition "Alpha-3 language code for Lamba"})

(def lao_1
  {:db/ident :lcc-639-2/lao_1,
   :lcc-lr/denotes :lcc-639-1/Lao,
   :lcc-lr/hasTag "lao",
   :lcc-lr/identifies :lcc-639-1/Lao,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "lao",
   :skos/definition "Alpha-3 language code for Lao"})

(def lat
  {:db/ident :lcc-639-2/lat,
   :lcc-lr/denotes :lcc-639-1/Latin,
   :lcc-lr/hasTag "lat",
   :lcc-lr/identifies :lcc-639-1/Latin,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "lat",
   :skos/definition "Alpha-3 language code for Latin"})

(def lav
  {:db/ident :lcc-639-2/lav,
   :lcc-lr/denotes :lcc-639-1/Latvian,
   :lcc-lr/hasTag "lav",
   :lcc-lr/identifies :lcc-639-1/Latvian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "lav",
   :skos/definition "Alpha-3 language code for Latvian"})

(def lez
  {:db/ident :lcc-639-2/lez,
   :lcc-lr/denotes :lcc-639-2/Lezghian,
   :lcc-lr/hasTag "lez",
   :lcc-lr/identifies :lcc-639-2/Lezghian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "lez",
   :skos/definition "Alpha-3 language code for Lezghian"})

(def lim
  {:db/ident :lcc-639-2/lim,
   :lcc-lr/denotes :lcc-639-1/Limburgan,
   :lcc-lr/hasTag "lim",
   :lcc-lr/identifies :lcc-639-1/Limburgan,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "lim",
   :skos/definition
   "Alpha-3 language code for Limburgan; Limburger; Limburgish"})

(def lin
  {:db/ident :lcc-639-2/lin,
   :lcc-lr/denotes :lcc-639-1/Lingala,
   :lcc-lr/hasTag "lin",
   :lcc-lr/identifies :lcc-639-1/Lingala,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "lin",
   :skos/definition "Alpha-3 language code for Lingala"})

(def lit
  {:db/ident :lcc-639-2/lit,
   :lcc-lr/denotes :lcc-639-1/Lithuanian,
   :lcc-lr/hasTag "lit",
   :lcc-lr/identifies :lcc-639-1/Lithuanian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "lit",
   :skos/definition "Alpha-3 language code for Lithuanian"})

(def lol
  {:db/ident :lcc-639-2/lol,
   :lcc-lr/denotes :lcc-639-2/Mongo,
   :lcc-lr/hasTag "lol",
   :lcc-lr/identifies :lcc-639-2/Mongo,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "lol",
   :skos/definition "Alpha-3 language code for Mongo"})

(def loz
  {:db/ident :lcc-639-2/loz,
   :lcc-lr/denotes :lcc-639-2/Lozi,
   :lcc-lr/hasTag "loz",
   :lcc-lr/identifies :lcc-639-2/Lozi,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "loz",
   :skos/definition "Alpha-3 language code for Lozi"})

(def ltz
  {:db/ident :lcc-639-2/ltz,
   :lcc-lr/denotes :lcc-639-1/Luxembourgish,
   :lcc-lr/hasTag "ltz",
   :lcc-lr/identifies :lcc-639-1/Luxembourgish,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "ltz",
   :skos/definition "Alpha-3 language code for Luxembourgish; Letzeburgesch"})

(def lua
  {:db/ident :lcc-639-2/lua,
   :lcc-lr/denotes :lcc-639-2/LubaLulua,
   :lcc-lr/hasTag "lua",
   :lcc-lr/identifies :lcc-639-2/LubaLulua,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "lua",
   :skos/definition "Alpha-3 language code for Luba-Lulua"})

(def lub
  {:db/ident :lcc-639-2/lub,
   :lcc-lr/denotes :lcc-639-1/LubaKatanga,
   :lcc-lr/hasTag "lub",
   :lcc-lr/identifies :lcc-639-1/LubaKatanga,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "lub",
   :skos/definition "Alpha-3 language code for Luba-Katanga"})

(def lug
  {:db/ident :lcc-639-2/lug,
   :lcc-lr/denotes :lcc-639-1/Ganda,
   :lcc-lr/hasTag "lug",
   :lcc-lr/identifies :lcc-639-1/Ganda,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "lug",
   :skos/definition "Alpha-3 language code for Ganda"})

(def lui
  {:db/ident :lcc-639-2/lui,
   :lcc-lr/denotes :lcc-639-2/Luiseno,
   :lcc-lr/hasTag "lui",
   :lcc-lr/identifies :lcc-639-2/Luiseno,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "lui",
   :skos/definition "Alpha-3 language code for Luiseno"})

(def lun
  {:db/ident :lcc-639-2/lun,
   :lcc-lr/denotes :lcc-639-2/Lunda,
   :lcc-lr/hasTag "lun",
   :lcc-lr/identifies :lcc-639-2/Lunda,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "lun",
   :skos/definition "Alpha-3 language code for Lunda"})

(def luo
  {:db/ident :lcc-639-2/luo,
   :lcc-lr/denotes :lcc-639-2/LuoKenyaAndTanzania,
   :lcc-lr/hasTag "luo",
   :lcc-lr/identifies :lcc-639-2/LuoKenyaAndTanzania,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "luo",
   :skos/definition "Alpha-3 language code for Luo (Kenya and Tanzania)"})

(def lus
  {:db/ident :lcc-639-2/lus,
   :lcc-lr/denotes :lcc-639-2/Lushai,
   :lcc-lr/hasTag "lus",
   :lcc-lr/identifies :lcc-639-2/Lushai,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "lus",
   :skos/definition "Alpha-3 language code for Lushai"})

(def mac
  {:db/ident :lcc-639-2/mac,
   :lcc-lr/denotes :lcc-639-1/Macedonian,
   :lcc-lr/hasTag "mac",
   :lcc-lr/identifies :lcc-639-1/Macedonian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/BibliographicCode :lcc-lr/Alpha3Code
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "mac",
   :skos/definition "Alpha-3 bibliographic language code for Macedonian"})

(def mad
  {:db/ident :lcc-639-2/mad,
   :lcc-lr/denotes :lcc-639-2/Madurese,
   :lcc-lr/hasTag "mad",
   :lcc-lr/identifies :lcc-639-2/Madurese,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "mad",
   :skos/definition "Alpha-3 language code for Madurese"})

(def mag
  {:db/ident :lcc-639-2/mag,
   :lcc-lr/denotes :lcc-639-2/Magahi,
   :lcc-lr/hasTag "mag",
   :lcc-lr/identifies :lcc-639-2/Magahi,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "mag",
   :skos/definition "Alpha-3 language code for Magahi"})

(def mah
  {:db/ident :lcc-639-2/mah,
   :lcc-lr/denotes :lcc-639-1/Marshallese,
   :lcc-lr/hasTag "mah",
   :lcc-lr/identifies :lcc-639-1/Marshallese,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "mah",
   :skos/definition "Alpha-3 language code for Marshallese"})

(def mai
  {:db/ident :lcc-639-2/mai,
   :lcc-lr/denotes :lcc-639-2/Maithili,
   :lcc-lr/hasTag "mai",
   :lcc-lr/identifies :lcc-639-2/Maithili,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "mai",
   :skos/definition "Alpha-3 language code for Maithili"})

(def mak
  {:db/ident :lcc-639-2/mak,
   :lcc-lr/denotes :lcc-639-2/Makasar,
   :lcc-lr/hasTag "mak",
   :lcc-lr/identifies :lcc-639-2/Makasar,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "mak",
   :skos/definition "Alpha-3 language code for Makasar"})

(def mal
  {:db/ident :lcc-639-2/mal,
   :lcc-lr/denotes :lcc-639-1/Malayalam,
   :lcc-lr/hasTag "mal",
   :lcc-lr/identifies :lcc-639-1/Malayalam,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "mal",
   :skos/definition "Alpha-3 language code for Malayalam"})

(def man
  {:db/ident :lcc-639-2/man,
   :lcc-lr/denotes :lcc-639-2/Mandingo,
   :lcc-lr/hasTag "man",
   :lcc-lr/identifies :lcc-639-2/Mandingo,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "man",
   :skos/definition "Alpha-3 language code for Mandingo"})

(def mao
  {:db/ident :lcc-639-2/mao,
   :lcc-lr/denotes :lcc-639-1/Maori,
   :lcc-lr/hasTag "mao",
   :lcc-lr/identifies :lcc-639-1/Maori,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/BibliographicCode :lcc-lr/Alpha3Code
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "mao",
   :skos/definition "Alpha-3 bibliographic language code for Maori"})

(def map
  {:db/ident :lcc-639-2/map,
   :lcc-lr/denotes :lcc-639-2/AustronesianLanguages,
   :lcc-lr/hasTag "map",
   :lcc-lr/identifies :lcc-639-2/AustronesianLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "map",
   :skos/definition "Alpha-3 language code for Austronesian languages"})

(def mar
  {:db/ident :lcc-639-2/mar,
   :lcc-lr/denotes :lcc-639-1/Marathi,
   :lcc-lr/hasTag "mar",
   :lcc-lr/identifies :lcc-639-1/Marathi,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "mar",
   :skos/definition "Alpha-3 language code for Marathi"})

(def mas
  {:db/ident :lcc-639-2/mas,
   :lcc-lr/denotes :lcc-639-2/Masai,
   :lcc-lr/hasTag "mas",
   :lcc-lr/identifies :lcc-639-2/Masai,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "mas",
   :skos/definition "Alpha-3 language code for Masai"})

(def may
  {:db/ident :lcc-639-2/may,
   :lcc-lr/denotes :lcc-639-1/Malay,
   :lcc-lr/hasTag "may",
   :lcc-lr/identifies :lcc-639-1/Malay,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/BibliographicCode :lcc-lr/Alpha3Code
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "may",
   :skos/definition "Alpha-3 bibliographic language code for Malay"})

(def mdf
  {:db/ident :lcc-639-2/mdf,
   :lcc-lr/denotes :lcc-639-2/Moksha,
   :lcc-lr/hasTag "mdf",
   :lcc-lr/identifies :lcc-639-2/Moksha,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "mdf",
   :skos/definition "Alpha-3 language code for Moksha"})

(def mdr
  {:db/ident :lcc-639-2/mdr,
   :lcc-lr/denotes :lcc-639-2/Mandar,
   :lcc-lr/hasTag "mdr",
   :lcc-lr/identifies :lcc-639-2/Mandar,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "mdr",
   :skos/definition "Alpha-3 language code for Mandar"})

(def men
  {:db/ident :lcc-639-2/men,
   :lcc-lr/denotes :lcc-639-2/Mende,
   :lcc-lr/hasTag "men",
   :lcc-lr/identifies :lcc-639-2/Mende,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "men",
   :skos/definition "Alpha-3 language code for Mende"})

(def mga
  {:db/ident :lcc-639-2/mga,
   :lcc-lr/denotes :lcc-639-2/MiddleIrish,
   :lcc-lr/hasTag "mga",
   :lcc-lr/identifies :lcc-639-2/MiddleIrish,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "mga",
   :skos/definition "Alpha-3 language code for Irish, Middle (900-1200)"})

(def mic
  {:db/ident :lcc-639-2/mic,
   :lcc-lr/denotes :lcc-639-2/Mikmaq,
   :lcc-lr/hasTag "mic",
   :lcc-lr/identifies :lcc-639-2/Mikmaq,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "mic",
   :skos/definition "Alpha-3 language code for Mi'kmaq; Micmac"})

(def min
  {:db/ident :lcc-639-2/min,
   :lcc-lr/denotes :lcc-639-2/Minangkabau,
   :lcc-lr/hasTag "min",
   :lcc-lr/identifies :lcc-639-2/Minangkabau,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "min",
   :skos/definition "Alpha-3 language code for Minangkabau"})

(def mis
  {:db/ident :lcc-639-2/mis,
   :lcc-lr/denotes :lcc-639-2/UncodedLanguages,
   :lcc-lr/hasTag "mis",
   :lcc-lr/identifies :lcc-639-2/UncodedLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "mis",
   :skos/definition "Alpha-3 language code for Uncoded languages"})

(def mkd
  {:db/ident :lcc-639-2/mkd,
   :lcc-lr/denotes :lcc-639-1/Macedonian,
   :lcc-lr/hasTag "mkd",
   :lcc-lr/identifies :lcc-639-1/Macedonian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :lcc-lr/TerminologyCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "mkd",
   :skos/definition "Alpha-3 terminologic language code for Macedonian"})

(def mkh
  {:db/ident :lcc-639-2/mkh,
   :lcc-lr/denotes :lcc-639-2/MonKhmerLanguages,
   :lcc-lr/hasTag "mkh",
   :lcc-lr/identifies :lcc-639-2/MonKhmerLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "mkh",
   :skos/definition "Alpha-3 language code for Mon-Khmer languages"})

(def mlg
  {:db/ident :lcc-639-2/mlg,
   :lcc-lr/denotes :lcc-639-1/Malagasy,
   :lcc-lr/hasTag "mlg",
   :lcc-lr/identifies :lcc-639-1/Malagasy,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "mlg",
   :skos/definition "Alpha-3 language code for Malagasy"})

(def mlt
  {:db/ident :lcc-639-2/mlt,
   :lcc-lr/denotes :lcc-639-1/Maltese,
   :lcc-lr/hasTag "mlt",
   :lcc-lr/identifies :lcc-639-1/Maltese,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "mlt",
   :skos/definition "Alpha-3 language code for Maltese"})

(def mnc
  {:db/ident :lcc-639-2/mnc,
   :lcc-lr/denotes :lcc-639-2/Manchu,
   :lcc-lr/hasTag "mnc",
   :lcc-lr/identifies :lcc-639-2/Manchu,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "mnc",
   :skos/definition "Alpha-3 language code for Manchu"})

(def mni
  {:db/ident :lcc-639-2/mni,
   :lcc-lr/denotes :lcc-639-2/Manipuri,
   :lcc-lr/hasTag "mni",
   :lcc-lr/identifies :lcc-639-2/Manipuri,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "mni",
   :skos/definition "Alpha-3 language code for Manipuri"})

(def mno
  {:db/ident :lcc-639-2/mno,
   :lcc-lr/denotes :lcc-639-2/ManoboLanguages,
   :lcc-lr/hasTag "mno",
   :lcc-lr/identifies :lcc-639-2/ManoboLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "mno",
   :skos/definition "Alpha-3 language code for Manobo languages"})

(def moh
  {:db/ident :lcc-639-2/moh,
   :lcc-lr/denotes :lcc-639-2/Mohawk,
   :lcc-lr/hasTag "moh",
   :lcc-lr/identifies :lcc-639-2/Mohawk,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "moh",
   :skos/definition "Alpha-3 language code for Mohawk"})

(def mon
  {:db/ident :lcc-639-2/mon,
   :lcc-lr/denotes :lcc-639-1/Mongolian,
   :lcc-lr/hasTag "mon",
   :lcc-lr/identifies :lcc-639-1/Mongolian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "mon",
   :skos/definition "Alpha-3 language code for Mongolian"})

(def mos
  {:db/ident :lcc-639-2/mos,
   :lcc-lr/denotes :lcc-639-2/Mossi,
   :lcc-lr/hasTag "mos",
   :lcc-lr/identifies :lcc-639-2/Mossi,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "mos",
   :skos/definition "Alpha-3 language code for Mossi"})

(def mri
  {:db/ident :lcc-639-2/mri,
   :lcc-lr/denotes :lcc-639-1/Maori,
   :lcc-lr/hasTag "mri",
   :lcc-lr/identifies :lcc-639-1/Maori,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :lcc-lr/TerminologyCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "mri",
   :skos/definition "Alpha-3 terminologic language code for Maori"})

(def msa
  {:db/ident :lcc-639-2/msa,
   :lcc-lr/denotes :lcc-639-1/Malay,
   :lcc-lr/hasTag "msa",
   :lcc-lr/identifies :lcc-639-1/Malay,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :lcc-lr/TerminologyCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "msa",
   :skos/definition "Alpha-3 terminologic language code for Malay"})

(def mul
  {:db/ident :lcc-639-2/mul,
   :lcc-lr/denotes :lcc-639-2/MultipleLanguages,
   :lcc-lr/hasTag "mul",
   :lcc-lr/identifies :lcc-639-2/MultipleLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "mul",
   :skos/definition "Alpha-3 language code for Multiple languages"})

(def mun
  {:db/ident :lcc-639-2/mun,
   :lcc-lr/denotes :lcc-639-2/MundaLanguages,
   :lcc-lr/hasTag "mun",
   :lcc-lr/identifies :lcc-639-2/MundaLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "mun",
   :skos/definition "Alpha-3 language code for Munda languages"})

(def mus
  {:db/ident :lcc-639-2/mus,
   :lcc-lr/denotes :lcc-639-2/Creek,
   :lcc-lr/hasTag "mus",
   :lcc-lr/identifies :lcc-639-2/Creek,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "mus",
   :skos/definition "Alpha-3 language code for Creek"})

(def mwl
  {:db/ident :lcc-639-2/mwl,
   :lcc-lr/denotes :lcc-639-2/Mirandese,
   :lcc-lr/hasTag "mwl",
   :lcc-lr/identifies :lcc-639-2/Mirandese,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "mwl",
   :skos/definition "Alpha-3 language code for Mirandese"})

(def mwr
  {:db/ident :lcc-639-2/mwr,
   :lcc-lr/denotes :lcc-639-2/Marwari,
   :lcc-lr/hasTag "mwr",
   :lcc-lr/identifies :lcc-639-2/Marwari,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "mwr",
   :skos/definition "Alpha-3 language code for Marwari"})

(def mya
  {:db/ident :lcc-639-2/mya,
   :lcc-lr/denotes :lcc-639-1/Burmese,
   :lcc-lr/hasTag "mya",
   :lcc-lr/identifies :lcc-639-1/Burmese,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :lcc-lr/TerminologyCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "mya",
   :skos/definition "Alpha-3 terminologic language code for Burmese"})

(def myn
  {:db/ident :lcc-639-2/myn,
   :lcc-lr/denotes :lcc-639-2/MayanLanguages,
   :lcc-lr/hasTag "myn",
   :lcc-lr/identifies :lcc-639-2/MayanLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "myn",
   :skos/definition "Alpha-3 language code for Mayan languages"})

(def myv
  {:db/ident :lcc-639-2/myv,
   :lcc-lr/denotes :lcc-639-2/Erzya,
   :lcc-lr/hasTag "myv",
   :lcc-lr/identifies :lcc-639-2/Erzya,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "myv",
   :skos/definition "Alpha-3 language code for Erzya"})

(def nah
  {:db/ident :lcc-639-2/nah,
   :lcc-lr/denotes :lcc-639-2/NahuatlLanguages,
   :lcc-lr/hasTag "nah",
   :lcc-lr/identifies :lcc-639-2/NahuatlLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "nah",
   :skos/definition "Alpha-3 language code for Nahuatl languages"})

(def nai
  {:db/ident :lcc-639-2/nai,
   :lcc-lr/denotes :lcc-639-2/NorthAmericanIndianLanguages,
   :lcc-lr/hasTag "nai",
   :lcc-lr/identifies :lcc-639-2/NorthAmericanIndianLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "nai",
   :skos/definition "Alpha-3 language code for North American Indian (Other)"})

(def nap
  {:db/ident :lcc-639-2/nap,
   :lcc-lr/denotes :lcc-639-2/Neapolitan,
   :lcc-lr/hasTag "nap",
   :lcc-lr/identifies :lcc-639-2/Neapolitan,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "nap",
   :skos/definition "Alpha-3 language code for Neapolitan"})

(def nau
  {:db/ident :lcc-639-2/nau,
   :lcc-lr/denotes :lcc-639-1/Nauru,
   :lcc-lr/hasTag "nau",
   :lcc-lr/identifies :lcc-639-1/Nauru,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "nau",
   :skos/definition "Alpha-3 language code for Nauru"})

(def nav
  {:db/ident :lcc-639-2/nav,
   :lcc-lr/denotes :lcc-639-1/Navajo,
   :lcc-lr/hasTag "nav",
   :lcc-lr/identifies :lcc-639-1/Navajo,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "nav",
   :skos/definition "Alpha-3 language code for Navajo; Navaho"})

(def nbl
  {:db/ident :lcc-639-2/nbl,
   :lcc-lr/denotes :lcc-639-1/SouthNdebele,
   :lcc-lr/hasTag "nbl",
   :lcc-lr/identifies :lcc-639-1/SouthNdebele,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "nbl",
   :skos/definition "Alpha-3 language code for South Ndebele; Ndebele, South"})

(def nde
  {:db/ident :lcc-639-2/nde,
   :lcc-lr/denotes :lcc-639-1/NorthNdebele,
   :lcc-lr/hasTag "nde",
   :lcc-lr/identifies :lcc-639-1/NorthNdebele,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "nde",
   :skos/definition "Alpha-3 language code for North Ndebele; Ndebele, North"})

(def ndo
  {:db/ident :lcc-639-2/ndo,
   :lcc-lr/denotes :lcc-639-1/Ndonga,
   :lcc-lr/hasTag "ndo",
   :lcc-lr/identifies :lcc-639-1/Ndonga,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "ndo",
   :skos/definition "Alpha-3 language code for Ndonga"})

(def nds
  {:db/ident :lcc-639-2/nds,
   :lcc-lr/denotes :lcc-639-2/LowGerman,
   :lcc-lr/hasTag "nds",
   :lcc-lr/identifies :lcc-639-2/LowGerman,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "nds",
   :skos/definition
   "Alpha-3 language code for Low German; Low Saxon; German, Low; Saxon, Low"})

(def nep
  {:db/ident :lcc-639-2/nep,
   :lcc-lr/denotes :lcc-639-1/Nepali,
   :lcc-lr/hasTag "nep",
   :lcc-lr/identifies :lcc-639-1/Nepali,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "nep",
   :skos/definition "Alpha-3 language code for Nepali"})

(def new
  {:db/ident :lcc-639-2/new,
   :lcc-lr/denotes :lcc-639-2/Newari,
   :lcc-lr/hasTag "new",
   :lcc-lr/identifies :lcc-639-2/Newari,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "new",
   :skos/definition "Alpha-3 language code for Nepal Bhasa; Newari"})

(def nia
  {:db/ident :lcc-639-2/nia,
   :lcc-lr/denotes :lcc-639-2/Nias,
   :lcc-lr/hasTag "nia",
   :lcc-lr/identifies :lcc-639-2/Nias,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "nia",
   :skos/definition "Alpha-3 language code for Nias"})

(def nic
  {:db/ident :lcc-639-2/nic,
   :lcc-lr/denotes :lcc-639-2/NigerKordofanianLanguages,
   :lcc-lr/hasTag "nic",
   :lcc-lr/identifies :lcc-639-2/NigerKordofanianLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "nic",
   :skos/definition "Alpha-3 language code for Niger-Kordofanian languages"})

(def niu
  {:db/ident :lcc-639-2/niu,
   :lcc-lr/denotes :lcc-639-2/Niuean,
   :lcc-lr/hasTag "niu",
   :lcc-lr/identifies :lcc-639-2/Niuean,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "niu",
   :skos/definition "Alpha-3 language code for Niuean"})

(def nld
  {:db/ident :lcc-639-2/nld,
   :lcc-lr/denotes :lcc-639-1/Dutch,
   :lcc-lr/hasTag "nld",
   :lcc-lr/identifies :lcc-639-1/Dutch,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :lcc-lr/TerminologyCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "nld",
   :skos/definition "Alpha-3 terminologic language code for Dutch; Flemish"})

(def nno
  {:db/ident :lcc-639-2/nno,
   :lcc-lr/denotes :lcc-639-1/NorwegianNynorsk,
   :lcc-lr/hasTag "nno",
   :lcc-lr/identifies :lcc-639-1/NorwegianNynorsk,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "nno",
   :skos/definition "Alpha-3 language code for Norwegian Nynorsk"})

(def nob
  {:db/ident :lcc-639-2/nob,
   :lcc-lr/denotes :lcc-639-1/NorwegianBokmal,
   :lcc-lr/hasTag "nob",
   :lcc-lr/identifies :lcc-639-1/NorwegianBokmal,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "nob",
   :skos/definition "Alpha-3 language code for Norwegian Bokmal"})

(def nog
  {:db/ident :lcc-639-2/nog,
   :lcc-lr/denotes :lcc-639-2/Nogai,
   :lcc-lr/hasTag "nog",
   :lcc-lr/identifies :lcc-639-2/Nogai,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "nog",
   :skos/definition "Alpha-3 language code for Nogai"})

(def non
  {:db/ident :lcc-639-2/non,
   :lcc-lr/denotes :lcc-639-2/OldNorse,
   :lcc-lr/hasTag "non",
   :lcc-lr/identifies :lcc-639-2/OldNorse,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "non",
   :skos/definition "Alpha-3 language code for Norse, Old"})

(def nor
  {:db/ident :lcc-639-2/nor,
   :lcc-lr/denotes :lcc-639-1/Norwegian,
   :lcc-lr/hasTag "nor",
   :lcc-lr/identifies :lcc-639-1/Norwegian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "nor",
   :skos/definition "Alpha-3 language code for Norwegian"})

(def nqo
  {:db/ident :lcc-639-2/nqo,
   :lcc-lr/denotes :lcc-639-2/NKo,
   :lcc-lr/hasTag "nqo",
   :lcc-lr/identifies :lcc-639-2/NKo,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "nqo",
   :skos/definition "Alpha-3 language code for N'Ko"})

(def nso
  {:db/ident :lcc-639-2/nso,
   :lcc-lr/denotes :lcc-639-2/Pedi,
   :lcc-lr/hasTag "nso",
   :lcc-lr/identifies :lcc-639-2/Pedi,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "nso",
   :skos/definition "Alpha-3 language code for Northern Sotho; Pedi; Sepedi"})

(def nub
  {:db/ident :lcc-639-2/nub,
   :lcc-lr/denotes :lcc-639-2/NubianLanguages,
   :lcc-lr/hasTag "nub",
   :lcc-lr/identifies :lcc-639-2/NubianLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "nub",
   :skos/definition "Alpha-3 language code for Nubian languages"})

(def nwc
  {:db/ident :lcc-639-2/nwc,
   :lcc-lr/denotes :lcc-639-2/ClassicalNewari,
   :lcc-lr/hasTag "nwc",
   :lcc-lr/identifies :lcc-639-2/ClassicalNewari,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "nwc",
   :skos/definition
   "Alpha-3 language code for Classical Newari; Classical Nepal Bhasa; Old Newari"})

(def nya
  {:db/ident :lcc-639-2/nya,
   :lcc-lr/denotes :lcc-639-1/Nyanja,
   :lcc-lr/hasTag "nya",
   :lcc-lr/identifies :lcc-639-1/Nyanja,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "nya",
   :skos/definition "Alpha-3 language code for Nyanja; Chichewa; Chewa"})

(def nym
  {:db/ident :lcc-639-2/nym,
   :lcc-lr/denotes :lcc-639-2/Nyamwezi,
   :lcc-lr/hasTag "nym",
   :lcc-lr/identifies :lcc-639-2/Nyamwezi,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "nym",
   :skos/definition "Alpha-3 language code for Nyamwezi"})

(def nyn
  {:db/ident :lcc-639-2/nyn,
   :lcc-lr/denotes :lcc-639-2/Nyankole,
   :lcc-lr/hasTag "nyn",
   :lcc-lr/identifies :lcc-639-2/Nyankole,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "nyn",
   :skos/definition "Alpha-3 language code for Nyankole"})

(def nyo
  {:db/ident :lcc-639-2/nyo,
   :lcc-lr/denotes :lcc-639-2/Nyoro,
   :lcc-lr/hasTag "nyo",
   :lcc-lr/identifies :lcc-639-2/Nyoro,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "nyo",
   :skos/definition "Alpha-3 language code for Nyoro"})

(def nzi
  {:db/ident :lcc-639-2/nzi,
   :lcc-lr/denotes :lcc-639-2/Nzima,
   :lcc-lr/hasTag "nzi",
   :lcc-lr/identifies :lcc-639-2/Nzima,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "nzi",
   :skos/definition "Alpha-3 language code for Nzima"})

(def oci
  {:db/ident :lcc-639-2/oci,
   :lcc-lr/denotes :lcc-639-1/Occitan,
   :lcc-lr/hasTag "oci",
   :lcc-lr/identifies :lcc-639-1/Occitan,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "oci",
   :skos/definition "Alpha-3 language code for Occitan (post 1500)"})

(def oji
  {:db/ident :lcc-639-2/oji,
   :lcc-lr/denotes :lcc-639-1/Ojibwa,
   :lcc-lr/hasTag "oji",
   :lcc-lr/identifies :lcc-639-1/Ojibwa,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "oji",
   :skos/definition "Alpha-3 language code for Ojibwa"})

(def ori
  {:db/ident :lcc-639-2/ori,
   :lcc-lr/denotes :lcc-639-1/Oriya,
   :lcc-lr/hasTag "ori",
   :lcc-lr/identifies :lcc-639-1/Oriya,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "ori",
   :skos/definition "Alpha-3 language code for Oriya"})

(def orm
  {:db/ident :lcc-639-2/orm,
   :lcc-lr/denotes :lcc-639-1/Oromo,
   :lcc-lr/hasTag "orm",
   :lcc-lr/identifies :lcc-639-1/Oromo,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "orm",
   :skos/definition "Alpha-3 language code for Oromo"})

(def osa
  {:db/ident :lcc-639-2/osa,
   :lcc-lr/denotes :lcc-639-2/Osage,
   :lcc-lr/hasTag "osa",
   :lcc-lr/identifies :lcc-639-2/Osage,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "osa",
   :skos/definition "Alpha-3 language code for Osage"})

(def oss
  {:db/ident :lcc-639-2/oss,
   :lcc-lr/denotes :lcc-639-1/Ossetian,
   :lcc-lr/hasTag "oss",
   :lcc-lr/identifies :lcc-639-1/Ossetian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "oss",
   :skos/definition "Alpha-3 language code for Ossetian; Ossetic"})

(def ota
  {:db/ident :lcc-639-2/ota,
   :lcc-lr/denotes :lcc-639-2/OttomanTurkish,
   :lcc-lr/hasTag "ota",
   :lcc-lr/identifies :lcc-639-2/OttomanTurkish,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "ota",
   :skos/definition "Alpha-3 language code for Turkish, Ottoman (1500-1928)"})

(def oto
  {:db/ident :lcc-639-2/oto,
   :lcc-lr/denotes :lcc-639-2/OtomianLanguages,
   :lcc-lr/hasTag "oto",
   :lcc-lr/identifies :lcc-639-2/OtomianLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "oto",
   :skos/definition "Alpha-3 language code for Otomian languages"})

(def paa
  {:db/ident :lcc-639-2/paa,
   :lcc-lr/denotes :lcc-639-2/PapuanLanguages,
   :lcc-lr/hasTag "paa",
   :lcc-lr/identifies :lcc-639-2/PapuanLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "paa",
   :skos/definition "Alpha-3 language code for Papuan languages"})

(def pag
  {:db/ident :lcc-639-2/pag,
   :lcc-lr/denotes :lcc-639-2/Pangasinan,
   :lcc-lr/hasTag "pag",
   :lcc-lr/identifies :lcc-639-2/Pangasinan,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "pag",
   :skos/definition "Alpha-3 language code for Pangasinan"})

(def pal
  {:db/ident :lcc-639-2/pal,
   :lcc-lr/denotes :lcc-639-2/Pahlavi,
   :lcc-lr/hasTag "pal",
   :lcc-lr/identifies :lcc-639-2/Pahlavi,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "pal",
   :skos/definition "Alpha-3 language code for Pahlavi"})

(def pam
  {:db/ident :lcc-639-2/pam,
   :lcc-lr/denotes :lcc-639-2/Pampanga,
   :lcc-lr/hasTag "pam",
   :lcc-lr/identifies :lcc-639-2/Pampanga,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "pam",
   :skos/definition "Alpha-3 language code for Pampanga"})

(def pan
  {:db/ident :lcc-639-2/pan,
   :lcc-lr/denotes :lcc-639-1/Panjabi,
   :lcc-lr/hasTag "pan",
   :lcc-lr/identifies :lcc-639-1/Panjabi,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "pan",
   :skos/definition "Alpha-3 language code for Panjabi; Punjabi"})

(def pap
  {:db/ident :lcc-639-2/pap,
   :lcc-lr/denotes :lcc-639-2/Papiamento,
   :lcc-lr/hasTag "pap",
   :lcc-lr/identifies :lcc-639-2/Papiamento,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "pap",
   :skos/definition "Alpha-3 language code for Papiamento"})

(def pau
  {:db/ident :lcc-639-2/pau,
   :lcc-lr/denotes :lcc-639-2/Palauan,
   :lcc-lr/hasTag "pau",
   :lcc-lr/identifies :lcc-639-2/Palauan,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "pau",
   :skos/definition "Alpha-3 language code for Palauan"})

(def peo
  {:db/ident :lcc-639-2/peo,
   :lcc-lr/denotes :lcc-639-2/OldPersian,
   :lcc-lr/hasTag "peo",
   :lcc-lr/identifies :lcc-639-2/OldPersian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "peo",
   :skos/definition
   "Alpha-3 language code for Persian, Old (ca. 600-400 B.C.)"})

(def per
  {:db/ident :lcc-639-2/per,
   :lcc-lr/denotes :lcc-639-1/Persian,
   :lcc-lr/hasTag "per",
   :lcc-lr/identifies :lcc-639-1/Persian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/BibliographicCode :lcc-lr/Alpha3Code
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "per",
   :skos/definition "Alpha-3 bibliographic language code for Persian"})

(def phi
  {:db/ident :lcc-639-2/phi,
   :lcc-lr/denotes :lcc-639-2/PhilippineLanguages,
   :lcc-lr/hasTag "phi",
   :lcc-lr/identifies :lcc-639-2/PhilippineLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "phi",
   :skos/definition "Alpha-3 language code for Philippine languages"})

(def phn
  {:db/ident :lcc-639-2/phn,
   :lcc-lr/denotes :lcc-639-2/Phoenician,
   :lcc-lr/hasTag "phn",
   :lcc-lr/identifies :lcc-639-2/Phoenician,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "phn",
   :skos/definition "Alpha-3 language code for Phoenician"})

(def pli
  {:db/ident :lcc-639-2/pli,
   :lcc-lr/denotes :lcc-639-1/Pali,
   :lcc-lr/hasTag "pli",
   :lcc-lr/identifies :lcc-639-1/Pali,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "pli",
   :skos/definition "Alpha-3 language code for Pali"})

(def pol
  {:db/ident :lcc-639-2/pol,
   :lcc-lr/denotes :lcc-639-1/Polish,
   :lcc-lr/hasTag "pol",
   :lcc-lr/identifies :lcc-639-1/Polish,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "pol",
   :skos/definition "Alpha-3 language code for Polish"})

(def pon
  {:db/ident :lcc-639-2/pon,
   :lcc-lr/denotes :lcc-639-2/Pohnpeian,
   :lcc-lr/hasTag "pon",
   :lcc-lr/identifies :lcc-639-2/Pohnpeian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "pon",
   :skos/definition "Alpha-3 language code for Pohnpeian"})

(def por
  {:db/ident :lcc-639-2/por,
   :lcc-lr/denotes :lcc-639-1/Portuguese,
   :lcc-lr/hasTag "por",
   :lcc-lr/identifies :lcc-639-1/Portuguese,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "por",
   :skos/definition "Alpha-3 language code for Portuguese"})

(def pra
  {:db/ident :lcc-639-2/pra,
   :lcc-lr/denotes :lcc-639-2/PrakritLanguages,
   :lcc-lr/hasTag "pra",
   :lcc-lr/identifies :lcc-639-2/PrakritLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "pra",
   :skos/definition "Alpha-3 language code for Prakrit languages"})

(def pro
  {:db/ident :lcc-639-2/pro,
   :lcc-lr/denotes :lcc-639-2/OldProvencal,
   :lcc-lr/hasTag "pro",
   :lcc-lr/identifies :lcc-639-2/OldProvencal,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "pro",
   :skos/definition "Alpha-3 language code for Provencal, Old (to 1500)"})

(def pus
  {:db/ident :lcc-639-2/pus,
   :lcc-lr/denotes :lcc-639-1/Pushto,
   :lcc-lr/hasTag "pus",
   :lcc-lr/identifies :lcc-639-1/Pushto,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "pus",
   :skos/definition "Alpha-3 language code for Pushto"})

(def que
  {:db/ident :lcc-639-2/que,
   :lcc-lr/denotes :lcc-639-1/Quechua,
   :lcc-lr/hasTag "que",
   :lcc-lr/identifies :lcc-639-1/Quechua,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "que",
   :skos/definition "Alpha-3 language code for Quechua"})

(def raj
  {:db/ident :lcc-639-2/raj,
   :lcc-lr/denotes :lcc-639-2/Rajasthani,
   :lcc-lr/hasTag "raj",
   :lcc-lr/identifies :lcc-639-2/Rajasthani,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "raj",
   :skos/definition "Alpha-3 language code for Rajasthani"})

(def rap
  {:db/ident :lcc-639-2/rap,
   :lcc-lr/denotes :lcc-639-2/Rapanui,
   :lcc-lr/hasTag "rap",
   :lcc-lr/identifies :lcc-639-2/Rapanui,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "rap",
   :skos/definition "Alpha-3 language code for Rapanui"})

(def rar
  {:db/ident :lcc-639-2/rar,
   :lcc-lr/denotes :lcc-639-2/Rarotongan,
   :lcc-lr/hasTag "rar",
   :lcc-lr/identifies :lcc-639-2/Rarotongan,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "rar",
   :skos/definition "Alpha-3 language code for Rarotongan; Cook Islands Maori"})

(def roa
  {:db/ident :lcc-639-2/roa,
   :lcc-lr/denotes :lcc-639-2/RomanceLanguages,
   :lcc-lr/hasTag "roa",
   :lcc-lr/identifies :lcc-639-2/RomanceLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "roa",
   :skos/definition "Alpha-3 language code for Romance languages"})

(def roh
  {:db/ident :lcc-639-2/roh,
   :lcc-lr/denotes :lcc-639-1/Romansh,
   :lcc-lr/hasTag "roh",
   :lcc-lr/identifies :lcc-639-1/Romansh,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "roh",
   :skos/definition "Alpha-3 language code for Romansh"})

(def rom
  {:db/ident :lcc-639-2/rom,
   :lcc-lr/denotes :lcc-639-2/Romany,
   :lcc-lr/hasTag "rom",
   :lcc-lr/identifies :lcc-639-2/Romany,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "rom",
   :skos/definition "Alpha-3 language code for Romany"})

(def ron
  {:db/ident :lcc-639-2/ron,
   :lcc-lr/denotes :lcc-639-1/Romanian,
   :lcc-lr/hasTag "ron",
   :lcc-lr/identifies :lcc-639-1/Romanian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :lcc-lr/TerminologyCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "ron",
   :skos/definition "Alpha-3 terminologic language code for Romanian"})

(def rum
  {:db/ident :lcc-639-2/rum,
   :lcc-lr/denotes :lcc-639-1/Romanian,
   :lcc-lr/hasTag "rum",
   :lcc-lr/identifies :lcc-639-1/Romanian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/BibliographicCode :lcc-lr/Alpha3Code
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "rum",
   :skos/definition "Alpha-3 bibliographic language code for Romanian"})

(def run
  {:db/ident :lcc-639-2/run,
   :lcc-lr/denotes :lcc-639-1/Rundi,
   :lcc-lr/hasTag "run",
   :lcc-lr/identifies :lcc-639-1/Rundi,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "run",
   :skos/definition "Alpha-3 language code for Rundi"})

(def rup
  {:db/ident :lcc-639-2/rup,
   :lcc-lr/denotes :lcc-639-2/MacedoRomanian,
   :lcc-lr/hasTag "rup",
   :lcc-lr/identifies :lcc-639-2/MacedoRomanian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "rup",
   :skos/definition
   "Alpha-3 language code for Aromanian; Arumanian; Macedo-Romanian"})

(def rus
  {:db/ident :lcc-639-2/rus,
   :lcc-lr/denotes :lcc-639-1/Russian,
   :lcc-lr/hasTag "rus",
   :lcc-lr/identifies :lcc-639-1/Russian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "rus",
   :skos/definition "Alpha-3 language code for Russian"})

(def sad
  {:db/ident :lcc-639-2/sad,
   :lcc-lr/denotes :lcc-639-2/Sandawe,
   :lcc-lr/hasTag "sad",
   :lcc-lr/identifies :lcc-639-2/Sandawe,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "sad",
   :skos/definition "Alpha-3 language code for Sandawe"})

(def sag
  {:db/ident :lcc-639-2/sag,
   :lcc-lr/denotes :lcc-639-1/Sango,
   :lcc-lr/hasTag "sag",
   :lcc-lr/identifies :lcc-639-1/Sango,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "sag",
   :skos/definition "Alpha-3 language code for Sango"})

(def sah
  {:db/ident :lcc-639-2/sah,
   :lcc-lr/denotes :lcc-639-2/Yakut,
   :lcc-lr/hasTag "sah",
   :lcc-lr/identifies :lcc-639-2/Yakut,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "sah",
   :skos/definition "Alpha-3 language code for Yakut"})

(def sai
  {:db/ident :lcc-639-2/sai,
   :lcc-lr/denotes :lcc-639-2/SouthAmericanIndianLanguages,
   :lcc-lr/hasTag "sai",
   :lcc-lr/identifies :lcc-639-2/SouthAmericanIndianLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "sai",
   :skos/definition "Alpha-3 language code for South American Indian"})

(def sal
  {:db/ident :lcc-639-2/sal,
   :lcc-lr/denotes :lcc-639-2/SalishanLanguages,
   :lcc-lr/hasTag "sal",
   :lcc-lr/identifies :lcc-639-2/SalishanLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "sal",
   :skos/definition "Alpha-3 language code for Salishan languages"})

(def sam
  {:db/ident :lcc-639-2/sam,
   :lcc-lr/denotes :lcc-639-2/SamaritanAramaic,
   :lcc-lr/hasTag "sam",
   :lcc-lr/identifies :lcc-639-2/SamaritanAramaic,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "sam",
   :skos/definition "Alpha-3 language code for Samaritan Aramaic"})

(def san
  {:db/ident :lcc-639-2/san,
   :lcc-lr/denotes :lcc-639-1/Sanskrit,
   :lcc-lr/hasTag "san",
   :lcc-lr/identifies :lcc-639-1/Sanskrit,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "san",
   :skos/definition "Alpha-3 language code for Sanskrit"})

(def sas
  {:db/ident :lcc-639-2/sas,
   :lcc-lr/denotes :lcc-639-2/Sasak,
   :lcc-lr/hasTag "sas",
   :lcc-lr/identifies :lcc-639-2/Sasak,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "sas",
   :skos/definition "Alpha-3 language code for Sasak"})

(def sat
  {:db/ident :lcc-639-2/sat,
   :lcc-lr/denotes :lcc-639-2/Santali,
   :lcc-lr/hasTag "sat",
   :lcc-lr/identifies :lcc-639-2/Santali,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "sat",
   :skos/definition "Alpha-3 language code for Santali"})

(def scn
  {:db/ident :lcc-639-2/scn,
   :lcc-lr/denotes :lcc-639-2/Sicilian,
   :lcc-lr/hasTag "scn",
   :lcc-lr/identifies :lcc-639-2/Sicilian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "scn",
   :skos/definition "Alpha-3 language code for Sicilian"})

(def sco
  {:db/ident :lcc-639-2/sco,
   :lcc-lr/denotes :lcc-639-2/Scots,
   :lcc-lr/hasTag "sco",
   :lcc-lr/identifies :lcc-639-2/Scots,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "sco",
   :skos/definition "Alpha-3 language code for Scots"})

(def sel
  {:db/ident :lcc-639-2/sel,
   :lcc-lr/denotes :lcc-639-2/Selkup,
   :lcc-lr/hasTag "sel",
   :lcc-lr/identifies :lcc-639-2/Selkup,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "sel",
   :skos/definition "Alpha-3 language code for Selkup"})

(def sem
  {:db/ident :lcc-639-2/sem,
   :lcc-lr/denotes :lcc-639-2/SemiticLanguages,
   :lcc-lr/hasTag "sem",
   :lcc-lr/identifies :lcc-639-2/SemiticLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "sem",
   :skos/definition "Alpha-3 language code for Semitic languages"})

(def sga
  {:db/ident :lcc-639-2/sga,
   :lcc-lr/denotes :lcc-639-2/OldIrish,
   :lcc-lr/hasTag "sga",
   :lcc-lr/identifies :lcc-639-2/OldIrish,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "sga",
   :skos/definition "Alpha-3 language code for Irish, Old (to 900)"})

(def sgn
  {:db/ident :lcc-639-2/sgn,
   :lcc-lr/denotes :lcc-639-2/SignLanguages,
   :lcc-lr/hasTag "sgn",
   :lcc-lr/identifies :lcc-639-2/SignLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "sgn",
   :skos/definition "Alpha-3 language code for Sign languages"})

(def shn
  {:db/ident :lcc-639-2/shn,
   :lcc-lr/denotes :lcc-639-2/Shan,
   :lcc-lr/hasTag "shn",
   :lcc-lr/identifies :lcc-639-2/Shan,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "shn",
   :skos/definition "Alpha-3 language code for Shan"})

(def sid
  {:db/ident :lcc-639-2/sid,
   :lcc-lr/denotes :lcc-639-2/Sidamo,
   :lcc-lr/hasTag "sid",
   :lcc-lr/identifies :lcc-639-2/Sidamo,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "sid",
   :skos/definition "Alpha-3 language code for Sidamo"})

(def sin
  {:db/ident :lcc-639-2/sin,
   :lcc-lr/denotes :lcc-639-1/Sinhala,
   :lcc-lr/hasTag "sin",
   :lcc-lr/identifies :lcc-639-1/Sinhala,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "sin",
   :skos/definition "Alpha-3 language code for Sinhalese; Sinhala"})

(def sio
  {:db/ident :lcc-639-2/sio,
   :lcc-lr/denotes :lcc-639-2/SiouanLanguages,
   :lcc-lr/hasTag "sio",
   :lcc-lr/identifies :lcc-639-2/SiouanLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "sio",
   :skos/definition "Alpha-3 language code for Siouan languages"})

(def sit
  {:db/ident :lcc-639-2/sit,
   :lcc-lr/denotes :lcc-639-2/SinoTibetanLanguages,
   :lcc-lr/hasTag "sit",
   :lcc-lr/identifies :lcc-639-2/SinoTibetanLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "sit",
   :skos/definition "Alpha-3 language code for Sino-Tibetan languages"})

(def sla
  {:db/ident :lcc-639-2/sla,
   :lcc-lr/denotes :lcc-639-2/SlavicLanguages,
   :lcc-lr/hasTag "sla",
   :lcc-lr/identifies :lcc-639-2/SlavicLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "sla",
   :skos/definition "Alpha-3 language code for Slavic languages"})

(def slk
  {:db/ident :lcc-639-2/slk,
   :lcc-lr/denotes :lcc-639-1/Slovak,
   :lcc-lr/hasTag "slk",
   :lcc-lr/identifies :lcc-639-1/Slovak,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :lcc-lr/TerminologyCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "slk",
   :skos/definition "Alpha-3 terminologic language code for Slovak"})

(def slo
  {:db/ident :lcc-639-2/slo,
   :lcc-lr/denotes :lcc-639-1/Slovak,
   :lcc-lr/hasTag "slo",
   :lcc-lr/identifies :lcc-639-1/Slovak,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/BibliographicCode :lcc-lr/Alpha3Code
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "slo",
   :skos/definition "Alpha-3 bibliographic language code for Slovak"})

(def slv
  {:db/ident :lcc-639-2/slv,
   :lcc-lr/denotes :lcc-639-1/Slovenian,
   :lcc-lr/hasTag "slv",
   :lcc-lr/identifies :lcc-639-1/Slovenian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "slv",
   :skos/definition "Alpha-3 language code for Slovenian"})

(def sma
  {:db/ident :lcc-639-2/sma,
   :lcc-lr/denotes :lcc-639-2/SouthernSami,
   :lcc-lr/hasTag "sma",
   :lcc-lr/identifies :lcc-639-2/SouthernSami,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "sma",
   :skos/definition "Alpha-3 language code for Southern Sami"})

(def sme
  {:db/ident :lcc-639-2/sme,
   :lcc-lr/denotes :lcc-639-1/NorthernSami,
   :lcc-lr/hasTag "sme",
   :lcc-lr/identifies :lcc-639-1/NorthernSami,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "sme",
   :skos/definition "Alpha-3 language code for Northern Sami"})

(def smi
  {:db/ident :lcc-639-2/smi,
   :lcc-lr/denotes :lcc-639-2/SamiLanguages,
   :lcc-lr/hasTag "smi",
   :lcc-lr/identifies :lcc-639-2/SamiLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "smi",
   :skos/definition "Alpha-3 language code for Sami languages"})

(def smj
  {:db/ident :lcc-639-2/smj,
   :lcc-lr/denotes :lcc-639-2/LuleSami,
   :lcc-lr/hasTag "smj",
   :lcc-lr/identifies :lcc-639-2/LuleSami,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "smj",
   :skos/definition "Alpha-3 language code for Lule Sami"})

(def smn
  {:db/ident :lcc-639-2/smn,
   :lcc-lr/denotes :lcc-639-2/InariSami,
   :lcc-lr/hasTag "smn",
   :lcc-lr/identifies :lcc-639-2/InariSami,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "smn",
   :skos/definition "Alpha-3 language code for Inari Sami"})

(def smo
  {:db/ident :lcc-639-2/smo,
   :lcc-lr/denotes :lcc-639-1/Samoan,
   :lcc-lr/hasTag "smo",
   :lcc-lr/identifies :lcc-639-1/Samoan,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "smo",
   :skos/definition "Alpha-3 language code for Samoan"})

(def sms
  {:db/ident :lcc-639-2/sms,
   :lcc-lr/denotes :lcc-639-2/SkoltSami,
   :lcc-lr/hasTag "sms",
   :lcc-lr/identifies :lcc-639-2/SkoltSami,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "sms",
   :skos/definition "Alpha-3 language code for Skolt Sami"})

(def sna
  {:db/ident :lcc-639-2/sna,
   :lcc-lr/denotes :lcc-639-1/Shona,
   :lcc-lr/hasTag "sna",
   :lcc-lr/identifies :lcc-639-1/Shona,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "sna",
   :skos/definition "Alpha-3 language code for Shona"})

(def snd
  {:db/ident :lcc-639-2/snd,
   :lcc-lr/denotes :lcc-639-1/Sindhi,
   :lcc-lr/hasTag "snd",
   :lcc-lr/identifies :lcc-639-1/Sindhi,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "snd",
   :skos/definition "Alpha-3 language code for Sindhi"})

(def snk
  {:db/ident :lcc-639-2/snk,
   :lcc-lr/denotes :lcc-639-2/Soninke,
   :lcc-lr/hasTag "snk",
   :lcc-lr/identifies :lcc-639-2/Soninke,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "snk",
   :skos/definition "Alpha-3 language code for Soninke"})

(def sog
  {:db/ident :lcc-639-2/sog,
   :lcc-lr/denotes :lcc-639-2/Sogdian,
   :lcc-lr/hasTag "sog",
   :lcc-lr/identifies :lcc-639-2/Sogdian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "sog",
   :skos/definition "Alpha-3 language code for Sogdian"})

(def som
  {:db/ident :lcc-639-2/som,
   :lcc-lr/denotes :lcc-639-1/Somali,
   :lcc-lr/hasTag "som",
   :lcc-lr/identifies :lcc-639-1/Somali,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "som",
   :skos/definition "Alpha-3 language code for Somali"})

(def son
  {:db/ident :lcc-639-2/son,
   :lcc-lr/denotes :lcc-639-2/SonghaiLanguages,
   :lcc-lr/hasTag "son",
   :lcc-lr/identifies :lcc-639-2/SonghaiLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "son",
   :skos/definition "Alpha-3 language code for Songhai languages"})

(def sot
  {:db/ident :lcc-639-2/sot,
   :lcc-lr/denotes :lcc-639-1/SouthernSotho,
   :lcc-lr/hasTag "sot",
   :lcc-lr/identifies :lcc-639-1/SouthernSotho,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "sot",
   :skos/definition "Alpha-3 language code for Southern Sotho"})

(def spa
  {:db/ident :lcc-639-2/spa,
   :lcc-lr/denotes :lcc-639-1/Spanish,
   :lcc-lr/hasTag "spa",
   :lcc-lr/identifies :lcc-639-1/Spanish,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "spa",
   :skos/definition "Alpha-3 language code for Spanish; Castilian"})

(def sqi
  {:db/ident :lcc-639-2/sqi,
   :lcc-lr/denotes :lcc-639-1/Albanian,
   :lcc-lr/hasTag "sqi",
   :lcc-lr/identifies :lcc-639-1/Albanian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :lcc-lr/TerminologyCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "sqi",
   :skos/definition "Alpha-3 terminologic language code for Albanian"})

(def srd
  {:db/ident :lcc-639-2/srd,
   :lcc-lr/denotes :lcc-639-1/Sardinian,
   :lcc-lr/hasTag "srd",
   :lcc-lr/identifies :lcc-639-1/Sardinian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "srd",
   :skos/definition "Alpha-3 language code for Sardinian"})

(def srn
  {:db/ident :lcc-639-2/srn,
   :lcc-lr/denotes :lcc-639-2/SrananTongo,
   :lcc-lr/hasTag "srn",
   :lcc-lr/identifies :lcc-639-2/SrananTongo,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "srn",
   :skos/definition "Alpha-3 language code for Sranan Tongo"})

(def srp
  {:db/ident :lcc-639-2/srp,
   :lcc-lr/denotes :lcc-639-1/Serbian,
   :lcc-lr/hasTag "srp",
   :lcc-lr/identifies :lcc-639-1/Serbian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :lcc-lr/TerminologyCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "srp",
   :skos/definition "Alpha-3 terminologic language code for Serbian"})

(def srr
  {:db/ident :lcc-639-2/srr,
   :lcc-lr/denotes :lcc-639-2/Serer,
   :lcc-lr/hasTag "srr",
   :lcc-lr/identifies :lcc-639-2/Serer,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "srr",
   :skos/definition "Alpha-3 language code for Serer"})

(def ssa
  {:db/ident :lcc-639-2/ssa,
   :lcc-lr/denotes :lcc-639-2/NiloSaharanLanguages,
   :lcc-lr/hasTag "ssa",
   :lcc-lr/identifies :lcc-639-2/NiloSaharanLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "ssa",
   :skos/definition "Alpha-3 language code for Nilo-Saharan"})

(def ssw
  {:db/ident :lcc-639-2/ssw,
   :lcc-lr/denotes :lcc-639-1/Swati,
   :lcc-lr/hasTag "ssw",
   :lcc-lr/identifies :lcc-639-1/Swati,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "ssw",
   :skos/definition "Alpha-3 language code for Swati"})

(def suk
  {:db/ident :lcc-639-2/suk,
   :lcc-lr/denotes :lcc-639-2/Sukuma,
   :lcc-lr/hasTag "suk",
   :lcc-lr/identifies :lcc-639-2/Sukuma,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "suk",
   :skos/definition "Alpha-3 language code for Sukuma"})

(def sun
  {:db/ident :lcc-639-2/sun,
   :lcc-lr/denotes :lcc-639-1/Sundanese,
   :lcc-lr/hasTag "sun",
   :lcc-lr/identifies :lcc-639-1/Sundanese,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "sun",
   :skos/definition "Alpha-3 language code for Sundanese"})

(def sus
  {:db/ident :lcc-639-2/sus,
   :lcc-lr/denotes :lcc-639-2/Susu,
   :lcc-lr/hasTag "sus",
   :lcc-lr/identifies :lcc-639-2/Susu,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "sus",
   :skos/definition "Alpha-3 language code for Susu"})

(def sux
  {:db/ident :lcc-639-2/sux,
   :lcc-lr/denotes :lcc-639-2/Sumerian,
   :lcc-lr/hasTag "sux",
   :lcc-lr/identifies :lcc-639-2/Sumerian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "sux",
   :skos/definition "Alpha-3 language code for Sumerian"})

(def swa
  {:db/ident :lcc-639-2/swa,
   :lcc-lr/denotes :lcc-639-1/Swahili,
   :lcc-lr/hasTag "swa",
   :lcc-lr/identifies :lcc-639-1/Swahili,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "swa",
   :skos/definition "Alpha-3 language code for Swahili"})

(def swe
  {:db/ident :lcc-639-2/swe,
   :lcc-lr/denotes :lcc-639-1/Swedish,
   :lcc-lr/hasTag "swe",
   :lcc-lr/identifies :lcc-639-1/Swedish,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "swe",
   :skos/definition "Alpha-3 language code for Swedish"})

(def syc
  {:db/ident :lcc-639-2/syc,
   :lcc-lr/denotes :lcc-639-2/ClassicalSyriac,
   :lcc-lr/hasTag "syc",
   :lcc-lr/identifies :lcc-639-2/ClassicalSyriac,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "syc",
   :skos/definition "Alpha-3 language code for Classical Syriac"})

(def syr
  {:db/ident :lcc-639-2/syr,
   :lcc-lr/denotes :lcc-639-2/Syriac,
   :lcc-lr/hasTag "syr",
   :lcc-lr/identifies :lcc-639-2/Syriac,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "syr",
   :skos/definition "Alpha-3 language code for Syriac"})

(def tah
  {:db/ident :lcc-639-2/tah,
   :lcc-lr/denotes :lcc-639-1/Tahitian,
   :lcc-lr/hasTag "tah",
   :lcc-lr/identifies :lcc-639-1/Tahitian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "tah",
   :skos/definition "Alpha-3 language code for Tahitian"})

(def tai
  {:db/ident :lcc-639-2/tai,
   :lcc-lr/denotes :lcc-639-2/TaiLanguages,
   :lcc-lr/hasTag "tai",
   :lcc-lr/identifies :lcc-639-2/TaiLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "tai",
   :skos/definition "Alpha-3 language code for Tai languages"})

(def tam
  {:db/ident :lcc-639-2/tam,
   :lcc-lr/denotes :lcc-639-1/Tamil,
   :lcc-lr/hasTag "tam",
   :lcc-lr/identifies :lcc-639-1/Tamil,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "tam",
   :skos/definition "Alpha-3 language code for Tamil"})

(def tat
  {:db/ident :lcc-639-2/tat,
   :lcc-lr/denotes :lcc-639-1/Tatar,
   :lcc-lr/hasTag "tat",
   :lcc-lr/identifies :lcc-639-1/Tatar,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "tat",
   :skos/definition "Alpha-3 language code for Tatar"})

(def tel
  {:db/ident :lcc-639-2/tel,
   :lcc-lr/denotes :lcc-639-1/Telugu,
   :lcc-lr/hasTag "tel",
   :lcc-lr/identifies :lcc-639-1/Telugu,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "tel",
   :skos/definition "Alpha-3 language code for Telugu"})

(def tem
  {:db/ident :lcc-639-2/tem,
   :lcc-lr/denotes :lcc-639-2/Timne,
   :lcc-lr/hasTag "tem",
   :lcc-lr/identifies :lcc-639-2/Timne,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "tem",
   :skos/definition "Alpha-3 language code for Timne"})

(def ter
  {:db/ident :lcc-639-2/ter,
   :lcc-lr/denotes :lcc-639-2/Tereno,
   :lcc-lr/hasTag "ter",
   :lcc-lr/identifies :lcc-639-2/Tereno,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "ter",
   :skos/definition "Alpha-3 language code for Tereno"})

(def tet
  {:db/ident :lcc-639-2/tet,
   :lcc-lr/denotes :lcc-639-2/Tetum,
   :lcc-lr/hasTag "tet",
   :lcc-lr/identifies :lcc-639-2/Tetum,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "tet",
   :skos/definition "Alpha-3 language code for Tetum"})

(def tgk
  {:db/ident :lcc-639-2/tgk,
   :lcc-lr/denotes :lcc-639-1/Tajik,
   :lcc-lr/hasTag "tgk",
   :lcc-lr/identifies :lcc-639-1/Tajik,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "tgk",
   :skos/definition "Alpha-3 language code for Tajik"})

(def tgl
  {:db/ident :lcc-639-2/tgl,
   :lcc-lr/denotes :lcc-639-1/Tagalog,
   :lcc-lr/hasTag "tgl",
   :lcc-lr/identifies :lcc-639-1/Tagalog,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "tgl",
   :skos/definition "Alpha-3 language code for Tagalog"})

(def tha
  {:db/ident :lcc-639-2/tha,
   :lcc-lr/denotes :lcc-639-1/Thai,
   :lcc-lr/hasTag "tha",
   :lcc-lr/identifies :lcc-639-1/Thai,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "tha",
   :skos/definition "Alpha-3 language code for Thai"})

(def tib
  {:db/ident :lcc-639-2/tib,
   :lcc-lr/denotes :lcc-639-1/Tibetan,
   :lcc-lr/hasTag "tib",
   :lcc-lr/identifies :lcc-639-1/Tibetan,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/BibliographicCode :lcc-lr/Alpha3Code
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "tib",
   :skos/definition "Alpha-3 bibliographic language code for Tibetan"})

(def tig
  {:db/ident :lcc-639-2/tig,
   :lcc-lr/denotes :lcc-639-2/Tigre,
   :lcc-lr/hasTag "tig",
   :lcc-lr/identifies :lcc-639-2/Tigre,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "tig",
   :skos/definition "Alpha-3 language code for Tigre"})

(def tir
  {:db/ident :lcc-639-2/tir,
   :lcc-lr/denotes :lcc-639-1/Tigrinya,
   :lcc-lr/hasTag "tir",
   :lcc-lr/identifies :lcc-639-1/Tigrinya,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "tir",
   :skos/definition "Alpha-3 language code for Tigrinya"})

(def tiv_1
  {:db/ident :lcc-639-2/tiv_1,
   :lcc-lr/denotes :lcc-639-2/Tiv,
   :lcc-lr/hasTag "tiv",
   :lcc-lr/identifies :lcc-639-2/Tiv,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "tiv",
   :skos/definition "Alpha-3 language code for Tiv"})

(def tkl
  {:db/ident :lcc-639-2/tkl,
   :lcc-lr/denotes :lcc-639-2/Tokelau,
   :lcc-lr/hasTag "tkl",
   :lcc-lr/identifies :lcc-639-2/Tokelau,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "tkl",
   :skos/definition "Alpha-3 language code for Tokelau"})

(def tlh
  {:db/ident :lcc-639-2/tlh,
   :lcc-lr/denotes :lcc-639-2/Klingon,
   :lcc-lr/hasTag "tlh",
   :lcc-lr/identifies :lcc-639-2/Klingon,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "tlh",
   :skos/definition "Alpha-3 language code for Klingon; tlhIngan-Hol"})

(def tli
  {:db/ident :lcc-639-2/tli,
   :lcc-lr/denotes :lcc-639-2/Tlingit,
   :lcc-lr/hasTag "tli",
   :lcc-lr/identifies :lcc-639-2/Tlingit,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "tli",
   :skos/definition "Alpha-3 language code for Tlingit"})

(def tmh
  {:db/ident :lcc-639-2/tmh,
   :lcc-lr/denotes :lcc-639-2/Tamashek,
   :lcc-lr/hasTag "tmh",
   :lcc-lr/identifies :lcc-639-2/Tamashek,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "tmh",
   :skos/definition "Alpha-3 language code for Tamashek"})

(def tog
  {:db/ident :lcc-639-2/tog,
   :lcc-lr/denotes :lcc-639-2/TongaNyasa,
   :lcc-lr/hasTag "tog",
   :lcc-lr/identifies :lcc-639-2/TongaNyasa,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "tog",
   :skos/definition "Alpha-3 language code for Tonga (Nyasa)"})

(def ton
  {:db/ident :lcc-639-2/ton,
   :lcc-lr/denotes :lcc-639-1/Tonga-TongaIslands,
   :lcc-lr/hasTag "ton",
   :lcc-lr/identifies :lcc-639-1/Tonga-TongaIslands,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "ton",
   :skos/definition "Alpha-3 language code for Tonga (Tonga Islands)"})

(def tpi
  {:db/ident :lcc-639-2/tpi,
   :lcc-lr/denotes :lcc-639-2/TokPisin,
   :lcc-lr/hasTag "tpi",
   :lcc-lr/identifies :lcc-639-2/TokPisin,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "tpi",
   :skos/definition "Alpha-3 language code for Tok Pisin"})

(def tsi
  {:db/ident :lcc-639-2/tsi,
   :lcc-lr/denotes :lcc-639-2/Tsimshian,
   :lcc-lr/hasTag "tsi",
   :lcc-lr/identifies :lcc-639-2/Tsimshian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "tsi",
   :skos/definition "Alpha-3 language code for Tsimshian"})

(def tsn
  {:db/ident :lcc-639-2/tsn,
   :lcc-lr/denotes :lcc-639-1/Tswana,
   :lcc-lr/hasTag "tsn",
   :lcc-lr/identifies :lcc-639-1/Tswana,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "tsn",
   :skos/definition "Alpha-3 language code for Tswana"})

(def tso
  {:db/ident :lcc-639-2/tso,
   :lcc-lr/denotes :lcc-639-1/Tsonga,
   :lcc-lr/hasTag "tso",
   :lcc-lr/identifies :lcc-639-1/Tsonga,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "tso",
   :skos/definition "Alpha-3 language code for Tsonga"})

(def tuk
  {:db/ident :lcc-639-2/tuk,
   :lcc-lr/denotes :lcc-639-1/Turkmen,
   :lcc-lr/hasTag "tuk",
   :lcc-lr/identifies :lcc-639-1/Turkmen,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "tuk",
   :skos/definition "Alpha-3 language code for Turkmen"})

(def tum
  {:db/ident :lcc-639-2/tum,
   :lcc-lr/denotes :lcc-639-2/Tumbuka,
   :lcc-lr/hasTag "tum",
   :lcc-lr/identifies :lcc-639-2/Tumbuka,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "tum",
   :skos/definition "Alpha-3 language code for Tumbuka"})

(def tup
  {:db/ident :lcc-639-2/tup,
   :lcc-lr/denotes :lcc-639-2/TupiLanguages,
   :lcc-lr/hasTag "tup",
   :lcc-lr/identifies :lcc-639-2/TupiLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "tup",
   :skos/definition "Alpha-3 language code for Tupi languages"})

(def tur
  {:db/ident :lcc-639-2/tur,
   :lcc-lr/denotes :lcc-639-1/Turkish,
   :lcc-lr/hasTag "tur",
   :lcc-lr/identifies :lcc-639-1/Turkish,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "tur",
   :skos/definition "Alpha-3 language code for Turkish"})

(def tut
  {:db/ident :lcc-639-2/tut,
   :lcc-lr/denotes :lcc-639-2/AltaicLanguages,
   :lcc-lr/hasTag "tut",
   :lcc-lr/identifies :lcc-639-2/AltaicLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "tut",
   :skos/definition "Alpha-3 language code for Altaic languages"})

(def tvl
  {:db/ident :lcc-639-2/tvl,
   :lcc-lr/denotes :lcc-639-2/Tuvalu,
   :lcc-lr/hasTag "tvl",
   :lcc-lr/identifies :lcc-639-2/Tuvalu,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "tvl",
   :skos/definition "Alpha-3 language code for Tuvalu"})

(def twi_1
  {:db/ident :lcc-639-2/twi_1,
   :lcc-lr/denotes :lcc-639-1/Twi,
   :lcc-lr/hasTag "twi",
   :lcc-lr/identifies :lcc-639-1/Twi,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "twi_1",
   :skos/definition "Alpha-3 language code for Twi"})

(def tyv
  {:db/ident :lcc-639-2/tyv,
   :lcc-lr/denotes :lcc-639-2/Tuvinian,
   :lcc-lr/hasTag "tyv",
   :lcc-lr/identifies :lcc-639-2/Tuvinian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "tyv",
   :skos/definition "Alpha-3 language code for Tuvinian"})

(def udm
  {:db/ident :lcc-639-2/udm,
   :lcc-lr/denotes :lcc-639-2/Udmurt,
   :lcc-lr/hasTag "udm",
   :lcc-lr/identifies :lcc-639-2/Udmurt,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "udm",
   :skos/definition "Alpha-3 language code for Udmurt"})

(def uga
  {:db/ident :lcc-639-2/uga,
   :lcc-lr/denotes :lcc-639-2/Ugaritic,
   :lcc-lr/hasTag "uga",
   :lcc-lr/identifies :lcc-639-2/Ugaritic,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "uga",
   :skos/definition "Alpha-3 language code for Ugaritic"})

(def uig
  {:db/ident :lcc-639-2/uig,
   :lcc-lr/denotes :lcc-639-1/Uighur,
   :lcc-lr/hasTag "uig",
   :lcc-lr/identifies :lcc-639-1/Uighur,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "uig",
   :skos/definition "Alpha-3 language code for Uighur; Uyghur"})

(def ukr
  {:db/ident :lcc-639-2/ukr,
   :lcc-lr/denotes :lcc-639-1/Ukrainian,
   :lcc-lr/hasTag "ukr",
   :lcc-lr/identifies :lcc-639-1/Ukrainian,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "ukr",
   :skos/definition "Alpha-3 language code for Ukrainian"})

(def umb
  {:db/ident :lcc-639-2/umb,
   :lcc-lr/denotes :lcc-639-2/Umbundu,
   :lcc-lr/hasTag "umb",
   :lcc-lr/identifies :lcc-639-2/Umbundu,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "umb",
   :skos/definition "Alpha-3 language code for Umbundu"})

(def und
  {:db/ident :lcc-639-2/und,
   :lcc-lr/denotes :lcc-639-2/Undetermined,
   :lcc-lr/hasTag "und",
   :lcc-lr/identifies :lcc-639-2/Undetermined,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "und",
   :skos/definition "Alpha-3 language code for Undetermined"})

(def urd
  {:db/ident :lcc-639-2/urd,
   :lcc-lr/denotes :lcc-639-1/Urdu,
   :lcc-lr/hasTag "urd",
   :lcc-lr/identifies :lcc-639-1/Urdu,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "urd",
   :skos/definition "Alpha-3 language code for Urdu"})

(def uzb
  {:db/ident :lcc-639-2/uzb,
   :lcc-lr/denotes :lcc-639-1/Uzbek,
   :lcc-lr/hasTag "uzb",
   :lcc-lr/identifies :lcc-639-1/Uzbek,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "uzb",
   :skos/definition "Alpha-3 language code for Uzbek"})

(def vai_1
  {:db/ident :lcc-639-2/vai_1,
   :lcc-lr/denotes :lcc-639-2/Vai,
   :lcc-lr/hasTag "vai",
   :lcc-lr/identifies :lcc-639-2/Vai,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "vai",
   :skos/definition "Alpha-3 language code for Vai"})

(def ven
  {:db/ident :lcc-639-2/ven,
   :lcc-lr/denotes :lcc-639-1/Venda,
   :lcc-lr/hasTag "ven",
   :lcc-lr/identifies :lcc-639-1/Venda,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "ven",
   :skos/definition "Alpha-3 language code for Venda"})

(def vie
  {:db/ident :lcc-639-2/vie,
   :lcc-lr/denotes :lcc-639-1/Vietnamese,
   :lcc-lr/hasTag "vie",
   :lcc-lr/identifies :lcc-639-1/Vietnamese,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "vie",
   :skos/definition "Alpha-3 language code for Vietnamese"})

(def vol
  {:db/ident :lcc-639-2/vol,
   :lcc-lr/denotes :lcc-639-1/Volapuk,
   :lcc-lr/hasTag "vol",
   :lcc-lr/identifies :lcc-639-1/Volapuk,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "vol",
   :skos/definition "Alpha-3 language code for Volapuk"})

(def vot
  {:db/ident :lcc-639-2/vot,
   :lcc-lr/denotes :lcc-639-2/Votic,
   :lcc-lr/hasTag "vot",
   :lcc-lr/identifies :lcc-639-2/Votic,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "vot",
   :skos/definition "Alpha-3 language code for Votic"})

(def wak
  {:db/ident :lcc-639-2/wak,
   :lcc-lr/denotes :lcc-639-2/WakashanLanguages,
   :lcc-lr/hasTag "wak",
   :lcc-lr/identifies :lcc-639-2/WakashanLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "wak",
   :skos/definition "Alpha-3 language code for Wakashan languages"})

(def wal
  {:db/ident :lcc-639-2/wal,
   :lcc-lr/denotes :lcc-639-2/Wolaitta,
   :lcc-lr/hasTag "wal",
   :lcc-lr/identifies :lcc-639-2/Wolaitta,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "wal",
   :skos/definition "Alpha-3 language code for Wolaitta"})

(def war
  {:db/ident :lcc-639-2/war,
   :lcc-lr/denotes :lcc-639-2/Waray,
   :lcc-lr/hasTag "war",
   :lcc-lr/identifies :lcc-639-2/Waray,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "war",
   :skos/definition "Alpha-3 language code for Waray"})

(def was
  {:db/ident :lcc-639-2/was,
   :lcc-lr/denotes :lcc-639-2/Washo,
   :lcc-lr/hasTag "was",
   :lcc-lr/identifies :lcc-639-2/Washo,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "was",
   :skos/definition "\n    Alpha-3 language code for Washo\n  "})

(def wel
  {:db/ident :lcc-639-2/wel,
   :lcc-lr/denotes :lcc-639-1/Welsh,
   :lcc-lr/hasTag "wel",
   :lcc-lr/identifies :lcc-639-1/Welsh,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/BibliographicCode :lcc-lr/Alpha3Code
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "wel",
   :skos/definition "Alpha-3 bibliographic language code for Welsh"})

(def wen
  {:db/ident :lcc-639-2/wen,
   :lcc-lr/denotes :lcc-639-2/SorbianLanguages,
   :lcc-lr/hasTag "wen",
   :lcc-lr/identifies :lcc-639-2/SorbianLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "wen",
   :skos/definition "Alpha-3 language code for Sorbian languages"})

(def wln
  {:db/ident :lcc-639-2/wln,
   :lcc-lr/denotes :lcc-639-1/Walloon,
   :lcc-lr/hasTag "wln",
   :lcc-lr/identifies :lcc-639-1/Walloon,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "wln",
   :skos/definition "Alpha-3 language code for Walloon"})

(def wol
  {:db/ident :lcc-639-2/wol,
   :lcc-lr/denotes :lcc-639-1/Wolof,
   :lcc-lr/hasTag "wol",
   :lcc-lr/identifies :lcc-639-1/Wolof,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "wol",
   :skos/definition "Alpha-3 language code for Wolof"})

(def xal
  {:db/ident :lcc-639-2/xal,
   :lcc-lr/denotes :lcc-639-2/Kalmyk,
   :lcc-lr/hasTag "xal",
   :lcc-lr/identifies :lcc-639-2/Kalmyk,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "xal",
   :skos/definition "Alpha-3 language code for Kalmyk; Oirat"})

(def xho
  {:db/ident :lcc-639-2/xho,
   :lcc-lr/denotes :lcc-639-1/Xhosa,
   :lcc-lr/hasTag "xho",
   :lcc-lr/identifies :lcc-639-1/Xhosa,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "xho",
   :skos/definition "Alpha-3 language code for Xhosa"})

(def yao_1
  {:db/ident :lcc-639-2/yao_1,
   :lcc-lr/denotes :lcc-639-2/Yao,
   :lcc-lr/hasTag "yao",
   :lcc-lr/identifies :lcc-639-2/Yao,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "yao",
   :skos/definition "Alpha-3 language code for Yao"})

(def yap
  {:db/ident :lcc-639-2/yap,
   :lcc-lr/denotes :lcc-639-2/Yapese,
   :lcc-lr/hasTag "yap",
   :lcc-lr/identifies :lcc-639-2/Yapese,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "yap",
   :skos/definition "Alpha-3 language code for Yapese"})

(def yid
  {:db/ident :lcc-639-2/yid,
   :lcc-lr/denotes :lcc-639-1/Yiddish,
   :lcc-lr/hasTag "yid",
   :lcc-lr/identifies :lcc-639-1/Yiddish,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "yid",
   :skos/definition "Alpha-3 language code for Yiddish"})

(def yor
  {:db/ident :lcc-639-2/yor,
   :lcc-lr/denotes :lcc-639-1/Yoruba,
   :lcc-lr/hasTag "yor",
   :lcc-lr/identifies :lcc-639-1/Yoruba,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "yor",
   :skos/definition "Alpha-3 language code for Yoruba"})

(def ypk
  {:db/ident :lcc-639-2/ypk,
   :lcc-lr/denotes :lcc-639-2/YupikLanguages,
   :lcc-lr/hasTag "ypk",
   :lcc-lr/identifies :lcc-639-2/YupikLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "ypk",
   :skos/definition "Alpha-3 language code for Yupik languages"})

(def zap
  {:db/ident :lcc-639-2/zap,
   :lcc-lr/denotes :lcc-639-2/Zapotec,
   :lcc-lr/hasTag "zap",
   :lcc-lr/identifies :lcc-639-2/Zapotec,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "zap",
   :skos/definition "Alpha-3 language code for Zapotec"})

(def zbl
  {:db/ident :lcc-639-2/zbl,
   :lcc-lr/denotes :lcc-639-2/Bliss,
   :lcc-lr/hasTag "zbl",
   :lcc-lr/identifies :lcc-639-2/Bliss,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "zbl",
   :skos/definition "Alpha-3 language code for Bliss"})

(def zen
  {:db/ident :lcc-639-2/zen,
   :lcc-lr/denotes :lcc-639-2/Zenaga,
   :lcc-lr/hasTag "zen",
   :lcc-lr/identifies :lcc-639-2/Zenaga,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "zen",
   :skos/definition "Alpha-3 language code for Zenaga"})

(def zgh
  {:db/ident :lcc-639-2/zgh,
   :lcc-lr/denotes :lcc-639-2/StandardMoroccanTamazight,
   :lcc-lr/hasTag "zgh",
   :lcc-lr/identifies :lcc-639-2/StandardMoroccanTamazight,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "zgh",
   :skos/definition "Alpha-3 language code for Standard Moroccan Tamazight"})

(def zha
  {:db/ident :lcc-639-2/zha,
   :lcc-lr/denotes :lcc-639-1/Zhuang,
   :lcc-lr/hasTag "zha",
   :lcc-lr/identifies :lcc-639-1/Zhuang,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "zha",
   :skos/definition "Alpha-3 language code for Zhuang"})

(def zho
  {:db/ident :lcc-639-2/zho,
   :lcc-lr/denotes :lcc-639-1/Chinese,
   :lcc-lr/hasTag "zho",
   :lcc-lr/identifies :lcc-639-1/Chinese,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :lcc-lr/TerminologyCode :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "zho",
   :skos/definition "Alpha-3 terminologic language code for Chinese"})

(def znd
  {:db/ident :lcc-639-2/znd,
   :lcc-lr/denotes :lcc-639-2/ZandeLanguages,
   :lcc-lr/hasTag "znd",
   :lcc-lr/identifies :lcc-639-2/ZandeLanguages,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "znd",
   :skos/definition "Alpha-3 language code for Zande languages"})

(def zul
  {:db/ident :lcc-639-2/zul,
   :lcc-lr/denotes :lcc-639-1/Zulu,
   :lcc-lr/hasTag "zul",
   :lcc-lr/identifies :lcc-639-1/Zulu,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "zul",
   :skos/definition "Alpha-3 language code for Zulu"})

(def zun
  {:db/ident :lcc-639-2/zun,
   :lcc-lr/denotes :lcc-639-2/Zuni,
   :lcc-lr/hasTag "zun",
   :lcc-lr/identifies :lcc-639-2/Zuni,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "zun",
   :skos/definition "Alpha-3 language code for Zuni"})

(def zxx
  {:db/ident :lcc-639-2/zxx,
   :lcc-lr/denotes :lcc-639-2/NoLinguisticContent,
   :lcc-lr/hasTag "zxx",
   :lcc-lr/identifies :lcc-639-2/NoLinguisticContent,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "zxx",
   :skos/definition "Alpha-3 language code for No linguistic content"})

(def zza
  {:db/ident :lcc-639-2/zza,
   :lcc-lr/denotes :lcc-639-2/Zaza,
   :lcc-lr/hasTag "zza",
   :lcc-lr/identifies :lcc-639-2/Zaza,
   :lcc-lr/isMemberOf :lcc-639-2/ISO639-2-CodeSet,
   :rdf/type #{:lcc-lr/Alpha3Code :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"},
   :rdfs/label "zza",
   :skos/definition
   "Alpha-3 language code for Zaza; Dimili; Dimli; Kirdki; Kirmanjki; Zazaki"})

(def urn:uuid:c944f41d-dcf8-5f55-a974-ec7a0e38d694
  {:dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :owl/imports
   #{{:xsd/anyURI
      "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://www.omg.org/spec/LCC/20211101/Languages/ISO639-2-LanguageCodes/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "ISO 639-2 Language Codes Ontology",
   :rdfs/seeAlso
   #{{:xsd/anyURI "http://www.loc.gov/standards/iso639-2/php/code_list.php/"}
     {:xsd/anyURI "https://www.omg.org/spec/LCC/AboutLCC/"}
     {:xsd/anyURI "https://www.omg.org/spec/LCC/Languages/AboutLanguages/"}},
   :skos/changeNote
   #{"The http://www.omg.org/spec/LCC/20151101/Languages/ISO639-2-LanguageCodes.rdf version of this ontology has been revised to reflect the issues addressed by the LCC 1.0 FTF report. The codes themselves are current as of 31 July 2017, based on the US Library of Congress site."
     "The https://www.omg.org/spec/LCC/20190201/Languages/ISO639-2-LanguageCodes.rdf version of this ontology has been revised to reflect addition of the languages Standard Moroccan Tamazight (code zgh) and Montenegrin (code cnr). The codes themselves are current as of 14 February 2019, based on the US Library of Congress site."
     "The https://www.omg.org/spec/LCC/20211101/Languages/ISO639-2-LanguageCodes.rdf version of this ontology has been revised to add a missing axiom for 'identifies' to the alpha-3 language code for the Chinese language, namely 'chi'. The codes themselves are current as of 29 October 2021, based on the US Library of Congress site."},
   :sm/contentLanguage {:xsd/anyURI
                        "https://www.w3.org/TR/owl2-quick-reference/"},
   :sm/copyright #{"Copyright (c) 2015-2021 Object Management Group, Inc."
                   "Copyright (c) 2020-2021 agnos.ai"
                   "Copyright (c) 2015-2017 Unisys"
                   "Copyright (c) 2015-2019 Adaptive Inc."
                   "Copyright (c) 2015-2021 Thematix Partners LLC"},
   :sm/dependsOn
   #{{:xsd/anyURI
      "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"}},
   :sm/fileAbbreviation "lcc-639-2",
   :sm/fileAbstract
   "This ontology represents the subset of the ISO 639 standard that provides the language names and actual codes for ISO 639-2.",
   :sm/filename "ISO639-2-LanguageCodes.rdf",
   :xsd/anyURI
   "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"})