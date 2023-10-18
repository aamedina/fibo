(ns net.wikipunk.rdf.fibo-sec-sec-rst
  {:cmns-av/copyright #{"Copyright (c) 2018-2023 Object Management Group, Inc."
                        "Copyright (c) 2016-2023 EDM Council, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Securities/SecuritiesRestrictions/",
   :dcterms/abstract
   "This ontology defines the concepts related to restrictions on finanicial instruments, securities and listings.",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-dsg" "https://www.omg.org/spec/Commons/Designators/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-ge-usj"
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/",
    "fibo-be-le-lp"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/",
    "fibo-be-oac-opty"
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties/",
    "fibo-fbc-fct-fse"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/",
    "fibo-fbc-fct-ra"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegistrationAuthorities/",
    "fibo-fbc-fi-fi"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
    "fibo-fnd-agr-ctr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
    "fibo-fnd-law-jur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/Jurisdiction/",
    "fibo-fnd-law-lcap"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-sec-sec-lst"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings/",
    "fibo-sec-sec-rst"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions/",
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/RegistrationAuthorities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/RegulatoryAgencies/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Securities/SecuritiesListings/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Law/Jurisdiction/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/FinancialServicesEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/OwnershipAndControl/OwnershipParties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/AgentsAndPeople/People/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Law/LegalCapacity/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Law/LegalCore/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Organizations/FormalOrganizations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/LegalPersons/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Securities/SecuritiesRestrictions/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-sec-sec-rst",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions/",
   :rdfs/label "Securities Restrictions Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions.rdf version of the ontology was modified to fix spelling errors."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions.rdf version of the ontology was modified to eliminate an unused ontology import and to augment the information associated with references needed to define depositary receipts."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions.rdf version of the ontology was modified to simplify the hierarchy with respect to regulatory requirements and eliminate deprecated elements."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions.rdf version of this ontology was revised to reuse the representation of institutions based on their definitions in the law."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions.rdf version of the ontology was modified to eliminate duplication of concepts in LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions.rdf version of this ontology was modified to move the property, 'is conferred on' to the Legal Capacity ontology and to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions.rdf version of the ontology was modified to reflect the change in representation of a listing."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions/"})

(def BlueSkyLaw
  {:cmns-av/explanatoryNote
   "This allows investors to base their judgments on trustworthy data.",
   :db/ident :fibo-sec-sec-rst/BlueSkyLaw,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions/"},
   :rdfs/label "Blue-Sky law",
   :rdfs/subClassOf :fibo-sec-sec-rst/SecuritiesRegulation,
   :skos/definition
   "securities regulation passed by various states, designed to protect investors against securities fraud by requiring sellers of new issues to register their offerings and provide financial details"})

(def ContractualRestriction
  {:db/ident :fibo-sec-sec-rst/ContractualRestriction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions/"},
   :rdfs/label "contractual restriction",
   :rdfs/subClassOf #{:fibo-fnd-agr-ctr/ContractualCommitment
                      {:owl/allValuesFrom :fibo-fnd-agr-ctr/Contract,
                       :owl/onProperty    :fibo-fnd-rel-rel/isMandatedBy,
                       :rdf/type          :owl/Restriction}
                      :fibo-sec-sec-rst/SecuritiesRestriction},
   :skos/definition
   "contract terms setting out restrictions on either the holder or the issuer of the security, as specified in the terms of the instrument itself"})

(def IndividualInvestor
  {:db/ident :fibo-sec-sec-rst/IndividualInvestor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions/"},
   :rdfs/label "individual investor",
   :rdfs/subClassOf #{:fibo-be-oac-opty/Investor
                      {:owl/allValuesFrom
                       :fibo-be-le-lp/LegallyCompetentNaturalPerson,
                       :owl/onProperty :fibo-fnd-rel-rel/hasIdentity,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "investor that is a person, rather than an organization, who may or may not be considered a qualified investor from a legal perspective"})

(def InstitutionalInvestor
  {:db/ident :fibo-sec-sec-rst/InstitutionalInvestor,
   :owl/deprecated true,
   :owl/equivalentClass :fibo-fbc-fct-fse/ContractualSavingsInstitution,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions/"}})

(def InvestorsDomicileRestriction
  {:db/ident :fibo-sec-sec-rst/InvestorsDomicileRestriction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions/"},
   :rdfs/label "investors' domicile restriction",
   :rdfs/subClassOf :fibo-sec-sec-rst/LegalHoldingRestriction,
   :skos/definition
   "legal holding restriction that specifies where holders of a security may be domiciled"})

(def LegalHoldingRestriction
  {:db/ident :fibo-sec-sec-rst/LegalHoldingRestriction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions/"},
   :rdfs/label "legal holding restriction",
   :rdfs/subClassOf :fibo-sec-sec-rst/SecuritiesRestriction,
   :skos/definition "security restriction applicable to holding the security"})

(def QualifiedInvestorRestriction
  {:cmns-av/explanatoryNote
   "If a holding period is not defined, then the period for which the restriction applies is indefinite.",
   :db/ident :fibo-sec-sec-rst/QualifiedInvestorRestriction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions/"},
   :rdfs/label "qualified investor restriction",
   :rdfs/subClassOf #{:fibo-sec-sec-rst/LegalHoldingRestriction
                      {:owl/allValuesFrom :cmns-dt/DatePeriod,
                       :owl/onProperty    :fibo-sec-sec-rst/hasHoldingPeriod,
                       :rdf/type          :owl/Restriction}},
   :skos/definition
   "legal holding restriction that defines the concept of a qualified investor for a given purpose and specifies that only such qualified investors may hold the security"})

(def RegulationS
  {:cmns-av/explanatoryNote
   "Regulation S covers rules governing offers and sales made outside the United States without registration under the Securities Act of 1933. Created in 1990, this regulation was intended to encourage foreign investors to purchase American stocks in order to increase the liquidity of American markets.",
   :db/ident :fibo-sec-sec-rst/RegulationS,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions/"},
   :rdfs/label "Regulation S",
   :rdfs/seeAlso
   #{{:xsd/anyURI "https://www.sec.gov/divisions/corpfin/ecfrlinks.shtml"}
     {:xsd/anyURI "https://www.law.cornell.edu/cfr/text/17/230.902"}},
   :rdfs/subClassOf #{{:owl/hasValue   :fibo-be-ge-usj/UnitedStatesJurisdiction,
                       :owl/onProperty :cmns-cxtdsg/isApplicableIn,
                       :rdf/type       :owl/Restriction}
                      :fibo-sec-sec-rst/QualifiedInvestorRestriction
                      :fibo-sec-sec-rst/SecuritiesRegulation
                      :fibo-sec-sec-rst/InvestorsDomicileRestriction},
   :skos/definition
   "securities regulation defining an exemption through which corporations can issue unregistered securities to qualified foreign investors and foreign institutions"})

(def Restriction144A
  {:db/ident :fibo-sec-sec-rst/Restriction144A,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions/"},
   :rdfs/label "Restriction 144-A",
   :rdfs/seeAlso
   #{{:xsd/anyURI "https://www.sec.gov/divisions/corpfin/ecfrlinks.shtml"}
     {:xsd/anyURI "https://www.law.cornell.edu/cfr/text/17/230.144"}},
   :rdfs/subClassOf #{{:owl/hasValue   :fibo-be-ge-usj/UnitedStatesJurisdiction,
                       :owl/onProperty :cmns-cxtdsg/isApplicableIn,
                       :rdf/type       :owl/Restriction}
                      :fibo-sec-sec-rst/LegalHoldingRestriction
                      {:owl/allValuesFrom :cmns-dt/DatePeriod,
                       :owl/onProperty    :fibo-sec-sec-rst/hasHoldingPeriod,
                       :rdf/type          :owl/Restriction}},
   :skos/definition
   "Securities & Exchange Commission rule that establishes specific criteria for determining whether a person is not engaged in a distribution and creates a safe harbor from the Section 2(a)(11) definition of 'underwriter'; section A modifies holding period requirements on privately placed securities to permit qualified institutional buyers to trade these positions among themselves"})

(def SecuritiesRegulation
  {:db/ident :fibo-sec-sec-rst/SecuritiesRegulation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions/"},
   :rdfs/label "securities regulation",
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-fnd-rel-rel/isConferredBy,
      :owl/someValuesFrom :fibo-fnd-law-jur/StatuteLaw,
      :rdf/type           :owl/Restriction} :fibo-fnd-law-lcap/Regulation
     {:owl/allValuesFrom :fibo-sec-sec-rst/SecuritiesRestriction,
      :owl/onProperty    :cmns-dsg/defines,
      :rdf/type          :owl/Restriction}},
   :skos/definition
   "regulation codified in law specific to securities and investments"})

(def SecuritiesRestriction
  {:db/ident :fibo-sec-sec-rst/SecuritiesRestriction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions/"},
   :rdfs/label "securities restriction",
   :rdfs/subClassOf
   #{:fibo-fnd-law-lcap/LegalObligation
     {:owl/allValuesFrom {:owl/unionOf [:fibo-fnd-law-jur/StatuteLaw
                                        :fibo-sec-sec-rst/SecuritiesRegulation
                                        :fibo-fnd-agr-ctr/Contract],
                          :rdf/type    :owl/Class},
      :owl/onProperty    :fibo-fnd-rel-rel/isMandatedBy,
      :rdf/type          :owl/Restriction}
     {:owl/allValuesFrom {:owl/unionOf [:fibo-fbc-fi-fi/FinancialInstrument
                                        :fibo-sec-sec-lst/Listing],
                          :rdf/type    :owl/Class},
      :owl/onProperty    :cmns-cxtdsg/appliesTo,
      :rdf/type          :owl/Restriction}},
   :skos/definition
   "legal obligation that is applicable to a financial instrument or listing as mandated in a law or by contract"})

(def TradingRestriction
  {:db/ident :fibo-sec-sec-rst/TradingRestriction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions/"},
   :rdfs/label "trading restriction",
   :rdfs/subClassOf :fibo-sec-sec-rst/SecuritiesRestriction,
   :skos/definition
   "restriction that limits trading in some manner, typically summarized on term sheets or in other documentation, including but not limited to restrictions on day trading"})

(def hasHoldingPeriod
  {:db/ident :fibo-sec-sec-rst/hasHoldingPeriod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions/"},
   :rdfs/label "has holding period",
   :rdfs/range :cmns-dt/DatePeriod,
   :rdfs/subPropertyOf :cmns-dt/hasDatePeriod,
   :skos/definition
   "identifies a holding period applicable to some financial asset"})

(def hasRestriction
  {:db/ident :fibo-sec-sec-rst/hasRestriction,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions/"},
   :rdfs/label "has restriction",
   :rdfs/range :fibo-sec-sec-rst/SecuritiesRestriction,
   :rdfs/subPropertyOf :fibo-fbc-fct-ra/specifies,
   :skos/definition
   "identifies a restriction applicable to a given financial instrument or listing"})

(def isNotClearedIn
  {:db/ident :fibo-sec-sec-rst/isNotClearedIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-sec-rst/BlueSkyLaw,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions/"},
   :rdfs/label "is not cleared in",
   :rdfs/range :lcc-cr/GeographicRegion,
   :skos/definition
   "identifies a country subdivision, such as a US state or territory, where an issue is NOT cleared under Blue Sky Restrictions",
   :skos/editorialNote
   "This requires review -- shouldn't this be a ternary relation between the regulation, the security and the location?"})

(def urn:uuid:1749a594-20df-56a0-90d6-73d858d96525
  {:cmns-av/copyright #{"Copyright (c) 2018-2023 Object Management Group, Inc."
                        "Copyright (c) 2016-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology defines the concepts related to restrictions on finanicial instruments, securities and listings.",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/RegistrationAuthorities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/RegulatoryAgencies/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Securities/SecuritiesListings/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Law/Jurisdiction/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/FinancialServicesEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/OwnershipAndControl/OwnershipParties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/AgentsAndPeople/People/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Law/LegalCapacity/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Law/LegalCore/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Organizations/FormalOrganizations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/LegalPersons/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Securities/SecuritiesRestrictions/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Securities Restrictions Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions.rdf version of the ontology was modified to fix spelling errors."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions.rdf version of the ontology was modified to eliminate an unused ontology import and to augment the information associated with references needed to define depositary receipts."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions.rdf version of the ontology was modified to simplify the hierarchy with respect to regulatory requirements and eliminate deprecated elements."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions.rdf version of this ontology was revised to reuse the representation of institutions based on their definitions in the law."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions.rdf version of the ontology was modified to eliminate duplication of concepts in LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions.rdf version of this ontology was modified to move the property, 'is conferred on' to the Legal Capacity ontology and to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions.rdf version of the ontology was modified to reflect the change in representation of a listing."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions/"})