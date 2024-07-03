(ns net.wikipunk.rdf.fibo-fnd-aap-agt
  {:cmns-av/copyright
   #{"Copyright (c) 2013-2024 EDM Council, Inc."
     "Copyright (c) 2013-2024 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/AgentsAndPeople/Agents/",
   :dcterms/abstract
   "This ontology extends the Commons 1.1 Parties and Situations ontology to define defines the concept of a software system, which may or may not be autonomous. Other concepts that were originally defined in this ontology have been replaced with their corresponding concepts in Commons.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-dsg" "https://www.omg.org/spec/Commons/Designators/",
    "cmns-pts" "https://www.omg.org/spec/Commons/PartiesAndSituations/",
    "cmns-txt" "https://www.omg.org/spec/Commons/TextDatatype/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-aap-agt"
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents/",
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
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/TextDatatype/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/AgentsAndPeople/Agents/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fnd-aap-agt",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents/",
   :rdfs/label "Agents Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents.rdf version of this ontology was modified to address hygiene issues with respect to text formatting."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents.rdf version of this ontology was modified to loosen the range restriction on hasName to rdfs:Literal, facilitating multi-lingual name representation."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents.rdf version of the ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents.rdf version of this ontology was modified to add notes on the custom Text datatype indicating that it is outside the RL profile and that if someone wants to use this ontology with OWL 2 RL rules they might want to comment this out / eliminate it where it is used."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents.rdf version of this ontology was modified to support the FIBO 2.0 RFC, primarily with respect to equivalence relationships to LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents.rdf version of this ontology was modified to add a custom datatype for text values (which might be either xsd:string or rdf:langString) and use that in the restriction on hasName on autonomous agent."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/Foundations/20130601/AgentsAndPeople/Agents.owl version of the ontology was revised in advance of the September 2013 New Brunswick, NJ meeting, as follows:\n\t\t(1) to use slash style URI/IRIs (also called 303 URIs, vs. hash style) as required to support server side processing \n\t\t(2) to use version-independent IRIs for all definitions internally as opposed to version-specific IRIs\n\t\t(3) to change the file suffix from .owl to .rdf to increase usability in RDF tools\n\t\t(4) to use 4-level abbreviations and corresponding namespace prefixes for all FIBO ontologies, reflecting a family/specification/module/ontology structure\n\t\t(5) to incorporate changes to the specification metadata to support documentation at the family, specification, module, and ontology level, similar to the abbreviations."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents.rdf version of this ontology was modified to eliminate duplication with concepts in LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents.rdf version of the ontology was modified to eliminate deprecations that are more than 6 months old."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents.rdf version of this ontology was modified per the issue resolutions identified in the FIBO FND 1.0 FTF report and in https://spec.edmcouncil.org/fibo/ontology/FND/1.0/AboutFND-1.0/."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents/"})

(def AutomatedSystem
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.reference.com/technology/automated-system-c85583d0f17a632"},
   :db/ident :fibo-fnd-aap-agt/AutomatedSystem,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents/"},
   :rdfs/label "automated system",
   :rdfs/subClassOf :cmns-pts/Agent,
   :skos/definition
   "system that reduces or eliminates the need for human involvement in order to complete a task"})

(def AutonomousAgent
  {:db/ident :fibo-fnd-aap-agt/AutonomousAgent,
   :owl/deprecated true,
   :owl/equivalentClass :cmns-pts/Agent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents/"}})

(def urn:uuid:528d7f5f-0015-539f-8a83-f91b4af3d265
  {:cmns-av/copyright
   #{"Copyright (c) 2013-2024 EDM Council, Inc."
     "Copyright (c) 2013-2024 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology extends the Commons 1.1 Parties and Situations ontology to define defines the concept of a software system, which may or may not be autonomous. Other concepts that were originally defined in this ontology have been replaced with their corresponding concepts in Commons.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/TextDatatype/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/AgentsAndPeople/Agents/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Agents Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents.rdf version of this ontology was modified to address hygiene issues with respect to text formatting."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents.rdf version of this ontology was modified to loosen the range restriction on hasName to rdfs:Literal, facilitating multi-lingual name representation."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents.rdf version of the ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents.rdf version of this ontology was modified to add notes on the custom Text datatype indicating that it is outside the RL profile and that if someone wants to use this ontology with OWL 2 RL rules they might want to comment this out / eliminate it where it is used."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents.rdf version of this ontology was modified to support the FIBO 2.0 RFC, primarily with respect to equivalence relationships to LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents.rdf version of this ontology was modified to add a custom datatype for text values (which might be either xsd:string or rdf:langString) and use that in the restriction on hasName on autonomous agent."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/Foundations/20130601/AgentsAndPeople/Agents.owl version of the ontology was revised in advance of the September 2013 New Brunswick, NJ meeting, as follows:\n\t\t(1) to use slash style URI/IRIs (also called 303 URIs, vs. hash style) as required to support server side processing \n\t\t(2) to use version-independent IRIs for all definitions internally as opposed to version-specific IRIs\n\t\t(3) to change the file suffix from .owl to .rdf to increase usability in RDF tools\n\t\t(4) to use 4-level abbreviations and corresponding namespace prefixes for all FIBO ontologies, reflecting a family/specification/module/ontology structure\n\t\t(5) to incorporate changes to the specification metadata to support documentation at the family, specification, module, and ontology level, similar to the abbreviations."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents.rdf version of this ontology was modified to eliminate duplication with concepts in LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents.rdf version of the ontology was modified to eliminate deprecations that are more than 6 months old."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents.rdf version of this ontology was modified per the issue resolutions identified in the FIBO FND 1.0 FTF report and in https://spec.edmcouncil.org/fibo/ontology/FND/1.0/AboutFND-1.0/."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents/"})