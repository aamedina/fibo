(ns net.wikipunk.rdf.fibo-fnd-law-cor
  "This ontology defines high-level legal concepts for use in other FIBO ontology elements. These concepts include law and constitution, both of which are framed at a more abstract level than national or state laws and constitutions, so that law forms the basis both for statutes and for company by-laws, and constitution forms the basis both for national or state constitutions and for instruments which are constitutive of incorporated legal entities. This ontology also defines some of the variants of these such as governmental constitutions and ordinances. Court of Law is also defined here."
  {:cmns-av/copyright ["Copyright (c) 2013-2022 Object Management Group, Inc."
                       "Copyright (c) 2013-2022 EDM Council, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCore/",
   :dcterms/abstract
   "This ontology defines high-level legal concepts for use in other FIBO ontology elements. These concepts include law and constitution, both of which are framed at a more abstract level than national or state laws and constitutions, so that law forms the basis both for statutes and for company by-laws, and constitution forms the basis both for national or state constitutions and for instruments which are constitutive of incorporated legal entities. This ontology also defines some of the variants of these such as governmental constitutions and ordinances. Court of Law is also defined here.",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Organizations/FormalOrganizations/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/LegalCore/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-law-cor"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCore/",
    "fibo-fnd-org-fm"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "lcc-lr" "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCore/",
   :rdfa/prefix "fibo-fnd-law-cor",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCore/",
   :rdfs/label "Legal Core Ontology",
   :skos/changeNote
   ["The http://www.omg.org/spec/FIBO/Foundations/20130601/Law/LegalCore.owl version of the ontology was revised in advance of the September 2013 New Brunswick, NJ meeting, as follows:\n\t(1) to use slash style URI/IRIss (also called 303 URIs, vs. hash style) as required to support server side processing \n\t(2) to use version-independent IRIs for all definitions internally as opposed to version-specific IRIs\n\t(3) to change the file suffix from .owl to .rdf to increase usability in RDF tools\n\t(4) to use 4-level abbreviations and corresponding namespace prefixes for all FIBO ontologies, reflecting a family/specification/module/ontology structure\n\t(5) to incorporate changes to the specification metadata to support documentation at the family, specification, module, and ontology level, similar to the abbreviations.\n\t(6) to revise some of the text definitions using more formal sources."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCore.rdf version of the ontology was revised to eliminate circular and ambiguous definitions, and simplify the ontology by eliminating unused concepts, including GovernmentalConstitution, Ordinance and narrowly defined and unused properties - constrains and isConstrainedBy."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCore.rdf version of the ontology was revised to address hygiene issues with respect to text formatting."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCore.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
    "The http://www.omg.org/spec/EDMC-FIBO/FND/20141101/Law/LegalCore.rdf version of the ontology was was modified per the FIBO 2.0 RFC."
    "The http://www.omg.org/spec/EDMC-FIBO/FND/20130801/Law/LegalCore.rdf version of the ontology was was modified per the issue resolutions identified in the FIBO FND 1.0 FTF report and in http://www.omg.org/spec/EDMC-FIBO/FND/1.0/AboutFND-1.0/."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCore.rdf version of the ontology was revised to correct the camel case name of hasInForce (was hasInforce)."]})

(def Constitution
  "set of basic principles by which an organization is governed, especially in relation to the rights of the people it governs"
  {:cmns-av/explanatoryNote
   "A constitution is an aggregate of fundamental principles or established precedents that constitute the legal basis of a polity, organisation or other type of entity and commonly determine how that entity is to be governed.",
   :db/ident :fibo-fnd-law-cor/Constitution,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCore/",
   :rdfs/label "constitution",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/governs,
                      :owl/someValuesFrom :fibo-fnd-law-cor/Law,
                      :rdf/type           :owl/Restriction}
                     :lcc-lr/Collection],
   :skos/definition
   "set of basic principles by which an organization is governed, especially in relation to the rights of the people it governs"})

(def CourtOfLaw
  "person or body of persons having judicial authority to hear and resolve disputes on the basis of statutes or the common law"
  {:cmns-av/explanatoryNote
   "A court of law is a formal forum of justice that may have authority over civil, criminal, ecclesiastical, or military cases.",
   :db/ident :fibo-fnd-law-cor/CourtOfLaw,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCore/",
   :rdfs/label "court of law",
   :rdfs/subClassOf :fibo-fnd-org-fm/FormalOrganization,
   :skos/definition
   "person or body of persons having judicial authority to hear and resolve disputes on the basis of statutes or the common law"})

(def Law
  "rule recognized by some community as regulating the behavior of its members and that it may enforce through the imposition of penalties"
  {:cmns-av/explanatoryNote
   "Law is a term which does not have a universally accepted definition. Certain laws are made by governments, specifically by their legislatures although the sense intended here is broader. The formation of laws themselves may be influenced by a constitution (written or unwritten) and the rights encoded therein. The law shapes politics, economics and society in countless ways and serves as a social mediator of relations between people.",
   :db/ident :fibo-fnd-law-cor/Law,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCore/",
   :rdfs/label "law",
   :skos/definition
   "rule recognized by some community as regulating the behavior of its members and that it may enforce through the imposition of penalties"})

(def hasInForce
  "relates a jurisdiction or situation to a rule, regulation or law (collectively \"law\") that is currently in force in that situation or jurisdiction"
  {:db/ident :fibo-fnd-law-cor/hasInForce,
   :owl/inverseOf :fibo-fnd-law-cor/isInForceIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCore/",
   :rdfs/label "has in force",
   :rdfs/range :fibo-fnd-law-cor/Law,
   :skos/definition
   "relates a jurisdiction or situation to a rule, regulation or law (collectively \"law\") that is currently in force in that situation or jurisdiction"})

(def isInForceIn
  "identifies a jurisdiction in which some law has effect"
  {:db/ident :fibo-fnd-law-cor/isInForceIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-law-cor/Law,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCore/",
   :rdfs/label "is in force in",
   :skos/definition "identifies a jurisdiction in which some law has effect"})