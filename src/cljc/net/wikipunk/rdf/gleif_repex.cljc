(ns net.wikipunk.rdf.gleif-repex
  "Ontology for representing exceptions to reporting of parents, for entities registered with a Legal Entity Identifier. The Global Legal Identifier System (GLEIS) requires that legal entities with an LEI provide information on their ultimate and direct accounting consolidating parents. Relationship reporting is mandatory with exceptions allowed for certain well-defined reasons. This ontology provides a simple structure for recording reasons for each exception by LEI."
  {:dcat/downloadURL
   "https://www.gleif.org/ontology/v1.0/ReportingException/ontology.ttl",
   :dcterms/abstract
   "Ontology for representing exceptions to reporting of parents, for entities registered with a Legal Entity Identifier. The Global Legal Identifier System (GLEIS) requires that legal entities with an LEI provide information on their ultimate and direct accounting consolidating parents. Relationship reporting is mandatory with exceptions allowed for certain well-defined reasons. This ontology provides a simple structure for recording reasons for each exception by LEI.",
   :dcterms/contributor ["http://purl.org/bryon"
                         "https://www.linkedin.com/in/peterivett/"
                         "http://www.workingontologist.com"],
   :dcterms/creator :gleif-base/GLEIF,
   :dcterms/issued #inst "2019-02-01T00:00:00.000-00:00",
   :dcterms/license "https://www.gleif.org/en/meta/lei-data-terms-of-use/",
   :dcterms/rights
   "Copyright (c) 2019 Global Legal Entity Identifier Foundation (GLEIF)",
   :dcterms/rightsHolder :gleif-base/GLEIF,
   :dcterms/source
   "https://www.gleif.org/en/about-lei/common-data-file-format/level-2-data-reporting-exceptions-format",
   :dcterms/title
   #voc/lstr
    "Global Legal Entity Identifier Foundation Reporting Exception Ontology@en",
   :owl/imports ["https://www.gleif.org/ontology/L1/"
                 "https://www.gleif.org/ontology/L2/"],
   :owl/versionIRI
   "https://www.gleif.org/ontology/ReportingException-v1.0/ReportingException/",
   :rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/terms/",
                       "gleif-L1" "https://www.gleif.org/ontology/L1/",
                       "gleif-L2" "https://www.gleif.org/ontology/L1/",
                       "gleif-base" "https://www.gleif.org/ontology/Base/",
                       "gleif-repex"
                       "https://www.gleif.org/ontology/ReportingException/",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "vann" "http://purl.org/vocab/vann/",
                       "voaf" "http://purl.org/vocommons/voaf#",
                       "xml" "http://www.w3.org/XML/1998/namespace",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type [:voaf/Vocabulary :owl/Ontology],
   :rdfa/prefix "gleif-repex",
   :rdfa/uri "https://www.gleif.org/ontology/ReportingException/",
   :rdfs/label "GLEIF Reporting Exception Ontology",
   :vann/preferredNamespacePrefix "gleif-repex",
   :vann/preferredNamespaceUri
   "https://www.gleif.org/ontology/ReportingException/"})

(def DirectConsolidationReportingException
  "The legal entity has declined to report a direct accounting consolidation parent, based on applicable accounting standards."
  {:db/ident :gleif-repex/DirectConsolidationReportingException,
   :gleif-base/hasTag "DIRECT_ACCOUNTING_CONSOLIDATION_PARENT",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://www.gleif.org/ontology/ReportingException/",
   :rdfs/label "direct consolidation reporting exception",
   :rdfs/subClassOf [:gleif-repex/ReportingException
                     {:owl/minQualifiedCardinality 1,
                      :owl/onClass    :gleif-repex/ExceptionReasonKind,
                      :owl/onProperty :gleif-repex/hasExceptionReason,
                      :rdf/type       :owl/Restriction}
                     {:owl/minCardinality 0,
                      :owl/onProperty     :gleif-repex/hasExceptionReference,
                      :rdf/type           :owl/Restriction}
                     {:owl/onClass    :gleif-L1/RegisteredEntity,
                      :owl/onProperty :gleif-repex/hasReportingEntity,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "The legal entity has declined to report a direct accounting consolidation parent, based on applicable accounting standards."})

(def ExceptionReasonKind
  "A single reason provided by the legal entity for declining to provide the mandatory report of a specified type of information (beyond the minimum reference data needed purely for identification of the legal entity)."
  {:db/ident :gleif-repex/ExceptionReasonKind,
   :owl/oneOf [:gleif-repex/ExceptionReasonKindNoLEI
               :gleif-repex/ExceptionReasonKindNaturalPersons
               :gleif-repex/ExceptionReasonKindNonConsolidating
               :gleif-repex/ExceptionReasonKindNoKnownPerson
               :gleif-repex/ExceptionReasonKindLegalObstacles
               :gleif-repex/ExceptionReasonKindConsentNotObtained
               :gleif-repex/ExceptionReasonKindBindingLegalCommitments
               :gleif-repex/ExceptionReasonKindDetrimentNotExcluded
               :gleif-repex/ExceptionReasonKindDisclosureDetrimental],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://www.gleif.org/ontology/ReportingException/",
   :rdfs/label "exception reason",
   :skos/definition
   "A single reason provided by the legal entity for declining to provide the mandatory report of a specified type of information (beyond the minimum reference data needed purely for identification of the legal entity). "})

(def ExceptionReasonKindBindingLegalCommitments
  "Binding legal commitments (other than the laws or regulations of a jurisdiction), such as articles governing the legal entity or a contract, prevent providing or publishing this information. The LOU is not expected to verify or analyze whether the legal framework constitutes a legal obstacle."
  {:db/ident :gleif-repex/ExceptionReasonKindBindingLegalCommitments,
   :gleif-base/hasTag "BINDING_LEGAL_COMMITMENTS",
   :rdf/type [:gleif-repex/ExceptionReasonKind :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://www.gleif.org/ontology/ReportingException/",
   :rdfs/label "binding legal commitments",
   :skos/definition
   "Binding legal commitments (other than the laws or regulations of a jurisdiction), such as articles governing the legal entity or a contract, prevent providing or publishing this information. The LOU is not expected to verify or analyze whether the legal framework constitutes a legal obstacle."})

(def ExceptionReasonKindConsentNotObtained
  "There is no parent according to the definition used, because there is no known person controlling the entity (e.g., diversified shareholding)."
  {:db/ident :gleif-repex/ExceptionReasonKindConsentNotObtained,
   :gleif-base/hasTag "CONSENT_NOT_OBTAINED",
   :rdf/type [:gleif-repex/ExceptionReasonKind :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://www.gleif.org/ontology/ReportingException/",
   :rdfs/label "consent not obtained",
   :skos/definition
   "There is no parent according to the definition used, because there is no known person controlling the entity (e.g., diversified shareholding)."})

(def ExceptionReasonKindDetrimentNotExcluded
  "The child entity has sought to consult the parent entity about the reporting of the parent information to the GLEIS but could not confirm the absence of detriment in a way that can appropriately prevent liability risks for the child entity (or those acting on its behalf) under the applicable legal framework. The disclosure of this information would be detrimental to the legal entity or the relevant parent. This will include reasons generally accepted by public authorities in similar circumstances, based on a declaration by the entity. This reason may be used only when all following cumulative circumstances apply: [i) the parent could not be informed via the GLEIS and have the possibility to correct the relationship information before publication (including raising a cause for opt out, either because the parent does not have an LEI, or it has an LEI but the GLEIS has not yet implemented such system;] ii) the relationship is not already in the public domain (information being in the public domain assumes here that the way the information came into the public domain did not infringe the applicable legal framework); iii) the child entity has reasons to believe that the parent may consider disclosure to be detrimental; (iv) the child entity has sought to consult the parent entity of the reporting of the parent information to the GLEIS but could not confirm the absence of detriment in a way that can appropriately prevent liability risks for the child entity (or those acting on its behalf) under the applicable legal framework."
  {:db/ident :gleif-repex/ExceptionReasonKindDetrimentNotExcluded,
   :gleif-base/hasTag "DETRIMENT_NOT_EXCLUDED",
   :rdf/type [:gleif-repex/ExceptionReasonKind :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://www.gleif.org/ontology/ReportingException/",
   :rdfs/label "detriment not excluded",
   :skos/definition
   "The child entity has sought to consult the parent entity about the reporting of the parent information to the GLEIS but could not confirm the absence of detriment in a way that can appropriately prevent liability risks for the child entity (or those acting on its behalf) under the applicable legal framework. The disclosure of this information would be detrimental to the legal entity or the relevant parent. This will include reasons generally accepted by public authorities in similar circumstances, based on a declaration by the entity. \n  This reason may be used only when all following cumulative circumstances apply: [i) the parent could not be informed via the GLEIS and have the possibility to correct the relationship information before publication (including raising a cause for opt out, either because the parent does not have an LEI, or it has an LEI but the GLEIS has not yet implemented such system;] ii) the relationship is not already in the public domain (information being in the public domain assumes here that the way the information came into the public domain did not infringe the applicable legal framework); iii) the child entity has reasons to believe that the parent may consider disclosure to be detrimental; (iv) the child entity has sought to consult the parent entity of the reporting of the parent information to the GLEIS but could not confirm the absence of detriment in a way that can appropriately prevent liability risks for the child entity (or those acting on its behalf) under the applicable legal framework."})

(def ExceptionReasonKindDisclosureDetrimental
  "The disclosure of this information would be detrimental to the legal entity or the relevant parent. This will include reasons generally accepted by public authorities in similar circumstances, based on a declaration by the entity."
  {:db/ident :gleif-repex/ExceptionReasonKindDisclosureDetrimental,
   :gleif-base/hasTag "DISCLOSURE_DETRIMENTAL",
   :rdf/type [:gleif-repex/ExceptionReasonKind :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://www.gleif.org/ontology/ReportingException/",
   :rdfs/label "disclosure detrimental",
   :skos/definition
   "The disclosure of this information would be detrimental to the legal entity or the relevant parent. This will include reasons generally accepted by public authorities in similar circumstances, based on a declaration by the entity."})

(def ExceptionReasonKindLegalObstacles
  "Obstacles in the laws or regulations of a jurisdiction prevent providing or publishing this information. This does not include cases where, under the applicable legal framework disclosing the parent relationship would require the consent of one of the entities in the relationship, or both, and such consent could not be obtained (in these cases 'CONSENT_NOT_OBTAINED' is the applicable code). The LOU is not expected to verify or analyze whether the legal framework constitutes a legal obstacle."
  {:db/ident :gleif-repex/ExceptionReasonKindLegalObstacles,
   :gleif-base/hasTag "LEGAL_OBSTACLES",
   :rdf/type [:gleif-repex/ExceptionReasonKind :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://www.gleif.org/ontology/ReportingException/",
   :rdfs/label "legal obstacles",
   :skos/definition
   "Obstacles in the laws or regulations of a jurisdiction prevent providing or publishing this information. This does not include cases where, under the applicable legal framework disclosing the parent relationship would require the consent of one of the entities in the relationship, or both, and such consent could not be obtained (in these cases 'CONSENT_NOT_OBTAINED' is the applicable code). The LOU is not expected to verify or analyze whether the legal framework constitutes a legal obstacle."})

(def ExceptionReasonKindNaturalPersons
  "There is no parent according to the definition used, because the entity is controlled by natural person(s) without any intermediate legal entity meeting the definition of accounting consolidating parent."
  {:db/ident :gleif-repex/ExceptionReasonKindNaturalPersons,
   :gleif-base/hasTag "NATURAL_PERSONS",
   :rdf/type [:gleif-repex/ExceptionReasonKind :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://www.gleif.org/ontology/ReportingException/",
   :rdfs/label "natural persons",
   :skos/definition
   "There is no parent according to the definition used, because the entity is controlled by natural person(s) without any intermediate legal entity meeting the definition of accounting consolidating parent."})

(def ExceptionReasonKindNoKnownPerson
  "There is no parent according to the definition used, because there is no known person controlling the entity (e.g., diversified shareholding)."
  {:db/ident :gleif-repex/ExceptionReasonKindNoKnownPerson,
   :gleif-base/hasTag "NO_KNOWN_PERSON",
   :rdf/type [:gleif-repex/ExceptionReasonKind :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://www.gleif.org/ontology/ReportingException/",
   :rdfs/label "no known person",
   :skos/definition
   "There is no parent according to the definition used, because there is no known person controlling the entity (e.g., diversified shareholding)."})

(def ExceptionReasonKindNoLEI
  "The parent does not consent to have an LEI."
  {:db/ident          :gleif-repex/ExceptionReasonKindNoLEI,
   :gleif-base/hasTag "NO_LEI",
   :rdf/type          [:gleif-repex/ExceptionReasonKind :owl/NamedIndividual],
   :rdfs/isDefinedBy  "https://www.gleif.org/ontology/ReportingException/",
   :rdfs/label        "no LEI",
   :skos/definition   "The parent does not consent to have an LEI."})

(def ExceptionReasonKindNonConsolidating
  "There is no parent according to the definition used, because the entity is controlled by legal entities not subject to preparing consolidated financial statements."
  {:db/ident :gleif-repex/ExceptionReasonKindNonConsolidating,
   :gleif-base/hasTag "NON_CONSOLIDATING",
   :rdf/type [:gleif-repex/ExceptionReasonKind :owl/NamedIndividual],
   :rdfs/isDefinedBy "https://www.gleif.org/ontology/ReportingException/",
   :rdfs/label "non consolidating",
   :skos/definition
   "There is no parent according to the definition used, because the entity is controlled by legal entities not subject to preparing consolidated financial statements."})

(def ReportingException
  "A single exception to a specified reporting requirement, giving reasons and references where applicable."
  {:db/ident :gleif-repex/ReportingException,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://www.gleif.org/ontology/ReportingException/",
   :rdfs/label "reporting exception",
   :rdfs/subClassOf [{:owl/onClass    :gleif-L1/RegisteredEntity,
                      :owl/onProperty :gleif-repex/hasReportingEntity,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}
                     {:owl/minQualifiedCardinality 1,
                      :owl/onClass    :gleif-repex/ExceptionReasonKind,
                      :owl/onProperty :gleif-repex/hasExceptionReason,
                      :rdf/type       :owl/Restriction}
                     {:owl/minCardinality 0,
                      :owl/onProperty     :gleif-repex/hasExceptionReference,
                      :rdf/type           :owl/Restriction}],
   :skos/definition
   "A single exception to a specified reporting requirement, giving reasons and references where applicable."})

(def UltimateConsolidationReportingException
  "The legal entity has declined to report an ultimate accounting consolidation parent, based on applicable accounting standards."
  {:db/ident :gleif-repex/UltimateConsolidationReportingException,
   :gleif-base/hasTag "ULTIMATE_ACCOUNTING_CONSOLIDATION_PARENT",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy "https://www.gleif.org/ontology/ReportingException/",
   :rdfs/label "ultimate consolidation reporting exception",
   :rdfs/subClassOf [:gleif-repex/ReportingException
                     {:owl/minQualifiedCardinality 1,
                      :owl/onClass    :gleif-repex/ExceptionReasonKind,
                      :owl/onProperty :gleif-repex/hasExceptionReason,
                      :rdf/type       :owl/Restriction}
                     {:owl/minCardinality 0,
                      :owl/onProperty     :gleif-repex/hasExceptionReference,
                      :rdf/type           :owl/Restriction}
                     {:owl/onClass    :gleif-L1/RegisteredEntity,
                      :owl/onProperty :gleif-repex/hasReportingEntity,
                      :owl/qualifiedCardinality 1,
                      :rdf/type       :owl/Restriction}],
   :skos/definition
   "The legal entity has declined to report an ultimate accounting consolidation parent, based on applicable accounting standards."})

(def hasExceptionReason
  "A single reason provided by the legal entity for declining to provide the mandatory report of a specified type of information (beyond the minimum reference data needed purely for identification of the legal entity)."
  {:db/ident :gleif-repex/hasExceptionReason,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :gleif-repex/ReportingException,
   :rdfs/isDefinedBy "https://www.gleif.org/ontology/ReportingException/",
   :rdfs/label "has exception reason",
   :rdfs/range :gleif-repex/ExceptionReasonKind,
   :skos/definition
   "A single reason provided by the legal entity for declining to provide the mandatory report of a specified type of information (beyond the minimum reference data needed purely for identification of the legal entity)."})

(def hasExceptionReference
  "References of the law, regulation or other element of the legal framework to support reason(s) provided by the legal entity for declining to provide information on its parents."
  {:db/ident :gleif-repex/hasExceptionReference,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :gleif-repex/ReportingException,
   :rdfs/isDefinedBy "https://www.gleif.org/ontology/ReportingException/",
   :rdfs/label "has exception reference",
   :skos/definition
   "References of the law, regulation or other element of the legal framework to support reason(s) provided by the legal entity for declining to provide information on its parents."})

(def hasReportingEntity
  "The LEI-registered legal entity which raised this exception."
  {:db/ident :gleif-repex/hasReportingEntity,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :gleif-repex/ReportingException,
   :rdfs/isDefinedBy "https://www.gleif.org/ontology/ReportingException/",
   :rdfs/label "has reporting entity",
   :rdfs/range :gleif-L1/RegisteredEntity,
   :skos/definition
   "The LEI-registered legal entity which raised this exception."})
