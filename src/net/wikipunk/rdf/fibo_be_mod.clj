(ns net.wikipunk.rdf.fibo-be-mod
  "This ontology provides metadata about the FIBO Business Entities (BE) Domain, which covers defines business concepts that are used for data governance, interoperability, and in regulatory reporting about business entities. The business scope of the BE ontologies covers a range of business and legal entities that are considered by financial industry firms, regulators and other industry participants to be of relevance in the financial services domain, including: - Legal entities generally - Corporate structure, ownership and control, including primary executive roles for businesses, - Functional entities such as governments and government entities, non-governmental organizations, international organizations, not-for-profit organization, etc. - Concepts specific to corporations, partnerships, private limited companies, sole proprietorships, and trusts."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/BE/MetadataBE/BEDomain",
   :dcterms/abstract
   "This ontology provides metadata about the FIBO Business Entities (BE) Domain, which covers defines business concepts that are used for data governance, interoperability, and in regulatory reporting about business entities.\n\nThe business scope of the BE ontologies covers a range of business and legal entities that are considered by financial industry firms, regulators and other industry participants to be of relevance in the financial services domain, including:\n - Legal entities generally\n - Corporate structure, ownership and control, including primary executive roles for businesses,\n - Functional entities such as governments and government entities, non-governmental organizations, international organizations, not-for-profit organization, etc.\n - Concepts specific to corporations, partnerships, private limited companies, sole proprietorships, and trusts.",
   :dcterms/issued #inst "2018-08-27T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/SoleProprietorships/MetadataBESoleProprietorships/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/LegalEntities/MetadataBELegalEntities/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/Trusts/MetadataBETrusts/"
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
   {"dcterms" "http://purl.org/dc/terms/",
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
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "https://spec.edmcouncil.org/fibo/ontology/BE/MetadataBE/",
   :rdfa/prefix "fibo-be-mod",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/BE/MetadataBE/",
   :rdfs/label "Metadata about the EDMC-FIBO Business Entities (BE) Domain",
   :skos/changeNote
   "The https://spec.edmcouncil.org/fibo/ontology/BE/BE/MetadataBE.rdf version of this ontology was modified to eliminate informative Functional Entities ontologies, merging their content into others as appropriate.",
   :sm/contentLanguage "http://www.w3.org/standards/techs/owl#w3c_all",
   :sm/copyright ["Copyright (c) 2015-2019 EDM Council, Inc."
                  "Copyright (c) 2015-2019 Object Management Group, Inc."],
   :sm/fileAbbreviation "fibo-be-mod",
   :sm/filename "MetadataBE.rdf"})

(def BEDomain
  "The FIBO Business Entities (BE) Domain covers defines business concepts that are used for data governance, interoperability, and in regulatory reporting about business entities. The business scope of the BE ontologies covers a range of business and legal entities that are considered by financial industry firms, regulators and other industry participants to be of relevance in the financial services domain, including: - Legal entities generally - Corporate structure, ownership and control, including primary executive roles for businesses, - Functional entities such as governments and government entities, non-governmental organizations, international organizations, not-for-profit organization, etc. - Concepts specific to corporations, partnerships, private limited companies, sole proprietorships, and trusts."
  {:db/ident :fibo-be-mod/BEDomain,
   :dcterms/abstract
   "The FIBO Business Entities (BE) Domain covers defines business concepts that are used for data governance, interoperability, and in regulatory reporting about business entities.\n\nThe business scope of the BE ontologies covers a range of business and legal entities that are considered by financial industry firms, regulators and other industry participants to be of relevance in the financial services domain, including:\n - Legal entities generally\n - Corporate structure, ownership and control, including primary executive roles for businesses,\n - Functional entities such as governments and government entities, non-governmental organizations, international organizations, not-for-profit organization, etc.\n - Concepts specific to corporations, partnerships, private limited companies, sole proprietorships, and trusts.",
   :dcterms/creator "https://www.edmcouncil.org/fibo/fct/BusinessEntitiesHome",
   :dcterms/hasPart [:fibo-be-fct-mod/FunctionalEntitiesModule
                     :fibo-be-ge-mod/GovernmentEntitiesModule
                     :fibo-be-oac-mod/OwnershipAndControlModule
                     :fibo-be-plc-mod/PrivateLimitedCompaniesModule
                     :fibo-be-le-mod/LegalEntitiesModule
                     :fibo-be-tr-mod/TrustsModule
                     :fibo-be-corp-mod/CorporationsModule
                     :fibo-be-ptr-mod/PartnershipsModule
                     :fibo-be-sps-mod/SoleProprietorshipsModule],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title
   "EDMC Financial Industry Business Ontology (FIBO) Business Entities (BE) Domain",
   :rdf/type [:sm/Module :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://spec.edmcouncil.org/fibo/ontology/BE/MetadataBE/",
   :rdfs/label "Business Entities",
   :rdfs/seeAlso ["https://spec.edmcouncil.org/fibo/"],
   :sm/contributor ["Thematix Partners LLC"
                    "Tahoe Blue Ltd"
                    "Pinnacle Bank (Morgan Hill, California)"
                    "State Street Bank and Trust"
                    "Office of Financial Research (US Dept of the Treasury)"
                    "Wells Fargo"
                    "Nordea Bank AB"
                    "Adaptive, Inc."
                    "Working Ontologist"],
   :sm/copyright ["Copyright (c) 2015-2019 Object Management Group, Inc."
                  "Copyright (c) 2015-2019 EDM Council, Inc."],
   :sm/dependsOn ["http://www.omg.org/techprocess/ab/SpecificationMetadata/"
                  "https://spec.edmcouncil.org/fibo/ontology/FND/"
                  "https://www.omg.org/spec/LCC/"],
   :sm/keyword ["legal entities" "LEI" "business entities"],
   :sm/moduleAbbreviation "fibo-be"})