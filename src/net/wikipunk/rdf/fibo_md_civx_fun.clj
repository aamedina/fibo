(ns net.wikipunk.rdf.fibo-md-civx-fun
  "Terms which have a time component (either real time, intra-day or dated terms). These include Net Present Value (NPV) and related analytics."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :dcterms/abstract
   "Terms which have a time component (either real time, intra-day or dated terms). These include Net Present Value (NPV) and related analytics.",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Funds/CollectiveInvestmentVehicles/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Funds/Funds/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/OwnershipAndControl/OwnershipParties/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/MD/CIVTemporal/FundsTemporal/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-be-oac-opty"
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties/",
    "fibo-fnd-dt-fd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
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
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfa/prefix "fibo-md-civx-fun",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "FundsTemporal"},
   :sm/fileAbbreviation "fibo-md-civx-fun"})

(def AccruedFees
  {:db/ident :fibo-md-civx-fun/AccruedFees,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "accrued fees"}})

(def AccruedIncome
  {:db/ident :fibo-md-civx-fun/AccruedIncome,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "accrued income"}})

(def AccruedTaxes
  {:db/ident :fibo-md-civx-fun/AccruedTaxes,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "accrued taxes"}})

(def BidPrice
  {:db/ident :fibo-md-civx-fun/BidPrice,
   :owl/disjointWith :fibo-md-civx-fun/mutuallyExclusive,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "bid price"},
   :rdfs/subClassOf :fibo-md-civx-fun/FundPrice})

(def FeePayable
  {:db/ident :fibo-md-civx-fun/FeePayable,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fee payable"}})

(def FundPrice
  {:db/ident :fibo-md-civx-fun/FundPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fund price"}})

(def FundUnitPerformance
  {:db/ident :fibo-md-civx-fun/FundUnitPerformance,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fund unit performance"}})

(def FundsTax
  {:db/ident :fibo-md-civx-fun/FundsTax,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "funds tax"},
   :rdfs/subClassOf {:owl/onProperty     :fibo-md-civx-fun/appliesTo,
                     :owl/someValuesFrom :fibo-be-oac-opty/Investor,
                     :rdf/type           :owl/Restriction}})

(def NetAssetValue
  {:db/ident :fibo-md-civx-fun/NetAssetValue,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "net asset value"},
   :rdfs/subClassOf :fibo-md-civx-fun/FundPrice})

(def RedemptionPrice
  {:db/ident :fibo-md-civx-fun/RedemptionPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "redemption price"},
   :rdfs/subClassOf :fibo-md-civx-fun/FundPrice})

(def SigmaValueOfHoldings
  {:db/ident :fibo-md-civx-fun/SigmaValueOfHoldings,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "sigma value of holdings"}})

(def Swing
  {:db/ident :fibo-md-civx-fun/Swing,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "swing"}})

(def SwingPrice
  {:db/ident :fibo-md-civx-fun/SwingPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "swing price"},
   :rdfs/subClassOf :fibo-md-civx-fun/FundPrice})

(def appliesTo
  {:db/ident :fibo-md-civx-fun/appliesTo,
   :owl/inverseOf :fibo-md-civx-fun/incursTax,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-md-civx-fun/FundsTax,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "applies to"},
   :rdfs/range :fibo-be-oac-opty/Investor})

(def declarationTime
  "Time of the net asset value publication. Further Notes REVIEW: time of day, year or what?"
  {:db/ident :fibo-md-civx-fun/declarationTime,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-md-civx-fun/NetAssetValue,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "declaration time"},
   :rdfs/range :xsd/dateTime,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Time of the net asset value publication. Further Notes REVIEW: time of day, year or what?"}})

(def determinationDate
  "The date when the price is determined. and time."
  {:db/ident :fibo-md-civx-fun/determinationDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-md-civx-fun/FundPrice,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "determination date"},
   :rdfs/range :fibo-fnd-dt-fd/Date,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The date when the price is determined. and time."}})

(def determinationDate.1
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
  {:db/ident :fibo-md-civx-fun/determines,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/CollectiveInvestmentVehicle,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "determines"},
   :rdfs/range :fibo-md-civx-fun/FeePayable})

(def hasPerformance
  {:db/ident :fibo-md-civx-fun/hasPerformance,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/FundUnit,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has performance"},
   :rdfs/range :fibo-md-civx-fun/FundUnitPerformance})

(def hasPrice
  {:db/ident :fibo-md-civx-fun/hasPrice,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/FundUnit,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has price"},
   :rdfs/range :fibo-md-civx-fun/FundPrice})

(def incurs
  {:db/ident :fibo-md-civx-fun/incurs,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundPortfolio,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "incurs"},
   :rdfs/range :fibo-md-civx-fun/FundsTax})

(def incursFees
  {:db/ident :fibo-md-civx-fun/incursFees,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-oac-opty/Investor,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "incurs fees"},
   :rdfs/range :fibo-md-civx-fun/FeePayable})

(def incursFees.1
  {:db/ident :fibo-md-civx-fun/incursFees.1,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/FundUnit,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "incurs fees"},
   :rdfs/range :fibo-md-civx-fun/FeePayable})

(def incursTax
  {:db/ident :fibo-md-civx-fun/incursTax,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-oac-opty/Investor,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "incurs tax"},
   :rdfs/range :fibo-md-civx-fun/FundsTax})

(def incursTax.1
  {:db/ident :fibo-md-civx-fun/incursTax.1,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-fund/FundUnit,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "incurs tax"},
   :rdfs/range :fibo-md-civx-fun/FundsTax})

(def incursTransactionFee
  {:db/ident :fibo-md-civx-fun/incursTransactionFee,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-fund-civ/FundPortfolio,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "incurs transaction fee"},
   :rdfs/range :fibo-md-civx-fun/FeePayable})

(def mutuallyExclusive
  {:db/ident :fibo-md-civx-fun/mutuallyExclusive,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "offer price"},
   :rdfs/subClassOf :fibo-md-civx-fun/FundPrice})

(def netOrGrossOfFees
  {:db/ident :fibo-md-civx-fun/netOrGrossOfFees,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-md-civx-fun/FundUnitPerformance,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "net or gross of fees"},
   :rdfs/range :xsd/string})

(def valuationTime
  "Time of the price valuation for the investment fund/fund class."
  {:db/ident :fibo-md-civx-fun/valuationTime,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-md-civx-fun/NetAssetValue,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/MD/CIVTemporal/FundsTemporal/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "valuation time"},
   :rdfs/range :xsd/dateTime,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Time of the price valuation for the investment fund/fund class."}})