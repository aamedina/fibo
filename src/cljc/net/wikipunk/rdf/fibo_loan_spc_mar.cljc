(ns net.wikipunk.rdf.fibo-loan-spc-mar
  "This ontology defines concepts specific to marine finance, which involves financing vessel acquisitions for the spot market, time charters or bareboat charters, as well as the construction of work boats, and to finance the acquisition of vessels for scrapping."
  {:cmns-av/copyright "Copyright (c) 2015-2023 EDM Council, Inc.",
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/MarineFinance/",
   :dcterms/abstract
   "This ontology defines concepts specific to marine finance, which involves financing vessel acquisitions for the spot market, time charters or bareboat charters, as well as the construction of work boats, and to finance the acquisition of vessels for scrapping.",
   :dcterms/license {:rdfa/uri "http://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   [{:rdfa/uri "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/Analytics/"}
    {:rdfa/uri
     "https://spec.edmcouncil.org/fibo/ontology/master/latest/LOAN/LoansGeneral/Loans/"}],
   :owl/versionIRI
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/LOAN/LoansSpecific/MarineFinance/"},
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
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
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-loan-spc-mar",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/MarineFinance/",
   :rdfs/label #xsd/langString "Marine Finance Ontology@en"})

(def MarineFinancing
  "A loan for the purchase of a boat or other vessel."
  {:db/ident :fibo-loan-spc-mar/MarineFinancing,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/MarineFinance/"},
   :rdfs/label #xsd/langString "marine finance@en",
   :rdfs/subClassOf :fibo-loan-ln-ln/Loan,
   :skos/definition #xsd/langString
                     "A loan for the purchase of a boat or other vessel.@en"})

(def boatHeldAsChattel
  "Whether the vessel is to be held in ownership as a form of chattel by the lender during the period of the loan."
  {:db/ident :fibo-loan-spc-mar/boatHeldAsChattel,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-loan-spc-mar/MarineFinancing,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/MarineFinance/"},
   :rdfs/label #xsd/langString "boat held as chattel@en",
   :rdfs/range :xsd/boolean,
   :skos/definition
   #xsd/langString
    "Whether the vessel is to be held in ownership as a form of chattel by the lender during the period of the loan.@en"})

(def mooredAt
  "Textual description (name etc.) of where the vessel is to be moored if it has a permanent mooring place."
  {:db/ident :fibo-loan-spc-mar/mooredAt,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-loan-spc-mar/MarineFinancing,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/MarineFinance/"},
   :rdfs/label #xsd/langString "moored at@en",
   :rdfs/range :xsd/string,
   :skos/definition
   #xsd/langString
    "Textual description (name etc.) of where the vessel is to be moored if it has a permanent mooring place.@en"})

(def percentageAdvanced
  "The percentage of the purchase price advanced as the loan."
  {:db/ident :fibo-loan-spc-mar/percentageAdvanced,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-loan-spc-mar/MarineFinancing,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/MarineFinance/"},
   :rdfs/label #xsd/langString "percentage advanced@en",
   :rdfs/range :fibo-fnd-utl-alx/Percentage,
   :skos/definition
   #xsd/langString
    "The percentage of the purchase price advanced as the loan.@en"})

(def residential
  "Whether the boat is intended to be used and is legally able to be used as a place of residence."
  {:db/ident :fibo-loan-spc-mar/residential,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :fibo-loan-spc-mar/MarineFinancing,
   :rdfs/isDefinedBy
   {:rdfa/uri
    "https://spec.edmcouncil.org/fibo/ontology/LOAN/LoansSpecific/MarineFinance/"},
   :rdfs/label #xsd/langString "residential@en",
   :rdfs/range :xsd/boolean,
   :skos/definition
   #xsd/langString
    "Whether the boat is intended to be used and is legally able to be used as a place of residence.@en"})