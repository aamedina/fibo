(ns net.wikipunk.rdf.fibo-fnd-gao-obj
  "This ontology defines the concept of an objective, for use in other FIBO ontology elements. Objectives are defined as being distinct from goals, in that they constitute time limited and measurable targets which some entity may seek to attain in pursuit of its goals."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/Objectives/",
   :dcterms/abstract
   "This ontology defines the concept of an objective, for use in other FIBO ontology elements. Objectives are defined as being distinct from goals, in that they constitute time limited and measurable targets which some entity may seek to attain in pursuit of its goals.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/GoalsAndObjectives/Objectives/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-dt-fd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
    "fibo-fnd-gao-obj"
    "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/Objectives/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "lcc-lr" "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/Objectives/",
   :rdfa/prefix "fibo-fnd-gao-obj",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/Objectives/",
   :rdfs/label "Objectives Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/Objectives.rdf version of this ontology was modified to integrate concepts such as distribution and sales strategy, and to eliminate duplication of concepts in LCC."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/Objectives.rdf version of this ontology was modified to add the concept of a program, required for IND but also to represent compliance, and other kinds of programs."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/Objectives.rdf version of this ontology was modified to add the property 'has strategy' for use in linking to pricing, quotation, distribution, delivery, and other strategies or methods."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/Objectives.rdf version of this ontology was modified per the issue resolutions identified in the FIBO FND 1.0 FTF report and in https://spec.edmcouncil.org/fibo/ontology/FND/1.0/AboutFND-1.0/."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/Objectives.rdf version of this ontology was modified to integrate concepts such as investment objective, business objective, strategy, and related properties."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/Objectives.rdf version of this ontology was modified to address hygiene issues with respect to text formatting."
    "The http://www.omg.org/spec/FIBO/Foundations/20130601/GoalsAndObjectives/Objectives.owl version of the ontology was revised in advance of the September 2013 New Brunswick, NJ meeting, as follows:\n\t(1) to use slash style URI/IRIss (also called 303 URIs, vs. hash style) as required to support server side processing \n\t(2) to use version-independent IRIs for all definitions internally as opposed to version-specific IRIs\n\t(3) to change the file suffix from .owl to .rdf to increase usability in RDF tools\n\t(4) to use 4-level abbreviations and corresponding namespace prefixes for all FIBO ontologies, reflecting a family/specification/module/ontology structure\n\t(5) to incorporate changes to the specification metadata to support documentation at the family, specification, module, and ontology level, similar to the abbreviations\n\t(6) to eliminate an unnecessary hasObjectives property and related imports dependencies."],
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright ["Copyright (c) 2013-2022 Object Management Group, Inc."
                  "Copyright (c) 2013-2022 EDM Council, Inc."],
   :sm/dependsOn
   ["https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/"
    "https://www.omg.org/spec/LCC/"],
   :sm/fileAbbreviation "fibo-fnd-gao-obj",
   :sm/filename "Objectives.rdf"})

(def BusinessObjective
  "objective that reflects the strategic goals and direction of a business within a time frame and available resources"
  {:db/ident :fibo-fnd-gao-obj/BusinessObjective,
   :fibo-fnd-utl-av/explanatoryNote
   ["In general, objectives are more specific and easier to measure than goals. Objectives are basic tools that underlie all planning and strategic activities. They serve as the basis for creating policy and evaluating performance. Some examples of business objectives include minimizing expenses, expanding internationally, or making a profit."
    "Business objectives allow an organization to define its goals and direction. A company uses strategy and tactics at every level of its operation to achieve its objectives. These define the way a company allocates its resources and the strengths, weaknesses and opportunities it may have. Companies usually do not alter their objectives once they are implemented, unless changes in circumstances arise. Setting a clear course for the organization is key to its success."],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/Objectives/",
   :rdfs/label "business objective",
   :rdfs/subClassOf :fibo-fnd-gao-obj/Objective,
   :skos/definition
   "objective that reflects the strategic goals and direction of a business within a time frame and available resources"})

(def BusinessStrategy
  "strategy for achieving a specific business goal, objective, solution or outcome"
  {:db/ident :fibo-fnd-gao-obj/BusinessStrategy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/Objectives/",
   :rdfs/label "business strategy",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-gao-obj/hasObjective,
                      :owl/someValuesFrom :fibo-fnd-gao-obj/BusinessObjective,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-gao-obj/Strategy],
   :skos/definition
   "strategy for achieving a specific business goal, objective, solution or outcome"})

(def DistributionStrategy
  "strategy for making a product or service available, or for distributing funds, such as in the form of a dividend or coupon"
  {:db/ident :fibo-fnd-gao-obj/DistributionStrategy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/Objectives/",
   :rdfs/label "distribution strategy",
   :rdfs/subClassOf :fibo-fnd-gao-obj/Strategy,
   :skos/definition
   "strategy for making a product or service available, or for distributing funds, such as in the form of a dividend or coupon"})

(def FinancialObjective
  "objective that reflects the strategic financial goals and direction of a party within a time frame and available resources"
  {:db/ident :fibo-fnd-gao-obj/FinancialObjective,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/Objectives/",
   :rdfs/label "financial objective",
   :rdfs/subClassOf :fibo-fnd-gao-obj/Objective,
   :skos/definition
   "objective that reflects the strategic financial goals and direction of a party within a time frame and available resources"})

(def Goal
  "desired result that a party envisions, plans, and to which it commits, in order to achieve a desired state"
  {:db/ident :fibo-fnd-gao-obj/Goal,
   :fibo-fnd-utl-av/definitionOrigin "http://en.wikipedia.org/wiki/Goal",
   :fibo-fnd-utl-av/explanatoryNote
   "Many people endeavor to reach goals within a finite time by setting deadlines.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/Objectives/",
   :rdfs/label "goal",
   :skos/definition
   "desired result that a party envisions, plans, and to which it commits, in order to achieve a desired state"})

(def InvestmentObjective
  "financial objective used by an investor to determine whether or not a given potential investment is appropriate for themselves or on behalf of another party"
  {:db/ident :fibo-fnd-gao-obj/InvestmentObjective,
   :fibo-fnd-utl-av/explanatoryNote
   "The combination of investment objectives and risk tolerance are typically used to identify appropriate investment options.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/Objectives/",
   :rdfs/label "investment objective",
   :rdfs/subClassOf :fibo-fnd-gao-obj/FinancialObjective,
   :skos/definition
   "financial objective used by an investor to determine whether or not a given potential investment is appropriate for themselves or on behalf of another party",
   :skos/example
   "An investor whose objective is capital growth might choose to invest in more aggressive, growth-oriented mutual funds and/or stocks, over income-generating mutual funds and/or bonds."})

(def Objective
  "short-term, quantitative, measurable result that a party seeks to attain in order to achieve its long-term goals"
  {:db/ident :fibo-fnd-gao-obj/Objective,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/Objectives/",
   :rdfs/label "objective",
   :rdfs/subClassOf {:owl/onProperty     :fibo-fnd-dt-fd/hasDatePeriod,
                     :owl/someValuesFrom :fibo-fnd-dt-fd/DatePeriod,
                     :rdf/type           :owl/Restriction},
   :skos/definition
   "short-term, quantitative, measurable result that a party seeks to attain in order to achieve its long-term goals"})

(def Program
  "coordinated set of activities designed to obtain benefits not available from managing them individually"
  {:db/ident :fibo-fnd-gao-obj/Program,
   :fibo-fnd-utl-av/adaptedFrom
   "https://www.prince2.com/usa/blog/project-vs-programme",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/Objectives/",
   :rdfs/label [{:rdf/language "en-GB",
                 :rdf/value    "programme"}
                {:rdf/language "en-US",
                 :rdf/value    "program"}],
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-gao-obj/Objective,
                      :owl/onProperty :fibo-fnd-gao-obj/hasObjective,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-gao-obj/Goal,
                      :owl/onProperty :fibo-fnd-gao-obj/hasGoal,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "coordinated set of activities designed to obtain benefits not available from managing them individually"})

(def SalesStrategy
  "strategy for selling something, including allocating resources to the sales process, reducing costs, and optimizing revenues"
  {:db/ident :fibo-fnd-gao-obj/SalesStrategy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/Objectives/",
   :rdfs/label "sales strategy",
   :rdfs/subClassOf :fibo-fnd-gao-obj/BusinessStrategy,
   :skos/definition
   "strategy for selling something, including allocating resources to the sales process, reducing costs, and optimizing revenues"})

(def Strategy
  "plan or method for achieving a specific goal, objective, solution or outcome"
  {:db/ident :fibo-fnd-gao-obj/Strategy,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "A strategy may involve activities that are needed in order to achieve specific goals or objectives. It may take into account one or more policies or any number of restrictions and constraints."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/Objectives/",
   :rdfs/label "strategy",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-gao-obj/Objective,
                      :owl/onProperty :fibo-fnd-gao-obj/hasObjective,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-gao-obj/Goal,
                      :owl/onProperty :fibo-fnd-gao-obj/hasGoal,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "plan or method for achieving a specific goal, objective, solution or outcome"})

(def hasGoal
  "relates something to a long-term, desired outcome"
  {:db/ident :fibo-fnd-gao-obj/hasGoal,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/Objectives/",
   :rdfs/label "has goal",
   :rdfs/range :fibo-fnd-gao-obj/Goal,
   :rdfs/subPropertyOf :lcc-lr/has,
   :skos/definition "relates something to a long-term, desired outcome"})

(def hasObjective
  "relates something to a specific objective (result) that it aims to achieve within a time frame and with available resources"
  {:db/ident :fibo-fnd-gao-obj/hasObjective,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/Objectives/",
   :rdfs/label "has objective",
   :rdfs/range :fibo-fnd-gao-obj/Objective,
   :rdfs/subPropertyOf :lcc-lr/has,
   :skos/definition
   "relates something to a specific objective (result) that it aims to achieve within a time frame and with available resources"})

(def hasStrategy
  "relates something to a plan or method for achieving a specific goal, objective, solution or outcome"
  {:db/ident :fibo-fnd-gao-obj/hasStrategy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/Objectives/",
   :rdfs/label "has strategy",
   :rdfs/range :fibo-fnd-gao-obj/Strategy,
   :rdfs/subPropertyOf :lcc-lr/has,
   :skos/definition
   "relates something to a plan or method for achieving a specific goal, objective, solution or outcome"})