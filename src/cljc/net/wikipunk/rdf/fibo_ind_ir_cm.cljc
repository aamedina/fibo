(ns net.wikipunk.rdf.fibo-ind-ir-cm
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "http://www.fpml.org/coding-scheme/floating-rate-index-3-9.xml"},
   :cmns-av/copyright #{"Copyright (c) 2023-2024 Federated Knowledge, LLC"
                        "Copyright (c) 2015-2024 Object Management Group, Inc."
                        "Copyright (c) 2015-2024 Thematix Partners LLC"
                        "Copyright (c) 2015-2024 EDM Council, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/IND/InterestRates/CommonInterestRates/",
   :dcterms/abstract
   "This ontology provides reference data for commonly referenced interest rates, specifically those that are referenced in the ISDA FpML codes for floating interest rates. The rates included herein are generated directly from the FpML published reference data.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
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
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/IND/InterestRates/MarketDataProviders/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Accounting/ISO4217-CurrencyCodes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/IND/InterestRates/InterestRates/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/IND/InterestRates/CommonInterestRates/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-ind-ir-cm",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/",
   :rdfs/label "Common Interest Rates Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates.rdf version of this ontology was revised to reflect the latest FpML rates, which include a number of changes, including deprecating some rates and replacing them with others."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates.rdf version of this ontology was modified to normalize the prefix for the EU individuals ontology and update the reference interest rates as of 26 April 2024."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates.rdf version of this ontology was revised to reflect the latest FpML rates."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates.rdf version of this ontology was modified to normalize the prefix for the EU individuals ontology and update the reference interest rates as of 10 March 2023."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates.rdf version of this ontology was revised extensively to restructure the way in which interest rate benchmarks are modeled and eliminate references to the merged interest rate publishers ontology."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"})

(def AUD-AONIA
  {:cmns-av/abbreviation "AUD-AONIA",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/AUD-AONIA,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/AustralianDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "AUD-AONIA"})

(def AUD-AONIA-OIS_Compound
  {:cmns-av/abbreviation "AUD-AONIA-OIS Compound",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/AUD-AONIA-OIS_Compound,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/AustralianDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "AUD-AONIA-OIS Compound"})

(def AUD-BBR-ISDC
  {:cmns-av/abbreviation "AUD-BBR-ISDC",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/AUD-BBR-ISDC,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/AustralianDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "AUD-BBR-ISDC"})

(def AUD-BBSW
  {:cmns-av/abbreviation "AUD-BBSW",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/AUD-BBSW,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/AustralianDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "AUD-BBSW"})

(def AUD-BBSW_Quarterly_Swap_Rate_ICAP
  {:cmns-av/abbreviation "AUD-BBSW Quarterly Swap Rate ICAP",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/AUD-BBSW_Quarterly_Swap_Rate_ICAP,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/AustralianDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "AUD-BBSW Quarterly Swap Rate ICAP"})

(def AUD-BBSW_Semi_Annual_Swap_Rate_ICAP
  {:cmns-av/abbreviation "AUD-BBSW Semi Annual Swap Rate ICAP",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/AUD-BBSW_Semi_Annual_Swap_Rate_ICAP,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/AustralianDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "AUD-BBSW Semi Annual Swap Rate ICAP"})

(def AUD-BBSY_Bid
  {:cmns-av/abbreviation "AUD-BBSY Bid",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/AUD-BBSY_Bid,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/AustralianDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "AUD-BBSY Bid"})

(def AUD-LIBOR-BBA
  {:cmns-av/abbreviation "AUD-LIBOR-BBA",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/AUD-LIBOR-BBA,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/AustralianDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "AUD-LIBOR-BBA"})

(def AUD-LIBOR-BBA-Bloomberg
  {:cmns-av/abbreviation "AUD-LIBOR-BBA-Bloomberg",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/AUD-LIBOR-BBA-Bloomberg,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/BloombergLP,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/AustralianDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "AUD-LIBOR-BBA-Bloomberg"})

(def AUD-LIBOR-Reference_Banks
  {:cmns-av/abbreviation "AUD-LIBOR-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/AUD-LIBOR-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/AustralianDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "AUD-LIBOR-Reference Banks"})

(def AUD-Quarterly_Swap_Rate-ICAP-Reference_Banks
  {:cmns-av/abbreviation "AUD-Quarterly Swap Rate-ICAP-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/AUD-Quarterly_Swap_Rate-ICAP-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/AustralianDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/ThreeMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "AUD-Quarterly Swap Rate-ICAP-Reference Banks"})

(def AUD-Semi-Annual_Swap_Rate-11_00-BGCANTOR
  {:cmns-av/abbreviation "AUD-Semi-Annual Swap Rate-11:00-BGCANTOR",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/AUD-Semi-Annual_Swap_Rate-11_00-BGCANTOR,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/FenicsMarketData,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/AustralianDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "AUD-Semi-Annual Swap Rate-11:00-BGCANTOR"})

(def AUD-Semi-Annual_Swap_Rate-BGCANTOR-Reference_Banks
  {:cmns-av/abbreviation "AUD-Semi-Annual Swap Rate-BGCANTOR-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/AUD-Semi-Annual_Swap_Rate-BGCANTOR-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/AustralianDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "AUD-Semi-Annual Swap Rate-BGCANTOR-Reference Banks"})

(def AUD-Semi-Annual_Swap_Rate-ICAP-Reference_Banks
  {:cmns-av/abbreviation "AUD-Semi-Annual Swap Rate-ICAP-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/AUD-Semi-Annual_Swap_Rate-ICAP-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/AustralianDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "AUD-Semi-Annual Swap Rate-ICAP-Reference Banks"})

(def AUD-Swap_Rate-Reuters
  {:cmns-av/abbreviation "AUD-Swap Rate-Reuters",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/AUD-Swap_Rate-Reuters,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/ThomsonReuters,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/AustralianDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "AUD-Swap Rate-Reuters"})

(def BRL-CDI
  {:cmns-av/abbreviation "BRL-CDI",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/BRL-CDI,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/BrazilianReal,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "BRL-CDI"})

(def CAD-BA-ISDD
  {:cmns-av/abbreviation "CAD-BA-ISDD",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CAD-BA-ISDD,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/CanadianDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CAD-BA-ISDD"})

(def CAD-BA-Reference_Banks
  {:cmns-av/abbreviation "CAD-BA-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CAD-BA-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/CanadianDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CAD-BA-Reference Banks"})

(def CAD-BA-Telerate
  {:cmns-av/abbreviation "CAD-BA-Telerate",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CAD-BA-Telerate,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/ThomsonReuters,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/CanadianDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CAD-BA-Telerate"})

(def CAD-CDOR
  {:cmns-av/abbreviation "CAD-CDOR",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CAD-CDOR,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/CanadianDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CAD-CDOR"})

(def CAD-CORRA
  {:cmns-av/abbreviation "CAD-CORRA",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CAD-CORRA,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/CanadianDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CAD-CORRA"})

(def CAD-CORRA-OIS_Compound
  {:cmns-av/abbreviation "CAD-CORRA-OIS Compound",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CAD-CORRA-OIS_Compound,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/CanadianDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CAD-CORRA-OIS Compound"})

(def CAD-CORRA_CanDeal_TMX_Term
  {:cmns-av/abbreviation "CAD-CORRA CanDeal TMX Term",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CAD-CORRA_CanDeal_TMX_Term,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/CanadianDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CAD-CORRA CanDeal TMX Term"})

(def CAD-CORRA_Compounded_Index
  {:cmns-av/abbreviation "CAD-CORRA Compounded Index",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CAD-CORRA_Compounded_Index,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/CanadianDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CAD-CORRA Compounded Index"})

(def CAD-ISDA-Swap_Rate
  {:cmns-av/abbreviation "CAD-ISDA-Swap Rate",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CAD-ISDA-Swap_Rate,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/CanadianDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CAD-ISDA-Swap Rate"})

(def CAD-LIBOR-BBA
  {:cmns-av/abbreviation "CAD-LIBOR-BBA",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CAD-LIBOR-BBA,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/CanadianDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CAD-LIBOR-BBA"})

(def CAD-LIBOR-BBA-Bloomberg
  {:cmns-av/abbreviation "CAD-LIBOR-BBA-Bloomberg",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CAD-LIBOR-BBA-Bloomberg,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/BloombergLP,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/CanadianDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CAD-LIBOR-BBA-Bloomberg"})

(def CAD-LIBOR-BBA-SwapMarker
  {:cmns-av/abbreviation "CAD-LIBOR-BBA-SwapMarker",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CAD-LIBOR-BBA-SwapMarker,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/SwapMarker,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/CanadianDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CAD-LIBOR-BBA-SwapMarker"})

(def CAD-LIBOR-Reference_Banks
  {:cmns-av/abbreviation "CAD-LIBOR-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CAD-LIBOR-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/CanadianDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CAD-LIBOR-Reference Banks"})

(def CAD-REPO-CORRA
  {:cmns-av/abbreviation "CAD-REPO-CORRA",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CAD-REPO-CORRA,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/CanadianDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CAD-REPO-CORRA"})

(def CAD-TBILL-ISDD
  {:cmns-av/abbreviation "CAD-TBILL-ISDD",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CAD-TBILL-ISDD,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/CanadianDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CAD-TBILL-ISDD"})

(def CAD-TBILL-Reference_Banks
  {:cmns-av/abbreviation "CAD-TBILL-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CAD-TBILL-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/CanadianDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CAD-TBILL-Reference Banks"})

(def CAD-TBILL-Reuters
  {:cmns-av/abbreviation "CAD-TBILL-Reuters",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CAD-TBILL-Reuters,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/ThomsonReuters,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/CanadianDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CAD-TBILL-Reuters"})

(def CAD-TBILL-Telerate
  {:cmns-av/abbreviation "CAD-TBILL-Telerate",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CAD-TBILL-Telerate,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/ThomsonReuters,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/CanadianDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CAD-TBILL-Telerate"})

(def CHF-3M_LIBOR_SWAP-CME_vs_LCH-ICAP
  {:cmns-av/abbreviation "CHF-3M LIBOR SWAP-CME vs LCH-ICAP",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CHF-3M_LIBOR_SWAP-CME_vs_LCH-ICAP,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwissFranc,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/ThreeMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CHF-3M LIBOR SWAP-CME vs LCH-ICAP"})

(def CHF-3M_LIBOR_SWAP-CME_vs_LCH-ICAP-Bloomberg
  {:cmns-av/abbreviation "CHF-3M LIBOR SWAP-CME vs LCH-ICAP-Bloomberg",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CHF-3M_LIBOR_SWAP-CME_vs_LCH-ICAP-Bloomberg,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/BloombergLP,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwissFranc,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/ThreeMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CHF-3M LIBOR SWAP-CME vs LCH-ICAP-Bloomberg"})

(def CHF-3M_LIBOR_SWAP-EUREX_vs_LCH-ICAP
  {:cmns-av/abbreviation "CHF-3M LIBOR SWAP-EUREX vs LCH-ICAP",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CHF-3M_LIBOR_SWAP-EUREX_vs_LCH-ICAP,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwissFranc,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/ThreeMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CHF-3M LIBOR SWAP-EUREX vs LCH-ICAP"})

(def CHF-3M_LIBOR_SWAP-EUREX_vs_LCH-ICAP-Bloomberg
  {:cmns-av/abbreviation "CHF-3M LIBOR SWAP-EUREX vs LCH-ICAP-Bloomberg",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CHF-3M_LIBOR_SWAP-EUREX_vs_LCH-ICAP-Bloomberg,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/BloombergLP,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwissFranc,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/ThreeMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CHF-3M LIBOR SWAP-EUREX vs LCH-ICAP-Bloomberg"})

(def CHF-6M_LIBORSWAP-CME_vs_LCH-ICAP-Bloomberg
  {:cmns-av/abbreviation "CHF-6M LIBORSWAP-CME vs LCH-ICAP-Bloomberg",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CHF-6M_LIBORSWAP-CME_vs_LCH-ICAP-Bloomberg,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/BloombergLP,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwissFranc,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CHF-6M LIBORSWAP-CME vs LCH-ICAP-Bloomberg"})

(def CHF-6M_LIBOR_SWAP-CME_vs_LCH-ICAP
  {:cmns-av/abbreviation "CHF-6M LIBOR SWAP-CME vs LCH-ICAP",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CHF-6M_LIBOR_SWAP-CME_vs_LCH-ICAP,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwissFranc,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CHF-6M LIBOR SWAP-CME vs LCH-ICAP"})

(def CHF-6M_LIBOR_SWAP-EUREX_vs_LCH-ICAP
  {:cmns-av/abbreviation "CHF-6M LIBOR SWAP-EUREX vs LCH-ICAP",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CHF-6M_LIBOR_SWAP-EUREX_vs_LCH-ICAP,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwissFranc,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CHF-6M LIBOR SWAP-EUREX vs LCH-ICAP"})

(def CHF-6M_LIBOR_SWAP-EUREX_vs_LCH-ICAP-Bloomberg
  {:cmns-av/abbreviation "CHF-6M LIBOR SWAP-EUREX vs LCH-ICAP-Bloomberg",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CHF-6M_LIBOR_SWAP-EUREX_vs_LCH-ICAP-Bloomberg,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/BloombergLP,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwissFranc,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CHF-6M LIBOR SWAP-EUREX vs LCH-ICAP-Bloomberg"})

(def CHF-Annual_Swap_Rate
  {:cmns-av/abbreviation "CHF-Annual Swap Rate",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CHF-Annual_Swap_Rate,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwissFranc,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CHF-Annual Swap Rate"})

(def CHF-Annual_Swap_Rate-11_00-ICAP
  {:cmns-av/abbreviation "CHF-Annual Swap Rate-11:00-ICAP",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CHF-Annual_Swap_Rate-11_00-ICAP,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwissFranc,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CHF-Annual Swap Rate-11:00-ICAP"})

(def CHF-Annual_Swap_Rate-Reference_Banks
  {:cmns-av/abbreviation "CHF-Annual Swap Rate-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CHF-Annual_Swap_Rate-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwissFranc,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CHF-Annual Swap Rate-Reference Banks"})

(def CHF-Basis_Swap-3m_vs_6m-LIBOR-11_00-ICAP
  {:cmns-av/abbreviation "CHF-Basis Swap-3m vs 6m-LIBOR-11:00-ICAP",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CHF-Basis_Swap-3m_vs_6m-LIBOR-11_00-ICAP,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwissFranc,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CHF-Basis Swap-3m vs 6m-LIBOR-11:00-ICAP"})

(def CHF-ISDAFIX-Swap_Rate
  {:cmns-av/abbreviation "CHF-ISDAFIX-Swap Rate",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CHF-ISDAFIX-Swap_Rate,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwissFranc,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CHF-ISDAFIX-Swap Rate"})

(def CHF-LIBOR
  {:cmns-av/abbreviation "CHF-LIBOR",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CHF-LIBOR,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwissFranc,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CHF-LIBOR"})

(def CHF-LIBOR-ISDA
  {:cmns-av/abbreviation "CHF-LIBOR-ISDA",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CHF-LIBOR-ISDA,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwissFranc,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CHF-LIBOR-ISDA"})

(def CHF-LIBOR-Reference_Banks
  {:cmns-av/abbreviation "CHF-LIBOR-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CHF-LIBOR-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwissFranc,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CHF-LIBOR-Reference Banks"})

(def CHF-OIS-11_00-ICAP
  {:cmns-av/abbreviation "CHF-OIS-11:00-ICAP",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CHF-OIS-11_00-ICAP,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwissFranc,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CHF-OIS-11:00-ICAP"})

(def CHF-SARON
  {:cmns-av/abbreviation "CHF-SARON",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CHF-SARON,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwissFranc,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CHF-SARON"})

(def CHF-SARON-OIS_Compound
  {:cmns-av/abbreviation "CHF-SARON-OIS Compound",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CHF-SARON-OIS_Compound,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwissFranc,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CHF-SARON-OIS Compound"})

(def CHF-SARON_Average_12M
  {:cmns-av/abbreviation "CHF-SARON Average 12M",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CHF-SARON_Average_12M,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwissFranc,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CHF-SARON Average 12M"})

(def CHF-SARON_Average_1M
  {:cmns-av/abbreviation "CHF-SARON Average 1M",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CHF-SARON_Average_1M,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwissFranc,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CHF-SARON Average 1M"})

(def CHF-SARON_Average_1W
  {:cmns-av/abbreviation "CHF-SARON Average 1W",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CHF-SARON_Average_1W,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwissFranc,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CHF-SARON Average 1W"})

(def CHF-SARON_Average_2M
  {:cmns-av/abbreviation "CHF-SARON Average 2M",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CHF-SARON_Average_2M,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwissFranc,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CHF-SARON Average 2M"})

(def CHF-SARON_Average_3M
  {:cmns-av/abbreviation "CHF-SARON Average 3M",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CHF-SARON_Average_3M,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwissFranc,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CHF-SARON Average 3M"})

(def CHF-SARON_Average_6M
  {:cmns-av/abbreviation "CHF-SARON Average 6M",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CHF-SARON_Average_6M,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwissFranc,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CHF-SARON Average 6M"})

(def CHF-SARON_Average_9M
  {:cmns-av/abbreviation "CHF-SARON Average 9M",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CHF-SARON_Average_9M,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwissFranc,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CHF-SARON Average 9M"})

(def CHF-SARON_Compounded_Index
  {:cmns-av/abbreviation "CHF-SARON Compounded Index",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CHF-SARON_Compounded_Index,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwissFranc,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CHF-SARON Compounded Index"})

(def CHF-TOIS-OIS-COMPOUND
  {:cmns-av/abbreviation "CHF-TOIS-OIS-COMPOUND",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CHF-TOIS-OIS-COMPOUND,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwissFranc,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CHF-TOIS-OIS-COMPOUND"})

(def CHF_USD-Basis_Swaps-11_00-ICAP
  {:cmns-av/abbreviation "CHF USD-Basis Swaps-11:00-ICAP",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CHF_USD-Basis_Swaps-11_00-ICAP,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwissFranc,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CHF USD-Basis Swaps-11:00-ICAP"})

(def CLP-ICP
  {:cmns-av/abbreviation "CLP-ICP",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CLP-ICP,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/ChileanPeso,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CLP-ICP"})

(def CLP-TNA
  {:cmns-av/abbreviation "CLP-TNA",
   :cmns-av/explanatoryNote
   "Refers to the Indice Camara Promedio (\"ICP\") rate for Chilean Pesos which, for a Reset Date, is determined and published by the Asociacion de Bancos e Instituciones Financieras de Chile A.G. (\"ABIF\") in accordance with the \"Reglamento Indice de Camara Promedio\" of the ABIF as published in the Diario Oficial de la Republica de Chile (the \"ICP Rules\") and which is reported on the ABIF website by not later than 10:00 a.m., Santiago time, on that Reset Date.",
   :db/ident :fibo-ind-ir-cm/CLP-TNA,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/ChileanPeso,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CLP-TNA"})

(def CNH-HIBOR
  {:cmns-av/abbreviation "CNH-HIBOR",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CNH-HIBOR,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/YuanRenminbi,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CNH-HIBOR"})

(def CNH-HIBOR-Reference_Banks
  {:cmns-av/abbreviation "CNH-HIBOR-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CNH-HIBOR-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/YuanRenminbi,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CNH-HIBOR-Reference Banks"})

(def CNY-Deposit_Rate
  {:cmns-av/abbreviation "CNY-Deposit Rate",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CNY-Deposit_Rate,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/YuanRenminbi,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CNY-Deposit Rate"})

(def CNY-Fixing_Repo_Rate
  {:cmns-av/abbreviation "CNY-Fixing Repo Rate",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CNY-Fixing_Repo_Rate,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/YuanRenminbi,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CNY-Fixing Repo Rate"})

(def CNY-LPR
  {:cmns-av/abbreviation "CNY-LPR",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CNY-LPR,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/YuanRenminbi,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CNY-LPR"})

(def CNY-Quarterly_7D_Repo_NDS_Rate_Tradition
  {:cmns-av/abbreviation "CNY-Quarterly 7D Repo NDS Rate Tradition",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CNY-Quarterly_7D_Repo_NDS_Rate_Tradition,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/YuanRenminbi,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/ThreeMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CNY-Quarterly 7D Repo NDS Rate Tradition"})

(def
  CNY-Quarterly_7_day_Repo_Non_Deliverable_Swap_Rate-TRADITION-Reference_Banks
  {:cmns-av/abbreviation
   "CNY-Quarterly 7 day Repo Non Deliverable Swap Rate-TRADITION-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident
   :fibo-ind-ir-cm/CNY-Quarterly_7_day_Repo_Non_Deliverable_Swap_Rate-TRADITION-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/YuanRenminbi,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/ThreeMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label
   "CNY-Quarterly 7 day Repo Non Deliverable Swap Rate-TRADITION-Reference Banks"})

(def CNY-SHIBOR
  {:cmns-av/abbreviation "CNY-SHIBOR",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CNY-SHIBOR,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/YuanRenminbi,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CNY-SHIBOR"})

(def CNY-SHIBOR-OIS_Compound
  {:cmns-av/abbreviation "CNY-SHIBOR-OIS Compound",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CNY-SHIBOR-OIS_Compound,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/YuanRenminbi,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CNY-SHIBOR-OIS Compound"})

(def CNY-Semi-Annual_Swap_Rate-11_00-BGCANTOR
  {:cmns-av/abbreviation "CNY-Semi-Annual Swap Rate-11:00-BGCANTOR",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CNY-Semi-Annual_Swap_Rate-11_00-BGCANTOR,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/FenicsMarketData,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/YuanRenminbi,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CNY-Semi-Annual Swap Rate-11:00-BGCANTOR"})

(def CNY-Semi-Annual_Swap_Rate-Reference_Banks
  {:cmns-av/abbreviation "CNY-Semi-Annual Swap Rate-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CNY-Semi-Annual_Swap_Rate-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/YuanRenminbi,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CNY-Semi-Annual Swap Rate-Reference Banks"})

(def CNY_7-Repo_Compounding_Date
  {:cmns-av/abbreviation "CNY 7-Repo Compounding Date",
   :cmns-av/explanatoryNote
   #{"Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."
     "Deprecated usage: CNY 7-Repo Compounding Date - is not an floating rate index and should not be in the floating-rate-index list (it is a date)."},
   :db/ident :fibo-ind-ir-cm/CNY_7-Repo_Compounding_Date,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/YuanRenminbi,
   :owl/deprecated true,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CNY 7-Repo Compounding Date"})

(def COP-IBR-OIS_Compound
  {:cmns-av/abbreviation "COP-IBR-OIS Compound",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/COP-IBR-OIS_Compound,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/ColombianPeso,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "COP-IBR-OIS Compound"})

(def CZK-Annual_Swap_Rate-11_00-BGCANTOR
  {:cmns-av/abbreviation "CZK-Annual Swap Rate-11:00-BGCANTOR",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CZK-Annual_Swap_Rate-11_00-BGCANTOR,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/FenicsMarketData,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/CzechKoruna,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CZK-Annual Swap Rate-11:00-BGCANTOR"})

(def CZK-Annual_Swap_Rate-Reference_Banks
  {:cmns-av/abbreviation "CZK-Annual Swap Rate-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CZK-Annual_Swap_Rate-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/CzechKoruna,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CZK-Annual Swap Rate-Reference Banks"})

(def CZK-CZEONIA
  {:cmns-av/abbreviation "CZK-CZEONIA",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CZK-CZEONIA,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/CzechKoruna,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CZK-CZEONIA"})

(def CZK-CZEONIA-OIS_Compound
  {:cmns-av/abbreviation "CZK-CZEONIA-OIS Compound",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CZK-CZEONIA-OIS_Compound,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/CzechKoruna,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CZK-CZEONIA-OIS Compound"})

(def CZK-PRIBOR
  {:cmns-av/abbreviation "CZK-PRIBOR",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CZK-PRIBOR,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/CzechKoruna,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CZK-PRIBOR"})

(def CZK-PRIBOR-Reference_Banks
  {:cmns-av/abbreviation "CZK-PRIBOR-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/CZK-PRIBOR-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/CzechKoruna,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "CZK-PRIBOR-Reference Banks"})

(def DKK-CIBOR
  {:cmns-av/abbreviation "DKK-CIBOR",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/DKK-CIBOR,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/DanishKrone,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "DKK-CIBOR"})

(def DKK-CIBOR-Reference_Banks
  {:cmns-av/abbreviation "DKK-CIBOR-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/DKK-CIBOR-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/DanishKrone,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "DKK-CIBOR-Reference Banks"})

(def DKK-CIBOR2
  {:cmns-av/abbreviation "DKK-CIBOR2",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/DKK-CIBOR2,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/DanishKrone,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "DKK-CIBOR2"})

(def DKK-CITA
  {:cmns-av/abbreviation "DKK-CITA",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/DKK-CITA,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/DanishKrone,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "DKK-CITA"})

(def DKK-DESTR
  {:cmns-av/abbreviation "DKK-DESTR",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/DKK-DESTR,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/DanishKrone,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "DKK-DESTR"})

(def DKK-DESTR-OIS_Compound
  {:cmns-av/abbreviation "DKK-DESTR-OIS Compound",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/DKK-DESTR-OIS_Compound,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/DanishKrone,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "DKK-DESTR-OIS Compound"})

(def DKK-DESTR_Compounded_Index
  {:cmns-av/abbreviation "DKK-DESTR Compounded Index",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/DKK-DESTR_Compounded_Index,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/DanishKrone,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "DKK-DESTR Compounded Index"})

(def DKK-Tom_Next-OIS_Compound
  {:cmns-av/abbreviation "DKK-Tom Next-OIS Compound",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/DKK-Tom_Next-OIS_Compound,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/DanishKrone,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "DKK-Tom Next-OIS Compound"})

(def EUR-3M_EURIBOR_SWAP-CME_vs_LCH-ICAP
  {:cmns-av/abbreviation "EUR-3M EURIBOR SWAP-CME vs LCH-ICAP",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-3M_EURIBOR_SWAP-CME_vs_LCH-ICAP,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-ind-ir-mdp/EuropeanMoneyMarketsInstituteBenchmarkPublisher,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/ThreeMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-3M EURIBOR SWAP-CME vs LCH-ICAP"})

(def EUR-3M_EURIBOR_SWAP-CME_vs_LCH-ICAP-Bloomberg
  {:cmns-av/abbreviation "EUR-3M EURIBOR SWAP-CME vs LCH-ICAP-Bloomberg",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-3M_EURIBOR_SWAP-CME_vs_LCH-ICAP-Bloomberg,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-ind-ir-mdp/EuropeanMoneyMarketsInstituteBenchmarkPublisher,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/BloombergLP,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/ThreeMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-3M EURIBOR SWAP-CME vs LCH-ICAP-Bloomberg"})

(def EUR-3M_EURIBOR_SWAP-EUREX_vs_LCH-ICAP
  {:cmns-av/abbreviation "EUR-3M EURIBOR SWAP-EUREX vs LCH-ICAP",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-3M_EURIBOR_SWAP-EUREX_vs_LCH-ICAP,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-ind-ir-mdp/EuropeanMoneyMarketsInstituteBenchmarkPublisher,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/ThreeMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-3M EURIBOR SWAP-EUREX vs LCH-ICAP"})

(def EUR-3M_EURIBOR_SWAP-EUREX_vs_LCH-ICAP-Bloomberg
  {:cmns-av/abbreviation "EUR-3M EURIBOR SWAP-EUREX vs LCH-ICAP-Bloomberg",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-3M_EURIBOR_SWAP-EUREX_vs_LCH-ICAP-Bloomberg,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-ind-ir-mdp/EuropeanMoneyMarketsInstituteBenchmarkPublisher,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/BloombergLP,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/ThreeMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-3M EURIBOR SWAP-EUREX vs LCH-ICAP-Bloomberg"})

(def EUR-6M_EURIBOR_SWAP-CME_vs_LCH-ICAP
  {:cmns-av/abbreviation "EUR-6M EURIBOR SWAP-CME vs LCH-ICAP",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-6M_EURIBOR_SWAP-CME_vs_LCH-ICAP,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-ind-ir-mdp/EuropeanMoneyMarketsInstituteBenchmarkPublisher,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-6M EURIBOR SWAP-CME vs LCH-ICAP"})

(def EUR-6M_EURIBOR_SWAP-CME_vs_LCH-ICAP-Bloomberg
  {:cmns-av/abbreviation "EUR-6M EURIBOR SWAP-CME vs LCH-ICAP-Bloomberg",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-6M_EURIBOR_SWAP-CME_vs_LCH-ICAP-Bloomberg,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-ind-ir-mdp/EuropeanMoneyMarketsInstituteBenchmarkPublisher,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/BloombergLP,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-6M EURIBOR SWAP-CME vs LCH-ICAP-Bloomberg"})

(def EUR-6M_EURIBOR_SWAP-EUREX_vs_LCH-ICAP
  {:cmns-av/abbreviation "EUR-6M EURIBOR SWAP-EUREX vs LCH-ICAP",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-6M_EURIBOR_SWAP-EUREX_vs_LCH-ICAP,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-ind-ir-mdp/EuropeanMoneyMarketsInstituteBenchmarkPublisher,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-6M EURIBOR SWAP-EUREX vs LCH-ICAP"})

(def EUR-6M_EURIBOR_SWAP-EUREX_vs_LCH-ICAP-Bloomberg
  {:cmns-av/abbreviation "EUR-6M EURIBOR SWAP-EUREX vs LCH-ICAP-Bloomberg",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-6M_EURIBOR_SWAP-EUREX_vs_LCH-ICAP-Bloomberg,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-ind-ir-mdp/EuropeanMoneyMarketsInstituteBenchmarkPublisher,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/BloombergLP,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-6M EURIBOR SWAP-EUREX vs LCH-ICAP-Bloomberg"})

(def EUR-Annual_Swap_Rate-10_00
  {:cmns-av/abbreviation "EUR-Annual Swap Rate-10:00",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-Annual_Swap_Rate-10_00,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-Annual Swap Rate-10:00"})

(def EUR-Annual_Swap_Rate-10_00-BGCANTOR
  {:cmns-av/abbreviation "EUR-Annual Swap Rate-10:00-BGCANTOR",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-Annual_Swap_Rate-10_00-BGCANTOR,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/FenicsMarketData,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-Annual Swap Rate-10:00-BGCANTOR"})

(def EUR-Annual_Swap_Rate-10_00-Bloomberg
  {:cmns-av/abbreviation "EUR-Annual Swap Rate-10:00-Bloomberg",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-Annual_Swap_Rate-10_00-Bloomberg,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/BloombergLP,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-Annual Swap Rate-10:00-Bloomberg"})

(def EUR-Annual_Swap_Rate-10_00-ICAP
  {:cmns-av/abbreviation "EUR-Annual Swap Rate-10:00-ICAP",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-Annual_Swap_Rate-10_00-ICAP,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-Annual Swap Rate-10:00-ICAP"})

(def EUR-Annual_Swap_Rate-10_00-SwapMarker
  {:cmns-av/abbreviation "EUR-Annual Swap Rate-10:00-SwapMarker",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-Annual_Swap_Rate-10_00-SwapMarker,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/SwapMarker,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-Annual Swap Rate-10:00-SwapMarker"})

(def EUR-Annual_Swap_Rate-10_00-TRADITION
  {:cmns-av/abbreviation "EUR-Annual Swap Rate-10:00-TRADITION",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-Annual_Swap_Rate-10_00-TRADITION,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/Tradition,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-Annual Swap Rate-10:00-TRADITION"})

(def EUR-Annual_Swap_Rate-11_00
  {:cmns-av/abbreviation "EUR-Annual Swap Rate-11:00",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-Annual_Swap_Rate-11_00,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-Annual Swap Rate-11:00"})

(def EUR-Annual_Swap_Rate-11_00-Bloomberg
  {:cmns-av/abbreviation "EUR-Annual Swap Rate-11:00-Bloomberg",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-Annual_Swap_Rate-11_00-Bloomberg,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/BloombergLP,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-Annual Swap Rate-11:00-Bloomberg"})

(def EUR-Annual_Swap_Rate-11_00-ICAP
  {:cmns-av/abbreviation "EUR-Annual Swap Rate-11:00-ICAP",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-Annual_Swap_Rate-11_00-ICAP,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-Annual Swap Rate-11:00-ICAP"})

(def EUR-Annual_Swap_Rate-11_00-SwapMarker
  {:cmns-av/abbreviation "EUR-Annual Swap Rate-11:00-SwapMarker",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-Annual_Swap_Rate-11_00-SwapMarker,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/SwapMarker,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-Annual Swap Rate-11:00-SwapMarker"})

(def EUR-Annual_Swap_Rate-3_Month
  {:cmns-av/abbreviation "EUR-Annual Swap Rate-3 Month",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-Annual_Swap_Rate-3_Month,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-Annual Swap Rate-3 Month"})

(def EUR-Annual_Swap_Rate-3_Month-SwapMarker
  {:cmns-av/abbreviation "EUR-Annual Swap Rate-3 Month-SwapMarker",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-Annual_Swap_Rate-3_Month-SwapMarker,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/SwapMarker,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-Annual Swap Rate-3 Month-SwapMarker"})

(def EUR-Annual_Swap_Rate-4_15-TRADITION
  {:cmns-av/abbreviation "EUR-Annual Swap Rate-4:15-TRADITION",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-Annual_Swap_Rate-4_15-TRADITION,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/Tradition,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-Annual Swap Rate-4:15-TRADITION"})

(def EUR-Annual_Swap_Rate-Reference_Banks
  {:cmns-av/abbreviation "EUR-Annual Swap Rate-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-Annual_Swap_Rate-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-Annual Swap Rate-Reference Banks"})

(def EUR-CNO_TEC10
  {:cmns-av/abbreviation "EUR-CNO TEC10",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-CNO_TEC10,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-CNO TEC10"})

(def EUR-EONIA
  {:cmns-av/abbreviation "EUR-EONIA",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-EONIA,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-ind-ir-mdp/EuropeanMoneyMarketsInstituteBenchmarkPublisher,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-EONIA"})

(def EUR-EONIA-Average
  {:cmns-av/abbreviation "EUR-EONIA-Average",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-EONIA-Average,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-ind-ir-mdp/EuropeanMoneyMarketsInstituteBenchmarkPublisher,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-EONIA-Average"})

(def EUR-EONIA-OIS-10_00-BGCANTOR
  {:cmns-av/abbreviation "EUR-EONIA-OIS-10:00-BGCANTOR",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-EONIA-OIS-10_00-BGCANTOR,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-ind-ir-mdp/EuropeanMoneyMarketsInstituteBenchmarkPublisher,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/FenicsMarketData,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-EONIA-OIS-10:00-BGCANTOR"})

(def EUR-EONIA-OIS-10_00-ICAP
  {:cmns-av/abbreviation "EUR-EONIA-OIS-10:00-ICAP",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-EONIA-OIS-10_00-ICAP,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-ind-ir-mdp/EuropeanMoneyMarketsInstituteBenchmarkPublisher,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-EONIA-OIS-10:00-ICAP"})

(def EUR-EONIA-OIS-10_00-TRADITION
  {:cmns-av/abbreviation "EUR-EONIA-OIS-10:00-TRADITION",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-EONIA-OIS-10_00-TRADITION,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-ind-ir-mdp/EuropeanMoneyMarketsInstituteBenchmarkPublisher,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/Tradition,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-EONIA-OIS-10:00-TRADITION"})

(def EUR-EONIA-OIS-11_00-ICAP
  {:cmns-av/abbreviation "EUR-EONIA-OIS-11:00-ICAP",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-EONIA-OIS-11_00-ICAP,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-ind-ir-mdp/EuropeanMoneyMarketsInstituteBenchmarkPublisher,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-EONIA-OIS-11:00-ICAP"})

(def EUR-EONIA-OIS-4_15-TRADITION
  {:cmns-av/abbreviation "EUR-EONIA-OIS-4:15-TRADITION",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-EONIA-OIS-4_15-TRADITION,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-ind-ir-mdp/EuropeanMoneyMarketsInstituteBenchmarkPublisher,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/Tradition,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-EONIA-OIS-4:15-TRADITION"})

(def EUR-EONIA-OIS_Compound
  {:cmns-av/abbreviation "EUR-EONIA-OIS Compound",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-EONIA-OIS_Compound,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-ind-ir-mdp/EuropeanMoneyMarketsInstituteBenchmarkPublisher,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-EONIA-OIS Compound"})

(def EUR-EONIA-Swap-Index
  {:cmns-av/abbreviation "EUR-EONIA-Swap-Index",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-EONIA-Swap-Index,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-ind-ir-mdp/EuropeanMoneyMarketsInstituteBenchmarkPublisher,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-EONIA-Swap-Index"})

(def EUR-EURIBOR
  {:cmns-av/abbreviation "EUR-EURIBOR",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-EURIBOR,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-ind-ir-mdp/EuropeanMoneyMarketsInstituteBenchmarkPublisher,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-EURIBOR"})

(def EUR-EURIBOR-Act_365
  {:cmns-av/abbreviation "EUR-EURIBOR-Act/365",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-EURIBOR-Act_365,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-ind-ir-mdp/EuropeanMoneyMarketsInstituteBenchmarkPublisher,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-EURIBOR-Act/365"})

(def EUR-EURIBOR-Act_365-Bloomberg
  {:cmns-av/abbreviation "EUR-EURIBOR-Act/365-Bloomberg",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-EURIBOR-Act_365-Bloomberg,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-ind-ir-mdp/EuropeanMoneyMarketsInstituteBenchmarkPublisher,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/BloombergLP,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-EURIBOR-Act/365-Bloomberg"})

(def EUR-EURIBOR-Reference_Banks
  {:cmns-av/abbreviation "EUR-EURIBOR-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-EURIBOR-Reference_Banks,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-ind-ir-mdp/EuropeanMoneyMarketsInstituteBenchmarkPublisher,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-EURIBOR-Reference Banks"})

(def EUR-EURIBOR-Telerate
  {:cmns-av/abbreviation "EUR-EURIBOR-Telerate",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-EURIBOR-Telerate,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-ind-ir-mdp/EuropeanMoneyMarketsInstituteBenchmarkPublisher,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/ThomsonReuters,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-EURIBOR-Telerate"})

(def EUR-EURIBOR_ICE_Swap_Rate-11_00
  {:cmns-av/abbreviation "EUR-EURIBOR ICE Swap Rate-11:00",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-EURIBOR_ICE_Swap_Rate-11_00,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-ind-ir-mdp/EuropeanMoneyMarketsInstituteBenchmarkPublisher,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-EURIBOR ICE Swap Rate-11:00"})

(def EUR-EURIBOR_ICE_Swap_Rate-12_00
  {:cmns-av/abbreviation "EUR-EURIBOR ICE Swap Rate-12:00",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-EURIBOR_ICE_Swap_Rate-12_00,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-ind-ir-mdp/EuropeanMoneyMarketsInstituteBenchmarkPublisher,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-EURIBOR ICE Swap Rate-12:00"})

(def EUR-EURONIA-OIS_Compound
  {:cmns-av/abbreviation "EUR-EURONIA-OIS Compound",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-EURONIA-OIS_Compound,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-EURONIA-OIS Compound"})

(def EUR-EuroSTR
  {:cmns-av/abbreviation "EUR-EuroSTR",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-EuroSTR,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-EuroSTR"})

(def EUR-EuroSTR-OIS_Compound
  {:cmns-av/abbreviation "EUR-EuroSTR-OIS Compound",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-EuroSTR-OIS_Compound,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-EuroSTR-OIS Compound"})

(def EUR-EuroSTR_Average_12M
  {:cmns-av/abbreviation "EUR-EuroSTR Average 12M",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-EuroSTR_Average_12M,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-EuroSTR Average 12M"})

(def EUR-EuroSTR_Average_1M
  {:cmns-av/abbreviation "EUR-EuroSTR Average 1M",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-EuroSTR_Average_1M,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-EuroSTR Average 1M"})

(def EUR-EuroSTR_Average_1W
  {:cmns-av/abbreviation "EUR-EuroSTR Average 1W",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-EuroSTR_Average_1W,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-EuroSTR Average 1W"})

(def EUR-EuroSTR_Average_3M
  {:cmns-av/abbreviation "EUR-EuroSTR Average 3M",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-EuroSTR_Average_3M,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-EuroSTR Average 3M"})

(def EUR-EuroSTR_Average_6M
  {:cmns-av/abbreviation "EUR-EuroSTR Average 6M",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-EuroSTR_Average_6M,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-EuroSTR Average 6M"})

(def EUR-EuroSTR_Compounded_Index
  {:cmns-av/abbreviation "EUR-EuroSTR Compounded Index",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-EuroSTR_Compounded_Index,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-EuroSTR Compounded Index"})

(def EUR-EuroSTR_FTSE_Term
  {:cmns-av/abbreviation "EUR-EuroSTR FTSE Term",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-EuroSTR_FTSE_Term,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-EuroSTR FTSE Term"})

(def EUR-EuroSTR_ICE_Compounded_Index
  {:cmns-av/abbreviation "EUR-EuroSTR ICE Compounded Index",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-EuroSTR_ICE_Compounded_Index,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-EuroSTR ICE Compounded Index"})

(def EUR-EuroSTR_ICE_Compounded_Index_0_Floor
  {:cmns-av/abbreviation "EUR-EuroSTR ICE Compounded Index 0 Floor",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-EuroSTR_ICE_Compounded_Index_0_Floor,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-EuroSTR ICE Compounded Index 0 Floor"})

(def EUR-EuroSTR_ICE_Compounded_Index_0_Floor_2D_Lag
  {:cmns-av/abbreviation "EUR-EuroSTR ICE Compounded Index 0 Floor 2D Lag",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-EuroSTR_ICE_Compounded_Index_0_Floor_2D_Lag,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-EuroSTR ICE Compounded Index 0 Floor 2D Lag"})

(def EUR-EuroSTR_ICE_Compounded_Index_0_Floor_5D_Lag
  {:cmns-av/abbreviation "EUR-EuroSTR ICE Compounded Index 0 Floor 5D Lag",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-EuroSTR_ICE_Compounded_Index_0_Floor_5D_Lag,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-EuroSTR ICE Compounded Index 0 Floor 5D Lag"})

(def EUR-EuroSTR_ICE_Compounded_Index_2D_Lag
  {:cmns-av/abbreviation "EUR-EuroSTR ICE Compounded Index 2D Lag",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-EuroSTR_ICE_Compounded_Index_2D_Lag,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-EuroSTR ICE Compounded Index 2D Lag"})

(def EUR-EuroSTR_ICE_Compounded_Index_5D_Lag
  {:cmns-av/abbreviation "EUR-EuroSTR ICE Compounded Index 5D Lag",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-EuroSTR_ICE_Compounded_Index_5D_Lag,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-EuroSTR ICE Compounded Index 5D Lag"})

(def EUR-EuroSTR_Term
  {:cmns-av/abbreviation "EUR-EuroSTR Term",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-EuroSTR_Term,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-EuroSTR Term"})

(def EUR-ISDA-LIBOR_Swap_Rate-10_00
  {:cmns-av/abbreviation "EUR-ISDA-LIBOR Swap Rate-10:00",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-ISDA-LIBOR_Swap_Rate-10_00,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-ISDA-LIBOR Swap Rate-10:00"})

(def EUR-ISDA-LIBOR_Swap_Rate-11_00
  {:cmns-av/abbreviation "EUR-ISDA-LIBOR Swap Rate-11:00",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-ISDA-LIBOR_Swap_Rate-11_00,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-ISDA-LIBOR Swap Rate-11:00"})

(def EUR-LIBOR
  {:cmns-av/abbreviation "EUR-LIBOR",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-LIBOR,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-LIBOR"})

(def EUR-LIBOR-Reference_Banks
  {:cmns-av/abbreviation "EUR-LIBOR-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-LIBOR-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-LIBOR-Reference Banks"})

(def EUR-TAM-CDC
  {:cmns-av/abbreviation "EUR-TAM-CDC",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-TAM-CDC,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-TAM-CDC"})

(def EUR-TEC10-Reference_Banks
  {:cmns-av/abbreviation "EUR-TEC10-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-TEC10-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-TEC10-Reference Banks"})

(def EUR-TEC5-CNO
  {:cmns-av/abbreviation "EUR-TEC5-CNO",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-TEC5-CNO,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-TEC5-CNO"})

(def EUR-TEC5-CNO-SwapMarker
  {:cmns-av/abbreviation "EUR-TEC5-CNO-SwapMarker",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-TEC5-CNO-SwapMarker,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/SwapMarker,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-TEC5-CNO-SwapMarker"})

(def EUR-TEC5-Reference_Banks
  {:cmns-av/abbreviation "EUR-TEC5-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-TEC5-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-TEC5-Reference Banks"})

(def EUR-TMM-CDC-COMPOUND
  {:cmns-av/abbreviation "EUR-TMM-CDC-COMPOUND",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR-TMM-CDC-COMPOUND,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR-TMM-CDC-COMPOUND"})

(def EUR_Basis_Swap-EONIA_vs_3m_EUR_IBOR_Swap_Rates-A_360-10_00-ICAP
  {:cmns-av/abbreviation
   "EUR Basis Swap-EONIA vs 3m EUR+IBOR Swap Rates-A/360-10:00-ICAP",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident
   :fibo-ind-ir-cm/EUR_Basis_Swap-EONIA_vs_3m_EUR_IBOR_Swap_Rates-A_360-10_00-ICAP,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-ind-ir-mdp/EuropeanMoneyMarketsInstituteBenchmarkPublisher,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label
   "EUR Basis Swap-EONIA vs 3m EUR+IBOR Swap Rates-A/360-10:00-ICAP"})

(def EUR_EURIBOR-Annual_Bond_Swap_vs_1m-11_00-ICAP
  {:cmns-av/abbreviation "EUR EURIBOR-Annual Bond Swap vs 1m-11:00-ICAP",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR_EURIBOR-Annual_Bond_Swap_vs_1m-11_00-ICAP,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-ind-ir-mdp/EuropeanMoneyMarketsInstituteBenchmarkPublisher,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR EURIBOR-Annual Bond Swap vs 1m-11:00-ICAP"})

(def EUR_EURIBOR-Basis_Swap-1m_vs_3m-Euribor-11_00-ICAP
  {:cmns-av/abbreviation "EUR EURIBOR-Basis Swap-1m vs 3m-Euribor-11:00-ICAP",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR_EURIBOR-Basis_Swap-1m_vs_3m-Euribor-11_00-ICAP,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-ind-ir-mdp/EuropeanMoneyMarketsInstituteBenchmarkPublisher,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR EURIBOR-Basis Swap-1m vs 3m-Euribor-11:00-ICAP"})

(def EUR_EURIBOR-Basis_Swap-3m_vs_6m-11_00-ICAP
  {:cmns-av/abbreviation "EUR EURIBOR-Basis Swap-3m vs 6m-11:00-ICAP",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR_EURIBOR-Basis_Swap-3m_vs_6m-11_00-ICAP,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-ind-ir-mdp/EuropeanMoneyMarketsInstituteBenchmarkPublisher,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR EURIBOR-Basis Swap-3m vs 6m-11:00-ICAP"})

(def EUR_USD-Basis_Swaps-11_00-ICAP
  {:cmns-av/abbreviation "EUR USD-Basis Swaps-11:00-ICAP",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/EUR_USD-Basis_Swaps-11_00-ICAP,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "EUR USD-Basis Swaps-11:00-ICAP"})

(def GBP-6M_LIBOR_SWAP-CME_vs_LCH-ICAP
  {:cmns-av/abbreviation "GBP-6M LIBOR SWAP-CME vs LCH-ICAP",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/GBP-6M_LIBOR_SWAP-CME_vs_LCH-ICAP,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "GBP-6M LIBOR SWAP-CME vs LCH-ICAP"})

(def GBP-6M_LIBOR_SWAP-CME_vs_LCH-ICAP-Bloomberg
  {:cmns-av/abbreviation "GBP-6M LIBOR SWAP-CME vs LCH-ICAP-Bloomberg",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/GBP-6M_LIBOR_SWAP-CME_vs_LCH-ICAP-Bloomberg,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/BloombergLP,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "GBP-6M LIBOR SWAP-CME vs LCH-ICAP-Bloomberg"})

(def GBP-6M_LIBOR_SWAP-EUREX_vs_LCH-ICAP
  {:cmns-av/abbreviation "GBP-6M LIBOR SWAP-EUREX vs LCH-ICAP",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/GBP-6M_LIBOR_SWAP-EUREX_vs_LCH-ICAP,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "GBP-6M LIBOR SWAP-EUREX vs LCH-ICAP"})

(def GBP-6M_LIBOR_SWAP-EUREX_vs_LCH-ICAP-Bloomberg
  {:cmns-av/abbreviation "GBP-6M LIBOR SWAP-EUREX vs LCH-ICAP-Bloomberg",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/GBP-6M_LIBOR_SWAP-EUREX_vs_LCH-ICAP-Bloomberg,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/BloombergLP,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "GBP-6M LIBOR SWAP-EUREX vs LCH-ICAP-Bloomberg"})

(def GBP-LIBOR
  {:cmns-av/abbreviation "GBP-LIBOR",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/GBP-LIBOR,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "GBP-LIBOR"})

(def GBP-LIBOR-ISDA
  {:cmns-av/abbreviation "GBP-LIBOR-ISDA",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/GBP-LIBOR-ISDA,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "GBP-LIBOR-ISDA"})

(def GBP-LIBOR-Reference_Banks
  {:cmns-av/abbreviation "GBP-LIBOR-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/GBP-LIBOR-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "GBP-LIBOR-Reference Banks"})

(def GBP-LIBOR_ICE_Swap_Rate
  {:cmns-av/abbreviation "GBP-LIBOR ICE Swap Rate",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/GBP-LIBOR_ICE_Swap_Rate,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "GBP-LIBOR ICE Swap Rate"})

(def GBP-RONIA
  {:cmns-av/abbreviation "GBP-RONIA",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/GBP-RONIA,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "GBP-RONIA"})

(def GBP-RONIA-OIS_Compound
  {:cmns-av/abbreviation "GBP-RONIA-OIS Compound",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/GBP-RONIA-OIS_Compound,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "GBP-RONIA-OIS Compound"})

(def GBP-SONIA
  {:cmns-av/abbreviation "GBP-SONIA",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/GBP-SONIA,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "GBP-SONIA"})

(def GBP-SONIA-OIS-11_00-ICAP
  {:cmns-av/abbreviation "GBP-SONIA-OIS-11:00-ICAP",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/GBP-SONIA-OIS-11_00-ICAP,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "GBP-SONIA-OIS-11:00-ICAP"})

(def GBP-SONIA-OIS-11_00-TRADITION
  {:cmns-av/abbreviation "GBP-SONIA-OIS-11:00-TRADITION",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/GBP-SONIA-OIS-11_00-TRADITION,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/Tradition,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "GBP-SONIA-OIS-11:00-TRADITION"})

(def GBP-SONIA-OIS-4_15-TRADITION
  {:cmns-av/abbreviation "GBP-SONIA-OIS-4:15-TRADITION",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/GBP-SONIA-OIS-4_15-TRADITION,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/Tradition,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "GBP-SONIA-OIS-4:15-TRADITION"})

(def GBP-SONIA-OIS_Compound
  {:cmns-av/abbreviation "GBP-SONIA-OIS Compound",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/GBP-SONIA-OIS_Compound,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "GBP-SONIA-OIS Compound"})

(def GBP-SONIA_Compounded_Index
  {:cmns-av/abbreviation "GBP-SONIA Compounded Index",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/GBP-SONIA_Compounded_Index,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "GBP-SONIA Compounded Index"})

(def GBP-SONIA_FTSE_Term
  {:cmns-av/abbreviation "GBP-SONIA FTSE Term",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/GBP-SONIA_FTSE_Term,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "GBP-SONIA FTSE Term"})

(def GBP-SONIA_ICE_Compounded_Index
  {:cmns-av/abbreviation "GBP-SONIA ICE Compounded Index",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/GBP-SONIA_ICE_Compounded_Index,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "GBP-SONIA ICE Compounded Index"})

(def GBP-SONIA_ICE_Compounded_Index_0_Floor
  {:cmns-av/abbreviation "GBP-SONIA ICE Compounded Index 0 Floor",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/GBP-SONIA_ICE_Compounded_Index_0_Floor,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "GBP-SONIA ICE Compounded Index 0 Floor"})

(def GBP-SONIA_ICE_Compounded_Index_0_Floor_2D_Lag
  {:cmns-av/abbreviation "GBP-SONIA ICE Compounded Index 0 Floor 2D Lag",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/GBP-SONIA_ICE_Compounded_Index_0_Floor_2D_Lag,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "GBP-SONIA ICE Compounded Index 0 Floor 2D Lag"})

(def GBP-SONIA_ICE_Compounded_Index_0_Floor_5D_Lag
  {:cmns-av/abbreviation "GBP-SONIA ICE Compounded Index 0 Floor 5D Lag",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/GBP-SONIA_ICE_Compounded_Index_0_Floor_5D_Lag,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "GBP-SONIA ICE Compounded Index 0 Floor 5D Lag"})

(def GBP-SONIA_ICE_Compounded_Index_2D_Lag
  {:cmns-av/abbreviation "GBP-SONIA ICE Compounded Index 2D Lag",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/GBP-SONIA_ICE_Compounded_Index_2D_Lag,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "GBP-SONIA ICE Compounded Index 2D Lag"})

(def GBP-SONIA_ICE_Compounded_Index_5D_Lag
  {:cmns-av/abbreviation "GBP-SONIA ICE Compounded Index 5D Lag",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/GBP-SONIA_ICE_Compounded_Index_5D_Lag,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "GBP-SONIA ICE Compounded Index 5D Lag"})

(def GBP-SONIA_ICE_Swap_Rate
  {:cmns-av/abbreviation "GBP-SONIA ICE Swap Rate",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/GBP-SONIA_ICE_Swap_Rate,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "GBP-SONIA ICE Swap Rate"})

(def GBP-SONIA_ICE_Term
  {:cmns-av/abbreviation "GBP-SONIA ICE Term",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/GBP-SONIA_ICE_Term,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "GBP-SONIA ICE Term"})

(def GBP-Semi-Annual_Swap_Rate
  {:cmns-av/abbreviation "GBP-Semi-Annual Swap Rate",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/GBP-Semi-Annual_Swap_Rate,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "GBP-Semi-Annual Swap Rate"})

(def GBP-Semi-Annual_Swap_Rate-11_00-ICAP
  {:cmns-av/abbreviation "GBP-Semi-Annual Swap Rate-11:00-ICAP",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/GBP-Semi-Annual_Swap_Rate-11_00-ICAP,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "GBP-Semi-Annual Swap Rate-11:00-ICAP"})

(def GBP-Semi-Annual_Swap_Rate-Reference_Banks
  {:cmns-av/abbreviation "GBP-Semi-Annual Swap Rate-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/GBP-Semi-Annual_Swap_Rate-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "GBP-Semi-Annual Swap Rate-Reference Banks"})

(def GBP-Semi-Annual_Swap_Rate-SwapMarker26
  {:cmns-av/abbreviation "GBP-Semi-Annual Swap Rate-SwapMarker26",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/GBP-Semi-Annual_Swap_Rate-SwapMarker26,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "GBP-Semi-Annual Swap Rate-SwapMarker26"})

(def GBP-Semi_Annual_Swap_Rate-11_00-TRADITION
  {:cmns-av/abbreviation "GBP-Semi Annual Swap Rate-11:00-TRADITION",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/GBP-Semi_Annual_Swap_Rate-11_00-TRADITION,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/Tradition,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "GBP-Semi Annual Swap Rate-11:00-TRADITION"})

(def GBP-Semi_Annual_Swap_Rate-4_15-TRADITION
  {:cmns-av/abbreviation "GBP-Semi Annual Swap Rate-4:15-TRADITION",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/GBP-Semi_Annual_Swap_Rate-4_15-TRADITION,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/Tradition,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "GBP-Semi Annual Swap Rate-4:15-TRADITION"})

(def GBP-UK_Base_Rate
  {:cmns-av/abbreviation "GBP-UK Base Rate",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/GBP-UK_Base_Rate,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "GBP-UK Base Rate"})

(def GBP_USD-Basis_Swaps-11_00-ICAP
  {:cmns-av/abbreviation "GBP USD-Basis Swaps-11:00-ICAP",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/GBP_USD-Basis_Swaps-11_00-ICAP,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PoundSterling,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "GBP USD-Basis Swaps-11:00-ICAP"})

(def GRD-ATHIBOR-ATHIBOR
  {:cmns-av/abbreviation "GRD-ATHIBOR-ATHIBOR",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/GRD-ATHIBOR-ATHIBOR,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "GRD-ATHIBOR-ATHIBOR"})

(def GRD-ATHIBOR-Reference_Banks
  {:cmns-av/abbreviation "GRD-ATHIBOR-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/GRD-ATHIBOR-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "GRD-ATHIBOR-Reference Banks"})

(def GRD-ATHIBOR-Telerate
  {:cmns-av/abbreviation "GRD-ATHIBOR-Telerate",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/GRD-ATHIBOR-Telerate,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/ThomsonReuters,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "GRD-ATHIBOR-Telerate"})

(def GRD-ATHIMID-Reference_Banks
  {:cmns-av/abbreviation "GRD-ATHIMID-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/GRD-ATHIMID-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "GRD-ATHIMID-Reference Banks"})

(def GRD-ATHIMID-Reuters
  {:cmns-av/abbreviation "GRD-ATHIMID-Reuters",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/GRD-ATHIMID-Reuters,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/ThomsonReuters,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "GRD-ATHIMID-Reuters"})

(def HKD-HIBOR
  {:cmns-av/abbreviation "HKD-HIBOR",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/HKD-HIBOR,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/HongKongDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "HKD-HIBOR"})

(def HKD-HIBOR-HIBOR-Bloomberg
  {:cmns-av/abbreviation "HKD-HIBOR-HIBOR-Bloomberg",
   :cmns-av/explanatoryNote
   #{"Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."
     "Deprecated usage: \"HKD-HIBOR-HIBOR-Bloomberg\" code has been deprecated in supplement 79 to the 2006 ISDA definitions (Removal of certain Hong Kong Rate Options.). The code is kept in FpML for backward compatibility purposes."},
   :db/ident :fibo-ind-ir-cm/HKD-HIBOR-HIBOR-Bloomberg,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/BloombergLP,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/HongKongDollar,
   :owl/deprecated true,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "HKD-HIBOR-HIBOR-Bloomberg"})

(def HKD-HIBOR-HIBOR_
  {:cmns-av/abbreviation "HKD-HIBOR-HIBOR=",
   :cmns-av/explanatoryNote
   #{"Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."
     "Deprecated usage: \"HKD-HIBOR-HIBOR=\" code has been deprecated in supplement 79 to the 2006 ISDA definitions (Removal of certain Hong Kong Rate Options.). The code is kept in FpML for backward compatibility purposes."},
   :db/ident :fibo-ind-ir-cm/HKD-HIBOR-HIBOR_,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/HongKongDollar,
   :owl/deprecated true,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "HKD-HIBOR-HIBOR="})

(def HKD-HIBOR-ISDC
  {:cmns-av/abbreviation "HKD-HIBOR-ISDC",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/HKD-HIBOR-ISDC,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/HongKongDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "HKD-HIBOR-ISDC"})

(def HKD-HIBOR-Reference_Banks
  {:cmns-av/abbreviation "HKD-HIBOR-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/HKD-HIBOR-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/HongKongDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "HKD-HIBOR-Reference Banks"})

(def HKD-HONIA
  {:cmns-av/abbreviation "HKD-HONIA",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/HKD-HONIA,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/HongKongDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "HKD-HONIA"})

(def HKD-HONIA-OIS_Compound
  {:cmns-av/abbreviation "HKD-HONIA-OIS Compound",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/HKD-HONIA-OIS_Compound,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/HongKongDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "HKD-HONIA-OIS Compound"})

(def HKD-ISDA-Swap_Rate-11_00
  {:cmns-av/abbreviation "HKD-ISDA-Swap Rate-11:00",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/HKD-ISDA-Swap_Rate-11_00,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/HongKongDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "HKD-ISDA-Swap Rate-11:00"})

(def HKD-ISDA-Swap_Rate-4_00
  {:cmns-av/abbreviation "HKD-ISDA-Swap Rate-4:00",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/HKD-ISDA-Swap_Rate-4_00,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/HongKongDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "HKD-ISDA-Swap Rate-4:00"})

(def HKD-Quarterly-Annual_Swap_Rate-11_00-BGCANTOR
  {:cmns-av/abbreviation "HKD-Quarterly-Annual Swap Rate-11:00-BGCANTOR",
   :cmns-av/explanatoryNote
   #{"Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."
     "Deprecated usage: \"HKD-Quarterly-Annual Swap Rate-11:00-BGCANTOR\" code has been deprecated in supplement 79 to the 2006 ISDA definitions (Removal of certain Hong Kong Rate Options.). The code is kept in FpML for backward compatibility purposes."},
   :db/ident :fibo-ind-ir-cm/HKD-Quarterly-Annual_Swap_Rate-11_00-BGCANTOR,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/FenicsMarketData,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/HongKongDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/ThreeMonths,
   :owl/deprecated true,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "HKD-Quarterly-Annual Swap Rate-11:00-BGCANTOR"})

(def HKD-Quarterly-Annual_Swap_Rate-11_00-TRADITION
  {:cmns-av/abbreviation "HKD-Quarterly-Annual Swap Rate-11:00-TRADITION",
   :cmns-av/explanatoryNote
   #{"Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."
     "Deprecated usage: \"HKD-Quarterly-Annual Swap Rate-11:00-TRADITION\" code has been deprecated in supplement 79 to the 2006 ISDA definitions (Removal of certain Hong Kong Rate Options.). The code is kept in FpML for backward compatibility purposes."},
   :db/ident :fibo-ind-ir-cm/HKD-Quarterly-Annual_Swap_Rate-11_00-TRADITION,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/Tradition,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/HongKongDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/ThreeMonths,
   :owl/deprecated true,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "HKD-Quarterly-Annual Swap Rate-11:00-TRADITION"})

(def HKD-Quarterly-Annual_Swap_Rate-4_00-BGCANTOR
  {:cmns-av/abbreviation "HKD-Quarterly-Annual Swap Rate-4:00-BGCANTOR",
   :cmns-av/explanatoryNote
   #{"Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."
     "Deprecated usage: \"HKD-Quarterly-Annual Swap Rate-4:00-BGCANTOR\" code has been deprecated in supplement 79 to the 2006 ISDA definitions (Removal of certain Hong Kong Rate Options.). The code is kept in FpML for backward compatibility purposes."},
   :db/ident :fibo-ind-ir-cm/HKD-Quarterly-Annual_Swap_Rate-4_00-BGCANTOR,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/FenicsMarketData,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/HongKongDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/ThreeMonths,
   :owl/deprecated true,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "HKD-Quarterly-Annual Swap Rate-4:00-BGCANTOR"})

(def HKD-Quarterly-Annual_Swap_Rate-Reference_Banks
  {:cmns-av/abbreviation "HKD-Quarterly-Annual Swap Rate-Reference Banks",
   :cmns-av/explanatoryNote
   #{"Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."
     "Deprecated usage: \"HKD-Quarterly-Annual Swap Rate-Reference Banks\" code has been deprecated in supplement 79 to the 2006 ISDA definitions (Removal of certain Hong Kong Rate Options.). The code is kept in FpML for backward compatibility purposes."},
   :db/ident :fibo-ind-ir-cm/HKD-Quarterly-Annual_Swap_Rate-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/HongKongDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/ThreeMonths,
   :owl/deprecated true,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "HKD-Quarterly-Annual Swap Rate-Reference Banks"})

(def HKD-Quarterly-Quarterly_Swap_Rate-11_00-ICAP
  {:cmns-av/abbreviation "HKD-Quarterly-Quarterly Swap Rate-11:00-ICAP",
   :cmns-av/explanatoryNote
   #{"Deprecated usage: \"HKD-Quarterly-Quarterly Swap Rate-11:00-ICAP\" code has been deprecated in supplement 79 to the 2006 ISDA definitions (Removal of certain Hong Kong Rate Options.). The code is kept in FpML for backward compatibility purposes."
     "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."},
   :db/ident :fibo-ind-ir-cm/HKD-Quarterly-Quarterly_Swap_Rate-11_00-ICAP,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/HongKongDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/ThreeMonths,
   :owl/deprecated true,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "HKD-Quarterly-Quarterly Swap Rate-11:00-ICAP"})

(def HKD-Quarterly-Quarterly_Swap_Rate-4_00-ICAP
  {:cmns-av/abbreviation "HKD-Quarterly-Quarterly Swap Rate-4:00-ICAP",
   :cmns-av/explanatoryNote
   #{"Deprecated usage: \"HKD-Quarterly-Quarterly Swap Rate-4:00-ICAP\" code has been deprecated in supplement 79 to the 2006 ISDA definitions (Removal of certain Hong Kong Rate Options.). The code is kept in FpML for backward compatibility purposes."
     "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."},
   :db/ident :fibo-ind-ir-cm/HKD-Quarterly-Quarterly_Swap_Rate-4_00-ICAP,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/HongKongDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/ThreeMonths,
   :owl/deprecated true,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "HKD-Quarterly-Quarterly Swap Rate-4:00-ICAP"})

(def HKD-Quarterly-Quarterly_Swap_Rate-Reference_Banks
  {:cmns-av/abbreviation "HKD-Quarterly-Quarterly Swap Rate-Reference Banks",
   :cmns-av/explanatoryNote
   #{"Deprecated usage: \"HKD-Quarterly-Quarterly Swap Rate-Reference Banks\" code has been deprecated in supplement 79 to the 2006 ISDA definitions (Removal of certain Hong Kong Rate Options.). The code is kept in FpML for backward compatibility purposes."
     "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."},
   :db/ident :fibo-ind-ir-cm/HKD-Quarterly-Quarterly_Swap_Rate-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/HongKongDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/ThreeMonths,
   :owl/deprecated true,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "HKD-Quarterly-Quarterly Swap Rate-Reference Banks"})

(def HUF-BUBOR
  {:cmns-av/abbreviation "HUF-BUBOR",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/HUF-BUBOR,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Forint,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "HUF-BUBOR"})

(def HUF-BUBOR-Reference_Banks
  {:cmns-av/abbreviation "HUF-BUBOR-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/HUF-BUBOR-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Forint,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "HUF-BUBOR-Reference Banks"})

(def HUF-HUFONIA
  {:cmns-av/abbreviation "HUF-HUFONIA",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/HUF-HUFONIA,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Forint,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "HUF-HUFONIA"})

(def HUF-HUFONIA-OIS_Compound
  {:cmns-av/abbreviation "HUF-HUFONIA-OIS Compound",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/HUF-HUFONIA-OIS_Compound,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Forint,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "HUF-HUFONIA-OIS Compound"})

(def IDR-IDMA-Bloomberg
  {:cmns-av/abbreviation "IDR-IDMA-Bloomberg",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/IDR-IDMA-Bloomberg,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/BloombergLP,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Rupiah,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "IDR-IDMA-Bloomberg"})

(def IDR-IDRFIX
  {:cmns-av/abbreviation "IDR-IDRFIX",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/IDR-IDRFIX,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Rupiah,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "IDR-IDRFIX"})

(def IDR-JIBOR
  {:cmns-av/abbreviation "IDR-JIBOR",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/IDR-JIBOR,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Rupiah,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "IDR-JIBOR"})

(def IDR-SBI-Reuters
  {:cmns-av/abbreviation "IDR-SBI-Reuters",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/IDR-SBI-Reuters,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/ThomsonReuters,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Rupiah,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "IDR-SBI-Reuters"})

(def IDR-SOR-Reference_Banks
  {:cmns-av/abbreviation "IDR-SOR-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/IDR-SOR-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Rupiah,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "IDR-SOR-Reference Banks"})

(def IDR-SOR-Reuters
  {:cmns-av/abbreviation "IDR-SOR-Reuters",
   :cmns-av/explanatoryNote
   #{"Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."
     "Deprecated usage: \"IDR-SOR-Reuters\" code has been deprecated in supplement 35 to the 2006 ISDA definitions. The code is kept in FpML for backward compatibility purposes."},
   :db/ident :fibo-ind-ir-cm/IDR-SOR-Reuters,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/ThomsonReuters,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Rupiah,
   :owl/deprecated true,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "IDR-SOR-Reuters"})

(def IDR-SOR-Telerate
  {:cmns-av/abbreviation "IDR-SOR-Telerate",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/IDR-SOR-Telerate,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/ThomsonReuters,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Rupiah,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "IDR-SOR-Telerate"})

(def IDR-Semi-Annual_Swap_Rate-11_00-BGCANTOR
  {:cmns-av/abbreviation "IDR-Semi-Annual Swap Rate-11:00-BGCANTOR",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/IDR-Semi-Annual_Swap_Rate-11_00-BGCANTOR,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/FenicsMarketData,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Rupiah,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "IDR-Semi-Annual Swap Rate-11:00-BGCANTOR"})

(def IDR-Semi-Annual_Swap_Rate-Reference_Banks
  {:cmns-av/abbreviation "IDR-Semi-Annual Swap Rate-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/IDR-Semi-Annual_Swap_Rate-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Rupiah,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "IDR-Semi-Annual Swap Rate-Reference Banks"})

(def IDR-Semi_Annual_Swap_Rate-Non-deliverable-16_00-Tullett_Prebon
  {:cmns-av/abbreviation
   "IDR-Semi Annual Swap Rate-Non-deliverable-16:00-Tullett Prebon",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident
   :fibo-ind-ir-cm/IDR-Semi_Annual_Swap_Rate-Non-deliverable-16_00-Tullett_Prebon,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Rupiah,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label
   "IDR-Semi Annual Swap Rate-Non-deliverable-16:00-Tullett Prebon"})

(def ILS-SHIR
  {:cmns-av/abbreviation "ILS-SHIR",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/ILS-SHIR,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/NewIsraeliSheqel,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "ILS-SHIR"})

(def ILS-SHIR-OIS_Compound
  {:cmns-av/abbreviation "ILS-SHIR-OIS Compound",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/ILS-SHIR-OIS_Compound,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/NewIsraeliSheqel,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "ILS-SHIR-OIS Compound"})

(def ILS-TELBOR
  {:cmns-av/abbreviation "ILS-TELBOR",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/ILS-TELBOR,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/NewIsraeliSheqel,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "ILS-TELBOR"})

(def ILS-TELBOR-Reference_Banks
  {:cmns-av/abbreviation "ILS-TELBOR-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/ILS-TELBOR-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/NewIsraeliSheqel,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "ILS-TELBOR-Reference Banks"})

(def INR-BMK
  {:cmns-av/abbreviation "INR-BMK",
   :cmns-av/explanatoryNote
   #{"Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."
     "Deprecated usage: \"INR-BMK\" code has been deprecated in supplement 54 to the 2006 ISDA definitions. The code is kept in FpML for backward compatibility purposes."},
   :db/ident :fibo-ind-ir-cm/INR-BMK,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/IndianRupee,
   :owl/deprecated true,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "INR-BMK"})

(def INR-CMT
  {:cmns-av/abbreviation "INR-CMT",
   :cmns-av/explanatoryNote
   #{"Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."
     "Deprecated usage: \"INR-CMT\" code has been deprecated in supplement 54 to the 2006 ISDA definitions. The code is kept in FpML for backward compatibility purposes."},
   :db/ident :fibo-ind-ir-cm/INR-CMT,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/IndianRupee,
   :owl/deprecated true,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "INR-CMT"})

(def INR-INBMK-REUTERS
  {:cmns-av/abbreviation "INR-INBMK-REUTERS",
   :cmns-av/explanatoryNote
   #{"Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."
     "Deprecated usage: \"INR-INBMK-REUTERS\" code has been deprecated in supplement 54 to the 2006 ISDA definitions. The code is kept in FpML for backward compatibility purposes."},
   :db/ident :fibo-ind-ir-cm/INR-INBMK-REUTERS,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/IndianRupee,
   :owl/deprecated true,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "INR-INBMK-REUTERS"})

(def INR-MIBOR-OIS-COMPOUND
  {:cmns-av/abbreviation "INR-MIBOR-OIS-COMPOUND",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/INR-MIBOR-OIS-COMPOUND,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/IndianRupee,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "INR-MIBOR-OIS-COMPOUND"})

(def INR-MIBOR-OIS_Compound
  {:cmns-av/abbreviation "INR-MIBOR-OIS Compound",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/INR-MIBOR-OIS_Compound,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/IndianRupee,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "INR-MIBOR-OIS Compound"})

(def INR-MIBOR_OIS
  {:cmns-av/abbreviation "INR-MIBOR OIS",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/INR-MIBOR_OIS,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/IndianRupee,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "INR-MIBOR OIS"})

(def INR-MIFOR
  {:cmns-av/abbreviation "INR-MIFOR",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/INR-MIFOR,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/IndianRupee,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "INR-MIFOR"})

(def INR-MITOR-OIS-COMPOUND
  {:cmns-av/abbreviation "INR-MITOR-OIS-COMPOUND",
   :cmns-av/explanatoryNote
   #{"Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."
     "Deprecated usage: \"INR-MITOR-OIS-COMPOUND\" code has been deprecated in supplement 54 to the 2006 ISDA definitions. The code is kept in FpML for backward compatibility purposes."},
   :db/ident :fibo-ind-ir-cm/INR-MITOR-OIS-COMPOUND,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/IndianRupee,
   :owl/deprecated true,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "INR-MITOR-OIS-COMPOUND"})

(def INR-Modified_MIFOR
  {:cmns-av/abbreviation "INR-Modified MIFOR",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/INR-Modified_MIFOR,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/IndianRupee,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "INR-Modified MIFOR"})

(def INR-Reference_Banks
  {:cmns-av/abbreviation "INR-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/INR-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/IndianRupee,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "INR-Reference Banks"})

(def INR-Semi-Annual_Swap_Rate-11_30-BGCANTOR
  {:cmns-av/abbreviation "INR-Semi-Annual Swap Rate-11:30-BGCANTOR",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/INR-Semi-Annual_Swap_Rate-11_30-BGCANTOR,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/FenicsMarketData,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/IndianRupee,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "INR-Semi-Annual Swap Rate-11:30-BGCANTOR"})

(def INR-Semi-Annual_Swap_Rate-Reference_Banks
  {:cmns-av/abbreviation "INR-Semi-Annual Swap Rate-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/INR-Semi-Annual_Swap_Rate-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/IndianRupee,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "INR-Semi-Annual Swap Rate-Reference Banks"})

(def INR-Semi_Annual_Swap_Rate-Non-deliverable-16_00-Tullett_Prebon
  {:cmns-av/abbreviation
   "INR-Semi Annual Swap Rate-Non-deliverable-16:00-Tullett Prebon",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident
   :fibo-ind-ir-cm/INR-Semi_Annual_Swap_Rate-Non-deliverable-16_00-Tullett_Prebon,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/IndianRupee,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label
   "INR-Semi Annual Swap Rate-Non-deliverable-16:00-Tullett Prebon"})

(def ISK-REIBOR
  {:cmns-av/abbreviation "ISK-REIBOR",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/ISK-REIBOR,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/IcelandKrona,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "ISK-REIBOR"})

(def ISK-REIBOR-Reference_Banks
  {:cmns-av/abbreviation "ISK-REIBOR-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/ISK-REIBOR-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/IcelandKrona,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "ISK-REIBOR-Reference Banks"})

(def JPY-Annual_Swap_Rate-11_00-TRADITION
  {:cmns-av/abbreviation "JPY-Annual Swap Rate-11:00-TRADITION",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/JPY-Annual_Swap_Rate-11_00-TRADITION,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/Tradition,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "JPY-Annual Swap Rate-11:00-TRADITION"})

(def JPY-Annual_Swap_Rate-3_00-TRADITION
  {:cmns-av/abbreviation "JPY-Annual Swap Rate-3:00-TRADITION",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/JPY-Annual_Swap_Rate-3_00-TRADITION,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/Tradition,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "JPY-Annual Swap Rate-3:00-TRADITION"})

(def JPY-BBSF-Bloomberg-10_00
  {:cmns-av/abbreviation "JPY-BBSF-Bloomberg-10:00",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/JPY-BBSF-Bloomberg-10_00,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "JPY-BBSF-Bloomberg-10:00"})

(def JPY-BBSF-Bloomberg-15_00
  {:cmns-av/abbreviation "JPY-BBSF-Bloomberg-15:00",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/JPY-BBSF-Bloomberg-15_00,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "JPY-BBSF-Bloomberg-15:00"})

(def JPY-Euroyen_TIBOR
  {:cmns-av/abbreviation "JPY-Euroyen TIBOR",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/JPY-Euroyen_TIBOR,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "JPY-Euroyen TIBOR"})

(def JPY-ISDA-Swap_Rate-10_00
  {:cmns-av/abbreviation "JPY-ISDA-Swap Rate-10:00",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/JPY-ISDA-Swap_Rate-10_00,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "JPY-ISDA-Swap Rate-10:00"})

(def JPY-ISDA-Swap_Rate-15_00
  {:cmns-av/abbreviation "JPY-ISDA-Swap Rate-15:00",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/JPY-ISDA-Swap_Rate-15_00,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "JPY-ISDA-Swap Rate-15:00"})

(def JPY-LIBOR
  {:cmns-av/abbreviation "JPY-LIBOR",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/JPY-LIBOR,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "JPY-LIBOR"})

(def JPY-LIBOR-ISDA
  {:cmns-av/abbreviation "JPY-LIBOR-ISDA",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/JPY-LIBOR-ISDA,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "JPY-LIBOR-ISDA"})

(def JPY-LIBOR-Reference_Banks
  {:cmns-av/abbreviation "JPY-LIBOR-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/JPY-LIBOR-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "JPY-LIBOR-Reference Banks"})

(def JPY-LIBOR_TSR-10_00
  {:cmns-av/abbreviation "JPY-LIBOR TSR-10:00",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/JPY-LIBOR_TSR-10_00,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "JPY-LIBOR TSR-10:00"})

(def JPY-LIBOR_TSR-15_00
  {:cmns-av/abbreviation "JPY-LIBOR TSR-15:00",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/JPY-LIBOR_TSR-15_00,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "JPY-LIBOR TSR-15:00"})

(def JPY-LTPR-TBC
  {:cmns-av/abbreviation "JPY-LTPR-TBC",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/JPY-LTPR-TBC,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "JPY-LTPR-TBC"})

(def JPY-LTPR_MHBK
  {:cmns-av/abbreviation "JPY-LTPR MHBK",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/JPY-LTPR_MHBK,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "JPY-LTPR MHBK"})

(def JPY-MUTANCALL-TONAR
  {:cmns-av/abbreviation "JPY-MUTANCALL-TONAR",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/JPY-MUTANCALL-TONAR,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "JPY-MUTANCALL-TONAR"})

(def JPY-OIS-11_00-ICAP
  {:cmns-av/abbreviation "JPY-OIS-11:00-ICAP",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/JPY-OIS-11_00-ICAP,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "JPY-OIS-11:00-ICAP"})

(def JPY-OIS-11_00-TRADITION
  {:cmns-av/abbreviation "JPY-OIS-11:00-TRADITION",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/JPY-OIS-11_00-TRADITION,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/Tradition,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "JPY-OIS-11:00-TRADITION"})

(def JPY-OIS-3_00-TRADITION
  {:cmns-av/abbreviation "JPY-OIS-3:00-TRADITION",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/JPY-OIS-3_00-TRADITION,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/Tradition,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "JPY-OIS-3:00-TRADITION"})

(def JPY-Quoting_Banks-LIBOR
  {:cmns-av/abbreviation "JPY-Quoting Banks-LIBOR",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/JPY-Quoting_Banks-LIBOR,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "JPY-Quoting Banks-LIBOR"})

(def JPY-STPR-Quoting_Banks
  {:cmns-av/abbreviation "JPY-STPR-Quoting Banks",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/JPY-STPR-Quoting_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "JPY-STPR-Quoting Banks"})

(def JPY-TIBOR
  {:cmns-av/abbreviation "JPY-TIBOR",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/JPY-TIBOR,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "JPY-TIBOR"})

(def JPY-TIBOR-17096
  {:cmns-av/abbreviation "JPY-TIBOR-17096",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/JPY-TIBOR-17096,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "JPY-TIBOR-17096"})

(def JPY-TIBOR-DTIBOR01
  {:cmns-av/abbreviation "JPY-TIBOR-DTIBOR01",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/JPY-TIBOR-DTIBOR01,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "JPY-TIBOR-DTIBOR01"})

(def JPY-TIBOR-TIBM
  {:cmns-av/abbreviation "JPY-TIBOR-TIBM",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/JPY-TIBOR-TIBM,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "JPY-TIBOR-TIBM"})

(def JPY-TIBOR-TIBM-Reference_Banks
  {:cmns-av/abbreviation "JPY-TIBOR-TIBM-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/JPY-TIBOR-TIBM-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "JPY-TIBOR-TIBM-Reference Banks"})

(def JPY-TIBOR-TIBM_10_Banks
  {:cmns-av/abbreviation "JPY-TIBOR-TIBM (10 Banks)",
   :cmns-av/explanatoryNote
   #{"Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."
     "Deprecated usage: \"JPY-TIBOR-TIBM (10 Banks)\" code has been deprecated in supplement 47 to the 2006 ISDA definitions. The code is kept in FpML for backward compatibility purposes."},
   :db/ident :fibo-ind-ir-cm/JPY-TIBOR-TIBM_10_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :owl/deprecated true,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "JPY-TIBOR-TIBM (10 Banks)"})

(def JPY-TIBOR-TIBM_5_Banks
  {:cmns-av/abbreviation "JPY-TIBOR-TIBM (5 Banks)",
   :cmns-av/explanatoryNote
   #{"Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."
     "Deprecated usage: \"JPY-TIBOR-TIBM (5 Banks)\" code has been deprecated in supplement 47 to the 2006 ISDA definitions. The code is kept in FpML for backward compatibility purposes."},
   :db/ident :fibo-ind-ir-cm/JPY-TIBOR-TIBM_5_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :owl/deprecated true,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "JPY-TIBOR-TIBM (5 Banks)"})

(def JPY-TIBOR-TIBM_All_Banks
  {:cmns-av/abbreviation "JPY-TIBOR-TIBM (All Banks)",
   :cmns-av/explanatoryNote
   #{"Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."
     "Deprecated usage: \"JPY-TIBOR-TIBM (All Banks)\" code has been deprecated in supplement 47 to the 2006 ISDA definitions. The code is kept in FpML for backward compatibility purposes."},
   :db/ident :fibo-ind-ir-cm/JPY-TIBOR-TIBM_All_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :owl/deprecated true,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "JPY-TIBOR-TIBM (All Banks)"})

(def JPY-TONA
  {:cmns-av/abbreviation "JPY-TONA",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/JPY-TONA,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "JPY-TONA"})

(def JPY-TONA-OIS_Compound
  {:cmns-av/abbreviation "JPY-TONA-OIS Compound",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/JPY-TONA-OIS_Compound,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "JPY-TONA-OIS Compound"})

(def JPY-TONA_Average_180D
  {:cmns-av/abbreviation "JPY-TONA Average 180D",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/JPY-TONA_Average_180D,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "JPY-TONA Average 180D"})

(def JPY-TONA_Average_30D
  {:cmns-av/abbreviation "JPY-TONA Average 30D",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/JPY-TONA_Average_30D,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "JPY-TONA Average 30D"})

(def JPY-TONA_Average_90D
  {:cmns-av/abbreviation "JPY-TONA Average 90D",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/JPY-TONA_Average_90D,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "JPY-TONA Average 90D"})

(def JPY-TONA_Compounded_Index
  {:cmns-av/abbreviation "JPY-TONA Compounded Index",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/JPY-TONA_Compounded_Index,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "JPY-TONA Compounded Index"})

(def JPY-TONA_ICE_Compounded_Index
  {:cmns-av/abbreviation "JPY-TONA ICE Compounded Index",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/JPY-TONA_ICE_Compounded_Index,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "JPY-TONA ICE Compounded Index"})

(def JPY-TONA_ICE_Compounded_Index_0_Floor
  {:cmns-av/abbreviation "JPY-TONA ICE Compounded Index 0 Floor",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/JPY-TONA_ICE_Compounded_Index_0_Floor,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "JPY-TONA ICE Compounded Index 0 Floor"})

(def JPY-TONA_ICE_Compounded_Index_0_Floor_2D_Lag
  {:cmns-av/abbreviation "JPY-TONA ICE Compounded Index 0 Floor 2D Lag",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/JPY-TONA_ICE_Compounded_Index_0_Floor_2D_Lag,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "JPY-TONA ICE Compounded Index 0 Floor 2D Lag"})

(def JPY-TONA_ICE_Compounded_Index_0_Floor_5D_Lag
  {:cmns-av/abbreviation "JPY-TONA ICE Compounded Index 0 Floor 5D Lag",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/JPY-TONA_ICE_Compounded_Index_0_Floor_5D_Lag,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "JPY-TONA ICE Compounded Index 0 Floor 5D Lag"})

(def JPY-TONA_ICE_Compounded_Index_2D_Lag
  {:cmns-av/abbreviation "JPY-TONA ICE Compounded Index 2D Lag",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/JPY-TONA_ICE_Compounded_Index_2D_Lag,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "JPY-TONA ICE Compounded Index 2D Lag"})

(def JPY-TONA_ICE_Compounded_Index_5D_Lag
  {:cmns-av/abbreviation "JPY-TONA ICE Compounded Index 5D Lag",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/JPY-TONA_ICE_Compounded_Index_5D_Lag,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "JPY-TONA ICE Compounded Index 5D Lag"})

(def JPY-TONA_TSR-10_00
  {:cmns-av/abbreviation "JPY-TONA TSR-10:00",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/JPY-TONA_TSR-10_00,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "JPY-TONA TSR-10:00"})

(def JPY-TONA_TSR-15_00
  {:cmns-av/abbreviation "JPY-TONA TSR-15:00",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/JPY-TONA_TSR-15_00,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "JPY-TONA TSR-15:00"})

(def JPY-TORF_QUICK
  {:cmns-av/abbreviation "JPY-TORF QUICK",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/JPY-TORF_QUICK,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "JPY-TORF QUICK"})

(def JPY-TSR-Reference_Banks
  {:cmns-av/abbreviation "JPY-TSR-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/JPY-TSR-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "JPY-TSR-Reference Banks"})

(def JPY-TSR-Telerate-10_00
  {:cmns-av/abbreviation "JPY-TSR-Telerate-10:00",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/JPY-TSR-Telerate-10_00,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "JPY-TSR-Telerate-10:00"})

(def JPY-TSR-Telerate-15_00
  {:cmns-av/abbreviation "JPY-TSR-Telerate-15:00",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/JPY-TSR-Telerate-15_00,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "JPY-TSR-Telerate-15:00"})

(def JPY_USD-Basis_Swaps-11_00-ICAP
  {:cmns-av/abbreviation "JPY USD-Basis Swaps-11:00-ICAP",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/JPY_USD-Basis_Swaps-11_00-ICAP,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Yen,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "JPY USD-Basis Swaps-11:00-ICAP"})

(def KRW-Bond-3222
  {:cmns-av/abbreviation "KRW-Bond-3222",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/KRW-Bond-3222,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Won,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "KRW-Bond-3222"})

(def KRW-CD_91D
  {:cmns-av/abbreviation "KRW-CD 91D",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/KRW-CD_91D,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Won,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "KRW-CD 91D"})

(def KRW-KOFR
  {:cmns-av/abbreviation "KRW-KOFR",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/KRW-KOFR,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Won,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "KRW-KOFR"})

(def KRW-KOFR-OIS_Compound
  {:cmns-av/abbreviation "KRW-KOFR-OIS Compound",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/KRW-KOFR-OIS_Compound,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Won,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "KRW-KOFR-OIS Compound"})

(def KRW-Quarterly_Annual_Swap_Rate-3_30-ICAP
  {:cmns-av/abbreviation "KRW-Quarterly Annual Swap Rate-3:30-ICAP",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/KRW-Quarterly_Annual_Swap_Rate-3_30-ICAP,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Won,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/ThreeMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "KRW-Quarterly Annual Swap Rate-3:30-ICAP"})

(def MXN-TIIE
  {:cmns-av/abbreviation "MXN-TIIE",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/MXN-TIIE,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/MexicanPeso,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "MXN-TIIE"})

(def MXN-TIIE-Banxico-Reference_Banks
  {:cmns-av/abbreviation "MXN-TIIE-Banxico-Reference Banks",
   :cmns-av/explanatoryNote
   #{"Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."
     "Deprecated usage: MXN-TIIE-Banxico-Reference Banks. It was added to FpML in error, MXN-TIIE-Reference Banks should be used instead."},
   :db/ident :fibo-ind-ir-cm/MXN-TIIE-Banxico-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/MexicanPeso,
   :owl/deprecated true,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "MXN-TIIE-Banxico-Reference Banks"})

(def MXN-TIIE-Reference_Banks
  {:cmns-av/abbreviation "MXN-TIIE-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/MXN-TIIE-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/MexicanPeso,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "MXN-TIIE-Reference Banks"})

(def MXN-TIIE_ON
  {:cmns-av/abbreviation "MXN-TIIE ON",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/MXN-TIIE_ON,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/MexicanPeso,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "MXN-TIIE ON"})

(def MXN-TIIE_ON-OIS_Compound
  {:cmns-av/abbreviation "MXN-TIIE ON-OIS Compound",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/MXN-TIIE_ON-OIS_Compound,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/MexicanPeso,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "MXN-TIIE ON-OIS Compound"})

(def MYR-KLIBOR
  {:cmns-av/abbreviation "MYR-KLIBOR",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/MYR-KLIBOR,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/MalaysianRinggit,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "MYR-KLIBOR"})

(def MYR-KLIBOR-Reference_Banks
  {:cmns-av/abbreviation "MYR-KLIBOR-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/MYR-KLIBOR-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/MalaysianRinggit,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "MYR-KLIBOR-Reference Banks"})

(def MYR-MYOR
  {:cmns-av/abbreviation "MYR-MYOR",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/MYR-MYOR,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/MalaysianRinggit,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "MYR-MYOR"})

(def MYR-MYOR-OIS_Compound
  {:cmns-av/abbreviation "MYR-MYOR-OIS Compound",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/MYR-MYOR-OIS_Compound,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/MalaysianRinggit,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "MYR-MYOR-OIS Compound"})

(def MYR-Quarterly_Swap_Rate-11_00-TRADITION
  {:cmns-av/abbreviation "MYR-Quarterly Swap Rate-11:00-TRADITION",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/MYR-Quarterly_Swap_Rate-11_00-TRADITION,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/Tradition,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/MalaysianRinggit,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/ThreeMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "MYR-Quarterly Swap Rate-11:00-TRADITION"})

(def MYR-Quarterly_Swap_Rate-TRADITION-Reference_Banks
  {:cmns-av/abbreviation "MYR-Quarterly Swap Rate-TRADITION-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/MYR-Quarterly_Swap_Rate-TRADITION-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/MalaysianRinggit,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/ThreeMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "MYR-Quarterly Swap Rate-TRADITION-Reference Banks"})

(def NOK-NIBOR
  {:cmns-av/abbreviation "NOK-NIBOR",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/NOK-NIBOR,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/NorwegianKrone,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "NOK-NIBOR"})

(def NOK-NIBOR-NIBR
  {:cmns-av/abbreviation "NOK-NIBOR-NIBR",
   :cmns-av/explanatoryNote
   #{"Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."
     "Deprecated usage: \"NOK-NIBOR-NIBR\" code has been deprecated in supplement 49 to the 2006 ISDA definitions. The code is kept in FpML for backward compatibility purposes."},
   :db/ident :fibo-ind-ir-cm/NOK-NIBOR-NIBR,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/NorwegianKrone,
   :owl/deprecated true,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "NOK-NIBOR-NIBR"})

(def NOK-NIBOR-NIBR-Reference_Banks
  {:cmns-av/abbreviation "NOK-NIBOR-NIBR-Reference Banks",
   :cmns-av/explanatoryNote
   #{"Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."
     "Deprecated usage: NOK-NIBOR-NIBR-Reference Banks. It was added to FpML in error, NOK-NIBOR-Reference Banks should be used instead."},
   :db/ident :fibo-ind-ir-cm/NOK-NIBOR-NIBR-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/NorwegianKrone,
   :owl/deprecated true,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "NOK-NIBOR-NIBR-Reference Banks"})

(def NOK-NIBOR-Reference_Banks
  {:cmns-av/abbreviation "NOK-NIBOR-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/NOK-NIBOR-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/NorwegianKrone,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "NOK-NIBOR-Reference Banks"})

(def NOK-NOWA
  {:cmns-av/abbreviation "NOK-NOWA",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/NOK-NOWA,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/NorwegianKrone,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "NOK-NOWA"})

(def NOK-NOWA-OIS_Compound
  {:cmns-av/abbreviation "NOK-NOWA-OIS Compound",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/NOK-NOWA-OIS_Compound,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/NorwegianKrone,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "NOK-NOWA-OIS Compound"})

(def NZD-BBR-ISDC
  {:cmns-av/abbreviation "NZD-BBR-ISDC",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/NZD-BBR-ISDC,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/NewZealandDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "NZD-BBR-ISDC"})

(def NZD-BBR-Reference_Banks
  {:cmns-av/abbreviation "NZD-BBR-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/NZD-BBR-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/NewZealandDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "NZD-BBR-Reference Banks"})

(def NZD-BBR-Telerate
  {:cmns-av/abbreviation "NZD-BBR-Telerate",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/NZD-BBR-Telerate,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/ThomsonReuters,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/NewZealandDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "NZD-BBR-Telerate"})

(def NZD-BKBM_Bid
  {:cmns-av/abbreviation "NZD-BKBM Bid",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/NZD-BKBM_Bid,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/NewZealandDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "NZD-BKBM Bid"})

(def NZD-BKBM_FRA
  {:cmns-av/abbreviation "NZD-BKBM FRA",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/NZD-BKBM_FRA,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/NewZealandDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "NZD-BKBM FRA"})

(def NZD-BKBM_FRA_Swap_Rate_ICAP
  {:cmns-av/abbreviation "NZD-BKBM FRA Swap Rate ICAP",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/NZD-BKBM_FRA_Swap_Rate_ICAP,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/NewZealandDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "NZD-BKBM FRA Swap Rate ICAP"})

(def NZD-NZIONA
  {:cmns-av/abbreviation "NZD-NZIONA",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/NZD-NZIONA,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/NewZealandDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "NZD-NZIONA"})

(def NZD-NZIONA-OIS_Compound
  {:cmns-av/abbreviation "NZD-NZIONA-OIS Compound",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/NZD-NZIONA-OIS_Compound,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/NewZealandDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "NZD-NZIONA-OIS Compound"})

(def NZD-Semi-Annual_Swap_Rate-11_00-BGCANTOR
  {:cmns-av/abbreviation "NZD-Semi-Annual Swap Rate-11:00-BGCANTOR",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/NZD-Semi-Annual_Swap_Rate-11_00-BGCANTOR,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/FenicsMarketData,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/NewZealandDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "NZD-Semi-Annual Swap Rate-11:00-BGCANTOR"})

(def NZD-Semi-Annual_Swap_Rate-BGCANTOR-Reference_Banks
  {:cmns-av/abbreviation "NZD-Semi-Annual Swap Rate-BGCANTOR-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/NZD-Semi-Annual_Swap_Rate-BGCANTOR-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/NewZealandDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "NZD-Semi-Annual Swap Rate-BGCANTOR-Reference Banks"})

(def NZD-Swap_Rate-ICAP-Reference_Banks
  {:cmns-av/abbreviation "NZD-Swap Rate-ICAP-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/NZD-Swap_Rate-ICAP-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/NewZealandDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "NZD-Swap Rate-ICAP-Reference Banks"})

(def PHP-PHIREF
  {:cmns-av/abbreviation "PHP-PHIREF",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/PHP-PHIREF,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PhilippinePeso,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "PHP-PHIREF"})

(def PHP-PHIREF-BAP
  {:cmns-av/abbreviation "PHP-PHIREF-BAP",
   :cmns-av/explanatoryNote
   #{"Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."
     "Deprecated usage: \"PHP-PHIREF-BAP\" code has been deprecated in supplement 45 to the 2006 ISDA definitions. The code is kept in FpML for backward compatibility purposes."},
   :db/ident :fibo-ind-ir-cm/PHP-PHIREF-BAP,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PhilippinePeso,
   :owl/deprecated true,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "PHP-PHIREF-BAP"})

(def PHP-PHIREF-Reference_Banks
  {:cmns-av/abbreviation "PHP-PHIREF-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/PHP-PHIREF-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PhilippinePeso,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "PHP-PHIREF-Reference Banks"})

(def PHP-Semi-Annual_Swap_Rate-11_00-BGCANTOR
  {:cmns-av/abbreviation "PHP-Semi-Annual Swap Rate-11:00-BGCANTOR",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/PHP-Semi-Annual_Swap_Rate-11_00-BGCANTOR,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/FenicsMarketData,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PhilippinePeso,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "PHP-Semi-Annual Swap Rate-11:00-BGCANTOR"})

(def PHP-Semi-Annual_Swap_Rate-Reference_Banks
  {:cmns-av/abbreviation "PHP-Semi-Annual Swap Rate-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/PHP-Semi-Annual_Swap_Rate-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/PhilippinePeso,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "PHP-Semi-Annual Swap Rate-Reference Banks"})

(def PLN-POLONIA
  {:cmns-av/abbreviation "PLN-POLONIA",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/PLN-POLONIA,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Zloty,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "PLN-POLONIA"})

(def PLN-POLONIA-OIS_Compound
  {:cmns-av/abbreviation "PLN-POLONIA-OIS Compound",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/PLN-POLONIA-OIS_Compound,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Zloty,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "PLN-POLONIA-OIS Compound"})

(def PLN-WIBID
  {:cmns-av/abbreviation "PLN-WIBID",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/PLN-WIBID,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Zloty,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "PLN-WIBID"})

(def PLN-WIBOR
  {:cmns-av/abbreviation "PLN-WIBOR",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/PLN-WIBOR,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Zloty,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "PLN-WIBOR"})

(def PLN-WIBOR-Reference_Banks
  {:cmns-av/abbreviation "PLN-WIBOR-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/PLN-WIBOR-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Zloty,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "PLN-WIBOR-Reference Banks"})

(def PLN-WIRON
  {:cmns-av/abbreviation "PLN-WIRON",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/PLN-WIRON,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Zloty,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "PLN-WIRON"})

(def PLN-WIRON-OIS_Compound
  {:cmns-av/abbreviation "PLN-WIRON-OIS Compound",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/PLN-WIRON-OIS_Compound,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Zloty,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "PLN-WIRON-OIS Compound"})

(def PLZ-WIBOR-Reference_Banks
  {:cmns-av/abbreviation "PLZ-WIBOR-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/PLZ-WIBOR-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Zloty,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "PLZ-WIBOR-Reference Banks"})

(def PLZ-WIBOR-WIBO
  {:cmns-av/abbreviation "PLZ-WIBOR-WIBO",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/PLZ-WIBOR-WIBO,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Zloty,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "PLZ-WIBOR-WIBO"})

(def REPOFUNDS_RATE-FRANCE-OIS-COMPOUND
  {:cmns-av/abbreviation "REPOFUNDS RATE-FRANCE-OIS-COMPOUND",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/REPOFUNDS_RATE-FRANCE-OIS-COMPOUND,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "REPOFUNDS RATE-FRANCE-OIS-COMPOUND"})

(def REPOFUNDS_RATE-GERMANY-OIS-COMPOUND
  {:cmns-av/abbreviation "REPOFUNDS RATE-GERMANY-OIS-COMPOUND",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/REPOFUNDS_RATE-GERMANY-OIS-COMPOUND,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "REPOFUNDS RATE-GERMANY-OIS-COMPOUND"})

(def REPOFUNDS_RATE-ITALY-OIS-COMPOUND
  {:cmns-av/abbreviation "REPOFUNDS RATE-ITALY-OIS-COMPOUND",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/REPOFUNDS_RATE-ITALY-OIS-COMPOUND,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "REPOFUNDS RATE-ITALY-OIS-COMPOUND"})

(def RON-Annual_Swap_Rate-11_00-BGCANTOR
  {:cmns-av/abbreviation "RON-Annual Swap Rate-11:00-BGCANTOR",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/RON-Annual_Swap_Rate-11_00-BGCANTOR,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/FenicsMarketData,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/RomanianLeu,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "RON-Annual Swap Rate-11:00-BGCANTOR"})

(def RON-Annual_Swap_Rate-Reference_Banks
  {:cmns-av/abbreviation "RON-Annual Swap Rate-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/RON-Annual_Swap_Rate-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/RomanianLeu,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "RON-Annual Swap Rate-Reference Banks"})

(def RON-ROBID
  {:cmns-av/abbreviation "RON-ROBID",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/RON-ROBID,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/RomanianLeu,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "RON-ROBID"})

(def RON-ROBOR
  {:cmns-av/abbreviation "RON-ROBOR",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/RON-ROBOR,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/RomanianLeu,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "RON-ROBOR"})

(def RUB-Annual_Swap_Rate-11_00-BGCANTOR
  {:cmns-av/abbreviation "RUB-Annual Swap Rate-11:00-BGCANTOR",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/RUB-Annual_Swap_Rate-11_00-BGCANTOR,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/FenicsMarketData,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/RussianRuble,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "RUB-Annual Swap Rate-11:00-BGCANTOR"})

(def RUB-Annual_Swap_Rate-12_45-TRADITION
  {:cmns-av/abbreviation "RUB-Annual Swap Rate-12:45-TRADITION",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/RUB-Annual_Swap_Rate-12_45-TRADITION,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/Tradition,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/RussianRuble,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "RUB-Annual Swap Rate-12:45-TRADITION"})

(def RUB-Annual_Swap_Rate-4_15-TRADITION
  {:cmns-av/abbreviation "RUB-Annual Swap Rate-4:15-TRADITION",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/RUB-Annual_Swap_Rate-4_15-TRADITION,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/Tradition,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/RussianRuble,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "RUB-Annual Swap Rate-4:15-TRADITION"})

(def RUB-Annual_Swap_Rate-Reference_Banks
  {:cmns-av/abbreviation "RUB-Annual Swap Rate-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/RUB-Annual_Swap_Rate-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/RussianRuble,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "RUB-Annual Swap Rate-Reference Banks"})

(def RUB-Annual_Swap_Rate-TRADITION-Reference_Banks
  {:cmns-av/abbreviation "RUB-Annual Swap Rate-TRADITION-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/RUB-Annual_Swap_Rate-TRADITION-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/RussianRuble,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "RUB-Annual Swap Rate-TRADITION-Reference Banks"})

(def RUB-Key_Rate_CBRF
  {:cmns-av/abbreviation "RUB-Key Rate CBRF",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/RUB-Key_Rate_CBRF,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/RussianRuble,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "RUB-Key Rate CBRF"})

(def RUB-MOSPRIME-Reference_Banks
  {:cmns-av/abbreviation "RUB-MOSPRIME-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/RUB-MOSPRIME-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/RussianRuble,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "RUB-MOSPRIME-Reference Banks"})

(def RUB-MosPrime
  {:cmns-av/abbreviation "RUB-MosPrime",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/RUB-MosPrime,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/RussianRuble,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "RUB-MosPrime"})

(def RUB-RUONIA
  {:cmns-av/abbreviation "RUB-RUONIA",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/RUB-RUONIA,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/RussianRuble,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "RUB-RUONIA"})

(def RUB-RUONIA-OIS_Compound
  {:cmns-av/abbreviation "RUB-RUONIA-OIS Compound",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/RUB-RUONIA-OIS_Compound,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/RussianRuble,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "RUB-RUONIA-OIS Compound"})

(def SAR-SAIBOR
  {:cmns-av/abbreviation "SAR-SAIBOR",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/SAR-SAIBOR,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SaudiRiyal,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "SAR-SAIBOR"})

(def SAR-SRIOR-Reference_Banks
  {:cmns-av/abbreviation "SAR-SRIOR-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/SAR-SRIOR-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SaudiRiyal,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "SAR-SRIOR-Reference Banks"})

(def SEK-Annual_Swap_Rate
  {:cmns-av/abbreviation "SEK-Annual Swap Rate",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/SEK-Annual_Swap_Rate,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwedishKrona,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "SEK-Annual Swap Rate"})

(def SEK-Annual_Swap_Rate-SESWFI
  {:cmns-av/abbreviation "SEK-Annual Swap Rate-SESWFI",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/SEK-Annual_Swap_Rate-SESWFI,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwedishKrona,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "SEK-Annual Swap Rate-SESWFI"})

(def SEK-STIBOR
  {:cmns-av/abbreviation "SEK-STIBOR",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/SEK-STIBOR,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwedishKrona,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "SEK-STIBOR"})

(def SEK-STIBOR-OIS_Compound
  {:cmns-av/abbreviation "SEK-STIBOR-OIS Compound",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/SEK-STIBOR-OIS_Compound,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwedishKrona,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "SEK-STIBOR-OIS Compound"})

(def SEK-STIBOR-Reference_Banks
  {:cmns-av/abbreviation "SEK-STIBOR-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/SEK-STIBOR-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwedishKrona,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "SEK-STIBOR-Reference Banks"})

(def SEK-SWESTR
  {:cmns-av/abbreviation "SEK-SWESTR",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/SEK-SWESTR,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwedishKrona,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "SEK-SWESTR"})

(def SEK-SWESTR-OIS_Compound
  {:cmns-av/abbreviation "SEK-SWESTR-OIS Compound",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/SEK-SWESTR-OIS_Compound,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwedishKrona,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "SEK-SWESTR-OIS Compound"})

(def SEK-SWESTR_Average_1M
  {:cmns-av/abbreviation "SEK-SWESTR Average 1M",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/SEK-SWESTR_Average_1M,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwedishKrona,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "SEK-SWESTR Average 1M"})

(def SEK-SWESTR_Average_1W
  {:cmns-av/abbreviation "SEK-SWESTR Average 1W",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/SEK-SWESTR_Average_1W,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwedishKrona,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "SEK-SWESTR Average 1W"})

(def SEK-SWESTR_Average_2M
  {:cmns-av/abbreviation "SEK-SWESTR Average 2M",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/SEK-SWESTR_Average_2M,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwedishKrona,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "SEK-SWESTR Average 2M"})

(def SEK-SWESTR_Average_3M
  {:cmns-av/abbreviation "SEK-SWESTR Average 3M",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/SEK-SWESTR_Average_3M,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwedishKrona,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "SEK-SWESTR Average 3M"})

(def SEK-SWESTR_Average_6M
  {:cmns-av/abbreviation "SEK-SWESTR Average 6M",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/SEK-SWESTR_Average_6M,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwedishKrona,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "SEK-SWESTR Average 6M"})

(def SEK-SWESTR_Compounded_Index
  {:cmns-av/abbreviation "SEK-SWESTR Compounded Index",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/SEK-SWESTR_Compounded_Index,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SwedishKrona,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "SEK-SWESTR Compounded Index"})

(def SGD-SIBOR
  {:cmns-av/abbreviation "SGD-SIBOR",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/SGD-SIBOR,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SingaporeDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "SGD-SIBOR"})

(def SGD-SIBOR-Reference_Banks
  {:cmns-av/abbreviation "SGD-SIBOR-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/SGD-SIBOR-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SingaporeDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "SGD-SIBOR-Reference Banks"})

(def SGD-SIBOR-Telerate
  {:cmns-av/abbreviation "SGD-SIBOR-Telerate",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/SGD-SIBOR-Telerate,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/ThomsonReuters,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SingaporeDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "SGD-SIBOR-Telerate"})

(def SGD-SONAR-OIS-COMPOUND
  {:cmns-av/abbreviation "SGD-SONAR-OIS-COMPOUND",
   :cmns-av/explanatoryNote
   #{"Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."
     "Deprecated usage: \"SGD-SONAR-OIS-COMPOUND\" code has been deprecated in supplement 35 to the 2006 ISDA definitions. The code is kept in FpML for backward compatibility purposes."},
   :db/ident :fibo-ind-ir-cm/SGD-SONAR-OIS-COMPOUND,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SingaporeDollar,
   :owl/deprecated true,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "SGD-SONAR-OIS-COMPOUND"})

(def SGD-SOR
  {:cmns-av/abbreviation "SGD-SOR",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/SGD-SOR,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SingaporeDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "SGD-SOR"})

(def SGD-SOR-Reference_Banks
  {:cmns-av/abbreviation "SGD-SOR-Reference Banks",
   :cmns-av/explanatoryNote
   #{"Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."
     "Deprecated usage: \"SGD-SOR-Reference Banks\" code has been deprecated in supplement 35 to the 2006 ISDA definitions. The code is kept in FpML for backward compatibility purposes."},
   :db/ident :fibo-ind-ir-cm/SGD-SOR-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SingaporeDollar,
   :owl/deprecated true,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "SGD-SOR-Reference Banks"})

(def SGD-SOR-Telerate
  {:cmns-av/abbreviation "SGD-SOR-Telerate",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/SGD-SOR-Telerate,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/ThomsonReuters,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SingaporeDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "SGD-SOR-Telerate"})

(def SGD-SOR-VWAP-Reference_Banks
  {:cmns-av/abbreviation "SGD-SOR-VWAP-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/SGD-SOR-VWAP-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SingaporeDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "SGD-SOR-VWAP-Reference Banks"})

(def SGD-SORA
  {:cmns-av/abbreviation "SGD-SORA",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/SGD-SORA,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SingaporeDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "SGD-SORA"})

(def SGD-SORA-OIS_Compound
  {:cmns-av/abbreviation "SGD-SORA-OIS Compound",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/SGD-SORA-OIS_Compound,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SingaporeDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "SGD-SORA-OIS Compound"})

(def SGD-Semi-Annual_Currency_Basis_Swap_Rate-11_00-Tullett_Prebon
  {:cmns-av/abbreviation
   "SGD-Semi-Annual Currency Basis Swap Rate-11:00-Tullett Prebon",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident
   :fibo-ind-ir-cm/SGD-Semi-Annual_Currency_Basis_Swap_Rate-11_00-Tullett_Prebon,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SingaporeDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "SGD-Semi-Annual Currency Basis Swap Rate-11:00-Tullett Prebon"})

(def SGD-Semi-Annual_Currency_Basis_Swap_Rate-16_00-Tullett_Prebon
  {:cmns-av/abbreviation
   "SGD-Semi-Annual Currency Basis Swap Rate-16:00-Tullett Prebon",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident
   :fibo-ind-ir-cm/SGD-Semi-Annual_Currency_Basis_Swap_Rate-16_00-Tullett_Prebon,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SingaporeDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "SGD-Semi-Annual Currency Basis Swap Rate-16:00-Tullett Prebon"})

(def SGD-Semi-Annual_Swap_Rate-11_00-TRADITION
  {:cmns-av/abbreviation "SGD-Semi-Annual Swap Rate-11.00-TRADITION",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/SGD-Semi-Annual_Swap_Rate-11.00-TRADITION,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/Tradition,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SingaporeDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "SGD-Semi-Annual Swap Rate-11.00-TRADITION"})

(def SGD-Semi-Annual_Swap_Rate-11_00-BGCANTOR
  {:cmns-av/abbreviation "SGD-Semi-Annual Swap Rate-11:00-BGCANTOR",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/SGD-Semi-Annual_Swap_Rate-11_00-BGCANTOR,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/FenicsMarketData,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SingaporeDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "SGD-Semi-Annual Swap Rate-11:00-BGCANTOR"})

(def SGD-Semi-Annual_Swap_Rate-11_00-Tullett_Prebon
  {:cmns-av/abbreviation "SGD-Semi-Annual Swap Rate-11:00-Tullett Prebon",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/SGD-Semi-Annual_Swap_Rate-11_00-Tullett_Prebon,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SingaporeDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "SGD-Semi-Annual Swap Rate-11:00-Tullett Prebon"})

(def SGD-Semi-Annual_Swap_Rate-16_00-Tullett_Prebon
  {:cmns-av/abbreviation "SGD-Semi-Annual Swap Rate-16:00-Tullett Prebon",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/SGD-Semi-Annual_Swap_Rate-16_00-Tullett_Prebon,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SingaporeDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "SGD-Semi-Annual Swap Rate-16:00-Tullett Prebon"})

(def SGD-Semi-Annual_Swap_Rate-ICAP
  {:cmns-av/abbreviation "SGD-Semi-Annual Swap Rate-ICAP",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/SGD-Semi-Annual_Swap_Rate-ICAP,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SingaporeDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "SGD-Semi-Annual Swap Rate-ICAP"})

(def SGD-Semi-Annual_Swap_Rate-ICAP-Reference_Banks
  {:cmns-av/abbreviation "SGD-Semi-Annual Swap Rate-ICAP-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/SGD-Semi-Annual_Swap_Rate-ICAP-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SingaporeDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "SGD-Semi-Annual Swap Rate-ICAP-Reference Banks"})

(def SGD-Semi-Annual_Swap_Rate-Reference_Banks
  {:cmns-av/abbreviation "SGD-Semi-Annual Swap Rate-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/SGD-Semi-Annual_Swap_Rate-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SingaporeDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "SGD-Semi-Annual Swap Rate-Reference Banks"})

(def SGD-Semi-Annual_Swap_Rate-TRADITION-Reference_Banks
  {:cmns-av/abbreviation "SGD-Semi-Annual Swap Rate-TRADITION-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident
   :fibo-ind-ir-cm/SGD-Semi-Annual_Swap_Rate-TRADITION-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/SingaporeDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "SGD-Semi-Annual Swap Rate-TRADITION-Reference Banks"})

(def SKK-BRIBOR-BRBO
  {:cmns-av/abbreviation "SKK-BRIBOR-BRBO",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/SKK-BRIBOR-BRBO,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "SKK-BRIBOR-BRBO"})

(def SKK-BRIBOR-Bloomberg
  {:cmns-av/abbreviation "SKK-BRIBOR-Bloomberg",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/SKK-BRIBOR-Bloomberg,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/BloombergLP,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "SKK-BRIBOR-Bloomberg"})

(def SKK-BRIBOR-NBSK07
  {:cmns-av/abbreviation "SKK-BRIBOR-NBSK07",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/SKK-BRIBOR-NBSK07,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "SKK-BRIBOR-NBSK07"})

(def SKK-BRIBOR-Reference_Banks
  {:cmns-av/abbreviation "SKK-BRIBOR-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/SKK-BRIBOR-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Euro,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "SKK-BRIBOR-Reference Banks"})

(def THB-SOR-Reference_Banks
  {:cmns-av/abbreviation "THB-SOR-Reference Banks",
   :cmns-av/explanatoryNote
   #{"Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."
     "Deprecated usage: \"THB-SOR-Reference Banks\" code has been deprecated in supplement 38 to the 2006 ISDA definitions. The code is kept in FpML for backward compatibility purposes."},
   :db/ident :fibo-ind-ir-cm/THB-SOR-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Baht,
   :owl/deprecated true,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "THB-SOR-Reference Banks"})

(def THB-SOR-Reuters
  {:cmns-av/abbreviation "THB-SOR-Reuters",
   :cmns-av/explanatoryNote
   #{"Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."
     "Deprecated usage: \"THB-SOR-Reuters\" code has been deprecated in supplement 35 to the 2006 ISDA definitions. The code is kept in FpML for backward compatibility purposes."},
   :db/ident :fibo-ind-ir-cm/THB-SOR-Reuters,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/ThomsonReuters,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Baht,
   :owl/deprecated true,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "THB-SOR-Reuters"})

(def THB-SOR-Telerate
  {:cmns-av/abbreviation "THB-SOR-Telerate",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/THB-SOR-Telerate,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/ThomsonReuters,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Baht,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "THB-SOR-Telerate"})

(def THB-Semi-Annual_Swap_Rate-11_00-BGCANTOR
  {:cmns-av/abbreviation "THB-Semi-Annual Swap Rate-11:00-BGCANTOR",
   :cmns-av/explanatoryNote
   #{"Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."
     "Deprecated usage: the code has been deprecated in supplement 38 to the 2006 ISDA definitions. The code is kept in FpML for backward compatibility purposes."},
   :db/ident :fibo-ind-ir-cm/THB-Semi-Annual_Swap_Rate-11_00-BGCANTOR,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/FenicsMarketData,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Baht,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :owl/deprecated true,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "THB-Semi-Annual Swap Rate-11:00-BGCANTOR"})

(def THB-Semi-Annual_Swap_Rate-Reference_Banks
  {:cmns-av/abbreviation "THB-Semi-Annual Swap Rate-Reference Banks",
   :cmns-av/explanatoryNote
   #{"Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."
     "Deprecated usage: the code has been deprecated in supplement 38 to the 2006 ISDA definitions. The code is kept in FpML for backward compatibility purposes."},
   :db/ident :fibo-ind-ir-cm/THB-Semi-Annual_Swap_Rate-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Baht,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :owl/deprecated true,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "THB-Semi-Annual Swap Rate-Reference Banks"})

(def THB-THBFIX
  {:cmns-av/abbreviation "THB-THBFIX",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/THB-THBFIX,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Baht,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "THB-THBFIX"})

(def THB-THBFIX-Reference_Banks
  {:cmns-av/abbreviation "THB-THBFIX-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/THB-THBFIX-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Baht,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "THB-THBFIX-Reference Banks"})

(def THB-THOR
  {:cmns-av/abbreviation "THB-THOR",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/THB-THOR,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Baht,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "THB-THOR"})

(def THB-THOR-OIS_Compound
  {:cmns-av/abbreviation "THB-THOR-OIS Compound",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/THB-THOR-OIS_Compound,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Baht,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "THB-THOR-OIS Compound"})

(def TRY-Annual_Swap_Rate-11_15-BGCANTOR
  {:cmns-av/abbreviation "TRY-Annual Swap Rate-11:15-BGCANTOR",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/TRY-Annual_Swap_Rate-11_15-BGCANTOR,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/FenicsMarketData,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/TurkishLira,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "TRY-Annual Swap Rate-11:15-BGCANTOR"})

(def TRY-Annual_Swap_Rate-Reference_Banks
  {:cmns-av/abbreviation "TRY-Annual Swap Rate-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/TRY-Annual_Swap_Rate-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/TurkishLira,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "TRY-Annual Swap Rate-Reference Banks"})

(def TRY-Semi-Annual_Swap_Rate-TRADITION-Reference_Banks
  {:cmns-av/abbreviation "TRY-Semi-Annual Swap Rate-TRADITION-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident
   :fibo-ind-ir-cm/TRY-Semi-Annual_Swap_Rate-TRADITION-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/TurkishLira,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "TRY-Semi-Annual Swap Rate-TRADITION-Reference Banks"})

(def TRY-TLREF
  {:cmns-av/abbreviation "TRY-TLREF",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/TRY-TLREF,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/TurkishLira,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "TRY-TLREF"})

(def TRY-TLREF-OIS_Compound
  {:cmns-av/abbreviation "TRY-TLREF-OIS Compound",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/TRY-TLREF-OIS_Compound,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/TurkishLira,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "TRY-TLREF-OIS Compound"})

(def TRY-TRLIBOR
  {:cmns-av/abbreviation "TRY-TRLIBOR",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/TRY-TRLIBOR,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/TurkishLira,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "TRY-TRLIBOR"})

(def TRY-TRYIBOR-Reference_Banks
  {:cmns-av/abbreviation "TRY-TRYIBOR-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/TRY-TRYIBOR-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/TurkishLira,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "TRY-TRYIBOR-Reference Banks"})

(def TRY_Annual_Swap_Rate-11_00-TRADITION
  {:cmns-av/abbreviation "TRY Annual Swap Rate-11:00-TRADITION",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/TRY_Annual_Swap_Rate-11_00-TRADITION,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/Tradition,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/TurkishLira,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "TRY Annual Swap Rate-11:00-TRADITION"})

(def TWD-Quarterly-Annual_Swap_Rate-11_00-BGCANTOR
  {:cmns-av/abbreviation "TWD-Quarterly-Annual Swap Rate-11:00-BGCANTOR",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/TWD-Quarterly-Annual_Swap_Rate-11_00-BGCANTOR,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/FenicsMarketData,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/NewTaiwanDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/ThreeMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "TWD-Quarterly-Annual Swap Rate-11:00-BGCANTOR"})

(def TWD-Quarterly-Annual_Swap_Rate-Reference_Banks
  {:cmns-av/abbreviation "TWD-Quarterly-Annual Swap Rate-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/TWD-Quarterly-Annual_Swap_Rate-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/NewTaiwanDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/ThreeMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "TWD-Quarterly-Annual Swap Rate-Reference Banks"})

(def TWD-Reference_Dealers
  {:cmns-av/abbreviation "TWD-Reference Dealers",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/TWD-Reference_Dealers,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/NewTaiwanDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "TWD-Reference Dealers"})

(def TWD-Reuters-6165
  {:cmns-av/abbreviation "TWD-Reuters-6165",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/TWD-Reuters-6165,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/NewTaiwanDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "TWD-Reuters-6165"})

(def TWD-TAIBIR01
  {:cmns-av/abbreviation "TWD-TAIBIR01",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/TWD-TAIBIR01,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/NewTaiwanDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "TWD-TAIBIR01"})

(def TWD-TAIBIR02
  {:cmns-av/abbreviation "TWD-TAIBIR02",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/TWD-TAIBIR02,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/NewTaiwanDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "TWD-TAIBIR02"})

(def TWD-TAIBOR
  {:cmns-av/abbreviation "TWD-TAIBOR",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/TWD-TAIBOR,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/NewTaiwanDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "TWD-TAIBOR"})

(def TWD-TWCPBA
  {:cmns-av/abbreviation "TWD-TWCPBA",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/TWD-TWCPBA,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/NewTaiwanDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "TWD-TWCPBA"})

(def TWD-Telerate-6165
  {:cmns-av/abbreviation "TWD-Telerate-6165",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/TWD-Telerate-6165,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/NewTaiwanDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "TWD-Telerate-6165"})

(def USD-3M_LIBOR_SWAP-CME_vs_LCH-ICAP
  {:cmns-av/abbreviation "USD-3M LIBOR SWAP-CME vs LCH-ICAP",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-3M_LIBOR_SWAP-CME_vs_LCH-ICAP,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/ThreeMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-3M LIBOR SWAP-CME vs LCH-ICAP"})

(def USD-3M_LIBOR_SWAP-CME_vs_LCH-ICAP-Bloomberg
  {:cmns-av/abbreviation "USD-3M LIBOR SWAP-CME vs LCH-ICAP-Bloomberg",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-3M_LIBOR_SWAP-CME_vs_LCH-ICAP-Bloomberg,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/BloombergLP,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/ThreeMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-3M LIBOR SWAP-CME vs LCH-ICAP-Bloomberg"})

(def USD-6M_LIBOR_SWAP-CME_vs_LCH-ICAP
  {:cmns-av/abbreviation "USD-6M LIBOR SWAP-CME vs LCH-ICAP",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-6M_LIBOR_SWAP-CME_vs_LCH-ICAP,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-6M LIBOR SWAP-CME vs LCH-ICAP"})

(def USD-6M_LIBOR_SWAP-CME_vs_LCH-ICAP-Bloomberg
  {:cmns-av/abbreviation "USD-6M LIBOR SWAP-CME vs LCH-ICAP-Bloomberg",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-6M_LIBOR_SWAP-CME_vs_LCH-ICAP-Bloomberg,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/BloombergLP,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-6M LIBOR SWAP-CME vs LCH-ICAP-Bloomberg"})

(def USD-AMERIBOR
  {:cmns-av/abbreviation "USD-AMERIBOR",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-AMERIBOR,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-AMERIBOR"})

(def USD-AMERIBOR_Average_30D
  {:cmns-av/abbreviation "USD-AMERIBOR Average 30D",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-AMERIBOR_Average_30D,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-AMERIBOR Average 30D"})

(def USD-AMERIBOR_Average_90D
  {:cmns-av/abbreviation "USD-AMERIBOR Average 90D",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-AMERIBOR_Average_90D,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-AMERIBOR Average 90D"})

(def USD-AMERIBOR_Term
  {:cmns-av/abbreviation "USD-AMERIBOR Term",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-AMERIBOR_Term,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-AMERIBOR Term"})

(def USD-AMERIBOR_Term_Structure
  {:cmns-av/abbreviation "USD-AMERIBOR Term Structure",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-AMERIBOR_Term_Structure,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-AMERIBOR Term Structure"})

(def USD-AXI_Term
  {:cmns-av/abbreviation "USD-AXI Term",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-AXI_Term,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-AXI Term"})

(def USD-Annual_Swap_Rate-11_00-BGCANTOR
  {:cmns-av/abbreviation "USD-Annual Swap Rate-11:00-BGCANTOR",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-Annual_Swap_Rate-11_00-BGCANTOR,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/FenicsMarketData,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-Annual Swap Rate-11:00-BGCANTOR"})

(def USD-Annual_Swap_Rate-11_00-TRADITION
  {:cmns-av/abbreviation "USD-Annual Swap Rate-11:00-TRADITION",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-Annual_Swap_Rate-11_00-TRADITION,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/Tradition,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-Annual Swap Rate-11:00-TRADITION"})

(def USD-Annual_Swap_Rate-4_00-TRADITION
  {:cmns-av/abbreviation "USD-Annual Swap Rate-4:00-TRADITION",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-Annual_Swap_Rate-4_00-TRADITION,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/Tradition,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/TwelveMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-Annual Swap Rate-4:00-TRADITION"})

(def USD-BA-H_15
  {:cmns-av/abbreviation "USD-BA-H.15",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-BA-H.15,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-fbc-fct-usjrga/BoardOfGovernorsOfTheFederalReserveSystem,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-BA-H.15"})

(def USD-BA-Reference_Dealers
  {:cmns-av/abbreviation "USD-BA-Reference Dealers",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-BA-Reference_Dealers,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-BA-Reference Dealers"})

(def USD-BMA_Municipal_Swap_Index
  {:cmns-av/abbreviation "USD-BMA Municipal Swap Index",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-BMA_Municipal_Swap_Index,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-BMA Municipal Swap Index"})

(def USD-BSBY
  {:cmns-av/abbreviation "USD-BSBY",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-BSBY,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-BSBY"})

(def USD-CD-H_15
  {:cmns-av/abbreviation "USD-CD-H.15",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-CD-H.15,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-fbc-fct-usjrga/BoardOfGovernorsOfTheFederalReserveSystem,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-CD-H.15"})

(def USD-CD-Reference_Dealers
  {:cmns-av/abbreviation "USD-CD-Reference Dealers",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-CD-Reference_Dealers,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-CD-Reference Dealers"})

(def USD-CMS-Reference_Banks
  {:cmns-av/abbreviation "USD-CMS-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-CMS-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-CMS-Reference Banks"})

(def USD-CMS-Reference_Banks-ICAP_SwapPX
  {:cmns-av/abbreviation "USD-CMS-Reference Banks-ICAP SwapPX",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-CMS-Reference_Banks-ICAP_SwapPX,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-CMS-Reference Banks-ICAP SwapPX"})

(def USD-CMS-Reuters
  {:cmns-av/abbreviation "USD-CMS-Reuters",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-CMS-Reuters,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/ThomsonReuters,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-CMS-Reuters"})

(def USD-CMS-Telerate
  {:cmns-av/abbreviation "USD-CMS-Telerate",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-CMS-Telerate,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/ThomsonReuters,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-CMS-Telerate"})

(def USD-CMT
  {:cmns-av/abbreviation "USD-CMT",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-CMT,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-CMT"})

(def USD-CMT_Average_1W
  {:cmns-av/abbreviation "USD-CMT Average 1W",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-CMT_Average_1W,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-CMT Average 1W"})

(def USD-COF11-Telerate
  {:cmns-av/abbreviation "USD-COF11-Telerate",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-COF11-Telerate,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/ThomsonReuters,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-COF11-Telerate"})

(def USD-COFI
  {:cmns-av/abbreviation "USD-COFI",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-COFI,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-COFI"})

(def USD-CP-Money_Market_Yield
  {:cmns-av/abbreviation "USD-CP-Money Market Yield",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-CP-Money_Market_Yield,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-CP-Money Market Yield"})

(def USD-CP-Reference_Dealers
  {:cmns-av/abbreviation "USD-CP-Reference Dealers",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-CP-Reference_Dealers,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-CP-Reference Dealers"})

(def USD-CRITR
  {:cmns-av/abbreviation "USD-CRITR",
   :cmns-av/explanatoryNote
   #{"FRO-M-V7"
     "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."},
   :db/ident :fibo-ind-ir-cm/USD-CRITR,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-CRITR"})

(def USD-FFCB-DISCO
  {:cmns-av/abbreviation "USD-FFCB-DISCO",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-FFCB-DISCO,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-FFCB-DISCO"})

(def USD-FXI_Term
  {:cmns-av/abbreviation "USD-FXI Term",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-FXI_Term,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-FXI Term"})

(def USD-Federal_Funds
  {:cmns-av/abbreviation "USD-Federal Funds",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-Federal_Funds,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-Federal Funds"})

(def USD-Federal_Funds-OIS_Compound
  {:cmns-av/abbreviation "USD-Federal Funds-OIS Compound",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-Federal_Funds-OIS_Compound,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-Federal Funds-OIS Compound"})

(def USD-Federal_Funds-Reference_Dealers
  {:cmns-av/abbreviation "USD-Federal Funds-Reference Dealers",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-Federal_Funds-Reference_Dealers,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-Federal Funds-Reference Dealers"})

(def USD-LIBOR
  {:cmns-av/abbreviation "USD-LIBOR",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-LIBOR,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-LIBOR"})

(def USD-LIBOR-ISDA
  {:cmns-av/abbreviation "USD-LIBOR-ISDA",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-LIBOR-ISDA,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-LIBOR-ISDA"})

(def USD-LIBOR-LIBO
  {:cmns-av/abbreviation "USD-LIBOR-LIBO",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-LIBOR-LIBO,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-LIBOR-LIBO"})

(def USD-LIBOR-Reference_Banks
  {:cmns-av/abbreviation "USD-LIBOR-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-LIBOR-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-LIBOR-Reference Banks"})

(def USD-LIBOR_ICE_Swap_Rate-11_00
  {:cmns-av/abbreviation "USD-LIBOR ICE Swap Rate-11:00",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-LIBOR_ICE_Swap_Rate-11_00,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-LIBOR ICE Swap Rate-11:00"})

(def USD-LIBOR_ICE_Swap_Rate-15_00
  {:cmns-av/abbreviation "USD-LIBOR ICE Swap Rate-15:00",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-LIBOR_ICE_Swap_Rate-15_00,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-LIBOR ICE Swap Rate-15:00"})

(def USD-Municipal_Swap_Index
  {:cmns-av/abbreviation "USD-Municipal Swap Index",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-Municipal_Swap_Index,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-Municipal Swap Index"})

(def USD-Municipal_Swap_Libor_Ratio-11_00-ICAP
  {:cmns-av/abbreviation "USD-Municipal Swap Libor Ratio-11:00-ICAP",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-Municipal_Swap_Libor_Ratio-11_00-ICAP,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-Municipal Swap Libor Ratio-11:00-ICAP"})

(def USD-Municipal_Swap_Rate-11_00-ICAP
  {:cmns-av/abbreviation "USD-Municipal Swap Rate-11:00-ICAP",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-Municipal_Swap_Rate-11_00-ICAP,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-Municipal Swap Rate-11:00-ICAP"})

(def USD-OIS-11_00-BGCANTOR
  {:cmns-av/abbreviation "USD-OIS-11:00-BGCANTOR",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-OIS-11_00-BGCANTOR,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/FenicsMarketData,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-OIS-11:00-BGCANTOR"})

(def USD-OIS-11_00-LON-ICAP
  {:cmns-av/abbreviation "USD-OIS-11:00-LON-ICAP",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-OIS-11_00-LON-ICAP,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-OIS-11:00-LON-ICAP"})

(def USD-OIS-11_00-NY-ICAP
  {:cmns-av/abbreviation "USD-OIS-11:00-NY-ICAP",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-OIS-11_00-NY-ICAP,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-OIS-11:00-NY-ICAP"})

(def USD-OIS-11_00-TRADITION
  {:cmns-av/abbreviation "USD-OIS-11:00-TRADITION",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-OIS-11_00-TRADITION,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/Tradition,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-OIS-11:00-TRADITION"})

(def USD-OIS-3_00-BGCANTOR
  {:cmns-av/abbreviation "USD-OIS-3:00-BGCANTOR",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-OIS-3_00-BGCANTOR,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/FenicsMarketData,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-OIS-3:00-BGCANTOR"})

(def USD-OIS-3_00-NY-ICAP
  {:cmns-av/abbreviation "USD-OIS-3:00-NY-ICAP",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-OIS-3_00-NY-ICAP,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-OIS-3:00-NY-ICAP"})

(def USD-OIS-4_00-TRADITION
  {:cmns-av/abbreviation "USD-OIS-4:00-TRADITION",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-OIS-4_00-TRADITION,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/Tradition,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-OIS-4:00-TRADITION"})

(def USD-Overnight_Bank_Funding_Rate
  {:cmns-av/abbreviation "USD-Overnight Bank Funding Rate",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-Overnight_Bank_Funding_Rate,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-Overnight Bank Funding Rate"})

(def USD-Prime
  {:cmns-av/abbreviation "USD-Prime",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-Prime,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-Prime"})

(def USD-Prime-Reference_Banks
  {:cmns-av/abbreviation "USD-Prime-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-Prime-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-Prime-Reference Banks"})

(def USD-SIBOR-Reference_Banks
  {:cmns-av/abbreviation "USD-SIBOR-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-SIBOR-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-SIBOR-Reference Banks"})

(def USD-SIBOR-SIBO
  {:cmns-av/abbreviation "USD-SIBOR-SIBO",
   :cmns-av/explanatoryNote
   #{"Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction."
     "Deprecated usage: the code has been deprecated in supplement 36 to the 2006 ISDA definitions (Section 7.1 (ab) (xxviii) USD-SIBOR-SIBO is deleted in its entirety). The code is kept in FpML for backward compatibility purposes."},
   :db/ident :fibo-ind-ir-cm/USD-SIBOR-SIBO,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :owl/deprecated true,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-SIBOR-SIBO"})

(def USD-SOFR
  {:cmns-av/abbreviation "USD-SOFR",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-SOFR,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-SOFR"})

(def USD-SOFR-OIS_Compound
  {:cmns-av/abbreviation "USD-SOFR-OIS Compound",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-SOFR-OIS_Compound,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-SOFR-OIS Compound"})

(def USD-SOFR_Average_180D
  {:cmns-av/abbreviation "USD-SOFR Average 180D",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-SOFR_Average_180D,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-SOFR Average 180D"})

(def USD-SOFR_Average_30D
  {:cmns-av/abbreviation "USD-SOFR Average 30D",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-SOFR_Average_30D,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-SOFR Average 30D"})

(def USD-SOFR_Average_90D
  {:cmns-av/abbreviation "USD-SOFR Average 90D",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-SOFR_Average_90D,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-SOFR Average 90D"})

(def USD-SOFR_CME_Term
  {:cmns-av/abbreviation "USD-SOFR CME Term",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-SOFR_CME_Term,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-SOFR CME Term"})

(def USD-SOFR_Compounded_Index
  {:cmns-av/abbreviation "USD-SOFR Compounded Index",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-SOFR_Compounded_Index,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-SOFR Compounded Index"})

(def USD-SOFR_ICE_Compounded_Index
  {:cmns-av/abbreviation "USD-SOFR ICE Compounded Index",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-SOFR_ICE_Compounded_Index,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-SOFR ICE Compounded Index"})

(def USD-SOFR_ICE_Compounded_Index_0_Floor
  {:cmns-av/abbreviation "USD-SOFR ICE Compounded Index 0 Floor",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-SOFR_ICE_Compounded_Index_0_Floor,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-SOFR ICE Compounded Index 0 Floor"})

(def USD-SOFR_ICE_Compounded_Index_0_Floor_2D_Lag
  {:cmns-av/abbreviation "USD-SOFR ICE Compounded Index 0 Floor 2D Lag",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-SOFR_ICE_Compounded_Index_0_Floor_2D_Lag,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-SOFR ICE Compounded Index 0 Floor 2D Lag"})

(def USD-SOFR_ICE_Compounded_Index_0_Floor_5D_Lag
  {:cmns-av/abbreviation "USD-SOFR ICE Compounded Index 0 Floor 5D Lag",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-SOFR_ICE_Compounded_Index_0_Floor_5D_Lag,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-SOFR ICE Compounded Index 0 Floor 5D Lag"})

(def USD-SOFR_ICE_Compounded_Index_2D_Lag
  {:cmns-av/abbreviation "USD-SOFR ICE Compounded Index 2D Lag",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-SOFR_ICE_Compounded_Index_2D_Lag,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-SOFR ICE Compounded Index 2D Lag"})

(def USD-SOFR_ICE_Compounded_Index_5D_Lag
  {:cmns-av/abbreviation "USD-SOFR ICE Compounded Index 5D Lag",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-SOFR_ICE_Compounded_Index_5D_Lag,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-SOFR ICE Compounded Index 5D Lag"})

(def USD-SOFR_ICE_Swap_Rate
  {:cmns-av/abbreviation "USD-SOFR ICE Swap Rate",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix and 2006 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-SOFR_ICE_Swap_Rate,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-SOFR ICE Swap Rate"})

(def USD-SOFR_ICE_Term
  {:cmns-av/abbreviation "USD-SOFR ICE Term",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-SOFR_ICE_Term,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-SOFR ICE Term"})

(def USD-SandP_Index_High_Grade
  {:cmns-av/abbreviation "USD-SandP Index High Grade",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-SandP_Index_High_Grade,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-SandP Index High Grade"})

(def USD-TBILL-H_15
  {:cmns-av/abbreviation "USD-TBILL-H.15",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-TBILL-H.15,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-fbc-fct-usjrga/BoardOfGovernorsOfTheFederalReserveSystem,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-TBILL-H.15"})

(def USD-TBILL-H_15-Bloomberg
  {:cmns-av/abbreviation "USD-TBILL-H.15-Bloomberg",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-TBILL-H.15-Bloomberg,
   :fibo-fnd-rel-rel/isProducedBy
   :fibo-fbc-fct-usjrga/BoardOfGovernorsOfTheFederalReserveSystem,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-fbc-fct-usfsind/BloombergLP,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-TBILL-H.15-Bloomberg"})

(def USD-TBILL_Auction_High_Rate
  {:cmns-av/abbreviation "USD-TBILL Auction High Rate",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-TBILL_Auction_High_Rate,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-TBILL Auction High Rate"})

(def USD-TBILL_Secondary_Market-Bond_Equivalent_Yield
  {:cmns-av/abbreviation "USD-TBILL Secondary Market-Bond Equivalent Yield",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-TBILL_Secondary_Market-Bond_Equivalent_Yield,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-TBILL Secondary Market-Bond Equivalent Yield"})

(def USD-TIBOR-ISDC
  {:cmns-av/abbreviation "USD-TIBOR-ISDC",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-TIBOR-ISDC,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-TIBOR-ISDC"})

(def USD-TIBOR-Reference_Banks
  {:cmns-av/abbreviation "USD-TIBOR-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-TIBOR-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-TIBOR-Reference Banks"})

(def USD-Treasury-19901-3_00-ICAP
  {:cmns-av/abbreviation "USD-Treasury-19901-3:00-ICAP",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-Treasury-19901-3_00-ICAP,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-Treasury-19901-3:00-ICAP"})

(def USD-Treasury_Rate-ICAP_BrokerTec
  {:cmns-av/abbreviation "USD-Treasury Rate-ICAP BrokerTec",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-Treasury_Rate-ICAP_BrokerTec,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-Treasury Rate-ICAP BrokerTec"})

(def USD-Treasury_Rate-SwapMarker100
  {:cmns-av/abbreviation "USD-Treasury Rate-SwapMarker100",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-Treasury_Rate-SwapMarker100,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-Treasury Rate-SwapMarker100"})

(def USD-Treasury_Rate-SwapMarker99
  {:cmns-av/abbreviation "USD-Treasury Rate-SwapMarker99",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-Treasury_Rate-SwapMarker99,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-Treasury Rate-SwapMarker99"})

(def USD-Treasury_Rate-T19901
  {:cmns-av/abbreviation "USD-Treasury Rate-T19901",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-Treasury_Rate-T19901,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-Treasury Rate-T19901"})

(def USD-Treasury_Rate-T500
  {:cmns-av/abbreviation "USD-Treasury Rate-T500",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD-Treasury_Rate-T500,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD-Treasury Rate-T500"})

(def USD_Swap_Rate-BCMP1
  {:cmns-av/abbreviation "USD Swap Rate-BCMP1",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD_Swap_Rate-BCMP1,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD Swap Rate-BCMP1"})

(def USD_Treasury_Rate-BCMP1
  {:cmns-av/abbreviation "USD Treasury Rate-BCMP1",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/USD_Treasury_Rate-BCMP1,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/USDollar,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "USD Treasury Rate-BCMP1"})

(def VND-Semi-Annual_Swap_Rate-11_00-BGCANTOR
  {:cmns-av/abbreviation "VND-Semi-Annual Swap Rate-11:00-BGCANTOR",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/VND-Semi-Annual_Swap_Rate-11_00-BGCANTOR,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/FenicsMarketData,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Dong,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "VND-Semi-Annual Swap Rate-11:00-BGCANTOR"})

(def VND-Semi-Annual_Swap_Rate-Reference_Banks
  {:cmns-av/abbreviation "VND-Semi-Annual Swap Rate-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/VND-Semi-Annual_Swap_Rate-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Dong,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/SixMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "VND-Semi-Annual Swap Rate-Reference Banks"})

(def ZAR-DEPOSIT-Reference_Banks
  {:cmns-av/abbreviation "ZAR-DEPOSIT-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/ZAR-DEPOSIT-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Rand,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "ZAR-DEPOSIT-Reference Banks"})

(def ZAR-DEPOSIT-SAFEX
  {:cmns-av/abbreviation "ZAR-DEPOSIT-SAFEX",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/ZAR-DEPOSIT-SAFEX,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Rand,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "ZAR-DEPOSIT-SAFEX"})

(def ZAR-JIBAR
  {:cmns-av/abbreviation "ZAR-JIBAR",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/ZAR-JIBAR,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Rand,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "ZAR-JIBAR"})

(def ZAR-JIBAR-Reference_Banks
  {:cmns-av/abbreviation "ZAR-JIBAR-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/ZAR-JIBAR-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Rand,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "ZAR-JIBAR-Reference Banks"})

(def ZAR-PRIME-AVERAGE-Reference_Banks
  {:cmns-av/abbreviation "ZAR-PRIME-AVERAGE-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/ZAR-PRIME-AVERAGE-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Rand,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "ZAR-PRIME-AVERAGE-Reference Banks"})

(def ZAR-Prime_Average
  {:cmns-av/abbreviation "ZAR-Prime Average",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/ZAR-Prime_Average,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Rand,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "ZAR-Prime Average"})

(def ZAR-Quarterly_Swap_Rate-1_00-TRADITION
  {:cmns-av/abbreviation "ZAR-Quarterly Swap Rate-1:00-TRADITION",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/ZAR-Quarterly_Swap_Rate-1_00-TRADITION,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/Tradition,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Rand,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/ThreeMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "ZAR-Quarterly Swap Rate-1:00-TRADITION"})

(def ZAR-Quarterly_Swap_Rate-5_30-TRADITION
  {:cmns-av/abbreviation "ZAR-Quarterly Swap Rate-5:30-TRADITION",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/ZAR-Quarterly_Swap_Rate-5_30-TRADITION,
   :fibo-fnd-rel-rel/isProvidedBy :fibo-ind-ir-mdp/Tradition,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Rand,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/ThreeMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "ZAR-Quarterly Swap Rate-5:30-TRADITION"})

(def ZAR-Quarterly_Swap_Rate-TRADITION-Reference_Banks
  {:cmns-av/abbreviation "ZAR-Quarterly Swap Rate-TRADITION-Reference Banks",
   :cmns-av/explanatoryNote
   "Per 2006 ISDA Definitions or Annex to the 2000 ISDA Definitions, Section 7.1 Rate Options, as amended and supplemented through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/ZAR-Quarterly_Swap_Rate-TRADITION-Reference_Banks,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Rand,
   :fibo-ind-ir-ir/hasTenor :fibo-ind-ir-ir/ThreeMonths,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "ZAR-Quarterly Swap Rate-TRADITION-Reference Banks"})

(def ZAR-ZARONIA
  {:cmns-av/abbreviation "ZAR-ZARONIA",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/ZAR-ZARONIA,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Rand,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "ZAR-ZARONIA"})

(def ZAR-ZARONIA-OIS_Compound
  {:cmns-av/abbreviation "ZAR-ZARONIA-OIS Compound",
   :cmns-av/explanatoryNote
   "Per 2021 ISDA Interest Rate Derivatives Definitions Floating Rate Matrix, as amended through the date on which parties enter into the relevant transaction.",
   :db/ident :fibo-ind-ir-cm/ZAR-ZARONIA-OIS_Compound,
   :fibo-ind-ir-ir/hasReferenceCurrency :fibo-fnd-acc-4217/Rand,
   :rdf/type #{:fibo-ind-ir-ir/InterestRateBenchmark :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"},
   :rdfs/label "ZAR-ZARONIA-OIS Compound"})

(def urn:uuid:3db195ad-719c-5e53-bdf5-14d83ed24097
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "http://www.fpml.org/coding-scheme/floating-rate-index-3-9.xml"},
   :cmns-av/copyright #{"Copyright (c) 2023-2024 Federated Knowledge, LLC"
                        "Copyright (c) 2015-2024 Object Management Group, Inc."
                        "Copyright (c) 2015-2024 Thematix Partners LLC"
                        "Copyright (c) 2015-2024 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology provides reference data for commonly referenced interest rates, specifically those that are referenced in the ISDA FpML codes for floating interest rates. The rates included herein are generated directly from the FpML published reference data.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/IND/InterestRates/MarketDataProviders/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Accounting/ISO4217-CurrencyCodes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntitiesIndividuals/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/IND/InterestRates/InterestRates/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/IND/InterestRates/CommonInterestRates/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Common Interest Rates Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates.rdf version of this ontology was revised to reflect the latest FpML rates, which include a number of changes, including deprecating some rates and replacing them with others."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates.rdf version of this ontology was modified to normalize the prefix for the EU individuals ontology and update the reference interest rates as of 26 April 2024."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates.rdf version of this ontology was revised to reflect the latest FpML rates."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates.rdf version of this ontology was modified to normalize the prefix for the EU individuals ontology and update the reference interest rates as of 10 March 2023."
     "The https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/InterestRates.rdf version of this ontology was revised extensively to restructure the way in which interest rate benchmarks are modeled and eliminate references to the merged interest rate publishers ontology."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/IND/InterestRates/CommonInterestRates/"})