(ns net.wikipunk.rdf.fibo-cae-ce-GLEIF
  "This ontology includes the codes for corporate action events as specified in GLEIF LEI Common Data Format (CDF) schema, as of 4 March 2021."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/",
   :dcterms/abstract
   "This ontology includes the codes for corporate action events as specified in GLEIF LEI Common Data Format (CDF) schema, as of 4 March 2021.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/DebtAndEquities/CreditEvents/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/CAE/CorporateEvents/CorporateActions/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/ClassificationSchemes/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-cae-ce-GLEIF"
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/",
    "fibo-cae-ce-act"
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
    "fibo-fbc-dae-cre"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditEvents/",
    "fibo-fnd-arr-cls"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/ClassificationSchemes/",
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
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/",
   :rdfa/prefix "fibo-cae-ce-GLEIF",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "GLEIF Corporate Action Individuals Ontology"},
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright "Copyright (c) 2022 EDM Council, Inc.",
   :sm/dependsOn ["https://spec.edmcouncil.org/fibo/ontology/FND/"
                  "https://spec.edmcouncil.org/fibo/ontology/FBC/"
                  "https://www.omg.org/spec/LCC/"],
   :sm/fileAbbreviation "fibo-cae-ce-GLEIF",
   :sm/filename "GLEIF-CorporateActionIndividuals.rdf"})

(def ABSORPTION
  "GLEIF classifier for corporate actions that is a kind of merger where there is a combination of two or more companies into an existing company"
  {:db/ident :fibo-cae-ce-GLEIF/ABSORPTION,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-GLEIF/GLEIF-CorporateActionClassificationScheme,
   :lcc-lr/hasTag "ABSORPTION",
   :rdf/type [:fibo-cae-ce-act/MergerAcquisition :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ABSORPTION"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "GLEIF classifier for corporate actions that is a kind of merger where there is a combination of two or more companies into an existing company"},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "In the case of absorption, only one company survives and all others lose their identity."}})

(def ACQUISITION_BRANCH
  "GLEIF classifier for corporate actions where the acquiring legal entity purchases an international branch entity"
  {:db/ident :fibo-cae-ce-GLEIF/ACQUISITION_BRANCH,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-GLEIF/GLEIF-CorporateActionClassificationScheme,
   :lcc-lr/hasTag "ACQUISITION_BRANCH",
   :rdf/type [:fibo-cae-ce-act/MergerAcquisition :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ACQUISITION_BRANCH"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "GLEIF classifier for corporate actions where the acquiring legal entity purchases an international branch entity"}})

(def ActionGroup
  "classifier that differentiates corporate actions based on a GLEIF specific grouping"
  {:db/ident :fibo-cae-ce-GLEIF/ActionGroup,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "action group"},
   :rdfs/subClassOf [{:owl/onProperty     :lcc-lr/hasTag,
                      :owl/someValuesFrom :xsd/string,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :lcc-cr/classifies,
                      :owl/someValuesFrom :fibo-cae-ce-act/Action,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-arr-cls/Classifier],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "classifier that differentiates corporate actions based on a GLEIF specific grouping"}})

(def BANKRUPTCY
  "GLEIF classifier for corporate actions in which the status of a legal entity is that it is unable to pay creditors"
  {:db/ident :fibo-cae-ce-GLEIF/BANKRUPTCY,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-GLEIF/GLEIF-CorporateActionClassificationScheme,
   :lcc-lr/hasTag "BANKRUPTCY",
   :rdf/type [:fibo-fbc-dae-cre/Bankruptcy
              :fibo-cae-ce-act/BusinessStrategyClassifier
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "BANKRUPTCY"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "GLEIF classifier for corporate actions in which the status of a legal entity is that it is unable to pay creditors"},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Bankruptcy usually involves a formal court ruling. Securities may become valueless (event completed)."}})

(def BREAKUP
  "GLEIF classifier for corporate actions in which a single company splits into two or more independent, separately-run companies"
  {:db/ident :fibo-cae-ce-GLEIF/BREAKUP,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-GLEIF/GLEIF-CorporateActionClassificationScheme,
   :lcc-lr/hasTag "BREAKUP",
   :rdf/type [:fibo-cae-ce-act/Divestiture :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "BREAKUP"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "GLEIF classifier for corporate actions in which a single company splits into two or more independent, separately-run companies"},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Regulators also can mandate break-ups of companies for anti-trust reasons."}})

(def CHANGE_HQ_ADDRESS
  "GLEIF classifier for corporate actions involving a notification of a change in the headquarters address of the legal entity"
  {:db/ident :fibo-cae-ce-GLEIF/CHANGE_HQ_ADDRESS,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-GLEIF/GLEIF-CorporateActionClassificationScheme,
   :lcc-lr/hasTag "CHANGE_HQ_ADDRESS",
   :rdf/type [:fibo-cae-ce-act/OrganizationAddressChange :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "CHANGE_HQ_ADDRESS"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "GLEIF classifier for corporate actions involving a notification of a change in the headquarters address of the legal entity"}})

(def CHANGE_LEGAL_ADDRESS
  "GLEIF classifier for corporate actions involving a notification of a change in the legal address of the legal entity"
  {:db/ident :fibo-cae-ce-GLEIF/CHANGE_LEGAL_ADDRESS,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-GLEIF/GLEIF-CorporateActionClassificationScheme,
   :lcc-lr/hasTag "CHANGE_LEGAL_ADDRESS",
   :rdf/type [:fibo-cae-ce-act/OrganizationAddressChange :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "CHANGE_LEGAL_ADDRESS"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "GLEIF classifier for corporate actions involving a notification of a change in the legal address of the legal entity"}})

(def CHANGE_LEGAL_FORM
  "GLEIF classifier for corporate actions involving a notification of a change in the legal form of the legal entity"
  {:db/ident :fibo-cae-ce-GLEIF/CHANGE_LEGAL_FORM,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-GLEIF/GLEIF-CorporateActionClassificationScheme,
   :lcc-lr/hasTag "CHANGE_LEGAL_FORM",
   :rdf/type [:fibo-cae-ce-act/LegalFormChange :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "CHANGE_LEGAL_FORM"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "GLEIF classifier for corporate actions involving a notification of a change in the legal form of the legal entity"}})

(def CHANGE_LEGAL_NAME
  "GLEIF classifier for corporate actions involving a notification of a change in the legal name of the legal entity"
  {:db/ident :fibo-cae-ce-GLEIF/CHANGE_LEGAL_NAME,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-GLEIF/GLEIF-CorporateActionClassificationScheme,
   :lcc-lr/hasTag "CHANGE_LEGAL_NAME",
   :rdf/type [:fibo-cae-ce-act/OrganizationNameChange :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "CHANGE_LEGAL_NAME"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "GLEIF classifier for corporate actions involving a notification of a change in the legal name of the legal entity"}})

(def CHANGE_OTHER_NAMES
  "GLEIF classifier for corporate actions involving a notification of a change in the trade- or doing business name of the legal entity"
  {:db/ident :fibo-cae-ce-GLEIF/CHANGE_OTHER_NAMES,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-GLEIF/GLEIF-CorporateActionClassificationScheme,
   :lcc-lr/hasTag "CHANGE_OTHER_NAMES",
   :rdf/type [:fibo-cae-ce-act/OrganizationNameChange :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "CHANGE_OTHER_NAMES"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "GLEIF classifier for corporate actions involving a notification of a change in the trade- or doing business name of the legal entity"}})

(def ComplexLegalFormGroup
  "GLEIF classifier for corporate actions involving a more complex legal entity event including change of the legal entity status triggered by change of the legal form"
  {:db/ident :fibo-cae-ce-GLEIF/ComplexLegalFormGroup,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-GLEIF/GLEIF-CorporateActionClassificationScheme,
   :lcc-lr/hasTag "COMPLEX_CHANGE_LEGAL_FORM",
   :rdf/type [:fibo-cae-ce-GLEIF/ActionGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "complex legal form group"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "GLEIF classifier for corporate actions involving a more complex legal entity event including change of the legal entity status triggered by change of the legal form"}})

(def DEMERGER
  "GLEIF classifier for corporate actions involving a distribution of securities issued by another legal entity"
  {:db/ident :fibo-cae-ce-GLEIF/DEMERGER,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-GLEIF/GLEIF-CorporateActionClassificationScheme,
   :lcc-lr/hasTag "DEMERGER",
   :rdf/type [:fibo-cae-ce-act/Divestiture :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "DEMERGER"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "GLEIF classifier for corporate actions involving a distribution of securities issued by another legal entity"},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "The distributed securities may either be of a newly created or of an existing legal entity. For example, spin-off, demerger, unbundling, divestment."}})

(def DISSOLUTION
  "GLEIF classifier for corporate actions involving (i) A voluntary termination of operations, (ii) a general assignment for the benefit of the legal entity's creditors or (iii) any other liquidation, dissolution or winding up of the legal entity (excluding a Liquidity Event), whether voluntary or involuntary (event completed)"
  {:db/ident :fibo-cae-ce-GLEIF/DISSOLUTION,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-GLEIF/GLEIF-CorporateActionClassificationScheme,
   :lcc-lr/hasTag "DISSOLUTION",
   :rdf/type [:fibo-fbc-dae-cre/EntitySpecificCreditEvent
              :fibo-cae-ce-act/BusinessStrategyClassifier
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "DISSOLUTION"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "GLEIF classifier for corporate actions involving (i) A voluntary termination of operations, (ii) a general assignment for the benefit of the legal entity's creditors or (iii) any other liquidation, dissolution or winding up of the legal entity (excluding a Liquidity Event), whether voluntary or involuntary (event completed)"}})

(def GLEIF-CorporateActionClassificationScheme
  "scheme for classifying corporate actions according to the GLEIF LEI Common Data Format (CDF) schema"
  {:db/ident :fibo-cae-ce-GLEIF/GLEIF-CorporateActionClassificationScheme,
   :rdf/type [:fibo-cae-ce-act/ActionClassificationScheme :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/",
   :rdfs/label "GLEIF corporate action classification scheme",
   :rdfs/seeAlso
   "https://www.gleif.org/content/2-about-lei/6-common-data-file-format/1-upcoming-versions/2021-03-04_lei-cdf-v3-1.xsd",
   :skos/definition
   "scheme for classifying corporate actions according to the GLEIF LEI Common Data Format (CDF) schema"})

(def INSOLVENCY
  "GLEIF classifier for corporate actions involving the entry of a decree or order by a court or agency or supervisory authority having jurisdiction in the premises the appointment of a trustee-in-bankruptcy or similar official for such party in any insolvency, readjustment of debt, marshalling of assets and liabilities, or similar proceedings, or for the winding up or liquidation of their respective affairs (event completed)"
  {:db/ident :fibo-cae-ce-GLEIF/INSOLVENCY,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-GLEIF/GLEIF-CorporateActionClassificationScheme,
   :lcc-lr/hasTag "INSOLVENCY",
   :rdf/type [:fibo-fbc-dae-cre/EntitySpecificCreditEvent
              :fibo-cae-ce-act/BusinessStrategyClassifier
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "INSOLVENCY"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "GLEIF classifier for corporate actions involving the entry of a decree or order by a court or agency or supervisory authority having jurisdiction in the premises the appointment of a trustee-in-bankruptcy or similar official for such party in any insolvency, readjustment of debt, marshalling of assets and liabilities, or similar proceedings, or for the winding up or liquidation of their respective affairs (event completed)"}})

(def LIQUIDATION
  "GLEIF classifier for corporate actions consisting of distribution of cash, assets, or both"
  {:db/ident :fibo-cae-ce-GLEIF/LIQUIDATION,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-GLEIF/GLEIF-CorporateActionClassificationScheme,
   :lcc-lr/hasTag "LIQUIDATION",
   :rdf/type [:fibo-cae-ce-act/Liquidation
              :fibo-cae-ce-act/BusinessStrategyClassifier
              :owl/NamedIndividual
              :fibo-fbc-dae-cre/EntitySpecificCreditEvent],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "LIQUIDATION"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "GLEIF classifier for corporate actions consisting of distribution of cash, assets, or both"},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Debt may be paid in order of priority based on preferred claims to assets specified by the security (event completed)."}})

(def LegalFormNameGroup
  "GLEIF classifier for corporate actions involving a change in the legal form, name, or other information such as an address change for an organization"
  {:db/ident :fibo-cae-ce-GLEIF/LegalFormNameGroup,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-GLEIF/GLEIF-CorporateActionClassificationScheme,
   :lcc-lr/hasTag "CHANGE_LEGAL_FORM_AND_NAME",
   :rdf/type [:fibo-cae-ce-GLEIF/ActionGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "legal form and name group"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "GLEIF classifier for corporate actions involving a change in the legal form, name, or other information such as an address change for an organization"}})

(def MERGERS_AND_ACQUISITIONS
  "GLEIF classifier for corporate actions in which a single company splits into two or more independent, separately-run companies"
  {:db/ident :fibo-cae-ce-GLEIF/MERGERS_AND_ACQUISITIONS,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-GLEIF/GLEIF-CorporateActionClassificationScheme,
   :lcc-lr/hasTag "MERGERS_AND_ACQUISITIONS",
   :rdf/type [:fibo-cae-ce-act/MergerAcquisition :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "MERGERS_AND_ACQUISITIONS"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "GLEIF classifier for corporate actions in which a single company splits into two or more independent, separately-run companies"},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Regulators also can mandate break-ups of companies for anti-trust reasons."}})

(def ReverseTakeoverGroup
  "GLEIF classifier for corporate actions that are part of a reverse takeover event"
  {:db/ident :fibo-cae-ce-GLEIF/ReverseTakeoverGroup,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-GLEIF/GLEIF-CorporateActionClassificationScheme,
   :lcc-lr/hasTag "REVERSE_TAKEOVER",
   :rdf/type [:fibo-cae-ce-GLEIF/ActionGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "reverse takeover group"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "GLEIF classifier for corporate actions that are part of a reverse takeover event"}})

(def SPINOFF
  "GLEIF classifier for corporate actions where the shareholders of the original entity are compensated for the value loss of the original entity via shares of the new entity or via dividend"
  {:db/ident :fibo-cae-ce-GLEIF/SPINOFF,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-GLEIF/GLEIF-CorporateActionClassificationScheme,
   :lcc-lr/hasTag "SPINOFF",
   :rdf/type [:fibo-cae-ce-act/SpinOff :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "SPINOFF"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "GLEIF classifier for corporate actions where the shareholders of the original entity are compensated for the value loss of the original entity via shares of the new entity or via dividend"}})

(def StandaloneGroup
  "GLEIF classifier for corporate actions that are single, standalone events rather than a combination of multiple events"
  {:db/ident :fibo-cae-ce-GLEIF/StandaloneGroup,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-GLEIF/GLEIF-CorporateActionClassificationScheme,
   :lcc-lr/hasTag "STANDALONE",
   :rdf/type [:fibo-cae-ce-GLEIF/ActionGroup :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "standalone group"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "GLEIF classifier for corporate actions that are single, standalone events rather than a combination of multiple events"}})

(def TRANSFORMATION_BRANCH_TO_SUBSIDIARY
  "GLEIF classifier for corporate actions involving the transfer of all of the assets and liabilities of an International Branch to the new subsidiary entity in exchange for the transfer of securities representing the capital of the subsidiary entity receiving the transfer"
  {:db/ident :fibo-cae-ce-GLEIF/TRANSFORMATION_BRANCH_TO_SUBSIDIARY,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-GLEIF/GLEIF-CorporateActionClassificationScheme,
   :lcc-lr/hasTag "TRANSFORMATION_BRANCH_TO_SUBSIDIARY",
   :rdf/type [:fibo-cae-ce-act/MergerAcquisition :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "TRANSFORMATION_BRANCH_TO_SUBSIDIARY"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "GLEIF classifier for corporate actions involving the transfer of all of the assets and liabilities of an International Branch to the new subsidiary entity in exchange for the transfer of securities representing the capital of the subsidiary entity receiving the transfer"}})

(def TRANSFORMATION_SUBSIDIARY_TO_BRANCH
  "GLEIF classifier for corporate actions involving the transfer of all of the assets and liabilities of a subsidiary to an International Branch entity in exchange for the transfer of securities representing the capital of the International Branch entity receiving the transfer"
  {:db/ident :fibo-cae-ce-GLEIF/TRANSFORMATION_SUBSIDIARY_TO_BRANCH,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-GLEIF/GLEIF-CorporateActionClassificationScheme,
   :lcc-lr/hasTag "TRANSFORMATION_SUBSIDIARY_TO_BRANCH",
   :rdf/type [:fibo-cae-ce-act/MergerAcquisition :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "TRANSFORMATION_SUBSIDIARY_TO_BRANCH"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "GLEIF classifier for corporate actions involving the transfer of all of the assets and liabilities of a subsidiary to an International Branch entity in exchange for the transfer of securities representing the capital of the International Branch entity receiving the transfer"}})

(def TRANSFORMATION_UMBRELLA_TO_STANDALONE
  "GLEIF classifier for corporate actions involving a notification of a change in the legal form from a Fund legal entity structure with one or more than one sub-funds/compartments to a Fund legal entity structure without sub-funds/compartments"
  {:db/ident :fibo-cae-ce-GLEIF/TRANSFORMATION_UMBRELLA_TO_STANDALONE,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-GLEIF/GLEIF-CorporateActionClassificationScheme,
   :lcc-lr/hasTag "TRANSFORMATION_UMBRELLA_TO_STANDALONE",
   :rdf/type [:fibo-cae-ce-act/LegalFormChange :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "TRANSFORMATION_UMBRELLA_TO_STANDALONE"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "GLEIF classifier for corporate actions involving a notification of a change in the legal form from a Fund legal entity structure with one or more than one sub-funds/compartments to a Fund legal entity structure without sub-funds/compartments"}})

(def VOLUNTARY_ARRANGEMENT
  "GLEIF classifier for corporate actions consisting of a procedure that allows a legal entity to settle debts by paying only a proportion of the amount that it owes to creditors or to come to some other arrangement with its creditors over the payment of its debts (event completed)"
  {:db/ident :fibo-cae-ce-GLEIF/VOLUNTARY_ARRANGEMENT,
   :fibo-fnd-rel-rel/isDefinedIn
   :fibo-cae-ce-GLEIF/GLEIF-CorporateActionClassificationScheme,
   :lcc-lr/hasTag "VOLUNTARY_ARRANGEMENT",
   :rdf/type [:fibo-fbc-dae-cre/EntitySpecificCreditEvent
              :fibo-cae-ce-act/BusinessStrategyClassifier
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "VOLUNTARY_ARRANGEMENT"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "GLEIF classifier for corporate actions consisting of a procedure that allows a legal entity to settle debts by paying only a proportion of the amount that it owes to creditors or to come to some other arrangement with its creditors over the payment of its debts (event completed)"}})