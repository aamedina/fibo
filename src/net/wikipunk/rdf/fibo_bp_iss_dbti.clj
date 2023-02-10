(ns net.wikipunk.rdf.fibo-bp-iss-dbti
  "General issuance process for issuance of debt instruments. Forms the basis for more detailed issuance processes such as MBS issuance and municipal bonds issue."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/",
   :dcterms/abstract
   "General issuance process for issuance of debt instruments. Forms the basis for more detailed issuance processes such as MBS issuance and municipal bonds issue.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Lifecycles/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BP/SecuritiesIssuance/IssuanceProcess/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Documents/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/Pools/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/Analytics/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Contracts/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/GoalsAndObjectives/Objectives/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/Bonds/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/PoolBackedSecurities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/FinancialProductsAndServices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/SecuritiesIssuance/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/DebtInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BP/SecuritiesIssuance/MuniIssuance/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/RightsAndWarrants/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/BP/SecuritiesIssuance/DebtIssuance/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
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
    "fibo-fnd-arr-doc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/",
    "fibo-fnd-arr-lif"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Lifecycles/",
    "fibo-fnd-gao-obj"
    "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/Objectives/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-alx"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
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
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/",
   :rdfa/prefix "fibo-bp-iss-dbti",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Debt Issuance Ontology"},
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright "Copyright (c) 2013-2021 EDM Council, Inc.",
   :sm/fileAbbreviation "fibo-bp-iss-dbti",
   :sm/filename "DebtIssuance.rdf"})

(def ABSSecuritizationProcess
  "a b s securitization process"
  {:db/ident :fibo-bp-iss-dbti/ABSSecuritizationProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "a b s securitization process"},
   :rdfs/subClassOf :fibo-bp-iss-dbti/PoolBackedSecuritySecuritizationProcess})

(def AdvancedRefunding
  "refunding in which bond issuance in which new bonds are sold at a lower rate than outstanding ones"
  {:db/ident :fibo-bp-iss-dbti/AdvancedRefunding,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The proceeds are then invested, and when the older bonds become callable they are paid off with the invested proceeds."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "advance refunding"},
   :rdfs/subClassOf :fibo-bp-iss-dbti/RefundingPurpose,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "refunding in which bond issuance in which new bonds are sold at a lower rate than outstanding ones"}})

(def AssetPoolCreationProcess
  "asset pool creation process"
  {:db/ident :fibo-bp-iss-dbti/AssetPoolCreationProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "asset pool creation process"},
   :rdfs/subClassOf {:owl/onProperty :fibo-fbc-pas-fpas/precedes,
                     :owl/someValuesFrom
                     :fibo-bp-iss-dbti/DebtSecuritizationProcess,
                     :rdf/type :owl/Restriction}})

(def BondIssuanceProgramme
  "a debt issuance programe under which an entity may, from time to time, issue bonds under the terms and conditions specified in the base prospectus for that programme"
  {:db/ident :fibo-bp-iss-dbti/BondIssuanceProgramme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "bond issuance programme"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/comprises,
                      :owl/someValuesFrom :fibo-bp-iss-dbti/BondOffering,
                      :rdf/type           :owl/Restriction}
                     :fibo-bp-iss-dbti/DebtIssuanceProgramme],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "a debt issuance programe under which an entity may, from time to time, issue bonds under the terms and conditions specified in the base prospectus for that programme"}})

(def BondOffering
  "a debt offering of one or more bonds, as all or part of an issuance programme"
  {:db/ident :fibo-bp-iss-dbti/BondOffering,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "bond offering"},
   :rdfs/subClassOf :fibo-sec-dbt-dbti/DebtOffering,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "a debt offering of one or more bonds, as all or part of an issuance programme"}})

(def BondOfferingWithWarrant
  "a bond offering where the issue includes a warrant; Further notes: ISO 10962 CFI definition is A bond that is issued together with one or more warrant(s) attached as part of the offer, the warrant(s) granting the holder the right to purchase a designated security, often the common stock of the issuer of the debt, at a specified price. Review notes: This need not be any specific type of bond. The warrant is used as a sweetener to encourage people to subscribe to a new bond issue. The Bond and the Warrant trade together as a unit (called \"Bond Unit\")."
  {:db/ident :fibo-bp-iss-dbti/BondOfferingWithWarrant,
   :owl/disjointWith :fibo-bp-iss-dbti/MediumTermNoteOffering,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "bond offering with warrant"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/appliesTo,
                      :owl/someValuesFrom {:owl/unionOf
                                           [:fibo-der-drc-raw/TraditionalWarrant
                                            :fibo-sec-dbt-bnd/Bond],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}
                     :fibo-bp-iss-dbti/BondOffering],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "a bond offering where the issue includes a warrant; Further notes: ISO 10962 CFI definition is A bond that is issued together with one or more warrant(s) attached as part of the offer, the warrant(s) granting the holder the right to purchase a designated security, often the common stock of the issuer of the debt, at a specified price. Review notes: This need not be any specific type of bond. The warrant is used as a sweetener to encourage people to subscribe to a new bond issue. The Bond and the Warrant trade together as a unit (called \"Bond Unit\")."}})

(def CDOSecuritizationProcess
  "c d o securitization process"
  {:db/ident :fibo-bp-iss-dbti/CDOSecuritizationProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "c d o securitization process"},
   :rdfs/subClassOf :fibo-bp-iss-dbti/DebtSecuritizationProcess})

(def CompletedDebtsPool
  "completed debts pool"
  {:db/ident :fibo-bp-iss-dbti/CompletedDebtsPool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "completed debts pool"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-arr-lif/hasStage,
                      :owl/someValuesFrom :fibo-bp-iss-dbti/InIssuance,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-sec-pls/DebtPool]})

(def CreditCardPoolCreationProcess
  "credit card pool creation process"
  {:db/ident :fibo-bp-iss-dbti/CreditCardPoolCreationProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "credit card pool creation process"},
   :rdfs/subClassOf :fibo-bp-iss-dbti/RetailAssetPoolCreationProcess})

(def DebtInstrumentPoolCreationProcess
  "debt instrument pool creation process"
  {:db/ident :fibo-bp-iss-dbti/DebtInstrumentPoolCreationProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "debt instrument pool creation process"},
   :rdfs/subClassOf :fibo-bp-iss-dbti/AssetPoolCreationProcess})

(def DebtIssuanceProcessInformation
  "information specific to the issuance of a debt security"
  {:db/ident :fibo-bp-iss-dbti/DebtIssuanceProcessInformation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "debt issuance process information"},
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-bp-iss-dbti/hasDebtIssuancePurpose,
     :owl/someValuesFrom :fibo-bp-iss-dbti/DebtIssuancePurpose,
     :rdf/type           :owl/Restriction}
    :fibo-bp-iss-prc/TradedInstrumentIssuanceProcessInformation],
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "information specific to the issuance of a debt security"}})

(def DebtIssuanceProgramme
  "a series of debt security issuances over time"
  {:db/ident :fibo-bp-iss-dbti/DebtIssuanceProgramme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "debt issuance programme"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/comprises,
                      :owl/someValuesFrom :fibo-sec-dbt-dbti/DebtOffering,
                      :rdf/type           :owl/Restriction}
                     :fibo-bp-iss-prc/IssuanceProgramme],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "a series of debt security issuances over time"}})

(def DebtIssuancePurpose
  "purpose for the issuance of a debt security; also defines processes to be followed in some instances"
  {:db/ident :fibo-bp-iss-dbti/DebtIssuancePurpose,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "debt issuance purpose"},
   :rdfs/subClassOf :fibo-fnd-gao-obj/Objective,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "purpose for the issuance of a debt security; also defines processes to be followed in some instances"}})

(def DebtSecuritizationProcess
  "debt securitization process"
  {:db/ident :fibo-bp-iss-dbti/DebtSecuritizationProcess,
   :owl/disjointWith [:fibo-bp-iss-muni/SecuritiesUnderwritingIssuanceProcess
                      :fibo-bp-iss-muni/DebtAuctionProcess],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "debt securitization process"},
   :rdfs/subClassOf :fibo-bp-iss-prc/SecuritiesIssuanceProcess})

(def HomeEquityLineOfCreditPoolCreationProcess
  "home equity line of credit pool creation process"
  {:db/ident :fibo-bp-iss-dbti/HomeEquityLineOfCreditPoolCreationProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value "home equity line of credit pool creation process"},
   :rdfs/subClassOf :fibo-bp-iss-dbti/RetailAssetPoolCreationProcess})

(def InAssembly
  "in assembly"
  {:db/ident :fibo-bp-iss-dbti/InAssembly,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "in assembly"},
   :rdfs/subClassOf :fibo-bp-iss-pmbs/PoolLifecycleStateSelection})

(def InAssemblyDebtsPool
  "in assembly debts pool"
  {:db/ident :fibo-bp-iss-dbti/InAssemblyDebtsPool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "in assembly debts pool"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-arr-lif/hasStage,
                      :owl/someValuesFrom :fibo-bp-iss-dbti/InAssembly,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-sec-pls/DebtPool]})

(def InIssuance
  "in issuance"
  {:db/ident :fibo-bp-iss-dbti/InIssuance,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "in issuance"},
   :rdfs/subClassOf :fibo-bp-iss-pmbs/PoolLifecycleStateSelection})

(def IssuanceProcessActivity
  "An activity within the process of securities issuance."
  {:db/ident :fibo-bp-iss-dbti/IssuanceProcessActivity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "issuance process activity"},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "An activity within the process of securities issuance."}})

(def Issued
  "issued"
  {:db/ident :fibo-bp-iss-dbti/Issued,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "issued"},
   :rdfs/subClassOf :fibo-bp-iss-pmbs/PoolLifecycleStateSelection})

(def LoanPoolCreationProcess
  "loan pool creation process"
  {:db/ident :fibo-bp-iss-dbti/LoanPoolCreationProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "loan pool creation process"},
   :rdfs/subClassOf :fibo-bp-iss-dbti/RetailAssetPoolCreationProcess})

(def MTNRegistration
  "m t n registration"
  {:db/ident :fibo-bp-iss-dbti/MTNRegistration,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "m t n registration"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-arr-doc/isAbout,
                      :owl/someValuesFrom
                      :fibo-bp-iss-dbti/MediumTermNoteIssuanceProgramme,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-muni/Registration]})

(def MediumTermNoteIssuanceProgramme
  "a program of offerings of medium term notes; a set of issues where the maturity is defined after the rest of the terms have been registered with some authority; these are registered up front so that then the company wants to borrow more money they don't have to go through the registration period but have the facility up front to issue another security."
  {:db/ident :fibo-bp-iss-dbti/MediumTermNoteIssuanceProgramme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "medium term note issuance programme"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-rel-rel/comprises,
                      :owl/someValuesFrom
                      :fibo-bp-iss-dbti/MediumTermNoteOffering,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-dbti/BondIssuanceProgramme],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "a program of offerings of medium term notes; a set of issues where the maturity is defined after the rest of the terms have been registered with some authority; these are registered up front so that then the company wants to borrow more money they don't have to go through the registration period but have the facility up front to issue another security."}})

(def MediumTermNoteOffering
  "medium term note offering"
  {:db/ident :fibo-bp-iss-dbti/MediumTermNoteOffering,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "medium term note offering"},
   :rdfs/subClassOf :fibo-bp-iss-dbti/BondOffering})

(def MuniIssueUnderwriter
  "The party which agrees to buy any certificates that are not bought by investors Term origin:DTCC"
  {:db/ident :fibo-bp-iss-dbti/MuniIssueUnderwriter,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "muni issue underwriter"},
   :rdfs/subClassOf :fibo-sec-sec-iss/SecurityUnderwriter,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The party which agrees to buy any certificates that are not bought by investors Term origin:DTCC"}})

(def NewMoneyPurpose
  "securities issued to raise funds for a new project or purpose"
  {:db/ident :fibo-bp-iss-dbti/NewMoneyPurpose,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "new money purpose"},
   :rdfs/subClassOf :fibo-bp-iss-dbti/DebtIssuancePurpose,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "securities issued to raise funds for a new project or purpose"}})

(def NotYetIssued
  "not yet issued"
  {:db/ident :fibo-bp-iss-dbti/NotYetIssued,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "not yet issued"},
   :rdfs/subClassOf :fibo-bp-iss-pmbs/PoolLifecycleStateSelection})

(def NotYetIssuedDebtsPool
  "not yet issued debts pool"
  {:db/ident :fibo-bp-iss-dbti/NotYetIssuedDebtsPool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "not yet issued debts pool"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-arr-lif/hasStage,
                      :owl/someValuesFrom :fibo-bp-iss-dbti/NotYetIssued,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-sec-pls/DebtPool]})

(def PoolBackedSecuritySecuritizationProcess
  "pool backed security securitization process"
  {:db/ident :fibo-bp-iss-dbti/PoolBackedSecuritySecuritizationProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "pool backed security securitization process"},
   :rdfs/subClassOf :fibo-bp-iss-dbti/DebtSecuritizationProcess})

(def PoolBackedSecuritySecuritizationProcessActor
  "pool backed security securitization process actor"
  {:db/ident :fibo-bp-iss-dbti/PoolBackedSecuritySecuritizationProcessActor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value "pool backed security securitization process actor"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-rel-rel/evaluates,
                      :owl/someValuesFrom
                      :fibo-bp-iss-prc/IssuanceProcessActivity,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-dbti/SecuritizationProcessActor]})

(def RefundingPurpose
  "a procedure whereby an issuer refinances outstanding bonds by issuing new bonds"
  {:db/ident :fibo-bp-iss-dbti/RefundingPurpose,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "refunding purpose"},
   :rdfs/subClassOf :fibo-bp-iss-dbti/DebtIssuancePurpose,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "a procedure whereby an issuer refinances outstanding bonds by issuing new bonds"}})

(def RemarketingPurpose
  "the process of reselling securities to the public that have been tendered for purchase by the previous owners thereof"
  {:db/ident :fibo-bp-iss-dbti/RemarketingPurpose,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "remarketing purpose"},
   :rdfs/subClassOf :fibo-bp-iss-dbti/DebtIssuancePurpose,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "the process of reselling securities to the public that have been tendered for purchase by the previous owners thereof"}})

(def RetailAssetPoolCreationProcess
  "The process by which pools of assets are created. These may then be used in the issue of securities based on those asset pools as underlying."
  {:db/ident :fibo-bp-iss-dbti/RetailAssetPoolCreationProcess,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "retail asset pool creation process"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/isProducedBy,
                      :owl/someValuesFrom :fibo-sec-sec-pls/DebtPool,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-fbc-pas-fpas/precedes,
                      :owl/someValuesFrom
                      :fibo-bp-iss-dbti/PoolBackedSecuritySecuritizationProcess,
                      :rdf/type :owl/Restriction}
                     :fibo-bp-iss-dbti/AssetPoolCreationProcess],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The process by which pools of assets are created. These may then be used in the issue of securities based on those asset pools as underlying."}})

(def SecuritizationProcessActor
  "securitization process actor"
  {:db/ident :fibo-bp-iss-dbti/SecuritizationProcessActor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "securitization process actor"},
   :rdfs/subClassOf :fibo-bp-iss-prc/SecuritiesIssuanceProcessActor})

(def UnderwriterTakedownForDebt
  "information on takedown quantity of the debt security handled by the underwriter (that will be brought into DTC)"
  {:db/ident :fibo-bp-iss-dbti/UnderwriterTakedownForDebt,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "underwriter takedown for debt"},
   :rdfs/subClassOf :fibo-bp-iss-prc/UnderwriterTakedown,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "information on takedown quantity of the debt security handled by the underwriter (that will be brought into DTC)"}})

(def announces
  "The issue of one or more securities that the announcement pertains to."
  {:db/ident :fibo-bp-iss-dbti/announces,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "announces"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The issue of one or more securities that the announcement pertains to."}})

(def hasDebtIssuancePurpose
  "has debt issuance purpose"
  {:db/ident :fibo-bp-iss-dbti/hasDebtIssuancePurpose,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-dbti/DebtIssuanceProcessInformation,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has debt issuance purpose"},
   :rdfs/range :fibo-bp-iss-dbti/DebtIssuancePurpose})

(def hasOriginalIssueDiscount
  "discount from par value at the time a bond or other debt instrument is issued"
  {:db/ident :fibo-bp-iss-dbti/hasOriginalIssueDiscount,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The OID is the difference between the stated redemption price at maturity and the actual issue price."},
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-dbti/BondOffering,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has original issue discount"},
   :rdfs/range :fibo-fnd-utl-alx/Percentage,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "discount from par value at the time a bond or other debt instrument is issued"}})

(def isBankQualified
  "designation given to a public purpose bond offering by the issuer if it reasonably expects to issue in the calendar year of such offering no more than $10 million par amount of bonds of the type required to be included in making such calculation under the Internal Revenue Code.  When purchased by a commercial bank for its portfolio, the bank may receive an 80% tax deduction for the interest cost of carry for the issue.  A bond that is bank qualified is also known as a qualified tax-exempt obligation."
  {:db/ident :fibo-bp-iss-dbti/isBankQualified,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-bp-iss-dbti/BondOffering,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is bank qualified"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "designation given to a public purpose bond offering by the issuer if it reasonably expects to issue in the calendar year of such offering no more than $10 million par amount of bonds of the type required to be included in making such calculation under the Internal Revenue Code.  When purchased by a commercial bank for its portfolio, the bank may receive an 80% tax deduction for the interest cost of carry for the issue.  A bond that is bank qualified is also known as a qualified tax-exempt obligation."}})

(def resultsIn
  "results in"
  {:db/ident :fibo-bp-iss-dbti/resultsIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "results in"},
   :rdfs/range :fibo-bp-iss-pmbs/PotentialTranchedIssueUnderwriter})

(def underwriterTakedownAmount
  "Takedown amount of the security handled by the underwriter(that will be brought into DTC)."
  {:db/ident :fibo-bp-iss-dbti/underwriterTakedownAmount,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-bp-iss-dbti/UnderwriterTakedownForDebt,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "underwriter takedown amount"},
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Takedown amount of the security handled by the underwriter(that will be brought into DTC)."}})

(def ^{:private true} DebtOffering
  {:db/ident        :fibo-sec-dbt-dbti/DebtOffering,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [{:owl/onProperty     :fibo-sec-sec-iss/isUnderwrittenBy,
                      :owl/someValuesFrom :fibo-sec-sec-iss/SecurityUnderwriter,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-fnd-rel-rel/appliesTo,
                      :owl/someValuesFrom
                      :fibo-sec-dbt-dbti/TradableDebtInstrument,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-agr-ctr/isEvidencedBy,
                      :owl/someValuesFrom :fibo-sec-sec-iss/Prospectus,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onClass    :fibo-fnd-acc-cur/MonetaryAmount,
                      :owl/onProperty :fibo-fbc-pas-fpas/hasOfferingAmount,
                      :rdf/type       :owl/Restriction}]})