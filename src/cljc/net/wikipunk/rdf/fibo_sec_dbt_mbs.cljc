(ns net.wikipunk.rdf.fibo-sec-dbt-mbs
  {:cmns-av/copyright "Copyright (c) 2015-2024 EDM Council, Inc.",
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Debt/MortgageBackedSecurities/",
   :dcterms/abstract
   "Mortgage backed securities are like asset backed securities except that the underlying loan pool is a pool of mortgage loans.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-rlcmp" "https://www.omg.org/spec/Commons/RolesAndCompositions/",
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
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Securities/Pools/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/DatesAndTimes/FinancialDates/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Debt/AssetBackedSecurities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/FunctionalEntities/FunctionalEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/ProductsAndServices/PaymentsAndSchedules/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/OwnershipAndControl/Ownership/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Funds/Funds/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/DatesAndTimes/BusinessDates/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/DebtAndEquities/Debt/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Securities/SecuritiesIssuance/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/LOAN/RealEstateLoans/MortgageLoans/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FunctionalEntities/FinancialServicesEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Arrangements/Lifecycles/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BP/SecuritiesIssuance/DebtIssuance/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Debt/DebtInstruments/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Debt/PoolBackedSecurities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Agreements/Contracts/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Debt/MortgageBackedSecurities/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-sec-dbt-mbs",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Mortgage-backed Securities Ontology"},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/"})

(def AgencyMBSDeal
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "These are Ginnie Mae, Freddie Mac and Fannie Mae (for the US). Of these agencies, GNMA (Ginnie Mae) issues mortgages in its own right (Investorwords differs on this). Fannie Mae and Freddie Mac purchase mortgages. Those mortgages are issued by banks. Before one of these agencies purchases a mortgage, there are certain criteria that have to be met. These are specified in terms of, for example, the balance of the mortgage, limits to credit ratings."},
   :db/ident :fibo-sec-dbt-mbs/AgencyMBSDeal,
   :owl/disjointWith :fibo-sec-dbt-mbs/PrivateLabelMBSDeal,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "agency m b s deal"},
   :rdfs/subClassOf :fibo-sec-dbt-dbti/DebtOffering,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An issue of securities backed by pools of mortgages held by government agencies."}})

(def AgencyMBSIssuer
  {:db/ident :fibo-sec-dbt-mbs/AgencyMBSIssuer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "agency m b s issuer"},
   :rdfs/subClassOf #{:fibo-sec-dbt-mbs/MBSIssuer
                      :fibo-sec-dbt-mbs/GovernmentMortgageAgency},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The issuer of the pass through MBS is an Agency issuer. This is identified as being some kind of agency that is set up specifically to issue these instruments."}})

(def AgencyMBSPool
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "This pool may be used as the underlying for an agency CMO. Non agency CMOs do not exist."},
   :db/ident :fibo-sec-dbt-mbs/AgencyMBSPool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "agency m b s pool"},
   :rdfs/subClassOf :fibo-sec-dbt-mbs/MBSPool,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A pool investment consisting of a collection of Agency MBS instruments."}})

(def AgencyMortgagePool
  {:db/ident :fibo-sec-dbt-mbs/AgencyMortgagePool,
   :owl/disjointWith :fibo-sec-dbt-mbs/NonAgencyMortgagePool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "agency mortgage pool"},
   :rdfs/subClassOf :fibo-sec-dbt-mbs/MortgagePool,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "A pool of agency mortgages."}})

(def CommercialMBS
  {:db/ident :fibo-sec-dbt-mbs/CommercialMBS,
   :owl/disjointWith :fibo-sec-dbt-mbs/ResidentialMBS,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "commercial m b s"},
   :rdfs/subClassOf :fibo-sec-dbt-mbs/MortgageBackedSecurity})

(def FHLMC-GoldPool
  {:db/ident :fibo-sec-dbt-mbs/FHLMC-GoldPool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "FHLMC Gold pool"},
   :rdfs/subClassOf :fibo-sec-dbt-mbs/AgencyMortgagePool})

(def FHLMC-Pool
  {:db/ident :fibo-sec-dbt-mbs/FHLMC-Pool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "FHLMC pool"},
   :rdfs/subClassOf :fibo-sec-dbt-mbs/AgencyMortgagePool})

(def FNMA-Pool
  {:db/ident :fibo-sec-dbt-mbs/FNMA-Pool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "FNMA pool"},
   :rdfs/subClassOf :fibo-sec-dbt-mbs/AgencyMortgagePool})

(def GNMA-IIPool
  {:db/ident :fibo-sec-dbt-mbs/GNMA-IIPool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "GNMA-II pool"},
   :rdfs/subClassOf :fibo-sec-dbt-mbs/AgencyMortgagePool})

(def GNMA-PlatinumPool
  {:db/ident :fibo-sec-dbt-mbs/GNMA-PlatinumPool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "GNMA Platinum pool"},
   :rdfs/subClassOf :fibo-sec-dbt-mbs/AgencyMortgagePool})

(def GNMA-iPool
  {:db/ident :fibo-sec-dbt-mbs/GNMA-iPool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "GNMA-i pool"},
   :rdfs/subClassOf :fibo-sec-dbt-mbs/AgencyMortgagePool})

(def GovernmentMortgageAgency
  {:db/ident :fibo-sec-dbt-mbs/GovernmentMortgageAgency,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "government mortgage agency"},
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-rlcmp/isPlayedBy,
                       :owl/someValuesFrom :fibo-be-le-lp/LegalEntity,
                       :rdf/type           :owl/Restriction}
                      :fibo-be-fct-fct/FunctionalEntity},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An agency set up by a government for the purpose of issuing mortgages."},
   :skos/scopeNote
   {:rdf/language "en",
    :rdf/value
    "There are three such agencies in the United States: FNMA, GNMA and FHLMC (Fannie Mae, Ginnie Mae and Freddie Mac respectively), and there may be others outside of the US."}})

(def IssuedAndSecuritizedAgencyMortagePool
  {:db/ident :fibo-sec-dbt-mbs/IssuedAndSecuritizedAgencyMortagePool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "issued and securitized agency mortage pool"},
   :rdfs/subClassOf #{:fibo-sec-dbt-mbs/AgencyMortgagePool
                      {:owl/onProperty     :fibo-fnd-arr-lif/hasStage,
                       :owl/someValuesFrom :fibo-bp-iss-dbti/Issued,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An agency mortgage pool which has been securitized as part of an agency Mortgage Backed Security."}})

(def IssuedAndSecuritizedNonAgencyMortgagePool
  {:db/ident :fibo-sec-dbt-mbs/IssuedAndSecuritizedNonAgencyMortgagePool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value "issued and securitized non agency mortgage pool"},
   :rdfs/subClassOf #{:fibo-sec-dbt-mbs/NonAgencyMortgagePool
                      {:owl/onProperty     :fibo-fnd-arr-lif/hasStage,
                       :owl/someValuesFrom :fibo-bp-iss-dbti/Issued,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A non agency mortgage pool which has been securitized as part of a tranched Mortgage Backed Security."}})

(def MBSIssuer
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "This can be an agency that exists for this purpose or it may be the issuer of the original mortgages in the pool."},
   :db/ident :fibo-sec-dbt-mbs/MBSIssuer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "m b s issuer"},
   :rdfs/subClassOf #{{:owl/unionOf
                       [:fibo-sec-dbt-mbs/GovernmentMortgageAgency
                        :fibo-fbc-fct-fse/Bank
                        :fibo-sec-dbt-mbs/SpecialistMortgageIssuer],
                       :rdf/type :owl/Class} :fibo-fbc-fi-fi/Issuer},
   :skos/definition {:rdf/language "en",
                     :rdf/value "The issuer of a Mortgage Backed Security."}})

(def MBSPool
  {:db/ident :fibo-sec-dbt-mbs/MBSPool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "m b s pool"},
   :rdfs/subClassOf :fibo-sec-sec-pls/DebtPool,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A pool investment consisting of a collection of MBS instruments."}})

(def MortgageBackedSecurity
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "MBS"},
   :cmns-av/adaptedFrom
   {:rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of Financial Instruments (CFI code), Fourth edition, 2019-10-01."},
   :cmns-av/explanatoryNote
   "Mortgage loans are purchased from banks, mortgage companies and other originators, and then assembled into pools by a governmental, quasigovernmental or private entity. The entity then issues securities that represent claims on the principal and interest payments made by borrowers on the loans in the pool, a process known as securitization.",
   :db/ident :fibo-sec-dbt-mbs/MortgageBackedSecurity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "mortgage-backed security"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :cmns-cls/isCharacterizedBy,
      :owl/someValuesFrom :fibo-sec-dbt-pbs/WeightedAverageRemainingTerm,
      :rdf/type           :owl/Restriction} :fibo-sec-dbt-pbs/PoolBackedSecurity
     {:owl/onProperty     :fibo-fnd-rel-rel/isIssuedBy,
      :owl/someValuesFrom :fibo-sec-dbt-mbs/MBSIssuer,
      :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "debt obligations that represent claims to the cash flows from pools of mortgage loans, most commonly on residential property"}})

(def MortgageBackedSecurityOfferingProspectus
  {:db/ident :fibo-sec-dbt-mbs/MortgageBackedSecurityOfferingProspectus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "mortgage-backed security offering prospectus"},
   :rdfs/subClassOf :fibo-sec-sec-iss/Prospectus,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Prospectus describing the terms of the issue and each of the instruments included in the mortgage backed security issue. Term origin:SMER"}})

(def MortgagePool
  {:db/ident :fibo-sec-dbt-mbs/MortgagePool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "mortgage pool"},
   :rdfs/subClassOf #{:fibo-sec-sec-pls/DebtPool
                      {:owl/onProperty     :cmns-col/hasConstituent,
                       :owl/someValuesFrom :fibo-loan-reln-mtg/Mortgage,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "loan pool consisting of mortgages that are held in trust as collateral for the issuance of a mortgage-backed security"},
   :skos/editorialNote
   #{{:rdf/language "en",
      :rdf/value
      "The class Mortgage Pool originally had a property 'pool type' referring to a selection list of textual stylings of pool types. Those are now replaced with actual sub types of mortgage pool. Here are the original notes and definition that went with the enumerated list of pool types: \n\nThe type of pool for a pool backed security. Each of these pool types represents pools of mortgages that have conformed to certain standards (that change periodically) that make them \"conforming\" -- such as mortgage balance under a certain threshold, creditworthiness, loan-to-value, etc.\n\nFurther Notes:\nNon Agency signifies a tranched security, for which there will also be a Tranche Type for the security tranche itself. All other pool types are Agency pool types. \n\nList Populated from Cutter document Page 5. \n\nAdditional terms from Adept Advistory:\nUnder Agency mortgages, basically you have various types of pools under the various agencies. You have:\n-GNMA-I\n-GNMA-II\n-GNMA Platinum\n-FNMA \n-FHLMC\n-FHLMC Gold\nAs far as definitions:The simple definition is that each of these pool types represents pools of mortgages that have conformed to certain standards (that change periodically) that make them \"conforming\" -- such as mortgage balance under a certain threshold, creditworthiness, loan-to-value, etc. Also, GNMA is explicitly backed by the US government, while FNMA and FHLMC are only implicitly backed by the US government. Perhaps there needs to be some research done on the parameters for what makes a loan conforming or not. \n\nConsensus:Review."}
     {:rdf/language "en",
      :rdf/value
      "Analytics review session notes: Dated facts (for non agency mortgage pools): Aggregate of : Scheduled payments (% and $) Payments Prepayments (% and $ notional) Default amounts (statistics: Prepayments: (start at 0 and ramp up and then level off (why?)) SMM basic measure monthly Basis CPR C? Prepayment Rate based on SMM annualised PSA based on CPR takes the COR and applies a curve to the rate of prepayments on the model. (%) e.g. 100% PSA is applied to model. 200% PSA implies x%CPR per month Tries to reflect how prepayments in a pool will accelerate and then burn out. This reflects the nature of a mortgage pool, elgl why people will prepay, refinance, address selection and so on i.e. local economy facts. so those will drop out of the pool and you are left with those who will not. that's why it levels off. So who originates these figures? Is it measured ongoing?: No . Used to determine a pricing speed when marketing the security to investors. So this is part of the primary market / issuance where there is marketing. These are the estimated figures as they will be at issue. PSA may also be used as triggers. 100 - 400% PSA band - if you go outside that band, may change payment behaviour of those classes. Defaults: measures or rate of default CDR conditional default rate (annual) MDR Monhtly default rate - like CPR = Rate over time. - both defined as Rates. (%) Figures are originated by the servicer of the debt pool. Each serviceer will have their own formats but will do info on prepayments, llosses, detauls on specific loans and so on."}}})

(def NonAgencyMBSIssuer
  {:db/ident :fibo-sec-dbt-mbs/NonAgencyMBSIssuer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "non agency m b s issuer"},
   :rdfs/subClassOf #{{:owl/unionOf
                       [:fibo-fbc-fct-fse/Bank
                        :fibo-sec-dbt-mbs/SpecialistMortgageIssuer],
                       :rdf/type :owl/Class} :fibo-sec-dbt-mbs/MBSIssuer},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A party which is a non agency issuer of MBS securities. The identity of this party may be a bank or a specialist (non agency) mortgage company. Term origin:MBS PoC Reviews"}})

(def NonAgencyMortgagePool
  {:db/ident :fibo-sec-dbt-mbs/NonAgencyMortgagePool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "non agency mortgage pool"},
   :rdfs/subClassOf :fibo-sec-dbt-mbs/MortgagePool})

(def Pass-throughPool
  {:db/ident :fibo-sec-dbt-mbs/Pass-throughPool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "pass-through pool"},
   :rdfs/subClassOf :fibo-sec-dbt-mbs/MortgagePool,
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "REVIEW: These are all Pass-through so not clear why this term is here. Term originates with Cutter SME review but seems redundant. If not, this would be non mutually exclusive with agency pool. In general, agency MBS pools are pass through and non agency are tranched, but this reflects a business necessity not a logical necessity."}})

(def PassThroughMBSDeal
  {:db/ident :fibo-sec-dbt-mbs/PassThroughMBSDeal,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "pass through m b s deal"},
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-sec-dbt-mbs/isAlso,
                       :owl/someValuesFrom :fibo-sec-dbt-mbs/AgencyMBSDeal,
                       :rdf/type           :owl/Restriction}
                      :fibo-sec-dbt-dbti/DebtOffering},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "An issue of Mortgage Backed Security instruments in which payments on the pool are passed through to investors"},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "The cashflows from interest and principal payments on the mortgages in the underlying pool are passed on to investors, usually with the deduction of fees in for them of a reduction in a mumber of percentage points or a monetary amount. Modeling note: Thinking about this further, and after more PoC reviews, it seems to me that we should simply define two kinds of Deal which are Tranched and Pass Thtrough, just below the level of Pool Backed Securities Deal. Investigaiton of various SMOs and REMICs and the like suggests that the original PoC term duality shown here (Tranched = Non Agency; Pass Through = Agency) is too simplistic."}})

(def PassThroughMBSDealProspectus
  {:db/ident :fibo-sec-dbt-mbs/PassThroughMBSDealProspectus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "pass through m b s deal prospectus"},
   :rdfs/subClassOf :fibo-sec-dbt-mbs/MortgageBackedSecurityOfferingProspectus,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The written prospectus for an agency, pass through issue of Mortgage Backed Securities"}})

(def PassThroughMBSInstrument
  {:db/ident :fibo-sec-dbt-mbs/PassThroughMBSInstrument,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "pass through m b s instrument"},
   :rdfs/subClassOf #{:fibo-sec-dbt-mbs/MortgageBackedSecurity
                      {:owl/onProperty :fibo-sec-dbt-mbs/hasNote,
                       :owl/someValuesFrom
                       :fibo-sec-dbt-mbs/PassThroughMBSInstrumentNote,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A security in which the cash flows from the underlying asset pool are passed through to the investor by way of redemption payments."}})

(def PassThroughMBSInstrumentNote
  {:db/ident :fibo-sec-dbt-mbs/PassThroughMBSInstrumentNote,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "pass through m b s instrument note"},
   :rdfs/subClassOf :fibo-fbc-dae-dbt/PromissoryNote,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "An individual note of a pass through instrument."}})

(def PassThroughMBSIssueUnderwriter
  {:db/ident :fibo-sec-dbt-mbs/PassThroughMBSIssueUnderwriter,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "pass through m b s issue underwriter"},
   :rdfs/subClassOf :fibo-sec-sec-iss/SecurityUnderwriter,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The party which agrees to buy any certificates that are not bought by investors Term origin:MBS PoC Reviews"}})

(def PayingAgent
  {:db/ident :fibo-sec-dbt-mbs/PayingAgent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "paying agent"},
   :rdfs/subClassOf {:owl/onProperty     :fibo-sec-dbt-mbs/responsibleFor,
                     :owl/someValuesFrom :fibo-fnd-pas-psch/Payment,
                     :rdf/type           :owl/Restriction}})

(def PrivateLabelMBSDeal
  {:db/ident :fibo-sec-dbt-mbs/PrivateLabelMBSDeal,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "private label m b s deal"},
   :rdfs/subClassOf :fibo-sec-dbt-dbti/DebtOffering})

(def RealEstateMortgageInvestmentConduit
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "REMIC"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "A real estate mortgage investment conduit may be organized as a partnership, a trust, a corporation, or an association and is exempt from federal taxes."},
   :db/ident :fibo-sec-dbt-mbs/RealEstateMortgageInvestmentConduit,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "real estate mortgage investment conduit"},
   :rdfs/seeAlso
   {:xsd/anyURI
    "https://www.investopedia.com/terms/r/real-estate-mortgage-investment-conduit-remic.asp"},
   :rdfs/subClassOf #{{:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-sec-dbt-mbs/MortgagePool,
                       :owl/onProperty :fibo-fnd-oac-own/owns,
                       :rdf/type       :owl/Restriction}
                      :fibo-be-le-lp/SpecialPurposeVehicle},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "special purpose vehicle that pools mortgage loans together and issues mortgage-backed securities"}})

(def ResidentialMBS
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Notes from CESR: They are issued by banks and backed by an underlying pool of residential mortgages. There can be some distinctions between prime RMBS and sub-prime/non-conforming RMBS although there is no consensus about what constitutes a sub-prime/non-conforming mortgage in Europe."},
   :db/ident :fibo-sec-dbt-mbs/ResidentialMBS,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "residential m b s"},
   :rdfs/subClassOf :fibo-sec-dbt-mbs/MortgageBackedSecurity,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Residential Mortgage-Backed Securities, which are trust certificates (bonds) backed by a pool of residential mortgage loans."}})

(def SBA-Pool
  {:db/ident :fibo-sec-dbt-mbs/SBA-Pool,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "SBA pool"},
   :rdfs/subClassOf :fibo-sec-dbt-mbs/MortgagePool,
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "Unknown pool type, from Cutter SME reviews; other pool types listed under Agency are from or validated by AdeptAdvisory SME review."}})

(def SpecialistMortgageIssuer
  {:db/ident :fibo-sec-dbt-mbs/SpecialistMortgageIssuer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/"},
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

(def denomination_1
  {:db/ident :fibo-sec-dbt-mbs/denomination.1,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-mbs/PassThroughMBSInstrumentNote,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "denomination"},
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The currency amount in which the Note is denominated, for example $500 notes. This term added by symmettry with MBS Tranche Note. needs to be reviewed and validated."}})

(def hasNote
  {:db/ident :fibo-sec-dbt-mbs/hasNote,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-mbs/MortgageBackedSecurity,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has note"},
   :rdfs/range :fibo-fbc-dae-dbt/PromissoryNote,
   :rdfs/subPropertyOf :cmns-col/hasPart})

(def isAlso
  {:db/ident :fibo-sec-dbt-mbs/isAlso,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-mbs/PassThroughMBSDeal,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is also"},
   :rdfs/range :fibo-sec-dbt-mbs/AgencyMBSDeal})

(def isSliceOf
  {:db/ident :fibo-sec-dbt-mbs/isSliceOf,
   :owl/inverseOf :fibo-sec-dbt-mbs/hasNote,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-dae-dbt/PromissoryNote,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "is slice of"},
   :rdfs/range :fibo-sec-dbt-mbs/MortgageBackedSecurity,
   :rdfs/subPropertyOf :cmns-col/isPartOf})

(def prime
  {:db/ident :fibo-sec-dbt-mbs/prime,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-dbt-mbs/ResidentialMBS,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "prime"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value    "Whether the mortage pool is identified as Prime or not."}})

(def responsibleFor
  {:db/ident :fibo-sec-dbt-mbs/responsibleFor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-mbs/PayingAgent,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "responsible for"},
   :rdfs/range :fibo-fnd-pas-psch/Payment})

(def urn:uuid:2a4850ac-266e-5f6e-a8ee-2523343c2385
  {:cmns-av/copyright "Copyright (c) 2015-2024 EDM Council, Inc.",
   :dcterms/abstract
   "Mortgage backed securities are like asset backed securities except that the underlying loan pool is a pool of mortgage loans.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Securities/Pools/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/DatesAndTimes/FinancialDates/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Debt/AssetBackedSecurities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/FunctionalEntities/FunctionalEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/ProductsAndServices/PaymentsAndSchedules/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/OwnershipAndControl/Ownership/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Funds/Funds/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/DatesAndTimes/BusinessDates/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/DebtAndEquities/Debt/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Securities/SecuritiesIssuance/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/LOAN/RealEstateLoans/MortgageLoans/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FunctionalEntities/FinancialServicesEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Arrangements/Lifecycles/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BP/SecuritiesIssuance/DebtIssuance/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Debt/DebtInstruments/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Debt/PoolBackedSecurities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Agreements/Contracts/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Debt/MortgageBackedSecurities/"},
   :rdf/type :owl/Ontology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Mortgage-backed Securities Ontology"},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/"})