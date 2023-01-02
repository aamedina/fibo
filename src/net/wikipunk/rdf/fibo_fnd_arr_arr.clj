(ns net.wikipunk.rdf.fibo-fnd-arr-arr
  "This ontology defines abstract structural concepts, including arrangement and collection, for use in other FIBO ontology elements. These abstract concepts are further refined to support definition of identifiers, codes, quantities, and schemata that organize and classify such identifiers and codes."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Arrangements/",
   :dcterms/abstract
   "This ontology defines abstract structural concepts, including arrangement and collection, for use in other FIBO ontology elements. These abstract concepts are further refined to support definition of identifiers, codes, quantities, and schemata that organize and classify such identifiers and codes.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Arrangements/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-arr-arr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Arrangements/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
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
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Arrangements/",
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
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Arrangements.rdf version of this ontology was revised to loosen the restriction on hasObservedDateTime so that it can be used with the new CombinedDateTime datatype (in FinancialDates, which is not imported herein to avoid circular dependencies), with finer granularity than seconds as appropriate for trades, for example."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Arrangements.rdf version of this ontology was revised to move the concepts of a dated collection and dated collection constituent to Financial Dates in order to improve usability and simplify reasoning and make definitions ISO 704 compliant."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Arrangements.rdf version of this ontology was revised to address hygiene issues with respect to text formatting."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Arrangements.rdf version of this ontology was revised as a part of the issue resolutions identified in the FIBO FND 1.2 RTF report to add a definition for a structured collection."],
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright ["Copyright (c) 2014-2022 Object Management Group, Inc."
                  "Copyright (c) 2014-2022 EDM Council, Inc."],
   :sm/dependsOn
   ["https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/"],
   :sm/fileAbbreviation "fibo-fnd-arr-arr",
   :sm/filename "Arrangements.rdf"})

(def CollectionConstituent
  "element of a collection"
  {:db/ident :fibo-fnd-arr-arr/CollectionConstituent,
   :owl/equivalentClass {:owl/onProperty     :fibo-fnd-arr-arr/isConstituentOf,
                         :owl/someValuesFrom :lcc-lr/Collection,
                         :rdf/type           :owl/Restriction},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Arrangements/",
   :rdfs/label "collection constituent",
   :skos/definition "element of a collection"})

(def Scheme
  "structure or means of organizing information such as a blueprint, schema, numbering system, organization structure, measurement system, plan, taxonomy, or language for organizing information"
  {:db/ident :fibo-fnd-arr-arr/Scheme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Arrangements/",
   :rdfs/label "scheme",
   :rdfs/subClassOf [{:owl/minCardinality 0,
                      :owl/onProperty     :fibo-fnd-rel-rel/defines,
                      :rdf/type           :owl/Restriction}
                     :lcc-lr/Arrangement],
   :skos/definition
   "structure or means of organizing information such as a blueprint, schema, numbering system, organization structure, measurement system, plan, taxonomy, or language for organizing information"})

(def StructuredCollection
  "collection that has a clearly defined structure according to a specified scheme"
  {:db/ident :fibo-fnd-arr-arr/StructuredCollection,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Arrangements/",
   :rdfs/label "structured collection",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-arr-arr/Scheme,
                      :owl/onProperty :fibo-fnd-rel-rel/isCharacterizedBy,
                      :rdf/type       :owl/Restriction}
                     :lcc-lr/Collection],
   :skos/definition
   "collection that has a clearly defined structure according to a specified scheme"})

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
  "consists of or contains"
  {:db/ident :fibo-fnd-arr-arr/hasConstituent,
   :fibo-fnd-utl-av/usageNote
   "Being a constituent of something does not necessarily mean parthood. Whole-part relations are transitive, whereas constituency is not necessarily transitive and so this property is useful in cases where transitivity is not necessarily desirable or appropriate.",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :lcc-lr/Collection,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Arrangements/",
   :rdfs/label "has constituent",
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/comprises,
   :skos/definition "consists of or contains"})

(def isConstituentOf
  "identifies the collection that something is an element of"
  {:db/ident :fibo-fnd-arr-arr/isConstituentOf,
   :owl/inverseOf :fibo-fnd-arr-arr/hasConstituent,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Arrangements/",
   :rdfs/label "is constituent of",
   :rdfs/range :lcc-lr/Collection,
   :skos/definition
   "identifies the collection that something is an element of"})