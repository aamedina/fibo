(ns net.wikipunk.rdf.fibo-sec-sec-iss
  {:cmns-av/copyright
   #{"Copyright (c) 2016-2024 EDM Council, Inc."
     "Copyright (c) 2018-2024 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/SEC/Securities/SecuritiesIssuance/",
   :dcterms/abstract
   "This ontology defines the fundamental concepts for issuing securities, including securities offering, offering document, offering statement, securities underwriter, prospectus, and so forth.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-doc" "https://www.omg.org/spec/Commons/Documents/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
    "cmns-pts" "https://www.omg.org/spec/Commons/PartiesAndSituations/",
    "cmns-rlcmp" "https://www.omg.org/spec/Commons/RolesAndCompositions/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-fct-pub"
    "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/Publishers/",
    "fibo-fbc-fct-fse"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/FinancialServicesEntities/",
    "fibo-fbc-fct-ra"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FunctionalEntities/RegistrationAuthorities/",
    "fibo-fbc-fi-fi"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
    "fibo-fbc-pas-fpas"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
    "fibo-fnd-acc-aeq"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/AccountingEquity/",
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
    "fibo-fnd-agr-agr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Agreements/",
    "fibo-fnd-agr-ctr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
    "fibo-fnd-arr-doc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/",
    "fibo-fnd-law-jur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/Jurisdiction/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-sec-sec-iss"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/RegistrationAuthorities/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/RegulatoryAgencies/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Documents/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/ProductsAndServices/ProductsAndServices/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/FinancialServicesEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/ProductsAndServices/FinancialProductsAndServices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/FunctionalEntities/Publishers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Agreements/Agreements/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Accounting/AccountingEquity/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Law/Jurisdiction/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/OwnershipAndControl/Executives/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/DebtAndEquities/Debt/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Arrangements/Documents/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/SEC/Securities/SecuritiesIssuance/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-sec-sec-iss",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/",
   :rdfs/label "Securities Issuance Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance.rdf version of the ontology was modified to replace concepts from several FIBO FND ontologies with their counterparts added to the Commons Ontology Library (Commons) v1.1."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/ version of this ontology was modified to add book entry form as a kind of registered security, make registered security a class with two individuals, namely book entry and 'bearer and registered', and clean up definitions to eliminate ambiguity where possible and conform to ISO 704."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/ version of this ontology was modified to clarify the definition of isIssuedInForm."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/ version of this ontology was modified to address text formatting hygiene issues and eliminate dead links."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/ version of this ontology was modified to refactor conversion terms as a child of redemption provision, move redemption provision to financial instruments, and eliminate the unnecessary securities contract terms class."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance.rdf version of this ontology was modified to normalize the representation of security forms (all individuals rather than a mixed representation)."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance.rdf version of the ontology was modified to replace additional concepts from several FIBO FND ontologies with their counterparts added to the Commons Ontology Library (Commons) v1.1."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/ version of this ontology was modified to add the concept of the form the security is issued in, namely bearer or registered."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/ version of this ontology was modified to eliminate duplication of concepts in LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/ version of this ontology was modified to refine the concept of a securities underwriter."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/"})

(def BearerAndRegisteredForm
  {:cmns-av/adaptedFrom
   {:rdf/value
    "ISO 10962:2019(E), Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth edition, 2019-10, clause 6.2.2"},
   :db/ident :fibo-sec-sec-iss/BearerAndRegisteredForm,
   :rdf/type #{:cmns-doc/Certificate :fibo-sec-sec-iss/SecurityForm
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/"},
   :rdfs/label "bearer and registered form",
   :skos/definition
   "form of a security that may be issued in both bearer and registered form but with the same identification number"})

(def BearerForm
  {:cmns-av/adaptedFrom
   {:rdf/value
    "ISO 10962:2019(E), Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth edition, 2019-10, clause 6.2.2"},
   :cmns-av/explanatoryNote
   "Unlike normal registered instruments, no record is kept of who owns bearer instruments or of transactions involving the transfer of ownership.",
   :db/ident :fibo-sec-sec-iss/BearerForm,
   :rdf/type #{:cmns-doc/Certificate :fibo-sec-sec-iss/SecurityForm
               :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/"},
   :rdfs/label "bearer form",
   :skos/definition
   "form of a security that is not registered in the books of the issuer or of the registrar and is payable to the person possessing the stock or bond certificate"})

(def BestEffortsOffering
  {:cmns-av/adaptedFrom
   {:rdf/value
    "Barron's Dictionary of Finance and Investment Terms, Ninth Edition, 2014."},
   :cmns-av/explanatoryNote
   "In a best efforts offering, the agreement is strictly an agency arrangement, with no obligation on the part of the agent to purchase the securities. They act as a broker, in other words.",
   :db/ident :fibo-sec-sec-iss/BestEffortsOffering,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/"},
   :rdfs/label "best efforts offering",
   :rdfs/subClassOf :fibo-sec-sec-iss/SecuritiesOffering,
   :skos/definition
   "securities offering whereby investment bankers commit to doing their best to sell the securities offered, but do not assume the full risk of an underwriter"})

(def BookEntryForm
  {:cmns-av/synonym "registered form",
   :db/ident :fibo-sec-sec-iss/BookEntryForm,
   :rdf/type #{:fibo-sec-sec-iss/SecurityForm :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/"},
   :rdfs/label "book entry form",
   :skos/definition
   "form of a security in which ownership is recorded electronically by a central depository"})

(def ConversionTerms
  {:db/ident :fibo-sec-sec-iss/ConversionTerms,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/"},
   :rdfs/label "conversion terms",
   :rdfs/subClassOf
   #{{:owl/onProperty     :fibo-sec-sec-iss/specifiesConversionInto,
      :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
      :rdf/type           :owl/Restriction} :fibo-fbc-fi-fi/RedemptionProvision
     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
      :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
      :rdf/type           :owl/Restriction}},
   :skos/definition
   "contract terms specifying when and how a security may be converted to another security (usually of the same issuer)"})

(def ConvertibleSecurity
  {:db/ident :fibo-sec-sec-iss/ConvertibleSecurity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/"},
   :rdfs/label "convertible security",
   :rdfs/subClassOf #{{:owl/onProperty :fibo-fnd-agr-ctr/hasContractualElement,
                       :owl/someValuesFrom :fibo-sec-sec-iss/ConversionTerms,
                       :rdf/type :owl/Restriction} :fibo-fbc-fi-fi/Security},
   :skos/definition "security that can be converted into another security",
   :skos/example
   #{"Convertible securities may be convertible bonds or preferred stocks that pay regular interest and can be converted into shares of common stock (sometimes conditioned on the stock price appreciating to a predetermined level)."
     "Warrants are equity convertible securities. They give the owner the option to buy newly issued shares at a determined exercise price and date."}})

(def ExemptIssuer
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "http://www.investopedia.com/exam-guide/series-66/regulation-of-securities/exempt-securities.asp"},
   :db/ident :fibo-sec-sec-iss/ExemptIssuer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/"},
   :rdfs/label "exempt issuer",
   :rdfs/subClassOf :fibo-fbc-fi-fi/Issuer,
   :skos/definition
   "issuer that issues securities that are excused from certain regulatory reporting requirements",
   :skos/example
   "In general, these include governments and issuers of tax exempt securities such as municipalities, banks and depository institutions, and authorized insurance companies, railroads and public utilities, and certain non-profit organizations."})

(def ExemptOffering
  {:cmns-av/adaptedFrom
   #{{:rdf/value
      "Barron's Dictionary of Finance and Investment Terms, Ninth Edition, 2014."}
     {:xsd/anyURI
      "http://www.investopedia.com/exam-guide/series-66/regulation-of-securities/exempt-securities.asp"}},
   :cmns-av/explanatoryNote
   "Such an offering may be considered exempt either because the issuer is exempt or the transaction specific to the offering is exempt.",
   :db/ident :fibo-sec-sec-iss/ExemptOffering,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/"},
   :rdfs/label "exempt offering",
   :rdfs/subClassOf
   #{{:owl/unionOf [{:owl/onProperty     :fibo-fnd-rel-rel/isIssuedBy,
                     :owl/someValuesFrom :fibo-sec-sec-iss/ExemptIssuer,
                     :rdf/type           :owl/Restriction}
                    {:owl/onProperty     :fibo-fnd-rel-rel/embodies,
                     :owl/someValuesFrom :fibo-sec-sec-iss/ExemptTransaction,
                     :rdf/type           :owl/Restriction}],
      :rdf/type    :owl/Class} :fibo-sec-sec-iss/PublicOffering},
   :skos/definition
   "public offering involving securities that are excused from certain regulatory reporting requirements"})

(def ExemptTransaction
  {:cmns-av/adaptedFrom
   {:xsd/anyURI "http://www.investopedia.com/terms/e/exempttransaction.asp"},
   :db/ident :fibo-sec-sec-iss/ExemptTransaction,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/"},
   :rdfs/label "exempt transaction",
   :rdfs/subClassOf :fibo-fbc-fi-fi/SecuritiesTransaction,
   :skos/definition
   "securities transaction for which there is no requirement to register the transaction with a regulatory agency",
   :skos/example
   "Examples include non-issuer transactions in outstanding securities, other isolated non-issuer transactions, certain unsolicited / de minimis transactions, fiduciary transactions, transactions with financial institutions, private placement transactions that meet certain conditions, and so forth."})

(def FinancialInstrumentShortName
  {:cmns-av/abbreviation "FISN",
   :cmns-av/adaptedFrom
   {:rdf/value
    "ISO 18774:2015(E), Securities and related financial instruments - Financial Instrument Short Name (FISN)"},
   :db/ident :fibo-sec-sec-iss/FinancialInstrumentShortName,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/"},
   :rdfs/label "financial instrument short name",
   :rdfs/subClassOf #{:cmns-id/Identifier
                      {:owl/onDataRange :xsd/string,
                       :owl/onProperty
                       :fibo-sec-sec-iss/hasInstrumentDescription,
                       :owl/qualifiedCardinality 1,
                       :rdf/type :owl/Restriction}
                      {:owl/onDataRange :xsd/string,
                       :owl/onProperty  :fibo-sec-sec-iss/hasIssuerShortName,
                       :owl/qualifiedCardinality 1,
                       :rdf/type        :owl/Restriction}},
   :skos/definition
   "abbreviated name for a financial instrument within a defined structure as specified in ISO 18774"})

(def FirmCommitmentOffering
  {:cmns-av/adaptedFrom
   {:rdf/value
    "Barron's Dictionary of Finance and Investment Terms, Ninth Edition, 2014."},
   :db/ident :fibo-sec-sec-iss/FirmCommitmentOffering,
   :owl/disjointWith :fibo-sec-sec-iss/BestEffortsOffering,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/"},
   :rdfs/label "firm commitment offering",
   :rdfs/subClassOf :fibo-sec-sec-iss/SecuritiesOffering,
   :skos/definition
   "securities offering whereby the underwriter purchases the securities outright for their own account"})

(def MiscellaneousForm
  {:cmns-av/adaptedFrom
   {:rdf/value
    "ISO 10962:2019(E), Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth edition, 2019-10, clause 6.2.2"},
   :cmns-av/explanatoryNote
   "Miscellaneous form is used to describe securities wherein the form is not stated as being bearer or registered.",
   :db/ident :fibo-sec-sec-iss/MiscellaneousForm,
   :rdf/type #{:fibo-sec-sec-iss/SecurityForm :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/"},
   :rdfs/label "miscellaneous form",
   :skos/definition "form of a security that is not categorized"})

(def OfferingDocument
  {:cmns-av/adaptedFrom {:rdf/value "EDM Council"},
   :cmns-av/explanatoryNote
   "There are many variations, including offering memorandum, which is typically used in the context of a private placement, offering statement, which has slightly different meanings depending on the context (for securities, for bonds, etc.) and so forth. This concept is intended to act as a more abstract parent for these more nuanced concepts.",
   :db/ident :fibo-sec-sec-iss/OfferingDocument,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/"},
   :rdfs/label "offering document",
   :rdfs/subClassOf #{{:owl/onClass    :fibo-sec-sec-iss/SecuritiesOffering,
                       :owl/onProperty :fibo-fnd-agr-ctr/isEvidenceFor,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction} :cmns-doc/LegalDocument
                      {:owl/onClass    :cmns-dt/Date,
                       :owl/onProperty :fibo-fnd-arr-doc/hasDateOfIssuance,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      :fibo-be-fct-pub/Publication
                      {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                       :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                       :rdf/type           :owl/Restriction}
                      {:owl/onClass    :cmns-dt/Date,
                       :owl/onProperty :fibo-fnd-arr-doc/hasExpirationDate,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "legal document that states the objectives, risks and terms of an investment"})

(def OfferingStatement
  {:cmns-av/explanatoryNote
   "See https://www.sec.gov/about/forms/form1-a.pdf for the actual form detail",
   :db/ident :fibo-sec-sec-iss/OfferingStatement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/"},
   :rdfs/label "offering statement",
   :rdfs/subClassOf :fibo-sec-sec-iss/OfferingDocument,
   :skos/definition
   "offering memorandum that conforms to Regulation A, Offering Statement, of the Securities Act of 1933"})

(def PrivateOffering
  {:cmns-av/adaptedFrom {:rdf/value "EDM Council / Quarule"},
   :cmns-av/explanatoryNote
   "Unlike a public offering, a private placement does not have to be registered with a regulatory agency if the securities are purchased for investment rather than resale.",
   :cmns-av/synonym "private placement",
   :db/ident :fibo-sec-sec-iss/PrivateOffering,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/"},
   :rdfs/label "private offering",
   :rdfs/subClassOf #{:fibo-sec-sec-iss/SecuritiesOffering
                      {:owl/onProperty :fibo-fnd-agr-ctr/isEvidencedBy,
                       :owl/someValuesFrom
                       :fibo-sec-sec-iss/PrivatePlacementMemorandum,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "offering of securities made privately to a limited number of qualified potential investors"})

(def PrivatePlacementMemorandum
  {:cmns-av/abbreviation "PPM",
   :cmns-av/adaptedFrom
   #{{:rdf/value
      "Barron's Dictionary of Finance and Investment Terms, Ninth Edition, 2014."}
     {:xsd/anyURI
      "http://www.investopedia.com/terms/o/offeringmemorandum.asp"}},
   :cmns-av/explanatoryNote
   "An offering memorandum serves to provide buyers with information on the offering and to protect the sellers from the liability associated with selling unregistered securities. It includes information such as the financial statements, management biographies, a detailed description of the business, etc.",
   :cmns-av/synonym "offering memorandum",
   :db/ident :fibo-sec-sec-iss/PrivatePlacementMemorandum,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/"},
   :rdfs/label "private placement memorandum",
   :rdfs/subClassOf :fibo-sec-sec-iss/OfferingDocument,
   :skos/definition
   "legal document stating the objectives, risks and terms of investment involved with a private placement"})

(def Prospectus
  {:cmns-av/adaptedFrom
   #{{:rdf/value
      "The Securities Act of 1933, as amended 5 April 2012, see http://www.sec.gov/about/laws/sa33.pdf"}
     {:rdf/value
      "Barron's Dictionary of Finance and Investment Terms, Ninth Edition, 2014."}},
   :cmns-av/explanatoryNote
   #{"In the United States, a prospectus may be a formal legal document, required by and filed with the Securities and Exchange Commission, if it provides details about an investment offering for sale to the public."
     "A prospectus may specify the facts about an offering of securities, mutual funds, or limited partnerships for investments in oil, gas, equipment leasing, or other kinds of limited partnerships."},
   :db/ident :fibo-sec-sec-iss/Prospectus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/"},
   :rdfs/label "prospectus",
   :rdfs/seeAlso {:xsd/anyURI
                  "http://www.investopedia.com/terms/p/prospectus.asp"},
   :rdfs/subClassOf :fibo-sec-sec-iss/OfferingDocument,
   :skos/definition
   "formal, written offering document to sell securities that provides the facts an investor needs to make an informed investment decision"})

(def PublicOffering
  {:cmns-av/adaptedFrom
   {:rdf/value
    "Barron's Dictionary of Finance and Investment Terms, Ninth Edition, 2014."},
   :cmns-av/explanatoryNote
   "In the US, public offerings generally require approval of the Securities Exchange Commission and/or relevant state regulators, unless the issuer is an exempt issuer, and are usually conducted by an investment banker or a syndicate made up of several investment bankers, at a price agreed upon between the issuer and the investment bankers.",
   :db/ident :fibo-sec-sec-iss/PublicOffering,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/"},
   :rdfs/label "public offering",
   :rdfs/subClassOf #{:fibo-sec-sec-iss/SecuritiesOffering
                      {:owl/onProperty     :fibo-fnd-agr-ctr/isEvidencedBy,
                       :owl/someValuesFrom :fibo-sec-sec-iss/Prospectus,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "offering of securities for sale to the investment public, after compliance with registration requirements of the relevant regulatory authorities"})

(def RegisteredForm
  {:cmns-av/adaptedFrom
   {:rdf/value
    "ISO 10962:2019(E), Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth edition, 2019-10, clause 6.2.2"},
   :cmns-av/explanatoryNote
   "With registered securities, a ledger is kept by the issuing company or agent which records the owners of all the securities. Transfer of ownership can only occur when names are changed in the ledger.",
   :db/ident :fibo-sec-sec-iss/RegisteredForm,
   :rdf/type #{:fibo-sec-sec-iss/SecurityForm :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/"},
   :rdfs/label "registered form",
   :skos/definition
   "form of a security whereby ownership is recorded in the name of the owner on the books of the issuer or the issuer's registrar and can only be transferred to another owner when endorsed by the registered owner"})

(def SecuritiesOffering
  {:cmns-av/adaptedFrom
   #{{:xsd/anyURI "http://www.investopedia.com/"}
     {:rdf/value
      "Barron's Dictionary of Finance and Investment Terms, Ninth Edition, 2014."}},
   :cmns-av/explanatoryNote
   "If the offering is public, then it can only be made after regulatory registration requirements have been met. The securities may be new or a secondary offering of a previously issued security, and may include stock, multiple classes of equity shares, municipal or other government bonds, and so forth. Offerings, especially to the investment public, are typically made by an investment banker, or syndicate of investment bankers.",
   :db/ident :fibo-sec-sec-iss/SecuritiesOffering,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/"},
   :rdfs/label "securities offering",
   :rdfs/subClassOf
   #{{:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-fbc-pas-fpas/ThirdPartyAgent,
      :owl/onProperty :cmns-pts/hasPartyRole,
      :rdf/type       :owl/Restriction}
     {:owl/onClass    :fibo-fnd-acc-cur/MonetaryPrice,
      :owl/onProperty :fibo-fbc-pas-fpas/hasOfferingPrice,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction}
     {:owl/onProperty     :fibo-fnd-agr-ctr/isEvidencedBy,
      :owl/someValuesFrom :fibo-sec-sec-iss/OfferingDocument,
      :rdf/type           :owl/Restriction} :fibo-fnd-agr-agr/Agreement
     {:owl/onProperty     :fibo-fnd-agr-ctr/hasGoverningJurisdiction,
      :owl/someValuesFrom :fibo-fnd-law-jur/Jurisdiction,
      :rdf/type           :owl/Restriction} :fibo-fbc-pas-fpas/Offering
     {:owl/onProperty     :cmns-cxtdsg/appliesTo,
      :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
      :rdf/type           :owl/Restriction}
     {:owl/minQualifiedCardinality 0,
      :owl/onClass    :fibo-sec-sec-iss/SecurityUnderwriter,
      :owl/onProperty :fibo-sec-sec-iss/isUnderwrittenBy,
      :rdf/type       :owl/Restriction}
     {:owl/onProperty     :fibo-fnd-rel-rel/isIssuedBy,
      :owl/someValuesFrom {:owl/unionOf [:fibo-fbc-fi-fi/Issuer
                                         :fibo-fbc-pas-fpas/Offeror],
                           :rdf/type    :owl/Class},
      :rdf/type           :owl/Restriction}},
   :skos/definition "offering of a security (or securities) for sale"})

(def SecurityForm
  {:cmns-av/explanatoryNote
   "Securities are typically issued in one of two forms, registered or bearer. Most securities issued today are in registered form, which enables the issuing firm or registrar to keep records of a security's owner and mail them any dividend, coupon, or other payments. Registered securities may be issued in book entry (digital only) or certificate (physical) form, but most today are entirely digital.",
   :db/ident :fibo-sec-sec-iss/SecurityForm,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/"},
   :rdfs/label "security form",
   :rdfs/subClassOf #{:fibo-fnd-agr-ctr/ContractDocument
                      {:owl/onProperty     :fibo-fnd-rel-rel/exemplifies,
                       :owl/someValuesFrom :fibo-fnd-acc-aeq/FinancialAsset,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                       :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                       :rdf/type           :owl/Restriction}},
   :skos/definition "nature of the proof of ownership of a security"})

(def SecurityOfferingDistributionType
  {:db/ident :fibo-sec-sec-iss/SecurityOfferingDistributionType,
   :owl/equivalentClass {:owl/oneOf [{:rdf/value "primary"}
                                     {:rdf/value "secondary"}],
                         :rdf/type  :rdfs/Datatype},
   :rdf/type :rdfs/Datatype,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/"},
   :rdfs/label "security offering distribution type",
   :skos/definition
   "the type of distribution for a securities offering, including (1) primary offering - the original sale of a company's securities, in which the proceeds from the sale are received directly by the company, and (2) secondary offering - an offering of a security that has been issued previously"})

(def SecurityUnderwriter
  {:cmns-av/adaptedFrom
   {:rdf/value
    "Section 3a of the Investment Company Act of 1940 as amended in January, 2012, https://www.sec.gov/about/laws/ica40.pdf"},
   :db/ident :fibo-sec-sec-iss/SecurityUnderwriter,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/"},
   :rdfs/label "security underwriter",
   :rdfs/subClassOf
   #{{:owl/onProperty     :cmns-rlcmp/isPlayedBy,
      :owl/someValuesFrom {:owl/onProperty :cmns-pts/isAPartyTo,
                           :owl/someValuesFrom
                           :fibo-sec-sec-iss/SecuritiesOffering,
                           :rdf/type :owl/Restriction},
      :rdf/type           :owl/Restriction} :fibo-fbc-pas-fpas/ThirdPartyAgent
     :fibo-fbc-fct-fse/Underwriter
     {:owl/onProperty     :cmns-rlcmp/isPlayedBy,
      :owl/someValuesFrom {:owl/onProperty :cmns-pts/isAPartyTo,
                           :owl/someValuesFrom
                           :fibo-sec-sec-iss/SecurityUnderwritingArrangement,
                           :rdf/type :owl/Restriction},
      :rdf/type           :owl/Restriction}
     :fibo-fnd-agr-ctr/ContractThirdParty},
   :skos/definition
   "party that has purchased from an issuer with a view to, or sells for an issuer in connection with, the distribution of any security, or participates or has a direct or indirect participation in any such undertaking, or participates or has a participation in the direct or indirect underwriting of any such undertaking"})

(def SecurityUnderwritingArrangement
  {:cmns-av/adaptedFrom
   {:rdf/value
    "Barron's Dictionary of Business and Economics Terms, Fifth Edition, 2012"},
   :cmns-av/explanatoryNote
   "Sales may be made either directly or through third-party dealers.",
   :db/ident :fibo-sec-sec-iss/SecurityUnderwritingArrangement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/"},
   :rdfs/label "security underwriting arrangement",
   :rdfs/subClassOf #{:fibo-fbc-fct-fse/UnderwritingArrangement
                      {:owl/onProperty :cmns-pts/hasPartyRole,
                       :owl/someValuesFrom
                       :fibo-sec-sec-iss/SecurityUnderwriter,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "underwriting agreement between an organization (typically an investment bank) and a securities issuer that commits the underwriter to assuming risk involved in buying a new issue of securities and reselling it to the public"})

(def hasActualClosingDate
  {:db/ident :fibo-sec-sec-iss/hasActualClosingDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/"},
   :rdfs/label "has actual closing date",
   :rdfs/range :cmns-dt/ExplicitDate,
   :rdfs/subPropertyOf :cmns-dt/hasDate,
   :skos/definition
   "indicates the date on which an offering or transaction officially closes, in contrast with an intended closing date"})

(def hasAnnouncementDate
  {:cmns-av/explanatoryNote
   "An announcement date may also refer to the release of a corporate event or new financial news, such as interest rate changes or earnings reports.",
   :db/ident :fibo-sec-sec-iss/hasAnnouncementDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/"},
   :rdfs/label "has announcement date",
   :rdfs/range :cmns-dt/Date,
   :rdfs/subPropertyOf :cmns-dt/hasDate,
   :skos/definition
   "indicates the first day the public will receive information regarding a new security issue"})

(def hasFinancialInstrumentShortName
  {:cmns-av/adaptedFrom
   {:rdf/value
    "ISO 18774:2015(E), Securities and related financial instruments - Financial Instrument Short Name (FISN)"},
   :db/ident :fibo-sec-sec-iss/hasFinancialInstrumentShortName,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-fi-fi/FinancialInstrument,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/"},
   :rdfs/label "has financial instrument short name",
   :rdfs/range :fibo-sec-sec-iss/FinancialInstrumentShortName,
   :rdfs/subPropertyOf :cmns-id/isIdentifiedBy,
   :skos/definition
   "relates a security to its ISO 18774-compliant short name, which includes an issuer short name, abbreviated instrument characteristics, and abbreviated instrument description per the ISO standard"})

(def hasFirstTradeDate
  {:db/ident :fibo-sec-sec-iss/hasFirstTradeDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/"},
   :rdfs/label "has first trade date",
   :rdfs/range :cmns-dt/ExplicitDate,
   :rdfs/subPropertyOf :cmns-dt/hasDate,
   :skos/definition
   "indicates the date on which a newly issued security starts trading"})

(def hasFirstTradeSettlementDate
  {:db/ident :fibo-sec-sec-iss/hasFirstTradeSettlementDate,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/"},
   :rdfs/label "has first trade settlement date",
   :rdfs/range :cmns-dt/Date,
   :skos/definition
   "indicates the date on which the first trade of a newly issued security is settled"})

(def hasInstrumentDescription
  {:cmns-av/adaptedFrom
   {:rdf/value
    "ISO 18774:2015(E), Securities and related financial instruments - Financial Instrument Short Name (FISN)"},
   :db/ident :fibo-sec-sec-iss/hasInstrumentDescription,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain {:owl/unionOf [:fibo-fbc-fi-fi/FinancialInstrument
                               :fibo-sec-sec-iss/FinancialInstrumentShortName],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/"},
   :rdfs/label "has instrument description",
   :rdfs/range :xsd/string,
   :skos/definition
   "relates a financial instrument or FISN to an ISO 18774-compliant instrument description, that is, a collection of characteristics and attributes defining a financial instrument with a maximum length up to 19 alphanumeric characters"})

(def hasIssuerShortName
  {:cmns-av/adaptedFrom
   {:rdf/value
    "ISO 18774:2015(E), Securities and related financial instruments - Financial Instrument Short Name (FISN)"},
   :db/ident :fibo-sec-sec-iss/hasIssuerShortName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain {:owl/unionOf [:fibo-fbc-fi-fi/Issuer
                               :fibo-sec-sec-iss/FinancialInstrumentShortName],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/"},
   :rdfs/label "has issuer short name",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/hasFormalName,
   :skos/definition
   "relates a security issuer or FISN to an ISO 18774-compliant issuer short name, that is, an abbreviation of the official issuer name, limited to a maximum of 15 alphanumeric characters"})

(def hasSeries
  {:db/ident :fibo-sec-sec-iss/hasSeries,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/"},
   :rdfs/label "has series",
   :rdfs/range :xsd/string,
   :skos/definition
   "indicates the series identified by the issuer in the event that the instrument is issued in several series (also known as tranches)"})

(def hasSubscriptionAmount
  {:db/ident :fibo-sec-sec-iss/hasSubscriptionAmount,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/"},
   :rdfs/label "has subscription amount",
   :rdfs/range :xsd/integer,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasAmount,
   :skos/definition "indicates a number of shares or units"})

(def hasSubscriptionPeriod
  {:db/ident :fibo-sec-sec-iss/hasSubscriptionPeriod,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/"},
   :rdfs/label "has subscription period",
   :rdfs/range :cmns-dt/DatePeriod,
   :rdfs/subPropertyOf :cmns-dt/hasDatePeriod,
   :skos/definition
   "indicates a period of time in which investors can commit to purchase shares (or units) to be issued"})

(def isIssuedInForm
  {:db/ident :fibo-sec-sec-iss/isIssuedInForm,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-fi-fi/Security,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/"},
   :rdfs/label "is issued in form",
   :rdfs/range :fibo-sec-sec-iss/SecurityForm,
   :rdfs/subPropertyOf #{:fibo-fnd-agr-ctr/isEvidencedBy
                         :fibo-fnd-rel-rel/isExemplifiedBy},
   :skos/definition
   "indicates the form in which the security is issued, typically in registered form"})

(def isOverAllotted
  {:db/ident :fibo-sec-sec-iss/isOverAllotted,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/"},
   :rdfs/label "is over-allotted",
   :rdfs/range :xsd/boolean,
   :skos/definition
   "indicates whether or not the subscription is over-subscribed"})

(def isRegisteredWith
  {:db/ident :fibo-sec-sec-iss/isRegisteredWith,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-fi-fi/Security,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/"},
   :rdfs/label "is registered",
   :rdfs/range :fibo-fbc-fct-ra/RegistrationAuthority,
   :rdfs/subPropertyOf :fibo-fbc-fct-ra/isRegisteredBy,
   :skos/definition
   "indicates the registration authority for a given security, i.e., in the name of the owner on the books of the issuer, with the issuer's registrar, with a third-party transfer agent, with a broker-dealer, or other competent party"})

(def isUnderwrittenBy
  {:db/ident :fibo-sec-sec-iss/isUnderwrittenBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-sec-iss/SecuritiesOffering,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/"},
   :rdfs/label "is underwritten by",
   :rdfs/range :fibo-fbc-fct-fse/Underwriter,
   :skos/definition
   "relates an offering to an underwriter involved in raising capital for or distributing the instruments that are the subject of the offering"})

(def specifiesConversionInto
  {:db/ident :fibo-sec-sec-iss/specifiesConversionInto,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-sec-iss/ConversionTerms,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/"},
   :rdfs/label "specifies conversion into",
   :rdfs/range :fibo-fbc-fi-fi/Security,
   :skos/definition
   "specifies a security that will replace a convertible security under the terms of the agreement"})

(def underwrites
  {:cmns-av/adaptedFrom
   {:xsd/anyURI "http://www.investopedia.com/terms/u/underwriting.asp"},
   :cmns-av/explanatoryNote
   "Underwriting is the process by which investment bankers raise investment capital from investors on behalf of corporations and governments that are issuing either equity or debt securities.",
   :db/ident :fibo-sec-sec-iss/underwrites,
   :owl/inverseOf :fibo-sec-sec-iss/isUnderwrittenBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fbc-fct-fse/Underwriter,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/"},
   :rdfs/label "underwrites",
   :rdfs/range :fibo-sec-sec-iss/SecuritiesOffering,
   :skos/definition
   "identifies one or more underwriters involved in raising capital for or distributing the instruments that are the subject of the offering"})

(def urn:uuid:f2914e0c-1c52-5885-94f8-17b0d83fcd10
  {:cmns-av/copyright
   #{"Copyright (c) 2016-2024 EDM Council, Inc."
     "Copyright (c) 2018-2024 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology defines the fundamental concepts for issuing securities, including securities offering, offering document, offering statement, securities underwriter, prospectus, and so forth.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/RegistrationAuthorities/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/RegulatoryAgencies/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Documents/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/ProductsAndServices/ProductsAndServices/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FunctionalEntities/FinancialServicesEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/ProductsAndServices/FinancialProductsAndServices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/FunctionalEntities/Publishers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Agreements/Agreements/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/LegalEntities/LegalPersons/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Accounting/AccountingEquity/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Law/Jurisdiction/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/BE/OwnershipAndControl/Executives/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FBC/DebtAndEquities/Debt/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Arrangements/Documents/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/SEC/Securities/SecuritiesIssuance/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Securities Issuance Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance.rdf version of the ontology was modified to replace concepts from several FIBO FND ontologies with their counterparts added to the Commons Ontology Library (Commons) v1.1."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/ version of this ontology was modified to add book entry form as a kind of registered security, make registered security a class with two individuals, namely book entry and 'bearer and registered', and clean up definitions to eliminate ambiguity where possible and conform to ISO 704."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/ version of this ontology was modified to clarify the definition of isIssuedInForm."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/ version of this ontology was modified to address text formatting hygiene issues and eliminate dead links."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/ version of this ontology was modified to refactor conversion terms as a child of redemption provision, move redemption provision to financial instruments, and eliminate the unnecessary securities contract terms class."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance.rdf version of this ontology was modified to normalize the representation of security forms (all individuals rather than a mixed representation)."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance.rdf version of the ontology was modified to replace additional concepts from several FIBO FND ontologies with their counterparts added to the Commons Ontology Library (Commons) v1.1."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/ version of this ontology was modified to add the concept of the form the security is issued in, namely bearer or registered."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/ version of this ontology was modified to eliminate duplication of concepts in LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/ version of this ontology was modified to refine the concept of a securities underwriter."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesIssuance/"})