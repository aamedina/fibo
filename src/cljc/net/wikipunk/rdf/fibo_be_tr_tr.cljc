(ns net.wikipunk.rdf.fibo-be-tr-tr
  {:cmns-av/copyright
   #{"Copyright (c) 2013-2024 EDM Council, Inc."
     "Copyright (c) 2013-2024 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/Trusts/Trusts/",
   :dcterms/abstract
   "This ontology defines the fundamental common terms for trusts. Trusts are entities set up in terms of the applicable local statutes goerning trusts, and have as a minimum three specific, defined parties, known in many jurisdictions as trustor (sometimes sponsor), trustee and beneficiary. The terms in this ontology may be extended as necessary to represent specific types of trust, for example in the funds arena.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-pts" "https://www.omg.org/spec/Commons/PartiesAndSituations/",
    "cmns-rlcmp" "https://www.omg.org/spec/Commons/RolesAndCompositions/",
    "dcterms" "http://purl.org/dc/terms/",
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
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Agreements/Agreements/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Organizations/Organizations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/LegalEntities/FormalBusinessOrganizations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/OwnershipAndControl/Executives/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/Trusts/Trusts/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-be-tr-tr",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts/",
   :rdfs/label "Trusts Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts.rdf version of this ontology was modified to eliminate references to external dictionary sites that no longer resolve."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts.rdf version of this ontology was modified to reflect the move of OrganizationMember from Parties to Organizations in FND."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts.rdf version of this ontology was modified to simplify / merge the legal person and formal organization class hierarchies."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts.rdf version of this ontology was modified per the FIBO 2.0 RFC."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts.rdf version of this ontology was modified to add a number of kinds of trusts, clean-up extraneous concepts, and eliminate circularity and ambiguity in definitions."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts.rdf version of this ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts.rdf version of this ontology was modified to eliminate duplication with concepts in LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts.rdf version of this ontology was modified per the issue resolutions identified in the FIBO BE 1.0 FTF report."},
   :xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts/"})

(def IrrevocableTrust
  {:cmns-av/explanatoryNote
   "Irrevocable trusts also offer asset protection from future creditors and lawsuits.",
   :db/ident :fibo-be-tr-tr/IrrevocableTrust,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts/"},
   :rdfs/label "irrevocable trust",
   :rdfs/subClassOf :fibo-be-tr-tr/Trust,
   :skos/definition
   "trust that cannot be modified, amended or terminated except under certain legal circumstances and typically not without the permission of the grantor's named beneficiary or beneficiaries"})

(def LivingTrust
  {:cmns-av/explanatoryNote
   "A living trust is designed to allow for the easy transfer of the trust creator or settlor's assets while bypassing the often complex and expensive legal process of probate. Living trust agreements designate a trustee who holds legal possession of assets and property that flow into the trust.",
   :db/ident :fibo-be-tr-tr/LivingTrust,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts/"},
   :rdfs/label "living trust",
   :rdfs/subClassOf :fibo-be-tr-tr/Trust,
   :skos/definition
   "trust created during an individual's lifetime where a designated person, the trustee, is given responsibility for managing that individual's assets for the benefit of the eventual beneficiary"})

(def RevocableTrust
  {:db/ident :fibo-be-tr-tr/RevocableTrust,
   :owl/disjointWith :fibo-be-tr-tr/IrrevocableTrust,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts/"},
   :rdfs/label "revocable trust",
   :rdfs/subClassOf :fibo-be-tr-tr/Trust,
   :skos/definition
   "trust in which legal ownership of the trust property is transferred to the trustee, but the trustor retains full power to revoke, modify or amend the trust"})

(def TestamentaryTrust
  {:cmns-av/explanatoryNote
   "A will could have more than one testamentary trust. The trustee named is responsible for managing and distributing the trustor's assets to the beneficiaries as directed in the will. Sometimes called a will trust, the testamentary trust is irrevocable.",
   :db/ident :fibo-be-tr-tr/TestamentaryTrust,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts/"},
   :rdfs/label "testamentary trust",
   :rdfs/subClassOf :fibo-be-tr-tr/IrrevocableTrust,
   :skos/definition
   "trust established in accordance with the instructions contained in a last will and testament"})

(def Trust
  {:db/ident :fibo-be-tr-tr/Trust,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts/"},
   :rdfs/label "trust",
   :rdfs/subClassOf #{:fibo-be-le-lp/LegalEntity
                      {:owl/onClass    :fibo-be-tr-tr/TrustAgreement,
                       :owl/onProperty :fibo-fnd-rel-rel/isGovernedBy,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      {:owl/onProperty     :cmns-pts/hasPartyRole,
                       :owl/someValuesFrom :fibo-be-tr-tr/TrustBeneficiary,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :cmns-pts/hasPartyRole,
                       :owl/someValuesFrom :fibo-be-tr-tr/Trustor,
                       :rdf/type           :owl/Restriction}
                      :fibo-be-le-lp/BusinessEntity
                      {:owl/onProperty     :cmns-pts/hasPartyRole,
                       :owl/someValuesFrom :fibo-be-tr-tr/Trustee,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "fiduciary relationship and legal entity in which one party, known as a trustor, gives another party, the trustee, the right to hold title to and manage assets for the benefit of a third party, the beneficiary"})

(def TrustAgreement
  {:cmns-av/explanatoryNote
   "A trust agreement typically states the (1) purpose for which the trust was established and fulfillment of which will terminate the trust, (2) details of the assets placed in the trust, (3) powers and limitations of the trustees, their reporting requirements, and other associated provisions, and (4) may also specify the trustees' compensation, if any. A trust agreement involving real estate requires its exact description and the trustor's express, written consent to create the trust to be valid.",
   :cmns-av/synonym #{"trust instrument" "trust document" "trust deed"},
   :db/ident :fibo-be-tr-tr/TrustAgreement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts/"},
   :rdfs/label "trust agreement",
   :rdfs/subClassOf #{:fibo-be-le-fbo/OrganizationCoveringAgreement
                      {:owl/onProperty     :cmns-pts/hasPartyRole,
                       :owl/someValuesFrom :fibo-be-tr-tr/TrustBeneficiary,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :cmns-pts/hasPartyRole,
                       :owl/someValuesFrom :fibo-be-tr-tr/Trustor,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :cmns-pts/hasPartyRole,
                       :owl/someValuesFrom :fibo-be-tr-tr/Trustee,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "formal agreement that establishes a trust, whereby the trustor(s) gives the trustee(s) the responsibility to hold and manage assets for the beneficiary(ies)"})

(def TrustBeneficiary
  {:db/ident :fibo-be-tr-tr/TrustBeneficiary,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts/"},
   :rdfs/label "trust beneficiary",
   :rdfs/subClassOf
   #{{:owl/onProperty     :cmns-rlcmp/isPlayedBy,
      :owl/someValuesFrom {:owl/allValuesFrom :fibo-be-tr-tr/TrustAgreement,
                           :owl/onProperty    :cmns-pts/isAPartyTo,
                           :rdf/type          :owl/Restriction},
      :rdf/type           :owl/Restriction} :fibo-fnd-agr-agr/Beneficiary},
   :skos/definition
   "party for whose interest (benefit) an annuity, assignment (such as a letter of credit), contract, insurance policy, judgment, promise, trust, will, etc., is made"})

(def TrustFundManager
  {:db/ident :fibo-be-tr-tr/TrustFundManager,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts/"},
   :rdfs/label "trust fund manager",
   :rdfs/subClassOf
   #{:fibo-be-oac-exec/LegallyDelegatedAuthority
     {:owl/onProperty     :cmns-rlcmp/isPlayedBy,
      :owl/someValuesFrom {:owl/allValuesFrom :fibo-be-tr-tr/Trust,
                           :owl/onProperty    :fibo-fnd-rel-rel/manages,
                           :rdf/type          :owl/Restriction},
      :rdf/type           :owl/Restriction}},
   :skos/definition
   "party empowered to act on behalf of the trustee to manage the assets of the trust"})

(def Trustee
  {:cmns-av/explanatoryNote
   "The trustee is legally obliged to make all trust-related decisions with the beneficiary's interests in mind, and may be liable for damages in the event of not doing so. Trustees may be entitled to a payment for their services, if specified in the trust agreement. In the specific case of the bond market, a trustee administers a bond issue for a borrower, and ensures that the issuer meets all the terms and conditions associated with the borrowing.",
   :db/ident :fibo-be-tr-tr/Trustee,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts/"},
   :rdfs/label "trustee",
   :rdfs/subClassOf
   #{{:owl/onProperty     :cmns-rlcmp/isPlayedBy,
      :owl/someValuesFrom {:owl/allValuesFrom :fibo-be-tr-tr/Trust,
                           :owl/onProperty    :cmns-col/isMemberOf,
                           :rdf/type          :owl/Restriction},
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :cmns-rlcmp/isPlayedBy,
      :owl/someValuesFrom {:owl/onClass    :fibo-be-tr-tr/TrustAgreement,
                           :owl/onProperty :cmns-pts/isAPartyTo,
                           :owl/qualifiedCardinality 1,
                           :rdf/type       :owl/Restriction},
      :rdf/type           :owl/Restriction}
     :fibo-be-oac-exec/LegallyDelegatedAuthority
     :fibo-fnd-org-org/OrganizationMember
     {:owl/onProperty     :cmns-rlcmp/isPlayedBy,
      :owl/someValuesFrom {:owl/allValuesFrom :fibo-be-tr-tr/Trust,
                           :owl/onProperty    :fibo-fnd-rel-rel/manages,
                           :rdf/type          :owl/Restriction},
      :rdf/type           :owl/Restriction}},
   :skos/definition
   "party that holds and manages assets for the benefit of another"})

(def Trustor
  {:cmns-av/explanatoryNote
   "It is not always necessary to identify the trustor who may be also be a trustee and/or one of the beneficiaries. In legal parlance, a trustor is called a settlor in the UK and a grantor in the US, whereas in common usage he or she may also be called a creator, donor, initiator, owner, or trust maker.",
   :cmns-av/synonym #{"settlor" "grantor"},
   :db/ident :fibo-be-tr-tr/Trustor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts/"},
   :rdfs/label "trustor",
   :rdfs/subClassOf
   #{{:owl/allValuesFrom :cmns-pts/Party,
      :owl/onProperty    :cmns-rlcmp/isPlayedBy,
      :rdf/type          :owl/Restriction}
     {:owl/onProperty     :cmns-rlcmp/isPlayedBy,
      :owl/someValuesFrom {:owl/onClass    :fibo-be-tr-tr/TrustAgreement,
                           :owl/onProperty :cmns-pts/isAPartyTo,
                           :owl/qualifiedCardinality 1,
                           :rdf/type       :owl/Restriction},
      :rdf/type           :owl/Restriction}
     :fibo-fnd-org-org/OrganizationMember},
   :skos/definition
   "party that establishes a trust and places property under the protection and management of one or more trustees for the benefit of at least one beneficiary"})

(def hasBeneficiary
  {:db/ident :fibo-be-tr-tr/hasBeneficiary,
   :owl/inverseOf :fibo-be-tr-tr/isBeneficiaryOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-tr-tr/Trust,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts/"},
   :rdfs/label "has beneficiary",
   :rdfs/range :fibo-be-tr-tr/TrustBeneficiary,
   :rdfs/subPropertyOf :cmns-pts/actsOn,
   :skos/definition "links a trust to a named beneficiary"})

(def hasTrustee
  {:db/ident :fibo-be-tr-tr/hasTrustee,
   :owl/inverseOf :fibo-be-tr-tr/isTrusteeOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-tr-tr/Trust,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts/"},
   :rdfs/label "has trustee",
   :rdfs/range :fibo-be-tr-tr/Trustee,
   :rdfs/subPropertyOf :cmns-pts/isAffectedBy,
   :skos/definition "links a trust to a named trustee"})

(def isBeneficiaryOf
  {:db/ident :fibo-be-tr-tr/isBeneficiaryOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-tr-tr/TrustBeneficiary,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts/"},
   :rdfs/label "is beneficiary of",
   :rdfs/range :fibo-be-tr-tr/Trust,
   :rdfs/subPropertyOf :cmns-pts/isAffectedBy,
   :skos/definition "specifies the trust that a beneficiary is named in"})

(def isTrusteeOf
  {:db/ident :fibo-be-tr-tr/isTrusteeOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-tr-tr/Trustee,
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts/"},
   :rdfs/label "is trustee of",
   :rdfs/range :fibo-be-tr-tr/Trust,
   :rdfs/subPropertyOf :cmns-pts/actsOn,
   :skos/definition
   "identifies the trust over which a trustee has some measure of control"})

(def urn:uuid:68b2a432-8ac0-5f91-bfcf-7a5b417789ad
  {:cmns-av/copyright
   #{"Copyright (c) 2013-2024 EDM Council, Inc."
     "Copyright (c) 2013-2024 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology defines the fundamental common terms for trusts. Trusts are entities set up in terms of the applicable local statutes goerning trusts, and have as a minimum three specific, defined parties, known in many jurisdictions as trustor (sometimes sponsor), trustee and beneficiary. The terms in this ontology may be extended as necessary to represent specific types of trust, for example in the funds arena.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Agreements/Agreements/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Organizations/Organizations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/LegalEntities/FormalBusinessOrganizations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/OwnershipAndControl/Executives/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/Trusts/Trusts/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Trusts Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts.rdf version of this ontology was modified to eliminate references to external dictionary sites that no longer resolve."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts.rdf version of this ontology was modified to reflect the move of OrganizationMember from Parties to Organizations in FND."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts.rdf version of this ontology was modified to simplify / merge the legal person and formal organization class hierarchies."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts.rdf version of this ontology was modified per the FIBO 2.0 RFC."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts.rdf version of this ontology was modified to add a number of kinds of trusts, clean-up extraneous concepts, and eliminate circularity and ambiguity in definitions."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts.rdf version of this ontology was modified to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts.rdf version of this ontology was modified to eliminate duplication with concepts in LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts.rdf version of this ontology was modified per the issue resolutions identified in the FIBO BE 1.0 FTF report."},
   :xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/Trusts/"})