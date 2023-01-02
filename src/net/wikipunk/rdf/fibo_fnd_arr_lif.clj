(ns net.wikipunk.rdf.fibo-fnd-arr-lif
  "This ontology defines a set of basic concepts for lifecycles, including the various stages and events that make up a given lifecycle, for use in describing product, trade, instrument, production, and other lifecycles in FIBO."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Lifecycles/",
   :dcterms/abstract
   "This ontology defines a set of basic concepts for lifecycles, including the various stages and events that make up a given lifecycle, for use in describing product, trade, instrument, production, and other lifecycles in FIBO.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/ClassificationSchemes/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/BusinessDates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/Occurrences/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Arrangements/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Lifecycles/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-arr-cls"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/ClassificationSchemes/",
    "fibo-fnd-arr-lif"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Lifecycles/",
    "fibo-fnd-dt-oc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "lcc-lr" "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Lifecycles/",
   :rdfa/prefix "fibo-fnd-arr-lif",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Lifecycles/",
   :rdfs/label "Lifecycles Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Lifecycles.rdf version of this ontology was revised to define lifecycle status, normalize definitions per ISO 704 and eliminate duplication with concepts in LCC."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Lifecycles.rdf version of this ontology was revised to replace hasDefinition with isDefinedIn to clarify intent."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Lifecycles.rdf version of this ontology was revised to eliminate references to external dictionary sites that no longer resolve."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Lifecycles.rdf version of this ontology was revised to add lifecycle stage as the superclass of maturity level."],
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright ["Copyright (c) 2017-2021 EDM Council, Inc."
                  "Copyright (c) 2017-2021 Object Management Group, Inc."],
   :sm/dependsOn
   ["https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/BusinessDates/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/ClassificationSchemes/"
    "https://www.omg.org/spec/LCC/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/"],
   :sm/fileAbbreviation "fibo-fnd-arr-lif",
   :sm/filename "Lifecycles.rdf"})

(def Lifecycle
  "arrangement that compares the cyclical nature of families, organizations, processes, products, marketing, and order management, portfolio management or other systems with the cradle to grave life stages (birth, growth, maturity, decay, and death) of living organisms"
  {:db/ident :fibo-fnd-arr-lif/Lifecycle,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Lifecycles/",
   :rdfs/label "lifecycle",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/defines,
                      :owl/someValuesFrom :fibo-fnd-arr-lif/LifecycleStage,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-arr-lif/isLifecycleOf,
                      :owl/someValuesFrom :owl/Thing,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-arr-lif/hasStage,
                      :owl/someValuesFrom :fibo-fnd-arr-lif/LifecycleStage,
                      :rdf/type           :owl/Restriction}
                     :lcc-lr/Arrangement],
   :skos/definition
   "arrangement that compares the cyclical nature of families, organizations, processes, products, marketing, and order management, portfolio management or other systems with the cradle to grave life stages (birth, growth, maturity, decay, and death) of living organisms",
   :skos/example
   "The product life cycle describes the period of time over which an item is developed, brought to market and eventually removed from the market. The cycle is broken into four stages: introduction, growth, maturity and decline. The idea of the product life cycle is used in marketing to decide when it is appropriate to advertise, reduce prices, explore new markets or create new packaging."})

(def LifecycleEvent
  "kind of event that occurs during one or more stages of a lifecycle"
  {:db/ident :fibo-fnd-arr-lif/LifecycleEvent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Lifecycles/",
   :rdfs/label "lifecycle event",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/appliesTo,
                      :owl/someValuesFrom :fibo-fnd-arr-lif/LifecycleStage,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-dt-oc/OccurrenceKind],
   :skos/definition
   "kind of event that occurs during one or more stages of a lifecycle",
   :skos/example
   "a call notification or coupon payment as a part of a bond lifecycle"})

(def LifecycleEventOccurrence
  "realization of an event in a stage of a lifecycle"
  {:db/ident :fibo-fnd-arr-lif/LifecycleEventOccurrence,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Lifecycles/",
   :rdfs/label "lifecycle event occurrence",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-rel-rel/appliesTo,
                      :owl/someValuesFrom
                      :fibo-fnd-arr-lif/LifecycleStageOccurrence,
                      :rdf/type :owl/Restriction}
                     {:owl/onClass    :fibo-fnd-arr-lif/LifecycleEvent,
                      :owl/onProperty :fibo-fnd-dt-oc/exemplifies,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-dt-oc/Occurrence],
   :skos/definition "realization of an event in a stage of a lifecycle"})

(def LifecycleOccurrence
  "realization of a lifecycle"
  {:db/ident :fibo-fnd-arr-lif/LifecycleOccurrence,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Lifecycles/",
   :rdfs/label "lifecycle occurrence",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-arr-lif/hasStage,
                      :owl/someValuesFrom
                      :fibo-fnd-arr-lif/LifecycleStageOccurrence,
                      :rdf/type :owl/Restriction}
                     {:owl/onClass    :fibo-fnd-arr-lif/Lifecycle,
                      :owl/onProperty :fibo-fnd-dt-oc/exemplifies,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-dt-oc/Occurrence],
   :skos/definition "realization of a lifecycle"})

(def LifecycleStage
  "phase in a lifecycle"
  {:db/ident :fibo-fnd-arr-lif/LifecycleStage,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Lifecycles/",
   :rdfs/label "lifecycle stage",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/isDefinedIn,
                      :owl/someValuesFrom :fibo-fnd-arr-lif/Lifecycle,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-rel-rel/comprises,
                      :owl/someValuesFrom :fibo-fnd-arr-lif/LifecycleEvent,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-arr-lif/isStageOf,
                      :owl/someValuesFrom :fibo-fnd-arr-lif/Lifecycle,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-arr-cls/Classifier],
   :skos/definition "phase in a lifecycle",
   :skos/example
   "a research and development phase of a product lifecycle, the introduction phase in a marketing lifecycle, a growth stage in an economic lifecycle, or the origination phase in the lifecycle of a loan"})

(def LifecycleStageOccurrence
  "realization of a phase in a given lifecycle"
  {:db/ident :fibo-fnd-arr-lif/LifecycleStageOccurrence,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Lifecycles/",
   :rdfs/label "lifecycle stage occurrence",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-rel-rel/comprises,
                      :owl/someValuesFrom
                      :fibo-fnd-arr-lif/LifecycleEventOccurrence,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-arr-lif/isStageOf,
                      :owl/someValuesFrom :fibo-fnd-arr-lif/LifecycleOccurrence,
                      :rdf/type           :owl/Restriction}
                     {:owl/onClass    :fibo-fnd-arr-lif/LifecycleStage,
                      :owl/onProperty :fibo-fnd-dt-oc/exemplifies,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-dt-oc/Occurrence],
   :skos/definition "realization of a phase in a given lifecycle"})

(def LifecycleStatus
  "classifier indicating the position or state of something at a particular point in its life-cycle"
  {:db/ident :fibo-fnd-arr-lif/LifecycleStatus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Lifecycles/",
   :rdfs/label "lifecycle status",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-arr-lif/hasStage,
                      :owl/someValuesFrom
                      :fibo-fnd-arr-lif/LifecycleStageOccurrence,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-arr-cls/Classifier],
   :skos/definition
   "classifier indicating the position or state of something at a particular point in its life-cycle"})

(def hasLifecycle
  "relates something, such as a product, trade, or related process, to a lifecycle that characterizes it"
  {:db/ident :fibo-fnd-arr-lif/hasLifecycle,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Lifecycles/",
   :rdfs/label "has lifecycle",
   :rdfs/range :fibo-fnd-arr-lif/Lifecycle,
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/isCharacterizedBy,
   :skos/definition
   "relates something, such as a product, trade, or related process, to a lifecycle that characterizes it"})

(def hasStage
  "relates something, such as a product or trade lifecycle or related process, to a phase or stage in that lifecycle"
  {:db/ident :fibo-fnd-arr-lif/hasStage,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Lifecycles/",
   :rdfs/label "has stage",
   :rdfs/range {:owl/unionOf [:fibo-fnd-arr-lif/LifecycleStage
                              :fibo-fnd-arr-lif/LifecycleStageOccurrence],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :lcc-cr/hasPart,
   :skos/definition
   "relates something, such as a product or trade lifecycle or related process, to a phase or stage in that lifecycle"})

(def isLifecycleOf
  "relates a lifecycle to something it characterizes"
  {:db/ident :fibo-fnd-arr-lif/isLifecycleOf,
   :owl/inverseOf :fibo-fnd-arr-lif/hasLifecycle,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-arr-lif/Lifecycle,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Lifecycles/",
   :rdfs/label "is lifecycle of",
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/characterizes,
   :skos/definition "relates a lifecycle to something it characterizes"})

(def isStageOf
  "relates a stage in a product or trade lifecycle or process to the lifecycle or process that it is a stage of"
  {:db/ident :fibo-fnd-arr-lif/isStageOf,
   :owl/inverseOf :fibo-fnd-arr-lif/hasStage,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain {:owl/unionOf [:fibo-fnd-arr-lif/LifecycleStage
                               :fibo-fnd-arr-lif/LifecycleStageOccurrence],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Lifecycles/",
   :rdfs/label "is stage of",
   :rdfs/subPropertyOf :lcc-cr/isPartOf,
   :skos/definition
   "relates a stage in a product or trade lifecycle or process to the lifecycle or process that it is a stage of"})