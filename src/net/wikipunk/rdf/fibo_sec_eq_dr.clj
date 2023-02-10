(ns net.wikipunk.rdf.fibo-sec-eq-dr
  "Depositary receipts are certificates which represent ownership of some underlying security. They are issued by a bank and give the holder the ability to participate in the returns on an instrument that they may not be able to hold directly."
  {:cmns-av/copyright ["Copyright (c) 2013-2023 EDM Council, Inc."
                       "Copyright (c) 2013-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/DepositaryReceipts/",
   :dcterms/abstract
   "Depositary receipts are certificates which represent ownership of some underlying security. They are issued by a bank and give the holder the ability to participate in the returns on an instrument that they may not be able to hold directly.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/GovernmentEntities/EuropeanJurisdiction/WesternEuropeGovernmentEntitiesAndJurisdictions/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/GovernmentEntities/EuropeanJurisdiction/EUGovernmentEntitiesAndJurisdictions/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/SecuritiesRestrictions/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/DebtInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/GovernmentEntities/AsianJurisdiction/EasternAsiaGovernmentEntitiesAndJurisdictions/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Securities/SecuritiesClassification/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Equities/EquityInstruments/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Equities/DepositaryReceipts/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-ge-easj"
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/EasternAsiaGovernmentEntitiesAndJurisdictions/",
    "fibo-be-ge-euj"
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EUGovernmentEntitiesAndJurisdictions/",
    "fibo-be-ge-sasj"
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/AsianJurisdiction/SouthernAsiaGovernmentEntitiesAndJurisdictions/",
    "fibo-be-ge-usj"
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/USGovernmentEntitiesAndJurisdictions/",
    "fibo-be-ge-weuj"
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/WesternEuropeGovernmentEntitiesAndJurisdictions/",
    "fibo-fbc-fi-fi"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-sec-dbt-dbti"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/",
    "fibo-sec-eq-dr"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/DepositaryReceipts/",
    "fibo-sec-eq-eq"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/EquityInstruments/",
    "fibo-sec-sec-cls"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesClassification/",
    "fibo-sec-sec-rst"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Securities/SecuritiesRestrictions/",
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/DepositaryReceipts/",
   :rdfa/prefix "fibo-sec-eq-dr",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/DepositaryReceipts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Depositary Receipts"},
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/DepositaryReceipts.rdf version of this ontology was modified to further refine the definition of a depositary receipt, add participatory notes, and broaden explanatory notes to allow for coverage of Chinese ADRs."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/DepositaryReceipts.rdf version of this ontology was modified to expand the definition of a depositary receipt to cover a broader range of securities."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/DepositaryReceipts.rdf version of this ontology was modified to address text formatting hygiene issues."
    "The https://spec.edmcouncil.org/fibo/ontology/Equities/DepositaryReceipts.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
    "The https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/DepositaryReceipts.rdf version of this ontology was modified to add the concept of a Chinese depositary receipt."]})

(def AmericanDepositaryReceipt
  "depositary receipt that represents securities of a foreign company and allows that company's securities to trade in the U.S. financial markets"
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "ADR"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Most ADRs are issued by a domestic custodian bank when the underlying securities are deposited in a foreign depositary bank, usually by a broker who has purchased the securities in the open market local to the foreign company. An ADR can represent a fraction of a share, a single share, or multiple shares of a foreign security. The holder of an ADR has the right to obtain the underlying foreign security that the ADR represents, but investors usually find it more convenient to own the ADR. The price of an ADR generally tracks the price of the foreign security in its home market, adjusted for the ratio of ADRs to foreign company shares. In the case of companies domiciled in the United Kingdom, creation of ADRs attracts a 1.5 percent creation fee; this creation fee is different than stamp duty reserve tax charge by the UK government. Depositary banks have various responsibilities to ADR holders and to the issuing foreign company the ADR represents."},
   :db/ident :fibo-sec-eq-dr/AmericanDepositaryReceipt,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/DepositaryReceipts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "American depositary receipt"},
   :rdfs/subClassOf [{:owl/hasValue   :fibo-be-ge-usj/UnitedStatesJurisdiction,
                      :owl/onProperty :fibo-fbc-fi-fi/isLegallyRecordedIn,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass
                      :fibo-sec-eq-dr/AmericanDepositaryReceiptLevel,
                      :owl/onProperty :lcc-cr/isClassifiedBy,
                      :rdf/type :owl/Restriction}
                     :fibo-sec-eq-dr/DepositaryReceipt],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "depositary receipt that represents securities of a foreign company and allows that company's securities to trade in the U.S. financial markets"},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "For example, Accton Technology is traded on the Taiwanese exchange. In order for Accton Technology to be traded in the United States, Citibank, acting as a domestic custodian bank, purchases shares of Accton Technology and creates a security, ISIN US00437R1032, which can be traded on a U.S. exchange, in this case PORTAL. Note that the depositary shares do not have to equal the number of original shares. In the case of Accton Technology, one depositary share is equivalent to two original shares."}})

(def AmericanDepositaryReceiptLevel
  "classifier for American depositary receipts that categorizes ADRs into levels based on the extent to which the foreign company has access to the U.S. market"
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "ADR level"},
   :db/ident :fibo-sec-eq-dr/AmericanDepositaryReceiptLevel,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/DepositaryReceipts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "American depositary receipt level"},
   :rdfs/subClassOf
   [{:owl/onProperty     :lcc-cr/classifies,
     :owl/someValuesFrom :fibo-sec-eq-dr/AmericanDepositaryReceipt,
     :rdf/type           :owl/Restriction}
    {:owl/onProperty     :fibo-fnd-rel-rel/isDefinedIn,
     :owl/someValuesFrom :fibo-sec-eq-dr/AmericanDepositaryReceiptLevelScheme,
     :rdf/type           :owl/Restriction}
    :fibo-sec-sec-cls/FinancialInstrumentClassifier],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "classifier for American depositary receipts that categorizes ADRs into levels based on the extent to which the foreign company has access to the U.S. market"}})

(def AmericanDepositaryReceiptLevelScheme
  "classifier for American depositary receipts that categorizes ADRs into levels based on the extent to which the foreign company has access to the U.S. market"
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "ADR level"},
   :db/ident :fibo-sec-eq-dr/AmericanDepositaryReceiptLevelScheme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/DepositaryReceipts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "American depositary receipt level scheme"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-rel-rel/defines,
                      :owl/someValuesFrom
                      :fibo-sec-eq-dr/AmericanDepositaryReceiptLevel,
                      :rdf/type :owl/Restriction}
                     :fibo-sec-sec-cls/FinancialInstrumentClassificationScheme],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "classifier for American depositary receipts that categorizes ADRs into levels based on the extent to which the foreign company has access to the U.S. market"}})

(def ChineseDepositaryReceipt
  "global depositary receipt that represents ownership in the securities of a non-Chinese company that trades on a public exchange in China"
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "CDR"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "It refers to shares in non-Chinese companies that trade in China the same way that American depositary receipts (ADRs) allow non-U.S. company shares to trade on American exchanges."},
   :db/ident :fibo-sec-eq-dr/ChineseDepositaryReceipt,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/DepositaryReceipts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Chinese depositary receipt"},
   :rdfs/subClassOf [{:owl/hasValue
                      :fibo-be-ge-easj/JurisdictionOfTheRepublicOfChina,
                      :owl/onProperty :fibo-fbc-fi-fi/isLegallyRecordedIn,
                      :rdf/type :owl/Restriction}
                     :fibo-sec-eq-dr/GlobalDepositaryReceipt],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "global depositary receipt that represents ownership in the securities of a non-Chinese company that trades on a public exchange in China"}})

(def DepositaryReceipt
  "negotiable financial instrument issued by a trust company, security depositary, or bank that is evidence of the deposit of publicly traded securities and that facilitates the ownership of securities traded in other jurisdictions"
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "DR"},
   :cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Depositary receipts are widely used in order to allow the trading of securities in jurisdictions other than\nthe one where the original securities were issued, such as in a local market. Depositary receipts facilitate buying securities in foreign companies, because the securities do not have to leave the home country. They enable domestic investors to buy securities of foreign companies without the accompanying risks or inconveniences of cross-border and cross-currency transactions."},
   :cmns-av/synonym {:rdf/language "en",
                     :rdf/value    "depositary receipt"},
   :db/ident :fibo-sec-eq-dr/DepositaryReceipt,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/DepositaryReceipts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "depositary receipt"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-sec-eq-dr/hasTradedSecurity,
                      :owl/someValuesFrom :fibo-fbc-fi-fi/Security,
                      :rdf/type           :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :xsd/decimal,
                      :owl/onProperty  :fibo-sec-eq-dr/hasMultiplier,
                      :rdf/type        :owl/Restriction}
                     :fibo-fbc-fi-fi/Security],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "negotiable financial instrument issued by a trust company, security depositary, or bank that is evidence of the deposit of publicly traded securities and that facilitates the ownership of securities traded in other jurisdictions"}})

(def EuropeanDepositaryReceipt
  "global depositary receipt that represents ownership in the securities of a non-European company that trades in European financial markets"
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "EDR"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "A European depositary receipt is a European equivalent of the original American depositary receipt (ADR). The EDR is issued by a bank in Europe representing securities traded on an exchange outside of the bank's home country."},
   :db/ident :fibo-sec-eq-dr/EuropeanDepositaryReceipt,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/DepositaryReceipts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "European depositary receipt"},
   :rdfs/subClassOf [{:owl/hasValue   :fibo-be-ge-euj/EuropeanUnionJurisdiction,
                      :owl/onProperty :fibo-fbc-fi-fi/isLegallyRecordedIn,
                      :rdf/type       :owl/Restriction}
                     :fibo-sec-eq-dr/GlobalDepositaryReceipt],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "global depositary receipt that represents ownership in the securities of a non-European company that trades in European financial markets"}})

(def GlobalDepositaryReceipt
  "depositary receipt where a certificate issued by a depositary bank, which purchases securities of foreign companies, creates a security on a local exchange backed by those securities"
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "GDR"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Global depositary receipts are the global equivalent of the original American depositary receipts (ADR) on which they are based. GDRs represent ownership of an underlying number of securities of a foreign company and are commonly used to invest in companies from developing or emerging markets by investors in developed markets."},
   :cmns-av/synonym {:rdf/language "en",
                     :rdf/value    "international depositary receipt"},
   :db/ident :fibo-sec-eq-dr/GlobalDepositaryReceipt,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/DepositaryReceipts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "global depositary receipt"},
   :rdfs/subClassOf :fibo-sec-eq-dr/DepositaryReceipt,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "depositary receipt where a certificate issued by a depositary bank, which purchases securities of foreign companies, creates a security on a local exchange backed by those securities"}})

(def HongKongDepositaryReceipt
  "global depositary receipt that represents the purchase, or ownership, of foreign assets which are deposited in a depositary bank in Hong Kong"
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "HKDR"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "A Hong Kong Depositary Receipt (HDR) is a negotiable instrument issued by a depositary bank that evidences ownership of securities in a corporation organized outside Hong Kong. HDRs trade on the Hong Kong Stock Exchange (HKEx), thus enabling foreign issuers to tap the Hong Kong market and local investors to efficiently invest in quality international companies."},
   :db/ident :fibo-sec-eq-dr/HongKongDepositaryReceipt,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/DepositaryReceipts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Hong Kong depositary receipt"},
   :rdfs/subClassOf [{:owl/hasValue   :fibo-be-ge-easj/JurisdictionOfHongKong,
                      :owl/onProperty :fibo-fbc-fi-fi/isLegallyRecordedIn,
                      :rdf/type       :owl/Restriction}
                     :fibo-sec-eq-dr/GlobalDepositaryReceipt],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "global depositary receipt that represents the purchase, or ownership, of foreign assets which are deposited in a depositary bank in Hong Kong"}})

(def IndianDepositoryReceipt
  "global depositary receipt that represents the purchase, or ownership, of foreign assets which are deposited in a Indian account managed by the Domestic Depository in India"
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "IDR"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "An Indian Depository Receipt (IDR) is an instrument denominated in Indian Rupees in the form of a depositary receipt created by a Domestic Depository (custodian of securities registered with the Securities and Exchange Board of India) against the underlying securities of issuing company to enable foreign companies to raise funds from the Indian securities Markets."},
   :db/ident :fibo-sec-eq-dr/IndianDepositoryReceipt,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/DepositaryReceipts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Indian depositary receipt"},
   :rdfs/seeAlso ["https://en.wikipedia.org/wiki/Indian_Depository_Receipt"],
   :rdfs/subClassOf [{:owl/hasValue   :fibo-be-ge-sasj/JurisdictionOfIndia,
                      :owl/onProperty :fibo-fbc-fi-fi/isLegallyRecordedIn,
                      :rdf/type       :owl/Restriction}
                     :fibo-sec-eq-dr/GlobalDepositaryReceipt],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "global depositary receipt that represents the purchase, or ownership, of foreign assets which are deposited in a Indian account managed by the Domestic Depository in India"}})

(def JapaneseDepositaryReceipt
  "global depositary receipt that represents the purchase, or ownership, of foreign assets which are deposited in a trust bank in Japan"
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "JDR"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "A Japanese Depositary Receipt (JDR) is an instrument issued by a trust bank in Japan that evidences ownership of securities in a corporation organized outside Japan. JDRs trade on the Tokyo Stock Exchange (TSE) in yen, and in accordance with Japanese market conventions, enabling foreign issuers to tap the Japanese capital market and local investors to efficiently invest in quality international companies."},
   :db/ident :fibo-sec-eq-dr/JapaneseDepositaryReceipt,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/DepositaryReceipts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Japanese depositary receipt"},
   :rdfs/subClassOf [{:owl/hasValue   :fibo-be-ge-easj/JurisdictionOfJapan,
                      :owl/onProperty :fibo-fbc-fi-fi/isLegallyRecordedIn,
                      :rdf/type       :owl/Restriction}
                     :fibo-sec-eq-dr/GlobalDepositaryReceipt],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "global depositary receipt that represents the purchase, or ownership, of foreign assets which are deposited in a trust bank in Japan"}})

(def LevelIAmericanDepositaryReceipt
  "American Depositary Receipt level indicating that the ADR can only be traded over-the-counter in the U.S."
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "Level I ADR"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "This level can apply to sponsored and unsponsored ADRs. However, this is the only level available for unsponsored ADRs. A Level I ADR is easier to set up for foreign companies since it does not require the same disclosures or the need to abide by generally accepted accounting principles (GAAP). There is some degree of risk with Level I ADRs given their relative lack of transparency."},
   :db/ident :fibo-sec-eq-dr/LevelIAmericanDepositaryReceipt,
   :rdf/type [:fibo-sec-eq-dr/AmericanDepositaryReceiptLevel
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/DepositaryReceipts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Level I American depositary receipt"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "American Depositary Receipt level indicating that the ADR can only be traded over-the-counter in the U.S."}})

(def LevelIIAmericanDepositaryReceipt
  "American Depositary Receipt level that is sponsored and can be listed on an exchange"
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "Level II ADR"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "This level is visible to a wider market and requires the company to comply with the SEC regulatory rules. However, they cannot be used to raise capital."},
   :db/ident :fibo-sec-eq-dr/LevelIIAmericanDepositaryReceipt,
   :rdf/type [:fibo-sec-eq-dr/AmericanDepositaryReceiptLevel
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/DepositaryReceipts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Level II American depositary receipt"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "American Depositary Receipt level that is sponsored and can be listed on an exchange"}})

(def LevelIIIAmericanDepositaryReceipt
  "American Depositary Receipt level that can be listed on an exchange and permit companies to issue shares to raise capital for the foreign issuer, but require the highest level of compliance and disclosure"
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "Level III ADR"},
   :db/ident :fibo-sec-eq-dr/LevelIIIAmericanDepositaryReceipt,
   :rdf/type [:fibo-sec-eq-dr/AmericanDepositaryReceiptLevel
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/DepositaryReceipts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Level III American depositary receipt"},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "American Depositary Receipt level that can be listed on an exchange and permit companies to issue shares to raise capital for the foreign issuer, but require the highest level of compliance and disclosure"}})

(def LuxembourgDepositaryReceipt
  "global depositary receipt that represents the purchase, or ownership, of foreign assets which are deposited in a Luxembourg-based account"
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "LDR"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "A Luxembourg Depositary Receipt (LDR) is a certificate which represents the purchase, or ownership, of foreign assets which are deposited in a Luxembourg-based account. An LDR functions in much the same way as a global depositary receipt (GDR). LDRs may represent ownership of either an underlying number of shares or a notional amount of bonds."},
   :db/ident :fibo-sec-eq-dr/LuxembourgDepositaryReceipt,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/DepositaryReceipts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Luxembourg depositary receipt"},
   :rdfs/subClassOf [{:owl/hasValue   :fibo-be-ge-weuj/JurisdictionOfLuxembourg,
                      :owl/onProperty :fibo-fbc-fi-fi/isLegallyRecordedIn,
                      :rdf/type       :owl/Restriction}
                     :fibo-sec-eq-dr/GlobalDepositaryReceipt],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "global depositary receipt that represents the purchase, or ownership, of foreign assets which are deposited in a Luxembourg-based account"}})

(def OffshoreDepositaryReceipt
  "depositary receipt issued under SEC Regulation S"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "This regulation means that the securities are not, and will not be registered with any U.S. securities regulation authority. Regulation S shares cannot be held or traded by any 'U.S. person' as defined by SEC Regulation S rules. The shares are registered and issued to offshore, non-U.S. residents."},
   :db/ident :fibo-sec-eq-dr/OffshoreDepositaryReceipt,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/DepositaryReceipts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "offshore depositary receipt"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-sec-sec-rst/hasRestriction,
                      :owl/someValuesFrom :fibo-sec-sec-rst/RegulationS,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-eq-dr/SponsoredDepositaryReceipt],
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "depositary receipt issued under SEC Regulation S"}})

(def ParticipatoryNote
  "tradable debt instrument that facilitates the ownership of securities traded in other jurisdictions"
  {:cmns-av/abbreviation [{:rdf/language "en",
                           :rdf/value    "PN"}
                          {:rdf/language "en",
                           :rdf/value    "P-Note"}],
   :cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :cmns-av/explanatoryNote
   [{:rdf/language "en",
     :rdf/value
     "Depository receipts are widely used in order to allow the trading of debt instruments in\njurisdictions other than the one where the original debt instruments were issued"}
    {:rdf/language "en",
     :rdf/value
     "Typically P-Notes are SPVs that are created to allow participation from outside that market. The SPV purchases a security on shore and issues a note that represents that security to offshore investors. They are similar to an ADR but always a debt security."}],
   :cmns-av/synonym {:rdf/language "en",
                     :rdf/value    "participation note"},
   :db/ident :fibo-sec-eq-dr/ParticipatoryNote,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/DepositaryReceipts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "participatory note"},
   :rdfs/subClassOf [:fibo-sec-dbt-dbti/TradableDebtInstrument
                     :fibo-sec-eq-dr/DepositaryReceipt
                     {:owl/onProperty :fibo-sec-eq-dr/hasTradedSecurity,
                      :owl/someValuesFrom
                      :fibo-sec-dbt-dbti/TradableDebtInstrument,
                      :rdf/type :owl/Restriction}],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "tradable debt instrument that facilitates the ownership of securities traded in other jurisdictions"},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "Participation notes are required by investors or hedge funds to invest in Indian securities without having to register with the Securities and Exchange Board of India (SEBI). P-Notes are among the group of investments considered to be Offshore Derivative Investments (ODIs) in Indian markets."}})

(def PrivatelyPlacedDepositaryReceipt
  "depositary receipt that represents shares in a private placement under the SEC Rule 144-A"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Some foreign companies will set up an ADR program under SEC Rule 144-A. This provision makes the issuance of shares a private placement. Shares of companies registered under Rule 144-A are restricted stock and may only be issued to or traded by qualified institutional buyers (QIBs). U.S. public shareholders are generally not permitted to invest in these ADR programs, and most are held exclusively through the Depository Trust & Clearing Corporation, so there is often very little information on these companies."},
   :db/ident :fibo-sec-eq-dr/PrivatelyPlacedDepositaryReceipt,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/DepositaryReceipts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "privately placed depositary receipt"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-sec-sec-rst/hasRestriction,
                      :owl/someValuesFrom :fibo-sec-sec-rst/Restriction144A,
                      :rdf/type           :owl/Restriction}
                     :fibo-sec-eq-dr/SponsoredDepositaryReceipt],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "depositary receipt that represents shares in a private placement under the SEC Rule 144-A"}})

(def SponsoredDepositaryReceipt
  "depositary receipt that is issued in collaboration with the foreign company enabling them to tap into international capital markets directly"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Although a sponsored ADR would be listed in the United States, the issuing company still has its revenue and profit denominated in its home currency."},
   :db/ident :fibo-sec-eq-dr/SponsoredDepositaryReceipt,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/DepositaryReceipts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "sponsored depositary receipt"},
   :rdfs/subClassOf :fibo-sec-eq-dr/AmericanDepositaryReceipt,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "depositary receipt that is issued in collaboration with the foreign company enabling them to tap into international capital markets directly"}})

(def UnsponsoredDepositaryReceipt
  "depositary receipt that is established without the company's cooperation"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "For an unsponsored ADR, a depositary entity can issue certificates when there's heavy demand from investors for ownership in a specific company from abroad. The issuing entity is normally a broker-dealer that owns common stock in the company. Because they're issued without the consent or cooperation of the foreign company, unsponsored ADRs generally trade over-the-counter (OTC)—rather than on a stock exchange. Also, shareholder benefits and voting rights may not be extended to the holders of these particular securities. Many large global corporations use unsponsored ADRs to attract American capital. For example, American investors can invest in Royal Mail PLC, a postal and delivery service company from the United Kingdom that was founded by Henry VIII. The company's unsponsored ADR trades OTC under the ticker symbol ROYMY."},
   :db/ident :fibo-sec-eq-dr/UnsponsoredDepositaryReceipt,
   :owl/disjointWith :fibo-sec-eq-dr/SponsoredDepositaryReceipt,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/DepositaryReceipts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "unsponsored depositary receipt"},
   :rdfs/subClassOf [{:owl/hasValue
                      :fibo-sec-eq-dr/LevelIAmericanDepositaryReceipt,
                      :owl/onProperty :lcc-cr/isClassifiedBy,
                      :rdf/type :owl/Restriction}
                     :fibo-sec-eq-dr/AmericanDepositaryReceipt],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "depositary receipt that is established without the company's cooperation"}})

(def hasMultiplier
  "indicates the number of underlying shares (whether multiple or fractional) represented by a single depositary receipt"
  {:db/ident :fibo-sec-eq-dr/hasMultiplier,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-eq-dr/DepositaryReceipt,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/DepositaryReceipts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has multiplier"},
   :rdfs/range :xsd/decimal,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates the number of underlying shares (whether multiple or fractional) represented by a single depositary receipt"}})

(def hasNumberOfDepositaryReceiptsIssued
  "indicates the number of receipts issued to the general public"
  {:db/ident :fibo-sec-eq-dr/hasNumberOfDepositaryReceiptsIssued,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-sec-eq-dr/DepositaryReceipt,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/DepositaryReceipts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has number of depositary receipts issued"},
   :rdfs/range :xsd/positiveInteger,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "indicates the number of receipts issued to the general public"}})

(def hasTradedSecurity
  "links a depositary receipt to the instrument that it represents"
  {:db/ident :fibo-sec-eq-dr/hasTradedSecurity,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-eq-dr/DepositaryReceipt,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/DepositaryReceipts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has traded security"},
   :rdfs/range :fibo-fbc-fi-fi/Security,
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/represents,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "links a depositary receipt to the instrument that it represents"}})

(def hasTradedShare
  "links a depositary receipt to the instrument (equity or exchange-traded fund) that it represents"
  {:db/ident :fibo-sec-eq-dr/hasTradedShare,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-eq-dr/DepositaryReceipt,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Equities/DepositaryReceipts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has traded share"},
   :rdfs/range :fibo-sec-eq-eq/Share,
   :rdfs/subPropertyOf :fibo-sec-eq-dr/hasTradedSecurity,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "links a depositary receipt to the instrument (equity or exchange-traded fund) that it represents"}})