(ns net.wikipunk.rdf.fibo-fnd-arr-cls
  "This ontology defines abstract concepts for representation of classification schemes that themselves are intended to permit the classification of arbitrary concepts into hierarchies (or partial orders) for use in other FIBO ontology elements."
  {:cmns-av/copyright ["Copyright (c) 2014-2023 EDM Council, Inc."
                       "Copyright (c) 2014-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/ClassificationSchemes/",
   :dcterms/abstract
   "This ontology defines abstract concepts for representation of classification schemes that themselves are intended to permit the classification of arbitrary concepts into hierarchies (or partial orders) for use in other FIBO ontology elements.",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Arrangements/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/ClassificationSchemes/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-arr-arr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Arrangements/",
    "fibo-fnd-arr-cls"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/ClassificationSchemes/",
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
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/ClassificationSchemes/",
   :rdfa/prefix "fibo-fnd-arr-cls",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/ClassificationSchemes/",
   :rdfs/label "Classification Schemes Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/ClassificationSchemes.rdf version of this ontology was revised to address hygiene issues with respect to text formatting and loosen the constraint on classifier from classifies something to min 0."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/ClassificationSchemes.rdf version of this ontology was revised to replace hasDefinition with isDefinedIn to clarify intent."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/ClassificationSchemes.rdf version of this ontology was introduced as a part of the initial FIBO FBC RFC and revised due to changes introduced in the FIBO 2.0 RFC."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/ClassificationSchemes.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/ClassificationSchemes.rdf version of this ontology was revised to eliminate circular definitions."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/ClassificationSchemes.rdf version of this ontology was revised to eliminate duplication of concepts in LCC and change the parent class of Classifier to Aspect in Analytics."]})

(def ClassificationScheme
  "system for allocating classifiers to objects"
  {:cmns-av/adaptedFrom
   "ISO/IEC 11179-3 Information technology - Metadata registries (MDR) - Part 3: Registry metamodel and basic attributes, Third edition, 2013-02-15",
   :cmns-av/explanatoryNote
   "A classification scheme may be a taxonomy, a network, an ontology, or any other terminological system. Such classification schemes are intended to permit the classification of arbitrary objects into hierarchies, or partial orders, as appropriate. The classification may also be just a list of controlled vocabulary of property words (or terms). The list might be taken from the 'leaf level' of a taxonomy.",
   :db/ident :fibo-fnd-arr-cls/ClassificationScheme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/ClassificationSchemes/",
   :rdfs/label "classification scheme",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/defines,
                      :owl/someValuesFrom :fibo-fnd-arr-cls/Classifier,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-arr-arr/Scheme],
   :skos/definition "system for allocating classifiers to objects"})

(def Classifier
  "standardized classification or delineation for something, per some scheme for such delineation, within a specified context"
  {:cmns-av/adaptedFrom
   "ISO/IEC 11179-3 Information technology - Metadata registries (MDR) - Part 3: Registry metamodel and basic attributes, Third edition, 2013-02-15",
   :db/ident :fibo-fnd-arr-cls/Classifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/ClassificationSchemes/",
   :rdfs/label "classifier",
   :rdfs/subClassOf [{:owl/onClass    :fibo-fnd-arr-cls/ClassificationScheme,
                      :owl/onProperty :fibo-fnd-rel-rel/isDefinedIn,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/minCardinality 0,
                      :owl/onProperty     :lcc-cr/classifies,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   "standardized classification or delineation for something, per some scheme for such delineation, within a specified context"})

(def IndustrySectorClassificationScheme
  "system for allocating classifiers to organizations by industry sector"
  {:db/ident :fibo-fnd-arr-cls/IndustrySectorClassificationScheme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/ClassificationSchemes/",
   :rdfs/label "industry sector classification scheme",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-rel-rel/defines,
                      :owl/someValuesFrom
                      :fibo-fnd-arr-cls/IndustrySectorClassifier,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-arr-cls/ClassificationScheme],
   :skos/definition
   "system for allocating classifiers to organizations by industry sector",
   :skos/example
   "Examples include the North American Industry Classification System (NAICS) and Standardized Industry Classification (SIC) in the U.S. and Canada, and the NACE (Nomenclature Générale des Activités Économiques dans les Communautés Européennes) in the EU, developed by governments to classify industries. They also include commercial classification schemes, such as the Global Industry Standard Classification (GICS) developed jointly by Morgan Stanley Capital International (MSCI) and Standard and Poor's, and competing schemes including the Industry Classification Benchmark (ICB) system, maintained by Dow Jones and London's FTSE Group, among others."})

(def IndustrySectorClassifier
  "standardized classification or delineation for an organization, or possibly for a security representing an interest in a given organization, per some scheme for such delineation, by industry"
  {:db/ident :fibo-fnd-arr-cls/IndustrySectorClassifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/ClassificationSchemes/",
   :rdfs/label "industry sector classifier",
   :rdfs/subClassOf [{:owl/onClass
                      :fibo-fnd-arr-cls/IndustrySectorClassificationScheme,
                      :owl/onProperty :fibo-fnd-rel-rel/isDefinedIn,
                      :owl/qualifiedCardinality 1,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-arr-cls/Classifier],
   :skos/definition
   "standardized classification or delineation for an organization, or possibly for a security representing an interest in a given organization, per some scheme for such delineation, by industry"})