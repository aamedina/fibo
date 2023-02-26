(ns dev
  "Tools for interactive development with the REPL. This file should
  not be included in a production build of the application.
  Call `(reset)` to reload modified code and (re)start the system.
  The system under development is `system`, referred from
  `com.stuartsierra.component.repl/system`.
  See also https://github.com/stuartsierra/component.repl"
  (:require
   [arachne.aristotle.registry :as reg]
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
   [net.wikipunk.fibo :as fibo]
   [net.wikipunk.fibo.boot :as boot]
   [net.wikipunk.rdf :as rdf :refer [doc]]
   [net.wikipunk.mop :as mop :refer [isa? descendants ancestors parents]]
   [net.wikipunk.temple :as temple]
   [zprint.core :as zprint])
  (:refer-clojure :exclude [isa? descendants ancestors parents]))

(set-init
  (fn [_]
    (if-let [r (io/resource "system.edn")]
      (-> (slurp r)
          (edn/read-string)
          (sc/assemble-system))
      (throw (ex-info "system.edn is not on classpath" {})))))
