(ns net.wikipunk.rdf.fibo-be-ge-ukj
  "This ontology provides government entities and jurisdictions for the United Kingdom of Great Britain and Northern Ireland use in other FIBO ontologies."
  {:cmns-av/copyright ["Copyright (c) 2016-2023 EDM Council, Inc."
                       "Copyright (c) 2016-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/",
   :dcterms/abstract
   "This ontology provides government entities and jurisdictions for the United Kingdom of Great Britain and Northern Ireland use in other FIBO ontologies.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-GB/"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-2-SubdivisionCodes/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LegalPersons/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/Jurisdiction/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/IdentifiersAndIndices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/GovernmentEntities/GovernmentEntities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LEIEntities/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-ge-ge"
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/",
    "fibo-be-ge-ukj"
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/",
    "fibo-fnd-law-jur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/Jurisdiction/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "lcc-3166-1"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
    "lcc-3166-2"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-2-SubdivisionCodes/",
    "lcc-3166-2-gb"
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-GB/",
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-be-ge-ukj",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/",
   :rdfs/label
   "Government Entities and Jurisdictions for the United Kingdom of Great Britain and Northern Ireland Ontology",
   :skos/changeNote
   ["The http://www.omg.org/spec/EDMC-FIBO/BE/20200201/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions.rdf version of this ontology was modified to add devolved government entities for Scotland, Wales, and Northern Ireland."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."]})

(def EnglandAndWalesJurisdiction
  "jurisdiction of the Courts of England and Wales"
  {:db/ident :fibo-be-ge-ukj/EnglandAndWalesJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-ukj/NationalAssemblyForWales,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-gb/EnglandAndWales,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "England and Wales jurisdiction",
   :rdfs/seeAlso ["https://law.gov.wales/"
                  "https://en.wikipedia.org/wiki/Courts_of_England_and_Wales"],
   :skos/definition "jurisdiction of the Courts of England and Wales"})

(def GovernmentOfGuernsey
  "parliamentary representative democracy that is the central government of the Bailiwick of Guernsey, a self-governing dependency of the United Kingdom and one of the British Channel Islands off the coast of Normandy"
  {:db/ident :fibo-be-ge-ukj/GovernmentOfGuernsey,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-ukj/JurisdictionOfGuernsey,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Guernsey,
   :rdf/type [:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Government of Guernsey"}
                {:rdf/language "fr",
                 :rdf/value    "Gouvèrnément d'Guernési"}],
   :rdfs/seeAlso ["https://www.gov.gg/"],
   :skos/definition
   "parliamentary representative democracy that is the central government of the Bailiwick of Guernsey, a self-governing dependency of the United Kingdom and one of the British Channel Islands off the coast of Normandy"})

(def GovernmentOfJersey
  "central government of the Bailiwick of Jersey, a self-governing dependency of the United Kingdom that is the largest of the Channel Islands between England and France"
  {:db/ident :fibo-be-ge-ukj/GovernmentOfJersey,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-ukj/JurisdictionOfJersey,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Jersey,
   :rdf/type [:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Government of Jersey"}
                {:rdf/language "fr",
                 :rdf/value    "Gouvèrnément d'Jèrri"}],
   :rdfs/seeAlso ["https://www.gov.je/Pages/default.aspx"],
   :skos/definition
   "central government of the Bailiwick of Jersey, a self-governing dependency of the United Kingdom that is the largest of the Channel Islands between England and France"})

(def GovernmentOfScotland
  "devolved government of Scotland"
  {:cmns-av/synonym "Scottish government",
   :db/ident :fibo-be-ge-ukj/GovernmentOfScotland,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-ukj/ScotlandJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-gb/Scotland,
   :rdf/type [:fibo-be-ge-ge/RegionalGovernment
              :owl/NamedIndividual
              :fibo-be-ge-ge/DevolvedGovernment],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Government of Scotland"}
                {:rdf/language "gd",
                 :rdf/value    "Riaghaltas na h-Alba"}],
   :rdfs/seeAlso ["https://en.wikipedia.org/wiki/Scottish_Government"
                  "https://www.gov.scot/"
                  "https://www.parliament.scot/index.aspx"],
   :skos/definition "devolved government of Scotland"})

(def GovernmentOfTheIsleOfMan
  "central government of the Isle of Man, a self-governing British Crown dependency in the Irish Sea between England and Ireland"
  {:cmns-av/synonym "Manx Government",
   :db/ident :fibo-be-ge-ukj/GovernmentOfTheIsleOfMan,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-ukj/JurisdictionOfTheIsleOfMan,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/IsleOfMan,
   :rdf/type [:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Government of the Isle of Man"},
   :rdfs/seeAlso ["https://www.gov.im/"],
   :skos/definition
   "central government of the Isle of Man, a self-governing British Crown dependency in the Irish Sea between England and Ireland"})

(def GovernmentOfTheUnitedKingdom
  "constitutional monarchy that is the government of the United Kingdom of Great Britain and Northern Ireland, including the monarch, who is the head of state and sovereign, prime minister, who is the head of government, and cabinet, parliament (House of Lords and House of Commons), and other agencies and institutions that comprise the government"
  {:cmns-av/synonym "British government",
   :db/ident :fibo-be-ge-ukj/GovernmentOfTheUnitedKingdom,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-ukj/UnitedKingdomJurisdiction,
   :fibo-fnd-rel-rel/governs
   :lcc-3166-1/UnitedKingdomOfGreatBritainAndNorthernIreland,
   :rdf/type [:fibo-be-ge-ge/NationalGovernment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "Government of the United Kingdom",
   :rdfs/seeAlso
   ["https://www.gov.uk/"
    "https://en.wikipedia.org/wiki/Government_of_the_United_Kingdom"
    "http://www.parliament.uk/about/how/role/parliament-government/"],
   :skos/definition
   "constitutional monarchy that is the government of the United Kingdom of Great Britain and Northern Ireland, including the monarch, who is the head of state and sovereign, prime minister, who is the head of government, and cabinet, parliament (House of Lords and House of Commons), and other agencies and institutions that comprise the government"})

(def GuernseyEntity
  "regional sovereignty and polity that is the Bailiwick of Guernsey"
  {:db/ident :fibo-be-ge-ukj/GuernseyEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-1/Guernsey,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-ukj/GovernmentOfGuernsey,
   :rdf/type [:fibo-be-ge-ge/RegionalSovereignty :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "Guernsey entity",
   :skos/definition
   "regional sovereignty and polity that is the Bailiwick of Guernsey"})

(def IsleOfManEntity
  "regional sovereignty and polity that is the Isle of Man"
  {:cmns-av/synonym "Manx entity",
   :db/ident :fibo-be-ge-ukj/IsleOfManEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-1/IsleOfMan,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-ukj/GovernmentOfTheIsleOfMan,
   :rdf/type [:fibo-be-ge-ge/RegionalSovereignty :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "Isle of Man entity",
   :skos/definition "regional sovereignty and polity that is the Isle of Man"})

(def JerseyEntity
  "regional sovereignty and polity that is the Bailiwick of Jersey"
  {:db/ident :fibo-be-ge-ukj/JerseyEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-1/Jersey,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-ukj/GovernmentOfJersey,
   :rdf/type [:fibo-be-ge-ge/RegionalSovereignty :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "Jersey entity",
   :skos/definition
   "regional sovereignty and polity that is the Bailiwick of Jersey"})

(def JurisdictionOfGuernsey
  "jurisdiction of the bailiwick judiciary of Guernsey, headed by its Bailiff, which is derived from a combination of Norman Customary Law and principles taken from English common law and Equity, as well as from statute law enacted by the competent legislature(s)"
  {:db/ident :fibo-be-ge-ukj/JurisdictionOfGuernsey,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-ukj/GovernmentOfGuernsey,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Guernsey,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "jurisdiction of Guernsey",
   :rdfs/seeAlso ["https://en.wikipedia.org/wiki/Guernsey#Politics"],
   :skos/definition
   "jurisdiction of the bailiwick judiciary of Guernsey, headed by its Bailiff, which is derived from a combination of Norman Customary Law and principles taken from English common law and Equity, as well as from statute law enacted by the competent legislature(s)"})

(def JurisdictionOfJersey
  "jurisdiction of the judiciary of Jersey, headed by is the Bailiff, who as well as performing the judicial functions of a chief justice is also the President (presiding officer) of the States of Jersey and has certain civic, ceremonial and executive functions"
  {:db/ident :fibo-be-ge-ukj/JurisdictionOfJersey,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-ukj/GovernmentOfJersey,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Jersey,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "jurisdiction of Jersey",
   :rdfs/seeAlso ["https://en.wikipedia.org/wiki/Law_of_Jersey#Judiciary"],
   :skos/definition
   "jurisdiction of the judiciary of Jersey, headed by is the Bailiff, who as well as performing the judicial functions of a chief justice is also the President (presiding officer) of the States of Jersey and has certain civic, ceremonial and executive functions"})

(def JurisdictionOfTheIsleOfMan
  "jurisdiction of the judiciary of the Isle of Man, including the High Court of Justice of the Isle of Man, consisting of a Civil Division and an appeal division, called the Staff of Government Division"
  {:db/ident :fibo-be-ge-ukj/JurisdictionOfTheIsleOfMan,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-ukj/GovernmentOfTheIsleOfMan,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/IsleOfMan,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "jurisdiction of the Isle of Man",
   :rdfs/seeAlso ["https://en.wikipedia.org/wiki/Judiciary_of_the_Isle_of_Man"],
   :skos/definition
   "jurisdiction of the judiciary of the Isle of Man, including the High Court of Justice of the Isle of Man, consisting of a Civil Division and an appeal division, called the Staff of Government Division"})

(def NationalAssemblyForWales
  "devolved government of Wales"
  {:cmns-av/synonym [{:rdf/language "en",
                      :rdf/value    "Welsh Assembly"}
                     {:rdf/language "cy",
                      :rdf/value    "Senedd"}],
   :db/ident :fibo-be-ge-ukj/NationalAssemblyForWales,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-ukj/EnglandAndWalesJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-gb/Wales,
   :rdf/type [:fibo-be-ge-ge/RegionalGovernment
              :owl/NamedIndividual
              :fibo-be-ge-ge/DevolvedGovernment],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [{:rdf/language "cy",
                 :rdf/value    "Cynulliad Cenedlaethol Cymru"}
                {:rdf/language "en",
                 :rdf/value    "National Assembly for Wales"}],
   :rdfs/seeAlso ["https://en.wikipedia.org/wiki/National_Assembly_for_Wales"
                  "http://www.assembly.wales/en/Pages/Home.aspx"
                  "https://law.gov.wales/constitution-government/devolution/"],
   :skos/definition "devolved government of Wales"})

(def NorthernIrelandAssembly
  "devolved government of Northern Ireland"
  {:db/ident :fibo-be-ge-ukj/NorthernIrelandAssembly,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-ukj/NorthernIrelandJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-gb/NorthernIreland,
   :rdf/type [:fibo-be-ge-ge/RegionalGovernment
              :fibo-be-ge-ge/DevolvedGovernment
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Northern Ireland Assembly"}
                {:rdf/language "ga",
                 :rdf/value    "Tionól Thuaisceart Éireann"}],
   :rdfs/seeAlso ["http://www.niassembly.gov.uk/"
                  "https://en.wikipedia.org/wiki/Northern_Ireland_Assembly"],
   :skos/definition "devolved government of Northern Ireland"})

(def NorthernIrelandEntity
  "regional devolved sovereignty that is Northern Ireland"
  {:db/ident :fibo-be-ge-ukj/NorthernIrelandEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-gb/NorthernIreland,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-ukj/NorthernIrelandAssembly,
   :rdf/type [:fibo-be-ge-ge/RegionalSovereignty :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Northern Ireland entity"},
   :rdfs/seeAlso ["http://www.niassembly.gov.uk/"],
   :skos/definition "regional devolved sovereignty that is Northern Ireland"})

(def NorthernIrelandJurisdiction
  "jurisdiction of the Courts of Northern Ireland"
  {:db/ident :fibo-be-ge-ukj/NorthernIrelandJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-ukj/NorthernIrelandAssembly,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-gb/NorthernIreland,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "Northern Ireland jurisdiction",
   :rdfs/seeAlso ["https://www.justice-ni.gov.uk/topics/courts-and-tribunals"
                  "https://en.wikipedia.org/wiki/Courts_of_Northern_Ireland"],
   :skos/definition "jurisdiction of the Courts of Northern Ireland"})

(def ScotlandEntity
  "regional devolved sovereignty that is Scotland"
  {:db/ident :fibo-be-ge-ukj/ScotlandEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-gb/Scotland,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-ukj/GovernmentOfScotland,
   :rdf/type [:fibo-be-ge-ge/RegionalSovereignty :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Scotland entity"},
   :rdfs/seeAlso ["https://www.gov.scot/"
                  "https://en.wikipedia.org/wiki/Scottish_Government"],
   :skos/definition "regional devolved sovereignty that is Scotland"})

(def ScotlandJurisdiction
  "jurisdiction of the Supreme Courts of Scotland"
  {:db/ident :fibo-be-ge-ukj/ScotlandJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-ukj/GovernmentOfScotland,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-gb/Scotland,
   :rdf/type [:owl/NamedIndividual :fibo-fnd-law-jur/Jurisdiction],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "Scotland jurisdiction",
   :rdfs/seeAlso
   ["https://www.scotcourts.gov.uk/"
    "https://www.scotcourts.gov.uk/the-courts/supreme-courts/about-the-court-of-session"
    "https://en.wikipedia.org/wiki/Courts_of_Scotland"
    "https://www.scotcourts.gov.uk/the-courts/supreme-courts/high-court/about-the-high-court/"],
   :skos/definition "jurisdiction of the Supreme Courts of Scotland"})

(def UnitedKingdomEntity
  "federated sovereignty and polity that is the United Kingdom of Great Britain and Northern Ireland"
  {:db/ident :fibo-be-ge-ukj/UnitedKingdomEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver
   [:lcc-3166-1/Gibraltar
    :lcc-3166-1/UnitedKingdomOfGreatBritainAndNorthernIreland],
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-ukj/GovernmentOfTheUnitedKingdom,
   :rdf/type [:fibo-be-ge-ge/SovereignState :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "United Kingdom entity",
   :rdfs/seeAlso
   ["https://www.gov.uk/"
    "https://en.wikipedia.org/wiki/Government_of_the_United_Kingdom"],
   :skos/definition
   "federated sovereignty and polity that is the United Kingdom of Great Britain and Northern Ireland"})

(def UnitedKingdomJurisdiction
  "jurisdiction of the Supreme Court of the United Kingdom, the tribunal system, including the Asylum and Immigration Tribunal and the Special Immigration Appeals Commission, Employment tribunals and the Employment Appeal Tribunal"
  {:db/ident :fibo-be-ge-ukj/UnitedKingdomJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-ukj/GovernmentOfTheUnitedKingdom,
   :fibo-fnd-law-jur/hasReach
   :lcc-3166-1/UnitedKingdomOfGreatBritainAndNorthernIreland,
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "United Kingdom jurisdiction",
   :rdfs/seeAlso
   ["https://en.wikipedia.org/wiki/Judiciaries_of_the_United_Kingdom"
    "https://www.supremecourt.uk/"
    "https://en.wikipedia.org/wiki/Courts_of_the_United_Kingdom"],
   :skos/definition
   "jurisdiction of the Supreme Court of the United Kingdom, the tribunal system, including the Asylum and Immigration Tribunal and the Special Immigration Appeals Commission, Employment tribunals and the Employment Appeal Tribunal",
   :skos/scopeNote
   "Note that the Courts of the United Kingdom are separated into three separate jurisdictions, the Courts of England and Wales, Courts of Scotland and the Courts of Northern Ireland, as the United Kingdom does not have a single unified judicial system, aside from the courts specifically identified in the definition of this individual."})

(def WelshEntity
  "regional devolved sovereignty that is Wales"
  {:db/ident :fibo-be-ge-ukj/WelshEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-gb/Wales,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-ukj/NationalAssemblyForWales,
   :rdf/type [:fibo-be-ge-ge/RegionalSovereignty :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Welsh entity"},
   :rdfs/seeAlso ["http://www.assembly.wales/en/Pages/Home.aspx"],
   :skos/definition "regional devolved sovereignty that is Wales"})