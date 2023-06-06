(ns net.wikipunk.rdf.fibo-sec-dbt-ex
  "This ontology defines the various kinds of exercise conventions that are common to debt and options instruments. They are distinguished primarily in terms of the date period during which an optional contract clause may be exercised."
  {:cmns-av/copyright ["Copyright (c) 2015-2023 Object Management Group, Inc."
                       "Copyright (c) 2015-2023 EDM Council, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/ExerciseConventions/",
   :dcterms/abstract
   "This ontology defines the various kinds of exercise conventions that are common to debt and options instruments. They are distinguished primarily in terms of the date period during which an optional contract clause may be exercised.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://www.omg.org/spec/Commons/ContextualDesignators/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/BusinessDates/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://www.omg.org/spec/Commons/DatesAndTimes/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Contracts/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/ExerciseConventions/",
   :rdf/ns-prefix-map
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
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-sec-dbt-ex",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/ExerciseConventions/",
   :rdfs/label #voc/lstr "Exercise Conventions Ontology@en",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/ExerciseConventions.rdf version of this ontology was modified to loosen the domain of hasExerciseTerms to allow for entitlements to have such terms."
    "The https://spec.edmcouncil.org/fibo/ontology/Debt/ExerciseConventions.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/ExerciseConventions.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/ExerciseConventions.rdf version of this ontology was added to support integration of Bonds and Options in SEC and DER, respectively."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/ExerciseConventions.rdf version of this ontology was modified to revise the definition of American exercise terms to say that an option with such terms may be exercised on or before the expiration date of the contract."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/ExerciseConventions.rdf version of this ontology was modified to eliminate duplication of concepts in LCC."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/ExerciseConventions.rdf version of this ontology was modified to add the hasExerciseTerms property."]})

(def AmericanExerciseConvention
  "exercise convention that stipulates that an option may be exercised anytime between the purchase date and date of expiration"
  {:db/ident :fibo-sec-dbt-ex/AmericanExerciseConvention,
   :rdf/type [:fibo-sec-dbt-ex/ExerciseConvention
              :owl/NamedIndividual
              :fibo-fnd-dt-bd/Convention],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/ExerciseConventions/",
   :rdfs/label #voc/lstr "American exercise convention@en",
   :skos/definition
   #voc/lstr
    "exercise convention that stipulates that an option may be exercised anytime between the purchase date and date of expiration@en"})

(def AmericanExerciseTerms
  "exercise terms that stipulate that an option may be exercised on or before the date of expiration"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "Under certain circumstances, early exercise may be advantageous to the option holder.@en",
   :db/ident :fibo-sec-dbt-ex/AmericanExerciseTerms,
   :owl/disjointWith [:fibo-sec-dbt-ex/EuropeanExerciseTerms
                      :fibo-sec-dbt-ex/BermudanExerciseTerms],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/ExerciseConventions/",
   :rdfs/label #voc/lstr "American exercise terms@en",
   :rdfs/subClassOf [{:owl/hasValue :fibo-sec-dbt-ex/AmericanExerciseConvention,
                      :owl/onProperty :cmns-cxtdsg/uses,
                      :rdf/type :owl/Restriction}
                     :fibo-sec-dbt-ex/ExerciseTerms
                     :fibo-sec-dbt-ex/AmericanExerciseTerms
                     {:owl/onProperty     :cmns-cxtdsg/uses,
                      :owl/someValuesFrom :fibo-sec-dbt-ex/ExerciseConvention,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-agr-ctr/ContractualCommitment],
   :skos/definition
   #voc/lstr
    "exercise terms that stipulate that an option may be exercised on or before the date of expiration@en"})

(def BermudanExerciseConvention
  "exercise convention that stipulates that an option may be exercised anytime between the purchase date and date of expiration"
  {:db/ident :fibo-sec-dbt-ex/BermudanExerciseConvention,
   :rdf/type [:fibo-sec-dbt-ex/ExerciseConvention
              :owl/NamedIndividual
              :fibo-fnd-dt-bd/Convention],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/ExerciseConventions/",
   :rdfs/label #voc/lstr "Bermudan exercise convention@en",
   :skos/definition
   #voc/lstr
    "exercise convention that stipulates that an option may be exercised anytime between the purchase date and date of expiration@en"})

(def BermudanExerciseTerms
  "exercise terms that stipulate that an option may only be exercised on predetermined dates within some exercise window, often on one day each month or at the date of expiration"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "The Bermuda option is named as such because its exercise dates are more flexible than European options and less flexible than American options. Thus, it is in the middle, just like Bermuda is between Europe and America. Bermuda options are also referred to as Mid-Atlantic, Quasi American, or Semi-American options.@en",
   :db/ident :fibo-sec-dbt-ex/BermudanExerciseTerms,
   :owl/disjointWith :fibo-sec-dbt-ex/EuropeanExerciseTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/ExerciseConventions/",
   :rdfs/label #voc/lstr "Bermudan exercise terms@en",
   :rdfs/subClassOf [{:owl/hasValue :fibo-sec-dbt-ex/BermudanExerciseConvention,
                      :owl/onProperty :cmns-cxtdsg/uses,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-sec-dbt-ex/hasExerciseWindow,
                      :owl/someValuesFrom :cmns-dt/DatePeriod,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-dbt-ex/ExerciseTerms
                     {:owl/onProperty     :fibo-sec-dbt-ex/hasExerciseDate,
                      :owl/someValuesFrom :cmns-dt/ExplicitDate,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-dbt-ex/BermudanExerciseTerms
                     {:owl/onProperty     :cmns-cxtdsg/uses,
                      :owl/someValuesFrom :fibo-sec-dbt-ex/ExerciseConvention,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-agr-ctr/ContractualCommitment],
   :skos/definition
   #voc/lstr
    "exercise terms that stipulate that an option may only be exercised on predetermined dates within some exercise window, often on one day each month or at the date of expiration@en"})

(def CanaryExerciseConvention
  "exercise/call convention that stipulates that an option may only be exercised on predetermined dates until the first step is reached, but not after that point"
  {:db/ident :fibo-sec-dbt-ex/CanaryExerciseConvention,
   :rdf/type [:fibo-sec-dbt-ex/ExerciseConvention
              :owl/NamedIndividual
              :fibo-fnd-dt-bd/Convention],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/ExerciseConventions/",
   :rdfs/label #voc/lstr "canary exercise convention@en",
   :skos/definition
   #voc/lstr
    "exercise/call convention that stipulates that an option may only be exercised on predetermined dates until the first step is reached, but not after that point@en"})

(def CanaryExerciseTerms
  "exercise terms that stipulate that an option may only be exercised on predetermined dates until the first step is reached, but not after that point"
  {:db/ident :fibo-sec-dbt-ex/CanaryExerciseTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/ExerciseConventions/",
   :rdfs/label #voc/lstr "canary exercise terms@en",
   :rdfs/subClassOf [{:owl/hasValue   :fibo-sec-dbt-ex/CanaryExerciseConvention,
                      :owl/onProperty :cmns-cxtdsg/uses,
                      :rdf/type       :owl/Restriction}
                     :fibo-sec-dbt-ex/BermudanExerciseTerms
                     :fibo-sec-dbt-ex/CanaryExerciseTerms
                     :fibo-sec-dbt-ex/ExerciseTerms
                     {:owl/onProperty     :fibo-sec-dbt-ex/hasExerciseDate,
                      :owl/someValuesFrom :cmns-dt/ExplicitDate,
                      :rdf/type           :owl/Restriction}
                     {:owl/hasValue :fibo-sec-dbt-ex/BermudanExerciseConvention,
                      :owl/onProperty :cmns-cxtdsg/uses,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-sec-dbt-ex/hasExerciseWindow,
                      :owl/someValuesFrom :cmns-dt/DatePeriod,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :cmns-cxtdsg/uses,
                      :owl/someValuesFrom :fibo-sec-dbt-ex/ExerciseConvention,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-agr-ctr/ContractualCommitment],
   :skos/definition
   #voc/lstr
    "exercise terms that stipulate that an option may only be exercised on predetermined dates until the first step is reached, but not after that point@en"})

(def EuropeanExerciseConvention
  "exercise convention that stipulates that an option may only be exercised at the date of expiration"
  {:db/ident :fibo-sec-dbt-ex/EuropeanExerciseConvention,
   :rdf/type [:fibo-sec-dbt-ex/ExerciseConvention
              :owl/NamedIndividual
              :fibo-fnd-dt-bd/Convention],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/ExerciseConventions/",
   :rdfs/label #voc/lstr "European exercise convention@en",
   :skos/definition
   #voc/lstr
    "exercise convention that stipulates that an option may only be exercised at the date of expiration@en"})

(def EuropeanExerciseTerms
  "exercise terms that stipulate that an option may only be exercised at the date of expiration"
  {:db/ident :fibo-sec-dbt-ex/EuropeanExerciseTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/ExerciseConventions/",
   :rdfs/label #voc/lstr "European exercise terms@en",
   :rdfs/subClassOf [{:owl/onClass    :cmns-dt/ExplicitDate,
                      :owl/onProperty :fibo-sec-dbt-ex/hasExerciseDate,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/hasValue :fibo-sec-dbt-ex/EuropeanExerciseConvention,
                      :owl/onProperty :cmns-cxtdsg/uses,
                      :rdf/type :owl/Restriction}
                     :fibo-sec-dbt-ex/ExerciseTerms
                     :fibo-sec-dbt-ex/EuropeanExerciseTerms
                     {:owl/onProperty     :cmns-cxtdsg/uses,
                      :owl/someValuesFrom :fibo-sec-dbt-ex/ExerciseConvention,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-agr-ctr/ContractualCommitment],
   :skos/definition
   #voc/lstr
    "exercise terms that stipulate that an option may only be exercised at the date of expiration@en"})

(def ExerciseConvention
  "convention that determines when the holder or future holder of an option can implement the rights defined in the option"
  {:db/ident :fibo-sec-dbt-ex/ExerciseConvention,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/ExerciseConventions/",
   :rdfs/label #voc/lstr "exercise convention@en",
   :rdfs/subClassOf [:fibo-fnd-dt-bd/Convention
                     :fibo-sec-dbt-ex/ExerciseConvention],
   :skos/definition
   #voc/lstr
    "convention that determines when the holder or future holder of an option can implement the rights defined in the option@en"})

(def ExerciseTerms
  "contract terms specific to the conditions, conventions and other stipulations related to the exercise of an option or entitlement"
  {:db/ident :fibo-sec-dbt-ex/ExerciseTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/ExerciseConventions/",
   :rdfs/label #voc/lstr "exercise terms@en",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-cxtdsg/uses,
                      :owl/someValuesFrom :fibo-sec-dbt-ex/ExerciseConvention,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-agr-ctr/ContractualCommitment
                     :fibo-sec-dbt-ex/ExerciseTerms],
   :skos/definition
   #voc/lstr
    "contract terms specific to the conditions, conventions and other stipulations related to the exercise of an option or entitlement@en"})

(def hasExerciseDate
  "indicates a date on which an option may be exercised as specified in the terms of the contract"
  {:db/ident :fibo-sec-dbt-ex/hasExerciseDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/ExerciseConventions/",
   :rdfs/label #voc/lstr "has exercise date@en",
   :rdfs/range :cmns-dt/ExplicitDate,
   :rdfs/subPropertyOf [:cmns-dt/hasExplicitDate
                        :fibo-sec-dbt-ex/hasExerciseDate],
   :skos/definition
   #voc/lstr
    "indicates a date on which an option may be exercised as specified in the terms of the contract@en"})

(def hasExerciseTerms
  "links a derivative, such as an option or entitlement, to any exercise terms that are specified therein"
  {:db/ident :fibo-sec-dbt-ex/hasExerciseTerms,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-fi-fi/DerivativeInstrument,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/ExerciseConventions/",
   :rdfs/label #voc/lstr "has exercise terms@en",
   :rdfs/range :fibo-sec-dbt-ex/ExerciseTerms,
   :rdfs/subPropertyOf [:fibo-fnd-agr-ctr/hasContractualElement
                        :fibo-sec-dbt-ex/hasExerciseTerms],
   :skos/definition
   #voc/lstr
    "links a derivative, such as an option or entitlement, to any exercise terms that are specified therein@en"})

(def hasExerciseWindow
  "indicates a period of time during which the option may be exercised as specified in the terms of the contract"
  {:db/ident :fibo-sec-dbt-ex/hasExerciseWindow,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/ExerciseConventions/",
   :rdfs/label #voc/lstr "has exercise window@en",
   :rdfs/range :cmns-dt/DatePeriod,
   :skos/definition
   #voc/lstr
    "indicates a period of time during which the option may be exercised as specified in the terms of the contract@en"})