(ns net.wikipunk.rdf.fibo-fnd-arr-id
  {:cmns-av/copyright #{"Copyright (c) 2014-2023 Object Management Group, Inc."
                        "Copyright (c) 2014-2023 EDM Council, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Arrangements/IdentifiersAndIndices/",
   :dcterms/abstract
   "This ontology defines abstract concepts for representation of identifiers, identification schemes, indices and indexing schemes for use in other FIBO ontology elements.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cds" "https://www.omg.org/spec/Commons/CodesAndCodeSets/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-cxtid" "https://www.omg.org/spec/Commons/ContextualIdentifiers/",
    "cmns-dsg" "https://www.omg.org/spec/Commons/Designators/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-arr-arr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Arrangements/",
    "fibo-fnd-arr-id"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/IdentifiersAndIndices/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Arrangements/Arrangements/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/CodesAndCodeSets/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualIdentifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Arrangements/IdentifiersAndIndices/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fnd-arr-id",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/IdentifiersAndIndices/",
   :rdfs/label "Identifiers and Indices Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/IdentifiersAndIndices.rdf version of this ontology was revised to add the concept of a time-constrained, reassignable identifier as well as the concept of a composite identifier."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/IdentifiersAndIndices.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/IdentifiersAndIndices.rdf version of this ontology was introduced as a part of the issue resolutions identified in the FIBO FND 1.0 FTF report and in https://spec.edmcouncil.org/fibo/ontology/FND/1.0/AboutFND-1.0/. It was further revised in the FTF in advance of the Long Beach meeting to promote Collection to the top level in the hierarchy, resulting in https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Arrangements/."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/IdentifiersAndIndices.rdf version of this ontology was revised to replace hasDefinition with isDefinedIn to clarify intent."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/IdentifiersAndIndices.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/IdentifiersAndIndices.rdf version of this ontology was revised for the FIBO 2.0 RFC to incorporate mappings to LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/IdentifiersAndIndices.rdf version of this ontology was revised to eliminate duplication of concepts with LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/IdentifiersAndIndices.rdf version of this ontology was revised loosen a constraint on composite identifier and add regular expression annotations to support ordered constituents."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/IdentifiersAndIndices/"})

(def CompositeIdentifier
  {:db/ident :fibo-fnd-arr-id/CompositeIdentifier,
   :owl/deprecated true,
   :owl/equivalentClass :cmns-cxtid/StructuredIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/IdentifiersAndIndices/"}})

(def Index
  {:db/ident :fibo-fnd-arr-id/Index,
   :fibo-fnd-utl-av/definitionOrigin {:xsd/anyURI
                                      "http://en.wikipedia.org/wiki/Index"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/IdentifiersAndIndices/"},
   :rdfs/label "index",
   :rdfs/subClassOf #{{:owl/onClass    :fibo-fnd-arr-id/IndexingScheme,
                       :owl/onProperty :cmns-dsg/isDefinedIn,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      :fibo-fnd-rel-rel/Reference
                      {:owl/cardinality 1,
                       :owl/onProperty  :fibo-fnd-arr-id/isIndexTo,
                       :rdf/type        :owl/Restriction}},
   :skos/definition
   "indirect shortcut derived from and pointing into, a greater volume of values, data, information or knowledge"})

(def IndexingScheme
  {:db/ident :fibo-fnd-arr-id/IndexingScheme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/IdentifiersAndIndices/"},
   :rdfs/label "indexing scheme",
   :rdfs/subClassOf #{:fibo-fnd-arr-arr/Scheme
                      {:owl/onProperty     :cmns-dsg/defines,
                       :owl/someValuesFrom :fibo-fnd-arr-id/Index,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "system for indexing values, data, information, or knowledge"})

(def ReassignableIdentifier
  {:cmns-av/explanatoryNote
   "If no assignment termination date is provided, the identifier is considered to be assigned and valid. If there is no initial assignment date, then the identifier is assumed to be assigned up until the termination date, if any.",
   :db/ident :fibo-fnd-arr-id/ReassignableIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/IdentifiersAndIndices/"},
   :rdfs/label "reassignable identifier",
   :rdfs/subClassOf
   #{{:owl/maxQualifiedCardinality 1,
      :owl/onDataRange :cmns-dt/CombinedDateTime,
      :owl/onProperty  :fibo-fnd-arr-id/hasAssignmentTerminationDate,
      :rdf/type        :owl/Restriction} :cmns-id/Identifier
     {:owl/maxQualifiedCardinality 1,
      :owl/onDataRange :cmns-dt/CombinedDateTime,
      :owl/onProperty  :fibo-fnd-arr-id/hasInitialAssignmentDate,
      :rdf/type        :owl/Restriction}},
   :skos/definition
   "identifier that uniquely identifies something for a given time period, and that may be reused to identify something else at a different point in time",
   :skos/example
   "ticker symbol, vehicle license number, such as a vanity plate that can be reassigned and moved from one car to another"})

(def constructRegex
  {:db/ident :fibo-fnd-arr-id/constructRegex,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/IdentifiersAndIndices/"},
   :rdfs/label "construct regex",
   :rdfs/range :xsd/string,
   :skos/definition
   "indicates how to compose the supplied character string from its components"})

(def hasAssignmentTerminationDate
  {:db/ident :fibo-fnd-arr-id/hasAssignmentTerminationDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/IdentifiersAndIndices/"},
   :rdfs/label "has assignment termination date",
   :rdfs/range :cmns-dt/CombinedDateTime,
   :rdfs/subPropertyOf :cmns-dt/hasObservedDateTime,
   :skos/definition
   "the date on which an identifier is released from its assignment to some resource"})

(def hasInitialAssignmentDate
  {:db/ident :fibo-fnd-arr-id/hasInitialAssignmentDate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/IdentifiersAndIndices/"},
   :rdfs/label "has initial assignment date",
   :rdfs/range :cmns-dt/CombinedDateTime,
   :rdfs/subPropertyOf :cmns-dt/hasObservedDateTime,
   :skos/definition
   "the date on which an identifier is first assigned to some resource"})

(def isIndexTo
  {:db/ident :fibo-fnd-arr-id/isIndexTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-arr-id/Index,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/IdentifiersAndIndices/"},
   :rdfs/label "is index to",
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/refersTo,
   :skos/definition "that to which the index refers"})

(def parseRegex
  {:db/ident :fibo-fnd-arr-id/parseRegex,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/IdentifiersAndIndices/"},
   :rdfs/label "parse regex",
   :rdfs/range :xsd/string,
   :skos/definition
   "indicates how to deconstruct the supplied character string into its components"})

(def urn:uuid:585bd336-30f3-53b7-a1c3-6727b65a97d4
  {:cmns-av/copyright #{"Copyright (c) 2014-2023 Object Management Group, Inc."
                        "Copyright (c) 2014-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology defines abstract concepts for representation of identifiers, identification schemes, indices and indexing schemes for use in other FIBO ontology elements.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Arrangements/Arrangements/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/CodesAndCodeSets/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualIdentifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Arrangements/IdentifiersAndIndices/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Identifiers and Indices Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/IdentifiersAndIndices.rdf version of this ontology was revised to add the concept of a time-constrained, reassignable identifier as well as the concept of a composite identifier."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/IdentifiersAndIndices.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/IdentifiersAndIndices.rdf version of this ontology was introduced as a part of the issue resolutions identified in the FIBO FND 1.0 FTF report and in https://spec.edmcouncil.org/fibo/ontology/FND/1.0/AboutFND-1.0/. It was further revised in the FTF in advance of the Long Beach meeting to promote Collection to the top level in the hierarchy, resulting in https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Arrangements/."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/IdentifiersAndIndices.rdf version of this ontology was revised to replace hasDefinition with isDefinedIn to clarify intent."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/IdentifiersAndIndices.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/IdentifiersAndIndices.rdf version of this ontology was revised for the FIBO 2.0 RFC to incorporate mappings to LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/IdentifiersAndIndices.rdf version of this ontology was revised to eliminate duplication of concepts with LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/IdentifiersAndIndices.rdf version of this ontology was revised loosen a constraint on composite identifier and add regular expression annotations to support ordered constituents."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/IdentifiersAndIndices/"})