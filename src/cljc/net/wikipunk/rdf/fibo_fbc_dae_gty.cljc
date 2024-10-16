(ns net.wikipunk.rdf.fibo-fbc-dae-gty
  {:cmns-av/copyright
   #{"Copyright (c) 2016-2024 EDM Council, Inc."
     "Copyright (c) 2016-2024 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/DebtAndEquities/Guaranty/",
   :dcterms/abstract
   "This ontology defines concepts related to contractual guaranty.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "cmns-pts" "https://www.omg.org/spec/Commons/PartiesAndSituations/",
    "cmns-rlcmp" "https://www.omg.org/spec/Commons/RolesAndCompositions/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-ge-ge"
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/",
    "fibo-be-le-lp"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/",
    "fibo-be-oac-cpty"
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/ControlParties/",
    "fibo-fbc-dae-dbt"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
    "fibo-fbc-dae-gty"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Guaranty/",
    "fibo-fbc-pas-fpas"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
    "fibo-fnd-acc-aeq"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/AccountingEquity/",
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
    "fibo-fnd-agr-agr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreements/",
    "fibo-fnd-agr-ctr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
    "fibo-fnd-arr-doc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/",
    "fibo-fnd-oac-ctl"
    "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Control/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/ProductsAndServices/FinancialProductsAndServices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/OwnershipAndControl/Control/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/OwnershipAndControl/ControlParties/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Agreements/Agreements/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/GovernmentEntities/GovernmentEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Accounting/AccountingEquity/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/DebtAndEquities/Debt/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Arrangements/Documents/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/DebtAndEquities/Guaranty/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fbc-dae-gty",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Guaranty/",
   :rdfs/label "Guaranty Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Guaranty/ version of this ontology was added to the FBC domain via the FIBO 2.0 RFC in support of several FIBO debt-oriented initiatives."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Guaranty.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Guaranty/ version of this ontology revised to incorporate refinement of the concept of a guaranty as needed for debt securities and loans."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Guaranty/ version of this ontology revised to simplify the contract party hierarchy, add properties linking controlled parties to their guarantor, and clean up definitions to eliminate ambiguity, etc."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Guaranty/ version of this ontology revised to make letter of credit a subclass of committed credit facility, and to differentiate financial collateral from physical collateral."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Guaranty.rdf version of this ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Guaranty.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Guaranty/ version of this ontology revised to address text formatting issues uncovered by hygiene testing."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Guaranty/ version of this ontology revised to eliminate duplication of concepts in LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Guaranty/ version of this ontology revised to add financial asset as a parent of letter of credit."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Guaranty/"})

(def CollateralizedGuaranty
  {:cmns-av/explanatoryNote
   "In some cases, the lender may require the borrower to place pledged assets such as cash or securities in a separate account that the lender controls.",
   :db/ident :fibo-fbc-dae-gty/CollateralizedGuaranty,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Guaranty/"},
   :rdfs/label "collateralized guaranty",
   :rdfs/subClassOf #{:fibo-fbc-dae-gty/Guaranty
                      {:owl/onProperty     :fibo-fbc-dae-dbt/isCollateralizedBy,
                       :owl/someValuesFrom :fibo-fbc-dae-dbt/Collateral,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "guaranty that takes the form of some asset that is pledged by a borrower to a lender (usually in return for a loan)"})

(def GovernmentGuaranty
  {:db/ident :fibo-fbc-dae-gty/GovernmentGuaranty,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Guaranty/"},
   :rdfs/label "government guaranty",
   :rdfs/subClassOf
   #{:fibo-fbc-dae-gty/Guaranty
     {:owl/onProperty     :fibo-fbc-dae-gty/isGuaranteedBy,
      :owl/someValuesFrom {:owl/onProperty     :cmns-rlcmp/isPlayedBy,
                           :owl/someValuesFrom :fibo-be-ge-ge/Polity,
                           :rdf/type           :owl/Restriction},
      :rdf/type           :owl/Restriction}},
   :skos/definition
   "guaranty provided by a government entity, such as for a government-backed security"})

(def Guarantor
  {:cmns-av/adaptedFrom
   {:rdf/value
    "Barron's Dictionary of Business and Economics Terms, Fifth Edition, 2012"},
   :cmns-av/explanatoryNote
   "In some cases, the party acting as guarantor may also be a party to the contract, such as in the case of Fannie Mae or Freddie Mac. In such cases, the same individual would be modeled as having both roles.",
   :db/ident :fibo-fbc-dae-gty/Guarantor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Guaranty/"},
   :rdfs/label "guarantor",
   :rdfs/subClassOf
   #{{:owl/onProperty     :cmns-rlcmp/isPlayedBy,
      :owl/someValuesFrom {:owl/onProperty     :cmns-pts/isAPartyTo,
                           :owl/someValuesFrom :fibo-fnd-agr-ctr/Contract,
                           :rdf/type           :owl/Restriction},
      :rdf/type           :owl/Restriction}
     :fibo-be-oac-cpty/DeJureControllingInterestParty
     :fibo-fnd-agr-ctr/ContractThirdParty
     {:owl/allValuesFrom :fibo-be-le-lp/LegalPerson,
      :owl/onProperty    :cmns-rlcmp/isPlayedBy,
      :rdf/type          :owl/Restriction}},
   :skos/definition
   "party that guarantees, endorses, or provides indemnity for some obligation on behalf of some other party"})

(def Guaranty
  {:cmns-av/adaptedFrom
   {:rdf/value
    "Barron's Dictionary of Business and Economics Terms, Fifth Edition, 2012"},
   :cmns-av/explanatoryNote
   "The commitment may cover a debt, cash flows on a debt instrument (such as interest payments), or performance of some obligation.",
   :db/ident :fibo-fbc-dae-gty/Guaranty,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Guaranty/"},
   :rdfs/label "guaranty",
   :rdfs/subClassOf #{{:owl/allValuesFrom :fibo-fnd-acc-cur/MonetaryAmount,
                       :owl/onProperty    :fibo-fbc-dae-gty/hasGuaranteedAmount,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :cmns-dt/Date,
                       :owl/onProperty    :fibo-fnd-arr-doc/hasExpirationDate,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :fibo-fbc-dae-gty/PriorityLevel,
                       :owl/onProperty    :fibo-fbc-dae-gty/hasPriorityLevel,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :cmns-dt/DatePeriod,
                       :owl/onProperty    :cmns-pts/holdsDuring,
                       :rdf/type          :owl/Restriction}
                      {:owl/allValuesFrom :fibo-fbc-dae-gty/Guarantor,
                       :owl/onProperty    :fibo-fbc-dae-gty/isGuaranteedBy,
                       :rdf/type          :owl/Restriction}
                      :fibo-fnd-agr-agr/Commitment},
   :skos/definition
   "commitment whereby something is formally assured if a party with primary liability fails to perform"})

(def InsuranceBackedGuaranty
  {:db/ident :fibo-fbc-dae-gty/InsuranceBackedGuaranty,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Guaranty/"},
   :rdfs/label "insurance-backed guaranty",
   :rdfs/subClassOf #{:fibo-fbc-dae-gty/Guaranty
                      {:owl/onProperty     :fibo-fnd-rel-rel/isExemplifiedBy,
                       :owl/someValuesFrom :fibo-fbc-dae-gty/InsurancePolicy,
                       :rdf/type           :owl/Restriction}},
   :skos/definition "guaranty that is realized as an insurance policy"})

(def InsurancePolicy
  {:db/ident :fibo-fbc-dae-gty/InsurancePolicy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Guaranty/"},
   :rdfs/label "insurance policy",
   :rdfs/subClassOf #{:fibo-fnd-agr-ctr/ContractDocument
                      {:owl/onProperty     :fibo-fnd-rel-rel/isIssuedBy,
                       :owl/someValuesFrom :fibo-fbc-dae-gty/Insurer,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :fibo-fnd-agr-ctr/hasCounterparty,
                       :owl/someValuesFrom :fibo-fbc-dae-gty/Policyholder,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "contract document that (1) puts an indemnity cover into effect, (2) serves as a legal evidence of the insurance agreement, (3) sets out the exact terms on which the indemnity cover has been provided, and (4) states associated information such as the (a) specific risks and perils covered, (b) duration of coverage, (c) amount of premium, (d) mode of premium payment, and (e) deductibles, if any"})

(def Insurer
  {:db/ident :fibo-fbc-dae-gty/Insurer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Guaranty/"},
   :rdfs/label "insurer",
   :rdfs/subClassOf #{:fibo-fbc-pas-fpas/FinancialServiceProvider
                      :fibo-fnd-agr-ctr/ContractPrincipal},
   :skos/definition
   "financial service provider that issues an insurance policy"})

(def JointGuaranty
  {:db/ident :fibo-fbc-dae-gty/JointGuaranty,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Guaranty/"},
   :rdfs/label "joint guaranty",
   :rdfs/subClassOf #{:fibo-fbc-dae-gty/Guaranty
                      {:owl/minQualifiedCardinality 2,
                       :owl/onClass    :fibo-fbc-dae-gty/Guarantor,
                       :owl/onProperty :fibo-fbc-dae-gty/isGuaranteedBy,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "guaranty provided by at least two parties, jointly and severally"})

(def LetterOfCredit
  {:cmns-av/abbreviation "L/C",
   :cmns-av/explanatoryNote
   #{"In the event that the buyer is unable to make payment, the bank or other issuer is required to cover the full or remaining amount."
     "In some states in the U.S., the issuer is not limited to financial institutions -- it is simply a written instrument, addressed by one person to another, requesting the latter to give credit to the person in whose favor it is drawn."},
   :db/ident :fibo-fbc-dae-gty/LetterOfCredit,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Guaranty/"},
   :rdfs/label "letter of credit",
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fnd-rel-rel/isIssuedBy,
                       :owl/someValuesFrom :cmns-pts/PartyRole,
                       :rdf/type           :owl/Restriction}
                      :fibo-fnd-acc-aeq/FinancialAsset
                      :fibo-fbc-dae-dbt/CommittedCreditFacility},
   :skos/definition
   "letter from a bank or other creditworthy institution guaranteeing that a buyer's payment to a seller will be received on time and for the correct amount"})

(def LetterOfCreditGuaranty
  {:db/ident :fibo-fbc-dae-gty/LetterOfCreditGuaranty,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Guaranty/"},
   :rdfs/label "letter of credit guaranty",
   :rdfs/subClassOf #{:fibo-fbc-dae-gty/CollateralizedGuaranty
                      {:owl/onProperty     :fibo-fnd-rel-rel/isExemplifiedBy,
                       :owl/someValuesFrom :fibo-fbc-dae-gty/LetterOfCredit,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "guaranty that takes the form of a letter of credit, i.e., a document issued by a bank guaranteeing the payment up to a stated amount for a specified period"})

(def NegativePledge
  {:db/ident :fibo-fbc-dae-gty/NegativePledge,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Guaranty/"},
   :rdfs/label "negative pledge",
   :rdfs/subClassOf :fibo-fbc-dae-gty/Guaranty,
   :skos/definition
   "guaranty whereby the issuer will not pledge any assets if doing so would result in less security for lender(s) or investor(s)"})

(def Policyholder
  {:cmns-av/synonym "insured party",
   :db/ident :fibo-fbc-dae-gty/Policyholder,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Guaranty/"},
   :rdfs/label "policyholder",
   :rdfs/subClassOf :fibo-fnd-agr-ctr/Counterparty,
   :skos/definition
   "counterparty to and typically owner of an insurance policy"})

(def PriorityLevel
  {:db/ident :fibo-fbc-dae-gty/PriorityLevel,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Guaranty/"},
   :rdfs/label "priority level",
   :rdfs/subClassOf :cmns-cls/Classifier,
   :skos/definition
   "relative ranking that a guaranty has in the context of a contract, for example for a credit enhancement priority"})

(def hasGuaranteedAmount
  {:db/ident :fibo-fbc-dae-gty/hasGuaranteedAmount,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-dae-gty/Guaranty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Guaranty/"},
   :rdfs/label "has guaranteed amount",
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasMonetaryAmount,
   :skos/definition "relates the guaranty to the monetary amount guaranteed"})

(def hasGuarantor
  {:db/ident :fibo-fbc-dae-gty/hasGuarantor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-agr-ctr/Contract,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Guaranty/"},
   :rdfs/label "has guarantor",
   :rdfs/range :fibo-fbc-dae-gty/Guarantor,
   :rdfs/subPropertyOf :fibo-fnd-agr-ctr/hasThirdParty,
   :skos/definition
   "relates the guarantor to the contract for which they are providing a guaranty"})

(def hasGuarantorParty
  {:db/ident :fibo-fbc-dae-gty/hasGuarantorParty,
   :owl/inverseOf :fibo-fbc-dae-gty/isGuarantorOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-oac-cpty/ControlledParty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Guaranty/"},
   :rdfs/label "has guarantor party",
   :rdfs/range :fibo-fbc-dae-gty/Guarantor,
   :rdfs/subPropertyOf :fibo-fnd-oac-ctl/hasControllingParty,
   :skos/definition
   "indicates a party that guarantees, endorses, or provides indemnity for some obligation on its behalf"})

(def hasPriorityLevel
  {:db/ident :fibo-fbc-dae-gty/hasPriorityLevel,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-dae-gty/Guaranty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Guaranty/"},
   :rdfs/label "has priority level",
   :rdfs/range :fibo-fbc-dae-gty/PriorityLevel,
   :rdfs/subPropertyOf :cmns-cls/isClassifiedBy,
   :skos/definition
   "relates a guaranty to some relative ranking that the guaranty has in the context of the contract, for example for a credit enhancement priority"})

(def isGuaranteedBy
  {:db/ident :fibo-fbc-dae-gty/isGuaranteedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-dae-gty/Guaranty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Guaranty/"},
   :rdfs/label "is guaranteed by",
   :rdfs/range :fibo-fbc-dae-gty/Guarantor,
   :skos/definition
   "relates guaranty to the contract guarantor, i.e., to the legal person providing the guaranty"})

(def isGuarantorOf
  {:db/ident :fibo-fbc-dae-gty/isGuarantorOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-dae-gty/Guarantor,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Guaranty/"},
   :rdfs/label "is guarantor of",
   :rdfs/range :fibo-be-oac-cpty/ControlledParty,
   :rdfs/subPropertyOf :fibo-fnd-oac-ctl/isPartyControlling,
   :skos/definition
   "identifies a party over which a guarantor has some measure of control by virtue of the guarantee"})

(def urn:uuid:5774dcf1-170b-5ead-ad23-bb7aafc12210
  {:cmns-av/copyright
   #{"Copyright (c) 2016-2024 EDM Council, Inc."
     "Copyright (c) 2016-2024 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology defines concepts related to contractual guaranty.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/ProductsAndServices/FinancialProductsAndServices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/OwnershipAndControl/Control/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/OwnershipAndControl/ControlParties/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Agreements/Agreements/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/GovernmentEntities/GovernmentEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Accounting/AccountingEquity/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/DebtAndEquities/Debt/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Arrangements/Documents/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/DebtAndEquities/Guaranty/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Guaranty Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Guaranty/ version of this ontology was added to the FBC domain via the FIBO 2.0 RFC in support of several FIBO debt-oriented initiatives."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Guaranty.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Guaranty/ version of this ontology revised to incorporate refinement of the concept of a guaranty as needed for debt securities and loans."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Guaranty/ version of this ontology revised to simplify the contract party hierarchy, add properties linking controlled parties to their guarantor, and clean up definitions to eliminate ambiguity, etc."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Guaranty/ version of this ontology revised to make letter of credit a subclass of committed credit facility, and to differentiate financial collateral from physical collateral."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Guaranty.rdf version of this ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Guaranty.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Guaranty/ version of this ontology revised to address text formatting issues uncovered by hygiene testing."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Guaranty/ version of this ontology revised to eliminate duplication of concepts in LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Guaranty/ version of this ontology revised to add financial asset as a parent of letter of credit."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Guaranty/"})