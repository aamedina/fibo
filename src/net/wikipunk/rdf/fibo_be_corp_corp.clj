(ns net.wikipunk.rdf.fibo-be-corp-corp
  "This ontology defines the fundamental concepts for companies incorporated by the issuance of shares. Terms defined in this ontology are those which are applicable to all such entities. Many of these concepts form the basis of the relationships of ownership and control which obtain between entities of this type."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/BE/Corporations/Corporations/",
   :dcterms/abstract
   "This ontology defines the fundamental concepts for companies incorporated by the issuance of shares. Terms defined in this ontology are those which are applicable to all such entities. Many of these concepts form the basis of the relationships of ownership and control which obtain between entities of this type.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/FormalBusinessOrganizations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/Jurisdiction/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Organizations/Organizations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LegalPersons/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Organizations/FormalOrganizations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/CorporateBodies/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/GoalsAndObjectives/Objectives/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/Corporations/Corporations/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-be-corp-corp"
    "https://spec.edmcouncil.org/fibo/ontology/BE/Corporations/Corporations/",
    "fibo-be-le-cb"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/CorporateBodies/",
    "fibo-be-le-fbo"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/FormalBusinessOrganizations/",
    "fibo-be-le-lp"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/",
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
    "fibo-fnd-dt-fd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
    "fibo-fnd-gao-obj"
    "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/Objectives/",
    "fibo-fnd-law-jur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/Jurisdiction/",
    "fibo-fnd-org-fm"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations/",
    "fibo-fnd-org-org"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "lcc-lr" "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/Corporations/Corporations/",
   :rdfa/prefix "fibo-be-corp-corp",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/Corporations/Corporations/",
   :rdfs/label "Corporations Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/BE/Corporations/Corporations.rdf version of this ontology was modified per the issue resolutions identified in the FIBO BE 1.0 FTF report."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/Corporations/Corporations.rdf version of this ontology was modified to replace hasDefinition with isDefinedIn to clarify intent."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/Corporations/Corporations.rdf version of this ontology was modified per the FIBO 2.0 RFC to generalize certain unions where they were no longer required."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/Corporations/Corporations.rdf version of this ontology was modified to reflect moving hasObjective to FND."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/Corporations/Corporations.rdf version of this ontology was modified to reflect the move of some organization-specific concepts from BE to FND and to clean up typos."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/Corporations/Corporations.rdf version of this ontology was modified to eliminate deprecated elements."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/Corporations/Corporations.rdf version of this ontology was modified to eliminate references to external dictionary sites that no longer resolve, eliminate circular and ambiguous definitions and make incorporation date and registration date explicit dates."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/Corporations/Corporations.rdf version of this ontology was modified to address text formatting hygiene issues and eliminate a dead link."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/Corporations/Corporations.rdf version of this ontology was modified per the FIBO 2.0 RFC."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/Corporations/Corporations.rdf version of this ontology was modified to eliminate duplication of concepts in LCC."],
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright ["Copyright (c) 2013-2022 Object Management Group, Inc."
                  "Copyright (c) 2013-2022 EDM Council, Inc."],
   :sm/dependsOn
   ["https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/"
    "https://www.omg.org/spec/LCC/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/FormalBusinessOrganizations/"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/CorporateBodies/"],
   :sm/fileAbbreviation "fibo-be-corp-corp",
   :sm/filename "Corporations.rdf"})

(def BoardAgreement
  "a formal, legally binding agreement between members of the Board of Directors of the organization"
  {:db/ident :fibo-be-corp-corp/BoardAgreement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/Corporations/Corporations/",
   :rdfs/label "board agreement",
   :rdfs/subClassOf :fibo-be-le-fbo/OrganizationCoveringAgreement,
   :skos/definition
   "a formal, legally binding agreement between members of the Board of Directors of the organization"})

(def JointStockCompany
  "for-profit, unincorporated business that has some characteristics of a corporation and some features of a partnership, with ownership interests represented by shares of stock"
  {:db/ident :fibo-be-corp-corp/JointStockCompany,
   :fibo-fnd-utl-av/explanatoryNote
   "1. In the UK, the original (17th century) name for a corporation in which the liability of the owners is limited to the nominal value of the stock (shares) held by them.\n2. In the US, a joint stock company is similar to a corporation, but with unlimited liability for the shareholders. Investors in a US joint stock company receive stock (shares) which can be transferred, and can elect a board of directors, but are jointly-and-severally liable for the company's debts and obligations. A US joint stock company cannot hold title to a real property.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/Corporations/Corporations/",
   :rdfs/label "joint stock company",
   :rdfs/subClassOf :fibo-be-le-lp/BusinessEntity,
   :skos/definition
   "for-profit, unincorporated business that has some characteristics of a corporation and some features of a partnership, with ownership interests represented by shares of stock",
   :skos/editorialNote
   "There are two kinds of joint stock company. The private company kind and the open market. The shares are usually only held by the directors and Company Secretary."})

(def PrivatelyHeldCompany
  "corporation whose issued shares are all held by a family or a small group of investors and, therefore, cannot be bought by the public"
  {:db/ident :fibo-be-corp-corp/PrivatelyHeldCompany,
   :fibo-fnd-utl-av/explanatoryNote
   "For British or Commonwealth companies, a privately held company limited by shares is a type of company incorporated under the laws of England and Wales, Scotland, certain Commonwealth countries and the Republic of Ireland. It has shareholders with limited liability and its shares may not be offered to the general public, unlike those of public limited companies. Limited by shares means that the company has shareholders, and that the liability of the shareholders to creditors of the company is limited to the capital originally invested, i.e. the nominal value of the shares and any premium paid in return for the issue of the shares by the company. A shareholders personal assets are thereby protected in the event of the company's insolvency, but money invested in the company will be lost. A limited company may be private or public. A private limited companys disclosure requirements are lighter, but for this reason its shares may not be offered to the general public (and therefore cannot be traded on a public stock exchange). This is the major distinguishing feature between a private limited company and a public limited company. Most companies, particularly small companies, are private. Private companies limited by shares are required to have the suffix Limited (often written Ltd or Ltd.) or Incorporated (Inc.) as part of their name, though the latter cannot be used in the UK or the Republic of Ireland. In the Republic of Ireland, Teoranta (Teo.) may be used instead, largely by Gaeltacht companies. Cyfyngedig (Cyf.) may be used by Welsh companies in a similar fashion.",
   :fibo-fnd-utl-av/synonym ["privately held corporation" "closed corporation"],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/Corporations/Corporations/",
   :rdfs/label "privately held company",
   :rdfs/subClassOf :fibo-be-le-cb/StockCorporation,
   :skos/definition
   "corporation whose issued shares are all held by a family or a small group of investors and, therefore, cannot be bought by the public"})

(def PubliclyHeldCompany
  "a company whose shares are traded and held publicly"
  {:db/ident :fibo-be-corp-corp/PubliclyHeldCompany,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/Corporations/Corporations/",
   :rdfs/label "publicly held company",
   :rdfs/subClassOf :fibo-be-le-cb/StockCorporation,
   :skos/definition "a company whose shares are traded and held publicly"})

(def RegistrationIdentifier
  "an identifier that is officially allocated to an organization at the time of registration, typically in a jurisdiction in which said organization is organized or registered and used in that jurisdiction to identify the organization"
  {:db/ident :fibo-be-corp-corp/RegistrationIdentifier,
   :fibo-fnd-utl-av/explanatoryNote
   "A registration identifier may be required for official communications and is publicly available. The relationship to the jurisdiction in which the organization is organized or registered is typically required, but is optional here to cover cases where jurisdictions may overlap or are not as clearly defined.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/Corporations/Corporations/",
   :rdfs/label "registration identifier",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-rel-rel/isDefinedIn,
                      :owl/someValuesFrom
                      :fibo-be-corp-corp/RegistrationIdentifierScheme,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-org-org/OrganizationIdentifier
                     {:owl/onClass    :fibo-fnd-org-fm/FormalOrganization,
                      :owl/onProperty :lcc-lr/identifies,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-law-jur/Jurisdiction,
                      :owl/onProperty :fibo-fnd-rel-rel/isGovernedBy,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "an identifier that is officially allocated to an organization at the time of registration, typically in a jurisdiction in which said organization is organized or registered and used in that jurisdiction to identify the organization",
   :skos/scopeNote
   "In some jurisdictions, such as the State of California, registration identifiers are issued to corporations, including non-profit corporations, limited liability companies, certain partnerships, and foreign corporations doing business in California. The same or a very similar process is used for registration of corporations across the US."})

(def RegistrationIdentifierScheme
  "the scheme that defines the registration identifier per the issuing registration authority"
  {:db/ident :fibo-be-corp-corp/RegistrationIdentifierScheme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/Corporations/Corporations/",
   :rdfs/label "registration identifier scheme",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-rel-rel/defines,
                      :owl/someValuesFrom
                      :fibo-be-corp-corp/RegistrationIdentifier,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-org-org/OrganizationIdentificationScheme],
   :skos/definition
   "the scheme that defines the registration identifier per the issuing registration authority"})

(def ReligiousCorporation
  "not-for-profit corporation whose objective is specific to some fundamental set of beliefs and practices generally agreed upon by a number of people, and that is incorporated under the law"
  {:db/ident :fibo-be-corp-corp/ReligiousCorporation,
   :fibo-fnd-utl-av/explanatoryNote
   "Often religious corporations are recognized under the law on a sub-national level, for instance by a state or provincial government. The government agency responsible for regulating such corporations is usually the official holder of records, for instance a state department of corporations.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/Corporations/Corporations/",
   :rdfs/label "religious corporation",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-gao-obj/hasObjective,
                      :owl/someValuesFrom :fibo-be-le-lp/ReligiousObjective,
                      :rdf/type           :owl/Restriction}
                     :fibo-be-le-cb/NotForProfitCorporation],
   :skos/definition
   "not-for-profit corporation whose objective is specific to some fundamental set of beliefs and practices generally agreed upon by a number of people, and that is incorporated under the law"})

(def hasDateOfIncorporation
  "indicates the formal date of incorporation as stated in filing documents"
  {:db/ident :fibo-be-corp-corp/hasDateOfIncorporation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/Corporations/Corporations/",
   :rdfs/label "has date of incorporation",
   :rdfs/range :fibo-fnd-dt-fd/ExplicitDate,
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasExplicitDate,
   :skos/definition
   "indicates the formal date of incorporation as stated in filing documents"})

(def hasDateOfRegistration
  "indicates the date on which the corporation has registered in some jurisdiction for regulatory and / or for tax purposes"
  {:db/ident :fibo-be-corp-corp/hasDateOfRegistration,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/Corporations/Corporations/",
   :rdfs/label "has date of registration",
   :rdfs/range :fibo-fnd-dt-fd/ExplicitDate,
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasExplicitDate,
   :skos/definition
   "indicates the date on which the corporation has registered in some jurisdiction for regulatory and / or for tax purposes"})

(def hasIssuedCapital
  "indicates the aggregate value of all shares held by shareholders"
  {:db/ident :fibo-be-corp-corp/hasIssuedCapital,
   :fibo-fnd-utl-av/explanatoryNote
   "A corporation can, at any time, issue new shares up to the full amount of authorized share capital.",
   :fibo-fnd-utl-av/synonym ["has subscribed share capital"
                             "has subscribed capital"],
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/Corporations/Corporations/",
   :rdfs/label "has issued capital",
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasMonetaryAmount,
   :skos/definition
   "indicates the aggregate value of all shares held by shareholders"})

(def hasSharesAuthorized
  "indicates the maximum number of shares that are permitted to be issued, as established by the board of directors"
  {:db/ident :fibo-be-corp-corp/hasSharesAuthorized,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "An initial number of authorized shares is typically established at the time of incorporation, and is documented in articles of incorporation. The number of shares authorized may be extended from time to time by the board of directors as needed, and articles of incorporation and other legal documentation will be amended accordingly. It includes shares that are available, but not yet issued, for sale to generate capital, and shares available for distribution to insiders as part of their compensation packages."},
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/Corporations/Corporations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has shares authorized"},
   :rdfs/range :xsd/nonNegativeInteger,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasAmount,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates the maximum number of shares that are permitted to be issued, as established by the board of directors"}})