(ns net.wikipunk.rdf.fibo-fbc-fct-bc
  "This ontology refines the notion of a business center for reference in defining markets and exchanges, clearing houses, and other functional entities as appropriate. The ontology covers the concept of an FpML business center (excluding those that are business day adjustments), with a focus on a physical place where business is transacted, where relevant."
  {:cmns-av/copyright ["Copyright (c) 2018-2023 EDM Council, Inc."
                       "Copyright (c) 2018-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCenters/",
   :dcterms/abstract
   "This ontology refines the notion of a business center for reference in defining markets and exchanges, clearing houses, and other functional entities as appropriate. The ontology covers the concept of an FpML business center (excluding those that are business day adjustments), with a focus on a physical place where business is transacted, where relevant.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/BusinessDates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Locations/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/BusinessCenters/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fbc-fct-bc"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCenters/",
    "fibo-fnd-dt-bd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/BusinessDates/",
    "fibo-fnd-plc-loc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Locations/",
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
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCenters/",
   :rdfa/prefix "fibo-fbc-fct-bc",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCenters/",
   :rdfs/label "Business Centers Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCenters.rdf version of this ontology was revised to eliminate circular imports and make definitions ISO 704 compliant."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCenters.rdf version of this ontology was revised to eliminate duplication with concepts in LCC and to merge countries with locations."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCenters.rdf version of this ontology was revised to address text formatting issues uncovered by hygiene testing."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCenters.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."]})

(def BusinessCenterCode
  "code used to denote a metropolitan area where business is conducted"
  {:cmns-av/adaptedFrom "http://www.fpml.org/coding-scheme/business-center",
   :cmns-av/explanatoryNote
   "The codes for business centers and municipalities defined herein are largely those identified either as FpML business centers or are locations where there is an exchange, as noted in the ISO 10962 MIC code standard.",
   :db/ident :fibo-fbc-fct-bc/BusinessCenterCode,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCenters/",
   :rdfs/label "business center code",
   :rdfs/subClassOf [{:owl/onProperty     :lcc-lr/identifies,
                      :owl/someValuesFrom :fibo-fnd-plc-loc/BusinessCenter,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :lcc-lr/denotes,
                      :owl/someValuesFrom :fibo-fnd-plc-loc/BusinessCenter,
                      :rdf/type           :owl/Restriction}
                     :lcc-cr/GeographicRegionIdentifier],
   :skos/definition
   "code used to denote a metropolitan area where business is conducted"})

(def BusinessCenterCodeScheme
  "coding scheme used to define a set of codes for municipalities or business centers"
  {:cmns-av/adaptedFrom "http://www.fpml.org/coding-scheme/business-center",
   :db/ident :fibo-fbc-fct-bc/BusinessCenterCodeScheme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCenters/",
   :rdfs/label "business center code set",
   :rdfs/subClassOf :lcc-lr/CodeSet,
   :skos/definition
   "coding scheme used to define a set of codes for municipalities or business centers"})

(def BusinessDayAdjustmentCode
  "code used to denote a convention for specifying what happens when a date falls on a day that is weekend or holiday in some municipality or business center"
  {:cmns-av/adaptedFrom "http://www.fpml.org/coding-scheme/business-center",
   :db/ident :fibo-fbc-fct-bc/BusinessDayAdjustmentCode,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCenters/",
   :rdfs/label "business day adjustment code",
   :rdfs/subClassOf [{:owl/onProperty     :lcc-lr/identifies,
                      :owl/someValuesFrom :fibo-fnd-dt-bd/BusinessDayAdjustment,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :lcc-lr/denotes,
                      :owl/someValuesFrom :fibo-fnd-dt-bd/BusinessDayAdjustment,
                      :rdf/type           :owl/Restriction}
                     :lcc-lr/CodeElement],
   :skos/definition
   "code used to denote a convention for specifying what happens when a date falls on a day that is weekend or holiday in some municipality or business center"})

(def ^{:private true} BusinessCenter
  {:cmns-av/adaptedFrom "http://www.fpml.org/coding-scheme/business-center",
   :cmns-av/explanatoryNote
   "Note that business centers, as defined in FpML, are intended for use in specifying the business calendar used by that municipality, or by certain organizations located in that municipality.",
   :db/ident :fibo-fnd-plc-loc/BusinessCenter,
   :rdf/type :owl/Class})

(def ^{:private true} Municipality
  {:db/ident        :fibo-fnd-plc-loc/Municipality,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [{:owl/onProperty     :lcc-cr/isPartOf,
                      :owl/someValuesFrom :lcc-cr/GeopoliticalEntity,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :lcc-lr/hasEnglishName,
                      :rdf/type        :owl/Restriction}]})