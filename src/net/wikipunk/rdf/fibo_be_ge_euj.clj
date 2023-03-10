(ns net.wikipunk.rdf.fibo-be-ge-euj
  "This ontology provides the set of basic European Union specific government level entities and jurisdictions for use in other FIBO ontologies."
  {:cmns-av/copyright ["Copyright (c) 2016-2023 Object Management Group, Inc."
                       "Copyright (c) 2016-2023 EDM Council, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EUGovernmentEntitiesAndJurisdictions/",
   :dcterms/abstract
   "This ontology provides the set of basic European Union specific government level entities and jurisdictions for use in other FIBO ontologies.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/Jurisdiction/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/GovernmentEntities/GovernmentEntities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/GovernmentEntities/EuropeanJurisdiction/EUGovernmentEntitiesAndJurisdictions/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-ge-euj"
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EUGovernmentEntitiesAndJurisdictions/",
    "fibo-be-ge-ge"
    "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/GovernmentEntities/",
    "fibo-fnd-law-jur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/Jurisdiction/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "lcc-3166-1"
    "https://www.omg.org/spec/LCC/Countries/ISO3166-1-CountryCodes/",
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-be-ge-euj",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EUGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "European Government Entities and Jurisdictions Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EUGovernmentEntitiesAndJurisdictions.rdf version of this ontology was modified to address text formatting hygiene issues."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EUGovernmentEntitiesAndJurisdictions.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EUGovernmentEntitiesAndJurisdictions.rdf version of this ontology was modified to remove the UK from coverage by the EU jurisdiction and replace references to the Czech Republic with Czechia."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EUGovernmentEntitiesAndJurisdictions.rdf version of this ontology was modified to remove the unnecessary imports."]})

(def EuropeanUnionEntity
  "individual representing the federated sovereignty and polity that is the European Union"
  {:db/ident :fibo-be-ge-euj/EuropeanUnionEntity,
   :fibo-be-ge-ge/hasSharedSovereigntyOver [:lcc-3166-1/Netherlands
                                            :lcc-3166-1/Finland
                                            :lcc-3166-1/Ireland
                                            :lcc-3166-1/Belgium
                                            :lcc-3166-1/Italy
                                            :lcc-3166-1/Hungary
                                            :lcc-3166-1/Germany
                                            :lcc-3166-1/Denmark
                                            :lcc-3166-1/Latvia
                                            :lcc-3166-1/Estonia
                                            :lcc-3166-1/Greece
                                            :lcc-3166-1/France
                                            :lcc-3166-1/Sweden
                                            :lcc-3166-1/Slovenia
                                            :lcc-3166-1/Romania
                                            :lcc-3166-1/Malta
                                            :lcc-3166-1/Poland
                                            :lcc-3166-1/Luxembourg
                                            :lcc-3166-1/Austria
                                            :lcc-3166-1/Slovakia
                                            :lcc-3166-1/Czechia
                                            :lcc-3166-1/Cyprus
                                            :lcc-3166-1/Croatia
                                            :lcc-3166-1/Portugal
                                            :lcc-3166-1/Lithuania
                                            :lcc-3166-1/Bulgaria
                                            :lcc-3166-1/Spain],
   :fibo-be-ge-ge/isRepresentedBy :fibo-be-ge-euj/GovernmentOfTheEuropeanUnion,
   :rdf/type [:fibo-be-ge-ge/SupranationalEntity :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EUGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "European Union entity",
   :rdfs/seeAlso ["https://europa.eu/european-union/about-eu/countries_en"],
   :skos/definition
   "individual representing the federated sovereignty and polity that is the European Union"})

(def EuropeanUnionJurisdiction
  "individual representing the overall jurisdiction for the European Union, namely, that of the Court of Justice of the EU and Court of Auditors of the EU"
  {:cmns-av/adaptedFrom
   "https://europa.eu/european-union/about-eu/countries_en",
   :db/ident :fibo-be-ge-euj/EuropeanUnionJurisdiction,
   :fibo-be-ge-ge/isJurisdictionOf :fibo-be-ge-euj/GovernmentOfTheEuropeanUnion,
   :fibo-fnd-law-jur/hasReach [:lcc-3166-1/Ireland
                               :lcc-3166-1/Spain
                               :lcc-3166-1/Poland
                               :lcc-3166-1/Lithuania
                               :lcc-3166-1/Finland
                               :lcc-3166-1/Malta
                               :lcc-3166-1/Croatia
                               :lcc-3166-1/Estonia
                               :lcc-3166-1/Portugal
                               :lcc-3166-1/Bulgaria
                               :lcc-3166-1/Slovakia
                               :lcc-3166-1/Latvia
                               :lcc-3166-1/Netherlands
                               :lcc-3166-1/Luxembourg
                               :lcc-3166-1/Greece
                               :lcc-3166-1/Belgium
                               :lcc-3166-1/Sweden
                               :lcc-3166-1/Germany
                               :lcc-3166-1/France
                               :lcc-3166-1/Denmark
                               :lcc-3166-1/Slovenia
                               :lcc-3166-1/Italy
                               :lcc-3166-1/Austria
                               :lcc-3166-1/Cyprus
                               :lcc-3166-1/Hungary
                               :lcc-3166-1/Romania
                               :lcc-3166-1/Czechia],
   :rdf/type [:owl/NamedIndividual :fibo-fnd-law-jur/Jurisdiction],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EUGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "European Union jurisdiction",
   :skos/definition
   "individual representing the overall jurisdiction for the European Union, namely, that of the Court of Justice of the EU and Court of Auditors of the EU"})

(def GovernmentOfTheEuropeanUnion
  "individual representing the parliament, council, and other institutions that comprise the government of the European Union"
  {:cmns-av/adaptedFrom
   "https://europa.eu/european-union/about-eu/countries_en",
   :cmns-av/explanatoryNote
   "In the EU's unique institutional set-up:\n- the EU's broad priorities are set by the European Council, which brings together national and EU-level leaders directly elected MEPs represent European citizens in the European Parliament\n- the interests of the EU as a whole are promoted by the European Commission, whose members are appointed by national governments\n- governments defend their own country's national interests in the Council of the European Union.",
   :db/ident :fibo-be-ge-euj/GovernmentOfTheEuropeanUnion,
   :fibo-be-ge-ge/hasJurisdiction :fibo-be-ge-euj/EuropeanUnionJurisdiction,
   :fibo-fnd-rel-rel/governs [:lcc-3166-1/Latvia
                              :lcc-3166-1/France
                              :lcc-3166-1/Slovakia
                              :lcc-3166-1/Ireland
                              :lcc-3166-1/Finland
                              :lcc-3166-1/Belgium
                              :lcc-3166-1/Sweden
                              :lcc-3166-1/Lithuania
                              :lcc-3166-1/Cyprus
                              :lcc-3166-1/Portugal
                              :lcc-3166-1/Romania
                              :lcc-3166-1/Slovenia
                              :lcc-3166-1/Luxembourg
                              :lcc-3166-1/Germany
                              :lcc-3166-1/Italy
                              :lcc-3166-1/Estonia
                              :lcc-3166-1/Austria
                              :lcc-3166-1/Bulgaria
                              :lcc-3166-1/Greece
                              :lcc-3166-1/Czechia
                              :lcc-3166-1/Hungary
                              :lcc-3166-1/Denmark
                              :lcc-3166-1/Spain
                              :lcc-3166-1/Malta
                              :lcc-3166-1/Croatia
                              :lcc-3166-1/Poland
                              :lcc-3166-1/Netherlands],
   :rdf/type [:fibo-be-ge-ge/Government :owl/NamedIndividual],
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/EuropeanJurisdiction/EUGovernmentEntitiesAndJurisdictions/",
   :rdfs/label "Government of the European Union",
   :skos/definition
   "individual representing the parliament, council, and other institutions that comprise the government of the European Union"})