(ns net.wikipunk.rdf.fibo-sec-dbt-mbs
  "Mortgage backed securities are like asset backed securities except that the underlying loan pool is a pool of mortgage loans."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :dcterms/abstract
   "Mortgage backed securities are like asset backed securities except that the underlying loan pool is a pool of mortgage loans.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/CollateralizedDebtObligations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Arrangements/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/DebtAndEquities/Debt/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/OwnershipAndControl/Ownership/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/SecuritiesIssuance/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/MD/DebtTemporal/DebtAnalytics/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Lifecycles/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/FunctionalEntities/FunctionalEntities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Contracts/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/LOAN/RealEstateLoans/MortgageLoans/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/DebtInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/PoolBackedSecurities/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/FinancialServicesEntities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/ProductsAndServices/PaymentsAndSchedules/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/AssetBackedSecurities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Parties/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LegalPersons/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BP/SecuritiesIssuance/DebtIssuance/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/Pools/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/BusinessDates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Funds/Funds/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/MortgageBackedSecurities/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
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
    "fibo-fnd-arr-arr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Arrangements/",
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
    "fibo-md-dbtx-aly"
    "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
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
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfa/prefix "fibo-sec-dbt-mbs",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Mortgage-backed Securities Ontology"},
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright "Copyright (c) 2015-2022 EDM Council, Inc.",
   :sm/dependsOn
   ["https://spec.edmcouncil.org/fibo/ontology/FBC/"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/AssetBackedSecurities/"
    "https://spec.edmcouncil.org/fibo/ontology/MD/"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/PoolBackedSecurities/"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/BE/"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds/"
    "https://spec.edmcouncil.org/fibo/ontology/BP/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/"
    "https://www.omg.org/spec/LCC/"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/"],
   :sm/fileAbbreviation "fibo-sec-dbt-mbs",
   :sm/filename "MortgageBackedSecurities.rdf"})

(def AgencyMBSDeal
  "An issue of securities backed by pools of mortgages held by government agencies."
  {:db/ident :fibo-sec-dbt-mbs/AgencyMBSDeal,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "These are Ginnie Mae, Freddie Mac and Fannie Mae (for the US). Of these agencies, GNMA (Ginnie Mae) issues mortgages in its own right (Investorwords differs on this). Fannie Mae and Freddie Mac purchase mortgages. Those mortgages are issued by banks. Before one of these agencies purchases a mortgage, there are certain criteria that have to be met. These are specified in terms of, for example, the balance of the mortgage, limits to credit ratings."},
   :owl/disjointWith :fibo-sec-dbt-mbs/PrivateLabelMBSDeal,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "agency m b s deal"},
   :rdfs/subClassOf :fibo-sec-dbt-dbti/DebtOffering,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An issue of securities backed by pools of mortgages held by government agencies."}})

(def AgencyMBSIssuer
  "The issuer of the pass through MBS is an Agency issuer. This is identified as being some kind of agency that is set up specifically to issue these instruments."
  {:db/ident :fibo-sec-dbt-mbs/AgencyMBSIssuer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "agency m b s issuer"},
   :rdfs/subClassOf [:fibo-sec-dbt-mbs/MBSIssuer
                     :fibo-sec-dbt-mbs/GovernmentMortgageAgency],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The issuer of the pass through MBS is an Agency issuer. This is identified as being some kind of agency that is set up specifically to issue these instruments."}})

(def AgencyMBSPool
  "A pool investment consisting of a collection of Agency MBS instruments."
  {:db/ident :fibo-sec-dbt-mbs/AgencyMBSPool,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "This pool may be used as the underlying for an agency CMO. Non agency CMOs do not exist."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "agency m b s pool"},
   :rdfs/subClassOf :fibo-sec-dbt-mbs/MBSPool,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A pool investment consisting of a collection of Agency MBS instruments."}})

(def AgencyMortgagePool
  "A pool of agency mortgages."
  {:db/ident :fibo-sec-dbt-mbs/AgencyMortgagePool,
   :owl/disjointWith :fibo-sec-dbt-mbs/NonAgencyMortgagePool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "agency mortgage pool"},
   :rdfs/subClassOf :fibo-sec-dbt-mbs/MortgagePool,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A pool of agency mortgages."}})

(def CommercialMBS
  "commercial m b s"
  {:db/ident :fibo-sec-dbt-mbs/CommercialMBS,
   :owl/disjointWith :fibo-sec-dbt-mbs/ResidentialMBS,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "commercial m b s"},
   :rdfs/subClassOf :fibo-sec-dbt-mbs/MortgageBackedSecurity})

(def FHLMC-GoldPool
  "FHLMC Gold pool"
  {:db/ident :fibo-sec-dbt-mbs/FHLMC-GoldPool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "FHLMC Gold pool"},
   :rdfs/subClassOf :fibo-sec-dbt-mbs/AgencyMortgagePool})

(def FHLMC-Pool
  "FHLMC pool"
  {:db/ident :fibo-sec-dbt-mbs/FHLMC-Pool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "FHLMC pool"},
   :rdfs/subClassOf :fibo-sec-dbt-mbs/AgencyMortgagePool})

(def FNMA-Pool
  "FNMA pool"
  {:db/ident :fibo-sec-dbt-mbs/FNMA-Pool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "FNMA pool"},
   :rdfs/subClassOf :fibo-sec-dbt-mbs/AgencyMortgagePool})

(def FloaterTranche
  "A floater tranche is a tranche that is keyed to an index and a spread."
  {:db/ident :fibo-sec-dbt-mbs/FloaterTranche,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "For example, 3 month LIBOR +50 -- meaning that the coupon would be whatever the 3 month LIBOR is plus 50 basis points. This is not a continuously updated number, rather it resets at specified intervals."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "floater tranche"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-dt-fd/hasRecurrenceInterval,
                      :owl/someValuesFrom :fibo-fnd-dt-bd/DayOfMonth,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-dbt-mbs/TranchedMBSInstrument],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A floater tranche is a tranche that is keyed to an index and a spread."}})

(def GNMA-IIPool
  "GNMA-II pool"
  {:db/ident :fibo-sec-dbt-mbs/GNMA-IIPool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "GNMA-II pool"},
   :rdfs/subClassOf :fibo-sec-dbt-mbs/AgencyMortgagePool})

(def GNMA-PlatinumPool
  "GNMA Platinum pool"
  {:db/ident :fibo-sec-dbt-mbs/GNMA-PlatinumPool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "GNMA Platinum pool"},
   :rdfs/subClassOf :fibo-sec-dbt-mbs/AgencyMortgagePool})

(def GNMA-iPool
  "GNMA-i pool"
  {:db/ident :fibo-sec-dbt-mbs/GNMA-iPool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "GNMA-i pool"},
   :rdfs/subClassOf :fibo-sec-dbt-mbs/AgencyMortgagePool})

(def GovernmentMortgageAgency
  "An agency set up by a government for the purpose of issuing mortgages."
  {:db/ident :fibo-sec-dbt-mbs/GovernmentMortgageAgency,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "government mortgage agency"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/hasIdentity,
                      :owl/someValuesFrom :fibo-be-le-lp/LegalEntity,
                      :rdf/type           :owl/Restriction}
                     :fibo-be-fct-fct/FunctionalEntity],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An agency set up by a government for the purpose of issuing mortgages."},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "Note on the original property 'takes form of' (replaced by a restriction): The form which the Government Mortgage Agency takes. This is a Legal Entity and not a Natural Person, that is, it is an Artificial Person."},
   :skos/scopeNote
   {:rdf/language "en",
    :rdf/value
    "These exist in the USA and may also exist now or in future in other countries. There are three such agencies in thr USA: FNMA, GNMA and FHLMC (Fannie Mae, Ginnie Mae and Freddie Mac respectively)."}})

(def InverseFloaterTranche
  "inverse floater tranche"
  {:db/ident :fibo-sec-dbt-mbs/InverseFloaterTranche,
   :owl/disjointWith [:fibo-sec-dbt-mbs/SuperFloaterTranche
                      :fibo-sec-dbt-mbs/RegularFloaterTranche],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "inverse floater tranche"},
   :rdfs/subClassOf :fibo-sec-dbt-mbs/FloaterTranche})

(def IssuedAndSecuritizedAgencyMortagePool
  "An agency mortgage pool which has been securitized as part of an agency Mortgage Backed Security."
  {:db/ident :fibo-sec-dbt-mbs/IssuedAndSecuritizedAgencyMortagePool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "issued and securitized agency mortage pool"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-arr-lif/hasStage,
                      :owl/someValuesFrom :fibo-bp-iss-dbti/Issued,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-dbt-mbs/AgencyMortgagePool],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An agency mortgage pool which has been securitized as part of an agency Mortgage Backed Security."}})

(def IssuedAndSecuritizedNonAgencyMortgagePool
  "A non agency mortgage pool which has been securitized as part of a tranched Mortgage Backed Security."
  {:db/ident :fibo-sec-dbt-mbs/IssuedAndSecuritizedNonAgencyMortgagePool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value "issued and securitized non agency mortgage pool"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-arr-lif/hasStage,
                      :owl/someValuesFrom :fibo-bp-iss-dbti/Issued,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-dbt-mbs/NonAgencyMortgagePool],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A non agency mortgage pool which has been securitized as part of a tranched Mortgage Backed Security."}})

(def MBSIssuer
  "The issuer of a Mortgage Backed Security."
  {:db/ident :fibo-sec-dbt-mbs/MBSIssuer,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "This can be an agency that exists for this purpose or it may be the issuer of the original mortgages in the pool."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "m b s issuer"},
   :rdfs/subClassOf [{:owl/unionOf [:fibo-sec-dbt-mbs/GovernmentMortgageAgency
                                    :fibo-fbc-fct-fse/Bank
                                    :fibo-sec-dbt-mbs/SpecialistMortgageIssuer],
                      :rdf/type    :owl/Class}
                     :fibo-fbc-fi-fi/Issuer],
   :skos/definition {:rdf/language "en",
                     :rdf/value "The issuer of a Mortgage Backed Security."}})

(def MBSPool
  "A pool investment consisting of a collection of MBS instruments."
  {:db/ident :fibo-sec-dbt-mbs/MBSPool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "m b s pool"},
   :rdfs/subClassOf :fibo-sec-sec-pls/DebtPool,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A pool investment consisting of a collection of MBS instruments."}})

(def MBSTrancheNote
  "An individual note of a tranche."
  {:db/ident :fibo-sec-dbt-mbs/MBSTrancheNote,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "A Tranche is made up of e.g. $500m in notes and so on. These may be in different notes, with different denominations. Analytics that would apply to the Tranche would by implication apply to each slice of the tranche."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "m b s tranche note"},
   :rdfs/subClassOf :fibo-fbc-dae-dbt/PromissoryNote,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "An individual note of a tranche."}})

(def MezzanineMBSTranche
  "Specific kinds of tranche are modeled for example and investigation only and have been removed from the diagrams. These will be removed from the final model."
  {:db/ident :fibo-sec-dbt-mbs/MezzanineMBSTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "mezzanine m b s tranche"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-sec-dbt-mbs/seniorTo,
                      :owl/someValuesFrom
                      :fibo-sec-dbt-mbs/SubordinatedMBSTranche,
                      :rdf/type :owl/Restriction}
                     :fibo-sec-dbt-mbs/TranchedMBSInstrument],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Specific kinds of tranche are modeled for example and investigation only and have been removed from the diagrams. These will be removed from the final model."}})

(def MortgageBackedSecurity
  "debt obligations that represent claims to the cash flows from pools of mortgage loans, most commonly on residential property"
  {:db/ident :fibo-sec-dbt-mbs/MortgageBackedSecurity,
   :fibo-fnd-utl-av/abbreviation {:rdf/language "en",
                                  :rdf/value    "MBS"},
   :fibo-fnd-utl-av/adaptedFrom
   "ISO 10962, Securities and related financial instruments - Classification of Financial Instruments (CFI code), Fourth edition, 2019-10-01.",
   :fibo-fnd-utl-av/explanatoryNote
   "Mortgage loans are purchased from banks, mortgage companies and other originators, and then assembled into pools by a governmental, quasigovernmental or private entity. The entity then issues securities that represent claims on the principal and interest payments made by borrowers on the loans in the pool, a process known as securitization.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "mortgage-backed security"},
   :rdfs/subClassOf
   [:fibo-sec-dbt-pbs/PoolBackedSecurity
    {:owl/onProperty :fibo-fnd-rel-rel/isCharacterizedBy,
     :owl/someValuesFrom
     :fibo-md-dbtx-aly/MortgageInstrumentWeightedAverageRemainingMaturity,
     :rdf/type :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-rel-rel/isIssuedBy,
     :owl/someValuesFrom :fibo-sec-dbt-mbs/MBSIssuer,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "debt obligations that represent claims to the cash flows from pools of mortgage loans, most commonly on residential property"}})

(def MortgageBackedSecurityOfferingProspectus
  "Prospectus describing the terms of the issue and each of the instruments included in the mortgage backed security issue. Term origin:SMER"
  {:db/ident :fibo-sec-dbt-mbs/MortgageBackedSecurityOfferingProspectus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "mortgage-backed security offering prospectus"},
   :rdfs/subClassOf :fibo-sec-sec-iss/Prospectus,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Prospectus describing the terms of the issue and each of the instruments included in the mortgage backed security issue. Term origin:SMER"}})

(def MortgagePool
  "loan pool consisting of mortgages that are held in trust as collateral for the issuance of a mortgage-backed security"
  {:db/ident :fibo-sec-dbt-mbs/MortgagePool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "mortgage pool"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-arr-arr/hasConstituent,
                      :owl/someValuesFrom :fibo-loan-reln-mtg/Mortgage,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-sec-pls/DebtPool],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "loan pool consisting of mortgages that are held in trust as collateral for the issuance of a mortgage-backed security"},
   :skos/editorialNote
   [{:rdf/language "en",
     :rdf/value
     "The class Mortgage Pool originally had a property 'pool type' referring to a selection list of textual stylings of pool types. Those are now replaced with actual sub types of mortgage pool. Here are the original notes and definition that went with the enumerated list of pool types: \n\nThe type of pool for a pool backed security. Each of these pool types represents pools of mortgages that have conformed to certain standards (that change periodically) that make them \"conforming\" -- such as mortgage balance under a certain threshold, creditworthiness, loan-to-value, etc.\n\nFurther Notes:\nNon Agency signifies a tranched security, for which there will also be a Tranche Type for the security tranche itself. All other pool types are Agency pool types. \n\nList Populated from Cutter document Page 5. \n\nAdditional terms from Adept Advistory:\nUnder Agency mortgages, basically you have various types of pools under the various agencies. You have:\n-GNMA-I\n-GNMA-II\n-GNMA Platinum\n-FNMA \n-FHLMC\n-FHLMC Gold\nAs far as definitions:The simple definition is that each of these pool types represents pools of mortgages that have conformed to certain standards (that change periodically) that make them \"conforming\" -- such as mortgage balance under a certain threshold, creditworthiness, loan-to-value, etc. Also, GNMA is explicitly backed by the US government, while FNMA and FHLMC are only implicitly backed by the US government. Perhaps there needs to be some research done on the parameters for what makes a loan conforming or not. \n\nConsensus:Review."}
    {:rdf/language "en",
     :rdf/value
     "Analytics review session notes: Dated facts (for non agency mortgage pools): Aggregate of : Scheduled payments (% and $) Payments Prepayments (% and $ notional) Default amounts (statistics: Prepayments: (start at 0 and ramp up and then level off (why?)) SMM basic measure monthly Basis CPR C? Prepayment Rate based on SMM annualised PSA based on CPR takes the COR and applies a curve to the rate of prepayments on the model. (%) e.g. 100% PSA is applied to model. 200% PSA implies x%CPR per month Tries to reflect how prepayments in a pool will accelerate and then burn out. This reflects the nature of a mortgage pool, elgl why people will prepay, refinance, address selection and so on i.e. local economy facts. so those will drop out of the pool and you are left with those who will not. that's why it levels off. So who originates these figures? Is it measured ongoing?: No . Used to determine a pricing speed when marketing the security to investors. So this is part of the primary market / issuance where there is marketing. These are the estimated figures as they will be at issue. PSA may also be used as triggers. 100 - 400% PSA band - if you go outside that band, may change payment behaviour of those classes. Defaults: measures or rate of default CDR conditional default rate (annual) MDR Monhtly default rate - like CPR = Rate over time. - both defined as Rates. (%) Figures are originated by the servicer of the debt pool. Each serviceer will have their own formats but will do info on prepayments, llosses, detauls on specific loans and so on."}]})

(def NonAgencyIOTranche
  "Interest Only tranche, meaning that this tranche will only pay interest."
  {:db/ident :fibo-sec-dbt-mbs/NonAgencyIOTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "non agency i o tranche"},
   :rdfs/subClassOf :fibo-sec-dbt-mbs/TranchedMBSInstrument,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Interest Only tranche, meaning that this tranche will only pay interest."}})

(def NonAgencyJumpTranche
  "A tranche where if there is some sort of trigger event reached then the holders of the tranche will begin to receive payments."
  {:db/ident :fibo-sec-dbt-mbs/NonAgencyJumpTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "non agency jump tranche"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-sec-dbt-mbs/specifiesTrigger,
                      :owl/someValuesFrom :fibo-sec-dbt-cdo/JumpZTriggerEvent,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-dbt-mbs/TranchedMBSInstrument],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A tranche where if there is some sort of trigger event reached then the holders of the tranche will begin to receive payments."}})

(def NonAgencyJumpZTranche
  "A Jump Z tranche is like a Z tranche but if there is some sort of trigger event reached then the holders of the Jump Z tranche will begin to receive payments. Regular non-Sticky Jump Z tranches maintain their changed status only while the trigger event is in effect, and revert to their old payment status once the trigger event has passed."
  {:db/ident :fibo-sec-dbt-mbs/NonAgencyJumpZTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "non agency jump z tranche"},
   :rdfs/subClassOf [:fibo-sec-dbt-mbs/NonAgencyZTranche
                     :fibo-sec-dbt-mbs/NonAgencyJumpTranche],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A Jump Z tranche is like a Z tranche but if there is some sort of trigger event reached then the holders of the Jump Z tranche will begin to receive payments. Regular non-Sticky Jump Z tranches maintain their changed status only while the trigger event is in effect, and revert to their old payment status once the trigger event has passed."}})

(def NonAgencyMBSIssuer
  "A party which is a non agency issuer of MBS securities. The identity of this party may be a bank or a specialist (non agency) mortgage company. Term origin:MBS PoC Reviews"
  {:db/ident :fibo-sec-dbt-mbs/NonAgencyMBSIssuer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "non agency m b s issuer"},
   :rdfs/subClassOf [{:owl/unionOf [:fibo-fbc-fct-fse/Bank
                                    :fibo-sec-dbt-mbs/SpecialistMortgageIssuer],
                      :rdf/type    :owl/Class}
                     :fibo-sec-dbt-mbs/MBSIssuer],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A party which is a non agency issuer of MBS securities. The identity of this party may be a bank or a specialist (non agency) mortgage company. Term origin:MBS PoC Reviews"}})

(def NonAgencyMortgagePool
  "non agency mortgage pool"
  {:db/ident :fibo-sec-dbt-mbs/NonAgencyMortgagePool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "non agency mortgage pool"},
   :rdfs/subClassOf :fibo-sec-dbt-mbs/MortgagePool})

(def NonAgencyPOTranche
  "Principal Only tranche. This tranche will only pay principal."
  {:db/ident :fibo-sec-dbt-mbs/NonAgencyPOTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "non agency p o tranche"},
   :rdfs/subClassOf :fibo-sec-dbt-mbs/TranchedMBSInstrument,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Principal Only tranche. This tranche will only pay principal."}})

(def NonAgencyRegularJumpZTranche
  "Regular non-Sticky Jump Z tranches maintain their changed status only while the trigger event is in effect, and revert to their old payment status once the trigger event has passed."
  {:db/ident :fibo-sec-dbt-mbs/NonAgencyRegularJumpZTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "non agency regular jump z tranche"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-sec-dbt-mbs/reverts,
                      :owl/someValuesFrom
                      :fibo-sec-dbt-cdo/JumpZTriggerEventReversal,
                      :rdf/type :owl/Restriction}
                     :fibo-sec-dbt-mbs/NonAgencyJumpZTranche],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Regular non-Sticky Jump Z tranches maintain their changed status only while the trigger event is in effect, and revert to their old payment status once the trigger event has passed."}})

(def NonAgencyStickyJumpZTranche
  "\"Sticky\" Jump Z tranches maintain the payment priority of a Jump Z tranche until they are retired."
  {:db/ident :fibo-sec-dbt-mbs/NonAgencyStickyJumpZTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "non agency sticky jump z tranche"},
   :rdfs/subClassOf :fibo-sec-dbt-mbs/NonAgencyJumpZTranche,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "\"Sticky\" Jump Z tranches maintain the payment priority of a Jump Z tranche until they are retired."}})

(def NonAgencyZTranche
  "A tranche that does not receive payments while other tranches remain."
  {:db/ident :fibo-sec-dbt-mbs/NonAgencyZTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "non agency z tranche"},
   :rdfs/subClassOf :fibo-sec-dbt-mbs/TranchedMBSInstrument,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A tranche that does not receive payments while other tranches remain."},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "These tranches are credited for interest that would have been received and that interest is accrued to the Z tranche. Once all other tranches have been paid, the holders of the Z tranche receive payments. Types of Z Tranche: A Jump Z tranche is like a Z tranche but if there is some sort of trigger event reached then the holders of the Jump Z tranche will begin to receive payments. \"Sticky\" Jump Z tranches maintain this payment priority until they are retired, while regular, non-Sticky Jump Z tranches maintain their changed status only while the trigger event is in effect, and revert to their old payment status once the trigger event has passed. Review note: These are currently separate entries - they should be entries for types of Z Tranche. Add new list and move these to there."}})

(def Pass-throughPool
  "pass-through pool"
  {:db/ident :fibo-sec-dbt-mbs/Pass-throughPool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "pass-through pool"},
   :rdfs/subClassOf :fibo-sec-dbt-mbs/MortgagePool,
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "REVIEW: These are all Pass-through so not clear why this term is here. Term originates with Cutter SME review but seems redundant. If not, this would be non mutually exclusive with agency pool. In general, agency MBS pools are pass through and non agency are tranched, but this reflects a business necessity not a logical necessity."}})

(def PassThroughMBSDeal
  "An issue of Mortgage Backed Security instruments in which payments on the pool are passed through to investors"
  {:db/ident :fibo-sec-dbt-mbs/PassThroughMBSDeal,
   :owl/disjointWith :fibo-sec-dbt-mbs/TranchedMBSDeal,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "pass through m b s deal"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-sec-dbt-mbs/isAlso,
                      :owl/someValuesFrom :fibo-sec-dbt-mbs/AgencyMBSDeal,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-dbt-dbti/DebtOffering],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An issue of Mortgage Backed Security instruments in which payments on the pool are passed through to investors"},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "The cashflows from interest and principal payments on the mortgages in the underlying pool are passed on to investors, usually with the deduction of fees in for them of a reduction in a mumber of percentage points or a monetary amount. Modeling note: Thinking about this further, and after more PoC reviews, it seems to me that we should simply define two kinds of Deal which are Tranched and Pass Thtrough, just below the level of Pool Backed Securities Deal. Investigaiton of various SMOs and REMICs and the like suggests that the original PoC term duality shown here (Tranched = Non Agency; Pass Through = Agency) is too simplistic."}})

(def PassThroughMBSDealProspectus
  "The written prospectus for an agency, pass through issue of Mortgage Backed Securities"
  {:db/ident :fibo-sec-dbt-mbs/PassThroughMBSDealProspectus,
   :owl/disjointWith :fibo-sec-dbt-mbs/TranchedMBSDealProspectus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "pass through m b s deal prospectus"},
   :rdfs/subClassOf :fibo-sec-dbt-mbs/MortgageBackedSecurityOfferingProspectus,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The written prospectus for an agency, pass through issue of Mortgage Backed Securities"}})

(def PassThroughMBSInstrument
  "A security in which the cash flows from the underlying asset pool are passed through to the investor by way of redemption payments."
  {:db/ident :fibo-sec-dbt-mbs/PassThroughMBSInstrument,
   :owl/disjointWith :fibo-sec-dbt-mbs/TranchedMBSInstrument,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "pass through m b s instrument"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-sec-dbt-mbs/hasNote,
                      :owl/someValuesFrom
                      :fibo-sec-dbt-mbs/PassThroughMBSInstrumentNote,
                      :rdf/type :owl/Restriction}
                     :fibo-sec-dbt-mbs/MortgageBackedSecurity],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A security in which the cash flows from the underlying asset pool are passed through to the investor by way of redemption payments."}})

(def PassThroughMBSInstrumentNote
  "An individual note of a pass through instrument."
  {:db/ident :fibo-sec-dbt-mbs/PassThroughMBSInstrumentNote,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "pass through m b s instrument note"},
   :rdfs/subClassOf :fibo-fbc-dae-dbt/PromissoryNote,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "An individual note of a pass through instrument."}})

(def PassThroughMBSIssueUnderwriter
  "The party which agrees to buy any certificates that are not bought by investors Term origin:MBS PoC Reviews"
  {:db/ident :fibo-sec-dbt-mbs/PassThroughMBSIssueUnderwriter,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "pass through m b s issue underwriter"},
   :rdfs/subClassOf :fibo-sec-sec-iss/SecurityUnderwriter,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The party which agrees to buy any certificates that are not bought by investors Term origin:MBS PoC Reviews"}})

(def PayingAgent
  "paying agent"
  {:db/ident :fibo-sec-dbt-mbs/PayingAgent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "paying agent"},
   :rdfs/subClassOf {:owl/onProperty     :fibo-sec-dbt-mbs/responsibleFor,
                     :owl/someValuesFrom :fibo-fnd-pas-psch/Payment,
                     :rdf/type           :owl/Restriction}})

(def PrivateLabelMBSDeal
  "private label m b s deal"
  {:db/ident :fibo-sec-dbt-mbs/PrivateLabelMBSDeal,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "private label m b s deal"},
   :rdfs/subClassOf :fibo-sec-dbt-dbti/DebtOffering})

(def RealEstateMortgageInvestmentConduit
  "special purpose vehicle that pools mortgage loans together and issues mortgage-backed securities"
  {:db/ident :fibo-sec-dbt-mbs/RealEstateMortgageInvestmentConduit,
   :fibo-fnd-utl-av/abbreviation {:rdf/language "en",
                                  :rdf/value    "REMIC"},
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "A real estate mortgage investment conduit may be organized as a partnership, a trust, a corporation, or an association and is exempt from federal taxes."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "real estate mortgage investment conduit"},
   :rdfs/seeAlso
   ["https://www.investopedia.com/terms/r/real-estate-mortgage-investment-conduit-remic.asp"],
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-sec-dbt-mbs/MortgagePool,
                      :owl/onProperty :fibo-fnd-oac-own/owns,
                      :rdf/type       :owl/Restriction}
                     :fibo-be-le-lp/SpecialPurposeVehicle],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "special purpose vehicle that pools mortgage loans together and issues mortgage-backed securities"}})

(def RegularFloaterTranche
  "A floater tranche is a tranche that is keyed to an index and a spread. The spread is added to the index."
  {:db/ident :fibo-sec-dbt-mbs/RegularFloaterTranche,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "For example, 3 month LIBOR +50 -- meaning that the coupon would be whatever the 3 month LIBOR is plus 50 basis points. This is not a continuously updated number, rather it resets at specified intervals."},
   :owl/disjointWith :fibo-sec-dbt-mbs/SuperFloaterTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "regular floater tranche"},
   :rdfs/subClassOf :fibo-sec-dbt-mbs/FloaterTranche,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A floater tranche is a tranche that is keyed to an index and a spread. The spread is added to the index."}})

(def ResidentialMBS
  "Residential Mortgage-Backed Securities, which are trust certificates (bonds) backed by a pool of residential mortgage loans."
  {:db/ident :fibo-sec-dbt-mbs/ResidentialMBS,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Notes from CESR: They are issued by banks and backed by an underlying pool of residential mortgages. There can be some distinctions between prime RMBS and sub-prime/non-conforming RMBS although there is no consensus about what constitutes a sub-prime/non-conforming mortgage in Europe."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "residential m b s"},
   :rdfs/subClassOf :fibo-sec-dbt-mbs/MortgageBackedSecurity,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Residential Mortgage-Backed Securities, which are trust certificates (bonds) backed by a pool of residential mortgage loans."}})

(def ResidualTranche
  "Unknown Further notes: Verify whether Residual Tranche and Support Tranche are meant to be in the same list of types as PAC etc. i.e. can a tranche not be PAC and Residual? this looks suspicioulsy like two semantics."
  {:db/ident :fibo-sec-dbt-mbs/ResidualTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "residual tranche"},
   :rdfs/subClassOf :fibo-sec-dbt-mbs/TranchedMBSInstrument,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Unknown Further notes: Verify whether Residual Tranche and Support Tranche are meant to be in the same list of types as PAC etc. i.e. can a tranche not be PAC and Residual? this looks suspicioulsy like two semantics."}})

(def SBA-Pool
  "SBA pool"
  {:db/ident :fibo-sec-dbt-mbs/SBA-Pool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "SBA pool"},
   :rdfs/subClassOf :fibo-sec-dbt-mbs/MortgagePool,
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "Unknown pool type, from Cutter SME reviews; other pool types listed under Agency are from or validated by AdeptAdvisory SME review."}})

(def SeniorMBSTranche
  "Specific kinds of tranche are modeled for example and investigation only and have been removed from the diagrams. These will be removed from the final model."
  {:db/ident :fibo-sec-dbt-mbs/SeniorMBSTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "senior m b s tranche"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-sec-dbt-mbs/seniorTo,
                      :owl/someValuesFrom :fibo-sec-dbt-mbs/MezzanineMBSTranche,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-dbt-mbs/TranchedMBSInstrument],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Specific kinds of tranche are modeled for example and investigation only and have been removed from the diagrams. These will be removed from the final model."}})

(def SpecialistMortgageIssuer
  "A business organization that specialises in and exists for the issuance of mortgages to the general public."
  {:db/ident :fibo-sec-dbt-mbs/SpecialistMortgageIssuer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "specialist mortgage issuer"},
   :rdfs/subClassOf :fibo-be-fct-fct/FunctionalBusinessEntity,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A business organization that specialises in and exists for the issuance of mortgages to the general public."},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "Possibly add: Building Society. these exist in the UK (though almost extinct) but have not come up in US-based reviews of the model. Also known as Friendly Societies. There may be analogous organisations in other parts of the world, e.g. South America??"}})

(def SubordinatedMBSTranche
  "Specific kinds of tranche are modeled for example and investigation only and have been removed from the diagrams. These will be removed from the final model."
  {:db/ident :fibo-sec-dbt-mbs/SubordinatedMBSTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "subordinated m b s tranche"},
   :rdfs/subClassOf :fibo-sec-dbt-mbs/TranchedMBSInstrument,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Specific kinds of tranche are modeled for example and investigation only and have been removed from the diagrams. These will be removed from the final model."}})

(def SuperFloaterTranche
  "super floater tranche"
  {:db/ident :fibo-sec-dbt-mbs/SuperFloaterTranche,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "super floater tranche"},
   :rdfs/subClassOf :fibo-sec-dbt-mbs/FloaterTranche})

(def TrancheRatingAtIssue
  "The rating at issue of a tranche of a security. Note this is under review"
  {:db/ident :fibo-sec-dbt-mbs/TrancheRatingAtIssue,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "tranche rating at issue"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The rating at issue of a tranche of a security. Note this is under review"},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "In the case of CDOs, senior and mezzanine tranches of a CDO issue are typically rated, with the former receiving ratings of A to AAA and the latter receiving ratings of B to BBB. The ratings reflect both the credit quality of underlying collateral as well as how much protection a given tranch is afforded by tranches that are subordinate to it. Review note: Remove this it's no different from an instrument."}})

(def TrancheType
  "the type of tranche in a tranched MBS security"
  {:db/ident :fibo-sec-dbt-mbs/TrancheType,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "tranche type"},
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "the type of tranche in a tranched MBS security"}})

(def TranchedMBSDeal
  "tranched m b s deal"
  {:db/ident :fibo-sec-dbt-mbs/TranchedMBSDeal,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "tranched m b s deal"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-sec-dbt-mbs/isAlso.1,
                      :owl/someValuesFrom :fibo-sec-dbt-mbs/PrivateLabelMBSDeal,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-dbt-dbti/DebtOffering]})

(def TranchedMBSDealProspectus
  "tranched m b s deal prospectus"
  {:db/ident :fibo-sec-dbt-mbs/TranchedMBSDealProspectus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "tranched m b s deal prospectus"},
   :rdfs/subClassOf :fibo-sec-dbt-mbs/MortgageBackedSecurityOfferingProspectus})

(def TranchedMBSInstrument
  "tranched m b s instrument"
  {:db/ident :fibo-sec-dbt-mbs/TranchedMBSInstrument,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "tranched m b s instrument"},
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
    :fibo-sec-dbt-mbs/MortgageBackedSecurity]})

(def TranchedMBSIssueUnderwriter
  "The party which agrees to buy any certificates that are not bought by investors Term origin:MBS PoC Reviews"
  {:db/ident :fibo-sec-dbt-mbs/TranchedMBSIssueUnderwriter,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "tranched m b s issue underwriter"},
   :rdfs/subClassOf :fibo-sec-sec-iss/SecurityUnderwriter,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The party which agrees to buy any certificates that are not bought by investors Term origin:MBS PoC Reviews"}})

(def cashflowPrecedence
  "cashflow precedence"
  {:db/ident :fibo-sec-dbt-mbs/cashflowPrecedence,
   :owl/inverseOf :fibo-sec-dbt-mbs/providesCreditSupportTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-mbs/TranchedMBSInstrument,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "cashflow precedence"},
   :rdfs/range :fibo-sec-dbt-mbs/TranchedMBSInstrument})

(def denomination
  "The currency amount in which the Note is denominated, for example $500 notes."
  {:db/ident :fibo-sec-dbt-mbs/denomination,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-mbs/MBSTrancheNote,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "denomination"},
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The currency amount in which the Note is denominated, for example $500 notes."}})

(def denomination.1
  "The currency amount in which the Note is denominated, for example $500 notes. This term added by symmettry with MBS Tranche Note. needs to be reviewed and validated."
  {:db/ident :fibo-sec-dbt-mbs/denomination.1,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-mbs/PassThroughMBSInstrumentNote,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "denomination"},
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The currency amount in which the Note is denominated, for example $500 notes. This term added by symmettry with MBS Tranche Note. needs to be reviewed and validated."}})

(def hasNote
  "has note"
  {:db/ident :fibo-sec-dbt-mbs/hasNote,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-mbs/MortgageBackedSecurity,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has note"},
   :rdfs/range :fibo-fbc-dae-dbt/PromissoryNote,
   :rdfs/subPropertyOf :lcc-cr/hasPart})

(def hasTrancheType
  "has tranche type"
  {:db/ident :fibo-sec-dbt-mbs/hasTrancheType,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-pbs/StructuredFinanceInstrument,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has tranche type"},
   :rdfs/range :fibo-sec-dbt-mbs/TrancheType})

(def isAlso
  "is also"
  {:db/ident :fibo-sec-dbt-mbs/isAlso,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-mbs/PassThroughMBSDeal,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is also"},
   :rdfs/range :fibo-sec-dbt-mbs/AgencyMBSDeal})

(def isAlso.1
  "is also"
  {:db/ident :fibo-sec-dbt-mbs/isAlso.1,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-mbs/TranchedMBSDeal,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is also"},
   :rdfs/range :fibo-sec-dbt-mbs/PrivateLabelMBSDeal})

(def isSliceOf
  "is slice of"
  {:db/ident :fibo-sec-dbt-mbs/isSliceOf,
   :owl/inverseOf :fibo-sec-dbt-mbs/hasNote,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-dae-dbt/PromissoryNote,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is slice of"},
   :rdfs/range :fibo-sec-dbt-mbs/MortgageBackedSecurity,
   :rdfs/subPropertyOf :lcc-cr/isPartOf})

(def prime
  "Whether the mortage pool is identified as Prime or not."
  {:db/ident :fibo-sec-dbt-mbs/prime,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-dbt-mbs/ResidentialMBS,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "prime"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Whether the mortage pool is identified as Prime or not."}})

(def providesCreditSupportTo
  "provides credit support to"
  {:db/ident :fibo-sec-dbt-mbs/providesCreditSupportTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-mbs/TranchedMBSInstrument,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "provides credit support to"},
   :rdfs/range :fibo-sec-dbt-mbs/TranchedMBSInstrument,
   :rdfs/subPropertyOf :fibo-sec-dbt-dbti/isSubordinatedTo})

(def responsibleFor
  "responsible for"
  {:db/ident :fibo-sec-dbt-mbs/responsibleFor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-mbs/PayingAgent,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "responsible for"},
   :rdfs/range :fibo-fnd-pas-psch/Payment})

(def reverts
  "reverts"
  {:db/ident :fibo-sec-dbt-mbs/reverts,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-mbs/NonAgencyRegularJumpZTranche,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "reverts"},
   :rdfs/range :fibo-sec-dbt-cdo/JumpZTriggerEventReversal})

(def seniorTo
  "Specific kinds of tranche are modeled for example and investigation only and have been removed from the diagrams. These will be removed from the final model."
  {:db/ident :fibo-sec-dbt-mbs/seniorTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain [:fibo-sec-dbt-mbs/SeniorMBSTranche
                 :fibo-sec-dbt-mbs/MezzanineMBSTranche],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "senior to"},
   :rdfs/range [:fibo-sec-dbt-mbs/SubordinatedMBSTranche
                :fibo-sec-dbt-mbs/MezzanineMBSTranche],
   :rdfs/subPropertyOf :fibo-sec-dbt-mbs/cashflowPrecedence,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Specific kinds of tranche are modeled for example and investigation only and have been removed from the diagrams. These will be removed from the final model."}})

(def specifiesTrigger
  "The event which, when it takes place, causes the Jump Z holders to begin receiving payments."
  {:db/ident :fibo-sec-dbt-mbs/specifiesTrigger,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-mbs/NonAgencyJumpTranche,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "specifies trigger"},
   :rdfs/range :fibo-sec-dbt-cdo/JumpZTriggerEvent,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The event which, when it takes place, causes the Jump Z holders to begin receiving payments."}})