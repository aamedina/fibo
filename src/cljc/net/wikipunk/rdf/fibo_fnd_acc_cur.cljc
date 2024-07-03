(ns net.wikipunk.rdf.fibo-fnd-acc-cur
  {:cmns-av/copyright #{"Copyright (c) 2013-2023 Object Management Group, Inc."
                        "Copyright (c) 2013-2023 EDM Council, Inc."},
   :cmns-av/directSource
   #{"ISO 4217 Codes for the representation of currencies and funds, Seventh edition, 2008-07-15"
     "ISO 4217 Codes for the representation of currencies and funds, Eighth edition, 2015-08-01"},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Accounting/CurrencyAmount/",
   :dcterms/abstract
   "This ontology defines currency and monetary amount related concepts for use in defining other FIBO ontology elements. There are two distinct kinds of concepts that correspond to money and amounts: a concrete, actual amount of money, and the monetary measure of something denominated in some currency. These are dimensionally the same but whereas 'money amount' is defined as an amount of money, 'monetary amount' is an abstract monetary measure.\n\nThe definition of currency provided herein is compliant with the definitions given in ISO 4217. ISO 4217 provides universally applicable coded representations of names of currencies and funds, used internationally for financial transaction support. The ontology has been partitioned into 2 parts: (1) the essential concept system describing the standard (this module), and (2) ISO4217-1-CurrencyCodes, which contains all of the individuals specified in ISO 4217.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cds" "https://www.omg.org/spec/Commons/CodesAndCodeSets/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-doc" "https://www.omg.org/spec/Commons/Documents/",
    "cmns-dsg" "https://www.omg.org/spec/Commons/Designators/",
    "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
    "cmns-qtu" "https://www.omg.org/spec/Commons/QuantitiesAndUnits/",
    "cmns-txt" "https://www.omg.org/spec/Commons/TextDatatype/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/Documents/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/QuantitiesAndUnits/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/CodesAndCodeSets/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/TextDatatype/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Accounting/CurrencyAmount/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fnd-acc-cur",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
   :rdfs/label "Currency Amount Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount.rdf version of the ontology was modified to eliminate deprecations that are more than 6 months old."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/ version of this ontology was modified to eliminate hygiene errors with respect to text formatting."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/ version of this ontology was modified to correct the explanatory note on currency identifier."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/ version of this ontology was modified to eliminate deprecated elements."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/ version of this ontology was modified to move the definition of precious metal and the corresponding identifier to this ontology from Products and Services to simplify imports in cases where the broader definitions for commodities are not required and deprecated isTenderIn, given that we have used the property isUsedBy for this purpose in the currency codes themselves."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/ version of this ontology was modified to use the generic statistical measures and measurements now in FND."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/ version of this ontology was modified to add a restriction to indicate the currency on percentage monetary amount, make currency a subclass of unit of measure, and deprecate the notion of monetary measure, which is more about monetary policy and was incorrectly used in a few places, and is out of scope for our current set of use cases."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/ version of this ontology was modified to replace a redundant concept, calculation formula with formula."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/ version of this ontology was modified to improve definitions for notional amount and currency identifier."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/ version of this ontology was modified to loosen a restriction on currency to allow for more than one numeric currency code, which was necessitated by the October 2021 update to the ISO currency code definitions."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/ version of this ontology was modified to eliminate duplication with concepts in LCC, dependencies on a couple of ontologies that were unnecessary, eliminate references to external dictionary sites that no longer resolve, clean up ambiguity in definitions, eliminate a redundant property, and add unit price."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount.rdf version of this ontology was modified to include several classes to support automated inclusion of all ISO 4217 codes published as of 2018-06-04, and to revise definitions per the eighth edition of the specification."
     "The FIBO FND 1.0 (https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount.rdf) version of this ontology was modified per the additions introduced in the FIBO FBC RFC and related issue resolutions identified in the FIBO FND 1.1 RTF report and https://spec.edmcouncil.org/fibo/ontology/FND/1.0/AboutFND-1.1/, including adding support for ISO 4217 currency codes."
     "The FIBO FND 1.1 (https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount.rdf) version of this ontology was modified per FIBO 2.0 RFC, including the addition of a new hasMonetaryAmount property as a superproperty of others required by various FIBO domain teams and integration with LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount.rdf version of this ontology was modified to tease out the distinction between the nominal and notional amount, which were confused (DER-127) and to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."},
   :skos/editorialNote
   "(1) The present version of the ontology covers the English sections of the ISO 4217 standard only, and (2) UTF-8 character encodings are employed in names in the currency codes ontology to support the broadest number of tools.",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/"})

(def AmountOfMoney
  {:cmns-av/synonym "cash",
   :db/ident :fibo-fnd-acc-cur/AmountOfMoney,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/"},
   :rdfs/label "amount of money",
   :rdfs/subClassOf #{{:owl/onClass    :fibo-fnd-acc-cur/Currency,
                       :owl/onProperty :fibo-fnd-acc-cur/hasCurrency,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      :cmns-qtu/ScalarQuantityValue},
   :skos/definition "amount of readily available cash in banknotes and coins",
   :skos/editorialNote
   "This is an actual sum of money, not the measure of a sum of money in monetary units, although it has the same basic properties (decimal number with a currenct unit)."})

(def CalculatedPrice
  {:db/ident :fibo-fnd-acc-cur/CalculatedPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/"},
   :rdfs/label "calculated price",
   :rdfs/subClassOf #{{:owl/onClass    :cmns-qtu/Expression,
                       :owl/onProperty :cmns-qtu/hasExpression,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      :fibo-fnd-acc-cur/MonetaryPrice},
   :skos/definition "monetary price determined by a formula"})

(def Currency
  {:cmns-av/synonym #{"monetary unit" "currency unit"},
   :db/ident :fibo-fnd-acc-cur/Currency,
   :fibo-fnd-utl-av/definitionOrigin
   "Codes for the representation of currencies and funds, ISO 4217, Eighth edition, 2015-08-01, section 3.2",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/"},
   :rdfs/label "currency",
   :rdfs/subClassOf #{{:owl/maxQualifiedCardinality 1,
                       :owl/onDataRange :xsd/string,
                       :owl/onProperty  :fibo-fnd-acc-cur/hasMinorUnit,
                       :rdf/type        :owl/Restriction}
                      :cmns-qtu/MeasurementUnit
                      {:owl/onProperty     :cmns-cxtdsg/isUsedBy,
                       :owl/someValuesFrom :lcc-cr/GeopoliticalEntity,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :fibo-fnd-rel-rel/hasTextualName,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :fibo-fnd-acc-cur/hasNumericCode,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "medium of exchange value, defined by reference to the geographical location of the monetary authorities responsible for it"})

(def CurrencyBasket
  {:db/ident :fibo-fnd-acc-cur/CurrencyBasket,
   :fibo-fnd-utl-av/definitionOrigin
   "Codes for the representation of currencies and funds, ISO 4217, Eighth edition, 2015-08-01, section 3.2",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/"},
   :rdfs/label "currency basket",
   :rdfs/subClassOf #{{:owl/onProperty     :cmns-col/hasConstituent,
                       :owl/someValuesFrom :fibo-fnd-acc-cur/Currency,
                       :rdf/type           :owl/Restriction}
                      :cmns-col/StructuredCollection},
   :skos/definition
   "selected group of currencies, in which the weighted average is used as a measure of the value or the amount of an obligation",
   :skos/note
   "A currency basket functions as a benchmark for regional currency movements; its composition and weighting depends on its purpose."})

(def CurrencyIdentifier
  {:cmns-av/adaptedFrom
   {:rdf/value
    "Codes for the representation of currencies and funds, ISO 4217, Eighth edition, 2015-08-01, section 3.2"},
   :cmns-av/explanatoryNote
   "The first (left-most) two characters of the ISO 4217 3-letter currency identifier relate to the currency authority that issues the currency, and is, in most cases the ISO 3166-1 alpha 2 code for the geopolitical entity whose central bank is the issuer. The third (right-most) character of the identifier (alphabetic code) is an indicator derived from the name of the major currency unit or fund. If the currency is not associated with a single geographical entity as described in ISO 3166-1, typically a specially allocated identifier (alpha-2 code) is used to describe the currency authority. This code has been allocated by the Maintenance Agency from within the user-assigned range of codes XA to XZ specified in 8.1.3 of ISO 3166-1:2013. The character following X will be a mnemonic, where possible, derived from the name of the geographical area concerned.",
   :db/ident :fibo-fnd-acc-cur/CurrencyIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/"},
   :rdfs/label "currency identifier",
   :rdfs/subClassOf #{:cmns-id/Identifier
                      {:owl/onDataRange :xsd/string,
                       :owl/onProperty  :fibo-fnd-rel-rel/hasTag,
                       :owl/qualifiedCardinality 1,
                       :rdf/type        :owl/Restriction} :cmns-cds/CodeElement
                      {:owl/onProperty     :cmns-id/identifies,
                       :owl/someValuesFrom :fibo-fnd-acc-cur/Currency,
                       :rdf/type           :owl/Restriction}},
   :skos/definition "sequence of characters representing some currency"})

(def ExchangeRate
  {:db/ident :fibo-fnd-acc-cur/ExchangeRate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/"},
   :rdfs/label "exchange rate",
   :rdfs/subClassOf #{{:owl/onClass    :fibo-fnd-acc-cur/Currency,
                       :owl/onProperty :fibo-fnd-acc-cur/hasDealtCurrency,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      {:owl/onDataRange :xsd/decimal,
                       :owl/onProperty  :fibo-fnd-acc-cur/hasRateValue,
                       :owl/qualifiedCardinality 1,
                       :rdf/type        :owl/Restriction} :cmns-qtu/Ratio
                      {:owl/onClass    :fibo-fnd-acc-cur/Currency,
                       :owl/onProperty :fibo-fnd-acc-cur/hasBaseCurrency,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}},
   :skos/definition "rate at which one currency can be exchanged for another",
   :skos/example
   "The exchange rate between the U.S. dollar and British pound is distinct from the exchange rate between the U.S. dollar and the euro."})

(def Funds
  {:db/ident :fibo-fnd-acc-cur/Funds,
   :fibo-fnd-utl-av/definitionOrigin
   "Codes for the representation of currencies and funds, ISO 4217, Eighth edition, 2015-08-01, section 3.3",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/"},
   :rdfs/label "funds",
   :rdfs/subClassOf #{{:owl/onClass    :fibo-fnd-acc-cur/Currency,
                       :owl/onProperty :fibo-fnd-acc-cur/hasCurrency,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      :fibo-fnd-acc-cur/Currency},
   :skos/definition
   "artificial currency used as calculation basis for another currency(s) and accounting purposes"})

(def FundsIdentifier
  {:cmns-av/adaptedFrom
   {:rdf/value
    "Codes for the representation of currencies and funds, ISO 4217, Eighth edition, 2015-08-01, section 3.2"},
   :db/ident :fibo-fnd-acc-cur/FundsIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/"},
   :rdfs/label "funds identifier",
   :rdfs/subClassOf #{:cmns-id/Identifier
                      {:owl/onDataRange :xsd/string,
                       :owl/onProperty  :fibo-fnd-rel-rel/hasTag,
                       :owl/qualifiedCardinality 1,
                       :rdf/type        :owl/Restriction} :cmns-cds/CodeElement
                      {:owl/onProperty     :cmns-id/identifies,
                       :owl/someValuesFrom :fibo-fnd-acc-cur/Funds,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "sequence of characters that can be used to uniquely identify funds"})

(def InterestRate
  {:cmns-av/explanatoryNote
   "Interest rates are typically noted on an annual basis, known as the annual percentage rate (APR). The assets borrowed could include cash, consumer goods, and large assets such as a vehicle or building. The rate is derived by dividing the amount of interest by the amount of principal borrowed. Interest rates are quoted on bills, notes, bonds, credit cards, and many kinds of consumer and business loans.",
   :db/ident :fibo-fnd-acc-cur/InterestRate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/"},
   :rdfs/label "interest rate",
   :rdfs/subClassOf #{:fibo-fnd-acc-cur/PercentageMonetaryAmount
                      {:owl/onDataRange :xsd/decimal,
                       :owl/onProperty  :fibo-fnd-acc-cur/hasRateValue,
                       :owl/qualifiedCardinality 1,
                       :rdf/type        :owl/Restriction}},
   :skos/definition
   "amount charged, expressed as a percentage of principal, in exchange for the use of assets"})

(def MonetaryAmount
  {:db/ident :fibo-fnd-acc-cur/MonetaryAmount,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/"},
   :rdfs/label "monetary amount",
   :rdfs/subClassOf #{{:owl/onDataRange :xsd/decimal,
                       :owl/onProperty  :fibo-fnd-acc-cur/hasAmount,
                       :owl/qualifiedCardinality 1,
                       :rdf/type        :owl/Restriction}
                      {:owl/onClass    :fibo-fnd-acc-cur/Currency,
                       :owl/onProperty :fibo-fnd-acc-cur/hasCurrency,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      :cmns-qtu/ScalarQuantityValue},
   :skos/definition
   "measure that is an amount of money specified in monetary units"})

(def MonetaryPrice
  {:cmns-av/explanatoryNote
   "As the consideration given in exchange for transfer of ownership, price forms the essential basis of commercial transactions. It may be fixed by a contract, left to be determined by an agreed upon formula at a future date, or discovered or negotiated during the course of dealings between the parties involved. In commerce, price is determined by what (1) a buyer is willing to pay, (2) a seller is willing to accept, and (3) the competition is allowing to be charged.",
   :db/ident :fibo-fnd-acc-cur/MonetaryPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/"},
   :rdfs/label "monetary price",
   :rdfs/subClassOf #{:fibo-fnd-acc-cur/MonetaryAmount :fibo-fnd-acc-cur/Price},
   :skos/definition "price that that is expressed as a monetary amount"})

(def PercentageMonetaryAmount
  {:db/ident :fibo-fnd-acc-cur/PercentageMonetaryAmount,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/"},
   :rdfs/label "percentage monetary amount",
   :rdfs/subClassOf #{{:owl/onClass    :fibo-fnd-acc-cur/Currency,
                       :owl/onProperty :fibo-fnd-acc-cur/hasCurrency,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction} :cmns-qtu/Percentage},
   :skos/definition
   "measure of some amount of money expressed as a percentage of some other amount, some notional amount or some concrete money amount"})

(def PreciousMetal
  {:db/ident :fibo-fnd-acc-cur/PreciousMetal,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/"},
   :rdfs/label "precious metal",
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fnd-rel-rel/hasTextualName,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onDataRange :xsd/string,
                       :owl/onProperty  :fibo-fnd-acc-cur/hasNumericCode,
                       :owl/qualifiedCardinality 1,
                       :rdf/type        :owl/Restriction}},
   :skos/definition
   "metal that is considered to be rare and/or have a high economic value"})

(def PreciousMetalIdentifier
  {:db/ident :fibo-fnd-acc-cur/PreciousMetalIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/"},
   :rdfs/label "precious metal identifier",
   :rdfs/subClassOf #{:cmns-id/Identifier
                      {:owl/onDataRange :xsd/string,
                       :owl/onProperty  :fibo-fnd-rel-rel/hasTag,
                       :owl/qualifiedCardinality 1,
                       :rdf/type        :owl/Restriction} :cmns-cds/CodeElement
                      {:owl/onProperty     :cmns-id/identifies,
                       :owl/someValuesFrom :fibo-fnd-acc-cur/PreciousMetal,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "sequence of characters uniquely identifying the precious metal in some context"})

(def Price
  {:db/ident :fibo-fnd-acc-cur/Price,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/"},
   :rdfs/label "price",
   :rdfs/subClassOf :cmns-qtu/ScalarQuantityValue,
   :skos/definition
   "amount of money, goods, or services requested, expected, required, or given in exchange for something else"})

(def UnitOfAccount
  {:db/ident :fibo-fnd-acc-cur/UnitOfAccount,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/"},
   :rdfs/label "unit of account",
   :rdfs/subClassOf :fibo-fnd-acc-cur/Currency,
   :skos/definition
   "nominal monetary unit of measure used to represent the real value (or cost) of any economic item; i.e. goods, services, assets, liabilities, income, expenses"})

(def UnitOfAccountIdentifier
  {:db/ident :fibo-fnd-acc-cur/UnitOfAccountIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/"},
   :rdfs/label "unit of account identifier",
   :rdfs/subClassOf #{:cmns-id/Identifier
                      {:owl/onDataRange :xsd/string,
                       :owl/onProperty  :fibo-fnd-rel-rel/hasTag,
                       :owl/qualifiedCardinality 1,
                       :rdf/type        :owl/Restriction} :cmns-cds/CodeElement
                      {:owl/onProperty     :cmns-id/identifies,
                       :owl/someValuesFrom :fibo-fnd-acc-cur/UnitOfAccount,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "sequence of characters that can be used to uniquely identify a nominal monetary unit"})

(def UnitPrice
  {:db/ident :fibo-fnd-acc-cur/UnitPrice,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/"},
   :rdfs/label "unit price",
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fnd-acc-cur/isPriceFor,
                       :owl/someValuesFrom :owl/Thing,
                       :rdf/type           :owl/Restriction}
                      :fibo-fnd-acc-cur/MonetaryPrice},
   :skos/definition
   "monetary price expressed in relation to a well-known measurable unit by which the goods or services are allocated",
   :skos/example
   "For example, gold is commonly measured in troy ounces, grams, etc., and oil is measured in terms of barrels."})

(def hasAmount
  {:db/ident :fibo-fnd-acc-cur/hasAmount,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/"},
   :rdfs/label "has amount",
   :rdfs/range :xsd/decimal,
   :rdfs/subPropertyOf :cmns-qtu/hasNumericValue,
   :skos/definition "total number or quantity"})

(def hasBaseCurrency
  {:db/ident :fibo-fnd-acc-cur/hasBaseCurrency,
   :rdf/type #{:owl/ObjectProperty :owl/InverseFunctionalProperty},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/"},
   :rdfs/label "has base currency",
   :rdfs/range :fibo-fnd-acc-cur/Currency,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasCurrency,
   :skos/definition
   "specifies a unit of currency representing R units of the dealt currency, where R is the exchange rate value, in an exchange rate"})

(def hasCurrency
  {:db/ident :fibo-fnd-acc-cur/hasCurrency,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/"},
   :rdfs/label "has currency",
   :rdfs/range :fibo-fnd-acc-cur/Currency,
   :rdfs/subPropertyOf :cmns-qtu/hasMeasurementUnit,
   :skos/definition
   "specifies the medium of exchange value in which something, such as a monetary amount is denominated"})

(def hasDealtCurrency
  {:db/ident :fibo-fnd-acc-cur/hasDealtCurrency,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/"},
   :rdfs/label "has dealt currency",
   :rdfs/range :fibo-fnd-acc-cur/Currency,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasCurrency,
   :skos/definition
   "specifies a unit of currency representing the exchanged (target) currency in an exchange rate; R units of this currency represent one unit of the base currency"})

(def hasFundsType
  {:db/ident :fibo-fnd-acc-cur/hasFundsType,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-fnd-acc-cur/Funds,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/"},
   :rdfs/label "has funds type",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :cmns-txt/hasTextValue,
   :skos/definition
   "indicates the type of funds, such as next day for US funds"})

(def hasMinorUnit
  {:db/ident :fibo-fnd-acc-cur/hasMinorUnit,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/"},
   :rdfs/label "has minor unit",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :cmns-txt/hasTextValue,
   :skos/definition
   "relates a code for the minor unit of currency to the currency or fund",
   :skos/scopeNote
   "Requirements sometimes arise for values to be expressed in terms of minor units of currency. When this occurs, it is necessary to know the decimal relationship that exists between the currency concerned and its minor unit. \n- 0 means that there is no minor unit for the currency; \n- 1, 2, and 3 signify a ratio of 10 to 1, 100 to 1 and 1000 to 1 respectively."})

(def hasMonetaryAmount
  {:db/ident :fibo-fnd-acc-cur/hasMonetaryAmount,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/"},
   :rdfs/label "has monetary amount",
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :rdfs/subPropertyOf :cmns-qtu/hasQuantityValue,
   :skos/definition
   "specifies a value for something in terms of an amount of money and the currency in which it is denoted"})

(def hasNotionalAmount
  {:cmns-av/adaptedFrom
   {:rdf/value
    "ISO 10962:2019, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, 2019-10, clause 6.8.2"},
   :cmns-av/explanatoryNote
   #{"The notional amount (or notional principal amount or notional value) on a financial instrument is typically the face amount used to calculate payments made on that instrument. This amount generally does not change and is thus referred to as notional.\n\t\t\n\t\tWhen applied to a swap this is the amount used for calculating the actual value of the interest due. Also known as notional value when describing derivative contracts in the options, futures, and currency markets, this term is often used to value the underlying asset in a derivatives trade. It can be the total value of a position, how much value a position controls, or an agreed-upon amount in a contract.\n\n\t\tAn example is that a firm might have a variable rate loan on $100,000 but decide to swap only $40,000. The $40,000 is the notional amount of the swap and becomes the amount on which interest is paid."
     "For certain kinds of derivative instruments, including but not limited to swaps, the notional amount indicates face amount of a swap upon which the payment streams for that swap are based. While this is typically constant throughout the lifetime of a contract, it can be accreting, amortizing, or custom, such as in the case of a notional step schedule."},
   :db/ident :fibo-fnd-acc-cur/hasNotionalAmount,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/"},
   :rdfs/label "has notional amount",
   :rdfs/range :fibo-fnd-acc-cur/MonetaryAmount,
   :rdfs/subPropertyOf :fibo-fnd-acc-cur/hasMonetaryAmount,
   :skos/definition
   "has a generally unchangeable value used for certain calculations, expressed as some monetary amount"})

(def hasNumericCode
  {:db/ident :fibo-fnd-acc-cur/hasNumericCode,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/"},
   :rdfs/label "has numeric code",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :cmns-txt/hasTextValue,
   :skos/definition
   "relates a numeric code to something, such as a currency or fund",
   :skos/scopeNote
   "In the case of currency codes, the numeric currency code is derived, where possible, from the United Nations Standard Country or Area Code. Additional codes to meet special requirements (as described in 5.1.3) and in respect of funds will be allocated as necessary from within the user-assigned range of codes 950 to 998. Funds codes are allocated in descending order commencing at 998."})

(def hasPrice
  {:db/ident :fibo-fnd-acc-cur/hasPrice,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/"},
   :rdfs/label "has price",
   :rdfs/range :fibo-fnd-acc-cur/Price,
   :rdfs/subPropertyOf :cmns-qtu/hasQuantityValue,
   :skos/definition
   "indicates the value of something expressed as an amount of money or goods"})

(def hasRateValue
  {:db/ident :fibo-fnd-acc-cur/hasRateValue,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/"},
   :rdfs/label "has rate value",
   :rdfs/range :xsd/decimal,
   :rdfs/subPropertyOf :cmns-qtu/hasNumericValue,
   :skos/definition
   "has a value for a rate expressed as a number (may be a percentage or raw number)"})

(def isPriceFor
  {:db/ident :fibo-fnd-acc-cur/isPriceFor,
   :owl/inverseOf :fibo-fnd-acc-cur/hasPrice,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-acc-cur/Price,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/"},
   :rdfs/label "is price for",
   :rdfs/subPropertyOf :cmns-doc/refersTo,
   :skos/definition "links a price to something it provides a value for"})

(def urn:uuid:545dce16-de25-55b4-9c31-2389620d6236
  {:cmns-av/copyright #{"Copyright (c) 2013-2023 Object Management Group, Inc."
                        "Copyright (c) 2013-2023 EDM Council, Inc."},
   :cmns-av/directSource
   #{"ISO 4217 Codes for the representation of currencies and funds, Seventh edition, 2008-07-15"
     "ISO 4217 Codes for the representation of currencies and funds, Eighth edition, 2015-08-01"},
   :dcterms/abstract
   "This ontology defines currency and monetary amount related concepts for use in defining other FIBO ontology elements. There are two distinct kinds of concepts that correspond to money and amounts: a concrete, actual amount of money, and the monetary measure of something denominated in some currency. These are dimensionally the same but whereas 'money amount' is defined as an amount of money, 'monetary amount' is an abstract monetary measure.\n\nThe definition of currency provided herein is compliant with the definitions given in ISO 4217. ISO 4217 provides universally applicable coded representations of names of currencies and funds, used internationally for financial transaction support. The ontology has been partitioned into 2 parts: (1) the essential concept system describing the standard (this module), and (2) ISO4217-1-CurrencyCodes, which contains all of the individuals specified in ISO 4217.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/Documents/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/QuantitiesAndUnits/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/CodesAndCodeSets/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/TextDatatype/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Accounting/CurrencyAmount/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Currency Amount Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount.rdf version of the ontology was modified to eliminate deprecations that are more than 6 months old."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/ version of this ontology was modified to eliminate hygiene errors with respect to text formatting."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/ version of this ontology was modified to correct the explanatory note on currency identifier."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/ version of this ontology was modified to eliminate deprecated elements."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/ version of this ontology was modified to move the definition of precious metal and the corresponding identifier to this ontology from Products and Services to simplify imports in cases where the broader definitions for commodities are not required and deprecated isTenderIn, given that we have used the property isUsedBy for this purpose in the currency codes themselves."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/ version of this ontology was modified to use the generic statistical measures and measurements now in FND."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/ version of this ontology was modified to add a restriction to indicate the currency on percentage monetary amount, make currency a subclass of unit of measure, and deprecate the notion of monetary measure, which is more about monetary policy and was incorrectly used in a few places, and is out of scope for our current set of use cases."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/ version of this ontology was modified to replace a redundant concept, calculation formula with formula."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/ version of this ontology was modified to improve definitions for notional amount and currency identifier."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/ version of this ontology was modified to loosen a restriction on currency to allow for more than one numeric currency code, which was necessitated by the October 2021 update to the ISO currency code definitions."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/ version of this ontology was modified to eliminate duplication with concepts in LCC, dependencies on a couple of ontologies that were unnecessary, eliminate references to external dictionary sites that no longer resolve, clean up ambiguity in definitions, eliminate a redundant property, and add unit price."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount.rdf version of this ontology was modified to include several classes to support automated inclusion of all ISO 4217 codes published as of 2018-06-04, and to revise definitions per the eighth edition of the specification."
     "The FIBO FND 1.0 (https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount.rdf) version of this ontology was modified per the additions introduced in the FIBO FBC RFC and related issue resolutions identified in the FIBO FND 1.1 RTF report and https://spec.edmcouncil.org/fibo/ontology/FND/1.0/AboutFND-1.1/, including adding support for ISO 4217 currency codes."
     "The FIBO FND 1.1 (https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount.rdf) version of this ontology was modified per FIBO 2.0 RFC, including the addition of a new hasMonetaryAmount property as a superproperty of others required by various FIBO domain teams and integration with LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount.rdf version of this ontology was modified to tease out the distinction between the nominal and notional amount, which were confused (DER-127) and to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."},
   :skos/editorialNote
   "(1) The present version of the ontology covers the English sections of the ISO 4217 standard only, and (2) UTF-8 character encodings are employed in names in the currency codes ontology to support the broadest number of tools.",
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/"})