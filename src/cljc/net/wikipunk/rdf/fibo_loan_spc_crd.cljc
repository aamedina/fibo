(ns net.wikipunk.rdf.fibo-loan-spc-crd
  {:cmns-av/copyright #{"Copyright (c) 2020-2023 Object Management Group, Inc."
                        "Copyright (c) 2020-2023 EDM Council, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/LOAN/LoansSpecific/CardAccounts/",
   :dcterms/abstract
   "This ontology defines revolving credit account-related concepts that are specific to credit and debit cards. Note that it does not differentiate between consumer and commercial/corporate cards and is capable of representing either.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cds" "https://www.omg.org/spec/Commons/CodesAndCodeSets/",
    "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-dsg" "https://www.omg.org/spec/Commons/Designators/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fbc-dae-dbt"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
    "fibo-fbc-fi-fi"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
    "fibo-fbc-pas-caa"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
    "fibo-fbc-pas-fpas"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
    "fibo-fnd-agr-ctr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
    "fibo-fnd-arr-doc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/",
    "fibo-fnd-oac-own"
    "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Ownership/",
    "fibo-fnd-org-fm"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations/",
    "fibo-fnd-pas-pas"
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/",
    "fibo-fnd-plc-loc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Locations/",
    "fibo-fnd-pty-pty"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
    "fibo-fnd-pty-rl"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-loan-spc-cns"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/ConsumerLoans/",
    "fibo-loan-spc-crd"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/",
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/ProductsAndServices/ClientsAndAccounts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Parties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/DebtAndEquities/Debt/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/CodesAndCodeSets/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/LOAN/LoansSpecific/ConsumerLoans/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Places/Locations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/OwnershipAndControl/Ownership/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Roles/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Arrangements/Documents/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Organizations/FormalOrganizations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/ProductsAndServices/ProductsAndServices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/ProductsAndServices/FinancialProductsAndServices/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/LOAN/LoansSpecific/CardAccounts/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-loan-spc-crd",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/",
   :rdfs/label "Card Accounts Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts.rdf version of this ontology was modified to make consumer credit card agreement a subclass of unsecured consumer loan."
     "The https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts.rdf version of this ontology was modified to add a distinction between consumer and commercial credit card agreements."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"})

(def AmericanExpressNetwork
  {:db/ident :fibo-loan-spc-crd/AmericanExpressNetwork,
   :rdf/type #{:owl/NamedIndividual :fibo-loan-spc-crd/CreditCardNetwork},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "American Express network",
   :skos/definition
   "credit card network and card issuer that both issues credit cards and processes payments for cards bearing its logo, as well as offering cardholder benefits like travel insurance"})

(def CardAccount
  {:db/ident :fibo-loan-spc-crd/CardAccount,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "card account",
   :rdfs/subClassOf
   #{{:owl/onProperty     :cmns-dsg/isDefinedIn,
      :owl/someValuesFrom :fibo-loan-spc-crd/PaymentCardAgreement,
      :rdf/type           :owl/Restriction} :fibo-fbc-pas-caa/CustomerAccount
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-fbc-pas-caa/CustomerAccount,
      :owl/onProperty :fibo-fbc-pas-caa/isLinkedToAccount,
      :rdf/type       :owl/Restriction}
     {:owl/onProperty     :fibo-fbc-pas-caa/realizes,
      :owl/someValuesFrom :fibo-loan-spc-crd/CardProduct,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :cmns-dsg/isSignifiedBy,
      :owl/someValuesFrom :fibo-loan-spc-crd/PaymentCard,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-fbc-pas-caa/hasPrimaryAccountHolder,
      :owl/someValuesFrom :fibo-loan-spc-crd/Cardholder,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :cmns-id/isIdentifiedBy,
      :owl/someValuesFrom :fibo-loan-spc-crd/PrimaryCardAccountNumber,
      :rdf/type           :owl/Restriction}},
   :skos/definition
   "account whose terms and conditions are defined in a card agreement that is represented by a payment card"})

(def CardAuthenticationValue
  {:cmns-av/abbreviation "CAV",
   :cmns-av/adaptedFrom
   {:xsd/anyURI "https://www.pcisecuritystandards.org/pci_security/glossary"},
   :db/ident :fibo-loan-spc-crd/CardAuthenticationValue,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "card authentication value",
   :rdfs/subClassOf :fibo-loan-spc-crd/MagneticStripeVerificationCodeValue,
   :skos/definition
   "card verification value specifically for JCB payment cards"})

(def CardAuthenticationValue2
  {:cmns-av/adaptedFrom
   {:xsd/anyURI "https://www.pcisecuritystandards.org/pci_security/glossary"},
   :cmns-av/synonym "CAV2",
   :db/ident :fibo-loan-spc-crd/CardAuthenticationValue2,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "card authentication value 2",
   :rdfs/subClassOf :fibo-loan-spc-crd/ThreeDigitVerificationCodeValue,
   :skos/definition
   "card verification value specifically for JCB payment cards"})

(def CardExpirationDate
  {:db/ident :fibo-loan-spc-crd/CardExpirationDate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "card expiration date",
   :rdfs/subClassOf :cmns-dt/ExplicitDate,
   :skos/definition "date on which a given payment card expires"})

(def CardIdentificationNumber
  {:cmns-av/abbreviation "CID",
   :cmns-av/adaptedFrom
   {:xsd/anyURI "https://www.pcisecuritystandards.org/pci_security/glossary"},
   :db/ident :fibo-loan-spc-crd/CardIdentificationNumber,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "card identification number",
   :rdfs/subClassOf :fibo-loan-spc-crd/ThreeDigitVerificationCodeValue,
   :skos/definition
   "card verification value specifically for American Express and Discover payment cards"})

(def CardProduct
  {:db/ident :fibo-loan-spc-crd/CardProduct,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "card product",
   :rdfs/subClassOf #{:fibo-fbc-pas-fpas/FinancialProduct
                      {:owl/onClass    :lcc-cr/Country,
                       :owl/onProperty :fibo-fnd-plc-loc/hasCountry,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-loan-spc-crd/CreditCardNetwork,
                       :owl/onProperty :fibo-loan-spc-crd/hasCreditCardNetwork,
                       :rdf/type       :owl/Restriction}
                      {:owl/onClass    :fibo-fnd-acc-cur/Currency,
                       :owl/onProperty :fibo-loan-spc-crd/usesCurrency,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      {:owl/onProperty     :fibo-fbc-pas-caa/isRealizedBy,
                       :owl/someValuesFrom :fibo-loan-spc-crd/CardAccount,
                       :rdf/type           :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :lcc-cr/CountrySubdivision,
                       :owl/onProperty :fibo-fnd-plc-loc/hasSubdivision,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "financial product involving the issuance of credit, debit, or other payment cards"})

(def CardSecurityCode
  {:cmns-av/abbreviation "CSC",
   :cmns-av/adaptedFrom
   {:xsd/anyURI "https://www.pcisecuritystandards.org/pci_security/glossary"},
   :db/ident :fibo-loan-spc-crd/CardSecurityCode,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "card security code",
   :rdfs/subClassOf :fibo-loan-spc-crd/MagneticStripeVerificationCodeValue,
   :skos/definition
   "card verification value specifically for American Express payment cards"})

(def CardValidationCode
  {:cmns-av/abbreviation "PAN CVC",
   :cmns-av/adaptedFrom
   {:xsd/anyURI "https://www.pcisecuritystandards.org/pci_security/glossary"},
   :db/ident :fibo-loan-spc-crd/CardValidationCode,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "card validation code",
   :rdfs/subClassOf :fibo-loan-spc-crd/MagneticStripeVerificationCodeValue,
   :skos/definition
   "card verification code specifically for Mastercard payment cards"})

(def CardValidationCode2
  {:cmns-av/abbreviation "PAN CVC2",
   :cmns-av/adaptedFrom
   {:xsd/anyURI "https://www.pcisecuritystandards.org/pci_security/glossary"},
   :db/ident :fibo-loan-spc-crd/CardValidationCode2,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "card validation code 2",
   :rdfs/subClassOf :fibo-loan-spc-crd/ThreeDigitVerificationCodeValue,
   :skos/definition
   "card verification value specifically for Mastercard payment cards"})

(def CardVerificationCodeValue
  {:cmns-av/adaptedFrom
   {:xsd/anyURI "https://www.pcisecuritystandards.org/pci_security/glossary"},
   :db/ident :fibo-loan-spc-crd/CardVerificationCodeValue,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "card verification code or value",
   :rdfs/subClassOf #{{:owl/onDataRange :xsd/string,
                       :owl/onProperty  :fibo-fnd-rel-rel/hasTag,
                       :owl/qualifiedCardinality 1,
                       :rdf/type        :owl/Restriction} :cmns-cds/CodeElement
                      {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                       :owl/someValuesFrom :fibo-loan-spc-crd/PaymentCard,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "code that specifies either (1) magnetic-stripe data, or (2) printed security features that are used to protect data integrity and limit alteration, counterfeiting and fraud generally"})

(def CardVerificationValue
  {:cmns-av/abbreviation "CVV",
   :cmns-av/adaptedFrom
   {:xsd/anyURI "https://www.pcisecuritystandards.org/pci_security/glossary"},
   :db/ident :fibo-loan-spc-crd/CardVerificationValue,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "card verification value",
   :rdfs/subClassOf :fibo-loan-spc-crd/MagneticStripeVerificationCodeValue,
   :skos/definition
   "card verification value specifically for Visa and Discover payment cards"})

(def CardVerificationValue2
  {:cmns-av/adaptedFrom
   {:xsd/anyURI "https://www.pcisecuritystandards.org/pci_security/glossary"},
   :cmns-av/synonym "CVV2",
   :db/ident :fibo-loan-spc-crd/CardVerificationValue2,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "card verification value 2",
   :rdfs/subClassOf :fibo-loan-spc-crd/ThreeDigitVerificationCodeValue,
   :skos/definition
   "card verification value specifically for Visa payment cards"})

(def Cardholder
  {:cmns-av/adaptedFrom
   {:xsd/anyURI "https://www.pcisecuritystandards.org/pci_security/glossary"},
   :db/ident :fibo-loan-spc-crd/Cardholder,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "cardholder",
   :rdfs/subClassOf
   #{:fibo-fbc-pas-caa/CustomerAccountHolder
     {:owl/onProperty     :fibo-fnd-pty-rl/isPlayedBy,
      :owl/someValuesFrom {:owl/onProperty     :fibo-fnd-oac-own/owns,
                           :owl/someValuesFrom :fibo-loan-spc-crd/CardAccount,
                           :rdf/type           :owl/Restriction},
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-fnd-rel-rel/holds,
      :owl/someValuesFrom :fibo-loan-spc-crd/CardAccount,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-fnd-pty-rl/isPlayedBy,
      :owl/someValuesFrom {:owl/onProperty     :fibo-fnd-pty-pty/isAPartyTo,
                           :owl/someValuesFrom :fibo-loan-spc-crd/CardAccount,
                           :rdf/type           :owl/Restriction},
      :rdf/type           :owl/Restriction}},
   :skos/definition "account holder to whom a payment card is issued"})

(def CommercialCreditCardAgreement
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.fdic.gov/regulations/examinations/credit_card/pdf_version/ch2.pdf"},
   :cmns-av/explanatoryNote
   "Corporate card programs come in more than one form to serve different business needs. In general, they are contractual agreements between a sponsoring entity and a financial institution, in which the financial institution issues corporate cards to select employees of the sponsoring company.",
   :cmns-av/synonym "corporate credit card agreement",
   :db/ident :fibo-loan-spc-crd/CommercialCreditCardAgreement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "commercial credit card agreement",
   :rdfs/subClassOf #{:fibo-fbc-dae-dbt/CommittedCreditFacility
                      :fibo-loan-spc-crd/PaymentCardAgreement
                      {:owl/onProperty     :fibo-fbc-dae-dbt/hasBorrower,
                       :owl/someValuesFrom {:owl/onProperty
                                            :fibo-fnd-pty-rl/isPlayedBy,
                                            :owl/someValuesFrom
                                            :fibo-fnd-org-fm/FormalOrganization,
                                            :rdf/type :owl/Restriction},
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "credit card agreement for a card issued to, or in conjunction with, a formal organization, such as a small business, middle market business, local, state, or national government, or large corporation"})

(def ConsumerCreditCardAgreement
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "https://www.law.cornell.edu/cfr/text/12/228.12"},
   :db/ident :fibo-loan-spc-crd/ConsumerCreditCardAgreement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "consumer credit card agreement",
   :rdfs/subClassOf #{:fibo-fbc-dae-dbt/CommittedCreditFacility
                      {:owl/onProperty     :fibo-fbc-dae-dbt/hasBorrower,
                       :owl/someValuesFrom :fibo-fnd-pas-pas/Consumer,
                       :rdf/type           :owl/Restriction}
                      :fibo-loan-spc-cns/UnsecuredConsumerLoan
                      :fibo-loan-spc-crd/PaymentCardAgreement},
   :skos/definition
   "credit card agreement for a card issued for household, family, or other personal expenditures that is accessed by a borrower's use of a credit card"})

(def CreditCard
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.fdic.gov/regulations/examinations/credit_card/pdf_version/ch2.pdf"},
   :cmns-av/explanatoryNote
   #{"Issuance of credit cards has the condition that the cardholder will pay back the original, borrowed amount plus any additional agreed-upon charges. The credit company provider may also grant a line of credit (LOC) to the cardholder which allows the holder to borrow money in the form of a cash advance. The issuer pre-sets borrowing limits which have a basis on the individual's credit rating."
     "In its non-physical form, a credit card represents a payment mechanism which facilitates both consumer and commercial business transactions, including purchases and cash advances. A credit card generally operates as a substitute for cash or a check and most often provides an unsecured revolving line of credit. The borrower is required to pay at least part of the card's outstanding balance each billing cycle, depending on the terms as set forth in the cardholder agreement. As the debt reduces, the available credit increases for accounts in good standing. These complex financial arrangements have ever-shifting terms and prices. A charge card differs from a credit card in that the charge card must be paid in full each month."
     "In physical form, a credit card traditionally is a thin, rectangular plastic card. The front of the card contains a series of numbers that are representative of various items such as the applicable network, bank, and account."},
   :db/ident :fibo-loan-spc-crd/CreditCard,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "credit card",
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-cls/isClassifiedBy,
                       :owl/someValuesFrom :fibo-loan-spc-crd/CreditCardProduct,
                       :rdf/type           :owl/Restriction}
                      :fibo-loan-spc-crd/PaymentCard
                      {:owl/onClass    :fibo-loan-spc-crd/CreditCardAccount,
                       :owl/onProperty :fibo-fnd-agr-ctr/isEvidenceFor,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "card issued by a financial service provider that enables the cardholder to borrow funds"})

(def CreditCardAccount
  {:db/ident :fibo-loan-spc-crd/CreditCardAccount,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "credit card account",
   :rdfs/subClassOf
   #{:fibo-fbc-pas-caa/LoanOrCreditAccount
     {:owl/onProperty     :cmns-dsg/isDefinedIn,
      :owl/someValuesFrom :fibo-loan-spc-crd/CreditCardAgreement,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-fbc-pas-caa/hasPaymentDueDate,
      :owl/someValuesFrom :fibo-fbc-pas-caa/PaymentDueDate,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :cmns-dsg/isSignifiedBy,
      :owl/someValuesFrom :fibo-loan-spc-crd/CreditCard,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-fbc-pas-caa/realizes,
      :owl/someValuesFrom :fibo-loan-spc-crd/CreditCardProduct,
      :rdf/type           :owl/Restriction} :fibo-loan-spc-crd/CardAccount},
   :skos/definition
   "card account whose terms and conditions are defined in a credit card agreement that is represented by a credit card"})

(def CreditCardAgreement
  {:db/ident :fibo-loan-spc-crd/CreditCardAgreement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "credit card agreement",
   :rdfs/subClassOf #{{:owl/onProperty :fibo-fbc-dae-dbt/hasLender,
                       :owl/someValuesFrom
                       :fibo-loan-spc-crd/IssuingFinancialInstitution,
                       :rdf/type :owl/Restriction}
                      :fibo-fbc-dae-dbt/CommittedCreditFacility
                      :fibo-loan-spc-crd/PaymentCardAgreement
                      {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                       :owl/someValuesFrom :fibo-loan-spc-crd/CreditCardAccount,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :fibo-fnd-agr-ctr/isEvidencedBy,
                       :owl/someValuesFrom :fibo-loan-spc-crd/CreditCard,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :fibo-fbc-dae-dbt/hasBorrower,
                       :owl/someValuesFrom :fibo-loan-spc-crd/Cardholder,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "account-specific credit facility that specifies the terms and conditions under which the credit card is offered to the cardholder by the issuer"})

(def CreditCardNetwork
  {:db/ident :fibo-loan-spc-crd/CreditCardNetwork,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "credit card network",
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-cls/classifies,
                       :owl/someValuesFrom :fibo-loan-spc-crd/CardProduct,
                       :rdf/type           :owl/Restriction}
                      :cmns-cls/Classifier
                      {:owl/onProperty     :fibo-fnd-rel-rel/hasTag,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "classifier for the network that authorizes, processes, and sets the terms of credit card transactions, as well as transfers payments between shoppers, merchants, and their banks",
   :skos/example "Mastercard, Visa, American Express, Discover"})

(def CreditCardProduct
  {:db/ident :fibo-loan-spc-crd/CreditCardProduct,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "credit card product",
   :rdfs/subClassOf #{:fibo-loan-spc-crd/CardProduct
                      {:owl/onProperty     :fibo-fbc-pas-caa/isRealizedBy,
                       :owl/someValuesFrom :fibo-loan-spc-crd/CreditCardAccount,
                       :rdf/type           :owl/Restriction}
                      {:owl/onClass    :fibo-loan-spc-crd/CreditCardNetwork,
                       :owl/onProperty :fibo-loan-spc-crd/hasCreditCardNetwork,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      {:owl/onProperty     :cmns-cls/classifies,
                       :owl/someValuesFrom :fibo-loan-spc-crd/CreditCard,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "card product allowing the holder to purchase goods or services on credit"})

(def DebitCard
  {:db/ident :fibo-loan-spc-crd/DebitCard,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "debit card",
   :rdfs/subClassOf #{:fibo-loan-spc-crd/PaymentCard
                      {:owl/onClass    :fibo-loan-spc-crd/DebitCardAccount,
                       :owl/onProperty :fibo-fnd-agr-ctr/isEvidenceFor,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      {:owl/onProperty     :cmns-cls/isClassifiedBy,
                       :owl/someValuesFrom :fibo-loan-spc-crd/DebitCardProduct,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "payment card issued by a financial service provider that enables the cardholder to access funds in a demand deposit account"})

(def DebitCardAccount
  {:db/ident :fibo-loan-spc-crd/DebitCardAccount,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "debit card account",
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-dsg/isSignifiedBy,
                       :owl/someValuesFrom :fibo-loan-spc-crd/DebitCard,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :fibo-fbc-pas-caa/realizes,
                       :owl/someValuesFrom :fibo-loan-spc-crd/DebitCardProduct,
                       :rdf/type           :owl/Restriction}
                      :fibo-loan-spc-crd/CardAccount},
   :skos/definition
   "card account that is represented by a one or more debit cards"})

(def DebitCardProduct
  {:db/ident :fibo-loan-spc-crd/DebitCardProduct,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "debit card product",
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-cls/classifies,
                       :owl/someValuesFrom :fibo-loan-spc-crd/DebitCard,
                       :rdf/type           :owl/Restriction}
                      :fibo-loan-spc-crd/CardProduct
                      {:owl/onProperty     :fibo-fbc-pas-caa/isRealizedBy,
                       :owl/someValuesFrom :fibo-loan-spc-crd/DebitCardAccount,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "card product card typically provided by a depository institution allowing the holder to transfer money electronically to another account when making a purchase"})

(def DiscoverNetwork
  {:db/ident :fibo-loan-spc-crd/DiscoverNetwork,
   :rdf/type #{:owl/NamedIndividual :fibo-loan-spc-crd/CreditCardNetwork},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "Discover network",
   :skos/definition
   "credit card network and card issuer offering benefits like secondary rental car collision insurance"})

(def IssuingFinancialInstitution
  {:cmns-av/adaptedFrom
   {:xsd/anyURI "https://www.pcisecuritystandards.org/pci_security/glossary"},
   :cmns-av/synonym "issuing bank",
   :db/ident :fibo-loan-spc-crd/IssuingFinancialInstitution,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "issuing financial institution",
   :rdfs/subClassOf #{:fibo-fbc-pas-fpas/FinancialServiceProvider
                      :fibo-fbc-fi-fi/Issuer},
   :skos/definition
   "issuer and financial services provider that issues payment cards or performs, facilitates, or supports issuing services including but not limited to issuing banks and issuing processors"})

(def JCBNetwork
  {:cmns-av/explanatoryNote
   "JCB Co., Ltd., (formerly Japan Credit Bureau) is a credit card company based in Tokyo, Japan. As of 2020, it operates in 23 countries with over 130 million customers. In the United States, it is not a primary credit card network but has an association with the Discover Network to enable use of JCB cards.",
   :db/ident :fibo-loan-spc-crd/JCBNetwork,
   :rdf/type #{:owl/NamedIndividual :fibo-loan-spc-crd/CreditCardNetwork},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "JCB network",
   :skos/definition
   "credit card network based in Japan, with coverage throughout Asia, with strategic partners worldwide"})

(def MagneticStripeVerificationCodeValue
  {:cmns-av/adaptedFrom
   {:xsd/anyURI "https://www.pcisecuritystandards.org/pci_security/glossary"},
   :db/ident :fibo-loan-spc-crd/MagneticStripeVerificationCodeValue,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "magnetic stripe verification code or value",
   :rdfs/subClassOf :fibo-loan-spc-crd/CardVerificationCodeValue,
   :skos/definition
   "card verification code on a card's magnetic stripe that uses secure cryptographic processes to protect data integrity on the stripe, and reveals any alteration or counterfeiting"})

(def MastercardNetwork
  {:db/ident :fibo-loan-spc-crd/MastercardNetwork,
   :rdf/type #{:owl/NamedIndividual :fibo-loan-spc-crd/CreditCardNetwork},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "Mastercard network",
   :skos/definition
   "credit card network that has its own suite of card protections and benefits, such as identity theft protection and extended warranties"})

(def PaymentCard
  {:cmns-av/explanatoryNote
   #{"The term payment card includes credit cards, debit cards, and stored-value cards, as well as payment through any distinctive marks of a payment card (such as a credit card number). A payment card is issued under an agreement that provides standards and mechanisms for settling the transactions between a merchant acquiring bank or similar entity and the providers who accept the cards as payment."
     "For purposes of Payment Card Industry Data Security Standard (PCI DSS), a payment card is any payment card/device that bears the logo of the founding members of PCI SSC, which are American Express, Discover Financial Services, JCB International, MasterCard, or Visa, Inc."},
   :db/ident :fibo-loan-spc-crd/PaymentCard,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "payment card",
   :rdfs/seeAlso
   {:xsd/anyURI "https://www.irs.gov/payments/payment-card-transactions-faqs"},
   :rdfs/subClassOf
   #{:fibo-fnd-arr-doc/LegalDocument
     {:owl/onClass    :fibo-loan-spc-crd/CardExpirationDate,
      :owl/onProperty :fibo-fnd-arr-doc/hasExpirationDate,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction}
     {:owl/onClass    :fibo-loan-spc-crd/CardVerificationCodeValue,
      :owl/onProperty :fibo-loan-spc-crd/hasCardVerificationCode,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction}
     {:owl/onProperty     :fibo-fnd-agr-ctr/isEvidenceFor,
      :owl/someValuesFrom :fibo-loan-spc-crd/CardAccount,
      :rdf/type           :owl/Restriction}
     {:owl/onClass    :fibo-loan-spc-crd/PrimaryCardAccountNumber,
      :owl/onProperty :fibo-loan-spc-crd/hasPrimaryAccountNumber,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction}},
   :skos/definition
   "legal document issued by a financial services provider that enables the cardholder to access the funds in the customer's designated bank accounts, or through a credit account and make payments by electronic funds transfer and access automated teller machines (ATMs)"})

(def PaymentCardAgreement
  {:db/ident :fibo-loan-spc-crd/PaymentCardAgreement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "payment card agreement",
   :rdfs/subClassOf
   #{:fibo-fbc-pas-caa/AccountSpecificServiceAgreement
     {:owl/onProperty     :fibo-fnd-agr-ctr/isEvidencedBy,
      :owl/someValuesFrom :fibo-loan-spc-crd/PaymentCard,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
      :owl/someValuesFrom :fibo-loan-spc-crd/CardAccount,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-fnd-agr-ctr/hasContractParty,
      :owl/someValuesFrom :fibo-loan-spc-crd/IssuingFinancialInstitution,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-fnd-agr-ctr/hasContractParty,
      :owl/someValuesFrom :fibo-loan-spc-crd/Cardholder,
      :rdf/type           :owl/Restriction} :fibo-fbc-dae-dbt/CreditAgreement},
   :skos/definition
   "account-specific credit agreement that specifies the terms and conditions under which the payment card is offered to the cardholder by the issuer"})

(def PrimaryCardAccountNumber
  {:cmns-av/abbreviation "PAN",
   :cmns-av/explanatoryNote
   "The PAN identifies the issuer of the card and the account including part of the account number, and contains a check digit that verifies the authenticity of the embossed account number.",
   :cmns-av/synonym "primary account number",
   :db/ident :fibo-loan-spc-crd/PrimaryCardAccountNumber,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "primary card account number",
   :rdfs/subClassOf #{:fibo-fbc-pas-caa/AccountIdentifier
                      {:owl/onClass    :fibo-loan-spc-crd/CardAccount,
                       :owl/onProperty :cmns-id/identifies,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "composite identifier of 14 or 16 digits embossed on a bank or payment card and encoded in the card's magnetic strip"})

(def SmartCard
  {:cmns-av/adaptedFrom
   {:xsd/anyURI "https://www.pcisecuritystandards.org/pci_security/glossary"},
   :cmns-av/explanatoryNote
   "The circuits, also referred to as the 'chip,' contain payment card data including but not limited to data equivalent to the magnetic-stripe data.",
   :db/ident :fibo-loan-spc-crd/SmartCard,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "smart card",
   :rdfs/subClassOf :fibo-loan-spc-crd/PaymentCard,
   :skos/definition
   "payment card that has integrated circuits embedded within it"})

(def ThreeDigitVerificationCodeValue
  {:cmns-av/adaptedFrom
   {:xsd/anyURI "https://www.pcisecuritystandards.org/pci_security/glossary"},
   :db/ident :fibo-loan-spc-crd/ThreeDigitVerificationCodeValue,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "three-digit verification code or value",
   :rdfs/subClassOf :fibo-loan-spc-crd/CardVerificationCodeValue,
   :skos/definition
   "card verification code that is the rightmost three-digit value printed in the signature panel area on the back of the card"})

(def VisaNetwork
  {:db/ident :fibo-loan-spc-crd/VisaNetwork,
   :rdf/type #{:owl/NamedIndividual :fibo-loan-spc-crd/CreditCardNetwork},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "Visa network",
   :skos/definition
   "credit card network that oversees the Visa Signature benefits associated with certain credit cards, such as premium rental car privileges and hotel perks"})

(def hasCardVerificationCode
  {:db/ident :fibo-loan-spc-crd/hasCardVerificationCode,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-loan-spc-crd/PaymentCard,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "has card verification code",
   :rdfs/range :fibo-loan-spc-crd/CardVerificationCodeValue,
   :skos/definition
   "links a credit card to either: (1) magnetic-stripe data, or (2) printed security features that are used to protect data integrity and limit alteration, counterfeiting and fraud generally"})

(def hasCreditCardNetwork
  {:db/ident :fibo-loan-spc-crd/hasCreditCardNetwork,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "has credit card network",
   :rdfs/range :fibo-loan-spc-crd/CreditCardNetwork,
   :rdfs/subPropertyOf :cmns-cls/isClassifiedBy,
   :skos/definition "indicates the underlying network for credit card product"})

(def hasPrimaryAccountNumber
  {:db/ident :fibo-loan-spc-crd/hasPrimaryAccountNumber,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-loan-spc-crd/PaymentCard,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "has primary account number",
   :rdfs/range :fibo-loan-spc-crd/PrimaryCardAccountNumber,
   :skos/definition
   "specifies the account number displayed on the face of the card",
   :skos/editorialNote
   "modeled independently of 'identifies' in order to circumvent circular reasoning challenges"})

(def usesCurrency
  {:db/ident :fibo-loan-spc-crd/usesCurrency,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "uses currency",
   :rdfs/range :fibo-fnd-acc-cur/Currency,
   :rdfs/subPropertyOf :cmns-cxtdsg/uses,
   :skos/definition
   "indicates the currency defined for the credit card product"})

(def urn:uuid:265e2615-f907-52ec-8bdb-6fbc88dc06ce
  {:cmns-av/copyright #{"Copyright (c) 2020-2023 Object Management Group, Inc."
                        "Copyright (c) 2020-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology defines revolving credit account-related concepts that are specific to credit and debit cards. Note that it does not differentiate between consumer and commercial/corporate cards and is capable of representing either.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/ProductsAndServices/ClientsAndAccounts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Parties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/DebtAndEquities/Debt/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/CodesAndCodeSets/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/LOAN/LoansSpecific/ConsumerLoans/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Places/Locations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/OwnershipAndControl/Ownership/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Roles/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Arrangements/Documents/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Organizations/FormalOrganizations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/ProductsAndServices/ProductsAndServices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/ProductsAndServices/FinancialProductsAndServices/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/LOAN/LoansSpecific/CardAccounts/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Card Accounts Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts.rdf version of this ontology was modified to make consumer credit card agreement a subclass of unsecured consumer loan."
     "The https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts.rdf version of this ontology was modified to add a distinction between consumer and commercial credit card agreements."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"})