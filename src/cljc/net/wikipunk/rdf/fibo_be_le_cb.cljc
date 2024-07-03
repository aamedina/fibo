(ns net.wikipunk.rdf.fibo-be-le-cb
  {:cmns-av/copyright #{"Copyright (c) 2013-2023 Object Management Group, Inc."
                        "Copyright (c) 2013-2023 EDM Council, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/LegalEntities/CorporateBodies/",
   :dcterms/abstract
   "This ontology defines the basic mechanisms that establish legal personhood for judicial or artificial persons, specifically those that are corporate bodies, including bodies incorporated by equity, by guarantee, and by agreement.",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-le-cb"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/CorporateBodies/",
    "fibo-be-le-fbo"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/FormalBusinessOrganizations/",
    "fibo-be-le-lp"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/",
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
    "fibo-fnd-gao-obj"
    "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/Objectives/",
    "fibo-fnd-law-cor"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCore/",
    "fibo-fnd-law-jur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/Jurisdiction/",
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
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Organizations/FormalOrganizations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/LegalEntities/FormalBusinessOrganizations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Law/Jurisdiction/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Law/LegalCore/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/GoalsAndObjectives/Objectives/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/LegalEntities/CorporateBodies/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-be-le-cb",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/CorporateBodies/",
   :rdfs/label "Corporate Bodies Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/CorporateBodies.rdf version of this ontology was modified to eliminate a now duplicate and overly constrained restriction on isDomiciledIn."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/CorporateBodies.rdf version of this ontology was modified to revise a dead link."
     "The http://www.omg.org/spec/EDMC-FIBO/BE/20180801/LegalEntities/CorporateBodies.rdf version of this ontology was modified to simplify / merge the legal person and formal organization class hierarchies."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/CorporateBodies.rdf version of this ontology was modified to reflect the move of hasObjective to FND to enable higher level reuse and eliminate deprecated elements."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/CorporateBodies.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/CorporateBodies.rdf version of this ontology was modified to eliminate 'body incorporated with guarantee', it's child, and 'body incorporated by agreement', which either don't exist or duplicate other kinds of organizations, such as private companies with limited liability."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/CorporateBodies.rdf version of this ontology was modified to eliminate unnecessary references, including those that have incorrect datatypes, and remove a reference that doesn't resolve."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/CorporateBodies.rdf version of this ontology was modified per the issue resolutions identified in the FIBO BE 1.0 FTF report."
     "The http://www.omg.org/spec/EDMC-FIBO/BE/20160201/LegalEntities/CorporateBodies.rdf version of this ontology was modified per the FIBO 2.0 RFC to address issues including elimination of missing labels and comments, integration with LCC, and replacing min 1 QCRs with someValuesFrom."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/CorporateBodies/"})

(def BenefitCorporation
  {:cmns-av/explanatoryNote
   "This is a US-specific type of non-profit corporation defined in recent legislation in a number of states. In California, for example, benefit corporations may be defined as public benefit or mutual benefit corporations, depending on their purpose.",
   :db/ident :fibo-be-le-cb/BenefitCorporation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/CorporateBodies/"},
   :rdfs/label "benefit corporation",
   :rdfs/subClassOf :fibo-be-le-cb/NotForProfitCorporation,
   :skos/definition
   "not-for-profit corporation set up under specific state legislation, typically to provide some social benefit, without an obligation to maximize shareholder return"})

(def CommonInterestDevelopmentCorporation
  {:cmns-av/explanatoryNote
   "A common interest development is typically a type of housing, composed of individually owned units, such as condominiums, townhouses, or single-family homes, that share ownership of common areas, such as swimming pools, landscaping, and parking. Common interest developments (also known as community interest developments or CIDs) are managed by homeowners' associations.",
   :db/ident :fibo-be-le-cb/CommonInterestDevelopmentCorporation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/CorporateBodies/"},
   :rdfs/label "common interest development corporation",
   :rdfs/subClassOf :fibo-be-le-cb/NotForProfitCorporation,
   :skos/definition
   "not-for-profit corporation set up under specific state legislation as a business entity for homeowners' associations",
   :skos/example {:xsd/anyURI "http://www.dre.ca.gov/files/pdf/re39.pdf"}})

(def Corporation
  {:cmns-av/explanatoryNote
   #{"A corporation has three distinguishing characteristics: (1) separation of ownership from management and general liability, i.e., its liability to creditors is limited to its resources, unlike some partnerships and sole proprietorships, (2) the ability to negotiate contracts and own property, and (3) transferable ownership, irrespective of changes in membership or the lifetimes of its stockholders."
     "A corporation is managed by or under the direction of a board of directors, which generally determines corporate policy. Officers manage the day-to-day affairs of the corporation."},
   :cmns-av/synonym "body corporate",
   :db/ident :fibo-be-le-cb/Corporation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/CorporateBodies/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "corporation"},
   :rdfs/subClassOf #{:fibo-be-le-lp/LegalEntity
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-be-le-cb/InstrumentOfIncorporation,
                       :owl/onProperty :fibo-be-le-cb/isConstitutedBy,
                       :rdf/type       :owl/Restriction}
                      {:owl/onClass    :fibo-fnd-law-jur/Jurisdiction,
                       :owl/onProperty :fibo-be-le-cb/isIncorporatedIn,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      {:owl/onProperty     :fibo-fnd-rel-rel/hasLegalName,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "formal organization that is a legal entity (artificial person) distinct from its owners, created under the jurisdiction of the laws of a state or nation"})

(def ForProfitCorporation
  {:db/ident :fibo-be-le-cb/ForProfitCorporation,
   :owl/disjointWith :fibo-be-le-cb/NotForProfitCorporation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/CorporateBodies/"},
   :rdfs/label "for profit corporation",
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fnd-gao-obj/hasObjective,
                       :owl/someValuesFrom :fibo-be-le-lp/ProfitObjective,
                       :rdf/type           :owl/Restriction}
                      :fibo-be-le-cb/Corporation},
   :skos/definition
   "corporation whose objective is to make money, i.e., to ensure realization of a financial benefit such that the amount of revenue gained from a business activity exceeds the expenses, costs and taxes needed to sustain that activity"})

(def IncorporationGuarantee
  {:db/ident :fibo-be-le-cb/IncorporationGuarantee,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/CorporateBodies/"},
   :rdfs/label "incorporation guarantee",
   :rdfs/subClassOf #{:fibo-fnd-law-cor/Constitution
                      {:owl/onClass    :fibo-fnd-acc-cur/MonetaryAmount,
                       :owl/onProperty :fibo-fnd-acc-cur/hasNotionalAmount,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      {:owl/cardinality 1,
                       :owl/onProperty  :fibo-fnd-rel-rel/isProvidedBy,
                       :rdf/type        :owl/Restriction}},
   :skos/definition
   "guarantee that is part of the financial basis by which some legal entity is incorporated"})

(def InstrumentOfIncorporation
  {:cmns-av/explanatoryNote
   "This may be the issuance of shares, the existence of some agreement, guaranties and so on.",
   :db/ident :fibo-be-le-cb/InstrumentOfIncorporation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/CorporateBodies/"},
   :rdfs/label "instrument of incorporation",
   :rdfs/subClassOf #{:fibo-fnd-law-cor/Constitution
                      {:owl/onClass    :fibo-fnd-law-jur/Jurisdiction,
                       :owl/onProperty :fibo-fnd-rel-rel/isGovernedBy,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "memorandum and articles of association by which some legal entity is established"})

(def NotForProfitCorporation
  {:cmns-av/explanatoryNote
   "A not-for-profit corporation is formed by incorporators, and has a board of directors and officers, but no shareholders. These incorporators, directors and officers may not receive a distribution of (any money from) profits, but officers and management may be paid reasonable salaries for services to the corporation.",
   :cmns-av/synonym "non-profit corporation",
   :db/ident :fibo-be-le-cb/NotForProfitCorporation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/CorporateBodies/"},
   :rdfs/label "not-for-profit corporation",
   :rdfs/subClassOf #{:fibo-be-le-fbo/NotForProfitOrganization
                      :fibo-be-le-cb/Corporation},
   :skos/definition
   "corporation approved by its jurisdictional oversight and tax authorities as operating for educational, charitable, social, religious, civic or humanitarian purposes"})

(def StockCorporation
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.oecd.org/corporate/OECD-Corporate-Governance-Factbook.pdf"},
   :cmns-av/explanatoryNote
   "The shares in a stock corporation may receive a return on their investment in the form of dividends. Shares are used for voting on matters of corporate policy or to elect directors, at the corporation's annual meeting and at other meetings of the corporation.",
   :db/ident :fibo-be-le-cb/StockCorporation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/CorporateBodies/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "stock corporation"},
   :rdfs/subClassOf :fibo-be-le-cb/Corporation,
   :skos/definition
   "corporation that has shareholders, each of whom receives a portion of the ownership of the corporation through shares of stock"})

(def isConstitutedBy
  {:db/ident :fibo-be-le-cb/isConstitutedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-le-cb/Corporation,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/CorporateBodies/"},
   :rdfs/label "is constituted by",
   :rdfs/range :fibo-fnd-law-cor/Constitution,
   :skos/definition "the instrument by which an entity is incorporated"})

(def isIncorporatedIn
  {:cmns-av/explanatoryNote
   "It is the laws of this jurisdiction that cause and allow the legal entity to exist and to incur debt and be sued at law as a legal entity.",
   :db/ident :fibo-be-le-cb/isIncorporatedIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-le-cb/Corporation,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/CorporateBodies/"},
   :rdfs/label "is incorporated in",
   :rdfs/range :fibo-fnd-law-jur/Jurisdiction,
   :rdfs/subPropertyOf :fibo-be-le-lp/isOrganizedIn,
   :skos/definition
   "the legal jurisdiction under which the legal entity is incorporated"})

(def urn:uuid:0e84c0a8-8269-5960-a43b-3cfc7e904957
  {:cmns-av/copyright #{"Copyright (c) 2013-2023 Object Management Group, Inc."
                        "Copyright (c) 2013-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology defines the basic mechanisms that establish legal personhood for judicial or artificial persons, specifically those that are corporate bodies, including bodies incorporated by equity, by guarantee, and by agreement.",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Organizations/FormalOrganizations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/LegalEntities/FormalBusinessOrganizations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Law/Jurisdiction/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Law/LegalCore/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/GoalsAndObjectives/Objectives/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/BE/LegalEntities/CorporateBodies/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Corporate Bodies Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/CorporateBodies.rdf version of this ontology was modified to eliminate a now duplicate and overly constrained restriction on isDomiciledIn."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/CorporateBodies.rdf version of this ontology was modified to revise a dead link."
     "The http://www.omg.org/spec/EDMC-FIBO/BE/20180801/LegalEntities/CorporateBodies.rdf version of this ontology was modified to simplify / merge the legal person and formal organization class hierarchies."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/CorporateBodies.rdf version of this ontology was modified to reflect the move of hasObjective to FND to enable higher level reuse and eliminate deprecated elements."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/CorporateBodies.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/CorporateBodies.rdf version of this ontology was modified to eliminate 'body incorporated with guarantee', it's child, and 'body incorporated by agreement', which either don't exist or duplicate other kinds of organizations, such as private companies with limited liability."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/CorporateBodies.rdf version of this ontology was modified to eliminate unnecessary references, including those that have incorrect datatypes, and remove a reference that doesn't resolve."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/CorporateBodies.rdf version of this ontology was modified per the issue resolutions identified in the FIBO BE 1.0 FTF report."
     "The http://www.omg.org/spec/EDMC-FIBO/BE/20160201/LegalEntities/CorporateBodies.rdf version of this ontology was modified per the FIBO 2.0 RFC to address issues including elimination of missing labels and comments, integration with LCC, and replacing min 1 QCRs with someValuesFrom."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/CorporateBodies/"})