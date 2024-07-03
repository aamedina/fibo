(ns net.wikipunk.rdf.fibo-bp-iss-dbti
  {:cmns-av/copyright "Copyright (c) 2013-2023 EDM Council, Inc.",
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BP/SecuritiesIssuance/DebtIssuance/",
   :dcterms/abstract
   "General issuance process for issuance of debt instruments. Forms the basis for more detailed issuance processes such as MBS issuance and municipal bonds issue.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-doc" "https://www.omg.org/spec/Commons/Documents/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "cmns-qtu" "https://www.omg.org/spec/Commons/QuantitiesAndUnits/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-bp-iss-dbti"
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/",
    "fibo-bp-iss-muni"
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
    "fibo-bp-iss-pmbs"
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
    "fibo-bp-iss-prc"
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
    "fibo-der-drc-raw"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
    "fibo-fbc-pas-fpas"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
    "fibo-fnd-agr-ctr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
    "fibo-fnd-arr-lif"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Lifecycles/",
    "fibo-fnd-gao-obj"
    "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/Objectives/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-sec-dbt-bnd"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/",
    "fibo-sec-dbt-dbti"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/",
    "fibo-sec-sec-iss"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/",
    "fibo-sec-sec-pls"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Pools/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Securities/Pools/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Documents/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/QuantitiesAndUnits/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BP/SecuritiesIssuance/MuniIssuance/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Securities/SecuritiesIssuance/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/ProductsAndServices/FinancialProductsAndServices/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Arrangements/Lifecycles/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Debt/Bonds/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Debt/DebtInstruments/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BP/SecuritiesIssuance/IssuanceProcess/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/GoalsAndObjectives/Objectives/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Debt/PoolBackedSecurities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/DER/DerivativesContracts/RightsAndWarrants/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Agreements/Contracts/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BP/SecuritiesIssuance/DebtIssuance/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-bp-iss-dbti",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Debt Issuance Ontology"},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/"})

(def ABSSecuritizationProcess
  {:db/ident :fibo-bp-iss-dbti/ABSSecuritizationProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "a b s securitization process"},
   :rdfs/subClassOf :fibo-bp-iss-dbti/PoolBackedSecuritySecuritizationProcess})

(def AdvancedRefunding
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The proceeds are then invested, and when the older bonds become callable they are paid off with the invested proceeds."},
   :db/ident :fibo-bp-iss-dbti/AdvancedRefunding,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "advance refunding"},
   :rdfs/subClassOf :fibo-bp-iss-dbti/RefundingPurpose,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "refunding in which bond issuance in which new bonds are sold at a lower rate than outstanding ones"}})

(def AssetPoolCreationProcess
  {:db/ident :fibo-bp-iss-dbti/AssetPoolCreationProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "asset pool creation process"},
   :rdfs/subClassOf {:owl/onProperty :cmns-dt/precedes,
                     :owl/someValuesFrom
                     :fibo-bp-iss-dbti/DebtSecuritizationProcess,
                     :rdf/type :owl/Restriction}})

(def BondIssuanceProgramme
  {:db/ident :fibo-bp-iss-dbti/BondIssuanceProgramme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "bond issuance programme"},
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-col/comprises,
                       :owl/someValuesFrom :fibo-bp-iss-dbti/BondOffering,
                       :rdf/type           :owl/Restriction}
                      :fibo-bp-iss-dbti/DebtIssuanceProgramme},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "a debt issuance programe under which an entity may, from time to time, issue bonds under the terms and conditions specified in the base prospectus for that programme"}})

(def BondOffering
  {:db/ident :fibo-bp-iss-dbti/BondOffering,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "bond offering"},
   :rdfs/subClassOf :fibo-sec-dbt-dbti/DebtOffering,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "a debt offering of one or more bonds, as all or part of an issuance programme"}})

(def BondOfferingWithWarrant
  {:db/ident :fibo-bp-iss-dbti/BondOfferingWithWarrant,
   :owl/disjointWith :fibo-bp-iss-dbti/MediumTermNoteOffering,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "bond offering with warrant"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :cmns-cxtdsg/appliesTo,
      :owl/someValuesFrom {:owl/unionOf [:fibo-der-drc-raw/TraditionalWarrant
                                         :fibo-sec-dbt-bnd/Bond],
                           :rdf/type    :owl/Class},
      :rdf/type           :owl/Restriction} :fibo-bp-iss-dbti/BondOffering},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "a bond offering where the issue includes a warrant; Further notes: ISO 10962 CFI definition is A bond that is issued together with one or more warrant(s) attached as part of the offer, the warrant(s) granting the holder the right to purchase a designated security, often the common stock of the issuer of the debt, at a specified price. Review notes: This need not be any specific type of bond. The warrant is used as a sweetener to encourage people to subscribe to a new bond issue. The Bond and the Warrant trade together as a unit (called \"Bond Unit\")."}})

(def CDOSecuritizationProcess
  {:db/ident :fibo-bp-iss-dbti/CDOSecuritizationProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "c d o securitization process"},
   :rdfs/subClassOf :fibo-bp-iss-dbti/DebtSecuritizationProcess})

(def CompletedDebtsPool
  {:db/ident :fibo-bp-iss-dbti/CompletedDebtsPool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "completed debts pool"},
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fnd-arr-lif/hasStage,
                       :owl/someValuesFrom :fibo-bp-iss-dbti/InIssuance,
                       :rdf/type           :owl/Restriction}
                      :fibo-sec-sec-pls/DebtPool}})

(def CreditCardPoolCreationProcess
  {:db/ident :fibo-bp-iss-dbti/CreditCardPoolCreationProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "credit card pool creation process"},
   :rdfs/subClassOf :fibo-bp-iss-dbti/RetailAssetPoolCreationProcess})

(def DebtInstrumentPoolCreationProcess
  {:db/ident :fibo-bp-iss-dbti/DebtInstrumentPoolCreationProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "debt instrument pool creation process"},
   :rdfs/subClassOf :fibo-bp-iss-dbti/AssetPoolCreationProcess})

(def DebtIssuanceProcessInformation
  {:db/ident :fibo-bp-iss-dbti/DebtIssuanceProcessInformation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "debt issuance process information"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-bp-iss-dbti/hasDebtIssuancePurpose,
      :owl/someValuesFrom :fibo-bp-iss-dbti/DebtIssuancePurpose,
      :rdf/type           :owl/Restriction}
     :fibo-bp-iss-prc/TradedInstrumentIssuanceProcessInformation},
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "information specific to the issuance of a debt security"}})

(def DebtIssuanceProgramme
  {:db/ident :fibo-bp-iss-dbti/DebtIssuanceProgramme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "debt issuance programme"},
   :rdfs/subClassOf #{:fibo-bp-iss-prc/IssuanceProgramme
                      {:owl/onProperty     :cmns-col/comprises,
                       :owl/someValuesFrom :fibo-sec-dbt-dbti/DebtOffering,
                       :rdf/type           :owl/Restriction}},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "a series of debt security issuances over time"}})

(def DebtIssuancePurpose
  {:db/ident :fibo-bp-iss-dbti/DebtIssuancePurpose,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "debt issuance purpose"},
   :rdfs/subClassOf :fibo-fnd-gao-obj/Objective,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "purpose for the issuance of a debt security; also defines processes to be followed in some instances"}})

(def DebtSecuritizationProcess
  {:db/ident :fibo-bp-iss-dbti/DebtSecuritizationProcess,
   :owl/disjointWith #{:fibo-bp-iss-muni/DebtAuctionProcess
                       :fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "debt securitization process"},
   :rdfs/subClassOf :fibo-bp-iss-prc/SecuritiesIssuanceProcess})

(def HomeEquityLineOfCreditPoolCreationProcess
  {:db/ident :fibo-bp-iss-dbti/HomeEquityLineOfCreditPoolCreationProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value "home equity line of credit pool creation process"},
   :rdfs/subClassOf :fibo-bp-iss-dbti/RetailAssetPoolCreationProcess})

(def InAssembly
  {:db/ident :fibo-bp-iss-dbti/InAssembly,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "in assembly"},
   :rdfs/subClassOf :fibo-bp-iss-pmbs/PoolLifecycleStateSelection})

(def InAssemblyDebtsPool
  {:db/ident :fibo-bp-iss-dbti/InAssemblyDebtsPool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "in assembly debts pool"},
   :rdfs/subClassOf #{:fibo-sec-sec-pls/DebtPool
                      {:owl/onProperty     :fibo-fnd-arr-lif/hasStage,
                       :owl/someValuesFrom :fibo-bp-iss-dbti/InAssembly,
                       :rdf/type           :owl/Restriction}}})

(def InIssuance
  {:db/ident :fibo-bp-iss-dbti/InIssuance,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "in issuance"},
   :rdfs/subClassOf :fibo-bp-iss-pmbs/PoolLifecycleStateSelection})

(def IssuanceProcessActivity
  {:db/ident :fibo-bp-iss-dbti/IssuanceProcessActivity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "issuance process activity"},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "An activity within the process of securities issuance."}})

(def Issued
  {:db/ident :fibo-bp-iss-dbti/Issued,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "issued"},
   :rdfs/subClassOf :fibo-bp-iss-pmbs/PoolLifecycleStateSelection})

(def LoanPoolCreationProcess
  {:db/ident :fibo-bp-iss-dbti/LoanPoolCreationProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "loan pool creation process"},
   :rdfs/subClassOf :fibo-bp-iss-dbti/RetailAssetPoolCreationProcess})

(def MTNRegistration
  {:db/ident :fibo-bp-iss-dbti/MTNRegistration,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "m t n registration"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :cmns-doc/isAbout,
      :owl/someValuesFrom :fibo-bp-iss-dbti/MediumTermNoteIssuanceProgramme,
      :rdf/type           :owl/Restriction} :fibo-bp-iss-muni/Registration}})

(def MediumTermNoteIssuanceProgramme
  {:db/ident :fibo-bp-iss-dbti/MediumTermNoteIssuanceProgramme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "medium term note issuance programme"},
   :rdfs/subClassOf #{{:owl/onProperty :cmns-col/comprises,
                       :owl/someValuesFrom
                       :fibo-bp-iss-dbti/MediumTermNoteOffering,
                       :rdf/type :owl/Restriction}
                      :fibo-bp-iss-dbti/BondIssuanceProgramme},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "a program of offerings of medium term notes; a set of issues where the maturity is defined after the rest of the terms have been registered with some authority; these are registered up front so that then the company wants to borrow more money they don't have to go through the registration period but have the facility up front to issue another security."}})

(def MediumTermNoteOffering
  {:db/ident :fibo-bp-iss-dbti/MediumTermNoteOffering,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "medium term note offering"},
   :rdfs/subClassOf :fibo-bp-iss-dbti/BondOffering})

(def MuniIssueUnderwriter
  {:db/ident :fibo-bp-iss-dbti/MuniIssueUnderwriter,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "muni issue underwriter"},
   :rdfs/subClassOf :fibo-sec-sec-iss/SecurityUnderwriter,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The party which agrees to buy any certificates that are not bought by investors Term origin:DTCC"}})

(def NewMoneyPurpose
  {:db/ident :fibo-bp-iss-dbti/NewMoneyPurpose,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "new money purpose"},
   :rdfs/subClassOf :fibo-bp-iss-dbti/DebtIssuancePurpose,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "securities issued to raise funds for a new project or purpose"}})

(def NotYetIssued
  {:db/ident :fibo-bp-iss-dbti/NotYetIssued,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "not yet issued"},
   :rdfs/subClassOf :fibo-bp-iss-pmbs/PoolLifecycleStateSelection})

(def NotYetIssuedDebtsPool
  {:db/ident :fibo-bp-iss-dbti/NotYetIssuedDebtsPool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "not yet issued debts pool"},
   :rdfs/subClassOf #{:fibo-sec-sec-pls/DebtPool
                      {:owl/onProperty     :fibo-fnd-arr-lif/hasStage,
                       :owl/someValuesFrom :fibo-bp-iss-dbti/NotYetIssued,
                       :rdf/type           :owl/Restriction}}})

(def PoolBackedSecuritySecuritizationProcess
  {:db/ident :fibo-bp-iss-dbti/PoolBackedSecuritySecuritizationProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "pool backed security securitization process"},
   :rdfs/subClassOf :fibo-bp-iss-dbti/DebtSecuritizationProcess})

(def PoolBackedSecuritySecuritizationProcessActor
  {:db/ident :fibo-bp-iss-dbti/PoolBackedSecuritySecuritizationProcessActor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value "pool backed security securitization process actor"},
   :rdfs/subClassOf #{:fibo-bp-iss-dbti/SecuritizationProcessActor
                      {:owl/onProperty :fibo-fnd-rel-rel/evaluates,
                       :owl/someValuesFrom
                       :fibo-bp-iss-prc/IssuanceProcessActivity,
                       :rdf/type :owl/Restriction}}})

(def RefundingPurpose
  {:db/ident :fibo-bp-iss-dbti/RefundingPurpose,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "refunding purpose"},
   :rdfs/subClassOf :fibo-bp-iss-dbti/DebtIssuancePurpose,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "a procedure whereby an issuer refinances outstanding bonds by issuing new bonds"}})

(def RemarketingPurpose
  {:db/ident :fibo-bp-iss-dbti/RemarketingPurpose,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "remarketing purpose"},
   :rdfs/subClassOf :fibo-bp-iss-dbti/DebtIssuancePurpose,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "the process of reselling securities to the public that have been tendered for purchase by the previous owners thereof"}})

(def RetailAssetPoolCreationProcess
  {:db/ident :fibo-bp-iss-dbti/RetailAssetPoolCreationProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "retail asset pool creation process"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-fnd-rel-rel/isProducedBy,
      :owl/someValuesFrom :fibo-sec-sec-pls/DebtPool,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty :cmns-dt/precedes,
      :owl/someValuesFrom
      :fibo-bp-iss-dbti/PoolBackedSecuritySecuritizationProcess,
      :rdf/type :owl/Restriction} :fibo-bp-iss-dbti/AssetPoolCreationProcess},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The process by which pools of assets are created. These may then be used in the issue of securities based on those asset pools as underlying."}})

(def SecuritizationProcessActor
  {:db/ident :fibo-bp-iss-dbti/SecuritizationProcessActor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "securitization process actor"},
   :rdfs/subClassOf :fibo-bp-iss-prc/SecuritiesIssuanceProcessActor})

(def UnderwriterTakedownForDebt
  {:db/ident :fibo-bp-iss-dbti/UnderwriterTakedownForDebt,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "underwriter takedown for debt"},
   :rdfs/subClassOf :fibo-bp-iss-prc/UnderwriterTakedown,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "information on takedown quantity of the debt security handled by the underwriter (that will be brought into DTC)"}})

(def announces
  {:db/ident :fibo-bp-iss-dbti/announces,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "announces"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The issue of one or more securities that the announcement pertains to."}})

(def hasDebtIssuancePurpose
  {:db/ident :fibo-bp-iss-dbti/hasDebtIssuancePurpose,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-dbti/DebtIssuanceProcessInformation,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has debt issuance purpose"},
   :rdfs/range :fibo-bp-iss-dbti/DebtIssuancePurpose})

(def hasOriginalIssueDiscount
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The OID is the difference between the stated redemption price at maturity and the actual issue price."},
   :db/ident :fibo-bp-iss-dbti/hasOriginalIssueDiscount,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-dbti/BondOffering,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has original issue discount"},
   :rdfs/range :cmns-qtu/Percentage,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "discount from par value at the time a bond or other debt instrument is issued"}})

(def isBankQualified
  {:db/ident :fibo-bp-iss-dbti/isBankQualified,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-bp-iss-dbti/BondOffering,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is bank qualified"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "designation given to a public purpose bond offering by the issuer if it reasonably expects to issue in the calendar year of such offering no more than $10 million par amount of bonds of the type required to be included in making such calculation under the Internal Revenue Code.  When purchased by a commercial bank for its portfolio, the bank may receive an 80% tax deduction for the interest cost of carry for the issue.  A bond that is bank qualified is also known as a qualified tax-exempt obligation."}})

(def resultsIn
  {:db/ident :fibo-bp-iss-dbti/resultsIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "results in"},
   :rdfs/range :fibo-bp-iss-pmbs/PotentialTranchedIssueUnderwriter})

(def underwriterTakedownAmount
  {:db/ident :fibo-bp-iss-dbti/underwriterTakedownAmount,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-dbti/UnderwriterTakedownForDebt,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "underwriter takedown amount"},
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Takedown amount of the security handled by the underwriter(that will be brought into DTC)."}})

(def urn:uuid:368f304b-8918-5c82-86d4-7f9f1052f809
  {:cmns-av/copyright "Copyright (c) 2013-2023 EDM Council, Inc.",
   :dcterms/abstract
   "General issuance process for issuance of debt instruments. Forms the basis for more detailed issuance processes such as MBS issuance and municipal bonds issue.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Securities/Pools/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Documents/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/QuantitiesAndUnits/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BP/SecuritiesIssuance/MuniIssuance/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Securities/SecuritiesIssuance/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/ProductsAndServices/FinancialProductsAndServices/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Arrangements/Lifecycles/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Debt/Bonds/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Debt/DebtInstruments/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BP/SecuritiesIssuance/IssuanceProcess/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/GoalsAndObjectives/Objectives/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Debt/PoolBackedSecurities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/DER/DerivativesContracts/RightsAndWarrants/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Agreements/Contracts/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BP/SecuritiesIssuance/DebtIssuance/"},
   :rdf/type :owl/Ontology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Debt Issuance Ontology"},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/"})