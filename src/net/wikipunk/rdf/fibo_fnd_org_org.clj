(ns net.wikipunk.rdf.fibo-fnd-org-org
  "This ontology defines high-level concepts for organizations and related terms, which is purposefully underspecified to facilitate mapping to specific organization ontologies, such as the W3C organization ontology, organization from a BMM or BPMN perspective, organization from a records management (RMS) perspective, and so forth."
  {:cmns-av/copyright ["Copyright (c) 2013-2023 EDM Council, Inc."
                       "Copyright (c) 2013-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations/",
   :dcterms/abstract
   "This ontology defines high-level concepts for organizations and related terms, which is purposefully underspecified to facilitate mapping to specific organization ontologies, such as the W3C organization ontology, organization from a BMM or BPMN perspective, organization from a records management (RMS) perspective, and so forth.",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Parties/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/GoalsAndObjectives/Objectives/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Addresses/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/AgentsAndPeople/Agents/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Roles/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Organizations/Organizations/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-aap-agt"
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents/",
    "fibo-fnd-gao-obj"
    "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/Objectives/",
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
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "lcc-lr" "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fnd-org-org",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations/",
   :rdfs/label "Organizations Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations.rdf version of this ontology was modified to to move basic organization sub-unit and identifier definitions to FND from BE due to their fundamental nature and reusability and add links to the W3C organization ontology to provide hints as to which classes in this ontology map to the W3C ontology. Note that mappings are approximate and thus we used seeAlso rather than OWL equivalence relations."
    "The http://www.omg.org/spec/FIBO/Foundations/20130601/Organizations/Organizations.owl version of the ontology was revised in advance of the September 2013 New Brunswick, NJ meeting, as follows:\n\t(1) to use slash style URI/IRIss (also called 303 URIs, vs. hash style) as required to support server side processing \n\t(2) to use version-independent IRIs for all definitions internally as opposed to version-specific IRIs\n\t(3) to change the file suffix from .owl to .rdf to increase usability in RDF tools\n\t(4) to use 4-level abbreviations and corresponding namespace prefixes for all FIBO ontologies, reflecting a family/specification/module/ontology structure\n\t(5) to incorporate changes to the specification metadata to support documentation at the family, specification, module, and ontology level, similar to the abbreviations."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations.rdf version of this ontology was modified to reflect the merge of Goals and Objectives."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations.rdf version of this ontology was modified to allow the Organizations ontology to import Parties, rather than the other way around, to simplify the class hierarchy for ease of use in data mapping and alignment, including moving OrganizationMember from Parties to Organizations, and to add the basis for structured organization name representation."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations.rdf version of this ontology was modified to address hygiene issues with respect to text formatting."
    "The http://www.omg.org/spec/EDMC-FIBO/FND/20160201/Organizations/Organizations.rdf version of this ontology was modified per the FIBO 2.0 RFC, to revise the definition of Organization per ISO 6523."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations.rdf version of this ontology was modified per the issue resolutions identified in the FIBO FND 1.0 FTF report and in https://spec.edmcouncil.org/fibo/ontology/FND/1.0/AboutFND-1.0/."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations.rdf version of this ontology was modified to revise the definition of Organization to broaden its scope to individuals that may or may not be people and eliminate duplication with concepts in LCC."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations.rdf version of this ontology was modified to make having a goal optional for any given organization."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations.rdf version of this ontology was modified per the issue resolutions identified in the FIBO FND 1.1 RTF report, to revise a restriction on Organization to reference PhysicalAddress (vs. PostalAddress)."]})

(def MemberBearingOrganization
  "role of a group or organization that has members that are people or other organizations"
  {:db/ident :fibo-fnd-org-org/MemberBearingOrganization,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations/",
   :rdfs/label "member-bearing organization",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-pty-rl/isPlayedBy,
                      :owl/someValuesFrom {:owl/onProperty :lcc-lr/hasMember,
                                           :owl/someValuesFrom
                                           :fibo-fnd-pty-pty/IndependentParty,
                                           :rdf/type :owl/Restriction},
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-pty-pty/PartyInRole],
   :skos/definition
   "role of a group or organization that has members that are people or other organizations"})

(def Membership
  "situation, corresponding to an n-ary relation, in which some group or organization has at least one member (person or organization) for some period of time"
  {:db/ident :fibo-fnd-org-org/Membership,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "membership"},
   :rdfs/seeAlso ["https://www.w3.org/TR/vocab-org/#class-membership"],
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-org-org/hasOrganizationMember,
                      :owl/someValuesFrom :fibo-fnd-org-org/OrganizationMember,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty :fibo-fnd-org-org/hasMembership,
                      :owl/someValuesFrom
                      :fibo-fnd-org-org/MemberBearingOrganization,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-pty-pty/Situation],
   :skos/definition
   "situation, corresponding to an n-ary relation, in which some group or organization has at least one member (person or organization) for some period of time"})

(def Organization
  "collection of one or more people, or groups of people formed together into a community or other social, commercial or political structure to act, or that is designated to act, towards some purpose, such as to meet a need or pursue collective goals on a continuing basis"
  {:cmns-av/adaptedFrom
   "https://www.iso.org/obp/ui/#iso:std:iso-iec:6523:-1:ed-1:v1:en",
   :db/ident :fibo-fnd-org-org/Organization,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "organization"},
   :rdfs/seeAlso ["https://www.w3.org/TR/vocab-org/#org:Organization"],
   :rdfs/subClassOf [{:owl/allValuesFrom :fibo-fnd-org-org/Organization,
                      :owl/onProperty    :lcc-cr/hasPart,
                      :rdf/type          :owl/Restriction}
                     {:owl/allValuesFrom :fibo-fnd-pty-pty/IndependentParty,
                      :owl/onProperty    :lcc-lr/hasMember,
                      :rdf/type          :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-gao-obj/Goal,
                      :owl/onProperty :fibo-fnd-gao-obj/hasGoal,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-org-org/OrganizationName,
                      :owl/onProperty :fibo-fnd-aap-agt/hasStructuredName,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-pty-pty/IndependentParty],
   :skos/definition
   "collection of one or more people, or groups of people formed together into a community or other social, commercial or political structure to act, or that is designated to act, towards some purpose, such as to meet a need or pursue collective goals on a continuing basis",
   :skos/example
   "This may be a business entity, government, international organization, not-for-profit, academic institution, or other unincorporated and/or informal social organization."})

(def OrganizationIdentificationScheme
  "identification scheme dedicated to the unique identification of organizations"
  {:cmns-av/adaptedFrom
   "https://www.iso.org/obp/ui/#iso:std:iso-iec:6523:-1:ed-1:v1:en",
   :db/ident :fibo-fnd-org-org/OrganizationIdentificationScheme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations/",
   :rdfs/label "organization identification scheme",
   :rdfs/subClassOf :lcc-lr/IdentificationScheme,
   :skos/definition
   "identification scheme dedicated to the unique identification of organizations"})

(def OrganizationIdentifier
  "identifier assigned to an organization within an organization identification scheme, and unique within that scheme"
  {:cmns-av/adaptedFrom
   "https://www.iso.org/obp/ui/#iso:std:iso-iec:6523:-1:ed-1:v1:en",
   :db/ident :fibo-fnd-org-org/OrganizationIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations/",
   :rdfs/label "organization identifier",
   :rdfs/subClassOf [{:owl/onClass
                      :fibo-fnd-org-org/OrganizationIdentificationScheme,
                      :owl/onProperty :lcc-lr/isMemberOf,
                      :owl/qualifiedCardinality 1,
                      :rdf/type :owl/Restriction}
                     {:owl/onClass    :fibo-fnd-org-org/Organization,
                      :owl/onProperty :lcc-lr/identifies,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :lcc-lr/Identifier],
   :skos/definition
   "identifier assigned to an organization within an organization identification scheme, and unique within that scheme"})

(def OrganizationMember
  "party (person or organization) that has a membership role with respect to some organization"
  {:db/ident :fibo-fnd-org-org/OrganizationMember,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations/",
   :rdfs/label "organization member",
   :rdfs/seeAlso ["https://www.w3.org/TR/vocab-org/#org:Role"],
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-pty-rl/isPlayedBy,
                      :owl/someValuesFrom {:owl/allValuesFrom
                                           :fibo-fnd-org-org/Organization,
                                           :owl/onProperty :lcc-lr/isMemberOf,
                                           :rdf/type :owl/Restriction},
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-pty-pty/PartyInRole],
   :skos/definition
   "party (person or organization) that has a membership role with respect to some organization"})

(def OrganizationName
  "designation by which some organization is known in some context"
  {:db/ident :fibo-fnd-org-org/OrganizationName,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations/",
   :rdfs/label "organization name",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :fibo-fnd-aap-agt/Text,
                      :owl/onProperty  :fibo-fnd-rel-rel/hasLegalName,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-org-org/Organization,
                      :owl/onProperty :fibo-fnd-aap-agt/isStructuredNameOf,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-pty-pty/ContextualName],
   :skos/definition
   "designation by which some organization is known in some context"})

(def OrganizationPartIdentifier
  "identifier allocated to a particular organizational sub-unit"
  {:cmns-av/abbreviation "OPI",
   :cmns-av/adaptedFrom
   "https://www.iso.org/obp/ui/#iso:std:iso-iec:6523:-1:ed-1:v1:en",
   :cmns-av/synonym "organization sub-unit identifier",
   :db/ident :fibo-fnd-org-org/OrganizationPartIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations/",
   :rdfs/label "organization part identifier",
   :rdfs/subClassOf [{:owl/onClass    :fibo-fnd-org-org/OrganizationalSubUnit,
                      :owl/onProperty :lcc-lr/identifies,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :lcc-lr/Identifier],
   :skos/definition
   "identifier allocated to a particular organizational sub-unit"})

(def OrganizationalSubUnit
  "any department, service, and other entity within a larger organization that only has full recognition within the context of that organization, but requires identification for some purpose"
  {:cmns-av/adaptedFrom
   "https://www.iso.org/obp/ui/#iso:std:iso-iec:6523:-1:ed-1:v1:en",
   :cmns-av/explanatoryNote
   "In other words, it is not a legal entity in its own right.",
   :cmns-av/synonym "organization part",
   :db/ident :fibo-fnd-org-org/OrganizationalSubUnit,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations/",
   :rdfs/label "organizational sub-unit",
   :rdfs/seeAlso ["https://www.w3.org/TR/vocab-org/#org:OrganizationalUnit"],
   :rdfs/subClassOf [{:owl/allValuesFrom :fibo-fnd-org-org/Organization,
                      :owl/onProperty    :lcc-cr/isPartOf,
                      :rdf/type          :owl/Restriction}
                     :fibo-fnd-org-org/Organization],
   :skos/definition
   "any department, service, and other entity within a larger organization that only has full recognition within the context of that organization, but requires identification for some purpose"})

(def hasMembership
  "identifies the organization acting in the role of having members in an organizational membership situation"
  {:db/ident :fibo-fnd-org-org/hasMembership,
   :owl/inverseOf :fibo-fnd-org-org/isMembershipPartyIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-org-org/Membership,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations/",
   :rdfs/label "has membership role",
   :rdfs/range :fibo-fnd-org-org/MemberBearingOrganization,
   :rdfs/seeAlso ["https://www.w3.org/TR/vocab-org/#org:organization"],
   :rdfs/subPropertyOf :fibo-fnd-pty-pty/hasActor,
   :skos/definition
   "identifies the organization acting in the role of having members in an organizational membership situation"})

(def hasOrganizationMember
  "indicates the party that is the member in an organizational membership situation"
  {:db/ident :fibo-fnd-org-org/hasOrganizationMember,
   :owl/inverseOf :fibo-fnd-org-org/isOrganizationMember,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-org-org/Membership,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations/",
   :rdfs/label "has organization member",
   :rdfs/range :fibo-fnd-org-org/OrganizationMember,
   :rdfs/seeAlso ["https://www.w3.org/TR/vocab-org/#org:member"],
   :rdfs/subPropertyOf :fibo-fnd-pty-pty/hasUndergoer,
   :skos/definition
   "indicates the party that is the member in an organizational membership situation"})

(def hasSubUnit
  "relates an organization to a part of that organization"
  {:db/ident :fibo-fnd-org-org/hasSubUnit,
   :owl/inverseOf :fibo-fnd-org-org/isSubUnitOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-org-org/Organization,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations/",
   :rdfs/label "has sub-unit",
   :rdfs/range :fibo-fnd-org-org/OrganizationalSubUnit,
   :rdfs/seeAlso ["https://www.w3.org/TR/vocab-org/#org:hasSubOrganization"],
   :rdfs/subPropertyOf :lcc-cr/hasPart,
   :skos/definition "relates an organization to a part of that organization"})

(def isMembershipPartyIn
  "indicates the context of membership in which the party plays the role of having members"
  {:db/ident :fibo-fnd-org-org/isMembershipPartyIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-org-org/MemberBearingOrganization,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations/",
   :rdfs/label "is membership party in",
   :rdfs/range :fibo-fnd-org-org/Membership,
   :rdfs/subPropertyOf :fibo-fnd-pty-pty/actsIn,
   :skos/definition
   "indicates the context of membership in which the party plays the role of having members"})

(def isOrganizationMember
  "indicates the context of membership in which some party is an organization member"
  {:db/ident :fibo-fnd-org-org/isOrganizationMember,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-org-org/OrganizationMember,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations/",
   :rdfs/label "is organization member",
   :rdfs/range :fibo-fnd-org-org/Membership,
   :rdfs/seeAlso ["https://www.w3.org/TR/vocab-org/#org:role"],
   :rdfs/subPropertyOf :fibo-fnd-pty-pty/undergoes,
   :skos/definition
   "indicates the context of membership in which some party is an organization member"})

(def isSubUnitOf
  "relates a part of an organization to the larger entity"
  {:db/ident :fibo-fnd-org-org/isSubUnitOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-org-org/OrganizationalSubUnit,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations/",
   :rdfs/label "is sub-unit of",
   :rdfs/range :fibo-fnd-org-org/Organization,
   :rdfs/seeAlso ["https://www.w3.org/TR/vocab-org/#org:subOrganizationOf"],
   :rdfs/subPropertyOf :lcc-cr/isPartOf,
   :skos/definition "relates a part of an organization to the larger entity"})