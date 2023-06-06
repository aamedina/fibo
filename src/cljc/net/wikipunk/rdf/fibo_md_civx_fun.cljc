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
    "https://www.omg.org/spec/Commons/ContextualDesignators/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Funds/Funds/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/InstrumentPricing/"
    "https://www.omg.org/spec/Commons/DatesAndTimes/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/OwnershipAndControl/OwnershipParties/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/MD/CIVTemporal/FundsTemporal/",
   :rdf/ns-prefix-map
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
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-md-civx-fun",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label #voc/lstr "FundsTemporal@en"})

(def AccruedFees
  "accrued fees"
  {:db/ident :fibo-md-civx-fun/AccruedFees,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label #voc/lstr "accrued fees@en"})

(def AccruedIncome
  "accrued income"
  {:db/ident :fibo-md-civx-fun/AccruedIncome,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label #voc/lstr "accrued income@en"})

(def AccruedTaxes
  "accrued taxes"
  {:db/ident :fibo-md-civx-fun/AccruedTaxes,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label #voc/lstr "accrued taxes@en"})

(def FeePayable
  "fee payable"
  {:db/ident :fibo-md-civx-fun/FeePayable,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label #voc/lstr "fee payable@en"})

(def FundPrice
  "fund price"
  {:db/ident :fibo-md-civx-fun/FundPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label #voc/lstr "fund price@en",
   :rdfs/subClassOf [:fibo-fbc-fi-ip/SecurityPrice
                     :fibo-md-civx-fun/FundPrice]})

(def FundUnitPerformance
  "fund unit performance"
  {:db/ident :fibo-md-civx-fun/FundUnitPerformance,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label #voc/lstr "fund unit performance@en"})

(def FundsTax
  "funds tax"
  {:db/ident :fibo-md-civx-fun/FundsTax,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label #voc/lstr "funds tax@en",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-be-oac-opty/Investor,
                      :rdf/type           :owl/Restriction}
                     :fibo-md-civx-fun/FundsTax]})

(def SigmaValueOfHoldings
  "sigma value of holdings"
  {:db/ident :fibo-md-civx-fun/SigmaValueOfHoldings,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label #voc/lstr "sigma value of holdings@en"})

(def Swing
  "swing"
  {:db/ident :fibo-md-civx-fun/Swing,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label #voc/lstr "swing@en"})

(def SwingPrice
  "swing price"
  {:db/ident :fibo-md-civx-fun/SwingPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label #voc/lstr "swing price@en",
   :rdfs/subClassOf [:fibo-md-civx-fun/FundPrice
                     :fibo-md-civx-fun/SwingPrice
                     :fibo-fbc-fi-ip/SecurityPrice]})

(def determinationDate_1
  "determination date"
  {:db/ident :fibo-md-civx-fun/determinationDate.1,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-md-civx-fun/FundUnitPerformance,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label #voc/lstr "determination date@en",
   :rdfs/range :cmns-dt/Date})

(def determinationPeriod
  "THe period for which the performance is determined"
  {:db/ident :fibo-md-civx-fun/determinationPeriod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-md-civx-fun/FundUnitPerformance,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label #voc/lstr "determination period@en",
   :rdfs/range :cmns-dt/DatePeriod,
   :skos/definition #voc/lstr
                     "THe period for which the performance is determined@en"})

(def determines
  "determines"
  {:db/ident :fibo-md-civx-fun/determines,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label #voc/lstr "determines@en",
   :rdfs/range :fibo-md-civx-fun/FeePayable})

(def hasPerformance
  "has performance"
  {:db/ident :fibo-md-civx-fun/hasPerformance,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/FundUnit,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label #voc/lstr "has performance@en",
   :rdfs/range :fibo-md-civx-fun/FundUnitPerformance})

(def incurs
  "incurs"
  {:db/ident :fibo-md-civx-fun/incurs,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundPortfolio,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label #voc/lstr "incurs@en",
   :rdfs/range :fibo-md-civx-fun/FundsTax})

(def incursFees
  "incurs fees"
  {:db/ident :fibo-md-civx-fun/incursFees,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-oac-opty/Investor,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label #voc/lstr "incurs fees@en",
   :rdfs/range :fibo-md-civx-fun/FeePayable})

(def incursFees_1
  "incurs fees"
  {:db/ident :fibo-md-civx-fun/incursFees.1,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/FundUnit,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label #voc/lstr "incurs fees@en",
   :rdfs/range :fibo-md-civx-fun/FeePayable})

(def incursTax
  "incurs tax"
  {:db/ident :fibo-md-civx-fun/incursTax,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-oac-opty/Investor,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label #voc/lstr "incurs tax@en",
   :rdfs/range :fibo-md-civx-fun/FundsTax})

(def incursTax_1
  "incurs tax"
  {:db/ident :fibo-md-civx-fun/incursTax.1,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/FundUnit,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label #voc/lstr "incurs tax@en",
   :rdfs/range :fibo-md-civx-fun/FundsTax})

(def incursTransactionFee
  "incurs transaction fee"
  {:db/ident :fibo-md-civx-fun/incursTransactionFee,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundPortfolio,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label #voc/lstr "incurs transaction fee@en",
   :rdfs/range :fibo-md-civx-fun/FeePayable})

(def netOrGrossOfFees
  "net or gross of fees"
  {:db/ident :fibo-md-civx-fun/netOrGrossOfFees,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-md-civx-fun/FundUnitPerformance,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label #voc/lstr "net or gross of fees@en",
   :rdfs/range :xsd/string})