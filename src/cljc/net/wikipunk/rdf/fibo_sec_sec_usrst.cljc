(ns net.wikipunk.rdf.fibo-sec-sec-usrst
  {:cmns-av/copyright #{"Copyright (c) 2024 EDM Council, Inc."
                        "Copyright (c) 2024 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/SEC/Securities/NorthAmericanSecurities/USSecuritiesRestrictions/",
   :dcterms/abstract
   "This ontology defines the concepts related to restrictions issued by the US Securities Exchange Commission and other US regulatory agencies on finanicial instruments, securities and listings.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-doc" "https://www.omg.org/spec/Commons/Documents/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-ge-usj"
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/",
    "fibo-fbc-fi-fi"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
    "fibo-fbc-pas-caa"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-sec-sec-lst"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings/",
    "fibo-sec-sec-rst"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions/",
    "fibo-sec-sec-usrst"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/NorthAmericanSecurities/USSecuritiesRestrictions/",
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/Documents/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/SEC/Securities/SecuritiesRestrictions/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/SEC/Securities/SecuritiesListings/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/ProductsAndServices/ClientsAndAccounts/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/SEC/Securities/NorthAmericanSecurities/USSecuritiesRestrictions/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-sec-sec-usrst",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/NorthAmericanSecurities/USSecuritiesRestrictions/",
   :rdfs/label "US Securities Restrictions Ontology",
   :skos/changeNote
   "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/NorthAmericanSecurities/USSecuritiesRestrictions/.rdf version of this ontology was revised to eliminate typos in a few annotations.",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/NorthAmericanSecurities/USSecuritiesRestrictions/"})

(def BlueSkyLaw
  {:cmns-av/explanatoryNote
   "This allows investors to base their judgments on trustworthy data.",
   :cmns-av/usageNote
   "Blue sky law is modeled as a class, rather than as a named individual, because there are numerous state-specific laws that qualify as blue sky laws that could be added to support state-specific definitions and other analyses.",
   :db/ident :fibo-sec-sec-usrst/BlueSkyLaw,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/NorthAmericanSecurities/USSecuritiesRestrictions/"},
   :rdfs/label "blue sky law",
   :rdfs/subClassOf #{{:owl/minQualifiedCardinality 0,
                       :owl/onClass    :lcc-cr/GeographicRegion,
                       :owl/onProperty :cmns-cxtdsg/isApplicableIn,
                       :rdf/type       :owl/Restriction}
                      :fibo-sec-sec-rst/SecuritiesRegulation},
   :skos/definition
   "state-level securities regulation, designed to protect investors against securities fraud that require issuers to be registered and to disclose details of their offerings"})

(def RegulationD
  {:cmns-av/adaptedFrom
   {:rdf/value
    "Regulation D is defined in the US Code of Federal Regulations (CFR) Title 17, Chapter II, Part 230, clauses 501-508. See https://www.ecfr.gov/current/title-17/chapter-II/part-230?toc=1 for the actual text of the regulation."},
   :cmns-av/explanatoryNote
   "Issuers must file what's known as a 'Form D' after they first sell their securities if they qualify for registration under Regulation D.",
   :cmns-cxtdsg/isApplicableIn :fibo-be-ge-usj/UnitedStatesJurisdiction,
   :db/ident :fibo-sec-sec-usrst/RegulationD,
   :rdf/type #{:fibo-sec-sec-rst/SecuritiesRegulation :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/NorthAmericanSecurities/USSecuritiesRestrictions/"},
   :rdfs/label "Regulation D",
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.sec.gov/divisions/corpfin/ecfrlinks"},
   :skos/definition
   "securities regulation defining an exemption through which corporations do not have to register their securities and usually do not have to file reports with the SEC"})

(def RegulationS
  {:cmns-av/adaptedFrom
   {:rdf/value
    "Regulation S is defined in the US Code of Federal Regulations (CFR) Title 17, Chapter II, Part 230, clauses 901-905. See https://www.ecfr.gov/current/title-17/chapter-II/part-230?toc=1 for the actual text of the regulation."},
   :cmns-av/explanatoryNote
   "Regulation S covers rules governing offers and sales made outside the United States without registration under the Securities Act of 1933. Created in 1990, this regulation was intended to encourage foreign investors to purchase American stocks in order to increase the liquidity of American markets.",
   :cmns-cxtdsg/isApplicableIn :fibo-be-ge-usj/UnitedStatesJurisdiction,
   :db/ident :fibo-sec-sec-usrst/RegulationS,
   :rdf/type #{:fibo-sec-sec-rst/QualifiedInvestorRestriction
               :fibo-sec-sec-rst/SecuritiesRegulation :owl/NamedIndividual
               :fibo-sec-sec-rst/InvestorsDomicileRestriction},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/NorthAmericanSecurities/USSecuritiesRestrictions/"},
   :rdfs/label "Regulation S",
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.sec.gov/divisions/corpfin/ecfrlinks"},
   :skos/definition
   "securities regulation defining an exemption through which corporations can issue unregistered securities to qualified foreign investors and foreign institutions"})

(def Rule144A
  {:cmns-av/adaptedFrom
   {:rdf/value
    "Rule 144A is defined in the US Code of Federal Regulations (CFR) Title 17, Chapter II, Part 230, clause 144A - Private resales of securities to institutions. See https://www.ecfr.gov/current/title-17/chapter-II/part-230?toc=1 for the actual text of the regulation."},
   :cmns-av/explanatoryNote
   #{"Rule 144 section A is a Securities & Exchange Commission rule that establishes specific criteria for determining whether a person is not engaged in a distribution and creates a safe harbor from the Section 2(a)(11) definition of 'underwriter'. It modifies holding period requirements on privately placed securities to permit qualified institutional buyers to trade these positions among themselves."
     "QIBs are institutional investors with at least $100 million invested in securities. Rule 144A provides an exemption from SEC registration for these resales."},
   :cmns-cxtdsg/isApplicableIn :fibo-be-ge-usj/UnitedStatesJurisdiction,
   :db/ident :fibo-sec-sec-usrst/Rule144A,
   :rdf/type #{:fibo-sec-sec-rst/LegalHoldingRestriction
               {:owl/allValuesFrom :cmns-dt/DatePeriod,
                :owl/onProperty    :fibo-sec-sec-rst/hasHoldingPeriod,
                :rdf/type          :owl/Restriction} :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/NorthAmericanSecurities/USSecuritiesRestrictions/"},
   :rdfs/label "Rule 144A",
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.sec.gov/divisions/corpfin/ecfrlinks"},
   :skos/definition
   "securities regulation that allows investors to resell privately placed securities to qualified institutional buyers (QIBs) under certain conditions"})

(def SECExemption3c7
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.sec.gov/divisions/investment/guidance/private-fund-adviser-resources"},
   :cmns-av/explanatoryNote
   "Funds that meet the requirements of exemption 3(c)(7) are not required to register with the SEC or provide ongoing disclosure. They are also exempt from issuing a prospectus that would outline investment positions. To qualify for the exemption, a private investment company must demonstrate that it has no plans of making an initial public offering (IPO), and its investors must be qualified purchasers. Qualified purchasers include individuals or family-owned businesses with at least $5 million in investments, trusts managed by qualified purchasers, and entities solely owned by qualified purchasers.",
   :cmns-cxtdsg/isApplicableIn :fibo-be-ge-usj/UnitedStatesJurisdiction,
   :db/ident :fibo-sec-sec-usrst/SECExemption3c7,
   :rdf/type #{:fibo-sec-sec-rst/SecuritiesRegulation :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/NorthAmericanSecurities/USSecuritiesRestrictions/"},
   :rdfs/label "SEC Exemption 3(c)(7)",
   :skos/definition
   "securities regulation that is a provision under the Investment Company Act of 1940 that allows certain privately offered funds to operate without registering with the SEC"})

(def SECRule15c3-3
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.finra.org/rules-guidance/guidance/interpretations-financial-operational-rules/sea-rule-15c3-3-and-related-interpretations"},
   :cmns-cxtdsg/isApplicableIn :fibo-be-ge-usj/UnitedStatesJurisdiction,
   :db/ident :fibo-sec-sec-usrst/SECRule15c3-3,
   :rdf/type #{:fibo-sec-sec-rst/SecuritiesRegulation :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/NorthAmericanSecurities/USSecuritiesRestrictions/"},
   :rdfs/label "SEC Rule 15c3-3",
   :skos/definition
   "securities regulation that applies to broker-dealers registered under section 15(b) of the Securities Exchange Act of 1934 (15 U.S.C. 78o(b)), or that are security-based swap dealers or major security-based swap participants under section 15F(b) of the Act (15 U.S.C. 78o-10(b)), requiring them to maintain reserve accounts to protect customer funds, segregate customer securities in custody accounts, and if a security sold long has not been delivered within 10 business days after the settlement date, requires them to either buy the customer in, or apply for and receive an extension from its designated examining authority"})

(def SECRule201
  {:cmns-av/adaptedFrom
   {:xsd/anyURI "https://www.sec.gov/divisions/marketreg/rule201faq.htm"},
   :cmns-av/explanatoryNote
   #{"The Securities and Exchange Commission (SEC) short sale alternative uptick rule (Rule 201) requires the establishment of a short sale-related circuit breaker in the event a security's price decreases by ten percent or more from the previous day's closing price. Once activated, the short sale restriction will remain in effect for the remainder of the day as well as the following day. Values are A - 'Flag in Effect/Activated', C - 'Flag Continued' and N - 'Flag Not in Effect'. If not given the default is 'N - Flag Not in Effect'. When a stock is triggered, traders can only execute short sales of the stock above the National Best Bid (NBB) price."
     "On February 26, 2010, the Commission adopted Rule 201 of Regulation SHO. Rule 201 restricts the price at which short sales may be effected when a stock has experienced significant downward price pressure. Rule 201 became effective on May 10, 2010. (Securities Exchange Act Release No. 61595 (Feb. 26, 2010), 75 FR 11232 (Mar. 10, 2010) ('Rule 201 Adopting Release')). Compliance with the new rule is required as of February 28, 2011. (Securities Exchange Act Release No. 63247 (Nov. 4, 2010), 75 FR 68702 (Nov. 9, 2010))."},
   :cmns-av/synonym "alternative uptick rule",
   :cmns-cxtdsg/isApplicableIn :fibo-be-ge-usj/UnitedStatesJurisdiction,
   :db/ident :fibo-sec-sec-usrst/SECRule201,
   :rdf/type #{:fibo-sec-sec-rst/SecuritiesRegulation :owl/NamedIndividual
               :fibo-sec-sec-rst/TradingRestriction},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/NorthAmericanSecurities/USSecuritiesRestrictions/"},
   :rdfs/label "SEC Rule 201",
   :skos/definition
   "securities regulation that is part of Regulation SHO that is a circuit breaker limiting short sales to prevent them from causing a security's price to drop further after a significant decline"})

(def TEFRACRule
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "https://www.lawinsider.com/dictionary/tefra-c-rules"},
   :cmns-av/explanatoryNote
   "TEFRA C is used only if all parties are comfortable that there is no intention to place any of the securities in the U.S. and that it is unlikely that there will be any interest in the U.S. in such securities.",
   :cmns-cxtdsg/isApplicableIn :fibo-be-ge-usj/UnitedStatesJurisdiction,
   :db/ident :fibo-sec-sec-usrst/TEFRACRule,
   :rdf/type #{:fibo-sec-sec-rst/SecuritiesRegulation :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/NorthAmericanSecurities/USSecuritiesRestrictions/"},
   :rdfs/label "TEFRA C rule",
   :skos/definition
   "securities regulation that is a U.S. Treasury Regulation section 1.163-5(c)(2)(i)(C), or any successor regulation, established under the Tax Equity and Fiscal Responsibility Act of 1982 (TEFRA), that relates to the classification of debt obligations as either 'bearer' or 'registered' for U.S. tax purposes and ensures that an issue of bearer debt satisfied 'reasonable arrangement' requirements"})

(def TEFRADRule
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.lexisnexis.co.uk/legal/guidance/us-regulation-of-debt-capital-markets-one-minute-guide"},
   :cmns-av/explanatoryNote
   "TEFRA D provides for a restricted period of 40 days from the closing date of the issue and requires that certification of non-U.S. beneficial ownership be obtained before definitive securities can be issued or interest paid to security holders.",
   :cmns-cxtdsg/isApplicableIn :fibo-be-ge-usj/UnitedStatesJurisdiction,
   :db/ident :fibo-sec-sec-usrst/TEFRADRule,
   :rdf/type #{:fibo-sec-sec-rst/SecuritiesRegulation :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/NorthAmericanSecurities/USSecuritiesRestrictions/"},
   :rdfs/label "TEFRA D rule",
   :skos/definition
   "securities regulation that is a U.S. Treasury Regulation section 1.163-5(c)(2)(i)(D), or any successor regulation, established under the Tax Equity and Fiscal Responsibility Act of 1982 (TEFRA), that relates to the classification of debt obligations as either 'bearer' or 'registered' for U.S. tax purposes, applies to most straightforward issues of bearer debt in the Euromarkets, and ensures that an issue of bearer debt satisfied 'reasonable arrangement' requirements"})

(def isEmployeeRetirementIncomeSecurityActConformant
  {:cmns-av/adaptedFrom
   {:rdf/value
    "U.S. Code Title 29, Chapter 18, Subchapter I, Section 1002 provides definitions related to employee benefit plans. Specifically, this section outlines the terms used in ERISA, including definitions for various types of plans such as employee welfare benefit plans, employee pension benefit plans, and others. See https://www.law.cornell.edu/uscode/text/29/1002."},
   :cmns-av/explanatoryNote
   "The Employee Retirement Income Security Act (ERISA) is a federal law that establishes standards for certain employer-sponsored retirement and health plans. It has undergone several changes since its initial enactment in 1974. ERISA aims to protect individuals participating in these plans by prohibiting fiduciaries from misusing funds and setting standards for participation, benefit accrual, vesting, and funding of retirement plans",
   :db/ident
   :fibo-sec-sec-usrst/isEmployeeRetirementIncomeSecurityActConformant,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain {:owl/unionOf [:fibo-fbc-fi-fi/FinancialInstrument
                               :fibo-sec-sec-lst/Listing],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/NorthAmericanSecurities/USSecuritiesRestrictions/"},
   :rdfs/label "is Employee Retirement Income Security Act conformant",
   :rdfs/range :xsd/boolean,
   :skos/definition
   "indicates whether the security conforms to the Employee Retirement Income Security Act (ERISA) of 1974, a federal outline for regulating employee benefit plans, including healthcare plans sponsored and/or insured by an employer"})

(def isFederalDepositInsuranceCorporationInsured
  {:cmns-av/explanatoryNote
   "FDIC coverage extends to Certificates of Deposit (CDs) and Money Market Accounts (MMAs) held at FDIC-insured institutions up to $250,000 per account.",
   :cmns-av/usageNote
   "Note that this property applies to the account rather than to the associated instrument that, if it exists, exemplifies the account.",
   :db/ident :fibo-sec-sec-usrst/isFederalDepositInsuranceCorporationInsured,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-fbc-pas-caa/NonTransactionDepositAccount,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/NorthAmericanSecurities/USSecuritiesRestrictions/"},
   :rdfs/label "is Federal Deposit Insurance Corporation insured",
   :rdfs/range :xsd/boolean,
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.fdic.gov/resources/deposit-insurance/"},
   :skos/definition
   "indicates whether the security is covered by Federal Deposit Insurance Corporation (FDIC) insurance"})

(def isSubjectToFederalReserveBoardRegulationT
  {:cmns-av/explanatoryNote
   "Federal Reserve Board (FRB) Regulation T governs the extension of credit by securities brokers and dealers in the United States. Its best-known function is the control of margin requirements for stocks bought on margin. Regulation T gives an investor a maximum of four business days to pay for securities purchased in a cash or margin account. If payment due exceeds $1,000 and is not received by the end of this time period, the broker-dealer must either liquidate the position or apply for and receive an extensionfrom its designated examining authority, such as FINRA.",
   :cmns-av/usageNote
   "Note that this property applies to the account, which may be a ledger account.",
   :db/ident :fibo-sec-sec-usrst/isSubjectToFederalReserveBoardRegulationT,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-fbc-pas-caa/Account,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/NorthAmericanSecurities/USSecuritiesRestrictions/"},
   :rdfs/label "is subject to Federal Reserve Board Regulation T",
   :rdfs/range :xsd/boolean,
   :rdfs/seeAlso
   {:xsd/anyURI "https://www.finra.org/filing-reporting/regulation-t-filings"},
   :skos/definition
   "indicates whether a given cash or margin account is subject to Federal Reserve Board (FRB) margin requirements"})

(def urn:uuid:ff5da77e-5df5-5cdc-805c-cc34a8c14916
  {:cmns-av/copyright #{"Copyright (c) 2024 EDM Council, Inc."
                        "Copyright (c) 2024 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology defines the concepts related to restrictions issued by the US Securities Exchange Commission and other US regulatory agencies on finanicial instruments, securities and listings.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/Documents/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/SEC/Securities/SecuritiesRestrictions/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/SEC/Securities/SecuritiesListings/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/ProductsAndServices/ClientsAndAccounts/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/SEC/Securities/NorthAmericanSecurities/USSecuritiesRestrictions/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "US Securities Restrictions Ontology",
   :skos/changeNote
   "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/NorthAmericanSecurities/USSecuritiesRestrictions/.rdf version of this ontology was revised to eliminate typos in a few annotations.",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/NorthAmericanSecurities/USSecuritiesRestrictions/"})