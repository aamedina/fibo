(ns net.wikipunk.rdf.fibo-fnd-plc-fac
  {:cmns-av/copyright
   #{"Copyright (c) 2013-2024 EDM Council, Inc."
     "Copyright (c) 2013-2024 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Places/Facilities/",
   :dcterms/abstract
   "This ontology provides scaffolding for use in describing concepts related to facilities, both virtual and physical, including physical sites that provide various facilities.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-rlcmp" "https://www.omg.org/spec/Commons/RolesAndCompositions/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-plc-adr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/",
    "fibo-fnd-plc-fac"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Facilities/",
    "fibo-fnd-plc-loc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Locations/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Places/Addresses/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Places/Locations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Places/Facilities/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fnd-plc-fac",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Facilities/",
   :rdfs/label "Facilities Ontology",
   :skos/changeNote
   #{"The http://www.omg.org/spec/EDMC-FIBO/FND/20141101/Places/Facilities.rdf version of this ontology was modified for the FIBO 2.0 RFC to integrate it with LCC."
     "The http://www.omg.org/spec/EDMC-FIBO/FND/20210101/Places/Facilities.rdf version of this ontology was modified to allow a facility to exist at some location that has an address without requiring it to be situated at some site to simplify usage in cases where the site and facility have 100 percent overlap and are not tracked independently."
     "This ontology was added to Foundations in advance of the December 2014 Long Beach meeting in support of the SEC specification."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Places/Facilities.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The http://www.omg.org/spec/EDMC-FIBO/FND/20180801/Places/Facilities.rdf version of this ontology was modified to eliminate deprecated elements."
     "The http://www.omg.org/spec/EDMC-FIBO/FND/20220701/Places/Facilities.rdf version of this ontology was modified to allow a facility to be anything rather than a role."
     "The http://www.omg.org/spec/EDMC-FIBO/FND/20190901/Places/Facilities.rdf version of this ontology was modified to eliminate circular and ambiguous definitions, and simplify the ontology by merging physical site with site."
     "The http://www.omg.org/spec/EDMC-FIBO/FND/20220101/Places/Facilities.rdf version of this ontology was modified to address hygiene issues with respect to text formatting."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Places/Facilities.rdf version of this ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Places/Facilities.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Facilities/"})

(def Capability
  {:cmns-av/adaptedFrom
   {:rdf/value
    "Value Delivery Modeling Language Specification, http://www.omg.org/spec/VDML/"},
   :db/ident :fibo-fnd-plc-fac/Capability,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Facilities/"},
   :rdfs/label "capability",
   :rdfs/subClassOf {:owl/onProperty     :fibo-fnd-rel-rel/involves,
                     :owl/someValuesFrom :fibo-fnd-plc-fac/Facility,
                     :rdf/type           :owl/Restriction},
   :skos/definition
   "ability to perform a particular type of work that may involve people with particular skills and knowledge, intellectual property, defined practices, operating facilities, tools and equipment"})

(def Facility
  {:cmns-av/explanatoryNote
   "A facility may be concrete (as in a manufacturing facility) or abstract. Concrete facilities may be permanent, semi-permanent, or temporary structures, providing one or more capabilities at a given site. A single site may include multiple facilities and a given facility may span multiple sites.",
   :db/ident :fibo-fnd-plc-fac/Facility,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Facilities/"},
   :rdfs/label "facility",
   :rdfs/subClassOf #{{:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-fnd-plc-fac/Site,
                       :owl/onProperty :fibo-fnd-plc-fac/isSituatedAt,
                       :rdf/type       :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-fnd-plc-adr/Address,
                       :owl/onProperty :fibo-fnd-plc-adr/hasAddress,
                       :rdf/type       :owl/Restriction}
                      {:owl/onProperty     :fibo-fnd-rel-rel/provides,
                       :owl/someValuesFrom :fibo-fnd-plc-fac/Capability,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "something established to serve a particular purpose, make some course of action or operation easier, or provide some capability or service"})

(def Site
  {:cmns-av/explanatoryNote
   "A physical site has certain characteristics that contribute to the context it provides, including area, shape, accessibility, and in the case of a geographic site, landforms, soil and ground conditions, climate, and so forth.",
   :db/ident :fibo-fnd-plc-fac/Site,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Facilities/"},
   :rdfs/label "site",
   :rdfs/subClassOf #{{:owl/onClass    :lcc-cr/Location,
                       :owl/onProperty :fibo-fnd-plc-loc/isLocatedAt,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction} :cmns-rlcmp/Role
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-fnd-plc-adr/Address,
                       :owl/onProperty :fibo-fnd-plc-adr/hasAddress,
                       :rdf/type       :owl/Restriction}
                      {:owl/onProperty     :cmns-rlcmp/isPlayedBy,
                       :owl/someValuesFrom {:owl/onProperty
                                            :fibo-fnd-plc-fac/situates,
                                            :owl/someValuesFrom :owl/Thing,
                                            :rdf/type :owl/Restriction},
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "place, setting, or context in which something, such as a facility, is situated",
   :skos/example
   "Examples include a structure or building, an archeological dig, the landing location for an aircraft or spacecraft, and the site of a wound. A given site may accommodate multiple facilities."})

(def Venue
  {:db/ident :fibo-fnd-plc-fac/Venue,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Facilities/"},
   :rdfs/label "venue",
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-cxtdsg/isApplicableIn,
                       :owl/someValuesFrom :owl/Thing,
                       :rdf/type           :owl/Restriction}
                      :fibo-fnd-plc-fac/Site},
   :skos/definition
   "site where something happens, described in the context of the event or activity that occurs there"})

(def isSituatedAt
  {:cmns-av/explanatoryNote
   "Something may be situated at some site, or in some setting, situation, or context.",
   :db/ident :fibo-fnd-plc-fac/isSituatedAt,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Facilities/"},
   :rdfs/label "is situated at",
   :skos/definition "is placed at"})

(def situates
  {:db/ident :fibo-fnd-plc-fac/situates,
   :owl/inverseOf :fibo-fnd-plc-fac/isSituatedAt,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Facilities/"},
   :rdfs/label "situates",
   :skos/definition
   "indicates the place, setting, or context in which something is placed"})

(def urn:uuid:551b1d3a-5f7f-532c-9293-56541eec7972
  {:cmns-av/copyright
   #{"Copyright (c) 2013-2024 EDM Council, Inc."
     "Copyright (c) 2013-2024 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology provides scaffolding for use in describing concepts related to facilities, both virtual and physical, including physical sites that provide various facilities.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Places/Addresses/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Places/Locations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Places/Facilities/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Facilities Ontology",
   :skos/changeNote
   #{"The http://www.omg.org/spec/EDMC-FIBO/FND/20141101/Places/Facilities.rdf version of this ontology was modified for the FIBO 2.0 RFC to integrate it with LCC."
     "The http://www.omg.org/spec/EDMC-FIBO/FND/20210101/Places/Facilities.rdf version of this ontology was modified to allow a facility to exist at some location that has an address without requiring it to be situated at some site to simplify usage in cases where the site and facility have 100 percent overlap and are not tracked independently."
     "This ontology was added to Foundations in advance of the December 2014 Long Beach meeting in support of the SEC specification."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Places/Facilities.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The http://www.omg.org/spec/EDMC-FIBO/FND/20180801/Places/Facilities.rdf version of this ontology was modified to eliminate deprecated elements."
     "The http://www.omg.org/spec/EDMC-FIBO/FND/20220701/Places/Facilities.rdf version of this ontology was modified to allow a facility to be anything rather than a role."
     "The http://www.omg.org/spec/EDMC-FIBO/FND/20190901/Places/Facilities.rdf version of this ontology was modified to eliminate circular and ambiguous definitions, and simplify the ontology by merging physical site with site."
     "The http://www.omg.org/spec/EDMC-FIBO/FND/20220101/Places/Facilities.rdf version of this ontology was modified to address hygiene issues with respect to text formatting."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Places/Facilities.rdf version of this ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Places/Facilities.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Facilities/"})