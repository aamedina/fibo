(ns net.wikipunk.rdf.fibo-fnd-utl-av
  "This vocabulary provides a set of metadata annotations for use in describing FIBO ontology elements. The annotations extend properties defined in the OMG's Commons Ontology Library (Commons) Annotation Vocabulary, in the Dublin Core Metadata Terms Vocabulary and in the W3C Simple Knowledge Organization System (SKOS) Vocabulary, and have been customized to suit the FIBO specification development process. Note that any of the original properties provided in Dublin Core and SKOS can be used in addition to the terms provided herein. However, any Dublin Core terms that are not explicitly defined as OWL annotation properties in this ontology or in any of its imports must be so declared in the ontologies that use them."
  {:cmns-av/copyright ["Copyright (c) 2013-2023 EDM Council, Inc."
                       "Copyright (c) 2013-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
   :dcterms/abstract
   "This vocabulary provides a set of metadata annotations for use in describing FIBO ontology elements. The annotations extend properties defined in the OMG's Commons Ontology Library (Commons) Annotation Vocabulary, in the Dublin Core Metadata Terms Vocabulary and in the W3C Simple Knowledge Organization System (SKOS) Vocabulary, and have been customized to suit the FIBO specification development process. \n\nNote that any of the original properties provided in Dublin Core and SKOS can be used in addition to the terms provided herein. However, any Dublin Core terms that are not explicitly defined as OWL annotation properties in this ontology or in any of its imports must be so declared in the ontologies that use them.",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports ["https://www.omg.org/spec/Commons/AnnotationVocabulary/"
                 "https://www.omg.org/spec/Commons/Classifiers/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fnd-utl-av",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
   :rdfs/label "FIBO Annotation Vocabulary",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary.rdf version of this ontology was modified to integrate the Commons Ontology Library (Commons) Annotation Vocabulary and eliminate the need to import the OMG's Specification Metadata vocabulary."
    "The http://www.omg.org/spec/EDMC-FIBO/FND/20130801/Utilities/AnnotationVocabulary.rdf version of this ontology was modified per the issue resolutions identified in the FIBO FND 1.0 FTF report and in http://www.omg.org/spec/EDMC-FIBO/FND/1.0/AboutFND-1.0/."
    "The http://www.omg.org/spec/FIBO/Foundations/20130601/Utilities/AnnotationVocabulary.owl version of the ontology was revised in advance of the September 2013 New Brunswick, NJ meeting, as follows:\n\t(1) to use slash style URI/IRIss (also called 303 URIs, vs. hash style) as required to support server side processing \n\t(2) to use version-independent IRIs for all definitions internally as opposed to version-specific IRIs\n\t(3) to change the file suffix from .owl to .rdf to increase usability in RDF tools\n\t(4) to use 4-level abbreviations and corresponding namespace prefixes for all FIBO ontologies, reflecting a family/specification/module/ontology structure\n\t(5) to incorporate changes to the specification metadata to support documentation at the family, specification, module, and ontology level, similar to the abbreviations"
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary.rdf version of this ontology was modified to add the symbol annotation."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary.rdf version of this ontology was modified to add common and preferred designations as needed for postal addresses and other purposes, to correct named individuals to be properly declared, and to revise definitions to be ISO 704 compliant."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary.rdf version of this ontology was modified to address hygiene issues with respect to text formatting and eliminate the explicit SKOS import which is not needed."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary.rdf version of this ontology was modified to eliminate skos:Concept as a superclass of MaturityLevel (replaced with LifecycleStage in the Lifecycles ontology), revise explanatory notes for maturity levels based on community feedback, and correct the subproperty inheritance for adaptedFrom and logicalDefinition."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary.rdf version of this ontology was modified to eliminate deprecated properties."]}
  (:refer-clojure :exclude [symbol]))

(def Informative
  "entity that is considered deprecated but included for informational purposes because it is referenced by some provisional concept"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Informative content will be removed as soon as all dependencies have been eliminated, thus FIBO users should not depend on it going forward."},
   :db/ident :fibo-fnd-utl-av/Informative,
   :rdf/type [:fibo-fnd-utl-av/MaturityLevel :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
   :rdfs/label "informative",
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "entity that is considered deprecated but included for informational purposes because it is referenced by some provisional concept"}})

(def MaturityLevel
  "classifier used to indicate the state of an artifact with respect to its development lifecycle"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "FIBO currently has three maturity levels: Informative, Provisional, and Release."},
   :db/ident :fibo-fnd-utl-av/MaturityLevel,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
   :rdfs/label "maturity level",
   :rdfs/subClassOf :cmns-cls/Classifier,
   :skos/definition
   "classifier used to indicate the state of an artifact with respect to its development lifecycle"})

(def Module
  "classifier used to indicate a category used to modularize something based on principles of the model driven architecture methodology (MDA), including but not limited to separation of concerns, coherence, and establishing clear logical boundaries in order to increase reusability and maintainability"
  {:cmns-av/explanatoryNote
   "A module should be designed to reflect these principles, including a small number of models that have well-defined relationships with one another, that form a coherent and cohesive whole for some purpose, and that have clear boundaries or interfaces to other modules.",
   :db/ident :fibo-fnd-utl-av/Module,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
   :rdfs/label "module",
   :rdfs/subClassOf :cmns-cls/Classifier,
   :skos/definition
   "classifier used to indicate a category used to modularize something based on principles of the model driven architecture methodology (MDA), including but not limited to separation of concerns, coherence, and establishing clear logical boundaries in order to increase reusability and maintainability"})

(def Provisional
  "entity that is considered to be under development"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Provisional content is subject to change, and may change substantially prior to release. FIBO users should be aware that it is not dependable, but could be used for reference and as the basis for further work."},
   :db/ident :fibo-fnd-utl-av/Provisional,
   :rdf/type [:fibo-fnd-utl-av/MaturityLevel :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
   :rdfs/label "provisional",
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "entity that is considered to be under development"}})

(def Release
  "entity that is considered to be stable and mature from a development perspective"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Release notes will be provided for any changes with respect to released content, and any revisions will be backwards compatible with the prior version to the degree possible."},
   :db/ident :fibo-fnd-utl-av/Release,
   :rdf/type [:fibo-fnd-utl-av/MaturityLevel :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
   :rdfs/label "release",
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "entity that is considered to be stable and mature from a development perspective"}})

(def abbreviation
  {:db/ident :fibo-fnd-utl-av/abbreviation,
   :owl/deprecated true,
   :owl/equivalentProperty :cmns-av/abbreviation,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/"})

(def adaptedFrom
  {:db/ident :fibo-fnd-utl-av/adaptedFrom,
   :owl/deprecated true,
   :owl/equivalentProperty :cmns-av/adaptedFrom,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/"})

(def commonDesignation
  "frequently used designation for an entity"
  {:cmns-av/adaptedFrom "https://pe.usps.com/cpim/ftp/pubs/Pub28/pub28.pdf",
   :db/ident :fibo-fnd-utl-av/commonDesignation,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
   :rdfs/label "common designation",
   :rdfs/subPropertyOf :cmns-av/synonym,
   :skos/definition "frequently used designation for an entity"})

(def definitionOrigin
  "document or other source from which a given definition was taken directly; the range for this annotation can be a string, URI, or BibliographicCitation"
  {:db/ident :fibo-fnd-utl-av/definitionOrigin,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
   :rdfs/label "definition origin",
   :rdfs/subPropertyOf :cmns-av/directSource,
   :skos/definition
   "document or other source from which a given definition was taken directly; the range for this annotation can be a string, URI, or BibliographicCitation"})

(def explanatoryNote
  {:db/ident :fibo-fnd-utl-av/explanatoryNote,
   :owl/deprecated true,
   :owl/equivalentProperty :cmns-av/explanatoryNote,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/"})

(def hasMaturityLevel
  "links something to its state with respect to a development lifecycle"
  {:db/ident :fibo-fnd-utl-av/hasMaturityLevel,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
   :rdfs/label "has maturity level",
   :skos/definition
   "links something to its state with respect to a development lifecycle"})

(def logicalDefinition
  {:db/ident :fibo-fnd-utl-av/logicalDefinition,
   :owl/deprecated true,
   :owl/equivalentProperty :cmns-av/logicalDefinition,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/"})

(def modifiedBy
  {:db/ident :fibo-fnd-utl-av/modifiedBy,
   :owl/deprecated true,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/"})

(def modifiedOn
  {:db/ident :fibo-fnd-utl-av/modifiedOn,
   :owl/deprecated true,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/"})

(def preferredDesignation
  "recommended designation for an entity in some context"
  {:cmns-av/adaptedFrom "https://pe.usps.com/cpim/ftp/pubs/Pub28/pub28.pdf",
   :db/ident :fibo-fnd-utl-av/preferredDesignation,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
   :rdfs/label "preferred designation",
   :rdfs/subPropertyOf :cmns-av/synonym,
   :skos/definition "recommended designation for an entity in some context"})

(def symbol
  {:db/ident :fibo-fnd-utl-av/symbol,
   :owl/deprecated true,
   :owl/equivalentProperty :cmns-av/symbol,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/"})

(def synonym
  {:db/ident :fibo-fnd-utl-av/synonym,
   :owl/deprecated true,
   :owl/equivalentProperty :cmns-av/synonym,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/"})

(def termOrigin
  "document or other source from which a given term was taken directly; the range for this annotation can be a string, URI, or BibliographicCitation"
  {:db/ident :fibo-fnd-utl-av/termOrigin,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
   :rdfs/label "term origin",
   :rdfs/subPropertyOf :cmns-av/directSource,
   :skos/definition
   "document or other source from which a given term was taken directly; the range for this annotation can be a string, URI, or BibliographicCitation"})

(def usageNote
  {:db/ident :fibo-fnd-utl-av/usageNote,
   :owl/deprecated true,
   :owl/equivalentProperty :cmns-av/usageNote,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/"})