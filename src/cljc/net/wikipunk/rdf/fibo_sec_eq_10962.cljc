(ns net.wikipunk.rdf.fibo-sec-eq-10962
  ^{:base
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/",
    :namespaces
    {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
     "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
     "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
     "dcterms" "http://purl.org/dc/terms/",
     "fibo-fnd-rel-rel"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
     "fibo-fnd-utl-av"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
     "fibo-sec-eq-10962"
     "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/",
     "fibo-sec-eq-eq"
     "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
     "fibo-sec-sec-cls"
     "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesClassification/",
     "fibo-sec-sec-lst"
     "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesListings/",
     "owl" "http://www.w3.org/2002/07/owl#",
     "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
     "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
     "skos" "http://www.w3.org/2004/02/skos/core#",
     "xsd" "http://www.w3.org/2001/XMLSchema#"},
    :prefix "fibo-sec-eq-10962",
    :source
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Equities/EquityCFIClassificationIndividuals/"}
  {:cmns-av/copyright #{"Copyright (c) 2020-2023 Object Management Group, Inc."
                        "Copyright (c) 2020-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology covers the ISO 10962, Fourth edition, 2019-10 classification codes for instruments that represent an ownership interest in an entity or pool of assets. It is intended to cover sections most of the codes included in section 6.2 of the standard, with the exception of structured instruments, section 6.2.8, which will be covered under derivatives.",
   :dcterms/contributor "Thematix Partners LLC",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Securities/SecuritiesListings/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Securities/SecuritiesClassification/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Securities/SecuritiesIssuance/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Equities/EquityInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Equities CFI Classification Individuals Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals.rdf version of this ontology was revised to streamline the representation of voting rights and payment form, eliminate embedded restrictions, and build out additional classes representing the various feature-based descriptions supported by the CFI standard."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals.rdf version of this ontology was revised to simplify the encoding of the individual instrument classifiers to eliminate unnecessary restrictions."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals.rdf version of this ontology was revised to complete the set of possible common share representations corresponding to the CFI standard, complete the set of corresponding codes for common shares (non-convertible), and add the set of possible combinations for preferred shares (non-convertible)."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals.rdf version of this ontology was modified to add a parent class of extendable preferred share where appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals.rdf version of this ontology was revised to replace uses of hasTag in Relations with hasTag from LCC, as the more complex union of datatypes in the Relations concept is not needed here."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals.rdf version of this ontology was revised to address text formatting hygiene issues."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"})

(def CommonEnhancedVotingRestrictedFullyPaidRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/CommonEnhancedVotingRestrictedFullyPaidRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "common, enhanced voting, restricted, fully-paid, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/FullyPaidShare :fibo-sec-eq-eq/EnhancedVotingShare
     :fibo-sec-eq-eq/RestrictedShare :fibo-sec-eq-eq/CommonShare
     :fibo-sec-sec-lst/RegisteredSecurity
     {:owl/hasValue   :fibo-sec-eq-10962/ESETFR,
      :owl/onProperty :cmns-cls/isClassifiedBy,
      :rdf/type       :owl/Restriction}},
   :skos/definition
   "common share that confers multiple votes per share, is restricted from a sales / transfer perspective, is fully paid and is registered"})

(def CommonEnhancedVotingRestrictedNilPaidRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/CommonEnhancedVotingRestrictedNilPaidRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "common, enhanced voting, restricted, nil paid, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/NilPaidShare :fibo-sec-eq-eq/EnhancedVotingShare
     :fibo-sec-eq-eq/RestrictedShare
     {:owl/hasValue   :fibo-sec-eq-10962/ESETOR,
      :owl/onProperty :cmns-cls/isClassifiedBy,
      :rdf/type       :owl/Restriction} :fibo-sec-eq-eq/CommonShare
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "common share that confers multiple votes per share, is restricted from a sales / transfer perspective, is nil paid and is registered"})

(def CommonEnhancedVotingRestrictedPartlyPaidRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/CommonEnhancedVotingRestrictedPartlyPaidRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "common, enhanced voting, restricted, partly paid, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/PartiallyPaidShare
     {:owl/hasValue   :fibo-sec-eq-10962/ESETPR,
      :owl/onProperty :cmns-cls/isClassifiedBy,
      :rdf/type       :owl/Restriction} :fibo-sec-eq-eq/EnhancedVotingShare
     :fibo-sec-eq-eq/RestrictedShare :fibo-sec-eq-eq/CommonShare
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "common share that confers multiple votes per share, is restricted from a sales / transfer perspective, is partially paid and is registered"})

(def CommonEnhancedVotingUnrestrictedFullyPaidRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/CommonEnhancedVotingUnrestrictedFullyPaidRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "common, enhanced voting, unrestricted, fully-paid, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/UnrestrictedShare :fibo-sec-eq-eq/FullyPaidShare
     :fibo-sec-eq-eq/EnhancedVotingShare :fibo-sec-eq-eq/CommonShare
     :fibo-sec-sec-lst/RegisteredSecurity
     {:owl/hasValue   :fibo-sec-eq-10962/ESEUFR,
      :owl/onProperty :cmns-cls/isClassifiedBy,
      :rdf/type       :owl/Restriction}},
   :skos/definition
   "common share that confers multiple votes per share, is not restricted from a sales / transfer perspective, is fully paid and is registered"})

(def CommonEnhancedVotingUnrestrictedNilPaidRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/CommonEnhancedVotingUnrestrictedNilPaidRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "common, enhanced voting, unrestricted, nil paid, registered share"},
   :rdfs/subClassOf
   #{{:owl/hasValue   :fibo-sec-eq-10962/ESEUOR,
      :owl/onProperty :cmns-cls/isClassifiedBy,
      :rdf/type       :owl/Restriction} :fibo-sec-eq-eq/NilPaidShare
     :fibo-sec-eq-eq/UnrestrictedShare :fibo-sec-eq-eq/EnhancedVotingShare
     :fibo-sec-eq-eq/CommonShare :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "common share that confers multiple votes per share, is not restricted from a sales / transfer perspective, is nil paid and is registered"})

(def CommonEnhancedVotingUnrestrictedPartlyPaidRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/CommonEnhancedVotingUnrestrictedPartlyPaidRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "common, enhanced voting, unrestricted, partly paid, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/PartiallyPaidShare :fibo-sec-eq-eq/UnrestrictedShare
     :fibo-sec-eq-eq/EnhancedVotingShare :fibo-sec-eq-eq/CommonShare
     {:owl/hasValue   :fibo-sec-eq-10962/ESEUPR,
      :owl/onProperty :cmns-cls/isClassifiedBy,
      :rdf/type       :owl/Restriction} :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "common share that confers multiple votes per share, is not restricted from a sales / transfer perspective, is partially paid and is registered"})

(def CommonNonVotingRestrictedFullyPaidRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/CommonNonVotingRestrictedFullyPaidRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value
                "common, non-voting, restricted, fully-paid, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/FullyPaidShare :fibo-sec-eq-eq/RestrictedShare
     :fibo-sec-eq-eq/CommonShare
     {:owl/hasValue   :fibo-sec-eq-10962/ESNTFR,
      :owl/onProperty :cmns-cls/isClassifiedBy,
      :rdf/type       :owl/Restriction} :fibo-sec-eq-eq/NonVotingShare
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "common share that confers exactly 0 votes per share, is restricted from a sales / transfer perspective, is fully paid and is registered"})

(def CommonNonVotingRestrictedNilPaidRegisteredShare
  {:db/ident :fibo-sec-eq-10962/CommonNonVotingRestrictedNilPaidRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value
                "common, non-voting, restricted, nil paid, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/NilPaidShare
                      {:owl/hasValue   :fibo-sec-eq-10962/ESNTOR,
                       :owl/onProperty :cmns-cls/isClassifiedBy,
                       :rdf/type       :owl/Restriction}
                      :fibo-sec-eq-eq/RestrictedShare
                      :fibo-sec-eq-eq/CommonShare :fibo-sec-eq-eq/NonVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "common share that confers exactly 0 votes per share, is restricted from a sales / transfer perspective, is nil paid and is registered"})

(def CommonNonVotingRestrictedPartlyPaidRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/CommonNonVotingRestrictedPartlyPaidRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value "common, non-voting, restricted, partly paid, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/PartiallyPaidShare :fibo-sec-eq-eq/RestrictedShare
     {:owl/hasValue   :fibo-sec-eq-10962/ESNTPR,
      :owl/onProperty :cmns-cls/isClassifiedBy,
      :rdf/type       :owl/Restriction} :fibo-sec-eq-eq/CommonShare
     :fibo-sec-eq-eq/NonVotingShare :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "common share that confers exactly 0 votes per share, is restricted from a sales / transfer perspective, is partially paid and is registered"})

(def CommonNonVotingUnrestrictedFullyPaidRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/CommonNonVotingUnrestrictedFullyPaidRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "common, non-voting, unrestricted, fully-paid, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/UnrestrictedShare
                      :fibo-sec-eq-eq/FullyPaidShare :fibo-sec-eq-eq/CommonShare
                      {:owl/hasValue   :fibo-sec-eq-10962/ESNUFR,
                       :owl/onProperty :cmns-cls/isClassifiedBy,
                       :rdf/type       :owl/Restriction}
                      :fibo-sec-eq-eq/NonVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "common share that confers exactly 0 votes per share, is unrestricted from a sales perspective, is fully paid and is registered"})

(def CommonNonVotingUnrestrictedNilPaidRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/CommonNonVotingUnrestrictedNilPaidRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value
                "common, non-voting, unrestricted, nil paid, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/NilPaidShare :fibo-sec-eq-eq/UnrestrictedShare
     {:owl/hasValue   :fibo-sec-eq-10962/ESNUOR,
      :owl/onProperty :cmns-cls/isClassifiedBy,
      :rdf/type       :owl/Restriction} :fibo-sec-eq-eq/CommonShare
     :fibo-sec-eq-eq/NonVotingShare :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "common share that confers exactly 0 votes per share, is unrestricted from a sales perspective, is nil paid and is registered"})

(def CommonNonVotingUnrestrictedPartlyPaidRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/CommonNonVotingUnrestrictedPartlyPaidRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "common, non-voting, unrestricted, partly paid, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/PartiallyPaidShare :fibo-sec-eq-eq/UnrestrictedShare
     {:owl/hasValue   :fibo-sec-eq-10962/ESNUPR,
      :owl/onProperty :cmns-cls/isClassifiedBy,
      :rdf/type       :owl/Restriction} :fibo-sec-eq-eq/CommonShare
     :fibo-sec-eq-eq/NonVotingShare :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "common share that confers exactly 0 votes per share, is unrestricted from a sales perspective, is partially paid and is registered"})

(def CommonRestrictedVotingRestrictedFullyPaidRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/CommonRestrictedVotingRestrictedFullyPaidRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "common, restricted voting, restricted, fully-paid, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/FullyPaidShare
     {:owl/hasValue   :fibo-sec-eq-10962/ESRTFR,
      :owl/onProperty :cmns-cls/isClassifiedBy,
      :rdf/type       :owl/Restriction} :fibo-sec-eq-eq/RestrictedShare
     :fibo-sec-eq-eq/CommonShare :fibo-sec-eq-eq/RestrictedVotingShare
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "common share that confers less than one vote per share, is restricted from a sales / transfer perspective, is fully paid and is registered"})

(def CommonRestrictedVotingRestrictedNilPaidRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/CommonRestrictedVotingRestrictedNilPaidRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "common, restricted voting, restricted, nil paid, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/NilPaidShare :fibo-sec-eq-eq/RestrictedShare
     :fibo-sec-eq-eq/CommonShare :fibo-sec-eq-eq/RestrictedVotingShare
     :fibo-sec-sec-lst/RegisteredSecurity
     {:owl/hasValue   :fibo-sec-eq-10962/ESRTOR,
      :owl/onProperty :cmns-cls/isClassifiedBy,
      :rdf/type       :owl/Restriction}},
   :skos/definition
   "common share that confers less than one vote per share, is restricted from a sales / transfer perspective, is nil paid and is registered"})

(def CommonRestrictedVotingRestrictedPartlyPaidRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/CommonRestrictedVotingRestrictedPartlyPaidRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "common, restricted voting, restricted, partly paid, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/PartiallyPaidShare :fibo-sec-eq-eq/RestrictedShare
     :fibo-sec-eq-eq/CommonShare :fibo-sec-eq-eq/RestrictedVotingShare
     {:owl/hasValue   :fibo-sec-eq-10962/ESRTPR,
      :owl/onProperty :cmns-cls/isClassifiedBy,
      :rdf/type       :owl/Restriction} :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "common share that confers less than one vote per share, is restricted from a sales / transfer perspective, is partially paid and is registered"})

(def CommonRestrictedVotingUnrestrictedFullyPaidRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/CommonRestrictedVotingUnrestrictedFullyPaidRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "common, restricted voting, unrestricted, fully-paid, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/UnrestrictedShare :fibo-sec-eq-eq/FullyPaidShare
     :fibo-sec-eq-eq/CommonShare :fibo-sec-eq-eq/RestrictedVotingShare
     {:owl/hasValue   :fibo-sec-eq-10962/ESRUFR,
      :owl/onProperty :cmns-cls/isClassifiedBy,
      :rdf/type       :owl/Restriction} :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "common share that confers less than one vote per share, is unrestricted from a sales / transfer perspective, is fully paid and is registered"})

(def CommonRestrictedVotingUnrestrictedNilPaidRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/CommonRestrictedVotingUnrestrictedNilPaidRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "common, restricted voting, unrestricted, nil paid, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/NilPaidShare :fibo-sec-eq-eq/UnrestrictedShare
     {:owl/hasValue   :fibo-sec-eq-10962/ESRUOR,
      :owl/onProperty :cmns-cls/isClassifiedBy,
      :rdf/type       :owl/Restriction} :fibo-sec-eq-eq/CommonShare
     :fibo-sec-eq-eq/RestrictedVotingShare
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "common share that confers less than one vote per share, is unrestricted from a sales / transfer perspective, is nil paid and is registered"})

(def CommonRestrictedVotingUnrestrictedPartlyPaidRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/CommonRestrictedVotingUnrestrictedPartlyPaidRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "common, restricted voting, unrestricted, partly paid, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/PartiallyPaidShare :fibo-sec-eq-eq/UnrestrictedShare
     {:owl/hasValue   :fibo-sec-eq-10962/ESRUPR,
      :owl/onProperty :cmns-cls/isClassifiedBy,
      :rdf/type       :owl/Restriction} :fibo-sec-eq-eq/CommonShare
     :fibo-sec-eq-eq/RestrictedVotingShare
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "common share that confers less than one vote per share, is unrestricted from a sales / transfer perspective, is partially paid and is registered"})

(def CommonVotingRestrictedFullyPaidRegisteredShare
  {:db/ident :fibo-sec-eq-10962/CommonVotingRestrictedFullyPaidRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value
                "common, voting, restricted, fully-paid, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/FullyPaidShare :fibo-sec-eq-eq/SingleVotingShare
     {:owl/hasValue   :fibo-sec-eq-10962/ESVTFR,
      :owl/onProperty :cmns-cls/isClassifiedBy,
      :rdf/type       :owl/Restriction} :fibo-sec-eq-eq/RestrictedShare
     :fibo-sec-eq-eq/CommonShare :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "common share that confers exactly one vote per share, is restricted from a sales / transfer perspective, is fully paid and is registered"})

(def CommonVotingRestrictedNilPaidRegisteredShare
  {:db/ident :fibo-sec-eq-10962/CommonVotingRestrictedNilPaidRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value
                "common, voting, restricted, nil paid, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/NilPaidShare :fibo-sec-eq-eq/SingleVotingShare
     {:owl/hasValue   :fibo-sec-eq-10962/ESVTOR,
      :owl/onProperty :cmns-cls/isClassifiedBy,
      :rdf/type       :owl/Restriction} :fibo-sec-eq-eq/RestrictedShare
     :fibo-sec-eq-eq/CommonShare :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "common share that confers exactly one vote per share, is restricted from a sales / transfer perspective, is nil paid and is registered"})

(def CommonVotingRestrictedPartlyPaidRegisteredShare
  {:db/ident :fibo-sec-eq-10962/CommonVotingRestrictedPartlyPaidRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value
                "common, voting, restricted, partly paid, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/PartiallyPaidShare
     {:owl/hasValue   :fibo-sec-eq-10962/ESVTPR,
      :owl/onProperty :cmns-cls/isClassifiedBy,
      :rdf/type       :owl/Restriction} :fibo-sec-eq-eq/SingleVotingShare
     :fibo-sec-eq-eq/RestrictedShare :fibo-sec-eq-eq/CommonShare
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "common share that confers exactly one vote per share, is restricted from a sales / transfer perspective, is partially paid and is registered"})

(def CommonVotingUnrestrictedFullyPaidRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/CommonVotingUnrestrictedFullyPaidRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value
                "common, voting, unrestricted, fully-paid, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/UnrestrictedShare :fibo-sec-eq-eq/FullyPaidShare
     :fibo-sec-eq-eq/SingleVotingShare :fibo-sec-eq-eq/CommonShare
     {:owl/hasValue   :fibo-sec-eq-10962/ESVUFR,
      :owl/onProperty :cmns-cls/isClassifiedBy,
      :rdf/type       :owl/Restriction} :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "common share that confers exactly one vote per share, is unrestricted from a sales perspective, is fully paid and is registered"})

(def CommonVotingUnrestrictedNilPaidRegisteredShare
  {:db/ident :fibo-sec-eq-10962/CommonVotingUnrestrictedNilPaidRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value
                "common, voting, unrestricted, nil paid, registered share"},
   :rdfs/subClassOf
   #{{:owl/hasValue   :fibo-sec-eq-10962/ESVUOR,
      :owl/onProperty :cmns-cls/isClassifiedBy,
      :rdf/type       :owl/Restriction} :fibo-sec-eq-eq/NilPaidShare
     :fibo-sec-eq-eq/UnrestrictedShare :fibo-sec-eq-eq/SingleVotingShare
     :fibo-sec-eq-eq/CommonShare :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "common share that confers exactly one vote per share, is unrestricted from a sales perspective, is nil paid and is registered"})

(def CommonVotingUnrestrictedPartlyPaidRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/CommonVotingUnrestrictedPartlyPaidRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value
                "common, voting, unrestricted, partly paid, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/PartiallyPaidShare :fibo-sec-eq-eq/UnrestrictedShare
     :fibo-sec-eq-eq/SingleVotingShare
     {:owl/hasValue   :fibo-sec-eq-10962/ESVUPR,
      :owl/onProperty :cmns-cls/isClassifiedBy,
      :rdf/type       :owl/Restriction} :fibo-sec-eq-eq/CommonShare
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "common share that confers exactly one vote per share, is unrestricted from a sales perspective, is partially paid and is registered"})

(def ESETFR
  {:cmns-col/isMemberOf :fibo-sec-sec-cls/ISO10962-201910-CodeScheme,
   :db/ident :fibo-sec-eq-10962/ESETFR,
   :fibo-fnd-rel-rel/hasTag "ESETFR",
   :rdf/type #{:fibo-sec-sec-cls/FinancialInstrumentClassificationCode
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label "ESETFR CFI common/ordinary share classifier",
   :skos/definition
   "CFI code for a common, enhanced voting, restricted transfer, fully-paid, registered share"})

(def ESETOR
  {:cmns-col/isMemberOf :fibo-sec-sec-cls/ISO10962-201910-CodeScheme,
   :db/ident :fibo-sec-eq-10962/ESETOR,
   :fibo-fnd-rel-rel/hasTag "ESETOR",
   :rdf/type #{:fibo-sec-sec-cls/FinancialInstrumentClassificationCode
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label "ESETOR CFI common/ordinary share classifier",
   :skos/definition
   "CFI code for a common, enhanced voting, restricted transfer, nil paid, registered share"})

(def ESETPR
  {:cmns-col/isMemberOf :fibo-sec-sec-cls/ISO10962-201910-CodeScheme,
   :db/ident :fibo-sec-eq-10962/ESETPR,
   :fibo-fnd-rel-rel/hasTag "ESETPR",
   :rdf/type #{:fibo-sec-sec-cls/FinancialInstrumentClassificationCode
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label "ESETPR CFI common/ordinary share classifier",
   :skos/definition
   "CFI code for a common, enhanced voting, restricted transfer, partly paid, registered share"})

(def ESEUFR
  {:cmns-col/isMemberOf :fibo-sec-sec-cls/ISO10962-201910-CodeScheme,
   :db/ident :fibo-sec-eq-10962/ESEUFR,
   :fibo-fnd-rel-rel/hasTag "ESEUFR",
   :rdf/type #{:fibo-sec-sec-cls/FinancialInstrumentClassificationCode
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label "ESEUFR CFI common/ordinary share classifier",
   :skos/definition
   "CFI code for a common, enhanced voting, unrestricted transfer, fully-paid, registered share"})

(def ESEUOR
  {:cmns-col/isMemberOf :fibo-sec-sec-cls/ISO10962-201910-CodeScheme,
   :db/ident :fibo-sec-eq-10962/ESEUOR,
   :fibo-fnd-rel-rel/hasTag "ESEUOR",
   :rdf/type #{:fibo-sec-sec-cls/FinancialInstrumentClassificationCode
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label "ESEUOR CFI common/ordinary share classifier",
   :skos/definition
   "CFI code for a common, enhanced voting, unrestricted transfer, nil paid, registered share"})

(def ESEUPR
  {:cmns-col/isMemberOf :fibo-sec-sec-cls/ISO10962-201910-CodeScheme,
   :db/ident :fibo-sec-eq-10962/ESEUPR,
   :fibo-fnd-rel-rel/hasTag "ESEUPR",
   :rdf/type #{:fibo-sec-sec-cls/FinancialInstrumentClassificationCode
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label "ESEUPR CFI common/ordinary share classifier",
   :skos/definition
   "CFI code for a common, enhanced voting, unrestricted transfer, partially paid, registered share"})

(def ESNTFR
  {:cmns-col/isMemberOf :fibo-sec-sec-cls/ISO10962-201910-CodeScheme,
   :db/ident :fibo-sec-eq-10962/ESNTFR,
   :fibo-fnd-rel-rel/hasTag "ESNTFR",
   :rdf/type #{:fibo-sec-sec-cls/FinancialInstrumentClassificationCode
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label "ESNTFR CFI common/ordinary share classifier",
   :skos/definition
   "CFI code for a common, non-voting, restricted transfer, fully-paid, registered share"})

(def ESNTOR
  {:cmns-col/isMemberOf :fibo-sec-sec-cls/ISO10962-201910-CodeScheme,
   :db/ident :fibo-sec-eq-10962/ESNTOR,
   :fibo-fnd-rel-rel/hasTag "ESNTOR",
   :rdf/type #{:fibo-sec-sec-cls/FinancialInstrumentClassificationCode
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label "ESNTOR CFI common/ordinary share classifier",
   :skos/definition
   "CFI code for a common, non-voting, restricted transfer, nil paid, registered share"})

(def ESNTPR
  {:cmns-col/isMemberOf :fibo-sec-sec-cls/ISO10962-201910-CodeScheme,
   :db/ident :fibo-sec-eq-10962/ESNTPR,
   :fibo-fnd-rel-rel/hasTag "ESNTPR",
   :rdf/type #{:fibo-sec-sec-cls/FinancialInstrumentClassificationCode
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label "ESNTPR CFI common/ordinary share classifier",
   :skos/definition
   "CFI code for a common, non-voting, restricted transfer, partially paid, registered share"})

(def ESNUFR
  {:cmns-col/isMemberOf :fibo-sec-sec-cls/ISO10962-201910-CodeScheme,
   :db/ident :fibo-sec-eq-10962/ESNUFR,
   :fibo-fnd-rel-rel/hasTag "ESNUFR",
   :rdf/type #{:fibo-sec-sec-cls/FinancialInstrumentClassificationCode
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label "ESNUFR CFI common/ordinary share classifier",
   :skos/definition
   "CFI code for a common, non-voting, unrestricted transfer, fully-paid, registered share"})

(def ESNUOR
  {:cmns-col/isMemberOf :fibo-sec-sec-cls/ISO10962-201910-CodeScheme,
   :db/ident :fibo-sec-eq-10962/ESNUOR,
   :fibo-fnd-rel-rel/hasTag "ESNUOR",
   :rdf/type #{:fibo-sec-sec-cls/FinancialInstrumentClassificationCode
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label "ESNUOR CFI common/ordinary share classifier",
   :skos/definition
   "CFI code for a common, non-voting, unrestricted transfer, nil paid, registered share"})

(def ESNUPR
  {:cmns-col/isMemberOf :fibo-sec-sec-cls/ISO10962-201910-CodeScheme,
   :db/ident :fibo-sec-eq-10962/ESNUPR,
   :fibo-fnd-rel-rel/hasTag "ESNUPR",
   :rdf/type #{:fibo-sec-sec-cls/FinancialInstrumentClassificationCode
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label "ESNUPR CFI common/ordinary share classifier",
   :skos/definition
   "CFI code for a common, non-voting, unrestricted transfer, partially paid, registered share"})

(def ESRTFR
  {:cmns-col/isMemberOf :fibo-sec-sec-cls/ISO10962-201910-CodeScheme,
   :db/ident :fibo-sec-eq-10962/ESRTFR,
   :fibo-fnd-rel-rel/hasTag "ESRTFR",
   :rdf/type #{:fibo-sec-sec-cls/FinancialInstrumentClassificationCode
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label "ESRTFR CFI common/ordinary share classifier",
   :skos/definition
   "CFI code for a common, restricted voting, restricted transfer, fully-paid, registered share"})

(def ESRTOR
  {:cmns-col/isMemberOf :fibo-sec-sec-cls/ISO10962-201910-CodeScheme,
   :db/ident :fibo-sec-eq-10962/ESRTOR,
   :fibo-fnd-rel-rel/hasTag "ESRTOR",
   :rdf/type #{:fibo-sec-sec-cls/FinancialInstrumentClassificationCode
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label "ESRTOR CFI common/ordinary share classifier",
   :skos/definition
   "CFI code for a common, restricted voting, restricted transfer, nil paid, registered share"})

(def ESRTPR
  {:cmns-col/isMemberOf :fibo-sec-sec-cls/ISO10962-201910-CodeScheme,
   :db/ident :fibo-sec-eq-10962/ESRTPR,
   :fibo-fnd-rel-rel/hasTag "ESRTPR",
   :rdf/type #{:fibo-sec-sec-cls/FinancialInstrumentClassificationCode
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label "ESRTPR CFI common/ordinary share classifier",
   :skos/definition
   "CFI code for a common, restricted voting, restricted transfer, partly paid, registered share"})

(def ESRUFR
  {:cmns-col/isMemberOf :fibo-sec-sec-cls/ISO10962-201910-CodeScheme,
   :db/ident :fibo-sec-eq-10962/ESRUFR,
   :fibo-fnd-rel-rel/hasTag "ESRUFR",
   :rdf/type #{:fibo-sec-sec-cls/FinancialInstrumentClassificationCode
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label "ESRUFR CFI common/ordinary share classifier",
   :skos/definition
   "CFI code for a common, restricted voting, unrestricted transfer, fully-paid, registered share"})

(def ESRUOR
  {:cmns-col/isMemberOf :fibo-sec-sec-cls/ISO10962-201910-CodeScheme,
   :db/ident :fibo-sec-eq-10962/ESRUOR,
   :fibo-fnd-rel-rel/hasTag "ESRUOR",
   :rdf/type #{:fibo-sec-sec-cls/FinancialInstrumentClassificationCode
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label "ESRUOR CFI common/ordinary share classifier",
   :skos/definition
   "CFI code for a common, restricted voting, unrestricted transfer, nil paid, registered share"})

(def ESRUPR
  {:cmns-col/isMemberOf :fibo-sec-sec-cls/ISO10962-201910-CodeScheme,
   :db/ident :fibo-sec-eq-10962/ESRUPR,
   :fibo-fnd-rel-rel/hasTag "ESRUPR",
   :rdf/type #{:fibo-sec-sec-cls/FinancialInstrumentClassificationCode
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label "ESRUPR CFI common/ordinary share classifier",
   :skos/definition
   "CFI code for a common, restricted voting, unrestricted transfer, partly paid, registered share"})

(def ESVTFR
  {:cmns-col/isMemberOf :fibo-sec-sec-cls/ISO10962-201910-CodeScheme,
   :db/ident :fibo-sec-eq-10962/ESVTFR,
   :fibo-fnd-rel-rel/hasTag "ESVTFR",
   :rdf/type #{:fibo-sec-sec-cls/FinancialInstrumentClassificationCode
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label "ESVTFR CFI common/ordinary share classifier",
   :skos/definition
   "CFI code for a common, voting, restricted transfer, fully-paid, registered share"})

(def ESVTOR
  {:cmns-col/isMemberOf :fibo-sec-sec-cls/ISO10962-201910-CodeScheme,
   :db/ident :fibo-sec-eq-10962/ESVTOR,
   :fibo-fnd-rel-rel/hasTag "ESVTOR",
   :rdf/type #{:fibo-sec-sec-cls/FinancialInstrumentClassificationCode
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label "ESVTOR CFI common/ordinary share classifier",
   :skos/definition
   "CFI code for a common, voting, restricted transfer, nil paid, registered share"})

(def ESVTPR
  {:cmns-col/isMemberOf :fibo-sec-sec-cls/ISO10962-201910-CodeScheme,
   :db/ident :fibo-sec-eq-10962/ESVTPR,
   :fibo-fnd-rel-rel/hasTag "ESVTPR",
   :rdf/type #{:fibo-sec-sec-cls/FinancialInstrumentClassificationCode
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label "ESVTPR CFI common/ordinary share classifier",
   :skos/definition
   "CFI code for a common, voting, restricted transfer, partly paid, registered share"})

(def ESVUFR
  {:cmns-col/isMemberOf :fibo-sec-sec-cls/ISO10962-201910-CodeScheme,
   :db/ident :fibo-sec-eq-10962/ESVUFR,
   :fibo-fnd-rel-rel/hasTag "ESVUFR",
   :rdf/type #{:fibo-sec-sec-cls/FinancialInstrumentClassificationCode
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label "ESVUFR CFI common/ordinary share classifier",
   :skos/definition
   "CFI code for a common, voting, unrestricted transfer, fully-paid, registered share"})

(def ESVUOR
  {:cmns-col/isMemberOf :fibo-sec-sec-cls/ISO10962-201910-CodeScheme,
   :db/ident :fibo-sec-eq-10962/ESVUOR,
   :fibo-fnd-rel-rel/hasTag "ESVUOR",
   :rdf/type #{:fibo-sec-sec-cls/FinancialInstrumentClassificationCode
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label "ESVUOR CFI common/ordinary share classifier",
   :skos/definition
   "CFI code for a common, voting, unrestricted transfer, nil paid, registered share"})

(def ESVUPR
  {:cmns-col/isMemberOf :fibo-sec-sec-cls/ISO10962-201910-CodeScheme,
   :db/ident :fibo-sec-eq-10962/ESVUPR,
   :fibo-fnd-rel-rel/hasTag "ESVUPR",
   :rdf/type #{:fibo-sec-sec-cls/FinancialInstrumentClassificationCode
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label "ESVUPR CFI common/ordinary share classifier",
   :skos/definition
   "CFI code for a common, voting, unrestricted transfer, partly paid, registered share"})

(def PreferredEnhancedVotingExchangeableAdjustableIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredEnhancedVotingExchangeableAdjustableIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, enhanced voting, exchangeable, adjustable income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/PreferredShareWithAdjustableRateDividend
                      :fibo-sec-eq-eq/EnhancedVotingShare
                      :fibo-sec-eq-eq/ExchangeablePreferredShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers multiple votes per share, may be exchanged for securities of another issuer, provides a periodic income whose dividend rate is set periodically, and is registered"})

(def PreferredEnhancedVotingExchangeableAuctionRateIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredEnhancedVotingExchangeableAuctionRateIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, enhanced voting, exchangeable, auction rate income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/EnhancedVotingShare
                      :fibo-sec-eq-eq/PreferredShareWithAuctionRateDividend
                      :fibo-sec-eq-eq/ExchangeablePreferredShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers multiple votes per share, may be exchanged for securities of another issuer, provides a periodic income whose dividend rate is adjusted through an auction, and is registered"})

(def PreferredEnhancedVotingExchangeableCumulativeParticipatingRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredEnhancedVotingExchangeableCumulativeParticipatingRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, enhanced voting, exchangeable, cumulative participating, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/EnhancedVotingShare
                      :fibo-sec-eq-eq/ExchangeablePreferredShare
                      :fibo-sec-eq-eq/CumulativePreferredShare
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-eq-eq/ParticipatingPreferredShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers multiple votes per share, may be exchanged for securities of another issuer, provides a periodic stated income, dividends not paid in any year accumulate, and participates with common shareholders in further dividend and capital distributions, and is registered"})

(def PreferredEnhancedVotingExchangeableCumulativeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredEnhancedVotingExchangeableCumulativeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, enhanced voting, exchangeable, cumulative, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/EnhancedVotingShare
                      :fibo-sec-eq-eq/ExchangeablePreferredShare
                      :fibo-sec-eq-eq/NonParticipatingPreferredShare
                      :fibo-sec-eq-eq/CumulativePreferredShare
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers multiple votes per share, may be exchanged for securities of another issuer, provides a periodic stated income and dividends not paid in any year accumulate, and is registered"})

(def PreferredEnhancedVotingExchangeableFixedIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredEnhancedVotingExchangeableFixedIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, enhanced voting, exchangeable, fixed income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/EnhancedVotingShare
                      :fibo-sec-eq-eq/ExchangeablePreferredShare
                      :fibo-sec-eq-eq/NonParticipatingPreferredShare
                      :fibo-sec-eq-eq/NonCumulativePreferredShare
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers multiple votes per share, may be exchanged for securities of another issuer, provides a periodic stated income, and is registered"})

(def PreferredEnhancedVotingExchangeableNormalIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredEnhancedVotingExchangeableNormalIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, enhanced voting, exchangeable, normal income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/EnhancedVotingShare
                      :fibo-sec-eq-eq/ExchangeablePreferredShare
                      :fibo-sec-eq-eq/NonCumulativePreferredShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers multiple votes per share, may be exchanged for securities of another issuer, provides the same dividends as common/ordinary shareholders, and is registered"})

(def PreferredEnhancedVotingExchangeableParticipatingRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredEnhancedVotingExchangeableParticipatingRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, enhanced voting, exchangeable, participating, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/EnhancedVotingShare
                      :fibo-sec-eq-eq/ExchangeablePreferredShare
                      :fibo-sec-eq-eq/NonCumulativePreferredShare
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-eq-eq/ParticipatingPreferredShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers multiple votes per share, may be exchanged for securities of another issuer, provides a periodic stated income and participates with common shareholders in further dividend and capital distributions, and is registered"})

(def PreferredEnhancedVotingExtendableAdjustableIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredEnhancedVotingExtendableAdjustableIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, enhanced voting, extendable, adjustable income, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/PreferredShareWithAdjustableRateDividend
     :fibo-sec-eq-eq/ExtendablePreferredShare
     :fibo-sec-eq-eq/EnhancedVotingShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableRedemptionDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableRedemptionDate],
      :rdf/type :owl/Class} :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers multiple votes per share, may be redeemed at the option of the issuer and/or of the shareholder with an extendable redemption date, provides a periodic income whose dividend rate is set periodically, and is registered"})

(def PreferredEnhancedVotingExtendableAuctionRateIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredEnhancedVotingExtendableAuctionRateIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, enhanced voting, extendable, auction rate income, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare
     :fibo-sec-eq-eq/EnhancedVotingShare
     :fibo-sec-eq-eq/PreferredShareWithAuctionRateDividend
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableRedemptionDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableRedemptionDate],
      :rdf/type :owl/Class} :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers multiple votes per share, may be redeemed at the option of the issuer and/or of the shareholder with an extendable redemption date, provides a periodic income whose dividend rate is adjusted through an auction, and is registered"})

(def PreferredEnhancedVotingExtendableCumulativeParticipatingRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredEnhancedVotingExtendableCumulativeParticipatingRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, enhanced voting, extendable, cumulative participating, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare
     :fibo-sec-eq-eq/EnhancedVotingShare
     :fibo-sec-eq-eq/CumulativePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableRedemptionDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableRedemptionDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
     :fibo-sec-eq-eq/ParticipatingPreferredShare
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers multiple votes per share, may be redeemed at the option of the issuer and/or of the shareholder with an extendable redemption date, provides a periodic stated income, dividends not paid in any year accumulate, and participates with common shareholders in further dividend and capital distributions, and is registered"})

(def PreferredEnhancedVotingExtendableCumulativeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredEnhancedVotingExtendableCumulativeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, enhanced voting, extendable, cumulative, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare
     :fibo-sec-eq-eq/EnhancedVotingShare
     :fibo-sec-eq-eq/NonParticipatingPreferredShare
     :fibo-sec-eq-eq/CumulativePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableRedemptionDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableRedemptionDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers multiple votes per share, may be redeemed at the option of the issuer and/or of the shareholder with an extendable redemption date, provides a periodic stated income and dividends not paid in any year accumulate, and is registered"})

(def PreferredEnhancedVotingExtendableFixedIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredEnhancedVotingExtendableFixedIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, enhanced voting, extendable, fixed income, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare
     :fibo-sec-eq-eq/EnhancedVotingShare
     :fibo-sec-eq-eq/NonParticipatingPreferredShare
     :fibo-sec-eq-eq/NonCumulativePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableRedemptionDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableRedemptionDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers multiple votes per share, may be redeemed at the option of the issuer and/or of the shareholder with an extendable redemption date, provides a periodic stated income, and is registered"})

(def PreferredEnhancedVotingExtendableNormalIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredEnhancedVotingExtendableNormalIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, enhanced voting, extendable, normal income, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare
     :fibo-sec-eq-eq/EnhancedVotingShare
     :fibo-sec-eq-eq/NonCumulativePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableRedemptionDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableRedemptionDate],
      :rdf/type :owl/Class} :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers multiple votes per share, may be redeemed at the option of the issuer and/or of the shareholder with an extendable redemption date, provides the same dividends as common/ordinary shareholders, and is registered"})

(def PreferredEnhancedVotingExtendableParticipatingRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredEnhancedVotingExtendableParticipatingRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, enhanced voting, extendable, participating, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare
     :fibo-sec-eq-eq/EnhancedVotingShare
     :fibo-sec-eq-eq/NonCumulativePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableRedemptionDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableRedemptionDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
     :fibo-sec-eq-eq/ParticipatingPreferredShare
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers multiple votes per share, may be redeemed at the option of the issuer and/or of the shareholder with an extendable redemption date, provides a periodic stated income and participates with common shareholders in further dividend and capital distributions, and is registered"})

(def PreferredEnhancedVotingPerpetualAdjustableIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredEnhancedVotingPerpetualAdjustableIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, enhanced voting, perpetual, adjustable income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/PreferredShareWithAdjustableRateDividend
                      :fibo-sec-eq-eq/EnhancedVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity
                      :fibo-sec-eq-eq/PerpetualPreferredShare},
   :skos/definition
   "preferred share that confers multiple votes per share, has no fixed maturity date, provides a periodic income whose dividend rate is set periodically, and is registered"})

(def PreferredEnhancedVotingPerpetualAuctionRateIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredEnhancedVotingPerpetualAuctionRateIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, enhanced voting, perpetual, auction rate income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/EnhancedVotingShare
                      :fibo-sec-eq-eq/PreferredShareWithAuctionRateDividend
                      :fibo-sec-sec-lst/RegisteredSecurity
                      :fibo-sec-eq-eq/PerpetualPreferredShare},
   :skos/definition
   "preferred share that confers multiple votes per share, has no fixed maturity date, provides a periodic income whose dividend rate is adjusted through an auction, and is registered"})

(def PreferredEnhancedVotingPerpetualCumulativeParticipatingRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredEnhancedVotingPerpetualCumulativeParticipatingRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, enhanced voting, perpetual, cumulative participating, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/EnhancedVotingShare
                      :fibo-sec-eq-eq/CumulativePreferredShare
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-eq-eq/ParticipatingPreferredShare
                      :fibo-sec-sec-lst/RegisteredSecurity
                      :fibo-sec-eq-eq/PerpetualPreferredShare},
   :skos/definition
   "preferred share that confers multiple votes per share, has no fixed maturity date, provides a periodic stated income, dividends not paid in any year accumulate, and participates with common shareholders in further dividend and capital distributions, and is registered"})

(def PreferredEnhancedVotingPerpetualCumulativeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredEnhancedVotingPerpetualCumulativeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, enhanced voting, perpetual, cumulative, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/EnhancedVotingShare
                      :fibo-sec-eq-eq/NonParticipatingPreferredShare
                      :fibo-sec-eq-eq/CumulativePreferredShare
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-sec-lst/RegisteredSecurity
                      :fibo-sec-eq-eq/PerpetualPreferredShare},
   :skos/definition
   "preferred share that confers multiple votes per share, has no fixed maturity date, provides a periodic stated income and dividends not paid in any year accumulate, and is registered"})

(def PreferredEnhancedVotingPerpetualFixedIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredEnhancedVotingPerpetualFixedIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, enhanced voting, perpetual, fixed income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/EnhancedVotingShare
                      :fibo-sec-eq-eq/NonParticipatingPreferredShare
                      :fibo-sec-eq-eq/NonCumulativePreferredShare
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-sec-lst/RegisteredSecurity
                      :fibo-sec-eq-eq/PerpetualPreferredShare},
   :skos/definition
   "preferred share that confers multiple votes per share, has no fixed maturity date, provides a periodic stated income, and is registered"})

(def PreferredEnhancedVotingPerpetualNormalIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredEnhancedVotingPerpetualNormalIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, enhanced voting, perpetual, normal income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/EnhancedVotingShare
                      :fibo-sec-eq-eq/NonCumulativePreferredShare
                      :fibo-sec-sec-lst/RegisteredSecurity
                      :fibo-sec-eq-eq/PerpetualPreferredShare},
   :skos/definition
   "preferred share that confers multiple votes per share, has no fixed maturity date, provides the same dividends as common/ordinary shareholders, and is registered"})

(def PreferredEnhancedVotingPerpetualParticipatingRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredEnhancedVotingPerpetualParticipatingRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, enhanced voting, perpetual, participating, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/EnhancedVotingShare
                      :fibo-sec-eq-eq/NonCumulativePreferredShare
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-eq-eq/ParticipatingPreferredShare
                      :fibo-sec-sec-lst/RegisteredSecurity
                      :fibo-sec-eq-eq/PerpetualPreferredShare},
   :skos/definition
   "preferred share that confers multiple votes per share, has no fixed maturity date, provides a periodic stated income and participates with common shareholders in further dividend and capital distributions, and is registered"})

(def PreferredEnhancedVotingRedeemableAdjustableIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredEnhancedVotingRedeemableAdjustableIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, enhanced voting, redeemable, adjustable income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/PreferredShareWithAdjustableRateDividend
                      :fibo-sec-eq-eq/EnhancedVotingShare
                      {:owl/unionOf [:fibo-sec-eq-eq/RedeemablePreferredShare
                                     :fibo-sec-eq-eq/RetractablePreferredShare],
                       :rdf/type    :owl/Class}
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers multiple votes per share, may be redeemed at the option of the issuer and/or of the shareholder, provides a periodic income whose dividend rate is set periodically, and is registered"})

(def PreferredEnhancedVotingRedeemableAuctionRateIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredEnhancedVotingRedeemableAuctionRateIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, enhanced voting, redeemable, auction rate income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/EnhancedVotingShare
                      :fibo-sec-eq-eq/PreferredShareWithAuctionRateDividend
                      {:owl/unionOf [:fibo-sec-eq-eq/RedeemablePreferredShare
                                     :fibo-sec-eq-eq/RetractablePreferredShare],
                       :rdf/type    :owl/Class}
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers multiple votes per share, may be redeemed at the option of the issuer and/or of the shareholder, provides a periodic income whose dividend rate is adjusted through an auction, and is registered"})

(def PreferredEnhancedVotingRedeemableCumulativeParticipatingRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredEnhancedVotingRedeemableCumulativeParticipatingRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, enhanced voting, redeemable, cumulative participating, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/EnhancedVotingShare
                      :fibo-sec-eq-eq/CumulativePreferredShare
                      {:owl/unionOf [:fibo-sec-eq-eq/RedeemablePreferredShare
                                     :fibo-sec-eq-eq/RetractablePreferredShare],
                       :rdf/type    :owl/Class}
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-eq-eq/ParticipatingPreferredShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers multiple votes per share, may be redeemed at the option of the issuer and/or of the shareholder, provides a periodic stated income, dividends not paid in any year accumulate, and participates with common shareholders in further dividend and capital distributions, and is registered"})

(def PreferredEnhancedVotingRedeemableCumulativeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredEnhancedVotingRedeemableCumulativeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, enhanced voting, redeemable, cumulative, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/EnhancedVotingShare
                      :fibo-sec-eq-eq/NonParticipatingPreferredShare
                      :fibo-sec-eq-eq/CumulativePreferredShare
                      {:owl/unionOf [:fibo-sec-eq-eq/RedeemablePreferredShare
                                     :fibo-sec-eq-eq/RetractablePreferredShare],
                       :rdf/type    :owl/Class}
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers multiple votes per share, may be redeemed at the option of the issuer and/or of the shareholder, provides a periodic stated income and dividends not paid in any year accumulate, and is registered"})

(def
  PreferredEnhancedVotingRedeemableExchangeableAdjustableIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredEnhancedVotingRedeemableExchangeableAdjustableIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, enhanced voting, redeemable exchangeable, adjustable income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/PreferredShareWithAdjustableRateDividend
                      :fibo-sec-eq-eq/EnhancedVotingShare
                      :fibo-sec-eq-eq/ExchangeablePreferredShare
                      {:owl/unionOf [:fibo-sec-eq-eq/RedeemablePreferredShare
                                     :fibo-sec-eq-eq/RetractablePreferredShare],
                       :rdf/type    :owl/Class}
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers multiple votes per share, may be redeemed at the option of the issuer and/or of the shareholder, provides a periodic income whose dividend rate is set periodically, and is registered"})

(def
  PreferredEnhancedVotingRedeemableExchangeableAuctionRateIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredEnhancedVotingRedeemableExchangeableAuctionRateIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, enhanced voting, redeemable exchangeable, auction rate income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/EnhancedVotingShare
                      :fibo-sec-eq-eq/PreferredShareWithAuctionRateDividend
                      :fibo-sec-eq-eq/ExchangeablePreferredShare
                      {:owl/unionOf [:fibo-sec-eq-eq/RedeemablePreferredShare
                                     :fibo-sec-eq-eq/RetractablePreferredShare],
                       :rdf/type    :owl/Class}
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers multiple votes per share, may be redeemed at the option of the issuer and/or of the shareholder, provides a periodic income whose dividend rate is adjusted through an auction, and is registered"})

(def
  PreferredEnhancedVotingRedeemableExchangeableCumulativeParticipatingRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredEnhancedVotingRedeemableExchangeableCumulativeParticipatingRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, enhanced voting, redeemable exchangeable, cumulative participating, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/EnhancedVotingShare
                      :fibo-sec-eq-eq/ExchangeablePreferredShare
                      :fibo-sec-eq-eq/CumulativePreferredShare
                      {:owl/unionOf [:fibo-sec-eq-eq/RedeemablePreferredShare
                                     :fibo-sec-eq-eq/RetractablePreferredShare],
                       :rdf/type    :owl/Class}
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-eq-eq/ParticipatingPreferredShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers multiple votes per share, may be exchanged for securities of another issuer, may be redeemed at the option of the issuer and/or of the shareholder, provides a periodic stated income, dividends not paid in any year accumulate, and participates with common shareholders in further dividend and capital distributions, and is registered"})

(def PreferredEnhancedVotingRedeemableExchangeableCumulativeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredEnhancedVotingRedeemableExchangeableCumulativeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, enhanced voting, redeemable exchangeable, cumulative, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/EnhancedVotingShare
                      :fibo-sec-eq-eq/ExchangeablePreferredShare
                      :fibo-sec-eq-eq/NonParticipatingPreferredShare
                      :fibo-sec-eq-eq/CumulativePreferredShare
                      {:owl/unionOf [:fibo-sec-eq-eq/RedeemablePreferredShare
                                     :fibo-sec-eq-eq/RetractablePreferredShare],
                       :rdf/type    :owl/Class}
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers multiple votes per share, may be exchanged for securities of another issuer, may be redeemed at the option of the issuer and/or of the shareholder, provides a periodic stated income and dividends not paid in any year accumulate, and is registered"})

(def
  PreferredEnhancedVotingRedeemableExchangeableExtendableAdjustableIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredEnhancedVotingRedeemableExchangeableExtendableAdjustableIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, enhanced voting, redeemable/exchangeable/extendable, adjustable income, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/PreferredShareWithAdjustableRateDividend
     :fibo-sec-eq-eq/ExtendablePreferredShare
     :fibo-sec-eq-eq/EnhancedVotingShare
     :fibo-sec-eq-eq/ExchangeablePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate],
      :rdf/type :owl/Class} :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers multiple votes per share, may be exchanged for securities of another issuer, whose issuer and/or shareholders have the option to extend the maturity date, that provides a periodic income whose dividend rate is set periodically, and is registered"})

(def
  PreferredEnhancedVotingRedeemableExchangeableExtendableAuctionRateIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredEnhancedVotingRedeemableExchangeableExtendableAuctionRateIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, enhanced voting, redeemable/exchangeable/extendable, auction rate income, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare
     :fibo-sec-eq-eq/EnhancedVotingShare
     :fibo-sec-eq-eq/PreferredShareWithAuctionRateDividend
     :fibo-sec-eq-eq/ExchangeablePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate],
      :rdf/type :owl/Class} :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers multiple votes per share, may be exchanged for securities of another issuer, whose issuer and/or shareholders have the option to extend the maturity date, that provides a periodic income whose dividend rate is adjusted through an auction, and is registered"})

(def
  PreferredEnhancedVotingRedeemableExchangeableExtendableCumulativeParticipatingRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredEnhancedVotingRedeemableExchangeableExtendableCumulativeParticipatingRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, enhanced voting, redeemable/exchangeable/extendable, cumulative participating, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare
     :fibo-sec-eq-eq/EnhancedVotingShare
     :fibo-sec-eq-eq/ExchangeablePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/CumulativePreferredShare
     :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
     :fibo-sec-eq-eq/ParticipatingPreferredShare
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers multiple votes per share, may be exchanged for securities of another issuer, whose issuer and/or shareholders have the option to extend the maturity date, that provides a periodic stated income, dividends not paid in any year accumulate, and participates with common shareholders in further dividend and capital distributions, and is registered"})

(def
  PreferredEnhancedVotingRedeemableExchangeableExtendableCumulativeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredEnhancedVotingRedeemableExchangeableExtendableCumulativeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, enhanced voting, redeemable/exchangeable/extendable, cumulative, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare
     :fibo-sec-eq-eq/EnhancedVotingShare
     :fibo-sec-eq-eq/ExchangeablePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/NonParticipatingPreferredShare
     :fibo-sec-eq-eq/CumulativePreferredShare
     :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers multiple votes per share, may be exchanged for securities of another issuer, whose issuer and/or shareholders have the option to extend the maturity date, that provides a periodic stated income and dividends not paid in any year accumulate, and is registered"})

(def
  PreferredEnhancedVotingRedeemableExchangeableExtendableFixedIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredEnhancedVotingRedeemableExchangeableExtendableFixedIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, enhanced voting, redeemable/exchangeable/extendable, fixed income, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare
     :fibo-sec-eq-eq/EnhancedVotingShare
     :fibo-sec-eq-eq/ExchangeablePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/NonParticipatingPreferredShare
     :fibo-sec-eq-eq/NonCumulativePreferredShare
     :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers multiple votes per share, may be exchanged for securities of another issuer, whose issuer and/or shareholders have the option to extend the maturity date, that provides a periodic stated income, and is registered"})

(def
  PreferredEnhancedVotingRedeemableExchangeableExtendableNormalIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredEnhancedVotingRedeemableExchangeableExtendableNormalIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, enhanced voting, redeemable/exchangeable/extendable, normal income, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare
     :fibo-sec-eq-eq/EnhancedVotingShare
     :fibo-sec-eq-eq/ExchangeablePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/NonCumulativePreferredShare
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers multiple votes per share, may be exchanged for securities of another issuer, whose issuer and/or shareholders have the option to extend the maturity date, that provides the same dividends as common/ordinary shareholders, and is registered"})

(def
  PreferredEnhancedVotingRedeemableExchangeableExtendableParticipatingRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredEnhancedVotingRedeemableExchangeableExtendableParticipatingRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, enhanced voting, redeemable/exchangeable/extendable, participating, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare
     :fibo-sec-eq-eq/EnhancedVotingShare
     :fibo-sec-eq-eq/ExchangeablePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/NonCumulativePreferredShare
     :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
     :fibo-sec-eq-eq/ParticipatingPreferredShare
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers multiple votes per share, may be exchanged for securities of another issuer, whose issuer and/or shareholders have the option to extend the maturity date, that provides a periodic stated income and participates with common shareholders in further dividend and capital distributions, and is registered"})

(def PreferredEnhancedVotingRedeemableExchangeableFixedIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredEnhancedVotingRedeemableExchangeableFixedIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, enhanced voting, redeemable exchangeable, fixed income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/EnhancedVotingShare
                      :fibo-sec-eq-eq/ExchangeablePreferredShare
                      :fibo-sec-eq-eq/NonParticipatingPreferredShare
                      :fibo-sec-eq-eq/NonCumulativePreferredShare
                      {:owl/unionOf [:fibo-sec-eq-eq/RedeemablePreferredShare
                                     :fibo-sec-eq-eq/RetractablePreferredShare],
                       :rdf/type    :owl/Class}
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers multiple votes per share, may be exchanged for securities of another issuer, may be redeemed at the option of the issuer and/or of the shareholder, provides a periodic stated income, and is registered"})

(def PreferredEnhancedVotingRedeemableExchangeableNormalIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredEnhancedVotingRedeemableExchangeableNormalIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, enhanced voting, redeemable exchangeable, normal income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/EnhancedVotingShare
                      :fibo-sec-eq-eq/ExchangeablePreferredShare
                      {:owl/unionOf [:fibo-sec-eq-eq/RedeemablePreferredShare
                                     :fibo-sec-eq-eq/RetractablePreferredShare],
                       :rdf/type    :owl/Class}
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers multiple votes per share, may be exchanged for securities of another issuer, may be redeemed at the option of the issuer and/or of the shareholder, provides the same dividends as common/ordinary shareholders, and is registered"})

(def PreferredEnhancedVotingRedeemableExchangeableParticipatingRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredEnhancedVotingRedeemableExchangeableParticipatingRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, enhanced voting, redeemable exchangeable, participating, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/EnhancedVotingShare
                      :fibo-sec-eq-eq/ExchangeablePreferredShare
                      :fibo-sec-eq-eq/NonCumulativePreferredShare
                      {:owl/unionOf [:fibo-sec-eq-eq/RedeemablePreferredShare
                                     :fibo-sec-eq-eq/RetractablePreferredShare],
                       :rdf/type    :owl/Class}
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-eq-eq/ParticipatingPreferredShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers multiple votes per share, may be exchanged for securities of another issuer, may be redeemed at the option of the issuer and/or of the shareholder, provides a periodic stated income and participates with common shareholders in further dividend and capital distributions, and is registered"})

(def PreferredEnhancedVotingRedeemableExtendableAdjustableIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredEnhancedVotingRedeemableExtendableAdjustableIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, enhanced voting, redeemable extendable, adjustable income, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/PreferredShareWithAdjustableRateDividend
     :fibo-sec-eq-eq/ExtendablePreferredShare
     :fibo-sec-eq-eq/EnhancedVotingShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate],
      :rdf/type :owl/Class} :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers multiple votes per share, whose issuer and/or shareholders have the option to extend the maturity date, that provides a periodic income whose dividend rate is set periodically, and is registered"})

(def PreferredEnhancedVotingRedeemableExtendableAuctionRateIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredEnhancedVotingRedeemableExtendableAuctionRateIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, enhanced voting, redeemable extendable, auction rate income, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare
     :fibo-sec-eq-eq/EnhancedVotingShare
     :fibo-sec-eq-eq/PreferredShareWithAuctionRateDividend
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate],
      :rdf/type :owl/Class} :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers multiple votes per share, whose issuer and/or shareholders have the option to extend the maturity date, that provides a periodic income whose dividend rate is adjusted through an auction, and is registered"})

(def
  PreferredEnhancedVotingRedeemableExtendableCumulativeParticipatingRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredEnhancedVotingRedeemableExtendableCumulativeParticipatingRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, enhanced voting, redeemable extendable, cumulative participating, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare
     :fibo-sec-eq-eq/EnhancedVotingShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/CumulativePreferredShare
     :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
     :fibo-sec-eq-eq/ParticipatingPreferredShare
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers multiple votes per share, whose issuer and/or shareholders have the option to extend the maturity date, that provides a periodic stated income, dividends not paid in any year accumulate, and participates with common shareholders in further dividend and capital distributions, and is registered"})

(def PreferredEnhancedVotingRedeemableExtendableCumulativeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredEnhancedVotingRedeemableExtendableCumulativeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, enhanced voting, redeemable extendable, cumulative, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare
     :fibo-sec-eq-eq/EnhancedVotingShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/NonParticipatingPreferredShare
     :fibo-sec-eq-eq/CumulativePreferredShare
     :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers multiple votes per share, whose issuer and/or shareholders have the option to extend the maturity date, that provides a periodic stated income and dividends not paid in any year accumulate, and is registered"})

(def PreferredEnhancedVotingRedeemableExtendableFixedIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredEnhancedVotingRedeemableExtendableFixedIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, enhanced voting, redeemable extendable, fixed income, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare
     :fibo-sec-eq-eq/EnhancedVotingShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/NonParticipatingPreferredShare
     :fibo-sec-eq-eq/NonCumulativePreferredShare
     :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers multiple votes per share, whose issuer and/or shareholders have the option to extend the maturity date, that provides a periodic stated income, and is registered"})

(def PreferredEnhancedVotingRedeemableExtendableNormalIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredEnhancedVotingRedeemableExtendableNormalIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, enhanced voting, redeemable extendable, normal income, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare
     :fibo-sec-eq-eq/EnhancedVotingShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate],
      :rdf/type :owl/Class} :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers multiple votes per share, whose issuer and/or shareholders have the option to extend the maturity date, that provides the same dividends as common/ordinary shareholders, and is registered"})

(def PreferredEnhancedVotingRedeemableExtendableParticipatingRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredEnhancedVotingRedeemableExtendableParticipatingRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, enhanced voting, redeemable extendable, participating, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare
     :fibo-sec-eq-eq/EnhancedVotingShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/NonCumulativePreferredShare
     :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
     :fibo-sec-eq-eq/ParticipatingPreferredShare
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers multiple votes per share, whose issuer and/or shareholders have the option to extend the maturity date, that provides a periodic stated income and participates with common shareholders in further dividend and capital distributions, and is registered"})

(def PreferredEnhancedVotingRedeemableFixedIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredEnhancedVotingRedeemableFixedIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, enhanced voting, redeemable, fixed income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/EnhancedVotingShare
                      :fibo-sec-eq-eq/NonParticipatingPreferredShare
                      :fibo-sec-eq-eq/NonCumulativePreferredShare
                      {:owl/unionOf [:fibo-sec-eq-eq/RedeemablePreferredShare
                                     :fibo-sec-eq-eq/RetractablePreferredShare],
                       :rdf/type    :owl/Class}
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers multiple votes per share, may be redeemed at the option of the issuer and/or of the shareholder, provides a periodic stated income, and is registered"})

(def PreferredEnhancedVotingRedeemableNormalIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredEnhancedVotingRedeemableNormalIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, enhanced voting, redeemable, normal income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/EnhancedVotingShare
                      {:owl/unionOf [:fibo-sec-eq-eq/RedeemablePreferredShare
                                     :fibo-sec-eq-eq/RetractablePreferredShare],
                       :rdf/type    :owl/Class}
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers multiple votes per share, may be redeemed at the option of the issuer and/or of the shareholder, provides the same dividends as common/ordinary shareholders, and is registered"})

(def PreferredEnhancedVotingRedeemableParticipatingRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredEnhancedVotingRedeemableParticipatingRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, enhanced voting, redeemable, participating, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/EnhancedVotingShare
                      :fibo-sec-eq-eq/NonCumulativePreferredShare
                      {:owl/unionOf [:fibo-sec-eq-eq/RedeemablePreferredShare
                                     :fibo-sec-eq-eq/RetractablePreferredShare],
                       :rdf/type    :owl/Class}
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-eq-eq/ParticipatingPreferredShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers multiple votes per share, may be redeemed at the option of the issuer and/or of the shareholder, provides a periodic stated income and participates with common shareholders in further dividend and capital distributions, and is registered"})

(def PreferredNonVotingExchangeableAdjustableIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredNonVotingExchangeableAdjustableIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, non-voting, exchangeable, adjustable income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/PreferredShareWithAdjustableRateDividend
                      :fibo-sec-eq-eq/ExchangeablePreferredShare
                      :fibo-sec-eq-eq/NonVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers zero votes per share, may be exchanged for securities of another issuer, provides a periodic income whose dividend rate is set periodically, and is registered"})

(def PreferredNonVotingExchangeableAuctionRateIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredNonVotingExchangeableAuctionRateIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, non-voting, exchangeable, auction rate income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/PreferredShareWithAuctionRateDividend
                      :fibo-sec-eq-eq/ExchangeablePreferredShare
                      :fibo-sec-eq-eq/NonVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers zero votes per share, may be exchanged for securities of another issuer, provides a periodic income whose dividend rate is adjusted through an auction, and is registered"})

(def PreferredNonVotingExchangeableCumulativeParticipatingRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredNonVotingExchangeableCumulativeParticipatingRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, non-voting, exchangeable, cumulative participating, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/ExchangeablePreferredShare
                      :fibo-sec-eq-eq/CumulativePreferredShare
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-eq-eq/ParticipatingPreferredShare
                      :fibo-sec-eq-eq/NonVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers zero votes per share, may be exchanged for securities of another issuer, provides a periodic stated income, dividends not paid in any year accumulate, and participates with common shareholders in further dividend and capital distributions, and is registered"})

(def PreferredNonVotingExchangeableCumulativeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredNonVotingExchangeableCumulativeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, non-voting, exchangeable, cumulative, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/ExchangeablePreferredShare
                      :fibo-sec-eq-eq/NonParticipatingPreferredShare
                      :fibo-sec-eq-eq/CumulativePreferredShare
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-eq-eq/NonVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers zero votes per share, may be exchanged for securities of another issuer, provides a periodic stated income and dividends not paid in any year accumulate, and is registered"})

(def PreferredNonVotingExchangeableFixedIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredNonVotingExchangeableFixedIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, non-voting, exchangeable, fixed income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/ExchangeablePreferredShare
                      :fibo-sec-eq-eq/NonParticipatingPreferredShare
                      :fibo-sec-eq-eq/NonCumulativePreferredShare
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-eq-eq/NonVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers zero votes per share, may be exchanged for securities of another issuer, provides a periodic stated income, and is registered"})

(def PreferredNonVotingExchangeableNormalIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredNonVotingExchangeableNormalIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, non-voting, exchangeable, normal income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/ExchangeablePreferredShare
                      :fibo-sec-eq-eq/NonCumulativePreferredShare
                      :fibo-sec-eq-eq/NonVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers zero votes per share, may be exchanged for securities of another issuer, provides the same dividends as common/ordinary shareholders, and is registered"})

(def PreferredNonVotingExchangeableParticipatingRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredNonVotingExchangeableParticipatingRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, non-voting, exchangeable, participating, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/ExchangeablePreferredShare
                      :fibo-sec-eq-eq/NonCumulativePreferredShare
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-eq-eq/ParticipatingPreferredShare
                      :fibo-sec-eq-eq/NonVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers zero votes per share, may be exchanged for securities of another issuer, provides a periodic stated income and participates with common shareholders in further dividend and capital distributions, and is registered"})

(def PreferredNonVotingExtendableAdjustableIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredNonVotingExtendableAdjustableIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, non-voting, extendable, adjustable income, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/PreferredShareWithAdjustableRateDividend
     :fibo-sec-eq-eq/ExtendablePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableRedemptionDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableRedemptionDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/NonVotingShare
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers zero votes per share, may be redeemed at the option of the issuer and/or of the shareholder with an extendable redemption date, provides a periodic income whose dividend rate is set periodically, and is registered"})

(def PreferredNonVotingExtendableAuctionRateIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredNonVotingExtendableAuctionRateIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, non-voting, extendable, auction rate income, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare
     :fibo-sec-eq-eq/PreferredShareWithAuctionRateDividend
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableRedemptionDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableRedemptionDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/NonVotingShare
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers zero votes per share, may be redeemed at the option of the issuer and/or of the shareholder with an extendable redemption date, provides a periodic income whose dividend rate is adjusted through an auction, and is registered"})

(def PreferredNonVotingExtendableCumulativeParticipatingRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredNonVotingExtendableCumulativeParticipatingRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, non-voting, extendable, cumulative participating, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare
     :fibo-sec-eq-eq/CumulativePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableRedemptionDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableRedemptionDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
     :fibo-sec-eq-eq/ParticipatingPreferredShare :fibo-sec-eq-eq/NonVotingShare
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers zero votes per share, may be redeemed at the option of the issuer and/or of the shareholder with an extendable redemption date, provides a periodic stated income, dividends not paid in any year accumulate, and participates with common shareholders in further dividend and capital distributions, and is registered"})

(def PreferredNonVotingExtendableCumulativeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredNonVotingExtendableCumulativeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, non-voting, extendable, cumulative, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare
     :fibo-sec-eq-eq/NonParticipatingPreferredShare
     :fibo-sec-eq-eq/CumulativePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableRedemptionDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableRedemptionDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
     :fibo-sec-eq-eq/NonVotingShare :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers zero votes per share, may be redeemed at the option of the issuer and/or of the shareholder with an extendable redemption date, provides a periodic stated income and dividends not paid in any year accumulate, and is registered"})

(def PreferredNonVotingExtendableFixedIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredNonVotingExtendableFixedIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, non-voting, extendable, fixed income, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare
     :fibo-sec-eq-eq/NonParticipatingPreferredShare
     :fibo-sec-eq-eq/NonCumulativePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableRedemptionDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableRedemptionDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
     :fibo-sec-eq-eq/NonVotingShare :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers zero votes per share, may be redeemed at the option of the issuer and/or of the shareholder with an extendable redemption date, provides a periodic stated income, and is registered"})

(def PreferredNonVotingExtendableNormalIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredNonVotingExtendableNormalIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, non-voting, extendable, normal income, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare
     :fibo-sec-eq-eq/NonCumulativePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableRedemptionDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableRedemptionDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/NonVotingShare
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers zero votes per share, may be redeemed at the option of the issuer and/or of the shareholder with an extendable redemption date, provides the same dividends as common/ordinary shareholders, and is registered"})

(def PreferredNonVotingExtendableParticipatingRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredNonVotingExtendableParticipatingRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, non-voting, extendable, participating, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare
     :fibo-sec-eq-eq/NonCumulativePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableRedemptionDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableRedemptionDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
     :fibo-sec-eq-eq/ParticipatingPreferredShare :fibo-sec-eq-eq/NonVotingShare
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers zero votes per share, may be redeemed at the option of the issuer and/or of the shareholder with an extendable redemption date, provides a periodic stated income and participates with common shareholders in further dividend and capital distributions, and is registered"})

(def PreferredNonVotingPerpetualAdjustableIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredNonVotingPerpetualAdjustableIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, non-voting, perpetual, adjustable income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/PreferredShareWithAdjustableRateDividend
                      :fibo-sec-eq-eq/NonVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity
                      :fibo-sec-eq-eq/PerpetualPreferredShare},
   :skos/definition
   "preferred share that confers zero votes per share, has no fixed maturity date, provides a periodic income whose dividend rate is set periodically, and is registered"})

(def PreferredNonVotingPerpetualAuctionRateIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredNonVotingPerpetualAuctionRateIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, non-voting, perpetual, auction rate income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/PreferredShareWithAuctionRateDividend
                      :fibo-sec-eq-eq/NonVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity
                      :fibo-sec-eq-eq/PerpetualPreferredShare},
   :skos/definition
   "preferred share that confers zero votes per share, has no fixed maturity date, provides a periodic income whose dividend rate is adjusted through an auction, and is registered"})

(def PreferredNonVotingPerpetualCumulativeParticipatingRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredNonVotingPerpetualCumulativeParticipatingRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, non-voting, perpetual, cumulative participating, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/CumulativePreferredShare
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-eq-eq/ParticipatingPreferredShare
                      :fibo-sec-eq-eq/NonVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity
                      :fibo-sec-eq-eq/PerpetualPreferredShare},
   :skos/definition
   "preferred share that confers zero votes per share, has no fixed maturity date, provides a periodic stated income, dividends not paid in any year accumulate, and participates with common shareholders in further dividend and capital distributions, and is registered"})

(def PreferredNonVotingPerpetualCumulativeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredNonVotingPerpetualCumulativeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, non-voting, perpetual, cumulative, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/NonParticipatingPreferredShare
                      :fibo-sec-eq-eq/CumulativePreferredShare
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-eq-eq/NonVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity
                      :fibo-sec-eq-eq/PerpetualPreferredShare},
   :skos/definition
   "preferred share that confers zero votes per share, has no fixed maturity date, provides a periodic stated income and dividends not paid in any year accumulate, and is registered"})

(def PreferredNonVotingPerpetualFixedIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredNonVotingPerpetualFixedIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, non-voting, perpetual, fixed income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/NonParticipatingPreferredShare
                      :fibo-sec-eq-eq/NonCumulativePreferredShare
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-eq-eq/NonVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity
                      :fibo-sec-eq-eq/PerpetualPreferredShare},
   :skos/definition
   "preferred share that confers zero votes per share, has no fixed maturity date, provides a periodic stated income, and is registered"})

(def PreferredNonVotingPerpetualNormalIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredNonVotingPerpetualNormalIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, non-voting, perpetual, normal income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/NonCumulativePreferredShare
                      :fibo-sec-eq-eq/NonVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity
                      :fibo-sec-eq-eq/PerpetualPreferredShare},
   :skos/definition
   "preferred share that confers zero votes per share, has no fixed maturity date, provides the same dividends as common/ordinary shareholders, and is registered"})

(def PreferredNonVotingPerpetualParticipatingRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredNonVotingPerpetualParticipatingRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, non-voting, perpetual, participating, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/NonCumulativePreferredShare
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-eq-eq/ParticipatingPreferredShare
                      :fibo-sec-eq-eq/NonVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity
                      :fibo-sec-eq-eq/PerpetualPreferredShare},
   :skos/definition
   "preferred share that confers zero votes per share, has no fixed maturity date, provides a periodic stated income and participates with common shareholders in further dividend and capital distributions, and is registered"})

(def PreferredNonVotingRedeemableAdjustableIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredNonVotingRedeemableAdjustableIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, non-voting, redeemable, adjustable income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/PreferredShareWithAdjustableRateDividend
                      {:owl/unionOf [:fibo-sec-eq-eq/RedeemablePreferredShare
                                     :fibo-sec-eq-eq/RetractablePreferredShare],
                       :rdf/type    :owl/Class} :fibo-sec-eq-eq/NonVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers zero votes per share, may be redeemed at the option of the issuer and/or of the shareholder, provides a periodic income whose dividend rate is set periodically, and is registered"})

(def PreferredNonVotingRedeemableAuctionRateIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredNonVotingRedeemableAuctionRateIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, non-voting, redeemable, auction rate income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/PreferredShareWithAuctionRateDividend
                      {:owl/unionOf [:fibo-sec-eq-eq/RedeemablePreferredShare
                                     :fibo-sec-eq-eq/RetractablePreferredShare],
                       :rdf/type    :owl/Class} :fibo-sec-eq-eq/NonVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers zero votes per share, may be redeemed at the option of the issuer and/or of the shareholder, provides a periodic income whose dividend rate is adjusted through an auction, and is registered"})

(def PreferredNonVotingRedeemableCumulativeParticipatingRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredNonVotingRedeemableCumulativeParticipatingRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, non-voting, redeemable, cumulative participating, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/CumulativePreferredShare
                      {:owl/unionOf [:fibo-sec-eq-eq/RedeemablePreferredShare
                                     :fibo-sec-eq-eq/RetractablePreferredShare],
                       :rdf/type    :owl/Class}
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-eq-eq/ParticipatingPreferredShare
                      :fibo-sec-eq-eq/NonVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers zero votes per share, may be redeemed at the option of the issuer and/or of the shareholder, provides a periodic stated income, dividends not paid in any year accumulate, and participates with common shareholders in further dividend and capital distributions, and is registered"})

(def PreferredNonVotingRedeemableCumulativeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredNonVotingRedeemableCumulativeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, non-voting, redeemable, cumulative, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/NonParticipatingPreferredShare
                      :fibo-sec-eq-eq/CumulativePreferredShare
                      {:owl/unionOf [:fibo-sec-eq-eq/RedeemablePreferredShare
                                     :fibo-sec-eq-eq/RetractablePreferredShare],
                       :rdf/type    :owl/Class}
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-eq-eq/NonVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers zero votes per share, may be redeemed at the option of the issuer and/or of the shareholder, provides a periodic stated income and dividends not paid in any year accumulate, and is registered"})

(def PreferredNonVotingRedeemableExchangeableAdjustableIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredNonVotingRedeemableExchangeableAdjustableIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, non-voting, redeemable exchangeable, adjustable income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/PreferredShareWithAdjustableRateDividend
                      :fibo-sec-eq-eq/ExchangeablePreferredShare
                      {:owl/unionOf [:fibo-sec-eq-eq/RedeemablePreferredShare
                                     :fibo-sec-eq-eq/RetractablePreferredShare],
                       :rdf/type    :owl/Class} :fibo-sec-eq-eq/NonVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers zero votes per share, may be redeemed at the option of the issuer and/or of the shareholder, provides a periodic income whose dividend rate is set periodically, and is registered"})

(def PreferredNonVotingRedeemableExchangeableAuctionRateIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredNonVotingRedeemableExchangeableAuctionRateIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, non-voting, redeemable exchangeable, auction rate income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/PreferredShareWithAuctionRateDividend
                      :fibo-sec-eq-eq/ExchangeablePreferredShare
                      {:owl/unionOf [:fibo-sec-eq-eq/RedeemablePreferredShare
                                     :fibo-sec-eq-eq/RetractablePreferredShare],
                       :rdf/type    :owl/Class} :fibo-sec-eq-eq/NonVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers zero votes per share, may be redeemed at the option of the issuer and/or of the shareholder, provides a periodic income whose dividend rate is adjusted through an auction, and is registered"})

(def
  PreferredNonVotingRedeemableExchangeableCumulativeParticipatingRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredNonVotingRedeemableExchangeableCumulativeParticipatingRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, non-voting, redeemable exchangeable, cumulative participating, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/ExchangeablePreferredShare
                      :fibo-sec-eq-eq/CumulativePreferredShare
                      {:owl/unionOf [:fibo-sec-eq-eq/RedeemablePreferredShare
                                     :fibo-sec-eq-eq/RetractablePreferredShare],
                       :rdf/type    :owl/Class}
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-eq-eq/ParticipatingPreferredShare
                      :fibo-sec-eq-eq/NonVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers zero votes per share, may be exchanged for securities of another issuer, may be redeemed at the option of the issuer and/or of the shareholder, provides a periodic stated income, dividends not paid in any year accumulate, and participates with common shareholders in further dividend and capital distributions, and is registered"})

(def PreferredNonVotingRedeemableExchangeableCumulativeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredNonVotingRedeemableExchangeableCumulativeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, non-voting, redeemable exchangeable, cumulative, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/ExchangeablePreferredShare
                      :fibo-sec-eq-eq/NonParticipatingPreferredShare
                      :fibo-sec-eq-eq/CumulativePreferredShare
                      {:owl/unionOf [:fibo-sec-eq-eq/RedeemablePreferredShare
                                     :fibo-sec-eq-eq/RetractablePreferredShare],
                       :rdf/type    :owl/Class}
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-eq-eq/NonVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers zero votes per share, may be exchanged for securities of another issuer, may be redeemed at the option of the issuer and/or of the shareholder, provides a periodic stated income and dividends not paid in any year accumulate, and is registered"})

(def
  PreferredNonVotingRedeemableExchangeableExtendableAdjustableIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredNonVotingRedeemableExchangeableExtendableAdjustableIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, non-voting, redeemable/exchangeable/extendable, adjustable income, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/PreferredShareWithAdjustableRateDividend
     :fibo-sec-eq-eq/ExtendablePreferredShare
     :fibo-sec-eq-eq/ExchangeablePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/NonVotingShare
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers zero votes per share, may be exchanged for securities of another issuer, whose issuer and/or shareholders have the option to extend the maturity date, that provides a periodic income whose dividend rate is set periodically, and is registered"})

(def
  PreferredNonVotingRedeemableExchangeableExtendableAuctionRateIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredNonVotingRedeemableExchangeableExtendableAuctionRateIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, non-voting, redeemable/exchangeable/extendable, auction rate income, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare
     :fibo-sec-eq-eq/PreferredShareWithAuctionRateDividend
     :fibo-sec-eq-eq/ExchangeablePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/NonVotingShare
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers zero votes per share, may be exchanged for securities of another issuer, whose issuer and/or shareholders have the option to extend the maturity date, that provides a periodic income whose dividend rate is adjusted through an auction, and is registered"})

(def
  PreferredNonVotingRedeemableExchangeableExtendableCumulativeParticipatingRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredNonVotingRedeemableExchangeableExtendableCumulativeParticipatingRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, non-voting, redeemable/exchangeable/extendable, cumulative participating, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare
     :fibo-sec-eq-eq/ExchangeablePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/CumulativePreferredShare
     :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
     :fibo-sec-eq-eq/ParticipatingPreferredShare :fibo-sec-eq-eq/NonVotingShare
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers zero votes per share, may be exchanged for securities of another issuer, whose issuer and/or shareholders have the option to extend the maturity date, that provides a periodic stated income, dividends not paid in any year accumulate, and participates with common shareholders in further dividend and capital distributions, and is registered"})

(def PreferredNonVotingRedeemableExchangeableExtendableCumulativeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredNonVotingRedeemableExchangeableExtendableCumulativeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, non-voting, redeemable/exchangeable/extendable, cumulative, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare
     :fibo-sec-eq-eq/ExchangeablePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/NonParticipatingPreferredShare
     :fibo-sec-eq-eq/CumulativePreferredShare
     :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
     :fibo-sec-eq-eq/NonVotingShare :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers zero votes per share, may be exchanged for securities of another issuer, whose issuer and/or shareholders have the option to extend the maturity date, that provides a periodic stated income and dividends not paid in any year accumulate, and is registered"})

(def
  PreferredNonVotingRedeemableExchangeableExtendableFixedIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredNonVotingRedeemableExchangeableExtendableFixedIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, non-voting, redeemable/exchangeable/extendable, fixed income, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare
     :fibo-sec-eq-eq/ExchangeablePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/NonParticipatingPreferredShare
     :fibo-sec-eq-eq/NonCumulativePreferredShare
     :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
     :fibo-sec-eq-eq/NonVotingShare :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers zero votes per share, may be exchanged for securities of another issuer, whose issuer and/or shareholders have the option to extend the maturity date, that provides a periodic stated income, and is registered"})

(def
  PreferredNonVotingRedeemableExchangeableExtendableNormalIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredNonVotingRedeemableExchangeableExtendableNormalIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, non-voting, redeemable/exchangeable/extendable, normal income, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare
     :fibo-sec-eq-eq/ExchangeablePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/NonCumulativePreferredShare
     :fibo-sec-eq-eq/NonVotingShare :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers zero votes per share, may be exchanged for securities of another issuer, whose issuer and/or shareholders have the option to extend the maturity date, that provides the same dividends as common/ordinary shareholders, and is registered"})

(def
  PreferredNonVotingRedeemableExchangeableExtendableParticipatingRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredNonVotingRedeemableExchangeableExtendableParticipatingRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, non-voting, redeemable/exchangeable/extendable, participating, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare
     :fibo-sec-eq-eq/ExchangeablePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/NonCumulativePreferredShare
     :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
     :fibo-sec-eq-eq/ParticipatingPreferredShare :fibo-sec-eq-eq/NonVotingShare
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers zero votes per share, may be exchanged for securities of another issuer, whose issuer and/or shareholders have the option to extend the maturity date, that provides a periodic stated income and participates with common shareholders in further dividend and capital distributions, and is registered"})

(def PreferredNonVotingRedeemableExchangeableFixedIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredNonVotingRedeemableExchangeableFixedIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, non-voting, redeemable exchangeable, fixed income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/ExchangeablePreferredShare
                      :fibo-sec-eq-eq/NonParticipatingPreferredShare
                      :fibo-sec-eq-eq/NonCumulativePreferredShare
                      {:owl/unionOf [:fibo-sec-eq-eq/RedeemablePreferredShare
                                     :fibo-sec-eq-eq/RetractablePreferredShare],
                       :rdf/type    :owl/Class}
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-eq-eq/NonVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers zero votes per share, may be exchanged for securities of another issuer, may be redeemed at the option of the issuer and/or of the shareholder, provides a periodic stated income, and is registered"})

(def PreferredNonVotingRedeemableExchangeableNormalIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredNonVotingRedeemableExchangeableNormalIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, non-voting, redeemable exchangeable, normal income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/ExchangeablePreferredShare
                      {:owl/unionOf [:fibo-sec-eq-eq/RedeemablePreferredShare
                                     :fibo-sec-eq-eq/RetractablePreferredShare],
                       :rdf/type    :owl/Class} :fibo-sec-eq-eq/NonVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers zero votes per share, may be exchanged for securities of another issuer, may be redeemed at the option of the issuer and/or of the shareholder, provides the same dividends as common/ordinary shareholders, and is registered"})

(def PreferredNonVotingRedeemableExchangeableParticipatingRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredNonVotingRedeemableExchangeableParticipatingRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, non-voting, redeemable exchangeable, participating, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/ExchangeablePreferredShare
                      :fibo-sec-eq-eq/NonCumulativePreferredShare
                      {:owl/unionOf [:fibo-sec-eq-eq/RedeemablePreferredShare
                                     :fibo-sec-eq-eq/RetractablePreferredShare],
                       :rdf/type    :owl/Class}
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-eq-eq/ParticipatingPreferredShare
                      :fibo-sec-eq-eq/NonVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers zero votes per share, may be exchanged for securities of another issuer, may be redeemed at the option of the issuer and/or of the shareholder, provides a periodic stated income and participates with common shareholders in further dividend and capital distributions, and is registered"})

(def PreferredNonVotingRedeemableExtendableAdjustableIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredNonVotingRedeemableExtendableAdjustableIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, non-voting, redeemable extendable, adjustable income, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/PreferredShareWithAdjustableRateDividend
     :fibo-sec-eq-eq/ExtendablePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/NonVotingShare
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers zero votes per share, whose issuer and/or shareholders have the option to extend the maturity date, that provides a periodic income whose dividend rate is set periodically, and is registered"})

(def PreferredNonVotingRedeemableExtendableAuctionRateIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredNonVotingRedeemableExtendableAuctionRateIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, non-voting, redeemable extendable, auction rate income, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare
     :fibo-sec-eq-eq/PreferredShareWithAuctionRateDividend
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/NonVotingShare
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers zero votes per share, whose issuer and/or shareholders have the option to extend the maturity date, that provides a periodic income whose dividend rate is adjusted through an auction, and is registered"})

(def
  PreferredNonVotingRedeemableExtendableCumulativeParticipatingRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredNonVotingRedeemableExtendableCumulativeParticipatingRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, non-voting, redeemable extendable, cumulative participating, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/CumulativePreferredShare
     :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
     :fibo-sec-eq-eq/ParticipatingPreferredShare :fibo-sec-eq-eq/NonVotingShare
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers zero votes per share, whose issuer and/or shareholders have the option to extend the maturity date, that provides a periodic stated income, dividends not paid in any year accumulate, and participates with common shareholders in further dividend and capital distributions, and is registered"})

(def PreferredNonVotingRedeemableExtendableCumulativeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredNonVotingRedeemableExtendableCumulativeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, non-voting, redeemable extendable, cumulative, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/NonParticipatingPreferredShare
     :fibo-sec-eq-eq/CumulativePreferredShare
     :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
     :fibo-sec-eq-eq/NonVotingShare :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers zero votes per share, whose issuer and/or shareholders have the option to extend the maturity date, that provides a periodic stated income and dividends not paid in any year accumulate, and is registered"})

(def PreferredNonVotingRedeemableExtendableFixedIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredNonVotingRedeemableExtendableFixedIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, non-voting, redeemable extendable, fixed income, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/NonParticipatingPreferredShare
     :fibo-sec-eq-eq/NonCumulativePreferredShare
     :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
     :fibo-sec-eq-eq/NonVotingShare :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers zero votes per share, whose issuer and/or shareholders have the option to extend the maturity date, that provides a periodic stated income, and is registered"})

(def PreferredNonVotingRedeemableExtendableNormalIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredNonVotingRedeemableExtendableNormalIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, non-voting, redeemable extendable, normal income, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/NonVotingShare
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers zero votes per share, whose issuer and/or shareholders have the option to extend the maturity date, that provides the same dividends as common/ordinary shareholders, and is registered"})

(def PreferredNonVotingRedeemableExtendableParticipatingRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredNonVotingRedeemableExtendableParticipatingRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, non-voting, redeemable extendable, participating, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/NonCumulativePreferredShare
     :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
     :fibo-sec-eq-eq/ParticipatingPreferredShare :fibo-sec-eq-eq/NonVotingShare
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers zero votes per share, whose issuer and/or shareholders have the option to extend the maturity date, that provides a periodic stated income and participates with common shareholders in further dividend and capital distributions, and is registered"})

(def PreferredNonVotingRedeemableFixedIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredNonVotingRedeemableFixedIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, non-voting, redeemable, fixed income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/NonParticipatingPreferredShare
                      :fibo-sec-eq-eq/NonCumulativePreferredShare
                      {:owl/unionOf [:fibo-sec-eq-eq/RedeemablePreferredShare
                                     :fibo-sec-eq-eq/RetractablePreferredShare],
                       :rdf/type    :owl/Class}
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-eq-eq/NonVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers zero votes per share, may be redeemed at the option of the issuer and/or of the shareholder, provides a periodic stated income, and is registered"})

(def PreferredNonVotingRedeemableNormalIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredNonVotingRedeemableNormalIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, non-voting, redeemable, normal income, registered share"},
   :rdfs/subClassOf #{{:owl/unionOf [:fibo-sec-eq-eq/RedeemablePreferredShare
                                     :fibo-sec-eq-eq/RetractablePreferredShare],
                       :rdf/type    :owl/Class} :fibo-sec-eq-eq/NonVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers zero votes per share, may be redeemed at the option of the issuer and/or of the shareholder, provides the same dividends as common/ordinary shareholders, and is registered"})

(def PreferredNonVotingRedeemableParticipatingRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredNonVotingRedeemableParticipatingRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, non-voting, redeemable, participating, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/NonCumulativePreferredShare
                      {:owl/unionOf [:fibo-sec-eq-eq/RedeemablePreferredShare
                                     :fibo-sec-eq-eq/RetractablePreferredShare],
                       :rdf/type    :owl/Class}
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-eq-eq/ParticipatingPreferredShare
                      :fibo-sec-eq-eq/NonVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers zero votes per share, may be redeemed at the option of the issuer and/or of the shareholder, provides a periodic stated income and participates with common shareholders in further dividend and capital distributions, and is registered"})

(def PreferredRestrictedVotingExchangeableAdjustableIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredRestrictedVotingExchangeableAdjustableIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, restricted voting, exchangeable, adjustable income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/PreferredShareWithAdjustableRateDividend
                      :fibo-sec-eq-eq/ExchangeablePreferredShare
                      :fibo-sec-eq-eq/RestrictedVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers less than one vote per share, may be exchanged for securities of another issuer, provides a periodic income whose dividend rate is set periodically, and is registered"})

(def PreferredRestrictedVotingExchangeableAuctionRateIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredRestrictedVotingExchangeableAuctionRateIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, restricted voting, exchangeable, auction rate income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/PreferredShareWithAuctionRateDividend
                      :fibo-sec-eq-eq/ExchangeablePreferredShare
                      :fibo-sec-eq-eq/RestrictedVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers less than one vote per share, may be exchanged for securities of another issuer, provides a periodic income whose dividend rate is adjusted through an auction, and is registered"})

(def PreferredRestrictedVotingExchangeableCumulativeParticipatingRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredRestrictedVotingExchangeableCumulativeParticipatingRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, restricted voting, exchangeable, cumulative participating, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/ExchangeablePreferredShare
                      :fibo-sec-eq-eq/CumulativePreferredShare
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-eq-eq/ParticipatingPreferredShare
                      :fibo-sec-eq-eq/RestrictedVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers less than one vote per share, may be exchanged for securities of another issuer, provides a periodic stated income, dividends not paid in any year accumulate, and participates with common shareholders in further dividend and capital distributions, and is registered"})

(def PreferredRestrictedVotingExchangeableCumulativeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredRestrictedVotingExchangeableCumulativeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, restricted voting, exchangeable, cumulative, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/ExchangeablePreferredShare
                      :fibo-sec-eq-eq/NonParticipatingPreferredShare
                      :fibo-sec-eq-eq/CumulativePreferredShare
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-eq-eq/RestrictedVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers less than one vote per share, may be exchanged for securities of another issuer, provides a periodic stated income and dividends not paid in any year accumulate, and is registered"})

(def PreferredRestrictedVotingExchangeableFixedIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredRestrictedVotingExchangeableFixedIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, restricted voting, exchangeable, fixed income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/ExchangeablePreferredShare
                      :fibo-sec-eq-eq/NonParticipatingPreferredShare
                      :fibo-sec-eq-eq/NonCumulativePreferredShare
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-eq-eq/RestrictedVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers less than one vote per share, may be exchanged for securities of another issuer, provides a periodic stated income, and is registered"})

(def PreferredRestrictedVotingExchangeableNormalIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredRestrictedVotingExchangeableNormalIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, restricted voting, exchangeable, normal income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/ExchangeablePreferredShare
                      :fibo-sec-eq-eq/NonCumulativePreferredShare
                      :fibo-sec-eq-eq/RestrictedVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers less than one vote per share, may be exchanged for securities of another issuer, provides the same dividends as common/ordinary shareholders, and is registered"})

(def PreferredRestrictedVotingExchangeableParticipatingRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredRestrictedVotingExchangeableParticipatingRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, restricted voting, exchangeable, participating, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/ExchangeablePreferredShare
                      :fibo-sec-eq-eq/NonCumulativePreferredShare
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-eq-eq/ParticipatingPreferredShare
                      :fibo-sec-eq-eq/RestrictedVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers less than one vote per share, may be exchanged for securities of another issuer, provides a periodic stated income and participates with common shareholders in further dividend and capital distributions, and is registered"})

(def PreferredRestrictedVotingExtendableAdjustableIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredRestrictedVotingExtendableAdjustableIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, restricted voting, extendable, adjustable income, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/PreferredShareWithAdjustableRateDividend
     :fibo-sec-eq-eq/ExtendablePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableRedemptionDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableRedemptionDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/RestrictedVotingShare
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers less than one vote per share, may be redeemed at the option of the issuer and/or of the shareholder with an extendable redemption date, provides a periodic income whose dividend rate is set periodically, and is registered"})

(def PreferredRestrictedVotingExtendableAuctionRateIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredRestrictedVotingExtendableAuctionRateIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, restricted voting, extendable, auction rate income, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare
     :fibo-sec-eq-eq/PreferredShareWithAuctionRateDividend
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableRedemptionDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableRedemptionDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/RestrictedVotingShare
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers less than one vote per share, may be redeemed at the option of the issuer and/or of the shareholder with an extendable redemption date, provides a periodic income whose dividend rate is adjusted through an auction, and is registered"})

(def PreferredRestrictedVotingExtendableCumulativeParticipatingRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredRestrictedVotingExtendableCumulativeParticipatingRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, restricted voting, extendable, cumulative participating, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare
     :fibo-sec-eq-eq/CumulativePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableRedemptionDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableRedemptionDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
     :fibo-sec-eq-eq/ParticipatingPreferredShare
     :fibo-sec-eq-eq/RestrictedVotingShare
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers less than one vote per share, may be redeemed at the option of the issuer and/or of the shareholder with an extendable redemption date, provides a periodic stated income, dividends not paid in any year accumulate, and participates with common shareholders in further dividend and capital distributions, and is registered"})

(def PreferredRestrictedVotingExtendableCumulativeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredRestrictedVotingExtendableCumulativeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, restricted voting, extendable, cumulative, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare
     :fibo-sec-eq-eq/NonParticipatingPreferredShare
     :fibo-sec-eq-eq/CumulativePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableRedemptionDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableRedemptionDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
     :fibo-sec-eq-eq/RestrictedVotingShare
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers less than one vote per share, may be redeemed at the option of the issuer and/or of the shareholder with an extendable redemption date, provides a periodic stated income and dividends not paid in any year accumulate, and is registered"})

(def PreferredRestrictedVotingExtendableFixedIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredRestrictedVotingExtendableFixedIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, restricted voting, extendable, fixed income, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare
     :fibo-sec-eq-eq/NonParticipatingPreferredShare
     :fibo-sec-eq-eq/NonCumulativePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableRedemptionDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableRedemptionDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
     :fibo-sec-eq-eq/RestrictedVotingShare
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers less than one vote per share, may be redeemed at the option of the issuer and/or of the shareholder with an extendable redemption date, provides a periodic stated income, and is registered"})

(def PreferredRestrictedVotingExtendableNormalIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredRestrictedVotingExtendableNormalIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, restricted voting, extendable, normal income, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare
     :fibo-sec-eq-eq/NonCumulativePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableRedemptionDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableRedemptionDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/RestrictedVotingShare
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers less than one vote per share, may be redeemed at the option of the issuer and/or of the shareholder with an extendable redemption date, provides the same dividends as common/ordinary shareholders, and is registered"})

(def PreferredRestrictedVotingExtendableParticipatingRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredRestrictedVotingExtendableParticipatingRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, restricted voting, extendable, participating, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare
     :fibo-sec-eq-eq/NonCumulativePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableRedemptionDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableRedemptionDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
     :fibo-sec-eq-eq/ParticipatingPreferredShare
     :fibo-sec-eq-eq/RestrictedVotingShare
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers less than one vote per share, may be redeemed at the option of the issuer and/or of the shareholder with an extendable redemption date, provides a periodic stated income and participates with common shareholders in further dividend and capital distributions, and is registered"})

(def PreferredRestrictedVotingPerpetualAdjustableIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredRestrictedVotingPerpetualAdjustableIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, restricted voting, perpetual, adjustable income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/PreferredShareWithAdjustableRateDividend
                      :fibo-sec-eq-eq/RestrictedVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity
                      :fibo-sec-eq-eq/PerpetualPreferredShare},
   :skos/definition
   "preferred share that confers less than one vote per share, has no fixed maturity date, provides a periodic income whose dividend rate is set periodically, and is registered"})

(def PreferredRestrictedVotingPerpetualAuctionRateIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredRestrictedVotingPerpetualAuctionRateIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, restricted voting, perpetual, auction rate income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/PreferredShareWithAuctionRateDividend
                      :fibo-sec-eq-eq/RestrictedVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity
                      :fibo-sec-eq-eq/PerpetualPreferredShare},
   :skos/definition
   "preferred share that confers less than one vote per share, has no fixed maturity date, provides a periodic income whose dividend rate is adjusted through an auction, and is registered"})

(def PreferredRestrictedVotingPerpetualCumulativeParticipatingRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredRestrictedVotingPerpetualCumulativeParticipatingRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, restricted voting, perpetual, cumulative participating, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/CumulativePreferredShare
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-eq-eq/ParticipatingPreferredShare
                      :fibo-sec-eq-eq/RestrictedVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity
                      :fibo-sec-eq-eq/PerpetualPreferredShare},
   :skos/definition
   "preferred share that confers less than one vote per share, has no fixed maturity date, provides a periodic stated income, dividends not paid in any year accumulate, and participates with common shareholders in further dividend and capital distributions, and is registered"})

(def PreferredRestrictedVotingPerpetualCumulativeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredRestrictedVotingPerpetualCumulativeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, restricted voting, perpetual, cumulative, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/NonParticipatingPreferredShare
                      :fibo-sec-eq-eq/CumulativePreferredShare
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-eq-eq/RestrictedVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity
                      :fibo-sec-eq-eq/PerpetualPreferredShare},
   :skos/definition
   "preferred share that confers less than one vote per share, has no fixed maturity date, provides a periodic stated income and dividends not paid in any year accumulate, and is registered"})

(def PreferredRestrictedVotingPerpetualFixedIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredRestrictedVotingPerpetualFixedIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, restricted voting, perpetual, fixed income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/NonParticipatingPreferredShare
                      :fibo-sec-eq-eq/NonCumulativePreferredShare
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-eq-eq/RestrictedVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity
                      :fibo-sec-eq-eq/PerpetualPreferredShare},
   :skos/definition
   "preferred share that confers less than one vote per share, has no fixed maturity date, provides a periodic stated income, and is registered"})

(def PreferredRestrictedVotingPerpetualNormalIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredRestrictedVotingPerpetualNormalIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, restricted voting, perpetual, normal income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/NonCumulativePreferredShare
                      :fibo-sec-eq-eq/RestrictedVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity
                      :fibo-sec-eq-eq/PerpetualPreferredShare},
   :skos/definition
   "preferred share that confers less than one vote per share, has no fixed maturity date, provides the same dividends as common/ordinary shareholders, and is registered"})

(def PreferredRestrictedVotingPerpetualParticipatingRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredRestrictedVotingPerpetualParticipatingRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, restricted voting, perpetual, participating, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/NonCumulativePreferredShare
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-eq-eq/ParticipatingPreferredShare
                      :fibo-sec-eq-eq/RestrictedVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity
                      :fibo-sec-eq-eq/PerpetualPreferredShare},
   :skos/definition
   "preferred share that confers less than one vote per share, has no fixed maturity date, provides a periodic stated income and participates with common shareholders in further dividend and capital distributions, and is registered"})

(def PreferredRestrictedVotingRedeemableAdjustableIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredRestrictedVotingRedeemableAdjustableIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, restricted voting, redeemable, adjustable income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/PreferredShareWithAdjustableRateDividend
                      {:owl/unionOf [:fibo-sec-eq-eq/RedeemablePreferredShare
                                     :fibo-sec-eq-eq/RetractablePreferredShare],
                       :rdf/type    :owl/Class}
                      :fibo-sec-eq-eq/RestrictedVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers less than one vote per share, may be redeemed at the option of the issuer and/or of the shareholder, provides a periodic income whose dividend rate is set periodically, and is registered"})

(def PreferredRestrictedVotingRedeemableAuctionRateIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredRestrictedVotingRedeemableAuctionRateIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, restricted voting, redeemable, auction rate income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/PreferredShareWithAuctionRateDividend
                      {:owl/unionOf [:fibo-sec-eq-eq/RedeemablePreferredShare
                                     :fibo-sec-eq-eq/RetractablePreferredShare],
                       :rdf/type    :owl/Class}
                      :fibo-sec-eq-eq/RestrictedVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers less than one vote per share, may be redeemed at the option of the issuer and/or of the shareholder, provides a periodic income whose dividend rate is adjusted through an auction, and is registered"})

(def PreferredRestrictedVotingRedeemableCumulativeParticipatingRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredRestrictedVotingRedeemableCumulativeParticipatingRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, restricted voting, redeemable, cumulative participating, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/CumulativePreferredShare
                      {:owl/unionOf [:fibo-sec-eq-eq/RedeemablePreferredShare
                                     :fibo-sec-eq-eq/RetractablePreferredShare],
                       :rdf/type    :owl/Class}
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-eq-eq/ParticipatingPreferredShare
                      :fibo-sec-eq-eq/RestrictedVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers less than one vote per share, may be redeemed at the option of the issuer and/or of the shareholder, provides a periodic stated income, dividends not paid in any year accumulate, and participates with common shareholders in further dividend and capital distributions, and is registered"})

(def PreferredRestrictedVotingRedeemableCumulativeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredRestrictedVotingRedeemableCumulativeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, restricted voting, redeemable, cumulative, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/NonParticipatingPreferredShare
                      :fibo-sec-eq-eq/CumulativePreferredShare
                      {:owl/unionOf [:fibo-sec-eq-eq/RedeemablePreferredShare
                                     :fibo-sec-eq-eq/RetractablePreferredShare],
                       :rdf/type    :owl/Class}
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-eq-eq/RestrictedVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers less than one vote per share, may be redeemed at the option of the issuer and/or of the shareholder, provides a periodic stated income and dividends not paid in any year accumulate, and is registered"})

(def
  PreferredRestrictedVotingRedeemableExchangeableAdjustableIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredRestrictedVotingRedeemableExchangeableAdjustableIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, restricted voting, redeemable exchangeable, adjustable income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/PreferredShareWithAdjustableRateDividend
                      :fibo-sec-eq-eq/ExchangeablePreferredShare
                      {:owl/unionOf [:fibo-sec-eq-eq/RedeemablePreferredShare
                                     :fibo-sec-eq-eq/RetractablePreferredShare],
                       :rdf/type    :owl/Class}
                      :fibo-sec-eq-eq/RestrictedVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers less than one vote per share, may be redeemed at the option of the issuer and/or of the shareholder, provides a periodic income whose dividend rate is set periodically, and is registered"})

(def
  PreferredRestrictedVotingRedeemableExchangeableAuctionRateIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredRestrictedVotingRedeemableExchangeableAuctionRateIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, restricted voting, redeemable exchangeable, auction rate income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/PreferredShareWithAuctionRateDividend
                      :fibo-sec-eq-eq/ExchangeablePreferredShare
                      {:owl/unionOf [:fibo-sec-eq-eq/RedeemablePreferredShare
                                     :fibo-sec-eq-eq/RetractablePreferredShare],
                       :rdf/type    :owl/Class}
                      :fibo-sec-eq-eq/RestrictedVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers less than one vote per share, may be redeemed at the option of the issuer and/or of the shareholder, provides a periodic income whose dividend rate is adjusted through an auction, and is registered"})

(def
  PreferredRestrictedVotingRedeemableExchangeableCumulativeParticipatingRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredRestrictedVotingRedeemableExchangeableCumulativeParticipatingRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, restricted voting, redeemable exchangeable, cumulative participating, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/ExchangeablePreferredShare
                      :fibo-sec-eq-eq/CumulativePreferredShare
                      {:owl/unionOf [:fibo-sec-eq-eq/RedeemablePreferredShare
                                     :fibo-sec-eq-eq/RetractablePreferredShare],
                       :rdf/type    :owl/Class}
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-eq-eq/ParticipatingPreferredShare
                      :fibo-sec-eq-eq/RestrictedVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers less than one vote per share, may be exchanged for securities of another issuer, may be redeemed at the option of the issuer and/or of the shareholder, provides a periodic stated income, dividends not paid in any year accumulate, and participates with common shareholders in further dividend and capital distributions, and is registered"})

(def PreferredRestrictedVotingRedeemableExchangeableCumulativeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredRestrictedVotingRedeemableExchangeableCumulativeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, restricted voting, redeemable exchangeable, cumulative, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/ExchangeablePreferredShare
                      :fibo-sec-eq-eq/NonParticipatingPreferredShare
                      :fibo-sec-eq-eq/CumulativePreferredShare
                      {:owl/unionOf [:fibo-sec-eq-eq/RedeemablePreferredShare
                                     :fibo-sec-eq-eq/RetractablePreferredShare],
                       :rdf/type    :owl/Class}
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-eq-eq/RestrictedVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers less than one vote per share, may be exchanged for securities of another issuer, may be redeemed at the option of the issuer and/or of the shareholder, provides a periodic stated income and dividends not paid in any year accumulate, and is registered"})

(def
  PreferredRestrictedVotingRedeemableExchangeableExtendableAdjustableIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredRestrictedVotingRedeemableExchangeableExtendableAdjustableIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, restricted voting, redeemable/exchangeable/extendable, adjustable income, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/PreferredShareWithAdjustableRateDividend
     :fibo-sec-eq-eq/ExtendablePreferredShare
     :fibo-sec-eq-eq/ExchangeablePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/RestrictedVotingShare
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers less than one vote per share, may be exchanged for securities of another issuer, whose issuer and/or shareholders have the option to extend the maturity date, that provides a periodic income whose dividend rate is set periodically, and is registered"})

(def
  PreferredRestrictedVotingRedeemableExchangeableExtendableAuctionRateIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredRestrictedVotingRedeemableExchangeableExtendableAuctionRateIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, restricted voting, redeemable/exchangeable/extendable, auction rate income, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare
     :fibo-sec-eq-eq/PreferredShareWithAuctionRateDividend
     :fibo-sec-eq-eq/ExchangeablePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/RestrictedVotingShare
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers less than one vote per share, may be exchanged for securities of another issuer, whose issuer and/or shareholders have the option to extend the maturity date, that provides a periodic income whose dividend rate is adjusted through an auction, and is registered"})

(def
  PreferredRestrictedVotingRedeemableExchangeableExtendableCumulativeParticipatingRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredRestrictedVotingRedeemableExchangeableExtendableCumulativeParticipatingRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, restricted voting, redeemable/exchangeable/extendable, cumulative participating, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare
     :fibo-sec-eq-eq/ExchangeablePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/CumulativePreferredShare
     :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
     :fibo-sec-eq-eq/ParticipatingPreferredShare
     :fibo-sec-eq-eq/RestrictedVotingShare
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers less than one vote per share, may be exchanged for securities of another issuer, whose issuer and/or shareholders have the option to extend the maturity date, that provides a periodic stated income, dividends not paid in any year accumulate, and participates with common shareholders in further dividend and capital distributions, and is registered"})

(def
  PreferredRestrictedVotingRedeemableExchangeableExtendableCumulativeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredRestrictedVotingRedeemableExchangeableExtendableCumulativeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, restricted voting, redeemable/exchangeable/extendable, cumulative, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare
     :fibo-sec-eq-eq/ExchangeablePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/NonParticipatingPreferredShare
     :fibo-sec-eq-eq/CumulativePreferredShare
     :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
     :fibo-sec-eq-eq/RestrictedVotingShare
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers less than one vote per share, may be exchanged for securities of another issuer, whose issuer and/or shareholders have the option to extend the maturity date, that provides a periodic stated income and dividends not paid in any year accumulate, and is registered"})

(def
  PreferredRestrictedVotingRedeemableExchangeableExtendableFixedIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredRestrictedVotingRedeemableExchangeableExtendableFixedIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, restricted voting, redeemable/exchangeable/extendable, fixed income, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare
     :fibo-sec-eq-eq/ExchangeablePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/NonParticipatingPreferredShare
     :fibo-sec-eq-eq/NonCumulativePreferredShare
     :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
     :fibo-sec-eq-eq/RestrictedVotingShare
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers less than one vote per share, may be exchanged for securities of another issuer, whose issuer and/or shareholders have the option to extend the maturity date, that provides a periodic stated income, and is registered"})

(def
  PreferredRestrictedVotingRedeemableExchangeableExtendableNormalIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredRestrictedVotingRedeemableExchangeableExtendableNormalIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, restricted voting, redeemable/exchangeable/extendable, normal income, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare
     :fibo-sec-eq-eq/ExchangeablePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/NonCumulativePreferredShare
     :fibo-sec-eq-eq/RestrictedVotingShare
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers less than one vote per share, may be exchanged for securities of another issuer, whose issuer and/or shareholders have the option to extend the maturity date, that provides the same dividends as common/ordinary shareholders, and is registered"})

(def
  PreferredRestrictedVotingRedeemableExchangeableExtendableParticipatingRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredRestrictedVotingRedeemableExchangeableExtendableParticipatingRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, restricted voting, redeemable/exchangeable/extendable, participating, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare
     :fibo-sec-eq-eq/ExchangeablePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/NonCumulativePreferredShare
     :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
     :fibo-sec-eq-eq/ParticipatingPreferredShare
     :fibo-sec-eq-eq/RestrictedVotingShare
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers less than one vote per share, may be exchanged for securities of another issuer, whose issuer and/or shareholders have the option to extend the maturity date, that provides a periodic stated income and participates with common shareholders in further dividend and capital distributions, and is registered"})

(def PreferredRestrictedVotingRedeemableExchangeableFixedIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredRestrictedVotingRedeemableExchangeableFixedIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, restricted voting, redeemable exchangeable, fixed income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/ExchangeablePreferredShare
                      :fibo-sec-eq-eq/NonParticipatingPreferredShare
                      :fibo-sec-eq-eq/NonCumulativePreferredShare
                      {:owl/unionOf [:fibo-sec-eq-eq/RedeemablePreferredShare
                                     :fibo-sec-eq-eq/RetractablePreferredShare],
                       :rdf/type    :owl/Class}
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-eq-eq/RestrictedVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers less than one vote per share, may be exchanged for securities of another issuer, may be redeemed at the option of the issuer and/or of the shareholder, provides a periodic stated income, and is registered"})

(def PreferredRestrictedVotingRedeemableExchangeableNormalIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredRestrictedVotingRedeemableExchangeableNormalIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, restricted voting, redeemable exchangeable, normal income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/ExchangeablePreferredShare
                      {:owl/unionOf [:fibo-sec-eq-eq/RedeemablePreferredShare
                                     :fibo-sec-eq-eq/RetractablePreferredShare],
                       :rdf/type    :owl/Class}
                      :fibo-sec-eq-eq/RestrictedVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers less than one vote per share, may be exchanged for securities of another issuer, may be redeemed at the option of the issuer and/or of the shareholder, provides the same dividends as common/ordinary shareholders, and is registered"})

(def PreferredRestrictedVotingRedeemableExchangeableParticipatingRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredRestrictedVotingRedeemableExchangeableParticipatingRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, restricted voting, redeemable exchangeable, participating, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/ExchangeablePreferredShare
                      :fibo-sec-eq-eq/NonCumulativePreferredShare
                      {:owl/unionOf [:fibo-sec-eq-eq/RedeemablePreferredShare
                                     :fibo-sec-eq-eq/RetractablePreferredShare],
                       :rdf/type    :owl/Class}
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-eq-eq/ParticipatingPreferredShare
                      :fibo-sec-eq-eq/RestrictedVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers less than one per share, may be exchanged for securities of another issuer, may be redeemed at the option of the issuer and/or of the shareholder, provides a periodic stated income and participates with common shareholders in further dividend and capital distributions, and is registered"})

(def
  PreferredRestrictedVotingRedeemableExtendableAdjustableIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredRestrictedVotingRedeemableExtendableAdjustableIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, restricted voting, redeemable extendable, adjustable income, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/PreferredShareWithAdjustableRateDividend
     :fibo-sec-eq-eq/ExtendablePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/RestrictedVotingShare
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers less than one vote per share, whose issuer and/or shareholders have the option to extend the maturity date, that provides a periodic income whose dividend rate is set periodically, and is registered"})

(def
  PreferredRestrictedVotingRedeemableExtendableAuctionRateIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredRestrictedVotingRedeemableExtendableAuctionRateIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, restricted voting, redeemable extendable, auction rate income, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare
     :fibo-sec-eq-eq/PreferredShareWithAuctionRateDividend
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/RestrictedVotingShare
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers less than one vote per share, whose issuer and/or shareholders have the option to extend the maturity date, that provides a periodic income whose dividend rate is adjusted through an auction, and is registered"})

(def
  PreferredRestrictedVotingRedeemableExtendableCumulativeParticipatingRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredRestrictedVotingRedeemableExtendableCumulativeParticipatingRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, restricted voting, redeemable extendable, cumulative participating, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/CumulativePreferredShare
     :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
     :fibo-sec-eq-eq/ParticipatingPreferredShare
     :fibo-sec-eq-eq/RestrictedVotingShare
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers less than one vote per share, whose issuer and/or shareholders have the option to extend the maturity date, that provides a periodic stated income, dividends not paid in any year accumulate, and participates with common shareholders in further dividend and capital distributions, and is registered"})

(def PreferredRestrictedVotingRedeemableExtendableCumulativeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredRestrictedVotingRedeemableExtendableCumulativeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, restricted voting, redeemable extendable, cumulative, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/NonParticipatingPreferredShare
     :fibo-sec-eq-eq/CumulativePreferredShare
     :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
     :fibo-sec-eq-eq/RestrictedVotingShare
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers less than one vote per share, whose issuer and/or shareholders have the option to extend the maturity date, that provides a periodic stated income and dividends not paid in any year accumulate, and is registered"})

(def PreferredRestrictedVotingRedeemableExtendableFixedIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredRestrictedVotingRedeemableExtendableFixedIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, restricted voting, redeemable extendable, fixed income, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/NonParticipatingPreferredShare
     :fibo-sec-eq-eq/NonCumulativePreferredShare
     :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
     :fibo-sec-eq-eq/RestrictedVotingShare
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers less than one vote per share, whose issuer and/or shareholders have the option to extend the maturity date, that provides a periodic stated income, and is registered"})

(def PreferredRestrictedVotingRedeemableExtendableNormalIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredRestrictedVotingRedeemableExtendableNormalIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, restricted voting, redeemable extendable, normal income, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/RestrictedVotingShare
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers less than one vote per share, whose issuer and/or shareholders have the option to extend the maturity date, that provides the same dividends as common/ordinary shareholders, and is registered"})

(def PreferredRestrictedVotingRedeemableExtendableParticipatingRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredRestrictedVotingRedeemableExtendableParticipatingRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, restricted voting, redeemable extendable, participating, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/NonCumulativePreferredShare
     :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
     :fibo-sec-eq-eq/ParticipatingPreferredShare
     :fibo-sec-eq-eq/RestrictedVotingShare
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers less than one vote per share, whose issuer and/or shareholders have the option to extend the maturity date, that provides a periodic stated income and participates with common shareholders in further dividend and capital distributions, and is registered"})

(def PreferredRestrictedVotingRedeemableFixedIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredRestrictedVotingRedeemableFixedIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, restricted voting, redeemable, fixed income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/NonParticipatingPreferredShare
                      :fibo-sec-eq-eq/NonCumulativePreferredShare
                      {:owl/unionOf [:fibo-sec-eq-eq/RedeemablePreferredShare
                                     :fibo-sec-eq-eq/RetractablePreferredShare],
                       :rdf/type    :owl/Class}
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-eq-eq/RestrictedVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers less than one vote per share, may be redeemed at the option of the issuer and/or of the shareholder, provides a periodic stated income, and is registered"})

(def PreferredRestrictedVotingRedeemableNormalIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredRestrictedVotingRedeemableNormalIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, restricted voting, redeemable, normal income, registered share"},
   :rdfs/subClassOf #{{:owl/unionOf [:fibo-sec-eq-eq/RedeemablePreferredShare
                                     :fibo-sec-eq-eq/RetractablePreferredShare],
                       :rdf/type    :owl/Class}
                      :fibo-sec-eq-eq/RestrictedVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers less than one vote per share, may be redeemed at the option of the issuer and/or of the shareholder, provides the same dividends as common/ordinary shareholders, and is registered"})

(def PreferredRestrictedVotingRedeemableParticipatingRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredRestrictedVotingRedeemableParticipatingRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, restricted voting, redeemable, participating, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/NonCumulativePreferredShare
                      {:owl/unionOf [:fibo-sec-eq-eq/RedeemablePreferredShare
                                     :fibo-sec-eq-eq/RetractablePreferredShare],
                       :rdf/type    :owl/Class}
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-eq-eq/ParticipatingPreferredShare
                      :fibo-sec-eq-eq/RestrictedVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers less than one vote per share, may be redeemed at the option of the issuer and/or of the shareholder, provides a periodic stated income and participates with common shareholders in further dividend and capital distributions, and is registered"})

(def PreferredVotingExchangeableAdjustableIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredVotingExchangeableAdjustableIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, voting, exchangeable, adjustable income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/PreferredShareWithAdjustableRateDividend
                      :fibo-sec-eq-eq/SingleVotingShare
                      :fibo-sec-eq-eq/ExchangeablePreferredShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers exactly one vote per share, may be exchanged for securities of another issuer, provides a periodic income whose dividend rate is set periodically, and is registered"})

(def PreferredVotingExchangeableAuctionRateIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredVotingExchangeableAuctionRateIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, voting, exchangeable, auction rate income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/PreferredShareWithAuctionRateDividend
                      :fibo-sec-eq-eq/SingleVotingShare
                      :fibo-sec-eq-eq/ExchangeablePreferredShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers exactly one vote per share, may be exchanged for securities of another issuer, provides a periodic income whose dividend rate is adjusted through an auction, and is registered"})

(def PreferredVotingExchangeableCumulativeParticipatingRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredVotingExchangeableCumulativeParticipatingRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, voting, exchangeable, cumulative participating, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/SingleVotingShare
                      :fibo-sec-eq-eq/ExchangeablePreferredShare
                      :fibo-sec-eq-eq/CumulativePreferredShare
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-eq-eq/ParticipatingPreferredShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers exactly one vote per share, may be exchanged for securities of another issuer, provides a periodic stated income, dividends not paid in any year accumulate, and participates with common shareholders in further dividend and capital distributions, and is registered"})

(def PreferredVotingExchangeableCumulativeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredVotingExchangeableCumulativeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value "preferred, voting, exchangeable, cumulative, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/SingleVotingShare
                      :fibo-sec-eq-eq/ExchangeablePreferredShare
                      :fibo-sec-eq-eq/NonParticipatingPreferredShare
                      :fibo-sec-eq-eq/CumulativePreferredShare
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers exactly one vote per share, may be exchanged for securities of another issuer, provides a periodic stated income and dividends not paid in any year accumulate, and is registered"})

(def PreferredVotingExchangeableFixedIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredVotingExchangeableFixedIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, voting, exchangeable, fixed income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/SingleVotingShare
                      :fibo-sec-eq-eq/ExchangeablePreferredShare
                      :fibo-sec-eq-eq/NonParticipatingPreferredShare
                      :fibo-sec-eq-eq/NonCumulativePreferredShare
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers exactly one vote per share, may be exchanged for securities of another issuer, provides a periodic stated income, and is registered"})

(def PreferredVotingExchangeableNormalIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredVotingExchangeableNormalIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, voting, exchangeable, normal income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/SingleVotingShare
                      :fibo-sec-eq-eq/ExchangeablePreferredShare
                      :fibo-sec-eq-eq/NonCumulativePreferredShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers exactly one vote per share, may be exchanged for securities of another issuer, provides the same dividends as common/ordinary shareholders, and is registered"})

(def PreferredVotingExchangeableParticipatingRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredVotingExchangeableParticipatingRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, voting, exchangeable, participating, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/SingleVotingShare
                      :fibo-sec-eq-eq/ExchangeablePreferredShare
                      :fibo-sec-eq-eq/NonCumulativePreferredShare
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-eq-eq/ParticipatingPreferredShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers exactly one vote per share, may be exchanged for securities of another issuer, provides a periodic stated income and participates with common shareholders in further dividend and capital distributions, and is registered"})

(def PreferredVotingExtendableAdjustableIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredVotingExtendableAdjustableIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, voting, extendable, adjustable income, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/PreferredShareWithAdjustableRateDividend
     :fibo-sec-eq-eq/ExtendablePreferredShare :fibo-sec-eq-eq/SingleVotingShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableRedemptionDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableRedemptionDate],
      :rdf/type :owl/Class} :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers exactly one vote per share, may be redeemed at the option of the issuer and/or of the shareholder with an extendable redemption date, provides a periodic income whose dividend rate is set periodically, and is registered"})

(def PreferredVotingExtendableAuctionRateIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredVotingExtendableAuctionRateIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, voting, extendable, auction rate income, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare
     :fibo-sec-eq-eq/PreferredShareWithAuctionRateDividend
     :fibo-sec-eq-eq/SingleVotingShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableRedemptionDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableRedemptionDate],
      :rdf/type :owl/Class} :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers exactly one vote per share, may be redeemed at the option of the issuer and/or of the shareholder with an extendable redemption date, provides a periodic income whose dividend rate is adjusted through an auction, and is registered"})

(def PreferredVotingExtendableCumulativeParticipatingRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredVotingExtendableCumulativeParticipatingRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, voting, extendable, cumulative participating, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare :fibo-sec-eq-eq/SingleVotingShare
     :fibo-sec-eq-eq/CumulativePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableRedemptionDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableRedemptionDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
     :fibo-sec-eq-eq/ParticipatingPreferredShare
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers exactly one vote per share, may be redeemed at the option of the issuer and/or of the shareholder with an extendable redemption date, provides a periodic stated income, dividends not paid in any year accumulate, and participates with common shareholders in further dividend and capital distributions, and is registered"})

(def PreferredVotingExtendableCumulativeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredVotingExtendableCumulativeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value
                "preferred, voting, extendable, cumulative, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare :fibo-sec-eq-eq/SingleVotingShare
     :fibo-sec-eq-eq/NonParticipatingPreferredShare
     :fibo-sec-eq-eq/CumulativePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableRedemptionDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableRedemptionDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers exactly one vote per share, may be redeemed at the option of the issuer and/or of the shareholder with an extendable redemption date, provides a periodic stated income and dividends not paid in any year accumulate, and is registered"})

(def PreferredVotingExtendableFixedIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredVotingExtendableFixedIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value "preferred, voting, extendable, fixed income, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare :fibo-sec-eq-eq/SingleVotingShare
     :fibo-sec-eq-eq/NonParticipatingPreferredShare
     :fibo-sec-eq-eq/NonCumulativePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableRedemptionDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableRedemptionDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers exactly one vote per share, may be redeemed at the option of the issuer and/or of the shareholder with an extendable redemption date, provides a periodic stated income, and is registered"})

(def PreferredVotingExtendableNormalIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredVotingExtendableNormalIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, voting, extendable, normal income, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare :fibo-sec-eq-eq/SingleVotingShare
     :fibo-sec-eq-eq/NonCumulativePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableRedemptionDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableRedemptionDate],
      :rdf/type :owl/Class} :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers exactly one vote per share, may be redeemed at the option of the issuer and/or of the shareholder with an extendable redemption date, provides the same dividends as common/ordinary shareholders, and is registered"})

(def PreferredVotingExtendableParticipatingRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredVotingExtendableParticipatingRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, voting, extendable, participating, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare :fibo-sec-eq-eq/SingleVotingShare
     :fibo-sec-eq-eq/NonCumulativePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableRedemptionDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableRedemptionDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
     :fibo-sec-eq-eq/ParticipatingPreferredShare
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers exactly one vote per share, may be redeemed at the option of the issuer and/or of the shareholder with an extendable redemption date, provides a periodic stated income and participates with common shareholders in further dividend and capital distributions, and is registered"})

(def PreferredVotingPerpetualAdjustableIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredVotingPerpetualAdjustableIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, voting, perpetual, adjustable income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/PreferredShareWithAdjustableRateDividend
                      :fibo-sec-eq-eq/SingleVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity
                      :fibo-sec-eq-eq/PerpetualPreferredShare},
   :skos/definition
   "preferred share that confers exactly one vote per share, has no fixed maturity date, provides a periodic income whose dividend rate is set periodically, and is registered"})

(def PreferredVotingPerpetualAuctionRateIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredVotingPerpetualAuctionRateIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, voting, perpetual, auction rate income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/PreferredShareWithAuctionRateDividend
                      :fibo-sec-eq-eq/SingleVotingShare
                      :fibo-sec-sec-lst/RegisteredSecurity
                      :fibo-sec-eq-eq/PerpetualPreferredShare},
   :skos/definition
   "preferred share that confers exactly one vote per share, has no fixed maturity date, provides a periodic income whose dividend rate is adjusted through an auction, and is registered"})

(def PreferredVotingPerpetualCumulativeParticipatingRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredVotingPerpetualCumulativeParticipatingRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, voting, perpetual, cumulative participating, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/SingleVotingShare
                      :fibo-sec-eq-eq/CumulativePreferredShare
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-eq-eq/ParticipatingPreferredShare
                      :fibo-sec-sec-lst/RegisteredSecurity
                      :fibo-sec-eq-eq/PerpetualPreferredShare},
   :skos/definition
   "preferred share that confers exactly one vote per share, has no fixed maturity date, provides a periodic stated income, dividends not paid in any year accumulate, and participates with common shareholders in further dividend and capital distributions, and is registered"})

(def PreferredVotingPerpetualCumulativeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredVotingPerpetualCumulativeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value
                "preferred, voting, perpetual, cumulative, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/SingleVotingShare
                      :fibo-sec-eq-eq/NonParticipatingPreferredShare
                      :fibo-sec-eq-eq/CumulativePreferredShare
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-sec-lst/RegisteredSecurity
                      :fibo-sec-eq-eq/PerpetualPreferredShare},
   :skos/definition
   "preferred share that confers exactly one vote per share, has no fixed maturity date, provides a periodic stated income and dividends not paid in any year accumulate, and is registered"})

(def PreferredVotingPerpetualFixedIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredVotingPerpetualFixedIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value
                "preferred, voting, perpetual, fixed income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/SingleVotingShare
                      :fibo-sec-eq-eq/NonParticipatingPreferredShare
                      :fibo-sec-eq-eq/NonCumulativePreferredShare
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-sec-lst/RegisteredSecurity
                      :fibo-sec-eq-eq/PerpetualPreferredShare},
   :skos/definition
   "preferred share that confers exactly one vote per share, has no fixed maturity date, provides a periodic stated income, and is registered"})

(def PreferredVotingPerpetualNormalIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredVotingPerpetualNormalIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value "preferred, voting, perpetual, normal income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/SingleVotingShare
                      :fibo-sec-eq-eq/NonCumulativePreferredShare
                      :fibo-sec-sec-lst/RegisteredSecurity
                      :fibo-sec-eq-eq/PerpetualPreferredShare},
   :skos/definition
   "preferred share that confers exactly one vote per share, has no fixed maturity date, provides the same dividends as common/ordinary shareholders, and is registered"})

(def PreferredVotingPerpetualParticipatingRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredVotingPerpetualParticipatingRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value "preferred, voting, perpetual, participating, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/SingleVotingShare
                      :fibo-sec-eq-eq/NonCumulativePreferredShare
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-eq-eq/ParticipatingPreferredShare
                      :fibo-sec-sec-lst/RegisteredSecurity
                      :fibo-sec-eq-eq/PerpetualPreferredShare},
   :skos/definition
   "preferred share that confers exactly one vote per share, has no fixed maturity date, provides a periodic stated income and participates with common shareholders in further dividend and capital distributions, and is registered"})

(def PreferredVotingRedeemableAdjustableIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredVotingRedeemableAdjustableIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, voting, redeemable, adjustable income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/PreferredShareWithAdjustableRateDividend
                      :fibo-sec-eq-eq/SingleVotingShare
                      {:owl/unionOf [:fibo-sec-eq-eq/RedeemablePreferredShare
                                     :fibo-sec-eq-eq/RetractablePreferredShare],
                       :rdf/type    :owl/Class}
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers exactly one vote per share, may be redeemed at the option of the issuer and/or of the shareholder, provides a periodic income whose dividend rate is set periodically, and is registered"})

(def PreferredVotingRedeemableAuctionRateIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredVotingRedeemableAuctionRateIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, voting, redeemable, auction rate income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/PreferredShareWithAuctionRateDividend
                      :fibo-sec-eq-eq/SingleVotingShare
                      {:owl/unionOf [:fibo-sec-eq-eq/RedeemablePreferredShare
                                     :fibo-sec-eq-eq/RetractablePreferredShare],
                       :rdf/type    :owl/Class}
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers exactly one vote per share, may be redeemed at the option of the issuer and/or of the shareholder, provides a periodic income whose dividend rate is adjusted through an auction, and is registered"})

(def PreferredVotingRedeemableCumulativeParticipatingRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredVotingRedeemableCumulativeParticipatingRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, voting, redeemable, cumulative participating, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/SingleVotingShare
                      :fibo-sec-eq-eq/CumulativePreferredShare
                      {:owl/unionOf [:fibo-sec-eq-eq/RedeemablePreferredShare
                                     :fibo-sec-eq-eq/RetractablePreferredShare],
                       :rdf/type    :owl/Class}
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-eq-eq/ParticipatingPreferredShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers exactly one vote per share, may be redeemed at the option of the issuer and/or of the shareholder, provides a periodic stated income, dividends not paid in any year accumulate, and participates with common shareholders in further dividend and capital distributions, and is registered"})

(def PreferredVotingRedeemableCumulativeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredVotingRedeemableCumulativeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value
                "preferred, voting, redeemable, cumulative, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/SingleVotingShare
                      :fibo-sec-eq-eq/NonParticipatingPreferredShare
                      :fibo-sec-eq-eq/CumulativePreferredShare
                      {:owl/unionOf [:fibo-sec-eq-eq/RedeemablePreferredShare
                                     :fibo-sec-eq-eq/RetractablePreferredShare],
                       :rdf/type    :owl/Class}
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers exactly one vote per share, may be redeemed at the option of the issuer and/or of the shareholder, provides a periodic stated income and dividends not paid in any year accumulate, and is registered"})

(def PreferredVotingRedeemableExchangeableAdjustableIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredVotingRedeemableExchangeableAdjustableIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, voting, redeemable exchangeable, adjustable income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/PreferredShareWithAdjustableRateDividend
                      :fibo-sec-eq-eq/SingleVotingShare
                      :fibo-sec-eq-eq/ExchangeablePreferredShare
                      {:owl/unionOf [:fibo-sec-eq-eq/RedeemablePreferredShare
                                     :fibo-sec-eq-eq/RetractablePreferredShare],
                       :rdf/type    :owl/Class}
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers exactly one vote per share, may be redeemed at the option of the issuer and/or of the shareholder, provides a periodic income whose dividend rate is set periodically, and is registered"})

(def PreferredVotingRedeemableExchangeableAuctionRateIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredVotingRedeemableExchangeableAuctionRateIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, voting, redeemable exchangeable, auction rate income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/PreferredShareWithAuctionRateDividend
                      :fibo-sec-eq-eq/SingleVotingShare
                      :fibo-sec-eq-eq/ExchangeablePreferredShare
                      {:owl/unionOf [:fibo-sec-eq-eq/RedeemablePreferredShare
                                     :fibo-sec-eq-eq/RetractablePreferredShare],
                       :rdf/type    :owl/Class}
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers exactly one vote per share, may be redeemed at the option of the issuer and/or of the shareholder, provides a periodic income whose dividend rate is adjusted through an auction, and is registered"})

(def PreferredVotingRedeemableExchangeableCumulativeParticipatingRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredVotingRedeemableExchangeableCumulativeParticipatingRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, voting, redeemable exchangeable, cumulative participating, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/SingleVotingShare
                      :fibo-sec-eq-eq/ExchangeablePreferredShare
                      :fibo-sec-eq-eq/CumulativePreferredShare
                      {:owl/unionOf [:fibo-sec-eq-eq/RedeemablePreferredShare
                                     :fibo-sec-eq-eq/RetractablePreferredShare],
                       :rdf/type    :owl/Class}
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-eq-eq/ParticipatingPreferredShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers exactly one vote per share, may be exchanged for securities of another issuer, may be redeemed at the option of the issuer and/or of the shareholder, provides a periodic stated income, dividends not paid in any year accumulate, and participates with common shareholders in further dividend and capital distributions, and is registered"})

(def PreferredVotingRedeemableExchangeableCumulativeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredVotingRedeemableExchangeableCumulativeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, voting, redeemable exchangeable, cumulative, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/SingleVotingShare
                      :fibo-sec-eq-eq/ExchangeablePreferredShare
                      :fibo-sec-eq-eq/NonParticipatingPreferredShare
                      :fibo-sec-eq-eq/CumulativePreferredShare
                      {:owl/unionOf [:fibo-sec-eq-eq/RedeemablePreferredShare
                                     :fibo-sec-eq-eq/RetractablePreferredShare],
                       :rdf/type    :owl/Class}
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers exactly one vote per share, may be exchanged for securities of another issuer, may be redeemed at the option of the issuer and/or of the shareholder, provides a periodic stated income and dividends not paid in any year accumulate, and is registered"})

(def
  PreferredVotingRedeemableExchangeableExtendableAdjustableIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredVotingRedeemableExchangeableExtendableAdjustableIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, voting, redeemable/exchangeable/extendable, adjustable income, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/PreferredShareWithAdjustableRateDividend
     :fibo-sec-eq-eq/ExtendablePreferredShare :fibo-sec-eq-eq/SingleVotingShare
     :fibo-sec-eq-eq/ExchangeablePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate],
      :rdf/type :owl/Class} :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers exactly one vote per share, may be exchanged for securities of another issuer, whose issuer and/or shareholders have the option to extend the maturity date, that provides a periodic income whose dividend rate is set periodically, and is registered"})

(def
  PreferredVotingRedeemableExchangeableExtendableAuctionRateIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredVotingRedeemableExchangeableExtendableAuctionRateIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, voting, redeemable/exchangeable/extendable, auction rate income, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare
     :fibo-sec-eq-eq/PreferredShareWithAuctionRateDividend
     :fibo-sec-eq-eq/SingleVotingShare
     :fibo-sec-eq-eq/ExchangeablePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate],
      :rdf/type :owl/Class} :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers exactly one vote per share, may be exchanged for securities of another issuer, whose issuer and/or shareholders have the option to extend the maturity date, that provides a periodic income whose dividend rate is adjusted through an auction, and is registered"})

(def
  PreferredVotingRedeemableExchangeableExtendableCumulativeParticipatingRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredVotingRedeemableExchangeableExtendableCumulativeParticipatingRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, voting, redeemable/exchangeable/extendable, cumulative participating, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare :fibo-sec-eq-eq/SingleVotingShare
     :fibo-sec-eq-eq/ExchangeablePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/CumulativePreferredShare
     :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
     :fibo-sec-eq-eq/ParticipatingPreferredShare
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers exactly one vote per share, may be exchanged for securities of another issuer, whose issuer and/or shareholders have the option to extend the maturity date, that provides a periodic stated income, dividends not paid in any year accumulate, and participates with common shareholders in further dividend and capital distributions, and is registered"})

(def PreferredVotingRedeemableExchangeableExtendableCumulativeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredVotingRedeemableExchangeableExtendableCumulativeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, voting, redeemable/exchangeable/extendable, cumulative, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare :fibo-sec-eq-eq/SingleVotingShare
     :fibo-sec-eq-eq/ExchangeablePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/NonParticipatingPreferredShare
     :fibo-sec-eq-eq/CumulativePreferredShare
     :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers exactly one vote per share, may be exchanged for securities of another issuer, whose issuer and/or shareholders have the option to extend the maturity date, that provides a periodic stated income and dividends not paid in any year accumulate, and is registered"})

(def PreferredVotingRedeemableExchangeableExtendableFixedIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredVotingRedeemableExchangeableExtendableFixedIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, voting, redeemable/exchangeable/extendable, fixed income, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare :fibo-sec-eq-eq/SingleVotingShare
     :fibo-sec-eq-eq/ExchangeablePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/NonParticipatingPreferredShare
     :fibo-sec-eq-eq/NonCumulativePreferredShare
     :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers exactly one vote per share, may be exchanged for securities of another issuer, whose issuer and/or shareholders have the option to extend the maturity date, that provides a periodic stated income, and is registered"})

(def PreferredVotingRedeemableExchangeableExtendableNormalIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredVotingRedeemableExchangeableExtendableNormalIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, voting, redeemable/exchangeable/extendable, normal income, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare :fibo-sec-eq-eq/SingleVotingShare
     :fibo-sec-eq-eq/ExchangeablePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/NonCumulativePreferredShare
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers exactly one vote per share, may be exchanged for securities of another issuer, whose issuer and/or shareholders have the option to extend the maturity date, that provides the same dividends as common/ordinary shareholders, and is registered"})

(def PreferredVotingRedeemableExchangeableExtendableParticipatingRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredVotingRedeemableExchangeableExtendableParticipatingRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, voting, redeemable/exchangeable/extendable, participating, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare :fibo-sec-eq-eq/SingleVotingShare
     :fibo-sec-eq-eq/ExchangeablePreferredShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/NonCumulativePreferredShare
     :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
     :fibo-sec-eq-eq/ParticipatingPreferredShare
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers exactly one vote per share, may be exchanged for securities of another issuer, whose issuer and/or shareholders have the option to extend the maturity date, that provides a periodic stated income and participates with common shareholders in further dividend and capital distributions, and is registered"})

(def PreferredVotingRedeemableExchangeableFixedIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredVotingRedeemableExchangeableFixedIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, voting, redeemable exchangeable, fixed income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/SingleVotingShare
                      :fibo-sec-eq-eq/ExchangeablePreferredShare
                      :fibo-sec-eq-eq/NonParticipatingPreferredShare
                      :fibo-sec-eq-eq/NonCumulativePreferredShare
                      {:owl/unionOf [:fibo-sec-eq-eq/RedeemablePreferredShare
                                     :fibo-sec-eq-eq/RetractablePreferredShare],
                       :rdf/type    :owl/Class}
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers exactly one vote per share, may be exchanged for securities of another issuer, may be redeemed at the option of the issuer and/or of the shareholder, provides a periodic stated income, and is registered"})

(def PreferredVotingRedeemableExchangeableNormalIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredVotingRedeemableExchangeableNormalIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, voting, redeemable exchangeable, normal income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/SingleVotingShare
                      :fibo-sec-eq-eq/ExchangeablePreferredShare
                      {:owl/unionOf [:fibo-sec-eq-eq/RedeemablePreferredShare
                                     :fibo-sec-eq-eq/RetractablePreferredShare],
                       :rdf/type    :owl/Class}
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers exactly one vote per share, may be exchanged for securities of another issuer, may be redeemed at the option of the issuer and/or of the shareholder, provides the same dividends as common/ordinary shareholders, and is registered"})

(def PreferredVotingRedeemableExchangeableParticipatingRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredVotingRedeemableExchangeableParticipatingRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, voting, redeemable exchangeable, participating, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/SingleVotingShare
                      :fibo-sec-eq-eq/ExchangeablePreferredShare
                      :fibo-sec-eq-eq/NonCumulativePreferredShare
                      {:owl/unionOf [:fibo-sec-eq-eq/RedeemablePreferredShare
                                     :fibo-sec-eq-eq/RetractablePreferredShare],
                       :rdf/type    :owl/Class}
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-eq-eq/ParticipatingPreferredShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers exactly one per share, may be exchanged for securities of another issuer, may be redeemed at the option of the issuer and/or of the shareholder, provides a periodic stated income and participates with common shareholders in further dividend and capital distributions, and is registered"})

(def PreferredVotingRedeemableExtendableAdjustableIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredVotingRedeemableExtendableAdjustableIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, voting, redeemable extendable, adjustable income, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/PreferredShareWithAdjustableRateDividend
     :fibo-sec-eq-eq/ExtendablePreferredShare :fibo-sec-eq-eq/SingleVotingShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate],
      :rdf/type :owl/Class} :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers exactly one vote per share, whose issuer and/or shareholders have the option to extend the maturity date, that provides a periodic income whose dividend rate is set periodically, and is registered"})

(def PreferredVotingRedeemableExtendableAuctionRateIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredVotingRedeemableExtendableAuctionRateIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, voting, redeemable extendable, auction rate income, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare
     :fibo-sec-eq-eq/PreferredShareWithAuctionRateDividend
     :fibo-sec-eq-eq/SingleVotingShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate],
      :rdf/type :owl/Class} :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers exactly one vote per share, whose issuer and/or shareholders have the option to extend the maturity date, that provides a periodic income whose dividend rate is adjusted through an auction, and is registered"})

(def PreferredVotingRedeemableExtendableCumulativeParticipatingRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredVotingRedeemableExtendableCumulativeParticipatingRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, voting, redeemable extendable, cumulative participating, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare :fibo-sec-eq-eq/SingleVotingShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/CumulativePreferredShare
     :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
     :fibo-sec-eq-eq/ParticipatingPreferredShare
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers exactly one vote per share, whose issuer and/or shareholders have the option to extend the maturity date, that provides a periodic stated income, dividends not paid in any year accumulate, and participates with common shareholders in further dividend and capital distributions, and is registered"})

(def PreferredVotingRedeemableExtendableCumulativeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredVotingRedeemableExtendableCumulativeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, voting, redeemable extendable, cumulative, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare :fibo-sec-eq-eq/SingleVotingShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/NonParticipatingPreferredShare
     :fibo-sec-eq-eq/CumulativePreferredShare
     :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers exactly one vote per share, whose issuer and/or shareholders have the option to extend the maturity date, that provides a periodic stated income and dividends not paid in any year accumulate, and is registered"})

(def PreferredVotingRedeemableExtendableFixedIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredVotingRedeemableExtendableFixedIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, voting, redeemable extendable, fixed income, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare :fibo-sec-eq-eq/SingleVotingShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/NonParticipatingPreferredShare
     :fibo-sec-eq-eq/NonCumulativePreferredShare
     :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers exactly one vote per share, whose issuer and/or shareholders have the option to extend the maturity date, that provides a periodic stated income, and is registered"})

(def PreferredVotingRedeemableExtendableNormalIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredVotingRedeemableExtendableNormalIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, voting, redeemable extendable, normal income, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare :fibo-sec-eq-eq/SingleVotingShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate],
      :rdf/type :owl/Class} :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers exactly one vote per share, whose issuer and/or shareholders have the option to extend the maturity date, that provides the same dividends as common/ordinary shareholders, and is registered"})

(def PreferredVotingRedeemableExtendableParticipatingRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredVotingRedeemableExtendableParticipatingRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, voting, redeemable extendable, participating, registered share"},
   :rdfs/subClassOf
   #{:fibo-sec-eq-eq/ExtendablePreferredShare :fibo-sec-eq-eq/SingleVotingShare
     {:owl/unionOf
      [:fibo-sec-eq-eq/RedeemablePreferredShareWithExtendableMaturityDate
       :fibo-sec-eq-eq/RetractablePreferredShareWithExtendableMaturityDate],
      :rdf/type :owl/Class} :fibo-sec-eq-eq/NonCumulativePreferredShare
     :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
     :fibo-sec-eq-eq/ParticipatingPreferredShare
     :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers exactly one vote per share, whose issuer and/or shareholders have the option to extend the maturity date, that provides a periodic stated income and participates with common shareholders in further dividend and capital distributions, and is registered"})

(def PreferredVotingRedeemableFixedIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredVotingRedeemableFixedIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value "preferred, voting, redeemable, fixed income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/SingleVotingShare
                      :fibo-sec-eq-eq/NonParticipatingPreferredShare
                      :fibo-sec-eq-eq/NonCumulativePreferredShare
                      {:owl/unionOf [:fibo-sec-eq-eq/RedeemablePreferredShare
                                     :fibo-sec-eq-eq/RetractablePreferredShare],
                       :rdf/type    :owl/Class}
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers exactly one vote per share, may be redeemed at the option of the issuer and/or of the shareholder, provides a periodic stated income, and is registered"})

(def PreferredVotingRedeemableNormalIncomeRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredVotingRedeemableNormalIncomeRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, voting, redeemable, normal income, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/SingleVotingShare
                      {:owl/unionOf [:fibo-sec-eq-eq/RedeemablePreferredShare
                                     :fibo-sec-eq-eq/RetractablePreferredShare],
                       :rdf/type    :owl/Class}
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers exactly one vote per share, may be redeemed at the option of the issuer and/or of the shareholder, provides the same dividends as common/ordinary shareholders, and is registered"})

(def PreferredVotingRedeemableParticipatingRegisteredShare
  {:db/ident
   :fibo-sec-eq-10962/PreferredVotingRedeemableParticipatingRegisteredShare,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdfs/label
   {:rdf/language "en-US",
    :rdf/value
    "preferred, voting, redeemable, participating, registered share"},
   :rdfs/subClassOf #{:fibo-sec-eq-eq/SingleVotingShare
                      :fibo-sec-eq-eq/NonCumulativePreferredShare
                      {:owl/unionOf [:fibo-sec-eq-eq/RedeemablePreferredShare
                                     :fibo-sec-eq-eq/RetractablePreferredShare],
                       :rdf/type    :owl/Class}
                      :fibo-sec-eq-eq/PreferredShareWithFixedRateDividend
                      :fibo-sec-eq-eq/ParticipatingPreferredShare
                      :fibo-sec-sec-lst/RegisteredSecurity},
   :skos/definition
   "preferred share that confers exactly one vote per share, may be redeemed at the option of the issuer and/or of the shareholder, provides a periodic stated income and participates with common shareholders in further dividend and capital distributions, and is registered"})

(def urn:uuid:5f488dce-698a-5548-a083-7bfe9eb90fe7
  {:cmns-av/copyright #{"Copyright (c) 2020-2023 Object Management Group, Inc."
                        "Copyright (c) 2020-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology covers the ISO 10962, Fourth edition, 2019-10 classification codes for instruments that represent an ownership interest in an entity or pool of assets. It is intended to cover sections most of the codes included in section 6.2 of the standard, with the exception of structured instruments, section 6.2.8, which will be covered under derivatives.",
   :dcterms/contributor "Thematix Partners LLC",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Securities/SecuritiesListings/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Securities/SecuritiesClassification/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Securities/SecuritiesIssuance/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Equities/EquityInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/SEC/Equities/EquityCFIClassificationIndividuals/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Equities CFI Classification Individuals Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals.rdf version of this ontology was revised to streamline the representation of voting rights and payment form, eliminate embedded restrictions, and build out additional classes representing the various feature-based descriptions supported by the CFI standard."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals.rdf version of this ontology was revised to simplify the encoding of the individual instrument classifiers to eliminate unnecessary restrictions."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals.rdf version of this ontology was revised to complete the set of possible common share representations corresponding to the CFI standard, complete the set of corresponding codes for common shares (non-convertible), and add the set of possible combinations for preferred shares (non-convertible)."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals.rdf version of this ontology was modified to add a parent class of extendable preferred share where appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals.rdf version of this ontology was revised to replace uses of hasTag in Relations with hasTag from LCC, as the more complex union of datatypes in the Relations concept is not needed here."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals.rdf version of this ontology was revised to address text formatting hygiene issues."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityCFIClassificationIndividuals/"})