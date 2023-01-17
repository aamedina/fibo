(ns net.wikipunk.rdf.fibo-fbc-fct-usfse
  "This ontology extends the primary financial services entities ontology in FBC with additional kinds of entities that are specific to the United States."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :dcterms/abstract
   "This ontology extends the primary financial services entities ontology in FBC with additional kinds of entities that are specific to the United States.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/FinancialProductsAndServices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/FinancialServicesEntities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/CorporateBodies/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-be-le-cb"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/CorporateBodies/",
    "fibo-fbc-fct-fse"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/",
    "fibo-fbc-fct-usfse"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
    "fibo-fbc-pas-fpas"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfa/prefix "fibo-fbc-fct-usfse",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "US Financial Services Entities Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities.rdf version of this ontology was modified to eliminate deprecated elements."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities.rdf version of this ontology was modified to eliminate dead links and address text formatting issues identified through hygiene testing."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities.rdf version of this ontology was modified to generalize the definition of credit union."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities.rdf version of this ontology was modified per the issue resolutions identified in the FIBO FBC 1.0 FTF report."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities.rdf version of this ontology was modified to eliminate circular definitions and revise names such that concepts don't appear to refer to multiple things."],
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright ["Copyright (c) 2015-2022 EDM Council, Inc."
                  "Copyright (c) 2015-2022 Object Management Group, Inc."],
   :sm/dependsOn
   ["https://spec.edmcouncil.org/fibo/ontology/BE/"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/"],
   :sm/fileAbbreviation "fibo-fbc-fct-usfse",
   :sm/filename "USFinancialServicesEntities.rdf"})

(def AgreementCorporation
  "corporation chartered by a state to engage in international banking, so named because the corporation enters into an 'agreement' with the Fed's Board of Governors that it will limit its activities to those permitted"
  {:db/ident :fibo-fbc-fct-usfse/AgreementCorporation,
   :fibo-fnd-utl-av/adaptedFrom
   "http://www.ffiec.gov/nicpubweb/Content/HELP/Institution%20Type%20Description.htm",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "agreement corporation",
   :rdfs/subClassOf [{:owl/onClass    :fibo-be-le-cb/Corporation,
                      :owl/onProperty :fibo-fnd-rel-rel/hasIdentity,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-pas-fpas/FinancialServiceProvider],
   :skos/definition
   "corporation chartered by a state to engage in international banking, so named because the corporation enters into an 'agreement' with the Fed's Board of Governors that it will limit its activities to those permitted"})

(def CooperativeBank
  "state-chartered savings association located in Massachusetts, New Hampshire, Rhode Island or Vermont"
  {:db/ident :fibo-fbc-fct-usfse/CooperativeBank,
   :fibo-fnd-utl-av/adaptedFrom
   "http://www.ffiec.gov/nicpubweb/Content/HELP/Institution%20Type%20Description.htm",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "cooperative bank",
   :rdfs/subClassOf :fibo-fbc-fct-usfse/ThriftInstitution,
   :skos/definition
   "state-chartered savings association located in Massachusetts, New Hampshire, Rhode Island or Vermont"})

(def EdgeCorporation
  "corporation chartered by the Federal Reserve to engage in international banking and financial operations"
  {:db/ident :fibo-fbc-fct-usfse/EdgeCorporation,
   :fibo-fnd-utl-av/adaptedFrom
   "http://www.ffiec.gov/nicpubweb/Content/HELP/Institution%20Type%20Description.htm",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "edge corporation",
   :rdfs/subClassOf [{:owl/onClass    :fibo-be-le-cb/Corporation,
                      :owl/onProperty :fibo-fnd-rel-rel/hasIdentity,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-pas-fpas/FinancialServiceProvider],
   :skos/definition
   "corporation chartered by the Federal Reserve to engage in international banking and financial operations"})

(def FarmCreditSystemInstitution
  "federally-chartered financial institution that is supervised, examined, and regulated by the Farm Credit Administration and operates in accordance with the Farm Credit Act of 1971, as amended, 12 U.S.C. 2001 et seq. All Farm Credit System institutions are federally-chartered instrumentalities of the United States."
  {:db/ident :fibo-fbc-fct-usfse/FarmCreditSystemInstitution,
   :fibo-fnd-utl-av/adaptedFrom
   "http://www.ffiec.gov/nicpubweb/Content/HELP/Institution%20Type%20Description.htm",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "farm credit system institution",
   :rdfs/subClassOf :fibo-fbc-fct-fse/FinancialInstitution,
   :skos/definition
   "federally-chartered financial institution that is supervised, examined, and regulated by the Farm Credit Administration and operates in accordance with the Farm Credit Act of 1971, as amended, 12 U.S.C. 2001 et seq. All Farm Credit System institutions are federally-chartered instrumentalities of the United States."})

(def FinancialHoldingCompany
  "financial entity engaged in a broad range of banking-related activities, created by the Gramm-Leach-Bliley Act of 1999"
  {:db/ident :fibo-fbc-fct-usfse/FinancialHoldingCompany,
   :fibo-fnd-utl-av/adaptedFrom
   "http://www.ffiec.gov/nicpubweb/Content/HELP/Institution%20Type%20Description.htm",
   :fibo-fnd-utl-av/explanatoryNote
   "These activities include: insurance underwriting, securities dealing and underwriting, financial and investment advisory services, merchant banking, issuing or selling securitized interests in bank-eligible assets, and generally engaging in any non-banking activity authorized by the Bank Holding Company Act. The Federal Reserve Board is responsible for supervising the financial condition and activities of financial holding companies. Similarly, any non-bank commercial company that is predominantly engaged in financial activities, earning 85 percent or more of its gross revenues from financial services, may choose to become a financial holding company. These companies are required to sell any non-financial (commercial) businesses within ten years.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "financial holding company",
   :rdfs/subClassOf :fibo-fbc-fct-usfse/USBankHoldingCompany,
   :skos/definition
   "financial entity engaged in a broad range of banking-related activities, created by the Gramm-Leach-Bliley Act of 1999"})

(def IndustrialBank
  "limited service financial institution that raises funds by selling certificates called 'investment shares' and by accepting deposits"
  {:db/ident :fibo-fbc-fct-usfse/IndustrialBank,
   :fibo-fnd-utl-av/explanatoryNote
   "Often called Morris Plan banks or industrial loan companies, industrial banks are distinguished from commercial loan companies because industrial banks accept deposits in addition to making consumer loans. Industrial banks differ from commercial banks because they do not offer demand deposit (checking) accounts. Industrial banks are not regulated by the Federal Reserve.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "industrial bank",
   :rdfs/subClassOf :fibo-fbc-fct-fse/Bank,
   :skos/definition
   "limited service financial institution that raises funds by selling certificates called 'investment shares' and by accepting deposits"})

(def MutualSavingsBank
  "financial institution that accepts deposits primarily from individuals and places a large portion of its funds into mortgage loans"
  {:db/ident :fibo-fbc-fct-usfse/MutualSavingsBank,
   :fibo-fnd-utl-av/adaptedFrom
   "http://www.ffiec.gov/nicpubweb/Content/HELP/Institution%20Type%20Description.htm",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "mutual savings bank",
   :rdfs/subClassOf :fibo-fbc-fct-usfse/SavingsBank,
   :skos/definition
   "financial institution that accepts deposits primarily from individuals and places a large portion of its funds into mortgage loans"})

(def NationalBank
  "commercial bank whose charter is approved by the Office of the Comptroller of the Currency (OCC) rather than by a state banking department"
  {:db/ident :fibo-fbc-fct-usfse/NationalBank,
   :fibo-fnd-utl-av/adaptedFrom
   "http://www.ffiec.gov/nicpubweb/Content/HELP/Institution%20Type%20Description.htm",
   :fibo-fnd-utl-av/explanatoryNote
   "National Banks are required to be members of the Federal Reserve System and belong to the Federal Deposit Insurance Corporation.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "national bank",
   :rdfs/subClassOf [:fibo-fbc-fct-usfse/USBank
                     :fibo-fbc-fct-fse/CommercialBank],
   :skos/definition
   "commercial bank whose charter is approved by the Office of the Comptroller of the Currency (OCC) rather than by a state banking department"})

(def NonDepositoryTrustCompany
  "trust company that accepts and executes trusts, but does not issue currency; non-depository trust companies can either be Federal Reserve Members or Federal Reserve Non-members"
  {:db/ident :fibo-fbc-fct-usfse/NonDepositoryTrustCompany,
   :fibo-fnd-utl-av/adaptedFrom
   "http://www.ffiec.gov/nicpubweb/Content/HELP/Institution%20Type%20Description.htm",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "non-depository trust company",
   :rdfs/subClassOf :fibo-fbc-fct-fse/NonDepositoryInstitution,
   :skos/definition
   "trust company that accepts and executes trusts, but does not issue currency; non-depository trust companies can either be Federal Reserve Members or Federal Reserve Non-members"})

(def SavingsBank
  "banking institution organized to encourage thrift by paying interest dividends on savings; savings banks can have state and federal affiliations, for example, State Savings Banks and Federal Savings Banks"
  {:db/ident :fibo-fbc-fct-usfse/SavingsBank,
   :fibo-fnd-utl-av/adaptedFrom
   "http://www.ffiec.gov/nicpubweb/Content/HELP/Institution%20Type%20Description.htm",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "savings bank",
   :rdfs/subClassOf :fibo-fbc-fct-usfse/ThriftInstitution,
   :skos/definition
   "banking institution organized to encourage thrift by paying interest dividends on savings; savings banks can have state and federal affiliations, for example, State Savings Banks and Federal Savings Banks"})

(def SavingsLoanAssociation
  "financial institution that accepts deposits primarily from individuals and channels its funds primarily into residential mortgage loans"
  {:db/ident :fibo-fbc-fct-usfse/SavingsLoanAssociation,
   :fibo-fnd-utl-av/adaptedFrom
   "http://www.ffiec.gov/nicpubweb/Content/HELP/Institution%20Type%20Description.htm",
   :fibo-fnd-utl-av/synonym "savings and loan association",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "savings loan association",
   :rdfs/subClassOf :fibo-fbc-fct-usfse/ThriftInstitution,
   :skos/definition
   "financial institution that accepts deposits primarily from individuals and channels its funds primarily into residential mortgage loans"})

(def SavingsLoanHoldingCompany
  "company that directly or indirectly controls a savings association or related holding company, and explicitly excludes any company that is also a bank holding company"
  {:db/ident :fibo-fbc-fct-usfse/SavingsLoanHoldingCompany,
   :fibo-fnd-utl-av/adaptedFrom
   "http://www.ffiec.gov/nicpubweb/Content/HELP/Institution%20Type%20Description.htm",
   :fibo-fnd-utl-av/synonym "savings and loan holding company",
   :owl/disjointWith :fibo-fbc-fct-fse/BankHoldingCompany,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "savings loan holding company",
   :rdfs/subClassOf :fibo-fbc-pas-fpas/FinancialServiceProvider,
   :skos/definition
   "company that directly or indirectly controls a savings association or related holding company, and explicitly excludes any company that is also a bank holding company"})

(def StateCharteredBank
  "commercial bank whose charter is approved by a state banking regulator"
  {:db/ident :fibo-fbc-fct-usfse/StateCharteredBank,
   :fibo-fnd-utl-av/adaptedFrom
   "http://www.ffiec.gov/nicpubweb/Content/HELP/Institution%20Type%20Description.htm",
   :fibo-fnd-utl-av/explanatoryNote
   ["State-chartered banks may or may not be members of the Federal Reserve System, but typically belong to the Federal Deposit Insurance Corporation, who may be their primary federal regulator for those that are not FRS members."
    "A state bank is defined as any bank, banking association, trust company, savings bank, industrial bank (or similar depository institution operating substantially in the same manner as an industrial bank), or other banking institution which is engaged in the business of receiving deposits other than trust funds, and in the US, is incorporated under the laws of any State or which is operating under the Code of Law for the District of Columbia, including any cooperative bank or other unincorporated bank the deposits of which were insured by the Federal Deposit Insurance Corporation on the day before the date of the enactment of the Financial Institutions Reform, Recovery, and Enforcement Act of 1989."],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "state-chartered bank",
   :rdfs/subClassOf [:fibo-fbc-fct-usfse/USBank
                     :fibo-fbc-fct-fse/CommercialBank],
   :skos/definition
   "commercial bank whose charter is approved by a state banking regulator"})

(def ThriftInstitution
  "savings association that primarily accepts savings account deposits and invests most of the proceeds in mortgages"
  {:db/ident :fibo-fbc-fct-usfse/ThriftInstitution,
   :fibo-fnd-utl-av/adaptedFrom
   "http://www.ffiec.gov/nicpubweb/Content/HELP/Institution%20Type%20Description.htm",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "thrift institution",
   :rdfs/subClassOf :fibo-fbc-fct-fse/SavingsAssociation,
   :skos/definition
   "savings association that primarily accepts savings account deposits and invests most of the proceeds in mortgages",
   :skos/example
   "Savings banks and savings and loan associations and credit unions are examples of thrift institutions."})

(def USBank
  "a bank that is licensed to conduct business in the United States"
  {:db/ident :fibo-fbc-fct-usfse/USBank,
   :fibo-fnd-utl-av/adaptedFrom
   "As defined in the Federal Deposit Insurance Act, https://www.fdic.gov/regulations/laws/rules/1000-400.html#fdic1000sec.3a",
   :fibo-fnd-utl-av/explanatoryNote
   ["The Bank Holding Company Act of 1956 defines a bank as any depository financial intermediary that accepts checking accounts (checks) or makes commercial loans, and its deposits are insured by a federal deposit insurance agency. A bank acts as a middleman between suppliers of funds and users of funds, substituting its own credit judgement for that of the ultimate suppliers of funds, collecting those funds from three sources: checking accounts, savings and time deposits; short-term borrowings from other banks; and equity capital. A bank earns money by reinvesting these funds in longer-term assets."
    "A bank, as specified in the Investment Company Act of 1940, is a financial intermediary that is (a) a depository institution (as defined in section 3 of the Federal Deposit Insurance Act) or a branch or agency of a foreign bank (as such terms are defined in section 1(b) of the International Banking Act of 1978), (b) a member bank of the Federal Reserve System, (c) any other banking institution or trust company, whether incorporated or not, doing business under the laws of any State or of the United States, a substantial portion of the business of which consists of receiving deposits or exercising fiduciary powers similar to those permitted to national banks under the authority of the Comptroller of the Currency, and which is supervised and examined by State or Federal authority having supervision over banks, and which is not operated for the purpose of evading the provisions of this title, and (d) a receiver, conservator, or other liquidating agent of any institution or firm included in clause (a), (b), or (c) of this paragraph."],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "U.S. bank",
   :rdfs/seeAlso ["https://www.sec.gov/about/laws/ica40.pdf"],
   :rdfs/subClassOf :fibo-fbc-fct-fse/Bank,
   :skos/definition
   "a bank that is licensed to conduct business in the United States"})

(def USBankHoldingCompany
  "a bank holding company that is licensed to conduct business in the United States and is regulated and supervised by the Federal Reserve in accordance with the Bank Holding Company Act of 1956"
  {:db/ident :fibo-fbc-fct-usfse/USBankHoldingCompany,
   :fibo-fnd-utl-av/adaptedFrom
   "http://www.ffiec.gov/nicpubweb/Content/HELP/Institution%20Type%20Description.htm",
   :fibo-fnd-utl-av/explanatoryNote
   "According to the FFIEC, a bank holding company is a company that owns and/or controls one or more U.S. banks or one that owns, or has controlling interest in, one or more banks. A bank holding company may also own another bank holding company, which in turn owns or controls a bank; the company at the top of the ownership chain is called the top holder. The Board of Governors is responsible for regulating and supervising bank holding companies, even if the bank owned by the holding company is under the primary supervision of a different federal agency (OCC or FDIC).",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "U.S. bank holding company",
   :rdfs/subClassOf :fibo-fbc-fct-fse/BankHoldingCompany,
   :skos/definition
   "a bank holding company that is licensed to conduct business in the United States and is regulated and supervised by the Federal Reserve in accordance with the Bank Holding Company Act of 1956"})

(def USCreditUnion
  "cooperative association organized for the purpose of promoting thrift among its members and creating a source of credit for provident or productive purposes"
  {:db/ident :fibo-fbc-fct-usfse/USCreditUnion,
   :fibo-fnd-utl-av/explanatoryNote
   "As soon as you deposit funds into a credit union account, you become a partial owner and participate in the union's profitability. Credit unions may be formed by large corporations and organizations for their employees and members.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/NorthAmericanEntities/USFinancialServicesEntities/",
   :rdfs/label "U.S. credit union",
   :rdfs/subClassOf [{:owl/onClass    :fibo-be-le-cb/NotForProfitCorporation,
                      :owl/onProperty :fibo-fnd-rel-rel/hasIdentity,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-fct-usfse/ThriftInstitution
                     :fibo-fbc-fct-fse/CreditUnion],
   :skos/definition
   "cooperative association organized for the purpose of promoting thrift among its members and creating a source of credit for provident or productive purposes"})