(ns net.wikipunk.rdf.fibo-fnd-oac-ctl
  "This ontology defines high-level, control-related concepts, including basic concepts for control, along with a distinction between de jure and de facto control, the former being derived with reference to terms in the LegalCapacity ontology."
  {:cmns-av/copyright ["Copyright (c) 2013-2023 Object Management Group, Inc."
                       "Copyright (c) 2013-2023 EDM Council, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Control/",
   :dcterms/abstract
   "This ontology defines high-level, control-related concepts, including basic concepts for control, along with a distinction between de jure and de facto control, the former being derived with reference to terms in the LegalCapacity ontology.",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/LegalCapacity/"
    "https://www.omg.org/spec/Commons/DatesAndTimes/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Parties/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Roles/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/OwnershipAndControl/Control/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-law-lcap"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/",
    "fibo-fnd-oac-ctl"
    "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Control/",
    "fibo-fnd-pty-pty"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fnd-oac-ctl",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Control/",
   :rdfs/label "Control Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Control.rdf version of the ontology was modified to incorporate the latest insights into how control relations should integrate with the control situation and to unwind confusion around the various properties used to represent aspects of control with respect to their domains and ranges."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Control.rdf version of the ontology was modified to address hygiene issues with respect to text formatting."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Control.rdf version of the ontology was modified to simplify control concepts and relations, complete the control patterns, and eliminate ambiguity in definitions."
    "The http://www.omg.org/spec/FIBO/Foundations/20130601/OwnershipAndControl/Control.owl version of the ontology was revised in advance of the September 2013 New Brunswick, NJ meeting, as follows:\n\t(1) to use slash style URI/IRIss (also called 303 URIs, vs. hash style) as required to support server side processing \n\t(2) to use version-independent IRIs for all definitions internally as opposed to version-specific IRIs\n\t(3) to change the file suffix from .owl to .rdf to increase usability in RDF tools\n\t(4) to use 4-level abbreviations and corresponding namespace prefixes for all FIBO ontologies, reflecting a family/specification/module/ontology structure\n\t(5) to incorporate changes to the specification metadata to support documentation at the family, specification, module, and ontology level, similar to the abbreviations."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Control.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Control.rdf version of the ontology was modified to eliminate references to external dictionary sites that no longer resolve."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Control.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Control.rdf version of the ontology was was modified per the issue resolutions identified in the FIBO FND 1.0 FTF report and in https://spec.edmcouncil.org/fibo/ontology/FND/1.0/AboutFND-1.0/."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Control.rdf version of the ontology was modified to integrate the concept of a situation, situational roles, and corresponding relations with the definition of control and eliminate minimum cardinality of 1 restrictions."]})

(def Control
  "situation in which some party has the power to direct or strongly influence the direction of the management and policies related to something"
  {:cmns-av/explanatoryNote
   "Control may be direct (explicit) or indirect (implicit), derived through ownership of voting shares, beneficial ownership, other ownership relations, through provisions of a contract, or otherwise.",
   :db/ident :fibo-fnd-oac-ctl/Control,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Control/",
   :rdfs/label "control",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-oac-ctl/involvesControlledThing,
                      :owl/someValuesFrom :fibo-fnd-oac-ctl/ControlledThing,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-oac-ctl/hasPartyInControl,
                      :owl/someValuesFrom :fibo-fnd-oac-ctl/ControllingParty,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-pty-pty/Situation],
   :skos/definition
   "situation in which some party has the power to direct or strongly influence the direction of the management and policies related to something"})

(def ControlledThing
  "something over which some party exercises some form of control with respect to some situation"
  {:db/ident :fibo-fnd-oac-ctl/ControlledThing,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Control/",
   :rdfs/label "controlled thing",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-oac-ctl/isControlledThingIn,
                      :owl/someValuesFrom :fibo-fnd-oac-ctl/Control,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-oac-ctl/hasControllingParty,
                      :owl/someValuesFrom :fibo-fnd-oac-ctl/ControllingParty,
                      :rdf/type           :owl/Restriction}
                     {:owl/onDataRange :cmns-dt/CombinedDateTime,
                      :owl/onProperty :fibo-fnd-oac-ctl/isInitiallyControlledOn,
                      :owl/qualifiedCardinality 1,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-pty-pty/Undergoer],
   :skos/definition
   "something over which some party exercises some form of control with respect to some situation"})

(def ControllingParty
  "actor that exercises some form of control in the context of some situation"
  {:db/ident :fibo-fnd-oac-ctl/ControllingParty,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Control/",
   :rdfs/label "controlling party",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-oac-ctl/isPartyControlling,
                      :owl/someValuesFrom :fibo-fnd-oac-ctl/ControlledThing,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-fnd-oac-ctl/isControllingPartyIn,
                      :owl/someValuesFrom :fibo-fnd-oac-ctl/Control,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-pty-pty/Actor],
   :skos/definition
   "actor that exercises some form of control in the context of some situation",
   :skos/editorialNote
   "At this level of abstraction it is not defined whether the control is some degree of controlling interest, or some level of actual control (asserted or calculated) in some entity."})

(def DeFactoControl
  "control that exists informally and is accepted, although not formally recognized"
  {:cmns-av/explanatoryNote
   "For example, de facto acquisition or change of control means the acquisition, directly or indirectly, by any person or group of persons acting jointly or in concert, of beneficial ownership of, or control or direction over, sufficient voting shares of some legal entity to permit such person or persons to exercise, or to control or direct the voting of, 50 percent or more of the total number of votes in that entity.",
   :db/ident :fibo-fnd-oac-ctl/DeFactoControl,
   :owl/disjointWith :fibo-fnd-oac-ctl/DeJureControl,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Control/",
   :rdfs/label "de facto control",
   :rdfs/subClassOf [:fibo-fnd-oac-ctl/Control
                     {:owl/onProperty     :fibo-fnd-oac-ctl/hasPartyInControl,
                      :owl/someValuesFrom :fibo-fnd-oac-ctl/ControllingParty,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-fnd-oac-ctl/involvesControlledThing,
                      :owl/someValuesFrom :fibo-fnd-oac-ctl/ControlledThing,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-pty-pty/Situation],
   :skos/definition
   "control that exists informally and is accepted, although not formally recognized"})

(def DeJureControl
  "control that exists as a matter of law, i.e., legitimate, legal control of something"
  {:db/ident :fibo-fnd-oac-ctl/DeJureControl,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Control/",
   :rdfs/label "de jure control",
   :rdfs/subClassOf [:fibo-fnd-oac-ctl/Control
                     :fibo-fnd-law-lcap/LegalConstruct
                     {:owl/onProperty     :fibo-fnd-oac-ctl/hasPartyInControl,
                      :owl/someValuesFrom :fibo-fnd-oac-ctl/ControllingParty,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-fnd-oac-ctl/involvesControlledThing,
                      :owl/someValuesFrom :fibo-fnd-oac-ctl/ControlledThing,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-pty-pty/Situation],
   :skos/definition
   "control that exists as a matter of law, i.e., legitimate, legal control of something"})

(def hasControllingParty
  "indicates the party that exercises authority or influence over something"
  {:db/ident :fibo-fnd-oac-ctl/hasControllingParty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-oac-ctl/ControlledThing,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Control/",
   :rdfs/label "has controlling party",
   :rdfs/range :fibo-fnd-oac-ctl/ControllingParty,
   :rdfs/subPropertyOf :fibo-fnd-pty-pty/isAffectedBy,
   :skos/definition
   "indicates the party that exercises authority or influence over something"})

(def hasPartyInControl
  "indicates the actor in the context of a control situation"
  {:db/ident :fibo-fnd-oac-ctl/hasPartyInControl,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-oac-ctl/Control,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Control/",
   :rdfs/label "has party in control",
   :rdfs/range :fibo-fnd-oac-ctl/ControllingParty,
   :rdfs/subPropertyOf :fibo-fnd-pty-pty/hasActor,
   :skos/definition
   "indicates the actor in the context of a control situation"})

(def involvesControlledThing
  "indicates something controlled in the context of a control situation"
  {:db/ident :fibo-fnd-oac-ctl/involvesControlledThing,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-oac-ctl/Control,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Control/",
   :rdfs/label "involves controlled thing",
   :rdfs/range :fibo-fnd-oac-ctl/ControlledThing,
   :rdfs/subPropertyOf :fibo-fnd-pty-pty/hasUndergoer,
   :skos/definition
   "indicates something controlled in the context of a control situation"})

(def isControlledPartyOf
  "indicates a controlling party that has some amount of authority or influence over it"
  {:db/ident :fibo-fnd-oac-ctl/isControlledPartyOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Control/",
   :rdfs/label "is controlled party of",
   :rdfs/range :fibo-fnd-oac-ctl/ControllingParty,
   :rdfs/subPropertyOf :fibo-fnd-pty-pty/isDirectlyAffectedBy,
   :skos/definition
   "indicates a controlling party that has some amount of authority or influence over it"})

(def isControlledThingIn
  "indicates the context of control in which something is being controlled"
  {:db/ident :fibo-fnd-oac-ctl/isControlledThingIn,
   :owl/inverseOf :fibo-fnd-oac-ctl/involvesControlledThing,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-oac-ctl/ControlledThing,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Control/",
   :rdfs/label "is controlled thing in",
   :rdfs/range :fibo-fnd-oac-ctl/Control,
   :rdfs/subPropertyOf :fibo-fnd-pty-pty/undergoes,
   :skos/definition
   "indicates the context of control in which something is being controlled"})

(def isControllingPartyIn
  "indicates the context of control in which the party plays the role of controlling something"
  {:db/ident :fibo-fnd-oac-ctl/isControllingPartyIn,
   :owl/inverseOf :fibo-fnd-oac-ctl/hasPartyInControl,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-oac-ctl/ControllingParty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Control/",
   :rdfs/label "is controlling party in",
   :rdfs/range :fibo-fnd-oac-ctl/Control,
   :rdfs/subPropertyOf :fibo-fnd-pty-pty/actsIn,
   :skos/definition
   "indicates the context of control in which the party plays the role of controlling something"})

(def isControllingPartyOf
  "indicates something that a controlling party has some amount of authority or influence over"
  {:db/ident :fibo-fnd-oac-ctl/isControllingPartyOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-oac-ctl/ControllingParty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Control/",
   :rdfs/label "is controlling party of",
   :rdfs/subPropertyOf :fibo-fnd-pty-pty/directlyAffects,
   :skos/definition
   "indicates something that a controlling party has some amount of authority or influence over"})

(def isInitiallyControlledOn
  "indicates the date or date and time that some level of authority or influence was first put in place"
  {:db/ident :fibo-fnd-oac-ctl/isInitiallyControlledOn,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Control/",
   :rdfs/label "is initially controlled on",
   :rdfs/range :cmns-dt/CombinedDateTime,
   :rdfs/subPropertyOf :cmns-dt/hasObservedDateTime,
   :skos/definition
   "indicates the date or date and time that some level of authority or influence was first put in place"})

(def isPartyControlling
  "indicates something controlled that a controlling party has some amount of authority or influence over"
  {:db/ident :fibo-fnd-oac-ctl/isPartyControlling,
   :owl/inverseOf :fibo-fnd-oac-ctl/hasControllingParty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-oac-ctl/ControllingParty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Control/",
   :rdfs/label "is party controlling",
   :rdfs/range :fibo-fnd-oac-ctl/ControlledThing,
   :rdfs/subPropertyOf :fibo-fnd-pty-pty/actsOn,
   :skos/definition
   "indicates something controlled that a controlling party has some amount of authority or influence over"})