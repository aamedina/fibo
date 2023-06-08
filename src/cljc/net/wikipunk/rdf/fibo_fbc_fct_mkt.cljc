(ns net.wikipunk.rdf.fibo-fbc-fct-mkt
  "This ontology defines the fundamental concepts for markets, exchanges, regulated markets, and multilateral trading facilities."
  {:cmns-av/copyright ["Copyright (c) 2015-2023 Object Management Group, Inc."
                       "Copyright (c) 2015-2023 EDM Council, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :dcterms/abstract
   "This ontology defines the fundamental concepts for markets, exchanges, regulated markets, and multilateral trading facilities.",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Lifecycles/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/BusinessRegistries/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Facilities/"
    "https://www.omg.org/spec/Commons/Classifiers/"
    "https://www.omg.org/spec/Commons/Identifiers/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Roles/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://www.omg.org/spec/Commons/Collections/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/RegistrationAuthorities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Locations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Reporting/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/VirtualPlaces/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/Jurisdiction/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/FinancialProductsAndServices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Organizations/Organizations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/FunctionalEntities/Publishers/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/RegulatoryAgencies/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LegalPersons/"
    "https://www.omg.org/spec/Commons/Designators/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/Markets/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-dsg" "https://www.omg.org/spec/Commons/Designators/",
    "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-fct-pub"
    "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers/",
    "fibo-fbc-fct-breg"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
    "fibo-fbc-fct-mkt"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
    "fibo-fbc-fct-ra"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegistrationAuthorities/",
    "fibo-fbc-fct-rga"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegulatoryAgencies/",
    "fibo-fbc-pas-fpas"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
    "fibo-fnd-arr-lif"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Lifecycles/",
    "fibo-fnd-arr-rep"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/",
    "fibo-fnd-law-jur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/Jurisdiction/",
    "fibo-fnd-org-org"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations/",
    "fibo-fnd-plc-fac"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Facilities/",
    "fibo-fnd-plc-loc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Locations/",
    "fibo-fnd-pty-rl"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles/",
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
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fbc-fct-mkt",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfs/label "Markets Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/ version of this ontology was modified to reflect issue resolutions detailed in the FIBO FBC 1.0 RTF report."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/ version of this ontology was modified per the FIBO 2.0 RFC."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/ version of this ontology was modified to replace the hasTag property in Relations with the LCC equivalent on nominals."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/ version of this ontology was modified to add the definition of an exchange participant and loosen constraints on the location in which a given exchange operates, given that there are cases when an exchange may operate in multiple locations."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/ version of this ontology was modified to generalize certain unions where they were no longer required and to move international registration authorities individuals to a separate ontology for better modularity."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/ version of this ontology was modified to revise the number and nature of 'market categories' per the latest version of ISO 10383, including the addition of ESMA-regulated data reporting service providers and other new categories, augment the representation of a market to reference the legal entity that is the market, add their LEI and other details that correspond to the entity vs. the market and so forth."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/ version of this ontology was modified to add: 'off-market', with synonyms of 'off-facility' and 'off-book', 'auction market' for periodic or on-demand auction markets, 'dark pool', and 'quote-driven market' for those that have QUOTE or RFQ in their name excluding QUOTED FUNDS, and other 'alternative trading system's; also moved 'designated contract market' and 'swap execution facility' from DER to the this ontology for use in generating proper classification of the ISO MIC codes."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/ version of this ontology was modified to eliminate deprecated elements."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/ version of this ontology was modified to eliminate duplication of concepts in LCC, simplify addresses, merge countries with locations in FND, and correct the declaration of the property 'operates in municipality' to be an object property."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/ version of this ontology was modified to integrated details from the redundant 'securities exchange' concept with 'exchange'."]})

(def ActiveMICStatus
  "market identifier code status that indicates that as of the last report or update, the code was registered and actively in use"
  {:cmns-av/adaptedFrom
   ["https://www.iso20022.org/sites/default/files/2021-12/ISO10383_MIC_Release_2_0_Factsheet.pdf"
    "ISO 10383, Securities and related financial instruments - Codes for exchanges and market identification (MIC), version 2.0"],
   :db/ident :fibo-fbc-fct-mkt/ActiveMICStatus,
   :fibo-fnd-rel-rel/hasTag "ACTIVE",
   :rdf/type [:fibo-fbc-fct-mkt/MarketIdentifierCodeStatus
              :owl/NamedIndividual
              :fibo-fnd-arr-lif/LifecycleStage],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfs/label "active MIC status",
   :skos/definition
   "market identifier code status that indicates that as of the last report or update, the code was registered and actively in use"})

(def AlternativeTradingSystem
  "trading venue that is more loosely regulated than a regulated exchange"
  {:cmns-av/abbreviation "ATS",
   :cmns-av/adaptedFrom
   "https://www.iso20022.org/sites/default/files/2021-12/ISO10383_MIC_Release_2_0_Factsheet.pdf",
   :cmns-av/explanatoryNote
   "The SEC formally defines an alternative trading system as any organization, association, person, group of persons, or systems (1) that constitutes, maintains, or provides a market place or facilities for bringing together purchasers and sellers of securities or for otherwise performing with respect to securities the functions commonly performed by a stock exchange within the meaning of Rule 3b-16 under the Exchange Act; and (2) that does not (i) set rules governing the conduct of subscribers other than the conduct of such subscribers' trading on such organization, association, person, group of persons, or system, or (ii) discipline subscribers other than by exclusion from trading.",
   :db/ident :fibo-fbc-fct-mkt/AlternativeTradingSystem,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfs/label "alternative trading system",
   :rdfs/subClassOf [{:owl/hasValue
                      :fibo-fbc-fct-mkt/MarketCategoryClassifier-ATSS,
                      :owl/onProperty :cmns-cls/isClassifiedBy,
                      :rdf/type :owl/Restriction}
                     :fibo-fbc-fct-mkt/Exchange
                     {:owl/onProperty     :fibo-fbc-fct-mkt/operatesInCountry,
                      :owl/someValuesFrom :lcc-cr/Country,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :rdfs/Literal,
                      :owl/onProperty  :fibo-fnd-rel-rel/hasFormalName,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :rdfs/Literal,
                      :owl/onProperty  :fibo-fbc-fct-mkt/hasFacilityAcronym,
                      :rdf/type        :owl/Restriction}
                     :fibo-fnd-plc-fac/Facility
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass :fibo-fbc-pas-fpas/FinancialServiceProvider,
                      :owl/onProperty :fibo-fnd-rel-rel/isManagedBy,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty :fibo-fbc-fct-mkt/operatesInMunicipality,
                      :owl/someValuesFrom :fibo-fnd-plc-loc/Municipality,
                      :rdf/type :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fbc-fct-mkt/MarketIdentifier,
                      :owl/onProperty :cmns-id/isIdentifiedBy,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "trading venue that is more loosely regulated than a regulated exchange"})

(def ApprovedPublicationArrangement
  "data reporting services provider that is authorized to provide the service of publishing certain trade reports on behalf of banks, investment firms, or asset management companies"
  {:cmns-av/abbreviation "APA",
   :cmns-av/adaptedFrom
   ["https://www.iso20022.org/sites/default/files/2021-12/ISO10383_MIC_Release_2_0_Factsheet.pdf"
    "https://www.esma.europa.eu/press-news/esma-news/esma-identifies-data-reporting-services-providers-be-supervised-directly"
    "https://www.lawinsider.com/dictionary/approved-publication-arrangement-apa"],
   :cmns-av/synonym [#voc/lstr "authorized publication arrangement@en-US"
                     #voc/lstr "authorised publication arrangement@en-GB"],
   :db/ident :fibo-fbc-fct-mkt/ApprovedPublicationArrangement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfs/label "approved publication arrangement",
   :rdfs/subClassOf [{:owl/hasValue
                      :fibo-fbc-fct-mkt/MarketCategoryClassifier-APPA,
                      :owl/onProperty :cmns-cls/isClassifiedBy,
                      :rdf/type :owl/Restriction}
                     :fibo-fbc-fct-mkt/DataReportingServicesProvider
                     {:owl/onProperty :fibo-fbc-fct-mkt/operatesInMunicipality,
                      :owl/someValuesFrom :fibo-fnd-plc-loc/Municipality,
                      :rdf/type :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :rdfs/Literal,
                      :owl/onProperty  :fibo-fnd-rel-rel/hasFormalName,
                      :rdf/type        :owl/Restriction}
                     :fibo-be-fct-pub/MarketDataProvider
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :rdfs/Literal,
                      :owl/onProperty  :fibo-fbc-fct-mkt/hasFacilityAcronym,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fbc-fct-mkt/MarketIdentifier,
                      :owl/onProperty :cmns-id/isIdentifiedBy,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-arr-rep/ReportingParty
                     {:owl/onProperty     :fibo-fbc-fct-mkt/operatesInCountry,
                      :owl/someValuesFrom :lcc-cr/Country,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   "data reporting services provider that is authorized to provide the service of publishing certain trade reports on behalf of banks, investment firms, or asset management companies"})

(def ApprovedReportingMechanism
  "data reporting services provider that is authorized to provide the service of reporting details of transactions to competent authorities or ESMA (the European Securities and Markets Authority) on behalf of investment firms"
  {:cmns-av/abbreviation "ARM",
   :cmns-av/adaptedFrom
   ["https://www.iso20022.org/sites/default/files/2021-12/ISO10383_MIC_Release_2_0_Factsheet.pdf"
    "https://www.esma.europa.eu/press-news/esma-news/esma-identifies-data-reporting-services-providers-be-supervised-directly"
    "https://www.lawinsider.com/dictionary/approved-reporting-mechanism"],
   :db/ident :fibo-fbc-fct-mkt/ApprovedReportingMechanism,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfs/label "approved reporting mechanism",
   :rdfs/subClassOf [{:owl/hasValue
                      :fibo-fbc-fct-mkt/MarketCategoryClassifier-ARMS,
                      :owl/onProperty :cmns-cls/isClassifiedBy,
                      :rdf/type :owl/Restriction}
                     :fibo-fbc-fct-mkt/DataReportingServicesProvider
                     {:owl/onProperty :fibo-fbc-fct-mkt/operatesInMunicipality,
                      :owl/someValuesFrom :fibo-fnd-plc-loc/Municipality,
                      :rdf/type :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :rdfs/Literal,
                      :owl/onProperty  :fibo-fnd-rel-rel/hasFormalName,
                      :rdf/type        :owl/Restriction}
                     :fibo-be-fct-pub/MarketDataProvider
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :rdfs/Literal,
                      :owl/onProperty  :fibo-fbc-fct-mkt/hasFacilityAcronym,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fbc-fct-mkt/MarketIdentifier,
                      :owl/onProperty :cmns-id/isIdentifiedBy,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-arr-rep/ReportingParty
                     {:owl/onProperty     :fibo-fbc-fct-mkt/operatesInCountry,
                      :owl/someValuesFrom :lcc-cr/Country,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   "data reporting services provider that is authorized to provide the service of reporting details of transactions to competent authorities or ESMA (the European Securities and Markets Authority) on behalf of investment firms"})

(def AuctionMarket
  "exchange in which buyers and sellers submit competitive bids that do not involve direct negotiations between parties, as part of an auction scheduled either on demand or on a periodic basis"
  {:db/ident :fibo-fbc-fct-mkt/AuctionMarket,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfs/label "auction market",
   :rdfs/subClassOf [:fibo-fbc-fct-mkt/Exchange
                     {:owl/onProperty     :fibo-fbc-fct-mkt/operatesInCountry,
                      :owl/someValuesFrom :lcc-cr/Country,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :rdfs/Literal,
                      :owl/onProperty  :fibo-fnd-rel-rel/hasFormalName,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :rdfs/Literal,
                      :owl/onProperty  :fibo-fbc-fct-mkt/hasFacilityAcronym,
                      :rdf/type        :owl/Restriction}
                     :fibo-fnd-plc-fac/Facility
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass :fibo-fbc-pas-fpas/FinancialServiceProvider,
                      :owl/onProperty :fibo-fnd-rel-rel/isManagedBy,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty :fibo-fbc-fct-mkt/operatesInMunicipality,
                      :owl/someValuesFrom :fibo-fnd-plc-loc/Municipality,
                      :rdf/type :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fbc-fct-mkt/MarketIdentifier,
                      :owl/onProperty :cmns-id/isIdentifiedBy,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "exchange in which buyers and sellers submit competitive bids that do not involve direct negotiations between parties, as part of an auction scheduled either on demand or on a periodic basis"})

(def ConsolidatedTapeProvider
  "data reporting services provider that is authorized to provide the service of collecting trade reports for financial instruments from regulated markets, MTFs, OTFs and APAs and consolidating them into a continuous electronic live data stream providing price and volume data per financial instrument"
  {:cmns-av/abbreviation "CTP",
   :cmns-av/adaptedFrom
   ["https://www.esma.europa.eu/press-news/esma-news/esma-identifies-data-reporting-services-providers-be-supervised-directly"
    "https://www.lawinsider.com/dictionary/consolidated-tape-providers-hereinafter-referred-to-as-ctp"
    "https://www.iso20022.org/sites/default/files/2021-12/ISO10383_MIC_Release_2_0_Factsheet.pdf"],
   :cmns-av/explanatoryNote
   "Consolidated tape is an electronic system that collates real-time exchange-listed data, such as price and volume, and disseminates it to investors. Through the consolidated tape, various major exchanges, including the New York Stock Exchange, the NASDAQ, and the Chicago Board Options Exchange, report trades and quotes.",
   :db/ident :fibo-fbc-fct-mkt/ConsolidatedTapeProvider,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfs/label "consolidated tape provider",
   :rdfs/subClassOf [:fibo-fbc-fct-mkt/DataReportingServicesProvider
                     {:owl/hasValue
                      :fibo-fbc-fct-mkt/MarketCategoryClassifier-CTPS,
                      :owl/onProperty :cmns-cls/isClassifiedBy,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty :fibo-fbc-fct-mkt/operatesInMunicipality,
                      :owl/someValuesFrom :fibo-fnd-plc-loc/Municipality,
                      :rdf/type :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :rdfs/Literal,
                      :owl/onProperty  :fibo-fnd-rel-rel/hasFormalName,
                      :rdf/type        :owl/Restriction}
                     :fibo-be-fct-pub/MarketDataProvider
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :rdfs/Literal,
                      :owl/onProperty  :fibo-fbc-fct-mkt/hasFacilityAcronym,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fbc-fct-mkt/MarketIdentifier,
                      :owl/onProperty :cmns-id/isIdentifiedBy,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-arr-rep/ReportingParty
                     {:owl/onProperty     :fibo-fbc-fct-mkt/operatesInCountry,
                      :owl/someValuesFrom :lcc-cr/Country,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   "data reporting services provider that is authorized to provide the service of collecting trade reports for financial instruments from regulated markets, MTFs, OTFs and APAs and consolidating them into a continuous electronic live data stream providing price and volume data per financial instrument"})

(def CryptoAssetServicesProvider
  "financial services provider that provides services for crypto assets that enable the control of crypto assets, and participate in, or provide, financial services for issuers' offers, or sale, of crypto assets"
  {:cmns-av/abbreviation "CASP",
   :cmns-av/adaptedFrom
   ["https://www.lawinsider.com/dictionary/crypto-asset-service-provider-casp"
    "https://www.iso20022.org/sites/default/files/2021-12/ISO10383_MIC_Release_2_0_Factsheet.pdf"],
   :cmns-av/explanatoryNote
   "Services related to crypto assets may include businesses that exchange crypto assets for fiat currencies, or vice versa, that conduct transactions that move crypto assets from one crypto asset address, or account, to another, and/or that provide facilities for the safekeeping, or administration, of crypto assets, or instruments.",
   :db/ident :fibo-fbc-fct-mkt/CryptoAssetServicesProvider,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfs/label "crypto asset services provider",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fbc-fct-mkt/operatesInCountry,
                      :owl/someValuesFrom :lcc-cr/Country,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :rdfs/Literal,
                      :owl/onProperty  :fibo-fbc-fct-mkt/hasFacilityAcronym,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :rdfs/Literal,
                      :owl/onProperty  :fibo-fnd-rel-rel/hasFormalName,
                      :rdf/type        :owl/Restriction}
                     {:owl/hasValue
                      :fibo-fbc-fct-mkt/MarketCategoryClassifier-CASP,
                      :owl/onProperty :cmns-cls/isClassifiedBy,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty :fibo-fbc-fct-mkt/operatesInMunicipality,
                      :owl/someValuesFrom :fibo-fnd-plc-loc/Municipality,
                      :rdf/type :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fbc-fct-mkt/MarketIdentifier,
                      :owl/onProperty :cmns-id/isIdentifiedBy,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-pas-fpas/FinancialServiceProvider],
   :skos/definition
   "financial services provider that provides services for crypto assets that enable the control of crypto assets, and participate in, or provide, financial services for issuers' offers, or sale, of crypto assets"})

(def DarkPool
  "privately organized alternative trading system, that allows institutional investors the ability to trade without exposure until after the trade has been executed and reported"
  {:db/ident :fibo-fbc-fct-mkt/DarkPool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfs/label "dark pool",
   :rdfs/subClassOf [:fibo-fbc-fct-mkt/AlternativeTradingSystem
                     {:owl/onProperty     :fibo-fbc-fct-mkt/operatesInCountry,
                      :owl/someValuesFrom :lcc-cr/Country,
                      :rdf/type           :owl/Restriction}
                     {:owl/hasValue
                      :fibo-fbc-fct-mkt/MarketCategoryClassifier-ATSS,
                      :owl/onProperty :cmns-cls/isClassifiedBy,
                      :rdf/type :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :rdfs/Literal,
                      :owl/onProperty  :fibo-fnd-rel-rel/hasFormalName,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :rdfs/Literal,
                      :owl/onProperty  :fibo-fbc-fct-mkt/hasFacilityAcronym,
                      :rdf/type        :owl/Restriction}
                     :fibo-fnd-plc-fac/Facility
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass :fibo-fbc-pas-fpas/FinancialServiceProvider,
                      :owl/onProperty :fibo-fnd-rel-rel/isManagedBy,
                      :rdf/type :owl/Restriction}
                     :fibo-fbc-fct-mkt/Exchange
                     {:owl/onProperty :fibo-fbc-fct-mkt/operatesInMunicipality,
                      :owl/someValuesFrom :fibo-fnd-plc-loc/Municipality,
                      :rdf/type :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fbc-fct-mkt/MarketIdentifier,
                      :owl/onProperty :cmns-id/isIdentifiedBy,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "privately organized alternative trading system, that allows institutional investors the ability to trade without exposure until after the trade has been executed and reported"})

(def DataReportingServicesProvider
  "market data provider and reporting party that reports and/or publishes data on securities transactions, including required regulatory reporting for such transactions, and as such is subject to regulatory supervision"
  {:cmns-av/abbreviation "DRSP",
   :cmns-av/adaptedFrom
   ["https://www.esma.europa.eu/supervision/supervision/data-reporting-services-providers"
    "https://www.esma.europa.eu/press-news/esma-news/esma-identifies-data-reporting-services-providers-be-supervised-directly"],
   :db/ident :fibo-fbc-fct-mkt/DataReportingServicesProvider,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfs/label "data reporting services provider",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fbc-fct-mkt/operatesInMunicipality,
                      :owl/someValuesFrom :fibo-fnd-plc-loc/Municipality,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-arr-rep/ReportingParty
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fbc-fct-mkt/MarketIdentifier,
                      :owl/onProperty :cmns-id/isIdentifiedBy,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :rdfs/Literal,
                      :owl/onProperty  :fibo-fbc-fct-mkt/hasFacilityAcronym,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :rdfs/Literal,
                      :owl/onProperty  :fibo-fnd-rel-rel/hasFormalName,
                      :rdf/type        :owl/Restriction}
                     :fibo-be-fct-pub/MarketDataProvider
                     {:owl/onProperty     :fibo-fbc-fct-mkt/operatesInCountry,
                      :owl/someValuesFrom :lcc-cr/Country,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   "market data provider and reporting party that reports and/or publishes data on securities transactions, including required regulatory reporting for such transactions, and as such is subject to regulatory supervision"})

(def DeletedMICStatus
  {:db/ident :fibo-fbc-fct-mkt/DeletedMICStatus,
   :owl/deprecated true,
   :owl/sameAs :fibo-fbc-fct-mkt/ExpiredMICStatus,
   :rdf/type :owl/NamedIndividual,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/"})

(def DesignatedContractMarket
  "exchange, trading system, or platform that enables listing for trading futures or option contracts based on any underlying commodity, index or instrument"
  {:cmns-av/abbreviation "DCM",
   :cmns-av/adaptedFrom
   ["https://www.iso20022.org/sites/default/files/2021-12/ISO10383_MIC_Release_2_0_Factsheet.pdf"
    "http://www.cftc.gov/IndustryOversight/TradingOrganizations/DCMs/index.htm"],
   :db/ident :fibo-fbc-fct-mkt/DesignatedContractMarket,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfs/label "designated contract market",
   :rdfs/subClassOf [{:owl/hasValue
                      :fibo-fbc-fct-mkt/MarketCategoryClassifier-DCMS,
                      :owl/onProperty :cmns-cls/isClassifiedBy,
                      :rdf/type :owl/Restriction}
                     :fibo-fbc-fct-mkt/Exchange
                     {:owl/onProperty     :fibo-fbc-fct-mkt/operatesInCountry,
                      :owl/someValuesFrom :lcc-cr/Country,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :rdfs/Literal,
                      :owl/onProperty  :fibo-fnd-rel-rel/hasFormalName,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :rdfs/Literal,
                      :owl/onProperty  :fibo-fbc-fct-mkt/hasFacilityAcronym,
                      :rdf/type        :owl/Restriction}
                     :fibo-fnd-plc-fac/Facility
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass :fibo-fbc-pas-fpas/FinancialServiceProvider,
                      :owl/onProperty :fibo-fnd-rel-rel/isManagedBy,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty :fibo-fbc-fct-mkt/operatesInMunicipality,
                      :owl/someValuesFrom :fibo-fnd-plc-loc/Municipality,
                      :rdf/type :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fbc-fct-mkt/MarketIdentifier,
                      :owl/onProperty :cmns-id/isIdentifiedBy,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "exchange, trading system, or platform that enables listing for trading futures or option contracts based on any underlying commodity, index or instrument"})

(def ElectronicCommunicationNetwork
  "alternative trading system that automatically matches buy and sell orders for securities in the market"
  {:cmns-av/abbreviation "ECN",
   :cmns-av/explanatoryNote
   "ECNs allow brokerages and investors in different geographic areas to trade without a third party involved, offering privacy for investors. They also allow after-hours trading, but trading may be subject to commissions and other fees.",
   :db/ident :fibo-fbc-fct-mkt/ElectronicCommunicationNetwork,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfs/label "electronic communication network",
   :rdfs/seeAlso
   ["https://www.cfainstitute.org/-/media/documents/issue-brief/dark-pools-internalization-and-equity-market-quality-issue-brief"],
   :rdfs/subClassOf [:fibo-fbc-fct-mkt/AlternativeTradingSystem
                     {:owl/onProperty     :fibo-fbc-fct-mkt/operatesInCountry,
                      :owl/someValuesFrom :lcc-cr/Country,
                      :rdf/type           :owl/Restriction}
                     {:owl/hasValue
                      :fibo-fbc-fct-mkt/MarketCategoryClassifier-ATSS,
                      :owl/onProperty :cmns-cls/isClassifiedBy,
                      :rdf/type :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :rdfs/Literal,
                      :owl/onProperty  :fibo-fnd-rel-rel/hasFormalName,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :rdfs/Literal,
                      :owl/onProperty  :fibo-fbc-fct-mkt/hasFacilityAcronym,
                      :rdf/type        :owl/Restriction}
                     :fibo-fnd-plc-fac/Facility
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass :fibo-fbc-pas-fpas/FinancialServiceProvider,
                      :owl/onProperty :fibo-fnd-rel-rel/isManagedBy,
                      :rdf/type :owl/Restriction}
                     :fibo-fbc-fct-mkt/Exchange
                     {:owl/onProperty :fibo-fbc-fct-mkt/operatesInMunicipality,
                      :owl/someValuesFrom :fibo-fnd-plc-loc/Municipality,
                      :rdf/type :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fbc-fct-mkt/MarketIdentifier,
                      :owl/onProperty :cmns-id/isIdentifiedBy,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "alternative trading system that automatically matches buy and sell orders for securities in the market"})

(def Exchange
  "any organization, association, or group of persons, whether incorporated or unincorporated, which constitutes, maintains, or provides a facility for bringing together purchasers and sellers of financial instruments, commodities, or other products, services, or goods, and includes the market place and facilities maintained by such exchange"
  {:cmns-av/adaptedFrom
   ["ISO 10383, Securities and related financial instruments - Codes for exchanges and market identification (MIC), Third edition, 2012-10-01, confirmed 2018-03-29"
    "Securities Exchange Act of 1934, as amended 12 August 2012"],
   :cmns-av/explanatoryNote
   "An exchange is typically a corporation or mutual organization that provides securities trading services, where securities may be bought and sold by third parties. As a facility, an exchange is also a place of trade associated with a particular site, i.e., stock exchange, regulated market such as an Electronic Trading Platform (ECN), or unregulated market, such as an Automated Trading System (ATS), or market data provider. Stock exchanges also provide facilities for the issue and redemption of securities as well as other financial instruments and capital events including the payment of income and dividends.\n\nThe securities traded on a stock exchange include: shares issued by companies, unit trusts, derivatives, pooled investment products and bonds. To be able to trade a security on a certain stock exchange, it has to be listed there. Usually there is a central location at least for recordkeeping, but trade is less and less linked to such a physical place, as modern markets are electronic networks, which gives them advantages of speed and cost of transactions. Trade on an exchange is by members only.",
   :cmns-av/synonym "market",
   :db/ident :fibo-fbc-fct-mkt/Exchange,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfs/label "exchange",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fbc-fct-mkt/operatesInMunicipality,
                      :owl/someValuesFrom :fibo-fnd-plc-loc/Municipality,
                      :rdf/type :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :rdfs/Literal,
                      :owl/onProperty  :fibo-fbc-fct-mkt/hasFacilityAcronym,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fbc-fct-mkt/MarketIdentifier,
                      :owl/onProperty :cmns-id/isIdentifiedBy,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-fbc-fct-mkt/operatesInCountry,
                      :owl/someValuesFrom :lcc-cr/Country,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :rdfs/Literal,
                      :owl/onProperty  :fibo-fnd-rel-rel/hasFormalName,
                      :rdf/type        :owl/Restriction}
                     :fibo-fnd-plc-fac/Facility
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass :fibo-fbc-pas-fpas/FinancialServiceProvider,
                      :owl/onProperty :fibo-fnd-rel-rel/isManagedBy,
                      :rdf/type :owl/Restriction}],
   :skos/definition
   "any organization, association, or group of persons, whether incorporated or unincorporated, which constitutes, maintains, or provides a facility for bringing together purchasers and sellers of financial instruments, commodities, or other products, services, or goods, and includes the market place and facilities maintained by such exchange"})

(def ExchangeParticipant
  "registered agent who, in accordance with the rules of an exchange, may trade on or through the exchange and whose name is entered in a list, register or roll kept by the exchange as an agent who may trade on or through the exchange"
  {:db/ident :fibo-fbc-fct-mkt/ExchangeParticipant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfs/label "exchange participant",
   :rdfs/seeAlso ["https://www.lawinsider.com/dictionary/exchange-participant"],
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-pty-rl/isPlayedBy,
                      :owl/someValuesFrom {:owl/onProperty :cmns-col/isMemberOf,
                                           :owl/someValuesFrom
                                           {:owl/onProperty
                                            :fibo-fnd-pty-rl/playsRole,
                                            :owl/someValuesFrom
                                            :fibo-fbc-fct-mkt/Exchange,
                                            :rdf/type :owl/Restriction},
                                           :rdf/type :owl/Restriction},
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fbc-fct-ra/isRegisteredBy,
                      :owl/someValuesFrom :fibo-fbc-fct-mkt/Exchange,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-org-org/OrganizationMember
                     :fibo-fbc-pas-fpas/RegisteredAgent],
   :skos/definition
   "registered agent who, in accordance with the rules of an exchange, may trade on or through the exchange and whose name is entered in a list, register or roll kept by the exchange as an agent who may trade on or through the exchange"})

(def ExpiredMICStatus
  "as of the last report or update, the exchange code has expired"
  {:cmns-av/adaptedFrom
   ["https://www.iso20022.org/sites/default/files/2021-12/ISO10383_MIC_Release_2_0_Factsheet.pdf"
    "ISO 10383, Securities and related financial instruments - Codes for exchanges and market identification (MIC), Third edition, version 2.0"],
   :db/ident :fibo-fbc-fct-mkt/ExpiredMICStatus,
   :fibo-fnd-rel-rel/hasTag "EXPIRED",
   :rdf/type [:fibo-fbc-fct-mkt/MarketIdentifierCodeStatus
              :owl/NamedIndividual
              :fibo-fnd-arr-lif/LifecycleStage],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfs/label "expired MIC status",
   :skos/definition
   "as of the last report or update, the exchange code has expired"})

(def ISO10383-ClassificationScheme
  "classification scheme for market categories and related content per the ISO 10383 standard"
  {:cmns-av/adaptedFrom
   ["https://www.iso20022.org/sites/default/files/2021-12/ISO10383_MIC_Release_2_0_Factsheet.pdf"
    "https://www.iso20022.org/market-identifier-codes"],
   :db/ident :fibo-fbc-fct-mkt/ISO10383-ClassificationScheme,
   :rdf/type [:cmns-cls/ClassificationScheme :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfs/label "ISO 10383 classification scheme",
   :skos/definition
   "classification scheme for market categories and related content per the ISO 10383 standard"})

(def InterdealerQuotationSystem
  "automated system for organizing and disseminating price quotes by brokers and dealer firms that facilitates electronic trading in securities"
  {:cmns-av/abbreviation "IQS",
   :cmns-av/adaptedFrom
   ["https://www.lawinsider.com/dictionary/inter-dealer-quotation-system"
    "https://www.iso20022.org/sites/default/files/2021-12/ISO10383_MIC_Release_2_0_Factsheet.pdf"
    "https://www.investopedia.com/terms/i/interdealerquotationsystem.asp"],
   :cmns-av/explanatoryNote
   ["In the United States, an IQS is an automated interdealer quotation system of a national securities association registered pursuant to section 15A(a) of the Exchange Act (15 U.S.C. 78o-3(a))."
    "An IQS ties the price quotations of a number of exchanges together into one platform. This allows investors to more easily access security price quotations that would otherwise need to be monitored on several separate exchanges."],
   :cmns-av/synonym "inter-dealer quotation system",
   :db/ident :fibo-fbc-fct-mkt/InterdealerQuotationSystem,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfs/label "interdealer quotation system",
   :rdfs/subClassOf [:fibo-fbc-fct-mkt/Exchange
                     {:owl/hasValue
                      :fibo-fbc-fct-mkt/MarketCategoryClassifier-IDQS,
                      :owl/onProperty :cmns-cls/isClassifiedBy,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-fbc-fct-mkt/operatesInCountry,
                      :owl/someValuesFrom :lcc-cr/Country,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :rdfs/Literal,
                      :owl/onProperty  :fibo-fnd-rel-rel/hasFormalName,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :rdfs/Literal,
                      :owl/onProperty  :fibo-fbc-fct-mkt/hasFacilityAcronym,
                      :rdf/type        :owl/Restriction}
                     :fibo-fnd-plc-fac/Facility
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass :fibo-fbc-pas-fpas/FinancialServiceProvider,
                      :owl/onProperty :fibo-fnd-rel-rel/isManagedBy,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty :fibo-fbc-fct-mkt/operatesInMunicipality,
                      :owl/someValuesFrom :fibo-fnd-plc-loc/Municipality,
                      :rdf/type :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fbc-fct-mkt/MarketIdentifier,
                      :owl/onProperty :cmns-id/isIdentifiedBy,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "automated system for organizing and disseminating price quotes by brokers and dealer firms that facilitates electronic trading in securities",
   :skos/example
   "The National Association of Securities Dealers Automatic Quotation (Nasdaq), Nasdaq SmallCap Market, and the Over-The-Counter Bulletin Board (OTCBB) exchange platforms are integrated into one IQS. By using this integrated system, investors have access to a wide range of securities, ranging from large blue-chip companies to smaller micro-caps."})

(def MarketCategoryClassifier
  "classifier representing the controlled vocabulary that delineates the nature of the exchange or data reporting services provider where possible"
  {:cmns-av/adaptedFrom
   "https://www.iso20022.org/sites/default/files/2021-12/ISO10383_MIC_Release_2_0_Factsheet.pdf",
   :db/ident :fibo-fbc-fct-mkt/MarketCategoryClassifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfs/label "market category classifier",
   :rdfs/subClassOf
   [{:owl/onProperty     :cmns-cls/classifies,
     :owl/someValuesFrom {:owl/unionOf
                          [:fibo-fbc-fct-mkt/CryptoAssetServicesProvider
                           :fibo-fbc-fct-mkt/DataReportingServicesProvider
                           :fibo-fbc-fct-mkt/Exchange
                           :fibo-fbc-fct-mkt/TradeReportingFacility],
                          :rdf/type :owl/Class},
     :rdf/type           :owl/Restriction}
    {:owl/hasValue   :fibo-fbc-fct-mkt/ISO10383-ClassificationScheme,
     :owl/onProperty :cmns-dsg/isDefinedIn,
     :rdf/type       :owl/Restriction}
    :cmns-cls/Classifier],
   :skos/definition
   "classifier representing the controlled vocabulary that delineates the nature of the exchange or data reporting services provider where possible",
   :skos/scopeNote
   "As of October 2022, the controlled vocabulary includes two codes that are not semantically useful, namely 'not specified', or NSPD, and 'other', or OTHR. These are included for the sake of completeness but ignored with respect to how the exchange or market is classified. If something has one of these two codes as a market category, they will be classified either as an operating-level or segment-level marketas appropriate with no other distinction in terms of how they are instantiated."})

(def MarketCategoryClassifier-APPA
  "market category classifier for an approved publication arrangement"
  {:cmns-av/adaptedFrom
   "https://www.iso20022.org/sites/default/files/2021-12/ISO10383_MIC_Release_2_0_Factsheet.pdf",
   :db/ident :fibo-fbc-fct-mkt/MarketCategoryClassifier-APPA,
   :fibo-fnd-rel-rel/hasTag "APPA",
   :rdf/type [:fibo-fbc-fct-mkt/MarketCategoryClassifier
              :owl/NamedIndividual
              {:owl/hasValue   :fibo-fbc-fct-mkt/ISO10383-ClassificationScheme,
               :owl/onProperty :cmns-dsg/isDefinedIn,
               :rdf/type       :owl/Restriction}
              {:owl/onProperty :cmns-cls/classifies,
               :owl/someValuesFrom
               {:owl/unionOf [:fibo-fbc-fct-mkt/CryptoAssetServicesProvider
                              :fibo-fbc-fct-mkt/DataReportingServicesProvider
                              :fibo-fbc-fct-mkt/Exchange
                              :fibo-fbc-fct-mkt/TradeReportingFacility],
                :rdf/type    :owl/Class},
               :rdf/type :owl/Restriction}
              :cmns-cls/Classifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfs/label "market category classifier - APPA",
   :skos/definition
   "market category classifier for an approved publication arrangement"})

(def MarketCategoryClassifier-ARMS
  "market category classifier for an approved reporting mechanism"
  {:cmns-av/adaptedFrom
   "https://www.iso20022.org/sites/default/files/2021-12/ISO10383_MIC_Release_2_0_Factsheet.pdf",
   :db/ident :fibo-fbc-fct-mkt/MarketCategoryClassifier-ARMS,
   :fibo-fnd-rel-rel/hasTag "ARMS",
   :rdf/type [:fibo-fbc-fct-mkt/MarketCategoryClassifier
              :owl/NamedIndividual
              {:owl/hasValue   :fibo-fbc-fct-mkt/ISO10383-ClassificationScheme,
               :owl/onProperty :cmns-dsg/isDefinedIn,
               :rdf/type       :owl/Restriction}
              {:owl/onProperty :cmns-cls/classifies,
               :owl/someValuesFrom
               {:owl/unionOf [:fibo-fbc-fct-mkt/CryptoAssetServicesProvider
                              :fibo-fbc-fct-mkt/DataReportingServicesProvider
                              :fibo-fbc-fct-mkt/Exchange
                              :fibo-fbc-fct-mkt/TradeReportingFacility],
                :rdf/type    :owl/Class},
               :rdf/type :owl/Restriction}
              :cmns-cls/Classifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfs/label "market category classifier - ARMS",
   :skos/definition
   "market category classifier for an approved reporting mechanism"})

(def MarketCategoryClassifier-ATSS
  "market category classifier for an alternative trading system"
  {:cmns-av/adaptedFrom
   "https://www.iso20022.org/sites/default/files/2021-12/ISO10383_MIC_Release_2_0_Factsheet.pdf",
   :db/ident :fibo-fbc-fct-mkt/MarketCategoryClassifier-ATSS,
   :fibo-fnd-rel-rel/hasTag "ATSS",
   :rdf/type [:fibo-fbc-fct-mkt/MarketCategoryClassifier
              :owl/NamedIndividual
              {:owl/hasValue   :fibo-fbc-fct-mkt/ISO10383-ClassificationScheme,
               :owl/onProperty :cmns-dsg/isDefinedIn,
               :rdf/type       :owl/Restriction}
              {:owl/onProperty :cmns-cls/classifies,
               :owl/someValuesFrom
               {:owl/unionOf [:fibo-fbc-fct-mkt/CryptoAssetServicesProvider
                              :fibo-fbc-fct-mkt/DataReportingServicesProvider
                              :fibo-fbc-fct-mkt/Exchange
                              :fibo-fbc-fct-mkt/TradeReportingFacility],
                :rdf/type    :owl/Class},
               :rdf/type :owl/Restriction}
              :cmns-cls/Classifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfs/label "market category classifier - ATSS",
   :skos/definition
   "market category classifier for an alternative trading system"})

(def MarketCategoryClassifier-CASP
  "market category classifier for a crypto asset services provider"
  {:cmns-av/adaptedFrom
   "https://www.iso20022.org/sites/default/files/2021-12/ISO10383_MIC_Release_2_0_Factsheet.pdf",
   :db/ident :fibo-fbc-fct-mkt/MarketCategoryClassifier-CASP,
   :fibo-fnd-rel-rel/hasTag "CASP",
   :rdf/type [:fibo-fbc-fct-mkt/MarketCategoryClassifier
              :owl/NamedIndividual
              {:owl/hasValue   :fibo-fbc-fct-mkt/ISO10383-ClassificationScheme,
               :owl/onProperty :cmns-dsg/isDefinedIn,
               :rdf/type       :owl/Restriction}
              {:owl/onProperty :cmns-cls/classifies,
               :owl/someValuesFrom
               {:owl/unionOf [:fibo-fbc-fct-mkt/CryptoAssetServicesProvider
                              :fibo-fbc-fct-mkt/DataReportingServicesProvider
                              :fibo-fbc-fct-mkt/Exchange
                              :fibo-fbc-fct-mkt/TradeReportingFacility],
                :rdf/type    :owl/Class},
               :rdf/type :owl/Restriction}
              :cmns-cls/Classifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfs/label "market category classifier - CASP",
   :skos/definition
   "market category classifier for a crypto asset services provider"})

(def MarketCategoryClassifier-CTPS
  "market category classifier for a consolidated tape provider"
  {:cmns-av/adaptedFrom
   "https://www.iso20022.org/sites/default/files/2021-12/ISO10383_MIC_Release_2_0_Factsheet.pdf",
   :db/ident :fibo-fbc-fct-mkt/MarketCategoryClassifier-CTPS,
   :fibo-fnd-rel-rel/hasTag "CTPS",
   :rdf/type [:fibo-fbc-fct-mkt/MarketCategoryClassifier
              :owl/NamedIndividual
              {:owl/hasValue   :fibo-fbc-fct-mkt/ISO10383-ClassificationScheme,
               :owl/onProperty :cmns-dsg/isDefinedIn,
               :rdf/type       :owl/Restriction}
              {:owl/onProperty :cmns-cls/classifies,
               :owl/someValuesFrom
               {:owl/unionOf [:fibo-fbc-fct-mkt/CryptoAssetServicesProvider
                              :fibo-fbc-fct-mkt/DataReportingServicesProvider
                              :fibo-fbc-fct-mkt/Exchange
                              :fibo-fbc-fct-mkt/TradeReportingFacility],
                :rdf/type    :owl/Class},
               :rdf/type :owl/Restriction}
              :cmns-cls/Classifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfs/label "market category classifier - CTPS",
   :skos/definition
   "market category classifier for a consolidated tape provider"})

(def MarketCategoryClassifier-DCMS
  "market category classifier for a designated contract market"
  {:cmns-av/adaptedFrom
   "https://www.iso20022.org/sites/default/files/2021-12/ISO10383_MIC_Release_2_0_Factsheet.pdf",
   :db/ident :fibo-fbc-fct-mkt/MarketCategoryClassifier-DCMS,
   :fibo-fnd-rel-rel/hasTag "DCMS",
   :rdf/type [:fibo-fbc-fct-mkt/MarketCategoryClassifier
              :owl/NamedIndividual
              {:owl/hasValue   :fibo-fbc-fct-mkt/ISO10383-ClassificationScheme,
               :owl/onProperty :cmns-dsg/isDefinedIn,
               :rdf/type       :owl/Restriction}
              {:owl/onProperty :cmns-cls/classifies,
               :owl/someValuesFrom
               {:owl/unionOf [:fibo-fbc-fct-mkt/CryptoAssetServicesProvider
                              :fibo-fbc-fct-mkt/DataReportingServicesProvider
                              :fibo-fbc-fct-mkt/Exchange
                              :fibo-fbc-fct-mkt/TradeReportingFacility],
                :rdf/type    :owl/Class},
               :rdf/type :owl/Restriction}
              :cmns-cls/Classifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfs/label "market category classifier - DCMS",
   :skos/definition
   "market category classifier for a designated contract market"})

(def MarketCategoryClassifier-IDQS
  "market category classifier for an interdealer quotation system"
  {:cmns-av/adaptedFrom
   "https://www.iso20022.org/sites/default/files/2021-12/ISO10383_MIC_Release_2_0_Factsheet.pdf",
   :db/ident :fibo-fbc-fct-mkt/MarketCategoryClassifier-IDQS,
   :fibo-fnd-rel-rel/hasTag "IDQS",
   :rdf/type [:fibo-fbc-fct-mkt/MarketCategoryClassifier
              :owl/NamedIndividual
              {:owl/hasValue   :fibo-fbc-fct-mkt/ISO10383-ClassificationScheme,
               :owl/onProperty :cmns-dsg/isDefinedIn,
               :rdf/type       :owl/Restriction}
              {:owl/onProperty :cmns-cls/classifies,
               :owl/someValuesFrom
               {:owl/unionOf [:fibo-fbc-fct-mkt/CryptoAssetServicesProvider
                              :fibo-fbc-fct-mkt/DataReportingServicesProvider
                              :fibo-fbc-fct-mkt/Exchange
                              :fibo-fbc-fct-mkt/TradeReportingFacility],
                :rdf/type    :owl/Class},
               :rdf/type :owl/Restriction}
              :cmns-cls/Classifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfs/label "market category classifier - IDQS",
   :skos/definition
   "market category classifier for an interdealer quotation system"})

(def MarketCategoryClassifier-MLTF
  "market category classifier for a multilateral trading facility"
  {:cmns-av/adaptedFrom
   "https://www.iso20022.org/sites/default/files/2021-12/ISO10383_MIC_Release_2_0_Factsheet.pdf",
   :db/ident :fibo-fbc-fct-mkt/MarketCategoryClassifier-MLTF,
   :fibo-fnd-rel-rel/hasTag "MLTF",
   :rdf/type [:fibo-fbc-fct-mkt/MarketCategoryClassifier
              :owl/NamedIndividual
              {:owl/hasValue   :fibo-fbc-fct-mkt/ISO10383-ClassificationScheme,
               :owl/onProperty :cmns-dsg/isDefinedIn,
               :rdf/type       :owl/Restriction}
              {:owl/onProperty :cmns-cls/classifies,
               :owl/someValuesFrom
               {:owl/unionOf [:fibo-fbc-fct-mkt/CryptoAssetServicesProvider
                              :fibo-fbc-fct-mkt/DataReportingServicesProvider
                              :fibo-fbc-fct-mkt/Exchange
                              :fibo-fbc-fct-mkt/TradeReportingFacility],
                :rdf/type    :owl/Class},
               :rdf/type :owl/Restriction}
              :cmns-cls/Classifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfs/label "market category classifier - MLTF",
   :skos/definition
   "market category classifier for a multilateral trading facility"})

(def MarketCategoryClassifier-NSPD
  "market category classifier indicating that the market category has not been specified by the reporting party"
  {:cmns-av/adaptedFrom
   "https://www.iso20022.org/sites/default/files/2021-12/ISO10383_MIC_Release_2_0_Factsheet.pdf",
   :db/ident :fibo-fbc-fct-mkt/MarketCategoryClassifier-NSPD,
   :fibo-fnd-rel-rel/hasTag "NSPD",
   :rdf/type [:fibo-fbc-fct-mkt/MarketCategoryClassifier
              :owl/NamedIndividual
              {:owl/hasValue   :fibo-fbc-fct-mkt/ISO10383-ClassificationScheme,
               :owl/onProperty :cmns-dsg/isDefinedIn,
               :rdf/type       :owl/Restriction}
              {:owl/onProperty :cmns-cls/classifies,
               :owl/someValuesFrom
               {:owl/unionOf [:fibo-fbc-fct-mkt/CryptoAssetServicesProvider
                              :fibo-fbc-fct-mkt/DataReportingServicesProvider
                              :fibo-fbc-fct-mkt/Exchange
                              :fibo-fbc-fct-mkt/TradeReportingFacility],
                :rdf/type    :owl/Class},
               :rdf/type :owl/Restriction}
              :cmns-cls/Classifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfs/label "market category classifier - NSPD",
   :skos/definition
   "market category classifier indicating that the market category has not been specified by the reporting party"})

(def MarketCategoryClassifier-OTFS
  "market category classifier for an organized trading facility"
  {:cmns-av/adaptedFrom
   "https://www.iso20022.org/sites/default/files/2021-12/ISO10383_MIC_Release_2_0_Factsheet.pdf",
   :db/ident :fibo-fbc-fct-mkt/MarketCategoryClassifier-OTFS,
   :fibo-fnd-rel-rel/hasTag "OTFS",
   :rdf/type [:fibo-fbc-fct-mkt/MarketCategoryClassifier
              :owl/NamedIndividual
              {:owl/hasValue   :fibo-fbc-fct-mkt/ISO10383-ClassificationScheme,
               :owl/onProperty :cmns-dsg/isDefinedIn,
               :rdf/type       :owl/Restriction}
              {:owl/onProperty :cmns-cls/classifies,
               :owl/someValuesFrom
               {:owl/unionOf [:fibo-fbc-fct-mkt/CryptoAssetServicesProvider
                              :fibo-fbc-fct-mkt/DataReportingServicesProvider
                              :fibo-fbc-fct-mkt/Exchange
                              :fibo-fbc-fct-mkt/TradeReportingFacility],
                :rdf/type    :owl/Class},
               :rdf/type :owl/Restriction}
              :cmns-cls/Classifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfs/label "market category classifier - OTFS",
   :skos/definition
   "market category classifier for an organized trading facility"})

(def MarketCategoryClassifier-OTHR
  "market category classifier indicating that the reporting party believes that the market classifier is something other than any of the given market categories"
  {:cmns-av/adaptedFrom
   "https://www.iso20022.org/sites/default/files/2021-12/ISO10383_MIC_Release_2_0_Factsheet.pdf",
   :db/ident :fibo-fbc-fct-mkt/MarketCategoryClassifier-OTHR,
   :fibo-fnd-rel-rel/hasTag "OTHR",
   :rdf/type [:fibo-fbc-fct-mkt/MarketCategoryClassifier
              :owl/NamedIndividual
              {:owl/hasValue   :fibo-fbc-fct-mkt/ISO10383-ClassificationScheme,
               :owl/onProperty :cmns-dsg/isDefinedIn,
               :rdf/type       :owl/Restriction}
              {:owl/onProperty :cmns-cls/classifies,
               :owl/someValuesFrom
               {:owl/unionOf [:fibo-fbc-fct-mkt/CryptoAssetServicesProvider
                              :fibo-fbc-fct-mkt/DataReportingServicesProvider
                              :fibo-fbc-fct-mkt/Exchange
                              :fibo-fbc-fct-mkt/TradeReportingFacility],
                :rdf/type    :owl/Class},
               :rdf/type :owl/Restriction}
              :cmns-cls/Classifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfs/label "market category classifier - OTHR",
   :skos/definition
   "market category classifier indicating that the reporting party believes that the market classifier is something other than any of the given market categories"})

(def MarketCategoryClassifier-RMKT
  "market category classifier for a regulated market"
  {:cmns-av/adaptedFrom
   "https://www.iso20022.org/sites/default/files/2021-12/ISO10383_MIC_Release_2_0_Factsheet.pdf",
   :db/ident :fibo-fbc-fct-mkt/MarketCategoryClassifier-RMKT,
   :fibo-fnd-rel-rel/hasTag "RMKT",
   :rdf/type [:fibo-fbc-fct-mkt/MarketCategoryClassifier
              :owl/NamedIndividual
              {:owl/hasValue   :fibo-fbc-fct-mkt/ISO10383-ClassificationScheme,
               :owl/onProperty :cmns-dsg/isDefinedIn,
               :rdf/type       :owl/Restriction}
              {:owl/onProperty :cmns-cls/classifies,
               :owl/someValuesFrom
               {:owl/unionOf [:fibo-fbc-fct-mkt/CryptoAssetServicesProvider
                              :fibo-fbc-fct-mkt/DataReportingServicesProvider
                              :fibo-fbc-fct-mkt/Exchange
                              :fibo-fbc-fct-mkt/TradeReportingFacility],
                :rdf/type    :owl/Class},
               :rdf/type :owl/Restriction}
              :cmns-cls/Classifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfs/label "market category classifier - RMKT",
   :skos/definition "market category classifier for a regulated market"})

(def MarketCategoryClassifier-RMOS
  "market category classifier for a recognized market operator"
  {:cmns-av/adaptedFrom
   "https://www.iso20022.org/sites/default/files/2021-12/ISO10383_MIC_Release_2_0_Factsheet.pdf",
   :db/ident :fibo-fbc-fct-mkt/MarketCategoryClassifier-RMOS,
   :fibo-fnd-rel-rel/hasTag "RMOS",
   :rdf/type [:fibo-fbc-fct-mkt/MarketCategoryClassifier
              :owl/NamedIndividual
              {:owl/hasValue   :fibo-fbc-fct-mkt/ISO10383-ClassificationScheme,
               :owl/onProperty :cmns-dsg/isDefinedIn,
               :rdf/type       :owl/Restriction}
              {:owl/onProperty :cmns-cls/classifies,
               :owl/someValuesFrom
               {:owl/unionOf [:fibo-fbc-fct-mkt/CryptoAssetServicesProvider
                              :fibo-fbc-fct-mkt/DataReportingServicesProvider
                              :fibo-fbc-fct-mkt/Exchange
                              :fibo-fbc-fct-mkt/TradeReportingFacility],
                :rdf/type    :owl/Class},
               :rdf/type :owl/Restriction}
              :cmns-cls/Classifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfs/label "market category classifier - RMOS",
   :skos/definition
   "market category classifier for a recognized market operator"})

(def MarketCategoryClassifier-SEFS
  "market category classifier for a swap execution facility"
  {:cmns-av/adaptedFrom
   "https://www.iso20022.org/sites/default/files/2021-12/ISO10383_MIC_Release_2_0_Factsheet.pdf",
   :db/ident :fibo-fbc-fct-mkt/MarketCategoryClassifier-SEFS,
   :fibo-fnd-rel-rel/hasTag "SEFS",
   :rdf/type [:fibo-fbc-fct-mkt/MarketCategoryClassifier
              :owl/NamedIndividual
              {:owl/hasValue   :fibo-fbc-fct-mkt/ISO10383-ClassificationScheme,
               :owl/onProperty :cmns-dsg/isDefinedIn,
               :rdf/type       :owl/Restriction}
              {:owl/onProperty :cmns-cls/classifies,
               :owl/someValuesFrom
               {:owl/unionOf [:fibo-fbc-fct-mkt/CryptoAssetServicesProvider
                              :fibo-fbc-fct-mkt/DataReportingServicesProvider
                              :fibo-fbc-fct-mkt/Exchange
                              :fibo-fbc-fct-mkt/TradeReportingFacility],
                :rdf/type    :owl/Class},
               :rdf/type :owl/Restriction}
              :cmns-cls/Classifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfs/label "market category classifier - SEFS",
   :skos/definition "market category classifier for a swap execution facility"})

(def MarketCategoryClassifier-SINT
  "market category classifier for a systematic internalizer"
  {:cmns-av/adaptedFrom
   "https://www.iso20022.org/sites/default/files/2021-12/ISO10383_MIC_Release_2_0_Factsheet.pdf",
   :db/ident :fibo-fbc-fct-mkt/MarketCategoryClassifier-SINT,
   :fibo-fnd-rel-rel/hasTag "SINT",
   :rdf/type [:fibo-fbc-fct-mkt/MarketCategoryClassifier
              :owl/NamedIndividual
              {:owl/hasValue   :fibo-fbc-fct-mkt/ISO10383-ClassificationScheme,
               :owl/onProperty :cmns-dsg/isDefinedIn,
               :rdf/type       :owl/Restriction}
              {:owl/onProperty :cmns-cls/classifies,
               :owl/someValuesFrom
               {:owl/unionOf [:fibo-fbc-fct-mkt/CryptoAssetServicesProvider
                              :fibo-fbc-fct-mkt/DataReportingServicesProvider
                              :fibo-fbc-fct-mkt/Exchange
                              :fibo-fbc-fct-mkt/TradeReportingFacility],
                :rdf/type    :owl/Class},
               :rdf/type :owl/Restriction}
              :cmns-cls/Classifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfs/label "market category classifier - SINT",
   :skos/definition "market category classifier for a systematic internalizer"})

(def MarketCategoryClassifier-TRFS
  "market category classifier for a trade reporting facility"
  {:cmns-av/adaptedFrom
   "https://www.iso20022.org/sites/default/files/2021-12/ISO10383_MIC_Release_2_0_Factsheet.pdf",
   :db/ident :fibo-fbc-fct-mkt/MarketCategoryClassifier-TRFS,
   :fibo-fnd-rel-rel/hasTag "TRFS",
   :rdf/type [:fibo-fbc-fct-mkt/MarketCategoryClassifier
              :owl/NamedIndividual
              {:owl/hasValue   :fibo-fbc-fct-mkt/ISO10383-ClassificationScheme,
               :owl/onProperty :cmns-dsg/isDefinedIn,
               :rdf/type       :owl/Restriction}
              {:owl/onProperty :cmns-cls/classifies,
               :owl/someValuesFrom
               {:owl/unionOf [:fibo-fbc-fct-mkt/CryptoAssetServicesProvider
                              :fibo-fbc-fct-mkt/DataReportingServicesProvider
                              :fibo-fbc-fct-mkt/Exchange
                              :fibo-fbc-fct-mkt/TradeReportingFacility],
                :rdf/type    :owl/Class},
               :rdf/type :owl/Restriction}
              :cmns-cls/Classifier],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfs/label "market category classifier - TRFS",
   :skos/definition
   "market category classifier for a trade reporting facility"})

(def MarketIdentifier
  "identifier that specifies a universal method of identifying exchanges, trading platforms, regulated or non-regulated markets, and data reporting services providers as sources of prices and related information in order to facilitate automated processing"
  {:cmns-av/abbreviation "MIC",
   :cmns-av/adaptedFrom
   ["ISO 10383, Securities and related financial instruments - Codes for exchanges and market identification (MIC), Third edition, 2012-10-01"
    "https://www.iso20022.org/sites/default/files/2021-12/ISO10383_MIC_Release_2_0_Factsheet.pdf"
    "https://www.iso20022.org/market-identifier-codes"],
   :cmns-av/explanatoryNote
   "It is intended for use in any application and communication for identification of places\n- where a financial instrument is listed (place of official listing),\n- where a related trade is executed (place of trade), and\n- where trade details are reported (trade reporting facility).",
   :cmns-av/synonym "Market Identifier Code",
   :db/ident :fibo-fbc-fct-mkt/MarketIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfs/label "market identifier",
   :rdfs/subClassOf [{:owl/onProperty :cmns-id/identifies,
                      :owl/someValuesFrom
                      {:owl/unionOf
                       [:fibo-fbc-fct-mkt/CryptoAssetServicesProvider
                        :fibo-fbc-fct-mkt/DataReportingServicesProvider
                        :fibo-fbc-fct-mkt/Exchange
                        :fibo-fbc-fct-mkt/TradeReportingFacility],
                       :rdf/type :owl/Class},
                      :rdf/type :owl/Restriction}
                     :cmns-id/Identifier],
   :skos/definition
   "identifier that specifies a universal method of identifying exchanges, trading platforms, regulated or non-regulated markets, and data reporting services providers as sources of prices and related information in order to facilitate automated processing"})

(def MarketIdentifierCodeStatus
  "lifecycle stage indicating the status of the MIC code, as specified by the registration authority"
  {:cmns-av/adaptedFrom "https://www.iso20022.org/market-identifier-codes",
   :db/ident :fibo-fbc-fct-mkt/MarketIdentifierCodeStatus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfs/label "market indicator code status",
   :rdfs/subClassOf :fibo-fnd-arr-lif/LifecycleStage,
   :skos/definition
   "lifecycle stage indicating the status of the MIC code, as specified by the registration authority"})

(def MarketLevelClassifier
  "classifier that indicates whether the exchange or data reporting services provider is an operating level or market segment level facility"
  {:cmns-av/adaptedFrom
   "https://www.iso20022.org/sites/default/files/2021-12/ISO10383_MIC_Release_2_0_Factsheet.pdf",
   :db/ident :fibo-fbc-fct-mkt/MarketLevelClassifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfs/label "market level classifier",
   :rdfs/subClassOf
   [{:owl/onProperty     :cmns-cls/classifies,
     :owl/someValuesFrom {:owl/unionOf
                          [:fibo-fbc-fct-mkt/CryptoAssetServicesProvider
                           :fibo-fbc-fct-mkt/DataReportingServicesProvider
                           :fibo-fbc-fct-mkt/Exchange
                           :fibo-fbc-fct-mkt/TradeReportingFacility],
                          :rdf/type :owl/Class},
     :rdf/type           :owl/Restriction}
    {:owl/hasValue   :fibo-fbc-fct-mkt/ISO10383-ClassificationScheme,
     :owl/onProperty :cmns-dsg/isDefinedIn,
     :rdf/type       :owl/Restriction}
    :cmns-cls/Classifier],
   :skos/definition
   "classifier that indicates whether the exchange or data reporting services provider is an operating level or market segment level facility"})

(def MarketLevelClassifier-OPRT
  "market-level classifier for an operating-level facility"
  {:cmns-av/adaptedFrom
   "https://www.iso20022.org/sites/default/files/2021-12/ISO10383_MIC_Release_2_0_Factsheet.pdf",
   :db/ident :fibo-fbc-fct-mkt/MarketLevelClassifier-OPRT,
   :fibo-fnd-rel-rel/hasTag "OPRT",
   :rdf/type [:fibo-fbc-fct-mkt/MarketLevelClassifier
              :owl/NamedIndividual
              :cmns-cls/Classifier
              {:owl/hasValue   :fibo-fbc-fct-mkt/ISO10383-ClassificationScheme,
               :owl/onProperty :cmns-dsg/isDefinedIn,
               :rdf/type       :owl/Restriction}
              {:owl/onProperty :cmns-cls/classifies,
               :owl/someValuesFrom
               {:owl/unionOf [:fibo-fbc-fct-mkt/CryptoAssetServicesProvider
                              :fibo-fbc-fct-mkt/DataReportingServicesProvider
                              :fibo-fbc-fct-mkt/Exchange
                              :fibo-fbc-fct-mkt/TradeReportingFacility],
                :rdf/type    :owl/Class},
               :rdf/type :owl/Restriction}],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfs/label "market-level classifier - OPRT",
   :skos/definition "market-level classifier for an operating-level facility"})

(def MarketLevelClassifier-SGMT
  "market-level classifier for a segment-level facility"
  {:cmns-av/adaptedFrom
   "https://www.iso20022.org/sites/default/files/2021-12/ISO10383_MIC_Release_2_0_Factsheet.pdf",
   :db/ident :fibo-fbc-fct-mkt/MarketLevelClassifier-SGMT,
   :fibo-fnd-rel-rel/hasTag "SGMT",
   :rdf/type [:fibo-fbc-fct-mkt/MarketLevelClassifier
              :owl/NamedIndividual
              :cmns-cls/Classifier
              {:owl/hasValue   :fibo-fbc-fct-mkt/ISO10383-ClassificationScheme,
               :owl/onProperty :cmns-dsg/isDefinedIn,
               :rdf/type       :owl/Restriction}
              {:owl/onProperty :cmns-cls/classifies,
               :owl/someValuesFrom
               {:owl/unionOf [:fibo-fbc-fct-mkt/CryptoAssetServicesProvider
                              :fibo-fbc-fct-mkt/DataReportingServicesProvider
                              :fibo-fbc-fct-mkt/Exchange
                              :fibo-fbc-fct-mkt/TradeReportingFacility],
                :rdf/type    :owl/Class},
               :rdf/type :owl/Restriction}],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfs/label "market-level classifier - SGMT",
   :skos/definition "market-level classifier for a segment-level facility"})

(def MarketSegmentLevelMarket
  "section of an exchange/market/trade reporting facility that specialises in one or more specific instruments or that is regulated differently"
  {:cmns-av/adaptedFrom
   ["ISO 10383, Securities and related financial instruments - Codes for exchanges and market identification (MIC), Third edition, 2012-10-01, confirmed 2018-03-29, clause 2.2"
    "https://www.iso20022.org/sites/default/files/2021-12/ISO10383_MIC_Release_2_0_Factsheet.pdf"],
   :db/ident :fibo-fbc-fct-mkt/MarketSegmentLevelMarket,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfs/label "market segment-level market",
   :rdfs/subClassOf
   [{:owl/onProperty     :cmns-col/isPartOf,
     :owl/someValuesFrom :fibo-fbc-fct-mkt/OperatingLevelMarket,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fct-mkt/Exchange
    {:owl/hasValue   :fibo-fbc-fct-mkt/MarketLevelClassifier-SGMT,
     :owl/onProperty :cmns-cls/isClassifiedBy,
     :rdf/type       :owl/Restriction}
    {:owl/onProperty     :fibo-fbc-fct-mkt/operatesInCountry,
     :owl/someValuesFrom :lcc-cr/Country,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :rdfs/Literal,
     :owl/onProperty  :fibo-fnd-rel-rel/hasFormalName,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :rdfs/Literal,
     :owl/onProperty  :fibo-fbc-fct-mkt/hasFacilityAcronym,
     :rdf/type        :owl/Restriction}
    :fibo-fnd-plc-fac/Facility
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-fpas/FinancialServiceProvider,
     :owl/onProperty :fibo-fnd-rel-rel/isManagedBy,
     :rdf/type       :owl/Restriction}
    {:owl/onProperty     :fibo-fbc-fct-mkt/operatesInMunicipality,
     :owl/someValuesFrom :fibo-fnd-plc-loc/Municipality,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-fct-mkt/MarketIdentifier,
     :owl/onProperty :cmns-id/isIdentifiedBy,
     :rdf/type       :owl/Restriction}],
   :skos/definition
   "section of an exchange/market/trade reporting facility that specialises in one or more specific instruments or that is regulated differently",
   :skos/example "Dark pool",
   :skos/note
   ["It is not required to have a MIC registered for all segments of a market, only for those segments that need to be identified."
    "A market segment MIC can only be registered if an operating/exchange MIC already exists."]})

(def MarketSegmentLevelMarketIdentifier
  "market identifier that identifies a section of an exchange/market/trade reporting facility that specialises in one or more specific instruments or that is regulated differently"
  {:cmns-av/adaptedFrom
   ["https://www.iso20022.org/sites/default/files/2021-12/ISO10383_MIC_Release_2_0_Factsheet.pdf"
    "ISO 10383, Securities and related financial instruments - Codes for exchanges and market identification (MIC), Third edition, 2012-10-01, confirmed 2018-03-29, clause 2.2"],
   :db/ident :fibo-fbc-fct-mkt/MarketSegmentLevelMarketIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfs/label "market segment-level market identifier",
   :rdfs/subClassOf [:fibo-fbc-fct-mkt/MarketIdentifier
                     {:owl/onProperty :cmns-id/identifies,
                      :owl/someValuesFrom
                      {:owl/unionOf
                       [:fibo-fbc-fct-mkt/CryptoAssetServicesProvider
                        :fibo-fbc-fct-mkt/DataReportingServicesProvider
                        :fibo-fbc-fct-mkt/Exchange
                        :fibo-fbc-fct-mkt/TradeReportingFacility],
                       :rdf/type :owl/Class},
                      :rdf/type :owl/Restriction}
                     :cmns-id/Identifier],
   :skos/definition
   "market identifier that identifies a section of an exchange/market/trade reporting facility that specialises in one or more specific instruments or that is regulated differently"})

(def ModifiedMICStatus
  {:db/ident :fibo-fbc-fct-mkt/ModifiedMICStatus,
   :owl/deprecated true,
   :owl/sameAs :fibo-fbc-fct-mkt/UpdatedMICStatus,
   :rdf/type :owl/NamedIndividual,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/"})

(def MultilateralTradingFacility
  "trading system that facilitates the exchange of financial instruments between multiple parties"
  {:cmns-av/abbreviation "MTF",
   :cmns-av/adaptedFrom
   ["https://www.iso20022.org/sites/default/files/2021-12/ISO10383_MIC_Release_2_0_Factsheet.pdf"
    "http://www.investopedia.com/terms/m/multilateral_trading_facility.asp"],
   :cmns-av/explanatoryNote
   "Multilateral trading facilities allow eligible contract participants to gather and transfer a variety of securities, especially instruments that may not have an official market. These facilities are often electronic systems controlled by approved market operators or larger investment banks. Traders will usually submit orders electronically, where a matching software engine is used to pair buyers with sellers.",
   :db/ident :fibo-fbc-fct-mkt/MultilateralTradingFacility,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfs/label "multilateral trading facility",
   :rdfs/subClassOf
   [{:owl/hasValue   :fibo-fbc-fct-mkt/MarketCategoryClassifier-MLTF,
     :owl/onProperty :cmns-cls/isClassifiedBy,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fct-mkt/AlternativeTradingSystem
    {:owl/onProperty     :fibo-fbc-fct-mkt/operatesInCountry,
     :owl/someValuesFrom :lcc-cr/Country,
     :rdf/type           :owl/Restriction}
    {:owl/hasValue   :fibo-fbc-fct-mkt/MarketCategoryClassifier-ATSS,
     :owl/onProperty :cmns-cls/isClassifiedBy,
     :rdf/type       :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :rdfs/Literal,
     :owl/onProperty  :fibo-fnd-rel-rel/hasFormalName,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :rdfs/Literal,
     :owl/onProperty  :fibo-fbc-fct-mkt/hasFacilityAcronym,
     :rdf/type        :owl/Restriction}
    :fibo-fnd-plc-fac/Facility
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-fpas/FinancialServiceProvider,
     :owl/onProperty :fibo-fnd-rel-rel/isManagedBy,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fct-mkt/Exchange
    {:owl/onProperty     :fibo-fbc-fct-mkt/operatesInMunicipality,
     :owl/someValuesFrom :fibo-fnd-plc-loc/Municipality,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-fct-mkt/MarketIdentifier,
     :owl/onProperty :cmns-id/isIdentifiedBy,
     :rdf/type       :owl/Restriction}],
   :skos/definition
   "trading system that facilitates the exchange of financial instruments between multiple parties"})

(def OffMarketFacility
  "facility used for reporting over-the-counter (OTC) and other direct trades that are not executed by the exchange but are reported through the exchange"
  {:cmns-av/synonym ["off-facility" "off-book"],
   :db/ident :fibo-fbc-fct-mkt/OffMarketFacility,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfs/label "off-market facility",
   :rdfs/subClassOf [:fibo-fbc-fct-mkt/Exchange
                     {:owl/onProperty     :fibo-fbc-fct-mkt/operatesInCountry,
                      :owl/someValuesFrom :lcc-cr/Country,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :rdfs/Literal,
                      :owl/onProperty  :fibo-fnd-rel-rel/hasFormalName,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :rdfs/Literal,
                      :owl/onProperty  :fibo-fbc-fct-mkt/hasFacilityAcronym,
                      :rdf/type        :owl/Restriction}
                     :fibo-fnd-plc-fac/Facility
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass :fibo-fbc-pas-fpas/FinancialServiceProvider,
                      :owl/onProperty :fibo-fnd-rel-rel/isManagedBy,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty :fibo-fbc-fct-mkt/operatesInMunicipality,
                      :owl/someValuesFrom :fibo-fnd-plc-loc/Municipality,
                      :rdf/type :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fbc-fct-mkt/MarketIdentifier,
                      :owl/onProperty :cmns-id/isIdentifiedBy,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "facility used for reporting over-the-counter (OTC) and other direct trades that are not executed by the exchange but are reported through the exchange"})

(def OperatingLevelMarket
  "exchange/market/trade reporting facility in a specific market/country"
  {:cmns-av/adaptedFrom
   ["https://www.iso20022.org/sites/default/files/2021-12/ISO10383_MIC_Release_2_0_Factsheet.pdf"
    "ISO 10383, Securities and related financial instruments - Codes for exchanges and market identification (MIC), Third edition, 2012-10-01, confirmed 2018-03-29, clause 2.1"],
   :db/ident :fibo-fbc-fct-mkt/OperatingLevelMarket,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfs/label "operating-level market",
   :rdfs/subClassOf
   [{:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-fct-mkt/OperatingLevelMarketIdentifier,
     :owl/onProperty :cmns-id/isIdentifiedBy,
     :rdf/type       :owl/Restriction}
    {:owl/hasValue   :fibo-fbc-fct-mkt/MarketLevelClassifier-OPRT,
     :owl/onProperty :cmns-cls/isClassifiedBy,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fct-mkt/Exchange
    {:owl/onProperty     :fibo-fbc-fct-mkt/operatesInCountry,
     :owl/someValuesFrom :lcc-cr/Country,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :rdfs/Literal,
     :owl/onProperty  :fibo-fnd-rel-rel/hasFormalName,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :rdfs/Literal,
     :owl/onProperty  :fibo-fbc-fct-mkt/hasFacilityAcronym,
     :rdf/type        :owl/Restriction}
    :fibo-fnd-plc-fac/Facility
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-fpas/FinancialServiceProvider,
     :owl/onProperty :fibo-fnd-rel-rel/isManagedBy,
     :rdf/type       :owl/Restriction}
    {:owl/onProperty     :fibo-fbc-fct-mkt/operatesInMunicipality,
     :owl/someValuesFrom :fibo-fnd-plc-loc/Municipality,
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-fct-mkt/MarketIdentifier,
     :owl/onProperty :cmns-id/isIdentifiedBy,
     :rdf/type       :owl/Restriction}],
   :skos/definition
   "exchange/market/trade reporting facility in a specific market/country"})

(def OperatingLevelMarketIdentifier
  "market identifier that identifies an exchange/market/trade reporting facility in a specific market/country"
  {:cmns-av/adaptedFrom
   ["https://www.iso20022.org/sites/default/files/2021-12/ISO10383_MIC_Release_2_0_Factsheet.pdf"
    "ISO 10383, Securities and related financial instruments - Codes for exchanges and market identification (MIC), Third edition, 2012-10-01, confirmed 2018-03-29, clause 2.1"],
   :db/ident :fibo-fbc-fct-mkt/OperatingLevelMarketIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfs/label "operating-level market identifier",
   :rdfs/subClassOf [:fibo-fbc-fct-mkt/MarketIdentifier
                     {:owl/onProperty :cmns-id/identifies,
                      :owl/someValuesFrom
                      {:owl/unionOf
                       [:fibo-fbc-fct-mkt/CryptoAssetServicesProvider
                        :fibo-fbc-fct-mkt/DataReportingServicesProvider
                        :fibo-fbc-fct-mkt/Exchange
                        :fibo-fbc-fct-mkt/TradeReportingFacility],
                       :rdf/type :owl/Class},
                      :rdf/type :owl/Restriction}
                     :cmns-id/Identifier],
   :skos/definition
   "market identifier that identifies an exchange/market/trade reporting facility in a specific market/country"})

(def OrganizedTradingFacility
  "multi-lateral system which is not an RM or an MTF and in which multiple third-party buying and selling interests in bonds, structured finance products, emission allowances or derivatives are able to interact in the system in a way that results in a contract in accordance with the provisions of Title II of MiFID II"
  {:cmns-av/abbreviation "OTF",
   :cmns-av/adaptedFrom
   ["http://www.marketswiki.com/mwiki/Organized_Trading_Facility"
    "https://www.iso20022.org/sites/default/files/2021-12/ISO10383_MIC_Release_2_0_Factsheet.pdf"],
   :cmns-av/explanatoryNote
   ["Unlike RMs and MTFs, operators of OTFs will have discretion as to how to execute orders, subject to pre-transparency and best execution obligations."
    "OTFs were introduced by the European Commission as part of MiFID II and are focused on non-equities such as derivatives and cash bond markets.\n\nOTFs are intended to be similar in scope to a swap execution facility (SEF), a type of entity created by the Dodd-Frank Act in the U.S. The goal of SEFs and OTFs is to bring transparency and structure to OTC derivatives trading."],
   :db/ident :fibo-fbc-fct-mkt/OrganizedTradingFacility,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfs/label [#voc/lstr "organised trading facility@en-GB"
                #voc/lstr "organized trading facility@en-US"],
   :rdfs/seeAlso
   ["https://www.financierworldwide.com/organised-trading-facilities-how-they-differ-from-mtfs"],
   :rdfs/subClassOf
   [:fibo-fbc-fct-mkt/AlternativeTradingSystem
    {:owl/onProperty     :fibo-fnd-rel-rel/isGovernedBy,
     :owl/someValuesFrom :fibo-fnd-law-jur/Jurisdiction,
     :rdf/type           :owl/Restriction}
    {:owl/hasValue   :fibo-fbc-fct-mkt/MarketCategoryClassifier-OTFS,
     :owl/onProperty :cmns-cls/isClassifiedBy,
     :rdf/type       :owl/Restriction}
    {:owl/allValuesFrom :fibo-fbc-pas-fpas/FinancialServiceProvider,
     :owl/onProperty    :fibo-fnd-rel-rel/isManagedBy,
     :rdf/type          :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :rdfs/Literal,
     :owl/onProperty  :fibo-fnd-rel-rel/hasFormalName,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :rdfs/Literal,
     :owl/onProperty  :fibo-fbc-fct-mkt/hasFacilityAcronym,
     :rdf/type        :owl/Restriction}
    :fibo-fbc-fct-mkt/Exchange
    {:owl/onProperty     :fibo-fbc-fct-mkt/operatesInMunicipality,
     :owl/someValuesFrom :fibo-fnd-plc-loc/Municipality,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fbc-fct-mkt/operatesInCountry,
     :owl/someValuesFrom :lcc-cr/Country,
     :rdf/type           :owl/Restriction}
    {:owl/hasValue   :fibo-fbc-fct-mkt/MarketCategoryClassifier-ATSS,
     :owl/onProperty :cmns-cls/isClassifiedBy,
     :rdf/type       :owl/Restriction}
    :fibo-fnd-plc-fac/Facility
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-fpas/FinancialServiceProvider,
     :owl/onProperty :fibo-fnd-rel-rel/isManagedBy,
     :rdf/type       :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-fct-mkt/MarketIdentifier,
     :owl/onProperty :cmns-id/isIdentifiedBy,
     :rdf/type       :owl/Restriction}],
   :skos/definition
   "multi-lateral system which is not an RM or an MTF and in which multiple third-party buying and selling interests in bonds, structured finance products, emission allowances or derivatives are able to interact in the system in a way that results in a contract in accordance with the provisions of Title II of MiFID II"})

(def QuoteDrivenMarket
  "exchange in which prices are determined from bid and ask quotations made by market makers, dealers, or specialists"
  {:cmns-av/explanatoryNote
   "In a quote-driven market, dealers fill orders from their own inventory or by matching them with other orders. Note that this differs from a typical market, which is order-driven rather than quote-driven.",
   :cmns-av/synonym "price-driven market",
   :db/ident :fibo-fbc-fct-mkt/QuoteDrivenMarket,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfs/label "quote-driven market",
   :rdfs/subClassOf [:fibo-fbc-fct-mkt/Exchange
                     {:owl/onProperty     :fibo-fbc-fct-mkt/operatesInCountry,
                      :owl/someValuesFrom :lcc-cr/Country,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :rdfs/Literal,
                      :owl/onProperty  :fibo-fnd-rel-rel/hasFormalName,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :rdfs/Literal,
                      :owl/onProperty  :fibo-fbc-fct-mkt/hasFacilityAcronym,
                      :rdf/type        :owl/Restriction}
                     :fibo-fnd-plc-fac/Facility
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass :fibo-fbc-pas-fpas/FinancialServiceProvider,
                      :owl/onProperty :fibo-fnd-rel-rel/isManagedBy,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty :fibo-fbc-fct-mkt/operatesInMunicipality,
                      :owl/someValuesFrom :fibo-fnd-plc-loc/Municipality,
                      :rdf/type :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fbc-fct-mkt/MarketIdentifier,
                      :owl/onProperty :cmns-id/isIdentifiedBy,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "exchange in which prices are determined from bid and ask quotations made by market makers, dealers, or specialists"})

(def RecognizedMarketOperator
  "exchange that is operated or maintained by an operator registered under certain securities regulations that brings together purchasers and sellers of capital market products"
  {:cmns-av/abbreviation "RMO",
   :cmns-av/adaptedFrom
   ["https://www.mas.gov.sg/regulation/capital-markets/approved-exchange-ae-or-recognised-market-operator-rmo-licence"
    "https://www.lawinsider.com/dictionary/recognized-market"
    "https://www.igi-global.com/dictionary/regulating-fintech-businesses/77383"
    "https://www.iso20022.org/sites/default/files/2021-12/ISO10383_MIC_Release_2_0_Factsheet.pdf"],
   :db/ident :fibo-fbc-fct-mkt/RecognizedMarketOperator,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfs/label [#voc/lstr "recognised market operator@en-GB"
                #voc/lstr "recognized market operator@en-US"],
   :rdfs/subClassOf [{:owl/hasValue
                      :fibo-fbc-fct-mkt/MarketCategoryClassifier-RMOS,
                      :owl/onProperty :cmns-cls/isClassifiedBy,
                      :rdf/type :owl/Restriction}
                     :fibo-fbc-fct-mkt/Exchange
                     {:owl/onProperty     :fibo-fbc-fct-mkt/operatesInCountry,
                      :owl/someValuesFrom :lcc-cr/Country,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :rdfs/Literal,
                      :owl/onProperty  :fibo-fnd-rel-rel/hasFormalName,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :rdfs/Literal,
                      :owl/onProperty  :fibo-fbc-fct-mkt/hasFacilityAcronym,
                      :rdf/type        :owl/Restriction}
                     :fibo-fnd-plc-fac/Facility
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass :fibo-fbc-pas-fpas/FinancialServiceProvider,
                      :owl/onProperty :fibo-fnd-rel-rel/isManagedBy,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty :fibo-fbc-fct-mkt/operatesInMunicipality,
                      :owl/someValuesFrom :fibo-fnd-plc-loc/Municipality,
                      :rdf/type :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fbc-fct-mkt/MarketIdentifier,
                      :owl/onProperty :cmns-id/isIdentifiedBy,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "exchange that is operated or maintained by an operator registered under certain securities regulations that brings together purchasers and sellers of capital market products"})

(def RegisteredMultilateralTradingFacility
  "multilateral system operated by an investment firm or market operator, which brings together multiple third-party buying and selling interests in financial instruments in the system, in accordance with non-discretionary rules, in a way that results in a contract in accordance with the provisions of Title II of the MiFID II"
  {:db/ident :fibo-fbc-fct-mkt/RegisteredMultilateralTradingFacility,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfs/label "registered multilateral trading facility",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-rel-rel/isManagedBy,
     :owl/someValuesFrom :fibo-fbc-pas-fpas/FinancialServiceProvider,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-rel-rel/isGovernedBy,
     :owl/someValuesFrom :fibo-fnd-law-jur/Jurisdiction,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fbc-fct-ra/isRegisteredBy,
     :owl/someValuesFrom :fibo-fbc-fct-ra/RegistrationAuthority,
     :rdf/type           :owl/Restriction}
    :fibo-fbc-fct-mkt/MultilateralTradingFacility
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :rdfs/Literal,
     :owl/onProperty  :fibo-fnd-rel-rel/hasFormalName,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onDataRange :rdfs/Literal,
     :owl/onProperty  :fibo-fbc-fct-mkt/hasFacilityAcronym,
     :rdf/type        :owl/Restriction}
    :fibo-fbc-fct-mkt/Exchange
    {:owl/onProperty     :fibo-fbc-fct-mkt/operatesInMunicipality,
     :owl/someValuesFrom :fibo-fnd-plc-loc/Municipality,
     :rdf/type           :owl/Restriction}
    {:owl/hasValue   :fibo-fbc-fct-mkt/MarketCategoryClassifier-MLTF,
     :owl/onProperty :cmns-cls/isClassifiedBy,
     :rdf/type       :owl/Restriction}
    {:owl/onProperty     :fibo-fbc-fct-mkt/operatesInCountry,
     :owl/someValuesFrom :lcc-cr/Country,
     :rdf/type           :owl/Restriction}
    {:owl/hasValue   :fibo-fbc-fct-mkt/MarketCategoryClassifier-ATSS,
     :owl/onProperty :cmns-cls/isClassifiedBy,
     :rdf/type       :owl/Restriction}
    :fibo-fnd-plc-fac/Facility
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-fpas/FinancialServiceProvider,
     :owl/onProperty :fibo-fnd-rel-rel/isManagedBy,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fct-mkt/AlternativeTradingSystem
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-fct-mkt/MarketIdentifier,
     :owl/onProperty :cmns-id/isIdentifiedBy,
     :rdf/type       :owl/Restriction}],
   :skos/definition
   "multilateral system operated by an investment firm or market operator, which brings together multiple third-party buying and selling interests in financial instruments in the system, in accordance with non-discretionary rules, in a way that results in a contract in accordance with the provisions of Title II of the MiFID II"})

(def RegulatedExchange
  "regulated market that is operated by and/or managed by a market operator that brings together or facilitates the bringing together of multiple third-party buying and selling interests in financial instruments"
  {:cmns-av/abbreviation "RM",
   :cmns-av/adaptedFrom
   ["https://www.iso20022.org/sites/default/files/2021-12/ISO10383_MIC_Release_2_0_Factsheet.pdf"
    "http://www.investopedia.com/terms/r/regulated-market.asp"],
   :cmns-av/explanatoryNote
   "In the financial community in the EU, such an exchange operates in accordance with its non-discretionary rules in a way that results in a contract, in respect of the financial instruments admitted to trading under its rules and/or systems, and which is authorised and functions regularly and in accordance with the provisions of Title III of MiFID II.",
   :cmns-av/synonym "regulated market",
   :db/ident :fibo-fbc-fct-mkt/RegulatedExchange,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfs/label "regulated exchange",
   :rdfs/subClassOf [:fibo-fbc-fct-mkt/Exchange
                     {:owl/onProperty     :fibo-fbc-fct-rga/isRegulatedBy,
                      :owl/someValuesFrom :fibo-fbc-fct-rga/RegulatoryAgency,
                      :rdf/type           :owl/Restriction}
                     {:owl/hasValue
                      :fibo-fbc-fct-mkt/MarketCategoryClassifier-RMKT,
                      :owl/onProperty :cmns-cls/isClassifiedBy,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-rel-rel/isGovernedBy,
                      :owl/someValuesFrom :fibo-fnd-law-jur/Jurisdiction,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fbc-fct-mkt/operatesInCountry,
                      :owl/someValuesFrom :lcc-cr/Country,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :rdfs/Literal,
                      :owl/onProperty  :fibo-fnd-rel-rel/hasFormalName,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :rdfs/Literal,
                      :owl/onProperty  :fibo-fbc-fct-mkt/hasFacilityAcronym,
                      :rdf/type        :owl/Restriction}
                     :fibo-fnd-plc-fac/Facility
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass :fibo-fbc-pas-fpas/FinancialServiceProvider,
                      :owl/onProperty :fibo-fnd-rel-rel/isManagedBy,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty :fibo-fbc-fct-mkt/operatesInMunicipality,
                      :owl/someValuesFrom :fibo-fnd-plc-loc/Municipality,
                      :rdf/type :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fbc-fct-mkt/MarketIdentifier,
                      :owl/onProperty :cmns-id/isIdentifiedBy,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "regulated market that is operated by and/or managed by a market operator that brings together or facilitates the bringing together of multiple third-party buying and selling interests in financial instruments"})

(def SwapExecutionFacility
  "exchange that enables participants to execute and trade swaps"
  {:cmns-av/abbreviation "SEF",
   :cmns-av/adaptedFrom
   "https://www.iso20022.org/sites/default/files/2021-12/ISO10383_MIC_Release_2_0_Factsheet.pdf",
   :cmns-av/explanatoryNote
   "Swap execution facilities, including trading systems and other platforms, allow for greater transparency and represent a significant shift in the way derivative trading has been done. The Dodd-Frank Act lays the foundation for this change of derivative execution.",
   :db/ident :fibo-fbc-fct-mkt/SwapExecutionFacility,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfs/label "swap execution facility",
   :rdfs/subClassOf [{:owl/hasValue
                      :fibo-fbc-fct-mkt/MarketCategoryClassifier-SEFS,
                      :owl/onProperty :cmns-cls/isClassifiedBy,
                      :rdf/type :owl/Restriction}
                     :fibo-fbc-fct-mkt/Exchange
                     {:owl/onProperty     :fibo-fbc-fct-mkt/operatesInCountry,
                      :owl/someValuesFrom :lcc-cr/Country,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :rdfs/Literal,
                      :owl/onProperty  :fibo-fnd-rel-rel/hasFormalName,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :rdfs/Literal,
                      :owl/onProperty  :fibo-fbc-fct-mkt/hasFacilityAcronym,
                      :rdf/type        :owl/Restriction}
                     :fibo-fnd-plc-fac/Facility
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass :fibo-fbc-pas-fpas/FinancialServiceProvider,
                      :owl/onProperty :fibo-fnd-rel-rel/isManagedBy,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty :fibo-fbc-fct-mkt/operatesInMunicipality,
                      :owl/someValuesFrom :fibo-fnd-plc-loc/Municipality,
                      :rdf/type :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fbc-fct-mkt/MarketIdentifier,
                      :owl/onProperty :cmns-id/isIdentifiedBy,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "exchange that enables participants to execute and trade swaps"})

(def SystematicInternaliser
  "investment firm that, on an organised, frequent, systematic and substantial basis, deals on its own account by executing client orders outside a regulated exchange, MTF or OTF without operating a multilateral system"
  {:cmns-av/abbreviation "SI",
   :cmns-av/adaptedFrom
   ["https://www.emissions-euets.com/systematic-internaliser"
    "https://www.iso20022.org/sites/default/files/2021-12/ISO10383_MIC_Release_2_0_Factsheet.pdf"],
   :db/ident :fibo-fbc-fct-mkt/SystematicInternaliser,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfs/label [#voc/lstr "systematic internaliser@en-GB"
                #voc/lstr "systematic internalizer@en-US"],
   :rdfs/subClassOf [:fibo-fbc-fct-mkt/Exchange
                     {:owl/hasValue
                      :fibo-fbc-fct-mkt/MarketCategoryClassifier-SINT,
                      :owl/onProperty :cmns-cls/isClassifiedBy,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-fbc-fct-mkt/operatesInCountry,
                      :owl/someValuesFrom :lcc-cr/Country,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :rdfs/Literal,
                      :owl/onProperty  :fibo-fnd-rel-rel/hasFormalName,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :rdfs/Literal,
                      :owl/onProperty  :fibo-fbc-fct-mkt/hasFacilityAcronym,
                      :rdf/type        :owl/Restriction}
                     :fibo-fnd-plc-fac/Facility
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass :fibo-fbc-pas-fpas/FinancialServiceProvider,
                      :owl/onProperty :fibo-fnd-rel-rel/isManagedBy,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty :fibo-fbc-fct-mkt/operatesInMunicipality,
                      :owl/someValuesFrom :fibo-fnd-plc-loc/Municipality,
                      :rdf/type :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fbc-fct-mkt/MarketIdentifier,
                      :owl/onProperty :cmns-id/isIdentifiedBy,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "investment firm that, on an organised, frequent, systematic and substantial basis, deals on its own account by executing client orders outside a regulated exchange, MTF or OTF without operating a multilateral system"})

(def TradeReportingFacility
  "facility that provides a mechanism for the reporting of transactions effected otherwise than on an exchange"
  {:cmns-av/abbreviation "TRF",
   :cmns-av/adaptedFrom
   ["https://www.finra.org/filing-reporting/trade-reporting-facility-trf"
    "https://www.iso20022.org/sites/default/files/2021-12/ISO10383_MIC_Release_2_0_Factsheet.pdf"],
   :db/ident :fibo-fbc-fct-mkt/TradeReportingFacility,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfs/label "trade reporting facility",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass :fibo-fbc-pas-fpas/FinancialServiceProvider,
                      :owl/onProperty :fibo-fnd-rel-rel/isManagedBy,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty :fibo-fbc-fct-mkt/operatesInMunicipality,
                      :owl/someValuesFrom :fibo-fnd-plc-loc/Municipality,
                      :rdf/type :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fbc-fct-mkt/MarketIdentifier,
                      :owl/onProperty :cmns-id/isIdentifiedBy,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :rdfs/Literal,
                      :owl/onProperty  :fibo-fnd-rel-rel/hasFormalName,
                      :rdf/type        :owl/Restriction}
                     {:owl/hasValue
                      :fibo-fbc-fct-mkt/MarketCategoryClassifier-TRFS,
                      :owl/onProperty :cmns-cls/isClassifiedBy,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-plc-fac/Facility
                     {:owl/onProperty     :fibo-fbc-fct-mkt/operatesInCountry,
                      :owl/someValuesFrom :lcc-cr/Country,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :rdfs/Literal,
                      :owl/onProperty  :fibo-fbc-fct-mkt/hasFacilityAcronym,
                      :rdf/type        :owl/Restriction}],
   :skos/definition
   "facility that provides a mechanism for the reporting of transactions effected otherwise than on an exchange",
   :skos/example
   "In the United States, for example, trades by FINRA members in Nasdaq-listed and other exchange-listed securities, as approved by the Securities and Exchange Commission (SEC), executed otherwise than on an exchange may be reported to a FINRA TRF. While each FINRA TRF is affiliated with a registered national securities exchange, each FINRA TRF is a FINRA facility and is subject to FINRA's registration as a national securities association."})

(def UpdatedMICStatus
  "as of the last report or update, the exchange code was revised"
  {:cmns-av/adaptedFrom
   ["https://www.iso20022.org/sites/default/files/2021-12/ISO10383_MIC_Release_2_0_Factsheet.pdf"
    "ISO 10383, Securities and related financial instruments - Codes for exchanges and market identification (MIC), Third edition, version 2.0"],
   :db/ident :fibo-fbc-fct-mkt/UpdatedMICStatus,
   :fibo-fnd-rel-rel/hasTag "UPDATED",
   :rdf/type [:fibo-fbc-fct-mkt/MarketIdentifierCodeStatus
              :owl/NamedIndividual
              :fibo-fnd-arr-lif/LifecycleStage],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfs/label "updated MIC status",
   :skos/definition
   "as of the last report or update, the exchange code was revised"})

(def hasExchangeAcronym
  {:db/ident :fibo-fbc-fct-mkt/hasExchangeAcronym,
   :owl/deprecated true,
   :owl/equivalentProperty :fibo-fbc-fct-mkt/hasFacilityAcronym,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/"})

(def hasExchangeName
  {:db/ident :fibo-fbc-fct-mkt/hasExchangeName,
   :owl/deprecated true,
   :owl/equivalentProperty :fibo-fnd-rel-rel/hasFormalName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/"})

(def hasFacilityAcronym
  "indicates a known acronym of the market"
  {:cmns-av/adaptedFrom
   "https://www.iso20022.org/sites/default/files/2021-12/ISO10383_MIC_Release_2_0_Factsheet.pdf",
   :db/ident :fibo-fbc-fct-mkt/hasFacilityAcronym,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfs/label "has facility acronym",
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/hasAlias,
   :skos/definition "indicates a known acronym of the market"})

(def hasMarketIdentifierCodeStatus
  "indicates the status of a specific market identifier code (MIC)"
  {:db/ident :fibo-fbc-fct-mkt/hasMarketIdentifierCodeStatus,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfs/label "has market identifier code status",
   :rdfs/range :fibo-fbc-fct-mkt/MarketIdentifierCodeStatus,
   :rdfs/subPropertyOf :fibo-fbc-fct-breg/hasRegistrationStatus,
   :skos/definition
   "indicates the status of a specific market identifier code (MIC)"})

(def hasOperatingOrSegmentIndicator
  {:db/ident :fibo-fbc-fct-mkt/hasOperatingOrSegmentIndicator,
   :owl/deprecated true,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/"})

(def operatesInCountry
  "indicates the ISO 3166-1 country in which an exchange, data reporting services provider, or crypto asset services provider operates"
  {:cmns-av/adaptedFrom
   "https://www.iso20022.org/sites/default/files/2021-12/ISO10383_MIC_Release_2_0_Factsheet.pdf",
   :db/ident :fibo-fbc-fct-mkt/operatesInCountry,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfs/label "operates in country",
   :rdfs/range :lcc-cr/Country,
   :rdfs/subPropertyOf :fibo-fnd-plc-loc/hasCountry,
   :skos/definition
   "indicates the ISO 3166-1 country in which an exchange, data reporting services provider, or crypto asset services provider operates"})

(def operatesInMunicipality
  "indicates the municipality or business center in which in which an exchange, data reporting services provider, or crypto asset services provider operates"
  {:cmns-av/adaptedFrom
   "https://www.iso20022.org/sites/default/files/2021-12/ISO10383_MIC_Release_2_0_Factsheet.pdf",
   :db/ident :fibo-fbc-fct-mkt/operatesInMunicipality,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfs/label "operates in municipality",
   :rdfs/range :fibo-fnd-plc-loc/Municipality,
   :rdfs/subPropertyOf :fibo-fnd-plc-loc/hasMunicipality,
   :skos/definition
   "indicates the municipality or business center in which in which an exchange, data reporting services provider, or crypto asset services provider operates"})