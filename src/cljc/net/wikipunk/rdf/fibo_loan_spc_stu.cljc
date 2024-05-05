(ns net.wikipunk.rdf.fibo-loan-spc-stu
  {:cmns-av/copyright #{"Copyright (c) 2023-2024 Object Management Group, Inc."
                        "Copyright (c) 2015-2024 EDM Council, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/LOAN/LoansSpecific/StudentLoans/",
   :dcterms/abstract
   "A loan or series of loans made for the purposes of study at some institution of learning.\n\t\tThis ontology and much of the common supporting information on loan applications are based on extensive review and input from Sallie Mae in the US and there may be other variants of student loans that are not covered here. For example in principle a student loan may be framed as a credit facility in some arrangements and as a single loan with separate payment phases in others.",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-rlcmp" "https://www.omg.org/spec/Commons/RolesAndCompositions/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-le-lp"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/",
    "fibo-fbc-dae-dbt"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-loan-ln-ln"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/",
    "fibo-loan-spc-stu"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/StudentLoans/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/LOAN/LoansGeneral/Loans/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/DebtAndEquities/Debt/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/LOAN/LoansSpecific/StudentLoans/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-loan-spc-stu",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/StudentLoans/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Student Loans Ontology"},
   :skos/changeNote
   "The https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/StudentLoans.rdf version of the ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380).",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/StudentLoans/"})

(def PrivateStudentLoan
  {:db/ident :fibo-loan-spc-stu/PrivateStudentLoan,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/StudentLoans/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "private student loan"},
   :rdfs/subClassOf #{:fibo-loan-spc-stu/RegulatedStudentLoan
                      :fibo-loan-spc-stu/StudentLoan},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "student loan that is not considered a government-backed / regulated loan"}})

(def RegulatedStudentLoan
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "In the United States, certain student loans survive bankruptcy and are subject to additional tax regulations that do not apply to other kinds of loans."},
   :db/ident :fibo-loan-spc-stu/RegulatedStudentLoan,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/StudentLoans/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "regulated student loan"},
   :rdfs/subClassOf :fibo-loan-spc-stu/StudentLoan,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "student loan (1) whose lender is a government agency or instrumentality, and/or (2) that is treated uniquely due to tax regulations"}})

(def StudentLoan
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Student loans may include loans for graduate and professional education. Student loans may be obtained from government institutions, from private sources such as a bank or financial institution, or from other organizations."},
   :db/ident :fibo-loan-spc-stu/StudentLoan,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/StudentLoans/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "student loan"},
   :rdfs/subClassOf #{:fibo-loan-ln-ln/Loan
                      {:owl/onProperty :fibo-fbc-dae-dbt/hasBorrower,
                       :owl/someValuesFrom
                       {:owl/onProperty :cmns-rlcmp/isPlayedBy,
                        :owl/someValuesFrom
                        :fibo-be-le-lp/LegallyCompetentNaturalPerson,
                        :rdf/type :owl/Restriction},
                       :rdf/type :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "loan provided for the purposes of education, allowing students and parents/guardians to borrow money for college"}})

(def urn:uuid:b0780b98-353b-5d92-af4a-54c44567f403
  {:cmns-av/copyright #{"Copyright (c) 2023-2024 Object Management Group, Inc."
                        "Copyright (c) 2015-2024 EDM Council, Inc."},
   :dcterms/abstract
   "A loan or series of loans made for the purposes of study at some institution of learning.\n\t\tThis ontology and much of the common supporting information on loan applications are based on extensive review and input from Sallie Mae in the US and there may be other variants of student loans that are not covered here. For example in principle a student loan may be framed as a credit facility in some arrangements and as a single loan with separate payment phases in others.",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/LOAN/LoansGeneral/Loans/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/DebtAndEquities/Debt/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/LOAN/LoansSpecific/StudentLoans/"},
   :rdf/type :owl/Ontology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Student Loans Ontology"},
   :skos/changeNote
   "The https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/StudentLoans.rdf version of the ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380).",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/StudentLoans/"})