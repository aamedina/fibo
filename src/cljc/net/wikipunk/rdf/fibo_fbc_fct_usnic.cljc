(ns net.wikipunk.rdf.fibo-fbc-fct-usnic
  "This ontology extends the US regulatory agencies ontology with a number of controlled vocabularies required for mapping FIBO to the National Information Center (NIC) Data Dictionary."
  {:cmns-av/copyright "Copyright (c) 2023 EDM Council, Inc.",
   :dcterms/abstract
   "This ontology extends the US regulatory agencies ontology with a number of controlled vocabularies required for mapping FIBO to the National Information Center (NIC) Data Dictionary.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/source
   ["https://www.ffiec.gov/NPW"
    "https://www.ffiec.gov/nicpubweb/Content/DataDownload/NPW%20Data%20Dictionary.pdf"],
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/FinancialProductsAndServices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"
    "https://www.omg.org/spec/Commons/Designators/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"
    "https://www.omg.org/spec/Commons/Collections/"
    "https://www.omg.org/spec/Commons/CodesAndCodeSets/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/FinancialServicesEntities/"
    "https://www.omg.org/spec/Commons/Classifiers/"
    "https://www.omg.org/spec/Commons/TextDatatype/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cds" "https://www.omg.org/spec/Commons/CodesAndCodeSets/",
    "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-dsg" "https://www.omg.org/spec/Commons/Designators/",
    "cmns-txt" "https://www.omg.org/spec/Commons/TextDatatype/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fbc-fct-fse"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/",
    "fibo-fbc-fct-usfse"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
    "fibo-fbc-fct-usjrga"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/",
    "fibo-fbc-fct-usnic"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/",
    "fibo-fbc-pas-fpas"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fbc-fct-usnic",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/",
   :rdfs/label
   "US National Information Center (NIC) Controlled Vocabularies Ontology"})

(def NICEntityTypeClassifier
  "controlled vocabulary and codes for describing the nature of the functional entities managed by the National Information Center (NIC) repository"
  {:db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   ["https://www.ffiec.gov/nicpubweb/Content/DataDownload/NPW%20Data%20Dictionary.pdf"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/"],
   :rdfs/label "National Information Center (NIC) entity type classifier",
   :rdfs/subClassOf
   [{:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-fpas/FinancialServiceProvider,
     :owl/onProperty :cmns-cls/classifies,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fct-usnic/NationalInformationCenterControlledVocabulary
    {:owl/onProperty :cmns-col/isMemberOf,
     :owl/someValuesFrom
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :rdf/type :owl/Restriction}
    :cmns-cls/Classifier
    :cmns-cds/CodeElement
    {:owl/hasValue
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :owl/onProperty :cmns-dsg/isDefinedIn,
     :rdf/type :owl/Restriction}],
   :skos/definition
   "controlled vocabulary and codes for describing the nature of the functional entities managed by the National Information Center (NIC) repository"})

(def NICEntityTypeClassifier-AGB
  "term and code for an Agreement Corporation - Banking"
  {:cmns-txt/hasTextValue "AGB",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-AGB,
   :rdf/type
   [:fibo-fbc-fct-usnic/NICEntityTypeClassifier
    :owl/NamedIndividual
    :cmns-cls/Classifier
    {:owl/hasValue
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :owl/onProperty :cmns-dsg/isDefinedIn,
     :rdf/type :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-fpas/FinancialServiceProvider,
     :owl/onProperty :cmns-cls/classifies,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fct-usnic/NationalInformationCenterControlledVocabulary
    {:owl/onProperty :cmns-col/isMemberOf,
     :owl/someValuesFrom
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :rdf/type :owl/Restriction}
    :cmns-cds/CodeElement],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/",
   :rdfs/label "NIC entity type classifier - AGB",
   :skos/definition "term and code for an Agreement Corporation - Banking"})

(def NICEntityTypeClassifier-AGI
  "term and code for an Agreement Corporation - Investment"
  {:cmns-txt/hasTextValue "AGI",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-AGI,
   :rdf/type
   [:fibo-fbc-fct-usnic/NICEntityTypeClassifier
    :owl/NamedIndividual
    :cmns-cls/Classifier
    {:owl/hasValue
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :owl/onProperty :cmns-dsg/isDefinedIn,
     :rdf/type :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-fpas/FinancialServiceProvider,
     :owl/onProperty :cmns-cls/classifies,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fct-usnic/NationalInformationCenterControlledVocabulary
    {:owl/onProperty :cmns-col/isMemberOf,
     :owl/someValuesFrom
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :rdf/type :owl/Restriction}
    :cmns-cds/CodeElement],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/",
   :rdfs/label "NIC entity type classifier - AGI",
   :skos/definition "term and code for an Agreement Corporation - Investment"})

(def NICEntityTypeClassifier-BHC
  "term and code for a Bank Holding Company"
  {:cmns-txt/hasTextValue "BCH",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-BHC,
   :rdf/type
   [:fibo-fbc-fct-usnic/NICEntityTypeClassifier
    :owl/NamedIndividual
    :cmns-cls/Classifier
    {:owl/hasValue
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :owl/onProperty :cmns-dsg/isDefinedIn,
     :rdf/type :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-fpas/FinancialServiceProvider,
     :owl/onProperty :cmns-cls/classifies,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fct-usnic/NationalInformationCenterControlledVocabulary
    {:owl/onProperty :cmns-col/isMemberOf,
     :owl/someValuesFrom
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :rdf/type :owl/Restriction}
    :cmns-cds/CodeElement],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/",
   :rdfs/label "NIC entity type classifier - BHC",
   :skos/definition "term and code for a Bank Holding Company"})

(def NICEntityTypeClassifier-CPB
  "term and code for a Cooperative Bank"
  {:cmns-txt/hasTextValue "CPB",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-CPB,
   :rdf/type
   [:fibo-fbc-fct-usnic/NICEntityTypeClassifier
    :owl/NamedIndividual
    :cmns-cls/Classifier
    {:owl/hasValue
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :owl/onProperty :cmns-dsg/isDefinedIn,
     :rdf/type :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-fpas/FinancialServiceProvider,
     :owl/onProperty :cmns-cls/classifies,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fct-usnic/NationalInformationCenterControlledVocabulary
    {:owl/onProperty :cmns-col/isMemberOf,
     :owl/someValuesFrom
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :rdf/type :owl/Restriction}
    :cmns-cds/CodeElement],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/",
   :rdfs/label "NIC entity type classifier - CPB",
   :skos/definition "term and code for a Cooperative Bank"})

(def NICEntityTypeClassifier-DBR
  "term and code for a Domestic Branch of a Domestic Bank"
  {:cmns-txt/hasTextValue "DBR",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-DBR,
   :rdf/type
   [:fibo-fbc-fct-usnic/NICEntityTypeClassifier
    :owl/NamedIndividual
    :cmns-cls/Classifier
    {:owl/hasValue
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :owl/onProperty :cmns-dsg/isDefinedIn,
     :rdf/type :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-fpas/FinancialServiceProvider,
     :owl/onProperty :cmns-cls/classifies,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fct-usnic/NationalInformationCenterControlledVocabulary
    {:owl/onProperty :cmns-col/isMemberOf,
     :owl/someValuesFrom
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :rdf/type :owl/Restriction}
    :cmns-cds/CodeElement],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/",
   :rdfs/label "NIC entity type classifier - DBR",
   :skos/definition "term and code for a Domestic Branch of a Domestic Bank"})

(def NICEntityTypeClassifier-DEO
  "term and code for a Domestic Entity Other"
  {:cmns-txt/hasTextValue "DEO",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-DEO,
   :rdf/type
   [:fibo-fbc-fct-usnic/NICEntityTypeClassifier
    :owl/NamedIndividual
    :cmns-cls/Classifier
    {:owl/hasValue
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :owl/onProperty :cmns-dsg/isDefinedIn,
     :rdf/type :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-fpas/FinancialServiceProvider,
     :owl/onProperty :cmns-cls/classifies,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fct-usnic/NationalInformationCenterControlledVocabulary
    {:owl/onProperty :cmns-col/isMemberOf,
     :owl/someValuesFrom
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :rdf/type :owl/Restriction}
    :cmns-cds/CodeElement],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/",
   :rdfs/label "NIC entity type classifier - DEO",
   :skos/definition "term and code for a Domestic Entity Other"})

(def NICEntityTypeClassifier-DPS
  "term and code for a Data Processing Servicer"
  {:cmns-txt/hasTextValue "DPS",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-DPS,
   :rdf/type
   [:fibo-fbc-fct-usnic/NICEntityTypeClassifier
    :owl/NamedIndividual
    :cmns-cls/Classifier
    {:owl/hasValue
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :owl/onProperty :cmns-dsg/isDefinedIn,
     :rdf/type :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-fpas/FinancialServiceProvider,
     :owl/onProperty :cmns-cls/classifies,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fct-usnic/NationalInformationCenterControlledVocabulary
    {:owl/onProperty :cmns-col/isMemberOf,
     :owl/someValuesFrom
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :rdf/type :owl/Restriction}
    :cmns-cds/CodeElement],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/",
   :rdfs/label "NIC entity type classifier - DPS",
   :skos/definition "term and code for a Data Processing Servicer"})

(def NICEntityTypeClassifier-EBR
  "term and code for an Edge Corporation - Domestic Branch"
  {:cmns-txt/hasTextValue "EBR",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-EBR,
   :rdf/type
   [:fibo-fbc-fct-usnic/NICEntityTypeClassifier
    :owl/NamedIndividual
    :cmns-cls/Classifier
    {:owl/hasValue
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :owl/onProperty :cmns-dsg/isDefinedIn,
     :rdf/type :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-fpas/FinancialServiceProvider,
     :owl/onProperty :cmns-cls/classifies,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fct-usnic/NationalInformationCenterControlledVocabulary
    {:owl/onProperty :cmns-col/isMemberOf,
     :owl/someValuesFrom
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :rdf/type :owl/Restriction}
    :cmns-cds/CodeElement],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/",
   :rdfs/label "NIC entity type classifier - EBR",
   :skos/definition "term and code for an Edge Corporation - Domestic Branch"})

(def NICEntityTypeClassifier-EDB
  "term and code for an Edge Corporation - Banking"
  {:cmns-txt/hasTextValue "EDB",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-EDB,
   :rdf/type
   [:fibo-fbc-fct-usnic/NICEntityTypeClassifier
    :owl/NamedIndividual
    :cmns-cls/Classifier
    {:owl/hasValue
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :owl/onProperty :cmns-dsg/isDefinedIn,
     :rdf/type :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-fpas/FinancialServiceProvider,
     :owl/onProperty :cmns-cls/classifies,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fct-usnic/NationalInformationCenterControlledVocabulary
    {:owl/onProperty :cmns-col/isMemberOf,
     :owl/someValuesFrom
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :rdf/type :owl/Restriction}
    :cmns-cds/CodeElement],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/",
   :rdfs/label "NIC entity type classifier - EDB",
   :skos/definition "term and code for an Edge Corporation - Banking"})

(def NICEntityTypeClassifier-EDI
  "term and code for an Edge Corporation - Investment"
  {:cmns-txt/hasTextValue "EDI",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-EDI,
   :rdf/type
   [:fibo-fbc-fct-usnic/NICEntityTypeClassifier
    :owl/NamedIndividual
    :cmns-cls/Classifier
    {:owl/hasValue
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :owl/onProperty :cmns-dsg/isDefinedIn,
     :rdf/type :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-fpas/FinancialServiceProvider,
     :owl/onProperty :cmns-cls/classifies,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fct-usnic/NationalInformationCenterControlledVocabulary
    {:owl/onProperty :cmns-col/isMemberOf,
     :owl/someValuesFrom
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :rdf/type :owl/Restriction}
    :cmns-cds/CodeElement],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/",
   :rdfs/label "NIC entity type classifier - EDI",
   :skos/definition "term and code for an Edge Corporation - Investment"})

(def NICEntityTypeClassifier-FBH
  "term and code for a Foreign Banking Organization as a Bank Holding Company"
  {:cmns-txt/hasTextValue "FBH",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-FBH,
   :rdf/type
   [:fibo-fbc-fct-usnic/NICEntityTypeClassifier
    :owl/NamedIndividual
    :cmns-cls/Classifier
    {:owl/hasValue
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :owl/onProperty :cmns-dsg/isDefinedIn,
     :rdf/type :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-fpas/FinancialServiceProvider,
     :owl/onProperty :cmns-cls/classifies,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fct-usnic/NationalInformationCenterControlledVocabulary
    {:owl/onProperty :cmns-col/isMemberOf,
     :owl/someValuesFrom
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :rdf/type :owl/Restriction}
    :cmns-cds/CodeElement],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/",
   :rdfs/label "NIC entity type classifier - FBH",
   :skos/definition
   "term and code for a Foreign Banking Organization as a Bank Holding Company"})

(def NICEntityTypeClassifier-FBK
  "term and code for a Foreign Bank"
  {:cmns-txt/hasTextValue "FBK",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-FBK,
   :rdf/type
   [:fibo-fbc-fct-usnic/NICEntityTypeClassifier
    :owl/NamedIndividual
    :cmns-cls/Classifier
    {:owl/hasValue
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :owl/onProperty :cmns-dsg/isDefinedIn,
     :rdf/type :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-fpas/FinancialServiceProvider,
     :owl/onProperty :cmns-cls/classifies,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fct-usnic/NationalInformationCenterControlledVocabulary
    {:owl/onProperty :cmns-col/isMemberOf,
     :owl/someValuesFrom
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :rdf/type :owl/Restriction}
    :cmns-cds/CodeElement],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/",
   :rdfs/label "NIC entity type classifier - FBK",
   :skos/definition "term and code for a Foreign Bank"})

(def NICEntityTypeClassifier-FBO
  "term and code for a Foreign Banking Organization"
  {:cmns-txt/hasTextValue "FBO",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-FBO,
   :rdf/type
   [:fibo-fbc-fct-usnic/NICEntityTypeClassifier
    :owl/NamedIndividual
    :cmns-cls/Classifier
    {:owl/hasValue
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :owl/onProperty :cmns-dsg/isDefinedIn,
     :rdf/type :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-fpas/FinancialServiceProvider,
     :owl/onProperty :cmns-cls/classifies,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fct-usnic/NationalInformationCenterControlledVocabulary
    {:owl/onProperty :cmns-col/isMemberOf,
     :owl/someValuesFrom
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :rdf/type :owl/Restriction}
    :cmns-cds/CodeElement],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/",
   :rdfs/label "NIC entity type classifier - FBO",
   :skos/definition "term and code for a Foreign Banking Organization"})

(def NICEntityTypeClassifier-FCU
  "term and code for a Federal Credit Union"
  {:cmns-txt/hasTextValue "FCU",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-FCU,
   :rdf/type
   [:fibo-fbc-fct-usnic/NICEntityTypeClassifier
    :owl/NamedIndividual
    :cmns-cls/Classifier
    {:owl/hasValue
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :owl/onProperty :cmns-dsg/isDefinedIn,
     :rdf/type :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-fpas/FinancialServiceProvider,
     :owl/onProperty :cmns-cls/classifies,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fct-usnic/NationalInformationCenterControlledVocabulary
    {:owl/onProperty :cmns-col/isMemberOf,
     :owl/someValuesFrom
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :rdf/type :owl/Restriction}
    :cmns-cds/CodeElement],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/",
   :rdfs/label "NIC entity type classifier - FCU",
   :skos/definition "term and code for a Federal Credit Union"})

(def NICEntityTypeClassifier-FEO
  "term and code for a Foreign Entity Other"
  {:cmns-txt/hasTextValue "FEO",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-FEO,
   :rdf/type
   [:fibo-fbc-fct-usnic/NICEntityTypeClassifier
    :owl/NamedIndividual
    :cmns-cls/Classifier
    {:owl/hasValue
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :owl/onProperty :cmns-dsg/isDefinedIn,
     :rdf/type :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-fpas/FinancialServiceProvider,
     :owl/onProperty :cmns-cls/classifies,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fct-usnic/NationalInformationCenterControlledVocabulary
    {:owl/onProperty :cmns-col/isMemberOf,
     :owl/someValuesFrom
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :rdf/type :owl/Restriction}
    :cmns-cds/CodeElement],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/",
   :rdfs/label "NIC entity type classifier - FEO",
   :skos/definition "term and code for a Foreign Entity Other"})

(def NICEntityTypeClassifier-FHD
  "term and code for a Financial Holding Company / Bank Holding Company"
  {:cmns-txt/hasTextValue "FHD",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-FHD,
   :rdf/type
   [:fibo-fbc-fct-usnic/NICEntityTypeClassifier
    :owl/NamedIndividual
    :cmns-cls/Classifier
    {:owl/hasValue
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :owl/onProperty :cmns-dsg/isDefinedIn,
     :rdf/type :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-fpas/FinancialServiceProvider,
     :owl/onProperty :cmns-cls/classifies,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fct-usnic/NationalInformationCenterControlledVocabulary
    {:owl/onProperty :cmns-col/isMemberOf,
     :owl/someValuesFrom
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :rdf/type :owl/Restriction}
    :cmns-cds/CodeElement],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/",
   :rdfs/label "NIC entity type classifier - FHD",
   :skos/definition
   "term and code for a Financial Holding Company / Bank Holding Company"})

(def NICEntityTypeClassifier-FHF
  "term and code for a Financial Holding Company / Foreign Banking Organization"
  {:cmns-txt/hasTextValue "FHF",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-FHF,
   :rdf/type
   [:fibo-fbc-fct-usnic/NICEntityTypeClassifier
    :owl/NamedIndividual
    :cmns-cls/Classifier
    {:owl/hasValue
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :owl/onProperty :cmns-dsg/isDefinedIn,
     :rdf/type :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-fpas/FinancialServiceProvider,
     :owl/onProperty :cmns-cls/classifies,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fct-usnic/NationalInformationCenterControlledVocabulary
    {:owl/onProperty :cmns-col/isMemberOf,
     :owl/someValuesFrom
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :rdf/type :owl/Restriction}
    :cmns-cds/CodeElement],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/",
   :rdfs/label "NIC entity type classifier - FHF",
   :skos/definition
   "term and code for a Financial Holding Company / Foreign Banking Organization"})

(def NICEntityTypeClassifier-FNC
  "term and code for a Finance Company"
  {:cmns-txt/hasTextValue "FNC",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-FNC,
   :rdf/type
   [:fibo-fbc-fct-usnic/NICEntityTypeClassifier
    :owl/NamedIndividual
    :cmns-cls/Classifier
    {:owl/hasValue
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :owl/onProperty :cmns-dsg/isDefinedIn,
     :rdf/type :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-fpas/FinancialServiceProvider,
     :owl/onProperty :cmns-cls/classifies,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fct-usnic/NationalInformationCenterControlledVocabulary
    {:owl/onProperty :cmns-col/isMemberOf,
     :owl/someValuesFrom
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :rdf/type :owl/Restriction}
    :cmns-cds/CodeElement],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/",
   :rdfs/label "NIC entity type classifier - FNC",
   :skos/definition "term and code for a Finance Company"})

(def NICEntityTypeClassifier-FSB
  "term and code for a Federal Savings Bank"
  {:cmns-txt/hasTextValue "FSB",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-FSB,
   :rdf/type
   [:fibo-fbc-fct-usnic/NICEntityTypeClassifier
    :owl/NamedIndividual
    :cmns-cls/Classifier
    {:owl/hasValue
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :owl/onProperty :cmns-dsg/isDefinedIn,
     :rdf/type :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-fpas/FinancialServiceProvider,
     :owl/onProperty :cmns-cls/classifies,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fct-usnic/NationalInformationCenterControlledVocabulary
    {:owl/onProperty :cmns-col/isMemberOf,
     :owl/someValuesFrom
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :rdf/type :owl/Restriction}
    :cmns-cds/CodeElement],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/",
   :rdfs/label "NIC entity type classifier - FSB",
   :skos/definition "term and code for a Federal Savings Bank"})

(def NICEntityTypeClassifier-IBK
  "term and code for a International Bank of a U.S. Depository - Edge or Trust Co."
  {:cmns-txt/hasTextValue "IBK",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-IBK,
   :rdf/type
   [:fibo-fbc-fct-usnic/NICEntityTypeClassifier
    :owl/NamedIndividual
    :cmns-cls/Classifier
    {:owl/hasValue
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :owl/onProperty :cmns-dsg/isDefinedIn,
     :rdf/type :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-fpas/FinancialServiceProvider,
     :owl/onProperty :cmns-cls/classifies,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fct-usnic/NationalInformationCenterControlledVocabulary
    {:owl/onProperty :cmns-col/isMemberOf,
     :owl/someValuesFrom
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :rdf/type :owl/Restriction}
    :cmns-cds/CodeElement],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/",
   :rdfs/label "NIC entity type classifier - IBK",
   :skos/definition
   "term and code for a International Bank of a U.S. Depository - Edge or Trust Co."})

(def NICEntityTypeClassifier-IBR
  "term and code for a Foreign Branch of a U.S. Bank"
  {:cmns-txt/hasTextValue "IBR",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-IBR,
   :rdf/type
   [:fibo-fbc-fct-usnic/NICEntityTypeClassifier
    :owl/NamedIndividual
    :cmns-cls/Classifier
    {:owl/hasValue
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :owl/onProperty :cmns-dsg/isDefinedIn,
     :rdf/type :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-fpas/FinancialServiceProvider,
     :owl/onProperty :cmns-cls/classifies,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fct-usnic/NationalInformationCenterControlledVocabulary
    {:owl/onProperty :cmns-col/isMemberOf,
     :owl/someValuesFrom
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :rdf/type :owl/Restriction}
    :cmns-cds/CodeElement],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/",
   :rdfs/label "NIC entity type classifier - IBR",
   :skos/definition "term and code for a Foreign Branch of a U.S. Bank"})

(def NICEntityTypeClassifier-IFB
  "term and code for an Insured Federal Branch of an FBO"
  {:cmns-txt/hasTextValue "IFB",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-IFB,
   :rdf/type
   [:fibo-fbc-fct-usnic/NICEntityTypeClassifier
    :owl/NamedIndividual
    :cmns-cls/Classifier
    {:owl/hasValue
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :owl/onProperty :cmns-dsg/isDefinedIn,
     :rdf/type :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-fpas/FinancialServiceProvider,
     :owl/onProperty :cmns-cls/classifies,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fct-usnic/NationalInformationCenterControlledVocabulary
    {:owl/onProperty :cmns-col/isMemberOf,
     :owl/someValuesFrom
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :rdf/type :owl/Restriction}
    :cmns-cds/CodeElement],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/",
   :rdfs/label "NIC entity type classifier - IFB",
   :skos/definition "term and code for an Insured Federal Branch of an FBO"})

(def NICEntityTypeClassifier-IHC
  "term and code for an Intermediate Holding Company"
  {:cmns-txt/hasTextValue "IHC",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-IHC,
   :rdf/type
   [:fibo-fbc-fct-usnic/NICEntityTypeClassifier
    :owl/NamedIndividual
    :cmns-cls/Classifier
    {:owl/hasValue
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :owl/onProperty :cmns-dsg/isDefinedIn,
     :rdf/type :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-fpas/FinancialServiceProvider,
     :owl/onProperty :cmns-cls/classifies,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fct-usnic/NationalInformationCenterControlledVocabulary
    {:owl/onProperty :cmns-col/isMemberOf,
     :owl/someValuesFrom
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :rdf/type :owl/Restriction}
    :cmns-cds/CodeElement],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/",
   :rdfs/label "NIC entity type classifier - IHC",
   :skos/definition "term and code for an Intermediate Holding Company"})

(def NICEntityTypeClassifier-INB
  "term and code for an International Non-bank Subs of Domestic Entities"
  {:cmns-txt/hasTextValue "INB",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-INB,
   :rdf/type
   [:fibo-fbc-fct-usnic/NICEntityTypeClassifier
    :owl/NamedIndividual
    :cmns-cls/Classifier
    {:owl/hasValue
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :owl/onProperty :cmns-dsg/isDefinedIn,
     :rdf/type :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-fpas/FinancialServiceProvider,
     :owl/onProperty :cmns-cls/classifies,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fct-usnic/NationalInformationCenterControlledVocabulary
    {:owl/onProperty :cmns-col/isMemberOf,
     :owl/someValuesFrom
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :rdf/type :owl/Restriction}
    :cmns-cds/CodeElement],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/",
   :rdfs/label "NIC entity type classifier - INB",
   :skos/definition
   "term and code for an International Non-bank Subs of Domestic Entities"})

(def NICEntityTypeClassifier-ISB
  "term and code for an Insured State Branch of an FBO"
  {:cmns-txt/hasTextValue "ISB",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-ISB,
   :rdf/type
   [:fibo-fbc-fct-usnic/NICEntityTypeClassifier
    :owl/NamedIndividual
    :cmns-cls/Classifier
    {:owl/hasValue
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :owl/onProperty :cmns-dsg/isDefinedIn,
     :rdf/type :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-fpas/FinancialServiceProvider,
     :owl/onProperty :cmns-cls/classifies,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fct-usnic/NationalInformationCenterControlledVocabulary
    {:owl/onProperty :cmns-col/isMemberOf,
     :owl/someValuesFrom
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :rdf/type :owl/Restriction}
    :cmns-cds/CodeElement],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/",
   :rdfs/label "NIC entity type classifier - ISB",
   :skos/definition "term and code for an Insured State Branch of an FBO"})

(def NICEntityTypeClassifier-MTC
  "term and code for a Non-deposit Trust Company - Member"
  {:cmns-txt/hasTextValue "MTC",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-MTC,
   :rdf/type
   [:fibo-fbc-fct-usnic/NICEntityTypeClassifier
    :owl/NamedIndividual
    :cmns-cls/Classifier
    {:owl/hasValue
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :owl/onProperty :cmns-dsg/isDefinedIn,
     :rdf/type :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-fpas/FinancialServiceProvider,
     :owl/onProperty :cmns-cls/classifies,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fct-usnic/NationalInformationCenterControlledVocabulary
    {:owl/onProperty :cmns-col/isMemberOf,
     :owl/someValuesFrom
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :rdf/type :owl/Restriction}
    :cmns-cds/CodeElement],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/",
   :rdfs/label "NIC entity type classifier - MTC",
   :skos/definition "term and code for a Non-deposit Trust Company - Member"})

(def NICEntityTypeClassifier-NAT
  "term and code for a National Bank"
  {:cmns-txt/hasTextValue "NAT",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-NAT,
   :rdf/type
   [:fibo-fbc-fct-usnic/NICEntityTypeClassifier
    :owl/NamedIndividual
    :cmns-cls/Classifier
    {:owl/hasValue
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :owl/onProperty :cmns-dsg/isDefinedIn,
     :rdf/type :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-fpas/FinancialServiceProvider,
     :owl/onProperty :cmns-cls/classifies,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fct-usnic/NationalInformationCenterControlledVocabulary
    {:owl/onProperty :cmns-col/isMemberOf,
     :owl/someValuesFrom
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :rdf/type :owl/Restriction}
    :cmns-cds/CodeElement],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/",
   :rdfs/label "NIC entity type classifier - NAT",
   :skos/definition "term and code for a National Bank"})

(def NICEntityTypeClassifier-NMB
  "term and code for a Non-member Bank"
  {:cmns-txt/hasTextValue "NMB",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-NMB,
   :rdf/type
   [:fibo-fbc-fct-usnic/NICEntityTypeClassifier
    :owl/NamedIndividual
    :cmns-cls/Classifier
    {:owl/hasValue
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :owl/onProperty :cmns-dsg/isDefinedIn,
     :rdf/type :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-fpas/FinancialServiceProvider,
     :owl/onProperty :cmns-cls/classifies,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fct-usnic/NationalInformationCenterControlledVocabulary
    {:owl/onProperty :cmns-col/isMemberOf,
     :owl/someValuesFrom
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :rdf/type :owl/Restriction}
    :cmns-cds/CodeElement],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/",
   :rdfs/label "NIC entity type classifier - NMB",
   :skos/definition "term and code for a Non-member Bank"})

(def NICEntityTypeClassifier-NTC
  "term and code for a Non-deposit Trust Company - Non-member"
  {:cmns-txt/hasTextValue "NTC",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-NTC,
   :rdf/type
   [:fibo-fbc-fct-usnic/NICEntityTypeClassifier
    :owl/NamedIndividual
    :cmns-cls/Classifier
    {:owl/hasValue
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :owl/onProperty :cmns-dsg/isDefinedIn,
     :rdf/type :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-fpas/FinancialServiceProvider,
     :owl/onProperty :cmns-cls/classifies,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fct-usnic/NationalInformationCenterControlledVocabulary
    {:owl/onProperty :cmns-col/isMemberOf,
     :owl/someValuesFrom
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :rdf/type :owl/Restriction}
    :cmns-cds/CodeElement],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/",
   :rdfs/label "NIC entity type classifier - NTC",
   :skos/definition
   "term and code for a Non-deposit Trust Company - Non-member"})

(def NICEntityTypeClassifier-NYI
  "term and code for a New York Investment Company"
  {:cmns-txt/hasTextValue "NYI",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-NYI,
   :rdf/type
   [:fibo-fbc-fct-usnic/NICEntityTypeClassifier
    :owl/NamedIndividual
    :cmns-cls/Classifier
    {:owl/hasValue
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :owl/onProperty :cmns-dsg/isDefinedIn,
     :rdf/type :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-fpas/FinancialServiceProvider,
     :owl/onProperty :cmns-cls/classifies,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fct-usnic/NationalInformationCenterControlledVocabulary
    {:owl/onProperty :cmns-col/isMemberOf,
     :owl/someValuesFrom
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :rdf/type :owl/Restriction}
    :cmns-cds/CodeElement],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/",
   :rdfs/label "NIC entity type classifier - NYI",
   :skos/definition "term and code for a New York Investment Company"})

(def NICEntityTypeClassifier-PST
  "term and code for a Non-U.S. Branch managed by a U.S. Branch/Agency of a Foreign Bank for 002's reporting - Pseudo Twig"
  {:cmns-txt/hasTextValue "PST",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-PST,
   :rdf/type
   [:fibo-fbc-fct-usnic/NICEntityTypeClassifier
    :owl/NamedIndividual
    :cmns-cls/Classifier
    {:owl/hasValue
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :owl/onProperty :cmns-dsg/isDefinedIn,
     :rdf/type :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-fpas/FinancialServiceProvider,
     :owl/onProperty :cmns-cls/classifies,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fct-usnic/NationalInformationCenterControlledVocabulary
    {:owl/onProperty :cmns-col/isMemberOf,
     :owl/someValuesFrom
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :rdf/type :owl/Restriction}
    :cmns-cds/CodeElement],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/",
   :rdfs/label "NIC entity type classifier - PST",
   :skos/definition
   "term and code for a Non-U.S. Branch managed by a U.S. Branch/Agency of a Foreign Bank for 002's reporting - Pseudo Twig"})

(def NICEntityTypeClassifier-REP
  "term and code for a Representative Office"
  {:cmns-txt/hasTextValue "REP",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-REP,
   :rdf/type
   [:fibo-fbc-fct-usnic/NICEntityTypeClassifier
    :owl/NamedIndividual
    :cmns-cls/Classifier
    {:owl/hasValue
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :owl/onProperty :cmns-dsg/isDefinedIn,
     :rdf/type :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-fpas/FinancialServiceProvider,
     :owl/onProperty :cmns-cls/classifies,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fct-usnic/NationalInformationCenterControlledVocabulary
    {:owl/onProperty :cmns-col/isMemberOf,
     :owl/someValuesFrom
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :rdf/type :owl/Restriction}
    :cmns-cds/CodeElement],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/",
   :rdfs/label "NIC entity type classifier - REP",
   :skos/definition "term and code for a Representative Office"})

(def NICEntityTypeClassifier-SAL
  "term and code for a Savings & Loan Association"
  {:cmns-txt/hasTextValue "SAL",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-SAL,
   :rdf/type
   [:fibo-fbc-fct-usnic/NICEntityTypeClassifier
    :owl/NamedIndividual
    :cmns-cls/Classifier
    {:owl/hasValue
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :owl/onProperty :cmns-dsg/isDefinedIn,
     :rdf/type :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-fpas/FinancialServiceProvider,
     :owl/onProperty :cmns-cls/classifies,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fct-usnic/NationalInformationCenterControlledVocabulary
    {:owl/onProperty :cmns-col/isMemberOf,
     :owl/someValuesFrom
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :rdf/type :owl/Restriction}
    :cmns-cds/CodeElement],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/",
   :rdfs/label "NIC entity type classifier - SAL",
   :skos/definition "term and code for a Savings & Loan Association"})

(def NICEntityTypeClassifier-SBD
  "term and code for a Securities Broker / Dealer"
  {:cmns-txt/hasTextValue "SBD",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-SBD,
   :rdf/type
   [:fibo-fbc-fct-usnic/NICEntityTypeClassifier
    :owl/NamedIndividual
    :cmns-cls/Classifier
    {:owl/hasValue
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :owl/onProperty :cmns-dsg/isDefinedIn,
     :rdf/type :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-fpas/FinancialServiceProvider,
     :owl/onProperty :cmns-cls/classifies,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fct-usnic/NationalInformationCenterControlledVocabulary
    {:owl/onProperty :cmns-col/isMemberOf,
     :owl/someValuesFrom
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :rdf/type :owl/Restriction}
    :cmns-cds/CodeElement],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/",
   :rdfs/label "NIC entity type classifier - SBD",
   :skos/definition "term and code for a Securities Broker / Dealer"})

(def NICEntityTypeClassifier-SCU
  "term and code for a State Credit Union"
  {:cmns-txt/hasTextValue "SCU",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-SCU,
   :rdf/type
   [:fibo-fbc-fct-usnic/NICEntityTypeClassifier
    :owl/NamedIndividual
    :cmns-cls/Classifier
    {:owl/hasValue
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :owl/onProperty :cmns-dsg/isDefinedIn,
     :rdf/type :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-fpas/FinancialServiceProvider,
     :owl/onProperty :cmns-cls/classifies,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fct-usnic/NationalInformationCenterControlledVocabulary
    {:owl/onProperty :cmns-col/isMemberOf,
     :owl/someValuesFrom
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :rdf/type :owl/Restriction}
    :cmns-cds/CodeElement],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/",
   :rdfs/label "NIC entity type classifier - SCU",
   :skos/definition "term and code for a State Credit Union"})

(def NICEntityTypeClassifier-SLHC
  "term and code for a Savings and Loan Holding Company"
  {:cmns-txt/hasTextValue "SLHC",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-SLHC,
   :rdf/type
   [:fibo-fbc-fct-usnic/NICEntityTypeClassifier
    :owl/NamedIndividual
    :cmns-cls/Classifier
    {:owl/hasValue
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :owl/onProperty :cmns-dsg/isDefinedIn,
     :rdf/type :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-fpas/FinancialServiceProvider,
     :owl/onProperty :cmns-cls/classifies,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fct-usnic/NationalInformationCenterControlledVocabulary
    {:owl/onProperty :cmns-col/isMemberOf,
     :owl/someValuesFrom
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :rdf/type :owl/Restriction}
    :cmns-cds/CodeElement],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/",
   :rdfs/label "NIC entity type classifier - SLHC",
   :skos/definition "term and code for a Savings and Loan Holding Company"})

(def NICEntityTypeClassifier-SMB
  "term and code for a State Member Bank"
  {:cmns-txt/hasTextValue "SMB",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-SMB,
   :rdf/type
   [:fibo-fbc-fct-usnic/NICEntityTypeClassifier
    :owl/NamedIndividual
    :cmns-cls/Classifier
    {:owl/hasValue
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :owl/onProperty :cmns-dsg/isDefinedIn,
     :rdf/type :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-fpas/FinancialServiceProvider,
     :owl/onProperty :cmns-cls/classifies,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fct-usnic/NationalInformationCenterControlledVocabulary
    {:owl/onProperty :cmns-col/isMemberOf,
     :owl/someValuesFrom
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :rdf/type :owl/Restriction}
    :cmns-cds/CodeElement],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/",
   :rdfs/label "NIC entity type classifier - SMB",
   :skos/definition "term and code for a State Member Bank"})

(def NICEntityTypeClassifier-SSB
  "term and code for a State Savings Bank"
  {:cmns-txt/hasTextValue "SSB",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-SSB,
   :rdf/type
   [:fibo-fbc-fct-usnic/NICEntityTypeClassifier
    :owl/NamedIndividual
    :cmns-cls/Classifier
    {:owl/hasValue
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :owl/onProperty :cmns-dsg/isDefinedIn,
     :rdf/type :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-fpas/FinancialServiceProvider,
     :owl/onProperty :cmns-cls/classifies,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fct-usnic/NationalInformationCenterControlledVocabulary
    {:owl/onProperty :cmns-col/isMemberOf,
     :owl/someValuesFrom
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :rdf/type :owl/Restriction}
    :cmns-cds/CodeElement],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/",
   :rdfs/label "NIC entity type classifier - SSB",
   :skos/definition "term and code for a State Savings Bank"})

(def NICEntityTypeClassifier-TWG
  "term and code for a Non-U.S. Branch managed by a U.S. Branch/Agency of a Foreign Bank - TWIG"
  {:cmns-txt/hasTextValue "TWG",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-TWG,
   :rdf/type
   [:fibo-fbc-fct-usnic/NICEntityTypeClassifier
    :owl/NamedIndividual
    :cmns-cls/Classifier
    {:owl/hasValue
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :owl/onProperty :cmns-dsg/isDefinedIn,
     :rdf/type :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-fpas/FinancialServiceProvider,
     :owl/onProperty :cmns-cls/classifies,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fct-usnic/NationalInformationCenterControlledVocabulary
    {:owl/onProperty :cmns-col/isMemberOf,
     :owl/someValuesFrom
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :rdf/type :owl/Restriction}
    :cmns-cds/CodeElement],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/",
   :rdfs/label "NIC entity type classifier - TWG",
   :skos/definition
   "term and code for a Non-U.S. Branch managed by a U.S. Branch/Agency of a Foreign Bank - TWIG"})

(def NICEntityTypeClassifier-UFA
  "term and code for an Uninsured Federal Agency of an FBO"
  {:cmns-txt/hasTextValue "UFA",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-UFA,
   :rdf/type
   [:fibo-fbc-fct-usnic/NICEntityTypeClassifier
    :owl/NamedIndividual
    :cmns-cls/Classifier
    {:owl/hasValue
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :owl/onProperty :cmns-dsg/isDefinedIn,
     :rdf/type :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-fpas/FinancialServiceProvider,
     :owl/onProperty :cmns-cls/classifies,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fct-usnic/NationalInformationCenterControlledVocabulary
    {:owl/onProperty :cmns-col/isMemberOf,
     :owl/someValuesFrom
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :rdf/type :owl/Restriction}
    :cmns-cds/CodeElement],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/",
   :rdfs/label "NIC entity type classifier - UFA",
   :skos/definition "term and code for an Uninsured Federal Agency of an FBO"})

(def NICEntityTypeClassifier-UFB
  "term and code for an Uninsured Federal Branch of an FBO"
  {:cmns-txt/hasTextValue "UFB",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-UFB,
   :rdf/type
   [:fibo-fbc-fct-usnic/NICEntityTypeClassifier
    :owl/NamedIndividual
    :cmns-cls/Classifier
    {:owl/hasValue
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :owl/onProperty :cmns-dsg/isDefinedIn,
     :rdf/type :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-fpas/FinancialServiceProvider,
     :owl/onProperty :cmns-cls/classifies,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fct-usnic/NationalInformationCenterControlledVocabulary
    {:owl/onProperty :cmns-col/isMemberOf,
     :owl/someValuesFrom
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :rdf/type :owl/Restriction}
    :cmns-cds/CodeElement],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/",
   :rdfs/label "NIC entity type classifier - UFB",
   :skos/definition "term and code for an Uninsured Federal Branch of an FBO"})

(def NICEntityTypeClassifier-USA
  "term and code for an Uninsured State Agency of an FBO"
  {:cmns-txt/hasTextValue "USA",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-USA,
   :rdf/type
   [:fibo-fbc-fct-usnic/NICEntityTypeClassifier
    :owl/NamedIndividual
    :cmns-cls/Classifier
    {:owl/hasValue
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :owl/onProperty :cmns-dsg/isDefinedIn,
     :rdf/type :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-fpas/FinancialServiceProvider,
     :owl/onProperty :cmns-cls/classifies,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fct-usnic/NationalInformationCenterControlledVocabulary
    {:owl/onProperty :cmns-col/isMemberOf,
     :owl/someValuesFrom
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :rdf/type :owl/Restriction}
    :cmns-cds/CodeElement],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/",
   :rdfs/label "NIC entity type classifier - USA",
   :skos/definition "term and code for an Uninsured State Agency of an FBO"})

(def NICEntityTypeClassifier-USB
  "term and code for an Uninsured State Branch of an FBO"
  {:cmns-txt/hasTextValue "USB",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-USB,
   :rdf/type
   [:fibo-fbc-fct-usnic/NICEntityTypeClassifier
    :owl/NamedIndividual
    :cmns-cls/Classifier
    {:owl/hasValue
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :owl/onProperty :cmns-dsg/isDefinedIn,
     :rdf/type :owl/Restriction}
    {:owl/minQualifiedCardinality 0,
     :owl/onClass    :fibo-fbc-pas-fpas/FinancialServiceProvider,
     :owl/onProperty :cmns-cls/classifies,
     :rdf/type       :owl/Restriction}
    :fibo-fbc-fct-usnic/NationalInformationCenterControlledVocabulary
    {:owl/onProperty :cmns-col/isMemberOf,
     :owl/someValuesFrom
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :rdf/type :owl/Restriction}
    :cmns-cds/CodeElement],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/",
   :rdfs/label "NIC entity type classifier - USB",
   :skos/definition "term and code for an Uninsured State Branch of an FBO"})

(def NationalInformationCenterClassificationSchemeAndCodeSet
  "set of controlled vocabularies and codes for describing content managed in the National Information Center (NIC) repository"
  {:db/ident
   :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
   :rdf/type :cmns-cls/ClassificationScheme,
   :rdfs/isDefinedBy
   ["https://www.ffiec.gov/nicpubweb/Content/DataDownload/NPW%20Data%20Dictionary.pdf"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/"],
   :rdfs/label
   "National Information Center (NIC) Classification Scheme And Code Set",
   :rdfs/subClassOf :cmns-cds/CodeSet,
   :skos/definition
   "set of controlled vocabularies and codes for describing content managed in the National Information Center (NIC) repository"})

(def NationalInformationCenterControlledVocabulary
  "controlled vocabulary that characterizes some feature or aspect of content about a financial service provider managed in the National Information Center (NIC) repository"
  {:db/ident :fibo-fbc-fct-usnic/NationalInformationCenterControlledVocabulary,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   ["https://www.ffiec.gov/nicpubweb/Content/DataDownload/NPW%20Data%20Dictionary.pdf"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/"],
   :rdfs/label "National Information Center (NIC) controlled vocabulary",
   :rdfs/subClassOf
   [{:owl/onProperty :cmns-col/isMemberOf,
     :owl/someValuesFrom
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :rdf/type :owl/Restriction}
    {:owl/hasValue
     :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
     :owl/onProperty :cmns-dsg/isDefinedIn,
     :rdf/type :owl/Restriction}
    :cmns-cds/CodeElement
    :cmns-cls/Classifier],
   :skos/definition
   "controlled vocabulary that characterizes some feature or aspect of content about a financial service provider managed in the National Information Center (NIC) repository"})