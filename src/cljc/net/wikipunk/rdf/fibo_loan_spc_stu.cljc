(ns net.wikipunk.rdf.fibo-loan-spc-stu
  "A loan or series of loans made for the purposes of study at some institution of learning. This ontology and much of the common supporting information on loan applications are based on extensive review and input from Sallie Mae in the US and there may be other variants of student loans that are not covered here. For example in principle a student loan may be framed as a credit facility in some arrangements and as a single loan with separate payment phases in others."
  {:cmns-av/copyright "Copyright (c) 2015-2023 EDM Council, Inc.",
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/StudentLoans/",
   :dcterms/abstract
   "A loan or series of loans made for the purposes of study at some institution of learning.\n\t\tThis ontology and much of the common supporting information on loan applications are based on extensive review and input from Sallie Mae in the US and there may be other variants of student loans that are not covered here. For example in principle a student loan may be framed as a credit facility in some arrangements and as a single loan with separate payment phases in others.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/DebtAndEquities/Debt/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LegalPersons/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/LOAN/LoansGeneral/Loans/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/LOAN/LoansSpecific/StudentLoans/",
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
    "fibo-loan-spc-stu"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/StudentLoans/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-loan-spc-stu",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/StudentLoans/",
   :rdfs/label #voc/lstr "Student Loans Ontology@en"})

(def StudentLoan
  "A loan provided for the purposes of education."
  {:cmns-av/explanatoryNote
   #voc/lstr
    "Also loans which are Bridge Loan between education and professional certification, e.g. between Law School and Bar Exam. These are considered Student Loans also. So this adds to the list of types of Student Loan and the facts thereof. Also Resident and Relocation e.g. Med students, e..g when doing internship. Provide money for that purpose. Also considered a student loan. Implications: There are different crieteria in making the loan, for each of these, e.g. whether you have graduated. If residentcy and relocation aplication: would have to be completing Med raining and getting ready to go into internship. So there are liufecycle (phase) terms about the Borrower (student). In these the borrower is alwways the student.@en",
   :db/ident :fibo-loan-spc-stu/StudentLoan,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/StudentLoans/",
   :rdfs/label #voc/lstr "student loan@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fbc-dae-dbt/hasBorrower,
                      :owl/someValuesFrom
                      {:owl/onProperty :fibo-fnd-rel-rel/hasIdentity,
                       :owl/someValuesFrom
                       :fibo-be-le-lp/LegallyCompetentNaturalPerson,
                       :rdf/type :owl/Restriction},
                      :rdf/type :owl/Restriction}
                     :fibo-loan-ln-ln/Loan
                     :fibo-loan-spc-stu/StudentLoan],
   :skos/definition #voc/lstr
                     "A loan provided for the purposes of education.@en"})