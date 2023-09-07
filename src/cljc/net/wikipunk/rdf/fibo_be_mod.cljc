(ns net.wikipunk.rdf.fibo-be-mod
  ^{:base "https://spec.edmcouncil.org/fibo/ontology/BE/MetadataBE/",
    :namespaces
    {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
     "dcterms" "http://purl.org/dc/terms/",
     "fibo-be-corp-mod"
     "https://spec.edmcouncil.org/fibo/ontology/BE/Corporations/MetadataBECorporations/",
     "fibo-be-fct-mod"
     "https://spec.edmcouncil.org/fibo/ontology/BE/FunctionalEntities/MetadataBEFunctionalEntities/",
     "fibo-be-ge-mod"
     "https://spec.edmcouncil.org/fibo/ontology/BE/GovernmentEntities/MetadataBEGovernmentEntities/",
     "fibo-be-le-mod"
     "https://spec.edmcouncil.org/fibo/ontology/BE/LegalEntities/MetadataBELegalEntities/",
     "fibo-be-mod" "https://spec.edmcouncil.org/fibo/ontology/BE/MetadataBE/",
     "fibo-be-oac-mod"
     "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/MetadataBEOwnershipAndControl/",
     "fibo-be-plc-mod"
     "https://spec.edmcouncil.org/fibo/ontology/BE/PrivateLimitedCompanies/MetadataBEPrivateLimitedCompanies/",
     "fibo-be-ptr-mod"
     "https://spec.edmcouncil.org/fibo/ontology/BE/Partnerships/MetadataBEPartnerships/",
     "fibo-be-sps-mod"
     "https://spec.edmcouncil.org/fibo/ontology/BE/SoleProprietorships/MetadataBESoleProprietorships/",
     "fibo-be-tr-mod"
     "https://spec.edmcouncil.org/fibo/ontology/BE/Trusts/MetadataBETrusts/",
     "fibo-fnd-utl-av"
     "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
     "owl" "http://www.w3.org/2002/07/owl#",
     "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
     "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
     "skos" "http://www.w3.org/2004/02/skos/core#",
     "xsd" "http://www.w3.org/2001/XMLSchema#"},
    :prefix "fibo-be-mod",
    :source "https://spec.edmcouncil.org/fibo/ontology/BE/MetadataBE/BEDomain"}
  {:cmns-av/copyright
   #{"Copyright (c) 2015-2023 EDM Council, Inc."
     "Copyright (c) 2015-2023 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology provides metadata about the FIBO Business Entities (BE) Domain, which covers defines business concepts that are used for data governance, interoperability, and in regulatory reporting about business entities.\n\nThe business scope of the BE ontologies covers a range of business and legal entities that are considered by financial industry firms, regulators and other industry participants to be of relevance in the financial services domain, including:\n - Legal entities generally\n - Corporate structure, ownership and control, including primary executive roles for businesses,\n - Functional entities such as governments and government entities, non-governmental organizations, international organizations, not-for-profit organization, etc.\n - Concepts specific to corporations, partnerships, private limited companies, sole proprietorships, and trusts.",
   :dcterms/issued #inst "2018-08-27T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-03-31T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/FunctionalEntities/MetadataBEFunctionalEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/PrivateLimitedCompanies/MetadataBEPrivateLimitedCompanies/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/OwnershipAndControl/MetadataBEOwnershipAndControl/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/Trusts/MetadataBETrusts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/GovernmentEntities/MetadataBEGovernmentEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/MetadataBELegalEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/Corporations/MetadataBECorporations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/SoleProprietorships/MetadataBESoleProprietorships/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/Partnerships/MetadataBEPartnerships/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/MetadataBE/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Metadata about the EDMC-FIBO Business Entities (BE) Domain",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/BE/BE/MetadataBE.rdf version of this ontology was modified to eliminate informative Functional Entities ontologies, merging their content into others as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/MetadataBE.rdf version of the ontology and subordinate module-specific BE metadata ontologies were modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."},
   :xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/BE/MetadataBE/"})

(def BEDomain
  {:cmns-av/copyright
   #{"Copyright (c) 2015-2023 EDM Council, Inc."
     "Copyright (c) 2015-2023 Object Management Group, Inc."},
   :db/ident :fibo-be-mod/BEDomain,
   :dcterms/abstract
   "The FIBO Business Entities (BE) Domain covers defines business concepts that are used for data governance, interoperability, and in regulatory reporting about business entities.\n\nThe business scope of the BE ontologies covers a range of business and legal entities that are considered by financial industry firms, regulators and other industry participants to be of relevance in the financial services domain, including:\n - Legal entities generally\n - Corporate structure, ownership and control, including primary executive roles for businesses,\n - Functional entities such as governments and government entities, non-governmental organizations, international organizations, not-for-profit organization, etc.\n - Concepts specific to corporations, partnerships, private limited companies, sole proprietorships, and trusts.",
   :dcterms/contributor
   #{"Citigroup" "John F. Gemski" "Adaptive, Inc." "Tahoe Blue Ltd"
     "Thematix Partners LLC" "Bloomberg LP" "Nordea Bank AB" "Wells Fargo"
     "Credit Suisse" "Pinnacle Bank (Morgan Hill, California)"
     "State Street Bank and Trust" "Deutsche Bank" "agnos.ai UK Ltd."
     "Hypercube Ltd." "Exprentis" "Statistics Canada" "Working Ontologist"
     "Federated Knowledge LLC"
     "Office of Financial Research (US Dept of the Treasury)"},
   :dcterms/creator
   {:xsd/anyURI
    "https://wiki.edmcouncil.org/display/BE/FIBO+-+FCT+-+Business+Entities+Home"},
   :dcterms/hasPart
   #{:fibo-be-plc-mod/PrivateLimitedCompaniesModule
     :fibo-be-ptr-mod/PartnershipsModule :fibo-be-corp-mod/CorporationsModule
     :fibo-be-ge-mod/GovernmentEntitiesModule
     :fibo-be-oac-mod/OwnershipAndControlModule
     :fibo-be-fct-mod/FunctionalEntitiesModule
     :fibo-be-sps-mod/SoleProprietorshipsModule
     :fibo-be-le-mod/LegalEntitiesModule :fibo-be-tr-mod/TrustsModule},
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/title
   #{"FIBO BE Domain"
     "EDMC Financial Industry Business Ontology (FIBO) Business Entities (BE) Domain"},
   :rdf/type #{:fibo-fnd-utl-av/Module :owl/NamedIndividual},
   :rdfs/isDefinedBy
   {:xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/BE/MetadataBE/"},
   :rdfs/label "business entities domain",
   :rdfs/seeAlso {:xsd/anyURI "https://spec.edmcouncil.org/fibo/"}})

(def urn:uuid:1a6c5676-a2ae-5c2b-b5b6-358ba7573604
  {:cmns-av/copyright
   #{"Copyright (c) 2015-2023 EDM Council, Inc."
     "Copyright (c) 2015-2023 Object Management Group, Inc."},
   :dcterms/abstract
   "This ontology provides metadata about the FIBO Business Entities (BE) Domain, which covers defines business concepts that are used for data governance, interoperability, and in regulatory reporting about business entities.\n\nThe business scope of the BE ontologies covers a range of business and legal entities that are considered by financial industry firms, regulators and other industry participants to be of relevance in the financial services domain, including:\n - Legal entities generally\n - Corporate structure, ownership and control, including primary executive roles for businesses,\n - Functional entities such as governments and government entities, non-governmental organizations, international organizations, not-for-profit organization, etc.\n - Concepts specific to corporations, partnerships, private limited companies, sole proprietorships, and trusts.",
   :dcterms/issued #inst "2018-08-27T18:00:00.000-00:00",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :dcterms/modified #inst "2023-03-31T18:00:00.000-00:00",
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/FunctionalEntities/MetadataBEFunctionalEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/PrivateLimitedCompanies/MetadataBEPrivateLimitedCompanies/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/OwnershipAndControl/MetadataBEOwnershipAndControl/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/Trusts/MetadataBETrusts/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/GovernmentEntities/MetadataBEGovernmentEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/MetadataBELegalEntities/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/Corporations/MetadataBECorporations/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/SoleProprietorships/MetadataBESoleProprietorships/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/Partnerships/MetadataBEPartnerships/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/MetadataBE/"},
   :rdf/type :owl/Ontology,
   :rdfs/label "Metadata about the EDMC-FIBO Business Entities (BE) Domain",
   :skos/changeNote
   #{"The https://spec.edmcouncil.org/fibo/ontology/BE/BE/MetadataBE.rdf version of this ontology was modified to eliminate informative Functional Entities ontologies, merging their content into others as appropriate."
     "The https://spec.edmcouncil.org/fibo/ontology/BE/MetadataBE.rdf version of the ontology and subordinate module-specific BE metadata ontologies were modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."},
   :xsd/anyURI "https://spec.edmcouncil.org/fibo/ontology/BE/MetadataBE/"})