(ns net.wikipunk.rdf.fibo-be-oac-exec
  "This ontology defines concepts relating to executives and their formal capacities. The concepts defined in this ontology cover types of corporate officers, board members and the like, along with the capacities in terms of which those party roles are defined, and the kinds of entity (principally natural persons) that are able to perform in those roles."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/",
   :dcterms/abstract
   "This ontology defines concepts relating to executives and their formal capacities. The concepts defined in this ontology cover types of corporate officers, board members and the like, along with the capacities in terms of which those party roles are defined, and the kinds of entity (principally natural persons) that are able to perform in those roles.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/OwnershipAndControl/OwnershipParties/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/OwnershipAndControl/ControlParties/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Roles/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LegalPersons/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/OwnershipAndControl/CorporateControl/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/LegalCore/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Parties/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Organizations/Organizations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/Corporations/Corporations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/LegalCapacity/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/CorporateBodies/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/OwnershipAndControl/Control/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Organizations/FormalOrganizations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/Jurisdiction/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/OwnershipAndControl/Executives/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-be-corp-corp"
    "https://spec.edmcouncil.org/fibo/ontology/BE/Corporations/Corporations/",
    "fibo-be-le-cb"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/CorporateBodies/",
    "fibo-be-le-lp"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/",
    "fibo-be-oac-cctl"
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateControl/",
    "fibo-be-oac-cpty"
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/ControlParties/",
    "fibo-be-oac-exec"
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/",
    "fibo-be-oac-opty"
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties/",
    "fibo-fnd-law-cor"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCore/",
    "fibo-fnd-law-jur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/Jurisdiction/",
    "fibo-fnd-law-lcap"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/",
    "fibo-fnd-oac-ctl"
    "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Control/",
    "fibo-fnd-org-fm"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations/",
    "fibo-fnd-org-org"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations/",
    "fibo-fnd-pty-pty"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
    "fibo-fnd-pty-rl"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "lcc-lr" "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/",
   :rdfa/prefix "fibo-be-oac-exec",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/",
   :rdfs/label "Executives Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives.rdf version of this ontology was modified to clarify the definition of responsible party."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives.rdf version of the ontology was modified to reflect the move of OrganizationMember from Parties to Organizations in FND and to incorporate the latest insights into how control relations should integrate with the control situation."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives.rdf version of the ontology was modified to address text formatting hygiene issues."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives.rdf version of the ontology was modified to refine the definition of corporate officer."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives.rdf version of the ontology was modified to fix spelling errors."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives.rdf version of this ontology was modified to correct the label on hasAuthorizedParty."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives.rdf version of this ontology was modified per the issue resolutions identified in the FIBO BE 1.0 FTF report."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives.rdf version of this ontology was modified to adjust the hierarchy to better support regulatory requirements."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives.rdf version of this ontology was modified to integrate concepts related to authorization, including board membership and the concept of a signatory (moved from legal persons) to improve semantics; simplify the ontology, and normalize definitions to be ISO 704 compliant."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives.rdf version of this ontology was modified to add PrincipalParty as the parent of CEO and others."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives.rdf version of this ontology was modified per the FIBO 2.0 RFC to fix reasoning issues."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives.rdf version of this ontology was modified to eliminate references to external dictionary sites that no longer resolve, add the concept of corporate bylaws and restriction on authorized shares (moved from SEC)."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives.rdf version of this ontology was modified to eliminate duplication with concepts in LCC."],
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright ["Copyright (c) 2013-2022 EDM Council, Inc."
                  "Copyright (c) 2013-2022 Object Management Group, Inc."],
   :sm/dependsOn
   ["https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateControl/"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/CorporateBodies/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/"
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/ControlParties/"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/"
    "https://spec.edmcouncil.org/fibo/ontology/BE/Corporations/Corporations/"
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties/"],
   :sm/fileAbbreviation "fibo-be-oac-exec",
   :sm/filename "Executives.rdf"})

(def ArticlesOfIncorporation
  "contract that establishes a new corporation or, when amended, adjusts the legal basis for the corporation, and outlines basic information about the corporation, including the type of business, and a description of the business' operational characteristics"
  {:db/ident :fibo-be-oac-exec/ArticlesOfIncorporation,
   :fibo-fnd-utl-av/synonym "articles of association",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/",
   :rdfs/label "articles of incorporation",
   :rdfs/subClassOf :fibo-be-le-cb/InstrumentOfIncorporation,
   :skos/definition
   "contract that establishes a new corporation or, when amended, adjusts the legal basis for the corporation, and outlines basic information about the corporation, including the type of business, and a description of the business' operational characteristics"})

(def Auditor
  "party qualified and authorized to review and verify the accuracy of financial records and ensure that companies comply with tax laws"
  {:db/ident :fibo-be-oac-exec/Auditor,
   :fibo-fnd-utl-av/explanatoryNote
   ["An auditor may be an internal auditor - an individual whose primary job function is to audit his or her own company, or an external auditor - an individual from outside the company, who typically is employed by an auditing firm who handles many different clients."
    "An auditor is authorized to audit one or more specific organizations, i.e., by the authorizing party indicated by the situation."],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/",
   :rdfs/label "auditor",
   :rdfs/subClassOf :fibo-be-oac-exec/AuthorizedParty,
   :skos/definition
   "party qualified and authorized to review and verify the accuracy of financial records and ensure that companies comply with tax laws"})

(def Authorization
  "situation in which a party authorizes someone to act on their behalf under certain conditions for some period of time"
  {:db/ident :fibo-be-oac-exec/Authorization,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/",
   :rdfs/label "authorization",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-be-oac-exec/hasAuthorizingParty,
                      :owl/someValuesFrom :fibo-be-oac-exec/AuthorizingParty,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-be-oac-exec/hasAuthorizedParty,
                      :owl/someValuesFrom :fibo-be-oac-exec/AuthorizedParty,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-pty-pty/Situation],
   :skos/definition
   "situation in which a party authorizes someone to act on their behalf under certain conditions for some period of time"})

(def AuthorizedParty
  "party that has been given the responsibility to act on behalf of another party under some set of guidelines"
  {:db/ident :fibo-be-oac-exec/AuthorizedParty,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/",
   :rdfs/label "authorized party",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-be-oac-exec/isAuthorizedThrough,
                      :owl/someValuesFrom :fibo-be-oac-exec/Authorization,
                      :rdf/type           :owl/Restriction}
                     {:owl/onClass :fibo-be-le-lp/LegallyCompetentNaturalPerson,
                      :owl/onProperty :fibo-fnd-rel-rel/hasIdentity,
                      :owl/qualifiedCardinality 1,
                      :rdf/type :owl/Restriction}
                     :fibo-be-oac-exec/ResponsibleParty],
   :skos/definition
   "party that has been given the responsibility to act on behalf of another party under some set of guidelines"})

(def AuthorizingParty
  "party that delegates some role, authority, or control to another party"
  {:db/ident :fibo-be-oac-exec/AuthorizingParty,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/",
   :rdfs/label "authorizing party",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-be-oac-exec/authorizesThrough,
                      :owl/someValuesFrom :fibo-be-oac-exec/Authorization,
                      :rdf/type           :owl/Restriction}
                     {:owl/onClass    :fibo-be-le-lp/LegalPerson,
                      :owl/onProperty :fibo-fnd-rel-rel/hasIdentity,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-pty-pty/Actor],
   :skos/definition
   "party that delegates some role, authority, or control to another party"})

(def BoardCapacity
  "authority to act in a fiduciary capacity with respect to the organization, including but not limited to determining and executing corporate policy"
  {:db/ident :fibo-be-oac-exec/BoardCapacity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/",
   :rdfs/label "board capacity",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-rel-rel/isConferredOn,
     :owl/someValuesFrom {:owl/onProperty     :fibo-fnd-pty-rl/playsRole,
                          :owl/someValuesFrom :fibo-be-oac-exec/BoardMember,
                          :rdf/type           :owl/Restriction},
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-rel-rel/isConferredBy,
     :owl/someValuesFrom {:owl/unionOf [:fibo-be-le-cb/InstrumentOfIncorporation
                                        :fibo-be-oac-exec/Bylaws
                                        :fibo-be-corp-corp/BoardAgreement],
                          :rdf/type    :owl/Class},
     :rdf/type           :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-be-oac-exec/CompanyLaw,
     :owl/onProperty :fibo-fnd-rel-rel/isGovernedBy,
     :rdf/type       :owl/Restriction}
    :fibo-fnd-law-lcap/DelegatedLegalAuthority],
   :skos/definition
   "authority to act in a fiduciary capacity with respect to the organization, including but not limited to determining and executing corporate policy"})

(def BoardCompositionControl
  "situation in which a voting shareholder, entity owner, or some other party in the case of a not-for-profit organization, appoints and/or nominates someone to the board of directors of an organization for some period of time"
  {:db/ident :fibo-be-oac-exec/BoardCompositionControl,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/",
   :rdfs/label "board composition control",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-oac-ctl/involvesControlledThing,
                      :owl/someValuesFrom :fibo-be-oac-exec/BoardMember,
                      :rdf/type :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    {:owl/unionOf
                                       [:fibo-be-oac-cctl/SignificantShareholder
                                        :fibo-be-oac-opty/EntityOwner],
                                       :rdf/type :owl/Class},
                      :owl/onProperty :fibo-fnd-oac-ctl/hasPartyInControl,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-oac-ctl/Control],
   :skos/definition
   "situation in which a voting shareholder, entity owner, or some other party in the case of a not-for-profit organization, appoints and/or nominates someone to the board of directors of an organization for some period of time"})

(def BoardMember
  "party that has fiduciary responsibility with respect to the organization, including but not limited to determining and executing corporate policy"
  {:db/ident :fibo-be-oac-exec/BoardMember,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/",
   :rdfs/label "board member",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-pty-rl/isPlayedBy,
     :owl/someValuesFrom {:owl/onProperty :lcc-lr/isMemberOf,
                          :owl/someValuesFrom
                          {:owl/onProperty :fibo-fnd-pty-rl/playsRole,
                           :owl/someValuesFrom
                           :fibo-be-oac-exec/BoardOfDirectors,
                           :rdf/type :owl/Restriction},
                          :rdf/type :owl/Restriction},
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-pty-rl/isPlayedBy,
     :owl/someValuesFrom {:owl/onProperty     :fibo-fnd-pty-pty/isAPartyTo,
                          :owl/someValuesFrom :fibo-be-corp-corp/BoardAgreement,
                          :rdf/type           :owl/Restriction},
     :rdf/type           :owl/Restriction}
    :fibo-fnd-org-org/OrganizationMember
    :fibo-be-oac-exec/ResponsibleParty
    :fibo-be-oac-exec/LegallyDelegatedAuthority],
   :skos/definition
   "party that has fiduciary responsibility with respect to the organization, including but not limited to determining and executing corporate policy"})

(def BoardMembership
  "situation relating an individual member of the board of directors to the organization"
  {:db/ident :fibo-be-oac-exec/BoardMembership,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/",
   :rdfs/label "board membership",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-oac-ctl/involvesControlledThing,
                      :owl/someValuesFrom :fibo-be-oac-cpty/ControlledParty,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-oac-ctl/hasPartyInControl,
                      :owl/someValuesFrom :fibo-be-oac-exec/BoardMember,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-oac-ctl/Control],
   :skos/definition
   "situation relating an individual member of the board of directors to the organization"})

(def BoardOfDirectors
  "group of people comprising the governing body of an organization that has the authority to set organizational strategy and policies as well as to select and, to some degree manage, leadership"
  {:db/ident :fibo-be-oac-exec/BoardOfDirectors,
   :fibo-fnd-utl-av/explanatoryNote
   "For a public, for profit organization, its members (directors) are elected normally by the subscribers (stockholders) of the firm (generally at an annual general meeting) to govern the firm and look after the subscribers' interests. In the case of a not-for-profit organization, the board ensures the organization is acting in line with its mission. The board has the ultimate decision-making authority and, in general, is empowered to (1) set the company's policy, objectives, and overall direction, (2) adopt bylaws, (3) name members of the advisory, executive, finance, and other committees, (4) hire, monitor, evaluate, and fire the managing director and senior executives, (5) determine and pay the dividend, and (6) issue additional shares. Though all its members might not be engaged in the company's day-to-day operations, the entire board is held liable (under the doctrine of collective responsibility) for the consequences of the firm's policies, actions, and failures to act. Members of the board usually include senior-most executives (called inside directors or executive directors) as well as experts or respected persons chosen from the wider community (called outside directors or non-executive directors).",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/",
   :rdfs/label "board of directors",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-pty-rl/isPlayedBy,
     :owl/someValuesFrom {:owl/onProperty     :lcc-lr/hasMember,
                          :owl/someValuesFrom {:owl/onProperty
                                               :fibo-fnd-pty-rl/playsRole,
                                               :owl/someValuesFrom
                                               :fibo-be-oac-exec/BoardMember,
                                               :rdf/type :owl/Restriction},
                          :rdf/type           :owl/Restriction},
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-pty-rl/isPlayedBy,
     :owl/someValuesFrom {:owl/onProperty     :fibo-fnd-law-lcap/hasCapacity,
                          :owl/someValuesFrom :fibo-be-oac-exec/BoardCapacity,
                          :rdf/type           :owl/Restriction},
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-be-oac-exec/nominates,
     :owl/someValuesFrom :fibo-be-oac-exec/CorporateOfficer,
     :rdf/type           :owl/Restriction}
    :fibo-be-oac-cpty/EntityControllingParty],
   :skos/definition
   "group of people comprising the governing body of an organization that has the authority to set organizational strategy and policies as well as to select and, to some degree manage, leadership"})

(def Bylaws
  "written rules for conduct of a corporation, association, partnership or any organization"
  {:db/ident :fibo-be-oac-exec/Bylaws,
   :fibo-fnd-utl-av/synonym ["membership agreement" "byelaws"],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/",
   :rdfs/label "bylaws",
   :rdfs/subClassOf :fibo-fnd-law-cor/Law,
   :skos/definition
   "written rules for conduct of a corporation, association, partnership or any organization"})

(def ChiefExecutiveOfficer
  "top corporate officer responsible for an organization's overall operations and performance"
  {:db/ident :fibo-be-oac-exec/ChiefExecutiveOfficer,
   :fibo-fnd-utl-av/abbreviation "CEO",
   :fibo-fnd-utl-av/explanatoryNote
   "He or she is the leader of the firm, serves as the main link between the board of directors (the board) and the firm's various parts or levels, and is held solely responsible for the firm's success or failure. One of the major duties of a CEO is to maintain and implement corporate policy, as established by the board. Also called President or managing director, he or she may also be the chairman (or chairperson) of the board.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/",
   :rdfs/label "chief executive officer",
   :rdfs/subClassOf [:fibo-be-oac-exec/ExecutiveBoardMember
                     {:owl/onProperty :fibo-fnd-pty-rl/isPlayedBy,
                      :owl/someValuesFrom
                      {:owl/onProperty :fibo-fnd-rel-rel/manages,
                       :owl/someValuesFrom
                       {:owl/unionOf [:fibo-be-le-lp/LegalEntity
                                      :fibo-fnd-org-fm/FormalOrganization],
                        :rdf/type    :owl/Class},
                       :rdf/type :owl/Restriction},
                      :rdf/type :owl/Restriction}
                     :fibo-be-oac-exec/PrincipalParty
                     :fibo-be-oac-exec/CorporateOfficer],
   :skos/definition
   "top corporate officer responsible for an organization's overall operations and performance"})

(def ChiefFinancialOfficer
  "senior-most corporate officer responsible for financial control and planning for an organization or project"
  {:db/ident :fibo-be-oac-exec/ChiefFinancialOfficer,
   :fibo-fnd-utl-av/abbreviation "CFO",
   :fibo-fnd-utl-av/explanatoryNote
   "He or she is in charge of all accounting functions including (1) credit control, (2) preparing budgets and financial statements, (3) coordinating financing and fund raising, (4) monitoring expenditure and liquidity, (5) managing investment and taxation issues, (6) reporting financial performance to the board, and (7) providing timely financial data to the CEO. Also called chief finance officer, comptroller, controller, or finance controller.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/",
   :rdfs/label "chief financial officer",
   :rdfs/subClassOf :fibo-be-oac-exec/CorporateOfficer,
   :skos/definition
   "senior-most corporate officer responsible for financial control and planning for an organization or project"})

(def CompanyLaw
  "legislation under which the formation, registration or incorporation, governance, and dissolution of a firm is administered and controlled"
  {:db/ident :fibo-be-oac-exec/CompanyLaw,
   :fibo-fnd-utl-av/synonym "corporate law",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/",
   :rdfs/label "company law",
   :rdfs/subClassOf :fibo-fnd-law-jur/StatuteLaw,
   :skos/definition
   "legislation under which the formation, registration or incorporation, governance, and dissolution of a firm is administered and controlled"})

(def CompanySecretary
  "corporate officer appointed by the directors of an organization, responsible for ensuring compliance with legal obligations related to corporate governance"
  {:db/ident :fibo-be-oac-exec/CompanySecretary,
   :fibo-fnd-utl-av/explanatoryNote
   "His or her formal duties include (1) calling meetings, (2) recording minutes of the meetings, (3) keeping statutory record books, (4) proper payment of dividend and interest payments, and (5) proper drafting and execution of agreements, contracts, and resolutions.",
   :fibo-fnd-utl-av/synonym "corporate secretary",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/",
   :rdfs/label "company secretary",
   :rdfs/subClassOf :fibo-be-oac-exec/CorporateOfficer,
   :skos/definition
   "corporate officer appointed by the directors of an organization, responsible for ensuring compliance with legal obligations related to corporate governance"})

(def CorporateBylaws
  "written rules for conduct of a corporation, adopted by the board of directors"
  {:db/ident :fibo-be-oac-exec/CorporateBylaws,
   :fibo-fnd-utl-av/explanatoryNote
   "Corporate bylaws may contain any provision, not inconsistent with law or with the certificate of incorporation, relating to the business of the corporation, the conduct of its affairs, and its rights or powers or the rights or powers of its stockholders, directors, officers or employees. Changes to the bylaws of a corporation require a board-level resolution and may require a vote of the shareholders.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/",
   :rdfs/label "corporate bylaws",
   :rdfs/subClassOf [{:owl/onProperty :fibo-be-corp-corp/hasSharesAuthorized,
                      :owl/someValuesFrom :xsd/nonNegativeInteger,
                      :rdf/type :owl/Restriction}
                     :fibo-be-oac-exec/Bylaws],
   :skos/definition
   "written rules for conduct of a corporation, adopted by the board of directors"})

(def CorporateOfficer
  "high-level management executive of a corporation or other organization, hired by the board of directors or the business owner(s), charged with certain operational responsibilities, and who has the authority to act on behalf of the organization, including the authority to enter into contracts on behalf of the organization"
  {:db/ident :fibo-be-oac-exec/CorporateOfficer,
   :fibo-fnd-utl-av/explanatoryNote
   ["In banking, corporate officers have the legal capacity to execute some documents and make certain decisions on behalf of the institution due to the nature of the business. The level of authority varies depending on the role the officer plays, however, and based on bank policy. In large institutions, corporate officers may include loan/lending officers, those in certain supervisory roles, and others with varying degrees of authority, and frequently they are given a 'vice president' title, particularly if they are customer facing. Hiring and other decisions related to such corporate officers may be delegated to more operational levels, rather than by the board directly, with respect to such personnel."
    "Note that in most cases in the United States, corporate officers, especially those with signatory capacity and other fiduciary responsibilities must be employees, especially with respect to financial institutions and other highly regulated domains. There are cases, however, when an independent contractor or professional services provider may play the role of a corporate officer, such as a 'CFO for hire', which is a common practice in start-up organizations."],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/",
   :rdfs/label "corporate officer",
   :rdfs/subClassOf [:fibo-be-oac-exec/Executive
                     :fibo-be-oac-exec/Signatory
                     :fibo-fnd-org-org/OrganizationMember],
   :skos/definition
   "high-level management executive of a corporation or other organization, hired by the board of directors or the business owner(s), charged with certain operational responsibilities, and who has the authority to act on behalf of the organization, including the authority to enter into contracts on behalf of the organization",
   :skos/example
   "Corporate officers may include a Chief Executive Officer (CEO), Chief Financial Officer (CFO), president, vice president(s), and in some cases a Chief Operating Officer (COO), Chief Compliance Officer (CCO), or other executive responsible for a critical function in the organization."})

(def Executive
  "person appointed and given the responsibility to manage the affairs of an organization and the authority to make decisions within specified role-specific boundaries"
  {:db/ident :fibo-be-oac-exec/Executive,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/",
   :rdfs/label "executive",
   :rdfs/subClassOf [{:owl/onClass :fibo-be-le-lp/LegallyCompetentNaturalPerson,
                      :owl/onProperty :fibo-fnd-rel-rel/hasIdentity,
                      :owl/qualifiedCardinality 1,
                      :rdf/type :owl/Restriction}
                     :fibo-be-oac-exec/LegallyDelegatedAuthority],
   :skos/definition
   "person appointed and given the responsibility to manage the affairs of an organization and the authority to make decisions within specified role-specific boundaries"})

(def ExecutiveBoardMember
  "member of a board of directors that is also an employee of the organization"
  {:db/ident :fibo-be-oac-exec/ExecutiveBoardMember,
   :fibo-fnd-utl-av/synonym "inside director",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/",
   :rdfs/label "executive board member",
   :rdfs/subClassOf [:fibo-fnd-org-fm/Employee :fibo-be-oac-exec/BoardMember],
   :skos/definition
   "member of a board of directors that is also an employee of the organization"})

(def LegallyDelegatedAuthority
  "party empowered with some level of legal control and corresponding responsibility"
  {:db/ident :fibo-be-oac-exec/LegallyDelegatedAuthority,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/",
   :rdfs/label "legally delegated authority",
   :rdfs/subClassOf [{:owl/allValuesFrom :fibo-be-le-lp/LegalPerson,
                      :owl/onProperty    :fibo-fnd-rel-rel/hasIdentity,
                      :rdf/type          :owl/Restriction}
                     :fibo-fnd-oac-ctl/ControllingParty],
   :skos/definition
   "party empowered with some level of legal control and corresponding responsibility"})

(def NonExecutiveBoardMember
  "member of the board of directors of an organization that has no executive responsibilities towards the running of that organization"
  {:db/ident :fibo-be-oac-exec/NonExecutiveBoardMember,
   :fibo-fnd-utl-av/synonym "outside director",
   :owl/disjointWith :fibo-be-oac-exec/ExecutiveBoardMember,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/",
   :rdfs/label "non-executive board member",
   :rdfs/subClassOf :fibo-be-oac-exec/BoardMember,
   :skos/definition
   "member of the board of directors of an organization that has no executive responsibilities towards the running of that organization"})

(def PrincipalParty
  "controlling party that is responsible for the management of daily business operations of an organization"
  {:db/ident :fibo-be-oac-exec/PrincipalParty,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/",
   :rdfs/label "principal party",
   :rdfs/subClassOf [:fibo-fnd-org-org/OrganizationMember
                     :fibo-be-oac-exec/Signatory],
   :skos/definition
   "controlling party that is responsible for the management of daily business operations of an organization"})

(def ResponsibleParty
  "person acting in a role that has some formal responsibility, such as a fiduciary responsibility, a signatory, an examiner or registrar, etc."
  {:db/ident :fibo-be-oac-exec/ResponsibleParty,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/",
   :rdfs/label "responsible party",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-pty-rl/isPlayedBy,
     :owl/someValuesFrom {:owl/allValuesFrom :fibo-fnd-law-lcap/Duty,
                          :owl/onProperty :fibo-be-oac-exec/hasResponsibility,
                          :rdf/type :owl/Restriction},
     :rdf/type           :owl/Restriction}
    {:owl/allValuesFrom :fibo-be-le-lp/LegallyCompetentNaturalPerson,
     :owl/onProperty    :fibo-fnd-rel-rel/hasIdentity,
     :rdf/type          :owl/Restriction}
    :fibo-fnd-pty-pty/PartyInRole],
   :skos/definition
   "person acting in a role that has some formal responsibility, such as a fiduciary responsibility, a signatory, an examiner or registrar, etc."})

(def Signatory
  "responsible party authorized to sign agreements on behalf of themselves, another person, or an organization"
  {:db/ident :fibo-be-oac-exec/Signatory,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/",
   :rdfs/label "signatory",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-pty-rl/isPlayedBy,
                      :owl/someValuesFrom {:owl/onProperty
                                           :fibo-fnd-law-lcap/hasCapacity,
                                           :owl/someValuesFrom
                                           :fibo-fnd-law-lcap/SignatoryCapacity,
                                           :rdf/type :owl/Restriction},
                      :rdf/type           :owl/Restriction}
                     :fibo-be-oac-exec/LegallyDelegatedAuthority
                     :fibo-be-oac-exec/AuthorizedParty],
   :skos/definition
   "responsible party authorized to sign agreements on behalf of themselves, another person, or an organization"})

(def authorizes
  "endorses, enables, empowers, or gives permission to"
  {:db/ident :fibo-be-oac-exec/authorizes,
   :owl/inverseOf :fibo-be-oac-exec/isAuthorizedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-oac-exec/AuthorizingParty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/",
   :rdfs/label "authorizes",
   :rdfs/range :fibo-be-oac-exec/AuthorizedParty,
   :rdfs/subPropertyOf :fibo-fnd-pty-pty/actsOn,
   :skos/definition "endorses, enables, empowers, or gives permission to"})

(def authorizesThrough
  "indicates the situation that facilitates designation of an authorized party by the authorizing party for some purpose"
  {:db/ident :fibo-be-oac-exec/authorizesThrough,
   :owl/inverseOf :fibo-be-oac-exec/hasAuthorizingParty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-oac-exec/AuthorizingParty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/",
   :rdfs/label "authorizes through",
   :rdfs/range :fibo-be-oac-exec/Authorization,
   :rdfs/subPropertyOf :fibo-fnd-pty-pty/actsIn,
   :skos/definition
   "indicates the situation that facilitates designation of an authorized party by the authorizing party for some purpose"})

(def delegatesControlTo
  "indicates a party to which this legal person has delegated some authority or control"
  {:db/ident :fibo-be-oac-exec/delegatesControlTo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/",
   :rdfs/label "delegates control to",
   :rdfs/range :fibo-be-oac-exec/LegallyDelegatedAuthority,
   :rdfs/subPropertyOf [:fibo-fnd-rel-rel/designates
                        :fibo-be-oac-exec/authorizes],
   :skos/definition
   "indicates a party to which this legal person has delegated some authority or control"})

(def designatesSignatory
  "authorizes to sign agreements, access accounts and/or perform other similar tasks"
  {:db/ident :fibo-be-oac-exec/designatesSignatory,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/",
   :rdfs/label "designates signatory",
   :rdfs/range :fibo-be-oac-exec/Signatory,
   :rdfs/subPropertyOf [:fibo-fnd-rel-rel/designates
                        :fibo-be-oac-exec/authorizes],
   :skos/definition
   "authorizes to sign agreements, access accounts and/or perform other similar tasks"})

(def elects
  "chooses someone, or a group of individuals, to hold office or some other position by voting"
  {:db/ident :fibo-be-oac-exec/elects,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-pty-pty/PartyInRole,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/",
   :rdfs/label "elects",
   :rdfs/range :fibo-fnd-pty-pty/PartyInRole,
   :skos/definition
   "chooses someone, or a group of individuals, to hold office or some other position by voting",
   :skos/editorialNote
   "In the case of an election of the members of a board of directors, the bylaws state the manner in which that process is effected. The candidate members may be recommended by the board or other proxy and are then elected by the shareholders. A similar process may be conducted to elect outside auditors.",
   :skos/example
   "the election of officers of an association, the election of directors by the shareholders"})

(def hasAuthorizedParty
  "indicates the party that is endorsed, enabled, empowered, or otherwise permitted to do something in the situation"
  {:db/ident :fibo-be-oac-exec/hasAuthorizedParty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-oac-exec/Authorization,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/",
   :rdfs/label "has authorized party",
   :rdfs/range :fibo-be-oac-exec/AuthorizedParty,
   :rdfs/subPropertyOf :fibo-fnd-pty-pty/hasUndergoer,
   :skos/definition
   "indicates the party that is endorsed, enabled, empowered, or otherwise permitted to do something in the situation"})

(def hasAuthorizingParty
  "indicates the party that endorses, enables, empowers, or gives permission in the situation"
  {:db/ident :fibo-be-oac-exec/hasAuthorizingParty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-oac-exec/Authorization,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/",
   :rdfs/label "has authorizing party",
   :rdfs/range :fibo-be-oac-exec/AuthorizingParty,
   :rdfs/subPropertyOf :fibo-fnd-pty-pty/hasActor,
   :skos/definition
   "indicates the party that endorses, enables, empowers, or gives permission in the situation"})

(def hasCorporateOfficer
  "indicates an officer of the organization"
  {:db/ident :fibo-be-oac-exec/hasCorporateOfficer,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-oac-cpty/ControlledParty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/",
   :rdfs/label "has corporate officer",
   :rdfs/range :fibo-be-oac-exec/CorporateOfficer,
   :rdfs/subPropertyOf :fibo-fnd-oac-ctl/hasControllingParty,
   :skos/definition "indicates an officer of the organization"})

(def hasDelegatedControlOf
  "indicates something or some party that is controlled via delegation"
  {:db/ident :fibo-be-oac-exec/hasDelegatedControlOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-oac-exec/LegallyDelegatedAuthority,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/",
   :rdfs/label "has delegated control of",
   :skos/definition
   "indicates something or some party that is controlled via delegation"})

(def hasDirector
  "indicates a member of the board of directors of the organization"
  {:db/ident :fibo-be-oac-exec/hasDirector,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-oac-cpty/ControlledParty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/",
   :rdfs/label "has director",
   :rdfs/range :fibo-be-oac-exec/BoardMember,
   :rdfs/subPropertyOf :fibo-fnd-oac-ctl/hasControllingParty,
   :skos/definition
   "indicates a member of the board of directors of the organization"})

(def hasPrincipalManagingParty
  "indicates a controlling party that is responsible for the management of daily business operations"
  {:db/ident :fibo-be-oac-exec/hasPrincipalManagingParty,
   :owl/inverseOf :fibo-be-oac-exec/isPrincipalPartyOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-oac-cpty/ControlledParty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/",
   :rdfs/label "has principal managing party",
   :rdfs/range :fibo-be-oac-exec/PrincipalParty,
   :rdfs/subPropertyOf :fibo-be-oac-cpty/hasControllingOrganizationMember,
   :skos/definition
   "indicates a controlling party that is responsible for the management of daily business operations"})

(def hasResponsibility
  "specifies a commitment or obligation that an independent party has"
  {:db/ident :fibo-be-oac-exec/hasResponsibility,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-pty-pty/IndependentParty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/",
   :rdfs/label "has responsibility",
   :rdfs/range :fibo-fnd-law-lcap/Duty,
   :rdfs/subPropertyOf :fibo-fnd-law-lcap/hasCapacity,
   :skos/definition
   "specifies a commitment or obligation that an independent party has"})

(def hasResponsibleParty
  "identifies a party that has some assignment, commitment or obligation with respect to the formal organization"
  {:db/ident :fibo-be-oac-exec/hasResponsibleParty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-org-fm/FormalOrganization,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/",
   :rdfs/label "has responsible party",
   :rdfs/range :fibo-be-oac-exec/ResponsibleParty,
   :rdfs/subPropertyOf :fibo-fnd-pty-pty/hasPartyInRole,
   :skos/definition
   "identifies a party that has some assignment, commitment or obligation with respect to the formal organization"})

(def hasSigningAuthorityFor
  "indicates the party for which a signatory has the ability to sign agreements, access accounts and perform related tasks"
  {:db/ident :fibo-be-oac-exec/hasSigningAuthorityFor,
   :owl/inverseOf :fibo-be-oac-exec/designatesSignatory,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-oac-exec/Signatory,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/",
   :rdfs/label "has signing authority for",
   :rdfs/subPropertyOf :fibo-be-oac-exec/isAuthorizedBy,
   :skos/definition
   "indicates the party for which a signatory has the ability to sign agreements, access accounts and perform related tasks"})

(def hasVestedInIt
  "indicates the delegated legal authority that is vested in the controlling party"
  {:db/ident :fibo-be-oac-exec/hasVestedInIt,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-oac-exec/LegallyDelegatedAuthority,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/",
   :rdfs/label "has vested in it",
   :rdfs/range :fibo-fnd-law-lcap/DelegatedLegalAuthority,
   :rdfs/subPropertyOf :fibo-fnd-law-lcap/hasCapacity,
   :skos/definition
   "indicates the delegated legal authority that is vested in the controlling party"})

(def isAuthorizedBy
  "is endorsed, enabled, empowered, or otherwise permitted by"
  {:db/ident :fibo-be-oac-exec/isAuthorizedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-oac-exec/AuthorizedParty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/",
   :rdfs/label "is authorized by",
   :rdfs/range :fibo-be-oac-exec/AuthorizingParty,
   :rdfs/subPropertyOf :fibo-fnd-pty-pty/isAffectedBy,
   :skos/definition
   "is endorsed, enabled, empowered, or otherwise permitted by"})

(def isAuthorizedThrough
  "indicates the situation that faciliates endorsement of the authorized party for some purpose"
  {:db/ident :fibo-be-oac-exec/isAuthorizedThrough,
   :owl/inverseOf :fibo-be-oac-exec/hasAuthorizedParty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-oac-exec/AuthorizedParty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/",
   :rdfs/label "is authorized through",
   :rdfs/range :fibo-be-oac-exec/Authorization,
   :rdfs/subPropertyOf :fibo-fnd-pty-pty/undergoes,
   :skos/definition
   "indicates the situation that faciliates endorsement of the authorized party for some purpose"})

(def isDirectorOf
  "indicates the organization that the board member oversees"
  {:db/ident :fibo-be-oac-exec/isDirectorOf,
   :owl/inverseOf :fibo-be-oac-exec/hasDirector,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-oac-exec/BoardMember,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/",
   :rdfs/label "is director of",
   :rdfs/range :fibo-be-oac-cpty/ControlledParty,
   :rdfs/subPropertyOf :fibo-fnd-oac-ctl/isPartyControlling,
   :skos/definition
   "indicates the organization that the board member oversees"})

(def isOfficerOf
  "indicates the organization that the person has some authority over and managerial responsibility for"
  {:db/ident :fibo-be-oac-exec/isOfficerOf,
   :owl/inverseOf :fibo-be-oac-exec/hasCorporateOfficer,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-oac-exec/CorporateOfficer,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/",
   :rdfs/label "is officer of",
   :rdfs/range :fibo-be-oac-cpty/ControlledParty,
   :rdfs/subPropertyOf :fibo-fnd-oac-ctl/isPartyControlling,
   :skos/definition
   "indicates the organization that the person has some authority over and managerial responsibility for"})

(def isPrincipalPartyOf
  "identifies a legal entity (controlled party) over which a principal has some measure of control"
  {:db/ident :fibo-be-oac-exec/isPrincipalPartyOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-oac-exec/PrincipalParty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/",
   :rdfs/label "is principal party of",
   :rdfs/range :fibo-be-oac-cpty/ControlledParty,
   :rdfs/subPropertyOf :fibo-be-oac-cpty/isControllingMemberOf,
   :skos/definition
   "identifies a legal entity (controlled party) over which a principal has some measure of control"})

(def nominates
  "appoints or proposes for appointment to an office or place"
  {:db/ident :fibo-be-oac-exec/nominates,
   :fibo-fnd-utl-av/usageNote
   "Note that nominates is defined as a relation between two parties-in-role (the range of which could be a corporation or partnership in the case of an auditor), whereas appoints between independent parties.",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-pty-pty/PartyInRole,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/",
   :rdfs/label "nominates",
   :rdfs/range :fibo-fnd-pty-pty/PartyInRole,
   :skos/definition
   "appoints or proposes for appointment to an office or place"})