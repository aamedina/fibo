(ns net.wikipunk.rdf.fibo-fnd-pty-rl
  {:cmns-av/copyright #{"Copyright (c) 2013-2023 Object Management Group, Inc."
                        "Copyright (c) 2013-2023 EDM Council, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Roles/",
   :dcterms/abstract
   "This ontology defines high-level concepts concerning roles, including the basic property whereby something has some role, along with the high-level concept of an agent in a role. The agent in role concept provides the basis for party role concepts in the Parties ontology and is framed as some entity defined specifically in respect to some role which it performs in some context.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-aap-agt"
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents/",
    "fibo-fnd-pty-rl"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "skos"    "http://www.w3.org/2004/02/skos/core#",
    "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/AgentsAndPeople/Agents/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Roles/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fnd-pty-rl",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles/",
   :rdfs/label "Roles Ontology",
   :skos/changeNote
   #{"The http://www.omg.org/spec/FIBO/Foundations/20130601/Roles/Roles.owl version of the ontology was revised in advance of the September 2013 New Brunswick, NJ meeting, as follows:\n   (1) to use slash style URI/IRIss (also called 303 URIs, vs. hash style) as required to support server side processing \n   (2) to use version-independent IRIs for all definitions internally as opposed to version-specific IRIs\n   (3) to change the file suffix from .owl to .rdf to increase usability in RDF tools\n   (4) to use 4-level abbreviations and corresponding namespace prefixes for all FIBO ontologies, reflecting a family/specification/module/ontology structure\n   (5) to incorporate changes to the specification metadata to support documentation at the family, specification, module, and ontology level, similar to the abbreviations.\n   (6) to combine Parties, Party Roles, and Roles in a single, new, Parties module."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://www.omg.org/spec/EDMC-FIBO/FND/20200201/Parties/Roles.rdf version of the ontology was modified to eliminate an unused Role class and hasRole property, which were confusing to users, and to eliminate circularities in remaining definitions."
     "The http://www.omg.org/spec/EDMC-FIBO/FND/20130801/Parties/Roles.rdf version of the ontology was was modified per the issue resolutions identified in the FIBO FND 1.0 FTF report and in http://www.omg.org/spec/EDMC-FIBO/FND/1.0/AboutFND-1.0/."
     "The https://www.omg.org/spec/EDMC-FIBO/FND/20180801/Parties/Roles.rdf version of the ontology was modified to eliminate duplication of concepts in LCC."},
   :xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles/"})

(def AgentInRole
  {:cmns-av/adaptedFrom
   {:rdf/value
    "OMG Property and Casualty Information Models, dtc/12-01-04, Annex A, Glossary of Data Model Terms and Definitions"},
   :db/ident :fibo-fnd-pty-rl/AgentInRole,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles/"},
   :rdfs/label "agent-in-role",
   :rdfs/subClassOf #{{:owl/onClass    :fibo-fnd-aap-agt/AutonomousAgent,
                       :owl/onProperty :fibo-fnd-rel-rel/hasIdentity,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      :fibo-fnd-pty-rl/ThingInRole},
   :skos/definition
   "relative concept that ties an agent to a part they play in a given situational context"})

(def ThingInRole
  {:db/ident :fibo-fnd-pty-rl/ThingInRole,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles/"},
   :rdfs/label "thing-in-role",
   :rdfs/subClassOf {:owl/cardinality 1,
                     :owl/onProperty  :fibo-fnd-rel-rel/hasIdentity,
                     :rdf/type        :owl/Restriction},
   :skos/definition
   "relative concept that ties something to a part it plays in a given situational context"})

(def isPlayedBy
  {:db/ident :fibo-fnd-pty-rl/isPlayedBy,
   :owl/inverseOf :fibo-fnd-pty-rl/playsRole,
   :rdf/type #{:owl/ObjectProperty :owl/FunctionalProperty},
   :rdfs/domain :fibo-fnd-pty-rl/ThingInRole,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles/"},
   :rdfs/label "is played by",
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/hasIdentity,
   :skos/definition
   "indicates the independent thing, typically a person or organization filling a role",
   :skos/example
   "A party, counterparty, or third party to a contract is played by an organization or person; an issuer of a financial instrument is typically played by an organization."})

(def playsRole
  {:db/ident :fibo-fnd-pty-rl/playsRole,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles/"},
   :rdfs/label "plays role",
   :rdfs/range :fibo-fnd-pty-rl/ThingInRole,
   :skos/definition
   "indicates a part that an independent thing, such as a person or organization, plays under some circumstance",
   :skos/example
   "an organization in the role of employer, issuer, regulatory agency, bank, custodian, etc."})

(def urn:uuid:e51f8583-5b78-527d-97da-1f4e2978df00
  {:cmns-av/copyright #{"Copyright (c) 2013-2023 Object Management Group, Inc."
                        "Copyright (c) 2013-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology defines high-level concepts concerning roles, including the basic property whereby something has some role, along with the high-level concept of an agent in a role. The agent in role concept provides the basis for party role concepts in the Parties ontology and is framed as some entity defined specifically in respect to some role which it performs in some context.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/AgentsAndPeople/Agents/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Roles/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Roles Ontology",
   :skos/changeNote
   #{"The http://www.omg.org/spec/FIBO/Foundations/20130601/Roles/Roles.owl version of the ontology was revised in advance of the September 2013 New Brunswick, NJ meeting, as follows:\n   (1) to use slash style URI/IRIss (also called 303 URIs, vs. hash style) as required to support server side processing \n   (2) to use version-independent IRIs for all definitions internally as opposed to version-specific IRIs\n   (3) to change the file suffix from .owl to .rdf to increase usability in RDF tools\n   (4) to use 4-level abbreviations and corresponding namespace prefixes for all FIBO ontologies, reflecting a family/specification/module/ontology structure\n   (5) to incorporate changes to the specification metadata to support documentation at the family, specification, module, and ontology level, similar to the abbreviations.\n   (6) to combine Parties, Party Roles, and Roles in a single, new, Parties module."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://www.omg.org/spec/EDMC-FIBO/FND/20200201/Parties/Roles.rdf version of the ontology was modified to eliminate an unused Role class and hasRole property, which were confusing to users, and to eliminate circularities in remaining definitions."
     "The http://www.omg.org/spec/EDMC-FIBO/FND/20130801/Parties/Roles.rdf version of the ontology was was modified per the issue resolutions identified in the FIBO FND 1.0 FTF report and in http://www.omg.org/spec/EDMC-FIBO/FND/1.0/AboutFND-1.0/."
     "The https://www.omg.org/spec/EDMC-FIBO/FND/20180801/Parties/Roles.rdf version of the ontology was modified to eliminate duplication of concepts in LCC."},
   :xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles/"})