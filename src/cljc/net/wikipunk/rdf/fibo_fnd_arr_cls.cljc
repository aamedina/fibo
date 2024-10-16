(ns net.wikipunk.rdf.fibo-fnd-arr-cls
  {:cmns-av/copyright #{"Copyright (c) 2014-2023 Object Management Group, Inc."
                        "Copyright (c) 2014-2023 EDM Council, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Arrangements/ClassificationSchemes/",
   :dcterms/abstract
   "This ontology defines abstract concepts for representation of industry classification schemes.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
    "cmns-dsg" "https://www.omg.org/spec/Commons/Designators/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-arr-arr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Arrangements/",
    "fibo-fnd-arr-cls"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/ClassificationSchemes/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Arrangements/Arrangements/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Arrangements/ClassificationSchemes/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fnd-arr-cls",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/ClassificationSchemes/",
   :rdfs/label "Classification Schemes Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/ClassificationSchemes.rdf version of this ontology was revised to address hygiene issues with respect to text formatting and loosen the constraint on classifier from classifies something to min 0."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/ClassificationSchemes.rdf version of this ontology was introduced as a part of the initial FIBO FBC RFC and revised due to changes introduced in the FIBO 2.0 RFC."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/ClassificationSchemes.rdf version of this ontology was revised to replace hasDefinition with isDefinedIn to clarify intent."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/ClassificationSchemes.rdf version of this ontology was revised to eliminate circular definitions."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/ClassificationSchemes.rdf version of this ontology was modified to move the property, 'is conferred on' to the Legal Capacity ontology and to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/ClassificationSchemes.rdf version of the ontology was modified to eliminate deprecations that are more than 6 months old."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/ClassificationSchemes.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/ClassificationSchemes.rdf version of this ontology was revised to eliminate duplication of concepts in LCC and change the parent class of Classifier to Aspect in Analytics."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/ClassificationSchemes/"})

(def IndustrySectorClassificationScheme
  {:db/ident :fibo-fnd-arr-cls/IndustrySectorClassificationScheme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/ClassificationSchemes/"},
   :rdfs/label "industry sector classification scheme",
   :rdfs/subClassOf
   #{{:owl/onProperty     :cmns-dsg/defines,
      :owl/someValuesFrom :fibo-fnd-arr-cls/IndustrySectorClassifier,
      :rdf/type           :owl/Restriction} :cmns-cls/ClassificationScheme},
   :skos/definition
   "system for allocating classifiers to organizations by industry sector",
   :skos/example
   "Examples include the North American Industry Classification System (NAICS) and Standardized Industry Classification (SIC) in the U.S. and Canada, and the NACE (Nomenclature Générale des Activités Économiques dans les Communautés Européennes) in the EU, developed by governments to classify industries. They also include commercial classification schemes, such as the Global Industry Standard Classification (GICS) developed jointly by Morgan Stanley Capital International (MSCI) and Standard and Poor's, and competing schemes including the Industry Classification Benchmark (ICB) system, maintained by Dow Jones and London's FTSE Group, among others."})

(def IndustrySectorClassifier
  {:db/ident :fibo-fnd-arr-cls/IndustrySectorClassifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/ClassificationSchemes/"},
   :rdfs/label "industry sector classifier",
   :rdfs/subClassOf #{{:owl/onClass
                       :fibo-fnd-arr-cls/IndustrySectorClassificationScheme,
                       :owl/onProperty :cmns-dsg/isDefinedIn,
                       :owl/qualifiedCardinality 1,
                       :rdf/type :owl/Restriction} :cmns-cls/Classifier},
   :skos/definition
   "standardized classification or delineation for an organization, or possibly for a security representing an interest in a given organization, per some scheme for such delineation, by industry"})

(def urn:uuid:689df3e0-b8cb-5690-b555-83d2c566e5ed
  {:cmns-av/copyright #{"Copyright (c) 2014-2023 Object Management Group, Inc."
                        "Copyright (c) 2014-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology defines abstract concepts for representation of industry classification schemes.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Arrangements/Arrangements/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Arrangements/ClassificationSchemes/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Classification Schemes Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/ClassificationSchemes.rdf version of this ontology was revised to address hygiene issues with respect to text formatting and loosen the constraint on classifier from classifies something to min 0."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/ClassificationSchemes.rdf version of this ontology was introduced as a part of the initial FIBO FBC RFC and revised due to changes introduced in the FIBO 2.0 RFC."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/ClassificationSchemes.rdf version of this ontology was revised to replace hasDefinition with isDefinedIn to clarify intent."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/ClassificationSchemes.rdf version of this ontology was revised to eliminate circular definitions."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/ClassificationSchemes.rdf version of this ontology was modified to move the property, 'is conferred on' to the Legal Capacity ontology and to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/ClassificationSchemes.rdf version of the ontology was modified to eliminate deprecations that are more than 6 months old."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/ClassificationSchemes.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/ClassificationSchemes.rdf version of this ontology was revised to eliminate duplication of concepts in LCC and change the parent class of Classifier to Aspect in Analytics."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/ClassificationSchemes/"})