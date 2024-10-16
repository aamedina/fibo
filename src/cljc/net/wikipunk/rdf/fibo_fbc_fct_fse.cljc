(ns net.wikipunk.rdf.fibo-fbc-fct-fse
  {:cmns-av/copyright #{"Copyright (c) 2015-2024 Object Management Group, Inc."
                        "Copyright (c) 2015-2024 EDM Council, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/FinancialServicesEntities/",
   :dcterms/abstract
   "This ontology defines basic financial service providers, such as holding companies, financial institutions (both depository and non-depository institutions), and clearing houses at a relatively general level. Nuances specific to the institutions located in a specific country are defined in jurisdiction specific dependent ontologies.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cds" "https://www.omg.org/spec/Commons/CodesAndCodeSets/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-cxtid" "https://www.omg.org/spec/Commons/ContextualIdentifiers/",
    "cmns-dsg" "https://www.omg.org/spec/Commons/Designators/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
    "cmns-pts" "https://www.omg.org/spec/Commons/PartiesAndSituations/",
    "cmns-rlcmp" "https://www.omg.org/spec/Commons/RolesAndCompositions/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-fct-fct"
    "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/FunctionalEntities/",
    "fibo-be-ge-ge"
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/",
    "fibo-be-le-cb"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/CorporateBodies/",
    "fibo-be-le-fbo"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/FormalBusinessOrganizations/",
    "fibo-be-le-lp"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/",
    "fibo-be-oac-cpty"
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/ControlParties/",
    "fibo-be-oac-opty"
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties/",
    "fibo-be-plc-plc"
    "https://spec.edmcouncil.org/fibo/ontology/BE/PrivateLimitedCompanies/PrivateLimitedCompanies/",
    "fibo-be-ptr-ptr"
    "https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships/",
    "fibo-fbc-fct-fse"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/",
    "fibo-fbc-fct-ra"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegistrationAuthorities/",
    "fibo-fbc-fct-rga"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegulatoryAgencies/",
    "fibo-fbc-pas-fpas"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
    "fibo-fnd-agr-ctr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
    "fibo-fnd-arr-doc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/",
    "fibo-fnd-law-jur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/Jurisdiction/",
    "fibo-fnd-oac-ctl"
    "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Control/",
    "fibo-fnd-org-fm"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations/",
    "fibo-fnd-org-org"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations/",
    "fibo-fnd-pas-psch"
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules/",
    "fibo-fnd-pty-pty"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/RegistrationAuthorities/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/RegulatoryAgencies/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/Partnerships/Partnerships/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/OwnershipAndControl/OwnershipParties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/ProductsAndServices/FinancialProductsAndServices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/OwnershipAndControl/Control/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/OwnershipAndControl/ControlParties/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/CodesAndCodeSets/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Organizations/Organizations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/PrivateLimitedCompanies/PrivateLimitedCompanies/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualIdentifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/ProductsAndServices/PaymentsAndSchedules/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Parties/Parties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/GovernmentEntities/GovernmentEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/LegalEntities/FormalBusinessOrganizations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/FunctionalEntities/FunctionalEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/LegalEntities/CorporateBodies/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Law/Jurisdiction/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Organizations/FormalOrganizations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Arrangements/Documents/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fbc-fct-fse",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/",
   :rdfs/label "Financial Services Entities Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities.rdf version of this ontology was revised to add missing functional entities and related properties, and eliminate circular or ambiguous definitions where possible."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities.rdf version of this ontology was revised to eliminate references to external dictionary sites that no longer resolve and address additional circular definitions."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities.rdf version of this ontology was modified per the issue resolutions identified in the FIBO FBC 1.0 FTF report."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/ version of this ontology was modified to generalize certain unions where they were no longer required and incorporate a new financial service provider identifier that is assigned functionally rather than to a legal entity."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities.rdf version of this ontology was revised to move the definition of the Bank for International Settlements (BIS) to the EU Regulatory Agencies ontology and build out the individual details there, and to reflect the move of some organization-specific concepts from BE to FND."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities.rdf version of this ontology was revised to apply the new composite identifier definition to BIC codes."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities.rdf version of this ontology was revised to leverage the new party identifier and replace hasDefinition with isDefinedIn to clarify intent."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities.rdf version of this ontology was revised to clean up dead links and address text formatting issues uncovered by hygiene testing."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities.rdf version of this ontology was revised to eliminate duplication with concepts in LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/ version of this ontology was modified to refine the concept of a credit union and generalize the definition of an underwriter."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities.rdf version of this ontology was revised to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities.rdf version of this ontology was revised to augment the representation of institutions based on their definitions in the law, to clarify and extend definitions related to non-bank financial institutions,and to add multilingual labels."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities.rdf version of this ontology was revised to enable merging business and functional business entity in BE."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/ version of this ontology was modified per the FIBO 2.0 RFC, including, but not limited to, the addition of trade settlement concepts and generalizing the concept of a credit union."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities.rdf version of this ontology was revised to clean up a few definitions to conform with ISO 704, to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary, and to add the concept of a data processing servicer."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"})

(def Bank
  {:cmns-av/adaptedFrom
   {:rdf/value "Barron's Dictionary of Banking Terms, Sixth Edition, 2012"},
   :db/ident :fibo-fbc-fct-fse/Bank,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "bank",
   :rdfs/seeAlso {:xsd/anyURI "https://www.sec.gov/about/laws/ica40.pdf"},
   :rdfs/subClassOf :fibo-fbc-fct-fse/DepositoryInstitution,
   :skos/definition
   "depository institution, usually a corporation, that accepts deposits, makes loans, pays checks, and performs related services, for individual members of the public, businesses or other organizations"})

(def BankHoldingCompany
  {:cmns-av/adaptedFrom
   {:rdf/value
    "Office of Financial Research (OFR) Annual Report, 2012, Glossary"},
   :cmns-av/explanatoryNote
   "A bank holding company may also own another bank holding company, which in turn owns or controls a bank; the company at the top of the ownership chain is called the top holder.",
   :db/ident :fibo-fbc-fct-fse/BankHoldingCompany,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "bank holding company",
   :rdfs/subClassOf #{{:owl/onClass    :fibo-be-le-cb/Corporation,
                       :owl/onProperty :cmns-rlcmp/isPlayedBy,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      :fibo-fbc-pas-fpas/FinancialServiceProvider
                      :fibo-fbc-fct-fse/HoldingCompany},
   :skos/definition
   "any company that owns and/or has direct or indirect control of one or more banks; BHCs may also own nonbanking subsidiaries such as broker-dealers and asset managers"})

(def BankingProduct
  {:db/ident :fibo-fbc-fct-fse/BankingProduct,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "banking product",
   :rdfs/subClassOf #{:fibo-fbc-pas-fpas/FinancialProduct
                      {:owl/onProperty :fibo-fnd-rel-rel/isProvidedBy,
                       :owl/someValuesFrom
                       :fibo-fbc-fct-fse/DepositoryInstitution,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "product provided to consumers and businesses by a depository institution",
   :skos/example
   "Examples include checking account, savings account, certificate of deposit, debit or pre-paid card, or credit card."})

(def BankingService
  {:db/ident :fibo-fbc-fct-fse/BankingService,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "banking service",
   :rdfs/subClassOf #{:fibo-fbc-pas-fpas/FinancialService
                      {:owl/onProperty :fibo-fnd-rel-rel/isProvidedBy,
                       :owl/someValuesFrom
                       :fibo-fbc-fct-fse/DepositoryInstitution,
                       :rdf/type :owl/Restriction}},
   :skos/definition "financial service offered by a depository institution",
   :skos/example
   "Examples include cash management service, foreign exchange service, lending or credit service, investment service, insurance service, merchant service, payroll service, and the like."})

(def BrokerageFirm
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.worldbank.org/en/publication/gfdr/gfdr-2016/background/nonbank-financial-institution"},
   :cmns-av/explanatoryNote
   "The term broker-dealer is used in U.S. securities regulation parlance to describe stock brokerages, because most of them act as both agents and principals. A brokerage acts as a broker (or agent) when it executes orders on behalf of clients, whereas it acts as a dealer (or principal) when it trades for its own account.",
   :cmns-av/synonym "market maker",
   :db/ident :fibo-fbc-fct-fse/BrokerageFirm,
   :fibo-fnd-utl-av/definitionOrigin
   "Office of Financial Research (OFR) Annual Report, 2012, Glossary",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "brokerage firm",
   :rdfs/subClassOf #{:fibo-fbc-pas-fpas/BrokerDealer
                      :fibo-fbc-fct-fse/NonDepositoryInstitution},
   :skos/definition
   "firm in the business of buying and selling securities, operating as both a broker and a dealer, depending on the transaction"})

(def BusinessIdentifierCode
  {:cmns-av/abbreviation "BIC",
   :cmns-av/adaptedFrom
   {:rdf/value
    "ISO 9362:2014 Banking -- Banking telecommunication messages -- Business identifier code (BIC)"},
   :cmns-av/explanatoryNote
   "The BIC is used for addressing messages, routing business transactions and identifying business parties. Note that the use of OrganizationPartIdentifier in FIBO corresponds to the Branch Code in the SWIFT scheme.",
   :cmns-av/synonym #{"SWIFT-BIC" "business entity identifier" "SWIFT code"
                      "bank identifier code" "SWIFT ID"},
   :db/ident :fibo-fbc-fct-fse/BusinessIdentifierCode,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "business identifier code",
   :rdfs/subClassOf
   #{:cmns-cxtid/StructuredIdentifier
     {:owl/onProperty     :cmns-col/isMemberOf,
      :owl/someValuesFrom :fibo-fbc-fct-fse/BusinessIdentifierCodeScheme,
      :rdf/type           :owl/Restriction}
     {:owl/onClass    :lcc-cr/Alpha2Code,
      :owl/onProperty :cmns-col/comprises,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction}
     {:owl/onClass    :fibo-fnd-org-fm/FormalOrganization,
      :owl/onProperty :cmns-dsg/denotes,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction}
     {:owl/onClass    :fibo-fbc-fct-fse/BusinessPartySuffix,
      :owl/onProperty :cmns-col/comprises,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction} :cmns-cds/CodeElement
     {:owl/onClass    :fibo-fbc-fct-fse/BusinessPartyPrefix,
      :owl/onProperty :cmns-col/comprises,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-fnd-org-org/OrganizationPartIdentifier,
      :owl/onProperty :cmns-col/comprises,
      :rdf/type       :owl/Restriction}
     :fibo-fnd-org-org/OrganizationIdentifier},
   :skos/definition
   "international identifier for financial and non-financial institutions used to facilitate automated processing of information for financial services"})

(def BusinessIdentifierCodeScheme
  {:cmns-av/adaptedFrom
   #{{:xsd/anyURI "https://www.iso.org/standard/60390.html"}
     {:rdf/value
      "ISO 9362:2014 Banking -- Banking telecommunication messages -- Business identifier code (BIC)"}},
   :db/ident :fibo-fbc-fct-fse/BusinessIdentifierCodeScheme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "business identifier code scheme",
   :rdfs/subClassOf
   #{:fibo-fnd-org-org/OrganizationIdentificationScheme :cmns-cds/CodeSet
     {:owl/onProperty     :cmns-col/hasMember,
      :owl/someValuesFrom :fibo-fbc-fct-fse/BusinessIdentifierCode,
      :rdf/type           :owl/Restriction}},
   :skos/definition
   "scheme that specifies the elements of a unique business identifier code (BIC) scheme to identify financial and non-financial institutions used to facilitate automated processing of information for financial services"})

(def BusinessPartyPrefix
  {:cmns-av/adaptedFrom
   {:rdf/value
    "ISO 9362:2014 Banking -- Banking telecommunication messages -- Business identifier code (BIC)"},
   :cmns-av/explanatoryNote
   #{"For new BIC registration from an organization not yet identified by a BIC, the party prefix will be allocated at the discretion of the RA. The code will not have a mnemonic or acronym value anymore."
     "For new BIC registration by an organization already identified with a BIC or an affiliated organization [after the transition period ending November 2018], SWIFT will still reserve the usage of an existing party prefix to these organizations. This legacy rule will be reserved to existing BIC owners. If they wish to preserve this value, no other organization will be allowed to use the same code"},
   :cmns-av/synonym #{"institution code" "bank code"},
   :db/ident :fibo-fbc-fct-fse/BusinessPartyPrefix,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "business party prefix",
   :rdfs/subClassOf #{:cmns-cds/CodeElement
                      {:owl/maxQualifiedCardinality 1,
                       :owl/onClass    :fibo-fbc-fct-fse/BusinessIdentifierCode,
                       :owl/onProperty :cmns-col/isIncludedIn,
                       :rdf/type       :owl/Restriction}
                      {:owl/onProperty :cmns-dsg/isDefinedIn,
                       :owl/someValuesFrom
                       :fibo-fbc-fct-fse/BusinessIdentifierCodeScheme,
                       :rdf/type :owl/Restriction}
                      :fibo-fnd-org-org/OrganizationIdentifier},
   :skos/definition
   "four-character (4 alphanumeric) code associated with an organization for the purposes of banking telecommunications"})

(def BusinessPartySuffix
  {:cmns-av/adaptedFrom
   {:rdf/value
    "ISO 9362:2014 Banking -- Banking telecommunication messages -- Business identifier code (BIC)"},
   :cmns-av/explanatoryNote
   #{"With the revision of the standard [and transition period ending November 2018], the location code has been re-defined as a 'party suffix' without any specific meaning. A new reference data attribute has been introduced in the SWIFTRef directories to indicate where the institution is located and to which time zone it refers."
     "In the prior version of the standard, position 7 of the BIC determined the location of the BIC in a particular country. In a country spanning over multiple time zones, each character may have been used to define a different time zone. If an organization moved location to a different time zone within the same country, the existing BIC would normally have been deleted and replaced by a new BIC with the appropriate location code."},
   :db/ident :fibo-fbc-fct-fse/BusinessPartySuffix,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "business party suffix",
   :rdfs/subClassOf
   #{{:owl/onProperty     :cmns-col/isIncludedIn,
      :owl/someValuesFrom :fibo-fbc-fct-fse/BusinessIdentifierCode,
      :rdf/type           :owl/Restriction} :cmns-cds/CodeElement
     {:owl/onProperty     :cmns-dsg/isDefinedIn,
      :owl/someValuesFrom :fibo-fbc-fct-fse/BusinessIdentifierCodeScheme,
      :rdf/type           :owl/Restriction}},
   :skos/definition
   "two-character (2 alphanumeric) code associated with the organization for the purposes of banking telecommunications"})

(def CentralBank
  {:cmns-av/explanatoryNote
   "Its functions include issuing and managing the country's currency, controlling monetary policy and supervising money market operations, managing exchange and gold reserves, acting as lender of last resort to commercial banks, and providing banking services to the government. Central banks are state-controlled but are increasingly being given an independent status to insulate them from partisan politics.",
   :db/ident :fibo-fbc-fct-fse/CentralBank,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "central bank",
   :rdfs/subClassOf #{:fibo-fbc-fct-fse/Bank :fibo-fbc-fct-fse/MonetaryAuthority
                      {:owl/allValuesFrom :fibo-be-ge-ge/Instrumentality,
                       :owl/onProperty    :cmns-rlcmp/isPlayedBy,
                       :rdf/type          :owl/Restriction}},
   :skos/definition
   "financial institution that is the monetary authority and major regulatory bank for a country (or group of countries)"})

(def CentralCounterpartyClearingHouse
  {:cmns-av/abbreviation "CCP",
   :cmns-av/explanatoryNote
   "These clearing houses are often operated by the major banks in the country. The house's prime responsibility is to provide efficiency and stability to the financial markets that they operate in.\n\nThere are two main processes that are carried out by CCPs: clearing and settlement of market transactions. Clearing relates to identifying the obligations of both parties on either side of a transaction. Settlement occurs when the final transfer of securities and funds occur.\n\nCCPs benefit both parties in a transaction because they bear most of the credit risk. If two individuals deal with one another, the buyer bears the credit risk of the seller, and vice versa. When a CCP is used the credit risk that is held against both buyer and seller is coming from the CCP, which in all likelihood is much less than in the previous situation.",
   :db/ident :fibo-fbc-fct-fse/CentralCounterpartyClearingHouse,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "central counterparty clearing house",
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.esma.europa.eu/sites/default/files/EACH2.pdf"},
   :rdfs/subClassOf :fibo-fbc-fct-fse/ClearingHouse,
   :skos/definition
   "clearing house that helps facilitate trading in derivatives and equities markets"})

(def CentralSecuritiesDepository
  {:cmns-av/abbreviation "CSD",
   :cmns-av/adaptedFrom {:xsd/anyURI "http://ecsda.eu/facts/faq"},
   :cmns-av/explanatoryNote
   "CSDs' clients are typically financial institutions themselves (such as custodian banks and brokers) rather than individual investors.",
   :db/ident :fibo-fbc-fct-fse/CentralSecuritiesDepository,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "central securities depository",
   :rdfs/subClassOf :fibo-fbc-pas-fpas/FinancialServiceProvider,
   :skos/definition
   "functional entity that provides a central point for depositing financial instruments ('securities'), for example, bonds and shares"})

(def ClearingBank
  {:db/ident :fibo-fbc-fct-fse/ClearingBank,
   :fibo-fnd-utl-av/definitionOrigin
   "Office of Financial Research (OFR) Annual Report, 2012, Glossary",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "clearing bank",
   :rdfs/subClassOf #{:fibo-fbc-fct-fse/ClearingHouse
                      :fibo-fbc-fct-fse/CommercialBank},
   :skos/definition
   "commercial bank that facilitates payment and settlement of financial transactions, such as check clearing or facilitating trades between the sellers and buyers of securities or other financial instruments or contracts"})

(def ClearingCorporation
  {:cmns-av/adaptedFrom
   {:rdf/value
    "Barron's Dictionary of Finance and Investment Terms, Ninth Edition, 2014"},
   :db/ident :fibo-fbc-fct-fse/ClearingCorporation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "clearing corporation",
   :rdfs/subClassOf #{{:owl/onClass    :fibo-be-le-cb/Corporation,
                       :owl/onProperty :cmns-rlcmp/isPlayedBy,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      :fibo-fbc-fct-fse/ClearingHouse},
   :skos/definition "clearing house that is organized as a corporation"})

(def ClearingHouse
  {:cmns-av/adaptedFrom
   {:rdf/value
    "Barron's Dictionary of Finance and Investment Terms, Ninth Edition, 2014"},
   :db/ident :fibo-fbc-fct-fse/ClearingHouse,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "clearing house",
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fnd-rel-rel/provides,
                       :owl/someValuesFrom :fibo-fbc-fct-fse/ClearingService,
                       :rdf/type           :owl/Restriction}
                      :fibo-fbc-pas-fpas/FinancialServiceProvider},
   :skos/definition
   "financial service provider that is exchange affiliated and provides clearing services, including the validation, delivery, and settlement of financial transactions, for financial intermediaries"})

(def ClearingService
  {:cmns-av/adaptedFrom {:rdf/value "EDM Council / Quarule"},
   :db/ident :fibo-fbc-fct-fse/ClearingService,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "clearing service",
   :rdfs/seeAlso
   {:xsd/anyURI
    "https://dtcclearning.com/helpfiles/cross_bus/glossary/Content/Topics/gloss.htm"},
   :rdfs/subClassOf :fibo-fbc-pas-fpas/FinancialService,
   :skos/definition
   "service provided on behalf of an institutional market participant by a clearing services provider following a trade that finalizes the transfer of security ownership"})

(def CommercialBank
  {:cmns-av/explanatoryNote
   #{"A commercial bank is a financial institution that is owned by stockholders, operates for a profit, and engages in various lending activities. Commercial banks provide services, such as accepting deposits, giving business loans and auto loans, mortgage lending, and basic investment products like savings accounts and certificates of deposit."
     "The traditional commercial bank is a brick and mortar institution with tellers, safe deposit boxes, vaults and ATMs. However, some commercial banks do not have any physical branches and require consumers to complete all transactions by phone or Internet. In exchange, they generally pay higher interest rates on investments and deposits, and charge lower fees."},
   :db/ident :fibo-fbc-fct-fse/CommercialBank,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "commercial bank",
   :rdfs/seeAlso
   {:xsd/anyURI
    "http://www.ffiec.gov/nicpubweb/Content/HELP/Institution%20Type%20Description.htm"},
   :rdfs/subClassOf #{:fibo-fbc-fct-fse/Bank
                      {:owl/onClass    :fibo-be-le-cb/Corporation,
                       :owl/onProperty :cmns-rlcmp/isPlayedBy,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "depository institution that engages in various financial services, such as accepting deposits and making loans"})

(def CommercialFinanceCompany
  {:cmns-av/adaptedFrom
   {:rdf/value
    "Barron's Dictionary of Finance and Investment Terms, Ninth Edition, 2014"},
   :cmns-av/synonym "commercial credit company",
   :db/ident :fibo-fbc-fct-fse/CommercialFinanceCompany,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "commercial finance company",
   :rdfs/subClassOf :fibo-fbc-fct-fse/FinanceCompany,
   :skos/definition
   "finance company that makes loans to manufacturers and wholesalers, secured by accounts receivable, inventories, and equipment"})

(def CommodityTradingAdvisor
  {:cmns-av/abbreviation "CTA",
   :cmns-av/adaptedFrom
   {:rdf/value
    "Barron's Dictionary of Finance and Investment Terms, Ninth Edition, 2014"},
   :cmns-av/explanatoryNote
   "Indirect advice includes exercising trading authority over a customer's account. In the U.S., registered CTAs are registered with the Commodities Futures Trading Commission (CFTC) and are generally required to be members of the National Futures Association (NFA).",
   :db/ident :fibo-fbc-fct-fse/CommodityTradingAdvisor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "commodity trading advisor",
   :rdfs/subClassOf :fibo-fbc-fct-fse/NonDepositoryInstitution,
   :skos/definition
   "party that directly or indirectly advises others as to the value or advisability of buying or selling futures contracts or options"})

(def ConsumerFinanceCompany
  {:cmns-av/adaptedFrom
   {:rdf/value
    "Barron's Dictionary of Finance and Investment Terms, Ninth Edition, 2014"},
   :cmns-av/synonym #{"small loan company" "direct loan company"},
   :db/ident :fibo-fbc-fct-fse/ConsumerFinanceCompany,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "consumer finance company",
   :rdfs/subClassOf :fibo-fbc-fct-fse/FinanceCompany,
   :skos/definition
   "finance company that lends to individuals under the small loans laws of the jurisdiction in which they operate"})

(def ContractualSavingsInstitution
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.worldbank.org/en/publication/gfdr/gfdr-2016/background/nonbank-financial-institution"},
   :cmns-av/explanatoryNote
   #{"Collective investment vehicles invest the pooled resources of the individuals and firms into numerous equity, debt, and derivatives promises. The individual, however, holds equity in the CIV itself rather what the CIV invests in specifically. The two most popular examples of contractual savings institutions are mutual funds and private pension plans."
     "Typically more than 70 percent of the daily trading on the New York Stock Exchange is conducted on behalf of institutional investors."},
   :cmns-av/synonym #{{:rdf/language "en-US",
                       :rdf/value    "institutional investment firm"}
                      {:rdf/language "fr-FR",
                       :rdf/value    "investisseur institutionnel"}
                      {:rdf/language "en-US",
                       :rdf/value    "institutional investor"}},
   :db/ident :fibo-fbc-fct-fse/ContractualSavingsInstitution,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "contractual savings institution",
   :rdfs/subClassOf #{:fibo-be-oac-opty/Investor
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass
                       {:owl/unionOf
                        [:fibo-be-le-lp/SpecialPurposeVehicle
                         :fibo-be-plc-plc/PrivateCompanyWithLimitedLiability
                         :fibo-be-ptr-ptr/Partnership],
                        :rdf/type :owl/Class},
                       :owl/onProperty :cmns-rlcmp/isPlayedBy,
                       :rdf/type :owl/Restriction}
                      :fibo-fbc-fct-fse/NonDepositoryInstitution},
   :skos/definition
   "financial institution that provides the opportunity for individuals to invest in collective investment vehicles in a fiduciary rather than a principle role",
   :skos/example
   "Example institutional investors include banks, insurance companies, mutual funds, pension funds, and other similar large funds."})

(def CreditUnion
  {:db/ident :fibo-fbc-fct-fse/CreditUnion,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "credit union",
   :rdfs/subClassOf #{:fibo-fbc-fct-fse/DepositoryInstitution
                      {:owl/onClass    :fibo-be-le-fbo/NotForProfitOrganization,
                       :owl/onProperty :cmns-rlcmp/isPlayedBy,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      :fibo-be-fct-fct/CooperativeSociety},
   :skos/definition
   "not-for-profit depository institution that makes personal loans and offers other consumer banking services, organized for the purpose of promoting thrift among its members and creating a source of credit for provident or productive purposes"})

(def DataProcessingService
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "https://www.ffiec.gov/npw/Help/InstitutionTypes"},
   :db/ident :fibo-fbc-fct-fse/DataProcessingService,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "data processing service",
   :rdfs/subClassOf #{:fibo-fbc-pas-fpas/FinancialService
                      {:owl/onProperty :fibo-fnd-rel-rel/isProvidedBy,
                       :owl/someValuesFrom
                       :fibo-fbc-fct-fse/DataProcessingServicer,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "financial service offered by an entity primarily engaged in providing infrastructure for hosting or data processing services"})

(def DataProcessingServicer
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "https://www.ffiec.gov/npw/Help/InstitutionTypes"},
   :cmns-av/explanatoryNote
   "These establishments may provide specialized hosting activities, such as web hosting, streaming services or application hosting, provide application service provisioning, or may provide general time-share mainframe facilities to clients. Data processing establishments provide complete processing and specialized reports from data supplied by clients or provide automated data processing and data entry services.",
   :db/ident :fibo-fbc-fct-fse/DataProcessingServicer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "data processing service",
   :rdfs/subClassOf :fibo-fbc-pas-fpas/FinancialServiceProvider,
   :skos/definition
   "finance services provider primarily engaged in providing infrastructure for hosting or data processing services"})

(def DepositoryInstitution
  {:cmns-av/adaptedFrom
   #{{:xsd/anyURI
      "https://www.fdic.gov/regulations/laws/rules/1000-400.html#fdic1000sec.3a"}
     {:rdf/value
      "12 U.S. Code Section 1813 - Definitions, see, for example, http://www.law.cornell.edu/uscode/text/12/1813"}},
   :db/ident :fibo-fbc-fct-fse/DepositoryInstitution,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "depository institution",
   :rdfs/subClassOf :fibo-fbc-fct-fse/FinancialInstitution,
   :skos/definition
   "any financial institution engaged in the business of receiving demand deposits from the public or other institutions"})

(def DevelopmentBank
  {:cmns-av/synonym #{"development finance company (DFC)"
                      "development financial institution (DFI)"},
   :db/ident :fibo-fbc-fct-fse/DevelopmentBank,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "development bank",
   :rdfs/subClassOf :fibo-fbc-fct-fse/FinancialInstitution,
   :skos/definition
   "national or regional financial institution designed to provide medium- and long-term capital for productive investment, often accompanied by technical assistance, in poor countries"})

(def ElectronicFundsTransferService
  {:cmns-av/abbreviation "EFT",
   :cmns-av/adaptedFrom
   {:rdf/value
    "Barron's Dictionary of Finance and Investment Terms, Ninth Edition, 2014"},
   :cmns-av/synonym "wire transfer service",
   :db/ident :fibo-fbc-fct-fse/ElectronicFundsTransferService,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "electronic funds transfer service",
   :rdfs/seeAlso
   {:xsd/anyURI
    "https://www.federalreserve.gov/boarddocs/caletters/2008/0807/08-07_attachment.pdf"},
   :rdfs/subClassOf :fibo-fbc-pas-fpas/FinancialService,
   :skos/definition
   "service involving any transfer of funds other than a transaction involving a paper instrument, that is initiated through an electronic terminal, telephone, or computer and that orders or authorizes a financial institution to debit or credit an account",
   :skos/example
   "EFT services include transfers through automated teller machines, point-of-sale terminals, automated clearinghouse systems, telephone bill-payment plans in which periodic or recurring transfers are contemplated, and remote banking programs."})

(def FaceAmountCertificateCompany
  {:cmns-av/explanatoryNote
   "An investor may enter into a contract with an issuer of a face amount certificate to contract to receive a stated or fixed amount of money (the face amount) at a stated date in the future. In exchange for this future sum, the investor must deposit an agreed lump sum or make scheduled installment payments over time. Face amount certificates are rarely issued these days, as most of the tax advantages that the investment once offered have been lost through changes in the tax laws.",
   :db/ident :fibo-fbc-fct-fse/FaceAmountCertificateCompany,
   :fibo-fnd-utl-av/definitionOrigin
   "Section 4, definition of investment companies, Investment Company Act of 1940 as amended and approved as of 3 January 2012, see https://www.sec.gov/about/laws/ica40.pdf",
   :owl/disjointWith :fibo-fbc-fct-fse/ManagementCompany,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "face amount certificate company",
   :rdfs/subClassOf :fibo-fbc-fct-fse/InvestmentCompany,
   :skos/definition
   "investment company which is engaged or proposes to engage in the business of issuing face-amount certificates of the installment type, or which has been engaged in such business and has any such certificate outstanding"})

(def FinanceCompany
  {:cmns-av/adaptedFrom
   {:rdf/value
    "Barron's Dictionary of Finance and Investment Terms, Ninth Edition, 2014"},
   :db/ident :fibo-fbc-fct-fse/FinanceCompany,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "finance company",
   :rdfs/subClassOf :fibo-fbc-fct-fse/NonDepositoryInstitution,
   :skos/definition
   "financial intermediary in the business of making loans that obtains its financing from banks, institutions, and other money market sources rather than from deposits"})

(def FinancialInstitution
  {:cmns-av/adaptedFrom
   {:rdf/value "Barron's Dictionary of Banking Terms, Sixth Edition, 2012"},
   :cmns-av/explanatoryNote
   "Financial institutions are differentiated by the way they obtain and invest funds. Depository institutions accept public deposits, which are insured by the government against loss, and channel those deposits into lending activities. Non-depository institutions, such as brokerage firms, life insurance companies, pension funds, and investment companies, fund their investment activities directly from financial markets by selling securities to the public or by selling insurance policies, in the case of insurance companies.",
   :cmns-av/synonym "financial intermediary",
   :db/ident :fibo-fbc-fct-fse/FinancialInstitution,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "financial institution",
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fnd-rel-rel/provides,
                       :owl/someValuesFrom :fibo-fbc-pas-fpas/FinancialService,
                       :rdf/type           :owl/Restriction}
                      :fibo-fbc-pas-fpas/FinancialServiceProvider
                      {:owl/onProperty     :fibo-fbc-fct-rga/isRegulatedBy,
                       :owl/someValuesFrom :fibo-fbc-fct-rga/RegulatoryAgency,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "financial service provider identified as either a government agency or privately owned entity that collects funds from the public and from other institutions, and invests those funds in financial assets, such as loans, securities, bank deposits, and income-generating property"})

(def FinancialServiceProviderIdentifier
  {:db/ident :fibo-fbc-fct-fse/FinancialServiceProviderIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "financial service provider identifier",
   :rdfs/subClassOf
   #{{:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-fnd-law-jur/Jurisdiction,
      :owl/onProperty :fibo-fnd-rel-rel/isGovernedBy,
      :rdf/type       :owl/Restriction}
     {:owl/onClass :fibo-fbc-fct-fse/FinancialServiceProviderIdentifierScheme,
      :owl/onProperty :cmns-col/isMemberOf,
      :owl/qualifiedCardinality 1,
      :rdf/type :owl/Restriction} :fibo-fnd-pty-pty/PartyRoleIdentifier
     {:owl/onClass    :fibo-fbc-pas-fpas/FinancialServiceProvider,
      :owl/onProperty :cmns-id/identifies,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction}},
   :skos/definition
   "identifier that is officially allocated to a financial service provider based on a function that they provide, typically in a jurisdiction over which a regulatory agency has some jurisdiction"})

(def FinancialServiceProviderIdentifierScheme
  {:db/ident :fibo-fbc-fct-fse/FinancialServiceProviderIdentifierScheme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "financial service provider identifier scheme",
   :rdfs/subClassOf #{:cmns-id/IdentificationScheme
                      {:owl/onProperty :cmns-col/hasMember,
                       :owl/someValuesFrom
                       :fibo-fbc-fct-fse/FinancialServiceProviderIdentifier,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "scheme that defines the financial service provider identifier per the issuing registration authority or regulatory agency"})

(def FuturesCommissionMerchant
  {:cmns-av/abbreviation "FCM",
   :cmns-av/adaptedFrom {:rdf/value "National Futures Association"},
   :db/ident :fibo-fbc-fct-fse/FuturesCommissionMerchant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "futures commission merchant",
   :rdfs/subClassOf :fibo-fbc-fct-fse/NonDepositoryInstitution,
   :skos/definition
   "party that does both of the following: (1) solicits or accepts orders to buy or sell futures contracts, options on futures, retail off-exchange forex contracts, or swaps and (2) accepts money or other assets from customers to support such orders"})

(def HoldingCompany
  {:cmns-av/explanatoryNote
   "Holding companies protect their owners from losses to some degree, protecting assets, for example, in case of bankruptcy. They can also be set up to own property such as real estate, patents, trademarks, stocks and other assets to limit financial and legal liability",
   :db/ident :fibo-fbc-fct-fse/HoldingCompany,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "holding company",
   :rdfs/subClassOf #{:fibo-be-fct-fct/FunctionalBusinessEntity
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-be-oac-cpty/ControlledParty,
                       :owl/onProperty :fibo-fbc-fct-fse/hasPortfolioCompany,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "business entity established to own stock in another company, typically to own enough voting shares to have some level of control over that company's policies and management"})

(def InsuranceCompany
  {:cmns-av/adaptedFrom
   #{{:xsd/anyURI "https://www.sec.gov/about/laws/ica40.pdf"}
     {:xsd/anyURI
      "http://www.ffiec.gov/nicpubweb/Content/HELP/Institution%20Type%20Description.htm"}},
   :cmns-av/explanatoryNote
   "In the US, insurance companies are subject to supervision by the insurance commissioner or a similar official or agency of a State; or any receiver or similar official or any liquidating agent for such a company, in his capacity as such. Common forms of insurance include life, property and casualty, and health insurance. In addition to insuring against hazards, many insurance companies also sell investments or investment-like products. The most prevalent investment products offered by insurers are annuities and life insurance policies that also feature investment elements.\n\nA number of insurance companies operate brokerage arms that trade securities on behalf of clients.",
   :db/ident :fibo-fbc-fct-fse/InsuranceCompany,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "insurance company",
   :rdfs/subClassOf :fibo-fbc-fct-fse/RiskPoolingInstitution,
   :skos/definition
   "non-depository institution whose primary and predominant business activity is the writing of insurance or the reinsuring of risks underwritten by insurance companies, and that provides compensation based on the happening of at least one contingency"})

(def InsuranceService
  {:cmns-av/adaptedFrom
   {:rdf/value
    "Barron's Dictionary of Finance and Investment Terms, Ninth Edition, 2014"},
   :cmns-av/explanatoryNote
   "Insurance providers invest the compensation they receive in order to make a profit. In general, insurance transfers risk from individuals or organizations to a larger pool of individuals or organizations that are better able to mitigate that risk.",
   :db/ident :fibo-fbc-fct-fse/InsuranceService,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "insurance service",
   :rdfs/subClassOf :fibo-fbc-pas-fpas/FinancialService,
   :skos/definition
   "financial service in which the insurer promises to provide compensation for specific potential future losses in exchange for a periodic payment"})

(def InvestmentBank
  {:cmns-av/explanatoryNote
   "Major investment banks include Barclays, BofA Merrill Lynch, Warburgs, Goldman Sachs, Deutsche Bank, JP Morgan, Morgan Stanley, Salomon Brothers, UBS, Credit Suisse, Citibank and Lazard. Some investment banks specialize in particular industry sectors. Many investment banks also have retail operations that serve small, individual customers.",
   :db/ident :fibo-fbc-fct-fse/InvestmentBank,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "investment bank",
   :rdfs/subClassOf
   #{{:owl/unionOf [:fibo-fbc-fct-fse/Bank :fibo-fbc-fct-fse/BrokerageFirm],
      :rdf/type    :owl/Class} :fibo-fbc-fct-fse/FinancialInstitution},
   :skos/definition
   "financial service provider that acts as an underwriter or agent that serves as intermediary between the issuer of securities and the investing public"})

(def InvestmentCompany
  {:cmns-av/explanatoryNote
   #{"In the US, all investment company offerings are subject to the Securities Act of 1933, which requires the investment company to register with the Securities Exchange Commission (SEC) and to give all purchasers a prospectus. Investment companies are also subject to the Investment Company Act of 1940, which sets forth guidelines on how investment companies must operate."
     "An investment company is organized as either a corporation or as a trust. Individual investors' money is then pooled together in a single account and used to purchase securities that will have the greatest chance of helping the investment company reach its objectives. All investors jointly own the portfolio that is created through these pooled funds, and each investor has an undivided interest in the securities."},
   :db/ident :fibo-fbc-fct-fse/InvestmentCompany,
   :fibo-fnd-utl-av/definitionOrigin
   "Section 3a of the Investment Company Act of 1940 as amended in January, 2012, https://www.sec.gov/about/laws/ica40.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "investment company",
   :rdfs/subClassOf :fibo-fbc-fct-fse/NonDepositoryInstitution,
   :skos/definition
   "any issuer which: (a) is or holds itself out as being engaged primarily, or proposes to engage primarily, in the business of investing, reinvesting, or trading in securities; (b) is engaged or proposes to engage in the business of issuing face-amount certificates of the installment type, or has been engaged in such business and has any such certificate outstanding; or (c) is engaged or proposes to engage in the business of investing, reinvesting, owning, holding, or trading in securities, and owns or proposes to acquire investment securities having a value exceeding 40 per centum of the value of such issuer&apos;s total assets (exclusive of Government securities and cash items) on an unconsolidated basis"})

(def InvestmentService
  {:cmns-av/adaptedFrom
   {:rdf/value
    "Barron's Dictionary of Finance and Investment Terms, Ninth Edition, 2014"},
   :db/ident :fibo-fbc-fct-fse/InvestmentService,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "investment service",
   :rdfs/subClassOf :fibo-fbc-pas-fpas/FinancialService,
   :skos/definition
   "financial service designed to assist investors in using capital to create more money, either through income-producing vehicles or through more risk-oriented ventures to result in capital gains, including but not limited to providing investment advice, asset and portfolio management, and brokerage services"})

(def ManagementCompany
  {:cmns-av/explanatoryNote
   "Management companies allow investors to pool their capital with that of other investors in order to purchase professionally-managed groups of diversified securities.",
   :db/ident :fibo-fbc-fct-fse/ManagementCompany,
   :fibo-fnd-utl-av/definitionOrigin
   "Section 4, definition of investment companies, Investment Company Act of 1940 as amended and approved as of 3 January 2012, see https://www.sec.gov/about/laws/ica40.pdf",
   :owl/disjointWith :fibo-fbc-fct-fse/UnitInvestmentTrust,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "management company",
   :rdfs/subClassOf :fibo-fbc-fct-fse/InvestmentCompany,
   :skos/definition
   "investment company that sells and manages a portfolio of securities other than a face-amount certificate company or unit investment fund"})

(def MerchantService
  {:cmns-av/adaptedFrom
   {:rdf/value
    "Barron's Dictionary of Finance and Investment Terms, Ninth Edition, 2014"},
   :db/ident :fibo-fbc-fct-fse/MerchantService,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "merchant service",
   :rdfs/subClassOf :fibo-fbc-pas-fpas/FinancialService,
   :skos/definition
   "financial service provided by a financial institution to a merchant or other business, including but not limited to managing financial transactions via a secure channel",
   :skos/example
   "Example merchant services include credit and debit card processing, check guarantee and conversion services, point of sale (PoS) systems, gift card and loyalty programs, online transaction processing, etc."})

(def MonetaryAuthority
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "http://www.investordictionary.com/definition/monetary-authority"},
   :db/ident :fibo-fbc-fct-fse/MonetaryAuthority,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "monetary authority",
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fbc-fct-fse/regulatesSupplyOf,
                       :owl/someValuesFrom :fibo-fnd-acc-cur/Currency,
                       :rdf/type           :owl/Restriction}
                      :fibo-fbc-fct-rga/RegulatoryAgency},
   :skos/definition
   "regulatory agency that controls the monetary policy, regulation and supply of money in some country or group of countries",
   :skos/example
   "a central bank, the executive branch of a government, a central bank for several nations, a currency board"})

(def MoneyServicesBusiness
  {:cmns-av/abbreviation "MSB",
   :cmns-av/explanatoryNote
   "This definition excludes banks and persons registered with or examined by the Securities and Exchange Commission or the Commodities Futures Trading Commission.",
   :db/ident :fibo-fbc-fct-fse/MoneyServicesBusiness,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "money services business",
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.fincen.gov/money-services-business-definition"},
   :rdfs/subClassOf :fibo-fbc-fct-fse/NonDepositoryInstitution,
   :skos/definition
   "any person doing business, whether or not on a regular basis or as an organized business concern, in one of the following capacities: (1) currency dealer or exchanger, (2) check casher, (3) issuer of traveler's checks, money orders, or stored value, (4) seller or redeemer of traveler's checks, money orders, or stored value, (5) money transmitter, or (6) postal service"})

(def MortgageCompany
  {:db/ident :fibo-fbc-fct-fse/MortgageCompany,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "mortgage company",
   :rdfs/subClassOf :fibo-fbc-pas-fpas/FinancialServiceProvider,
   :skos/definition
   "financial service provider that originates and/or funds mortgages for residential or commercial property"})

(def NonDepositoryInstitution
  {:cmns-av/adaptedFrom
   #{{:rdf/value "Barron's Dictionary of Banking Terms, Sixth Edition, 2012"}
     {:xsd/anyURI
      "https://www.worldbank.org/en/publication/gfdr/gfdr-2016/background/nonbank-financial-institution"}},
   :cmns-av/explanatoryNote
   "A non-depository financial institution acts as a middleman between two parties in a financial transaction, and does not provide traditional depository services, such as brokerage firms, insurance companies, and investment companies. These kinds of institutions facilitate alternative financial services, such as investment (both collective and individual), risk pooling, financial consulting, brokering, money transmission, and check cashing. NBFIs are a source of consumer credit (along with licensed banks). Examples of nonbank financial institutions include insurance firms, venture capitalists, currency exchanges, some microloan organizations, and pawn shops. These non-bank financial institutions provide services that are not necessarily suited to banks, serve as competition to banks, and specialize in sectors or groups.",
   :cmns-av/synonym #{"non-bank financial institution (NBFI)"
                      "non-banking financial institution (NBFI)"
                      "non-bank financial company (NBFC)"},
   :db/ident :fibo-fbc-fct-fse/NonDepositoryInstitution,
   :owl/disjointWith :fibo-fbc-fct-fse/DepositoryInstitution,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "non-depository institution",
   :rdfs/subClassOf :fibo-fbc-fct-fse/FinancialInstitution,
   :skos/definition
   "financial institution that does not have a full banking license and typically is not supervised by a national or international banking regulatory agency",
   :skos/historyNote
   "The term 'non-bank' may have been derived from 'non-deposit taking banking institution'. To be clearer, non-depository institutions are explicitly disjoint with depository institutions (financial institutions that take deposits of some sort, potentially including securities) in FIBO. Banks are defined as financial institutions that take demand deposits from the public and that also provide commercial lending services. Many 'non-bank' institutions take deposits or provide commercial lending services, but they may not do both."})

(def PaymentService
  {:db/ident :fibo-fbc-fct-fse/PaymentService,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "payment service",
   :rdfs/seeAlso
   {:xsd/anyURI
    "https://ec.europa.eu/info/business-economy-euro/banking-and-finance/consumer-finance-and-payments/payment-services/payment-services_en"},
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fnd-rel-rel/involves,
                       :owl/someValuesFrom :fibo-fnd-pas-psch/PaymentObligation,
                       :rdf/type           :owl/Restriction}
                      :fibo-fbc-fct-fse/MerchantService},
   :skos/definition
   "financial service that involves acceptance of electronic payments by a variety of payment methods including credit card, bank-based payments such as direct debit, bank transfer, and real-time bank transfer based on online banking"})

(def PayrollService
  {:cmns-av/explanatoryNote
   "Payroll services typically include printing of employee pay checks, direct deposit of wages to employee bank accounts, calculation and withholding of employee taxes, calculation and payment of corporate payroll taxes and fees with appropriate government authorities (such as Social Security in the US), filing government quarterly and annual reports, and so forth. They may also include management of retirement and savings plans, health benefits, timekeeping, automated integration with the business' accounting system, etc.",
   :db/ident :fibo-fbc-fct-fse/PayrollService,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "payroll service",
   :rdfs/subClassOf :fibo-fbc-pas-fpas/FinancialService,
   :skos/definition
   "financial service, typically provided to small businesses that are not large enough to have an internal finance organization, that involves managing payment of wages to employees"})

(def PrincipalUnderwriter
  {:cmns-av/adaptedFrom
   {:rdf/value
    "Section 3a of the Investment Company Act of 1940 as amended in January, 2012, https://www.sec.gov/about/laws/ica40.pdf"},
   :cmns-av/explanatoryNote
   "Principal underwriter of or for a closed-end company or any issuer which is not an investment company, or of any security issued by such a company or issuer, means any underwriter who, in connection with a primary distribution of securities, (a) is in privity of contract with the issuer or an affiliated person of the issuer; (b) acting alone or in concert with one or more other persons, initiates or directs the formation of an underwriting syndicate; or (c) is allowed a rate of gross commission, spread, or other profit greater than the rate allowed another underwriter participating in the distribution.",
   :db/ident :fibo-fbc-fct-fse/PrincipalUnderwriter,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "principal underwriter",
   :rdfs/subClassOf :fibo-fbc-fct-fse/Underwriter,
   :skos/definition
   "underwriter who, as principal, purchases from an investment company, or pursuant to some contract has the right to purchase from such company, any security for distribution, or who as agent for such company sells or has the right to sell any security to a dealer or to the public, excluding any dealer who purchases from such company through sn underwriter acting as an agent for such company"})

(def RegisteredInvestmentAdvisor
  {:cmns-av/abbreviation "RIA",
   :db/ident :fibo-fbc-fct-fse/RegisteredInvestmentAdvisor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "registered investment advisor",
   :rdfs/subClassOf #{:fibo-fbc-pas-fpas/FinancialServiceProvider
                      :fibo-fbc-pas-fpas/RegisteredAgent
                      {:owl/onProperty :fibo-fbc-fct-ra/isRegisteredBy,
                       :owl/someValuesFrom
                       {:owl/unionOf [:fibo-fbc-fct-ra/RegistrationAuthority
                                      :fibo-fbc-fct-rga/RegulatoryAgency],
                        :rdf/type    :owl/Class},
                       :rdf/type :owl/Restriction}
                      {:owl/onProperty     :fibo-be-oac-cpty/advises,
                       :owl/someValuesFrom :fibo-be-oac-cpty/ControlledParty,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "registered agent and financial service provider that advises high net worth individuals on investments and manages their portfolios"})

(def RiskPoolingInstitution
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.worldbank.org/en/publication/gfdr/gfdr-2016/background/nonbank-financial-institution"},
   :db/ident :fibo-fbc-fct-fse/RiskPoolingInstitution,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "risk pooling institution",
   :rdfs/subClassOf :fibo-fbc-fct-fse/NonDepositoryInstitution,
   :skos/definition
   "financial institution that provides some financial service while spreading the financial risk inherent in that service to lower the probability of a catastrophic financial event by aggregating customers across diverse dimensions as a risk management practice",
   :skos/example
   "Insurance companies are the most common form of risk pooling institution."})

(def SalesFinanceCompany
  {:cmns-av/adaptedFrom
   {:rdf/value
    "Barron's Dictionary of Finance and Investment Terms, Ninth Edition, 2014"},
   :cmns-av/synonym "acceptance company",
   :db/ident :fibo-fbc-fct-fse/SalesFinanceCompany,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "sales finance company",
   :rdfs/subClassOf :fibo-fbc-fct-fse/FinanceCompany,
   :skos/definition
   "finance company that purchases retail and wholesale paper from automobile and other consumer and commercial goods dealers"})

(def SavingsAssociation
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.fdic.gov/regulations/laws/rules/1000-400.html#fdic1000sec.3a"},
   :db/ident :fibo-fbc-fct-fse/SavingsAssociation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "savings association",
   :rdfs/subClassOf :fibo-fbc-fct-fse/DepositoryInstitution,
   :skos/definition
   "depository institution that is (a) any federal savings bank or association chartered under section 1464 of the Federal Deposit Insurance Act; (b) any state chartered building and loan association, savings and loan association, or homestead association; or (c) any cooperative bank (other than a cooperative bank which is a state bank as defined in subsection (a)(2)) of the Federal Deposit Insurance Act, which is organized and operating according to the laws of the State (as defined in subsection (a)(3)) in which it is chartered or organized; and (c) any corporation (other than a bank) that the board of directors and the comptroller of the currency jointly determine to be operating in substantially the same manner as such a depository institution"})

(def SelfRegulatingOrganization
  {:cmns-av/abbreviation "SRO",
   :db/ident :fibo-fbc-fct-fse/SelfRegulatingOrganization,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "self-regulating organization",
   :rdfs/subClassOf
   #{{:owl/onProperty     :cmns-rlcmp/isPlayedBy,
      :owl/someValuesFrom :fibo-be-le-fbo/NonGovernmentalOrganization,
      :rdf/type           :owl/Restriction} :fibo-fbc-fct-rga/RegulatoryAgency},
   :skos/definition
   "non-governmental organization that has the power to create and exercise some degree of regulatory authority over an industry or profession in some country or group of countries"})

(def TrustCompany
  {:cmns-av/explanatoryNote
   "A professional trust company may be independently owned or owned by, for example, a bank or a law firm, and which specializes in being a trustee of various kinds of trusts. The trust company oversees the management of assets covered by the trust agreement. Such companies often are used when a grantor feels the trust company can do an equal or better job managing the assets than an individual person, or if the grantor does not know of anyone else who can act as trustee. Trust companies sometimes act as fiscal agents for corporations by attending to the registration and transfer of their stocks and bonds, serving as a trustee for their bond and mortgage creditors, and transacting general banking and loan business.",
   :db/ident :fibo-fbc-fct-fse/TrustCompany,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "trust company",
   :rdfs/subClassOf #{:fibo-fbc-fct-fse/FinancialInstitution
                      {:owl/onClass    :fibo-be-le-cb/Corporation,
                       :owl/onProperty :cmns-rlcmp/isPlayedBy,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "financial institution that acts as a fiduciary, trustee or agent of trusts and agencies"})

(def Underwriter
  {:db/ident :fibo-fbc-fct-fse/Underwriter,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "underwriter",
   :rdfs/subClassOf #{{:owl/onProperty :cmns-rlcmp/isPlayedBy,
                       :owl/someValuesFrom
                       {:owl/onProperty :cmns-pts/isAPartyTo,
                        :owl/someValuesFrom
                        :fibo-fbc-fct-fse/UnderwritingArrangement,
                        :rdf/type :owl/Restriction},
                       :rdf/type :owl/Restriction}
                      :fibo-fbc-pas-fpas/FinancialServiceProvider},
   :skos/definition
   "financial service provider that evaluates and assumes another party's risk for a fee, such as a commission, premium, spread or interest"})

(def UnderwritingArrangement
  {:db/ident :fibo-fbc-fct-fse/UnderwritingArrangement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "underwriting arrangement",
   :rdfs/subClassOf #{:fibo-fnd-agr-ctr/MutualContractualAgreement
                      {:owl/onProperty     :cmns-pts/hasPartyRole,
                       :owl/someValuesFrom :fibo-fbc-fct-fse/Underwriter,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "contractual agreement between parties that commits the underwriter to assuming risk"})

(def UnitInvestmentTrust
  {:cmns-av/synonym "unit investment company",
   :db/ident :fibo-fbc-fct-fse/UnitInvestmentTrust,
   :fibo-fnd-utl-av/definitionOrigin
   "Section 4, definition of investment companies, Investment Company Act of 1940 as amended and approved as of 3 January 2012, see https://www.sec.gov/about/laws/ica40.pdf",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "unit investment trust",
   :rdfs/subClassOf :fibo-fbc-fct-fse/InvestmentCompany,
   :skos/definition
   "investment company which (a) is organized under a trust indenture, contract of custodianship or agency, or similar instrument, (b) does not have a board of directors, and (c) issues only redeemable securities, each of which represents an undivided interest in a unit of specified securities; but does not include a voting trust"})

(def WealthManagementService
  {:db/ident :fibo-fbc-fct-fse/WealthManagementService,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "wealth management service",
   :rdfs/subClassOf :fibo-fbc-pas-fpas/FinancialService,
   :skos/definition
   "financial service that combines financial and investment advice, accounting and tax services, retirement planning and legal or estate planning for one set fee"})

(def hasDateEstablished
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.ffiec.gov/nicpubweb/Content/DataDownload/NPW%20Data%20Dictionary.pdf"},
   :cmns-av/explanatoryNote
   "This may be the date on its papers of incorporation or formation document, or the date on which it was granted a license.",
   :cmns-av/synonym "date of commencement of existence",
   :db/ident :fibo-fbc-fct-fse/hasDateEstablished,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "has date established",
   :rdfs/range :cmns-dt/ExplicitDate,
   :rdfs/subPropertyOf #{:cmns-dt/hasExplicitDate :cmns-dt/hasStartDate},
   :skos/definition
   "the date that the financial service provider was formally established"})

(def hasDateEstablishmentTerminated
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.ffiec.gov/nicpubweb/Content/DataDownload/NPW%20Data%20Dictionary.pdf"},
   :db/ident :fibo-fbc-fct-fse/hasDateEstablishmentTerminated,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "has date establishment terminated",
   :rdfs/range :cmns-dt/ExplicitDate,
   :rdfs/subPropertyOf #{:cmns-dt/hasExplicitDate
                         :fibo-fnd-arr-doc/hasExpirationDate
                         :fibo-fnd-arr-doc/hasTerminationDate},
   :skos/definition "last full day that the entity existed"})

(def hasDateInsured
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.ffiec.gov/nicpubweb/Content/DataDownload/NPW%20Data%20Dictionary.pdf"},
   :db/ident :fibo-fbc-fct-fse/hasDateInsured,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "has date insured",
   :rdfs/range :cmns-dt/ExplicitDate,
   :rdfs/subPropertyOf #{:cmns-dt/hasExplicitDate :cmns-dt/hasStartDate},
   :skos/definition "date on which insurance became effective"})

(def hasPortfolioCompany
  {:db/ident :fibo-fbc-fct-fse/hasPortfolioCompany,
   :owl/inverseOf :fibo-fbc-fct-fse/isPortfolioCompanyOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-oac-ctl/ControllingParty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "has portfolio company",
   :rdfs/range :fibo-be-oac-cpty/ControlledParty,
   :rdfs/subPropertyOf :fibo-fnd-oac-ctl/isPartyControlling,
   :skos/definition
   "indicates a party in which a venture capital firm, a buyout firm, or a holding company has invested"})

(def isPortfolioCompanyOf
  {:db/ident :fibo-fbc-fct-fse/isPortfolioCompanyOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-oac-cpty/ControlledParty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "is portfolio company of",
   :rdfs/range :fibo-fnd-oac-ctl/ControllingParty,
   :rdfs/subPropertyOf :fibo-fnd-oac-ctl/hasControllingParty,
   :skos/definition
   "indicates a venture capital firm, a buyout firm, or a holding company that is a financial sponsor (i.e. investor in) of the party"})

(def regulatesSupplyOf
  {:db/ident :fibo-fbc-fct-fse/regulatesSupplyOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-fct-rga/RegulatoryAgency,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdfs/label "regulates supply of",
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/governs,
   :skos/definition
   "relates a regulatory agency to something it controls or supervises the availability of in some market by means of rules and regulations",
   :skos/example
   "The Federal Reserve System, whose banks together comprise the central bank of the United States, supervises banking system and regulates the money supply in the US."})

(def urn:uuid:c95393db-fb52-5f52-9697-5ce4100bef56
  {:cmns-av/copyright #{"Copyright (c) 2015-2024 Object Management Group, Inc."
                        "Copyright (c) 2015-2024 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology defines basic financial service providers, such as holding companies, financial institutions (both depository and non-depository institutions), and clearing houses at a relatively general level. Nuances specific to the institutions located in a specific country are defined in jurisdiction specific dependent ontologies.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/RegistrationAuthorities/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/RegulatoryAgencies/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/Partnerships/Partnerships/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/OwnershipAndControl/OwnershipParties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/ProductsAndServices/FinancialProductsAndServices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/OwnershipAndControl/Control/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/OwnershipAndControl/ControlParties/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/CodesAndCodeSets/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Organizations/Organizations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/PrivateLimitedCompanies/PrivateLimitedCompanies/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualIdentifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/ProductsAndServices/PaymentsAndSchedules/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Parties/Parties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/GovernmentEntities/GovernmentEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/LegalEntities/FormalBusinessOrganizations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/FunctionalEntities/FunctionalEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/LegalEntities/CorporateBodies/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Law/Jurisdiction/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Organizations/FormalOrganizations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Arrangements/Documents/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/FinancialServicesEntities/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Financial Services Entities Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities.rdf version of this ontology was revised to add missing functional entities and related properties, and eliminate circular or ambiguous definitions where possible."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities.rdf version of this ontology was revised to eliminate references to external dictionary sites that no longer resolve and address additional circular definitions."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities.rdf version of this ontology was modified per the issue resolutions identified in the FIBO FBC 1.0 FTF report."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/ version of this ontology was modified to generalize certain unions where they were no longer required and incorporate a new financial service provider identifier that is assigned functionally rather than to a legal entity."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities.rdf version of this ontology was revised to move the definition of the Bank for International Settlements (BIS) to the EU Regulatory Agencies ontology and build out the individual details there, and to reflect the move of some organization-specific concepts from BE to FND."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities.rdf version of this ontology was revised to apply the new composite identifier definition to BIC codes."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities.rdf version of this ontology was revised to leverage the new party identifier and replace hasDefinition with isDefinedIn to clarify intent."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities.rdf version of this ontology was revised to clean up dead links and address text formatting issues uncovered by hygiene testing."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities.rdf version of this ontology was revised to eliminate duplication with concepts in LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/ version of this ontology was modified to refine the concept of a credit union and generalize the definition of an underwriter."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities.rdf version of this ontology was revised to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities.rdf version of this ontology was revised to augment the representation of institutions based on their definitions in the law, to clarify and extend definitions related to non-bank financial institutions,and to add multilingual labels."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities.rdf version of this ontology was revised to enable merging business and functional business entity in BE."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/ version of this ontology was modified per the FIBO 2.0 RFC, including, but not limited to, the addition of trade settlement concepts and generalizing the concept of a credit union."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities.rdf version of this ontology was revised to clean up a few definitions to conform with ISO 704, to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary, and to add the concept of a data processing servicer."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"})