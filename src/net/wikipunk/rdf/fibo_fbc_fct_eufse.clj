(ns net.wikipunk.rdf.fibo-fbc-fct-eufse
  "This ontology extends the primary financial services entities ontology in FBC with additional kinds of entities that that provide services in Europe, across national boundaries, such as European market data providers, organizations that provide exchanges in multiple countries, organizations that support the European Union, and so forth."
  {:cmns-av/copyright ["Copyright (c) 2017-2023 Object Management Group, Inc."
                       "Copyright (c) 2017-2023 EDM Council, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EUFinancialServicesEntities/",
   :dcterms/abstract
   "This ontology extends the primary financial services entities ontology in FBC with additional kinds of entities that that provide services in Europe, across national boundaries, such as European market data providers, organizations that provide exchanges in multiple countries, organizations that support the European Union, and so forth.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Roles/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/FinancialProductsAndServices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/FinancialServicesEntities/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/EuropeanEntities/EUFinancialServicesEntities/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fbc-fct-eufse"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EUFinancialServicesEntities/",
    "fibo-fbc-fct-fse"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/",
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
   :rdfa/prefix "fibo-fbc-fct-eufse",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EUFinancialServicesEntities/",
   :rdfs/label "European Financial Services Entities Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EUFinancialServicesEntities.rdf version of this ontology was revised to adjust the name of the CreditInstitutionOrInvestmentFirm classification to eliminate the 'or' in the name to address hygiene issues."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EUFinancialServicesEntities.rdf version of this ontology was added via the FIBO 2.0 RFC."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EUFinancialServicesEntities.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."]})

(def CRDCreditInstitution
  "an undertaking whose business is to receive deposits or other repayable funds from the public and to grant credits for its own account as defined by the European Banking Authority (EBA)"
  {:db/ident :fibo-fbc-fct-eufse/CRDCreditInstitution,
   :fibo-fnd-utl-av/definitionOrigin
   "http://www.eba.europa.eu/risk-analysis-and-data/credit-institutions-register",
   :owl/disjointWith [:fibo-fbc-fct-eufse/NonEuropeanEconomicAreaBranch
                      :fibo-fbc-fct-eufse/EuropeanEconomicAreaBranch],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EUFinancialServicesEntities/",
   :rdfs/label "CRD credit institution",
   :rdfs/subClassOf :fibo-fbc-fct-eufse/CreditInstitution,
   :skos/definition
   "an undertaking whose business is to receive deposits or other repayable funds from the public and to grant credits for its own account as defined by the European Banking Authority (EBA)"})

(def CreditInstitution
  "an undertaking the business of which is to take deposits or other repayable funds from the public and to grant credits for its own account, and to which authorisation has been granted to operate within the European Union and European Economic Area countries (EEA)"
  {:cmns-av/adaptedFrom
   ["http://www.eba.europa.eu/risk-analysis-and-data/credit-institutions-register"
    "http://eur-lex.europa.eu/legal-content/EN/TXT/PDF/?uri=CELEX:32013R0575&from=EN#page=18"],
   :db/ident :fibo-fbc-fct-eufse/CreditInstitution,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EUFinancialServicesEntities/",
   :rdfs/label "credit institution",
   :rdfs/subClassOf :fibo-fbc-fct-eufse/CreditInstitutionInvestmentFirm,
   :skos/definition
   "an undertaking the business of which is to take deposits or other repayable funds from the public and to grant credits for its own account, and to which authorisation has been granted to operate within the European Union and European Economic Area countries (EEA)"})

(def CreditInstitutionInvestmentFirm
  "classification specific to European financial institutions that designates them as credit institutions / investment firms as defined by the European Banking Authority (EBA)"
  {:cmns-av/adaptedFrom
   "http://eur-lex.europa.eu/legal-content/EN/TXT/PDF/?uri=CELEX:32013R0575&from=EN#page=18",
   :db/ident :fibo-fbc-fct-eufse/CreditInstitutionInvestmentFirm,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EUFinancialServicesEntities/",
   :rdfs/label "credit institution / investment firm",
   :rdfs/subClassOf :fibo-fbc-fct-fse/FinancialInstitution,
   :skos/definition
   "classification specific to European financial institutions that designates them as credit institutions / investment firms as defined by the European Banking Authority (EBA)"})

(def EuropeanEconomicAreaBranch
  "a branch of a credit institution authorised in another European Economic Area (EEA) country that has the right to passport its activities"
  {:cmns-av/synonym "EEA branch",
   :db/ident :fibo-fbc-fct-eufse/EuropeanEconomicAreaBranch,
   :fibo-fnd-utl-av/definitionOrigin
   "http://www.eba.europa.eu/risk-analysis-and-data/credit-institutions-register",
   :owl/disjointWith :fibo-fbc-fct-eufse/NonEuropeanEconomicAreaBranch,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EUFinancialServicesEntities/",
   :rdfs/label "European Economic Area branch",
   :rdfs/subClassOf :fibo-fbc-fct-eufse/CreditInstitution,
   :skos/definition
   "a branch of a credit institution authorised in another European Economic Area (EEA) country that has the right to passport its activities"})

(def InvestmentFirm
  "any legal person whose regular occupation or business is the provision of one or more investment services to third parties and/or the performance of one or more investment activities on a professional basis"
  {:cmns-av/adaptedFrom
   "http://eur-lex.europa.eu/legal-content/EN/TXT/PDF/?uri=CELEX:32004L0039&from=en#page=9",
   :db/ident :fibo-fbc-fct-eufse/InvestmentFirm,
   :owl/disjointWith [:fibo-fbc-fct-eufse/LocalFirm
                      :fibo-fbc-fct-eufse/CreditInstitution],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EUFinancialServicesEntities/",
   :rdfs/label "investment firm",
   :rdfs/subClassOf [{:owl/unionOf [:fibo-fbc-fct-fse/BrokerageFirm
                                    :fibo-fbc-fct-fse/InvestmentCompany
                                    {:owl/onProperty :fibo-fnd-rel-rel/provides,
                                     :owl/someValuesFrom
                                     :fibo-fbc-fct-fse/InvestmentService,
                                     :rdf/type :owl/Restriction}],
                      :rdf/type    :owl/Class}
                     :fibo-fbc-fct-eufse/CreditInstitutionInvestmentFirm],
   :skos/definition
   "any legal person whose regular occupation or business is the provision of one or more investment services to third parties and/or the performance of one or more investment activities on a professional basis"})

(def LocalFirm
  "a firm dealing for its own account on markets in financial futures or options or other derivatives and on cash markets for the sole purpose of hedging positions on derivatives markets, or dealing for the accounts of other members of those markets and being guaranteed by clearing members of the same markets, where responsibility for ensuring the performance of contracts entered into by such a firm is assumed by clearing members of the same markets"
  {:cmns-av/adaptedFrom
   "http://eur-lex.europa.eu/legal-content/EN/TXT/PDF/?uri=CELEX:32013R0575&from=EN#page=18",
   :db/ident :fibo-fbc-fct-eufse/LocalFirm,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EUFinancialServicesEntities/",
   :rdfs/label "local firm",
   :rdfs/subClassOf [:fibo-fbc-fct-fse/BrokerageFirm
                     :fibo-fbc-fct-eufse/CreditInstitutionInvestmentFirm],
   :skos/definition
   "a firm dealing for its own account on markets in financial futures or options or other derivatives and on cash markets for the sole purpose of hedging positions on derivatives markets, or dealing for the accounts of other members of those markets and being guaranteed by clearing members of the same markets, where responsibility for ensuring the performance of contracts entered into by such a firm is assumed by clearing members of the same markets"})

(def NonEuropeanEconomicAreaBranch
  "a branch of a credit institution whose Head Office is in a third country"
  {:cmns-av/synonym "non-EEA branch",
   :db/ident :fibo-fbc-fct-eufse/NonEuropeanEconomicAreaBranch,
   :fibo-fnd-utl-av/definitionOrigin
   "http://www.eba.europa.eu/risk-analysis-and-data/credit-institutions-register",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EUFinancialServicesEntities/",
   :rdfs/label "non European Economic Area branch",
   :rdfs/subClassOf :fibo-fbc-fct-eufse/CreditInstitution,
   :skos/definition
   "a branch of a credit institution whose Head Office is in a third country"})

(def PaymentInstitution
  "a legal person that has been granted authorisation in accordance with Article 10 to provide and execute payment services throughout the European community"
  {:cmns-av/adaptedFrom
   "http://eur-lex.europa.eu/legal-content/EN/TXT/PDF/?uri=CELEX:32007L0064&from=EN#page=18",
   :db/ident :fibo-fbc-fct-eufse/PaymentInstitution,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/EuropeanEntities/EUFinancialServicesEntities/",
   :rdfs/label "payment institution",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/provides,
                      :owl/someValuesFrom :fibo-fbc-fct-fse/PaymentService,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-fct-eufse/CreditInstitutionInvestmentFirm],
   :skos/definition
   "a legal person that has been granted authorisation in accordance with Article 10 to provide and execute payment services throughout the European community"})