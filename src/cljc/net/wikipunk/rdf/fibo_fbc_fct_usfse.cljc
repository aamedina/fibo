(ns net.wikipunk.rdf.fibo-fbc-fct-usfse
  {:cmns-av/copyright #{"Copyright (c) 2015-2024 Object Management Group, Inc."
                        "Copyright (c) 2015-2024 EDM Council, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :dcterms/abstract
   "This ontology extends the primary financial services entities ontology in FBC with additional kinds of entities that are specific to the United States.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-rlcmp" "https://www.omg.org/spec/Commons/RolesAndCompositions/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-ge-usj"
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/",
    "fibo-be-le-cb"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/CorporateBodies/",
    "fibo-be-le-fbo"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/FormalBusinessOrganizations/",
    "fibo-be-oac-cctl"
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateControl/",
    "fibo-fbc-fct-fse"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/",
    "fibo-fbc-fct-rga"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegulatoryAgencies/",
    "fibo-fbc-fct-usfse"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
    "fibo-fbc-pas-fpas"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
    "fibo-fnd-oac-ctl"
    "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Control/",
    "fibo-fnd-oac-own"
    "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Ownership/",
    "fibo-fnd-org-fm"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations/",
    "fibo-fnd-plc-fac"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Facilities/",
    "fibo-fnd-plc-loc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Locations/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "lcc-3166-1"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Places/Locations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/OwnershipAndControl/CorporateControl/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/RegulatoryAgencies/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/FinancialServicesEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/ProductsAndServices/FinancialProductsAndServices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/OwnershipAndControl/Control/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/OwnershipAndControl/Ownership/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Places/Facilities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/LegalEntities/FormalBusinessOrganizations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/LegalEntities/CorporateBodies/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Organizations/FormalOrganizations/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fbc-fct-usfse",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "US Financial Services Entities Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities.rdf version of this ontology was modified to eliminate deprecated elements."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities.rdf version of this ontology was modified per the issue resolutions identified in the FIBO FBC 1.0 FTF report."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary, add additional kinds of institutions in order to answer competency questions using the National Information Center (NIC) repository, leverage the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) to eliminate redundancies in FIBO, and clean up a couple of definitions to be ISO 704 compliant."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities.rdf version of this ontology was modified to augment the representation of institutions based on their definitions in the law, in order to answer competency questions using the National Information Center (NIC) repository"
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities.rdf version of this ontology was modified to generalize the definition of credit union."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities.rdf version of this ontology was modified to eliminate circular definitions and revise names such that concepts don't appear to refer to multiple things."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities.rdf version of this ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities.rdf version of this ontology was modified to eliminate dead links and address text formatting issues identified through hygiene testing."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"})

(def AgencyOfAForeignBankingOrganization
  {:cmns-av/adaptedFrom
   #{{:xsd/anyURI "https://www.ffiec.gov/npw/Help/InstitutionTypes"}
     {:xsd/anyURI
      "https://www.ecfr.gov/current/title-12/chapter-II/subchapter-A/part-211/subpart-B/section-211.21"}
     {:xsd/anyURI
      "https://www.govinfo.gov/content/pkg/COMPS-275/pdf/COMPS-275.pdf"}},
   :cmns-av/explanatoryNote
   "Obligations shall not be considered credit balances unless they are: \n(1) Incidental to, or arise out of the exercise of, other lawful banking powers; \n(2) To serve a specific purpose; \n(3) Not solicited from the general public; \n(4) Not used to pay routine operating expenses in the United States such as salaries, rent, or taxes; \n(5) Withdrawn within a reasonable period of time after the specific purpose for which they were placed has been accomplished; and \n(6) Drawn upon in a manner reasonable in relation to the size and nature of the account.",
   :db/ident :fibo-fbc-fct-usfse/AgencyOfAForeignBankingOrganization,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "agency of a foreign banking organization",
   :rdfs/subClassOf
   #{:fibo-fbc-fct-fse/FinancialInstitution
     {:owl/onProperty     :cmns-rlcmp/isPlayedBy,
      :owl/someValuesFrom {:owl/hasValue   :lcc-3166-1/UnitedStatesOfAmerica,
                           :owl/onProperty :fibo-fnd-org-fm/isDomiciledIn,
                           :rdf/type       :owl/Restriction},
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-fnd-oac-own/isOwnedAsset,
      :owl/someValuesFrom :fibo-fbc-fct-usfse/ForeignBank,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :cmns-rlcmp/isPlayedBy,
      :owl/someValuesFrom :fibo-fbc-fct-usfse/OfficeOfAForeignBank,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-fnd-oac-ctl/isControlledPartyOf,
      :owl/someValuesFrom :fibo-fbc-fct-usfse/ForeignBank,
      :rdf/type           :owl/Restriction}},
   :skos/definition
   "place of business of a foreign bank, located in any state, at which credit balances are maintained, checks are paid, money is lent, or, to the extent not prohibited by state or federal law, deposits are accepted from a person or entity that is not a citizen or resident of the United States"})

(def AgreementCorporation
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "https://www.ffiec.gov/npw/Help/InstitutionTypes"},
   :db/ident :fibo-fbc-fct-usfse/AgreementCorporation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "agreement corporation",
   :rdfs/subClassOf #{:fibo-fbc-fct-fse/FinancialInstitution
                      {:owl/onClass    :fibo-be-le-cb/Corporation,
                       :owl/onProperty :cmns-rlcmp/isPlayedBy,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "corporation chartered by a state to engage in international banking, so named because the corporation enters into an 'agreement' with the Fed's Board of Governors that it will limit its activities to those permitted"})

(def AgreementCorporation-Banking
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "https://www.ffiec.gov/npw/Help/InstitutionTypes"},
   :db/ident :fibo-fbc-fct-usfse/AgreementCorporation-Banking,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "agreement corporation - banking",
   :rdfs/subClassOf #{:fibo-fbc-fct-fse/DepositoryInstitution
                      :fibo-fbc-fct-usfse/AgreementCorporation},
   :skos/definition
   "agreement corporation whose charter allows the corporation to engage in international banking"})

(def AgreementCorporation-Investment
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "https://www.ffiec.gov/npw/Help/InstitutionTypes"},
   :db/ident :fibo-fbc-fct-usfse/AgreementCorporation-Investment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "agreement corporation - investment",
   :rdfs/subClassOf #{:fibo-fbc-fct-fse/InvestmentBank
                      :fibo-fbc-fct-usfse/AgreementCorporation},
   :skos/definition
   "agreement corporation whose charter allows the corporation to engage in international investment banking"})

(def BankersBank
  {:cmns-av/adaptedFrom
   {:rdf/value
    "Depository Institutions Deregulation and Monetary Control Act of 1980, available at https://www.govinfo.gov/content/pkg/STATUTE-94/pdf/STATUTE-94-Pg132.pdf, section 711"},
   :cmns-av/explanatoryNote
   "Bankers' banks are typically (1) organized solely to do business with other financial institutions (with the exceptions defined herein), (2) owned primarily by the financial institutions with which they conduct business, and (3) do not do business with the general public.",
   :db/ident :fibo-fbc-fct-usfse/BankersBank,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "bankers' bank",
   :rdfs/subClassOf
   #{:fibo-fbc-fct-usfse/USBank :fibo-fbc-fct-fse/CommercialBank
     {:owl/onDataRange :xsd/boolean,
      :owl/onProperty  :fibo-fbc-fct-usfse/isSubjectToReserveRequirements,
      :owl/qualifiedCardinality 1,
      :rdf/type        :owl/Restriction}},
   :skos/definition
   "commercial bank owned exclusively (except to the extent directors' qualifying shares are required by law) by other depository institutions or depository institution holding companies, the activities of which are limited by its articles of association exclusively to providing services to or for other depository institutions, their holding companies, and the officers, directors, and employees of such institutions and companies, and to providing correspondent banking services at the request of other depository institutions or their holding companies"})

(def BankersBankNotSubjectToReserveRequirements
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.ffiec.gov/nicpubweb/Content/DataDownload/NPW%20Data%20Dictionary.pdf"},
   :db/ident :fibo-fbc-fct-usfse/BankersBankNotSubjectToReserveRequirements,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "bankers' bank that is not subject to reserve requirements",
   :rdfs/subClassOf #{:fibo-fbc-fct-usfse/BankersBank
                      {:owl/hasValue {:xsd/boolean false},
                       :owl/onProperty
                       :fibo-fbc-fct-usfse/isSubjectToReserveRequirements,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "bankers' bank whose activities are not limited by specific requirements of the Federal Reserve"})

(def BankersBankSubjectToReserveRequirements
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.ffiec.gov/nicpubweb/Content/DataDownload/NPW%20Data%20Dictionary.pdf"},
   :db/ident :fibo-fbc-fct-usfse/BankersBankSubjectToReserveRequirements,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "bankers' bank subject to reserve requirements",
   :rdfs/subClassOf #{:fibo-fbc-fct-usfse/BankersBank
                      {:owl/hasValue {:xsd/boolean true},
                       :owl/onProperty
                       :fibo-fbc-fct-usfse/isSubjectToReserveRequirements,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "bankers' bank whose activities are limited by specific requirements of the Federal Reserve"})

(def BranchOfADepositoryInstitution
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.ecfr.gov/current/title-12/chapter-II/subchapter-A/part-211/subpart-B/section-211.21"},
   :db/ident :fibo-fbc-fct-usfse/BranchOfADepositoryInstitution,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "branch of a depository institution",
   :rdfs/subClassOf #{{:owl/onProperty :cmns-col/isPartOf,
                       :owl/someValuesFrom
                       {:owl/onProperty :cmns-rlcmp/playsRole,
                        :owl/someValuesFrom
                        :fibo-fbc-fct-fse/DepositoryInstitution,
                        :rdf/type :owl/Restriction},
                       :rdf/type :owl/Restriction} :fibo-be-le-fbo/Branch},
   :skos/definition
   "any office or any place of business located in any State of the United States at which deposits are received"})

(def CommercialLendingCompany
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.govinfo.gov/content/pkg/USCODE-2021-title12/pdf/USCODE-2021-title12-chap32-sec3101.pdf"},
   :db/ident :fibo-fbc-fct-usfse/CommercialLendingCompany,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "commercial lending company",
   :rdfs/subClassOf :fibo-fbc-fct-fse/NonDepositoryInstitution,
   :skos/definition
   "any institution, other than a bank or an organization operating under section 25 of the Federal Reserve Act [12 U.S.C. 601 et seq.], organized under the laws of any State of the United States, or the District of Columbia which maintains credit balances incidental to or arising out of the exercise of banking powers and engages in the business of making commercial loans"})

(def CooperativeBank
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "https://www.ffiec.gov/npw/Help/InstitutionTypes"},
   :db/ident :fibo-fbc-fct-usfse/CooperativeBank,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "cooperative bank",
   :rdfs/subClassOf :fibo-fbc-fct-usfse/ThriftInstitution,
   :skos/definition
   "state-chartered savings association that is organized and operates according to the laws of the state in which it is chartered or organized, including Massachusetts, New Hampshire, Rhode Island or Vermont"})

(def DomesticBranchOfAForeignBank
  {:cmns-av/adaptedFrom
   #{{:xsd/anyURI "https://www.ffiec.gov/npw/Help/InstitutionTypes"}
     {:xsd/anyURI
      "https://www.ecfr.gov/current/title-12/chapter-II/subchapter-A/part-211/subpart-B/section-211.21"}},
   :db/ident :fibo-fbc-fct-usfse/DomesticBranchOfAForeignBank,
   :owl/disjointWith {:owl/allValuesFrom
                      :fibo-fbc-fct-usfse/AgencyOfAForeignBankingOrganization,
                      :owl/onProperty :cmns-rlcmp/playsRole,
                      :rdf/type :owl/Restriction},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "domestic branch of a foreign bank",
   :rdfs/subClassOf
   #{:fibo-fbc-fct-usfse/BranchOfADepositoryInstitution
     {:owl/onProperty     :cmns-col/isPartOf,
      :owl/someValuesFrom {:owl/onProperty     :cmns-rlcmp/playsRole,
                           :owl/someValuesFrom :fibo-fbc-fct-usfse/ForeignBank,
                           :rdf/type           :owl/Restriction},
      :rdf/type           :owl/Restriction}
     {:owl/hasValue   :lcc-3166-1/UnitedStatesOfAmerica,
      :owl/onProperty :fibo-fnd-org-fm/isDomiciledIn,
      :rdf/type       :owl/Restriction}
     :fibo-fbc-fct-usfse/OfficeOfAForeignBank},
   :skos/definition
   "place of business of a foreign bank, located in any state, at which deposits are received, and that is not an agency as defined in https://www.ecfr.gov/current/title-12/chapter-II/subchapter-A/part-211/subpart-B/section-211.21"})

(def DomesticBranchOfDomesticBank
  {:cmns-av/adaptedFrom
   #{{:xsd/anyURI "https://www.ffiec.gov/npw/Help/InstitutionTypes"}
     {:xsd/anyURI
      "https://www.ecfr.gov/current/title-12/chapter-II/subchapter-A/part-211/subpart-B/section-211.21"}},
   :db/ident :fibo-fbc-fct-usfse/DomesticBranchOfDomesticBank,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "domestic branch of domestic bank",
   :rdfs/subClassOf
   #{:fibo-fbc-fct-usfse/BranchOfADepositoryInstitution
     {:owl/onProperty     :cmns-col/isPartOf,
      :owl/someValuesFrom {:owl/onProperty     :cmns-rlcmp/playsRole,
                           :owl/someValuesFrom :fibo-fbc-fct-usfse/USBank,
                           :rdf/type           :owl/Restriction},
      :rdf/type           :owl/Restriction}
     {:owl/hasValue   :lcc-3166-1/UnitedStatesOfAmerica,
      :owl/onProperty :fibo-fnd-org-fm/isDomiciledIn,
      :rdf/type       :owl/Restriction}},
   :skos/definition
   "branch that resides in the United States, and whose parent is also located in the United States"})

(def DomesticEntity
  {:db/ident :fibo-fbc-fct-usfse/DomesticEntity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "domestic entity",
   :rdfs/subClassOf #{:fibo-fbc-pas-fpas/FinancialServiceProvider
                      {:owl/onProperty :cmns-rlcmp/isPlayedBy,
                       :owl/someValuesFrom
                       {:owl/intersectionOf
                        [{:owl/hasValue   :lcc-3166-1/UnitedStatesOfAmerica,
                          :owl/onProperty :fibo-fnd-org-fm/isDomiciledIn,
                          :rdf/type       :owl/Restriction}
                         {:owl/hasValue
                          :fibo-be-ge-usj/UnitedStatesJurisdiction,
                          :owl/onProperty :fibo-be-le-cb/isIncorporatedIn,
                          :rdf/type :owl/Restriction}],
                        :rdf/type :owl/Class},
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "financial service provider that is incorporated and domiciled in the United States"})

(def DomesticEntityOther
  {:cmns-av/abbreviation "DEO",
   :cmns-av/adaptedFrom {:xsd/anyURI
                         "https://www.ffiec.gov/npw/Help/InstitutionTypes"},
   :cmns-av/explanatoryNote
   "This classification is used primarily to cover organizations acting as financial institutions in the US that are not otherwise classified in the context of the National Information Center (NIC).",
   :db/ident :fibo-fbc-fct-usfse/DomesticEntityOther,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "domestic entity other",
   :rdfs/subClassOf :fibo-fbc-fct-usfse/DomesticEntity,
   :skos/definition
   "domestic institution that engages in banking activities usually in connection with the business of banking in the United States"})

(def DomesticNonBankSubsidiaryOfADomesticEntity
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "https://www.ffiec.gov/npw/Help/InstitutionTypes"},
   :db/ident :fibo-fbc-fct-usfse/DomesticNonBankSubsidiaryOfADomesticEntity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "domestic non-bank subsidiary of a domestic entity",
   :rdfs/seeAlso
   {:xsd/anyURI
    "https://fraser.stlouisfed.org/title/bank-holding-company-act-1956-984/fulltext"},
   :rdfs/subClassOf #{:fibo-fbc-fct-usfse/NonBankSubsidiaryOfADomesticEntity
                      :fibo-fbc-fct-usfse/DomesticEntity},
   :skos/definition
   "non-bank financial service provider based in the United States of which 25 percent or more of whose voting shares are owned or controlled by an entity that is also based in the United States, or of which a majority of its directors are controlled by such domestic entity, or of which 25 percent or more of whose voting shares are held by trustees for the benefit of the shareholders or members of such domestic entity"})

(def EdgeCorporation
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "https://www.ffiec.gov/npw/Help/InstitutionTypes"},
   :db/ident :fibo-fbc-fct-usfse/EdgeCorporation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "edge corporation",
   :rdfs/subClassOf #{:fibo-fbc-fct-fse/FinancialInstitution
                      {:owl/onClass    :fibo-be-le-cb/Corporation,
                       :owl/onProperty :cmns-rlcmp/isPlayedBy,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "corporation chartered by the Federal Reserve to engage in international banking and financial operations"})

(def EdgeCorporation-Banking
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "https://www.ffiec.gov/npw/Help/InstitutionTypes"},
   :db/ident :fibo-fbc-fct-usfse/EdgeCorporation-Banking,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "edge corporation - banking",
   :rdfs/subClassOf #{:fibo-fbc-fct-fse/DepositoryInstitution
                      :fibo-fbc-fct-usfse/EdgeCorporation},
   :skos/definition
   "edge corporation whose charter allows the corporation to engage in international banking"})

(def EdgeCorporation-DomesticBranch
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "https://www.ffiec.gov/npw/Help/InstitutionTypes"},
   :db/ident :fibo-fbc-fct-usfse/EdgeCorporation-DomesticBranch,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "edge corporation - domestic branch",
   :rdfs/subClassOf
   #{{:owl/onProperty     :cmns-col/isPartOf,
      :owl/someValuesFrom {:owl/onProperty :cmns-rlcmp/playsRole,
                           :owl/someValuesFrom
                           :fibo-fbc-fct-usfse/EdgeCorporation,
                           :rdf/type :owl/Restriction},
      :rdf/type           :owl/Restriction} :fibo-be-le-fbo/Branch
     {:owl/hasValue   :lcc-3166-1/UnitedStatesOfAmerica,
      :owl/onProperty :fibo-fnd-org-fm/isDomiciledIn,
      :rdf/type       :owl/Restriction}},
   :skos/definition
   "branch of an edge corporation that is located in the United States"})

(def EdgeCorporation-Investment
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "https://www.ffiec.gov/npw/Help/InstitutionTypes"},
   :db/ident :fibo-fbc-fct-usfse/EdgeCorporation-Investment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "edge corporation - investment",
   :rdfs/subClassOf #{:fibo-fbc-fct-fse/InvestmentBank
                      :fibo-fbc-fct-usfse/EdgeCorporation},
   :skos/definition
   "edge corporation whose charter allows the corporation to engage in international investment banking"})

(def FarmCreditSystemInstitution
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "https://www.ffiec.gov/npw/Help/InstitutionTypes"},
   :cmns-av/explanatoryNote
   "All Farm Credit System institutions are federally-chartered instrumentalities of the United States.",
   :db/ident :fibo-fbc-fct-usfse/FarmCreditSystemInstitution,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "farm credit system institution",
   :rdfs/subClassOf #{:fibo-fbc-fct-fse/FinancialInstitution
                      :fibo-fbc-fct-usfse/DomesticEntity},
   :skos/definition
   "federally-chartered financial institution that is supervised, examined, and regulated by the Farm Credit Administration and operates in accordance with the Farm Credit Act of 1971, as amended, 12 U.S.C. 2001 et seq"})

(def FederalAgencyOfForeignBankingOrganization
  {:cmns-av/adaptedFrom
   #{{:xsd/anyURI
      "https://www.govinfo.gov/content/pkg/USCODE-2021-title12/pdf/USCODE-2021-title12-chap32-sec3101.pdf"}
     {:xsd/anyURI "https://www.ffiec.gov/npw/Help/InstitutionTypes"}
     {:xsd/anyURI
      "https://www.ecfr.gov/current/title-12/chapter-II/subchapter-A/part-211/subpart-B/section-211.21"}
     {:xsd/anyURI
      "https://www.govinfo.gov/content/pkg/COMPS-275/pdf/COMPS-275.pdf"}},
   :db/ident :fibo-fbc-fct-usfse/FederalAgencyOfForeignBankingOrganization,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "federal agency of foreign banking organization",
   :rdfs/subClassOf :fibo-fbc-fct-usfse/AgencyOfAForeignBankingOrganization,
   :skos/definition
   "agency of a foreign bank established and operating under section 3102 of CFR Title 12, Chapter 32 and section 4 of the International Banking Act of 1978"})

(def FederalBranchOfForeignBankingOrganization
  {:cmns-av/adaptedFrom
   #{{:xsd/anyURI
      "https://www.govinfo.gov/content/pkg/USCODE-2021-title12/pdf/USCODE-2021-title12-chap32-sec3101.pdf"}
     {:xsd/anyURI "https://www.ffiec.gov/npw/Help/InstitutionTypes"}
     {:xsd/anyURI
      "https://www.ecfr.gov/current/title-12/chapter-II/subchapter-A/part-211/subpart-B/section-211.21"}
     {:xsd/anyURI
      "https://www.govinfo.gov/content/pkg/COMPS-275/pdf/COMPS-275.pdf"}},
   :db/ident :fibo-fbc-fct-usfse/FederalBranchOfForeignBankingOrganization,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "federal branch of foreign banking organization",
   :rdfs/subClassOf :fibo-fbc-fct-usfse/DomesticBranchOfAForeignBank,
   :skos/definition
   "branch of a foreign bank established and operating under section 3102 of CFR Title 12, Chapter 32 and section 4 of the International Banking Act of 1978"})

(def FederalCreditUnion
  {:db/ident :fibo-fbc-fct-usfse/FederalCreditUnion,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "federal credit union",
   :rdfs/subClassOf :fibo-fbc-fct-usfse/USCreditUnion,
   :skos/definition "credit union that has a federal affiliation"})

(def FederalSavingsBank
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "https://www.ffiec.gov/npw/Help/InstitutionTypes"},
   :db/ident :fibo-fbc-fct-usfse/FederalSavingsBank,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "federal savings bank",
   :rdfs/subClassOf :fibo-fbc-fct-usfse/SavingsBank,
   :skos/definition "savings bank that has a federal affiliation"})

(def FinancialHoldingCompany
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "https://www.ffiec.gov/npw/Help/InstitutionTypes"},
   :cmns-av/explanatoryNote
   "These activities include: insurance underwriting, securities dealing and underwriting, financial and investment advisory services, merchant banking, issuing or selling securitized interests in bank-eligible assets, and generally engaging in any non-banking activity authorized by the Bank Holding Company Act. The Federal Reserve Board is responsible for supervising the financial condition and activities of financial holding companies. Similarly, any non-bank commercial company that is predominantly engaged in financial activities, earning 85 percent or more of its gross revenues from financial services, may choose to become a financial holding company. These companies are required to sell any non-financial (commercial) businesses within ten years.",
   :cmns-av/synonym "Financial Holding Company / BHC",
   :db/ident :fibo-fbc-fct-usfse/FinancialHoldingCompany,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "financial holding company",
   :rdfs/subClassOf :fibo-fbc-fct-fse/BankHoldingCompany,
   :skos/definition
   "financial entity engaged in a broad range of banking-related activities as permitted under the Gramm-Leach-Bliley Act of 1999",
   :skos/note "Can be a domestic or foreign domiciled holding company"})

(def ForeignBank
  {:cmns-av/adaptedFrom
   #{{:xsd/anyURI
      "https://www.ffiec.gov/nicpubweb/Content/HELP/Institution%20Type%20Description.htm"}
     {:xsd/anyURI
      "https://www.ecfr.gov/current/title-12/chapter-II/subchapter-A/part-211/subpart-B/section-211.21"}
     {:xsd/anyURI
      "https://www.govinfo.gov/content/pkg/COMPS-275/pdf/COMPS-275.pdf"}},
   :cmns-av/explanatoryNote
   #{"Foreign bank means an organization that is organized under the laws of a foreign country and that engages directly in the business of banking outside the United States. The term foreign bank does not include a central bank of a foreign country that does not engage or seek to engage in a commercial banking business in the United States through an office."
     "For the purposes of the International Banking Act of 1978, the term 'foreign bank' includes, without limitation, foreign commercial banks, foreign merchant banks and other foreign institutions that engage in banking activities usual in connection with the business of banking in the countries where such foreign institutions are organized or operating."},
   :db/ident :fibo-fbc-fct-usfse/ForeignBank,
   :owl/disjointWith #{:fibo-fbc-fct-fse/CentralBank
                       :fibo-fbc-fct-usfse/USBank},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "foreign bank",
   :rdfs/subClassOf #{:fibo-fbc-fct-fse/Bank
                      {:owl/onProperty     :fibo-fbc-fct-usfse/hasHomeCountry,
                       :owl/someValuesFrom :lcc-cr/Country,
                       :rdf/type           :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass :fibo-fbc-fct-rga/RegulatoryAgency,
                       :owl/onProperty
                       :fibo-fbc-fct-usfse/hasHomeCountrySupervisor,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "financial institution organized under the laws of a foreign country, a territory of the United States, Puerto Rico, Guam, American Samoa, or the Virgin Islands, which engages in the business of banking, or any subsidiary or affiliate, organized under such laws, of any such institution"})

(def ForeignBankingOrganization
  {:cmns-av/abbreviation "FBO",
   :cmns-av/adaptedFrom
   #{{:xsd/anyURI
      "https://www.ffiec.gov/nicpubweb/Content/HELP/Institution%20Type%20Description.htm"}
     {:xsd/anyURI
      "https://www.ecfr.gov/current/title-12/chapter-II/subchapter-A/part-211/subpart-B/section-211.21"}},
   :cmns-av/explanatoryNote
   #{"Foreign banking organization means: \n(1) A foreign bank, as defined in section 1(b)(7) of the International Banking Act of 1978 (12 U.S.C. 3101(7)), that: \n\t(i) Operates a branch, agency, or commercial lending company subsidiary in the United States; \n\t(ii) Controls a bank in the United States; or \n\t(iii) Controls an Edge corporation acquired after March 5, 1987; and \n(2) Any company of which the foreign bank is a subsidiary."
     "These entities are regulated and supervised as domestic institutions."},
   :db/ident :fibo-fbc-fct-usfse/ForeignBankingOrganization,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "foreign banking organization",
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fbc-fct-usfse/hasHomeCountry,
                       :owl/someValuesFrom :lcc-cr/Country,
                       :rdf/type           :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass :fibo-fbc-fct-rga/RegulatoryAgency,
                       :owl/onProperty
                       :fibo-fbc-fct-usfse/hasHomeCountrySupervisor,
                       :rdf/type :owl/Restriction}
                      :fibo-fbc-pas-fpas/FinancialServiceProvider},
   :skos/definition
   "financial service provider that is headquartered outside the United States and that can acquire or establish freestanding banks or bank holding companies in the United States"})

(def ForeignBankingOrganizationAsABankHoldingCompany
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.ffiec.gov/nicpubweb/Content/HELP/Institution%20Type%20Description.htm"},
   :cmns-av/explanatoryNote
   "A foreign banking organization that also acts as a bank holding company is thus supervised by the Board of Governors of the Federal Reserve.",
   :cmns-av/synonym "Financial Holding Company / FBO",
   :db/ident
   :fibo-fbc-fct-usfse/ForeignBankingOrganizationAsABankHoldingCompany,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "foreign banking organization as a bank holding company",
   :rdfs/subClassOf
   #{:fibo-fbc-fct-fse/BankHoldingCompany
     :fibo-fbc-fct-usfse/ForeignBankingOrganization
     {:owl/onProperty     :cmns-rlcmp/isPlayedBy,
      :owl/someValuesFrom {:owl/hasValue   :lcc-3166-1/UnitedStatesOfAmerica,
                           :owl/onProperty :fibo-fnd-org-fm/isDomiciledIn,
                           :rdf/type       :owl/Restriction},
      :rdf/type           :owl/Restriction}},
   :skos/definition
   "foreign banking organization that is a bank holding company in the United States"})

(def ForeignBankingOrganizationOfABankHoldingCompany
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.ffiec.gov/nicpubweb/Content/HELP/Institution%20Type%20Description.htm"},
   :db/ident
   :fibo-fbc-fct-usfse/ForeignBankingOrganizationOfABankHoldingCompany,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "foreign banking organization of a bank holding company",
   :rdfs/subClassOf :fibo-fbc-fct-usfse/ForeignBankingOrganization,
   :skos/definition
   "foreign banking organization that is owned or controlled by a bank holding company"})

(def ForeignBranchOfForeignBank
  {:db/ident :fibo-fbc-fct-usfse/ForeignBranchOfForeignBank,
   :owl/disjointWith #{:fibo-fbc-fct-usfse/DomesticBranchOfDomesticBank
                       :fibo-fbc-fct-usfse/ForeignBranchOfUSBank
                       {:owl/hasValue   :lcc-3166-1/UnitedStatesOfAmerica,
                        :owl/onProperty :fibo-fnd-org-fm/isDomiciledIn,
                        :rdf/type       :owl/Restriction}},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "foreign branch of foreign bank",
   :rdfs/subClassOf
   #{:fibo-fbc-fct-usfse/BranchOfADepositoryInstitution
     {:owl/onProperty     :cmns-col/isPartOf,
      :owl/someValuesFrom {:owl/onProperty     :cmns-rlcmp/playsRole,
                           :owl/someValuesFrom :fibo-fbc-fct-usfse/ForeignBank,
                           :rdf/type           :owl/Restriction},
      :rdf/type           :owl/Restriction}},
   :skos/definition
   "branch that resides outside of the United States whose parent is located outside of the United States"})

(def ForeignBranchOfForeignBankManagedByUSOffice
  {:db/ident :fibo-fbc-fct-usfse/ForeignBranchOfForeignBankManagedByUSOffice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "foreign branch of foreign bank managed by US office",
   :rdfs/subClassOf
   #{{:owl/onProperty :fibo-fnd-rel-rel/isManagedBy,
      :owl/someValuesFrom
      {:owl/unionOf [{:owl/onProperty :cmns-rlcmp/isPlayedBy,
                      :owl/someValuesFrom
                      :fibo-fbc-fct-usfse/DomesticBranchOfAForeignBank,
                      :rdf/type :owl/Restriction}
                     :fibo-fbc-fct-usfse/AgencyOfAForeignBankingOrganization],
       :rdf/type    :owl/Class},
      :rdf/type :owl/Restriction}
     :fibo-fbc-fct-usfse/ForeignBranchOfForeignBank},
   :skos/definition
   "branch that resides outside of the United States whose parent is located outside of the United States that is managed by a US branch or agency of the foreign bank"})

(def ForeignBranchOfUSBank
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "https://www.ffiec.gov/npw/Help/InstitutionTypes"},
   :db/ident :fibo-fbc-fct-usfse/ForeignBranchOfUSBank,
   :owl/disjointWith #{:fibo-fbc-fct-usfse/DomesticBranchOfDomesticBank
                       {:owl/hasValue   :lcc-3166-1/UnitedStatesOfAmerica,
                        :owl/onProperty :fibo-fnd-org-fm/isDomiciledIn,
                        :rdf/type       :owl/Restriction}},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "foreign branch of US bank",
   :rdfs/subClassOf
   #{:fibo-fbc-fct-usfse/BranchOfADepositoryInstitution
     {:owl/onProperty     :cmns-col/isPartOf,
      :owl/someValuesFrom {:owl/onProperty     :cmns-rlcmp/playsRole,
                           :owl/someValuesFrom :fibo-fbc-fct-usfse/USBank,
                           :rdf/type           :owl/Restriction},
      :rdf/type           :owl/Restriction}},
   :skos/definition
   "branch that resides outside of the United States, but has a parent that is located in the United States"})

(def ForeignEntityOther
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "https://www.ffiec.gov/npw/Help/InstitutionTypes"},
   :db/ident :fibo-fbc-fct-usfse/ForeignEntityOther,
   :owl/disjointWith :fibo-fbc-fct-usfse/DomesticEntity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "foreign entity other",
   :rdfs/subClassOf :fibo-fbc-fct-fse/FinancialInstitution,
   :skos/definition
   "foreign institution that engages in banking activities usually in connection with the business of banking in the countries where such foreign institutions are organized or operating"})

(def IndustrialBank
  {:cmns-av/explanatoryNote
   "Often called Morris Plan banks or industrial loan companies, industrial banks are distinguished from commercial loan companies because industrial banks accept deposits in addition to making consumer loans. Industrial banks differ from commercial banks because they do not offer demand deposit (checking) accounts. Industrial banks are not regulated by the Federal Reserve.",
   :db/ident :fibo-fbc-fct-usfse/IndustrialBank,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "industrial bank",
   :rdfs/subClassOf :fibo-fbc-fct-fse/Bank,
   :skos/definition
   "limited service financial institution that raises funds by selling certificates called 'investment shares' and by accepting deposits"})

(def InsuredFederalBranchOfForeignBankingOrganization
  {:cmns-av/adaptedFrom
   #{{:xsd/anyURI "https://www.ffiec.gov/npw/Help/InstitutionTypes"}
     {:xsd/anyURI
      "https://www.govinfo.gov/content/pkg/COMPS-275/pdf/COMPS-275.pdf"}},
   :db/ident
   :fibo-fbc-fct-usfse/InsuredFederalBranchOfForeignBankingOrganization,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "insured federal branch of foreign banking organization",
   :rdfs/subClassOf
   :fibo-fbc-fct-usfse/FederalBranchOfForeignBankingOrganization,
   :skos/definition
   "any office or any place of business of a foreign bank located in any State of the United States at which deposits are received established and operating under section 4 of the International Banking Act of 1978 that is insured and regulated by the Federal Deposit Insurance Corporation (FDIC)"})

(def InsuredStateBranchOfForeignBankingOrganization
  {:cmns-av/adaptedFrom
   #{{:xsd/anyURI "https://www.ffiec.gov/npw/Help/InstitutionTypes"}
     {:xsd/anyURI
      "https://www.govinfo.gov/content/pkg/COMPS-275/pdf/COMPS-275.pdf"}},
   :db/ident :fibo-fbc-fct-usfse/InsuredStateBranchOfForeignBankingOrganization,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "insured state branch of foreign banking organization",
   :rdfs/subClassOf :fibo-fbc-fct-usfse/StateBranchOfForeignBankingOrganization,
   :skos/definition
   "any office or any place of business of a foreign bank located in any State of the United States at which deposits are received, established and operating under the laws of that State that is insured and regulated by the Federal Deposit Insurance Corporation (FDIC)"})

(def IntermediateHoldingCompany
  {:db/ident :fibo-fbc-fct-usfse/IntermediateHoldingCompany,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "intermediate holding company",
   :rdfs/subClassOf :fibo-fbc-fct-fse/BankHoldingCompany,
   :skos/definition
   "bank holding company established or designated by a foreign banking organization under subpart O of the Federal Reserve Board's Regulation YY (12 CFR part 252)"})

(def InternationalBankOfUSDepositoryEdgeTrustCompany
  {:db/ident
   :fibo-fbc-fct-usfse/InternationalBankOfUSDepositoryEdgeTrustCompany,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "international bank of US depositary, edge, trust company",
   :rdfs/subClassOf #{:fibo-fbc-fct-fse/Bank
                      {:owl/onProperty :cmns-col/isPartOf,
                       :owl/someValuesFrom
                       {:owl/onProperty :cmns-rlcmp/playsRole,
                        :owl/someValuesFrom
                        {:owl/unionOf [:fibo-fbc-fct-fse/DepositoryInstitution
                                       :fibo-fbc-fct-usfse/EdgeCorporation
                                       :fibo-fbc-fct-fse/TrustCompany],
                         :rdf/type    :owl/Class},
                        :rdf/type :owl/Restriction},
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "bank that is owned or controlled by a US depository institution, Edge Act corporation or trust company"})

(def InternationalNonBankSubsidiaryOfADomesticEntity
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "https://www.ffiec.gov/npw/Help/InstitutionTypes"},
   :db/ident
   :fibo-fbc-fct-usfse/InternationalNonBankSubsidiaryOfADomesticEntity,
   :owl/disjointWith
   :fibo-fbc-fct-usfse/DomesticNonBankSubsidiaryOfADomesticEntity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "non-bank subsidiary of a domestic entity",
   :rdfs/seeAlso
   {:xsd/anyURI
    "https://fraser.stlouisfed.org/title/bank-holding-company-act-1956-984/fulltext"},
   :rdfs/subClassOf :fibo-fbc-fct-usfse/NonBankSubsidiaryOfADomesticEntity,
   :skos/definition
   "non-bank financial service provider based outside of the United States of which 25 percent or more of whose voting shares are owned or controlled by an entity that is based in the United States, or of which a majority of its directors are controlled by such domestic entity, or of which 25 percent or more of whose voting shares are held by trustees for the benefit of the shareholders or members of such domestic entity"})

(def LimitedBranchOfAForeignBank
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.ecfr.gov/current/title-12/chapter-II/subchapter-A/part-211/subpart-B/section-211.21"},
   :db/ident :fibo-fbc-fct-usfse/LimitedBranchOfAForeignBank,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "limited branch of a foreign bank",
   :rdfs/subClassOf :fibo-fbc-fct-usfse/DomesticBranchOfAForeignBank,
   :skos/definition
   "branch of a foreign bank that receives only such deposits as would be permitted for a corporation organized under section 25A of the Federal Reserve Act (12 U.S.C. 611-631)"})

(def MutualSavingsBank
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "https://www.ffiec.gov/npw/Help/InstitutionTypes"},
   :db/ident :fibo-fbc-fct-usfse/MutualSavingsBank,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "mutual savings bank",
   :rdfs/subClassOf :fibo-fbc-fct-usfse/SavingsBank,
   :skos/definition
   "financial institution that accepts deposits primarily from individuals and places a large portion of its funds into mortgage loans"})

(def NationalBank
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.ffiec.gov/npw/Help/InstitutionTypes#non-mem-banks"},
   :cmns-av/explanatoryNote
   "National Banks are required to be members of the Federal Reserve System and belong to the Federal Deposit Insurance Corporation.",
   :db/ident :fibo-fbc-fct-usfse/NationalBank,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "national bank",
   :rdfs/subClassOf #{:fibo-fbc-fct-usfse/USBank
                      :fibo-fbc-fct-fse/CommercialBank},
   :skos/definition
   "commercial bank whose charter is approved by the Office of the Comptroller of the Currency (OCC) rather than by a state banking agency"})

(def NewYorkArticleXIIInvestmentCompany
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "https://www.dfs.ny.gov/institution_definition"},
   :cmns-av/explanatoryNote
   "An Article XII Investment Company is not an 'investment company' subject to registration under the Investment Company Act of 1940. An Article XII Investment Company may accept credit balances in New York that are incidental to the exercise of its other powers and may accept deposits outside New York with the approval of the Superintendent. Article XII Investment Companies may specialize in commercial or retail sales finance; others are involved in domestic and international commercial and merchant banking.",
   :db/ident :fibo-fbc-fct-usfse/NewYorkArticleXIIInvestmentCompany,
   :owl/disjointWith :fibo-fbc-fct-fse/InvestmentCompany,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "New York Article XII investment company",
   :rdfs/subClassOf :fibo-fbc-fct-fse/NonDepositoryInstitution,
   :skos/definition
   "specialized non-depository lending institution that has broad borrowing and lending powers and may invest in stocks and bonds"})

(def NonBankSubsidiaryOfADomesticEntity
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "https://www.ffiec.gov/npw/Help/InstitutionTypes"},
   :db/ident :fibo-fbc-fct-usfse/NonBankSubsidiaryOfADomesticEntity,
   :owl/disjointWith :fibo-fbc-fct-fse/Bank,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "non-bank subsidiary of a domestic entity",
   :rdfs/seeAlso
   {:xsd/anyURI
    "https://fraser.stlouisfed.org/title/bank-holding-company-act-1956-984/fulltext"},
   :rdfs/subClassOf #{{:owl/onProperty :fibo-be-oac-cctl/isSubsidiaryOf,
                       :owl/someValuesFrom
                       {:owl/onProperty :cmns-rlcmp/isPlayedBy,
                        :owl/someValuesFrom
                        :fibo-fbc-fct-fse/FinancialInstitution,
                        :rdf/type :owl/Restriction},
                       :rdf/type :owl/Restriction}
                      :fibo-fbc-fct-usfse/SubsidiaryOfADomesticEntity},
   :skos/definition
   "non-bank entity of which 25 percent or more of whose voting shares are owned or controlled by an entity that is based in the United States, or of which a majority of its directors are controlled by such domestic entity, or of which 25 percent or more of whose voting shares are held by trustees for the benefit of the shareholders or members of such domestic entity"})

(def NonDepositoryTrustCompany
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "https://www.ffiec.gov/npw/Help/InstitutionTypes"},
   :db/ident :fibo-fbc-fct-usfse/NonDepositoryTrustCompany,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "non-depository trust company",
   :rdfs/subClassOf #{:fibo-fbc-fct-fse/TrustCompany
                      :fibo-fbc-fct-fse/NonDepositoryInstitution},
   :skos/definition
   "trust company that accepts and executes trusts, but does not issue currency; non-depository trust companies can either be Federal Reserve Members or Federal Reserve Non-members"})

(def OfficeOfAForeignBank
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.ecfr.gov/current/title-12/chapter-II/subchapter-A/part-211/subpart-B/section-211.21"},
   :db/ident :fibo-fbc-fct-usfse/OfficeOfAForeignBank,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "office of a foreign bank",
   :rdfs/subClassOf :fibo-fnd-plc-fac/Facility,
   :skos/definition
   "facility that is any branch, agency, representative office, or commercial lending company subsidiary of a foreign bank in the United States"})

(def RegionalAdministrativeOfficeOfAForeignBank
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.ecfr.gov/current/title-12/chapter-II/subchapter-A/part-211/subpart-B/section-211.21"},
   :cmns-av/synonym "regional administrative office",
   :db/ident :fibo-fbc-fct-usfse/RegionalAdministrativeOfficeOfAForeignBank,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "regional administrative office of a foreign bank",
   :rdfs/subClassOf :fibo-fbc-fct-usfse/RepresentativeOfficeOfAForeignBank,
   :skos/definition
   "representative office that \n(1) Is established by a foreign bank that operates two or more branches, agencies, commercial lending companies, or banks in the United States; \n(2) Is located in the same city as one or more of the foreign bank's branches, agencies, commercial lending companies, or banks in the United States; \n(3) Manages, supervises, or coordinates the operations of the foreign bank or its affiliates, if any, in a particular geographic area that includes the United States or a region thereof, including by exercising credit approval authority in that area pursuant to written standards, credit policies, and procedures established by the foreign bank; and \n(4) Does not solicit business from actual or potential customers of the foreign bank or its affiliates."})

(def RepresentativeOfficeOfAForeignBank
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.ecfr.gov/current/title-12/chapter-II/subchapter-A/part-211/subpart-B/section-211.21"},
   :cmns-av/synonym "representative office",
   :db/ident :fibo-fbc-fct-usfse/RepresentativeOfficeOfAForeignBank,
   :owl/disjointWith #{{:owl/onProperty :cmns-rlcmp/playsRole,
                        :owl/someValuesFrom
                        :fibo-fbc-fct-usfse/AgencyOfAForeignBankingOrganization,
                        :rdf/type :owl/Restriction}
                       {:owl/onProperty :cmns-rlcmp/playsRole,
                        :owl/someValuesFrom
                        :fibo-fbc-fct-usfse/CommercialLendingCompany,
                        :rdf/type :owl/Restriction}
                       :fibo-fbc-fct-usfse/DomesticBranchOfAForeignBank},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "representative office of a foreign bank",
   :rdfs/subClassOf :fibo-fbc-fct-usfse/OfficeOfAForeignBank,
   :skos/definition
   "office of a foreign bank which is located in any state and is not a federal branch, federal agency, state branch, state agency, or commercial lending company subsidiary"})

(def SavingsBank
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "https://www.ffiec.gov/npw/Help/InstitutionTypes"},
   :cmns-av/explanatoryNote
   "Savings banks can have state and federal affiliations, for example, State Savings Banks and Federal Savings Banks",
   :db/ident :fibo-fbc-fct-usfse/SavingsBank,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "savings bank",
   :rdfs/subClassOf :fibo-fbc-fct-usfse/ThriftInstitution,
   :skos/definition
   "banking institution organized to accept savings deposits and pay interest on those savings deposits"})

(def SavingsLoanAssociation
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "https://www.ffiec.gov/npw/Help/InstitutionTypes"},
   :cmns-av/synonym "savings and loan association",
   :db/ident :fibo-fbc-fct-usfse/SavingsLoanAssociation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "savings loan association",
   :rdfs/subClassOf :fibo-fbc-fct-usfse/ThriftInstitution,
   :skos/definition
   "financial institution that accepts deposits primarily from individuals and channels its funds primarily into residential mortgage loans"})

(def SavingsLoanHoldingCompany
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "https://www.ffiec.gov/npw/Help/InstitutionTypes"},
   :cmns-av/synonym "savings and loan holding company",
   :db/ident :fibo-fbc-fct-usfse/SavingsLoanHoldingCompany,
   :owl/disjointWith :fibo-fbc-fct-fse/BankHoldingCompany,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "savings loan holding company",
   :rdfs/subClassOf #{:fibo-fbc-pas-fpas/FinancialServiceProvider
                      :fibo-fbc-fct-fse/HoldingCompany
                      {:owl/onProperty :fibo-fbc-fct-fse/hasPortfolioCompany,
                       :owl/someValuesFrom
                       {:owl/unionOf
                        [:fibo-fbc-fct-usfse/SavingsLoanAssociation
                         :fibo-fbc-fct-usfse/SavingsLoanHoldingCompany],
                        :rdf/type :owl/Class},
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "company that directly or indirectly controls a savings association or related holding company, and explicitly excludes any company that is also a bank holding company"})

(def StateAgencyOfForeignBankingOrganization
  {:cmns-av/adaptedFrom
   #{{:xsd/anyURI
      "https://www.govinfo.gov/content/pkg/USCODE-2021-title12/pdf/USCODE-2021-title12-chap32-sec3101.pdf"}
     {:xsd/anyURI "https://www.ffiec.gov/npw/Help/InstitutionTypes"}
     {:xsd/anyURI
      "https://www.ecfr.gov/current/title-12/chapter-II/subchapter-A/part-211/subpart-B/section-211.21"}
     {:xsd/anyURI
      "https://www.govinfo.gov/content/pkg/COMPS-275/pdf/COMPS-275.pdf"}},
   :db/ident :fibo-fbc-fct-usfse/StateAgencyOfForeignBankingOrganization,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "state agency of foreign banking organization",
   :rdfs/subClassOf :fibo-fbc-fct-usfse/AgencyOfAForeignBankingOrganization,
   :skos/definition
   "agency of a foreign bank established and operating under the laws of any state, where state means any State of the United States or the District of Columbia"})

(def StateBranchOfForeignBankingOrganization
  {:cmns-av/adaptedFrom
   #{{:xsd/anyURI "https://www.ffiec.gov/npw/Help/InstitutionTypes"}
     {:xsd/anyURI
      "https://www.govinfo.gov/content/pkg/COMPS-275/pdf/COMPS-275.pdf"}},
   :db/ident :fibo-fbc-fct-usfse/StateBranchOfForeignBankingOrganization,
   :owl/disjointWith
   :fibo-fbc-fct-usfse/FederalBranchOfForeignBankingOrganization,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "state branch of foreign banking organization",
   :rdfs/subClassOf :fibo-fbc-fct-usfse/DomesticBranchOfAForeignBank,
   :skos/definition
   "branch of a foreign bank located in any State of the United States at which deposits are received, established and operating under the laws of that State, where state means any State of the United States or the District of Columbia"})

(def StateCharteredBank
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "https://www.ffiec.gov/npw/Help/InstitutionTypes"},
   :cmns-av/explanatoryNote
   #{"A state bank is defined as any bank, banking association, trust company, savings bank, industrial bank (or similar depository institution operating substantially in the same manner as an industrial bank), or other banking institution which is engaged in the business of receiving deposits other than trust funds, and in the US, is incorporated under the laws of any State or which is operating under the Code of Law for the District of Columbia, including any cooperative bank or other unincorporated bank the deposits of which were insured by the Federal Deposit Insurance Corporation on the day before the date of the enactment of the Financial Institutions Reform, Recovery, and Enforcement Act of 1989."
     "State-chartered banks may or may not be members of the Federal Reserve System, but typically belong to the Federal Deposit Insurance Corporation, who may be their primary federal regulator for those that are not FRS members."},
   :db/ident :fibo-fbc-fct-usfse/StateCharteredBank,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "state-chartered bank",
   :rdfs/subClassOf #{:fibo-fbc-fct-usfse/USBank
                      :fibo-fbc-fct-fse/CommercialBank},
   :skos/definition
   "commercial bank whose charter is approved by a state banking regulator"})

(def StateCreditUnion
  {:db/ident :fibo-fbc-fct-usfse/StateCreditUnion,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "state credit union",
   :rdfs/subClassOf :fibo-fbc-fct-usfse/USCreditUnion,
   :skos/definition "credit union that has a state affiliation"})

(def StateSavingsBank
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "https://www.ffiec.gov/npw/Help/InstitutionTypes"},
   :db/ident :fibo-fbc-fct-usfse/StateSavingsBank,
   :owl/disjointWith :fibo-fbc-fct-usfse/FederalSavingsBank,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "state savings bank",
   :rdfs/subClassOf :fibo-fbc-fct-usfse/SavingsBank,
   :skos/definition "savings bank that has a state affiliation"})

(def SubsidiaryOfADomesticEntity
  {:cmns-av/explanatoryNote
   #{"From the perspective of the International Banking Act of 1978, the definition of subsidiary is the definition from the Bank Holding Act of 1956. Thus, the meaining of the term 'subsidiary' with respect to the NIC repository and, specifically, with respect to the definition of an 'international non-bank subsidiary of a domestic entity', is the definition from the Bank Holding Company Act of 1956."
     "The Bank Holding Company Act of 1956 defines a 'Subsidiary', with respect to a specified bank holding company, means (1) any company 25 per centum or more of whose voting shares (excluding shares owned by the United States or by any company wholly owned by the United States) is owned or controlled by such bank holding company; or (2) any company the election of a majority of whose directors is controlled in any manner by such bank holding company; or (3) any company 25 per centum or more of whose voting shares are held by trustees for the benefit of the shareholders or members of such bank holding company."},
   :db/ident :fibo-fbc-fct-usfse/SubsidiaryOfADomesticEntity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "subsidiary of a domestic entity",
   :rdfs/seeAlso
   {:xsd/anyURI
    "https://fraser.stlouisfed.org/title/bank-holding-company-act-1956-984/fulltext"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-be-oac-cctl/isSubsidiaryOf,
      :owl/someValuesFrom {:owl/onProperty :cmns-rlcmp/isPlayedBy,
                           :owl/someValuesFrom
                           :fibo-fbc-fct-usfse/DomesticEntity,
                           :rdf/type :owl/Restriction},
      :rdf/type           :owl/Restriction} :fibo-be-oac-cctl/Subsidiary},
   :skos/definition
   "entity of which 25 percent or more of whose voting shares are owned or controlled by an entity that is based in the United States, or of which a majority of its directors are controlled by such domestic entity, or of which 25 percent or more of whose voting shares are held by trustees for the benefit of the shareholders or members of such domestic entity"})

(def ThriftInstitution
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "https://www.ffiec.gov/npw/Help/InstitutionTypes"},
   :db/ident :fibo-fbc-fct-usfse/ThriftInstitution,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "thrift institution",
   :rdfs/subClassOf #{:fibo-fbc-fct-fse/SavingsAssociation
                      :fibo-fbc-fct-usfse/DomesticEntity},
   :skos/definition
   "savings association that primarily accepts savings account deposits and invests most of the proceeds in mortgages",
   :skos/example
   "Savings banks and savings and loan associations and credit unions are examples of thrift institutions."})

(def USBank
  {:cmns-av/adaptedFrom
   {:rdf/value
    "As defined in the Federal Deposit Insurance Act, https://www.fdic.gov/regulations/laws/rules/1000-400.html#fdic1000sec.3a"},
   :cmns-av/explanatoryNote
   #{"The Bank Holding Company Act of 1956 defines a bank as any depository financial intermediary that accepts checking accounts (checks) or makes commercial loans, and its deposits are insured by a federal deposit insurance agency. A bank acts as a middleman between suppliers of funds and users of funds, substituting its own credit judgement for that of the ultimate suppliers of funds, collecting those funds from three sources: checking accounts, savings and time deposits; short-term borrowings from other banks; and equity capital. A bank earns money by reinvesting these funds in longer-term assets."
     "A bank, as specified in the Investment Company Act of 1940, is a financial intermediary that is (a) a depository institution (as defined in section 3 of the Federal Deposit Insurance Act) or a branch or agency of a foreign bank (as such terms are defined in section 1(b) of the International Banking Act of 1978), (b) a member bank of the Federal Reserve System, (c) any other banking institution or trust company, whether incorporated or not, doing business under the laws of any State or of the United States, a substantial portion of the business of which consists of receiving deposits or exercising fiduciary powers similar to those permitted to national banks under the authority of the Comptroller of the Currency, and which is supervised and examined by State or Federal authority having supervision over banks, and which is not operated for the purpose of evading the provisions of this title, and (d) a receiver, conservator, or other liquidating agent of any institution or firm included in clause (a), (b), or (c) of this paragraph."},
   :db/ident :fibo-fbc-fct-usfse/USBank,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "U.S. bank",
   :rdfs/seeAlso {:xsd/anyURI "https://www.sec.gov/about/laws/ica40.pdf"},
   :rdfs/subClassOf #{:fibo-fbc-fct-fse/Bank
                      :fibo-fbc-fct-usfse/DomesticEntity},
   :skos/definition
   "bank that is licensed to conduct business in the United States"})

(def USBankHoldingCompany
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "https://www.ffiec.gov/npw/Help/InstitutionTypes"},
   :cmns-av/explanatoryNote
   #{"From the Bank Holding Company Act of 1956, a 'bank holding company' means any company (1) which directly or indirectly owns, controls, or holds with power to vote, 25 per centum or more of the voting shares of each of two or more banks or of a company which is or becomes a bank holding company by virtue of this Act, or (2) which controls in any manner the election of a majority of the directors of each of two or more banks, or (3) for the benefit of whose shareholders or members 25 per centum or more of the voting shares of each of two or more banks or a bank holding company is held by trustees; and for the purposes of this Act, any successor to any such company shall be deemed to be a bank holding company from the date as of which such predecessor company became a bank holding company. Notwithstanding the foregoing, (A) no bank shall be a bank holding company by virtue of its ownership or control of shares in a fiduciary capacity, except where such shares are held for the benefit of the shareholders of such bank, (B) no company shall be a bank holding company which is registered under the Investment Company Act of 1940, and was so registered prior to May 15, 1955 (or which is affiliated with any such company in such manner as to constitute an affiliated company within the meaning of such Act), unless such company (or such affiliated company), as the case may be, directly owns 25 per centum or more of the voting shares of each of two or more banks, (C) no company shall be a bank holding company by virtue of its ownership or control of shares acquired by it in connection with its underwriting of securities and which are held only for such period of time as will permit the sale thereof upon a reasonable basis, (D) no company formed for the sole purpose of participating in a proxy solicitation shall be a bank holding company by virtue of its control of voting rights of shares acquired in the course of such solicitation, and (E) no company shall be a bank holding company if at least 80 per centum of its total assets are composed of holdings in the field of agriculture."
     "According to the FFIEC, a bank holding company is a company that owns and/or controls one or more U.S. banks or one that owns, or has controlling interest in, one or more banks. A bank holding company may also own another bank holding company, which in turn owns or controls a bank; the company at the top of the ownership chain is called the top holder. The Board of Governors is responsible for regulating and supervising bank holding companies, even if the bank owned by the holding company is under the primary supervision of a different federal agency (OCC or FDIC)."},
   :db/ident :fibo-fbc-fct-usfse/USBankHoldingCompany,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "U.S. bank holding company",
   :rdfs/subClassOf #{:fibo-fbc-fct-fse/BankHoldingCompany
                      :fibo-fbc-fct-usfse/DomesticEntity
                      {:owl/onProperty :fibo-fbc-fct-fse/hasPortfolioCompany,
                       :owl/someValuesFrom :fibo-fbc-fct-usfse/USBank,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "bank holding company that is licensed to conduct business in the United States and is regulated and supervised by the Federal Reserve in accordance with the Bank Holding Company Act of 1956"})

(def USCreditUnion
  {:cmns-av/explanatoryNote
   "As soon as you deposit funds into a credit union account, you become a partial owner and participate in the union's profitability. Credit unions may be formed by large corporations and organizations for their employees and members.",
   :db/ident :fibo-fbc-fct-usfse/USCreditUnion,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "U.S. credit union",
   :rdfs/subClassOf #{:fibo-fbc-fct-fse/CreditUnion
                      :fibo-fbc-fct-usfse/ThriftInstitution
                      {:owl/onClass    :fibo-be-le-cb/NotForProfitCorporation,
                       :owl/onProperty :cmns-rlcmp/isPlayedBy,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "cooperative association organized for the purpose of promoting thrift among its members and creating a source of credit for provident or productive purposes"})

(def UninsuredFederalAgencyOfForeignBankingOrganization
  {:cmns-av/adaptedFrom
   #{{:xsd/anyURI "https://www.ffiec.gov/npw/Help/InstitutionTypes"}
     {:xsd/anyURI
      "https://www.govinfo.gov/content/pkg/COMPS-275/pdf/COMPS-275.pdf"}},
   :db/ident
   :fibo-fbc-fct-usfse/UninsuredFederalAgencyOfForeignBankingOrganization,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "uninsured federal agency of foreign banking organization",
   :rdfs/subClassOf
   :fibo-fbc-fct-usfse/FederalAgencyOfForeignBankingOrganization,
   :skos/definition
   "agency of a foreign bank established and operating under section 3102 of CFR Title 12, Chapter 32 and section 4 of the International Banking Act of 1978 that is not insured or regulated by the Federal Deposit Insurance Corporation (FDIC)"})

(def UninsuredFederalBranchOfForeignBankingOrganization
  {:cmns-av/adaptedFrom
   #{{:xsd/anyURI "https://www.ffiec.gov/npw/Help/InstitutionTypes"}
     {:xsd/anyURI
      "https://www.govinfo.gov/content/pkg/COMPS-275/pdf/COMPS-275.pdf"}},
   :cmns-av/explanatoryNote
   "An uninsured branch does not accept retail deposits and need not apply for federal deposit insurance.",
   :db/ident
   :fibo-fbc-fct-usfse/UninsuredFederalBranchOfForeignBankingOrganization,
   :owl/disjointWith
   :fibo-fbc-fct-usfse/InsuredFederalBranchOfForeignBankingOrganization,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "uninsured federal branch of foreign banking organization",
   :rdfs/subClassOf
   :fibo-fbc-fct-usfse/FederalBranchOfForeignBankingOrganization,
   :skos/definition
   "any office or any place of business of a foreign bank located in any State of the United States at which deposits are received established and operating under section 4 of the International Banking Act of 1978 that is not insured or regulated by the Federal Deposit Insurance Corporation (FDIC)"})

(def UninsuredStateAgencyOfForeignBankingOrganization
  {:cmns-av/adaptedFrom
   #{{:xsd/anyURI "https://www.ffiec.gov/npw/Help/InstitutionTypes"}
     {:xsd/anyURI
      "https://www.govinfo.gov/content/pkg/COMPS-275/pdf/COMPS-275.pdf"}},
   :db/ident
   :fibo-fbc-fct-usfse/UninsuredStateAgencyOfForeignBankingOrganization,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "uninsured state agency of foreign banking organization",
   :rdfs/subClassOf :fibo-fbc-fct-usfse/StateAgencyOfForeignBankingOrganization,
   :skos/definition
   "agency of a foreign bank established and operating under the laws of any state that is not insured or regulated by the Federal Deposit Insurance Corporation (FDIC)"})

(def UninsuredStateBranchOfForeignBankingOrganization
  {:cmns-av/adaptedFrom
   #{{:xsd/anyURI "https://www.ffiec.gov/npw/Help/InstitutionTypes"}
     {:xsd/anyURI
      "https://www.govinfo.gov/content/pkg/COMPS-275/pdf/COMPS-275.pdf"}},
   :cmns-av/explanatoryNote
   "An uninsured branch does not accept retail deposits and need not apply for federal deposit insurance.",
   :db/ident
   :fibo-fbc-fct-usfse/UninsuredStateBranchOfForeignBankingOrganization,
   :owl/disjointWith
   :fibo-fbc-fct-usfse/InsuredStateBranchOfForeignBankingOrganization,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "uninsured state branch of foreign banking organization",
   :rdfs/subClassOf :fibo-fbc-fct-usfse/StateBranchOfForeignBankingOrganization,
   :skos/definition
   "any office or any place of business of a foreign bank located in any State of the United States at which deposits are received, established and operating under the laws of that State that is not insured or regulated by the Federal Deposit Insurance Corporation (FDIC)"})

(def hasHomeCountry
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.ecfr.gov/current/title-12/chapter-II/subchapter-A/part-211/subpart-B/section-211.21"},
   :db/ident :fibo-fbc-fct-usfse/hasHomeCountry,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-pas-fpas/FinancialServiceProvider,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "has home country",
   :rdfs/range :lcc-cr/Country,
   :rdfs/subPropertyOf :fibo-fnd-plc-loc/hasCountry,
   :skos/definition
   "indicates, with respect to a foreign bank, the country in which the foreign bank is chartered or incorporated"})

(def hasHomeCountrySupervisor
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.ecfr.gov/current/title-12/chapter-II/subchapter-A/part-211/subpart-B/section-211.21"},
   :db/ident :fibo-fbc-fct-usfse/hasHomeCountrySupervisor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-pas-fpas/FinancialServiceProvider,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "has home country supervisor",
   :rdfs/range :fibo-fbc-fct-rga/RegulatoryAgency,
   :rdfs/subPropertyOf :fibo-fbc-fct-rga/isRegulatedBy,
   :skos/definition
   "indicates, with respect to a foreign bank, the governmental entity or entities in the foreign bank's home country with responsibility for the supervision and regulation of the foreign bank"})

(def isSubjectToReserveRequirements
  {:db/ident :fibo-fbc-fct-usfse/isSubjectToReserveRequirements,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-fbc-pas-fpas/FinancialServiceProvider,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdfs/label "is subject to reserve requirements",
   :rdfs/range :xsd/boolean,
   :skos/definition
   "indicates whether some capability of a financial service provider is contingent on conformance with certain Federal Reserve policies, regulations, or other requirements"})

(def urn:uuid:913f4dab-b337-5e12-867e-7ad96f167896
  {:cmns-av/copyright #{"Copyright (c) 2015-2024 Object Management Group, Inc."
                        "Copyright (c) 2015-2024 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology extends the primary financial services entities ontology in FBC with additional kinds of entities that are specific to the United States.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Places/Locations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/OwnershipAndControl/CorporateControl/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/RegulatoryAgencies/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/FinancialServicesEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/ProductsAndServices/FinancialProductsAndServices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/OwnershipAndControl/Control/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/OwnershipAndControl/Ownership/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Places/Facilities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/LegalEntities/FormalBusinessOrganizations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/LegalEntities/CorporateBodies/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Organizations/FormalOrganizations/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "US Financial Services Entities Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities.rdf version of this ontology was modified to eliminate deprecated elements."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities.rdf version of this ontology was modified per the issue resolutions identified in the FIBO FBC 1.0 FTF report."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary, add additional kinds of institutions in order to answer competency questions using the National Information Center (NIC) repository, leverage the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) to eliminate redundancies in FIBO, and clean up a couple of definitions to be ISO 704 compliant."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities.rdf version of this ontology was modified to augment the representation of institutions based on their definitions in the law, in order to answer competency questions using the National Information Center (NIC) repository"
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities.rdf version of this ontology was modified to generalize the definition of credit union."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities.rdf version of this ontology was modified to eliminate circular definitions and revise names such that concepts don't appear to refer to multiple things."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities.rdf version of this ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities.rdf version of this ontology was modified to eliminate dead links and address text formatting issues identified through hygiene testing."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"})