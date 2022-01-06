#!/bin/zsh

docker run --rm -w /go/src/app/cars-assemble -v $(PWD):/go/src/app/cars-assemble exercism_go go test -v --bench . --benchmem
