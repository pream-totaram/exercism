#!/bin/zsh

docker run --rm -w /go/src/app/welcome_to_tech_palace -v $(PWD):/go/src/app/welcome_to_tech_palace exercism_go go test -v --bench . --benchmem
