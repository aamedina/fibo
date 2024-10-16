(ns net.wikipunk.rdf.fibo-fbc-pas-fpas
  {:cmns-av/copyright #{"Copyright (c) 2015-2024 Object Management Group, Inc."
                        "Copyright (c) 2015-2024 EDM Council, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :dcterms/abstract
   "This ontology defines concepts that extend the Foundations (FND) Products and Services concepts specifically for the financial industry, including financial product, financial service, and financial service provider.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-dsg" "https://www.omg.org/spec/Commons/Designators/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
    "cmns-pts" "https://www.omg.org/spec/Commons/PartiesAndSituations/",
    "cmns-qtu" "https://www.omg.org/spec/Commons/QuantitiesAndUnits/",
    "cmns-rlcmp" "https://www.omg.org/spec/Commons/RolesAndCompositions/",
    "cmns-txt" "https://www.omg.org/spec/Commons/TextDatatype/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-fct-fct"
    "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/FunctionalEntities/",
    "fibo-be-fct-pub"
    "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers/",
    "fibo-be-le-lp"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/",
    "fibo-be-oac-exec"
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/",
    "fibo-fbc-fct-rga"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegulatoryAgencies/",
    "fibo-fbc-pas-fpas"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
    "fibo-fnd-agr-ctr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
    "fibo-fnd-arr-lif"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Lifecycles/",
    "fibo-fnd-dt-fd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
    "fibo-fnd-gao-obj"
    "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/Objectives/",
    "fibo-fnd-law-jur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/Jurisdiction/",
    "fibo-fnd-law-lcap"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/",
    "fibo-fnd-oac-own"
    "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Ownership/",
    "fibo-fnd-pas-pas"
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-alx"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/LegalEntities/LEIEntities/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Law/LegalCapacity/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/RegulatoryAgencies/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/ProductsAndServices/ProductsAndServices/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/QuantitiesAndUnits/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/FunctionalEntities/Publishers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/OwnershipAndControl/Ownership/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/GoalsAndObjectives/Objectives/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/DatesAndTimes/FinancialDates/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/Analytics/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/FunctionalEntities/FunctionalEntities/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/TextDatatype/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Law/Jurisdiction/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Arrangements/Lifecycles/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/OwnershipAndControl/Executives/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fbc-pas-fpas",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "Financial Products and Services Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/ version of this ontology was modified to revise the definition of a unique transaction identifier to align with ISO 23897 and to address text formatting issues."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/ version of this ontology was modified to reflect issue resolutions detailed in the FIBO FBC 1.0 FTF report."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/ version of this ontology was modified as a part of organizational hierarchy simplification and to correct a logical inconsistency with respect to the representation of baskets."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/ version of this ontology was modified to add a property to describe the criteria for including something in a basket, if that criteria is known, and to point to a party that is responsible for determining that criteria."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/ version of this ontology was modified to add the notion of a weighted basket, whose consituents are weighted."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices.rdf version of the ontology was modified to replace additional content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/ version of this ontology was modified to fix spelling errors."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/ version of this ontology was modified to eliminate duplication with concepts in LCC and eliminated a redundant superclass on FinancialServiceProvider."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices.rdf version of the ontology was modified to eliminate a redundant restriction (GitHub-2028)."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/ version of this ontology was modified to eliminate deprecated elements."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/ version of this ontology was modified to rename ownership related properties for consistent alignment with the ownership situational pattern, add a definition for trading strategy, and loosen the constraint on offeree for offering to be optional."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices.rdf version of the ontology was modified to add the concept of a contract lifecycle, as distinct from a product or trade lifecycle (FBC-317)."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/ version of this ontology was modified to eliminate references to external dictionary sites that no longer resolve, eliminate circular and ambiguous definitions, and revise definitions that referenced 'face value' improperly."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/ version of this ontology was modified to replace hasDefinition with isDefinedIn to clarify intent."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices.rdf version of this ontology was revised to augment the representation of institutions based on their definitions in the law, and to clarify and extend definitions related to non-bank financial institutions."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/ version of this ontology was modified to replace the property 'characterizes' with 'describes' with respect to restrictions on catalogs, and to correct the label on terminated trade."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices.rdf version of the ontology was modified to eliminate deprecations that are more than 6 months old and to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/ version of this ontology was modified by the FIBO 2.0 RFC, including, but not limited to, the addition of lifecycle events, concepts related to trade settlement, and the definition of a unique transaction identifier (UTI)."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"})

(def AgencyAgreement
  {:db/ident :fibo-fbc-pas-fpas/AgencyAgreement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "agency agreement",
   :rdfs/seeAlso {:xsd/anyURI
                  "http://www.sos.state.tx.us/corp/registeredagents.shtml"},
   :rdfs/subClassOf #{:fibo-fnd-agr-ctr/MutualContractualAgreement
                      {:owl/onProperty     :fibo-fnd-agr-ctr/hasContractParty,
                       :owl/someValuesFrom :fibo-fbc-pas-fpas/RegisteredAgent,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "agreement that designates a party as a registered agent to represent and act on behalf of another party in some, typically legal, financial, or medical capacity"})

(def AgentForServiceOfProcess
  {:cmns-av/explanatoryNote
   "The person may be an officer of the corporation or a third party, such as the corporation's attorney, or a company providing such agency services.",
   :db/ident :fibo-fbc-pas-fpas/AgentForServiceOfProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "agent for service of process",
   :rdfs/seeAlso
   #{{:xsd/anyURI "http://www.sos.state.tx.us/corp/registeredagents.shtml"}
     {:xsd/anyURI
      "http://www.law.cornell.edu/wex/agent_for_service_of_process"}},
   :rdfs/subClassOf :fibo-fbc-pas-fpas/RegisteredAgent,
   :skos/definition
   "registered agent (person or organization) designated by a business entity, such as a corporation, to receive legal correspondence on behalf of the business entity in the jurisdiction in which the agent's address is located"})

(def AmendedTrade
  {:db/ident :fibo-fbc-pas-fpas/AmendedTrade,
   :rdf/type #{:fibo-fbc-pas-fpas/TradeLifecycleStage :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "amended trade",
   :skos/definition
   "stage in the lifecycle of a trade indicating that a change or addition has been made to the terms of the trade, leaving the original terms largely intact"})

(def Basket
  {:cmns-av/explanatoryNote
   #{"From a securities perspective, a basket is a collection of products or securities that are designated to mimic the performance of a market. For investors, the market basket is the principal idea behind index funds, which are essentially a broad sample of stocks, bonds or other securities in the market; this provides investors with a benchmark against which to compare their investment returns."
     "A basket may be associated with a specific market sector, and may be delineated for the purposes of statistical analysis, such as for calculating CPI. According to the US Bureau of Labor Statistics (BLS), with respect to the CPI, a market basket is a package of goods and services that consumers purchase for day-to-day living. The weight of each item is based on the amount of expenditure reported by a sample of households."},
   :db/ident :fibo-fbc-pas-fpas/Basket,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "basket",
   :rdfs/subClassOf #{:cmns-col/Collection
                      {:owl/onProperty     :cmns-col/hasConstituent,
                       :owl/someValuesFrom :fibo-fbc-pas-fpas/BasketConstituent,
                       :rdf/type           :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onDataRange :xsd/string,
                       :owl/onProperty  :fibo-fbc-pas-fpas/hasSelectionCriteria,
                       :rdf/type        :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :cmns-pts/Party,
                       :owl/onProperty :fibo-fbc-pas-fpas/hasSelectingParty,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "collection of goods, services, or other things (e.g., financial contracts) that can be purchased and sold in some marketplace"})

(def BasketConstituent
  {:db/ident :fibo-fbc-pas-fpas/BasketConstituent,
   :owl/equivalentClass {:owl/onProperty     :cmns-col/isConstituentOf,
                         :owl/someValuesFrom :fibo-fbc-pas-fpas/Basket,
                         :rdf/type           :owl/Restriction},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "basket constituent",
   :rdfs/subClassOf :cmns-col/Constituent,
   :skos/definition "component of a basket"})

(def Broker
  {:cmns-av/adaptedFrom
   {:rdf/value "17 CFR 45.1, Definitions - see the definition of agent"},
   :cmns-av/explanatoryNote
   "A broker that specializes in stocks, bonds, commodities, or certain derivatives must be registered with the exchange in which the securities are traded.",
   :db/ident :fibo-fbc-pas-fpas/Broker,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "broker",
   :rdfs/subClassOf #{{:owl/unionOf [:fibo-fbc-pas-fpas/LicensedAgent
                                     :fibo-fbc-pas-fpas/ThirdPartyAgent],
                       :rdf/type    :owl/Class}
                      :fibo-fnd-agr-ctr/ContractThirdParty},
   :skos/definition
   "any party that acts as an intermediary between a buyer and a seller, usually charging a commission"})

(def BrokerDealer
  {:cmns-av/adaptedFrom
   {:rdf/value
    "Office of Financial Research (OFR) Annual Report, 2012, Glossary"},
   :db/ident :fibo-fbc-pas-fpas/BrokerDealer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "broker-dealer",
   :rdfs/subClassOf
   #{{:owl/unionOf [:fibo-fbc-pas-fpas/Broker :fibo-fbc-pas-fpas/Dealer],
      :rdf/type    :owl/Class} :fibo-be-fct-fct/FunctionalEntity},
   :skos/definition
   "any party in the business of buying and selling securities, operating as both a broker and a dealer, depending on the transaction"})

(def Catalog
  {:db/ident :fibo-fbc-pas-fpas/Catalog,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "catalog",
   :rdfs/subClassOf #{:fibo-be-fct-pub/Publication
                      {:owl/onProperty     :cmns-dsg/describes,
                       :owl/someValuesFrom :fibo-fnd-pas-pas/Product,
                       :rdf/type           :owl/Restriction}
                      {:owl/allValuesFrom :cmns-id/Identifier,
                       :owl/onProperty    :cmns-id/isIdentifiedBy,
                       :rdf/type          :owl/Restriction}},
   :skos/definition
   "publication including a list of products available for sale with their descriptions and possibly prices"})

(def ClearedTrade
  {:cmns-av/explanatoryNote
   "Clearing validates the availability of funds, records the transfer, and in the case of securities ensures the delivery of the security to the buyer.",
   :db/ident :fibo-fbc-pas-fpas/ClearedTrade,
   :rdf/type #{:fibo-fbc-pas-fpas/TradeLifecycleStage :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "cleared trade",
   :skos/definition
   "stage in the lifecycle of a trade indicating that a third-party clearing house, acting as an intermediary, has reconciled the orders involved in the trade"})

(def ClosedTrade
  {:db/ident :fibo-fbc-pas-fpas/ClosedTrade,
   :rdf/type #{:fibo-fbc-pas-fpas/TradeLifecycleStage :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "closed trade",
   :skos/definition
   "stage in the lifecycle of a trade indicating that the trade has been finalized, and that there is no longer a corresponding open position on the books of the trader, eliminating any exposure"})

(def ContractLifecycle
  {:cmns-av/explanatoryNote
   "Certain business agreements, such as partnership agreements,may involve planning, drafting/review/revision, execution and management, renewal, and possibly sunsetting phases. Financial contracts, such as loans and other instruments have specific stages and events during the execution and management phase, i.e. from the effective date of the contract through maturity and redemption.",
   :db/ident :fibo-fbc-pas-fpas/ContractLifecycle,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "contract lifecycle",
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-fnd-arr-lif/isLifecycleOf,
      :owl/someValuesFrom :fibo-fnd-agr-ctr/Contract,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-fnd-arr-lif/hasStage,
      :owl/someValuesFrom :fibo-fbc-pas-fpas/ContractLifecycleStage,
      :rdf/type           :owl/Restriction} :fibo-fnd-arr-lif/Lifecycle
     {:owl/onProperty     :cmns-dsg/defines,
      :owl/someValuesFrom :fibo-fbc-pas-fpas/ContractLifecycleStage,
      :rdf/type           :owl/Restriction}},
   :skos/definition
   "lifecycle of an agreement, including, but not limited to a credit agreement, financial instrument, or other formal contract, from initial stages through retirement"})

(def ContractLifecycleEvent
  {:db/ident :fibo-fbc-pas-fpas/ContractLifecycleEvent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "contract lifecycle event",
   :rdfs/subClassOf
   #{{:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-fbc-pas-fpas/ContractLifecycleEvent,
      :owl/onProperty :cmns-dt/succeeds,
      :rdf/type       :owl/Restriction} :fibo-fnd-arr-lif/LifecycleEvent
     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
      :owl/someValuesFrom :fibo-fbc-pas-fpas/ContractLifecycleStage,
      :rdf/type           :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-fbc-pas-fpas/ContractLifecycleEventOccurrence,
      :owl/onProperty :cmns-cls/classifies,
      :rdf/type       :owl/Restriction}},
   :skos/definition
   "kind of event that occurs during one or more stages of the lifecycle of an agreement",
   :skos/example
   "a call notification or coupon payment as a part of a bond lifecycle"})

(def ContractLifecycleEventOccurrence
  {:db/ident :fibo-fbc-pas-fpas/ContractLifecycleEventOccurrence,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "contract lifecycle event occurrence",
   :rdfs/subClassOf
   #{{:owl/onProperty     :cmns-cxtdsg/appliesTo,
      :owl/someValuesFrom :fibo-fbc-pas-fpas/ContractLifecycleStageOccurrence,
      :rdf/type           :owl/Restriction}
     :fibo-fnd-arr-lif/LifecycleEventOccurrence
     {:owl/onClass    :fibo-fbc-pas-fpas/ContractLifecycleEvent,
      :owl/onProperty :fibo-fnd-rel-rel/exemplifies,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction}
     {:owl/onProperty     :cmns-cls/isClassifiedBy,
      :owl/someValuesFrom :fibo-fbc-pas-fpas/ContractLifecycleEvent,
      :rdf/type           :owl/Restriction}},
   :skos/definition
   "actual occurrence of an event during a specific stage of a specific contract lifecycle"})

(def ContractLifecycleOccurrence
  {:db/ident :fibo-fbc-pas-fpas/ContractLifecycleOccurrence,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "contract lifecycle occurrence",
   :rdfs/subClassOf #{:fibo-fnd-arr-lif/LifecycleOccurrence
                      {:owl/onProperty :fibo-fnd-arr-lif/hasStage,
                       :owl/someValuesFrom
                       :fibo-fbc-pas-fpas/ContractLifecycleStageOccurrence,
                       :rdf/type :owl/Restriction}
                      {:owl/onClass    :fibo-fbc-pas-fpas/ContractLifecycle,
                       :owl/onProperty :fibo-fnd-rel-rel/exemplifies,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}},
   :skos/definition "realization of the lifecycle of a specific contract"})

(def ContractLifecycleStage
  {:db/ident :fibo-fbc-pas-fpas/ContractLifecycleStage,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "contract lifecycle stage",
   :rdfs/subClassOf #{:fibo-fnd-arr-lif/LifecycleStage
                      {:owl/onProperty     :cmns-cls/classifies,
                       :owl/someValuesFrom :fibo-fnd-agr-ctr/Contract,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :cmns-dsg/isDefinedIn,
                       :owl/someValuesFrom :fibo-fbc-pas-fpas/ContractLifecycle,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty :cmns-col/comprises,
                       :owl/someValuesFrom
                       :fibo-fbc-pas-fpas/ContractLifecycleEvent,
                       :rdf/type :owl/Restriction}
                      {:owl/onProperty     :fibo-fnd-arr-lif/isStageOf,
                       :owl/someValuesFrom :fibo-fbc-pas-fpas/ContractLifecycle,
                       :rdf/type           :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass :fibo-fbc-pas-fpas/ContractLifecycleStage,
                       :owl/onProperty :cmns-dt/succeeds,
                       :rdf/type :owl/Restriction}},
   :skos/definition "phase in the lifecycle of an agreement"})

(def ContractLifecycleStageOccurrence
  {:db/ident :fibo-fbc-pas-fpas/ContractLifecycleStageOccurrence,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "contract lifecycle stage occurrence",
   :rdfs/subClassOf
   #{:fibo-fnd-arr-lif/LifecycleStageOccurrence
     {:owl/onProperty     :fibo-fnd-arr-lif/isStageOf,
      :owl/someValuesFrom :fibo-fbc-pas-fpas/ContractLifecycleOccurrence,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :cmns-col/comprises,
      :owl/someValuesFrom :fibo-fbc-pas-fpas/ContractLifecycleEventOccurrence,
      :rdf/type           :owl/Restriction}
     {:owl/onClass    :fibo-fbc-pas-fpas/ContractLifecycleStage,
      :owl/onProperty :fibo-fnd-rel-rel/exemplifies,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction}},
   :skos/definition
   "realization, from start to finish of a phase in an occurrence of a specific contract lifecycle"})

(def Dealer
  {:cmns-av/explanatoryNote
   "A dealer is a counterparty or principal in the transaction with the customer.",
   :db/ident :fibo-fbc-pas-fpas/Dealer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "dealer",
   :rdfs/subClassOf #{:fibo-fnd-pas-pas/ServiceProvider
                      {:owl/unionOf [:fibo-fnd-pas-pas/Buyer
                                     :fibo-fnd-pas-pas/Seller],
                       :rdf/type    :owl/Class}},
   :skos/definition
   "any party that purchases goods or services for resale and acts on their own behalf in a transaction"})

(def Exposure
  {:db/ident :fibo-fbc-pas-fpas/Exposure,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "exposure",
   :rdfs/subClassOf {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                     :owl/someValuesFrom :cmns-pts/Party,
                     :rdf/type           :owl/Restriction},
   :skos/definition
   "the extent to which an individual or organization is unprotected and open to damage, danger, risk of suffering a loss, or uncertainty",
   :skos/example
   "Examples include financial exposure, credit exposure, legal exposure, credit rating exposure, reputational exposure, and so forth."})

(def FinancialExposure
  {:db/ident :fibo-fbc-pas-fpas/FinancialExposure,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "financial exposure",
   :rdfs/subClassOf #{:fibo-fbc-pas-fpas/Exposure :cmns-qtu/Expression},
   :skos/definition
   "the extent to which an individual or organization is open to risk of suffering a loss in a transaction, or with respect to some investment or set of investments, e.g., some holding; the amount one stands to lose in that transaction or investment",
   :skos/example
   "Examples in banking include the total amount of unsecured loans, the amount of loans advanced to a single borrower, group, industry, or country, and the probability of loss from devaluation, revaluation, or foreign exchange fluctuations."})

(def FinancialIntermediationService
  {:cmns-av/explanatoryNote
   "Often investors and borrowers do not have precisely matching needs, and the intermediary's capital is put at risk to transform the credit risk and maturity of the liabilities to meet the needs of investors.",
   :db/ident :fibo-fbc-pas-fpas/FinancialIntermediationService,
   :fibo-fnd-utl-av/definitionOrigin
   "Office of Financial Research (OFR) Annual Report, 2012, Glossary",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "financial intermediation service",
   :rdfs/subClassOf :fibo-fbc-pas-fpas/FinancialService,
   :skos/definition
   "any financial service in which a third party (the intermediary) matches lenders and investors with entrepreneurs and other borrowers in need of capital"})

(def FinancialProduct
  {:db/ident :fibo-fbc-pas-fpas/FinancialProduct,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "financial product",
   :rdfs/subClassOf #{:fibo-fnd-pas-pas/Product
                      {:owl/onProperty :fibo-fnd-rel-rel/isProvidedBy,
                       :owl/someValuesFrom
                       :fibo-fbc-pas-fpas/FinancialServiceProvider,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "product provided to consumers and businesses by financial institutions such as banks, insurance companies, brokerage firms, consumer finance companies, and investment companies"})

(def FinancialProductCatalog
  {:cmns-av/adaptedFrom {:rdf/value "Nordea Bank"},
   :db/ident :fibo-fbc-pas-fpas/FinancialProductCatalog,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "financial product catalog",
   :rdfs/subClassOf #{:fibo-fbc-pas-fpas/Catalog
                      {:owl/onProperty     :cmns-dsg/describes,
                       :owl/someValuesFrom :fibo-fbc-pas-fpas/FinancialProduct,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "catalog of financial products and/or services available for sale with their description and other product details"})

(def FinancialService
  {:db/ident :fibo-fbc-pas-fpas/FinancialService,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "financial service",
   :rdfs/subClassOf #{:fibo-fnd-pas-pas/Service
                      {:owl/onProperty :fibo-fnd-rel-rel/isProvidedBy,
                       :owl/someValuesFrom
                       :fibo-fbc-pas-fpas/FinancialServiceProvider,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "service provided to consumers and businesses by financial institutions such as banks, insurance companies, brokerage firms, consumer finance companies, and investment companies"})

(def FinancialServiceProvider
  {:db/ident :fibo-fbc-pas-fpas/FinancialServiceProvider,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "financial service provider",
   :rdfs/subClassOf #{:fibo-be-fct-fct/FunctionalBusinessEntity
                      {:owl/onProperty     :fibo-fnd-rel-rel/provides,
                       :owl/someValuesFrom :fibo-fbc-pas-fpas/FinancialService,
                       :rdf/type           :owl/Restriction}
                      {:owl/onClass    :fibo-be-le-lp/LegalEntity,
                       :owl/onProperty :cmns-rlcmp/isPlayedBy,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      :fibo-fnd-pas-pas/ServiceProvider},
   :skos/definition
   "functional entity either licensed to provide financial services to consumers and/or businesses or established by law to provide financial services, such as a central bank"})

(def Holding
  {:cmns-av/explanatoryNote
   "Note that a holding may refer to a single asset, such as a piece of real estate, a portfolio of assets, multiple portfolios, and so forth, and is frequently aggregated over multiple assets.",
   :db/ident :fibo-fbc-pas-fpas/Holding,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "holding",
   :rdfs/subClassOf #{:fibo-fnd-oac-own/Ownership
                      {:owl/onProperty     :fibo-fnd-oac-own/hasOwnedAsset,
                       :owl/someValuesFrom :fibo-fnd-oac-own/Asset,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "real or personal property (assets), including but not limited to financial assets, to which one holds title and of which one has possession"})

(def LegalAgent
  {:cmns-av/adaptedFrom
   {:rdf/value "17 CFR 45.1, Definitions - see the definition of agent"},
   :db/ident :fibo-fbc-pas-fpas/LegalAgent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "legal agent",
   :rdfs/subClassOf #{:cmns-pts/AgentRole
                      {:owl/onProperty :cmns-rlcmp/isPlayedBy,
                       :owl/someValuesFrom
                       {:owl/onProperty :fibo-fnd-law-lcap/hasCapacity,
                        :owl/someValuesFrom
                        :fibo-fnd-law-lcap/DelegatedLegalAuthority,
                        :rdf/type :owl/Restriction},
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "any party that has been legally empowered to act on behalf of another party"})

(def LicensedAgent
  {:cmns-av/adaptedFrom
   {:rdf/value "17 CFR 45.1, Definitions - see the definition of agent"},
   :db/ident :fibo-fbc-pas-fpas/LicensedAgent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "licensed agent",
   :rdfs/subClassOf #{:fibo-fnd-law-lcap/Licensee
                      :fibo-be-oac-exec/ResponsibleParty
                      :fibo-fbc-pas-fpas/LegalAgent},
   :skos/definition
   "any individual who is licensed to perform a legally binding function, and who has been legally empowered to act on behalf of another party",
   :skos/example
   "Insurance agents, realtors, financial advisors, certain attorneys, and brokers are examples of legal agents."})

(def MaturedTrade
  {:db/ident :fibo-fbc-pas-fpas/MaturedTrade,
   :rdf/type #{:fibo-fbc-pas-fpas/TradeLifecycleStage :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "matured trade",
   :skos/definition
   "stage in the lifecycle of a trade indicating that the trade, and related instrument(s) has ended (expired)"})

(def Offeree
  {:db/ident :fibo-fbc-pas-fpas/Offeree,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "offeree",
   :rdfs/subClassOf
   #{:cmns-pts/PartyRole
     {:owl/onProperty     :cmns-rlcmp/isPlayedBy,
      :owl/someValuesFrom {:owl/onProperty     :cmns-pts/isAPartyTo,
                           :owl/someValuesFrom :fibo-fbc-pas-fpas/Offering,
                           :rdf/type           :owl/Restriction},
      :rdf/type           :owl/Restriction}},
   :skos/definition
   "party that receives an offer from something from someone (i.e., an offerer) based on the terms of the offering"})

(def Offering
  {:cmns-av/explanatoryNote
   "The making of an offer is the first of three steps in the traditional process of forming a valid contract: an offer, an acceptance of the offer, and an exchange of consideration. (Consideration is the act of doing something or promising to do something that a person is not legally required to do, or the forbearance or the promise to forbear from doing something that he or she has the legal right to do.)",
   :cmns-av/usageNote
   "An offering may or may not be considered a 'state of affairs' or situation, depending on the circumstances. In some cases such as a prospectus or other offering in the context of financial services, an offering may also be classified as a situation. Users may choose to model an individual offering as both an offering and situation, depending on the circumstances, in other words.",
   :db/ident :fibo-fbc-pas-fpas/Offering,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "offering",
   :rdfs/subClassOf #{{:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-fbc-pas-fpas/Offeree,
                       :owl/onProperty :cmns-pts/hasPartyRole,
                       :rdf/type       :owl/Restriction}
                      {:owl/onProperty     :cmns-pts/hasPartyRole,
                       :owl/someValuesFrom :fibo-fbc-pas-fpas/Offeror,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                       :owl/someValuesFrom :owl/Thing,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :fibo-fnd-rel-rel/isIssuedBy,
                       :owl/someValuesFrom :fibo-fbc-pas-fpas/Offeror,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "expression of interest in providing something to someone that is contingent upon acceptance, forbearance, or some other consideration, as might be desired by an offeree(s)"})

(def Offeror
  {:db/ident :fibo-fbc-pas-fpas/Offeror,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "offeror",
   :rdfs/subClassOf
   #{:cmns-pts/PartyRole
     {:owl/onProperty     :fibo-fnd-rel-rel/issues,
      :owl/someValuesFrom :fibo-fbc-pas-fpas/Offering,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :cmns-rlcmp/isPlayedBy,
      :owl/someValuesFrom {:owl/onProperty     :cmns-pts/isAPartyTo,
                           :owl/someValuesFrom :fibo-fbc-pas-fpas/Offering,
                           :rdf/type           :owl/Restriction},
      :rdf/type           :owl/Restriction}},
   :skos/definition
   "party that proposes to make something available to someone (i.e., an offeree) based on the terms of the offering"})

(def OpenTrade
  {:db/ident :fibo-fbc-pas-fpas/OpenTrade,
   :rdf/type #{:fibo-fbc-pas-fpas/TradeLifecycleStage :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "open trade",
   :skos/definition
   "stage in the lifecycle of a trade indicating that the trade has been established and there is an associated open position on the books of the trader as a consequence"})

(def Position
  {:cmns-av/explanatoryNote
   "A position can be long or short, and it can be in any asset class, such as stocks, bonds, futures, or options. A position can be open (current) or closed (past), but in general use, unless a position is specifically referred to as closed, the assumption is that it references an open position.",
   :db/ident :fibo-fbc-pas-fpas/Position,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "position",
   :rdfs/subClassOf #{:fibo-fbc-pas-fpas/Holding
                      {:owl/onClass    :fibo-fnd-oac-own/Asset,
                       :owl/onProperty :fibo-fnd-oac-own/hasOwnedAsset,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "an investor's stake, i.e., a holding, in a particular asset (such as an individual security)"})

(def ProductLifecycle
  {:db/ident :fibo-fbc-pas-fpas/ProductLifecycle,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "product lifecycle",
   :rdfs/subClassOf
   #{{:owl/onProperty     :cmns-dsg/defines,
      :owl/someValuesFrom :fibo-fbc-pas-fpas/ProductLifecycleStage,
      :rdf/type           :owl/Restriction} :fibo-fnd-arr-lif/Lifecycle
     {:owl/onProperty     :fibo-fnd-arr-lif/hasStage,
      :owl/someValuesFrom :fibo-fbc-pas-fpas/ProductLifecycleStage,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-fnd-arr-lif/isLifecycleOf,
      :owl/someValuesFrom :fibo-fnd-pas-pas/Product,
      :rdf/type           :owl/Restriction}},
   :skos/definition "lifecycle specific to a product or product family",
   :skos/example
   "The product life cycle describes the period of time over which an item is developed, brought to market and eventually removed from the market. The cycle is broken into four stages: introduction, growth, maturity and decline. The idea of the product life cycle is used in marketing to decide when it is appropriate to advertise, reduce prices, explore new markets or create new packaging."})

(def ProductLifecycleEvent
  {:db/ident :fibo-fbc-pas-fpas/ProductLifecycleEvent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "product lifecycle event",
   :rdfs/subClassOf
   #{{:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-fbc-pas-fpas/ProductLifecycleEvent,
      :owl/onProperty :cmns-dt/succeeds,
      :rdf/type       :owl/Restriction}
     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
      :owl/someValuesFrom :fibo-fbc-pas-fpas/ProductLifecycleStage,
      :rdf/type           :owl/Restriction} :fibo-fnd-arr-lif/LifecycleEvent
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-fbc-pas-fpas/ProductLifecycleEventOccurrence,
      :owl/onProperty :cmns-cls/classifies,
      :rdf/type       :owl/Restriction}},
   :skos/definition
   "kind of event that occurs during one or more stages of a product lifecycle"})

(def ProductLifecycleEventOccurrence
  {:db/ident :fibo-fbc-pas-fpas/ProductLifecycleEventOccurrence,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "product lifecycle event occurrence",
   :rdfs/subClassOf #{{:owl/onClass    :fibo-fbc-pas-fpas/ProductLifecycleEvent,
                       :owl/onProperty :fibo-fnd-rel-rel/exemplifies,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      :fibo-fnd-arr-lif/LifecycleEventOccurrence
                      {:owl/onProperty :cmns-cxtdsg/appliesTo,
                       :owl/someValuesFrom
                       :fibo-fbc-pas-fpas/ProductLifecycleStageOccurrence,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "actual occurrence of an event that happens during a specific stage of a specific product lifecycle"})

(def ProductLifecycleOccurrence
  {:db/ident :fibo-fbc-pas-fpas/ProductLifecycleOccurrence,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "product lifecycle occurrence",
   :rdfs/subClassOf #{:fibo-fnd-arr-lif/LifecycleOccurrence
                      {:owl/onClass    :fibo-fbc-pas-fpas/ProductLifecycle,
                       :owl/onProperty :fibo-fnd-rel-rel/exemplifies,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      {:owl/onProperty :fibo-fnd-arr-lif/hasStage,
                       :owl/someValuesFrom
                       :fibo-fbc-pas-fpas/ProductLifecycleStageOccurrence,
                       :rdf/type :owl/Restriction}},
   :skos/definition "realization of the lifecycle of a specific product"})

(def ProductLifecycleStage
  {:db/ident :fibo-fbc-pas-fpas/ProductLifecycleStage,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "product lifecycle stage",
   :rdfs/subClassOf #{:fibo-fnd-arr-lif/LifecycleStage
                      {:owl/onProperty     :fibo-fnd-arr-lif/isStageOf,
                       :owl/someValuesFrom :fibo-fbc-pas-fpas/ProductLifecycle,
                       :rdf/type           :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-fbc-pas-fpas/ProductLifecycleStage,
                       :owl/onProperty :cmns-dt/succeeds,
                       :rdf/type       :owl/Restriction}
                      {:owl/onProperty     :cmns-dsg/isDefinedIn,
                       :owl/someValuesFrom :fibo-fbc-pas-fpas/ProductLifecycle,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :cmns-cls/classifies,
                       :owl/someValuesFrom :fibo-fnd-pas-pas/Product,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty :cmns-col/comprises,
                       :owl/someValuesFrom
                       :fibo-fbc-pas-fpas/ProductLifecycleEvent,
                       :rdf/type :owl/Restriction}},
   :skos/definition "phase in a product lifecycle",
   :skos/example
   "research and development phase of a product lifecycle or the introduction phase in a marketing lifecycle, growth stage in an economic lifecycle for a product"})

(def ProductLifecycleStageOccurrence
  {:db/ident :fibo-fbc-pas-fpas/ProductLifecycleStageOccurrence,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "product lifecycle stage occurrence",
   :rdfs/subClassOf
   #{:fibo-fnd-arr-lif/LifecycleStageOccurrence
     {:owl/onProperty     :fibo-fnd-arr-lif/isStageOf,
      :owl/someValuesFrom :fibo-fbc-pas-fpas/ProductLifecycleOccurrence,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :cmns-col/comprises,
      :owl/someValuesFrom :fibo-fbc-pas-fpas/ProductLifecycleEventOccurrence,
      :rdf/type           :owl/Restriction}
     {:owl/onClass    :fibo-fbc-pas-fpas/ProductLifecycleStage,
      :owl/onProperty :fibo-fnd-rel-rel/exemplifies,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction}},
   :skos/definition
   "realization of a specific stage in the lifecycle of a given product"})

(def RegisteredAgent
  {:cmns-av/explanatoryNote
   "Agency capacity, as specified in an agency agreement, may include power of attorney, the ability to act as an agent in certain kinds of transactions such as real estate, tax, audit or other financial or legal transactions, as a fiduciary, including as a trustee or legal guardian, for service of process, and so forth.",
   :cmns-av/synonym #{"resident agent" "statutory agent"},
   :db/ident :fibo-fbc-pas-fpas/RegisteredAgent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "registered agent",
   :rdfs/seeAlso #{{:xsd/anyURI
                    "http://www.sos.state.tx.us/corp/registeredagents.shtml"}
                   {:xsd/anyURI "https://thelawdictionary.org/agent/"}},
   :rdfs/subClassOf
   #{:fibo-fnd-agr-ctr/ContractParty
     {:owl/onProperty     :cmns-rlcmp/isPlayedBy,
      :owl/someValuesFrom {:owl/intersectionOf
                           [{:owl/onProperty :cmns-pts/isAPartyTo,
                             :owl/someValuesFrom
                             :fibo-fbc-pas-fpas/AgencyAgreement,
                             :rdf/type :owl/Restriction}
                            {:owl/onProperty     :fibo-be-le-lp/isRecognizedIn,
                             :owl/someValuesFrom :fibo-fnd-law-jur/Jurisdiction,
                             :rdf/type           :owl/Restriction}],
                           :rdf/type :owl/Class},
      :rdf/type           :owl/Restriction} :fibo-fbc-pas-fpas/LegalAgent},
   :skos/definition
   "legal agent designated by some party to represent them and act on their behalf under a formal agency agreement"})

(def RegulatedCommodity
  {:cmns-av/explanatoryNote
   "The CFTC polices matters of information and disclosure, fair trading practices, registration of firms and individuals, protection of customer funds, record keeping, and maintenance of orderly options and futures markets in the United States.",
   :db/ident :fibo-fbc-pas-fpas/RegulatedCommodity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "regulated commodity",
   :rdfs/subClassOf #{{:owl/allValuesFrom :fibo-fbc-fct-rga/RegulatoryAgency,
                       :owl/onProperty    :fibo-fbc-fct-rga/isRegulatedBy,
                       :rdf/type          :owl/Restriction}
                      {:owl/onProperty     :fibo-fnd-rel-rel/isGovernedBy,
                       :owl/someValuesFrom :fibo-fnd-law-jur/Jurisdiction,
                       :rdf/type           :owl/Restriction}
                      :fibo-fnd-pas-pas/Commodity},
   :skos/definition
   "commodity under the jurisdiction of the regulatory agency, such as the Commodities Futures Trading Commission (CFTF) in the United States, which includes any commodity traded in an organized contracts market"})

(def SettlementTerms
  {:cmns-av/explanatoryNote
   "In general, settlement involves arrangement of disposition of property, typically for legal reasons. With respect to financial transactions, it involves completion of a trade, either between brokers or agents, or between a broker and client. This may include settlement in cash, either for the entire transaction or for the cash leg of a transaction, either now or at some specified time in the future.",
   :db/ident :fibo-fbc-pas-fpas/SettlementTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "settlement terms",
   :rdfs/subClassOf #{:fibo-fnd-agr-ctr/ContractualCommitment
                      {:owl/allValuesFrom :cmns-dt/Date,
                       :owl/onProperty    :fibo-fbc-pas-fpas/hasSettlementDate,
                       :rdf/type          :owl/Restriction}},
   :skos/definition
   "contract terms that define the commitment to and mechanism for settling one or more sides of a transaction"})

(def TerminatedTrade
  {:cmns-av/explanatoryNote
   "Early termination may be triggered by a position sell or early termination provision, such as auto call/cancel, knock-out, etc.",
   :db/ident :fibo-fbc-pas-fpas/TerminatedTrade,
   :rdf/type #{:fibo-fbc-pas-fpas/TradeLifecycleStage :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "terminated trade",
   :skos/definition
   "stage in the trade lifecycle in which the trade has been terminated early, i.e., prior to maturity"})

(def ThirdPartyAgent
  {:cmns-av/adaptedFrom
   {:rdf/value "17 CFR 45.1, Definitions - see the definition of agent"},
   :cmns-av/usageNote
   "Note that third-party agent is defined as a service provider (organization) acting in an agency capacity, such as a law firm, accountancy, or investment bank. This is distinct from the concept of an individual (licensed agent), for example one who works for a broker-dealer, that is a registered agent licensed to sell securities.",
   :db/ident :fibo-fbc-pas-fpas/ThirdPartyAgent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "third-party agent",
   :rdfs/subClassOf #{:fibo-fnd-law-lcap/Licensee :fibo-fbc-pas-fpas/LegalAgent
                      :fibo-fnd-pas-pas/ServiceProvider},
   :skos/definition
   "any service provider that is licensed to perform a legally binding function and has been legally empowered to act on behalf of another party"})

(def Trade
  {:cmns-av/adaptedFrom
   {:rdf/value
    "Deutsche Bank Presentation on the Lifecycle of a Trade, available at http://www.slideshare.net/ahaline/23512555-tradelifecycle"},
   :cmns-av/explanatoryNote
   #{"The seller must deliver the commodity sold to the buyer; the buyer must pay the agreed purchase price, which could be in the form of other goods or services, on the agreed date."
     "The advent of money as a medium of exchange has allowed trade to be conducted in a manner that is much simpler and effective compared to earlier forms of trade, such as bartering. In financial markets, trading also can mean performing a transaction that involves the selling and purchasing of a security."
     "Trading activities typically include (a) regularly underwriting or dealing in securities; interest rate, foreign exchange rate, commodity, equity, and credit derivative contracts; other financial instruments; and other assets for resale, (b) acquiring or taking positions in such items principally for the purpose of selling in the near term or otherwise with the intent to resell in order to profit from short-term price movements, and (c) acquiring or taking positions in such items as an accommodation to customers or for other trading purposes. (Source: Instructions for Preparation of Consolidated Reports of Condition and Income (FFIEC 031 and 041), Schedule RC-D - Trading Assets and Liabilities, 2013."},
   :db/ident :fibo-fbc-pas-fpas/Trade,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "trade",
   :rdfs/subClassOf #{{:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-fbc-pas-fpas/TradeLifecycle,
                       :owl/onProperty :cmns-cls/isCharacterizedBy,
                       :rdf/type       :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-fbc-pas-fpas/Trader,
                       :owl/onProperty :fibo-fbc-pas-fpas/isFacilitatedBy,
                       :rdf/type       :owl/Restriction}
                      {:owl/onProperty     :fibo-fbc-pas-fpas/isEmbodiedIn,
                       :owl/someValuesFrom :fibo-fnd-agr-ctr/Contract,
                       :rdf/type           :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-fbc-pas-fpas/TradeIdentifier,
                       :owl/onProperty :cmns-id/isIdentifiedBy,
                       :rdf/type       :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-fbc-pas-fpas/Trade,
                       :owl/onProperty :cmns-dt/succeeds,
                       :rdf/type       :owl/Restriction} :cmns-pts/Situation
                      {:owl/onProperty     :fibo-fnd-pas-pas/hasSeller,
                       :owl/someValuesFrom :fibo-fnd-pas-pas/Seller,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :fibo-fnd-pas-pas/hasBuyer,
                       :owl/someValuesFrom :fibo-fnd-pas-pas/Buyer,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :fibo-fnd-rel-rel/involves,
                       :owl/someValuesFrom {:owl/unionOf
                                            [:fibo-fnd-pas-pas/Good
                                             :fibo-fnd-pas-pas/Service
                                             :fibo-fnd-agr-ctr/Contract],
                                            :rdf/type :owl/Class},
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "situation that realizes an agreement between parties participating in a voluntary action of buying and selling goods and services"})

(def TradeIdentifier
  {:db/ident :fibo-fbc-pas-fpas/TradeIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "trade identifier",
   :rdfs/subClassOf #{:cmns-id/Identifier
                      {:owl/onProperty     :cmns-id/identifies,
                       :owl/someValuesFrom :fibo-fbc-pas-fpas/Trade,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "sequence of characters identifying a trade within some context",
   :skos/note
   "Note that a given trade may consist of multiple transactions, and thus there may be multiple identifiers for such transactions associated with a specific trade."})

(def TradeLifecycle
  {:db/ident :fibo-fbc-pas-fpas/TradeLifecycle,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "trade lifecycle",
   :rdfs/subClassOf
   #{{:owl/onProperty     :cmns-dsg/defines,
      :owl/someValuesFrom :fibo-fbc-pas-fpas/TradeLifecycleStage,
      :rdf/type           :owl/Restriction} :fibo-fnd-arr-lif/Lifecycle
     {:owl/onProperty     :fibo-fnd-arr-lif/isLifecycleOf,
      :owl/someValuesFrom :fibo-fbc-pas-fpas/Trade,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-fnd-arr-lif/hasStage,
      :owl/someValuesFrom :fibo-fbc-pas-fpas/TradeLifecycleStage,
      :rdf/type           :owl/Restriction}},
   :skos/definition
   "lifecycle that defines the evolution of a trade, from initiation through settlement",
   :skos/example
   "The trade life cycle covers the period of time over which a trade is initiated, typically as a part of a broader deal, is consumated, processed and executed, is settled or closed for other reasons, and is reported. Parts of a trade lifecycle may include or overlap with the lifecycle of one or more contracts."})

(def TradeLifecycleEvent
  {:db/ident :fibo-fbc-pas-fpas/TradeLifecycleEvent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "trade lifecycle event",
   :rdfs/subClassOf
   #{{:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-fbc-pas-fpas/TradeLifecycleEvent,
      :owl/onProperty :cmns-dt/succeeds,
      :rdf/type       :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-fbc-pas-fpas/TradeLifecycleEventOccurrence,
      :owl/onProperty :cmns-cls/classifies,
      :rdf/type       :owl/Restriction} :fibo-fnd-arr-lif/LifecycleEvent
     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
      :owl/someValuesFrom :fibo-fbc-pas-fpas/TradeLifecycleStage,
      :rdf/type           :owl/Restriction}},
   :skos/definition
   "kind of event that occurs during one or more stages of the lifecycle of a trade"})

(def TradeLifecycleEventOccurrence
  {:db/ident :fibo-fbc-pas-fpas/TradeLifecycleEventOccurrence,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "trade lifecycle event occurrence",
   :rdfs/subClassOf
   #{{:owl/onClass    :fibo-fbc-pas-fpas/TradeLifecycleEvent,
      :owl/onProperty :fibo-fnd-rel-rel/exemplifies,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction}
     :fibo-fnd-arr-lif/LifecycleEventOccurrence
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-fbc-pas-fpas/TradeLifecycleEventOccurrence,
      :owl/onProperty :cmns-dt/succeeds,
      :rdf/type       :owl/Restriction}
     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
      :owl/someValuesFrom :fibo-fbc-pas-fpas/TradeLifecycleStageOccurrence,
      :rdf/type           :owl/Restriction}},
   :skos/definition
   "realization of an event that happens during a specific stage of a specific trade lifecycle"})

(def TradeLifecycleOccurrence
  {:db/ident :fibo-fbc-pas-fpas/TradeLifecycleOccurrence,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "trade lifecycle occurrence",
   :rdfs/subClassOf
   #{{:owl/onClass    :fibo-fbc-pas-fpas/TradeLifecycle,
      :owl/onProperty :fibo-fnd-rel-rel/exemplifies,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction} :fibo-fnd-arr-lif/LifecycleOccurrence
     {:owl/onProperty     :fibo-fnd-arr-lif/hasStage,
      :owl/someValuesFrom :fibo-fbc-pas-fpas/TradeLifecycleStageOccurrence,
      :rdf/type           :owl/Restriction}},
   :skos/definition "realization of the lifecycle for a specific trade"})

(def TradeLifecycleStage
  {:db/ident :fibo-fbc-pas-fpas/TradeLifecycleStage,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "trade lifecycle stage",
   :rdfs/subClassOf
   #{{:owl/onProperty     :cmns-dsg/isDefinedIn,
      :owl/someValuesFrom :fibo-fbc-pas-fpas/TradeLifecycle,
      :rdf/type           :owl/Restriction} :fibo-fnd-arr-lif/LifecycleStage
     {:owl/onProperty     :cmns-cls/classifies,
      :owl/someValuesFrom :fibo-fbc-pas-fpas/Trade,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-fnd-arr-lif/isStageOf,
      :owl/someValuesFrom :fibo-fbc-pas-fpas/TradeLifecycle,
      :rdf/type           :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-fbc-pas-fpas/TradeLifecycleStage,
      :owl/onProperty :cmns-dt/succeeds,
      :rdf/type       :owl/Restriction}
     {:owl/onProperty     :cmns-col/comprises,
      :owl/someValuesFrom :fibo-fbc-pas-fpas/TradeLifecycleEvent,
      :rdf/type           :owl/Restriction}},
   :skos/definition "phase in the lifecycle of a trade"})

(def TradeLifecycleStageOccurrence
  {:db/ident :fibo-fbc-pas-fpas/TradeLifecycleStageOccurrence,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "trade lifecycle stage occurrence",
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-fnd-arr-lif/isStageOf,
      :owl/someValuesFrom :fibo-fbc-pas-fpas/TradeLifecycleOccurrence,
      :rdf/type           :owl/Restriction}
     :fibo-fnd-arr-lif/LifecycleStageOccurrence
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-fbc-pas-fpas/TradeLifecycleStageOccurrence,
      :owl/onProperty :cmns-dt/succeeds,
      :rdf/type       :owl/Restriction}
     {:owl/onProperty     :cmns-col/comprises,
      :owl/someValuesFrom :fibo-fbc-pas-fpas/TradeLifecycleEventOccurrence,
      :rdf/type           :owl/Restriction}
     {:owl/onClass    :fibo-fbc-pas-fpas/TradeLifecycleStage,
      :owl/onProperty :fibo-fnd-rel-rel/exemplifies,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction}},
   :skos/definition
   "realization of a phase in the lifecycle of a specific trade"})

(def Trader
  {:db/ident :fibo-fbc-pas-fpas/Trader,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "trader",
   :rdfs/subClassOf
   #{{:owl/onProperty     :cmns-rlcmp/isPlayedBy,
      :owl/someValuesFrom {:owl/onProperty :fibo-fnd-law-lcap/hasCapacity,
                           :owl/someValuesFrom
                           :fibo-fnd-law-lcap/ContractualCapability,
                           :rdf/type :owl/Restriction},
      :rdf/type           :owl/Restriction} :fibo-fnd-pas-pas/ServiceProvider
     {:owl/onProperty     :fibo-fbc-pas-fpas/facilitates,
      :owl/someValuesFrom :fibo-fbc-pas-fpas/Trade,
      :rdf/type           :owl/Restriction}},
   :skos/definition
   "party that engages in the transfer of financial assets in any financial market on behalf of a client or the financial services provider"})

(def TradingStrategy
  {:cmns-av/explanatoryNote
   "A trading strategy is a plan whose aim is to make a profit or hedge against risk, based on rules and other criteria used when making trading decisions. A trading strategy may be simple or complex, and involve considerations such as investment style (e.g., value vs. growth), market cap, technical indicators, fundamental analysis, industry sector, level of portfolio diversification, time horizon or holding period, risk tolerance, leverage, tax considerations, and so on.",
   :db/ident :fibo-fbc-pas-fpas/TradingStrategy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "trading strategy",
   :rdfs/subClassOf :fibo-fnd-gao-obj/Strategy,
   :skos/definition
   "approach used for buying and selling in the securities markets"})

(def UniqueTransactionIdentifier
  {:cmns-av/abbreviation "UTI",
   :cmns-av/adaptedFrom
   #{{:rdf/value
      "ISO 23897:2020, Financial services - Unique transaction identifier (UTI)"}
     {:rdf/value
      "Harmonization of the Unique Transaction Identifier - Technical Guidance, 20 Feb 2017, described in https://www.bis.org/cpmi/publ/d158.pdf"}},
   :cmns-av/explanatoryNote
   "In particular, a UTI will help to ensure the consistent aggregation of OTC derivatives and other securities transactions by minimising the likelihood that the same transaction will be counted more than once (for instance, because it is reported by more than one counterparty to a transaction, or to more than one trade repository (TR)).",
   :db/ident :fibo-fbc-pas-fpas/UniqueTransactionIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "unique transaction identifier",
   :rdfs/subClassOf #{:fibo-fbc-pas-fpas/TradeIdentifier
                      {:owl/onProperty :fibo-fbc-pas-fpas/hasGeneratingEntity,
                       :owl/someValuesFrom :fibo-be-le-lp/LegalEntity,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "sequence of characters identifying a financial transaction uniquely whenever useful and agreed by the parties or community involved in the transaction"})

(def WeightedBasket
  {:db/ident :fibo-fbc-pas-fpas/WeightedBasket,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "weighted basket",
   :rdfs/subClassOf #{:cmns-col/StructuredCollection
                      {:owl/onProperty     :cmns-qtu/hasExpression,
                       :owl/someValuesFrom :fibo-fnd-utl-alx/WeightingFunction,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty :cmns-col/hasConstituent,
                       :owl/someValuesFrom
                       :fibo-fbc-pas-fpas/WeightedBasketConstituent,
                       :rdf/type :owl/Restriction} :fibo-fbc-pas-fpas/Basket},
   :skos/definition
   "basket whose constituents have some relative importance with respect to one another"})

(def WeightedBasketConstituent
  {:db/ident :fibo-fbc-pas-fpas/WeightedBasketConstituent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "weighted basket constituent",
   :rdfs/subClassOf #{:fibo-fbc-pas-fpas/BasketConstituent
                      {:owl/onDataRange :xsd/decimal,
                       :owl/onProperty  :fibo-fnd-utl-alx/hasWeight,
                       :owl/qualifiedCardinality 1,
                       :rdf/type        :owl/Restriction}},
   :skos/definition
   "component of a basket whose relative importance with respect to other basket constituents is known"})

(def facilitates
  {:db/ident :fibo-fbc-pas-fpas/facilitates,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "facilitates",
   :rdfs/subPropertyOf :cmns-pts/playsActivePartyIn,
   :skos/definition
   "acts as an enabler in a situation in which an event, a task, a conversation or something else occurs"})

(def hasGeneratingEntity
  {:db/ident :fibo-fbc-pas-fpas/hasGeneratingEntity,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "has generating entity",
   :rdfs/range :fibo-be-le-lp/LegalEntity,
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/generates,
   :skos/definition "specifies a legal entity that generates something"})

(def hasGeneratingEntityIdentifier
  {:cmns-av/explanatoryNote
   "Note that the range of is identified by must be that entity's LEI in the context of a UTI.",
   :db/ident :fibo-fbc-pas-fpas/hasGeneratingEntityIdentifier,
   :owl/propertyChainAxiom [:fibo-fbc-pas-fpas/hasGeneratingEntity
                            :cmns-id/isIdentifiedBy],
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-pas-fpas/UniqueTransactionIdentifier,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "has generating entity identifier",
   :skos/definition
   "specifies an identifier for the entity that generated a unique transaction identifier"})

(def hasLegalAgent
  {:db/ident :fibo-fbc-pas-fpas/hasLegalAgent,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "has registered agent",
   :rdfs/range :fibo-fbc-pas-fpas/LegalAgent,
   :rdfs/subPropertyOf :cmns-pts/hasPartyRole,
   :skos/definition
   "identifies a party as one that has the legal, medical or financial capacity to act on behalf of someone else under specific circumstances"})

(def hasNominalNumberOfUnits
  {:db/ident :fibo-fbc-pas-fpas/hasNominalNumberOfUnits,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "has nominal number of units",
   :rdfs/range :xsd/integer,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasAmount,
   :skos/definition
   "indicates the base number of units of something associated with some offering"})

(def hasOffering
  {:db/ident :fibo-fbc-pas-fpas/hasOffering,
   :owl/inverseOf :fibo-fbc-pas-fpas/isOfferingOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "has offering",
   :rdfs/range :fibo-fbc-pas-fpas/Offering,
   :skos/definition
   "relates something to a voluntary but conditional promise submitted by a buyer or seller (offeror) to another (offeree) for acceptance, and which becomes legally enforceable if accepted by the offeree"})

(def hasOfferingAmount
  {:db/ident :fibo-fbc-pas-fpas/hasOfferingAmount,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "has offering amount",
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasNotionalAmount,
   :skos/definition
   "indicates the notional monetary amount, determined based on reference data, market rates or some other agreed method associated with some offering"})

(def hasOfferingPrice
  {:db/ident :fibo-fbc-pas-fpas/hasOfferingPrice,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "has offering price",
   :rdfs/range :fibo-fnd-acc-cur/MonetaryPrice,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasPrice,
   :skos/definition
   "indicates the price associated with an offering, which may be an explicit or calculated price"})

(def hasOfferingUnits
  {:db/ident :fibo-fbc-pas-fpas/hasOfferingUnits,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "has offering units",
   :rdfs/range :xsd/integer,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasAmount,
   :skos/definition
   "indicates the actual number of units of something, including any premium on the number of units, associated with some offering"})

(def hasSelectingParty
  {:db/ident :fibo-fbc-pas-fpas/hasSelectingParty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "has selecting party",
   :rdfs/range :cmns-pts/Party,
   :rdfs/subPropertyOf :cmns-pts/hasParty,
   :skos/definition
   "indicates the person(s) or organization(s) responsible for determining the contents of a basket"})

(def hasSelectionCriteria
  {:db/ident :fibo-fbc-pas-fpas/hasSelectionCriteria,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :cmns-col/Collection,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "has selection criteria",
   :rdfs/subPropertyOf :cmns-txt/hasTextValue,
   :skos/definition
   "describes the methodology or program used to determine the membership of a collection"})

(def hasSettlementDate
  {:cmns-av/explanatoryNote
   "Settlement might involve either a buyer paying in cash or a seller delivering the relevant instrument(s) and receiving the proceeds as specified by the terms of a given transaction.",
   :db/ident :fibo-fbc-pas-fpas/hasSettlementDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "has settlement date",
   :rdfs/range :fibo-fnd-dt-fd/CalculatedDate,
   :rdfs/subPropertyOf :cmns-dt/hasEndDate,
   :skos/definition
   "indicates the date by which an executed order or transaction must be settled"})

(def hasTradeDate
  {:db/ident :fibo-fbc-pas-fpas/hasTradeDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "has trade date",
   :rdfs/range :cmns-dt/Date,
   :rdfs/subPropertyOf :cmns-dt/hasDate,
   :skos/definition
   "indicates the date on which a security or other instrument-specific trade actually takes place"})

(def isEmbodiedIn
  {:db/ident :fibo-fbc-pas-fpas/isEmbodiedIn,
   :owl/inverseOf :fibo-fnd-rel-rel/embodies,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "is embodied in",
   :skos/definition
   "identifies the representation or tangible form of something in some context"})

(def isFacilitatedBy
  {:db/ident :fibo-fbc-pas-fpas/isFacilitatedBy,
   :owl/inverseOf :fibo-fbc-pas-fpas/facilitates,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "is facilitated by",
   :rdfs/subPropertyOf :cmns-pts/hasActiveParty,
   :skos/definition
   "identifies someone or something that expedites some event, transaction, conversation or something else in some context"})

(def isOfferingOf
  {:db/ident :fibo-fbc-pas-fpas/isOfferingOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-pas-fpas/Offering,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "is offering of",
   :skos/definition
   "relates an offering to one or things that are the subject of the offer"})

(def relatesTo
  {:db/ident :fibo-fbc-pas-fpas/relatesTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdfs/label "relates to",
   :skos/definition "has a logical or causal connection with"})

(def urn:uuid:de475ece-328c-5cc2-a6e1-e3687e181321
  {:cmns-av/copyright #{"Copyright (c) 2015-2024 Object Management Group, Inc."
                        "Copyright (c) 2015-2024 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology defines concepts that extend the Foundations (FND) Products and Services concepts specifically for the financial industry, including financial product, financial service, and financial service provider.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/LegalEntities/LEIEntities/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Law/LegalCapacity/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/RegulatoryAgencies/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/ProductsAndServices/ProductsAndServices/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/QuantitiesAndUnits/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/FunctionalEntities/Publishers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/OwnershipAndControl/Ownership/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/GoalsAndObjectives/Objectives/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/DatesAndTimes/FinancialDates/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/Analytics/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/FunctionalEntities/FunctionalEntities/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/TextDatatype/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Law/Jurisdiction/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Arrangements/Lifecycles/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/OwnershipAndControl/Executives/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/ProductsAndServices/FinancialProductsAndServices/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Financial Products and Services Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/ version of this ontology was modified to revise the definition of a unique transaction identifier to align with ISO 23897 and to address text formatting issues."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/ version of this ontology was modified to reflect issue resolutions detailed in the FIBO FBC 1.0 FTF report."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/ version of this ontology was modified as a part of organizational hierarchy simplification and to correct a logical inconsistency with respect to the representation of baskets."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/ version of this ontology was modified to add a property to describe the criteria for including something in a basket, if that criteria is known, and to point to a party that is responsible for determining that criteria."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/ version of this ontology was modified to add the notion of a weighted basket, whose consituents are weighted."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices.rdf version of the ontology was modified to replace additional content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/ version of this ontology was modified to fix spelling errors."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/ version of this ontology was modified to eliminate duplication with concepts in LCC and eliminated a redundant superclass on FinancialServiceProvider."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices.rdf version of the ontology was modified to eliminate a redundant restriction (GitHub-2028)."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/ version of this ontology was modified to eliminate deprecated elements."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/ version of this ontology was modified to rename ownership related properties for consistent alignment with the ownership situational pattern, add a definition for trading strategy, and loosen the constraint on offeree for offering to be optional."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices.rdf version of the ontology was modified to add the concept of a contract lifecycle, as distinct from a product or trade lifecycle (FBC-317)."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/ version of this ontology was modified to eliminate references to external dictionary sites that no longer resolve, eliminate circular and ambiguous definitions, and revise definitions that referenced 'face value' improperly."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/ version of this ontology was modified to replace hasDefinition with isDefinedIn to clarify intent."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices.rdf version of this ontology was revised to augment the representation of institutions based on their definitions in the law, and to clarify and extend definitions related to non-bank financial institutions."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/ version of this ontology was modified to replace the property 'characterizes' with 'describes' with respect to restrictions on catalogs, and to correct the label on terminated trade."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices.rdf version of the ontology was modified to eliminate deprecations that are more than 6 months old and to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/ version of this ontology was modified by the FIBO 2.0 RFC, including, but not limited to, the addition of lifecycle events, concepts related to trade settlement, and the definition of a unique transaction identifier (UTI)."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"})