(ns net.wikipunk.rdf.fibo-fnd-law-lcap
  {:cmns-av/copyright
   #{"Copyright (c) 2013-2024 EDM Council, Inc."
     "Copyright (c) 2013-2024 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Law/LegalCapacity/",
   :dcterms/abstract
   "This ontology defines high-level legal concepts related to legal responsibilities. The ontology defines things which are conferred upon some entity by some legal instrument, and elaborates this into a number of specific capacities, responsibilities and powers, each of which forms the basis for many of the concepts used elsewhere in FIBO in defining legal personhood, executive powers and the like.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-doc" "https://www.omg.org/spec/Commons/Documents/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
    "cmns-pts" "https://www.omg.org/spec/Commons/PartiesAndSituations/",
    "cmns-rlcmp" "https://www.omg.org/spec/Commons/RolesAndCompositions/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-agr-agr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreements/",
    "fibo-fnd-agr-ctr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
    "fibo-fnd-gao-obj"
    "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/Objectives/",
    "fibo-fnd-law-cor"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCore/",
    "fibo-fnd-law-jur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/Jurisdiction/",
    "fibo-fnd-law-lcap"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Documents/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Law/LegalCore/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/GoalsAndObjectives/Objectives/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Agreements/Agreements/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Law/Jurisdiction/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Law/LegalCapacity/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fnd-law-lcap",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/",
   :rdfs/label "Legal Capacity Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity.rdf version of the ontology was modified to eliminate duplication with concepts in LCC as well as minimum cardinality restrictions of 1."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity.rdf version of the ontology was modified per the FIBO FBC RFC, namely to add concepts to support license, licensee, and licensor to the ontology."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity.rdf version of the ontology was modified per the FIBO 1.1 RTF to add the concept of litigation capacity to the ontology."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity.rdf version of the ontology was modified to replace concepts from several FIBO FND ontologies with their counterparts added to the Commons Ontology Library (Commons) v1.1."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity.rdf version of this ontology was modified to replace autonomous agent with independent party in property declarations."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity.rdf version of the ontology was modified to add concepts related to policies, and adjust the hierarchy to better support regulatory requirements."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity.rdf version of the ontology was modified to move the property, 'is conferred on' from Relations to the Legal Capacity ontology and to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity.rdf version of this ontology was modified to introduce 'right' as a kind of legal construct, move legal right, contractual right, and contingent right under right as siblings, and update their definitions as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity.rdf version of this ontology was modified to eliminate an unnecessary link."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity.rdf version of the ontology was modified to replace additional concepts from several FIBO FND ontologies with their counterparts added to the Commons Ontology Library (Commons) v1.1."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity.rdf version of this ontology was modified to reflect the merge of Goals and Objectives."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity.rdf version of the ontology was modified to eliminate deprecated elements."
     "The http://www.omg.org/spec/FIBO/Foundations/20130601/Law/LegalCapacity.owl version of the ontology was revised in advance of the September 2013 New Brunswick, NJ meeting, as follows:\n\t(1) to use slash style URI/IRIss (also called 303 URIs, vs. hash style) as required to support server side processing \n\t(2) to use version-independent IRIs for all definitions internally as opposed to version-specific IRIs\n\t(3) to change the file suffix from .owl to .rdf to increase usability in RDF tools\n\t(4) to use 4-level abbreviations and corresponding namespace prefixes for all FIBO ontologies, reflecting a family/specification/module/ontology structure\n\t(5) to incorporate changes to the specification metadata to support documentation at the family, specification, module, and ontology level, similar to the abbreviations."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity.rdf version of the ontology was modified per the issue resolutions identified in the FIBO FND 1.0 FTF report."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity.rdf version of the ontology was modified per the FIBO 2.0 RFC integrate contingent rights and obligations."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/"})

(def Claim
  {:cmns-av/explanatoryNote
   "Claims arise from the existence of a formal commitment between the parties or as implicitly agreed upon through the operation of law or constitution.",
   :db/ident :fibo-fnd-law-lcap/Claim,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "claim"},
   :rdfs/subClassOf :fibo-fnd-law-lcap/LegalConstruct,
   :skos/definition
   "demand or assertion made by one party on another, based on facts that, taken together, give rise to a legally enforceable right or judicial action"})

(def ContingentObligation
  {:db/ident :fibo-fnd-law-lcap/ContingentObligation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "contingent obligation"},
   :rdfs/subClassOf #{:fibo-fnd-law-lcap/Duty
                      {:owl/onProperty     :fibo-fnd-agr-agr/isObligationOf,
                       :owl/someValuesFrom :fibo-fnd-agr-agr/Obligor,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :fibo-fnd-law-lcap/isImpliedBy,
                       :owl/someValuesFrom :fibo-fnd-law-lcap/ContingentRight,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "obligation that depends on a future event or the performance of an action"})

(def ContingentRight
  {:cmns-av/explanatoryNote
   "Contingent means that the interest, claim, or right is conditional, realized only when and if something occurs.",
   :db/ident :fibo-fnd-law-lcap/ContingentRight,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "contingent right"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-fnd-law-lcap/isConferredOn,
      :owl/someValuesFrom :cmns-pts/Party,
      :rdf/type           :owl/Restriction} :fibo-fnd-law-lcap/Right
     {:owl/onProperty     :fibo-fnd-law-lcap/implies,
      :owl/someValuesFrom :fibo-fnd-law-lcap/ContingentObligation,
      :rdf/type           :owl/Restriction}},
   :skos/definition
   "right that depends on a future event or the performance of an action"})

(def ContractualCapability
  {:db/ident :fibo-fnd-law-lcap/ContractualCapability,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "contractual capability"},
   :rdfs/subClassOf :fibo-fnd-law-lcap/LegalCapacity,
   :skos/definition "the capacity to enter into legally binding contracts",
   :skos/editorialNote
   "This is the capacity which defines Contractually Capable Entity (sometimes labeled as 'Legal Entity') as distinct from 'Legal Person'. In the latter case the liabilities incurred in the contract accrue also to the Legal Person. In the case of contractual capability, the entity has the authority to enter into contracts, whether or not the liabilities accrue to that same entity (which they do if it is also a Legal Person). For Legal Entities which are not Legal Persons, the liability unwinds to some legal person within the structure of the entity, for example a General Partner or a Trustee."})

(def ContractualObligation
  {:db/ident :fibo-fnd-law-lcap/ContractualObligation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/"},
   :rdfs/label "contractual obligation",
   :rdfs/subClassOf #{{:owl/allValuesFrom :fibo-fnd-law-lcap/ContractualRight,
                       :owl/onProperty    :fibo-fnd-law-lcap/isImpliedBy,
                       :rdf/type          :owl/Restriction}
                      :fibo-fnd-law-lcap/LegalObligation
                      {:owl/onProperty     :fibo-fnd-rel-rel/isConferredBy,
                       :owl/someValuesFrom :fibo-fnd-agr-ctr/Contract,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "obligation or duty that is specified in and imposed by a contract"})

(def ContractualOption
  {:db/ident :fibo-fnd-law-lcap/ContractualOption,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/"},
   :rdfs/label "contractual option",
   :rdfs/subClassOf :fibo-fnd-law-lcap/ContractualRight,
   :skos/definition
   "contractual right that may be exercised at some point in the future, such as an option to extend a contract, or other available but not obligatory rights as defined in the contract"})

(def ContractualRight
  {:db/ident :fibo-fnd-law-lcap/ContractualRight,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/"},
   :rdfs/label "contractual right",
   :rdfs/subClassOf #{{:owl/onProperty :fibo-fnd-law-lcap/implies,
                       :owl/someValuesFrom
                       :fibo-fnd-law-lcap/ContractualObligation,
                       :rdf/type :owl/Restriction} :fibo-fnd-law-lcap/Right
                      {:owl/onProperty     :fibo-fnd-rel-rel/isConferredBy,
                       :owl/someValuesFrom :fibo-fnd-agr-ctr/Contract,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "power, privilege, demand, or claim possessed by some party that is conferred by contract"})

(def DelegatedLegalAuthority
  {:cmns-av/explanatoryNote
   "This is always accompanied by an equal responsibility for one's actions or a failure to act.",
   :db/ident :fibo-fnd-law-lcap/DelegatedLegalAuthority,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/"},
   :rdfs/label "delegated legal authority",
   :rdfs/subClassOf :fibo-fnd-law-lcap/LegalCapacity,
   :skos/definition
   "institutionalized and legal power inherent in a particular job, function, or position that is meant to enable its holder to successfully carry out his or her responsibilities, where such power has been delegated through some formal means",
   :skos/scopeNote
   "This specifically means the authority to make legally binding commitments."})

(def Duty
  {:db/ident :fibo-fnd-law-lcap/Duty,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/"},
   :rdfs/label "duty",
   :rdfs/subClassOf :fibo-fnd-law-lcap/LegalConstruct,
   :skos/definition
   "some obligation which exists and is imposed on some individual",
   :skos/editorialNote
   "This can also be thought of as an obligation - not in the sense in which an obligation and a right are the converse aspects of one another, but in and of itself, independent of the perspective from which it is considered. Examples include statutory obligations, reporting obligations and so on."})

(def LegalCapacity
  {:db/ident :fibo-fnd-law-lcap/LegalCapacity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/"},
   :rdfs/label "legal capacity",
   :rdfs/subClassOf :fibo-fnd-law-lcap/LegalConstruct,
   :skos/definition
   "the capability to carry out certain actions or to have certain rights together with the resources to do so"})

(def LegalConstruct
  {:db/ident :fibo-fnd-law-lcap/LegalConstruct,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/"},
   :rdfs/label "legal construct",
   :rdfs/subClassOf #{{:owl/minQualifiedCardinality 0,
                       :owl/onClass    :cmns-pts/Party,
                       :owl/onProperty :fibo-fnd-law-lcap/isConferredOn,
                       :rdf/type       :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    {:owl/unionOf
                                        [:fibo-fnd-agr-ctr/Contract
                                         :fibo-fnd-law-cor/Constitution
                                         :fibo-fnd-law-cor/Law],
                                        :rdf/type :owl/Class},
                       :owl/onProperty :fibo-fnd-rel-rel/isConferredBy,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "something which is conferred by way of law or contract, such as a right",
   :skos/editorialNote
   "Obligations are an aspect of this category of thing, as are rights."})

(def LegalObligation
  {:db/ident :fibo-fnd-law-lcap/LegalObligation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/"},
   :rdfs/label "legal obligation",
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-fnd-rel-rel/isMandatedBy,
      :owl/someValuesFrom {:owl/unionOf [:fibo-fnd-agr-ctr/Contract
                                         :fibo-fnd-law-jur/StatuteLaw
                                         :fibo-fnd-law-lcap/Regulation],
                           :rdf/type    :owl/Class},
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-fnd-rel-rel/isConferredBy,
      :owl/someValuesFrom {:owl/unionOf [:fibo-fnd-agr-ctr/Contract
                                         :fibo-fnd-law-jur/StatuteLaw
                                         :fibo-fnd-law-lcap/Regulation],
                           :rdf/type    :owl/Class},
      :rdf/type           :owl/Restriction} :fibo-fnd-law-lcap/Duty
     {:owl/onProperty     :cmns-cxtdsg/isApplicableIn,
      :owl/someValuesFrom :fibo-fnd-law-jur/Jurisdiction,
      :rdf/type           :owl/Restriction}},
   :skos/definition "an obligation or duty that is enforceable by a court"})

(def LegalRight
  {:cmns-av/explanatoryNote
   "Every legal right that an individual possesses relates to a corresponding legal duty imposed on another and is recognized and delimited by law for the purpose of securing it. A legal right, if challenged, may be supported in court as recognizable and enforceable in law, statutes, regulations, or other legislative actions.",
   :db/ident :fibo-fnd-law-lcap/LegalRight,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/"},
   :rdfs/label "legal right",
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fnd-law-lcap/implies,
                       :owl/someValuesFrom :fibo-fnd-law-lcap/LegalObligation,
                       :rdf/type           :owl/Restriction}
                      :fibo-fnd-law-lcap/Right
                      {:owl/onProperty     :fibo-fnd-rel-rel/isConferredBy,
                       :owl/someValuesFrom :fibo-fnd-law-jur/StatuteLaw,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :cmns-cxtdsg/isApplicableIn,
                       :owl/someValuesFrom :fibo-fnd-law-jur/Jurisdiction,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "power, privilege, demand, or claim possessed by some party by virtue of law"})

(def LiabilityCapacity
  {:db/ident :fibo-fnd-law-lcap/LiabilityCapacity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "liability capacity"},
   :rdfs/subClassOf :fibo-fnd-law-lcap/LegalCapacity,
   :skos/definition "the ability to be sued at law",
   :skos/editorialNote
   "Note that for the purposes of this model, this is distinct from culpability (the ability to commit criminal acts). That would be a separate and analogous term but with grounding in criminal rather than civil law."})

(def License
  {:cmns-av/adaptedFrom
   {:rdf/value
    "Barron's Dictionary of Business and Economics Terms, Fifth Edition, 2012"},
   :cmns-av/explanatoryNote
   "Note that in some cases, a license may also be considered an agreement or contract, depending on the specifics of the license and jurisdiction.",
   :db/ident :fibo-fnd-law-lcap/License,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/"},
   :rdfs/label "license",
   :rdfs/subClassOf #{{:owl/onClass    :cmns-dt/DatePeriod,
                       :owl/onProperty :cmns-pts/holdsDuring,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction} :cmns-doc/LegalDocument
                      {:owl/onProperty     :fibo-fnd-rel-rel/confers,
                       :owl/someValuesFrom :fibo-fnd-law-lcap/LegalCapacity,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :fibo-fnd-rel-rel/isIssuedBy,
                       :owl/someValuesFrom :fibo-fnd-law-lcap/Licensor,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :cmns-pts/hasPartyRole,
                       :owl/someValuesFrom :fibo-fnd-law-lcap/Licensee,
                       :rdf/type           :owl/Restriction}},
   :skos/definition "grant of permission needed to do something"})

(def LicenseIdentifier
  {:db/ident :fibo-fnd-law-lcap/LicenseIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/"},
   :rdfs/label "license identifier",
   :rdfs/subClassOf #{:cmns-id/Identifier
                      {:owl/onClass    :fibo-fnd-law-lcap/License,
                       :owl/onProperty :cmns-id/identifies,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}},
   :skos/definition "an identifier associated with a license"})

(def Licensee
  {:cmns-av/adaptedFrom
   {:rdf/value
    "Barron's Dictionary of Business and Economics Terms, Fifth Edition, 2012"},
   :db/ident :fibo-fnd-law-lcap/Licensee,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/"},
   :rdfs/label "licensee",
   :rdfs/subClassOf
   #{:cmns-pts/PartyRole
     {:owl/onProperty     :cmns-rlcmp/isPlayedBy,
      :owl/someValuesFrom {:owl/onProperty     :cmns-pts/isAPartyTo,
                           :owl/someValuesFrom :fibo-fnd-law-lcap/License,
                           :rdf/type           :owl/Restriction},
      :rdf/type           :owl/Restriction}},
   :skos/definition "a party to whom a license has been granted"})

(def Licensor
  {:cmns-av/adaptedFrom
   {:rdf/value
    "Barron's Dictionary of Business and Economics Terms, Fifth Edition, 2012"},
   :db/ident :fibo-fnd-law-lcap/Licensor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/"},
   :rdfs/label "licensor",
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-fnd-rel-rel/issues,
      :owl/someValuesFrom :fibo-fnd-law-lcap/License,
      :rdf/type           :owl/Restriction} :cmns-pts/PartyRole
     {:owl/onProperty     :fibo-fnd-law-lcap/licenses,
      :owl/someValuesFrom :owl/Thing,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :cmns-rlcmp/isPlayedBy,
      :owl/someValuesFrom {:owl/onProperty     :cmns-pts/isAPartyTo,
                           :owl/someValuesFrom :fibo-fnd-law-lcap/License,
                           :rdf/type           :owl/Restriction},
      :rdf/type           :owl/Restriction}},
   :skos/definition "a party who grants a license"})

(def LitigationCapacity
  {:db/ident :fibo-fnd-law-lcap/LitigationCapacity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/"},
   :rdfs/label "litigation capacity",
   :rdfs/subClassOf :fibo-fnd-law-lcap/LegalCapacity,
   :skos/definition "the legal capacity to pursue a litigation action in law"})

(def Policy
  {:db/ident :fibo-fnd-law-lcap/Policy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/"},
   :rdfs/label "policy",
   :rdfs/subClassOf #{{:owl/minQualifiedCardinality 0,
                       :owl/onClass    {:owl/unionOf
                                        [:fibo-fnd-law-lcap/LegalConstruct
                                         :fibo-fnd-gao-obj/Goal
                                         :fibo-fnd-gao-obj/Objective],
                                        :rdf/type :owl/Class},
                       :owl/onProperty :fibo-fnd-law-lcap/implements,
                       :rdf/type       :owl/Restriction}
                      {:owl/onProperty     :fibo-fnd-rel-rel/governs,
                       :owl/someValuesFrom :fibo-fnd-gao-obj/Strategy,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "system of principles, rules and guidelines, adopted by an organization to guide decision making with respect to particular situations and implemented via procedures or protocols to achieve stated goals"})

(def Regulation
  {:cmns-av/explanatoryNote
   "Many government agencies issue regulations to administer laws.",
   :db/ident :fibo-fnd-law-lcap/Regulation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/"},
   :rdfs/label "regulation",
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fnd-rel-rel/isConferredBy,
                       :owl/someValuesFrom :fibo-fnd-law-cor/Law,
                       :rdf/type           :owl/Restriction}
                      :fibo-fnd-law-lcap/LegalConstruct
                      {:owl/onProperty     :cmns-cxtdsg/isApplicableIn,
                       :owl/someValuesFrom :fibo-fnd-law-jur/Jurisdiction,
                       :rdf/type           :owl/Restriction}},
   :skos/definition "a rule used to carry out a law"})

(def ReportingPolicy
  {:db/ident :fibo-fnd-law-lcap/ReportingPolicy,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/"},
   :rdfs/label "reporting policy",
   :rdfs/subClassOf :fibo-fnd-law-lcap/Policy,
   :skos/definition
   "policy specifying principles, rules and/or guidelines regarding some aspect of reporting",
   :skos/example
   "For example a policy for how frequently a given kind of report is produced."})

(def Right
  {:cmns-av/explanatoryNote
   "Rights dominate modern understandings of what actions are permissible and which institutions are just. Rights structure the form of governments, the content of laws, and the shape of morality as many now see it. To accept a set of rights is to approve a distribution of freedom and authority, and so to endorse a certain view of what may, must, and must not be done. According to the Hohfeldian incidents (Wesley Hohfeld (1879-1918)), rights are complex and consist of four major components: privilege, claim, power, and immunity.",
   :db/ident :fibo-fnd-law-lcap/Right,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/"},
   :rdfs/label "right",
   :rdfs/seeAlso {:xsd/anyURI "https://plato.stanford.edu/entries/rights/"},
   :rdfs/subClassOf :fibo-fnd-law-lcap/LegalConstruct,
   :skos/definition
   "entitlement (not) to perform certain actions, or (not) to be in certain states; or entitlement that others (not) perform certain actions or (not) be in certain states",
   :skos/example
   "Examples include contractual rights, legal rights, human rights, political rights, and so forth."})

(def SignatoryCapacity
  {:db/ident :fibo-fnd-law-lcap/SignatoryCapacity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/"},
   :rdfs/label "signatory capacity",
   :rdfs/subClassOf :fibo-fnd-law-lcap/LegalCapacity,
   :skos/definition
   "the capacity of some natural person to sign agreements on the part of some organization or legal person"})

(def hasCapacity
  {:db/ident :fibo-fnd-law-lcap/hasCapacity,
   :owl/inverseOf :fibo-fnd-law-lcap/isCapacityOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :cmns-pts/Party,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/"},
   :rdfs/label "has capacity",
   :rdfs/range :fibo-fnd-law-lcap/LegalCapacity,
   :skos/definition
   "identifies an individual or organization that has some ability and availability to carry out certain actions, or has certain rights or obligations"})

(def implements
  {:db/ident :fibo-fnd-law-lcap/implements,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/"},
   :rdfs/label "implements",
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/involves,
   :skos/definition "carries out or puts into effect, fulfills"})

(def implies
  {:db/ident :fibo-fnd-law-lcap/implies,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/"},
   :rdfs/label "implies",
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/involves,
   :skos/definition
   "strongly suggests or involves as a logical consequence based on some set of observations, facts, or events"})

(def isCapacityOf
  {:db/ident :fibo-fnd-law-lcap/isCapacityOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-law-lcap/LegalCapacity,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/"},
   :rdfs/label "is capacity of",
   :rdfs/range :cmns-pts/Party,
   :rdfs/subPropertyOf :fibo-fnd-law-lcap/isConferredOn,
   :skos/definition
   "identifies an individual or organization on which a given legal capacity has been conferred",
   :skos/scopeNote
   "This includes capacities specific to duties at law (such as those for corporate officers) as well as the ability or capacity to incur liability."})

(def isConferredOn
  {:db/ident :fibo-fnd-law-lcap/isConferredOn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/"},
   :rdfs/label "is conferred on",
   :rdfs/range :cmns-pts/Party,
   :skos/definition
   "indicates a party to which some benefit or right has been granted"})

(def isImplementedBy
  {:db/ident :fibo-fnd-law-lcap/isImplementedBy,
   :owl/inverseOf :fibo-fnd-law-lcap/implements,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/"},
   :rdfs/label "is implemented by",
   :skos/definition
   "indicates something that is carried out, incorporated or put into effect by",
   :skos/example
   "A regulation may be implemented by or more corporate policies. Such policies, in turn, may be implemented via various systems, executed by humans and/or automation, that can be audited for compliance purposes."})

(def isImpliedBy
  {:db/ident :fibo-fnd-law-lcap/isImpliedBy,
   :owl/inverseOf :fibo-fnd-law-lcap/implies,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/"},
   :rdfs/label "is implied by",
   :skos/definition
   "indicates something that is strongly suggested by something else, such as a logical consequence based on some set of observations, facts, or events"})

(def isLicensedBy
  {:db/ident :fibo-fnd-law-lcap/isLicensedBy,
   :owl/inverseOf :fibo-fnd-law-lcap/licenses,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/"},
   :rdfs/label "is licensed by",
   :rdfs/range :cmns-pts/PartyRole,
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/isGovernedBy,
   :skos/definition
   "indicates the party that has issued a particular license to some other party"})

(def licenses
  {:db/ident :fibo-fnd-law-lcap/licenses,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :cmns-pts/PartyRole,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/"},
   :rdfs/label "licenses",
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/governs,
   :skos/definition
   "issues a license required in order to perform some task, provide some service, exercise some privilege, or pursue some line of business or occupation to some party"})

(def urn:uuid:a4ea0dd5-4900-57e4-996a-d411405996c5
  {:cmns-av/copyright
   #{"Copyright (c) 2013-2024 EDM Council, Inc."
     "Copyright (c) 2013-2024 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology defines high-level legal concepts related to legal responsibilities. The ontology defines things which are conferred upon some entity by some legal instrument, and elaborates this into a number of specific capacities, responsibilities and powers, each of which forms the basis for many of the concepts used elsewhere in FIBO in defining legal personhood, executive powers and the like.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Documents/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Law/LegalCore/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/GoalsAndObjectives/Objectives/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Agreements/Agreements/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Law/Jurisdiction/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Law/LegalCapacity/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Legal Capacity Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity.rdf version of the ontology was modified to eliminate duplication with concepts in LCC as well as minimum cardinality restrictions of 1."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity.rdf version of the ontology was modified per the FIBO FBC RFC, namely to add concepts to support license, licensee, and licensor to the ontology."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity.rdf version of the ontology was modified per the FIBO 1.1 RTF to add the concept of litigation capacity to the ontology."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity.rdf version of the ontology was modified to replace concepts from several FIBO FND ontologies with their counterparts added to the Commons Ontology Library (Commons) v1.1."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity.rdf version of this ontology was modified to replace autonomous agent with independent party in property declarations."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity.rdf version of the ontology was modified to add concepts related to policies, and adjust the hierarchy to better support regulatory requirements."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity.rdf version of the ontology was modified to move the property, 'is conferred on' from Relations to the Legal Capacity ontology and to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity.rdf version of this ontology was modified to introduce 'right' as a kind of legal construct, move legal right, contractual right, and contingent right under right as siblings, and update their definitions as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity.rdf version of this ontology was modified to eliminate an unnecessary link."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity.rdf version of the ontology was modified to replace additional concepts from several FIBO FND ontologies with their counterparts added to the Commons Ontology Library (Commons) v1.1."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity.rdf version of this ontology was modified to reflect the merge of Goals and Objectives."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity.rdf version of the ontology was modified to eliminate deprecated elements."
     "The http://www.omg.org/spec/FIBO/Foundations/20130601/Law/LegalCapacity.owl version of the ontology was revised in advance of the September 2013 New Brunswick, NJ meeting, as follows:\n\t(1) to use slash style URI/IRIss (also called 303 URIs, vs. hash style) as required to support server side processing \n\t(2) to use version-independent IRIs for all definitions internally as opposed to version-specific IRIs\n\t(3) to change the file suffix from .owl to .rdf to increase usability in RDF tools\n\t(4) to use 4-level abbreviations and corresponding namespace prefixes for all FIBO ontologies, reflecting a family/specification/module/ontology structure\n\t(5) to incorporate changes to the specification metadata to support documentation at the family, specification, module, and ontology level, similar to the abbreviations."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity.rdf version of the ontology was modified per the issue resolutions identified in the FIBO FND 1.0 FTF report."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity.rdf version of the ontology was modified per the FIBO 2.0 RFC integrate contingent rights and obligations."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/"})