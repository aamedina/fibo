(ns net.wikipunk.fibo.boot
  {:rdf/type :jsonld/Context})

(comment
  (require '[clojure.datafy :refer [datafy]])
  (->> (datafy :fibo-spec/FIBOSpecification)
       (:dcterms/hasPart)
       (map datafy)
       (map :dcterms/hasPart)
       (mapcat #(if (set? %) % #{}))
       (map datafy)
       (map :dcterms/hasPart)
       (mapcat #(if (set? %) % #{}))
       (sort-by :xsd/anyURI)))

(def spec
  {:dcat/downloadURL "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/MetadataFIBO/FIBOSpecification"
   :rdfa/prefix      "fibo-spec"
   :rdfa/uri         "https://spec.edmcouncil.org/fibo/ontology/MetadataFIBO/"
   :rdf/type         :rdfa/PrefixMapping})

(def fibo-fbc-mod
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/MetadataFBC/FBCDomain",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/FBC/MetadataFBC/",
   :rdfa/prefix "fibo-fbc-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-der-mod
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/DER/MetadataDER/DERDomain",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/DER/MetadataDER/",
   :rdfa/prefix "fibo-der-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-bp-mod
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BP/MetadataBP/BPDomain",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/BP/MetadataBP/",
   :rdfa/prefix "fibo-bp-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-loan-mod
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/LOAN/MetadataLOAN/LOANDomain",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/LOAN/MetadataLOAN/",
   :rdfa/prefix "fibo-loan-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-sec-mod
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/MetadataSEC/SECDomain",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/SEC/MetadataSEC/",
   :rdfa/prefix "fibo-sec-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-mod
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/MetadataFND/FNDDomain",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/FND/MetadataFND/",
   :rdfa/prefix "fibo-fnd-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-be-mod
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/MetadataBE/BEDomain",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/BE/MetadataBE/",
   :rdfa/prefix "fibo-be-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-cae-mod
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/CAE/MetadataCAE/CAEDomain",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/CAE/MetadataCAE/",
   :rdfa/prefix "fibo-cae-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-md-mod
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/MD/MetadataMD/MDDomain",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/MD/MetadataMD/",
   :rdfa/prefix "fibo-md-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-ind-mod
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/IND/MetadataIND/INDDomain",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/IND/MetadataIND/",
   :rdfa/prefix "fibo-ind-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fbc-dae-mod
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/DebtAndEquities/MetadataFBCDebtAndEquities/DebtAndEquitiesModule",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/MetadataFBCDebtAndEquities/",
   :rdfa/prefix "fibo-fbc-dae-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fbc-pas-mod
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/ProductsAndServices/MetadataFBCProductsAndServices/FBCProductsAndServicesModule",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/MetadataFBCProductsAndServices/",
   :rdfa/prefix "fibo-fbc-pas-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fbc-fi-mod
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FinancialInstruments/MetadataFBCFinancialInstruments/FinancialInstrumentsModule",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/MetadataFBCFinancialInstruments/",
   :rdfa/prefix "fibo-fbc-fi-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fbc-fct-mod
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FunctionalEntities/MetadataFBCFunctionalEntities/FunctionalEntitiesModule",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/MetadataFBCFunctionalEntities/",
   :rdfa/prefix "fibo-fbc-fct-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-der-drc-mod
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/DER/DerivativesContracts/MetadataDERDerivativesContracts/DerivativesContractsModule",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/MetadataDERDerivativesContracts/",
   :rdfa/prefix "fibo-der-drc-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-der-cr-mod
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/DER/CreditDerivatives/MetadataDERCreditDerivatives/CreditDerivativesModule",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/MetadataDERCreditDerivatives/",
   :rdfa/prefix "fibo-der-cr-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-der-rat-mod
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/DER/RateDerivatives/MetadataDERRateDerivatives/RateDerivativesModule",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/MetadataDERRateDerivatives/",
   :rdfa/prefix "fibo-der-rat-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-der-sbd-mod
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/DER/SecurityBasedDerivatives/MetadataDERSecurityBasedDerivatives/SecurityBasedDerivativesModule",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/MetadataDERSecurityBasedDerivatives/",
   :rdfa/prefix "fibo-der-sbd-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-bp-iss-mod
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BP/SecuritiesIssuance/MetadataBPSecuritiesIssuance/SecuritiesIssuanceModule",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MetadataBPSecuritiesIssuance/",
   :rdfa/prefix "fibo-bp-iss-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-bp-prc-mod
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BP/Process/MetadataBPProcess/ProcessModule",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BP/Process/MetadataBPProcess/",
   :rdfa/prefix "fibo-bp-prc-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-loan-ln-mod
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/LOAN/LoansGeneral/MetadataLOANLoansGeneral/LoansGeneralModule",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/MetadataLOANLoansGeneral/",
   :rdfa/prefix "fibo-loan-ln-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-loan-spc-mod
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/LOAN/LoansSpecific/MetadataLOANLoansSpecific/LoansSpecificModule",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/MetadataLOANLoansSpecific/",
   :rdfa/prefix "fibo-loan-spc-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-loan-reln-mod
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/LOAN/RealEstateLoans/MetadataLOANRealEstateLoans/RealEstateLoansModule",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MetadataLOANRealEstateLoans/",
   :rdfa/prefix "fibo-loan-reln-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-sec-sec-mod
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Securities/MetadataSECSecurities/SecuritiesModule",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/MetadataSECSecurities/",
   :rdfa/prefix "fibo-sec-sec-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-sec-dbt-mod
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Debt/MetadataSECDebt/DebtModule",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MetadataSECDebt/",
   :rdfa/prefix "fibo-sec-dbt-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-sec-fnd-mod
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Funds/MetadataSECFunds/FundsModule",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/MetadataSECFunds/",
   :rdfa/prefix "fibo-sec-fnd-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-sec-eq-mod
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Equities/MetadataSECEquities/EquitiesModule",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/MetadataSECEquities/",
   :rdfa/prefix "fibo-sec-eq-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-oac-mod
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/OwnershipAndControl/MetadataFNDOwnershipAndControl/OwnershipAndControlModule",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/MetadataFNDOwnershipAndControl/",
   :rdfa/prefix "fibo-fnd-oac-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-agr-mod
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Agreements/MetadataFNDAgreements/AgreementsModule",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/MetadataFNDAgreements/",
   :rdfa/prefix "fibo-fnd-agr-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-plc-mod
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Places/MetadataFNDPlaces/PlacesModule",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/Places/MetadataFNDPlaces/",
   :rdfa/prefix "fibo-fnd-plc-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-utl-mod
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/MetadataFNDUtilities/UtilitiesModule",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/MetadataFNDUtilities/",
   :rdfa/prefix "fibo-fnd-utl-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-pty-mod
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Parties/MetadataFNDParties/PartiesModule",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/MetadataFNDParties/",
   :rdfa/prefix "fibo-fnd-pty-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-org-mod
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Organizations/MetadataFNDOrganizations/OrganizationsModule",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/MetadataFNDOrganizations/",
   :rdfa/prefix "fibo-fnd-org-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-dt-mod
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/DatesAndTimes/MetadataFNDDatesAndTimes/DatesAndTimesModule",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/MetadataFNDDatesAndTimes/",
   :rdfa/prefix "fibo-fnd-dt-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-txn-mod
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/TransactionsExt/MetadataFNDTransactionsExt/TransactionsExtModule",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/MetadataFNDTransactionsExt/",
   :rdfa/prefix "fibo-fnd-txn-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-gao-mod
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/GoalsAndObjectives/MetadataFNDGoalsAndObjectives/GoalsAndObjectivesModule",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/MetadataFNDGoalsAndObjectives/",
   :rdfa/prefix "fibo-fnd-gao-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-acc-mod
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Accounting/MetadataFNDAccounting/AccountingModule",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/MetadataFNDAccounting/",
   :rdfa/prefix "fibo-fnd-acc-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-law-mod
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Law/MetadataFNDLaw/LawModule",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/Law/MetadataFNDLaw/",
   :rdfa/prefix "fibo-fnd-law-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-aap-mod
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/AgentsAndPeople/MetadataFNDAgentsAndPeople/AgentsAndPeopleModule",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/MetadataFNDAgentsAndPeople/",
   :rdfa/prefix "fibo-fnd-aap-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-pas-mod
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/ProductsAndServices/MetadataFNDProductsAndServices/ProductsAndServicesModule",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/MetadataFNDProductsAndServices/",
   :rdfa/prefix "fibo-fnd-pas-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-arr-mod
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Arrangements/MetadataFNDArrangements/ArrangementsModule",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/MetadataFNDArrangements/",
   :rdfa/prefix "fibo-fnd-arr-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-rel-mod
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Relations/MetadataFNDRelations/RelationsModule",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/MetadataFNDRelations/",
   :rdfa/prefix "fibo-fnd-rel-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-qt-mod
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Quantities/MetadataFNDQuantities/QuantitiesModule",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/MetadataFNDQuantities/",
   :rdfa/prefix "fibo-fnd-qt-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-be-fct-mod
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/FunctionalEntities/MetadataBEFunctionalEntities/FunctionalEntitiesModule",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/MetadataBEFunctionalEntities/",
   :rdfa/prefix "fibo-be-fct-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-be-ge-mod
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/GovernmentEntities/MetadataBEGovernmentEntities/GovernmentEntitiesModule",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/MetadataBEGovernmentEntities/",
   :rdfa/prefix "fibo-be-ge-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-be-oac-mod
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/OwnershipAndControl/MetadataBEOwnershipAndControl/OwnershipAndControlModule",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/MetadataBEOwnershipAndControl/",
   :rdfa/prefix "fibo-be-oac-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-be-plc-mod
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/PrivateLimitedCompanies/MetadataBEPrivateLimitedCompanies/PrivateLimitedCompaniesModule",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BE/PrivateLimitedCompanies/MetadataBEPrivateLimitedCompanies/",
   :rdfa/prefix "fibo-be-plc-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-be-le-mod
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/LegalEntities/MetadataBELegalEntities/LegalEntitiesModule",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/MetadataBELegalEntities/",
   :rdfa/prefix "fibo-be-le-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-be-tr-mod
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/Trusts/MetadataBETrusts/TrustsModule",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/MetadataBETrusts/",
   :rdfa/prefix "fibo-be-tr-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-be-corp-mod
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/Corporations/MetadataBECorporations/CorporationsModule",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BE/Corporations/MetadataBECorporations/",
   :rdfa/prefix "fibo-be-corp-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-be-ptr-mod
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/Partnerships/MetadataBEPartnerships/PartnershipsModule",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/MetadataBEPartnerships/",
   :rdfa/prefix "fibo-be-ptr-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-be-sps-mod
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/SoleProprietorships/MetadataBESoleProprietorships/SoleProprietorshipsModule",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BE/SoleProprietorships/MetadataBESoleProprietorships/",
   :rdfa/prefix "fibo-be-sps-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-cae-ce-mod
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/CAE/CorporateEvents/MetadataCAECorporateEvents/CorporateEventsModule",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/MetadataCAECorporateEvents/",
   :rdfa/prefix "fibo-cae-ce-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-md-temx-mod
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/MD/TemporalCore/MetadataMDTemporalCore/TemporalCoreModule",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/MetadataMDTemporalCore/",
   :rdfa/prefix "fibo-md-temx-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-md-dbtx-mod
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/MD/DebtTemporal/MetadataMDDebtTemporal/DebtTemporalModule",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/MetadataMDDebtTemporal/",
   :rdfa/prefix "fibo-md-dbtx-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-md-civx-mod
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/MD/CIVTemporal/MetadataMDCIVTemporal/CIVTemporalModule",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/MetadataMDCIVTemporal/",
   :rdfa/prefix "fibo-md-civx-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-md-derx-mod
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/MD/DerivativesTemporal/MetadataMDDerivativesTemporal/DerivativesTemporalModule",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/MetadataMDDerivativesTemporal/",
   :rdfa/prefix "fibo-md-derx-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-ind-mkt-mod
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/IND/MarketIndices/MetadataINDMarketIndices/MarketIndicesModule",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/MetadataINDMarketIndices/",
   :rdfa/prefix "fibo-ind-mkt-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-ind-ei-mod
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/IND/EconomicIndicators/MetadataINDEconomicIndicators/EconomicIndicatorsModule",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/MetadataINDEconomicIndicators/",
   :rdfa/prefix "fibo-ind-ei-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-ind-ind-mod
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/IND/Indicators/MetadataINDIndicators/IndicatorsModule",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/MetadataINDIndicators/",
   :rdfa/prefix "fibo-ind-ind-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-ind-ir-mod
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/IND/InterestRates/MetadataINDInterestRates/InterestRatesModule",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/MetadataINDInterestRates/",
   :rdfa/prefix "fibo-ind-ir-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-ind-fx-mod
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/IND/ForeignExchange/MetadataINDForeignExchange/ForeignExchangeModule",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/MetadataINDForeignExchange/",
   :rdfa/prefix "fibo-ind-fx-mod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-be-corp-corp
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/Corporations/Corporations/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BE/Corporations/Corporations/",
   :rdfa/prefix "fibo-be-corp-corp",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-be-fct-pub
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/FunctionalEntities/Publishers/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers/",
   :rdfa/prefix "fibo-be-fct-pub",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-be-fct-fct
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/FunctionalEntities/FunctionalEntities/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/FunctionalEntities/",
   :rdfa/prefix "fibo-be-fct-fct",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-be-ge-cbj
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CaribbeanGovernmentEntitiesAndJurisdictions/",
   :rdfa/prefix "fibo-be-ge-cbj",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-be-ge-ge
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/GovernmentEntities/GovernmentEntities/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/",
   :rdfa/prefix "fibo-be-ge-ge",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-be-ge-neuj
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfa/prefix "fibo-be-ge-neuj",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-be-ge-eeuj
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfa/prefix "fibo-be-ge-eeuj",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-be-ge-weuj
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/GovernmentEntities/EuropeanJurisdiction/WesternEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/WesternEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfa/prefix "fibo-be-ge-weuj",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-be-ge-euj
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/GovernmentEntities/EuropeanJurisdiction/EUGovernmentEntitiesAndJurisdictions/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EUGovernmentEntitiesAndJurisdictions/",
   :rdfa/prefix "fibo-be-ge-euj",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-be-ge-ukj
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/",
   :rdfa/prefix "fibo-be-ge-ukj",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-be-ge-wasj
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfa/prefix "fibo-be-ge-wasj",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-ge-ge-saj
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/GovernmentEntities/LatinAmericanJurisdiction/SouthAmericanGovernmentEntitiesAndJurisdictions/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/SouthAmericanGovernmentEntitiesAndJurisdictions/",
   :rdfa/prefix "fibo-ge-ge-saj",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-be-ge-caj
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/CAGovernmentEntitiesAndJurisdictions/",
   :rdfa/prefix "fibo-be-ge-caj",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-be-ge-usj
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/",
   :rdfa/prefix "fibo-be-ge-usj",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-be-ge-sasj
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfa/prefix "fibo-be-ge-sasj",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-be-ge-mxj
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/GovernmentEntities/NorthAmericanJurisdiction/MXGovernmentEntitiesAndJurisdictions/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/MXGovernmentEntitiesAndJurisdictions/",
   :rdfa/prefix "fibo-be-ge-mxj",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-ge-ge-ctlaj
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/LatinAmericanJurisdiction/CentralAmericanGovernmentEntitiesAndJurisdictions/",
   :rdfa/prefix "fibo-ge-ge-ctlaj",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-be-ge-seuj
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/",
   :rdfa/prefix "fibo-be-ge-seuj",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-be-ge-casj
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/GovernmentEntities/AsianJurisdiction/CentralAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/CentralAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfa/prefix "fibo-be-ge-casj",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-be-ge-easj
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/GovernmentEntities/AsianJurisdiction/EasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/EasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfa/prefix "fibo-be-ge-easj",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-be-ge-seasj
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/GovernmentEntities/AsianJurisdiction/SoutheasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SoutheasternAsiaGovernmentEntitiesAndJurisdictions/",
   :rdfa/prefix "fibo-be-ge-seasj",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-be-le-cb
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/LegalEntities/CorporateBodies/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/CorporateBodies/",
   :rdfa/prefix "fibo-be-le-cb",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-be-le-lp
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/LegalEntities/LegalPersons/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/",
   :rdfa/prefix "fibo-be-le-lp",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-be-le-usee
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleEntities/",
   :rdfa/prefix "fibo-be-le-usee",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-be-le-fbo
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/LegalEntities/FormalBusinessOrganizations/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/FormalBusinessOrganizations/",
   :rdfa/prefix "fibo-be-le-fbo",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-be-le-usex
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/LegalEntities/NorthAmericanEntities/USExampleExecutives/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/NorthAmericanEntities/USExampleExecutives/",
   :rdfa/prefix "fibo-be-le-usex",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-be-le-lei
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/LegalEntities/LEIEntities/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities/",
   :rdfa/prefix "fibo-be-le-lei",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-be-oac-opty
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/OwnershipAndControl/OwnershipParties/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties/",
   :rdfa/prefix "fibo-be-oac-opty",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-be-oac-cctl
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/OwnershipAndControl/CorporateControl/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateControl/",
   :rdfa/prefix "fibo-be-oac-cctl",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-be-oac-exec
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/OwnershipAndControl/Executives/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/",
   :rdfa/prefix "fibo-be-oac-exec",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-be-oac-cpty
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/OwnershipAndControl/ControlParties/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/ControlParties/",
   :rdfa/prefix "fibo-be-oac-cpty",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-be-oac-cown
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/OwnershipAndControl/CorporateOwnership/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateOwnership/",
   :rdfa/prefix "fibo-be-oac-cown",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-be-plc-plc
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/PrivateLimitedCompanies/PrivateLimitedCompanies/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BE/PrivateLimitedCompanies/PrivateLimitedCompanies/",
   :rdfa/prefix "fibo-be-plc-plc",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-be-ptr-ptr
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/Partnerships/Partnerships/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/Partnerships/",
   :rdfa/prefix "fibo-be-ptr-ptr",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-be-sps-sps
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/SoleProprietorships/SoleProprietorships/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BE/SoleProprietorships/SoleProprietorships/",
   :rdfa/prefix "fibo-be-sps-sps",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-be-tr-tr
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/Trusts/Trusts/",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts/",
   :rdfa/prefix "fibo-be-tr-tr",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-bp-iss-dbti
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BP/SecuritiesIssuance/DebtIssuance/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/DebtIssuance/",
   :rdfa/prefix "fibo-bp-iss-dbti",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-bp-iss-doc
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BP/SecuritiesIssuance/IssuanceDocuments/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceDocuments/",
   :rdfa/prefix "fibo-bp-iss-doc",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-bp-iss-pmbs
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/PrivateLabelMBSIssuance/",
   :rdfa/prefix "fibo-bp-iss-pmbs",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-bp-iss-mbs
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BP/SecuritiesIssuance/MBSIssuance/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MBSIssuance/",
   :rdfa/prefix "fibo-bp-iss-mbs",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-bp-iss-ambs
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BP/SecuritiesIssuance/AgencyMBSIssuance/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/AgencyMBSIssuance/",
   :rdfa/prefix "fibo-bp-iss-ambs",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-bp-iss-muni
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/MuniIssuance/",
   :rdfa/prefix "fibo-bp-iss-muni",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-bp-iss-ipo
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BP/SecuritiesIssuance/EquitiesIPOIssuance/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/EquitiesIPOIssuance/",
   :rdfa/prefix "fibo-bp-iss-ipo",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-bp-iss-prc
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BP/SecuritiesIssuance/IssuanceProcess/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BP/SecuritiesIssuance/IssuanceProcess/",
   :rdfa/prefix "fibo-bp-iss-prc",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-bp-prc-fcp
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BP/Process/FinancialContextAndProcess/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/BP/Process/FinancialContextAndProcess/",
   :rdfa/prefix "fibo-bp-prc-fcp",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-cae-ce-GLEIF
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/",
   :rdfa/prefix "fibo-cae-ce-GLEIF",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-cae-ce-act
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/CAE/CorporateEvents/CorporateActions/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
   :rdfa/prefix "fibo-cae-ce-act",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-cae-ce-srca
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/SecurityRelatedCorporateActions/",
   :rdfa/prefix "fibo-cae-ce-srca",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-cae-ce-15022
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/ISO15022-CorporateActionIndividuals/",
   :rdfa/prefix "fibo-cae-ce-15022",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-der-cr-cds
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/DER/CreditDerivatives/CreditDefaultSwaps/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/DER/CreditDerivatives/CreditDefaultSwaps/",
   :rdfa/prefix "fibo-der-cr-cds",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-der-drc-bsc
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/DER/DerivativesContracts/DerivativesBasics/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesBasics/",
   :rdfa/prefix "fibo-der-drc-bsc",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-der-drc-swpind
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/DER/DerivativesContracts/SwapsIndividuals/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/SwapsIndividuals/",
   :rdfa/prefix "fibo-der-drc-swpind",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-der-drc-swp
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/DER/DerivativesContracts/Swaps/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/",
   :rdfa/prefix "fibo-der-drc-swp",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-der-drc-raw
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/RightsAndWarrants/",
   :rdfa/prefix "fibo-der-drc-raw",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-der-drc-cur
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/DER/DerivativesContracts/CurrencyContracts/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CurrencyContracts/",
   :rdfa/prefix "fibo-der-drc-cur",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-der-drc-ma
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/DerivativesMasterAgreements/",
   :rdfa/prefix "fibo-der-drc-ma",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-der-drc-exo
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/DER/DerivativesContracts/ExoticOptions/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/ExoticOptions/",
   :rdfa/prefix "fibo-der-drc-exo",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-der-drc-ff
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/DER/DerivativesContracts/FuturesAndForwards/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/",
   :rdfa/prefix "fibo-der-drc-ff",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-der-drc-comm
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/DER/DerivativesContracts/CommoditiesContracts/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CommoditiesContracts/",
   :rdfa/prefix "fibo-der-drc-comm",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-der-drc-opt
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/DER/DerivativesContracts/Options/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
   :rdfa/prefix "fibo-der-drc-opt",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-der-drc-str
  {:dcat/downloadURL "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/DER/DerivativesContracts/StructuredInstruments/"
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/StructuredInstruments/"
   :rdfa/prefix "fibo-der-drc-str",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-der-rtd-irswp
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/DER/RateDerivatives/IRSwaps/",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/",
   :rdfa/prefix "fibo-der-rtd-irswp",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-der-rtd-irsind
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/DER/RateDerivatives/IRSwapExampleIndividuals/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwapExampleIndividuals/",
   :rdfa/prefix "fibo-der-rtd-irsind",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-der-rtd-rtd
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/DER/RateDerivatives/RateDerivatives/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/RateDerivatives/",
   :rdfa/prefix "fibo-der-rtd-rtd",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-der-sbd-eqs
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/DER/SecurityBasedDerivatives/EquitySwaps/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/EquitySwaps/",
   :rdfa/prefix "fibo-der-sbd-eqs",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-der-sbd-sbd
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/",
   :rdfa/prefix "fibo-der-sbd-sbd",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fbc-dae-gty
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/DebtAndEquities/Guaranty/",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Guaranty/",
   :rdfa/prefix "fibo-fbc-dae-gty",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fbc-dae-cre
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/DebtAndEquities/CreditEvents/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditEvents/",
   :rdfa/prefix "fibo-fbc-dae-cre",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fbc-dae-dbt
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/DebtAndEquities/Debt/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
   :rdfa/prefix "fibo-fbc-dae-dbt",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fbc-dae-crt
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/DebtAndEquities/CreditRatings/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditRatings/",
   :rdfa/prefix "fibo-fbc-dae-crt",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fbc-fct-ireg
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FunctionalEntities/InternationalRegistriesAndAuthorities/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/InternationalRegistriesAndAuthorities/",
   :rdfa/prefix "fibo-fbc-fct-ireg",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fbc-fct-usmkt
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USMarketsAndExchangesIndividuals/",
   :rdfa/prefix "fibo-fbc-fct-usmkt",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fbc-fct-usnic
  {:dcat/downloadURL "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/"
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/"
   :rdfa/prefix "fibo-fbc-fct-usnic",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fbc-fct-usjrga
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/",
   :rdfa/prefix "fibo-fbc-fct-usjrga",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fbc-fct-breg
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessRegistries/",
   :rdfa/prefix "fibo-fbc-fct-breg",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fbc-fct-rga
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FunctionalEntities/RegulatoryAgencies/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegulatoryAgencies/",
   :rdfa/prefix "fibo-fbc-fct-rga",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fbc-fct-cajrga
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CARegulatoryAgencies/",
   :rdfa/prefix "fibo-fbc-fct-cajrga",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fbc-fct-mkti
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FunctionalEntities/MarketsIndividuals/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/MarketsIndividuals/",
   :rdfa/prefix "fibo-fbc-fct-mkti",
   :rdf/type :rdfa/PrefixMapping
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cds" "https://www.omg.org/spec/Commons/CodesAndCodeSets/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
    "cmns-rlcmp" "https://www.omg.org/spec/Commons/RolesAndCompositions/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-le-lp"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/",
    "fibo-fbc-fct-bci"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
    "fibo-fbc-fct-mkt"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
    "fibo-fbc-fct-mkti"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/MarketsIndividuals/",
    "fibo-fbc-pas-fpas"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
    "fibo-fnd-plc-fac"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Facilities/",
    "fibo-fnd-plc-vrt"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/VirtualPlaces/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "lcc-3166-1"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"}})

(def fibo-fbc-fct-eufse
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FunctionalEntities/EuropeanEntities/EUFinancialServicesEntities/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EUFinancialServicesEntities/",
   :rdfa/prefix "fibo-fbc-fct-eufse",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fbc-fct-fse
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FunctionalEntities/FinancialServicesEntities/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/",
   :rdfa/prefix "fibo-fbc-fct-fse",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fbc-fct-bc
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FunctionalEntities/BusinessCenters/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCenters/",
   :rdfa/prefix "fibo-fbc-fct-bc",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fbc-fct-cafse
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FunctionalEntities/NorthAmericanEntities/CAFinancialServicesEntities/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/CAFinancialServicesEntities/",
   :rdfa/prefix "fibo-fbc-fct-cafse",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fbc-fct-bci
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/BusinessCentersIndividuals/",
   :rdfa/prefix "fibo-fbc-fct-bci",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fbc-fct-eurga
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FunctionalEntities/EuropeanEntities/EURegulatoryAgencies/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EURegulatoryAgencies/",
   :rdfa/prefix "fibo-fbc-fct-eurga",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fbc-fct-usfse
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfa/prefix "fibo-fbc-fct-usfse",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fbc-fct-usind
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USExampleIndividuals/",
   :rdfa/prefix "fibo-fbc-fct-usind",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fbc-fct-usfsind
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
   :rdfa/prefix "fibo-fbc-fct-usfsind",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fbc-fct-ra
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FunctionalEntities/RegistrationAuthorities/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegistrationAuthorities/",
   :rdfa/prefix "fibo-fbc-fct-ra",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fbc-fct-eufseind
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EuropeanFinancialServicesEntitiesIndividuals/",
   :rdfa/prefix "fibo-fbc-fct-eufseind",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fbc-fct-mkt
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FunctionalEntities/Markets/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/Markets/",
   :rdfa/prefix "fibo-fbc-fct-mkt",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fbc-fi-stl
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FinancialInstruments/Settlement/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/Settlement/",
   :rdfa/prefix "fibo-fbc-fi-stl",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fbc-fi-fi
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FinancialInstruments/FinancialInstruments/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
   :rdfa/prefix "fibo-fbc-fi-fi",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fbc-fi-ip
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/FinancialInstruments/InstrumentPricing/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/",
   :rdfa/prefix "fibo-fbc-fi-ip",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fbc-pas-fpas
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
   :rdfa/prefix "fibo-fbc-pas-fpas",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fbc-pas-caa
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/ClientsAndAccounts/",
   :rdfa/prefix "fibo-fbc-pas-caa",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-aap-ppl
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/AgentsAndPeople/People/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
   :rdfa/prefix "fibo-fnd-aap-ppl",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-aap-agt
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/AgentsAndPeople/Agents/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents/",
   :rdfa/prefix "fibo-fnd-aap-agt",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-acc-cur
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Accounting/CurrencyAmount/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
   :rdfa/prefix "fibo-fnd-acc-cur",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-acc-4217
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
   :rdfa/prefix "fibo-fnd-acc-4217",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-acc-aeq
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Accounting/AccountingEquity/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/AccountingEquity/",
   :rdfa/prefix "fibo-fnd-acc-aeq",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-agr-agr
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Agreements/Agreements/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreements/",
   :rdfa/prefix "fibo-fnd-agr-agr",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-agr-ctr
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Agreements/Contracts/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
   :rdfa/prefix "fibo-fnd-agr-ctr",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-arr-asmt
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Arrangements/Assessments/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Assessments/",
   :rdfa/prefix "fibo-fnd-arr-asmt",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-arr-arr
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Arrangements/Arrangements/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Arrangements/",
   :rdfa/prefix "fibo-fnd-arr-arr",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-arr-id
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Arrangements/IdentifiersAndIndices/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/IdentifiersAndIndices/",
   :rdfa/prefix "fibo-fnd-arr-id",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-arr-cls
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Arrangements/ClassificationSchemes/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/ClassificationSchemes/",
   :rdfa/prefix "fibo-fnd-arr-cls",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-arr-doc
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Arrangements/Documents/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/",
   :rdfa/prefix "fibo-fnd-arr-doc",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-arr-rt
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Arrangements/Ratings/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Ratings/",
   :rdfa/prefix "fibo-fnd-arr-rt",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-arr-rep
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Arrangements/Reporting/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/",
   :rdfa/prefix "fibo-fnd-arr-rep",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-arr-lif
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Arrangements/Lifecycles/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Lifecycles/",
   :rdfa/prefix "fibo-fnd-arr-lif",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-dt-fd
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/DatesAndTimes/FinancialDates/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
   :rdfa/prefix "fibo-fnd-dt-fd",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-dt-bd
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/DatesAndTimes/BusinessDates/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/BusinessDates/",
   :rdfa/prefix "fibo-fnd-dt-bd",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-dt-oc
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/DatesAndTimes/Occurrences/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/",
   :rdfa/prefix "fibo-fnd-dt-oc",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-gao-obj
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/GoalsAndObjectives/Objectives/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/Objectives/",
   :rdfa/prefix "fibo-fnd-gao-obj",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-law-lcap
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Law/LegalCapacity/",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/",
   :rdfa/prefix "fibo-fnd-law-lcap",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-law-jur
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Law/Jurisdiction/",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/FND/Law/Jurisdiction/",
   :rdfa/prefix "fibo-fnd-law-jur",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-law-cor
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Law/LegalCore/",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCore/",
   :rdfa/prefix "fibo-fnd-law-cor",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-oac-oac
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/OwnershipAndControl/OwnershipAndControl/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/OwnershipAndControl/",
   :rdfa/prefix "fibo-fnd-oac-oac",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-oac-own
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/OwnershipAndControl/Ownership/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Ownership/",
   :rdfa/prefix "fibo-fnd-oac-own",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-oac-ctl
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/OwnershipAndControl/Control/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Control/",
   :rdfa/prefix "fibo-fnd-oac-ctl",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-org-org
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Organizations/Organizations/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations/",
   :rdfa/prefix "fibo-fnd-org-org",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-org-fm
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Organizations/FormalOrganizations/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations/",
   :rdfa/prefix "fibo-fnd-org-fm",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-pas-psch
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/ProductsAndServices/PaymentsAndSchedules/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/PaymentsAndSchedules/",
   :rdfa/prefix "fibo-fnd-pas-psch",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-pas-pas
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/ProductsAndServices/ProductsAndServices/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/",
   :rdfa/prefix "fibo-fnd-pas-pas",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-plc-loc
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Places/Locations/",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Locations/",
   :rdfa/prefix "fibo-fnd-plc-loc",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-plc-vrt
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Places/VirtualPlaces/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/Places/VirtualPlaces/",
   :rdfa/prefix "fibo-fnd-plc-vrt",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-plc-fac
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Places/Facilities/",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Facilities/",
   :rdfa/prefix "fibo-fnd-plc-fac",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-plc-uspsai
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddressesIndividuals/",
   :rdfa/prefix "fibo-fnd-plc-uspsai",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-plc-adr
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Places/Addresses/",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/",
   :rdfa/prefix "fibo-fnd-plc-adr",
   :rdf/type :rdfa/PrefixMapping
   :reasoner nil})

(def fibo-fnd-plc-uspsa
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Places/NorthAmerica/USPostalServiceAddresses/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/",
   :rdfa/prefix "fibo-fnd-plc-uspsa",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-pty-pty
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Parties/Parties/",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
   :rdfa/prefix "fibo-fnd-pty-pty",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-pty-rl
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Parties/Roles/",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles/",
   :rdfa/prefix "fibo-fnd-pty-rl",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-qt-qtu
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Quantities/QuantitiesAndUnits/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/Quantities/QuantitiesAndUnits/",
   :rdfa/prefix "fibo-fnd-qt-qtu",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-rel-rel
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Relations/Relations/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
   :rdfa/prefix "fibo-fnd-rel-rel",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-txn-mkt
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/TransactionsExt/MarketTransactions/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/MarketTransactions/",
   :rdfa/prefix "fibo-fnd-txn-mkt",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-txn-sec
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/TransactionsExt/SecuritiesTransactions/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/SecuritiesTransactions/",
   :rdfa/prefix "fibo-fnd-txn-sec",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-txn-rea
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/TransactionsExt/REATransactions/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/TransactionsExt/REATransactions/",
   :rdfa/prefix "fibo-fnd-txn-rea",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-utl-av
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/AnnotationVocabulary/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
   :rdfa/prefix "fibo-fnd-utl-av",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-fnd-utl-alx
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/Analytics/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
   :rdfa/prefix "fibo-fnd-utl-alx",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-ind-ei-ei
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/IND/EconomicIndicators/EconomicIndicators/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/EconomicIndicators/",
   :rdfa/prefix "fibo-ind-ei-ei",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-ind-ei-usei
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/IND/EconomicIndicators/NorthAmericanIndicators/USEconomicIndicators/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/USEconomicIndicators/",
   :rdfa/prefix "fibo-ind-ei-usei",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-ind-ei-caei
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/IND/EconomicIndicators/NorthAmericanIndicators/CAEconomicIndicators/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/IND/EconomicIndicators/NorthAmericanIndicators/CAEconomicIndicators/",
   :rdfa/prefix "fibo-ind-ei-caei",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-ind-fx-fx
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/IND/ForeignExchange/ForeignExchange/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/IND/ForeignExchange/ForeignExchange/",
   :rdfa/prefix "fibo-ind-fx-fx",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-ind-ind-ind
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/IND/Indicators/Indicators/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/IND/Indicators/Indicators/",
   :rdfa/prefix "fibo-ind-ind-ind",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-ind-ir-cm
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/IND/InterestRates/CommonInterestRates/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfa/prefix "fibo-ind-ir-cm",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-ind-ir-mdp
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/IND/InterestRates/MarketDataProviders/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/MarketDataProviders/",
   :rdfa/prefix "fibo-ind-ir-mdp",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-ind-ir-ir
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/IND/InterestRates/InterestRates/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/",
   :rdfa/prefix "fibo-ind-ir-ir",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-ind-mkt-bas
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/IND/MarketIndices/BasketIndices/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/BasketIndices/",
   :rdfa/prefix "fibo-ind-mkt-bas",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-ind-mkt-eqind
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/IND/MarketIndices/EquityIndexExampleIndividuals/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/IND/MarketIndices/EquityIndexExampleIndividuals/",
   :rdfa/prefix "fibo-ind-mkt-eqind",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-loan-ln-ln
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/LOAN/LoansGeneral/Loans/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/",
   :rdfa/prefix "fibo-loan-ln-ln",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-loan-ln-reg
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/LOAN/LoansGeneral/LoansRegulatory/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/",
   :rdfa/prefix "fibo-loan-ln-reg",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-loan-ln-app
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/LOAN/LoansGeneral/LoanApplications/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/",
   :rdfa/prefix "fibo-loan-ln-app",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-loan-ln-ev
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/LOAN/LoansGeneral/LoanEvents/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanEvents/",
   :rdfa/prefix "fibo-loan-ln-ev",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-loan-reln-hmda
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/LOAN/RealEstateLoans/HomeMortgageDisclosureActCoveredMortgages/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/HomeMortgageDisclosureActCoveredMortgages/",
   :rdfa/prefix "fibo-loan-reln-hmda",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-loan-reln-cnst
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/LOAN/RealEstateLoans/ConstructionLoans/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/ConstructionLoans/",
   :rdfa/prefix "fibo-loan-reln-cnst",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-loan-reln-mtg
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/LOAN/RealEstateLoans/MortgageLoans/",
   :rdfa/prefix "fibo-loan-reln-mtg",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-loan-spc-stu
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/LOAN/LoansSpecific/StudentLoans/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/StudentLoans/",
   :rdfa/prefix "fibo-loan-spc-stu",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-loan-spc-mar
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/LOAN/LoansSpecific/MarineFinance/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/MarineFinance/",
   :rdfa/prefix "fibo-loan-spc-mar",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-loan-spc-cns
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/LOAN/LoansSpecific/ConsumerLoans/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/ConsumerLoans/",
   :rdfa/prefix "fibo-loan-spc-cns",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-loan-spc-crd
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/LOAN/LoansSpecific/CardAccounts/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CardAccounts/",
   :rdfa/prefix "fibo-loan-spc-crd",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-loan-spc-prod
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/LOAN/LoansSpecific/LoanProducts/",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/LoanProducts/",
   :rdfa/prefix "fibo-loan-spc-prod",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-loan-spc-com
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/LOAN/LoansSpecific/CommercialLoans/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/CommercialLoans/",
   :rdfa/prefix "fibo-loan-spc-com",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-md-civx-fun
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/MD/CIVTemporal/FundsTemporal/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfa/prefix "fibo-md-civx-fun",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-md-dbtx-aly
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/MD/DebtTemporal/DebtAnalytics/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/MD/DebtTemporal/DebtAnalytics/",
   :rdfa/prefix "fibo-md-dbtx-aly",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-md-derx-eto
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/MD/DerivativesTemporal/ETOptionsTemporal/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/ETOptionsTemporal/",
   :rdfa/prefix "fibo-md-derx-eto",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-md-der-fut
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/MD/DerivativesTemporal/FuturesTemporal/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/MD/DerivativesTemporal/FuturesTemporal/",
   :rdfa/prefix "fibo-md-der-fut",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-md-temx-crs
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/MD/TemporalCore/SecurityCreditStatuses/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/SecurityCreditStatuses/",
   :rdfa/prefix "fibo-md-temx-crs",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-md-temx-trs
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/MD/TemporalCore/SecurityTradingStatuses/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/MD/TemporalCore/SecurityTradingStatuses/",
   :rdfa/prefix "fibo-md-temx-trs",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-sec-dbt-ex
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Debt/ExerciseConventions/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/ExerciseConventions/",
   :rdfa/prefix "fibo-sec-dbt-ex",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-sec-dbt-syn
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Debt/SyntheticCDOs/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/SyntheticCDOs/",
   :rdfa/prefix "fibo-sec-dbt-syn",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-sec-dbt-abs
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Debt/AssetBackedSecurities/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/AssetBackedSecurities/",
   :rdfa/prefix "fibo-sec-dbt-abs",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-sec-dbt-mbs
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Debt/MortgageBackedSecurities/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/MortgageBackedSecurities/",
   :rdfa/prefix "fibo-sec-dbt-mbs",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-sec-dbt-dbti
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Debt/DebtInstruments/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/",
   :rdfa/prefix "fibo-sec-dbt-dbti",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-sec-dbt-lpn
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Debt/LoanParticipationNotes/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/LoanParticipationNotes/",
   :rdfa/prefix "fibo-sec-dbt-lpn",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-sec-dbt-tstd
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Debt/TradedShortTermDebt/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/TradedShortTermDebt/",
   :rdfa/prefix "fibo-sec-dbt-tstd",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-sec-dbt-pbs
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Debt/PoolBackedSecurities/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/PoolBackedSecurities/",
   :rdfa/prefix "fibo-sec-dbt-pbs",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-sec-dbt-cdo
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Debt/CollateralizedDebtObligations/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/CollateralizedDebtObligations/",
   :rdfa/prefix "fibo-sec-dbt-cdo",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-sec-dbt-bnd
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Debt/Bonds/",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/Bonds/",
   :rdfa/prefix "fibo-sec-dbt-bnd",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-sec-eq-dr
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Equities/DepositaryReceipts/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/DepositaryReceipts/",
   :rdfa/prefix "fibo-sec-eq-dr",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-sec-eq-10962
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Equities/EquityCFIClassificationIndividuals/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/",
   :rdfa/prefix "fibo-sec-eq-10962",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-sec-eq-eq
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Equities/EquityInstruments/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
   :rdfa/prefix "fibo-sec-eq-eq",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-sec-eq-eqind
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquitiesExampleIndividuals/",
   :rdfa/prefix "fibo-sec-eq-eqind",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-sec-fund-fund
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Funds/Funds/",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds/",
   :rdfa/prefix "fibo-sec-fund-fund",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-sec-fund-civ
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Funds/CollectiveInvestmentVehicles/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/",
   :rdfa/prefix "fibo-sec-fund-civ",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-sec-sec-cls
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Securities/SecuritiesClassification/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesClassification/",
   :rdfa/prefix "fibo-sec-sec-cls",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-sec-sec-rst
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Securities/SecuritiesRestrictions/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions/",
   :rdfa/prefix "fibo-sec-sec-rst",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-sec-sec-idind
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Securities/SecuritiesIdentificationIndividuals/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentificationIndividuals/",
   :rdfa/prefix "fibo-sec-sec-idind",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-sec-sec-ast
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Securities/SecurityAssets/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecurityAssets/",
   :rdfa/prefix "fibo-sec-sec-ast",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-sec-sec-lst
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Securities/SecuritiesListings/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings/",
   :rdfa/prefix "fibo-sec-sec-lst",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-sec-sec-iss
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Securities/SecuritiesIssuance/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/",
   :rdfa/prefix "fibo-sec-sec-iss",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-sec-sec-pls
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Securities/Pools/",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Pools/",
   :rdfa/prefix "fibo-sec-sec-pls",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-sec-sec-sch
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Securities/ParametricSchedules/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/ParametricSchedules/",
   :rdfa/prefix "fibo-sec-sec-sch",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-sec-sec-id
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Securities/SecuritiesIdentification/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIdentification/",
   :rdfa/prefix "fibo-sec-sec-id",
   :rdf/type :rdfa/PrefixMapping})

(def fibo-sec-sec-bsk
  {:dcat/downloadURL
     "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/SEC/Securities/Baskets/",
   :rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/Baskets/",
   :rdfa/prefix "fibo-sec-sec-bsk",
   :rdf/type :rdfa/PrefixMapping})

(def sm
  {:rdfa/uri    "http://www.omg.org/techprocess/ab/SpecificationMetadata/"
   :rdfa/prefix "sm"
   :rdf/type    :rdfa/PrefixMapping
   :emit false})

(def cmns-av
  {:rdfa/prefix "cmns-av"
   :rdfa/uri    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
   :rdf/type    :rdfa/PrefixMapping})

(def cmns-col
  {:rdfa/prefix "cmns-col"
   :rdfa/uri    "https://www.omg.org/spec/Commons/Collections/"
   :rdf/type    :rdfa/PrefixMapping})

(def cmns-cls
  {:rdfa/prefix "cmns-cls"
   :rdfa/uri    "https://www.omg.org/spec/Commons/Classifiers/"
   :rdf/type    :rdfa/PrefixMapping})

(def cmns-cxtdsg
  {:rdfa/prefix "cmns-cxtdsg"
   :rdfa/uri    "https://www.omg.org/spec/Commons/ContextualDesignators/"
   :rdf/type    :rdfa/PrefixMapping})

(def cmns-cxtid
  {:rdfa/prefix "cmns-cxtid"
   :rdfa/uri    "https://www.omg.org/spec/Commons/ContextualIdentifiers/"
   :rdf/type    :rdfa/PrefixMapping})

(def cmns-dsg
  {:rdfa/prefix "cmns-dsg"
   :rdfa/uri    "https://www.omg.org/spec/Commons/Designators/"
   :rdf/type    :rdfa/PrefixMapping})

(def cmns-cds
  {:rdfa/prefix "cmns-cds"
   :rdfa/uri    "https://www.omg.org/spec/Commons/CodesAndCodeSets/"
   :rdf/type    :rdfa/PrefixMapping})

(def cmns-dt
  {:rdfa/prefix "cmns-dt"
   :rdfa/uri    "https://www.omg.org/spec/Commons/DatesAndTimes/"
   :rdf/type    :rdfa/PrefixMapping})

(def cmns-txt
  {:rdfa/prefix "cmns-txt"
   :rdfa/uri    "https://www.omg.org/spec/Commons/TextDatatype/"
   :rdf/type    :rdfa/PrefixMapping})

(def cmns-id
  {:rdfa/prefix "cmns-id"
   :rdfa/uri    "https://www.omg.org/spec/Commons/Identifiers/"
   :rdf/type    :rdfa/PrefixMapping})

(def cmns-qtu
  {:rdfa/prefix "cmns-qtu"
   :rdfa/uri    "https://www.omg.org/spec/Commons/QuantitiesAndUnits/"
   :rdf/type    :rdfa/PrefixMapping})

(def cmns-pts
  {:rdfa/prefix "cmns-pts"
   :rdfa/uri    "https://www.omg.org/spec/Commons/PartiesAndSituations/"
   :rdf/type    :rdfa/PrefixMapping})

(def cmns-rlcmp
  {:rdfa/prefix "cmns-rlcmp"
   :rdfa/uri    "https://www.omg.org/spec/Commons/RolesAndCompositions/"
   :rdf/type    :rdfa/PrefixMapping})

(def cmns-doc
  {:rdfa/prefix "cmns-doc"
   :rdfa/uri    "https://www.omg.org/spec/Commons/Documents/"
   :rdf/type    :rdfa/PrefixMapping})

(def lcc-cr
  {:rdfa/uri    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
   :rdfa/prefix "lcc-cr"
   :rdf/type    :rdfa/PrefixMapping
   :emit false})

(def lcc-lr
  {:rdfa/uri    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
   :rdfa/prefix "lcc-lr"
   :rdf/type    :rdfa/PrefixMapping
   :emit false})

(def lcc-m49
  {:rdfa/uri    "https://www.omg.org/spec/LCC/Countries/UN-M49-RegionCodes/"
   :rdfa/prefix "lcc-m49"
   :rdf/type    :rdfa/PrefixMapping
   :emit false})

(def lcc-3166-1
  {:rdfa/uri    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"
   :rdfa/prefix "lcc-3166-1"
   :rdf/type    :rdfa/PrefixMapping
   :emit false})

(def lcc-3166-2
  {:rdfa/uri    "https://www.omg.org/spec/LCC/Countries/ISO3166-2-SubdivisionCodes/"
   :rdfa/prefix "lcc-3166-2"
   :rdf/type    :rdfa/PrefixMapping
   :emit false})

(def lcc-639-1
  {:rdfa/uri    "https://www.omg.org/spec/LCC/Languages/ISO639-1-LanguageCodes/"
   :rdfa/prefix "lcc-639-1"
   :rdf/type    :rdfa/PrefixMapping
   :emit false})

(def lcc-639-2
  {:rdfa/uri    "https://www.omg.org/spec/LCC/Languages/ISO639-2-LanguageCodes/"
   :rdfa/prefix "lcc-639-2"
   :rdf/type    :rdfa/PrefixMapping
   :emit false})

(def lcc-3166-2-ca
  {:dcat/downloadURL "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CA.rdf"
   :rdfa/prefix      "lcc-3166-2-ca"
   :rdfa/uri         "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CA/"
   :rdf/type         :rdfa/PrefixMapping
   :emit false})

(def lcc-3166-2-gb
  {:dcat/downloadURL "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-GB.rdf"
   :rdfa/prefix      "lcc-3166-2-gb"
   :rdfa/uri         "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-GB/"
   :rdf/type         :rdfa/PrefixMapping
   :emit false})

(def lcc-3166-2-mx
  {:dcat/downloadURL "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-MX.rdf"
   :rdfa/prefix      "lcc-3166-2-mx"
   :rdfa/uri         "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-MX/"
   :rdf/type         :rdfa/PrefixMapping
   :emit false})

(def lcc-3166-2-us
  {:dcat/downloadURL "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-US.rdf"
   :rdfa/prefix      "lcc-3166-2-us"
   :rdfa/uri         "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-US/"
   :rdf/type         :rdfa/PrefixMapping
   :emit false})

(def lcc-3166-2-ch
  {:dcat/downloadURL "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH.rdf"
   :rdfa/prefix      "lcc-3166-2-ch"
   :rdfa/uri         "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-CH/"
   :rdf/type         :rdfa/PrefixMapping
   :emit false})

(def gleif-base
  {:dcat/downloadURL #_"https://lov.linkeddata.es/dataset/lov/vocabs/gleif-base/versions/2019-07-11.n3"
   "https://www.gleif.org/ontology/v1.0/Base/ontology.ttl"
   :rdfa/uri "https://www.gleif.org/ontology/Base/"
   :rdfa/prefix "gleif-base"
   :rdf/type :rdfa/PrefixMapping
   :emit false})

(def gleif-L1
  {:dcat/downloadURL #_"https://lov.linkeddata.es/dataset/lov/vocabs/gleif-L1/versions/2019-02-01.n3"
   "https://www.gleif.org/ontology/v1.0/L1/ontology.ttl"
   :rdfa/uri "https://www.gleif.org/ontology/L1/"
   :rdfa/prefix "gleif-L1"
   :rdf/type :rdfa/PrefixMapping
   :emit false})

(def gleif-L2
  {:dcat/downloadURL #_"https://lov.linkeddata.es/dataset/lov/vocabs/gleif-L2/versions/2019-02-01.n3"
   "https://www.gleif.org/ontology/v1.0/L2/ontology.ttl"
   :rdfa/uri "https://www.gleif.org/ontology/L2/"
   :rdfa/prefix "gleif-L2"
   :rdf/type :rdfa/PrefixMapping
   :emit false})

(def gleif-geo
  {:dcat/downloadURL "https://www.gleif.org/ontology/v1.0/Geocoding/ontology.ttl"
   :rdfa/uri "https://www.gleif.org/ontology/Geocoding/"
   :rdfa/prefix "gleif-geo"
   :rdf/type :rdfa/PrefixMapping
   :namespaces
   {"dcterms"    "http://purl.org/dc/terms/",
    "gleif-base" "https://www.gleif.org/ontology/Base/",
    "gleif-geo"  "https://www.gleif.org/ontology/Geocoding/",
    "lcc-cr"     "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "owl"        "http://www.w3.org/2002/07/owl#",
    "rdf"        "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"       "http://www.w3.org/2000/01/rdf-schema#",
    "skos"       "http://www.w3.org/2004/02/skos/core#",
    "vann"       "http://purl.org/vocab/vann/",
    "voaf"       "http://purl.org/vocommons/voaf#",
    "geo"        "http://www.w3.org/2003/01/geo/wgs84_pos#",
    "xml"        "http://www.w3.org/XML/1998/namespace",
    "xsd"        "http://www.w3.org/2001/XMLSchema#"}
   :emit false})

(def EntityLegalForm
  {:dcat/downloadURL #_"https://lov.linkeddata.es/dataset/lov/vocabs/gleif-elf/versions/2019-02-01.n3"
   "https://www.gleif.org/ontology/v1.0/EntityLegalForm/ontology.ttl"
   :rdfa/uri "https://www.gleif.org/ontology/EntityLegalForm/"
   :rdfa/prefix "gleif-elf"
   :rdf/type :rdfa/PrefixMapping
   :emit false})

(def RegistrationAuthority
  {:dcat/downloadURL #_"https://lov.linkeddata.es/dataset/lov/vocabs/gleif-ra/versions/2019-02-01.n3"
   "https://www.gleif.org/ontology/v1.0/RegistrationAuthority/ontology.ttl"
   :rdfa/uri "https://www.gleif.org/ontology/RegistrationAuthority/"
   :rdfa/prefix "gleif-ra"
   :rdf/type :rdfa/PrefixMapping
   :emit false})

(def ReportingException
  {:dcat/downloadURL #_"https://lov.linkeddata.es/dataset/lov/vocabs/gleif-repex/versions/2019-02-01.n3"
   "https://www.gleif.org/ontology/v1.0/ReportingException/ontology.ttl"
   :rdfa/uri "https://www.gleif.org/ontology/ReportingException/"
   :rdfa/prefix "gleif-repex"
   :rdf/type :rdfa/PrefixMapping
   :emit false})

;; :dcat/downloadURL "resources/gleif-lei-data/L1Data.ttl.gz"

#_(def gleif-L1-data
  {:rdfa/prefix "gleif-L1-data"
   :rdfa/uri    "https://rdf.gleif.org/L1/"
   :rdf/type    :rdfa/PrefixMapping
   :emit false})

;; :dcat/downloadURL "resources/gleif-lei-data/L2Data.ttl.gz"

#_(def gleif-L2-data
  {:rdfa/prefix "gleif-L2-data"
   :rdfa/uri    "https://rdf.gleif.org/L2/"
   :rdf/type    :rdfa/PrefixMapping
   :emit false})

(def gleif-BIC-data
  {:rdfa/prefix      "gleif-BIC-data"
   :rdfa/uri         "https://rdf.gleif.org/BIC/"
   :rdf/type         :rdfa/PrefixMapping
   :dcat/downloadURL "gleif-lei-data/BICData.ttl"
   :emit false})

(def gleif-ELF-data
  {:rdfa/prefix      "gleif-ELF-data"
   :rdfa/uri         "https://rdf.gleif.org/EntityLegalForm/"
   :rdf/type         :rdfa/PrefixMapping
   :dcat/downloadURL "gleif-lei-data/EntityLegalFormData.ttl"
   :emit false})

(def gleif-RA-data
  {:rdfa/prefix      "gleif-RA-data"
   :rdfa/uri         "https://rdf.gleif.org/RegistrationAuthority/"
   :rdf/type         :rdfa/PrefixMapping
   :dcat/downloadURL "gleif-lei-data/RegistrationAuthorityData.ttl"
   :emit false})

;; :dcat/downloadURL "resources/gleif-lei-data/RepExData.ttl.gz"

(def gleif-repex-data
  {:rdfa/prefix      "gleif-repex-data"
   :rdfa/uri         "https://rdf.gleif.org/ReportingException/"
   :rdf/type         :rdfa/PrefixMapping
   :emit false})

(def lcc-3166-1-adj
  {:rdfa/uri    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes-Adjunct/"
   :rdfa/prefix "lcc-3166-1-adj"
   :rdf/type    :rdfa/PrefixMapping})

(def lcc-3166-2-adj
  {:rdfa/uri    "https://www.omg.org/spec/LCC/Countries/ISO3166-2-SubdivisionCodes-Adjunct/"
   :rdfa/prefix "lcc-3166-2-adj"
   :rdf/type    :rdfa/PrefixMapping})
