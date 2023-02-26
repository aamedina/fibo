(ns net.wikipunk.rdf.fibo-fnd-qt-qtu
  "This ontology provides an initial set of concepts supporting the representation of quantities, units, systems of quantities, and systems of units. It is compatible with and can be mapped directly to the OMG Date Time Vocabulary (DTV) Quantities Ontology, but has been integrated into FND to provide local coverage of quantities and measurements and eliminate the SBVR mark-up."
  {:cmns-av/copyright ["Copyright (c) 2015-2023 EDM Council, Inc."
                       "Copyright (c) 2015-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/",
   :dcterms/abstract
   "This ontology provides an initial set of concepts supporting the representation of quantities, units, systems of quantities, and systems of units. It is compatible with and can be mapped directly to the OMG Date Time Vocabulary (DTV) Quantities Ontology, but has been integrated into FND to provide local coverage of quantities and measurements and eliminate the SBVR mark-up.",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/ClassificationSchemes/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Arrangements/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Quantities/QuantitiesAndUnits/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-arr-cls"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/ClassificationSchemes/",
    "fibo-fnd-qt-qtu"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fnd-qt-qtu",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/",
   :rdfs/label "Quantities and Units Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/ was modified to eliminate deprecated properties."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/ was modified to eliminate the redundant definition of rate, in favor of ratio in Analytics."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/ was modified to rename (migrate) the hasDefinition property to isDefinedIn."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/ was modified to untangle this ontology from analytics, untangle quantity values (measurements) from measures and add refinements from SysML and ISO 11179, including dimensionality."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/ was modified to eliminate circular definitions."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/ was modified to address hygiene issues with respect to text formatting and eliminate dead links."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/ was modified to allow for dimensionless quantity kinds, including but not limited to percentages, and to eliminate duplication with concepts in LCC."]})

(def BaseQuantity
  "quantity kind in a conventionally chosen subset of a given system of quantities, where no subset quantity can be expressed in terms of the others"
  {:cmns-av/adaptedFrom "https://www.omg.org/spec/SysML/1.5/",
   :db/ident :fibo-fnd-qt-qtu/BaseQuantity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/",
   :rdfs/label "base quantity",
   :rdfs/subClassOf [{:owl/onClass    :fibo-fnd-qt-qtu/SystemOfQuantities,
                      :owl/onProperty :fibo-fnd-rel-rel/isDefinedIn,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-qt-qtu/QuantityKind],
   :skos/definition
   "quantity kind in a conventionally chosen subset of a given system of quantities, where no subset quantity can be expressed in terms of the others",
   :skos/example
   "The International System of Quantities (ISQ) comprises these base quantities (with their SI base measurement units): length (meter), mass (kilogram), duration (second), electric current (ampere), thermodynamic temperature (kelvin), amount of substance (mole), and luminous intensity (candela). These base quantities are not mutually comparable. All quantities of any one of these kinds are, however, mutually comparable."})

(def BaseUnit
  "measurement unit that is defined by a system of units to be the reference measurement unit for a base quantity"
  {:cmns-av/adaptedFrom "https://www.omg.org/spec/SysML/1.5/",
   :cmns-av/explanatoryNote
   "Quantity units that are not base units are derived units.",
   :db/ident :fibo-fnd-qt-qtu/BaseUnit,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/",
   :rdfs/label "base unit",
   :rdfs/subClassOf :fibo-fnd-qt-qtu/MeasurementUnit,
   :skos/definition
   "measurement unit that is defined by a system of units to be the reference measurement unit for a base quantity"})

(def DerivedQuantity
  "quantity kind that may be defined as a product of powers of one or more other kinds of quantity"
  {:cmns-av/adaptedFrom "https://www.omg.org/spec/SysML/1.5/",
   :cmns-av/explanatoryNote
   "A derived quantity may also be used to define a synonym kind of quantity for another kind of quantity.",
   :db/ident :fibo-fnd-qt-qtu/DerivedQuantity,
   :owl/disjointWith :fibo-fnd-qt-qtu/BaseQuantity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/",
   :rdfs/label "derived quantity",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-qt-qtu/hasFactor,
                      :owl/someValuesFrom :fibo-fnd-qt-qtu/QuantityKindFactor,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-qt-qtu/isDerivedFrom,
                      :owl/someValuesFrom {:owl/unionOf
                                           [:fibo-fnd-qt-qtu/BaseQuantity
                                            :fibo-fnd-qt-qtu/DerivedQuantity],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-qt-qtu/QuantityKind],
   :skos/definition
   "quantity kind that may be defined as a product of powers of one or more other kinds of quantity",
   :skos/example "velocity (length/time), mass density (mass/length3)"})

(def DerivedUnit
  "measurement unit that is defined with respect to one or more base units, such as as a product of powers of one or more other measurement units"
  {:cmns-av/adaptedFrom "https://www.omg.org/spec/SysML/1.5/",
   :cmns-av/explanatoryNote
   "Every derived unit is defined in terms of base units.",
   :db/ident :fibo-fnd-qt-qtu/DerivedUnit,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/",
   :rdfs/label "derived unit",
   :rdfs/subClassOf [:fibo-fnd-qt-qtu/MeasurementUnit
                     {:owl/onProperty     :fibo-fnd-qt-qtu/hasFactor,
                      :owl/someValuesFrom :fibo-fnd-qt-qtu/UnitFactor,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-qt-qtu/isDerivedFrom,
                      :owl/someValuesFrom :fibo-fnd-qt-qtu/BaseUnit,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   "measurement unit that is defined with respect to one or more base units, such as as a product of powers of one or more other measurement units",
   :skos/example
   ["For example velocity can be specified as the product of length to the power one times time to the power minus one, and subsequently speed can be specified as velocity to the power one."
    "1 minute = 60 seconds"]})

(def Dimensionality
  "classifier that represents a set of equivalent units of measure"
  {:cmns-av/adaptedFrom
   ["https://www.omg.org/spec/SysML/1.5/"
    "ISO 11179-3:2013 Information technology - Metadata registries (MDR)"],
   :cmns-av/explanatoryNote
   "Note that this definition is broader than that provided in SysML, which is an expression of the dependence of a quantity on the base quantities of a system of quantities as a product of powers of factors corresponding to the base quantities.",
   :db/ident :fibo-fnd-qt-qtu/Dimensionality,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/",
   :rdfs/label "dimensionality",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-qt-qtu/QuantityKindFactor,
                      :owl/onProperty :fibo-fnd-qt-qtu/hasFactor,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-arr-cls/Classifier],
   :skos/definition
   "classifier that represents a set of equivalent units of measure"})

(def MeasurementUnit
  "quantity, defined and adopted by convention, with which any other quantity of the same kind can be compared to express the ratio of the two quantities as a number"
  {:cmns-av/adaptedFrom "https://www.omg.org/spec/SysML/1.5/",
   :cmns-av/explanatoryNote
   "A Unit is a quantity in terms of which the magnitudes of other quantities that have the same quantity kind can be stated. A unit often relies on precise and reproducible ways to measure the unit. For example, a unit of length such as meter may be specified as a multiple of a particular wavelength of light. A unit may also specify less stable or precise ways to express some value, such as a cost expressed in some currency, or a severity rating measured by a numerical scale.",
   :db/ident :fibo-fnd-qt-qtu/MeasurementUnit,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/",
   :rdfs/label "measurement unit",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/isDefinedIn,
                      :owl/someValuesFrom :fibo-fnd-qt-qtu/SystemOfUnits,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-qt-qtu/Quantity
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-qt-qtu/MeasurementUnit,
                      :owl/onProperty :fibo-fnd-qt-qtu/specializes,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "quantity, defined and adopted by convention, with which any other quantity of the same kind can be compared to express the ratio of the two quantities as a number",
   :skos/example "week, day, hour, minute, second, kilogram, joule, meter"})

(def Quantity
  "property of a phenomenon, body, or substance, to which a number can be assigned with respect to a reference"
  {:cmns-av/adaptedFrom "https://www.omg.org/spec/SysML/1.5/",
   :cmns-av/explanatoryNote
   "A quantity as defined here is said to be a \"scalar\" as distinct from a \"vector.\" However, a vector or a tensor whose components are quantities is also considered to be a quantity.",
   :db/ident :fibo-fnd-qt-qtu/Quantity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/",
   :rdfs/label "quantity",
   :rdfs/subClassOf {:owl/onProperty     :fibo-fnd-qt-qtu/hasQuantityKind,
                     :owl/someValuesFrom :fibo-fnd-qt-qtu/QuantityKind,
                     :rdf/type           :owl/Restriction},
   :skos/definition
   "property of a phenomenon, body, or substance, to which a number can be assigned with respect to a reference",
   :skos/editorialNote
   "The term quantity is used here to refer to the abstraction of the properties - the amount of measurable stuff that can be compared between particular quantities. The height of the something refers to a particular quantity; 555 ft 5 inches refers to a quantity value.",
   :skos/example
   "second, kilogram, joule, meter. These are quantities in a general sense, which is what is meant here by quantity."})

(def QuantityKind
  "classifier for 'quantity' that characterizes quantities as being mutually comparable"
  {:cmns-av/adaptedFrom "https://www.omg.org/spec/SysML/1.5/",
   :cmns-av/explanatoryNote
   ["Every instance of 'quantity kind' is also a specialization of 'quantity'. So the concept 'duration' is an instance of 'quantity kind' and it is a specialization of 'quantity', i.e., it is a classifier of actual quantities. But a given duration (i.e., the duration of something) is an instance of 'duration' and thus a 'quantity value,' not an instance of 'quantity kind'. For example, a 'year' is not an instance of quantity kind; it is an instance of quantity, but not a category of quantity."
    "A QuantityKind is a kind of quantity that may be stated by means of defined units. For example, the quantity kind of length may be measured by units of meters, kilometers, or feet. Note that this definition allows for dimensionless quantity kinds, such as rates."],
   :db/ident :fibo-fnd-qt-qtu/QuantityKind,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/",
   :rdfs/label "quantity kind",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-qt-qtu/MeasurementUnit,
                      :owl/onProperty :fibo-fnd-qt-qtu/hasMeasurementUnit,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-qt-qtu/QuantityKind,
                      :owl/onProperty :fibo-fnd-qt-qtu/specializes,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-arr-cls/Classifier],
   :skos/definition
   "classifier for 'quantity' that characterizes quantities as being mutually comparable"})

(def QuantityKindFactor
  "factor in a product of powers that defines a derived quantity"
  {:cmns-av/adaptedFrom "https://www.omg.org/spec/SysML/1.5/",
   :db/ident :fibo-fnd-qt-qtu/QuantityKindFactor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/",
   :rdfs/label "quantity kind factor",
   :rdfs/subClassOf [{:owl/onDataRange :owl/rational,
                      :owl/onProperty  :fibo-fnd-qt-qtu/hasExponent,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/onClass    :fibo-fnd-qt-qtu/QuantityKind,
                      :owl/onProperty :fibo-fnd-qt-qtu/hasQuantityKind,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-arr-cls/Classifier],
   :skos/definition
   "factor in a product of powers that defines a derived quantity"})

(def QuantityValue
  "number and measurement unit together giving magnitude of a quantity"
  {:cmns-av/adaptedFrom "https://www.omg.org/spec/SysML/1.5/",
   :cmns-av/explanatoryNote
   "The quantity expressed by a quantity value is the quantity whose ratio to the measurement unit is the number. Note that dimensionless quantities may not have a measurement unit associated with them.",
   :cmns-av/synonym "measurement",
   :db/ident :fibo-fnd-qt-qtu/QuantityValue,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/",
   :rdfs/label "quantity value",
   :rdfs/subClassOf [{:owl/onDataRange :xsd/decimal,
                      :owl/onProperty  :fibo-fnd-qt-qtu/hasNumericValue,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onClass    :fibo-fnd-qt-qtu/MeasurementUnit,
                      :owl/onProperty :fibo-fnd-qt-qtu/hasMeasurementUnit,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "number and measurement unit together giving magnitude of a quantity",
   :skos/example "2 days, 3.5 hours, 150 lb, 45.5 miles"})

(def SystemOfQuantities
  "set of quantities together with a set of non-contradictory equations relating those quantities"
  {:cmns-av/adaptedFrom "https://www.omg.org/spec/SysML/1.5/",
   :db/ident :fibo-fnd-qt-qtu/SystemOfQuantities,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "system of quantities"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/defines,
                      :owl/someValuesFrom {:owl/unionOf
                                           [:fibo-fnd-qt-qtu/BaseQuantity
                                            :fibo-fnd-qt-qtu/DerivedQuantity],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-qt-qtu/SystemOfQuantities,
                      :owl/onProperty :lcc-cr/uses,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-arr-cls/ClassificationScheme
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-qt-qtu/SystemOfQuantities,
                      :owl/onProperty :fibo-fnd-rel-rel/comprises,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "set of quantities together with a set of non-contradictory equations relating those quantities",
   :skos/example
   "The International System of Quantities (ISQ) is an example of a SystemOfQuantities, defined in ISO 31 and ISO/IEC 80000."})

(def SystemOfUnits
  "set of measurement units associated with a system of quantities, together with a set of rules that assign one measurement unit to be the base unit for each base quantity in the system of quantities and a set of rules for the derivation of other units from the base units"
  {:cmns-av/adaptedFrom "https://www.omg.org/spec/SysML/1.5/",
   :db/ident :fibo-fnd-qt-qtu/SystemOfUnits,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/",
   :rdfs/label "system of units",
   :rdfs/subClassOf [:fibo-fnd-arr-cls/ClassificationScheme
                     {:owl/onClass    :fibo-fnd-qt-qtu/SystemOfQuantities,
                      :owl/onProperty :fibo-fnd-rel-rel/appliesTo,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-qt-qtu/SystemOfUnits,
                      :owl/onProperty :fibo-fnd-rel-rel/comprises,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-rel-rel/defines,
                      :owl/someValuesFrom :fibo-fnd-qt-qtu/MeasurementUnit,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-qt-qtu/SystemOfUnits,
                      :owl/onProperty :lcc-cr/uses,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "set of measurement units associated with a system of quantities, together with a set of rules that assign one measurement unit to be the base unit for each base quantity in the system of quantities and a set of rules for the derivation of other units from the base units",
   :skos/example
   "The International System of Units (SI) is a system of units."})

(def UnitFactor
  "factor in a product of powers that defines a derived unit"
  {:cmns-av/adaptedFrom "https://www.omg.org/spec/SysML/1.5/",
   :db/ident :fibo-fnd-qt-qtu/UnitFactor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/",
   :rdfs/label "unit factor",
   :rdfs/subClassOf [{:owl/onDataRange :owl/rational,
                      :owl/onProperty  :fibo-fnd-qt-qtu/hasExponent,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/onClass    :fibo-fnd-qt-qtu/MeasurementUnit,
                      :owl/onProperty :fibo-fnd-qt-qtu/hasMeasurementUnit,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-arr-cls/Classifier],
   :skos/definition
   "factor in a product of powers that defines a derived unit"})

(def hasDimension
  "indicates a measurable extent associated with a given quantity kind in some system of quantities, which may be derived, depending on the choice of base quantity"
  {:db/ident :fibo-fnd-qt-qtu/hasDimension,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-qt-qtu/QuantityKind,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/",
   :rdfs/label "has dimension",
   :rdfs/range :fibo-fnd-qt-qtu/Dimensionality,
   :skos/definition
   "indicates a measurable extent associated with a given quantity kind in some system of quantities, which may be derived, depending on the choice of base quantity"})

(def hasExponent
  "indicates the number of times a number should be multiplied by itself"
  {:db/ident :fibo-fnd-qt-qtu/hasExponent,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/",
   :rdfs/label "has exponent",
   :rdfs/range :owl/rational,
   :skos/definition
   "indicates the number of times a number should be multiplied by itself"})

(def hasFactor
  "indicates a number or quantity that when multiplied with another produces a given number or expression"
  {:db/ident :fibo-fnd-qt-qtu/hasFactor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/",
   :rdfs/label "has factor",
   :skos/definition
   "indicates a number or quantity that when multiplied with another produces a given number or expression"})

(def hasMeasurementUnit
  "indicates the unit in which something is expressed"
  {:db/ident :fibo-fnd-qt-qtu/hasMeasurementUnit,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/",
   :rdfs/label "has measurement unit",
   :rdfs/range :fibo-fnd-qt-qtu/MeasurementUnit,
   :skos/definition "indicates the unit in which something is expressed"})

(def hasNumericValue
  "indicates a value associated with something that is a number"
  {:db/ident :fibo-fnd-qt-qtu/hasNumericValue,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/",
   :rdfs/label "has numeric value",
   :rdfs/range :xsd/decimal,
   :skos/definition
   "indicates a value associated with something that is a number"})

(def hasQuantityKind
  "indicates the class of mutually comparable quantities involved in the definition of an individual quantity or factor"
  {:db/ident :fibo-fnd-qt-qtu/hasQuantityKind,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/",
   :rdfs/label "has quantity kind",
   :rdfs/range :fibo-fnd-qt-qtu/QuantityKind,
   :skos/definition
   "indicates the class of mutually comparable quantities involved in the definition of an individual quantity or factor"})

(def hasQuantityValue
  "relates something (an expression, formula, etc.) to its magnitude expressed as a number together with its unit of measure (if applicable)"
  {:db/ident :fibo-fnd-qt-qtu/hasQuantityValue,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/",
   :rdfs/label "has quantity value",
   :rdfs/range :fibo-fnd-qt-qtu/QuantityValue,
   :skos/definition
   "relates something (an expression, formula, etc.) to its magnitude expressed as a number together with its unit of measure (if applicable)"})

(def isDerivedFrom
  "indicates something from which the subject is obtained or determined"
  {:db/ident :fibo-fnd-qt-qtu/isDerivedFrom,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/",
   :rdfs/label "is derived from",
   :skos/definition
   "indicates something from which the subject is obtained or determined",
   :skos/example
   "a derived quantity is derived from a base quantity; a derived unit is derived from a base unit"})

(def specializes
  "indicates something whose nature is more general (broader than) the subject"
  {:db/ident :fibo-fnd-qt-qtu/specializes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/",
   :rdfs/label "specializes",
   :skos/definition
   "indicates something whose nature is more general (broader than) the subject"})