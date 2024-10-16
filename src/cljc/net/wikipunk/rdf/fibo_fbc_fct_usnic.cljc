(ns net.wikipunk.rdf.fibo-fbc-fct-usnic
  {:cmns-av/copyright "Copyright (c) 2023 EDM Council, Inc.",
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/",
   :dcterms/abstract
   "This ontology extends the US regulatory agencies ontology with a number of controlled vocabularies required for mapping FIBO to the National Information Center (NIC) Data Dictionary.",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/source
   #{{:xsd/anyURI "https://www.ffiec.gov/NPW"}
     {:xsd/anyURI
      "https://www.ffiec.gov/nicpubweb/Content/DataDownload/NPW%20Data%20Dictionary.pdf"}},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :namespaces
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
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/FinancialServicesEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/ProductsAndServices/FinancialProductsAndServices/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/CodesAndCodeSets/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/TextDatatype/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fbc-fct-usnic",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/",
   :rdfs/label
   "US National Information Center (NIC) Controlled Vocabularies Ontology",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/"})

(def NICEntityTypeClassifier
  {:db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/"}
     {:xsd/anyURI
      "https://www.ffiec.gov/nicpubweb/Content/DataDownload/NPW%20Data%20Dictionary.pdf"}},
   :rdfs/label "National Information Center (NIC) entity type classifier",
   :rdfs/subClassOf
   #{{:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-fbc-pas-fpas/FinancialServiceProvider,
      :owl/onProperty :cmns-cls/classifies,
      :rdf/type       :owl/Restriction}
     :fibo-fbc-fct-usnic/NationalInformationCenterControlledVocabulary},
   :skos/definition
   "controlled vocabulary and codes for describing the nature of the functional entities managed by the National Information Center (NIC) repository"})

(def NICEntityTypeClassifier-AGB
  {:cmns-txt/hasTextValue "AGB",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-AGB,
   :rdf/type #{:fibo-fbc-fct-usnic/NICEntityTypeClassifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/"},
   :rdfs/label "NIC entity type classifier - AGB",
   :skos/definition "term and code for an Agreement Corporation - Banking"})

(def NICEntityTypeClassifier-AGI
  {:cmns-txt/hasTextValue "AGI",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-AGI,
   :rdf/type #{:fibo-fbc-fct-usnic/NICEntityTypeClassifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/"},
   :rdfs/label "NIC entity type classifier - AGI",
   :skos/definition "term and code for an Agreement Corporation - Investment"})

(def NICEntityTypeClassifier-BHC
  {:cmns-txt/hasTextValue "BCH",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-BHC,
   :rdf/type #{:fibo-fbc-fct-usnic/NICEntityTypeClassifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/"},
   :rdfs/label "NIC entity type classifier - BHC",
   :skos/definition "term and code for a Bank Holding Company"})

(def NICEntityTypeClassifier-CPB
  {:cmns-txt/hasTextValue "CPB",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-CPB,
   :rdf/type #{:fibo-fbc-fct-usnic/NICEntityTypeClassifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/"},
   :rdfs/label "NIC entity type classifier - CPB",
   :skos/definition "term and code for a Cooperative Bank"})

(def NICEntityTypeClassifier-DBR
  {:cmns-txt/hasTextValue "DBR",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-DBR,
   :rdf/type #{:fibo-fbc-fct-usnic/NICEntityTypeClassifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/"},
   :rdfs/label "NIC entity type classifier - DBR",
   :skos/definition "term and code for a Domestic Branch of a Domestic Bank"})

(def NICEntityTypeClassifier-DEO
  {:cmns-txt/hasTextValue "DEO",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-DEO,
   :rdf/type #{:fibo-fbc-fct-usnic/NICEntityTypeClassifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/"},
   :rdfs/label "NIC entity type classifier - DEO",
   :skos/definition "term and code for a Domestic Entity Other"})

(def NICEntityTypeClassifier-DPS
  {:cmns-txt/hasTextValue "DPS",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-DPS,
   :rdf/type #{:fibo-fbc-fct-usnic/NICEntityTypeClassifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/"},
   :rdfs/label "NIC entity type classifier - DPS",
   :skos/definition "term and code for a Data Processing Servicer"})

(def NICEntityTypeClassifier-EBR
  {:cmns-txt/hasTextValue "EBR",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-EBR,
   :rdf/type #{:fibo-fbc-fct-usnic/NICEntityTypeClassifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/"},
   :rdfs/label "NIC entity type classifier - EBR",
   :skos/definition "term and code for an Edge Corporation - Domestic Branch"})

(def NICEntityTypeClassifier-EDB
  {:cmns-txt/hasTextValue "EDB",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-EDB,
   :rdf/type #{:fibo-fbc-fct-usnic/NICEntityTypeClassifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/"},
   :rdfs/label "NIC entity type classifier - EDB",
   :skos/definition "term and code for an Edge Corporation - Banking"})

(def NICEntityTypeClassifier-EDI
  {:cmns-txt/hasTextValue "EDI",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-EDI,
   :rdf/type #{:fibo-fbc-fct-usnic/NICEntityTypeClassifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/"},
   :rdfs/label "NIC entity type classifier - EDI",
   :skos/definition "term and code for an Edge Corporation - Investment"})

(def NICEntityTypeClassifier-FBH
  {:cmns-txt/hasTextValue "FBH",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-FBH,
   :rdf/type #{:fibo-fbc-fct-usnic/NICEntityTypeClassifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/"},
   :rdfs/label "NIC entity type classifier - FBH",
   :skos/definition
   "term and code for a Foreign Banking Organization as a Bank Holding Company"})

(def NICEntityTypeClassifier-FBK
  {:cmns-txt/hasTextValue "FBK",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-FBK,
   :rdf/type #{:fibo-fbc-fct-usnic/NICEntityTypeClassifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/"},
   :rdfs/label "NIC entity type classifier - FBK",
   :skos/definition "term and code for a Foreign Bank"})

(def NICEntityTypeClassifier-FBO
  {:cmns-txt/hasTextValue "FBO",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-FBO,
   :rdf/type #{:fibo-fbc-fct-usnic/NICEntityTypeClassifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/"},
   :rdfs/label "NIC entity type classifier - FBO",
   :skos/definition "term and code for a Foreign Banking Organization"})

(def NICEntityTypeClassifier-FCU
  {:cmns-txt/hasTextValue "FCU",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-FCU,
   :rdf/type #{:fibo-fbc-fct-usnic/NICEntityTypeClassifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/"},
   :rdfs/label "NIC entity type classifier - FCU",
   :skos/definition "term and code for a Federal Credit Union"})

(def NICEntityTypeClassifier-FEO
  {:cmns-txt/hasTextValue "FEO",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-FEO,
   :rdf/type #{:fibo-fbc-fct-usnic/NICEntityTypeClassifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/"},
   :rdfs/label "NIC entity type classifier - FEO",
   :skos/definition "term and code for a Foreign Entity Other"})

(def NICEntityTypeClassifier-FHD
  {:cmns-txt/hasTextValue "FHD",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-FHD,
   :rdf/type #{:fibo-fbc-fct-usnic/NICEntityTypeClassifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/"},
   :rdfs/label "NIC entity type classifier - FHD",
   :skos/definition
   "term and code for a Financial Holding Company / Bank Holding Company"})

(def NICEntityTypeClassifier-FHF
  {:cmns-txt/hasTextValue "FHF",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-FHF,
   :rdf/type #{:fibo-fbc-fct-usnic/NICEntityTypeClassifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/"},
   :rdfs/label "NIC entity type classifier - FHF",
   :skos/definition
   "term and code for a Financial Holding Company / Foreign Banking Organization"})

(def NICEntityTypeClassifier-FNC
  {:cmns-txt/hasTextValue "FNC",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-FNC,
   :rdf/type #{:fibo-fbc-fct-usnic/NICEntityTypeClassifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/"},
   :rdfs/label "NIC entity type classifier - FNC",
   :skos/definition "term and code for a Finance Company"})

(def NICEntityTypeClassifier-FSB
  {:cmns-txt/hasTextValue "FSB",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-FSB,
   :rdf/type #{:fibo-fbc-fct-usnic/NICEntityTypeClassifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/"},
   :rdfs/label "NIC entity type classifier - FSB",
   :skos/definition "term and code for a Federal Savings Bank"})

(def NICEntityTypeClassifier-IBK
  {:cmns-txt/hasTextValue "IBK",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-IBK,
   :rdf/type #{:fibo-fbc-fct-usnic/NICEntityTypeClassifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/"},
   :rdfs/label "NIC entity type classifier - IBK",
   :skos/definition
   "term and code for a International Bank of a U.S. Depository - Edge or Trust Co."})

(def NICEntityTypeClassifier-IBR
  {:cmns-txt/hasTextValue "IBR",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-IBR,
   :rdf/type #{:fibo-fbc-fct-usnic/NICEntityTypeClassifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/"},
   :rdfs/label "NIC entity type classifier - IBR",
   :skos/definition "term and code for a Foreign Branch of a U.S. Bank"})

(def NICEntityTypeClassifier-IFB
  {:cmns-txt/hasTextValue "IFB",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-IFB,
   :rdf/type #{:fibo-fbc-fct-usnic/NICEntityTypeClassifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/"},
   :rdfs/label "NIC entity type classifier - IFB",
   :skos/definition "term and code for an Insured Federal Branch of an FBO"})

(def NICEntityTypeClassifier-IHC
  {:cmns-txt/hasTextValue "IHC",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-IHC,
   :rdf/type #{:fibo-fbc-fct-usnic/NICEntityTypeClassifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/"},
   :rdfs/label "NIC entity type classifier - IHC",
   :skos/definition "term and code for an Intermediate Holding Company"})

(def NICEntityTypeClassifier-INB
  {:cmns-txt/hasTextValue "INB",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-INB,
   :rdf/type #{:fibo-fbc-fct-usnic/NICEntityTypeClassifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/"},
   :rdfs/label "NIC entity type classifier - INB",
   :skos/definition
   "term and code for an International Non-bank Subs of Domestic Entities"})

(def NICEntityTypeClassifier-ISB
  {:cmns-txt/hasTextValue "ISB",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-ISB,
   :rdf/type #{:fibo-fbc-fct-usnic/NICEntityTypeClassifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/"},
   :rdfs/label "NIC entity type classifier - ISB",
   :skos/definition "term and code for an Insured State Branch of an FBO"})

(def NICEntityTypeClassifier-MTC
  {:cmns-txt/hasTextValue "MTC",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-MTC,
   :rdf/type #{:fibo-fbc-fct-usnic/NICEntityTypeClassifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/"},
   :rdfs/label "NIC entity type classifier - MTC",
   :skos/definition "term and code for a Non-deposit Trust Company - Member"})

(def NICEntityTypeClassifier-NAT
  {:cmns-txt/hasTextValue "NAT",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-NAT,
   :rdf/type #{:fibo-fbc-fct-usnic/NICEntityTypeClassifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/"},
   :rdfs/label "NIC entity type classifier - NAT",
   :skos/definition "term and code for a National Bank"})

(def NICEntityTypeClassifier-NMB
  {:cmns-txt/hasTextValue "NMB",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-NMB,
   :rdf/type #{:fibo-fbc-fct-usnic/NICEntityTypeClassifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/"},
   :rdfs/label "NIC entity type classifier - NMB",
   :skos/definition "term and code for a Non-member Bank"})

(def NICEntityTypeClassifier-NTC
  {:cmns-txt/hasTextValue "NTC",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-NTC,
   :rdf/type #{:fibo-fbc-fct-usnic/NICEntityTypeClassifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/"},
   :rdfs/label "NIC entity type classifier - NTC",
   :skos/definition
   "term and code for a Non-deposit Trust Company - Non-member"})

(def NICEntityTypeClassifier-NYI
  {:cmns-txt/hasTextValue "NYI",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-NYI,
   :rdf/type #{:fibo-fbc-fct-usnic/NICEntityTypeClassifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/"},
   :rdfs/label "NIC entity type classifier - NYI",
   :skos/definition "term and code for a New York Investment Company"})

(def NICEntityTypeClassifier-PST
  {:cmns-txt/hasTextValue "PST",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-PST,
   :rdf/type #{:fibo-fbc-fct-usnic/NICEntityTypeClassifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/"},
   :rdfs/label "NIC entity type classifier - PST",
   :skos/definition
   "term and code for a Non-U.S. Branch managed by a U.S. Branch/Agency of a Foreign Bank for 002's reporting - Pseudo Twig"})

(def NICEntityTypeClassifier-REP
  {:cmns-txt/hasTextValue "REP",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-REP,
   :rdf/type #{:fibo-fbc-fct-usnic/NICEntityTypeClassifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/"},
   :rdfs/label "NIC entity type classifier - REP",
   :skos/definition "term and code for a Representative Office"})

(def NICEntityTypeClassifier-SAL
  {:cmns-txt/hasTextValue "SAL",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-SAL,
   :rdf/type #{:fibo-fbc-fct-usnic/NICEntityTypeClassifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/"},
   :rdfs/label "NIC entity type classifier - SAL",
   :skos/definition "term and code for a Savings & Loan Association"})

(def NICEntityTypeClassifier-SBD
  {:cmns-txt/hasTextValue "SBD",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-SBD,
   :rdf/type #{:fibo-fbc-fct-usnic/NICEntityTypeClassifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/"},
   :rdfs/label "NIC entity type classifier - SBD",
   :skos/definition "term and code for a Securities Broker / Dealer"})

(def NICEntityTypeClassifier-SCU
  {:cmns-txt/hasTextValue "SCU",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-SCU,
   :rdf/type #{:fibo-fbc-fct-usnic/NICEntityTypeClassifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/"},
   :rdfs/label "NIC entity type classifier - SCU",
   :skos/definition "term and code for a State Credit Union"})

(def NICEntityTypeClassifier-SLHC
  {:cmns-txt/hasTextValue "SLHC",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-SLHC,
   :rdf/type #{:fibo-fbc-fct-usnic/NICEntityTypeClassifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/"},
   :rdfs/label "NIC entity type classifier - SLHC",
   :skos/definition "term and code for a Savings and Loan Holding Company"})

(def NICEntityTypeClassifier-SMB
  {:cmns-txt/hasTextValue "SMB",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-SMB,
   :rdf/type #{:fibo-fbc-fct-usnic/NICEntityTypeClassifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/"},
   :rdfs/label "NIC entity type classifier - SMB",
   :skos/definition "term and code for a State Member Bank"})

(def NICEntityTypeClassifier-SSB
  {:cmns-txt/hasTextValue "SSB",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-SSB,
   :rdf/type #{:fibo-fbc-fct-usnic/NICEntityTypeClassifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/"},
   :rdfs/label "NIC entity type classifier - SSB",
   :skos/definition "term and code for a State Savings Bank"})

(def NICEntityTypeClassifier-TWG
  {:cmns-txt/hasTextValue "TWG",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-TWG,
   :rdf/type #{:fibo-fbc-fct-usnic/NICEntityTypeClassifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/"},
   :rdfs/label "NIC entity type classifier - TWG",
   :skos/definition
   "term and code for a Non-U.S. Branch managed by a U.S. Branch/Agency of a Foreign Bank - TWIG"})

(def NICEntityTypeClassifier-UFA
  {:cmns-txt/hasTextValue "UFA",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-UFA,
   :rdf/type #{:fibo-fbc-fct-usnic/NICEntityTypeClassifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/"},
   :rdfs/label "NIC entity type classifier - UFA",
   :skos/definition "term and code for an Uninsured Federal Agency of an FBO"})

(def NICEntityTypeClassifier-UFB
  {:cmns-txt/hasTextValue "UFB",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-UFB,
   :rdf/type #{:fibo-fbc-fct-usnic/NICEntityTypeClassifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/"},
   :rdfs/label "NIC entity type classifier - UFB",
   :skos/definition "term and code for an Uninsured Federal Branch of an FBO"})

(def NICEntityTypeClassifier-USA
  {:cmns-txt/hasTextValue "USA",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-USA,
   :rdf/type #{:fibo-fbc-fct-usnic/NICEntityTypeClassifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/"},
   :rdfs/label "NIC entity type classifier - USA",
   :skos/definition "term and code for an Uninsured State Agency of an FBO"})

(def NICEntityTypeClassifier-USB
  {:cmns-txt/hasTextValue "USB",
   :db/ident :fibo-fbc-fct-usnic/NICEntityTypeClassifier-USB,
   :rdf/type #{:fibo-fbc-fct-usnic/NICEntityTypeClassifier
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/"},
   :rdfs/label "NIC entity type classifier - USB",
   :skos/definition "term and code for an Uninsured State Branch of an FBO"})

(def NationalInformationCenterClassificationSchemeAndCodeSet
  {:db/ident
   :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
   :rdf/type #{:cmns-cds/CodeSet :owl/NamedIndividual
               :cmns-cls/ClassificationScheme},
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/"}
     {:xsd/anyURI
      "https://www.ffiec.gov/nicpubweb/Content/DataDownload/NPW%20Data%20Dictionary.pdf"}},
   :rdfs/label
   "National Information Center (NIC) Classification Scheme And Code Set",
   :skos/definition
   "set of controlled vocabularies and codes for describing content managed in the National Information Center (NIC) repository"})

(def NationalInformationCenterControlledVocabulary
  {:db/ident :fibo-fbc-fct-usnic/NationalInformationCenterControlledVocabulary,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/"}
     {:xsd/anyURI
      "https://www.ffiec.gov/nicpubweb/Content/DataDownload/NPW%20Data%20Dictionary.pdf"}},
   :rdfs/label "National Information Center (NIC) controlled vocabulary",
   :rdfs/subClassOf
   #{{:owl/hasValue
      :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
      :owl/onProperty :cmns-col/isMemberOf,
      :rdf/type :owl/Restriction}
     {:owl/hasValue
      :fibo-fbc-fct-usnic/NationalInformationCenterClassificationSchemeAndCodeSet,
      :owl/onProperty :cmns-dsg/isDefinedIn,
      :rdf/type :owl/Restriction} :cmns-cds/CodeElement :cmns-cls/Classifier},
   :skos/definition
   "controlled vocabulary that characterizes some feature or aspect of content about a financial service provider managed in the National Information Center (NIC) repository"})

(def urn:uuid:738d1daa-2032-5ae3-9d5e-92e195013f2b
  {:cmns-av/copyright "Copyright (c) 2023 EDM Council, Inc.",
   :dcterms/abstract
   "This ontology extends the US regulatory agencies ontology with a number of controlled vocabularies required for mapping FIBO to the National Information Center (NIC) Data Dictionary.",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/source
   #{{:xsd/anyURI "https://www.ffiec.gov/NPW"}
     {:xsd/anyURI
      "https://www.ffiec.gov/nicpubweb/Content/DataDownload/NPW%20Data%20Dictionary.pdf"}},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/FinancialServicesEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/ProductsAndServices/FinancialProductsAndServices/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/CodesAndCodeSets/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/NorthAmericanEntities/USRegulatoryAgencies/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/TextDatatype/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/"},
   :rdf/type :owl/Ontology,
   :rdfs/label
   "US National Information Center (NIC) Controlled Vocabularies Ontology",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USNationalInformationCenterControlledVocabularies/"})