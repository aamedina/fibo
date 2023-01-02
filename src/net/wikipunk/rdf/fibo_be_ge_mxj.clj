(ns net.wikipunk.rdf.fibo-be-ge-mxj
  "This ontology provides the set of basic federal government, provincial, and territory level entities and jurisdictions for use in other Mexico-specific FIBO ontologies."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/MXGovernmentEntitiesAndJurisdictions/",
   :dcterms/abstract
   "This ontology provides the set of basic federal government, provincial, and territory level entities and jurisdictions for use in other Mexico-specific FIBO ontologies.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Arrangements/IdentifiersAndIndices/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LegalPersons/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/Jurisdiction/"
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-MX/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/GovernmentEntities/GovernmentEntities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LEIEntities/"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/GovernmentEntities/NorthAmericanJurisdiction/MXGovernmentEntitiesAndJurisdictions/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-be-ge-ge"
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/",
    "fibo-be-ge-mxj"
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/MXGovernmentEntitiesAndJurisdictions/",
    "fibo-fnd-law-jur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/Jurisdiction/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "lcc-3166-1"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
    "lcc-3166-2-mx"
    "https://www.omg.org/spec/LCC/Countries/Regions/ISO3166-2-SubdivisionCodes-MX/",
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/MXGovernmentEntitiesAndJurisdictions/",
   :rdfa/prefix "fibo-be-ge-mxj",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/MXGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "Mexican Government Entities and Jurisdictions Ontology",
   :skos/changeNote
   "The http://www.omg.org/spec/EDMC-FIBO/BE/20200701/GovernmentEntities/NorthAmericanJurisdiction/MXGovernmentEntitiesAndJurisdictions.rdf version of this ontology was modified to replace 'hasPartialSovereigntyOver' with 'hasSharedSovereigntyOver'.",
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright ["Copyright (c) 2020-2021 Object Management Group, Inc."
                  "Copyright (c) 2020-2021 EDM Council, Inc."],
   :sm/dependsOn
   ["https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/"
    "https://www.omg.org/spec/LCC/"
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LEIEntities/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/"],
   :sm/fileAbbreviation "fibo-be-ge-mxj",
   :sm/filename "MXGovernmentEntitiesAndJurisdictions.rdf"})

(def FederalGovernmentOfMexico
  "federal presidential constitutional republic with shared sovereignty over the republic with the governments of the 31 individual Mexican states, which functions per the Constitution of the United Mexican States"
  {:db/ident :fibo-be-ge-mxj/FederalGovernmentOfMexico,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-mxj/MexicanJurisdiction,
   :fibo-fnd-rel-rel/governs :lcc-3166-1/Mexico,
   :fibo-fnd-utl-av/synonym {:rdf/language "es-MX",
                             :rdf/value    "Gobierno de la República"},
   :rdf/type [:owl/NamedIndividual :fibo-be-ge-ge/FederalGovernment],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/MXGovernmentEntitiesAndJurisdictions/",
   :rdfs/label [{:rdf/language "en",
                 :rdf/value    "Federal Government of Mexico"}
                {:rdf/language "es-MX",
                 :rdf/value    "Gobierno Federal de México"}],
   :rdfs/seeAlso "http://www.gob.mx/",
   :skos/definition
   "federal presidential constitutional republic with shared sovereignty over the republic with the governments of the 31 individual Mexican states, which functions per the Constitution of the United Mexican States"})

(def MexicanEntity
  "federated sovereignty and polity that is Mexico"
  {:db/ident :fibo-be-ge-mxj/MexicanEntity,
   :fibo-be-ge-ge/hasFullSovereigntyOver :lcc-3166-1/Mexico,
   :fibo-be-ge-ge/hasSharedSovereigntyOver
   [:lcc-3166-2-mx/Tamaulipas
    :lcc-3166-2-mx/SanLuisPotosi
    :lcc-3166-2-mx/Chiapas
    :lcc-3166-2-mx/Yucatan
    :lcc-3166-2-mx/NuevoLeon
    :lcc-3166-2-mx/Colima
    :lcc-3166-2-mx/QuintanaRoo
    :lcc-3166-2-mx/BajaCalifornia
    :lcc-3166-2-mx/Aguascalientes
    :lcc-3166-2-mx/Jalisco
    :lcc-3166-2-mx/Tabasco
    :lcc-3166-2-mx/Oaxaca
    :lcc-3166-2-mx/Guerrero
    :lcc-3166-2-mx/Nayarit
    :lcc-3166-2-mx/Sinaloa
    :lcc-3166-2-mx/Sonora
    :lcc-3166-2-mx/Chihuahua
    :lcc-3166-2-mx/Campeche
    :lcc-3166-2-mx/VeracruzDeIgnacioDeLaLlave
    :lcc-3166-2-mx/Puebla
    :lcc-3166-2-mx/CiudadDeMexico
    :lcc-3166-2-mx/Tlaxcala
    :lcc-3166-2-mx/Mexico
    :lcc-3166-2-mx/CoahuilaDeZaragoza
    :lcc-3166-2-mx/Guanajuato
    :lcc-3166-2-mx/Zacatecas
    :lcc-3166-2-mx/Hidalgo
    :lcc-3166-2-mx/BajaCaliforniaSur
    :lcc-3166-2-mx/MichoacanDeOcampo
    :lcc-3166-2-mx/Durango
    :lcc-3166-2-mx/Queretaro
    :lcc-3166-2-mx/Morelos],
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-mxj/FederalGovernmentOfMexico,
   :rdf/type [:fibo-be-ge-ge/FederatedSovereignty :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/MXGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "Mexican entity",
   :rdfs/seeAlso "http://www.gob.mx/",
   :skos/definition "federated sovereignty and polity that is Mexico"})

(def MexicanJurisdiction
  "jurisdiction of the Supreme Court of Justice of the Nation, including the system of courts that interprets and applies the law at the federal level in Mexico"
  {:db/ident :fibo-be-ge-mxj/MexicanJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-mxj/FederalGovernmentOfMexico,
   :fibo-fnd-law-jur/hasReach :lcc-3166-1/Mexico,
   :fibo-fnd-utl-av/explanatoryNote
   "The Supreme Court of Justice of the Nation (SCJN) is the Mexican institution serving as the country's federal high court and the spearhead organisation for the judiciary of the Mexican Federal Government. It consists of eleven magistrates, known as ministers of the court, one of whom is designated the court's president.",
   :rdf/type [:fibo-fnd-law-jur/Jurisdiction :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/NorthAmericanJurisdiction/MXGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "Mexican jurisdiction",
   :rdfs/seeAlso "https://www.scjn.gob.mx/",
   :skos/definition
   "jurisdiction of the Supreme Court of Justice of the Nation, including the system of courts that interprets and applies the law at the federal level in Mexico"})