(ns net.wikipunk.rdf.cmns-cls
  "This ontology defines abstract concepts for representation of classification schemes that enable the classification of arbitrary concepts into hierarchies (or partial orders) for use in many other ontologies, derived in part from the patterns defined in ISO 1087-1 for terminology work and ISO 11179-3, Metadata Registries."
  {:cmns-av/copyright ["Copyright (c) 2014-2022 EDM Council, Inc."
                       "Copyright (c) 2022 Object Management Group, Inc."
                       "Copyright (c) 2014-2022 Thematix Partners LLC"],
   :dcterms/abstract
   "This ontology defines abstract concepts for representation of classification schemes that enable the classification of arbitrary concepts into hierarchies (or partial orders) for use in many other ontologies, derived in part from the patterns defined in ISO 1087-1 for terminology work and ISO 11179-3, Metadata Registries.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports ["https://www.omg.org/spec/Commons/AnnotationVocabulary/"
                 "https://www.omg.org/spec/Commons/Designators/"
                 "https://www.omg.org/spec/Commons/Collections/"],
   :owl/versionIRI "https://www.omg.org/spec/Commons/20220501/Classifiers/",
   :rdf/ns-prefix-map
   {"cmns-av"  "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-dsg" "https://www.omg.org/spec/Commons/Designators/",
    "dcterms"  "http://purl.org/dc/terms/",
    "owl"      "http://www.w3.org/2002/07/owl#",
    "rdf"      "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"     "http://www.w3.org/2000/01/rdf-schema#",
    "skos"     "http://www.w3.org/2004/02/skos/core#",
    "xsd"      "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "cmns-cls",
   :rdfa/uri "https://www.omg.org/spec/Commons/Classifiers/",
   :rdfs/label "Commons Classifiers Ontology",
   :skos/note
   ["The classifiers ontology conforms with the OWL 2 DL semantics, and is outside of OWL 2 RL due to the inclusion of local some values and minimum cardinality constraints. These constraints could be removed as needed to support OWL RL rule-based applications that cannot be extended to support them."
    "This ontology was originally designed for use in the OMG Languages, Countries and Codes (LCC) specification as part of the broader CountryRepresentation ontology. The concepts have also been used in the Financial Industry Business Ontology (FIBO) for representing industry sectors, financial instrument classifiers (e.g., asset classes), lifecycle states, and so forth."]})

(def Aspect
  "characteristic or feature that can be used to dimensionalize, filter, or subset something"
  {:cmns-av/synonym "characteristic",
   :db/ident :cmns-cls/Aspect,
   :rdf/type :owl/Class,
   :rdfs/label "aspect",
   :rdfs/subClassOf {:owl/minCardinality 0,
                     :owl/onProperty     :cmns-cls/characterizes,
                     :rdf/type           :owl/Restriction},
   :skos/definition
   "characteristic or feature that can be used to dimensionalize, filter, or subset something"})

(def ClassificationScheme
  "system for allocating classifiers to things"
  {:db/ident :cmns-cls/ClassificationScheme,
   :dcterms/source
   "ISO/IEC 11179-3 Information technology - Metadata registries (MDR) - Part 3: Registry metamodel and basic attributes, Third edition, 2013-02-15",
   :rdf/type :owl/Class,
   :rdfs/label "classification scheme",
   :rdfs/subClassOf :cmns-col/Arrangement,
   :skos/definition "system for allocating classifiers to things",
   :skos/note
   "ISO 11179-3 defines a classification scheme as descriptive information for an arrangement or division of objects into groups based on criteria such as characteristics, which the objects have in common.  A classification scheme may be a taxonomy, a network, an ontology, or any other terminological system. Such classification schemes are intended to permit the classification of arbitrary objects into hierarchies, or partial orders, as appropriate. The classification may also be just a list of controlled vocabulary of property words (or terms). The list might be taken from the 'leaf level' of a taxonomy."})

(def Classifier
  "standardized classification or delineation for something, per some scheme for such delineation, within a specified context"
  {:db/ident :cmns-cls/Classifier,
   :dcterms/source
   "ISO/IEC 11179-3 Information technology - Metadata registries (MDR) - Part 3: Registry metamodel and basic attributes, Third edition, 2013-02-15",
   :rdf/type :owl/Class,
   :rdfs/label "classifier",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-cls/classifies,
                      :owl/someValuesFrom :owl/Thing,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :cmns-cls/ClassificationScheme,
                      :owl/onProperty    :cmns-dsg/isDefinedIn,
                      :rdf/type          :owl/Restriction}
                     :cmns-cls/Aspect
                     {:owl/minCardinality 0,
                      :owl/onProperty     :cmns-cls/characterizes,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   "standardized classification or delineation for something, per some scheme for such delineation, within a specified context",
   :skos/example
   "The classifier 'color' embraces characteristics being red, blue, green, etc. The classifier 'material' embraces characteristics made of wood, metal, etc.",
   :skos/note
   "In ISO 1087, classifiers form categories of characteristics that serve as the criterion of subdivision when establishing concept systems."})

(def characterizes
  "provides a discriminating feature or quality of"
  {:db/ident           :cmns-cls/characterizes,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/label         "characterizes",
   :rdfs/subPropertyOf :cmns-dsg/describes,
   :skos/definition    "provides a discriminating feature or quality of"})

(def classifies
  "arranges in categories according to one or more shared characteristics"
  {:db/ident :cmns-cls/classifies,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "classifies",
   :rdfs/subPropertyOf [:cmns-cls/characterizes :cmns-dsg/describes],
   :skos/definition
   "arranges in categories according to one or more shared characteristics"})

(def isCharacterizedBy
  "indicates a quality or feature of something, distinguishing it from something else"
  {:db/ident :cmns-cls/isCharacterizedBy,
   :owl/inverseOf :cmns-cls/characterizes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "is characterized by",
   :rdfs/subPropertyOf :cmns-dsg/isDescribedBy,
   :skos/definition
   "indicates a quality or feature of something, distinguishing it from something else"})

(def isClassifiedBy
  "is systematically grouped based on characteristics by"
  {:db/ident           :cmns-cls/isClassifiedBy,
   :owl/inverseOf      :cmns-cls/classifies,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/label         "is classified by",
   :rdfs/subPropertyOf [:cmns-cls/isCharacterizedBy :cmns-dsg/isDescribedBy],
   :skos/definition    "is systematically grouped based on characteristics by"})