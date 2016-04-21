(defproject cljolokia "0.1.0-SNAPSHOT"
  :description "Clojure for the Jolokia"
  :url "https://github.com/xcoo/cljolokia"
  :license {:name "Apache License, Version 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0.html"}
  :dependencies [[org.jolokia/jolokia-jvm "1.3.3"]
                 [org.jolokia/jolokia-jvm "1.3.3" :classifier "agent"]]
  :profiles {:dev {:plugins [[org.clojure/clojure "1.8.0"]]}})
