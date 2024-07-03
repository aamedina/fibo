(ns net.wikipunk.rdf.fibo-fnd-org-org
  {:cmns-av/copyright
   #{"Copyright (c) 2013-2024 EDM Council, Inc."
     "Copyright (c) 2013-2024 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Organizations/Organizations/",
   :dcterms/abstract
   "This ontology defines high-level concepts for organizations and related terms, which is purposefully underspecified to facilitate mapping to specific organization ontologies, such as the W3C organization ontology, organization from a BMM or BPMN perspective, organization from a records management (RMS) perspective, and so forth.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-dsg" "https://www.omg.org/spec/Commons/Designators/",
    "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
    "cmns-pts" "https://www.omg.org/spec/Commons/PartiesAndSituations/",
    "cmns-rlcmp" "https://www.omg.org/spec/Commons/RolesAndCompositions/",
    "cmns-txt" "https://www.omg.org/spec/Commons/TextDatatype/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-gao-obj"
    "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/Objectives/",
    "fibo-fnd-org-org"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Places/Addresses/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/AgentsAndPeople/Agents/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/TextDatatype/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/GoalsAndObjectives/Objectives/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Organizations/Organizations/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fnd-org-org",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations/",
   :rdfs/label "Organizations Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations.rdf version of this ontology was modified per the issue resolutions identified in the FIBO FND 1.0 FTF report and in https://spec.edmcouncil.org/fibo/ontology/FND/1.0/AboutFND-1.0/."
     "The http://www.omg.org/spec/EDMC-FIBO/FND/20160201/Organizations/Organizations.rdf version of this ontology was modified per the FIBO 2.0 RFC, to revise the definition of Organization per ISO 6523."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations.rdf version of this ontology was modified to address hygiene issues with respect to text formatting."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations.rdf version of this ontology was modified to make having a goal optional for any given organization."
     "The http://www.omg.org/spec/FIBO/Foundations/20130601/Organizations/Organizations.owl version of the ontology was revised in advance of the September 2013 New Brunswick, NJ meeting, as follows:\n\t(1) to use slash style URI/IRIss (also called 303 URIs, vs. hash style) as required to support server side processing \n\t(2) to use version-independent IRIs for all definitions internally as opposed to version-specific IRIs\n\t(3) to change the file suffix from .owl to .rdf to increase usability in RDF tools\n\t(4) to use 4-level abbreviations and corresponding namespace prefixes for all FIBO ontologies, reflecting a family/specification/module/ontology structure\n\t(5) to incorporate changes to the specification metadata to support documentation at the family, specification, module, and ontology level, similar to the abbreviations."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations.rdf version of this ontology was modified per the issue resolutions identified in the FIBO FND 1.1 RTF report, to revise a restriction on Organization to reference PhysicalAddress (vs. PostalAddress)."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations.rdf version of this ontology was modified to to move basic organization sub-unit and identifier definitions to FND from BE due to their fundamental nature and reusability and add links to the W3C organization ontology to provide hints as to which classes in this ontology map to the W3C ontology. Note that mappings are approximate and thus we used seeAlso rather than OWL equivalence relations."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations.rdf version of this ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations.rdf version of this ontology was modified to reflect the merge of Goals and Objectives."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations.rdf version of this ontology was modified to allow the Organizations ontology to import Parties, rather than the other way around, to simplify the class hierarchy for ease of use in data mapping and alignment, including moving OrganizationMember from Parties to Organizations, and to add the basis for structured organization name representation."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations.rdf version of this ontology was modified to revise the definition of Organization to broaden its scope to individuals that may or may not be people and eliminate duplication with concepts in LCC."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations/"})

(def MemberBearingOrganization
  {:db/ident :fibo-fnd-org-org/MemberBearingOrganization,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations/"},
   :rdfs/label "member-bearing organization",
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-rlcmp/isPlayedBy,
                       :owl/someValuesFrom {:owl/onProperty :cmns-col/hasMember,
                                            :owl/someValuesFrom :cmns-pts/Party,
                                            :rdf/type :owl/Restriction},
                       :rdf/type           :owl/Restriction}
                      :cmns-pts/PartyRole},
   :skos/definition
   "role of a group or organization that has members that are people or other organizations"})

(def Membership
  {:db/ident :fibo-fnd-org-org/Membership,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "membership"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.w3.org/TR/vocab-org/#class-membership"},
   :rdfs/subClassOf #{{:owl/onProperty :fibo-fnd-org-org/hasMembership,
                       :owl/someValuesFrom
                       :fibo-fnd-org-org/MemberBearingOrganization,
                       :rdf/type :owl/Restriction}
                      {:owl/onProperty :fibo-fnd-org-org/hasOrganizationMember,
                       :owl/someValuesFrom :fibo-fnd-org-org/OrganizationMember,
                       :rdf/type :owl/Restriction} :cmns-pts/Situation},
   :skos/definition
   "situation, corresponding to an n-ary relation, in which some group or organization has at least one member (person or organization) for some period of time"})

(def Organization
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.iso.org/obp/ui/#iso:std:iso-iec:6523:-1:ed-1:v1:en"},
   :db/ident :fibo-fnd-org-org/Organization,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "organization"},
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.w3.org/TR/vocab-org/#org:Organization"},
   :rdfs/subClassOf #{{:owl/allValuesFrom :cmns-pts/Party,
                       :owl/onProperty    :cmns-col/hasMember,
                       :rdf/type          :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-fnd-gao-obj/Goal,
                       :owl/onProperty :fibo-fnd-gao-obj/hasGoal,
                       :rdf/type       :owl/Restriction} :cmns-pts/Party
                      {:owl/allValuesFrom :fibo-fnd-org-org/Organization,
                       :owl/onProperty    :cmns-col/hasPart,
                       :rdf/type          :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-fnd-org-org/OrganizationName,
                       :owl/onProperty :cmns-dsg/hasName,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "collection of one or more people, or groups of people formed together into a community or other social, commercial or political structure to act, or that is designated to act, towards some purpose, such as to meet a need or pursue collective goals on a continuing basis",
   :skos/example
   "This may be a business entity, government, international organization, not-for-profit, academic institution, or other unincorporated and/or informal social organization."})

(def OrganizationIdentificationScheme
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.iso.org/obp/ui/#iso:std:iso-iec:6523:-1:ed-1:v1:en"},
   :db/ident :fibo-fnd-org-org/OrganizationIdentificationScheme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations/"},
   :rdfs/label "organization identification scheme",
   :rdfs/subClassOf :cmns-id/IdentificationScheme,
   :skos/definition
   "identification scheme dedicated to the unique identification of organizations"})

(def OrganizationIdentifier
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.iso.org/obp/ui/#iso:std:iso-iec:6523:-1:ed-1:v1:en"},
   :db/ident :fibo-fnd-org-org/OrganizationIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations/"},
   :rdfs/label "organization identifier",
   :rdfs/subClassOf #{:cmns-id/Identifier
                      {:owl/onClass
                       :fibo-fnd-org-org/OrganizationIdentificationScheme,
                       :owl/onProperty :cmns-col/isMemberOf,
                       :owl/qualifiedCardinality 1,
                       :rdf/type :owl/Restriction}
                      {:owl/onClass    :fibo-fnd-org-org/Organization,
                       :owl/onProperty :cmns-id/identifies,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "identifier assigned to an organization within an organization identification scheme, and unique within that scheme"})

(def OrganizationMember
  {:db/ident :fibo-fnd-org-org/OrganizationMember,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations/"},
   :rdfs/label "organization member",
   :rdfs/seeAlso {:xsd/anyURI "https://www.w3.org/TR/vocab-org/#org:Role"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :cmns-rlcmp/isPlayedBy,
      :owl/someValuesFrom {:owl/allValuesFrom :fibo-fnd-org-org/Organization,
                           :owl/onProperty    :cmns-col/isMemberOf,
                           :rdf/type          :owl/Restriction},
      :rdf/type           :owl/Restriction} :cmns-pts/PartyRole},
   :skos/definition
   "party (person or organization) that has a membership role with respect to some organization"})

(def OrganizationName
  {:db/ident :fibo-fnd-org-org/OrganizationName,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations/"},
   :rdfs/label "organization name",
   :rdfs/subClassOf #{:cmns-cxtdsg/ContextualName
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-fnd-org-org/Organization,
                       :owl/onProperty :cmns-dsg/isNameOf,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "designation by which some organization is known in some context"})

(def OrganizationPartIdentifier
  {:cmns-av/abbreviation "OPI",
   :cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.iso.org/obp/ui/#iso:std:iso-iec:6523:-1:ed-1:v1:en"},
   :cmns-av/synonym "organization sub-unit identifier",
   :db/ident :fibo-fnd-org-org/OrganizationPartIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations/"},
   :rdfs/label "organization part identifier",
   :rdfs/subClassOf #{:cmns-id/Identifier
                      {:owl/onClass    :fibo-fnd-org-org/OrganizationalSubUnit,
                       :owl/onProperty :cmns-id/identifies,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "identifier allocated to a particular organizational sub-unit"})

(def OrganizationalSubUnit
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://www.iso.org/obp/ui/#iso:std:iso-iec:6523:-1:ed-1:v1:en"},
   :cmns-av/explanatoryNote
   "In other words, it is not a legal entity in its own right.",
   :cmns-av/synonym "organization part",
   :db/ident :fibo-fnd-org-org/OrganizationalSubUnit,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations/"},
   :rdfs/label "organizational sub-unit",
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.w3.org/TR/vocab-org/#org:OrganizationalUnit"},
   :rdfs/subClassOf #{:fibo-fnd-org-org/Organization
                      {:owl/allValuesFrom :fibo-fnd-org-org/Organization,
                       :owl/onProperty    :cmns-col/isPartOf,
                       :rdf/type          :owl/Restriction}},
   :skos/definition
   "any department, service, and other entity within a larger organization that only has full recognition within the context of that organization, but requires identification for some purpose"})

(def hasMembership
  {:db/ident :fibo-fnd-org-org/hasMembership,
   :owl/inverseOf :fibo-fnd-org-org/isMembershipPartyIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-org-org/Membership,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations/"},
   :rdfs/label "has membership role",
   :rdfs/range :fibo-fnd-org-org/MemberBearingOrganization,
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.w3.org/TR/vocab-org/#org:organization"},
   :rdfs/subPropertyOf :cmns-pts/hasActor,
   :skos/definition
   "identifies the organization acting in the role of having members in an organizational membership situation"})

(def hasOrganizationMember
  {:db/ident :fibo-fnd-org-org/hasOrganizationMember,
   :owl/inverseOf :fibo-fnd-org-org/isOrganizationMember,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-org-org/Membership,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations/"},
   :rdfs/label "has organization member",
   :rdfs/range :fibo-fnd-org-org/OrganizationMember,
   :rdfs/seeAlso {:xsd/anyURI "https://www.w3.org/TR/vocab-org/#org:member"},
   :rdfs/subPropertyOf :cmns-pts/hasUndergoer,
   :skos/definition
   "indicates the party that is the member in an organizational membership situation"})

(def hasSubUnit
  {:db/ident :fibo-fnd-org-org/hasSubUnit,
   :owl/inverseOf :fibo-fnd-org-org/isSubUnitOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-org-org/Organization,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations/"},
   :rdfs/label "has sub-unit",
   :rdfs/range :fibo-fnd-org-org/OrganizationalSubUnit,
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.w3.org/TR/vocab-org/#org:hasSubOrganization"},
   :rdfs/subPropertyOf :cmns-col/hasPart,
   :skos/definition "relates an organization to a part of that organization"})

(def isMembershipPartyIn
  {:db/ident :fibo-fnd-org-org/isMembershipPartyIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-org-org/MemberBearingOrganization,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations/"},
   :rdfs/label "is membership party in",
   :rdfs/range :fibo-fnd-org-org/Membership,
   :rdfs/subPropertyOf :cmns-pts/actsIn,
   :skos/definition
   "indicates the context of membership in which the party plays the role of having members"})

(def isOrganizationMember
  {:db/ident :fibo-fnd-org-org/isOrganizationMember,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-org-org/OrganizationMember,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations/"},
   :rdfs/label "is organization member",
   :rdfs/range :fibo-fnd-org-org/Membership,
   :rdfs/seeAlso {:xsd/anyURI "https://www.w3.org/TR/vocab-org/#org:role"},
   :rdfs/subPropertyOf :cmns-pts/undergoes,
   :skos/definition
   "indicates the context of membership in which some party is an organization member"})

(def isSubUnitOf
  {:db/ident :fibo-fnd-org-org/isSubUnitOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-org-org/OrganizationalSubUnit,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations/"},
   :rdfs/label "is sub-unit of",
   :rdfs/range :fibo-fnd-org-org/Organization,
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.w3.org/TR/vocab-org/#org:subOrganizationOf"},
   :rdfs/subPropertyOf :cmns-col/isPartOf,
   :skos/definition "relates a part of an organization to the larger entity"})

(def urn:uuid:bd6f2217-93be-5bc7-9632-036d470a2d8e
  {:cmns-av/copyright
   #{"Copyright (c) 2013-2024 EDM Council, Inc."
     "Copyright (c) 2013-2024 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology defines high-level concepts for organizations and related terms, which is purposefully underspecified to facilitate mapping to specific organization ontologies, such as the W3C organization ontology, organization from a BMM or BPMN perspective, organization from a records management (RMS) perspective, and so forth.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Places/Addresses/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/AgentsAndPeople/Agents/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/TextDatatype/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/GoalsAndObjectives/Objectives/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Organizations/Organizations/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Organizations Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations.rdf version of this ontology was modified per the issue resolutions identified in the FIBO FND 1.0 FTF report and in https://spec.edmcouncil.org/fibo/ontology/FND/1.0/AboutFND-1.0/."
     "The http://www.omg.org/spec/EDMC-FIBO/FND/20160201/Organizations/Organizations.rdf version of this ontology was modified per the FIBO 2.0 RFC, to revise the definition of Organization per ISO 6523."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations.rdf version of this ontology was modified to address hygiene issues with respect to text formatting."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations.rdf version of this ontology was modified to make having a goal optional for any given organization."
     "The http://www.omg.org/spec/FIBO/Foundations/20130601/Organizations/Organizations.owl version of the ontology was revised in advance of the September 2013 New Brunswick, NJ meeting, as follows:\n\t(1) to use slash style URI/IRIss (also called 303 URIs, vs. hash style) as required to support server side processing \n\t(2) to use version-independent IRIs for all definitions internally as opposed to version-specific IRIs\n\t(3) to change the file suffix from .owl to .rdf to increase usability in RDF tools\n\t(4) to use 4-level abbreviations and corresponding namespace prefixes for all FIBO ontologies, reflecting a family/specification/module/ontology structure\n\t(5) to incorporate changes to the specification metadata to support documentation at the family, specification, module, and ontology level, similar to the abbreviations."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations.rdf version of this ontology was modified per the issue resolutions identified in the FIBO FND 1.1 RTF report, to revise a restriction on Organization to reference PhysicalAddress (vs. PostalAddress)."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations.rdf version of this ontology was modified to to move basic organization sub-unit and identifier definitions to FND from BE due to their fundamental nature and reusability and add links to the W3C organization ontology to provide hints as to which classes in this ontology map to the W3C ontology. Note that mappings are approximate and thus we used seeAlso rather than OWL equivalence relations."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations.rdf version of this ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations.rdf version of this ontology was modified to reflect the merge of Goals and Objectives."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations.rdf version of this ontology was modified to allow the Organizations ontology to import Parties, rather than the other way around, to simplify the class hierarchy for ease of use in data mapping and alignment, including moving OrganizationMember from Parties to Organizations, and to add the basis for structured organization name representation."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations.rdf version of this ontology was modified to revise the definition of Organization to broaden its scope to individuals that may or may not be people and eliminate duplication with concepts in LCC."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations/"})