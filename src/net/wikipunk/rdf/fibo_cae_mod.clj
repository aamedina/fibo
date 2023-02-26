(ns net.wikipunk.rdf.fibo-cae-mod
  "The Corporate Actions and Events (CAE) domain covers events and actions that may occur during the life of a security, ranging from announcements regarding stock offerings, splits, dividends and so forth, as well as more general business events that are relevant to investors and regulators alike."
  {:cmns-av/copyright ["Copyright (c) 2018-2023 EDM Council, Inc."
                       "Copyright (c) 2018-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/CAE/MetadataCAE/CAEDomain",
   :dcterms/abstract
   "The Corporate Actions and Events (CAE) domain covers events and actions that may occur during the life of a security, ranging from announcements regarding stock offerings, splits, dividends and so forth, as well as more general business events that are relevant to investors and regulators alike.",
   :dcterms/issued #inst "2018-03-31T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/modified #inst "2023-02-03T23:00:00.000-00:00",
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/CAE/CorporateEvents/MetadataCAECorporateEvents/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/CAE/MetadataCAE/",
   :rdf/ns-prefix-map
   {"cmns-av"      "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms"      "http://purl.org/dc/terms/",
    "fibo-cae-ce-mod"
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/MetadataCAECorporateEvents/",
    "fibo-cae-mod" "https://spec.edmcouncil.org/fibo/ontology/CAE/MetadataCAE/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl"          "http://www.w3.org/2002/07/owl#",
    "rdf"          "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"         "http://www.w3.org/2000/01/rdf-schema#",
    "xsd"          "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-cae-mod",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/CAE/MetadataCAE/",
   :rdfs/label
   "Metadata about the EDMC-FIBO Corporate Actions and Events (CAE) Domain"})

(def CAEDomain
  "The Corporate Actions and Events (CAE) domain covers events and actions that may occur during the life of a security, ranging from announcements regarding stock offerings, splits, dividends and so forth, as well as more general business events that are relevant to investors and regulators alike."
  {:cmns-av/copyright ["Copyright (c) 2018-2023 EDM Council, Inc."
                       "Copyright (c) 2018-2023 Object Management Group, Inc."],
   :db/ident :fibo-cae-mod/CAEDomain,
   :dcterms/abstract
   "The Corporate Actions and Events (CAE) domain covers events and actions that may occur during the life of a security, ranging from announcements regarding stock offerings, splits, dividends and so forth, as well as more general business events that are relevant to investors and regulators alike.",
   :dcterms/contributor
   ["Pinnacle Bank (Morgan Hill, California)"
    "agnos.ai UK Ltd"
    "Federal Reserve Bank of Kansas City"
    "Bureau of Economic Analysis (BEA, US Department of Commerce)"
    "Bank of New York Mellon"
    "Thematix Partners LLC"
    "State Street Bank and Trust"
    "Nordea Bank AB"
    "John F. Gemski"
    "Deutsche Bank"
    "Adaptive, Inc."
    "HP Enterprise / Mphasis"
    "Bureau of Labor Statistics (BLS, US Department of Commerce)"
    "Dassault Systemes/No Magic"
    "Bloomberg LP"
    "Wells Fargo Bank, N. A."
    "John F. Tierney"
    "Citigroup"
    "Office of Financial Research (OFR), U.S. Department of the Treasury"
    "Census Bureau (US Department of Commerce)"
    "Tahoe Blue Ltd"
    "Statistics Canada"],
   :dcterms/hasPart :fibo-cae-ce-mod/CorporateEventsModule,
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   ["Financial Industry Business Ontology (FIBO) Corporate Actions and Events (CAE) Domain"
    "FIBO CAE Domain"],
   :rdf/type [:fibo-fnd-utl-av/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/MetadataCAE/",
   :rdfs/label "Corporate Actions and Events Domain",
   :rdfs/seeAlso ["https://spec.edmcouncil.org/fibo/"]})