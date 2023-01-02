(ns net.wikipunk.rdf.fibo-fnd-law-jur
  "This ontology defines high level concepts relating to jurisdictions for use in other FIBO ontology elements. This includes a general definition of jurisdiction along with some basic types of jurisdiction, along with the factors which distinguish one type of jurisdiction from another. This ontology also defines basic types of legal system, and extends the basic concept of law which is in the LegalCore ontology.."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/FND/Law/Jurisdiction/",
   :dcterms/abstract
   "This ontology defines high level concepts relating to jurisdictions for use in other FIBO ontology elements. This includes a general definition of jurisdiction along with some basic types of jurisdiction, along with the factors which distinguish one type of jurisdiction from another. This ontology also defines basic types of legal system, and extends the basic concept of law which is in the LegalCore ontology..",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   ["https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/LegalCore/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Parties/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/AgentsAndPeople/People/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Law/Jurisdiction/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-aap-ppl"
    "https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/",
    "fibo-fnd-law-cor"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCore/",
    "fibo-fnd-law-jur"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/Jurisdiction/",
    "fibo-fnd-pty-pty"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "https://spec.edmcouncil.org/fibo/ontology/FND/Law/Jurisdiction/",
   :rdfa/prefix "fibo-fnd-law-jur",
   :rdfa/uri "https://spec.edmcouncil.org/fibo/ontology/FND/Law/Jurisdiction/",
   :rdfs/label "Jurisdiction Ontology",
   :skos/changeNote
   ["The https://spec.edmcouncil.org/fibo/ontology/FND/Law/Jurisdiction.rdf version of the ontology was modified to extend the concept of legal age with the applicable jurisdiction."
    "The http://www.omg.org/spec/FIBO/Foundations/20130601/Law/Jurisdiction.owl version of the ontology was revised in advance of the September 2013 New Brunswick, NJ meeting, as follows:\n\t(1) to use slash style URI/IRIss (also called 303 URIs, vs. hash style) as required to support server side processing \n\t(2) to use version-independent IRIs for all definitions internally as opposed to version-specific IRIs\n\t(3) to change the file suffix from .owl to .rdf to increase usability in RDF tools\n\t(4) to use 4-level abbreviations and corresponding namespace prefixes for all FIBO ontologies, reflecting a family/specification/module/ontology structure\n\t(5) to incorporate changes to the specification metadata to support documentation at the family, specification, module, and ontology level, similar to the abbreviations\n\t(6) to revise definitions using more formal sources."
    "The http://www.omg.org/spec/EDMC-FIBO/FND/20130801/Law/Jurisdiction.rdf version of the ontology was was modified per the issue resolutions identified in the FIBO FND 1.0 FTF report and in http://www.omg.org/spec/EDMC-FIBO/FND/1.0/AboutFND-1.0/."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Law/Jurisdiction.rdf version of the ontology was modified to remove the constraint on jurisdiction that it is governed by some legal system, eliminate the class legal system and its children, which were very general and not used anywhere in FIBO, clean up remaining definitions with better sources, and eliminate an unused import."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Law/Jurisdiction.rdf version of the ontology was modified to extend the concept of a tax identifier and identification scheme with the applicable jurisdiction."
    "The http://www.omg.org/spec/EDMC-FIBO/FND/20141101/Law/Jurisdiction.rdf version of the ontology was was modified per the FIBO 2.0 RFC to integrate LCC."
    "The https://spec.edmcouncil.org/fibo/ontology/FND/Law/Jurisdiction.rdf version of the ontology was modified to address hygiene issues with respect to text formatting."],
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright ["Copyright (c) 2013-2022 EDM Council, Inc."
                  "Copyright (c) 2013-2022 Object Management Group, Inc."],
   :sm/dependsOn
   ["https://spec.edmcouncil.org/fibo/ontology/FND/AgentsAndPeople/People/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Law/LegalCore/"
    "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/"],
   :sm/fileAbbreviation "fibo-fnd-law-jur",
   :sm/filename "Jurisdiction.rdf"})

(def Jurisdiction
  "power of a court to adjudicate cases, issue orders, and interpret and apply the law with respect to some specific geographic area"
  {:db/ident :fibo-fnd-law-jur/Jurisdiction,
   :fibo-fnd-utl-av/adaptedFrom "https://www.law.cornell.edu/wex/jurisdiction",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Law/Jurisdiction/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "jurisdiction"},
   :rdfs/subClassOf {:owl/onProperty     :fibo-fnd-law-jur/hasReach,
                     :owl/someValuesFrom :lcc-cr/GeographicRegion,
                     :rdf/type           :owl/Restriction},
   :skos/definition
   "power of a court to adjudicate cases, issue orders, and interpret and apply the law with respect to some specific geographic area"})

(def StatuteLaw
  "law enacted by a legislature"
  {:db/ident :fibo-fnd-law-jur/StatuteLaw,
   :fibo-fnd-utl-av/adaptedFrom "https://www.law.cornell.edu/wex/statute",
   :fibo-fnd-utl-av/explanatoryNote
   ["In the United States, statutes may also be called acts, such as the Civil Rights Act of 1964 or the Sarbanes-Oxley Act. Federal laws must be passed by both houses of Congress, the House of Representative and the Senate, and then usually require approval from the president before they can take effect."
    "Statutes may originate with national, state legislatures or local municipalities. Statutory laws are subordinate to the higher constitutional laws of the land."],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Law/Jurisdiction/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "statute law"},
   :rdfs/subClassOf [:fibo-fnd-law-cor/Law
                     {:owl/onProperty     :fibo-fnd-law-cor/isInForceIn,
                      :owl/someValuesFrom :fibo-fnd-law-jur/Jurisdiction,
                      :rdf/type           :owl/Restriction}],
   :skos/altLabel "statutory law",
   :skos/definition "law enacted by a legislature"})

(def appliesIn
  "indicates the jurisdiction in which a law applies"
  {:db/ident :fibo-fnd-law-jur/appliesIn,
   :rdf/type :owl/ObjectProperty,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Law/Jurisdiction/",
   :rdfs/label "applies in",
   :rdfs/range :fibo-fnd-law-jur/Jurisdiction,
   :skos/definition "indicates the jurisdiction in which a law applies"})

(def hasReach
  "indicates the geopolitical area covered by the jurisdiction"
  {:db/ident :fibo-fnd-law-jur/hasReach,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-fnd-law-jur/Jurisdiction,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/FND/Law/Jurisdiction/",
   :rdfs/label "has reach",
   :rdfs/range :lcc-cr/GeographicRegion,
   :skos/definition
   "indicates the geopolitical area covered by the jurisdiction"})