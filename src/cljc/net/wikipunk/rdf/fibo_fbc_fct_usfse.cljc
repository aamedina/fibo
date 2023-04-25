(ns net.wikipunk.rdf.fibo-fbc-fct-usfse
  "This ontology extends the primary financial services entities ontology in FBC with additional kinds of entities that are specific to the United States."
  {:cmns-av/copyright ["Copyright (c) 2015-2023 Object Management Group, Inc."
                       "Copyright (c) 2015-2023 EDM Council, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :dcterms/abstract
   "This ontology extends the primary financial services entities ontology in FBC with additional kinds of entities that are specific to the United States.",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Roles/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/FinancialProductsAndServices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/CorporateBodies/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/FinancialServicesEntities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/FormalBusinessOrganizations/"
    "https://www.omg.org/spec/Commons/Collections/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Organizations/FormalOrganizations/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-ge-usj"
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/",
    "fibo-be-le-cb"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/CorporateBodies/",
    "fibo-be-le-fbo"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/FormalBusinessOrganizations/",
    "fibo-fbc-fct-fse"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/",
    "fibo-fbc-fct-usfse"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
    "fibo-fbc-pas-fpas"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
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
   :rdfa/prefix "fibo-fbc-fct-usfse",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "US Financial Services Entities Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities.rdf version of this ontology was modified to eliminate deprecated elements."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities.rdf version of this ontology was modified to eliminate dead links and address text formatting issues identified through hygiene testing."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities.rdf version of this ontology was modified to generalize the definition of credit union."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary, add additional kinds of institutions in order to answer competency questions using the National Information Center (NIC) repository, the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) to eliminate redundancies in FIBO, and clean up a couple of definitions to be ISO 704 compliant."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities.rdf version of this ontology was modified per the issue resolutions identified in the FIBO FBC 1.0 FTF report."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities.rdf version of this ontology was modified to eliminate circular definitions and revise names such that concepts don't appear to refer to multiple things."]})

(def AgreementCorporation
  "corporation chartered by a state to engage in international banking, so named because the corporation enters into an 'agreement' with the Fed's Board of Governors that it will limit its activities to those permitted"
  {:cmns-av/adaptedFrom "https://www.ffiec.gov/npw/Help/InstitutionTypes",
   :db/ident :fibo-fbc-fct-usfse/AgreementCorporation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "agreement corporation",
   :rdfs/subClassOf [{:owl/onClass    :fibo-be-le-cb/Corporation,
                      :owl/onProperty :fibo-fnd-rel-rel/hasIdentity,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-pas-fpas/FinancialServiceProvider],
   :skos/definition
   "corporation chartered by a state to engage in international banking, so named because the corporation enters into an 'agreement' with the Fed's Board of Governors that it will limit its activities to those permitted"})

(def AgreementCorporation-Banking
  "agreement corporation whose charter allows the corporation to engage in international banking"
  {:cmns-av/adaptedFrom "https://www.ffiec.gov/npw/Help/InstitutionTypes",
   :db/ident :fibo-fbc-fct-usfse/AgreementCorporation-Banking,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "agreement corporation - banking",
   :rdfs/subClassOf [:fibo-fbc-fct-usfse/AgreementCorporation
                     :fibo-fbc-fct-fse/DepositoryInstitution],
   :skos/definition
   "agreement corporation whose charter allows the corporation to engage in international banking"})

(def AgreementCorporation-Investment
  "agreement corporation whose charter allows the corporation to engage in international investment banking"
  {:cmns-av/adaptedFrom "https://www.ffiec.gov/npw/Help/InstitutionTypes",
   :db/ident :fibo-fbc-fct-usfse/AgreementCorporation-Investment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "agreement corporation - investment",
   :rdfs/subClassOf [:fibo-fbc-fct-usfse/AgreementCorporation
                     :fibo-fbc-fct-fse/InvestmentBank],
   :skos/definition
   "agreement corporation whose charter allows the corporation to engage in international investment banking"})

(def BankersBank
  "commercial bank owned exclusively (except to the extent directors' qualifying shares are required by law) by other depository institutions or depository institution holding companies, the activities of which are limited by its articles of association exclusively to providing services to or for other depository institutions, their holding companies, and the officers, directors, and employees of such institutions and companies, and to providing correspondent banking services at the request of other depository institutions or their holding companies"
  {:cmns-av/adaptedFrom
   "Depository Institutions Deregulation and Monetary Control Act of 1980, available at https://www.govinfo.gov/content/pkg/STATUTE-94/pdf/STATUTE-94-Pg132.pdf, section 711",
   :cmns-av/explanatoryNote
   "Bankers' banks are typically (1) organized solely to do business with other financial institutions (with the exceptions defined herein), (2) owned primarily by the financial institutions with which they conduct business, and (3) do not do business with the general public.",
   :db/ident :fibo-fbc-fct-usfse/BankersBank,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "bankers' bank",
   :rdfs/subClassOf [{:owl/onDataRange :xsd/boolean,
                      :owl/onProperty
                      :fibo-fbc-fct-usfse/isSubjectToReserveRequirements,
                      :owl/qualifiedCardinality 1,
                      :rdf/type :owl/Restriction}
                     :fibo-fbc-fct-usfse/USBank
                     :fibo-fbc-fct-fse/CommercialBank],
   :skos/definition
   "commercial bank owned exclusively (except to the extent directors' qualifying shares are required by law) by other depository institutions or depository institution holding companies, the activities of which are limited by its articles of association exclusively to providing services to or for other depository institutions, their holding companies, and the officers, directors, and employees of such institutions and companies, and to providing correspondent banking services at the request of other depository institutions or their holding companies"})

(def BankersBankNotSubjectToReserveRequirements
  "bankers' bank whose activities are not limited by specific requirements of the Federal Reserve"
  {:cmns-av/adaptedFrom
   "https://www.ffiec.gov/nicpubweb/Content/DataDownload/NPW%20Data%20Dictionary.pdf",
   :db/ident :fibo-fbc-fct-usfse/BankersBankNotSubjectToReserveRequirements,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "bankers' bank that is not subject to reserve requirements",
   :rdfs/subClassOf [{:owl/hasValue {:xsd/boolean false},
                      :owl/onProperty
                      :fibo-fbc-fct-usfse/isSubjectToReserveRequirements,
                      :rdf/type :owl/Restriction}
                     :fibo-fbc-fct-usfse/BankersBank],
   :skos/definition
   "bankers' bank whose activities are not limited by specific requirements of the Federal Reserve"})

(def BankersBankSubjectToReserveRequirements
  "bankers' bank whose activities are limited by specific requirements of the Federal Reserve"
  {:cmns-av/adaptedFrom
   "https://www.ffiec.gov/nicpubweb/Content/DataDownload/NPW%20Data%20Dictionary.pdf",
   :db/ident :fibo-fbc-fct-usfse/BankersBankSubjectToReserveRequirements,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "bankers' bank subject to reserve requirements",
   :rdfs/subClassOf [{:owl/hasValue {:xsd/boolean true},
                      :owl/onProperty
                      :fibo-fbc-fct-usfse/isSubjectToReserveRequirements,
                      :rdf/type :owl/Restriction}
                     :fibo-fbc-fct-usfse/BankersBank],
   :skos/definition
   "bankers' bank whose activities are limited by specific requirements of the Federal Reserve"})

(def CooperativeBank
  "state-chartered savings association that is organized and operates according to the laws of the state in which it is chartered or organized, including Massachusetts, New Hampshire, Rhode Island or Vermont"
  {:cmns-av/adaptedFrom "https://www.ffiec.gov/npw/Help/InstitutionTypes",
   :db/ident :fibo-fbc-fct-usfse/CooperativeBank,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "cooperative bank",
   :rdfs/subClassOf :fibo-fbc-fct-usfse/ThriftInstitution,
   :skos/definition
   "state-chartered savings association that is organized and operates according to the laws of the state in which it is chartered or organized, including Massachusetts, New Hampshire, Rhode Island or Vermont"})

(def DomesticBranchOfDomesticBank
  "branch that resides in the United States, and whose parent is also located in the United States"
  {:cmns-av/adaptedFrom "https://www.ffiec.gov/npw/Help/InstitutionTypes",
   :db/ident :fibo-fbc-fct-usfse/DomesticBranchOfDomesticBank,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "domestic branch of domestic bank",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-col/isPartOf,
                      :owl/someValuesFrom :fibo-fbc-fct-usfse/USBank,
                      :rdf/type           :owl/Restriction}
                     {:owl/hasValue   :lcc-3166-1/UnitedStatesOfAmerica,
                      :owl/onProperty :fibo-fnd-org-fm/isDomiciledIn,
                      :rdf/type       :owl/Restriction}
                     :fibo-be-le-fbo/Branch],
   :skos/definition
   "branch that resides in the United States, and whose parent is also located in the United States"})

(def DomesticEntityOther
  "domestic institution that engages in banking activities usually in connection with the business of banking in the United States"
  {:cmns-av/abbreviation "DEO",
   :cmns-av/adaptedFrom "https://www.ffiec.gov/npw/Help/InstitutionTypes",
   :cmns-av/explanatoryNote
   "This classification is used primarily to cover organizations acting as financial institutions in the US that are not otherwise classified in the context of the National Information Center (NIC).",
   :db/ident :fibo-fbc-fct-usfse/DomesticEntityOther,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "domestic entity other",
   :rdfs/subClassOf :fibo-fbc-fct-usfse/FarmCreditSystemInstitution,
   :skos/definition
   "domestic institution that engages in banking activities usually in connection with the business of banking in the United States"})

(def EdgeCorporation
  "corporation chartered by the Federal Reserve to engage in international banking and financial operations"
  {:cmns-av/adaptedFrom "https://www.ffiec.gov/npw/Help/InstitutionTypes",
   :db/ident :fibo-fbc-fct-usfse/EdgeCorporation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "edge corporation",
   :rdfs/subClassOf [{:owl/onClass    :fibo-be-le-cb/Corporation,
                      :owl/onProperty :fibo-fnd-rel-rel/hasIdentity,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-pas-fpas/FinancialServiceProvider],
   :skos/definition
   "corporation chartered by the Federal Reserve to engage in international banking and financial operations"})

(def EdgeCorporation-Banking
  "edge corporation whose charter allows the corporation to engage in international banking"
  {:cmns-av/adaptedFrom "https://www.ffiec.gov/npw/Help/InstitutionTypes",
   :db/ident :fibo-fbc-fct-usfse/EdgeCorporation-Banking,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "edge corporation - banking",
   :rdfs/subClassOf [:fibo-fbc-fct-usfse/EdgeCorporation
                     :fibo-fbc-fct-fse/DepositoryInstitution],
   :skos/definition
   "edge corporation whose charter allows the corporation to engage in international banking"})

(def EdgeCorporation-DomesticBranch
  "branch of an edge corporation that is located in the United States"
  {:cmns-av/adaptedFrom "https://www.ffiec.gov/npw/Help/InstitutionTypes",
   :db/ident :fibo-fbc-fct-usfse/EdgeCorporation-DomesticBranch,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "edge corporation - domestic branch",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-col/isPartOf,
                      :owl/someValuesFrom :fibo-fbc-fct-usfse/EdgeCorporation,
                      :rdf/type           :owl/Restriction}
                     {:owl/hasValue   :lcc-3166-1/UnitedStatesOfAmerica,
                      :owl/onProperty :fibo-fnd-org-fm/isDomiciledIn,
                      :rdf/type       :owl/Restriction}
                     :fibo-be-le-fbo/Branch],
   :skos/definition
   "branch of an edge corporation that is located in the United States"})

(def EdgeCorporation-Investment
  "edge corporation whose charter allows the corporation to engage in international investment banking"
  {:cmns-av/adaptedFrom "https://www.ffiec.gov/npw/Help/InstitutionTypes",
   :db/ident :fibo-fbc-fct-usfse/EdgeCorporation-Investment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "edge corporation - investment",
   :rdfs/subClassOf [:fibo-fbc-fct-usfse/EdgeCorporation
                     :fibo-fbc-fct-fse/InvestmentBank],
   :skos/definition
   "edge corporation whose charter allows the corporation to engage in international investment banking"})

(def FarmCreditSystemInstitution
  "federally-chartered financial institution that is supervised, examined, and regulated by the Farm Credit Administration and operates in accordance with the Farm Credit Act of 1971, as amended, 12 U.S.C. 2001 et seq"
  {:cmns-av/adaptedFrom "https://www.ffiec.gov/npw/Help/InstitutionTypes",
   :cmns-av/explanatoryNote
   "All Farm Credit System institutions are federally-chartered instrumentalities of the United States.",
   :db/ident :fibo-fbc-fct-usfse/FarmCreditSystemInstitution,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "farm credit system institution",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-pty-rl/isPlayedBy,
                      :owl/someValuesFrom
                      {:owl/intersectionOf
                       [{:owl/hasValue   :lcc-3166-1/UnitedStatesOfAmerica,
                         :owl/onProperty :fibo-fnd-org-fm/isDomiciledIn,
                         :rdf/type       :owl/Restriction}
                        {:owl/hasValue :fibo-be-ge-usj/UnitedStatesJurisdiction,
                         :owl/onProperty :fibo-be-le-cb/isIncorporatedIn,
                         :rdf/type :owl/Restriction}],
                       :rdf/type :owl/Class},
                      :rdf/type :owl/Restriction}
                     :fibo-fbc-fct-fse/FinancialInstitution],
   :skos/definition
   "federally-chartered financial institution that is supervised, examined, and regulated by the Farm Credit Administration and operates in accordance with the Farm Credit Act of 1971, as amended, 12 U.S.C. 2001 et seq"})

(def FederalBranchOfForeignBankingOrganization
  "any office or any place of business of a foreign bank located in any State of the United States at which deposits are received, established and operating under section 4 of the International Banking Act of 1978"
  {:cmns-av/adaptedFrom
   ["https://www.govinfo.gov/content/pkg/COMPS-275/pdf/COMPS-275.pdf"
    "https://www.ffiec.gov/npw/Help/InstitutionTypes"],
   :db/ident :fibo-fbc-fct-usfse/FederalBranchOfForeignBankingOrganization,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "federal branch of foreign banking organization",
   :rdfs/subClassOf [{:owl/onProperty :cmns-col/isPartOf,
                      :owl/someValuesFrom
                      :fibo-fbc-fct-usfse/ForeignBankingOrganization,
                      :rdf/type :owl/Restriction}
                     :fibo-be-le-fbo/Branch],
   :skos/definition
   "any office or any place of business of a foreign bank located in any State of the United States at which deposits are received, established and operating under section 4 of the International Banking Act of 1978"})

(def FederalCreditUnion
  "credit union that has a federal affiliation"
  {:db/ident :fibo-fbc-fct-usfse/FederalCreditUnion,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "federal credit union",
   :rdfs/subClassOf :fibo-fbc-fct-usfse/USCreditUnion,
   :skos/definition "credit union that has a federal affiliation"})

(def FederalSavingsBank
  "savings bank that has a federal affiliation"
  {:cmns-av/adaptedFrom "https://www.ffiec.gov/npw/Help/InstitutionTypes",
   :db/ident :fibo-fbc-fct-usfse/FederalSavingsBank,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "federal savings bank",
   :rdfs/subClassOf :fibo-fbc-fct-usfse/SavingsBank,
   :skos/definition "savings bank that has a federal affiliation"})

(def FinancialHoldingCompany
  "financial entity engaged in a broad range of banking-related activities as permitted under the Gramm-Leach-Bliley Act of 1999"
  {:cmns-av/adaptedFrom "https://www.ffiec.gov/npw/Help/InstitutionTypes",
   :cmns-av/explanatoryNote
   "These activities include: insurance underwriting, securities dealing and underwriting, financial and investment advisory services, merchant banking, issuing or selling securitized interests in bank-eligible assets, and generally engaging in any non-banking activity authorized by the Bank Holding Company Act. The Federal Reserve Board is responsible for supervising the financial condition and activities of financial holding companies. Similarly, any non-bank commercial company that is predominantly engaged in financial activities, earning 85 percent or more of its gross revenues from financial services, may choose to become a financial holding company. These companies are required to sell any non-financial (commercial) businesses within ten years.",
   :cmns-av/synonym "Financial Holding Company / BHC",
   :db/ident :fibo-fbc-fct-usfse/FinancialHoldingCompany,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "financial holding company",
   :rdfs/subClassOf :fibo-fbc-fct-fse/BankHoldingCompany,
   :skos/definition
   "financial entity engaged in a broad range of banking-related activities as permitted under the Gramm-Leach-Bliley Act of 1999",
   :skos/note "Can be a domestic or foreign domiciled holding company"})

(def ForeignBank
  "financial institution organized under the laws of a foreign country, a territory of the United States, Puerto Rico, Guam, American Samoa, or the Virgin Islands, which engages in the business of banking, or any subsidiary or affiliate, organized under such laws, of any such institution"
  {:cmns-av/adaptedFrom
   ["https://www.govinfo.gov/content/pkg/COMPS-275/pdf/COMPS-275.pdf"
    "https://www.ffiec.gov/nicpubweb/Content/HELP/Institution%20Type%20Description.htm"],
   :cmns-av/explanatoryNote
   "For the purposes of the International Banking Act of 1978, the term 'foreign bank' includes, without limitation, foreign commercial banks, foreign merchant banks and other foreign institutions that engage in banking activities usual in connection with the business of banking in the countries where such foreign institutions are organized or operating.",
   :db/ident :fibo-fbc-fct-usfse/ForeignBank,
   :owl/disjointWith :fibo-fbc-fct-usfse/USBank,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "foreign bank",
   :rdfs/subClassOf :fibo-fbc-fct-fse/Bank,
   :skos/definition
   "financial institution organized under the laws of a foreign country, a territory of the United States, Puerto Rico, Guam, American Samoa, or the Virgin Islands, which engages in the business of banking, or any subsidiary or affiliate, organized under such laws, of any such institution"})

(def ForeignBankingOrganization
  "financial service provder that is headquartered outside the United States and that can acquire or establish freestanding banks or bank holding companies in the United States"
  {:cmns-av/abbreviation "FBO",
   :cmns-av/adaptedFrom
   "https://www.ffiec.gov/nicpubweb/Content/HELP/Institution%20Type%20Description.htm",
   :cmns-av/explanatoryNote
   "These entities are regulated and supervised as domestic institutions.",
   :db/ident :fibo-fbc-fct-usfse/ForeignBankingOrganization,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "foreign banking organization",
   :rdfs/subClassOf :fibo-fbc-pas-fpas/FinancialServiceProvider,
   :skos/definition
   "financial service provder that is headquartered outside the United States and that can acquire or establish freestanding banks or bank holding companies in the United States"})

(def ForeignBankingOrganizationAsABankHoldingCompany
  "foreign banking organization that is a bank holding company in the United States"
  {:cmns-av/adaptedFrom
   "https://www.ffiec.gov/nicpubweb/Content/HELP/Institution%20Type%20Description.htm",
   :cmns-av/explanatoryNote
   "A foreign banking organization that also acts as a bank holding company is thus supervised by the Board of Governors of the Federal Reserve.",
   :cmns-av/synonym "Financial Holding Company / FBO",
   :db/ident
   :fibo-fbc-fct-usfse/ForeignBankingOrganizationAsABankHoldingCompany,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "foreign banking organization as a bank holding company",
   :rdfs/subClassOf [:fibo-fbc-fct-fse/BankHoldingCompany
                     {:owl/hasValue   :lcc-3166-1/UnitedStatesOfAmerica,
                      :owl/onProperty :fibo-fnd-org-fm/isDomiciledIn,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-fct-usfse/ForeignBankingOrganization],
   :skos/definition
   "foreign banking organization that is a bank holding company in the United States"})

(def ForeignBankingOrganizationOfABankHoldingCompany
  "foreign banking organization that is owned or controlled by a bank holding company"
  {:cmns-av/adaptedFrom
   "https://www.ffiec.gov/nicpubweb/Content/HELP/Institution%20Type%20Description.htm",
   :db/ident
   :fibo-fbc-fct-usfse/ForeignBankingOrganizationOfABankHoldingCompany,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "foreign banking organization of a bank holding company",
   :rdfs/subClassOf :fibo-fbc-fct-usfse/ForeignBankingOrganization,
   :skos/definition
   "foreign banking organization that is owned or controlled by a bank holding company"})

(def ForeignBranchOfUSBank
  "branch that resides outside of the United States, but has a parent that is located in the United States"
  {:cmns-av/adaptedFrom "https://www.ffiec.gov/npw/Help/InstitutionTypes",
   :db/ident :fibo-fbc-fct-usfse/ForeignBranchOfUSBank,
   :owl/disjointWith :fibo-fbc-fct-usfse/DomesticBranchOfDomesticBank,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "foreign branch of US bank",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-col/isPartOf,
                      :owl/someValuesFrom :fibo-fbc-fct-usfse/USBank,
                      :rdf/type           :owl/Restriction}
                     :fibo-be-le-fbo/Branch],
   :skos/definition
   "branch that resides outside of the United States, but has a parent that is located in the United States"})

(def ForeignEntityOther
  "foreign institution that engages in banking activities usually in connection with the business of banking in the countries where such foreign institutions are organized or operating"
  {:cmns-av/adaptedFrom "https://www.ffiec.gov/npw/Help/InstitutionTypes",
   :db/ident :fibo-fbc-fct-usfse/ForeignEntityOther,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "foreign entity other",
   :rdfs/subClassOf :fibo-fbc-fct-fse/FinancialInstitution,
   :skos/definition
   "foreign institution that engages in banking activities usually in connection with the business of banking in the countries where such foreign institutions are organized or operating"})

(def IndustrialBank
  "limited service financial institution that raises funds by selling certificates called 'investment shares' and by accepting deposits"
  {:cmns-av/explanatoryNote
   "Often called Morris Plan banks or industrial loan companies, industrial banks are distinguished from commercial loan companies because industrial banks accept deposits in addition to making consumer loans. Industrial banks differ from commercial banks because they do not offer demand deposit (checking) accounts. Industrial banks are not regulated by the Federal Reserve.",
   :db/ident :fibo-fbc-fct-usfse/IndustrialBank,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "industrial bank",
   :rdfs/subClassOf :fibo-fbc-fct-fse/Bank,
   :skos/definition
   "limited service financial institution that raises funds by selling certificates called 'investment shares' and by accepting deposits"})

(def InsuredFederalBranchOfForeignBankingOrganization
  "any office or any place of business of a foreign bank located in any State of the United States at which deposits are received established and operating under section 4 of the International Banking Act of 1978 that is insured and regulated by the Federal Deposit Insurance Corporation (FDIC)"
  {:cmns-av/adaptedFrom
   ["https://www.govinfo.gov/content/pkg/COMPS-275/pdf/COMPS-275.pdf"
    "https://www.ffiec.gov/npw/Help/InstitutionTypes"],
   :db/ident
   :fibo-fbc-fct-usfse/InsuredFederalBranchOfForeignBankingOrganization,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "insured federal branch of foreign banking organization",
   :rdfs/subClassOf
   :fibo-fbc-fct-usfse/FederalBranchOfForeignBankingOrganization,
   :skos/definition
   "any office or any place of business of a foreign bank located in any State of the United States at which deposits are received established and operating under section 4 of the International Banking Act of 1978 that is insured and regulated by the Federal Deposit Insurance Corporation (FDIC)"})

(def InsuredStateBranchOfForeignBankingOrganization
  "any office or any place of business of a foreign bank located in any State of the United States at which deposits are received, established and operating under the laws of that State that is insured and regulated by the Federal Deposit Insurance Corporation (FDIC)"
  {:cmns-av/adaptedFrom
   ["https://www.govinfo.gov/content/pkg/COMPS-275/pdf/COMPS-275.pdf"
    "https://www.ffiec.gov/npw/Help/InstitutionTypes"],
   :db/ident :fibo-fbc-fct-usfse/InsuredStateBranchOfForeignBankingOrganization,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "insured state branch of foreign banking organization",
   :rdfs/subClassOf :fibo-fbc-fct-usfse/StateBranchOfForeignBankingOrganization,
   :skos/definition
   "any office or any place of business of a foreign bank located in any State of the United States at which deposits are received, established and operating under the laws of that State that is insured and regulated by the Federal Deposit Insurance Corporation (FDIC)"})

(def IntermediateHoldingCompany
  "bank holding company established or designated by a foreign banking organization under subpart O of the Federal Reserve Board's Regulation YY (12 CFR part 252)"
  {:db/ident :fibo-fbc-fct-usfse/IntermediateHoldingCompany,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "intermediate holding company",
   :rdfs/subClassOf :fibo-fbc-fct-fse/BankHoldingCompany,
   :skos/definition
   "bank holding company established or designated by a foreign banking organization under subpart O of the Federal Reserve Board's Regulation YY (12 CFR part 252)"})

(def InternationalBankOfUSDepositoryEdgeTrustCompany
  "bank that is owned or controlled by a US depository institution, Edge Act corporation or trust company"
  {:db/ident
   :fibo-fbc-fct-usfse/InternationalBankOfUSDepositoryEdgeTrustCompany,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "international bank of US depositary, edge, trust company",
   :rdfs/subClassOf [{:owl/onProperty :cmns-col/isPartOf,
                      :owl/someValuesFrom
                      {:owl/intersectionOf
                       [{:owl/unionOf [:fibo-fbc-fct-fse/DepositoryInstitution
                                       :fibo-fbc-fct-usfse/EdgeCorporation
                                       :fibo-fbc-fct-fse/TrustCompany],
                         :rdf/type    :owl/Class}
                        {:owl/hasValue   :lcc-3166-1/UnitedStatesOfAmerica,
                         :owl/onProperty :fibo-fnd-org-fm/isDomiciledIn,
                         :rdf/type       :owl/Restriction}
                        {:owl/hasValue :fibo-be-ge-usj/UnitedStatesJurisdiction,
                         :owl/onProperty :fibo-be-le-cb/isIncorporatedIn,
                         :rdf/type :owl/Restriction}],
                       :rdf/type :owl/Class},
                      :rdf/type :owl/Restriction}
                     :fibo-fbc-fct-fse/Bank],
   :skos/definition
   "bank that is owned or controlled by a US depository institution, Edge Act corporation or trust company"})

(def MutualSavingsBank
  "financial institution that accepts deposits primarily from individuals and places a large portion of its funds into mortgage loans"
  {:cmns-av/adaptedFrom "https://www.ffiec.gov/npw/Help/InstitutionTypes",
   :db/ident :fibo-fbc-fct-usfse/MutualSavingsBank,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "mutual savings bank",
   :rdfs/subClassOf :fibo-fbc-fct-usfse/SavingsBank,
   :skos/definition
   "financial institution that accepts deposits primarily from individuals and places a large portion of its funds into mortgage loans"})

(def NationalBank
  "commercial bank whose charter is approved by the Office of the Comptroller of the Currency (OCC) rather than by a state banking agency"
  {:cmns-av/adaptedFrom
   "https://www.ffiec.gov/npw/Help/InstitutionTypes#non-mem-banks",
   :cmns-av/explanatoryNote
   "National Banks are required to be members of the Federal Reserve System and belong to the Federal Deposit Insurance Corporation.",
   :db/ident :fibo-fbc-fct-usfse/NationalBank,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "national bank",
   :rdfs/subClassOf [:fibo-fbc-fct-usfse/USBank
                     :fibo-fbc-fct-fse/CommercialBank],
   :skos/definition
   "commercial bank whose charter is approved by the Office of the Comptroller of the Currency (OCC) rather than by a state banking agency"})

(def NonDepositoryTrustCompany
  "trust company that accepts and executes trusts, but does not issue currency; non-depository trust companies can either be Federal Reserve Members or Federal Reserve Non-members"
  {:cmns-av/adaptedFrom "https://www.ffiec.gov/npw/Help/InstitutionTypes",
   :db/ident :fibo-fbc-fct-usfse/NonDepositoryTrustCompany,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "non-depository trust company",
   :rdfs/subClassOf [:fibo-fbc-fct-fse/TrustCompany
                     :fibo-fbc-fct-fse/NonDepositoryInstitution],
   :skos/definition
   "trust company that accepts and executes trusts, but does not issue currency; non-depository trust companies can either be Federal Reserve Members or Federal Reserve Non-members"})

(def SavingsBank
  "banking institution organized to accept savings deposits and pay interest on those savings deposits"
  {:cmns-av/adaptedFrom "https://www.ffiec.gov/npw/Help/InstitutionTypes",
   :cmns-av/explanatoryNote
   "Savings banks can have state and federal affiliations, for example, State Savings Banks and Federal Savings Banks",
   :db/ident :fibo-fbc-fct-usfse/SavingsBank,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "savings bank",
   :rdfs/subClassOf :fibo-fbc-fct-usfse/ThriftInstitution,
   :skos/definition
   "banking institution organized to accept savings deposits and pay interest on those savings deposits"})

(def SavingsLoanAssociation
  "financial institution that accepts deposits primarily from individuals and channels its funds primarily into residential mortgage loans"
  {:cmns-av/adaptedFrom "https://www.ffiec.gov/npw/Help/InstitutionTypes",
   :cmns-av/synonym "savings and loan association",
   :db/ident :fibo-fbc-fct-usfse/SavingsLoanAssociation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "savings loan association",
   :rdfs/subClassOf :fibo-fbc-fct-usfse/ThriftInstitution,
   :skos/definition
   "financial institution that accepts deposits primarily from individuals and channels its funds primarily into residential mortgage loans"})

(def SavingsLoanHoldingCompany
  "company that directly or indirectly controls a savings association or related holding company, and explicitly excludes any company that is also a bank holding company"
  {:cmns-av/adaptedFrom "https://www.ffiec.gov/npw/Help/InstitutionTypes",
   :cmns-av/synonym "savings and loan holding company",
   :db/ident :fibo-fbc-fct-usfse/SavingsLoanHoldingCompany,
   :owl/disjointWith :fibo-fbc-fct-fse/BankHoldingCompany,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "savings loan holding company",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fbc-fct-fse/hasPortfolioCompany,
                      :owl/someValuesFrom
                      {:owl/unionOf
                       [:fibo-fbc-fct-usfse/SavingsLoanAssociation
                        :fibo-fbc-fct-usfse/SavingsLoanHoldingCompany],
                       :rdf/type :owl/Class},
                      :rdf/type :owl/Restriction}
                     :fibo-fbc-pas-fpas/FinancialServiceProvider
                     :fibo-fbc-fct-fse/HoldingCompany],
   :skos/definition
   "company that directly or indirectly controls a savings association or related holding company, and explicitly excludes any company that is also a bank holding company"})

(def StateBranchOfForeignBankingOrganization
  "any office or any place of business of a foreign bank located in any State of the United States at which deposits are received, established and operating under the laws of that State"
  {:cmns-av/adaptedFrom
   ["https://www.govinfo.gov/content/pkg/COMPS-275/pdf/COMPS-275.pdf"
    "https://www.ffiec.gov/npw/Help/InstitutionTypes"],
   :db/ident :fibo-fbc-fct-usfse/StateBranchOfForeignBankingOrganization,
   :owl/disjointWith
   :fibo-fbc-fct-usfse/FederalBranchOfForeignBankingOrganization,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "state branch of foreign banking organization",
   :rdfs/subClassOf [{:owl/onProperty :cmns-col/isPartOf,
                      :owl/someValuesFrom
                      :fibo-fbc-fct-usfse/ForeignBankingOrganization,
                      :rdf/type :owl/Restriction}
                     :fibo-be-le-fbo/Branch],
   :skos/definition
   "any office or any place of business of a foreign bank located in any State of the United States at which deposits are received, established and operating under the laws of that State"})

(def StateCharteredBank
  "commercial bank whose charter is approved by a state banking regulator"
  {:cmns-av/adaptedFrom "https://www.ffiec.gov/npw/Help/InstitutionTypes",
   :cmns-av/explanatoryNote
   ["State-chartered banks may or may not be members of the Federal Reserve System, but typically belong to the Federal Deposit Insurance Corporation, who may be their primary federal regulator for those that are not FRS members."
    "A state bank is defined as any bank, banking association, trust company, savings bank, industrial bank (or similar depository institution operating substantially in the same manner as an industrial bank), or other banking institution which is engaged in the business of receiving deposits other than trust funds, and in the US, is incorporated under the laws of any State or which is operating under the Code of Law for the District of Columbia, including any cooperative bank or other unincorporated bank the deposits of which were insured by the Federal Deposit Insurance Corporation on the day before the date of the enactment of the Financial Institutions Reform, Recovery, and Enforcement Act of 1989."],
   :db/ident :fibo-fbc-fct-usfse/StateCharteredBank,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "state-chartered bank",
   :rdfs/subClassOf [:fibo-fbc-fct-usfse/USBank
                     :fibo-fbc-fct-fse/CommercialBank],
   :skos/definition
   "commercial bank whose charter is approved by a state banking regulator"})

(def StateCreditUnion
  "credit union that has a state affiliation"
  {:db/ident :fibo-fbc-fct-usfse/StateCreditUnion,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "state credit union",
   :rdfs/subClassOf :fibo-fbc-fct-usfse/USCreditUnion,
   :skos/definition "credit union that has a state affiliation"})

(def StateSavingsBank
  "savings bank that has a state affiliation"
  {:cmns-av/adaptedFrom "https://www.ffiec.gov/npw/Help/InstitutionTypes",
   :db/ident :fibo-fbc-fct-usfse/StateSavingsBank,
   :owl/disjointWith :fibo-fbc-fct-usfse/FederalSavingsBank,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "state savings bank",
   :rdfs/subClassOf :fibo-fbc-fct-usfse/SavingsBank,
   :skos/definition "savings bank that has a state affiliation"})

(def ThriftInstitution
  "savings association that primarily accepts savings account deposits and invests most of the proceeds in mortgages"
  {:cmns-av/adaptedFrom "https://www.ffiec.gov/npw/Help/InstitutionTypes",
   :db/ident :fibo-fbc-fct-usfse/ThriftInstitution,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "thrift institution",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-pty-rl/isPlayedBy,
                      :owl/someValuesFrom
                      {:owl/intersectionOf
                       [{:owl/hasValue   :lcc-3166-1/UnitedStatesOfAmerica,
                         :owl/onProperty :fibo-fnd-org-fm/isDomiciledIn,
                         :rdf/type       :owl/Restriction}
                        {:owl/hasValue :fibo-be-ge-usj/UnitedStatesJurisdiction,
                         :owl/onProperty :fibo-be-le-cb/isIncorporatedIn,
                         :rdf/type :owl/Restriction}],
                       :rdf/type :owl/Class},
                      :rdf/type :owl/Restriction}
                     :fibo-fbc-fct-fse/SavingsAssociation],
   :skos/definition
   "savings association that primarily accepts savings account deposits and invests most of the proceeds in mortgages",
   :skos/example
   "Savings banks and savings and loan associations and credit unions are examples of thrift institutions."})

(def USBank
  "bank that is licensed to conduct business in the United States"
  {:cmns-av/adaptedFrom
   "As defined in the Federal Deposit Insurance Act, https://www.fdic.gov/regulations/laws/rules/1000-400.html#fdic1000sec.3a",
   :cmns-av/explanatoryNote
   ["A bank, as specified in the Investment Company Act of 1940, is a financial intermediary that is (a) a depository institution (as defined in section 3 of the Federal Deposit Insurance Act) or a branch or agency of a foreign bank (as such terms are defined in section 1(b) of the International Banking Act of 1978), (b) a member bank of the Federal Reserve System, (c) any other banking institution or trust company, whether incorporated or not, doing business under the laws of any State or of the United States, a substantial portion of the business of which consists of receiving deposits or exercising fiduciary powers similar to those permitted to national banks under the authority of the Comptroller of the Currency, and which is supervised and examined by State or Federal authority having supervision over banks, and which is not operated for the purpose of evading the provisions of this title, and (d) a receiver, conservator, or other liquidating agent of any institution or firm included in clause (a), (b), or (c) of this paragraph."
    "The Bank Holding Company Act of 1956 defines a bank as any depository financial intermediary that accepts checking accounts (checks) or makes commercial loans, and its deposits are insured by a federal deposit insurance agency. A bank acts as a middleman between suppliers of funds and users of funds, substituting its own credit judgement for that of the ultimate suppliers of funds, collecting those funds from three sources: checking accounts, savings and time deposits; short-term borrowings from other banks; and equity capital. A bank earns money by reinvesting these funds in longer-term assets."],
   :db/ident :fibo-fbc-fct-usfse/USBank,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "U.S. bank",
   :rdfs/seeAlso ["https://www.sec.gov/about/laws/ica40.pdf"],
   :rdfs/subClassOf [:fibo-fbc-fct-fse/Bank
                     {:owl/onProperty :fibo-fnd-pty-rl/isPlayedBy,
                      :owl/someValuesFrom
                      {:owl/intersectionOf
                       [{:owl/hasValue   :lcc-3166-1/UnitedStatesOfAmerica,
                         :owl/onProperty :fibo-fnd-org-fm/isDomiciledIn,
                         :rdf/type       :owl/Restriction}
                        {:owl/hasValue :fibo-be-ge-usj/UnitedStatesJurisdiction,
                         :owl/onProperty :fibo-be-le-cb/isIncorporatedIn,
                         :rdf/type :owl/Restriction}],
                       :rdf/type :owl/Class},
                      :rdf/type :owl/Restriction}],
   :skos/definition
   "bank that is licensed to conduct business in the United States"})

(def USBankHoldingCompany
  "bank holding company that is licensed to conduct business in the United States and is regulated and supervised by the Federal Reserve in accordance with the Bank Holding Company Act of 1956"
  {:cmns-av/adaptedFrom "https://www.ffiec.gov/npw/Help/InstitutionTypes",
   :cmns-av/explanatoryNote
   "According to the FFIEC, a bank holding company is a company that owns and/or controls one or more U.S. banks or one that owns, or has controlling interest in, one or more banks. A bank holding company may also own another bank holding company, which in turn owns or controls a bank; the company at the top of the ownership chain is called the top holder. The Board of Governors is responsible for regulating and supervising bank holding companies, even if the bank owned by the holding company is under the primary supervision of a different federal agency (OCC or FDIC).",
   :db/ident :fibo-fbc-fct-usfse/USBankHoldingCompany,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "U.S. bank holding company",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-pty-rl/isPlayedBy,
                      :owl/someValuesFrom
                      {:owl/intersectionOf
                       [{:owl/hasValue   :lcc-3166-1/UnitedStatesOfAmerica,
                         :owl/onProperty :fibo-fnd-org-fm/isDomiciledIn,
                         :rdf/type       :owl/Restriction}
                        {:owl/hasValue :fibo-be-ge-usj/UnitedStatesJurisdiction,
                         :owl/onProperty :fibo-be-le-cb/isIncorporatedIn,
                         :rdf/type :owl/Restriction}],
                       :rdf/type :owl/Class},
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-fbc-fct-fse/hasPortfolioCompany,
                      :owl/someValuesFrom :fibo-fbc-fct-usfse/USBank,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-fct-fse/BankHoldingCompany],
   :skos/definition
   "bank holding company that is licensed to conduct business in the United States and is regulated and supervised by the Federal Reserve in accordance with the Bank Holding Company Act of 1956"})

(def USCreditUnion
  "cooperative association organized for the purpose of promoting thrift among its members and creating a source of credit for provident or productive purposes"
  {:cmns-av/explanatoryNote
   "As soon as you deposit funds into a credit union account, you become a partial owner and participate in the union's profitability. Credit unions may be formed by large corporations and organizations for their employees and members.",
   :db/ident :fibo-fbc-fct-usfse/USCreditUnion,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "U.S. credit union",
   :rdfs/subClassOf [{:owl/onClass    :fibo-be-le-cb/NotForProfitCorporation,
                      :owl/onProperty :fibo-fnd-rel-rel/hasIdentity,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-fct-usfse/ThriftInstitution
                     :fibo-fbc-fct-fse/CreditUnion],
   :skos/definition
   "cooperative association organized for the purpose of promoting thrift among its members and creating a source of credit for provident or productive purposes"})

(def UninsuredFederalBranchOfForeignBankingOrganization
  "any office or any place of business of a foreign bank located in any State of the United States at which deposits are received established and operating under section 4 of the International Banking Act of 1978 that is not insured or regulated by the Federal Deposit Insurance Corporation (FDIC)"
  {:cmns-av/adaptedFrom
   ["https://www.govinfo.gov/content/pkg/COMPS-275/pdf/COMPS-275.pdf"
    "https://www.ffiec.gov/npw/Help/InstitutionTypes"],
   :cmns-av/explanatoryNote
   "An uninsured branch does not accept retail deposits and need not apply for federal deposit insurance.",
   :db/ident
   :fibo-fbc-fct-usfse/UninsuredFederalBranchOfForeignBankingOrganization,
   :owl/disjointWith
   :fibo-fbc-fct-usfse/InsuredFederalBranchOfForeignBankingOrganization,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "uninsured federal branch of foreign banking organization",
   :rdfs/subClassOf
   :fibo-fbc-fct-usfse/FederalBranchOfForeignBankingOrganization,
   :skos/definition
   "any office or any place of business of a foreign bank located in any State of the United States at which deposits are received established and operating under section 4 of the International Banking Act of 1978 that is not insured or regulated by the Federal Deposit Insurance Corporation (FDIC)"})

(def UninsuredStateBranchOfForeignBankingOrganization
  "any office or any place of business of a foreign bank located in any State of the United States at which deposits are received, established and operating under the laws of that State that is not insured or regulated by the Federal Deposit Insurance Corporation (FDIC)"
  {:cmns-av/adaptedFrom
   ["https://www.govinfo.gov/content/pkg/COMPS-275/pdf/COMPS-275.pdf"
    "https://www.ffiec.gov/npw/Help/InstitutionTypes"],
   :cmns-av/explanatoryNote
   "An uninsured branch does not accept retail deposits and need not apply for federal deposit insurance.",
   :db/ident
   :fibo-fbc-fct-usfse/UninsuredStateBranchOfForeignBankingOrganization,
   :owl/disjointWith
   :fibo-fbc-fct-usfse/InsuredStateBranchOfForeignBankingOrganization,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "uninsured state branch of foreign banking organization",
   :rdfs/subClassOf :fibo-fbc-fct-usfse/StateBranchOfForeignBankingOrganization,
   :skos/definition
   "any office or any place of business of a foreign bank located in any State of the United States at which deposits are received, established and operating under the laws of that State that is not insured or regulated by the Federal Deposit Insurance Corporation (FDIC)"})

(def isSubjectToReserveRequirements
  "indicates whether some capability of a financial service provider is contingent on conformance with certain Federal Reserve policies, regulations, or other requirements"
  {:db/ident :fibo-fbc-fct-usfse/isSubjectToReserveRequirements,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-fbc-pas-fpas/FinancialServiceProvider,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "is subject to reserve requirements",
   :rdfs/range :xsd/boolean,
   :skos/definition
   "indicates whether some capability of a financial service provider is contingent on conformance with certain Federal Reserve policies, regulations, or other requirements"})