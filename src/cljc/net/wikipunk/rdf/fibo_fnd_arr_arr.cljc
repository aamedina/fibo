(ns net.wikipunk.rdf.fibo-fnd-arr-arr
  "This ontology defines abstract structural concepts, extending the Commons concept of an arrangement to represent schemes."
  {:cmns-av/copyright ["Copyright (c) 2014-2023 EDM Council, Inc."
                       "Copyright (c) 2014-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Arrangements/",
   :dcterms/abstract
   "This ontology defines abstract structural concepts, extending the Commons concept of an arrangement to represent schemes.",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://www.omg.org/spec/Commons/Collections/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://www.omg.org/spec/Commons/CodesAndCodeSets/"
    "https://www.omg.org/spec/Commons/Designators/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Arrangements/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cds" "https://www.omg.org/spec/Commons/CodesAndCodeSets/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-dsg" "https://www.omg.org/spec/Commons/Designators/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-arr-arr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Arrangements/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fnd-arr-arr",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Arrangements/",
   :rdfs/label "Arrangements Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Arrangements.rdf version of this ontology was introduced as a part of the issue resolutions identified in the FIBO FND 1.0 FTF report and in https://spec.edmcouncil.org/fibo/ontology/FND/1.0/AboutFND-1.0/. It was further revised in the FTF in advance of the Long Beach meeting to promote Collection to the top level in the hierarchy, resulting in https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Arrangements/."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Arrangements.rdf version of this ontology was revised to eliminate duplication with concepts in LCC for classes including arrangement, collection, code element, code set, etc to simplify the hierarchy and usage for FIBO users."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Arrangements.rdf version of this ontology was revised to loosen the range on hasObservedDateTime such that it can be used more generally."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Arrangements.rdf version of this ontology was revised to add a restriction to structured collection pointing to the arrangement used to organize that collection, and to revise the definition accordingly."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Arrangements.rdf version of this ontology was revised for the FIBO 2.0 RFC report to add a general definition for scheme, add dated collection, and add mappings to LCC."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Arrangements.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Arrangements.rdf version of this ontology was revised to loosen the restriction on hasObservedDateTime so that it can be used with the new CombinedDateTime datatype (in FinancialDates, which is not imported herein to avoid circular dependencies), with finer granularity than seconds as appropriate for trades, for example."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Arrangements.rdf version of this ontology was revised to move the concepts of a dated collection and dated collection constituent to Financial Dates in order to improve usability and simplify reasoning and make definitions ISO 704 compliant."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Arrangements.rdf version of this ontology was revised to address hygiene issues with respect to text formatting."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Arrangements.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Arrangements.rdf version of this ontology was revised as a part of the issue resolutions identified in the FIBO FND 1.2 RTF report to add a definition for a structured collection."]})

(def CollectionConstituent
  {:db/ident :fibo-fnd-arr-arr/CollectionConstituent,
   :owl/deprecated true,
   :owl/equivalentClass :cmns-col/Constituent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Arrangements/"})

(def Scheme
  "structure or means of organizing information such as a blueprint, schema, numbering system, organization structure, measurement system, plan, taxonomy, or language for organizing information"
  {:db/ident :fibo-fnd-arr-arr/Scheme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Arrangements/",
   :rdfs/label "scheme",
   :rdfs/subClassOf [{:owl/minCardinality 0,
                      :owl/onProperty     :cmns-dsg/defines,
                      :rdf/type           :owl/Restriction}
                     :cmns-col/Arrangement],
   :skos/definition
   "structure or means of organizing information such as a blueprint, schema, numbering system, organization structure, measurement system, plan, taxonomy, or language for organizing information"})

(def StructuredCollection
  {:db/ident :fibo-fnd-arr-arr/StructuredCollection,
   :owl/deprecated true,
   :owl/equivalentClass :cmns-col/StructuredCollection,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Arrangements/"})

(def hasCollectionSize
  "indicates the number of elements in a given collection"
  {:db/ident :fibo-fnd-arr-arr/hasCollectionSize,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Arrangements/",
   :rdfs/label "has collection size",
   :rdfs/range :xsd/nonNegativeInteger,
   :skos/definition "indicates the number of elements in a given collection"})

(def hasConstituent
  {:db/ident :fibo-fnd-arr-arr/hasConstituent,
   :owl/deprecated true,
   :owl/equivalentProperty :cmns-col/hasConstituent,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Arrangements/"})

(def isConstituentOf
  {:db/ident :fibo-fnd-arr-arr/isConstituentOf,
   :owl/deprecated true,
   :owl/equivalentProperty :cmns-col/isConstituentOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Arrangements/"})

(def ^{:private true} CodeSet
  {:db/ident        :cmns-cds/CodeSet,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :fibo-fnd-arr-arr/Scheme})