(ns net.wikipunk.rdf.fibo-loan-ln-reg
  "This ontology contains concepts relating to regulatory requirements around loans, including disclosure rights and a small number of regulation-specific concepts. These include definitions of rights conferred on borrowers under consumer protection law, rights to equal treatment and the like."
  {:cmns-av/copyright "Copyright (c) 2013-2023 EDM Council, Inc.",
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/",
   :dcterms/abstract
   "This ontology contains concepts relating to regulatory requirements around loans, including disclosure rights and a small number of regulation-specific concepts. These include definitions of rights conferred on borrowers under consumer protection law, rights to equal treatment and the like.",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Documents/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/LOAN/LoansGeneral/Loans/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/RegulatoryAgencies/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/LOAN/LoansGeneral/LoanApplications/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Contracts/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/LegalCapacity/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/Jurisdiction/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Organizations/FormalOrganizations/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/LOAN/LoansGeneral/LoansRegulatory/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fbc-fct-rga"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegulatoryAgencies/",
    "fibo-fnd-agr-ctr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
    "fibo-fnd-law-jur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/Jurisdiction/",
    "fibo-fnd-law-lcap"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/",
    "fibo-fnd-org-fm"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-loan-ln-app"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoanApplications/",
    "fibo-loan-ln-ln"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/",
    "fibo-loan-ln-reg"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-loan-ln-reg",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/",
   :rdfs/label #voc/lstr "LoansRegulatory@en"})

(def BorrowerDataProtectionRequirement
  "borrower data protection requirement"
  {:db/ident :fibo-loan-ln-reg/BorrowerDataProtectionRequirement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/",
   :rdfs/label #voc/lstr "borrower data protection requirement@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-rel-rel/governs,
                      :owl/someValuesFrom
                      :fibo-loan-ln-reg/ConsumerCreditReferenceAgency,
                      :rdf/type :owl/Restriction}
                     :fibo-loan-ln-reg/DataProtectionRequirement
                     :fibo-loan-ln-reg/BorrowerDataProtectionRequirement
                     :fibo-fnd-law-lcap/LegalObligation]})

(def BorrowerDisclosureRequirement
  "borrower disclosure requirement"
  {:db/ident :fibo-loan-ln-reg/BorrowerDisclosureRequirement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/",
   :rdfs/label #voc/lstr "borrower disclosure requirement@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-rel-rel/governs,
     :owl/someValuesFrom :fibo-loan-ln-app/BorrowerAssessment,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-rel-rel/confers,
     :owl/someValuesFrom :fibo-loan-ln-reg/ProductDisclosureRight,
     :rdf/type           :owl/Restriction}
    :fibo-loan-ln-reg/DisclosureRequirement
    :fibo-loan-ln-reg/BorrowerDisclosureRequirement
    :fibo-loan-ln-reg/ConsumerCreditRequirement
    :fibo-fnd-law-lcap/LegalObligation
    {:owl/onProperty     :fibo-fnd-rel-rel/confers,
     :owl/someValuesFrom :fibo-loan-ln-reg/ConsumerRight,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-loan-ln-reg/overseenBy,
     :owl/someValuesFrom :fibo-loan-ln-reg/ConsumerProtectionAgency,
     :rdf/type           :owl/Restriction}]})

(def BorrowerRight
  "borrower right"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "example the right not to have a home reposessed. Example: RESPA Real Estate Setetlement Procedures Act (promulgated by HUD to govern real estate practices and disclosures Provisions of good faith estimate (GFE) of loan settlement costs. GFE would be when you apply - you get a GFE back from the lender telling you what it would cost if you close the loan.@en",
   :db/ident :fibo-loan-ln-reg/BorrowerRight,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/",
   :rdfs/label #voc/lstr "borrower right@en",
   :rdfs/subClassOf [:fibo-loan-ln-reg/ConsumerRight
                     :fibo-loan-ln-reg/BorrowerRight
                     :fibo-fnd-law-lcap/LegalRight]})

(def ConsumerCreditEqualTreatmentRequirement
  "consumer credit equal treatment requirement"
  {:db/ident :fibo-loan-ln-reg/ConsumerCreditEqualTreatmentRequirement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/",
   :rdfs/label #voc/lstr "consumer credit equal treatment requirement@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/confers,
                      :owl/someValuesFrom :fibo-loan-ln-reg/EqualTreatmentRight,
                      :rdf/type           :owl/Restriction}
                     :fibo-loan-ln-reg/ConsumerCreditRequirement
                     :fibo-loan-ln-reg/ConsumerCreditEqualTreatmentRequirement
                     :fibo-fnd-law-lcap/LegalObligation
                     {:owl/onProperty     :fibo-fnd-rel-rel/confers,
                      :owl/someValuesFrom :fibo-loan-ln-reg/ConsumerRight,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-loan-ln-reg/overseenBy,
                      :owl/someValuesFrom
                      :fibo-loan-ln-reg/ConsumerProtectionAgency,
                      :rdf/type :owl/Restriction}]})

(def ConsumerCreditProtectionLaw
  "consumer credit protection law"
  {:db/ident :fibo-loan-ln-reg/ConsumerCreditProtectionLaw,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/",
   :rdfs/label #voc/lstr "consumer credit protection law@en",
   :rdfs/subClassOf [:fibo-loan-ln-reg/ConsumerProtectionLaw
                     :fibo-loan-ln-reg/ConsumerCreditProtectionLaw
                     :fibo-fnd-law-jur/StatuteLaw]})

(def ConsumerCreditReferenceAgency
  "Applicable regulations: vary by jurisdiciton. for example, only being allowed ot divulge actual judgements against a party, but not things that are not substantiated by judgements. For example, slow payments which are not covered by some judgement against the party. There will be different regulatory requirments about: 1. What the CR Agency can hold 2. Who they can divulge it to 3. What information they must provide the borrower at his/her request Some of the third thing there is covered in the EU the Data Protection Directive and local acts that implement this."
  {:db/ident :fibo-loan-ln-reg/ConsumerCreditReferenceAgency,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/",
   :rdfs/label #voc/lstr "consumer credit reference agency@en",
   :rdfs/subClassOf [:fibo-fnd-org-fm/FormalOrganization
                     :fibo-loan-ln-reg/ConsumerCreditReferenceAgency],
   :skos/definition
   #voc/lstr
    "Applicable regulations: vary by jurisdiciton. for example, only being allowed ot divulge actual judgements against a party, but not things that are not substantiated by judgements. For example, slow payments which are not covered by some judgement against the party. There will be different regulatory requirments about: 1. What the CR Agency can hold 2. Who they can divulge it to 3. What information they must provide the borrower at his/her request Some of the third thing there is covered in the EU the Data Protection Directive and local acts that implement this.@en"})

(def ConsumerCreditRequirement
  "Requirement set out on the lender about how they must treat the appliction to a loan"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "e..g being able to see and challenge information about them held by the credit agency or lender. e.g. can't publish opinions only facts, etc.@en",
   :db/ident :fibo-loan-ln-reg/ConsumerCreditRequirement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/",
   :rdfs/label #voc/lstr "consumer credit requirement@en",
   :rdfs/subClassOf [{:owl/onProperty :fibo-loan-ln-reg/overseenBy,
                      :owl/someValuesFrom
                      :fibo-loan-ln-reg/ConsumerProtectionAgency,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-rel-rel/confers,
                      :owl/someValuesFrom :fibo-loan-ln-reg/ConsumerRight,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-law-lcap/LegalObligation
                     :fibo-loan-ln-reg/ConsumerCreditRequirement],
   :skos/definition
   #voc/lstr
    "Requirement set out on the lender about how they must treat the appliction to a loan@en"})

(def ConsumerProtectionAgency
  "Some agency tasked with regulating consumer protection in some jurisdiction."
  {:cmns-av/explanatoryNote
   #voc/lstr
    "Note that this is consumer protection, and not other regulatory requirements such as systemic risk. an instance of this is the Consumer Financial Protection Bureau in the US. This is wide rthan just lending, but also covers lender rights.@en",
   :db/ident :fibo-loan-ln-reg/ConsumerProtectionAgency,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/",
   :rdfs/label #voc/lstr "consumer protection agency@en",
   :rdfs/subClassOf [:fibo-fbc-fct-rga/RegulatoryAgency
                     :fibo-loan-ln-reg/ConsumerProtectionAgency],
   :skos/definition
   #voc/lstr
    "Some agency tasked with regulating consumer protection in some jurisdiction.@en"})

(def ConsumerProtectionLaw
  "consumer protection law"
  {:db/ident :fibo-loan-ln-reg/ConsumerProtectionLaw,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/",
   :rdfs/label #voc/lstr "consumer protection law@en",
   :rdfs/subClassOf [:fibo-fnd-law-jur/StatuteLaw
                     :fibo-loan-ln-reg/ConsumerProtectionLaw]})

(def ConsumerRight
  "consumer right"
  {:db/ident :fibo-loan-ln-reg/ConsumerRight,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/",
   :rdfs/label #voc/lstr "consumer right@en",
   :rdfs/subClassOf [:fibo-fnd-law-lcap/LegalRight
                     :fibo-loan-ln-reg/ConsumerRight]})

(def CreditReferenceAgencyRequirements
  "REquirements other than data protection, governing what a credit reference agency can or cannot do."
  {:db/ident :fibo-loan-ln-reg/CreditReferenceAgencyRequirements,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/",
   :rdfs/label #voc/lstr "credit reference agency requirements@en",
   :rdfs/subClassOf :fibo-loan-ln-reg/CreditReferenceAgencyRequirements,
   :skos/definition
   #voc/lstr
    "REquirements other than data protection, governing what a credit reference agency can or cannot do.@en",
   :skos/editorialNote
   #voc/lstr
    "Example might include legislation about whether a consumer can be given a bad rating for no good reason; must presumably be some audit requirements about how ratings are arrived at (llogically - no one knows of this; may be addressed simply by the indivbidual's right to see what's said. Additional right (not in DP): The right to have something struck from the record of the individual. - see sub term here (Right Or Credit Record Correction). Question: are there additional regulations, rights around not being badly assessed, or is the right of correction (and the access to knowledge) all that there is? May also be rights under common law about the information provided to the agencies.@en"})

(def DataProtectionRequirement
  "Requirements defining how data about individuals is held. Example is the EU DA directive and laws, which make the data the property of the individual that data is about. Covers - what information i sheld - who information can be divulged to. - the individual's rights in respect of that information Privacy regulations cover most of this. EU defines \"Personal Data\" and \"Sensitive Personal Data\". For credit reference agencies the latter would be covered. More detail about whether they can divulge facts which are not subject to formal judgements etc."
  {:db/ident :fibo-loan-ln-reg/DataProtectionRequirement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/",
   :rdfs/label #voc/lstr "data protection requirement@en",
   :rdfs/subClassOf [:fibo-fnd-law-lcap/LegalObligation
                     :fibo-loan-ln-reg/DataProtectionRequirement],
   :skos/definition
   #voc/lstr
    "Requirements defining how data about individuals is held. Example is the EU DA directive and laws, which make the data the property of the individual that data is about. Covers - what information i sheld - who information can be divulged to. - the individual's rights in respect of that information Privacy regulations cover most of this. EU defines \"Personal Data\" and \"Sensitive Personal Data\". For credit reference agencies the latter would be covered. More detail about whether they can divulge facts which are not subject to formal judgements etc.@en"})

(def DisclosureRequirement
  "Requirement for disclosure to borrowers or potential borrowers. There are two kinds of disclosure requirement: 1. Disclosure about the information held on the borrower 2. Disclsure about the product."
  {:db/ident :fibo-loan-ln-reg/DisclosureRequirement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/",
   :rdfs/label #voc/lstr "disclosure requirement@en",
   :rdfs/subClassOf [:fibo-loan-ln-reg/ConsumerCreditRequirement
                     :fibo-loan-ln-reg/DisclosureRequirement
                     :fibo-fnd-law-lcap/LegalObligation
                     {:owl/onProperty     :fibo-fnd-rel-rel/confers,
                      :owl/someValuesFrom :fibo-loan-ln-reg/ConsumerRight,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-loan-ln-reg/overseenBy,
                      :owl/someValuesFrom
                      :fibo-loan-ln-reg/ConsumerProtectionAgency,
                      :rdf/type :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "Requirement for disclosure to borrowers or potential borrowers. There are two kinds of disclosure requirement: 1. Disclosure about the information held on the borrower 2. Disclsure about the product.@en"})

(def EqualTreatmentRight
  "The right to equal treatment under the law."
  {:db/ident :fibo-loan-ln-reg/EqualTreatmentRight,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/",
   :rdfs/label #voc/lstr "equal treatment right@en",
   :rdfs/subClassOf [:fibo-loan-ln-reg/BorrowerRight
                     :fibo-loan-ln-reg/EqualTreatmentRight
                     :fibo-loan-ln-reg/ConsumerRight
                     :fibo-fnd-law-lcap/LegalRight],
   :skos/definition #voc/lstr "The right to equal treatment under the law.@en"})

(def GoodFaithEstimate
  "GFE - representation by the lender on the costs and implications of settlement (early termination) of the loan."
  {:cmns-av/explanatoryNote
   #voc/lstr
    "Provided in a timely way. Also associated with cooling off periods@en",
   :db/ident :fibo-loan-ln-reg/GoodFaithEstimate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/",
   :rdfs/label #voc/lstr "good faith estimate@en",
   :rdfs/subClassOf [:fibo-loan-ln-reg/LoanProductRepresentations
                     :fibo-loan-ln-reg/GoodFaithEstimate
                     :fibo-fnd-agr-ctr/Representation],
   :skos/definition
   #voc/lstr
    "GFE - representation by the lender on the costs and implications of settlement (early termination) of the loan.@en"})

(def InformationRight
  "The right to some information in some context, for example when purchasing some product. The right to full and fair disclosure of"
  {:db/ident :fibo-loan-ln-reg/InformationRight,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/",
   :rdfs/label #voc/lstr "information right@en",
   :rdfs/subClassOf [:fibo-loan-ln-reg/BorrowerRight
                     :fibo-loan-ln-reg/InformationRight
                     :fibo-loan-ln-reg/ConsumerRight
                     :fibo-fnd-law-lcap/LegalRight],
   :skos/definition
   #voc/lstr
    "The right to some information in some context, for example when purchasing some product. The right to full and fair disclosure of@en"})

(def LenderRight
  "Rights on the lender to protect them against loss. furthe rNtoes: Logically, considering the two parties, they both have protecxtion mechanisms. so while the lender has protecxtion mechanisms through mortgage insurance, and the consumer has protextion mechanisms such as good faith estimates. also the agencies (see Consumer Protection Agency), an instance of which is the CFPB in the US (just set up). Lender rights are: - expressed in the Contract Consumer protection develops becaues the contract is written by the potential Lender. So the rights are introcued to rectify the imbalance between the two parties. Same goes for insurance. consumer protection laws (governe dby the relevant consumer protection agency. So the lender protexts itself as it writes th contract AND does the things it needs to do to protext itself, but on the approval process, and with later instruments such as insurance. Interestingly., it is the Borrower who pays for this by paying for credit reports etc. So the borrower protects itself by other mechanisms. Caveat emptor - displaced by regulation (the buyer is protected by regulation). Uberimae Fidae - in the utmost good faith. Mortgage Insurance is an additional means of mitigating the risk, that the lended may have., so if the information assessed is not accurate, or if the borrower's situation changes for the worse. then the risk rating may go down. So the Mortgage Insurance is a further strategy which mitigates any shortfall in the Lender Righrs that you may have - ie someone guarantees. In the US you can also avoid that by having paid a deposit. PIMI: Principal, Interst and Morgage Insurance. So the Borrower pays towards the MI, esxcept if they have paid a given amount as deposit. there are 2 types of MI: 1. protects the lender in the event of borrower degault 2. Insurance for \"Incapacity to pay the mortage\" (these can be bought off the shelf - can combine health, unemployment etc.). - this is the Borrower mitigating their own risk. Prevents foreclosure. Similar to general sickness etc. Where the lender charges for MI, the cost is passed onto the Borrower. e.g. if there is a % valuation (e.g. 70% in Aus, 80% in US for example) then no insurance is required."
  {:db/ident :fibo-loan-ln-reg/LenderRight,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/",
   :rdfs/label #voc/lstr "lender right@en",
   :rdfs/subClassOf [:fibo-fnd-law-lcap/LegalRight
                     :fibo-loan-ln-reg/LenderRight],
   :skos/definition
   #voc/lstr
    "Rights on the lender to protect them against loss. furthe rNtoes: Logically, considering the two parties, they both have protecxtion mechanisms. so while the lender has protecxtion mechanisms through mortgage insurance, and the consumer has protextion mechanisms such as good faith estimates. also the agencies (see Consumer Protection Agency), an instance of which is the CFPB in the US (just set up). Lender rights are: - expressed in the Contract Consumer protection develops becaues the contract is written by the potential Lender. So the rights are introcued to rectify the imbalance between the two parties. Same goes for insurance. consumer protection laws (governe dby the relevant consumer protection agency. So the lender protexts itself as it writes th contract AND does the things it needs to do to protext itself, but on the approval process, and with later instruments such as insurance. Interestingly., it is the Borrower who pays for this by paying for credit reports etc. So the borrower protects itself by other mechanisms. Caveat emptor - displaced by regulation (the buyer is protected by regulation). Uberimae Fidae - in the utmost good faith. Mortgage Insurance is an additional means of mitigating the risk, that the lended may have., so if the information assessed is not accurate, or if the borrower's situation changes for the worse. then the risk rating may go down. So the Mortgage Insurance is a further strategy which mitigates any shortfall in the Lender Righrs that you may have - ie someone guarantees. In the US you can also avoid that by having paid a deposit. PIMI: Principal, Interst and Morgage Insurance. So the Borrower pays towards the MI, esxcept if they have paid a given amount as deposit. there are 2 types of MI: 1. protects the lender in the event of borrower degault 2. Insurance for \"Incapacity to pay the mortage\" (these can be bought off the shelf - can combine health, unemployment etc.). - this is the Borrower mitigating their own risk. Prevents foreclosure. Similar to general sickness etc. Where the lender charges for MI, the cost is passed onto the Borrower. e.g. if there is a % valuation (e.g. 70% in Aus, 80% in US for example) then no insurance is required.@en"})

(def LoanProductRepresentations
  "Representations about the loan product and the appropriateness of this for the borrower."
  {:cmns-av/explanatoryNote
   #voc/lstr
    "Covers responsible lending, consumer credit laws. See Aus Consumer Creti; US Reg Z and so on. In detail, this will include things like the representations about rates of interest, what people can or can't say when offering a product to a customer. Reg Z: Promoting the informed use of consumer credit by .. implictions and cost Also right to cancel a lien on a consumer's dwelling.@en",
   :db/ident :fibo-loan-ln-reg/LoanProductRepresentations,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/",
   :rdfs/label #voc/lstr "loan product representations@en",
   :rdfs/subClassOf [:fibo-fnd-agr-ctr/Representation
                     :fibo-loan-ln-reg/LoanProductRepresentations],
   :skos/definition
   #voc/lstr
    "Representations about the loan product and the appropriateness of this for the borrower.@en"})

(def LoanRegulatoryRequirement
  "A regulatory requirement defined in regulations by a comsumer credit act or other legislation."
  {:cmns-av/explanatoryNote
   #voc/lstr
    "Presence of a loan regulatory requirement associated with a loan indicates that the loan is regulated by the UK Consumer credit act or the equivalent in continental Europe.@en",
   :db/ident :fibo-loan-ln-reg/LoanRegulatoryRequirement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/",
   :rdfs/label #voc/lstr "loan regulatory requirement@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-loan-ln-reg/administeredBy,
                      :owl/someValuesFrom :fibo-fbc-fct-rga/RegulatoryAgency,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-fnd-rel-rel/isMandatedBy,
                      :owl/someValuesFrom
                      :fibo-loan-ln-reg/ConsumerCreditProtectionLaw,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-fbc-fct-rga/regulates,
                      :owl/someValuesFrom :fibo-loan-ln-ln/Loan,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-law-lcap/LegalObligation
                     :fibo-loan-ln-reg/LoanRegulatoryRequirement],
   :skos/definition
   #voc/lstr
    "A regulatory requirement defined in regulations by a comsumer credit act or other legislation.@en"})

(def ProductDisclosureRequirement
  "A requirement governing what representations can be made about a product, as it affects the consumer."
  {:cmns-av/explanatoryNote
   #voc/lstr
    "There are also rules which encompass limitations on how you might attach loans and liens to principle dwellings, e.g. when or whether you can foreclose on someone's principal dwelling with impunity; what rights the consumer has - this last will be a separate kind of regulation.@en",
   :db/ident :fibo-loan-ln-reg/ProductDisclosureRequirement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/",
   :rdfs/label #voc/lstr "product disclosure requirement@en",
   :rdfs/subClassOf
   [{:owl/onProperty     :fibo-fnd-rel-rel/governs,
     :owl/someValuesFrom :fibo-loan-ln-reg/LoanProductRepresentations,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-rel-rel/governs,
     :owl/someValuesFrom :fibo-loan-ln-reg/GoodFaithEstimate,
     :rdf/type           :owl/Restriction}
    :fibo-loan-ln-reg/DisclosureRequirement
    :fibo-loan-ln-reg/ProductDisclosureRequirement
    :fibo-loan-ln-reg/ConsumerCreditRequirement
    :fibo-fnd-law-lcap/LegalObligation
    {:owl/onProperty     :fibo-fnd-rel-rel/confers,
     :owl/someValuesFrom :fibo-loan-ln-reg/ConsumerRight,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-loan-ln-reg/overseenBy,
     :owl/someValuesFrom :fibo-loan-ln-reg/ConsumerProtectionAgency,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "A requirement governing what representations can be made about a product, as it affects the consumer.@en"})

(def ProductDisclosureRight
  "The right to information about products at the point of purchasing these."
  {:cmns-av/explanatoryNote
   #voc/lstr "Includes retail, insurance and financial product disclosures@en",
   :db/ident :fibo-loan-ln-reg/ProductDisclosureRight,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/",
   :rdfs/label #voc/lstr "product disclosure right@en",
   :rdfs/subClassOf [:fibo-loan-ln-reg/InformationRight
                     :fibo-loan-ln-reg/ProductDisclosureRight
                     :fibo-loan-ln-reg/ConsumerRight
                     :fibo-fnd-law-lcap/LegalRight
                     :fibo-loan-ln-reg/BorrowerRight],
   :skos/definition
   #voc/lstr
    "The right to information about products at the point of purchasing these.@en"})

(def RegB
  "US regulation concerning \"Equal credit opportunity act\" Electronic delivery of disclosures"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "Timing and delivery of electronic disclosures. Applications must have equal opportunity to follow. All applications for credit to be evaluated equally and not discriminiated against. This is disclosures about the Borrower.@en",
   :db/ident :fibo-loan-ln-reg/RegB,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/",
   :rdfs/label #voc/lstr "reg b@en",
   :rdfs/subClassOf [:fibo-loan-ln-reg/DisclosureRequirement
                     :fibo-loan-ln-reg/ConsumerCreditEqualTreatmentRequirement
                     :fibo-loan-ln-reg/RegB
                     :fibo-loan-ln-reg/ConsumerCreditRequirement
                     :fibo-fnd-law-lcap/LegalObligation
                     {:owl/onProperty     :fibo-fnd-rel-rel/confers,
                      :owl/someValuesFrom :fibo-loan-ln-reg/EqualTreatmentRight,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-rel-rel/confers,
                      :owl/someValuesFrom :fibo-loan-ln-reg/ConsumerRight,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-loan-ln-reg/overseenBy,
                      :owl/someValuesFrom
                      :fibo-loan-ln-reg/ConsumerProtectionAgency,
                      :rdf/type :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "US regulation concerning \"Equal credit opportunity act\" Electronic delivery of disclosures@en"})

(def RegZ
  "US Fed regulation \"Truth in Lending Act\" uniform standards for electronic delivery of disclosures"
  {:cmns-av/explanatoryNote
   #voc/lstr
    "Creditors may delivery disclosures electronic if they obtain consumer's consent. Also relate to international, and foreign languages. This is disclosures about the Product.@en",
   :db/ident :fibo-loan-ln-reg/RegZ,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/",
   :rdfs/label #voc/lstr "reg z@en",
   :rdfs/subClassOf
   [:fibo-loan-ln-reg/ProductDisclosureRequirement
    :fibo-loan-ln-reg/RegZ
    :fibo-loan-ln-reg/ConsumerCreditRequirement
    {:owl/onProperty     :fibo-fnd-rel-rel/governs,
     :owl/someValuesFrom :fibo-loan-ln-reg/GoodFaithEstimate,
     :rdf/type           :owl/Restriction}
    :fibo-fnd-law-lcap/LegalObligation
    :fibo-loan-ln-reg/DisclosureRequirement
    {:owl/onProperty     :fibo-fnd-rel-rel/confers,
     :owl/someValuesFrom :fibo-loan-ln-reg/ConsumerRight,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-loan-ln-reg/overseenBy,
     :owl/someValuesFrom :fibo-loan-ln-reg/ConsumerProtectionAgency,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-rel-rel/governs,
     :owl/someValuesFrom :fibo-loan-ln-reg/LoanProductRepresentations,
     :rdf/type           :owl/Restriction}],
   :skos/definition
   #voc/lstr
    "US Fed regulation \"Truth in Lending Act\" uniform standards for electronic delivery of disclosures@en"})

(def RightOfCreditRecordCorrection
  "The right to have a credit record corrected."
  {:db/ident :fibo-loan-ln-reg/RightOfCreditRecordCorrection,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/",
   :rdfs/label #voc/lstr "right of credit record correction@en",
   :rdfs/subClassOf [:fibo-loan-ln-reg/CreditReferenceAgencyRequirements
                     :fibo-loan-ln-reg/RightOfCreditRecordCorrection],
   :skos/definition #voc/lstr
                     "The right to have a credit record corrected.@en"})

(def administeredBy
  "administered by"
  {:db/ident :fibo-loan-ln-reg/administeredBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-loan-ln-reg/LoanRegulatoryRequirement,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/",
   :rdfs/label #voc/lstr "administered by@en",
   :rdfs/range :fibo-fbc-fct-rga/RegulatoryAgency})

(def overseenBy
  "overseen by"
  {:db/ident :fibo-loan-ln-reg/overseenBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-loan-ln-reg/ConsumerCreditRequirement,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/",
   :rdfs/label #voc/lstr "overseen by@en",
   :rdfs/range :fibo-loan-ln-reg/ConsumerProtectionAgency})

(def requirementActReference
  "requirement act reference"
  {:db/ident :fibo-loan-ln-reg/requirementActReference,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-loan-ln-reg/LoanRegulatoryRequirement,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/",
   :rdfs/label #voc/lstr "requirement act reference@en",
   :rdfs/range :xsd/string})

(def requirementSectionAndParagraph
  "requirement section and paragraph"
  {:db/ident :fibo-loan-ln-reg/requirementSectionAndParagraph,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-loan-ln-reg/LoanRegulatoryRequirement,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/",
   :rdfs/label #voc/lstr "requirement section and paragraph@en",
   :rdfs/range :xsd/string})