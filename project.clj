(defproject migratus-lein "0.1.0-SNAPSHOT"
  :description "MIGRATE ALL THE THINGS!"
  :eval-in-leiningen true
  :aliases {"test!" ["do" "clean," "deps," "test"]}
  :dependencies [[org.clojure/clojure "1.2.1"]
                 [migratus "0.6.0-SNAPSHOT"]]
  :profiles {:dev {:dependencies [[jar-migrations "1.0.0"]
                                  [log4j "1.2.16"]
                                  [migratus "0.6.0-SNAPSHOT"]]}})
