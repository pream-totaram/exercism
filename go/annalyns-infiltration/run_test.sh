#!/bin/zsh

docker run --rm -w /go/src/app/annalyns-infiltration -v $(PWD):/go/src/app/annalyns-infiltration exercism_go go test -v --bench . --benchmem
