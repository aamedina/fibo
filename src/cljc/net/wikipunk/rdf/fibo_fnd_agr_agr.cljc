(ns net.wikipunk.rdf.fibo-fnd-agr-agr
  {:cmns-av/copyright #{"Copyright (c) 2013-2023 Object Management Group, Inc."
                        "Copyright (c) 2013-2023 EDM Council, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Agreements/Agreements/",
   :dcterms/abstract
   "This ontology defines the concept of an agreement and roles that parties to an agreement play in the context of financial agreements. Agreements represent an understanding between parties, whereas contracts typically formalize such agreements.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-agr-agr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreements/",
    "fibo-fnd-pty-pty"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
    "fibo-fnd-pty-rl"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "skos"    "http://www.w3.org/2004/02/skos/core#",
    "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Parties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Roles/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Agreements/Agreements/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fnd-agr-agr",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreements/",
   :rdfs/label "Agreements Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreement.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary, clean up definitions to conform with ISO 704, add a missing restriction to mutual commitment, and eliminate an unnecessary reference to LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreement.rdf version of the ontology was modified to eliminate duplication of concepts in LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreement.rdf version of the ontology was modified per the issue resolutions identified in the FIBO FND 1.1 RTF report and in https://spec.edmcouncil.org/fibo/ontology/FND/1.1/AboutFND-1.1/."
     "The http://www.omg.org/spec/FIBO/Foundations/20130601/Agreements/Agreements.owl version of the ontology was revised in advance of the September 2013 New Brunswick, NJ meeting, as follows:\n   (1) to use slash style URI/IRIss (also called 303 URIs, vs. hash style) as required to support server side processing \n   (2) to use version-independent IRIs for all definitions internally as opposed to version-specific IRIs\n   (3) to change the file suffix from .owl to .rdf to increase usability in RDF tools\n   (4) to use 4-level abbreviations and corresponding namespace prefixes for all FIBO ontologies, reflecting a family/specification/module/ontology structure\n   (5) to incorporate changes to the specification metadata to support documentation at the family, specification, module, and ontology level, similar to the abbreviations.\n   (6) to revise a few of the definitions based on more formal sources."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreement.rdf version of the ontology was modified per the issue resolutions identified in the FIBO FND 1.0 FTF report and in https://spec.edmcouncil.org/fibo/ontology/FND/1.0/AboutFND-1.0/."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreement.rdf version of the ontology was modified per FIBO 2.0 RFC to add general concepts including obligor, obligee, and beneficiary in support of other FIBO domain areas."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreements/"})

(def Agreement
  {:db/ident :fibo-fnd-agr-agr/Agreement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreements/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "agreement"},
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fnd-rel-rel/confers,
                       :owl/someValuesFrom :fibo-fnd-agr-agr/Commitment,
                       :rdf/type           :owl/Restriction}
                      {:owl/minQualifiedCardinality 2,
                       :owl/onClass    :fibo-fnd-pty-pty/PartyInRole,
                       :owl/onProperty :fibo-fnd-pty-pty/hasPartyInRole,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "negotiated understanding between two or more parties, reflecting the offer and acceptance of commitments on the part of either party"})

(def Beneficiary
  {:db/ident :fibo-fnd-agr-agr/Beneficiary,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreements/"},
   :rdfs/label "beneficiary",
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-fnd-pty-rl/isPlayedBy,
      :owl/someValuesFrom {:owl/minQualifiedCardinality 0,
                           :owl/onClass    :fibo-fnd-agr-agr/Agreement,
                           :owl/onProperty :fibo-fnd-pty-pty/isAPartyTo,
                           :rdf/type       :owl/Restriction},
      :rdf/type           :owl/Restriction} :fibo-fnd-pty-pty/PartyInRole},
   :skos/definition
   "party that receives some benefit or advantage or profits from something"})

(def Commitment
  {:cmns-av/explanatoryNote
   "Such a promise often results a corresponding right or or obligation with respect to another party to the commitment. Thus, obligations and rights are considered as reciprocal aspects of a commitment.",
   :db/ident :fibo-fnd-agr-agr/Commitment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreements/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "commitment"},
   :skos/definition
   "promise made by some party to act or refrain from acting in some manner"})

(def CommitmentAtLarge
  {:db/ident :fibo-fnd-agr-agr/CommitmentAtLarge,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreements/"},
   :rdfs/label "commitment at large",
   :rdfs/subClassOf :fibo-fnd-agr-agr/UnilateralCommitment,
   :skos/definition
   "commitment made by some party without direct involvement from the potential beneficiaries of that commitment",
   :skos/scopeNote
   "A commitment at large forms the basis for negotiable securities including transferable contracts and potentially other kinds of agreements such as software licenses."})

(def IndividualUnilateralCommitment
  {:db/ident :fibo-fnd-agr-agr/IndividualUnilateralCommitment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreements/"},
   :rdfs/label "individual unilateral commitment",
   :rdfs/subClassOf :fibo-fnd-agr-agr/UnilateralCommitment,
   :skos/definition
   "commitment made by some party unilaterally to another specific party"})

(def MutualAgreement
  {:db/ident :fibo-fnd-agr-agr/MutualAgreement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreements/"},
   :rdfs/label "mutual agreement",
   :rdfs/subClassOf #{:fibo-fnd-agr-agr/Agreement
                      {:owl/onProperty     :fibo-fnd-rel-rel/confers,
                       :owl/someValuesFrom :fibo-fnd-agr-agr/MutualCommitment,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "agreement between two or more specific named parties whereby the rights and obligations embodied in the agreement cannot be transferred to another party without prior agreement",
   :skos/scopeNote
   "This may or may not be a contractual agreement - it also forms the basis of REA transaction models which may or may not refer to contractual agreements, since REA is also used to frame transactions internal to an individual organization."})

(def MutualCommitment
  {:db/ident :fibo-fnd-agr-agr/MutualCommitment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreements/"},
   :rdfs/label "mutual commitment",
   :rdfs/subClassOf #{{:owl/minQualifiedCardinality 2,
                       :owl/onClass    :fibo-fnd-pty-pty/PartyInRole,
                       :owl/onProperty :fibo-fnd-pty-pty/hasPartyInRole,
                       :rdf/type       :owl/Restriction}
                      :fibo-fnd-agr-agr/Commitment},
   :skos/definition "commitment between two or more parties"})

(def Obligee
  {:db/ident :fibo-fnd-agr-agr/Obligee,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreements/"},
   :rdfs/label "obligee",
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-fnd-pty-rl/isPlayedBy,
      :owl/someValuesFrom {:owl/minQualifiedCardinality 0,
                           :owl/onClass    :fibo-fnd-agr-agr/Agreement,
                           :owl/onProperty :fibo-fnd-pty-pty/isAPartyTo,
                           :rdf/type       :owl/Restriction},
      :rdf/type           :owl/Restriction} :fibo-fnd-pty-pty/PartyInRole},
   :skos/definition
   "party to whom some commitment or obligation is owed, either legally or per the terms of an agreement"})

(def Obligor
  {:cmns-av/synonym #{"obligator" "obligated party"},
   :db/ident :fibo-fnd-agr-agr/Obligor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreements/"},
   :rdfs/label "obligor",
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-fnd-pty-rl/isPlayedBy,
      :owl/someValuesFrom {:owl/minQualifiedCardinality 0,
                           :owl/onClass    :fibo-fnd-agr-agr/Agreement,
                           :owl/onProperty :fibo-fnd-pty-pty/isAPartyTo,
                           :rdf/type       :owl/Restriction},
      :rdf/type           :owl/Restriction} :fibo-fnd-pty-pty/PartyInRole
     {:owl/onProperty     :fibo-fnd-agr-agr/hasObligation,
      :owl/someValuesFrom :fibo-fnd-agr-agr/Commitment,
      :rdf/type           :owl/Restriction}},
   :skos/definition
   "party that is bound legally or by agreement to repay a debt, make a payment, do something, or refrain from doing something"})

(def UnilateralCommitment
  {:db/ident :fibo-fnd-agr-agr/UnilateralCommitment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreements/"},
   :rdfs/label "unilateral commitment",
   :rdfs/subClassOf :fibo-fnd-agr-agr/Commitment,
   :skos/definition
   "commitment made by one party without reference any other the party to which the commitment is made"})

(def hasObligation
  {:db/ident :fibo-fnd-agr-agr/hasObligation,
   :owl/inverseOf :fibo-fnd-agr-agr/isObligationOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-agr-agr/Obligor,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreements/"},
   :rdfs/label "has obligation",
   :skos/definition
   "identifies a duty or obligation that a given party has taken on"})

(def isObligationOf
  {:db/ident :fibo-fnd-agr-agr/isObligationOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreements/"},
   :rdfs/label "is obligation of",
   :rdfs/range :fibo-fnd-agr-agr/Obligor,
   :skos/definition "identifies a party that has a given obligation"})

(def urn:uuid:84813882-0da9-58c4-8e3c-0e17ce7d52d4
  {:cmns-av/copyright #{"Copyright (c) 2013-2023 Object Management Group, Inc."
                        "Copyright (c) 2013-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology defines the concept of an agreement and roles that parties to an agreement play in the context of financial agreements. Agreements represent an understanding between parties, whereas contracts typically formalize such agreements.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Parties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Parties/Roles/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Agreements/Agreements/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Agreements Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreement.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary, clean up definitions to conform with ISO 704, add a missing restriction to mutual commitment, and eliminate an unnecessary reference to LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreement.rdf version of the ontology was modified to eliminate duplication of concepts in LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreement.rdf version of the ontology was modified per the issue resolutions identified in the FIBO FND 1.1 RTF report and in https://spec.edmcouncil.org/fibo/ontology/FND/1.1/AboutFND-1.1/."
     "The http://www.omg.org/spec/FIBO/Foundations/20130601/Agreements/Agreements.owl version of the ontology was revised in advance of the September 2013 New Brunswick, NJ meeting, as follows:\n   (1) to use slash style URI/IRIss (also called 303 URIs, vs. hash style) as required to support server side processing \n   (2) to use version-independent IRIs for all definitions internally as opposed to version-specific IRIs\n   (3) to change the file suffix from .owl to .rdf to increase usability in RDF tools\n   (4) to use 4-level abbreviations and corresponding namespace prefixes for all FIBO ontologies, reflecting a family/specification/module/ontology structure\n   (5) to incorporate changes to the specification metadata to support documentation at the family, specification, module, and ontology level, similar to the abbreviations.\n   (6) to revise a few of the definitions based on more formal sources."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreement.rdf version of the ontology was modified per the issue resolutions identified in the FIBO FND 1.0 FTF report and in https://spec.edmcouncil.org/fibo/ontology/FND/1.0/AboutFND-1.0/."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreement.rdf version of the ontology was modified per FIBO 2.0 RFC to add general concepts including obligor, obligee, and beneficiary in support of other FIBO domain areas."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreements/"})