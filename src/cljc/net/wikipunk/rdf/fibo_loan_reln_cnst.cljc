(ns net.wikipunk.rdf.fibo-loan-reln-cnst
  {:cmns-av/copyright "Copyright (c) 2016-2023 EDM Council, Inc.",
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/LOAN/RealEstateLoans/ConstructionLoans/",
   :dcterms/abstract
   "Construction loans are loans in name only, in that the concept referred to as a construction loan is effectively a credit facility, with separate draw-downs (loans as defined in these ontologies) being enabled upon evidence of completion of agreed stages of the construction project. Note that for completion this ontology will need to be extended with a number of project management concepts describing the parameters of the construction project that are referred to in the contract for this facility. Some basic project management terms such as milestones are already included but will need framing within more foundational concepts for project management.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fbc-dae-dbt"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
    "fibo-fnd-agr-ctr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
    "fibo-fnd-plc-loc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Locations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-loan-ln-ln"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/",
    "fibo-loan-reln-cnst"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/ConstructionLoans/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/LOAN/LoansGeneral/Loans/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/LOAN/LoansGeneral/LoanEvents/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/DebtAndEquities/Debt/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Places/Locations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/LOAN/RealEstateLoans/ConstructionLoans/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-loan-reln-cnst",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/ConstructionLoans/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Construction Loans Ontology"},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/ConstructionLoans/"})

(def ConstructionLoan
  {:cmns-av/synonym {:rdf/language "en",
                     :rdf/value    "construction mortgage"},
   :db/ident :fibo-loan-reln-cnst/ConstructionLoan,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/ConstructionLoans/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "construction loan"},
   :rdfs/subClassOf :fibo-loan-ln-ln/Loan,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "loan covering construction and development costs, secured by a mortgage on the property financed"}})

(def ConstructionLoanContract
  {:db/ident :fibo-loan-reln-cnst/ConstructionLoanContract,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/ConstructionLoans/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "construction loan contract"},
   :rdfs/subClassOf
   #{{:owl/onProperty :fibo-loan-reln-cnst/hasMilestoneTerm,
      :owl/someValuesFrom
      :fibo-loan-reln-cnst/ConstructionLoanMilestoneTermsSet,
      :rdf/type :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass :fibo-loan-reln-cnst/ConstructionLoanCreditFacilityTranche,
      :owl/onProperty :cmns-col/hasConstituent,
      :rdf/type :owl/Restriction} :fibo-fbc-dae-dbt/CreditFacility}})

(def ConstructionLoanCreditFacilityTranche
  {:db/ident :fibo-loan-reln-cnst/ConstructionLoanCreditFacilityTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/ConstructionLoans/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "construction loan credit facility tranche"},
   :rdfs/subClassOf :fibo-fbc-dae-dbt/CommittedSubFacility,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A loan taken out for construction purposes. Further notes: These are a temporary loan. when the construction is finished then that loan is transformed to another loan, which would be a permanent loan. Information to follow on what the new permanent loan would be. Terms are adjusted in the new loan, since in construction loans the rates are significantly higher. This is an incentive to complete the construction works. Notes from PoC reviews, discussing Maximum Balance concept: In a Construction Loan you agree a maximum amount that you could draw. As you progress with the construction you continue to draw more and more. So you start with the minimum. Example: for purpose of construction of a house you could need to borrow up to 500K and the bank establishes the milestones at which certain amounts are made availalbe and can be drawn. For instance prior to start you might draw 10%, (50K); the next 50K would be available to draw only once the foundations are laid. And so on. Milestones may include \"Frame standing\" (for American-style frame based houses). Each stage requires inspection on behalf of the bank. So you are starting with no more than 10% (in this example) of what is allowable, and could arrive to the full 500K by the end of ths construction but it is not mandated that you arrive to that. What differentiates a Construction Loan is that there si a max amount specified and there are Milestones specified in which the amounts for each milestone can be advanced."}})

(def ConstructionLoanMilestoneTermsSet
  {:db/ident :fibo-loan-reln-cnst/ConstructionLoanMilestoneTermsSet,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/ConstructionLoans/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "construction loan milestone terms set"},
   :rdfs/subClassOf :fibo-fnd-agr-ctr/ConditionPrecedent,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An agreed point at which an amount is advanced to the lender on completion of some pre-agreed scope of works on the construction."},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "from review of a separate question, where we identified the need for this term:"}})

(def ConstructionType
  {:db/ident :fibo-loan-reln-cnst/ConstructionType,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/ConstructionLoans/"},
   :rdfs/label "construction type",
   :rdfs/subClassOf :cmns-cls/Classifier,
   :skos/definition "particular kind of construction"})

(def ConstructionType_Manufactured
  {:db/ident :fibo-loan-reln-cnst/ConstructionType_Manufactured,
   :rdf/type #{:fibo-loan-reln-cnst/ConstructionType :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/ConstructionLoans/"},
   :rdfs/label "manufactured",
   :skos/definition
   "a factory-built dwelling built in compliance with the Federal Manufactured Home Construction and Safety Standards in effect at the time the home was manufactured as evidenced by the HUD label"})

(def ConstructionType_MobileHome
  {:cmns-av/explanatoryNote "It does not meet HUD code.",
   :db/ident :fibo-loan-reln-cnst/ConstructionType_MobileHome,
   :rdf/type #{:fibo-loan-reln-cnst/ConstructionType :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/ConstructionLoans/"},
   :rdfs/label "mobile home",
   :skos/definition
   "a dwelling unit constructed on a base frame which features wheels and axles to be used in transporting home from place to place"})

(def ConstructionType_Modular
  {:db/ident :fibo-loan-reln-cnst/ConstructionType_Modular,
   :rdf/type #{:fibo-loan-reln-cnst/ConstructionType :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/ConstructionLoans/"},
   :rdfs/label "modular",
   :skos/definition "a factory-built dwelling not on a permanent chassis"})

(def ConstructionType_OnFrameModular
  {:db/ident :fibo-loan-reln-cnst/ConstructionType_OnFrameModular,
   :rdf/type #{:fibo-loan-reln-cnst/ConstructionType :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/ConstructionLoans/"},
   :rdfs/label "on frame modular",
   :skos/definition
   "a factory built dwelling on a permanent chassis which does not have a HUD label"})

(def ConstructionType_SiteBuilt
  {:db/ident :fibo-loan-reln-cnst/ConstructionType_SiteBuilt,
   :rdf/type #{:fibo-loan-reln-cnst/ConstructionType :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/ConstructionLoans/"},
   :rdfs/label "site built",
   :skos/definition
   "describes construction process, indicating that most elements are created at the homes permanent site. May include some prefabricated components"})

(def hasMaximumAllowedBalance
  {:db/ident :fibo-loan-reln-cnst/hasMaximumAllowedBalance,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-loan-reln-cnst/ConstructionLoanContract,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/ConstructionLoans/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has maximum allowed balance"},
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Maximum balance - For loans with flexible re-draw facilities, the maximum balance that could potentially be outstanding based on a credit limit"}})

(def hasMaximumAnticipatedBalance
  {:db/ident :fibo-loan-reln-cnst/hasMaximumAnticipatedBalance,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-loan-reln-cnst/ConstructionLoanCreditFacilityTranche,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/ConstructionLoans/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has maximum anticipated balance"},
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Maximum balance - For loans with flexible re-draw facilities, the maximum balance the borrower believes they might need, below the credit limit, for planning purposes"}})

(def hasMilestoneDescription
  {:db/ident :fibo-loan-reln-cnst/hasMilestoneDescription,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-loan-reln-cnst/ConstructionLoanMilestoneTermsSet,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/ConstructionLoans/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has milestone description"},
   :rdfs/range :xsd/string,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A textual description of the point at which it is legally recognized that the construction milestone has been reached."}})

(def hasMilestoneMaximumDrawdownAmount
  {:db/ident :fibo-loan-reln-cnst/hasMilestoneMaximumDrawdownAmount,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-loan-reln-cnst/ConstructionLoanMilestoneTermsSet,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/ConstructionLoans/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has milestone maximum drawdown amount"},
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The maximum amount of the loan that can be drawn by the Borrower on completion of this Milestone."}})

(def hasMilestoneTerm
  {:db/ident :fibo-loan-reln-cnst/hasMilestoneTerm,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-loan-reln-cnst/ConstructionLoanContract,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/ConstructionLoans/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has milestone term"},
   :rdfs/range :fibo-loan-reln-cnst/ConstructionLoanMilestoneTermsSet})

(def urn:uuid:616ef0ba-2f9c-5e3e-95d2-4be96f121ac7
  {:cmns-av/copyright "Copyright (c) 2016-2023 EDM Council, Inc.",
   :dcterms/abstract
   "Construction loans are loans in name only, in that the concept referred to as a construction loan is effectively a credit facility, with separate draw-downs (loans as defined in these ontologies) being enabled upon evidence of completion of agreed stages of the construction project. Note that for completion this ontology will need to be extended with a number of project management concepts describing the parameters of the construction project that are referred to in the contract for this facility. Some basic project management terms such as milestones are already included but will need framing within more foundational concepts for project management.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/LOAN/LoansGeneral/Loans/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/LOAN/LoansGeneral/LoanEvents/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/DebtAndEquities/Debt/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Places/Locations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/LOAN/RealEstateLoans/ConstructionLoans/"},
   :rdf/type :owl/Ontology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Construction Loans Ontology"},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/ConstructionLoans/"})