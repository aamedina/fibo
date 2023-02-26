(ns net.wikipunk.rdf.fibo-be-mod
  "This ontology provides metadata about the FIBO Business Entities (BE) Domain, which covers defines business concepts that are used for data governance, interoperability, and in regulatory reporting about business entities. The business scope of the BE ontologies covers a range of business and legal entities that are considered by financial industry firms, regulators and other industry participants to be of relevance in the financial services domain, including: - Legal entities generally - Corporate structure, ownership and control, including primary executive roles for businesses, - Functional entities such as governments and government entities, non-governmental organizations, international organizations, not-for-profit organization, etc. - Concepts specific to corporations, partnerships, private limited companies, sole proprietorships, and trusts."
  {:cmns-av/copyright ["Copyright (c) 2015-2023 EDM Council, Inc."
                       "Copyright (c) 2015-2023 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/BE/MetadataBE/BEDomain",
   :dcterms/abstract
   "This ontology provides metadata about the FIBO Business Entities (BE) Domain, which covers defines business concepts that are used for data governance, interoperability, and in regulatory reporting about business entities.\n\nThe business scope of the BE ontologies covers a range of business and legal entities that are considered by financial industry firms, regulators and other industry participants to be of relevance in the financial services domain, including:\n - Legal entities generally\n - Corporate structure, ownership and control, including primary executive roles for businesses,\n - Functional entities such as governments and government entities, non-governmental organizations, international organizations, not-for-profit organization, etc.\n - Concepts specific to corporations, partnerships, private limited companies, sole proprietorships, and trusts.",
   :dcterms/issued #inst "2018-08-27T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/modified #inst "2023-01-27T23:00:00.000-00:00",
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/SoleProprietorships/MetadataBESoleProprietorships/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/MetadataBELegalEntities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/Trusts/MetadataBETrusts/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/OwnershipAndControl/MetadataBEOwnershipAndControl/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/Partnerships/MetadataBEPartnerships/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/PrivateLimitedCompanies/MetadataBEPrivateLimitedCompanies/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/Corporations/MetadataBECorporations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/FunctionalEntities/MetadataBEFunctionalEntities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/GovernmentEntities/MetadataBEGovernmentEntities/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/MetadataBE/",
   :rdf/ns-prefix-map
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
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-be-mod",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/BE/MetadataBE/",
   :rdfs/label "Metadata about the EDMC-FIBO Business Entities (BE) Domain",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/BE/BE/MetadataBE.rdf version of this ontology was modified to eliminate informative Functional Entities ontologies, merging their content into others as appropriate."
    "The https://spec.edmcouncil.org/fibo/ontology/BE/MetadataBE.rdf version of the ontology and subordinate module-specific BE metadata ontologies were modified to use the Commons Ontology Library (Commons) Annotation Vocabulary rather than the OMG's Specification Metadata vocabulary."]})

(def BEDomain
  "The FIBO Business Entities (BE) Domain covers defines business concepts that are used for data governance, interoperability, and in regulatory reporting about business entities. The business scope of the BE ontologies covers a range of business and legal entities that are considered by financial industry firms, regulators and other industry participants to be of relevance in the financial services domain, including: - Legal entities generally - Corporate structure, ownership and control, including primary executive roles for businesses, - Functional entities such as governments and government entities, non-governmental organizations, international organizations, not-for-profit organization, etc. - Concepts specific to corporations, partnerships, private limited companies, sole proprietorships, and trusts."
  {:cmns-av/copyright ["Copyright (c) 2015-2023 Object Management Group, Inc."
                       "Copyright (c) 2015-2023 EDM Council, Inc."],
   :db/ident :fibo-be-mod/BEDomain,
   :dcterms/abstract
   "The FIBO Business Entities (BE) Domain covers defines business concepts that are used for data governance, interoperability, and in regulatory reporting about business entities.\n\nThe business scope of the BE ontologies covers a range of business and legal entities that are considered by financial industry firms, regulators and other industry participants to be of relevance in the financial services domain, including:\n - Legal entities generally\n - Corporate structure, ownership and control, including primary executive roles for businesses,\n - Functional entities such as governments and government entities, non-governmental organizations, international organizations, not-for-profit organization, etc.\n - Concepts specific to corporations, partnerships, private limited companies, sole proprietorships, and trusts.",
   :dcterms/contributor
   ["Hypercube Ltd."
    "Nordea Bank AB"
    "State Street Bank and Trust"
    "Credit Suisse"
    "agnos.ai UK Ltd."
    "Pinnacle Bank (Morgan Hill, California)"
    "Federated Knowledge LLC"
    "Wells Fargo"
    "Deutsche Bank"
    "Tahoe Blue Ltd"
    "John F. Gemski"
    "Office of Financial Research (US Dept of the Treasury)"
    "Thematix Partners LLC"
    "Bloomberg LP"
    "Citigroup"
    "Working Ontologist"
    "Exprentis"
    "Statistics Canada"
    "Adaptive, Inc."],
   :dcterms/creator
   "https://wiki.edmcouncil.org/display/BE/FIBO+-+FCT+-+Business+Entities+Home",
   :dcterms/hasPart [:fibo-be-ptr-mod/PartnershipsModule
                     :fibo-be-fct-mod/FunctionalEntitiesModule
                     :fibo-be-plc-mod/PrivateLimitedCompaniesModule
                     :fibo-be-le-mod/LegalEntitiesModule
                     :fibo-be-tr-mod/TrustsModule
                     :fibo-be-ge-mod/GovernmentEntitiesModule
                     :fibo-be-corp-mod/CorporationsModule
                     :fibo-be-sps-mod/SoleProprietorshipsModule
                     :fibo-be-oac-mod/OwnershipAndControlModule],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   ["FIBO BE Domain"
    "EDMC Financial Industry Business Ontology (FIBO) Business Entities (BE) Domain"],
   :rdf/type [:owl/NamedIndividual :fibo-fnd-utl-av/Module],
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/fibo/ontology/BE/MetadataBE/",
   :rdfs/label "Business Entities",
   :rdfs/seeAlso ["https://spec.edmcouncil.org/fibo/"]})