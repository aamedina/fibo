(ns net.wikipunk.rdf.fibo-be-ge-weuj
  ^{:base
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/WesternEuropeGovernmentEntitiesAndJurisdictions/",
    :namespaces
    {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
     "dcterms" "http://purl.org/dc/terms/",
     "fibo-be-ge-ge"
     "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/",
     "fibo-be-ge-weuj"
     "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/WesternEuropeGovernmentEntitiesAndJurisdictions/",
     "fibo-fnd-law-jur"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Law/Jurisdiction/",
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
    :prefix "fibo-be-ge-weuj",
    :source
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/WesternEuropeGovernmentEntitiesAndJurisdictions/"}
  {:cmns-av/copyright #{"Copyright (c) 2020-2023 Object Management Group, Inc."
                        "Copyright (c) 2020-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology provides government entities and jurisdictions for countries that are defined as being part of Western Europe in the U.N. M49 codes, primarily those that are considered independent countries in ISO 3166, or are important from a banking perspective.",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/Jurisdiction/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/GovernmentEntities/GovernmentEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/GovernmentEntities/EuropeanJurisdiction/WesternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Western Europe Government Entities and Jurisdictions Ontology",
   :skos/changeNote
   "The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/WesternEuropeGovernmentEntitiesAndJurisdictions.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary.",
   :skos/scopeNote
   "The initial version of this ontology reflects the national level only.",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/WesternEuropeGovernmentEntitiesAndJurisdictions/"})

(def AustrianEntity
  {:db/ident :fibo-be-ge-weuj/AustrianEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Austria,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-weuj/GovernmentOfTheRepublicOfAustria,
   :rdf/type #{:fibo-be-ge-ge/FederatedSovereignty :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/WesternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Austrian entity",
   :skos/definition "federated sovereignty and polity that is Austria"})

(def BelgianEntity
  {:db/ident :fibo-be-ge-weuj/BelgianEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Belgium,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-weuj/GovernmentOfTheKingdomOfBelgium,
   :rdf/type #{:fibo-be-ge-ge/FederatedSovereignty :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/WesternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Belgian entity",
   :skos/definition "federated sovereignty and polity that is Belgium"})

(def FrenchEntity
  {:db/ident :fibo-be-ge-weuj/FrenchEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver
   #{:lcc-3166-1/France :lcc-3166-1/FrenchSouthernTerritories},
   :fibo-be-ge-ge/hasSharedSovereigntyOver
   #{:lcc-3166-1/NewCaledonia :lcc-3166-1/SaintMartin :lcc-3166-1/Martinique
     :lcc-3166-1/FrenchGuiana :lcc-3166-1/Mayotte :lcc-3166-1/Reunion
     :lcc-3166-1/SaintBarthelemy :lcc-3166-1/WallisAndFutuna
     :lcc-3166-1/SaintPierreAndMiquelon :lcc-3166-1/FrenchPolynesia
     :lcc-3166-1/Guadeloupe},
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-weuj/GovernmentOfTheFrenchRepublic,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/WesternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "French entity",
   :skos/definition "sovereign state and polity that is France"})

(def GermanEntity
  {:db/ident :fibo-be-ge-weuj/GermanEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Germany,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-weuj/GovernmentOfTheFederalRepublicOfGermany,
   :rdf/type #{:fibo-be-ge-ge/FederatedSovereignty :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/WesternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "German entity",
   :skos/definition "federated sovereignty and polity that is Germany"})

(def GovernmentOfTheFederalRepublicOfGermany
  {:db/ident :fibo-be-ge-weuj/GovernmentOfTheFederalRepublicOfGermany,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-weuj/JurisdictionOfGermany,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Germany,
   :rdf/type #{:fibo-be-ge-ge/FederalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/WesternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "de",
                  :rdf/value    "Bundesrepublik Deutschland"}
                 {:rdf/language "en",
                  :rdf/value "Government of the Federal Republic of Germany"}},
   :rdfs/seeAlso {:xsd/anyURI "https://www.bundesregierung.de/breg-en"},
   :skos/definition
   "democratic, federal parliamentary republic led by a chancellor, where federal legislative power is vested in the parliament, consisting of the Bundestag and the Bundesrat"})

(def GovernmentOfTheFrenchRepublic
  {:db/ident :fibo-be-ge-weuj/GovernmentOfTheFrenchRepublic,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-weuj/JurisdictionOfFrance,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/France,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/WesternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Government of the French Republic"}
                 {:rdf/language "fr",
                  :rdf/value    "Gouvernement de la République française"}},
   :rdfs/seeAlso {:xsd/anyURI "https://www.gouvernement.fr/en/news"},
   :skos/definition
   "unitary semi-presidential constitutional republic, built on strong representative democratic roots, based on the Constitution of the Fifth Republic which was approved in 1958"})

(def GovernmentOfTheGrandDuchyOfLuxembourg
  {:db/ident :fibo-be-ge-weuj/GovernmentOfTheGrandDuchyOfLuxembourg,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-weuj/JurisdictionOfLuxembourg,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Luxembourg,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/WesternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Government of the Grand Duchy of Luxembourg",
   :rdfs/seeAlso {:xsd/anyURI "https://gouvernement.lu/en.html"},
   :skos/definition
   "representative democracy that is a unitary, parliamentary constitutional monarchy, headed by the Grand Duke, which is the world's only remaining sovereign grand duchy"})

(def GovernmentOfTheKingdomOfBelgium
  {:db/ident :fibo-be-ge-weuj/GovernmentOfTheKingdomOfBelgium,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-weuj/JurisdictionOfBelgium,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Belgium,
   :rdf/type #{:fibo-be-ge-ge/FederalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/WesternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Government of the Kingdom of Belgium"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.belgium.be/en/about_belgium/government"},
   :skos/definition
   "federal parliamentary constitutional monarchy, whose head of state is the king, though with limited prerogatives"})

(def GovernmentOfTheNetherlands
  {:db/ident :fibo-be-ge-weuj/GovernmentOfTheNetherlands,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-weuj/JurisdictionOfTheNetherlands,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Netherlands,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/WesternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "nl",
                  :rdf/value    "Rijksoverheid"}
                 {:rdf/language "en",
                  :rdf/value    "Government of the Netherlands"}},
   :rdfs/seeAlso {:xsd/anyURI "https://www.government.nl/"},
   :skos/definition
   "parliamentary constitutional monarchy with a unitary structure, with its monarch as head of state"})

(def GovernmentOfThePrincipalityOfLiechtenstein
  {:db/ident :fibo-be-ge-weuj/GovernmentOfThePrincipalityOfLiechtenstein,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-weuj/JurisdictionOfLiechtenstein,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Liechtenstein,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/WesternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Government of the Principality of Liechtenstein",
   :rdfs/seeAlso
   {:xsd/anyURI
    "https://www.liechtenstein.li/en/country-and-people/state/government/"},
   :skos/definition
   "semi-constitutional monarchy headed by the Prince of Liechtenstein, with an elected parliament that enacts the law, as well as being a direct democracy, where voters can propose and enact constitutional amendments and legislation independently of the legislature"})

(def GovernmentOfThePrincipalityOfMonaco
  {:db/ident :fibo-be-ge-weuj/GovernmentOfThePrincipalityOfMonaco,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-weuj/JurisdictionOfMonaco,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Monaco,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/WesternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Government of the Principality of Monaco",
   :rdfs/seeAlso {:xsd/anyURI "https://en.gouv.mc/"},
   :skos/definition
   "constitutional monarchy with the Sovereign Prince of Monaco as head of state, and a Minister of State as the head of government, who presides over a five-member Council of Government"})

(def GovernmentOfTheRepublicOfAustria
  {:db/ident :fibo-be-ge-weuj/GovernmentOfTheRepublicOfAustria,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-weuj/JurisdictionOfAustria,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Austria,
   :rdf/type #{:fibo-be-ge-ge/FederalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/WesternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Government of the Republic of Austria"},
   :rdfs/seeAlso {:xsd/anyURI "https://www.bundeskanzleramt.gv.at/en.html"},
   :skos/definition
   "federal, representative democratic republic, with nine states, whose head of state is the Federal President (Bundespräsident), and head of the federal government is the Federal Chancellor (Bundeskanzler)"})

(def GovernmentOfTheSwissConfederation
  {:db/ident :fibo-be-ge-weuj/GovernmentOfTheSwissConfederation,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-weuj/JurisdictionOfSwitzerland,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Switzerland,
   :rdf/type #{:fibo-be-ge-ge/FederalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/WesternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Government of the Swiss Confederation",
   :rdfs/seeAlso {:xsd/anyURI "https://www.admin.ch/gov/en/start.html/"},
   :skos/definition
   "federal semi-direct democracy under a multi-party presidential directorial republic, which represents a confederation of 26 cantons and communes with executive, legislative and judiciary branches"})

(def JurisdictionOfAustria
  {:db/ident :fibo-be-ge-weuj/JurisdictionOfAustria,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-weuj/GovernmentOfTheRepublicOfAustria,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Austria,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/WesternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of Austria",
   :skos/definition
   "jurisdiction of the judiciary of Austria (österreichische Justiz), consisting of general courts (ordentliche Gerichte) and courts of public law (Gerichte öffentlichen Rechts)"})

(def JurisdictionOfBelgium
  {:db/ident :fibo-be-ge-weuj/JurisdictionOfBelgium,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-weuj/GovernmentOfTheKingdomOfBelgium,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Belgium,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/WesternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of Belgium",
   :skos/definition
   "jurisdiction of the judiciary of Belgium, which is based on civil law and originates from the Napoleonic code, including the Court of Cassation and the courts of appeal, one level below"})

(def JurisdictionOfFrance
  {:db/ident :fibo-be-ge-weuj/JurisdictionOfFrance,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-weuj/GovernmentOfTheFrenchRepublic,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/France,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/WesternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of France",
   :skos/definition
   "jurisdiction of the judiciary of France, which is part of the Ministry of Justice based on a civil legal system, headed by the Court of Cassation and Council of State"})

(def JurisdictionOfGermany
  {:db/ident :fibo-be-ge-weuj/JurisdictionOfGermany,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-weuj/GovernmentOfTheFederalRepublicOfGermany,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Germany,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/WesternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "German jurisdiction",
   :rdfs/seeAlso {:xsd/anyURI
                  "https://en.wikipedia.org/wiki/Judiciary_of_Germany/"},
   :skos/definition
   "jurisdiction of the judiciary of Germany, whose civil law system is based on Roman law with some references to early Germanic law, headed by the Bundesverfassungsgericht (German supreme court) responsible for constitutional matters"})

(def JurisdictionOfLiechtenstein
  {:db/ident :fibo-be-ge-weuj/JurisdictionOfLiechtenstein,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-weuj/GovernmentOfThePrincipalityOfLiechtenstein,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Liechtenstein,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/WesternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of Liechtenstein",
   :skos/definition
   "jurisdiction of the judiciary of Liechtenstein, the system of courts and tribunals which interpret and apply the law in Liechtenstein, including the Regional Court at Vaduz, the Princely High Court of Appeal at Vaduz, the Princely Supreme Court, the Administrative Court, and the State Court"})

(def JurisdictionOfLuxembourg
  {:db/ident :fibo-be-ge-weuj/JurisdictionOfLuxembourg,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-weuj/GovernmentOfTheGrandDuchyOfLuxembourg,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Luxembourg,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/WesternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of Luxembourg",
   :rdfs/seeAlso
   {:xsd/anyURI
    "https://gouvernement.lu/en/systeme-politique/cours-tribunaux.html"},
   :skos/definition
   "jurisdiction of the judiciary of Luxembourg, the system of courts and tribunals which interpret and apply the law in Luxembourg, including three lower tribunals (justices de paix; in Esch-sur-Alzette, the city of Luxembourg, and Diekirch), two district tribunals (Luxembourg and Diekirch), and a Superior Court of Justice (Luxembourg), which includes the Court of Appeal and the Court of Cassation"})

(def JurisdictionOfMonaco
  {:db/ident :fibo-be-ge-weuj/JurisdictionOfMonaco,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-weuj/GovernmentOfThePrincipalityOfMonaco,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Monaco,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/WesternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of Monaco",
   :skos/definition
   "jurisdiction of the judiciary of Monaco, the system of courts and tribunals which interpret and apply the law in Monaco, including the Monegasque Supreme Court, one of the highest courts of law in the city-state of Monaco for judicial appeals as well as ensuring the constitution of Monaco is upheld"})

(def JurisdictionOfSwitzerland
  {:db/ident :fibo-be-ge-weuj/JurisdictionOfSwitzerland,
   :fibo-be-ge-ge/isJurisdictionOf
   :fibo-be-ge-weuj/GovernmentOfTheSwissConfederation,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Switzerland,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/WesternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of Switzerland",
   :rdfs/seeAlso
   {:xsd/anyURI
    "https://www.ch.ch/en/demokratie/federalism/separation-of-powers/switzerlands-courts/"},
   :skos/definition
   "jurisdiction of the Federal Supreme Court, Federal Criminal Court, Federal Administrative Court, and the Federal Patent Court representing the judiciary branch at the federal level in Switzerland"})

(def JurisdictionOfTheNetherlands
  {:db/ident :fibo-be-ge-weuj/JurisdictionOfTheNetherlands,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-weuj/GovernmentOfTheNetherlands,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Netherlands,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/WesternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of the Netherlands",
   :rdfs/seeAlso {:xsd/anyURI
                  "https://en.wikipedia.org/wiki/Judiciary_of_the_Netherlands"},
   :skos/definition
   "jurisdiction of the judiciary of the Netherlands, the system of courts which interprets and applies the law in the Netherlands"})

(def LiechtensteinerEntity
  {:db/ident :fibo-be-ge-weuj/LiechtensteinerEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Liechtenstein,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-weuj/GovernmentOfThePrincipalityOfLiechtenstein,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/WesternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Liechtensteiner entity",
   :skos/definition "sovereign state and polity that is Liechtenstein"})

(def LuxembourgerEntity
  {:db/ident :fibo-be-ge-weuj/LuxembourgerEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Luxembourg,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-weuj/GovernmentOfTheGrandDuchyOfLuxembourg,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/WesternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Luxembourger entity",
   :skos/definition "sovereign state and polity that is Luxembourg"})

(def MonegasqueEntity
  {:db/ident :fibo-be-ge-weuj/MonegasqueEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Monaco,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-weuj/GovernmentOfThePrincipalityOfMonaco,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/WesternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Monegasque entity",
   :skos/definition "sovereign state and polity that is Monaco"})

(def NetherlandsEntity
  {:db/ident :fibo-be-ge-weuj/NetherlandsEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Netherlands,
   :fibo-be-ge-ge/hasSharedSovereigntyOver #{:lcc-3166-1/SintMaarten
                                             :lcc-3166-1/Bonaire},
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-weuj/GovernmentOfTheNetherlands,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/WesternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Netherlands entity",
   :skos/definition "sovereign state and polity that is the Netherlands"})

(def SwissEntity
  {:db/ident :fibo-be-ge-weuj/SwissEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Switzerland,
   :fibo-be-ge-ge/isRepresentedBy
   :fibo-be-ge-weuj/GovernmentOfTheSwissConfederation,
   :rdf/type #{:fibo-be-ge-ge/FederatedSovereignty :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/WesternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Swiss entity",
   :skos/definition "federated sovereignty and polity that is Switzerland"})

(def urn:uuid:a78e31ca-3291-5e95-a0ae-74bfc036db93
  {:cmns-av/copyright #{"Copyright (c) 2020-2023 Object Management Group, Inc."
                        "Copyright (c) 2020-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology provides government entities and jurisdictions for countries that are defined as being part of Western Europe in the U.N. M49 codes, primarily those that are considered independent countries in ISO 3166, or are important from a banking perspective.",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/Jurisdiction/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/GovernmentEntities/GovernmentEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/GovernmentEntities/EuropeanJurisdiction/WesternEuropeGovernmentEntitiesAndJurisdictions/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Western Europe Government Entities and Jurisdictions Ontology",
   :skos/changeNote
   "The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/WesternEuropeGovernmentEntitiesAndJurisdictions.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary.",
   :skos/scopeNote
   "The initial version of this ontology reflects the national level only.",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/WesternEuropeGovernmentEntitiesAndJurisdictions/"})