(ns user
  {:clojure.tools.namespace.repl/load false}
  (:require
   [clojure.edn]
   [clojure.repl]
   [clojure.tools.namespace.repl]
   [ont-app.vocabulary.lstr]
   [clojure.tools.reader]
   [com.stuartsierra.component.user-helpers :refer [dev go reset]]))

;; tools.namespace reads Clojure code using tools.reader which binds
;; *data-readers* separately from the standard Clojure reader
(alter-var-root #'clojure.tools.reader/*data-readers* (constantly *data-readers*))

(clojure.tools.namespace.repl/set-refresh-dirs "dev" "src")

(Thread/setDefaultUncaughtExceptionHandler
  (reify Thread$UncaughtExceptionHandler
    (uncaughtException [_ thread ex]
      (binding [*out* *err*]
        (let [msg (str "Uncaught exception on " (.getName thread))]
          (println msg)
          (clojure.repl/pst ex))))))
