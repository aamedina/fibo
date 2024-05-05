(ns net.wikipunk.rdf.fibo-fnd-org-fm
  {:cmns-av/copyright
   #{"Copyright (c) 2013-2024 EDM Council, Inc."
     "Copyright (c) 2013-2024 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Organizations/FormalOrganizations/",
   :dcterms/abstract
   "This ontology defines the high level concept of a formal organization, which is purposefully underspecified to facilitate mapping to other organization ontologies, such as the W3C organization ontology, or others defined for specific business and financial services standards. It also defines general concepts related to employment by a formal organization.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-pts" "https://www.omg.org/spec/Commons/PartiesAndSituations/",
    "cmns-rlcmp" "https://www.omg.org/spec/Commons/RolesAndCompositions/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-aap-ppl"
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
    "fibo-fnd-org-fm"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations/",
    "fibo-fnd-org-org"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations/",
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
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Organizations/Organizations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/AgentsAndPeople/People/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Organizations/FormalOrganizations/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fnd-org-fm",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations/",
   :rdfs/label "Formal Organizations Ontology",
   :skos/changeNote
   #{"The http://www.omg.org/spec/FIBO/Foundations/20130601/Organizations/FormalOrganizations.owl version of the ontology was revised in advance of the September 2013 New Brunswick, NJ meeting, as follows:\n\t(1) to use slash style URI/IRIss (also called 303 URIs, vs. hash style) as required to support server side processing \n\t(2) to use version-independent IRIs for all definitions internally as opposed to version-specific IRIs\n\t(3) to change the file suffix from .owl to .rdf to increase usability in RDF tools\n\t(4) to use 4-level abbreviations and corresponding namespace prefixes for all FIBO ontologies, reflecting a family/specification/module/ontology structure\n\t(5) to incorporate changes to the specification metadata to support documentation at the family, specification, module, and ontology level, similar to the abbreviations."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The http://www.omg.org/spec/EDMC-FIBO/FND/20141101/Organizations/FormalOrganizations.rdf version of this ontology was modified per the FIBO 2.0 RFC to integrate concepts from LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations.rdf version of this ontology was revised to address hygiene issues with respect to text formatting."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations.rdf version of this ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The http://www.omg.org/spec/EDMC-FIBO/FND/20130801/Organizations/FormalOrganizations.rdf version of this ontology was modified per the issue resolutions identified in the FIBO FND 1.0 FTF report and in http://www.omg.org/spec/EDMC-FIBO/FND/1.0/AboutFND-1.0/. It was further revised in the FTF in advance of the Long Beach meeting, resulting in http://www.omg.org/spec/EDMC-FIBO/FND/20141101/Organizations/FormalOrganizations/."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations.rdf version of this ontology was revised to loosen the constraints on the range of isDomiciledIn, allow for multiple values, update definitions to be ISO 704 compliant, and eliminate duplication with concepts in LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations.rdf version of this ontology was modified to loosen the domain of 'is domiciled in' to include organization sub-units, such as branches and divisions."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations.rdf version of this ontology was revised to incorporate the concept of employment, required to support regulatory reporting."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations/"})

(def Employee
  {:db/ident :fibo-fnd-org-fm/Employee,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations/"},
   :rdfs/label "employee",
   :rdfs/seeAlso {:xsd/anyURI
                  "https://www.bls.gov/opub/mlr/2002/01/art1full.pdf"},
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fnd-org-fm/isEmployedIn,
                       :owl/someValuesFrom :fibo-fnd-org-fm/Employment,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :cmns-rlcmp/isPlayedBy,
                       :owl/someValuesFrom :fibo-fnd-aap-ppl/Person,
                       :rdf/type           :owl/Restriction}
                      :fibo-fnd-org-org/OrganizationMember
                      {:owl/onProperty     :fibo-fnd-org-fm/isEmployeeOf,
                       :owl/someValuesFrom :fibo-fnd-org-fm/Employer,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "person in the service of another under any contract of hire, express or implied, oral or written, where the employer has the right to control and direct that person in the material details of how the work is to be performed"})

(def Employer
  {:db/ident :fibo-fnd-org-fm/Employer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations/"},
   :rdfs/label "employer",
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fnd-org-fm/hasEmployee,
                       :owl/someValuesFrom :fibo-fnd-org-fm/Employee,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :fibo-fnd-org-fm/isEmployingParty,
                       :owl/someValuesFrom :fibo-fnd-org-fm/Employment,
                       :rdf/type           :owl/Restriction}
                      :fibo-fnd-org-org/MemberBearingOrganization},
   :skos/definition
   "party that provides compensation, including wages or a salary and potentially other benefits, in exchange for work performed by one or more people, and that has the right to control and direct the employee in the material details of how the work is to be performed"})

(def Employment
  {:cmns-av/explanatoryNote
   "In the broadest sense, employment is the situation in which someone is fully engaged in doing something that they want to do. From a FIBO perspective, however, employment is understood to be more specific. It is the relationship between two parties, evidenced by an implicit or explicit contract, in which work is compensated and in which one party, a legal person, typically a formal organization, acts as the employer and the other, typically a legally capable natural person, as the employee.",
   :db/ident :fibo-fnd-org-fm/Employment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "employment"},
   :rdfs/subClassOf #{:fibo-fnd-org-org/Membership
                      {:owl/onProperty     :fibo-fnd-org-fm/hasEmployingParty,
                       :owl/someValuesFrom :fibo-fnd-org-fm/Employer,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :fibo-fnd-org-fm/hasEmployedParty,
                       :owl/someValuesFrom :fibo-fnd-org-fm/Employee,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "situation representing the state of being employed, i.e., the relationship that holds between an employer and employee for some period of time",
   :skos/scopeNote
   "This definition does not include workers in contingent arrangements, such as independent contractors, leased employees, temporary employees, on-call workers, and others that do not have a direct contractual relationship with the employer. The distinction is important for legal reasons, particularly for regulatory reporting with respect to responsible parties such as corporate officers, lending officers, others authorized or licensed to perform certain tasks, and traders, for example."})

(def FormalOrganization
  {:cmns-av/adaptedFrom
   {:xsd/anyURI "https://www.w3.org/TR/vocab-org/#class-formalorganization"},
   :db/ident :fibo-fnd-org-fm/FormalOrganization,
   :owl/disjointWith :fibo-fnd-org-fm/InformalOrganization,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations/"},
   :rdfs/label "formal organization",
   :rdfs/subClassOf #{:fibo-fnd-org-org/Organization
                      {:owl/onProperty     :fibo-fnd-org-fm/isDomiciledIn,
                       :owl/someValuesFrom :lcc-cr/GeopoliticalEntity,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "organization that is recognized in some legal jurisdiction, with associated rights and responsibilities",
   :skos/example
   "Examples include a corporation, charity, government or church."})

(def Group
  {:db/ident :fibo-fnd-org-fm/Group,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations/"},
   :rdfs/label "group",
   :rdfs/subClassOf #{:cmns-col/Collection
                      {:owl/allValuesFrom :cmns-pts/Agent,
                       :owl/onProperty    :cmns-col/hasMember,
                       :rdf/type          :owl/Restriction}},
   :skos/definition
   "collection of agents (people, organizations, software agents, etc.) that are considered as a unit"})

(def InformalOrganization
  {:db/ident :fibo-fnd-org-fm/InformalOrganization,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations/"},
   :rdfs/label "informal organization",
   :rdfs/subClassOf :fibo-fnd-org-org/Organization,
   :skos/definition
   "organization that is not formally constituted in some way"})

(def employs
  {:db/ident :fibo-fnd-org-fm/employs,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations/"},
   :rdfs/label "employs",
   :rdfs/range :fibo-fnd-aap-ppl/Person,
   :rdfs/subPropertyOf :cmns-pts/playsActiveRoleThatDirectlyAffects,
   :skos/definition "indicates someone that is employed by the legal person"})

(def hasEmployedParty
  {:db/ident :fibo-fnd-org-fm/hasEmployedParty,
   :owl/inverseOf :fibo-fnd-org-fm/isEmployedIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-org-fm/Employment,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations/"},
   :rdfs/label "has employed party",
   :rdfs/range :fibo-fnd-org-fm/Employee,
   :rdfs/subPropertyOf :fibo-fnd-org-org/hasOrganizationMember,
   :skos/definition "identifies the employee in an employment situation"})

(def hasEmployee
  {:db/ident :fibo-fnd-org-fm/hasEmployee,
   :owl/inverseOf :fibo-fnd-org-fm/isEmployeeOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-org-fm/Employer,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations/"},
   :rdfs/label "has employee",
   :rdfs/range :fibo-fnd-org-fm/Employee,
   :rdfs/subPropertyOf :cmns-pts/actsOn,
   :skos/definition "indicates an employee that is employed by the employer"})

(def hasEmployingParty
  {:db/ident :fibo-fnd-org-fm/hasEmployingParty,
   :owl/inverseOf :fibo-fnd-org-fm/isEmployingParty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-org-fm/Employment,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations/"},
   :rdfs/label "has employing party",
   :rdfs/range :fibo-fnd-org-fm/Employer,
   :rdfs/subPropertyOf :fibo-fnd-org-org/hasMembership,
   :skos/definition "identifies employer in an employment situation"})

(def isDomiciledIn
  {:cmns-av/explanatoryNote
   "Corporate domicile refers to a place where a company's affairs are discharged. It is also typically the legal home of a corporation because the place is considered by law as the center of corporate affairs. In cases where a business has incorporated in one location for convenience, such as for taxation, legal, or regulatory purposes, but operates primarily in one or more other locations, domicile in FIBO refers to the operational location(s) rather than legal location. Many companies in the US have incorporated in the State of Delaware, for example, but do not have operational facilities in Delaware (or only have small offices there).",
   :db/ident :fibo-fnd-org-fm/isDomiciledIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain {:owl/unionOf [:fibo-fnd-org-fm/FormalOrganization
                               :fibo-fnd-org-org/OrganizationalSubUnit],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations/"},
   :rdfs/label "is domiciled in",
   :rdfs/range :lcc-cr/GeopoliticalEntity,
   :skos/definition
   "indicates the principal place where an entity conducts business, such as where its headquarters is located"})

(def isEmployedBy
  {:db/ident :fibo-fnd-org-fm/isEmployedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-aap-ppl/Person,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations/"},
   :rdfs/label "is employed by",
   :rdfs/subPropertyOf :cmns-pts/experiencesDirectly,
   :skos/definition
   "indicates the party (legal person or formal organization) that employs someone"})

(def isEmployedIn
  {:db/ident :fibo-fnd-org-fm/isEmployedIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-org-fm/Employee,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations/"},
   :rdfs/label "is employed in",
   :rdfs/range :fibo-fnd-org-fm/Employment,
   :rdfs/subPropertyOf :fibo-fnd-org-org/isOrganizationMember,
   :skos/definition
   "indicates the context of employment in which someone is employed"})

(def isEmployeeOf
  {:db/ident :fibo-fnd-org-fm/isEmployeeOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-org-fm/Employee,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations/"},
   :rdfs/label "is employee of",
   :rdfs/range :fibo-fnd-org-fm/Employer,
   :rdfs/subPropertyOf :cmns-pts/isAffectedBy,
   :skos/definition
   "identifies the formal organization for which the employee works"})

(def isEmployingParty
  {:db/ident :fibo-fnd-org-fm/isEmployingParty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-org-fm/Employer,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations/"},
   :rdfs/label "is employing party",
   :rdfs/range :fibo-fnd-org-fm/Employment,
   :rdfs/subPropertyOf :fibo-fnd-org-org/isMembershipPartyIn,
   :skos/definition
   "relates a party in the role of employer to the context of employment"})

(def urn:uuid:10efc3a2-c910-5144-913d-ebac3120a279
  {:cmns-av/copyright
   #{"Copyright (c) 2013-2024 EDM Council, Inc."
     "Copyright (c) 2013-2024 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology defines the high level concept of a formal organization, which is purposefully underspecified to facilitate mapping to other organization ontologies, such as the W3C organization ontology, or others defined for specific business and financial services standards. It also defines general concepts related to employment by a formal organization.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Organizations/Organizations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/AgentsAndPeople/People/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q1/FND/Organizations/FormalOrganizations/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Formal Organizations Ontology",
   :skos/changeNote
   #{"The http://www.omg.org/spec/FIBO/Foundations/20130601/Organizations/FormalOrganizations.owl version of the ontology was revised in advance of the September 2013 New Brunswick, NJ meeting, as follows:\n\t(1) to use slash style URI/IRIss (also called 303 URIs, vs. hash style) as required to support server side processing \n\t(2) to use version-independent IRIs for all definitions internally as opposed to version-specific IRIs\n\t(3) to change the file suffix from .owl to .rdf to increase usability in RDF tools\n\t(4) to use 4-level abbreviations and corresponding namespace prefixes for all FIBO ontologies, reflecting a family/specification/module/ontology structure\n\t(5) to incorporate changes to the specification metadata to support documentation at the family, specification, module, and ontology level, similar to the abbreviations."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The http://www.omg.org/spec/EDMC-FIBO/FND/20141101/Organizations/FormalOrganizations.rdf version of this ontology was modified per the FIBO 2.0 RFC to integrate concepts from LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations.rdf version of this ontology was revised to address hygiene issues with respect to text formatting."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations.rdf version of this ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The http://www.omg.org/spec/EDMC-FIBO/FND/20130801/Organizations/FormalOrganizations.rdf version of this ontology was modified per the issue resolutions identified in the FIBO FND 1.0 FTF report and in http://www.omg.org/spec/EDMC-FIBO/FND/1.0/AboutFND-1.0/. It was further revised in the FTF in advance of the Long Beach meeting, resulting in http://www.omg.org/spec/EDMC-FIBO/FND/20141101/Organizations/FormalOrganizations/."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations.rdf version of this ontology was revised to loosen the constraints on the range of isDomiciledIn, allow for multiple values, update definitions to be ISO 704 compliant, and eliminate duplication with concepts in LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations.rdf version of this ontology was modified to loosen the domain of 'is domiciled in' to include organization sub-units, such as branches and divisions."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations.rdf version of this ontology was revised to incorporate the concept of employment, required to support regulatory reporting."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations/"})