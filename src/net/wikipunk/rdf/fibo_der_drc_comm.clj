(ns net.wikipunk.rdf.fibo-der-drc-comm
  "This ontology specifies core concepts for commodities-based derivatives and spot contracts, including the definitions of the most common categories of underlying negotiable commodities, corresponding to those outlined in the ISO 10962 CFI standard. Note that the ontology does not include any specific units of measure for these commodities. The intent is that FIBO users would select one of the many available units ontologies to use in specifying the details of individual contracts."
  {:cmns-av/copyright ["Copyright (c) 2015-2023 EDM Council, Inc."
                       "Copyright (c) 2015-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CommoditiesContracts/",
   :dcterms/abstract
   "This ontology specifies core concepts for commodities-based derivatives and spot contracts, including the definitions of the most common categories of underlying negotiable commodities, corresponding to those outlined in the ISO 10962 CFI standard. Note that the ontology does not include any specific units of measure for these commodities. The intent is that FIBO users would select one of the many available units ontologies to use in specifying the details of individual contracts.",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/Swaps/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/DerivativesBasics/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/FinancialInstruments/FinancialInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://www.omg.org/spec/Commons/Collections/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/Options/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/ProductsAndServices/FinancialProductsAndServices/"
    "https://www.omg.org/spec/Commons/Classifiers/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/FuturesAndForwards/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Contracts/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Accounting/CurrencyAmount/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/ProductsAndServices/ProductsAndServices/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/DER/DerivativesContracts/CommoditiesContracts/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-der-drc-comm"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CommoditiesContracts/",
    "fibo-der-drc-ff"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/FuturesAndForwards/",
    "fibo-der-drc-opt"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Options/",
    "fibo-der-drc-swp"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/Swaps/",
    "fibo-fbc-fi-fi"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
    "fibo-fbc-pas-fpas"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/ProductsAndServices/FinancialProductsAndServices/",
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
    "fibo-fnd-pas-pas"
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/",
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
   :rdfa/prefix "fibo-der-drc-comm",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CommoditiesContracts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Commodities Contracts Ontology"},
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CommoditiesContracts.rdf version of this ontology was modified to reflect the move of precious metal from products and services to currency amount."
    "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CommoditiesContracts.rdf version of this ontology was modified to fix spelling errors."
    "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CommoditiesContracts.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
    "The https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CommoditiesContracts.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary, and to move the definition of an underlier and the related property, has underlier, to financial instruments so that these concepts are also available for use in relation to pool-backed securities."]})

(def AgriculturalResource
  "negotiable commodity that is obtained via some agricultural process, including forestry, fishing, livestock, grain, dairy, corn, cocoa, soybeans, sugar, coffee"
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :db/ident :fibo-der-drc-comm/AgriculturalResource,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CommoditiesContracts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "agricultural resource"},
   :rdfs/subClassOf :fibo-fnd-pas-pas/NegotiableCommodity,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "negotiable commodity that is obtained via some agricultural process, including forestry, fishing, livestock, grain, dairy, corn, cocoa, soybeans, sugar, coffee"}})

(def BaseMetal
  "common metal that tarnishes, oxidizes, or corrodes relatively quickly when exposed to air or moisture, that is widely used in commercial and industrial applications, such as construction and manufacturing"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Base metals or alloys include metals other than precious metals, such as copper, lead, zinc, tin, iron, steel, or brass. Note that iron and steel are included under metal and metal products in some classification schemes - see https://fred.stlouisfed.org/series/WPU101 for example."},
   :db/ident :fibo-der-drc-comm/BaseMetal,
   :owl/disjointWith :fibo-fnd-acc-cur/PreciousMetal,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CommoditiesContracts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "base metal"},
   :rdfs/subClassOf :fibo-der-drc-comm/Metal,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "common metal that tarnishes, oxidizes, or corrodes relatively quickly when exposed to air or moisture, that is widely used in commercial and industrial applications, such as construction and manufacturing"}})

(def BasketOfCommodities
  "custom basket whose constituents consist of one or more negotiable commodities"
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "A commodity basket may contain constituents from one of the potential underlying assets or from multiple underlying assets."},
   :db/ident :fibo-der-drc-comm/BasketOfCommodities,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CommoditiesContracts/",
   :rdfs/label "basket of commodities",
   :rdfs/subClassOf [{:owl/onProperty :cmns-col/hasConstituent,
                      :owl/someValuesFrom
                      :fibo-der-drc-comm/CommodityBasketConstituent,
                      :rdf/type :owl/Restriction}
                     :fibo-fbc-pas-fpas/WeightedBasket],
   :skos/definition
   "custom basket whose constituents consist of one or more negotiable commodities"})

(def Bullion
  "physical precious metal that is officially recognized as being at least 99.5 percent pure"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Physical metals fall into two categories: (1) bullion, which are coins, ingots or bars of a specific weight and purity; and (2) \"numismatic\" or collectible coins, which can be rare or old coins, or special proofs that are newly minted as collectibles. If a particular asset is identified as \"numismatic\" or \"collectible\", it is, by definition, not considered bullion aside from its melt value."},
   :db/ident :fibo-der-drc-comm/Bullion,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CommoditiesContracts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "bullion"},
   :rdfs/subClassOf :fibo-fnd-acc-cur/PreciousMetal,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "physical precious metal that is officially recognized as being at least 99.5 percent pure"},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "In the United States, bullion that is eligible for reference in a commodities contract may include U.S. gold Buffalo coins minted by the U.S. Mint that are 1 troy ounce, 0.5 ounce, 0.25 ounce, or 0.10 ounce; 1 ounce silver coins; certain platinum coins; and gold, silver, palladium, and platinum bullion that meet or exceed the fineness requirements of a regulated futures contract. Bullion must also be certified by an approved certifier, typically identified by an exchange, including but not limited to the U.S. Mint."}})

(def CommodityBasketConstituent
  "component of a custom commodity basket whose relative importance with respect to other basket constituents is known"
  {:db/ident :fibo-der-drc-comm/CommodityBasketConstituent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CommoditiesContracts/",
   :rdfs/label "commodity basket constituent",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-col/comprises,
                      :owl/someValuesFrom :fibo-fnd-pas-pas/NegotiableCommodity,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-pas-fpas/WeightedBasketConstituent],
   :skos/definition
   "component of a custom commodity basket whose relative importance with respect to other basket constituents is known"})

(def CommodityDerivative
  "derivative instrument whose primary underlying notional item is a physical commodity, or the price, or related index, or any other aspect related to a physical commodity"
  {:db/ident :fibo-der-drc-comm/CommodityDerivative,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CommoditiesContracts/",
   :rdfs/label "commodity derivative",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass :fibo-der-drc-comm/CommodityUnderlyingAsset,
                      :owl/onProperty :fibo-fbc-fi-fi/hasUnderlier,
                      :rdf/type :owl/Restriction}
                     :fibo-fbc-fi-fi/DerivativeInstrument
                     :fibo-fbc-fi-fi/CommodityInstrument],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "derivative instrument whose primary underlying notional item is a physical commodity, or the price, or related index, or any other aspect related to a physical commodity"}})

(def CommodityForward
  "forward contract in which a buyer and seller agree upon delivery of a specified quality and quantity of goods at a specified future date"
  {:cmns-av/adaptedFrom
   [{:rdf/language "en",
     :rdf/value
     "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"}
    {:rdf/language "en",
     :rdf/value    "CFTC glossary"}],
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Commodity forwards are often settled via cash transactions in many industries, including for the purposes of commodity merchandising. Terms may be more \"personalized\" than is the case with standardized futures contracts (i.e., delivery time and amount are as determined between seller and buyer). A price may be agreed upon in advance, or there may be agreement that the price will be determined at the time of delivery. A forward contract is a private and customizable agreement that settles at the end of the agreement and is traded over-the-counter."},
   :db/ident :fibo-der-drc-comm/CommodityForward,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CommoditiesContracts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "commodity forward"},
   :rdfs/subClassOf [:fibo-der-drc-ff/Forward
                     :fibo-der-drc-comm/CommodityDerivative],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "forward contract in which a buyer and seller agree upon delivery of a specified quality and quantity of goods at a specified future date"}})

(def CommodityFuture
  "futures contract to buy or sell a predetermined amount of a commodity at a specific price on a specific date in the future"
  {:cmns-av/adaptedFrom
   [{:rdf/language "en",
     :rdf/value
     "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"}
    {:rdf/language "en",
     :rdf/value    "CFTC glossary"}],
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "A commodity future is an agreement to purchase or sell a commodity for delivery in the future: (1) at a price that is determined at initiation of the contract; (2) that obligates each party to the contract to fulfill the contract at the specified price; (3) that is used to assume or shift price risk; and (4) that may be satisfied by delivery or offset."},
   :db/ident :fibo-der-drc-comm/CommodityFuture,
   :owl/disjointWith :fibo-der-drc-ff/FinancialFuture,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CommoditiesContracts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "commodity future"},
   :rdfs/subClassOf [:fibo-fbc-fi-fi/Future
                     :fibo-der-drc-comm/CommodityDerivative],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "futures contract to buy or sell a predetermined amount of a commodity at a specific price on a specific date in the future"}})

(def CommodityOption
  "option where the option buyer has the right to buy or sell specified commodities or commodity related index at a fixed price or formula, on or before a specified date"
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :db/ident :fibo-der-drc-comm/CommodityOption,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CommoditiesContracts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "commodity option"},
   :rdfs/subClassOf [:fibo-der-drc-opt/VanillaOption
                     :fibo-der-drc-comm/CommodityDerivative],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "option where the option buyer has the right to buy or sell specified commodities or commodity related index at a fixed price or formula, on or before a specified date"}})

(def CommodityReturnLeg
  "leg of a commodity return swap in which the return is based on a physical commodity, or the price, or behavior of the price, or any other aspect related to a physical commodity"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The cash flows from a commodity may be negative as you have a cost from holding the commodity but there are no interim cash flows, so it equates to a negative interest rate. So a commodity swap is like a TRS in that it is based on the return on the increase in value."},
   :db/ident :fibo-der-drc-comm/CommodityReturnLeg,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CommoditiesContracts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "commodity return leg"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-fbc-fi-fi/hasUnderlier,
                      :owl/someValuesFrom
                      :fibo-der-drc-comm/CommodityUnderlyingAsset,
                      :rdf/type :owl/Restriction}
                     :fibo-der-drc-swp/ReturnLeg],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "leg of a commodity return swap in which the return is based on a physical commodity, or the price, or behavior of the price, or any other aspect related to a physical commodity"}})

(def CommoditySpotContract
  "The contract defined for or implied in a Commodities spot transaction."
  {:db/ident :fibo-der-drc-comm/CommoditySpotContract,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CommoditiesContracts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "commodity spot contract"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/involves,
                      :owl/someValuesFrom :fibo-fnd-pas-pas/NegotiableCommodity,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-fi-fi/SpotContract
                     :fibo-fbc-fi-fi/CommodityInstrument],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "The contract defined for or implied in a Commodities spot transaction."}})

(def CommoditySwap
  "commodity derivative that includes, without limitation, any swap for which the primary underlying notional item is a physical commodity, or the price, or behavior of the price, or the level of a commodity index, or other aspect related to a physical commodity"
  {:cmns-av/adaptedFrom
   [{:rdf/language "en",
     :rdf/value
     "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"}
    {:rdf/language "en",
     :rdf/value    "CFTC glossary"}],
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Commodity swaps typically involve the exchange of a floating commodity price for a set price over an agreed-upon period."},
   :db/ident :fibo-der-drc-comm/CommoditySwap,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CommoditiesContracts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "commodity swap"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-der-drc-swp/hasReturnLeg,
                      :owl/someValuesFrom :fibo-der-drc-comm/CommodityReturnLeg,
                      :rdf/type           :owl/Restriction}
                     :fibo-der-drc-swp/ReturnSwap
                     :fibo-der-drc-comm/CommodityDerivative],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "commodity derivative that includes, without limitation, any swap for which the primary underlying notional item is a physical commodity, or the price, or behavior of the price, or the level of a commodity index, or other aspect related to a physical commodity"}})

(def CommodityUnderlyingAsset
  "underlier of a commodity derivative, including, but not limited to, the negotiable commodity itself"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The underlying of a commodity swap may include a physical commodity, or the price, or behavior of the price, or any other aspect of a physical commodity."},
   :db/ident :fibo-der-drc-comm/CommodityUnderlyingAsset,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CommoditiesContracts/",
   :rdfs/label "commodity underlying asset",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/hasIdentity,
                      :owl/someValuesFrom :fibo-fnd-pas-pas/NegotiableCommodity,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-fi-fi/Underlier],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "underlier of a commodity derivative, including, but not limited to, the negotiable commodity itself"}})

(def EnergyResource
  "negotiable commodity that is an energy-related product, or a derivative of an energy-related product, including electricity, renewable energy, or any power/energy delivered through a utility network of provider; diesel fuel, fuel oil, gas oil, gasoline, heating oil, jet fuel, kerosene, natural gas, oil (Brent, Tapis, Dubai, WTI)"
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :db/ident :fibo-der-drc-comm/EnergyResource,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CommoditiesContracts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "energy resource"},
   :rdfs/subClassOf :fibo-fnd-pas-pas/NegotiableCommodity,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "negotiable commodity that is an energy-related product, or a derivative of an energy-related product, including electricity, renewable energy, or any power/energy delivered through a utility network of provider; diesel fuel, fuel oil, gas oil, gasoline, heating oil, jet fuel, kerosene, natural gas, oil (Brent, Tapis, Dubai, WTI)"},
   :skos/scopeNote
   {:rdf/language "en",
    :rdf/value
    "Note that the concept of an energy resource overlaps with generated resource and extraction resource but is not identical to either."}})

(def EnergyTransmissionRights
  "rights to the transmission of power across an electricity distribution network"
  {:db/ident :fibo-der-drc-comm/EnergyTransmissionRights,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CommoditiesContracts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "energy transmission rights"},
   :rdfs/subClassOf :fibo-der-drc-comm/EnergyResource,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "rights to the transmission of power across an electricity distribution network"}})

(def EnvironmentalResource
  "negotiable commodity including offset credits"
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :db/ident :fibo-der-drc-comm/EnvironmentalResource,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CommoditiesContracts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "environmental resource"},
   :rdfs/subClassOf :fibo-fnd-pas-pas/NegotiableCommodity,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "negotiable commodity including offset credits"}})

(def ExtractionResource
  "negotiable commodity that is a mineral resource obtained via withdrawal from the natural environment"
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "These resources include ores, which contain commercially valuable amounts of metals, such as iron and aluminum, as well as precious metals, such as silver, gold, and platinum; precious stones, such as diamonds; building stones, such as granite; and solid fuels, such as coal and oil shale."},
   :db/ident :fibo-der-drc-comm/ExtractionResource,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CommoditiesContracts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "extraction resource"},
   :rdfs/subClassOf :fibo-fnd-pas-pas/NegotiableCommodity,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "negotiable commodity that is a mineral resource obtained via withdrawal from the natural environment"}})

(def FertilizerResource
  "negotiable commodity that includes ammonia, diammonium phosphate (DAP), potash, sulphur, urea, urea and ammonium nitrate (UAN)"
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :db/ident :fibo-der-drc-comm/FertilizerResource,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CommoditiesContracts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "fertilizer resource"},
   :rdfs/subClassOf :fibo-fnd-pas-pas/NegotiableCommodity,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "negotiable commodity that includes ammonia, diammonium phosphate (DAP), potash, sulphur, urea, urea and ammonium nitrate (UAN)"}})

(def FreightResource
  "negotiable commodity that is a freight index route"
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :db/ident :fibo-der-drc-comm/FreightResource,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CommoditiesContracts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "freight resource"},
   :rdfs/subClassOf :fibo-fnd-pas-pas/NegotiableCommodity,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "negotiable commodity that is a freight index route"}})

(def GasCommodity
  "extraction resource that is natural gas"
  {:db/ident :fibo-der-drc-comm/GasCommodity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CommoditiesContracts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "gas commodity"},
   :rdfs/subClassOf [:fibo-der-drc-comm/ExtractionResource
                     :fibo-der-drc-comm/EnergyResource],
   :skos/definition {:rdf/language "en",
                     :rdf/value    "extraction resource that is natural gas"}})

(def GeneratedResource
  "negotiable commodity obtained via some generation process, including electricity, renewable energy, or any power/energy delivered through a utility network or provider"
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :db/ident :fibo-der-drc-comm/GeneratedResource,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CommoditiesContracts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "generated resource"},
   :rdfs/subClassOf :fibo-fnd-pas-pas/NegotiableCommodity,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "negotiable commodity obtained via some generation process, including electricity, renewable energy, or any power/energy delivered through a utility network or provider"}})

(def GrainCommodity
  "agricultural resource that is a small, hard seed, of a food plant, especially of a cereal plant, such as wheat, corn, rye, oats, rice, and millet"
  {:db/ident :fibo-der-drc-comm/GrainCommodity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CommoditiesContracts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "grain commodity"},
   :rdfs/subClassOf :fibo-der-drc-comm/AgriculturalResource,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "agricultural resource that is a small, hard seed, of a food plant, especially of a cereal plant, such as wheat, corn, rye, oats, rice, and millet"}})

(def IndustrialResource
  "negotiable commodity that is obtained via some industrial process, including construction and manufacturing"
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :db/ident :fibo-der-drc-comm/IndustrialResource,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CommoditiesContracts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "industrial resource"},
   :rdfs/subClassOf :fibo-fnd-pas-pas/NegotiableCommodity,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "negotiable commodity that is obtained via some industrial process, including construction and manufacturing"}})

(def MeatCommodity
  "agricultural resource derived from the flesh of an animal (especially a mammal), such as pork bellies"
  {:db/ident :fibo-der-drc-comm/MeatCommodity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CommoditiesContracts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "meat commodity"},
   :rdfs/subClassOf :fibo-der-drc-comm/AgriculturalResource,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "agricultural resource derived from the flesh of an animal (especially a mammal), such as pork bellies"}})

(def Metal
  "material that, when freshly prepared, polished, or fractured, shows a lustrous appearance, and conducts electricity and heat relatively well"
  {:cmns-av/adaptedFrom
   [{:rdf/language "en",
     :rdf/value    "https://en.wikipedia.org/wiki/Metal"}
    {:rdf/language "en",
     :rdf/value
     "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"}],
   :db/ident :fibo-der-drc-comm/Metal,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CommoditiesContracts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "metal"},
   :rdfs/subClassOf :fibo-der-drc-comm/ExtractionResource,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "material that, when freshly prepared, polished, or fractured, shows a lustrous appearance, and conducts electricity and heat relatively well"},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "Examples include precious or industrial metal, such as aluminium, copper, gold, lead, nickel, platinum, silver, tin, zinc."}})

(def OilCommodity
  "generated resource that is a viscous liquid derived from petroleum, including for use as fuel, or as a lubricant, and the manufacture of many types of paints, plastics, and other materials"
  {:db/ident :fibo-der-drc-comm/OilCommodity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CommoditiesContracts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "oil commodity"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-der-drc-comm/hasGrade,
                      :owl/someValuesFrom :fibo-der-drc-comm/OilGrade,
                      :rdf/type           :owl/Restriction}
                     :fibo-der-drc-comm/GeneratedResource],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "generated resource that is a viscous liquid derived from petroleum, including for use as fuel, or as a lubricant, and the manufacture of many types of paints, plastics, and other materials"}})

(def OilGrade
  "measure of the viscosity of oil during operation"
  {:db/ident :fibo-der-drc-comm/OilGrade,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CommoditiesContracts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "oil grade"},
   :rdfs/subClassOf :cmns-cls/Classifier,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "measure of the viscosity of oil during operation"}})

(def PaperResource
  "negotiable commodity that is a paper product, including containerboard, newsprint, pulp, recovered paper"
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :db/ident :fibo-der-drc-comm/PaperResource,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CommoditiesContracts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "paper resource"},
   :rdfs/subClassOf :fibo-fnd-pas-pas/NegotiableCommodity,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "negotiable commodity that is a paper product, including containerboard, newsprint, pulp, recovered paper"}})

(def PolypropyleneResource
  "negotiable commodity including plastics"
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :db/ident :fibo-der-drc-comm/PolypropyleneResource,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CommoditiesContracts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "polypropylene resource"},
   :rdfs/subClassOf :fibo-fnd-pas-pas/NegotiableCommodity,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "negotiable commodity including plastics"}})

(def ServiceResource
  "negotiable commodity involving services such as transportation, communications, and trade"
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fourth Edition, October 2019"},
   :db/ident :fibo-der-drc-comm/ServiceResource,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CommoditiesContracts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "service resource"},
   :rdfs/subClassOf :fibo-fnd-pas-pas/NegotiableCommodity,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "negotiable commodity involving services such as transportation, communications, and trade"}})

(def WeatherDerivative
  "derivative instrument whose primary underlying notional item is based on something related to the weather, for example, the average temperature in Chicago in January"
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "CFTC glossary, https://www.cftc.gov/LearnAndProtect/EducationCenter/CFTCGlossary/glossary_wxyz.html"},
   :cmns-av/explanatoryNote
   [{:rdf/language "en",
     :rdf/value
     "Such a derivative can be used to hedge risks related to the demand for heating fuel or electricity. The underlying 'asset' is not a negotiable commodity per se, but because the weather can impact the prices and other things related to other commodities, weather derivatives are treated as commodity derivatives for regulatory purposes."}
    {:rdf/language "en",
     :rdf/value
     "In the CFI standard, weather is classified as an environmental resource."}],
   :db/ident :fibo-der-drc-comm/WeatherDerivative,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CommoditiesContracts/",
   :rdfs/label "weather derivative",
   :rdfs/subClassOf [:fibo-fbc-fi-fi/DerivativeInstrument
                     :fibo-der-drc-comm/CommodityDerivative],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "derivative instrument whose primary underlying notional item is based on something related to the weather, for example, the average temperature in Chicago in January"}})

(def hasGrade
  "The grade of oil e.g. Brent Crude."
  {:db/ident :fibo-der-drc-comm/hasGrade,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-der-drc-comm/OilCommodity,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/CommoditiesContracts/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has grade"},
   :rdfs/range :fibo-der-drc-comm/OilGrade,
   :skos/definition {:rdf/language "en",
                     :rdf/value    "The grade of oil e.g. Brent Crude."}})

(def ^{:private true} PreciousMetal
  {:db/ident        :fibo-fnd-acc-cur/PreciousMetal,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :fibo-der-drc-comm/Metal})