(ns net.wikipunk.rdf.fibo-fnd-mod
  "The 'metadata for FND' describes the FND domain."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/MetadataFND/FNDDomain",
   :dcterms/abstract "The 'metadata for FND' describes the FND domain.",
   :dcterms/issued #inst "2021-03-29T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/MetadataFNDPlaces/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/MetadataFNDDatesAndTimes/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/TransactionsExt/MetadataFNDTransactionsExt/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/MetadataFNDAccounting/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/GoalsAndObjectives/MetadataFNDGoalsAndObjectives/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/ProductsAndServices/MetadataFNDProductsAndServices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/OwnershipAndControl/MetadataFNDOwnershipAndControl/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/MetadataFNDAgreements/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/AgentsAndPeople/MetadataFNDAgentsAndPeople/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/MetadataFNDArrangements/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/MetadataFNDLaw/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Organizations/MetadataFNDOrganizations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/MetadataFNDParties/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Quantities/MetadataFNDQuantities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/MetadataFNDRelations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/MetadataFNDUtilities/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/MetadataFND/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
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
    "fibo-fnd-mod" "https://spec.edmcouncil.org/fibo/ontology/FND/MetadataFND/",
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
    "fibo-fnd-utl-mod"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/MetadataFNDUtilities/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "https://spec.edmcouncil.org/fibo/ontology/FND/MetadataFND/",
   :rdfa/prefix "fibo-fnd-mod",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/FND/MetadataFND/",
   :rdfs/label "Metadata for the EDMC-FIBO Foundations (FND) Domain",
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright ["Copyright (c) 2013-2021 EDM Council, Inc."
                  "Copyright (c) 2013-2021 Object Management Group, Inc."],
   :sm/fileAbbreviation "fibo-fnd-mod",
   :sm/filename "MetadataFND.rdf"})

(def FNDDomain
  "The Foundations (FND) domain includes ontologies that define general purpose concepts required to support other FIBO domains. These include concepts and relationships about people, organizations, places, and most importantly, contracts that are essential to domains such as Business Entities (BE), Financial Business and Commerce (FBC), Indices and Indicators (IND), and Securities (SEC). The scope of the definitions provided in FND is limited to coverage of exactly those concepts needed by other FIBO specifications. They may be useful for other domains, such as insurance, but are intentionally underspecified to avoid unintended consequences and thus do not provide exhaustive coverage for any concept contained herein. However, Foundations is designed for growth over time. The expectation is that as additional foundational knowledge is needed to define concepts in other FIBO domain areas, additional ontologies and/or concepts will be integrated into Foundations as required."
  {:db/ident :fibo-fnd-mod/FNDDomain,
   :dcterms/abstract
   "The Foundations (FND) domain includes ontologies that define general purpose concepts required to support other FIBO domains. These include concepts and relationships about people, organizations, places, and most importantly, contracts that are essential to domains such as Business Entities (BE), Financial Business and Commerce (FBC), Indices and Indicators (IND), and Securities (SEC). \n\nThe scope of the definitions provided in FND is limited to coverage of exactly those concepts needed by other FIBO specifications.  They may be useful for other domains, such as insurance, but are intentionally underspecified to avoid unintended consequences and thus do not provide exhaustive coverage for any concept contained herein.  However, Foundations is designed for growth over time.  The expectation is that as additional foundational knowledge is needed to define concepts in other FIBO domain areas, additional ontologies and/or concepts will be integrated into Foundations as required.",
   :dcterms/creator
   "https://wiki.edmcouncil.org/display/FND/FIBO+-+FCT+-+Foundations+Home",
   :dcterms/hasPart [:fibo-fnd-oac-mod/OwnershipAndControlModule
                     :fibo-fnd-agr-mod/AgreementsModule
                     :fibo-fnd-plc-mod/PlacesModule
                     :fibo-fnd-utl-mod/UtilitiesModule
                     :fibo-fnd-pty-mod/PartiesModule
                     :fibo-fnd-org-mod/OrganizationsModule
                     :fibo-fnd-dt-mod/DatesAndTimesModule
                     :fibo-fnd-txn-mod/TransactionsExtModule
                     :fibo-fnd-gao-mod/GoalsAndObjectivesModule
                     :fibo-fnd-acc-mod/AccountingModule
                     :fibo-fnd-law-mod/LawModule
                     :fibo-fnd-aap-mod/AgentsAndPeopleModule
                     :fibo-fnd-pas-mod/ProductsAndServicesModule
                     :fibo-fnd-arr-mod/ArrangementsModule
                     :fibo-fnd-rel-mod/RelationsModule
                     :fibo-fnd-qt-mod/QuantitiesModule],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   "EDMC Financial Industry Business Ontology (FIBO) Foundations (FND) Domain",
   :rdf/type [:sm/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/MetadataFND/",
   :rdfs/label "Foundations",
   :rdfs/seeAlso "https://spec.edmcouncil.org/fibo/",
   :sm/copyright ["Copyright (c) 2013-2021 EDM Council, Inc."
                  "Copyright (c) 2013-2021 Object Management Group, Inc."],
   :sm/dependsOn ["http://www.omg.org/techprocess/ab/SpecificationMetadata/"
                  "https://www.omg.org/spec/LCC/"],
   :sm/keyword "foundational vocabulary",
   :sm/moduleAbbreviation "fibo-fnd"})