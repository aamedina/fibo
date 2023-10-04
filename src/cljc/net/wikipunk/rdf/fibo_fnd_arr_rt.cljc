(ns net.wikipunk.rdf.fibo-fnd-arr-rt
  ^{:base "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Ratings/",
    :namespaces
    {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
     "cmns-cds" "https://www.omg.org/spec/Commons/CodesAndCodeSets/",
     "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
     "cmns-dsg" "https://www.omg.org/spec/Commons/Designators/",
     "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
     "dcterms" "http://purl.org/dc/terms/",
     "fibo-fnd-agr-ctr"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
     "fibo-fnd-arr-asmt"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Assessments/",
     "fibo-fnd-arr-doc"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/",
     "fibo-fnd-arr-rep"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Reporting/",
     "fibo-fnd-arr-rt"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Ratings/",
     "fibo-fnd-dt-oc"
     "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/",
     "fibo-fnd-org-fm"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations/",
     "fibo-fnd-pty-pty"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
     "fibo-fnd-rel-rel"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
     "fibo-fnd-utl-av"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
     "owl" "http://www.w3.org/2002/07/owl#",
     "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
     "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
     "skos" "http://www.w3.org/2004/02/skos/core#",
     "xsd" "http://www.w3.org/2001/XMLSchema#"},
    :prefix "fibo-fnd-arr-rt",
    :source
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Arrangements/Ratings/"}
  {:cmns-av/copyright #{"Copyright (c) 2019-2023 Object Management Group, Inc."
                        "Copyright (c) 2019-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology defines abstract concepts for representation of ratings and rating schemes, particularly for ratings describing aspects of business performance, credit worthiness, and investment quality at a high level.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Parties/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/CodesAndCodeSets/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Arrangements/Assessments/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/DatesAndTimes/Occurrences/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Arrangements/Reporting/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Arrangements/Documents/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Organizations/FormalOrganizations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Arrangements/Ratings/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Ratings Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Ratings.rdf version of this ontology was revised to address hygiene issues with respect to text formatting."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Ratings.rdf version of this ontology was revised to add properties indicating the 'best' and 'worst' scores on a given scale."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Ratings.rdf version of this ontology was revised to eliminate circular definitions."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Ratings.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Ratings.rdf version of this ontology was revised to replace uses of hasTag in Relations with hasTag from LCC, as the more complex union of datatypes in the Relations concept is not needed here."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Ratings.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Ratings.rdf version of this ontology was revised to eliminate duplication with LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Ratings.rdf version of this ontology was revised to replace hasDefinition with isDefinedIn to clarify intent."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Ratings/"})

(def QualitativeRatingScore
  {:cmns-av/explanatoryNote
   "Ratings for the creditworthiness of securities are often qualitative, rather than quantitative, such as a triple-A (i.e., AAA). Many ratings for products and businesses on the Internet are also qualitative, such as 5-star ratings for something.",
   :db/ident :fibo-fnd-arr-rt/QualitativeRatingScore,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Ratings/"},
   :rdfs/label "qualitative rating score",
   :rdfs/subClassOf #{{:owl/onDataRange :xsd/string,
                       :owl/onProperty  :fibo-fnd-rel-rel/hasTag,
                       :owl/qualifiedCardinality 1,
                       :rdf/type        :owl/Restriction}
                      :fibo-fnd-arr-rt/RatingScore :cmns-cds/CodeElement},
   :skos/definition
   "rating score that is represented as a qualitative code with respect to some rating scale"})

(def QuantitativeRatingScore
  {:db/ident :fibo-fnd-arr-rt/QuantitativeRatingScore,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Ratings/"},
   :rdfs/label "quantitative rating score",
   :rdfs/subClassOf #{:fibo-fnd-arr-rt/RatingScore
                      {:owl/onDataRange :xsd/decimal,
                       :owl/onProperty  :fibo-fnd-arr-rt/hasMeasureWithinScale,
                       :owl/qualifiedCardinality 1,
                       :rdf/type        :owl/Restriction}},
   :skos/definition
   "rating score that is a simple numeric value on some scale, such as a credit rating for an individual"})

(def Rating
  {:db/ident :fibo-fnd-arr-rt/Rating,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Ratings/"},
   :rdfs/label "rating",
   :rdfs/subClassOf #{{:owl/cardinality 1,
                       :owl/onProperty  :fibo-fnd-arr-rt/rates,
                       :rdf/type        :owl/Restriction}
                      {:owl/onClass    :cmns-dt/Date,
                       :owl/onProperty :fibo-fnd-arr-doc/hasDateOfIssuance,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      :fibo-fnd-arr-asmt/Opinion
                      {:owl/maxQualifiedCardinality 1,
                       :owl/onClass    :cmns-dt/Date,
                       :owl/onProperty :fibo-fnd-agr-ctr/hasEffectiveDate,
                       :rdf/type       :owl/Restriction}
                      {:owl/onClass    :fibo-fnd-arr-rt/RatingParty,
                       :owl/onProperty :fibo-fnd-rel-rel/isGeneratedBy,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      {:owl/onClass    :fibo-fnd-arr-rt/RatingIssuer,
                       :owl/onProperty :fibo-fnd-rel-rel/isIssuedBy,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      {:owl/onProperty     :fibo-fnd-arr-rt/hasRatingScore,
                       :owl/someValuesFrom :fibo-fnd-arr-rt/RatingScore,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "standing of something at a particular time, indicated by at least one scores with respect to some scale, based on an assessment by some party"})

(def RatingAgency
  {:db/ident :fibo-fnd-arr-rt/RatingAgency,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Ratings/"},
   :rdfs/label "rating agency",
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fnd-rel-rel/hasIdentity,
                       :owl/someValuesFrom :fibo-fnd-org-fm/FormalOrganization,
                       :rdf/type           :owl/Restriction}
                      :fibo-fnd-arr-rt/RatingIssuer
                      :fibo-fnd-arr-rt/RatingScalePublisher},
   :skos/definition
   "rating issuer that is also a rating scale publisher, frequently but not always an independent rating service"})

(def RatingAssessmentActivity
  {:db/ident :fibo-fnd-arr-rt/RatingAssessmentActivity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Ratings/"},
   :rdfs/label "rating assessment activity",
   :rdfs/subClassOf #{:fibo-fnd-arr-asmt/AssessmentActivity
                      {:owl/onProperty     :fibo-fnd-rel-rel/isProvidedBy,
                       :owl/someValuesFrom :fibo-fnd-arr-rt/RatingParty,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "assessment activity resulting in a grade or score and potentially a report describing the score and the process used to determine that score"})

(def RatingAssessmentEvent
  {:db/ident :fibo-fnd-arr-rt/RatingAssessmentEvent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Ratings/"},
   :rdfs/label "rating assessment event",
   :rdfs/subClassOf #{{:owl/onClass :fibo-fnd-arr-rt/RatingAssessmentActivity,
                       :owl/onProperty :fibo-fnd-dt-oc/exemplifies,
                       :owl/qualifiedCardinality 1,
                       :rdf/type :owl/Restriction}
                      :fibo-fnd-arr-asmt/AssessmentEvent
                      {:owl/onProperty     :fibo-fnd-rel-rel/isProvidedBy,
                       :owl/someValuesFrom :fibo-fnd-arr-rt/RatingParty,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :fibo-fnd-dt-oc/hasOutput,
                       :owl/someValuesFrom :fibo-fnd-arr-rt/Rating,
                       :rdf/type           :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-fnd-arr-rt/RatingReport,
                       :owl/onProperty :fibo-fnd-dt-oc/hasOutput,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "individual assessment resulting in a grade or score and potentially a report describing the score"})

(def RatingIssuer
  {:cmns-av/explanatoryNote
   "A rating issuer is frequently, but not always the rating scale publisher. A rating issuer may delegate responsibility for producing a rating to a rating party.",
   :db/ident :fibo-fnd-arr-rt/RatingIssuer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Ratings/"},
   :rdfs/label "rating issuer",
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fnd-rel-rel/issues,
                       :owl/someValuesFrom :fibo-fnd-arr-rt/Rating,
                       :rdf/type           :owl/Restriction}
                      :fibo-fnd-pty-pty/PartyInRole},
   :skos/definition "party that is responsible for issuing ratings"})

(def RatingParty
  {:db/ident :fibo-fnd-arr-rt/RatingParty,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Ratings/"},
   :rdfs/label "rating party",
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fnd-rel-rel/generates,
                       :owl/someValuesFrom :fibo-fnd-arr-rt/Rating,
                       :rdf/type           :owl/Restriction}
                      :fibo-fnd-pty-pty/PartyInRole},
   :skos/definition
   "person, organization or group that analyzes some aspect of something and develops a rating"})

(def RatingReport
  {:db/ident :fibo-fnd-arr-rt/RatingReport,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Ratings/"},
   :rdfs/label "rating report",
   :rdfs/subClassOf #{:fibo-fnd-arr-asmt/AssessmentReport
                      {:owl/onProperty     :fibo-fnd-arr-rep/reportsOn,
                       :owl/someValuesFrom :fibo-fnd-arr-rt/Rating,
                       :rdf/type           :owl/Restriction}},
   :skos/definition "report describing a set of ratings"})

(def RatingScale
  {:db/ident :fibo-fnd-arr-rt/RatingScale,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Ratings/"},
   :rdfs/label "rating scale",
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-dsg/defines,
                       :owl/someValuesFrom :fibo-fnd-arr-rt/RatingScore,
                       :rdf/type           :owl/Restriction}
                      {:owl/maxQualifiedCardinality 1,
                       :owl/onDataRange :xsd/decimal,
                       :owl/onProperty  :fibo-fnd-arr-rt/hasWorstMeasure,
                       :rdf/type        :owl/Restriction}
                      {:owl/onClass    :fibo-fnd-arr-rt/RatingScalePublisher,
                       :owl/onProperty :fibo-fnd-rel-rel/isManagedBy,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      {:owl/maxQualifiedCardinality 1,
                       :owl/onDataRange :xsd/decimal,
                       :owl/onProperty  :fibo-fnd-arr-rt/hasBestMeasure,
                       :rdf/type        :owl/Restriction}
                      :cmns-cls/ClassificationScheme},
   :skos/definition
   "system for assigning a value to something according to some scale with respect to quality, a standard, or ranking"})

(def RatingScalePublisher
  {:cmns-av/explanatoryNote
   "Rating scale publishers are frequently also rating agencies.",
   :db/ident :fibo-fnd-arr-rt/RatingScalePublisher,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Ratings/"},
   :rdfs/label "rating scale publisher",
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fnd-rel-rel/manages,
                       :owl/someValuesFrom :fibo-fnd-arr-rt/RatingScale,
                       :rdf/type           :owl/Restriction}
                      :fibo-fnd-pty-pty/PartyInRole},
   :skos/definition
   "party responsible for managing one or more rating schemes and potentially publishing ratings based on those schemes"})

(def RatingScore
  {:cmns-av/explanatoryNote
   "The meaning and methodology for determining a rating score for the rating of something is determined by a rating issuer. A given rating may apply at some point in time, as a part of a lifecycle or process, or generally. Typically ratings reflect an assessment of a state of affairs at some point in time.",
   :db/ident :fibo-fnd-arr-rt/RatingScore,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Ratings/"},
   :rdfs/label "rating score",
   :rdfs/subClassOf #{{:owl/onClass    :fibo-fnd-arr-rt/RatingScale,
                       :owl/onProperty :cmns-dsg/isDefinedIn,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      {:owl/maxQualifiedCardinality 1,
                       :owl/onDataRange :xsd/decimal,
                       :owl/onProperty  :fibo-fnd-arr-rt/hasMeasureWithinScale,
                       :rdf/type        :owl/Restriction} :cmns-cls/Classifier},
   :skos/definition
   "grade, classification, or ranking of for something in accordance with some rating scale"})

(def hasBestMeasure
  {:cmns-av/explanatoryNote
   "Note that hasBestMeasure and hasWorstMeasure may be used together to determine the direction and range of a scale's measure values.",
   :db/ident :fibo-fnd-arr-rt/hasBestMeasure,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-fnd-arr-rt/RatingScale,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Ratings/"},
   :rdfs/label "has best measure",
   :rdfs/range :xsd/decimal,
   :skos/definition
   "indicates the 'best' (most desirable) possible value for a rating score's hasMeasureWithinScale property"})

(def hasMeasureWithinScale
  {:db/ident :fibo-fnd-arr-rt/hasMeasureWithinScale,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-fnd-arr-rt/RatingScore,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Ratings/"},
   :rdfs/label "has measure within scale",
   :rdfs/range :xsd/decimal,
   :skos/definition
   "indicates a relative, numeric measure or ordering on a rating scale"})

(def hasRating
  {:db/ident :fibo-fnd-arr-rt/hasRating,
   :owl/inverseOf :fibo-fnd-arr-rt/rates,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Ratings/"},
   :rdfs/label "has rating",
   :rdfs/range :fibo-fnd-arr-rt/Rating,
   :rdfs/subPropertyOf :cmns-cls/isClassifiedBy,
   :skos/definition
   "indicates the rating assigned to a thing based on a grade or score according to a particular rating scale"})

(def hasRatingScore
  {:db/ident :fibo-fnd-arr-rt/hasRatingScore,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-arr-rt/Rating,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Ratings/"},
   :rdfs/label "has rating score",
   :rdfs/range :fibo-fnd-arr-rt/RatingScore,
   :rdfs/subPropertyOf :cmns-cls/isClassifiedBy,
   :skos/definition
   "indicates the grade or score associated with a rating with respect to a particular rating scale"})

(def hasWorstMeasure
  {:cmns-av/explanatoryNote
   "Note that hasBestMeasure and hasWorstMeasure may be used together to determine the direction and range of a scale's measure values.",
   :db/ident :fibo-fnd-arr-rt/hasWorstMeasure,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-fnd-arr-rt/RatingScale,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Ratings/"},
   :rdfs/label "has worst measure",
   :rdfs/range :xsd/decimal,
   :skos/definition
   "indicates the 'worst' (least desirable) possible value for a rating score's hasMeasureWithinScale property"})

(def producesRatingsFor
  {:db/ident :fibo-fnd-arr-rt/producesRatingsFor,
   :owl/inverseOf :fibo-fnd-arr-rt/usesRatingParty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-arr-rt/RatingParty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Ratings/"},
   :rdfs/label "produces ratings for",
   :rdfs/range :fibo-fnd-arr-rt/RatingIssuer,
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/produces,
   :skos/definition "issuer for which ratings are produced or posted through"})

(def rates
  {:db/ident :fibo-fnd-arr-rt/rates,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-arr-rt/Rating,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Ratings/"},
   :rdfs/label "rates",
   :rdfs/subPropertyOf :cmns-cls/classifies,
   :skos/definition
   "indicates the instrument, party or something else to which a rating applies"})

(def usesRatingParty
  {:db/ident :fibo-fnd-arr-rt/usesRatingParty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-arr-rt/RatingIssuer,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Ratings/"},
   :rdfs/label "uses rating performer",
   :rdfs/range :fibo-fnd-arr-rt/RatingParty,
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/isProducedBy,
   :skos/definition "rating performer an issuer uses to assess ratings"})

(def urn:uuid:3cabad56-198b-58b1-a60e-9c08b14e53a0
  {:cmns-av/copyright #{"Copyright (c) 2019-2023 Object Management Group, Inc."
                        "Copyright (c) 2019-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology defines abstract concepts for representation of ratings and rating schemes, particularly for ratings describing aspects of business performance, credit worthiness, and investment quality at a high level.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Parties/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/CodesAndCodeSets/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Arrangements/Assessments/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/DatesAndTimes/Occurrences/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Arrangements/Reporting/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Arrangements/Documents/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Organizations/FormalOrganizations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Arrangements/Ratings/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Ratings Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Ratings.rdf version of this ontology was revised to address hygiene issues with respect to text formatting."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Ratings.rdf version of this ontology was revised to add properties indicating the 'best' and 'worst' scores on a given scale."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Ratings.rdf version of this ontology was revised to eliminate circular definitions."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Ratings.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Ratings.rdf version of this ontology was revised to replace uses of hasTag in Relations with hasTag from LCC, as the more complex union of datatypes in the Relations concept is not needed here."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Ratings.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Ratings.rdf version of this ontology was revised to eliminate duplication with LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Ratings.rdf version of this ontology was revised to replace hasDefinition with isDefinedIn to clarify intent."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Ratings/"})