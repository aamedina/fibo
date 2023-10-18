(ns net.wikipunk.rdf.cmns-cds
  {:cmns-av/copyright #{"Copyright (c) 2021-2022 agnos.ai U.K. Ltd"
                        "Copyright (c) 2014-2022 EDM Council, Inc."
                        "Copyright (c) 2022 Object Management Group, Inc."
                        "Copyright (c) 2014-2022 Thematix Partners LLC"},
   :dcterms/abstract
   "This ontology defines commonly used concepts for describing codes, including standardized codes such as ISO language, country, and other code sets, the North American Industry Classification System (NAICS) codes, and custom code sets that many organizations develop for various purposes, derived from the patterns specified in ISO 11179-3, Metadata Registries.",
   :dcterms/contributor #{"Pete Rivett, agnos.ai U.K. Ltd"
                          "Elisa Kendall, Thematix Partners LLC"},
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :namespaces {"cmns-av"
                "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
                "cmns-cds" "https://www.omg.org/spec/Commons/CodesAndCodeSets/",
                "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
                "cmns-dsg" "https://www.omg.org/spec/Commons/Designators/",
                "dcterms" "http://purl.org/dc/terms/",
                "owl" "http://www.w3.org/2002/07/owl#",
                "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                "skos" "http://www.w3.org/2004/02/skos/core#",
                "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports #{{:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
                  {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
                  {:xsd/anyURI
                   "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI "https://www.omg.org/spec/Commons/20221101/CodesAndCodeSets/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "cmns-cds",
   :rdfa/uri "https://www.omg.org/spec/Commons/CodesAndCodeSets/",
   :rdfs/label "Commons Codes and Code Sets Ontology",
   :skos/changeNote
   "The https://www.omg.org/spec/Commons/20220501/CodesAndCodeSets.rdf version of this ontology was modified to make CodeSet a subclass of Arrangement (COMMONS-19) and to add a note to code set for clarity (COMMONS-26).",
   :skos/note
   #{"The codes and code sets ontology conforms with the OWL 2 DL semantics, and is outside of OWL 2 RL due to (1) imported axioms from the designations ontology, and (2) the inclusion of a local some values constraint. The latter could be removed as needed to support OWL RL rule-based applications that cannot be extended to support it."
     "This ontology was originally designed for use in the OMG Languages, Countries and Codes (LCC) specification as part of the broader LanguageRepresentation ontology. The concepts have also been used in the Financial Industry Business Ontology (FIBO) for representing currency codes, market identifiers (MIC codes), codes for corporate actions, and so forth."},
   :xsd/anyURI "https://www.omg.org/spec/Commons/CodesAndCodeSets/"})

(def CodeElement
  {:db/ident :cmns-cds/CodeElement,
   :dcterms/source
   {:rdf/value
    "ISO/IEC 11179-3 Information technology - Metadata registries (MDR) - Part 3: Registry metamodel and basic attributes, Third edition, 2013-02-15"},
   :rdf/type :owl/Class,
   :rdfs/label "code element",
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-col/isMemberOf,
                       :owl/someValuesFrom :cmns-cds/CodeSet,
                       :rdf/type           :owl/Restriction}
                      :cmns-dsg/Designation},
   :skos/definition
   "sequence of characters denoting something for some purpose, within a specified context, according to some rule set",
   :skos/example
   "An example of a code set that has multiple versions are the International Statistical Classification of Diseases and Related Health Problems (ICD) codes such as ICD-9, ICD-10, and so forth, that specify the same codes across multiple versions.",
   :skos/note
   "Note that codes may be included in multiple code lists, especially in cases where there are multiple versions of those code lists. ICD-9 and ICD-10 are examples of code sets that specify, in some cases, the same codes, but across different versions of those code sets."})

(def CodeSet
  {:cmns-av/synonym "coding scheme",
   :db/ident :cmns-cds/CodeSet,
   :dcterms/source
   {:rdf/value
    "ISO/IEC 11179-3 Information technology - Metadata registries (MDR) - Part 3: Registry metamodel and basic attributes, Third edition, 2013-02-15"},
   :rdf/type :owl/Class,
   :rdfs/label "code set",
   :rdfs/subClassOf #{:cmns-col/Collection :cmns-col/Arrangement
                      {:owl/allValuesFrom :cmns-cds/CodeElement,
                       :owl/onProperty    :cmns-col/hasMember,
                       :rdf/type          :owl/Restriction}},
   :skos/definition
   "system of alpha-numeric symbols, or combinations of symbols, that stand for specified values in some context",
   :skos/note
   "Note that a given code set will typically include a finite and known list of codes. Code sets may also be versioned. ICD-9 and ICD-10 are examples of code sets that specify, in some cases, the same codes, but across different versions of those code sets."})

(def urn:uuid:edb37e6b-9e23-5c61-a273-2d02728094d6
  {:cmns-av/copyright #{"Copyright (c) 2021-2022 agnos.ai U.K. Ltd"
                        "Copyright (c) 2014-2022 EDM Council, Inc."
                        "Copyright (c) 2022 Object Management Group, Inc."
                        "Copyright (c) 2014-2022 Thematix Partners LLC"},
   :dcterms/abstract
   "This ontology defines commonly used concepts for describing codes, including standardized codes such as ISO language, country, and other code sets, the North American Industry Classification System (NAICS) codes, and custom code sets that many organizations develop for various purposes, derived from the patterns specified in ISO 11179-3, Metadata Registries.",
   :dcterms/contributor #{"Pete Rivett, agnos.ai U.K. Ltd"
                          "Elisa Kendall, Thematix Partners LLC"},
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :owl/imports #{{:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
                  {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
                  {:xsd/anyURI
                   "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI "https://www.omg.org/spec/Commons/20221101/CodesAndCodeSets/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Commons Codes and Code Sets Ontology",
   :skos/changeNote
   "The https://www.omg.org/spec/Commons/20220501/CodesAndCodeSets.rdf version of this ontology was modified to make CodeSet a subclass of Arrangement (COMMONS-19) and to add a note to code set for clarity (COMMONS-26).",
   :skos/note
   #{"The codes and code sets ontology conforms with the OWL 2 DL semantics, and is outside of OWL 2 RL due to (1) imported axioms from the designations ontology, and (2) the inclusion of a local some values constraint. The latter could be removed as needed to support OWL RL rule-based applications that cannot be extended to support it."
     "This ontology was originally designed for use in the OMG Languages, Countries and Codes (LCC) specification as part of the broader LanguageRepresentation ontology. The concepts have also been used in the Financial Industry Business Ontology (FIBO) for representing currency codes, market identifiers (MIC codes), codes for corporate actions, and so forth."},
   :xsd/anyURI "https://www.omg.org/spec/Commons/CodesAndCodeSets/"})