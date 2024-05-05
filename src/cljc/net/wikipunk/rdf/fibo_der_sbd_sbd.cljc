(ns net.wikipunk.rdf.fibo-der-sbd-sbd
  {:cmns-av/copyright
   #{"Copyright (c) 2016-2024 EDM Council, Inc."
     "Copyright (c) 2016-2024 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/",
   :dcterms/abstract
   "This ontology defines common concepts for derivatives based on securities as their underliers, including those based on indices or baskets of these assets.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-rlcmp" "https://www.omg.org/spec/Commons/RolesAndCompositions/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-der-sbd-sbd"
    "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/",
    "fibo-fbc-dae-dbt"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
    "fibo-fbc-fi-fi"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-ind-mkt-bas"
    "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/BasketIndices/",
    "fibo-sec-dbt-dbti"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/",
    "fibo-sec-eq-eq"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
    "fibo-sec-sec-bsk"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Baskets/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/DebtAndEquities/Debt/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/IND/Indicators/Indicators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/ProductsAndServices/FinancialProductsAndServices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Equities/EquityInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/DER/DerivativesContracts/DerivativesBasics/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/IND/MarketIndices/BasketIndices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Securities/Baskets/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Debt/DebtInstruments/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/DER/DerivativesContracts/Swaps/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-der-sbd-sbd",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/",
   :rdfs/label "Security-Based Derivatives Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives.rdf version of this ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary, to move the definition of an underlier and the related property, has underlier, to financial instruments so that these concepts are also available for use in relation to pool-backed securities."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives.rdf version of this ontology was modified to augment the concept of a basket of debt instruments with several variants (SEC-181)."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/"})

(def BasketOfDebtInstruments
  {:db/ident :fibo-der-sbd-sbd/BasketOfDebtInstruments,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "basket of debt instruments"},
   :rdfs/subClassOf #{:fibo-sec-sec-bsk/BasketOfSecurities
                      {:owl/onProperty     :cmns-col/hasConstituent,
                       :owl/someValuesFrom {:owl/allValuesFrom
                                            :fibo-fbc-fi-fi/DebtInstrument,
                                            :owl/onProperty :cmns-col/comprises,
                                            :rdf/type :owl/Restriction},
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value "basket of securities whose constituents are debt instruments"}})

(def CapitalizedLeaseObligationDebtBasket
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "A capitalized lease obligation basket is increasingly broadly drafted to include indebtedness incurred to finance the purchase, improvement, repair, renewal etc. of property (including the purchase of stock of a person owning such property)."},
   :db/ident :fibo-der-sbd-sbd/CapitalizedLeaseObligationDebtBasket,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "capitalized lease obligation debt basket"},
   :rdfs/subClassOf #{:fibo-der-sbd-sbd/BasketOfDebtInstruments
                      {:owl/onProperty     :cmns-col/hasConstituent,
                       :owl/someValuesFrom {:owl/allValuesFrom
                                            :fibo-fbc-dae-dbt/Lease,
                                            :owl/onProperty :cmns-col/comprises,
                                            :rdf/type :owl/Restriction},
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "basket of debt instruments whose constituents are contracts entitling a renter the temporary use of an asset and, in accounting terms, has asset ownership characteristics"}})

(def ContributionDebtBasket
  {:cmns-av/explanatoryNote
   #{{:rdf/language "en",
      :rdf/value
      "A non-guarantor debt basket is often also permitted to be secured by assets of a subsidiary other than the issuer/borrower or guarantors."}
     {:rdf/language "en",
      :rdf/value
      "In U.S. law, a non-guarantor debt basket is a shared basket in an amount not to exceed the greater of $150,000,000 and 20% of Consolidated EBITDA for the most recently ended Test Period at any time outstanding that may be used for (A) the incurrence of certain Indebtedness by Restricted Subsidiaries that are not Loan Parties under Sections 6.01(a)(xii), 6.01(a)(xix) and 6.01(a)(xx) and (B) Secured Cash Management Obligations of any Restricted Subsidiary that is not a Loan Party."}},
   :db/ident :fibo-der-sbd-sbd/ContributionDebtBasket,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "contribution debt basket"},
   :rdfs/subClassOf :fibo-der-sbd-sbd/BasketOfDebtInstruments,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "basket of debt instruments that allows a company to incur an amount of indebtedness that is equal to (or in top tier sponsor transactions in the U.S., up to two times) the amount of equity contributed to the group"}})

(def CreditFacilityDebtBasket
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The credit facility debt basket consists of a number of credit facilities including revolving loans/line of credit, committed facilities, letters of credit and most retail credit accounts. The first port of call for issuers is the credit facility debt basket. In addition to the fixed dollar (or euro) amounts, credit facility debt baskets in senior secured notes and indentures typically provide for a grower component that is the greater of the fixed dollar/euro amount and a percentage of total assets, total tangible assets or EBITDA."},
   :db/ident :fibo-der-sbd-sbd/CreditFacilityDebtBasket,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "credit facility debt basket"},
   :rdfs/subClassOf #{:fibo-der-sbd-sbd/BasketOfDebtInstruments
                      {:owl/onProperty     :cmns-col/hasConstituent,
                       :owl/someValuesFrom {:owl/allValuesFrom
                                            :fibo-fbc-dae-dbt/CreditFacility,
                                            :owl/onProperty :cmns-col/comprises,
                                            :rdf/type :owl/Restriction},
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "basket of securities whose constituents are credit agreements that allow the borrower to periodically take out money over an extended period of time rather than reapplying for a loan every time they need funds"}})

(def DebtInstrumentDerivative
  {:db/ident :fibo-der-sbd-sbd/DebtInstrumentDerivative,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/"},
   :rdfs/label "debt instrument derivative",
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
      :owl/someValuesFrom {:owl/onProperty     :cmns-rlcmp/isPlayedBy,
                           :owl/someValuesFrom :fibo-der-sbd-sbd/DebtObservable,
                           :rdf/type           :owl/Restriction},
      :rdf/type           :owl/Restriction}
     :fibo-der-sbd-sbd/SecurityBasedDerivative},
   :skos/definition
   "security-based derivative whose underlier is a debt observable"})

(def DebtObservable
  {:db/ident :fibo-der-sbd-sbd/DebtObservable,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/"},
   :rdfs/label "debt observable",
   :rdfs/subClassOf #{:fibo-der-sbd-sbd/SecurityUnderlier
                      {:owl/onProperty :cmns-rlcmp/isPlayedBy,
                       :owl/someValuesFrom
                       {:owl/unionOf [:fibo-der-sbd-sbd/BasketOfDebtInstruments
                                      :fibo-sec-dbt-dbti/TradableDebtInstrument
                                      :fibo-ind-mkt-bas/CreditIndex
                                      :fibo-ind-mkt-bas/BasketOfCreditRisks],
                        :rdf/type    :owl/Class},
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "security underlier that is debt-based, such as individual debt instruments, credit indices, and custom baskets of debt assets"})

(def EquityDerivative
  {:db/ident :fibo-der-sbd-sbd/EquityDerivative,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/"},
   :rdfs/label "equity derivative",
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
                       :owl/someValuesFrom :fibo-der-sbd-sbd/EquityObservable,
                       :rdf/type           :owl/Restriction}
                      :fibo-der-sbd-sbd/SecurityBasedDerivative},
   :skos/definition
   "security-based derivative whose underlier is an equity observable"})

(def EquityObservable
  {:db/ident :fibo-der-sbd-sbd/EquityObservable,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/"},
   :rdfs/label "equity observable",
   :rdfs/subClassOf #{:fibo-der-sbd-sbd/SecurityUnderlier
                      {:owl/onProperty     :cmns-rlcmp/isPlayedBy,
                       :owl/someValuesFrom {:owl/unionOf
                                            [:fibo-ind-mkt-bas/BasketOfEquities
                                             :fibo-sec-eq-eq/ListedShare
                                             :fibo-ind-mkt-bas/EquityIndex],
                                            :rdf/type :owl/Class},
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "security underlier that is equity based, such as individual shares, equity indices, and custom basket of equity assets"})

(def GeneralDebtBasket
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The general debt basket has increasingly become a basket for additional secured debt. Lenders providing funding to companies need to carefully consider whether any previous debt incurred by the company using this basket has reduced the available capacity."},
   :db/ident :fibo-der-sbd-sbd/GeneralDebtBasket,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "general debt basket"},
   :rdfs/subClassOf :fibo-der-sbd-sbd/BasketOfDebtInstruments,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "basket of debt instruments that provides additional capacity for potential funding and does not require the proceeds to be used for any particular purpose"}})

(def IncrementalFacilityDebtBasket
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The incremental debt basket is available to borrowers and guarantors only; it cannot be used by non-guarantor entities to raise indebtedness. The size of the incremental debt basket varies depending on the size and creditworthiness of the credit group. The principle of a basket consists of allowing the borrower, up to a maximum determined amount, to make restricted payments, disposals or investments, or take on incremental debt. Commonly, a basket is expressed as subject to restrictions based on a fixed ('hard cap') amount (e.g., may not exceed EUR 5,000,000)."},
   :cmns-av/synonym {:rdf/language "en",
                     :rdf/value    "builder basket"},
   :db/ident :fibo-der-sbd-sbd/IncrementalFacilityDebtBasket,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "incremental facility debt basket"},
   :rdfs/subClassOf :fibo-der-sbd-sbd/CreditFacilityDebtBasket,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "basket of credit facilities whose constituents are extensible, allowing companies to borrow an additional term loan or revolving credit facility (or increase the commitments applicable thereto) under the same credit agreement subject to certain parameters"}})

(def LocalLinesOfCreditDebtBasket
  {:db/ident :fibo-der-sbd-sbd/LocalLinesOfCreditDebtBasket,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "local lines of credit debt basket"},
   :rdfs/subClassOf #{:fibo-der-sbd-sbd/BasketOfDebtInstruments
                      {:owl/onProperty :cmns-col/hasConstituent,
                       :owl/someValuesFrom
                       {:owl/allValuesFrom
                        :fibo-fbc-dae-dbt/RevolvingLineOfCredit,
                        :owl/onProperty :cmns-col/comprises,
                        :rdf/type :owl/Restriction},
                       :rdf/type :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "basket of debt instruments that may be relevant for companies with international operations, often permitting debt to be incurred by a non-guarantor restricted subsidiary"}})

(def Non-GuarantorDebtBasket
  {:cmns-av/explanatoryNote
   #{{:rdf/language "en",
      :rdf/value
      "A non-guarantor debt basket is often also permitted to be secured by assets of a subsidiary other than the issuer/borrower or guarantors."}
     {:rdf/language "en",
      :rdf/value
      "In U.S. law, a non-guarantor debt basket is a shared basket in an amount not to exceed the greater of $150,000,000 and 20% of Consolidated EBITDA for the most recently ended Test Period at any time outstanding that may be used for (A) the incurrence of certain Indebtedness by Restricted Subsidiaries that are not Loan Parties under Sections 6.01(a)(xii), 6.01(a)(xix) and 6.01(a)(xx) and (B) Secured Cash Management Obligations of any Restricted Subsidiary that is not a Loan Party."}},
   :db/ident :fibo-der-sbd-sbd/Non-GuarantorDebtBasket,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "non-guarantor debt basket"},
   :rdfs/subClassOf :fibo-der-sbd-sbd/BasketOfDebtInstruments,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "basket of debt instruments that include a provision allowing certain subsidiaries within a corporate group, which are not part of the loan guarantee, to incur a specified amount of indebtedness"}})

(def RatioDebtBasket
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The ratio basket provides different ratio tests depending on the type of indebtedness being incurred (for example, first lien leverage ratio in respect of first lien indebtedness, senior secured leverage ratio in respect of indebtedness secured by a junior lien and a total net leverage ratio or interest coverage ratio in respect of unsecured indebtedness). A ratio basket would typically allow the borrower to incur debt secured on a senior secured basis subject to a maximum senior secured leverage ratio and unsecured debt subject to a maximum total leverage ratio."},
   :db/ident :fibo-der-sbd-sbd/RatioDebtBasket,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ratio debt basket"},
   :rdfs/subClassOf :fibo-der-sbd-sbd/BasketOfDebtInstruments,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "basket of debt instruments whose constituents are specified based on a leverage ratio based on total debt rather than only secured debt"}})

(def SecurityBasedDerivative
  {:db/ident :fibo-der-sbd-sbd/SecurityBasedDerivative,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "security-based derivative"},
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fbc-fi-fi/hasUnderlier,
                       :owl/someValuesFrom :fibo-der-sbd-sbd/SecurityUnderlier,
                       :rdf/type           :owl/Restriction}
                      :fibo-fbc-fi-fi/DerivativeInstrument},
   :skos/definition
   "derivative instrument whose underlier is based on a security, including collections of securities and indices based on securities"})

(def SecurityUnderlier
  {:db/ident :fibo-der-sbd-sbd/SecurityUnderlier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/"},
   :rdfs/label "security underlier",
   :rdfs/subClassOf #{:fibo-fbc-fi-fi/Underlier
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    {:owl/unionOf
                                        [:fibo-sec-sec-bsk/BasketOfSecurities
                                         :fibo-fbc-fi-fi/Security
                                         :fibo-ind-mkt-bas/ReferenceIndex],
                                        :rdf/type :owl/Class},
                       :owl/onProperty :cmns-rlcmp/isPlayedBy,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "underlier consisting of security-based assets, such as baskets of securities, individual securities, reference indices, and combinations thereof"})

(def urn:uuid:4b11f4a6-1458-5ce4-97bf-a291cd9ee867
  {:cmns-av/copyright
   #{"Copyright (c) 2016-2024 EDM Council, Inc."
     "Copyright (c) 2016-2024 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology defines common concepts for derivatives based on securities as their underliers, including those based on indices or baskets of these assets.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/DebtAndEquities/Debt/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/IND/Indicators/Indicators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/ProductsAndServices/FinancialProductsAndServices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Equities/EquityInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/DER/DerivativesContracts/DerivativesBasics/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/IND/MarketIndices/BasketIndices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Securities/Baskets/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Debt/DebtInstruments/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/DER/DerivativesContracts/Swaps/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Security-Based Derivatives Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives.rdf version of this ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary, to move the definition of an underlier and the related property, has underlier, to financial instruments so that these concepts are also available for use in relation to pool-backed securities."
     "The https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives.rdf version of this ontology was modified to augment the concept of a basket of debt instruments with several variants (SEC-181)."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/"})