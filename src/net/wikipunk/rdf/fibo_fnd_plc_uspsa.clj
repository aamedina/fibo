(ns net.wikipunk.rdf.fibo-fnd-plc-uspsa
  "This ontology augments the Addresses ontology in FND with concepts that conform to the USPS Pub 28. The USPS provides automated address verification services that use the concepts defined herein for that purpose, and which many financial services entities use for data quality purposes."
  {:cmns-av/copyright ["Copyright (c) 2019-2023 EDM Council, Inc."
                       "Copyright (c) 2019-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/",
   :dcterms/abstract
   "This ontology augments the Addresses ontology in FND with concepts that conform to the USPS Pub 28. The USPS provides automated address verification services that use the concepts defined herein for that purpose, and which many financial services entities use for data quality purposes.",
   :dcterms/contributor "Thematix Partners LLC",
   :dcterms/license "https://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Locations/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Addresses/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/NorthAmerica/USPostalServiceAddresses/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-plc-adr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/",
    "fibo-fnd-plc-loc"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Locations/",
    "fibo-fnd-plc-uspsa"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "lcc-lr" "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/",
   :rdfa/prefix "fibo-fnd-plc-uspsa",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/",
   :rdfs/label "U.S. Postal Service Addresses Ontology",
   :rdfs/seeAlso ["https://about.usps.com/who/profile/"
                  "https://pe.usps.com/cpim/ftp/pubs/Pub28/pub28.pdf"],
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses.rdf version of this ontology was revised to replace uses of hasTag in Relations with hasTag from LCC, as the more complex union of datatypes in the Relations concept is not needed here, and correct a duplicate label."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses.rdf version of this ontology was revised to address hygiene issues with respect to text formatting."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."]})

(def CompleteAddress
  "delivery address that has all the address elements necessary to allow an exact match with the current Postal Service ZIP+4 and City State files to obtain the finest level of ZIP+4 and delivery point codes for the delivery address"
  {:cmns-av/explanatoryNote
   "A complete address may be required on mail at some automation rates.",
   :db/ident :fibo-fnd-plc-uspsa/CompleteAddress,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/",
   :rdfs/label "complete address",
   :rdfs/subClassOf :fibo-fnd-plc-uspsa/StandardizedAddress,
   :skos/definition
   "delivery address that has all the address elements necessary to allow an exact match with the current Postal Service ZIP+4 and City State files to obtain the finest level of ZIP+4 and delivery point codes for the delivery address"})

(def DeliveryAddressCodeSet
  "system of numeric codes that substitute for specified delivery point details according to the U.S. Postal Service Publication 28"
  {:db/ident :fibo-fnd-plc-uspsa/DeliveryAddressCodeSet,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/",
   :rdfs/label "delivery address code set",
   :rdfs/seeAlso ["https://pe.usps.com/cpim/ftp/pubs/Pub28/pub28.pdf"],
   :rdfs/subClassOf [{:owl/onProperty :lcc-lr/hasMember,
                      :owl/someValuesFrom
                      :fibo-fnd-plc-uspsa/USPostalServiceAddressIdentifier,
                      :rdf/type :owl/Restriction}
                     :lcc-lr/IdentificationScheme
                     :lcc-lr/CodeSet],
   :skos/definition
   "system of numeric codes that substitute for specified delivery point details according to the U.S. Postal Service Publication 28"})

(def DeliveryPointCode
  "specific set of digits between 00 and 99 assigned to a delivery point"
  {:cmns-av/explanatoryNote
   "When combined with the ZIP + 4 code, the delivery point code provides a unique identifier for every deliverable address served by the USPS. The delivery point digits are almost never printed on mail in human-readable form; instead they are encoded in the POSTNET delivery point barcode (DPBC) or as part of the newer Intelligent Mail Barcode (IMB).",
   :db/ident :fibo-fnd-plc-uspsa/DeliveryPointCode,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/",
   :rdfs/label "delivery point code",
   :rdfs/seeAlso ["https://pe.usps.com/cpim/ftp/pubs/Pub28/pub28.pdf"],
   :rdfs/subClassOf [{:owl/onDataRange :xsd/string,
                      :owl/onProperty  :lcc-lr/hasTag,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/onClass    :fibo-fnd-plc-uspsa/DeliveryPointCodeSet,
                      :owl/onProperty :lcc-lr/isMemberOf,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :lcc-lr/CodeElement],
   :skos/definition
   "specific set of digits between 00 and 99 assigned to a delivery point"})

(def DeliveryPointCodeSet
  "system of numeric codes that substitute for specified delivery point details according to the U.S. Postal Service Publication 28"
  {:db/ident :fibo-fnd-plc-uspsa/DeliveryPointCodeSet,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/",
   :rdfs/label "delivery point code set",
   :rdfs/seeAlso ["https://pe.usps.com/cpim/ftp/pubs/Pub28/pub28.pdf"],
   :rdfs/subClassOf [{:owl/onProperty     :lcc-lr/hasMember,
                      :owl/someValuesFrom :fibo-fnd-plc-uspsa/DeliveryPointCode,
                      :rdf/type           :owl/Restriction}
                     :lcc-lr/CodeSet],
   :skos/definition
   "system of numeric codes that substitute for specified delivery point details according to the U.S. Postal Service Publication 28"})

(def DepartmentOfStateAddress
  "delivery address whose delivery address line uses 'UNIT' followed by the unit identifier, followed by 'BOX' followed by box number, in place of a street address, 'DPO' as the literal value for the city, and the appropriate armed forces subdivision code in place of a subdivision (state) code"
  {:db/ident :fibo-fnd-plc-uspsa/DepartmentOfStateAddress,
   :owl/disjointWith :fibo-fnd-plc-adr/ConventionalStreetAddress,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/",
   :rdfs/label "Department of State address",
   :rdfs/subClassOf [{:owl/onClass    :fibo-fnd-plc-uspsa/Mailbox,
                      :owl/onProperty :fibo-fnd-rel-rel/comprises,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass
                      :fibo-fnd-plc-uspsa/DepartmentOfStateUnitComponent,
                      :owl/onProperty :fibo-fnd-rel-rel/comprises,
                      :owl/qualifiedCardinality 1,
                      :rdf/type :owl/Restriction}
                     {:owl/hasValue   {:xsd/string "DPO"},
                      :owl/onProperty :fibo-fnd-plc-loc/hasCityName,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-plc-adr/PhysicalAddress],
   :skos/definition
   "delivery address whose delivery address line uses 'UNIT' followed by the unit identifier, followed by 'BOX' followed by box number, in place of a street address, 'DPO' as the literal value for the city, and the appropriate armed forces subdivision code in place of a subdivision (state) code"})

(def DepartmentOfStateUnitComponent
  "component of a Department of State address that includes 'UNIT' followed by the unit identifier"
  {:db/ident :fibo-fnd-plc-uspsa/DepartmentOfStateUnitComponent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/",
   :rdfs/label "Department of State unit component",
   :rdfs/subClassOf [{:owl/hasValue   :fibo-fnd-plc-adr/Unit,
                      :owl/onProperty :fibo-fnd-rel-rel/comprises,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-plc-adr/SupplementalAddressComponent],
   :skos/definition
   "component of a Department of State address that includes 'UNIT' followed by the unit identifier"})

(def East
  "geographic directional symbol for East"
  {:db/ident :fibo-fnd-plc-uspsa/East,
   :lcc-lr/hasTag "E",
   :rdf/type [:fibo-fnd-plc-adr/GeographicDirectionalSymbol
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/",
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "Este"}
                {:rdf/language "en",
                 :rdf/value    "East"}],
   :skos/definition "geographic directional symbol for East"})

(def GeneralDeliveryAddress
  "delivery address that uses the words 'GENERAL DELIVERY', uppercase preferred, spelled out (no abbreviation), in place of a street address"
  {:cmns-av/explanatoryNote
   "The value of the +4 component of a ZIP+4 code should be '9999'.",
   :db/ident :fibo-fnd-plc-uspsa/GeneralDeliveryAddress,
   :owl/disjointWith :fibo-fnd-plc-adr/ConventionalStreetAddress,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/",
   :rdfs/label "general delivery address",
   :rdfs/subClassOf [{:owl/hasValue   {:xsd/string "GENERAL DELIVERY"},
                      :owl/onProperty :fibo-fnd-plc-adr/hasAddressLine1,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-plc-adr/PhysicalAddress],
   :skos/definition
   "delivery address that uses the words 'GENERAL DELIVERY', uppercase preferred, spelled out (no abbreviation), in place of a street address"})

(def HighwayContractRoute
  "highway contract route associated with an address"
  {:db/ident :fibo-fnd-plc-uspsa/HighwayContractRoute,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/",
   :rdfs/label "highway contract route",
   :rdfs/subClassOf [{:owl/hasValue
                      :fibo-fnd-plc-uspsa/HighwayContractRouteDesignator,
                      :owl/onProperty :fibo-fnd-rel-rel/comprises,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-plc-adr/SupplementalAddressComponent],
   :skos/definition "highway contract route associated with an address"})

(def HighwayContractRouteAddress
  "delivery address whose delivery address line uses the abbreviation 'HC', followed by the route identifier, followed by 'BOX' followed by box number, in place of a street address"
  {:db/ident :fibo-fnd-plc-uspsa/HighwayContractRouteAddress,
   :owl/disjointWith :fibo-fnd-plc-adr/ConventionalStreetAddress,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/",
   :rdfs/label "highway contract address",
   :rdfs/subClassOf [{:owl/onClass    :fibo-fnd-plc-uspsa/Mailbox,
                      :owl/onProperty :fibo-fnd-rel-rel/comprises,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-fnd-plc-uspsa/HighwayContractRoute,
                      :owl/onProperty :fibo-fnd-rel-rel/comprises,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-plc-adr/PhysicalAddress],
   :skos/definition
   "delivery address whose delivery address line uses the abbreviation 'HC', followed by the route identifier, followed by 'BOX' followed by box number, in place of a street address"})

(def HighwayContractRouteDesignator
  "designator for a route served by an independent contractor rather than directly by the U.S. Postal Service"
  {:db/ident :fibo-fnd-plc-uspsa/HighwayContractRouteDesignator,
   :fibo-fnd-utl-av/preferredDesignation "HC",
   :rdf/type [:fibo-fnd-plc-adr/SupplementalAddressDesignator
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/",
   :rdfs/label "highway contract route designator",
   :skos/definition
   "designator for a route served by an independent contractor rather than directly by the U.S. Postal Service"})

(def InternationalAddress
  "physical address that explicitly includes a country"
  {:db/ident :fibo-fnd-plc-uspsa/InternationalAddress,
   :owl/equivalentClass {:owl/onClass    :lcc-cr/Country,
                         :owl/onProperty :fibo-fnd-plc-loc/hasCountry,
                         :owl/qualifiedCardinality 1,
                         :rdf/type       :owl/Restriction},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/",
   :rdfs/label "international address",
   :rdfs/subClassOf :fibo-fnd-plc-adr/PhysicalAddress,
   :skos/definition "physical address that explicitly includes a country"})

(def Mailbox
  "mailbox, other than a U.S. Post Office box, associated with an address"
  {:db/ident :fibo-fnd-plc-uspsa/Mailbox,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/",
   :rdfs/label "mailbox",
   :rdfs/subClassOf [{:owl/hasValue   :fibo-fnd-plc-uspsa/MailboxDesignator,
                      :owl/onProperty :fibo-fnd-rel-rel/comprises,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-plc-adr/SupplementalAddressComponent],
   :skos/definition
   "mailbox, other than a U.S. Post Office box, associated with an address"})

(def MailboxDesignator
  "designator for a mail box other than a U.S. Post Office box"
  {:db/ident :fibo-fnd-plc-uspsa/MailboxDesignator,
   :fibo-fnd-utl-av/preferredDesignation "BOX",
   :rdf/type [:fibo-fnd-plc-adr/SupplementalAddressDesignator
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/",
   :rdfs/label "mailbox designator",
   :skos/definition
   "designator for a mail box other than a U.S. Post Office box"})

(def North
  "geographic directional symbol for North"
  {:db/ident :fibo-fnd-plc-uspsa/North,
   :lcc-lr/hasTag "N",
   :rdf/type [:fibo-fnd-plc-adr/GeographicDirectionalSymbol
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "North"}
                {:rdf/language "es",
                 :rdf/value    "Norte"}],
   :skos/definition "geographic directional symbol for North"})

(def Northeast
  "geographic directional symbol for Northeast"
  {:db/ident :fibo-fnd-plc-uspsa/Northeast,
   :lcc-lr/hasTag "NE",
   :rdf/type [:fibo-fnd-plc-adr/GeographicDirectionalSymbol
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Northeast"}
                {:rdf/language "es",
                 :rdf/value    "Noreste"}],
   :skos/definition "geographic directional symbol for Northeast"})

(def Northwest
  "geographic directional symbol for Northwest"
  {:db/ident :fibo-fnd-plc-uspsa/Northwest,
   :lcc-lr/hasTag ["NW" "NO"],
   :rdf/type [:fibo-fnd-plc-adr/GeographicDirectionalSymbol
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Northwest"}
                {:rdf/language "es",
                 :rdf/value    "Noroeste"}],
   :skos/definition "geographic directional symbol for Northwest"})

(def OverseasMilitaryAddress
  "delivery address whose delivery address line uses an abbreviation for the unit or command such as 'CMR', 'PSC', or 'UNIT', or 'HC', followed by the unit identifier, followed by 'BOX' followed by box number, in place of a street address, either 'APO' or 'FPO' as the literal value for the city and the appropriate armed forces subdivision code in place of a subdivision (state) code"
  {:db/ident :fibo-fnd-plc-uspsa/OverseasMilitaryAddress,
   :owl/disjointWith :fibo-fnd-plc-adr/ConventionalStreetAddress,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/",
   :rdfs/label "overseas military address",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-plc-loc/hasCityName,
                      :owl/someValuesFrom {:owl/oneOf [{:xsd/string "APO"}
                                                       {:xsd/string "FPO"}],
                                           :rdf/type  :rdfs/Datatype},
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-plc-adr/hasAddressLine1,
                      :owl/someValuesFrom :rdfs/Literal,
                      :rdf/type           :owl/Restriction}
                     :fibo-fnd-plc-adr/PhysicalAddress],
   :skos/definition
   "delivery address whose delivery address line uses an abbreviation for the unit or command such as 'CMR', 'PSC', or 'UNIT', or 'HC', followed by the unit identifier, followed by 'BOX' followed by box number, in place of a street address, either 'APO' or 'FPO' as the literal value for the city and the appropriate armed forces subdivision code in place of a subdivision (state) code"})

(def PrivateMailBoxAddress
  "delivery address provided by a commercial mail receiving company that includes a supplementary address line containing the abbreviation 'PMB' or the pound \"#\" symbol followed by the mailbox number; alternatively, 'PMB' or '#\" and the mailbox number can be appended to the street address"
  {:db/ident :fibo-fnd-plc-uspsa/PrivateMailBoxAddress,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/",
   :rdfs/label "private mail box address",
   :rdfs/subClassOf :fibo-fnd-plc-adr/ConventionalStreetAddress,
   :skos/definition
   "delivery address provided by a commercial mail receiving company that includes a supplementary address line containing the abbreviation 'PMB' or the pound \"#\" symbol followed by the mailbox number; alternatively, 'PMB' or '#\" and the mailbox number can be appended to the street address"})

(def PuertoRicoAddress
  "delivery address for a delivery point in Puerto Rico that may include a supplementary address line containing the abbreviation 'URB' followed by the name of the urbanization area that is appropriate for that address"
  {:db/ident :fibo-fnd-plc-uspsa/PuertoRicoAddress,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/",
   :rdfs/label "Puerto Rico address",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-plc-uspsa/Urbanization,
                      :owl/onProperty :fibo-fnd-rel-rel/comprises,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-plc-adr/ConventionalStreetAddress],
   :skos/definition
   "delivery address for a delivery point in Puerto Rico that may include a supplementary address line containing the abbreviation 'URB' followed by the name of the urbanization area that is appropriate for that address"})

(def RuralRoute
  "mail route outside the city or township limits in a rural area associated with an address"
  {:db/ident :fibo-fnd-plc-uspsa/RuralRoute,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/",
   :rdfs/label "highway contract route address",
   :rdfs/subClassOf [{:owl/hasValue   :fibo-fnd-plc-uspsa/RuralRouteDesignator,
                      :owl/onProperty :fibo-fnd-rel-rel/comprises,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-plc-adr/SupplementalAddressComponent],
   :skos/definition
   "mail route outside the city or township limits in a rural area associated with an address"})

(def RuralRouteAddress
  "delivery address whose delivery address line uses the abbreviation 'RR', followed by the route identifier, followed by 'BOX' followed by box number, in place of a street address"
  {:db/ident :fibo-fnd-plc-uspsa/RuralRouteAddress,
   :owl/disjointWith :fibo-fnd-plc-adr/ConventionalStreetAddress,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/",
   :rdfs/label "rural route address",
   :rdfs/subClassOf [{:owl/onClass    :fibo-fnd-plc-uspsa/RuralRoute,
                      :owl/onProperty :fibo-fnd-rel-rel/comprises,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-fnd-plc-uspsa/Mailbox,
                      :owl/onProperty :fibo-fnd-rel-rel/comprises,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-plc-adr/PhysicalAddress],
   :skos/definition
   "delivery address whose delivery address line uses the abbreviation 'RR', followed by the route identifier, followed by 'BOX' followed by box number, in place of a street address"})

(def RuralRouteDesignator
  "designator for a mail route outside the city or township limits in a rural area"
  {:db/ident :fibo-fnd-plc-uspsa/RuralRouteDesignator,
   :fibo-fnd-utl-av/preferredDesignation "RR",
   :rdf/type [:fibo-fnd-plc-adr/SupplementalAddressDesignator
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/",
   :rdfs/label "rural route designator",
   :skos/definition
   "designator for a mail route outside the city or township limits in a rural area"})

(def South
  "geographic directional symbol for South"
  {:db/ident :fibo-fnd-plc-uspsa/South,
   :lcc-lr/hasTag "S",
   :rdf/type [:fibo-fnd-plc-adr/GeographicDirectionalSymbol
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/",
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "Sur"}
                {:rdf/language "en",
                 :rdf/value    "South"}],
   :skos/definition "geographic directional symbol for South"})

(def Southeast
  "geographic directional symbol for Southeast"
  {:db/ident :fibo-fnd-plc-uspsa/Southeast,
   :lcc-lr/hasTag "SE",
   :rdf/type [:fibo-fnd-plc-adr/GeographicDirectionalSymbol
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/",
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "Sureste"}
                {:rdf/language "en",
                 :rdf/value    "Southeast"}],
   :skos/definition "geographic directional symbol for Southeast"})

(def Southwest
  "geographic directional symbol for Southwest"
  {:db/ident :fibo-fnd-plc-uspsa/Southwest,
   :lcc-lr/hasTag ["SW" "SO"],
   :rdf/type [:fibo-fnd-plc-adr/GeographicDirectionalSymbol
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/",
   :rdfs/label [{:rdf/language "es",
                 :rdf/value    "Suroeste"}
                {:rdf/language "en",
                 :rdf/value    "Southwest"}],
   :skos/definition "geographic directional symbol for Southwest"})

(def StandardizedAddress
  "delivery address that is fully spelled out, abbreviated by using the Postal Service standard abbreviations or as given in the current Postal Service ZIP+4 file"
  {:db/ident :fibo-fnd-plc-uspsa/StandardizedAddress,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/",
   :rdfs/label "standardized address",
   :rdfs/subClassOf :fibo-fnd-plc-adr/PhysicalAddress,
   :skos/definition
   "delivery address that is fully spelled out, abbreviated by using the Postal Service standard abbreviations or as given in the current Postal Service ZIP+4 file"})

(def USPostOfficeBoxDesignator
  "designator for a U.S. Post Office box"
  {:db/ident :fibo-fnd-plc-uspsa/USPostOfficeBoxDesignator,
   :fibo-fnd-utl-av/preferredDesignation "PO BOX",
   :rdf/type [:fibo-fnd-plc-adr/PostOfficeBoxDesignator :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/",
   :rdfs/label "post office box designator",
   :skos/definition "designator for a U.S. Post Office box"})

(def USPostalServiceAddressIdentifier
  "combined with the ZIP + 4 code, the delivery point code provides a unique identifier for every deliverable address served by the USPS"
  {:cmns-av/explanatoryNote
   "The delivery point digits are almost never printed on mail in human-readable form; instead they are encoded in the POSTNET delivery point barcode (DPBC) or as part of the newer Intelligent Mail Barcode (IMB).",
   :db/ident :fibo-fnd-plc-uspsa/USPostalServiceAddressIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/",
   :rdfs/label "U.S. Postal Service address identifier",
   :rdfs/subClassOf [{:owl/onClass    :fibo-fnd-plc-uspsa/ZIPPlus4Code,
                      :owl/onProperty :fibo-fnd-rel-rel/comprises,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-fnd-plc-uspsa/DeliveryPointCode,
                      :owl/onProperty :fibo-fnd-rel-rel/comprises,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-plc-adr/PhysicalAddressIdentifier],
   :skos/definition
   "combined with the ZIP + 4 code, the delivery point code provides a unique identifier for every deliverable address served by the USPS"})

(def Urbanization
  "an area, sector, or development within a larger geographic area"
  {:cmns-av/explanatoryNote
   "This URB descriptor, commonly used in urban areas of Puerto Rico, is an important part of the addressing format, as it describes the location of a given street.",
   :db/ident :fibo-fnd-plc-uspsa/Urbanization,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/",
   :rdfs/label "urbanization",
   :rdfs/subClassOf :lcc-cr/CountrySubdivision,
   :skos/definition
   "an area, sector, or development within a larger geographic area"})

(def West
  "geographic directional symbol for West"
  {:db/ident :fibo-fnd-plc-uspsa/West,
   :lcc-lr/hasTag ["W" "O"],
   :rdf/type [:fibo-fnd-plc-adr/GeographicDirectionalSymbol
              :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "West"}
                {:rdf/language "es",
                 :rdf/value    "Oeste"}],
   :skos/definition "geographic directional symbol for West"})

(def ZIPCode
  "five-digit code code assigned to a delivery address indicating the state and post office or postal zone"
  {:db/ident :fibo-fnd-plc-uspsa/ZIPCode,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/",
   :rdfs/label "Zip Code",
   :rdfs/subClassOf :fibo-fnd-plc-adr/Postcode,
   :skos/definition
   "five-digit code code assigned to a delivery address indicating the state and post office or postal zone"})

(def ZIPPlus4Code
  "nine-digit number consisting of five digits, a hyphen, and four digits, which the USPS describes by its trademark ZIP+4"
  {:cmns-av/explanatoryNote
   "The correct format for a numeric ZIP+4 code is five digits, a hyphen, and four digits. The first five digits represent the 5-digit ZIP Code; the sixth and seventh digits (the first two after the hyphen) identify an area known as a sector; the eighth and ninth digits identify a smaller area known as a segment. Together, the final four digits identify geographic units such as a side of a street between intersections, both sides of a street between intersections, a building, a floor or group of floors in a building, a firm within a building, a span of boxes on a rural route, or a group of Post Office boxes to which a single USPS employee makes delivery.",
   :db/ident :fibo-fnd-plc-uspsa/ZIPPlus4Code,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/",
   :rdfs/label "ZIP+4 Code",
   :rdfs/subClassOf :fibo-fnd-plc-adr/Postcode,
   :skos/definition
   "nine-digit number consisting of five digits, a hyphen, and four digits, which the USPS describes by its trademark ZIP+4"})

(def ZipCodeScheme
  "system used in the U.S. to facilitate the delivery of mail, consisting of a five- or nine-digit code Zone Improvement Plan (ZIP) printed directly after the address, the first five digits (initial code) indicating the state and post office or postal zone, the last four (expanded code) the box section or number, portion of a rural route, building, or other specific delivery location"
  {:db/ident :fibo-fnd-plc-uspsa/ZipCodeScheme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/",
   :rdfs/label "zip code scheme",
   :rdfs/seeAlso ["https://pe.usps.com/cpim/ftp/pubs/Pub28/pub28.pdf"],
   :rdfs/subClassOf [{:owl/onProperty     :lcc-lr/hasMember,
                      :owl/someValuesFrom {:owl/unionOf
                                           [:fibo-fnd-plc-uspsa/ZIPCode
                                            :fibo-fnd-plc-uspsa/ZIPPlus4Code],
                                           :rdf/type :owl/Class},
                      :rdf/type           :owl/Restriction}
                     :lcc-lr/IdentificationScheme
                     :lcc-lr/CodeSet],
   :skos/definition
   "system used in the U.S. to facilitate the delivery of mail, consisting of a five- or nine-digit code Zone Improvement Plan (ZIP) printed directly after the address, the first five digits (initial code) indicating the state and post office or postal zone, the last four (expanded code) the box section or number, portion of a rural route, building, or other specific delivery location"})

(def hasUrbanization
  "indicates area, sector, or development within a geographic area relevant to a delivery address"
  {:db/ident :fibo-fnd-plc-uspsa/hasUrbanization,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/",
   :rdfs/label "has urbanization",
   :rdfs/range :fibo-fnd-plc-uspsa/Urbanization,
   :rdfs/subPropertyOf :fibo-fnd-rel-rel/comprises,
   :skos/definition
   "indicates area, sector, or development within a geographic area relevant to a delivery address"})

(def ^{:private true} Apartment
  "apartmento"
  {:db/ident   :fibo-fnd-plc-adr/Apartment,
   :fibo-fnd-utl-av/preferredDesignation "APT",
   :rdf/type   :owl/NamedIndividual,
   :rdfs/label {:rdf/language "es",
                :rdf/value    "apartmento"}})

(def ^{:private true} Basement
  {:db/ident :fibo-fnd-plc-adr/Basement,
   :fibo-fnd-utl-av/preferredDesignation "BSMT",
   :rdf/type :owl/NamedIndividual})

(def ^{:private true} Building
  {:db/ident :fibo-fnd-plc-adr/Building,
   :fibo-fnd-utl-av/preferredDesignation "BLDG",
   :rdf/type :owl/NamedIndividual})

(def ^{:private true} Department
  "departamento"
  {:db/ident   :fibo-fnd-plc-adr/Department,
   :fibo-fnd-utl-av/preferredDesignation "DEPT",
   :rdf/type   :owl/NamedIndividual,
   :rdfs/label {:rdf/language "es",
                :rdf/value    "departamento"}})

(def ^{:private true} Floor
  {:db/ident :fibo-fnd-plc-adr/Floor,
   :fibo-fnd-utl-av/preferredDesignation "FL",
   :rdf/type :owl/NamedIndividual})

(def ^{:private true} Front
  {:db/ident :fibo-fnd-plc-adr/Front,
   :fibo-fnd-utl-av/preferredDesignation "FRNT",
   :rdf/type :owl/NamedIndividual})

(def ^{:private true} GeographicDirectionalSymbol
  {:db/ident :fibo-fnd-plc-adr/GeographicDirectionalSymbol,
   :owl/equivalentClass {:owl/oneOf [:fibo-fnd-plc-uspsa/East
                                     :fibo-fnd-plc-uspsa/North
                                     :fibo-fnd-plc-uspsa/Northeast
                                     :fibo-fnd-plc-uspsa/Northwest
                                     :fibo-fnd-plc-uspsa/South
                                     :fibo-fnd-plc-uspsa/Southeast
                                     :fibo-fnd-plc-uspsa/Southwest
                                     :fibo-fnd-plc-uspsa/West],
                         :rdf/type  :owl/Class},
   :rdf/type :owl/Class})

(def ^{:private true} Hangar
  {:db/ident :fibo-fnd-plc-adr/Hangar,
   :fibo-fnd-utl-av/preferredDesignation "HNGR",
   :rdf/type :owl/NamedIndividual})

(def ^{:private true} Key
  {:db/ident :fibo-fnd-plc-adr/Key,
   :fibo-fnd-utl-av/preferredDesignation "KEY",
   :rdf/type :owl/NamedIndividual})

(def ^{:private true} Lobby
  {:db/ident :fibo-fnd-plc-adr/Lobby,
   :fibo-fnd-utl-av/preferredDesignation "LBBY",
   :rdf/type :owl/NamedIndividual})

(def ^{:private true} Lot
  {:db/ident :fibo-fnd-plc-adr/Lot,
   :fibo-fnd-utl-av/preferredDesignation "LOT",
   :rdf/type :owl/NamedIndividual})

(def ^{:private true} Lower
  {:db/ident :fibo-fnd-plc-adr/Lower,
   :fibo-fnd-utl-av/preferredDesignation "LOWR",
   :rdf/type :owl/NamedIndividual})

(def ^{:private true} Office
  {:db/ident :fibo-fnd-plc-adr/Office,
   :fibo-fnd-utl-av/preferredDesignation "OFC",
   :rdf/type :owl/NamedIndividual})

(def ^{:private true} Penthouse
  {:db/ident :fibo-fnd-plc-adr/Penthouse,
   :fibo-fnd-utl-av/preferredDesignation "PH",
   :rdf/type :owl/NamedIndividual})

(def ^{:private true} Pier
  {:db/ident :fibo-fnd-plc-adr/Pier,
   :fibo-fnd-utl-av/preferredDesignation "PIER",
   :rdf/type :owl/NamedIndividual})

(def ^{:private true} Rear
  {:db/ident :fibo-fnd-plc-adr/Rear,
   :fibo-fnd-utl-av/preferredDesignation "REAR",
   :rdf/type :owl/NamedIndividual})

(def ^{:private true} Room
  {:db/ident :fibo-fnd-plc-adr/Room,
   :fibo-fnd-utl-av/preferredDesignation "RM",
   :rdf/type :owl/NamedIndividual})

(def ^{:private true} Side
  {:db/ident :fibo-fnd-plc-adr/Side,
   :fibo-fnd-utl-av/preferredDesignation "SIDE",
   :rdf/type :owl/NamedIndividual})

(def ^{:private true} Slip
  {:db/ident :fibo-fnd-plc-adr/Slip,
   :fibo-fnd-utl-av/preferredDesignation "SLP",
   :rdf/type :owl/NamedIndividual})

(def ^{:private true} Space
  {:db/ident :fibo-fnd-plc-adr/Space,
   :fibo-fnd-utl-av/preferredDesignation "SPC",
   :rdf/type :owl/NamedIndividual})

(def ^{:private true} Stop
  {:db/ident :fibo-fnd-plc-adr/Stop,
   :fibo-fnd-utl-av/preferredDesignation "STOP",
   :rdf/type :owl/NamedIndividual})

(def ^{:private true} Suite
  {:db/ident :fibo-fnd-plc-adr/Suite,
   :fibo-fnd-utl-av/preferredDesignation "STE",
   :rdf/type :owl/NamedIndividual})

(def ^{:private true} Trailer
  {:db/ident :fibo-fnd-plc-adr/Trailer,
   :fibo-fnd-utl-av/preferredDesignation "TRLR",
   :rdf/type :owl/NamedIndividual})

(def ^{:private true} Unit
  {:db/ident :fibo-fnd-plc-adr/Unit,
   :fibo-fnd-utl-av/preferredDesignation "UNIT",
   :rdf/type :owl/NamedIndividual})

(def ^{:private true} Upper
  {:db/ident :fibo-fnd-plc-adr/Upper,
   :fibo-fnd-utl-av/preferredDesignation "UPPR",
   :rdf/type :owl/NamedIndividual})