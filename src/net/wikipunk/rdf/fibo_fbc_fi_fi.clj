(ns net.wikipunk.rdf.fibo-fbc-fi-fi
  "This ontology defines the fundamental concepts for financial instruments in general, providing the high-level hooks for build-out in more detail in the relevant domain areas. These include, but are not limited to, equities, options, debt instruments, and so forth, some of which may be negotiable."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
   :dcterms/abstract
   "This ontology defines the fundamental concepts for financial instruments in general, providing the high-level hooks for build-out in more detail in the relevant domain areas. These include, but are not limited to, equities, options, debt instruments, and so forth, some of which may be negotiable.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/FormalBusinessOrganizations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Roles/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Parties/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/Jurisdiction/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/OwnershipAndControl/CorporateOwnership/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/IdentifiersAndIndices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LegalPersons/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/FinancialProductsAndServices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Contracts/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Addresses/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/DebtAndEquities/Debt/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/ProductsAndServices/ProductsAndServices/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-be-le-fbo"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/FormalBusinessOrganizations/",
    "fibo-be-le-lp"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/",
    "fibo-be-oac-cown"
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/CorporateOwnership/",
    "fibo-fbc-dae-dbt"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
    "fibo-fbc-fi-fi"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
    "fibo-fbc-pas-fpas"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
    "fibo-fnd-agr-ctr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
    "fibo-fnd-law-jur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/Jurisdiction/",
    "fibo-fnd-pas-pas"
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/",
    "fibo-fnd-plc-adr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/",
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
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
   :rdfa/prefix "fibo-fbc-fi-fi",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
   :rdfs/label "Financial Instruments Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/ version of this ontology was modified to move properties and restrictions related to maturity to the Debt ontology, on credit agreement, and deprecate them here as well as to restructure the relationship between the two ontologies."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/ version of this ontology was modified to correct the label on packaged financial product."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/ version of this ontology was modified to reflect issue resolutions detailed in the FIBO FBC 1.0 FTF report."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/ version of this ontology was modified to address dead links and text formatting issues uncovered by hygiene testing."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/ version of this ontology was modified to add the concept of a spot contract and clarify the definition of time to maturity, as well as add a property for days to maturity."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/ version of this ontology was modified for the FIBO 2.0 RFC, including minor bug fixes."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/ version of this ontology was modified to make Entitlement a subclass of Security and fix spelling."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/ version of this ontology was modified to change the restriction on financial instrument identifier from some values to min 0, to allow for cases when an instrument identifier identifies a listing, eliminate duplication of concepts in LCC, and simplify addresses."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/ version of this ontology was modified to move redemption provision from debt to financial instruments, given that it is a broader concept needed for equities."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/ version of this ontology was modified to eliminate deprecated content, i.e., properties related to maturity that are now in the Debt ontology and revise the definition of a securities transaction identifier to align with ISO 23897."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/ version of this ontology was modified to add a property indicating the currency that an instrument is issued in, simplify the contract party hierarchy and add properties relating financial instruments to shareholders."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/ version of this ontology was modified as a part of organizational hierarchy simplification, to add maturity-related properties, and to add exempt security."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/ version of this ontology was modified to incorporate a hasMaturityDate property given that it can apply to debt instruments and preferred shares, as well as to other financial instruments, eliminated the redundant hasScheduledMaturityDate property, cleaned up circular definitions, eliminated the property 'mayBeTradedIn', which was only used in one place and was redundant with the concept of a ListedSecurity / Listing in SEC, added a synonym and additional explanatory note to packaged financial product, added hasNominalValue, which was a gap, and added back restrictions on debt instrument for hasMaturityDate (min 0 to account for rare instruments (e.g., consul) that have no maturity date), hasDurationToMaturity and hasTimeToMaturity."
    "The https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/ version of this ontology was modified to eliminate deprecated elements."],
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright ["Copyright (c) 2015-2022 EDM Council, Inc."
                  "Copyright (c) 2015-2022 Object Management Group, Inc."],
   :sm/dependsOn
   ["https://spec.edmcouncil.org/fibo/ontology/FND/"
    "https://spec.edmcouncil.org/fibo/ontology/BE/"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/"
    "https://www.omg.org/spec/LCC/"],
   :sm/fileAbbreviation "fibo-fbc-fi-fi",
   :sm/filename "FinancialInstruments.rdf"})

(def CashInstrument
  "financial instrument whose value is determined by the market and that is readily transferable (highly liquid)"
  {:db/ident :fibo-fbc-fi-fi/CashInstrument,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
   :rdfs/label "cash instrument",
   :rdfs/subClassOf :fibo-fbc-fi-fi/FinancialInstrument,
   :skos/definition
   "financial instrument whose value is determined by the market and that is readily transferable (highly liquid)",
   :skos/scopeNote
   "Cash instruments can be classified into two subgroups, as securities and other cash instruments such as loans and deposits."})

(def CommodityInstrument
  "financial instrument representing an ownership interest in bulk goods, such as raw materials and primary agricultural products"
  {:db/ident :fibo-fbc-fi-fi/CommodityInstrument,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
   :rdfs/label "commodity instrument",
   :rdfs/subClassOf :fibo-fbc-fi-fi/FinancialInstrument,
   :skos/definition
   "financial instrument representing an ownership interest in bulk goods, such as raw materials and primary agricultural products"})

(def CurrencyInstrument
  "financial instrument used for the purposes of currency trading"
  {:db/ident :fibo-fbc-fi-fi/CurrencyInstrument,
   :fibo-fnd-utl-av/adaptedFrom
   "Parameswaran, Sunil. Fundamentals of Financial Instruments: An Introduction to Stocks, Bonds, Foreign Exchange, and Derivatives. John Wiley and Sons (Asia) Pte. Lte., Singapore, 2011.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
   :rdfs/label "currency instrument",
   :rdfs/subClassOf :fibo-fbc-fi-fi/FinancialInstrument,
   :skos/definition
   "financial instrument used for the purposes of currency trading",
   :skos/example
   "Example currencies include UK pounds, US dollars, Euro. An example currency instrument is spot currency instrument.",
   :skos/scopeNote
   "Each instance of a currency instrument has a one to one relationship with its associated currency."})

(def DebtInstrument
  "financial instrument and credit agreement evidencing monies owed by the issuer to the holder on terms as specified"
  {:db/ident :fibo-fbc-fi-fi/DebtInstrument,
   :fibo-fnd-utl-av/adaptedFrom
   "ISO 10962, Securities and related financial instruments - Classification of Financial Instruments (CFI code), Second edition, 2001-05-01.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
   :rdfs/label "debt instrument",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fbc-dae-dbt/hasLender,
                      :owl/someValuesFrom :fibo-fbc-dae-dbt/Lender,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fbc-dae-dbt/hasBorrower,
                      :owl/someValuesFrom :fibo-fbc-dae-dbt/Borrower,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-fi-fi/FinancialInstrument
                     :fibo-fbc-dae-dbt/CreditAgreement],
   :skos/definition
   "financial instrument and credit agreement evidencing monies owed by the issuer to the holder on terms as specified"})

(def DerivativeInstrument
  "financial instrument that confers on its holders certain rights or obligations, whose value is derived from one or more underlying assets"
  {:db/ident :fibo-fbc-fi-fi/DerivativeInstrument,
   :fibo-fnd-utl-av/adaptedFrom
   "Parameswaran, Sunil. Fundamentals of Financial Instruments: An Introduction to Stocks, Bonds, Foreign Exchange, and Derivatives. John Wiley and Sons (Asia) Pte. Lte., Singapore, 2011.",
   :fibo-fnd-utl-av/explanatoryNote
   "Derivative contracts owe their availability to the existence of markets for an underlying asset or a portfolio of assets on which such agreements are written. The derivative itself is merely a contract between two or more parties. Its value is determined by fluctuations in the underlying asset. Most derivatives are characterized by high leverage.",
   :fibo-fnd-utl-av/synonym "derivative contract",
   :owl/disjointWith :fibo-fbc-fi-fi/CashInstrument,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
   :rdfs/label "derivative instrument",
   :rdfs/subClassOf :fibo-fbc-fi-fi/FinancialInstrument,
   :skos/definition
   "financial instrument that confers on its holders certain rights or obligations, whose value is derived from one or more underlying assets",
   :skos/example
   "The three major categories of derivatives are (1) forward and future contracts, (2) options contracts, and (3) swaps. The most common underlying assets include stocks, bonds, commodities, currencies, interest rates and market indexes.",
   :skos/scopeNote
   "Derivatives can be characterized by whether they are exchange-traded or traded over-the-counter (OTC)."})

(def Entitlement
  "financial instrument that provides the holder the privilege to subscribe to or to receive specific assets on terms specified"
  {:db/ident :fibo-fbc-fi-fi/Entitlement,
   :fibo-fnd-utl-av/adaptedFrom
   "ISO 10962, Securities and related financial instruments - Classification of Financial Instruments (CFI code), Second edition, 2001-05-01.",
   :fibo-fnd-utl-av/synonym "right",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
   :rdfs/label "entitlement",
   :rdfs/subClassOf [:fibo-fbc-fi-fi/Security
                     :fibo-fbc-fi-fi/DerivativeInstrument],
   :skos/definition
   "financial instrument that provides the holder the privilege to subscribe to or to receive specific assets on terms specified"})

(def EquityInstrument
  "financial instrument representing an ownership interest in an entity or pool of assets"
  {:db/ident :fibo-fbc-fi-fi/EquityInstrument,
   :fibo-fnd-utl-av/adaptedFrom
   "ISO 10962, Securities and related financial instruments - Classification of Financial Instruments (CFI code), Second edition, 2001-05-01.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
   :rdfs/label "equity instrument",
   :rdfs/subClassOf :fibo-fbc-fi-fi/Security,
   :skos/definition
   "financial instrument representing an ownership interest in an entity or pool of assets"})

(def ExemptSecurity
  "security that is exempt from certain regulatory rules"
  {:db/ident :fibo-fbc-fi-fi/ExemptSecurity,
   :fibo-fnd-utl-av/adaptedFrom "Securities Act of 1933",
   :fibo-fnd-utl-av/explanatoryNote
   "Generally, securities must be filed with the appropriate regulatory agencies in the jurisdiction in which they are sold. The registration forms companies file provide essential facts while minimizing the burden and expense of complying with the law. Not all securities must be registered, however. By exempting many small offerings from the registration process, regulators seek to foster capital formation by lowering the cost of offering securities to the public.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
   :rdfs/label "exempt security",
   :rdfs/subClassOf :fibo-fbc-fi-fi/Security,
   :skos/definition "security that is exempt from certain regulatory rules",
   :skos/example
   "Some exemptions from the registration requirement include: private offerings to a limited number of persons or institutions; offerings of limited size; intrastate offerings; and securities of municipal, state, and federal governments."})

(def FinancialInstrument
  "written contract that gives rise to both a financial asset of one entity and a financial liability of another entity"
  {:db/ident :fibo-fbc-fi-fi/FinancialInstrument,
   :fibo-fnd-utl-av/adaptedFrom
   "https://www.ifrs.org/content/dam/ifrs/publications/pdf-standards/english/2021/issued/part-a/ias-32-financial-instruments-presentation.pdf",
   :fibo-fnd-utl-av/explanatoryNote
   "A financial instrument can be thought of as a template that defines an arrangement structure that remains to be fleshed out with terms and parameters in order to establish a specific instance of the contract.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
   :rdfs/label "financial instrument",
   :rdfs/subClassOf [{:owl/onDataRange :xsd/boolean,
                      :owl/onProperty  :fibo-fbc-fi-fi/isNegotiable,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass
                      :fibo-fbc-fi-fi/FinancialInstrumentIdentifier,
                      :owl/onProperty :lcc-lr/isIdentifiedBy,
                      :rdf/type :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-acc-cur/MonetaryAmount,
                      :owl/onProperty :fibo-fbc-fi-fi/hasNominalValue,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-law-jur/Jurisdiction,
                      :owl/onProperty :fibo-fbc-fi-fi/isLegallyRecordedIn,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-agr-ctr/WrittenContract
                     {:owl/onClass    :fibo-fnd-acc-cur/Currency,
                      :owl/onProperty :fibo-fbc-fi-fi/isDenominatedIn,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-rel-rel/isIssuedBy,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Issuer,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   "written contract that gives rise to both a financial asset of one entity and a financial liability of another entity",
   :skos/example
   "Examples of financial instruments include: cash, evidence of an ownership interest in an entity, or a contractual right to receive (or deliver) cash, or another financial instrument."})

(def FinancialInstrumentIdentifier
  "sequence of characters uniquely identifying a financial instrument for some purpose and within a specified context"
  {:db/ident :fibo-fbc-fi-fi/FinancialInstrumentIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
   :rdfs/label "financial instrument identifier",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fbc-fi-fi/FinancialInstrument,
                      :owl/onProperty :lcc-lr/identifies,
                      :rdf/type       :owl/Restriction}
                     :lcc-lr/Identifier],
   :skos/definition
   "sequence of characters uniquely identifying a financial instrument for some purpose and within a specified context",
   :skos/scopeNote
   "Identifiers for financial instruments may include an ISIN, Sedol, CUSIP, BBGID, FIGI, or other identifier issued approximately when the instrument itself is issued, and based on the kind of instrument and jurisdiction in which it is issued."})

(def Future
  "derivative instrument that obligates the buyer to receive and the seller to deliver the assets specified at an agreed price, at some later point in time"
  {:db/ident :fibo-fbc-fi-fi/Future,
   :fibo-fnd-utl-av/adaptedFrom
   "ISO 10962, Securities and related financial instruments - Classification of Financial Instruments (CFI code), Second edition, 2001-05-01.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
   :rdfs/label "future",
   :rdfs/subClassOf :fibo-fbc-fi-fi/DerivativeInstrument,
   :skos/definition
   "derivative instrument that obligates the buyer to receive and the seller to deliver the assets specified at an agreed price, at some later point in time"})

(def Issuer
  "party that issues (or proposes to issue in a formal filing) a financial instrument"
  {:db/ident :fibo-fbc-fi-fi/Issuer,
   :fibo-fnd-utl-av/adaptedFrom
   "Securities Exchange Act of 1934, as amended 12 August 2012",
   :fibo-fnd-utl-av/explanatoryNote
   ["With respect to certificates of deposit for securities, voting-trust certificates, or collateral- trust certificates, or with respect to certificates of interest or shares in an unincorporated investment trust not having a board of directors or of the fixed, restricted management, or unit type, the term issuer means the person or persons performing the acts and assuming the duties of depositor or manager pursuant to the provisions of the trust or other agreement or instrument under which such securities are issued; and except that with respect to equipment-trust certificates or like securities, the term issuer means the person by whom the equipment or property is, or is to be, used."
    "An issuer can be any legal person, including a legally competent natural person, company, government, or political subdivision, agency, or instrumentality of a government, depending on the nature of the instrument. A person might provide a loan directly to another party, but most instruments are issued by legal entities."],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
   :rdfs/label "issuer",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-pty-rl/isPlayedBy,
                      :owl/someValuesFrom {:owl/onProperty
                                           :fibo-fnd-pty-pty/isAPartyTo,
                                           :owl/someValuesFrom
                                           :fibo-fbc-fi-fi/FinancialInstrument,
                                           :rdf/type :owl/Restriction},
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-agr-ctr/ContractPrincipal],
   :skos/definition
   "party that issues (or proposes to issue in a formal filing) a financial instrument"})

(def NegotiableSecurity
  "security that can be transferred to another party"
  {:db/ident :fibo-fbc-fi-fi/NegotiableSecurity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
   :rdfs/label "negotiable security",
   :rdfs/subClassOf [{:owl/hasValue   {:xsd/boolean true},
                      :owl/onProperty :fibo-fbc-fi-fi/isNegotiable,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-agr-ctr/TransferableContract
                     :fibo-fbc-fi-fi/Security],
   :skos/definition "security that can be transferred to another party"})

(def NonNegotiableSecurity
  "security that is not transferable to another party"
  {:db/ident :fibo-fbc-fi-fi/NonNegotiableSecurity,
   :fibo-fnd-utl-av/explanatoryNote
   "Certain securities that can be redeemed by the issuer may not be 'negotiable', such as savings bonds and certificates of deposit.",
   :owl/disjointWith :fibo-fbc-fi-fi/NegotiableSecurity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
   :rdfs/label "non-negotiable security",
   :rdfs/subClassOf :fibo-fbc-fi-fi/Security,
   :skos/definition "security that is not transferable to another party"})

(def Option
  "derivative instrument that grants to the holder either the privilege to purchase or the privilege to sell the assets specified at a predetermined price or formula at or within a time period in the future"
  {:db/ident :fibo-fbc-fi-fi/Option,
   :fibo-fnd-utl-av/adaptedFrom
   "ISO 10962, Securities and related financial instruments - Classification of Financial Instruments (CFI code), Second edition, 2001-05-01.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
   :rdfs/label "option",
   :rdfs/subClassOf :fibo-fbc-fi-fi/DerivativeInstrument,
   :skos/definition
   "derivative instrument that grants to the holder either the privilege to purchase or the privilege to sell the assets specified at a predetermined price or formula at or within a time period in the future"})

(def PackagedFinancialProduct
  "financial product that acts as a container for at least one financial instrument, including other financial products, and whose value is derived from, or based on a reference asset, market measure, or investment strategy"
  {:db/ident :fibo-fbc-fi-fi/PackagedFinancialProduct,
   :fibo-fnd-utl-av/explanatoryNote
   ["Certain properties of the instruments, such as their term, interest rate, eligibility of the client, etc., may be set as a part of the product specification. Some of these are intrinsic but variable properties of the instrument, for example the exact interest rate, whereas others are extrinsic, such as client eligibility. Product offerings have prices, which may build in various fees, that are components of the cost of carry on a trader's books."
    "SEC Rule 434 defines structured securities as 'securities whose cash flow characteristics depend upon one or more indices or that have embedded forwards or options or securities where an investor's investment return and the issuer's payment obligations are contingent on, or highly sensitive to, changes in the value of underlying assets, indices, interest rates or cash flows'."
    "Reference assets and market measures may include single equity or debt securities, indexes, commodities, interest rates and/or foreign currencies, as well as baskets of these reference assets or market measures. Like other well-known market instruments such as convertible bonds, many structured products are hybrid securities. Structured products typically have two components - a debt instrument and a derivative, which is often an option. The debt instrument, in some instances, may pay interest at a specified rate and interval. The derivative component establishes payment at maturity, which may give the issuer the right to buy from you, or sell you, the referenced security or securities at a predetermined price. For example, structured products may combine characteristics of debt and equity or of debt and commodities."],
   :fibo-fnd-utl-av/synonym ["market-linked investment" "structured product"],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
   :rdfs/label "packaged financial product",
   :rdfs/seeAlso
   ["https://www.sec.gov/Archives/edgar/data/36995/000121465907002234/c101872fwp.htm"],
   :rdfs/subClassOf [:fibo-fbc-pas-fpas/FinancialProduct
                     :fibo-fnd-pas-pas/ContractualProduct
                     {:owl/onProperty :fibo-fnd-rel-rel/comprises,
                      :owl/someValuesFrom
                      {:owl/unionOf [:fibo-fbc-pas-fpas/FinancialProduct
                                     :fibo-fbc-fi-fi/FinancialInstrument],
                       :rdf/type    :owl/Class},
                      :rdf/type :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass :fibo-fbc-pas-fpas/FinancialProductCatalog,
                      :owl/onProperty :fibo-fnd-rel-rel/isIncludedIn,
                      :rdf/type :owl/Restriction}],
   :skos/definition
   "financial product that acts as a container for at least one financial instrument, including other financial products, and whose value is derived from, or based on a reference asset, market measure, or investment strategy",
   :skos/scopeNote
   "Packaged products are typically included in an institution's approved product catalog, i.e., pre-approved by compliance organizations for sale to clients. Not all institutions maintain such a catalog, with internal identifiers for such products, but many do. Such core products may have as attributes: Type (product and possibly asset class), product identifier, status and approval date, product family approval (as appropriate), and so forth."})

(def RedemptionProvision
  "contract provision enabling the issuer (writer) to regain possession through repayment of some stipulated price"
  {:db/ident :fibo-fbc-fi-fi/RedemptionProvision,
   :fibo-fnd-utl-av/explanatoryNote
   "In general, redemption is synonymous with 'buy back' or 'cash in', depending on the kind of instrument. Redemption provisions are commonly applicable to the process of annulling a defeasible title, such as for a mortgage or tax sale, by paying the debt or fulfilling an obligation.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
   :rdfs/label "redemption provision",
   :rdfs/subClassOf :fibo-fnd-agr-ctr/ContractualCommitment,
   :skos/definition
   "contract provision enabling the issuer (writer) to regain possession through repayment of some stipulated price"})

(def SecuritiesTransaction
  "transaction between two or more parties involving the exchange of commonly defined financial products"
  {:db/ident :fibo-fbc-fi-fi/SecuritiesTransaction,
   :fibo-fnd-utl-av/adaptedFrom
   "ISO 23897:2020, Financial services - Unique transaction identifier (UTI), clause 3.3",
   :fibo-fnd-utl-av/synonym "financial transaction",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
   :rdfs/label "securities transaction",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/appliesTo,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/FinancialInstrument,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-pas-fpas/Trade],
   :skos/definition
   "transaction between two or more parties involving the exchange of commonly defined financial products"})

(def SecuritiesTransactionIdentifier
  {:db/ident :fibo-fbc-fi-fi/SecuritiesTransactionIdentifier,
   :owl/deprecated true,
   :owl/equivalentClass :fibo-fbc-pas-fpas/UniqueTransactionIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/"})

(def Security
  "financial instrument that can be bought or sold"
  {:db/ident :fibo-fbc-fi-fi/Security,
   :fibo-fnd-utl-av/adaptedFrom
   "Securities Exchange Act of 1934, as amended 12 August 2012",
   :fibo-fnd-utl-av/explanatoryNote
   ["Whether a contract or other economic right is a security essentially depends on whether the holder of the contract is acting as an investor who seeks financial benefits based on the work of a promoter or a third party."
    "In the U.S., the Supreme Court has adopted a flexible and liberal approach in determining what constitutes a security. In its famous decision of SEC v. W.J. Howey Co., 328 U.S. 293, 90 L.Ed. 1244, 66 S.Ct. 1100 (1946), the Court held that land sales contracts for citrus groves in Florida, coupled with warranty deeds for the land and a contract to service the land, were 'investment contracts' and thus securities. The Court stated that [a]n investment contract for purposes of the Securities Act means a contract, transaction or scheme whereby a person invests his money in a common enterprise and is led to expect profits solely from the efforts of the promoter or a third party. 66 S.Ct. at 1103. According to the Court, it is immaterial whether the shares in the enterprise are evidenced by formal certificates or by nominal interests in the physical assets employed in the enterprise. 66 S.Ct. at 1104."
    "A security can be any note, stock, treasury stock, security future, security-based swap, bond, debenture,certificate of interest or participation in any profit-sharing agreement or in any oil, gas, or other mineral royalty or lease, any collateral-trust certificate, preorganization certificate or subscription, transferable share, investment contract, voting-trust certificate, certificate of deposit for a security, any put, call, straddle, option, or privilege on any security, certificate of deposit, or group or index of securities (including any interest therein or based on the value thereof), or any put, call, straddle, option, or privilege entered into on a national securities exchange relating to foreign currency, or in general, any instrument commonly known as a security, or any certificate of interest or participation in, temporary or interim certificate for, receipt for, or warrant or right to subscribe to or purchase, any of the foregoing; but shall not include currency or any note, draft, bill of exchange, or bankers' acceptance which has a maturity at the time of issuance of not exceeding nine months, exclusive of days of grace, or any renewal thereof the maturity of which is likewise limited."
    "Some securities may be traded over the counter, or through an exchange, or via some other trading venue such as an electronic trading platform."],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
   :rdfs/label "security",
   :rdfs/subClassOf [{:owl/onClass    :fibo-fnd-law-jur/Jurisdiction,
                      :owl/onProperty :fibo-fbc-fi-fi/isLegallyRecordedIn,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-fbc-fi-fi/FinancialInstrument],
   :skos/definition "financial instrument that can be bought or sold"})

(def SpotContract
  "financial instrument that settles for immediate delivery on a specified date"
  {:db/ident :fibo-fbc-fi-fi/SpotContract,
   :fibo-fnd-utl-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "A spot transaction is a transaction in which some goods or instrument(s) are exchanged for some other goods or instruments, including currency, with no future delivery provision, i.e., within the minimum number of days possible. Examples include currency spots and commodity spot transactions, whose settlement convention is determined by the relevant market."},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "spot contract"},
   :rdfs/subClassOf :fibo-fbc-fi-fi/FinancialInstrument,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "financial instrument that settles for immediate delivery on a specified date"}})

(def StandardizedTerms
  "contract terms that, grouped together, that are generally and consistently reused across many contracts, published by some organization, and capable of being incorporated into a contract by reference"
  {:db/ident :fibo-fbc-fi-fi/StandardizedTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
   :rdfs/label "standardized terms",
   :rdfs/subClassOf :fibo-fnd-agr-ctr/ContractualCommitment,
   :skos/definition
   "contract terms that, grouped together, that are generally and consistently reused across many contracts, published by some organization, and capable of being incorporated into a contract by reference",
   :skos/example
   "Each exchange has a set of terms they apply to membership agreements and with respect to the instruments that may be traded on that exchange. For example, there is a set expiration date that exchanges will publish for exchange-traded options - in the US it is the Saturday following the third Friday of every month. Similarly, there are set incremental dates for strike for exchange traded options. Contract sizes are also stipulated, for example in the US these are standardized by the OPRA Convention (Options Pricing Reporting Authority)."})

(def hasNominalValue
  "indicates the face value of something"
  {:db/ident :fibo-fbc-fi-fi/hasNominalValue,
   :fibo-fnd-utl-av/explanatoryNote
   "Nominal value of a security is its redemption price and will vary from its market value. A preferred stock's nominal (par) value is important in that it is used to calculate its dividend while the nominal value of common stock is an arbitrary value assigned for balance sheet purposes.",
   :fibo-fnd-utl-av/synonym "face value",
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
   :rdfs/label "has nominal value",
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasMonetaryAmount,
   :skos/definition "indicates the face value of something"})

(def hasPrincipalExecutiveOfficeAddress
  "relates an organization, specifically the issuer of a financial instrument, to its principal executive address, as required for issuance of that instrument"
  {:db/ident :fibo-fbc-fi-fi/hasPrincipalExecutiveOfficeAddress,
   :fibo-fnd-utl-av/explanatoryNote
   "Note that in most cases, the principal executive office address is also the headquarters address for a company.",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-le-lp/LegalPerson,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
   :rdfs/label "has principal executive office address",
   :rdfs/range :fibo-fnd-plc-adr/ConventionalStreetAddress,
   :rdfs/subPropertyOf :fibo-be-le-fbo/hasRegisteredAddress,
   :skos/definition
   "relates an organization, specifically the issuer of a financial instrument, to its principal executive address, as required for issuance of that instrument"})

(def hasRedemptionProvision
  "indicates the specific terms related to redemption as specified in the instrument or a related contract document"
  {:db/ident :fibo-fbc-fi-fi/hasRedemptionProvision,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
   :rdfs/label "has redemption terms",
   :rdfs/range :fibo-fbc-fi-fi/RedemptionProvision,
   :rdfs/subPropertyOf :fibo-fnd-agr-ctr/hasContractualElement,
   :skos/definition
   "indicates the specific terms related to redemption as specified in the instrument or a related contract document"})

(def hasShareholder
  "indicates a party that holds shares in the issuer"
  {:db/ident :fibo-fbc-fi-fi/hasShareholder,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-fi-fi/Issuer,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
   :rdfs/label "has shareholder",
   :rdfs/range :fibo-be-oac-cown/Shareholder,
   :rdfs/subPropertyOf :fibo-fnd-pty-pty/isAffectedBy,
   :skos/definition "indicates a party that holds shares in the issuer"})

(def hasValueExpressedIn
  "relates an instrument to the currency its value is typically expressed in"
  {:db/ident :fibo-fbc-fi-fi/hasValueExpressedIn,
   :fibo-fnd-utl-av/explanatoryNote
   "This should be the same currency that was declared at the time of issuance.",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-fi-fi/FinancialInstrument,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
   :rdfs/label "has value expressed in",
   :rdfs/range :fibo-fnd-acc-cur/Currency,
   :skos/definition
   "relates an instrument to the currency its value is typically expressed in"})

(def holdsSharesIn
  "specifies the issuer in which a shareholder holds an equity position"
  {:db/ident :fibo-fbc-fi-fi/holdsSharesIn,
   :owl/inverseOf :fibo-fbc-fi-fi/hasShareholder,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-be-oac-cown/Shareholder,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
   :rdfs/label "holds shares in",
   :rdfs/range :fibo-fbc-fi-fi/Issuer,
   :rdfs/subPropertyOf :fibo-fnd-pty-pty/actsOn,
   :skos/definition
   "specifies the issuer in which a shareholder holds an equity position"})

(def isDenominatedIn
  "indicates the currency in which the financial instrument was issued"
  {:db/ident :fibo-fbc-fi-fi/isDenominatedIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-fi-fi/FinancialInstrument,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
   :rdfs/label "is denominated in",
   :rdfs/range :fibo-fnd-acc-cur/Currency,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasCurrency,
   :skos/definition
   "indicates the currency in which the financial instrument was issued"})

(def isLegallyRecordedIn
  "jurisdiction (country, county, state, province, city) in which the financial instrument is legally recorded for regulatory and/or tax purposes"
  {:db/ident :fibo-fbc-fi-fi/isLegallyRecordedIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-fi-fi/FinancialInstrument,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
   :rdfs/label "is legally recorded in",
   :rdfs/range :fibo-fnd-law-jur/Jurisdiction,
   :rdfs/subPropertyOf :fibo-fnd-agr-ctr/hasGoverningJurisdiction,
   :skos/definition
   "jurisdiction (country, county, state, province, city) in which the financial instrument is legally recorded for regulatory and/or tax purposes"})

(def isNegotiable
  "specifies whether a particular financial instrument is or is not transferable"
  {:db/ident :fibo-fbc-fi-fi/isNegotiable,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-fbc-fi-fi/FinancialInstrument,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
   :rdfs/label "is negotiable",
   :rdfs/range :xsd/boolean,
   :skos/definition
   "specifies whether a particular financial instrument is or is not transferable"})