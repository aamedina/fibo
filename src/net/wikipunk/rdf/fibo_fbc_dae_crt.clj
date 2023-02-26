(ns net.wikipunk.rdf.fibo-fbc-dae-crt
  "This ontology defines the concept of a credit rating, along with credit watch and outlook qualifying terms. There are credit ratings for individuals, for organizations and for instruments. These are referenced extensively in the securities models but are also applicable to business entities generally and in the context of lending and account maintenance."
  {:cmns-av/copyright "Copyright (c) 2018-2023 EDM Council, Inc.",
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/",
   :dcterms/abstract
   "This ontology defines the concept of a credit rating, along with credit watch and outlook qualifying terms. There are credit ratings for individuals, for organizations and for instruments. \n\t\tThese are referenced extensively in the securities models but are also applicable to business entities generally and in the context of lending and account maintenance.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Quantities/QuantitiesAndUnits/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Reporting/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/FinancialProductsAndServices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/Occurrences/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Organizations/FormalOrganizations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Documents/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/ClientsAndAccounts/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Roles/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/ClassificationSchemes/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Parties/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/Analytics/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/ProductsAndServices/ProductsAndServices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/IdentifiersAndIndices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/AgentsAndPeople/Agents/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Ratings/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/DebtAndEquities/CreditRatings/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fbc-dae-crt"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/",
    "fibo-fbc-fi-fi"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
    "fibo-fbc-pas-caa"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
    "fibo-fbc-pas-fpas"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
    "fibo-fnd-arr-cls"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/ClassificationSchemes/",
    "fibo-fnd-arr-doc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/",
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
    "fibo-fnd-pty-pty"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
    "fibo-fnd-pty-rl"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles/",
    "fibo-fnd-qt-qtu"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-alx"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "lcc-lr" "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fbc-dae-crt",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Credit Ratings Ontology"}})

(def AlertCreditMessage
  "alert credit message"
  {:db/ident :fibo-fbc-dae-crt/AlertCreditMessage,
   :rdf/type [:fibo-fbc-dae-crt/CreditMessageType :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/",
   :rdfs/label "alert credit message"})

(def AlternativeAQuality
  "classifier for mortgages that are considered to be riskier than prime quality but less risky than subprime quality"
  {:cmns-av/abbreviation "Alt-A",
   :cmns-av/explanatoryNote
   "Typically Alt-A mortgages are characterized by borrowers with less than full documentation, average credit scores, higher loan-to-values, and more investment properties and secondary homes.",
   :cmns-av/synonym "Alternative A-paper",
   :db/ident :fibo-fbc-dae-crt/AlternativeAQuality,
   :rdf/type [:fibo-fbc-dae-crt/CreditQuality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/",
   :rdfs/label "alternative-A quality",
   :skos/definition
   "classifier for mortgages that are considered to be riskier than prime quality but less risky than subprime quality"})

(def CreditInquiry
  "request from a lender to a credit repository to obtain information regarding a prospective borrower's creditworthiness"
  {:db/ident :fibo-fbc-dae-crt/CreditInquiry,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/",
   :rdfs/label "credit inquiry",
   :rdfs/subClassOf [{:owl/onProperty     :lcc-cr/isClassifiedBy,
                      :owl/someValuesFrom :fibo-fbc-dae-crt/CreditInquiryType,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-arr-rep/isRequestedOf,
                      :owl/someValuesFrom :fibo-fbc-dae-crt/CreditRatingAgency,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fbc-dae-crt/concernsParty,
                      :owl/someValuesFrom :fibo-fnd-pty-pty/IndependentParty,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-arr-rep/RequestActivity],
   :skos/definition
   "request from a lender to a credit repository to obtain information regarding a prospective borrower's creditworthiness"})

(def CreditInquiryType
  "classifier indicating whether a credit inquiry is a result of a borrower's direct authorization or by some indirect means"
  {:db/ident :fibo-fbc-dae-crt/CreditInquiryType,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/",
   :rdfs/label "credit inquiry type",
   :rdfs/subClassOf :fibo-fnd-arr-cls/Classifier,
   :skos/definition
   "classifier indicating whether a credit inquiry is a result of a borrower's direct authorization or by some indirect means"})

(def CreditMessage
  "notice on a credit report to alert a reviewer of special or exceptional information"
  {:db/ident :fibo-fbc-dae-crt/CreditMessage,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/",
   :rdfs/label "credit message",
   :rdfs/subClassOf [{:owl/onProperty     :lcc-cr/isClassifiedBy,
                      :owl/someValuesFrom :fibo-fbc-dae-crt/CreditMessageType,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-arr-doc/Notice],
   :skos/definition
   "notice on a credit report to alert a reviewer of special or exceptional information"})

(def CreditMessageType
  "classifier that categorizes credit messages"
  {:db/ident :fibo-fbc-dae-crt/CreditMessageType,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/",
   :rdfs/label "credit message type",
   :rdfs/subClassOf :fibo-fnd-arr-cls/Classifier,
   :skos/definition "classifier that categorizes credit messages"})

(def CreditQuality
  "classifier for borrowers, rates, or holdings in the lending market with respect to the quality of the credit"
  {:db/ident :fibo-fbc-dae-crt/CreditQuality,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/",
   :rdfs/label "credit quality",
   :rdfs/subClassOf :fibo-fnd-arr-rt/RatingScore,
   :skos/definition
   "classifier for borrowers, rates, or holdings in the lending market with respect to the quality of the credit"})

(def CreditRating
  "assessment of creditworthiness of a borrower generally or with respect to a particular debt or financial obligation"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Typically, a credit rating is provided as a detailed report based on the financial history of borrowing or lending and creditworthiness of the entity or person derived from income statements, historical records related to borrowing, etc. with an aim to determine their ability to meet debt obligations."},
   :db/ident :fibo-fbc-dae-crt/CreditRating,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "credit rating"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/isIssuedBy,
                      :owl/someValuesFrom :fibo-fbc-dae-crt/CreditRatingAgency,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fbc-dae-crt/CreditRatingModel,
                      :owl/onProperty :fibo-fnd-qt-qtu/isDerivedFrom,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-arr-rt/Rating],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "assessment of creditworthiness of a borrower generally or with respect to a particular debt or financial obligation"}})

(def CreditRatingAgency
  "rating agency that publishes reports assessing the creditworthiness of a borrower or legal entity, either generally or with respect to a specific obligation"
  {:db/ident :fibo-fbc-dae-crt/CreditRatingAgency,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "credit rating agency"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/manages,
                      :owl/someValuesFrom :fibo-fbc-dae-crt/CreditRatingScale,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-rel-rel/issues,
                      :owl/someValuesFrom :fibo-fbc-dae-crt/CreditRating,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-arr-rt/RatingAgency
                     :fibo-fbc-pas-fpas/FinancialServiceProvider],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "rating agency that publishes reports assessing the creditworthiness of a borrower or legal entity, either generally or with respect to a specific obligation"}})

(def CreditRatingModel
  "algorithm for computing a credit rating"
  {:cmns-av/usageNote
   "Use dct:hasVersion to specify a version for the credit score model.",
   :db/ident :fibo-fbc-dae-crt/CreditRatingModel,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/",
   :rdfs/label "credit rating model",
   :rdfs/subClassOf [{:owl/onProperty     :lcc-lr/hasName,
                      :owl/someValuesFrom :xsd/string,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :lcc-cr/isClassifiedBy,
                      :owl/someValuesFrom
                      :fibo-fbc-dae-crt/CreditRatingModelType,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-rel-rel/produces,
                      :owl/someValuesFrom :fibo-fnd-arr-rt/RatingScore,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-utl-alx/Formula],
   :skos/definition "algorithm for computing a credit rating"})

(def CreditRatingModelType
  "a type corresonding to a family of credit scoring algorithms sharing common characteristics"
  {:db/ident :fibo-fbc-dae-crt/CreditRatingModelType,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/",
   :rdfs/label "credit score model type",
   :rdfs/subClassOf :fibo-fnd-arr-cls/Classifier,
   :skos/definition
   "a type corresonding to a family of credit scoring algorithms sharing common characteristics"})

(def CreditRatingScale
  "rating scale for assigning a credit rating to individual, entity, or instrument, including defining a set of codes or numeric scores and indicating how an assessment that is assigned a score based on that scale means"
  {:db/ident :fibo-fbc-dae-crt/CreditRatingScale,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "credit rating scale"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/isManagedBy,
                      :owl/someValuesFrom :fibo-fbc-dae-crt/CreditRatingAgency,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-arr-rt/RatingScale],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "rating scale for assigning a credit rating to individual, entity, or instrument, including defining a set of codes or numeric scores and indicating how an assessment that is assigned a score based on that scale means"}})

(def CreditReport
  "report describing the creditworthiness and related credit attributes of a borrower"
  {:cmns-av/explanatoryNote
   "This is typically provided by a credit rating agency but could be produced by an internal proprietary model as well.",
   :db/ident :fibo-fbc-dae-crt/CreditReport,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/",
   :rdfs/label "credit report",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fbc-dae-crt/hasCoveragePeriod,
     :owl/someValuesFrom :fibo-fnd-dt-fd/DatePeriod,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-rel-rel/comprises,
     :owl/someValuesFrom :fibo-fbc-dae-crt/CreditMessage,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-dt-fd/hasAsOfDate,
     :owl/someValuesFrom :fibo-fnd-dt-fd/Date,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-arr-doc/hasDataSource,
     :owl/someValuesFrom {:owl/onProperty :fibo-fnd-pty-rl/playsRole,
                          :owl/someValuesFrom
                          :fibo-fbc-dae-crt/CreditRatingAgency,
                          :rdf/type :owl/Restriction},
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-dae-crt/CreditTradeline,
     :owl/onProperty :fibo-fnd-rel-rel/comprises,
     :rdf/type       :owl/Restriction}
    {:owl/onProperty     :fibo-fbc-pas-caa/realizes,
     :owl/someValuesFrom :fibo-fbc-dae-crt/CreditReportProduct,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :lcc-cr/isClassifiedBy,
     :owl/someValuesFrom :fibo-fbc-dae-crt/CreditReportCategory,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-rel-rel/isProducedBy,
     :owl/someValuesFrom :fibo-fbc-dae-crt/CreditRatingAgency,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :lcc-lr/isIdentifiedBy,
     :owl/someValuesFrom :lcc-lr/Identifier,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-dae-crt/CreditRating,
     :owl/onProperty :fibo-fnd-rel-rel/comprises,
     :rdf/type       :owl/Restriction}
    :fibo-fnd-arr-rt/RatingReport
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-dae-crt/CreditInquiry,
     :owl/onProperty :fibo-fnd-rel-rel/comprises,
     :rdf/type       :owl/Restriction}
    {:owl/onProperty     :fibo-fbc-dae-crt/concernsParty,
     :owl/someValuesFrom :fibo-fnd-pty-pty/IndependentParty,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   "report describing the creditworthiness and related credit attributes of a borrower"})

(def CreditReportCategory
  "classifier for credit reports, often available from multiple vendors"
  {:db/ident :fibo-fbc-dae-crt/CreditReportCategory,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/",
   :rdfs/label "credit report category",
   :rdfs/subClassOf :fibo-fnd-arr-cls/Classifier,
   :skos/definition
   "classifier for credit reports, often available from multiple vendors"})

(def CreditReportProduct
  "branded credit report offered in the marketplace"
  {:db/ident :fibo-fbc-dae-crt/CreditReportProduct,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/",
   :rdfs/label "credit report product",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/isProducedBy,
                      :owl/someValuesFrom :fibo-fbc-dae-crt/CreditRatingAgency,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-pas-pas/OffTheShelfProduct
                     :fibo-fbc-pas-fpas/FinancialProduct],
   :skos/definition "branded credit report offered in the marketplace"})

(def CreditTradeline
  "report derived from the transaction history of a credit account"
  {:cmns-av/explanatoryNote
   "A tradeline on a credit report refers to a specific credit account. Tradelines report snapshot details derived from a combination of account features and payment history, and are used by credit reporting agencies as inputs to the analysis process that determines a party's credit rating.",
   :db/ident :fibo-fbc-dae-crt/CreditTradeline,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/",
   :rdfs/label "credit tradeline",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/isIncludedIn,
                      :owl/someValuesFrom :fibo-fbc-dae-crt/CreditReport,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-qt-qtu/isDerivedFrom,
                      :owl/someValuesFrom :fibo-fbc-pas-caa/Account,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-arr-rep/Report],
   :skos/definition
   "report derived from the transaction history of a credit account"})

(def CreditWatchDirection
  "credit watch direction"
  {:db/ident :fibo-fbc-dae-crt/CreditWatchDirection,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "credit watch direction"},
   :rdfs/subClassOf :fibo-fnd-arr-cls/Classifier})

(def CreditWatchDowngrade
  "credit watch downgrade"
  {:db/ident :fibo-fbc-dae-crt/CreditWatchDowngrade,
   :rdf/type [:fibo-fbc-dae-crt/CreditWatchDirection :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "credit watch downgrade"},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "On April 22, 2022, OppFi (NYSE:OPFI) was downgraded by Zacks Investment Research from a 'hold' rating to a 'sell' rating in a research report issued to clients and investors on Friday, Zacks.com reports."}})

(def CreditWatchOutlook
  "credit watch outlook"
  {:db/ident :fibo-fbc-dae-crt/CreditWatchOutlook,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "credit watch outlook"},
   :rdfs/subClassOf :fibo-fnd-arr-rt/Rating})

(def CreditWatchUpgrade
  "credit watch upgrade"
  {:db/ident :fibo-fbc-dae-crt/CreditWatchUpgrade,
   :rdf/type [:fibo-fbc-dae-crt/CreditWatchDirection :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "credit watch upgrade"}})

(def FreezeCreditMessage
  "freeze credit message"
  {:db/ident :fibo-fbc-dae-crt/FreezeCreditMessage,
   :rdf/type [:fibo-fbc-dae-crt/CreditMessageType :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/",
   :rdfs/label "freeze credit message"})

(def HardCreditInquiry
  "hard credit inquiry"
  {:db/ident :fibo-fbc-dae-crt/HardCreditInquiry,
   :rdf/type [:fibo-fbc-dae-crt/CreditInquiryType :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/",
   :rdfs/label "hard credit inquiry"})

(def InstrumentCreditRating
  "investment credit rating that provides an opinion of creditworthiness of an instrument, typically with some relationship to the creditworthiness of the issuer(s)"
  {:db/ident :fibo-fbc-dae-crt/InstrumentCreditRating,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "instrument credit rating"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-arr-rt/rates,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/FinancialInstrument,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-dae-crt/InvestmentCreditRating],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "investment credit rating that provides an opinion of creditworthiness of an instrument, typically with some relationship to the creditworthiness of the issuer(s)"}})

(def InvestmentCreditRating
  "credit rating that provides an opinion of creditworthiness of an investment, including but not limited to an instrument or organization"
  {:db/ident :fibo-fbc-dae-crt/InvestmentCreditRating,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "investment credit rating"},
   :rdfs/subClassOf :fibo-fbc-dae-crt/CreditRating,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "credit rating that provides an opinion of creditworthiness of an investment, including but not limited to an instrument or organization"}})

(def InvestmentGradeQuality
  "classifier for debt instruments that are considered to be of high quality and have a low risk of default"
  {:cmns-av/explanatoryNote
   "Bond rating firms use different designations, often consisting of the upper- and lower-case letters to identify a bond's credit quality rating. 'AAA' and 'AA' (high credit quality) and 'A' and 'BBB' (medium credit quality) are considered investment grade. Credit ratings for bonds below these designations ('BB,' 'B,' 'CCC,' etc.) are considered low credit quality, and are commonly referred to as 'junk bonds.'",
   :db/ident :fibo-fbc-dae-crt/InvestmentGradeQuality,
   :rdf/type [:fibo-fbc-dae-crt/CreditQuality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/",
   :rdfs/label "investment grade quality",
   :skos/definition
   "classifier for debt instruments that are considered to be of high quality and have a low risk of default"})

(def NonprimeQuality
  "classifier for borrowers, rates, or holdings that have poor quality, such as borrowers with poor credit history due to a short sale, bankruptcy, foreclosure and/or other negative credit events within the last several years"
  {:cmns-av/explanatoryNote
   "Nonprime loans may be offered to individuals who are unable to qualify for a conventional loan.",
   :db/ident :fibo-fbc-dae-crt/NonprimeQuality,
   :rdf/type [:fibo-fbc-dae-crt/CreditQuality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/",
   :rdfs/label "nonprime quality",
   :skos/definition
   "classifier for borrowers, rates, or holdings that have poor quality, such as borrowers with poor credit history due to a short sale, bankruptcy, foreclosure and/or other negative credit events within the last several years"})

(def OnWatchOutlook
  "on watch outlook"
  {:db/ident :fibo-fbc-dae-crt/OnWatchOutlook,
   :rdf/type [:fibo-fbc-dae-crt/CreditWatchOutlook :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "on watch outlook"}})

(def OrganizationCreditRating
  "credit rating that provides an opinion of creditworthiness of an organization"
  {:db/ident :fibo-fbc-dae-crt/OrganizationCreditRating,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "organization credit rating"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-arr-rt/rates,
                      :owl/someValuesFrom :fibo-fnd-org-fm/FormalOrganization,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-dae-crt/CreditRating],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "credit rating that provides an opinion of creditworthiness of an organization"}})

(def PrimeQuality
  "classifier for borrowers, rates, or holdings that are considered to be of high quality"
  {:cmns-av/explanatoryNote
   "This classification often refers to loans made to high-quality borrowers that are offered prime or relatively low interest rates. Prime loans have low default risk.",
   :cmns-av/synonym "A-paper",
   :db/ident :fibo-fbc-dae-crt/PrimeQuality,
   :rdf/type [:fibo-fbc-dae-crt/CreditQuality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/",
   :rdfs/label "prime quality",
   :skos/definition
   "classifier for borrowers, rates, or holdings that are considered to be of high quality"})

(def ShortTermCreditRating
  "credit rating that provides an opinion of the probability of an individual or organization going into default within a year"
  {:db/ident :fibo-fbc-dae-crt/ShortTermCreditRating,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "short term credit rating"},
   :rdfs/subClassOf :fibo-fbc-dae-crt/InvestmentCreditRating,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "credit rating that provides an opinion of the probability of an individual or organization going into default within a year"}})

(def SoftCreditInquiry
  "soft credit inquiry"
  {:db/ident :fibo-fbc-dae-crt/SoftCreditInquiry,
   :rdf/type [:fibo-fbc-dae-crt/CreditInquiryType :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/",
   :rdfs/label "soft credit inquiry"})

(def StableOutlook
  "stable outlook"
  {:db/ident :fibo-fbc-dae-crt/StableOutlook,
   :rdf/type [:fibo-fbc-dae-crt/CreditWatchOutlook :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "stable outlook"}})

(def SubprimeQuality
  "classifier for borrowers, rates, or holdings that are considered below-average quality, such as borrowers with a tarnished or limited credit history, and may be subject to higher than average interest rates"
  {:cmns-av/explanatoryNote
   "Subprime refers to borrowers or loans, usually offered at rates well above the prime rate. Subprime lending is higher risk, given the lower credit rating of borrowers.",
   :db/ident :fibo-fbc-dae-crt/SubprimeQuality,
   :rdf/type [:fibo-fbc-dae-crt/CreditQuality :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/",
   :rdfs/label "subprime quality",
   :skos/definition
   "classifier for borrowers, rates, or holdings that are considered below-average quality, such as borrowers with a tarnished or limited credit history, and may be subject to higher than average interest rates"})

(def concernsParty
  "indicates the party for which something is being or has been requested"
  {:db/ident :fibo-fbc-dae-crt/concernsParty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/",
   :rdfs/label "concerns party",
   :rdfs/subPropertyOf :fibo-fnd-pty-pty/hasParty,
   :skos/definition
   "indicates the party for which something is being or has been requested"})

(def hasCoveragePeriod
  "relates something (e.g. a credit report or insurance policy) to the specific time period that it covers"
  {:db/ident :fibo-fbc-dae-crt/hasCoveragePeriod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/",
   :rdfs/label "has coverage period",
   :rdfs/range :fibo-fnd-dt-fd/DatePeriod,
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasDatePeriod,
   :skos/definition
   "relates something (e.g. a credit report or insurance policy) to the specific time period that it covers"})

(def hasWatchDirection
  "indicates direction in which an investment credit rating is expected to move in cases where that rating is on watch"
  {:db/ident :fibo-fbc-dae-crt/hasWatchDirection,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-dae-crt/InvestmentCreditRating,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "watch direction"},
   :rdfs/range :fibo-fbc-dae-crt/CreditWatchDirection,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates direction in which an investment credit rating is expected to move in cases where that rating is on watch"}})

(def hasWatchOutlook
  "indicates the expected outlook for the rated entity"
  {:db/ident :fibo-fbc-dae-crt/hasWatchOutlook,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-dae-crt/InvestmentCreditRating,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "watch outlook"},
   :rdfs/range :fibo-fbc-dae-crt/CreditWatchOutlook,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "indicates the expected outlook for the rated entity"}})