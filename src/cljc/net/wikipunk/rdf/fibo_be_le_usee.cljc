(ns net.wikipunk.rdf.fibo-be-le-usee
  {:cmns-av/copyright #{"Copyright (c) 2020-2023 Object Management Group, Inc."
                        "Copyright (c) 2020-2023 EDM Council, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/",
   :dcterms/abstract
   "This ontology includes example entities that are companies in the US that issue stock and that are represented in the Dow Jones Industrial Average (DJIA), to demonstrate how to begin to model those entities in FIBO.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-corp-corp"
    "https://spec.edmcouncil.org/fibo/ontology/BE/Corporations/Corporations/",
    "fibo-be-ge-usj"
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/",
    "fibo-be-le-cb"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/CorporateBodies/",
    "fibo-be-le-lei"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities/",
    "fibo-be-le-usee"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/",
    "fibo-fnd-org-fm"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations/",
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
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/LegalEntities/LEIEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/Corporations/Corporations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/LegalEntities/CorporateBodies/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Organizations/FormalOrganizations/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-be-le-usee",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/",
   :rdfs/label "US Example Entities",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities.rdf version of this ontology was revised to update the LEI format to use the form published by the GLEIF at data.world."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities.rdf version of this ontology was revised to make incorporation and registration dates explicit dates and to replace references to the legacy LCC UnitedStates country representation with UnitedStatesOfAmerica."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities.rdf version of this ontology was revised to replace uses of hasTag in Relations with hasTag from LCC, as the more complex union of datatypes in the Relations concept is not needed here."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities.rdf version of this ontology was revised to update a dead link."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/"})

(def AlphabetInc-US-CA
  {:db/ident :fibo-be-le-usee/AlphabetInc-US-CA,
   :fibo-be-corp-corp/hasDateOfIncorporation
   :fibo-be-le-usee/AlphabetIncIncorporationDate,
   :fibo-be-le-cb/isIncorporatedIn :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :fibo-fnd-org-fm/isDomiciledIn :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-rel-rel/hasLegalName "Alphabet Inc.",
   :rdf/type #{:owl/NamedIndividual :fibo-be-le-cb/ForProfitCorporation
               :fibo-be-corp-corp/PubliclyHeldCompany},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/"},
   :rdfs/label "Alphabet Inc. US-CA",
   :skos/definition
   "publicly held company and for profit corporation legal entity for Alphabet Inc., a Delaware stock corporation"})

(def AlphabetIncBusinessEntityIdentifier
  {:cmns-id/identifies :fibo-be-le-usee/AlphabetInc-US-CA,
   :db/ident :fibo-be-le-usee/AlphabetIncBusinessEntityIdentifier,
   :fibo-fnd-rel-rel/hasTag "5786925",
   :rdf/type #{:fibo-be-corp-corp/RegistrationIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/"},
   :rdfs/label "Alphabet Inc. business entity identifier",
   :skos/definition
   "registration identifier assigned by the Delaware Department of Corporations for Alphabet Inc."})

(def AlphabetIncIncorporationDate
  {:cmns-dt/hasDateValue "2015-07-23",
   :db/ident :fibo-be-le-usee/AlphabetIncIncorporationDate,
   :rdf/type #{:owl/NamedIndividual :cmns-dt/ExplicitDate},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/"},
   :rdfs/label "Alphabet Inc. incorporation date",
   :skos/definition
   "date that Alphabet Inc. was first registered as a corporation in the State of Delaware"})

(def AppleInc-US-CA
  {:db/ident :fibo-be-le-usee/AppleInc-US-CA,
   :fibo-be-corp-corp/hasDateOfIncorporation
   :fibo-be-le-usee/AppleIncIncorporationDate,
   :fibo-be-le-cb/isIncorporatedIn
   :fibo-be-ge-usj/StateOfCaliforniaJurisdiction,
   :fibo-fnd-org-fm/isDomiciledIn :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-rel-rel/hasLegalName "Apple Inc.",
   :rdf/type #{:owl/NamedIndividual :fibo-be-le-cb/ForProfitCorporation
               :fibo-be-corp-corp/PubliclyHeldCompany},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/"},
   :rdfs/label "Apple Inc. US-CA",
   :skos/definition
   "publicly held company and for profit corporation legal entity for Apple Inc., a California stock corporation"})

(def AppleIncBusinessEntityIdentifier
  {:cmns-id/identifies :fibo-be-le-usee/AppleInc-US-CA,
   :db/ident :fibo-be-le-usee/AppleIncBusinessEntityIdentifier,
   :fibo-fnd-rel-rel/hasTag "806592",
   :rdf/type #{:fibo-be-corp-corp/RegistrationIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/"},
   :rdfs/label "Apple Inc. business entity identifier",
   :rdfs/seeAlso {:xsd/anyURI
                  "https://bizfileonline.sos.ca.gov/search/business"},
   :skos/definition
   "registration identifier assigned by the California Department of Corporations for Apple Inc."})

(def AppleIncIncorporationDate
  {:cmns-dt/hasDateValue "1977-01-03",
   :db/ident :fibo-be-le-usee/AppleIncIncorporationDate,
   :rdf/type #{:owl/NamedIndividual :cmns-dt/ExplicitDate},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/"},
   :rdfs/label "Apple Inc. incorporation date",
   :skos/definition
   "date that Apple Inc. was first registered as a corporation in the State of California"})

(def InternationalBusinessMachinesCorporation-US-NY
  {:db/ident :fibo-be-le-usee/InternationalBusinessMachinesCorporation-US-NY,
   :fibo-be-corp-corp/hasDateOfIncorporation
   :fibo-be-le-usee/InternationalBusinessMachinesCorporationIncorporationDate,
   :fibo-be-le-cb/isIncorporatedIn :fibo-be-ge-usj/StateOfNewYorkJurisdiction,
   :fibo-fnd-org-fm/isDomiciledIn :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-rel-rel/hasLegalName "International Business Machines Corporation",
   :rdf/type #{:owl/NamedIndividual :fibo-be-le-cb/ForProfitCorporation
               :fibo-be-corp-corp/PubliclyHeldCompany},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/"},
   :rdfs/label "International Business Machines Corporation US-NY",
   :skos/definition
   "publicly held company and for profit corporation legal entity for International Business Machines Corporation, a New York domestic business corporation"})

(def InternationalBusinessMachinesCorporationBusinessEntityIdentifier
  {:cmns-id/identifies
   :fibo-be-le-usee/InternationalBusinessMachinesCorporation-US-NY,
   :db/ident
   :fibo-be-le-usee/InternationalBusinessMachinesCorporationBusinessEntityIdentifier,
   :fibo-fnd-rel-rel/hasTag "30059",
   :rdf/type #{:fibo-be-corp-corp/RegistrationIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/"},
   :rdfs/label
   "International Business Machines Corporation business entity identifier",
   :skos/definition
   "registration identifier assigned by the New York Division of Corporations for International Business Machines Corporation"})

(def InternationalBusinessMachinesCorporationIncorporationDate
  {:cmns-dt/hasDateValue "1911-06-16",
   :db/ident
   :fibo-be-le-usee/InternationalBusinessMachinesCorporationIncorporationDate,
   :rdf/type #{:owl/NamedIndividual :cmns-dt/ExplicitDate},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/"},
   :rdfs/label "International Business Machines Corporation incorporation date",
   :skos/definition
   "date that International Business Machines Corporation was first registered as a corporation in the State of New York"})

(def TheCoca-ColaCompany-US-DE
  {:db/ident :fibo-be-le-usee/TheCoca-ColaCompany-US-DE,
   :fibo-be-corp-corp/hasDateOfIncorporation
   :fibo-be-le-usee/TheCoca-ColaCompanyIncorporationDate,
   :fibo-be-le-cb/isIncorporatedIn :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :fibo-fnd-org-fm/isDomiciledIn :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-rel-rel/hasLegalName "The Coca-Cola Company",
   :rdf/type #{:owl/NamedIndividual :fibo-be-le-cb/ForProfitCorporation
               :fibo-be-corp-corp/PubliclyHeldCompany},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/"},
   :rdfs/label "The Coca-Cola Company US-DE",
   :skos/definition
   "publicly held company and for profit corporation legal entity for The Coca-Cola Company, a Delaware corporation"})

(def TheCoca-ColaCompanyBusinessEntityIdentifier
  {:cmns-id/identifies :fibo-be-le-usee/TheCoca-ColaCompany-US-DE,
   :db/ident :fibo-be-le-usee/TheCoca-ColaCompanyBusinessEntityIdentifier,
   :fibo-fnd-rel-rel/hasTag "88529",
   :rdf/type #{:fibo-be-corp-corp/RegistrationIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/"},
   :rdfs/label "The Coca-Cola Company business entity identifier",
   :skos/definition
   "registration identifier assigned by the Delaware Division of Corporations for The Coca-Cola Company"})

(def TheCoca-ColaCompanyIncorporationDate
  {:cmns-dt/hasDateValue "1919-09-05",
   :db/ident :fibo-be-le-usee/TheCoca-ColaCompanyIncorporationDate,
   :rdf/type #{:owl/NamedIndividual :cmns-dt/ExplicitDate},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/"},
   :rdfs/label "The Coca-Cola Company incorporation date",
   :skos/definition
   "date that The Coca-Cola Company was first registered as a corporation in the State of Delaware"})

(def TheHomeDepotBusinessEntityIdentifier
  {:cmns-id/identifies :fibo-be-le-usee/TheHomeDepotInc-US-DE,
   :db/ident :fibo-be-le-usee/TheHomeDepotBusinessEntityIdentifier,
   :fibo-fnd-rel-rel/hasTag "856429",
   :rdf/type #{:fibo-be-corp-corp/RegistrationIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/"},
   :rdfs/label "The Home Depot, Inc. business entity identifier",
   :skos/definition
   "registration identifier assigned by the Delaware Division of Corporations for The Home Depot, Inc."})

(def TheHomeDepotInc-US-DE
  {:db/ident :fibo-be-le-usee/TheHomeDepotInc-US-DE,
   :fibo-be-corp-corp/hasDateOfIncorporation
   :fibo-be-le-usee/TheHomeDepotIncorporationDate,
   :fibo-be-le-cb/isIncorporatedIn :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :fibo-fnd-org-fm/isDomiciledIn :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-rel-rel/hasLegalName "The Home Depot, Inc.",
   :rdf/type #{:owl/NamedIndividual :fibo-be-le-cb/ForProfitCorporation
               :fibo-be-corp-corp/PubliclyHeldCompany},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/"},
   :rdfs/label "The Home Depot, Inc. US-DE",
   :skos/definition
   "publicly held company and for profit corporation legal entity for The Home Depot, Inc., a Delaware corporation"})

(def TheHomeDepotIncorporationDate
  {:cmns-dt/hasDateValue "1978-06-29",
   :db/ident :fibo-be-le-usee/TheHomeDepotIncorporationDate,
   :rdf/type #{:owl/NamedIndividual :cmns-dt/ExplicitDate},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/"},
   :rdfs/label "The Home Depot, Inc. incorporation date",
   :skos/definition
   "date that The Home Depot, Inc. was first registered as a corporation in the State of Delaware"})

(def TheProctorAndGambleCompany-US-OH
  {:db/ident :fibo-be-le-usee/TheProctorAndGambleCompany-US-OH,
   :fibo-be-corp-corp/hasDateOfIncorporation
   :fibo-be-le-usee/TheProctorAndGambleCompanyIncorporationDate,
   :fibo-be-le-cb/isIncorporatedIn :fibo-be-ge-usj/StateOfOhioJurisdiction,
   :fibo-fnd-org-fm/isDomiciledIn :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-rel-rel/hasLegalName "The Proctor & Gamble Company",
   :rdf/type #{:owl/NamedIndividual :fibo-be-le-cb/ForProfitCorporation
               :fibo-be-corp-corp/PubliclyHeldCompany},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/"},
   :rdfs/label "The Proctor & Gamble Company US-OH",
   :skos/definition
   "publicly held company and for profit corporation legal entity for The Proctor & Gamble Company, an Ohio corporation"})

(def TheProctorAndGambleCompanyBusinessEntityIdentifier
  {:cmns-id/identifies :fibo-be-le-usee/TheProctorAndGambleCompany-US-OH,
   :db/ident
   :fibo-be-le-usee/TheProctorAndGambleCompanyBusinessEntityIdentifier,
   :fibo-fnd-rel-rel/hasTag "20677",
   :rdf/type #{:fibo-be-corp-corp/RegistrationIdentifier :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/"},
   :rdfs/label "The Proctor & Gamble Company business entity identifier",
   :skos/definition
   "registration identifier assigned by the Ohio Department of Corporations for The Proctor & Gamble Company"})

(def TheProctorAndGambleCompanyIncorporationDate
  {:cmns-dt/hasDateValue "1905-05-05",
   :db/ident :fibo-be-le-usee/TheProctorAndGambleCompanyIncorporationDate,
   :rdf/type #{:owl/NamedIndividual :cmns-dt/ExplicitDate},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/"},
   :rdfs/label "The Proctor & Gamble Company incorporation date",
   :skos/definition
   "date that The Proctor & Gamble Company was first registered as a corporation in the State of Ohio"})

(def urn:uuid:aa902058-1d8f-54a9-847e-cf9024122dbd
  {:cmns-id/identifies :fibo-be-le-usee/TheCoca-ColaCompany-US-DE,
   :fibo-fnd-rel-rel/hasTag "UWJKFUJFZ02DKWI3RY53",
   :rdf/type           #{:owl/NamedIndividual
                         :fibo-be-le-lei/LegalEntityIdentifier},
   :rdfs/label         "The Coca-Cola Company legal entity identifier",
   :skos/definition    "legal entity identifier for The Coca-Cola Company",
   :xsd/anyURI         "https://rdf.gleif.org/L1/L-UWJKFUJFZ02DKWI3RY53-LEI"})

(def urn:uuid:3cec2df6-8392-595f-85ba-e2d10541d4b6
  {:cmns-av/copyright #{"Copyright (c) 2020-2023 Object Management Group, Inc."
                        "Copyright (c) 2020-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology includes example entities that are companies in the US that issue stock and that are represented in the Dow Jones Industrial Average (DJIA), to demonstrate how to begin to model those entities in FIBO.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/LegalEntities/LEIEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/Corporations/Corporations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/LegalEntities/CorporateBodies/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Organizations/FormalOrganizations/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "US Example Entities",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities.rdf version of this ontology was revised to update the LEI format to use the form published by the GLEIF at data.world."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities.rdf version of this ontology was revised to make incorporation and registration dates explicit dates and to replace references to the legacy LCC UnitedStates country representation with UnitedStatesOfAmerica."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities.rdf version of this ontology was revised to replace uses of hasTag in Relations with hasTag from LCC, as the more complex union of datatypes in the Relations concept is not needed here."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities.rdf version of this ontology was revised to update a dead link."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/"})

(def urn:uuid:101c71f6-2093-5177-900e-543f50e7da35
  {:cmns-id/identifies :fibo-be-le-usee/TheProctorAndGambleCompany-US-OH,
   :fibo-fnd-rel-rel/hasTag "2572IBTT8CCZW6AU4141",
   :rdf/type #{:owl/NamedIndividual :fibo-be-le-lei/LegalEntityIdentifier},
   :rdfs/label "The Proctor & Gamble Company legal entity identifier",
   :skos/definition "legal entity identifier for The Proctor & Gamble Company",
   :xsd/anyURI "https://rdf.gleif.org/L1/L-2572IBTT8CCZW6AU4141-LEI"})

(def urn:uuid:af07bc7d-5c44-5a0a-bb6b-b5ab0c9cdf75
  {:cmns-id/identifies :fibo-be-le-usee/TheHomeDepotInc-US-DE,
   :fibo-fnd-rel-rel/hasTag "QEKMOTMBBKA8I816DO57",
   :rdf/type           #{:owl/NamedIndividual
                         :fibo-be-le-lei/LegalEntityIdentifier},
   :rdfs/label         "The Home Depot, Inc. legal entity identifier",
   :skos/definition    "legal entity identifier for The Home Depot, Inc.",
   :xsd/anyURI         "https://rdf.gleif.org/L1/L-QEKMOTMBBKA8I816DO57-LEI"})

(def urn:uuid:5470c4ad-71de-5a27-973e-499c416bed30
  {:cmns-id/identifies :fibo-be-le-usee/AppleInc-US-CA,
   :fibo-fnd-rel-rel/hasTag "HWUPKR0MPOU8FGXBT394",
   :rdf/type           #{:owl/NamedIndividual
                         :fibo-be-le-lei/LegalEntityIdentifier},
   :rdfs/label         "Apple Inc. legal entity identifier",
   :skos/definition    "legal entity identifier for Apple Inc.",
   :xsd/anyURI         "https://rdf.gleif.org/L1/L-HWUPKR0MPOU8FGXBT394-LEI"})

(def urn:uuid:d47074cb-d849-58c8-a85f-4ab966de7bf8
  {:cmns-id/identifies :fibo-be-le-usee/AlphabetInc-US-CA,
   :fibo-fnd-rel-rel/hasTag "5493006MHB84DD0ZWV18",
   :rdf/type           #{:owl/NamedIndividual
                         :fibo-be-le-lei/LegalEntityIdentifier},
   :rdfs/label         "Alphabet Inc. legal entity identifier",
   :skos/definition    "legal entity identifier for Alphabet Inc.",
   :xsd/anyURI         "https://rdf.gleif.org/L1/L-5493006MHB84DD0ZWV18-LEI"})

(def urn:uuid:81c51c10-bbac-5419-bc7a-809690f6c535
  {:cmns-id/identifies
   :fibo-be-le-usee/InternationalBusinessMachinesCorporation-US-NY,
   :fibo-fnd-rel-rel/hasTag "VGRQXHF3J8VDLUA7XE92",
   :rdf/type #{:owl/NamedIndividual :fibo-be-le-lei/LegalEntityIdentifier},
   :rdfs/label
   "International Business Machines Corporation legal entity identifier",
   :skos/definition
   "legal entity identifier for International Business Machines Corporation",
   :xsd/anyURI "https://rdf.gleif.org/L1/L-VGRQXHF3J8VDLUA7XE92-LEI"})