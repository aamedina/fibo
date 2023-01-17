(ns net.wikipunk.rdf.fibo-fnd-aap-ppl
  "This ontology defines concepts for people and human related terms, for use in other FIBO ontology elements. People as defined here are human persons only. This ontology sets out a number of basic properties which are held by people or are definitive of a small number of specific types of people such as minors or adults. Primary use cases for determining the set of personal information definitions included are the common elements required to (1) open a bank account, (2) identify a sophisticated investor, and (3) establish foreign account ownership for money laundering purposes."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
   :dcterms/abstract
   "This ontology defines concepts for people and human related terms, for use in other FIBO ontology elements. People as defined here are human persons only. This ontology sets out a number of basic properties which are held by people or are definitive of a small number of specific types of people such as minors or adults. Primary use cases for determining the set of personal information definitions included are the common elements required to (1) open a bank account, (2) identify a sophisticated investor, and (3) establish foreign account ownership for money laundering purposes.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Locations/"
    "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Parties/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/AgentsAndPeople/Agents/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/IdentifiersAndIndices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/DatesAndTimes/FinancialDates/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/Documents/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Places/Addresses/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/AgentsAndPeople/People/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-aap-agt"
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents/",
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
    "lcc-lr" "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
   :rdfa/prefix "fibo-fnd-aap-ppl",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
   :rdfs/label "People Ontology",
   :skos/changeNote
   ["The http://www.omg.org/spec/EDMC-FIBO/FND/20160201/AgentsAndPeople/People.rdf version of the ontology was modified per the FIBO 2.0 RFC, including integration of LCC."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People.rdf version of the ontology was was modified per the issue resolutions identified in the FIBO FND 1.0 FTF report and in https://spec.edmcouncil.org/fibo/ontology/FND/1.0/AboutFND-1.0/. It was further revised in the FTF in advance of the Long Beach meeting, resulting in https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/."
    "The https://www.omg.org/spec/EDMC-FIBO/FND/20211101/AgentsAndPeople/People.rdf version of the ontology was modified to address hygiene issues with respect to text formatting."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People.rdf version of the ontology was was modified to revise a restriction on IdentityDocument to reference the appropriate identifier rather than use a tag. The impetus behind this change is to support privacy legislation, such as GDPR, which requires protection of both identifiers, such as a passport number, drivers' license number, etc. as well as the documents themselves. Thus, properties and individuals related to those identifiers are urgently needed."
    "The https://www.omg.org/spec/EDMC-FIBO/FND/20210401/AgentsAndPeople/People.rdf version of the ontology was modified to add concepts specific to legal age, age of majority, legal working age and legal working age person."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People.rdf version of the ontology was was modified per the issue resolutions identified in the FIBO FND 1.1 RTF report, primarily to use the hasAddress property in addresses, and change PostalAddress to PhysicalAddress in a restriction on Person. Also revised the identifiesAddress property in favor of verifiesAddress, and revised hasDateofBirth with respect to an identity document to be verifiesDateOfBirth, which was determined to be more appropriate by the RTF."
    "The https://www.omg.org/spec/EDMC-FIBO/FND/20210601/AgentsAndPeople/People.rdf version of the ontology was modified to revise the definition of passport number as a national identification number and eliminate restrictions that would cause people to be inferred to be passports."
    "The https://www.omg.org/spec/EDMC-FIBO/FND/20190901/AgentsAndPeople/People.rdf version of the ontology was modified to eliminate duplication with concepts in LCC and correct a bug in a restriction on identity document."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People.rdf version of the ontology was modified to replace hasDefinition with isDefinedIn to clarify intent."
    "The https://www.omg.org/spec/EDMC-FIBO/FND/20201201/AgentsAndPeople/People.rdf version of the ontology was modified to add hasResidence, hasMailingAddress, and hasPrimaryResidence properties and a restriction on person with respect to residence accordingly, then to move hasMailingAddress to Parties."
    "The https://www.omg.org/spec/EDMC-FIBO/FND/20190501/AgentsAndPeople/People.rdf version of the ontology was modified to eliminate deprecated elements."
    "The https://www.omg.org/spec/EDMC-FIBO/FND/20200201/AgentsAndPeople/People.rdf version of the ontology was modified to add explicit DateOfBirth and DateOfDeath, added DeathCertificate and related concepts, streamlined related properties and restrictions."
    "The http://www.omg.org/spec/FIBO/Foundations/20130601/AgentsAndPeople/People.owl version of the ontology was revised in advance of the September 2013 New Brunswick, NJ meeting, as follows:\n\t\t(1) to use slash style URI/IRIss (also called 303 URIs, vs. hash style) as required to support server side processing \n\t\t(2) to use version-independent IRIs for all definitions internally as opposed to version-specific IRIs\n\t\t(3) to change the file suffix from .owl to .rdf to increase usability in RDF tools\n\t\t(4) to use 4-level abbreviations and corresponding namespace prefixes for all FIBO ontologies, reflecting a family/specification/module/ontology structure\n\t\t(5) to incorporate changes to the specification metadata to support documentation at the family, specification, module, and ontology level, similar to the abbreviations.\n\t\t(6) to revise and extend the set of properties about people required to fulfill the set of use cases listed above."
    "The https://www.omg.org/spec/EDMC-FIBO/FND/20180801/AgentsAndPeople/People.rdf version of the ontology was modified to deprecate legally capable person in favor of natural person (defined in Business Entities)."
    "The https://www.omg.org/spec/EDMC-FIBO/FND/20210301/AgentsAndPeople/People.rdf version of the ontology was modified to allow the People ontology to import Parties, rather than the other way around, to simplify the class hierarchy for ease of use in data mapping and alignment, and to add person name as a first class concept, revising property definitions to allow for structured names by loosening constraints."],
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright ["Copyright (c) 2013-2022 Object Management Group, Inc."
                  "Copyright (c) 2013-2022 EDM Council, Inc."],
   :sm/dependsOn
   ["https://www.omg.org/spec/LCC/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/Documents/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/Agents/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Locations/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/DatesAndTimes/FinancialDates/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Arrangements/IdentifiersAndIndices/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Places/Addresses/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/"],
   :sm/fileAbbreviation "fibo-fnd-aap-ppl",
   :sm/filename "People.rdf"})

(def Adult
  "person who has attained the age of majority as defined in some jurisdiction"
  {:db/ident :fibo-fnd-aap-ppl/Adult,
   :fibo-fnd-utl-av/adaptedFrom "https://en.wikipedia.org/wiki/Adult",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
   :rdfs/label "adult",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-aap-ppl/AgeOfMajority,
                      :owl/onProperty :fibo-fnd-aap-ppl/hasAgeOfMajority,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-aap-ppl/Person],
   :skos/definition
   "person who has attained the age of majority as defined in some jurisdiction"})

(def AgeOfMajority
  "age at which someone acquires the rights and responsibilities of an adult in some jurisdiction"
  {:db/ident :fibo-fnd-aap-ppl/AgeOfMajority,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
   :rdfs/label "age of majority",
   :rdfs/subClassOf :fibo-fnd-aap-ppl/LegalAge,
   :skos/definition
   "age at which someone acquires the rights and responsibilities of an adult in some jurisdiction"})

(def BirthCertificate
  "an original document certifying the circumstances of the birth, or a certified copy of or representation of the ensuing registration of that birth"
  {:db/ident :fibo-fnd-aap-ppl/BirthCertificate,
   :fibo-fnd-utl-av/adaptedFrom
   "http://en.wikipedia.org/wiki/Birth_certificate",
   :fibo-fnd-utl-av/explanatoryNote
   "A birth certificate is a vital record that documents the birth of a child. Depending on the jurisdiction, a record of birth might or might not contain verification of the event by such as a midwife or doctor.",
   :fibo-fnd-utl-av/synonym "certificate of live birth",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
   :rdfs/label "birth certificate",
   :rdfs/subClassOf [{:owl/onClass :fibo-fnd-aap-ppl/BirthCertificateIdentifier,
                      :owl/onProperty :lcc-lr/isIdentifiedBy,
                      :owl/qualifiedCardinality 1,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-aap-ppl/IdentityDocument
                     :fibo-fnd-arr-doc/Certificate],
   :skos/definition
   "an original document certifying the circumstances of the birth, or a certified copy of or representation of the ensuing registration of that birth"})

(def BirthCertificateIdentificationScheme
  "system for allocating identifiers to birth certificates"
  {:db/ident :fibo-fnd-aap-ppl/BirthCertificateIdentificationScheme,
   :fibo-fnd-utl-av/explanatoryNote
   "Schemes for birth certificate identification are typically regionally defined, and there may be jurisdiction-specific scope required as an additional restriction on a specific scheme.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
   :rdfs/label "birth certificate identification scheme",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-rel-rel/defines,
                      :owl/someValuesFrom
                      :fibo-fnd-aap-ppl/BirthCertificateIdentifier,
                      :rdf/type :owl/Restriction}
                     :lcc-lr/IdentificationScheme],
   :skos/definition "system for allocating identifiers to birth certificates"})

(def BirthCertificateIdentifier
  "identifier associated with a vital record documenting the birth of a child"
  {:db/ident :fibo-fnd-aap-ppl/BirthCertificateIdentifier,
   :fibo-fnd-utl-av/synonym "birth certificate number",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
   :rdfs/label "birth certificate identifier",
   :rdfs/subClassOf [{:owl/onClass
                      :fibo-fnd-aap-ppl/BirthCertificateIdentificationScheme,
                      :owl/onProperty :fibo-fnd-rel-rel/isDefinedIn,
                      :owl/qualifiedCardinality 1,
                      :rdf/type :owl/Restriction}
                     {:owl/onClass    :fibo-fnd-aap-ppl/BirthCertificate,
                      :owl/onProperty :lcc-lr/identifies,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :lcc-lr/Identifier],
   :skos/definition
   "identifier associated with a vital record documenting the birth of a child"})

(def DateOfBirth
  "explicit date, i.e., the day, month and year, on which an individual was born"
  {:db/ident :fibo-fnd-aap-ppl/DateOfBirth,
   :fibo-fnd-utl-av/synonym ["birthday" "birth date"],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
   :rdfs/label "date of birth",
   :rdfs/subClassOf :fibo-fnd-dt-fd/ExplicitDate,
   :skos/definition
   "explicit date, i.e., the day, month and year, on which an individual was born"})

(def DateOfDeath
  "explicit date, i.e., the day, month and year, on which an individual died"
  {:db/ident :fibo-fnd-aap-ppl/DateOfDeath,
   :fibo-fnd-utl-av/synonym "death date",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
   :rdfs/label "date of death",
   :rdfs/subClassOf :fibo-fnd-dt-fd/ExplicitDate,
   :skos/definition
   "explicit date, i.e., the day, month and year, on which an individual died"})

(def DeathCertificate
  "original document certifying the circumstances of the death (such as how and when it occurred), or a certified copy of or representation of the ensuing registration of that death"
  {:db/ident :fibo-fnd-aap-ppl/DeathCertificate,
   :fibo-fnd-utl-av/explanatoryNote
   "A death certificate is a vital record documenting information (including age, occupation, place of birth, place of residence, and often identifying the parents and possibly spouse of the deceased) relating to a dead person and including a doctor's certification of the cause of death.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
   :rdfs/label "death certificate",
   :rdfs/subClassOf [{:owl/onClass :fibo-fnd-aap-ppl/DeathCertificateIdentifier,
                      :owl/onProperty :lcc-lr/isIdentifiedBy,
                      :owl/qualifiedCardinality 1,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-arr-doc/Certificate
                     :fibo-fnd-aap-ppl/IdentityDocument],
   :skos/definition
   "original document certifying the circumstances of the death (such as how and when it occurred), or a certified copy of or representation of the ensuing registration of that death"})

(def DeathCertificateIdentificationScheme
  "system for allocating identifiers to death certificates"
  {:db/ident :fibo-fnd-aap-ppl/DeathCertificateIdentificationScheme,
   :fibo-fnd-utl-av/explanatoryNote
   "Schemes for death certificate identification are typically regionally defined, and there may be jurisdiction-specific scope required as an additional restriction on a specific scheme.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
   :rdfs/label "death certificate identification scheme",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-rel-rel/defines,
                      :owl/someValuesFrom
                      :fibo-fnd-aap-ppl/DeathCertificateIdentifier,
                      :rdf/type :owl/Restriction}
                     :lcc-lr/IdentificationScheme],
   :skos/definition "system for allocating identifiers to death certificates"})

(def DeathCertificateIdentifier
  "identifier associated with a vital record documenting the death of an individual"
  {:db/ident :fibo-fnd-aap-ppl/DeathCertificateIdentifier,
   :fibo-fnd-utl-av/synonym "death certificate number",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
   :rdfs/label "death certificate identifier",
   :rdfs/subClassOf [{:owl/onClass
                      :fibo-fnd-aap-ppl/DeathCertificateIdentificationScheme,
                      :owl/onProperty :fibo-fnd-rel-rel/isDefinedIn,
                      :owl/qualifiedCardinality 1,
                      :rdf/type :owl/Restriction}
                     {:owl/onClass    :fibo-fnd-aap-ppl/DeathCertificate,
                      :owl/onProperty :lcc-lr/identifies,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :lcc-lr/Identifier],
   :skos/definition
   "identifier associated with a vital record documenting the death of an individual"})

(def DriversLicense
  "an official document which states that a person may operate a motorized vehicle, such as a motorcycle, car, truck or a bus, on a public roadway or provides official identifying information for a non-driver"
  {:db/ident :fibo-fnd-aap-ppl/DriversLicense,
   :fibo-fnd-utl-av/adaptedFrom
   "https://en.wikipedia.org/wiki/Non-driver_identification_card#Non-driver_identification_cards",
   :fibo-fnd-utl-av/synonym "driving licence",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
   :rdfs/label "driver's license",
   :rdfs/subClassOf [{:owl/onClass :fibo-fnd-aap-ppl/DriversLicenseIdentifier,
                      :owl/onProperty :lcc-lr/isIdentifiedBy,
                      :owl/qualifiedCardinality 1,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-aap-ppl/IdentityDocument],
   :skos/definition
   "an official document which states that a person may operate a motorized vehicle, such as a motorcycle, car, truck or a bus, on a public roadway or provides official identifying information for a non-driver"})

(def DriversLicenseIdentificationScheme
  "system for allocating identifiers to driver's, operating, or non-driver identification documents"
  {:db/ident :fibo-fnd-aap-ppl/DriversLicenseIdentificationScheme,
   :fibo-fnd-utl-av/explanatoryNote
   "Schemes for driver's license identification are typically regionally defined, and there may be jurisdiction-specific scope required as an additional restriction on a specific scheme.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
   :rdfs/label "driver's license identification scheme",
   :rdfs/subClassOf [{:owl/onProperty :fibo-fnd-rel-rel/defines,
                      :owl/someValuesFrom
                      :fibo-fnd-aap-ppl/DriversLicenseIdentifier,
                      :rdf/type :owl/Restriction}
                     :lcc-lr/IdentificationScheme],
   :skos/definition
   "system for allocating identifiers to driver's, operating, or non-driver identification documents"})

(def DriversLicenseIdentifier
  "identifier associated with a drivers' or operating license for operating a motor vehicle or non-driver identification card"
  {:db/ident :fibo-fnd-aap-ppl/DriversLicenseIdentifier,
   :fibo-fnd-utl-av/synonym "driver's license number",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
   :rdfs/label "driver's license identifier",
   :rdfs/subClassOf [{:owl/onClass
                      :fibo-fnd-aap-ppl/DriversLicenseIdentificationScheme,
                      :owl/onProperty :fibo-fnd-rel-rel/isDefinedIn,
                      :owl/qualifiedCardinality 1,
                      :rdf/type :owl/Restriction}
                     {:owl/onClass    :fibo-fnd-aap-ppl/DriversLicense,
                      :owl/onProperty :lcc-lr/identifies,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :lcc-lr/Identifier],
   :skos/definition
   "identifier associated with a drivers' or operating license for operating a motor vehicle or non-driver identification card"})

(def EmancipatedMinor
  "a minor who is allowed to conduct a business or any other occupation on his or her own behalf or for their own account outside the control of a parent or guardian"
  {:db/ident :fibo-fnd-aap-ppl/EmancipatedMinor,
   :fibo-fnd-utl-av/adaptedFrom
   "https://en.wikipedia.org/wiki/Emancipated_minor",
   :fibo-fnd-utl-av/explanatoryNote
   "The minor will then have full contractual capacity to conclude contracts with regard to the business. Whether parental consent is needed to achieve emancipated status varies from case to case. In some cases, court permission is necessary. Protocols vary by jurisdiction.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
   :rdfs/label "emancipated minor",
   :rdfs/subClassOf :fibo-fnd-aap-ppl/Minor,
   :skos/definition
   "a minor who is allowed to conduct a business or any other occupation on his or her own behalf or for their own account outside the control of a parent or guardian"})

(def IdentityDocument
  "any legal document which may be used to verify aspects of a person's identity"
  {:db/ident :fibo-fnd-aap-ppl/IdentityDocument,
   :fibo-fnd-utl-av/adaptedFrom
   "https://en.wikipedia.org/wiki/Identification_card",
   :fibo-fnd-utl-av/explanatoryNote
   "If issued in the form of a small, mostly standard-sized card, it is usually called an identity card (IC). Countries which do not have formal identity documents may require informal documents. In the absence of a formal identity document, driving licenses can be used in many countries as a method of proof of identity, although some countries do not accept driving licenses for identification, often because in those countries they don't expire as documents and can be old and easily forged. Most countries accept passports as a form of identification. Most countries have the rule that foreign citizens need to have their passport or occasionally a national identity card from their country available at any time if they do not have residence permit in the country.",
   :fibo-fnd-utl-av/synonym "identity card",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
   :rdfs/label "identity document",
   :rdfs/subClassOf [{:owl/onClass    :fibo-fnd-dt-fd/Date,
                      :owl/onProperty :fibo-fnd-arr-doc/hasExpirationDate,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-fnd-dt-fd/Date,
                      :owl/onProperty :fibo-fnd-arr-doc/hasDateOfIssuance,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-arr-doc/LegalDocument
                     {:owl/onClass    :lcc-lr/Identifier,
                      :owl/onProperty :lcc-lr/isIdentifiedBy,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onProperty     :lcc-lr/identifies,
                      :owl/someValuesFrom :fibo-fnd-aap-ppl/Person,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   "any legal document which may be used to verify aspects of a person's identity"})

(def IncapacitatedAdult
  "an adult who is legally identified as not having legal capacity, typically as a result of some inherent physical or mental incapacity or as a result of having contracted some illness which temporarily deprives them of such capacity"
  {:db/ident :fibo-fnd-aap-ppl/IncapacitatedAdult,
   :fibo-fnd-utl-av/adaptedFrom "https://en.wikipedia.org/wiki/Capacity_(law)",
   :fibo-fnd-utl-av/explanatoryNote
   "Individuals may have an inherent physical condition which prevents them from achieving the normal levels of performance expected from persons of comparable age, or their inability to match current levels of performance may be caused by contracting an illness. Whatever the cause, if the resulting condition is such that individuals cannot care for themselves, or may act in ways that are against their interests, those persons are vulnerable through dependency and require the protection of the state against the risks of abuse or exploitation. Hence, any agreements that were made are voidable, and a court may declare that person a ward of the state and grant power of attorney to an appointed legal guardian.",
   :owl/disjointWith :fibo-fnd-aap-ppl/LegallyCapableAdult,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
   :rdfs/label "incapacitated adult",
   :rdfs/subClassOf :fibo-fnd-aap-ppl/Adult,
   :skos/definition
   "an adult who is legally identified as not having legal capacity, typically as a result of some inherent physical or mental incapacity or as a result of having contracted some illness which temporarily deprives them of such capacity"})

(def LegalAge
  "age at which someone acquires the capacity to do something that they were prohibited from doing before under the law in some jurisdiction"
  {:db/ident :fibo-fnd-aap-ppl/LegalAge,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
   :rdfs/label "legal age",
   :rdfs/subClassOf :fibo-fnd-dt-fd/Age,
   :skos/definition
   "age at which someone acquires the capacity to do something that they were prohibited from doing before under the law in some jurisdiction"})

(def LegalWorkingAge
  "age at which someone acquires the capacity to work legally in some jurisdiction"
  {:db/ident :fibo-fnd-aap-ppl/LegalWorkingAge,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
   :rdfs/label "legal working age",
   :rdfs/subClassOf :fibo-fnd-aap-ppl/LegalAge,
   :skos/definition
   "age at which someone acquires the capacity to work legally in some jurisdiction"})

(def LegalWorkingAgePerson
  "person whose age is greater than the minimum legal working age specified in a jurisdiction in which they work"
  {:db/ident :fibo-fnd-aap-ppl/LegalWorkingAgePerson,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
   :rdfs/label "legal working age person",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass :fibo-fnd-aap-ppl/LegalWorkingAge,
                      :owl/onProperty
                      :fibo-fnd-aap-ppl/hasMinimumLegalWorkingAge,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-aap-ppl/Person],
   :skos/definition
   "person whose age is greater than the minimum legal working age specified in a jurisdiction in which they work"})

(def LegallyCapableAdult
  "person who has attained the age of majority as defined in some jurisdiction and who is allowed to conduct a business or any other occupation on his or her own behalf or for their own account"
  {:db/ident :fibo-fnd-aap-ppl/LegallyCapableAdult,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
   :rdfs/label "legally capable adult",
   :rdfs/subClassOf :fibo-fnd-aap-ppl/Adult,
   :skos/definition
   "person who has attained the age of majority as defined in some jurisdiction and who is allowed to conduct a business or any other occupation on his or her own behalf or for their own account"})

(def Minor
  "a person under a certain age, usually the age of majority in a given jurisdiction, which legally demarcates childhood from adulthood"
  {:db/ident :fibo-fnd-aap-ppl/Minor,
   :fibo-fnd-utl-av/adaptedFrom "https://en.wikipedia.org/wiki/Minor_(law)",
   :fibo-fnd-utl-av/explanatoryNote
   "The age depends upon jurisdiction and application, but is generally 18.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
   :rdfs/label "minor",
   :rdfs/subClassOf :fibo-fnd-aap-ppl/Person,
   :skos/definition
   "a person under a certain age, usually the age of majority in a given jurisdiction, which legally demarcates childhood from adulthood"})

(def NationalIdentificationNumber
  "number or text which appears on an identity document issued by a country or jurisdiction"
  {:db/ident :fibo-fnd-aap-ppl/NationalIdentificationNumber,
   :fibo-fnd-utl-av/adaptedFrom
   "http://en.wikipedia.org/wiki/National_identification_number",
   :fibo-fnd-utl-av/explanatoryNote
   "A national identification number, national identity number, or national insurance number is used by the governments of many countries as a means of tracking their citizens, permanent residents, and temporary residents for the purposes of work, taxation, government benefits, health care, and other governmentally-related functions. The number will appear on an identity document issued by a country.\n\nThe ways in which such a system is implemented are dependent on the country, but in most cases, a citizen is issued an identification number at birth or when they reach a legal age (typically the age of 18). Non-citizens may be issued such numbers when they enter the country, or when granted a temporary or permanent residence permit.\n\nMany countries issued such numbers ostensibly for a singular purpose, but over time, they become a de facto national identification number. For example, the United States originally developed its Social Security number system as a means of disbursing Social Security benefits. However, due to function creep, the number has become utilized for other purposes to the point where it is almost essential to have one to, among other things, open a bank account, obtain a credit card, or drive a car.",
   :fibo-fnd-utl-av/synonym "national identity number",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
   :rdfs/label "national identification number",
   :rdfs/subClassOf [:lcc-lr/Identifier
                     {:owl/onClass    :fibo-fnd-aap-ppl/Person,
                      :owl/onProperty :lcc-lr/identifies,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass
                      :fibo-fnd-aap-ppl/NationalIdentificationNumberScheme,
                      :owl/onProperty :fibo-fnd-rel-rel/isDefinedIn,
                      :owl/qualifiedCardinality 1,
                      :rdf/type :owl/Restriction}],
   :skos/definition
   "number or text which appears on an identity document issued by a country or jurisdiction"})

(def NationalIdentificationNumberScheme
  "system for allocating identifiers to national identification numbers"
  {:db/ident :fibo-fnd-aap-ppl/NationalIdentificationNumberScheme,
   :fibo-fnd-utl-av/explanatoryNote
   "Schemes for national identification numbers are jurisdiction-specific by country.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
   :rdfs/label "national identification number scheme",
   :rdfs/subClassOf [{:owl/onProperty :lcc-lr/hasMember,
                      :owl/someValuesFrom
                      :fibo-fnd-aap-ppl/NationalIdentificationNumber,
                      :rdf/type :owl/Restriction}
                     :lcc-lr/IdentificationScheme],
   :skos/definition
   "system for allocating identifiers to national identification numbers"})

(def Passport
  "formal identity document, issued by a national government, which certifies the identity and nationality of its holder for the purpose of international travel"
  {:db/ident :fibo-fnd-aap-ppl/Passport,
   :fibo-fnd-utl-av/definitionOrigin "https://en.wikipedia.org/wiki/Passport",
   :fibo-fnd-utl-av/explanatoryNote
   "The elements of identity contained in all standardized passports include information about the holder, including name, date of birth, gender and place of birth.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
   :rdfs/label "passport",
   :rdfs/subClassOf [{:owl/onClass    :fibo-fnd-aap-ppl/PassportNumber,
                      :owl/onProperty :fibo-fnd-rel-rel/comprises,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-aap-ppl/IdentityDocument],
   :skos/definition
   "formal identity document, issued by a national government, which certifies the identity and nationality of its holder for the purpose of international travel"})

(def PassportNumber
  "national identification number associated with a passport"
  {:db/ident :fibo-fnd-aap-ppl/PassportNumber,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
   :rdfs/label "passport number",
   :rdfs/subClassOf [{:owl/onClass
                      :fibo-fnd-aap-ppl/PassportNumberIdentificationScheme,
                      :owl/onProperty :fibo-fnd-rel-rel/isDefinedIn,
                      :owl/qualifiedCardinality 1,
                      :rdf/type :owl/Restriction}
                     :fibo-fnd-aap-ppl/NationalIdentificationNumber],
   :skos/definition
   "national identification number associated with a passport"})

(def PassportNumberIdentificationScheme
  "system for allocating identifiers to passports"
  {:db/ident :fibo-fnd-aap-ppl/PassportNumberIdentificationScheme,
   :fibo-fnd-utl-av/explanatoryNote
   "Schemes for passport identification are jurisdiction-specific by country.",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
   :rdfs/label "passport number identification scheme",
   :rdfs/subClassOf [{:owl/onProperty     :lcc-lr/hasMember,
                      :owl/someValuesFrom :fibo-fnd-aap-ppl/PassportNumber,
                      :rdf/type           :owl/Restriction}
                     :lcc-lr/IdentificationScheme],
   :skos/definition "system for allocating identifiers to passports"})

(def Person
  "individual human being, with consciousness of self"
  {:db/ident :fibo-fnd-aap-ppl/Person,
   :fibo-fnd-utl-av/synonym "natural person",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "person"},
   :rdfs/subClassOf [{:owl/onDataRange :xsd/string,
                      :owl/onProperty  :fibo-fnd-aap-ppl/hasGender,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-aap-ppl/PersonName,
                      :owl/onProperty :fibo-fnd-aap-agt/hasStructuredName,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass :fibo-fnd-plc-adr/ConventionalStreetAddress,
                      :owl/onProperty :fibo-fnd-aap-ppl/hasResidence,
                      :rdf/type :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-dt-fd/Age,
                      :owl/onProperty :fibo-fnd-dt-fd/hasAge,
                      :rdf/type       :owl/Restriction}
                     :fibo-fnd-pty-pty/IndependentParty
                     {:owl/onClass    :fibo-fnd-aap-ppl/PlaceOfBirth,
                      :owl/onProperty :fibo-fnd-aap-ppl/hasPlaceOfBirth,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-aap-ppl/DateOfDeath,
                      :owl/onProperty :fibo-fnd-aap-ppl/hasDateOfDeath,
                      :rdf/type       :owl/Restriction}
                     {:owl/onClass    :fibo-fnd-aap-ppl/DateOfBirth,
                      :owl/onProperty :fibo-fnd-aap-ppl/hasDateOfBirth,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onClass    :lcc-cr/Country,
                      :owl/onProperty :fibo-fnd-aap-ppl/hasCitizenship,
                      :rdf/type       :owl/Restriction}],
   :skos/definition "individual human being, with consciousness of self"})

(def PersonName
  "designation by which someone is known in some context"
  {:db/ident :fibo-fnd-aap-ppl/PersonName,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
   :rdfs/label "person name",
   :rdfs/subClassOf [{:owl/minQualifiedCardinality 0,
                      :owl/onClass    :fibo-fnd-aap-ppl/Person,
                      :owl/onProperty :fibo-fnd-aap-agt/isStructuredNameOf,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :fibo-fnd-aap-agt/Text,
                      :owl/onProperty  :fibo-fnd-aap-ppl/hasNamePrefix,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :fibo-fnd-aap-agt/Text,
                      :owl/onProperty  :fibo-fnd-aap-ppl/hasFullLegalName,
                      :rdf/type        :owl/Restriction}
                     :fibo-fnd-pty-pty/ContextualName
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :fibo-fnd-aap-agt/Text,
                      :owl/onProperty  :fibo-fnd-aap-ppl/hasSurname,
                      :rdf/type        :owl/Restriction}
                     {:owl/minQualifiedCardinality 0,
                      :owl/onDataRange :fibo-fnd-aap-agt/Text,
                      :owl/onProperty  :fibo-fnd-aap-ppl/hasNameSuffix,
                      :rdf/type        :owl/Restriction}],
   :skos/definition "designation by which someone is known in some context"})

(def PlaceOfBirth
  "physical location, including country, region, and municipality where an individual was born"
  {:db/ident :fibo-fnd-aap-ppl/PlaceOfBirth,
   :fibo-fnd-utl-av/synonym "birth place",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
   :rdfs/label "place of birth",
   :rdfs/subClassOf :fibo-fnd-plc-loc/PhysicalLocation,
   :skos/definition
   "physical location, including country, region, and municipality where an individual was born"})

(def hasAgeOfMajority
  "relates someone to the age required to attain the capacity to engage in certain transactions or be treated legally as an adult in some jurisdiction"
  {:db/ident :fibo-fnd-aap-ppl/hasAgeOfMajority,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
   :rdfs/label "has age of majority",
   :rdfs/range :fibo-fnd-aap-ppl/AgeOfMajority,
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasAge,
   :skos/definition
   "relates someone to the age required to attain the capacity to engage in certain transactions or be treated legally as an adult in some jurisdiction"})

(def hasCitizenship
  "links a person to their country of citizenship"
  {:db/ident :fibo-fnd-aap-ppl/hasCitizenship,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-aap-ppl/Person,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
   :rdfs/label "has citizenship",
   :rdfs/range :lcc-cr/Country,
   :rdfs/subPropertyOf :lcc-lr/has,
   :skos/definition "links a person to their country of citizenship"})

(def hasDateOfBirth
  "identifies the date on which an individual was born"
  {:db/ident :fibo-fnd-aap-ppl/hasDateOfBirth,
   :rdf/type [:owl/FunctionalProperty :owl/ObjectProperty],
   :rdfs/domain :fibo-fnd-aap-ppl/Person,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
   :rdfs/label "has date of birth",
   :rdfs/range :fibo-fnd-aap-ppl/DateOfBirth,
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasExplicitDate,
   :skos/definition "identifies the date on which an individual was born"})

(def hasDateOfDeath
  "identifies the date on which an individual died"
  {:db/ident :fibo-fnd-aap-ppl/hasDateOfDeath,
   :rdf/type [:owl/FunctionalProperty :owl/ObjectProperty],
   :rdfs/domain :fibo-fnd-aap-ppl/Person,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
   :rdfs/label "has date of death",
   :rdfs/range :fibo-fnd-aap-ppl/DateOfDeath,
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasExplicitDate,
   :skos/definition "identifies the date on which an individual died"})

(def hasFamilyName
  "indicates the name shared in common to identify the members of a family, as distinguished from each member's given name"
  {:db/ident :fibo-fnd-aap-ppl/hasFamilyName,
   :fibo-fnd-utl-av/explanatoryNote
   "'Family name' is more commonly used in the United Kingdom than in the United States to refer to someone's surname.",
   :owl/equivalentProperty [:fibo-fnd-aap-ppl/hasSurname
                            :fibo-fnd-aap-ppl/hasLastName],
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
   :rdfs/label "has family name",
   :rdfs/subPropertyOf :fibo-fnd-aap-ppl/hasPersonName,
   :skos/definition
   "indicates the name shared in common to identify the members of a family, as distinguished from each member's given name"})

(def hasFirstName
  "indicates the given name or first name of a person, that is, the name chosen for them at birth or changed by them subsequently from the name given at birth"
  {:db/ident :fibo-fnd-aap-ppl/hasFirstName,
   :owl/equivalentProperty :fibo-fnd-aap-ppl/hasGivenName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
   :rdfs/label "has first name",
   :rdfs/subPropertyOf :fibo-fnd-aap-ppl/hasPersonName,
   :skos/definition
   "indicates the given name or first name of a person, that is, the name chosen for them at birth or changed by them subsequently from the name given at birth"})

(def hasFullLegalName
  "indicates the complete name of a person, typically used in formal situations including those of a legal or contractual nature"
  {:db/ident :fibo-fnd-aap-ppl/hasFullLegalName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
   :rdfs/label "has full legal name",
   :rdfs/subPropertyOf [:fibo-fnd-rel-rel/hasLegalName
                        :fibo-fnd-aap-ppl/hasPersonName],
   :skos/definition
   "indicates the complete name of a person, typically used in formal situations including those of a legal or contractual nature"})

(def hasGender
  "links a particular gender value with a person"
  {:db/ident :fibo-fnd-aap-ppl/hasGender,
   :rdf/type [:owl/FunctionalProperty :owl/DatatypeProperty],
   :rdfs/domain :fibo-fnd-aap-ppl/Person,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
   :rdfs/label "has gender",
   :rdfs/range :xsd/string,
   :skos/definition "links a particular gender value with a person"})

(def hasGivenName
  "indicates the given name or first name of a person, that is, the name chosen for them at birth or changed by them subsequently from the name given at birth"
  {:db/ident :fibo-fnd-aap-ppl/hasGivenName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
   :rdfs/label "has given name",
   :rdfs/subPropertyOf :fibo-fnd-aap-ppl/hasPersonName,
   :skos/definition
   "indicates the given name or first name of a person, that is, the name chosen for them at birth or changed by them subsequently from the name given at birth"})

(def hasLastName
  "indicates the name shared in common to identify the members of a family, as distinguished from each member's given name"
  {:db/ident :fibo-fnd-aap-ppl/hasLastName,
   :owl/equivalentProperty :fibo-fnd-aap-ppl/hasSurname,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
   :rdfs/label "has last name",
   :rdfs/subPropertyOf :fibo-fnd-aap-ppl/hasPersonName,
   :skos/definition
   "indicates the name shared in common to identify the members of a family, as distinguished from each member's given name"})

(def hasMaidenName
  "indicates the name shared in common to identify the members of a family, that predates any changes of name due to marriage"
  {:db/ident :fibo-fnd-aap-ppl/hasMaidenName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
   :rdfs/label "has maiden name",
   :rdfs/subPropertyOf :fibo-fnd-aap-ppl/hasPersonName,
   :skos/definition
   "indicates the name shared in common to identify the members of a family, that predates any changes of name due to marriage"})

(def hasMiddleNameOrInitial
  "one or more additional names or initial letters for names that occur between a person's first and last name"
  {:db/ident :fibo-fnd-aap-ppl/hasMiddleNameOrInitial,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
   :rdfs/label "has middle name or initial",
   :rdfs/subPropertyOf :fibo-fnd-aap-ppl/hasPersonName,
   :skos/definition
   "one or more additional names or initial letters for names that occur between a person's first and last name"})

(def hasMinimumLegalWorkingAge
  "relates someone to the minimum legal working age for the jurisdiction in which they reside"
  {:db/ident :fibo-fnd-aap-ppl/hasMinimumLegalWorkingAge,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
   :rdfs/label "has minimum legal working age",
   :rdfs/range :fibo-fnd-aap-ppl/LegalWorkingAge,
   :rdfs/subPropertyOf :fibo-fnd-dt-fd/hasAge,
   :skos/definition
   "relates someone to the minimum legal working age for the jurisdiction in which they reside"})

(def hasNamePrefix
  "indicates a character or sequence of characters, preceding a person's name, that provides additional information about the person, such as a form of address representing a title, honorific, or military rank"
  {:db/ident :fibo-fnd-aap-ppl/hasNamePrefix,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
   :rdfs/label "has name prefix",
   :rdfs/subPropertyOf :fibo-fnd-aap-agt/hasTextValue,
   :skos/definition
   "indicates a character or sequence of characters, preceding a person's name, that provides additional information about the person, such as a form of address representing a title, honorific, or military rank"})

(def hasNameSuffix
  "indicates a character or sequence of characters, following a person's name, that provides additional information about the person, such as their position, educational degree, accreditation, office, or honor"
  {:db/ident :fibo-fnd-aap-ppl/hasNameSuffix,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
   :rdfs/label "has name suffix",
   :rdfs/subPropertyOf :fibo-fnd-aap-agt/hasTextValue,
   :skos/definition
   "indicates a character or sequence of characters, following a person's name, that provides additional information about the person, such as their position, educational degree, accreditation, office, or honor"})

(def hasPersonName
  "links a name to an individual"
  {:db/ident :fibo-fnd-aap-ppl/hasPersonName,
   :fibo-fnd-utl-av/explanatoryNote
   "Note that the concept of a person name may include symbology as long as the symbols are properly encoded. Because person name is a class, other iconography or symbology that cannot be encoded in UTF-8 can, alternatively, be linked or attached as a separate image or in another form.",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
   :rdfs/label "has person name",
   :rdfs/subPropertyOf [:lcc-lr/hasName :fibo-fnd-aap-agt/hasTextValue],
   :skos/definition "links a name to an individual"})

(def hasPlaceOfBirth
  "identifies the location where an individual was born"
  {:db/ident :fibo-fnd-aap-ppl/hasPlaceOfBirth,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-aap-ppl/Person,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
   :rdfs/label "has place of birth",
   :rdfs/range :fibo-fnd-aap-ppl/PlaceOfBirth,
   :rdfs/subPropertyOf :lcc-lr/has,
   :skos/definition "identifies the location where an individual was born"})

(def hasPrimaryResidence
  "identifies a dwelling where an individual resides the majority of the year"
  {:db/ident :fibo-fnd-aap-ppl/hasPrimaryResidence,
   :fibo-fnd-utl-av/explanatoryNote
   "For tax purposes, in cases when an individual owns more than one home, their primary residence is the home in which they reside most of the time, and for which they can provide evidence to that effect. Having said this, there are cases, such as for individuals that have dual citizenship, where they may have multiple primary residences, one in each country in which they maintain a home. There may also be subtle issues related to 'rent control' that may impact the statements an individual makes about their primary residence. In other words, one cannot necessarily infer a person's identity from their primary place of residence.",
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-aap-ppl/Person,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
   :rdfs/label "has primary residence",
   :rdfs/range :fibo-fnd-plc-adr/ConventionalStreetAddress,
   :rdfs/subPropertyOf :fibo-fnd-aap-ppl/hasResidence,
   :skos/definition
   "identifies a dwelling where an individual resides the majority of the year"})

(def hasResidence
  "identifies a dwelling where an individual lives"
  {:db/ident :fibo-fnd-aap-ppl/hasResidence,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-aap-ppl/Person,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
   :rdfs/label "has residence",
   :rdfs/range :fibo-fnd-plc-adr/ConventionalStreetAddress,
   :rdfs/subPropertyOf :fibo-fnd-plc-adr/hasAddress,
   :skos/definition "identifies a dwelling where an individual lives"})

(def hasSurname
  "indicates the name shared in common to identify the members of a family, as distinguished from each member's given name"
  {:db/ident :fibo-fnd-aap-ppl/hasSurname,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
   :rdfs/label "has surname",
   :rdfs/subPropertyOf :fibo-fnd-aap-ppl/hasPersonName,
   :skos/definition
   "indicates the name shared in common to identify the members of a family, as distinguished from each member's given name"})
