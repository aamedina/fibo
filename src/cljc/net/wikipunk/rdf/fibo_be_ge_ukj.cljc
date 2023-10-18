(ns net.wikipunk.rdf.fibo-be-ge-ukj
  {:cmns-av/copyright #{"Copyright (c) 2016-2023 Object Management Group, Inc."
                        "Copyright (c) 2016-2023 EDM Council, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/",
   :dcterms/abstract
   "This ontology provides government entities and jurisdictions for the United Kingdom of Great Britain and Northern Ireland use in other FIBO ontologies.",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
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
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/GovernmentEntities/GovernmentEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-GB/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-2-SubdivisionCodes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Law/Jurisdiction/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/LEIEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Arrangements/IdentifiersAndIndices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-be-ge-ukj",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/",
   :rdfs/label
   "Government Entities and Jurisdictions for the United Kingdom of Great Britain and Northern Ireland Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions.rdf version of this ontology was modified to include separate references to England and Wales in reach of the EnglandAndWalesJurisdiction."
     "The http://www.omg.org/spec/EDMC-FIBO/BE/20200201/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions.rdf version of this ontology was modified to add devolved government entities for Scotland, Wales, and Northern Ireland."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/"})

(def EnglandAndWalesJurisdiction
  {:db/ident :fibo-be-ge-ukj/EnglandAndWalesJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-ukj/NationalAssemblyForWales,
   :fibo-fnd-law-jur/hasReach #{:lcc-3166-2-gb/GB-ENG-Subdivision
                                :lcc-3166-2-gb/GB-WLS-Subdivision},
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "England and Wales jurisdiction",
   :rdfs/seeAlso #{{:xsd/anyURI
                    "https://en.wikipedia.org/wiki/Courts_of_England_and_Wales"}
                   {:xsd/anyURI "https://law.gov.wales/"}},
   :skos/definition "jurisdiction of the Courts of England and Wales"})

(def GovernmentOfGuernsey
  {:db/ident :fibo-be-ge-ukj/GovernmentOfGuernsey,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-ukj/JurisdictionOfGuernsey,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Guernsey,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "fr",
                  :rdf/value    "Gouvèrnément d'Guernési"}
                 {:rdf/language "en",
                  :rdf/value    "Government of Guernsey"}},
   :rdfs/seeAlso {:xsd/anyURI "https://www.gov.gg/"},
   :skos/definition
   "parliamentary representative democracy that is the central government of the Bailiwick of Guernsey, a self-governing dependency of the United Kingdom and one of the British Channel Islands off the coast of Normandy"})

(def GovernmentOfJersey
  {:db/ident :fibo-be-ge-ukj/GovernmentOfJersey,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-ukj/JurisdictionOfJersey,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Jersey,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Government of Jersey"}
                 {:rdf/language "fr",
                  :rdf/value    "Gouvèrnément d'Jèrri"}},
   :rdfs/seeAlso {:xsd/anyURI "https://www.gov.je/Pages/default.aspx"},
   :skos/definition
   "central government of the Bailiwick of Jersey, a self-governing dependency of the United Kingdom that is the largest of the Channel Islands between England and France"})

(def GovernmentOfScotland
  {:cmns-av/synonym "Scottish government",
   :db/ident :fibo-be-ge-ukj/GovernmentOfScotland,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-ukj/ScotlandJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-gb/Scotland,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment
               :fibo-be-ge-ge/DevolvedGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Government of Scotland"}
                 {:rdf/language "gd",
                  :rdf/value    "Riaghaltas na h-Alba"}},
   :rdfs/seeAlso #{{:xsd/anyURI "https://www.parliament.scot/index.aspx"}
                   {:xsd/anyURI "https://www.gov.scot/"}
                   {:xsd/anyURI
                    "https://en.wikipedia.org/wiki/Scottish_Government"}},
   :skos/definition "devolved government of Scotland"})

(def GovernmentOfTheIsleOfMan
  {:cmns-av/synonym "Manx Government",
   :db/ident :fibo-be-ge-ukj/GovernmentOfTheIsleOfMan,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-ukj/JurisdictionOfTheIsleOfMan,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/IsleOfMan,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Government of the Isle of Man"},
   :rdfs/seeAlso {:xsd/anyURI "https://www.gov.im/"},
   :skos/definition
   "central government of the Isle of Man, a self-governing British Crown dependency in the Irish Sea between England and Ireland"})

(def GovernmentOfTheUnitedKingdom
  {:cmns-av/synonym "British government",
   :db/ident :fibo-be-ge-ukj/GovernmentOfTheUnitedKingdom,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-ukj/UnitedKingdomJurisdiction,
   :fibo-fnd-rel-rel/governs
   :lcc-3166-1/UnitedKingdomOfGreatBritainAndNorthernIreland,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/NationalGovernment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Government of the United Kingdom",
   :rdfs/seeAlso
   #{{:xsd/anyURI
      "http://www.parliament.uk/about/how/role/parliament-government/"}
     {:xsd/anyURI "https://www.gov.uk/"}
     {:xsd/anyURI
      "https://en.wikipedia.org/wiki/Government_of_the_United_Kingdom"}},
   :skos/definition
   "constitutional monarchy that is the government of the United Kingdom of Great Britain and Northern Ireland, including the monarch, who is the head of state and sovereign, prime minister, who is the head of government, and cabinet, parliament (House of Lords and House of Commons), and other agencies and institutions that comprise the government"})

(def GuernseyEntity
  {:db/ident :fibo-be-ge-ukj/GuernseyEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-1/Guernsey,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-ukj/GovernmentOfGuernsey,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Guernsey entity",
   :skos/definition
   "regional sovereignty and polity that is the Bailiwick of Guernsey"})

(def IsleOfManEntity
  {:cmns-av/synonym "Manx entity",
   :db/ident :fibo-be-ge-ukj/IsleOfManEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-1/IsleOfMan,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-ukj/GovernmentOfTheIsleOfMan,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Isle of Man entity",
   :skos/definition "regional sovereignty and polity that is the Isle of Man"})

(def JerseyEntity
  {:db/ident :fibo-be-ge-ukj/JerseyEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-1/Jersey,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-ukj/GovernmentOfJersey,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Jersey entity",
   :skos/definition
   "regional sovereignty and polity that is the Bailiwick of Jersey"})

(def JurisdictionOfGuernsey
  {:db/ident :fibo-be-ge-ukj/JurisdictionOfGuernsey,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-ukj/GovernmentOfGuernsey,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Guernsey,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of Guernsey",
   :rdfs/seeAlso {:xsd/anyURI
                  "https://en.wikipedia.org/wiki/Guernsey#Politics"},
   :skos/definition
   "jurisdiction of the bailiwick judiciary of Guernsey, headed by its Bailiff, which is derived from a combination of Norman Customary Law and principles taken from English common law and Equity, as well as from statute law enacted by the competent legislature(s)"})

(def JurisdictionOfJersey
  {:db/ident :fibo-be-ge-ukj/JurisdictionOfJersey,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-ukj/GovernmentOfJersey,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Jersey,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of Jersey",
   :rdfs/seeAlso {:xsd/anyURI
                  "https://en.wikipedia.org/wiki/Law_of_Jersey#Judiciary"},
   :skos/definition
   "jurisdiction of the judiciary of Jersey, headed by is the Bailiff, who as well as performing the judicial functions of a chief justice is also the President (presiding officer) of the States of Jersey and has certain civic, ceremonial and executive functions"})

(def JurisdictionOfTheIsleOfMan
  {:db/ident :fibo-be-ge-ukj/JurisdictionOfTheIsleOfMan,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-ukj/GovernmentOfTheIsleOfMan,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/IsleOfMan,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "jurisdiction of the Isle of Man",
   :rdfs/seeAlso {:xsd/anyURI
                  "https://en.wikipedia.org/wiki/Judiciary_of_the_Isle_of_Man"},
   :skos/definition
   "jurisdiction of the judiciary of the Isle of Man, including the High Court of Justice of the Isle of Man, consisting of a Civil Division and an appeal division, called the Staff of Government Division"})

(def NationalAssemblyForWales
  {:cmns-av/synonym #{{:rdf/language "en",
                       :rdf/value    "Welsh Assembly"}
                      {:rdf/language "cy",
                       :rdf/value    "Senedd"}},
   :db/ident :fibo-be-ge-ukj/NationalAssemblyForWales,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-ukj/EnglandAndWalesJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-gb/Wales,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment
               :fibo-be-ge-ge/DevolvedGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "National Assembly for Wales"}
                 {:rdf/language "cy",
                  :rdf/value    "Cynulliad Cenedlaethol Cymru"}},
   :rdfs/seeAlso
   #{{:xsd/anyURI "https://en.wikipedia.org/wiki/National_Assembly_for_Wales"}
     {:xsd/anyURI "https://law.gov.wales/constitution-government/devolution/"}
     {:xsd/anyURI "http://www.assembly.wales/en/Pages/Home.aspx"}},
   :skos/definition "devolved government of Wales"})

(def NorthernIrelandAssembly
  {:db/ident :fibo-be-ge-ukj/NorthernIrelandAssembly,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-ukj/NorthernIrelandJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-2-gb/NorthernIreland,
   :rdf/type #{:fibo-be-ge-ge/RegionalGovernment
               :fibo-be-ge-ge/DevolvedGovernment :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Northern Ireland Assembly"}
                 {:rdf/language "ga",
                  :rdf/value    "Tionól Thuaisceart Éireann"}},
   :rdfs/seeAlso #{{:xsd/anyURI "http://www.niassembly.gov.uk/"}
                   {:xsd/anyURI
                    "https://en.wikipedia.org/wiki/Northern_Ireland_Assembly"}},
   :skos/definition "devolved government of Northern Ireland"})

(def NorthernIrelandEntity
  {:db/ident :fibo-be-ge-ukj/NorthernIrelandEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-gb/NorthernIreland,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-ukj/NorthernIrelandAssembly,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Northern Ireland entity"},
   :rdfs/seeAlso {:xsd/anyURI "http://www.niassembly.gov.uk/"},
   :skos/definition "regional devolved sovereignty that is Northern Ireland"})

(def NorthernIrelandJurisdiction
  {:db/ident :fibo-be-ge-ukj/NorthernIrelandJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-ukj/NorthernIrelandAssembly,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-gb/NorthernIreland,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Northern Ireland jurisdiction",
   :rdfs/seeAlso
   #{{:xsd/anyURI "https://en.wikipedia.org/wiki/Courts_of_Northern_Ireland"}
     {:xsd/anyURI "https://www.justice-ni.gov.uk/topics/courts-and-tribunals"}},
   :skos/definition "jurisdiction of the Courts of Northern Ireland"})

(def ScotlandEntity
  {:db/ident :fibo-be-ge-ukj/ScotlandEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-gb/Scotland,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-ukj/GovernmentOfScotland,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Scotland entity"},
   :rdfs/seeAlso #{{:xsd/anyURI "https://www.gov.scot/"}
                   {:xsd/anyURI
                    "https://en.wikipedia.org/wiki/Scottish_Government"}},
   :skos/definition "regional devolved sovereignty that is Scotland"})

(def ScotlandJurisdiction
  {:db/ident :fibo-be-ge-ukj/ScotlandJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-ukj/GovernmentOfScotland,
   :fibo-fnd-law-jur/hasReach :lcc-3166-2-gb/Scotland,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "Scotland jurisdiction",
   :rdfs/seeAlso
   #{{:xsd/anyURI
      "https://www.scotcourts.gov.uk/the-courts/supreme-courts/about-the-court-of-session"}
     {:xsd/anyURI "https://en.wikipedia.org/wiki/Courts_of_Scotland"}
     {:xsd/anyURI "https://www.scotcourts.gov.uk/"}
     {:xsd/anyURI
      "https://www.scotcourts.gov.uk/the-courts/supreme-courts/high-court/about-the-high-court/"}},
   :skos/definition "jurisdiction of the Supreme Courts of Scotland"})

(def UnitedKingdomEntity
  {:db/ident :fibo-be-ge-ukj/UnitedKingdomEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver
   #{:lcc-3166-1/UnitedKingdomOfGreatBritainAndNorthernIreland
     :lcc-3166-1/Gibraltar},
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-ukj/GovernmentOfTheUnitedKingdom,
   :rdf/type #{:fibo-be-ge-ge/SovereignState :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "United Kingdom entity",
   :rdfs/seeAlso
   #{{:xsd/anyURI "https://www.gov.uk/"}
     {:xsd/anyURI
      "https://en.wikipedia.org/wiki/Government_of_the_United_Kingdom"}},
   :skos/definition
   "federated sovereignty and polity that is the United Kingdom of Great Britain and Northern Ireland"})

(def UnitedKingdomJurisdiction
  {:db/ident :fibo-be-ge-ukj/UnitedKingdomJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-ukj/GovernmentOfTheUnitedKingdom,
   :fibo-fnd-law-jur/hasReach
   :lcc-3166-1/UnitedKingdomOfGreatBritainAndNorthernIreland,
   :rdf/type #{:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label "United Kingdom jurisdiction",
   :rdfs/seeAlso
   #{{:xsd/anyURI
      "https://en.wikipedia.org/wiki/Judiciaries_of_the_United_Kingdom"}
     {:xsd/anyURI "https://www.supremecourt.uk/"}
     {:xsd/anyURI
      "https://en.wikipedia.org/wiki/Courts_of_the_United_Kingdom"}},
   :skos/definition
   "jurisdiction of the Supreme Court of the United Kingdom, the tribunal system, including the Asylum and Immigration Tribunal and the Special Immigration Appeals Commission, Employment tribunals and the Employment Appeal Tribunal",
   :skos/scopeNote
   "Note that the Courts of the United Kingdom are separated into three separate jurisdictions, the Courts of England and Wales, Courts of Scotland and the Courts of Northern Ireland, as the United Kingdom does not have a single unified judicial system, aside from the courts specifically identified in the definition of this individual."})

(def WelshEntity
  {:db/ident :fibo-be-ge-ukj/WelshEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver :lcc-3166-2-gb/Wales,
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-ukj/NationalAssemblyForWales,
   :rdf/type #{:owl/NamedIndividual :fibo-be-ge-ge/RegionalSovereignty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Welsh entity"},
   :rdfs/seeAlso {:xsd/anyURI "http://www.assembly.wales/en/Pages/Home.aspx"},
   :skos/definition "regional devolved sovereignty that is Wales"})

(def urn:uuid:5bbf55a9-b76d-5a1b-8fdb-3fac34c38122
  {:cmns-av/copyright #{"Copyright (c) 2016-2023 Object Management Group, Inc."
                        "Copyright (c) 2016-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology provides government entities and jurisdictions for the United Kingdom of Great Britain and Northern Ireland use in other FIBO ontologies.",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/GovernmentEntities/GovernmentEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-GB/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-2-SubdivisionCodes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Law/Jurisdiction/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/LEIEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Arrangements/IdentifiersAndIndices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/"},
   :rdf/type :owl/Ontology,
   :rdfs/label
   "Government Entities and Jurisdictions for the United Kingdom of Great Britain and Northern Ireland Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions.rdf version of this ontology was modified to include separate references to England and Wales in reach of the EnglandAndWalesJurisdiction."
     "The http://www.omg.org/spec/EDMC-FIBO/BE/20200201/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions.rdf version of this ontology was modified to add devolved government entities for Scotland, Wales, and Northern Ireland."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/"})