(ns net.wikipunk.rdf.fibo-fbc-pas-fpas
  "This ontology defines concepts that extend the Foundations (FND) Products and Services concepts specifically for the financial industry, including financial product, financial service, and financial service provider."
  {:cmns-av/copyright ["Copyright (c) 2015-2023 EDM Council, Inc."
                       "Copyright (c) 2015-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :dcterms/abstract
   "This ontology defines concepts that extend the Foundations (FND) Products and Services concepts specifically for the financial industry, including financial product, financial service, and financial service provider.",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/BusinessDates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/ProductsAndServices/ProductsAndServices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Lifecycles/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/Occurrences/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://www.omg.org/spec/Commons/Designators/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/OwnershipAndControl/Executives/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Roles/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/RegulatoryAgencies/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Parties/"
    "https://www.omg.org/spec/Commons/TextDatatype/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Contracts/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/GoalsAndObjectives/Objectives/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/FunctionalEntities/FunctionalEntities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LegalPersons/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LEIEntities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://www.omg.org/spec/Commons/Identifiers/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/LegalCapacity/"
    "https://www.omg.org/spec/Commons/Classifiers/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/OwnershipAndControl/Ownership/"
    "https://www.omg.org/spec/Commons/DatesAndTimes/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"
    "https://www.omg.org/spec/Commons/ContextualDesignators/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/FunctionalEntities/Publishers/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/Jurisdiction/"
    "https://www.omg.org/spec/Commons/Collections/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/Analytics/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Quantities/QuantitiesAndUnits/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-dsg" "https://www.omg.org/spec/Commons/Designators/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
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
    "fibo-fnd-dt-oc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/",
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
    "fibo-fnd-pty-pty"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
    "fibo-fnd-pty-rl"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles/",
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
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fbc-pas-fpas",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "Financial Products and Services Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/ version of this ontology was modified by the FIBO 2.0 RFC, including, but not limited to, the addition of lifecycle events, concepts related to trade settlement, and the definition of a unique transaction identifier (UTI)."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/ version of this ontology was modified to fix spelling errors."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/ version of this ontology was modified to rename ownership related properties for consistent alignment with the ownership situational pattern, add a definition for trading strategy, and loosen the constraint on offeree for offering to be optional."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/ version of this ontology was modified to replace the property 'characterizes' with 'describes' with respect to restrictions on catalogs, and to correct the label on terminated trade."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/ version of this ontology was modified as a part of organizational hierarchy simplification and to correct a logical inconsistency with respect to the representation of baskets."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/ version of this ontology was modified to eliminate duplication with concepts in LCC and eliminated a redundant superclass on FinancialServiceProvider."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/ version of this ontology was modified to eliminate references to external dictionary sites that no longer resolve, eliminate circular and ambiguous definitions, and revise definitions that referenced 'face value' improperly."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/ version of this ontology was modified to reflect issue resolutions detailed in the FIBO FBC 1.0 FTF report."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/ version of this ontology was modified to revise the definition of a unique transaction identifier to align with ISO 23897 and to address text formatting issues."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/ version of this ontology was modified to eliminate deprecated elements."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/ version of this ontology was modified to add the notion of a weighted basket, whose consituents are weighted."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/ version of this ontology was modified to replace hasDefinition with isDefinedIn to clarify intent."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/ version of this ontology was modified to add a property to describe the criteria for including something in a basket, if that criteria is known, and to point to a party that is responsible for determining that criteria."]})

(def AgencyAgreement
  "an agreement that designates a party as a registered agent to represent and act on behalf of another party in some, typically legal, financial, or medical capacity"
  {:db/ident :fibo-fbc-pas-fpas/AgencyAgreement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "agency agreement",
   :rdfs/seeAlso ["http://www.sos.state.tx.us/corp/registeredagents.shtml"],
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-agr-ctr/hasContractParty,
                      :owl/someValuesFrom :fibo-fbc-pas-fpas/RegisteredAgent,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-agr-ctr/MutualContractualAgreement],
   :skos/definition
   "an agreement that designates a party as a registered agent to represent and act on behalf of another party in some, typically legal, financial, or medical capacity"})

(def AgentForServiceOfProcess
  "a registered agent (person or organization) designated by a business entity, such as a corporation, to receive legal correspondence on behalf of the business entity in the jurisdiction in which the agent's address is located"
  {:cmns-av/explanatoryNote
   "The person may be an officer of the corporation or a third party, such as the corporation's attorney, or a company providing such agency services.",
   :db/ident :fibo-fbc-pas-fpas/AgentForServiceOfProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "agent for service of process",
   :rdfs/seeAlso
   ["http://www.sos.state.tx.us/corp/registeredagents.shtml"
    "http://www.law.cornell.edu/wex/agent_for_service_of_process"],
   :rdfs/subClassOf :fibo-fbc-pas-fpas/RegisteredAgent,
   :skos/definition
   "a registered agent (person or organization) designated by a business entity, such as a corporation, to receive legal correspondence on behalf of the business entity in the jurisdiction in which the agent's address is located"})

(def AmendedTrade
  "stage in the lifecycle of a trade indicating that a change or addition has been made to the terms of the trade, leaving the original terms largely intact"
  {:db/ident :fibo-fbc-pas-fpas/AmendedTrade,
   :rdf/type [:fibo-fbc-pas-fpas/TradeLifecycleStage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "amended trade",
   :skos/definition
   "stage in the lifecycle of a trade indicating that a change or addition has been made to the terms of the trade, leaving the original terms largely intact"})

(def Basket
  "collection of goods, services, or other things (e.g., financial contracts) that can be purchased and sold in some marketplace"
  {:cmns-av/explanatoryNote
   ["A basket may be associated with a specific market sector, and may be delineated for the purposes of statistical analysis, such as for calculating CPI. According to the US Bureau of Labor Statistics (BLS), with respect to the CPI, a market basket is a package of goods and services that consumers purchase for day-to-day living. The weight of each item is based on the amount of expenditure reported by a sample of households."
    "From a securities perspective, a basket is a collection of products or securities that are designated to mimic the performance of a market. For investors, the market basket is the principal idea behind index funds, which are essentially a broad sample of stocks, bonds or other securities in the market; this provides investors with a benchmark against which to compare their investment returns."],
   :db/ident :fibo-fbc-pas-fpas/Basket,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "basket",
   :rdfs/subClassOf [:cmns-col/Collection
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/string,
                      :owl/onProperty  :fibo-fbc-pas-fpas/hasSelectionCriteria,
                      :rdf/type        :owl/Restriction}
                     {:owl/onProperty     :cmns-col/hasConstituent,
                      :owl/someValuesFrom :fibo-fbc-pas-fpas/BasketConstituent,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-pty-pty/IndependentParty,
                      :owl/onProperty :fibo-fbc-pas-fpas/hasSelectingParty,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "collection of goods, services, or other things (e.g., financial contracts) that can be purchased and sold in some marketplace"})

(def BasketConstituent
  "component of a basket"
  {:db/ident :fibo-fbc-pas-fpas/BasketConstituent,
   :owl/equivalentClass {:owl/onProperty     :cmns-col/isConstituentOf,
                         :owl/someValuesFrom :fibo-fbc-pas-fpas/Basket,
                         :rdf/type           :owl/Restriction},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "basket constituent",
   :rdfs/subClassOf :cmns-col/Constituent,
   :skos/definition "component of a basket"})

(def Broker
  "any party that acts as an intermediary between a buyer and a seller, usually charging a commission"
  {:cmns-av/adaptedFrom
   "17 CFR 45.1, Definitions - see the definition of agent",
   :cmns-av/explanatoryNote
   "A broker that specializes in stocks, bonds, commodities, or certain derivatives must be registered with the exchange in which the securities are traded.",
   :db/ident :fibo-fbc-pas-fpas/Broker,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "broker",
   :rdfs/subClassOf [{:owl/unionOf [:fibo-fbc-pas-fpas/LicensedAgent
                                    :fibo-fbc-pas-fpas/ThirdPartyAgent],
                      :rdf/type    :owl/Class}
                     :fibo-fnd-agr-ctr/ContractThirdParty],
   :skos/definition
   "any party that acts as an intermediary between a buyer and a seller, usually charging a commission"})

(def BrokerDealer
  "any party in the business of buying and selling securities, operating as both a broker and a dealer, depending on the transaction"
  {:cmns-av/adaptedFrom
   "Office of Financial Research (OFR) Annual Report, 2012, Glossary",
   :db/ident :fibo-fbc-pas-fpas/BrokerDealer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "broker-dealer",
   :rdfs/subClassOf [{:owl/unionOf [:fibo-fbc-pas-fpas/Broker
                                    :fibo-fbc-pas-fpas/Dealer],
                      :rdf/type    :owl/Class}
                     :fibo-be-fct-fct/FunctionalEntity],
   :skos/definition
   "any party in the business of buying and selling securities, operating as both a broker and a dealer, depending on the transaction"})

(def Catalog
  "publication including a list of products available for sale with their descriptions and possibly prices"
  {:db/ident :fibo-fbc-pas-fpas/Catalog,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "catalog",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-dsg/describes,
                      :owl/someValuesFrom :fibo-fnd-pas-pas/Product,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :cmns-id/Identifier,
                      :owl/onProperty    :cmns-id/isIdentifiedBy,
                      :rdf/type          :owl/Restriction}
                     :fibo-be-fct-pub/Publication],
   :skos/definition
   "publication including a list of products available for sale with their descriptions and possibly prices"})

(def ClearedTrade
  "stage in the lifecycle of a trade indicating that a third-party clearing house, acting as an intermediary, has reconciled the orders involved in the trade"
  {:cmns-av/explanatoryNote
   "Clearing validates the availability of funds, records the transfer, and in the case of securities ensures the delivery of the security to the buyer.",
   :db/ident :fibo-fbc-pas-fpas/ClearedTrade,
   :rdf/type [:fibo-fbc-pas-fpas/TradeLifecycleStage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "cleared trade",
   :skos/definition
   "stage in the lifecycle of a trade indicating that a third-party clearing house, acting as an intermediary, has reconciled the orders involved in the trade"})

(def ClosedTrade
  "stage in the lifecycle of a trade indicating that the trade has been finalized, and that there is no longer a corresponding open position on the books of the trader, eliminating any exposure"
  {:db/ident :fibo-fbc-pas-fpas/ClosedTrade,
   :rdf/type [:fibo-fbc-pas-fpas/TradeLifecycleStage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "closed trade",
   :skos/definition
   "stage in the lifecycle of a trade indicating that the trade has been finalized, and that there is no longer a corresponding open position on the books of the trader, eliminating any exposure"})

(def Dealer
  "any party that purchases goods or services for resale and acts on their own behalf in a transaction"
  {:cmns-av/explanatoryNote
   "A dealer is a counterparty or principal in the transaction with the customer.",
   :db/ident :fibo-fbc-pas-fpas/Dealer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "dealer",
   :rdfs/subClassOf [{:owl/unionOf [:fibo-fnd-pas-pas/Buyer
                                    :fibo-fnd-pas-pas/Seller],
                      :rdf/type    :owl/Class}
                     :fibo-fnd-pas-pas/ServiceProvider],
   :skos/definition
   "any party that purchases goods or services for resale and acts on their own behalf in a transaction"})

(def Exposure
  "the extent to which an individual or organization is unprotected and open to damage, danger, risk of suffering a loss, or uncertainty"
  {:db/ident :fibo-fbc-pas-fpas/Exposure,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "exposure",
   :skos/definition
   "the extent to which an individual or organization is unprotected and open to damage, danger, risk of suffering a loss, or uncertainty",
   :skos/example
   "Examples include financial exposure, credit exposure, legal exposure, credit rating exposure, reputational exposure, and so forth."})

(def FinancialExposure
  "the extent to which an individual or organization is open to risk of suffering a loss in a transaction, or with respect to some investment or set of investments, e.g., some holding; the amount one stands to lose in that transaction or investment"
  {:db/ident :fibo-fbc-pas-fpas/FinancialExposure,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "financial exposure",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-fnd-pty-pty/PartyInRole,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-pas-fpas/Exposure],
   :skos/definition
   "the extent to which an individual or organization is open to risk of suffering a loss in a transaction, or with respect to some investment or set of investments, e.g., some holding; the amount one stands to lose in that transaction or investment",
   :skos/example
   "Examples in banking include the total amount of unsecured loans, the amount of loans advanced to a single borrower, group, industry, or country, and the probability of loss from devaluation, revaluation, or foreign exchange fluctuations."})

(def FinancialIntermediationService
  "any financial service in which a third party (the intermediary) matches lenders and investors with entrepreneurs and other borrowers in need of capital"
  {:cmns-av/explanatoryNote
   "Often investors and borrowers do not have precisely matching needs, and the intermediary's capital is put at risk to transform the credit risk and maturity of the liabilities to meet the needs of investors.",
   :db/ident :fibo-fbc-pas-fpas/FinancialIntermediationService,
   :fibo-fnd-utl-av/definitionOrigin
   "Office of Financial Research (OFR) Annual Report, 2012, Glossary",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "financial intermediation service",
   :rdfs/subClassOf :fibo-fbc-pas-fpas/FinancialService,
   :skos/definition
   "any financial service in which a third party (the intermediary) matches lenders and investors with entrepreneurs and other borrowers in need of capital"})

(def FinancialProduct
  "product provided to consumers and businesses by financial institutions such as banks, insurance companies, brokerage firms, consumer finance companies, and investment companies"
  {:db/ident :fibo-fbc-pas-fpas/FinancialProduct,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "financial product",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-rel-rel/isProvidedBy,
                      :owl/someValuesFrom
                      :fibo-fbc-pas-fpas/FinancialServiceProvider,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-pas-pas/Product],
   :skos/definition
   "product provided to consumers and businesses by financial institutions such as banks, insurance companies, brokerage firms, consumer finance companies, and investment companies"})

(def FinancialProductCatalog
  "a catalog of financial products and/or services available for sale with their description and other product details"
  {:cmns-av/adaptedFrom "Nordea Bank",
   :db/ident :fibo-fbc-pas-fpas/FinancialProductCatalog,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "financial product catalog",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-dsg/describes,
                      :owl/someValuesFrom :fibo-fbc-pas-fpas/FinancialProduct,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-pas-fpas/Catalog],
   :skos/definition
   "a catalog of financial products and/or services available for sale with their description and other product details"})

(def FinancialService
  "service provided to consumers and businesses by financial institutions such as banks, insurance companies, brokerage firms, consumer finance companies, and investment companies"
  {:db/ident :fibo-fbc-pas-fpas/FinancialService,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "financial service",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-rel-rel/isProvidedBy,
                      :owl/someValuesFrom
                      :fibo-fbc-pas-fpas/FinancialServiceProvider,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-pas-pas/Service],
   :skos/definition
   "service provided to consumers and businesses by financial institutions such as banks, insurance companies, brokerage firms, consumer finance companies, and investment companies"})

(def FinancialServiceProvider
  "functional entity either licensed to provide financial services to consumers and/or businesses or established by law to provide financial services, such as a central bank"
  {:db/ident :fibo-fbc-pas-fpas/FinancialServiceProvider,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "financial service provider",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/provides,
                      :owl/someValuesFrom :fibo-fbc-pas-fpas/FinancialService,
                      :rdf/type           :owl/Restriction}
                     {:owl/onClass    :fibo-be-le-lp/LegalEntity,
                      :owl/onProperty :fibo-fnd-rel-rel/hasIdentity,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-pas-pas/ServiceProvider],
   :skos/definition
   "functional entity either licensed to provide financial services to consumers and/or businesses or established by law to provide financial services, such as a central bank"})

(def Holding
  "real or personal property (assets), including but not limited to financial assets, to which one holds title and of which one has possession"
  {:cmns-av/explanatoryNote
   "Note that a holding may refer to a single asset, such as a piece of real estate, a portfolio of assets, multiple portfolios, and so forth, and is frequently aggregated over multiple assets.",
   :db/ident :fibo-fbc-pas-fpas/Holding,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "holding",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-oac-own/hasOwnedAsset,
                      :owl/someValuesFrom :fibo-fnd-oac-own/Asset,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-oac-own/Ownership],
   :skos/definition
   "real or personal property (assets), including but not limited to financial assets, to which one holds title and of which one has possession"})

(def LegalAgent
  "any party that has been legally empowered to act on behalf of another party"
  {:cmns-av/adaptedFrom
   "17 CFR 45.1, Definitions - see the definition of agent",
   :db/ident :fibo-fbc-pas-fpas/LegalAgent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "legal agent",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-pty-rl/isPlayedBy,
                      :owl/someValuesFrom
                      {:owl/onProperty :fibo-fnd-law-lcap/hasCapacity,
                       :owl/someValuesFrom
                       :fibo-fnd-law-lcap/DelegatedLegalAuthority,
                       :rdf/type :owl/Restriction},
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-pty-rl/AgentInRole],
   :skos/definition
   "any party that has been legally empowered to act on behalf of another party"})

(def LicensedAgent
  "any individual who is licensed to perform a legally binding function, and who has been legally empowered to act on behalf of another party"
  {:cmns-av/adaptedFrom
   "17 CFR 45.1, Definitions - see the definition of agent",
   :db/ident :fibo-fbc-pas-fpas/LicensedAgent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "licensed agent",
   :rdfs/subClassOf [:fibo-fnd-law-lcap/Licensee
                     :fibo-fbc-pas-fpas/LegalAgent
                     :fibo-be-oac-exec/ResponsibleParty],
   :skos/definition
   "any individual who is licensed to perform a legally binding function, and who has been legally empowered to act on behalf of another party",
   :skos/example
   "Insurance agents, realtors, financial advisors, certain attorneys, and brokers are examples of legal agents."})

(def MaturedTrade
  "stage in the lifecycle of a trade indicating that the trade, and related instrument(s) has ended (expired)"
  {:db/ident :fibo-fbc-pas-fpas/MaturedTrade,
   :rdf/type [:fibo-fbc-pas-fpas/TradeLifecycleStage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "matured trade",
   :skos/definition
   "stage in the lifecycle of a trade indicating that the trade, and related instrument(s) has ended (expired)"})

(def Offeree
  "party that receives an offer from something from someone (i.e., an offerer) based on the terms of the offering"
  {:db/ident :fibo-fbc-pas-fpas/Offeree,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "offeree",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-pty-rl/isPlayedBy,
     :owl/someValuesFrom {:owl/onProperty     :fibo-fnd-pty-pty/isAPartyTo,
                          :owl/someValuesFrom :fibo-fbc-pas-fpas/Offering,
                          :rdf/type           :owl/Restriction},
     :rdf/type           :owl/Restriction}
    :fibo-fnd-pty-pty/PartyInRole],
   :skos/definition
   "party that receives an offer from something from someone (i.e., an offerer) based on the terms of the offering"})

(def Offering
  "expression of interest in providing something to someone that is contingent upon acceptance, forbearance, or some other consideration, as might be desired by an offeree(s)"
  {:cmns-av/explanatoryNote
   "The making of an offer is the first of three steps in the traditional process of forming a valid contract: an offer, an acceptance of the offer, and an exchange of consideration. (Consideration is the act of doing something or promising to do something that a person is not legally required to do, or the forbearance or the promise to forbear from doing something that he or she has the legal right to do.)",
   :db/ident :fibo-fbc-pas-fpas/Offering,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "offering",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :owl/Thing,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-rel-rel/isIssuedBy,
                      :owl/someValuesFrom :fibo-fbc-pas-fpas/Offeror,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-pty-pty/hasPartyInRole,
                      :owl/someValuesFrom :fibo-fbc-pas-fpas/Offeror,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fbc-pas-fpas/Offeree,
                      :owl/onProperty :fibo-fnd-pty-pty/hasPartyInRole,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "expression of interest in providing something to someone that is contingent upon acceptance, forbearance, or some other consideration, as might be desired by an offeree(s)"})

(def Offeror
  "a party that proposes to make something available to someone (i.e., an offeree) based on the terms of the offering"
  {:db/ident :fibo-fbc-pas-fpas/Offeror,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "offeror",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-rel-rel/issues,
     :owl/someValuesFrom :fibo-fbc-pas-fpas/Offering,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-pty-rl/isPlayedBy,
     :owl/someValuesFrom {:owl/onProperty     :fibo-fnd-pty-pty/isAPartyTo,
                          :owl/someValuesFrom :fibo-fbc-pas-fpas/Offering,
                          :rdf/type           :owl/Restriction},
     :rdf/type           :owl/Restriction}
    :fibo-fnd-pty-pty/PartyInRole],
   :skos/definition
   "a party that proposes to make something available to someone (i.e., an offeree) based on the terms of the offering"})

(def OpenTrade
  "stage in the lifecycle of a trade indicating that the trade has been established and there is an associated open position on the books of the trader as a consequence"
  {:db/ident :fibo-fbc-pas-fpas/OpenTrade,
   :rdf/type [:fibo-fbc-pas-fpas/TradeLifecycleStage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "open trade",
   :skos/definition
   "stage in the lifecycle of a trade indicating that the trade has been established and there is an associated open position on the books of the trader as a consequence"})

(def Position
  "an investor's stake, i.e., a holding, in a particular asset (such as an individual security)"
  {:cmns-av/explanatoryNote
   "A position can be long or short, and it can be in any asset class, such as stocks, bonds, futures, or options. A position can be open (current) or closed (past), but in general use, unless a position is specifically referred to as closed, the assumption is that it references an open position.",
   :db/ident :fibo-fbc-pas-fpas/Position,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "position",
   :rdfs/subClassOf [{:owl/onClass    :fibo-fnd-oac-own/Asset,
                      :owl/onProperty :fibo-fnd-oac-own/hasOwnedAsset,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-pas-fpas/Holding],
   :skos/definition
   "an investor's stake, i.e., a holding, in a particular asset (such as an individual security)"})

(def ProductLifecycle
  "a lifecycle specific to a product or product family"
  {:db/ident :fibo-fbc-pas-fpas/ProductLifecycle,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "product lifecycle",
   :rdfs/subClassOf
   [{:owl/onProperty     :cmns-dsg/defines,
     :owl/someValuesFrom :fibo-fbc-pas-fpas/ProductLifecycleStage,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-arr-lif/isLifecycleOf,
     :owl/someValuesFrom :fibo-fnd-pas-pas/Product,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-arr-lif/hasStage,
     :owl/someValuesFrom :fibo-fbc-pas-fpas/ProductLifecycleStage,
     :rdf/type           :owl/Restriction}
    :fibo-fnd-arr-lif/Lifecycle],
   :skos/definition "a lifecycle specific to a product or product family",
   :skos/example
   "The product life cycle describes the period of time over which an item is developed, brought to market and eventually removed from the market. The cycle is broken into four stages: introduction, growth, maturity and decline. The idea of the product life cycle is used in marketing to decide when it is appropriate to advertise, reduce prices, explore new markets or create new packaging."})

(def ProductLifecycleEvent
  "a kind of event that occurs during one or more stages of a product lifecycle"
  {:db/ident :fibo-fbc-pas-fpas/ProductLifecycleEvent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "product lifecycle event",
   :rdfs/subClassOf [{:owl/onProperty :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom
                      :fibo-fbc-pas-fpas/ProductLifecycleStage,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-arr-lif/LifecycleEvent],
   :skos/definition
   "a kind of event that occurs during one or more stages of a product lifecycle",
   :skos/example
   "a call notification or coupon payment as a part of a bond lifecycle"})

(def ProductLifecycleEventOccurrence
  "an occurrence of an event that occurs during a specific stage of a specific product lifecycle"
  {:db/ident :fibo-fbc-pas-fpas/ProductLifecycleEventOccurrence,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "product lifecycle event occurrence",
   :rdfs/subClassOf [{:owl/onProperty :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom
                      :fibo-fbc-pas-fpas/ProductLifecycleStageOccurrence,
                      :rdf/type :owl/Restriction}
                     {:owl/onClass    :fibo-fbc-pas-fpas/ProductLifecycleEvent,
                      :owl/onProperty :fibo-fnd-dt-oc/exemplifies,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-arr-lif/LifecycleEventOccurrence],
   :skos/definition
   "an occurrence of an event that occurs during a specific stage of a specific product lifecycle"})

(def ProductLifecycleOccurrence
  "a realization of a product lifecycle"
  {:db/ident :fibo-fbc-pas-fpas/ProductLifecycleOccurrence,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "product lifecycle occurrence",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-arr-lif/hasStage,
                      :owl/someValuesFrom
                      :fibo-fbc-pas-fpas/ProductLifecycleStageOccurrence,
                      :rdf/type :owl/Restriction}
                     {:owl/onClass    :fibo-fbc-pas-fpas/ProductLifecycle,
                      :owl/onProperty :fibo-fnd-dt-oc/exemplifies,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-arr-lif/LifecycleOccurrence],
   :skos/definition "a realization of a product lifecycle"})

(def ProductLifecycleStage
  "a phase in a product lifecycle"
  {:db/ident :fibo-fbc-pas-fpas/ProductLifecycleStage,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "product lifecycle stage",
   :rdfs/subClassOf [{:owl/onProperty :cmns-col/comprises,
                      :owl/someValuesFrom
                      :fibo-fbc-pas-fpas/ProductLifecycleEvent,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :cmns-dsg/isDefinedIn,
                      :owl/someValuesFrom :fibo-fbc-pas-fpas/ProductLifecycle,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-arr-lif/isStageOf,
                      :owl/someValuesFrom :fibo-fbc-pas-fpas/ProductLifecycle,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :cmns-cls/classifies,
                      :owl/someValuesFrom :fibo-fnd-pas-pas/Product,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-arr-lif/LifecycleStage],
   :skos/definition "a phase in a product lifecycle",
   :skos/example
   "a research and development phase of a product lifecycle, the introduction phase in a marketing lifecycle, a growth stage in an economic lifecycle, or the origination phase in the lifecycle of a loan"})

(def ProductLifecycleStageOccurrence
  "an instance of a phase in an occurrence of a given product lifecycle"
  {:db/ident :fibo-fbc-pas-fpas/ProductLifecycleStageOccurrence,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "product lifecycle stage occurrence",
   :rdfs/subClassOf
   [{:owl/onProperty     :cmns-col/comprises,
     :owl/someValuesFrom :fibo-fbc-pas-fpas/ProductLifecycleEventOccurrence,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-arr-lif/isStageOf,
     :owl/someValuesFrom :fibo-fbc-pas-fpas/ProductLifecycleOccurrence,
     :rdf/type           :owl/Restriction}
    {:owl/onClass    :fibo-fbc-pas-fpas/ProductLifecycleStage,
     :owl/onProperty :fibo-fnd-dt-oc/exemplifies,
     :owl/qualifiedCardinality 1,
     :rdf/type       :owl/Restriction}
    :fibo-fnd-arr-lif/LifecycleStageOccurrence],
   :skos/definition
   "an instance of a phase in an occurrence of a given product lifecycle"})

(def RegisteredAgent
  "a legal agent designated by another party (person or organization), to represent and acts on their behalf under a formal agency agreement"
  {:cmns-av/explanatoryNote
   "Agency capacity, as specified in an agency agreement, may include power of attorney, the ability to act as an agent in certain kinds of transactions such as real estate, tax, audit or other financial or legal transactions, as a fiduciary, including as a trustee or legal guardian, for service of process, and so forth.",
   :cmns-av/synonym ["resident agent" "statutory agent"],
   :db/ident :fibo-fbc-pas-fpas/RegisteredAgent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "registered agent",
   :rdfs/seeAlso ["https://thelawdictionary.org/agent/"
                  "http://www.sos.state.tx.us/corp/registeredagents.shtml"],
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-pty-rl/isPlayedBy,
     :owl/someValuesFrom {:owl/intersectionOf
                          [{:owl/onProperty :fibo-fnd-pty-pty/isAPartyTo,
                            :owl/someValuesFrom
                            :fibo-fbc-pas-fpas/AgencyAgreement,
                            :rdf/type :owl/Restriction}
                           {:owl/onProperty     :fibo-be-le-lp/isRecognizedIn,
                            :owl/someValuesFrom :fibo-fnd-law-jur/Jurisdiction,
                            :rdf/type           :owl/Restriction}],
                          :rdf/type :owl/Class},
     :rdf/type           :owl/Restriction}
    :fibo-fbc-pas-fpas/LegalAgent
    :fibo-fnd-agr-ctr/ContractParty],
   :skos/definition
   "a legal agent designated by another party (person or organization), to represent and acts on their behalf under a formal agency agreement"})

(def RegulatedCommodity
  "a commodity under the jurisdiction of the regulatory agency, such as the Commodities Futures Trading Commission (CFTF), which includes any commodity traded in an organized contracts market"
  {:cmns-av/explanatoryNote
   "The CFTC polices matters of information and disclosure, fair trading practices, registration of firms and individuals, protection of customer funds, record keeping, and maintenance of orderly options and futures markets in the United States.",
   :db/ident :fibo-fbc-pas-fpas/RegulatedCommodity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "regulated commodity",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/isGovernedBy,
                      :owl/someValuesFrom :fibo-fnd-law-jur/Jurisdiction,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :fibo-fbc-fct-rga/RegulatoryAgency,
                      :owl/onProperty    :fibo-fbc-fct-rga/isRegulatedBy,
                      :rdf/type          :owl/Restriction}
                     :fibo-fnd-pas-pas/Commodity],
   :skos/definition
   "a commodity under the jurisdiction of the regulatory agency, such as the Commodities Futures Trading Commission (CFTF), which includes any commodity traded in an organized contracts market"})

(def SettlementTerms
  "contract terms that define the commitment to and mechanism for settling one or more sides of a transaction"
  {:cmns-av/explanatoryNote
   "In general, settlement involves arrangement of disposition of property, typically for legal reasons. With respect to financial transactions, it involves completion of a trade, either between brokers or agents, or between a broker and client. This may include settlement in cash, either for the entire transaction or for the cash leg of a transaction, either now or at some specified time in the future.",
   :db/ident :fibo-fbc-pas-fpas/SettlementTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "settlement terms",
   :rdfs/subClassOf [{:owl/allValuesFrom :cmns-dt/Date,
                      :owl/onProperty    :fibo-fbc-pas-fpas/hasSettlementDate,
                      :rdf/type          :owl/Restriction}
                     :fibo-fnd-agr-ctr/ContractualCommitment],
   :skos/definition
   "contract terms that define the commitment to and mechanism for settling one or more sides of a transaction"})

(def TerminatedTrade
  "stage in the trade lifecycle in which the trade has been terminated early, i.e., prior to maturity"
  {:cmns-av/explanatoryNote
   "Early termination may be triggered by a position sell or early termination provision, such as auto call/cancel, knock-out, etc.",
   :db/ident :fibo-fbc-pas-fpas/TerminatedTrade,
   :rdf/type [:fibo-fbc-pas-fpas/TradeLifecycleStage :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "terminated trade",
   :skos/definition
   "stage in the trade lifecycle in which the trade has been terminated early, i.e., prior to maturity"})

(def ThirdPartyAgent
  "any service provider that is licensed to perform a legally binding function and has been legally empowered to act on behalf of another party"
  {:cmns-av/adaptedFrom
   "17 CFR 45.1, Definitions - see the definition of agent",
   :cmns-av/usageNote
   "Note that third-party agent is defined as a service provider (organization) acting in an agency capacity, such as a law firm, accountancy, or investment bank. This is distinct from the concept of an individual (licensed agent), for example one who works for a broker-dealer, that is a registered agent licensed to sell securities.",
   :db/ident :fibo-fbc-pas-fpas/ThirdPartyAgent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "third-party agent",
   :rdfs/subClassOf [:fibo-fnd-pas-pas/ServiceProvider
                     :fibo-fnd-law-lcap/Licensee
                     :fibo-fbc-pas-fpas/LegalAgent],
   :skos/definition
   "any service provider that is licensed to perform a legally binding function and has been legally empowered to act on behalf of another party"})

(def Trade
  "agreement between parties participating in a voluntary action of buying and selling goods and services"
  {:cmns-av/adaptedFrom
   "Deutsche Bank Presentation on the Lifecycle of a Trade, available at http://www.slideshare.net/ahaline/23512555-tradelifecycle",
   :cmns-av/explanatoryNote
   ["Trading activities typically include (a) regularly underwriting or dealing in securities; interest rate, foreign exchange rate, commodity, equity, and credit derivative contracts; other financial instruments; and other assets for resale, (b) acquiring or taking positions in such items principally for the purpose of selling in the near term or otherwise with the intent to resell in order to profit from short-term price movements, and (c) acquiring or taking positions in such items as an accommodation to customers or for other trading purposes. (Source: Instructions for Preparation of Consolidated Reports of Condition and Income (FFIEC 031 and 041), Schedule RC-D - Trading Assets and Liabilities, 2013."
    "The advent of money as a medium of exchange has allowed trade to be conducted in a manner that is much simpler and effective compared to earlier forms of trade, such as bartering. In financial markets, trading also can mean performing a transaction that involves the selling and purchasing of a security."
    "The seller must deliver the commodity sold to the buyer; the buyer must pay the agreed purchase price, which could be in the form of other goods or services, on the agreed date."],
   :db/ident :fibo-fbc-pas-fpas/Trade,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "trade",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fbc-pas-fpas/Trader,
                      :owl/onProperty :fibo-fbc-pas-fpas/isFacilitatedBy,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-rel-rel/involves,
                      :owl/someValuesFrom {:owl/unionOf
                                           [:fibo-fnd-pas-pas/Good
                                            :fibo-fnd-pas-pas/Service
                                            :fibo-fnd-agr-ctr/Contract],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fbc-pas-fpas/isEmbodiedIn,
                      :owl/someValuesFrom :fibo-fnd-agr-ctr/Contract,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-pas-pas/TransactionEvent
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fbc-pas-fpas/TradeIdentifier,
                      :owl/onProperty :cmns-id/isIdentifiedBy,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fbc-pas-fpas/Trade,
                      :owl/onProperty :cmns-dt/succeeds,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fbc-pas-fpas/TradeLifecycle,
                      :owl/onProperty :cmns-cls/isCharacterizedBy,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "agreement between parties participating in a voluntary action of buying and selling goods and services"})

(def TradeIdentifier
  "sequence of characters identifying a trade within some context"
  {:db/ident :fibo-fbc-pas-fpas/TradeIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "trade identifier",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-id/identifies,
                      :owl/someValuesFrom :fibo-fbc-pas-fpas/Trade,
                      :rdf/type           :owl/Restriction}
                     :cmns-id/Identifier],
   :skos/definition
   "sequence of characters identifying a trade within some context",
   :skos/note
   "Note that a given trade may consist of multiple transactions, and thus there may be multiple UTIs associated with a trade."})

(def TradeLifecycle
  "a lifecycle that defines the evolution of a trade, from initiation through settlement"
  {:db/ident :fibo-fbc-pas-fpas/TradeLifecycle,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "trade lifecycle",
   :rdfs/subClassOf
   [{:owl/onProperty     :cmns-dsg/defines,
     :owl/someValuesFrom :fibo-fbc-pas-fpas/TradeLifecycleStage,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-arr-lif/isLifecycleOf,
     :owl/someValuesFrom :fibo-fbc-pas-fpas/Trade,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-arr-lif/hasStage,
     :owl/someValuesFrom :fibo-fbc-pas-fpas/TradeLifecycleStage,
     :rdf/type           :owl/Restriction}
    :fibo-fnd-arr-lif/Lifecycle],
   :skos/definition
   "a lifecycle that defines the evolution of a trade, from initiation through settlement",
   :skos/example
   "The trade life cycle describes the period of time over which a trade is initiated, typically as a part of a broader deal, consumated, processed and executed, settled or closed for other reasons, and reported."})

(def TradeLifecycleEvent
  "a kind of event that occurs during one or more stages of the lifecycle of a trade"
  {:db/ident :fibo-fbc-pas-fpas/TradeLifecycleEvent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "trade lifecycle event",
   :rdfs/subClassOf [{:owl/onProperty :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom
                      :fibo-fbc-pas-fpas/TradeLifecycleStage,
                      :rdf/type :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fbc-pas-fpas/TradeLifecycleEvent,
                      :owl/onProperty :cmns-dt/succeeds,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-arr-lif/LifecycleEvent],
   :skos/definition
   "a kind of event that occurs during one or more stages of the lifecycle of a trade"})

(def TradeLifecycleEventOccurrence
  "an occurrence of an event that occurs during a specific stage of a specific trade lifecycle"
  {:db/ident :fibo-fbc-pas-fpas/TradeLifecycleEventOccurrence,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "trade lifecycle event occurrence",
   :rdfs/subClassOf
   [{:owl/onProperty     :cmns-cxtdsg/appliesTo,
     :owl/someValuesFrom :fibo-fbc-pas-fpas/TradeLifecycleStageOccurrence,
     :rdf/type           :owl/Restriction}
    {:owl/onClass    :fibo-fbc-pas-fpas/TradeLifecycleEvent,
     :owl/onProperty :fibo-fnd-dt-oc/exemplifies,
     :owl/qualifiedCardinality 1,
     :rdf/type       :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-fpas/TradeLifecycleEventOccurrence,
     :owl/onProperty :cmns-dt/succeeds,
     :rdf/type       :owl/Restriction}
    :fibo-fnd-arr-lif/LifecycleEventOccurrence],
   :skos/definition
   "an occurrence of an event that occurs during a specific stage of a specific trade lifecycle"})

(def TradeLifecycleOccurrence
  "a realization of a trade lifecycle"
  {:db/ident :fibo-fbc-pas-fpas/TradeLifecycleOccurrence,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "trade lifecycle occurrence",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-arr-lif/hasStage,
                      :owl/someValuesFrom
                      :fibo-fbc-pas-fpas/TradeLifecycleStageOccurrence,
                      :rdf/type :owl/Restriction}
                     {:owl/onClass    :fibo-fbc-pas-fpas/TradeLifecycle,
                      :owl/onProperty :fibo-fnd-dt-oc/exemplifies,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-arr-lif/LifecycleOccurrence],
   :skos/definition "a realization of a trade lifecycle"})

(def TradeLifecycleStage
  "a phase in the lifecycle of a trade"
  {:db/ident :fibo-fbc-pas-fpas/TradeLifecycleStage,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "trade lifecycle stage",
   :rdfs/subClassOf [:fibo-fnd-arr-lif/LifecycleStage
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fbc-pas-fpas/TradeLifecycleStage,
                      :owl/onProperty :cmns-dt/succeeds,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty :cmns-col/comprises,
                      :owl/someValuesFrom
                      :fibo-fbc-pas-fpas/TradeLifecycleEvent,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-arr-lif/isStageOf,
                      :owl/someValuesFrom :fibo-fbc-pas-fpas/TradeLifecycle,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :cmns-cls/classifies,
                      :owl/someValuesFrom :fibo-fbc-pas-fpas/Trade,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :cmns-dsg/isDefinedIn,
                      :owl/someValuesFrom :fibo-fbc-pas-fpas/TradeLifecycle,
                      :rdf/type           :owl/Restriction}],
   :skos/definition "a phase in the lifecycle of a trade"})

(def TradeLifecycleStageOccurrence
  "an instance of a phase in an occurrence of a given trade lifecycle"
  {:db/ident :fibo-fbc-pas-fpas/TradeLifecycleStageOccurrence,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "trade lifecycle stage occurrence",
   :rdfs/subClassOf
   [{:owl/onProperty     :cmns-col/comprises,
     :owl/someValuesFrom :fibo-fbc-pas-fpas/TradeLifecycleEventOccurrence,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-arr-lif/isStageOf,
     :owl/someValuesFrom :fibo-fbc-pas-fpas/TradeLifecycleOccurrence,
     :rdf/type           :owl/Restriction}
    {:owl/onClass    :fibo-fbc-pas-fpas/TradeLifecycleStage,
     :owl/onProperty :fibo-fnd-dt-oc/exemplifies,
     :owl/qualifiedCardinality 1,
     :rdf/type       :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-fpas/TradeLifecycleStageOccurrence,
     :owl/onProperty :cmns-dt/succeeds,
     :rdf/type       :owl/Restriction}
    :fibo-fnd-arr-lif/LifecycleStageOccurrence],
   :skos/definition
   "an instance of a phase in an occurrence of a given trade lifecycle"})

(def Trader
  "party that engages in the transfer of financial assets in any financial market on behalf of a client or the financial services provider"
  {:db/ident :fibo-fbc-pas-fpas/Trader,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "trader",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-pty-rl/isPlayedBy,
                      :owl/someValuesFrom
                      {:owl/onProperty :fibo-fnd-law-lcap/hasCapacity,
                       :owl/someValuesFrom
                       :fibo-fnd-law-lcap/ContractualCapability,
                       :rdf/type :owl/Restriction},
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-fbc-pas-fpas/facilitates,
                      :owl/someValuesFrom :fibo-fbc-pas-fpas/Trade,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-pas-pas/ServiceProvider],
   :skos/definition
   "party that engages in the transfer of financial assets in any financial market on behalf of a client or the financial services provider"})

(def TradingStrategy
  "approach used for buying and selling in the securities markets"
  {:cmns-av/explanatoryNote
   "A trading strategy is a plan whose aim is to make a profit or hedge against risk, based on rules and other criteria used when making trading decisions. A trading strategy may be simple or complex, and involve considerations such as investment style (e.g., value vs. growth), market cap, technical indicators, fundamental analysis, industry sector, level of portfolio diversification, time horizon or holding period, risk tolerance, leverage, tax considerations, and so on.",
   :db/ident :fibo-fbc-pas-fpas/TradingStrategy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "trading strategy",
   :rdfs/subClassOf :fibo-fnd-gao-obj/Strategy,
   :skos/definition
   "approach used for buying and selling in the securities markets"})

(def UniqueTransactionIdentifier
  "sequence of characters identifying a financial transaction uniquely whenever useful and agreed by the parties or community involved in the transaction"
  {:cmns-av/abbreviation "UTI",
   :cmns-av/adaptedFrom
   ["Harmonization of the Unique Transaction Identifier - Technical Guidance, 20 Feb 2017, described in https://www.bis.org/cpmi/publ/d158.pdf"
    "ISO 23897:2020, Financial services - Unique transaction identifier (UTI)"],
   :cmns-av/explanatoryNote
   "In particular, a UTI will help to ensure the consistent aggregation of OTC derivatives and other securities transactions by minimising the likelihood that the same transaction will be counted more than once (for instance, because it is reported by more than one counterparty to a transaction, or to more than one trade repository (TR)).",
   :db/ident :fibo-fbc-pas-fpas/UniqueTransactionIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "unique transaction identifier",
   :rdfs/subClassOf [:fibo-fbc-pas-fpas/TradeIdentifier
                     {:owl/onProperty :fibo-fbc-pas-fpas/hasGeneratingEntity,
                      :owl/someValuesFrom :fibo-be-le-lp/LegalEntity,
                      :rdf/type :owl/Restriction}],
   :skos/definition
   "sequence of characters identifying a financial transaction uniquely whenever useful and agreed by the parties or community involved in the transaction"})

(def WeightedBasket
  "basket whose constituents have some relative importance with respect to one another"
  {:db/ident :fibo-fbc-pas-fpas/WeightedBasket,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "weighted basket",
   :rdfs/subClassOf [{:owl/onProperty :cmns-col/hasConstituent,
                      :owl/someValuesFrom
                      :fibo-fbc-pas-fpas/WeightedBasketConstituent,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-utl-alx/hasExpression,
                      :owl/someValuesFrom :fibo-fnd-utl-alx/WeightingFunction,
                      :rdf/type           :owl/Restriction}
                     :cmns-col/StructuredCollection
                     :fibo-fbc-pas-fpas/Basket],
   :skos/definition
   "basket whose constituents have some relative importance with respect to one another"})

(def WeightedBasketConstituent
  "component of a basket whose relative importance with respect to other basket constituents is known"
  {:db/ident :fibo-fbc-pas-fpas/WeightedBasketConstituent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "weighted basket constituent",
   :rdfs/subClassOf [{:owl/onDataRange :xsd/decimal,
                      :owl/onProperty  :fibo-fnd-utl-alx/hasWeight,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     :fibo-fbc-pas-fpas/BasketConstituent],
   :skos/definition
   "component of a basket whose relative importance with respect to other basket constituents is known"})

(def facilitates
  "provides the context in which an event, a task, a conversation or something else can occur"
  {:db/ident :fibo-fbc-pas-fpas/facilitates,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "facilitates",
   :skos/definition
   "provides the context in which an event, a task, a conversation or something else can occur"})

(def hasGeneratingEntity
  "specifies a legal entity that generates something"
  {:db/ident :fibo-fbc-pas-fpas/hasGeneratingEntity,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "has generating entity",
   :rdfs/range :fibo-be-le-lp/LegalEntity,
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/generates,
   :skos/definition "specifies a legal entity that generates something"})

(def hasGeneratingEntityIdentifier
  "specifies an identifier for the entity that generated something"
  {:cmns-av/explanatoryNote
   "Note that the range of is identified by must be that entity's LEI in the context of a UTI",
   :db/ident :fibo-fbc-pas-fpas/hasGeneratingEntityIdentifier,
   :owl/propertyChainAxiom [:fibo-fbc-pas-fpas/hasGeneratingEntity
                            :cmns-id/isIdentifiedBy],
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-pas-fpas/UniqueTransactionIdentifier,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "has generating entity identifier",
   :skos/definition
   "specifies an identifier for the entity that generated something"})

(def hasLegalAgent
  "identifies a party as one that has the legal, medical or financial capacity to act on behalf of someone else under specific circumstances"
  {:db/ident :fibo-fbc-pas-fpas/hasLegalAgent,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "has registered agent",
   :rdfs/range :fibo-fbc-pas-fpas/LegalAgent,
   :rdfs/subPropertyOf :fibo-fnd-pty-pty/hasPartyInRole,
   :skos/definition
   "identifies a party as one that has the legal, medical or financial capacity to act on behalf of someone else under specific circumstances"})

(def hasNominalNumberOfUnits
  "indicates the base number of units of something associated with some offering"
  {:db/ident :fibo-fbc-pas-fpas/hasNominalNumberOfUnits,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "has nominal number of units",
   :rdfs/range :xsd/integer,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasAmount,
   :skos/definition
   "indicates the base number of units of something associated with some offering"})

(def hasOffering
  "relates something to a voluntary but conditional promise submitted by a buyer or seller (offeror) to another (offeree) for acceptance, and which becomes legally enforceable if accepted by the offeree"
  {:db/ident :fibo-fbc-pas-fpas/hasOffering,
   :owl/inverseOf :fibo-fbc-pas-fpas/isOfferingOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "has offering",
   :rdfs/range :fibo-fbc-pas-fpas/Offering,
   :skos/definition
   "relates something to a voluntary but conditional promise submitted by a buyer or seller (offeror) to another (offeree) for acceptance, and which becomes legally enforceable if accepted by the offeree"})

(def hasOfferingAmount
  "indicates the notional monetary amount, determined based on reference data, market rates or some other agreed method associated with some offering"
  {:db/ident :fibo-fbc-pas-fpas/hasOfferingAmount,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "has offering amount",
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasNotionalAmount,
   :skos/definition
   "indicates the notional monetary amount, determined based on reference data, market rates or some other agreed method associated with some offering"})

(def hasOfferingPrice
  "indicates the price associated with an offering, which may be an explicit or calculated price"
  {:db/ident :fibo-fbc-pas-fpas/hasOfferingPrice,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "has offering price",
   :rdfs/range :fibo-fnd-acc-cur/MonetaryPrice,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasPrice,
   :skos/definition
   "indicates the price associated with an offering, which may be an explicit or calculated price"})

(def hasOfferingUnits
  "indicates the actual number of units of something, including any premium on the number of units, associated with some offering"
  {:db/ident :fibo-fbc-pas-fpas/hasOfferingUnits,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "has offering units",
   :rdfs/range :xsd/integer,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasAmount,
   :skos/definition
   "indicates the actual number of units of something, including any premium on the number of units, associated with some offering"})

(def hasSelectingParty
  "indicates the person(s) or organization(s) responsible for determining the contents of a basket"
  {:db/ident :fibo-fbc-pas-fpas/hasSelectingParty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "has selecting party",
   :rdfs/range :fibo-fnd-pty-pty/IndependentParty,
   :rdfs/subPropertyOf :fibo-fnd-pty-pty/hasParty,
   :skos/definition
   "indicates the person(s) or organization(s) responsible for determining the contents of a basket"})

(def hasSelectionCriteria
  "describes the methodology or program used to determine the membership of a collection"
  {:db/ident :fibo-fbc-pas-fpas/hasSelectionCriteria,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :cmns-col/Collection,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "has selection criteria",
   :rdfs/subPropertyOf :cmns-txt/hasTextValue,
   :skos/definition
   "describes the methodology or program used to determine the membership of a collection"})

(def hasSettlementDate
  "indicates the date by which an executed order or transaction must be settled"
  {:cmns-av/explanatoryNote
   "Settlement might involve either a buyer paying in cash or a seller delivering the relevant instrument(s) and receiving the proceeds as specified by the terms of a given transaction.",
   :db/ident :fibo-fbc-pas-fpas/hasSettlementDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "has settlement date",
   :rdfs/range :fibo-fnd-dt-fd/CalculatedDate,
   :rdfs/subPropertyOf :cmns-dt/hasEndDate,
   :skos/definition
   "indicates the date by which an executed order or transaction must be settled"})

(def hasTradeDate
  "indicates the date on which a security or other instrument-specific trade actually takes place"
  {:db/ident :fibo-fbc-pas-fpas/hasTradeDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "has trade date",
   :rdfs/range :cmns-dt/Date,
   :rdfs/subPropertyOf :cmns-dt/hasDate,
   :skos/definition
   "indicates the date on which a security or other instrument-specific trade actually takes place"})

(def isEmbodiedIn
  "identifies the representation or tangible form of something in some context"
  {:db/ident :fibo-fbc-pas-fpas/isEmbodiedIn,
   :owl/inverseOf :fibo-fnd-rel-rel/embodies,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "is embodied in",
   :skos/definition
   "identifies the representation or tangible form of something in some context"})

(def isFacilitatedBy
  "identifies someone or something that expedites some event, transaction, conversation or something else in some context"
  {:db/ident :fibo-fbc-pas-fpas/isFacilitatedBy,
   :owl/inverseOf :fibo-fbc-pas-fpas/facilitates,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "is facilitated by",
   :skos/definition
   "identifies someone or something that expedites some event, transaction, conversation or something else in some context"})

(def isOfferingOf
  "relates an offering to one or things that are the subject of the offer"
  {:db/ident :fibo-fbc-pas-fpas/isOfferingOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-pas-fpas/Offering,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "is offering of",
   :skos/definition
   "relates an offering to one or things that are the subject of the offer"})

(def precedes
  {:db/ident :fibo-fbc-pas-fpas/precedes,
   :owl/deprecated true,
   :owl/equivalentProperty :cmns-dt/precedes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"})

(def relatesTo
  "has a logical or causal connection with"
  {:db/ident :fibo-fbc-pas-fpas/relatesTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfs/label "relates to",
   :skos/definition "has a logical or causal connection with"})

(def succeeds
  {:db/ident :fibo-fbc-pas-fpas/succeeds,
   :owl/deprecated true,
   :owl/equivalentProperty :cmns-dt/succeeds,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"})

(def ^{:private true} precedes
  {:db/ident :cmns-dt/precedes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/subPropertyOf :fibo-fbc-pas-fpas/relatesTo})

(def ^{:private true} succeeds
  {:db/ident :cmns-dt/succeeds,
   :rdf/type :owl/ObjectProperty,
   :rdfs/subPropertyOf :fibo-fbc-pas-fpas/relatesTo})

(def ^{:private true} Product
  {:db/ident        :fibo-fnd-pas-pas/Product,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fbc-pas-fpas/ProductLifecycle,
                      :owl/onProperty :fibo-fnd-arr-lif/hasLifecycle,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fbc-pas-fpas/Catalog,
                      :owl/onProperty :cmns-cls/isCharacterizedBy,
                      :rdf/type       :owl/Restriction}]})