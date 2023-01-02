(ns net.wikipunk.rdf.fibo-fnd-arr-asmt
  "This ontology defines abstract concepts for assessments, evaluations, and outcomes, as the basis for various analysis, such as for business performance, compliance and risk."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Assessments/",
   :dcterms/abstract
   "This ontology defines abstract concepts for assessments, evaluations, and outcomes, as the basis for various analysis, such as for business performance, compliance and risk.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Roles/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Reporting/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Parties/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/GoalsAndObjectives/Objectives/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/Analytics/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/OwnershipAndControl/Ownership/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/Occurrences/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Assessments/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
    "fibo-fnd-arr-asmt"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Assessments/",
    "fibo-fnd-arr-rep"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/",
    "fibo-fnd-dt-fd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
    "fibo-fnd-dt-oc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/",
    "fibo-fnd-gao-obj"
    "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/Objectives/",
    "fibo-fnd-oac-own"
    "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Ownership/",
    "fibo-fnd-pty-pty"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
    "fibo-fnd-pty-rl"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-alx"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Assessments/",
   :rdfa/prefix "fibo-fnd-arr-asmt",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Assessments/",
   :rdfs/label "Assessments Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Assessments.rdf version of this ontology was revised to augment the definition of appraisal with an estimated value and correct a bug in the definition of hasAppraiser."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Assessments.rdf version of this ontology was revised to add the concept of a valuation method, which is then applied in the context of a value assessment."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Assessments.rdf version of this ontology was revised to integrate concepts related to value assessments / appraisals."],
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright ["Copyright (c) 2019-2022 Object Management Group, Inc."
                  "Copyright (c) 2019-2022 EDM Council, Inc."],
   :sm/dependsOn
   ["https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Ownership/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/"],
   :sm/fileAbbreviation "fibo-fnd-arr-asmt",
   :sm/filename "Assessments.rdf"})

(def Appraisal
  "written estimate of the market value of something as of some point in time, typically provided by a qualified appraiser"
  {:db/ident :fibo-fnd-arr-asmt/Appraisal,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Assessments/",
   :rdfs/label "appraisal",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-arr-asmt/estimatesValueAt,
                      :owl/someValuesFrom :fibo-fnd-arr-asmt/AppraisedValue,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-oac-own/Asset,
                      :owl/onProperty :fibo-fnd-rel-rel/evaluates,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-arr-asmt/Appraiser,
                      :owl/onProperty :fibo-fnd-rel-rel/isGeneratedBy,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-arr-asmt/AssessmentReport],
   :skos/definition
   "written estimate of the market value of something as of some point in time, typically provided by a qualified appraiser"})

(def AppraisedValue
  "estimated value of some asset as of a given point in time"
  {:db/ident :fibo-fnd-arr-asmt/AppraisedValue,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Assessments/",
   :rdfs/label "appraised value",
   :rdfs/subClassOf :fibo-fnd-acc-cur/MonetaryAmount,
   :skos/definition
   "estimated value of some asset as of a given point in time"})

(def Appraiser
  "party that evaluates or estimates the nature, quality, ability, or value of someone or something"
  {:db/ident :fibo-fnd-arr-asmt/Appraiser,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Assessments/",
   :rdfs/label "appraiser",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/provides,
                      :owl/someValuesFrom :fibo-fnd-arr-asmt/Appraisal,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality 0,
                      :owl/onProperty     :fibo-fnd-rel-rel/evaluates,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-pty-pty/PartyInRole],
   :skos/definition
   "party that evaluates or estimates the nature, quality, ability, or value of someone or something"})

(def AssessmentActivity
  "activity involving the evaluation or estimation of the nature, quality, ability, or value of someone or something"
  {:db/ident :fibo-fnd-arr-asmt/AssessmentActivity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Assessments/",
   :rdfs/label "assessment activity",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/isProvidedBy,
                      :owl/someValuesFrom :fibo-fnd-pty-rl/AgentInRole,
                      :rdf/type           :owl/Restriction}
                     {:owl/minCardinality 0,
                      :owl/onProperty     :fibo-fnd-rel-rel/evaluates,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-dt-oc/OccurrenceKind],
   :skos/definition
   "activity involving the evaluation or estimation of the nature, quality, ability, or value of someone or something"})

(def AssessmentEvent
  "event involving the evaluation or estimation of the nature, quality, or ability of someone or something"
  {:db/ident :fibo-fnd-arr-asmt/AssessmentEvent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Assessments/",
   :rdfs/label "assessment event",
   :rdfs/subClassOf [{:owl/onClass    :fibo-fnd-arr-asmt/AssessmentActivity,
                      :owl/onProperty :fibo-fnd-dt-oc/exemplifies,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/minCardinality 0,
                      :owl/onProperty     :fibo-fnd-rel-rel/evaluates,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-arr-asmt/AssessmentReport,
                      :owl/onProperty :fibo-fnd-dt-oc/hasOutput,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-dt-oc/hasOutput,
                      :owl/someValuesFrom :fibo-fnd-arr-asmt/Opinion,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-rel-rel/isProvidedBy,
                      :owl/someValuesFrom :fibo-fnd-pty-rl/AgentInRole,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-dt-oc/Occurrence],
   :skos/definition
   "event involving the evaluation or estimation of the nature, quality, or ability of someone or something"})

(def AssessmentReport
  "report that includes an opinion, judgement, appraisal, or view about something and typically the methodology and raw inputs used to arrive at that opinion"
  {:db/ident :fibo-fnd-arr-asmt/AssessmentReport,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Assessments/",
   :rdfs/label "assessment report",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-arr-asmt/Opinion,
                      :owl/onProperty :fibo-fnd-arr-rep/reportsOn,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-arr-rep/Report],
   :skos/definition
   "report that includes an opinion, judgement, appraisal, or view about something and typically the methodology and raw inputs used to arrive at that opinion"})

(def Opinion
  "judgement, appraisal, or view about something"
  {:db/ident :fibo-fnd-arr-asmt/Opinion,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Assessments/",
   :rdfs/label "opinion",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/isGeneratedBy,
                      :owl/someValuesFrom :fibo-fnd-pty-rl/AgentInRole,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-dt-oc/isOutputFrom,
                      :owl/someValuesFrom :fibo-fnd-arr-asmt/AssessmentEvent,
                      :rdf/type           :owl/Restriction}],
   :skos/definition "judgement, appraisal, or view about something"})

(def ValuationMethod
  "method used to determine the present or expected worth of an asset"
  {:db/ident :fibo-fnd-arr-asmt/ValuationMethod,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Asset valuation is the process of determining the fair market or present value of assets, using book values, absolute valuation models like discounted cash flow analysis, option pricing models or comparables. Such assets include investments in marketable securities such as stocks, bonds and options; tangible assets like buildings and equipment; or intangible assets such as brands, patents and trademarks."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Assessments/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "valuation method"},
   :rdfs/subClassOf :fibo-fnd-gao-obj/Strategy,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "method used to determine the present or expected worth of an asset"}})

(def ValueAssessment
  "assessment event to estimate the value of something"
  {:db/ident :fibo-fnd-arr-asmt/ValueAssessment,
   :fibo-fnd-utl-av/explanatoryNote
   "Note that an appraiser in this context may be a licensed appraiser, such as a real estate appraiser or auction house, or a calculation agent, depending on the circumstances.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Assessments/",
   :rdfs/label "value assessment",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-arr-asmt/hasAppraiser,
                      :owl/someValuesFrom :fibo-fnd-pty-rl/AgentInRole,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-arr-asmt/ValuationMethod,
                      :owl/onProperty :fibo-fnd-arr-asmt/appliesMethodology,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-arr-asmt/Appraisal,
                      :owl/onProperty :fibo-fnd-dt-oc/hasOutput,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-arr-asmt/AssessmentEvent],
   :skos/definition "assessment event to estimate the value of something"})

(def appliesMethodology
  "indicates the strategy used for the purposes of determining the fair market or present value of something"
  {:db/ident :fibo-fnd-arr-asmt/appliesMethodology,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Assessments/",
   :rdfs/label "applies methodology",
   :rdfs/range :fibo-fnd-arr-asmt/ValuationMethod,
   :rdfs/subPropertyOf :fibo-fnd-gao-obj/hasStrategy,
   :skos/definition
   "indicates the strategy used for the purposes of determining the fair market or present value of something"})

(def estimatesValueAt
  "provides an approximate value of some asset as of some point in time"
  {:db/ident :fibo-fnd-arr-asmt/estimatesValueAt,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Assessments/",
   :rdfs/label "estimates value at",
   :rdfs/range :fibo-fnd-arr-asmt/AppraisedValue,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasMonetaryAmount,
   :skos/definition
   "provides an approximate value of some asset as of some point in time"})

(def hasAppraiser
  "relates an assessment or report to an agent that conducts the assessment"
  {:db/ident :fibo-fnd-arr-asmt/hasAppraiser,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Assessments/",
   :rdfs/label "has appraiser",
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/isProvidedBy,
   :skos/definition
   "relates an assessment or report to an agent that conducts the assessment"})

(def hasDateOfAssessment
  "date on which an assessment process was completed"
  {:db/ident :fibo-fnd-arr-asmt/hasDateOfAssessment,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Assessments/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has date of assessment"},
   :rdfs/range :fibo-fnd-dt-fd/ExplicitDate,
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasExplicitDate,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "date on which an assessment process was completed"}})

(def hasEstimatedValue
  "relates something to its estimated value"
  {:db/ident :fibo-fnd-arr-asmt/hasEstimatedValue,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Assessments/",
   :rdfs/label "has estimated value",
   :rdfs/range :fibo-fnd-arr-asmt/AppraisedValue,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasMonetaryAmount,
   :skos/definition "relates something to its estimated value"})

(def isEstimatedValueOf
  "relates an appraised value to the asset of interest as of the date of the assessment"
  {:db/ident :fibo-fnd-arr-asmt/isEstimatedValueOf,
   :owl/inverseOf :fibo-fnd-arr-asmt/hasEstimatedValue,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-arr-asmt/AppraisedValue,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Assessments/",
   :rdfs/label "is estimated value of",
   :rdfs/subPropertyOf :fibo-fnd-utl-alx/isValueOf,
   :skos/definition
   "relates an appraised value to the asset of interest as of the date of the assessment"})