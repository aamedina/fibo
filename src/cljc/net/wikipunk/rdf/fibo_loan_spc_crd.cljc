(ns net.wikipunk.rdf.fibo-loan-spc-crd
  "This ontology defines revolving credit account-related concepts that are specific to credit and debit cards. Note that it does not differentiate between consumer and commercial/corporate cards and is capable of representing either."
  {:cmns-av/copyright ["Copyright (c) 2020-2023 EDM Council, Inc."
                       "Copyright (c) 2020-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/",
   :dcterms/abstract
   "This ontology defines revolving credit account-related concepts that are specific to credit and debit cards. Note that it does not differentiate between consumer and commercial/corporate cards and is capable of representing either.",
   :dcterms/license {:rdfa/uri "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   [{:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/FinancialProductsAndServices/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/DebtAndEquities/Debt/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Contracts/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/ContextualDesignators/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/CodesAndCodeSets/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Documents/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Roles/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/Classifiers/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/ClientsAndAccounts/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Parties/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/OwnershipAndControl/Ownership/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/Designators/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/Identifiers/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/DatesAndTimes/"}
    {:rdfa/uri "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Locations/"}],
   :owl/versionIRI
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/LOAN/LoansSpecific/CardAccounts/"},
   :rdf/ns-prefix-map
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
    "fibo-loan-spc-crd"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/",
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-loan-spc-crd",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/",
   :rdfs/label "Card Accounts Ontology"})

(def AmericanExpressNetwork
  "credit card network and card issuer that both issues credit cards and processes payments for cards bearing its logo, as well as offering cardholder benefits like travel insurance"
  {:db/ident :fibo-loan-spc-crd/AmericanExpressNetwork,
   :rdf/type [:fibo-loan-spc-crd/CreditCardNetwork
              :owl/NamedIndividual
              :cmns-cls/Classifier
              {:owl/onProperty     :cmns-cls/classifies,
               :owl/someValuesFrom :fibo-loan-spc-crd/CardProduct,
               :rdf/type           :owl/Restriction}
              {:owl/onProperty     :fibo-fnd-rel-rel/hasTag,
               :owl/someValuesFrom :xsd/string,
               :rdf/type           :owl/Restriction}],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "American Express network",
   :skos/definition
   "credit card network and card issuer that both issues credit cards and processes payments for cards bearing its logo, as well as offering cardholder benefits like travel insurance"})

(def CardAccount
  "account whose terms and conditions are defined in a card agreement that is represented by a payment card"
  {:db/ident :fibo-loan-spc-crd/CardAccount,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "card account",
   :rdfs/subClassOf
   [{:owl/onProperty     :cmns-id/isIdentifiedBy,
     :owl/someValuesFrom :fibo-loan-spc-crd/PrimaryCardAccountNumber,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fbc-pas-caa/realizes,
     :owl/someValuesFrom :fibo-loan-spc-crd/CardProduct,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :cmns-dsg/isDefinedIn,
     :owl/someValuesFrom :fibo-loan-spc-crd/PaymentCardAgreement,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fbc-pas-caa/hasPrimaryAccountHolder,
     :owl/someValuesFrom :fibo-loan-spc-crd/Cardholder,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
     :owl/onClass    :fibo-fbc-pas-caa/CustomerAccount,
     :owl/onProperty :fibo-fbc-pas-caa/isLinkedToAccount,
     :rdf/type       :owl/Restriction}
    {:owl/onProperty     :cmns-dsg/isSignifiedBy,
     :owl/someValuesFrom :fibo-loan-spc-crd/PaymentCard,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-pas-caa/CustomerAccount],
   :skos/definition
   "account whose terms and conditions are defined in a card agreement that is represented by a payment card"})

(def CardAuthenticationValue
  "card verification value specifically for JCB payment cards"
  {:cmns-av/abbreviation "CAV",
   :cmns-av/adaptedFrom
   {:rdfa/uri "https://www.pcisecuritystandards.org/pci_security/glossary"},
   :db/ident :fibo-loan-spc-crd/CardAuthenticationValue,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "card authentication value",
   :rdfs/subClassOf [:fibo-loan-spc-crd/MagneticStripeVerificationCodeValue
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-loan-spc-crd/PaymentCard,
                      :rdf/type           :owl/Restriction}
                     :fibo-loan-spc-crd/CardVerificationCodeValue
                     {:owl/onDataRange :xsd/string,
                      :owl/onProperty  :fibo-fnd-rel-rel/hasTag,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type        :owl/Restriction}
                     :cmns-cds/CodeElement],
   :skos/definition
   "card verification value specifically for JCB payment cards"})

(def CardAuthenticationValue2
  "card verification value specifically for JCB payment cards"
  {:cmns-av/adaptedFrom
   {:rdfa/uri "https://www.pcisecuritystandards.org/pci_security/glossary"},
   :cmns-av/synonym "CAV2",
   :db/ident :fibo-loan-spc-crd/CardAuthenticationValue2,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "card authentication value 2",
   :rdfs/subClassOf [:fibo-loan-spc-crd/ThreeDigitVerificationCodeValue
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-loan-spc-crd/PaymentCard,
                      :rdf/type           :owl/Restriction}
                     :fibo-loan-spc-crd/CardVerificationCodeValue
                     {:owl/onDataRange :xsd/string,
                      :owl/onProperty  :fibo-fnd-rel-rel/hasTag,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type        :owl/Restriction}
                     :cmns-cds/CodeElement],
   :skos/definition
   "card verification value specifically for JCB payment cards"})

(def CardExpirationDate
  "date on which a given payment card expires"
  {:db/ident :fibo-loan-spc-crd/CardExpirationDate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "card expiration date",
   :rdfs/subClassOf :cmns-dt/ExplicitDate,
   :skos/definition "date on which a given payment card expires"})

(def CardIdentificationNumber
  "card verification value specifically for American Express and Discover payment cards"
  {:cmns-av/abbreviation "CID",
   :cmns-av/adaptedFrom
   {:rdfa/uri "https://www.pcisecuritystandards.org/pci_security/glossary"},
   :db/ident :fibo-loan-spc-crd/CardIdentificationNumber,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "card identification number",
   :rdfs/subClassOf [:fibo-loan-spc-crd/ThreeDigitVerificationCodeValue
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-loan-spc-crd/PaymentCard,
                      :rdf/type           :owl/Restriction}
                     :fibo-loan-spc-crd/CardVerificationCodeValue
                     {:owl/onDataRange :xsd/string,
                      :owl/onProperty  :fibo-fnd-rel-rel/hasTag,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type        :owl/Restriction}
                     :cmns-cds/CodeElement],
   :skos/definition
   "card verification value specifically for American Express and Discover payment cards"})

(def CardProduct
  "financial product involving the issuance of credit, debit, or other payment cards"
  {:db/ident :fibo-loan-spc-crd/CardProduct,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "card product",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fbc-pas-caa/isRealizedBy,
                      :owl/someValuesFrom :fibo-loan-spc-crd/CardAccount,
                      :rdf/type           :owl/Restriction}
                     {:owl/onClass    :lcc-cr/Country,
                      :owl/onProperty :fibo-fnd-plc-loc/hasCountry,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-pas-fpas/FinancialProduct
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :fibo-loan-spc-crd/CreditCardNetwork,
                      :owl/onProperty :fibo-loan-spc-crd/hasCreditCardNetwork,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-fnd-acc-cur/Currency,
                      :owl/onProperty :fibo-loan-spc-crd/usesCurrency,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :lcc-cr/CountrySubdivision,
                      :owl/onProperty :fibo-fnd-plc-loc/hasSubdivision,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "financial product involving the issuance of credit, debit, or other payment cards"})

(def CardSecurityCode
  "card verification value specifically for American Express payment cards"
  {:cmns-av/abbreviation "CSC",
   :cmns-av/adaptedFrom
   {:rdfa/uri "https://www.pcisecuritystandards.org/pci_security/glossary"},
   :db/ident :fibo-loan-spc-crd/CardSecurityCode,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "card security code",
   :rdfs/subClassOf [:fibo-loan-spc-crd/MagneticStripeVerificationCodeValue
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-loan-spc-crd/PaymentCard,
                      :rdf/type           :owl/Restriction}
                     :fibo-loan-spc-crd/CardVerificationCodeValue
                     {:owl/onDataRange :xsd/string,
                      :owl/onProperty  :fibo-fnd-rel-rel/hasTag,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type        :owl/Restriction}
                     :cmns-cds/CodeElement],
   :skos/definition
   "card verification value specifically for American Express payment cards"})

(def CardValidationCode
  "card verification code specifically for Mastercard payment cards"
  {:cmns-av/abbreviation "PAN CVC",
   :cmns-av/adaptedFrom
   {:rdfa/uri "https://www.pcisecuritystandards.org/pci_security/glossary"},
   :db/ident :fibo-loan-spc-crd/CardValidationCode,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "card validation code",
   :rdfs/subClassOf [:fibo-loan-spc-crd/MagneticStripeVerificationCodeValue
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-loan-spc-crd/PaymentCard,
                      :rdf/type           :owl/Restriction}
                     :fibo-loan-spc-crd/CardVerificationCodeValue
                     {:owl/onDataRange :xsd/string,
                      :owl/onProperty  :fibo-fnd-rel-rel/hasTag,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type        :owl/Restriction}
                     :cmns-cds/CodeElement],
   :skos/definition
   "card verification code specifically for Mastercard payment cards"})

(def CardValidationCode2
  "card verification value specifically for Mastercard payment cards"
  {:cmns-av/abbreviation "PAN CVC2",
   :cmns-av/adaptedFrom
   {:rdfa/uri "https://www.pcisecuritystandards.org/pci_security/glossary"},
   :db/ident :fibo-loan-spc-crd/CardValidationCode2,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "card validation code 2",
   :rdfs/subClassOf [:fibo-loan-spc-crd/ThreeDigitVerificationCodeValue
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-loan-spc-crd/PaymentCard,
                      :rdf/type           :owl/Restriction}
                     :fibo-loan-spc-crd/CardVerificationCodeValue
                     {:owl/onDataRange :xsd/string,
                      :owl/onProperty  :fibo-fnd-rel-rel/hasTag,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type        :owl/Restriction}
                     :cmns-cds/CodeElement],
   :skos/definition
   "card verification value specifically for Mastercard payment cards"})

(def CardVerificationCodeValue
  "code that specifies either (1) magnetic-stripe data, or (2) printed security features that are used to protect data integrity and limit alteration, counterfeiting and fraud generally"
  {:cmns-av/adaptedFrom
   {:rdfa/uri "https://www.pcisecuritystandards.org/pci_security/glossary"},
   :db/ident :fibo-loan-spc-crd/CardVerificationCodeValue,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "card verification code or value",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-loan-spc-crd/PaymentCard,
                      :rdf/type           :owl/Restriction}
                     {:owl/onDataRange :xsd/string,
                      :owl/onProperty  :fibo-fnd-rel-rel/hasTag,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type        :owl/Restriction}
                     :cmns-cds/CodeElement],
   :skos/definition
   "code that specifies either (1) magnetic-stripe data, or (2) printed security features that are used to protect data integrity and limit alteration, counterfeiting and fraud generally"})

(def CardVerificationValue
  "card verification value specifically for Visa and Discover payment cards"
  {:cmns-av/abbreviation "CVV",
   :cmns-av/adaptedFrom
   {:rdfa/uri "https://www.pcisecuritystandards.org/pci_security/glossary"},
   :db/ident :fibo-loan-spc-crd/CardVerificationValue,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "card verification value",
   :rdfs/subClassOf [:fibo-loan-spc-crd/MagneticStripeVerificationCodeValue
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-loan-spc-crd/PaymentCard,
                      :rdf/type           :owl/Restriction}
                     :fibo-loan-spc-crd/CardVerificationCodeValue
                     {:owl/onDataRange :xsd/string,
                      :owl/onProperty  :fibo-fnd-rel-rel/hasTag,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type        :owl/Restriction}
                     :cmns-cds/CodeElement],
   :skos/definition
   "card verification value specifically for Visa and Discover payment cards"})

(def CardVerificationValue2
  "card verification value specifically for Visa payment cards"
  {:cmns-av/adaptedFrom
   {:rdfa/uri "https://www.pcisecuritystandards.org/pci_security/glossary"},
   :cmns-av/synonym "CVV2",
   :db/ident :fibo-loan-spc-crd/CardVerificationValue2,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "card verification value 2",
   :rdfs/subClassOf [:fibo-loan-spc-crd/ThreeDigitVerificationCodeValue
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-loan-spc-crd/PaymentCard,
                      :rdf/type           :owl/Restriction}
                     :fibo-loan-spc-crd/CardVerificationCodeValue
                     {:owl/onDataRange :xsd/string,
                      :owl/onProperty  :fibo-fnd-rel-rel/hasTag,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type        :owl/Restriction}
                     :cmns-cds/CodeElement],
   :skos/definition
   "card verification value specifically for Visa payment cards"})

(def Cardholder
  "account holder to whom a payment card is issued"
  {:cmns-av/adaptedFrom
   {:rdfa/uri "https://www.pcisecuritystandards.org/pci_security/glossary"},
   :db/ident :fibo-loan-spc-crd/Cardholder,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "cardholder",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-rel-rel/holds,
     :owl/someValuesFrom :fibo-loan-spc-crd/CardAccount,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-pty-rl/isPlayedBy,
     :owl/someValuesFrom {:owl/onProperty     :fibo-fnd-pty-pty/isAPartyTo,
                          :owl/someValuesFrom :fibo-loan-spc-crd/CardAccount,
                          :rdf/type           :owl/Restriction},
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-pty-rl/isPlayedBy,
     :owl/someValuesFrom {:owl/onProperty     :fibo-fnd-oac-own/owns,
                          :owl/someValuesFrom :fibo-loan-spc-crd/CardAccount,
                          :rdf/type           :owl/Restriction},
     :rdf/type           :owl/Restriction}
    :fibo-fbc-pas-caa/CustomerAccountHolder],
   :skos/definition "account holder to whom a payment card is issued"})

(def CreditCard
  "card issued by a financial service provider that enables the cardholder to borrow funds"
  {:cmns-av/explanatoryNote
   "Issuance of credit cards has the condition that the cardholder will pay back the original, borrowed amount plus any additional agreed-upon charges. The credit company provider may also grant a line of credit (LOC) to the cardholder which allows the holder to borrow money in the form of a cash advance. The issuer pre-sets borrowing limits which have a basis on the individual's credit rating.",
   :db/ident :fibo-loan-spc-crd/CreditCard,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "credit card",
   :rdfs/subClassOf
   [{:owl/onProperty     :cmns-cls/isClassifiedBy,
     :owl/someValuesFrom :fibo-loan-spc-crd/CreditCardProduct,
     :rdf/type           :owl/Restriction}
    {:owl/onClass    :fibo-loan-spc-crd/CreditCardAccount,
     :owl/onProperty :fibo-fnd-agr-ctr/isEvidenceFor,
     :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
     :rdf/type       :owl/Restriction}
    :fibo-loan-spc-crd/PaymentCard
    :fibo-fnd-arr-doc/LegalDocument
    {:owl/onClass    :fibo-loan-spc-crd/CardVerificationCodeValue,
     :owl/onProperty :fibo-loan-spc-crd/hasCardVerificationCode,
     :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
     :rdf/type       :owl/Restriction}
    {:owl/onClass    :fibo-loan-spc-crd/CardExpirationDate,
     :owl/onProperty :fibo-fnd-arr-doc/hasExpirationDate,
     :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
     :rdf/type       :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-agr-ctr/isEvidenceFor,
     :owl/someValuesFrom :fibo-loan-spc-crd/CardAccount,
     :rdf/type           :owl/Restriction}
    {:owl/onClass    :fibo-loan-spc-crd/PrimaryCardAccountNumber,
     :owl/onProperty :fibo-loan-spc-crd/hasPrimaryAccountNumber,
     :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
     :rdf/type       :owl/Restriction}],
   :skos/definition
   "card issued by a financial service provider that enables the cardholder to borrow funds"})

(def CreditCardAccount
  "card account whose terms and conditions are defined in a credit card agreement that is represented by a credit card"
  {:db/ident :fibo-loan-spc-crd/CreditCardAccount,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "credit card account",
   :rdfs/subClassOf
   [{:owl/onProperty     :cmns-dsg/isSignifiedBy,
     :owl/someValuesFrom :fibo-loan-spc-crd/CreditCard,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fbc-pas-caa/realizes,
     :owl/someValuesFrom :fibo-loan-spc-crd/CreditCardProduct,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :cmns-dsg/isDefinedIn,
     :owl/someValuesFrom :fibo-loan-spc-crd/CreditCardAgreement,
     :rdf/type           :owl/Restriction}
    :fibo-loan-spc-crd/CardAccount
    :fibo-fbc-pas-caa/LoanOrCreditAccount
    {:owl/onProperty     :fibo-fbc-pas-caa/hasPaymentDueDate,
     :owl/someValuesFrom :fibo-fbc-pas-caa/PaymentDueDate,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
     :owl/onClass    :fibo-fbc-pas-caa/CustomerAccount,
     :owl/onProperty :fibo-fbc-pas-caa/isLinkedToAccount,
     :rdf/type       :owl/Restriction}
    {:owl/onProperty     :fibo-fbc-pas-caa/hasPrimaryAccountHolder,
     :owl/someValuesFrom :fibo-loan-spc-crd/Cardholder,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :cmns-id/isIdentifiedBy,
     :owl/someValuesFrom :fibo-loan-spc-crd/PrimaryCardAccountNumber,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fbc-pas-caa/realizes,
     :owl/someValuesFrom :fibo-loan-spc-crd/CardProduct,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-pas-caa/CustomerAccount
    {:owl/onProperty     :cmns-dsg/isSignifiedBy,
     :owl/someValuesFrom :fibo-loan-spc-crd/PaymentCard,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :cmns-dsg/isDefinedIn,
     :owl/someValuesFrom :fibo-loan-spc-crd/PaymentCardAgreement,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   "card account whose terms and conditions are defined in a credit card agreement that is represented by a credit card"})

(def CreditCardAgreement
  "account-specific credit facility that specifies the terms and conditions under which the credit card is offered to the cardholder by the issuer"
  {:db/ident :fibo-loan-spc-crd/CreditCardAgreement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "credit card agreement",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-agr-ctr/isEvidencedBy,
     :owl/someValuesFrom :fibo-loan-spc-crd/CreditCard,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fbc-dae-dbt/hasLender,
     :owl/someValuesFrom :fibo-loan-spc-crd/IssuingFinancialInstitution,
     :rdf/type           :owl/Restriction}
    :fibo-loan-spc-crd/PaymentCardAgreement
    {:owl/onProperty     :fibo-fbc-dae-dbt/hasBorrower,
     :owl/someValuesFrom :fibo-loan-spc-crd/Cardholder,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :cmns-cxtdsg/appliesTo,
     :owl/someValuesFrom :fibo-loan-spc-crd/CreditCardAccount,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-dae-dbt/CommittedCreditFacility
    {:owl/onProperty     :fibo-fnd-agr-ctr/hasContractParty,
     :owl/someValuesFrom :fibo-loan-spc-crd/IssuingFinancialInstitution,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-pas-caa/AccountSpecificServiceAgreement
    :fibo-fbc-dae-dbt/CreditAgreement
    {:owl/onProperty     :fibo-fnd-agr-ctr/isEvidencedBy,
     :owl/someValuesFrom :fibo-loan-spc-crd/PaymentCard,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :cmns-cxtdsg/appliesTo,
     :owl/someValuesFrom :fibo-loan-spc-crd/CardAccount,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-agr-ctr/hasContractParty,
     :owl/someValuesFrom :fibo-loan-spc-crd/Cardholder,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   "account-specific credit facility that specifies the terms and conditions under which the credit card is offered to the cardholder by the issuer"})

(def CreditCardNetwork
  "classifier for the network that authorizes, processes, and sets the terms of credit card transactions, as well as transfers payments between shoppers, merchants, and their banks"
  {:db/ident :fibo-loan-spc-crd/CreditCardNetwork,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "credit card network",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-cls/classifies,
                      :owl/someValuesFrom :fibo-loan-spc-crd/CardProduct,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-rel-rel/hasTag,
                      :owl/someValuesFrom :xsd/string,
                      :rdf/type           :owl/Restriction}
                     :cmns-cls/Classifier],
   :skos/definition
   "classifier for the network that authorizes, processes, and sets the terms of credit card transactions, as well as transfers payments between shoppers, merchants, and their banks",
   :skos/example "Mastercard, Visa, American Express, Discover"})

(def CreditCardProduct
  "card product allowing the holder to purchase goods or services on credit"
  {:db/ident :fibo-loan-spc-crd/CreditCardProduct,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "credit card product",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-cls/classifies,
                      :owl/someValuesFrom :fibo-loan-spc-crd/CreditCard,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fbc-pas-caa/isRealizedBy,
                      :owl/someValuesFrom :fibo-loan-spc-crd/CreditCardAccount,
                      :rdf/type           :owl/Restriction}
                     {:owl/onClass    :fibo-loan-spc-crd/CreditCardNetwork,
                      :owl/onProperty :fibo-loan-spc-crd/hasCreditCardNetwork,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-loan-spc-crd/CardProduct
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :fibo-loan-spc-crd/CreditCardNetwork,
                      :owl/onProperty :fibo-loan-spc-crd/hasCreditCardNetwork,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :lcc-cr/Country,
                      :owl/onProperty :fibo-fnd-plc-loc/hasCountry,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :lcc-cr/CountrySubdivision,
                      :owl/onProperty :fibo-fnd-plc-loc/hasSubdivision,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-fbc-pas-caa/isRealizedBy,
                      :owl/someValuesFrom :fibo-loan-spc-crd/CardAccount,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-pas-fpas/FinancialProduct
                     {:owl/onClass    :fibo-fnd-acc-cur/Currency,
                      :owl/onProperty :fibo-loan-spc-crd/usesCurrency,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "card product allowing the holder to purchase goods or services on credit"})

(def DebitCard
  "payment card issued by a financial service provider that enables the cardholder to access funds in a demand deposit account"
  {:db/ident :fibo-loan-spc-crd/DebitCard,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "debit card",
   :rdfs/subClassOf
   [{:owl/onProperty     :cmns-cls/isClassifiedBy,
     :owl/someValuesFrom :fibo-loan-spc-crd/DebitCardProduct,
     :rdf/type           :owl/Restriction}
    {:owl/onClass    :fibo-loan-spc-crd/DebitCardAccount,
     :owl/onProperty :fibo-fnd-agr-ctr/isEvidenceFor,
     :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
     :rdf/type       :owl/Restriction}
    :fibo-loan-spc-crd/PaymentCard
    :fibo-fnd-arr-doc/LegalDocument
    {:owl/onClass    :fibo-loan-spc-crd/CardVerificationCodeValue,
     :owl/onProperty :fibo-loan-spc-crd/hasCardVerificationCode,
     :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
     :rdf/type       :owl/Restriction}
    {:owl/onClass    :fibo-loan-spc-crd/CardExpirationDate,
     :owl/onProperty :fibo-fnd-arr-doc/hasExpirationDate,
     :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
     :rdf/type       :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-agr-ctr/isEvidenceFor,
     :owl/someValuesFrom :fibo-loan-spc-crd/CardAccount,
     :rdf/type           :owl/Restriction}
    {:owl/onClass    :fibo-loan-spc-crd/PrimaryCardAccountNumber,
     :owl/onProperty :fibo-loan-spc-crd/hasPrimaryAccountNumber,
     :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
     :rdf/type       :owl/Restriction}],
   :skos/definition
   "payment card issued by a financial service provider that enables the cardholder to access funds in a demand deposit account"})

(def DebitCardAccount
  "card account that is represented by a one or more debit cards"
  {:db/ident :fibo-loan-spc-crd/DebitCardAccount,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "debit card account",
   :rdfs/subClassOf
   [{:owl/onProperty     :cmns-dsg/isSignifiedBy,
     :owl/someValuesFrom :fibo-loan-spc-crd/DebitCard,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fbc-pas-caa/realizes,
     :owl/someValuesFrom :fibo-loan-spc-crd/DebitCardProduct,
     :rdf/type           :owl/Restriction}
    :fibo-loan-spc-crd/CardAccount
    {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
     :owl/onClass    :fibo-fbc-pas-caa/CustomerAccount,
     :owl/onProperty :fibo-fbc-pas-caa/isLinkedToAccount,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-pas-caa/CustomerAccount
    {:owl/onProperty     :fibo-fbc-pas-caa/hasPrimaryAccountHolder,
     :owl/someValuesFrom :fibo-loan-spc-crd/Cardholder,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :cmns-id/isIdentifiedBy,
     :owl/someValuesFrom :fibo-loan-spc-crd/PrimaryCardAccountNumber,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :cmns-dsg/isSignifiedBy,
     :owl/someValuesFrom :fibo-loan-spc-crd/PaymentCard,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :cmns-dsg/isDefinedIn,
     :owl/someValuesFrom :fibo-loan-spc-crd/PaymentCardAgreement,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fbc-pas-caa/realizes,
     :owl/someValuesFrom :fibo-loan-spc-crd/CardProduct,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   "card account that is represented by a one or more debit cards"})

(def DebitCardProduct
  "card product card typically provided by a depository institution allowing the holder to transfer money electronically to another account when making a purchase"
  {:db/ident :fibo-loan-spc-crd/DebitCardProduct,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "debit card product",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-cls/classifies,
                      :owl/someValuesFrom :fibo-loan-spc-crd/DebitCard,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fbc-pas-caa/isRealizedBy,
                      :owl/someValuesFrom :fibo-loan-spc-crd/DebitCardAccount,
                      :rdf/type           :owl/Restriction}
                     :fibo-loan-spc-crd/CardProduct
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :fibo-loan-spc-crd/CreditCardNetwork,
                      :owl/onProperty :fibo-loan-spc-crd/hasCreditCardNetwork,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :lcc-cr/Country,
                      :owl/onProperty :fibo-fnd-plc-loc/hasCountry,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :lcc-cr/CountrySubdivision,
                      :owl/onProperty :fibo-fnd-plc-loc/hasSubdivision,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-fbc-pas-caa/isRealizedBy,
                      :owl/someValuesFrom :fibo-loan-spc-crd/CardAccount,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-pas-fpas/FinancialProduct
                     {:owl/onClass    :fibo-fnd-acc-cur/Currency,
                      :owl/onProperty :fibo-loan-spc-crd/usesCurrency,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "card product card typically provided by a depository institution allowing the holder to transfer money electronically to another account when making a purchase"})

(def DiscoverNetwork
  "credit card network and card issuer offering benefits like secondary rental car collision insurance"
  {:db/ident :fibo-loan-spc-crd/DiscoverNetwork,
   :rdf/type [:fibo-loan-spc-crd/CreditCardNetwork
              :owl/NamedIndividual
              :cmns-cls/Classifier
              {:owl/onProperty     :cmns-cls/classifies,
               :owl/someValuesFrom :fibo-loan-spc-crd/CardProduct,
               :rdf/type           :owl/Restriction}
              {:owl/onProperty     :fibo-fnd-rel-rel/hasTag,
               :owl/someValuesFrom :xsd/string,
               :rdf/type           :owl/Restriction}],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "Discover network",
   :skos/definition
   "credit card network and card issuer offering benefits like secondary rental car collision insurance"})

(def IssuingFinancialInstitution
  "issuer and financial services provider that issues payment cards or performs, facilitates, or supports issuing services including but not limited to issuing banks and issuing processors"
  {:cmns-av/adaptedFrom
   {:rdfa/uri "https://www.pcisecuritystandards.org/pci_security/glossary"},
   :cmns-av/synonym "issuing bank",
   :db/ident :fibo-loan-spc-crd/IssuingFinancialInstitution,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "issuing financial institution",
   :rdfs/subClassOf [:fibo-fbc-pas-fpas/FinancialServiceProvider
                     :fibo-fbc-fi-fi/Issuer],
   :skos/definition
   "issuer and financial services provider that issues payment cards or performs, facilitates, or supports issuing services including but not limited to issuing banks and issuing processors"})

(def JCBNetwork
  "credit card network based in Japan, with coverage throughout Asia, with strategic partners worldwide"
  {:cmns-av/explanatoryNote
   "JCB Co., Ltd., (formerly Japan Credit Bureau) is a credit card company based in Tokyo, Japan. As of 2020, it operates in 23 countries with over 130 million customers. In the United States, it is not a primary credit card network but has an association with the Discover Network to enable use of JCB cards.",
   :db/ident :fibo-loan-spc-crd/JCBNetwork,
   :rdf/type [:fibo-loan-spc-crd/CreditCardNetwork
              :owl/NamedIndividual
              :cmns-cls/Classifier
              {:owl/onProperty     :cmns-cls/classifies,
               :owl/someValuesFrom :fibo-loan-spc-crd/CardProduct,
               :rdf/type           :owl/Restriction}
              {:owl/onProperty     :fibo-fnd-rel-rel/hasTag,
               :owl/someValuesFrom :xsd/string,
               :rdf/type           :owl/Restriction}],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "JCB network",
   :skos/definition
   "credit card network based in Japan, with coverage throughout Asia, with strategic partners worldwide"})

(def MagneticStripeVerificationCodeValue
  "card verification code on a card's magnetic stripe that uses secure cryptographic processes to protect data integrity on the stripe, and reveals any alteration or counterfeiting"
  {:cmns-av/adaptedFrom
   {:rdfa/uri "https://www.pcisecuritystandards.org/pci_security/glossary"},
   :db/ident :fibo-loan-spc-crd/MagneticStripeVerificationCodeValue,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "magnetic stripe verification code or value",
   :rdfs/subClassOf [:fibo-loan-spc-crd/CardVerificationCodeValue
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-loan-spc-crd/PaymentCard,
                      :rdf/type           :owl/Restriction}
                     {:owl/onDataRange :xsd/string,
                      :owl/onProperty  :fibo-fnd-rel-rel/hasTag,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type        :owl/Restriction}
                     :cmns-cds/CodeElement],
   :skos/definition
   "card verification code on a card's magnetic stripe that uses secure cryptographic processes to protect data integrity on the stripe, and reveals any alteration or counterfeiting"})

(def MastercardNetwork
  "credit card network that has its own suite of card protections and benefits, such as identity theft protection and extended warranties"
  {:db/ident :fibo-loan-spc-crd/MastercardNetwork,
   :rdf/type [:fibo-loan-spc-crd/CreditCardNetwork
              :owl/NamedIndividual
              :cmns-cls/Classifier
              {:owl/onProperty     :cmns-cls/classifies,
               :owl/someValuesFrom :fibo-loan-spc-crd/CardProduct,
               :rdf/type           :owl/Restriction}
              {:owl/onProperty     :fibo-fnd-rel-rel/hasTag,
               :owl/someValuesFrom :xsd/string,
               :rdf/type           :owl/Restriction}],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "Mastercard network",
   :skos/definition
   "credit card network that has its own suite of card protections and benefits, such as identity theft protection and extended warranties"})

(def PaymentCard
  "legal document issued by a financial services provider that enables the cardholder to access the funds in the customer's designated bank accounts, or through a credit account and make payments by electronic funds transfer and access automated teller machines (ATMs)"
  {:cmns-av/explanatoryNote
   ["The term payment card includes credit cards, debit cards, and stored-value cards, as well as payment through any distinctive marks of a payment card (such as a credit card number). A payment card is issued under an agreement that provides standards and mechanisms for settling the transactions between a merchant acquiring bank or similar entity and the providers who accept the cards as payment."
    "For purposes of Payment Card Industry Data Security Standard (PCI DSS), a payment card is any payment card/device that bears the logo of the founding members of PCI SSC, which are American Express, Discover Financial Services, JCB International, MasterCard, or Visa, Inc."],
   :db/ident :fibo-loan-spc-crd/PaymentCard,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "payment card",
   :rdfs/seeAlso
   {:rdfa/uri "https://www.irs.gov/payments/payment-card-transactions-faqs"},
   :rdfs/subClassOf
   [{:owl/onClass    :fibo-loan-spc-crd/CardVerificationCodeValue,
     :owl/onProperty :fibo-loan-spc-crd/hasCardVerificationCode,
     :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
     :rdf/type       :owl/Restriction}
    {:owl/onClass    :fibo-loan-spc-crd/PrimaryCardAccountNumber,
     :owl/onProperty :fibo-loan-spc-crd/hasPrimaryAccountNumber,
     :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
     :rdf/type       :owl/Restriction}
    :fibo-fnd-arr-doc/LegalDocument
    {:owl/onClass    :fibo-loan-spc-crd/CardExpirationDate,
     :owl/onProperty :fibo-fnd-arr-doc/hasExpirationDate,
     :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
     :rdf/type       :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-agr-ctr/isEvidenceFor,
     :owl/someValuesFrom :fibo-loan-spc-crd/CardAccount,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   "legal document issued by a financial services provider that enables the cardholder to access the funds in the customer's designated bank accounts, or through a credit account and make payments by electronic funds transfer and access automated teller machines (ATMs)"})

(def PaymentCardAgreement
  "account-specific credit agreement that specifies the terms and conditions under which the payment card is offered to the cardholder by the issuer"
  {:db/ident :fibo-loan-spc-crd/PaymentCardAgreement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "payment card agreement",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-agr-ctr/hasContractParty,
                      :owl/someValuesFrom
                      :fibo-loan-spc-crd/IssuingFinancialInstitution,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-agr-ctr/hasContractParty,
                      :owl/someValuesFrom :fibo-loan-spc-crd/Cardholder,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-agr-ctr/isEvidencedBy,
                      :owl/someValuesFrom :fibo-loan-spc-crd/PaymentCard,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-loan-spc-crd/CardAccount,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-pas-caa/AccountSpecificServiceAgreement
                     :fibo-fbc-dae-dbt/CreditAgreement],
   :skos/definition
   "account-specific credit agreement that specifies the terms and conditions under which the payment card is offered to the cardholder by the issuer"})

(def PrimaryCardAccountNumber
  "composite identifier of 14 or 16 digits embossed on a bank or payment card and encoded in the card's magnetic strip"
  {:cmns-av/abbreviation "PAN",
   :cmns-av/explanatoryNote
   "The PAN identifies the issuer of the card and the account including part of the account number, and contains a check digit that verifies the authenticity of the embossed account number.",
   :cmns-av/synonym "primary account number",
   :db/ident :fibo-loan-spc-crd/PrimaryCardAccountNumber,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "primary card account number",
   :rdfs/subClassOf [{:owl/onClass    :fibo-loan-spc-crd/CardAccount,
                      :owl/onProperty :cmns-id/identifies,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-pas-caa/AccountIdentifier],
   :skos/definition
   "composite identifier of 14 or 16 digits embossed on a bank or payment card and encoded in the card's magnetic strip"})

(def SmartCard
  "payment card that has integrated circuits embedded within it"
  {:cmns-av/adaptedFrom
   {:rdfa/uri "https://www.pcisecuritystandards.org/pci_security/glossary"},
   :cmns-av/explanatoryNote
   "The circuits, also referred to as the 'chip,' contain payment card data including but not limited to data equivalent to the magnetic-stripe data.",
   :db/ident :fibo-loan-spc-crd/SmartCard,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "smart card",
   :rdfs/subClassOf
   [:fibo-loan-spc-crd/PaymentCard
    :fibo-fnd-arr-doc/LegalDocument
    {:owl/onClass    :fibo-loan-spc-crd/CardVerificationCodeValue,
     :owl/onProperty :fibo-loan-spc-crd/hasCardVerificationCode,
     :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
     :rdf/type       :owl/Restriction}
    {:owl/onClass    :fibo-loan-spc-crd/CardExpirationDate,
     :owl/onProperty :fibo-fnd-arr-doc/hasExpirationDate,
     :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
     :rdf/type       :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-agr-ctr/isEvidenceFor,
     :owl/someValuesFrom :fibo-loan-spc-crd/CardAccount,
     :rdf/type           :owl/Restriction}
    {:owl/onClass    :fibo-loan-spc-crd/PrimaryCardAccountNumber,
     :owl/onProperty :fibo-loan-spc-crd/hasPrimaryAccountNumber,
     :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
     :rdf/type       :owl/Restriction}],
   :skos/definition
   "payment card that has integrated circuits embedded within it"})

(def ThreeDigitVerificationCodeValue
  "card verification code that is the rightmost three-digit value printed in the signature panel area on the back of the card"
  {:cmns-av/adaptedFrom
   {:rdfa/uri "https://www.pcisecuritystandards.org/pci_security/glossary"},
   :db/ident :fibo-loan-spc-crd/ThreeDigitVerificationCodeValue,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "three-digit verification code or value",
   :rdfs/subClassOf [:fibo-loan-spc-crd/CardVerificationCodeValue
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-loan-spc-crd/PaymentCard,
                      :rdf/type           :owl/Restriction}
                     {:owl/onDataRange :xsd/string,
                      :owl/onProperty  :fibo-fnd-rel-rel/hasTag,
                      :owl/qualifiedCardinality #xsd/nonNegativeInteger 1,
                      :rdf/type        :owl/Restriction}
                     :cmns-cds/CodeElement],
   :skos/definition
   "card verification code that is the rightmost three-digit value printed in the signature panel area on the back of the card"})

(def VisaNetwork
  "credit card network that oversees the Visa Signature benefits associated with certain credit cards, such as premium rental car privileges and hotel perks"
  {:db/ident :fibo-loan-spc-crd/VisaNetwork,
   :rdf/type [:fibo-loan-spc-crd/CreditCardNetwork
              :owl/NamedIndividual
              :cmns-cls/Classifier
              {:owl/onProperty     :cmns-cls/classifies,
               :owl/someValuesFrom :fibo-loan-spc-crd/CardProduct,
               :rdf/type           :owl/Restriction}
              {:owl/onProperty     :fibo-fnd-rel-rel/hasTag,
               :owl/someValuesFrom :xsd/string,
               :rdf/type           :owl/Restriction}],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "Visa network",
   :skos/definition
   "credit card network that oversees the Visa Signature benefits associated with certain credit cards, such as premium rental car privileges and hotel perks"})

(def hasCardVerificationCode
  "links a credit card to either: (1) magnetic-stripe data, or (2) printed security features that are used to protect data integrity and limit alteration, counterfeiting and fraud generally"
  {:db/ident :fibo-loan-spc-crd/hasCardVerificationCode,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-loan-spc-crd/PaymentCard,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "has card verification code",
   :rdfs/range :fibo-loan-spc-crd/CardVerificationCodeValue,
   :skos/definition
   "links a credit card to either: (1) magnetic-stripe data, or (2) printed security features that are used to protect data integrity and limit alteration, counterfeiting and fraud generally"})

(def hasCreditCardNetwork
  "indicates the underlying network for credit card product"
  {:db/ident :fibo-loan-spc-crd/hasCreditCardNetwork,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "has credit card network",
   :rdfs/range :fibo-loan-spc-crd/CreditCardNetwork,
   :rdfs/subPropertyOf :cmns-cls/isClassifiedBy,
   :skos/definition "indicates the underlying network for credit card product"})

(def hasPrimaryAccountNumber
  "specifies the account number displayed on the face of the card"
  {:db/ident :fibo-loan-spc-crd/hasPrimaryAccountNumber,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-loan-spc-crd/PaymentCard,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "has primary account number",
   :rdfs/range :fibo-loan-spc-crd/PrimaryCardAccountNumber,
   :skos/definition
   "specifies the account number displayed on the face of the card",
   :skos/editorialNote
   "modeled independently of 'identifies' in order to circumvent circular reasoning challenges"})

(def usesCurrency
  "indicates the currency defined for the credit card product"
  {:db/ident :fibo-loan-spc-crd/usesCurrency,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/"},
   :rdfs/label "uses currency",
   :rdfs/range :fibo-fnd-acc-cur/Currency,
   :rdfs/subPropertyOf :cmns-cxtdsg/uses,
   :skos/definition
   "indicates the currency defined for the credit card product"})