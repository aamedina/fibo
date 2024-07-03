(ns net.wikipunk.rdf.fibo-sec-sec-rst
  {:cmns-av/copyright
   #{"Copyright (c) 2016-2024 EDM Council, Inc."
     "Copyright (c) 2018-2024 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Securities/SecuritiesRestrictions/",
   :dcterms/abstract
   "This ontology defines the concepts related to restrictions on finanicial instruments, securities and listings.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-doc" "https://www.omg.org/spec/Commons/Documents/",
    "cmns-dsg" "https://www.omg.org/spec/Commons/Designators/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "cmns-rlcmp" "https://www.omg.org/spec/Commons/RolesAndCompositions/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-le-lp"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/",
    "fibo-be-oac-opty"
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties/",
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
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/OwnershipAndControl/OwnershipParties/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Documents/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Securities/SecuritiesListings/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Law/Jurisdiction/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Law/LegalCapacity/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Agreements/Contracts/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Securities/SecuritiesRestrictions/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-sec-sec-rst",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions/",
   :rdfs/label "Securities Restrictions Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions.rdf version of the ontology was modified to fix spelling errors."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions.rdf version of the ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions.rdf version of the ontology was modified to eliminate an unused ontology import and to augment the information associated with references needed to define depositary receipts."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions.rdf version of the ontology was modified to simplify the hierarchy with respect to regulatory requirements and eliminate deprecated elements."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions.rdf version of this ontology was revised to reuse the representation of institutions based on their definitions in the law."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions.rdf version of the ontology was modified to eliminate deprecations that are more than 6 months old."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions.rdf version of the ontology was modified to eliminate duplication of concepts in LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions.rdf version of this ontology was modified to move the property, 'is conferred on' to the Legal Capacity ontology and to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions.rdf version of the ontology was modified to add a definition for institutional investor and move jurisdiction-specific definitions to new ontologies for those jurisdictions (SEC-113)."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions.rdf version of the ontology was modified to reflect the change in representation of a listing."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions/"})

(def BlueSkyLaw
  {:db/ident :fibo-sec-sec-rst/BlueSkyLaw,
   :owl/deprecated true,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions/"}})

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
                       :owl/onProperty :cmns-rlcmp/isPlayedBy,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "investor that is a person, rather than an organization, who may or may not be considered a qualified investor from a legal perspective"})

(def InstitutionalInvestor
  {:cmns-av/explanatoryNote
   "Institutional investors typically buy, sell, and manage stocks, bonds, and other investment securities on behalf of its clients, customers, members, or shareholders. These include endowment funds, commercial banks, mutual funds, hedge funds, pension funds, and insurance companies. Institutional investors are able to invest in riskier securities and ventures than average investors because they are more sophisticated with respect to their investment methodologies.",
   :db/ident :fibo-sec-sec-rst/InstitutionalInvestor,
   :owl/disjointWith :fibo-sec-sec-rst/IndividualInvestor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions/"},
   :rdfs/label "institutional investor",
   :rdfs/subClassOf #{:fibo-be-oac-opty/Investor
                      {:owl/allValuesFrom :fibo-be-le-lp/LegalEntity,
                       :owl/onProperty    :cmns-rlcmp/isPlayedBy,
                       :rdf/type          :owl/Restriction}},
   :skos/definition
   "investor that pools money to purchase securities, real property, and other investment assets or originates loans"})

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
  {:db/ident :fibo-sec-sec-rst/RegulationS,
   :owl/deprecated true,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions/"}})

(def Restriction144A
  {:db/ident :fibo-sec-sec-rst/Restriction144A,
   :owl/deprecated true,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions/"}})

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
   :rdfs/subPropertyOf :cmns-doc/specifies,
   :skos/definition
   "identifies a restriction applicable to a given financial instrument or listing"})

(def isNotClearedIn
  {:db/ident :fibo-sec-sec-rst/isNotClearedIn,
   :owl/deprecated true,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions/"}})

(def urn:uuid:1749a594-20df-56a0-90d6-73d858d96525
  {:cmns-av/copyright
   #{"Copyright (c) 2016-2024 EDM Council, Inc."
     "Copyright (c) 2018-2024 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology defines the concepts related to restrictions on finanicial instruments, securities and listings.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/OwnershipAndControl/OwnershipParties/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Documents/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Securities/SecuritiesListings/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Law/Jurisdiction/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Law/LegalCapacity/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Agreements/Contracts/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Securities/SecuritiesRestrictions/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Securities Restrictions Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions.rdf version of the ontology was modified to fix spelling errors."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions.rdf version of the ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions.rdf version of the ontology was modified to eliminate an unused ontology import and to augment the information associated with references needed to define depositary receipts."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions.rdf version of the ontology was modified to simplify the hierarchy with respect to regulatory requirements and eliminate deprecated elements."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions.rdf version of this ontology was revised to reuse the representation of institutions based on their definitions in the law."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions.rdf version of the ontology was modified to eliminate deprecations that are more than 6 months old."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions.rdf version of the ontology was modified to eliminate duplication of concepts in LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions.rdf version of this ontology was modified to move the property, 'is conferred on' to the Legal Capacity ontology and to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions.rdf version of the ontology was modified to add a definition for institutional investor and move jurisdiction-specific definitions to new ontologies for those jurisdictions (SEC-113)."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions.rdf version of the ontology was modified to reflect the change in representation of a listing."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions/"})