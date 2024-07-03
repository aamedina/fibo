(ns net.wikipunk.rdf.fibo-loan-spc-mar
  {:cmns-av/copyright "Copyright (c) 2015-2023 EDM Council, Inc.",
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/LOAN/LoansSpecific/MarineFinance/",
   :dcterms/abstract
   "This ontology defines concepts specific to marine finance, which involves financing vessel acquisitions for the spot market, time charters or bareboat charters, as well as the construction of work boats, and to finance the acquisition of vessels for scrapping.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-qtu" "https://www.omg.org/spec/Commons/QuantitiesAndUnits/",
    "dcterms" "http://purl.org/dc/terms/",
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
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/QuantitiesAndUnits/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/LOAN/LoansGeneral/Loans/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/LOAN/LoansSpecific/MarineFinance/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-loan-spc-mar",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/MarineFinance/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Marine Finance Ontology"},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/MarineFinance/"})

(def MarineFinancing
  {:db/ident :fibo-loan-spc-mar/MarineFinancing,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/MarineFinance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "marine finance"},
   :rdfs/subClassOf :fibo-loan-ln-ln/Loan,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "A loan for the purchase of a boat or other vessel."}})

(def boatHeldAsChattel
  {:db/ident :fibo-loan-spc-mar/boatHeldAsChattel,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-loan-spc-mar/MarineFinancing,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/MarineFinance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "boat held as chattel"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Whether the vessel is to be held in ownership as a form of chattel by the lender during the period of the loan."}})

(def mooredAt
  {:db/ident :fibo-loan-spc-mar/mooredAt,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-loan-spc-mar/MarineFinancing,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/MarineFinance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "moored at"},
   :rdfs/range :xsd/string,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Textual description (name etc.) of where the vessel is to be moored if it has a permanent mooring place."}})

(def percentageAdvanced
  {:db/ident :fibo-loan-spc-mar/percentageAdvanced,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-loan-spc-mar/MarineFinancing,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/MarineFinance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "percentage advanced"},
   :rdfs/range :cmns-qtu/Percentage,
   :skos/definition
   {:rdf/language "en",
    :rdf/value "The percentage of the purchase price advanced as the loan."}})

(def residential
  {:db/ident :fibo-loan-spc-mar/residential,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-loan-spc-mar/MarineFinancing,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/MarineFinance/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "residential"},
   :rdfs/range :xsd/boolean,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "Whether the boat is intended to be used and is legally able to be used as a place of residence."}})

(def urn:uuid:8e0ec79e-e275-5c47-aabf-69fb681ccb40
  {:cmns-av/copyright "Copyright (c) 2015-2023 EDM Council, Inc.",
   :dcterms/abstract
   "This ontology defines concepts specific to marine finance, which involves financing vessel acquisitions for the spot market, time charters or bareboat charters, as well as the construction of work boats, and to finance the acquisition of vessels for scrapping.",
   :dcterms/license {:xsd/anyURI "https://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   #{{:xsd/anyURI "https://www.omg.org/spec/Commons/QuantitiesAndUnits/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/LOAN/LoansGeneral/Loans/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/LOAN/LoansSpecific/MarineFinance/"},
   :rdf/type :owl/Ontology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Marine Finance Ontology"},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/MarineFinance/"})