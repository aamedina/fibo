(ns net.wikipunk.rdf.fibo-bp-iss-prc
  "General ontology for the process by which securities are issued. Contains the process features common to all or most securities issuance. These are extended in the process ontologies that are specific to particular types of issuance"
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
   :dcterms/abstract
   "General ontology for the process by which securities are issued. Contains the process features common to all or most securities issuance. These are extended in the process ontologies that are specific to particular types of issuance",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BP/SecuritiesIssuance/DebtIssuance/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/AgentsAndPeople/Agents/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/GoalsAndObjectives/Objectives/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/Occurrences/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Documents/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BP/SecuritiesIssuance/MuniIssuance/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/ProductsAndServices/PaymentsAndSchedules/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Roles/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BP/SecuritiesIssuance/IssuanceDocuments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/SecuritiesIssuance/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Contracts/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/BP/SecuritiesIssuance/IssuanceProcess/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
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
    "fibo-fnd-arr-doc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/",
    "fibo-fnd-dt-fd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
    "fibo-fnd-dt-oc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/",
    "fibo-fnd-gao-obj"
    "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/Objectives/",
    "fibo-fnd-pas-psch"
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules/",
    "fibo-fnd-pty-rl"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-sec-sec-iss"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/",
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "lcc-lr" "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
   :rdfa/prefix "fibo-bp-iss-prc",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "IssuanceProcess"},
   :sm/fileAbbreviation "fibo-bp-iss-prc"})

(def AllotmentInformation
  "Information about the allotment of quantities of the issue to different subscribers. This relates a single instrument allotment against the subscription amounts allotted to each Subscriber."
  {:db/ident :fibo-bp-iss-prc/AllotmentInformation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "allotment information"},
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-rel-rel/comprises,
     :owl/someValuesFrom :fibo-bp-iss-prc/SubscriptionClosingInformation,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-prc/describesAllotmentOf,
     :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
     :rdf/type           :owl/Restriction}
    :fibo-bp-iss-prc/TradedInstrumentIssuanceProcessInformation],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Information about the allotment of quantities of the issue to different subscribers. This relates a single instrument allotment against the subscription amounts allotted to each Subscriber."}})

(def Announcement
  "announcement"
  {:db/ident :fibo-bp-iss-prc/Announcement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "announcement"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-bp-iss-muni/offeringRequestor,
                      :owl/someValuesFrom :fibo-bp-iss-prc/PotentialIssuer,
                      :rdf/type           :owl/Restriction}
                     :fibo-bp-iss-dbti/IssuanceProcessActivity]})

(def CompetitiveSaleMethod
  "No definition"
  {:db/ident :fibo-bp-iss-prc/CompetitiveSaleMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "competitive sale method"},
   :rdfs/subClassOf :fibo-bp-iss-prc/SecurityOfferingSaleMethod,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "No definition"}})

(def IssuanceProcessActivity
  "issuance process activity"
  {:db/ident :fibo-bp-iss-prc/IssuanceProcessActivity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "issuance process activity"},
   :rdfs/subClassOf :fibo-fnd-dt-oc/OccurrenceKind})

(def IssuanceProgramme
  "A series of issuances over time."
  {:db/ident :fibo-bp-iss-prc/IssuanceProgramme,
   :fibo-fnd-utl-av/explanatoryNote {:rdf/language "en",
                                     :rdf/value    "See for example MTN."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "issuance programme"},
   :rdfs/subClassOf {:owl/onProperty     :fibo-fnd-rel-rel/comprises,
                     :owl/someValuesFrom :fibo-sec-sec-iss/SecuritiesOffering,
                     :rdf/type           :owl/Restriction},
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A series of issuances over time."}})

(def IssueSubscriptionInformation
  "Information relating to the subscription of the issue."
  {:db/ident :fibo-bp-iss-prc/IssueSubscriptionInformation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "issue subscription information"},
   :rdfs/subClassOf :fibo-bp-iss-prc/TradedInstrumentIssuanceProcessInformation,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Information relating to the subscription of the issue."}})

(def IssuedSecurityIssueInformation
  "Information about the Issuance of a Security, which is maintained throughout the life of the Security."
  {:db/ident :fibo-bp-iss-prc/IssuedSecurityIssueInformation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "issued security issue information"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-arr-doc/isAbout,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :fibo-fnd-pas-psch/PaymentSchedule,
                      :owl/onProperty
                      :fibo-bp-iss-prc/hasPartiallyPaidIssuanceSchedule,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-arr-doc/Document],
   :skos/definition
   [{:rdf/language "en",
     :rdf/value
     "Information about the Issuance of a Security, which is maintained throughout the life of the Security."}
    {:rdf/language "en",
     :rdf/value
     "FIBIM: \"Elements relating to issue preparation/bringing to market (also known as primary market or Initial Public Offering (IPO) issuance) through to issue date.\""}]})

(def NegotiatedSaleMethod
  "No definition"
  {:db/ident :fibo-bp-iss-prc/NegotiatedSaleMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "negotiated sale method"},
   :rdfs/subClassOf :fibo-bp-iss-prc/SecurityOfferingSaleMethod,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "No definition"}})

(def OfferingProcess
  "The process step of offering a security for issue. This is the making available of a new securities issue through an underwriting."
  {:db/ident :fibo-bp-iss-prc/OfferingProcess,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "It is assumed that this exists for all security types as the precise issuance process is defined among the Offering terms. Terms which only exist for specific types of instrument are given as specialized variants of this class of Thing."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "offering"},
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-bp-iss-prc/hasDistributionType,
     :owl/someValuesFrom :fibo-bp-iss-prc/SecurityOfferingDistributionMethod,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/givesRiseTo,
     :owl/someValuesFrom :fibo-bp-iss-prc/IssuedSecurityIssueInformation,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-prc/hasSaleMethod,
     :owl/someValuesFrom :fibo-bp-iss-prc/SecurityOfferingSaleMethod,
     :rdf/type           :owl/Restriction}
    :fibo-bp-iss-dbti/IssuanceProcessActivity
    {:owl/onProperty     :fibo-bp-iss-prc/requiredToMakeEligible,
     :owl/someValuesFrom :fibo-sec-sec-iss/OfferingDocument,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The process step of offering a security for issue. This is the making available of a new securities issue through an underwriting."}})

(def PotentialIssuer
  "potential issuer"
  {:db/ident :fibo-bp-iss-prc/PotentialIssuer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "potential issuer"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-bp-iss-prc/isPotentialIssuer,
                      :owl/someValuesFrom
                      :fibo-bp-iss-prc/SecuritiesIssuanceProcess,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-prc/SecuritiesIssuanceProcessActor]})

(def PotentialUnderwriter
  "The entity which will become the underwriter for an issue. Term origin:MBS PoC Reviews"
  {:db/ident :fibo-bp-iss-prc/PotentialUnderwriter,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "potential underwriter"},
   :rdfs/subClassOf :fibo-bp-iss-prc/SecuritiesIssuanceProcessActor,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The entity which will become the underwriter for an issue. Term origin:MBS PoC Reviews"}})

(def PrimaryIdentifierIssuer
  "The party which formally issues the primary security identifier to the security. Term origin:MBS PoC Reviews"
  {:db/ident :fibo-bp-iss-prc/PrimaryIdentifierIssuer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "primary identifier issuer"},
   :rdfs/subClassOf :fibo-fnd-agr-ctr/ContractThirdParty,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The party which formally issues the primary security identifier to the security. Term origin:MBS PoC Reviews"}})

(def PrimarySecurityOfferingDistribution
  "The original sale of a company's securities, in which the proceeds from the sale are received directly by the company."
  {:db/ident :fibo-bp-iss-prc/PrimarySecurityOfferingDistribution,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "primary security offering distribution"},
   :rdfs/subClassOf :fibo-bp-iss-prc/SecurityOfferingDistributionMethod,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The original sale of a company's securities, in which the proceeds from the sale are received directly by the company."}})

(def RegistrationInformation
  "Information relating to the registration of a registered security."
  {:db/ident :fibo-bp-iss-prc/RegistrationInformation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "registration information"},
   :rdfs/subClassOf :fibo-bp-iss-prc/TradedInstrumentIssuanceProcessInformation,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Information relating to the registration of a registered security."}})

(def SecondarySecurityOfferingDistribution
  "An Offering of a security which has been previously issued."
  {:db/ident :fibo-bp-iss-prc/SecondarySecurityOfferingDistribution,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "secondary security offering distribution"},
   :rdfs/subClassOf :fibo-bp-iss-prc/SecurityOfferingDistributionMethod,
   :skos/definition
   {:rdf/language "en",
    :rdf/value "An Offering of a security which has been previously issued."}})

(def SecuritiesIssuanceProcess
  "The process by which a financial security is issued."
  {:db/ident :fibo-bp-iss-prc/SecuritiesIssuanceProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "securities issuance process"},
   :rdfs/subClassOf
   [{:owl/onProperty :fibo-fnd-rel-rel/produces,
     :owl/someValuesFrom
     :fibo-bp-iss-prc/TradedInstrumentIssuanceProcessInformation,
     :rdf/type :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/subscriber.1,
     :owl/someValuesFrom :fibo-bp-iss-prc/Subscriber,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/hasPotentialIssuer,
     :owl/someValuesFrom :fibo-bp-iss-prc/PotentialIssuer,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-bp-iss-muni/hasIssuanceGuarantor,
     :owl/someValuesFrom :fibo-bp-iss-prc/SecurityIssuanceGuarantor,
     :rdf/type           :owl/Restriction}],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The process by which a financial security is issued."}})

(def SecuritiesIssuanceProcessActor
  "securities issuance process actor"
  {:db/ident :fibo-bp-iss-prc/SecuritiesIssuanceProcessActor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "securities issuance process actor"},
   :rdfs/subClassOf :fibo-fnd-pty-rl/AgentInRole})

(def SecurityIssuanceGuarantor
  "security issuance guarantor"
  {:db/ident :fibo-bp-iss-prc/SecurityIssuanceGuarantor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "security issuance guarantor"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-bp-iss-prc/isIssuanceGuarantor,
                      :owl/someValuesFrom
                      :fibo-bp-iss-prc/SecuritiesIssuanceProcess,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-prc/SecuritiesIssuanceProcessActor]})

(def SecurityOfferingDistributionMethod
  "The distribution type of a securities Offering."
  {:db/ident :fibo-bp-iss-prc/SecurityOfferingDistributionMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "security offering distribution method"},
   :rdfs/subClassOf :fibo-fnd-gao-obj/DistributionStrategy,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The distribution type of a securities Offering."}})

(def SecurityOfferingSaleMethod
  "Method for sale of a new security offering."
  {:db/ident :fibo-bp-iss-prc/SecurityOfferingSaleMethod,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "security offering sale method"},
   :rdfs/subClassOf :fibo-fnd-gao-obj/SalesStrategy,
   :skos/definition {:rdf/language "en",
                     :rdf/value "Method for sale of a new security offering."}})

(def Subscriber
  "subscriber"
  {:db/ident :fibo-bp-iss-prc/Subscriber,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "subscriber"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-bp-iss-muni/subscribesTo,
                      :owl/someValuesFrom
                      :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-pty-rl/AgentInRole]})

(def SubscriptionClosingInformation
  "subscription closing information"
  {:db/ident :fibo-bp-iss-prc/SubscriptionClosingInformation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "subscription closing information"},
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-rel-rel/appliesTo,
     :owl/someValuesFrom :fibo-bp-iss-prc/Subscriber,
     :rdf/type           :owl/Restriction}
    :fibo-bp-iss-prc/TradedInstrumentIssuanceProcessInformation]})

(def TradedInstrumentIssuanceProcessInformation
  "Information on one Security issue, arising from the Issuance Process. Note that one Issuance Process (Offering) may relate to more than on Issue, which itself may be the issue of more than one Traded Security."
  {:db/ident :fibo-bp-iss-prc/TradedInstrumentIssuanceProcessInformation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "traded instrument issuance process information"},
   :rdfs/subClassOf [{:owl/onProperty :lcc-cr/isPartOf,
                      :owl/someValuesFrom
                      :fibo-bp-iss-prc/IssuedSecurityIssueInformation,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-arr-doc/Document],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Information on one Security issue, arising from the Issuance Process. Note that one Issuance Process (Offering) may relate to more than on Issue, which itself may be the issue of more than one Traded Security."}})

(def UnderwriterTakedown
  "Infomation on Takedown quantity of the security handled by the underwriter (that will be brought into DTC)."
  {:db/ident :fibo-bp-iss-prc/UnderwriterTakedown,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "underwriter takedown"},
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-bp-iss-prc/takenDownBy,
     :owl/someValuesFrom :fibo-bp-iss-dbti/MuniIssueUnderwriter,
     :rdf/type           :owl/Restriction}
    {:owl/maxQualifiedCardinality 1,
     :owl/onDataRange :xsd/integer,
     :owl/onProperty  :fibo-bp-iss-prc/underwriterTakedownShares,
     :rdf/type        :owl/Restriction}
    :fibo-bp-iss-prc/UnderwritingProcessDetails],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Infomation on Takedown quantity of the security handled by the underwriter (that will be brought into DTC)."},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "Question: Do securities issued through processes other than the one formally identified as \"Underwriting Process\", have Underwriters? Our research would indicate that agency and non agency MBS issuance processes are not \"Underwriting\" processes as defined for the DTCC Muni unwriting process, but they do have a step which involves identifying and appointing an underwriter, so the issue is underwritten. It may be that these two processes should be defined as types of (variants on) a more general Underwriting Process, which is itself more general than the one captured separately for DTCC Muni Issuance, which is where this term now lives. Modeling Note: Definition is too DTC specific, from DTCC earliy reviews on Muni process. Need to have a global definition and understanding of this term."}})

(def UnderwritingProcessDetails
  "Information specific to the Underwriting of the Issue."
  {:db/ident :fibo-bp-iss-prc/UnderwritingProcessDetails,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "underwriting process details"},
   :rdfs/subClassOf :fibo-bp-iss-prc/TradedInstrumentIssuanceProcessInformation,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Information specific to the Underwriting of the Issue."}})

(def actualClosingDate
  "The Closing Date for the Issue, recorded after the event."
  {:db/ident :fibo-bp-iss-prc/actualClosingDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-prc/IssuedSecurityIssueInformation,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "actual closing date"},
   :rdfs/range :fibo-fnd-dt-fd/Date,
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "The Closing Date for the Issue, recorded after the event."}})

(def announcementDate
  "Date/time, as announced by the issuer, at which the securities were to be issued and subsequently were issued."
  {:db/ident :fibo-bp-iss-prc/announcementDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-prc/IssuedSecurityIssueInformation,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "announcement date"},
   :rdfs/range :fibo-fnd-dt-fd/Date,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Date/time, as announced by the issuer, at which the securities were to be issued and subsequently were issued."}})

(def describesAllotmentOf
  "describes allotment of"
  {:db/ident :fibo-bp-iss-prc/describesAllotmentOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-prc/AllotmentInformation,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "describes allotment of"},
   :rdfs/range :fibo-fbc-fi-fi/Security,
   :rdfs/subPropertyOf :fibo-fnd-arr-doc/isAbout})

(def expectedClosingDate
  "The date on which the transfer of positions to underwriters is expected to take place. This date is provided by underwriters as part of an announcement."
  {:db/ident :fibo-bp-iss-prc/expectedClosingDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-prc/OfferingProcess,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "expected closing date"},
   :rdfs/range :fibo-fnd-dt-fd/Date,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The date on which the transfer of positions to underwriters is expected to take place. This date is provided by underwriters as part of an announcement."}})

(def finalStateDescribedIn
  "final state described in"
  {:db/ident :fibo-bp-iss-prc/finalStateDescribedIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-sec-iss/SecuritiesOffering,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "final state described in"},
   :rdfs/range :fibo-bp-iss-doc/FinalProspectus})

(def firstTradeDate
  "The date of the first trade of the security in the secondary market."
  {:db/ident :fibo-bp-iss-prc/firstTradeDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-prc/IssuedSecurityIssueInformation,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "first trade date"},
   :rdfs/range :fibo-fnd-dt-fd/Date,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The date of the first trade of the security in the secondary market."}})

(def firstTradeDateAndTime
  "First Date and Time a trade may be executed for this security. All times in Eastern Time Zone only. NOTE: This is a date in the future tense at the time of the Offering."
  {:db/ident :fibo-bp-iss-prc/firstTradeDateAndTime,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-prc/OfferingProcess,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "first trade date and time"},
   :rdfs/range :fibo-fnd-dt-fd/DateTime,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "First Date and Time a trade may be executed for this security. All times in Eastern Time Zone only. NOTE: This is a date in the future tense at the time of the Offering."}})

(def firstTradeSettlementDate
  "The date the Issuer and Underwriter exchange money for bonds."
  {:db/ident :fibo-bp-iss-prc/firstTradeSettlementDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-prc/IssuedSecurityIssueInformation,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "first trade settlement date"},
   :rdfs/range :fibo-fnd-dt-fd/Date,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The date the Issuer and Underwriter exchange money for bonds."}})

(def formalAwardDateAndTime
  "Date and time the issuer formally accepts a bid for Competitive Issues or, the Date and Time the Bond Purchase Agreement is executed for Negotiated Issues. Time Zone: Include in date/time data or add a term for it?"
  {:db/ident :fibo-bp-iss-prc/formalAwardDateAndTime,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-prc/OfferingProcess,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "formal award date and time"},
   :rdfs/range :fibo-fnd-dt-fd/DateTime,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Date and time the issuer formally accepts a bid for Competitive Issues or, the Date and Time the Bond Purchase Agreement is executed for Negotiated Issues. Time Zone: Include in date/time data or add a term for it?"}})

(def hasDistributionType
  "has distribution type"
  {:db/ident :fibo-bp-iss-prc/hasDistributionType,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
   :rdfs/label "has distribution type"})

(def hasPartiallyPaidIssuanceSchedule
  "Partially paid issue: Schedule of partial payments and dates."
  {:db/ident :fibo-bp-iss-prc/hasPartiallyPaidIssuanceSchedule,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-prc/IssuedSecurityIssueInformation,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has partially paid issuance schedule"},
   :rdfs/range :fibo-fnd-pas-psch/PaymentSchedule,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Partially paid issue: Schedule of partial payments and dates."}})

(def hasSaleMethod
  "Sale Method of the security."
  {:db/ident :fibo-bp-iss-prc/hasSaleMethod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-prc/OfferingProcess,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has sale method"},
   :rdfs/range :fibo-bp-iss-prc/SecurityOfferingSaleMethod,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "Sale Method of the security."}})

(def isIssuanceGuarantor
  "is issuance guarantor"
  {:db/ident :fibo-bp-iss-prc/isIssuanceGuarantor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-prc/SecurityIssuanceGuarantor,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is issuance guarantor"},
   :rdfs/range :fibo-bp-iss-prc/SecuritiesIssuanceProcess})

(def isPotentialIssuer
  "is potential issuer"
  {:db/ident :fibo-bp-iss-prc/isPotentialIssuer,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-prc/PotentialIssuer,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is potential issuer"},
   :rdfs/range :fibo-bp-iss-prc/SecuritiesIssuanceProcess})

(def issueNominalNumberOfUnits
  "Total original quantity of securities issued."
  {:db/ident :fibo-bp-iss-prc/issueNominalNumberOfUnits,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-bp-iss-prc/IssuedSecurityIssueInformation,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "issue nominal number of units"},
   :rdfs/range :xsd/integer,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Total original quantity of securities issued."}})

(def issueOfferingUnits
  "Quantity of all securities that is offered in an equity or Corporate Bond issue."
  {:db/ident :fibo-bp-iss-prc/issueOfferingUnits,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-sec-iss/SecuritiesOffering,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "issue offering units"},
   :rdfs/range :xsd/integer,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Quantity of all securities that is offered in an equity or Corporate Bond issue."}})

(def minimumIssueSubscription
  "Minimum or incremental denomination required for the transfer or change of ownership of a security."
  {:db/ident :fibo-bp-iss-prc/minimumIssueSubscription,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-bp-iss-prc/IssueSubscriptionInformation,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "minimum issue subscription"},
   :rdfs/range :xsd/decimal,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Minimum or incremental denomination required for the transfer or change of ownership of a security."}})

(def offerIssueSeries
  "Uniquely identified collection of securities within an Issue with same Expected Closing Date. The text gives the Series Identifier within the Issuance process. There may be one or more Series within one Issue."
  {:db/ident :fibo-bp-iss-prc/offerIssueSeries,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-sec-iss/SecuritiesOffering,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "series"},
   :rdfs/range :xsd/string,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Uniquely identified collection of securities within an Issue with same Expected Closing Date. The text gives the Series Identifier within the Issuance process. There may be one or more Series within one Issue."}})

(def overAlloted
  "Whether the subscriber has been over-alloted the requested number of units. REVIEW: Not seen in data terms but implied elsewhere."
  {:db/ident :fibo-bp-iss-prc/overAlloted,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-bp-iss-prc/SubscriptionClosingInformation,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "over alloted"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Whether the subscriber has been over-alloted the requested number of units. REVIEW: Not seen in data terms but implied elsewhere."}})

(def requiredToMakeEligible
  "required to make eligible"
  {:db/ident :fibo-bp-iss-prc/requiredToMakeEligible,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-prc/OfferingProcess,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "required to make eligible"},
   :rdfs/range :fibo-sec-sec-iss/OfferingDocument})

(def series
  "Series identification for the individual Traded Financial Security."
  {:db/ident :fibo-bp-iss-prc/series,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-bp-iss-prc/IssuedSecurityIssueInformation,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "series"},
   :rdfs/range :xsd/string,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Series identification for the individual Traded Financial Security."}})

(def subscriptionAmount
  "Number of units of the issue that an individual subscriber is allocated."
  {:db/ident :fibo-bp-iss-prc/subscriptionAmount,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-bp-iss-prc/SubscriptionClosingInformation,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "subscription amount"},
   :rdfs/range :xsd/integer,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Number of units of the issue that an individual subscriber is allocated."}})

(def subscriptionPeriod
  "Period during which the security can be subscribed to."
  {:db/ident :fibo-bp-iss-prc/subscriptionPeriod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-prc/IssueSubscriptionInformation,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "subscription period"},
   :rdfs/range :fibo-fnd-dt-fd/DatePeriod,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "Period during which the security can be subscribed to."}})

(def takenDownBy
  "taken down by"
  {:db/ident :fibo-bp-iss-prc/takenDownBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-prc/UnderwriterTakedown,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "taken down by"},
   :rdfs/range :fibo-bp-iss-dbti/MuniIssueUnderwriter})

(def underwriterTakedownShares
  "Takedown quantity of the security handled by the underwriter (that will be brought into DTC)."
  {:db/ident :fibo-bp-iss-prc/underwriterTakedownShares,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-bp-iss-prc/UnderwriterTakedown,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "underwriter takedown shares"},
   :rdfs/range :xsd/integer,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Takedown quantity of the security handled by the underwriter (that will be brought into DTC)."}})