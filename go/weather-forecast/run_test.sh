#!/bin/zsh

docker run --rm -w /go/src/app/weather-forecast -v $(PWD):/go/src/app/weather-forecast exercism_go go test -v --bench . --benchmem
