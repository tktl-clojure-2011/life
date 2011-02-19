(defproject life "0.0.1-SNAPSHOT"
  :description "Game of Life"
  :dependencies [[org.clojure/clojure "1.3.0-alpha4"]
                 [com.stuartsierra/lazytest "2.0.0-SNAPSHOT"]]
  :repositories {"stuartsierra-releases" "http://stuartsierra.com/maven2"
                 "stuartsierra-snapshots" "http://stuartsierra.com/m2snapshots"}
  :main life.core)
