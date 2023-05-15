(ns net.wikipunk.rdf.fibo-fnd-oac-own
  "This ontology defines high-level, ownership-related concepts for use in other FIBO ontology elements. These include the concept of owner, asset and ownership along with relationships between them whereby an asset is some thing owned by some owner."
  {:cmns-av/copyright ["Copyright (c) 2013-2023 Object Management Group, Inc."
                       "Copyright (c) 2013-2023 EDM Council, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Ownership/",
   :dcterms/abstract
   "This ontology defines high-level, ownership-related concepts for use in other FIBO ontology elements. These include the concept of owner, asset and ownership along with relationships between them whereby an asset is some thing owned by some owner.",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Roles/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Parties/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://www.omg.org/spec/Commons/DatesAndTimes/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/OwnershipAndControl/Ownership/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-dt-fd"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
    "fibo-fnd-oac-own"
    "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Ownership/",
    "fibo-fnd-pty-pty"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-fnd-oac-own",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Ownership/",
   :rdfs/label "Ownership Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Ownership.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
    "The http://www.omg.org/spec/EDMC-FIBO/FND/20180801/OwnershipAndControl/Ownership.rdf version of the ontology was modified to revise the definition of Asset using the new CombinedDateTime datatype rather than xsd:dateTime to provide increased flexibility."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Ownership.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC), eliminating redundancies in FIBO as appropriate."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Ownership.rdf version of the ontology was modified to reflect the move of hasAquisitionDate from relations to financial dates and eliminate circular definitions."
    "The http://www.omg.org/spec/FIBO/Foundations/20130601/OwnershipAndControl/Ownership.owl version of the ontology was revised in advance of the September 2013 New Brunswick, NJ meeting, as follows:\n\t(1) to use slash style URI/IRIss (also called 303 URIs, vs. hash style) as required to support server side processing \n\t(2) to use version-independent IRIs for all definitions internally as opposed to version-specific IRIs\n\t(3) to change the file suffix from .owl to .rdf to increase usability in RDF tools\n\t(4) to use 4-level abbreviations and corresponding namespace prefixes for all FIBO ontologies, reflecting a family/specification/module/ontology structure\n\t(5) to incorporate changes to the specification metadata to support documentation at the family, specification, module, and ontology level, similar to the abbreviations."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Ownership.rdf version of the ontology was modified to integrate the concept of a situation, situational roles, and corresponding relations with the definition of ownership, and eliminate minimum cardinality of 1 in restrictions."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Ownership.rdf version of the ontology was modified to add definitions for tangible and intangible asset, etc., as needed for refinement of the concept of collateral and other loan-specific concepts."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Ownership.rdf version of the ontology was modified to address hygiene issues with respect to text formatting."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Ownership.rdf version of the ontology was modified to better align with revisions to the situation lattice."
    "The http://www.omg.org/spec/EDMC-FIBO/FND/20130801/OwnershipAndControl/Ownership.rdf version of the ontology was modified per the issue resolutions identified in the FIBO FND 1.0 FTF report and in http://www.omg.org/spec/EDMC-FIBO/FND/1.0/AboutFND-1.0/."]})

(def Asset
  "something of monetary value that is owned or provides benefit to some party"
  {:cmns-av/adaptedFrom
   "Financial Accounting Standards Board (FASB) Statement of Financial Accounting Concepts No. 6, Elements of Financial Statements, paragraph 25.",
   :cmns-av/explanatoryNote
   "An asset is something that provides probable future economic benefit obtained or controlled by some party as a result of past transactions or events. An asset has three essential characteristics: (a) it embodies a probable future benefit that involves a capacity, singly or in combination with other assets, to contribute directly or indirectly to future net cash inflows, (b) a party can obtain the benefit and control others' access to it, and (c) the transaction or other event giving rise to the party's right to or control of the benefit has already occurred.",
   :cmns-av/synonym "economic resource",
   :db/ident :fibo-fnd-oac-own/Asset,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Ownership/",
   :rdfs/label "asset",
   :rdfs/subClassOf [{:owl/onDataRange :cmns-dt/CombinedDateTime,
                      :owl/onProperty  :fibo-fnd-dt-fd/hasAcquisitionDate,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-oac-own/isOwnedAsset,
                      :owl/someValuesFrom :fibo-fnd-oac-own/Ownership,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-oac-own/isAssetOf,
                      :owl/someValuesFrom :fibo-fnd-oac-own/Owner,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-pty-pty/Undergoer
                     :fibo-fnd-oac-own/Asset],
   :skos/definition
   "something of monetary value that is owned or provides benefit to some party"})

(def IntangibleAsset
  "identifiable, non-monetary asset that lacks physical substance"
  {:cmns-av/explanatoryNote
   "Intangible assets include assets that may involve a legal claim to some future benefit, typically a claim to future cash. Intangible assets have become an increasingly larger component of the valuation for all companies, from newer social media companies to even the most established and iconic manufacturers.",
   :db/ident :fibo-fnd-oac-own/IntangibleAsset,
   :owl/disjointWith :fibo-fnd-oac-own/TangibleAsset,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Ownership/",
   :rdfs/label "intangible asset",
   :rdfs/subClassOf [:fibo-fnd-oac-own/Asset
                     :fibo-fnd-oac-own/IntangibleAsset
                     {:owl/onDataRange :cmns-dt/CombinedDateTime,
                      :owl/onProperty  :fibo-fnd-dt-fd/hasAcquisitionDate,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-oac-own/isOwnedAsset,
                      :owl/someValuesFrom :fibo-fnd-oac-own/Ownership,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-oac-own/isAssetOf,
                      :owl/someValuesFrom :fibo-fnd-oac-own/Owner,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-pty-pty/Undergoer],
   :skos/definition
   "identifiable, non-monetary asset that lacks physical substance",
   :skos/example
   "Intangible assets may include intellectual property, patents, copyrights, trademarks, rights-of-way (easements), brands, organizational abilities (know-how), and data."})

(def Owner
  "party that is legally recognized as having the right to possess, the privilege to use, and ability to transfer any rights or privileges associated with something, as permitted by law"
  {:db/ident :fibo-fnd-oac-own/Owner,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Ownership/",
   :rdfs/label "owner",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-oac-own/ownsAsset,
                      :owl/someValuesFrom :fibo-fnd-oac-own/Asset,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-oac-own/isOwningParty,
                      :owl/someValuesFrom :fibo-fnd-oac-own/Ownership,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-pty-pty/Actor
                     :fibo-fnd-oac-own/Owner],
   :skos/definition
   "party that is legally recognized as having the right to possess, the privilege to use, and ability to transfer any rights or privileges associated with something, as permitted by law"})

(def Ownership
  "situation in which some party holds the legal title to something (explicitly or implicitly) and has the right to transfer that title and/or possession"
  {:db/ident :fibo-fnd-oac-own/Ownership,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Ownership/",
   :rdfs/label #voc/lstr "ownership@en",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-oac-own/hasOwningParty,
                      :owl/someValuesFrom :fibo-fnd-oac-own/Owner,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-oac-own/hasOwnedAsset,
                      :owl/someValuesFrom :fibo-fnd-oac-own/Asset,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-pty-pty/Situation
                     :fibo-fnd-oac-own/Ownership],
   :skos/definition
   "situation in which some party holds the legal title to something (explicitly or implicitly) and has the right to transfer that title and/or possession"})

(def TangibleAsset
  "asset that is a physical, measurable resource, i.e., one that takes a physical form"
  {:cmns-av/explanatoryNote
   "Tangible assets include cash, cash equivalents and accounts receivables (AR), inventory, equipment, buildings and real estate, crops, and investments. Tangible assets such as art, furniture, stamps, gold, wine, toys and books of significant value may be included in an individual or organization's asset portfolio.",
   :db/ident :fibo-fnd-oac-own/TangibleAsset,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Ownership/",
   :rdfs/label "tangible asset",
   :rdfs/subClassOf [:fibo-fnd-oac-own/Asset
                     :fibo-fnd-oac-own/TangibleAsset
                     {:owl/onDataRange :cmns-dt/CombinedDateTime,
                      :owl/onProperty  :fibo-fnd-dt-fd/hasAcquisitionDate,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-oac-own/isOwnedAsset,
                      :owl/someValuesFrom :fibo-fnd-oac-own/Ownership,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-oac-own/isAssetOf,
                      :owl/someValuesFrom :fibo-fnd-oac-own/Owner,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-pty-pty/Undergoer],
   :skos/definition
   "asset that is a physical, measurable resource, i.e., one that takes a physical form"})

(def hasOwnedAsset
  "indicates the asset in an ownership situation"
  {:db/ident :fibo-fnd-oac-own/hasOwnedAsset,
   :owl/inverseOf :fibo-fnd-oac-own/isOwnedAsset,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-oac-own/Ownership,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Ownership/",
   :rdfs/label "has owned asset",
   :rdfs/range :fibo-fnd-oac-own/Asset,
   :rdfs/subPropertyOf [:fibo-fnd-pty-pty/hasUndergoer
                        :fibo-fnd-oac-own/hasOwnedAsset],
   :skos/definition "indicates the asset in an ownership situation"})

(def hasOwningParty
  "identifies the actor that holds title to the asset in an ownership situation"
  {:db/ident :fibo-fnd-oac-own/hasOwningParty,
   :owl/inverseOf :fibo-fnd-oac-own/isOwningParty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-oac-own/Ownership,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Ownership/",
   :rdfs/label "has owning party",
   :rdfs/range :fibo-fnd-oac-own/Owner,
   :rdfs/subPropertyOf [:fibo-fnd-pty-pty/hasActor
                        :fibo-fnd-oac-own/hasOwningParty],
   :skos/definition
   "identifies the actor that holds title to the asset in an ownership situation"})

(def isAssetOf
  "identifies the owner of an asset"
  {:db/ident :fibo-fnd-oac-own/isAssetOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-oac-own/Asset,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Ownership/",
   :rdfs/label "is asset of",
   :rdfs/range :fibo-fnd-oac-own/Owner,
   :rdfs/subPropertyOf [:fibo-fnd-pty-pty/isAffectedBy
                        :fibo-fnd-oac-own/isAssetOf],
   :skos/definition "identifies the owner of an asset"})

(def isOwnedAsset
  "indicates the context of ownership in which something is an asset"
  {:db/ident :fibo-fnd-oac-own/isOwnedAsset,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-oac-own/Asset,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Ownership/",
   :rdfs/label "is owned asset",
   :rdfs/range :fibo-fnd-oac-own/Ownership,
   :rdfs/subPropertyOf [:fibo-fnd-pty-pty/undergoes
                        :fibo-fnd-oac-own/isOwnedAsset],
   :skos/definition
   "indicates the context of ownership in which something is an asset"})

(def isOwnedBy
  "indicates something that someone owns"
  {:db/ident :fibo-fnd-oac-own/isOwnedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Ownership/",
   :rdfs/label "is owned by",
   :rdfs/range :fibo-fnd-pty-pty/IndependentParty,
   :rdfs/subPropertyOf [:fibo-fnd-pty-pty/experiencesDirectly
                        :fibo-fnd-oac-own/isOwnedBy],
   :skos/definition "indicates something that someone owns"})

(def isOwningParty
  "indicates the context of ownership in which the party plays the role of owner"
  {:db/ident :fibo-fnd-oac-own/isOwningParty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-oac-own/Owner,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Ownership/",
   :rdfs/label "is owning party",
   :rdfs/range :fibo-fnd-oac-own/Ownership,
   :rdfs/subPropertyOf [:fibo-fnd-pty-pty/actsIn
                        :fibo-fnd-oac-own/isOwningParty],
   :skos/definition
   "indicates the context of ownership in which the party plays the role of owner"})

(def owns
  "indicates something that a party holds title to and may possess"
  {:db/ident :fibo-fnd-oac-own/owns,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-pty-pty/IndependentParty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Ownership/",
   :rdfs/label "owns",
   :rdfs/subPropertyOf [:fibo-fnd-pty-pty/playsActiveRoleThatDirectlyAffects
                        :fibo-fnd-oac-own/owns],
   :skos/definition
   "indicates something that a party holds title to and may possess"})

(def ownsAsset
  "identifies an asset that an owner owns"
  {:db/ident :fibo-fnd-oac-own/ownsAsset,
   :owl/inverseOf :fibo-fnd-oac-own/isAssetOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-oac-own/Owner,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/Ownership/",
   :rdfs/label "is asset owner",
   :rdfs/range :fibo-fnd-oac-own/Asset,
   :rdfs/subPropertyOf [:fibo-fnd-pty-pty/actsOn :fibo-fnd-oac-own/ownsAsset],
   :skos/definition "identifies an asset that an owner owns"})