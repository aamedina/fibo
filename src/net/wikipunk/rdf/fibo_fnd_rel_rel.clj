(ns net.wikipunk.rdf.fibo-fnd-rel-rel
  "This ontology defines a set of general purpose relations for use in other FIBO ontology elements. These include a number of properties required for reuse across the foundations and business entities models."
  {:cmns-av/copyright ["Copyright (c) 2013-2023 Object Management Group, Inc."
                       "Copyright (c) 2013-2023 EDM Council, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
   :dcterms/abstract
   "This ontology defines a set of general purpose relations for use in other FIBO ontology elements. These include a number of properties required for reuse across the foundations and business entities models.",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/AgentsAndPeople/Agents/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-aap-agt"
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "lcc-lr" "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fnd-rel-rel",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
   :rdfs/label "Relations Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations.rdf version of this ontology was modified per the issue resolutions identified in the FIBO FND 1.0 FTF report and in https://spec.edmcouncil.org/fibo/ontology/FND/1.0/AboutFND-1.0/. It was further revised in FTF 2 resulting in https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations.rdf version of this ontology was modified to add Reference as a superclass of Name and use the hasTextValue property as the superproperty of certain data properties."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations.rdf version of this ontology was modified to move the property 'exchanges' to FND given that it could be applied more generally than with respect to swaps only."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations.rdf version of this ontology was revised to add the appliesTo object property in support of the IND RFC."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations.rdf version of this ontology was modified to eliminate deprecated elements."
    "The http://www.omg.org/spec/EDMC-FIBO/FND/20170201/Relations/Relations.rdf version of this ontology was modified per the FIBO 2.0 RFC to include additional properties and the linkage to LCC."
    "The http://www.omg.org/spec/FIBO/Foundations/20130601/Relations/Relations.owl version of the ontology submitted with the FIBO FND RFC, was revised in advance of the September 2013 New Brunswick, NJ meeting, as follows:\n\t(1) to use slash style URI/IRIss (also called 303 URIs, vs. hash style) as required to support server side processing \n\t(2) to use version-independent IRIs for all definitions internally as opposed to version-specific IRIs\n\t(3) to change the file suffix from .owl to .rdf to increase usability in RDF tools\n\t(4) to use 4-level abbreviations and corresponding namespace prefixes for all FIBO ontologies, reflecting a family/specification/module/ontology structure\n\t(5) to incorporate changes to the specification metadata to support documentation at the family, specification, module, and ontology level, similar to the abbreviations\n\t(6) to move the ontology from the Utilities module to an independent Relations module\n\t(7) to revise a number of definitions, per discussion with various stakeholders.\n\t(8) to augment the definitions to include entity names from Business Entities."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations.rdf version of this ontology was modified to loosen constraints on properties using xsd:dateTime in their range to allow for more flexible representation, and to add properties including produces, isProducedBy."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations.rdf version of this ontology was modified to eliminate duplication with concepts in LCC and remove the unused hasDispositionDate property, whose semantics were unclear at best."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations.rdf version of this ontology was modified to incorporate evaluates and isEvaluatedBy, and to loosen constraints on hasName properties to allow multi-lingual names."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations.rdf version of this ontology was modified to remove the deprecated hasTag property."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations.rdf version of this ontology was modified to move hasAcquisitionDate to Financial Dates to improve usability and simplify reasoning, to eliminate circular definitions, to deprecate fibo-fnd-rel-rel;hasTag in favor of the simpler LCC property of the same name, to loosen domain restrictions on some properties which were too narrowly specified, and to add two new properties, describes and isDescribedBy, which are more appropriate for certain cases where we were using characterizes and isCharacterizedBy."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations.rdf version of this ontology was modified to rename (migrate) the hasDefinition property to isDefinedIn."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations.rdf version of this ontology was modified to clean up references to external dictionaries that don't meet FIBO policies, eliminate ambiguity where possible, eliminate the superproperties of produces and is produced by, whose semantics are different from their parent properties, and improve ISO 704 compliance of definitions."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations.rdf version of this ontology was modified to address hygiene issues with respect to text formatting."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations.rdf version of this ontology was modified per the issue resolutions identified in the FIBO FND 1.2 RTF report."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."]})

(def Reference
  "concept that stands in for how something may be interpreted/understood in some context"
  {:cmns-av/explanatoryNote
   "In linguistics, a reference characterizes, provides context for, or specifies the relationship of one linguistic expression to another, i.e., provides the information necessary to interpret the dependent expression.",
   :db/ident :fibo-fnd-rel-rel/Reference,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
   :rdfs/label "reference",
   :skos/definition
   "concept that stands in for how something may be interpreted/understood in some context"})

(def Referent
  "something that another concept stands for, exemplifies, symbolizes, or otherwise mentions"
  {:db/ident :fibo-fnd-rel-rel/Referent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
   :rdfs/label "referent",
   :skos/definition
   "something that another concept stands for, exemplifies, symbolizes, or otherwise mentions"})

(def appliesTo
  "is pertinent, suitable, or relevant to"
  {:db/ident :fibo-fnd-rel-rel/appliesTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
   :rdfs/label "applies to",
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/refersTo,
   :skos/definition "is pertinent, suitable, or relevant to"})

(def causes
  "relationship between an event or set of events or factors (the cause) and a second event, phenomenon, situation, or result (the effect), where the second event or outcome is understood as a consequence of the first"
  {:db/ident :fibo-fnd-rel-rel/causes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
   :rdfs/label "causes",
   :skos/definition
   "relationship between an event or set of events or factors (the cause) and a second event, phenomenon, situation, or result (the effect), where the second event or outcome is understood as a consequence of the first"})

(def characterizes
  "specifies a discriminating feature or quality of"
  {:db/ident :fibo-fnd-rel-rel/characterizes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
   :rdfs/label "characterizes",
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/appliesTo,
   :skos/definition "specifies a discriminating feature or quality of"})

(def comprises
  "includes, especially within a particular scope"
  {:cmns-av/usageNote
   "Note that something can be comprised of something(s) that may or may not be understood as separable parts, and thus is not defined as being explicitly transitive.",
   :db/ident :fibo-fnd-rel-rel/comprises,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
   :rdfs/label "comprises",
   :skos/definition "includes, especially within a particular scope"})

(def confers
  "grants or bestows by virtue of some authority"
  {:cmns-av/explanatoryNote
   "This property should be read as describing the conferral of some legal power or duty, some commitment or some social construct, and is a property of some social construct such as an agreement or some legal authority. These concepts, which would describe the kind of thing of which this is a property, and the kinds of thing in terms of which this property is framed, are outside the scope of this mode land so are not shown.",
   :cmns-av/synonym "invests with",
   :db/ident :fibo-fnd-rel-rel/confers,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
   :rdfs/label "confers",
   :skos/definition "grants or bestows by virtue of some authority"})

(def controls
  "exercises authority or influence over"
  {:db/ident :fibo-fnd-rel-rel/controls,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
   :rdfs/label "controls",
   :skos/definition "exercises authority or influence over"})

(def defines
  "identifies the essential qualities of, specifies the meaning of, fixes the limits of, demarcates"
  {:db/ident :fibo-fnd-rel-rel/defines,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
   :rdfs/label "defines",
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/represents,
   :skos/definition
   "identifies the essential qualities of, specifies the meaning of, fixes the limits of, demarcates"})

(def describes
  "conveys the nature of"
  {:db/ident :fibo-fnd-rel-rel/describes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
   :rdfs/label "describes",
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/appliesTo,
   :skos/definition "conveys the nature of"})

(def designates
  "appoints someone officially"
  {:cmns-av/explanatoryNote
   "This property is intended to cover assigning a job or role to someone, selecting or designating someone to fill an office or a position, and fixing or setting by authority or by mutual agreement.",
   :db/ident :fibo-fnd-rel-rel/designates,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
   :rdfs/label "designates",
   :skos/definition "appoints someone officially"})

(def embodies
  "is an expression of, gives a tangible or visible form to (an idea, quality, or feeling), makes concrete and perceptible"
  {:db/ident :fibo-fnd-rel-rel/embodies,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
   :rdfs/label "embodies",
   :skos/definition
   "is an expression of, gives a tangible or visible form to (an idea, quality, or feeling), makes concrete and perceptible"})

(def evaluates
  "assesses the nature, quality, or ability of someone or something"
  {:db/ident :fibo-fnd-rel-rel/evaluates,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
   :rdfs/label "evaluates",
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/appliesTo,
   :skos/definition
   "assesses the nature, quality, or ability of someone or something"})

(def exchanges
  "gives something in return something else"
  {:db/ident :fibo-fnd-rel-rel/exchanges,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
   :rdfs/label "exchanges",
   :skos/definition "gives something in return something else"})

(def generates
  "produces through the application of one or more mathematical or logical steps or rules"
  {:db/ident :fibo-fnd-rel-rel/generates,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
   :rdfs/label "generates",
   :skos/definition
   "produces through the application of one or more mathematical or logical steps or rules"})

(def governs
  "has and exercises authority over, regulates"
  {:db/ident :fibo-fnd-rel-rel/governs,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
   :rdfs/label "governs",
   :skos/definition "has and exercises authority over, regulates"})

(def hasAlias
  "indicates an alternate name of by which something is known"
  {:db/ident :fibo-fnd-rel-rel/hasAlias,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
   :rdfs/label "has alias",
   :rdfs/subPropertyOf [:lcc-lr/hasName :fibo-fnd-aap-agt/hasTextValue],
   :skos/definition
   "indicates an alternate name of by which something is known"})

(def hasCommonName
  "indicates a name by which something is frequently referred, without reference to any formal usage or structure"
  {:db/ident :fibo-fnd-rel-rel/hasCommonName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
   :rdfs/label "has common name",
   :rdfs/subPropertyOf [:lcc-lr/hasName :fibo-fnd-aap-agt/hasTextValue],
   :skos/definition
   "indicates a name by which something is frequently referred, without reference to any formal usage or structure"})

(def hasContext
  "indicates the setting in which something is defined, expressed, or represented"
  {:db/ident :fibo-fnd-rel-rel/hasContext,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
   :rdfs/label "has context",
   :rdfs/subPropertyOf :lcc-lr/has,
   :skos/definition
   "indicates the setting in which something is defined, expressed, or represented"})

(def hasDesignation
  "relates an individual or organization to a position, role, or other designation"
  {:db/ident :fibo-fnd-rel-rel/hasDesignation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-aap-agt/AutonomousAgent,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
   :rdfs/label "has designation",
   :skos/definition
   "relates an individual or organization to a position, role, or other designation"})

(def hasFormalName
  "indicates a name by which something is known for some official purpose or context, or which is structured in some way such as to always follow the same format regardless of usage"
  {:db/ident :fibo-fnd-rel-rel/hasFormalName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
   :rdfs/label "has formal name",
   :rdfs/subPropertyOf [:lcc-lr/hasName :fibo-fnd-aap-agt/hasTextValue],
   :skos/definition
   "indicates a name by which something is known for some official purpose or context, or which is structured in some way such as to always follow the same format regardless of usage"})

(def hasIdentity
  "provides a means for identifying something that fills a particular role"
  {:cmns-av/explanatoryNote
   "This property should be read as being a property of some kind of 'relative thing' as defined externality to this ontology. The property is usually but not exclusively framed with reference to some 'independent thing' but may take other forms and so should be regarded as having a target of 'thing'.",
   :db/ident :fibo-fnd-rel-rel/hasIdentity,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
   :rdfs/label "has identity",
   :rdfs/subPropertyOf :lcc-lr/has,
   :skos/definition
   "provides a means for identifying something that fills a particular role"})

(def hasLegalName
  "specifies the name used to refer to a party in legal communications"
  {:db/ident :fibo-fnd-rel-rel/hasLegalName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
   :rdfs/label "has legal name",
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/hasFormalName,
   :skos/definition
   "specifies the name used to refer to a party in legal communications"})

(def hasRepresentation
  "relates a concept to some textual or other symbol which is intended to convey the sense of that concept or to some form of words which sets out the meaning of that concept"
  {:db/ident :fibo-fnd-rel-rel/hasRepresentation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
   :rdfs/label "has representation",
   :rdfs/subPropertyOf :lcc-lr/has,
   :skos/definition
   "relates a concept to some textual or other symbol which is intended to convey the sense of that concept or to some form of words which sets out the meaning of that concept"})

(def holds
  "is the relationship between a party and something it possesses, or over which it exercises some ownership or control or has at its discretion the ability to dispose of it as it sees fit"
  {:db/ident :fibo-fnd-rel-rel/holds,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
   :rdfs/label "holds",
   :skos/definition
   "is the relationship between a party and something it possesses, or over which it exercises some ownership or control or has at its discretion the ability to dispose of it as it sees fit"})

(def involves
  "(of a situation or event) includes (something) as a necessary part or result"
  {:db/ident :fibo-fnd-rel-rel/involves,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
   :rdfs/label "involves",
   :skos/definition
   "(of a situation or event) includes (something) as a necessary part or result"})

(def isCausedBy
  "is the relationship between an event (the effect) and a second event (the cause), where the first event is understood as a consequence of the second; also, the relationship between a set of factors (causes) and a phenomenon (the effect)"
  {:db/ident :fibo-fnd-rel-rel/isCausedBy,
   :owl/inverseOf :fibo-fnd-rel-rel/causes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
   :rdfs/label "is caused by",
   :skos/definition
   "is the relationship between an event (the effect) and a second event (the cause), where the first event is understood as a consequence of the second; also, the relationship between a set of factors (causes) and a phenomenon (the effect)"})

(def isCharacterizedBy
  "indicates a quality or feature of something, distinguishing it from something else"
  {:db/ident :fibo-fnd-rel-rel/isCharacterizedBy,
   :owl/inverseOf :fibo-fnd-rel-rel/characterizes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
   :rdfs/label "is characterized by",
   :skos/definition
   "indicates a quality or feature of something, distinguishing it from something else"})

(def isConferredBy
  "a relationship between a right or obligation and the vehicle, such as an agreement or contract, that vests (or confers) said right or obligation"
  {:cmns-av/explanatoryNote
   "This property should be read as describing some legal power or duty, some commitment or some social construct being conferred as a result of some social construct such as an agreement or some legal authority. These concepts, which would describe the kind of thing of which this is a property, and the kinds of thing in terms of which this property is framed, are outside the scope of this model and so are not shown.",
   :db/ident :fibo-fnd-rel-rel/isConferredBy,
   :owl/inverseOf :fibo-fnd-rel-rel/confers,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
   :rdfs/label "is conferred by",
   :skos/definition
   "a relationship between a right or obligation and the vehicle, such as an agreement or contract, that vests (or confers) said right or obligation"})

(def isConferredOn
  "that on which the conferred thing is conferred"
  {:db/ident :fibo-fnd-rel-rel/isConferredOn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
   :rdfs/label "is conferred on",
   :rdfs/range :fibo-fnd-aap-agt/AutonomousAgent,
   :skos/definition "that on which the conferred thing is conferred"})

(def isControlledBy
  "is influenced, managed, or directed by"
  {:db/ident :fibo-fnd-rel-rel/isControlledBy,
   :owl/inverseOf :fibo-fnd-rel-rel/controls,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
   :rdfs/label "is controlled by",
   :skos/definition "is influenced, managed, or directed by"})

(def isDefinedIn
  "indicates something that specifies the meaning associated with the subject"
  {:cmns-av/explanatoryNote
   "Typically, a concept, such as a classifier or identifier, will be defined in terms of a scheme, contract, specification, standard, or other reference.",
   :db/ident :fibo-fnd-rel-rel/isDefinedIn,
   :owl/inverseOf :fibo-fnd-rel-rel/defines,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
   :rdfs/label "is defined in",
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/hasRepresentation,
   :skos/definition
   "indicates something that specifies the meaning associated with the subject"})

(def isDescribedBy
  "has general nature or description"
  {:db/ident :fibo-fnd-rel-rel/isDescribedBy,
   :owl/inverseOf :fibo-fnd-rel-rel/describes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
   :rdfs/label "is described by",
   :skos/definition "has general nature or description"})

(def isDesignatedBy
  "indicates the party that has assigned or appointed someone to an office or position"
  {:db/ident :fibo-fnd-rel-rel/isDesignatedBy,
   :owl/inverseOf :fibo-fnd-rel-rel/designates,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
   :rdfs/label "is designated by",
   :skos/definition
   "indicates the party that has assigned or appointed someone to an office or position"})

(def isEvaluatedBy
  "is ascertained or determined by"
  {:db/ident :fibo-fnd-rel-rel/isEvaluatedBy,
   :owl/inverseOf :fibo-fnd-rel-rel/evaluates,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
   :rdfs/label "is evaluated by",
   :skos/definition "is ascertained or determined by"})

(def isGeneratedBy
  "identifies some party or something that produces something via some equation, logic, or rules"
  {:db/ident :fibo-fnd-rel-rel/isGeneratedBy,
   :owl/inverseOf :fibo-fnd-rel-rel/generates,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
   :rdfs/label "is generated by",
   :skos/definition
   "identifies some party or something that produces something via some equation, logic, or rules"})

(def isGovernedBy
  "relates a contract, agreement, jurisdiction, or other legal construct and the regulation, policy, procedure, or legal person that regulates or oversees (governs) it"
  {:cmns-av/explanatoryNote
   "This property should be read as being the property of some thing and as referring to a logical union of social construct (in the informative abstractions ontology) and legal person.",
   :db/ident :fibo-fnd-rel-rel/isGovernedBy,
   :owl/inverseOf :fibo-fnd-rel-rel/governs,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
   :rdfs/label "is governed by",
   :skos/definition
   "relates a contract, agreement, jurisdiction, or other legal construct and the regulation, policy, procedure, or legal person that regulates or oversees (governs) it"})

(def isHeldBy
  "indicates the party that possesses and has at least partial control of something, regardless of ownership"
  {:db/ident :fibo-fnd-rel-rel/isHeldBy,
   :owl/inverseOf :fibo-fnd-rel-rel/holds,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
   :rdfs/label "is held by",
   :skos/definition
   "indicates the party that possesses and has at least partial control of something, regardless of ownership"})

(def isIncludedIn
  "relates something to something that contains it"
  {:db/ident :fibo-fnd-rel-rel/isIncludedIn,
   :owl/inverseOf :fibo-fnd-rel-rel/comprises,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
   :rdfs/label "is included in",
   :skos/definition "relates something to something that contains it"})

(def isIssuedBy
  "indicates a functional entity or party responsible for circulating, distributing, or publishing something"
  {:db/ident :fibo-fnd-rel-rel/isIssuedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
   :rdfs/label "is issued by",
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/isProvidedBy,
   :skos/definition
   "indicates a functional entity or party responsible for circulating, distributing, or publishing something"})

(def isManagedBy
  "relates something to another thing that has some role in directing its affairs"
  {:cmns-av/explanatoryNote
   "The target or range of this property should be read as always being some kind of 'relative thing', that is a thing defined in some context. Generally this will be a 'party in role'. This property is not intended to be used to relate a thing to some independent thing which it is managed by, only to something in the role of being that which manages it.",
   :db/ident :fibo-fnd-rel-rel/isManagedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
   :rdfs/label "is managed by",
   :skos/definition
   "relates something to another thing that has some role in directing its affairs"})

(def isMandatedBy
  "relates a responsibility, capacity, or action to that which requires it"
  {:db/ident :fibo-fnd-rel-rel/isMandatedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
   :rdfs/label "is mandated by",
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/isConferredBy,
   :skos/definition
   "relates a responsibility, capacity, or action to that which requires it"})

(def isProducedBy
  "identifies the producer that fabricates, manufactures or otherwise creates something through some production process"
  {:db/ident :fibo-fnd-rel-rel/isProducedBy,
   :owl/inverseOf :fibo-fnd-rel-rel/produces,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
   :rdfs/label "is produced by",
   :skos/definition
   "identifies the producer that fabricates, manufactures or otherwise creates something through some production process"})

(def isProvidedBy
  "is made available by"
  {:cmns-av/explanatoryNote
   "The target or range of this property should be read as always being some kind of 'relative thing', that is a thing defined in some context. Generally this will be a 'party in role'. This property is not intended to be used to relate a thing to some independent thing which it is provided by, only to something in the role of being that which provides it.",
   :db/ident :fibo-fnd-rel-rel/isProvidedBy,
   :owl/inverseOf :fibo-fnd-rel-rel/provides,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
   :rdfs/label "is provided by",
   :skos/definition "is made available by"})

(def issues
  "officially makes something available"
  {:db/ident :fibo-fnd-rel-rel/issues,
   :owl/inverseOf :fibo-fnd-rel-rel/isIssuedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
   :rdfs/label "issues",
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/provides,
   :skos/definition "officially makes something available"})

(def manages
  "relates a party to something that it directs in some way"
  {:db/ident :fibo-fnd-rel-rel/manages,
   :owl/inverseOf :fibo-fnd-rel-rel/isManagedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
   :rdfs/label "manages",
   :skos/definition "relates a party to something that it directs in some way"})

(def mandates
  "relates something to a commitment, contract, law, obligation, requirement, regulation, or similar concept that requires it"
  {:db/ident :fibo-fnd-rel-rel/mandates,
   :owl/inverseOf :fibo-fnd-rel-rel/isMandatedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
   :rdfs/label "mandates",
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/confers,
   :skos/definition
   "relates something to a commitment, contract, law, obligation, requirement, regulation, or similar concept that requires it"})

(def produces
  "creates through a fabrication, manufacturing or production process"
  {:db/ident :fibo-fnd-rel-rel/produces,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
   :rdfs/label "produces",
   :skos/definition
   "creates through a fabrication, manufacturing or production process"})

(def provides
  "makes something available"
  {:db/ident :fibo-fnd-rel-rel/provides,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
   :rdfs/label "provides",
   :skos/definition "makes something available"})

(def refersTo
  "classifies, provides context for, or indicates"
  {:db/ident :fibo-fnd-rel-rel/refersTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
   :rdfs/label "refers to",
   :skos/definition "classifies, provides context for, or indicates"})

(def represents
  "illustrates, symbolizes, exemplifies, stands for, or means"
  {:db/ident :fibo-fnd-rel-rel/represents,
   :owl/inverseOf :fibo-fnd-rel-rel/hasRepresentation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
   :rdfs/label "represents",
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/refersTo,
   :skos/definition
   "illustrates, symbolizes, exemplifies, stands for, or means"})

(def wasFormerlyKnownAs
  "indicates a name by which something was known in the past"
  {:db/ident :fibo-fnd-rel-rel/wasFormerlyKnownAs,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
   :rdfs/label "was formerly known as",
   :rdfs/subPropertyOf [:lcc-lr/hasName :fibo-fnd-aap-agt/hasTextValue],
   :skos/definition
   "indicates a name by which something was known in the past"})

(def ^{:private true} Name
  {:db/ident        :fibo-fnd-aap-agt/Name,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :fibo-fnd-rel-rel/Reference})

(def ^{:private true} classifies
  {:db/ident :lcc-cr/classifies,
   :rdf/type :owl/ObjectProperty,
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/refersTo})

(def ^{:private true} denotes
  {:db/ident :lcc-lr/denotes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/represents})

(def ^{:private true} hasDenotation
  {:db/ident :lcc-lr/hasDenotation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/hasRepresentation})