(ns net.wikipunk.rdf.fibo-loan-ln-reg
  {:cmns-av/copyright "Copyright (c) 2013-2023 EDM Council, Inc.",
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/LOAN/LoansGeneral/LoansRegulatory/",
   :dcterms/abstract
   "This ontology contains concepts relating to regulatory requirements around loans, including disclosure rights and a small number of regulation-specific concepts. These include definitions of rights conferred on borrowers under consumer protection law, rights to equal treatment and the like.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :namespaces
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
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/LOAN/LoansGeneral/LoanApplications/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Law/LegalCapacity/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/RegulatoryAgencies/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/LOAN/LoansGeneral/Loans/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Law/Jurisdiction/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Organizations/FormalOrganizations/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/LOAN/LoansGeneral/LoansRegulatory/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-loan-ln-reg",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "LoansRegulatory"},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/"})

(def BorrowerDataProtectionRequirement
  {:db/ident :fibo-loan-ln-reg/BorrowerDataProtectionRequirement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "borrower data protection requirement"},
   :rdfs/subClassOf #{{:owl/onProperty :fibo-fnd-rel-rel/governs,
                       :owl/someValuesFrom
                       :fibo-loan-ln-reg/ConsumerCreditReferenceAgency,
                       :rdf/type :owl/Restriction}
                      :fibo-loan-ln-reg/DataProtectionRequirement}})

(def BorrowerDisclosureRequirement
  {:db/ident :fibo-loan-ln-reg/BorrowerDisclosureRequirement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "borrower disclosure requirement"},
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fnd-rel-rel/governs,
                       :owl/someValuesFrom :fibo-loan-ln-app/BorrowerAssessment,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty :fibo-fnd-rel-rel/confers,
                       :owl/someValuesFrom
                       :fibo-loan-ln-reg/ProductDisclosureRight,
                       :rdf/type :owl/Restriction}
                      :fibo-loan-ln-reg/DisclosureRequirement}})

(def BorrowerRight
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "example the right not to have a home reposessed. Example: RESPA Real Estate Setetlement Procedures Act (promulgated by HUD to govern real estate practices and disclosures Provisions of good faith estimate (GFE) of loan settlement costs. GFE would be when you apply - you get a GFE back from the lender telling you what it would cost if you close the loan."},
   :db/ident :fibo-loan-ln-reg/BorrowerRight,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "borrower right"},
   :rdfs/subClassOf :fibo-loan-ln-reg/ConsumerRight})

(def ConsumerCreditEqualTreatmentRequirement
  {:db/ident :fibo-loan-ln-reg/ConsumerCreditEqualTreatmentRequirement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "consumer credit equal treatment requirement"},
   :rdfs/subClassOf #{:fibo-loan-ln-reg/ConsumerCreditRequirement
                      {:owl/onProperty :fibo-fnd-rel-rel/confers,
                       :owl/someValuesFrom
                       :fibo-loan-ln-reg/EqualTreatmentRight,
                       :rdf/type :owl/Restriction}}})

(def ConsumerCreditProtectionLaw
  {:db/ident :fibo-loan-ln-reg/ConsumerCreditProtectionLaw,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "consumer credit protection law"},
   :rdfs/subClassOf :fibo-loan-ln-reg/ConsumerProtectionLaw})

(def ConsumerCreditReferenceAgency
  {:db/ident :fibo-loan-ln-reg/ConsumerCreditReferenceAgency,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "consumer credit reference agency"},
   :rdfs/subClassOf :fibo-fnd-org-fm/FormalOrganization,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Applicable regulations: vary by jurisdiciton. for example, only being allowed ot divulge actual judgements against a party, but not things that are not substantiated by judgements. For example, slow payments which are not covered by some judgement against the party. There will be different regulatory requirments about: 1. What the CR Agency can hold 2. Who they can divulge it to 3. What information they must provide the borrower at his/her request Some of the third thing there is covered in the EU the Data Protection Directive and local acts that implement this."}})

(def ConsumerCreditRequirement
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "e..g being able to see and challenge information about them held by the credit agency or lender. e.g. can't publish opinions only facts, etc."},
   :db/ident :fibo-loan-ln-reg/ConsumerCreditRequirement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "consumer credit requirement"},
   :rdfs/subClassOf #{:fibo-fnd-law-lcap/LegalObligation
                      {:owl/onProperty :fibo-loan-ln-reg/overseenBy,
                       :owl/someValuesFrom
                       :fibo-loan-ln-reg/ConsumerProtectionAgency,
                       :rdf/type :owl/Restriction}
                      {:owl/onProperty     :fibo-fnd-rel-rel/confers,
                       :owl/someValuesFrom :fibo-loan-ln-reg/ConsumerRight,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Requirement set out on the lender about how they must treat the appliction to a loan"}})

(def ConsumerProtectionAgency
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Note that this is consumer protection, and not other regulatory requirements such as systemic risk. an instance of this is the Consumer Financial Protection Bureau in the US. This is wide rthan just lending, but also covers lender rights."},
   :db/ident :fibo-loan-ln-reg/ConsumerProtectionAgency,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "consumer protection agency"},
   :rdfs/subClassOf :fibo-fbc-fct-rga/RegulatoryAgency,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Some agency tasked with regulating consumer protection in some jurisdiction."}})

(def ConsumerProtectionLaw
  {:db/ident :fibo-loan-ln-reg/ConsumerProtectionLaw,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "consumer protection law"},
   :rdfs/subClassOf :fibo-fnd-law-jur/StatuteLaw})

(def ConsumerRight
  {:db/ident :fibo-loan-ln-reg/ConsumerRight,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "consumer right"},
   :rdfs/subClassOf :fibo-fnd-law-lcap/LegalRight})

(def CreditReferenceAgencyRequirements
  {:db/ident :fibo-loan-ln-reg/CreditReferenceAgencyRequirements,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "credit reference agency requirements"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "REquirements other than data protection, governing what a credit reference agency can or cannot do."},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "Example might include legislation about whether a consumer can be given a bad rating for no good reason; must presumably be some audit requirements about how ratings are arrived at (llogically - no one knows of this; may be addressed simply by the indivbidual's right to see what's said. Additional right (not in DP): The right to have something struck from the record of the individual. - see sub term here (Right Or Credit Record Correction). Question: are there additional regulations, rights around not being badly assessed, or is the right of correction (and the access to knowledge) all that there is? May also be rights under common law about the information provided to the agencies."}})

(def DataProtectionRequirement
  {:db/ident :fibo-loan-ln-reg/DataProtectionRequirement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "data protection requirement"},
   :rdfs/subClassOf :fibo-fnd-law-lcap/LegalObligation,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Requirements defining how data about individuals is held. Example is the EU DA directive and laws, which make the data the property of the individual that data is about. Covers - what information i sheld - who information can be divulged to. - the individual's rights in respect of that information Privacy regulations cover most of this. EU defines \"Personal Data\" and \"Sensitive Personal Data\". For credit reference agencies the latter would be covered. More detail about whether they can divulge facts which are not subject to formal judgements etc."}})

(def DisclosureRequirement
  {:db/ident :fibo-loan-ln-reg/DisclosureRequirement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "disclosure requirement"},
   :rdfs/subClassOf :fibo-loan-ln-reg/ConsumerCreditRequirement,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Requirement for disclosure to borrowers or potential borrowers. There are two kinds of disclosure requirement: 1. Disclosure about the information held on the borrower 2. Disclsure about the product."}})

(def EqualTreatmentRight
  {:db/ident :fibo-loan-ln-reg/EqualTreatmentRight,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "equal treatment right"},
   :rdfs/subClassOf :fibo-loan-ln-reg/BorrowerRight,
   :skos/definition {:rdf/language "en",
                     :rdf/value "The right to equal treatment under the law."}})

(def GoodFaithEstimate
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Provided in a timely way. Also associated with cooling off periods"},
   :db/ident :fibo-loan-ln-reg/GoodFaithEstimate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "good faith estimate"},
   :rdfs/subClassOf :fibo-loan-ln-reg/LoanProductRepresentations,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "GFE - representation by the lender on the costs and implications of settlement (early termination) of the loan."}})

(def InformationRight
  {:db/ident :fibo-loan-ln-reg/InformationRight,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "information right"},
   :rdfs/subClassOf :fibo-loan-ln-reg/BorrowerRight,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The right to some information in some context, for example when purchasing some product. The right to full and fair disclosure of"}})

(def LenderRight
  {:db/ident :fibo-loan-ln-reg/LenderRight,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "lender right"},
   :rdfs/subClassOf :fibo-fnd-law-lcap/LegalRight,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Rights on the lender to protect them against loss. furthe rNtoes: Logically, considering the two parties, they both have protecxtion mechanisms. so while the lender has protecxtion mechanisms through mortgage insurance, and the consumer has protextion mechanisms such as good faith estimates. also the agencies (see Consumer Protection Agency), an instance of which is the CFPB in the US (just set up). Lender rights are: - expressed in the Contract Consumer protection develops becaues the contract is written by the potential Lender. So the rights are introcued to rectify the imbalance between the two parties. Same goes for insurance. consumer protection laws (governe dby the relevant consumer protection agency. So the lender protexts itself as it writes th contract AND does the things it needs to do to protext itself, but on the approval process, and with later instruments such as insurance. Interestingly., it is the Borrower who pays for this by paying for credit reports etc. So the borrower protects itself by other mechanisms. Caveat emptor - displaced by regulation (the buyer is protected by regulation). Uberimae Fidae - in the utmost good faith. Mortgage Insurance is an additional means of mitigating the risk, that the lended may have., so if the information assessed is not accurate, or if the borrower's situation changes for the worse. then the risk rating may go down. So the Mortgage Insurance is a further strategy which mitigates any shortfall in the Lender Righrs that you may have - ie someone guarantees. In the US you can also avoid that by having paid a deposit. PIMI: Principal, Interst and Morgage Insurance. So the Borrower pays towards the MI, esxcept if they have paid a given amount as deposit. there are 2 types of MI: 1. protects the lender in the event of borrower degault 2. Insurance for \"Incapacity to pay the mortage\" (these can be bought off the shelf - can combine health, unemployment etc.). - this is the Borrower mitigating their own risk. Prevents foreclosure. Similar to general sickness etc. Where the lender charges for MI, the cost is passed onto the Borrower. e.g. if there is a % valuation (e.g. 70% in Aus, 80% in US for example) then no insurance is required."}})

(def LoanProductRepresentations
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Covers responsible lending, consumer credit laws. See Aus Consumer Creti; US Reg Z and so on. In detail, this will include things like the representations about rates of interest, what people can or can't say when offering a product to a customer. Reg Z: Promoting the informed use of consumer credit by .. implictions and cost Also right to cancel a lien on a consumer's dwelling."},
   :db/ident :fibo-loan-ln-reg/LoanProductRepresentations,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "loan product representations"},
   :rdfs/subClassOf :fibo-fnd-agr-ctr/Representation,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Representations about the loan product and the appropriateness of this for the borrower."}})

(def LoanRegulatoryRequirement
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Presence of a loan regulatory requirement associated with a loan indicates that the loan is regulated by the UK Consumer credit act or the equivalent in continental Europe."},
   :db/ident :fibo-loan-ln-reg/LoanRegulatoryRequirement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "loan regulatory requirement"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-fbc-fct-rga/regulates,
      :owl/someValuesFrom :fibo-loan-ln-ln/Loan,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-loan-ln-reg/administeredBy,
      :owl/someValuesFrom :fibo-fbc-fct-rga/RegulatoryAgency,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :fibo-fnd-rel-rel/isMandatedBy,
      :owl/someValuesFrom :fibo-loan-ln-reg/ConsumerCreditProtectionLaw,
      :rdf/type           :owl/Restriction} :fibo-fnd-law-lcap/LegalObligation},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A regulatory requirement defined in regulations by a comsumer credit act or other legislation."}})

(def ProductDisclosureRequirement
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "There are also rules which encompass limitations on how you might attach loans and liens to principle dwellings, e.g. when or whether you can foreclose on someone's principal dwelling with impunity; what rights the consumer has - this last will be a separate kind of regulation."},
   :db/ident :fibo-loan-ln-reg/ProductDisclosureRequirement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "product disclosure requirement"},
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fnd-rel-rel/governs,
                       :owl/someValuesFrom :fibo-loan-ln-reg/GoodFaithEstimate,
                       :rdf/type           :owl/Restriction}
                      :fibo-loan-ln-reg/DisclosureRequirement
                      {:owl/onProperty :fibo-fnd-rel-rel/governs,
                       :owl/someValuesFrom
                       :fibo-loan-ln-reg/LoanProductRepresentations,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A requirement governing what representations can be made about a product, as it affects the consumer."}})

(def ProductDisclosureRight
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value "Includes retail, insurance and financial product disclosures"},
   :db/ident :fibo-loan-ln-reg/ProductDisclosureRight,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "product disclosure right"},
   :rdfs/subClassOf :fibo-loan-ln-reg/InformationRight,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The right to information about products at the point of purchasing these."}})

(def RegB
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Timing and delivery of electronic disclosures. Applications must have equal opportunity to follow. All applications for credit to be evaluated equally and not discriminiated against. This is disclosures about the Borrower."},
   :db/ident :fibo-loan-ln-reg/RegB,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "reg b"},
   :rdfs/subClassOf #{:fibo-loan-ln-reg/ConsumerCreditEqualTreatmentRequirement
                      :fibo-loan-ln-reg/DisclosureRequirement},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "US regulation concerning \"Equal credit opportunity act\" Electronic delivery of disclosures"}})

(def RegZ
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Creditors may delivery disclosures electronic if they obtain consumer's consent. Also relate to international, and foreign languages. This is disclosures about the Product."},
   :db/ident :fibo-loan-ln-reg/RegZ,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "reg z"},
   :rdfs/subClassOf :fibo-loan-ln-reg/ProductDisclosureRequirement,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "US Fed regulation \"Truth in Lending Act\" uniform standards for electronic delivery of disclosures"}})

(def RightOfCreditRecordCorrection
  {:db/ident :fibo-loan-ln-reg/RightOfCreditRecordCorrection,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "right of credit record correction"},
   :rdfs/subClassOf :fibo-loan-ln-reg/CreditReferenceAgencyRequirements,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "The right to have a credit record corrected."}})

(def administeredBy
  {:db/ident :fibo-loan-ln-reg/administeredBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-loan-ln-reg/LoanRegulatoryRequirement,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "administered by"},
   :rdfs/range :fibo-fbc-fct-rga/RegulatoryAgency})

(def overseenBy
  {:db/ident :fibo-loan-ln-reg/overseenBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-loan-ln-reg/ConsumerCreditRequirement,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "overseen by"},
   :rdfs/range :fibo-loan-ln-reg/ConsumerProtectionAgency})

(def requirementActReference
  {:db/ident :fibo-loan-ln-reg/requirementActReference,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-loan-ln-reg/LoanRegulatoryRequirement,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "requirement act reference"},
   :rdfs/range :xsd/string})

(def requirementSectionAndParagraph
  {:db/ident :fibo-loan-ln-reg/requirementSectionAndParagraph,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-loan-ln-reg/LoanRegulatoryRequirement,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "requirement section and paragraph"},
   :rdfs/range :xsd/string})

(def urn:uuid:4766e3fc-af86-5482-b775-e7bfd65982af
  {:cmns-av/copyright "Copyright (c) 2013-2023 EDM Council, Inc.",
   :dcterms/abstract
   "This ontology contains concepts relating to regulatory requirements around loans, including disclosure rights and a small number of regulation-specific concepts. These include definitions of rights conferred on borrowers under consumer protection law, rights to equal treatment and the like.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/LOAN/LoansGeneral/LoanApplications/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Law/LegalCapacity/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/RegulatoryAgencies/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/LOAN/LoansGeneral/Loans/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Law/Jurisdiction/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Organizations/FormalOrganizations/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/LOAN/LoansGeneral/LoansRegulatory/"},
   :rdf/type :owl/Ontology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "LoansRegulatory"},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/LoansRegulatory/"})