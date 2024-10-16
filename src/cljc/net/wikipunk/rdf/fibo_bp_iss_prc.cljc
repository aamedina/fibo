(ns net.wikipunk.rdf.fibo-bp-iss-prc
  {:cmns-av/copyright "Copyright (c) 2013-2024 EDM Council, Inc.",
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BP/SecuritiesIssuance/IssuanceProcess/",
   :dcterms/abstract
   "General ontology for the process by which securities are issued. Contains the process features common to all or most securities issuance. These are extended in the process ontologies that are specific to particular types of issuance",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-doc" "https://www.omg.org/spec/Commons/Documents/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
    "cmns-pts" "https://www.omg.org/spec/Commons/PartiesAndSituations/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-bp-iss-dbti"
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/",
    "fibo-bp-iss-doc"
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceDocuments/",
    "fibo-bp-iss-muni"
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
    "fibo-bp-iss-prc"
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
    "fibo-fbc-fi-fi"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
    "fibo-fnd-agr-ctr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
    "fibo-fnd-dt-oc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/",
    "fibo-fnd-gao-obj"
    "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/Objectives/",
    "fibo-fnd-pas-psch"
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-sec-sec-iss"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/SEC/Securities/SecuritiesIssuance/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Documents/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/AgentsAndPeople/Agents/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/GoalsAndObjectives/Objectives/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/DatesAndTimes/Occurrences/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BP/SecuritiesIssuance/MuniIssuance/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BP/SecuritiesIssuance/IssuanceDocuments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BP/SecuritiesIssuance/DebtIssuance/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/ProductsAndServices/PaymentsAndSchedules/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BP/SecuritiesIssuance/IssuanceProcess/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-bp-iss-prc",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Issuance Process"},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/"})

(def AllotmentInformation
  {:db/ident :fibo-bp-iss-prc/AllotmentInformation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "allotment information"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :cmns-col/comprises,
      :owl/someValuesFrom :fibo-bp-iss-prc/SubscriptionClosingInformation,
      :rdf/type           :owl/Restriction}
     :fibo-bp-iss-prc/TradedInstrumentIssuanceProcessInformation
     {:owl/onProperty     :fibo-bp-iss-prc/describesAllotmentOf,
      :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
      :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Information about the allotment of quantities of the issue to different subscribers. This relates a single instrument allotment against the subscription amounts allotted to each Subscriber."}})

(def Announcement
  {:db/ident :fibo-bp-iss-prc/Announcement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "announcement"},
   :rdfs/subClassOf #{:fibo-bp-iss-dbti/IssuanceProcessActivity
                      {:owl/onProperty     :fibo-bp-iss-muni/offeringRequestor,
                       :owl/someValuesFrom :fibo-bp-iss-prc/PotentialIssuer,
                       :rdf/type           :owl/Restriction}}})

(def CompetitiveSaleMethod
  {:db/ident :fibo-bp-iss-prc/CompetitiveSaleMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "competitive sale method"},
   :rdfs/subClassOf :fibo-bp-iss-prc/SecurityOfferingSaleMethod,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "No definition"}})

(def IssuanceProcessActivity
  {:db/ident :fibo-bp-iss-prc/IssuanceProcessActivity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "issuance process activity"},
   :rdfs/subClassOf :fibo-fnd-dt-oc/OccurrenceKind})

(def IssuanceProgramme
  {:cmns-av/explanatoryNote {:rdf/language "en",
                             :rdf/value    "See for example MTN."},
   :db/ident :fibo-bp-iss-prc/IssuanceProgramme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "issuance programme"},
   :rdfs/subClassOf {:owl/onProperty     :cmns-col/comprises,
                     :owl/someValuesFrom :fibo-sec-sec-iss/SecuritiesOffering,
                     :rdf/type           :owl/Restriction},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A series of issuances over time."}})

(def IssueSubscriptionInformation
  {:db/ident :fibo-bp-iss-prc/IssueSubscriptionInformation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "issue subscription information"},
   :rdfs/subClassOf :fibo-bp-iss-prc/TradedInstrumentIssuanceProcessInformation,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Information relating to the subscription of the issue."}})

(def IssuedSecurityIssueInformation
  {:db/ident :fibo-bp-iss-prc/IssuedSecurityIssueInformation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "issued security issue information"},
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-doc/isAbout,
                       :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                       :rdf/type           :owl/Restriction} :cmns-doc/Document
                      {:owl/allValuesFrom :fibo-fnd-pas-psch/PaymentSchedule,
                       :owl/onProperty
                       :fibo-bp-iss-prc/hasPartiallyPaidIssuanceSchedule,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   #{{:rdf/language "en",
      :rdf/value
      "FIBIM: \"Elements relating to issue preparation/bringing to market (also known as primary market or Initial Public Offering (IPO) issuance) through to issue date.\""}
     {:rdf/language "en",
      :rdf/value
      "Information about the Issuance of a Security, which is maintained throughout the life of the Security."}}})

(def NegotiatedSaleMethod
  {:db/ident :fibo-bp-iss-prc/NegotiatedSaleMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "negotiated sale method"},
   :rdfs/subClassOf :fibo-bp-iss-prc/SecurityOfferingSaleMethod,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "No definition"}})

(def OfferingProcess
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "It is assumed that this exists for all security types as the precise issuance process is defined among the Offering terms. Terms which only exist for specific types of instrument are given as specialized variants of this class of Thing."},
   :db/ident :fibo-bp-iss-prc/OfferingProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "offering"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-bp-iss-prc/hasDistributionType,
      :owl/someValuesFrom :fibo-bp-iss-prc/SecurityOfferingDistributionMethod,
      :rdf/type           :owl/Restriction}
     :fibo-bp-iss-dbti/IssuanceProcessActivity
     {:owl/onProperty     :fibo-bp-iss-muni/givesRiseTo,
      :owl/someValuesFrom :fibo-bp-iss-prc/IssuedSecurityIssueInformation,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-bp-iss-prc/hasSaleMethod,
      :owl/someValuesFrom :fibo-bp-iss-prc/SecurityOfferingSaleMethod,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-bp-iss-prc/requiredToMakeEligible,
      :owl/someValuesFrom :fibo-sec-sec-iss/OfferingDocument,
      :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The process step of offering a security for issue. This is the making available of a new securities issue through an underwriting."}})

(def PotentialIssuer
  {:db/ident :fibo-bp-iss-prc/PotentialIssuer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "potential issuer"},
   :rdfs/subClassOf #{{:owl/onProperty :fibo-bp-iss-prc/isPotentialIssuer,
                       :owl/someValuesFrom
                       :fibo-bp-iss-prc/SecuritiesIssuanceProcess,
                       :rdf/type :owl/Restriction}
                      :fibo-bp-iss-prc/SecuritiesIssuanceProcessActor}})

(def PotentialUnderwriter
  {:db/ident :fibo-bp-iss-prc/PotentialUnderwriter,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "potential underwriter"},
   :rdfs/subClassOf :fibo-bp-iss-prc/SecuritiesIssuanceProcessActor,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The entity which will become the underwriter for an issue. Term origin:MBS PoC Reviews"}})

(def PrimaryIdentifierIssuer
  {:db/ident :fibo-bp-iss-prc/PrimaryIdentifierIssuer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "primary identifier issuer"},
   :rdfs/subClassOf :fibo-fnd-agr-ctr/ContractThirdParty,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The party which formally issues the primary security identifier to the security. Term origin:MBS PoC Reviews"}})

(def PrimarySecurityOfferingDistribution
  {:db/ident :fibo-bp-iss-prc/PrimarySecurityOfferingDistribution,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "primary security offering distribution"},
   :rdfs/subClassOf :fibo-bp-iss-prc/SecurityOfferingDistributionMethod,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The original sale of a company's securities, in which the proceeds from the sale are received directly by the company."}})

(def RegistrationInformation
  {:db/ident :fibo-bp-iss-prc/RegistrationInformation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "registration information"},
   :rdfs/subClassOf :fibo-bp-iss-prc/TradedInstrumentIssuanceProcessInformation,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Information relating to the registration of a registered security."}})

(def SecondarySecurityOfferingDistribution
  {:db/ident :fibo-bp-iss-prc/SecondarySecurityOfferingDistribution,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "secondary security offering distribution"},
   :rdfs/subClassOf :fibo-bp-iss-prc/SecurityOfferingDistributionMethod,
   :skos/definition
   {:rdf/language "en",
    :rdf/value "An Offering of a security which has been previously issued."}})

(def SecuritiesIssuanceProcess
  {:db/ident :fibo-bp-iss-prc/SecuritiesIssuanceProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "securities issuance process"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-bp-iss-muni/hasPotentialIssuer,
      :owl/someValuesFrom :fibo-bp-iss-prc/PotentialIssuer,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty :fibo-fnd-rel-rel/produces,
      :owl/someValuesFrom
      :fibo-bp-iss-prc/TradedInstrumentIssuanceProcessInformation,
      :rdf/type :owl/Restriction}
     {:owl/onProperty     :fibo-bp-iss-muni/hasIssuanceGuarantor,
      :owl/someValuesFrom :fibo-bp-iss-prc/SecurityIssuanceGuarantor,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-bp-iss-muni/subscriber.1,
      :owl/someValuesFrom :fibo-bp-iss-prc/Subscriber,
      :rdf/type           :owl/Restriction}},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The process by which a financial security is issued."}})

(def SecuritiesIssuanceProcessActor
  {:db/ident :fibo-bp-iss-prc/SecuritiesIssuanceProcessActor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "securities issuance process actor"},
   :rdfs/subClassOf :cmns-pts/AgentRole})

(def SecurityIssuanceGuarantor
  {:db/ident :fibo-bp-iss-prc/SecurityIssuanceGuarantor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "security issuance guarantor"},
   :rdfs/subClassOf #{:fibo-bp-iss-prc/SecuritiesIssuanceProcessActor
                      {:owl/onProperty :fibo-bp-iss-prc/isIssuanceGuarantor,
                       :owl/someValuesFrom
                       :fibo-bp-iss-prc/SecuritiesIssuanceProcess,
                       :rdf/type :owl/Restriction}}})

(def SecurityOfferingDistributionMethod
  {:db/ident :fibo-bp-iss-prc/SecurityOfferingDistributionMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "security offering distribution method"},
   :rdfs/subClassOf :fibo-fnd-gao-obj/DistributionStrategy,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The distribution type of a securities Offering."}})

(def SecurityOfferingSaleMethod
  {:db/ident :fibo-bp-iss-prc/SecurityOfferingSaleMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "security offering sale method"},
   :rdfs/subClassOf :fibo-fnd-gao-obj/SalesStrategy,
   :skos/definition {:rdf/language "en",
                     :rdf/value "Method for sale of a new security offering."}})

(def Subscriber
  {:db/ident :fibo-bp-iss-prc/Subscriber,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "subscriber"},
   :rdfs/subClassOf #{:cmns-pts/AgentRole
                      {:owl/onProperty :fibo-bp-iss-muni/subscribesTo,
                       :owl/someValuesFrom
                       :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                       :rdf/type :owl/Restriction}}})

(def SubscriptionClosingInformation
  {:db/ident :fibo-bp-iss-prc/SubscriptionClosingInformation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "subscription closing information"},
   :rdfs/subClassOf
   #{:fibo-bp-iss-prc/TradedInstrumentIssuanceProcessInformation
     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
      :owl/someValuesFrom :fibo-bp-iss-prc/Subscriber,
      :rdf/type           :owl/Restriction}}})

(def TradedInstrumentIssuanceProcessInformation
  {:db/ident :fibo-bp-iss-prc/TradedInstrumentIssuanceProcessInformation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "traded instrument issuance process information"},
   :rdfs/subClassOf #{:cmns-doc/Document
                      {:owl/onProperty :cmns-col/isPartOf,
                       :owl/someValuesFrom
                       :fibo-bp-iss-prc/IssuedSecurityIssueInformation,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Information on one Security issue, arising from the Issuance Process. Note that one Issuance Process (Offering) may relate to more than on Issue, which itself may be the issue of more than one Traded Security."}})

(def UnderwriterTakedown
  {:db/ident :fibo-bp-iss-prc/UnderwriterTakedown,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "underwriter takedown"},
   :rdfs/subClassOf
   #{{:owl/maxQualifiedCardinality 1,
      :owl/onDataRange :xsd/integer,
      :owl/onProperty  :fibo-bp-iss-prc/underwriterTakedownShares,
      :rdf/type        :owl/Restriction}
     {:owl/onProperty     :fibo-bp-iss-prc/takenDownBy,
      :owl/someValuesFrom :fibo-bp-iss-dbti/MuniIssueUnderwriter,
      :rdf/type           :owl/Restriction}
     :fibo-bp-iss-prc/UnderwritingProcessDetails},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Infomation on Takedown quantity of the security handled by the underwriter (that will be brought into DTC)."},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "Question: Do securities issued through processes other than the one formally identified as \"Underwriting Process\", have Underwriters? Our research would indicate that agency and non agency MBS issuance processes are not \"Underwriting\" processes as defined for the DTCC Muni unwriting process, but they do have a step which involves identifying and appointing an underwriter, so the issue is underwritten. It may be that these two processes should be defined as types of (variants on) a more general Underwriting Process, which is itself more general than the one captured separately for DTCC Muni Issuance, which is where this term now lives. Modeling Note: Definition is too DTC specific, from DTCC earliy reviews on Muni process. Need to have a global definition and understanding of this term."}})

(def UnderwritingProcessDetails
  {:db/ident :fibo-bp-iss-prc/UnderwritingProcessDetails,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "underwriting process details"},
   :rdfs/subClassOf :fibo-bp-iss-prc/TradedInstrumentIssuanceProcessInformation,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Information specific to the Underwriting of the Issue."}})

(def actualClosingDate
  {:db/ident :fibo-bp-iss-prc/actualClosingDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-prc/IssuedSecurityIssueInformation,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "actual closing date"},
   :rdfs/range :cmns-dt/Date,
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "The Closing Date for the Issue, recorded after the event."}})

(def announcementDate
  {:db/ident :fibo-bp-iss-prc/announcementDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-prc/IssuedSecurityIssueInformation,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "announcement date"},
   :rdfs/range :cmns-dt/Date,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Date/time, as announced by the issuer, at which the securities were to be issued and subsequently were issued."}})

(def describesAllotmentOf
  {:db/ident :fibo-bp-iss-prc/describesAllotmentOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-prc/AllotmentInformation,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "describes allotment of"},
   :rdfs/range :fibo-fbc-fi-fi/Security,
   :rdfs/subPropertyOf :cmns-doc/isAbout})

(def expectedClosingDate
  {:db/ident :fibo-bp-iss-prc/expectedClosingDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-prc/OfferingProcess,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "expected closing date"},
   :rdfs/range :cmns-dt/Date,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The date on which the transfer of positions to underwriters is expected to take place. This date is provided by underwriters as part of an announcement."}})

(def finalStateDescribedIn
  {:db/ident :fibo-bp-iss-prc/finalStateDescribedIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-sec-iss/SecuritiesOffering,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "final state described in"},
   :rdfs/range :fibo-bp-iss-doc/FinalProspectus})

(def firstTradeDate
  {:db/ident :fibo-bp-iss-prc/firstTradeDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-prc/IssuedSecurityIssueInformation,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "first trade date"},
   :rdfs/range :cmns-dt/Date,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The date of the first trade of the security in the secondary market."}})

(def firstTradeDateAndTime
  {:db/ident :fibo-bp-iss-prc/firstTradeDateAndTime,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-prc/OfferingProcess,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "first trade date and time"},
   :rdfs/range :cmns-dt/DateTime,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "First Date and Time a trade may be executed for this security. All times in Eastern Time Zone only. NOTE: This is a date in the future tense at the time of the Offering."}})

(def firstTradeSettlementDate
  {:db/ident :fibo-bp-iss-prc/firstTradeSettlementDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-prc/IssuedSecurityIssueInformation,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "first trade settlement date"},
   :rdfs/range :cmns-dt/Date,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The date the Issuer and Underwriter exchange money for bonds."}})

(def formalAwardDateAndTime
  {:db/ident :fibo-bp-iss-prc/formalAwardDateAndTime,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-prc/OfferingProcess,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "formal award date and time"},
   :rdfs/range :cmns-dt/DateTime,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Date and time the issuer formally accepts a bid for Competitive Issues or, the Date and Time the Bond Purchase Agreement is executed for Negotiated Issues. Time Zone: Include in date/time data or add a term for it?"}})

(def hasDistributionType
  {:db/ident :fibo-bp-iss-prc/hasDistributionType,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/"},
   :rdfs/label "has distribution type"})

(def hasPartiallyPaidIssuanceSchedule
  {:db/ident :fibo-bp-iss-prc/hasPartiallyPaidIssuanceSchedule,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-prc/IssuedSecurityIssueInformation,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has partially paid issuance schedule"},
   :rdfs/range :fibo-fnd-pas-psch/PaymentSchedule,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Partially paid issue: Schedule of partial payments and dates."}})

(def hasSaleMethod
  {:db/ident :fibo-bp-iss-prc/hasSaleMethod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-prc/OfferingProcess,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has sale method"},
   :rdfs/range :fibo-bp-iss-prc/SecurityOfferingSaleMethod,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Sale Method of the security."}})

(def isIssuanceGuarantor
  {:db/ident :fibo-bp-iss-prc/isIssuanceGuarantor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-prc/SecurityIssuanceGuarantor,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is issuance guarantor"},
   :rdfs/range :fibo-bp-iss-prc/SecuritiesIssuanceProcess})

(def isPotentialIssuer
  {:db/ident :fibo-bp-iss-prc/isPotentialIssuer,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-prc/PotentialIssuer,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is potential issuer"},
   :rdfs/range :fibo-bp-iss-prc/SecuritiesIssuanceProcess})

(def issueNominalNumberOfUnits
  {:db/ident :fibo-bp-iss-prc/issueNominalNumberOfUnits,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-bp-iss-prc/IssuedSecurityIssueInformation,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "issue nominal number of units"},
   :rdfs/range :xsd/integer,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Total original quantity of securities issued."}})

(def issueOfferingUnits
  {:db/ident :fibo-bp-iss-prc/issueOfferingUnits,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-sec-iss/SecuritiesOffering,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "issue offering units"},
   :rdfs/range :xsd/integer,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Quantity of all securities that is offered in an equity or Corporate Bond issue."}})

(def minimumIssueSubscription
  {:db/ident :fibo-bp-iss-prc/minimumIssueSubscription,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-bp-iss-prc/IssueSubscriptionInformation,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "minimum issue subscription"},
   :rdfs/range :xsd/decimal,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Minimum or incremental denomination required for the transfer or change of ownership of a security."}})

(def offerIssueSeries
  {:db/ident :fibo-bp-iss-prc/offerIssueSeries,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-sec-iss/SecuritiesOffering,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "series"},
   :rdfs/range :xsd/string,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Uniquely identified collection of securities within an Issue with same Expected Closing Date. The text gives the Series Identifier within the Issuance process. There may be one or more Series within one Issue."}})

(def overAlloted
  {:db/ident :fibo-bp-iss-prc/overAlloted,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-bp-iss-prc/SubscriptionClosingInformation,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "over alloted"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Whether the subscriber has been over-alloted the requested number of units. REVIEW: Not seen in data terms but implied elsewhere."}})

(def requiredToMakeEligible
  {:db/ident :fibo-bp-iss-prc/requiredToMakeEligible,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-prc/OfferingProcess,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "required to make eligible"},
   :rdfs/range :fibo-sec-sec-iss/OfferingDocument})

(def series
  {:db/ident :fibo-bp-iss-prc/series,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-bp-iss-prc/IssuedSecurityIssueInformation,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "series"},
   :rdfs/range :xsd/string,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Series identification for the individual Traded Financial Security."}})

(def subscriptionAmount
  {:db/ident :fibo-bp-iss-prc/subscriptionAmount,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-bp-iss-prc/SubscriptionClosingInformation,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "subscription amount"},
   :rdfs/range :xsd/integer,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Number of units of the issue that an individual subscriber is allocated."}})

(def subscriptionPeriod
  {:db/ident :fibo-bp-iss-prc/subscriptionPeriod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-prc/IssueSubscriptionInformation,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "subscription period"},
   :rdfs/range :cmns-dt/DatePeriod,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Period during which the security can be subscribed to."}})

(def takenDownBy
  {:db/ident :fibo-bp-iss-prc/takenDownBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-prc/UnderwriterTakedown,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "taken down by"},
   :rdfs/range :fibo-bp-iss-dbti/MuniIssueUnderwriter})

(def underwriterTakedownShares
  {:db/ident :fibo-bp-iss-prc/underwriterTakedownShares,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-bp-iss-prc/UnderwriterTakedown,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "underwriter takedown shares"},
   :rdfs/range :xsd/integer,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Takedown quantity of the security handled by the underwriter (that will be brought into DTC)."}})

(def urn:uuid:d1502e06-b81e-5906-8a0f-3c901fbba7e0
  {:cmns-av/copyright "Copyright (c) 2013-2024 EDM Council, Inc.",
   :dcterms/abstract
   "General ontology for the process by which securities are issued. Contains the process features common to all or most securities issuance. These are extended in the process ontologies that are specific to particular types of issuance",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/SEC/Securities/SecuritiesIssuance/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Documents/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/AgentsAndPeople/Agents/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/GoalsAndObjectives/Objectives/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/DatesAndTimes/Occurrences/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BP/SecuritiesIssuance/MuniIssuance/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BP/SecuritiesIssuance/IssuanceDocuments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BP/SecuritiesIssuance/DebtIssuance/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/ProductsAndServices/PaymentsAndSchedules/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BP/SecuritiesIssuance/IssuanceProcess/"},
   :rdf/type :owl/Ontology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Issuance Process"},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/"})