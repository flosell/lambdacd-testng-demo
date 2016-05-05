(ns testng-pipeline.steps
  (:require [lambdacd.steps.shell :as shell]
            [lambdacd-git.core :as lambdacd-git]
            [lambdacd-testng.core :as lambdacd-testng]
            [lambdacd.steps.support :as support]
            [clojure.java.io :as io]))

(defn clone [args ctx]
  (lambdacd-git/clone ctx "git@github.com:jabbrwcky/testng-annotation-demo.git" "refs/heads/master" (:cwd args)))

(defn parse-testng-report [cwd relative-path]
  {:status  :success
   :details [(lambdacd-testng/get-testng-report-as-details (io/file cwd relative-path))]})

(defn test [args ctx]
  (support/always-chaining args ctx
    (shell/bash ctx (:cwd args) "mvn test")
    (parse-testng-report (:cwd args) "target/surefire-reports/testng-results.xml")))
