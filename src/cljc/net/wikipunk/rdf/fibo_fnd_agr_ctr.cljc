(ns net.wikipunk.rdf.fibo-fnd-agr-ctr
  "This ontology defines the concept of contract and roles that parties to contract play in the context of financial agreements. Coverage includes written contracts which are the concrete evidence of agreements between parties and verbal contracts. Contracts are further broken down into bilateral and transferable contracts, the latter being the basis for most financial instruments, and basic properties of contracts, such as terms and conditions, are also covered."
  {:cmns-av/copyright ["Copyright (c) 2013-2023 EDM Council, Inc."
                       "Copyright (c) 2013-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
   :dcterms/abstract
   "This ontology defines the concept of contract and roles that parties to contract play in the context of financial agreements. Coverage includes written contracts which are the concrete evidence of agreements between parties and verbal contracts. Contracts are further broken down into bilateral and transferable contracts, the latter being the basis for most financial instruments, and basic properties of contracts, such as terms and conditions, are also covered.",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Documents/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/Occurrences/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Parties/"
    "https://www.omg.org/spec/Commons/Collections/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Roles/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://www.omg.org/spec/Commons/Classifiers/"
    "https://www.omg.org/spec/Commons/DatesAndTimes/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/Jurisdiction/"
    "https://www.omg.org/spec/Commons/ContextualDesignators/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Addresses/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/AgentsAndPeople/People/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Agreements/"
    "https://www.omg.org/spec/Commons/Designators/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Contracts/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-dsg" "https://www.omg.org/spec/Commons/Designators/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-aap-ppl"
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
    "fibo-fnd-agr-agr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreements/",
    "fibo-fnd-agr-ctr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
    "fibo-fnd-arr-doc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/",
    "fibo-fnd-dt-oc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/",
    "fibo-fnd-law-jur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/Jurisdiction/",
    "fibo-fnd-plc-adr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/",
    "fibo-fnd-pty-pty"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
    "fibo-fnd-pty-rl"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fnd-agr-ctr",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
   :rdfs/label "Contracts Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts.rdf version of this ontology was revised to add the concept of a master agreement and fix spelling errors."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts.rdf version of this ontology was revised to add the concept of a term sheet, revise definitions to be ISO 704 compliant, and eliminate duplication of concepts in LCC."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts.rdf version of this ontology was revised as a part of the issue resolutions identified in the FIBO FND 1.2 RTF report to revise definitions related to contractual element, add contractual commitment and deprecate contract terms set."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts.rdf version of this ontology was revised to simplify the contract party hierarchy, eliminate ambiguity in definitions where feasible and add restrictions on identity documents to avoid circular dependencies."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts.rdf version of this ontology was revised to clean up the definition of transferable contract, including eliminating an unnecessary equivalence, adding subclasses for assignable and novatable contracts, and to restrictions from contract to written contract that did not make sense with respect to a verbal contract."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts.rdf version of this ontology was revised as a part of the issue resolutions identified in the FIBO FND 2.0 RFC to augment restrictions on contract and contractual commitment."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts.rdf version of this ontology was revised to address hygiene issues with respect to text formatting."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts.rdf version of this ontology was revised to eliminate deprecated elements."
    "The http://www.omg.org/spec/FIBO/Foundations/20130601/Agreements/Contracts.owl version of the ontology was revised in advance of the September 2013 New Brunswick, NJ meeting, as follows:\n\t\t(1) to use slash style URI/IRIss (also called 303 URIs, vs. hash style) as required to support server side processing \n\t\t(2) to use version-independent IRIs for all definitions internally as opposed to version-specific IRIs\n\t\t(3) to change the file suffix from .owl to .rdf to increase usability in RDF tools\n\t\t(4) to use 4-level abbreviations and corresponding namespace prefixes for all FIBO ontologies, reflecting a family/specification/module/ontology structure\n\t\t(5) to incorporate changes to the specification metadata to support documentation at the family, specification, module, and ontology level, similar to the abbreviations."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts.rdf version of this ontology was revised to eliminate references to external dictionary sites that no longer resolve, move the concept of an extension provision from Debt to Contracts to support representation of preferred shares and other extendable contracts, added a property for contract duration which is needed for long-term options, moved PromissoryNote to Debt for better integration with related concepts, and integrated additional contractual elements, including representations, warranties, and termination provision."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts.rdf version of this ontology was revised to move the property hasTerm from FinancialInstruments to Contracts as it is more broadly applicable."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts.rdf version of this ontology was revised to add the concepts of breach of contract and breach of covenant."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts.rdf version of the ontology was was modified per the issue resolutions identified in the FIBO FND 1.0 FTF report and in https://spec.edmcouncil.org/fibo/ontology/FND/1.0/AboutFND-1.0/."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts.rdf version of this ontology was revised to change a duplicate definition on hasContractDuration to an explanatory note."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts.rdf version of this ontology was revised as a part of the issue resolutions identified in the FIBO FND 1.1 RTF report to add a parent of hasDate to date properties."]})

(def AssignableContract
  "contract in which contract holder (assignor) may transfer some or all of their rights and obligations to another party (assignee)"
  {:cmns-av/explanatoryNote
   "Note that while the assignor may divest themselves of some rights, that assignment does not necessarily eliminate performance obligations of the assignor to the third party. Characteristics that are important to understand with respect to an assignment include the circumstances in which the assignor remains obligated and any remedies available if the assignor does not perform.",
   :db/ident :fibo-fnd-agr-ctr/AssignableContract,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
   :rdfs/label "assignable contract",
   :rdfs/subClassOf [{:owl/hasValue   {:xsd/boolean true},
                      :owl/onProperty :fibo-fnd-agr-ctr/isAssignable,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-agr-ctr/TransferableContract],
   :skos/definition
   "contract in which contract holder (assignor) may transfer some or all of their rights and obligations to another party (assignee)",
   :skos/example
   "Many, though not all, futures contracts are assignable. This means that the original contract holder can sell the contract to another party in return for cash, and that party then assumes the rights, responsibilities, and benefits of that contract from that point onwards."})

(def BreachOfContract
  "classifier of events representing a violation of an express, or implied, condition of a contract to do or not to do something, without a legitimate excuse"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Examples of events that are considered a breach of contract include discovery of misrepresentation, not completing a job, not paying in full or on time, failing to deliver all the goods, substituting inferior or significantly different goods, not providing a bond when required, being late without excuse, or any act that demonstrates that a party will not complete required work ('anticipatory breach.') Breach of contract is one of the most common causes of law suits for damages and/or court-ordered 'specific performance' of the contract. A breach of contract frequently invalidates the contract."},
   :db/ident :fibo-fnd-agr-ctr/BreachOfContract,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "breach of contract"},
   :rdfs/subClassOf [{:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-fnd-agr-ctr/Contract,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-fnd-rel-rel/refersTo,
                      :owl/someValuesFrom
                      :fibo-fnd-agr-ctr/ContractualCommitment,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-dt-oc/OccurrenceKind],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "classifier of events representing a violation of an express, or implied, condition of a contract to do or not to do something, without a legitimate excuse"}})

(def BreachOfCovenant
  "classifier of events representing breaking a promise specified in a contract to do or not to do something, without a legitimate excuse"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "In the case of a breach of a covenant or warranty, the contract remains binding and damages only are recoverable for the breach, whereas a breach of contract typically invalidates the entire contract."},
   :db/ident :fibo-fnd-agr-ctr/BreachOfCovenant,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "breach of covenant"},
   :rdfs/subClassOf [{:owl/onProperty     :cmns-cxtdsg/appliesTo,
                      :owl/someValuesFrom :fibo-fnd-agr-ctr/Contract,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-fnd-rel-rel/refersTo,
                      :owl/someValuesFrom
                      :fibo-fnd-agr-ctr/ContractualCommitment,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-dt-oc/OccurrenceKind],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "classifier of events representing breaking a promise specified in a contract to do or not to do something, without a legitimate excuse"}})

(def ConditionPrecedent
  "stipulation that specifies conditions that must be met before some aspect of a contract takes effect"
  {:cmns-av/explanatoryNote
   ["There may also be condition precedents in the ongoing life of a contract, which state that if condition X occurs, event Y will then occur. Condition X is the condition precedent."
    "Condition precedents are common in wills and trusts. They include events or states of affairs that act as triggers for the contract to come into effect, such as a beneficiary reaching the age of maturity, or death of a trustor, as well as define obligations on a party to the contract, such as those required of a trustee on the death of a trustor."],
   :db/ident :fibo-fnd-agr-ctr/ConditionPrecedent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
   :rdfs/label "condition precedent",
   :rdfs/subClassOf :fibo-fnd-agr-ctr/ContractualElement,
   :skos/definition
   "stipulation that specifies conditions that must be met before some aspect of a contract takes effect"})

(def Contract
  "voluntary, deliberate agreement between competent parties to which the parties agree to be legally bound, and for which the parties provide valuable consideration"
  {:cmns-av/explanatoryNote
   ["Contracts are usually written but may be spoken or implied, and generally have to do with employment, sale or lease, or tenancy."
    "A contractual relationship is evidenced by (1) an offer, (2) acceptance of the offer, and a (3) valid (legal and valuable) consideration. A contract is a kind of agreement, and as such it embodies the assertion that it has been negotiated, such negotiation having included the presence of some offer and the acceptance of that offer on the part of either or both of the parties."],
   :db/ident :fibo-fnd-agr-ctr/Contract,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
   :rdfs/label "contract",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 2,
                      :owl/onClass    :fibo-fnd-agr-ctr/ContractParty,
                      :owl/onProperty :fibo-fnd-agr-ctr/hasContractParty,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :cmns-dt/Date,
                      :owl/onProperty :fibo-fnd-agr-ctr/hasEffectiveDate,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-agr-agr/Agreement
                     {:owl/onProperty :fibo-fnd-agr-ctr/hasContractualElement,
                      :owl/someValuesFrom :fibo-fnd-agr-ctr/ContractualElement,
                      :rdf/type :owl/Restriction}],
   :skos/definition
   "voluntary, deliberate agreement between competent parties to which the parties agree to be legally bound, and for which the parties provide valuable consideration"})

(def ContractDocument
  "legal document that records the formal terms and conditions of some contract"
  {:db/ident :fibo-fnd-agr-ctr/ContractDocument,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
   :rdfs/label "contract document",
   :rdfs/subClassOf :fibo-fnd-arr-doc/LegalDocument,
   :skos/definition
   "legal document that records the formal terms and conditions of some contract",
   :skos/scopeNote
   "Written here does not necessarily mean a paper document but includes situations in which the contract is expressed electronically, whether as an electronic representation of a formal document such as in PDF form or as an electronic message, provided in the latter case that the message is expressly given formal contractual standing, for example as indicated in a separate covering agreement between the parties."})

(def ContractParty
  "legally competent party that has entered into a binding agreement, accepting and conceding obligations, responsibilities, and benefits as specified"
  {:db/ident :fibo-fnd-agr-ctr/ContractParty,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
   :rdfs/label "contract party",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-pty-rl/isPlayedBy,
     :owl/someValuesFrom {:owl/onProperty     :fibo-fnd-pty-pty/isAPartyTo,
                          :owl/someValuesFrom :fibo-fnd-agr-ctr/Contract,
                          :rdf/type           :owl/Restriction},
     :rdf/type           :owl/Restriction}
    :fibo-fnd-pty-pty/PartyInRole],
   :skos/definition
   "legally competent party that has entered into a binding agreement, accepting and conceding obligations, responsibilities, and benefits as specified"})

(def ContractPrincipal
  "party that originates a contract and is identified as the first party to that contract, in the event that the contract distinguishes any party as such"
  {:cmns-av/explanatoryNote
   "The principal to a contract is typically the originator and, in the case of a security, the issuer. In law, the principal is the party that has the primary responsibility in a liability or obligation, as opposed to an endorser, guarantor, or surety.",
   :db/ident :fibo-fnd-agr-ctr/ContractPrincipal,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
   :rdfs/label "contract principal",
   :rdfs/subClassOf :fibo-fnd-agr-ctr/ContractParty,
   :skos/definition
   "party that originates a contract and is identified as the first party to that contract, in the event that the contract distinguishes any party as such"})

(def ContractThirdParty
  "party that is indirectly involved in, but not a counterparty to, an agreement"
  {:db/ident :fibo-fnd-agr-ctr/ContractThirdParty,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
   :rdfs/label "contract third party",
   :rdfs/subClassOf :fibo-fnd-pty-pty/PartyInRole,
   :skos/definition
   "party that is indirectly involved in, but not a counterparty to, an agreement"})

(def ContractualCommitment
  "provision specifying something that the contracting parties agree to"
  {:db/ident :fibo-fnd-agr-ctr/ContractualCommitment,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
   :rdfs/label "contractual commitment",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/isMandatedBy,
                      :owl/someValuesFrom :fibo-fnd-agr-ctr/Contract,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom
                      :fibo-fnd-agr-ctr/ContractualCommitment,
                      :owl/onProperty :cmns-col/hasPart,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-agr-ctr/ContractualElement
                     :fibo-fnd-agr-agr/MutualCommitment],
   :skos/definition
   "provision specifying something that the contracting parties agree to",
   :skos/scopeNote
   "Contractual commitments include general conditions which are common to all types of contracts, such as general and special arrangements, provisions, requirements, rules, rights and obligations, specifications, and standards that form an integral part of an agreement or contract, as well as special conditions which are peculiar to a specific contract (such as, contract change conditions, payment conditions, price variation clauses, penalties)."})

(def ContractualDefinition
  "contractual element that specifies the meaning of a term in a legal document, whose definition is substitutable for the term whenever it occurs in the body of that document"
  {:db/ident :fibo-fnd-agr-ctr/ContractualDefinition,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
   :rdfs/label "contractual definition",
   :rdfs/subClassOf :fibo-fnd-agr-ctr/ContractualElement,
   :skos/definition
   "contractual element that specifies the meaning of a term in a legal document, whose definition is substitutable for the term whenever it occurs in the body of that document"})

(def ContractualElement
  "element, such as an arrangement, provision, requirement, rule, specification, and standard that forms an integral part of an agreement"
  {:db/ident :fibo-fnd-agr-ctr/ContractualElement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
   :rdfs/label "contractual element",
   :rdfs/subClassOf :cmns-col/Constituent,
   :skos/definition
   "element, such as an arrangement, provision, requirement, rule, specification, and standard that forms an integral part of an agreement"})

(def Counterparty
  "party to a contract with whom one negotiates on a given agreement"
  {:cmns-av/explanatoryNote
   "The counterparty is usually the party 'on the other side' of a contract from the perspective of the issuer or holder. The term 'counterparty' can refer to any party to an agreement, depending on context.",
   :db/ident :fibo-fnd-agr-ctr/Counterparty,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
   :rdfs/label "counterparty",
   :rdfs/subClassOf :fibo-fnd-agr-ctr/ContractParty,
   :skos/definition
   "party to a contract with whom one negotiates on a given agreement"})

(def ExtensionProvision
  "contract terms that specify the conditions under which a contract can be extended"
  {:cmns-av/explanatoryNote
   "In the case of a debt instrument, an extension may include extending the time allowed for repayment of the principal, the maturity date, and so forth.",
   :db/ident :fibo-fnd-agr-ctr/ExtensionProvision,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
   :rdfs/label "extension provision",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :cmns-dt/ExplicitDatePeriod,
                      :owl/onProperty :fibo-fnd-agr-ctr/hasExtendablePeriod,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-agr-ctr/ContractualCommitment],
   :skos/definition
   "contract terms that specify the conditions under which a contract can be extended"})

(def MasterAgreement
  "contract between named parties that outlines the terms and conditions designed to apply to a number of accounts, transactions, or other activities between the parties, and that consolidates and provides overarching terms for separate but related agreements"
  {:cmns-av/explanatoryNote
   "A master agreement can be used to set out standard terms and conditions so that any new agreements don't need to cover the same information again.",
   :cmns-av/synonym "master contract",
   :db/ident :fibo-fnd-agr-ctr/MasterAgreement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
   :rdfs/label "master agreement",
   :rdfs/subClassOf [:fibo-fnd-agr-ctr/MutualContractualAgreement
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-agr-ctr/Contract,
                      :owl/onProperty :fibo-fnd-rel-rel/governs,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-agr-ctr/WrittenContract],
   :skos/definition
   "contract between named parties that outlines the terms and conditions designed to apply to a number of accounts, transactions, or other activities between the parties, and that consolidates and provides overarching terms for separate but related agreements",
   :skos/example
   ["Some credit facilities and many brokerage arrangements are master agreements."
    "A master services agreement governs the terms between a service provider and client. Typically, clients will use Statements of Work that point back to the master agreement so they don't have to recreate a new contract with new terms each time there is a new project, or to cover common terms across services, warranties, and deliveries."]})

(def MutualContractualAgreement
  "contract between named parties whose individual rights and obligations are not transferable to another party without prior written permission"
  {:cmns-av/explanatoryNote
   "A mutual contractual agreement involves an exchange of a promises in which the promises made by each party represent considerations supporting the promises of the other party(ies).",
   :cmns-av/synonym "bilateral contract",
   :db/ident :fibo-fnd-agr-ctr/MutualContractualAgreement,
   :owl/disjointWith :fibo-fnd-agr-ctr/UnilateralContract,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
   :rdfs/label "mutual contractual agreement",
   :rdfs/subClassOf [:fibo-fnd-agr-ctr/Contract
                     :fibo-fnd-agr-agr/MutualAgreement],
   :skos/definition
   "contract between named parties whose individual rights and obligations are not transferable to another party without prior written permission"})

(def NonBindingTerm
  "contractual element that is not legally binding on any party to the agreement"
  {:db/ident :fibo-fnd-agr-ctr/NonBindingTerm,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
   :rdfs/label "non-binding term",
   :rdfs/subClassOf :fibo-fnd-agr-ctr/ContractualElement,
   :skos/definition
   "contractual element that is not legally binding on any party to the agreement"})

(def NovateableContract
  "contract that may be replaced by another contract, and in that event, extinguishes the rights and obligations in effect under the original contract with those in the new agreement"
  {:cmns-av/explanatoryNote
   ["Novation is different from assignment in the following ways: (1) novation is a consensual transfer of contractual rights and obligations, while an assignment can transfer only obligations and does not require the consent of the benefiting party, and (2) novation terminates the original contract, but assignment does not."
    "In general, novation means consensual substitution of a party or obligation in the original contract with a new party or obligation in the successor contract. The new party takes on the rights and obligations of the original party. The corresponding novation agreement must be signed by the transferor, the transferee, and the counterparty (the other contracting party). Novation is frequently used in mergers and acquisitions to replace any outstanding relationships or rights and obligations of the organization being subsumed with relationships or obligations of the acquiring entity. It is also commonly used with respect to loan rescheduling."],
   :db/ident :fibo-fnd-agr-ctr/NovateableContract,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
   :rdfs/label "novateable contract",
   :rdfs/subClassOf :fibo-fnd-agr-ctr/TransferableContract,
   :skos/definition
   "contract that may be replaced by another contract, and in that event, extinguishes the rights and obligations in effect under the original contract with those in the new agreement"})

(def Representation
  "contractual element that is a statement made by a party to the contract, before or at the time of making the contract, in regard to some fact, circumstance, or state of affairs pertinent to the contract, which the counterparty(ies) rely on, or is influential in bringing about the contract"
  {:cmns-av/explanatoryNote
   "A party may later claim misrepresentation if a false representation has been made. They may be entitled to rescind the contract, which means that the contract would be set aside and the receiving party may also be entitled to damages to put them back into the position they would have been had the contract never been entered into.",
   :db/ident :fibo-fnd-agr-ctr/Representation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "representation"},
   :rdfs/subClassOf :fibo-fnd-agr-ctr/ContractualCommitment,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "contractual element that is a statement made by a party to the contract, before or at the time of making the contract, in regard to some fact, circumstance, or state of affairs pertinent to the contract, which the counterparty(ies) rely on, or is influential in bringing about the contract"}})

(def TermSheet
  "nonbinding agreement setting forth the basic terms and conditions under which a proposed business deal may be made"
  {:cmns-av/explanatoryNote
   "Term sheets state the intentions of the parties and are used to guide legal counsel in the preparation of proposed agreements or contracts.",
   :db/ident :fibo-fnd-agr-ctr/TermSheet,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
   :rdfs/label "term sheet",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-agr-ctr/hasNonBindingTerm,
                      :owl/someValuesFrom :fibo-fnd-agr-ctr/NonBindingTerm,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-agr-agr/Agreement],
   :skos/definition
   "nonbinding agreement setting forth the basic terms and conditions under which a proposed business deal may be made"})

(def TerminationProvision
  "contractual element that specifies the circumstances under which the parties can dissolve their legal relationship and discontinue the fulfillment of their obligations under the contract"
  {:cmns-av/explanatoryNote
   "Common reasons for termination include mutual consent, certain notices, breach or failure of a precedent or condition, insolvency, change in control, the occurrence of certain events, and court orders that prohibit continuation of the contract. Termination provisions may include whether they are mutual or unilateral, and may include rights with respect to any cure.",
   :db/ident :fibo-fnd-agr-ctr/TerminationProvision,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "termination provision"},
   :rdfs/subClassOf :fibo-fnd-agr-ctr/ContractualCommitment,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "contractual element that specifies the circumstances under which the parties can dissolve their legal relationship and discontinue the fulfillment of their obligations under the contract"}})

(def TransferableContract
  "contract in which the rights and obligations of one party may be transferred to another party"
  {:db/ident :fibo-fnd-agr-ctr/TransferableContract,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
   :rdfs/label "transferable contract",
   :rdfs/subClassOf :fibo-fnd-agr-ctr/WrittenContract,
   :skos/definition
   "contract in which the rights and obligations of one party may be transferred to another party"})

(def UnilateralContract
  "contract in which one party makes an express promise without securing a reciprocal agreement from the other party(ies)"
  {:cmns-av/explanatoryNote
   "In a unilateral, or one-sided, contract, one party, known as the offeror, makes a promise in exchange for an act (or abstention from acting) by another party, known as the offeree. If the offeree acts on the offeror's promise, the offeror is legally obligated to fulfill the contract, but an offeree cannot be forced to act (or not act), because no return promise has been made to the offeror. After an offeree has performed, only one enforceable promise exists, that of the offeror.",
   :db/ident :fibo-fnd-agr-ctr/UnilateralContract,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
   :rdfs/label "unilateral contract",
   :rdfs/subClassOf [{:owl/allValuesFrom :fibo-fnd-agr-agr/UnilateralCommitment,
                      :owl/onProperty    :fibo-fnd-rel-rel/confers,
                      :rdf/type          :owl/Restriction}
                     :fibo-fnd-agr-ctr/Contract],
   :skos/definition
   "contract in which one party makes an express promise without securing a reciprocal agreement from the other party(ies)"})

(def VerbalContract
  "contract that exists as a result of some verbal exchange"
  {:db/ident :fibo-fnd-agr-ctr/VerbalContract,
   :owl/disjointWith :fibo-fnd-agr-ctr/WrittenContract,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
   :rdfs/label "verbal contract",
   :rdfs/subClassOf :fibo-fnd-agr-ctr/Contract,
   :skos/definition "contract that exists as a result of some verbal exchange"})

(def Warranty
  "contractual element that is a statement of fact"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "If a warranty is determined to be false, the receiving party has a claim for breach of contract. If it is a fundamental breach the receiving party may have the right to terminate the contact in addition to a claim for damages. However, unlike a claim for misrepresentation, the contract may not necessarily be voided in its entirety as a consequence."},
   :db/ident :fibo-fnd-agr-ctr/Warranty,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "warranty"},
   :rdfs/subClassOf :fibo-fnd-agr-ctr/ContractualCommitment,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "contractual element that is a statement of fact"}})

(def WrittenContract
  "formal contract that is written and signed by the parties thereto"
  {:db/ident :fibo-fnd-agr-ctr/WrittenContract,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
   :rdfs/label "written contract",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-agr-ctr/isEvidencedBy,
     :owl/someValuesFrom :fibo-fnd-agr-ctr/ContractDocument,
     :rdf/type           :owl/Restriction}
    {:owl/onDataRange :xsd/boolean,
     :owl/onProperty  :fibo-fnd-agr-ctr/isAssignable,
     :owl/qualifiedCardinality 1,
     :rdf/type        :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :cmns-dt/Date,
     :owl/onProperty :fibo-fnd-agr-ctr/hasExecutionDate,
     :rdf/type       :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :cmns-dt/DateTimeStamp,
     :owl/onProperty :fibo-fnd-agr-ctr/hasExecutionDateTimeStamp,
     :rdf/type       :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-agr-ctr/hasCounterparty,
     :owl/someValuesFrom :fibo-fnd-agr-ctr/Counterparty,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-agr-ctr/hasPrincipalParty,
     :owl/someValuesFrom :fibo-fnd-agr-ctr/ContractPrincipal,
     :rdf/type           :owl/Restriction}
    :fibo-fnd-agr-ctr/Contract
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :cmns-dt/DateTimeStamp,
     :owl/onProperty :fibo-fnd-agr-ctr/hasEffectiveDateTimeStamp,
     :rdf/type       :owl/Restriction}],
   :skos/definition
   "formal contract that is written and signed by the parties thereto"})

(def definesTermsFor
  "relates a contract to something for which the contract defines legally binding terms and conditions"
  {:db/ident :fibo-fnd-agr-ctr/definesTermsFor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-agr-ctr/Contract,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
   :rdfs/label "defines terms for",
   :rdfs/subPropertyOf :cmns-dsg/defines,
   :skos/definition
   "relates a contract to something for which the contract defines legally binding terms and conditions"})

(def hasContractDuration
  "indicates the period of time during which a contract is intended to be in force once it has been executed"
  {:cmns-av/explanatoryNote
   "Note that the duration may be relative or explicit, depending on the nature of the contract, and may be extended if the provisions of the contract permit extension.",
   :db/ident :fibo-fnd-agr-ctr/hasContractDuration,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-agr-ctr/Contract,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has contract duration"},
   :rdfs/range :cmns-dt/Duration,
   :rdfs/subPropertyOf :fibo-fnd-agr-ctr/hasTerm,
   :skos/definition
   "indicates the period of time during which a contract is intended to be in force once it has been executed"})

(def hasContractParty
  "indicates a party that has entered into a binding agreement, accepting and conceding obligations, responsibilities, and benefits as specified"
  {:db/ident :fibo-fnd-agr-ctr/hasContractParty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-agr-ctr/Contract,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
   :rdfs/label "has contract party",
   :rdfs/range :fibo-fnd-agr-ctr/ContractParty,
   :rdfs/subPropertyOf :fibo-fnd-pty-pty/hasPartyInRole,
   :skos/definition
   "indicates a party that has entered into a binding agreement, accepting and conceding obligations, responsibilities, and benefits as specified"})

(def hasContractualElement
  "indicates something that is a component of an agreement"
  {:db/ident :fibo-fnd-agr-ctr/hasContractualElement,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-agr-agr/Agreement,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
   :rdfs/label "has contractual element",
   :rdfs/range :fibo-fnd-agr-ctr/ContractualElement,
   :rdfs/subPropertyOf :cmns-col/comprises,
   :skos/definition "indicates something that is a component of an agreement"})

(def hasCounterparty
  "identifies a party to a contract, typically not the contract principal"
  {:db/ident :fibo-fnd-agr-ctr/hasCounterparty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-agr-ctr/Contract,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
   :rdfs/label "has counterparty",
   :rdfs/range :fibo-fnd-agr-ctr/Counterparty,
   :rdfs/subPropertyOf :fibo-fnd-agr-ctr/hasContractParty,
   :skos/definition
   "identifies a party to a contract, typically not the contract principal"})

(def hasEffectiveDate
  "indicates the date a contract, relationship, or policy comes into force"
  {:db/ident :fibo-fnd-agr-ctr/hasEffectiveDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
   :rdfs/label "has effective date",
   :rdfs/range :cmns-dt/Date,
   :rdfs/subPropertyOf :cmns-dt/hasDate,
   :skos/definition
   "indicates the date a contract, relationship, or policy comes into force"})

(def hasEffectiveDateTimeStamp
  "indicates the date and time, including time zone, something comes into force"
  {:db/ident :fibo-fnd-agr-ctr/hasEffectiveDateTimeStamp,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
   :rdfs/label "has effective date time stamp",
   :rdfs/range :cmns-dt/DateTimeStamp,
   :rdfs/subPropertyOf :cmns-dt/hasDateTimeStamp,
   :skos/definition
   "indicates the date and time, including time zone, something comes into force"})

(def hasExecutionDate
  "indicates the date a contract has been signed by all the necessary parties"
  {:cmns-av/explanatoryNote
   "This may or may not be the 'effective date' of the contract, which may be specified in the body of the document.",
   :db/ident :fibo-fnd-agr-ctr/hasExecutionDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
   :rdfs/label "has execution date",
   :rdfs/range :cmns-dt/Date,
   :rdfs/subPropertyOf :cmns-dt/hasDate,
   :skos/definition
   "indicates the date a contract has been signed by all the necessary parties"})

(def hasExecutionDateTimeStamp
  "indicates the date and time, including time zone, a contract has been signed by all the necessary parties"
  {:db/ident :fibo-fnd-agr-ctr/hasExecutionDateTimeStamp,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
   :rdfs/label "has execution date time stamp",
   :rdfs/range :cmns-dt/DateTimeStamp,
   :rdfs/subPropertyOf :cmns-dt/hasDateTimeStamp,
   :skos/definition
   "indicates the date and time, including time zone, a contract has been signed by all the necessary parties"})

(def hasExtendablePeriod
  "indicates the window of time during which an extension is allowed under the terms of the contract"
  {:db/ident :fibo-fnd-agr-ctr/hasExtendablePeriod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-agr-ctr/ExtensionProvision,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
   :rdfs/label "has extendable period",
   :rdfs/range :cmns-dt/ExplicitDatePeriod,
   :rdfs/subPropertyOf :cmns-dt/hasDatePeriod,
   :skos/definition
   "indicates the window of time during which an extension is allowed under the terms of the contract"})

(def hasExtensionProvision
  "specifies the details of a contract provision allowing extension of some aspect of the contract"
  {:cmns-av/explanatoryNote
   "Typically a contract extension refers to the termination date, coverage period, or, in the case of a security, may refer to extension of repayment or maturity dates.",
   :db/ident :fibo-fnd-agr-ctr/hasExtensionProvision,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-agr-ctr/Contract,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
   :rdfs/label "has extension provision",
   :rdfs/range :fibo-fnd-agr-ctr/ExtensionProvision,
   :rdfs/subPropertyOf :fibo-fnd-agr-ctr/hasContractualElement,
   :skos/definition
   "specifies the details of a contract provision allowing extension of some aspect of the contract"})

(def hasGoverningJurisdiction
  "indicates the jurisdiction governing the contract, as agreed by all parties"
  {:cmns-av/explanatoryNote
   "In a written contract this is generally identified, for example, as Governing Law, namely the jurisdiction in which any disputes arising from the contract are to be resolved.",
   :db/ident :fibo-fnd-agr-ctr/hasGoverningJurisdiction,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-agr-ctr/Contract,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
   :rdfs/label "has governing jurisdiction",
   :rdfs/range :fibo-fnd-law-jur/Jurisdiction,
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/isGovernedBy,
   :skos/definition
   "indicates the jurisdiction governing the contract, as agreed by all parties",
   :skos/editorialNote
   "As modeled, this relationship combines two slightly different senses in which a Jurisdiction may be named in some Contract: the jurisdiction under whose laws the contract is deemed to be in force, and the jurisdiction under which the parties agree to submit in the event of any dispute resolution. ScopeNote: One thing to tease out is whether 'Dispute Resolution' and other forms of 'Governing Law' are one and the same thing or not. Dispute Resolution is uncontroversial, the question is whether there are other implications to Governing Law or if it's the same thing. For instance I may undertake to behave as though I were responsible to a particular authority i.e., a particular set of statutes."})

(def hasNonBindingTerm
  "refers to a term that is included in an agreement that is not considered legally binding"
  {:cmns-av/explanatoryNote
   "In other words, a breach of such terms in the future would not be considered to be a breach of the contract.",
   :db/ident :fibo-fnd-agr-ctr/hasNonBindingTerm,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-agr-agr/Agreement,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
   :rdfs/label "has non-binding term",
   :rdfs/range :fibo-fnd-agr-ctr/NonBindingTerm,
   :rdfs/subPropertyOf :fibo-fnd-agr-ctr/hasContractualElement,
   :skos/definition
   "refers to a term that is included in an agreement that is not considered legally binding"})

(def hasPrincipalParty
  "identifies the main or principal party to a contract"
  {:db/ident :fibo-fnd-agr-ctr/hasPrincipalParty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-agr-ctr/Contract,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
   :rdfs/label "has principal party",
   :rdfs/range :fibo-fnd-agr-ctr/ContractPrincipal,
   :rdfs/subPropertyOf :fibo-fnd-agr-ctr/hasContractParty,
   :skos/definition "identifies the main or principal party to a contract"})

(def hasTerm
  "indicates a fixed or limited period for which something, e.g., a contract, an investment, or an offer, lasts or is intended to last"
  {:db/ident :fibo-fnd-agr-ctr/hasTerm,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has term"},
   :rdfs/range :cmns-dt/Duration,
   :rdfs/subPropertyOf :cmns-dt/hasDuration,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates a fixed or limited period for which something, e.g., a contract, an investment, or an offer, lasts or is intended to last"}})

(def hasThirdParty
  "identifies a party which is not signatory to the party but has some role in the overall context defined by the contract."
  {:db/ident :fibo-fnd-agr-ctr/hasThirdParty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-agr-ctr/Contract,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
   :rdfs/label "has third party",
   :rdfs/range :fibo-fnd-agr-ctr/ContractThirdParty,
   :rdfs/subPropertyOf :fibo-fnd-pty-pty/hasPartyInRole,
   :skos/definition
   "identifies a party which is not signatory to the party but has some role in the overall context defined by the contract."})

(def isAssignable
  "indicates whether the contract and the rights thereunder may be assigned by one of the signatories to some other party"
  {:cmns-av/explanatoryNote
   "An assignment (Latin cessio) is a term used with similar meanings in the law of contracts and in the law of real estate. In both instances, it encompasses the transfer of rights held by one party, the assignor, to another party, the assignee. The details of the assignment determines some additional rights and liabilities (or duties). Typically a third-party is involved in a contract with the assignor, and the contract is in effect transferred to the assignee.",
   :db/ident :fibo-fnd-agr-ctr/isAssignable,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-fnd-agr-ctr/Contract,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
   :rdfs/label "is assignable",
   :rdfs/range :xsd/boolean,
   :skos/definition
   "indicates whether the contract and the rights thereunder may be assigned by one of the signatories to some other party",
   :skos/editorialNote
   "This is believed to be the basis on which transferable contracts such as financial securities and software licences may be bought and sold on some market, and also the basis on which a bilateral contract such as an over the counter derivative may be novated so that a new party becomes one of the parties. There are subtle distinctions between these three concepts which are not yet represented here."})

(def isEvidenceFor
  "corroborates"
  {:db/ident :fibo-fnd-agr-ctr/isEvidenceFor,
   :owl/inverseOf :fibo-fnd-agr-ctr/isEvidencedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
   :rdfs/label "is evidence for",
   :skos/definition "corroborates"})

(def isEvidencedBy
  "is attested by"
  {:db/ident :fibo-fnd-agr-ctr/isEvidencedBy,
   :owl/inverseOf :fibo-fnd-agr-ctr/isEvidenceFor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
   :rdfs/label "is evidenced by",
   :skos/definition "is attested by"})

(def isQualifiedBy
  "indicates a constraint, limitation or refinement on something"
  {:db/ident :fibo-fnd-agr-ctr/isQualifiedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
   :rdfs/label "is qualified by",
   :rdfs/subPropertyOf :cmns-cls/isCharacterizedBy,
   :skos/definition
   "indicates a constraint, limitation or refinement on something"})

(def qualifies
  "limits, constrains or refines"
  {:db/ident :fibo-fnd-agr-ctr/qualifies,
   :owl/inverseOf :fibo-fnd-agr-ctr/isQualifiedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
   :rdfs/label "qualifies",
   :rdfs/subPropertyOf :cmns-cls/characterizes,
   :skos/definition "limits, constrains or refines"})

(def supersedes
  "indicates a contract that was executed prior to and is replaced by this contract"
  {:db/ident :fibo-fnd-agr-ctr/supersedes,
   :rdf/type [:owl/TransitiveProperty :owl/ObjectProperty],
   :rdfs/domain :fibo-fnd-agr-ctr/Contract,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
   :rdfs/label "supersedes",
   :rdfs/range :fibo-fnd-agr-ctr/Contract,
   :skos/definition
   "indicates a contract that was executed prior to and is replaced by this contract"})

(def ^{:private true} BirthCertificate
  {:db/ident        :fibo-fnd-aap-ppl/BirthCertificate,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf {:owl/onClass    :fibo-fnd-aap-ppl/PlaceOfBirth,
                     :owl/onProperty :fibo-fnd-agr-ctr/isEvidenceFor,
                     :owl/qualifiedCardinality 1,
                     :rdf/type       :owl/Restriction}})

(def ^{:private true} DeathCertificate
  {:db/ident        :fibo-fnd-aap-ppl/DeathCertificate,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf {:owl/onClass    :fibo-fnd-aap-ppl/DateOfDeath,
                     :owl/onProperty :fibo-fnd-agr-ctr/isEvidenceFor,
                     :owl/qualifiedCardinality 1,
                     :rdf/type       :owl/Restriction}})

(def ^{:private true} IdentityDocument
  {:db/ident        :fibo-fnd-aap-ppl/IdentityDocument,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [{:owl/onClass    :fibo-fnd-aap-ppl/DateOfBirth,
                      :owl/onProperty :fibo-fnd-agr-ctr/isEvidenceFor,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-aap-ppl/PlaceOfBirth,
                      :owl/onProperty :fibo-fnd-agr-ctr/isEvidenceFor,
                      :rdf/type       :owl/Restriction}
                     {:owl/maxQualifiedCardinality 1,
                      :owl/onClass    :fibo-fnd-plc-adr/PhysicalAddress,
                      :owl/onProperty :fibo-fnd-agr-ctr/isEvidenceFor,
                      :rdf/type       :owl/Restriction}]})