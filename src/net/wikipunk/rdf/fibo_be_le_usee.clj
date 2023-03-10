(ns net.wikipunk.rdf.fibo-be-le-usee
  "This ontology includes example entities that are companies in the US that issue stock and that are represented in the Dow Jones Industrial Average (DJIA), to demonstrate how to begin to model those entities in FIBO."
  {:cmns-av/copyright ["Copyright (c) 2020-2023 EDM Council, Inc."
                       "Copyright (c) 2020-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/",
   :dcterms/abstract
   "This ontology includes example entities that are companies in the US that issue stock and that are represented in the Dow Jones Industrial Average (DJIA), to demonstrate how to begin to model those entities in FIBO.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/Corporations/Corporations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Organizations/FormalOrganizations/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LEIEntities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/CorporateBodies/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
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
    "fibo-fnd-dt-fd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
    "fibo-fnd-org-fm"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "lcc-3166-1"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
    "lcc-lr" "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-be-le-usee",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/",
   :rdfs/label "US Example Entities",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities.rdf version of this ontology was revised to update a dead link."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities.rdf version of this ontology was revised to make incorporation and registration dates explicit dates and to replace references to the legacy LCC UnitedStates country representation with UnitedStatesOfAmerica."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities.rdf version of this ontology was revised to update the LEI format to use the form published by the GLEIF at data.world."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities.rdf version of this ontology was revised to replace uses of hasTag in Relations with hasTag from LCC, as the more complex union of datatypes in the Relations concept is not needed here."]})

(def AlphabetInc-US-CA
  "publicly held company and for profit corporation legal entity for Alphabet Inc., a Delaware stock corporation"
  {:db/ident :fibo-be-le-usee/AlphabetInc-US-CA,
   :fibo-be-corp-corp/hasDateOfIncorporation
   :fibo-be-le-usee/AlphabetIncIncorporationDate,
   :fibo-be-le-cb/isIncorporatedIn :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :fibo-fnd-org-fm/isDomiciledIn :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-rel-rel/hasLegalName "Alphabet Inc.",
   :rdf/type [:fibo-be-le-cb/ForProfitCorporation
              :fibo-be-corp-corp/PubliclyHeldCompany
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/",
   :rdfs/label "Alphabet Inc. US-CA",
   :skos/definition
   "publicly held company and for profit corporation legal entity for Alphabet Inc., a Delaware stock corporation"})

(def AlphabetIncBusinessEntityIdentifier
  "registration identifier assigned by the Delaware Department of Corporations for Alphabet Inc."
  {:db/ident :fibo-be-le-usee/AlphabetIncBusinessEntityIdentifier,
   :lcc-lr/hasTag "5786925",
   :lcc-lr/identifies :fibo-be-le-usee/AlphabetInc-US-CA,
   :rdf/type [:fibo-be-corp-corp/RegistrationIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/",
   :rdfs/label "Alphabet Inc. business entity identifier",
   :skos/definition
   "registration identifier assigned by the Delaware Department of Corporations for Alphabet Inc."})

(def AlphabetIncIncorporationDate
  "date that Alphabet Inc. was first registered as a corporation in the State of Delaware"
  {:db/ident :fibo-be-le-usee/AlphabetIncIncorporationDate,
   :fibo-fnd-dt-fd/hasDateValue "2015-07-23",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDate :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/",
   :rdfs/label "Alphabet Inc. incorporation date",
   :skos/definition
   "date that Alphabet Inc. was first registered as a corporation in the State of Delaware"})

(def AppleInc-US-CA
  "publicly held company and for profit corporation legal entity for Apple Inc., a California stock corporation"
  {:db/ident :fibo-be-le-usee/AppleInc-US-CA,
   :fibo-be-corp-corp/hasDateOfIncorporation
   :fibo-be-le-usee/AppleIncIncorporationDate,
   :fibo-be-le-cb/isIncorporatedIn
   :fibo-be-ge-usj/StateOfCaliforniaJurisdiction,
   :fibo-fnd-org-fm/isDomiciledIn :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-rel-rel/hasLegalName "Apple Inc.",
   :rdf/type [:fibo-be-le-cb/ForProfitCorporation
              :fibo-be-corp-corp/PubliclyHeldCompany
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/",
   :rdfs/label "Apple Inc. US-CA",
   :skos/definition
   "publicly held company and for profit corporation legal entity for Apple Inc., a California stock corporation"})

(def AppleIncBusinessEntityIdentifier
  "registration identifier assigned by the California Department of Corporations for Apple Inc."
  {:db/ident :fibo-be-le-usee/AppleIncBusinessEntityIdentifier,
   :lcc-lr/hasTag "806592",
   :lcc-lr/identifies :fibo-be-le-usee/AppleInc-US-CA,
   :rdf/type [:fibo-be-corp-corp/RegistrationIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/",
   :rdfs/label "Apple Inc. business entity identifier",
   :rdfs/seeAlso ["https://bizfileonline.sos.ca.gov/search/business"],
   :skos/definition
   "registration identifier assigned by the California Department of Corporations for Apple Inc."})

(def AppleIncIncorporationDate
  "date that Apple Inc. was first registered as a corporation in the State of California"
  {:db/ident :fibo-be-le-usee/AppleIncIncorporationDate,
   :fibo-fnd-dt-fd/hasDateValue "1977-01-03",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDate :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/",
   :rdfs/label "Apple Inc. incorporation date",
   :skos/definition
   "date that Apple Inc. was first registered as a corporation in the State of California"})

(def InternationalBusinessMachinesCorporation-US-NY
  "publicly held company and for profit corporation legal entity for International Business Machines Corporation, a New York domestic business corporation"
  {:db/ident :fibo-be-le-usee/InternationalBusinessMachinesCorporation-US-NY,
   :fibo-be-corp-corp/hasDateOfIncorporation
   :fibo-be-le-usee/InternationalBusinessMachinesCorporationIncorporationDate,
   :fibo-be-le-cb/isIncorporatedIn :fibo-be-ge-usj/StateOfNewYorkJurisdiction,
   :fibo-fnd-org-fm/isDomiciledIn :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-rel-rel/hasLegalName "International Business Machines Corporation",
   :rdf/type [:owl/NamedIndividual
              :fibo-be-le-cb/ForProfitCorporation
              :fibo-be-corp-corp/PubliclyHeldCompany],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/",
   :rdfs/label "International Business Machines Corporation US-NY",
   :skos/definition
   "publicly held company and for profit corporation legal entity for International Business Machines Corporation, a New York domestic business corporation"})

(def InternationalBusinessMachinesCorporationBusinessEntityIdentifier
  "registration identifier assigned by the New York Division of Corporations for International Business Machines Corporation"
  {:db/ident
   :fibo-be-le-usee/InternationalBusinessMachinesCorporationBusinessEntityIdentifier,
   :lcc-lr/hasTag "30059",
   :lcc-lr/identifies
   :fibo-be-le-usee/InternationalBusinessMachinesCorporation-US-NY,
   :rdf/type [:fibo-be-corp-corp/RegistrationIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/",
   :rdfs/label
   "International Business Machines Corporation business entity identifier",
   :skos/definition
   "registration identifier assigned by the New York Division of Corporations for International Business Machines Corporation"})

(def InternationalBusinessMachinesCorporationIncorporationDate
  "date that International Business Machines Corporation was first registered as a corporation in the State of New York"
  {:db/ident
   :fibo-be-le-usee/InternationalBusinessMachinesCorporationIncorporationDate,
   :fibo-fnd-dt-fd/hasDateValue "1911-06-16",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDate :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/",
   :rdfs/label "International Business Machines Corporation incorporation date",
   :skos/definition
   "date that International Business Machines Corporation was first registered as a corporation in the State of New York"})

(def TheCoca-ColaCompany-US-DE
  "publicly held company and for profit corporation legal entity for The Coca-Cola Company, a Delaware corporation"
  {:db/ident :fibo-be-le-usee/TheCoca-ColaCompany-US-DE,
   :fibo-be-corp-corp/hasDateOfIncorporation
   :fibo-be-le-usee/TheCoca-ColaCompanyIncorporationDate,
   :fibo-be-le-cb/isIncorporatedIn :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :fibo-fnd-org-fm/isDomiciledIn :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-rel-rel/hasLegalName "The Coca-Cola Company",
   :rdf/type [:fibo-be-corp-corp/PubliclyHeldCompany
              :fibo-be-le-cb/ForProfitCorporation
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/",
   :rdfs/label "The Coca-Cola Company US-DE",
   :skos/definition
   "publicly held company and for profit corporation legal entity for The Coca-Cola Company, a Delaware corporation"})

(def TheCoca-ColaCompanyBusinessEntityIdentifier
  "registration identifier assigned by the Delaware Division of Corporations for The Coca-Cola Company"
  {:db/ident :fibo-be-le-usee/TheCoca-ColaCompanyBusinessEntityIdentifier,
   :lcc-lr/hasTag "88529",
   :lcc-lr/identifies :fibo-be-le-usee/TheCoca-ColaCompany-US-DE,
   :rdf/type [:fibo-be-corp-corp/RegistrationIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/",
   :rdfs/label "The Coca-Cola Company business entity identifier",
   :skos/definition
   "registration identifier assigned by the Delaware Division of Corporations for The Coca-Cola Company"})

(def TheCoca-ColaCompanyIncorporationDate
  "date that The Coca-Cola Company was first registered as a corporation in the State of Delaware"
  {:db/ident :fibo-be-le-usee/TheCoca-ColaCompanyIncorporationDate,
   :fibo-fnd-dt-fd/hasDateValue "1919-09-05",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDate :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/",
   :rdfs/label "The Coca-Cola Company incorporation date",
   :skos/definition
   "date that The Coca-Cola Company was first registered as a corporation in the State of Delaware"})

(def TheHomeDepotBusinessEntityIdentifier
  "registration identifier assigned by the Delaware Division of Corporations for The Home Depot, Inc."
  {:db/ident :fibo-be-le-usee/TheHomeDepotBusinessEntityIdentifier,
   :lcc-lr/hasTag "856429",
   :lcc-lr/identifies :fibo-be-le-usee/TheHomeDepotInc-US-DE,
   :rdf/type [:fibo-be-corp-corp/RegistrationIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/",
   :rdfs/label "The Home Depot, Inc. business entity identifier",
   :skos/definition
   "registration identifier assigned by the Delaware Division of Corporations for The Home Depot, Inc."})

(def TheHomeDepotInc-US-DE
  "publicly held company and for profit corporation legal entity for The Home Depot, Inc., a Delaware corporation"
  {:db/ident :fibo-be-le-usee/TheHomeDepotInc-US-DE,
   :fibo-be-corp-corp/hasDateOfIncorporation
   :fibo-be-le-usee/TheHomeDepotIncorporationDate,
   :fibo-be-le-cb/isIncorporatedIn :fibo-be-ge-usj/StateOfDelawareJurisdiction,
   :fibo-fnd-org-fm/isDomiciledIn :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-rel-rel/hasLegalName "The Home Depot, Inc.",
   :rdf/type [:fibo-be-le-cb/ForProfitCorporation
              :fibo-be-corp-corp/PubliclyHeldCompany
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/",
   :rdfs/label "The Home Depot, Inc. US-DE",
   :skos/definition
   "publicly held company and for profit corporation legal entity for The Home Depot, Inc., a Delaware corporation"})

(def TheHomeDepotIncorporationDate
  "date that The Home Depot, Inc. was first registered as a corporation in the State of Delaware"
  {:db/ident :fibo-be-le-usee/TheHomeDepotIncorporationDate,
   :fibo-fnd-dt-fd/hasDateValue "1978-06-29",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDate :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/",
   :rdfs/label "The Home Depot, Inc. incorporation date",
   :skos/definition
   "date that The Home Depot, Inc. was first registered as a corporation in the State of Delaware"})

(def TheProctorAndGambleCompany-US-OH
  "publicly held company and for profit corporation legal entity for The Proctor & Gamble Company, an Ohio corporation"
  {:db/ident :fibo-be-le-usee/TheProctorAndGambleCompany-US-OH,
   :fibo-be-corp-corp/hasDateOfIncorporation
   :fibo-be-le-usee/TheProctorAndGambleCompanyIncorporationDate,
   :fibo-be-le-cb/isIncorporatedIn :fibo-be-ge-usj/StateOfOhioJurisdiction,
   :fibo-fnd-org-fm/isDomiciledIn :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-rel-rel/hasLegalName "The Proctor & Gamble Company",
   :rdf/type [:owl/NamedIndividual
              :fibo-be-le-cb/ForProfitCorporation
              :fibo-be-corp-corp/PubliclyHeldCompany],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/",
   :rdfs/label "The Proctor & Gamble Company US-OH",
   :skos/definition
   "publicly held company and for profit corporation legal entity for The Proctor & Gamble Company, an Ohio corporation"})

(def TheProctorAndGambleCompanyBusinessEntityIdentifier
  "registration identifier assigned by the Ohio Department of Corporations for The Proctor & Gamble Company"
  {:db/ident
   :fibo-be-le-usee/TheProctorAndGambleCompanyBusinessEntityIdentifier,
   :lcc-lr/hasTag "20677",
   :lcc-lr/identifies :fibo-be-le-usee/TheProctorAndGambleCompany-US-OH,
   :rdf/type [:fibo-be-corp-corp/RegistrationIdentifier :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/",
   :rdfs/label "The Proctor & Gamble Company business entity identifier",
   :skos/definition
   "registration identifier assigned by the Ohio Department of Corporations for The Proctor & Gamble Company"})

(def TheProctorAndGambleCompanyIncorporationDate
  "date that The Proctor & Gamble Company was first registered as a corporation in the State of Ohio"
  {:db/ident :fibo-be-le-usee/TheProctorAndGambleCompanyIncorporationDate,
   :fibo-fnd-dt-fd/hasDateValue "1905-05-05",
   :rdf/type [:fibo-fnd-dt-fd/ExplicitDate :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/",
   :rdfs/label "The Proctor & Gamble Company incorporation date",
   :skos/definition
   "date that The Proctor & Gamble Company was first registered as a corporation in the State of Ohio"})