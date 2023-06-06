(ns net.wikipunk.rdf.fibo-fbc-pas-crd
  "This ontology defines account-related concepts that are specific to credit and debit cards."
  {:cmns-av/copyright ["Copyright (c) 2020-2023 Object Management Group, Inc."
                       "Copyright (c) 2020-2023 EDM Council, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/CardAccounts/",
   :dcterms/abstract
   "This ontology defines account-related concepts that are specific to credit and debit cards.",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Documents/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
    "https://www.omg.org/spec/Commons/Classifiers/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Locations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/FinancialProductsAndServices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Contracts/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Parties/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://www.omg.org/spec/Commons/ContextualDesignators/"
    "https://www.omg.org/spec/Commons/Identifiers/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/ClientsAndAccounts/"
    "https://www.omg.org/spec/Commons/DatesAndTimes/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"
    "https://www.omg.org/spec/Commons/Designators/"
    "https://www.omg.org/spec/Commons/CodesAndCodeSets/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/OwnershipAndControl/Ownership/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Roles/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/DebtAndEquities/Debt/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/CardAccounts/",
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
    "fibo-fbc-pas-crd"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/CardAccounts/",
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
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fbc-pas-crd",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/CardAccounts/",
   :rdfs/label "Card Accounts Ontology"})

(def AmericanExpressNetwork
  "credit card network and card issuer that both issues credit cards and processes payments for cards bearing its logo, as well as offering cardholder benefits like travel insurance"
  {:db/ident :fibo-fbc-pas-crd/AmericanExpressNetwork,
   :rdf/type [:fibo-fbc-pas-crd/CreditCardNetwork
              :owl/NamedIndividual
              {:owl/onProperty     :fibo-fnd-rel-rel/hasTag,
               :owl/someValuesFrom :xsd/string,
               :rdf/type           :owl/Restriction}
              {:owl/onProperty     :cmns-cls/classifies,
               :owl/someValuesFrom :fibo-fbc-pas-crd/CardProduct,
               :rdf/type           :owl/Restriction}
              :cmns-cls/Classifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/CardAccounts/",
   :rdfs/label "American Express network",
   :skos/definition
   "credit card network and card issuer that both issues credit cards and processes payments for cards bearing its logo, as well as offering cardholder benefits like travel insurance"})

(def CardAccount
  "account whose terms and conditions are defined in a card agreement that is represented by a payment card"
  {:db/ident :fibo-fbc-pas-crd/CardAccount,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/CardAccounts/",
   :rdfs/label "card account",
   :rdfs/subClassOf
   [:fibo-fbc-pas-caa/CustomerAccount
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-caa/CustomerAccount,
     :owl/onProperty :fibo-fbc-pas-caa/isLinkedToAccount,
     :rdf/type       :owl/Restriction}
    {:owl/onProperty     :fibo-fbc-pas-caa/realizes,
     :owl/someValuesFrom :fibo-fbc-pas-crd/CardProduct,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :cmns-dsg/isDefinedIn,
     :owl/someValuesFrom :fibo-fbc-pas-crd/PaymentCardAgreement,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :cmns-dsg/isSignifiedBy,
     :owl/someValuesFrom :fibo-fbc-pas-crd/PaymentCard,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :cmns-id/isIdentifiedBy,
     :owl/someValuesFrom :fibo-fbc-pas-crd/PrimaryCardAccountNumber,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fbc-pas-caa/hasPrimaryAccountHolder,
     :owl/someValuesFrom :fibo-fbc-pas-crd/Cardholder,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-pas-crd/CardAccount],
   :skos/definition
   "account whose terms and conditions are defined in a card agreement that is represented by a payment card"})

(def CardAuthenticationValue
  "card verification value specifically for JCB payment cards"
  {:cmns-av/abbreviation "CAV",
   :cmns-av/adaptedFrom
   "https://www.pcisecuritystandards.org/pci_security/glossary",
   :db/ident :fibo-fbc-pas-crd/CardAuthenticationValue,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/CardAccounts/",
   :rdfs/label "card authentication value",
   :rdfs/subClassOf [:fibo-fbc-pas-crd/MagneticStripeVerificationCodeOrValue
                     :fibo-fbc-pas-crd/CardAuthenticationValue
                     {:owl/onDataRange :xsd/string,
                      :owl/onProperty  :fibo-fnd-rel-rel/hasTag,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-fbc-pas-crd/PaymentCard,
                      :rdf/type           :owl/Restriction}
                     :cmns-cds/CodeElement
                     :fibo-fbc-pas-crd/CardVerificationCodeOrValue],
   :skos/definition
   "card verification value specifically for JCB payment cards"})

(def CardAuthenticationValue2
  "card verification value specifically for JCB payment cards"
  {:cmns-av/adaptedFrom
   "https://www.pcisecuritystandards.org/pci_security/glossary",
   :cmns-av/synonym "CAV2",
   :db/ident :fibo-fbc-pas-crd/CardAuthenticationValue2,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/CardAccounts/",
   :rdfs/label "card authentication value 2",
   :rdfs/subClassOf [:fibo-fbc-pas-crd/ThreeDigitVerificationCodeOrValue
                     :fibo-fbc-pas-crd/CardAuthenticationValue2
                     {:owl/onDataRange :xsd/string,
                      :owl/onProperty  :fibo-fnd-rel-rel/hasTag,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-fbc-pas-crd/PaymentCard,
                      :rdf/type           :owl/Restriction}
                     :cmns-cds/CodeElement
                     :fibo-fbc-pas-crd/CardVerificationCodeOrValue],
   :skos/definition
   "card verification value specifically for JCB payment cards"})

(def CardExpirationDate
  "date on which a given payment card expires"
  {:db/ident :fibo-fbc-pas-crd/CardExpirationDate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/CardAccounts/",
   :rdfs/label "card expiration date",
   :rdfs/subClassOf [:cmns-dt/ExplicitDate
                     :fibo-fbc-pas-crd/CardExpirationDate],
   :skos/definition "date on which a given payment card expires"})

(def CardIdentificationNumber
  "card verification value specifically for American Express and Discover payment cards"
  {:cmns-av/abbreviation "CID",
   :cmns-av/adaptedFrom
   "https://www.pcisecuritystandards.org/pci_security/glossary",
   :db/ident :fibo-fbc-pas-crd/CardIdentificationNumber,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/CardAccounts/",
   :rdfs/label "card identification number",
   :rdfs/subClassOf [:fibo-fbc-pas-crd/ThreeDigitVerificationCodeOrValue
                     :fibo-fbc-pas-crd/CardIdentificationNumber
                     {:owl/onDataRange :xsd/string,
                      :owl/onProperty  :fibo-fnd-rel-rel/hasTag,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-fbc-pas-crd/PaymentCard,
                      :rdf/type           :owl/Restriction}
                     :cmns-cds/CodeElement
                     :fibo-fbc-pas-crd/CardVerificationCodeOrValue],
   :skos/definition
   "card verification value specifically for American Express and Discover payment cards"})

(def CardProduct
  "financial product involving the issuance of payment cards"
  {:db/ident :fibo-fbc-pas-crd/CardProduct,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/CardAccounts/",
   :rdfs/label "card product",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fbc-pas-crd/CreditCardNetwork,
                      :owl/onProperty :fibo-fbc-pas-crd/hasCreditCardNetwork,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-pas-fpas/FinancialProduct
                     {:owl/onClass    :fibo-fnd-acc-cur/Currency,
                      :owl/onProperty :fibo-fbc-pas-crd/usesCurrency,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :lcc-cr/Country,
                      :owl/onProperty :fibo-fnd-plc-loc/hasCountry,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-fbc-pas-caa/isRealizedBy,
                      :owl/someValuesFrom :fibo-fbc-pas-crd/CardAccount,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :lcc-cr/CountrySubdivision,
                      :owl/onProperty :fibo-fnd-plc-loc/hasSubdivision,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-pas-crd/CardProduct],
   :skos/definition
   "financial product involving the issuance of payment cards"})

(def CardSecurityCode
  "card verification value specifically for American Express payment cards"
  {:cmns-av/abbreviation "CSC",
   :cmns-av/adaptedFrom
   "https://www.pcisecuritystandards.org/pci_security/glossary",
   :db/ident :fibo-fbc-pas-crd/CardSecurityCode,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/CardAccounts/",
   :rdfs/label "card security code",
   :rdfs/subClassOf [:fibo-fbc-pas-crd/MagneticStripeVerificationCodeOrValue
                     :fibo-fbc-pas-crd/CardSecurityCode
                     {:owl/onDataRange :xsd/string,
                      :owl/onProperty  :fibo-fnd-rel-rel/hasTag,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-fbc-pas-crd/PaymentCard,
                      :rdf/type           :owl/Restriction}
                     :cmns-cds/CodeElement
                     :fibo-fbc-pas-crd/CardVerificationCodeOrValue],
   :skos/definition
   "card verification value specifically for American Express payment cards"})

(def CardValidationCode
  "card verification code specifically for Mastercard payment cards"
  {:cmns-av/abbreviation "PAN CVC",
   :cmns-av/adaptedFrom
   "https://www.pcisecuritystandards.org/pci_security/glossary",
   :db/ident :fibo-fbc-pas-crd/CardValidationCode,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/CardAccounts/",
   :rdfs/label "card validation code",
   :rdfs/subClassOf [:fibo-fbc-pas-crd/MagneticStripeVerificationCodeOrValue
                     :fibo-fbc-pas-crd/CardValidationCode
                     {:owl/onDataRange :xsd/string,
                      :owl/onProperty  :fibo-fnd-rel-rel/hasTag,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-fbc-pas-crd/PaymentCard,
                      :rdf/type           :owl/Restriction}
                     :cmns-cds/CodeElement
                     :fibo-fbc-pas-crd/CardVerificationCodeOrValue],
   :skos/definition
   "card verification code specifically for Mastercard payment cards"})

(def CardValidationCode2
  "card verification value specifically for Mastercard payment cards"
  {:cmns-av/abbreviation "PAN CVC2",
   :cmns-av/adaptedFrom
   "https://www.pcisecuritystandards.org/pci_security/glossary",
   :db/ident :fibo-fbc-pas-crd/CardValidationCode2,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/CardAccounts/",
   :rdfs/label "card validation code 2",
   :rdfs/subClassOf [:fibo-fbc-pas-crd/ThreeDigitVerificationCodeOrValue
                     :fibo-fbc-pas-crd/CardValidationCode2
                     {:owl/onDataRange :xsd/string,
                      :owl/onProperty  :fibo-fnd-rel-rel/hasTag,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-fbc-pas-crd/PaymentCard,
                      :rdf/type           :owl/Restriction}
                     :cmns-cds/CodeElement
                     :fibo-fbc-pas-crd/CardVerificationCodeOrValue],
   :skos/definition
   "card verification value specifically for Mastercard payment cards"})

(def CardVerificationCodeOrValue
  "code that specifies either (1) magnetic-stripe data, or (2) printed security features that are used to protect data integrity and limit alteration, counterfeiting and fraud generally"
  {:cmns-av/adaptedFrom
   "https://www.pcisecuritystandards.org/pci_security/glossary",
   :db/ident :fibo-fbc-pas-crd/CardVerificationCodeOrValue,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/CardAccounts/",
   :rdfs/label "card verification code or value",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-fbc-pas-crd/PaymentCard,
                      :rdf/type           :owl/Restriction}
                     {:owl/onDataRange :xsd/string,
                      :owl/onProperty  :fibo-fnd-rel-rel/hasTag,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     :cmns-cds/CodeElement
                     :fibo-fbc-pas-crd/CardVerificationCodeOrValue],
   :skos/definition
   "code that specifies either (1) magnetic-stripe data, or (2) printed security features that are used to protect data integrity and limit alteration, counterfeiting and fraud generally"})

(def CardVerificationValue
  "card verification value specifically for Visa and Discover payment cards"
  {:cmns-av/abbreviation "CVV",
   :cmns-av/adaptedFrom
   "https://www.pcisecuritystandards.org/pci_security/glossary",
   :db/ident :fibo-fbc-pas-crd/CardVerificationValue,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/CardAccounts/",
   :rdfs/label "card verification value",
   :rdfs/subClassOf [:fibo-fbc-pas-crd/MagneticStripeVerificationCodeOrValue
                     :fibo-fbc-pas-crd/CardVerificationValue
                     {:owl/onDataRange :xsd/string,
                      :owl/onProperty  :fibo-fnd-rel-rel/hasTag,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-fbc-pas-crd/PaymentCard,
                      :rdf/type           :owl/Restriction}
                     :cmns-cds/CodeElement
                     :fibo-fbc-pas-crd/CardVerificationCodeOrValue],
   :skos/definition
   "card verification value specifically for Visa and Discover payment cards"})

(def CardVerificationValue2
  "card verification value specifically for Visa payment cards"
  {:cmns-av/adaptedFrom
   "https://www.pcisecuritystandards.org/pci_security/glossary",
   :cmns-av/synonym "CVV2",
   :db/ident :fibo-fbc-pas-crd/CardVerificationValue2,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/CardAccounts/",
   :rdfs/label "card verification value 2",
   :rdfs/subClassOf [:fibo-fbc-pas-crd/ThreeDigitVerificationCodeOrValue
                     :fibo-fbc-pas-crd/CardVerificationValue2
                     {:owl/onDataRange :xsd/string,
                      :owl/onProperty  :fibo-fnd-rel-rel/hasTag,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-fbc-pas-crd/PaymentCard,
                      :rdf/type           :owl/Restriction}
                     :cmns-cds/CodeElement
                     :fibo-fbc-pas-crd/CardVerificationCodeOrValue],
   :skos/definition
   "card verification value specifically for Visa payment cards"})

(def Cardholder
  "account holder to whom a payment card is issued"
  {:cmns-av/adaptedFrom
   "https://www.pcisecuritystandards.org/pci_security/glossary",
   :db/ident :fibo-fbc-pas-crd/Cardholder,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/CardAccounts/",
   :rdfs/label "cardholder",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-rel-rel/holds,
     :owl/someValuesFrom :fibo-fbc-pas-crd/CardAccount,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-pty-rl/isPlayedBy,
     :owl/someValuesFrom {:owl/onProperty     :fibo-fnd-pty-pty/isAPartyTo,
                          :owl/someValuesFrom :fibo-fbc-pas-crd/CardAccount,
                          :rdf/type           :owl/Restriction},
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-pty-rl/isPlayedBy,
     :owl/someValuesFrom {:owl/onProperty     :fibo-fnd-oac-own/owns,
                          :owl/someValuesFrom :fibo-fbc-pas-crd/CardAccount,
                          :rdf/type           :owl/Restriction},
     :rdf/type           :owl/Restriction}
    :fibo-fbc-pas-caa/CustomerAccountHolder
    :fibo-fbc-pas-crd/Cardholder],
   :skos/definition "account holder to whom a payment card is issued"})

(def CreditCard
  "card issued by a financial service provider that enables the cardholder to borrow funds"
  {:cmns-av/explanatoryNote
   "Issuance of credit cards has the condition that the cardholder will pay back the original, borrowed amount plus any additional agreed-upon charges. The credit company provider may also grant a line of credit (LOC) to the cardholder which allows the holder to borrow money in the form of a cash advance. The issuer pre-sets borrowing limits which have a basis on the individual's credit rating.",
   :db/ident :fibo-fbc-pas-crd/CreditCard,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/CardAccounts/",
   :rdfs/label "credit card",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-cls/isClassifiedBy,
                      :owl/someValuesFrom :fibo-fbc-pas-crd/CreditCardProduct,
                      :rdf/type           :owl/Restriction}
                     {:owl/onClass    :fibo-fbc-pas-crd/CreditCardAccount,
                      :owl/onProperty :fibo-fnd-agr-ctr/isEvidenceFor,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-pas-crd/PaymentCard
                     :fibo-fbc-pas-crd/CreditCard
                     {:owl/onProperty     :fibo-fnd-agr-ctr/isEvidenceFor,
                      :owl/someValuesFrom :fibo-fbc-pas-crd/CardAccount,
                      :rdf/type           :owl/Restriction}
                     {:owl/onClass    :fibo-fbc-pas-crd/CardExpirationDate,
                      :owl/onProperty :fibo-fnd-arr-doc/hasExpirationDate,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-arr-doc/LegalDocument
                     {:owl/onClass :fibo-fbc-pas-crd/PrimaryCardAccountNumber,
                      :owl/onProperty :fibo-fbc-pas-crd/hasPrimaryAccountNumber,
                      :owl/qualifiedCardinality 1,
                      :rdf/type :owl/Restriction}
                     {:owl/onClass
                      :fibo-fbc-pas-crd/CardVerificationCodeOrValue,
                      :owl/onProperty :fibo-fbc-pas-crd/hasCardVerificationCode,
                      :owl/qualifiedCardinality 1,
                      :rdf/type :owl/Restriction}],
   :skos/definition
   "card issued by a financial service provider that enables the cardholder to borrow funds"})

(def CreditCardAccount
  "card account whose terms and conditions are defined in a credit card agreement that is represented by a credit card"
  {:db/ident :fibo-fbc-pas-crd/CreditCardAccount,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/CardAccounts/",
   :rdfs/label "credit card account",
   :rdfs/subClassOf
   [:fibo-fbc-pas-caa/LoanOrCreditAccount
    {:owl/onProperty     :fibo-fbc-pas-caa/hasPaymentDueDate,
     :owl/someValuesFrom :fibo-fbc-pas-caa/PaymentDueDate,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :cmns-dsg/isDefinedIn,
     :owl/someValuesFrom :fibo-fbc-pas-crd/CreditCardAgreement,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :cmns-dsg/isSignifiedBy,
     :owl/someValuesFrom :fibo-fbc-pas-crd/CreditCard,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-pas-crd/CardAccount
    {:owl/onProperty     :fibo-fbc-pas-caa/realizes,
     :owl/someValuesFrom :fibo-fbc-pas-crd/CreditCardProduct,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-pas-crd/CreditCardAccount
    {:owl/onProperty     :fibo-fbc-pas-caa/realizes,
     :owl/someValuesFrom :fibo-fbc-pas-crd/CardProduct,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :cmns-id/isIdentifiedBy,
     :owl/someValuesFrom :fibo-fbc-pas-crd/PrimaryCardAccountNumber,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :cmns-dsg/isDefinedIn,
     :owl/someValuesFrom :fibo-fbc-pas-crd/PaymentCardAgreement,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fbc-pas-caa/hasPrimaryAccountHolder,
     :owl/someValuesFrom :fibo-fbc-pas-crd/Cardholder,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-caa/CustomerAccount,
     :owl/onProperty :fibo-fbc-pas-caa/isLinkedToAccount,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-pas-caa/CustomerAccount
    {:owl/onProperty     :cmns-dsg/isSignifiedBy,
     :owl/someValuesFrom :fibo-fbc-pas-crd/PaymentCard,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   "card account whose terms and conditions are defined in a credit card agreement that is represented by a credit card"})

(def CreditCardAgreement
  "account-specific credit facility that specifies the terms and conditions under which the credit card is offered to the cardholder by the issuer"
  {:db/ident :fibo-fbc-pas-crd/CreditCardAgreement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/CardAccounts/",
   :rdfs/label "credit card agreement",
   :rdfs/subClassOf
   [{:owl/onProperty     :cmns-cxtdsg/appliesTo,
     :owl/someValuesFrom :fibo-fbc-pas-crd/CreditCardAccount,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-dae-dbt/CommittedCreditFacility
    :fibo-fbc-pas-crd/PaymentCardAgreement
    {:owl/onProperty     :fibo-fbc-dae-dbt/hasBorrower,
     :owl/someValuesFrom :fibo-fbc-pas-crd/Cardholder,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-agr-ctr/isEvidencedBy,
     :owl/someValuesFrom :fibo-fbc-pas-crd/CreditCard,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fbc-dae-dbt/hasLender,
     :owl/someValuesFrom :fibo-fbc-pas-crd/IssuingFinancialInstitution,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-pas-crd/CreditCardAgreement
    :fibo-fbc-dae-dbt/CreditAgreement
    {:owl/onProperty     :fibo-fnd-agr-ctr/hasContractParty,
     :owl/someValuesFrom :fibo-fbc-pas-crd/Cardholder,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-pas-caa/AccountSpecificServiceAgreement
    {:owl/onProperty     :fibo-fnd-agr-ctr/isEvidencedBy,
     :owl/someValuesFrom :fibo-fbc-pas-crd/PaymentCard,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-agr-ctr/hasContractParty,
     :owl/someValuesFrom :fibo-fbc-pas-crd/IssuingFinancialInstitution,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :cmns-cxtdsg/appliesTo,
     :owl/someValuesFrom :fibo-fbc-pas-crd/CardAccount,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   "account-specific credit facility that specifies the terms and conditions under which the credit card is offered to the cardholder by the issuer"})

(def CreditCardNetwork
  "classifier for the network that authorizes, processes, and sets the terms of credit card transactions, as well as transfers payments between shoppers, merchants, and their banks"
  {:db/ident :fibo-fbc-pas-crd/CreditCardNetwork,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/CardAccounts/",
   :rdfs/label "credit card network",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-cls/classifies,
                      :owl/someValuesFrom :fibo-fbc-pas-crd/CardProduct,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-rel-rel/hasTag,
                      :owl/someValuesFrom :xsd/string,
                      :rdf/type           :owl/Restriction}
                     :cmns-cls/Classifier
                     :fibo-fbc-pas-crd/CreditCardNetwork],
   :skos/definition
   "classifier for the network that authorizes, processes, and sets the terms of credit card transactions, as well as transfers payments between shoppers, merchants, and their banks",
   :skos/example "Mastercard, Visa, American Express, Discover"})

(def CreditCardProduct
  "card product allowing the holder to purchase goods or services on credit"
  {:db/ident :fibo-fbc-pas-crd/CreditCardProduct,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/CardAccounts/",
   :rdfs/label "credit card product",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-cls/classifies,
                      :owl/someValuesFrom :fibo-fbc-pas-crd/CreditCard,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fbc-pas-caa/isRealizedBy,
                      :owl/someValuesFrom :fibo-fbc-pas-crd/CreditCardAccount,
                      :rdf/type           :owl/Restriction}
                     {:owl/onClass    :fibo-fbc-pas-crd/CreditCardNetwork,
                      :owl/onProperty :fibo-fbc-pas-crd/hasCreditCardNetwork,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-pas-crd/CardProduct
                     :fibo-fbc-pas-crd/CreditCardProduct
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :lcc-cr/CountrySubdivision,
                      :owl/onProperty :fibo-fnd-plc-loc/hasSubdivision,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-pas-fpas/FinancialProduct
                     {:owl/onClass    :lcc-cr/Country,
                      :owl/onProperty :fibo-fnd-plc-loc/hasCountry,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-fnd-acc-cur/Currency,
                      :owl/onProperty :fibo-fbc-pas-crd/usesCurrency,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-fbc-pas-caa/isRealizedBy,
                      :owl/someValuesFrom :fibo-fbc-pas-crd/CardAccount,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fbc-pas-crd/CreditCardNetwork,
                      :owl/onProperty :fibo-fbc-pas-crd/hasCreditCardNetwork,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "card product allowing the holder to purchase goods or services on credit"})

(def DebitCard
  "payment card issued by a financial service provider that enables the cardholder to access funds in a demand deposit account"
  {:db/ident :fibo-fbc-pas-crd/DebitCard,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/CardAccounts/",
   :rdfs/label "debit card",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-cls/isClassifiedBy,
                      :owl/someValuesFrom :fibo-fbc-pas-crd/DebitCardProduct,
                      :rdf/type           :owl/Restriction}
                     {:owl/onClass    :fibo-fbc-pas-crd/DebitCardAccount,
                      :owl/onProperty :fibo-fnd-agr-ctr/isEvidenceFor,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-pas-crd/PaymentCard
                     :fibo-fbc-pas-crd/DebitCard
                     {:owl/onProperty     :fibo-fnd-agr-ctr/isEvidenceFor,
                      :owl/someValuesFrom :fibo-fbc-pas-crd/CardAccount,
                      :rdf/type           :owl/Restriction}
                     {:owl/onClass    :fibo-fbc-pas-crd/CardExpirationDate,
                      :owl/onProperty :fibo-fnd-arr-doc/hasExpirationDate,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-arr-doc/LegalDocument
                     {:owl/onClass :fibo-fbc-pas-crd/PrimaryCardAccountNumber,
                      :owl/onProperty :fibo-fbc-pas-crd/hasPrimaryAccountNumber,
                      :owl/qualifiedCardinality 1,
                      :rdf/type :owl/Restriction}
                     {:owl/onClass
                      :fibo-fbc-pas-crd/CardVerificationCodeOrValue,
                      :owl/onProperty :fibo-fbc-pas-crd/hasCardVerificationCode,
                      :owl/qualifiedCardinality 1,
                      :rdf/type :owl/Restriction}],
   :skos/definition
   "payment card issued by a financial service provider that enables the cardholder to access funds in a demand deposit account"})

(def DebitCardAccount
  "card account that is represented by a one or more debit cards"
  {:db/ident :fibo-fbc-pas-crd/DebitCardAccount,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/CardAccounts/",
   :rdfs/label "debit card account",
   :rdfs/subClassOf
   [{:owl/onProperty     :cmns-dsg/isSignifiedBy,
     :owl/someValuesFrom :fibo-fbc-pas-crd/DebitCard,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fbc-pas-caa/realizes,
     :owl/someValuesFrom :fibo-fbc-pas-crd/DebitCardProduct,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-pas-crd/CardAccount
    :fibo-fbc-pas-crd/DebitCardAccount
    {:owl/onProperty     :fibo-fbc-pas-caa/realizes,
     :owl/someValuesFrom :fibo-fbc-pas-crd/CardProduct,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :cmns-id/isIdentifiedBy,
     :owl/someValuesFrom :fibo-fbc-pas-crd/PrimaryCardAccountNumber,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :cmns-dsg/isDefinedIn,
     :owl/someValuesFrom :fibo-fbc-pas-crd/PaymentCardAgreement,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-caa/CustomerAccount,
     :owl/onProperty :fibo-fbc-pas-caa/isLinkedToAccount,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-pas-caa/CustomerAccount
    {:owl/onProperty     :fibo-fbc-pas-caa/hasPrimaryAccountHolder,
     :owl/someValuesFrom :fibo-fbc-pas-crd/Cardholder,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :cmns-dsg/isSignifiedBy,
     :owl/someValuesFrom :fibo-fbc-pas-crd/PaymentCard,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   "card account that is represented by a one or more debit cards"})

(def DebitCardProduct
  "card product card typically provided by a depository institution allowing the holder to transfer money electronically to another account when making a purchase"
  {:db/ident :fibo-fbc-pas-crd/DebitCardProduct,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/CardAccounts/",
   :rdfs/label "debit card product",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-cls/classifies,
                      :owl/someValuesFrom :fibo-fbc-pas-crd/DebitCard,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fbc-pas-caa/isRealizedBy,
                      :owl/someValuesFrom :fibo-fbc-pas-crd/DebitCardAccount,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-pas-crd/CardProduct
                     :fibo-fbc-pas-crd/DebitCardProduct
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :lcc-cr/CountrySubdivision,
                      :owl/onProperty :fibo-fnd-plc-loc/hasSubdivision,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-pas-fpas/FinancialProduct
                     {:owl/onClass    :lcc-cr/Country,
                      :owl/onProperty :fibo-fnd-plc-loc/hasCountry,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-fnd-acc-cur/Currency,
                      :owl/onProperty :fibo-fbc-pas-crd/usesCurrency,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-fbc-pas-caa/isRealizedBy,
                      :owl/someValuesFrom :fibo-fbc-pas-crd/CardAccount,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fbc-pas-crd/CreditCardNetwork,
                      :owl/onProperty :fibo-fbc-pas-crd/hasCreditCardNetwork,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "card product card typically provided by a depository institution allowing the holder to transfer money electronically to another account when making a purchase"})

(def DiscoverNetwork
  "credit card network and card issuer offering benefits like secondary rental car collision insurance"
  {:db/ident :fibo-fbc-pas-crd/DiscoverNetwork,
   :rdf/type [:fibo-fbc-pas-crd/CreditCardNetwork
              :owl/NamedIndividual
              {:owl/onProperty     :fibo-fnd-rel-rel/hasTag,
               :owl/someValuesFrom :xsd/string,
               :rdf/type           :owl/Restriction}
              {:owl/onProperty     :cmns-cls/classifies,
               :owl/someValuesFrom :fibo-fbc-pas-crd/CardProduct,
               :rdf/type           :owl/Restriction}
              :cmns-cls/Classifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/CardAccounts/",
   :rdfs/label "Discover network",
   :skos/definition
   "credit card network and card issuer offering benefits like secondary rental car collision insurance"})

(def IssuingFinancialInstitution
  "issuer and financial services provider that issues payment cards or performs, facilitates, or supports issuing services including but not limited to issuing banks and issuing processors"
  {:cmns-av/adaptedFrom
   "https://www.pcisecuritystandards.org/pci_security/glossary",
   :cmns-av/synonym "issuing bank",
   :db/ident :fibo-fbc-pas-crd/IssuingFinancialInstitution,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/CardAccounts/",
   :rdfs/label "issuing financial institution",
   :rdfs/subClassOf [:fibo-fbc-pas-fpas/FinancialServiceProvider
                     :fibo-fbc-fi-fi/Issuer
                     :fibo-fbc-pas-crd/IssuingFinancialInstitution],
   :skos/definition
   "issuer and financial services provider that issues payment cards or performs, facilitates, or supports issuing services including but not limited to issuing banks and issuing processors"})

(def JCBNetwork
  "credit card network based in Japan, with coverage throughout Asia, with strategic partners worldwide"
  {:cmns-av/explanatoryNote
   "JCB Co., Ltd., (formerly Japan Credit Bureau) is a credit card company based in Tokyo, Japan. As of 2020, it operates in 23 countries with over 130 million customers. In the United States, it is not a primary credit card network but has an association with the Discover Network to enable use of JCB cards.",
   :db/ident :fibo-fbc-pas-crd/JCBNetwork,
   :rdf/type [:fibo-fbc-pas-crd/CreditCardNetwork
              :owl/NamedIndividual
              {:owl/onProperty     :fibo-fnd-rel-rel/hasTag,
               :owl/someValuesFrom :xsd/string,
               :rdf/type           :owl/Restriction}
              {:owl/onProperty     :cmns-cls/classifies,
               :owl/someValuesFrom :fibo-fbc-pas-crd/CardProduct,
               :rdf/type           :owl/Restriction}
              :cmns-cls/Classifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/CardAccounts/",
   :rdfs/label "JCB network",
   :skos/definition
   "credit card network based in Japan, with coverage throughout Asia, with strategic partners worldwide"})

(def MagneticStripeVerificationCodeOrValue
  "card verification code on a card's magnetic stripe that uses secure cryptographic processes to protect data integrity on the stripe, and reveals any alteration or counterfeiting"
  {:cmns-av/adaptedFrom
   "https://www.pcisecuritystandards.org/pci_security/glossary",
   :db/ident :fibo-fbc-pas-crd/MagneticStripeVerificationCodeOrValue,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/CardAccounts/",
   :rdfs/label "magnetic stripe verification code or value",
   :rdfs/subClassOf [:fibo-fbc-pas-crd/CardVerificationCodeOrValue
                     :fibo-fbc-pas-crd/MagneticStripeVerificationCodeOrValue
                     {:owl/onDataRange :xsd/string,
                      :owl/onProperty  :fibo-fnd-rel-rel/hasTag,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-fbc-pas-crd/PaymentCard,
                      :rdf/type           :owl/Restriction}
                     :cmns-cds/CodeElement],
   :skos/definition
   "card verification code on a card's magnetic stripe that uses secure cryptographic processes to protect data integrity on the stripe, and reveals any alteration or counterfeiting"})

(def MastercardNetwork
  "credit card network that has its own suite of card protections and benefits, such as identity theft protection and extended warranties"
  {:db/ident :fibo-fbc-pas-crd/MastercardNetwork,
   :rdf/type [:fibo-fbc-pas-crd/CreditCardNetwork
              :owl/NamedIndividual
              {:owl/onProperty     :fibo-fnd-rel-rel/hasTag,
               :owl/someValuesFrom :xsd/string,
               :rdf/type           :owl/Restriction}
              {:owl/onProperty     :cmns-cls/classifies,
               :owl/someValuesFrom :fibo-fbc-pas-crd/CardProduct,
               :rdf/type           :owl/Restriction}
              :cmns-cls/Classifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/CardAccounts/",
   :rdfs/label "Mastercard network",
   :skos/definition
   "credit card network that has its own suite of card protections and benefits, such as identity theft protection and extended warranties"})

(def PaymentCard
  "legal document issued by a financial services provider that enables the cardholder to access the funds in the customer's designated bank accounts, or through a credit account and make payments by electronic funds transfer and access automated teller machines (ATMs)"
  {:cmns-av/explanatoryNote
   ["The term payment card includes credit cards, debit cards, and stored-value cards, as well as payment through any distinctive marks of a payment card (such as a credit card number). A payment card is issued under an agreement that provides standards and mechanisms for settling the transactions between a merchant acquiring bank or similar entity and the providers who accept the cards as payment."
    "For purposes of Payment Card Industry Data Security Standard (PCI DSS), a payment card is any payment card/device that bears the logo of the founding members of PCI SSC, which are American Express, Discover Financial Services, JCB International, MasterCard, or Visa, Inc."],
   :db/ident :fibo-fbc-pas-crd/PaymentCard,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/CardAccounts/",
   :rdfs/label "payment card",
   :rdfs/seeAlso
   ["https://www.irs.gov/payments/payment-card-transactions-faqs"],
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-agr-ctr/isEvidenceFor,
                      :owl/someValuesFrom :fibo-fbc-pas-crd/CardAccount,
                      :rdf/type           :owl/Restriction}
                     {:owl/onClass    :fibo-fbc-pas-crd/CardExpirationDate,
                      :owl/onProperty :fibo-fnd-arr-doc/hasExpirationDate,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass
                      :fibo-fbc-pas-crd/CardVerificationCodeOrValue,
                      :owl/onProperty :fibo-fbc-pas-crd/hasCardVerificationCode,
                      :owl/qualifiedCardinality 1,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-arr-doc/LegalDocument
                     {:owl/onClass :fibo-fbc-pas-crd/PrimaryCardAccountNumber,
                      :owl/onProperty :fibo-fbc-pas-crd/hasPrimaryAccountNumber,
                      :owl/qualifiedCardinality 1,
                      :rdf/type :owl/Restriction}
                     :fibo-fbc-pas-crd/PaymentCard],
   :skos/definition
   "legal document issued by a financial services provider that enables the cardholder to access the funds in the customer's designated bank accounts, or through a credit account and make payments by electronic funds transfer and access automated teller machines (ATMs)"})

(def PaymentCardAgreement
  "account-specific credit agreement that specifies the terms and conditions under which the payment card is offered to the cardholder by the issuer"
  {:db/ident :fibo-fbc-pas-crd/PaymentCardAgreement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/CardAccounts/",
   :rdfs/label "payment card agreement",
   :rdfs/subClassOf [:fibo-fbc-dae-dbt/CreditAgreement
                     :fibo-fbc-pas-caa/AccountSpecificServiceAgreement
                     {:owl/onProperty     :fibo-fnd-agr-ctr/hasContractParty,
                      :owl/someValuesFrom :fibo-fbc-pas-crd/Cardholder,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-fbc-pas-crd/CardAccount,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-agr-ctr/isEvidencedBy,
                      :owl/someValuesFrom :fibo-fbc-pas-crd/PaymentCard,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-fnd-agr-ctr/hasContractParty,
                      :owl/someValuesFrom
                      :fibo-fbc-pas-crd/IssuingFinancialInstitution,
                      :rdf/type :owl/Restriction}
                     :fibo-fbc-pas-crd/PaymentCardAgreement],
   :skos/definition
   "account-specific credit agreement that specifies the terms and conditions under which the payment card is offered to the cardholder by the issuer"})

(def PrimaryCardAccountNumber
  "composite identifier of 14 or 16 digits embossed on a bank or payment card and encoded in the card's magnetic strip"
  {:cmns-av/abbreviation "PAN",
   :cmns-av/explanatoryNote
   "The PAN identifies the issuer of the card and the account including part of the account number, and contains a check digit that verifies the authenticity of the embossed account number.",
   :cmns-av/synonym "primary account number",
   :db/ident :fibo-fbc-pas-crd/PrimaryCardAccountNumber,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/CardAccounts/",
   :rdfs/label "primary card account number",
   :rdfs/subClassOf [{:owl/onClass    :fibo-fbc-pas-crd/CardAccount,
                      :owl/onProperty :cmns-id/identifies,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-pas-caa/AccountIdentifier
                     :fibo-fbc-pas-crd/PrimaryCardAccountNumber],
   :skos/definition
   "composite identifier of 14 or 16 digits embossed on a bank or payment card and encoded in the card's magnetic strip"})

(def SmartCard
  "payment card that has integrated circuits embedded within it"
  {:cmns-av/adaptedFrom
   "https://www.pcisecuritystandards.org/pci_security/glossary",
   :cmns-av/explanatoryNote
   "The circuits, also referred to as the 'chip,' contain payment card data including but not limited to data equivalent to the magnetic-stripe data.",
   :db/ident :fibo-fbc-pas-crd/SmartCard,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/CardAccounts/",
   :rdfs/label "smart card",
   :rdfs/subClassOf [:fibo-fbc-pas-crd/PaymentCard
                     :fibo-fbc-pas-crd/SmartCard
                     {:owl/onProperty     :fibo-fnd-agr-ctr/isEvidenceFor,
                      :owl/someValuesFrom :fibo-fbc-pas-crd/CardAccount,
                      :rdf/type           :owl/Restriction}
                     {:owl/onClass    :fibo-fbc-pas-crd/CardExpirationDate,
                      :owl/onProperty :fibo-fnd-arr-doc/hasExpirationDate,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-arr-doc/LegalDocument
                     {:owl/onClass :fibo-fbc-pas-crd/PrimaryCardAccountNumber,
                      :owl/onProperty :fibo-fbc-pas-crd/hasPrimaryAccountNumber,
                      :owl/qualifiedCardinality 1,
                      :rdf/type :owl/Restriction}
                     {:owl/onClass
                      :fibo-fbc-pas-crd/CardVerificationCodeOrValue,
                      :owl/onProperty :fibo-fbc-pas-crd/hasCardVerificationCode,
                      :owl/qualifiedCardinality 1,
                      :rdf/type :owl/Restriction}],
   :skos/definition
   "payment card that has integrated circuits embedded within it"})

(def ThreeDigitVerificationCodeOrValue
  "card verification code that is the rightmost three-digit value printed in the signature panel area on the back of the card"
  {:cmns-av/adaptedFrom
   "https://www.pcisecuritystandards.org/pci_security/glossary",
   :db/ident :fibo-fbc-pas-crd/ThreeDigitVerificationCodeOrValue,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/CardAccounts/",
   :rdfs/label "three-digit verification code or value",
   :rdfs/subClassOf [:fibo-fbc-pas-crd/CardVerificationCodeOrValue
                     :fibo-fbc-pas-crd/ThreeDigitVerificationCodeOrValue
                     {:owl/onDataRange :xsd/string,
                      :owl/onProperty  :fibo-fnd-rel-rel/hasTag,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-fbc-pas-crd/PaymentCard,
                      :rdf/type           :owl/Restriction}
                     :cmns-cds/CodeElement],
   :skos/definition
   "card verification code that is the rightmost three-digit value printed in the signature panel area on the back of the card"})

(def VisaNetwork
  "credit card network that oversees the Visa Signature benefits associated with certain credit cards, such as premium rental car privileges and hotel perks"
  {:db/ident :fibo-fbc-pas-crd/VisaNetwork,
   :rdf/type [:fibo-fbc-pas-crd/CreditCardNetwork
              :owl/NamedIndividual
              {:owl/onProperty     :fibo-fnd-rel-rel/hasTag,
               :owl/someValuesFrom :xsd/string,
               :rdf/type           :owl/Restriction}
              {:owl/onProperty     :cmns-cls/classifies,
               :owl/someValuesFrom :fibo-fbc-pas-crd/CardProduct,
               :rdf/type           :owl/Restriction}
              :cmns-cls/Classifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/CardAccounts/",
   :rdfs/label "Visa network",
   :skos/definition
   "credit card network that oversees the Visa Signature benefits associated with certain credit cards, such as premium rental car privileges and hotel perks"})

(def hasCardVerificationCode
  "links a credit card to either: (1) magnetic-stripe data, or (2) printed security features that are used to protect data integrity and limit alteration, counterfeiting and fraud generally"
  {:db/ident :fibo-fbc-pas-crd/hasCardVerificationCode,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-pas-crd/PaymentCard,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/CardAccounts/",
   :rdfs/label "has card verification code",
   :rdfs/range :fibo-fbc-pas-crd/CardVerificationCodeOrValue,
   :skos/definition
   "links a credit card to either: (1) magnetic-stripe data, or (2) printed security features that are used to protect data integrity and limit alteration, counterfeiting and fraud generally"})

(def hasCreditCardNetwork
  "indicates the underlying network for credit card product"
  {:db/ident :fibo-fbc-pas-crd/hasCreditCardNetwork,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/CardAccounts/",
   :rdfs/label "has credit card network",
   :rdfs/range :fibo-fbc-pas-crd/CreditCardNetwork,
   :rdfs/subPropertyOf [:cmns-cls/isClassifiedBy
                        :fibo-fbc-pas-crd/hasCreditCardNetwork],
   :skos/definition "indicates the underlying network for credit card product"})

(def hasPrimaryAccountNumber
  "specifies the account number displayed on the face of the card"
  {:db/ident :fibo-fbc-pas-crd/hasPrimaryAccountNumber,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-pas-crd/PaymentCard,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/CardAccounts/",
   :rdfs/label "has primary account number",
   :rdfs/range :fibo-fbc-pas-crd/PrimaryCardAccountNumber,
   :skos/definition
   "specifies the account number displayed on the face of the card",
   :skos/editorialNote
   "modeled independently of 'identifies' in order to circumvent circular reasoning challenges"})

(def usesCurrency
  "indicates the currency defined for the credit card product"
  {:db/ident :fibo-fbc-pas-crd/usesCurrency,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/CardAccounts/",
   :rdfs/label "uses currency",
   :rdfs/range :fibo-fnd-acc-cur/Currency,
   :rdfs/subPropertyOf [:cmns-cxtdsg/uses :fibo-fbc-pas-crd/usesCurrency],
   :skos/definition
   "indicates the currency defined for the credit card product"})