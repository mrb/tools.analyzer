(defproject org.clojure/tools.analyzer "0.6.7-SNAPSHOT"
  :description "An analyzer for Clojure code, written in Clojure and producing AST in EDN."
  :url "https://github.com/clojure/tools.analyzer"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :source-paths ["src/main/clojure"]
  :test-paths ["src/test/clojure"]
  :dependencies [[org.clojure/clojure "1.7.0-master-SNAPSHOT"]
                 [com.datomic/datomic-free "0.9.5153" :scope "provided" :exclusions [joda-time]]])
