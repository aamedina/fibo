(ns net.wikipunk.rdf.fibo-sec-dbt-bnd
  ^{:base "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/",
    :namespaces
    {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
     "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
     "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
     "dcterms" "http://purl.org/dc/terms/",
     "fibo-be-ge-ge"
     "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/",
     "fibo-be-le-lp"
     "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/",
     "fibo-be-tr-tr"
     "https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts/",
     "fibo-fbc-dae-dbt"
     "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
     "fibo-fbc-dae-gty"
     "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Guaranty/",
     "fibo-fbc-fct-fse"
     "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/",
     "fibo-fbc-fct-ra"
     "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegistrationAuthorities/",
     "fibo-fbc-fi-fi"
     "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
     "fibo-fbc-pas-fpas"
     "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
     "fibo-fnd-acc-4217"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
     "fibo-fnd-acc-cur"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
     "fibo-fnd-agr-ctr"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
     "fibo-fnd-arr-doc"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/",
     "fibo-fnd-dt-bd"
     "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/BusinessDates/",
     "fibo-fnd-dt-fd"
     "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
     "fibo-fnd-gao-obj"
     "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/Objectives/",
     "fibo-fnd-pas-psch"
     "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules/",
     "fibo-fnd-pty-rl"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles/",
     "fibo-fnd-rel-rel"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
     "fibo-fnd-utl-alx"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
     "fibo-fnd-utl-av"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
     "fibo-ind-ei-ei"
     "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/",
     "fibo-ind-ind-ind"
     "https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators/",
     "fibo-ind-ir-ir"
     "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/",
     "fibo-sec-dbt-bnd"
     "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/",
     "fibo-sec-dbt-dbti"
     "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/",
     "fibo-sec-dbt-tstd"
     "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/TradedShortTermDebt/",
     "fibo-sec-eq-eq"
     "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
     "fibo-sec-sec-iss"
     "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/",
     "fibo-sec-sec-lst"
     "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings/",
     "owl" "http://www.w3.org/2002/07/owl#",
     "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
     "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
     "skos" "http://www.w3.org/2004/02/skos/core#",
     "xsd" "http://www.w3.org/2001/XMLSchema#"},
    :prefix "fibo-sec-dbt-bnd",
    :source
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Debt/Bonds/"}
  {:cmns-av/copyright #{"Copyright (c) 2018-2023 Object Management Group, Inc."
                        "Copyright (c) 2016-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology defines the basic concept of a bond and a number of bond variants including convertible and callable bonds. Medium term notes (MTNs) and debentures are also defined.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/RegistrationAuthorities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/DebtAndEquities/Guaranty/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/GovernmentEntities/GovernmentEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/IND/Indicators/Indicators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/Analytics/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/GoalsAndObjectives/Objectives/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/CorporateBodies/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Parties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Securities/SecuritiesListings/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Accounting/ISO4217-CurrencyCodes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/DebtAndEquities/Debt/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Agreements/Agreements/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/IND/EconomicIndicators/EconomicIndicators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/FinancialServicesEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Debt/DebtInstruments/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/Trusts/Trusts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Securities/SecuritiesIssuance/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/DatesAndTimes/Occurrences/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Equities/EquityInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/ProductsAndServices/PaymentsAndSchedules/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Roles/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/DatesAndTimes/BusinessDates/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/IND/InterestRates/InterestRates/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/FunctionalEntities/FunctionalEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Arrangements/Documents/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Debt/TradedShortTermDebt/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/DatesAndTimes/FinancialDates/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/ProductsAndServices/FinancialProductsAndServices/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Debt/Bonds/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Bonds Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Debt/Bonds.rdf version of this ontology was revised to eliminate references to the exercise conventions ontology, which are not needed for bonds."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Debt/Bonds.rdf version of this ontology was revised to allow for variation in index-linked bonds, such as those whose interest payments vary with an index in addition to those that have a variable principal linked to an index and to make a number of corrections to the class hierarchy."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Debt/Bonds.rdf version of this ontology was revised to address text formatting hygiene issues."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Debt/Bonds.rdf version of this ontology was revised to eliminate a duplicate 'isBasedOn' property and replace it with the property of the same name in the debt ontology, to revise the inheritance hierarchy for bond conversion terms to reflect changes in the representation of redemption more generally, to reflect the move of redemption provision from debt to financial instruments, and eliminate circular and ambiguous definitions."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Debt/Bonds.rdf version of this ontology was revised to eliminate false positives in hygiene tests due to concept names containing words, such as 'and', which might indicate that the concept actually reflects more than one thing, including distinguishing zero coupon from original issue discount bonds, and replace the use of call price and put price, which are overly constrained, with monetary price."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Debt/Bonds.rdf version of this ontology was revised to incorporate the concept of a credit agreement repaid at maturity, which is a component assumed to be part of the definition of a bond, and to add an explanatory note to the definition of Treasury Bill."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Debt/Bonds.rdf version of this ontology was revised to eliminate duplication of concepts in LCC and eliminate a redundant superclass from RegularCouponSchedule."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Debt/Bonds.rdf version of this ontology was revised to reflect the refactored definition of a listing and improve the definition of corporate bond."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."},
   :xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"})

(def AmortizingBond
  {:db/ident :fibo-sec-dbt-bnd/AmortizingBond,
   :owl/disjointWith :fibo-sec-dbt-bnd/BulletBond,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "amortizing bond",
   :rdfs/subClassOf #{{:owl/onProperty :fibo-sec-dbt-dbti/hasRepaymentTerms,
                       :owl/someValuesFrom
                       :fibo-sec-dbt-bnd/BondAmortizationPaymentTerms,
                       :rdf/type :owl/Restriction} :fibo-sec-dbt-bnd/Bond},
   :skos/definition
   "bond that regularly pays down the principal (face value) on the debt along with its interest expense over the life of the bond"})

(def Bond
  {:cmns-av/explanatoryNote
   "Depending on the terms of the contract, the issuer is obliged to pay interest (the coupon) and/or to repay the principal at maturity. The most common bonds are corporate or governmental, typically used to finance specific projects or operations.",
   :db/ident :fibo-sec-dbt-bnd/Bond,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "bond",
   :rdfs/subClassOf
   #{:fibo-sec-dbt-dbti/TradableDebtInstrument
     {:owl/onProperty     :fibo-sec-dbt-dbti/hasRepaymentTerms,
      :owl/someValuesFrom :fibo-sec-dbt-bnd/BondPrincipalRepaymentTerms,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-sec-dbt-dbti/hasInterestPaymentTerms,
      :owl/someValuesFrom :fibo-sec-dbt-bnd/CouponPaymentTerms,
      :rdf/type           :owl/Restriction}
     :fibo-fbc-dae-dbt/CreditAgreementRepaidAtMaturity},
   :skos/definition
   "tradable debt instrument representing a loan in which the issuer owes the holder(s) a debt"})

(def BondAmortizationPaymentTerms
  {:db/ident :fibo-sec-dbt-bnd/BondAmortizationPaymentTerms,
   :owl/disjointWith :fibo-sec-dbt-bnd/BulletPrincipalRepaymentTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "bond amortization payment terms",
   :rdfs/subClassOf #{{:owl/onProperty :fibo-fnd-dt-fd/hasSchedule,
                       :owl/someValuesFrom
                       :fibo-fbc-dae-dbt/AmortizationSchedule,
                       :rdf/type :owl/Restriction}
                      :fibo-sec-dbt-bnd/BondPrincipalRepaymentTerms},
   :skos/definition
   "terms that include a schedule for repayment of the principal over the lifetime of the bond, typically in equal payments at regular intervals"})

(def BondConversionTerms
  {:db/ident :fibo-sec-dbt-bnd/BondConversionTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "bond conversion terms",
   :rdfs/subClassOf #{:fibo-sec-sec-iss/ConversionTerms
                      {:owl/onProperty
                       :fibo-sec-sec-iss/specifiesConversionInto,
                       :owl/someValuesFrom :fibo-sec-eq-eq/ListedShare,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "terms indicating when a convertible bond can be converted to another security (usually a publicly traded share issued by of the same issuer)"})

(def BondCoupon
  {:cmns-av/synonym #{"coupon rate" "nominal yield" "coupon percent rate"},
   :db/ident :fibo-sec-dbt-bnd/BondCoupon,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "bond coupon",
   :rdfs/subClassOf :fibo-fnd-acc-cur/InterestRate,
   :skos/definition
   "interest rate on a debt security that the issuer promises to pay to the holder until maturity, expressed as an annual percentage of the face value"})

(def BondInsurance
  {:db/ident :fibo-sec-dbt-bnd/BondInsurance,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "bond insurance",
   :rdfs/subClassOf :fibo-fbc-dae-gty/InsurancePolicy,
   :skos/definition
   "insurance policy that a bond issuer purchases that guarantees the repayment of the principal and all associated interest payments to the bondholders in the event of default"})

(def BondPrincipalRepaymentTerms
  {:db/ident :fibo-sec-dbt-bnd/BondPrincipalRepaymentTerms,
   :owl/disjointWith :fibo-sec-dbt-dbti/CallFeature,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "bond principal repayment terms",
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fnd-dt-fd/hasSchedule,
                       :owl/someValuesFrom :fibo-fnd-pas-psch/PaymentSchedule,
                       :rdf/type           :owl/Restriction}
                      :fibo-fbc-dae-dbt/PrincipalRepaymentTerms},
   :skos/definition "terms for the repayment of the principal on a bond"})

(def BondRegistrar
  {:cmns-av/explanatoryNote
   "The trustee under a bond contract often also acts as registrar.",
   :db/ident :fibo-sec-dbt-bnd/BondRegistrar,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "bond registrar",
   :rdfs/subClassOf #{:fibo-fbc-pas-fpas/LegalAgent :fibo-fbc-fct-ra/Registrar
                      {:owl/onProperty     :fibo-fbc-fct-ra/registers,
                       :owl/someValuesFrom :fibo-sec-dbt-bnd/Bond,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "party responsible for maintaining records on behalf of the issuer that identify the owners of a registered bond issue"})

(def BondVariableCoupon
  {:db/ident :fibo-sec-dbt-bnd/BondVariableCoupon,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "bond variable coupon",
   :rdfs/subClassOf #{:fibo-sec-dbt-bnd/BondCoupon
                      :fibo-fbc-dae-dbt/VariableInterestRate},
   :skos/definition "bond coupon that has a variable interest rate"})

(def BondWithPartialCall
  {:db/ident :fibo-sec-dbt-bnd/BondWithPartialCall,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "bond with partial call",
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-sec-dbt-dbti/hasCallFeature,
                       :owl/someValuesFrom :fibo-sec-dbt-bnd/PartialCallFeature,
                       :rdf/type           :owl/Restriction}
                      :fibo-sec-dbt-bnd/CallableBond},
   :skos/definition
   "bond with a feature whereby the issue can be partially called for amounts that are at the discretion of the issuer"})

(def BondWithPublishedSinkingFund
  {:db/ident :fibo-sec-dbt-bnd/BondWithPublishedSinkingFund,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "bond with published sinking fund",
   :rdfs/subClassOf :fibo-sec-dbt-bnd/AmortizingBond,
   :skos/definition
   "bond whereby amortization is via a known and published schedule"})

(def BondWithWarrant
  {:db/ident :fibo-sec-dbt-bnd/BondWithWarrant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "bond with warrant",
   :rdfs/subClassOf :fibo-sec-dbt-dbti/DebtOffering,
   :skos/definition "bond issue whereby the issue includes a warrant",
   :skos/editorialNote
   "This need not be any specific type of bond. This is NOT a kind of Bond Contract but a kind of Issue Offer, and is modeled as such, in the Issuance Terms section of the model. This class of contract is retained in the model for now in order to provide traceability with the CFI term for \"Bond With Warrant\" only."})

(def BuildAmericaBond
  {:cmns-av/explanatoryNote
   "BABs may be direct pay subsidy bonds or tax credit bonds.",
   :db/ident :fibo-sec-dbt-bnd/BuildAmericaBond,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "Build America Bond",
   :rdfs/subClassOf :fibo-sec-dbt-bnd/MunicipalBond,
   :skos/definition
   "taxable municipal bond issued through December 31, 2010 under the American Recovery and Reinvestment Act of 2009 (ARRA)"})

(def BulletBond
  {:db/ident :fibo-sec-dbt-bnd/BulletBond,
   :owl/disjointWith #{:fibo-sec-dbt-bnd/AmortizingBond
                       :fibo-sec-dbt-bnd/CallableBond},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "bullet bond",
   :rdfs/subClassOf #{{:owl/onProperty :fibo-sec-dbt-dbti/hasRepaymentTerms,
                       :owl/someValuesFrom
                       :fibo-sec-dbt-bnd/BulletPrincipalRepaymentTerms,
                       :rdf/type :owl/Restriction} :fibo-sec-dbt-bnd/Bond},
   :skos/definition
   "bond whose entire principal value is paid on the maturity date, rather than amortized over its lifetime"})

(def BulletPrincipalRepaymentTerms
  {:db/ident :fibo-sec-dbt-bnd/BulletPrincipalRepaymentTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "bond bullet principal repayment terms",
   :rdfs/subClassOf :fibo-sec-dbt-bnd/BondPrincipalRepaymentTerms,
   :skos/definition
   "terms for repayment of the principal for a bond as a single payment covering the whole principal amount"})

(def CallableBond
  {:db/ident :fibo-sec-dbt-bnd/CallableBond,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "callable bond",
   :rdfs/subClassOf
   #{{:owl/maxQualifiedCardinality 1,
      :owl/onClass    :fibo-sec-dbt-bnd/ExtraordinaryRedemptionProvision,
      :owl/onProperty :fibo-sec-dbt-bnd/hasExtraordinaryRedemptionProvision,
      :rdf/type       :owl/Restriction}
     {:owl/hasValue   {:xsd/boolean true},
      :owl/onProperty :fibo-sec-dbt-dbti/isCallable,
      :rdf/type       :owl/Restriction} :fibo-sec-dbt-bnd/Bond
     {:owl/onProperty     :fibo-sec-dbt-dbti/hasCallFeature,
      :owl/someValuesFrom :fibo-sec-dbt-dbti/CallFeature,
      :rdf/type           :owl/Restriction}},
   :skos/definition
   "bond that includes a stipulation allowing the issuer the right to repurchase and retire the bond at the call price after the call protection period"})

(def CallableConvertibleBond
  {:db/ident :fibo-sec-dbt-bnd/CallableConvertibleBond,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "callable convertible bond",
   :rdfs/subClassOf #{:fibo-sec-dbt-bnd/ConvertibleBond
                      :fibo-sec-dbt-bnd/CallableBond},
   :skos/definition "convertible bond that is also callable"})

(def CertificateOfObligation
  {:cmns-av/abbreviation "CO",
   :cmns-av/explanatoryNote
   #{"For example, when a hurricane destroys the police and emergency services building, there is no time to go through the process of voter referendum. The local council must be able to borrow the money to set up provisional buildings and necessary equipment for police and emergency services so that the community is served in continuity."
     "CO's are similar to GO bonds, except that they do not require voter approval before they are issued. The CO's are also guaranteed by the City's taxation power and are counted in the calculation of the tax rate that is needed to support debt payments."},
   :db/ident :fibo-sec-dbt-bnd/CertificateOfObligation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "certificate of obligation",
   :rdfs/subClassOf :fibo-sec-dbt-bnd/MunicipalSecurity,
   :skos/definition
   "municipal security available to governing councils in case of emergency, such as a natural disaster, that needs immediate action without time for voter referendum"})

(def CertificateOfParticipation
  {:cmns-av/abbreviation "COP",
   :cmns-av/explanatoryNote
   "A certificate of participation (COP) is a type of financing where an investor purchases a share of the lease revenues of a program rather than the bond being secured by those revenues. The certificate generally entitles the holder to receive a share, or participation, in the payments from a particular project. The payments are passed through the lessor to the certificate holders. The lessor typically assigns the lease and the payments to a trustee, which then distributes the payments to the certificate holders.",
   :db/ident :fibo-sec-dbt-bnd/CertificateOfParticipation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "certificate of participation",
   :rdfs/subClassOf :fibo-fbc-fi-fi/DebtInstrument,
   :skos/definition
   "debt instrument evidencing a pro rata share in a specific pledged revenue stream, usually lease payments by the issuer that are typically subject to annual appropriation"})

(def ConventionalGilt
  {:cmns-av/explanatoryNote
   "Conventional gilts are the simplest form of government bond and constitute around 75 percent of the gilt portfolio.",
   :db/ident :fibo-sec-dbt-bnd/ConventionalGilt,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "conventional gilt",
   :rdfs/seeAlso
   {:xsd/anyURI
    "https://www.dmo.gov.uk/responsibilities/gilt-market/about-gilts/"},
   :rdfs/subClassOf #{:fibo-sec-dbt-bnd/FixedCouponBond
                      :fibo-sec-dbt-bnd/UKGovernmentSecurity},
   :skos/definition
   "fixed coupon bond issued by HM Treasury that guarantees to pay the holder of the gilt a fixed cash payment (coupon) every six months until the maturity date, at which point the holder receives the final coupon payment and the return of the principal"})

(def ConvertibleBond
  {:cmns-av/explanatoryNote
   "If the equity price remains below the strike price throughout the term of the bond it matures and is redeemed like a regular bond. The conversion ratio and strike price are usually set when the convertible bond is issued.",
   :db/ident :fibo-sec-dbt-bnd/ConvertibleBond,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "convertible bond",
   :rdfs/subClassOf #{:fibo-sec-sec-iss/ConvertibleSecurity
                      :fibo-sec-dbt-bnd/Bond
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-sec-dbt-bnd/BondConversionTerms,
                       :owl/onProperty :fibo-fnd-agr-ctr/hasContractualElement,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "bond that gives the holder the right to convert the bond into a fixed number of shares (conversion ratio) if the equity price rises above a specified level (strike price)"})

(def CorporateBond
  {:cmns-av/explanatoryNote
   #{"Note that some classification schemes consider any bond except those issued by a government in its own currency to be a corporate bond, for example, a bond issued by Canada in US dollars might be classified as a corporate bond. Bonds issued by multinational / supranational organizations such as the European Bank for Reconstruction and Development (EBRD) may also be considered corporate bonds rather than government bonds."
     "Corporate bonds are issued for purposes such as mergers and acquisitions, business expansion, or to cover ongoing operational needs, and are typically longer-term debt instruments that have a maturity of at least one year. Corporate debt instruments with maturity shorter than one year are referred to as commercial paper."},
   :db/ident :fibo-sec-dbt-bnd/CorporateBond,
   :owl/disjointWith #{:fibo-sec-dbt-bnd/GovernmentBond
                       :fibo-sec-dbt-bnd/MunicipalBond},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "corporate bond",
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-fnd-rel-rel/isIssuedBy,
      :owl/someValuesFrom {:owl/onProperty     :fibo-fnd-pty-rl/isPlayedBy,
                           :owl/someValuesFrom :fibo-be-le-lp/LegalEntity,
                           :rdf/type           :owl/Restriction},
      :rdf/type           :owl/Restriction} :fibo-sec-dbt-bnd/Bond},
   :skos/definition "bond issued by a company in order to raise financing"})

(def CouponPayment
  {:db/ident :fibo-sec-dbt-bnd/CouponPayment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "coupon payment",
   :rdfs/subClassOf :fibo-fnd-pas-psch/PaymentEvent,
   :skos/definition "payment event involving an interest payment on a bond"})

(def CouponPaymentTerms
  {:db/ident :fibo-sec-dbt-bnd/CouponPaymentTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "coupon payment terms",
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fnd-dt-fd/hasSchedule,
                       :owl/someValuesFrom :fibo-sec-dbt-bnd/CouponSchedule,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :fibo-fnd-acc-cur/hasCurrency,
                       :owl/someValuesFrom :fibo-fnd-acc-cur/Currency,
                       :rdf/type           :owl/Restriction}
                      :fibo-fbc-dae-dbt/InterestPaymentTerms
                      {:owl/onProperty     :fibo-fbc-dae-dbt/hasInterestRate,
                       :owl/someValuesFrom :fibo-sec-dbt-bnd/BondCoupon,
                       :rdf/type           :owl/Restriction}},
   :skos/definition "terms for payment of interest on a bond"})

(def CouponSchedule
  {:db/ident :fibo-sec-dbt-bnd/CouponSchedule,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "coupon schedule",
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-col/comprises,
                       :owl/someValuesFrom :fibo-sec-dbt-bnd/CouponPayment,
                       :rdf/type           :owl/Restriction}
                      :fibo-fnd-dt-fd/RegularSchedule
                      :fibo-fnd-pas-psch/PaymentSchedule},
   :skos/definition
   "payment schedule that consists of interest payments on a bond"})

(def EquityLinkedBond
  {:db/ident :fibo-sec-dbt-bnd/EquityLinkedBond,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "equity linked bond",
   :rdfs/subClassOf :fibo-sec-dbt-bnd/VariableCouponBond,
   :skos/definition
   "bond based on the return on an equity over time, i.e. the price and dividend payments or the total return (similar to total return swaps)"})

(def ExtraordinaryRedemptionProvision
  {:cmns-av/explanatoryNote
   "Such redemptions may occur when bond proceeds are not spent according to schedule; when bond proceeds are used in a way that makes nontaxable bond interest taxable; or when a catastrophe destroys the project being financed, among other reasons.",
   :db/ident :fibo-sec-dbt-bnd/ExtraordinaryRedemptionProvision,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "extraordinary redemption provision",
   :rdfs/subClassOf :fibo-sec-dbt-dbti/CallFeature,
   :skos/definition
   "provision that gives a bond issuer the right to call its bonds due to an unusual one-time occurrence, as specified in the offering statement"})

(def FirstRegularCouponDate
  {:db/ident :fibo-sec-dbt-bnd/FirstRegularCouponDate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "first regular coupon date",
   :rdfs/subClassOf :cmns-dt/ExplicitDate,
   :skos/definition
   "scheduled date for the first regular coupon payment, in a regular repeating series of coupon periods, after any non standard (long or short) first coupon period in the schedule"})

(def FixedCouponBond
  {:db/ident :fibo-sec-dbt-bnd/FixedCouponBond,
   :owl/disjointWith :fibo-sec-dbt-bnd/VariableCouponBond,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "fixed coupon bond",
   :rdfs/subClassOf #{:fibo-sec-dbt-dbti/FixedIncomeSecurity
                      {:owl/onProperty
                       :fibo-sec-dbt-dbti/hasInterestPaymentTerms,
                       :owl/someValuesFrom :fibo-sec-dbt-bnd/FixedCouponTerms,
                       :rdf/type :owl/Restriction} :fibo-sec-dbt-bnd/Bond},
   :skos/definition
   "bond whose coupon rate and principal amount are fixed at the time of origination or sale and remain constant while the security is outstanding"})

(def FixedCouponTerms
  {:db/ident :fibo-sec-dbt-bnd/FixedCouponTerms,
   :owl/disjointWith :fibo-sec-dbt-bnd/VariableCouponTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "fixed coupon terms",
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fbc-dae-dbt/hasInterestRate,
                       :owl/someValuesFrom :fibo-fbc-dae-dbt/FixedInterestRate,
                       :rdf/type           :owl/Restriction}
                      :fibo-sec-dbt-bnd/CouponPaymentTerms},
   :skos/definition
   "terms for payment of interest on a bond with a fixed interest rate"})

(def FloatingRateNote
  {:cmns-av/explanatoryNote
   "The adjustments to the interest rate (coupon) are made periodically, usually on a quarterly or monthly basis, and are tied to a certain money-market index. Also known as a \"floater\". For example six months USD LIBOR + 0.20%.",
   :db/ident :fibo-sec-dbt-bnd/FloatingRateNote,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "floating rate note",
   :rdfs/subClassOf #{{:owl/onProperty :fibo-fbc-dae-dbt/hasInterestRate,
                       :owl/someValuesFrom
                       :fibo-ind-ir-ir/ReferenceInterestRate,
                       :rdf/type :owl/Restriction}
                      :fibo-sec-dbt-bnd/VariableCouponBond},
   :skos/definition
   "bond with a variable interest rate based on a published reference interest rate"})

(def FullFaithCreditBond
  {:cmns-av/explanatoryNote
   "Full faith and credit bonds are typically backed by a government entity and are considered low risk.",
   :cmns-av/synonym "full faith and credit bond",
   :db/ident :fibo-sec-dbt-bnd/FullFaithCreditBond,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "full faith credit bond",
   :rdfs/subClassOf :fibo-sec-dbt-bnd/UnsecuredBond,
   :skos/definition
   "bond secured by an unconditional promise to pay by another entity"})

(def GeneralObligationMunicipalBond
  {:cmns-av/abbreviation "GO bond",
   :db/ident :fibo-sec-dbt-bnd/GeneralObligationMunicipalBond,
   :owl/disjointWith :fibo-sec-dbt-bnd/RevenueBond,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "general obligation municipal bond",
   :rdfs/subClassOf #{:fibo-sec-dbt-bnd/FullFaithCreditBond
                      :fibo-sec-dbt-bnd/MunicipalBond},
   :skos/definition
   "municipal bond that is backed by the full faith and credit and general resources of the issuing municipality, including its general taxing authority"})

(def GovernmentBond
  {:cmns-av/synonym "government-issued bond",
   :db/ident :fibo-sec-dbt-bnd/GovernmentBond,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "government bond",
   :rdfs/subClassOf #{:fibo-sec-dbt-bnd/Bond
                      :fibo-sec-dbt-bnd/GovernmentIssuedDebtSecurity},
   :skos/definition
   "debt security issued by a government to fund government spending"})

(def GovernmentIssuedDebtSecurity
  {:db/ident :fibo-sec-dbt-bnd/GovernmentIssuedDebtSecurity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "government issued debt security",
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-fnd-rel-rel/isIssuedBy,
      :owl/someValuesFrom {:owl/onProperty     :fibo-fnd-pty-rl/isPlayedBy,
                           :owl/someValuesFrom :fibo-be-ge-ge/Polity,
                           :rdf/type           :owl/Restriction},
      :rdf/type           :owl/Restriction} :fibo-fbc-fi-fi/DebtInstrument},
   :skos/definition
   "debt security issued by some government on behalf of some polity, including sovereign and municipal debt"})

(def GreenBond
  {:cmns-av/explanatoryNote
   "These bonds are typically asset-linked and backed by the issuer's balance sheet. Green bonds finance projects aimed at energy efficiency, pollution prevention, sustainable agriculture, fishery and forestry, the protection of aquatic and terrestrial ecosystems, clean transportation, sustainable water management and the cultivation of environmentally friendly technologies, and often include incentives such as tax exemption.",
   :db/ident :fibo-sec-dbt-bnd/GreenBond,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "green bond",
   :rdfs/subClassOf :fibo-sec-dbt-bnd/Bond,
   :skos/definition
   "bond issued specifically to fund climate or environmental projects"})

(def ImplicitFullFaithCreditBond
  {:cmns-av/explanatoryNote
   "It doesn't carry an explicit full faith and credit guarantee but the market believes the government wouldn't let it default or fail.",
   :cmns-av/synonym "implicit full faith and credit bond",
   :db/ident :fibo-sec-dbt-bnd/ImplicitFullFaithCreditBond,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "implicit full faith credit bond",
   :rdfs/subClassOf :fibo-sec-dbt-bnd/UnsecuredBond,
   :skos/definition
   "bond issued by a government sponsored agency or corporation rather than by the government directly"})

(def IndexLinkedBond
  {:db/ident :fibo-sec-dbt-bnd/IndexLinkedBond,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "index-linked bond",
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fbc-dae-dbt/isBasedOn,
                       :owl/someValuesFrom {:owl/unionOf
                                            [:fibo-ind-ei-ei/EconomicIndicator
                                             :fibo-ind-ind-ind/MarketRate],
                                            :rdf/type :owl/Class},
                       :rdf/type           :owl/Restriction}
                      :fibo-sec-dbt-bnd/VariableIncomeBond},
   :skos/definition
   "bond whose income may vary over time, because either the coupon rate or principal amount is related to a specific index, such as the Consumer Price Index"})

(def InflationLinkedBond
  {:cmns-av/abbreviation "ILB",
   :cmns-av/explanatoryNote
   "Inflation-linked bonds are primarily issued by sovereign governments, such as the U.S. and the UK.",
   :cmns-av/synonym "inflation-indexed bond",
   :db/ident :fibo-sec-dbt-bnd/InflationLinkedBond,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "inflation-linked bond",
   :rdfs/subClassOf #{:fibo-sec-dbt-bnd/IndexLinkedBond
                      {:owl/onProperty     :fibo-fbc-dae-dbt/isBasedOn,
                       :owl/someValuesFrom :fibo-ind-ei-ei/InflationRate,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "bond indexed to inflation so that the principal or interest payments rise and fall with the rate of inflation"})

(def LastRegularCouponDate
  {:db/ident :fibo-sec-dbt-bnd/LastRegularCouponDate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "last regular coupon date",
   :rdfs/subClassOf :cmns-dt/ExplicitDate,
   :skos/definition
   "scheduled date of the last regular coupon payment, that is the last of the payments that are made according to a regular repeating series of coupon periods, before any non-standard (long or short) final coupon period in the schedule"})

(def ListedBond
  {:cmns-av/explanatoryNote
   "Most exchange traded bonds are corporate bonds (but most corporate bonds are not exchange traded bonds).",
   :db/ident :fibo-sec-dbt-bnd/ListedBond,
   :owl/disjointWith :fibo-sec-dbt-bnd/UnlistedBond,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "listed bond",
   :rdfs/subClassOf #{:fibo-sec-sec-lst/ListedSecurity :fibo-sec-dbt-bnd/Bond},
   :skos/definition "bond that may be traded on an exchange"})

(def LotteryConvention
  {:db/ident :fibo-sec-dbt-bnd/LotteryConvention,
   :rdf/type #{:fibo-sec-dbt-bnd/PartialRedemptionAllocationConvention
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "lottery convention",
   :skos/definition
   "convention involving an impartial lottery for determining which securities are subject to partial call or partial redemption"})

(def MakeWholeCall
  {:cmns-av/explanatoryNote
   "The issuer typically has to make a lump sum payment to the investor(s) derived from a formula based on the net present value (NPV) of future coupon payments that will not be paid incrementally because of the call combined with the principal payment the investor would have received at maturity.",
   :db/ident :fibo-sec-dbt-bnd/MakeWholeCall,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "make whole call",
   :rdfs/subClassOf :fibo-sec-dbt-dbti/CallEvent,
   :skos/definition "call allowing the issuer to pay off remaining debt early"})

(def MandatoryConvertibleBond
  {:cmns-av/explanatoryNote
   "The conversion ratio at maturity reflects the equity price and par value of the bond when issued. There is also typically a second higher conversion ratio if the equity price rises above the strike during the term of the bond.",
   :db/ident :fibo-sec-dbt-bnd/MandatoryConvertibleBond,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "mandatory convertible bond",
   :rdfs/subClassOf #{:fibo-sec-dbt-bnd/ConvertibleBond
                      {:owl/onProperty :fibo-fnd-agr-ctr/hasContractualElement,
                       :owl/someValuesFrom
                       :fibo-sec-dbt-bnd/BondConversionTerms,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "convertible bond that converts into shares at maturity regardless of the equity price"})

(def MediumTermNote
  {:cmns-av/explanatoryNote
   #{"By shelf registration we mean the security registration process where an issuer registers in advance, and can issue lots of securities for up to three years."
     "Medium term notes are typically issued by corporations and financial institutions, although GSEs also have MTN programs. MTNs may be issued under a shelf registration program which allows the company to issue bonds over time with varying maturities and coupons. Companies issue MTNs to have a more flexible source of funding. They may also issue MTN in response to 'reverse inquiry' by investors looking for bonds with specific maturities, issue size and coupon."
     "A medium-term note (MTN) is a debt note that usually matures (is paid back) in 5 to 10 years, but the term may be less than one year or as long as 100 years. They can be issued on a fixed or floating coupon basis."},
   :db/ident :fibo-sec-dbt-bnd/MediumTermNote,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "medium term note",
   :rdfs/subClassOf :fibo-sec-dbt-bnd/Bond,
   :skos/definition
   "bond issued over time under a shelf registration program, where each issue may have a different coupon and maturity typically ranging from one to ten years"})

(def MunicipalBond
  {:cmns-av/abbreviation "muni",
   :cmns-av/explanatoryNote
   "Municipal bonds may be issued by states, cities, counties, special tax districts or special agencies or authorities of state or local governments.",
   :db/ident :fibo-sec-dbt-bnd/MunicipalBond,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "municipal bond",
   :rdfs/subClassOf #{:fibo-sec-dbt-bnd/GovernmentBond
                      :fibo-sec-dbt-bnd/MunicipalSecurity},
   :skos/definition
   "government bond that may be issued by a regional, rather than national, authority"})

(def MunicipalDebtFundsUsage
  {:db/ident :fibo-sec-dbt-bnd/MunicipalDebtFundsUsage,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "municipal debt funds usage",
   :rdfs/subClassOf :fibo-fnd-arr-doc/LegalDocument,
   :skos/definition
   "official statement specifying how the funds raised via a new issue of municipal securities are to be applied"})

(def MunicipalDebtRemarketingAgent
  {:cmns-av/explanatoryNote
   "The remarketing agent also typically is responsible for resetting the interest rate for a variable rate issue and may act as tender agent.",
   :db/ident :fibo-sec-dbt-bnd/MunicipalDebtRemarketingAgent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "municipal debt remarketing agent",
   :rdfs/subClassOf #{:fibo-fbc-pas-fpas/Dealer
                      :fibo-fnd-agr-ctr/ContractThirdParty},
   :skos/definition
   "municipal securities dealer responsible for reselling to investors securities (such as variable rate demand obligations and other tender option bonds) that have been tendered for purchase by their owner"})

(def MunicipalDebtSourceOfFunds
  {:db/ident :fibo-sec-dbt-bnd/MunicipalDebtSourceOfFunds,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "municipal debt source of funds",
   :rdfs/subClassOf :fibo-fnd-arr-doc/LegalDocument,
   :skos/definition
   "official statement identifying the source of funds for a new issue of municipal securities"})

(def MunicipalNote
  {:cmns-av/explanatoryNote
   "Notes usually mature in one year or less, although notes of longer maturities are also issued.",
   :db/ident :fibo-sec-dbt-bnd/MunicipalNote,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "municipal note",
   :rdfs/subClassOf :fibo-sec-dbt-bnd/MunicipalSecurity,
   :skos/definition
   "short-term obligation to repay a specified principal amount on a certain date, together with interest at a stated rate, usually payable from a defined source of anticipated revenues"})

(def MunicipalSecurity
  {:cmns-av/explanatoryNote
   "A municipal security is typically a bond, note, warrant, certificate or other similar obligation issued by a state or local government or their agencies or authorities (such as cities, towns, villages, counties or special districts or authorities). A prime feature of most municipal securities is that interest or other investment earnings on them are generally excluded from gross income of the bondholder for federal income tax purposes. Some municipal securities are subject to federal income tax, although the issuers or bondholders may receive other federal tax advantages for certain types of taxable municipal securities. Some examples include Build America Bonds, municipal fund securities and direct pay subsidy bonds.",
   :db/ident :fibo-sec-dbt-bnd/MunicipalSecurity,
   :owl/disjointWith :fibo-sec-dbt-bnd/SovereignDebtInstrument,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "municipal security",
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-fnd-gao-obj/hasObjective,
      :owl/someValuesFrom :fibo-sec-dbt-bnd/MunicipalDebtFundsUsage,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-fnd-rel-rel/isIssuedBy,
      :owl/someValuesFrom {:owl/onProperty :fibo-fnd-pty-rl/isPlayedBy,
                           :owl/someValuesFrom
                           {:owl/unionOf [:fibo-be-ge-ge/MunicipalEntity
                                          :fibo-be-ge-ge/RegionalSovereignty],
                            :rdf/type    :owl/Class},
                           :rdf/type :owl/Restriction},
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-sec-dbt-bnd/hasFundingSource,
      :owl/someValuesFrom :fibo-sec-dbt-bnd/MunicipalDebtSourceOfFunds,
      :rdf/type           :owl/Restriction}
     :fibo-sec-dbt-bnd/GovernmentIssuedDebtSecurity},
   :skos/definition "debt obligation issued by a regional governmental entity"})

(def MunicipalTrustee
  {:cmns-av/explanatoryNote
   "In many cases, the trustee also acts as custodian, paying agent, registrar and/or transfer agent for the bonds.",
   :db/ident :fibo-sec-dbt-bnd/MunicipalTrustee,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "municipal trustee",
   :rdfs/subClassOf #{:fibo-be-tr-tr/Trustee
                      :fibo-fbc-fct-fse/FinancialInstitution},
   :skos/definition
   "financial institution with trust powers, designated by the issuer, that acts, pursuant to a bond contract, in a fiduciary capacity for the benefit of the bondholders in enforcing the terms of the bond contract"})

(def OriginalIssueDiscountBond
  {:cmns-av/explanatoryNote
   #{"The principal amount accretes over time at a constant accrual rate and is redeemed at full face value at maturity."
     "An original issue discount (OID) is the discount in price from a bond's face value at the time a bond or other debt instrument is first issued. The OID is the amount of discount or the difference between the original face value and the price paid for the bond."},
   :cmns-av/synonym "OID bond",
   :db/ident :fibo-sec-dbt-bnd/OriginalIssueDiscountBond,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "original issue discount bond",
   :rdfs/subClassOf
   #{{:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-fnd-acc-cur/MonetaryAmount,
      :owl/onProperty :fibo-sec-dbt-bnd/hasOriginalIssueDiscountAmount,
      :rdf/type       :owl/Restriction}
     {:owl/hasValue   :fibo-sec-dbt-dbti/ParValue,
      :owl/onProperty :fibo-sec-dbt-dbti/hasRelativePriceAtMaturity,
      :rdf/type       :owl/Restriction} :fibo-sec-dbt-bnd/Bond},
   :skos/definition
   "interest-bearing bond issued at a deep discount to face value"})

(def PartialCall
  {:db/ident :fibo-sec-dbt-bnd/PartialCall,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "partial call",
   :rdfs/subClassOf :fibo-sec-dbt-dbti/CallEvent,
   :skos/definition "call of part of an issue"})

(def PartialCallFeature
  {:db/ident :fibo-sec-dbt-bnd/PartialCallFeature,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "partial call feature",
   :rdfs/subClassOf
   #{:fibo-sec-dbt-dbti/CallFeature
     {:owl/onProperty
      :fibo-sec-dbt-bnd/hasPartialRedemptionAllocationConvention,
      :owl/someValuesFrom
      :fibo-sec-dbt-bnd/PartialRedemptionAllocationConvention,
      :rdf/type :owl/Restriction}},
   :skos/definition
   "call feature whereby the issuer can recall part of the issue on scheduled dates, where bonds are selected to be called according to some rule, or by selecting various bonds at random"})

(def PartialRedemptionAllocationConvention
  {:db/ident :fibo-sec-dbt-bnd/PartialRedemptionAllocationConvention,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "partial redemption allocation convention",
   :rdfs/subClassOf #{:fibo-fnd-dt-bd/Convention
                      {:owl/maxQualifiedCardinality 1,
                       :owl/onDataRange :xsd/decimal,
                       :owl/onProperty  :fibo-fnd-acc-cur/hasRateValue,
                       :rdf/type        :owl/Restriction}},
   :skos/definition
   "convention used to determine how the partial call will be actioned with respect to bond selection"})

(def PercentageCumulativeAverageValue
  {:cmns-av/abbreviation "percentage CAV",
   :db/ident :fibo-sec-dbt-bnd/PercentageCumulativeAverageValue,
   :rdf/type #{:fibo-sec-dbt-bnd/RateBasisConvention :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "percentage cumulative average value",
   :skos/definition
   "rate basis calculated as a percentage of cumulative average value"})

(def PercentageParValue
  {:db/ident :fibo-sec-dbt-bnd/PercentageParValue,
   :rdf/type #{:fibo-sec-dbt-bnd/RateBasisConvention :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "percentage par value",
   :skos/definition "rate basis calculated as a percentage of par value"})

(def PerpetualBond
  {:cmns-av/explanatoryNote
   "Perpetual bonds function much like dividend-paying stocks or certain preferred securities. Just as the owner of the stock receives a dividend payment as long as the stock is held, the perpetual bond owner receives an interest payment as long as the bond is held.",
   :cmns-av/synonym "consul",
   :db/ident :fibo-sec-dbt-bnd/PerpetualBond,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "perpetual bond",
   :rdfs/subClassOf :fibo-sec-dbt-bnd/Bond,
   :skos/definition
   "bond that has no maturity date, i.e., one that pays interest in perpetuity"})

(def ProRataConvention
  {:db/ident :fibo-sec-dbt-bnd/ProRataConvention,
   :rdf/type #{:fibo-sec-dbt-bnd/PartialRedemptionAllocationConvention
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "pro rata convention",
   :skos/definition
   "convention whereby securities that are subject to partial redemption are allocated proportionately"})

(def RateBasisConvention
  {:db/ident :fibo-sec-dbt-bnd/RateBasisConvention,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "rate basis convention",
   :rdfs/subClassOf #{:fibo-fnd-dt-bd/Convention
                      {:owl/maxQualifiedCardinality 1,
                       :owl/onDataRange :xsd/decimal,
                       :owl/onProperty  :fibo-fnd-acc-cur/hasRateValue,
                       :rdf/type        :owl/Restriction}},
   :skos/definition
   "basis for a percentage quoted rate as used in specifying bond call percentage amounts"})

(def RedemptionPayment
  {:db/ident :fibo-sec-dbt-bnd/RedemptionPayment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "redemption payment",
   :rdfs/subClassOf #{:fibo-sec-dbt-dbti/RedemptionEvent
                      :fibo-fnd-pas-psch/PaymentEvent},
   :skos/definition
   "repayment event involving payment of a bond's principal amount at maturity or when it is called"})

(def RedemptionSchedule
  {:db/ident :fibo-sec-dbt-bnd/RedemptionSchedule,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "redemption schedule",
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-col/comprises,
                       :owl/someValuesFrom :fibo-sec-dbt-dbti/RedemptionEvent,
                       :rdf/type           :owl/Restriction}
                      :fibo-fnd-pas-psch/PaymentSchedule},
   :skos/definition
   "repayment schedule whereby a given percentage of a bond issue is redeemed on predefined dates"})

(def RegularCouponSchedule
  {:cmns-av/explanatoryNote
   "A regular schedule may include an initial and/or final stub period.",
   :db/ident :fibo-sec-dbt-bnd/RegularCouponSchedule,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "regular coupon schedule",
   :rdfs/subClassOf :fibo-sec-dbt-bnd/CouponSchedule,
   :skos/definition
   "schedule including an interval of regular coupon payment dates"})

(def RegulatoryCall
  {:db/ident :fibo-sec-dbt-bnd/RegulatoryCall,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "regulatory call",
   :rdfs/subClassOf :fibo-sec-dbt-dbti/CallEvent,
   :skos/definition "call triggered by some regulation-specific rule"})

(def RemarketableBond
  {:cmns-av/explanatoryNote
   "A remarketing agent (dealer or underwriter) periodically surveys bond holders to identify those who want to sell bonds. The agent surveys market (or holds an auction) to determine interest rate at which the bonds can be resold. The rate on all outstanding bonds resets at the new rate. These programs are perpetual in the sense they often don't have a fixed maturity date, but the company can redeem them. If an auction fails, i.e., the agent can't place all the bonds then.",
   :db/ident :fibo-sec-dbt-bnd/RemarketableBond,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "remarketable bond",
   :rdfs/subClassOf #{:fibo-sec-dbt-bnd/FloatingRateNote
                      :fibo-sec-dbt-bnd/CorporateBond},
   :skos/definition
   "corporate bond program where the coupon rate on outstanding bonds is periodically reset through an auction process"})

(def RevenueBond
  {:cmns-av/explanatoryNote
   "Revenue bonds are municipal bonds that finance income-producing projects, such as toll bridges, highways, or local stadiums, and are secured by a specified revenue source. Typically, revenue bonds can be issued by any government agency or fund that is managed in the manner of a business, such as entities having both operating revenues and expenses.",
   :db/ident :fibo-sec-dbt-bnd/RevenueBond,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "revenue bond",
   :rdfs/subClassOf #{:fibo-sec-dbt-bnd/SecuredBond
                      :fibo-sec-dbt-bnd/MunicipalBond},
   :skos/definition
   "municipal bond supported by the revenue from a specific project"})

(def SecuredBond
  {:cmns-av/explanatoryNote
   "A secured bond may be collateralized by a claim on real assets, such as a factory or auto fleet; or by a claim on a revenue stream. A secured bond differs from a mortgage in that proceeds of the bond sale aren't used to acquire the asset.",
   :db/ident :fibo-sec-dbt-bnd/SecuredBond,
   :owl/disjointWith :fibo-sec-dbt-bnd/UnsecuredBond,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "secured bond",
   :rdfs/subClassOf :fibo-sec-dbt-bnd/Bond,
   :skos/definition
   "bond that is backed by collateral, such as a tangible asset or income stream, in addition to a general promise to pay"})

(def SinkingFundAmortizationTerms
  {:db/ident :fibo-sec-dbt-bnd/SinkingFundAmortizationTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "sinking fund amortization terms",
   :rdfs/subClassOf #{:fibo-sec-dbt-bnd/BondAmortizationPaymentTerms
                      {:owl/onDataRange :xsd/boolean,
                       :owl/onProperty  :fibo-sec-dbt-bnd/isMandatory,
                       :owl/qualifiedCardinality 1,
                       :rdf/type        :owl/Restriction}},
   :skos/definition
   "terms for the paydown of principal in a sinking fund type of amortizing security",
   :skos/editorialNote
   "At present there is only a schedule, there should be other terms for what happens on the scheduled dates. Sinking fund may be bullet e.g. x percent over year for y years. SF may be mandatory or contingent on some other economic event."})

(def SovereignBond
  {:cmns-av/explanatoryNote
   "Sovereign bonds issued by G20 developed countries are generally full faith and credit obligations. Sovereign bonds issued by emerging and developing countries may be issued in local currency or a G7 currency, and may either be full faith and credit (unsecured) or secured.",
   :db/ident :fibo-sec-dbt-bnd/SovereignBond,
   :owl/disjointWith :fibo-sec-dbt-bnd/MunicipalBond,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "sovereign bond",
   :rdfs/subClassOf #{:fibo-sec-dbt-bnd/SovereignDebtInstrument
                      :fibo-sec-dbt-bnd/GovernmentBond},
   :skos/definition "bond issued by the government of a country"})

(def SovereignDebtInstrument
  {:db/ident :fibo-sec-dbt-bnd/SovereignDebtInstrument,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "sovereign debt instrument",
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-fnd-rel-rel/isIssuedBy,
      :owl/someValuesFrom {:owl/onProperty     :fibo-fnd-pty-rl/isPlayedBy,
                           :owl/someValuesFrom :fibo-be-ge-ge/SovereignState,
                           :rdf/type           :owl/Restriction},
      :rdf/type           :owl/Restriction}
     :fibo-sec-dbt-bnd/GovernmentIssuedDebtSecurity},
   :skos/definition "debt security issued by the government of a country"})

(def SpecialAssessmentBond
  {:cmns-av/explanatoryNote
   "A special assessment is a charge imposed against a property in a particular locality because that property receives a special benefit by virtue of some public improvement, separate and apart from the general benefit accruing to the public at large. Special assessments may be apportioned according to the value of the benefit received, rather than merely the cost of the improvement.",
   :db/ident :fibo-sec-dbt-bnd/SpecialAssessmentBond,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "special assessment bond",
   :rdfs/subClassOf #{:fibo-sec-dbt-bnd/SecuredBond
                      :fibo-sec-dbt-bnd/MunicipalBond},
   :skos/definition
   "municipal bond used to fund a development project that is payable from the revenues of an assessment (tax) on the community that is intended to benefit from the project"})

(def SpecialObligationBond
  {:db/ident :fibo-sec-dbt-bnd/SpecialObligationBond,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "special obligation bond",
   :rdfs/subClassOf :fibo-sec-dbt-bnd/MunicipalBond,
   :skos/definition
   "bond secured by a limited revenue source, such as receipts derived from a designated project"})

(def SpecialTaxBond
  {:db/ident :fibo-sec-dbt-bnd/SpecialTaxBond,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "special tax bond",
   :rdfs/subClassOf #{:fibo-sec-dbt-bnd/SecuredBond
                      :fibo-sec-dbt-bnd/MunicipalBond},
   :skos/definition
   "bond secured by revenues derived from designated taxes other than ad valorem taxes",
   :skos/example
   "For example, bonds for a particular purpose might be supported by sales, cigarette, fuel or business license taxes."})

(def StepEvent
  {:db/ident :fibo-sec-dbt-bnd/StepEvent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "step event",
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fnd-rel-rel/involves,
                       :owl/someValuesFrom :fibo-sec-dbt-bnd/FixedCouponTerms,
                       :rdf/type           :owl/Restriction}
                      :fibo-sec-dbt-dbti/PrescriptiveEvent},
   :skos/definition
   "event whereby a set of fixed coupon terms comes into force as specified in a step schedule"})

(def StepSchedule
  {:db/ident :fibo-sec-dbt-bnd/StepSchedule,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "step schedule",
   :rdfs/subClassOf #{:fibo-fnd-dt-fd/AdHocSchedule
                      {:owl/onProperty     :cmns-col/comprises,
                       :owl/someValuesFrom :fibo-sec-dbt-bnd/StepEvent,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "schedule specifying the dates and rates relevant to securities that pay an initial interest rate but also have a feature where set rate increases happen at periodic intervals"})

(def StepUpBond
  {:cmns-av/explanatoryNote
   "The step change may be one time, or occur according to a schedule or at regular intervals.",
   :cmns-av/synonym "step down bond",
   :db/ident :fibo-sec-dbt-bnd/StepUpBond,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "step up bond",
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-sec-dbt-dbti/hasInterestPaymentTerms,
      :owl/someValuesFrom :fibo-sec-dbt-bnd/SteppedCouponTerms,
      :rdf/type           :owl/Restriction}
     :fibo-sec-dbt-dbti/FixedIncomeSecurity :fibo-sec-dbt-bnd/Bond},
   :skos/definition
   "bond with a coupon that increases (steps up) while the bond is outstanding"})

(def SteppedCouponTerms
  {:db/ident :fibo-sec-dbt-bnd/SteppedCouponTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "stepped coupon terms",
   :rdfs/subClassOf #{:fibo-sec-dbt-bnd/CouponPaymentTerms
                      {:owl/onProperty     :fibo-fnd-dt-fd/hasSchedule,
                       :owl/someValuesFrom :fibo-sec-dbt-bnd/StepSchedule,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "coupon payment terms for securities with a coupon that increases (steps up) while the bond is outstanding"})

(def StripBond
  {:db/ident :fibo-sec-dbt-bnd/StripBond,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "strip bond",
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fbc-dae-dbt/isBasedOn,
                       :owl/someValuesFrom :fibo-sec-dbt-bnd/Bond,
                       :rdf/type           :owl/Restriction}
                      :fibo-sec-dbt-dbti/Strip
                      :fibo-sec-dbt-bnd/ZeroCouponBond},
   :skos/definition
   "bond that is part of a series of bonds formed by selling each interest payment and the principal amount of a bond as separate zero coupon bonds."})

(def TaxAllocationBond
  {:cmns-av/explanatoryNote
   "Tax increment bonds, also known as tax allocation bonds, often are used to finance the redevelopment of blighted areas.",
   :db/ident :fibo-sec-dbt-bnd/TaxAllocationBond,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "tax allocation bond",
   :rdfs/subClassOf #{:fibo-sec-dbt-bnd/SecuredBond
                      :fibo-sec-dbt-bnd/MunicipalBond},
   :skos/definition
   "bond payable from the incremental increase in tax revenues realized from any increase in property value and other economic activity, often designed to capture the economic benefit resulting from a bond financing"})

(def TreasuryBill
  {:cmns-av/abbreviation "T-bill",
   :cmns-av/explanatoryNote
   "The pricing of T-bills is unique among U.S. government debt issues. Treasury bills are offered in multiples of $100 and in terms ranging from a few days to 52 weeks. Rather than providing interest payments as Treasury Bonds or Notes do, T-bills are sold at a discount, and the entire return is realized upon maturity. The price of a bill is determined at auction. The annualized interest rate earned on T-bills is equal to the difference between the purchase price and maturity value, divided by the maturity value.",
   :db/ident :fibo-sec-dbt-bnd/TreasuryBill,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "treasury bill",
   :rdfs/seeAlso
   #{{:xsd/anyURI
      "https://www.treasurydirect.gov/indiv/research/indepth/tbills/res_tbill_rates.htm"}
     {:xsd/anyURI
      "https://www.treasurydirect.gov/indiv/research/indepth/tbills/res_tbill.htm"}},
   :rdfs/subClassOf
   #{:fibo-sec-dbt-bnd/USTreasurySecurity
     :fibo-sec-dbt-tstd/MoneyMarketInstrument
     {:owl/hasValue   :fibo-sec-dbt-dbti/AtADiscount,
      :owl/onProperty :fibo-sec-dbt-dbti/hasRelativePriceAtIssue,
      :rdf/type       :owl/Restriction}
     {:owl/hasValue   :fibo-sec-dbt-dbti/ParValue,
      :owl/onProperty :fibo-sec-dbt-dbti/hasRelativePriceAtMaturity,
      :rdf/type       :owl/Restriction}
     {:owl/onProperty     :fibo-fbc-dae-dbt/hasInterestRate,
      :owl/someValuesFrom :fibo-ind-ir-ir/ReferenceInterestRate,
      :rdf/type           :owl/Restriction}},
   :skos/definition
   "short-term zero coupon treasury obligation with a maturity ranging from one to twelve months"})

(def TreasuryBond
  {:db/ident :fibo-sec-dbt-bnd/TreasuryBond,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "treasury bond",
   :rdfs/seeAlso
   {:xsd/anyURI
    "https://www.treasurydirect.gov/indiv/research/indepth/tbonds/res_tbond.htm"},
   :rdfs/subClassOf #{:fibo-sec-dbt-bnd/SovereignBond
                      :fibo-sec-dbt-bnd/USTreasurySecurity},
   :skos/definition
   "long term term coupon bearing treasury obligation issued in terms of 20 years or 30 years that pays interest every six months until they mature"})

(def TreasuryInflationProtectedSecurity
  {:cmns-av/abbreviation "TIPS",
   :cmns-av/explanatoryNote
   "Treasury Inflation-Protected Securities, or TIPS, provide protection against inflation. The principal of a TIPS increases with inflation and decreases with deflation, as measured by the Consumer Price Index. When a TIPS matures, you are paid the adjusted principal or original principal, whichever is greater.",
   :db/ident :fibo-sec-dbt-bnd/TreasuryInflationProtectedSecurity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "treasury inflation-protected security",
   :rdfs/seeAlso
   {:xsd/anyURI
    "https://www.treasurydirect.gov/indiv/products/prod_tips_glance.htm"},
   :rdfs/subClassOf #{:fibo-sec-dbt-bnd/USTreasurySecurity
                      :fibo-sec-dbt-bnd/VariablePrincipalBond
                      :fibo-sec-dbt-bnd/InflationLinkedBond},
   :skos/definition
   "variable income bond whose principal is indexed to inflation or deflation and thus changes over the life of the security"})

(def TreasuryNote
  {:db/ident :fibo-sec-dbt-bnd/TreasuryNote,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "treasury note",
   :rdfs/subClassOf #{:fibo-sec-dbt-bnd/USTreasurySecurity
                      :fibo-sec-dbt-bnd/MediumTermNote},
   :skos/definition
   "medium term coupon bearing treasury obligation with original maturity ranging from two to ten years"})

(def UKGovernmentSecurity
  {:cmns-av/explanatoryNote
   #{"The term 'gilt' or 'gilt-edged security' is a reference to the primary characteristic of gilts as an investment: their security. This is a reflection of the fact that the British Government has never failed to make interest or principal payments on gilts as they fall due."
     "If a private investor wishes to purchase gilts the secondary market can be accessed through a stockbroker, bank or the DMO's Purchase and Sale Service."},
   :cmns-av/synonym #{"gilt-edged security" "gilt"},
   :db/ident :fibo-sec-dbt-bnd/UKGovernmentSecurity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "U.K. Government security",
   :rdfs/seeAlso
   {:xsd/anyURI
    "https://www.dmo.gov.uk/responsibilities/gilt-market/buying-selling/"},
   :rdfs/subClassOf :fibo-sec-dbt-bnd/SovereignDebtInstrument,
   :skos/definition
   "debt instrument issued by HM Treasury and listed on the London Stock Exchange"})

(def USTreasurySecurity
  {:db/ident :fibo-sec-dbt-bnd/USTreasurySecurity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "U.S. Treasury security",
   :rdfs/subClassOf #{{:owl/hasValue   :fibo-fnd-acc-4217/USDollar,
                       :owl/onProperty :fibo-fbc-fi-fi/isDenominatedIn,
                       :rdf/type       :owl/Restriction}
                      :fibo-sec-dbt-bnd/SovereignDebtInstrument},
   :skos/definition
   "debt instrument issued by the United States Department of the Treasury that carries a full faith and credit guarantee"})

(def UnlistedBond
  {:cmns-av/synonym "OTC Bond",
   :db/ident :fibo-sec-dbt-bnd/UnlistedBond,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "unlisted bond",
   :rdfs/subClassOf :fibo-sec-dbt-bnd/Bond,
   :skos/definition
   "bond that is traded over the counter rather than via an exchange or other listing facility"})

(def UnsecuredBond
  {:cmns-av/explanatoryNote
   "Most unsecured bonds pose limited risk of default, as the organizations that issue them are typically financially sound.",
   :cmns-av/synonym "debenture",
   :db/ident :fibo-sec-dbt-bnd/UnsecuredBond,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "unsecured bond",
   :rdfs/subClassOf :fibo-sec-dbt-bnd/Bond,
   :skos/definition
   "bond that is only secured by the bond issuer's good credit standing"})

(def VariableCouponBond
  {:cmns-av/explanatoryNote
   "The rate adjusts according to a predetermined formula outlined in the bond's prospectus or official statement.",
   :db/ident :fibo-sec-dbt-bnd/VariableCouponBond,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "variable coupon bond",
   :rdfs/subClassOf #{:fibo-sec-dbt-bnd/VariableIncomeBond
                      {:owl/onProperty     :fibo-fbc-dae-dbt/hasInterestRate,
                       :owl/someValuesFrom :fibo-sec-dbt-bnd/BondVariableCoupon,
                       :rdf/type           :owl/Restriction}},
   :skos/definition "bond that has a floating interest rate"})

(def VariableCouponTerms
  {:db/ident :fibo-sec-dbt-bnd/VariableCouponTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "variable coupon terms",
   :rdfs/subClassOf #{:fibo-sec-dbt-bnd/CouponPaymentTerms
                      {:owl/onProperty :fibo-fnd-utl-alx/hasExpression,
                       :owl/someValuesFrom
                       :fibo-sec-dbt-bnd/VariableInterestCalculationFormula,
                       :rdf/type :owl/Restriction}
                      {:owl/onProperty     :fibo-fbc-dae-dbt/isBasedOn,
                       :owl/someValuesFrom :fibo-ind-ind-ind/MarketRate,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "contractual terms specifying the calculation of the interest rate for a variable coupon bond"})

(def VariableDebtPrincipal
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Not the same as principal paydown. This is when the principal itself varies over time, usually as a result of being defined in relation to some index such as an inflation index. Forms the debt principal in instruments such as inflation bonds."},
   :db/ident :fibo-sec-dbt-bnd/VariableDebtPrincipal,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "variable debt principal",
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fnd-acc-cur/hasMonetaryAmount,
                       :owl/someValuesFrom :fibo-fnd-acc-cur/MonetaryAmount,
                       :rdf/type           :owl/Restriction}
                      :fibo-sec-dbt-dbti/PubliclyIssuedDebt},
   :skos/definition
   "principal that is defined in relation to some variable and so varies over time, as principal"})

(def VariableIncomeBond
  {:db/ident :fibo-sec-dbt-bnd/VariableIncomeBond,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "variable income bond",
   :rdfs/subClassOf #{:fibo-sec-dbt-dbti/VariableIncomeSecurity
                      :fibo-sec-dbt-bnd/Bond},
   :skos/definition
   "bond whose income may vary over time, because either the coupon rate or principal amount changes in line with an index or schedule over the life of the security"})

(def VariableInterestCalculationFormula
  {:db/ident :fibo-sec-dbt-bnd/VariableInterestCalculationFormula,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "variable interest calculation formula",
   :rdfs/subClassOf :fibo-sec-dbt-dbti/FullyIndexedInterestRate,
   :skos/definition "formula for the calculation of variable interest"})

(def VariableInterestExpression
  {:db/ident :fibo-sec-dbt-bnd/VariableInterestExpression,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "variable interest expression",
   :rdfs/subClassOf #{{:owl/maxQualifiedCardinality 1,
                       :owl/onDataRange :xsd/decimal,
                       :owl/onProperty  :fibo-sec-dbt-bnd/hasFloor,
                       :rdf/type        :owl/Restriction}
                      {:owl/maxQualifiedCardinality 1,
                       :owl/onDataRange :xsd/decimal,
                       :owl/onProperty  :fibo-sec-dbt-bnd/hasCeiling,
                       :rdf/type        :owl/Restriction}
                      :fibo-fnd-utl-alx/Expression
                      {:owl/onClass :fibo-sec-dbt-dbti/FullyIndexedInterestRate,
                       :owl/onProperty :fibo-fnd-utl-alx/hasArgument,
                       :owl/qualifiedCardinality 1,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "an expression used to determine a variable interest payment amount"})

(def VariablePrincipalBond
  {:cmns-av/explanatoryNote
   "The principal on variable principal bonds adjusts line with an index such as inflation or GDP. For example, for a bond linked to the CPI, if inflation rises two percent the principal increases by 2 percent. The coupon rate is typically fixed. The best-known example is TIPS or Treasury Inflation Protected Bonds, which are linked to the CPI. TIPs offer a real or inflation adjusted rate of return.",
   :db/ident :fibo-sec-dbt-bnd/VariablePrincipalBond,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "variable principal bond",
   :rdfs/subClassOf #{:fibo-sec-dbt-bnd/VariableIncomeBond
                      {:owl/onProperty :fibo-fnd-agr-ctr/definesTermsFor,
                       :owl/someValuesFrom
                       :fibo-sec-dbt-bnd/VariableDebtPrincipal,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "bond whose principal adjusts over time with changes in an index"})

(def ZeroCouponBond
  {:cmns-av/explanatoryNote
   #{"Fannie Mae also issues zero-coupon callable debt securities. Zero-coupon notes are debt securities on which no coupon interest is paid to the investor. Rather, the security is purchased at a discounted dollar price and matures at par. If the option on a callable zero-coupon security is exercised, it is redeemed at a higher dollar price than the original issue price. The yield for a callable zero-coupon security is based on the difference between the original discounted price and the principal payment at the call date."
     "The principal amount accretes over time at a constant accrual rate and is redeemed at full face value at maturity. In effect, the accrual rate is the coupon rate or yield which is added to the outstanding principal rather than being paid out to investors."},
   :cmns-av/synonym "z-bond",
   :db/ident :fibo-sec-dbt-bnd/ZeroCouponBond,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "zero coupon bond",
   :rdfs/subClassOf
   #{{:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-fnd-acc-cur/MonetaryAmount,
      :owl/onProperty :fibo-sec-dbt-bnd/hasOriginalIssueDiscountAmount,
      :rdf/type       :owl/Restriction} :fibo-sec-dbt-dbti/FixedIncomeSecurity
     {:owl/hasValue   :fibo-sec-dbt-dbti/ParValue,
      :owl/onProperty :fibo-sec-dbt-dbti/hasRelativePriceAtMaturity,
      :rdf/type       :owl/Restriction}
     {:owl/onProperty     :fibo-sec-dbt-dbti/hasInterestPaymentTerms,
      :owl/someValuesFrom :fibo-sec-dbt-bnd/ZeroCouponTerms,
      :rdf/type           :owl/Restriction} :fibo-sec-dbt-bnd/Bond},
   :skos/definition
   "bond issued with a coupon rate of zero and that trades at a deep discount to face value"})

(def ZeroCouponTerms
  {:db/ident :fibo-sec-dbt-bnd/ZeroCouponTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "zero coupon terms",
   :rdfs/subClassOf #{:fibo-sec-dbt-bnd/FixedCouponTerms
                      :fibo-sec-dbt-bnd/BondAmortizationPaymentTerms
                      {:owl/hasValue   :fibo-sec-dbt-bnd/ZeroInterestRate,
                       :owl/onProperty :fibo-fbc-dae-dbt/hasInterestRate,
                       :rdf/type       :owl/Restriction}},
   :skos/definition "terms for payment of interest on a zero coupon bond"})

(def ZeroInterestRate
  {:db/ident :fibo-sec-dbt-bnd/ZeroInterestRate,
   :fibo-fnd-acc-cur/hasRateValue 0,
   :rdf/type #{:fibo-fbc-dae-dbt/FixedInterestRate :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "zero interest rate",
   :skos/definition "an interest rate of zero (0) percent"})

(def hasAwardDate
  {:cmns-av/synonym "has sale date",
   :db/ident :fibo-sec-dbt-bnd/hasAwardDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-bnd/MunicipalBond,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "has award date",
   :rdfs/range :cmns-dt/ExplicitDate,
   :rdfs/subPropertyOf :cmns-dt/hasExplicitDate,
   :skos/definition
   "specifies the date on which bonds are awarded to the lead manager or syndicate on negotiated deals, or the date of bidding on competitive deals"})

(def hasCallPrice
  {:cmns-av/explanatoryNote
   "This is the price a bond issuer or preferred stock issuer must pay investors to buy back, or call, all or part of an issue before the maturity date.",
   :cmns-av/synonym "has redemption price",
   :db/ident :fibo-sec-dbt-bnd/hasCallPrice,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-dbti/CallFeature,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "has call price",
   :rdfs/range :fibo-fnd-acc-cur/MonetaryPrice,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasPrice,
   :skos/definition
   "indicates the amount of the call on the specified call date, typically the sum of par value and the call premium, as specified in the contract"})

(def hasCallRateBasis
  {:cmns-av/explanatoryNote
   "Zero coupon bonds and OID bonds are callable at an accreted value.",
   :db/ident :fibo-sec-dbt-bnd/hasCallRateBasis,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-dbti/CallEvent,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "has call rate basis",
   :rdfs/range :fibo-sec-dbt-bnd/RateBasisConvention,
   :skos/definition
   "for each call event on the schedule, indicates whether the rate is expressed as a percentage of par or percentage of percentage of cumulative average value (CAV)"})

(def hasCeiling
  {:db/ident :fibo-sec-dbt-bnd/hasCeiling,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-dbt-bnd/VariableInterestExpression,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "has ceiling",
   :rdfs/range :xsd/decimal,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasRateValue,
   :skos/definition "indicates the maximum variable interest payment amount"})

(def hasConvertibleDate
  {:db/ident :fibo-sec-dbt-bnd/hasConvertibleDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-bnd/BondConversionTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "has convertible date",
   :rdfs/range :cmns-dt/ExplicitDate,
   :rdfs/subPropertyOf :cmns-dt/hasExplicitDate,
   :skos/definition
   "date on which a bond can be converted into the specified equity security"})

(def hasExtraordinaryRedemptionProvision
  {:db/ident :fibo-sec-dbt-bnd/hasExtraordinaryRedemptionProvision,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-fi-fi/RedemptionProvision,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "has extraordinary redemption provision",
   :rdfs/range :fibo-sec-dbt-bnd/ExtraordinaryRedemptionProvision,
   :rdfs/subPropertyOf :fibo-fnd-agr-ctr/hasContractualElement,
   :skos/definition
   "relates the redemption provision of a debt instrument to one-time provision that may be exercised by the issuer under certain circumstances"})

(def hasFinalMaturityDate
  {:db/ident :fibo-sec-dbt-bnd/hasFinalMaturityDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-fi-fi/RedemptionProvision,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "has final maturity date",
   :rdfs/range :cmns-dt/ExplicitDate,
   :rdfs/subPropertyOf :cmns-dt/hasExplicitDate,
   :skos/definition
   "indicates the final payment date of a financial instrument, at which point the principal (and all remaining interest) is due to be paid"})

(def hasFirstCallPrice
  {:db/ident :fibo-sec-dbt-bnd/hasFirstCallPrice,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-dbti/CallFeature,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "has first call price",
   :rdfs/range :fibo-fnd-acc-cur/MonetaryPrice,
   :rdfs/subPropertyOf :fibo-sec-dbt-bnd/hasCallPrice,
   :skos/definition
   "indicates the amount of the call on the first call date as specified in the call schedule"})

(def hasFirstCouponPaymentDate
  {:cmns-av/explanatoryNote
   #{{:rdf/language "en",
      :rdf/value
      "The first coupon payment period can be long or short when this date doesn't coincide with the start of a normal coupon payment period."}
     {:rdf/language "en",
      :rdf/value
      "The first coupon date sometimes occurs at an irregular time; that is, if the bond pays coupons every six months, the first coupon period may be longer or shorter than six months."}},
   :db/ident :fibo-sec-dbt-bnd/hasFirstCouponPaymentDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-bnd/CouponPaymentTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "has first coupon payment date",
   :rdfs/range :cmns-dt/ExplicitDate,
   :rdfs/subPropertyOf #{:cmns-dt/hasExplicitDate :cmns-dt/hasStartDate},
   :skos/definition
   "specifies the first date on which the issuer or its agent expects or commits to make a coupon payment"})

(def hasFirstParCallDate
  {:db/ident :fibo-sec-dbt-bnd/hasFirstParCallDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-dbti/CallFeature,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "has first par call date",
   :rdfs/range :cmns-dt/ExplicitDate,
   :rdfs/subPropertyOf #{:cmns-dt/hasExplicitDate :cmns-dt/hasStartDate},
   :skos/definition
   "indicates the first date on which the bond may be called at par for redemption"})

(def hasFirstParCallPrice
  {:db/ident :fibo-sec-dbt-bnd/hasFirstParCallPrice,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-dbti/CallFeature,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "has first par call price",
   :rdfs/range :fibo-fnd-acc-cur/MonetaryPrice,
   :rdfs/subPropertyOf :fibo-sec-dbt-bnd/hasFirstCallPrice,
   :skos/definition
   "specifies the amount of the call on the first par call date as specified in the call schedule"})

(def hasFirstPremiumCallDate
  {:db/ident :fibo-sec-dbt-bnd/hasFirstPremiumCallDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-dbti/CallFeature,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "has first premium call date",
   :rdfs/range :cmns-dt/ExplicitDate,
   :rdfs/subPropertyOf #{:cmns-dt/hasExplicitDate :cmns-dt/hasStartDate},
   :skos/definition
   "indicates the first date on which the bond may be called for redemption at a price above par"})

(def hasFirstPremiumCallPrice
  {:db/ident :fibo-sec-dbt-bnd/hasFirstPremiumCallPrice,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-dbti/CallFeature,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "has first premium call price",
   :rdfs/range :fibo-fnd-acc-cur/MonetaryPrice,
   :rdfs/subPropertyOf :fibo-sec-dbt-bnd/hasFirstCallPrice,
   :skos/definition
   "specifies the amount of the call on the first call date on which the bond may be called at a price above par as specified in the call schedule"})

(def hasFirstPutDate
  {:db/ident :fibo-sec-dbt-bnd/hasFirstPutDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-dbti/PutFeature,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "has first put date",
   :rdfs/range :cmns-dt/ExplicitDate,
   :rdfs/subPropertyOf #{:cmns-dt/hasExplicitDate :fibo-sec-dbt-bnd/hasPutDate},
   :skos/definition
   "indicates the initial date on which the holder may sell the bond to the issuer prior to maturity"})

(def hasFirstPutPrice
  {:db/ident :fibo-sec-dbt-bnd/hasFirstPutPrice,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-dbti/PutFeature,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "has first put price",
   :rdfs/range :fibo-fnd-acc-cur/MonetaryPrice,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasPrice,
   :skos/definition
   "specifies the initial price at which the holder may sell the bond to the issuer prior to maturity"})

(def hasFloor
  {:db/ident :fibo-sec-dbt-bnd/hasFloor,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-dbt-bnd/VariableInterestExpression,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "has floor",
   :rdfs/range :xsd/decimal,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasRateValue,
   :skos/definition "indicates the minimum variable interest payment amount"})

(def hasFundingSource
  {:db/ident :fibo-sec-dbt-bnd/hasFundingSource,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-bnd/MunicipalSecurity,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "has funding source",
   :rdfs/range :fibo-sec-dbt-bnd/MunicipalDebtSourceOfFunds,
   :rdfs/subPropertyOf :fibo-fnd-arr-doc/hasDataSource,
   :skos/definition
   "indicates the source of funds for a new issue of municipal securities"})

(def hasLastCouponPaymentDate
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The last coupon date sometimes occurs at an irregular time; that is, if the bond pays coupons every six months, the last coupon period may be longer or shorter than six months."},
   :db/ident :fibo-sec-dbt-bnd/hasLastCouponPaymentDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-bnd/CouponPaymentTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "has last coupon payment date",
   :rdfs/range :cmns-dt/ExplicitDate,
   :rdfs/subPropertyOf #{:cmns-dt/hasEndDate :cmns-dt/hasExplicitDate},
   :skos/definition
   "specifies the final date on which the issuer expects to make a final coupon payment"})

(def hasLockoutPeriod
  {:db/ident :fibo-sec-dbt-bnd/hasLockoutPeriod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-dbti/CallFeature,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "has lockout period",
   :rdfs/range :cmns-dt/DatePeriod,
   :rdfs/subPropertyOf :cmns-dt/hasDatePeriod,
   :skos/definition
   "indicates the period of time for which a callable security cannot be called and only interest coupon payments are received by the security holder",
   :skos/example
   "With a 10-year noncall 3-year (\"10nc3\") debt security, the security cannot be called for the first three years."})

(def hasMunicipalTrustee
  {:db/ident :fibo-sec-dbt-bnd/hasMunicipalTrustee,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-bnd/MunicipalBond,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "has municipal trustee",
   :rdfs/range :fibo-sec-dbt-bnd/MunicipalTrustee,
   :rdfs/subPropertyOf :fibo-fnd-agr-ctr/hasThirdParty,
   :skos/definition
   "specifies the financial institution with trust powers, designated by the issuer, that acts, pursuant to a bond contract, in a fiduciary capacity for the benefit of the bondholders in enforcing the terms of the bond contract"})

(def hasOriginalIssueDiscountAmount
  {:db/ident :fibo-sec-dbt-bnd/hasOriginalIssueDiscountAmount,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-bnd/Bond,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "has original issue discount amount",
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasMonetaryAmount,
   :skos/definition
   "indicates the difference between the stated redemption price at maturity and the issue price"})

(def hasPartialRedemptionAllocationConvention
  {:db/ident :fibo-sec-dbt-bnd/hasPartialRedemptionAllocationConvention,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-bnd/PartialCallFeature,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "has partial redemption allocation convention",
   :rdfs/range :fibo-sec-dbt-bnd/PartialRedemptionAllocationConvention,
   :skos/definition
   "indicates the convention used to determine how the redemption is allocated over the set of bond holders"})

(def hasPenultimateCouponPaymentDate
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "This is important since the securities processing area needs to start its procedures in anticipation of maturity. For zero coupon bonds, it is the last compounding date prior to maturity."},
   :db/ident :fibo-sec-dbt-bnd/hasPenultimateCouponPaymentDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-bnd/CouponPaymentTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "has penultimate coupon payment date",
   :rdfs/range :cmns-dt/ExplicitDate,
   :rdfs/subPropertyOf :cmns-dt/hasExplicitDate,
   :skos/definition "specifies the last coupon payment prior to maturity"})

(def hasPremiumAmount
  {:db/ident :fibo-sec-dbt-bnd/hasPremiumAmount,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-dbti/CallFeature,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "has premium amount",
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasMonetaryAmount,
   :skos/definition
   "indicates the premium paid to a bond holder when the bond is called"})

(def hasPutDate
  {:db/ident :fibo-sec-dbt-bnd/hasPutDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-dbti/PutFeature,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "has put date",
   :rdfs/range :cmns-dt/ExplicitDate,
   :rdfs/subPropertyOf :cmns-dt/hasExplicitDate,
   :skos/definition
   "indicates the date on which a security is subject to redemption by the bond holder"})

(def hasPutFrequency
  {:db/ident :fibo-sec-dbt-bnd/hasPutFrequency,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-dbti/PutFeature,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "has put frequency",
   :rdfs/range :fibo-fnd-dt-fd/RecurrenceInterval,
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasRecurrenceInterval,
   :skos/definition
   "indicates the recurring window of time in which the put feature can be exercised"})

(def hasRedemptionAmount
  {:db/ident :fibo-sec-dbt-bnd/hasRedemptionAmount,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-bnd/RedemptionPayment,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "has redemption amount",
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasMonetaryAmount,
   :skos/definition
   "indicates the amount of the principal paid with a redemption payment"})

(def hasRemarketingAgent
  {:db/ident :fibo-sec-dbt-bnd/hasRemarketingAgent,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-bnd/MunicipalSecurity,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "has remarketing agent",
   :rdfs/range :fibo-sec-dbt-bnd/MunicipalDebtRemarketingAgent,
   :rdfs/subPropertyOf :fibo-fnd-agr-ctr/hasThirdParty,
   :skos/definition
   "identifies the dealer responsible for reselling to investors securities (such as variable rate demand obligations and other tender option bonds) that have been tendered for purchase by their owner."})

(def hasResetDateOffset
  {:db/ident :fibo-sec-dbt-bnd/hasResetDateOffset,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-bnd/VariableCouponTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "has reset date offset",
   :rdfs/range :fibo-fnd-dt-fd/RelativeDate,
   :rdfs/subPropertyOf :cmns-dt/hasDate,
   :skos/definition
   "indicates the offset from the coupon payment date on which the rate is reset"})

(def isBankQualified
  {:cmns-av/explanatoryNote
   "A bond that is bank qualified is also known as a qualified tax-exempt obligation.",
   :db/ident :fibo-sec-dbt-bnd/isBankQualified,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-dbt-bnd/MunicipalBond,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "is bank qualified",
   :rdfs/range :xsd/boolean,
   :skos/definition
   "indicates whether or not a given municipal bond conforms with section 265(b)(3) of the IRS tax code; when purchased by a commercial bank for its portfolio, such designation allows the bank to deduct a portion of the interest cost of carry for the position"})

(def isLegalOpinionAvailable
  {:db/ident :fibo-sec-dbt-bnd/isLegalOpinionAvailable,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-dbt-bnd/MunicipalBond,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "is legal opinion available",
   :rdfs/range :xsd/boolean,
   :skos/definition
   "indicates whether a legal opinion exists for a given municipal bond"})

(def isLinkedToFallback
  {:cmns-av/explanatoryNote
   "Fallback Bond means, in relation to an Inflation Index applicable to an Inflation Linked Note, a bond selected by the Calculation Agent and issued by the government or one of the governments (but not any government agency) of the country (or countries) to whose level of inflation the Inflation Index relates and which pays a coupon and/or redemption amount which is calculated by reference to the Inflation Index, with a maturity date which falls on the same day as the Maturity Date of the Inflation Linked Notes, or such other date as the Calculation Agent shall select if there is no such bond maturing on the Maturity Date of the Inflation Linked Notes. If any bond so selected is redeemed, the Calculation Agent will select a new Fallback Bond on the same basis, but selected from all eligible bonds in issue at the time the original Fallback Bond is redeemed (including any bond for which the redeemed bond is exchanged). Note the rate of the fallback bond is used as a substitute for the inflation index if, for example, it is no longer published.",
   :db/ident :fibo-sec-dbt-bnd/isLinkedToFallback,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-fi-fi/FinancialInstrument,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "is linked to fallback",
   :rdfs/range :fibo-sec-dbt-bnd/GovernmentBond,
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/refersTo,
   :skos/definition
   "relates an index-linked instrument to a government bond that may be selected by a calculation agent"})

(def isMandatory
  {:db/ident :fibo-sec-dbt-bnd/isMandatory,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "is mandatory",
   :rdfs/range :xsd/boolean,
   :skos/definition "indicates whether something is required"})

(def isProRated
  {:db/ident :fibo-sec-dbt-bnd/isProRated,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-fbc-dae-dbt/InterestPaymentTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "is pro-rated",
   :rdfs/range :xsd/boolean,
   :skos/definition
   "indicates whether the coupon is pro rated to the actual number of days in the payment period versus the number of payment periods"})

(def isSuperSinker
  {:cmns-av/explanatoryNote
   "Super-sinker is a colloquial term for a term maturity, usually from a single family mortgage revenue issue with several term maturities, that will be the first to be called from a sinking fund into which all proceeds from prepayments of mortgages financed by the issue are deposited. The maturity's priority status under the call provisions means that it is likely to be redeemed in its entirety well before the stated maturity date.",
   :db/ident :fibo-sec-dbt-bnd/isSuperSinker,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-dbt-bnd/SinkingFundAmortizationTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"},
   :rdfs/label "super sinker",
   :rdfs/range :xsd/boolean,
   :skos/definition
   "indicates that the bond has a long-term coupon but short potential short maturity"})

(def urn:uuid:d3c6acee-6479-5f11-afac-07cad35eb124
  {:cmns-av/copyright #{"Copyright (c) 2018-2023 Object Management Group, Inc."
                        "Copyright (c) 2016-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology defines the basic concept of a bond and a number of bond variants including convertible and callable bonds. Medium term notes (MTNs) and debentures are also defined.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/RegistrationAuthorities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/DebtAndEquities/Guaranty/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/GovernmentEntities/GovernmentEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/IND/Indicators/Indicators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/Analytics/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/GoalsAndObjectives/Objectives/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/CorporateBodies/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Parties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Securities/SecuritiesListings/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Accounting/ISO4217-CurrencyCodes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/DebtAndEquities/Debt/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Agreements/Agreements/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/IND/EconomicIndicators/EconomicIndicators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FunctionalEntities/FinancialServicesEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Debt/DebtInstruments/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/Trusts/Trusts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Securities/SecuritiesIssuance/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/DatesAndTimes/Occurrences/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Equities/EquityInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/ProductsAndServices/PaymentsAndSchedules/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Roles/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/DatesAndTimes/BusinessDates/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/IND/InterestRates/InterestRates/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/FunctionalEntities/FunctionalEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Arrangements/Documents/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Debt/TradedShortTermDebt/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/DatesAndTimes/FinancialDates/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/ProductsAndServices/FinancialProductsAndServices/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Debt/Bonds/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Bonds Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Debt/Bonds.rdf version of this ontology was revised to eliminate references to the exercise conventions ontology, which are not needed for bonds."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Debt/Bonds.rdf version of this ontology was revised to allow for variation in index-linked bonds, such as those whose interest payments vary with an index in addition to those that have a variable principal linked to an index and to make a number of corrections to the class hierarchy."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Debt/Bonds.rdf version of this ontology was revised to address text formatting hygiene issues."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Debt/Bonds.rdf version of this ontology was revised to eliminate a duplicate 'isBasedOn' property and replace it with the property of the same name in the debt ontology, to revise the inheritance hierarchy for bond conversion terms to reflect changes in the representation of redemption more generally, to reflect the move of redemption provision from debt to financial instruments, and eliminate circular and ambiguous definitions."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Debt/Bonds.rdf version of this ontology was revised to eliminate false positives in hygiene tests due to concept names containing words, such as 'and', which might indicate that the concept actually reflects more than one thing, including distinguishing zero coupon from original issue discount bonds, and replace the use of call price and put price, which are overly constrained, with monetary price."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Debt/Bonds.rdf version of this ontology was revised to incorporate the concept of a credit agreement repaid at maturity, which is a component assumed to be part of the definition of a bond, and to add an explanatory note to the definition of Treasury Bill."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Debt/Bonds.rdf version of this ontology was revised to eliminate duplication of concepts in LCC and eliminate a redundant superclass from RegularCouponSchedule."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Debt/Bonds.rdf version of this ontology was revised to reflect the refactored definition of a listing and improve the definition of corporate bond."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."},
   :xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/"})