(ns net.wikipunk.rdf.fibo-be-le-usex
  "This ontology includes example corporate executives and other people to demonstrate how to begin to model those entities in FIBO."
  {:cmns-av/copyright ["Copyright (c) 2022-2023 EDM Council, Inc."
                       "Copyright (c) 2022-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleExecutives/",
   :dcterms/abstract
   "This ontology includes example corporate executives and other people to demonstrate how to begin to model those entities in FIBO.",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   ["https://www.omg.org/spec/Commons/DatesAndTimes/"
    "https://www.omg.org/spec/Commons/Designators/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/AgentsAndPeople/People/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Organizations/FormalOrganizations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/BusinessDates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/OwnershipAndControl/Executives/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/OwnershipAndControl/ControlParties/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Parties/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Roles/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/AgentsAndPeople/Agents/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/NorthAmericanEntities/USExampleExecutives/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-dsg" "https://www.omg.org/spec/Commons/Designators/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
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
    "fibo-fnd-dt-bd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/BusinessDates/",
    "fibo-fnd-org-fm"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations/",
    "fibo-fnd-pty-rl"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles/",
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
   :rdfa/prefix "fibo-be-le-usex",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleExecutives/",
   :rdfs/label "US Example Executives"})

(def AppleIncAsControlledParty
  "Apple Inc. in its role as a corporation that is controlled to some degree by its corporate officers"
  {:db/ident :fibo-be-le-usex/AppleIncAsControlledParty,
   :fibo-fnd-rel-rel/hasIdentity :fibo-be-le-usee/AppleInc-US-CA,
   :rdf/type [:fibo-be-oac-cpty/ControlledParty :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleExecutives/",
   :rdfs/label "Apple Inc. as controlled party",
   :skos/definition
   "Apple Inc. in its role as a corporation that is controlled to some degree by its corporate officers"})

(def AppleIncAsEmployer
  "Apple Inc. in its role as a corporation that has employees"
  {:db/ident :fibo-be-le-usex/AppleIncAsEmployer,
   :fibo-fnd-rel-rel/hasIdentity :fibo-be-le-usee/AppleInc-US-CA,
   :rdf/type [:fibo-fnd-org-fm/Employer :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleExecutives/",
   :rdfs/label "Apple Inc. as employer",
   :skos/definition
   "Apple Inc. in its role as a corporation that has employees"})

(def EmploymentOfKatherineAdamsAtAppleInc
  "situation representing the relationship between Apple Inc. as an employer and Katherine Adams as an employee"
  {:db/ident :fibo-be-le-usex/EmploymentOfKatherineAdamsAtAppleInc,
   :fibo-fnd-org-fm/hasEmployedParty :fibo-be-le-usex/KatherineAdamsAsEmployee,
   :fibo-fnd-org-fm/hasEmployingParty :fibo-be-le-usex/AppleIncAsEmployer,
   :rdf/type [:fibo-fnd-org-fm/Employment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleExecutives/",
   :rdfs/label "Employment of Katherine Adams at Apple Inc.",
   :skos/definition
   "situation representing the relationship between Apple Inc. as an employer and Katherine Adams as an employee"})

(def EmploymentOfTimCookAtAppleInc
  "situation representing the relationship between Apple Inc. as an employer and Tim Cook as an employee"
  {:db/ident :fibo-be-le-usex/EmploymentOfTimCookAtAppleInc,
   :fibo-fnd-dt-bd/holdsDuring :fibo-be-le-usex/TimCookPeriodOfEmployment,
   :fibo-fnd-org-fm/hasEmployedParty :fibo-be-le-usex/TimCookAsEmployee,
   :fibo-fnd-org-fm/hasEmployingParty :fibo-be-le-usex/AppleIncAsEmployer,
   :rdf/type [:fibo-fnd-org-fm/Employment :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleExecutives/",
   :rdfs/label "Employment of Tim Cook at Apple Inc.",
   :skos/definition
   "situation representing the relationship between Apple Inc. as an employer and Tim Cook as an employee"})

(def KatherineAdams
  "person that is an American attorney and corporate lawyer"
  {:cmns-dsg/hasName :fibo-be-le-usex/KatherineAdamsFullLegalName,
   :db/ident :fibo-be-le-usex/KatherineAdams,
   :fibo-fnd-aap-ppl/hasCitizenship :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-aap-ppl/hasDateOfBirth :fibo-be-le-usex/KatherineAdamsDateOfBirth,
   :rdf/type [:fibo-fnd-aap-ppl/Person :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleExecutives/",
   :rdfs/label "Katherine Adams",
   :skos/definition "person that is an American attorney and corporate lawyer"})

(def KatherineAdamsAsEmployee
  "Katherine Adams in the role of being employed by Apple Inc."
  {:db/ident :fibo-be-le-usex/KatherineAdamsAsEmployee,
   :fibo-fnd-org-fm/isEmployedIn
   :fibo-be-le-usex/EmploymentOfKatherineAdamsAtAppleInc,
   :fibo-fnd-org-fm/isEmployeeOf :fibo-be-le-usex/AppleIncAsEmployer,
   :fibo-fnd-pty-rl/isPlayedBy :fibo-be-le-usex/KatherineAdams,
   :rdf/type [:fibo-fnd-org-fm/Employee :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleExecutives/",
   :rdfs/label "Katherine Adams as employee",
   :skos/definition
   "Katherine Adams in the role of being employed by Apple Inc."})

(def KatherineAdamsAsGeneralCounsel
  "Katherine Adams in the role of Senior Vice President of Legal and Global Security and General Counsel of Apple Inc."
  {:db/ident :fibo-be-le-usex/KatherineAdamsAsGeneralCounsel,
   :fibo-be-oac-exec/isOfficerOf :fibo-be-le-usex/AppleIncAsControlledParty,
   :fibo-fnd-pty-rl/isPlayedBy :fibo-be-le-usex/KatherineAdams,
   :rdf/type [:fibo-be-oac-exec/CorporateOfficer :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleExecutives/",
   :rdfs/label "Katherine Adams as General Counsel",
   :skos/definition
   "Katherine Adams in the role of Senior Vice President of Legal and Global Security and General Counsel of Apple Inc."})

(def KatherineAdamsDateOfBirth
  "date on which Katherine Adams was born"
  {:cmns-dt/hasDateValue "1964-04-20",
   :db/ident :fibo-be-le-usex/KatherineAdamsDateOfBirth,
   :rdf/type [:fibo-fnd-aap-ppl/DateOfBirth :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleExecutives/",
   :rdfs/label "Katherine Adams date of birth",
   :skos/definition "date on which Katherine Adams was born"})

(def KatherineAdamsFullLegalName
  "name that is on Katherine Adams' birth certificate and that she uses for legal purposes"
  {:cmns-dsg/isNameOf :fibo-be-le-usex/KatherineAdams,
   :db/ident :fibo-be-le-usex/KatherineAdamsFullLegalName,
   :fibo-fnd-aap-ppl/hasFullLegalName "Katherine Leatherman Adams",
   :rdf/type [:fibo-fnd-aap-ppl/PersonName :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleExecutives/",
   :rdfs/label "Katherine Adams full legal name",
   :skos/definition
   "name that is on Katherine Adams' birth certificate and that she uses for legal purposes"})

(def TimCook
  "person that lives in Palo Alto, California in the San Francisco Bay Area"
  {:cmns-dsg/hasName :fibo-be-le-usex/TimCookFullLegalName,
   :db/ident :fibo-be-le-usex/TimCook,
   :fibo-fnd-aap-ppl/hasCitizenship :lcc-3166-1/UnitedStatesOfAmerica,
   :fibo-fnd-aap-ppl/hasDateOfBirth :fibo-be-le-usex/TimCookDateOfBirth,
   :rdf/type [:fibo-fnd-aap-ppl/Person :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleExecutives/",
   :rdfs/label "Tim Cook",
   :skos/definition
   "person that lives in Palo Alto, California in the San Francisco Bay Area"})

(def TimCookAsChiefExecutiveOfficer
  "Tim Cook in the role of CEO of Apple Inc."
  {:db/ident :fibo-be-le-usex/TimCookAsChiefExecutiveOfficer,
   :fibo-be-oac-exec/isOfficerOf :fibo-be-le-usex/AppleIncAsControlledParty,
   :fibo-fnd-pty-rl/isPlayedBy :fibo-be-le-usex/TimCook,
   :rdf/type [:fibo-be-oac-exec/ChiefExecutiveOfficer :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleExecutives/",
   :rdfs/label "Tim Cook as Chief Executive Officer",
   :skos/definition "Tim Cook in the role of CEO of Apple Inc."})

(def TimCookAsEmployee
  "Tim Cook in the role of being employed by Apple Inc."
  {:db/ident :fibo-be-le-usex/TimCookAsEmployee,
   :fibo-fnd-org-fm/isEmployedIn :fibo-be-le-usex/EmploymentOfTimCookAtAppleInc,
   :fibo-fnd-org-fm/isEmployeeOf :fibo-be-le-usex/AppleIncAsEmployer,
   :fibo-fnd-pty-rl/isPlayedBy :fibo-be-le-usex/TimCook,
   :rdf/type [:fibo-fnd-org-fm/Employee :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleExecutives/",
   :rdfs/label "Tim Cook as employee",
   :skos/definition "Tim Cook in the role of being employed by Apple Inc."})

(def TimCookDateOfBirth
  "date on which Tim Cook was born"
  {:cmns-dt/hasDateValue "1960-11-01",
   :db/ident :fibo-be-le-usex/TimCookDateOfBirth,
   :rdf/type [:fibo-fnd-aap-ppl/DateOfBirth :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleExecutives/",
   :rdfs/label "Tim Cook date of birth",
   :skos/definition "date on which Tim Cook was born"})

(def TimCookFullLegalName
  "name that is on Tim Cook's birth certificate and that he uses for legal purposes"
  {:cmns-dsg/isNameOf :fibo-be-le-usex/TimCook,
   :db/ident :fibo-be-le-usex/TimCookFullLegalName,
   :fibo-fnd-aap-ppl/hasFullLegalName "Timothy Donald Cook",
   :rdf/type [:fibo-fnd-aap-ppl/PersonName :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleExecutives/",
   :rdfs/label "Tim Cook full legal name",
   :skos/definition
   "name that is on Tim Cook's birth certificate and that he uses for legal purposes"})

(def TimCookHireDate
  "date on which Tim Cook was hired by Apple Inc."
  {:cmns-dt/hasDateValue "1998-03-01",
   :db/ident :fibo-be-le-usex/TimCookHireDate,
   :rdf/type [:cmns-dt/ExplicitDate :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleExecutives/",
   :rdfs/label "Tim Cook hire date",
   :skos/definition "date on which Tim Cook was hired by Apple Inc."})

(def TimCookPeriodOfEmployment
  "date period reflecting when Tim Cook was (is) employed by Apple Inc."
  {:cmns-dt/hasStartDate :fibo-be-le-usex/TimCookHireDate,
   :db/ident :fibo-be-le-usex/TimCookPeriodOfEmployment,
   :rdf/type [:cmns-dt/DatePeriod :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleExecutives/",
   :rdfs/label "Tim Cook period of employment",
   :skos/definition
   "date period reflecting when Tim Cook was (is) employed by Apple Inc."})