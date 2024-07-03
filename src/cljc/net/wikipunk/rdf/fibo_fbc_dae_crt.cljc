(ns net.wikipunk.rdf.fibo-fbc-dae-crt
  {:cmns-av/copyright "Copyright (c) 2018-2024 EDM Council, Inc.",
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/DebtAndEquities/CreditRatings/",
   :dcterms/abstract
   "This ontology defines the concept of a credit rating, along with credit watch and outlook qualifying terms. There are credit ratings for individuals, for organizations and for instruments. \n\t\tThese are referenced extensively in the securities models but are also applicable to business entities generally and in the context of lending and account maintenance.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-doc" "https://www.omg.org/spec/Commons/Documents/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
    "cmns-pts" "https://www.omg.org/spec/Commons/PartiesAndSituations/",
    "cmns-qtu" "https://www.omg.org/spec/Commons/QuantitiesAndUnits/",
    "cmns-rlcmp" "https://www.omg.org/spec/Commons/RolesAndCompositions/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fbc-dae-crt"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/",
    "fibo-fbc-fi-fi"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
    "fibo-fbc-pas-caa"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
    "fibo-fbc-pas-fpas"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
    "fibo-fnd-arr-rep"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/",
    "fibo-fnd-arr-rt"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Ratings/",
    "fibo-fnd-dt-fd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
    "fibo-fnd-org-fm"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations/",
    "fibo-fnd-pas-pas"
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/DatesAndTimes/FinancialDates/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/ProductsAndServices/ClientsAndAccounts/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Documents/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/ProductsAndServices/ProductsAndServices/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/QuantitiesAndUnits/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Organizations/FormalOrganizations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Arrangements/Reporting/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Arrangements/Ratings/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/ProductsAndServices/FinancialProductsAndServices/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FinancialInstruments/FinancialInstruments/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/DebtAndEquities/CreditRatings/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fbc-dae-crt",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Credit Ratings Ontology"},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/"})

(def AlertCreditMessage
  {:db/ident :fibo-fbc-dae-crt/AlertCreditMessage,
   :rdf/type #{:fibo-fbc-dae-crt/CreditMessageType :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/"},
   :rdfs/label "alert credit message"})

(def AlternativeAQuality
  {:cmns-av/abbreviation "Alt-A",
   :cmns-av/explanatoryNote
   "Typically Alt-A mortgages are characterized by borrowers with less than full documentation, average credit scores, higher loan-to-values, and more investment properties and secondary homes.",
   :cmns-av/synonym "Alternative A-paper",
   :db/ident :fibo-fbc-dae-crt/AlternativeAQuality,
   :rdf/type #{:fibo-fbc-dae-crt/CreditQuality :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/"},
   :rdfs/label "alternative-A quality",
   :skos/definition
   "classifier for mortgages that are considered to be riskier than prime quality but less risky than subprime quality"})

(def CreditInquiry
  {:db/ident :fibo-fbc-dae-crt/CreditInquiry,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/"},
   :rdfs/label "credit inquiry",
   :rdfs/subClassOf #{:fibo-fnd-arr-rep/RequestActivity
                      {:owl/onProperty     :fibo-fnd-arr-rep/isRequestedOf,
                       :owl/someValuesFrom :fibo-fbc-dae-crt/CreditRatingAgency,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :fibo-fbc-dae-crt/concernsParty,
                       :owl/someValuesFrom :cmns-pts/Party,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :cmns-cls/isClassifiedBy,
                       :owl/someValuesFrom :fibo-fbc-dae-crt/CreditInquiryType,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "request from a lender to a credit repository to obtain information regarding a prospective borrower's creditworthiness"})

(def CreditInquiryType
  {:db/ident :fibo-fbc-dae-crt/CreditInquiryType,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/"},
   :rdfs/label "credit inquiry type",
   :rdfs/subClassOf :cmns-cls/Classifier,
   :skos/definition
   "classifier indicating whether a credit inquiry is a result of a borrower's direct authorization or by some indirect means"})

(def CreditMessage
  {:db/ident :fibo-fbc-dae-crt/CreditMessage,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/"},
   :rdfs/label "credit message",
   :rdfs/subClassOf #{:cmns-doc/Notice
                      {:owl/onProperty     :cmns-cls/isClassifiedBy,
                       :owl/someValuesFrom :fibo-fbc-dae-crt/CreditMessageType,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "notice on a credit report to alert a reviewer of special or exceptional information"})

(def CreditMessageType
  {:db/ident :fibo-fbc-dae-crt/CreditMessageType,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/"},
   :rdfs/label "credit message type",
   :rdfs/subClassOf :cmns-cls/Classifier,
   :skos/definition "classifier that categorizes credit messages"})

(def CreditQuality
  {:db/ident :fibo-fbc-dae-crt/CreditQuality,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/"},
   :rdfs/label "credit quality",
   :rdfs/subClassOf :fibo-fnd-arr-rt/RatingScore,
   :skos/definition
   "classifier for borrowers, rates, or holdings in the lending market with respect to the quality of the credit"})

(def CreditRating
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Typically, a credit rating is provided as a detailed report based on the financial history of borrowing or lending and creditworthiness of the entity or person derived from income statements, historical records related to borrowing, etc. with an aim to determine their ability to meet debt obligations."},
   :db/ident :fibo-fbc-dae-crt/CreditRating,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "credit rating"},
   :rdfs/subClassOf #{{:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-fbc-dae-crt/CreditRatingModel,
                       :owl/onProperty :cmns-qtu/isDerivedFrom,
                       :rdf/type       :owl/Restriction} :fibo-fnd-arr-rt/Rating
                      {:owl/onProperty     :fibo-fnd-rel-rel/isIssuedBy,
                       :owl/someValuesFrom :fibo-fbc-dae-crt/CreditRatingAgency,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "assessment of creditworthiness of a borrower generally or with respect to a particular debt or financial obligation"}})

(def CreditRatingAgency
  {:db/ident :fibo-fbc-dae-crt/CreditRatingAgency,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "credit rating agency"},
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fnd-rel-rel/manages,
                       :owl/someValuesFrom :fibo-fbc-dae-crt/CreditRatingScale,
                       :rdf/type           :owl/Restriction}
                      :fibo-fnd-arr-rt/RatingAgency
                      :fibo-fbc-pas-fpas/FinancialServiceProvider
                      {:owl/onProperty     :fibo-fnd-rel-rel/issues,
                       :owl/someValuesFrom :fibo-fbc-dae-crt/CreditRating,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "rating agency that publishes reports assessing the creditworthiness of a borrower or legal entity, either generally or with respect to a specific obligation"}})

(def CreditRatingModel
  {:cmns-av/usageNote
   "Use dct:hasVersion to specify a version for the credit score model.",
   :db/ident :fibo-fbc-dae-crt/CreditRatingModel,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/"},
   :rdfs/label "credit rating model",
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fnd-rel-rel/produces,
                       :owl/someValuesFrom :fibo-fnd-arr-rt/RatingScore,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :fibo-fnd-rel-rel/hasTextualName,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty :cmns-cls/isClassifiedBy,
                       :owl/someValuesFrom
                       :fibo-fbc-dae-crt/CreditRatingModelType,
                       :rdf/type :owl/Restriction} :cmns-qtu/Expression},
   :skos/definition "algorithm for computing a credit rating"})

(def CreditRatingModelType
  {:db/ident :fibo-fbc-dae-crt/CreditRatingModelType,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/"},
   :rdfs/label "credit score model type",
   :rdfs/subClassOf :cmns-cls/Classifier,
   :skos/definition
   "a type corresonding to a family of credit scoring algorithms sharing common characteristics"})

(def CreditRatingScale
  {:db/ident :fibo-fbc-dae-crt/CreditRatingScale,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "credit rating scale"},
   :rdfs/subClassOf #{:fibo-fnd-arr-rt/RatingScale
                      {:owl/onProperty     :fibo-fnd-rel-rel/isManagedBy,
                       :owl/someValuesFrom :fibo-fbc-dae-crt/CreditRatingAgency,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "rating scale for assigning a credit rating to individual, entity, or instrument, including defining a set of codes or numeric scores and indicating how an assessment that is assigned a score based on that scale means"}})

(def CreditReport
  {:cmns-av/explanatoryNote
   "This is typically provided by a credit rating agency but could be produced by an internal proprietary model as well.",
   :db/ident :fibo-fbc-dae-crt/CreditReport,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/"},
   :rdfs/label "credit report",
   :rdfs/subClassOf
   #{{:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-fbc-dae-crt/CreditReportCategory,
      :owl/onProperty :cmns-cls/isClassifiedBy,
      :rdf/type       :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :cmns-id/Identifier,
      :owl/onProperty :cmns-id/isIdentifiedBy,
      :rdf/type       :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-fbc-dae-crt/CreditInquiry,
      :owl/onProperty :cmns-col/comprises,
      :rdf/type       :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-fbc-dae-crt/CreditMessage,
      :owl/onProperty :cmns-col/comprises,
      :rdf/type       :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-fbc-dae-crt/CreditRatingAgency,
      :owl/onProperty :fibo-fnd-rel-rel/isProducedBy,
      :rdf/type       :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-fbc-dae-crt/CreditTradeline,
      :owl/onProperty :cmns-col/comprises,
      :rdf/type       :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-fbc-dae-crt/CreditRating,
      :owl/onProperty :cmns-col/comprises,
      :rdf/type       :owl/Restriction} :fibo-fnd-arr-rt/RatingReport
     {:owl/onProperty     :fibo-fnd-dt-fd/hasAsOfDate,
      :owl/someValuesFrom :cmns-dt/Date,
      :rdf/type           :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-fbc-dae-crt/CreditReportProduct,
      :owl/onProperty :fibo-fnd-rel-rel/exemplifies,
      :rdf/type       :owl/Restriction}
     {:owl/onProperty     :fibo-fbc-dae-crt/hasCoveragePeriod,
      :owl/someValuesFrom :cmns-dt/DatePeriod,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-fbc-dae-crt/concernsParty,
      :owl/someValuesFrom :cmns-pts/Party,
      :rdf/type           :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    {:owl/onProperty     :cmns-rlcmp/playsRole,
                       :owl/someValuesFrom :fibo-fbc-dae-crt/CreditRatingAgency,
                       :rdf/type           :owl/Restriction},
      :owl/onProperty :cmns-doc/hasDataSource,
      :rdf/type       :owl/Restriction}},
   :skos/definition
   "report describing the creditworthiness and related credit attributes of a borrower"})

(def CreditReportCategory
  {:db/ident :fibo-fbc-dae-crt/CreditReportCategory,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/"},
   :rdfs/label "credit report category",
   :rdfs/subClassOf :cmns-cls/Classifier,
   :skos/definition
   "classifier for credit reports, often available from multiple vendors"})

(def CreditReportProduct
  {:db/ident :fibo-fbc-dae-crt/CreditReportProduct,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/"},
   :rdfs/label "credit report product",
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fnd-rel-rel/isProducedBy,
                       :owl/someValuesFrom :fibo-fbc-dae-crt/CreditRatingAgency,
                       :rdf/type           :owl/Restriction}
                      :fibo-fbc-pas-fpas/FinancialProduct
                      :fibo-fnd-pas-pas/OffTheShelfProduct},
   :skos/definition "branded credit report offered in the marketplace"})

(def CreditTradeline
  {:cmns-av/explanatoryNote
   "A tradeline on a credit report refers to a specific credit account. Tradelines report snapshot details derived from a combination of account features and payment history, and are used by credit reporting agencies as inputs to the analysis process that determines a party's credit rating.",
   :db/ident :fibo-fbc-dae-crt/CreditTradeline,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/"},
   :rdfs/label "credit tradeline",
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-qtu/isDerivedFrom,
                       :owl/someValuesFrom :fibo-fbc-pas-caa/Account,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :cmns-col/isIncludedIn,
                       :owl/someValuesFrom :fibo-fbc-dae-crt/CreditReport,
                       :rdf/type           :owl/Restriction}
                      :fibo-fnd-arr-rep/Report},
   :skos/definition
   "report derived from the transaction history of a credit account"})

(def CreditWatchDirection
  {:db/ident :fibo-fbc-dae-crt/CreditWatchDirection,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "credit watch direction"},
   :rdfs/subClassOf :cmns-cls/Classifier})

(def CreditWatchDowngrade
  {:db/ident :fibo-fbc-dae-crt/CreditWatchDowngrade,
   :rdf/type #{:owl/NamedIndividual :fibo-fbc-dae-crt/CreditWatchDirection},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "credit watch downgrade"},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "On April 22, 2022, OppFi (NYSE:OPFI) was downgraded by Zacks Investment Research from a 'hold' rating to a 'sell' rating in a research report issued to clients and investors on Friday, Zacks.com reports."}})

(def CreditWatchOutlook
  {:db/ident :fibo-fbc-dae-crt/CreditWatchOutlook,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "credit watch outlook"},
   :rdfs/subClassOf :fibo-fnd-arr-rt/Rating})

(def CreditWatchUpgrade
  {:db/ident :fibo-fbc-dae-crt/CreditWatchUpgrade,
   :rdf/type #{:owl/NamedIndividual :fibo-fbc-dae-crt/CreditWatchDirection},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "credit watch upgrade"}})

(def FreezeCreditMessage
  {:db/ident :fibo-fbc-dae-crt/FreezeCreditMessage,
   :rdf/type #{:fibo-fbc-dae-crt/CreditMessageType :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/"},
   :rdfs/label "freeze credit message"})

(def HardCreditInquiry
  {:db/ident :fibo-fbc-dae-crt/HardCreditInquiry,
   :rdf/type #{:owl/NamedIndividual :fibo-fbc-dae-crt/CreditInquiryType},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/"},
   :rdfs/label "hard credit inquiry"})

(def InstrumentCreditRating
  {:db/ident :fibo-fbc-dae-crt/InstrumentCreditRating,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "instrument credit rating"},
   :rdfs/subClassOf #{:fibo-fbc-dae-crt/InvestmentCreditRating
                      {:owl/onProperty     :fibo-fnd-arr-rt/rates,
                       :owl/someValuesFrom :fibo-fbc-fi-fi/FinancialInstrument,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "investment credit rating that provides an opinion of creditworthiness of an instrument, typically with some relationship to the creditworthiness of the issuer(s)"}})

(def InvestmentCreditRating
  {:db/ident :fibo-fbc-dae-crt/InvestmentCreditRating,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "investment credit rating"},
   :rdfs/subClassOf :fibo-fbc-dae-crt/CreditRating,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "credit rating that provides an opinion of creditworthiness of an investment, including but not limited to an instrument or organization"}})

(def InvestmentGradeQuality
  {:cmns-av/explanatoryNote
   "Bond rating firms use different designations, often consisting of the upper- and lower-case letters to identify a bond's credit quality rating. 'AAA' and 'AA' (high credit quality) and 'A' and 'BBB' (medium credit quality) are considered investment grade. Credit ratings for bonds below these designations ('BB,' 'B,' 'CCC,' etc.) are considered low credit quality, and are commonly referred to as 'junk bonds.'",
   :db/ident :fibo-fbc-dae-crt/InvestmentGradeQuality,
   :rdf/type #{:fibo-fbc-dae-crt/CreditQuality :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/"},
   :rdfs/label "investment grade quality",
   :skos/definition
   "classifier for debt instruments that are considered to be of high quality and have a low risk of default"})

(def NonprimeQuality
  {:cmns-av/explanatoryNote
   "Nonprime loans may be offered to individuals who are unable to qualify for a conventional loan.",
   :db/ident :fibo-fbc-dae-crt/NonprimeQuality,
   :rdf/type #{:fibo-fbc-dae-crt/CreditQuality :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/"},
   :rdfs/label "nonprime quality",
   :skos/definition
   "classifier for borrowers, rates, or holdings that have poor quality, such as borrowers with poor credit history due to a short sale, bankruptcy, foreclosure and/or other negative credit events within the last several years"})

(def OnWatchOutlook
  {:db/ident :fibo-fbc-dae-crt/OnWatchOutlook,
   :rdf/type #{:fibo-fbc-dae-crt/CreditWatchOutlook :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "on watch outlook"}})

(def OrganizationCreditRating
  {:db/ident :fibo-fbc-dae-crt/OrganizationCreditRating,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "organization credit rating"},
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fnd-arr-rt/rates,
                       :owl/someValuesFrom :fibo-fnd-org-fm/FormalOrganization,
                       :rdf/type           :owl/Restriction}
                      :fibo-fbc-dae-crt/CreditRating},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "credit rating that provides an opinion of creditworthiness of an organization"}})

(def PrimeQuality
  {:cmns-av/explanatoryNote
   "This classification often refers to loans made to high-quality borrowers that are offered prime or relatively low interest rates. Prime loans have low default risk.",
   :cmns-av/synonym "A-paper",
   :db/ident :fibo-fbc-dae-crt/PrimeQuality,
   :rdf/type #{:fibo-fbc-dae-crt/CreditQuality :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/"},
   :rdfs/label "prime quality",
   :skos/definition
   "classifier for borrowers, rates, or holdings that are considered to be of high quality"})

(def ShortTermCreditRating
  {:db/ident :fibo-fbc-dae-crt/ShortTermCreditRating,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "short term credit rating"},
   :rdfs/subClassOf :fibo-fbc-dae-crt/InvestmentCreditRating,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "credit rating that provides an opinion of the probability of an individual or organization going into default within a year"}})

(def SoftCreditInquiry
  {:db/ident :fibo-fbc-dae-crt/SoftCreditInquiry,
   :rdf/type #{:owl/NamedIndividual :fibo-fbc-dae-crt/CreditInquiryType},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/"},
   :rdfs/label "soft credit inquiry"})

(def StableOutlook
  {:db/ident :fibo-fbc-dae-crt/StableOutlook,
   :rdf/type #{:fibo-fbc-dae-crt/CreditWatchOutlook :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "stable outlook"}})

(def SubprimeQuality
  {:cmns-av/explanatoryNote
   "Subprime refers to borrowers or loans, usually offered at rates well above the prime rate. Subprime lending is higher risk, given the lower credit rating of borrowers.",
   :db/ident :fibo-fbc-dae-crt/SubprimeQuality,
   :rdf/type #{:fibo-fbc-dae-crt/CreditQuality :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/"},
   :rdfs/label "subprime quality",
   :skos/definition
   "classifier for borrowers, rates, or holdings that are considered below-average quality, such as borrowers with a tarnished or limited credit history, and may be subject to higher than average interest rates"})

(def concernsParty
  {:db/ident :fibo-fbc-dae-crt/concernsParty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/"},
   :rdfs/label "concerns party",
   :rdfs/subPropertyOf :cmns-pts/hasParty,
   :skos/definition
   "indicates the party for which something is being or has been requested"})

(def hasCoveragePeriod
  {:db/ident :fibo-fbc-dae-crt/hasCoveragePeriod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/"},
   :rdfs/label "has coverage period",
   :rdfs/range :cmns-dt/DatePeriod,
   :rdfs/subPropertyOf :cmns-dt/hasDatePeriod,
   :skos/definition
   "relates something (e.g. a credit report or insurance policy) to the specific time period that it covers"})

(def hasWatchDirection
  {:db/ident :fibo-fbc-dae-crt/hasWatchDirection,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-dae-crt/InvestmentCreditRating,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "watch direction"},
   :rdfs/range :fibo-fbc-dae-crt/CreditWatchDirection,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates direction in which an investment credit rating is expected to move in cases where that rating is on watch"}})

(def hasWatchOutlook
  {:db/ident :fibo-fbc-dae-crt/hasWatchOutlook,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-dae-crt/InvestmentCreditRating,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "watch outlook"},
   :rdfs/range :fibo-fbc-dae-crt/CreditWatchOutlook,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "indicates the expected outlook for the rated entity"}})

(def urn:uuid:10042220-82ef-5c27-b85f-84f850ecdd87
  {:cmns-av/copyright "Copyright (c) 2018-2024 EDM Council, Inc.",
   :dcterms/abstract
   "This ontology defines the concept of a credit rating, along with credit watch and outlook qualifying terms. There are credit ratings for individuals, for organizations and for instruments. \n\t\tThese are referenced extensively in the securities models but are also applicable to business entities generally and in the context of lending and account maintenance.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/DatesAndTimes/FinancialDates/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/ProductsAndServices/ClientsAndAccounts/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Documents/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/ProductsAndServices/ProductsAndServices/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/QuantitiesAndUnits/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Organizations/FormalOrganizations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Arrangements/Reporting/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Arrangements/Ratings/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/ProductsAndServices/FinancialProductsAndServices/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FinancialInstruments/FinancialInstruments/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/DebtAndEquities/CreditRatings/"},
   :rdf/type :owl/Ontology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Credit Ratings Ontology"},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/"})