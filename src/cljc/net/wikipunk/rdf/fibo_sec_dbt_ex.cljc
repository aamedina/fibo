(ns net.wikipunk.rdf.fibo-sec-dbt-ex
  ^{:base
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/ExerciseConventions/",
    :namespaces
    {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
     "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
     "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
     "dcterms" "http://purl.org/dc/terms/",
     "fibo-fbc-fi-fi"
     "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
     "fibo-fnd-agr-ctr"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
     "fibo-fnd-dt-bd"
     "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/BusinessDates/",
     "fibo-fnd-utl-av"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
     "fibo-sec-dbt-ex"
     "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/ExerciseConventions/",
     "owl" "http://www.w3.org/2002/07/owl#",
     "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
     "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
     "skos" "http://www.w3.org/2004/02/skos/core#",
     "xsd" "http://www.w3.org/2001/XMLSchema#"},
    :prefix "fibo-sec-dbt-ex",
    :source
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Debt/ExerciseConventions/"}
  {:cmns-av/copyright
   #{"Copyright (c) 2015-2023 EDM Council, Inc."
     "Copyright (c) 2015-2023 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology defines the various kinds of exercise conventions that are common to debt and options instruments. They are distinguished primarily in terms of the date period during which an optional contract clause may be exercised.",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/DatesAndTimes/BusinessDates/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Debt/ExerciseConventions/"},
   :rdf/type :owl/Ontology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Exercise Conventions Ontology"},
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/ExerciseConventions.rdf version of this ontology was added to support integration of Bonds and Options in SEC and DER, respectively."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/ExerciseConventions.rdf version of this ontology was modified to loosen the domain of hasExerciseTerms to allow for entitlements to have such terms."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/ExerciseConventions.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/Debt/ExerciseConventions.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/ExerciseConventions.rdf version of this ontology was modified to eliminate duplication of concepts in LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/ExerciseConventions.rdf version of this ontology was modified to revise the definition of American exercise terms to say that an option with such terms may be exercised on or before the expiration date of the contract."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/ExerciseConventions.rdf version of this ontology was modified to add the hasExerciseTerms property."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/ExerciseConventions/"})

(def AmericanExerciseConvention
  {:db/ident :fibo-sec-dbt-ex/AmericanExerciseConvention,
   :rdf/type #{:fibo-sec-dbt-ex/ExerciseConvention :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/ExerciseConventions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "American exercise convention"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "exercise convention that stipulates that an option may be exercised anytime between the purchase date and date of expiration"}})

(def AmericanExerciseTerms
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Under certain circumstances, early exercise may be advantageous to the option holder."},
   :db/ident :fibo-sec-dbt-ex/AmericanExerciseTerms,
   :owl/disjointWith #{:fibo-sec-dbt-ex/EuropeanExerciseTerms
                       :fibo-sec-dbt-ex/BermudanExerciseTerms},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/ExerciseConventions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "American exercise terms"},
   :rdfs/subClassOf #{:fibo-sec-dbt-ex/ExerciseTerms
                      {:owl/hasValue
                       :fibo-sec-dbt-ex/AmericanExerciseConvention,
                       :owl/onProperty :cmns-cxtdsg/uses,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "exercise terms that stipulate that an option may be exercised on or before the date of expiration"}})

(def BermudanExerciseConvention
  {:db/ident :fibo-sec-dbt-ex/BermudanExerciseConvention,
   :rdf/type #{:fibo-sec-dbt-ex/ExerciseConvention :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/ExerciseConventions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Bermudan exercise convention"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "exercise convention that stipulates that an option may be exercised anytime between the purchase date and date of expiration"}})

(def BermudanExerciseTerms
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The Bermuda option is named as such because its exercise dates are more flexible than European options and less flexible than American options. Thus, it is in the middle, just like Bermuda is between Europe and America. Bermuda options are also referred to as Mid-Atlantic, Quasi American, or Semi-American options."},
   :db/ident :fibo-sec-dbt-ex/BermudanExerciseTerms,
   :owl/disjointWith :fibo-sec-dbt-ex/EuropeanExerciseTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/ExerciseConventions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Bermudan exercise terms"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-sec-dbt-ex/hasExerciseWindow,
      :owl/someValuesFrom :cmns-dt/DatePeriod,
      :rdf/type           :owl/Restriction}
     {:owl/hasValue   :fibo-sec-dbt-ex/BermudanExerciseConvention,
      :owl/onProperty :cmns-cxtdsg/uses,
      :rdf/type       :owl/Restriction} :fibo-sec-dbt-ex/ExerciseTerms
     {:owl/onProperty     :fibo-sec-dbt-ex/hasExerciseDate,
      :owl/someValuesFrom :cmns-dt/ExplicitDate,
      :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "exercise terms that stipulate that an option may only be exercised on predetermined dates within some exercise window, often on one day each month or at the date of expiration"}})

(def CanaryExerciseConvention
  {:db/ident :fibo-sec-dbt-ex/CanaryExerciseConvention,
   :rdf/type #{:fibo-sec-dbt-ex/ExerciseConvention :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/ExerciseConventions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "canary exercise convention"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "exercise/call convention that stipulates that an option may only be exercised on predetermined dates until the first step is reached, but not after that point"}})

(def CanaryExerciseTerms
  {:db/ident :fibo-sec-dbt-ex/CanaryExerciseTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/ExerciseConventions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "canary exercise terms"},
   :rdfs/subClassOf #{{:owl/hasValue :fibo-sec-dbt-ex/CanaryExerciseConvention,
                       :owl/onProperty :cmns-cxtdsg/uses,
                       :rdf/type :owl/Restriction}
                      :fibo-sec-dbt-ex/BermudanExerciseTerms},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "exercise terms that stipulate that an option may only be exercised on predetermined dates until the first step is reached, but not after that point"}})

(def EuropeanExerciseConvention
  {:db/ident :fibo-sec-dbt-ex/EuropeanExerciseConvention,
   :rdf/type #{:fibo-sec-dbt-ex/ExerciseConvention :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/ExerciseConventions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "European exercise convention"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "exercise convention that stipulates that an option may only be exercised at the date of expiration"}})

(def EuropeanExerciseTerms
  {:db/ident :fibo-sec-dbt-ex/EuropeanExerciseTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/ExerciseConventions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "European exercise terms"},
   :rdfs/subClassOf
   #{{:owl/onClass    :cmns-dt/ExplicitDate,
      :owl/onProperty :fibo-sec-dbt-ex/hasExerciseDate,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction}
     {:owl/hasValue   :fibo-sec-dbt-ex/EuropeanExerciseConvention,
      :owl/onProperty :cmns-cxtdsg/uses,
      :rdf/type       :owl/Restriction} :fibo-sec-dbt-ex/ExerciseTerms},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "exercise terms that stipulate that an option may only be exercised at the date of expiration"}})

(def ExerciseConvention
  {:db/ident :fibo-sec-dbt-ex/ExerciseConvention,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/ExerciseConventions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "exercise convention"},
   :rdfs/subClassOf :fibo-fnd-dt-bd/Convention,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "convention that determines when the holder or future holder of an option can implement the rights defined in the option"}})

(def ExerciseTerms
  {:db/ident :fibo-sec-dbt-ex/ExerciseTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/ExerciseConventions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "exercise terms"},
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-cxtdsg/uses,
                       :owl/someValuesFrom :fibo-sec-dbt-ex/ExerciseConvention,
                       :rdf/type           :owl/Restriction}
                      :fibo-fnd-agr-ctr/ContractualCommitment},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "contract terms specific to the conditions, conventions and other stipulations related to the exercise of an option or entitlement"}})

(def hasExerciseDate
  {:db/ident :fibo-sec-dbt-ex/hasExerciseDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/ExerciseConventions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has exercise date"},
   :rdfs/range :cmns-dt/ExplicitDate,
   :rdfs/subPropertyOf :cmns-dt/hasExplicitDate,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates a date on which an option may be exercised as specified in the terms of the contract"}})

(def hasExerciseTerms
  {:db/ident :fibo-sec-dbt-ex/hasExerciseTerms,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-fi-fi/DerivativeInstrument,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/ExerciseConventions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has exercise terms"},
   :rdfs/range :fibo-sec-dbt-ex/ExerciseTerms,
   :rdfs/subPropertyOf :fibo-fnd-agr-ctr/hasContractualElement,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "links a derivative, such as an option or entitlement, to any exercise terms that are specified therein"}})

(def hasExerciseWindow
  {:db/ident :fibo-sec-dbt-ex/hasExerciseWindow,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/ExerciseConventions/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has exercise window"},
   :rdfs/range :cmns-dt/DatePeriod,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates a period of time during which the option may be exercised as specified in the terms of the contract"}})

(def urn:uuid:05be9b3a-98c0-5f29-9666-18e626c7ab08
  {:cmns-av/copyright
   #{"Copyright (c) 2015-2023 EDM Council, Inc."
     "Copyright (c) 2015-2023 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology defines the various kinds of exercise conventions that are common to debt and options instruments. They are distinguished primarily in terms of the date period during which an optional contract clause may be exercised.",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/DatesAndTimes/BusinessDates/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Debt/ExerciseConventions/"},
   :rdf/type :owl/Ontology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Exercise Conventions Ontology"},
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/ExerciseConventions.rdf version of this ontology was added to support integration of Bonds and Options in SEC and DER, respectively."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/ExerciseConventions.rdf version of this ontology was modified to loosen the domain of hasExerciseTerms to allow for entitlements to have such terms."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/ExerciseConventions.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/Debt/ExerciseConventions.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/ExerciseConventions.rdf version of this ontology was modified to eliminate duplication of concepts in LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/ExerciseConventions.rdf version of this ontology was modified to revise the definition of American exercise terms to say that an option with such terms may be exercised on or before the expiration date of the contract."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/ExerciseConventions.rdf version of this ontology was modified to add the hasExerciseTerms property."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/ExerciseConventions/"})