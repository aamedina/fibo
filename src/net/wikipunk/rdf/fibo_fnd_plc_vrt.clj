(ns net.wikipunk.rdf.fibo-fnd-plc-vrt
  "This ontology provides scaffolding for use in describing virtual location-oriented concepts."
  {:cmns-av/copyright ["Copyright (c) 2013-2023 EDM Council, Inc."
                       "Copyright (c) 2013-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/VirtualPlaces/",
   :dcterms/abstract
   "This ontology provides scaffolding for use in describing virtual location-oriented concepts.",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Addresses/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Locations/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/VirtualPlaces/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-plc-adr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/",
    "fibo-fnd-plc-vrt"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/VirtualPlaces/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "lcc-lr" "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/VirtualPlaces/",
   :rdfa/prefix "fibo-fnd-plc-vrt",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/VirtualPlaces/",
   :rdfs/label "Virtual Places Ontology",
   :skos/changeNote
   ["This ontology was added to Foundations in advance of the December 2014 Long Beach meeting in support of the SEC specification."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Places/VirtualPlaces.rdf version of this ontology was modified to address hygiene issues with respect to text formatting."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Places/VirtualPlaces.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Places/VirtualPlaces.rdf version of this ontology was modified to eliminate duplication of concepts in LCC and email address and telephone number."
    "The http://www.omg.org/spec/EDMC-FIBO/FND/20141101/Places/VirtualPlaces.rdf version of this ontology was modified for the FIBO 2.0 RFC to integrate it with LCC."]})

(def ElectronicMailAddress
  "virtual address that defines an electronic messaging endpoint to which email messages can be delivered, typically via an Simple Mail Transfer Protocol (SMTP) based communications system"
  {:cmns-av/abbreviation ["email address" "e-mail address"],
   :cmns-av/explanatoryNote
   "Electronic mail, abbreviated e-mail or email, is a method of composing, sending, and receiving messages over electronic communication systems. The term e-mail applies both to the Internet e-mail system based on the Simple Mail Transfer Protocol (SMTP) and to intranet systems allowing users within one company or organization to send messages to each other. Often these workgroup collaboration systems natively use non-standard protocols but have some form of gateway to allow them to send and receive Internet e-mail. Some organizations may use the Internet protocols for internal e-mail service.",
   :db/ident :fibo-fnd-plc-vrt/ElectronicMailAddress,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/VirtualPlaces/",
   :rdfs/label "electronic mail address",
   :rdfs/subClassOf :fibo-fnd-plc-adr/VirtualAddress,
   :skos/definition
   "virtual address that defines an electronic messaging endpoint to which email messages can be delivered, typically via an Simple Mail Transfer Protocol (SMTP) based communications system"})

(def NetworkLocation
  "a virtual location that may be identified by a network address (an identifier for a node or interface)"
  {:db/ident :fibo-fnd-plc-vrt/NetworkLocation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/VirtualPlaces/",
   :rdfs/label "network location",
   :rdfs/subClassOf [{:owl/onClass    :fibo-fnd-plc-adr/Address,
                      :owl/onProperty :lcc-lr/isIdentifiedBy,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-plc-vrt/VirtualLocation],
   :skos/definition
   "a virtual location that may be identified by a network address (an identifier for a node or interface)"})

(def NotionalPlace
  "an abstract place; one of many commonly understood concepts such as domestic, Eurozone etc."
  {:db/ident :fibo-fnd-plc-vrt/NotionalPlace,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/VirtualPlaces/",
   :rdfs/label "notional place",
   :rdfs/subClassOf :lcc-cr/Location,
   :skos/definition
   "an abstract place; one of many commonly understood concepts such as domestic, Eurozone etc."})

(def TelephoneNumber
  "virtual address that may be assigned to a fixed-line telephone subscriber station connected to a telephone line or to a wireless electronic telephony device, such as a radio telephone or a mobile telephone, or to other devices or services for data transmission via the public switched telephone network (PSTN) or other public and private networks"
  {:cmns-av/abbreviation "phone number",
   :cmns-av/explanatoryNote
   "Telephone numbers are assigned within the framework of a national or regional telephone numbering plan to subscribers by telephone service operators, which may be commercial entities, state-controlled administrations, or other telecommunication industry associations.",
   :db/ident :fibo-fnd-plc-vrt/TelephoneNumber,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/VirtualPlaces/",
   :rdfs/label "telephone number",
   :rdfs/subClassOf :fibo-fnd-plc-adr/VirtualAddress,
   :skos/definition
   "virtual address that may be assigned to a fixed-line telephone subscriber station connected to a telephone line or to a wireless electronic telephony device, such as a radio telephone or a mobile telephone, or to other devices or services for data transmission via the public switched telephone network (PSTN) or other public and private networks"})

(def VirtualLocation
  "place that is not located in any single physical location; a network location without geographic boundaries"
  {:db/ident :fibo-fnd-plc-vrt/VirtualLocation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/VirtualPlaces/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "virtual location"},
   :rdfs/subClassOf :lcc-cr/Location,
   :skos/definition
   "place that is not located in any single physical location; a network location without geographic boundaries"})

(def hasElectronicMailAddress
  "specifies an electronic messaging endpoint at which some entity may be located or contacted or may receive correspondence"
  {:cmns-av/abbreviation ["has email address" "has e-mail address"],
   :db/ident :fibo-fnd-plc-vrt/hasElectronicMailAddress,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/VirtualPlaces/",
   :rdfs/label "has electronic mail address",
   :rdfs/range :fibo-fnd-plc-vrt/ElectronicMailAddress,
   :rdfs/subPropertyOf :fibo-fnd-plc-adr/hasAddress,
   :skos/definition
   "specifies an electronic messaging endpoint at which some entity may be located or contacted or may receive correspondence"})

(def hasTelephoneNumber
  "indicates a virtual address composed of a sequence of digits and symbols that may be assigned to a fixed-line telephone subscriber station, a wireless electronic telephony device, such as a radio telephone or a mobile telephone, or other similar device or service"
  {:db/ident :fibo-fnd-plc-vrt/hasTelephoneNumber,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/VirtualPlaces/",
   :rdfs/label "has telephone number",
   :rdfs/range :fibo-fnd-plc-vrt/TelephoneNumber,
   :rdfs/subPropertyOf :fibo-fnd-plc-adr/hasAddress,
   :skos/definition
   "indicates a virtual address composed of a sequence of digits and symbols that may be assigned to a fixed-line telephone subscriber station, a wireless electronic telephony device, such as a radio telephone or a mobile telephone, or other similar device or service"})

(def hasURL
  "links something to a web resource that specifies its location on a computer network and a method for retrieving it"
  {:cmns-av/synonym "has uniform resource locator",
   :db/ident :fibo-fnd-plc-vrt/hasURL,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/VirtualPlaces/",
   :rdfs/label "has URL",
   :rdfs/range :xsd/anyURI,
   :skos/definition
   "links something to a web resource that specifies its location on a computer network and a method for retrieving it"})

(def hasWebsite
  "links something to a page or set of related web pages located under a single domain name, typically produced by a single person or organization"
  {:cmns-av/explanatoryNote
   "Web Design and Applications involve the standards for building and Rendering Web pages, including HTML, CSS, SVG, device APIs, and other technologies for Web Applications ('WebApps'). HTML (the Hypertext Markup Language) and CSS (Cascading Style Sheets) are two of the core technologies for building Web pages. HTML provides the structure of the page, CSS the (visual and aural) layout, for a variety of devices and services.",
   :db/ident :fibo-fnd-plc-vrt/hasWebsite,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/VirtualPlaces/",
   :rdfs/label "has website",
   :rdfs/range :xsd/anyURI,
   :rdfs/seeAlso ["https://www.w3.org/standards/webdesign/"],
   :rdfs/subPropertyOf :fibo-fnd-plc-vrt/hasURL,
   :skos/definition
   "links something to a page or set of related web pages located under a single domain name, typically produced by a single person or organization"})