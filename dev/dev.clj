(ns dev
  "Tools for interactive development with the REPL. This file should
  not be included in a production build of the application.
  Call `(reset)` to reload modified code and (re)start the system.
  The system under development is `system`, referred from
  `com.stuartsierra.component.repl/system`.
  See also https://github.com/stuartsierra/component.repl"
  (:require
   [arachne.aristotle.registry :as reg]
   [clj-http.client :as http]
   [clojure.datafy :refer [datafy]]
   [clojure.edn :as edn]
   [clojure.java.io :as io]
   [clojure.java.javadoc :refer [javadoc]]
   [clojure.java.shell :as sh :refer [sh]]
   [clojure.pprint :refer [pprint pp]]
   [clojure.reflect :refer [reflect]]
   [clojure.repl :refer [apropos dir find-doc pst source]]
   [clojure.set :as set]
   [clojure.string :as str]
   [clojure.tools.namespace.repl :refer [refresh refresh-all clear]]
   [clojure.walk :as walk]
   [com.stuartsierra.component :as com]
   [com.stuartsierra.component.repl :refer [reset set-init start stop system]]
   [com.walmartlabs.schematic :as sc]
   [net.wikipunk.boot]
   [net.wikipunk.ext]
   [net.wikipunk.fibo :as fibo]
   [net.wikipunk.fibo.boot :as boot]
   [net.wikipunk.rdf :as rdf :refer [doc]]
   [net.wikipunk.mop :as mop :refer [isa? descendants ancestors parents]]
   [zprint.core :as zprint]
   [datomic.client.api :as d]
   [net.wikipunk.punk.db :as db]
   [xtdb.api :as xt])
  (:refer-clojure :exclude [isa? descendants ancestors parents]))

(set-init
  (fn [_]
    (if-let [r (io/resource "system.edn")]
      (-> (slurp r)
          (edn/read-string)
          (sc/assemble-system))
      (throw (ex-info "system.edn is not on classpath" {})))))

(prefer-method db/infer-datomic-type :dc11/description :owl/AnnotationProperty)
(prefer-method db/infer-datomic-type :dcterms/source :owl/AnnotationProperty)
(defmethod db/infer-datomic-type :dcterms/source [_] :db.type/string)
(defmethod db/infer-datomic-type :dc11/rights [_] :db.type/string)
(defmethod db/infer-datomic-type :dc11/contributor [_] :db.type/string)
(prefer-method db/infer-datomic-type :dc11/contributor :owl/AnnotationProperty)
(prefer-method db/infer-datomic-type :dc11/contributor :dc11/creator)
(prefer-method db/infer-datomic-type :dc11/rights :owl/AnnotationProperty)
(prefer-method db/infer-datomic-type :dc11/date :owl/AnnotationProperty)
(prefer-method db/infer-datomic-type :dc11/title :owl/AnnotationProperty)
(prefer-method db/infer-datomic-type :dc11/creator :owl/AnnotationProperty)
(defmethod db/infer-datomic-type :cmns-txt/hasTextValue [_] :db.type/string)
(defmethod db/infer-datomic-type :lcc-lr/hasName [_] :db.type/string)
(defmethod db/infer-datomic-type :fibo-sec-sec-lst/hasListingDate [_] :db.type/string)
(defmethod db/infer-datomic-type :fibo-fnd-plc-adr/requiresSecondaryUnitRange [_] :db.type/boolean)
(defmethod db/infer-datomic-type :cmns-dt/hasObservedDateTime [_] :db.type/instant)
(defmethod db/infer-datomic-type :fibo-fnd-plc-loc/hasCityName [_] :db.type/string)
(defmethod db/infer-datomic-type :fibo-fnd-utl-alx/isCalculatedViaMethodology [_] :db.type/string)
(defmethod db/infer-datomic-type :fibo-fbc-fct-ra/hasRegistrationDate [_] :db.type/string)
(defmethod db/infer-datomic-type :fibo-fbc-fct-breg/hasRenewalDate [_] :db.type/instant)
(defmethod db/infer-datomic-type :fibo-fbc-fct-breg/hasRegistrationRevisionDate [_] :db.type/instant)
(defmethod db/infer-datomic-type :fibo-fbc-fct-breg/hasInitialRegistrationDate [_] :db.type/instant)
(defmethod db/infer-datomic-type :rdfs/label [_] :db.type/string)
(prefer-method db/infer-datomic-type :rdfs/label :owl/AnnotationProperty)
(prefer-method db/infer-datomic-type :dc11/title :rdfs/label)

(comment
  (def boot-db (db/test-bootstrap (:db system))))
