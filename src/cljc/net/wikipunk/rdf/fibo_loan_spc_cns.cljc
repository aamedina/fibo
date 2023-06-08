(ns net.wikipunk.rdf.fibo-loan-spc-cns
  "The consumer loans ontology defines concepts specific to loans that are offered only to consumers rather than to organization, primarily for personal, family, or household purposes."
  {:cmns-av/copyright "Copyright (c) 2015-2023 EDM Council, Inc.",
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/ConsumerLoans/",
   :dcterms/abstract
   "The consumer loans ontology defines concepts specific to loans that are offered only to consumers rather than to organization, primarily for personal, family, or household purposes.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LegalPersons/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/LOAN/LoansGeneral/Loans/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/DebtAndEquities/Debt/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/LOAN/LoansSpecific/ConsumerLoans/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-le-lp"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/",
    "fibo-fbc-dae-dbt"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
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
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-loan-spc-cns",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/ConsumerLoans/",
   :rdfs/label #voc/lstr "Consumer Loans Ontology@en"})

(def AutoLoan
  "collateralized, simple-interest loan that is repaid in monthly installments over a period of typically three to five years, for the purpose of purchasing a vehicle"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "Many lenders will only approve auto loans for vehicles (i.e., cars, trucks) that are a certain age (typically 5 years or less) due to depreciation of the value of the vehicle. Because an auto loan is a 'secured' type of loan, the vehicle that is being financed is used as collateral (i.e. if the borrower fails to repay the loan, the vehicle may be seized by the lender).@en",
   :db/ident :fibo-loan-spc-cns/AutoLoan,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/ConsumerLoans/",
   :rdfs/label #voc/lstr "auto loan@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fbc-dae-dbt/isCollateralizedBy,
                      :owl/someValuesFrom :fibo-fbc-dae-dbt/PhysicalCollateral,
                      :rdf/type           :owl/Restriction}
                     :fibo-loan-spc-cns/ConsumerLoan
                     :fibo-loan-ln-ln/CollateralizedLoan
                     {:owl/onProperty :fibo-fbc-dae-dbt/hasBorrower,
                      :owl/someValuesFrom
                      {:owl/onProperty :fibo-fnd-rel-rel/hasIdentity,
                       :owl/someValuesFrom
                       :fibo-be-le-lp/LegallyCompetentNaturalPerson,
                       :rdf/type :owl/Restriction},
                      :rdf/type :owl/Restriction}
                     :fibo-loan-ln-ln/Loan],
   :skos/definition
   #voc/lstr
    "collateralized, simple-interest loan that is repaid in monthly installments over a period of typically three to five years, for the purpose of purchasing a vehicle@en"})

(def ConsumerLoan
  "loan whose borrower is person as opposed to an organization, i.e., a consumer"
  {:db/ident :fibo-loan-spc-cns/ConsumerLoan,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/ConsumerLoans/",
   :rdfs/label #voc/lstr "consumer loan@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fbc-dae-dbt/hasBorrower,
                      :owl/someValuesFrom
                      {:owl/onProperty :fibo-fnd-rel-rel/hasIdentity,
                       :owl/someValuesFrom
                       :fibo-be-le-lp/LegallyCompetentNaturalPerson,
                       :rdf/type :owl/Restriction},
                      :rdf/type :owl/Restriction}
                     :fibo-loan-ln-ln/Loan],
   :skos/definition
   #voc/lstr
    "loan whose borrower is person as opposed to an organization, i.e., a consumer@en"})

(def HomeEquityLineOfCredit
  "line of credit secured by equity value in a borrower's home or other property"
  {:cmns-av/abbreviation #voc/lstr "HELOC@en",
   :cmns-av/explanatoryNote
   [#voc/lstr
     "Home equity loans allow the borrower to borrow against the difference between the fair market value of the property, as determined by an appraisal, and the amount of any outstanding debt on that property, which is typically a first mortgage. Common practice is to set the maximum amount that can be borrowed of up to 80 percent of the fair market value less any outstanding debt.@en"
    #voc/lstr
     "This is both a revolving line of credit and a mortgage, in that the collateral for the revolving line of credit in this case is some real estate, which is a defining fact for a mortgage. This form of product can either have an increase or decrease in principal, according to the actions of the borrower. These may also be used in the formation of asset pools for asset backed securities.@en"],
   :db/ident :fibo-loan-spc-cns/HomeEquityLineOfCredit,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/ConsumerLoans/",
   :rdfs/label #voc/lstr "home equity line of credit@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fbc-dae-dbt/isCollateralizedBy,
                      :owl/someValuesFrom :fibo-fbc-dae-dbt/PhysicalCollateral,
                      :rdf/type           :owl/Restriction}
                     :fibo-loan-ln-ln/CollateralizedLoan
                     :fibo-loan-spc-cns/ConsumerLoan
                     :fibo-fbc-dae-dbt/RevolvingLineOfCredit
                     {:owl/onProperty :fibo-fbc-dae-dbt/hasBorrower,
                      :owl/someValuesFrom
                      {:owl/onProperty :fibo-fnd-rel-rel/hasIdentity,
                       :owl/someValuesFrom
                       :fibo-be-le-lp/LegallyCompetentNaturalPerson,
                       :rdf/type :owl/Restriction},
                      :rdf/type :owl/Restriction}
                     :fibo-loan-ln-ln/Loan],
   :skos/definition
   #voc/lstr
    "line of credit secured by equity value in a borrower's home or other property@en"})