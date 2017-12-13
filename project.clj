(defproject flower "0.3.1"
  :description "Flower is a library for integration with task trackers, repositories, messaging systems and more"
  :url "http://github.com/PositiveTechnologies/flower"
  :license {:name "MIT License"
            :url "https://opensource.org/licenses/MIT"}
  :plugins [[lein-sub "0.3.0"]]
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [flower/flower-tracker "0.3.1"]
                 [flower/flower-repository "0.3.1"]
                 [flower/flower-messaging "0.3.1"]
                 [flower/flower-team "0.3.1"]]
  :aliases {"test" ["sub" "lint-and-test-all"]}
  :sub ["flower-proto"
        "flower-common"
        "flower-integration-github"
        "flower-integration-gitlab"
        "flower-integration-jira"
        "flower-integration-tfs"
        "flower-integration-exchange"
        "flower-tracker"
        "flower-repository"
        "flower-messaging"
        "flower-team"
        "lein-template"]
  :profiles {:1.7 {:dependencies [[org.clojure/clojure "1.7.0"]]}
             :1.8 {:dependencies [[org.clojure/clojure "1.8.0"]]}})
