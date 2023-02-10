(ns net.wikipunk.rdf.fibo-sec-dbt-lpn
  "This ontology defines contracts which give the holder some formal participation in some loan."
  {:cmns-av/copyright "Copyright (c) 2016-2023 EDM Council, Inc.",
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/LoanParticipationNotes/",
   :dcterms/abstract
   "This ontology defines contracts which give the holder some formal participation in some loan.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Provisional,
   :owl/imports
   ["https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Utilities/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Parties/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/DebtInstruments/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/IND/EconomicIndicators/EconomicIndicators/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Relations/Relations/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Agreements/Contracts/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FBC/DebtAndEquities/Debt/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/BE/OwnershipAndControl/Executives/"
    "https://spec.edmcouncil.org/fibo/ontology/master/latest/FND/Parties/Roles/"],
   :owl/versionIRI
   "https://spec.edmcouncil.org/fibo/ontology/master/latest/SEC/Debt/LoanParticipationNotes/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-be-oac-exec"
    "https://spec.edmcouncil.org/fibo/ontology/BE/OwnershipAndControl/Executives/",
    "fibo-fbc-dae-dbt"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/DebtAndEquities/Debt/",
    "fibo-fnd-agr-ctr"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Agreements/Contracts/",
    "fibo-fnd-pty-pty"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Parties/Parties/",
    "fibo-fnd-rel-rel"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Relations/Relations/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-sec-dbt-lpn"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/LoanParticipationNotes/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/LoanParticipationNotes/",
   :rdfa/prefix "fibo-sec-dbt-lpn",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/LoanParticipationNotes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Loan Participation Notes Ontology"}})

(def LeadManager
  "the party that organizes the potential lenders into a syndicate and arranges the details of the or any potential loan"
  {:db/ident :fibo-sec-dbt-lpn/LeadManager,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/LoanParticipationNotes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "lead manager"},
   :rdfs/subClassOf :fibo-be-oac-exec/ResponsibleParty,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "the party that organizes the potential lenders into a syndicate and arranges the details of the or any potential loan"},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "This is the party which determines which potential lender (syndicate member) is going to lend which amount. When interest is paid this party applies the payments to the different lenders. Meanwhile the note is the means to trade this - it is an asset whic evidences the obligation to pay someone (the holder of this particular document). Hence there is a secondary market in the Note, that is the piece of paper, which is the asset. If you sell the note, do you cease to be a syndicate member and the holder becomes one instead? No, syndicate membership is specific to the primary, creation of the instrument, in the same way as a bond issue takes place. What we don't know: whether the participation is freely negotiable, or has limited negotiability. What we think is that as a minimum it gives you rights to the interest and principal, but does not bring you into the facility as a whole. there are (separately) structures which allow you to buy ito the syndicate. These are called \"Pariticipations\". This would (presumably) give you access into new loans. For this piece of paper, if you are the holder of the note you would be part of the syndicate. We need additional clarificaiton on how syndicates work."}})

(def LoanParticipationNoteFacility
  "A facility formed as part of a LPN which can be drawn down by the borrower."
  {:db/ident :fibo-sec-dbt-lpn/LoanParticipationNoteFacility,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/LoanParticipationNotes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "loan participation note facility"},
   :rdfs/subClassOf [{:owl/onProperty :fibo-sec-dbt-lpn/hasSyndicateMember,
                      :owl/someValuesFrom
                      :fibo-sec-dbt-lpn/LoanParticipationNoteSyndicateMember,
                      :rdf/type :owl/Restriction}
                     {:owl/onProperty     :fibo-be-oac-exec/hasResponsibleParty,
                      :owl/someValuesFrom :fibo-sec-dbt-lpn/LeadManager,
                      :rdf/type           :owl/Restriction}
                     :fibo-fbc-dae-dbt/SubFacility],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "A facility formed as part of a LPN which can be drawn down by the borrower."}})

(def LoanParticipationNoteSyndicateMember
  "loan participation note syndicate member"
  {:db/ident :fibo-sec-dbt-lpn/LoanParticipationNoteSyndicateMember,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/LoanParticipationNotes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "loan participation note syndicate member"},
   :rdfs/subClassOf :fibo-fnd-pty-pty/PartyInRole})

(def SyndicatedLoanParticipationNote
  "a fixed-income security that permits investors to buy portions of an outstanding loan or package of loans; LPN holders participate, on a pro rata basis, in collecting interest and principal payments. Banks or other financial institutions often enter into loan participation agreements with local businesses, and also offer loan participation notes as a type of short-term investment."
  {:db/ident :fibo-sec-dbt-lpn/SyndicatedLoanParticipationNote,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/LoanParticipationNotes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "syndicated loan participation note"},
   :rdfs/subClassOf [{:owl/onProperty     :fibo-fnd-rel-rel/isIssuedBy,
                      :owl/someValuesFrom :fibo-sec-dbt-lpn/LeadManager,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty :fibo-fnd-agr-ctr/definesTermsFor,
                      :owl/someValuesFrom
                      :fibo-sec-dbt-lpn/LoanParticipationNoteFacility,
                      :rdf/type :owl/Restriction}
                     :fibo-sec-dbt-dbti/TradableDebtInstrument],
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "a fixed-income security that permits investors to buy portions of an outstanding loan or package of loans; LPN holders participate, on a pro rata basis, in collecting interest and principal payments. Banks or other financial institutions often enter into loan participation agreements with local businesses, and also offer loan participation notes as a type of short-term investment."},
   :skos/editorialNote
   {:rdf/language "en",
    :rdf/value
    "FpML has \"Syndicated Loan\". Assume this is the same thing. Review session notes (pre-OTC SMER): [From: Investopedia: Loan Participation Note] Review: 1. Add terms e.g. contractual terms for participation 2. Are there other types of Participation Note which allow for participation in other forms of Asset / Collateral? 3. Can these be traded or not? Definition suggests a bilateral contract. 14 July: The note is documentation. That is, this is evidence for the securirty. An underwriting document (?) is similar. Someone promises to issue the notes for you. This is similar to how debt securities begin life - the underwriter sets the limits on what you will pay fo rthe ssecurity, and of course the amount. Two step orocess of creating the security and then selling it. See Bond / Debt Issuance diagrams and models. (see diagram notes etc. here) Note = tradeability. Indicates that someone has made a commitment at large. Loan Participation Note is either the other end of the loan, or a way of participating in the loan facility. If the latter, it would be a way of documenting the loan facility in a way that you can freely trade it. The alternative (non LPN) would be different. Circles - trading groups - members of the circle. Have to tell the other members of the circle what's going on, and get their permission from the members of that circle before you can assign those rights to someone else. This would mark out the OTC variant of these things. Then: risk participany, who has no original participation, but (later) agrees to take all of your risk off you. So now we have something with a secondary market and something without. Which is which, and what are they called? Which is the one described in FpML (presumably OTC). Generally, if you document your commitment to lend money, then other members of hte syndicate also have a risk in that you might not stump up your obligations. This has implicatiojns for being able to make this a security. This differs from a bond, where there is no intervening credit facility, you just buyt the thing that way you have become the lender. So there remain some doubts about how a participation note works. There is an element of credit embedded against the purchaser of any such note that gave someone membership ofa syndicate. There are also two sets of words in play: - Syndicated Loan - Loan Participation Note. So one of these probably gives you membership of the syndicate, and the other just gives you participation in the loan. It is less likely that there is a secondary market in the note that gives you participationm in a syndicate (because of the credit risk) but in theory at least, it is possible to create an instrument for this. We just don't know if it exists."}})

(def hasSyndicateMember
  "has syndicate member"
  {:db/ident :fibo-sec-dbt-lpn/hasSyndicateMember,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :fibo-sec-dbt-lpn/LoanParticipationNoteFacility,
   :rdfs/isDefinedBy
   "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/LoanParticipationNotes/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "has syndicate member"},
   :rdfs/range :fibo-sec-dbt-lpn/LoanParticipationNoteSyndicateMember})