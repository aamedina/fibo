(ns net.wikipunk.rdf.fibo-be-le-lp
  {:cmns-av/copyright
   #{"Copyright (c) 2013-2024 EDM Council, Inc."
     "Copyright (c) 2013-2024 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/LegalEntities/LegalPersons/",
   :dcterms/abstract
   "This ontology defines legal personhood concepts. A legal person as defined here is any natural person or organization which is capable of accruing liability on its own part.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "cmns-pts" "https://www.omg.org/spec/Commons/PartiesAndSituations/",
    "cmns-rlcmp" "https://www.omg.org/spec/Commons/RolesAndCompositions/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-le-lp"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/",
    "fibo-fnd-aap-ppl"
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
    "fibo-fnd-agr-agr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreements/",
    "fibo-fnd-agr-ctr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
    "fibo-fnd-gao-obj"
    "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/Objectives/",
    "fibo-fnd-law-jur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/Jurisdiction/",
    "fibo-fnd-law-lcap"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/",
    "fibo-fnd-org-fm"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations/",
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
     {:xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Organizations/FormalOrganizations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Agreements/Agreements/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/AgentsAndPeople/People/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Law/Jurisdiction/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Law/LegalCapacity/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/GoalsAndObjectives/Objectives/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Agreements/Contracts/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/LegalEntities/LegalPersons/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-be-le-lp",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/",
   :rdfs/label "Legal Persons Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons.rdf version of the ontology was modified to add a French label to special purpose vehicle."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons.rdf version of this ontology was modified to make legal person a subclass of independent party rather than autonomous agent."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons.rdf version of this ontology was modified per the FIBO 2.0 RFC to normalize restrictions on business license."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons.rdf version of this ontology was modified to move the concept of a signatory and related properties to the executives ontology for better semantic integration."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons.rdf version of this ontology was modified to move business objective to FND to enable higher level reuse."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons.rdf version of the ontology was modified to move the property, 'is conferred on' from Relations to the Legal Capacity ontology."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons.rdf version of this ontology was modified to eliminate deprecated elements."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons.rdf version of this ontology was modified to eliminate references to external dictionary sites that no longer resolve."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons.rdf version of this ontology was modified per the issue resolutions identified in the FIBO BE 1.0 FTF report."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons.rdf version of this ontology was modified to clarify the definition of legal person."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons.rdf version of this ontology was modified to incorporate the concept of employment, required to support regulatory reporting, and add the concept of a special purpose vehicle."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons.rdf version of this ontology was modified to add the definition of a variable interest entity and eliminate or loosen restrictions that are unnecessarily burdensome on FIBO users, such as that a legal person has liability capacity, which is true by definition but would never be realized when mapped to any data source."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons.rdf version of this ontology was modified to rationalize natural person and legally capable person in a new concept, namely legally competent natural person, simplify / merge the legal person and formal organization class hierarchies, and correct certain definitions, including power of attorney."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons.rdf version of this ontology was modified to augment the definition of a contract party to be a legal person."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons.rdf version of this ontology was modified to address text formatting hygiene issues."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons.rdf version of this ontology was modified to fix spelling errors."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons.rdf version of the ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/"})

(def BusinessEntity
  {:cmns-av/explanatoryNote
   "There are many types of business entities defined in the legal systems of various countries. These include corporations, cooperatives, partnerships, sole proprietorships, sole traders, limited liability companies, certain trusts and trust companies, and so forth. The rules vary by country and by state or province. Some of the more widely recognized types in the US, UK, and EU are defined in FIBO, by region. However, the regulations governing particular types of entity, even those described as roughly equivalent, differ from jurisdiction to jurisdiction.",
   :db/ident :fibo-be-le-lp/BusinessEntity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/"},
   :rdfs/label "business entity",
   :rdfs/subClassOf #{{:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-fnd-gao-obj/BusinessObjective,
                       :owl/onProperty :fibo-fnd-gao-obj/hasObjective,
                       :rdf/type       :owl/Restriction}
                      :fibo-fnd-org-fm/FormalOrganization
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-fnd-law-lcap/License,
                       :owl/onProperty :fibo-fnd-rel-rel/holds,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "entity that is formed and administered as per commercial law in order to engage in business activities"})

(def BusinessLicense
  {:db/ident :fibo-be-le-lp/BusinessLicense,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/"},
   :rdfs/label "business license",
   :rdfs/subClassOf #{:fibo-fnd-law-lcap/License
                      {:owl/onProperty     :fibo-be-le-lp/isRecognizedIn,
                       :owl/someValuesFrom :fibo-fnd-law-jur/Jurisdiction,
                       :rdf/type           :owl/Restriction}
                      {:owl/onClass    :fibo-be-le-lp/BusinessEntity,
                       :owl/onProperty :cmns-cxtdsg/appliesTo,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "license that allows the holder to conduct business or carry out a specific profession within some jurisdiction for some period of time"})

(def CharteredLegalPerson
  {:cmns-av/explanatoryNote
   "In a monarchy or principality, the monarch typically vests the power to create such bodies, in an entity called (for example) the Privy Council.",
   :db/ident :fibo-be-le-lp/CharteredLegalPerson,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/"},
   :rdfs/label "chartered legal person",
   :rdfs/subClassOf :fibo-be-le-lp/LegalEntity,
   :skos/definition "a legal person created by a royal charter or decree",
   :skos/example
   "Anything with 'Royal Institute' in the name. Also universities are generally set up by royal charter in a monarchy or principality, (often pre-dating any Privy Council i.e. directly be the monarch in the case of older universities). The Bank of England and the British Broadcasting Council (BBC) are also incorporated through Royal Charter."})

(def LegalEntity
  {:cmns-av/adaptedFrom
   {:rdf/value
    "ISO 17442, Financial services - Legal Entity Identifier (LEI), first edition, 2012-06-01, section 3.1"},
   :cmns-av/synonym #{"juridical person" "artificial person" "juridical entity"
                      "juristic person"},
   :db/ident :fibo-be-le-lp/LegalEntity,
   :owl/disjointWith :fibo-be-le-lp/LegallyCompetentNaturalPerson,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/"},
   :rdfs/label "legal entity",
   :rdfs/subClassOf #{:fibo-fnd-org-fm/FormalOrganization
                      :fibo-be-le-lp/LegalPerson
                      {:owl/onClass    :fibo-fnd-law-jur/Jurisdiction,
                       :owl/onProperty :fibo-be-le-lp/isOrganizedIn,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "legal person that is a partnership, corporation, or other organization having the capacity to negotiate contracts, assume financial obligations, and pay off debts, organized under the laws of some jurisdiction",
   :skos/example
   "Examples of eligible legal entities include, without limitation:\n- all financial intermediaries;\n- banks and finance companies;\n- all entities that issue equity, debt or other securities for other capital structures;\n- all entities listed on an exchange;\n- all entities that trade stock or debt, investment vehicles, including mutual funds, pension funds and alternative investment vehicles constituted as corporate entities or collective investment agreements (including umbrella funds as well as funds under an umbrella structure, hedge funds, private equity funds, etc.);\n- all entities under the purview of a financial regulator and their affiliates, subsidiaries and holding companies;\n- counterparties to financial transactions.",
   :skos/scopeNote
   "The term 'legal entities' includes, but is not limited to, unique parties that are legally or financially responsible for the performance of financial transactions or have the legal right in their jurisdiction to enter independently into legal contracts, regardless of whether they are incorporated or constituted in some other way (e.g. trust, partnership, contractual). It excludes natural persons, but includes governmental organizations and supranationals."})

(def LegalPerson
  {:cmns-av/explanatoryNote
   "To have legal personality means to be capable of having legal rights and duties within a certain legal system, such as to enter into contracts, sue, and be sued. Legal personality is a prerequisite to legal capacity, the ability of any legal person to amend (enter into, transfer, etc.) rights and obligations.",
   :db/ident :fibo-be-le-lp/LegalPerson,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "legal person"},
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-be-le-lp/isRecognizedIn,
                       :owl/someValuesFrom :fibo-fnd-law-jur/Jurisdiction,
                       :rdf/type           :owl/Restriction} :cmns-pts/Party},
   :skos/definition
   "autonomous agent that is recognized as having rights and obligations under the law, including but not limited to the right to sue and be sued, enter into contracts, own property, and incur financial and other obligations"})

(def LegallyCompetentNaturalPerson
  {:cmns-av/explanatoryNote
   "The definition of mental competence, and potentially of the age of majority, is a function of the situation and law in a given jurisdiction.",
   :db/ident :fibo-be-le-lp/LegallyCompetentNaturalPerson,
   :owl/disjointWith :fibo-fnd-aap-ppl/IncapacitatedAdult,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/"},
   :rdfs/label "legally competent natural person",
   :rdfs/subClassOf #{:fibo-be-le-lp/LegalPerson :fibo-fnd-aap-ppl/Person},
   :skos/definition
   "person who is considered competent, under the circumstances, to enter into a contract, conduct business, or participate in other activities that generally require the mental ability to understand problems and make decisions on his or her own behalf"})

(def NotForProfitObjective
  {:cmns-av/explanatoryNote
   "The objective of all business activities is not to earn profits for its owners. All of the money earned by or donated to a not for profit organization is used in pursuing the organization's objectives.",
   :cmns-av/synonym "nonprofit objective",
   :db/ident :fibo-be-le-lp/NotForProfitObjective,
   :owl/disjointWith :fibo-be-le-lp/ProfitObjective,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/"},
   :rdfs/label "not for profit objective",
   :rdfs/subClassOf :fibo-fnd-gao-obj/Objective,
   :skos/definition
   "objective that reflects the charitable, educational, religious, humanitarian, public services, or other not for profit goals of an organization"})

(def PowerOfAttorney
  {:cmns-av/explanatoryNote
   "The appointment can be effective immediately or if the principal is unable to make decisions or perform certain actions on their own. It may be a (1) general power of attorney that authorizes the agent to act generally on behalf of the principal, such as to transfer funds from one account to another, pay debts, make investments, and so forth, or (2) limited to a specific act or situation, such as for management of an individual's finances in a single account, such as a brokerage account, or for management of healthcare. Decisions made and actions taken by an attorney in fact (within the scope of his or her authority) are legally binding on the principal.",
   :db/ident :fibo-be-le-lp/PowerOfAttorney,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/"},
   :rdfs/label "power of attorney",
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-fnd-law-lcap/isConferredOn,
      :owl/someValuesFrom :fibo-be-le-lp/LegallyCompetentNaturalPerson,
      :rdf/type           :owl/Restriction} :fibo-fnd-law-lcap/LegalCapacity
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :cmns-dt/Date,
      :owl/onProperty :fibo-fnd-agr-ctr/hasEffectiveDate,
      :rdf/type       :owl/Restriction}},
   :skos/definition
   "legal authorization given by one party (the principal) to another (the agent or attorney-in-fact) to perform certain acts on the principal's behalf"})

(def ProfitObjective
  {:cmns-av/explanatoryNote
   "Any profit that is gained goes to the business's owners, who may or may not decide to spend it on the business.",
   :cmns-av/synonym #{"profit motive" "for profit objective"},
   :db/ident :fibo-be-le-lp/ProfitObjective,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/"},
   :rdfs/label "profit objective",
   :rdfs/subClassOf :fibo-fnd-gao-obj/BusinessObjective,
   :skos/definition
   "objective that reflects pursuit of a financial benefit that may be realized when the amount of revenue gained from a business activity exceeds the expenses, costs and taxes needed to sustain that activity"})

(def PublicPurpose
  {:cmns-av/synonym "public interest",
   :db/ident :fibo-be-le-lp/PublicPurpose,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/"},
   :rdfs/label "public purpose",
   :rdfs/subClassOf :fibo-fnd-gao-obj/Objective,
   :skos/definition
   "objective that reflects values generally thought to be shared by and that is intended to benefit the populace as a whole"})

(def ReligiousObjective
  {:db/ident :fibo-be-le-lp/ReligiousObjective,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/"},
   :rdfs/label "religious objective",
   :rdfs/subClassOf :fibo-be-le-lp/NotForProfitObjective,
   :skos/definition
   "not-for-profit objective that reflects the religious goals of an organization"})

(def SpecialPurposeVehicle
  {:cmns-av/abbreviation #{{:rdf/language "en",
                            :rdf/value    "SPE"}
                           {:rdf/language "en",
                            :rdf/value    "SPV"}},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "A special purpose vehicle (SPV), also known as a special purpose entity (SPE), refers to a legal entity, typically a limited company or partnership, created to isolate a parent company from financial risk, including bankruptcy."},
   :cmns-av/synonym {:rdf/language "en",
                     :rdf/value    "special purpose entity"},
   :db/ident :fibo-be-le-lp/SpecialPurposeVehicle,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/"},
   :rdfs/label #{{:rdf/language "en-US",
                  :rdf/value    "special purpose vehicle"}
                 {:rdf/language "fr-FR",
                  :rdf/value    "fonds commun de placement"}},
   :rdfs/subClassOf :fibo-be-le-lp/LegalEntity,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "legal entity created to fulfill narrow, specific, and frequently temporary objectives"}})

(def StatutoryBody
  {:db/ident :fibo-be-le-lp/StatutoryBody,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/"},
   :rdfs/label "statutory body",
   :rdfs/subClassOf :fibo-be-le-lp/LegalEntity,
   :skos/definition
   "legal entity established by a government to consider evidence and make judgements in some field of activity"})

(def VariableInterestEntity
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "VIE"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Variable interest entity (VIE) is a term used by the Financial Accounting Standards Board (FASB) to refer to a legal entity with certain characteristics such that a public company with a financial interest in the entity is subject to certain financial reporting requirements. Examples include certain Chinese companies, such as Alibaba, that leverage VIEs to gain access to foreign capital that would otherwise not be available due to Chinese government regulations."},
   :cmns-av/synonym {:rdf/language "en",
                     :rdf/value    "shell company"},
   :db/ident :fibo-be-le-lp/VariableInterestEntity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "variable interest entity"},
   :rdfs/subClassOf :fibo-be-le-lp/LegalEntity,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "legal entity whose shareholders are entitled to a percentage of a named company's profits via a private contract"}})

(def isOrganizedIn
  {:db/ident :fibo-be-le-lp/isOrganizedIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-le-lp/LegalEntity,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/"},
   :rdfs/label "is organized in",
   :rdfs/range :fibo-fnd-law-jur/Jurisdiction,
   :rdfs/subPropertyOf :fibo-be-le-lp/isRecognizedIn,
   :skos/definition
   "indicates the jurisdiction whose laws a legal entity is organized under"})

(def isRecognizedIn
  {:db/ident :fibo-be-le-lp/isRecognizedIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain {:owl/unionOf [:fibo-be-le-lp/LegalPerson
                               :fibo-fnd-agr-agr/Agreement],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/"},
   :rdfs/label "is recognized in",
   :rdfs/range :fibo-fnd-law-jur/Jurisdiction,
   :skos/definition
   "indicates the jurisdiction in which a legal person is considered competent to enter into a contract, conduct business, or participate in other activities, or in which an agreement may be acknowledged and possibly enforceable"})

(def urn:uuid:6c844e74-e947-5f92-90c0-745938836bde
  {:cmns-av/copyright
   #{"Copyright (c) 2013-2024 EDM Council, Inc."
     "Copyright (c) 2013-2024 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology defines legal personhood concepts. A legal person as defined here is any natural person or organization which is capable of accruing liability on its own part.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Organizations/FormalOrganizations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Agreements/Agreements/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/AgentsAndPeople/People/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Law/Jurisdiction/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Law/LegalCapacity/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/GoalsAndObjectives/Objectives/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Agreements/Contracts/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/LegalEntities/LegalPersons/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Legal Persons Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons.rdf version of the ontology was modified to add a French label to special purpose vehicle."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons.rdf version of this ontology was modified to make legal person a subclass of independent party rather than autonomous agent."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons.rdf version of this ontology was modified per the FIBO 2.0 RFC to normalize restrictions on business license."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons.rdf version of this ontology was modified to move the concept of a signatory and related properties to the executives ontology for better semantic integration."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons.rdf version of this ontology was modified to move business objective to FND to enable higher level reuse."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons.rdf version of the ontology was modified to move the property, 'is conferred on' from Relations to the Legal Capacity ontology."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons.rdf version of this ontology was modified to eliminate deprecated elements."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons.rdf version of this ontology was modified to eliminate references to external dictionary sites that no longer resolve."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons.rdf version of this ontology was modified per the issue resolutions identified in the FIBO BE 1.0 FTF report."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons.rdf version of this ontology was modified to clarify the definition of legal person."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons.rdf version of this ontology was modified to incorporate the concept of employment, required to support regulatory reporting, and add the concept of a special purpose vehicle."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons.rdf version of this ontology was modified to add the definition of a variable interest entity and eliminate or loosen restrictions that are unnecessarily burdensome on FIBO users, such as that a legal person has liability capacity, which is true by definition but would never be realized when mapped to any data source."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons.rdf version of this ontology was modified to rationalize natural person and legally capable person in a new concept, namely legally competent natural person, simplify / merge the legal person and formal organization class hierarchies, and correct certain definitions, including power of attorney."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons.rdf version of this ontology was modified to augment the definition of a contract party to be a legal person."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons.rdf version of this ontology was modified to address text formatting hygiene issues."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons.rdf version of this ontology was modified to fix spelling errors."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons.rdf version of the ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/"})