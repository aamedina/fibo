(ns net.wikipunk.rdf.fibo-loan-spc-mar
  "This ontology defines concepts specific to marine finance, which involves financing vessel acquisitions for the spot market, time charters or bareboat charters, as well as the construction of work boats, and to finance the acquisition of vessels for scrapping."
  {:dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/MarineFinance/",
   :dcterms/abstract
   "This ontology defines concepts specific to marine finance, which involves financing vessel acquisitions for the spot market, time charters or bareboat charters, as well as the construction of work boats, and to finance the acquisition of vessels for scrapping.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/Analytics/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/LOAN/LoansGeneral/Loans/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/LOAN/LoansSpecific/MarineFinance/",
   :rdf/ns-prefix-map
   {"dcterms" "http://purl.org/dc/terms/",
    "fibo-fnd-utl-alx"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/Analytics/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-loan-ln-ln"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansGeneral/Loans/",
    "fibo-loan-spc-mar"
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/MarineFinance/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "sm" "http://www.omg.org/techprocess/ab/SpecificationMetadata/",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/MarineFinance/",
   :rdfa/prefix "fibo-loan-spc-mar",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/MarineFinance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Marine Finance Ontology"},
   :sm/contentLanguage "https://www.w3.org/TR/owl2-quick-reference/",
   :sm/copyright "Copyright (c) 2015-2022 EDM Council, Inc.",
   :sm/fileAbbreviation "fibo-loan-spc-mar"})

(def MarineFinancing
  "A loan for the purchase of a boat or other vessel."
  {:db/ident :fibo-loan-spc-mar/MarineFinancing,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/MarineFinance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "marine finance"},
   :rdfs/subClassOf :fibo-loan-ln-ln/Loan,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "A loan for the purchase of a boat or other vessel."}})

(def boatHeldAsChattel
  "Whether the vessel is to be held in ownership as a form of chattel by the lender during the period of the loan."
  {:db/ident :fibo-loan-spc-mar/boatHeldAsChattel,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-loan-spc-mar/MarineFinancing,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/MarineFinance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "boat held as chattel"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Whether the vessel is to be held in ownership as a form of chattel by the lender during the period of the loan."}})

(def mooredAt
  "Textual description (name etc.) of where the vessel is to be moored if it has a permanent mooring place."
  {:db/ident :fibo-loan-spc-mar/mooredAt,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-loan-spc-mar/MarineFinancing,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/MarineFinance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "moored at"},
   :rdfs/range :xsd/string,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Textual description (name etc.) of where the vessel is to be moored if it has a permanent mooring place."}})

(def percentageAdvanced
  "The percentage of the purchase price advanced as the loan."
  {:db/ident :fibo-loan-spc-mar/percentageAdvanced,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-loan-spc-mar/MarineFinancing,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/MarineFinance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "percentage advanced"},
   :rdfs/range :fibo-fnd-utl-alx/Percentage,
   :skos/definition
   {:rdf/language "en",
    :rdf/value "The percentage of the purchase price advanced as the loan."}})

(def residential
  "Whether the boat is intended to be used and is legally able to be used as a place of residence."
  {:db/ident :fibo-loan-spc-mar/residential,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-loan-spc-mar/MarineFinancing,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/MarineFinance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "residential"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Whether the boat is intended to be used and is legally able to be used as a place of residence."}})