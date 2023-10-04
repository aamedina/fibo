(ns net.wikipunk.rdf.fibo-loan-spc-prod
  ^{:base
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/LoanProducts/",
    :namespaces
    {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
     "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
     "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
     "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
     "dcterms" "http://purl.org/dc/terms/",
     "fibo-fbc-dae-dbt"
     "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
     "fibo-fbc-pas-caa"
     "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
     "fibo-fbc-pas-fpas"
     "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
     "fibo-fnd-acc-cur"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
     "fibo-fnd-agr-ctr"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
     "fibo-fnd-arr-cls"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/ClassificationSchemes/",
     "fibo-fnd-arr-doc"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/",
     "fibo-fnd-gao-obj"
     "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/Objectives/",
     "fibo-fnd-pas-pas"
     "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/",
     "fibo-fnd-qt-qtu"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/",
     "fibo-fnd-rel-rel"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
     "fibo-fnd-utl-av"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
     "fibo-loan-ln-ln"
     "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/",
     "fibo-loan-ln-reg"
     "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/",
     "fibo-loan-reln-mtg"
     "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
     "fibo-loan-spc-prod"
     "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/LoanProducts/",
     "owl" "http://www.w3.org/2002/07/owl#",
     "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
     "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
     "skos" "http://www.w3.org/2004/02/skos/core#",
     "xsd" "http://www.w3.org/2001/XMLSchema#"},
    :prefix "fibo-loan-spc-prod",
    :source
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/LOAN/LoansSpecific/LoanProducts/"}
  {:cmns-av/copyright "Copyright (c) 2016-2023 EDM Council, Inc.",
   :dcterms/abstract
   "This ontology describes loan and mortgage loan products. A product as defined here is something marketed and offered for sale, in this case a loan, such that when a customer takes on the product, they become signatories to a corresponding loan contract. A loan product in this sense is a contractual , off-the-shelf product with terms corresponding to those in the actual contract when it is signed.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/LOAN/LoansGeneral/Loans/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Arrangements/ClassificationSchemes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Quantities/QuantitiesAndUnits/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/ProductsAndServices/ClientsAndAccounts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/Analytics/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/GoalsAndObjectives/Objectives/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/DebtAndEquities/Debt/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/LOAN/RealEstateLoans/MortgageLoans/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/LOAN/LoansGeneral/LoansRegulatory/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Arrangements/Documents/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/ProductsAndServices/ProductsAndServices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/ProductsAndServices/FinancialProductsAndServices/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/LOAN/LoansSpecific/LoanProducts/"},
   :rdf/type :owl/Ontology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Loan Products Ontology"},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/LoanProducts/"})

(def AutoLoanPurpose
  {:db/ident :fibo-loan-spc-prod/AutoLoanPurpose,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/LoanProducts/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "auto loan purpose"},
   :rdfs/subClassOf :fibo-loan-spc-prod/LoanPurpose})

(def BridgingLoanPurpose
  {:db/ident :fibo-loan-spc-prod/BridgingLoanPurpose,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/LoanProducts/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "bridging loan purpose"},
   :rdfs/subClassOf :fibo-loan-spc-prod/LoanPurpose})

(def ConstructionLoanPurpose
  {:db/ident :fibo-loan-spc-prod/ConstructionLoanPurpose,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/LoanProducts/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "construction loan purpose"},
   :rdfs/subClassOf :fibo-loan-spc-prod/LoanPurpose})

(def CreditCardReceivablePurpose
  {:db/ident :fibo-loan-spc-prod/CreditCardReceivablePurpose,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/LoanProducts/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "credit card receivable purpose"},
   :rdfs/subClassOf :fibo-loan-spc-prod/LoanPurpose})

(def HomeEquityLoanPurpose
  {:db/ident :fibo-loan-spc-prod/HomeEquityLoanPurpose,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/LoanProducts/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "home equity loan purpose"},
   :rdfs/subClassOf :fibo-loan-spc-prod/LoanPurpose})

(def LineItem
  {:db/ident :fibo-loan-spc-prod/LineItem,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/LoanProducts/"},
   :rdfs/label "line item",
   :rdfs/subClassOf #{{:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-fnd-acc-cur/MonetaryAmount,
                       :owl/onProperty :fibo-loan-spc-prod/hasUnitCost,
                       :rdf/type       :owl/Restriction}
                      {:owl/onProperty     :fibo-loan-ln-ln/hasCost,
                       :owl/someValuesFrom :fibo-fnd-acc-cur/MonetaryAmount,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty :fibo-fnd-rel-rel/refersTo,
                       :owl/someValuesFrom
                       {:owl/unionOf [:fibo-fnd-pas-pas/Product
                                      :fibo-loan-reln-mtg/ChargeCategory],
                        :rdf/type    :owl/Class},
                       :rdf/type :owl/Restriction} :cmns-col/Constituent
                      {:owl/minQualifiedCardinality 0,
                       :owl/onDataRange :xsd/decimal,
                       :owl/onProperty  :fibo-fnd-qt-qtu/hasNumericValue,
                       :rdf/type        :owl/Restriction}},
   :skos/definition
   "description of a product or service including its unit cost, number of units and total cost",
   :skos/editorialNote
   "Future consideration: move this to ProductsAndServices ontology (fibo-fnd-pas-pas)."})

(def LoanMarketCategory
  {:db/ident :fibo-loan-spc-prod/LoanMarketCategory,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/LoanProducts/"},
   :rdfs/label "loan market category",
   :rdfs/subClassOf :fibo-fnd-arr-cls/IndustrySectorClassifier,
   :skos/definition
   "category indicating the market domain in which the loan product is offered"})

(def LoanMarketCategory-Automobile
  {:db/ident :fibo-loan-spc-prod/LoanMarketCategory-Automobile,
   :rdf/type #{:fibo-loan-spc-prod/LoanMarketCategory :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/LoanProducts/"},
   :rdfs/label "auto loan"})

(def LoanMarketCategory-Commercial
  {:db/ident :fibo-loan-spc-prod/LoanMarketCategory-Commercial,
   :rdf/type #{:fibo-loan-spc-prod/LoanMarketCategory :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/LoanProducts/"},
   :rdfs/label "commercial loan"})

(def LoanMarketCategory-Construction
  {:db/ident :fibo-loan-spc-prod/LoanMarketCategory-Construction,
   :rdf/type #{:fibo-loan-spc-prod/LoanMarketCategory :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/LoanProducts/"},
   :rdfs/label "construction loan"})

(def LoanMarketCategory-Education
  {:db/ident :fibo-loan-spc-prod/LoanMarketCategory-Education,
   :rdf/type #{:fibo-loan-spc-prod/LoanMarketCategory :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/LoanProducts/"},
   :rdfs/label "education loan"})

(def LoanMarketCategory-Mortgage
  {:db/ident :fibo-loan-spc-prod/LoanMarketCategory-Mortgage,
   :rdf/type #{:fibo-loan-spc-prod/LoanMarketCategory :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/LoanProducts/"},
   :rdfs/label "mortgage loan"})

(def LoanMarketCategory-Personal
  {:db/ident :fibo-loan-spc-prod/LoanMarketCategory-Personal,
   :rdf/type #{:fibo-loan-spc-prod/LoanMarketCategory :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/LoanProducts/"},
   :rdfs/label "personal loan"})

(def LoanMarketCategory-SmallBusiness
  {:cmns-av/explanatoryNote
   "This is related to the mortgage loan purpose: 'business or commercial'.",
   :db/ident :fibo-loan-spc-prod/LoanMarketCategory-SmallBusiness,
   :rdf/type #{:fibo-loan-spc-prod/LoanMarketCategory :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/LoanProducts/"},
   :rdfs/label "small business loan"})

(def LoanProduct
  {:db/ident :fibo-loan-spc-prod/LoanProduct,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/LoanProducts/"},
   :rdfs/label "loan product",
   :rdfs/subClassOf #{:fibo-fbc-pas-fpas/FinancialProduct
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-loan-ln-ln/Loan,
                       :owl/onProperty :fibo-fbc-pas-caa/isRealizedBy,
                       :rdf/type       :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-fnd-agr-ctr/ConditionPrecedent,
                       :owl/onProperty :fibo-loan-spc-prod/hasPreconditions,
                       :rdf/type       :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-fbc-dae-dbt/Collateral,
                       :owl/onProperty :fibo-fnd-rel-rel/refersTo,
                       :rdf/type       :owl/Restriction}
                      :fibo-fbc-dae-dbt/CreditFacility},
   :skos/definition
   "financial product that is realized as a loan that a party may acquire from a lending institution with specific characteristics and terms"})

(def LoanProductDisclosureRight
  {:db/ident :fibo-loan-spc-prod/LoanProductDisclosureRight,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/LoanProducts/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "loan product disclosure right"},
   :rdfs/subClassOf :fibo-loan-ln-reg/ProductDisclosureRight,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Right to fair representation of the facts about Loan products before entrering into agreements for same."}})

(def LoanProductOffering
  {:db/ident :fibo-loan-spc-prod/LoanProductOffering,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/LoanProducts/"},
   :rdfs/label "loan offering",
   :rdfs/subClassOf #{{:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-loan-spc-prod/LineItem,
                       :owl/onProperty :cmns-col/hasConstituent,
                       :rdf/type       :owl/Restriction}
                      :fibo-fbc-pas-fpas/Offering
                      {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                       :owl/someValuesFrom :fibo-loan-spc-prod/LoanProduct,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "offering related to a loan product that may be a tailored to particular circumstances, aimed at a group of borrowers or individual borrower"})

(def LoanPurpose
  {:db/ident :fibo-loan-spc-prod/LoanPurpose,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/LoanProducts/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "loan purpose"},
   :rdfs/subClassOf :fibo-fnd-gao-obj/Objective,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A selection of different types of loan purpose, being the purpose for which and manner in which loan (credit) draw-down amounts are to be used. This shows the purpose for which credit is to be used, and implies certain kinds of fact that relate to that specific type of loan e.g. mortgages. These are also identified as tranche types in tranches of a credit facility."}})

(def MortgageProduct
  {:db/ident :fibo-loan-spc-prod/MortgageProduct,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/LoanProducts/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "mortgage product"},
   :rdfs/subClassOf #{{:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-loan-reln-mtg/Mortgage,
                       :owl/onProperty :fibo-fbc-pas-caa/isRealizedBy,
                       :rdf/type       :owl/Restriction}
                      :fibo-loan-spc-prod/LoanProduct}})

(def MotorhomeLoanPurpose
  {:db/ident :fibo-loan-spc-prod/MotorhomeLoanPurpose,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/LoanProducts/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "motorhome loan purpose"},
   :rdfs/subClassOf :fibo-loan-spc-prod/LoanPurpose})

(def OrdinaryLoanPurpose
  {:db/ident :fibo-loan-spc-prod/OrdinaryLoanPurpose,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/LoanProducts/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ordinary loan purpose"},
   :rdfs/subClassOf :fibo-loan-spc-prod/LoanPurpose})

(def OverdraftFacilityPurpose
  {:db/ident :fibo-loan-spc-prod/OverdraftFacilityPurpose,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/LoanProducts/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "overdraft facility purpose"},
   :rdfs/subClassOf :fibo-loan-spc-prod/LoanPurpose})

(def ResidentialHouseboatLoanPurpose
  {:db/ident :fibo-loan-spc-prod/ResidentialHouseboatLoanPurpose,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/LoanProducts/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "residential houseboat loan purpose"},
   :rdfs/subClassOf :fibo-loan-spc-prod/LoanPurpose})

(def StudentLoanPurpose
  {:db/ident :fibo-loan-spc-prod/StudentLoanPurpose,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/LoanProducts/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "student loan purpose"},
   :rdfs/subClassOf :fibo-loan-spc-prod/LoanPurpose})

(def WorkingCapitalPurpose
  {:db/ident :fibo-loan-spc-prod/WorkingCapitalPurpose,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/LoanProducts/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "working capital purpose"},
   :rdfs/subClassOf :fibo-loan-spc-prod/LoanPurpose})

(def hasPreconditions
  {:db/ident :fibo-loan-spc-prod/hasPreconditions,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-loan-spc-prod/LoanProduct,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/LoanProducts/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has preconditions"},
   :rdfs/range :fibo-fnd-agr-ctr/ConditionPrecedent})

(def hasUnitCost
  {:db/ident :fibo-loan-spc-prod/hasUnitCost,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/LoanProducts/"},
   :rdfs/label "has unit cost",
   :rdfs/subPropertyOf :fibo-loan-ln-ln/hasCost,
   :skos/definition "relates an item to its unit cost",
   :skos/editorialNote
   "Future consideration: move this property to ProductsAndServices ontology (fibo-fnd-pas-pas)."})

(def urn:uuid:600ac40a-7a61-5689-b21f-99b0175ad020
  {:cmns-av/copyright "Copyright (c) 2016-2023 EDM Council, Inc.",
   :dcterms/abstract
   "This ontology describes loan and mortgage loan products. A product as defined here is something marketed and offered for sale, in this case a loan, such that when a customer takes on the product, they become signatories to a corresponding loan contract. A loan product in this sense is a contractual , off-the-shelf product with terms corresponding to those in the actual contract when it is signed.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/LOAN/LoansGeneral/Loans/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Arrangements/ClassificationSchemes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Quantities/QuantitiesAndUnits/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/ProductsAndServices/ClientsAndAccounts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/Analytics/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/GoalsAndObjectives/Objectives/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/DebtAndEquities/Debt/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/LOAN/RealEstateLoans/MortgageLoans/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/LOAN/LoansGeneral/LoansRegulatory/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Arrangements/Documents/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/ProductsAndServices/ProductsAndServices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/ProductsAndServices/FinancialProductsAndServices/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/LOAN/LoansSpecific/LoanProducts/"},
   :rdf/type :owl/Ontology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Loan Products Ontology"},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/LoanProducts/"})