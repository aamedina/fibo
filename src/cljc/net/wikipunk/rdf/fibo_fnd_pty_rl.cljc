(ns net.wikipunk.rdf.fibo-fnd-pty-rl
  {:cmns-av/copyright
   #{"Copyright (c) 2013-2024 EDM Council, Inc."
     "Copyright (c) 2013-2024 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Parties/Roles/",
   :dcterms/abstract
   "This ontology defined high-level concepts concerning roles, including the basic property whereby something has some role, along with the high-level concept of an agent playing a role. This provides the basis for party role concepts in the Parties ontology and is framed as some entity defined specifically in respect to some role which it performs in some context. Note that this ontology has been replaced by its equivalent in the OMG Commons Ontology Library v1.1, and will be eliminated in a subsequent FIBO release.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-pts" "https://www.omg.org/spec/Commons/PartiesAndSituations/",
    "cmns-rlcmp" "https://www.omg.org/spec/Commons/RolesAndCompositions/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-pty-rl"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Parties/Roles/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fnd-pty-rl",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles/",
   :rdfs/label "Roles Ontology",
   :skos/changeNote
   #{"The http://www.omg.org/spec/FIBO/Foundations/20130601/Roles/Roles.owl version of the ontology was revised in advance of the September 2013 New Brunswick, NJ meeting, as follows:\n   (1) to use slash style URI/IRIss (also called 303 URIs, vs. hash style) as required to support server side processing \n   (2) to use version-independent IRIs for all definitions internally as opposed to version-specific IRIs\n   (3) to change the file suffix from .owl to .rdf to increase usability in RDF tools\n   (4) to use 4-level abbreviations and corresponding namespace prefixes for all FIBO ontologies, reflecting a family/specification/module/ontology structure\n   (5) to incorporate changes to the specification metadata to support documentation at the family, specification, module, and ontology level, similar to the abbreviations.\n   (6) to combine Parties, Party Roles, and Roles in a single, new, Parties module."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://www.omg.org/spec/EDMC-FIBO/FND/20200201/Parties/Roles.rdf version of the ontology was modified to eliminate an unused Role class and hasRole property, which were confusing to users, and to eliminate circularities in remaining definitions."
     "The http://www.omg.org/spec/EDMC-FIBO/FND/20130801/Parties/Roles.rdf version of the ontology was was modified per the issue resolutions identified in the FIBO FND 1.0 FTF report and in http://www.omg.org/spec/EDMC-FIBO/FND/1.0/AboutFND-1.0/."
     "The https://www.omg.org/spec/EDMC-FIBO/FND/20180801/Parties/Roles.rdf version of the ontology was modified to eliminate duplication of concepts in LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles.rdf version of the ontology was modified extensively to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."},
   :xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles/"})

(def AgentInRole
  {:db/ident :fibo-fnd-pty-rl/AgentInRole,
   :owl/deprecated true,
   :owl/equivalentClass :cmns-pts/AgentRole,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles/"}})

(def ThingInRole
  {:db/ident :fibo-fnd-pty-rl/ThingInRole,
   :owl/deprecated true,
   :owl/equivalentClass :cmns-rlcmp/Role,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles/"}})

(def isPlayedBy
  {:db/ident :fibo-fnd-pty-rl/isPlayedBy,
   :owl/deprecated true,
   :owl/equivalentProperty :cmns-rlcmp/isPlayedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles/"}})

(def playsRole
  {:db/ident :fibo-fnd-pty-rl/playsRole,
   :owl/deprecated true,
   :owl/equivalentProperty :cmns-rlcmp/playsRole,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles/"}})

(def urn:uuid:e51f8583-5b78-527d-97da-1f4e2978df00
  {:cmns-av/copyright
   #{"Copyright (c) 2013-2024 EDM Council, Inc."
     "Copyright (c) 2013-2024 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology defined high-level concepts concerning roles, including the basic property whereby something has some role, along with the high-level concept of an agent playing a role. This provides the basis for party role concepts in the Parties ontology and is framed as some entity defined specifically in respect to some role which it performs in some context. Note that this ontology has been replaced by its equivalent in the OMG Commons Ontology Library v1.1, and will be eliminated in a subsequent FIBO release.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Parties/Roles/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Roles Ontology",
   :skos/changeNote
   #{"The http://www.omg.org/spec/FIBO/Foundations/20130601/Roles/Roles.owl version of the ontology was revised in advance of the September 2013 New Brunswick, NJ meeting, as follows:\n   (1) to use slash style URI/IRIss (also called 303 URIs, vs. hash style) as required to support server side processing \n   (2) to use version-independent IRIs for all definitions internally as opposed to version-specific IRIs\n   (3) to change the file suffix from .owl to .rdf to increase usability in RDF tools\n   (4) to use 4-level abbreviations and corresponding namespace prefixes for all FIBO ontologies, reflecting a family/specification/module/ontology structure\n   (5) to incorporate changes to the specification metadata to support documentation at the family, specification, module, and ontology level, similar to the abbreviations.\n   (6) to combine Parties, Party Roles, and Roles in a single, new, Parties module."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://www.omg.org/spec/EDMC-FIBO/FND/20200201/Parties/Roles.rdf version of the ontology was modified to eliminate an unused Role class and hasRole property, which were confusing to users, and to eliminate circularities in remaining definitions."
     "The http://www.omg.org/spec/EDMC-FIBO/FND/20130801/Parties/Roles.rdf version of the ontology was was modified per the issue resolutions identified in the FIBO FND 1.0 FTF report and in http://www.omg.org/spec/EDMC-FIBO/FND/1.0/AboutFND-1.0/."
     "The https://www.omg.org/spec/EDMC-FIBO/FND/20180801/Parties/Roles.rdf version of the ontology was modified to eliminate duplication of concepts in LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles.rdf version of the ontology was modified extensively to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."},
   :xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles/"})