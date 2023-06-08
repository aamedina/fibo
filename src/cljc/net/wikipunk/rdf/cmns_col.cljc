(ns net.wikipunk.rdf.cmns-col
  "The collections ontology defines commonly used concepts for arrangements and schemes for organizing information and collections of things, such as structured collections that may be organized according to some scheme, and related very high level mereology relations to enable association of things with such collections and schemes."
  {:cmns-av/copyright ["Copyright (c) 2019-2022 Thematix Partners LLC"
                       "Copyright (c) 2021-2022 Mayo Clinic"
                       "Copyright (c) 2022 Object Management Group, Inc."
                       "Copyright (c) 2021-2022 EDM Council, Inc."
                       "Copyright (c) 2021-2022 agnos.ai U.K. Ltd"],
   :dcterms/abstract
   "The collections ontology defines commonly used concepts for arrangements and schemes for organizing information and collections of things, such as structured collections that may be organized according to some scheme, and related very high level mereology relations to enable association of things with such collections and schemes.",
   :dcterms/contributor ["Elisa Kendall, Thematix Partners LLC"
                         "Pete Rivett, agnos.ai"
                         "Davide Sottara, Mayo Clinic"],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
   :owl/versionIRI "https://www.omg.org/spec/Commons/20220501/Collections/",
   :rdf/ns-prefix-map
   {"cmns-av"  "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "dcterms"  "http://purl.org/dc/terms/",
    "owl"      "http://www.w3.org/2002/07/owl#",
    "rdf"      "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"     "http://www.w3.org/2000/01/rdf-schema#",
    "skos"     "http://www.w3.org/2004/02/skos/core#",
    "xsd"      "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "cmns-col",
   :rdfa/uri "https://www.omg.org/spec/Commons/Collections/",
   :rdfs/label "Commons Collections Ontology",
   :skos/note
   ["The collections ontology conforms with the OWL 2 DL semantics, and is outside of OWL 2 RL due to the inclusion of a local some values constraint. This restriction may be removed as needed to support OWL RL rule-based applications that cannot be extended to support it."
    "This ontology was originally designed for use in the OMG Languages, Countries and Codes (LCC) specification as part of the broader LanguageRepresentation ontology. The concepts have also been used in the Financial Industry Business Ontology (FIBO) for representing collections such as baskets, portfolios records, statistical universes and populations, etc., and schemes such as classification schemes and identification schemes."]})

(def Arrangement
  "systematic plan, manner, or method for making, doing, achieving, or organizing something"
  {:db/ident :cmns-col/Arrangement,
   :rdf/type :owl/Class,
   :rdfs/label "arrangement",
   :skos/definition
   "systematic plan, manner, or method for making, doing, achieving, or organizing something",
   :skos/example
   "Examples include designs, schema, models, methodologies, alphabetical or numeric ordering, and the like."})

(def Collection
  "grouping of things (may be zero) that have some shared significance"
  {:db/ident :cmns-col/Collection,
   :rdf/type :owl/Class,
   :rdfs/label "collection",
   :skos/definition
   "grouping of things (may be zero) that have some shared significance"})

(def Constituent
  "component of a substance, collection or combination of things"
  {:db/ident :cmns-col/Constituent,
   :rdf/type :owl/Class,
   :rdfs/label "constituent",
   :rdfs/subClassOf {:owl/onProperty     :cmns-col/isConstituentOf,
                     :owl/someValuesFrom :owl/Thing,
                     :rdf/type           :owl/Restriction},
   :skos/definition
   "component of a substance, collection or combination of things"})

(def StructuredCollection
  "collection that has a clearly defined structure or organization"
  {:db/ident :cmns-col/StructuredCollection,
   :rdf/type :owl/Class,
   :rdfs/label "structured collection",
   :rdfs/subClassOf [{:owl/allValuesFrom :cmns-col/Arrangement,
                      :owl/onProperty    :cmns-col/hasArrangement,
                      :rdf/type          :owl/Restriction}
                     :cmns-col/Collection],
   :skos/definition
   "collection that has a clearly defined structure or organization",
   :skos/example
   "Examples include collections organized thematically, alphabetically, by method used do develop them, according to time and/or version, or based on encoding schemes such as the Dewey Decimal System or Library of Congress Subject Headings."})

(def compliesWith
  "adheres to policies or rules specified in"
  {:db/ident        :cmns-col/compliesWith,
   :rdf/type        :owl/ObjectProperty,
   :rdfs/label      "complies with",
   :rdfs/range      :cmns-col/Arrangement,
   :skos/definition "adheres to policies or rules specified in"})

(def comprises
  "includes, consists of, or contains, especially within a particular scope"
  {:db/ident :cmns-col/comprises,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "comprises",
   :rdfs/subPropertyOf :cmns-col/isRelatedTo,
   :skos/definition
   "includes, consists of, or contains, especially within a particular scope",
   :skos/note
   "Note that something can be comprised of something(s) that may or may not be understood as separable parts. In other words, comprises does not imply countability or uniqueness."})

(def hasArrangement
  "is structured or organized according to"
  {:db/ident        :cmns-col/hasArrangement,
   :rdf/type        :owl/ObjectProperty,
   :rdfs/label      "has arrangement",
   :rdfs/range      :cmns-col/Arrangement,
   :skos/definition "is structured or organized according to"})

(def hasConstituent
  "consists of or contains"
  {:cmns-av/usageNote
   "Being a constituent of something does not necessarily mean parthood. Whole-part relations are transitive, whereas constituency is not necessarily transitive and so this property is useful in cases where transitivity is not necessarily desirable or appropriate.",
   :db/ident :cmns-col/hasConstituent,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has constituent",
   :rdfs/subPropertyOf [:cmns-col/comprises :cmns-col/isRelatedTo],
   :skos/definition "consists of or contains"})

(def hasMember
  "includes, as a discrete element"
  {:db/ident :cmns-col/hasMember,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has member",
   :rdfs/subPropertyOf [:cmns-col/comprises :cmns-col/isRelatedTo],
   :skos/definition "includes, as a discrete element",
   :skos/note
   "Note that the domain of hasMember should be some sort of collection, aggregate, or group. In the Financial Industry Business Ontology (FIBO), hasMember is used in the case of parties (people and organizations), whereas comprises can have anything in its range."})

(def hasPart
  "indicates any portion of something, regardless of whether the portion itself is attached to the remainder or detached; cognitively salient or arbitrarily demarcated; self-connected or disconnected; homogeneous or gerrymandered; material or immaterial; extended or unextended; spatial or temporal"
  {:db/ident :cmns-col/hasPart,
   :dcterms/source
   "Stanford Encyclopedia of Philosophy at http://plato.stanford.edu/entries/mereology/",
   :rdf/type [:owl/TransitiveProperty :owl/ObjectProperty],
   :rdfs/label "has part",
   :skos/definition
   "indicates any portion of something, regardless of whether the portion itself is attached to the remainder or detached; cognitively salient or arbitrarily demarcated; self-connected or disconnected; homogeneous or gerrymandered; material or immaterial; extended or unextended; spatial or temporal",
   :skos/note
   "Note that 'has part' is not a subproperty of 'comprises' in order to enable transitivity for whole-part relationships without limiting the use of cardinality constraints on comprises and membership."})

(def isConstituentOf
  "is a component of something else"
  {:db/ident :cmns-col/isConstituentOf,
   :owl/inverseOf :cmns-col/hasConstituent,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "is constituent of",
   :rdfs/subPropertyOf [:cmns-col/isIncludedIn :cmns-col/isRelatedTo],
   :skos/definition "is a component of something else",
   :skos/note
   "A constituent may be an independently identifiable, discrete element or may be an indistinguishable element once it is combined with the target, such as a part of a substance."})

(def isIncludedIn
  "is contained in or an element of"
  {:db/ident           :cmns-col/isIncludedIn,
   :owl/inverseOf      :cmns-col/comprises,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/label         "is included in",
   :rdfs/subPropertyOf :cmns-col/isRelatedTo,
   :skos/definition    "is contained in or an element of"})

(def isMemberOf
  "is a discrete element of"
  {:db/ident           :cmns-col/isMemberOf,
   :owl/inverseOf      :cmns-col/hasMember,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/label         "is member of",
   :rdfs/subPropertyOf [:cmns-col/isIncludedIn :cmns-col/isRelatedTo],
   :skos/definition    "is a discrete element of"})

(def isPartOf
  "relates something to another thing that it is some component or portion of, regardless of how that whole-part relationship is manifested"
  {:db/ident :cmns-col/isPartOf,
   :dcterms/source
   "Stanford Encyclopedia of Philosophy at http://plato.stanford.edu/entries/mereology/",
   :owl/inverseOf :cmns-col/hasPart,
   :rdf/type [:owl/TransitiveProperty :owl/ObjectProperty],
   :rdfs/label "is part of",
   :skos/definition
   "relates something to another thing that it is some component or portion of, regardless of how that whole-part relationship is manifested",
   :skos/note
   "Note that 'is part of' is not a subproperty of 'isIncludedIn' in order to enable transitivity for whole-part relationships without limiting the use of cardinality constraints on inclusion and membership."})

(def isRelatedTo
  "links something or someone to something or someone else"
  {:db/ident        :cmns-col/isRelatedTo,
   :rdf/type        :owl/ObjectProperty,
   :rdfs/label      "is related to",
   :skos/definition "links something or someone to something or someone else"})