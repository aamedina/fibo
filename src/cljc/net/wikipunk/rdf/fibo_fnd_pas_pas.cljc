(ns net.wikipunk.rdf.fibo-fnd-pas-pas
  {:cmns-av/copyright
   #{"Copyright (c) 2013-2024 EDM Council, Inc."
     "Copyright (c) 2013-2024 Object Management Group, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/ProductsAndServices/ProductsAndServices/",
   :dcterms/abstract
   "This ontology defines fundamental concepts for buyers, sellers, clients, customers, products, goods and services for use in other FIBO ontologies.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-doc" "https://www.omg.org/spec/Commons/Documents/",
    "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
    "cmns-pts" "https://www.omg.org/spec/Commons/PartiesAndSituations/",
    "cmns-rlcmp" "https://www.omg.org/spec/Commons/RolesAndCompositions/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-acc-cur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Accounting/CurrencyAmount/",
    "fibo-fnd-agr-ctr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
    "fibo-fnd-dt-oc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/Occurrences/",
    "fibo-fnd-law-lcap"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/",
    "fibo-fnd-pas-pas"
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/",
    "fibo-fnd-plc-fac"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Facilities/",
    "fibo-fnd-plc-loc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Locations/",
    "fibo-fnd-pty-pty"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Places/Locations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Law/LegalCapacity/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Documents/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/DatesAndTimes/Occurrences/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Parties/Parties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Places/Facilities/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/ProductsAndServices/ProductsAndServices/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fnd-pas-pas",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/",
   :rdfs/label "Products and Services Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices.rdf version of this ontology was modified per the issue resolutions identified in the FIBO FND 1.1 RTF report to replace MoneyAmount with AmountOfMoney."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices.rdf version of this ontology was modified to move (deprecate) the properties produces and isProducedBy to Relations for more general usability."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices.rdf version of the ontology was modified to replace concepts from several FIBO FND ontologies with their counterparts added to the Commons Ontology Library (Commons) v1.1."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices.rdf version of this ontology was revised to replace uses of hasTag in Relations with hasTag from LCC, as the more complex union of datatypes in the Relations concept is not needed here."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices.rdf version of this ontology was revised to incorporate the concept of a right into the definition of product, to cover leases and rentals, such as the right to use a piece of property or other asset for some period of time, as products."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices.rdf version of the ontology was modified to replace additional concepts from several FIBO FND ontologies with their counterparts added to the Commons Ontology Library (Commons) v1.1."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices.rdf version of this ontology was revised to leverage the new party identifier."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices.rdf version of this ontology was revised move the definition of precious metal and the corresponding identifier to CurrencyAmount from this ontology to simplify imports in cases where the broader definitions for commodities are not required."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices.rdf version of this ontology was revised to eliminate deprecated elements."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices.rdf version of this ontology was revised to eliminate deprecated elements related to precious metals."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices.rdf version of this ontology was revised to eliminate duplication with concepts in LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices.rdf version of this ontology was modified to include classes to support automated inclusion of all ISO 4217 codes published as of 2018-06-04."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices.rdf version of this ontology was revised to add properties for hasBuyer and hasSeller, integrate properties with the party lattice, and clean-up circular or ambiguous definitions."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices.rdf version of this ontology was modified for the FIBO 2.0 RFC to add NegotiableCommodity and Consumer."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/"})

(def Buyer
  {:cmns-av/explanatoryNote
   "A buyer is the party that acquires, or agrees to acquire, ownership (in case of goods), or benefit or usage (in case of rights or services), something in the context of a sale, and may or may not be an end user of the product, good, service, or right.",
   :cmns-av/synonym #{"buyer" "purchaser"},
   :db/ident :fibo-fnd-pas-pas/Buyer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/"},
   :rdfs/label "buyer",
   :rdfs/subClassOf #{:cmns-pts/PartyRole
                      {:owl/onProperty     :fibo-fnd-pas-pas/buys,
                       :owl/someValuesFrom :fibo-fnd-pas-pas/Product,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "party that purchases something in exchange for money or other consideration under a contract of sale"})

(def Client
  {:db/ident :fibo-fnd-pas-pas/Client,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/"},
   :rdfs/label "client",
   :rdfs/subClassOf
   #{{:owl/onProperty     :cmns-rlcmp/isPlayedBy,
      :owl/someValuesFrom {:owl/onProperty :cmns-pts/isAPartyTo,
                           :owl/someValuesFrom
                           :fibo-fnd-pas-pas/ServiceAgreement,
                           :rdf/type :owl/Restriction},
      :rdf/type           :owl/Restriction} :cmns-pts/PartyRole},
   :skos/definition
   "party that purchases professional services from, or has a formal relationship to purchase services from another party"})

(def ClientIdentifier
  {:db/ident :fibo-fnd-pas-pas/ClientIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/"},
   :rdfs/label "client identifier",
   :rdfs/subClassOf #{{:owl/onClass    :fibo-fnd-pas-pas/Client,
                       :owl/onProperty :cmns-id/identifies,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      :fibo-fnd-pty-pty/PartyRoleIdentifier},
   :skos/definition
   "sequence of characters uniquely identifying a client within the context of some organization"})

(def Commodity
  {:cmns-av/explanatoryNote
   "Commodities are most often used as inputs in the production of other goods or services. The quality of a given commodity may differ slightly, but it is essentially uniform across producers.",
   :db/ident :fibo-fnd-pas-pas/Commodity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/"},
   :rdfs/label "commodity",
   :rdfs/subClassOf :fibo-fnd-pas-pas/Good,
   :skos/definition
   "material resource used in commerce that is interchangeable with other commodities of the same type"})

(def Consumer
  {:cmns-av/explanatoryNote
   "The general notion of a consumer includes an end user, and is not limited to a purchaser, in the distribution chain of a good or service",
   :db/ident :fibo-fnd-pas-pas/Consumer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/"},
   :rdfs/label "consumer",
   :rdfs/seeAlso {:xsd/anyURI "http://www.oecd.org/sti/consumer/"},
   :rdfs/subClassOf :cmns-pts/PartyRole,
   :skos/definition
   "party that utilizes economic goods or services, typically for personal, family, or household purposes"})

(def ContractualProduct
  {:cmns-av/explanatoryNote
   "This represents the case where the product itself is a contract, such as a life insurance policy or financial instrument, rather than a product or service whose terms of use, license to use, or terms of service are specified in a product.",
   :db/ident :fibo-fnd-pas-pas/ContractualProduct,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/"},
   :rdfs/label "contractual product",
   :rdfs/subClassOf :fibo-fnd-pas-pas/Product,
   :skos/definition "product that takes the form of an agreement"})

(def ContractualTemplateProduct
  {:db/ident :fibo-fnd-pas-pas/ContractualTemplateProduct,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/"},
   :rdfs/label "contractual template product",
   :rdfs/subClassOf #{:fibo-fnd-pas-pas/OffTheShelfProduct
                      :fibo-fnd-pas-pas/ContractualProduct},
   :skos/definition
   "contractual product that is finalized through specification of values for parameters defined in a template"})

(def CustomProduct
  {:cmns-av/synonym #{"custom-made product" "bespoke product"
                      "made to order product"},
   :db/ident :fibo-fnd-pas-pas/CustomProduct,
   :owl/disjointWith :fibo-fnd-pas-pas/OffTheShelfProduct,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/"},
   :rdfs/label "custom product",
   :rdfs/subClassOf :fibo-fnd-pas-pas/Product,
   :skos/definition
   "product that is made to order, commissioned based on a customer's specifications"})

(def Customer
  {:db/ident :fibo-fnd-pas-pas/Customer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/"},
   :rdfs/label "customer",
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fnd-pas-pas/buysFrom,
                       :owl/someValuesFrom :fibo-fnd-pas-pas/Supplier,
                       :rdf/type           :owl/Restriction}
                      :fibo-fnd-pas-pas/Buyer},
   :skos/definition
   "party that receives or consumes products (goods or services) and has the ability to choose between different products and suppliers"})

(def CustomerIdentifier
  {:db/ident :fibo-fnd-pas-pas/CustomerIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/"},
   :rdfs/label "customer identifier",
   :rdfs/subClassOf #{{:owl/onClass    :fibo-fnd-pas-pas/Customer,
                       :owl/onProperty :cmns-id/identifies,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      :fibo-fnd-pty-pty/PartyRoleIdentifier},
   :skos/definition
   "sequence of characters uniquely identifying a customer within the context of some organization"})

(def Good
  {:cmns-av/adaptedFrom
   #{{:xsd/anyURI "https://www.law.cornell.edu/ucc/9/9-102#goods"}
     {:xsd/anyURI "https://data.oecd.org/trade/trade-in-goods.htm"}},
   :cmns-av/explanatoryNote
   #{"From the Universal Commercial Code (UCC) in the United States, the term 'good' includes (i) fixtures, (ii) standing timber that is to be cut and removed under a conveyance or contract for sale, (iii) the unborn young of animals, (iv) crops grown, growing, or to be grown, even if the crops are produced on trees, vines, or bushes, and (v) manufactured homes. The term also includes a computer program embedded in goods and any supporting information provided in connection with a transaction relating to the program if (i) the program is associated with the goods in such a manner that it customarily is considered part of the goods, or (ii) by becoming the owner of the goods, a person acquires a right to use the program in connection with the goods. The term does not include a computer program embedded in goods that consist solely of the medium in which the program is embedded. The term also does not include accounts, chattel paper, commercial tort claims, deposit accounts, documents, general intangibles, instruments, investment property, letter-of-credit rights, letters of credit, money, or oil, gas, or other minerals before extraction."
     "An inherently useful and relatively scarce tangible item produced from agricultural, construction, manufacturing, or mining activities. Off-the-shelf products, including off-the-shelf software products and customization of software products, are generally considered to be goods. Energy, such as electricity, is also considered to be a good from a legal perspective, and meets the criteria of being manufactured or produced via some process, including but not limited to a mining process. According to the UN Convention On Contract For The International Sale Of Goods, the term 'good' does not include (1) items bought for personal use, (2) items bought at an auction or foreclosure sale, (3) aircraft or ocean-going vessels."},
   :db/ident :fibo-fnd-pas-pas/Good,
   :owl/disjointWith #{:fibo-fnd-plc-loc/RealEstate
                       :fibo-fnd-acc-cur/AmountOfMoney},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/"},
   :rdfs/label "good",
   :skos/definition
   "physical, produced item over which ownership rights can be established, whose ownership can be passed from one party to another by engaging in transactions, and that is not money or real estate"})

(def NegotiableCommodity
  {:db/ident :fibo-fnd-pas-pas/NegotiableCommodity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/"},
   :rdfs/label "negotiable commodity",
   :rdfs/subClassOf :fibo-fnd-pas-pas/Commodity,
   :skos/definition "commodity that can be bought or sold in some marketplace"})

(def OffTheShelfProduct
  {:cmns-av/abbreviation "COTS product",
   :cmns-av/synonym #{"commercially available off-the-shelf product"
                      "commercial off-the-shelf product"},
   :db/ident :fibo-fnd-pas-pas/OffTheShelfProduct,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/"},
   :rdfs/label "off-the-shelf product",
   :rdfs/subClassOf :fibo-fnd-pas-pas/Product,
   :skos/definition
   "product that is readily available from merchandise in stock, or can be quickly and easily configured to order, not specially designed or custom-made"})

(def Producer
  {:db/ident :fibo-fnd-pas-pas/Producer,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/"},
   :rdfs/label "producer",
   :rdfs/subClassOf #{:cmns-pts/PartyRole
                      {:owl/onProperty     :fibo-fnd-rel-rel/produces,
                       :owl/someValuesFrom :fibo-fnd-pas-pas/Good,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "grower, maker, fabricator, or manufacturer of some product or other good"})

(def Product
  {:cmns-av/explanatoryNote
   "Financial products include contracts that are developed via a financial service-specific process, such as a life insurance policy, demand deposit account or financial instrument, for example. Leases and rentals are similar in that they are initiated via some contractual development process, wherein the product is the right to use something for some period of time.",
   :db/ident :fibo-fnd-pas-pas/Product,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/"},
   :rdfs/label "product",
   :rdfs/subClassOf {:owl/unionOf [:fibo-fnd-pas-pas/Good
                                   :fibo-fnd-law-lcap/ContractualRight
                                   :fibo-fnd-pas-pas/Service],
                     :rdf/type    :owl/Class},
   :skos/definition
   "commercially distributed good that is (1) tangible property, (2) the output or result of a fabrication, manufacturing, or production process, or (3) something that passes through a distribution channel before being consumed or used."})

(def ProductIdentifier
  {:db/ident :fibo-fnd-pas-pas/ProductIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/"},
   :rdfs/label "product identifier",
   :rdfs/subClassOf #{:cmns-id/Identifier
                      {:owl/onClass    :fibo-fnd-pas-pas/Product,
                       :owl/onProperty :cmns-id/identifies,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "sequence of characters uniquely identifying a product in some context"})

(def Sale
  {:db/ident :fibo-fnd-pas-pas/Sale,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/"},
   :rdfs/label "sale",
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fnd-acc-cur/hasPrice,
                       :owl/someValuesFrom :fibo-fnd-acc-cur/MonetaryAmount,
                       :rdf/type           :owl/Restriction}
                      :fibo-fnd-pas-pas/TransactionEvent :cmns-pts/Situation
                      {:owl/onProperty     :cmns-cxtdsg/appliesTo,
                       :owl/someValuesFrom :fibo-fnd-pas-pas/Product,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :fibo-fnd-pas-pas/hasSeller,
                       :owl/someValuesFrom :fibo-fnd-pas-pas/Seller,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :fibo-fnd-pas-pas/hasBuyer,
                       :owl/someValuesFrom :fibo-fnd-pas-pas/Buyer,
                       :rdf/type           :owl/Restriction}},
   :skos/definition "exchange of goods or services for money"})

(def Seller
  {:cmns-av/synonym #{"vendor" "purveyor"},
   :db/ident :fibo-fnd-pas-pas/Seller,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/"},
   :rdfs/label "seller",
   :rdfs/subClassOf #{:cmns-pts/PartyRole
                      {:owl/onProperty     :fibo-fnd-pas-pas/sells,
                       :owl/someValuesFrom :fibo-fnd-pas-pas/Product,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "party that makes, offers or contracts to make a sale to an actual or potential buyer"})

(def Service
  {:cmns-av/explanatoryNote
   "Sometimes services are difficult to identify because they are closely associated with a good; such as the combination of a diagnosis with the administration of a medicine. No transfer of possession or ownership takes place when services are sold, and they (1) cannot be stored or transported, (2) are instantly perishable, and (3) come into existence at the time they are bought and consumed.",
   :db/ident :fibo-fnd-pas-pas/Service,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/"},
   :rdfs/label "service",
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fnd-rel-rel/provides,
                       :owl/someValuesFrom :fibo-fnd-plc-fac/Capability,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :fibo-fnd-rel-rel/isProvidedBy,
                       :owl/someValuesFrom :fibo-fnd-pas-pas/ServiceProvider,
                       :rdf/type           :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-fnd-pas-pas/ServiceProvider,
                       :owl/onProperty :fibo-fnd-pas-pas/isProvisionedBy,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "intangible activity performed by some party for the benefit of another party",
   :skos/example
   "Services include intangible products, such as accounting, banking, cleaning, consultancy, education, insurance, expertise, medical treatment, or transportation services."})

(def ServiceAgreement
  {:cmns-av/synonym "service contract",
   :db/ident :fibo-fnd-pas-pas/ServiceAgreement,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/"},
   :rdfs/label "service agreement",
   :rdfs/subClassOf #{:fibo-fnd-agr-ctr/MutualContractualAgreement
                      :fibo-fnd-agr-ctr/WrittenContract
                      {:owl/onClass    :fibo-fnd-pas-pas/ServiceProvider,
                       :owl/onProperty :fibo-fnd-agr-ctr/hasContractParty,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      {:owl/onProperty     :fibo-fnd-rel-rel/governs,
                       :owl/someValuesFrom :fibo-fnd-pas-pas/Service,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "written contract between a client and service provider whereby the service provider supplies some service in the form of time, effort, and/or expertise in exchange for compensation"})

(def ServiceProvider
  {:db/ident :fibo-fnd-pas-pas/ServiceProvider,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/"},
   :rdfs/label "service provider",
   :rdfs/subClassOf #{{:owl/onProperty     :fibo-fnd-rel-rel/provides,
                       :owl/someValuesFrom :fibo-fnd-pas-pas/Service,
                       :rdf/type           :owl/Restriction} :cmns-rlcmp/Role
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-fnd-plc-fac/Facility,
                       :owl/onProperty :fibo-fnd-pas-pas/provisions,
                       :rdf/type       :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-fnd-pas-pas/Service,
                       :owl/onProperty :fibo-fnd-pas-pas/provisions,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "party that provides and typically provisions professional services, such as consulting, financial, legal, real estate, education, communications, storage, or processing services, to other parties, typically defined in a service agreement"})

(def Supplier
  {:cmns-av/explanatoryNote
   "A supplier may be distinguished from a contractor or subcontractor, who commonly adds specialized input to deliverables.",
   :db/ident :fibo-fnd-pas-pas/Supplier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/"},
   :rdfs/label "supplier",
   :rdfs/subClassOf #{:cmns-pts/PartyRole
                      {:owl/onProperty     :fibo-fnd-pas-pas/supplies,
                       :owl/someValuesFrom :fibo-fnd-pas-pas/Product,
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "party that provides goods or services that some party wants or needs, especially over a long period of time"})

(def TransactionConfirmation
  {:db/ident :fibo-fnd-pas-pas/TransactionConfirmation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/"},
   :rdfs/label "transaction confirmation",
   :rdfs/subClassOf #{:cmns-doc/LegalDocument
                      {:owl/onClass    :fibo-fnd-pas-pas/TransactionEvent,
                       :owl/onProperty :fibo-fnd-agr-ctr/isEvidenceFor,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "written communication from a seller or service provider reciting the relevant details of a transaction"})

(def TransactionEvent
  {:db/ident :fibo-fnd-pas-pas/TransactionEvent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/"},
   :rdfs/label "transaction event",
   :rdfs/subClassOf #{:fibo-fnd-dt-oc/OccurrenceKind
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass :fibo-fnd-pas-pas/TransactionConfirmation,
                       :owl/onProperty :fibo-fnd-agr-ctr/isEvidencedBy,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "any sale, assignment, lease, license, loan, advance, contribution, or other transfer of any interest in or right to use any property (tangible or intangible) or money, however that transaction is effected, and regardless of whether the terms of the transaction are formally documented"})

(def buys
  {:db/ident :fibo-fnd-pas-pas/buys,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-pas-pas/Buyer,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/"},
   :rdfs/label "buys",
   :rdfs/range :fibo-fnd-pas-pas/Product,
   :skos/definition
   "links a party in the role of purchaser to something that they have purchased or plan to purchase"})

(def buysFrom
  {:db/ident :fibo-fnd-pas-pas/buysFrom,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-pas-pas/Buyer,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/"},
   :rdfs/label "buys from",
   :rdfs/range :fibo-fnd-pas-pas/Seller,
   :rdfs/subPropertyOf :cmns-pts/isAffectedBy,
   :skos/definition
   "links a party in the role of purchaser to a party from which they have made or are planning to make a purchase"})

(def hasBuyer
  {:db/ident :fibo-fnd-pas-pas/hasBuyer,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has buyer"},
   :rdfs/range :fibo-fnd-pas-pas/Buyer,
   :rdfs/subPropertyOf #{:cmns-pts/hasUndergoer :cmns-pts/hasPartyRole},
   :skos/definition
   "indicates the purchasing party in the context of a sales transaction"})

(def hasSeller
  {:db/ident :fibo-fnd-pas-pas/hasSeller,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has seller"},
   :rdfs/range :fibo-fnd-pas-pas/Seller,
   :rdfs/subPropertyOf :cmns-pts/hasActor,
   :skos/definition
   "indicates the vendor in the context of a sales transaction"})

(def isProvisionedBy
  {:db/ident :fibo-fnd-pas-pas/isProvisionedBy,
   :owl/inverseOf :fibo-fnd-pas-pas/provisions,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/"},
   :rdfs/label "is provisioned by",
   :rdfs/range :fibo-fnd-pas-pas/ServiceProvider,
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/isProvidedBy,
   :skos/definition
   "identifies the service provider that provisions the service or facility"})

(def isSuppliedBy
  {:db/ident :fibo-fnd-pas-pas/isSuppliedBy,
   :owl/inverseOf :fibo-fnd-pas-pas/supplies,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-pas-pas/Product,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/"},
   :rdfs/label "is supplied by",
   :rdfs/range :fibo-fnd-pas-pas/Supplier,
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/isProvidedBy,
   :skos/definition
   "identifies the party (supplier, vendor, distributor, etc.) that makes a product available"})

(def provisions
  {:db/ident :fibo-fnd-pas-pas/provisions,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-pas-pas/ServiceProvider,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/"},
   :rdfs/label "provisions",
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/provides,
   :skos/definition
   "customizes, provides, or outfits something required for use in delivering a service"})

(def sells
  {:db/ident :fibo-fnd-pas-pas/sells,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-pas-pas/Seller,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/"},
   :rdfs/label "sells",
   :rdfs/range :fibo-fnd-pas-pas/Product,
   :skos/definition
   "links a party in the role of broker, dealer, vendor, or merchandiser to something that they make available for sale"})

(def sellsTo
  {:db/ident :fibo-fnd-pas-pas/sellsTo,
   :owl/inverseOf :fibo-fnd-pas-pas/buysFrom,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-pas-pas/Seller,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/"},
   :rdfs/label "sells to",
   :rdfs/range :fibo-fnd-pas-pas/Buyer,
   :rdfs/subPropertyOf :cmns-pts/actsOn,
   :skos/definition
   "links a party in the role of broker, dealer, vendor, or merchandiser to a purchaser or potential purchasing party"})

(def supplies
  {:db/ident :fibo-fnd-pas-pas/supplies,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-pas-pas/Supplier,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/"},
   :rdfs/label "supplies",
   :rdfs/range :fibo-fnd-pas-pas/Product,
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/provides,
   :skos/definition
   "links a party in the role of outfitter, provisioner, distributor, etc. to something that they provide"})

(def urn:uuid:e4f6f843-189a-5fd3-b4fe-c6d184538022
  {:cmns-av/copyright
   #{"Copyright (c) 2013-2024 EDM Council, Inc."
     "Copyright (c) 2013-2024 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology defines fundamental concepts for buyers, sellers, clients, customers, products, goods and services for use in other FIBO ontologies.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Places/Locations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/RolesAndCompositions/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Law/LegalCapacity/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Documents/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/PartiesAndSituations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Agreements/Contracts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/DatesAndTimes/Occurrences/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Accounting/CurrencyAmount/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Parties/Parties/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/Places/Facilities/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q3/FND/ProductsAndServices/ProductsAndServices/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Products and Services Ontology",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices.rdf version of this ontology was modified per the issue resolutions identified in the FIBO FND 1.1 RTF report to replace MoneyAmount with AmountOfMoney."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices.rdf version of this ontology was modified to move (deprecate) the properties produces and isProducedBy to Relations for more general usability."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices.rdf version of the ontology was modified to replace concepts from several FIBO FND ontologies with their counterparts added to the Commons Ontology Library (Commons) v1.1."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices.rdf version of this ontology was revised to replace uses of hasTag in Relations with hasTag from LCC, as the more complex union of datatypes in the Relations concept is not needed here."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices.rdf version of this ontology was revised to incorporate the concept of a right into the definition of product, to cover leases and rentals, such as the right to use a piece of property or other asset for some period of time, as products."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices.rdf version of the ontology was modified to replace additional concepts from several FIBO FND ontologies with their counterparts added to the Commons Ontology Library (Commons) v1.1."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices.rdf version of this ontology was revised to leverage the new party identifier."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices.rdf version of this ontology was revised move the definition of precious metal and the corresponding identifier to CurrencyAmount from this ontology to simplify imports in cases where the broader definitions for commodities are not required."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices.rdf version of this ontology was revised to eliminate deprecated elements."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices.rdf version of this ontology was revised to eliminate deprecated elements related to precious metals."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices.rdf version of this ontology was revised to eliminate duplication with concepts in LCC."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices.rdf version of this ontology was modified to include classes to support automated inclusion of all ISO 4217 codes published as of 2018-06-04."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices.rdf version of this ontology was revised to add properties for hasBuyer and hasSeller, integrate properties with the party lattice, and clean-up circular or ambiguous definitions."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices.rdf version of this ontology was modified for the FIBO 2.0 RFC to add NegotiableCommodity and Consumer."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/ProductsAndServices/ProductsAndServices/"})