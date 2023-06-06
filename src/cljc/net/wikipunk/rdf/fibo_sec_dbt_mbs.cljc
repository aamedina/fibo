(ns net.wikipunk.rdf.fibo-sec-dbt-mbs
  "Mortgage backed securities are like asset backed securities except that the underlying loan pool is a pool of mortgage loans."
  {:cmns-av/copyright "Copyright (c) 2015-2023 EDM Council, Inc.",
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :dcterms/abstract
   "Mortgage backed securities are like asset backed securities except that the underlying loan pool is a pool of mortgage loans.",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/CollateralizedDebtObligations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/FunctionalEntities/FunctionalEntities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/ProductsAndServices/PaymentsAndSchedules/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LegalPersons/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/OwnershipAndControl/Ownership/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Funds/Funds/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/DebtAndEquities/Debt/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/SecuritiesIssuance/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Lifecycles/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/PoolBackedSecurities/"
    "https://www.omg.org/spec/Commons/Classifiers/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Parties/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/AssetBackedSecurities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Contracts/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BP/SecuritiesIssuance/DebtIssuance/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/LOAN/RealEstateLoans/MortgageLoans/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/FinancialServicesEntities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/DebtInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/BusinessDates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/Pools/"
    "https://www.omg.org/spec/Commons/Collections/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/MortgageBackedSecurities/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-fct-fct"
    "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/FunctionalEntities/",
    "fibo-be-le-lp"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/",
    "fibo-bp-iss-dbti"
    "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/",
    "fibo-fbc-dae-dbt"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
    "fibo-fbc-fct-fse"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/",
    "fibo-fbc-fi-fi"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
    "fibo-fnd-arr-lif"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Lifecycles/",
    "fibo-fnd-dt-bd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/BusinessDates/",
    "fibo-fnd-dt-fd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
    "fibo-fnd-oac-own"
    "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Ownership/",
    "fibo-fnd-pas-psch"
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-loan-reln-mtg"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
    "fibo-sec-dbt-abs"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/AssetBackedSecurities/",
    "fibo-sec-dbt-cdo"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
    "fibo-sec-dbt-dbti"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/",
    "fibo-sec-dbt-mbs"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
    "fibo-sec-dbt-pbs"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/PoolBackedSecurities/",
    "fibo-sec-sec-iss"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/",
    "fibo-sec-sec-pls"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Pools/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-sec-dbt-mbs",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "Mortgage-backed Securities Ontology@en"})

(def AgencyMBSDeal
  "An issue of securities backed by pools of mortgages held by government agencies."
  {:cmns-av/explanatoryNote
   #voc/lstr
    "These are Ginnie Mae, Freddie Mac and Fannie Mae (for the US). Of these agencies, GNMA (Ginnie Mae) issues mortgages in its own right (Investorwords differs on this). Fannie Mae and Freddie Mac purchase mortgages. Those mortgages are issued by banks. Before one of these agencies purchases a mortgage, there are certain criteria that have to be met. These are specified in terms of, for example, the balance of the mortgage, limits to credit ratings.@en",
   :db/ident :fibo-sec-dbt-mbs/AgencyMBSDeal,
   :owl/disjointWith :fibo-sec-dbt-mbs/PrivateLabelMBSDeal,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "agency m b s deal@en",
   :rdfs/subClassOf [:fibo-sec-dbt-dbti/DebtOffering
                     :fibo-sec-dbt-mbs/AgencyMBSDeal],
   :skos/definition
   #voc/lstr
    "An issue of securities backed by pools of mortgages held by government agencies.@en"})

(def AgencyMBSIssuer
  "The issuer of the pass through MBS is an Agency issuer. This is identified as being some kind of agency that is set up specifically to issue these instruments."
  {:db/ident :fibo-sec-dbt-mbs/AgencyMBSIssuer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "agency m b s issuer@en",
   :rdfs/subClassOf [:fibo-sec-dbt-mbs/MBSIssuer
                     :fibo-sec-dbt-mbs/GovernmentMortgageAgency
                     :fibo-sec-dbt-mbs/AgencyMBSIssuer
                     {:owl/onProperty     :fibo-fnd-rel-rel/hasIdentity,
                      :owl/someValuesFrom :fibo-be-le-lp/LegalEntity,
                      :rdf/type           :owl/Restriction}
                     :fibo-be-fct-fct/FunctionalEntity
                     :fibo-fbc-fi-fi/Issuer
                     {:owl/unionOf [:fibo-sec-dbt-mbs/GovernmentMortgageAgency
                                    :fibo-fbc-fct-fse/Bank
                                    :fibo-sec-dbt-mbs/SpecialistMortgageIssuer],
                      :rdf/type    :owl/Class}],
   :skos/definition
   #voc/lstr
    "The issuer of the pass through MBS is an Agency issuer. This is identified as being some kind of agency that is set up specifically to issue these instruments.@en"})

(def AgencyMBSPool
  "A pool investment consisting of a collection of Agency MBS instruments."
  {:cmns-av/explanatoryNote
   #voc/lstr
    "This pool may be used as the underlying for an agency CMO. Non agency CMOs do not exist.@en",
   :db/ident :fibo-sec-dbt-mbs/AgencyMBSPool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "agency m b s pool@en",
   :rdfs/subClassOf [:fibo-sec-dbt-mbs/MBSPool
                     :fibo-sec-dbt-mbs/AgencyMBSPool
                     :fibo-sec-sec-pls/DebtPool],
   :skos/definition
   #voc/lstr
    "A pool investment consisting of a collection of Agency MBS instruments.@en"})

(def AgencyMortgagePool
  "A pool of agency mortgages."
  {:db/ident :fibo-sec-dbt-mbs/AgencyMortgagePool,
   :owl/disjointWith :fibo-sec-dbt-mbs/NonAgencyMortgagePool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "agency mortgage pool@en",
   :rdfs/subClassOf [:fibo-sec-dbt-mbs/MortgagePool
                     :fibo-sec-dbt-mbs/AgencyMortgagePool
                     {:owl/onProperty     :cmns-col/hasConstituent,
                      :owl/someValuesFrom :fibo-loan-reln-mtg/Mortgage,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-sec-pls/DebtPool],
   :skos/definition #voc/lstr "A pool of agency mortgages.@en"})

(def CommercialMBS
  "commercial m b s"
  {:db/ident :fibo-sec-dbt-mbs/CommercialMBS,
   :owl/disjointWith :fibo-sec-dbt-mbs/ResidentialMBS,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "commercial m b s@en",
   :rdfs/subClassOf [:fibo-sec-dbt-mbs/MortgageBackedSecurity
                     :fibo-sec-dbt-mbs/CommercialMBS
                     {:owl/onProperty :cmns-cls/isCharacterizedBy,
                      :owl/someValuesFrom
                      :fibo-sec-dbt-pbs/WeightedAverageRemainingTerm,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-rel-rel/isIssuedBy,
                      :owl/someValuesFrom :fibo-sec-dbt-mbs/MBSIssuer,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-dbt-pbs/PoolBackedSecurity]})

(def FHLMC-GoldPool
  "FHLMC Gold pool"
  {:db/ident :fibo-sec-dbt-mbs/FHLMC-GoldPool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "FHLMC Gold pool@en",
   :rdfs/subClassOf [:fibo-sec-dbt-mbs/AgencyMortgagePool
                     :fibo-sec-dbt-mbs/FHLMC-GoldPool
                     {:owl/onProperty     :cmns-col/hasConstituent,
                      :owl/someValuesFrom :fibo-loan-reln-mtg/Mortgage,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-sec-pls/DebtPool
                     :fibo-sec-dbt-mbs/MortgagePool]})

(def FHLMC-Pool
  "FHLMC pool"
  {:db/ident :fibo-sec-dbt-mbs/FHLMC-Pool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "FHLMC pool@en",
   :rdfs/subClassOf [:fibo-sec-dbt-mbs/AgencyMortgagePool
                     :fibo-sec-dbt-mbs/FHLMC-Pool
                     {:owl/onProperty     :cmns-col/hasConstituent,
                      :owl/someValuesFrom :fibo-loan-reln-mtg/Mortgage,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-sec-pls/DebtPool
                     :fibo-sec-dbt-mbs/MortgagePool]})

(def FNMA-Pool
  "FNMA pool"
  {:db/ident :fibo-sec-dbt-mbs/FNMA-Pool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "FNMA pool@en",
   :rdfs/subClassOf [:fibo-sec-dbt-mbs/AgencyMortgagePool
                     :fibo-sec-dbt-mbs/FNMA-Pool
                     {:owl/onProperty     :cmns-col/hasConstituent,
                      :owl/someValuesFrom :fibo-loan-reln-mtg/Mortgage,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-sec-pls/DebtPool
                     :fibo-sec-dbt-mbs/MortgagePool]})

(def FloaterTranche
  "A floater tranche is a tranche that is keyed to an index and a spread."
  {:cmns-av/explanatoryNote
   #voc/lstr
    "For example, 3 month LIBOR +50 -- meaning that the coupon would be whatever the 3 month LIBOR is plus 50 basis points. This is not a continuously updated number, rather it resets at specified intervals.@en",
   :db/ident :fibo-sec-dbt-mbs/FloaterTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "floater tranche@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-dt-fd/hasRecurrenceInterval,
     :owl/someValuesFrom :fibo-fnd-dt-bd/DayOfMonth,
     :rdf/type           :owl/Restriction}
    :fibo-sec-dbt-mbs/TranchedMBSInstrument
    :fibo-sec-dbt-mbs/FloaterTranche
    {:owl/onProperty     :cmns-cls/isCharacterizedBy,
     :owl/someValuesFrom :fibo-sec-dbt-pbs/WeightedAverageRemainingTerm,
     :rdf/type           :owl/Restriction}
    {:owl/allValuesFrom :fibo-sec-dbt-mbs/TranchedMBSInstrument,
     :owl/onProperty    :fibo-sec-dbt-mbs/providesCreditSupportTo,
     :rdf/type          :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-rel-rel/isIssuedBy,
     :owl/someValuesFrom :fibo-sec-dbt-mbs/MBSIssuer,
     :rdf/type           :owl/Restriction}
    :fibo-sec-dbt-mbs/MortgageBackedSecurity
    {:owl/onProperty     :fibo-sec-dbt-mbs/hasNote,
     :owl/someValuesFrom :fibo-sec-dbt-mbs/MBSTrancheNote,
     :rdf/type           :owl/Restriction}
    :fibo-sec-dbt-pbs/PoolBackedSecurity
    {:owl/allValuesFrom :fibo-sec-dbt-mbs/TranchedMBSInstrument,
     :owl/onProperty    :fibo-sec-dbt-mbs/cashflowPrecedence,
     :rdf/type          :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "A floater tranche is a tranche that is keyed to an index and a spread.@en"})

(def GNMA-IIPool
  "GNMA-II pool"
  {:db/ident :fibo-sec-dbt-mbs/GNMA-IIPool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "GNMA-II pool@en",
   :rdfs/subClassOf [:fibo-sec-dbt-mbs/AgencyMortgagePool
                     :fibo-sec-dbt-mbs/GNMA-IIPool
                     {:owl/onProperty     :cmns-col/hasConstituent,
                      :owl/someValuesFrom :fibo-loan-reln-mtg/Mortgage,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-sec-pls/DebtPool
                     :fibo-sec-dbt-mbs/MortgagePool]})

(def GNMA-PlatinumPool
  "GNMA Platinum pool"
  {:db/ident :fibo-sec-dbt-mbs/GNMA-PlatinumPool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "GNMA Platinum pool@en",
   :rdfs/subClassOf [:fibo-sec-dbt-mbs/AgencyMortgagePool
                     :fibo-sec-dbt-mbs/GNMA-PlatinumPool
                     {:owl/onProperty     :cmns-col/hasConstituent,
                      :owl/someValuesFrom :fibo-loan-reln-mtg/Mortgage,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-sec-pls/DebtPool
                     :fibo-sec-dbt-mbs/MortgagePool]})

(def GNMA-iPool
  "GNMA-i pool"
  {:db/ident :fibo-sec-dbt-mbs/GNMA-iPool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "GNMA-i pool@en",
   :rdfs/subClassOf [:fibo-sec-dbt-mbs/AgencyMortgagePool
                     :fibo-sec-dbt-mbs/GNMA-iPool
                     {:owl/onProperty     :cmns-col/hasConstituent,
                      :owl/someValuesFrom :fibo-loan-reln-mtg/Mortgage,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-sec-pls/DebtPool
                     :fibo-sec-dbt-mbs/MortgagePool]})

(def GovernmentMortgageAgency
  "An agency set up by a government for the purpose of issuing mortgages."
  {:db/ident :fibo-sec-dbt-mbs/GovernmentMortgageAgency,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "government mortgage agency@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/hasIdentity,
                      :owl/someValuesFrom :fibo-be-le-lp/LegalEntity,
                      :rdf/type           :owl/Restriction}
                     :fibo-be-fct-fct/FunctionalEntity
                     :fibo-sec-dbt-mbs/GovernmentMortgageAgency],
   :skos/definition
   #voc/lstr
    "An agency set up by a government for the purpose of issuing mortgages.@en",
   :skos/editorialNote
   #voc/lstr
    "Note on the original property 'takes form of' (replaced by a restriction): The form which the Government Mortgage Agency takes. This is a Legal Entity and not a Natural Person, that is, it is an Artificial Person.@en",
   :skos/scopeNote
   #voc/lstr
    "These exist in the USA and may also exist now or in future in other countries. There are three such agencies in thr USA: FNMA, GNMA and FHLMC (Fannie Mae, Ginnie Mae and Freddie Mac respectively).@en"})

(def InverseFloaterTranche
  "inverse floater tranche"
  {:db/ident :fibo-sec-dbt-mbs/InverseFloaterTranche,
   :owl/disjointWith [:fibo-sec-dbt-mbs/SuperFloaterTranche
                      :fibo-sec-dbt-mbs/RegularFloaterTranche],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "inverse floater tranche@en",
   :rdfs/subClassOf
   [:fibo-sec-dbt-mbs/FloaterTranche
    :fibo-sec-dbt-mbs/InverseFloaterTranche
    {:owl/onProperty     :cmns-cls/isCharacterizedBy,
     :owl/someValuesFrom :fibo-sec-dbt-pbs/WeightedAverageRemainingTerm,
     :rdf/type           :owl/Restriction}
    :fibo-sec-dbt-mbs/TranchedMBSInstrument
    {:owl/allValuesFrom :fibo-sec-dbt-mbs/TranchedMBSInstrument,
     :owl/onProperty    :fibo-sec-dbt-mbs/providesCreditSupportTo,
     :rdf/type          :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-rel-rel/isIssuedBy,
     :owl/someValuesFrom :fibo-sec-dbt-mbs/MBSIssuer,
     :rdf/type           :owl/Restriction}
    :fibo-sec-dbt-mbs/MortgageBackedSecurity
    {:owl/onProperty     :fibo-sec-dbt-mbs/hasNote,
     :owl/someValuesFrom :fibo-sec-dbt-mbs/MBSTrancheNote,
     :rdf/type           :owl/Restriction}
    :fibo-sec-dbt-pbs/PoolBackedSecurity
    {:owl/onProperty     :fibo-fnd-dt-fd/hasRecurrenceInterval,
     :owl/someValuesFrom :fibo-fnd-dt-bd/DayOfMonth,
     :rdf/type           :owl/Restriction}
    {:owl/allValuesFrom :fibo-sec-dbt-mbs/TranchedMBSInstrument,
     :owl/onProperty    :fibo-sec-dbt-mbs/cashflowPrecedence,
     :rdf/type          :owl/Restriction}]})

(def IssuedAndSecuritizedAgencyMortagePool
  "An agency mortgage pool which has been securitized as part of an agency Mortgage Backed Security."
  {:db/ident :fibo-sec-dbt-mbs/IssuedAndSecuritizedAgencyMortagePool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "issued and securitized agency mortage pool@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-arr-lif/hasStage,
                      :owl/someValuesFrom :fibo-bp-iss-dbti/Issued,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-dbt-mbs/AgencyMortgagePool
                     :fibo-sec-dbt-mbs/IssuedAndSecuritizedAgencyMortagePool
                     {:owl/onProperty     :cmns-col/hasConstituent,
                      :owl/someValuesFrom :fibo-loan-reln-mtg/Mortgage,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-sec-pls/DebtPool
                     :fibo-sec-dbt-mbs/MortgagePool],
   :skos/definition
   #voc/lstr
    "An agency mortgage pool which has been securitized as part of an agency Mortgage Backed Security.@en"})

(def IssuedAndSecuritizedNonAgencyMortgagePool
  "A non agency mortgage pool which has been securitized as part of a tranched Mortgage Backed Security."
  {:db/ident :fibo-sec-dbt-mbs/IssuedAndSecuritizedNonAgencyMortgagePool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "issued and securitized non agency mortgage pool@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-arr-lif/hasStage,
                      :owl/someValuesFrom :fibo-bp-iss-dbti/Issued,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-dbt-mbs/NonAgencyMortgagePool
                     :fibo-sec-dbt-mbs/IssuedAndSecuritizedNonAgencyMortgagePool
                     {:owl/onProperty     :cmns-col/hasConstituent,
                      :owl/someValuesFrom :fibo-loan-reln-mtg/Mortgage,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-sec-pls/DebtPool
                     :fibo-sec-dbt-mbs/MortgagePool],
   :skos/definition
   #voc/lstr
    "A non agency mortgage pool which has been securitized as part of a tranched Mortgage Backed Security.@en"})

(def MBSIssuer
  "The issuer of a Mortgage Backed Security."
  {:cmns-av/explanatoryNote
   #voc/lstr
    "This can be an agency that exists for this purpose or it may be the issuer of the original mortgages in the pool.@en",
   :db/ident :fibo-sec-dbt-mbs/MBSIssuer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "m b s issuer@en",
   :rdfs/subClassOf [{:owl/unionOf [:fibo-sec-dbt-mbs/GovernmentMortgageAgency
                                    :fibo-fbc-fct-fse/Bank
                                    :fibo-sec-dbt-mbs/SpecialistMortgageIssuer],
                      :rdf/type    :owl/Class}
                     :fibo-fbc-fi-fi/Issuer
                     :fibo-sec-dbt-mbs/MBSIssuer],
   :skos/definition #voc/lstr "The issuer of a Mortgage Backed Security.@en"})

(def MBSPool
  "A pool investment consisting of a collection of MBS instruments."
  {:db/ident :fibo-sec-dbt-mbs/MBSPool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "m b s pool@en",
   :rdfs/subClassOf [:fibo-sec-sec-pls/DebtPool :fibo-sec-dbt-mbs/MBSPool],
   :skos/definition
   #voc/lstr
    "A pool investment consisting of a collection of MBS instruments.@en"})

(def MBSTrancheNote
  "An individual note of a tranche."
  {:cmns-av/explanatoryNote
   #voc/lstr
    "A Tranche is made up of e.g. $500m in notes and so on. These may be in different notes, with different denominations. Analytics that would apply to the Tranche would by implication apply to each slice of the tranche.@en",
   :db/ident :fibo-sec-dbt-mbs/MBSTrancheNote,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "m b s tranche note@en",
   :rdfs/subClassOf [:fibo-fbc-dae-dbt/PromissoryNote
                     :fibo-sec-dbt-mbs/MBSTrancheNote],
   :skos/definition #voc/lstr "An individual note of a tranche.@en"})

(def MezzanineMBSTranche
  "Specific kinds of tranche are modeled for example and investigation only and have been removed from the diagrams. These will be removed from the final model."
  {:db/ident :fibo-sec-dbt-mbs/MezzanineMBSTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "mezzanine m b s tranche@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-sec-dbt-mbs/seniorTo,
     :owl/someValuesFrom :fibo-sec-dbt-mbs/SubordinatedMBSTranche,
     :rdf/type           :owl/Restriction}
    :fibo-sec-dbt-mbs/TranchedMBSInstrument
    :fibo-sec-dbt-mbs/MezzanineMBSTranche
    {:owl/onProperty     :cmns-cls/isCharacterizedBy,
     :owl/someValuesFrom :fibo-sec-dbt-pbs/WeightedAverageRemainingTerm,
     :rdf/type           :owl/Restriction}
    {:owl/allValuesFrom :fibo-sec-dbt-mbs/TranchedMBSInstrument,
     :owl/onProperty    :fibo-sec-dbt-mbs/providesCreditSupportTo,
     :rdf/type          :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-rel-rel/isIssuedBy,
     :owl/someValuesFrom :fibo-sec-dbt-mbs/MBSIssuer,
     :rdf/type           :owl/Restriction}
    :fibo-sec-dbt-mbs/MortgageBackedSecurity
    {:owl/onProperty     :fibo-sec-dbt-mbs/hasNote,
     :owl/someValuesFrom :fibo-sec-dbt-mbs/MBSTrancheNote,
     :rdf/type           :owl/Restriction}
    :fibo-sec-dbt-pbs/PoolBackedSecurity
    {:owl/allValuesFrom :fibo-sec-dbt-mbs/TranchedMBSInstrument,
     :owl/onProperty    :fibo-sec-dbt-mbs/cashflowPrecedence,
     :rdf/type          :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "Specific kinds of tranche are modeled for example and investigation only and have been removed from the diagrams. These will be removed from the final model.@en"})

(def MortgageBackedSecurity
  "debt obligations that represent claims to the cash flows from pools of mortgage loans, most commonly on residential property"
  {:cmns-av/abbreviation #voc/lstr "MBS@en",
   :cmns-av/adaptedFrom
   "ISO 10962, Securities and related financial instruments - Classification of Financial Instruments (CFI code), Fourth edition, 2019-10-01.",
   :cmns-av/explanatoryNote
   "Mortgage loans are purchased from banks, mortgage companies and other originators, and then assembled into pools by a governmental, quasigovernmental or private entity. The entity then issues securities that represent claims on the principal and interest payments made by borrowers on the loans in the pool, a process known as securitization.",
   :db/ident :fibo-sec-dbt-mbs/MortgageBackedSecurity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "mortgage-backed security@en",
   :rdfs/subClassOf [:fibo-sec-dbt-pbs/PoolBackedSecurity
                     {:owl/onProperty     :fibo-fnd-rel-rel/isIssuedBy,
                      :owl/someValuesFrom :fibo-sec-dbt-mbs/MBSIssuer,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :cmns-cls/isCharacterizedBy,
                      :owl/someValuesFrom
                      :fibo-sec-dbt-pbs/WeightedAverageRemainingTerm,
                      :rdf/type :owl/Restriction}
                     :fibo-sec-dbt-mbs/MortgageBackedSecurity],
   :skos/definition
   #voc/lstr
    "debt obligations that represent claims to the cash flows from pools of mortgage loans, most commonly on residential property@en"})

(def MortgageBackedSecurityOfferingProspectus
  "Prospectus describing the terms of the issue and each of the instruments included in the mortgage backed security issue. Term origin:SMER"
  {:db/ident :fibo-sec-dbt-mbs/MortgageBackedSecurityOfferingProspectus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "mortgage-backed security offering prospectus@en",
   :rdfs/subClassOf
   [:fibo-sec-sec-iss/Prospectus
    :fibo-sec-dbt-mbs/MortgageBackedSecurityOfferingProspectus],
   :skos/definition
   #voc/lstr
    "Prospectus describing the terms of the issue and each of the instruments included in the mortgage backed security issue. Term origin:SMER@en"})

(def MortgagePool
  "loan pool consisting of mortgages that are held in trust as collateral for the issuance of a mortgage-backed security"
  {:db/ident :fibo-sec-dbt-mbs/MortgagePool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "mortgage pool@en",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-col/hasConstituent,
                      :owl/someValuesFrom :fibo-loan-reln-mtg/Mortgage,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-sec-pls/DebtPool
                     :fibo-sec-dbt-mbs/MortgagePool],
   :skos/definition
   #voc/lstr
    "loan pool consisting of mortgages that are held in trust as collateral for the issuance of a mortgage-backed security@en",
   :skos/editorialNote
   [#voc/lstr
     "The class Mortgage Pool originally had a property 'pool type' referring to a selection list of textual stylings of pool types. Those are now replaced with actual sub types of mortgage pool. Here are the original notes and definition that went with the enumerated list of pool types: \n\nThe type of pool for a pool backed security. Each of these pool types represents pools of mortgages that have conformed to certain standards (that change periodically) that make them \"conforming\" -- such as mortgage balance under a certain threshold, creditworthiness, loan-to-value, etc.\n\nFurther Notes:\nNon Agency signifies a tranched security, for which there will also be a Tranche Type for the security tranche itself. All other pool types are Agency pool types. \n\nList Populated from Cutter document Page 5. \n\nAdditional terms from Adept Advistory:\nUnder Agency mortgages, basically you have various types of pools under the various agencies. You have:\n-GNMA-I\n-GNMA-II\n-GNMA Platinum\n-FNMA \n-FHLMC\n-FHLMC Gold\nAs far as definitions:The simple definition is that each of these pool types represents pools of mortgages that have conformed to certain standards (that change periodically) that make them \"conforming\" -- such as mortgage balance under a certain threshold, creditworthiness, loan-to-value, etc. Also, GNMA is explicitly backed by the US government, while FNMA and FHLMC are only implicitly backed by the US government. Perhaps there needs to be some research done on the parameters for what makes a loan conforming or not. \n\nConsensus:Review.@en"
    #voc/lstr
     "Analytics review session notes: Dated facts (for non agency mortgage pools): Aggregate of : Scheduled payments (% and $) Payments Prepayments (% and $ notional) Default amounts (statistics: Prepayments: (start at 0 and ramp up and then level off (why?)) SMM basic measure monthly Basis CPR C? Prepayment Rate based on SMM annualised PSA based on CPR takes the COR and applies a curve to the rate of prepayments on the model. (%) e.g. 100% PSA is applied to model. 200% PSA implies x%CPR per month Tries to reflect how prepayments in a pool will accelerate and then burn out. This reflects the nature of a mortgage pool, elgl why people will prepay, refinance, address selection and so on i.e. local economy facts. so those will drop out of the pool and you are left with those who will not. that's why it levels off. So who originates these figures? Is it measured ongoing?: No . Used to determine a pricing speed when marketing the security to investors. So this is part of the primary market / issuance where there is marketing. These are the estimated figures as they will be at issue. PSA may also be used as triggers. 100 - 400% PSA band - if you go outside that band, may change payment behaviour of those classes. Defaults: measures or rate of default CDR conditional default rate (annual) MDR Monhtly default rate - like CPR = Rate over time. - both defined as Rates. (%) Figures are originated by the servicer of the debt pool. Each serviceer will have their own formats but will do info on prepayments, llosses, detauls on specific loans and so on.@en"]})

(def NonAgencyIOTranche
  "Interest Only tranche, meaning that this tranche will only pay interest."
  {:db/ident :fibo-sec-dbt-mbs/NonAgencyIOTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "non agency i o tranche@en",
   :rdfs/subClassOf
   [:fibo-sec-dbt-mbs/TranchedMBSInstrument
    :fibo-sec-dbt-mbs/NonAgencyIOTranche
    {:owl/onProperty     :cmns-cls/isCharacterizedBy,
     :owl/someValuesFrom :fibo-sec-dbt-pbs/WeightedAverageRemainingTerm,
     :rdf/type           :owl/Restriction}
    {:owl/allValuesFrom :fibo-sec-dbt-mbs/TranchedMBSInstrument,
     :owl/onProperty    :fibo-sec-dbt-mbs/providesCreditSupportTo,
     :rdf/type          :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-rel-rel/isIssuedBy,
     :owl/someValuesFrom :fibo-sec-dbt-mbs/MBSIssuer,
     :rdf/type           :owl/Restriction}
    :fibo-sec-dbt-mbs/MortgageBackedSecurity
    {:owl/onProperty     :fibo-sec-dbt-mbs/hasNote,
     :owl/someValuesFrom :fibo-sec-dbt-mbs/MBSTrancheNote,
     :rdf/type           :owl/Restriction}
    :fibo-sec-dbt-pbs/PoolBackedSecurity
    {:owl/allValuesFrom :fibo-sec-dbt-mbs/TranchedMBSInstrument,
     :owl/onProperty    :fibo-sec-dbt-mbs/cashflowPrecedence,
     :rdf/type          :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "Interest Only tranche, meaning that this tranche will only pay interest.@en"})

(def NonAgencyJumpTranche
  "A tranche where if there is some sort of trigger event reached then the holders of the tranche will begin to receive payments."
  {:db/ident :fibo-sec-dbt-mbs/NonAgencyJumpTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "non agency jump tranche@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-sec-dbt-mbs/specifiesTrigger,
     :owl/someValuesFrom :fibo-sec-dbt-cdo/JumpZTriggerEvent,
     :rdf/type           :owl/Restriction}
    :fibo-sec-dbt-mbs/TranchedMBSInstrument
    :fibo-sec-dbt-mbs/NonAgencyJumpTranche
    {:owl/onProperty     :cmns-cls/isCharacterizedBy,
     :owl/someValuesFrom :fibo-sec-dbt-pbs/WeightedAverageRemainingTerm,
     :rdf/type           :owl/Restriction}
    {:owl/allValuesFrom :fibo-sec-dbt-mbs/TranchedMBSInstrument,
     :owl/onProperty    :fibo-sec-dbt-mbs/providesCreditSupportTo,
     :rdf/type          :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-rel-rel/isIssuedBy,
     :owl/someValuesFrom :fibo-sec-dbt-mbs/MBSIssuer,
     :rdf/type           :owl/Restriction}
    :fibo-sec-dbt-mbs/MortgageBackedSecurity
    {:owl/onProperty     :fibo-sec-dbt-mbs/hasNote,
     :owl/someValuesFrom :fibo-sec-dbt-mbs/MBSTrancheNote,
     :rdf/type           :owl/Restriction}
    :fibo-sec-dbt-pbs/PoolBackedSecurity
    {:owl/allValuesFrom :fibo-sec-dbt-mbs/TranchedMBSInstrument,
     :owl/onProperty    :fibo-sec-dbt-mbs/cashflowPrecedence,
     :rdf/type          :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "A tranche where if there is some sort of trigger event reached then the holders of the tranche will begin to receive payments.@en"})

(def NonAgencyJumpZTranche
  "A Jump Z tranche is like a Z tranche but if there is some sort of trigger event reached then the holders of the Jump Z tranche will begin to receive payments. Regular non-Sticky Jump Z tranches maintain their changed status only while the trigger event is in effect, and revert to their old payment status once the trigger event has passed."
  {:db/ident :fibo-sec-dbt-mbs/NonAgencyJumpZTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "non agency jump z tranche@en",
   :rdfs/subClassOf
   [:fibo-sec-dbt-mbs/NonAgencyZTranche
    :fibo-sec-dbt-mbs/NonAgencyJumpTranche
    :fibo-sec-dbt-mbs/NonAgencyJumpZTranche
    {:owl/onProperty     :cmns-cls/isCharacterizedBy,
     :owl/someValuesFrom :fibo-sec-dbt-pbs/WeightedAverageRemainingTerm,
     :rdf/type           :owl/Restriction}
    :fibo-sec-dbt-mbs/TranchedMBSInstrument
    {:owl/allValuesFrom :fibo-sec-dbt-mbs/TranchedMBSInstrument,
     :owl/onProperty    :fibo-sec-dbt-mbs/providesCreditSupportTo,
     :rdf/type          :owl/Restriction}
    {:owl/onProperty     :fibo-sec-dbt-mbs/specifiesTrigger,
     :owl/someValuesFrom :fibo-sec-dbt-cdo/JumpZTriggerEvent,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-rel-rel/isIssuedBy,
     :owl/someValuesFrom :fibo-sec-dbt-mbs/MBSIssuer,
     :rdf/type           :owl/Restriction}
    :fibo-sec-dbt-mbs/MortgageBackedSecurity
    {:owl/onProperty     :fibo-sec-dbt-mbs/hasNote,
     :owl/someValuesFrom :fibo-sec-dbt-mbs/MBSTrancheNote,
     :rdf/type           :owl/Restriction}
    :fibo-sec-dbt-pbs/PoolBackedSecurity
    {:owl/allValuesFrom :fibo-sec-dbt-mbs/TranchedMBSInstrument,
     :owl/onProperty    :fibo-sec-dbt-mbs/cashflowPrecedence,
     :rdf/type          :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "A Jump Z tranche is like a Z tranche but if there is some sort of trigger event reached then the holders of the Jump Z tranche will begin to receive payments. Regular non-Sticky Jump Z tranches maintain their changed status only while the trigger event is in effect, and revert to their old payment status once the trigger event has passed.@en"})

(def NonAgencyMBSIssuer
  "A party which is a non agency issuer of MBS securities. The identity of this party may be a bank or a specialist (non agency) mortgage company. Term origin:MBS PoC Reviews"
  {:db/ident :fibo-sec-dbt-mbs/NonAgencyMBSIssuer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "non agency m b s issuer@en",
   :rdfs/subClassOf [{:owl/unionOf [:fibo-fbc-fct-fse/Bank
                                    :fibo-sec-dbt-mbs/SpecialistMortgageIssuer],
                      :rdf/type    :owl/Class}
                     :fibo-sec-dbt-mbs/MBSIssuer
                     :fibo-sec-dbt-mbs/NonAgencyMBSIssuer
                     :fibo-fbc-fi-fi/Issuer
                     {:owl/unionOf [:fibo-sec-dbt-mbs/GovernmentMortgageAgency
                                    :fibo-fbc-fct-fse/Bank
                                    :fibo-sec-dbt-mbs/SpecialistMortgageIssuer],
                      :rdf/type    :owl/Class}],
   :skos/definition
   #voc/lstr
    "A party which is a non agency issuer of MBS securities. The identity of this party may be a bank or a specialist (non agency) mortgage company. Term origin:MBS PoC Reviews@en"})

(def NonAgencyMortgagePool
  "non agency mortgage pool"
  {:db/ident :fibo-sec-dbt-mbs/NonAgencyMortgagePool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "non agency mortgage pool@en",
   :rdfs/subClassOf [:fibo-sec-dbt-mbs/MortgagePool
                     :fibo-sec-dbt-mbs/NonAgencyMortgagePool
                     {:owl/onProperty     :cmns-col/hasConstituent,
                      :owl/someValuesFrom :fibo-loan-reln-mtg/Mortgage,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-sec-pls/DebtPool]})

(def NonAgencyPOTranche
  "Principal Only tranche. This tranche will only pay principal."
  {:db/ident :fibo-sec-dbt-mbs/NonAgencyPOTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "non agency p o tranche@en",
   :rdfs/subClassOf
   [:fibo-sec-dbt-mbs/TranchedMBSInstrument
    :fibo-sec-dbt-mbs/NonAgencyPOTranche
    {:owl/onProperty     :cmns-cls/isCharacterizedBy,
     :owl/someValuesFrom :fibo-sec-dbt-pbs/WeightedAverageRemainingTerm,
     :rdf/type           :owl/Restriction}
    {:owl/allValuesFrom :fibo-sec-dbt-mbs/TranchedMBSInstrument,
     :owl/onProperty    :fibo-sec-dbt-mbs/providesCreditSupportTo,
     :rdf/type          :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-rel-rel/isIssuedBy,
     :owl/someValuesFrom :fibo-sec-dbt-mbs/MBSIssuer,
     :rdf/type           :owl/Restriction}
    :fibo-sec-dbt-mbs/MortgageBackedSecurity
    {:owl/onProperty     :fibo-sec-dbt-mbs/hasNote,
     :owl/someValuesFrom :fibo-sec-dbt-mbs/MBSTrancheNote,
     :rdf/type           :owl/Restriction}
    :fibo-sec-dbt-pbs/PoolBackedSecurity
    {:owl/allValuesFrom :fibo-sec-dbt-mbs/TranchedMBSInstrument,
     :owl/onProperty    :fibo-sec-dbt-mbs/cashflowPrecedence,
     :rdf/type          :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "Principal Only tranche. This tranche will only pay principal.@en"})

(def NonAgencyRegularJumpZTranche
  "Regular non-Sticky Jump Z tranches maintain their changed status only while the trigger event is in effect, and revert to their old payment status once the trigger event has passed."
  {:db/ident :fibo-sec-dbt-mbs/NonAgencyRegularJumpZTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "non agency regular jump z tranche@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-sec-dbt-mbs/reverts,
     :owl/someValuesFrom :fibo-sec-dbt-cdo/JumpZTriggerEventReversal,
     :rdf/type           :owl/Restriction}
    :fibo-sec-dbt-mbs/NonAgencyJumpZTranche
    :fibo-sec-dbt-mbs/NonAgencyRegularJumpZTranche
    {:owl/onProperty     :fibo-sec-dbt-mbs/specifiesTrigger,
     :owl/someValuesFrom :fibo-sec-dbt-cdo/JumpZTriggerEvent,
     :rdf/type           :owl/Restriction}
    :fibo-sec-dbt-mbs/NonAgencyJumpTranche
    {:owl/onProperty     :fibo-fnd-rel-rel/isIssuedBy,
     :owl/someValuesFrom :fibo-sec-dbt-mbs/MBSIssuer,
     :rdf/type           :owl/Restriction}
    :fibo-sec-dbt-mbs/NonAgencyZTranche
    {:owl/onProperty     :fibo-sec-dbt-mbs/hasNote,
     :owl/someValuesFrom :fibo-sec-dbt-mbs/MBSTrancheNote,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :cmns-cls/isCharacterizedBy,
     :owl/someValuesFrom :fibo-sec-dbt-pbs/WeightedAverageRemainingTerm,
     :rdf/type           :owl/Restriction}
    :fibo-sec-dbt-mbs/TranchedMBSInstrument
    {:owl/allValuesFrom :fibo-sec-dbt-mbs/TranchedMBSInstrument,
     :owl/onProperty    :fibo-sec-dbt-mbs/providesCreditSupportTo,
     :rdf/type          :owl/Restriction}
    :fibo-sec-dbt-mbs/MortgageBackedSecurity
    :fibo-sec-dbt-pbs/PoolBackedSecurity
    {:owl/allValuesFrom :fibo-sec-dbt-mbs/TranchedMBSInstrument,
     :owl/onProperty    :fibo-sec-dbt-mbs/cashflowPrecedence,
     :rdf/type          :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "Regular non-Sticky Jump Z tranches maintain their changed status only while the trigger event is in effect, and revert to their old payment status once the trigger event has passed.@en"})

(def NonAgencyStickyJumpZTranche
  "\"Sticky\" Jump Z tranches maintain the payment priority of a Jump Z tranche until they are retired."
  {:db/ident :fibo-sec-dbt-mbs/NonAgencyStickyJumpZTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "non agency sticky jump z tranche@en",
   :rdfs/subClassOf
   [:fibo-sec-dbt-mbs/NonAgencyJumpZTranche
    :fibo-sec-dbt-mbs/NonAgencyStickyJumpZTranche
    {:owl/onProperty     :cmns-cls/isCharacterizedBy,
     :owl/someValuesFrom :fibo-sec-dbt-pbs/WeightedAverageRemainingTerm,
     :rdf/type           :owl/Restriction}
    :fibo-sec-dbt-mbs/TranchedMBSInstrument
    {:owl/allValuesFrom :fibo-sec-dbt-mbs/TranchedMBSInstrument,
     :owl/onProperty    :fibo-sec-dbt-mbs/providesCreditSupportTo,
     :rdf/type          :owl/Restriction}
    {:owl/onProperty     :fibo-sec-dbt-mbs/specifiesTrigger,
     :owl/someValuesFrom :fibo-sec-dbt-cdo/JumpZTriggerEvent,
     :rdf/type           :owl/Restriction}
    :fibo-sec-dbt-mbs/NonAgencyJumpTranche
    {:owl/onProperty     :fibo-fnd-rel-rel/isIssuedBy,
     :owl/someValuesFrom :fibo-sec-dbt-mbs/MBSIssuer,
     :rdf/type           :owl/Restriction}
    :fibo-sec-dbt-mbs/NonAgencyZTranche
    :fibo-sec-dbt-mbs/MortgageBackedSecurity
    {:owl/onProperty     :fibo-sec-dbt-mbs/hasNote,
     :owl/someValuesFrom :fibo-sec-dbt-mbs/MBSTrancheNote,
     :rdf/type           :owl/Restriction}
    :fibo-sec-dbt-pbs/PoolBackedSecurity
    {:owl/allValuesFrom :fibo-sec-dbt-mbs/TranchedMBSInstrument,
     :owl/onProperty    :fibo-sec-dbt-mbs/cashflowPrecedence,
     :rdf/type          :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "\"Sticky\" Jump Z tranches maintain the payment priority of a Jump Z tranche until they are retired.@en"})

(def NonAgencyZTranche
  "A tranche that does not receive payments while other tranches remain."
  {:db/ident :fibo-sec-dbt-mbs/NonAgencyZTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "non agency z tranche@en",
   :rdfs/subClassOf
   [:fibo-sec-dbt-mbs/TranchedMBSInstrument
    :fibo-sec-dbt-mbs/NonAgencyZTranche
    {:owl/onProperty     :cmns-cls/isCharacterizedBy,
     :owl/someValuesFrom :fibo-sec-dbt-pbs/WeightedAverageRemainingTerm,
     :rdf/type           :owl/Restriction}
    {:owl/allValuesFrom :fibo-sec-dbt-mbs/TranchedMBSInstrument,
     :owl/onProperty    :fibo-sec-dbt-mbs/providesCreditSupportTo,
     :rdf/type          :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-rel-rel/isIssuedBy,
     :owl/someValuesFrom :fibo-sec-dbt-mbs/MBSIssuer,
     :rdf/type           :owl/Restriction}
    :fibo-sec-dbt-mbs/MortgageBackedSecurity
    {:owl/onProperty     :fibo-sec-dbt-mbs/hasNote,
     :owl/someValuesFrom :fibo-sec-dbt-mbs/MBSTrancheNote,
     :rdf/type           :owl/Restriction}
    :fibo-sec-dbt-pbs/PoolBackedSecurity
    {:owl/allValuesFrom :fibo-sec-dbt-mbs/TranchedMBSInstrument,
     :owl/onProperty    :fibo-sec-dbt-mbs/cashflowPrecedence,
     :rdf/type          :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "A tranche that does not receive payments while other tranches remain.@en",
   :skos/editorialNote
   #voc/lstr
    "These tranches are credited for interest that would have been received and that interest is accrued to the Z tranche. Once all other tranches have been paid, the holders of the Z tranche receive payments. Types of Z Tranche: A Jump Z tranche is like a Z tranche but if there is some sort of trigger event reached then the holders of the Jump Z tranche will begin to receive payments. \"Sticky\" Jump Z tranches maintain this payment priority until they are retired, while regular, non-Sticky Jump Z tranches maintain their changed status only while the trigger event is in effect, and revert to their old payment status once the trigger event has passed. Review note: These are currently separate entries - they should be entries for types of Z Tranche. Add new list and move these to there.@en"})

(def Pass-throughPool
  "pass-through pool"
  {:db/ident :fibo-sec-dbt-mbs/Pass-throughPool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "pass-through pool@en",
   :rdfs/subClassOf [:fibo-sec-dbt-mbs/MortgagePool
                     :fibo-sec-dbt-mbs/Pass-throughPool
                     {:owl/onProperty     :cmns-col/hasConstituent,
                      :owl/someValuesFrom :fibo-loan-reln-mtg/Mortgage,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-sec-pls/DebtPool],
   :skos/editorialNote
   #voc/lstr
    "REVIEW: These are all Pass-through so not clear why this term is here. Term originates with Cutter SME review but seems redundant. If not, this would be non mutually exclusive with agency pool. In general, agency MBS pools are pass through and non agency are tranched, but this reflects a business necessity not a logical necessity.@en"})

(def PassThroughMBSDeal
  "An issue of Mortgage Backed Security instruments in which payments on the pool are passed through to investors"
  {:db/ident :fibo-sec-dbt-mbs/PassThroughMBSDeal,
   :owl/disjointWith :fibo-sec-dbt-mbs/TranchedMBSDeal,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "pass through m b s deal@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-sec-dbt-mbs/isAlso,
                      :owl/someValuesFrom :fibo-sec-dbt-mbs/AgencyMBSDeal,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-dbt-dbti/DebtOffering
                     :fibo-sec-dbt-mbs/PassThroughMBSDeal],
   :skos/definition
   #voc/lstr
    "An issue of Mortgage Backed Security instruments in which payments on the pool are passed through to investors@en",
   :skos/editorialNote
   #voc/lstr
    "The cashflows from interest and principal payments on the mortgages in the underlying pool are passed on to investors, usually with the deduction of fees in for them of a reduction in a mumber of percentage points or a monetary amount. Modeling note: Thinking about this further, and after more PoC reviews, it seems to me that we should simply define two kinds of Deal which are Tranched and Pass Thtrough, just below the level of Pool Backed Securities Deal. Investigaiton of various SMOs and REMICs and the like suggests that the original PoC term duality shown here (Tranched = Non Agency; Pass Through = Agency) is too simplistic.@en"})

(def PassThroughMBSDealProspectus
  "The written prospectus for an agency, pass through issue of Mortgage Backed Securities"
  {:db/ident :fibo-sec-dbt-mbs/PassThroughMBSDealProspectus,
   :owl/disjointWith :fibo-sec-dbt-mbs/TranchedMBSDealProspectus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "pass through m b s deal prospectus@en",
   :rdfs/subClassOf [:fibo-sec-dbt-mbs/MortgageBackedSecurityOfferingProspectus
                     :fibo-sec-dbt-mbs/PassThroughMBSDealProspectus
                     :fibo-sec-sec-iss/Prospectus],
   :skos/definition
   #voc/lstr
    "The written prospectus for an agency, pass through issue of Mortgage Backed Securities@en"})

(def PassThroughMBSInstrument
  "A security in which the cash flows from the underlying asset pool are passed through to the investor by way of redemption payments."
  {:db/ident :fibo-sec-dbt-mbs/PassThroughMBSInstrument,
   :owl/disjointWith :fibo-sec-dbt-mbs/TranchedMBSInstrument,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "pass through m b s instrument@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-sec-dbt-mbs/hasNote,
     :owl/someValuesFrom :fibo-sec-dbt-mbs/PassThroughMBSInstrumentNote,
     :rdf/type           :owl/Restriction}
    :fibo-sec-dbt-mbs/MortgageBackedSecurity
    :fibo-sec-dbt-mbs/PassThroughMBSInstrument
    {:owl/onProperty     :cmns-cls/isCharacterizedBy,
     :owl/someValuesFrom :fibo-sec-dbt-pbs/WeightedAverageRemainingTerm,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-rel-rel/isIssuedBy,
     :owl/someValuesFrom :fibo-sec-dbt-mbs/MBSIssuer,
     :rdf/type           :owl/Restriction}
    :fibo-sec-dbt-pbs/PoolBackedSecurity],
   :skos/definition
   #voc/lstr
    "A security in which the cash flows from the underlying asset pool are passed through to the investor by way of redemption payments.@en"})

(def PassThroughMBSInstrumentNote
  "An individual note of a pass through instrument."
  {:db/ident :fibo-sec-dbt-mbs/PassThroughMBSInstrumentNote,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "pass through m b s instrument note@en",
   :rdfs/subClassOf [:fibo-fbc-dae-dbt/PromissoryNote
                     :fibo-sec-dbt-mbs/PassThroughMBSInstrumentNote],
   :skos/definition #voc/lstr
                     "An individual note of a pass through instrument.@en"})

(def PassThroughMBSIssueUnderwriter
  "The party which agrees to buy any certificates that are not bought by investors Term origin:MBS PoC Reviews"
  {:db/ident :fibo-sec-dbt-mbs/PassThroughMBSIssueUnderwriter,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "pass through m b s issue underwriter@en",
   :rdfs/subClassOf [:fibo-sec-sec-iss/SecurityUnderwriter
                     :fibo-sec-dbt-mbs/PassThroughMBSIssueUnderwriter],
   :skos/definition
   #voc/lstr
    "The party which agrees to buy any certificates that are not bought by investors Term origin:MBS PoC Reviews@en"})

(def PayingAgent
  "paying agent"
  {:db/ident :fibo-sec-dbt-mbs/PayingAgent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "paying agent@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-sec-dbt-mbs/responsibleFor,
                      :owl/someValuesFrom :fibo-fnd-pas-psch/Payment,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-dbt-mbs/PayingAgent]})

(def PrivateLabelMBSDeal
  "private label m b s deal"
  {:db/ident :fibo-sec-dbt-mbs/PrivateLabelMBSDeal,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "private label m b s deal@en",
   :rdfs/subClassOf [:fibo-sec-dbt-dbti/DebtOffering
                     :fibo-sec-dbt-mbs/PrivateLabelMBSDeal]})

(def RealEstateMortgageInvestmentConduit
  "special purpose vehicle that pools mortgage loans together and issues mortgage-backed securities"
  {:cmns-av/abbreviation #voc/lstr "REMIC@en",
   :cmns-av/explanatoryNote
   #voc/lstr
    "A real estate mortgage investment conduit may be organized as a partnership, a trust, a corporation, or an association and is exempt from federal taxes.@en",
   :db/ident :fibo-sec-dbt-mbs/RealEstateMortgageInvestmentConduit,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "real estate mortgage investment conduit@en",
   :rdfs/seeAlso
   ["https://www.investopedia.com/terms/r/real-estate-mortgage-investment-conduit-remic.asp"],
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-sec-dbt-mbs/MortgagePool,
                      :owl/onProperty :fibo-fnd-oac-own/owns,
                      :rdf/type       :owl/Restriction}
                     :fibo-be-le-lp/SpecialPurposeVehicle
                     :fibo-sec-dbt-mbs/RealEstateMortgageInvestmentConduit],
   :skos/definition
   #voc/lstr
    "special purpose vehicle that pools mortgage loans together and issues mortgage-backed securities@en"})

(def RegularFloaterTranche
  "A floater tranche is a tranche that is keyed to an index and a spread. The spread is added to the index."
  {:cmns-av/explanatoryNote
   #voc/lstr
    "For example, 3 month LIBOR +50 -- meaning that the coupon would be whatever the 3 month LIBOR is plus 50 basis points. This is not a continuously updated number, rather it resets at specified intervals.@en",
   :db/ident :fibo-sec-dbt-mbs/RegularFloaterTranche,
   :owl/disjointWith :fibo-sec-dbt-mbs/SuperFloaterTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "regular floater tranche@en",
   :rdfs/subClassOf
   [:fibo-sec-dbt-mbs/FloaterTranche
    :fibo-sec-dbt-mbs/RegularFloaterTranche
    {:owl/onProperty     :cmns-cls/isCharacterizedBy,
     :owl/someValuesFrom :fibo-sec-dbt-pbs/WeightedAverageRemainingTerm,
     :rdf/type           :owl/Restriction}
    :fibo-sec-dbt-mbs/TranchedMBSInstrument
    {:owl/allValuesFrom :fibo-sec-dbt-mbs/TranchedMBSInstrument,
     :owl/onProperty    :fibo-sec-dbt-mbs/providesCreditSupportTo,
     :rdf/type          :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-rel-rel/isIssuedBy,
     :owl/someValuesFrom :fibo-sec-dbt-mbs/MBSIssuer,
     :rdf/type           :owl/Restriction}
    :fibo-sec-dbt-mbs/MortgageBackedSecurity
    {:owl/onProperty     :fibo-sec-dbt-mbs/hasNote,
     :owl/someValuesFrom :fibo-sec-dbt-mbs/MBSTrancheNote,
     :rdf/type           :owl/Restriction}
    :fibo-sec-dbt-pbs/PoolBackedSecurity
    {:owl/onProperty     :fibo-fnd-dt-fd/hasRecurrenceInterval,
     :owl/someValuesFrom :fibo-fnd-dt-bd/DayOfMonth,
     :rdf/type           :owl/Restriction}
    {:owl/allValuesFrom :fibo-sec-dbt-mbs/TranchedMBSInstrument,
     :owl/onProperty    :fibo-sec-dbt-mbs/cashflowPrecedence,
     :rdf/type          :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "A floater tranche is a tranche that is keyed to an index and a spread. The spread is added to the index.@en"})

(def ResidentialMBS
  "Residential Mortgage-Backed Securities, which are trust certificates (bonds) backed by a pool of residential mortgage loans."
  {:cmns-av/explanatoryNote
   #voc/lstr
    "Notes from CESR: They are issued by banks and backed by an underlying pool of residential mortgages. There can be some distinctions between prime RMBS and sub-prime/non-conforming RMBS although there is no consensus about what constitutes a sub-prime/non-conforming mortgage in Europe.@en",
   :db/ident :fibo-sec-dbt-mbs/ResidentialMBS,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "residential m b s@en",
   :rdfs/subClassOf [:fibo-sec-dbt-mbs/MortgageBackedSecurity
                     :fibo-sec-dbt-mbs/ResidentialMBS
                     {:owl/onProperty :cmns-cls/isCharacterizedBy,
                      :owl/someValuesFrom
                      :fibo-sec-dbt-pbs/WeightedAverageRemainingTerm,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-rel-rel/isIssuedBy,
                      :owl/someValuesFrom :fibo-sec-dbt-mbs/MBSIssuer,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-dbt-pbs/PoolBackedSecurity],
   :skos/definition
   #voc/lstr
    "Residential Mortgage-Backed Securities, which are trust certificates (bonds) backed by a pool of residential mortgage loans.@en"})

(def ResidualTranche
  "Unknown Further notes: Verify whether Residual Tranche and Support Tranche are meant to be in the same list of types as PAC etc. i.e. can a tranche not be PAC and Residual? this looks suspicioulsy like two semantics."
  {:db/ident :fibo-sec-dbt-mbs/ResidualTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "residual tranche@en",
   :rdfs/subClassOf
   [:fibo-sec-dbt-mbs/TranchedMBSInstrument
    :fibo-sec-dbt-mbs/ResidualTranche
    {:owl/onProperty     :cmns-cls/isCharacterizedBy,
     :owl/someValuesFrom :fibo-sec-dbt-pbs/WeightedAverageRemainingTerm,
     :rdf/type           :owl/Restriction}
    {:owl/allValuesFrom :fibo-sec-dbt-mbs/TranchedMBSInstrument,
     :owl/onProperty    :fibo-sec-dbt-mbs/providesCreditSupportTo,
     :rdf/type          :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-rel-rel/isIssuedBy,
     :owl/someValuesFrom :fibo-sec-dbt-mbs/MBSIssuer,
     :rdf/type           :owl/Restriction}
    :fibo-sec-dbt-mbs/MortgageBackedSecurity
    {:owl/onProperty     :fibo-sec-dbt-mbs/hasNote,
     :owl/someValuesFrom :fibo-sec-dbt-mbs/MBSTrancheNote,
     :rdf/type           :owl/Restriction}
    :fibo-sec-dbt-pbs/PoolBackedSecurity
    {:owl/allValuesFrom :fibo-sec-dbt-mbs/TranchedMBSInstrument,
     :owl/onProperty    :fibo-sec-dbt-mbs/cashflowPrecedence,
     :rdf/type          :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "Unknown Further notes: Verify whether Residual Tranche and Support Tranche are meant to be in the same list of types as PAC etc. i.e. can a tranche not be PAC and Residual? this looks suspicioulsy like two semantics.@en"})

(def SBA-Pool
  "SBA pool"
  {:db/ident :fibo-sec-dbt-mbs/SBA-Pool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "SBA pool@en",
   :rdfs/subClassOf [:fibo-sec-dbt-mbs/MortgagePool
                     :fibo-sec-dbt-mbs/SBA-Pool
                     {:owl/onProperty     :cmns-col/hasConstituent,
                      :owl/someValuesFrom :fibo-loan-reln-mtg/Mortgage,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-sec-pls/DebtPool],
   :skos/editorialNote
   #voc/lstr
    "Unknown pool type, from Cutter SME reviews; other pool types listed under Agency are from or validated by AdeptAdvisory SME review.@en"})

(def SeniorMBSTranche
  "Specific kinds of tranche are modeled for example and investigation only and have been removed from the diagrams. These will be removed from the final model."
  {:db/ident :fibo-sec-dbt-mbs/SeniorMBSTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "senior m b s tranche@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-sec-dbt-mbs/seniorTo,
     :owl/someValuesFrom :fibo-sec-dbt-mbs/MezzanineMBSTranche,
     :rdf/type           :owl/Restriction}
    :fibo-sec-dbt-mbs/TranchedMBSInstrument
    :fibo-sec-dbt-mbs/SeniorMBSTranche
    {:owl/onProperty     :cmns-cls/isCharacterizedBy,
     :owl/someValuesFrom :fibo-sec-dbt-pbs/WeightedAverageRemainingTerm,
     :rdf/type           :owl/Restriction}
    {:owl/allValuesFrom :fibo-sec-dbt-mbs/TranchedMBSInstrument,
     :owl/onProperty    :fibo-sec-dbt-mbs/providesCreditSupportTo,
     :rdf/type          :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-rel-rel/isIssuedBy,
     :owl/someValuesFrom :fibo-sec-dbt-mbs/MBSIssuer,
     :rdf/type           :owl/Restriction}
    :fibo-sec-dbt-mbs/MortgageBackedSecurity
    {:owl/onProperty     :fibo-sec-dbt-mbs/hasNote,
     :owl/someValuesFrom :fibo-sec-dbt-mbs/MBSTrancheNote,
     :rdf/type           :owl/Restriction}
    :fibo-sec-dbt-pbs/PoolBackedSecurity
    {:owl/allValuesFrom :fibo-sec-dbt-mbs/TranchedMBSInstrument,
     :owl/onProperty    :fibo-sec-dbt-mbs/cashflowPrecedence,
     :rdf/type          :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "Specific kinds of tranche are modeled for example and investigation only and have been removed from the diagrams. These will be removed from the final model.@en"})

(def SpecialistMortgageIssuer
  "A business organization that specialises in and exists for the issuance of mortgages to the general public."
  {:db/ident :fibo-sec-dbt-mbs/SpecialistMortgageIssuer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "specialist mortgage issuer@en",
   :rdfs/subClassOf [:fibo-be-fct-fct/FunctionalBusinessEntity
                     :fibo-sec-dbt-mbs/SpecialistMortgageIssuer],
   :skos/definition
   #voc/lstr
    "A business organization that specialises in and exists for the issuance of mortgages to the general public.@en",
   :skos/editorialNote
   #voc/lstr
    "Possibly add: Building Society. these exist in the UK (though almost extinct) but have not come up in US-based reviews of the model. Also known as Friendly Societies. There may be analogous organisations in other parts of the world, e.g. South America??@en"})

(def SubordinatedMBSTranche
  "Specific kinds of tranche are modeled for example and investigation only and have been removed from the diagrams. These will be removed from the final model."
  {:db/ident :fibo-sec-dbt-mbs/SubordinatedMBSTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "subordinated m b s tranche@en",
   :rdfs/subClassOf
   [:fibo-sec-dbt-mbs/TranchedMBSInstrument
    :fibo-sec-dbt-mbs/SubordinatedMBSTranche
    {:owl/onProperty     :cmns-cls/isCharacterizedBy,
     :owl/someValuesFrom :fibo-sec-dbt-pbs/WeightedAverageRemainingTerm,
     :rdf/type           :owl/Restriction}
    {:owl/allValuesFrom :fibo-sec-dbt-mbs/TranchedMBSInstrument,
     :owl/onProperty    :fibo-sec-dbt-mbs/providesCreditSupportTo,
     :rdf/type          :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-rel-rel/isIssuedBy,
     :owl/someValuesFrom :fibo-sec-dbt-mbs/MBSIssuer,
     :rdf/type           :owl/Restriction}
    :fibo-sec-dbt-mbs/MortgageBackedSecurity
    {:owl/onProperty     :fibo-sec-dbt-mbs/hasNote,
     :owl/someValuesFrom :fibo-sec-dbt-mbs/MBSTrancheNote,
     :rdf/type           :owl/Restriction}
    :fibo-sec-dbt-pbs/PoolBackedSecurity
    {:owl/allValuesFrom :fibo-sec-dbt-mbs/TranchedMBSInstrument,
     :owl/onProperty    :fibo-sec-dbt-mbs/cashflowPrecedence,
     :rdf/type          :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "Specific kinds of tranche are modeled for example and investigation only and have been removed from the diagrams. These will be removed from the final model.@en"})

(def SuperFloaterTranche
  "super floater tranche"
  {:db/ident :fibo-sec-dbt-mbs/SuperFloaterTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "super floater tranche@en",
   :rdfs/subClassOf
   [:fibo-sec-dbt-mbs/FloaterTranche
    :fibo-sec-dbt-mbs/SuperFloaterTranche
    {:owl/onProperty     :cmns-cls/isCharacterizedBy,
     :owl/someValuesFrom :fibo-sec-dbt-pbs/WeightedAverageRemainingTerm,
     :rdf/type           :owl/Restriction}
    :fibo-sec-dbt-mbs/TranchedMBSInstrument
    {:owl/allValuesFrom :fibo-sec-dbt-mbs/TranchedMBSInstrument,
     :owl/onProperty    :fibo-sec-dbt-mbs/providesCreditSupportTo,
     :rdf/type          :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-rel-rel/isIssuedBy,
     :owl/someValuesFrom :fibo-sec-dbt-mbs/MBSIssuer,
     :rdf/type           :owl/Restriction}
    :fibo-sec-dbt-mbs/MortgageBackedSecurity
    {:owl/onProperty     :fibo-sec-dbt-mbs/hasNote,
     :owl/someValuesFrom :fibo-sec-dbt-mbs/MBSTrancheNote,
     :rdf/type           :owl/Restriction}
    :fibo-sec-dbt-pbs/PoolBackedSecurity
    {:owl/onProperty     :fibo-fnd-dt-fd/hasRecurrenceInterval,
     :owl/someValuesFrom :fibo-fnd-dt-bd/DayOfMonth,
     :rdf/type           :owl/Restriction}
    {:owl/allValuesFrom :fibo-sec-dbt-mbs/TranchedMBSInstrument,
     :owl/onProperty    :fibo-sec-dbt-mbs/cashflowPrecedence,
     :rdf/type          :owl/Restriction}]})

(def TrancheRatingAtIssue
  "The rating at issue of a tranche of a security. Note this is under review"
  {:db/ident :fibo-sec-dbt-mbs/TrancheRatingAtIssue,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "tranche rating at issue@en",
   :skos/definition
   #voc/lstr
    "The rating at issue of a tranche of a security. Note this is under review@en",
   :skos/editorialNote
   #voc/lstr
    "In the case of CDOs, senior and mezzanine tranches of a CDO issue are typically rated, with the former receiving ratings of A to AAA and the latter receiving ratings of B to BBB. The ratings reflect both the credit quality of underlying collateral as well as how much protection a given tranch is afforded by tranches that are subordinate to it. Review note: Remove this it's no different from an instrument.@en"})

(def TrancheType
  "the type of tranche in a tranched MBS security"
  {:db/ident :fibo-sec-dbt-mbs/TrancheType,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "tranche type@en",
   :skos/definition #voc/lstr
                     "the type of tranche in a tranched MBS security@en"})

(def TranchedMBSDeal
  "tranched m b s deal"
  {:db/ident :fibo-sec-dbt-mbs/TranchedMBSDeal,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "tranched m b s deal@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-sec-dbt-mbs/isAlso.1,
                      :owl/someValuesFrom :fibo-sec-dbt-mbs/PrivateLabelMBSDeal,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-dbt-dbti/DebtOffering
                     :fibo-sec-dbt-mbs/TranchedMBSDeal]})

(def TranchedMBSDealProspectus
  "tranched m b s deal prospectus"
  {:db/ident :fibo-sec-dbt-mbs/TranchedMBSDealProspectus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "tranched m b s deal prospectus@en",
   :rdfs/subClassOf [:fibo-sec-dbt-mbs/MortgageBackedSecurityOfferingProspectus
                     :fibo-sec-dbt-mbs/TranchedMBSDealProspectus
                     :fibo-sec-sec-iss/Prospectus]})

(def TranchedMBSInstrument
  "tranched m b s instrument"
  {:db/ident :fibo-sec-dbt-mbs/TranchedMBSInstrument,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "tranched m b s instrument@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-sec-dbt-mbs/hasNote,
     :owl/someValuesFrom :fibo-sec-dbt-mbs/MBSTrancheNote,
     :rdf/type           :owl/Restriction}
    {:owl/allValuesFrom :fibo-sec-dbt-mbs/TranchedMBSInstrument,
     :owl/onProperty    :fibo-sec-dbt-mbs/providesCreditSupportTo,
     :rdf/type          :owl/Restriction}
    {:owl/allValuesFrom :fibo-sec-dbt-mbs/TranchedMBSInstrument,
     :owl/onProperty    :fibo-sec-dbt-mbs/cashflowPrecedence,
     :rdf/type          :owl/Restriction}
    :fibo-sec-dbt-mbs/MortgageBackedSecurity
    :fibo-sec-dbt-mbs/TranchedMBSInstrument
    {:owl/onProperty     :cmns-cls/isCharacterizedBy,
     :owl/someValuesFrom :fibo-sec-dbt-pbs/WeightedAverageRemainingTerm,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-rel-rel/isIssuedBy,
     :owl/someValuesFrom :fibo-sec-dbt-mbs/MBSIssuer,
     :rdf/type           :owl/Restriction}
    :fibo-sec-dbt-pbs/PoolBackedSecurity]})

(def TranchedMBSIssueUnderwriter
  "The party which agrees to buy any certificates that are not bought by investors Term origin:MBS PoC Reviews"
  {:db/ident :fibo-sec-dbt-mbs/TranchedMBSIssueUnderwriter,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "tranched m b s issue underwriter@en",
   :rdfs/subClassOf [:fibo-sec-sec-iss/SecurityUnderwriter
                     :fibo-sec-dbt-mbs/TranchedMBSIssueUnderwriter],
   :skos/definition
   #voc/lstr
    "The party which agrees to buy any certificates that are not bought by investors Term origin:MBS PoC Reviews@en"})

(def cashflowPrecedence
  "cashflow precedence"
  {:db/ident :fibo-sec-dbt-mbs/cashflowPrecedence,
   :owl/inverseOf :fibo-sec-dbt-mbs/providesCreditSupportTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-mbs/TranchedMBSInstrument,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "cashflow precedence@en",
   :rdfs/range :fibo-sec-dbt-mbs/TranchedMBSInstrument,
   :rdfs/subPropertyOf :fibo-sec-dbt-mbs/cashflowPrecedence})

(def denomination
  "The currency amount in which the Note is denominated, for example $500 notes."
  {:db/ident :fibo-sec-dbt-mbs/denomination,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-mbs/MBSTrancheNote,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "denomination@en",
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :skos/definition
   #voc/lstr
    "The currency amount in which the Note is denominated, for example $500 notes.@en"})

(def denomination_1
  "The currency amount in which the Note is denominated, for example $500 notes. This term added by symmettry with MBS Tranche Note. needs to be reviewed and validated."
  {:db/ident :fibo-sec-dbt-mbs/denomination.1,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-mbs/PassThroughMBSInstrumentNote,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "denomination@en",
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :skos/definition
   #voc/lstr
    "The currency amount in which the Note is denominated, for example $500 notes. This term added by symmettry with MBS Tranche Note. needs to be reviewed and validated.@en"})

(def hasNote
  "has note"
  {:db/ident :fibo-sec-dbt-mbs/hasNote,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-mbs/MortgageBackedSecurity,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "has note@en",
   :rdfs/range :fibo-fbc-dae-dbt/PromissoryNote,
   :rdfs/subPropertyOf [:cmns-col/hasPart :fibo-sec-dbt-mbs/hasNote]})

(def hasTrancheType
  "has tranche type"
  {:db/ident :fibo-sec-dbt-mbs/hasTrancheType,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-pbs/StructuredFinanceInstrument,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "has tranche type@en",
   :rdfs/range :fibo-sec-dbt-mbs/TrancheType})

(def isAlso
  "is also"
  {:db/ident :fibo-sec-dbt-mbs/isAlso,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-mbs/PassThroughMBSDeal,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "is also@en",
   :rdfs/range :fibo-sec-dbt-mbs/AgencyMBSDeal})

(def isAlso_1
  "is also"
  {:db/ident :fibo-sec-dbt-mbs/isAlso.1,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-mbs/TranchedMBSDeal,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "is also@en",
   :rdfs/range :fibo-sec-dbt-mbs/PrivateLabelMBSDeal})

(def isSliceOf
  "is slice of"
  {:db/ident :fibo-sec-dbt-mbs/isSliceOf,
   :owl/inverseOf :fibo-sec-dbt-mbs/hasNote,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-dae-dbt/PromissoryNote,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "is slice of@en",
   :rdfs/range :fibo-sec-dbt-mbs/MortgageBackedSecurity,
   :rdfs/subPropertyOf [:cmns-col/isPartOf :fibo-sec-dbt-mbs/isSliceOf]})

(def prime
  "Whether the mortage pool is identified as Prime or not."
  {:db/ident :fibo-sec-dbt-mbs/prime,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-dbt-mbs/ResidentialMBS,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "prime@en",
   :rdfs/range :xsd/boolean,
   :skos/definition
   #voc/lstr "Whether the mortage pool is identified as Prime or not.@en"})

(def providesCreditSupportTo
  "provides credit support to"
  {:db/ident :fibo-sec-dbt-mbs/providesCreditSupportTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-mbs/TranchedMBSInstrument,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "provides credit support to@en",
   :rdfs/range :fibo-sec-dbt-mbs/TranchedMBSInstrument,
   :rdfs/subPropertyOf [:fibo-sec-dbt-dbti/isSubordinatedTo
                        :fibo-sec-dbt-mbs/providesCreditSupportTo]})

(def responsibleFor
  "responsible for"
  {:db/ident :fibo-sec-dbt-mbs/responsibleFor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-mbs/PayingAgent,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "responsible for@en",
   :rdfs/range :fibo-fnd-pas-psch/Payment})

(def reverts
  "reverts"
  {:db/ident :fibo-sec-dbt-mbs/reverts,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-mbs/NonAgencyRegularJumpZTranche,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "reverts@en",
   :rdfs/range :fibo-sec-dbt-cdo/JumpZTriggerEventReversal})

(def seniorTo
  "Specific kinds of tranche are modeled for example and investigation only and have been removed from the diagrams. These will be removed from the final model."
  {:db/ident :fibo-sec-dbt-mbs/seniorTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain [:fibo-sec-dbt-mbs/SeniorMBSTranche
                 :fibo-sec-dbt-mbs/MezzanineMBSTranche],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "senior to@en",
   :rdfs/range [:fibo-sec-dbt-mbs/SubordinatedMBSTranche
                :fibo-sec-dbt-mbs/MezzanineMBSTranche],
   :rdfs/subPropertyOf [:fibo-sec-dbt-mbs/cashflowPrecedence
                        :fibo-sec-dbt-mbs/seniorTo],
   :skos/definition
   #voc/lstr
    "Specific kinds of tranche are modeled for example and investigation only and have been removed from the diagrams. These will be removed from the final model.@en"})

(def specifiesTrigger
  "The event which, when it takes place, causes the Jump Z holders to begin receiving payments."
  {:db/ident :fibo-sec-dbt-mbs/specifiesTrigger,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-mbs/NonAgencyJumpTranche,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label #voc/lstr "specifies trigger@en",
   :rdfs/range :fibo-sec-dbt-cdo/JumpZTriggerEvent,
   :skos/definition
   #voc/lstr
    "The event which, when it takes place, causes the Jump Z holders to begin receiving payments.@en"})