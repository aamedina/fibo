(ns net.wikipunk.rdf.fibo-be-le-fbo
  "This ontology defines formal business organizations and related concepts. The ontology covers parts of organizations, membership, classification, address relations and other properties which are applicable to formal business organizations generally. The concept of a formal business organization forms the basis for articulation of types of organization, both incorporated and non-incorporated, in other FIBO-BE ontologies."
  {:cmns-av/copyright ["Copyright (c) 2013-2023 Object Management Group, Inc."
                       "Copyright (c) 2013-2023 EDM Council, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/FormalBusinessOrganizations/",
   :dcterms/abstract
   "This ontology defines formal business organizations and related concepts. The ontology covers parts of organizations, membership, classification, address relations and other properties which are applicable to formal business organizations generally. The concept of a formal business organization forms the basis for articulation of types of organization, both incorporated and non-incorporated, in other FIBO-BE ontologies.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/ClassificationSchemes/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/GoalsAndObjectives/Objectives/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Contracts/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Addresses/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Roles/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/IdentifiersAndIndices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LegalPersons/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Organizations/Organizations/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/AccountingEquity/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Organizations/FormalOrganizations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Parties/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/AgentsAndPeople/People/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/FormalBusinessOrganizations/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-le-fbo"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/FormalBusinessOrganizations/",
    "fibo-be-le-lp"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/",
    "fibo-fnd-aap-ppl"
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
    "fibo-fnd-acc-aeq"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/AccountingEquity/",
    "fibo-fnd-agr-ctr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
    "fibo-fnd-arr-cls"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/ClassificationSchemes/",
    "fibo-fnd-gao-obj"
    "https://spec.edmcouncil.org/fibo/ontology/FND/GoalsAndObjectives/Objectives/",
    "fibo-fnd-org-fm"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations/",
    "fibo-fnd-org-org"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/Organizations/",
    "fibo-fnd-plc-adr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/",
    "fibo-fnd-pty-pty"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
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
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/FormalBusinessOrganizations/",
   :rdfa/prefix "fibo-be-le-fbo",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/FormalBusinessOrganizations/",
   :rdfs/label "Formal Business Organizations Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/FormalBusinessOrganizations.rdf version of this ontology was revised to eliminate duplication of concepts in LCC, simplify addresses, and correct the parent class of OrganizationSubUnit."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/FormalBusinessOrganizations.rdf version of this ontology was revised to eliminate unnecessary references, some of which include wrong datatypes."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/FormalBusinessOrganizations.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/FormalBusinessOrganizations.rdf version of this ontology was revised to eliminate deprecated elements."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/FormalBusinessOrganizations.rdf version of this ontology was modified per the FIBO 2.0 RFC to address minor bug fixes."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/FormalBusinessOrganizations.rdf version of this ontology was revised to address text formatting hygiene issues."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/FormalBusinessOrganizations.rdf version of this ontology was revised to move certain fundamental concepts, such as organizational sub-unit, to FND."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/FormalBusinessOrganizations.rdf version of this ontology was revised to replace hasDefinition with isDefinedIn to clarify intent."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/FormalBusinessOrganizations.rdf version of this ontology was revised to eliminate the redundant hasSignatory property."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/FormalBusinessOrganizations.rdf version of this ontology was revised to extend the concept of a tax identifier, add a value-added tax identifier, and clean up definitions that were circular or ambiguous."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/FormalBusinessOrganizations.rdf version of this ontology was modified to reflect the move of hasObjective to FND to enable higher level reuse."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/FormalBusinessOrganizations.rdf version of this ontology was modified per the issue resolutions identified in the FIBO BE 1.0 FTF report."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/FormalBusinessOrganizations.rdf version of this ontology was modified as a part of a simplification strategy for the organizational class hierarchy."]})

(def Branch
  "part of a larger organization that might not be co-located with it"
  {:db/ident :fibo-be-le-fbo/Branch,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/FormalBusinessOrganizations/",
   :rdfs/label "branch",
   :rdfs/subClassOf :fibo-fnd-org-org/OrganizationalSubUnit,
   :skos/definition
   "part of a larger organization that might not be co-located with it"})

(def Division
  "part of an organization, such as a line of business, that may have separate accounting and reporting requirements"
  {:db/ident :fibo-be-le-fbo/Division,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/FormalBusinessOrganizations/",
   :rdfs/label "division",
   :rdfs/subClassOf :fibo-fnd-org-org/OrganizationalSubUnit,
   :skos/definition
   "part of an organization, such as a line of business, that may have separate accounting and reporting requirements"})

(def JointVenture
  "legal entity that is formed between parties that pool their resources for the purpose of accomplishing a specific task but otherwise retain their distinct identities"
  {:cmns-av/explanatoryNote
   "In a joint venture, each of the participants is responsible for profits, losses, and costs associated with it. However, the venture is its own entity, separate from the participants' other business interests.",
   :db/ident :fibo-be-le-fbo/JointVenture,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/FormalBusinessOrganizations/",
   :rdfs/label "joint venture",
   :rdfs/subClassOf :fibo-be-le-lp/LegalEntity,
   :skos/definition
   "legal entity that is formed between parties that pool their resources for the purpose of accomplishing a specific task but otherwise retain their distinct identities"})

(def NonGovernmentalOrganization
  "not-for-profit organization that functions independently of government"
  {:cmns-av/abbreviation "NGO",
   :cmns-av/explanatoryNote
   ["Some NGOs avoid formal funding altogether and are run primarily by volunteers. NGOs are highly diverse groups of organizations engaged in a wide range of activities, and take different forms in different parts of the world. Some may have charitable status, while others may be registered for tax exemption based on recognition of social purposes. Others may be fronts for political, religious, or other interests."
    "NGOs, sometimes called civil societies, are organized on community, national and international levels to serve specific social or political purposes, and are cooperative, rather than commercial, in nature."],
   :db/ident :fibo-be-le-fbo/NonGovernmentalOrganization,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/FormalBusinessOrganizations/",
   :rdfs/label "non-governmental organization",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-gao-obj/hasObjective,
                      :owl/someValuesFrom :fibo-be-le-lp/PublicPurpose,
                      :rdf/type           :owl/Restriction}
                     :fibo-be-le-fbo/NotForProfitOrganization],
   :skos/definition
   "not-for-profit organization that functions independently of government"})

(def NotForProfitOrganization
  "organization that uses its surplus revenues to further achieve its purpose rather than distributing its surplus income to the organization's owners (directors, investors, and equivalents) as profit / dividends"
  {:cmns-av/explanatoryNote
   ["In the US, a nonprofit organization is an association that explicitly is not required to pay taxes on its income. Such organizations are qualified for this exemption due to their socially desirable objective (e.g. hospitals, charitable organizations, etc., or because they meet some set of requirements as determined by the US Internal Revenue Service."
    "The nonprofit landscape is highly varied, although many people have come to associate NPOs with charitable organizations. Although charities do comprise an often high profile or visible aspect of the sector, there are many other types of nonprofits. Overall, they tend to be either member-serving or community-serving. Member-serving organizations include mutual societies, cooperatives, trade unions, credit unions, industry associations, sports clubs, retired serviceman's clubs and other organizations that benefit a particular group of people - the members of the organization. Typically, community-serving organizations are focused on providing services to the community in general, either globally or locally: organizations delivering human services programs or projects, aid and development programs, medical research, education and health services, and so on."],
   :cmns-av/synonym "non-profit organization",
   :db/ident :fibo-be-le-fbo/NotForProfitOrganization,
   :owl/disjointWith {:owl/onProperty     :fibo-fnd-gao-obj/hasObjective,
                      :owl/someValuesFrom :fibo-be-le-lp/ProfitObjective,
                      :rdf/type           :owl/Restriction},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/FormalBusinessOrganizations/",
   :rdfs/label "not for profit organization",
   :rdfs/subClassOf [:fibo-fnd-org-fm/FormalOrganization
                     {:owl/onProperty     :fibo-fnd-gao-obj/hasObjective,
                      :owl/someValuesFrom :fibo-be-le-lp/NotForProfitObjective,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   "organization that uses its surplus revenues to further achieve its purpose rather than distributing its surplus income to the organization's owners (directors, investors, and equivalents) as profit / dividends"})

(def OrganizationCoveringAgreement
  "contract between the principals in a formal organization that specifies the relationship between the principals, and between the principals and the entity"
  {:cmns-av/explanatoryNote "Also covers the aims and purposes of the Entity.",
   :db/ident :fibo-be-le-fbo/OrganizationCoveringAgreement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/FormalBusinessOrganizations/",
   :rdfs/label "organization covering agreement",
   :rdfs/subClassOf :fibo-fnd-agr-ctr/WrittenContract,
   :skos/definition
   "contract between the principals in a formal organization that specifies the relationship between the principals, and between the principals and the entity"})

(def ValueAddedTaxIdentificationNumber
  "tax identifier that identifies a taxable person (business) or non-taxable legal entity for a consumption tax that is assessed incrementally, levied on the price of a product or service at each stage of production, distribution, and sale to the end consumer"
  {:cmns-av/abbreviation "VATIN",
   :cmns-av/adaptedFrom
   "https://ec.europa.eu/taxation_customs/business/vat/eu-vat-rules-topic/vat-identification-numbers_en",
   :cmns-av/explanatoryNote
   "If the ultimate consumer is a business that collects and pays to the government VAT on its products or services, it can reclaim the tax paid. Not all localities require VAT to be charged, and exports are often exempt. VAT is usually implemented as a destination-based tax, where the tax rate is based on the location of the consumer and applied to the sales price.",
   :cmns-av/synonym ["VAT identification number" "VAT registration number"],
   :db/ident :fibo-be-le-fbo/ValueAddedTaxIdentificationNumber,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/FormalBusinessOrganizations/",
   :rdfs/label "value-added tax identification number",
   :rdfs/subClassOf [:fibo-fnd-pty-pty/TaxIdentifier
                     :fibo-fnd-org-org/OrganizationIdentifier],
   :skos/definition
   "tax identifier that identifies a taxable person (business) or non-taxable legal entity for a consumption tax that is assessed incrementally, levied on the price of a product or service at each stage of production, distribution, and sale to the end consumer"})

(def hasEquity
  "indicates owners' equity associated with the entity"
  {:db/ident :fibo-be-le-fbo/hasEquity,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-le-lp/LegalEntity,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/FormalBusinessOrganizations/",
   :rdfs/label "has equity",
   :rdfs/range :fibo-fnd-acc-aeq/OwnersEquity,
   :rdfs/subPropertyOf :lcc-lr/has,
   :skos/definition "indicates owners' equity associated with the entity"})

(def hasHeadquartersAddress
  "indicates the main address at which communications may be delivered for the organization"
  {:cmns-av/adaptedFrom
   "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1",
   :db/ident :fibo-be-le-fbo/hasHeadquartersAddress,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/FormalBusinessOrganizations/",
   :rdfs/label "has headquarters address",
   :rdfs/range :fibo-fnd-plc-adr/PhysicalAddress,
   :rdfs/subPropertyOf :fibo-be-le-fbo/hasOperatingAddress,
   :skos/definition
   "indicates the main address at which communications may be delivered for the organization"})

(def hasOperatingAddress
  "indicates an address at which an organization carries out operations"
  {:db/ident :fibo-be-le-fbo/hasOperatingAddress,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-org-org/Organization,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/FormalBusinessOrganizations/",
   :rdfs/label "has operating address",
   :rdfs/range :fibo-fnd-plc-adr/PhysicalAddress,
   :rdfs/subPropertyOf :fibo-fnd-plc-adr/hasAddress,
   :skos/definition
   "indicates an address at which an organization carries out operations"})

(def hasRegisteredAddress
  "identifies an address that is officially recorded with some government authority and at which legal papers may be served"
  {:db/ident :fibo-be-le-fbo/hasRegisteredAddress,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-pty-pty/IndependentParty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/FormalBusinessOrganizations/",
   :rdfs/label "has registered address",
   :rdfs/range :fibo-fnd-plc-adr/ConventionalStreetAddress,
   :rdfs/subPropertyOf :fibo-fnd-plc-adr/hasAddress,
   :skos/definition
   "identifies an address that is officially recorded with some government authority and at which legal papers may be served"})

(def ^{:private true} LegalEntity
  {:db/ident        :fibo-be-le-lp/LegalEntity,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass :fibo-fnd-arr-cls/IndustrySectorClassifier,
                      :owl/onProperty :lcc-cr/isClassifiedBy,
                      :rdf/type :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass
                      :fibo-be-le-fbo/OrganizationCoveringAgreement,
                      :owl/onProperty :fibo-fnd-rel-rel/isGovernedBy,
                      :rdf/type :owl/Restriction}]})

(def ^{:private true} TaxIdentifier
  {:db/ident        :fibo-fnd-pty-pty/TaxIdentifier,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf {:owl/unionOf
                     [:fibo-fnd-org-org/OrganizationIdentifier
                      :fibo-fnd-aap-ppl/NationalIdentificationNumber],
                     :rdf/type :owl/Class}})