(ns testng-pipeline.pipeline
  (:use [lambdacd.steps.control-flow]
        [testng-pipeline.steps])
  (:require
        [lambdacd.steps.manualtrigger :as manualtrigger]))

(def pipeline-def
  `(
    manualtrigger/wait-for-manual-trigger

    (with-workspace
      clone
      test)))
