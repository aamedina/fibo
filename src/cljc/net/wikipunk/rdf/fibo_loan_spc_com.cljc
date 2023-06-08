(ns net.wikipunk.rdf.fibo-loan-spc-com
  "Commercial loans are loans where the loan purpose is some commercial purpose. Note that these are distinguished by the loan purpose not by the borrower type - borrowers may be corporate or personal, though in the majority of cases they would also be corporate loans that is loans with a corporate borrower."
  {:cmns-av/copyright "Copyright (c) 2015-2023 EDM Council, Inc.",
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CommercialLoans/",
   :dcterms/abstract
   "Commercial loans are loans where the loan purpose is some commercial purpose. Note that these are distinguished by the loan purpose not by the borrower type - borrowers may be corporate or personal, though in the majority of cases they would also be corporate loans that is loans with a corporate borrower.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/DebtAndEquities/Debt/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LegalPersons/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/LOAN/LoansGeneral/Loans/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/LOAN/LoansSpecific/CommercialLoans/",
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
    "fibo-loan-spc-com"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CommercialLoans/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-loan-spc-com",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CommercialLoans/",
   :rdfs/label #voc/lstr "Commercial Loans Ontology@en"})

(def CommercialLoan
  "loan extended to a corporation, commercial enterprise, joint venture, or other organization as opposed to a consumer"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "Such loans may include those that provide working capital, are used to finance the purchase of equipment and/or materials, for facilities and/or improvement of facilities, and so forth, and are typically secured.@en",
   :cmns-av/synonym #voc/lstr "commercial and industrial loan@en",
   :db/ident :fibo-loan-spc-com/CommercialLoan,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CommercialLoans/",
   :rdfs/label #voc/lstr "commercial loan@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fbc-dae-dbt/hasBorrower,
     :owl/someValuesFrom {:owl/onProperty     :fibo-fnd-rel-rel/hasIdentity,
                          :owl/someValuesFrom :fibo-be-le-lp/LegalEntity,
                          :rdf/type           :owl/Restriction},
     :rdf/type           :owl/Restriction}
    :fibo-loan-ln-ln/Loan],
   :skos/definition
   #voc/lstr
    "loan extended to a corporation, commercial enterprise, joint venture, or other organization as opposed to a consumer@en"})