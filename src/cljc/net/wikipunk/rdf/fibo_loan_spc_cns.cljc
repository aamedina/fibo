(ns net.wikipunk.rdf.fibo-loan-spc-cns
  {:cmns-av/copyright #{"Copyright (c) 2023-2024 Object Management Group, Inc."
                        "Copyright (c) 2015-2024 EDM Council, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/LOAN/LoansSpecific/ConsumerLoans/",
   :dcterms/abstract
   "The consumer loans ontology defines concepts specific to loans that are offered only to consumers rather than to organization, primarily for personal, family, or household purposes.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-rlcmp" "https://www.omg.org/spec/Commons/RolesAndCompositions/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-le-lp"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/",
    "fibo-fbc-dae-dbt"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
    "fibo-fnd-pas-pas"
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-loan-ln-ln"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/",
    "fibo-loan-spc-cns"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/ConsumerLoans/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/ProductsAndServices/ProductsAndServices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/DebtAndEquities/Debt/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/LOAN/LoansGeneral/Loans/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/LOAN/LoansSpecific/ConsumerLoans/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-loan-spc-cns",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/ConsumerLoans/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Consumer Loans Ontology"},
   :skos/changeNote
   "The https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/ConsumerLoans.rdf version of the ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380).",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/ConsumerLoans/"})

(def ConsumerLoan
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "12 CFR § 228.12, https://www.law.cornell.edu/cfr/text/12/228.12"},
   :cmns-av/explanatoryNote
   #{{:rdf/language "en",
      :rdf/value
      "In the United Kingdom and per the Bank of England, lending to individuals (excluding student loans) consists of sterling lending secured on dwellings (i.e. mortgages) and sterling consumer credit to UK-resident individuals. See https://www.bankofengland.co.uk/statistics/details/further-details-about-total-lending-to-individuals-data. This definition is broader than the definition used in the US, however."}
     {:rdf/language "en",
      :rdf/value
      "In the United States, consumer loans do not include a home mortgage, small business, or small farm loans. They are defined by law to include the following: (1) Motor vehicle loan, which is a consumer loan extended for the purchase of and secured by a motor vehicle; (2) Credit card loan, which is a line of credit for household, family, or other personal expenditures that is accessed by a borrower's use of a 'credit card,' as this term is defined in § 1026.2 of 12 CFR § 228.12; (3) Other secured consumer loan, which is a secured consumer loan that is not included in one of the other categories of consumer loans; and (4) Other unsecured consumer loan, which is an unsecured consumer loan that is not included in one of the other categories of consumer loans."}},
   :db/ident :fibo-loan-spc-cns/ConsumerLoan,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/ConsumerLoans/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "consumer loan"},
   :rdfs/subClassOf #{:fibo-loan-ln-ln/Loan
                      {:owl/onProperty :fibo-fbc-dae-dbt/hasBorrower,
                       :owl/someValuesFrom
                       {:owl/unionOf
                        [:fibo-fnd-pas-pas/Consumer
                         {:owl/onProperty :cmns-rlcmp/isPlayedBy,
                          :owl/someValuesFrom
                          :fibo-be-le-lp/LegallyCompetentNaturalPerson,
                          :rdf/type :owl/Restriction}],
                        :rdf/type :owl/Class},
                       :rdf/type :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "loan to one or more individuals for household, family, or other personal expenditures, excluding mortgages and student loans"},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "Other secured consumer loans may include loans against insurance policies, against securities held in a retirement account, loans secured with collateral other than for the loan's stated purpose, lines of credit other than credit card agreements, and so forth."}})

(def HomeEquityLineOfCredit
  {:cmns-av/acronym {:rdf/language "en",
                     :rdf/value    "HELOC"},
   :cmns-av/explanatoryNote
   #{{:rdf/language "en",
      :rdf/value
      "Usually, the term of a HELOC can vary from 5 to up to 25 years, with an initial draw period during which the borrower can access the line of credit, followed by a repayment period during which monthly payments on principal and interest are due until the loan is paid in full."}
     {:rdf/language "en",
      :rdf/value
      "Home equity loans allow the borrower to borrow against the difference between the fair market value of the property, as determined by an appraisal, and the amount of any outstanding debt on that property, which is typically a first mortgage. Common practice is to set the maximum amount that can be borrowed of up to 80 percent of the fair market value less any outstanding debt."}},
   :db/ident :fibo-loan-spc-cns/HomeEquityLineOfCredit,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/ConsumerLoans/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "home equity line of credit"},
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fbc-dae-dbt/isCollateralizedBy,
                       :owl/someValuesFrom :fibo-fbc-dae-dbt/PhysicalCollateral,
                       :rdf/type           :owl/Restriction}
                      :fibo-loan-ln-ln/CollateralizedLoan
                      :fibo-loan-spc-cns/SecuredConsumerLoan
                      :fibo-fbc-dae-dbt/RevolvingLineOfCredit},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "line of credit granted to a homeowner secured by the equity value in a borrower's home or other property"}})

(def MotorVehicleLoan
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "12 CFR § 228.12, https://www.law.cornell.edu/cfr/text/12/228.12"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Many lenders will only approve auto loans for vehicles (i.e., cars, trucks) that are a certain age (typically 5 years or less) due to depreciation of the value of the vehicle. Because an auto loan is a 'secured' type of loan, the vehicle that is being financed is used as collateral (i.e. if the borrower fails to repay the loan, the vehicle may be seized by the lender)."},
   :cmns-av/synonym {:rdf/language "en",
                     :rdf/value    "auto loan"},
   :db/ident :fibo-loan-spc-cns/MotorVehicleLoan,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/ConsumerLoans/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "motor vehicle loan"},
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fbc-dae-dbt/isCollateralizedBy,
                       :owl/someValuesFrom :fibo-fbc-dae-dbt/PhysicalCollateral,
                       :rdf/type           :owl/Restriction}
                      :fibo-loan-ln-ln/CollateralizedLoan
                      :fibo-loan-spc-cns/SecuredConsumerLoan},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "collateralized, simple-interest loan that is repaid in monthly installments over a period of typically three to five years, for the purpose of purchasing a vehicle"}})

(def SecuredConsumerLoan
  {:db/ident :fibo-loan-spc-cns/SecuredConsumerLoan,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/ConsumerLoans/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "secured consumer loan"},
   :rdfs/subClassOf #{:fibo-loan-ln-ln/SecuredLoan
                      :fibo-loan-spc-cns/ConsumerLoan},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "loan to one or more individuals for household, family, or other personal expenditures in which the borrower pledges some asset via a security agreement as collateral for the loan, or that is secured via third-party guarantee"}})

(def UnsecuredConsumerLoan
  {:db/ident :fibo-loan-spc-cns/UnsecuredConsumerLoan,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/ConsumerLoans/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "unsecured consumer loan"},
   :rdfs/subClassOf #{:fibo-loan-ln-ln/UnsecuredLoan
                      :fibo-loan-spc-cns/ConsumerLoan},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "loan to one or more individuals for household, family, or other personal expenditures granted based on the strength of the borrower's credit history or reputation in the community"}})

(def urn:uuid:e2da2a06-5cc0-5e51-a69c-036bff66dd63
  {:cmns-av/copyright #{"Copyright (c) 2023-2024 Object Management Group, Inc."
                        "Copyright (c) 2015-2024 EDM Council, Inc."},
   :dcterms/abstract
   "The consumer loans ontology defines concepts specific to loans that are offered only to consumers rather than to organization, primarily for personal, family, or household purposes.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/ProductsAndServices/ProductsAndServices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/DebtAndEquities/Debt/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/LOAN/LoansGeneral/Loans/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/LOAN/LoansSpecific/ConsumerLoans/"},
   :rdf/type :owl/Ontology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Consumer Loans Ontology"},
   :skos/changeNote
   "The https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/ConsumerLoans.rdf version of the ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380).",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/ConsumerLoans/"})