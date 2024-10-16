(ns net.wikipunk.rdf.fibo-loan-spc-com
  {:cmns-av/copyright
   #{"Copyright (c) 2015-2024 EDM Council, Inc."
     "Copyright (c) 2013-2024 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/LOAN/LoansSpecific/CommercialLoans/",
   :dcterms/abstract
   "Commercial loans are loans where the loan purpose is some commercial purpose. Note that these are distinguished by the loan purpose not by the borrower type - borrowers may be corporate or personal, though in the majority of cases they would also be corporate loans that is loans with a corporate borrower.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-dsg" "https://www.omg.org/spec/Commons/Designators/",
    "cmns-rlcmp" "https://www.omg.org/spec/Commons/RolesAndCompositions/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-le-lp"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/",
    "fibo-fbc-dae-dbt"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
    "fibo-fnd-gao-obj"
    "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/Objectives/",
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
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/GoalsAndObjectives/Objectives/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/LOAN/LoansGeneral/Loans/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/DebtAndEquities/Debt/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/LOAN/LoansSpecific/CommercialLoans/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-loan-spc-com",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CommercialLoans/",
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
   #{{:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-fnd-gao-obj/BusinessObjective,
      :owl/onProperty :fibo-fnd-gao-obj/hasObjective,
      :rdf/type       :owl/Restriction} :fibo-loan-ln-ln/Loan
     {:owl/onProperty     :fibo-fbc-dae-dbt/hasBorrower,
      :owl/someValuesFrom {:owl/onProperty     :cmns-rlcmp/isPlayedBy,
                           :owl/someValuesFrom :fibo-be-le-lp/LegalEntity,
                           :rdf/type           :owl/Restriction},
      :rdf/type           :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onDataRange :xsd/string,
      :owl/onProperty  :fibo-loan-spc-com/hasBusinessPurposeDescription,
      :rdf/type        :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "loan extended to a corporation, commercial enterprise, joint venture, or other organization as opposed to a consumer"}})

(def hasBusinessPurposeDescription
  {:db/ident :fibo-loan-spc-com/hasBusinessPurposeDescription,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-loan-spc-com/CommercialLoan,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CommercialLoans/"},
   :rdfs/label "has business purpose description",
   :rdfs/subPropertyOf :cmns-dsg/hasDescription,
   :skos/definition
   "provides a description of the purpose of the loan from the perspective of the borrower"})

(def urn:uuid:4dd206bb-5c53-54e5-992a-56e88b3a0ba0
  {:cmns-av/copyright
   #{"Copyright (c) 2015-2024 EDM Council, Inc."
     "Copyright (c) 2013-2024 Object Management Group, Inc."},
   :dcterms/abstract
   "Commercial loans are loans where the loan purpose is some commercial purpose. Note that these are distinguished by the loan purpose not by the borrower type - borrowers may be corporate or personal, though in the majority of cases they would also be corporate loans that is loans with a corporate borrower.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/GoalsAndObjectives/Objectives/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/LOAN/LoansGeneral/Loans/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/DebtAndEquities/Debt/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/LOAN/LoansSpecific/CommercialLoans/"},
   :rdf/type :owl/Ontology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Commercial Loans Ontology"},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CommercialLoans/"})