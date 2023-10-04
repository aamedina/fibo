(ns net.wikipunk.rdf.fibo-fnd-mod
  ^{:base "https://spec.edmcouncil.org/fibo/ontology/FND/MetadataFND/",
    :namespaces
    {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
     "dcterms" "http://purl.org/dc/terms/",
     "fibo-fnd-aap-mod"
     "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/MetadataFNDAgentsAndPeople/",
     "fibo-fnd-acc-mod"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/MetadataFNDAccounting/",
     "fibo-fnd-agr-mod"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/MetadataFNDAgreements/",
     "fibo-fnd-arr-mod"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/MetadataFNDArrangements/",
     "fibo-fnd-dt-mod"
     "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/MetadataFNDDatesAndTimes/",
     "fibo-fnd-gao-mod"
     "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/MetadataFNDGoalsAndObjectives/",
     "fibo-fnd-law-mod"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Law/MetadataFNDLaw/",
     "fibo-fnd-mod"
     "https://spec.edmcouncil.org/fibo/ontology/FND/MetadataFND/",
     "fibo-fnd-oac-mod"
     "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/MetadataFNDOwnershipAndControl/",
     "fibo-fnd-org-mod"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/MetadataFNDOrganizations/",
     "fibo-fnd-pas-mod"
     "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/MetadataFNDProductsAndServices/",
     "fibo-fnd-plc-mod"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Places/MetadataFNDPlaces/",
     "fibo-fnd-pty-mod"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/MetadataFNDParties/",
     "fibo-fnd-qt-mod"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/MetadataFNDQuantities/",
     "fibo-fnd-rel-mod"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/MetadataFNDRelations/",
     "fibo-fnd-txn-mod"
     "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/MetadataFNDTransactionsExt/",
     "fibo-fnd-utl-av"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
     "fibo-fnd-utl-mod"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/MetadataFNDUtilities/",
     "owl" "http://www.w3.org/2002/07/owl#",
     "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
     "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
     "xsd" "http://www.w3.org/2001/XMLSchema#"},
    :prefix "fibo-fnd-mod",
    :source
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/MetadataFND/FNDDomain"}
  {:cmns-av/copyright #{"Copyright (c) 2013-2023 Object Management Group, Inc."
                        "Copyright (c) 2013-2023 EDM Council, Inc."},
   :dcterms/abstract "The 'metadata for FND' describes the FND domain.",
   :dcterms/issued #inst "2021-03-29T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-03-31T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Law/MetadataFNDLaw/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/GoalsAndObjectives/MetadataFNDGoalsAndObjectives/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Places/MetadataFNDPlaces/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Quantities/MetadataFNDQuantities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/OwnershipAndControl/MetadataFNDOwnershipAndControl/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/DatesAndTimes/MetadataFNDDatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/ProductsAndServices/MetadataFNDProductsAndServices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/AgentsAndPeople/MetadataFNDAgentsAndPeople/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/MetadataFNDRelations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Agreements/MetadataFNDAgreements/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/MetadataFNDParties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Accounting/MetadataFNDAccounting/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Organizations/MetadataFNDOrganizations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/MetadataFNDUtilities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Arrangements/MetadataFNDArrangements/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/TransactionsExt/MetadataFNDTransactionsExt/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/MetadataFND/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Metadata for the EDMC-FIBO Foundations (FND) Domain",
   :xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/FND/MetadataFND/"})

(def FNDDomain
  {:cmns-av/copyright #{"Copyright (c) 2013-2023 Object Management Group, Inc."
                        "Copyright (c) 2013-2023 EDM Council, Inc."},
   :db/ident :fibo-fnd-mod/FNDDomain,
   :dcterms/abstract
   "The Foundations (FND) domain includes ontologies that define general purpose concepts required to support other FIBO domains. These include concepts and relationships about people, organizations, places, and most importantly, contracts that are essential to domains such as Business Entities (BE), Financial Business and Commerce (FBC), Indices and Indicators (IND), and Securities (SEC). \n\nThe scope of the definitions provided in FND is limited to coverage of exactly those concepts needed by other FIBO domain areas.  They may be useful for other domains, such as insurance, but are intentionally underspecified to avoid unintended consequences and thus do not provide exhaustive coverage for any concept contained herein. However, Foundations is designed for growth over time. The expectation is that as additional foundational knowledge is needed to define concepts in other FIBO domain areas, additional ontologies and/or concepts will be integrated into Foundations as required.",
   :dcterms/creator
   {:xsd/anyURI
    "https://wiki.edmcouncil.org/display/FND/FIBO+-+FCT+-+Foundations+Home"},
   :dcterms/hasPart
   #{:fibo-fnd-agr-mod/AgreementsModule :fibo-fnd-law-mod/LawModule
     :fibo-fnd-utl-mod/UtilitiesModule :fibo-fnd-acc-mod/AccountingModule
     :fibo-fnd-dt-mod/DatesAndTimesModule
     :fibo-fnd-txn-mod/TransactionsExtModule :fibo-fnd-qt-mod/QuantitiesModule
     :fibo-fnd-gao-mod/GoalsAndObjectivesModule
     :fibo-fnd-rel-mod/RelationsModule :fibo-fnd-plc-mod/PlacesModule
     :fibo-fnd-arr-mod/ArrangementsModule
     :fibo-fnd-pas-mod/ProductsAndServicesModule
     :fibo-fnd-org-mod/OrganizationsModule
     :fibo-fnd-oac-mod/OwnershipAndControlModule :fibo-fnd-pty-mod/PartiesModule
     :fibo-fnd-aap-mod/AgentsAndPeopleModule},
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :dcterms/title
   #{"Financial Industry Business Ontology (FIBO) Foundations (FND) Domain"
     "FIBO FND Domain"},
   :rdf/type #{:fibo-fnd-utl-av/Module :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/FND/MetadataFND/"},
   :rdfs/label "foundations domain",
   :rdfs/seeAlso {:xsd/anyURI "https://spec.edmcouncil.org/fibo/"}})

(def urn:uuid:6415fa9a-6c59-5541-9112-64bd6023904a
  {:cmns-av/copyright #{"Copyright (c) 2013-2023 Object Management Group, Inc."
                        "Copyright (c) 2013-2023 EDM Council, Inc."},
   :dcterms/abstract "The 'metadata for FND' describes the FND domain.",
   :dcterms/issued #inst "2021-03-29T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-03-31T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Law/MetadataFNDLaw/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/GoalsAndObjectives/MetadataFNDGoalsAndObjectives/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Places/MetadataFNDPlaces/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Quantities/MetadataFNDQuantities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/OwnershipAndControl/MetadataFNDOwnershipAndControl/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/DatesAndTimes/MetadataFNDDatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/ProductsAndServices/MetadataFNDProductsAndServices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/AgentsAndPeople/MetadataFNDAgentsAndPeople/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/MetadataFNDRelations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Agreements/MetadataFNDAgreements/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/MetadataFNDParties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Accounting/MetadataFNDAccounting/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Organizations/MetadataFNDOrganizations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/MetadataFNDUtilities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Arrangements/MetadataFNDArrangements/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/TransactionsExt/MetadataFNDTransactionsExt/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/MetadataFND/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Metadata for the EDMC-FIBO Foundations (FND) Domain",
   :xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/FND/MetadataFND/"})