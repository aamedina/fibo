(ns net.wikipunk.rdf.fibo-der-drc-str
  {:cmns-av/copyright #{"Copyright (c) 2023 Object Management Group, Inc."
                        "Copyright (c) 2023 EDM Council, Inc."},
   :dcat/downloadURL
   "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/DER/DerivativesContracts/StructuredInstruments/",
   :dcterms/abstract
   "This ontology defines concepts common to pre-packaged structured finance investment strategies based on a host of underlying instruments, pools, or other assets.",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :namespaces
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "fibo-der-drc-str"
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/StructuredInstruments/",
    "fibo-der-sbd-sbd"
    "https://spec.edmcouncil.org/fibo/ontology/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/",
    "fibo-fbc-fi-fi"
    "https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/",
    "fibo-fnd-utl-av"
    "https://spec.edmcouncil.org/fibo/ontology/FND/Utilities/AnnotationVocabulary/",
    "fibo-sec-dbt-pbs"
    "https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/PoolBackedSecurities/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/DER/DerivativesContracts/DerivativesBasics/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Debt/PoolBackedSecurities/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/DER/DerivativesContracts/StructuredInstruments/"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "fibo-der-drc-str",
   :rdfa/uri
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/StructuredInstruments/",
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Structured Instruments Ontology"},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/StructuredInstruments/"})

(def BarrierCapitalProtectionCertificate
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fifth edition, 2021-06-15, clause 6.4.7"},
   :db/ident :fibo-der-drc-str/BarrierCapitalProtectionCertificate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/StructuredInstruments/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "barrier capital protection certificate"},
   :rdfs/subClassOf #{:fibo-der-drc-str/CapitalProtectedProduct
                      :fibo-der-drc-str/ParticipationCertificate},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "capital-protected product whose protection is defined as a percentage of the nominal price (e.g. 100 percent), with minimum redemption at expiry equivalent to the capital protection"},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Note that capital protection in this case refers to the nominal amount only, and not to the purchase price. The value of the product may fall below its capital protection value during its lifetime; participation is in the underlying price increase above the strike up to the barrier; possibility of rebate payment once barrier is breached; limited profit potential."}})

(def BarrierDiscountCertificate
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fifth edition, 2021-06-15, clause 6.4.8"},
   :db/ident :fibo-der-drc-str/BarrierDiscountCertificate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/StructuredInstruments/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "barrier discount certificate"},
   :rdfs/subClassOf
   #{:fibo-sec-dbt-pbs/StructuredFinanceWithoutPrincipalProtection
     :fibo-der-drc-str/ParticipationCertificate},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "participation certificate that enables the investor to acquire the underlying asset at a lower price in return for a limited payout, and for which the maximum redemption amount (Cap) is paid out if the barrier is never breached"},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Due to the barrier, the probability of maximum redemption is higher; the discount, however, is smaller than for a discount certificate. If the barrier is breached the product changes into a discount certificate. Barrier discount certificates have reduced risk compared to direct investment in the underlying assets, with limited profit potential (Cap). With higher risk levels multiple underlying assets (worst-of) allow for higher discounts or a lower barrier."}})

(def BarrierReverseConvertibleCertificate
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fifth edition, 2021-06-15, clause 6.4.8"},
   :db/ident :fibo-der-drc-str/BarrierReverseConvertibleCertificate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/StructuredInstruments/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "barrier reverse convertible certificate"},
   :rdfs/subClassOf
   #{:fibo-sec-dbt-pbs/StructuredFinanceWithoutPrincipalProtection
     :fibo-der-drc-str/ParticipationCertificate},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "participation certificate whose payout is conditional: should the barrier never be breached, the nominal price plus coupon is paid at redemption; if the barrier is breached the product changes into a reverse convertible"},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Due to the barrier, the probability of maximum redemption is higher; the coupon, however, is smaller than for a reverse convertible. It has reduced risk compared to a direct investment into the underlying asset(s). With higher risk levels, multiple underlying assets (worst-of) allow for higher coupons or lower barriers; limited profit potential (Cap)."}})

(def BasketCertificate
  {:cmns-av/explanatoryNote
   #{{:rdf/language "en",
      :rdf/value
      "The success of a basket certificate is measured on whether it can outperform a comparison index or fund, a so-called benchmark. Basket certificates can be roughly divided into three categories based on the criteria for selecting securities: Sector certificates; country or region certificates; and strategy and thematic certificates."}
     {:rdf/language "en",
      :rdf/value
      "The issuer determines the basket's compilation before quoting the certificate. Fundamentally, all securities with regular, at least daily, price determinations are suited for the portfolio. The selection criteria for the shares or securities in the basket are known and remain unchanged during the life of the certificate. Note, however, that the composition of the share basket can change over time. If the issuer follows a specific strategy with the certificate, the basket has to be adjusted at specific end-of-period dates, provided the market leaders change. In such a case, the basket is called an active basket. If, in contrast, the composition of a share basket remains clearly defined, as is the case for an index certificate, it is called a passive basket."}
     {:rdf/language "en",
      :rdf/value
      "Basket certificates make sense if an investor is convinced of the potential in a particular sector or region, but shies away from the risk of investing in individual securities. Because the certificate is expected to achieve higher profits than the benchmark index, the share basket usually contains fewer titles than the benchmark index. That increases the potential for profits; but the risk of loss increases compared to the index. Unlike shares, basket certificates are not eligible for dividend payouts. The limited maturity should also be taken into account."}},
   :db/ident :fibo-der-drc-str/BasketCertificate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/StructuredInstruments/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "basket certificate"},
   :rdfs/subClassOf :fibo-der-drc-str/ParticipationCertificate,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "certificate whose underlying asset represents a fraction of a basket of securities that corresponds to the subscription ratio"}})

(def BonusCertificate
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fifth edition, 2021-06-15, clause 6.2.8"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Bonus certificates have a risk buffer for price losses in the underlying; the bonus guarantees a minimum return above the risk level. A bonus certificate represents an alternative to a direct investment in a share or an index. Investors primarily use them if they believe that despite rising prices setbacks are still likely to occur.\n\t\t\nA bonus certificate is furnished with a bonus amount and an upper and lower price level. If the certificate expires with the price of the underlying ranging between these two levels, owners are paid out their bonuses. If the underlying was at or below the risk level during the certificate's lifetime, its price is that of the current value of the certificate at expiry. If the underlying is above the upper level at expiry, the investor fully participates in the price gains. Some bonus certificates have a profit cap. This is where the certificate stops participating in the price gains of the underlying.\n\nA bonus certificate is issued at the current price of the underlying. The upper level is derived from adding the bonus to the issue price. The lower level is determined at issuance and usually expressed in percent."},
   :db/ident :fibo-der-drc-str/BonusCertificate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/StructuredInstruments/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "bonus certificate"},
   :rdfs/subClassOf :fibo-der-drc-str/ParticipationCertificate,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "certificate whose minimum redemption is equal to the nominal value provided the barrier has not been breached, with a greater risk in relation to multiple underlying asset(s) (worst-of), allowing for a higher bonus level or lower barrier, and with a reduced risk compared to a direct investment into the underlying asset(s)"},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "For example: You buy a bonus certificate based on a stock. The price of the stock at the time that you get the certificate is 100 Euros. The bonus level is 120 Euros, and the protection threshold is 80 Euros. Over the two-year term, the price of the stock fluctuates between 90 and 110 Euros. When the certificate matures at the end of the term, you receive the bonus price of 120 Euros."},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "If the barrier is breached the product becomes a tracker certificate."}})

(def CapitalProtectedProduct
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "CPI"},
   :cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fifth edition, 2021-06-15, clause 6.4.7"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Depending on the product, they may participate to varying degrees in the underlying asset's upside and protect the capital either entirely or partially."},
   :cmns-av/synonym {:rdf/language "en",
                     :rdf/value    "capital protected investment"},
   :db/ident :fibo-der-drc-str/CapitalProtectedProduct,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/StructuredInstruments/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "capital-protected product"},
   :rdfs/subClassOf :fibo-der-drc-str/StructuredProduct,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "structured product that participates in the performance of a financial asset, such as a stock, fund or index, while protecting the investor's capital"},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Capital protected structured instruments offer investors exposure to chosen underlying assets using various approaches and offering a large variety of asymmetric pay-off profiles. There are one or more reference entities underlying the product. Redemption is made at least in the amount of the conditional capital protection at maturity, provided that no credit event by the reference entity has occurred. Conditional capital protection only applies to the nominal amount and not to the purchase price. The general functioning of a capital guaranteed structured instrument is as follows: the notional amount is split into a zero bond, that will deliver the capital guarantee at maturity, and the difference between the zero bond's value (= present value of the guarantee level at maturity) and the notional amount is used for structuring the performance component with options which deliver the agreed pay-off profile of the structured instrument."}})

(def CapitalProtectionCertificateWithCoupons
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fifth edition, 2021-06-15, clause 6.4.7"},
   :db/ident :fibo-der-drc-str/CapitalProtectionCertificateWithCoupons,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/StructuredInstruments/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "capital protection certificate with coupons"},
   :rdfs/subClassOf #{:fibo-der-drc-str/CapitalProtectedProduct
                      :fibo-der-drc-str/ParticipationCertificate},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "capital-protected product whose protection is defined as a percentage of the nominal price (e.g. 100 percent), with minimum redemption at expiry equivalent to the capital protection"},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Note that capital protection in this case refers to the nominal amount only, and not to the purchase price. The value of the product may fall below its capital protection value during its lifetime; the coupon amount is dependent on the development of the underlying asset; periodic coupon payment is expected."}})

(def CapitalProtectionCertificateWithParticipation
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fifth edition, 2021-06-15, clause 6.4.7"},
   :db/ident :fibo-der-drc-str/CapitalProtectionCertificateWithParticipation,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/StructuredInstruments/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value "capital protection certificate with participation"},
   :rdfs/subClassOf #{:fibo-der-drc-str/CapitalProtectedProduct
                      :fibo-der-drc-str/ParticipationCertificate},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "capital-protected product whose protection is defined as a percentage of the nominal amount (e.g. 100 percent), with minimum redemption at expiry equivalent to the capital protection"},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Note that capital protection in this case refers to the nominal amount only, and not to the purchase price. The value of the product may fall below its capital protection value during its lifetime, and participation is in the underlying price increase above the strike."}})

(def CapitalProtectionConvertibleCertificate
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fifth edition, 2021-06-15, clause 6.4.7"},
   :db/ident :fibo-der-drc-str/CapitalProtectionConvertibleCertificate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/StructuredInstruments/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "capital protection convertible certificate"},
   :rdfs/subClassOf #{:fibo-der-drc-str/CapitalProtectedProduct
                      :fibo-der-drc-str/ParticipationCertificate},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "capital-protected product whose protection is defined as a percentage of the nominal price (e.g. 100 percent), with minimum redemption at expiry equivalent to the capital protection"},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Note that capital protection in this case refers to the nominal price only, and not to the purchase price. The value of the product may fall below its capital protection value during its lifetime; participation is in the underlying price increase above the conversion price; coupon payment is possible."}})

(def DiscountCertificate
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fifth edition, 2021-06-15, clause 6.4.8"},
   :cmns-av/explanatoryNote
   #{{:rdf/language "en",
      :rdf/value
      "Discount certificates are ideal for conservative investors that want to guard against market fluctuations and who expect in the medium term sideways-moving prices. Because the buyer of a discount certificate does not profit from price gains that are higher than the cap, this form of investment is best suited for a medium-term oriented engagement. If the certificate reaches its cap before the maturity, the investor should take the profits."}
     {:rdf/language "en",
      :rdf/value
      "At the end of the certificate's maturity, a cash disbursement occurs. If the price of the underlying when the maturity is up is higher than the maximal payout or identical to it, the issuer pays the maximum amount. If the price of the underlying is less than the cap, the issuer pays either the current price of the certificate in cash or he gives the investor the underlying, for example a share, at its current price. The issuer can choose. The cash payout is obligatory in the case of discount certificates on indices, currencies or interest."}
     {:rdf/language "en",
      :rdf/value
      "The maximum profit that an investor can reach with a discount certificate is calculated by taking the difference between the purchase price and the cap on the underlying. Losses, in contrast, are lessened by the discount. The investor suffers a loss only when the price of the underlying at the end of the maturity has fallen so far that the discount is depleted. The discount thus works as a buffer against risk."}},
   :db/ident :fibo-der-drc-str/DiscountCertificate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/StructuredInstruments/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "discount certificate"},
   :rdfs/subClassOf
   #{:fibo-sec-dbt-pbs/StructuredFinanceWithoutPrincipalProtection
     :fibo-der-drc-str/ParticipationCertificate},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "participation certificate that enables the investor to acquire the underlying asset at a lower price in return for a limited payout, and for which the underlying asset(s) and/or a cash amount is redeemed should the underlying asset close below the strike on expiry, for which, in return, the potential profit is capped"},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Discount certificates correspond to a buy-write-strategy; they have reduced risk compared to a direct investment in the underlying asset; with higher risk levels multiple underlying assets (worst-of) allow for higher discounts; limited profit opportunity (Cap)."}})

(def ExpressCertificate
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fifth edition, 2021-06-15, clause 6.4.8"},
   :db/ident :fibo-der-drc-str/ExpressCertificate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/StructuredInstruments/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "express certificate"},
   :rdfs/subClassOf
   #{:fibo-sec-dbt-pbs/StructuredFinanceWithoutPrincipalProtection
     :fibo-der-drc-str/ParticipationCertificate},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "participation certificate whose payout is conditional: should the underlying trade above the strike on the observation date, an early redemption consisting of nominal price plus an additional coupon amount is paid"},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Express certificates offer the possibility of an early redemption combined with an attractive yield opportunity. They have reduced risk compared to a direct investment into the underlying asset(s). With higher risk levels, multiple underlying assets (worst-of) allow for higher coupons or lower barriers; limited profit opportunity (Cap)."}})

(def IndexCertificate
  {:cmns-av/explanatoryNote
   #{{:rdf/language "en",
      :rdf/value
      "Investors should think about currency risks when investing in index certificates that track a share index outside of the euro zone. And they should pay attention to whether the underlying index is a performance or price index. With a performance index, all dividends and profits from subscription rights flow into the index value. In contrast to that, price indices show the pure development of the shares and thus the price declines that usually accompany dividend payouts. Index certificates are particularly interesting to investors that want to profit from positive capital-market developments, but who don’t want to deal with the daily price developments of several individual shares."}
     {:rdf/language "en",
      :rdf/value
      "If the underlying share increases in value, the value of the certificate increases in analog to the gain; with every setback, the certificate value declines accordingly."}
     {:rdf/language "en",
      :rdf/value
      "With Index certificates investors can participate one-to-one in the development of an exchange index – without actually buying the underlying shares in that comprise that index. Every index certificate has a subscription rate (e.g., 1:10 or 1:100) that defines the value of the certificate in relation to the index listing. The investor invests broadly diversified and transparently with minimal effort and smaller amounts."}},
   :db/ident :fibo-der-drc-str/IndexCertificate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/StructuredInstruments/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "index certificate"},
   :rdfs/subClassOf :fibo-der-drc-str/ParticipationCertificate,
   :skos/definition {:rdf/language "en",
                     :rdf/value
                     "certificate whose underlying asset is an index"}})

(def LeveragedProduct
  {:db/ident :fibo-der-drc-str/LeveragedProduct,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/StructuredInstruments/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "leveraged product"},
   :rdfs/subClassOf :fibo-der-drc-str/StructuredProduct,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "structured product that provides a further enhanced yield (over and above that of a yield-enhancement product), often without any limit to the upside participation, and frequently with a stop-loss in order to limit potential capital losses"},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "Leveraged certificates are examples of leveraged products; they provide enhanced participation to an underlying with inbuilt leverage. Leveraged exposure is also provided on the downside performance of the underlying. Another example is a call warrant, which is simply a call option that is traded in a securitized format. This format is interesting in order to be able to trade a call option on underlyings for which no exchange traded option market exists."}})

(def OutperformanceBonusCertificate
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fifth edition, 2021-06-15, clause 6.2.8"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "The outperformance bonus certificate combines the strengths of both outperformance and normal bonus certificates. This means that you’re protected on the downside by a bonus level (i.e., a feature of bonus certificates) but nevertheless have the opportunity to participate disproportionately in upside gains in the underlying instrument (the 'outperformance certificate' dimension). If you compare all three structured product types with each other, you’ll see that outperformance bonus certificates come up a bit short in terms of the characteristics of the other two forms. In other words, the disproportionate participation rate (outperformance) is usually somewhat lower than with a 'plain vanilla' outperformance certificate. This is because additional bonus protection has to be bought in order to structure the product properly. The same applies to the bonus dimension: because such a certificate still affords disproportionate participation, its downside protection level is more modest."},
   :db/ident :fibo-der-drc-str/OutperformanceBonusCertificate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/StructuredInstruments/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "outperformance bonus certificate"},
   :rdfs/subClassOf #{:fibo-der-drc-str/BonusCertificate
                      :fibo-der-drc-str/OutperformanceCertificate},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "certificate that allows disproportionate participation (outperformance) in positive performance above the strike, in which the minimum redemption is equal to the nominal value provided the barrier has not been breached, with greater risk multiple underlying asset(s) (worst-of) allow for a higher bonus level or lower barrier, and reduced risk compared to a direct investment into the underlying asset(s)"},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "If the barrier is breached the product changes into an outperformance certificate."}})

(def OutperformanceCertificate
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fifth edition, 2021-06-15, clause 6.2.8"},
   :db/ident :fibo-der-drc-str/OutperformanceCertificate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/StructuredInstruments/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "outperformance certificate"},
   :rdfs/subClassOf :fibo-der-drc-str/ParticipationCertificate,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "certificate that allows disproportionate participation (outperformance) in positive performance above the strike, reflecting underlying price moves 1:1 (adjusted by the conversion ratio and any related fees), and whose risk is comparable to direct investment in the underlying asset(s)"},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "For example: You buy an outperformance certificate based on a stock. The certificate’s strike price is 100 Euros and its participation factor is 150 percent. If the price of the underlying stock surpasses the strike price of 100 Euros, you are rewarded with a 150 percent return, instead of just 100 percent. If the price of the stock climbs to 110 Euros, for example, the value of the certificate would be 115 Euros."}})

(def ParticipationCertificate
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "In many cases, certificates do not give the investor the right to receive dividend distributions from the underlying stocks or other assets. For example: You buy a bonus certificate issued by your bank which is based on a stock that pays annual dividends. During the certificate's term, the bank holds the underlying stock and receives the dividends. At the end of the term, the bank pays the predefined bonus, even though the actual price of the stock is lower (but not below the protection threshold).Depending on the type of certificate, the exact terms and conditions, and the contract's expiry date, it is possible that the investor may receive the underlying asset instead of money at the end of the investment term. That is often the case with discount certificates based on stocks, for example, when their price sits below the predetermined cap. If the certificate's issuer becomes insolvent, the assets which underly the certificate are considered part of the issuer's liquid assets. This is in contrast to owning actual securities or shares in investment funds, as these are segregated assets which remain the property of the investor if the broker or custodian bank fails."},
   :cmns-av/synonym #{{:rdf/language "en",
                       :rdf/value    "certificate"}
                      {:rdf/language "en",
                       :rdf/value    "bearer debt note"}},
   :db/ident :fibo-der-drc-str/ParticipationCertificate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/StructuredInstruments/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "participation certificate"},
   :rdfs/subClassOf #{:fibo-der-drc-str/ParticipationInstrument
                      :fibo-sec-dbt-pbs/StructuredFinanceInstrument},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "participation product that provides the possibility to participate in the gains or losses in the price of an asset, subject to counterparty risk"}})

(def ParticipationInstrument
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fifth edition, 2021-06-15"},
   :cmns-av/explanatoryNote
   #{{:rdf/language "en",
      :rdf/value
      "These assets could be anything, from equities, funds, bonds, ETFs indices to a mix of those. The most common participation products are tracker certificates, providing 1-to-1 participation to the performance of a basket of securities."}
     {:rdf/language "en",
      :rdf/value
      "The construction is generally based on a low exercise price option (LEPO) (base value less discounted future dividends) which in some cases might be comparable to a direct investment in the underlying asset(s) or a LEPO combined with other options, which together provide the desired disbursement profile."}},
   :cmns-av/synonym {:rdf/language "en",
                     :rdf/value    "participation product"},
   :db/ident :fibo-der-drc-str/ParticipationInstrument,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/StructuredInstruments/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "participation instrument"},
   :rdfs/subClassOf #{:fibo-der-sbd-sbd/SecurityBasedDerivative
                      :fibo-der-drc-str/StructuredProduct},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "structured product that provides the possibility to participate in the performance of an asset or basket of assets"}})

(def ReverseConvertibleCertificate
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fifth edition, 2021-06-15, clause 6.4.8"},
   :db/ident :fibo-der-drc-str/ReverseConvertibleCertificate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/StructuredInstruments/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "reverse convertible certificate"},
   :rdfs/subClassOf
   #{:fibo-sec-dbt-pbs/StructuredFinanceWithoutPrincipalProtection
     :fibo-der-drc-str/ParticipationCertificate},
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "participation certificate whose payout is conditional: should the underlying asset close below the strike on expiry, the underlying asset(s) and/ or a cash amount is redeemed; should the underlying asset close above the strike at expiry, the nominal amount plus the coupon is paid at redemption"},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Note that in the case of a reverse convertible certificate, the coupon is paid regardless of the underlying development. It has reduced risk compared to a direct investment into the underlying asset. With higher risk levels, multiple underlying assets (worst-of) allow for higher coupons; limited profit potential (Cap)."}})

(def StructuredProduct
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fifth edition, 2021-06-15"},
   :cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "A structured product is a pre-packaged structured finance investment strategy based on a single security, a basket of securities, options, indices, commodities, debt issuance or foreign currencies, and to a lesser extent, derivatives. Structured products are not homogeneous - there are numerous varieties of derivatives and underlying assets - but they can be classified under the aside categories. Typically, a desk will employ a specialized 'structurer' to design and manage its structured-product offering."},
   :cmns-av/synonym #{{:rdf/language "en",
                       :rdf/value    "structured instrument"}
                      {:rdf/language "en",
                       :rdf/value    "market-linked investment"}},
   :db/ident :fibo-der-drc-str/StructuredProduct,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/StructuredInstruments/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "structured product"},
   :rdfs/subClassOf :fibo-fbc-fi-fi/DerivativeInstrument,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "security whose cash flow characteristics depend upon one or more indices or that have embedded forwards or options or securities where an investor's investment return and the issuer's payment obligations are contingent on, or highly sensitive to, changes in the value of underlying assets, indices, interest rates or cash flows"}})

(def TrackerCertificate
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fifth edition, 2021-06-15, clause 6.2.8"},
   :cmns-av/explanatoryNote
   #{{:rdf/language "en",
      :rdf/value
      "Tracker certificates can also be used to profit off negative price developments. This is the case with so-called bear tracker certificates which take a short position on the underlying asset. Note that tracker certificates do not normally pay out dividends. If one holds a certificate which tracks the stock of a company which pay dividends, they will not receive them. However, they may receive some form of compensation from the certificate’s issuer in some cases."}
     {:rdf/language "en",
      :rdf/value
      "Unlike investment funds – which are divided into shares and owned by investors – tracker certificates are simply debt claims against the issuer (the bank which offers them, for example). That means the underlying asset which you are investing in does not belong to you, but to the issuer. Shares of investment funds, on the other hand, are classified as segregated assets in some jurisdictions, such as Switzerland, and are owned by you as the shareholder rather than by the fund managers. In practice, investors are not likely to notice the difference. But whether you hold tracker certificates or fund shares makes a big difference when an investment company becomes insolvent. Tracker certificates are not protected against issuer bankruptcy, and fall into the pool of general debt claims against the bankrupt party. If the issuer of a tracker certificate goes bankrupt, you may very likely lose all or part of the money which you invested in the tracker certificate. This danger is known as counterparty risk. By investing in tracker certificates, you agree to carry the counterparty risk."}
     {:rdf/language "en",
      :rdf/value
      "Some tracker certificates have an expiry date. That means they only track an underlying asset for a predetermined length of time (one year, for example). The certificate matures at the end of that period, at which point you as the investor are paid out its going value at the time of expiry."}},
   :db/ident :fibo-der-drc-str/TrackerCertificate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/StructuredInstruments/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "tracker certificate"},
   :rdfs/subClassOf :fibo-der-drc-str/ParticipationCertificate,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "certificate that reflects underlying price moves 1:1 (adjusted by conversion ratio and any related fees), in which the associated risk is comparable to direct investment in the underlying asset(s)"},
   :skos/example
   #{{:rdf/language "en",
      :rdf/value
      "Trackers can be used to invest in the performance of multiple stocks, for example. A tracker certificate is a structured instrument that allows the investor to invest in an underlying asset without actually owning the asset. From an investor perspective, tracker certificates work much like investment funds. The tracker follows the price of an underlying asset (one or more stocks, for example). The investor buys a certificate based on the tracker. If the value of the underlying asset goes up, the value of the certificate goes up with it. If the underlying asset loses value, the certificate loses value."}
     {:rdf/language "en",
      :rdf/value
      "Tracker certificates can be purchased on stock exchanges which they are listed on. Many of these certificates track underlying assets at a ratio of 1:100. That means that an investor can invest just a fraction of the amount which would be required to buy the actual underlying asset. For example: You invest in a tracker certificate which is based on a stock basket with a value of 10,000 Euros. Because the tracker certificate uses a ratio of 1:100, you only need to pay 100 Euros for the certificate. If the price of the underlying stocks goes up by 10 percent (to 11,000 Euros), the value of the certificate will also go up by 10 percent (to 110 Euros)."}}})

(def TurboCertificate
  {:cmns-av/explanatoryNote
   #{{:rdf/language "en",
      :rdf/value
      "As risk management each turbo trade has a built-in knock-out level and will terminate if this is hit."}
     {:rdf/language "en",
      :rdf/value
      "Turbos are traded on venue rather than over the counter (OTC), and have fully visible order books that you can view to gauge sentiment and plan your strategy. Turbo trading works by buying a transferrable security whose value is based on an underlying asset's. So, you effectively take a position on that asset's price either rising or falling. For each trade, you choose a knock-out level – the point where you'd like to exit if the market turns against you. This then helps to determine the purchase price for the turbo, which will be your maximum possible loss. You'll pay this outlay in full upfront."}
     {:rdf/language "en",
      :rdf/value
      "There are two types of turbos: long turbos, sometimes known as bull turbos, and short turbos, also known as bear turbos. You'd buy a long turbo if you thought the price of the underlying asset was set to rise. With a long turbo, the knock-out level will be below the underlying asset's current market price to protect you against downward movements. Alternatively, you'd buy a short turbo if you thought the price of the underlying asset might fall. A short turbo will have a knock-out level which is above the underlying asset's current market price to protect you against upward movements."}},
   :cmns-av/synonym #{{:rdf/language "en",
                       :rdf/value    "turbo warrant"}
                      {:rdf/language "en",
                       :rdf/value    "turbo"}},
   :db/ident :fibo-der-drc-str/TurboCertificate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/StructuredInstruments/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "turbo certificate"},
   :rdfs/subClassOf :fibo-der-drc-str/ParticipationCertificate,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "certificate that acts as a leveraged security, whose price tracks an underlying financial asset's price one for one, and that can be used to go long or short"}})

(def TwinWinCertificate
  {:cmns-av/adaptedFrom
   {:rdf/language "en",
    :rdf/value
    "ISO 10962, Securities and related financial instruments - Classification of financial instruments (CFI) code, Fifth edition, 2021-06-15, clause 6.2.8"},
   :cmns-av/explanatoryNote
   #{{:rdf/language "en",
      :rdf/value
      "Twin-win certificates are suited to investors who are convinced that the underlying instrument has a good chance of going up. If it in fact does, the built-in leverage of the product enables you to participate not just 1:1 in that upside move (as would be the case with a normal tracker certificate), but instead at a disproportionate rate and with no price limitation."}
     {:rdf/language "en",
      :rdf/value
      "With a twin-win certificate, you can actually have it both ways. In other words, this type of structured product generates a profit for you not only when the price of the underlying instrument goes up, but also if it declines to a certain extent. And this with a specially built-in safety mechanism. The unique structure of these products makes it possible to turn a modest loss in the underlying instrument into a modest gain."}},
   :db/ident :fibo-der-drc-str/TwinWinCertificate,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/StructuredInstruments/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "twin-win certificate"},
   :rdfs/subClassOf :fibo-der-drc-str/ParticipationCertificate,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "certificate that makes profits possible with rising and falling underlying asset values, in which a falling underlying asset price converts into profit up to the barrier, and whose minimum redemption is equal to the nominal value provided the barrier has not been breached"},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "If the barrier is breached the product changes into a tracker certificate. With higher risk levels, multiple underlying asset(s) (worst-of) allow for a higher bonus level or lower barrier. Twin-win certificates have reduced risk compared to a direct investment into the underlying asset(s)."}})

(def YieldEnhancementProduct
  {:db/ident :fibo-der-drc-str/YieldEnhancementProduct,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/StructuredInstruments/"},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "yield-enhancement product"},
   :rdfs/subClassOf :fibo-der-drc-str/StructuredProduct,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "structured product that provides a predefined yield in return for a downside risk"},
   :skos/example
   {:rdf/language "en",
    :rdf/value
    "Well-known yield-enhancement products include reverse convertibles. They provide a predetermined yield per annum in return for the willingness of the investor to absorb downside risk of for example a stock, index, currency-pair or fund. Reverse convertibles come in a broad range of variations (with or without barrier, multiple underlyings and/or callability)."}})

(def urn:uuid:2de8dfc3-72af-5fd6-b4bf-69b8907bd62a
  {:cmns-av/copyright #{"Copyright (c) 2023 Object Management Group, Inc."
                        "Copyright (c) 2023 EDM Council, Inc."},
   :dcterms/abstract
   "This ontology defines concepts common to pre-packaged structured finance investment strategies based on a host of underlying instruments, pools, or other assets.",
   :dcterms/license {:xsd/anyURI "http://opensource.org/licenses/MIT"},
   :fibo-fnd-utl-av/hasMaturityLevel :fibo-fnd-utl-av/Release,
   :owl/imports
   #{{:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/DER/DerivativesContracts/DerivativesBasics/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FND/Utilities/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/DER/SecurityBasedDerivatives/SecurityBasedDerivatives/"}
     {:xsd/anyURI "https://www.omg.org/spec/Commons/AnnotationVocabulary/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/FBC/FinancialInstruments/FinancialInstruments/"}
     {:xsd/anyURI
      "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/SEC/Debt/PoolBackedSecurities/"}},
   :owl/versionIRI
   {:xsd/anyURI
    "https://spec.edmcouncil.org/fibo/ontology/master/2024Q2/DER/DerivativesContracts/StructuredInstruments/"},
   :rdf/type :owl/Ontology,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Structured Instruments Ontology"},
   :xsd/anyURI
   "https://spec.edmcouncil.org/fibo/ontology/DER/DerivativesContracts/StructuredInstruments/"})