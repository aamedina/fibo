(ns net.wikipunk.rdf.fibo-fnd-agr-agr
  "This ontology defines concepts for agreements, for use in other ontology elements. Agreements as defined here are the actual agreements between parties, and this ontology is intended to be referred to in conjunction with the contracts ontology which defines the actual contracts which formalize such agreements. The concepts of agreement and contract are intended to be kept distinct in the FIBO ontologies, that is neither is intended to be regarded as a sub type of the other."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreements/",
   :dcterms/abstract
   "This ontology defines concepts for agreements, for use in other ontology elements. Agreements as defined here are the actual agreements between parties, and this ontology is intended to be referred to in conjunction with the contracts ontology which defines the actual contracts which formalize such agreements. The concepts of agreement and contract are intended to be kept distinct in the FIBO ontologies, that is neither is intended to be regarded as a sub type of the other.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Roles/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Parties/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Agreements/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
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
    "lcc-lr"  "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
    "owl"     "http://www.w3.org/2002/07/owl#",
    "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
    "skos"    "http://www.w3.org/2004/02/skos/core#",
    "sm"      "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd"     "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreements/",
   :rdfa/prefix "fibo-fnd-agr-agr",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreements/",
   :rdfs/label "Agreements Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreement.rdf version of the ontology was modified to eliminate duplication of concepts in LCC."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreement.rdf version of the ontology was modified per the issue resolutions identified in the FIBO FND 1.1 RTF report and in https://spec.edmcouncil.org/fibo/ontology/FND/1.1/AboutFND-1.1/."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreement.rdf version of the ontology was modified per FIBO 2.0 RFC to add general concepts including obligor, obligee, and beneficiary in support of other FIBO domain areas."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreement.rdf version of the ontology was modified per the issue resolutions identified in the FIBO FND 1.0 FTF report and in https://spec.edmcouncil.org/fibo/ontology/FND/1.0/AboutFND-1.0/."
    "The http://www.omg.org/spec/FIBO/Foundations/20130601/Agreements/Agreements.owl version of the ontology was revised in advance of the September 2013 New Brunswick, NJ meeting, as follows:\n   (1) to use slash style URI/IRIss (also called 303 URIs, vs. hash style) as required to support server side processing \n   (2) to use version-independent IRIs for all definitions internally as opposed to version-specific IRIs\n   (3) to change the file suffix from .owl to .rdf to increase usability in RDF tools\n   (4) to use 4-level abbreviations and corresponding namespace prefixes for all FIBO ontologies, reflecting a family/specification/module/ontology structure\n   (5) to incorporate changes to the specification metadata to support documentation at the family, specification, module, and ontology level, similar to the abbreviations.\n   (6) to revise a few of the definitions based on more formal sources."],
   :sm/contentLanguage "http://www.w3.org/standards/techs/owl#w3c_all",
   :sm/copyright ["Copyright (c) 2013-2020 Object Management Group, Inc."
                  "Copyright (c) 2013-2020 EDM Council, Inc."],
   :sm/dependsOn
   ["https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/"
    "https://www.omg.org/spec/LCC/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/"],
   :sm/fileAbbreviation "fibo-fnd-agr-agr",
   :sm/filename "Agreements.rdf"})

(def Agreement
  "a negotiated understanding between two or more parties, reflecting the offer and acceptance of commitments on the part of either party"
  {:db/ident :fibo-fnd-agr-agr/Agreement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "agreement"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/confers,
                      :owl/someValuesFrom :fibo-fnd-agr-agr/Commitment,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 2,
                      :owl/onClass    :fibo-fnd-pty-pty/PartyInRole,
                      :owl/onProperty :fibo-fnd-pty-pty/hasPartyInRole,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "a negotiated understanding between two or more parties, reflecting the offer and acceptance of commitments on the part of either party"})

(def Beneficiary
  "a party that receives some benefit or advantage or profits from something"
  {:db/ident :fibo-fnd-agr-agr/Beneficiary,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreements/",
   :rdfs/label "beneficiary",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-pty-rl/isPlayedBy,
     :owl/someValuesFrom {:owl/minQualifiedCardinality 0,
                          :owl/onClass    :fibo-fnd-agr-agr/Agreement,
                          :owl/onProperty :fibo-fnd-pty-pty/isAPartyTo,
                          :rdf/type       :owl/Restriction},
     :rdf/type           :owl/Restriction}
    :fibo-fnd-pty-pty/PartyInRole],
   :skos/definition
   "a party that receives some benefit or advantage or profits from something"})

(def Commitment
  "A legal construct which represents the undertaking on the part of some party to act or refrain from acting in some manner."
  {:db/ident :fibo-fnd-agr-agr/Commitment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreements/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "commitment"},
   :skos/definition
   "A legal construct which represents the undertaking on the part of some party to act or refrain from acting in some manner.",
   :skos/editorialNote
   "The undertaking by some party to act or refrain from acting results in an obligation on the part of that party, and usually results in the existence of some corresponding right on the party of some other party, in the event that the commitment is to such party. Thus Obligations and Rights are considered as reciprocal aspects of this Commitment concept."})

(def CommitmentAtLarge
  "a commitment made by some party without direct involvement from the potential beneficiaries of that commitment"
  {:db/ident :fibo-fnd-agr-agr/CommitmentAtLarge,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreements/",
   :rdfs/label "commitment at large",
   :rdfs/subClassOf :fibo-fnd-agr-agr/UnilateralCommitment,
   :skos/definition
   "a commitment made by some party without direct involvement from the potential beneficiaries of that commitment",
   :skos/scopeNote
   "Forms the basis for negotiable securities including transferable contracts and potentially other types of agreement such as software licenses."})

(def IndividualUnilateralCommitment
  "a commitment made by some party unilaterally to another specific party"
  {:db/ident :fibo-fnd-agr-agr/IndividualUnilateralCommitment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreements/",
   :rdfs/label "individual unilateral commitment",
   :rdfs/subClassOf :fibo-fnd-agr-agr/UnilateralCommitment,
   :skos/definition
   "a commitment made by some party unilaterally to another specific party"})

(def MutualAgreement
  "an agreement between two or more specific named parties. The rights and obligations pertaining to either party cannot be transferred to another party without prior agreement"
  {:db/ident :fibo-fnd-agr-agr/MutualAgreement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreements/",
   :rdfs/label "mutual agreement",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/confers,
                      :owl/someValuesFrom :fibo-fnd-agr-agr/MutualCommitment,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-agr-agr/Agreement],
   :skos/definition
   "an agreement between two or more specific named parties. The rights and obligations pertaining to either party cannot be transferred to another party without prior agreement",
   :skos/scopeNote
   "This may or may not be a contractual agreement - it also forms the basis of REA transaction models which may or may not refer to contractual agreements, since REA is also used to frame transactions internal to an individual organization."})

(def MutualCommitment
  "A commitment between two or more parties"
  {:db/ident :fibo-fnd-agr-agr/MutualCommitment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreements/",
   :rdfs/label "mutual commitment",
   :rdfs/subClassOf :fibo-fnd-agr-agr/Commitment,
   :skos/definition "A commitment between two or more parties"})

(def Obligee
  "a party to whom some commitment or obligation is owed, either legally or per the terms of an agreement"
  {:db/ident :fibo-fnd-agr-agr/Obligee,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreements/",
   :rdfs/label "obligee",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-pty-rl/isPlayedBy,
     :owl/someValuesFrom {:owl/minQualifiedCardinality 0,
                          :owl/onClass    :fibo-fnd-agr-agr/Agreement,
                          :owl/onProperty :fibo-fnd-pty-pty/isAPartyTo,
                          :rdf/type       :owl/Restriction},
     :rdf/type           :owl/Restriction}
    :fibo-fnd-pty-pty/PartyInRole],
   :skos/definition
   "a party to whom some commitment or obligation is owed, either legally or per the terms of an agreement"})

(def Obligor
  "a party that is bound legally or by agreement to repay a debt, make a payment, do something, or refrain from doing something"
  {:db/ident :fibo-fnd-agr-agr/Obligor,
   :fibo-fnd-utl-av/synonym ["obligator" "obligated party"],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreements/",
   :rdfs/label "obligor",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-pty-rl/isPlayedBy,
     :owl/someValuesFrom {:owl/minQualifiedCardinality 0,
                          :owl/onClass    :fibo-fnd-agr-agr/Agreement,
                          :owl/onProperty :fibo-fnd-pty-pty/isAPartyTo,
                          :rdf/type       :owl/Restriction},
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-agr-agr/hasObligation,
     :owl/someValuesFrom :fibo-fnd-agr-agr/Commitment,
     :rdf/type           :owl/Restriction}
    :fibo-fnd-pty-pty/PartyInRole],
   :skos/definition
   "a party that is bound legally or by agreement to repay a debt, make a payment, do something, or refrain from doing something"})

(def UnilateralCommitment
  "A commitment made by one party without reference to the party to which the commitment is made."
  {:db/ident :fibo-fnd-agr-agr/UnilateralCommitment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreements/",
   :rdfs/label "unilateral commitment",
   :rdfs/subClassOf :fibo-fnd-agr-agr/Commitment,
   :skos/definition
   "A commitment made by one party without reference to the party to which the commitment is made."})

(def hasObligation
  "identifies a duty or obligation that a given party has taken on"
  {:db/ident :fibo-fnd-agr-agr/hasObligation,
   :owl/inverseOf :fibo-fnd-agr-agr/isObligationOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-agr-agr/Obligor,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreements/",
   :rdfs/label "has obligation",
   :rdfs/subPropertyOf :lcc-lr/has,
   :skos/definition
   "identifies a duty or obligation that a given party has taken on"})

(def isObligationOf
  "identifies a party that has a given obligation"
  {:db/ident :fibo-fnd-agr-agr/isObligationOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreements/",
   :rdfs/label "is obligation of",
   :rdfs/range :fibo-fnd-agr-agr/Obligor,
   :skos/definition "identifies a party that has a given obligation"})