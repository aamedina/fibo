(ns net.wikipunk.rdf.fibo-fnd-arr-id
  "This ontology defines abstract concepts for representation of identifiers, identification schemes, indices and indexing schemes for use in other FIBO ontology elements."
  {:cmns-av/copyright ["Copyright (c) 2014-2023 EDM Council, Inc."
                       "Copyright (c) 2014-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/IdentifiersAndIndices/",
   :dcterms/abstract
   "This ontology defines abstract concepts for representation of identifiers, identification schemes, indices and indexing schemes for use in other FIBO ontology elements.",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Arrangements/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/IdentifiersAndIndices/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-arr-arr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Arrangements/",
    "fibo-fnd-arr-id"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/IdentifiersAndIndices/",
    "fibo-fnd-dt-fd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "lcc-lr" "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/IdentifiersAndIndices/",
   :rdfa/prefix "fibo-fnd-arr-id",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/IdentifiersAndIndices/",
   :rdfs/label "Identifiers and Indices Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/IdentifiersAndIndices.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/IdentifiersAndIndices.rdf version of this ontology was revised to eliminate duplication of concepts with LCC."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/IdentifiersAndIndices.rdf version of this ontology was revised for the FIBO 2.0 RFC to incorporate mappings to LCC."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/IdentifiersAndIndices.rdf version of this ontology was introduced as a part of the issue resolutions identified in the FIBO FND 1.0 FTF report and in https://spec.edmcouncil.org/fibo/ontology/FND/1.0/AboutFND-1.0/. It was further revised in the FTF in advance of the Long Beach meeting to promote Collection to the top level in the hierarchy, resulting in https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Arrangements/."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/IdentifiersAndIndices.rdf version of this ontology was revised to add the concept of a time-constrained, reassignable identifier as well as the concept of a composite identifier."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/IdentifiersAndIndices.rdf version of this ontology was revised to replace hasDefinition with isDefinedIn to clarify intent."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/IdentifiersAndIndices.rdf version of this ontology was revised loosen a constraint on composite identifier and add regular expression annotations to support ordered constituents."]})

(def CompositeIdentifier
  "identifier that is constructed from at least one other identifier and potentially from one or more codes"
  {:db/ident :fibo-fnd-arr-id/CompositeIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/IdentifiersAndIndices/",
   :rdfs/label "composite identifier",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :lcc-lr/CodeElement,
                      :owl/onProperty :fibo-fnd-rel-rel/comprises,
                      :rdf/type       :owl/Restriction}
                     :lcc-lr/Identifier
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :lcc-lr/Identifier,
                      :owl/onProperty :fibo-fnd-rel-rel/comprises,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "identifier that is constructed from at least one other identifier and potentially from one or more codes",
   :skos/example
   ["An ISIN international financial instrument identifier is an example of a composite identifier."
    "For a fictional business identifier, the rule used to parse a composite identifier might be fibo-fnd-arr-id:parseRegex \"RA([0-9]{6})-([0-9A-Z]*)\", and fibo-fnd-arr-id:constructRegex \"$1-$2\", where RA represents a text value corresponding to the registration authority for the business identifier."],
   :skos/note
   "Use parseRegex and constructRegex annotation properties to express the rules for deconstructing and composing the actual composite identifiers from their constituent parts as appropriate."})

(def Index
  "indirect shortcut derived from and pointing into, a greater volume of values, data, information or knowledge"
  {:db/ident :fibo-fnd-arr-id/Index,
   :fibo-fnd-utl-av/definitionOrigin "http://en.wikipedia.org/wiki/Index",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/IdentifiersAndIndices/",
   :rdfs/label "index",
   :rdfs/subClassOf [{:owl/onClass    :fibo-fnd-arr-id/IndexingScheme,
                      :owl/onProperty :fibo-fnd-rel-rel/isDefinedIn,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/cardinality 1,
                      :owl/onProperty  :fibo-fnd-arr-id/isIndexTo,
                      :rdf/type        :owl/Restriction}
                     :fibo-fnd-rel-rel/Reference],
   :skos/definition
   "indirect shortcut derived from and pointing into, a greater volume of values, data, information or knowledge"})

(def IndexingScheme
  "system for indexing values, data, information, or knowledge"
  {:db/ident :fibo-fnd-arr-id/IndexingScheme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/IdentifiersAndIndices/",
   :rdfs/label "indexing scheme",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/defines,
                      :owl/someValuesFrom :fibo-fnd-arr-id/Index,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-arr-arr/Scheme],
   :skos/definition
   "system for indexing values, data, information, or knowledge"})

(def ReassignableIdentifier
  "identifier that uniquely identifies something for a given time period, and that may be reused to identify something else at a different point in time"
  {:cmns-av/explanatoryNote
   "If no assignment termination date is provided, the identifier is considered to be assigned and valid. If there is no initial assignment date, then the identifier is assumed to be assigned up until the termination date, if any.",
   :db/ident :fibo-fnd-arr-id/ReassignableIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/IdentifiersAndIndices/",
   :rdfs/label "reassignable identifier",
   :rdfs/subClassOf [{:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :fibo-fnd-dt-fd/CombinedDateTime,
                      :owl/onProperty :fibo-fnd-arr-id/hasInitialAssignmentDate,
                      :rdf/type :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onDataRange :fibo-fnd-dt-fd/CombinedDateTime,
                      :owl/onProperty
                      :fibo-fnd-arr-id/hasAssignmentTerminationDate,
                      :rdf/type :owl/Restriction}
                     :lcc-lr/Identifier],
   :skos/definition
   "identifier that uniquely identifies something for a given time period, and that may be reused to identify something else at a different point in time",
   :skos/example
   "ticker symbol, vehicle license number, such as a vanity plate that can be reassigned and moved from one car to another"})

(def constructRegex
  "indicates how to compose the supplied character string from its components"
  {:db/ident :fibo-fnd-arr-id/constructRegex,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/IdentifiersAndIndices/",
   :rdfs/label "construct regex",
   :rdfs/range :xsd/string,
   :skos/definition
   "indicates how to compose the supplied character string from its components"})

(def hasAssignmentTerminationDate
  "the date on which an identifier is released from its assignment to some resource"
  {:db/ident :fibo-fnd-arr-id/hasAssignmentTerminationDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/IdentifiersAndIndices/",
   :rdfs/label "has assignment termination date",
   :rdfs/range :fibo-fnd-dt-fd/CombinedDateTime,
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasObservedDateTime,
   :skos/definition
   "the date on which an identifier is released from its assignment to some resource"})

(def hasInitialAssignmentDate
  "the date on which an identifier is first assigned to some resource"
  {:db/ident :fibo-fnd-arr-id/hasInitialAssignmentDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/IdentifiersAndIndices/",
   :rdfs/label "has initial assignment date",
   :rdfs/range :fibo-fnd-dt-fd/CombinedDateTime,
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasObservedDateTime,
   :skos/definition
   "the date on which an identifier is first assigned to some resource"})

(def isIndexTo
  "that to which the index refers"
  {:db/ident :fibo-fnd-arr-id/isIndexTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-arr-id/Index,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/IdentifiersAndIndices/",
   :rdfs/label "is index to",
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/refersTo,
   :skos/definition "that to which the index refers"})

(def parseRegex
  "indicates how to deconstruct the supplied character string into its components"
  {:db/ident :fibo-fnd-arr-id/parseRegex,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/IdentifiersAndIndices/",
   :rdfs/label "parse regex",
   :rdfs/range :xsd/string,
   :skos/definition
   "indicates how to deconstruct the supplied character string into its components"})

(def ^{:private true} IdentificationScheme
  {:db/ident        :lcc-lr/IdentificationScheme,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :fibo-fnd-arr-arr/Scheme})

(def ^{:private true} Identifier
  {:db/ident        :lcc-lr/Identifier,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :fibo-fnd-rel-rel/Reference})