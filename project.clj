(defproject checkin "0.1.0-SNAPSHOT"
            :description "FIXME: write description"
            :url "http://example.com/FIXME"
            :license {:name "Eclipse Public License"
                      :url  "http://www.eclipse.org/legal/epl-v10.html"}
            :dependencies [
                           [org.clojure/clojure "1.6.0"]
                           [ring "1.3.2"]
                           [compojure "1.3.1"]
                           [ring/ring-defaults "0.1.2"]
                           [clj-oauth2 "0.2.0"]
                           [cheshire "5.4.0"]
                           ]

            :profiles {:proxied
                       {:jvm-opts ["-Dhttp.proxyHost=127.0.0.1" "-Dhttp.proxyPort=8888" "-Dhttps.proxyHost=127.0.0.1" "-Dhttps.proxyPort=8888"]}}
            :plugins [[lein-ring "0.9.1"]]
            :ring {:handler checkin.handler/app
                   :uberwar-name "loneworkercheckin.war"}
            :aliases {"run-proxied" ["with-profile" "proxied" "ring" "server"]})
