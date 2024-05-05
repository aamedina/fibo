(ns net.wikipunk.rdf.cmns-qtu
  {:cmns-av/copyright #{"Copyright (c) 2015-2023 EDM Council, Inc."
                        "Copyright (c) 2023 DEKonsult"
                        "Copyright (c) 2015-2023 Object Management Group, Inc."
                        "Copyright (c) 2023 University of North Florida"
                        "Copyright (c) 2023 Mayo Clinic"
                        "Copyright (c) 2011-2023 Thematix Partners LLC"},
   :dcterms/abstract
   "This ontology provides a core set of concepts for quantities, units, systems of quantities, and systems of units. The most widely accepted, scrutinized, and globally used system of quantities and system of units are the International System of Quantities (ISQ) and the International System of Units (SI). They are formally standardized through [ISO 31] and [IEC 60027]. The harmonization of these two sets of standards into one new set [ISO/IEC 80000] has been published by ISO in 2009 and 2010. This ontology is based on the Object Management Group (OMG)'s SysML standard and on ISO/IEC 80000-1:2009, which refers normatively to the ISO/IEC Guide 99:2007. It is compatible with and can be mapped directly to the OMG Date Time Vocabulary (DTV) Quantities Ontology, the de-facto QUDT ontology representing Units of Measure, Quantity Kinds, Dimensions and Data Types (see http://www.qudt.org/), the Units of Measurement Ontology (UO) ontology available from the BioPortal (https://bioportal.bioontology.org/ontologies/UO) and others, as well as the quantities and units library in the SysML specification.",
   :dcterms/contributor
   #{"Hans Peter de Koenig, DEKonsult"
     "Stuart Chalk, University of North Florida"
     "Evan Wallace, U.S. National Institute of Standards and Technology (NIST)"
     "Davide Sottara, Mayo Clinic" "Roger Burkhart, Thematix Partners LLC"
     "Elisa Kendall, Thematix Partners LLC"},
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :namespaces
   {"cmns-av"     "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cls"    "https://www.omg.org/spec/Commons/Classifiers/",
    "cmns-col"    "https://www.omg.org/spec/Commons/Collections/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-doc"    "https://www.omg.org/spec/Commons/Documents/",
    "cmns-dsg"    "https://www.omg.org/spec/Commons/Designators/",
    "cmns-qtu"    "https://www.omg.org/spec/Commons/QuantitiesAndUnits/",
    "dcterms"     "http://purl.org/dc/terms/",
    "owl"         "http://www.w3.org/2002/07/owl#",
    "rdf"         "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"        "http://www.w3.org/2000/01/rdf-schema#",
    "skos"        "http://www.w3.org/2004/02/skos/core#",
    "xsd"         "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/Documents/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://www.omg.org/spec/Commons/20230801/QuantitiesAndUnits/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "cmns-qtu",
   :rdfa/uri "https://www.omg.org/spec/Commons/QuantitiesAndUnits/",
   :rdfs/label "Commons Quantities and Units Ontology",
   :xsd/anyURI "https://www.omg.org/spec/Commons/QuantitiesAndUnits/"})

(def ArbitraryUnit
  {:db/ident :cmns-qtu/ArbitraryUnit,
   :dcterms/source
   {:rdf/value
    "ISO 11240 Health informatics - Identification of medicinal products - Data elements and structures for the unique identification and exchange of units of measurement, clause 3.1.1"},
   :owl/disjointWith :cmns-qtu/PhysicalUnit,
   :rdf/type :owl/Class,
   :rdfs/label "arbitrary unit",
   :rdfs/subClassOf #{:cmns-qtu/MeasurementUnit
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :cmns-qtu/MaterialMeasure,
                       :owl/onProperty :cmns-doc/refersTo,
                       :rdf/type       :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :cmns-qtu/ReferenceMaterial,
                       :owl/onProperty :cmns-doc/refersTo,
                       :rdf/type       :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :cmns-qtu/MeasurementProcedure,
                       :owl/onProperty :cmns-doc/refersTo,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "arbitrarily defined unit of measurement, where a relation of the unit to a physical unit of the SI does not exist or is unknown",
   :skos/note
   "Arbitrary units represent references to materials or procedures that are defined outside of the SI system. A quantity value is arbitrarily assigned to the reference preparation or the result of a measurement procedure, usually specific for a particular substance. This generally precludes comparability of quantity values across different systems and components for this type of units."})

(def BaseQuantityKind
  {:cmns-av/synonym #{"simple quantity kind" "base quantity"},
   :db/ident :cmns-qtu/BaseQuantityKind,
   :dcterms/source
   #{{:rdf/value
      "ISO 11240 Health informatics - Identification of medicinal products - Data elements and structures for the unique identification and exchange of units of measurement, clause 3.1.2"}
     {:xsd/anyURI "https://www.omg.org/spec/SysML/"}
     {:rdf/value
      "ISO 80000-1:2009 Quantities and units - Part 1: General, clause 3.4"}},
   :rdf/type :owl/Class,
   :rdfs/label "base quantity kind",
   :rdfs/subClassOf #{{:owl/onClass    :cmns-qtu/SystemOfQuantities,
                       :owl/onProperty :cmns-dsg/isDefinedIn,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      :cmns-qtu/QuantityKind},
   :skos/definition
   "quantity in a conventionally chosen subset of a given system of quantities, where no quantity in the subset can be expressed in terms of the other quantities within that subset",
   :skos/example
   "The International System of Quantities (ISQ) comprises these base quantities (with their SI base measurement units): length (meter), mass (kilogram), duration (second), electric current (ampere), thermodynamic temperature (kelvin), amount of substance (mole), and luminous intensity (candela). These base quantities are not mutually comparable. All quantities of any one of these kinds are, however, mutually comparable.",
   :skos/note
   "The subset mentioned in the definition is termed the 'set of base quantities'. Base quantities are referred to as being mutually independent since a base quantity cannot be expressed as a product of powers of the other base quantities."})

(def BaseUnit
  {:cmns-av/synonym "simple unit",
   :db/ident :cmns-qtu/BaseUnit,
   :dcterms/source
   #{{:rdf/value
      "ISO 11240 Health informatics - Identification of medicinal products - Data elements and structures for the unique identification and exchange of units of measurement, clause 3.1.3"}
     {:rdf/value
      "ISO 80000-1:2009 Quantities and units - Part 1: General, clause 3.10"}
     {:xsd/anyURI "https://www.omg.org/spec/SysML/"}},
   :rdf/type :owl/Class,
   :rdfs/label "base unit",
   :rdfs/subClassOf :cmns-qtu/PhysicalUnit,
   :skos/definition
   "measurement unit that is defined by a system of units to be the reference measurement unit for a base quantity",
   :skos/example
   "In the SI, the meter is the base unit of length. In the CGS systems, the centimeter is the base unit of length.",
   :skos/note
   "In each coherent system of units, there is only one base unit for each base quantity. A base unit may also serve for a derived quantity of the same quantity dimension."})

(def CoherentDerivedUnit
  {:db/ident :cmns-qtu/CoherentDerivedUnit,
   :dcterms/source
   #{{:rdf/value
      "ISO 80000-1:2009 Quantities and units - Part 1: General, clause 3.12"}
     {:rdf/value
      "ISO 11240 Health informatics - Identification of medicinal products - Data elements and structures for the unique identification and exchange of units of measurement, clause 3.1.4"}},
   :rdf/type :owl/Class,
   :rdfs/label "coherent derived unit",
   :rdfs/subClassOf :cmns-qtu/DerivedUnit,
   :skos/definition
   "derived unit that, for a given system of quantities and for a chosen set of base units, is a product of powers of base units with no other proportionality factor than one",
   :skos/example
   "If the meter, the second, and the mole are base units, the mole per cubic meter is the coherent derived unit of amount-of-substance concentration when amount-of-substance concentration is defined by the quantity equation c = n/V. The kilometer per hour and the knot, given as examples of derived units, are not coherent derived units in such a system of quantities.",
   :skos/note
   "A power of a base unit is the base unit raised to an exponent. Coherence can be determined only with respect to a particular system of quantities and a given set of base units."})

(def Constant
  {:db/ident :cmns-qtu/Constant,
   :rdf/type :owl/Class,
   :rdfs/label "constant",
   :rdfs/subClassOf :cmns-qtu/ScalarQuantityValue,
   :skos/definition
   "symbol that represents a value that does not change (i.e., is fixed) with respect to a formula or expression"})

(def ConversionBasedUnit
  {:db/ident :cmns-qtu/ConversionBasedUnit,
   :dcterms/source {:xsd/anyURI "https://www.omg.org/spec/SysML/"},
   :rdf/type :owl/Class,
   :rdfs/label "conversion-based unit",
   :rdfs/subClassOf #{{:owl/minQualifiedCardinality 0,
                       :owl/onClass    :cmns-qtu/Expression,
                       :owl/onProperty :cmns-qtu/hasExpression,
                       :rdf/type       :owl/Restriction} :cmns-qtu/DerivedUnit},
   :skos/definition
   "derived unit that is defined with respect to another reference unit through an explicit conversion relationship"})

(def ConversionFactorBetweenUnits
  {:db/ident :cmns-qtu/ConversionFactorBetweenUnits,
   :dcterms/source
   #{{:rdf/value
      "ISO 80000-1:2009 Quantities and units - Part 1: General, clause 3.24"}
     {:rdf/value
      "ISO 11240 Health informatics - Identification of medicinal products - Data elements and structures for the unique identification and exchange of units of measurement, clause 3.1.6"}},
   :rdf/type :owl/Class,
   :rdfs/label "conversion factor between units",
   :rdfs/subClassOf #{:cmns-qtu/Ratio
                      {:owl/onClass    :cmns-qtu/QuantityKind,
                       :owl/onProperty :cmns-qtu/hasQuantityKind,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction} :cmns-qtu/Factor},
   :skos/definition
   "ratio of two measurement units for quantities of the same kind"})

(def CyclicRatioScale
  {:db/ident :cmns-qtu/CyclicRatioScale,
   :dcterms/source {:xsd/anyURI "https://www.omg.org/spec/SysML/"},
   :rdf/type :owl/Class,
   :rdfs/label "cyclic ratio scale",
   :rdfs/subClassOf :cmns-qtu/RatioScale,
   :skos/definition
   "measurement scale that represents a ratio scale with a periodic cycle",
   :skos/example
   #{"'cyclic degree' (to express planar angular measures) with modulus = 360 and unit 'degree'"
     "'hour of day' with modulus = 24 and unit 'hour'"}})

(def DerivedQuantityKind
  {:db/ident :cmns-qtu/DerivedQuantityKind,
   :dcterms/source
   #{{:xsd/anyURI "https://www.omg.org/spec/SysML/"}
     {:rdf/value
      "ISO 80000-1:2009 Quantities and units - Part 1: General, clause 3.5"}
     {:rdf/value
      "ISO 11240 Health informatics - Identification of medicinal products - Data elements and structures for the unique identification and exchange of units of measurement, clause 3.1.7"}},
   :owl/disjointWith :cmns-qtu/BaseQuantityKind,
   :rdf/type :owl/Class,
   :rdfs/label "derived quantity kind",
   :rdfs/subClassOf #{{:owl/minQualifiedCardinality 0,
                       :owl/onClass    :cmns-qtu/QuantityKindPowerFactor,
                       :owl/onProperty :cmns-qtu/hasFactor,
                       :rdf/type       :owl/Restriction}
                      {:owl/onProperty     :cmns-qtu/isDerivedFrom,
                       :owl/someValuesFrom :cmns-qtu/QuantityKind,
                       :rdf/type           :owl/Restriction}
                      :cmns-qtu/QuantityKind},
   :skos/definition
   "quantity, in a system of quantities, defined in terms of the base quantities of that system",
   :skos/example
   "In a system of quantities having the base quantities length and mass, mass density is a derived quantity defined as the quotient of mass and volume (length to the power three)."})

(def DerivedUnit
  {:db/ident :cmns-qtu/DerivedUnit,
   :dcterms/source
   #{{:xsd/anyURI "https://www.omg.org/spec/SysML/"}
     {:rdf/value
      "ISO 11240 Health informatics - Identification of medicinal products - Data elements and structures for the unique identification and exchange of units of measurement, clause 3.1.8"}
     {:rdf/value
      "ISO 80000-1:2009 Quantities and units - Part 1: General, clause 3.11"}},
   :rdf/type :owl/Class,
   :rdfs/label "derived unit",
   :rdfs/subClassOf #{{:owl/minQualifiedCardinality 0,
                       :owl/onClass    :cmns-qtu/UnitPowerFactor,
                       :owl/onProperty :cmns-qtu/hasFactor,
                       :rdf/type       :owl/Restriction}
                      {:owl/onProperty     :cmns-qtu/isDerivedFrom,
                       :owl/someValuesFrom :cmns-qtu/BaseUnit,
                       :rdf/type           :owl/Restriction}
                      :cmns-qtu/PhysicalUnit},
   :skos/definition
   "measurement unit for a derived quantity, i.e., one that is defined with respect to one or more base units, such as as a product of powers of one or more other measurement units",
   :skos/example
   "The meter per second, symbol m/s, and the centimeter per second, symbol cm/s, are derived units of speed in the SI. The kilometer per hour, symbol km/h, is a measurement unit of speed outside the SI but accepted for use with the SI. The knot, equal to one nautical mile per hour, is a measurement unit of speed outside the SI."})

(def DimensionlessQuantity
  {:cmns-av/synonym "quantity of dimension one",
   :db/ident :cmns-qtu/DimensionlessQuantity,
   :dcterms/source
   #{{:rdf/value
      "ISO 11240 Health informatics - Identification of medicinal products - Data elements and structures for the unique identification and exchange of units of measurement, clause 3.1.10"}
     {:xsd/anyURI "https://www.omg.org/spec/SysML/"}
     {:rdf/value
      "ISO 80000-1:2009 Quantities and units - Part 1: General, clause 3.8"}},
   :rdf/type :owl/Class,
   :rdfs/label "dimensionless quantity",
   :rdfs/subClassOf :cmns-qtu/QuantityKind,
   :skos/definition
   "quantity for which all the exponents of the factors corresponding to the base quantities in its quantity dimension are zero",
   :skos/example
   "Plane angle, solid angle, refractive index, relative permeability, mass fraction, friction factor, Mach number",
   :skos/note
   #{"The measurement units and values of quantities of dimension one are numbers, but such quantities convey more information than a number."
     "Some quantities of dimension one are defined as the ratios of two quantities of the same kind. The coherent derived unit is the number one, symbol 1."
     "The term 'dimensionless quantity' is commonly used and is included for historical reasons. It stems from the fact that all exponents are zero in the symbolic representation of the dimension for such quantities. The term 'quantity of dimension one' reflects the convention in which the symbolic representation of the dimension for such quantities is the symbol 1. This dimension is not a number, but the neutral element for multiplication of dimensions."}})

(def Expression
  {:db/ident :cmns-qtu/Expression,
   :rdf/type :owl/Class,
   :rdfs/label "expression",
   :rdfs/subClassOf #{{:owl/minQualifiedCardinality 0,
                       :owl/onClass    :cmns-qtu/Variable,
                       :owl/onProperty :cmns-qtu/hasArgument,
                       :rdf/type       :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :cmns-qtu/Constant,
                       :owl/onProperty :cmns-qtu/hasArgument,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "finite combination of symbols that are well-formed according to applicable rules"})

(def Factor
  {:db/ident :cmns-qtu/Factor,
   :rdf/type :owl/Class,
   :rdfs/label "factor",
   :rdfs/subClassOf :cmns-cls/Aspect,
   :skos/definition
   "number or quantity that when multiplied with another produces a given number or expression"})

(def InternationalSystemOfQuantities
  {:cmns-av/abbreviation "ISQ",
   :db/ident :cmns-qtu/InternationalSystemOfQuantities,
   :dcterms/source
   {:rdf/value
    "ISO 80000-1:2009 Quantities and units - Part 1: General, clause 3.6"},
   :rdf/type #{:cmns-qtu/SystemOfQuantities :owl/NamedIndividual},
   :rdfs/label "International System of Quantities",
   :skos/definition
   "system of quantities based on the seven base quantities: length, mass, time, electric current, thermodynamic temperature, amount of substance, and luminous intensity",
   :skos/note
   #{"This system of quantities is published in the ISO 80000 and IEC 80000 series Quantities and units, Parts 3 to 14."
     "The International System of Units (SI) is based on the ISQ."}})

(def InternationalSystemOfUnits
  {:cmns-av/abbreviation "SI",
   :cmns-col/compliesWith :cmns-qtu/InternationalSystemOfQuantities,
   :db/ident :cmns-qtu/InternationalSystemOfUnits,
   :dcterms/source
   {:rdf/value
    "ISO 80000-1:2009 Quantities and units - Part 1: General, clause 3.16"},
   :rdf/type #{:owl/NamedIndividual :cmns-qtu/SystemOfUnits},
   :rdfs/label "International System of Units",
   :skos/definition
   "system of units, based on the International System of Quantities, their names and symbols, including a series of prefixes and their names and symbols, together with rules for their use, adopted by the General Conference on Weights and Measures (CGPM)",
   :skos/note
   "The SI is founded on the seven base quantities of the ISQ and the names and symbols of the corresponding base units. The base units and the coherent derived units of the SI form a coherent set, designated the 'set of coherent SI units'."})

(def IntervalScale
  {:db/ident :cmns-qtu/IntervalScale,
   :dcterms/source
   #{{:xsd/anyURI
      "https://www.statista.com/statistics-glossary/definition/320/interval_scale/"}
     {:xsd/anyURI "https://www.omg.org/spec/SysML/"}
     {:xsd/anyURI "https://plato.stanford.edu/entries/measurement-science/"}},
   :rdf/type :owl/Class,
   :rdfs/label "interval scale",
   :rdfs/subClassOf :cmns-qtu/MeasurementScale,
   :skos/definition
   "measurement scale that represents quantitative values and for which mode, median and mean can be calculated",
   :skos/example
   "Celsius and Fahrenheit are examples of interval scales: they represent equality or inequality among intervals of temperature, but not ratios of temperature, because their zero points are arbitrary. Rating scales, where it is assumed that the distances between the single expressions of evaluation (score) are equal, are also interval scales with no natural zero point.",
   :skos/note
   "Linear interval scales allow both multiplication by a positive number and a constant shift, e.g., the conversion from Celsius to Fahrenheit."})

(def LogarithmicScale
  {:db/ident :cmns-qtu/LogarithmicScale,
   :dcterms/source
   #{{:xsd/anyURI "https://www.omg.org/spec/SysML/"}
     {:xsd/anyURI "https://en.wikipedia.org/wiki/Logarithmic_scale/"}
     {:xsd/anyURI "https://plato.stanford.edu/entries/measurement-science/"}},
   :rdf/type :owl/Class,
   :rdfs/label "logarithmic scale",
   :rdfs/subClassOf :cmns-qtu/MeasurementScale,
   :skos/definition
   "measurement scale on which the actual distance of a point from the scale's zero is proportional to the logarithm of the corresponding scale number rather than to the number itself",
   :skos/example
   "A logarithmic scale (or log scale) is a way of displaying numerical data over a very wide range of values in a compact way - typically the largest numbers in the data are hundreds or even thousands of times larger than the smallest numbers. Such a scale is nonlinear: the numbers 10 and 20, and 60 and 70, are not the same distance apart on a log scale. Rather, the numbers 10 and 100, and 60 and 600 are equally spaced. Thus moving a unit of distance along the scale means the number has been multiplied by 10 (or some other fixed factor)."})

(def MaterialMeasure
  {:db/ident :cmns-qtu/MaterialMeasure,
   :dcterms/source
   {:rdf/value
    "ISO 11240 Health informatics - Identification of medicinal products - Data elements and structures for the unique identification and exchange of units of measurement, clause 3.1.14"},
   :rdf/type :owl/Class,
   :rdfs/label "material measure",
   :rdfs/subClassOf :cmns-qtu/Measure,
   :skos/definition
   "something that reproduces or supplies one or more quantities, each with an assigned quantity value",
   :skos/example "Ruler, standard weight, volume measure"})

(def Measure
  {:db/ident :cmns-qtu/Measure,
   :dcterms/source {:xsd/anyURI
                    "https://stats.oecd.org/glossary/detail.asp?ID=7062"},
   :rdf/type :owl/Class,
   :rdfs/label "measure",
   :skos/definition
   "amount or degree of something; the dimensions, capacity, or amount of something ascertained by measuring",
   :skos/note
   "Measure refers to the phenomenon or phenomena to be measured in a data set. In a data set, the instance of a measure is often called an observation."})

(def MeasurementProcedure
  {:cmns-av/abbreviation "SOP",
   :cmns-av/synonym "standard operating procedure",
   :db/ident :cmns-qtu/MeasurementProcedure,
   :dcterms/source
   {:rdf/value
    "ISO 11240 Health informatics - Identification of medicinal products - Data elements and structures for the unique identification and exchange of units of measurement, clause 3.1.16"},
   :rdf/type :owl/Class,
   :rdfs/label "measurement procedure",
   :rdfs/subClassOf :cmns-doc/ReferenceDocument,
   :skos/definition
   "detailed description of a measurement according to one or more measurement principles (i.e. phenomena, observables) and to a given measurement method, based on a measurement model and including any calculation to obtain a measurement result",
   :skos/example
   "Lowering of the concentration of glucose in blood in a fasting rabbit is an observable that can be applied to the measurement of insulin concentration in a preparation. Together with a description of the measurement method this can be used to define a measurement procedure.",
   :skos/note
   #{"A measurement procedure can include a statement concerning a target measurement uncertainty."
     "A measurement procedure is usually documented in sufficient detail to enable an operator to perform a measurement."}})

(def MeasurementScale
  {:cmns-av/synonym "quantity-value scale",
   :db/ident :cmns-qtu/MeasurementScale,
   :dcterms/source
   #{{:xsd/anyURI "https://www.omg.org/spec/SysML/"}
     {:rdf/value
      "ISO 80000-1:2009 Quantities and units - Part 1: General, clause 3.27"}
     {:xsd/anyURI "https://plato.stanford.edu/entries/measurement-science/"}},
   :rdf/type :owl/Class,
   :rdfs/label "measurement scale",
   :rdfs/subClassOf #{{:owl/minQualifiedCardinality 0,
                       :owl/onDataRange :xsd/boolean,
                       :owl/onProperty  :cmns-qtu/isMaximumInclusive,
                       :rdf/type        :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :cmns-qtu/ScalarQuantityValue,
                       :owl/onProperty :cmns-qtu/hasMinimumPermissiveValue,
                       :rdf/type       :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onDataRange :xsd/boolean,
                       :owl/onProperty  :cmns-qtu/isMinimumInclusive,
                       :rdf/type        :owl/Restriction}
                      {:owl/onProperty     :cmns-cls/classifies,
                       :owl/someValuesFrom :cmns-qtu/MeasurementUnit,
                       :rdf/type           :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :cmns-qtu/ScalarQuantityValue,
                       :owl/onProperty :cmns-qtu/hasMaximumPermissiveValue,
                       :rdf/type       :owl/Restriction}
                      :cmns-cls/ClassificationScheme},
   :skos/definition
   "ordered set of quantity values of quantities of a given kind of quantity used in ranking, according to magnitude, quantities of that kind",
   :skos/note
   "Note that the majority of scalar quantities can be expressed by just using a MeasurementUnit directly as its measurement reference. This implies expression of a scalar quantity value on a ratio scale. However, for full coverage of all quantity value expressions, additional explicit measurement scales with additional semantics are needed, such as ordinal scale, interval scale, ratio scale with additional limit values, cyclic ratio scale and logarithmic scale."})

(def MeasurementUnit
  {:cmns-av/synonym "unit of measurement",
   :db/ident :cmns-qtu/MeasurementUnit,
   :dcterms/source
   #{{:rdf/value
      "ISO 11240 Health informatics - Identification of medicinal products - Data elements and structures for the unique identification and exchange of units of measurement, clause 3.1.33"}
     {:rdf/value
      "ISO 80000-1:2009 Quantities and units - Part 1: General, clause 3.9"}
     {:xsd/anyURI "https://www.omg.org/spec/SysML/"}},
   :rdf/type :owl/Class,
   :rdfs/label "measurement unit",
   :rdfs/subClassOf #{{:owl/minQualifiedCardinality 0,
                       :owl/onClass    :cmns-qtu/UnitPowerFactor,
                       :owl/onProperty :cmns-qtu/hasFactor,
                       :rdf/type       :owl/Restriction}
                      :cmns-qtu/ScalarQuantity
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :cmns-qtu/MeasurementUnit,
                       :owl/onProperty :cmns-qtu/specializes,
                       :rdf/type       :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :cmns-qtu/SystemOfUnits,
                       :owl/onProperty :cmns-dsg/isDefinedIn,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "real scalar quantity, defined and adopted by convention, with which any other quantity of the same kind can be compared to express the ratio of the second quantity to the first one as a number",
   :skos/example "week, day, hour, minute, second, kilogram, joule, meter",
   :skos/note
   #{"For a given quantity, the short term 'unit' is often combined with the quantity name, such as 'mass unit' or 'unit of mass'."
     "Measurement units of quantities of the same quantity dimension may be designated by the same name and symbol even when the quantities are not of the same kind. For example, joule per kelvin and J/K are respectively the name and symbol of both a measurement unit of heat capacity and a measurement unit of entropy, which are generally not considered to be quantities of the same kind. However, in some cases special measurement unit names are restricted to be used with quantities of specific kind only. For example, the measurement unit 'second to the power minus one' (1/s) is called hertz (Hz) when used for frequencies and becquerel (Bq) when used for activities of radionuclides. As another example, the joule (J) is used as a unit of energy, but never as a unit of moment of force, i.e. the newton meter (N m)."
     "Depending on the nature of the reference scale, the unit of measurement expression may stand either for a physical unit of measurement that is related to a system of quantities (e.g. SI units) or for an arbitrarily defined unit of measurement, which may refer to a certain reference material, a standard measurement procedure, a material measure or even to a combination of those."
     "A Unit is a quantity in terms of which the magnitudes of other quantities that have the same quantity kind can be stated. A unit often relies on precise and reproducible ways to measure the unit. For example, a unit of length such as meter may be specified as a multiple of a particular wavelength of light. A unit may also specify less stable or precise ways to express some value, such as a cost expressed in some currency, or a severity rating measured by a numerical scale."
     "Measurement units of quantities of dimension one are numbers. In some cases, these measurement units are given special names, e.g. radian, steradian, and decibel, or are expressed by quotients such as millimole per mole equal to 10 to the power minus 3 and microgram per kilogram equal to 10 to the power minus 9."
     "Measurement units are designated by conventionally assigned names and symbols."}})

(def NominalScale
  {:db/ident :cmns-qtu/NominalScale,
   :dcterms/source
   #{{:xsd/anyURI "https://www.ncbi.nlm.nih.gov/pmc/articles/PMC4589638/"}
     {:xsd/anyURI "https://plato.stanford.edu/entries/measurement-science/"}},
   :rdf/type :owl/Class,
   :rdfs/label "nominal scale",
   :rdfs/subClassOf :cmns-qtu/MeasurementScale,
   :skos/definition
   "measurement scale that represents objects as belonging to classes that have no particular order",
   :skos/example
   "Many nominal scales are qualitative in nature. A common example of a nominal scale is that of gender identity, which is a way of describing one's persistent inner concept of their gender. While the terminology from a psychological and medical perspective continues to evolve, the scale covers individuals who self identify as male or female as well as those that have a less determinant perspective, such as transsexual or non-binary."})

(def OrdinalScale
  {:cmns-av/synonym #{"ordinal value scale" "ordinal quantity-value scale"},
   :db/ident :cmns-qtu/OrdinalScale,
   :dcterms/source
   #{{:xsd/anyURI "https://www.omg.org/spec/SysML/"}
     {:xsd/anyURI "https://plato.stanford.edu/entries/measurement-science/"}
     {:rdf/value
      "ISO 80000-1:2009 Quantities and units - Part 1: General, clause 3.28"}},
   :rdf/type :owl/Class,
   :rdfs/label "ordinal scale",
   :rdfs/subClassOf :cmns-qtu/MeasurementScale,
   :skos/definition
   "quantity-value scale for ordinal quantities, i.e., one that represents order but no further algebraic structure",
   :skos/example
   "For example, the Mohs scale of mineral hardness represents minerals with numbers ranging from 1 (softest) to 10 (hardest), but there is no empirical significance to equality among intervals or ratios of those numbers.",
   :skos/note
   #{"Ordinal scales allow any transformation function as long as it is monotonic and increasing."
     "An ordinal quantity-value scale may be established by measurements according to a measurement procedure."}})

(def Percentage
  {:db/ident :cmns-qtu/Percentage,
   :rdf/type :owl/Class,
   :rdfs/label "percentage",
   :rdfs/subClassOf :cmns-qtu/Ratio,
   :skos/definition
   "ratio value expressed as a fraction of 100, i.e., in which the denominator is fixed rather than variable and equal to 100",
   :skos/note
   #{"The percent value is computed by multiplying the numeric value of the ratio by 100."
     "While many percentage values are between 0 and 100, there is no mathematical restriction and percentages may take on other values (positive or negative), particularly in the case of comparisons (percent change)."}})

(def PhysicalUnit
  {:cmns-av/synonym "physical unit of measurement",
   :db/ident :cmns-qtu/PhysicalUnit,
   :dcterms/source
   {:rdf/value
    "ISO 11240 Health informatics - Identification of medicinal products - Data elements and structures for the unique identification and exchange of units of measurement, clause 3.1.21"},
   :rdf/type :owl/Class,
   :rdfs/label "physical unit",
   :rdfs/subClassOf #{:cmns-qtu/MeasurementUnit
                      {:owl/onProperty     :cmns-dsg/isDefinedIn,
                       :owl/someValuesFrom :cmns-qtu/SystemOfUnits,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "unit of measurement that is defined using a physical quantity",
   :skos/note
   #{"Its definition relates measured quantities to the base quantities through a set of well-defined equations."
     "Physical units and their related scales are defined independently of the measurement procedure and the measured components. They relate to an internationally standardized system of units and equations governing the mathematical relations between those units."}})

(def Prefix
  {:db/ident :cmns-qtu/Prefix,
   :dcterms/source
   {:rdf/value
    "ISO 11240 Health informatics - Identification of medicinal products - Data elements and structures for the unique identification and exchange of units of measurement, clause 3.1.22"},
   :rdf/type :owl/Class,
   :rdfs/label "prefix",
   :rdfs/subClassOf #{{:owl/onDataRange :owl/rational,
                       :owl/onProperty  :cmns-qtu/hasFactorValue,
                       :owl/qualifiedCardinality 1,
                       :rdf/type        :owl/Restriction} :cmns-qtu/Factor},
   :skos/definition
   "named multiple or sub-multiple multiplication factor used in the specification of a derived unit",
   :skos/note
   #{"A prefix is a word or symbol for attachment to the name or symbol of a unit in order to form units that are multiples or sub-multiples of that unit."
     "A system of units may specify a set of prefixes."}})

(def PrefixedUnit
  {:db/ident :cmns-qtu/PrefixedUnit,
   :dcterms/source {:xsd/anyURI "https://www.omg.org/spec/SysML/"},
   :rdf/type :owl/Class,
   :rdfs/label "prefixed unit",
   :rdfs/subClassOf #{:cmns-qtu/ConversionBasedUnit
                      {:owl/onProperty     :cmns-qtu/hasFactor,
                       :owl/someValuesFrom :cmns-qtu/Prefix,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "conversion-based unit that is defined with respect to another measurement reference unit through a linear conversion relationship with a named prefix that represents a multiple or submultiple of a unit"})

(def QuantityDimension
  {:cmns-av/synonym #{"dimension of a quantity" "dimension"},
   :db/ident :cmns-qtu/QuantityDimension,
   :dcterms/source
   #{{:rdf/value
      "ISO 80000-1:2009 Quantities and units - Part 1: General, clause 3.7"}
     {:xsd/anyURI "https://www.omg.org/spec/SysML/"}
     {:rdf/value
      "ISO 11240 Health informatics - Identification of medicinal products - Data elements and structures for the unique identification and exchange of units of measurement, clause 3.1.9"}},
   :rdf/type :owl/Class,
   :rdfs/label "quantity dimension",
   :rdfs/subClassOf #{{:owl/minQualifiedCardinality 0,
                       :owl/onClass    :cmns-qtu/QuantityKindPowerFactor,
                       :owl/onProperty :cmns-qtu/hasFactor,
                       :rdf/type       :owl/Restriction} :cmns-cls/Classifier},
   :skos/definition
   "expression of the dependence of a quantity on the base quantities of a system of quantities as a product of powers of factors corresponding to the base quantities, omitting any numerical factor",
   :skos/note
   #{"In deriving the dimension of a quantity, no account is taken of its scalar, vector, or tensor character."
     "In a given system of quantities,\n- quantities of the same kind have the same quantity dimension,\n- quantities of different quantity dimensions are always of different kinds, and\n- quantities having the same quantity dimension are not necessarily of the same kind."
     "The conventional symbolic representation of the dimension of a base quantity is a single upper case letter in roman (upright) type. The conventional symbolic representation of the dimension of a derived quantity is the product of powers of the dimensions of the base quantities according to the definition of the derived quantity. The dimension of a quantity Q is denoted by dim Q."
     "A power of a factor is the factor raised to an exponent. Each factor is the dimension of a base quantity."}})

(def QuantityKind
  {:cmns-av/synonym "kind of quantity",
   :db/ident :cmns-qtu/QuantityKind,
   :dcterms/source
   #{{:xsd/anyURI "https://www.omg.org/spec/SysML/"}
     {:rdf/value
      "ISO 80000-1:2009 Quantities and units - Part 1: General, clause 3.2"}
     {:rdf/value
      "ISO 11240 Health informatics - Identification of medicinal products - Data elements and structures for the unique identification and exchange of units of measurement, clause 3.1.12"}},
   :rdf/type :owl/Class,
   :rdfs/label "quantity kind",
   :rdfs/subClassOf #{{:owl/onClass    :cmns-qtu/QuantityDimension,
                       :owl/onProperty :cmns-qtu/hasDimension,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :cmns-qtu/QuantityKind,
                       :owl/onProperty :cmns-qtu/specializes,
                       :rdf/type       :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :cmns-qtu/SystemOfQuantities,
                       :owl/onProperty :cmns-dsg/isDefinedIn,
                       :rdf/type       :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :cmns-qtu/MeasurementUnit,
                       :owl/onProperty :cmns-qtu/hasMeasurementUnit,
                       :rdf/type       :owl/Restriction} :cmns-cls/Classifier},
   :skos/definition "aspect common to mutually comparable quantities",
   :skos/example
   #{"The quantities moment of force and energy are, by convention, not regarded as being of the same kind, although they have the same dimension. Similarly for heat capacity and entropy, as well as for number of entities, relative permeability, and mass fraction."
     "The quantities heat, kinetic energy, and potential energy are generally considered to be quantities of the same kind, namely, of the kind of quantity called energy."
     "The quantities diameter, circumference, and wavelength are generally considered to be quantities of the same kind, namely, of the kind of quantity called length."},
   :skos/note
   "Quantities of the same kind within a given system of quantities have the same quantity dimension. However, quantities of the same dimension are not necessarily of the same kind."})

(def QuantityKindPowerFactor
  {:db/ident :cmns-qtu/QuantityKindPowerFactor,
   :dcterms/source {:xsd/anyURI "https://www.omg.org/spec/SysML/"},
   :rdf/type :owl/Class,
   :rdfs/label "quantity kind power factor",
   :rdfs/subClassOf #{{:owl/onDataRange :owl/rational,
                       :owl/onProperty  :cmns-qtu/hasExponent,
                       :owl/qualifiedCardinality 1,
                       :rdf/type        :owl/Restriction} :cmns-qtu/Factor
                      {:owl/onProperty     :cmns-qtu/hasQuantityKind,
                       :owl/someValuesFrom :cmns-qtu/QuantityKind,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "factor in a product of powers that defines a derived quantity"})

(def QuantityName
  {:db/ident :cmns-qtu/QuantityName,
   :rdf/type :owl/Class,
   :rdfs/label "quantity name",
   :rdfs/subClassOf #{{:owl/minQualifiedCardinality 0,
                       :owl/onClass    :cmns-qtu/SystemOfUnits,
                       :owl/onProperty :cmns-cxtdsg/isApplicableIn,
                       :rdf/type       :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :cmns-qtu/SystemOfQuantities,
                       :owl/onProperty :cmns-cxtdsg/isApplicableIn,
                       :rdf/type       :owl/Restriction}
                      :cmns-cxtdsg/ContextualName
                      {:owl/onProperty     :cmns-dsg/isNameOf,
                       :owl/someValuesFrom :cmns-qtu/ScalarQuantity,
                       :rdf/type           :owl/Restriction}},
   :skos/definition "human-readable textual representation of the quantity",
   :skos/note
   "A number of systems of quantities and units encode a quantity, such as a unit of measure, via a generally accepted abbreviation. URIs representing such quantities are very useful in applications that require globally unique, machine readable names, but are less accessible to people. This concept is intended to provide the corresponding name for a given quantity in the context of a specific system of quantities and units for human consumption."})

(def Ratio
  {:cmns-av/synonym "rate",
   :db/ident :cmns-qtu/Ratio,
   :dcterms/source
   #{{:xsd/anyURI "https://stats.oecd.org/glossary/detail.asp?ID=6688"}
     {:xsd/anyURI
      "https://www150.statcan.gc.ca/n1/edu/power-pouvoir/glossary-glossaire/5214842-eng.htm#r"}},
   :rdf/type :owl/Class,
   :rdfs/label "ratio",
   :rdfs/subClassOf #{{:owl/onClass    :cmns-qtu/ScalarQuantityValue,
                       :owl/onProperty :cmns-qtu/hasDenominator,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      {:owl/onClass    :cmns-qtu/ScalarQuantityValue,
                       :owl/onProperty :cmns-qtu/hasNumerator,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction} :cmns-qtu/Expression},
   :skos/definition
   "proportional relationship between two different quantity values that gives rise to a datum of a specific quantity kind",
   :skos/note
   "A ratio is a quantity measured with respect to some other quantity, or in mathematics a quotient of two numbers or expressions, arrived at by dividing one by the other."})

(def RatioScale
  {:db/ident :cmns-qtu/RatioScale,
   :dcterms/source
   #{{:xsd/anyURI "https://www.omg.org/spec/SysML/"}
     {:xsd/anyURI "https://plato.stanford.edu/entries/measurement-science/"}},
   :rdf/type :owl/Class,
   :rdfs/label "ratio scale",
   :rdfs/subClassOf :cmns-qtu/MeasurementScale,
   :skos/definition
   "measurement scale that represents quantitative values, allows comparison of differences in values, has a fixed zero value and is invariant under multiplication by a positive number",
   :skos/example
   "The Kelvin scale is a ratio scale, as are the familiar scales representing mass in kilograms, length in meters and duration in seconds."})

(def RatioScaleWithAdditionalLimitValues
  {:db/ident :cmns-qtu/RatioScaleWithAdditionalLimitValues,
   :dcterms/source {:xsd/anyURI "https://www.omg.org/spec/SysML/"},
   :rdf/type :owl/Class,
   :rdfs/label "ratio scale with additional limit values",
   :rdfs/subClassOf :cmns-qtu/RatioScale,
   :skos/definition
   "measurement scale that that represents a ratio scale that has additional limit values"})

(def ReferenceMaterial
  {:db/ident :cmns-qtu/ReferenceMaterial,
   :dcterms/source
   {:rdf/value
    "ISO 11240 Health informatics - Identification of medicinal products - Data elements and structures for the unique identification and exchange of units of measurement, clause 3.1.26"},
   :rdf/type :owl/Class,
   :rdfs/label "reference material",
   :rdfs/subClassOf :cmns-doc/Reference,
   :skos/definition
   "material, sufficiently homogeneous and stable with reference to specified properties, which has been established to be fit for its intended use in measurement or in examination of nominal properties",
   :skos/note
   "Some reference materials have assigned quantity values that are metrologically traceable to a measurement unit outside a system of units. Such materials include vaccines to which International Units (IU) have been assigned by the World Health Organization (WHO)."})

(def ScalarQuantity
  {:db/ident :cmns-qtu/ScalarQuantity,
   :dcterms/source
   #{{:rdf/value
      "ISO 11240 Health informatics - Identification of medicinal products - Data elements and structures for the unique identification and exchange of units of measurement, clause 3.1.24"}
     {:xsd/anyURI "https://www.omg.org/spec/SysML/"}
     {:rdf/value
      "ISO 80000-1:2009 Quantities and units - Part 1: General, clause 3.1"}},
   :rdf/type :owl/Class,
   :rdfs/label "scalar quantity",
   :rdfs/subClassOf #{{:owl/minQualifiedCardinality 0,
                       :owl/onClass    :cmns-qtu/QuantityName,
                       :owl/onProperty :cmns-dsg/hasName,
                       :rdf/type       :owl/Restriction}
                      {:owl/onProperty     :cmns-qtu/hasQuantityKind,
                       :owl/someValuesFrom :cmns-qtu/QuantityKind,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "property of a phenomenon, body, or substance, where the property has a magnitude that can be expressed by means of a number and a reference",
   :skos/example "second, kilogram, joule, meter",
   :skos/note
   #{"A quantity as defined in ISO 80000 is a scalar. However, a vector or a tensor, the components of which are quantities, is also considered to be a quantity."
     "A reference can be a measurement unit, a measurement procedure, a reference material, or a combination of such."}})

(def ScalarQuantityValue
  {:cmns-av/synonym #{"measurement" "value of a quantity"},
   :db/ident :cmns-qtu/ScalarQuantityValue,
   :dcterms/source
   #{{:rdf/value
      "ISO 80000-1:2009 Quantities and units - Part 1: General, clause 3.19"}
     {:xsd/anyURI "https://www.omg.org/spec/SysML/"}
     {:rdf/value
      "ISO 11240 Health informatics - Identification of medicinal products - Data elements and structures for the unique identification and exchange of units of measurement, clauses 3.1.19, 3.1.25"}},
   :rdf/type :owl/Class,
   :rdfs/label "scalar quantity value",
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-qtu/hasMeasurementUnit,
                       :owl/someValuesFrom :cmns-qtu/MeasurementUnit,
                       :rdf/type           :owl/Restriction}
                      {:owl/onDataRange :xsd/decimal,
                       :owl/onProperty  :cmns-qtu/hasNumericValue,
                       :owl/qualifiedCardinality 1,
                       :rdf/type        :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :cmns-qtu/ScalarQuantity,
                       :owl/onProperty :cmns-qtu/expressesTheMagnitudeOf,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "number and reference together expressing the magnitude of a quantity",
   :skos/note
   "According to the type of reference, a quantity value is either\n- a product of a number and a measurement unit; the measurement unit one is generally not indicated for quantities of dimension one, or\n- a number and a reference to a measurement procedure, or\n- a number and a reference material."})

(def ScalarQuantityValueRange
  {:db/ident :cmns-qtu/ScalarQuantityValueRange,
   :rdf/type :owl/Class,
   :rdfs/label "scalar quantity value range",
   :rdfs/subClassOf #{{:owl/maxQualifiedCardinality 1,
                       :owl/onClass    :cmns-qtu/ScalarQuantityValue,
                       :owl/onProperty :cmns-qtu/hasUpperBound,
                       :rdf/type       :owl/Restriction} :cmns-qtu/Expression
                      {:owl/maxQualifiedCardinality 1,
                       :owl/onClass    :cmns-qtu/ScalarQuantityValue,
                       :owl/onProperty :cmns-qtu/hasLowerBound,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "expression of the lowest possible value and/or highest possible value for some scalar quantity"})

(def SystemOfQuantities
  {:db/ident :cmns-qtu/SystemOfQuantities,
   :dcterms/source
   #{{:rdf/value
      "ISO 80000-1:2009 Quantities and units - Part 1: General, clause 3.3"}
     {:xsd/anyURI "https://www.omg.org/spec/SysML/"}
     {:rdf/value
      "ISO 11240 Health informatics - Identification of medicinal products - Data elements and structures for the unique identification and exchange of units of measurement, clause 3.1.29"}},
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "system of quantities"},
   :rdfs/subClassOf #{{:owl/minQualifiedCardinality 0,
                       :owl/onClass    :cmns-qtu/SystemOfQuantities,
                       :owl/onProperty :cmns-col/comprises,
                       :rdf/type       :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :cmns-qtu/SystemOfQuantities,
                       :owl/onProperty :cmns-cxtdsg/uses,
                       :rdf/type       :owl/Restriction}
                      {:owl/onProperty     :cmns-dsg/defines,
                       :owl/someValuesFrom :cmns-qtu/QuantityKind,
                       :rdf/type           :owl/Restriction}
                      :cmns-cls/ClassificationScheme},
   :skos/definition
   "set of quantities together with a set of non-contradictory equations relating those quantities",
   :skos/example
   "The International System of Quantities (ISQ) is an example of a SystemOfQuantities, defined in ISO 31 and ISO/IEC 80000.",
   :skos/note
   "Ordinal quantities, such as Rockwell C hardness, and nominal properties, such as color of light, are usually not considered to be part of a system of quantities because they are related to other quantities through empirical relations only."})

(def SystemOfUnits
  {:db/ident :cmns-qtu/SystemOfUnits,
   :dcterms/source
   #{{:rdf/value
      "ISO 80000-1:2009 Quantities and units - Part 1: General, clause 3.13"}
     {:xsd/anyURI "https://www.omg.org/spec/SysML/"}
     {:rdf/value
      "ISO 11240 Health informatics - Identification of medicinal products - Data elements and structures for the unique identification and exchange of units of measurement, clause 3.1.30"}},
   :rdf/type :owl/Class,
   :rdfs/label "system of units",
   :rdfs/subClassOf #{{:owl/onClass    :cmns-qtu/SystemOfQuantities,
                       :owl/onProperty :cmns-col/compliesWith,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :cmns-qtu/SystemOfUnits,
                       :owl/onProperty :cmns-col/comprises,
                       :rdf/type       :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :cmns-qtu/SystemOfUnits,
                       :owl/onProperty :cmns-cxtdsg/uses,
                       :rdf/type       :owl/Restriction}
                      {:owl/onProperty     :cmns-dsg/defines,
                       :owl/someValuesFrom :cmns-qtu/MeasurementUnit,
                       :rdf/type           :owl/Restriction}
                      :cmns-cls/ClassificationScheme},
   :skos/definition
   "set of base units and derived units, together with their multiples and submultiples, defined in accordance with given rules, for a given system of quantities"})

(def Total
  {:db/ident        :cmns-qtu/Total,
   :rdf/type        :owl/Class,
   :rdfs/label      "total",
   :rdfs/subClassOf :cmns-qtu/Expression,
   :skos/definition "sum of the values for some characteristic of all units"})

(def UnitPowerFactor
  {:db/ident :cmns-qtu/UnitPowerFactor,
   :dcterms/source {:xsd/anyURI "https://www.omg.org/spec/SysML/"},
   :rdf/type :owl/Class,
   :rdfs/label "unit power factor",
   :rdfs/subClassOf #{{:owl/onClass    :cmns-qtu/MeasurementUnit,
                       :owl/onProperty :cmns-qtu/hasMeasurementUnit,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      {:owl/onDataRange :owl/rational,
                       :owl/onProperty  :cmns-qtu/hasExponent,
                       :owl/qualifiedCardinality 1,
                       :rdf/type        :owl/Restriction} :cmns-qtu/Factor},
   :skos/definition
   "factor in a product of powers that defines a derived unit"})

(def Variable
  {:db/ident :cmns-qtu/Variable,
   :rdf/type :owl/Class,
   :rdfs/label "variable",
   :rdfs/subClassOf :cmns-qtu/ScalarQuantityValue,
   :skos/definition
   "symbol that represents a parameter in a formula or expression"})

(def describesActualExpression
  {:db/ident :cmns-qtu/describesActualExpression,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/label "describes actual expression",
   :rdfs/subPropertyOf :cmns-dsg/hasDescription,
   :skos/definition
   "specifies the calculation or expression used to determine the value of something",
   :skos/note
   "In cases where some expression can only be calculated in SPARQL or via rules, this property is useful for stating what that calculation should be using the input arguments to the expression."})

(def expressesTheMagnitudeOf
  {:db/ident        :cmns-qtu/expressesTheMagnitudeOf,
   :rdf/type        :owl/ObjectProperty,
   :rdfs/label      "expresses the magnitude of",
   :rdfs/range      :cmns-qtu/ScalarQuantity,
   :skos/definition "specifies the quantity that some quantity value reflects"})

(def hasArgument
  {:db/ident :cmns-qtu/hasArgument,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has argument",
   :rdfs/range {:owl/unionOf [:cmns-qtu/ScalarQuantityValue
                              :cmns-qtu/ScalarQuantityValueRange],
                :rdf/type    :owl/Class},
   :skos/definition
   "indicates a specific input to a function, formula or expression, also known as an independent variable",
   :skos/scopeNote
   "Note that this property and its subproperties apply in the context of quantities and units as well as statistical measures. They are not intended to support more general mathematics."})

(def hasDenominator
  {:db/ident :cmns-qtu/hasDenominator,
   :rdf/type #{:owl/ObjectProperty :owl/FunctionalProperty},
   :rdfs/label "has denominator",
   :rdfs/range {:owl/unionOf [:cmns-qtu/ScalarQuantityValue
                              :cmns-qtu/ScalarQuantityValueRange],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :cmns-qtu/hasArgument,
   :skos/definition
   "specifies the quantity value that is the part of a fraction 'below the line' and signifies the value by which the numerator should be divided",
   :skos/note
   "If a fraction is considered as an ordered pair, the denominator is the second argument of the fraction."})

(def hasDimension
  {:db/ident :cmns-qtu/hasDimension,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :cmns-qtu/QuantityKind,
   :rdfs/label "has dimension",
   :rdfs/range :cmns-qtu/QuantityDimension,
   :rdfs/subPropertyOf :cmns-cls/isClassifiedBy,
   :skos/definition
   "indicates a measurable extent associated with a given quantity kind in some system of quantities, which may be derived, depending on the choice of base quantity"})

(def hasExponent
  {:db/ident :cmns-qtu/hasExponent,
   :rdf/type #{:owl/DatatypeProperty :owl/FunctionalProperty},
   :rdfs/label "has exponent",
   :rdfs/range :owl/rational,
   :skos/definition
   "indicates the number of times a number should be multiplied by itself"})

(def hasExpression
  {:db/ident :cmns-qtu/hasExpression,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has expression",
   :rdfs/range :cmns-qtu/Expression,
   :skos/definition
   "specifies a finite combination of symbols, including constants, variables that may be ordered via one or more operators, that is well-formed according to rules that depend on the language and context"})

(def hasFactor
  {:db/ident :cmns-qtu/hasFactor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has factor",
   :rdfs/subPropertyOf :cmns-qtu/hasArgument,
   :skos/definition
   "indicates a number or quantity that when multiplied with another produces a given number or expression"})

(def hasFactorValue
  {:db/ident :cmns-qtu/hasFactorValue,
   :rdf/type #{:owl/DatatypeProperty :owl/FunctionalProperty},
   :rdfs/label "has factor value",
   :rdfs/range :owl/rational,
   :skos/definition
   "indicates the numeric multiple or submultiple multiplication factor"})

(def hasLowerBound
  {:db/ident :cmns-qtu/hasLowerBound,
   :rdf/type #{:owl/ObjectProperty :owl/FunctionalProperty},
   :rdfs/label "has lower bound",
   :rdfs/range :cmns-qtu/ScalarQuantityValue,
   :rdfs/subPropertyOf #{:cmns-qtu/hasArgument :cmns-qtu/hasQuantityValue},
   :skos/definition
   "specifies the quantity value that is the lower value of a pair of values representing a range"})

(def hasMaximumPermissiveValue
  {:db/ident :cmns-qtu/hasMaximumPermissiveValue,
   :rdf/type #{:owl/ObjectProperty :owl/FunctionalProperty},
   :rdfs/domain :cmns-qtu/MeasurementScale,
   :rdfs/label "has maximum permissive value",
   :rdfs/range :cmns-qtu/ScalarQuantityValue,
   :rdfs/subPropertyOf :cmns-qtu/hasQuantityValue,
   :skos/definition
   "indicates the maximum allowed value for a measurement on the given scale"})

(def hasMeasurementUnit
  {:db/ident        :cmns-qtu/hasMeasurementUnit,
   :rdf/type        :owl/ObjectProperty,
   :rdfs/label      "has measurement unit",
   :rdfs/range      :cmns-qtu/MeasurementUnit,
   :skos/definition "indicates the unit in which something is expressed"})

(def hasMinimumPermissiveValue
  {:db/ident :cmns-qtu/hasMinimumPermissiveValue,
   :rdf/type #{:owl/ObjectProperty :owl/FunctionalProperty},
   :rdfs/domain :cmns-qtu/MeasurementScale,
   :rdfs/label "has minimum permissive value",
   :rdfs/range :cmns-qtu/ScalarQuantityValue,
   :rdfs/subPropertyOf :cmns-qtu/hasQuantityValue,
   :skos/definition
   "indicates the minimum allowed value for a measurement on the given scale"})

(def hasNumerator
  {:db/ident :cmns-qtu/hasNumerator,
   :rdf/type #{:owl/ObjectProperty :owl/FunctionalProperty},
   :rdfs/label "has numerator",
   :rdfs/range {:owl/unionOf [:cmns-qtu/ScalarQuantityValue
                              :cmns-qtu/ScalarQuantityValueRange],
                :rdf/type    :owl/Class},
   :rdfs/subPropertyOf :cmns-qtu/hasArgument,
   :skos/definition
   "specifies the quantity value that is the part of a fraction 'above the line' and signifies the value to be divided by the denominator",
   :skos/note
   "If a fraction is considered as an ordered pair, the numerator is the first argument of the fraction."})

(def hasNumericValue
  {:db/ident :cmns-qtu/hasNumericValue,
   :dcterms/source {:xsd/anyURI "https://www.omg.org/spec/SysML/"},
   :rdf/type #{:owl/DatatypeProperty :owl/FunctionalProperty},
   :rdfs/label "has numeric value",
   :rdfs/range :xsd/decimal,
   :skos/definition
   "indicates a particular magnitude or designation for a given observable characteristic that is a number"})

(def hasQuantityKind
  {:db/ident :cmns-qtu/hasQuantityKind,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has quantity kind",
   :rdfs/range :cmns-qtu/QuantityKind,
   :rdfs/subPropertyOf :cmns-cls/isClassifiedBy,
   :skos/definition
   "indicates the class of mutually comparable quantities involved in the definition of an individual quantity or factor"})

(def hasQuantityValue
  {:db/ident :cmns-qtu/hasQuantityValue,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has quantity value",
   :rdfs/range :cmns-qtu/ScalarQuantityValue,
   :skos/definition
   "relates something (an expression, formula, etc.) to its magnitude expressed as a number together with its unit of measure (if applicable)"})

(def hasQuantityValueRange
  {:db/ident :cmns-qtu/hasQuantityValueRange,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has quantity value range",
   :rdfs/range :cmns-qtu/ScalarQuantityValueRange,
   :rdfs/subPropertyOf :cmns-qtu/hasExpression,
   :skos/definition
   "relates something (an expression, formula, etc.) to its magnitude expressed as range of numbers together with their unit(s) of measure (if applicable)"})

(def hasUpperBound
  {:db/ident :cmns-qtu/hasUpperBound,
   :rdf/type #{:owl/ObjectProperty :owl/FunctionalProperty},
   :rdfs/label "has upper bound",
   :rdfs/range :cmns-qtu/ScalarQuantityValue,
   :rdfs/subPropertyOf #{:cmns-qtu/hasArgument :cmns-qtu/hasQuantityValue},
   :skos/definition
   "specifies the quantity value that is the higher value of a pair of values representing a range"})

(def isDerivedFrom
  {:db/ident :cmns-qtu/isDerivedFrom,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "is derived from",
   :skos/definition
   "indicates something from which the subject is obtained or determined",
   :skos/example
   "a derived quantity is derived from a base quantity; a derived unit is derived from a base unit"})

(def isDimensionOf
  {:db/ident :cmns-qtu/isDimensionOf,
   :owl/inverseOf :cmns-qtu/hasDimension,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :cmns-qtu/QuantityDimension,
   :rdfs/label "is dimension of",
   :rdfs/range :cmns-qtu/QuantityKind,
   :rdfs/subPropertyOf :cmns-cls/classifies,
   :skos/definition
   "indicates a measurable extent associated with a given quantity kind in some system of quantities, which may be derived, depending on the choice of base quantity"})

(def isMaximumInclusive
  {:db/ident :cmns-qtu/isMaximumInclusive,
   :rdf/type #{:owl/DatatypeProperty :owl/FunctionalProperty},
   :rdfs/label "is maximum inclusive",
   :rdfs/range :xsd/boolean,
   :skos/definition
   "indicates whether something, such as a measurement scale, includes the absolute maximum permissive value or not"})

(def isMinimumInclusive
  {:db/ident :cmns-qtu/isMinimumInclusive,
   :rdf/type #{:owl/DatatypeProperty :owl/FunctionalProperty},
   :rdfs/label "is minimum inclusive",
   :rdfs/range :xsd/boolean,
   :skos/definition
   "indicates whether something, such as a measurement scale, includes the absolute minimum permissive value or not"})

(def isValueOf
  {:db/ident           :cmns-qtu/isValueOf,
   :owl/inverseOf      :cmns-qtu/hasQuantityValue,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/domain        :cmns-qtu/ScalarQuantityValue,
   :rdfs/label         "is value of",
   :rdfs/subPropertyOf :cmns-cxtdsg/appliesTo,
   :skos/definition    "is the measure that the value represents"})

(def specializes
  {:db/ident :cmns-qtu/specializes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "specializes",
   :skos/definition
   "indicates something whose nature is more general (broader than) the subject"})

(def urn:uuid:a0e88d9f-1abc-5ef5-b4e2-ac07b41c817f
  {:cmns-av/copyright #{"Copyright (c) 2015-2023 EDM Council, Inc."
                        "Copyright (c) 2023 DEKonsult"
                        "Copyright (c) 2015-2023 Object Management Group, Inc."
                        "Copyright (c) 2023 University of North Florida"
                        "Copyright (c) 2023 Mayo Clinic"
                        "Copyright (c) 2011-2023 Thematix Partners LLC"},
   :dcterms/abstract
   "This ontology provides a core set of concepts for quantities, units, systems of quantities, and systems of units. The most widely accepted, scrutinized, and globally used system of quantities and system of units are the International System of Quantities (ISQ) and the International System of Units (SI). They are formally standardized through [ISO 31] and [IEC 60027]. The harmonization of these two sets of standards into one new set [ISO/IEC 80000] has been published by ISO in 2009 and 2010. This ontology is based on the Object Management Group (OMG)'s SysML standard and on ISO/IEC 80000-1:2009, which refers normatively to the ISO/IEC Guide 99:2007. It is compatible with and can be mapped directly to the OMG Date Time Vocabulary (DTV) Quantities Ontology, the de-facto QUDT ontology representing Units of Measure, Quantity Kinds, Dimensions and Data Types (see http://www.qudt.org/), the Units of Measurement Ontology (UO) ontology available from the BioPortal (https://bioportal.bioontology.org/ontologies/UO) and others, as well as the quantities and units library in the SysML specification.",
   :dcterms/contributor
   #{"Hans Peter de Koenig, DEKonsult"
     "Stuart Chalk, University of North Florida"
     "Evan Wallace, U.S. National Institute of Standards and Technology (NIST)"
     "Davide Sottara, Mayo Clinic" "Roger Burkhart, Thematix Partners LLC"
     "Elisa Kendall, Thematix Partners LLC"},
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/Documents/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://www.omg.org/spec/Commons/20230801/QuantitiesAndUnits/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Commons Quantities and Units Ontology",
   :xsd/anyURI "https://www.omg.org/spec/Commons/QuantitiesAndUnits/"})