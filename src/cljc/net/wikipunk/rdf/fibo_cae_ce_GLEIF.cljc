(ns net.wikipunk.rdf.fibo-cae-ce-GLEIF
  {:cmns-av/copyright "Copyright (c) 2022-2023 EDM Council, Inc.",
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/",
   :dcterms/abstract
   "This ontology includes the codes for corporate action events as specified in GLEIF LEI Common Data Format (CDF) schema, as of 4 March 2021.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
    "cmns-dsg" "https://www.omg.org/spec/Commons/Designators/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-cae-ce-GLEIF"
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/",
    "fibo-cae-ce-act"
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/CorporateActions/",
    "fibo-fbc-dae-cre"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/CreditEvents/",
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
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/DebtAndEquities/CreditEvents/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/CAE/CorporateEvents/CorporateActions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-cae-ce-GLEIF",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "GLEIF Corporate Action Individuals Ontology"},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/"})

(def ABSORPTION
  {:cmns-dsg/isDefinedIn
   :fibo-cae-ce-GLEIF/GLEIF-CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-GLEIF/ABSORPTION,
   :fibo-fnd-rel-rel/hasTag "ABSORPTION",
   :rdf/type #{:fibo-cae-ce-act/MergerAcquisition :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/"},
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
  {:cmns-dsg/isDefinedIn
   :fibo-cae-ce-GLEIF/GLEIF-CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-GLEIF/ACQUISITION_BRANCH,
   :fibo-fnd-rel-rel/hasTag "ACQUISITION_BRANCH",
   :rdf/type #{:fibo-cae-ce-act/MergerAcquisition :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "ACQUISITION_BRANCH"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "GLEIF classifier for corporate actions where the acquiring legal entity purchases an international branch entity"}})

(def ActionGroup
  {:db/ident :fibo-cae-ce-GLEIF/ActionGroup,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "action group"},
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-cls/classifies,
                       :owl/someValuesFrom :fibo-cae-ce-act/Action,
                       :rdf/type           :owl/Restriction}
                      :cmns-cls/Classifier
                      {:owl/onProperty     :fibo-fnd-rel-rel/hasTag,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "classifier that differentiates corporate actions based on a GLEIF specific grouping"}})

(def BANKRUPTCY
  {:cmns-dsg/isDefinedIn
   :fibo-cae-ce-GLEIF/GLEIF-CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-GLEIF/BANKRUPTCY,
   :fibo-fnd-rel-rel/hasTag "BANKRUPTCY",
   :rdf/type #{:fibo-fbc-dae-cre/Bankruptcy
               :fibo-cae-ce-act/BusinessStrategyClassifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/"},
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
  {:cmns-dsg/isDefinedIn
   :fibo-cae-ce-GLEIF/GLEIF-CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-GLEIF/BREAKUP,
   :fibo-fnd-rel-rel/hasTag "BREAKUP",
   :rdf/type #{:owl/NamedIndividual :fibo-cae-ce-act/Divestiture},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/"},
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
  {:cmns-dsg/isDefinedIn
   :fibo-cae-ce-GLEIF/GLEIF-CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-GLEIF/CHANGE_HQ_ADDRESS,
   :fibo-fnd-rel-rel/hasTag "CHANGE_HQ_ADDRESS",
   :rdf/type #{:fibo-cae-ce-act/OrganizationAddressChange :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "CHANGE_HQ_ADDRESS"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "GLEIF classifier for corporate actions involving a notification of a change in the headquarters address of the legal entity"}})

(def CHANGE_LEGAL_ADDRESS
  {:cmns-dsg/isDefinedIn
   :fibo-cae-ce-GLEIF/GLEIF-CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-GLEIF/CHANGE_LEGAL_ADDRESS,
   :fibo-fnd-rel-rel/hasTag "CHANGE_LEGAL_ADDRESS",
   :rdf/type #{:fibo-cae-ce-act/OrganizationAddressChange :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "CHANGE_LEGAL_ADDRESS"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "GLEIF classifier for corporate actions involving a notification of a change in the legal address of the legal entity"}})

(def CHANGE_LEGAL_FORM
  {:cmns-dsg/isDefinedIn
   :fibo-cae-ce-GLEIF/GLEIF-CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-GLEIF/CHANGE_LEGAL_FORM,
   :fibo-fnd-rel-rel/hasTag "CHANGE_LEGAL_FORM",
   :rdf/type #{:owl/NamedIndividual :fibo-cae-ce-act/LegalFormChange},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "CHANGE_LEGAL_FORM"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "GLEIF classifier for corporate actions involving a notification of a change in the legal form of the legal entity"}})

(def CHANGE_LEGAL_NAME
  {:cmns-dsg/isDefinedIn
   :fibo-cae-ce-GLEIF/GLEIF-CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-GLEIF/CHANGE_LEGAL_NAME,
   :fibo-fnd-rel-rel/hasTag "CHANGE_LEGAL_NAME",
   :rdf/type #{:fibo-cae-ce-act/OrganizationNameChange :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "CHANGE_LEGAL_NAME"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "GLEIF classifier for corporate actions involving a notification of a change in the legal name of the legal entity"}})

(def CHANGE_OTHER_NAMES
  {:cmns-dsg/isDefinedIn
   :fibo-cae-ce-GLEIF/GLEIF-CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-GLEIF/CHANGE_OTHER_NAMES,
   :fibo-fnd-rel-rel/hasTag "CHANGE_OTHER_NAMES",
   :rdf/type #{:fibo-cae-ce-act/OrganizationNameChange :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "CHANGE_OTHER_NAMES"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "GLEIF classifier for corporate actions involving a notification of a change in the trade- or doing business name of the legal entity"}})

(def ComplexLegalFormGroup
  {:cmns-dsg/isDefinedIn
   :fibo-cae-ce-GLEIF/GLEIF-CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-GLEIF/ComplexLegalFormGroup,
   :fibo-fnd-rel-rel/hasTag "COMPLEX_CHANGE_LEGAL_FORM",
   :rdf/type #{:fibo-cae-ce-GLEIF/ActionGroup :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "complex legal form group"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "GLEIF classifier for corporate actions involving a more complex legal entity event including change of the legal entity status triggered by change of the legal form"}})

(def DEMERGER
  {:cmns-dsg/isDefinedIn
   :fibo-cae-ce-GLEIF/GLEIF-CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-GLEIF/DEMERGER,
   :fibo-fnd-rel-rel/hasTag "DEMERGER",
   :rdf/type #{:owl/NamedIndividual :fibo-cae-ce-act/Divestiture},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/"},
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
  {:cmns-dsg/isDefinedIn
   :fibo-cae-ce-GLEIF/GLEIF-CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-GLEIF/DISSOLUTION,
   :fibo-fnd-rel-rel/hasTag "DISSOLUTION",
   :rdf/type #{:fibo-cae-ce-act/BusinessStrategyClassifier
               :fibo-fbc-dae-cre/EntitySpecificCreditEvent
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "DISSOLUTION"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "GLEIF classifier for corporate actions involving (i) A voluntary termination of operations, (ii) a general assignment for the benefit of the legal entity's creditors or (iii) any other liquidation, dissolution or winding up of the legal entity (excluding a Liquidity Event), whether voluntary or involuntary (event completed)"}})

(def GLEIF-CorporateActionClassificationScheme
  {:db/ident :fibo-cae-ce-GLEIF/GLEIF-CorporateActionClassificationScheme,
   :rdf/type #{:owl/NamedIndividual
               :fibo-cae-ce-act/ActionClassificationScheme},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/"},
   :rdfs/label "GLEIF corporate action classification scheme",
   :rdfs/seeAlso
   {:xsd/anyURI
    "https://www.gleif.org/content/2-about-lei/6-common-data-file-format/1-upcoming-versions/2021-03-04_lei-cdf-v3-1.xsd"},
   :skos/definition
   "scheme for classifying corporate actions according to the GLEIF LEI Common Data Format (CDF) schema"})

(def INSOLVENCY
  {:cmns-dsg/isDefinedIn
   :fibo-cae-ce-GLEIF/GLEIF-CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-GLEIF/INSOLVENCY,
   :fibo-fnd-rel-rel/hasTag "INSOLVENCY",
   :rdf/type #{:fibo-cae-ce-act/BusinessStrategyClassifier
               :fibo-fbc-dae-cre/EntitySpecificCreditEvent
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "INSOLVENCY"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "GLEIF classifier for corporate actions involving the entry of a decree or order by a court or agency or supervisory authority having jurisdiction in the premises the appointment of a trustee-in-bankruptcy or similar official for such party in any insolvency, readjustment of debt, marshalling of assets and liabilities, or similar proceedings, or for the winding up or liquidation of their respective affairs (event completed)"}})

(def LIQUIDATION
  {:cmns-dsg/isDefinedIn
   :fibo-cae-ce-GLEIF/GLEIF-CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-GLEIF/LIQUIDATION,
   :fibo-fnd-rel-rel/hasTag "LIQUIDATION",
   :rdf/type
   #{:fibo-cae-ce-act/BusinessStrategyClassifier :fibo-cae-ce-act/Liquidation
     :fibo-fbc-dae-cre/EntitySpecificCreditEvent :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/"},
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
  {:cmns-dsg/isDefinedIn
   :fibo-cae-ce-GLEIF/GLEIF-CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-GLEIF/LegalFormNameGroup,
   :fibo-fnd-rel-rel/hasTag "CHANGE_LEGAL_FORM_AND_NAME",
   :rdf/type #{:fibo-cae-ce-GLEIF/ActionGroup :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "legal form and name group"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "GLEIF classifier for corporate actions involving a change in the legal form, name, or other information such as an address change for an organization"}})

(def MERGERS_AND_ACQUISITIONS
  {:cmns-dsg/isDefinedIn
   :fibo-cae-ce-GLEIF/GLEIF-CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-GLEIF/MERGERS_AND_ACQUISITIONS,
   :fibo-fnd-rel-rel/hasTag "MERGERS_AND_ACQUISITIONS",
   :rdf/type #{:fibo-cae-ce-act/MergerAcquisition :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/"},
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
  {:cmns-dsg/isDefinedIn
   :fibo-cae-ce-GLEIF/GLEIF-CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-GLEIF/ReverseTakeoverGroup,
   :fibo-fnd-rel-rel/hasTag "REVERSE_TAKEOVER",
   :rdf/type #{:fibo-cae-ce-GLEIF/ActionGroup :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "reverse takeover group"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "GLEIF classifier for corporate actions that are part of a reverse takeover event"}})

(def SPINOFF
  {:cmns-dsg/isDefinedIn
   :fibo-cae-ce-GLEIF/GLEIF-CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-GLEIF/SPINOFF,
   :fibo-fnd-rel-rel/hasTag "SPINOFF",
   :rdf/type #{:fibo-cae-ce-act/SpinOff :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "SPINOFF"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "GLEIF classifier for corporate actions where the shareholders of the original entity are compensated for the value loss of the original entity via shares of the new entity or via dividend"}})

(def StandaloneGroup
  {:cmns-dsg/isDefinedIn
   :fibo-cae-ce-GLEIF/GLEIF-CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-GLEIF/StandaloneGroup,
   :fibo-fnd-rel-rel/hasTag "STANDALONE",
   :rdf/type #{:fibo-cae-ce-GLEIF/ActionGroup :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "standalone group"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "GLEIF classifier for corporate actions that are single, standalone events rather than a combination of multiple events"}})

(def TRANSFORMATION_BRANCH_TO_SUBSIDIARY
  {:cmns-dsg/isDefinedIn
   :fibo-cae-ce-GLEIF/GLEIF-CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-GLEIF/TRANSFORMATION_BRANCH_TO_SUBSIDIARY,
   :fibo-fnd-rel-rel/hasTag "TRANSFORMATION_BRANCH_TO_SUBSIDIARY",
   :rdf/type #{:fibo-cae-ce-act/MergerAcquisition :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "TRANSFORMATION_BRANCH_TO_SUBSIDIARY"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "GLEIF classifier for corporate actions involving the transfer of all of the assets and liabilities of an International Branch to the new subsidiary entity in exchange for the transfer of securities representing the capital of the subsidiary entity receiving the transfer"}})

(def TRANSFORMATION_SUBSIDIARY_TO_BRANCH
  {:cmns-dsg/isDefinedIn
   :fibo-cae-ce-GLEIF/GLEIF-CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-GLEIF/TRANSFORMATION_SUBSIDIARY_TO_BRANCH,
   :fibo-fnd-rel-rel/hasTag "TRANSFORMATION_SUBSIDIARY_TO_BRANCH",
   :rdf/type #{:fibo-cae-ce-act/MergerAcquisition :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "TRANSFORMATION_SUBSIDIARY_TO_BRANCH"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "GLEIF classifier for corporate actions involving the transfer of all of the assets and liabilities of a subsidiary to an International Branch entity in exchange for the transfer of securities representing the capital of the International Branch entity receiving the transfer"}})

(def TRANSFORMATION_UMBRELLA_TO_STANDALONE
  {:cmns-dsg/isDefinedIn
   :fibo-cae-ce-GLEIF/GLEIF-CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-GLEIF/TRANSFORMATION_UMBRELLA_TO_STANDALONE,
   :fibo-fnd-rel-rel/hasTag "TRANSFORMATION_UMBRELLA_TO_STANDALONE",
   :rdf/type #{:owl/NamedIndividual :fibo-cae-ce-act/LegalFormChange},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "TRANSFORMATION_UMBRELLA_TO_STANDALONE"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "GLEIF classifier for corporate actions involving a notification of a change in the legal form from a Fund legal entity structure with one or more than one sub-funds/compartments to a Fund legal entity structure without sub-funds/compartments"}})

(def VOLUNTARY_ARRANGEMENT
  {:cmns-dsg/isDefinedIn
   :fibo-cae-ce-GLEIF/GLEIF-CorporateActionClassificationScheme,
   :db/ident :fibo-cae-ce-GLEIF/VOLUNTARY_ARRANGEMENT,
   :fibo-fnd-rel-rel/hasTag "VOLUNTARY_ARRANGEMENT",
   :rdf/type #{:fibo-cae-ce-act/BusinessStrategyClassifier
               :fibo-fbc-dae-cre/EntitySpecificCreditEvent
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "VOLUNTARY_ARRANGEMENT"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "GLEIF classifier for corporate actions consisting of a procedure that allows a legal entity to settle debts by paying only a proportion of the amount that it owes to creditors or to come to some other arrangement with its creditors over the payment of its debts (event completed)"}})

(def urn:uuid:1ca38ad3-da03-5925-9b88-b96f8232fd46
  {:cmns-av/copyright "Copyright (c) 2022-2023 EDM Council, Inc.",
   :dcterms/abstract
   "This ontology includes the codes for corporate action events as specified in GLEIF LEI Common Data Format (CDF) schema, as of 4 March 2021.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FBC/DebtAndEquities/CreditEvents/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/CAE/CorporateEvents/CorporateActions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2023Q3/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/"},
   :rdf/type :owl/Ontology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "GLEIF Corporate Action Individuals Ontology"},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/CAE/CorporateEvents/GLEIF-CorporateActionIndividuals/"})