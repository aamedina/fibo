(ns net.wikipunk.rdf.fibo-fnd-qt-qtu
  {:cmns-av/copyright
   #{"Copyright (c) 2015-2023 EDM Council, Inc."
     "Copyright (c) 2015-2023 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Quantities/QuantitiesAndUnits/",
   :dcterms/abstract
   "This ontology provides an initial set of concepts supporting the representation of quantities, units, systems of quantities, and systems of units. It is compatible with and can be mapped directly to the OMG Date Time Vocabulary (DTV) Quantities Ontology, but has been integrated into FND to provide local coverage of quantities and measurements and eliminate the SBVR mark-up.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-dsg" "https://www.omg.org/spec/Commons/Designators/",
    "cmns-qtu" "https://www.omg.org/spec/Commons/QuantitiesAndUnits/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-qt-qtu"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/QuantitiesAndUnits/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Quantities/QuantitiesAndUnits/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fnd-qt-qtu",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/",
   :rdfs/label "Quantities and Units Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits.rdf version of this ontology was modified extensively to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380). Note that because all remaining content is deprecated, this ontology will be removed from FIBO after the Q2 2024 release."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/ was modified to address hygiene issues with respect to text formatting and eliminate dead links."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/ was modified to untangle this ontology from analytics, untangle quantity values (measurements) from measures and add refinements from SysML and ISO 11179, including dimensionality."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/ was modified to allow for dimensionless quantity kinds, including but not limited to percentages, and to eliminate duplication with concepts in LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/ was modified to eliminate deprecated properties."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/ was modified to eliminate the redundant definition of rate, in favor of ratio in Analytics."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/ was modified to rename (migrate) the hasDefinition property to isDefinedIn."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/ was modified to eliminate circular definitions."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/"})

(def BaseQuantity
  {:db/ident :fibo-fnd-qt-qtu/BaseQuantity,
   :owl/deprecated true,
   :owl/equivalentClass :cmns-qtu/BaseQuantityKind,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/"}})

(def BaseUnit
  {:db/ident :fibo-fnd-qt-qtu/BaseUnit,
   :owl/deprecated true,
   :owl/equivalentClass :cmns-qtu/BaseUnit,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/"}})

(def DerivedQuantity
  {:db/ident :fibo-fnd-qt-qtu/DerivedQuantity,
   :owl/deprecated true,
   :owl/equivalentClass :cmns-qtu/DerivedQuantityKind,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/"}})

(def DerivedUnit
  {:db/ident :fibo-fnd-qt-qtu/DerivedUnit,
   :owl/deprecated true,
   :owl/equivalentClass :cmns-qtu/DerivedQuantityKind,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/"}})

(def Dimensionality
  {:db/ident :fibo-fnd-qt-qtu/Dimensionality,
   :owl/deprecated true,
   :owl/equivalentClass :cmns-qtu/QuantityDimension,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/"}})

(def MeasurementUnit
  {:db/ident :fibo-fnd-qt-qtu/MeasurementUnit,
   :owl/deprecated true,
   :owl/equivalentClass :cmns-qtu/MeasurementUnit,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/"}})

(def Quantity
  {:db/ident :fibo-fnd-qt-qtu/Quantity,
   :owl/deprecated true,
   :owl/equivalentClass :cmns-qtu/ScalarQuantity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/"}})

(def QuantityKind
  {:db/ident :fibo-fnd-qt-qtu/QuantityKind,
   :owl/deprecated true,
   :owl/equivalentClass :cmns-qtu/QuantityKind,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/"}})

(def QuantityKindFactor
  {:db/ident :fibo-fnd-qt-qtu/QuantityKindFactor,
   :owl/deprecated true,
   :owl/equivalentClass :cmns-qtu/QuantityKindPowerFactor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/"}})

(def QuantityValue
  {:db/ident :fibo-fnd-qt-qtu/QuantityValue,
   :owl/deprecated true,
   :owl/equivalentClass :cmns-qtu/ScalarQuantityValue,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/"}})

(def SystemOfQuantities
  {:db/ident :fibo-fnd-qt-qtu/SystemOfQuantities,
   :owl/deprecated true,
   :owl/equivalentClass :cmns-qtu/SystemOfQuantities,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/"}})

(def SystemOfUnits
  {:db/ident :fibo-fnd-qt-qtu/SystemOfUnits,
   :owl/deprecated true,
   :owl/equivalentClass :cmns-qtu/SystemOfUnits,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/"}})

(def UnitFactor
  {:db/ident :fibo-fnd-qt-qtu/UnitFactor,
   :owl/deprecated true,
   :owl/equivalentClass :cmns-qtu/UnitPowerFactor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/"}})

(def hasDimension
  {:db/ident :fibo-fnd-qt-qtu/hasDimension,
   :owl/deprecated true,
   :owl/equivalentProperty :cmns-qtu/hasDimension,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/"}})

(def hasExponent
  {:db/ident :fibo-fnd-qt-qtu/hasExponent,
   :owl/deprecated true,
   :owl/equivalentProperty :cmns-qtu/hasExponent,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/"}})

(def hasFactor
  {:db/ident :fibo-fnd-qt-qtu/hasFactor,
   :owl/deprecated true,
   :owl/equivalentProperty :cmns-qtu/hasFactor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/"}})

(def hasMeasurementUnit
  {:db/ident :fibo-fnd-qt-qtu/hasMeasurementUnit,
   :owl/deprecated true,
   :owl/equivalentProperty :cmns-qtu/hasMeasurementUnit,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/"}})

(def hasNumericValue
  {:db/ident :fibo-fnd-qt-qtu/hasNumericValue,
   :owl/deprecated true,
   :owl/equivalentProperty :cmns-qtu/hasNumericValue,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/"}})

(def hasQuantityKind
  {:db/ident :fibo-fnd-qt-qtu/hasQuantityKind,
   :owl/deprecated true,
   :owl/equivalentProperty :cmns-qtu/hasQuantityKind,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/"}})

(def hasQuantityValue
  {:db/ident :fibo-fnd-qt-qtu/hasQuantityValue,
   :owl/deprecated true,
   :owl/equivalentProperty :cmns-qtu/hasQuantityValue,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/"}})

(def isDerivedFrom
  {:db/ident :fibo-fnd-qt-qtu/isDerivedFrom,
   :owl/deprecated true,
   :owl/equivalentProperty :cmns-qtu/isDerivedFrom,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/"}})

(def specializes
  {:db/ident :fibo-fnd-qt-qtu/specializes,
   :owl/deprecated true,
   :owl/equivalentProperty :cmns-qtu/specializes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/"}})

(def urn:uuid:297e43cd-5635-5edb-934e-bbc5be0c6699
  {:cmns-av/copyright
   #{"Copyright (c) 2015-2023 EDM Council, Inc."
     "Copyright (c) 2015-2023 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology provides an initial set of concepts supporting the representation of quantities, units, systems of quantities, and systems of units. It is compatible with and can be mapped directly to the OMG Date Time Vocabulary (DTV) Quantities Ontology, but has been integrated into FND to provide local coverage of quantities and measurements and eliminate the SBVR mark-up.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/QuantitiesAndUnits/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Quantities/QuantitiesAndUnits/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Quantities and Units Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits.rdf version of this ontology was modified extensively to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380). Note that because all remaining content is deprecated, this ontology will be removed from FIBO after the Q2 2024 release."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/ was modified to address hygiene issues with respect to text formatting and eliminate dead links."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/ was modified to untangle this ontology from analytics, untangle quantity values (measurements) from measures and add refinements from SysML and ISO 11179, including dimensionality."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/ was modified to allow for dimensionless quantity kinds, including but not limited to percentages, and to eliminate duplication with concepts in LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/ was modified to eliminate deprecated properties."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/ was modified to eliminate the redundant definition of rate, in favor of ratio in Analytics."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/ was modified to rename (migrate) the hasDefinition property to isDefinedIn."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/ was modified to eliminate circular definitions."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/"})