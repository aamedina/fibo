(ns net.wikipunk.rdf.fibo-fnd-aap-ppl
  ^{:base
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
    :namespaces
    {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
     "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
     "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
     "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
     "cmns-dsg" "https://www.omg.org/spec/Commons/Designators/",
     "cmns-dt" "https://www.omg.org/spec/Commons/DatesAndTimes/",
     "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
     "cmns-txt" "https://www.omg.org/spec/Commons/TextDatatype/",
     "dcterms" "http://purl.org/dc/terms/",
     "fibo-fnd-aap-ppl"
     "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
     "fibo-fnd-arr-doc"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/",
     "fibo-fnd-dt-fd"
     "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/",
     "fibo-fnd-plc-adr"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/",
     "fibo-fnd-plc-loc"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Locations/",
     "fibo-fnd-pty-pty"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
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
    :prefix "fibo-fnd-aap-ppl",
    :source
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/"}
  {:cmns-av/copyright #{"Copyright (c) 2013-2023 Object Management Group, Inc."
                        "Copyright (c) 2013-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology defines concepts for people and human related terms, for use in other FIBO ontology elements. People as defined here are human persons only. This ontology sets out a number of basic properties which are held by people or are definitive of a small number of specific types of people such as minors or adults. Primary use cases for determining the set of personal information definitions included are the common elements required to (1) open a bank account, (2) identify a sophisticated investor, and (3) establish foreign account ownership for money laundering purposes.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Parties/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Addresses/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/IdentifiersAndIndices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Locations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Documents/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/TextDatatype/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/AgentsAndPeople/People/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "People Ontology",
   :skos/changeNote
   #{"The https://www.omg.org/spec/EDMC-FIBO/FND/20201201/AgentsAndPeople/People.rdf version of the ontology was modified to add hasResidence, hasMailingAddress, and hasPrimaryResidence properties and a restriction on person with respect to residence accordingly, then to move hasMailingAddress to Parties."
     "The https://www.omg.org/spec/EDMC-FIBO/FND/20210301/AgentsAndPeople/People.rdf version of the ontology was modified to allow the People ontology to import Parties, rather than the other way around, to simplify the class hierarchy for ease of use in data mapping and alignment, and to add person name as a first class concept, revising property definitions to allow for structured names by loosening constraints."
     "The https://www.omg.org/spec/EDMC-FIBO/FND/20210401/AgentsAndPeople/People.rdf version of the ontology was modified to add concepts specific to legal age, age of majority, legal working age and legal working age person."
     "The http://www.omg.org/spec/FIBO/Foundations/20130601/AgentsAndPeople/People.owl version of the ontology was revised in advance of the September 2013 New Brunswick, NJ meeting, as follows:\n\t\t(1) to use slash style URI/IRIss (also called 303 URIs, vs. hash style) as required to support server side processing \n\t\t(2) to use version-independent IRIs for all definitions internally as opposed to version-specific IRIs\n\t\t(3) to change the file suffix from .owl to .rdf to increase usability in RDF tools\n\t\t(4) to use 4-level abbreviations and corresponding namespace prefixes for all FIBO ontologies, reflecting a family/specification/module/ontology structure\n\t\t(5) to incorporate changes to the specification metadata to support documentation at the family, specification, module, and ontology level, similar to the abbreviations.\n\t\t(6) to revise and extend the set of properties about people required to fulfill the set of use cases listed above."
     "The http://spec.edmcouncil.org/fibo/ontology/FND/20130801/AgentsAndPeople/People.rdf version of the ontology was was modified per the issue resolutions identified in the FIBO FND 1.0 FTF report and in https://spec.edmcouncil.org/fibo/ontology/FND/1.0/AboutFND-1.0/. It was further revised in the FTF in advance of the Long Beach meeting, resulting in https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/."
     "The https://www.omg.org/spec/EDMC-FIBO/FND/20211101/AgentsAndPeople/People.rdf version of the ontology was modified to address hygiene issues with respect to text formatting."
     "The https://www.omg.org/spec/EDMC-FIBO/FND/20190501/AgentsAndPeople/People.rdf version of the ontology was modified to eliminate deprecated elements."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
     "The https://www.omg.org/spec/EDMC-FIBO/FND/20210601/AgentsAndPeople/People.rdf version of the ontology was modified to revise the definition of passport number as a national identification number and eliminate restrictions that would cause people to be inferred to be passports."
     "The https://www.omg.org/spec/EDMC-FIBO/FND/20190901/AgentsAndPeople/People.rdf version of the ontology was modified to eliminate duplication with concepts in LCC and correct a bug in a restriction on identity document."
     "The https://www.omg.org/spec/EDMC-FIBO/FND/20200201/AgentsAndPeople/People.rdf version of the ontology was modified to add explicit DateOfBirth and DateOfDeath, added DeathCertificate and related concepts, streamlined related properties and restrictions."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People.rdf version of the ontology was modified to replace hasDefinition with isDefinedIn to clarify intent."
     "The http://www.omg.org/spec/EDMC-FIBO/FND/20160201/AgentsAndPeople/People.rdf version of the ontology was modified per the FIBO 2.0 RFC, including integration of LCC."
     "The https://www.omg.org/spec/EDMC-FIBO/FND/20180801/AgentsAndPeople/People.rdf version of the ontology was modified to deprecate legally capable person in favor of natural person (defined in Business Entities)."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People.rdf version of the ontology was was modified to revise a restriction on IdentityDocument to reference the appropriate identifier rather than use a tag. The impetus behind this change is to support privacy legislation, such as GDPR, which requires protection of both identifiers, such as a passport number, drivers' license number, etc. as well as the documents themselves. Thus, properties and individuals related to those identifiers are urgently needed."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The http://spec.edmcouncil.org/fibo/ontology/FND/20141101/AgentsAndPeople/People.rdf version of the ontology was was modified per the issue resolutions identified in the FIBO FND 1.1 RTF report, primarily to use the hasAddress property in addresses, and change PostalAddress to PhysicalAddress in a restriction on Person. Also revised the identifiesAddress property in favor of verifiesAddress, and revised hasDateofBirth with respect to an identity document to be verifiesDateOfBirth, which was determined to be more appropriate by the RTF."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/"})

(def Adult
  {:cmns-av/adaptedFrom {:xsd/anyURI "https://en.wikipedia.org/wiki/Adult"},
   :db/ident :fibo-fnd-aap-ppl/Adult,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/"},
   :rdfs/label "adult",
   :rdfs/subClassOf #{{:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-fnd-aap-ppl/AgeOfMajority,
                       :owl/onProperty :fibo-fnd-aap-ppl/hasAgeOfMajority,
                       :rdf/type       :owl/Restriction}
                      :fibo-fnd-aap-ppl/Person},
   :skos/definition
   "person who has attained the age of majority as defined in some jurisdiction"})

(def AgeOfMajority
  {:db/ident :fibo-fnd-aap-ppl/AgeOfMajority,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/"},
   :rdfs/label "age of majority",
   :rdfs/subClassOf :fibo-fnd-aap-ppl/LegalAge,
   :skos/definition
   "age at which someone acquires the rights and responsibilities of an adult in some jurisdiction"})

(def BirthCertificate
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "http://en.wikipedia.org/wiki/Birth_certificate"},
   :cmns-av/explanatoryNote
   "A birth certificate is a vital record that documents the birth of a child. Depending on the jurisdiction, a record of birth might or might not contain verification of the event by such as a midwife or doctor.",
   :cmns-av/synonym "certificate of live birth",
   :db/ident :fibo-fnd-aap-ppl/BirthCertificate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/"},
   :rdfs/label "birth certificate",
   :rdfs/subClassOf
   #{:fibo-fnd-arr-doc/Certificate
     {:owl/onClass    :fibo-fnd-aap-ppl/BirthCertificateIdentifier,
      :owl/onProperty :cmns-id/isIdentifiedBy,
      :owl/qualifiedCardinality 1,
      :rdf/type       :owl/Restriction} :fibo-fnd-aap-ppl/IdentityDocument},
   :skos/definition
   "an original document certifying the circumstances of the birth, or a certified copy of or representation of the ensuing registration of that birth"})

(def BirthCertificateIdentificationScheme
  {:cmns-av/explanatoryNote
   "Schemes for birth certificate identification are typically regionally defined, and there may be jurisdiction-specific scope required as an additional restriction on a specific scheme.",
   :db/ident :fibo-fnd-aap-ppl/BirthCertificateIdentificationScheme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/"},
   :rdfs/label "birth certificate identification scheme",
   :rdfs/subClassOf #{:cmns-id/IdentificationScheme
                      {:owl/onProperty :cmns-dsg/defines,
                       :owl/someValuesFrom
                       :fibo-fnd-aap-ppl/BirthCertificateIdentifier,
                       :rdf/type :owl/Restriction}},
   :skos/definition "system for allocating identifiers to birth certificates"})

(def BirthCertificateIdentifier
  {:cmns-av/synonym "birth certificate number",
   :db/ident :fibo-fnd-aap-ppl/BirthCertificateIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/"},
   :rdfs/label "birth certificate identifier",
   :rdfs/subClassOf #{:cmns-id/Identifier
                      {:owl/onClass
                       :fibo-fnd-aap-ppl/BirthCertificateIdentificationScheme,
                       :owl/onProperty :cmns-dsg/isDefinedIn,
                       :owl/qualifiedCardinality 1,
                       :rdf/type :owl/Restriction}
                      {:owl/onClass    :fibo-fnd-aap-ppl/BirthCertificate,
                       :owl/onProperty :cmns-id/identifies,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "identifier associated with a vital record documenting the birth of a child"})

(def DateOfBirth
  {:cmns-av/synonym #{"birthday" "birth date"},
   :db/ident :fibo-fnd-aap-ppl/DateOfBirth,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/"},
   :rdfs/label "date of birth",
   :rdfs/subClassOf :cmns-dt/ExplicitDate,
   :skos/definition
   "explicit date, i.e., the day, month and year, on which an individual was born"})

(def DateOfDeath
  {:cmns-av/synonym "death date",
   :db/ident :fibo-fnd-aap-ppl/DateOfDeath,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/"},
   :rdfs/label "date of death",
   :rdfs/subClassOf :cmns-dt/ExplicitDate,
   :skos/definition
   "explicit date, i.e., the day, month and year, on which an individual died"})

(def DeathCertificate
  {:cmns-av/explanatoryNote
   "A death certificate is a vital record documenting information (including age, occupation, place of birth, place of residence, and often identifying the parents and possibly spouse of the deceased) relating to a dead person and including a doctor's certification of the cause of death.",
   :db/ident :fibo-fnd-aap-ppl/DeathCertificate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/"},
   :rdfs/label "death certificate",
   :rdfs/subClassOf #{{:owl/onClass
                       :fibo-fnd-aap-ppl/DeathCertificateIdentifier,
                       :owl/onProperty :cmns-id/isIdentifiedBy,
                       :owl/qualifiedCardinality 1,
                       :rdf/type :owl/Restriction} :fibo-fnd-arr-doc/Certificate
                      :fibo-fnd-aap-ppl/IdentityDocument},
   :skos/definition
   "original document certifying the circumstances of the death (such as how and when it occurred), or a certified copy of or representation of the ensuing registration of that death"})

(def DeathCertificateIdentificationScheme
  {:cmns-av/explanatoryNote
   "Schemes for death certificate identification are typically regionally defined, and there may be jurisdiction-specific scope required as an additional restriction on a specific scheme.",
   :db/ident :fibo-fnd-aap-ppl/DeathCertificateIdentificationScheme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/"},
   :rdfs/label "death certificate identification scheme",
   :rdfs/subClassOf #{:cmns-id/IdentificationScheme
                      {:owl/onProperty :cmns-dsg/defines,
                       :owl/someValuesFrom
                       :fibo-fnd-aap-ppl/DeathCertificateIdentifier,
                       :rdf/type :owl/Restriction}},
   :skos/definition "system for allocating identifiers to death certificates"})

(def DeathCertificateIdentifier
  {:cmns-av/synonym "death certificate number",
   :db/ident :fibo-fnd-aap-ppl/DeathCertificateIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/"},
   :rdfs/label "death certificate identifier",
   :rdfs/subClassOf #{{:owl/onClass
                       :fibo-fnd-aap-ppl/DeathCertificateIdentificationScheme,
                       :owl/onProperty :cmns-dsg/isDefinedIn,
                       :owl/qualifiedCardinality 1,
                       :rdf/type :owl/Restriction} :cmns-id/Identifier
                      {:owl/onClass    :fibo-fnd-aap-ppl/DeathCertificate,
                       :owl/onProperty :cmns-id/identifies,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "identifier associated with a vital record documenting the death of an individual"})

(def DriversLicense
  {:cmns-av/adaptedFrom
   {:xsd/anyURI
    "https://en.wikipedia.org/wiki/Non-driver_identification_card#Non-driver_identification_cards"},
   :cmns-av/synonym "driving licence",
   :db/ident :fibo-fnd-aap-ppl/DriversLicense,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/"},
   :rdfs/label "driver's license",
   :rdfs/subClassOf #{{:owl/onClass :fibo-fnd-aap-ppl/DriversLicenseIdentifier,
                       :owl/onProperty :cmns-id/isIdentifiedBy,
                       :owl/qualifiedCardinality 1,
                       :rdf/type :owl/Restriction}
                      :fibo-fnd-aap-ppl/IdentityDocument},
   :skos/definition
   "an official document which states that a person may operate a motorized vehicle, such as a motorcycle, car, truck or a bus, on a public roadway or provides official identifying information for a non-driver"})

(def DriversLicenseIdentificationScheme
  {:cmns-av/explanatoryNote
   "Schemes for driver's license identification are typically regionally defined, and there may be jurisdiction-specific scope required as an additional restriction on a specific scheme.",
   :db/ident :fibo-fnd-aap-ppl/DriversLicenseIdentificationScheme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/"},
   :rdfs/label "driver's license identification scheme",
   :rdfs/subClassOf #{:cmns-id/IdentificationScheme
                      {:owl/onProperty :cmns-dsg/defines,
                       :owl/someValuesFrom
                       :fibo-fnd-aap-ppl/DriversLicenseIdentifier,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "system for allocating identifiers to driver's, operating, or non-driver identification documents"})

(def DriversLicenseIdentifier
  {:cmns-av/synonym "driver's license number",
   :db/ident :fibo-fnd-aap-ppl/DriversLicenseIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/"},
   :rdfs/label "driver's license identifier",
   :rdfs/subClassOf #{:cmns-id/Identifier
                      {:owl/onClass
                       :fibo-fnd-aap-ppl/DriversLicenseIdentificationScheme,
                       :owl/onProperty :cmns-dsg/isDefinedIn,
                       :owl/qualifiedCardinality 1,
                       :rdf/type :owl/Restriction}
                      {:owl/onClass    :fibo-fnd-aap-ppl/DriversLicense,
                       :owl/onProperty :cmns-id/identifies,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "identifier associated with a drivers' or operating license for operating a motor vehicle or non-driver identification card"})

(def EmancipatedMinor
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "https://en.wikipedia.org/wiki/Emancipated_minor"},
   :cmns-av/explanatoryNote
   "The minor will then have full contractual capacity to conclude contracts with regard to the business. Whether parental consent is needed to achieve emancipated status varies from case to case. In some cases, court permission is necessary. Protocols vary by jurisdiction.",
   :db/ident :fibo-fnd-aap-ppl/EmancipatedMinor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/"},
   :rdfs/label "emancipated minor",
   :rdfs/subClassOf :fibo-fnd-aap-ppl/Minor,
   :skos/definition
   "a minor who is allowed to conduct a business or any other occupation on his or her own behalf or for their own account outside the control of a parent or guardian"})

(def IdentityDocument
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "https://en.wikipedia.org/wiki/Identification_card"},
   :cmns-av/explanatoryNote
   "If issued in the form of a small, mostly standard-sized card, it is usually called an identity card (IC). Countries which do not have formal identity documents may require informal documents. In the absence of a formal identity document, driving licenses can be used in many countries as a method of proof of identity, although some countries do not accept driving licenses for identification, often because in those countries they don't expire as documents and can be old and easily forged. Most countries accept passports as a form of identification. Most countries have the rule that foreign citizens need to have their passport or occasionally a national identity card from their country available at any time if they do not have residence permit in the country.",
   :cmns-av/synonym "identity card",
   :db/ident :fibo-fnd-aap-ppl/IdentityDocument,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/"},
   :rdfs/label "identity document",
   :rdfs/subClassOf #{{:owl/onClass    :cmns-id/Identifier,
                       :owl/onProperty :cmns-id/isIdentifiedBy,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      {:owl/onClass    :cmns-dt/Date,
                       :owl/onProperty :fibo-fnd-arr-doc/hasDateOfIssuance,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      :fibo-fnd-arr-doc/LegalDocument
                      {:owl/onProperty     :cmns-id/identifies,
                       :owl/someValuesFrom :fibo-fnd-aap-ppl/Person,
                       :rdf/type           :owl/Restriction}
                      {:owl/onClass    :cmns-dt/Date,
                       :owl/onProperty :fibo-fnd-arr-doc/hasExpirationDate,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "any legal document which may be used to verify aspects of a person's identity"})

(def IncapacitatedAdult
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "https://en.wikipedia.org/wiki/Capacity_(law)"},
   :cmns-av/explanatoryNote
   "Individuals may have an inherent physical condition which prevents them from achieving the normal levels of performance expected from persons of comparable age, or their inability to match current levels of performance may be caused by contracting an illness. Whatever the cause, if the resulting condition is such that individuals cannot care for themselves, or may act in ways that are against their interests, those persons are vulnerable through dependency and require the protection of the state against the risks of abuse or exploitation. Hence, any agreements that were made are voidable, and a court may declare that person a ward of the state and grant power of attorney to an appointed legal guardian.",
   :db/ident :fibo-fnd-aap-ppl/IncapacitatedAdult,
   :owl/disjointWith :fibo-fnd-aap-ppl/LegallyCapableAdult,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/"},
   :rdfs/label "incapacitated adult",
   :rdfs/subClassOf :fibo-fnd-aap-ppl/Adult,
   :skos/definition
   "an adult who is legally identified as not having legal capacity, typically as a result of some inherent physical or mental incapacity or as a result of having contracted some illness which temporarily deprives them of such capacity"})

(def LegalAge
  {:db/ident :fibo-fnd-aap-ppl/LegalAge,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/"},
   :rdfs/label "legal age",
   :rdfs/subClassOf :fibo-fnd-dt-fd/Age,
   :skos/definition
   "age at which someone acquires the capacity to do something that they were prohibited from doing before under the law in some jurisdiction"})

(def LegalWorkingAge
  {:db/ident :fibo-fnd-aap-ppl/LegalWorkingAge,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/"},
   :rdfs/label "legal working age",
   :rdfs/subClassOf :fibo-fnd-aap-ppl/LegalAge,
   :skos/definition
   "age at which someone acquires the capacity to work legally in some jurisdiction"})

(def LegalWorkingAgePerson
  {:db/ident :fibo-fnd-aap-ppl/LegalWorkingAgePerson,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/"},
   :rdfs/label "legal working age person",
   :rdfs/subClassOf #{{:owl/minQualifiedCardinality 0,
                       :owl/onClass :fibo-fnd-aap-ppl/LegalWorkingAge,
                       :owl/onProperty
                       :fibo-fnd-aap-ppl/hasMinimumLegalWorkingAge,
                       :rdf/type :owl/Restriction} :fibo-fnd-aap-ppl/Person},
   :skos/definition
   "person whose age is greater than the minimum legal working age specified in a jurisdiction in which they work"})

(def LegallyCapableAdult
  {:db/ident :fibo-fnd-aap-ppl/LegallyCapableAdult,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/"},
   :rdfs/label "legally capable adult",
   :rdfs/subClassOf :fibo-fnd-aap-ppl/Adult,
   :skos/definition
   "person who has attained the age of majority as defined in some jurisdiction and who is allowed to conduct a business or any other occupation on his or her own behalf or for their own account"})

(def Minor
  {:cmns-av/adaptedFrom {:xsd/anyURI
                         "https://en.wikipedia.org/wiki/Minor_(law)"},
   :cmns-av/explanatoryNote
   "The age depends upon jurisdiction and application, but is generally 18.",
   :db/ident :fibo-fnd-aap-ppl/Minor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/"},
   :rdfs/label "minor",
   :rdfs/subClassOf :fibo-fnd-aap-ppl/Person,
   :skos/definition
   "a person under a certain age, usually the age of majority in a given jurisdiction, which legally demarcates childhood from adulthood"})

(def NationalIdentificationNumber
  {:cmns-av/adaptedFrom
   {:xsd/anyURI "http://en.wikipedia.org/wiki/National_identification_number"},
   :cmns-av/explanatoryNote
   "A national identification number, national identity number, or national insurance number is used by the governments of many countries as a means of tracking their citizens, permanent residents, and temporary residents for the purposes of work, taxation, government benefits, health care, and other governmentally-related functions. The number will appear on an identity document issued by a country.\n\nThe ways in which such a system is implemented are dependent on the country, but in most cases, a citizen is issued an identification number at birth or when they reach a legal age (typically the age of 18). Non-citizens may be issued such numbers when they enter the country, or when granted a temporary or permanent residence permit.\n\nMany countries issued such numbers ostensibly for a singular purpose, but over time, they become a de facto national identification number. For example, the United States originally developed its Social Security number system as a means of disbursing Social Security benefits. However, due to function creep, the number has become utilized for other purposes to the point where it is almost essential to have one to, among other things, open a bank account, obtain a credit card, or drive a car.",
   :cmns-av/synonym "national identity number",
   :db/ident :fibo-fnd-aap-ppl/NationalIdentificationNumber,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/"},
   :rdfs/label "national identification number",
   :rdfs/subClassOf #{:cmns-id/Identifier
                      {:owl/onClass    :fibo-fnd-aap-ppl/Person,
                       :owl/onProperty :cmns-id/identifies,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      {:owl/onClass
                       :fibo-fnd-aap-ppl/NationalIdentificationNumberScheme,
                       :owl/onProperty :cmns-dsg/isDefinedIn,
                       :owl/qualifiedCardinality 1,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "number or text which appears on an identity document issued by a country or jurisdiction"})

(def NationalIdentificationNumberScheme
  {:cmns-av/explanatoryNote
   "Schemes for national identification numbers are jurisdiction-specific by country.",
   :db/ident :fibo-fnd-aap-ppl/NationalIdentificationNumberScheme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/"},
   :rdfs/label "national identification number scheme",
   :rdfs/subClassOf #{:cmns-id/IdentificationScheme
                      {:owl/onProperty :cmns-col/hasMember,
                       :owl/someValuesFrom
                       :fibo-fnd-aap-ppl/NationalIdentificationNumber,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "system for allocating identifiers to national identification numbers"})

(def Passport
  {:cmns-av/explanatoryNote
   "The elements of identity contained in all standardized passports include information about the holder, including name, date of birth, gender and place of birth.",
   :db/ident :fibo-fnd-aap-ppl/Passport,
   :fibo-fnd-utl-av/definitionOrigin {:xsd/anyURI
                                      "https://en.wikipedia.org/wiki/Passport"},
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/"},
   :rdfs/label "passport",
   :rdfs/subClassOf #{:fibo-fnd-aap-ppl/IdentityDocument
                      {:owl/onClass    :fibo-fnd-aap-ppl/PassportNumber,
                       :owl/onProperty :cmns-col/comprises,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}},
   :skos/definition
   "formal identity document, issued by a national government, which certifies the identity and nationality of its holder for the purpose of international travel"})

(def PassportNumber
  {:db/ident :fibo-fnd-aap-ppl/PassportNumber,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/"},
   :rdfs/label "passport number",
   :rdfs/subClassOf #{:fibo-fnd-aap-ppl/NationalIdentificationNumber
                      {:owl/onClass
                       :fibo-fnd-aap-ppl/PassportNumberIdentificationScheme,
                       :owl/onProperty :cmns-dsg/isDefinedIn,
                       :owl/qualifiedCardinality 1,
                       :rdf/type :owl/Restriction}},
   :skos/definition
   "national identification number associated with a passport"})

(def PassportNumberIdentificationScheme
  {:cmns-av/explanatoryNote
   "Schemes for passport identification are jurisdiction-specific by country.",
   :db/ident :fibo-fnd-aap-ppl/PassportNumberIdentificationScheme,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/"},
   :rdfs/label "passport number identification scheme",
   :rdfs/subClassOf #{:cmns-id/IdentificationScheme
                      {:owl/onProperty     :cmns-col/hasMember,
                       :owl/someValuesFrom :fibo-fnd-aap-ppl/PassportNumber,
                       :rdf/type           :owl/Restriction}},
   :skos/definition "system for allocating identifiers to passports"})

(def Person
  {:cmns-av/synonym "natural person",
   :db/ident :fibo-fnd-aap-ppl/Person,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "person"},
   :rdfs/subClassOf #{{:owl/onDataRange :xsd/string,
                       :owl/onProperty  :fibo-fnd-aap-ppl/hasGender,
                       :owl/qualifiedCardinality 1,
                       :rdf/type        :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :lcc-cr/Country,
                       :owl/onProperty :fibo-fnd-aap-ppl/hasCitizenship,
                       :rdf/type       :owl/Restriction}
                      {:owl/onClass    :fibo-fnd-aap-ppl/DateOfBirth,
                       :owl/onProperty :fibo-fnd-aap-ppl/hasDateOfBirth,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      :fibo-fnd-pty-pty/IndependentParty
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-fnd-aap-ppl/PersonName,
                       :owl/onProperty :cmns-dsg/hasName,
                       :rdf/type       :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-fnd-dt-fd/Age,
                       :owl/onProperty :fibo-fnd-dt-fd/hasAge,
                       :rdf/type       :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-fnd-aap-ppl/DateOfDeath,
                       :owl/onProperty :fibo-fnd-aap-ppl/hasDateOfDeath,
                       :rdf/type       :owl/Restriction}
                      {:owl/onClass    :fibo-fnd-aap-ppl/PlaceOfBirth,
                       :owl/onProperty :fibo-fnd-aap-ppl/hasPlaceOfBirth,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onClass :fibo-fnd-plc-adr/ConventionalStreetAddress,
                       :owl/onProperty :fibo-fnd-aap-ppl/hasResidence,
                       :rdf/type :owl/Restriction}},
   :skos/definition "individual human being, with consciousness of self"})

(def PersonName
  {:db/ident :fibo-fnd-aap-ppl/PersonName,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/"},
   :rdfs/label "person name",
   :rdfs/subClassOf #{{:owl/minQualifiedCardinality 0,
                       :owl/onClass    :fibo-fnd-aap-ppl/Person,
                       :owl/onProperty :cmns-dsg/isNameOf,
                       :rdf/type       :owl/Restriction}
                      :cmns-cxtdsg/ContextualName
                      {:owl/minQualifiedCardinality 0,
                       :owl/onDataRange :cmns-txt/Text,
                       :owl/onProperty  :fibo-fnd-aap-ppl/hasNameSuffix,
                       :rdf/type        :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onDataRange :cmns-txt/Text,
                       :owl/onProperty  :fibo-fnd-aap-ppl/hasSurname,
                       :rdf/type        :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onDataRange :cmns-txt/Text,
                       :owl/onProperty  :fibo-fnd-aap-ppl/hasNamePrefix,
                       :rdf/type        :owl/Restriction}
                      {:owl/minQualifiedCardinality 0,
                       :owl/onDataRange :cmns-txt/Text,
                       :owl/onProperty  :fibo-fnd-aap-ppl/hasFullLegalName,
                       :rdf/type        :owl/Restriction}},
   :skos/definition "designation by which someone is known in some context"})

(def PlaceOfBirth
  {:cmns-av/synonym "birth place",
   :db/ident :fibo-fnd-aap-ppl/PlaceOfBirth,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/"},
   :rdfs/label "place of birth",
   :rdfs/subClassOf :fibo-fnd-plc-loc/PhysicalLocation,
   :skos/definition
   "physical location, including country, region, and municipality where an individual was born"})

(def hasAgeOfMajority
  {:db/ident :fibo-fnd-aap-ppl/hasAgeOfMajority,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/"},
   :rdfs/label "has age of majority",
   :rdfs/range :fibo-fnd-aap-ppl/AgeOfMajority,
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasAge,
   :skos/definition
   "relates someone to the age required to attain the capacity to engage in certain transactions or be treated legally as an adult in some jurisdiction"})

(def hasCitizenship
  {:db/ident :fibo-fnd-aap-ppl/hasCitizenship,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-aap-ppl/Person,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/"},
   :rdfs/label "has citizenship",
   :rdfs/range :lcc-cr/Country,
   :rdfs/subPropertyOf :cmns-cls/isClassifiedBy,
   :skos/definition "links a person to their country of citizenship"})

(def hasDateOfBirth
  {:db/ident :fibo-fnd-aap-ppl/hasDateOfBirth,
   :rdf/type #{:owl/ObjectProperty :owl/FunctionalProperty},
   :rdfs/domain :fibo-fnd-aap-ppl/Person,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/"},
   :rdfs/label "has date of birth",
   :rdfs/range :fibo-fnd-aap-ppl/DateOfBirth,
   :rdfs/subPropertyOf :cmns-dt/hasExplicitDate,
   :skos/definition "identifies the date on which an individual was born"})

(def hasDateOfDeath
  {:db/ident :fibo-fnd-aap-ppl/hasDateOfDeath,
   :rdf/type #{:owl/ObjectProperty :owl/FunctionalProperty},
   :rdfs/domain :fibo-fnd-aap-ppl/Person,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/"},
   :rdfs/label "has date of death",
   :rdfs/range :fibo-fnd-aap-ppl/DateOfDeath,
   :rdfs/subPropertyOf :cmns-dt/hasExplicitDate,
   :skos/definition "identifies the date on which an individual died"})

(def hasFamilyName
  {:cmns-av/explanatoryNote
   "'Family name' is more commonly used in the United Kingdom than in the United States to refer to someone's surname.",
   :db/ident :fibo-fnd-aap-ppl/hasFamilyName,
   :owl/equivalentProperty #{:fibo-fnd-aap-ppl/hasLastName
                             :fibo-fnd-aap-ppl/hasSurname},
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/"},
   :rdfs/label "has family name",
   :rdfs/subPropertyOf :fibo-fnd-aap-ppl/hasPersonName,
   :skos/definition
   "indicates the name shared in common to identify the members of a family, as distinguished from each member's given name"})

(def hasFirstName
  {:db/ident :fibo-fnd-aap-ppl/hasFirstName,
   :owl/equivalentProperty :fibo-fnd-aap-ppl/hasGivenName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/"},
   :rdfs/label "has first name",
   :rdfs/subPropertyOf :fibo-fnd-aap-ppl/hasPersonName,
   :skos/definition
   "indicates the given name or first name of a person, that is, the name chosen for them at birth or changed by them subsequently from the name given at birth"})

(def hasFullLegalName
  {:db/ident :fibo-fnd-aap-ppl/hasFullLegalName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/"},
   :rdfs/label "has full legal name",
   :rdfs/subPropertyOf #{:fibo-fnd-aap-ppl/hasPersonName
                         :fibo-fnd-rel-rel/hasLegalName},
   :skos/definition
   "indicates the complete name of a person, typically used in formal situations including those of a legal or contractual nature"})

(def hasGender
  {:db/ident :fibo-fnd-aap-ppl/hasGender,
   :rdf/type #{:owl/DatatypeProperty :owl/FunctionalProperty},
   :rdfs/domain :fibo-fnd-aap-ppl/Person,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/"},
   :rdfs/label "has gender",
   :rdfs/range :xsd/string,
   :skos/definition "links a particular gender value with a person"})

(def hasGivenName
  {:db/ident :fibo-fnd-aap-ppl/hasGivenName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/"},
   :rdfs/label "has given name",
   :rdfs/subPropertyOf :fibo-fnd-aap-ppl/hasPersonName,
   :skos/definition
   "indicates the given name or first name of a person, that is, the name chosen for them at birth or changed by them subsequently from the name given at birth"})

(def hasLastName
  {:db/ident :fibo-fnd-aap-ppl/hasLastName,
   :owl/equivalentProperty :fibo-fnd-aap-ppl/hasSurname,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/"},
   :rdfs/label "has last name",
   :rdfs/subPropertyOf :fibo-fnd-aap-ppl/hasPersonName,
   :skos/definition
   "indicates the name shared in common to identify the members of a family, as distinguished from each member's given name"})

(def hasMaidenName
  {:db/ident :fibo-fnd-aap-ppl/hasMaidenName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/"},
   :rdfs/label "has maiden name",
   :rdfs/subPropertyOf :fibo-fnd-aap-ppl/hasPersonName,
   :skos/definition
   "indicates the name shared in common to identify the members of a family, that predates any changes of name due to marriage"})

(def hasMiddleNameOrInitial
  {:db/ident :fibo-fnd-aap-ppl/hasMiddleNameOrInitial,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/"},
   :rdfs/label "has middle name or initial",
   :rdfs/subPropertyOf :fibo-fnd-aap-ppl/hasPersonName,
   :skos/definition
   "one or more additional names or initial letters for names that occur between a person's first and last name"})

(def hasMinimumLegalWorkingAge
  {:db/ident :fibo-fnd-aap-ppl/hasMinimumLegalWorkingAge,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/"},
   :rdfs/label "has minimum legal working age",
   :rdfs/range :fibo-fnd-aap-ppl/LegalWorkingAge,
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasAge,
   :skos/definition
   "relates someone to the minimum legal working age for the jurisdiction in which they reside"})

(def hasNamePrefix
  {:db/ident :fibo-fnd-aap-ppl/hasNamePrefix,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/"},
   :rdfs/label "has name prefix",
   :rdfs/subPropertyOf :cmns-txt/hasTextValue,
   :skos/definition
   "indicates a character or sequence of characters, preceding a person's name, that provides additional information about the person, such as a form of address representing a title, honorific, or military rank"})

(def hasNameSuffix
  {:db/ident :fibo-fnd-aap-ppl/hasNameSuffix,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/"},
   :rdfs/label "has name suffix",
   :rdfs/subPropertyOf :cmns-txt/hasTextValue,
   :skos/definition
   "indicates a character or sequence of characters, following a person's name, that provides additional information about the person, such as their position, educational degree, accreditation, office, or honor"})

(def hasPersonName
  {:cmns-av/explanatoryNote
   "Note that the concept of a person name may include symbology as long as the symbols are properly encoded. Because person name is a class, other iconography or symbology that cannot be encoded in UTF-8 can, alternatively, be linked or attached as a separate image or in another form.",
   :db/ident :fibo-fnd-aap-ppl/hasPersonName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/"},
   :rdfs/label "has person name",
   :rdfs/subPropertyOf #{:cmns-txt/hasTextValue
                         :fibo-fnd-rel-rel/hasTextualName},
   :skos/definition "links a name to an individual"})

(def hasPlaceOfBirth
  {:db/ident :fibo-fnd-aap-ppl/hasPlaceOfBirth,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-aap-ppl/Person,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/"},
   :rdfs/label "has place of birth",
   :rdfs/range :fibo-fnd-aap-ppl/PlaceOfBirth,
   :rdfs/subPropertyOf :cmns-cls/isCharacterizedBy,
   :skos/definition "identifies the location where an individual was born"})

(def hasPrimaryResidence
  {:cmns-av/explanatoryNote
   "For tax purposes, in cases when an individual owns more than one home, their primary residence is the home in which they reside most of the time, and for which they can provide evidence to that effect. Having said this, there are cases, such as for individuals that have dual citizenship, where they may have multiple primary residences, one in each country in which they maintain a home. There may also be subtle issues related to 'rent control' that may impact the statements an individual makes about their primary residence. In other words, one cannot necessarily infer a person's identity from their primary place of residence.",
   :db/ident :fibo-fnd-aap-ppl/hasPrimaryResidence,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-aap-ppl/Person,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/"},
   :rdfs/label "has primary residence",
   :rdfs/range :fibo-fnd-plc-adr/ConventionalStreetAddress,
   :rdfs/subPropertyOf :fibo-fnd-aap-ppl/hasResidence,
   :skos/definition
   "identifies a dwelling where an individual resides the majority of the year"})

(def hasResidence
  {:db/ident :fibo-fnd-aap-ppl/hasResidence,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-aap-ppl/Person,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/"},
   :rdfs/label "has residence",
   :rdfs/range :fibo-fnd-plc-adr/ConventionalStreetAddress,
   :rdfs/subPropertyOf :fibo-fnd-plc-adr/hasAddress,
   :skos/definition "identifies a dwelling where an individual lives"})

(def hasSurname
  {:db/ident :fibo-fnd-aap-ppl/hasSurname,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/"},
   :rdfs/label "has surname",
   :rdfs/subPropertyOf :fibo-fnd-aap-ppl/hasPersonName,
   :skos/definition
   "indicates the name shared in common to identify the members of a family, as distinguished from each member's given name"})

(def urn:uuid:172c2531-0700-54d6-8265-ecfa3a0cab25
  {:cmns-av/copyright #{"Copyright (c) 2013-2023 Object Management Group, Inc."
                        "Copyright (c) 2013-2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology defines concepts for people and human related terms, for use in other FIBO ontology elements. People as defined here are human persons only. This ontology sets out a number of basic properties which are held by people or are definitive of a small number of specific types of people such as minors or adults. Primary use cases for determining the set of personal information definitions included are the common elements required to (1) open a bank account, (2) identify a sophisticated investor, and (3) establish foreign account ownership for money laundering purposes.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"}
     {:xsd/anyURI
      "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Parties/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Identifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/ContextualDesignators/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Addresses/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/IdentifiersAndIndices/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Collections/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Classifiers/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/Designators/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/DatesAndTimes/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Locations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Documents/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/TextDatatype/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/AgentsAndPeople/People/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "People Ontology",
   :skos/changeNote
   #{"The https://www.omg.org/spec/EDMC-FIBO/FND/20201201/AgentsAndPeople/People.rdf version of the ontology was modified to add hasResidence, hasMailingAddress, and hasPrimaryResidence properties and a restriction on person with respect to residence accordingly, then to move hasMailingAddress to Parties."
     "The https://www.omg.org/spec/EDMC-FIBO/FND/20210301/AgentsAndPeople/People.rdf version of the ontology was modified to allow the People ontology to import Parties, rather than the other way around, to simplify the class hierarchy for ease of use in data mapping and alignment, and to add person name as a first class concept, revising property definitions to allow for structured names by loosening constraints."
     "The https://www.omg.org/spec/EDMC-FIBO/FND/20210401/AgentsAndPeople/People.rdf version of the ontology was modified to add concepts specific to legal age, age of majority, legal working age and legal working age person."
     "The http://www.omg.org/spec/FIBO/Foundations/20130601/AgentsAndPeople/People.owl version of the ontology was revised in advance of the September 2013 New Brunswick, NJ meeting, as follows:\n\t\t(1) to use slash style URI/IRIss (also called 303 URIs, vs. hash style) as required to support server side processing \n\t\t(2) to use version-independent IRIs for all definitions internally as opposed to version-specific IRIs\n\t\t(3) to change the file suffix from .owl to .rdf to increase usability in RDF tools\n\t\t(4) to use 4-level abbreviations and corresponding namespace prefixes for all FIBO ontologies, reflecting a family/specification/module/ontology structure\n\t\t(5) to incorporate changes to the specification metadata to support documentation at the family, specification, module, and ontology level, similar to the abbreviations.\n\t\t(6) to revise and extend the set of properties about people required to fulfill the set of use cases listed above."
     "The http://spec.edmcouncil.org/fibo/ontology/FND/20130801/AgentsAndPeople/People.rdf version of the ontology was was modified per the issue resolutions identified in the FIBO FND 1.0 FTF report and in https://spec.edmcouncil.org/fibo/ontology/FND/1.0/AboutFND-1.0/. It was further revised in the FTF in advance of the Long Beach meeting, resulting in https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/."
     "The https://www.omg.org/spec/EDMC-FIBO/FND/20211101/AgentsAndPeople/People.rdf version of the ontology was modified to address hygiene issues with respect to text formatting."
     "The https://www.omg.org/spec/EDMC-FIBO/FND/20190501/AgentsAndPeople/People.rdf version of the ontology was modified to eliminate deprecated elements."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) rather than the OMG's Languages, Countries and Codes (LCC) and to eliminate redundancies in FIBO as appropriate."
     "The https://www.omg.org/spec/EDMC-FIBO/FND/20210601/AgentsAndPeople/People.rdf version of the ontology was modified to revise the definition of passport number as a national identification number and eliminate restrictions that would cause people to be inferred to be passports."
     "The https://www.omg.org/spec/EDMC-FIBO/FND/20190901/AgentsAndPeople/People.rdf version of the ontology was modified to eliminate duplication with concepts in LCC and correct a bug in a restriction on identity document."
     "The https://www.omg.org/spec/EDMC-FIBO/FND/20200201/AgentsAndPeople/People.rdf version of the ontology was modified to add explicit DateOfBirth and DateOfDeath, added DeathCertificate and related concepts, streamlined related properties and restrictions."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People.rdf version of the ontology was modified to replace hasDefinition with isDefinedIn to clarify intent."
     "The http://www.omg.org/spec/EDMC-FIBO/FND/20160201/AgentsAndPeople/People.rdf version of the ontology was modified per the FIBO 2.0 RFC, including integration of LCC."
     "The https://www.omg.org/spec/EDMC-FIBO/FND/20180801/AgentsAndPeople/People.rdf version of the ontology was modified to deprecate legally capable person in favor of natural person (defined in Business Entities)."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People.rdf version of the ontology was was modified to revise a restriction on IdentityDocument to reference the appropriate identifier rather than use a tag. The impetus behind this change is to support privacy legislation, such as GDPR, which requires protection of both identifiers, such as a passport number, drivers' license number, etc. as well as the documents themselves. Thus, properties and individuals related to those identifiers are urgently needed."
     "The https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People.rdf version of this ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
     "The http://spec.edmcouncil.org/fibo/ontology/FND/20141101/AgentsAndPeople/People.rdf version of the ontology was was modified per the issue resolutions identified in the FIBO FND 1.1 RTF report, primarily to use the hasAddress property in addresses, and change PostalAddress to PhysicalAddress in a restriction on Person. Also revised the identifiesAddress property in favor of verifiesAddress, and revised hasDateofBirth with respect to an identity document to be verifiesDateOfBirth, which was determined to be more appropriate by the RTF."},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/"})