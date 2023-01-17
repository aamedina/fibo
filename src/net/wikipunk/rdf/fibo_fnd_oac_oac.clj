(ns net.wikipunk.rdf.fibo-fnd-oac-oac
  "This ontology brings the concepts of ownership and control together, in cases where the combined semantics are applicable, such as for a wholly owned subsidiary."
  {:cmns-av/copyright ["Copyright (c) 2013-2023 Object Management Group, Inc."
                       "Copyright (c) 2013-2023 EDM Council, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/OwnershipAndControl/",
   :dcterms/abstract
   "This ontology brings the concepts of ownership and control together, in cases where the combined semantics are applicable, such as for a wholly owned subsidiary.",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/OwnershipAndControl/Ownership/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Parties/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/OwnershipAndControl/Control/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/OwnershipAndControl/OwnershipAndControl/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-oac-ctl"
    "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Control/",
    "fibo-fnd-oac-oac"
    "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/OwnershipAndControl/",
    "fibo-fnd-oac-own"
    "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Ownership/",
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
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/OwnershipAndControl/",
   :rdfa/prefix "fibo-fnd-oac-oac",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/OwnershipAndControl/",
   :rdfs/label "Ownership and Control Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/OwnershipAndControl.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/OwnershipAndControl.rdf version of the ontology was modified to integrate the properties defined herein with the ownership and control patterns."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/OwnershipAndControl.rdf version of the ontology was modified to better integrate it with the situation pattern and eliminate circular definitions."
    "This ontology was added to Foundations in advance of the December 2014 Long Beach meeting in support of the issue resolutions identified in the FIBO FND 1.0 FTF report and in https://spec.edmcouncil.org/fibo/ontology/FND/1.0/AboutFND-1.0/."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/OwnershipAndControl.rdf version of the ontology was modified to address hygiene issues with respect to text formatting."]})

(def OwnershipControlSituation
  "situation in which some party owns and controls something"
  {:db/ident :fibo-fnd-oac-oac/OwnershipControlSituation,
   :owl/equivalentClass {:owl/intersectionOf [:fibo-fnd-oac-ctl/Control
                                              :fibo-fnd-oac-own/Ownership],
                         :rdf/type :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/OwnershipAndControl/",
   :rdfs/label "ownership control situation",
   :rdfs/subClassOf :fibo-fnd-pty-pty/Situation,
   :skos/definition
   "situation in which some party owns and controls something"})

(def isOwnedAndControlledBy
  "relates something to the party that owns, influences, manages and directs it"
  {:db/ident :fibo-fnd-oac-oac/isOwnedAndControlledBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/OwnershipAndControl/",
   :rdfs/label "is owned and controlled by",
   :rdfs/range :fibo-fnd-pty-pty/IndependentParty,
   :rdfs/subPropertyOf [:fibo-fnd-rel-rel/isControlledBy
                        :fibo-fnd-oac-own/isOwnedBy],
   :skos/definition
   "relates something to the party that owns, influences, manages and directs it"})

(def ownsAndControls
  "directs and exercises authoritative or dominating influence over some thing that is also owned"
  {:db/ident :fibo-fnd-oac-oac/ownsAndControls,
   :owl/inverseOf :fibo-fnd-oac-oac/isOwnedAndControlledBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-pty-pty/IndependentParty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/OwnershipAndControl/",
   :rdfs/label "owns and controls",
   :rdfs/subPropertyOf [:fibo-fnd-rel-rel/controls :fibo-fnd-oac-own/owns],
   :skos/definition
   "directs and exercises authoritative or dominating influence over some thing that is also owned",
   :skos/editorialNote
   "basic rule: if x controls y and x owns y then x owns and controls y\nSWRL rule: controls(?x, ?y), owns(?x, ?y) -> ownsAndControls(?x, ?y)"})