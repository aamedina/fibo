(ns net.wikipunk.rdf.fibo-fnd-acc-aeq
  {:cmns-av/copyright #{"Copyright (c) 2013-2023 Object Management Group, Inc."
                        "Copyright (c) 2013-2023 EDM Council, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Accounting/AccountingEquity/",
   :dcterms/abstract
   "This ontology defines equity-related concepts for use in defining other FIBO ontology elements. These are based on basic accounting principles as they relate to equity, debt, assets and liabilities of a firm. Equity forms the basis for ownership of certain forms of corporate body.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "cmns-qtu" "https://www.omg.org/spec/Commons/QuantitiesAndUnits/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-acc-aeq"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/AccountingEquity/",
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
    "fibo-fnd-oac-own"
    "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Ownership/",
    "fibo-fnd-org-fm"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Organizations/FormalOrganizations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/OwnershipAndControl/Ownership/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/QuantitiesAndUnits/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Organizations/FormalOrganizations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Accounting/AccountingEquity/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fnd-acc-aeq",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/AccountingEquity/",
   :rdfs/label "Accounting Equity Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/AccountingEquity.rdf version of this ontology was modified to add a definition for EBITDA."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/AccountingEquity.rdf version of this ontology was modified to augment the definition of asset, and add income."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/AccountingEquity.rdf version of this ontology was modified to correct the definition of EBITDA and to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/AccountingEquity.rdf version of this ontology was modified per the issue resolutions identified in the FIBO FND 1.1 RTF report, namely, to rename MoneyAmount to AmountOfMoney and replace it herein with MonetaryAmount, as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/AccountingEquity.rdf version of this ontology was modified to add physical asset and eliminate ambiguity in some definitions."
     "The http://www.omg.org/spec/FIBO/Foundations/20130601/Accounting/AccountingEquity.owl version of the ontology was revised in advance of the September 2013 New Brunswick, NJ meeting, as follows:\n   (1) to use slash style URI/IRIss (also called 303 URIs, vs. hash style) as required to support server side processing \n   (2) to use version-independent IRIs for all definitions internally as opposed to version-specific IRIs\n   (3) to change the file suffix from .owl to .rdf to increase usability in RDF tools\n   (4) to use 4-level abbreviations and corresponding namespace prefixes for all FIBO ontologies, reflecting a family/specification/module/ontology structure\n   (5) to incorporate changes to the specification metadata to support documentation at the family, specification, module, and ontology level, similar to the abbreviations."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/AccountingEquity.rdf version of this ontology was modified per the issue resolutions identified in the FIBO FND 1.0 FTF report and in https://spec.edmcouncil.org/fibo/ontology/FND/1.0/AboutFND-1.0/."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/AccountingEquity.rdf version of this ontology was modified to eliminate deprecated elements."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/AccountingEquity.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/AccountingEquity.rdf version of this ontology was modified per the FIBO 2.0 RFC to rework definitions in support of revised Business Entities, Equities and related ontologies."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/AccountingEquity.rdf version of this ontology was modified to fix spelling errors and deprecate the property represents an interest in, which is not used elsewhere and is confusing."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/AccountingEquity.rdf version of this ontology was modified to make income a subclass of monetary amount and eliminate the oblique restriction on monetary amount to simplify its representation."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/AccountingEquity.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/AccountingEquity.rdf version of this ontology was modified to eliminate the deprecated 'represents an interest in' property."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/AccountingEquity/"})

(def CapitalSurplus
  {:db/ident :fibo-fnd-acc-aeq/CapitalSurplus,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/AccountingEquity/"},
   :rdfs/label "capital surplus",
   :rdfs/subClassOf :fibo-fnd-acc-aeq/PaidInCapital,
   :skos/definition
   "capital contributed in excess of the par value (stated value) of the ownership interest issued"})

(def EarningsBeforeInterestTaxesDepreciationAmortization
  {:cmns-av/abbreviation "EBITDA",
   :cmns-av/explanatoryNote
   #{"By stripping out the non-cash depreciation and amortization expense as well as taxes and debt costs dependent on the capital structure, EBITDA attempts to represent cash profit generated by the company's operations. EBITDA is not a metric recognized under Generally Accepted Accounting Principles (GAAP). Some public companies report EBITDA in their quarterly results along with adjusted EBITDA figures typically excluding additional costs, such as stock-based compensation."
     "EBITDA is often used as a proxy for cash flow, as it shows how much cash a company can generate from its core operations. However, EBITDA has some limitations, such as ignoring the cost of maintaining and replacing capital assets, and being susceptible to manipulation by excluding certain expenses."},
   :db/ident
   :fibo-fnd-acc-aeq/EarningsBeforeInterestTaxesDepreciationAmortization,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/AccountingEquity/"},
   :rdfs/label "earnings before interest, taxes, depreciation and amortization",
   :rdfs/subClassOf #{{:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-fnd-org-fm/FormalOrganization,
                       :owl/onProperty :cmns-cxtdsg/appliesTo,
                       :rdf/type       :owl/Restriction} :cmns-qtu/Expression},
   :skos/definition
   "measure of potential cash flow that excludes the effects of capital structure, taxes and non-cash expenses"})

(def FinancialAsset
  {:cmns-av/explanatoryNote
   "Financial assets are typically more liquid than other tangible assets, such as commodities or real estate. Financial assets may not cover all assets that might be included on a balance sheet, and do not include tangible, physical assets or intangible assets such as intellectual property.",
   :db/ident :fibo-fnd-acc-aeq/FinancialAsset,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/AccountingEquity/"},
   :rdfs/label "financial asset",
   :rdfs/subClassOf :fibo-fnd-oac-own/TangibleAsset,
   :skos/definition
   "non-physical, tangible asset whose value is derived from a contractual claim, such as bank deposits, bonds, stocks, rights, certificates, and bank balances"})

(def Income
  {:cmns-av/explanatoryNote
   "Income includes cash or cash equivalent(s) received during some period of time in exchange for labor or services, from the sale of goods or property, or as receipts from financial investments.",
   :db/ident :fibo-fnd-acc-aeq/Income,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/AccountingEquity/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "income"},
   :rdfs/subClassOf #{:fibo-fnd-acc-cur/MonetaryAmount
                      {:owl/onClass    :cmns-dt/DatePeriod,
                       :owl/onProperty :cmns-dt/hasDatePeriod,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}},
   :skos/definition "revenue received during a period of time"})

(def OwnersEquity
  {:cmns-av/adaptedFrom
   {:rdf/value "Barron's Dictionary of Banking Terms, Sixth Edition, 2012."},
   :cmns-av/explanatoryNote
   "Owner's equity is represented by capital investments and accumulated earnings less any dividends or other financial obligations. It is typically used to talk about equity in a business, but may also refer to the net assets of a pool or special purpose vehicle.",
   :cmns-av/synonym #{"equity"
                      {:rdf/language "en",
                       :rdf/value    "contributed capital"}
                      {:rdf/language "en",
                       :rdf/value    "capital"} "net worth"},
   :db/ident :fibo-fnd-acc-aeq/OwnersEquity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/AccountingEquity/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "owners' equity"},
   :rdfs/subClassOf #{{:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-fnd-org-fm/FormalOrganization,
                       :owl/onProperty :cmns-cxtdsg/appliesTo,
                       :rdf/type       :owl/Restriction}
                      {:owl/onProperty     :cmns-qtu/hasArgument,
                       :owl/someValuesFrom :fibo-fnd-acc-aeq/RetainedEarnings,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :cmns-qtu/hasArgument,
                       :owl/someValuesFrom :fibo-fnd-acc-aeq/PaidInCapital,
                       :rdf/type           :owl/Restriction}
                      :cmns-qtu/Expression},
   :skos/definition "owners' share in a business plus operating profit"})

(def PaidInCapital
  {:db/ident :fibo-fnd-acc-aeq/PaidInCapital,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/AccountingEquity/"},
   :rdfs/label "paid-in capital",
   :rdfs/subClassOf :fibo-fnd-acc-aeq/OwnersEquity,
   :skos/definition
   "assets received from investors in exchange for an ownership interest"})

(def PhysicalAsset
  {:cmns-av/explanatoryNote
   "Physical (tangible) assets are real items of value that are used to generate revenue for a company.",
   :db/ident :fibo-fnd-acc-aeq/PhysicalAsset,
   :owl/disjointWith :fibo-fnd-acc-aeq/FinancialAsset,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/AccountingEquity/"},
   :rdfs/label "physical asset",
   :rdfs/subClassOf :fibo-fnd-oac-own/TangibleAsset,
   :skos/definition
   "tangible asset that has a material form, such as property, equipment, and inventory"})

(def RetainedEarnings
  {:cmns-av/explanatoryNote
   "If the corporation takes a loss, then that loss is retained and called variously retained losses, accumulated losses or accumulated deficit. Retained earnings and losses are cumulative from year to year with losses offsetting earnings.",
   :db/ident :fibo-fnd-acc-aeq/RetainedEarnings,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/AccountingEquity/"},
   :rdfs/label "retained earnings",
   :rdfs/subClassOf :fibo-fnd-acc-aeq/OwnersEquity,
   :skos/definition
   "net profits kept to accumulate in a business after dividends are paid"})

(def ShareholdersEquity
  {:db/ident :fibo-fnd-acc-aeq/ShareholdersEquity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/AccountingEquity/"},
   :rdfs/label "shareholders' equity",
   :rdfs/subClassOf :fibo-fnd-acc-aeq/OwnersEquity,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "equity that is manifested in the form of shares in an entity, fund or structured product"}})

(def urn:uuid:b3479404-5948-5de7-92ed-2a9de1b007ec
  {:cmns-av/copyright #{"Copyright (c) 2013-2023 Object Management Group, Inc."
                        "Copyright (c) 2013-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology defines equity-related concepts for use in defining other FIBO ontology elements. These are based on basic accounting principles as they relate to equity, debt, assets and liabilities of a firm. Equity forms the basis for ownership of certain forms of corporate body.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/OwnershipAndControl/Ownership/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/QuantitiesAndUnits/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Organizations/FormalOrganizations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Relations/Relations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Accounting/AccountingEquity/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Accounting Equity Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/AccountingEquity.rdf version of this ontology was modified to add a definition for EBITDA."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/AccountingEquity.rdf version of this ontology was modified to augment the definition of asset, and add income."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/AccountingEquity.rdf version of this ontology was modified to correct the definition of EBITDA and to replace content that is now available in the OMG Commons Ontology Library (Commons) v1.1 (FND-380)."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/AccountingEquity.rdf version of this ontology was modified per the issue resolutions identified in the FIBO FND 1.1 RTF report, namely, to rename MoneyAmount to AmountOfMoney and replace it herein with MonetaryAmount, as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/AccountingEquity.rdf version of this ontology was modified to add physical asset and eliminate ambiguity in some definitions."
     "The http://www.omg.org/spec/FIBO/Foundations/20130601/Accounting/AccountingEquity.owl version of the ontology was revised in advance of the September 2013 New Brunswick, NJ meeting, as follows:\n   (1) to use slash style URI/IRIss (also called 303 URIs, vs. hash style) as required to support server side processing \n   (2) to use version-independent IRIs for all definitions internally as opposed to version-specific IRIs\n   (3) to change the file suffix from .owl to .rdf to increase usability in RDF tools\n   (4) to use 4-level abbreviations and corresponding namespace prefixes for all FIBO ontologies, reflecting a family/specification/module/ontology structure\n   (5) to incorporate changes to the specification metadata to support documentation at the family, specification, module, and ontology level, similar to the abbreviations."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/AccountingEquity.rdf version of this ontology was modified per the issue resolutions identified in the FIBO FND 1.0 FTF report and in https://spec.edmcouncil.org/fibo/ontology/FND/1.0/AboutFND-1.0/."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/AccountingEquity.rdf version of this ontology was modified to eliminate deprecated elements."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/AccountingEquity.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/AccountingEquity.rdf version of this ontology was modified per the FIBO 2.0 RFC to rework definitions in support of revised Business Entities, Equities and related ontologies."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/AccountingEquity.rdf version of this ontology was modified to fix spelling errors and deprecate the property represents an interest in, which is not used elsewhere and is confusing."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/AccountingEquity.rdf version of this ontology was modified to make income a subclass of monetary amount and eliminate the oblique restriction on monetary amount to simplify its representation."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/AccountingEquity.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/AccountingEquity.rdf version of this ontology was modified to eliminate the deprecated 'represents an interest in' property."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/AccountingEquity/"})