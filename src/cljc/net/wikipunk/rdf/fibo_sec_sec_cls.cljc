(ns net.wikipunk.rdf.fibo-sec-sec-cls
  {:cmns-av/copyright #{"Copyright (c) 2018-2023 Object Management Group, Inc."
                        "Copyright (c) 2016-2023 EDM Council, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Securities/SecuritiesClassification/",
   :dcterms/abstract
   "This ontology defines the fundamental concepts for classifying financial instruments, particularly securities, including, but not limited to classification schemes developed by government, regulatory agencies, and industry to classify the issuers of such securities as well as the securities themselves.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
    "cmns-dsg" "https://www.omg.org/spec/Commons/Designators/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fbc-fi-fi"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
    "fibo-fnd-arr-cls"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/ClassificationSchemes/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-sec-sec-cls"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesClassification/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Arrangements/ClassificationSchemes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Securities/SecuritiesClassification/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-sec-sec-cls",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesClassification/",
   :rdfs/label "Securities Classification Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesClassification.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesClassification.rdf version of this ontology was revised to eliminate a reasoning issue with respect to the CFI codes related to making the classification code a code element (which makes it a code that applies to exactly one thing)."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesClassification.rdf version of this ontology was modified to add an class representing the ISO 10962 CFI standard and an individual for the 2019 version of that standard."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesClassification.rdf version of this ontology was modified to eliminate duplication of concepts in LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesClassification.rdf version of this ontology was modified to rename (migrate) the hasDefinition property to isDefinedIn to clarify intent."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesClassification.rdf version of this ontology was revised to replace uses of hasTag in Relations with hasTag from LCC, as the more complex union of datatypes in the Relations concept is not needed here."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesClassification.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesClassification/"})

(def AssetClass
  {:cmns-av/adaptedFrom
   #{{:xsd/anyURI "http://www.investopedia.com/terms/a/assetclasses.asp"}
     {:xsd/anyURI "https://www.law.cornell.edu/cfr/text/17/45.1"}},
   :cmns-av/explanatoryNote
   #{"Asset class means the broad category of goods, services or commodities, including any 'excluded commodity' as defined in CEA section 1a(19), with common characteristics underlying a swap. The asset classes include credit, equity, foreign exchange (excluding cross-currency), interest rate (including cross-currency), other commodity, and such other asset classes as may be determined by the Commission."
     "The three main asset classes are equities, or stocks; fixed income, or bonds; and cash equivalents, or money market instruments. Some investment professionals add real estate and commodities, and possibly other types of investments, to the asset class mix."},
   :db/ident :fibo-sec-sec-cls/AssetClass,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesClassification/"},
   :rdfs/label "asset class",
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-cls/classifies,
                       :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                       :rdf/type           :owl/Restriction}
                      :fibo-sec-sec-cls/FinancialInstrumentClassifier},
   :skos/definition
   "a financial instrument classifier for a group of securities that exhibit similar characteristics, behave similarly in the marketplace and are subject to the same laws and regulations"})

(def ClassificationOfFinancialInstrumentsCodeScheme
  {:cmns-av/abbreviation "CFI code scheme",
   :cmns-av/adaptedFrom {:xsd/anyURI "https://www.iso.org/standard/73564.html"},
   :cmns-av/explanatoryNote
   "The ISO 10962 Securities and related financial instruments - Classification of financial instruments (CFI) code was developed as a solution to a number of challenges. One is to establish a series of codes which clearly classify financial instruments having similar features. The other is to develop a glossary of terms and provide common definitions which allow market participants to easily understand terminology being used.",
   :db/ident :fibo-sec-sec-cls/ClassificationOfFinancialInstrumentsCodeScheme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesClassification/"},
   :rdfs/label "classification of financial instruments code scheme",
   :rdfs/subClassOf #{:fibo-sec-sec-cls/FinancialInstrumentClassificationScheme
                      {:owl/onProperty :cmns-dsg/defines,
                       :owl/someValuesFrom
                       :fibo-sec-sec-cls/FinancialInstrumentClassificationCode,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "classification scheme for set of codes for financial instruments that can be used globally for straight-through processing by all involved participants in an electronic data processing environment"})

(def FinancialInstrumentClassificationCode
  {:cmns-av/abbreviation "CFI code",
   :cmns-av/adaptedFrom {:xsd/anyURI "https://www.iso.org/standard/73564.html"},
   :db/ident :fibo-sec-sec-cls/FinancialInstrumentClassificationCode,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesClassification/"},
   :rdfs/label "financial instrument classification code",
   :rdfs/subClassOf
   #{{:owl/onClass
      :fibo-sec-sec-cls/ClassificationOfFinancialInstrumentsCodeScheme,
      :owl/onProperty :cmns-dsg/isDefinedIn,
      :owl/qualifiedCardinality 1,
      :rdf/type :owl/Restriction}
     {:owl/onDataRange :xsd/string,
      :owl/onProperty  :fibo-fnd-rel-rel/hasTag,
      :owl/qualifiedCardinality 1,
      :rdf/type        :owl/Restriction}
     :fibo-sec-sec-cls/FinancialInstrumentClassifier},
   :skos/definition
   "classifier and code for a financial instrument defined in the ISO 10962 Classification of Financial Instruments (CFI) Code Scheme"})

(def FinancialInstrumentClassificationScheme
  {:db/ident :fibo-sec-sec-cls/FinancialInstrumentClassificationScheme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesClassification/"},
   :rdfs/label "financial instrument classification scheme",
   :rdfs/subClassOf
   #{{:owl/allValuesFrom :fibo-sec-sec-cls/FinancialInstrumentClassifier,
      :owl/onProperty    :cmns-dsg/defines,
      :rdf/type          :owl/Restriction} :cmns-cls/ClassificationScheme},
   :skos/definition
   "classification scheme defining a set of classifiers for financial instruments",
   :skos/example
   "the ISO 10962 Classification of Financial Instruments (CFI) classification scheme"})

(def FinancialInstrumentClassifier
  {:db/ident :fibo-sec-sec-cls/FinancialInstrumentClassifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesClassification/"},
   :rdfs/label "financial instrument classifier",
   :rdfs/subClassOf
   #{{:owl/onProperty     :cmns-cls/classifies,
      :owl/someValuesFrom :fibo-fbc-fi-fi/FinancialInstrument,
      :rdf/type           :owl/Restriction} :cmns-cls/Classifier
     {:owl/onClass    :fibo-sec-sec-cls/FinancialInstrumentClassificationScheme,
      :owl/onProperty :cmns-dsg/isDefinedIn,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction}},
   :skos/definition
   "classifier for a financial instrument based on its type and features",
   :skos/example
   "Examples include equity instrument, debt instrument, option, future, etc. per the the ISO 10962 CFI (Classification of Financial Instruments) standard, as cash instruments or derivative instruments per the Financial Accounting Standards Board (FASB) and International Accounting Standards Board (IASB) accounting standards, and so forth."})

(def ISO10962-201910-CodeScheme
  {:db/ident :fibo-sec-sec-cls/ISO10962-201910-CodeScheme,
   :rdf/type
   #{:owl/NamedIndividual
     :fibo-sec-sec-cls/ClassificationOfFinancialInstrumentsCodeScheme},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesClassification/"},
   :rdfs/label "ISO 10962 2019-10 code set",
   :skos/definition
   "Fourth Edition, 2019-10 version of the ISO 10962 Classification of Financial Instruments (CFI) Code scheme"})

(def urn:uuid:21bc3742-3568-5d9f-b5e9-aac5f1b90623
  {:cmns-av/copyright #{"Copyright (c) 2018-2023 Object Management Group, Inc."
                        "Copyright (c) 2016-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology defines the fundamental concepts for classifying financial instruments, particularly securities, including, but not limited to classification schemes developed by government, regulatory agencies, and industry to classify the issuers of such securities as well as the securities themselves.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Arrangements/ClassificationSchemes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Securities/SecuritiesClassification/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Securities Classification Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesClassification.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesClassification.rdf version of this ontology was revised to eliminate a reasoning issue with respect to the CFI codes related to making the classification code a code element (which makes it a code that applies to exactly one thing)."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesClassification.rdf version of this ontology was modified to add an class representing the ISO 10962 CFI standard and an individual for the 2019 version of that standard."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesClassification.rdf version of this ontology was modified to eliminate duplication of concepts in LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesClassification.rdf version of this ontology was modified to rename (migrate) the hasDefinition property to isDefinedIn to clarify intent."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesClassification.rdf version of this ontology was revised to replace uses of hasTag in Relations with hasTag from LCC, as the more complex union of datatypes in the Relations concept is not needed here."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesClassification.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesClassification/"})