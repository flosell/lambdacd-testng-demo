# testng-pipeline

**DEPRECATED**: [lambdacd-testng](https://github.com/otto-de/lambdacd-testng) seems to no longer be maintained.

Small demo on how to use [lambdacd-testng](https://github.com/otto-de/lambdacd-testng)

## Usage

* `lein run` will start your pipeline with a web-ui listening on port 8080

## Files

* `/`
    * `project.clj` contains dependencies and build configuration for Leiningen

* `/src/testng_pipeline/`
    * `pipeline.clj` contains your pipeline-definition
    * `steps.clj` contains your custom build-steps
    * `core.clj` contains the `main` function that wires everything together

* `/resources/`
    * `logback.xml` contains a sample log configuration
