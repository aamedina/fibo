(ns net.wikipunk.rdf.fibo-md-civx-fun
  ^{:base
    "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
    :namespaces
    {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
     "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
     "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
     "dcterms" "http://purl.org/dc/terms/",
     "fibo-be-oac-opty"
     "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties/",
     "fibo-fbc-fi-ip"
     "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/",
     "fibo-fnd-utl-av"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
     "fibo-md-civx-fun"
     "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
     "fibo-sec-fund-civ"
     "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/CollectiveInvestmentVehicles/",
     "fibo-sec-fund-fund"
     "https://spec.edmcouncil.org/fibo/ontology/SEC/Funds/Funds/",
     "owl" "http://www.w3.org/2002/07/owl#",
     "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
     "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
     "skos" "http://www.w3.org/2004/02/skos/core#",
     "xsd" "http://www.w3.org/2001/XMLSchema#"},
    :prefix "fibo-md-civx-fun",
    :source
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/MD/CIVTemporal/FundsTemporal/"}
  {:cmns-av/copyright "Copyright (c) 2013-2023 EDM Council, Inc.",
   :dcterms/abstract
   "Terms which have a time component (either real time, intra-day or dated terms). These include Net Present Value (NPV) and related analytics.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FinancialInstruments/InstrumentPricing/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/OwnershipAndControl/OwnershipParties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Funds/Funds/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Funds/CollectiveInvestmentVehicles/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/MD/CIVTemporal/FundsTemporal/"},
   :rdf/type :owl/Ontology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "FundsTemporal"},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/"})

(def AccruedFees
  {:db/ident :fibo-md-civx-fun/AccruedFees,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "accrued fees"}})

(def AccruedIncome
  {:db/ident :fibo-md-civx-fun/AccruedIncome,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "accrued income"}})

(def AccruedTaxes
  {:db/ident :fibo-md-civx-fun/AccruedTaxes,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "accrued taxes"}})

(def FeePayable
  {:db/ident :fibo-md-civx-fun/FeePayable,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fee payable"}})

(def FundPrice
  {:db/ident :fibo-md-civx-fun/FundPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fund price"},
   :rdfs/subClassOf :fibo-fbc-fi-ip/SecurityPrice})

(def FundUnitPerformance
  {:db/ident :fibo-md-civx-fun/FundUnitPerformance,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fund unit performance"}})

(def FundsTax
  {:db/ident :fibo-md-civx-fun/FundsTax,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "funds tax"},
   :rdfs/subClassOf {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                     :owl/someValuesFrom :fibo-be-oac-opty/Investor,
                     :rdf/type           :owl/Restriction}})

(def SigmaValueOfHoldings
  {:db/ident :fibo-md-civx-fun/SigmaValueOfHoldings,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "sigma value of holdings"}})

(def Swing
  {:db/ident :fibo-md-civx-fun/Swing,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "swing"}})

(def SwingPrice
  {:db/ident :fibo-md-civx-fun/SwingPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "swing price"},
   :rdfs/subClassOf :fibo-md-civx-fun/FundPrice})

(def determinationDate_1
  {:db/ident :fibo-md-civx-fun/determinationDate.1,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-md-civx-fun/FundUnitPerformance,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "determination date"},
   :rdfs/range :cmns-dt/Date})

(def determinationPeriod
  {:db/ident :fibo-md-civx-fun/determinationPeriod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-md-civx-fun/FundUnitPerformance,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "determination period"},
   :rdfs/range :cmns-dt/DatePeriod,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "THe period for which the performance is determined"}})

(def determines
  {:db/ident :fibo-md-civx-fun/determines,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "determines"},
   :rdfs/range :fibo-md-civx-fun/FeePayable})

(def hasPerformance
  {:db/ident :fibo-md-civx-fun/hasPerformance,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/FundUnit,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has performance"},
   :rdfs/range :fibo-md-civx-fun/FundUnitPerformance})

(def incurs
  {:db/ident :fibo-md-civx-fun/incurs,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundPortfolio,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "incurs"},
   :rdfs/range :fibo-md-civx-fun/FundsTax})

(def incursFees
  {:db/ident :fibo-md-civx-fun/incursFees,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-oac-opty/Investor,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "incurs fees"},
   :rdfs/range :fibo-md-civx-fun/FeePayable})

(def incursFees_1
  {:db/ident :fibo-md-civx-fun/incursFees.1,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/FundUnit,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "incurs fees"},
   :rdfs/range :fibo-md-civx-fun/FeePayable})

(def incursTax
  {:db/ident :fibo-md-civx-fun/incursTax,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-oac-opty/Investor,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "incurs tax"},
   :rdfs/range :fibo-md-civx-fun/FundsTax})

(def incursTax_1
  {:db/ident :fibo-md-civx-fun/incursTax.1,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/FundUnit,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "incurs tax"},
   :rdfs/range :fibo-md-civx-fun/FundsTax})

(def incursTransactionFee
  {:db/ident :fibo-md-civx-fun/incursTransactionFee,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundPortfolio,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "incurs transaction fee"},
   :rdfs/range :fibo-md-civx-fun/FeePayable})

(def netOrGrossOfFees
  {:db/ident :fibo-md-civx-fun/netOrGrossOfFees,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-md-civx-fun/FundUnitPerformance,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "net or gross of fees"},
   :rdfs/range :xsd/string})

(def urn:uuid:8775e2f2-1a82-598a-9b30-99db28bff3e4
  {:cmns-av/copyright "Copyright (c) 2013-2023 EDM Council, Inc.",
   :dcterms/abstract
   "Terms which have a time component (either real time, intra-day or dated terms). These include Net Present Value (NPV) and related analytics.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FinancialInstruments/InstrumentPricing/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/BE/OwnershipAndControl/OwnershipParties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Funds/Funds/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Funds/CollectiveInvestmentVehicles/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/MD/CIVTemporal/FundsTemporal/"},
   :rdf/type :owl/Ontology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "FundsTemporal"},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/"})