(ns net.wikipunk.rdf.fibo-fnd-utl-alx
  "This ontology provides mathematical abstractions for use in other ontologies, including for example the basic components of formulae, parameters and values."
  {:cmns-av/copyright ["Copyright (c) 2013-2023 EDM Council, Inc."
                       "Copyright (c) 2013-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :dcterms/abstract
   "This ontology provides mathematical abstractions for use in other ontologies, including for example the basic components of formulae, parameters and values.",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://www.omg.org/spec/Commons/DatesAndTimes/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Locations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/GoalsAndObjectives/Objectives/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://www.omg.org/spec/Commons/Identifiers/"
    "https://www.omg.org/spec/Commons/ContextualDesignators/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Quantities/QuantitiesAndUnits/"
    "https://www.omg.org/spec/Commons/Classifiers/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
    "https://www.omg.org/spec/Commons/Collections/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Arrangements/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/Analytics/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-arr-arr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Arrangements/",
    "fibo-fnd-dt-fd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
    "fibo-fnd-gao-obj"
    "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/Objectives/",
    "fibo-fnd-plc-loc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Locations/",
    "fibo-fnd-qt-qtu"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-alx"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fnd-utl-alx",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfs/label "Analytics Ontology",
   :skos/changeNote
   ["This ontology was added to Foundations in advance of the June 2014 Boston meeting in support of the IND RFC."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics.rdf version of this ontology was modified per the FIBO 2.0 RFC."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics.rdf version of this ontology was modified to expand the definition of release date and release date and time and to make a statistical area identifier a subclass of geographic region identifier."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics.rdf version of this ontology was modified to update the reference link for ratio."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics.rdf version of this ontology was modified to augment the definition of ratio with a synonym of rate and eliminate the circularity in the definition of standard deviation."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics.rdf version of this ontology was modified per the issue resolutions identified in the FIBO FND 1.0 FTF report and in https://spec.edmcouncil.org/fibo/ontology/FND/1.0/AboutFND-1.0/."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics.rdf version of this ontology was modified to use the CombinedDateTime datatype for greater flexibility in analytics and integrate the generic statistical measures and measurements from the economic indicators ontology to FND to facilitate broader use."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics.rdf version of this ontology was modified to revise numeric index to be called numeric index value, and revise its definition to include a reference date, change its parent to quantity value, and move base date and period to scoped measure."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics.rdf version of this ontology was modified to address issue FIBOFND11-20, which added the definition of Calculation and corrected a reasoning issue related to the use of a custom datatype."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics.rdf version of this ontology was modified to eliminate unused imports."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics.rdf version of this ontology was modified to eliminate hygiene issues related to text formatting and eliminate dead or outdated references."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics.rdf version of this ontology was modified to change the parent class of Classifier to Aspect, loosen the domain on the hasArgument property, which was too narrow in some cases, add a domain/range to characterizes/isCharacterizedBy, and eliminate duplicate properties that were not used anywhere."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics.rdf version of this ontology was modified to add the concept of a weighting algorithm."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics.rdf version of this ontology was modified to eliminate the redundant 'calculation formula' concept and eliminate the property hasOperand, which is not used anywhere and whose definition is circular."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics.rdf version of this ontology was modified to make statistical program a subclass of program and revised restrictions on statistical program to better reflect its intent."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics.rdf version of this ontology was modified to eliminate deprecated elements."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics.rdf version of this ontology was modified to eliminate duplication with concepts in LCC, merge countries with locations, and correct a restriction on qualified measure."]})

(def AnnualizedStandardDeviation
  "standard deviation for some measure over a specific reference period"
  {:cmns-av/explanatoryNote
   "Standard deviation applied to the annual rate of return of an investment provides insights on the historical volatility of that investment. The greater the standard deviation of the price of a security, the greater the volatility. Multiplying monthly standard deviation by the square root of twelve (12) is an industry standard method of approximating annualized standard deviations of monthly returns.",
   :db/ident :fibo-fnd-utl-alx/AnnualizedStandardDeviation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfs/label "annualized standard deviation",
   :rdfs/subClassOf [{:owl/onClass :fibo-fnd-dt-fd/ExplicitRecurrenceInterval,
                      :owl/onProperty :fibo-fnd-utl-alx/hasReferencePeriod,
                      :owl/qualifiedCardinality 1,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-utl-alx/StandardDeviation],
   :skos/definition
   "standard deviation for some measure over a specific reference period"})

(def ArithmeticMean
  "sum of a collection of numbers divided by the number of numbers in the collection"
  {:cmns-av/explanatoryNote
   "While the arithmetic mean is often used to report central tendencies, it is not a robust statistic, meaning that it is greatly influenced by outliers (values that are very much larger or smaller than most of the values). Notably, for skewed distributions, such as the distribution of income for which a few people's incomes are substantially greater than most people's, the arithmetic mean may not accord with one's notion of 'middle', and robust statistics, such as the median, may be a better description of central tendency.",
   :db/ident :fibo-fnd-utl-alx/ArithmeticMean,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfs/label "arithmetic mean",
   :rdfs/subClassOf :fibo-fnd-utl-alx/Mean,
   :skos/definition
   "sum of a collection of numbers divided by the number of numbers in the collection"})

(def Aspect
  {:db/ident :fibo-fnd-utl-alx/Aspect,
   :owl/deprecated true,
   :owl/equivalentClass :cmns-cls/Aspect,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/"})

(def AverageAbsoluteDeviation
  "average of the absolute deviations from a central point"
  {:cmns-av/explanatoryNote
   "The central point can be the mean, median, mode, or the result of another measure of central tendency. Absolute deviation is the distance between each value in the data set and that data set's mean or median.",
   :cmns-av/synonym "mean absolute deviation",
   :db/ident :fibo-fnd-utl-alx/AverageAbsoluteDeviation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfs/label "average absolute deviation",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-utl-alx/hasArgument,
                      :owl/someValuesFrom {:owl/unionOf
                                           [:fibo-fnd-utl-alx/Mean
                                            :fibo-fnd-utl-alx/Median],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-utl-alx/Dispersion],
   :skos/definition "average of the absolute deviations from a central point"})

(def Constant
  "symbol that represents a value that does not change (i.e., is fixed) with respect to a formula or expression"
  {:db/ident :fibo-fnd-utl-alx/Constant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfs/label "constant",
   :rdfs/subClassOf [:cmns-cls/Aspect :fibo-fnd-rel-rel/Reference],
   :skos/definition
   "symbol that represents a value that does not change (i.e., is fixed) with respect to a formula or expression"})

(def Difference
  "quantity by which amounts differ; the remainder left after subtraction of one value from another"
  {:db/ident :fibo-fnd-utl-alx/Difference,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfs/label "difference",
   :rdfs/subClassOf [{:owl/cardinality 1,
                      :owl/onProperty  :fibo-fnd-utl-alx/hasSubtrahend,
                      :rdf/type        :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :fibo-fnd-utl-alx/hasMinuend,
                      :rdf/type        :owl/Restriction}
                     :fibo-fnd-utl-alx/StatisticalMeasure
                     :fibo-fnd-utl-alx/Expression],
   :skos/definition
   "quantity by which amounts differ; the remainder left after subtraction of one value from another"})

(def Dispersion
  "degree of scatter or variability shown by observations"
  {:cmns-av/adaptedFrom "http://stats.oecd.org/glossary/detail.asp?ID=3637",
   :cmns-av/explanatoryNote
   ["It is usually measured as an average deviation about some central value (e.g. mean deviation, standard deviation) or by an order statistic (e.g. quartile deviation, range) but may also be a mean of deviations of values among themselves (e.g. Gini's mean difference and also standard deviation)."
    "A measure of statistical dispersion is a nonnegative real number that is zero if all the data are the same and increases as the data become more diverse."],
   :db/ident :fibo-fnd-utl-alx/Dispersion,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfs/label "dispersion",
   :rdfs/subClassOf [:fibo-fnd-utl-alx/StatisticalMeasure
                     {:owl/onProperty     :fibo-fnd-utl-alx/hasObservedValue,
                      :owl/someValuesFrom :cmns-col/StructuredCollection,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-utl-alx/Expression
                     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-fnd-utl-alx/FinitePopulation,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :xsd/nonNegativeInteger,
                      :owl/onProperty  :fibo-fnd-arr-arr/hasCollectionSize,
                      :rdf/type        :owl/Restriction}],
   :skos/definition "degree of scatter or variability shown by observations",
   :skos/example
   "Common examples of measures of statistical dispersion are the variance, standard deviation, and interquartile range. The collection size argument, above, represents the number of elements in the set, if known. The collection of values under consideration is represented as a structured collection in FIBO, typically a sample set derived from a finite population."})

(def Expression
  "finite combination of symbols that are well-formed according to applicable rules"
  {:db/ident :fibo-fnd-utl-alx/Expression,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfs/label "expression",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-utl-alx/Variable,
                      :owl/onProperty :fibo-fnd-utl-alx/hasArgument,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-utl-alx/Constant,
                      :owl/onProperty :fibo-fnd-utl-alx/hasArgument,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-rel-rel/Reference],
   :skos/definition
   "finite combination of symbols that are well-formed according to applicable rules"})

(def FinitePopulation
  "population for which it is possible to count its units"
  {:cmns-av/adaptedFrom "http://stats.oecd.org/glossary/detail.asp?ID=3649",
   :cmns-av/explanatoryNote
   "In statistics, a population is a set of similar items or events of interest for some question or experiment. In other words, a population is the complete group of units to which survey results are to apply. (These units may be persons, animals, objects, businesses, trips, etc.). See http://www.statcan.gc.ca/edu/power-pouvoir/glossary-glossaire/5214842-eng.htm#p.",
   :db/ident :fibo-fnd-utl-alx/FinitePopulation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfs/label "finite population",
   :rdfs/subClassOf :cmns-col/Collection,
   :skos/definition "population for which it is possible to count its units"})

(def Formula
  "rule expressed in letters and symbols that consists of at least one expression"
  {:cmns-av/synonym "complex expression",
   :db/ident :fibo-fnd-utl-alx/Formula,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfs/label "formula",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-utl-alx/hasExpression,
                      :owl/someValuesFrom :fibo-fnd-utl-alx/Expression,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-rel-rel/Reference],
   :skos/definition
   "rule expressed in letters and symbols that consists of at least one expression"})

(def GeometricMean
  "mean that indicates the central tendency or typical value of a set of numbers by using the product of their values (as opposed to the arithmetic mean which uses their sum)"
  {:cmns-av/explanatoryNote
   "The geometric mean is defined as the nth root of the product of n numbers. A geometric mean is often used when comparing different items - finding a single 'figure of merit' for these items - when each item has multiple properties that have different numeric ranges. For example, the geometric mean can give a meaningful 'average' to compare two companies which are each rated at 0 to 5 for their environmental sustainability, and are rated at 0 to 100 for their financial viability. If an arithmetic mean were used instead of a geometric mean, the financial viability is given more weight because its numeric range is larger - so a small percentage change in the financial rating (e.g. going from 80 to 90) makes a much larger difference in the arithmetic mean than a large percentage change in environmental sustainability (e.g. going from 2 to 5).",
   :db/ident :fibo-fnd-utl-alx/GeometricMean,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfs/label "geometric mean",
   :rdfs/subClassOf :fibo-fnd-utl-alx/Mean,
   :skos/definition
   "mean that indicates the central tendency or typical value of a set of numbers by using the product of their values (as opposed to the arithmetic mean which uses their sum)"})

(def Mean
  "most common measure of central tendency; the average of a set of numbers"
  {:cmns-av/adaptedFrom
   ["http://www.statcan.gc.ca/edu/power-pouvoir/glossary-glossaire/5214842-eng.htm#m"
    "https://stats.oecd.org/glossary/detail.asp?ID=3762"],
   :cmns-av/explanatoryNote
   "When unqualified, the mean usually refers to the expectation of a variate, or to the arithmetic mean of a sample used as an estimate of the expectation.",
   :cmns-av/symbol "μ",
   :cmns-av/synonym ["expected value" "first (raw) moment"],
   :db/ident :fibo-fnd-utl-alx/Mean,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfs/label "mean",
   :rdfs/subClassOf [:fibo-fnd-utl-alx/Expression
                     :fibo-fnd-utl-alx/StatisticalMeasure
                     {:owl/onProperty     :fibo-fnd-utl-alx/hasObservedValue,
                      :owl/someValuesFrom :cmns-col/StructuredCollection,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   "most common measure of central tendency; the average of a set of numbers"})

(def Measure
  "amount or degree of something; the dimensions, capacity, or amount of something ascertained by measuring"
  {:cmns-av/adaptedFrom "https://stats.oecd.org/glossary/detail.asp?ID=7062",
   :cmns-av/explanatoryNote
   "Measure refers to the phenomenon or phenomena to be measured in a data set. In a data set, the instance of a measure is often called an observation.",
   :db/ident :fibo-fnd-utl-alx/Measure,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfs/label "measure",
   :rdfs/subClassOf :fibo-fnd-rel-rel/Reference,
   :skos/definition
   "amount or degree of something; the dimensions, capacity, or amount of something ascertained by measuring"})

(def Median
  "value of the variate dividing the total frequency of a data sample, population, or probability distribution, into two halves"
  {:cmns-av/adaptedFrom "https://stats.oecd.org/glossary/detail.asp?ID=3717",
   :cmns-av/explanatoryNote
   ["This measure represents the middle value (if n is odd) or the average of the two middle values (if n is even) in an ordered list of data values. The median divides the total frequency distribution into two equal parts: one-half of the cases fall below the median and one-half of the cases exceed the median."
    "The basic advantage of the median in describing data compared to the mean is that it is not skewed by extremely large or small values, and may provide a better idea of a 'typical' value."],
   :db/ident :fibo-fnd-utl-alx/Median,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfs/label "median",
   :rdfs/subClassOf [:fibo-fnd-utl-alx/StatisticalMeasure
                     {:owl/onProperty     :fibo-fnd-utl-alx/hasObservedValue,
                      :owl/someValuesFrom :cmns-col/StructuredCollection,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-utl-alx/Expression],
   :skos/definition
   "value of the variate dividing the total frequency of a data sample, population, or probability distribution, into two halves"})

(def MedianAbsoluteDeviation
  "median of the absolute deviations of observations from the average which may be the arithmetic mean, the median or the mode"
  {:db/ident :fibo-fnd-utl-alx/MedianAbsoluteDeviation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfs/label "median absolute deviation",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-utl-alx/hasArgument,
                      :owl/someValuesFrom :fibo-fnd-utl-alx/Median,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-utl-alx/Dispersion],
   :skos/definition
   "median of the absolute deviations of observations from the average which may be the arithmetic mean, the median or the mode"})

(def NumericIndexValue
  "numeric value of some aggregate relative to the value of that aggregate as of some date"
  {:cmns-av/adaptedFrom
   "http://www.statcan.gc.ca/edu/power-pouvoir/glossary-glossaire/5214842-eng.htm#i",
   :cmns-av/explanatoryNote
   "A mathematical device or number which is used to express the observation (e.g., price level, volume of trade, relative amount etc.) of a given period, in comparison with that of a prior period.",
   :db/ident :fibo-fnd-utl-alx/NumericIndexValue,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfs/label "numeric index value",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :cmns-dt/CombinedDateTime,
                      :owl/onProperty  :fibo-fnd-utl-alx/hasMeasurementDateTime,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-utl-alx/ScopedMeasure,
                      :owl/onProperty :fibo-fnd-utl-alx/isValueOf,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-qt-qtu/QuantityValue],
   :skos/definition
   "numeric value of some aggregate relative to the value of that aggregate as of some date"})

(def Percentage
  "ratio value expressed as a fraction of 100, i.e., in which the denominator is fixed rather than variable and equal to 100"
  {:cmns-av/explanatoryNote
   ["While many percentage values are between 0 and 100, there is no mathematical restriction and percentages may take on other values (positive or negative), particularly in the case of comparisons (percent change)."
    "The percent value is computed by multiplying the numeric value of the ratio by 100."],
   :db/ident :fibo-fnd-utl-alx/Percentage,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfs/label "percentage",
   :rdfs/subClassOf :fibo-fnd-utl-alx/RatioValue,
   :skos/definition
   "ratio value expressed as a fraction of 100, i.e., in which the denominator is fixed rather than variable and equal to 100"})

(def QualifiedMeasure
  "statistical measure that is constrained by features, quantity kinds or units that refine how it is calculated"
  {:db/ident :fibo-fnd-utl-alx/QualifiedMeasure,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfs/label "qualified measure",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onDataRange {:owl/unionOf [:xsd/string :xsd/anyURI],
                                        :rdf/type    :rdfs/Datatype},
                      :owl/onProperty
                      :fibo-fnd-utl-alx/isCalculatedViaMethodology,
                      :rdf/type :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :cmns-dt/ExplicitDate,
                      :owl/onProperty :fibo-fnd-utl-alx/hasAnchorDate,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-utl-alx/StatisticalMeasure],
   :skos/definition
   "statistical measure that is constrained by features, quantity kinds or units that refine how it is calculated"})

(def Ratio
  "proportional relationship between two different numbers or quantities, or in mathematics a quotient of two numbers or expressions, arrived at by dividing one by the other"
  {:cmns-av/adaptedFrom
   ["https://www150.statcan.gc.ca/n1/edu/power-pouvoir/glossary-glossaire/5214842-eng.htm#r."
    "https://stats.oecd.org/glossary/detail.asp?ID=6688"],
   :cmns-av/explanatoryNote
   "A ratio is a quantity measured with respect to some other quantity.",
   :cmns-av/synonym "rate",
   :db/ident :fibo-fnd-utl-alx/Ratio,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfs/label "ratio",
   :rdfs/subClassOf [:fibo-fnd-utl-alx/StatisticalMeasure
                     :fibo-fnd-utl-alx/Expression],
   :skos/definition
   "proportional relationship between two different numbers or quantities, or in mathematics a quotient of two numbers or expressions, arrived at by dividing one by the other"})

(def RatioValue
  "proportional relationship specifically between two different quantity values that gives rise to a datum of a specific quantity type"
  {:db/ident :fibo-fnd-utl-alx/RatioValue,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfs/label "ratio value",
   :rdfs/subClassOf [{:owl/onClass    :fibo-fnd-utl-alx/Variable,
                      :owl/onProperty :fibo-fnd-utl-alx/hasArgument,
                      :owl/qualifiedCardinality 2,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-qt-qtu/QuantityValue],
   :skos/definition
   "proportional relationship specifically between two different quantity values that gives rise to a datum of a specific quantity type"})

(def SamplingVariance
  "measure of the extent to which the estimate of a characteristic from different possible samples of the same size and the same design differ from one another"
  {:cmns-av/adaptedFrom
   ["https://stats.oecd.org/glossary/detail.asp?ID=3834"
    "http://www.statcan.gc.ca/pub/12-587-x/12-587-x2003001-eng.pdf"],
   :cmns-av/explanatoryNote
   "The word 'sampling' can usually be omitted, as being defined by the context or otherwise understood. The sampling variance of a statistic is the square of its standard error.",
   :db/ident :fibo-fnd-utl-alx/SamplingVariance,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfs/label "sampling variance",
   :rdfs/subClassOf :fibo-fnd-utl-alx/Variance,
   :skos/definition
   "measure of the extent to which the estimate of a characteristic from different possible samples of the same size and the same design differ from one another"})

(def ScopedMeasure
  "qualified measure that is constrained by filters on the statistical population to which it applies"
  {:cmns-av/explanatoryNote
   "Note that (1) the anchor date reflects the start of the current series, such as 1982-1984 for the CPI, (2) the fixed comparative date might be something like March 2009, if one is comparing a current index against its value at the end of the great recession, (3) the relative comparative date might be something like a month or year ago, depending on the analysis requirements, and (4) the relative comparative period might be a 3 month average prior value, again depending on the analysis requirements.",
   :db/ident :fibo-fnd-utl-alx/ScopedMeasure,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfs/label "scoped measure",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-utl-alx/StatisticalArea,
                      :owl/onProperty :fibo-fnd-plc-loc/hasCoverageArea,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-utl-alx/FinitePopulation,
                      :owl/onProperty :cmns-cxtdsg/appliesTo,
                      :rdf/type       :owl/Restriction}
                     {:owl/allValuesFrom :fibo-fnd-dt-fd/RecurrenceInterval,
                      :owl/onProperty    :fibo-fnd-utl-alx/hasPeriodicity,
                      :rdf/type          :owl/Restriction}
                     :fibo-fnd-utl-alx/QualifiedMeasure],
   :skos/definition
   "qualified measure that is constrained by filters on the statistical population to which it applies"})

(def StandardDeviation
  "square root of variance that measures the spread or dispersion around the mean of a data set"
  {:cmns-av/abbreviation "SD",
   :cmns-av/adaptedFrom
   ["http://www.statcan.gc.ca/edu/power-pouvoir/glossary-glossaire/5214842-eng.htm#s"
    "https://stats.oecd.org/glossary/detail.asp?ID=3845"],
   :cmns-av/explanatoryNote
   ["The most widely used measure of dispersion of a frequency distribution introduced by K. Pearson (1893). It is equal to the positive square root of the variance. The standard deviation should not be confused with the root mean square deviation."
    "While standard deviation is the most widely-used measure of spread, using squared deviations, it may not be the most robust."],
   :cmns-av/symbol "σ",
   :db/ident :fibo-fnd-utl-alx/StandardDeviation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfs/label "standard deviation",
   :rdfs/subClassOf [:fibo-fnd-utl-alx/Dispersion
                     {:owl/onProperty     :fibo-fnd-utl-alx/hasArgument,
                      :owl/someValuesFrom {:owl/unionOf
                                           [:fibo-fnd-utl-alx/Mean
                                            :fibo-fnd-utl-alx/Variance],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   "square root of variance that measures the spread or dispersion around the mean of a data set"})

(def StatisticalArea
  "physical location that is defined per some program for designating geographic regions for the purposes of tabulating and presenting statistical data"
  {:cmns-av/adaptedFrom
   ["U.S. Bureau of Labor Statistics and Statistics Canada reference definitions - https://wiki.edmcouncil.org/pages/viewpage.action?pageId=6358041"
    "U.S. Bureau of Labor Statistics and Statistics Canada reference definitions - https://wiki.edmcouncil.org/display/IND/Statistics+Canada+Census+Information"],
   :db/ident :fibo-fnd-utl-alx/StatisticalArea,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfs/label "statistical area",
   :rdfs/subClassOf [{:owl/onProperty :cmns-id/isIdentifiedBy,
                      :owl/someValuesFrom
                      :fibo-fnd-utl-alx/StatisticalAreaIdentifier,
                      :rdf/type :owl/Restriction}
                     :lcc-cr/GeographicRegion],
   :skos/definition
   "physical location that is defined per some program for designating geographic regions for the purposes of tabulating and presenting statistical data"})

(def StatisticalAreaIdentifier
  "identifier for a physical location that is defined per a nationally consistent program for designating geographic regions for the purposes of tabulating and presenting statistical data"
  {:cmns-av/adaptedFrom
   ["U.S. Bureau of Labor Statistics and Statistics Canada reference definitions - https://wiki.edmcouncil.org/pages/viewpage.action?pageId=6358041"
    "U.S. Bureau of Labor Statistics and Statistics Canada reference definitions - https://wiki.edmcouncil.org/display/IND/Statistics+Canada+Census+Information"],
   :db/ident :fibo-fnd-utl-alx/StatisticalAreaIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfs/label "statistical area identifier",
   :rdfs/subClassOf [{:owl/onClass    :fibo-fnd-utl-alx/StatisticalArea,
                      :owl/onProperty :cmns-id/identifies,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :lcc-cr/GeographicRegionIdentifier],
   :skos/definition
   "identifier for a physical location that is defined per a nationally consistent program for designating geographic regions for the purposes of tabulating and presenting statistical data"})

(def StatisticalMeasure
  "summary (means, mode, total, index, etc.) of the individual quantitative variable values for the statistical units in a specific group (study domain)"
  {:cmns-av/adaptedFrom "http://stats.oecd.org/glossary/detail.asp?ID=5068",
   :cmns-av/explanatoryNote
   "Statistical measures may consist of several orthogonal characteristics, including (a) whether they reflect an estimate or variable, (b) the datatype, or from a FIBO perspective, nature of the measure (e.g., index, total, ratio, percent, percent change, mean, others), (c) the population (or the universe that applies to the highest level if defined in general) to which the measure applies, and (d) any relevant aspects used to subset or stratify a measure, (i.e., make them apply to a smaller universe).",
   :db/ident :fibo-fnd-utl-alx/StatisticalMeasure,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfs/label "statistical measure",
   :rdfs/subClassOf [{:owl/onDataRange :xsd/boolean,
                      :owl/onProperty  :fibo-fnd-utl-alx/isEstimate,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :cmns-cls/Aspect,
                      :owl/onProperty :cmns-cls/isCharacterizedBy,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-utl-alx/Measure],
   :skos/definition
   "summary (means, mode, total, index, etc.) of the individual quantitative variable values for the statistical units in a specific group (study domain)"})

(def StatisticalPopulation
  "statistical universe filtered by time and region"
  {:cmns-av/adaptedFrom "http://stats.oecd.org/glossary/detail.asp?ID=2079",
   :cmns-av/explanatoryNote
   "A common aim of statistical analysis is to produce information about some chosen population. In statistical inference, a subset of the population (a statistical sample) is chosen to represent the population in a statistical analysis. If a sample is chosen properly, characteristics of the entire population that the sample is drawn from can be estimated from corresponding characteristics of the sample.",
   :db/ident :fibo-fnd-utl-alx/StatisticalPopulation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfs/label "statistical population",
   :rdfs/subClassOf [{:owl/allValuesFrom :xsd/nonNegativeInteger,
                      :owl/onProperty    :fibo-fnd-utl-alx/hasPopulationSize,
                      :rdf/type          :owl/Restriction}
                     {:owl/onProperty     :cmns-cls/isCharacterizedBy,
                      :owl/someValuesFrom :cmns-dt/ExplicitDatePeriod,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :cmns-cls/isCharacterizedBy,
                      :owl/someValuesFrom :fibo-fnd-utl-alx/StatisticalArea,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-utl-alx/FinitePopulation
                     :fibo-fnd-utl-alx/StatisticalUniverse],
   :skos/definition "statistical universe filtered by time and region"})

(def StatisticalProgram
  "program that presents a detailed investigation and analysis of a subject or situation involving one or more studies or surveys"
  {:db/ident :fibo-fnd-utl-alx/StatisticalProgram,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfs/label "statistical program",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-fnd-utl-alx/StatisticalUniverse,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-rel-rel/provides,
                      :owl/someValuesFrom :fibo-fnd-utl-alx/StatisticalMeasure,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-plc-loc/hasCoverageArea,
                      :owl/someValuesFrom :fibo-fnd-utl-alx/StatisticalArea,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-gao-obj/Program],
   :skos/definition
   "program that presents a detailed investigation and analysis of a subject or situation involving one or more studies or surveys"})

(def StatisticalUniverse
  "collection representing the total membership, or 'universe', of people, resources, products, services, events, or entities of interest for some question, experiment, survey or statistical program"
  {:cmns-av/adaptedFrom "http://stats.oecd.org/glossary/detail.asp?ID=2087",
   :db/ident :fibo-fnd-utl-alx/StatisticalUniverse,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfs/label "statistical universe",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-cxtdsg/isApplicableIn,
                      :owl/someValuesFrom :fibo-fnd-utl-alx/StatisticalProgram,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :xsd/nonNegativeInteger,
                      :owl/onProperty    :fibo-fnd-utl-alx/hasUniverseSize,
                      :rdf/type          :owl/Restriction}
                     :cmns-col/Collection],
   :skos/definition
   "collection representing the total membership, or 'universe', of people, resources, products, services, events, or entities of interest for some question, experiment, survey or statistical program",
   :skos/example
   "A statistical universe can be a group of actually existing objects (e.g. the set of all stars within the Milky Way galaxy) or a hypothetical and potentially infinite group of objects conceived as a generalization from experience (e.g. the set of all possible hands in a game of poker)."})

(def Total
  "sum of the values for some characteristic of all units"
  {:db/ident :fibo-fnd-utl-alx/Total,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfs/label "total",
   :rdfs/subClassOf [:fibo-fnd-utl-alx/StatisticalMeasure
                     :fibo-fnd-utl-alx/Expression],
   :skos/definition "sum of the values for some characteristic of all units"})

(def Variable
  "symbol that represents a parameter in a formula or expression"
  {:db/ident :fibo-fnd-utl-alx/Variable,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfs/label "variable",
   :rdfs/subClassOf [:cmns-cls/Aspect :fibo-fnd-rel-rel/Reference],
   :skos/definition
   "symbol that represents a parameter in a formula or expression"})

(def Variance
  "measure of spread, calculated as the average squared deviation of each number from the mean of a data set"
  {:cmns-av/adaptedFrom
   "http://www.statcan.gc.ca/edu/power-pouvoir/glossary-glossaire/5214842-eng.htm#v",
   :cmns-av/symbol ["μ2" "σ2"],
   :cmns-av/synonym "second moment",
   :db/ident :fibo-fnd-utl-alx/Variance,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfs/label "variance",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-utl-alx/hasArgument,
                      :owl/someValuesFrom :fibo-fnd-utl-alx/Mean,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-utl-alx/Dispersion],
   :skos/definition
   "measure of spread, calculated as the average squared deviation of each number from the mean of a data set"})

(def WeightingFunction
  "expression or function that determines the relative importance or influence of a given element of a set with respect to the whole"
  {:cmns-av/explanatoryNote
   ["With respect to discrete calculations, weighting functions are positive functions defined on discrete sets, such as weighted sums and weighted averages."
    "For certain indices, one of the most common weighting factor is by market capitalization. In that case, each of the elements in the basket is multiplied by its market cap to determine its relative importance to the basket overall."],
   :db/ident :fibo-fnd-utl-alx/WeightingFunction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfs/label "weighting function",
   :rdfs/subClassOf [:fibo-fnd-utl-alx/StatisticalMeasure
                     :fibo-fnd-utl-alx/Expression],
   :skos/definition
   "expression or function that determines the relative importance or influence of a given element of a set with respect to the whole",
   :skos/example
   "Given a sample size of 1000, and a population of 300M, then the chance that any individual is selected is 1 in 300K. In that case, 300K is the weight assigned to each of the elements in the sample."})

(def actualExpression
  "specifies the calculation or expression used to determine the value of something"
  {:cmns-av/explanatoryNote
   "In cases where some expression can only be calculated in SPARQL or via rules, this property is useful for stating what that calculation should be using the input arguments to the expression.",
   :db/ident :fibo-fnd-utl-alx/actualExpression,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfs/label "actual expression",
   :rdfs/range :xsd/string,
   :skos/definition
   "specifies the calculation or expression used to determine the value of something"})

(def hasAnchorDate
  "specifies the base date against which the value of a numeric index for a more recent date is compared (i.e., the starting point from which it stems)"
  {:db/ident :fibo-fnd-utl-alx/hasAnchorDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfs/label "has anchor date",
   :rdfs/range :cmns-dt/ExplicitDate,
   :rdfs/subPropertyOf :cmns-dt/hasExplicitDate,
   :skos/definition
   "specifies the base date against which the value of a numeric index for a more recent date is compared (i.e., the starting point from which it stems)"})

(def hasApplicableDatePeriod
  "indicates the date period for which the statistical measure is applicable"
  {:db/ident :fibo-fnd-utl-alx/hasApplicableDatePeriod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-utl-alx/StatisticalMeasure,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfs/label "has applicable date period",
   :rdfs/range :cmns-dt/DatePeriod,
   :rdfs/subPropertyOf :cmns-dt/hasDatePeriod,
   :skos/definition
   "indicates the date period for which the statistical measure is applicable"})

(def hasArgument
  "indicates a specific input to a function, formula or expression, also known as an independent variable"
  {:cmns-av/synonym "has independent variable",
   :db/ident :fibo-fnd-utl-alx/hasArgument,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfs/label "has argument",
   :rdfs/range :fibo-fnd-utl-alx/Variable,
   :rdfs/subPropertyOf :cmns-cls/isCharacterizedBy,
   :skos/definition
   "indicates a specific input to a function, formula or expression, also known as an independent variable"})

(def hasExpression
  "specifies a mathematical or other formal expression, which may be part of a formula"
  {:db/ident :fibo-fnd-utl-alx/hasExpression,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-rel-rel/Reference,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfs/label "has expression",
   :rdfs/range :fibo-fnd-utl-alx/Expression,
   :rdfs/subPropertyOf :cmns-cls/isCharacterizedBy,
   :skos/definition
   "specifies a mathematical or other formal expression, which may be part of a formula"})

(def hasFixedComparativeDate
  "specifies the a specific date, such as the end of the last recession (e.g., March 2009) against which the scoped measure is compared"
  {:db/ident :fibo-fnd-utl-alx/hasFixedComparativeDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfs/label "has fixed comparative date",
   :rdfs/range :cmns-dt/ExplicitDate,
   :rdfs/subPropertyOf :cmns-dt/hasExplicitDate,
   :skos/definition
   "specifies the a specific date, such as the end of the last recession (e.g., March 2009) against which the scoped measure is compared"})

(def hasFormula
  "specifies a concise way of expressing information symbolically, as in a mathematical or chemical formula"
  {:db/ident :fibo-fnd-utl-alx/hasFormula,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfs/label "has formula",
   :rdfs/range :fibo-fnd-utl-alx/Formula,
   :rdfs/subPropertyOf :cmns-cls/isCharacterizedBy,
   :skos/definition
   "specifies a concise way of expressing information symbolically, as in a mathematical or chemical formula"})

(def hasMeasurementDateTime
  "indicates the date and time that the measurement was taken"
  {:db/ident :fibo-fnd-utl-alx/hasMeasurementDateTime,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfs/label "has measurement date time",
   :rdfs/range :cmns-dt/CombinedDateTime,
   :skos/definition
   "indicates the date and time that the measurement was taken"})

(def hasMeasurementPeriodInMonths
  "indicates the coverage period for which the measure is applicable expressed in months"
  {:db/ident :fibo-fnd-utl-alx/hasMeasurementPeriodInMonths,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfs/label "has measurement period in months",
   :rdfs/range :xsd/integer,
   :skos/definition
   "indicates the coverage period for which the measure is applicable expressed in months"})

(def hasMinuend
  "specifies the quantity value from which something is subtracted; the value that is diminished"
  {:db/ident :fibo-fnd-utl-alx/hasMinuend,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-utl-alx/Difference,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfs/label "has minuend",
   :rdfs/subPropertyOf :fibo-fnd-utl-alx/hasArgument,
   :skos/definition
   "specifies the quantity value from which something is subtracted; the value that is diminished"})

(def hasNumberOfEntries
  "indicates the number of elements in some document, table, or other resource (e.g., in a report, table)"
  {:db/ident :fibo-fnd-utl-alx/hasNumberOfEntries,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfs/label "has number of entries",
   :rdfs/range :xsd/nonNegativeInteger,
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasCount,
   :skos/definition
   "indicates the number of elements in some document, table, or other resource (e.g., in a report, table)"})

(def hasObservedValue
  "specifies a collection of values over which some analysis is performed"
  {:cmns-av/explanatoryNote
   "For certain calculations, such as certain measures of dispersion, date value pairs are expected as input, in other words, a dated structured collection.",
   :db/ident :fibo-fnd-utl-alx/hasObservedValue,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfs/label "has observed value",
   :rdfs/range :cmns-col/StructuredCollection,
   :rdfs/subPropertyOf :fibo-fnd-utl-alx/hasArgument,
   :skos/definition
   "specifies a collection of values over which some analysis is performed"})

(def hasPeriodicity
  "specifies a recurrence interval (monthly, quarterly, annual) that a statistical measure reflects"
  {:db/ident :fibo-fnd-utl-alx/hasPeriodicity,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfs/label "has periodicity",
   :rdfs/range :fibo-fnd-dt-fd/RecurrenceInterval,
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasRecurrenceInterval,
   :skos/definition
   "specifies a recurrence interval (monthly, quarterly, annual) that a statistical measure reflects"})

(def hasPopulationSize
  "indicates the number of elements in a given population"
  {:db/ident :fibo-fnd-utl-alx/hasPopulationSize,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfs/label "has population size",
   :rdfs/range :xsd/nonNegativeInteger,
   :rdfs/subPropertyOf :fibo-fnd-arr-arr/hasCollectionSize,
   :skos/definition "indicates the number of elements in a given population"})

(def hasReferencePeriod
  "specifies a reference (baseline) recurrence interval for which a given measure applies"
  {:db/ident :fibo-fnd-utl-alx/hasReferencePeriod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfs/label "has reference period",
   :rdfs/range :fibo-fnd-dt-fd/RecurrenceInterval,
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasRecurrenceInterval,
   :skos/definition
   "specifies a reference (baseline) recurrence interval for which a given measure applies"})

(def hasRelativeComparativeDate
  "specifies a date against which the value of a scoped measure is compared (e.g., one month prior, three months prior, etc., and typically against a prior release or average over prior releases)"
  {:db/ident :fibo-fnd-utl-alx/hasRelativeComparativeDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfs/label "has relative comparative date",
   :rdfs/range :fibo-fnd-dt-fd/RelativeDate,
   :rdfs/subPropertyOf :cmns-dt/hasDate,
   :skos/definition
   "specifies a date against which the value of a scoped measure is compared (e.g., one month prior, three months prior, etc., and typically against a prior release or average over prior releases)"})

(def hasRelativeComparativePeriod
  "specifies a period (typically a prior period) against which the scoped measure is compared, such as an average set of values for some period of time compared with a more recent or projected average for a forward looking period of time"
  {:db/ident :fibo-fnd-utl-alx/hasRelativeComparativePeriod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfs/label "has relative comparative period",
   :rdfs/range :cmns-dt/DatePeriod,
   :rdfs/subPropertyOf :cmns-dt/hasDatePeriod,
   :skos/definition
   "specifies a period (typically a prior period) against which the scoped measure is compared, such as an average set of values for some period of time compared with a more recent or projected average for a forward looking period of time"})

(def hasReleaseDate
  "specifies the date on which something is published"
  {:cmns-av/explanatoryNote
   "A release date is typically a date fixed in advance for the release of a film, recording, document, report, or product or publication.",
   :db/ident :fibo-fnd-utl-alx/hasReleaseDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfs/label "has release date",
   :rdfs/range :cmns-dt/Date,
   :rdfs/subPropertyOf :cmns-dt/hasDate,
   :skos/definition "specifies the date on which something is published"})

(def hasReleaseDateTime
  "specifies the date and time on which something is published"
  {:db/ident :fibo-fnd-utl-alx/hasReleaseDateTime,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfs/label "has release date and time",
   :rdfs/range :cmns-dt/CombinedDateTime,
   :skos/definition
   "specifies the date and time on which something is published"})

(def hasSubtrahend
  "specifies the quantity value that is subtracted from something"
  {:db/ident :fibo-fnd-utl-alx/hasSubtrahend,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-utl-alx/Difference,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfs/label "has subtrahend",
   :rdfs/subPropertyOf :fibo-fnd-utl-alx/hasArgument,
   :skos/definition
   "specifies the quantity value that is subtracted from something"})

(def hasUniverseSize
  "indicates the number of elements in a given universe"
  {:db/ident :fibo-fnd-utl-alx/hasUniverseSize,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfs/label "has universe size",
   :rdfs/range :xsd/nonNegativeInteger,
   :rdfs/subPropertyOf :fibo-fnd-arr-arr/hasCollectionSize,
   :skos/definition "indicates the number of elements in a given universe"})

(def hasWeight
  "indicates an amount given to increase or decrease the importance of an item"
  {:db/ident :fibo-fnd-utl-alx/hasWeight,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfs/label "has weight",
   :rdfs/range :xsd/decimal,
   :rdfs/subPropertyOf :fibo-fnd-qt-qtu/hasNumericValue,
   :skos/definition
   "indicates an amount given to increase or decrease the importance of an item"})

(def isCalculatedViaMethodology
  "high-level description of the approach taken to obtain the result"
  {:db/ident :fibo-fnd-utl-alx/isCalculatedViaMethodology,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-fnd-utl-alx/StatisticalMeasure,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfs/label "is calculated via methodology",
   :skos/definition
   "high-level description of the approach taken to obtain the result"})

(def isEstimate
  "indicates whether the measure reflects an estimate (approximation) or not"
  {:db/ident :fibo-fnd-utl-alx/isEstimate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-fnd-utl-alx/StatisticalMeasure,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfs/label "is estimate",
   :rdfs/range :xsd/boolean,
   :skos/definition
   "indicates whether the measure reflects an estimate (approximation) or not"})

(def isValueOf
  "is the measure that the value represents"
  {:db/ident :fibo-fnd-utl-alx/isValueOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-qt-qtu/QuantityValue,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfs/label "is value of",
   :rdfs/subPropertyOf :cmns-cxtdsg/appliesTo,
   :skos/definition "is the measure that the value represents"})

(def ^{:private true} Quantity
  {:db/ident        :fibo-fnd-qt-qtu/Quantity,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :fibo-fnd-utl-alx/Measure})