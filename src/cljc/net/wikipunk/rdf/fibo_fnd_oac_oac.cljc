(ns net.wikipunk.rdf.fibo-fnd-oac-oac
  {:cmns-av/copyright
   #{"Copyright (c) 2013-2024 EDM Council, Inc."
     "Copyright (c) 2013-2024 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/OwnershipAndControl/OwnershipAndControl/",
   :dcterms/abstract
   "This ontology brings the concepts of ownership and control together, in cases where the combined semantics are applicable, such as for a wholly owned subsidiary.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-pts" "https://www.omg.org/spec/Commons/PartiesAndSituations/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-oac-ctl"
    "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Control/",
    "fibo-fnd-oac-oac"
    "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/OwnershipAndControl/",
    "fibo-fnd-oac-own"
    "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Ownership/",
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
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/OwnershipAndControl/Ownership/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/OwnershipAndControl/Control/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/OwnershipAndControl/OwnershipAndControl/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fnd-oac-oac",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/OwnershipAndControl/",
   :rdfs/label "Ownership and Control Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/OwnershipAndControl.rdf version of the ontology was modified to address hygiene issues with respect to text formatting."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/OwnershipAndControl.rdf version of the ontology was modified to better integrate it with the situation pattern and eliminate circular definitions."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/OwnershipAndControl.rdf version of the ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/OwnershipAndControl.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "This ontology was added to Foundations in advance of the December 2014 Long Beach meeting in support of the issue resolutions identified in the FIBO FND 1.0 FTF report and in https://spec.edmcouncil.org/fibo/ontology/FND/1.0/AboutFND-1.0/."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/OwnershipAndControl.rdf version of the ontology was modified to integrate the properties defined herein with the ownership and control patterns."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/OwnershipAndControl/"})

(def OwnershipControlSituation
  {:db/ident :fibo-fnd-oac-oac/OwnershipControlSituation,
   :owl/equivalentClass {:owl/intersectionOf [:fibo-fnd-oac-ctl/Control
                                              :fibo-fnd-oac-own/Ownership],
                         :rdf/type :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/OwnershipAndControl/"},
   :rdfs/label "ownership control situation",
   :rdfs/subClassOf :cmns-pts/Situation,
   :skos/definition
   "situation in which some party owns and controls something"})

(def isOwnedAndControlledBy
  {:db/ident :fibo-fnd-oac-oac/isOwnedAndControlledBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/OwnershipAndControl/"},
   :rdfs/label "is owned and controlled by",
   :rdfs/range :cmns-pts/Party,
   :rdfs/subPropertyOf #{:fibo-fnd-rel-rel/isControlledBy
                         :fibo-fnd-oac-own/isOwnedBy},
   :skos/definition
   "relates something to the party that owns, influences, manages and directs it"})

(def ownsAndControls
  {:db/ident :fibo-fnd-oac-oac/ownsAndControls,
   :owl/inverseOf :fibo-fnd-oac-oac/isOwnedAndControlledBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :cmns-pts/Party,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/OwnershipAndControl/"},
   :rdfs/label "owns and controls",
   :rdfs/subPropertyOf #{:fibo-fnd-rel-rel/controls :fibo-fnd-oac-own/owns},
   :skos/definition
   "directs and exercises authoritative or dominating influence over some thing that is also owned",
   :skos/editorialNote
   "basic rule: if x controls y and x owns y then x owns and controls y\nSWRL rule: controls(?x, ?y), owns(?x, ?y) -> ownsAndControls(?x, ?y)"})

(def urn:uuid:282cb0c6-9f8c-57ad-a4e3-0dcb38284ec9
  {:cmns-av/copyright
   #{"Copyright (c) 2013-2024 EDM Council, Inc."
     "Copyright (c) 2013-2024 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology brings the concepts of ownership and control together, in cases where the combined semantics are applicable, such as for a wholly owned subsidiary.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/OwnershipAndControl/Ownership/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/OwnershipAndControl/Control/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/OwnershipAndControl/OwnershipAndControl/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Ownership and Control Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/OwnershipAndControl.rdf version of the ontology was modified to address hygiene issues with respect to text formatting."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/OwnershipAndControl.rdf version of the ontology was modified to better integrate it with the situation pattern and eliminate circular definitions."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/OwnershipAndControl.rdf version of the ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/OwnershipAndControl.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "This ontology was added to Foundations in advance of the December 2014 Long Beach meeting in support of the issue resolutions identified in the FIBO FND 1.0 FTF report and in https://spec.edmcouncil.org/fibo/ontology/FND/1.0/AboutFND-1.0/."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/OwnershipAndControl.rdf version of the ontology was modified to integrate the properties defined herein with the ownership and control patterns."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/OwnershipAndControl/"})