(ns net.wikipunk.rdf.fibo-sec-sec-eurst
  {:cmns-av/copyright #{"Copyright (c) 2024 EDM Council, Inc."
                        "Copyright (c) 2024 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/SEC/Securities/EuropeanSecurities/EUSecuritiesRestrictions/",
   :dcterms/abstract
   "This ontology defines the concepts related to restrictions issued by the European Securities and Markets Authority (ESMA) and other EU regulatory agencies on finanicial instruments, securities and listings.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fbc-fi-fi"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-sec-sec-cls"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesClassification/",
    "fibo-sec-sec-eurst"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/EuropeanSecurities/EUSecuritiesRestrictions/",
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
      "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/SEC/Securities/SecuritiesRestrictions/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/SEC/Securities/SecuritiesClassification/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/SEC/Equities/EquityInstruments/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/SEC/Securities/EuropeanJurisdiction/EUSecuritiesRestrictions/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-sec-sec-eurst",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/EuropeanSecurities/EUSecuritiesRestrictions/",
   :rdfs/label "EU Securities Restrictions Ontology",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/EuropeanSecurities/EUSecuritiesRestrictions/"})

(def AdditionalTier1Capital
  {:cmns-av/abbreviation "AT1",
   :cmns-av/adaptedFrom
   {:xsd/anyURI "https://www.financestrategists.com/banking/basel-iii/"},
   :cmns-av/explanatoryNote
   "Additional Tier 1 (AT1) capital provides an additional conservation buffer of a specified percentage.",
   :db/ident :fibo-sec-sec-eurst/AdditionalTier1Capital,
   :rdf/type #{:fibo-sec-sec-eurst/BaselIIIDesignation :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/EuropeanSecurities/EUSecuritiesRestrictions/"},
   :rdfs/label "additional tier 1 capital",
   :skos/definition
   "additional subordinated debt instruments that can absorb losses"})

(def BaselIIIDesignation
  {:cmns-av/adaptedFrom #{{:xsd/anyURI "https://www.bis.org/bcbs/basel3.htm"}
                          {:xsd/anyURI "https://www.bis.org/bcbs/index.htm"}},
   :cmns-av/explanatoryNote
   #{"Basel III is an international regulatory accord designed to improve the regulation, supervision, and risk management of the banking sector. It was developed in response to the global financial crisis of 2007-2008. A consortium of central banks from 28 countries devised Basel III in 2009, mainly to ensure major banks could survive another upheaval. The regulations include minimum capital, leverage, and liquidity requirements."
     "Per Basel III, Tier 1 capital, or core capital, equity shares and retained earnings, is preferred. Tier 2 capital, or supplementary capital, is also usable. Possible values include Tier 1, Additional Tier 1, Tier 2, Not Subject to Regulations, and Not Provided."},
   :db/ident :fibo-sec-sec-eurst/BaselIIIDesignation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/EuropeanSecurities/EUSecuritiesRestrictions/"},
   :rdfs/label "Basel III Designation",
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-cls/classifies,
                       :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                       :rdf/type           :owl/Restriction}
                      {:owl/hasValue   :lcc-cr/GeographicRegion,
                       :owl/onProperty :cmns-cxtdsg/isApplicableIn,
                       :rdf/type       :owl/Restriction}
                      :fibo-sec-sec-cls/FinancialInstrumentClassifier},
   :skos/definition
   "European Union wide securities designation, defined by the Basel Committee on Banking Supervision (BCBS), that classifies securities based on the quality of capital underlying the instrument"})

(def CommonEquityTier1
  {:cmns-av/abbreviation "CET1",
   :cmns-av/adaptedFrom {:xsd/anyURI "https://www.bis.org/press/p981027.htm"},
   :cmns-av/explanatoryNote
   #{"CET1 capital is the highest quality capital and consists primarily of common shares and retained earnings."
     "Positive components of tier 1 regulatory capital are common shareholders' funds, i.e. common stock and disclosed reserves or retained earnings, are the key element of capital. Common shareholders' funds allow a bank to absorb losses on an ongoing basis and are permanently available for this purpose. Further, this element of capital best allows banks to conserve resources when they are under stress because it provides a bank with full discretion as to the amount and timing of distributions. Consequently, common shareholders' funds are the basis on which most market judgements of capital adequacy are made. The voting rights attached to common stock also provide an important source of market discipline over a bank's management. For these reasons, voting common shareholders' equity and the disclosed reserves or retained earnings that accrue to the shareholders' benefit should be the predominant form of a bank's Tier 1 capital.\n\t\tPotential regulatory adjustments (e.g., fees, commissions, valuation adjustments) are defined in paragraphs 66-90 of the Basel III rules text."},
   :db/ident :fibo-sec-sec-eurst/CommonEquityTier1,
   :rdf/type #{:fibo-sec-sec-eurst/BaselIIIDesignation :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/EuropeanSecurities/EUSecuritiesRestrictions/"},
   :rdfs/label "common equity tier 1",
   :rdfs/seeAlso
   #{{:xsd/anyURI
      "https://www.investopedia.com/ask/answers/062515/what-minimum-capital-adequacy-ratio-must-be-attained-under-basel-iii.asp"}
     {:xsd/anyURI "https://www.investopedia.com/terms/t/tier1capital.asp"}},
   :skos/definition
   "core capital held in an institution's reserves, used to fund business activities for clients"})

(def EURegulation236-2012
  {:cmns-av/adaptedFrom
   #{{:xsd/anyURI
      "https://www.esma.europa.eu/esmas-activities/markets-and-infrastructure/short-selling"}
     {:xsd/anyURI
      "https://eur-lex.europa.eu/legal-content/EN/TXT/?uri=CELEX%3A32012R0236"}
     {:xsd/anyURI
      "https://eur-lex.europa.eu/LexUriServ/LexUriServ.do?uri=OJ:L:2012:086:0001:0024:en:PDF"}},
   :cmns-av/explanatoryNote
   #{"Regulation (EU) No 236/2012, also known as the Short Selling Regulation, was adopted by the European Parliament and the Council on March 14, 2012. The EU Regulation on Short Selling and certain aspects of credit default swaps (SSR) aims to increase the transparency of short positions held by investors in certain EU securities, to reduce settlement risks and other risks linked with naked short selling, and to ensure that Member States have clear powers to intervene in exceptional situations to reduce systemic risks and risks to financial stability and market confidence."
     "In the European Union, short selling regulations are primarily governed by the European Securities and Markets Authority (ESMA) under the EU Short Selling Regulation (SSR), which was implemented in 2012. The key aspects of short selling restrictions in the EU include: (1) Temporary Short Selling Bans: ESMA or national competent authorities (NCAs) can impose temporary short selling bans on specific stocks or all stocks in response to significant market declines or to prevent disorderly markets. These bans can last up to three months but can be renewed if necessary. (2) Restrictions During Market Stress: Similar to the SEC's alternative uptick rule, the EU SSR allows for restrictions when a significant price drop occurs. If a stock drops by 10% or more within a single day, NCAs can impose a temporary short selling ban on that stock for the remainder of the day. (3) Notification and Disclosure: Market participants are required to notify NCAs if their net short positions in a company reach or exceed 0.2% of the company's issued share capital. Additional disclosures are required at each 0.1% increment above the initial threshold. (4) Prohibition of Naked Short Selling: The regulation prohibits naked short selling, requiring that short sellers must have either borrowed the securities or have an arrangement in place to borrow them before the sale is executed. These regulations are designed to enhance market transparency, reduce risks associated with short selling, and prevent market abuse during periods of significant market stress. Specific details and updates can be found on the ESMA website or through the relevant NCA for each EU member state."},
   :cmns-av/synonym "Short Selling Regulation",
   :db/ident :fibo-sec-sec-eurst/EURegulation236-2012,
   :rdf/type #{:fibo-sec-sec-rst/SecuritiesRegulation :owl/NamedIndividual
               :fibo-sec-sec-rst/TradingRestriction},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/EuropeanSecurities/EUSecuritiesRestrictions/"},
   :rdfs/label "EU Regulation 236/2012",
   :skos/definition
   "securities regulation on short selling and certain aspects of credit default swaps"})

(def MiFIDRegulatedSecurity
  {:cmns-av/explanatoryNote
   "A MiFID requlated security is one that is traded on a MiFID regulated market and for which certain additional reporting requirements apply. Markets in Financial Instruments Directive (MiFID), which is a European regulation, issued by the European Securities and Markets Authority (ESMA), that aims to increase transparency across the European Union's financial markets and standardize regulatory disclosures required for firms operating within the EU.",
   :db/ident :fibo-sec-sec-eurst/MiFIDRegulatedSecurity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/EuropeanSecurities/EUSecuritiesRestrictions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "MiFID regulated security"},
   :rdfs/subClassOf
   #{:fibo-fbc-fi-fi/Security
     {:owl/hasValue   {:xsd/boolean true},
      :owl/onProperty :fibo-sec-sec-eurst/isMiFIDReportingRequired,
      :rdf/type       :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onDataRange :xsd/decimal,
      :owl/onProperty  :fibo-sec-sec-eurst/hasUpperLimitOnFloatingShares,
      :rdf/type        :owl/Restriction}},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "security for which MiFID reporting is required"}})

(def Tier1Capital
  {:cmns-av/adaptedFrom
   #{{:xsd/anyURI "https://www.financestrategists.com/banking/basel-iii/"}
     {:xsd/anyURI
      "https://www.investopedia.com/terms/t/tier1capital.asp#toc-what-is-tier-1-capital"}},
   :db/ident :fibo-sec-sec-eurst/Tier1Capital,
   :rdf/type #{:fibo-sec-sec-eurst/BaselIIIDesignation :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/EuropeanSecurities/EUSecuritiesRestrictions/"},
   :rdfs/label "tier 1 capital",
   :skos/definition
   "bank's equity capital and disclosed reserves, used to measure the bank's capital adequacy, consisting of common equity capital (CET1) and additional capital instruments (AT1)"})

(def Tier2Capital
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.highradius.com/resources/Blog/basel-iii-compliance-and-capital-requirements/"},
   :db/ident :fibo-sec-sec-eurst/Tier2Capital,
   :rdf/type #{:fibo-sec-sec-eurst/BaselIIIDesignation :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/EuropeanSecurities/EUSecuritiesRestrictions/"},
   :rdfs/label "tier 2 capital",
   :skos/definition
   "supplementary loss-absorbing capital capacity that is considered less secure than Tier 1 capital"})

(def hasUpperLimitOnFloatingShares
  {:db/ident :fibo-sec-sec-eurst/hasUpperLimitOnFloatingShares,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/EuropeanSecurities/EUSecuritiesRestrictions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has upper limit on floating shares"},
   :rdfs/range :xsd/decimal,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasAmount,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates the upper limit on the number of free float shares to be reported, if applicable"}})

(def isMiFIDReportingRequired
  {:cmns-av/explanatoryNote
   "This indicator specifies whether the security is eligible for trade reporting within the Markets in Financial Instruments Directive (MiFID) zone.",
   :db/ident :fibo-sec-sec-eurst/isMiFIDReportingRequired,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-fbc-fi-fi/Security,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/EuropeanSecurities/EUSecuritiesRestrictions/"},
   :rdfs/label "is MiFID reporting required",
   :rdfs/range :xsd/boolean,
   :skos/definition
   "indicates whether reporting on the security is required by the Markets in Financial Instruments Directive (MiFID)"})

(def urn:uuid:eb45abed-7b7a-531c-9e98-f6c4990cfdd7
  {:cmns-av/copyright #{"Copyright (c) 2024 EDM Council, Inc."
                        "Copyright (c) 2024 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology defines the concepts related to restrictions issued by the European Securities and Markets Authority (ESMA) and other EU regulatory agencies on finanicial instruments, securities and listings.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/SEC/Securities/SecuritiesRestrictions/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/SEC/Securities/SecuritiesClassification/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/SEC/Equities/EquityInstruments/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/SEC/Securities/EuropeanJurisdiction/EUSecuritiesRestrictions/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "EU Securities Restrictions Ontology",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/EuropeanSecurities/EUSecuritiesRestrictions/"})