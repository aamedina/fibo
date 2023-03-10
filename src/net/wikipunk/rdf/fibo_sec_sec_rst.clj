(ns net.wikipunk.rdf.fibo-sec-sec-rst
  "This ontology defines the concepts related to restrictions on finanicial instruments, securities and listings."
  {:cmns-av/copyright ["Copyright (c) 2016-2023 EDM Council, Inc."
                       "Copyright (c) 2018-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions/",
   :dcterms/abstract
   "This ontology defines the concepts related to restrictions on finanicial instruments, securities and listings.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Contracts/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/LegalCapacity/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/Jurisdiction/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/OwnershipAndControl/OwnershipParties/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Organizations/FormalOrganizations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/SecuritiesListings/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/RegulatoryAgencies/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/AgentsAndPeople/People/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LegalPersons/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/LegalCore/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/SecuritiesRestrictions/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-ge-usj"
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/",
    "fibo-be-le-lp"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/",
    "fibo-be-oac-opty"
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties/",
    "fibo-fbc-fi-fi"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
    "fibo-fnd-agr-ctr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
    "fibo-fnd-dt-fd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
    "fibo-fnd-law-jur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/Jurisdiction/",
    "fibo-fnd-law-lcap"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/",
    "fibo-fnd-org-fm"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-sec-sec-lst"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings/",
    "fibo-sec-sec-rst"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions/",
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "lcc-lr" "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-sec-sec-rst",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions/",
   :rdfs/label "Securities Restrictions Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions.rdf version of the ontology was modified to fix spelling errors."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions.rdf version of the ontology was modified to reflect the change in representation of a listing."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions.rdf version of the ontology was modified to eliminate duplication of concepts in LCC."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions.rdf version of the ontology was modified to simplify the hierarchy with respect to regulatory requirements and eliminate deprecated elements."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions.rdf version of the ontology was modified to eliminate an unused ontology import and to augment the information associated with references needed to define depositary receipts."]})

(def BlueSkyLaw
  "securities regulation passed by various states, designed to protect investors against securities fraud by requiring sellers of new issues to register their offerings and provide financial details"
  {:cmns-av/explanatoryNote
   "This allows investors to base their judgments on trustworthy data.",
   :db/ident :fibo-sec-sec-rst/BlueSkyLaw,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions/",
   :rdfs/label "Blue-Sky law",
   :rdfs/subClassOf :fibo-sec-sec-rst/SecuritiesRegulation,
   :skos/definition
   "securities regulation passed by various states, designed to protect investors against securities fraud by requiring sellers of new issues to register their offerings and provide financial details"})

(def ContractualRestriction
  "contract terms setting out restrictions on either the holder or the issuer of the security, as specified in the terms of the instrument itself"
  {:db/ident :fibo-sec-sec-rst/ContractualRestriction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions/",
   :rdfs/label "contractual restriction",
   :rdfs/subClassOf [{:owl/allValuesFrom :fibo-fnd-agr-ctr/Contract,
                      :owl/onProperty    :fibo-fnd-rel-rel/isMandatedBy,
                      :rdf/type          :owl/Restriction}
                     :fibo-sec-sec-rst/SecuritiesRestriction
                     :fibo-fnd-agr-ctr/ContractualCommitment],
   :skos/definition
   "contract terms setting out restrictions on either the holder or the issuer of the security, as specified in the terms of the instrument itself"})

(def IndividualInvestor
  "investor that is a person, rather than an organization, who may or may not be considered a qualified investor from a legal perspective"
  {:db/ident :fibo-sec-sec-rst/IndividualInvestor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions/",
   :rdfs/label "individual investor",
   :rdfs/subClassOf [{:owl/allValuesFrom
                      :fibo-be-le-lp/LegallyCompetentNaturalPerson,
                      :owl/onProperty :fibo-fnd-rel-rel/hasIdentity,
                      :rdf/type :owl/Restriction}
                     :fibo-be-oac-opty/Investor],
   :skos/definition
   "investor that is a person, rather than an organization, who may or may not be considered a qualified investor from a legal perspective"})

(def InstitutionalInvestor
  "investor that is an organization that trades large volumes of securities"
  {:cmns-av/explanatoryNote
   "Typically more than 70 percent of the daily trading on the New York Stock Exchange is conducted on behalf of institutional investors.",
   :db/ident :fibo-sec-sec-rst/InstitutionalInvestor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions/",
   :rdfs/label "institutional investor",
   :rdfs/subClassOf [{:owl/allValuesFrom :fibo-fnd-org-fm/FormalOrganization,
                      :owl/onProperty    :fibo-fnd-rel-rel/hasIdentity,
                      :rdf/type          :owl/Restriction}
                     :fibo-be-oac-opty/Investor],
   :skos/definition
   "investor that is an organization that trades large volumes of securities",
   :skos/example
   "Example institutional investors include banks, insurance companies, mutual funds, pension funds, and other similar large funds."})

(def InvestorsDomicileRestriction
  "legal holding restriction that specifies where holders of a security may be domiciled"
  {:db/ident :fibo-sec-sec-rst/InvestorsDomicileRestriction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions/",
   :rdfs/label "investors' domicile restriction",
   :rdfs/subClassOf :fibo-sec-sec-rst/LegalHoldingRestriction,
   :skos/definition
   "legal holding restriction that specifies where holders of a security may be domiciled"})

(def LegalHoldingRestriction
  "security restriction applicable to holding the security"
  {:db/ident :fibo-sec-sec-rst/LegalHoldingRestriction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions/",
   :rdfs/label "legal holding restriction",
   :rdfs/subClassOf :fibo-sec-sec-rst/SecuritiesRestriction,
   :skos/definition "security restriction applicable to holding the security"})

(def QualifiedInvestorRestriction
  "legal holding restriction that defines the concept of a qualified investor for a given purpose and specifies that only such qualified investors may hold the security"
  {:cmns-av/explanatoryNote
   "If a holding period is not defined, then the period for which the restriction applies is indefinite.",
   :db/ident :fibo-sec-sec-rst/QualifiedInvestorRestriction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions/",
   :rdfs/label "qualified investor restriction",
   :rdfs/subClassOf [{:owl/allValuesFrom :fibo-fnd-dt-fd/DatePeriod,
                      :owl/onProperty    :fibo-sec-sec-rst/hasHoldingPeriod,
                      :rdf/type          :owl/Restriction}
                     :fibo-sec-sec-rst/LegalHoldingRestriction],
   :skos/definition
   "legal holding restriction that defines the concept of a qualified investor for a given purpose and specifies that only such qualified investors may hold the security"})

(def RegulationS
  "securities regulation defining an exemption through which corporations can issue unregistered securities to qualified foreign investors and foreign institutions"
  {:cmns-av/explanatoryNote
   "Regulation S covers rules governing offers and sales made outside the United States without registration under the Securities Act of 1933. Created in 1990, this regulation was intended to encourage foreign investors to purchase American stocks in order to increase the liquidity of American markets.",
   :db/ident :fibo-sec-sec-rst/RegulationS,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions/",
   :rdfs/label "Regulation S",
   :rdfs/seeAlso ["https://www.sec.gov/divisions/corpfin/ecfrlinks.shtml"
                  "https://www.law.cornell.edu/cfr/text/17/230.902"],
   :rdfs/subClassOf [:fibo-sec-sec-rst/SecuritiesRegulation
                     :fibo-sec-sec-rst/InvestorsDomicileRestriction
                     :fibo-sec-sec-rst/QualifiedInvestorRestriction
                     {:owl/hasValue   :fibo-be-ge-usj/UnitedStatesJurisdiction,
                      :owl/onProperty :fibo-fnd-law-jur/appliesIn,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "securities regulation defining an exemption through which corporations can issue unregistered securities to qualified foreign investors and foreign institutions"})

(def Restriction144A
  "Securities & Exchange Commission rule that establishes specific criteria for determining whether a person is not engaged in a distribution and creates a safe harbor from the Section 2(a)(11) definition of 'underwriter'; section A modifies holding period requirements on privately placed securities to permit qualified institutional buyers to trade these positions among themselves"
  {:db/ident :fibo-sec-sec-rst/Restriction144A,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions/",
   :rdfs/label "Restriction 144-A",
   :rdfs/seeAlso ["https://www.sec.gov/divisions/corpfin/ecfrlinks.shtml"
                  "https://www.law.cornell.edu/cfr/text/17/230.144"],
   :rdfs/subClassOf [{:owl/hasValue   :fibo-be-ge-usj/UnitedStatesJurisdiction,
                      :owl/onProperty :fibo-fnd-law-jur/appliesIn,
                      :rdf/type       :owl/Restriction}
                     {:owl/allValuesFrom :fibo-fnd-dt-fd/DatePeriod,
                      :owl/onProperty    :fibo-sec-sec-rst/hasHoldingPeriod,
                      :rdf/type          :owl/Restriction}
                     :fibo-sec-sec-rst/LegalHoldingRestriction],
   :skos/definition
   "Securities & Exchange Commission rule that establishes specific criteria for determining whether a person is not engaged in a distribution and creates a safe harbor from the Section 2(a)(11) definition of 'underwriter'; section A modifies holding period requirements on privately placed securities to permit qualified institutional buyers to trade these positions among themselves"})

(def SecuritiesRegulation
  "regulation codified in law specific to securities and investments"
  {:db/ident :fibo-sec-sec-rst/SecuritiesRegulation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions/",
   :rdfs/label "securities regulation",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/isConferredBy,
                      :owl/someValuesFrom :fibo-fnd-law-jur/StatuteLaw,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom
                      :fibo-sec-sec-rst/SecuritiesRestriction,
                      :owl/onProperty :fibo-fnd-rel-rel/defines,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-law-lcap/Regulation],
   :skos/definition
   "regulation codified in law specific to securities and investments"})

(def SecuritiesRestriction
  "legal obligation that is applicable to a financial instrument or listing as mandated in a law or by contract"
  {:db/ident :fibo-sec-sec-rst/SecuritiesRestriction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions/",
   :rdfs/label "securities restriction",
   :rdfs/subClassOf
   [{:owl/allValuesFrom {:owl/unionOf [:fibo-fnd-law-jur/StatuteLaw
                                       :fibo-sec-sec-rst/SecuritiesRegulation
                                       :fibo-fnd-agr-ctr/Contract],
                         :rdf/type    :owl/Class},
     :owl/onProperty    :fibo-fnd-rel-rel/isMandatedBy,
     :rdf/type          :owl/Restriction}
    {:owl/allValuesFrom {:owl/unionOf [:fibo-fbc-fi-fi/FinancialInstrument
                                       :fibo-sec-sec-lst/Listing],
                         :rdf/type    :owl/Class},
     :owl/onProperty    :fibo-fnd-rel-rel/appliesTo,
     :rdf/type          :owl/Restriction}
    :fibo-fnd-law-lcap/LegalObligation],
   :skos/definition
   "legal obligation that is applicable to a financial instrument or listing as mandated in a law or by contract"})

(def TradingRestriction
  "restriction that limits trading in some manner, typically summarized on term sheets or in other documentation, including but not limited to restrictions on day trading"
  {:db/ident :fibo-sec-sec-rst/TradingRestriction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions/",
   :rdfs/label "trading restriction",
   :rdfs/subClassOf :fibo-sec-sec-rst/SecuritiesRestriction,
   :skos/definition
   "restriction that limits trading in some manner, typically summarized on term sheets or in other documentation, including but not limited to restrictions on day trading"})

(def hasHoldingPeriod
  "identifies a holding period applicable to some financial asset"
  {:db/ident :fibo-sec-sec-rst/hasHoldingPeriod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions/",
   :rdfs/label "has holding period",
   :rdfs/range :fibo-fnd-dt-fd/DatePeriod,
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasDatePeriod,
   :skos/definition
   "identifies a holding period applicable to some financial asset"})

(def hasRestriction
  "identifies a restriction applicable to a given financial instrument or listing"
  {:db/ident :fibo-sec-sec-rst/hasRestriction,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions/",
   :rdfs/label "has restriction",
   :rdfs/range :fibo-sec-sec-rst/SecuritiesRestriction,
   :rdfs/subPropertyOf :lcc-lr/has,
   :skos/definition
   "identifies a restriction applicable to a given financial instrument or listing"})

(def isNotClearedIn
  "identifies a country subdivision, such as a US state or territory, where an issue is NOT cleared under Blue Sky Restrictions"
  {:db/ident :fibo-sec-sec-rst/isNotClearedIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-sec-rst/BlueSkyLaw,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions/",
   :rdfs/label "is not cleared in",
   :rdfs/range :lcc-cr/GeographicRegion,
   :skos/definition
   "identifies a country subdivision, such as a US state or territory, where an issue is NOT cleared under Blue Sky Restrictions",
   :skos/editorialNote
   "This requires review -- shouldn't this be a ternary relation between the regulation, the security and the location?"})

(def ^{:private true} FinancialInstrument
  {:db/ident        :fibo-fbc-fi-fi/FinancialInstrument,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf {:owl/minQualifiedCardinality 0,
                     :owl/onClass    :fibo-sec-sec-rst/SecuritiesRestriction,
                     :owl/onProperty :fibo-sec-sec-rst/hasRestriction,
                     :rdf/type       :owl/Restriction}})

(def ^{:private true} Listing
  {:db/ident        :fibo-sec-sec-lst/Listing,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf {:owl/minQualifiedCardinality 0,
                     :owl/onClass    :fibo-sec-sec-rst/SecuritiesRestriction,
                     :owl/onProperty :fibo-sec-sec-rst/hasRestriction,
                     :rdf/type       :owl/Restriction}})