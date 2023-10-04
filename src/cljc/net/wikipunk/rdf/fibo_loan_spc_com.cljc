(ns net.wikipunk.rdf.fibo-loan-spc-com
  ^{:base
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CommercialLoans/",
    :namespaces
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
     "fibo-loan-spc-com"
     "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CommercialLoans/",
     "owl" "http://www.w3.org/2002/07/owl#",
     "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
     "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
     "skos" "http://www.w3.org/2004/02/skos/core#",
     "xsd" "http://www.w3.org/2001/XMLSchema#"},
    :prefix "fibo-loan-spc-com",
    :source
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/LOAN/LoansSpecific/CommercialLoans/"}
  {:cmns-av/copyright "Copyright (c) 2015-2023 EDM Council, Inc.",
   :dcterms/abstract
   "Commercial loans are loans where the loan purpose is some commercial purpose. Note that these are distinguished by the loan purpose not by the borrower type - borrowers may be corporate or personal, though in the majority of cases they would also be corporate loans that is loans with a corporate borrower.",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/LOAN/LoansGeneral/Loans/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/DebtAndEquities/Debt/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/LegalPersons/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/LOAN/LoansSpecific/CommercialLoans/"},
   :rdf/type :owl/Ontology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Commercial Loans Ontology"},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CommercialLoans/"})

(def CommercialLoan
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Such loans may include those that provide working capital, are used to finance the purchase of equipment and/or materials, for facilities and/or improvement of facilities, and so forth, and are typically secured."},
   :cmns-av/synonym {:rdf/language "en",
                     :rdf/value    "commercial and industrial loan"},
   :db/ident :fibo-loan-spc-com/CommercialLoan,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CommercialLoans/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "commercial loan"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-fbc-dae-dbt/hasBorrower,
      :owl/someValuesFrom {:owl/onProperty     :fibo-fnd-rel-rel/hasIdentity,
                           :owl/someValuesFrom :fibo-be-le-lp/LegalEntity,
                           :rdf/type           :owl/Restriction},
      :rdf/type           :owl/Restriction} :fibo-loan-ln-ln/Loan},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "loan extended to a corporation, commercial enterprise, joint venture, or other organization as opposed to a consumer"}})

(def urn:uuid:4dd206bb-5c53-54e5-992a-56e88b3a0ba0
  {:cmns-av/copyright "Copyright (c) 2015-2023 EDM Council, Inc.",
   :dcterms/abstract
   "Commercial loans are loans where the loan purpose is some commercial purpose. Note that these are distinguished by the loan purpose not by the borrower type - borrowers may be corporate or personal, though in the majority of cases they would also be corporate loans that is loans with a corporate borrower.",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/LOAN/LoansGeneral/Loans/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/DebtAndEquities/Debt/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/LegalEntities/LegalPersons/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/LOAN/LoansSpecific/CommercialLoans/"},
   :rdf/type :owl/Ontology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Commercial Loans Ontology"},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CommercialLoans/"})