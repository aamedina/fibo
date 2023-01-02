(ns net.wikipunk.rdf.fibo-cae-mod
  "The Corporate Actions and Events (CAE) domain covers events and actions that may occur during the life of a security, ranging from announcements regarding stock offerings, splits, dividends and so forth, as well as more general business events that are relevant to investors and regulators alike."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/CAE/MetadataCAE/CAEDomain",
   :dcterms/abstract
   "The Corporate Actions and Events (CAE) domain covers events and actions that may occur during the life of a security, ranging from announcements regarding stock offerings, splits, dividends and so forth, as well as more general business events that are relevant to investors and regulators alike.",
   :dcterms/issued #inst "2020-12-28T23:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/CAE/CorporateEvents/MetadataCAECorporateEvents/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/CAE/MetadataCAE/",
   :rdf/ns-prefix-map
   {"dcterms"      "http://purl.org/dc/terms/",
    "fibo-cae-ce-mod"
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/MetadataCAECorporateEvents/",
    "fibo-cae-mod" "https://spec.edmcouncil.org/fibo/ontology/CAE/MetadataCAE/",
    "owl"          "http://www.w3.org/2002/07/owl#",
    "rdf"          "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"         "http://www.w3.org/2000/01/rdf-schema#",
    "sm"           "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd"          "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "https://spec.edmcouncil.org/fibo/ontology/CAE/MetadataCAE/",
   :rdfa/prefix "fibo-cae-mod",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/CAE/MetadataCAE/",
   :rdfs/label
   "Metadata about the EDMC-FIBO Corporate Actions and Events (CAE) Domain",
   :sm/contentLanguage "http://www.w3.org/standards/techs/owl#w3c_all",
   :sm/copyright "Copyright (c) 2013-2020 EDM Council, Inc.",
   :sm/fileAbbreviation "fibo-cae-mod",
   :sm/filename "MetadataCAE.rdf"})

(def CAEDomain
  "The Corporate Actions and Events (CAE) domain covers events and actions that may occur during the life of a security, ranging from announcements regarding stock offerings, splits, dividends and so forth, as well as more general business events that are relevant to investors and regulators alike."
  {:db/ident :fibo-cae-mod/CAEDomain,
   :dcterms/abstract
   "The Corporate Actions and Events (CAE) domain covers events and actions that may occur during the life of a security, ranging from announcements regarding stock offerings, splits, dividends and so forth, as well as more general business events that are relevant to investors and regulators alike.",
   :dcterms/hasPart :fibo-cae-ce-mod/CorporateEventsModule,
   :dcterms/license "http://opensource.org/licenses/MIT",
   :rdf/type [:owl/NamedIndividual :sm/Module],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/MetadataCAE/",
   :rdfs/label "Corporate Actions and Events Domain",
   :rdfs/seeAlso "https://spec.edmcouncil.org/fibo/",
   :sm/copyright "Copyright (c) 2013-2020 EDM Council, Inc.",
   :sm/dependsOn ["https://spec.edmcouncil.org/fibo/ontology/FND/"
                  "https://spec.edmcouncil.org/fibo/ontology/SEC/"
                  "http://www.omg.org/techprocess/ab/SpecificationMetadata/"
                  "https://www.omg.org/spec/LCC/"
                  "https://spec.edmcouncil.org/fibo/ontology/BE/"
                  "https://spec.edmcouncil.org/fibo/ontology/FBC/"],
   :sm/keyword ["corporate events" "corporate actions"],
   :sm/moduleAbbreviation "fibo-cae"})