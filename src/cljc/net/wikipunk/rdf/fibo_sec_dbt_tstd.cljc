(ns net.wikipunk.rdf.fibo-sec-dbt-tstd
  {:cmns-av/copyright
   #{"Copyright (c) 2018-2024 EDM Council, Inc."
     "Copyright (c) 2018-2024 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/SEC/Debt/TradedShortTermDebt/",
   :dcterms/abstract
   "This ontology defines a number of basic, traded short-term debt instruments, many of which are considered money market instruments that may be freely traded.",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "cmns-pts" "https://www.omg.org/spec/Commons/PartiesAndSituations/",
    "cmns-rlcmp" "https://www.omg.org/spec/Commons/RolesAndCompositions/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fbc-dae-gty"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Guaranty/",
    "fibo-fbc-fct-fse"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/",
    "fibo-fbc-pas-caa"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
    "fibo-fnd-agr-agr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreements/",
    "fibo-fnd-agr-ctr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
    "fibo-fnd-pas-psch"
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-sec-dbt-dbti"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/",
    "fibo-sec-dbt-tstd"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/TradedShortTermDebt/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/DebtAndEquities/Guaranty/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/FinancialServicesEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/SEC/Debt/DebtInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Agreements/Agreements/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/ProductsAndServices/PaymentsAndSchedules/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/ProductsAndServices/ClientsAndAccounts/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/SEC/Debt/TradedShortTermDebt/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-sec-dbt-tstd",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/TradedShortTermDebt/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Traded Short-Term Debt Ontology"},
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/TradedShortTermDebt.rdf version of this ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/TradedShortTermDebt.rdf version of this ontology was modified to clarify the definition of bill of exchange."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/TradedShortTermDebt.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/TradedShortTermDebt.rdf version of this ontology was modified to remove the subclass relationship with respect to fixed income from bankers' acceptance, make bill of exchange a subclass of money market instrument and fix spelling errors."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/TradedShortTermDebt.rdf version of this ontology was modified to eliminate a circular definition."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/TradedShortTermDebt.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/TradedShortTermDebt/"})

(def BankersAcceptance
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Considered negotiable instruments with features of a time draft, bankers' acceptances are created by the drawer and provide the bearer with the right to the amount noted on the face of the acceptance on the specified date. Unlike traditional checks, bankers' acceptances function based on the creditworthiness of the banking institution instead of the individual or business acting as the drawer. Additionally, the drawer must provide the funds necessary to support the bankers' acceptance, eliminating the risk associated with insufficient funds on the part of the drawer."},
   :db/ident :fibo-sec-dbt-tstd/BankersAcceptance,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/TradedShortTermDebt/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "bankers' acceptance"},
   :rdfs/subClassOf
   #{:fibo-sec-dbt-tstd/BillOfExchange
     {:owl/hasValue   :fibo-sec-dbt-dbti/AtADiscount,
      :owl/onProperty :fibo-sec-dbt-dbti/hasRelativePriceAtIssue,
      :rdf/type       :owl/Restriction}
     {:owl/onProperty     :fibo-fbc-dae-gty/hasGuarantor,
      :owl/someValuesFrom :fibo-fbc-fct-fse/Bank,
      :rdf/type           :owl/Restriction}
     {:owl/hasValue   :fibo-sec-dbt-dbti/ParValue,
      :owl/onProperty :fibo-sec-dbt-dbti/hasRelativePriceAtMaturity,
      :rdf/type       :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "short-term debt instrument that is guaranteed and paid by a bank and used as a relatively safe form of payment for large transactions"}})

(def BillOfExchange
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "A bill of exchange is a written agreement between two parties - the buyer and the seller - used primarily in international trade. The buyer or seller typically employs a bank to issue the bill of exchange due to the risks involved with international transactions. Bills of exchange can be transferred by endorsement, much like a check. They can also require the buyer to pay a third party - a bank - in the event that the buyer fails to make good on his agreement with the seller."},
   :cmns-av/synonym #{{:rdf/language "en",
                       :rdf/value    "bank draft"}
                      {:rdf/language "en",
                       :rdf/value    "draft"}},
   :db/ident :fibo-sec-dbt-tstd/BillOfExchange,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/TradedShortTermDebt/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "bill of exchange"},
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-pts/hasPartyRole,
                       :owl/someValuesFrom :fibo-sec-dbt-tstd/Drawer,
                       :rdf/type           :owl/Restriction}
                      :fibo-sec-dbt-tstd/MoneyMarketInstrument
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-fbc-fct-fse/FinancialInstitution,
                       :owl/onProperty :fibo-fnd-rel-rel/isIssuedBy,
                       :rdf/type       :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-fnd-pas-psch/Payee,
                       :owl/onProperty :cmns-pts/hasPartyRole,
                       :rdf/type       :owl/Restriction}
                      {:owl/onProperty     :cmns-pts/hasPartyRole,
                       :owl/someValuesFrom :fibo-sec-dbt-tstd/Drawee,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "short-term negotiable financial instrument consisting of an order in writing addressed by one person (the seller of goods) to another (the buyer), requiring the latter to pay a fixed amount of money on demand (a sight draft) or on a predetermined date (a time draft)"}})

(def CommercialPaper
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Commercial paper has a very-short to short maturity period (usually, 2 to 30 days, and rarely more than 270 days)."},
   :db/ident :fibo-sec-dbt-tstd/CommercialPaper,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/TradedShortTermDebt/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "commercial paper"},
   :rdfs/subClassOf
   #{:fibo-sec-dbt-tstd/MoneyMarketInstrument
     {:owl/hasValue   :fibo-sec-dbt-dbti/AtADiscount,
      :owl/onProperty :fibo-sec-dbt-dbti/hasRelativePriceAtIssue,
      :rdf/type       :owl/Restriction}
     {:owl/hasValue   :fibo-sec-dbt-dbti/ParValue,
      :owl/onProperty :fibo-sec-dbt-dbti/hasRelativePriceAtMaturity,
      :rdf/type       :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "an unsecured short-term debt instrument typically issued by a bank, corporation, or foreign government to obtain funds to meet short-term debt obligations, such as accounts receivable, inventories, or payroll, backed only by an issuing bank or company promise to pay the face amount on the maturity date specified on the note"}})

(def Drawee
  {:db/ident :fibo-sec-dbt-tstd/Drawee,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/TradedShortTermDebt/"},
   :rdfs/label "drawee",
   :rdfs/subClassOf #{:fibo-fnd-pas-psch/Payer
                      {:owl/onProperty     :cmns-rlcmp/isPlayedBy,
                       :owl/someValuesFrom {:owl/onProperty
                                            :cmns-pts/isAPartyTo,
                                            :owl/someValuesFrom
                                            :fibo-sec-dbt-tstd/BillOfExchange,
                                            :rdf/type :owl/Restriction},
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "party that is required to pay the amount stated on the bill of exchange to the payee"})

(def Drawer
  {:db/ident :fibo-sec-dbt-tstd/Drawer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/TradedShortTermDebt/"},
   :rdfs/label "drawer",
   :rdfs/subClassOf
   #{{:owl/onProperty     :cmns-rlcmp/isPlayedBy,
      :owl/someValuesFrom {:owl/onProperty :cmns-pts/isAPartyTo,
                           :owl/someValuesFrom
                           :fibo-sec-dbt-tstd/BillOfExchange,
                           :rdf/type :owl/Restriction},
      :rdf/type           :owl/Restriction} :fibo-fnd-agr-agr/Obligee},
   :skos/definition
   "party that requires a drawee to pay either a third party or themselves with respect to a bill of exchange"})

(def EurodollarDeposit
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "A bank in Japan or Singapore may accept dollar deposits, but these are still called Eurodollar deposits. The market also includes other currencies, so there are Eurosterling, Euroyen, Euroswiss, etc. Eurocurrency is the general term for any currency deposited in bank branches outside countries where it is the national currency."},
   :db/ident :fibo-sec-dbt-tstd/EurodollarDeposit,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/TradedShortTermDebt/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "eurodollar deposit"},
   :rdfs/subClassOf :fibo-fbc-pas-caa/CertificateOfDeposit,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "a certificate of deposit with a fixed interest rate issued in U.S. dollars outside the jurisdiction of the Federal Reserve, held at banks outside of the United States, including branches of U.S. banks located outside of the U.S."}})

(def MoneyMarketInstrument
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "https://stats.oecd.org/glossary/detail.asp?ID=6073"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "These instruments usually are traded at a discount in organized markets; the discount is dependent upon the interest rate and the time remaining to maturity. Included are such instruments as treasury bills, commercial and financial paper, bankers' acceptances, negotiable certificates of deposit (with original maturities of one year or less), and short-term notes issued under note issuance facilities."},
   :db/ident :fibo-sec-dbt-tstd/MoneyMarketInstrument,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/TradedShortTermDebt/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "money market instrument"},
   :rdfs/subClassOf :fibo-sec-dbt-dbti/FixedIncomeSecurity,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "a short-term debt security that gives the owner the unconditional right to receive a stated, fixed sum of money on a specified date"}})

(def RepurchaseAgreement
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "REPO"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Most repos are overnight transactions, with the sale taking place one day and being reversed the next day. Long-term repos - called term repos - can extend for a month or more. Usually, repos are for a fixed period of time, but open-ended deals are also possible. Reverse repo is a term used to describe the opposite side of a repo transaction. The party who sells and later repurchases a security is said to perform a repo. The other party - who purchases and later resells the security - is said to perform a reverse repo. While a repo functions like the sale and subsequent repurchase of a security, but the legal reality and the economic effect is that of a secured loan. This is a loan as the original owner retains the rights to the cashflows of the underlying security. Economically, the party purchasing the security makes funds available to the seller and holds the security as collateral. If the repurchased security pays a dividend, coupon or partial redemptions during the repo, the funds are returned to the original owner. The difference between the sale and repurchase prices paid for the security represent interest on the loan. Indeed, repos are quoted as interest rates. A repo always pays interest at maturity, i.e. there are no periodic interest payments."},
   :db/ident :fibo-sec-dbt-tstd/RepurchaseAgreement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/TradedShortTermDebt/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "repurchase agreement"},
   :rdfs/subClassOf #{:fibo-sec-dbt-tstd/MoneyMarketInstrument
                      :fibo-fnd-agr-ctr/MutualContractualAgreement
                      {:owl/maxQualifiedCardinality 1,
                       :owl/onClass    :cmns-dt/Duration,
                       :owl/onProperty :cmns-dt/hasDuration,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "agreement between two parties whereby one party lends the other a security at a specified price with a commitment to take the security back at a later date for another specified price"}})

(def urn:uuid:d06b0f5d-a137-5ee7-9e59-f587a91de489
  {:cmns-av/copyright
   #{"Copyright (c) 2018-2024 EDM Council, Inc."
     "Copyright (c) 2018-2024 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology defines a number of basic, traded short-term debt instruments, many of which are considered money market instruments that may be freely traded.",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/DebtAndEquities/Guaranty/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/FinancialServicesEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/SEC/Debt/DebtInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Agreements/Agreements/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/ProductsAndServices/PaymentsAndSchedules/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/ProductsAndServices/ClientsAndAccounts/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/SEC/Debt/TradedShortTermDebt/"},
   :rdf/type :owl/Ontology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Traded Short-Term Debt Ontology"},
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/TradedShortTermDebt.rdf version of this ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/TradedShortTermDebt.rdf version of this ontology was modified to clarify the definition of bill of exchange."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/TradedShortTermDebt.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/TradedShortTermDebt.rdf version of this ontology was modified to remove the subclass relationship with respect to fixed income from bankers' acceptance, make bill of exchange a subclass of money market instrument and fix spelling errors."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/TradedShortTermDebt.rdf version of this ontology was modified to eliminate a circular definition."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/TradedShortTermDebt.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/TradedShortTermDebt/"})