(ns net.wikipunk.rdf.fibo-ind-ir-cm
  "This ontology provides reference data for commonly referenced interest rates, specifically those that are referenced in the ISDA FpML codes for floating interest rates. The rates included herein are generated directly from the FpML published reference data."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :dcterms/abstract
   "This ontology provides reference data for commonly referenced interest rates, specifically those that are referenced in the ISDA FpML codes for floating interest rates. The rates included herein are generated directly from the FpML published reference data.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/adaptedFrom
   "http://www.fpml.org/coding-scheme/floating-rate-index-3-2.xml",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/ISO4217-CurrencyCodes/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/InterestRates/MarketDataProviders/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/InterestRates/InterestRates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/InterestRates/CommonInterestRates/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-fbc-fct-usfsind"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/",
    "fibo-fbc-fct-usjrga"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/",
    "fibo-fnd-acc-4217"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/ISO4217-CurrencyCodes/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-ind-ir-cm"
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
    "fibo-ind-ir-ir"
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/",
    "fibo-ind-ir-mdp"
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/MarketDataProviders/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfa/prefix "fibo-ind-ir-cm",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "Common Interest Rates Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates.rdf version of this ontology was revised extensively to restructure the way in which interest rate benchmarks are modeled and eliminate references to the merged interest rate publishers ontology."
    "The https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates.rdf version of this ontology was modified to normalize the prefix for the EU individuals ontology."
    "The https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates.rdf version of this ontology was revised to reflect the latest FpML rates, which include a number of changes, including deprecating some rates and replacing them with others."
    "The https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates.rdf version of this ontology was revised to reflect the latest FpML rates."],
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright ["Copyright (c) 2015-2021 EDM Council, Inc."
                  "Copyright (c) 2015-2021 Object Management Group, Inc."],
   :sm/dependsOn
   ["https://spec.edmcouncil.org/fibo/ontology/FND/"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/"
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/MarketDataProviders/"
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates/"],
   :sm/fileAbbreviation "fibo-ind-ir-cm",
   :sm/filename "CommonInterestRates.rdf"})

(def AED-EIBOR
  {:db/ident :fibo-ind-ir-cm/AED-EIBOR,
   :fibo-fnd-utl-av/abbreviation "AED-EIBOR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/UAEDirham,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "AED-EIBOR"})

(def AUD-AONIA
  {:db/ident :fibo-ind-ir-cm/AUD-AONIA,
   :fibo-fnd-utl-av/abbreviation "AUD-AONIA",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/AustralianDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "AUD-AONIA"})

(def AUD-AONIA-OIS_Compound
  {:db/ident :fibo-ind-ir-cm/AUD-AONIA-OIS_Compound,
   :fibo-fnd-utl-av/abbreviation "AUD-AONIA-OIS Compound",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/AustralianDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "AUD-AONIA-OIS Compound"})

(def AUD-BBR-ISDC
  {:db/ident :fibo-ind-ir-cm/AUD-BBR-ISDC,
   :fibo-fnd-utl-av/abbreviation "AUD-BBR-ISDC",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/AustralianDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "AUD-BBR-ISDC"})

(def AUD-BBSW
  {:db/ident :fibo-ind-ir-cm/AUD-BBSW,
   :fibo-fnd-utl-av/abbreviation "AUD-BBSW",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/AustralianDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "AUD-BBSW"})

(def AUD-BBSW_Quarterly_Swap_Rate_ICAP
  {:db/ident :fibo-ind-ir-cm/AUD-BBSW_Quarterly_Swap_Rate_ICAP,
   :fibo-fnd-utl-av/abbreviation "AUD-BBSW Quarterly Swap Rate ICAP",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/AustralianDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "AUD-BBSW Quarterly Swap Rate ICAP"})

(def AUD-BBSW_Semi_Annual_Swap_Rate_ICAP
  {:db/ident :fibo-ind-ir-cm/AUD-BBSW_Semi_Annual_Swap_Rate_ICAP,
   :fibo-fnd-utl-av/abbreviation "AUD-BBSW Semi Annual Swap Rate ICAP",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/AustralianDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "AUD-BBSW Semi Annual Swap Rate ICAP"})

(def AUD-BBSY_Bid
  {:db/ident :fibo-ind-ir-cm/AUD-BBSY_Bid,
   :fibo-fnd-utl-av/abbreviation "AUD-BBSY Bid",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/AustralianDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "AUD-BBSY Bid"})

(def AUD-LIBOR-BBA
  {:db/ident :fibo-ind-ir-cm/AUD-LIBOR-BBA,
   :fibo-fnd-utl-av/abbreviation "AUD-LIBOR-BBA",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/AustralianDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "AUD-LIBOR-BBA"})

(def AUD-LIBOR-BBA-Bloomberg
  {:db/ident :fibo-ind-ir-cm/AUD-LIBOR-BBA-Bloomberg,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/BloombergLP,
   :fibo-fnd-utl-av/abbreviation "AUD-LIBOR-BBA-Bloomberg",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/AustralianDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "AUD-LIBOR-BBA-Bloomberg"})

(def AUD-LIBOR-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/AUD-LIBOR-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "AUD-LIBOR-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/AustralianDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "AUD-LIBOR-Reference Banks"})

(def AUD-Quarterly_Swap_Rate-ICAP-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/AUD-Quarterly_Swap_Rate-ICAP-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "AUD-Quarterly Swap Rate-ICAP-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/AustralianDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/ThreeMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "AUD-Quarterly Swap Rate-ICAP-Reference Banks"})

(def AUD-Semi-Annual_Swap_Rate-11_00-BGCANTOR
  {:db/ident :fibo-ind-ir-cm/AUD-Semi-Annual_Swap_Rate-11_00-BGCANTOR,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/FenicsMarketData,
   :fibo-fnd-utl-av/abbreviation "AUD-Semi-Annual Swap Rate-11:00-BGCANTOR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/AustralianDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "AUD-Semi-Annual Swap Rate-11:00-BGCANTOR"})

(def AUD-Semi-Annual_Swap_Rate-BGCANTOR-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/AUD-Semi-Annual_Swap_Rate-BGCANTOR-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation
   "AUD-Semi-Annual Swap Rate-BGCANTOR-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/AustralianDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "AUD-Semi-Annual Swap Rate-BGCANTOR-Reference Banks"})

(def AUD-Semi-Annual_Swap_Rate-ICAP-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/AUD-Semi-Annual_Swap_Rate-ICAP-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation
   "AUD-Semi-Annual Swap Rate-ICAP-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/AustralianDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "AUD-Semi-Annual Swap Rate-ICAP-Reference Banks"})

(def AUD-Swap_Rate-Reuters
  {:db/ident :fibo-ind-ir-cm/AUD-Swap_Rate-Reuters,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/ThomsonReuters,
   :fibo-fnd-utl-av/abbreviation "AUD-Swap Rate-Reuters",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/AustralianDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "AUD-Swap Rate-Reuters"})

(def BRL-CDI
  {:db/ident :fibo-ind-ir-cm/BRL-CDI,
   :fibo-fnd-utl-av/abbreviation "BRL-CDI",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/BrazilianReal,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "BRL-CDI"})

(def CAD-BA-ISDD
  {:db/ident :fibo-ind-ir-cm/CAD-BA-ISDD,
   :fibo-fnd-utl-av/abbreviation "CAD-BA-ISDD",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/CanadianDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "CAD-BA-ISDD"})

(def CAD-BA-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/CAD-BA-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "CAD-BA-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/CanadianDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "CAD-BA-Reference Banks"})

(def CAD-BA-Telerate
  {:db/ident :fibo-ind-ir-cm/CAD-BA-Telerate,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/ThomsonReuters,
   :fibo-fnd-utl-av/abbreviation "CAD-BA-Telerate",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/CanadianDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "CAD-BA-Telerate"})

(def CAD-CDOR
  {:db/ident :fibo-ind-ir-cm/CAD-CDOR,
   :fibo-fnd-utl-av/abbreviation "CAD-CDOR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/CanadianDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "CAD-CDOR"})

(def CAD-CORRA
  {:db/ident :fibo-ind-ir-cm/CAD-CORRA,
   :fibo-fnd-utl-av/abbreviation "CAD-CORRA",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/CanadianDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "CAD-CORRA"})

(def CAD-CORRA-OIS_Compound
  {:db/ident :fibo-ind-ir-cm/CAD-CORRA-OIS_Compound,
   :fibo-fnd-utl-av/abbreviation "CAD-CORRA-OIS Compound",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/CanadianDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "CAD-CORRA-OIS Compound"})

(def CAD-ISDA-Swap_Rate
  {:db/ident :fibo-ind-ir-cm/CAD-ISDA-Swap_Rate,
   :fibo-fnd-utl-av/abbreviation "CAD-ISDA-Swap Rate",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/CanadianDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "CAD-ISDA-Swap Rate"})

(def CAD-LIBOR-BBA
  {:db/ident :fibo-ind-ir-cm/CAD-LIBOR-BBA,
   :fibo-fnd-utl-av/abbreviation "CAD-LIBOR-BBA",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/CanadianDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "CAD-LIBOR-BBA"})

(def CAD-LIBOR-BBA-Bloomberg
  {:db/ident :fibo-ind-ir-cm/CAD-LIBOR-BBA-Bloomberg,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/BloombergLP,
   :fibo-fnd-utl-av/abbreviation "CAD-LIBOR-BBA-Bloomberg",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/CanadianDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "CAD-LIBOR-BBA-Bloomberg"})

(def CAD-LIBOR-BBA-SwapMarker
  {:db/ident :fibo-ind-ir-cm/CAD-LIBOR-BBA-SwapMarker,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/SwapMarker,
   :fibo-fnd-utl-av/abbreviation "CAD-LIBOR-BBA-SwapMarker",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/CanadianDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "CAD-LIBOR-BBA-SwapMarker"})

(def CAD-LIBOR-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/CAD-LIBOR-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "CAD-LIBOR-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/CanadianDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "CAD-LIBOR-Reference Banks"})

(def CAD-REPO-CORRA
  {:db/ident :fibo-ind-ir-cm/CAD-REPO-CORRA,
   :fibo-fnd-utl-av/abbreviation "CAD-REPO-CORRA",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/CanadianDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "CAD-REPO-CORRA"})

(def CAD-TBILL-ISDD
  {:db/ident :fibo-ind-ir-cm/CAD-TBILL-ISDD,
   :fibo-fnd-utl-av/abbreviation "CAD-TBILL-ISDD",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/CanadianDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "CAD-TBILL-ISDD"})

(def CAD-TBILL-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/CAD-TBILL-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "CAD-TBILL-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/CanadianDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "CAD-TBILL-Reference Banks"})

(def CAD-TBILL-Reuters
  {:db/ident :fibo-ind-ir-cm/CAD-TBILL-Reuters,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/ThomsonReuters,
   :fibo-fnd-utl-av/abbreviation "CAD-TBILL-Reuters",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/CanadianDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "CAD-TBILL-Reuters"})

(def CAD-TBILL-Telerate
  {:db/ident :fibo-ind-ir-cm/CAD-TBILL-Telerate,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/ThomsonReuters,
   :fibo-fnd-utl-av/abbreviation "CAD-TBILL-Telerate",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/CanadianDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "CAD-TBILL-Telerate"})

(def CHF-3M_LIBOR_SWAP-CME_vs_LCH-ICAP
  {:db/ident :fibo-ind-ir-cm/CHF-3M_LIBOR_SWAP-CME_vs_LCH-ICAP,
   :fibo-fnd-utl-av/abbreviation "CHF-3M LIBOR SWAP-CME vs LCH-ICAP",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwissFranc,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/ThreeMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "CHF-3M LIBOR SWAP-CME vs LCH-ICAP"})

(def CHF-3M_LIBOR_SWAP-CME_vs_LCH-ICAP-Bloomberg
  {:db/ident :fibo-ind-ir-cm/CHF-3M_LIBOR_SWAP-CME_vs_LCH-ICAP-Bloomberg,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/BloombergLP,
   :fibo-fnd-utl-av/abbreviation "CHF-3M LIBOR SWAP-CME vs LCH-ICAP-Bloomberg",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwissFranc,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/ThreeMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "CHF-3M LIBOR SWAP-CME vs LCH-ICAP-Bloomberg"})

(def CHF-3M_LIBOR_SWAP-EUREX_vs_LCH-ICAP
  {:db/ident :fibo-ind-ir-cm/CHF-3M_LIBOR_SWAP-EUREX_vs_LCH-ICAP,
   :fibo-fnd-utl-av/abbreviation "CHF-3M LIBOR SWAP-EUREX vs LCH-ICAP",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwissFranc,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/ThreeMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "CHF-3M LIBOR SWAP-EUREX vs LCH-ICAP"})

(def CHF-3M_LIBOR_SWAP-EUREX_vs_LCH-ICAP-Bloomberg
  {:db/ident :fibo-ind-ir-cm/CHF-3M_LIBOR_SWAP-EUREX_vs_LCH-ICAP-Bloomberg,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/BloombergLP,
   :fibo-fnd-utl-av/abbreviation
   "CHF-3M LIBOR SWAP-EUREX vs LCH-ICAP-Bloomberg",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwissFranc,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/ThreeMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "CHF-3M LIBOR SWAP-EUREX vs LCH-ICAP-Bloomberg"})

(def CHF-6M_LIBORSWAP-CME_vs_LCH-ICAP-Bloomberg
  {:db/ident :fibo-ind-ir-cm/CHF-6M_LIBORSWAP-CME_vs_LCH-ICAP-Bloomberg,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/BloombergLP,
   :fibo-fnd-utl-av/abbreviation "CHF-6M LIBORSWAP-CME vs LCH-ICAP-Bloomberg",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwissFranc,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "CHF-6M LIBORSWAP-CME vs LCH-ICAP-Bloomberg"})

(def CHF-6M_LIBOR_SWAP-CME_vs_LCH-ICAP
  {:db/ident :fibo-ind-ir-cm/CHF-6M_LIBOR_SWAP-CME_vs_LCH-ICAP,
   :fibo-fnd-utl-av/abbreviation "CHF-6M LIBOR SWAP-CME vs LCH-ICAP",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwissFranc,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "CHF-6M LIBOR SWAP-CME vs LCH-ICAP"})

(def CHF-6M_LIBOR_SWAP-EUREX_vs_LCH-ICAP
  {:db/ident :fibo-ind-ir-cm/CHF-6M_LIBOR_SWAP-EUREX_vs_LCH-ICAP,
   :fibo-fnd-utl-av/abbreviation "CHF-6M LIBOR SWAP-EUREX vs LCH-ICAP",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwissFranc,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "CHF-6M LIBOR SWAP-EUREX vs LCH-ICAP"})

(def CHF-6M_LIBOR_SWAP-EUREX_vs_LCH-ICAP-Bloomberg
  {:db/ident :fibo-ind-ir-cm/CHF-6M_LIBOR_SWAP-EUREX_vs_LCH-ICAP-Bloomberg,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/BloombergLP,
   :fibo-fnd-utl-av/abbreviation
   "CHF-6M LIBOR SWAP-EUREX vs LCH-ICAP-Bloomberg",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwissFranc,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "CHF-6M LIBOR SWAP-EUREX vs LCH-ICAP-Bloomberg"})

(def CHF-Annual_Swap_Rate
  {:db/ident :fibo-ind-ir-cm/CHF-Annual_Swap_Rate,
   :fibo-fnd-utl-av/abbreviation "CHF-Annual Swap Rate",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwissFranc,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "CHF-Annual Swap Rate"})

(def CHF-Annual_Swap_Rate-11_00-ICAP
  {:db/ident :fibo-ind-ir-cm/CHF-Annual_Swap_Rate-11_00-ICAP,
   :fibo-fnd-utl-av/abbreviation "CHF-Annual Swap Rate-11:00-ICAP",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwissFranc,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "CHF-Annual Swap Rate-11:00-ICAP"})

(def CHF-Annual_Swap_Rate-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/CHF-Annual_Swap_Rate-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "CHF-Annual Swap Rate-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwissFranc,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "CHF-Annual Swap Rate-Reference Banks"})

(def CHF-Basis_Swap-3m_vs_6m-LIBOR-11_00-ICAP
  {:db/ident :fibo-ind-ir-cm/CHF-Basis_Swap-3m_vs_6m-LIBOR-11_00-ICAP,
   :fibo-fnd-utl-av/abbreviation "CHF-Basis Swap-3m vs 6m-LIBOR-11:00-ICAP",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwissFranc,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "CHF-Basis Swap-3m vs 6m-LIBOR-11:00-ICAP"})

(def CHF-ISDAFIX-Swap_Rate
  {:db/ident :fibo-ind-ir-cm/CHF-ISDAFIX-Swap_Rate,
   :fibo-fnd-utl-av/abbreviation "CHF-ISDAFIX-Swap Rate",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwissFranc,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "CHF-ISDAFIX-Swap Rate"})

(def CHF-LIBOR
  {:db/ident :fibo-ind-ir-cm/CHF-LIBOR,
   :fibo-fnd-utl-av/abbreviation "CHF-LIBOR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwissFranc,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "CHF-LIBOR"})

(def CHF-LIBOR-ISDA
  {:db/ident :fibo-ind-ir-cm/CHF-LIBOR-ISDA,
   :fibo-fnd-utl-av/abbreviation "CHF-LIBOR-ISDA",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwissFranc,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "CHF-LIBOR-ISDA"})

(def CHF-LIBOR-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/CHF-LIBOR-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "CHF-LIBOR-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwissFranc,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "CHF-LIBOR-Reference Banks"})

(def CHF-OIS-11_00-ICAP
  {:db/ident :fibo-ind-ir-cm/CHF-OIS-11_00-ICAP,
   :fibo-fnd-utl-av/abbreviation "CHF-OIS-11:00-ICAP",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwissFranc,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "CHF-OIS-11:00-ICAP"})

(def CHF-SARON
  {:db/ident :fibo-ind-ir-cm/CHF-SARON,
   :fibo-fnd-utl-av/abbreviation "CHF-SARON",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwissFranc,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "CHF-SARON"})

(def CHF-SARON-OIS_Compound
  {:db/ident :fibo-ind-ir-cm/CHF-SARON-OIS_Compound,
   :fibo-fnd-utl-av/abbreviation "CHF-SARON-OIS Compound",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwissFranc,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "CHF-SARON-OIS Compound"})

(def CHF-TOIS-OIS-COMPOUND
  {:db/ident :fibo-ind-ir-cm/CHF-TOIS-OIS-COMPOUND,
   :fibo-fnd-utl-av/abbreviation "CHF-TOIS-OIS-COMPOUND",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwissFranc,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "CHF-TOIS-OIS-COMPOUND"})

(def CHF_USD-Basis_Swaps-11_00-ICAP
  {:db/ident :fibo-ind-ir-cm/CHF_USD-Basis_Swaps-11_00-ICAP,
   :fibo-fnd-utl-av/abbreviation "CHF USD-Basis Swaps-11:00-ICAP",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwissFranc,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "CHF USD-Basis Swaps-11:00-ICAP"})

(def CLP-ICP
  {:db/ident :fibo-ind-ir-cm/CLP-ICP,
   :fibo-fnd-utl-av/abbreviation "CLP-ICP",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/ChileanPeso,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "CLP-ICP"})

(def CLP-TNA
  {:db/ident :fibo-ind-ir-cm/CLP-TNA,
   :fibo-fnd-utl-av/abbreviation "CLP-TNA",
   :fibo-fnd-utl-av/explanatoryNote
   "Refers to the Indice Camara Promedio (\"ICP\") rate for Chilean Pesos which, for a Reset Date, is determined and published by the Asociacion de Bancos e Instituciones Financieras de Chile A.G. (\"ABIF\") in accordance with the \"Reglamento Indice de Camara Promedio\" of the ABIF as published in the Diario Oficial de la Republica de Chile (the \"ICP Rules\") and which is reported on the ABIF website by not later than 10:00 a.m., Santiago time, on that Reset Date.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/ChileanPeso,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "CLP-TNA"})

(def CNH-HIBOR
  {:db/ident :fibo-ind-ir-cm/CNH-HIBOR,
   :fibo-fnd-utl-av/abbreviation "CNH-HIBOR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/YuanRenminbi,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "CNH-HIBOR"})

(def CNH-HIBOR-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/CNH-HIBOR-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "CNH-HIBOR-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/YuanRenminbi,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "CNH-HIBOR-Reference Banks"})

(def CNY-Deposit_Rate
  {:db/ident :fibo-ind-ir-cm/CNY-Deposit_Rate,
   :fibo-fnd-utl-av/abbreviation "CNY-Deposit Rate",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/YuanRenminbi,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "CNY-Deposit Rate"})

(def CNY-Fixing_Repo_Rate
  {:db/ident :fibo-ind-ir-cm/CNY-Fixing_Repo_Rate,
   :fibo-fnd-utl-av/abbreviation "CNY-Fixing Repo Rate",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/YuanRenminbi,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "CNY-Fixing Repo Rate"})

(def CNY-LPR
  {:db/ident :fibo-ind-ir-cm/CNY-LPR,
   :fibo-fnd-utl-av/abbreviation "CNY-LPR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/YuanRenminbi,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "CNY-LPR"})

(def CNY-Quarterly_7D_Repo_NDS_Rate_Tradition
  {:db/ident :fibo-ind-ir-cm/CNY-Quarterly_7D_Repo_NDS_Rate_Tradition,
   :fibo-fnd-utl-av/abbreviation "CNY-Quarterly 7D Repo NDS Rate Tradition",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/YuanRenminbi,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/ThreeMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "CNY-Quarterly 7D Repo NDS Rate Tradition"})

(def
  CNY-Quarterly_7_day_Repo_Non_Deliverable_Swap_Rate-TRADITION-Reference_Banks
  {:db/ident
   :fibo-ind-ir-cm/CNY-Quarterly_7_day_Repo_Non_Deliverable_Swap_Rate-TRADITION-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation
   "CNY-Quarterly 7 day Repo Non Deliverable Swap Rate-TRADITION-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/YuanRenminbi,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/ThreeMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label
   "CNY-Quarterly 7 day Repo Non Deliverable Swap Rate-TRADITION-Reference Banks"})

(def CNY-SHIBOR
  {:db/ident :fibo-ind-ir-cm/CNY-SHIBOR,
   :fibo-fnd-utl-av/abbreviation "CNY-SHIBOR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/YuanRenminbi,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "CNY-SHIBOR"})

(def CNY-SHIBOR-OIS_Compound
  {:db/ident :fibo-ind-ir-cm/CNY-SHIBOR-OIS_Compound,
   :fibo-fnd-utl-av/abbreviation "CNY-SHIBOR-OIS Compound",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/YuanRenminbi,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "CNY-SHIBOR-OIS Compound"})

(def CNY-Semi-Annual_Swap_Rate-11_00-BGCANTOR
  {:db/ident :fibo-ind-ir-cm/CNY-Semi-Annual_Swap_Rate-11_00-BGCANTOR,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/FenicsMarketData,
   :fibo-fnd-utl-av/abbreviation "CNY-Semi-Annual Swap Rate-11:00-BGCANTOR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/YuanRenminbi,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "CNY-Semi-Annual Swap Rate-11:00-BGCANTOR"})

(def CNY-Semi-Annual_Swap_Rate-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/CNY-Semi-Annual_Swap_Rate-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "CNY-Semi-Annual Swap Rate-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/YuanRenminbi,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "CNY-Semi-Annual Swap Rate-Reference Banks"})

(def CNY_7-Repo_Compounding_Date
  {:db/ident :fibo-ind-ir-cm/CNY_7-Repo_Compounding_Date,
   :fibo-fnd-utl-av/abbreviation "CNY 7-Repo Compounding Date",
   :fibo-fnd-utl-av/explanatoryNote
   ["Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."
    "Deprecated usage: CNY 7-Repo Compounding Date - is not an floating rate index and should not be in the floating-rate-index list (it is a date)."],
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/YuanRenminbi,
   :owl/deprecated true,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "CNY 7-Repo Compounding Date"})

(def COP-IBR-OIS_Compound
  {:db/ident :fibo-ind-ir-cm/COP-IBR-OIS_Compound,
   :fibo-fnd-utl-av/abbreviation "COP-IBR-OIS Compound",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/ColombianPeso,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "COP-IBR-OIS Compound"})

(def CZK-Annual_Swap_Rate-11_00-BGCANTOR
  {:db/ident :fibo-ind-ir-cm/CZK-Annual_Swap_Rate-11_00-BGCANTOR,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/FenicsMarketData,
   :fibo-fnd-utl-av/abbreviation "CZK-Annual Swap Rate-11:00-BGCANTOR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/CzechKoruna,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "CZK-Annual Swap Rate-11:00-BGCANTOR"})

(def CZK-Annual_Swap_Rate-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/CZK-Annual_Swap_Rate-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "CZK-Annual Swap Rate-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/CzechKoruna,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "CZK-Annual Swap Rate-Reference Banks"})

(def CZK-CZEONIA
  {:db/ident :fibo-ind-ir-cm/CZK-CZEONIA,
   :fibo-fnd-utl-av/abbreviation "CZK-CZEONIA",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/CzechKoruna,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "CZK-CZEONIA"})

(def CZK-CZEONIA-OIS_Compound
  {:db/ident :fibo-ind-ir-cm/CZK-CZEONIA-OIS_Compound,
   :fibo-fnd-utl-av/abbreviation "CZK-CZEONIA-OIS Compound",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/CzechKoruna,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "CZK-CZEONIA-OIS Compound"})

(def CZK-PRIBOR
  {:db/ident :fibo-ind-ir-cm/CZK-PRIBOR,
   :fibo-fnd-utl-av/abbreviation "CZK-PRIBOR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/CzechKoruna,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "CZK-PRIBOR"})

(def CZK-PRIBOR-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/CZK-PRIBOR-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "CZK-PRIBOR-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/CzechKoruna,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "CZK-PRIBOR-Reference Banks"})

(def DKK-CIBOR
  {:db/ident :fibo-ind-ir-cm/DKK-CIBOR,
   :fibo-fnd-utl-av/abbreviation "DKK-CIBOR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/DanishKrone,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "DKK-CIBOR"})

(def DKK-CIBOR-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/DKK-CIBOR-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "DKK-CIBOR-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/DanishKrone,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "DKK-CIBOR-Reference Banks"})

(def DKK-CIBOR2
  {:db/ident :fibo-ind-ir-cm/DKK-CIBOR2,
   :fibo-fnd-utl-av/abbreviation "DKK-CIBOR2",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/DanishKrone,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "DKK-CIBOR2"})

(def DKK-CITA
  {:db/ident :fibo-ind-ir-cm/DKK-CITA,
   :fibo-fnd-utl-av/abbreviation "DKK-CITA",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/DanishKrone,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "DKK-CITA"})

(def DKK-Tom_Next-OIS_Compound
  {:db/ident :fibo-ind-ir-cm/DKK-Tom_Next-OIS_Compound,
   :fibo-fnd-utl-av/abbreviation "DKK-Tom Next-OIS Compound",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/DanishKrone,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "DKK-Tom Next-OIS Compound"})

(def EUR-3M_EURIBOR_SWAP-CME_vs_LCH-ICAP
  {:db/ident :fibo-ind-ir-cm/EUR-3M_EURIBOR_SWAP-CME_vs_LCH-ICAP,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-ind-ir-mdp/EuropeanMoneyMarketsInstituteBenchmarkPublisher,
   :fibo-fnd-utl-av/abbreviation "EUR-3M EURIBOR SWAP-CME vs LCH-ICAP",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/ThreeMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR-3M EURIBOR SWAP-CME vs LCH-ICAP"})

(def EUR-3M_EURIBOR_SWAP-CME_vs_LCH-ICAP-Bloomberg
  {:db/ident :fibo-ind-ir-cm/EUR-3M_EURIBOR_SWAP-CME_vs_LCH-ICAP-Bloomberg,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-ind-ir-mdp/EuropeanMoneyMarketsInstituteBenchmarkPublisher,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/BloombergLP,
   :fibo-fnd-utl-av/abbreviation
   "EUR-3M EURIBOR SWAP-CME vs LCH-ICAP-Bloomberg",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/ThreeMonths,
   :rdf/type [:owl/NamedIndividual :fibo-ind-ir-ir/InterestRateBenchmark],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR-3M EURIBOR SWAP-CME vs LCH-ICAP-Bloomberg"})

(def EUR-3M_EURIBOR_SWAP-EUREX_vs_LCH-ICAP
  {:db/ident :fibo-ind-ir-cm/EUR-3M_EURIBOR_SWAP-EUREX_vs_LCH-ICAP,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-ind-ir-mdp/EuropeanMoneyMarketsInstituteBenchmarkPublisher,
   :fibo-fnd-utl-av/abbreviation "EUR-3M EURIBOR SWAP-EUREX vs LCH-ICAP",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/ThreeMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR-3M EURIBOR SWAP-EUREX vs LCH-ICAP"})

(def EUR-3M_EURIBOR_SWAP-EUREX_vs_LCH-ICAP-Bloomberg
  {:db/ident :fibo-ind-ir-cm/EUR-3M_EURIBOR_SWAP-EUREX_vs_LCH-ICAP-Bloomberg,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-ind-ir-mdp/EuropeanMoneyMarketsInstituteBenchmarkPublisher,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/BloombergLP,
   :fibo-fnd-utl-av/abbreviation
   "EUR-3M EURIBOR SWAP-EUREX vs LCH-ICAP-Bloomberg",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/ThreeMonths,
   :rdf/type [:owl/NamedIndividual :fibo-ind-ir-ir/InterestRateBenchmark],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR-3M EURIBOR SWAP-EUREX vs LCH-ICAP-Bloomberg"})

(def EUR-6M_EURIBOR_SWAP-CME_vs_LCH-ICAP
  {:db/ident :fibo-ind-ir-cm/EUR-6M_EURIBOR_SWAP-CME_vs_LCH-ICAP,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-ind-ir-mdp/EuropeanMoneyMarketsInstituteBenchmarkPublisher,
   :fibo-fnd-utl-av/abbreviation "EUR-6M EURIBOR SWAP-CME vs LCH-ICAP",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR-6M EURIBOR SWAP-CME vs LCH-ICAP"})

(def EUR-6M_EURIBOR_SWAP-CME_vs_LCH-ICAP-Bloomberg
  {:db/ident :fibo-ind-ir-cm/EUR-6M_EURIBOR_SWAP-CME_vs_LCH-ICAP-Bloomberg,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-ind-ir-mdp/EuropeanMoneyMarketsInstituteBenchmarkPublisher,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/BloombergLP,
   :fibo-fnd-utl-av/abbreviation
   "EUR-6M EURIBOR SWAP-CME vs LCH-ICAP-Bloomberg",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type [:owl/NamedIndividual :fibo-ind-ir-ir/InterestRateBenchmark],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR-6M EURIBOR SWAP-CME vs LCH-ICAP-Bloomberg"})

(def EUR-6M_EURIBOR_SWAP-EUREX_vs_LCH-ICAP
  {:db/ident :fibo-ind-ir-cm/EUR-6M_EURIBOR_SWAP-EUREX_vs_LCH-ICAP,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-ind-ir-mdp/EuropeanMoneyMarketsInstituteBenchmarkPublisher,
   :fibo-fnd-utl-av/abbreviation "EUR-6M EURIBOR SWAP-EUREX vs LCH-ICAP",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR-6M EURIBOR SWAP-EUREX vs LCH-ICAP"})

(def EUR-6M_EURIBOR_SWAP-EUREX_vs_LCH-ICAP-Bloomberg
  {:db/ident :fibo-ind-ir-cm/EUR-6M_EURIBOR_SWAP-EUREX_vs_LCH-ICAP-Bloomberg,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-ind-ir-mdp/EuropeanMoneyMarketsInstituteBenchmarkPublisher,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/BloombergLP,
   :fibo-fnd-utl-av/abbreviation
   "EUR-6M EURIBOR SWAP-EUREX vs LCH-ICAP-Bloomberg",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR-6M EURIBOR SWAP-EUREX vs LCH-ICAP-Bloomberg"})

(def EUR-Annual_Swap_Rate-10_00
  {:db/ident :fibo-ind-ir-cm/EUR-Annual_Swap_Rate-10_00,
   :fibo-fnd-utl-av/abbreviation "EUR-Annual Swap Rate-10:00",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR-Annual Swap Rate-10:00"})

(def EUR-Annual_Swap_Rate-10_00-BGCANTOR
  {:db/ident :fibo-ind-ir-cm/EUR-Annual_Swap_Rate-10_00-BGCANTOR,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/FenicsMarketData,
   :fibo-fnd-utl-av/abbreviation "EUR-Annual Swap Rate-10:00-BGCANTOR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR-Annual Swap Rate-10:00-BGCANTOR"})

(def EUR-Annual_Swap_Rate-10_00-Bloomberg
  {:db/ident :fibo-ind-ir-cm/EUR-Annual_Swap_Rate-10_00-Bloomberg,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/BloombergLP,
   :fibo-fnd-utl-av/abbreviation "EUR-Annual Swap Rate-10:00-Bloomberg",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR-Annual Swap Rate-10:00-Bloomberg"})

(def EUR-Annual_Swap_Rate-10_00-ICAP
  {:db/ident :fibo-ind-ir-cm/EUR-Annual_Swap_Rate-10_00-ICAP,
   :fibo-fnd-utl-av/abbreviation "EUR-Annual Swap Rate-10:00-ICAP",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR-Annual Swap Rate-10:00-ICAP"})

(def EUR-Annual_Swap_Rate-10_00-SwapMarker
  {:db/ident :fibo-ind-ir-cm/EUR-Annual_Swap_Rate-10_00-SwapMarker,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/SwapMarker,
   :fibo-fnd-utl-av/abbreviation "EUR-Annual Swap Rate-10:00-SwapMarker",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR-Annual Swap Rate-10:00-SwapMarker"})

(def EUR-Annual_Swap_Rate-10_00-TRADITION
  {:db/ident :fibo-ind-ir-cm/EUR-Annual_Swap_Rate-10_00-TRADITION,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/Tradition,
   :fibo-fnd-utl-av/abbreviation "EUR-Annual Swap Rate-10:00-TRADITION",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR-Annual Swap Rate-10:00-TRADITION"})

(def EUR-Annual_Swap_Rate-11_00
  {:db/ident :fibo-ind-ir-cm/EUR-Annual_Swap_Rate-11_00,
   :fibo-fnd-utl-av/abbreviation "EUR-Annual Swap Rate-11:00",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR-Annual Swap Rate-11:00"})

(def EUR-Annual_Swap_Rate-11_00-Bloomberg
  {:db/ident :fibo-ind-ir-cm/EUR-Annual_Swap_Rate-11_00-Bloomberg,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/BloombergLP,
   :fibo-fnd-utl-av/abbreviation "EUR-Annual Swap Rate-11:00-Bloomberg",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR-Annual Swap Rate-11:00-Bloomberg"})

(def EUR-Annual_Swap_Rate-11_00-ICAP
  {:db/ident :fibo-ind-ir-cm/EUR-Annual_Swap_Rate-11_00-ICAP,
   :fibo-fnd-utl-av/abbreviation "EUR-Annual Swap Rate-11:00-ICAP",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR-Annual Swap Rate-11:00-ICAP"})

(def EUR-Annual_Swap_Rate-11_00-SwapMarker
  {:db/ident :fibo-ind-ir-cm/EUR-Annual_Swap_Rate-11_00-SwapMarker,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/SwapMarker,
   :fibo-fnd-utl-av/abbreviation "EUR-Annual Swap Rate-11:00-SwapMarker",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR-Annual Swap Rate-11:00-SwapMarker"})

(def EUR-Annual_Swap_Rate-3_Month
  {:db/ident :fibo-ind-ir-cm/EUR-Annual_Swap_Rate-3_Month,
   :fibo-fnd-utl-av/abbreviation "EUR-Annual Swap Rate-3 Month",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR-Annual Swap Rate-3 Month"})

(def EUR-Annual_Swap_Rate-3_Month-SwapMarker
  {:db/ident :fibo-ind-ir-cm/EUR-Annual_Swap_Rate-3_Month-SwapMarker,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/SwapMarker,
   :fibo-fnd-utl-av/abbreviation "EUR-Annual Swap Rate-3 Month-SwapMarker",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR-Annual Swap Rate-3 Month-SwapMarker"})

(def EUR-Annual_Swap_Rate-4_15-TRADITION
  {:db/ident :fibo-ind-ir-cm/EUR-Annual_Swap_Rate-4_15-TRADITION,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/Tradition,
   :fibo-fnd-utl-av/abbreviation "EUR-Annual Swap Rate-4:15-TRADITION",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR-Annual Swap Rate-4:15-TRADITION"})

(def EUR-Annual_Swap_Rate-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/EUR-Annual_Swap_Rate-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "EUR-Annual Swap Rate-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR-Annual Swap Rate-Reference Banks"})

(def EUR-CNO_TEC10
  {:db/ident :fibo-ind-ir-cm/EUR-CNO_TEC10,
   :fibo-fnd-utl-av/abbreviation "EUR-CNO TEC10",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR-CNO TEC10"})

(def EUR-EONIA
  {:db/ident :fibo-ind-ir-cm/EUR-EONIA,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-ind-ir-mdp/EuropeanMoneyMarketsInstituteBenchmarkPublisher,
   :fibo-fnd-utl-av/abbreviation "EUR-EONIA",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR-EONIA"})

(def EUR-EONIA-Average
  {:db/ident :fibo-ind-ir-cm/EUR-EONIA-Average,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-ind-ir-mdp/EuropeanMoneyMarketsInstituteBenchmarkPublisher,
   :fibo-fnd-utl-av/abbreviation "EUR-EONIA-Average",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR-EONIA-Average"})

(def EUR-EONIA-OIS-10_00-BGCANTOR
  {:db/ident :fibo-ind-ir-cm/EUR-EONIA-OIS-10_00-BGCANTOR,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-ind-ir-mdp/EuropeanMoneyMarketsInstituteBenchmarkPublisher,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/FenicsMarketData,
   :fibo-fnd-utl-av/abbreviation "EUR-EONIA-OIS-10:00-BGCANTOR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR-EONIA-OIS-10:00-BGCANTOR"})

(def EUR-EONIA-OIS-10_00-ICAP
  {:db/ident :fibo-ind-ir-cm/EUR-EONIA-OIS-10_00-ICAP,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-ind-ir-mdp/EuropeanMoneyMarketsInstituteBenchmarkPublisher,
   :fibo-fnd-utl-av/abbreviation "EUR-EONIA-OIS-10:00-ICAP",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR-EONIA-OIS-10:00-ICAP"})

(def EUR-EONIA-OIS-10_00-TRADITION
  {:db/ident :fibo-ind-ir-cm/EUR-EONIA-OIS-10_00-TRADITION,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-ind-ir-mdp/EuropeanMoneyMarketsInstituteBenchmarkPublisher,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/Tradition,
   :fibo-fnd-utl-av/abbreviation "EUR-EONIA-OIS-10:00-TRADITION",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR-EONIA-OIS-10:00-TRADITION"})

(def EUR-EONIA-OIS-11_00-ICAP
  {:db/ident :fibo-ind-ir-cm/EUR-EONIA-OIS-11_00-ICAP,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-ind-ir-mdp/EuropeanMoneyMarketsInstituteBenchmarkPublisher,
   :fibo-fnd-utl-av/abbreviation "EUR-EONIA-OIS-11:00-ICAP",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR-EONIA-OIS-11:00-ICAP"})

(def EUR-EONIA-OIS-4_15-TRADITION
  {:db/ident :fibo-ind-ir-cm/EUR-EONIA-OIS-4_15-TRADITION,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-ind-ir-mdp/EuropeanMoneyMarketsInstituteBenchmarkPublisher,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/Tradition,
   :fibo-fnd-utl-av/abbreviation "EUR-EONIA-OIS-4:15-TRADITION",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR-EONIA-OIS-4:15-TRADITION"})

(def EUR-EONIA-OIS_Compound
  {:db/ident :fibo-ind-ir-cm/EUR-EONIA-OIS_Compound,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-ind-ir-mdp/EuropeanMoneyMarketsInstituteBenchmarkPublisher,
   :fibo-fnd-utl-av/abbreviation "EUR-EONIA-OIS Compound",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR-EONIA-OIS Compound"})

(def EUR-EONIA-Swap-Index
  {:db/ident :fibo-ind-ir-cm/EUR-EONIA-Swap-Index,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-ind-ir-mdp/EuropeanMoneyMarketsInstituteBenchmarkPublisher,
   :fibo-fnd-utl-av/abbreviation "EUR-EONIA-Swap-Index",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR-EONIA-Swap-Index"})

(def EUR-EURIBOR
  {:db/ident :fibo-ind-ir-cm/EUR-EURIBOR,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-ind-ir-mdp/EuropeanMoneyMarketsInstituteBenchmarkPublisher,
   :fibo-fnd-utl-av/abbreviation "EUR-EURIBOR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR-EURIBOR"})

(def EUR-EURIBOR-Act_365
  {:db/ident :fibo-ind-ir-cm/EUR-EURIBOR-Act_365,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-ind-ir-mdp/EuropeanMoneyMarketsInstituteBenchmarkPublisher,
   :fibo-fnd-utl-av/abbreviation "EUR-EURIBOR-Act/365",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR-EURIBOR-Act/365"})

(def EUR-EURIBOR-Act_365-Bloomberg
  {:db/ident :fibo-ind-ir-cm/EUR-EURIBOR-Act_365-Bloomberg,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-ind-ir-mdp/EuropeanMoneyMarketsInstituteBenchmarkPublisher,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/BloombergLP,
   :fibo-fnd-utl-av/abbreviation "EUR-EURIBOR-Act/365-Bloomberg",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR-EURIBOR-Act/365-Bloomberg"})

(def EUR-EURIBOR-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/EUR-EURIBOR-Reference_Banks,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-ind-ir-mdp/EuropeanMoneyMarketsInstituteBenchmarkPublisher,
   :fibo-fnd-utl-av/abbreviation "EUR-EURIBOR-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR-EURIBOR-Reference Banks"})

(def EUR-EURIBOR-Telerate
  {:db/ident :fibo-ind-ir-cm/EUR-EURIBOR-Telerate,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-ind-ir-mdp/EuropeanMoneyMarketsInstituteBenchmarkPublisher,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/ThomsonReuters,
   :fibo-fnd-utl-av/abbreviation "EUR-EURIBOR-Telerate",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR-EURIBOR-Telerate"})

(def EUR-EURIBOR_ICE_Swap_Rate-11_00
  {:db/ident :fibo-ind-ir-cm/EUR-EURIBOR_ICE_Swap_Rate-11_00,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-ind-ir-mdp/EuropeanMoneyMarketsInstituteBenchmarkPublisher,
   :fibo-fnd-utl-av/abbreviation "EUR-EURIBOR ICE Swap Rate-11:00",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR-EURIBOR ICE Swap Rate-11:00"})

(def EUR-EURIBOR_ICE_Swap_Rate-12_00
  {:db/ident :fibo-ind-ir-cm/EUR-EURIBOR_ICE_Swap_Rate-12_00,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-ind-ir-mdp/EuropeanMoneyMarketsInstituteBenchmarkPublisher,
   :fibo-fnd-utl-av/abbreviation "EUR-EURIBOR ICE Swap Rate-12:00",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR-EURIBOR ICE Swap Rate-12:00"})

(def EUR-EURONIA-OIS_Compound
  {:db/ident :fibo-ind-ir-cm/EUR-EURONIA-OIS_Compound,
   :fibo-fnd-utl-av/abbreviation "EUR-EURONIA-OIS Compound",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR-EURONIA-OIS Compound"})

(def EUR-EuroSTR
  {:db/ident :fibo-ind-ir-cm/EUR-EuroSTR,
   :fibo-fnd-utl-av/abbreviation "EUR-EuroSTR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR-EuroSTR"})

(def EUR-EuroSTR-OIS_Compound
  {:db/ident :fibo-ind-ir-cm/EUR-EuroSTR-OIS_Compound,
   :fibo-fnd-utl-av/abbreviation "EUR-EuroSTR-OIS Compound",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR-EuroSTR-OIS Compound"})

(def EUR-EuroSTR_Average_12M
  {:db/ident :fibo-ind-ir-cm/EUR-EuroSTR_Average_12M,
   :fibo-fnd-utl-av/abbreviation "EUR-EuroSTR Average 12M",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR-EuroSTR Average 12M"})

(def EUR-EuroSTR_Average_1M
  {:db/ident :fibo-ind-ir-cm/EUR-EuroSTR_Average_1M,
   :fibo-fnd-utl-av/abbreviation "EUR-EuroSTR Average 1M",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR-EuroSTR Average 1M"})

(def EUR-EuroSTR_Average_1W
  {:db/ident :fibo-ind-ir-cm/EUR-EuroSTR_Average_1W,
   :fibo-fnd-utl-av/abbreviation "EUR-EuroSTR Average 1W",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR-EuroSTR Average 1W"})

(def EUR-EuroSTR_Average_3M
  {:db/ident :fibo-ind-ir-cm/EUR-EuroSTR_Average_3M,
   :fibo-fnd-utl-av/abbreviation "EUR-EuroSTR Average 3M",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR-EuroSTR Average 3M"})

(def EUR-EuroSTR_Average_6M
  {:db/ident :fibo-ind-ir-cm/EUR-EuroSTR_Average_6M,
   :fibo-fnd-utl-av/abbreviation "EUR-EuroSTR Average 6M",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR-EuroSTR Average 6M"})

(def EUR-EuroSTR_Compounded_Index
  {:db/ident :fibo-ind-ir-cm/EUR-EuroSTR_Compounded_Index,
   :fibo-fnd-utl-av/abbreviation "EUR-EuroSTR Compounded Index",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR-EuroSTR Compounded Index"})

(def EUR-ISDA-LIBOR_Swap_Rate-10_00
  {:db/ident :fibo-ind-ir-cm/EUR-ISDA-LIBOR_Swap_Rate-10_00,
   :fibo-fnd-utl-av/abbreviation "EUR-ISDA-LIBOR Swap Rate-10:00",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR-ISDA-LIBOR Swap Rate-10:00"})

(def EUR-ISDA-LIBOR_Swap_Rate-11_00
  {:db/ident :fibo-ind-ir-cm/EUR-ISDA-LIBOR_Swap_Rate-11_00,
   :fibo-fnd-utl-av/abbreviation "EUR-ISDA-LIBOR Swap Rate-11:00",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR-ISDA-LIBOR Swap Rate-11:00"})

(def EUR-LIBOR
  {:db/ident :fibo-ind-ir-cm/EUR-LIBOR,
   :fibo-fnd-utl-av/abbreviation "EUR-LIBOR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR-LIBOR"})

(def EUR-LIBOR-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/EUR-LIBOR-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "EUR-LIBOR-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR-LIBOR-Reference Banks"})

(def EUR-TAM-CDC
  {:db/ident :fibo-ind-ir-cm/EUR-TAM-CDC,
   :fibo-fnd-utl-av/abbreviation "EUR-TAM-CDC",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR-TAM-CDC"})

(def EUR-TEC10-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/EUR-TEC10-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "EUR-TEC10-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR-TEC10-Reference Banks"})

(def EUR-TEC5-CNO
  {:db/ident :fibo-ind-ir-cm/EUR-TEC5-CNO,
   :fibo-fnd-utl-av/abbreviation "EUR-TEC5-CNO",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR-TEC5-CNO"})

(def EUR-TEC5-CNO-SwapMarker
  {:db/ident :fibo-ind-ir-cm/EUR-TEC5-CNO-SwapMarker,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/SwapMarker,
   :fibo-fnd-utl-av/abbreviation "EUR-TEC5-CNO-SwapMarker",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR-TEC5-CNO-SwapMarker"})

(def EUR-TEC5-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/EUR-TEC5-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "EUR-TEC5-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR-TEC5-Reference Banks"})

(def EUR-TMM-CDC-COMPOUND
  {:db/ident :fibo-ind-ir-cm/EUR-TMM-CDC-COMPOUND,
   :fibo-fnd-utl-av/abbreviation "EUR-TMM-CDC-COMPOUND",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR-TMM-CDC-COMPOUND"})

(def EUR_Basis_Swap-EONIA_vs_3m_EUR_IBOR_Swap_Rates-A_360-10_00-ICAP
  {:db/ident
   :fibo-ind-ir-cm/EUR_Basis_Swap-EONIA_vs_3m_EUR_IBOR_Swap_Rates-A_360-10_00-ICAP,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-ind-ir-mdp/EuropeanMoneyMarketsInstituteBenchmarkPublisher,
   :fibo-fnd-utl-av/abbreviation
   "EUR Basis Swap-EONIA vs 3m EUR+IBOR Swap Rates-A/360-10:00-ICAP",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label
   "EUR Basis Swap-EONIA vs 3m EUR+IBOR Swap Rates-A/360-10:00-ICAP"})

(def EUR_EURIBOR-Annual_Bond_Swap_vs_1m-11_00-ICAP
  {:db/ident :fibo-ind-ir-cm/EUR_EURIBOR-Annual_Bond_Swap_vs_1m-11_00-ICAP,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-ind-ir-mdp/EuropeanMoneyMarketsInstituteBenchmarkPublisher,
   :fibo-fnd-utl-av/abbreviation
   "EUR EURIBOR-Annual Bond Swap vs 1m-11:00-ICAP",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR EURIBOR-Annual Bond Swap vs 1m-11:00-ICAP"})

(def EUR_EURIBOR-Basis_Swap-1m_vs_3m-Euribor-11_00-ICAP
  {:db/ident :fibo-ind-ir-cm/EUR_EURIBOR-Basis_Swap-1m_vs_3m-Euribor-11_00-ICAP,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-ind-ir-mdp/EuropeanMoneyMarketsInstituteBenchmarkPublisher,
   :fibo-fnd-utl-av/abbreviation
   "EUR EURIBOR-Basis Swap-1m vs 3m-Euribor-11:00-ICAP",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR EURIBOR-Basis Swap-1m vs 3m-Euribor-11:00-ICAP"})

(def EUR_EURIBOR-Basis_Swap-3m_vs_6m-11_00-ICAP
  {:db/ident :fibo-ind-ir-cm/EUR_EURIBOR-Basis_Swap-3m_vs_6m-11_00-ICAP,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-ind-ir-mdp/EuropeanMoneyMarketsInstituteBenchmarkPublisher,
   :fibo-fnd-utl-av/abbreviation "EUR EURIBOR-Basis Swap-3m vs 6m-11:00-ICAP",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR EURIBOR-Basis Swap-3m vs 6m-11:00-ICAP"})

(def EUR_USD-Basis_Swaps-11_00-ICAP
  {:db/ident :fibo-ind-ir-cm/EUR_USD-Basis_Swaps-11_00-ICAP,
   :fibo-fnd-utl-av/abbreviation "EUR USD-Basis Swaps-11:00-ICAP",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "EUR USD-Basis Swaps-11:00-ICAP"})

(def GBP-6M_LIBOR_SWAP-CME_vs_LCH-ICAP
  {:db/ident :fibo-ind-ir-cm/GBP-6M_LIBOR_SWAP-CME_vs_LCH-ICAP,
   :fibo-fnd-utl-av/abbreviation "GBP-6M LIBOR SWAP-CME vs LCH-ICAP",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "GBP-6M LIBOR SWAP-CME vs LCH-ICAP"})

(def GBP-6M_LIBOR_SWAP-CME_vs_LCH-ICAP-Bloomberg
  {:db/ident :fibo-ind-ir-cm/GBP-6M_LIBOR_SWAP-CME_vs_LCH-ICAP-Bloomberg,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/BloombergLP,
   :fibo-fnd-utl-av/abbreviation "GBP-6M LIBOR SWAP-CME vs LCH-ICAP-Bloomberg",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "GBP-6M LIBOR SWAP-CME vs LCH-ICAP-Bloomberg"})

(def GBP-6M_LIBOR_SWAP-EUREX_vs_LCH-ICAP
  {:db/ident :fibo-ind-ir-cm/GBP-6M_LIBOR_SWAP-EUREX_vs_LCH-ICAP,
   :fibo-fnd-utl-av/abbreviation "GBP-6M LIBOR SWAP-EUREX vs LCH-ICAP",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "GBP-6M LIBOR SWAP-EUREX vs LCH-ICAP"})

(def GBP-6M_LIBOR_SWAP-EUREX_vs_LCH-ICAP-Bloomberg
  {:db/ident :fibo-ind-ir-cm/GBP-6M_LIBOR_SWAP-EUREX_vs_LCH-ICAP-Bloomberg,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/BloombergLP,
   :fibo-fnd-utl-av/abbreviation
   "GBP-6M LIBOR SWAP-EUREX vs LCH-ICAP-Bloomberg",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "GBP-6M LIBOR SWAP-EUREX vs LCH-ICAP-Bloomberg"})

(def GBP-LIBOR
  {:db/ident :fibo-ind-ir-cm/GBP-LIBOR,
   :fibo-fnd-utl-av/abbreviation "GBP-LIBOR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "GBP-LIBOR"})

(def GBP-LIBOR-ISDA
  {:db/ident :fibo-ind-ir-cm/GBP-LIBOR-ISDA,
   :fibo-fnd-utl-av/abbreviation "GBP-LIBOR-ISDA",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "GBP-LIBOR-ISDA"})

(def GBP-LIBOR-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/GBP-LIBOR-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "GBP-LIBOR-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "GBP-LIBOR-Reference Banks"})

(def GBP-LIBOR_ICE_Swap_Rate
  {:db/ident :fibo-ind-ir-cm/GBP-LIBOR_ICE_Swap_Rate,
   :fibo-fnd-utl-av/abbreviation "GBP-LIBOR ICE Swap Rate",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "GBP-LIBOR ICE Swap Rate"})

(def GBP-RONIA
  {:db/ident :fibo-ind-ir-cm/GBP-RONIA,
   :fibo-fnd-utl-av/abbreviation "GBP-RONIA",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "GBP-RONIA"})

(def GBP-RONIA-OIS_Compound
  {:db/ident :fibo-ind-ir-cm/GBP-RONIA-OIS_Compound,
   :fibo-fnd-utl-av/abbreviation "GBP-RONIA-OIS Compound",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "GBP-RONIA-OIS Compound"})

(def GBP-SONIA
  {:db/ident :fibo-ind-ir-cm/GBP-SONIA,
   :fibo-fnd-utl-av/abbreviation "GBP-SONIA",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "GBP-SONIA"})

(def GBP-SONIA-OIS-11_00-ICAP
  {:db/ident :fibo-ind-ir-cm/GBP-SONIA-OIS-11_00-ICAP,
   :fibo-fnd-utl-av/abbreviation "GBP-SONIA-OIS-11:00-ICAP",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "GBP-SONIA-OIS-11:00-ICAP"})

(def GBP-SONIA-OIS-11_00-TRADITION
  {:db/ident :fibo-ind-ir-cm/GBP-SONIA-OIS-11_00-TRADITION,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/Tradition,
   :fibo-fnd-utl-av/abbreviation "GBP-SONIA-OIS-11:00-TRADITION",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "GBP-SONIA-OIS-11:00-TRADITION"})

(def GBP-SONIA-OIS-4_15-TRADITION
  {:db/ident :fibo-ind-ir-cm/GBP-SONIA-OIS-4_15-TRADITION,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/Tradition,
   :fibo-fnd-utl-av/abbreviation "GBP-SONIA-OIS-4:15-TRADITION",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "GBP-SONIA-OIS-4:15-TRADITION"})

(def GBP-SONIA-OIS_Compound
  {:db/ident :fibo-ind-ir-cm/GBP-SONIA-OIS_Compound,
   :fibo-fnd-utl-av/abbreviation "GBP-SONIA-OIS Compound",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "GBP-SONIA-OIS Compound"})

(def GBP-SONIA_Compounded_Index
  {:db/ident :fibo-ind-ir-cm/GBP-SONIA_Compounded_Index,
   :fibo-fnd-utl-av/abbreviation "GBP-SONIA Compounded Index",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "GBP-SONIA Compounded Index"})

(def GBP-SONIA_ICE_Swap_Rate
  {:db/ident :fibo-ind-ir-cm/GBP-SONIA_ICE_Swap_Rate,
   :fibo-fnd-utl-av/abbreviation "GBP-SONIA ICE Swap Rate",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "GBP-SONIA ICE Swap Rate"})

(def GBP-SONIA_ICE_Term
  {:db/ident :fibo-ind-ir-cm/GBP-SONIA_ICE_Term,
   :fibo-fnd-utl-av/abbreviation "GBP-SONIA ICE Term",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "GBP-SONIA ICE Term"})

(def GBP-SONIA_Refinitiv_Term
  {:db/ident :fibo-ind-ir-cm/GBP-SONIA_Refinitiv_Term,
   :fibo-fnd-utl-av/abbreviation "GBP-SONIA Refinitiv Term",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "GBP-SONIA Refinitiv Term"})

(def GBP-Semi-Annual_Swap_Rate
  {:db/ident :fibo-ind-ir-cm/GBP-Semi-Annual_Swap_Rate,
   :fibo-fnd-utl-av/abbreviation "GBP-Semi-Annual Swap Rate",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "GBP-Semi-Annual Swap Rate"})

(def GBP-Semi-Annual_Swap_Rate-11_00-ICAP
  {:db/ident :fibo-ind-ir-cm/GBP-Semi-Annual_Swap_Rate-11_00-ICAP,
   :fibo-fnd-utl-av/abbreviation "GBP-Semi-Annual Swap Rate-11:00-ICAP",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "GBP-Semi-Annual Swap Rate-11:00-ICAP"})

(def GBP-Semi-Annual_Swap_Rate-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/GBP-Semi-Annual_Swap_Rate-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "GBP-Semi-Annual Swap Rate-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "GBP-Semi-Annual Swap Rate-Reference Banks"})

(def GBP-Semi-Annual_Swap_Rate-SwapMarker26
  {:db/ident :fibo-ind-ir-cm/GBP-Semi-Annual_Swap_Rate-SwapMarker26,
   :fibo-fnd-utl-av/abbreviation "GBP-Semi-Annual Swap Rate-SwapMarker26",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "GBP-Semi-Annual Swap Rate-SwapMarker26"})

(def GBP-Semi_Annual_Swap_Rate-11_00-TRADITION
  {:db/ident :fibo-ind-ir-cm/GBP-Semi_Annual_Swap_Rate-11_00-TRADITION,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/Tradition,
   :fibo-fnd-utl-av/abbreviation "GBP-Semi Annual Swap Rate-11:00-TRADITION",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "GBP-Semi Annual Swap Rate-11:00-TRADITION"})

(def GBP-Semi_Annual_Swap_Rate-4_15-TRADITION
  {:db/ident :fibo-ind-ir-cm/GBP-Semi_Annual_Swap_Rate-4_15-TRADITION,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/Tradition,
   :fibo-fnd-utl-av/abbreviation "GBP-Semi Annual Swap Rate-4:15-TRADITION",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "GBP-Semi Annual Swap Rate-4:15-TRADITION"})

(def GBP-UK_Base_Rate
  {:db/ident :fibo-ind-ir-cm/GBP-UK_Base_Rate,
   :fibo-fnd-utl-av/abbreviation "GBP-UK Base Rate",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "GBP-UK Base Rate"})

(def GBP_USD-Basis_Swaps-11_00-ICAP
  {:db/ident :fibo-ind-ir-cm/GBP_USD-Basis_Swaps-11_00-ICAP,
   :fibo-fnd-utl-av/abbreviation "GBP USD-Basis Swaps-11:00-ICAP",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "GBP USD-Basis Swaps-11:00-ICAP"})

(def GRD-ATHIBOR-ATHIBOR
  {:db/ident :fibo-ind-ir-cm/GRD-ATHIBOR-ATHIBOR,
   :fibo-fnd-utl-av/abbreviation "GRD-ATHIBOR-ATHIBOR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "GRD-ATHIBOR-ATHIBOR"})

(def GRD-ATHIBOR-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/GRD-ATHIBOR-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "GRD-ATHIBOR-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "GRD-ATHIBOR-Reference Banks"})

(def GRD-ATHIBOR-Telerate
  {:db/ident :fibo-ind-ir-cm/GRD-ATHIBOR-Telerate,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/ThomsonReuters,
   :fibo-fnd-utl-av/abbreviation "GRD-ATHIBOR-Telerate",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "GRD-ATHIBOR-Telerate"})

(def GRD-ATHIMID-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/GRD-ATHIMID-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "GRD-ATHIMID-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "GRD-ATHIMID-Reference Banks"})

(def GRD-ATHIMID-Reuters
  {:db/ident :fibo-ind-ir-cm/GRD-ATHIMID-Reuters,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/ThomsonReuters,
   :fibo-fnd-utl-av/abbreviation "GRD-ATHIMID-Reuters",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "GRD-ATHIMID-Reuters"})

(def HKD-HIBOR
  {:db/ident :fibo-ind-ir-cm/HKD-HIBOR,
   :fibo-fnd-utl-av/abbreviation "HKD-HIBOR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/HongKongDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "HKD-HIBOR"})

(def HKD-HIBOR-HIBOR-Bloomberg
  {:db/ident :fibo-ind-ir-cm/HKD-HIBOR-HIBOR-Bloomberg,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/BloombergLP,
   :fibo-fnd-utl-av/abbreviation "HKD-HIBOR-HIBOR-Bloomberg",
   :fibo-fnd-utl-av/explanatoryNote
   ["Deprecated usage: \"HKD-HIBOR-HIBOR-Bloomberg\" code has been deprecated in supplement 79 to the 2006 ISDA definitions (Removal of certain Hong Kong Rate Options.). The code is kept in FpML for backward compatibility purposes."
    "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."],
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/HongKongDollar,
   :owl/deprecated true,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "HKD-HIBOR-HIBOR-Bloomberg"})

(def HKD-HIBOR-HIBOR_
  {:db/ident :fibo-ind-ir-cm/HKD-HIBOR-HIBOR_,
   :fibo-fnd-utl-av/abbreviation "HKD-HIBOR-HIBOR=",
   :fibo-fnd-utl-av/explanatoryNote
   ["Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."
    "Deprecated usage: \"HKD-HIBOR-HIBOR=\" code has been deprecated in supplement 79 to the 2006 ISDA definitions (Removal of certain Hong Kong Rate Options.). The code is kept in FpML for backward compatibility purposes."],
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/HongKongDollar,
   :owl/deprecated true,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "HKD-HIBOR-HIBOR="})

(def HKD-HIBOR-ISDC
  {:db/ident :fibo-ind-ir-cm/HKD-HIBOR-ISDC,
   :fibo-fnd-utl-av/abbreviation "HKD-HIBOR-ISDC",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/HongKongDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "HKD-HIBOR-ISDC"})

(def HKD-HIBOR-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/HKD-HIBOR-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "HKD-HIBOR-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/HongKongDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "HKD-HIBOR-Reference Banks"})

(def HKD-HONIA
  {:db/ident :fibo-ind-ir-cm/HKD-HONIA,
   :fibo-fnd-utl-av/abbreviation "HKD-HONIA",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/HongKongDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "HKD-HONIA"})

(def HKD-HONIA-OIS_Compound
  {:db/ident :fibo-ind-ir-cm/HKD-HONIA-OIS_Compound,
   :fibo-fnd-utl-av/abbreviation "HKD-HONIA-OIS Compound",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/HongKongDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "HKD-HONIA-OIS Compound"})

(def HKD-ISDA-Swap_Rate-11_00
  {:db/ident :fibo-ind-ir-cm/HKD-ISDA-Swap_Rate-11_00,
   :fibo-fnd-utl-av/abbreviation "HKD-ISDA-Swap Rate-11:00",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/HongKongDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "HKD-ISDA-Swap Rate-11:00"})

(def HKD-ISDA-Swap_Rate-4_00
  {:db/ident :fibo-ind-ir-cm/HKD-ISDA-Swap_Rate-4_00,
   :fibo-fnd-utl-av/abbreviation "HKD-ISDA-Swap Rate-4:00",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/HongKongDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "HKD-ISDA-Swap Rate-4:00"})

(def HKD-Quarterly-Annual_Swap_Rate-11_00-BGCANTOR
  {:db/ident :fibo-ind-ir-cm/HKD-Quarterly-Annual_Swap_Rate-11_00-BGCANTOR,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/FenicsMarketData,
   :fibo-fnd-utl-av/abbreviation
   "HKD-Quarterly-Annual Swap Rate-11:00-BGCANTOR",
   :fibo-fnd-utl-av/explanatoryNote
   ["Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."
    "Deprecated usage: \"HKD-Quarterly-Annual Swap Rate-11:00-BGCANTOR\" code has been deprecated in supplement 79 to the 2006 ISDA definitions (Removal of certain Hong Kong Rate Options.). The code is kept in FpML for backward compatibility purposes."],
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/HongKongDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/ThreeMonths,
   :owl/deprecated true,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "HKD-Quarterly-Annual Swap Rate-11:00-BGCANTOR"})

(def HKD-Quarterly-Annual_Swap_Rate-11_00-TRADITION
  {:db/ident :fibo-ind-ir-cm/HKD-Quarterly-Annual_Swap_Rate-11_00-TRADITION,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/Tradition,
   :fibo-fnd-utl-av/abbreviation
   "HKD-Quarterly-Annual Swap Rate-11:00-TRADITION",
   :fibo-fnd-utl-av/explanatoryNote
   ["Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."
    "Deprecated usage: \"HKD-Quarterly-Annual Swap Rate-11:00-TRADITION\" code has been deprecated in supplement 79 to the 2006 ISDA definitions (Removal of certain Hong Kong Rate Options.). The code is kept in FpML for backward compatibility purposes."],
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/HongKongDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/ThreeMonths,
   :owl/deprecated true,
   :rdf/type [:owl/NamedIndividual :fibo-ind-ir-ir/InterestRateBenchmark],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "HKD-Quarterly-Annual Swap Rate-11:00-TRADITION"})

(def HKD-Quarterly-Annual_Swap_Rate-4_00-BGCANTOR
  {:db/ident :fibo-ind-ir-cm/HKD-Quarterly-Annual_Swap_Rate-4_00-BGCANTOR,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/FenicsMarketData,
   :fibo-fnd-utl-av/abbreviation "HKD-Quarterly-Annual Swap Rate-4:00-BGCANTOR",
   :fibo-fnd-utl-av/explanatoryNote
   ["Deprecated usage: \"HKD-Quarterly-Annual Swap Rate-4:00-BGCANTOR\" code has been deprecated in supplement 79 to the 2006 ISDA definitions (Removal of certain Hong Kong Rate Options.). The code is kept in FpML for backward compatibility purposes."
    "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."],
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/HongKongDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/ThreeMonths,
   :owl/deprecated true,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "HKD-Quarterly-Annual Swap Rate-4:00-BGCANTOR"})

(def HKD-Quarterly-Annual_Swap_Rate-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/HKD-Quarterly-Annual_Swap_Rate-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation
   "HKD-Quarterly-Annual Swap Rate-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   ["Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."
    "Deprecated usage: \"HKD-Quarterly-Annual Swap Rate-Reference Banks\" code has been deprecated in supplement 79 to the 2006 ISDA definitions (Removal of certain Hong Kong Rate Options.). The code is kept in FpML for backward compatibility purposes."],
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/HongKongDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/ThreeMonths,
   :owl/deprecated true,
   :rdf/type [:owl/NamedIndividual :fibo-ind-ir-ir/InterestRateBenchmark],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "HKD-Quarterly-Annual Swap Rate-Reference Banks"})

(def HKD-Quarterly-Quarterly_Swap_Rate-11_00-ICAP
  {:db/ident :fibo-ind-ir-cm/HKD-Quarterly-Quarterly_Swap_Rate-11_00-ICAP,
   :fibo-fnd-utl-av/abbreviation "HKD-Quarterly-Quarterly Swap Rate-11:00-ICAP",
   :fibo-fnd-utl-av/explanatoryNote
   ["Deprecated usage: \"HKD-Quarterly-Quarterly Swap Rate-11:00-ICAP\" code has been deprecated in supplement 79 to the 2006 ISDA definitions (Removal of certain Hong Kong Rate Options.). The code is kept in FpML for backward compatibility purposes."
    "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."],
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/HongKongDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/ThreeMonths,
   :owl/deprecated true,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "HKD-Quarterly-Quarterly Swap Rate-11:00-ICAP"})

(def HKD-Quarterly-Quarterly_Swap_Rate-4_00-ICAP
  {:db/ident :fibo-ind-ir-cm/HKD-Quarterly-Quarterly_Swap_Rate-4_00-ICAP,
   :fibo-fnd-utl-av/abbreviation "HKD-Quarterly-Quarterly Swap Rate-4:00-ICAP",
   :fibo-fnd-utl-av/explanatoryNote
   ["Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."
    "Deprecated usage: \"HKD-Quarterly-Quarterly Swap Rate-4:00-ICAP\" code has been deprecated in supplement 79 to the 2006 ISDA definitions (Removal of certain Hong Kong Rate Options.). The code is kept in FpML for backward compatibility purposes."],
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/HongKongDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/ThreeMonths,
   :owl/deprecated true,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "HKD-Quarterly-Quarterly Swap Rate-4:00-ICAP"})

(def HKD-Quarterly-Quarterly_Swap_Rate-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/HKD-Quarterly-Quarterly_Swap_Rate-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation
   "HKD-Quarterly-Quarterly Swap Rate-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   ["Deprecated usage: \"HKD-Quarterly-Quarterly Swap Rate-Reference Banks\" code has been deprecated in supplement 79 to the 2006 ISDA definitions (Removal of certain Hong Kong Rate Options.). The code is kept in FpML for backward compatibility purposes."
    "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."],
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/HongKongDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/ThreeMonths,
   :owl/deprecated true,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "HKD-Quarterly-Quarterly Swap Rate-Reference Banks"})

(def HUF-BUBOR
  {:db/ident :fibo-ind-ir-cm/HUF-BUBOR,
   :fibo-fnd-utl-av/abbreviation "HUF-BUBOR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Forint,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "HUF-BUBOR"})

(def HUF-BUBOR-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/HUF-BUBOR-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "HUF-BUBOR-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Forint,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "HUF-BUBOR-Reference Banks"})

(def HUF-HUFONIA
  {:db/ident :fibo-ind-ir-cm/HUF-HUFONIA,
   :fibo-fnd-utl-av/abbreviation "HUF-HUFONIA",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Forint,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "HUF-HUFONIA"})

(def IDR-IDMA-Bloomberg
  {:db/ident :fibo-ind-ir-cm/IDR-IDMA-Bloomberg,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/BloombergLP,
   :fibo-fnd-utl-av/abbreviation "IDR-IDMA-Bloomberg",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Rupiah,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "IDR-IDMA-Bloomberg"})

(def IDR-IDRFIX
  {:db/ident :fibo-ind-ir-cm/IDR-IDRFIX,
   :fibo-fnd-utl-av/abbreviation "IDR-IDRFIX",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Rupiah,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "IDR-IDRFIX"})

(def IDR-JIBOR
  {:db/ident :fibo-ind-ir-cm/IDR-JIBOR,
   :fibo-fnd-utl-av/abbreviation "IDR-JIBOR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Rupiah,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "IDR-JIBOR"})

(def IDR-SBI-Reuters
  {:db/ident :fibo-ind-ir-cm/IDR-SBI-Reuters,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/ThomsonReuters,
   :fibo-fnd-utl-av/abbreviation "IDR-SBI-Reuters",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Rupiah,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "IDR-SBI-Reuters"})

(def IDR-SOR-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/IDR-SOR-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "IDR-SOR-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Rupiah,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "IDR-SOR-Reference Banks"})

(def IDR-SOR-Reuters
  {:db/ident :fibo-ind-ir-cm/IDR-SOR-Reuters,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/ThomsonReuters,
   :fibo-fnd-utl-av/abbreviation "IDR-SOR-Reuters",
   :fibo-fnd-utl-av/explanatoryNote
   ["Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."
    "Deprecated usage: \"IDR-SOR-Reuters\" code has been deprecated in supplement 35 to the 2006 ISDA definitions. The code is kept in FpML for backward compatibility purposes."],
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Rupiah,
   :owl/deprecated true,
   :rdf/type [:owl/NamedIndividual :fibo-ind-ir-ir/InterestRateBenchmark],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "IDR-SOR-Reuters"})

(def IDR-SOR-Telerate
  {:db/ident :fibo-ind-ir-cm/IDR-SOR-Telerate,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/ThomsonReuters,
   :fibo-fnd-utl-av/abbreviation "IDR-SOR-Telerate",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Rupiah,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "IDR-SOR-Telerate"})

(def IDR-Semi-Annual_Swap_Rate-11_00-BGCANTOR
  {:db/ident :fibo-ind-ir-cm/IDR-Semi-Annual_Swap_Rate-11_00-BGCANTOR,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/FenicsMarketData,
   :fibo-fnd-utl-av/abbreviation "IDR-Semi-Annual Swap Rate-11:00-BGCANTOR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Rupiah,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "IDR-Semi-Annual Swap Rate-11:00-BGCANTOR"})

(def IDR-Semi-Annual_Swap_Rate-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/IDR-Semi-Annual_Swap_Rate-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "IDR-Semi-Annual Swap Rate-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Rupiah,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "IDR-Semi-Annual Swap Rate-Reference Banks"})

(def IDR-Semi_Annual_Swap_Rate-Non-deliverable-16_00-Tullett_Prebon
  {:db/ident
   :fibo-ind-ir-cm/IDR-Semi_Annual_Swap_Rate-Non-deliverable-16_00-Tullett_Prebon,
   :fibo-fnd-utl-av/abbreviation
   "IDR-Semi Annual Swap Rate-Non-deliverable-16:00-Tullett Prebon",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Rupiah,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label
   "IDR-Semi Annual Swap Rate-Non-deliverable-16:00-Tullett Prebon"})

(def ILS-TELBOR
  {:db/ident :fibo-ind-ir-cm/ILS-TELBOR,
   :fibo-fnd-utl-av/abbreviation "ILS-TELBOR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/NewIsraeliSheqel,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "ILS-TELBOR"})

(def ILS-TELBOR-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/ILS-TELBOR-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "ILS-TELBOR-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/NewIsraeliSheqel,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "ILS-TELBOR-Reference Banks"})

(def INR-BMK
  {:db/ident :fibo-ind-ir-cm/INR-BMK,
   :fibo-fnd-utl-av/abbreviation "INR-BMK",
   :fibo-fnd-utl-av/explanatoryNote
   ["Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."
    "Deprecated usage: \"INR-BMK\" code has been deprecated in supplement 54 to the 2006 ISDA definitions. The code is kept in FpML for backward compatibility purposes."],
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/IndianRupee,
   :owl/deprecated true,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "INR-BMK"})

(def INR-CMT
  {:db/ident :fibo-ind-ir-cm/INR-CMT,
   :fibo-fnd-utl-av/abbreviation "INR-CMT",
   :fibo-fnd-utl-av/explanatoryNote
   ["Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."
    "Deprecated usage: \"INR-CMT\" code has been deprecated in supplement 54 to the 2006 ISDA definitions. The code is kept in FpML for backward compatibility purposes."],
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/IndianRupee,
   :owl/deprecated true,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "INR-CMT"})

(def INR-INBMK-REUTERS
  {:db/ident :fibo-ind-ir-cm/INR-INBMK-REUTERS,
   :fibo-fnd-utl-av/abbreviation "INR-INBMK-REUTERS",
   :fibo-fnd-utl-av/explanatoryNote
   ["Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."
    "Deprecated usage: \"INR-INBMK-REUTERS\" code has been deprecated in supplement 54 to the 2006 ISDA definitions. The code is kept in FpML for backward compatibility purposes."],
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/IndianRupee,
   :owl/deprecated true,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "INR-INBMK-REUTERS"})

(def INR-MIBOR-OIS-COMPOUND
  {:db/ident :fibo-ind-ir-cm/INR-MIBOR-OIS-COMPOUND,
   :fibo-fnd-utl-av/abbreviation "INR-MIBOR-OIS-COMPOUND",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/IndianRupee,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "INR-MIBOR-OIS-COMPOUND"})

(def INR-MIBOR-OIS_Compound
  {:db/ident :fibo-ind-ir-cm/INR-MIBOR-OIS_Compound,
   :fibo-fnd-utl-av/abbreviation "INR-MIBOR-OIS Compound",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/IndianRupee,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "INR-MIBOR-OIS Compound"})

(def INR-MIBOR_OIS
  {:db/ident :fibo-ind-ir-cm/INR-MIBOR_OIS,
   :fibo-fnd-utl-av/abbreviation "INR-MIBOR OIS",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/IndianRupee,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "INR-MIBOR OIS"})

(def INR-MIFOR
  {:db/ident :fibo-ind-ir-cm/INR-MIFOR,
   :fibo-fnd-utl-av/abbreviation "INR-MIFOR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/IndianRupee,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "INR-MIFOR"})

(def INR-MITOR-OIS-COMPOUND
  {:db/ident :fibo-ind-ir-cm/INR-MITOR-OIS-COMPOUND,
   :fibo-fnd-utl-av/abbreviation "INR-MITOR-OIS-COMPOUND",
   :fibo-fnd-utl-av/explanatoryNote
   ["Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."
    "Deprecated usage: \"INR-MITOR-OIS-COMPOUND\" code has been deprecated in supplement 54 to the 2006 ISDA definitions. The code is kept in FpML for backward compatibility purposes."],
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/IndianRupee,
   :owl/deprecated true,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "INR-MITOR-OIS-COMPOUND"})

(def INR-Modified_MIFOR
  {:db/ident :fibo-ind-ir-cm/INR-Modified_MIFOR,
   :fibo-fnd-utl-av/abbreviation "INR-Modified MIFOR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/IndianRupee,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "INR-Modified MIFOR"})

(def INR-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/INR-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "INR-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/IndianRupee,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "INR-Reference Banks"})

(def INR-Semi-Annual_Swap_Rate-11_30-BGCANTOR
  {:db/ident :fibo-ind-ir-cm/INR-Semi-Annual_Swap_Rate-11_30-BGCANTOR,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/FenicsMarketData,
   :fibo-fnd-utl-av/abbreviation "INR-Semi-Annual Swap Rate-11:30-BGCANTOR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/IndianRupee,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "INR-Semi-Annual Swap Rate-11:30-BGCANTOR"})

(def INR-Semi-Annual_Swap_Rate-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/INR-Semi-Annual_Swap_Rate-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "INR-Semi-Annual Swap Rate-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/IndianRupee,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "INR-Semi-Annual Swap Rate-Reference Banks"})

(def INR-Semi_Annual_Swap_Rate-Non-deliverable-16_00-Tullett_Prebon
  {:db/ident
   :fibo-ind-ir-cm/INR-Semi_Annual_Swap_Rate-Non-deliverable-16_00-Tullett_Prebon,
   :fibo-fnd-utl-av/abbreviation
   "INR-Semi Annual Swap Rate-Non-deliverable-16:00-Tullett Prebon",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/IndianRupee,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label
   "INR-Semi Annual Swap Rate-Non-deliverable-16:00-Tullett Prebon"})

(def ISK-REIBOR
  {:db/ident :fibo-ind-ir-cm/ISK-REIBOR,
   :fibo-fnd-utl-av/abbreviation "ISK-REIBOR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/IcelandKrona,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "ISK-REIBOR"})

(def ISK-REIBOR-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/ISK-REIBOR-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "ISK-REIBOR-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/IcelandKrona,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "ISK-REIBOR-Reference Banks"})

(def JPY-Annual_Swap_Rate-11_00-TRADITION
  {:db/ident :fibo-ind-ir-cm/JPY-Annual_Swap_Rate-11_00-TRADITION,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/Tradition,
   :fibo-fnd-utl-av/abbreviation "JPY-Annual Swap Rate-11:00-TRADITION",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "JPY-Annual Swap Rate-11:00-TRADITION"})

(def JPY-Annual_Swap_Rate-3_00-TRADITION
  {:db/ident :fibo-ind-ir-cm/JPY-Annual_Swap_Rate-3_00-TRADITION,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/Tradition,
   :fibo-fnd-utl-av/abbreviation "JPY-Annual Swap Rate-3:00-TRADITION",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "JPY-Annual Swap Rate-3:00-TRADITION"})

(def JPY-BBSF-Bloomberg-10_00
  {:db/ident :fibo-ind-ir-cm/JPY-BBSF-Bloomberg-10_00,
   :fibo-fnd-utl-av/abbreviation "JPY-BBSF-Bloomberg-10:00",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "JPY-BBSF-Bloomberg-10:00"})

(def JPY-BBSF-Bloomberg-15_00
  {:db/ident :fibo-ind-ir-cm/JPY-BBSF-Bloomberg-15_00,
   :fibo-fnd-utl-av/abbreviation "JPY-BBSF-Bloomberg-15:00",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "JPY-BBSF-Bloomberg-15:00"})

(def JPY-Euroyen_TIBOR
  {:db/ident :fibo-ind-ir-cm/JPY-Euroyen_TIBOR,
   :fibo-fnd-utl-av/abbreviation "JPY-Euroyen TIBOR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "JPY-Euroyen TIBOR"})

(def JPY-ISDA-Swap_Rate-10_00
  {:db/ident :fibo-ind-ir-cm/JPY-ISDA-Swap_Rate-10_00,
   :fibo-fnd-utl-av/abbreviation "JPY-ISDA-Swap Rate-10:00",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "JPY-ISDA-Swap Rate-10:00"})

(def JPY-ISDA-Swap_Rate-15_00
  {:db/ident :fibo-ind-ir-cm/JPY-ISDA-Swap_Rate-15_00,
   :fibo-fnd-utl-av/abbreviation "JPY-ISDA-Swap Rate-15:00",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "JPY-ISDA-Swap Rate-15:00"})

(def JPY-LIBOR
  {:db/ident :fibo-ind-ir-cm/JPY-LIBOR,
   :fibo-fnd-utl-av/abbreviation "JPY-LIBOR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "JPY-LIBOR"})

(def JPY-LIBOR-ISDA
  {:db/ident :fibo-ind-ir-cm/JPY-LIBOR-ISDA,
   :fibo-fnd-utl-av/abbreviation "JPY-LIBOR-ISDA",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "JPY-LIBOR-ISDA"})

(def JPY-LIBOR-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/JPY-LIBOR-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "JPY-LIBOR-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "JPY-LIBOR-Reference Banks"})

(def JPY-LIBOR_TSR-10_00
  {:db/ident :fibo-ind-ir-cm/JPY-LIBOR_TSR-10_00,
   :fibo-fnd-utl-av/abbreviation "JPY-LIBOR TSR-10:00",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "JPY-LIBOR TSR-10:00"})

(def JPY-LIBOR_TSR-15_00
  {:db/ident :fibo-ind-ir-cm/JPY-LIBOR_TSR-15_00,
   :fibo-fnd-utl-av/abbreviation "JPY-LIBOR TSR-15:00",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "JPY-LIBOR TSR-15:00"})

(def JPY-LTPR-TBC
  {:db/ident :fibo-ind-ir-cm/JPY-LTPR-TBC,
   :fibo-fnd-utl-av/abbreviation "JPY-LTPR-TBC",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "JPY-LTPR-TBC"})

(def JPY-LTPR_MHBK
  {:db/ident :fibo-ind-ir-cm/JPY-LTPR_MHBK,
   :fibo-fnd-utl-av/abbreviation "JPY-LTPR MHBK",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "JPY-LTPR MHBK"})

(def JPY-MUTANCALL-TONAR
  {:db/ident :fibo-ind-ir-cm/JPY-MUTANCALL-TONAR,
   :fibo-fnd-utl-av/abbreviation "JPY-MUTANCALL-TONAR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "JPY-MUTANCALL-TONAR"})

(def JPY-OIS-11_00-ICAP
  {:db/ident :fibo-ind-ir-cm/JPY-OIS-11_00-ICAP,
   :fibo-fnd-utl-av/abbreviation "JPY-OIS-11:00-ICAP",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "JPY-OIS-11:00-ICAP"})

(def JPY-OIS-11_00-TRADITION
  {:db/ident :fibo-ind-ir-cm/JPY-OIS-11_00-TRADITION,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/Tradition,
   :fibo-fnd-utl-av/abbreviation "JPY-OIS-11:00-TRADITION",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "JPY-OIS-11:00-TRADITION"})

(def JPY-OIS-3_00-TRADITION
  {:db/ident :fibo-ind-ir-cm/JPY-OIS-3_00-TRADITION,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/Tradition,
   :fibo-fnd-utl-av/abbreviation "JPY-OIS-3:00-TRADITION",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "JPY-OIS-3:00-TRADITION"})

(def JPY-Quoting_Banks-LIBOR
  {:db/ident :fibo-ind-ir-cm/JPY-Quoting_Banks-LIBOR,
   :fibo-fnd-utl-av/abbreviation "JPY-Quoting Banks-LIBOR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "JPY-Quoting Banks-LIBOR"})

(def JPY-STPR-Quoting_Banks
  {:db/ident :fibo-ind-ir-cm/JPY-STPR-Quoting_Banks,
   :fibo-fnd-utl-av/abbreviation "JPY-STPR-Quoting Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "JPY-STPR-Quoting Banks"})

(def JPY-TIBOR
  {:db/ident :fibo-ind-ir-cm/JPY-TIBOR,
   :fibo-fnd-utl-av/abbreviation "JPY-TIBOR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "JPY-TIBOR"})

(def JPY-TIBOR-17096
  {:db/ident :fibo-ind-ir-cm/JPY-TIBOR-17096,
   :fibo-fnd-utl-av/abbreviation "JPY-TIBOR-17096",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "JPY-TIBOR-17096"})

(def JPY-TIBOR-DTIBOR01
  {:db/ident :fibo-ind-ir-cm/JPY-TIBOR-DTIBOR01,
   :fibo-fnd-utl-av/abbreviation "JPY-TIBOR-DTIBOR01",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "JPY-TIBOR-DTIBOR01"})

(def JPY-TIBOR-TIBM
  {:db/ident :fibo-ind-ir-cm/JPY-TIBOR-TIBM,
   :fibo-fnd-utl-av/abbreviation "JPY-TIBOR-TIBM",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "JPY-TIBOR-TIBM"})

(def JPY-TIBOR-TIBM-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/JPY-TIBOR-TIBM-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "JPY-TIBOR-TIBM-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "JPY-TIBOR-TIBM-Reference Banks"})

(def JPY-TIBOR-TIBM_10_Banks
  {:db/ident :fibo-ind-ir-cm/JPY-TIBOR-TIBM_10_Banks,
   :fibo-fnd-utl-av/abbreviation "JPY-TIBOR-TIBM (10 Banks)",
   :fibo-fnd-utl-av/explanatoryNote
   ["Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."
    "Deprecated usage: \"JPY-TIBOR-TIBM (10 Banks)\" code has been deprecated in supplement 47 to the 2006 ISDA definitions. The code is kept in FpML for backward compatibility purposes."],
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :owl/deprecated true,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "JPY-TIBOR-TIBM (10 Banks)"})

(def JPY-TIBOR-TIBM_5_Banks
  {:db/ident :fibo-ind-ir-cm/JPY-TIBOR-TIBM_5_Banks,
   :fibo-fnd-utl-av/abbreviation "JPY-TIBOR-TIBM (5 Banks)",
   :fibo-fnd-utl-av/explanatoryNote
   ["Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."
    "Deprecated usage: \"JPY-TIBOR-TIBM (5 Banks)\" code has been deprecated in supplement 47 to the 2006 ISDA definitions. The code is kept in FpML for backward compatibility purposes."],
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :owl/deprecated true,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "JPY-TIBOR-TIBM (5 Banks)"})

(def JPY-TIBOR-TIBM_All_Banks
  {:db/ident :fibo-ind-ir-cm/JPY-TIBOR-TIBM_All_Banks,
   :fibo-fnd-utl-av/abbreviation "JPY-TIBOR-TIBM (All Banks)",
   :fibo-fnd-utl-av/explanatoryNote
   ["Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."
    "Deprecated usage: \"JPY-TIBOR-TIBM (All Banks)\" code has been deprecated in supplement 47 to the 2006 ISDA definitions. The code is kept in FpML for backward compatibility purposes."],
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :owl/deprecated true,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "JPY-TIBOR-TIBM (All Banks)"})

(def JPY-TONA
  {:db/ident :fibo-ind-ir-cm/JPY-TONA,
   :fibo-fnd-utl-av/abbreviation "JPY-TONA",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "JPY-TONA"})

(def JPY-TONA-OIS_Compound
  {:db/ident :fibo-ind-ir-cm/JPY-TONA-OIS_Compound,
   :fibo-fnd-utl-av/abbreviation "JPY-TONA-OIS Compound",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "JPY-TONA-OIS Compound"})

(def JPY-TONA_Average_180D
  {:db/ident :fibo-ind-ir-cm/JPY-TONA_Average_180D,
   :fibo-fnd-utl-av/abbreviation "JPY-TONA Average 180D",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "JPY-TONA Average 180D"})

(def JPY-TONA_Average_30D
  {:db/ident :fibo-ind-ir-cm/JPY-TONA_Average_30D,
   :fibo-fnd-utl-av/abbreviation "JPY-TONA Average 30D",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "JPY-TONA Average 30D"})

(def JPY-TONA_Average_90D
  {:db/ident :fibo-ind-ir-cm/JPY-TONA_Average_90D,
   :fibo-fnd-utl-av/abbreviation "JPY-TONA Average 90D",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "JPY-TONA Average 90D"})

(def JPY-TONA_Compounded_Index
  {:db/ident :fibo-ind-ir-cm/JPY-TONA_Compounded_Index,
   :fibo-fnd-utl-av/abbreviation "JPY-TONA Compounded Index",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "JPY-TONA Compounded Index"})

(def JPY-TONA_TSR-10_00
  {:db/ident :fibo-ind-ir-cm/JPY-TONA_TSR-10_00,
   :fibo-fnd-utl-av/abbreviation "JPY-TONA TSR-10:00",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "JPY-TONA TSR-10:00"})

(def JPY-TONA_TSR-15_00
  {:db/ident :fibo-ind-ir-cm/JPY-TONA_TSR-15_00,
   :fibo-fnd-utl-av/abbreviation "JPY-TONA TSR-15:00",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "JPY-TONA TSR-15:00"})

(def JPY-TORF_QUICK
  {:db/ident :fibo-ind-ir-cm/JPY-TORF_QUICK,
   :fibo-fnd-utl-av/abbreviation "JPY-TORF QUICK",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "JPY-TORF QUICK"})

(def JPY-TSR-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/JPY-TSR-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "JPY-TSR-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "JPY-TSR-Reference Banks"})

(def JPY-TSR-Telerate-10_00
  {:db/ident :fibo-ind-ir-cm/JPY-TSR-Telerate-10_00,
   :fibo-fnd-utl-av/abbreviation "JPY-TSR-Telerate-10:00",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "JPY-TSR-Telerate-10:00"})

(def JPY-TSR-Telerate-15_00
  {:db/ident :fibo-ind-ir-cm/JPY-TSR-Telerate-15_00,
   :fibo-fnd-utl-av/abbreviation "JPY-TSR-Telerate-15:00",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "JPY-TSR-Telerate-15:00"})

(def JPY_USD-Basis_Swaps-11_00-ICAP
  {:db/ident :fibo-ind-ir-cm/JPY_USD-Basis_Swaps-11_00-ICAP,
   :fibo-fnd-utl-av/abbreviation "JPY USD-Basis Swaps-11:00-ICAP",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "JPY USD-Basis Swaps-11:00-ICAP"})

(def KRW-Bond-3222
  {:db/ident :fibo-ind-ir-cm/KRW-Bond-3222,
   :fibo-fnd-utl-av/abbreviation "KRW-Bond-3222",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Won,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "KRW-Bond-3222"})

(def KRW-CD_91D
  {:db/ident :fibo-ind-ir-cm/KRW-CD_91D,
   :fibo-fnd-utl-av/abbreviation "KRW-CD 91D",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Won,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "KRW-CD 91D"})

(def KRW-Quarterly_Annual_Swap_Rate-3_30-ICAP
  {:db/ident :fibo-ind-ir-cm/KRW-Quarterly_Annual_Swap_Rate-3_30-ICAP,
   :fibo-fnd-utl-av/abbreviation "KRW-Quarterly Annual Swap Rate-3:30-ICAP",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Won,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/ThreeMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "KRW-Quarterly Annual Swap Rate-3:30-ICAP"})

(def MXN-TIIE
  {:db/ident :fibo-ind-ir-cm/MXN-TIIE,
   :fibo-fnd-utl-av/abbreviation "MXN-TIIE",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/MexicanPeso,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "MXN-TIIE"})

(def MXN-TIIE-Banxico-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/MXN-TIIE-Banxico-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "MXN-TIIE-Banxico-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   ["Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."
    "Deprecated usage: MXN-TIIE-Banxico-Reference Banks. It was added to FpML in error, MXN-TIIE-Reference Banks should be used instead."],
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/MexicanPeso,
   :owl/deprecated true,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "MXN-TIIE-Banxico-Reference Banks"})

(def MXN-TIIE-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/MXN-TIIE-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "MXN-TIIE-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/MexicanPeso,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "MXN-TIIE-Reference Banks"})

(def MYR-KLIBOR
  {:db/ident :fibo-ind-ir-cm/MYR-KLIBOR,
   :fibo-fnd-utl-av/abbreviation "MYR-KLIBOR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/MalaysianRinggit,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "MYR-KLIBOR"})

(def MYR-KLIBOR-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/MYR-KLIBOR-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "MYR-KLIBOR-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/MalaysianRinggit,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "MYR-KLIBOR-Reference Banks"})

(def MYR-Quarterly_Swap_Rate-11_00-TRADITION
  {:db/ident :fibo-ind-ir-cm/MYR-Quarterly_Swap_Rate-11_00-TRADITION,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/Tradition,
   :fibo-fnd-utl-av/abbreviation "MYR-Quarterly Swap Rate-11:00-TRADITION",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/MalaysianRinggit,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/ThreeMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "MYR-Quarterly Swap Rate-11:00-TRADITION"})

(def MYR-Quarterly_Swap_Rate-TRADITION-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/MYR-Quarterly_Swap_Rate-TRADITION-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation
   "MYR-Quarterly Swap Rate-TRADITION-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/MalaysianRinggit,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/ThreeMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "MYR-Quarterly Swap Rate-TRADITION-Reference Banks"})

(def NOK-NIBOR
  {:db/ident :fibo-ind-ir-cm/NOK-NIBOR,
   :fibo-fnd-utl-av/abbreviation "NOK-NIBOR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/NorwegianKrone,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "NOK-NIBOR"})

(def NOK-NIBOR-NIBR
  {:db/ident :fibo-ind-ir-cm/NOK-NIBOR-NIBR,
   :fibo-fnd-utl-av/abbreviation "NOK-NIBOR-NIBR",
   :fibo-fnd-utl-av/explanatoryNote
   ["Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."
    "Deprecated usage: \"NOK-NIBOR-NIBR\" code has been deprecated in supplement 49 to the 2006 ISDA definitions. The code is kept in FpML for backward compatibility purposes."],
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/NorwegianKrone,
   :owl/deprecated true,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "NOK-NIBOR-NIBR"})

(def NOK-NIBOR-NIBR-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/NOK-NIBOR-NIBR-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "NOK-NIBOR-NIBR-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   ["Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."
    "Deprecated usage: NOK-NIBOR-NIBR-Reference Banks. It was added to FpML in error, NOK-NIBOR-Reference Banks should be used instead."],
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/NorwegianKrone,
   :owl/deprecated true,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "NOK-NIBOR-NIBR-Reference Banks"})

(def NOK-NIBOR-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/NOK-NIBOR-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "NOK-NIBOR-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/NorwegianKrone,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "NOK-NIBOR-Reference Banks"})

(def NOK-NOWA
  {:db/ident :fibo-ind-ir-cm/NOK-NOWA,
   :fibo-fnd-utl-av/abbreviation "NOK-NOWA",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/NorwegianKrone,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "NOK-NOWA"})

(def NOK-NOWA-OIS_Compound
  {:db/ident :fibo-ind-ir-cm/NOK-NOWA-OIS_Compound,
   :fibo-fnd-utl-av/abbreviation "NOK-NOWA-OIS Compound",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/NorwegianKrone,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "NOK-NOWA-OIS Compound"})

(def NZD-BBR-ISDC
  {:db/ident :fibo-ind-ir-cm/NZD-BBR-ISDC,
   :fibo-fnd-utl-av/abbreviation "NZD-BBR-ISDC",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/NewZealandDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "NZD-BBR-ISDC"})

(def NZD-BBR-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/NZD-BBR-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "NZD-BBR-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/NewZealandDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "NZD-BBR-Reference Banks"})

(def NZD-BBR-Telerate
  {:db/ident :fibo-ind-ir-cm/NZD-BBR-Telerate,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/ThomsonReuters,
   :fibo-fnd-utl-av/abbreviation "NZD-BBR-Telerate",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/NewZealandDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "NZD-BBR-Telerate"})

(def NZD-BKBM_Bid
  {:db/ident :fibo-ind-ir-cm/NZD-BKBM_Bid,
   :fibo-fnd-utl-av/abbreviation "NZD-BKBM Bid",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/NewZealandDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "NZD-BKBM Bid"})

(def NZD-BKBM_FRA
  {:db/ident :fibo-ind-ir-cm/NZD-BKBM_FRA,
   :fibo-fnd-utl-av/abbreviation "NZD-BKBM FRA",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/NewZealandDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "NZD-BKBM FRA"})

(def NZD-BKBM_FRA_Swap_Rate_ICAP
  {:db/ident :fibo-ind-ir-cm/NZD-BKBM_FRA_Swap_Rate_ICAP,
   :fibo-fnd-utl-av/abbreviation "NZD-BKBM FRA Swap Rate ICAP",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/NewZealandDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "NZD-BKBM FRA Swap Rate ICAP"})

(def NZD-NZIONA
  {:db/ident :fibo-ind-ir-cm/NZD-NZIONA,
   :fibo-fnd-utl-av/abbreviation "NZD-NZIONA",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/NewZealandDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "NZD-NZIONA"})

(def NZD-NZIONA-OIS_Compound
  {:db/ident :fibo-ind-ir-cm/NZD-NZIONA-OIS_Compound,
   :fibo-fnd-utl-av/abbreviation "NZD-NZIONA-OIS Compound",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/NewZealandDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "NZD-NZIONA-OIS Compound"})

(def NZD-Semi-Annual_Swap_Rate-11_00-BGCANTOR
  {:db/ident :fibo-ind-ir-cm/NZD-Semi-Annual_Swap_Rate-11_00-BGCANTOR,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/FenicsMarketData,
   :fibo-fnd-utl-av/abbreviation "NZD-Semi-Annual Swap Rate-11:00-BGCANTOR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/NewZealandDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "NZD-Semi-Annual Swap Rate-11:00-BGCANTOR"})

(def NZD-Semi-Annual_Swap_Rate-BGCANTOR-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/NZD-Semi-Annual_Swap_Rate-BGCANTOR-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation
   "NZD-Semi-Annual Swap Rate-BGCANTOR-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/NewZealandDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "NZD-Semi-Annual Swap Rate-BGCANTOR-Reference Banks"})

(def NZD-Swap_Rate-ICAP-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/NZD-Swap_Rate-ICAP-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "NZD-Swap Rate-ICAP-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/NewZealandDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "NZD-Swap Rate-ICAP-Reference Banks"})

(def PHP-PHIREF
  {:db/ident :fibo-ind-ir-cm/PHP-PHIREF,
   :fibo-fnd-utl-av/abbreviation "PHP-PHIREF",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PhilippinePeso,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "PHP-PHIREF"})

(def PHP-PHIREF-BAP
  {:db/ident :fibo-ind-ir-cm/PHP-PHIREF-BAP,
   :fibo-fnd-utl-av/abbreviation "PHP-PHIREF-BAP",
   :fibo-fnd-utl-av/explanatoryNote
   ["Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."
    "Deprecated usage: \"PHP-PHIREF-BAP\" code has been deprecated in supplement 45 to the 2006 ISDA definitions. The code is kept in FpML for backward compatibility purposes."],
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PhilippinePeso,
   :owl/deprecated true,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "PHP-PHIREF-BAP"})

(def PHP-PHIREF-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/PHP-PHIREF-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "PHP-PHIREF-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PhilippinePeso,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "PHP-PHIREF-Reference Banks"})

(def PHP-Semi-Annual_Swap_Rate-11_00-BGCANTOR
  {:db/ident :fibo-ind-ir-cm/PHP-Semi-Annual_Swap_Rate-11_00-BGCANTOR,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/FenicsMarketData,
   :fibo-fnd-utl-av/abbreviation "PHP-Semi-Annual Swap Rate-11:00-BGCANTOR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PhilippinePeso,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "PHP-Semi-Annual Swap Rate-11:00-BGCANTOR"})

(def PHP-Semi-Annual_Swap_Rate-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/PHP-Semi-Annual_Swap_Rate-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "PHP-Semi-Annual Swap Rate-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PhilippinePeso,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "PHP-Semi-Annual Swap Rate-Reference Banks"})

(def PLN-POLONIA
  {:db/ident :fibo-ind-ir-cm/PLN-POLONIA,
   :fibo-fnd-utl-av/abbreviation "PLN-POLONIA",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Zloty,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "PLN-POLONIA"})

(def PLN-POLONIA-OIS_Compound
  {:db/ident :fibo-ind-ir-cm/PLN-POLONIA-OIS_Compound,
   :fibo-fnd-utl-av/abbreviation "PLN-POLONIA-OIS Compound",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Zloty,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "PLN-POLONIA-OIS Compound"})

(def PLN-WIBID
  {:db/ident :fibo-ind-ir-cm/PLN-WIBID,
   :fibo-fnd-utl-av/abbreviation "PLN-WIBID",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Zloty,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "PLN-WIBID"})

(def PLN-WIBOR
  {:db/ident :fibo-ind-ir-cm/PLN-WIBOR,
   :fibo-fnd-utl-av/abbreviation "PLN-WIBOR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Zloty,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "PLN-WIBOR"})

(def PLN-WIBOR-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/PLN-WIBOR-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "PLN-WIBOR-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Zloty,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "PLN-WIBOR-Reference Banks"})

(def PLZ-WIBOR-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/PLZ-WIBOR-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "PLZ-WIBOR-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Zloty,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "PLZ-WIBOR-Reference Banks"})

(def PLZ-WIBOR-WIBO
  {:db/ident :fibo-ind-ir-cm/PLZ-WIBOR-WIBO,
   :fibo-fnd-utl-av/abbreviation "PLZ-WIBOR-WIBO",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Zloty,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "PLZ-WIBOR-WIBO"})

(def REPOFUNDS_RATE-FRANCE-OIS-COMPOUND
  {:db/ident :fibo-ind-ir-cm/REPOFUNDS_RATE-FRANCE-OIS-COMPOUND,
   :fibo-fnd-utl-av/abbreviation "REPOFUNDS RATE-FRANCE-OIS-COMPOUND",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "REPOFUNDS RATE-FRANCE-OIS-COMPOUND"})

(def REPOFUNDS_RATE-GERMANY-OIS-COMPOUND
  {:db/ident :fibo-ind-ir-cm/REPOFUNDS_RATE-GERMANY-OIS-COMPOUND,
   :fibo-fnd-utl-av/abbreviation "REPOFUNDS RATE-GERMANY-OIS-COMPOUND",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "REPOFUNDS RATE-GERMANY-OIS-COMPOUND"})

(def REPOFUNDS_RATE-ITALY-OIS-COMPOUND
  {:db/ident :fibo-ind-ir-cm/REPOFUNDS_RATE-ITALY-OIS-COMPOUND,
   :fibo-fnd-utl-av/abbreviation "REPOFUNDS RATE-ITALY-OIS-COMPOUND",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "REPOFUNDS RATE-ITALY-OIS-COMPOUND"})

(def RON-Annual_Swap_Rate-11_00-BGCANTOR
  {:db/ident :fibo-ind-ir-cm/RON-Annual_Swap_Rate-11_00-BGCANTOR,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/FenicsMarketData,
   :fibo-fnd-utl-av/abbreviation "RON-Annual Swap Rate-11:00-BGCANTOR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/RomanianLeu,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "RON-Annual Swap Rate-11:00-BGCANTOR"})

(def RON-Annual_Swap_Rate-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/RON-Annual_Swap_Rate-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "RON-Annual Swap Rate-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/RomanianLeu,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "RON-Annual Swap Rate-Reference Banks"})

(def RON-ROBID
  {:db/ident :fibo-ind-ir-cm/RON-ROBID,
   :fibo-fnd-utl-av/abbreviation "RON-ROBID",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/RomanianLeu,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "RON-ROBID"})

(def RON-ROBOR
  {:db/ident :fibo-ind-ir-cm/RON-ROBOR,
   :fibo-fnd-utl-av/abbreviation "RON-ROBOR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/RomanianLeu,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "RON-ROBOR"})

(def RUB-Annual_Swap_Rate-11_00-BGCANTOR
  {:db/ident :fibo-ind-ir-cm/RUB-Annual_Swap_Rate-11_00-BGCANTOR,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/FenicsMarketData,
   :fibo-fnd-utl-av/abbreviation "RUB-Annual Swap Rate-11:00-BGCANTOR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/RussianRuble,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "RUB-Annual Swap Rate-11:00-BGCANTOR"})

(def RUB-Annual_Swap_Rate-12_45-TRADITION
  {:db/ident :fibo-ind-ir-cm/RUB-Annual_Swap_Rate-12_45-TRADITION,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/Tradition,
   :fibo-fnd-utl-av/abbreviation "RUB-Annual Swap Rate-12:45-TRADITION",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/RussianRuble,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "RUB-Annual Swap Rate-12:45-TRADITION"})

(def RUB-Annual_Swap_Rate-4_15-TRADITION
  {:db/ident :fibo-ind-ir-cm/RUB-Annual_Swap_Rate-4_15-TRADITION,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/Tradition,
   :fibo-fnd-utl-av/abbreviation "RUB-Annual Swap Rate-4:15-TRADITION",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/RussianRuble,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "RUB-Annual Swap Rate-4:15-TRADITION"})

(def RUB-Annual_Swap_Rate-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/RUB-Annual_Swap_Rate-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "RUB-Annual Swap Rate-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/RussianRuble,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "RUB-Annual Swap Rate-Reference Banks"})

(def RUB-Annual_Swap_Rate-TRADITION-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/RUB-Annual_Swap_Rate-TRADITION-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation
   "RUB-Annual Swap Rate-TRADITION-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/RussianRuble,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "RUB-Annual Swap Rate-TRADITION-Reference Banks"})

(def RUB-Key_Rate_CBRF
  {:db/ident :fibo-ind-ir-cm/RUB-Key_Rate_CBRF,
   :fibo-fnd-utl-av/abbreviation "RUB-Key Rate CBRF",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/RussianRuble,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "RUB-Key Rate CBRF"})

(def RUB-MOSPRIME-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/RUB-MOSPRIME-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "RUB-MOSPRIME-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/RussianRuble,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "RUB-MOSPRIME-Reference Banks"})

(def RUB-MosPrime
  {:db/ident :fibo-ind-ir-cm/RUB-MosPrime,
   :fibo-fnd-utl-av/abbreviation "RUB-MosPrime",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/RussianRuble,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "RUB-MosPrime"})

(def RUB-RUONIA
  {:db/ident :fibo-ind-ir-cm/RUB-RUONIA,
   :fibo-fnd-utl-av/abbreviation "RUB-RUONIA",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/RussianRuble,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "RUB-RUONIA"})

(def RUB-RUONIA-OIS_Compound
  {:db/ident :fibo-ind-ir-cm/RUB-RUONIA-OIS_Compound,
   :fibo-fnd-utl-av/abbreviation "RUB-RUONIA-OIS Compound",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/RussianRuble,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "RUB-RUONIA-OIS Compound"})

(def SAR-SAIBOR
  {:db/ident :fibo-ind-ir-cm/SAR-SAIBOR,
   :fibo-fnd-utl-av/abbreviation "SAR-SAIBOR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SaudiRiyal,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "SAR-SAIBOR"})

(def SAR-SRIOR-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/SAR-SRIOR-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "SAR-SRIOR-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SaudiRiyal,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "SAR-SRIOR-Reference Banks"})

(def SEK-Annual_Swap_Rate
  {:db/ident :fibo-ind-ir-cm/SEK-Annual_Swap_Rate,
   :fibo-fnd-utl-av/abbreviation "SEK-Annual Swap Rate",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwedishKrona,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "SEK-Annual Swap Rate"})

(def SEK-Annual_Swap_Rate-SESWFI
  {:db/ident :fibo-ind-ir-cm/SEK-Annual_Swap_Rate-SESWFI,
   :fibo-fnd-utl-av/abbreviation "SEK-Annual Swap Rate-SESWFI",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwedishKrona,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "SEK-Annual Swap Rate-SESWFI"})

(def SEK-STIBOR
  {:db/ident :fibo-ind-ir-cm/SEK-STIBOR,
   :fibo-fnd-utl-av/abbreviation "SEK-STIBOR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwedishKrona,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "SEK-STIBOR"})

(def SEK-STIBOR-OIS_Compound
  {:db/ident :fibo-ind-ir-cm/SEK-STIBOR-OIS_Compound,
   :fibo-fnd-utl-av/abbreviation "SEK-STIBOR-OIS Compound",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwedishKrona,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "SEK-STIBOR-OIS Compound"})

(def SEK-STIBOR-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/SEK-STIBOR-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "SEK-STIBOR-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwedishKrona,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "SEK-STIBOR-Reference Banks"})

(def SGD-SIBOR
  {:db/ident :fibo-ind-ir-cm/SGD-SIBOR,
   :fibo-fnd-utl-av/abbreviation "SGD-SIBOR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SingaporeDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "SGD-SIBOR"})

(def SGD-SIBOR-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/SGD-SIBOR-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "SGD-SIBOR-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SingaporeDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "SGD-SIBOR-Reference Banks"})

(def SGD-SIBOR-Telerate
  {:db/ident :fibo-ind-ir-cm/SGD-SIBOR-Telerate,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/ThomsonReuters,
   :fibo-fnd-utl-av/abbreviation "SGD-SIBOR-Telerate",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SingaporeDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "SGD-SIBOR-Telerate"})

(def SGD-SONAR-OIS-COMPOUND
  {:db/ident :fibo-ind-ir-cm/SGD-SONAR-OIS-COMPOUND,
   :fibo-fnd-utl-av/abbreviation "SGD-SONAR-OIS-COMPOUND",
   :fibo-fnd-utl-av/explanatoryNote
   ["Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."
    "Deprecated usage: \"SGD-SONAR-OIS-COMPOUND\" code has been deprecated in supplement 35 to the 2006 ISDA definitions. The code is kept in FpML for backward compatibility purposes."],
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SingaporeDollar,
   :owl/deprecated true,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "SGD-SONAR-OIS-COMPOUND"})

(def SGD-SOR
  {:db/ident :fibo-ind-ir-cm/SGD-SOR,
   :fibo-fnd-utl-av/abbreviation "SGD-SOR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SingaporeDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "SGD-SOR"})

(def SGD-SOR-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/SGD-SOR-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "SGD-SOR-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   ["Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."
    "Deprecated usage: \"SGD-SOR-Reference Banks\" code has been deprecated in supplement 35 to the 2006 ISDA definitions. The code is kept in FpML for backward compatibility purposes."],
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SingaporeDollar,
   :owl/deprecated true,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "SGD-SOR-Reference Banks"})

(def SGD-SOR-Telerate
  {:db/ident :fibo-ind-ir-cm/SGD-SOR-Telerate,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/ThomsonReuters,
   :fibo-fnd-utl-av/abbreviation "SGD-SOR-Telerate",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SingaporeDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "SGD-SOR-Telerate"})

(def SGD-SOR-VWAP-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/SGD-SOR-VWAP-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "SGD-SOR-VWAP-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SingaporeDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "SGD-SOR-VWAP-Reference Banks"})

(def SGD-SORA
  {:db/ident :fibo-ind-ir-cm/SGD-SORA,
   :fibo-fnd-utl-av/abbreviation "SGD-SORA",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SingaporeDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "SGD-SORA"})

(def SGD-SORA-OIS_Compound
  {:db/ident :fibo-ind-ir-cm/SGD-SORA-OIS_Compound,
   :fibo-fnd-utl-av/abbreviation "SGD-SORA-OIS Compound",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SingaporeDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "SGD-SORA-OIS Compound"})

(def SGD-Semi-Annual_Currency_Basis_Swap_Rate-11_00-Tullett_Prebon
  {:db/ident
   :fibo-ind-ir-cm/SGD-Semi-Annual_Currency_Basis_Swap_Rate-11_00-Tullett_Prebon,
   :fibo-fnd-utl-av/abbreviation
   "SGD-Semi-Annual Currency Basis Swap Rate-11:00-Tullett Prebon",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SingaporeDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "SGD-Semi-Annual Currency Basis Swap Rate-11:00-Tullett Prebon"})

(def SGD-Semi-Annual_Currency_Basis_Swap_Rate-16_00-Tullett_Prebon
  {:db/ident
   :fibo-ind-ir-cm/SGD-Semi-Annual_Currency_Basis_Swap_Rate-16_00-Tullett_Prebon,
   :fibo-fnd-utl-av/abbreviation
   "SGD-Semi-Annual Currency Basis Swap Rate-16:00-Tullett Prebon",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SingaporeDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "SGD-Semi-Annual Currency Basis Swap Rate-16:00-Tullett Prebon"})

(def SGD-Semi-Annual_Swap_Rate-11.00-TRADITION
  {:db/ident :fibo-ind-ir-cm/SGD-Semi-Annual_Swap_Rate-11.00-TRADITION,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/Tradition,
   :fibo-fnd-utl-av/abbreviation "SGD-Semi-Annual Swap Rate-11.00-TRADITION",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SingaporeDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "SGD-Semi-Annual Swap Rate-11.00-TRADITION"})

(def SGD-Semi-Annual_Swap_Rate-11_00-BGCANTOR
  {:db/ident :fibo-ind-ir-cm/SGD-Semi-Annual_Swap_Rate-11_00-BGCANTOR,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/FenicsMarketData,
   :fibo-fnd-utl-av/abbreviation "SGD-Semi-Annual Swap Rate-11:00-BGCANTOR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SingaporeDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "SGD-Semi-Annual Swap Rate-11:00-BGCANTOR"})

(def SGD-Semi-Annual_Swap_Rate-11_00-Tullett_Prebon
  {:db/ident :fibo-ind-ir-cm/SGD-Semi-Annual_Swap_Rate-11_00-Tullett_Prebon,
   :fibo-fnd-utl-av/abbreviation
   "SGD-Semi-Annual Swap Rate-11:00-Tullett Prebon",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SingaporeDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "SGD-Semi-Annual Swap Rate-11:00-Tullett Prebon"})

(def SGD-Semi-Annual_Swap_Rate-16_00-Tullett_Prebon
  {:db/ident :fibo-ind-ir-cm/SGD-Semi-Annual_Swap_Rate-16_00-Tullett_Prebon,
   :fibo-fnd-utl-av/abbreviation
   "SGD-Semi-Annual Swap Rate-16:00-Tullett Prebon",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SingaporeDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "SGD-Semi-Annual Swap Rate-16:00-Tullett Prebon"})

(def SGD-Semi-Annual_Swap_Rate-ICAP
  {:db/ident :fibo-ind-ir-cm/SGD-Semi-Annual_Swap_Rate-ICAP,
   :fibo-fnd-utl-av/abbreviation "SGD-Semi-Annual Swap Rate-ICAP",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SingaporeDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "SGD-Semi-Annual Swap Rate-ICAP"})

(def SGD-Semi-Annual_Swap_Rate-ICAP-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/SGD-Semi-Annual_Swap_Rate-ICAP-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation
   "SGD-Semi-Annual Swap Rate-ICAP-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SingaporeDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "SGD-Semi-Annual Swap Rate-ICAP-Reference Banks"})

(def SGD-Semi-Annual_Swap_Rate-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/SGD-Semi-Annual_Swap_Rate-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "SGD-Semi-Annual Swap Rate-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SingaporeDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "SGD-Semi-Annual Swap Rate-Reference Banks"})

(def SGD-Semi-Annual_Swap_Rate-TRADITION-Reference_Banks
  {:db/ident
   :fibo-ind-ir-cm/SGD-Semi-Annual_Swap_Rate-TRADITION-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation
   "SGD-Semi-Annual Swap Rate-TRADITION-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SingaporeDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "SGD-Semi-Annual Swap Rate-TRADITION-Reference Banks"})

(def SKK-BRIBOR-BRBO
  {:db/ident :fibo-ind-ir-cm/SKK-BRIBOR-BRBO,
   :fibo-fnd-utl-av/abbreviation "SKK-BRIBOR-BRBO",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "SKK-BRIBOR-BRBO"})

(def SKK-BRIBOR-Bloomberg
  {:db/ident :fibo-ind-ir-cm/SKK-BRIBOR-Bloomberg,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/BloombergLP,
   :fibo-fnd-utl-av/abbreviation "SKK-BRIBOR-Bloomberg",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "SKK-BRIBOR-Bloomberg"})

(def SKK-BRIBOR-NBSK07
  {:db/ident :fibo-ind-ir-cm/SKK-BRIBOR-NBSK07,
   :fibo-fnd-utl-av/abbreviation "SKK-BRIBOR-NBSK07",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "SKK-BRIBOR-NBSK07"})

(def SKK-BRIBOR-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/SKK-BRIBOR-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "SKK-BRIBOR-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "SKK-BRIBOR-Reference Banks"})

(def THB-SOR-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/THB-SOR-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "THB-SOR-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   ["Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."
    "Deprecated usage: \"THB-SOR-Reference Banks\" code has been deprecated in supplement 38 to the 2006 ISDA definitions. The code is kept in FpML for backward compatibility purposes."],
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Baht,
   :owl/deprecated true,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "THB-SOR-Reference Banks"})

(def THB-SOR-Reuters
  {:db/ident :fibo-ind-ir-cm/THB-SOR-Reuters,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/ThomsonReuters,
   :fibo-fnd-utl-av/abbreviation "THB-SOR-Reuters",
   :fibo-fnd-utl-av/explanatoryNote
   ["Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."
    "Deprecated usage: \"THB-SOR-Reuters\" code has been deprecated in supplement 35 to the 2006 ISDA definitions. The code is kept in FpML for backward compatibility purposes."],
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Baht,
   :owl/deprecated true,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "THB-SOR-Reuters"})

(def THB-SOR-Telerate
  {:db/ident :fibo-ind-ir-cm/THB-SOR-Telerate,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/ThomsonReuters,
   :fibo-fnd-utl-av/abbreviation "THB-SOR-Telerate",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Baht,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "THB-SOR-Telerate"})

(def THB-Semi-Annual_Swap_Rate-11_00-BGCANTOR
  {:db/ident :fibo-ind-ir-cm/THB-Semi-Annual_Swap_Rate-11_00-BGCANTOR,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/FenicsMarketData,
   :fibo-fnd-utl-av/abbreviation "THB-Semi-Annual Swap Rate-11:00-BGCANTOR",
   :fibo-fnd-utl-av/explanatoryNote
   ["Deprecated usage: the code has been deprecated in supplement 38 to the 2006 ISDA definitions. The code is kept in FpML for backward compatibility purposes."
    "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."],
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Baht,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :owl/deprecated true,
   :rdf/type [:owl/NamedIndividual :fibo-ind-ir-ir/InterestRateBenchmark],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "THB-Semi-Annual Swap Rate-11:00-BGCANTOR"})

(def THB-Semi-Annual_Swap_Rate-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/THB-Semi-Annual_Swap_Rate-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "THB-Semi-Annual Swap Rate-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   ["Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."
    "Deprecated usage: the code has been deprecated in supplement 38 to the 2006 ISDA definitions. The code is kept in FpML for backward compatibility purposes."],
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Baht,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :owl/deprecated true,
   :rdf/type [:owl/NamedIndividual :fibo-ind-ir-ir/InterestRateBenchmark],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "THB-Semi-Annual Swap Rate-Reference Banks"})

(def THB-THBFIX
  {:db/ident :fibo-ind-ir-cm/THB-THBFIX,
   :fibo-fnd-utl-av/abbreviation "THB-THBFIX",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Baht,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "THB-THBFIX"})

(def THB-THBFIX-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/THB-THBFIX-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "THB-THBFIX-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Baht,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "THB-THBFIX-Reference Banks"})

(def THB-THOR
  {:db/ident :fibo-ind-ir-cm/THB-THOR,
   :fibo-fnd-utl-av/abbreviation "THB-THOR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Baht,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "THB-THOR"})

(def THB-THOR-OIS_Compound
  {:db/ident :fibo-ind-ir-cm/THB-THOR-OIS_Compound,
   :fibo-fnd-utl-av/abbreviation "THB-THOR-OIS Compound",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Baht,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "THB-THOR-OIS Compound"})

(def TRY-Annual_Swap_Rate-11_15-BGCANTOR
  {:db/ident :fibo-ind-ir-cm/TRY-Annual_Swap_Rate-11_15-BGCANTOR,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/FenicsMarketData,
   :fibo-fnd-utl-av/abbreviation "TRY-Annual Swap Rate-11:15-BGCANTOR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/TurkishLira,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "TRY-Annual Swap Rate-11:15-BGCANTOR"})

(def TRY-Annual_Swap_Rate-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/TRY-Annual_Swap_Rate-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "TRY-Annual Swap Rate-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/TurkishLira,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "TRY-Annual Swap Rate-Reference Banks"})

(def TRY-Semi-Annual_Swap_Rate-TRADITION-Reference_Banks
  {:db/ident
   :fibo-ind-ir-cm/TRY-Semi-Annual_Swap_Rate-TRADITION-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation
   "TRY-Semi-Annual Swap Rate-TRADITION-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/TurkishLira,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "TRY-Semi-Annual Swap Rate-TRADITION-Reference Banks"})

(def TRY-TLREF-OIS_Compound
  {:db/ident :fibo-ind-ir-cm/TRY-TLREF-OIS_Compound,
   :fibo-fnd-utl-av/abbreviation "TRY-TLREF-OIS Compound",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/TurkishLira,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "TRY-TLREF-OIS Compound"})

(def TRY-TRLIBOR
  {:db/ident :fibo-ind-ir-cm/TRY-TRLIBOR,
   :fibo-fnd-utl-av/abbreviation "TRY-TRLIBOR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/TurkishLira,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "TRY-TRLIBOR"})

(def TRY-TRYIBOR-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/TRY-TRYIBOR-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "TRY-TRYIBOR-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/TurkishLira,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "TRY-TRYIBOR-Reference Banks"})

(def TRY_Annual_Swap_Rate-11_00-TRADITION
  {:db/ident :fibo-ind-ir-cm/TRY_Annual_Swap_Rate-11_00-TRADITION,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/Tradition,
   :fibo-fnd-utl-av/abbreviation "TRY Annual Swap Rate-11:00-TRADITION",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/TurkishLira,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "TRY Annual Swap Rate-11:00-TRADITION"})

(def TWD-Quarterly-Annual_Swap_Rate-11_00-BGCANTOR
  {:db/ident :fibo-ind-ir-cm/TWD-Quarterly-Annual_Swap_Rate-11_00-BGCANTOR,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/FenicsMarketData,
   :fibo-fnd-utl-av/abbreviation
   "TWD-Quarterly-Annual Swap Rate-11:00-BGCANTOR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/NewTaiwanDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/ThreeMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "TWD-Quarterly-Annual Swap Rate-11:00-BGCANTOR"})

(def TWD-Quarterly-Annual_Swap_Rate-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/TWD-Quarterly-Annual_Swap_Rate-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation
   "TWD-Quarterly-Annual Swap Rate-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/NewTaiwanDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/ThreeMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "TWD-Quarterly-Annual Swap Rate-Reference Banks"})

(def TWD-Reference_Dealers
  {:db/ident :fibo-ind-ir-cm/TWD-Reference_Dealers,
   :fibo-fnd-utl-av/abbreviation "TWD-Reference Dealers",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/NewTaiwanDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "TWD-Reference Dealers"})

(def TWD-Reuters-6165
  {:db/ident :fibo-ind-ir-cm/TWD-Reuters-6165,
   :fibo-fnd-utl-av/abbreviation "TWD-Reuters-6165",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/NewTaiwanDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "TWD-Reuters-6165"})

(def TWD-TAIBIR01
  {:db/ident :fibo-ind-ir-cm/TWD-TAIBIR01,
   :fibo-fnd-utl-av/abbreviation "TWD-TAIBIR01",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/NewTaiwanDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "TWD-TAIBIR01"})

(def TWD-TAIBIR02
  {:db/ident :fibo-ind-ir-cm/TWD-TAIBIR02,
   :fibo-fnd-utl-av/abbreviation "TWD-TAIBIR02",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/NewTaiwanDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "TWD-TAIBIR02"})

(def TWD-TAIBOR
  {:db/ident :fibo-ind-ir-cm/TWD-TAIBOR,
   :fibo-fnd-utl-av/abbreviation "TWD-TAIBOR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/NewTaiwanDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "TWD-TAIBOR"})

(def TWD-TWCPBA
  {:db/ident :fibo-ind-ir-cm/TWD-TWCPBA,
   :fibo-fnd-utl-av/abbreviation "TWD-TWCPBA",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/NewTaiwanDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "TWD-TWCPBA"})

(def TWD-Telerate-6165
  {:db/ident :fibo-ind-ir-cm/TWD-Telerate-6165,
   :fibo-fnd-utl-av/abbreviation "TWD-Telerate-6165",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/NewTaiwanDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "TWD-Telerate-6165"})

(def USD-3M_LIBOR_SWAP-CME_vs_LCH-ICAP
  {:db/ident :fibo-ind-ir-cm/USD-3M_LIBOR_SWAP-CME_vs_LCH-ICAP,
   :fibo-fnd-utl-av/abbreviation "USD-3M LIBOR SWAP-CME vs LCH-ICAP",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/ThreeMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-3M LIBOR SWAP-CME vs LCH-ICAP"})

(def USD-3M_LIBOR_SWAP-CME_vs_LCH-ICAP-Bloomberg
  {:db/ident :fibo-ind-ir-cm/USD-3M_LIBOR_SWAP-CME_vs_LCH-ICAP-Bloomberg,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/BloombergLP,
   :fibo-fnd-utl-av/abbreviation "USD-3M LIBOR SWAP-CME vs LCH-ICAP-Bloomberg",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/ThreeMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-3M LIBOR SWAP-CME vs LCH-ICAP-Bloomberg"})

(def USD-6M_LIBOR_SWAP-CME_vs_LCH-ICAP
  {:db/ident :fibo-ind-ir-cm/USD-6M_LIBOR_SWAP-CME_vs_LCH-ICAP,
   :fibo-fnd-utl-av/abbreviation "USD-6M LIBOR SWAP-CME vs LCH-ICAP",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-6M LIBOR SWAP-CME vs LCH-ICAP"})

(def USD-6M_LIBOR_SWAP-CME_vs_LCH-ICAP-Bloomberg
  {:db/ident :fibo-ind-ir-cm/USD-6M_LIBOR_SWAP-CME_vs_LCH-ICAP-Bloomberg,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/BloombergLP,
   :fibo-fnd-utl-av/abbreviation "USD-6M LIBOR SWAP-CME vs LCH-ICAP-Bloomberg",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-6M LIBOR SWAP-CME vs LCH-ICAP-Bloomberg"})

(def USD-AMERIBOR
  {:db/ident :fibo-ind-ir-cm/USD-AMERIBOR,
   :fibo-fnd-utl-av/abbreviation "USD-AMERIBOR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-AMERIBOR"})

(def USD-AMERIBOR_Average_30D
  {:db/ident :fibo-ind-ir-cm/USD-AMERIBOR_Average_30D,
   :fibo-fnd-utl-av/abbreviation "USD-AMERIBOR Average 30D",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-AMERIBOR Average 30D"})

(def USD-AMERIBOR_Average_90D
  {:db/ident :fibo-ind-ir-cm/USD-AMERIBOR_Average_90D,
   :fibo-fnd-utl-av/abbreviation "USD-AMERIBOR Average 90D",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-AMERIBOR Average 90D"})

(def USD-AMERIBOR_Term
  {:db/ident :fibo-ind-ir-cm/USD-AMERIBOR_Term,
   :fibo-fnd-utl-av/abbreviation "USD-AMERIBOR Term",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-AMERIBOR Term"})

(def USD-AMERIBOR_Term_Structure
  {:db/ident :fibo-ind-ir-cm/USD-AMERIBOR_Term_Structure,
   :fibo-fnd-utl-av/abbreviation "USD-AMERIBOR Term Structure",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-AMERIBOR Term Structure"})

(def USD-Annual_Swap_Rate-11_00-BGCANTOR
  {:db/ident :fibo-ind-ir-cm/USD-Annual_Swap_Rate-11_00-BGCANTOR,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/FenicsMarketData,
   :fibo-fnd-utl-av/abbreviation "USD-Annual Swap Rate-11:00-BGCANTOR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-Annual Swap Rate-11:00-BGCANTOR"})

(def USD-Annual_Swap_Rate-11_00-TRADITION
  {:db/ident :fibo-ind-ir-cm/USD-Annual_Swap_Rate-11_00-TRADITION,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/Tradition,
   :fibo-fnd-utl-av/abbreviation "USD-Annual Swap Rate-11:00-TRADITION",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-Annual Swap Rate-11:00-TRADITION"})

(def USD-Annual_Swap_Rate-4_00-TRADITION
  {:db/ident :fibo-ind-ir-cm/USD-Annual_Swap_Rate-4_00-TRADITION,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/Tradition,
   :fibo-fnd-utl-av/abbreviation "USD-Annual Swap Rate-4:00-TRADITION",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-Annual Swap Rate-4:00-TRADITION"})

(def USD-BA-H.15
  {:db/ident :fibo-ind-ir-cm/USD-BA-H.15,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-fbc-fct-usjrga/BoardOfGovernorsOfTheFederalReserveSystem,
   :fibo-fnd-utl-av/abbreviation "USD-BA-H.15",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-BA-H.15"})

(def USD-BA-Reference_Dealers
  {:db/ident :fibo-ind-ir-cm/USD-BA-Reference_Dealers,
   :fibo-fnd-utl-av/abbreviation "USD-BA-Reference Dealers",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-BA-Reference Dealers"})

(def USD-BMA_Municipal_Swap_Index
  {:db/ident :fibo-ind-ir-cm/USD-BMA_Municipal_Swap_Index,
   :fibo-fnd-utl-av/abbreviation "USD-BMA Municipal Swap Index",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-BMA Municipal Swap Index"})

(def USD-BSBY
  {:db/ident :fibo-ind-ir-cm/USD-BSBY,
   :fibo-fnd-utl-av/abbreviation "USD-BSBY",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-BSBY"})

(def USD-CD-H.15
  {:db/ident :fibo-ind-ir-cm/USD-CD-H.15,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-fbc-fct-usjrga/BoardOfGovernorsOfTheFederalReserveSystem,
   :fibo-fnd-utl-av/abbreviation "USD-CD-H.15",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-CD-H.15"})

(def USD-CD-Reference_Dealers
  {:db/ident :fibo-ind-ir-cm/USD-CD-Reference_Dealers,
   :fibo-fnd-utl-av/abbreviation "USD-CD-Reference Dealers",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-CD-Reference Dealers"})

(def USD-CMS-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/USD-CMS-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "USD-CMS-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-CMS-Reference Banks"})

(def USD-CMS-Reference_Banks-ICAP_SwapPX
  {:db/ident :fibo-ind-ir-cm/USD-CMS-Reference_Banks-ICAP_SwapPX,
   :fibo-fnd-utl-av/abbreviation "USD-CMS-Reference Banks-ICAP SwapPX",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-CMS-Reference Banks-ICAP SwapPX"})

(def USD-CMS-Reuters
  {:db/ident :fibo-ind-ir-cm/USD-CMS-Reuters,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/ThomsonReuters,
   :fibo-fnd-utl-av/abbreviation "USD-CMS-Reuters",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-CMS-Reuters"})

(def USD-CMS-Telerate
  {:db/ident :fibo-ind-ir-cm/USD-CMS-Telerate,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/ThomsonReuters,
   :fibo-fnd-utl-av/abbreviation "USD-CMS-Telerate",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-CMS-Telerate"})

(def USD-CMT
  {:db/ident :fibo-ind-ir-cm/USD-CMT,
   :fibo-fnd-utl-av/abbreviation "USD-CMT",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-CMT"})

(def USD-CMT_Average_1W
  {:db/ident :fibo-ind-ir-cm/USD-CMT_Average_1W,
   :fibo-fnd-utl-av/abbreviation "USD-CMT Average 1W",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-CMT Average 1W"})

(def USD-COF11-Telerate
  {:db/ident :fibo-ind-ir-cm/USD-COF11-Telerate,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/ThomsonReuters,
   :fibo-fnd-utl-av/abbreviation "USD-COF11-Telerate",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-COF11-Telerate"})

(def USD-COFI
  {:db/ident :fibo-ind-ir-cm/USD-COFI,
   :fibo-fnd-utl-av/abbreviation "USD-COFI",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-COFI"})

(def USD-CP-Money_Market_Yield
  {:db/ident :fibo-ind-ir-cm/USD-CP-Money_Market_Yield,
   :fibo-fnd-utl-av/abbreviation "USD-CP-Money Market Yield",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-CP-Money Market Yield"})

(def USD-CP-Reference_Dealers
  {:db/ident :fibo-ind-ir-cm/USD-CP-Reference_Dealers,
   :fibo-fnd-utl-av/abbreviation "USD-CP-Reference Dealers",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-CP-Reference Dealers"})

(def USD-CRITR
  {:db/ident :fibo-ind-ir-cm/USD-CRITR,
   :fibo-fnd-utl-av/abbreviation "USD-CRITR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-CRITR"})

(def USD-FFCB-DISCO
  {:db/ident :fibo-ind-ir-cm/USD-FFCB-DISCO,
   :fibo-fnd-utl-av/abbreviation "USD-FFCB-DISCO",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-FFCB-DISCO"})

(def USD-Federal_Funds
  {:db/ident :fibo-ind-ir-cm/USD-Federal_Funds,
   :fibo-fnd-utl-av/abbreviation "USD-Federal Funds",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-Federal Funds"})

(def USD-Federal_Funds-OIS_Compound
  {:db/ident :fibo-ind-ir-cm/USD-Federal_Funds-OIS_Compound,
   :fibo-fnd-utl-av/abbreviation "USD-Federal Funds-OIS Compound",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-Federal Funds-OIS Compound"})

(def USD-Federal_Funds-Reference_Dealers
  {:db/ident :fibo-ind-ir-cm/USD-Federal_Funds-Reference_Dealers,
   :fibo-fnd-utl-av/abbreviation "USD-Federal Funds-Reference Dealers",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-Federal Funds-Reference Dealers"})

(def USD-LIBOR
  {:db/ident :fibo-ind-ir-cm/USD-LIBOR,
   :fibo-fnd-utl-av/abbreviation "USD-LIBOR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-LIBOR"})

(def USD-LIBOR-ISDA
  {:db/ident :fibo-ind-ir-cm/USD-LIBOR-ISDA,
   :fibo-fnd-utl-av/abbreviation "USD-LIBOR-ISDA",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-LIBOR-ISDA"})

(def USD-LIBOR-LIBO
  {:db/ident :fibo-ind-ir-cm/USD-LIBOR-LIBO,
   :fibo-fnd-utl-av/abbreviation "USD-LIBOR-LIBO",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-LIBOR-LIBO"})

(def USD-LIBOR-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/USD-LIBOR-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "USD-LIBOR-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-LIBOR-Reference Banks"})

(def USD-LIBOR_ICE_Swap_Rate-11_00
  {:db/ident :fibo-ind-ir-cm/USD-LIBOR_ICE_Swap_Rate-11_00,
   :fibo-fnd-utl-av/abbreviation "USD-LIBOR ICE Swap Rate-11:00",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-LIBOR ICE Swap Rate-11:00"})

(def USD-LIBOR_ICE_Swap_Rate-15_00
  {:db/ident :fibo-ind-ir-cm/USD-LIBOR_ICE_Swap_Rate-15_00,
   :fibo-fnd-utl-av/abbreviation "USD-LIBOR ICE Swap Rate-15:00",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-LIBOR ICE Swap Rate-15:00"})

(def USD-Municipal_Swap_Index
  {:db/ident :fibo-ind-ir-cm/USD-Municipal_Swap_Index,
   :fibo-fnd-utl-av/abbreviation "USD-Municipal Swap Index",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-Municipal Swap Index"})

(def USD-Municipal_Swap_Libor_Ratio-11_00-ICAP
  {:db/ident :fibo-ind-ir-cm/USD-Municipal_Swap_Libor_Ratio-11_00-ICAP,
   :fibo-fnd-utl-av/abbreviation "USD-Municipal Swap Libor Ratio-11:00-ICAP",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-Municipal Swap Libor Ratio-11:00-ICAP"})

(def USD-Municipal_Swap_Rate-11_00-ICAP
  {:db/ident :fibo-ind-ir-cm/USD-Municipal_Swap_Rate-11_00-ICAP,
   :fibo-fnd-utl-av/abbreviation "USD-Municipal Swap Rate-11:00-ICAP",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-Municipal Swap Rate-11:00-ICAP"})

(def USD-OIS-11_00-BGCANTOR
  {:db/ident :fibo-ind-ir-cm/USD-OIS-11_00-BGCANTOR,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/FenicsMarketData,
   :fibo-fnd-utl-av/abbreviation "USD-OIS-11:00-BGCANTOR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-OIS-11:00-BGCANTOR"})

(def USD-OIS-11_00-LON-ICAP
  {:db/ident :fibo-ind-ir-cm/USD-OIS-11_00-LON-ICAP,
   :fibo-fnd-utl-av/abbreviation "USD-OIS-11:00-LON-ICAP",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-OIS-11:00-LON-ICAP"})

(def USD-OIS-11_00-NY-ICAP
  {:db/ident :fibo-ind-ir-cm/USD-OIS-11_00-NY-ICAP,
   :fibo-fnd-utl-av/abbreviation "USD-OIS-11:00-NY-ICAP",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-OIS-11:00-NY-ICAP"})

(def USD-OIS-11_00-TRADITION
  {:db/ident :fibo-ind-ir-cm/USD-OIS-11_00-TRADITION,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/Tradition,
   :fibo-fnd-utl-av/abbreviation "USD-OIS-11:00-TRADITION",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-OIS-11:00-TRADITION"})

(def USD-OIS-3_00-BGCANTOR
  {:db/ident :fibo-ind-ir-cm/USD-OIS-3_00-BGCANTOR,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/FenicsMarketData,
   :fibo-fnd-utl-av/abbreviation "USD-OIS-3:00-BGCANTOR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-OIS-3:00-BGCANTOR"})

(def USD-OIS-3_00-NY-ICAP
  {:db/ident :fibo-ind-ir-cm/USD-OIS-3_00-NY-ICAP,
   :fibo-fnd-utl-av/abbreviation "USD-OIS-3:00-NY-ICAP",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-OIS-3:00-NY-ICAP"})

(def USD-OIS-4_00-TRADITION
  {:db/ident :fibo-ind-ir-cm/USD-OIS-4_00-TRADITION,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/Tradition,
   :fibo-fnd-utl-av/abbreviation "USD-OIS-4:00-TRADITION",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-OIS-4:00-TRADITION"})

(def USD-Overnight_Bank_Funding_Rate
  {:db/ident :fibo-ind-ir-cm/USD-Overnight_Bank_Funding_Rate,
   :fibo-fnd-utl-av/abbreviation "USD-Overnight Bank Funding Rate",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-Overnight Bank Funding Rate"})

(def USD-Prime
  {:db/ident :fibo-ind-ir-cm/USD-Prime,
   :fibo-fnd-utl-av/abbreviation "USD-Prime",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-Prime"})

(def USD-Prime-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/USD-Prime-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "USD-Prime-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-Prime-Reference Banks"})

(def USD-SIBOR-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/USD-SIBOR-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "USD-SIBOR-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-SIBOR-Reference Banks"})

(def USD-SIBOR-SIBO
  {:db/ident :fibo-ind-ir-cm/USD-SIBOR-SIBO,
   :fibo-fnd-utl-av/abbreviation "USD-SIBOR-SIBO",
   :fibo-fnd-utl-av/explanatoryNote
   ["Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."
    "Deprecated usage: the code has been deprecated in supplement 36 to the 2006 ISDA definitions (Section 7.1 (ab) (xxviii) USD-SIBOR-SIBO is deleted in its entirety). The code is kept in FpML for backward compatibility purposes."],
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :owl/deprecated true,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-SIBOR-SIBO"})

(def USD-SOFR
  {:db/ident :fibo-ind-ir-cm/USD-SOFR,
   :fibo-fnd-utl-av/abbreviation "USD-SOFR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-SOFR"})

(def USD-SOFR-OIS_Compound
  {:db/ident :fibo-ind-ir-cm/USD-SOFR-OIS_Compound,
   :fibo-fnd-utl-av/abbreviation "USD-SOFR-OIS Compound",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-SOFR-OIS Compound"})

(def USD-SOFR_Average_180D
  {:db/ident :fibo-ind-ir-cm/USD-SOFR_Average_180D,
   :fibo-fnd-utl-av/abbreviation "USD-SOFR Average 180D",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-SOFR Average 180D"})

(def USD-SOFR_Average_30D
  {:db/ident :fibo-ind-ir-cm/USD-SOFR_Average_30D,
   :fibo-fnd-utl-av/abbreviation "USD-SOFR Average 30D",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-SOFR Average 30D"})

(def USD-SOFR_Average_90D
  {:db/ident :fibo-ind-ir-cm/USD-SOFR_Average_90D,
   :fibo-fnd-utl-av/abbreviation "USD-SOFR Average 90D",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-SOFR Average 90D"})

(def USD-SOFR_CME_Term
  {:db/ident :fibo-ind-ir-cm/USD-SOFR_CME_Term,
   :fibo-fnd-utl-av/abbreviation "USD-SOFR CME Term",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-SOFR CME Term"})

(def USD-SOFR_Compounded_Index
  {:db/ident :fibo-ind-ir-cm/USD-SOFR_Compounded_Index,
   :fibo-fnd-utl-av/abbreviation "USD-SOFR Compounded Index",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-SOFR Compounded Index"})

(def USD-SOFR_ICE_Swap_Rate
  {:db/ident :fibo-ind-ir-cm/USD-SOFR_ICE_Swap_Rate,
   :fibo-fnd-utl-av/abbreviation "USD-SOFR ICE Swap Rate",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-SOFR ICE Swap Rate"})

(def USD-SandP_Index_High_Grade
  {:db/ident :fibo-ind-ir-cm/USD-SandP_Index_High_Grade,
   :fibo-fnd-utl-av/abbreviation "USD-SandP Index High Grade",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-SandP Index High Grade"})

(def USD-TBILL-H.15
  {:db/ident :fibo-ind-ir-cm/USD-TBILL-H.15,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-fbc-fct-usjrga/BoardOfGovernorsOfTheFederalReserveSystem,
   :fibo-fnd-utl-av/abbreviation "USD-TBILL-H.15",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-TBILL-H.15"})

(def USD-TBILL-H.15-Bloomberg
  {:db/ident :fibo-ind-ir-cm/USD-TBILL-H.15-Bloomberg,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-fbc-fct-usjrga/BoardOfGovernorsOfTheFederalReserveSystem,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/BloombergLP,
   :fibo-fnd-utl-av/abbreviation "USD-TBILL-H.15-Bloomberg",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-TBILL-H.15-Bloomberg"})

(def USD-TBILL_Secondary_Market-Bond_Equivalent_Yield
  {:db/ident :fibo-ind-ir-cm/USD-TBILL_Secondary_Market-Bond_Equivalent_Yield,
   :fibo-fnd-utl-av/abbreviation
   "USD-TBILL Secondary Market-Bond Equivalent Yield",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-TBILL Secondary Market-Bond Equivalent Yield"})

(def USD-TIBOR-ISDC
  {:db/ident :fibo-ind-ir-cm/USD-TIBOR-ISDC,
   :fibo-fnd-utl-av/abbreviation "USD-TIBOR-ISDC",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-TIBOR-ISDC"})

(def USD-TIBOR-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/USD-TIBOR-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "USD-TIBOR-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-TIBOR-Reference Banks"})

(def USD-Treasury-19901-3_00-ICAP
  {:db/ident :fibo-ind-ir-cm/USD-Treasury-19901-3_00-ICAP,
   :fibo-fnd-utl-av/abbreviation "USD-Treasury-19901-3:00-ICAP",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-Treasury-19901-3:00-ICAP"})

(def USD-Treasury_Rate-ICAP_BrokerTec
  {:db/ident :fibo-ind-ir-cm/USD-Treasury_Rate-ICAP_BrokerTec,
   :fibo-fnd-utl-av/abbreviation "USD-Treasury Rate-ICAP BrokerTec",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-Treasury Rate-ICAP BrokerTec"})

(def USD-Treasury_Rate-SwapMarker100
  {:db/ident :fibo-ind-ir-cm/USD-Treasury_Rate-SwapMarker100,
   :fibo-fnd-utl-av/abbreviation "USD-Treasury Rate-SwapMarker100",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-Treasury Rate-SwapMarker100"})

(def USD-Treasury_Rate-SwapMarker99
  {:db/ident :fibo-ind-ir-cm/USD-Treasury_Rate-SwapMarker99,
   :fibo-fnd-utl-av/abbreviation "USD-Treasury Rate-SwapMarker99",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-Treasury Rate-SwapMarker99"})

(def USD-Treasury_Rate-T19901
  {:db/ident :fibo-ind-ir-cm/USD-Treasury_Rate-T19901,
   :fibo-fnd-utl-av/abbreviation "USD-Treasury Rate-T19901",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-Treasury Rate-T19901"})

(def USD-Treasury_Rate-T500
  {:db/ident :fibo-ind-ir-cm/USD-Treasury_Rate-T500,
   :fibo-fnd-utl-av/abbreviation "USD-Treasury Rate-T500",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD-Treasury Rate-T500"})

(def USD_Swap_Rate-BCMP1
  {:db/ident :fibo-ind-ir-cm/USD_Swap_Rate-BCMP1,
   :fibo-fnd-utl-av/abbreviation "USD Swap Rate-BCMP1",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD Swap Rate-BCMP1"})

(def USD_Treasury_Rate-BCMP1
  {:db/ident :fibo-ind-ir-cm/USD_Treasury_Rate-BCMP1,
   :fibo-fnd-utl-av/abbreviation "USD Treasury Rate-BCMP1",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "USD Treasury Rate-BCMP1"})

(def VND-Semi-Annual_Swap_Rate-11_00-BGCANTOR
  {:db/ident :fibo-ind-ir-cm/VND-Semi-Annual_Swap_Rate-11_00-BGCANTOR,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/FenicsMarketData,
   :fibo-fnd-utl-av/abbreviation "VND-Semi-Annual Swap Rate-11:00-BGCANTOR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Dong,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "VND-Semi-Annual Swap Rate-11:00-BGCANTOR"})

(def VND-Semi-Annual_Swap_Rate-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/VND-Semi-Annual_Swap_Rate-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "VND-Semi-Annual Swap Rate-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Dong,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "VND-Semi-Annual Swap Rate-Reference Banks"})

(def ZAR-DEPOSIT-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/ZAR-DEPOSIT-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "ZAR-DEPOSIT-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Rand,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "ZAR-DEPOSIT-Reference Banks"})

(def ZAR-DEPOSIT-SAFEX
  {:db/ident :fibo-ind-ir-cm/ZAR-DEPOSIT-SAFEX,
   :fibo-fnd-utl-av/abbreviation "ZAR-DEPOSIT-SAFEX",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Rand,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "ZAR-DEPOSIT-SAFEX"})

(def ZAR-JIBAR
  {:db/ident :fibo-ind-ir-cm/ZAR-JIBAR,
   :fibo-fnd-utl-av/abbreviation "ZAR-JIBAR",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Rand,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "ZAR-JIBAR"})

(def ZAR-JIBAR-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/ZAR-JIBAR-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "ZAR-JIBAR-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Rand,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "ZAR-JIBAR-Reference Banks"})

(def ZAR-PRIME-AVERAGE-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/ZAR-PRIME-AVERAGE-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation "ZAR-PRIME-AVERAGE-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Rand,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "ZAR-PRIME-AVERAGE-Reference Banks"})

(def ZAR-Prime_Average
  {:db/ident :fibo-ind-ir-cm/ZAR-Prime_Average,
   :fibo-fnd-utl-av/abbreviation "ZAR-Prime Average",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Rand,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "ZAR-Prime Average"})

(def ZAR-Quarterly_Swap_Rate-1_00-TRADITION
  {:db/ident :fibo-ind-ir-cm/ZAR-Quarterly_Swap_Rate-1_00-TRADITION,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/Tradition,
   :fibo-fnd-utl-av/abbreviation "ZAR-Quarterly Swap Rate-1:00-TRADITION",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Rand,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/ThreeMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "ZAR-Quarterly Swap Rate-1:00-TRADITION"})

(def ZAR-Quarterly_Swap_Rate-5_30-TRADITION
  {:db/ident :fibo-ind-ir-cm/ZAR-Quarterly_Swap_Rate-5_30-TRADITION,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/Tradition,
   :fibo-fnd-utl-av/abbreviation "ZAR-Quarterly Swap Rate-5:30-TRADITION",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Rand,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/ThreeMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "ZAR-Quarterly Swap Rate-5:30-TRADITION"})

(def ZAR-Quarterly_Swap_Rate-TRADITION-Reference_Banks
  {:db/ident :fibo-ind-ir-cm/ZAR-Quarterly_Swap_Rate-TRADITION-Reference_Banks,
   :fibo-fnd-utl-av/abbreviation
   "ZAR-Quarterly Swap Rate-TRADITION-Reference Banks",
   :fibo-fnd-utl-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Rand,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/ThreeMonths,
   :rdf/type [:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "ZAR-Quarterly Swap Rate-TRADITION-Reference Banks"})