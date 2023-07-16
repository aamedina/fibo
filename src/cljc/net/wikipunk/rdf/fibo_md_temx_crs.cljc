(ns net.wikipunk.rdf.fibo-md-temx-crs
  "This ontology extends the credit status ontology to define credit status concepts that are specific to issued securities. These include cashflow status and the basic credit statuses of being OK or in default. \n\t\tNote that in application data models these concepts would be represented as one or more selectable code lists or enumerations."
  {:cmns-av/copyright "Copyright (c) 2013-2023 EDM Council, Inc.",
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/SecurityCreditStatuses/",
   :dcterms/abstract
   "This ontology extends the credit status ontology to define credit status concepts that are specific to issued securities. These include cashflow status and the basic credit statuses of being OK or in default. \n\t\tNote that in application data models these concepts would be represented as one or more selectable code lists or enumerations.",
   :dcterms/license {:rdfa/uri "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   [{:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/ContextualDesignators/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Lifecycles/"}
    {:rdfa/uri "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"}],
   :owl/versionIRI
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/MD/TemporalCore/SecurityCreditStatuses/"},
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fbc-fi-fi"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
    "fibo-fnd-arr-lif"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Lifecycles/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-md-temx-crs"
    "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/SecurityCreditStatuses/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-md-temx-crs",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/SecurityCreditStatuses/",
   :rdfs/label #xsd/langString "SecurityCreditStatuses@en"})

(def CreditOK
  "Not defaulted."
  {:db/ident :fibo-md-temx-crs/CreditOK,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/SecurityCreditStatuses/"},
   :rdfs/label #xsd/langString "credit o k@en",
   :rdfs/subClassOf [:fibo-md-temx-crs/SecurityCreditStatus
                     :fibo-fnd-arr-lif/LifecycleStatus
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                      :rdf/type           :owl/Restriction}],
   :skos/definition #xsd/langString "Not defaulted.@en"})

(def InDefault
  "The issuer has failed to pay somthing that they are contractually obliged to pay."
  {:db/ident :fibo-md-temx-crs/InDefault,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/SecurityCreditStatuses/"},
   :rdfs/label #xsd/langString "in default@en",
   :rdfs/subClassOf [:fibo-md-temx-crs/SecurityCreditStatus
                     :fibo-fnd-arr-lif/LifecycleStatus
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   #xsd/langString
    "The issuer has failed to pay somthing that they are contractually obliged to pay.@en",
   :skos/editorialNote
   #xsd/langString
    "(review 7 Oct 09) Does this exist as a term? This is a characteristic of the instrument not the rating. Because it's in default you can expect the rating to drop. Applies to instrument not to debtor. So a company may have 3 bond issues and may be defualt on only one. 14 Oct: Degrees of defaults e.g. tranche not paying interest due to losses on the underlying portrfolio; tranches being used to pay down more senior tranches.@en"})

(def SecurityCashflowStatus
  "The status of the cashflow due to the holder from the security."
  {:db/ident :fibo-md-temx-crs/SecurityCashflowStatus,
   :owl/disjointWith :fibo-md-temx-crs/SecurityCreditStatus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/SecurityCreditStatuses/"},
   :rdfs/label #xsd/langString "security cashflow status@en",
   :rdfs/subClassOf :fibo-fnd-arr-lif/LifecycleStatus,
   :skos/definition
   #xsd/langString
    "The status of the cashflow due to the holder from the security.@en",
   :skos/editorialNote
   #xsd/langString
    "Specialize this for preferred stocks, debt tranches and so on.@en"})

(def SecurityCreditStatus
  "security credit status"
  {:db/ident :fibo-md-temx-crs/SecurityCreditStatus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/SecurityCreditStatuses/"},
   :rdfs/label #xsd/langString "security credit status@en",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-arr-lif/LifecycleStatus]})

(def acceleratedPrincipalPaymentsExpected
  "accelerated principal payments expected"
  {:db/ident :fibo-md-temx-crs/acceleratedPrincipalPaymentsExpected,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-md-temx-crs/SecurityCashflowStatus,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/SecurityCreditStatuses/"},
   :rdfs/label #xsd/langString "accelerated principal payments expected@en",
   :rdfs/range :xsd/boolean})

(def interestPaymentsExpected
  "interest payments expected"
  {:db/ident :fibo-md-temx-crs/interestPaymentsExpected,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-md-temx-crs/SecurityCashflowStatus,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/SecurityCreditStatuses/"},
   :rdfs/label #xsd/langString "interest payments expected@en",
   :rdfs/range :xsd/boolean})

(def principalPaymentsExpected
  "principal payments expected"
  {:db/ident :fibo-md-temx-crs/principalPaymentsExpected,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-md-temx-crs/SecurityCashflowStatus,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/SecurityCreditStatuses/"},
   :rdfs/label #xsd/langString "principal payments expected@en",
   :rdfs/range :xsd/boolean})