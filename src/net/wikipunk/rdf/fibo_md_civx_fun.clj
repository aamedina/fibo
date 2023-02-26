(ns net.wikipunk.rdf.fibo-md-civx-fun
  "Terms which have a time component (either real time, intra-day or dated terms). These include Net Present Value (NPV) and related analytics."
  {:cmns-av/copyright "Copyright (c) 2013-2023 EDM Council, Inc.",
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :dcterms/abstract
   "Terms which have a time component (either real time, intra-day or dated terms). These include Net Present Value (NPV) and related analytics.",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Funds/CollectiveInvestmentVehicles/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Funds/Funds/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/InstrumentPricing/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/OwnershipAndControl/OwnershipParties/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/MD/CIVTemporal/FundsTemporal/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-oac-opty"
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties/",
    "fibo-fbc-fi-ip"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/InstrumentPricing/",
    "fibo-fnd-dt-fd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
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
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-md-civx-fun",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "FundsTemporal"}})

(def AccruedFees
  "accrued fees"
  {:db/ident :fibo-md-civx-fun/AccruedFees,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "accrued fees"}})

(def AccruedIncome
  "accrued income"
  {:db/ident :fibo-md-civx-fun/AccruedIncome,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "accrued income"}})

(def AccruedTaxes
  "accrued taxes"
  {:db/ident :fibo-md-civx-fun/AccruedTaxes,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "accrued taxes"}})

(def FeePayable
  "fee payable"
  {:db/ident :fibo-md-civx-fun/FeePayable,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fee payable"}})

(def FundPrice
  "fund price"
  {:db/ident :fibo-md-civx-fun/FundPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fund price"},
   :rdfs/subClassOf :fibo-fbc-fi-ip/SecurityPrice})

(def FundUnitPerformance
  "fund unit performance"
  {:db/ident :fibo-md-civx-fun/FundUnitPerformance,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fund unit performance"}})

(def FundsTax
  "funds tax"
  {:db/ident :fibo-md-civx-fun/FundsTax,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "funds tax"},
   :rdfs/subClassOf {:owl/onProperty     :fibo-fnd-rel-rel/appliesTo,
                     :owl/someValuesFrom :fibo-be-oac-opty/Investor,
                     :rdf/type           :owl/Restriction}})

(def SigmaValueOfHoldings
  "sigma value of holdings"
  {:db/ident :fibo-md-civx-fun/SigmaValueOfHoldings,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "sigma value of holdings"}})

(def Swing
  "swing"
  {:db/ident :fibo-md-civx-fun/Swing,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "swing"}})

(def SwingPrice
  "swing price"
  {:db/ident :fibo-md-civx-fun/SwingPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "swing price"},
   :rdfs/subClassOf :fibo-md-civx-fun/FundPrice})

(def determinationDate.1
  "determination date"
  {:db/ident :fibo-md-civx-fun/determinationDate.1,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-md-civx-fun/FundUnitPerformance,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "determination date"},
   :rdfs/range :fibo-fnd-dt-fd/Date})

(def determinationPeriod
  "THe period for which the performance is determined"
  {:db/ident :fibo-md-civx-fun/determinationPeriod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-md-civx-fun/FundUnitPerformance,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "determination period"},
   :rdfs/range :fibo-fnd-dt-fd/DatePeriod,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "THe period for which the performance is determined"}})

(def determines
  "determines"
  {:db/ident :fibo-md-civx-fun/determines,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "determines"},
   :rdfs/range :fibo-md-civx-fun/FeePayable})

(def hasPerformance
  "has performance"
  {:db/ident :fibo-md-civx-fun/hasPerformance,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/FundUnit,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has performance"},
   :rdfs/range :fibo-md-civx-fun/FundUnitPerformance})

(def incurs
  "incurs"
  {:db/ident :fibo-md-civx-fun/incurs,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundPortfolio,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "incurs"},
   :rdfs/range :fibo-md-civx-fun/FundsTax})

(def incursFees
  "incurs fees"
  {:db/ident :fibo-md-civx-fun/incursFees,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-oac-opty/Investor,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "incurs fees"},
   :rdfs/range :fibo-md-civx-fun/FeePayable})

(def incursFees.1
  "incurs fees"
  {:db/ident :fibo-md-civx-fun/incursFees.1,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/FundUnit,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "incurs fees"},
   :rdfs/range :fibo-md-civx-fun/FeePayable})

(def incursTax
  "incurs tax"
  {:db/ident :fibo-md-civx-fun/incursTax,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-oac-opty/Investor,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "incurs tax"},
   :rdfs/range :fibo-md-civx-fun/FundsTax})

(def incursTax.1
  "incurs tax"
  {:db/ident :fibo-md-civx-fun/incursTax.1,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/FundUnit,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "incurs tax"},
   :rdfs/range :fibo-md-civx-fun/FundsTax})

(def incursTransactionFee
  "incurs transaction fee"
  {:db/ident :fibo-md-civx-fun/incursTransactionFee,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundPortfolio,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "incurs transaction fee"},
   :rdfs/range :fibo-md-civx-fun/FeePayable})

(def netOrGrossOfFees
  "net or gross of fees"
  {:db/ident :fibo-md-civx-fun/netOrGrossOfFees,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-md-civx-fun/FundUnitPerformance,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "net or gross of fees"},
   :rdfs/range :xsd/string})