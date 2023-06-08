(ns net.wikipunk.rdf.fibo-be-sps-sps
  "This ontology defines the fundamental concepts for representing sole proprietorships -- i.e., organizations that are owned by an individual that is responsible for the liabilities of the organization."
  {:cmns-av/copyright ["Copyright (c) 2016-2023 Object Management Group, Inc."
                       "Copyright (c) 2016-2023 EDM Council, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/BE/SoleProprietorships/SoleProprietorships/",
   :dcterms/abstract
   "This ontology defines the fundamental concepts for representing sole proprietorships -- i.e., organizations that are owned by an individual that is responsible for the liabilities of the organization.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/OwnershipAndControl/OwnershipParties/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Parties/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/LegalCapacity/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Roles/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/OwnershipAndControl/OwnershipAndControl/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/LegalPersons/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/SoleProprietorships/SoleProprietorships/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-le-lp"
    "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/LegalPersons/",
    "fibo-be-oac-opty"
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/OwnershipParties/",
    "fibo-be-sps-sps"
    "https://spec.edmcouncil.org/fibo/ontology/BE/SoleProprietorships/SoleProprietorships/",
    "fibo-fnd-law-lcap"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCapacity/",
    "fibo-fnd-oac-oac"
    "https://spec.edmcouncil.org/fibo/ontology/FND/OwnershipAndControl/OwnershipAndControl/",
    "fibo-fnd-pty-rl"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Roles/",
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
   :rdfa/prefix "fibo-be-sps-sps",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/BE/SoleProprietorships/SoleProprietorships/",
   :rdfs/label "Sole Proprietorships Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/BE/SoleProprietorships/SoleProprietorships.rdf version of the ontology was modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/SoleProprietorships/SoleProprietorships.rdf version of this ontology was modified to eliminate a redundant subclass relationship, enhance ownership relations, and revise definitions to be ISO 704 compliant."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/SoleProprietorships/SoleProprietorships.rdf version of this ontology was modified to eliminate unnecessary references to external sources."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/SoleProprietorships/SoleProprietorships.rdf version of this ontology was modified per the FIBO 2.0 RFC."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/SoleProprietorships/SoleProprietorships.rdf version of this ontology was modified to use natural person rather than legally capable person."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/SoleProprietorships/SoleProprietorships.rdf version of this ontology was modified to make sole proprietorship a subclass of legal person."]})

(def SoleProprietor
  "party that owns a business, has the rights to all profits from that business and is considered a single entity (unincorporated) together with that business for tax and liability purposes"
  {:cmns-av/explanatoryNote
   "A sole proprietor has unlimited liability with respect to any business debts.",
   :cmns-av/synonym ["sole owner" "sole trader"],
   :db/ident :fibo-be-sps-sps/SoleProprietor,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/SoleProprietorships/SoleProprietorships/",
   :rdfs/label "sole proprietor",
   :rdfs/subClassOf [{:owl/onClass :fibo-be-le-lp/LegallyCompetentNaturalPerson,
                      :owl/onProperty :fibo-fnd-rel-rel/hasIdentity,
                      :owl/qualifiedCardinality 1,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-fnd-pty-rl/isPlayedBy,
                      :owl/someValuesFrom {:owl/onProperty
                                           :fibo-fnd-oac-oac/ownsAndControls,
                                           :owl/someValuesFrom
                                           :fibo-be-sps-sps/SoleProprietorship,
                                           :rdf/type :owl/Restriction},
                      :rdf/type           :owl/Restriction}
                     :fibo-be-oac-opty/EntityOwner
                     {:owl/onProperty     :fibo-be-oac-opty/hasInvestmentEntity,
                      :owl/someValuesFrom :fibo-be-sps-sps/SoleProprietorship,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   "party that owns a business, has the rights to all profits from that business and is considered a single entity (unincorporated) together with that business for tax and liability purposes"})

(def SoleProprietorship
  "unincorporated business owned by a single person"
  {:db/ident :fibo-be-sps-sps/SoleProprietorship,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/BE/SoleProprietorships/SoleProprietorships/",
   :rdfs/label "sole proprietorship",
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-law-lcap/hasCapacity,
                      :owl/someValuesFrom :fibo-fnd-law-lcap/LiabilityCapacity,
                      :rdf/type           :owl/Restriction}
                     {:owl/onClass :fibo-be-le-lp/LegallyCompetentNaturalPerson,
                      :owl/onProperty :fibo-fnd-oac-oac/isOwnedAndControlledBy,
                      :owl/qualifiedCardinality 1,
                      :rdf/type :owl/Restriction}
                     :fibo-be-le-lp/LegalPerson
                     :fibo-be-le-lp/BusinessEntity],
   :skos/definition "unincorporated business owned by a single person"})