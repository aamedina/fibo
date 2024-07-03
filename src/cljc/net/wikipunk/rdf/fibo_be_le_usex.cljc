(ns net.wikipunk.rdf.fibo-be-le-usex
  {:cmns-av/copyright
   #{"Copyright (c) 2022-2024 EDM Council, Inc."
     "Copyright (c) 2022-2024 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/LegalEntities/NorthAmericanEntities/USExampleExecutives/",
   :dcterms/abstract
   "This ontology includes example corporate executives and other people to demonstrate how to model them using FIBO.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-dsg" "https://www.omg.org/spec/Commons/Designators/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "cmns-pts" "https://www.omg.org/spec/Commons/PartiesAndSituations/",
    "cmns-rlcmp" "https://www.omg.org/spec/Commons/RolesAndCompositions/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-le-usee"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/",
    "fibo-be-le-usex"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleExecutives/",
    "fibo-be-oac-cpty"
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/ControlParties/",
    "fibo-be-oac-exec"
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/",
    "fibo-fnd-aap-ppl"
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
    "fibo-fnd-org-fm"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations/",
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
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/OwnershipAndControl/Executives/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/OwnershipAndControl/ControlParties/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Organizations/FormalOrganizations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/AgentsAndPeople/People/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/LegalEntities/NorthAmericanEntities/USExampleExecutives/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-be-le-usex",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleExecutives/",
   :rdfs/label "US Example Executives",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleExecutives/"})

(def AppleIncAsControlledParty
  {:cmns-rlcmp/isPlayedBy :fibo-be-le-usee/AppleInc-US-CA,
   :db/ident :fibo-be-le-usex/AppleIncAsControlledParty,
   :rdf/type #{:owl/NamedIndividual :fibo-be-oac-cpty/ControlledParty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleExecutives/"},
   :rdfs/label "Apple Inc. as controlled party",
   :skos/definition
   "Apple Inc. in its role as a corporation that is controlled to some degree by its corporate officers"})

(def AppleIncAsEmployer
  {:cmns-rlcmp/isPlayedBy :fibo-be-le-usee/AppleInc-US-CA,
   :db/ident :fibo-be-le-usex/AppleIncAsEmployer,
   :rdf/type #{:fibo-fnd-org-fm/Employer :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleExecutives/"},
   :rdfs/label "Apple Inc. as employer",
   :skos/definition
   "Apple Inc. in its role as a corporation that has employees"})

(def EmploymentOfKatherineAdamsAtAppleInc
  {:db/ident :fibo-be-le-usex/EmploymentOfKatherineAdamsAtAppleInc,
   :fibo-fnd-org-fm/hasEmployedParty :fibo-be-le-usex/KatherineAdamsAsEmployee,
   :fibo-fnd-org-fm/hasEmployingParty :fibo-be-le-usex/AppleIncAsEmployer,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-org-fm/Employment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleExecutives/"},
   :rdfs/label "Employment of Katherine Adams at Apple Inc.",
   :skos/definition
   "situation representing the relationship between Apple Inc. as an employer and Katherine Adams as an employee"})

(def EmploymentOfTimCookAtAppleInc
  {:cmns-pts/holdsDuring :fibo-be-le-usex/TimCookPeriodOfEmployment,
   :db/ident :fibo-be-le-usex/EmploymentOfTimCookAtAppleInc,
   :fibo-fnd-org-fm/hasEmployedParty :fibo-be-le-usex/TimCookAsEmployee,
   :fibo-fnd-org-fm/hasEmployingParty :fibo-be-le-usex/AppleIncAsEmployer,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-org-fm/Employment},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleExecutives/"},
   :rdfs/label "Employment of Tim Cook at Apple Inc.",
   :skos/definition
   "situation representing the relationship between Apple Inc. as an employer and Tim Cook as an employee"})

(def KatherineAdams
  {:cmns-dsg/hasName :fibo-be-le-usex/KatherineAdamsFullLegalName,
   :db/ident :fibo-be-le-usex/KatherineAdams,
   :fibo-fnd-aap-ppl/hasCitizenship :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-aap-ppl/hasDateOfBirth :fibo-be-le-usex/KatherineAdamsDateOfBirth,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-aap-ppl/Person},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleExecutives/"},
   :rdfs/label "Katherine Adams",
   :skos/definition "person that is an American attorney and corporate lawyer"})

(def KatherineAdamsAsEmployee
  {:cmns-rlcmp/isPlayedBy :fibo-be-le-usex/KatherineAdams,
   :db/ident :fibo-be-le-usex/KatherineAdamsAsEmployee,
   :fibo-fnd-org-fm/isEmployedIn
   :fibo-be-le-usex/EmploymentOfKatherineAdamsAtAppleInc,
   :fibo-fnd-org-fm/isEmployeeOf :fibo-be-le-usex/AppleIncAsEmployer,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-org-fm/Employee},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleExecutives/"},
   :rdfs/label "Katherine Adams as employee",
   :skos/definition
   "Katherine Adams in the role of being employed by Apple Inc."})

(def KatherineAdamsAsGeneralCounsel
  {:cmns-rlcmp/isPlayedBy :fibo-be-le-usex/KatherineAdams,
   :db/ident :fibo-be-le-usex/KatherineAdamsAsGeneralCounsel,
   :fibo-be-oac-exec/isOfficerOf :fibo-be-le-usex/AppleIncAsControlledParty,
   :rdf/type #{:fibo-be-oac-exec/CorporateOfficer :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleExecutives/"},
   :rdfs/label "Katherine Adams as General Counsel",
   :skos/definition
   "Katherine Adams in the role of Senior Vice President of Legal and Global Security and General Counsel of Apple Inc."})

(def KatherineAdamsDateOfBirth
  {:cmns-dt/hasDateValue "1964-04-20",
   :db/ident :fibo-be-le-usex/KatherineAdamsDateOfBirth,
   :rdf/type #{:fibo-fnd-aap-ppl/DateOfBirth :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleExecutives/"},
   :rdfs/label "Katherine Adams date of birth",
   :skos/definition "date on which Katherine Adams was born"})

(def KatherineAdamsFullLegalName
  {:cmns-dsg/isNameOf :fibo-be-le-usex/KatherineAdams,
   :db/ident :fibo-be-le-usex/KatherineAdamsFullLegalName,
   :fibo-fnd-aap-ppl/hasFullLegalName "Katherine Leatherman Adams",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-aap-ppl/PersonName},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleExecutives/"},
   :rdfs/label "Katherine Adams full legal name",
   :skos/definition
   "name that is on Katherine Adams' birth certificate and that she uses for legal purposes"})

(def TimCook
  {:cmns-dsg/hasName :fibo-be-le-usex/TimCookFullLegalName,
   :db/ident :fibo-be-le-usex/TimCook,
   :fibo-fnd-aap-ppl/hasCitizenship :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-aap-ppl/hasDateOfBirth :fibo-be-le-usex/TimCookDateOfBirth,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-aap-ppl/Person},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleExecutives/"},
   :rdfs/label "Tim Cook",
   :skos/definition
   "person that lives in Palo Alto, California in the San Francisco Bay Area"})

(def TimCookAsChiefExecutiveOfficer
  {:cmns-rlcmp/isPlayedBy :fibo-be-le-usex/TimCook,
   :db/ident :fibo-be-le-usex/TimCookAsChiefExecutiveOfficer,
   :fibo-be-oac-exec/isOfficerOf :fibo-be-le-usex/AppleIncAsControlledParty,
   :rdf/type #{:fibo-be-oac-exec/ChiefExecutiveOfficer :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleExecutives/"},
   :rdfs/label "Tim Cook as Chief Executive Officer",
   :skos/definition "Tim Cook in the role of CEO of Apple Inc."})

(def TimCookAsEmployee
  {:cmns-rlcmp/isPlayedBy :fibo-be-le-usex/TimCook,
   :db/ident :fibo-be-le-usex/TimCookAsEmployee,
   :fibo-fnd-org-fm/isEmployedIn :fibo-be-le-usex/EmploymentOfTimCookAtAppleInc,
   :fibo-fnd-org-fm/isEmployeeOf :fibo-be-le-usex/AppleIncAsEmployer,
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-org-fm/Employee},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleExecutives/"},
   :rdfs/label "Tim Cook as employee",
   :skos/definition "Tim Cook in the role of being employed by Apple Inc."})

(def TimCookDateOfBirth
  {:cmns-dt/hasDateValue "1960-11-01",
   :db/ident :fibo-be-le-usex/TimCookDateOfBirth,
   :rdf/type #{:fibo-fnd-aap-ppl/DateOfBirth :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleExecutives/"},
   :rdfs/label "Tim Cook date of birth",
   :skos/definition "date on which Tim Cook was born"})

(def TimCookFullLegalName
  {:cmns-dsg/isNameOf :fibo-be-le-usex/TimCook,
   :db/ident :fibo-be-le-usex/TimCookFullLegalName,
   :fibo-fnd-aap-ppl/hasFullLegalName "Timothy Donald Cook",
   :rdf/type #{:owl/NamedIndividual :fibo-fnd-aap-ppl/PersonName},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleExecutives/"},
   :rdfs/label "Tim Cook full legal name",
   :skos/definition
   "name that is on Tim Cook's birth certificate and that he uses for legal purposes"})

(def TimCookHireDate
  {:cmns-dt/hasDateValue "1998-03-01",
   :db/ident :fibo-be-le-usex/TimCookHireDate,
   :rdf/type #{:owl/NamedIndividual :cmns-dt/ExplicitDate},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleExecutives/"},
   :rdfs/label "Tim Cook hire date",
   :skos/definition "date on which Tim Cook was hired by Apple Inc."})

(def TimCookPeriodOfEmployment
  {:cmns-dt/hasStartDate :fibo-be-le-usex/TimCookHireDate,
   :db/ident :fibo-be-le-usex/TimCookPeriodOfEmployment,
   :rdf/type #{:owl/NamedIndividual :cmns-dt/DatePeriod},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleExecutives/"},
   :rdfs/label "Tim Cook period of employment",
   :skos/definition
   "date period reflecting when Tim Cook was (is) employed by Apple Inc."})

(def urn:uuid:a7b6dcda-5420-55af-bdb6-99a7af84e301
  {:cmns-av/copyright
   #{"Copyright (c) 2022-2024 EDM Council, Inc."
     "Copyright (c) 2022-2024 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology includes example corporate executives and other people to demonstrate how to model them using FIBO.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/OwnershipAndControl/Executives/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/OwnershipAndControl/ControlParties/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Organizations/FormalOrganizations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/AgentsAndPeople/People/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/LegalEntities/NorthAmericanEntities/USExampleExecutives/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "US Example Executives",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleExecutives/"})