(ns net.wikipunk.rdf.fibo-fnd-plc-uspsa
  ^{:base
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/",
    :namespaces
    {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
     "cmns-cds" "https://www.omg.org/spec/Commons/CodesAndCodeSets/",
     "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
     "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
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
     "owl" "http://www.w3.org/2002/07/owl#",
     "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
     "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
     "skos" "http://www.w3.org/2004/02/skos/core#",
     "xsd" "http://www.w3.org/2001/XMLSchema#"},
    :prefix "fibo-fnd-plc-uspsa",
    :source
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/"}
  {:cmns-av/copyright #{"Copyright (c) 2019-2023 Object Management Group, Inc."
                        "Copyright (c) 2019-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology augments the Addresses ontology in FND with concepts that conform to the USPS Pub 28. The USPS provides automated address verification services that use the concepts defined herein for that purpose, and which many financial services entities use for data quality purposes.",
   :dcterms/contributor "Thematix Partners LLC",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Addresses/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/CodesAndCodeSets/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Locations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/NorthAmerica/USPostalServiceAddresses/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "U.S. Postal Service Addresses Ontology",
   :rdfs/seeAlso #{{:xsd/anyURI "https://about.usps.com/who/profile/"}
                   {:xsd/anyURI
                    "https://pe.usps.com/cpim/ftp/pubs/Pub28/pub28.pdf"}},
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses.rdf version of this ontology was revised to replace uses of hasTag in Relations with hasTag from LCC, as the more complex union of datatypes in the Relations concept is not needed here, and correct a duplicate label."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses.rdf version of this ontology was revised to address hygiene issues with respect to text formatting."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/"})

(def CompleteAddress
  {:cmns-av/explanatoryNote
   "A complete address may be required on mail at some automation rates.",
   :db/ident :fibo-fnd-plc-uspsa/CompleteAddress,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/"},
   :rdfs/label "complete address",
   :rdfs/subClassOf :fibo-fnd-plc-uspsa/StandardizedAddress,
   :skos/definition
   "delivery address that has all the address elements necessary to allow an exact match with the current Postal Service ZIP+4 and City State files to obtain the finest level of ZIP+4 and delivery point codes for the delivery address"})

(def DeliveryAddressCodeSet
  {:db/ident :fibo-fnd-plc-uspsa/DeliveryAddressCodeSet,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/"},
   :rdfs/label "delivery address code set",
   :rdfs/seeAlso {:xsd/anyURI
                  "https://pe.usps.com/cpim/ftp/pubs/Pub28/pub28.pdf"},
   :rdfs/subClassOf #{:cmns-id/IdentificationScheme :cmns-cds/CodeSet
                      {:owl/onProperty :cmns-col/hasMember,
                       :owl/someValuesFrom
                       :fibo-fnd-plc-uspsa/USPostalServiceAddressIdentifier,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "system of numeric codes that substitute for specified delivery point details according to the U.S. Postal Service Publication 28"})

(def DeliveryPointCode
  {:cmns-av/explanatoryNote
   "When combined with the ZIP + 4 code, the delivery point code provides a unique identifier for every deliverable address served by the USPS. The delivery point digits are almost never printed on mail in human-readable form; instead they are encoded in the POSTNET delivery point barcode (DPBC) or as part of the newer Intelligent Mail Barcode (IMB).",
   :db/ident :fibo-fnd-plc-uspsa/DeliveryPointCode,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/"},
   :rdfs/label "delivery point code",
   :rdfs/seeAlso {:xsd/anyURI
                  "https://pe.usps.com/cpim/ftp/pubs/Pub28/pub28.pdf"},
   :rdfs/subClassOf #{{:owl/onDataRange :xsd/string,
                       :owl/onProperty  :fibo-fnd-rel-rel/hasTag,
                       :owl/qualifiedCardinality 1,
                       :rdf/type        :owl/Restriction}
                      {:owl/onClass    :fibo-fnd-plc-uspsa/DeliveryPointCodeSet,
                       :owl/onProperty :cmns-col/isMemberOf,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction} :cmns-cds/CodeElement},
   :skos/definition
   "specific set of digits between 00 and 99 assigned to a delivery point"})

(def DeliveryPointCodeSet
  {:db/ident :fibo-fnd-plc-uspsa/DeliveryPointCodeSet,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/"},
   :rdfs/label "delivery point code set",
   :rdfs/seeAlso {:xsd/anyURI
                  "https://pe.usps.com/cpim/ftp/pubs/Pub28/pub28.pdf"},
   :rdfs/subClassOf #{:cmns-cds/CodeSet
                      {:owl/onProperty :cmns-col/hasMember,
                       :owl/someValuesFrom
                       :fibo-fnd-plc-uspsa/DeliveryPointCode,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "system of numeric codes that substitute for specified delivery point details according to the U.S. Postal Service Publication 28"})

(def DepartmentOfStateAddress
  {:db/ident :fibo-fnd-plc-uspsa/DepartmentOfStateAddress,
   :owl/disjointWith :fibo-fnd-plc-adr/ConventionalStreetAddress,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/"},
   :rdfs/label "Department of State address",
   :rdfs/subClassOf #{:fibo-fnd-plc-adr/PhysicalAddress
                      {:owl/onClass    :fibo-fnd-plc-uspsa/Mailbox,
                       :owl/onProperty :cmns-col/comprises,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      {:owl/onClass
                       :fibo-fnd-plc-uspsa/DepartmentOfStateUnitComponent,
                       :owl/onProperty :cmns-col/comprises,
                       :owl/qualifiedCardinality 1,
                       :rdf/type :owl/Restriction}
                      {:owl/hasValue   {:rdf/value "DPO"},
                       :owl/onProperty :fibo-fnd-plc-loc/hasCityName,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "delivery address whose delivery address line uses 'UNIT' followed by the unit identifier, followed by 'BOX' followed by box number, in place of a street address, 'DPO' as the literal value for the city, and the appropriate armed forces subdivision code in place of a subdivision (state) code"})

(def DepartmentOfStateUnitComponent
  {:db/ident :fibo-fnd-plc-uspsa/DepartmentOfStateUnitComponent,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/"},
   :rdfs/label "Department of State unit component",
   :rdfs/subClassOf #{{:owl/hasValue   :fibo-fnd-plc-adr/Unit,
                       :owl/onProperty :cmns-col/comprises,
                       :rdf/type       :owl/Restriction}
                      :fibo-fnd-plc-adr/SupplementalAddressComponent},
   :skos/definition
   "component of a Department of State address that includes 'UNIT' followed by the unit identifier"})

(def East
  {:db/ident :fibo-fnd-plc-uspsa/East,
   :fibo-fnd-rel-rel/hasTag "E",
   :rdf/type #{:owl/NamedIndividual
               :fibo-fnd-plc-adr/GeographicDirectionalSymbol},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "East"}
                 {:rdf/language "es",
                  :rdf/value    "Este"}},
   :skos/definition "geographic directional symbol for East"})

(def GeneralDeliveryAddress
  {:cmns-av/explanatoryNote
   "The value of the +4 component of a ZIP+4 code should be '9999'.",
   :db/ident :fibo-fnd-plc-uspsa/GeneralDeliveryAddress,
   :owl/disjointWith :fibo-fnd-plc-adr/ConventionalStreetAddress,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/"},
   :rdfs/label "general delivery address",
   :rdfs/subClassOf #{:fibo-fnd-plc-adr/PhysicalAddress
                      {:owl/hasValue   {:rdf/value "GENERAL DELIVERY"},
                       :owl/onProperty :fibo-fnd-plc-adr/hasAddressLine1,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "delivery address that uses the words 'GENERAL DELIVERY', uppercase preferred, spelled out (no abbreviation), in place of a street address"})

(def HighwayContractRoute
  {:db/ident :fibo-fnd-plc-uspsa/HighwayContractRoute,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/"},
   :rdfs/label "highway contract route",
   :rdfs/subClassOf #{{:owl/hasValue
                       :fibo-fnd-plc-uspsa/HighwayContractRouteDesignator,
                       :owl/onProperty :cmns-col/comprises,
                       :rdf/type :owl/Restriction}
                      :fibo-fnd-plc-adr/SupplementalAddressComponent},
   :skos/definition "highway contract route associated with an address"})

(def HighwayContractRouteAddress
  {:db/ident :fibo-fnd-plc-uspsa/HighwayContractRouteAddress,
   :owl/disjointWith :fibo-fnd-plc-adr/ConventionalStreetAddress,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/"},
   :rdfs/label "highway contract address",
   :rdfs/subClassOf #{:fibo-fnd-plc-adr/PhysicalAddress
                      {:owl/onClass    :fibo-fnd-plc-uspsa/Mailbox,
                       :owl/onProperty :cmns-col/comprises,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      {:owl/onClass    :fibo-fnd-plc-uspsa/HighwayContractRoute,
                       :owl/onProperty :cmns-col/comprises,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "delivery address whose delivery address line uses the abbreviation 'HC', followed by the route identifier, followed by 'BOX' followed by box number, in place of a street address"})

(def HighwayContractRouteDesignator
  {:db/ident :fibo-fnd-plc-uspsa/HighwayContractRouteDesignator,
   :fibo-fnd-utl-av/preferredDesignation "HC",
   :rdf/type #{:owl/NamedIndividual
               :fibo-fnd-plc-adr/SupplementalAddressDesignator},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/"},
   :rdfs/label "highway contract route designator",
   :skos/definition
   "designator for a route served by an independent contractor rather than directly by the U.S. Postal Service"})

(def InternationalAddress
  {:db/ident :fibo-fnd-plc-uspsa/InternationalAddress,
   :owl/equivalentClass {:owl/onClass    :lcc-cr/Country,
                         :owl/onProperty :fibo-fnd-plc-loc/hasCountry,
                         :owl/qualifiedCardinality 1,
                         :rdf/type       :owl/Restriction},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/"},
   :rdfs/label "international address",
   :rdfs/subClassOf :fibo-fnd-plc-adr/PhysicalAddress,
   :skos/definition "physical address that explicitly includes a country"})

(def Mailbox
  {:db/ident :fibo-fnd-plc-uspsa/Mailbox,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/"},
   :rdfs/label "mailbox",
   :rdfs/subClassOf #{{:owl/hasValue   :fibo-fnd-plc-uspsa/MailboxDesignator,
                       :owl/onProperty :cmns-col/comprises,
                       :rdf/type       :owl/Restriction}
                      :fibo-fnd-plc-adr/SupplementalAddressComponent},
   :skos/definition
   "mailbox, other than a U.S. Post Office box, associated with an address"})

(def MailboxDesignator
  {:db/ident :fibo-fnd-plc-uspsa/MailboxDesignator,
   :fibo-fnd-utl-av/preferredDesignation "BOX",
   :rdf/type #{:owl/NamedIndividual
               :fibo-fnd-plc-adr/SupplementalAddressDesignator},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/"},
   :rdfs/label "mailbox designator",
   :skos/definition
   "designator for a mail box other than a U.S. Post Office box"})

(def North
  {:db/ident :fibo-fnd-plc-uspsa/North,
   :fibo-fnd-rel-rel/hasTag "N",
   :rdf/type #{:owl/NamedIndividual
               :fibo-fnd-plc-adr/GeographicDirectionalSymbol},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "North"}
                 {:rdf/language "es",
                  :rdf/value    "Norte"}},
   :skos/definition "geographic directional symbol for North"})

(def Northeast
  {:db/ident :fibo-fnd-plc-uspsa/Northeast,
   :fibo-fnd-rel-rel/hasTag "NE",
   :rdf/type #{:owl/NamedIndividual
               :fibo-fnd-plc-adr/GeographicDirectionalSymbol},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/"},
   :rdfs/label #{{:rdf/language "es",
                  :rdf/value    "Noreste"}
                 {:rdf/language "en",
                  :rdf/value    "Northeast"}},
   :skos/definition "geographic directional symbol for Northeast"})

(def Northwest
  {:db/ident :fibo-fnd-plc-uspsa/Northwest,
   :fibo-fnd-rel-rel/hasTag #{"NW" "NO"},
   :rdf/type #{:owl/NamedIndividual
               :fibo-fnd-plc-adr/GeographicDirectionalSymbol},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/"},
   :rdfs/label #{{:rdf/language "es",
                  :rdf/value    "Noroeste"}
                 {:rdf/language "en",
                  :rdf/value    "Northwest"}},
   :skos/definition "geographic directional symbol for Northwest"})

(def OverseasMilitaryAddress
  {:db/ident :fibo-fnd-plc-uspsa/OverseasMilitaryAddress,
   :owl/disjointWith :fibo-fnd-plc-adr/ConventionalStreetAddress,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/"},
   :rdfs/label "overseas military address",
   :rdfs/subClassOf #{:fibo-fnd-plc-adr/PhysicalAddress
                      {:owl/onProperty     :fibo-fnd-plc-adr/hasAddressLine1,
                       :owl/someValuesFrom :rdfs/Literal,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :fibo-fnd-plc-loc/hasCityName,
                       :owl/someValuesFrom {:owl/oneOf [{:rdf/value "APO"}
                                                        {:rdf/value "FPO"}],
                                            :rdf/type  :rdfs/Datatype},
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "delivery address whose delivery address line uses an abbreviation for the unit or command such as 'CMR', 'PSC', or 'UNIT', or 'HC', followed by the unit identifier, followed by 'BOX' followed by box number, in place of a street address, either 'APO' or 'FPO' as the literal value for the city and the appropriate armed forces subdivision code in place of a subdivision (state) code"})

(def PrivateMailBoxAddress
  {:db/ident :fibo-fnd-plc-uspsa/PrivateMailBoxAddress,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/"},
   :rdfs/label "private mail box address",
   :rdfs/subClassOf :fibo-fnd-plc-adr/ConventionalStreetAddress,
   :skos/definition
   "delivery address provided by a commercial mail receiving company that includes a supplementary address line containing the abbreviation 'PMB' or the pound \"#\" symbol followed by the mailbox number; alternatively, 'PMB' or '#\" and the mailbox number can be appended to the street address"})

(def PuertoRicoAddress
  {:db/ident :fibo-fnd-plc-uspsa/PuertoRicoAddress,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/"},
   :rdfs/label "Puerto Rico address",
   :rdfs/subClassOf #{{:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-fnd-plc-uspsa/Urbanization,
                       :owl/onProperty :cmns-col/comprises,
                       :rdf/type       :owl/Restriction}
                      :fibo-fnd-plc-adr/ConventionalStreetAddress},
   :skos/definition
   "delivery address for a delivery point in Puerto Rico that may include a supplementary address line containing the abbreviation 'URB' followed by the name of the urbanization area that is appropriate for that address"})

(def RuralRoute
  {:db/ident :fibo-fnd-plc-uspsa/RuralRoute,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/"},
   :rdfs/label "highway contract route address",
   :rdfs/subClassOf #{{:owl/hasValue   :fibo-fnd-plc-uspsa/RuralRouteDesignator,
                       :owl/onProperty :cmns-col/comprises,
                       :rdf/type       :owl/Restriction}
                      :fibo-fnd-plc-adr/SupplementalAddressComponent},
   :skos/definition
   "mail route outside the city or township limits in a rural area associated with an address"})

(def RuralRouteAddress
  {:db/ident :fibo-fnd-plc-uspsa/RuralRouteAddress,
   :owl/disjointWith :fibo-fnd-plc-adr/ConventionalStreetAddress,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/"},
   :rdfs/label "rural route address",
   :rdfs/subClassOf #{:fibo-fnd-plc-adr/PhysicalAddress
                      {:owl/onClass    :fibo-fnd-plc-uspsa/Mailbox,
                       :owl/onProperty :cmns-col/comprises,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      {:owl/onClass    :fibo-fnd-plc-uspsa/RuralRoute,
                       :owl/onProperty :cmns-col/comprises,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "delivery address whose delivery address line uses the abbreviation 'RR', followed by the route identifier, followed by 'BOX' followed by box number, in place of a street address"})

(def RuralRouteDesignator
  {:db/ident :fibo-fnd-plc-uspsa/RuralRouteDesignator,
   :fibo-fnd-utl-av/preferredDesignation "RR",
   :rdf/type #{:owl/NamedIndividual
               :fibo-fnd-plc-adr/SupplementalAddressDesignator},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/"},
   :rdfs/label "rural route designator",
   :skos/definition
   "designator for a mail route outside the city or township limits in a rural area"})

(def South
  {:db/ident :fibo-fnd-plc-uspsa/South,
   :fibo-fnd-rel-rel/hasTag "S",
   :rdf/type #{:owl/NamedIndividual
               :fibo-fnd-plc-adr/GeographicDirectionalSymbol},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/"},
   :rdfs/label #{{:rdf/language "es",
                  :rdf/value    "Sur"}
                 {:rdf/language "en",
                  :rdf/value    "South"}},
   :skos/definition "geographic directional symbol for South"})

(def Southeast
  {:db/ident :fibo-fnd-plc-uspsa/Southeast,
   :fibo-fnd-rel-rel/hasTag "SE",
   :rdf/type #{:owl/NamedIndividual
               :fibo-fnd-plc-adr/GeographicDirectionalSymbol},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "Southeast"}
                 {:rdf/language "es",
                  :rdf/value    "Sureste"}},
   :skos/definition "geographic directional symbol for Southeast"})

(def Southwest
  {:db/ident :fibo-fnd-plc-uspsa/Southwest,
   :fibo-fnd-rel-rel/hasTag #{"SW" "SO"},
   :rdf/type #{:owl/NamedIndividual
               :fibo-fnd-plc-adr/GeographicDirectionalSymbol},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/"},
   :rdfs/label #{{:rdf/language "es",
                  :rdf/value    "Suroeste"}
                 {:rdf/language "en",
                  :rdf/value    "Southwest"}},
   :skos/definition "geographic directional symbol for Southwest"})

(def StandardizedAddress
  {:db/ident :fibo-fnd-plc-uspsa/StandardizedAddress,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/"},
   :rdfs/label "standardized address",
   :rdfs/subClassOf :fibo-fnd-plc-adr/PhysicalAddress,
   :skos/definition
   "delivery address that is fully spelled out, abbreviated by using the Postal Service standard abbreviations or as given in the current Postal Service ZIP+4 file"})

(def USPostOfficeBoxDesignator
  {:db/ident :fibo-fnd-plc-uspsa/USPostOfficeBoxDesignator,
   :fibo-fnd-utl-av/preferredDesignation "PO BOX",
   :rdf/type #{:fibo-fnd-plc-adr/PostOfficeBoxDesignator :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/"},
   :rdfs/label "post office box designator",
   :skos/definition "designator for a U.S. Post Office box"})

(def USPostalServiceAddressIdentifier
  {:cmns-av/explanatoryNote
   "The delivery point digits are almost never printed on mail in human-readable form; instead they are encoded in the POSTNET delivery point barcode (DPBC) or as part of the newer Intelligent Mail Barcode (IMB).",
   :db/ident :fibo-fnd-plc-uspsa/USPostalServiceAddressIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/"},
   :rdfs/label "U.S. Postal Service address identifier",
   :rdfs/subClassOf #{{:owl/onClass    :fibo-fnd-plc-uspsa/ZIPPlus4Code,
                       :owl/onProperty :cmns-col/comprises,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      :fibo-fnd-plc-adr/PhysicalAddressIdentifier
                      {:owl/onClass    :fibo-fnd-plc-uspsa/DeliveryPointCode,
                       :owl/onProperty :cmns-col/comprises,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "combined with the ZIP + 4 code, the delivery point code provides a unique identifier for every deliverable address served by the USPS"})

(def Urbanization
  {:cmns-av/explanatoryNote
   "This URB descriptor, commonly used in urban areas of Puerto Rico, is an important part of the addressing format, as it describes the location of a given street.",
   :db/ident :fibo-fnd-plc-uspsa/Urbanization,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/"},
   :rdfs/label "urbanization",
   :rdfs/subClassOf :lcc-cr/CountrySubdivision,
   :skos/definition
   "an area, sector, or development within a larger geographic area"})

(def West
  {:db/ident :fibo-fnd-plc-uspsa/West,
   :fibo-fnd-rel-rel/hasTag #{"O" "W"},
   :rdf/type #{:owl/NamedIndividual
               :fibo-fnd-plc-adr/GeographicDirectionalSymbol},
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/"},
   :rdfs/label #{{:rdf/language "es",
                  :rdf/value    "Oeste"}
                 {:rdf/language "en",
                  :rdf/value    "West"}},
   :skos/definition "geographic directional symbol for West"})

(def ZIPCode
  {:db/ident :fibo-fnd-plc-uspsa/ZIPCode,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/"},
   :rdfs/label "Zip Code",
   :rdfs/subClassOf :fibo-fnd-plc-adr/Postcode,
   :skos/definition
   "five-digit code code assigned to a delivery address indicating the state and post office or postal zone"})

(def ZIPPlus4Code
  {:cmns-av/explanatoryNote
   "The correct format for a numeric ZIP+4 code is five digits, a hyphen, and four digits. The first five digits represent the 5-digit ZIP Code; the sixth and seventh digits (the first two after the hyphen) identify an area known as a sector; the eighth and ninth digits identify a smaller area known as a segment. Together, the final four digits identify geographic units such as a side of a street between intersections, both sides of a street between intersections, a building, a floor or group of floors in a building, a firm within a building, a span of boxes on a rural route, or a group of Post Office boxes to which a single USPS employee makes delivery.",
   :db/ident :fibo-fnd-plc-uspsa/ZIPPlus4Code,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/"},
   :rdfs/label "ZIP+4 Code",
   :rdfs/subClassOf :fibo-fnd-plc-adr/Postcode,
   :skos/definition
   "nine-digit number consisting of five digits, a hyphen, and four digits, which the USPS describes by its trademark ZIP+4"})

(def ZipCodeScheme
  {:db/ident :fibo-fnd-plc-uspsa/ZipCodeScheme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/"},
   :rdfs/label "zip code scheme",
   :rdfs/seeAlso {:xsd/anyURI
                  "https://pe.usps.com/cpim/ftp/pubs/Pub28/pub28.pdf"},
   :rdfs/subClassOf #{:cmns-id/IdentificationScheme :cmns-cds/CodeSet
                      {:owl/onProperty     :cmns-col/hasMember,
                       :owl/someValuesFrom {:owl/unionOf
                                            [:fibo-fnd-plc-uspsa/ZIPCode
                                             :fibo-fnd-plc-uspsa/ZIPPlus4Code],
                                            :rdf/type :owl/Class},
                       :rdf/type           :owl/Restriction}},
   :skos/definition
   "system used in the U.S. to facilitate the delivery of mail, consisting of a five- or nine-digit code Zone Improvement Plan (ZIP) printed directly after the address, the first five digits (initial code) indicating the state and post office or postal zone, the last four (expanded code) the box section or number, portion of a rural route, building, or other specific delivery location"})

(def hasUrbanization
  {:db/ident :fibo-fnd-plc-uspsa/hasUrbanization,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/"},
   :rdfs/label "has urbanization",
   :rdfs/range :fibo-fnd-plc-uspsa/Urbanization,
   :rdfs/subPropertyOf :cmns-col/comprises,
   :skos/definition
   "indicates area, sector, or development within a geographic area relevant to a delivery address"})

(def urn:uuid:87dcac77-384a-54d3-9af1-547e91a91047
  {:cmns-av/copyright #{"Copyright (c) 2019-2023 Object Management Group, Inc."
                        "Copyright (c) 2019-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology augments the Addresses ontology in FND with concepts that conform to the USPS Pub 28. The USPS provides automated address verification services that use the concepts defined herein for that purpose, and which many financial services entities use for data quality purposes.",
   :dcterms/contributor "Thematix Partners LLC",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Addresses/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/CodesAndCodeSets/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Locations/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/NorthAmerica/USPostalServiceAddresses/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "U.S. Postal Service Addresses Ontology",
   :rdfs/seeAlso #{{:xsd/anyURI "https://about.usps.com/who/profile/"}
                   {:xsd/anyURI
                    "https://pe.usps.com/cpim/ftp/pubs/Pub28/pub28.pdf"}},
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses.rdf version of this ontology was revised to replace uses of hasTag in Relations with hasTag from LCC, as the more complex union of datatypes in the Relations concept is not needed here, and correct a duplicate label."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses.rdf version of this ontology was revised to address hygiene issues with respect to text formatting."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/Places/NorthAmerica/USPostalServiceAddresses/"})