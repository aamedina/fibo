(ns net.wikipunk.rdf.cmns-txt
  "The text datatype ontology defines a custom datatype that combines language tagged and plain string values. This text datatype is useful in cases where it is not clear whether string values will be tagged or not, but where it is anticipated that multilingual strings might be appropriate."
  {:cmns-av/copyright ["Copyright (c) 2022 Object Management Group, Inc."
                       "Copyright (c) 2020-2022 Stardog Union"
                       "Copyright (c) 2020-2022 Thematix Partners LLC"],
   :dcterms/abstract
   "The text datatype ontology defines a custom datatype that combines language tagged and plain string values. This text datatype is useful in cases where it is not clear whether string values will be tagged or not, but where it is anticipated that multilingual strings might be appropriate.",
   :dcterms/contributor ["Elisa Kendall, Thematix Partners LLC"
                         "Evren Sirin, Stardog Union"],
   :dcterms/license {:rdfa/uri "http://opensource.org/licenses/MIT"},
   :owl/imports {:rdfa/uri
                 "https://www.omg.org/spec/Commons/AnnotationVocabulary/"},
   :owl/versionIRI {:rdfa/uri
                    "https://www.omg.org/spec/Commons/20221101/TextDatatype/"},
   :rdf/ns-prefix-map
   {"cmns-av"  "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-txt" "https://www.omg.org/spec/Commons/TextDatatype/",
    "dcterms"  "http://purl.org/dc/terms/",
    "owl"      "http://www.w3.org/2002/07/owl#",
    "rdf"      "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"     "http://www.w3.org/2000/01/rdf-schema#",
    "skos"     "http://www.w3.org/2004/02/skos/core#",
    "xsd"      "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "cmns-txt",
   :rdfa/uri "https://www.omg.org/spec/Commons/TextDatatype/",
   :rdfs/label "Commons Text Datatype Ontology",
   :skos/changeNote
   "The https://www.omg.org/spec/Commons/20220501/TextDatatype.rdf version of this ontology was modified to add a note to the Text datatype that makes a stronger statement about potential adverse reasoning consequences if used (COMMONS-18).",
   :skos/note
   "Note that custom datatypes are outside the OWL 2 RL profile and so its usage in applications may need to be commented out."})

(def Text
  "datatype that maps to xsd:string and rdf:langString base types for string-valued data properties and annotations"
  {:cmns-av/usageNote
   "Commons users that depend on tools that lack support for rdf:langString may not want to use this datatype in their applications. Testing with specific reasoners, for example, is advised.",
   :db/ident :cmns-txt/Text,
   :dcterms/source
   {:xsd/string
    "ISO/IEC 11179-3 Information technology - Metadata registries (MDR) - Registry metamodel and basic attributes, Third edition, 2013-02-15"},
   :owl/equivalentClass {:owl/unionOf [:xsd/string :rdf/langString],
                         :rdf/type    :rdfs/Datatype},
   :rdf/type :rdfs/Datatype,
   :rdfs/label "text",
   :skos/definition
   "datatype that maps to xsd:string and rdf:langString base types for string-valued data properties and annotations",
   :skos/note
   ["There are cases where the representation of certain features of something, such as a name, which might be multilingual or might not, defaults to rdfs:Literal when left unspecified, although it should be limited to plain strings or language-typed strings (i.e., exclude numbers, binary types, and so forth). There is no combined datatype available in RDF or OWL, however, which is the role that this datatype is intended to fulfill."
    "Text is data in the form of characters, symbols, words, phrases, paragraphs, sentences, tables, or other character arrangements, intended to convey a meaning, and whose interpretation is essentially based upon the reader's knowledge of some natural language or artificial language."],
   :skos/scopeNote
   "This composite datatype should be used in cases where a standard representation using one of the options in the union for string values does not work. Note that certain tools may not support rdf:langString, including, but not limited to some versions of Protege, and that custom datatypes are not supported in OWL 2 RL so it may need to be ignored or commented out in OWL 2 RL applications."})

(def hasTextValue
  "provides a string value for something, with or without a language tag"
  {:db/ident :cmns-txt/hasTextValue,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/label "has text value",
   :skos/definition
   "provides a string value for something, with or without a language tag",
   :skos/note
   "Note that although the intended range for this property is Text, we have left the range undefined so that it can be used with tools that do not support rdf:langString."})