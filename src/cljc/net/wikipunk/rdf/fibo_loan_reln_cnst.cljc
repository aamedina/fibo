(ns net.wikipunk.rdf.fibo-loan-reln-cnst
  "Construction loans are loans in name only, in that the concept referred to as a construction loan is effectively a credit facility, with separate draw-downs (loans as defined in these ontologies) being enabled upon evidence of completion of agreed stages of the construction project. Note that for completion this ontology will need to be extended with a number of project management concepts describing the parameters of the construction project that are referred to in the contract for this facility. Some basic project management terms such as milestones are already included but will need framing within more foundational concepts for project management."
  {:cmns-av/copyright "Copyright (c) 2016-2023 EDM Council, Inc.",
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/ConstructionLoans/",
   :dcterms/abstract
   "Construction loans are loans in name only, in that the concept referred to as a construction loan is effectively a credit facility, with separate draw-downs (loans as defined in these ontologies) being enabled upon evidence of completion of agreed stages of the construction project. Note that for completion this ontology will need to be extended with a number of project management concepts describing the parameters of the construction project that are referred to in the contract for this facility. Some basic project management terms such as milestones are already included but will need framing within more foundational concepts for project management.",
   :dcterms/license {:rdfa/uri "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   [{:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/LOAN/LoansGeneral/Loans/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/Collections/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Contracts/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Locations/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/DebtAndEquities/Debt/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/LOAN/LoansGeneral/LoanEvents/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/Classifiers/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}],
   :owl/versionIRI
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/LOAN/RealEstateLoans/ConstructionLoans/"},
   :rdf/ns-prefix-map
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
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-loan-reln-cnst",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/ConstructionLoans/",
   :rdfs/label #xsd/langString "Construction Loans Ontology@en"})

(def ConstructionLoan
  "loan covering construction and development costs, secured by a mortgage on the property financed"
  {:cmns-av/synonym #xsd/langString "construction mortgage@en",
   :db/ident :fibo-loan-reln-cnst/ConstructionLoan,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/ConstructionLoans/"},
   :rdfs/label #xsd/langString "construction loan@en",
   :rdfs/subClassOf :fibo-loan-ln-ln/Loan,
   :skos/definition
   #xsd/langString
    "loan covering construction and development costs, secured by a mortgage on the property financed@en"})

(def ConstructionLoanContract
  "construction loan contract"
  {:db/ident :fibo-loan-reln-cnst/ConstructionLoanContract,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/ConstructionLoans/"},
   :rdfs/label #xsd/langString "construction loan contract@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-loan-reln-cnst/hasMilestoneTerm,
     :owl/someValuesFrom :fibo-loan-reln-cnst/ConstructionLoanMilestoneTermsSet,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
     :owl/onClass    :fibo-loan-reln-cnst/ConstructionLoanCreditFacilityTranche,
     :owl/onProperty :cmns-col/hasConstituent,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-dae-dbt/CreditFacility]})

(def ConstructionLoanCreditFacilityTranche
  "A loan taken out for construction purposes. Further notes: These are a temporary loan. when the construction is finished then that loan is transformed to another loan, which would be a permanent loan. Information to follow on what the new permanent loan would be. Terms are adjusted in the new loan, since in construction loans the rates are significantly higher. This is an incentive to complete the construction works. Notes from PoC reviews, discussing Maximum Balance concept: In a Construction Loan you agree a maximum amount that you could draw. As you progress with the construction you continue to draw more and more. So you start with the minimum. Example: for purpose of construction of a house you could need to borrow up to 500K and the bank establishes the milestones at which certain amounts are made availalbe and can be drawn. For instance prior to start you might draw 10%, (50K); the next 50K would be available to draw only once the foundations are laid. And so on. Milestones may include \"Frame standing\" (for American-style frame based houses). Each stage requires inspection on behalf of the bank. So you are starting with no more than 10% (in this example) of what is allowable, and could arrive to the full 500K by the end of ths construction but it is not mandated that you arrive to that. What differentiates a Construction Loan is that there si a max amount specified and there are Milestones specified in which the amounts for each milestone can be advanced."
  {:db/ident :fibo-loan-reln-cnst/ConstructionLoanCreditFacilityTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/ConstructionLoans/"},
   :rdfs/label #xsd/langString "construction loan credit facility tranche@en",
   :rdfs/subClassOf :fibo-fbc-dae-dbt/CommittedSubFacility,
   :skos/definition
   #xsd/langString
    "A loan taken out for construction purposes. Further notes: These are a temporary loan. when the construction is finished then that loan is transformed to another loan, which would be a permanent loan. Information to follow on what the new permanent loan would be. Terms are adjusted in the new loan, since in construction loans the rates are significantly higher. This is an incentive to complete the construction works. Notes from PoC reviews, discussing Maximum Balance concept: In a Construction Loan you agree a maximum amount that you could draw. As you progress with the construction you continue to draw more and more. So you start with the minimum. Example: for purpose of construction of a house you could need to borrow up to 500K and the bank establishes the milestones at which certain amounts are made availalbe and can be drawn. For instance prior to start you might draw 10%, (50K); the next 50K would be available to draw only once the foundations are laid. And so on. Milestones may include \"Frame standing\" (for American-style frame based houses). Each stage requires inspection on behalf of the bank. So you are starting with no more than 10% (in this example) of what is allowable, and could arrive to the full 500K by the end of ths construction but it is not mandated that you arrive to that. What differentiates a Construction Loan is that there si a max amount specified and there are Milestones specified in which the amounts for each milestone can be advanced.@en"})

(def ConstructionLoanMilestoneTermsSet
  "An agreed point at which an amount is advanced to the lender on completion of some pre-agreed scope of works on the construction."
  {:db/ident :fibo-loan-reln-cnst/ConstructionLoanMilestoneTermsSet,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/ConstructionLoans/"},
   :rdfs/label #xsd/langString "construction loan milestone terms set@en",
   :rdfs/subClassOf :fibo-fnd-agr-ctr/ConditionPrecedent,
   :skos/definition
   #xsd/langString
    "An agreed point at which an amount is advanced to the lender on completion of some pre-agreed scope of works on the construction.@en",
   :skos/editorialNote
   #xsd/langString
    "from review of a separate question, where we identified the need for this term:@en"})

(def ConstructionType
  "particular kind of construction"
  {:db/ident :fibo-loan-reln-cnst/ConstructionType,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/ConstructionLoans/"},
   :rdfs/label "construction type",
   :rdfs/subClassOf :cmns-cls/Classifier,
   :skos/definition "particular kind of construction"})

(def ConstructionType_Manufactured
  "a factory-built dwelling built in compliance with the Federal Manufactured Home Construction and Safety Standards in effect at the time the home was manufactured as evidenced by the HUD label"
  {:db/ident :fibo-loan-reln-cnst/ConstructionType_Manufactured,
   :rdf/type [:fibo-loan-reln-cnst/ConstructionType
              :owl/NamedIndividual
              :cmns-cls/Classifier],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/ConstructionLoans/"},
   :rdfs/label "manufactured",
   :skos/definition
   "a factory-built dwelling built in compliance with the Federal Manufactured Home Construction and Safety Standards in effect at the time the home was manufactured as evidenced by the HUD label"})

(def ConstructionType_MobileHome
  "a dwelling unit constructed on a base frame which features wheels and axles to be used in transporting home from place to place"
  {:cmns-av/explanatoryNote "It does not meet HUD code.",
   :db/ident :fibo-loan-reln-cnst/ConstructionType_MobileHome,
   :rdf/type [:fibo-loan-reln-cnst/ConstructionType
              :owl/NamedIndividual
              :cmns-cls/Classifier],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/ConstructionLoans/"},
   :rdfs/label "mobile home",
   :skos/definition
   "a dwelling unit constructed on a base frame which features wheels and axles to be used in transporting home from place to place"})

(def ConstructionType_Modular
  "a factory-built dwelling not on a permanent chassis"
  {:db/ident :fibo-loan-reln-cnst/ConstructionType_Modular,
   :rdf/type [:fibo-loan-reln-cnst/ConstructionType
              :owl/NamedIndividual
              :cmns-cls/Classifier],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/ConstructionLoans/"},
   :rdfs/label "modular",
   :skos/definition "a factory-built dwelling not on a permanent chassis"})

(def ConstructionType_OnFrameModular
  "a factory built dwelling on a permanent chassis which does not have a HUD label"
  {:db/ident :fibo-loan-reln-cnst/ConstructionType_OnFrameModular,
   :rdf/type [:fibo-loan-reln-cnst/ConstructionType
              :owl/NamedIndividual
              :cmns-cls/Classifier],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/ConstructionLoans/"},
   :rdfs/label "on frame modular",
   :skos/definition
   "a factory built dwelling on a permanent chassis which does not have a HUD label"})

(def ConstructionType_SiteBuilt
  "describes construction process, indicating that most elements are created at the homes permanent site. May include some prefabricated components"
  {:db/ident :fibo-loan-reln-cnst/ConstructionType_SiteBuilt,
   :rdf/type [:fibo-loan-reln-cnst/ConstructionType
              :owl/NamedIndividual
              :cmns-cls/Classifier],
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/ConstructionLoans/"},
   :rdfs/label "site built",
   :skos/definition
   "describes construction process, indicating that most elements are created at the homes permanent site. May include some prefabricated components"})

(def hasMaximumAllowedBalance
  "Maximum balance - For loans with flexible re-draw facilities, the maximum balance that could potentially be outstanding based on a credit limit"
  {:db/ident :fibo-loan-reln-cnst/hasMaximumAllowedBalance,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-loan-reln-cnst/ConstructionLoanContract,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/ConstructionLoans/"},
   :rdfs/label #xsd/langString "has maximum allowed balance@en",
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :skos/definition
   #xsd/langString
    "Maximum balance - For loans with flexible re-draw facilities, the maximum balance that could potentially be outstanding based on a credit limit@en"})

(def hasMaximumAnticipatedBalance
  "Maximum balance - For loans with flexible re-draw facilities, the maximum balance the borrower believes they might need, below the credit limit, for planning purposes"
  {:db/ident :fibo-loan-reln-cnst/hasMaximumAnticipatedBalance,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-loan-reln-cnst/ConstructionLoanCreditFacilityTranche,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/ConstructionLoans/"},
   :rdfs/label #xsd/langString "has maximum anticipated balance@en",
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :skos/definition
   #xsd/langString
    "Maximum balance - For loans with flexible re-draw facilities, the maximum balance the borrower believes they might need, below the credit limit, for planning purposes@en"})

(def hasMilestoneDescription
  "A textual description of the point at which it is legally recognized that the construction milestone has been reached."
  {:db/ident :fibo-loan-reln-cnst/hasMilestoneDescription,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-loan-reln-cnst/ConstructionLoanMilestoneTermsSet,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/ConstructionLoans/"},
   :rdfs/label #xsd/langString "has milestone description@en",
   :rdfs/range :xsd/string,
   :skos/definition
   #xsd/langString
    "A textual description of the point at which it is legally recognized that the construction milestone has been reached.@en"})

(def hasMilestoneMaximumDrawdownAmount
  "The maximum amount of the loan that can be drawn by the Borrower on completion of this Milestone."
  {:db/ident :fibo-loan-reln-cnst/hasMilestoneMaximumDrawdownAmount,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-loan-reln-cnst/ConstructionLoanMilestoneTermsSet,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/ConstructionLoans/"},
   :rdfs/label #xsd/langString "has milestone maximum drawdown amount@en",
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :skos/definition
   #xsd/langString
    "The maximum amount of the loan that can be drawn by the Borrower on completion of this Milestone.@en"})

(def hasMilestoneTerm
  "has milestone term"
  {:db/ident :fibo-loan-reln-cnst/hasMilestoneTerm,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-loan-reln-cnst/ConstructionLoanContract,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/ConstructionLoans/"},
   :rdfs/label #xsd/langString "has milestone term@en",
   :rdfs/range :fibo-loan-reln-cnst/ConstructionLoanMilestoneTermsSet})