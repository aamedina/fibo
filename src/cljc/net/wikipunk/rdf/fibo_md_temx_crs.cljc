(ns net.wikipunk.rdf.fibo-md-temx-crs
  {:cmns-av/copyright "Copyright (c) 2013-2023 EDM Council, Inc.",
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/MD/TemporalCore/SecurityCreditStatuses/",
   :dcterms/abstract
   "This ontology extends the credit status ontology to define credit status concepts that are specific to issued securities. These include cashflow status and the basic credit statuses of being OK or in default. \n\t\tNote that in application data models these concepts would be represented as one or more selectable code lists or enumerations.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :namespaces
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
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Arrangements/Lifecycles/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/MD/TemporalCore/SecurityCreditStatuses/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-md-temx-crs",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/SecurityCreditStatuses/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "SecurityCreditStatuses"},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/SecurityCreditStatuses/"})

(def CreditOK
  {:db/ident :fibo-md-temx-crs/CreditOK,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/SecurityCreditStatuses/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "credit o k"},
   :rdfs/subClassOf :fibo-md-temx-crs/SecurityCreditStatus,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Not defaulted."}})

(def InDefault
  {:db/ident :fibo-md-temx-crs/InDefault,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/SecurityCreditStatuses/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "in default"},
   :rdfs/subClassOf :fibo-md-temx-crs/SecurityCreditStatus,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The issuer has failed to pay somthing that they are contractually obliged to pay."},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "(review 7 Oct 09) Does this exist as a term? This is a characteristic of the instrument not the rating. Because it's in default you can expect the rating to drop. Applies to instrument not to debtor. So a company may have 3 bond issues and may be defualt on only one. 14 Oct: Degrees of defaults e.g. tranche not paying interest due to losses on the underlying portrfolio; tranches being used to pay down more senior tranches."}})

(def SecurityCashflowStatus
  {:db/ident :fibo-md-temx-crs/SecurityCashflowStatus,
   :owl/disjointWith :fibo-md-temx-crs/SecurityCreditStatus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/SecurityCreditStatuses/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "security cashflow status"},
   :rdfs/subClassOf :fibo-fnd-arr-lif/LifecycleStatus,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The status of the cashflow due to the holder from the security."},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "Specialize this for preferred stocks, debt tranches and so on."}})

(def SecurityCreditStatus
  {:db/ident :fibo-md-temx-crs/SecurityCreditStatus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/SecurityCreditStatuses/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "security credit status"},
   :rdfs/subClassOf #{:fibo-fnd-arr-lif/LifecycleStatus
                      {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                       :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                       :rdf/type           :owl/Restriction}}})

(def acceleratedPrincipalPaymentsExpected
  {:db/ident :fibo-md-temx-crs/acceleratedPrincipalPaymentsExpected,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-md-temx-crs/SecurityCashflowStatus,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/SecurityCreditStatuses/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "accelerated principal payments expected"},
   :rdfs/range :xsd/boolean})

(def interestPaymentsExpected
  {:db/ident :fibo-md-temx-crs/interestPaymentsExpected,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-md-temx-crs/SecurityCashflowStatus,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/SecurityCreditStatuses/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "interest payments expected"},
   :rdfs/range :xsd/boolean})

(def principalPaymentsExpected
  {:db/ident :fibo-md-temx-crs/principalPaymentsExpected,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-md-temx-crs/SecurityCashflowStatus,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/SecurityCreditStatuses/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "principal payments expected"},
   :rdfs/range :xsd/boolean})

(def urn:uuid:41d37aad-a8e5-5e6c-8913-6e39ac318cc9
  {:cmns-av/copyright "Copyright (c) 2013-2023 EDM Council, Inc.",
   :dcterms/abstract
   "This ontology extends the credit status ontology to define credit status concepts that are specific to issued securities. These include cashflow status and the basic credit statuses of being OK or in default. \n\t\tNote that in application data models these concepts would be represented as one or more selectable code lists or enumerations.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Arrangements/Lifecycles/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/MD/TemporalCore/SecurityCreditStatuses/"},
   :rdf/type :owl/Ontology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "SecurityCreditStatuses"},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/SecurityCreditStatuses/"})