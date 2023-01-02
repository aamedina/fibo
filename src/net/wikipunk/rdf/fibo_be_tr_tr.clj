(ns net.wikipunk.rdf.fibo-be-tr-tr
  "This ontology defines the fundamental common terms for trusts. Trusts are entities set up in terms of the applicable local statutes goerning trusts, and have as a minimum three specific, defined parties, known in many jurisdictions as trustor (sometimes sponsor), trustee and beneficiary. The terms in this ontology may be extended as necessary to represent specific types of trust, for example in the funds arena."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts/",
   :dcterms/abstract
   "This ontology defines the fundamental common terms for trusts. Trusts are entities set up in terms of the applicable local statutes goerning trusts, and have as a minimum three specific, defined parties, known in many jurisdictions as trustor (sometimes sponsor), trustee and beneficiary. The terms in this ontology may be extended as necessary to represent specific types of trust, for example in the funds arena.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Organizations/Organizations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Parties/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/OwnershipAndControl/Executives/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Agreements/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LegalPersons/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/FormalBusinessOrganizations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Roles/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/Trusts/Trusts/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-be-le-fbo"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/FormalBusinessOrganizations/",
    "fibo-be-le-lp"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/",
    "fibo-be-oac-exec"
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/",
    "fibo-be-tr-tr"
    "https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts/",
    "fibo-fnd-agr-agr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreements/",
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
   :rdf/uri "https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts/",
   :rdfa/prefix "fibo-be-tr-tr",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts/",
   :rdfs/label "Trusts Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts.rdf version of this ontology was modified to reflect the move of OrganizationMember from Parties to Organizations in FND."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts.rdf version of this ontology was modified to add a number of kinds of trusts, clean-up extraneous concepts, and eliminate circularity and ambiguity in definitions."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts.rdf version of this ontology was modified per the issue resolutions identified in the FIBO BE 1.0 FTF report."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts.rdf version of this ontology was modified per the FIBO 2.0 RFC."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts.rdf version of this ontology was modified to simplify / merge the legal person and formal organization class hierarchies."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts.rdf version of this ontology was modified to eliminate duplication with concepts in LCC."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts.rdf version of this ontology was modified to eliminate references to external dictionary sites that no longer resolve."],
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright ["Copyright (c) 2013-2021 EDM Council, Inc."
                  "Copyright (c) 2013-2021 Object Management Group, Inc."],
   :sm/dependsOn
   ["https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/FormalBusinessOrganizations/"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/"
    "https://www.omg.org/spec/LCC/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/"
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/"],
   :sm/fileAbbreviation "fibo-be-tr-tr",
   :sm/filename "Trusts.rdf"})

(def IrrevocableTrust
  "trust that cannot be modified, amended or terminated except under certain legal circumstances and typically not without the permission of the grantor's named beneficiary or beneficiaries"
  {:db/ident :fibo-be-tr-tr/IrrevocableTrust,
   :fibo-fnd-utl-av/explanatoryNote
   "Irrevocable trusts also offer asset protection from future creditors and lawsuits.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts/",
   :rdfs/label "irrevocable trust",
   :rdfs/subClassOf :fibo-be-tr-tr/Trust,
   :skos/definition
   "trust that cannot be modified, amended or terminated except under certain legal circumstances and typically not without the permission of the grantor's named beneficiary or beneficiaries"})

(def LivingTrust
  "trust created during an individual's lifetime where a designated person, the trustee, is given responsibility for managing that individual's assets for the benefit of the eventual beneficiary"
  {:db/ident :fibo-be-tr-tr/LivingTrust,
   :fibo-fnd-utl-av/explanatoryNote
   "A living trust is designed to allow for the easy transfer of the trust creator or settlor's assets while bypassing the often complex and expensive legal process of probate. Living trust agreements designate a trustee who holds legal possession of assets and property that flow into the trust.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts/",
   :rdfs/label "living trust",
   :rdfs/subClassOf :fibo-be-tr-tr/Trust,
   :skos/definition
   "trust created during an individual's lifetime where a designated person, the trustee, is given responsibility for managing that individual's assets for the benefit of the eventual beneficiary"})

(def RevocableTrust
  "trust in which legal ownership of the trust property is transferred to the trustee, but the trustor retains full power to revoke, modify or amend the trust"
  {:db/ident :fibo-be-tr-tr/RevocableTrust,
   :owl/disjointWith :fibo-be-tr-tr/IrrevocableTrust,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts/",
   :rdfs/label "revocable trust",
   :rdfs/subClassOf :fibo-be-tr-tr/Trust,
   :skos/definition
   "trust in which legal ownership of the trust property is transferred to the trustee, but the trustor retains full power to revoke, modify or amend the trust"})

(def TestamentaryTrust
  "trust established in accordance with the instructions contained in a last will and testament"
  {:db/ident :fibo-be-tr-tr/TestamentaryTrust,
   :fibo-fnd-utl-av/explanatoryNote
   "A will could have more than one testamentary trust. The trustee named is responsible for managing and distributing the trustor's assets to the beneficiaries as directed in the will. Sometimes called a will trust, the testamentary trust is irrevocable.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts/",
   :rdfs/label "testamentary trust",
   :rdfs/subClassOf :fibo-be-tr-tr/IrrevocableTrust,
   :skos/definition
   "trust established in accordance with the instructions contained in a last will and testament"})

(def Trust
  "fiduciary relationship and legal entity in which one party, known as a trustor, gives another party, the trustee, the right to hold title to and manage assets for the benefit of a third party, the beneficiary"
  {:db/ident :fibo-be-tr-tr/Trust,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts/",
   :rdfs/label "trust",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-pty-pty/hasPartyInRole,
                      :owl/someValuesFrom :fibo-be-tr-tr/Trustee,
                      :rdf/type           :owl/Restriction}
                     :fibo-be-le-lp/LegalEntity
                     {:owl/onProperty     :fibo-fnd-pty-pty/hasPartyInRole,
                      :owl/someValuesFrom :fibo-be-tr-tr/TrustBeneficiary,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-pty-pty/hasPartyInRole,
                      :owl/someValuesFrom :fibo-be-tr-tr/Trustor,
                      :rdf/type           :owl/Restriction}
                     {:owl/onClass    :fibo-be-tr-tr/TrustAgreement,
                      :owl/onProperty :fibo-fnd-rel-rel/isGovernedBy,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-be-le-lp/BusinessEntity],
   :skos/definition
   "fiduciary relationship and legal entity in which one party, known as a trustor, gives another party, the trustee, the right to hold title to and manage assets for the benefit of a third party, the beneficiary"})

(def TrustAgreement
  "formal agreement that establishes a trust, whereby the trustor(s) gives the trustee(s) the responsibility to hold and manage assets for the beneficiary(ies)"
  {:db/ident :fibo-be-tr-tr/TrustAgreement,
   :fibo-fnd-utl-av/explanatoryNote
   "A trust agreement typically states the (1) purpose for which the trust was established and fulfillment of which will terminate the trust, (2) details of the assets placed in the trust, (3) powers and limitations of the trustees, their reporting requirements, and other associated provisions, and (4) may also specify the trustees' compensation, if any. A trust agreement involving real estate requires its exact description and the trustor's express, written consent to create the trust to be valid.",
   :fibo-fnd-utl-av/synonym ["trust instrument" "trust deed" "trust document"],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts/",
   :rdfs/label "trust agreement",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-pty-pty/hasPartyInRole,
                      :owl/someValuesFrom :fibo-be-tr-tr/TrustBeneficiary,
                      :rdf/type           :owl/Restriction}
                     :fibo-be-le-fbo/OrganizationCoveringAgreement
                     {:owl/onProperty     :fibo-fnd-pty-pty/hasPartyInRole,
                      :owl/someValuesFrom :fibo-be-tr-tr/Trustee,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-pty-pty/hasPartyInRole,
                      :owl/someValuesFrom :fibo-be-tr-tr/Trustor,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   "formal agreement that establishes a trust, whereby the trustor(s) gives the trustee(s) the responsibility to hold and manage assets for the beneficiary(ies)"})

(def TrustBeneficiary
  "party for whose interest (benefit) an annuity, assignment (such as a letter of credit), contract, insurance policy, judgment, promise, trust, will, etc., is made"
  {:db/ident :fibo-be-tr-tr/TrustBeneficiary,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts/",
   :rdfs/label "trust beneficiary",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-pty-rl/isPlayedBy,
     :owl/someValuesFrom {:owl/allValuesFrom :fibo-be-tr-tr/TrustAgreement,
                          :owl/onProperty    :fibo-fnd-pty-pty/isAPartyTo,
                          :rdf/type          :owl/Restriction},
     :rdf/type           :owl/Restriction}
    :fibo-fnd-agr-agr/Beneficiary],
   :skos/definition
   "party for whose interest (benefit) an annuity, assignment (such as a letter of credit), contract, insurance policy, judgment, promise, trust, will, etc., is made"})

(def TrustFundManager
  "party empowered to act on behalf of the trustee to manage the assets of the trust"
  {:db/ident :fibo-be-tr-tr/TrustFundManager,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts/",
   :rdfs/label "trust fund manager",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-pty-rl/isPlayedBy,
     :owl/someValuesFrom {:owl/allValuesFrom :fibo-be-tr-tr/Trust,
                          :owl/onProperty    :fibo-fnd-rel-rel/manages,
                          :rdf/type          :owl/Restriction},
     :rdf/type           :owl/Restriction}
    :fibo-be-oac-exec/LegallyDelegatedAuthority],
   :skos/definition
   "party empowered to act on behalf of the trustee to manage the assets of the trust"})

(def Trustee
  "party that holds and manages assets for the benefit of another"
  {:db/ident :fibo-be-tr-tr/Trustee,
   :fibo-fnd-utl-av/explanatoryNote
   "The trustee is legally obliged to make all trust-related decisions with the beneficiary's interests in mind, and may be liable for damages in the event of not doing so. Trustees may be entitled to a payment for their services, if specified in the trust agreement. In the specific case of the bond market, a trustee administers a bond issue for a borrower, and ensures that the issuer meets all the terms and conditions associated with the borrowing.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts/",
   :rdfs/label "trustee",
   :rdfs/subClassOf
   [:fibo-fnd-org-org/OrganizationMember
    {:owl/onProperty     :fibo-fnd-pty-rl/isPlayedBy,
     :owl/someValuesFrom {:owl/allValuesFrom :fibo-be-tr-tr/Trust,
                          :owl/onProperty    :lcc-lr/isMemberOf,
                          :rdf/type          :owl/Restriction},
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-pty-rl/isPlayedBy,
     :owl/someValuesFrom {:owl/onClass    :fibo-be-tr-tr/TrustAgreement,
                          :owl/onProperty :fibo-fnd-pty-pty/isAPartyTo,
                          :owl/qualifiedCardinality 1,
                          :rdf/type       :owl/Restriction},
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-pty-rl/isPlayedBy,
     :owl/someValuesFrom {:owl/allValuesFrom :fibo-be-tr-tr/Trust,
                          :owl/onProperty    :fibo-fnd-rel-rel/manages,
                          :rdf/type          :owl/Restriction},
     :rdf/type           :owl/Restriction}
    :fibo-be-oac-exec/LegallyDelegatedAuthority],
   :skos/definition
   "party that holds and manages assets for the benefit of another"})

(def Trustor
  "party that establishes a trust and places property under the protection and management of one or more trustees for the benefit of at least one beneficiary"
  {:db/ident :fibo-be-tr-tr/Trustor,
   :fibo-fnd-utl-av/explanatoryNote
   "It is not always necessary to identify the trustor who may be also be a trustee and/or one of the beneficiaries. In legal parlance, a trustor is called a settlor in the UK and a grantor in the US, whereas in common usage he or she may also be called a creator, donor, initiator, owner, or trust maker.",
   :fibo-fnd-utl-av/synonym ["settlor" "grantor"],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts/",
   :rdfs/label "trustor",
   :rdfs/subClassOf
   [{:owl/allValuesFrom :fibo-fnd-pty-pty/IndependentParty,
     :owl/onProperty    :fibo-fnd-rel-rel/hasIdentity,
     :rdf/type          :owl/Restriction}
    :fibo-fnd-org-org/OrganizationMember
    {:owl/onProperty     :fibo-fnd-pty-rl/isPlayedBy,
     :owl/someValuesFrom {:owl/onClass    :fibo-be-tr-tr/TrustAgreement,
                          :owl/onProperty :fibo-fnd-pty-pty/isAPartyTo,
                          :owl/qualifiedCardinality 1,
                          :rdf/type       :owl/Restriction},
     :rdf/type           :owl/Restriction}],
   :skos/definition
   "party that establishes a trust and places property under the protection and management of one or more trustees for the benefit of at least one beneficiary"})

(def hasBeneficiary
  "links a trust to a named beneficiary"
  {:db/ident :fibo-be-tr-tr/hasBeneficiary,
   :owl/inverseOf :fibo-be-tr-tr/isBeneficiaryOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-tr-tr/Trust,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts/",
   :rdfs/label "has beneficiary",
   :rdfs/range :fibo-be-tr-tr/TrustBeneficiary,
   :rdfs/subPropertyOf :fibo-fnd-pty-pty/actsOn,
   :skos/definition "links a trust to a named beneficiary"})

(def hasTrustee
  "links a trust to a named trustee"
  {:db/ident :fibo-be-tr-tr/hasTrustee,
   :owl/inverseOf :fibo-be-tr-tr/isTrusteeOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-tr-tr/Trust,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts/",
   :rdfs/label "has trustee",
   :rdfs/range :fibo-be-tr-tr/Trustee,
   :rdfs/subPropertyOf :fibo-fnd-pty-pty/isAffectedBy,
   :skos/definition "links a trust to a named trustee"})

(def isBeneficiaryOf
  "specifies the trust that a beneficiary is named in"
  {:db/ident :fibo-be-tr-tr/isBeneficiaryOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-tr-tr/TrustBeneficiary,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts/",
   :rdfs/label "is beneficiary of",
   :rdfs/range :fibo-be-tr-tr/Trust,
   :rdfs/subPropertyOf :fibo-fnd-pty-pty/isAffectedBy,
   :skos/definition "specifies the trust that a beneficiary is named in"})

(def isTrusteeOf
  "identifies the trust over which a trustee has some measure of control"
  {:db/ident :fibo-be-tr-tr/isTrusteeOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-tr-tr/Trustee,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts/",
   :rdfs/label "is trustee of",
   :rdfs/range :fibo-be-tr-tr/Trust,
   :rdfs/subPropertyOf :fibo-fnd-pty-pty/actsOn,
   :skos/definition
   "identifies the trust over which a trustee has some measure of control"})