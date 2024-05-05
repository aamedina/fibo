(ns net.wikipunk.rdf.fibo-fnd-rel-rel
  {:cmns-av/copyright
   #{"Copyright (c) 2013-2024 EDM Council, Inc."
     "Copyright (c) 2013-2024 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Relations/Relations/",
   :dcterms/abstract
   "This ontology defines a set of general purpose relations for use in other FIBO ontology elements. These include a number of properties required for reuse across the foundations and business entities models.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-doc" "https://www.omg.org/spec/Commons/Documents/",
    "cmns-dsg" "https://www.omg.org/spec/Commons/Designators/",
    "cmns-rlcmp" "https://www.omg.org/spec/Commons/RolesAndCompositions/",
    "cmns-txt" "https://www.omg.org/spec/Commons/TextDatatype/",
    "dcterms" "http://purl.org/dc/terms/",
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
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Documents/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/TextDatatype/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Relations/Relations/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fnd-rel-rel",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
   :rdfs/label "Relations Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations.rdf version of this ontology was modified to add Reference as a superclass of Name and use the hasTextValue property as the superproperty of certain data properties."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations.rdf version of this ontology was modified to address hygiene issues with respect to text formatting."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations.rdf version of this ontology was modified to remove the deprecated hasTag property."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations.rdf version of this ontology was modified to move the property, 'is conferred on' to the Legal Capacity ontology and to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations.rdf version of this ontology was modified to rename (migrate) the hasDefinition property to isDefinedIn."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations.rdf version of this ontology was modified to incorporate evaluates and isEvaluatedBy, and to loosen constraints on hasName properties to allow multi-lingual names."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations.rdf version of the ontology was modified to replace additional content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations.rdf version of the ontology was modified to eliminate deprecations that are more than 6 months old and to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The http://www.omg.org/spec/EDMC-FIBO/FND/20170201/Relations/Relations.rdf version of this ontology was modified per the FIBO 2.0 RFC to include additional properties and the linkage to LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations.rdf version of this ontology was modified per the issue resolutions identified in the FIBO FND 1.0 FTF report and in https://spec.edmcouncil.org/fibo/ontology/FND/1.0/AboutFND-1.0/. It was further revised in FTF 2 resulting in https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations.rdf version of this ontology was modified to eliminate duplication with concepts in LCC and remove the unused hasDispositionDate property, whose semantics were unclear at best."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations.rdf version of this ontology was modified to move hasAcquisitionDate to Financial Dates to improve usability and simplify reasoning, to eliminate circular definitions, to deprecate fibo-fnd-rel-rel;hasTag in favor of the simpler LCC property of the same name, to loosen domain restrictions on some properties which were too narrowly specified, and to add two new properties, describes and isDescribedBy, which are more appropriate for certain cases where we were using characterizes and isCharacterizedBy."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations.rdf version of this ontology was modified to clean up references to external dictionaries that don't meet FIBO policies, eliminate ambiguity where possible, eliminate the superproperties of produces and is produced by, whose semantics are different from their parent properties, and improve ISO 704 compliance of definitions."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations.rdf version of this ontology was modified to eliminate deprecated elements."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations.rdf version of this ontology was modified to loosen constraints on properties using xsd:dateTime in their range to allow for more flexible representation, and to add properties including produces, isProducedBy."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations.rdf version of this ontology was modified to move the property 'exchanges' to FND given that it could be applied more generally than with respect to swaps only."
     "The http://www.omg.org/spec/FIBO/Foundations/20130601/Relations/Relations.owl version of the ontology submitted with the FIBO FND RFC, was revised in advance of the September 2013 New Brunswick, NJ meeting, as follows:\n\t(1) to use slash style URI/IRIss (also called 303 URIs, vs. hash style) as required to support server side processing \n\t(2) to use version-independent IRIs for all definitions internally as opposed to version-specific IRIs\n\t(3) to change the file suffix from .owl to .rdf to increase usability in RDF tools\n\t(4) to use 4-level abbreviations and corresponding namespace prefixes for all FIBO ontologies, reflecting a family/specification/module/ontology structure\n\t(5) to incorporate changes to the specification metadata to support documentation at the family, specification, module, and ontology level, similar to the abbreviations\n\t(6) to move the ontology from the Utilities module to an independent Relations module\n\t(7) to revise a number of definitions, per discussion with various stakeholders.\n\t(8) to augment the definitions to include entity names from Business Entities."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations.rdf version of this ontology was modified per the issue resolutions identified in the FIBO FND 1.2 RTF report."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations.rdf version of this ontology was revised to add the appliesTo object property in support of the IND RFC."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/"})

(def Reference
  {:db/ident :fibo-fnd-rel-rel/Reference,
   :owl/deprecated true,
   :owl/equivalentClass :cmns-doc/Reference,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/"}})

(def Referent
  {:db/ident :fibo-fnd-rel-rel/Referent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/"},
   :rdfs/label "referent",
   :skos/definition
   "something that another concept stands for, exemplifies, symbolizes, or otherwise mentions"})

(def causes
  {:db/ident :fibo-fnd-rel-rel/causes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/"},
   :rdfs/label "causes",
   :skos/definition
   "relationship between an event or set of events or factors (the cause) and a second event, phenomenon, situation, or result (the effect), where the second event or outcome is understood as a consequence of the first"})

(def confers
  {:cmns-av/explanatoryNote
   "This property should be read as describing the conferral of some legal power or duty, some commitment or some social construct, and is a property of some social construct such as an agreement or some legal authority. These concepts, which would describe the kind of thing of which this is a property, and the kinds of thing in terms of which this property is framed, are outside the scope of this mode land so are not shown.",
   :cmns-av/synonym "invests with",
   :db/ident :fibo-fnd-rel-rel/confers,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/"},
   :rdfs/label "confers",
   :skos/definition "grants or bestows by virtue of some authority"})

(def controls
  {:db/ident :fibo-fnd-rel-rel/controls,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/"},
   :rdfs/label "controls",
   :skos/definition "exercises authority or influence over"})

(def designates
  {:cmns-av/explanatoryNote
   "This property is intended to cover assigning a job or role to someone, selecting or designating someone to fill an office or a position, and fixing or setting by authority or by mutual agreement.",
   :db/ident :fibo-fnd-rel-rel/designates,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/"},
   :rdfs/label "designates",
   :skos/definition "appoints someone officially"})

(def embodies
  {:db/ident :fibo-fnd-rel-rel/embodies,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/"},
   :rdfs/label "embodies",
   :skos/definition
   "is an expression of, gives a tangible or visible form to (an idea, quality, or feeling), makes concrete and perceptible"})

(def evaluates
  {:db/ident :fibo-fnd-rel-rel/evaluates,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/"},
   :rdfs/label "evaluates",
   :rdfs/subPropertyOf :cmns-cxtdsg/appliesTo,
   :skos/definition
   "assesses the nature, quality, or ability of someone or something"})

(def exchanges
  {:db/ident :fibo-fnd-rel-rel/exchanges,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/"},
   :rdfs/label "exchanges",
   :skos/definition "gives something in return something else"})

(def exemplifies
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "http://www.merriam-webster.com/dictionary/exemplify"},
   :db/ident :fibo-fnd-rel-rel/exemplifies,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/"},
   :rdfs/label "exemplifies",
   :skos/definition "is a concrete realization or example of"})

(def generates
  {:db/ident :fibo-fnd-rel-rel/generates,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/"},
   :rdfs/label "generates",
   :skos/definition
   "produces through the application of one or more mathematical or logical steps or rules"})

(def governs
  {:db/ident :fibo-fnd-rel-rel/governs,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/"},
   :rdfs/label "governs",
   :skos/definition "has and exercises authority over, regulates"})

(def hasAlias
  {:db/ident :fibo-fnd-rel-rel/hasAlias,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/"},
   :rdfs/label "has alias",
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/hasTextualName,
   :skos/definition
   "indicates an alternate name of by which something is known"})

(def hasCommonName
  {:db/ident :fibo-fnd-rel-rel/hasCommonName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/"},
   :rdfs/label "has common name",
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/hasTextualName,
   :skos/definition
   "indicates a name by which something is frequently referred, without reference to any formal usage or structure"})

(def hasDesignation
  {:db/ident :fibo-fnd-rel-rel/hasDesignation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/"},
   :rdfs/label "has designation",
   :skos/definition
   "relates an individual or organization to a position, role, or other designation"})

(def hasFormalName
  {:db/ident :fibo-fnd-rel-rel/hasFormalName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/"},
   :rdfs/label "has formal name",
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/hasTextualName,
   :skos/definition
   "indicates a name by which something is known for some official purpose or context, or which is structured in some way such as to always follow the same format regardless of usage"})

(def hasIdentity
  {:db/ident :fibo-fnd-rel-rel/hasIdentity,
   :owl/deprecated true,
   :owl/equivalentProperty :cmns-rlcmp/isPlayedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/"}})

(def hasLegalName
  {:db/ident :fibo-fnd-rel-rel/hasLegalName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/"},
   :rdfs/label "has legal name",
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/hasFormalName,
   :skos/definition
   "specifies the name used to refer to a party in legal communications"})

(def hasTag
  {:db/ident :fibo-fnd-rel-rel/hasTag,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/"},
   :rdfs/label "has tag",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :cmns-txt/hasTextValue,
   :skos/definition
   "combination of alphanumeric characters corresponding to a label for something",
   :skos/note
   "Text-valued tags may be useful for automated transformation or encoding systems, such as those used to produce IETF compliant language tags in XML. Such tags are required to be string-valued in FIBO, but not language-tagged strings."})

(def hasTextualName
  {:cmns-av/usageNote
   "Note that the hasTextualName property has an implicit range of rdfs:Literal. This is purposeful, so that users can specify any element that has a name with or without a language tag without concern for conflicting datatypes (i.e., xsd:string vs. rdf:langString, which are logically disjoint).",
   :db/ident :fibo-fnd-rel-rel/hasTextualName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/"},
   :rdfs/label "has textual name",
   :rdfs/subPropertyOf :cmns-txt/hasTextValue,
   :skos/definition
   "associates a string-valued name, reference name, or appellation with something"})

(def holds
  {:db/ident :fibo-fnd-rel-rel/holds,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/"},
   :rdfs/label "holds",
   :skos/definition
   "is the relationship between a party and something it possesses, or over which it exercises some ownership or control or has at its discretion the ability to dispose of it as it sees fit"})

(def involves
  {:db/ident :fibo-fnd-rel-rel/involves,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/"},
   :rdfs/label "involves",
   :skos/definition
   "(of a situation or event) includes (something) as a necessary part or result"})

(def isCausedBy
  {:db/ident :fibo-fnd-rel-rel/isCausedBy,
   :owl/inverseOf :fibo-fnd-rel-rel/causes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/"},
   :rdfs/label "is caused by",
   :skos/definition
   "is the relationship between an event (the effect) and a second event (the cause), where the first event is understood as a consequence of the second; also, the relationship between a set of factors (causes) and a phenomenon (the effect)"})

(def isConferredBy
  {:cmns-av/explanatoryNote
   "This property should be read as describing some legal power or duty, some commitment or some social construct being conferred as a result of some social construct such as an agreement or some legal authority. These concepts, which would describe the kind of thing of which this is a property, and the kinds of thing in terms of which this property is framed, are outside the scope of this model and so are not shown.",
   :db/ident :fibo-fnd-rel-rel/isConferredBy,
   :owl/inverseOf :fibo-fnd-rel-rel/confers,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/"},
   :rdfs/label "is conferred by",
   :skos/definition
   "a relationship between a right or obligation and the vehicle, such as an agreement or contract, that vests (or confers) said right or obligation"})

(def isControlledBy
  {:db/ident :fibo-fnd-rel-rel/isControlledBy,
   :owl/inverseOf :fibo-fnd-rel-rel/controls,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/"},
   :rdfs/label "is controlled by",
   :skos/definition "is influenced, managed, or directed by"})

(def isDesignatedBy
  {:db/ident :fibo-fnd-rel-rel/isDesignatedBy,
   :owl/inverseOf :fibo-fnd-rel-rel/designates,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/"},
   :rdfs/label "is designated by",
   :skos/definition
   "indicates the party that has assigned or appointed someone to an office or position"})

(def isEvaluatedBy
  {:db/ident :fibo-fnd-rel-rel/isEvaluatedBy,
   :owl/inverseOf :fibo-fnd-rel-rel/evaluates,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/"},
   :rdfs/label "is evaluated by",
   :skos/definition "is ascertained or determined by"})

(def isExemplifiedBy
  {:db/ident :fibo-fnd-rel-rel/isExemplifiedBy,
   :owl/inverseOf :fibo-fnd-rel-rel/exemplifies,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/"},
   :rdfs/label "is exemplified by",
   :skos/definition "is made concrete or is realized by"})

(def isGeneratedBy
  {:db/ident :fibo-fnd-rel-rel/isGeneratedBy,
   :owl/inverseOf :fibo-fnd-rel-rel/generates,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/"},
   :rdfs/label "is generated by",
   :skos/definition
   "identifies some party or something that produces something via some equation, logic, or rules"})

(def isGovernedBy
  {:cmns-av/explanatoryNote
   "This property should be read as being the property of some thing and as referring to a logical union of social construct (in the informative abstractions ontology) and legal person.",
   :db/ident :fibo-fnd-rel-rel/isGovernedBy,
   :owl/inverseOf :fibo-fnd-rel-rel/governs,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/"},
   :rdfs/label "is governed by",
   :skos/definition
   "relates a contract, agreement, jurisdiction, or other legal construct and the regulation, policy, procedure, or legal person that regulates or oversees (governs) it"})

(def isHeldBy
  {:db/ident :fibo-fnd-rel-rel/isHeldBy,
   :owl/inverseOf :fibo-fnd-rel-rel/holds,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/"},
   :rdfs/label "is held by",
   :skos/definition
   "indicates the party that possesses and has at least partial control of something, regardless of ownership"})

(def isIssuedBy
  {:db/ident :fibo-fnd-rel-rel/isIssuedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/"},
   :rdfs/label "is issued by",
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/isProvidedBy,
   :skos/definition
   "indicates a functional entity or party responsible for circulating, distributing, or publishing something"})

(def isManagedBy
  {:cmns-av/explanatoryNote
   "The target or range of this property should be read as always being some kind of 'relative thing', that is a thing defined in some context. Generally this will be a 'party in role'. This property is not intended to be used to relate a thing to some independent thing which it is managed by, only to something in the role of being that which manages it.",
   :db/ident :fibo-fnd-rel-rel/isManagedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/"},
   :rdfs/label "is managed by",
   :skos/definition
   "relates something to another thing that has some role in directing its affairs"})

(def isMandatedBy
  {:db/ident :fibo-fnd-rel-rel/isMandatedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/"},
   :rdfs/label "is mandated by",
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/isConferredBy,
   :skos/definition
   "relates a responsibility, capacity, or action to that which requires it"})

(def isProducedBy
  {:db/ident :fibo-fnd-rel-rel/isProducedBy,
   :owl/inverseOf :fibo-fnd-rel-rel/produces,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/"},
   :rdfs/label "is produced by",
   :skos/definition
   "identifies the producer that fabricates, manufactures or otherwise creates something through some production process"})

(def isProvidedBy
  {:cmns-av/explanatoryNote
   "The target or range of this property should be read as always being some kind of 'relative thing', that is a thing defined in some context. Generally this will be a 'party in role'. This property is not intended to be used to relate a thing to some independent thing which it is provided by, only to something in the role of being that which provides it.",
   :db/ident :fibo-fnd-rel-rel/isProvidedBy,
   :owl/inverseOf :fibo-fnd-rel-rel/provides,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/"},
   :rdfs/label "is provided by",
   :skos/definition "is made available by"})

(def issues
  {:db/ident :fibo-fnd-rel-rel/issues,
   :owl/inverseOf :fibo-fnd-rel-rel/isIssuedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/"},
   :rdfs/label "issues",
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/provides,
   :skos/definition "officially makes something available"})

(def manages
  {:db/ident :fibo-fnd-rel-rel/manages,
   :owl/inverseOf :fibo-fnd-rel-rel/isManagedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/"},
   :rdfs/label "manages",
   :skos/definition "relates a party to something that it directs in some way"})

(def mandates
  {:db/ident :fibo-fnd-rel-rel/mandates,
   :owl/inverseOf :fibo-fnd-rel-rel/isMandatedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/"},
   :rdfs/label "mandates",
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/confers,
   :skos/definition
   "relates something to a commitment, contract, law, obligation, requirement, regulation, or similar concept that requires it"})

(def produces
  {:db/ident :fibo-fnd-rel-rel/produces,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/"},
   :rdfs/label "produces",
   :skos/definition
   "creates through a fabrication, manufacturing or production process"})

(def provides
  {:db/ident :fibo-fnd-rel-rel/provides,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/"},
   :rdfs/label "provides",
   :skos/definition "makes something available"})

(def refersTo
  {:db/ident :fibo-fnd-rel-rel/refersTo,
   :owl/deprecated true,
   :owl/equivalentProperty :cmns-doc/refersTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/"}})

(def wasFormerlyKnownAs
  {:db/ident :fibo-fnd-rel-rel/wasFormerlyKnownAs,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/"},
   :rdfs/label "was formerly known as",
   :rdfs/subPropertyOf :cmns-txt/hasTextValue,
   :skos/definition
   "indicates a name by which something was known in the past"})

(def urn:uuid:6f8d2a35-656a-5948-9bc9-b6579c30e191
  {:cmns-av/copyright
   #{"Copyright (c) 2013-2024 EDM Council, Inc."
     "Copyright (c) 2013-2024 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology defines a set of general purpose relations for use in other FIBO ontology elements. These include a number of properties required for reuse across the foundations and business entities models.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Documents/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/TextDatatype/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Relations/Relations/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Relations Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations.rdf version of this ontology was modified to add Reference as a superclass of Name and use the hasTextValue property as the superproperty of certain data properties."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations.rdf version of this ontology was modified to address hygiene issues with respect to text formatting."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations.rdf version of this ontology was modified to remove the deprecated hasTag property."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations.rdf version of this ontology was modified to move the property, 'is conferred on' to the Legal Capacity ontology and to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations.rdf version of this ontology was modified to rename (migrate) the hasDefinition property to isDefinedIn."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations.rdf version of this ontology was modified to incorporate evaluates and isEvaluatedBy, and to loosen constraints on hasName properties to allow multi-lingual names."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations.rdf version of the ontology was modified to replace additional content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations.rdf version of the ontology was modified to eliminate deprecations that are more than 6 months old and to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The http://www.omg.org/spec/EDMC-FIBO/FND/20170201/Relations/Relations.rdf version of this ontology was modified per the FIBO 2.0 RFC to include additional properties and the linkage to LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations.rdf version of this ontology was modified per the issue resolutions identified in the FIBO FND 1.0 FTF report and in https://spec.edmcouncil.org/fibo/ontology/FND/1.0/AboutFND-1.0/. It was further revised in FTF 2 resulting in https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations.rdf version of this ontology was modified to eliminate duplication with concepts in LCC and remove the unused hasDispositionDate property, whose semantics were unclear at best."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations.rdf version of this ontology was modified to move hasAcquisitionDate to Financial Dates to improve usability and simplify reasoning, to eliminate circular definitions, to deprecate fibo-fnd-rel-rel;hasTag in favor of the simpler LCC property of the same name, to loosen domain restrictions on some properties which were too narrowly specified, and to add two new properties, describes and isDescribedBy, which are more appropriate for certain cases where we were using characterizes and isCharacterizedBy."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations.rdf version of this ontology was modified to clean up references to external dictionaries that don't meet FIBO policies, eliminate ambiguity where possible, eliminate the superproperties of produces and is produced by, whose semantics are different from their parent properties, and improve ISO 704 compliance of definitions."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations.rdf version of this ontology was modified to eliminate deprecated elements."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations.rdf version of this ontology was modified to loosen constraints on properties using xsd:dateTime in their range to allow for more flexible representation, and to add properties including produces, isProducedBy."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations.rdf version of this ontology was modified to move the property 'exchanges' to FND given that it could be applied more generally than with respect to swaps only."
     "The http://www.omg.org/spec/FIBO/Foundations/20130601/Relations/Relations.owl version of the ontology submitted with the FIBO FND RFC, was revised in advance of the September 2013 New Brunswick, NJ meeting, as follows:\n\t(1) to use slash style URI/IRIss (also called 303 URIs, vs. hash style) as required to support server side processing \n\t(2) to use version-independent IRIs for all definitions internally as opposed to version-specific IRIs\n\t(3) to change the file suffix from .owl to .rdf to increase usability in RDF tools\n\t(4) to use 4-level abbreviations and corresponding namespace prefixes for all FIBO ontologies, reflecting a family/specification/module/ontology structure\n\t(5) to incorporate changes to the specification metadata to support documentation at the family, specification, module, and ontology level, similar to the abbreviations\n\t(6) to move the ontology from the Utilities module to an independent Relations module\n\t(7) to revise a number of definitions, per discussion with various stakeholders.\n\t(8) to augment the definitions to include entity names from Business Entities."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations.rdf version of this ontology was modified per the issue resolutions identified in the FIBO FND 1.2 RTF report."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations.rdf version of this ontology was revised to add the appliesTo object property in support of the IND RFC."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/"})