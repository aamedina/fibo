(ns net.wikipunk.rdf.fibo-be-ge-ge
  {:cmns-av/copyright
   #{"Copyright (c) 2016-2024 EDM Council, Inc."
     "Copyright (c) 2016-2024 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/GovernmentEntities/GovernmentEntities/",
   :dcterms/abstract
   "This ontology defines the fundamental concepts for representing polities and government entities and their relations.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-rlcmp" "https://www.omg.org/spec/Commons/RolesAndCompositions/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-fct-fct"
    "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/FunctionalEntities/",
    "fibo-be-ge-ge"
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/",
    "fibo-be-le-lp"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/",
    "fibo-be-oac-exec"
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/",
    "fibo-fnd-aap-ppl"
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
    "fibo-fnd-gao-obj"
    "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/Objectives/",
    "fibo-fnd-law-cor"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCore/",
    "fibo-fnd-law-jur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/Jurisdiction/",
    "fibo-fnd-org-fm"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations/",
    "fibo-fnd-plc-loc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Locations/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Places/Locations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Law/Jurisdiction/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/OwnershipAndControl/Executives/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Law/LegalCore/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/GoalsAndObjectives/Objectives/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/AgentsAndPeople/People/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/FunctionalEntities/FunctionalEntities/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Organizations/FormalOrganizations/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/GovernmentEntities/GovernmentEntities/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-be-ge-ge",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/",
   :rdfs/label "Government Entities Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities.rdf version of this ontology was modified to reflect the move of hasObjective to FND to enable higher level reuse and eliminate a reasoning error."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities.rdf version of this ontology was modified to address text formatting hygiene issues and to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities.rdf version of this ontology was modified to eliminate duplication of concepts in LCC and merge the countries ontology with locations."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities.rdf version of this ontology was modified to eliminate references to external dictionary sites that no longer resolve, revise circular or ambiguous definitions, and to eliminate 'hasPartialSovereigntyOver' in favor of 'hasSharedSovereigntyOver'."
     "The http://www.omg.org/spec/EDMC-FIBO/BE/20160801/GovernmentEntities/GovernmentEntities.rdf version of this ontology was added to Business Entities, per the issue resolutions identified in the FIBO BE 1.1 RTF report."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities.rdf version of this ontology was modified to replace isAppointedBy with isDesignatedBy due to a name change in Relations, and to add a class for devolved government."
     "The http://www.omg.org/spec/EDMC-FIBO/BE/20170201/GovernmentEntities/GovernmentEntities.rdf version of this ontology was modified per the FIBO 2.0 RFC to integrate LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities.rdf version of this ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 and loosened restrictions causing reasoning and representational challenges (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities.rdf version of this ontology was modified to to rationalize natural person and legally capable person in a new concept, competent natural person, simplify / merge the legal person and formal organization class hierarchies, and revise certain definitions, such as for supranational entity, to correspond to ISO definitions."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities.rdf version of this ontology was modified to fix spelling errors."
     "The http://www.omg.org/spec/EDMC-FIBO/BE/20160801/GovernmentEntities/GovernmentEntities.rdf version of this ontology was modified per the issue resolutions identified in the FIBO BE 1.2 RTF report."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities.rdf version of this ontology was modified to augment the definition of instrumentality with additional notes."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/"})

(def BranchOfGovernment
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "https://www.usa.gov/branches-of-government"},
   :db/ident :fibo-be-ge-ge/BranchOfGovernment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/"},
   :rdfs/label "branch of government",
   :rdfs/subClassOf :fibo-be-ge-ge/GovernmentBody,
   :skos/definition
   "division of the government of a state, with separate and independent powers and areas of responsibility so that the powers of one branch are not in conflict with the powers associated with the other branches"})

(def DevolvedGovernment
  {:db/ident :fibo-be-ge-ge/DevolvedGovernment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/"},
   :rdfs/label "devolved government",
   :rdfs/subClassOf :fibo-be-ge-ge/Government,
   :skos/definition
   "government and the politicians that that run a subnational territory with powers that may be temporary and reversible, ultimately residing with the central government"})

(def ExecutiveBranch
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "https://www.usa.gov/branches-of-government"},
   :cmns-av/explanatoryNote
   "The executive branch executes and enforces the law.",
   :db/ident :fibo-be-ge-ge/ExecutiveBranch,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/"},
   :rdfs/label "executive branch",
   :rdfs/subClassOf :fibo-be-ge-ge/BranchOfGovernment,
   :skos/definition
   "the branch of government that is authorized and responsible for the daily administration of the government"})

(def FederalGovernment
  {:cmns-av/explanatoryNote
   "A federation is a political entity characterized by a union of partially self-governing states or regions under a central (federal) government. In a federation, the self-governing status of the component states, as well as the division of power between them and the central government, are typically constitutionally entrenched and may not be altered by a unilateral decision of either party, the states or the federal political body.",
   :db/ident :fibo-be-ge-ge/FederalGovernment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/"},
   :rdfs/label "federal government",
   :rdfs/subClassOf #{{:owl/intersectionOf
                       [{:owl/minQualifiedCardinality 0,
                         :owl/onClass    :fibo-fnd-plc-loc/FederalCapitalArea,
                         :owl/onProperty :fibo-fnd-rel-rel/governs,
                         :rdf/type       :owl/Restriction}
                        {:owl/onProperty     :fibo-fnd-rel-rel/governs,
                         :owl/someValuesFrom :fibo-fnd-plc-loc/FederalState,
                         :rdf/type           :owl/Restriction}],
                       :rdf/type :owl/Class} :fibo-be-ge-ge/NationalGovernment},
   :skos/definition
   "union of states under a central government distinct from the individual governments of the separate states"})

(def FederatedSovereignty
  {:cmns-av/explanatoryNote
   "The federated sovereignty is the legal entity that can incur debt for a federal government, as distinct from the Federal government.",
   :db/ident :fibo-be-ge-ge/FederatedSovereignty,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/"},
   :rdfs/label "federated sovereignty",
   :rdfs/subClassOf #{:fibo-be-ge-ge/SovereignState
                      {:owl/intersectionOf
                       [{:owl/onProperty     :fibo-be-ge-ge/isRepresentedBy,
                         :owl/someValuesFrom :fibo-be-ge-ge/RegionalGovernment,
                         :rdf/type           :owl/Restriction}
                        {:owl/onClass    :fibo-be-ge-ge/FederalGovernment,
                         :owl/onProperty :fibo-be-ge-ge/isRepresentedBy,
                         :owl/qualifiedCardinality 1,
                         :rdf/type       :owl/Restriction}],
                       :rdf/type :owl/Class}
                      {:owl/intersectionOf
                       [{:owl/onProperty :fibo-be-ge-ge/hasFullSovereigntyOver,
                         :owl/someValuesFrom :lcc-cr/Country,
                         :rdf/type :owl/Restriction}
                        {:owl/onProperty
                         :fibo-be-ge-ge/hasSharedSovereigntyOver,
                         :owl/someValuesFrom :fibo-fnd-plc-loc/FederalState,
                         :rdf/type :owl/Restriction}],
                       :rdf/type :owl/Class}},
   :skos/definition
   "polity characterized by a union of partially self-governing states or regions under a central (federal) government"})

(def Government
  {:cmns-av/explanatoryNote
   "In the Commonwealth of Nations, the word government is also used more narrowly to refer to the collective group of people that exercises executive authority in a state. This usage is analogous to what is called an 'administration' in American English. Furthermore, especially in American English, the concepts of the state and the government may be used synonymously to refer to the person or group of people exercising authority over a politically organized territory.",
   :db/ident :fibo-be-ge-ge/Government,
   :owl/disjointWith :fibo-be-ge-ge/Instrumentality,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/"},
   :rdfs/label "government",
   :rdfs/subClassOf #{{:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-be-ge-ge/BranchOfGovernment,
                       :owl/onProperty :cmns-col/hasConstituent,
                       :rdf/type       :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-be-ge-ge/GovernmentAgency,
                       :owl/onProperty :cmns-col/hasConstituent,
                       :rdf/type       :owl/Restriction}
                      {:owl/onProperty     :fibo-fnd-rel-rel/governs,
                       :owl/someValuesFrom :lcc-cr/GeopoliticalEntity,
                       :rdf/type           :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-be-ge-ge/GovernmentDepartment,
                       :owl/onProperty :cmns-col/hasConstituent,
                       :rdf/type       :owl/Restriction}
                      :fibo-be-fct-fct/FunctionalEntity},
   :skos/definition "the system by which a state or community is controlled"})

(def GovernmentAgency
  {:cmns-av/explanatoryNote
   "There is a notable variety of agency types. Although usage differs, a government agency is normally distinct both from a department or ministry, and other types of public body established by government. The functions of an agency are normally executive in character, since different types of organizations (such as commissions) are most often constituted in an advisory role; this distinction is often blurred in practice however.",
   :db/ident :fibo-be-ge-ge/GovernmentAgency,
   :owl/disjointWith :fibo-be-ge-ge/GovernmentDepartment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/"},
   :rdfs/label "government agency",
   :rdfs/subClassOf #{:fibo-be-ge-ge/GovernmentBody
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-be-ge-ge/GovernmentAppointee,
                       :owl/onProperty :fibo-fnd-rel-rel/isManagedBy,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "permanent or semi-permanent organization, often an appointed commission, in the machinery of government that is responsible for the oversight and administration of specific functions"})

(def GovernmentAppointee
  {:db/ident :fibo-be-ge-ge/GovernmentAppointee,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/"},
   :rdfs/label "government appointee",
   :rdfs/subClassOf
   #{{:owl/minQualifiedCardinality 0,
      :owl/onClass    {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-be-ge-ge/GovernmentBody,
                       :owl/onProperty :fibo-fnd-rel-rel/isDesignatedBy,
                       :rdf/type       :owl/Restriction},
      :owl/onProperty :cmns-rlcmp/isPlayedBy,
      :rdf/type       :owl/Restriction} :fibo-be-oac-exec/Executive
     :fibo-be-ge-ge/GovernmentOfficial},
   :skos/definition
   "individual designated by government decree to lead, or participate in some capacity in a government body"})

(def GovernmentBody
  {:cmns-av/explanatoryNote
   "Identifying government bodies is a pre-requisite for identifying government officials. This information is needed to help ensure compliance with applicable laws relating to bribery or corruption, including the U.S. Foreign Corrupt Practices Act (FCPA), the UK Bribery Act 2010 (UKBA), the U.S. Bank Bribery Act (Bribery Act), and other anti-bribery and corruption laws in the jurisdictions where financial institutions conduct business.",
   :db/ident :fibo-be-ge-ge/GovernmentBody,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/"},
   :rdfs/label "government body",
   :rdfs/subClassOf #{:fibo-fnd-org-fm/FormalOrganization
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-be-le-lp/PublicPurpose,
                       :owl/onProperty :fibo-fnd-gao-obj/hasObjective,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "formal organization that is an agency, instrumentality, or other body of a supranational, national, federal, state, or local government, including certain multijurisdictional agencies and departments that carry out the business of government"})

(def GovernmentDepartment
  {:db/ident :fibo-be-ge-ge/GovernmentDepartment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/"},
   :rdfs/label "government department",
   :rdfs/subClassOf #{{:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-be-ge-ge/GovernmentMinister,
                       :owl/onProperty :fibo-fnd-rel-rel/isManagedBy,
                       :rdf/type       :owl/Restriction}
                      :fibo-be-ge-ge/GovernmentBody},
   :skos/definition
   "specialized organization responsible for a sector of government public administration"})

(def GovernmentMinister
  {:db/ident :fibo-be-ge-ge/GovernmentMinister,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/"},
   :rdfs/label "government minister",
   :rdfs/subClassOf #{:fibo-be-oac-exec/Executive
                      :fibo-be-ge-ge/GovernmentOfficial},
   :skos/definition
   "government official that is an executive, who is either appointed or elected to a high office in the government",
   :skos/example
   "Minister of Finance, Secretary of State, Attorney General of California"})

(def GovernmentOfficial
  {:db/ident :fibo-be-ge-ge/GovernmentOfficial,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/"},
   :rdfs/label "government official",
   :rdfs/subClassOf
   #{{:owl/onClass    :fibo-be-le-lp/LegallyCompetentNaturalPerson,
      :owl/onProperty :cmns-rlcmp/isPlayedBy,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction} :fibo-be-oac-exec/ResponsibleParty
     {:owl/onProperty     :cmns-rlcmp/isPlayedBy,
      :owl/someValuesFrom {:owl/minQualifiedCardinality 0,
                           :owl/onClass    :fibo-be-ge-ge/GovernmentBody,
                           :owl/onProperty :cmns-col/isMemberOf,
                           :rdf/type       :owl/Restriction},
      :rdf/type           :owl/Restriction}},
   :skos/definition
   "person elected or appointed to administer some aspect of a government"})

(def Instrumentality
  {:cmns-av/explanatoryNote
   "An instrumentality is a non-governmental agency that acts independently but whose obligations are backed by a government because of its role in providing a public service. Many instrumentalities are private companies, and some are chartered directly by government. Instrumentalities are subject to a unique set of laws that shape their activities. Certain organizations, such as Sallie Mae in the United States, may be considered instrumentalities from some perspectives but not others. Sallie Mae's status was changed in 2004, when it was privatized, and since that time it is no longer considered a government-sponsored enterprise (GSE).",
   :db/ident :fibo-be-ge-ge/Instrumentality,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/"},
   :rdfs/label "instrumentality",
   :rdfs/subClassOf #{:fibo-be-ge-ge/GovernmentBody :fibo-be-le-lp/LegalEntity
                      {:owl/onProperty     :fibo-be-ge-ge/isInstrumentOf,
                       :owl/someValuesFrom :fibo-be-ge-ge/Government,
                       :rdf/type           :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-fnd-law-jur/StatuteLaw,
                       :owl/onProperty :fibo-fnd-rel-rel/isMandatedBy,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "organization that serves a public purpose and is closely tied to a government, but is not a government agency"})

(def Judiciary
  {:cmns-av/explanatoryNote
   "The judiciary also provides a mechanism for the resolution of disputes. Under the doctrine of the separation of powers, the judiciary generally does not make law (that is, in a plenary fashion, which is the responsibility of the legislature) or enforce law (which is the responsibility of the executive), but rather interprets law and applies it to the facts of each case.",
   :db/ident :fibo-be-ge-ge/Judiciary,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/"},
   :rdfs/label "judiciary",
   :rdfs/subClassOf #{:fibo-be-ge-ge/BranchOfGovernment
                      {:owl/onProperty     :cmns-col/hasPart,
                       :owl/someValuesFrom :fibo-fnd-law-cor/CourtOfLaw,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "branch of government that comprises the system of courts that interprets and applies the law in the name of the supranational, national, federal, or regional government, depending on its jurisdiction"})

(def Legislature
  {:cmns-av/explanatoryNote
   "Laws enacted by legislatures are known as legislation. Legislatures observe and steer governing actions and usually have exclusive authority to amend the budget or budgets involved in the process.",
   :db/ident :fibo-be-ge-ge/Legislature,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/"},
   :rdfs/label "legislature",
   :rdfs/subClassOf :fibo-be-ge-ge/BranchOfGovernment,
   :skos/definition
   "the law-making body of a political unit, usually a national government, that has power to enact, amend, and repeal public policy"})

(def MunicipalEntity
  {:cmns-av/explanatoryNote
   "Municipal entity in the sense of a legal entity, that is, what it is that incurs debt for a municipality, as distinct from the Municipal government. A municipal entity has a Government which sets laws applicable within the geographical area corresponding to its jurisdiction.",
   :cmns-av/synonym "municipality",
   :db/ident :fibo-be-ge-ge/MunicipalEntity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/"},
   :rdfs/label "municipal entity",
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-be-ge-ge/hasSovereigntyOver,
                       :owl/someValuesFrom :fibo-fnd-plc-loc/Municipality,
                       :rdf/type           :owl/Restriction}
                      :fibo-be-ge-ge/Polity
                      {:owl/onProperty     :fibo-be-ge-ge/isRepresentedBy,
                       :owl/someValuesFrom :fibo-be-ge-ge/MunicipalGovernment,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "polity that typically represents a city, township, or other administrative subdivision having corporate status and powers of self-government or jurisdiction"})

(def MunicipalGovernment
  {:db/ident :fibo-be-ge-ge/MunicipalGovernment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/"},
   :rdfs/label "municipal government",
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fnd-rel-rel/governs,
                       :owl/someValuesFrom :fibo-fnd-plc-loc/Municipality,
                       :rdf/type           :owl/Restriction}
                      :fibo-be-ge-ge/Government},
   :skos/definition
   "regional government of a city, township, or other administrative subdivision"})

(def NationalGovernment
  {:db/ident :fibo-be-ge-ge/NationalGovernment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/"},
   :rdfs/label "national government",
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fnd-rel-rel/governs,
                       :owl/someValuesFrom :lcc-cr/Country,
                       :rdf/type           :owl/Restriction}
                      :fibo-be-ge-ge/Government},
   :skos/definition
   "government and the politicians that that run a country as a whole (as opposed to local government)"})

(def Polity
  {:db/ident :fibo-be-ge-ge/Polity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/"},
   :rdfs/label "polity",
   :rdfs/subClassOf #{:fibo-be-ge-ge/GovernmentBody
                      {:owl/onProperty     :fibo-be-ge-ge/hasSovereigntyOver,
                       :owl/someValuesFrom :lcc-cr/GeopoliticalEntity,
                       :rdf/type           :owl/Restriction}
                      :fibo-be-le-lp/LegalPerson
                      {:owl/onProperty     :fibo-be-ge-ge/isRepresentedBy,
                       :owl/someValuesFrom :fibo-be-ge-ge/Government,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "legal person that is a supranational entity, crown, state, or subordinate civil authority, such as a province, prefecture, county, municipality, city, or district representing the people of that entity"})

(def RegionalGovernment
  {:cmns-av/explanatoryNote
   "A local government will typically only have control over their specific geographical region, and cannot pass or enforce laws that will affect a wider area. Local governments can elect officials, enact taxes, and do many other things that a national government would do, just on a smaller scale.",
   :cmns-av/synonym "local government",
   :db/ident :fibo-be-ge-ge/RegionalGovernment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/"},
   :rdfs/label "regional government",
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fnd-rel-rel/governs,
                       :owl/someValuesFrom :lcc-cr/GeopoliticalEntity,
                       :rdf/type           :owl/Restriction}
                      :fibo-be-ge-ge/Government},
   :skos/definition
   "administrative body for a geographic area, such as a county, smaller town, or other similar community"})

(def RegionalSovereignty
  {:db/ident :fibo-be-ge-ge/RegionalSovereignty,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/"},
   :rdfs/label "regional sovereignty",
   :rdfs/subClassOf #{{:owl/onProperty :fibo-be-ge-ge/hasSharedSovereigntyOver,
                       :owl/someValuesFrom :lcc-cr/GeopoliticalEntity,
                       :rdf/type :owl/Restriction}
                      {:owl/onProperty     :fibo-be-ge-ge/isRepresentedBy,
                       :owl/someValuesFrom :fibo-be-ge-ge/RegionalGovernment,
                       :rdf/type           :owl/Restriction}
                      :fibo-be-ge-ge/Polity},
   :skos/definition
   "legal person that corresponds to an administrative division, administrative unit, administrative entity or country subdivision (or, sometimes, geopolitical division or subnational entity), that has the capacity to incur debt, issue contracts, and enter into relations with other similar entities",
   :skos/example
   "A country may be divided into provinces, which, in turn, are divided into counties, which, in turn, may be divided in whole or in part into municipalities; and so on."})

(def SovereignState
  {:cmns-av/explanatoryNote
   "A legal entity that is represented by one centralized government, has a permanent population, defined territory, and the capacity to enter into relations with other sovereign states.",
   :db/ident :fibo-be-ge-ge/SovereignState,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/"},
   :rdfs/label "sovereign state",
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-be-ge-ge/isRepresentedBy,
                       :owl/someValuesFrom :fibo-be-ge-ge/NationalGovernment,
                       :rdf/type           :owl/Restriction}
                      :fibo-be-ge-ge/Polity
                      {:owl/onProperty :fibo-be-ge-ge/hasFullSovereigntyOver,
                       :owl/someValuesFrom :lcc-cr/Country,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "non-physical juridical entity that is represented by one centralized government that has sovereignty over a geographic area"})

(def SupranationalEntity
  {:cmns-av/adaptedFrom
   #{{:rdf/value
      "ISO 20275:2017, Financial services - Entity legal forms (ELF), First Edition, July 2017."}
     {:rdf/value
      "Kiljunen, Kimmo (2004). The European Constitution in the Making. Centre for European Policy Studies. pp. 21-26. ISBN 978-92-9079-493-6"}},
   :cmns-av/explanatoryNote
   "A supranational union is a supranational polity which lies somewhere between a confederation that is an association of states and a federation that is a state. Unlike states in a federal super-state, member states retain ultimate sovereignty, although some sovereignty is shared with, or ceded to, the supranational body.",
   :db/ident :fibo-be-ge-ge/SupranationalEntity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/"},
   :rdfs/label "supranational entity",
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-be-ge-ge/isRepresentedBy,
                       :owl/someValuesFrom :fibo-be-ge-ge/GovernmentBody,
                       :rdf/type           :owl/Restriction}
                      :fibo-be-ge-ge/Polity
                      {:owl/onProperty :fibo-be-ge-ge/hasSharedSovereigntyOver,
                       :owl/someValuesFrom :lcc-cr/Country,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "governmental or non-governmental entity that is established by international law or treaty or incorporated at an international level"})

(def TribalArea
  {:db/ident :fibo-be-ge-ge/TribalArea,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/"},
   :rdfs/label "tribal area",
   :rdfs/subClassOf :lcc-cr/GeopoliticalEntity,
   :skos/definition
   "designation for geographic region administered by a group of indigenous people rather than by a sovereign state or regional governmental entity"})

(def TribalEntity
  {:cmns-av/explanatoryNote
   "Any indigenous group or community which is recognized as having rights and obligations independent of the central government.",
   :db/ident :fibo-be-ge-ge/TribalEntity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/"},
   :rdfs/label "tribal entity",
   :rdfs/subClassOf #{{:owl/onProperty :fibo-be-ge-ge/hasSharedSovereigntyOver,
                       :owl/someValuesFrom :fibo-be-ge-ge/TribalArea,
                       :rdf/type :owl/Restriction}
                      {:owl/onProperty     :fibo-be-ge-ge/isRepresentedBy,
                       :owl/someValuesFrom :fibo-be-ge-ge/TribalGovernment,
                       :rdf/type           :owl/Restriction}
                      :fibo-be-ge-ge/Polity},
   :skos/definition
   "legal entity that represents fundamental unit of sovereign tribal (indigenous) government"})

(def TribalGovernment
  {:db/ident :fibo-be-ge-ge/TribalGovernment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/"},
   :rdfs/label "tribal government",
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fnd-rel-rel/governs,
                       :owl/someValuesFrom :fibo-be-ge-ge/TribalArea,
                       :rdf/type           :owl/Restriction}
                      :fibo-be-ge-ge/Government},
   :skos/definition
   "government representing a group of indigenous people that has legal authority to govern those people, including authority to legislate the existence of tribal entities"})

(def hasFullSovereigntyOver
  {:db/ident :fibo-be-ge-ge/hasFullSovereigntyOver,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/"},
   :rdfs/label "has full sovereignty over",
   :rdfs/subPropertyOf :fibo-be-ge-ge/hasSovereigntyOver,
   :skos/definition
   "relates a polity to a geopolitical entity where the polity has absolute, supreme and ultimate dominion and authority of a political state subject to no higher power, expressed within its territory in full self-government and in complete freedom from any outside influence"})

(def hasJurisdiction
  {:db/ident :fibo-be-ge-ge/hasJurisdiction,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/"},
   :rdfs/label "has jurisdiction",
   :rdfs/range :fibo-fnd-law-jur/Jurisdiction,
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/governs,
   :skos/definition
   "relates a polity or government entity to one or more jurisdictions, over which it has some level of legal authority"})

(def hasSharedSovereigntyOver
  {:db/ident :fibo-be-ge-ge/hasSharedSovereigntyOver,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/"},
   :rdfs/label "has shared sovereignty over",
   :rdfs/subPropertyOf :fibo-be-ge-ge/hasSovereigntyOver,
   :skos/definition
   "relates a polity to a geopolitical entity where the polity exercises shared dominion and authority of a political state"})

(def hasSovereigntyOver
  {:db/ident :fibo-be-ge-ge/hasSovereigntyOver,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-ge-ge/Polity,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/"},
   :rdfs/label "has sovereignty over",
   :rdfs/range :lcc-cr/GeopoliticalEntity,
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/governs,
   :skos/definition
   "relates a polity to a geopolitical entity where the polity exercises dominion and authority of a political state"})

(def isElectedBy
  {:db/ident :fibo-be-ge-ge/isElectedBy,
   :owl/inverseOf :fibo-be-oac-exec/elects,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/"},
   :rdfs/label "is elected by",
   :skos/definition
   "identifies an official or government chosen to hold office by voting"})

(def isInstrumentOf
  {:db/ident :fibo-be-ge-ge/isInstrumentOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-ge-ge/Instrumentality,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/"},
   :rdfs/label "is an instrument of",
   :rdfs/range :fibo-be-ge-ge/Government,
   :skos/definition
   "relates an instrumentality of some government to the government that it supports"})

(def isJurisdictionOf
  {:db/ident :fibo-be-ge-ge/isJurisdictionOf,
   :owl/inverseOf :fibo-be-ge-ge/hasJurisdiction,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-law-jur/Jurisdiction,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/"},
   :rdfs/label "is jurisdiction of",
   :skos/definition
   "relates a jurisdiction to a polity or other government entity or court that has some level of legal authority over it"})

(def isRepresentedBy
  {:db/ident :fibo-be-ge-ge/isRepresentedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/"},
   :rdfs/label "is represented by",
   :skos/definition
   "relates a system of governance to its chosen representatives"})

(def urn:uuid:26a5c4bf-40bc-54a3-8eeb-f9cdc106724a
  {:cmns-av/copyright
   #{"Copyright (c) 2016-2024 EDM Council, Inc."
     "Copyright (c) 2016-2024 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology defines the fundamental concepts for representing polities and government entities and their relations.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Places/Locations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Law/Jurisdiction/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/OwnershipAndControl/Executives/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Law/LegalCore/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/GoalsAndObjectives/Objectives/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/AgentsAndPeople/People/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/FunctionalEntities/FunctionalEntities/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Organizations/FormalOrganizations/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/BE/GovernmentEntities/GovernmentEntities/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Government Entities Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities.rdf version of this ontology was modified to reflect the move of hasObjective to FND to enable higher level reuse and eliminate a reasoning error."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities.rdf version of this ontology was modified to address text formatting hygiene issues and to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities.rdf version of this ontology was modified to eliminate duplication of concepts in LCC and merge the countries ontology with locations."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities.rdf version of this ontology was modified to eliminate references to external dictionary sites that no longer resolve, revise circular or ambiguous definitions, and to eliminate 'hasPartialSovereigntyOver' in favor of 'hasSharedSovereigntyOver'."
     "The http://www.omg.org/spec/EDMC-FIBO/BE/20160801/GovernmentEntities/GovernmentEntities.rdf version of this ontology was added to Business Entities, per the issue resolutions identified in the FIBO BE 1.1 RTF report."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities.rdf version of this ontology was modified to replace isAppointedBy with isDesignatedBy due to a name change in Relations, and to add a class for devolved government."
     "The http://www.omg.org/spec/EDMC-FIBO/BE/20170201/GovernmentEntities/GovernmentEntities.rdf version of this ontology was modified per the FIBO 2.0 RFC to integrate LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities.rdf version of this ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 and loosened restrictions causing reasoning and representational challenges (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities.rdf version of this ontology was modified to to rationalize natural person and legally capable person in a new concept, competent natural person, simplify / merge the legal person and formal organization class hierarchies, and revise certain definitions, such as for supranational entity, to correspond to ISO definitions."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities.rdf version of this ontology was modified to fix spelling errors."
     "The http://www.omg.org/spec/EDMC-FIBO/BE/20160801/GovernmentEntities/GovernmentEntities.rdf version of this ontology was modified per the issue resolutions identified in the FIBO BE 1.2 RTF report."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities.rdf version of this ontology was modified to augment the definition of instrumentality with additional notes."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/"})