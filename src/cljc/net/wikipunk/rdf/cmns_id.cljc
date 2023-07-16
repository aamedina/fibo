(ns net.wikipunk.rdf.cmns-id
  "The identifiers ontology defines commonly used concepts for describing identifiers and the identification schemes that define them, such as various national and international identifiers for legal entities, financial instruments, and the like, derived from the patterns specified in ISO 11179-3, Metadata Registries."
  {:cmns-av/copyright ["Copyright (c) 2021-2022 Object Management Group, Inc."
                       "Copyright (c) 2021-2022 EDM Council, Inc."
                       "Copyright (c) 2014-2022 Thematix Partners LLC"
                       "Copyright (c) 2021-2022 agnos.ai U.K. Ltd"],
   :dcterms/abstract
   "The identifiers ontology defines commonly used concepts for describing identifiers and the identification schemes that define them, such as various national and international identifiers for legal entities, financial instruments, and the like, derived from the patterns specified in ISO 11179-3, Metadata Registries.",
   :dcterms/contributor
   ["Elisa Kendall, Thematix Partners LLC"
    "Pete Rivett, agnos.ai U.K. Ltd"
    "Evan Wallace, U.S. National Institute of Standards and Technology (NIST)"],
   :dcterms/license {:rdfa/uri "http://opensource.org/licenses/MIT"},
   :owl/imports [{:rdfa/uri "https://www.omg.org/spec/Commons/Designators/"}
                 {:rdfa/uri "https://www.omg.org/spec/Commons/Collections/"}
                 {:rdfa/uri
                  "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}],
   :owl/versionIRI {:rdfa/uri
                    "https://www.omg.org/spec/Commons/20221101/Identifiers/"},
   :rdf/ns-prefix-map
   {"cmns-av"  "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-dsg" "https://www.omg.org/spec/Commons/Designators/",
    "cmns-id"  "https://www.omg.org/spec/Commons/Identifiers/",
    "dcterms"  "http://purl.org/dc/terms/",
    "owl"      "http://www.w3.org/2002/07/owl#",
    "rdf"      "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"     "http://www.w3.org/2000/01/rdf-schema#",
    "skos"     "http://www.w3.org/2004/02/skos/core#",
    "xsd"      "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "cmns-id",
   :rdfa/uri "https://www.omg.org/spec/Commons/Identifiers/",
   :rdfs/label "Commons Identifiers Ontology",
   :skos/changeNote
   "The https://www.omg.org/spec/Commons/20220501/Identifiers.rdf version of this ontology was modified to make the property 'identifies' functional (COMMONS-26).",
   :skos/note
   ["This ontology was originally designed for use in the OMG Languages, Countries and Codes (LCC) specification as part of the broader LanguageRepresentation ontology. The concepts have also been used in the Financial Industry Business Ontology (FIBO) for representing financial instrument, legal entity, and other identifiers."
    "The identifiers ontology conforms with the OWL 2 DL semantics, and is outside of OWL 2 RL due to (1) imported axioms from the designations ontology, and (2) the inclusion of local some values constraints on the Identifier class. The latter could be removed as needed to support OWL RL rule-based applications that cannot be extended to support it."]})

(def IdentificationScheme
  "system for minting identifiers for things that specifies constraints on the structure of the identifier"
  {:cmns-av/adaptedFrom
   {:xsd/string
    "ISO/IEC 11179-3 Information technology - Metadata registries (MDR) - Part 3: Registry metamodel and basic attributes, Third edition, 2013-02-15"},
   :db/ident :cmns-id/IdentificationScheme,
   :rdf/type :owl/Class,
   :rdfs/label "identification scheme",
   :rdfs/subClassOf :cmns-col/Arrangement,
   :skos/definition
   "system for minting identifiers for things that specifies constraints on the structure of the identifier"})

(def Identifier
  "sequence of characters uniquely identifying that with which it is associated"
  {:db/ident :cmns-id/Identifier,
   :dcterms/source
   {:xsd/string
    "ISO/IEC 11179-3 Information technology - Metadata registries (MDR) - Part 3: Registry metamodel and basic attributes, Third edition, 2013-02-15, clause 3.1.1"},
   :owl/disjointWith :cmns-dsg/Name,
   :rdf/type :owl/Class,
   :rdfs/label "identifier",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-id/identifies,
                      :owl/someValuesFrom :owl/Thing,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality #xsd/nonNegativeInteger 0,
                      :owl/onClass    :cmns-id/IdentificationScheme,
                      :owl/onProperty :cmns-col/compliesWith,
                      :rdf/type       :owl/Restriction}
                     :cmns-dsg/Designation],
   :skos/definition
   "sequence of characters uniquely identifying that with which it is associated",
   :skos/note
   "Note that some identifiers may be reused, or may be components of other identifiers, thus the restriction on what an identifier identifies is a 'some values' restriction rather than an exact cardinality. Examples of reusable identifiers include ticker symbols, and in the United States, vehicle license numbers, such as vanity plates that can be reassigned and moved from one car to another. Narrower constraints can be added to specific kinds of identifiers that are not reassignable and that identify exactly one thing, such as many national identifiers for people including passport numbers and, in the United States, social security numbers. Also, not all identifiers are explicitly defined in formal schemes, although they may be created or generated according to some formula."})

(def identifies
  "recognizes or establishes identity within some context"
  {:db/ident :cmns-id/identifies,
   :rdf/type [:owl/FunctionalProperty :owl/ObjectProperty],
   :rdfs/domain :cmns-id/Identifier,
   :rdfs/label "identifies",
   :rdfs/subPropertyOf :cmns-dsg/denotes,
   :skos/definition "recognizes or establishes identity within some context"})

(def isIdentifiedBy
  "has an identifier that is unique within some context"
  {:db/ident           :cmns-id/isIdentifiedBy,
   :owl/inverseOf      :cmns-id/identifies,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/label         "is identified by",
   :rdfs/range         :cmns-id/Identifier,
   :rdfs/subPropertyOf :cmns-dsg/isSignifiedBy,
   :skos/definition    "has an identifier that is unique within some context"})